/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class03748
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class03748;

public final class class00501
extends Record
implements class00381<class01662> {
    private final class00392 reason;
    public static final class02362<ByteBuf, class00501> N = class03748.R.N_10(class00501::new, class00501::N);

    public class00501(class00392 class003922) {
        this.reason = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00501.class, "reason", "reason"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00501.class, "reason", "reason"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00501.class, "reason", "reason"}, this);
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class00392 N() {
        return this.reason;
    }

    public class02897<class00501> method_65080() {
        return class02885.u;
    }
}

