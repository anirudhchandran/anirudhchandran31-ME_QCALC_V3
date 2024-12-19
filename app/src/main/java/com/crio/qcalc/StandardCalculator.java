package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    
    public void add(int num1, int num2){
        int sum = num1 + num2;
        setResult(sum);
    
        
    }

    
    public int getResult(){
        return result;
    }

    private void setResult(int value){
        this.result = value;

    }



    public void subtract(int num1, int num2){
        int diff = num1 - num2;
        setResult(diff);

        
    }


    public void multiply(int num1, int num2){
        int prod = num1 * num2;
        setResult(prod);
    }


    public void divide(int num1, int num2){
        int quo = num1 / num2;
        setResult(quo);
    }

    
    public void clearResult() {

        result = 0;

    }

    
    public void printResult(){

        System.out.println("Standard Calculator Result:"+ getResult());

    }







}
