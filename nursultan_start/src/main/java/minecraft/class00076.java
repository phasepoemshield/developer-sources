/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00051;
import minecraft.class00069;

public final class class00076
extends Record
implements class00069 {
    private final float value;
    public static final Codec<class00076> y = Codec.FLOAT.xmap(class00076::new, class00076::y);

    public class00076(float f) {
        this.value = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00076.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00076.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00076.class, "value", "value"}, this);
    }

    public float y() {
        return this.value;
    }

    @Override
    public void N(Std140SizeCalculator std140SizeCalculator) {
        std140SizeCalculator.putFloat();
    }

    @Override
    public void N(Std140Builder std140Builder) {
        std140Builder.putFloat(this.value);
    }

    @Override
    public class00051 N() {
        return class00051.field_60137;
    }
}

