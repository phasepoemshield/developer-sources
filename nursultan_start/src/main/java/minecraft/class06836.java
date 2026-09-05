/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class06584;
import minecraft.class06838;

public final class class06836
extends Record
implements class06838 {
    private final class06838 slots;
    private final Function<class06584, ? extends class06838> mapper;

    public class06836(class06838 class068382, Function<class06584, ? extends class06838> function) {
        this.slots = class068382;
        this.mapper = function;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06836.class, "slots;mapper", "slots", "mapper"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06836.class, "slots;mapper", "slots", "mapper"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06836.class, "slots;mapper", "slots", "mapper"}, this);
    }

    public Function<class06584, ? extends class06838> y() {
        return this.mapper;
    }

    public class06838 N() {
        return this.slots;
    }

    @Override
    public Stream<class06584> itemCopies() {
        return this.slots.itemCopies().map(this.mapper).flatMap(class06838::itemCopies);
    }
}

