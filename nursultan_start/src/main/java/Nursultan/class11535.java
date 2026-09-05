/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 *  Nursultan.class12033
 */
package Nursultan;

import Nursultan.class12018;
import Nursultan.class12033;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11535 {
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public boolean R_init;

    public void M(boolean bl) {
        this.R_3 = bl;
        ((Consumer)this.R_2).accept(this);
    }

    public class11535(String string, boolean bl, Consumer<class11535> consumer) {
        this.u();
        this.R_4 = () -> null;
        this.R_0 = class12033.y((String)string);
        boolean bl2 = bl;
        this.R_1 = bl2;
        this.R_3 = bl2;
        this.R_2 = consumer;
    }

    public class11535(String string, boolean bl) {
        this(string, bl, class115352 -> {});
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class11535 class115352 = (class11535)object;
        return Objects.equals(((class12018)this.R_0).N(), ((class12018)class115352.R_0).N());
    }

    public String toString() {
        return ((class12018)this.R_0).N();
    }

    public int hashCode() {
        return Objects.hashCode(((class12018)this.R_0).N());
    }

    public Consumer<class11535> Z() {
        return (Consumer)this.R_2;
    }

    public boolean U() {
        Boolean bl = (Boolean)((Supplier)this.R_4).get();
        return bl != null ? bl.booleanValue() : ((Boolean)this.R_3).booleanValue();
    }

    public boolean z() {
        return (Boolean)this.R_1;
    }

    private void u() {
        if (!this.R_init) {
            this.R_init = true;
            this.R_1 = false;
            this.R_3 = false;
        }
    }

    public class12018 E() {
        return (class12018)this.R_0;
    }

    public void N_5(Supplier<Boolean> supplier) {
        this.R_4 = supplier;
    }

    public void b_() {
        this.M((Boolean)this.R_3 == false);
    }
}

