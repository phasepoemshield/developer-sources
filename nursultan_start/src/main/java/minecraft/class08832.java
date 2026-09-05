/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03448
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07287
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03448;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07287;
import minecraft.class07438;
import minecraft.class08843;
import org.jspecify.annotations.Nullable;

public final class class08832
extends Record
implements class08843 {
    private final float temperature;
    private final float downfall;
    public static final MapCodec<class08832> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.N((float)0.0f, (float)1.0f).fieldOf("temperature").forGetter(class08832::y), (App)class06338.N((float)0.0f, (float)1.0f).fieldOf("downfall").forGetter(class08832::L)).apply(instance, class08832::new));

    public float L() {
        return this.downfall;
    }

    public class08832() {
        this(0.5f, 1.0f);
    }

    public class08832(float f, float f2) {
        this.temperature = f;
        this.downfall = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08832.class, "temperature;downfall", "temperature", "downfall"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08832.class, "temperature;downfall", "temperature", "downfall"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08832.class, "temperature;downfall", "temperature", "downfall"}, this);
    }

    public float y() {
        return this.temperature;
    }

    public MapCodec<class08832> N() {
        return N;
    }

    @Override
    public int N(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382) {
        return class07287.N((double)this.temperature, (double)this.downfall);
    }
}

