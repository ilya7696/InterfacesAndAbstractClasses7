package by.tovpenets;

/*
    1. Написать иерархию классов «Фигуры».
    Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Создать массив из 5 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.


    2. Создать классы "Директор", "Рабочий", "Бухгалтер".
    Реализовать интерфейс с методом, который печатает название
    должности и имплементировать этот метод в созданные классы.
*/

import by.tovpenets.employee.impl.Accountant;
import by.tovpenets.employee.impl.Director;
import by.tovpenets.employee.impl.Worker;
import by.tovpenets.figure.Circle;
import by.tovpenets.figure.Figure;
import by.tovpenets.figure.Rectangle;
import by.tovpenets.figure.Triangle;

public class Main {

    public static void main(String[] args) {
        testFigure();
        testEmployee();
    }

    private static void testFigure() {
        Figure[] figures = {
                new Rectangle(20.34, 12.33), // 65.34
                new Rectangle(9.02, 12.05), // 42.14
                new Triangle(15, 15, 15), // 45
                new Triangle(18.02, 18.02, 18.02), // 54.06
                new Circle(82.11) // 515.9123455725158
        };
        System.out.println(getTotalPerimeter(figures));
    }

    private static double getTotalPerimeter(Figure[] figures) {
        double result = 0;
        for (Figure figure : figures) result += figure.getPerimeter();
        return result;
    }

    private static void testEmployee() {
        new Director().print();
        new Worker().print();
        new Accountant().print();
    }
}
