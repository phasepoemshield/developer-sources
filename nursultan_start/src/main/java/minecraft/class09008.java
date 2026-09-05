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
 *  minecraft.class07282
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
import minecraft.class07282;
import minecraft.class08051;

public final class class09008
extends Record
implements class00381<class08051> {
    private final class07282 mode;
    public static final class02362<ByteBuf, class09008> N = class02362.N((class02362)class07282.field_60671, class09008::N, class09008::new);

    public class09008(class07282 class072822) {
        this.mode = class072822;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09008.class, "mode", "mode"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09008.class, "mode", "mode"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09008.class, "mode", "mode"}, this);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_71675(this);
    }

    public class07282 N() {
        return this.mode;
    }

    public class02897<class09008> method_65080() {
        return class04248.yn;
    }
}

