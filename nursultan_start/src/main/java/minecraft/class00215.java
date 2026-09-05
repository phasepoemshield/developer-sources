/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04782
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00225;
import minecraft.class04782;
import minecraft.class06338;

public final class class00215
extends Record
implements class00225 {
    private final int time;
    public static final MapCodec<class00215> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.T.fieldOf("time").forGetter(class00215::y)).apply(instance, class00215::new));

    public class00215(int n) {
        this.time = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00215.class, "time", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00215.class, "time", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00215.class, "time", "time"}, this);
    }

    public int y() {
        return this.time;
    }

    public MapCodec<class00215> N() {
        return L;
    }

    @Override
    public void N(class04782 class047822) {
        class047822.method_29199((long)this.time);
    }
}

