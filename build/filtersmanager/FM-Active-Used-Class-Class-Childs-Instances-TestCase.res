<!DOCTYPE html>
<html>
    <body>
        <h1>Filters Manager Test Case.</h1>
        <label>Velocity works well while Filters Manager is added as a property.</label>
        <label>In this case velocity is not able to access the class.</label>
        <label>Class.class passed to this template through velocity context</label>
        <label>In this case velocity is not able to create new instances from childs of the filtered classes even through Class.class.</label>
        
        $Class.forName("org.apache.velocity.test.filtersmanager.SuperCar").newInstance()
    </body>
</html>