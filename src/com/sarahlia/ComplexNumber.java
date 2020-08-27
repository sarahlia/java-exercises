package com.sarahlia;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.real);
        System.out.println("one.imaginary = " + one.imaginary);

        one.subtract(number);
        System.out.println("one.real = " + one.real);
        System.out.println("one.imaginary = " + one.imaginary);

        number.subtract(one);
        System.out.println("number.real = " + number.real);
        System.out.println("number.imaginary = " + number.imaginary);
    }
}
