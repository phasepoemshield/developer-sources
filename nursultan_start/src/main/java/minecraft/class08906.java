/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class08906
extends Record {
    private final boolean handAnimationOnSwap;
    private final boolean oversizedInGui;
    private final float swapAnimationScale;
    public static final class08906 N = new class08906(true, false, 1.0f);
    public static final MapCodec<class08906> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("hand_animation_on_swap", (Object)true).forGetter(class08906::N), (App)Codec.BOOL.optionalFieldOf("oversized_in_gui", (Object)false).forGetter(class08906::y), (App)Codec.FLOAT.optionalFieldOf("swap_animation_scale", (Object)Float.valueOf(1.0f)).forGetter(class08906::L)).apply(instance, class08906::new));

    public float L() {
        return this.swapAnimationScale;
    }

    public class08906(boolean bl, boolean bl2, float f) {
        this.handAnimationOnSwap = bl;
        this.oversizedInGui = bl2;
        this.swapAnimationScale = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08906.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "handAnimationOnSwap", "oversizedInGui", "swapAnimationScale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08906.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "handAnimationOnSwap", "oversizedInGui", "swapAnimationScale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08906.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "handAnimationOnSwap", "oversizedInGui", "swapAnimationScale"}, this);
    }

    public boolean y() {
        return this.oversizedInGui;
    }

    public boolean N() {
        return this.handAnimationOnSwap;
    }
}

