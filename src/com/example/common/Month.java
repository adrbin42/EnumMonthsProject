package com.example.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrienne on 7/25/17.
 */
public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    private String englishName;

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
