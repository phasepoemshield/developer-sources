/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00763
 *  minecraft.class07209
 */
package minecraft;

import it.unimi.dsi.fastutil.Hash;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import minecraft.class00763;
import minecraft.class04306;
import minecraft.class04317;
import minecraft.class07209;

public final class class04309<T>
extends Record {
    private final T type;
    private final class07209 pos;
    private final long triggerTick;
    private final class00763 priority;
    private final long subTickOrder;
    public static final Comparator<class04309<?>> N = (class043092, class043093) -> {
        int n = Long.compare(class043092.triggerTick, class043093.triggerTick);
        if (n != 0) {
            return n;
        }
        n = class043092.priority.compareTo((Enum)class043093.priority);
        if (n != 0) {
            return n;
        }
        return Long.compare(class043092.subTickOrder, class043093.subTickOrder);
    };
    public static final Comparator<class04309<?>> y = (class043092, class043093) -> {
        int n = class043092.priority.compareTo((Enum)class043093.priority);
        if (n != 0) {
            return n;
        }
        return Long.compare(class043092.subTickOrder, class043093.subTickOrder);
    };
    public static final Hash.Strategy<class04309<?>> L = new class04317();

    public long L() {
        return this.triggerTick;
    }

    public class04309(T t, class07209 class072092, long l, long l2) {
        this(t, class072092, l, class00763.field_9314, l2);
    }

    public class04309(T t, class07209 class072092, long l, class00763 class007632, long l2) {
        class072092 = class072092.method_10062();
        this.type = t;
        this.pos = class072092;
        this.triggerTick = l;
        this.priority = class007632;
        this.subTickOrder = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04309.class, "type;pos;triggerTick;priority;subTickOrder", "type", "pos", "triggerTick", "priority", "subTickOrder"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04309.class, "type;pos;triggerTick;priority;subTickOrder", "type", "pos", "triggerTick", "priority", "subTickOrder"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04309.class, "type;pos;triggerTick;priority;subTickOrder", "type", "pos", "triggerTick", "priority", "subTickOrder"}, this);
    }

    public long i() {
        return this.subTickOrder;
    }

    public class00763 u() {
        return this.priority;
    }

    public class07209 y() {
        return this.pos;
    }

    public T N() {
        return this.type;
    }

    public static <T> class04309<T> N(T t, class07209 class072092) {
        return new class04309<T>(t, class072092, 0L, class00763.field_9314, 0L);
    }

    public class04306<T> N(long l) {
        return new class04306<T>(this.type, this.pos, (int)(this.triggerTick - l), this.priority);
    }
}

