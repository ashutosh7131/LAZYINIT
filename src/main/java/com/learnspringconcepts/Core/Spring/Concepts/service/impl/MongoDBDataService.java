package com.learnspringconcepts.Core.Spring.Concepts.service.impl;

import com.learnspringconcepts.Core.Spring.Concepts.service.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{11,22,33,44,55,66,77};
    }
}
