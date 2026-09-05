/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07209
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07209;

public final class class00464
extends Record {
    private final Optional<Integer> attackTarget;
    private final Optional<class07209> jumpTarget;
    public static final class02362<ByteBuf, class00464> N = class02362.N((class02362)class02389.B.N_33(class02389::N), class00464::N, (class02362)class07209.field_48404.N_33(class02389::N), class00464::y, class00464::new);

    public class00464(Optional<Integer> optional, Optional<class07209> optional2) {
        this.attackTarget = optional;
        this.jumpTarget = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00464.class, "attackTarget;jumpTarget", "attackTarget", "jumpTarget"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00464.class, "attackTarget;jumpTarget", "attackTarget", "jumpTarget"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00464.class, "attackTarget;jumpTarget", "attackTarget", "jumpTarget"}, this);
    }

    public Optional<class07209> y() {
        return this.jumpTarget;
    }

    public Optional<Integer> N() {
        return this.attackTarget;
    }
}

