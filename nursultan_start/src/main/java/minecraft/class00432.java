/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00452;
import minecraft.class02362;
import minecraft.class02389;

public final class class00432
extends Record {
    private final List<class00452> goals;
    public static final class02362<ByteBuf, class00432> N = class02362.N((class02362)class00452.N.N_33(class02389.N()), class00432::N, class00432::new);

    public class00432(List<class00452> list) {
        this.goals = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00432.class, "goals", "goals"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00432.class, "goals", "goals"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00432.class, "goals", "goals"}, this);
    }

    public List<class00452> N() {
        return this.goals;
    }
}

