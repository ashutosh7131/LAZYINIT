package com.learnspringconcepts.Core.Spring.Concepts.service.impl;

import com.learnspringconcepts.Core.Spring.Concepts.service.DataService;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5,6,7};
    }
}
