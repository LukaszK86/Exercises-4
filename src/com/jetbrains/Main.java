package com.jetbrains;

public class Main {

    public static void main(String[] args) {

        Punkt punktXY = new Punkt();
        punktXY.zmienXY();

        System.out.println(punktXY.x);

        punktXY.zwiekszXY();

        System.out.println(punktXY.y);

        System.out.println(punktXY.getX());

        punktXY.showXY();





    }
}
