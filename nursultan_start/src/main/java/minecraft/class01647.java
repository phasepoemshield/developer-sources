/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01650;
import minecraft.class01655;
import minecraft.class06338;

public final class class01647
extends Record
implements class01650 {
    private final int width;
    private final int height;
    public static final MapCodec<class01647> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.b.fieldOf("width").forGetter(class01647::y), (App)class06338.b.fieldOf("height").forGetter(class01647::L)).apply(instance, class01647::new));

    public int L() {
        return this.height;
    }

    public class01647(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01647.class, "width;height", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01647.class, "width;height", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01647.class, "width;height", "width", "height"}, this);
    }

    public int y() {
        return this.width;
    }

    @Override
    public class01655 N() {
        return class01655.field_45657;
    }
}

