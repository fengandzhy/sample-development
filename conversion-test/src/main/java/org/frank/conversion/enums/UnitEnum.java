package org.frank.conversion.enums;

public enum UnitEnum {
    HUNDRED("HUNDRED"),
    HUNDREDS("HUNDREDS"),
    THOUSAND("THOUSAND"),
    THOUSANDS("THOUSANDS"),
    MILLION("MILLION"),
    MILLIONS("MILLIONS"),
    BILLION("BILLION"),
    BILLIONS("BILLIONS"),
    DOLLARS ("DOLLARS"),
    DOLLAR ("DOLLAR"),
    CENT ("CENT"),
    SPACE(" "),
    MINUS("-"),
    AND("AND"),
    CENTS("CENTS");
    private final String word;
    UnitEnum(String word){        
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
