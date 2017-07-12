/*
 * Copyright 2017 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.velocity.test.filtersmanager;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.api.scripting.ClassFilter;

/**
 *
 * @author M.S.I
 */
public class ClassFilterTest2 implements ClassFilter {
    
    HashSet<Class> registeredClasses;

    public ClassFilterTest2() {
        registeredClasses = new HashSet<Class>();

        try {
            this.registerClass("org.apache.velocity.test.filtersmanager.SuperCar");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassFilterTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registerClass(String className) throws ClassNotFoundException {
        registeredClasses.add(Class.forName(className));
    }

    public boolean exposeToScripts(String className) {
        try {
            Class toCheck = Class.forName(className);

            for (Class filteredClass : registeredClasses) {
                if (filteredClass.isAssignableFrom(toCheck)) {
                    return false;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassFilterTest2.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

        return true;
    }

}
