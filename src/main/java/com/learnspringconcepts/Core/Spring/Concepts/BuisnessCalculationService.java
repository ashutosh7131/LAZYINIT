package com.learnspringconcepts.Core.Spring.Concepts;

import com.learnspringconcepts.Core.Spring.Concepts.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BuisnessCalculationService {

    private DataService dataService;

    @Autowired
    public BuisnessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {

        return Arrays.stream(dataService.retrieveData()).max().orElse(0);

}}
