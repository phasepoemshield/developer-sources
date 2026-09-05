/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06581
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class00282;
import minecraft.class00287;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06581;

public final class class00304
extends Record
implements class00299 {
    private final class03530<class06581> tag;
    public static final MapCodec<class00304> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03530.N((class05946)class04227.F).fieldOf("tag").forGetter(class00304::y)).apply(instance, class00304::new));
    public static final class02362<class04247, class00304> u = class02362.N((class02362)class03530.L((class05946)class04227.F), class00304::y, class00304::new);
    public static final class00319<class00304> i = new class00319<class00304>(L, u);

    public class00304(class03530<class06581> class035302) {
        this.tag = class035302;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00304.class, "tag", "tag"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00304.class, "tag", "tag"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00304.class, "tag", "tag"}, this);
    }

    public class03530<class06581> y() {
        return this.tag;
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class00287) {
            class00287 class002872 = (class00287)class003082;
            class01929 class019292 = class003112.L(class00282.y);
            if (class019292 != null) {
                return class019292.y(class04227.F).N(this.tag).map(class035522 -> class035522.N().map(class002872::N)).stream().flatMap(stream -> stream);
            }
        }
        return Stream.empty();
    }

    public class00319<class00304> N() {
        return i;
    }
}

