package by.tovpenets.employee.impl;

import by.tovpenets.employee.Printable;

public class Accountant implements Printable {
    @Override
    public void print() {
        System.out.println("I'm accountant!");
    }
}
