/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05216
 *  minecraft.class05341
 *  minecraft.class05361
 *  minecraft.class05362
 */
package Nursultan;

import Nursultan.class11284;
import java.util.function.Consumer;
import minecraft.class05216;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;

public class class11279 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    public class11279(class05216 class052162, class05361 class053612) {
        this.y();
        this.y_0 = class11284.u();
        this.y_3 = class053622 -> {};
        this.y_4 = class053622 -> {};
        this.N_1 = 150;
        this.N_2 = 20;
        this.y_1 = class052162;
        this.y_2 = class053612;
    }

    public class11279 y(int n, int n2) {
        this.y_5 = n;
        this.N_0 = n2;
        return this;
    }

    private void y() {
        this.y_5 = 0;
        this.N_0 = 0;
        this.N_1 = 0;
        this.N_2 = 0;
    }

    public class11279 y(Consumer<class05362> consumer) {
        this.y_4 = consumer;
        return this;
    }

    public class11279 N(Consumer<class05362> consumer) {
        this.y_3 = consumer;
        return this;
    }

    public class11279 N(int n, int n2) {
        this.N_1 = n;
        this.N_2 = n2;
        return this;
    }

    public class11284 N() {
        return new class11284((Integer)this.y_5, (Integer)this.N_0, (Integer)this.N_1, (Integer)this.N_2, (class05216)this.y_1, (class05361)this.y_2, (class05341)this.y_0, (Consumer)this.y_3, (Consumer)this.y_4);
    }
}

