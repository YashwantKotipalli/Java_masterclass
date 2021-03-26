package com.yashwant;

public class Car {

    private int doors;
    private int wheels;
    private String color;
    private String model;
    private String engine;




    public void setModel(String model){
        String ValidModel = model.toLowerCase();
        if(ValidModel.equals("glc") || ValidModel.equals("wrangler")){
            this.model = model;
        }
        else{
            this.model = "UnKnown";
        }

    }

    public String getModel(){
        return this.model;
    }




}
