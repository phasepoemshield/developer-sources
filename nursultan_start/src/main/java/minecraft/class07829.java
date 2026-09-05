/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00780
 *  minecraft.class01281
 *  minecraft.class02158
 *  minecraft.class03322
 *  minecraft.class03460
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06034
 *  minecraft.class06069
 *  minecraft.class06080
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class08050
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class00780;
import minecraft.class01281;
import minecraft.class02158;
import minecraft.class03322;
import minecraft.class03460;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06034;
import minecraft.class06069;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class08050;

public final class class07829<WC extends class06034>
extends Record {
    private final class02158<WC> worldCarver;
    private final WC config;
    public static final Codec<class07829<?>> N = class04206.c.T().dispatch(class078292 -> class078292.worldCarver, class02158::L);
    public static final Codec<class03556<class07829<?>>> y = class01281.N((class05946)class04227.ND, N);
    public static final Codec<class03543<class07829<?>>> L = class03541.N((class05946)class04227.ND, N);

    public class07829(class02158<WC> class021582, WC WC) {
        this.worldCarver = class021582;
        this.config = WC;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07829.class, "worldCarver;config", "worldCarver", "config"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07829.class, "worldCarver;config", "worldCarver", "config"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07829.class, "worldCarver;config", "worldCarver", "config"}, this);
    }

    public WC y() {
        return this.config;
    }

    public boolean N(class06080 class060802, class08050 class080502, Function<class07209, class03556<class00780>> function, class06069 class060692, class03460 class034602, class07321 class073212, class03322 class033222) {
        if (class07529.N((class07321)class080502.R())) {
            return false;
        }
        return this.worldCarver.N(class060802, this.config, class080502, function, class060692, class034602, class073212, class033222);
    }

    public class02158<WC> N() {
        return this.worldCarver;
    }

    public boolean N(class06069 class060692) {
        return this.worldCarver.N(this.config, class060692);
    }
}

