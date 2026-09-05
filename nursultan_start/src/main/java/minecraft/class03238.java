/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06386
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class01281;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06386;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class08088;

public final class class03238<FC extends class06386, F extends class06391<FC>>
extends Record {
    private final F feature;
    private final FC config;
    public static final Codec<class03238<?, ?>> N = class04206.X.T().dispatch(class032382 -> class032382.feature, class06391::N);
    public static final Codec<class03556<class03238<?, ?>>> y = class01281.N((class05946)class04227.Nh, N);
    public static final Codec<class03543<class03238<?, ?>>> L = class03541.N((class05946)class04227.Nh, N);

    public FC L() {
        return this.config;
    }

    public class03238(F f, FC FC) {
        this.feature = f;
        this.config = FC;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03238.class, "feature;config", "feature", "config"}, this, object);
    }

    public String toString() {
        return "Configured: " + String.valueOf(this.feature) + ": " + String.valueOf(this.config);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03238.class, "feature;config", "feature", "config"}, this);
    }

    public F y() {
        return this.feature;
    }

    public Stream<class03238<?, ?>> N() {
        return Stream.concat(Stream.of(this), this.config.u());
    }

    public boolean N(class05974 class059742, class08088 class080882, class06069 class060692, class07209 class072092) {
        return this.feature.N(this.config, class059742, class080882, class060692, class072092);
    }
}

