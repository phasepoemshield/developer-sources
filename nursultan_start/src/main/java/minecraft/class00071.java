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
 *  org.joml.Vector3fc
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
import org.joml.Vector3fc;

public final class class00071
extends Record
implements class00069 {
    private final Vector3fc value;
    public static final Codec<class00071> y = class06338.i.xmap(class00071::new, class00071::y);

    public class00071(Vector3fc vector3fc) {
        this.value = vector3fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00071.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00071.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00071.class, "value", "value"}, this);
    }

    public Vector3fc y() {
        return this.value;
    }

    @Override
    public void N(Std140SizeCalculator std140SizeCalculator) {
        std140SizeCalculator.putVec3();
    }

    @Override
    public void N(Std140Builder std140Builder) {
        std140Builder.putVec3(this.value);
    }

    @Override
    public class00051 N() {
        return class00051.field_60139;
    }
}

