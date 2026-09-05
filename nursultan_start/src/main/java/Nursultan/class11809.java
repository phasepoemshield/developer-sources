/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11535
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11535;
import java.util.function.Predicate;
import minecraft.class07049;

public class class11809<T extends class07049>
extends class11535
implements Predicate<T> {
    public Object N_0;

    private void L() {
    }

    public class11809(Predicate<T> predicate, String string, boolean bl) {
        super(string, bl);
        this.L();
        this.N_0 = predicate;
    }

    @Override
    public boolean test(T t) {
        this.L();
        if (!this.U()) {
            return false;
        }
        return ((Predicate)this.N_0).test(t);
    }
}

