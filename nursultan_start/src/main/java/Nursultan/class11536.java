/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11496;
import Nursultan.class11512;
import Nursultan.class11520;
import Nursultan.class12018;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public abstract class class11536<T>
extends class11512 {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;

    public void L(T t) {
        this.L();
        this.y_1 = t;
        ((class11520)this.y_5).valueChanged(this, t);
        this.m();
    }

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_3 = false;
        }
    }

    public class12018 P() {
        this.L();
        return (class12018)this.y_0;
    }

    public class11536(class12018 class120182, T t) {
        this.L();
        this.y_0 = class120182;
        this.y_1 = this.y_2 = t;
        this.y_3 = true;
        this.y_4 = class115362 -> true;
        this.y_5 = (class115362, object) -> {};
        this.L_0 = (class115362, bl) -> {};
    }

    public class11496 B() {
        this.L();
        return (class11496)this.L_0;
    }

    public Predicate<class11536<T>> Z() {
        this.L();
        return (Predicate)this.y_4;
    }

    public T i() {
        this.L();
        if ((BooleanSupplier)this.L_1 != null && ((BooleanSupplier)this.L_1).getAsBoolean()) {
            return (T)this.L_2;
        }
        return (T)this.y_1;
    }

    public void s() {
        if (this.c_()) {
            this.u();
        }
    }

    public void m() {
        this.L();
        boolean bl = (Boolean)this.y_3;
        this.y_3 = ((Predicate)this.y_4).test(this);
        if (bl != (Boolean)this.y_3) {
            ((class11496)this.L_0).visibilityChanged(this, (Boolean)this.y_3);
        }
    }

    public T U() {
        this.L();
        return (T)this.y_2;
    }

    public class11520<T> z() {
        this.L();
        return (class11520)this.y_5;
    }

    public void u() {
        this.L();
        this.L(this.y_2);
    }

    public class11536<T> y(T t) {
        this.L();
        this.y_2 = t;
        return this;
    }

    public boolean E() {
        this.L();
        return (Boolean)this.y_3;
    }

    public <E extends class11536<T>> E N(Predicate<class11536<T>> predicate) {
        this.L();
        this.y_4 = predicate;
        return (E)this;
    }

    public <E extends class11536<T>> E N(BooleanSupplier booleanSupplier, T t) {
        this.L();
        this.L_1 = booleanSupplier;
        this.L_2 = t;
        return (E)this;
    }

    public void N(T t) {
        this.L(t);
    }

    public boolean N() {
        return false;
    }

    @Override
    public class12018 N_7(String string) {
        this.L();
        return ((class12018)this.y_0).N(string);
    }

    public <E extends class11536<T>> E N_6(class11520<T> class115202) {
        this.L();
        this.y_5 = class115202;
        return (E)this;
    }

    public class11536<T> N(class11496 class114962) {
        this.L();
        this.L_0 = class114962;
        return this;
    }

    public T W() {
        this.L();
        return (T)this.y_1;
    }

    public boolean c_() {
        this.L();
        return !Objects.equals(this.y_1, this.y_2);
    }
}

