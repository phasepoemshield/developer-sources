/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04248;
import minecraft.class07280;

public final class class03953
extends Record
implements class00381<class07280> {
    private final class00392 motd;
    private final Optional<byte[]> iconBytes;
    public static final class02362<ByteBuf, class03953> N = class02362.N((class02362)class03748.R, class03953::N, (class02362)class02389.m.N_33(class02389::N), class03953::y, class03953::new);

    public class03953(class00392 class003922, Optional<byte[]> optional) {
        this.motd = class003922;
        this.iconBytes = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03953.class, "motd;iconBytes", "motd", "iconBytes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03953.class, "motd;iconBytes", "motd", "iconBytes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03953.class, "motd;iconBytes", "motd", "iconBytes"}, this);
    }

    public Optional<byte[]> y() {
        return this.iconBytes;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00392 N() {
        return this.motd;
    }

    public class02897<class03953> method_65080() {
        return class04248.Nd;
    }
}

