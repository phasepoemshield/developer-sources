/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11499;
import minecraft.class07438;

public class class11820 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;
    public static Object y_0;

    public boolean L() {
        return (Boolean)this.N_2;
    }

    public class11820() {
        this.i();
    }

    static {
        class11820.R();
        y_0 = new class11820();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = false;
        }
    }

    public class07438 y() {
        return (class07438)this.N_0;
    }

    public class11820 N(class11499 class114992) {
        this.N_1 = class114992;
        return this;
    }

    public static class11820 N(class07438 class074382, class11499 class114992, boolean bl) {
        ((class11820)class11820.y_0).N_0 = class074382;
        ((class11820)class11820.y_0).N_1 = class114992;
        ((class11820)class11820.y_0).N_2 = bl;
        return (class11820)y_0;
    }

    public class11499 N() {
        return (class11499)this.N_1;
    }

    public class11820 N(boolean bl) {
        this.N_2 = bl;
        return this;
    }

    public class11820 N(class07438 class074382) {
        this.N_0 = class074382;
        return this;
    }

    private static void R() {
    }
}

