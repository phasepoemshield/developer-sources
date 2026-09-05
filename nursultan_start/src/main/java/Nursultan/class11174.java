/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11195;
import Nursultan.class11204;
import Nursultan.class11213;
import java.util.function.Consumer;

public class class11174 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11178 L() {
        return ((class11213)this.N_1).N();
    }

    public void M() {
        this.N(class093222 -> {});
    }

    class11174(class11204 class112042, class11213 class112132, int n) {
        this.U();
        this.N_0 = class112042;
        this.N_1 = class112132;
        this.N_2 = n;
    }

    public class11204 i() {
        return (class11204)this.N_0;
    }

    private void U() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public class11213 u() {
        return (class11213)this.N_1;
    }

    public void y(Consumer<class09322> consumer) {
        if (((class11213)this.N_1).M().i() == 0) {
            return;
        }
        ((class11204)this.N_0).N(consumer);
        ((class11213)this.N_1).y(35040);
        ((class11213)this.N_1).N(((class11204)this.N_0).i(), (Integer)this.N_2, ((class11213)this.N_1).y());
    }

    public int y() {
        return (Integer)this.N_2;
    }

    public static class11195 N() {
        return new class11195();
    }

    public void N(Consumer<class09322> consumer) {
        if (((class11213)this.N_1).M().i() == 0) {
            return;
        }
        ((class11204)this.N_0).N(consumer);
        ((class11213)this.N_1).y(35040);
        ((class11213)this.N_1).N(((class11204)this.N_0).i());
    }

    public class11184 R() {
        return ((class11213)this.N_1).M();
    }
}

