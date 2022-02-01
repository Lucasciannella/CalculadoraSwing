package com.mycompany.calculadorajava;

public class Calculadora implements CalculadoraInterface {

    private Double num1;
    private Double num2;
    private Double res;

    public Double getRes() {
        return res;
    }

    public void setRes(Double res) {
        this.res = res;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    @Override
    public void somar(Double num1, Double num2) {
        this.setRes(num1 + num2);

    }

    @Override
    public void dividir(Double num1, Double num2) {
        this.setRes(num1 / num2);
    }

    @Override
    public void diminuir(Double num1, Double num2) {
        this.setRes(num1 - num2);
    }

}
