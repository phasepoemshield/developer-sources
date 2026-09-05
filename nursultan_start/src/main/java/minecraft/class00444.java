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
 *  minecraft.class07209
 *  minecraft.class07280
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class07280;

public final class class00444
extends Record
implements class00381<class07280> {
    private final class07209 absolutePos;
    private final class07209 relativePos;
    public static final class02362<ByteBuf, class00444> N = class02362.N((class02362)class07209.field_48404, class00444::N, (class02362)class07209.field_48404, class00444::y, class00444::new);

    public class00444(class07209 class072092, class07209 class072093) {
        this.absolutePos = class072092;
        this.relativePos = class072093;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00444.class, "absolutePos;relativePos", "absolutePos", "relativePos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00444.class, "absolutePos;relativePos", "absolutePos", "relativePos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00444.class, "absolutePos;relativePos", "absolutePos", "relativePos"}, this);
    }

    public class07209 y() {
        return this.relativePos;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class07209 N() {
        return this.absolutePos;
    }

    public class02897<class00444> method_65080() {
        return class04248.e;
    }
}

