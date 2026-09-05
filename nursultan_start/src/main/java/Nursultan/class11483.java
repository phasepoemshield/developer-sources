/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11473;
import Nursultan.class11476;
import Nursultan.class11479;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11925;
import Nursultan.class11934;
import java.time.Duration;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11483
extends class11479 {
    private static double[] B;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    public class11934 L() {
        this.t();
        return (class11934)this.N_1;
    }

    public class11934 M() {
        this.t();
        return (class11934)this.N_0;
    }

    public class11483(String string, int n, class06889 class068892, String string2, int n2) {
        super(string, class068892, Duration.ofSeconds(30L), string2);
        this.t();
        this.N_0 = new class11934(class11903.FORWARDS);
        this.N_1 = new class11934(class11903.FORWARDS);
        this.N_2 = n;
        this.N_3 = n2;
        this.N_4 = class068892;
        ((class11934)this.N_0).N(B[0], Duration.ofMillis(2200L), (class11887)class11905.u_4);
        ((class11934)this.N_1).N(B[1], Duration.ofMillis(250L), (class11887)class11905.u_4);
    }

    static {
        class11483.n();
    }

    public class06889 B() {
        this.t();
        return (class06889)this.N_4;
    }

    public int i() {
        this.t();
        return (Integer)this.N_2;
    }

    private static void n() {
        B = new double[2];
        class11483.B[0] = Double.longBitsToDouble(0x3FF0000000000000L);
        class11483.B[1] = Double.longBitsToDouble(0x3FF0000000000000L);
    }

    private void t() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
            this.N_3 = 0;
        }
    }

    public class06889 u() {
        class07049 class070492;
        this.t();
        if ((Integer)this.N_3 == -1) {
            return super.W();
        }
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null && (class070492 = ((class03448)class062022.T_3).method_8469(((Integer)this.N_3).intValue())) != null) {
            return new class06889(class11925.i((class07049)class070492), class11925.u((class07049)class070492) + (double)(class070492.method_17682() / 2.0f), class11925.L((class07049)class070492));
        }
        return super.W();
    }

    public int y() {
        this.t();
        return (Integer)this.N_3;
    }

    @Override
    public Class<? extends class11473<?>> N() {
        return class11476.class;
    }

    public boolean R() {
        this.t();
        return (Integer)this.N_3 != -1;
    }
}

