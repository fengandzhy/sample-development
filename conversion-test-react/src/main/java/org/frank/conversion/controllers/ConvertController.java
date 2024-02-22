package org.frank.conversion.controllers;


import org.frank.conversion.annotations.ResponseResultBody;
import org.frank.conversion.dtos.UserDto;
import org.frank.conversion.services.NumberConvertToWordsService;
import org.frank.conversion.vos.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@ResponseResultBody
public class ConvertController {

    private NumberConvertToWordsService numberConvertToWordsService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ConvertController.class);

    /**
     * catch the username and money, it consumes application/json and returns application/json
     */
    @NotNull
    @RequestMapping(value = "/test/convert",produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public UserVo convert(@RequestBody @Validated @NotNull UserDto userDto) {
        String moneyWords = numberConvertToWordsService.convertNumberToWords(userDto.getMoney());
        UserVo vo = new UserVo();
        vo.setUsername(userDto.getUsername());
        vo.setMoneyWords(moneyWords);
        LOGGER.info("transfer result: username is {}, moneyWords is {}", userDto.getUsername(), moneyWords);
        return vo;
    }

    @Autowired
    public void setNumberConvertToWordsService(NumberConvertToWordsService numberConvertToWordsService) {
        this.numberConvertToWordsService = numberConvertToWordsService;
    }
}
