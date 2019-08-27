package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
    	
        if(driver.getAge()>= driver.getLegalAge()) return true;
        else return false;
    }
}
