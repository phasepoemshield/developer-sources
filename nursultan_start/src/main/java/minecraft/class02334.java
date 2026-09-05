/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class02360;
import minecraft.class02362;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;

public final class class02334
extends Record
implements Iterable<class07209> {
    private final class07209 min;
    private final class07209 max;
    public static final class02362<ByteBuf, class02334> N = new class02360();

    public boolean L(class07209 class072092) {
        return class072092.method_10263() >= this.min.method_10263() && class072092.method_10264() >= this.min.method_10264() && class072092.method_10260() >= this.min.method_10260() && class072092.method_10263() <= this.max.method_10263() && class072092.method_10264() <= this.max.method_10264() && class072092.method_10260() <= this.max.method_10260();
    }

    public int L() {
        return this.max.method_10263() - this.min.method_10263() + 1;
    }

    public class07209 M() {
        return this.max;
    }

    public class02334(class07209 class072092, class07209 class072093) {
        this.min = class07209.method_58249((class07209)class072092, (class07209)class072093);
        this.max = class07209.method_58250((class07209)class072092, (class07209)class072093);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02334.class, "min;max", "min", "max"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02334.class, "min;max", "min", "max"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02334.class, "min;max", "min", "max"}, this);
    }

    @Override
    public Iterator<class07209> iterator() {
        return class07209.method_10097((class07209)this.min, (class07209)this.max).iterator();
    }

    public int i() {
        return this.max.method_10260() - this.min.method_10260() + 1;
    }

    public int u() {
        return this.max.method_10264() - this.min.method_10264() + 1;
    }

    public class02334 y(class07211 class072112, int n) {
        if (n == 0) {
            return this;
        }
        return new class02334(this.min.method_10079(class072112, n), this.max.method_10079(class072112, n));
    }

    public class00734 y() {
        return class00734.N((class07209)this.min, (class07209)this.max);
    }

    public class02334 y(class07209 class072092) {
        return new class02334(class07209.method_58249((class07209)this.min, (class07209)class072092), class07209.method_58250((class07209)this.max, (class07209)class072092));
    }

    public class02334 N(class07211 class072112, int n) {
        if (n == 0) {
            return this;
        }
        if (class072112.i() == class07212.field_11056) {
            return class02334.N(this.min, class07209.method_58250((class07209)this.min, (class07209)this.max.method_10079(class072112, n)));
        }
        return class02334.N(class07209.method_58249((class07209)this.min.method_10079(class072112, n), (class07209)this.max), this.max);
    }

    public static class02334 N(class07209 class072092) {
        return new class02334(class072092, class072092);
    }

    public boolean N() {
        return this.min.equals((Object)this.max);
    }

    public static class02334 N(class07209 class072092, class07209 class072093) {
        return new class02334(class072092, class072093);
    }

    public class02334 N(class00753 class007532) {
        return new class02334(this.min.method_10081(class007532), this.max.method_10081(class007532));
    }

    public class07209 R() {
        return this.min;
    }
}

