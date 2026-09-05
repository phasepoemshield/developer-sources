/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02435
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01894;
import minecraft.class02435;
import minecraft.class06338;

public final class class02412
extends Record
implements class02435 {
    private final String samplerName;
    private final class01894 location;
    private final int width;
    private final int height;
    private final boolean bilinear;
    public static final Codec<class02412> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("sampler_name").forGetter(class02412::N), (App)class01894.N.fieldOf("location").forGetter(class02412::L), (App)class06338.b.fieldOf("width").forGetter(class02412::u), (App)class06338.b.fieldOf("height").forGetter(class02412::i), (App)Codec.BOOL.optionalFieldOf("bilinear", (Object)false).forGetter(class02412::R)).apply(instance, class02412::new));

    public class01894 L() {
        return this.location;
    }

    public class02412(String string, class01894 class018942, int n, int n2, boolean bl) {
        this.samplerName = string;
        this.location = class018942;
        this.width = n;
        this.height = n2;
        this.bilinear = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02412.class, "samplerName;location;width;height;bilinear", "samplerName", "location", "width", "height", "bilinear"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02412.class, "samplerName;location;width;height;bilinear", "samplerName", "location", "width", "height", "bilinear"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02412.class, "samplerName;location;width;height;bilinear", "samplerName", "location", "width", "height", "bilinear"}, this);
    }

    public int i() {
        return this.height;
    }

    public int u() {
        return this.width;
    }

    public Set<class01894> y() {
        return Set.of();
    }

    public String N() {
        return this.samplerName;
    }

    public boolean R() {
        return this.bilinear;
    }
}

