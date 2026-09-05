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
 *  minecraft.class01042
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03519
 *  minecraft.class04273
 *  minecraft.class07806
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
import minecraft.class01042;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03519;
import minecraft.class04273;
import minecraft.class07806;
import minecraft.class07834;

public final class class07846
extends Record
implements class00381<class07834> {
    private final class07806 status;
    private static final class03519<JsonElement> L = class01042.y.N((DynamicOps)JsonOps.INSTANCE);
    public static final class02362<ByteBuf, class07846> N = class02362.N((class02362)class02389.R((int)Short.MAX_VALUE).N_33(class02389.N(L, (Codec)class07806.N)), class07846::N, class07846::new);

    public class07846(class07806 class078062) {
        this.status = class078062;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07846.class, "status", "status"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07846.class, "status", "status"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07846.class, "status", "status"}, this);
    }

    public void method_65081(class07834 class078342) {
        class078342.N(this);
    }

    public class07806 N() {
        return this.status;
    }

    public class02897<class07846> method_65080() {
        return class04273.N;
    }
}

