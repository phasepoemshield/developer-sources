/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01255
 *  minecraft.class04227
 *  minecraft.class05934
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01255;
import minecraft.class03764;
import minecraft.class04227;
import minecraft.class05934;

public final class class03796
extends Record {
    private final class05934 options;
    private final class03764 dimensions;
    public static final Codec<class03796> N = RecordCodecBuilder.create(instance -> instance.group((App)class05934.N.forGetter(class03796::N), (App)class03764.N.forGetter(class03796::y)).apply(instance, instance.stable(class03796::new)));

    public class03796(class05934 class059342, class03764 class037642) {
        this.options = class059342;
        this.dimensions = class037642;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03796.class, "options;dimensions", "options", "dimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03796.class, "options;dimensions", "options", "dimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03796.class, "options;dimensions", "options", "dimensions"}, this);
    }

    public class03764 y() {
        return this.dimensions;
    }

    public static <T> DataResult<T> N(DynamicOps<T> dynamicOps, class05934 class059342, class01042 class010422) {
        return class03796.N(dynamicOps, class059342, new class03764((class00751<class01255>)class010422.L(class04227.yI)));
    }

    public class05934 N() {
        return this.options;
    }

    public static <T> DataResult<T> N(DynamicOps<T> dynamicOps, class05934 class059342, class03764 class037642) {
        return N.encodeStart(dynamicOps, (Object)new class03796(class059342, class037642));
    }
}

