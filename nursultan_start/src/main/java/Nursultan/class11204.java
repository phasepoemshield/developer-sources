/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class12019
 *  Nursultan.class12036
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11196;
import Nursultan.class12019;
import Nursultan.class12036;
import java.util.function.Consumer;

public class class11204 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public static class11196 L() {
        return new class11196();
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public class11204(class09322 class093222, class12036 class120362, int n) {
        this.M();
        this.N_0 = class093222;
        this.N_1 = class120362;
        this.N_2 = n;
    }

    public int i() {
        return (Integer)this.N_2;
    }

    static int U() {
        return 4;
    }

    static class12036 z() {
        return (class12036)class12019.N_3;
    }

    public class12036 u() {
        return (class12036)this.N_1;
    }

    public void y() {
        this.N(class093222 -> {});
    }

    public class09322 N() {
        return (class09322)this.N_0;
    }

    public void N(Consumer<class09322> consumer) {
        ((class09322)this.N_0).M();
        ((class12036)this.N_1).N();
        consumer.accept((class09322)this.N_0);
    }
}

