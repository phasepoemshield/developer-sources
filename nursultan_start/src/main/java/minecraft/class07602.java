/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class class07602
extends Record {
    final float x1;
    final float y1;
    final float x2;
    final float y2;
    public static final Codec<class07602> i = Codec.FLOAT.listOf(4, 4).xmap(list -> new class07602(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue(), ((Float)list.get(2)).floatValue(), ((Float)list.get(3)).floatValue()), class076022 -> List.of(Float.valueOf(class076022.x1), Float.valueOf(class076022.y1), Float.valueOf(class076022.x2), Float.valueOf(class076022.y2))).validate(class07602::i);

    public float L() {
        return this.x2;
    }

    public class07602(float f, float f2, float f3, float f4) {
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07602.class, "x1;y1;x2;y2", "x1", "y1", "x2", "y2"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07602.class, "x1;y1;x2;y2", "x1", "y1", "x2", "y2"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07602.class, "x1;y1;x2;y2", "x1", "y1", "x2", "y2"}, this);
    }

    private DataResult<class07602> i() {
        if (this.x1 < 0.0f || this.x1 > 1.0f) {
            return DataResult.error(() -> "x1 must be in range [0; 1]");
        }
        if (this.x2 < 0.0f || this.x2 > 1.0f) {
            return DataResult.error(() -> "x2 must be in range [0; 1]");
        }
        return DataResult.success((Object)((Object)this));
    }

    public float u() {
        return this.y2;
    }

    public float y() {
        return this.y1;
    }

    public float N() {
        return this.x1;
    }
}

