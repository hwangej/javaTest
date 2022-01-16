package com.example.doitjavastarter;

import java.util.concurrent.LinkedTransferQueue;

public class VIPCustomer extends Customer{
    private  int agentID; //VIP고객상담원ID
    double saleRatio;




    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        //protected 예약어 사용으로 오류 미발생
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio  = 0.1;



    }

    public int getAgentID(){
        return  agentID;
    }

}
