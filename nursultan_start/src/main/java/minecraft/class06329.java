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
 *  minecraft.class01766
 *  minecraft.class05908
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01766;
import minecraft.class05908;
import minecraft.class06332;
import minecraft.class06348;
import minecraft.class06353;
import minecraft.class07491;

public final class class06329
extends Record
implements class06348 {
    private final String name;
    public static final MapCodec<class06329> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("name").forGetter(class06329::L)).apply(instance, class06329::new));

    public String L() {
        return this.name;
    }

    public class06329(String string) {
        this.name = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06329.class, "name", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06329.class, "name", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06329.class, "name", "name"}, this);
    }

    @Override
    public Set<class07491<?>> y() {
        return Set.of();
    }

    @Override
    public class01766 N(class05908 class059082) {
        return class01766.N((String)this.name);
    }

    public static class06348 N(String string) {
        return new class06329(string);
    }

    @Override
    public class06353 N() {
        return class06332.y;
    }
}

