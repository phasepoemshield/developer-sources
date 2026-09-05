/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class06338
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class06338;
import minecraft.class06386;

public final class class01478
extends Record
implements class06386 {
    private final int tries;
    private final int xzSpread;
    private final int ySpread;
    private final class03556<class04336> feature;
    public static final Codec<class01478> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.fieldOf("tries").orElse((Object)128).forGetter(class01478::N), (App)class06338.T.fieldOf("xz_spread").orElse((Object)7).forGetter(class01478::y), (App)class06338.T.fieldOf("y_spread").orElse((Object)3).forGetter(class01478::L), (App)class04336.y.fieldOf("feature").forGetter(class01478::i)).apply(instance, class01478::new));

    public int L() {
        return this.ySpread;
    }

    public class01478(int n, int n2, int n3, class03556<class04336> class035562) {
        this.tries = n;
        this.xzSpread = n2;
        this.ySpread = n3;
        this.feature = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01478.class, "tries;xzSpread;ySpread;feature", "tries", "xzSpread", "ySpread", "feature"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01478.class, "tries;xzSpread;ySpread;feature", "tries", "xzSpread", "ySpread", "feature"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01478.class, "tries;xzSpread;ySpread;feature", "tries", "xzSpread", "ySpread", "feature"}, this);
    }

    public class03556<class04336> i() {
        return this.feature;
    }

    public int y() {
        return this.xzSpread;
    }

    public int N() {
        return this.tries;
    }
}

