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
 *  minecraft.class04206
 *  minecraft.class07468
 *  minecraft.class07471
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class07468;
import minecraft.class07471;

public final class class07433
extends Record {
    private final class03556<class07468> attribute;
    final double baseValue;
    final List<class07471> modifiers;
    public static final Codec<class07433> L = RecordCodecBuilder.create(instance -> instance.group((App)class04206.v.b().fieldOf("id").forGetter(class07433::N), (App)Codec.DOUBLE.fieldOf("base").orElse((Object)0.0).forGetter(class07433::y), (App)class07471.y.listOf().optionalFieldOf("modifiers", List.of()).forGetter(class07433::L)).apply(instance, class07433::new));
    public static final Codec<List<class07433>> u = L.listOf();

    public List<class07471> L() {
        return this.modifiers;
    }

    public class07433(class03556<class07468> class035562, double d, List<class07471> list) {
        this.attribute = class035562;
        this.baseValue = d;
        this.modifiers = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07433.class, "attribute;baseValue;modifiers", "attribute", "baseValue", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07433.class, "attribute;baseValue;modifiers", "attribute", "baseValue", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07433.class, "attribute;baseValue;modifiers", "attribute", "baseValue", "modifiers"}, this);
    }

    public double y() {
        return this.baseValue;
    }

    public class03556<class07468> N() {
        return this.attribute;
    }
}

