/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11473;
import Nursultan.class11484;
import minecraft.class06889;

public class class11481 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    private void L() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_3 = 0;
            this.L_4 = false;
            this.L_5 = false;
        }
    }

    public void P() {
        this.L_5 = true;
    }

    public boolean T() {
        return (Boolean)this.L_5;
    }

    public class11481(String string, class06889 class068892, String string2) {
        this.L();
        this.L_0 = string;
        this.L_2 = class068892;
        this.L_1 = string2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class11481)) {
            return false;
        }
        class11481 class114812 = (class11481)object;
        if (!class114812.N(this)) {
            return false;
        }
        String string = this.m();
        String string2 = class114812.m();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = this.m();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public boolean b() {
        return (Boolean)this.L_4;
    }

    public String s() {
        return (String)this.L_1;
    }

    public String m() {
        return (String)this.L_0;
    }

    public boolean U() {
        return true;
    }

    public boolean z() {
        return (Boolean)this.L_5;
    }

    public class11481 y(boolean bl) {
        this.L_4 = bl;
        return this;
    }

    public int E() {
        return (Integer)this.L_3;
    }

    public class11481 N(int n) {
        this.L_3 = n;
        return this;
    }

    public class11481 N(boolean bl) {
        this.L_5 = bl;
        return this;
    }

    public boolean N(Object object) {
        return object instanceof class11481;
    }

    public class11481 N(class06889 class068892) {
        this.L_2 = class068892;
        return this;
    }

    public Class<? extends class11473<?>> N() {
        return class11484.class;
    }

    public class06889 W() {
        return (class06889)this.L_2;
    }
}

