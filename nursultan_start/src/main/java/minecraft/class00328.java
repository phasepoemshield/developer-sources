/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class08051
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
import minecraft.class07209;
import minecraft.class08051;

public final class class00328
extends Record
implements class00381<class08051> {
    private final class07209 pos;
    private final boolean includeData;
    public static final class02362<ByteBuf, class00328> N = class02362.N((class02362)class07209.field_48404, class00328::N, (class02362)class02389.y, class00328::y, class00328::new);

    public class00328(class07209 class072092, boolean bl) {
        this.pos = class072092;
        this.includeData = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00328.class, "pos;includeData", "pos", "includeData"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00328.class, "pos;includeData", "pos", "includeData"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00328.class, "pos;includeData", "pos", "includeData"}, this);
    }

    public boolean y() {
        return this.includeData;
    }

    @Override
    public void method_65081(class08051 class080512) {
        class080512.method_65085(this);
    }

    public class07209 N() {
        return this.pos;
    }

    @Override
    public class02897<class00328> method_65080() {
        return class04248.yS;
    }
}

