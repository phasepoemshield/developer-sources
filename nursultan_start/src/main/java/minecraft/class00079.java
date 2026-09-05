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

public final class class00079
extends Record
implements class00069 {
    private final int value;
    public static final Codec<class00079> y = Codec.INT.xmap(class00079::new, class00079::y);

    public class00079(int n) {
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00079.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00079.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00079.class, "value", "value"}, this);
    }

    public int y() {
        return this.value;
    }

    @Override
    public void N(Std140SizeCalculator std140SizeCalculator) {
        std140SizeCalculator.putInt();
    }

    @Override
    public void N(Std140Builder std140Builder) {
        std140Builder.putInt(this.value);
    }

    @Override
    public class00051 N() {
        return class00051.field_60135;
    }
}

