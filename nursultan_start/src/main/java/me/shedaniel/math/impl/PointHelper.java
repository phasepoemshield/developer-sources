/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class06220
 */
package me.shedaniel.math.impl;

import me.shedaniel.math.FloatingPoint;
import me.shedaniel.math.Point;
import minecraft.class06202;
import minecraft.class06220;

public class PointHelper {
    public static Point ofMouse() {
        class06202 class062022 = class06202.Nq();
        double d = ((class06220)class062022.L_2).i() * (double)class062022.Nt().P() / (double)class062022.Nt().W();
        double d2 = ((class06220)class062022.L_2).R() * (double)class062022.Nt().s() / (double)class062022.Nt().m();
        return new Point(d, d2);
    }

    public static int getMouseY() {
        return PointHelper.ofMouse().y;
    }

    public static int getMouseX() {
        return PointHelper.ofMouse().x;
    }

    public static double getMouseFloatingX() {
        return PointHelper.ofFloatingMouse().x;
    }

    public static double getMouseFloatingY() {
        return PointHelper.ofFloatingMouse().y;
    }

    public static FloatingPoint ofFloatingMouse() {
        class06202 class062022 = class06202.Nq();
        double d = ((class06220)class062022.L_2).i() * (double)class062022.Nt().P() / (double)class062022.Nt().W();
        double d2 = ((class06220)class062022.L_2).R() * (double)class062022.Nt().s() / (double)class062022.Nt().m();
        return new FloatingPoint(d, d2);
    }
}

