package com.rest2.rest2.internationalisation;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class Q1 {
    private MessageSource messageSource;

    public Q1(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping("/message")
    public String getMsg(){ //
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Msg",locale);

    }
}
