/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class11462;
import java.util.function.Predicate;
import minecraft.class06202;

public class class11482
extends class11462 {
    public Object N_0;
    public Object N_1;

    @Override
    public boolean L() {
        this.N();
        return (Boolean)this.N_1;
    }

    public class11482(Runnable runnable, Predicate<class06202> predicate) {
        super(999, runnable);
        this.N();
        this.N_0 = predicate;
    }

    @Override
    public boolean u() {
        this.N();
        class06202 class062022 = class06202.Nq();
        if (!((Boolean)this.N_1).booleanValue() && ((Predicate)this.N_0).test(class062022)) {
            ((Runnable)this.y_1).run();
            this.N_1 = true;
            return true;
        }
        return false;
    }

    private void N() {
        this.N_1 = false;
    }
}

