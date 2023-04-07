package com.beanwf.poto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// @Component
// @ConfigurationProperties(prefix = "person")
public class Person {

    private String[] friends;

    
    // @Value("${person.name}")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person [friends=" + Arrays.toString(friends) + ", name=" + name + "]";
    }
    public String[] getFriends() {
        return friends;
    }
    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    


}
