/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00331
 *  minecraft.class00335
 *  minecraft.class00368
 *  minecraft.class01140
 *  minecraft.class01894
 *  minecraft.class03341
 *  minecraft.class05904
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06260
 *  minecraft.class08571
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00368;
import minecraft.class01140;
import minecraft.class01894;
import minecraft.class03341;
import minecraft.class05904;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06260;
import minecraft.class08359;
import minecraft.class08571;

public final class class08343
extends Record
implements class00335 {
    private final class05904 woodType;
    private final Optional<class01894> texture;
    public static final MapCodec<class08343> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class08343::y), (App)class01894.N.optionalFieldOf("texture").forGetter(class08343::L)).apply(instance, class08343::new));

    public Optional<class01894> L() {
        return this.texture;
    }

    public class08343(class05904 class059042) {
        this(class059042, Optional.empty());
    }

    public class08343(class05904 class059042, Optional<class01894> optional) {
        this.woodType = class059042;
        this.texture = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08343.class, "woodType;texture", "woodType", "texture"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08343.class, "woodType;texture", "woodType", "texture"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08343.class, "woodType;texture", "woodType", "texture"}, this);
    }

    public class05904 y() {
        return this.woodType;
    }

    public MapCodec<class08343> N() {
        return N;
    }

    public class00368<?> N(class00331 class003312) {
        class06260 class062602 = class03341.N((class01140)class003312.y(), (class05904)this.woodType, (boolean)true);
        class05913 class059132 = this.texture.map(arg_0 -> ((class08571)class05911.t).N(arg_0)).orElseGet(() -> class05911.N((class05904)this.woodType));
        return new class08359(class003312.L(), class062602, class059132);
    }
}

