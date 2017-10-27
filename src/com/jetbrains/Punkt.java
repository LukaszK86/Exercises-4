package com.jetbrains;

/**
 * Created by Kuki on 26.05.2017.
 */
public class Punkt {
    int z;
    int y;

    void zwiekszXY () {
        z++;
        y++;
    }

        void zmienXY() {
            this.z = z + 100;
            this.y = y + 3;
        }
    int getZ() {

       return z;
    }

    void showXY () {
        System.out.println("X to: " + z + "Y to: " +y);
    }
}

