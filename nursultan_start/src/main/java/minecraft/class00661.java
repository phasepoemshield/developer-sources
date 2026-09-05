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
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class06338;

public final class class00661
extends Record
implements class00647 {
    private final int page;
    public static final MapCodec<class00661> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.b.fieldOf("page").forGetter(class00661::y)).apply(instance, class00661::new));

    public class00661(int n) {
        this.page = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00661.class, "page", "page"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00661.class, "page", "page"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00661.class, "page", "page"}, this);
    }

    public int y() {
        return this.page;
    }

    @Override
    public class00654 N() {
        return class00654.field_11748;
    }
}

