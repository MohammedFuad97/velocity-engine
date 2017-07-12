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

/**
 *
 * @author M.S.I
 */
public class Car {

    private String model;
    private String productionCompany;
    private int productionYear;
    private String color;
    
    public Car() {
        
    }
    
    public Car(String model, String productionCompany, int productionYear, String color) {
        this.model = model;
        this.productionCompany = productionCompany;
        this.productionYear = productionYear;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean setColor(String color) {
        this.color = color;

        return true;
    }
}
