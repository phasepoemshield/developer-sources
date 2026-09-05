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
 *  org.joml.Vector2fc
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
import org.joml.Vector2fc;

public final class class00078
extends Record
implements class00069 {
    private final Vector2fc value;
    public static final Codec<class00078> y = class06338.u.xmap(class00078::new, class00078::y);

    public class00078(Vector2fc vector2fc) {
        this.value = vector2fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00078.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00078.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00078.class, "value", "value"}, this);
    }

    public Vector2fc y() {
        return this.value;
    }

    @Override
    public void N(Std140SizeCalculator std140SizeCalculator) {
        std140SizeCalculator.putVec2();
    }

    @Override
    public void N(Std140Builder std140Builder) {
        std140Builder.putVec2(this.value);
    }

    @Override
    public class00051 N() {
        return class00051.field_60138;
    }
}

