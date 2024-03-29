package org.frank.conversion.dtos;



import org.frank.conversion.annotations.Money;

import javax.validation.constraints.NotEmpty;


@SuppressWarnings("ALL")
public class UserDto {

    @NotEmpty(message = "username cannot be empty")    
    private String username;
    @Money
    private String money;

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
