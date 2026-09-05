/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01042
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03519
 *  minecraft.class03748
 *  minecraft.class04271
 *  minecraft.class07844
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01042;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03519;
import minecraft.class03748;
import minecraft.class04271;
import minecraft.class07844;

public final class class07814
extends Record
implements class00381<class07844> {
    private final class00392 reason;
    private static final class03519<JsonElement> L = class01042.y.N((DynamicOps)JsonOps.INSTANCE);
    public static final class02362<ByteBuf, class07814> N = class02362.N((class02362)class02389.R((int)262144).N_33(class02389.N(L, (Codec)class03748.N)), class07814::N, class07814::new);

    public class07814(class00392 class003922) {
        this.reason = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07814.class, "reason", "reason"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07814.class, "reason", "reason"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07814.class, "reason", "reason"}, this);
    }

    public void method_65081(class07844 class078442) {
        class078442.N(this);
    }

    public class00392 N() {
        return this.reason;
    }

    public class02897<class07814> method_65080() {
        return class04271.i;
    }
}

