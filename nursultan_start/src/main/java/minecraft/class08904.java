/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11666
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08350
 *  minecraft.class08895
 */
package minecraft;

import Nursultan.class11666;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class08350;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import minecraft.class08913;

public final class class08904
extends Record
implements class08895 {
    private final List<class08895> models;
    public static final MapCodec<class08904> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08913.y.listOf().fieldOf("models").forGetter(class08904::N)).apply(instance, class08904::new));

    public class08904(List<class08895> list) {
        this.models = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08904.class, "models", "models"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08904.class, "models", "models"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08904.class, "models", "models"}, this);
    }

    public List<class08895> N() {
        return this.models;
    }

    public void method_62326(class08350 class083502) {
        Iterator<class08895> iterator = this.models.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_62326(class083502);
        }
    }

    public MapCodec<class08904> method_65585() {
        return N;
    }

    public class08910 method_65587(class08905 class089052) {
        return new class11666(this.models.stream().map(class088952 -> class088952.method_65587(class089052)).toList());
    }
}

