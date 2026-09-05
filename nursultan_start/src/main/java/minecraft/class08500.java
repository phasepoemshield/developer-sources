/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02968
 *  minecraft.class06846
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02968;
import minecraft.class06846;

public final class class08500
extends Record {
    private final boolean blur;
    private final boolean clamp;
    private final class06846 mipmapStrategy;
    private final float alphaCutoffBias;
    public static final boolean N = false;
    public static final boolean y = false;
    public static final float L = 0.0f;
    public static final Codec<class08500> u = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("blur", (Object)false).forGetter(class08500::N), (App)Codec.BOOL.optionalFieldOf("clamp", (Object)false).forGetter(class08500::y), (App)class06846.field_64081.optionalFieldOf("mipmap_strategy", (Object)class06846.field_64076).forGetter(class08500::L), (App)Codec.FLOAT.optionalFieldOf("alpha_cutoff_bias", (Object)Float.valueOf(0.0f)).forGetter(class08500::u)).apply(instance, class08500::new));
    public static final class02968<class08500> i = new class02968("texture", u);

    public class06846 L() {
        return this.mipmapStrategy;
    }

    public class08500(boolean bl, boolean bl2, class06846 class068462, float f) {
        this.blur = bl;
        this.clamp = bl2;
        this.mipmapStrategy = class068462;
        this.alphaCutoffBias = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08500.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "blur", "clamp", "mipmapStrategy", "alphaCutoffBias"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08500.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "blur", "clamp", "mipmapStrategy", "alphaCutoffBias"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08500.class, "blur;clamp;mipmapStrategy;alphaCutoffBias", "blur", "clamp", "mipmapStrategy", "alphaCutoffBias"}, this);
    }

    public float u() {
        return this.alphaCutoffBias;
    }

    public boolean y() {
        return this.clamp;
    }

    public boolean N() {
        return this.blur;
    }
}

