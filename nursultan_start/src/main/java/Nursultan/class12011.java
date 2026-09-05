/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11996;
import Nursultan.class12012;
import Nursultan.class12014;
import Nursultan.class12030;
import Nursultan.class12036;

public class class12011 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;

    public class12011() {
        this.i();
    }

    public String toString() {
        return "RenderState.RenderStateBuilder(blend$value=" + String.valueOf((class12012)this.N_1) + ", depthMask$value=" + String.valueOf((class12014)this.N_3) + ", depthTest$value=" + String.valueOf((class12030)this.N_5) + ", cull$value=" + String.valueOf((class11996)this.N_7) + ")";
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
            this.N_2 = false;
            this.N_4 = false;
            this.N_6 = false;
        }
    }

    public class12011 N(class12014 class120142) {
        this.N_3 = class120142;
        this.N_2 = true;
        return this;
    }

    public class12036 N() {
        class12012 class120122 = (class12012)this.N_1;
        if (!((Boolean)this.N_0).booleanValue()) {
            class120122 = class12036.E();
        }
        class12014 class120142 = (class12014)this.N_3;
        if (!((Boolean)this.N_2).booleanValue()) {
            class120142 = class12036.W();
        }
        class12030 class120302 = (class12030)this.N_5;
        if (!((Boolean)this.N_4).booleanValue()) {
            class120302 = class12036.U();
        }
        class11996 class119962 = (class11996)this.N_7;
        if (!((Boolean)this.N_6).booleanValue()) {
            class119962 = class12036.m();
        }
        return new class12036(class120122, class120142, class120302, class119962);
    }

    public class12011 N(class12030 class120302) {
        this.N_5 = class120302;
        this.N_4 = true;
        return this;
    }

    public class12011 N(class11996 class119962) {
        this.N_7 = class119962;
        this.N_6 = true;
        return this;
    }

    public class12011 N(class12012 class120122) {
        this.N_1 = class120122;
        this.N_0 = true;
        return this;
    }
}

