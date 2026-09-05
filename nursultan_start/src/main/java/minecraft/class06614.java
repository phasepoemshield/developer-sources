/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00750
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01807
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03925
 *  minecraft.class04227
 *  minecraft.class07348
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class00750;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01807;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03925;
import minecraft.class04227;
import minecraft.class07348;

public final class class06614
extends Record {
    private final class01807<class00500> blockStatesStrategy;
    private final class00500 defaultBlockState;
    private final Codec<class07348<class00500>> blockStatesContainerCodec;
    private final class01807<class03556<class00780>> biomeStrategy;
    private final class03556<class00780> defaultBiome;
    private final Codec<class03925<class03556<class00780>>> biomeContainerCodec;

    public class01807<class00500> L() {
        return this.blockStatesStrategy;
    }

    public class03556<class00780> M() {
        return this.defaultBiome;
    }

    public class06614(class01807<class00500> class018072, class00500 class005002, Codec<class07348<class00500>> codec, class01807<class03556<class00780>> class018073, class03556<class00780> class035562, Codec<class03925<class03556<class00780>>> codec2) {
        this.blockStatesStrategy = class018072;
        this.defaultBlockState = class005002;
        this.blockStatesContainerCodec = codec;
        this.biomeStrategy = class018073;
        this.defaultBiome = class035562;
        this.biomeContainerCodec = codec2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06614.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "blockStatesStrategy", "defaultBlockState", "blockStatesContainerCodec", "biomeStrategy", "defaultBiome", "biomeContainerCodec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06614.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "blockStatesStrategy", "defaultBlockState", "blockStatesContainerCodec", "biomeStrategy", "defaultBiome", "biomeContainerCodec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06614.class, "blockStatesStrategy;defaultBlockState;blockStatesContainerCodec;biomeStrategy;defaultBiome;biomeContainerCodec", "blockStatesStrategy", "defaultBlockState", "blockStatesContainerCodec", "biomeStrategy", "defaultBiome", "biomeContainerCodec"}, this);
    }

    public Codec<class03925<class03556<class00780>>> B() {
        return this.biomeContainerCodec;
    }

    public Codec<class07348<class00500>> i() {
        return this.blockStatesContainerCodec;
    }

    public class00500 u() {
        return this.defaultBlockState;
    }

    public class07348<class03556<class00780>> y() {
        return new class07348(this.defaultBiome, this.biomeStrategy);
    }

    public static class06614 N(class01042 class010422) {
        class01807 class018072 = class01807.N((class00750)class00891.U);
        class00500 class005002 = class00869.N.W();
        class00751 class007512 = class010422.L(class04227.NA);
        class01807 class018073 = class01807.y((class00750)class007512.v());
        class03529 class035292 = class007512.y(class00795.y);
        return new class06614((class01807<class00500>)class018072, class005002, (Codec<class07348<class00500>>)class07348.N((Codec)class00500.N, (class01807)class018072, (Object)class005002), (class01807<class03556<class00780>>)class018073, (class03556<class00780>)class035292, (Codec<class03925<class03556<class00780>>>)class07348.y((Codec)class007512.b(), (class01807)class018073, (Object)class035292));
    }

    public class07348<class00500> N() {
        return new class07348((Object)this.defaultBlockState, this.blockStatesStrategy);
    }

    public class01807<class03556<class00780>> R() {
        return this.biomeStrategy;
    }
}

