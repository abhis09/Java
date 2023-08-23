package com.assignment.task6;

public class Complex {

    double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    @Override
    public String toString() {
        return
                 real +" + "
                +imaginary  +"i";
    }

    public Complex sum(Complex obj){
         Complex temp=new Complex();
        temp.real=this.real+obj.real;
        temp.imaginary= this.imaginary+obj.imaginary;

       return temp;
    }

    public Complex product(Complex obj){

        Complex temp=new Complex();
        temp.real = this.real*obj.real;
        temp.imaginary=this.imaginary*obj.imaginary;
        return temp;
    }

    public Complex diff(Complex obj) {
        Complex temp=new Complex();
        temp.real = this.real-obj.real;
        temp.imaginary=this.imaginary-obj.imaginary;
        return temp;
    }

    public static void main(String[] args) {
        Complex obj1=new Complex(5,6);
        Complex obj2=new Complex(2,3);
        Complex obj3=obj1.sum(obj2);
        Complex obj4=obj1.product(obj2);
        Complex obj5 =obj1.diff(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);


    }
}
