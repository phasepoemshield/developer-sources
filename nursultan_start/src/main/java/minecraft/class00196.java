/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03800
 *  minecraft.class04782
 *  minecraft.class06984
 *  minecraft.class07684
 *  minecraft.class07701
 *  minecraft.class08152
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00225;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03800;
import minecraft.class04782;
import minecraft.class06984;
import minecraft.class07684;
import minecraft.class07701;
import minecraft.class08152;
import org.slf4j.Logger;

public final class class00196
extends Record
implements class00225 {
    private final Optional<class01894> setupFunction;
    private final Optional<class01894> teardownFunction;
    private static final Logger R = LogUtils.getLogger();
    public static final MapCodec<class00196> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.optionalFieldOf("setup").forGetter(class00196::y), (App)class01894.N.optionalFieldOf("teardown").forGetter(class00196::L)).apply(instance, class00196::new));

    public Optional<class01894> L() {
        return this.teardownFunction;
    }

    public class00196(Optional<class01894> optional, Optional<class01894> optional2) {
        this.setupFunction = optional;
        this.teardownFunction = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00196.class, "setupFunction;teardownFunction", "setupFunction", "teardownFunction"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00196.class, "setupFunction;teardownFunction", "setupFunction", "teardownFunction"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00196.class, "setupFunction;teardownFunction", "setupFunction", "teardownFunction"}, this);
    }

    @Override
    public void y(class04782 class047822) {
        this.teardownFunction.ifPresent(class018942 -> class00196.N(class047822, class018942));
    }

    public Optional<class01894> y() {
        return this.setupFunction;
    }

    public MapCodec<class00196> N() {
        return L;
    }

    @Override
    public void N(class04782 class047822) {
        this.setupFunction.ifPresent(class018942 -> class00196.N(class047822, class018942));
    }

    private static void N(class04782 class047822, class01894 class018942) {
        class02796 class027962 = class047822.method_8503();
        class03800 class038002 = class027962.Nr();
        Optional var4 = class038002.N(class018942);
        if (var4.isPresent()) {
            class07701 class077012 = class027962.yu().N((class08152)class06984.L).y().N(class047822);
            class038002.N((class07684)var4.get(), class077012);
        } else {
            R.error("Test Batch failed for non-existent function {}", (Object)class018942);
        }
    }
}

