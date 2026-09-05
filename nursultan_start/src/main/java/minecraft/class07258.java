/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07086
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07086;
import minecraft.class07280;

public final class class07258
extends Record
implements class00381<class07280> {
    private final class07086 difficulty;
    private final boolean locked;
    public static final class02362<ByteBuf, class07258> N = class02362.N((class02362)class07086.field_60664, class07258::N, (class02362)class02389.y, class07258::y, class07258::new);

    public class07258(class07086 class070862, boolean bl) {
        this.difficulty = class070862;
        this.locked = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07258.class, "difficulty;locked", "difficulty", "locked"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07258.class, "difficulty;locked", "difficulty", "locked"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07258.class, "difficulty;locked", "difficulty", "locked"}, this);
    }

    public boolean y() {
        return this.locked;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class07086 N() {
        return this.difficulty;
    }

    public class02897<class07258> method_65080() {
        return class04248.E;
    }
}

