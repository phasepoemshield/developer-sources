/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07948
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import minecraft.class07948;

public final class class04871
extends Record {
    private final Supplier<class07948> any;
    private final Supplier<class07948> nonFishy;

    public class04871(Supplier<class07948> supplier, Supplier<class07948> supplier2) {
        this.any = supplier;
        this.nonFishy = supplier2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04871.class, "any;nonFishy", "any", "nonFishy"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04871.class, "any;nonFishy", "any", "nonFishy"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04871.class, "any;nonFishy", "any", "nonFishy"}, this);
    }

    public Supplier<class07948> y() {
        return this.nonFishy;
    }

    public Supplier<class07948> N() {
        return this.any;
    }

    Supplier<class07948> N(boolean bl) {
        return bl ? this.nonFishy : this.any;
    }
}

