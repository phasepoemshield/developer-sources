/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02195
 *  minecraft.class03556
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02195;
import minecraft.class03556;

public final class class02685
extends Record {
    private final class03556<class02195> type;
    private final double x;
    private final double z;
    private final float rotation;
    public static final Codec<class02685> N = RecordCodecBuilder.create(instance -> instance.group((App)class02195.y.fieldOf("type").forGetter(class02685::N), (App)Codec.DOUBLE.fieldOf("x").forGetter(class02685::y), (App)Codec.DOUBLE.fieldOf("z").forGetter(class02685::L), (App)Codec.FLOAT.fieldOf("rotation").forGetter(class02685::u)).apply(instance, class02685::new));

    public double L() {
        return this.z;
    }

    public class02685(class03556<class02195> class035562, double d, double d2, float f) {
        this.type = class035562;
        this.x = d;
        this.z = d2;
        this.rotation = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02685.class, "type;x;z;rotation", "type", "x", "z", "rotation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02685.class, "type;x;z;rotation", "type", "x", "z", "rotation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02685.class, "type;x;z;rotation", "type", "x", "z", "rotation"}, this);
    }

    public float u() {
        return this.rotation;
    }

    public double y() {
        return this.x;
    }

    public class03556<class02195> N() {
        return this.type;
    }
}

