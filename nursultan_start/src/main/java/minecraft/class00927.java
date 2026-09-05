/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01656
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02867
 *  minecraft.class02897
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class01656;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02867;
import minecraft.class02897;

public final class class00927
extends Record
implements class00381<class01656> {
    private final String codeOfConduct;
    public static final class02362<ByteBuf, class00927> N = class02362.N((class02362)class02389.s, class00927::N, class00927::new);

    public class00927(String string) {
        this.codeOfConduct = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00927.class, "codeOfConduct", "codeOfConduct"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00927.class, "codeOfConduct", "codeOfConduct"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00927.class, "codeOfConduct", "codeOfConduct"}, this);
    }

    public void method_65081(class01656 class016562) {
        class016562.N(this);
    }

    public String N() {
        return this.codeOfConduct;
    }

    public class02897<class00927> method_65080() {
        return class02867.N;
    }
}

