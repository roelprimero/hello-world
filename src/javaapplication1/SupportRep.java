/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author romal
 */


public class SupportRep implements Comparable <SupportRep> {
     String repName;
     int priority;
     int dailyCallToday;
     String shiftTier;
    
    public String toString() {
        return ("(" + repName + ", " + priority + ", " + dailyCallToday + ", " + shiftTier + ")");
    }
     
    @Override
    public int compareTo(SupportRep o) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain
        return toString().compareTo(o.toString());
    }

    public SupportRep(String repName, int priority, int dailyCallToday, String shiftTier) {
        this.repName = repName;
        this.priority = priority;
        this.dailyCallToday = dailyCallToday;
        this.shiftTier = shiftTier;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getDailyCallToday() {
        return dailyCallToday;
    }

    public void setDailyCallToday(int dailyCallToday) {
        this.dailyCallToday = dailyCallToday;
    }

    public String getShiftTier() {
        return shiftTier;
    }

    public void setShiftTier(String shiftTier) {
        this.shiftTier = shiftTier;
    }


    
    
    
}


   