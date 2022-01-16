package com.example.doitjavastarter;

public class Customer {
    protected int customerID; //고객아이디
    protected String customerName; //고객이름
    protected String customerGrade; //고객등급
    int bonusPoint; //보너스포인트
    double bonusRatio; //적립비율

   public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER"; //기본등급
        bonusRatio = 0.01;
        System.out.println("Customer(int,String) 생성자 호출");
    }

    public int calcPrice(int price){
        bonusRatio += price * bonusRatio; //보너스 포인트
        return price;
    }

    public String getCustomerInfo(){
        return customerName+" 님 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
    }

    //위에서 protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
    //protected 예약어로 선언한 변수는 외부 클레스에는 private변수처럼 get()메서드를 사용해 값을 가져오고, set()메서드를 사용해 값을 지정할 수 있다.
    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}


