/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07086
 *  minecraft.class08051
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07086;
import minecraft.class08051;

public final class class06287
extends Record
implements class00381<class08051> {
    private final class07086 difficulty;
    public static final class02362<ByteBuf, class06287> N = class02362.N((class02362)class07086.field_60664, class06287::N, class06287::new);

    public class06287(class07086 class070862) {
        this.difficulty = class070862;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06287.class, "difficulty", "difficulty"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06287.class, "difficulty", "difficulty"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06287.class, "difficulty", "difficulty"}, this);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_19475(this);
    }

    public class07086 N() {
        return this.difficulty;
    }

    public class02897<class06287> method_65080() {
        return class04248.yv;
    }
}

