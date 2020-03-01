package com.edusol.springdemo.service;

import com.edusol.springdemo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class TestService {
    private ArrayList arrayList;
    public ArrayList getHelloWorld(){
        arrayList=new ArrayList();
        arrayList.add(new Customer(1, "Rohini" ,"Pune"));
        arrayList.add(new Customer(2, "Anu" ,"Pune"));
        arrayList.add(new Customer(3, "Hey" ,"Pune"));
        arrayList.add(new Customer(4, "Hello" ,"Pune"));
        log.info("inside service");
        return arrayList ;
    }
}
