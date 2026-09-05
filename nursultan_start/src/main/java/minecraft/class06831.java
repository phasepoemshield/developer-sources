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
import java.util.stream.Stream;
import minecraft.class06584;
import minecraft.class06838;

public final class class06831
extends Record
implements class06838 {
    private final class06838 slots;
    private final int limit;

    public class06831(class06838 class068382, int n) {
        this.slots = class068382;
        this.limit = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06831.class, "slots;limit", "slots", "limit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06831.class, "slots;limit", "slots", "limit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06831.class, "slots;limit", "slots", "limit"}, this);
    }

    public int y() {
        return this.limit;
    }

    @Override
    public class06838 N(int n) {
        return new class06831(this.slots, Math.min(this.limit, n));
    }

    public class06838 N() {
        return this.slots;
    }

    @Override
    public Stream<class06584> itemCopies() {
        return this.slots.itemCopies().limit(this.limit);
    }
}

