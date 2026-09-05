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
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class06584;
import minecraft.class06838;

public final class class06815
extends Record
implements class06838 {
    private final class06838 slots;
    private final Predicate<class06584> filter;

    public class06815(class06838 class068382, Predicate<class06584> predicate) {
        this.slots = class068382;
        this.filter = predicate;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06815.class, "slots;filter", "slots", "filter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06815.class, "slots;filter", "slots", "filter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06815.class, "slots;filter", "slots", "filter"}, this);
    }

    public Predicate<class06584> y() {
        return this.filter;
    }

    @Override
    public class06838 N_65(Predicate<class06584> predicate) {
        return new class06815(this.slots, this.filter.and(predicate));
    }

    public class06838 N() {
        return this.slots;
    }

    @Override
    public Stream<class06584> itemCopies() {
        return this.slots.itemCopies().filter(this.filter);
    }
}

