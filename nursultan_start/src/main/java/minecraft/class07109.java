/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04995
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class04995;
import minecraft.class07536;

public class class07109 {
    public static final class07109 N = new class07109(0.0f, 0.0f);
    public static final class07109 y = new class07109(1.0f, 1.0f);
    public static final class07109 L = new class07109(1.0f, 0.0f);
    public static final class07109 u = new class07109(-1.0f, 0.0f);
    public static final class07109 i = new class07109(0.0f, 1.0f);
    public static final class07109 R = new class07109(0.0f, -1.0f);
    public static final class07109 M = new class07109(Float.MAX_VALUE, Float.MAX_VALUE);
    public static final class07109 B = new class07109(Float.MIN_VALUE, Float.MIN_VALUE);
    public static final Codec<class07109> Z = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)2).map(list -> new class07109(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue())), class071092 -> List.of(Float.valueOf(class071092.z), Float.valueOf(class071092.U)));
    public final float z;
    public final float U;

    public boolean L(class07109 class071092) {
        return this.z == class071092.z && this.U == class071092.U;
    }

    public float L() {
        return this.z * this.z + this.U * this.U;
    }

    public class07109(float f, float f2) {
        this.z = f;
        this.U = f2;
    }

    public class07109 u() {
        return new class07109(-this.z, -this.U);
    }

    public float u(class07109 class071092) {
        float f = class071092.z - this.z;
        float f2 = class071092.U - this.U;
        return f * f + f2 * f2;
    }

    public float y() {
        return class04995.N((float)(this.z * this.z + this.U * this.U));
    }

    public class07109 y(float f) {
        return new class07109(this.z + f, this.U + f);
    }

    public class07109 y(class07109 class071092) {
        return new class07109(this.z + class071092.z, this.U + class071092.U);
    }

    public class07109 N(float f) {
        return new class07109(this.z * f, this.U * f);
    }

    public class07109 N() {
        float f = class04995.N((float)(this.z * this.z + this.U * this.U));
        return f < 1.0E-4f ? N : new class07109(this.z / f, this.U / f);
    }

    public float N(class07109 class071092) {
        return this.z * class071092.z + this.U * class071092.U;
    }
}

