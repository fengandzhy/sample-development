package org.frank.conversion.services;

import javax.validation.constraints.NotNull;

public interface NumberConvertToWordsService {
    
    @NotNull
    String convertNumberToWords(@NotNull String number);
}
