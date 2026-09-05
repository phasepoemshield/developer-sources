/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  org.joml.Vector4fc
 */
package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00051;
import minecraft.class00069;
import minecraft.class06338;
import org.joml.Vector4fc;

public final class class00088
extends Record
implements class00069 {
    private final Vector4fc value;
    public static final Codec<class00088> y = class06338.M.xmap(class00088::new, class00088::y);

    public class00088(Vector4fc vector4fc) {
        this.value = vector4fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00088.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00088.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00088.class, "value", "value"}, this);
    }

    public Vector4fc y() {
        return this.value;
    }

    @Override
    public void N(Std140SizeCalculator std140SizeCalculator) {
        std140SizeCalculator.putVec4();
    }

    @Override
    public void N(Std140Builder std140Builder) {
        std140Builder.putVec4(this.value);
    }

    @Override
    public class00051 N() {
        return class00051.field_60140;
    }
}

