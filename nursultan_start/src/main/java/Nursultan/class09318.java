/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09426
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11805
 *  Nursultan.class11826
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  Nursultan.class11992
 *  Nursultan.class11997
 *  minecraft.class05096
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09426;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11805;
import Nursultan.class11826;
import Nursultan.class11910;
import Nursultan.class11938;
import Nursultan.class11992;
import Nursultan.class11997;
import minecraft.class05096;
import minecraft.class06202;

public class class09318
implements class11826<class11389> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    private void L(class11389 class113892) {
        if (!class113892.B()) {
            return;
        }
        ((class11992)this.N_3).N(class113892.z()).stream().map(class11997::y).forEach(class11910::N);
    }

    private void L() {
    }

    public class09318() {
        this.L();
        this.N_0 = class06202.Nq();
        this.N_1 = class11938.L();
        this.N_2 = class11938.W();
        this.N_3 = class11938.y();
    }

    private void y(class11389 class113892) {
        class11400 class114002 = class11400.N((class11389)class113892);
        ((class11805)this.N_1).L((Object)class114002);
        if (class114002.y()) {
            class113892.N();
        }
    }

    private boolean y() {
        return (class05096)((class06202)this.N_0).v_3 == null;
    }

    public void listen(class11389 class113892) {
        if (class113892.y()) {
            return;
        }
        if (class113892.M()) {
            ((class09426)this.N_2).N(class113892);
            this.y(class113892);
            return;
        }
        if (!this.y()) {
            return;
        }
        if (class113892.B()) {
            ((class09426)this.N_2).y(class113892);
        }
        this.y(class113892);
        this.L(class113892);
    }
}

