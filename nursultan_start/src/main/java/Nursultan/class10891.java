/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11328
 *  Nursultan.class11535
 *  Nursultan.class11938
 *  minecraft.class04453
 */
package Nursultan;

import Nursultan.class11328;
import Nursultan.class11535;
import Nursultan.class11938;
import java.util.function.Predicate;
import minecraft.class04453;

public class class10891
extends class11535 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public class10891(String string, boolean bl, Predicate<class04453> predicate, class11328 class113282) {
        super(string, bl);
        this.L();
        this.N_0 = predicate;
        this.N_1 = class113282;
    }

    public void N(int n) {
        this.L();
        this.N_2 = class11938.j().y() + n;
    }

    public boolean N() {
        this.L();
        return class11938.j().y() < (Integer)this.N_2;
    }
}

