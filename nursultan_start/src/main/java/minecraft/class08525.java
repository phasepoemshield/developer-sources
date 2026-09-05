/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class01975
 */
package minecraft;

import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01975;
import minecraft.class08509;

public final class class08525
extends Record
implements class01975 {
    private final class08509 operation;
    private final List<class01975> terms;

    public class08525(class08509 class085092, List<class01975> list) {
        this.operation = class085092;
        this.terms = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08525.class, "operation;terms", "operation", "terms"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08525.class, "operation;terms", "operation", "terms"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08525.class, "operation;terms", "operation", "terms"}, this);
    }

    public List<class01975> y() {
        return this.terms;
    }

    public class08509 N() {
        return this.operation;
    }

    public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> class005072) {
        return this.operation.N(Lists.transform(this.terms, class019752 -> class019752.N(class005072)));
    }
}

