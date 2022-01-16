package com.example.doitjavastarter;



public class test {
    public static void main(String[] args) throws Exception {

        try{
            throw new Exception();

        }catch  (Exception e){

            e.printStackTrace();
            throw e;
        }finally  {

        }

    }
}
