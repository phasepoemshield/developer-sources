/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06889;

public final class class10713
extends Record {
    public final class06889 from;
    public final class06889 to;
    private final Optional<class06889> axisDependentOriginalMovement;

    public Optional<class06889> L() {
        return this.axisDependentOriginalMovement;
    }

    public class10713(class06889 class068892, class06889 class068893, class06889 class068894) {
        this(class068892, class068893, Optional.of(class068894));
    }

    public class10713(class06889 class068892, class06889 class068893, Optional<class06889> optional) {
        this.from = class068892;
        this.to = class068893;
        this.axisDependentOriginalMovement = optional;
    }

    public class10713(class06889 class068892, class06889 class068893) {
        this(class068892, class068893, Optional.empty());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10713.class, "from;to;axisDependentOriginalMovement", "from", "to", "axisDependentOriginalMovement"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10713.class, "from;to;axisDependentOriginalMovement", "from", "to", "axisDependentOriginalMovement"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10713.class, "from;to;axisDependentOriginalMovement", "from", "to", "axisDependentOriginalMovement"}, this);
    }

    public class06889 y() {
        return this.to;
    }

    public class06889 N() {
        return this.from;
    }
}

