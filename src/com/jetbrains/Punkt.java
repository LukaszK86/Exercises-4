package com.jetbrains;

/**
 * Created by Kuki on 26.05.2017.
 */
public class Punkt {
    int x;
    int y;

    void zwiekszXY () {
        x++;
        y++;
    }

        void zmienXY() {
            this.x = x + 3;
            this.y = y + 3;
        }
    int getX() {

       return x;
    }

    void showXY () {
        System.out.println("X to: " +x + "Y to: " +y);
    }
}

