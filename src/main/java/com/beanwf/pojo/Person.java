package com.beanwf.pojo;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String personId;

    private String personName;

    private int personAge;  
    

    
}
