/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09311
 *  Nursultan.class10965
 *  Nursultan.class10990
 *  Nursultan.class11385
 *  minecraft.class00381
 *  minecraft.class00543
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09311;
import Nursultan.class10965;
import Nursultan.class10990;
import Nursultan.class11385;
import Nursultan.class12006;
import Nursultan.class12028;
import Nursultan.class12029;
import Nursultan.class12040;
import java.util.List;
import minecraft.class00381;
import minecraft.class00543;
import minecraft.class06202;

public class class12001 {
    public Object u_0;

    private void L() {
    }

    public boolean M(class12029 class120292) {
        return !((List)class120292.N_0).isEmpty();
    }

    public class12001() {
        this.L();
        this.u_0 = class06202.Nq();
    }

    static {
        class12001.N();
    }

    public void B(class12029 class120292) {
        ((class06202)this.u_0).NE().N((class00381)new class00543(0));
        ((List)class120292.N_1).removeIf(class120402 -> {
            class120402.accept((class06202)this.u_0);
            return true;
        });
    }

    public void i(class12029 class120292) {
    }

    public void u(class12029 class120292) {
    }

    public void y(class12029 class120292) {
        this.B(class120292);
    }

    public void y(class12040 class120402, class12029 class120292) {
        class120402.accept((class06202)this.u_0);
    }

    public void N(class12028 class120282, class12029 class120292) {
        class120282.accept((class06202)this.u_0);
    }

    public void N(class11385 class113852, class12029 class120292) {
    }

    public void N(class09311 class093112, class12029 class120292) {
    }

    private static void N() {
    }

    public void N(class12006 class120062, class12029 class120292) {
        class120062.accept((class06202)this.u_0);
    }

    public void N(class12029 class120292) {
    }

    public void N(class12040 class120402, class12029 class120292) {
        class120402.accept((class06202)this.u_0);
    }

    public void N(class10965 class109652, class12029 class120292) {
    }

    public void N(class10990 class109902, class12029 class120292) {
    }

    public void R(class12029 class120292) {
    }
}

