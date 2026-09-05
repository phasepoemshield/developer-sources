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
 *  minecraft.class02560
 *  minecraft.class02796
 *  minecraft.class03800
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07049
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
import minecraft.class01894;
import minecraft.class02525;
import minecraft.class02560;
import minecraft.class02796;
import minecraft.class03800;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07049;
import minecraft.class07684;
import minecraft.class07701;
import minecraft.class08152;
import org.slf4j.Logger;

public final class class02533
extends Record
implements class02560 {
    private final class01894 function;
    private static final Logger i = LogUtils.getLogger();
    public static final MapCodec<class02533> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("function").forGetter(class02533::y)).apply(instance, class02533::new));

    public class02533(class01894 class018942) {
        this.function = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02533.class, "function", "function"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02533.class, "function", "function"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02533.class, "function", "function"}, this);
    }

    public class01894 y() {
        return this.function;
    }

    public MapCodec<class02533> N() {
        return N;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class02796 class027962 = class047822.method_8503();
        class03800 class038002 = class027962.Nr();
        Optional optional = class038002.N(this.function);
        if (optional.isPresent()) {
            class07701 class077012 = class027962.yu().N((class08152)class06984.L).y().N(class070492).N(class047822).N(class068892).N(class070492.method_5802());
            class038002.N((class07684)optional.get(), class077012);
        } else {
            i.error("Enchantment run_function effect failed for non-existent function {}", (Object)this.function);
        }
    }
}

