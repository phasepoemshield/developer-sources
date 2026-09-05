/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 *  Nursultan.class12002
 *  Nursultan.class12013
 */
package Nursultan;

import Nursultan.class11286;
import Nursultan.class11381;
import Nursultan.class11784;
import Nursultan.class12002;
import Nursultan.class12013;

public class class11389
extends class11784 {
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;

    private boolean L(class12002 class120022, int n) {
        this.U();
        return n == 0 || class12013.y((class12002)class120022, (int)((Integer)this.L_1)) == n;
    }

    public boolean L(class12002 class120022) {
        return this.N(class120022.L());
    }

    public boolean L(int n) {
        return this.B() && this.i(n);
    }

    public boolean L() {
        return this.u().N(class11286.REPEAT);
    }

    public boolean M() {
        return this.u().N(class11286.RELEASE);
    }

    public class11389() {
        this.U();
    }

    static {
        class11389.E();
        y_0 = new class11389();
    }

    public boolean B() {
        return this.u().N(class11286.PRESS);
    }

    public class11381 Z() {
        this.U();
        return (class11381)((Object)this.L_4);
    }

    public int i() {
        this.U();
        return (Integer)this.L_2;
    }

    private boolean i(int n) {
        return this.z() == n;
    }

    private void U() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
            this.L_2 = 0;
        }
    }

    public int z() {
        this.U();
        return (Integer)this.L_0;
    }

    public class11286 u() {
        this.U();
        return (class11286)((Object)this.L_3);
    }

    public boolean y(class12002 class120022) {
        return this.L(class120022.L());
    }

    public boolean y(class12002 class120022, int n) {
        return this.y(class120022) && this.L(class120022, n);
    }

    public boolean y(int n) {
        return this.M() && this.i(n);
    }

    private static void E() {
        y_0 = null;
    }

    public boolean N(int n) {
        return this.L() && this.i(n);
    }

    public boolean N(class12002 class120022) {
        return this.y(class120022.L());
    }

    public boolean N(class12002 class120022, int n) {
        return this.N(class120022) && this.L(class120022, n);
    }

    public static class11389 N(int n, int n2, int n3, class11286 class112862, class11381 class113812) {
        ((class11389)((Object)class11389.y_0)).L_0 = n;
        ((class11389)((Object)class11389.y_0)).L_1 = n2;
        ((class11389)((Object)class11389.y_0)).L_2 = n3;
        ((class11389)((Object)class11389.y_0)).L_4 = class113812;
        ((class11389)((Object)class11389.y_0)).L_3 = class112862;
        return (class11389)((Object)y_0);
    }

    public static class11389 N(int n, class11286 class112862, class11381 class113812) {
        class11389 class113892 = new class11389();
        class113892.L_0 = n;
        class113892.L_2 = n;
        class113892.L_1 = 0;
        class113892.L_3 = class112862;
        class113892.L_4 = class113812;
        return class113892;
    }

    public int R() {
        this.U();
        return (Integer)this.L_1;
    }
}

