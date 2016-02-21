package com.epam.springaop.concert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("criticismEngine")
public class CriticismEngineImpl implements CriticismEngine {

    private String[] criticismOptions = {"Fuck yeah!!!", "I don't like it"};
    
    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismOptions.length);
        return criticismOptions[i];
    }

}
