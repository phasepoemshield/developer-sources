/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04839
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04839;

public final class class02441
extends Record
implements class02415 {
    private final boolean scaleHead;
    private final float babyYHeadOffset;
    private final float babyZHeadOffset;
    private final float babyHeadScale;
    private final float babyBodyScale;
    private final float bodyYOffset;
    private final Set<String> headParts;

    public float L() {
        return this.babyZHeadOffset;
    }

    public Set<String> M() {
        return this.headParts;
    }

    public class02441(Set<String> set) {
        this(false, 5.0f, 2.0f, set);
    }

    public class02441(boolean bl, float f, float f2, float f3, float f4, float f5, Set<String> set) {
        this.scaleHead = bl;
        this.babyYHeadOffset = f;
        this.babyZHeadOffset = f2;
        this.babyHeadScale = f3;
        this.babyBodyScale = f4;
        this.bodyYOffset = f5;
        this.headParts = set;
    }

    public class02441(boolean bl, float f, float f2, Set<String> set) {
        this(bl, f, f2, 2.0f, 2.0f, 24.0f, set);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02441.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "scaleHead", "babyYHeadOffset", "babyZHeadOffset", "babyHeadScale", "babyBodyScale", "bodyYOffset", "headParts"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02441.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "scaleHead", "babyYHeadOffset", "babyZHeadOffset", "babyHeadScale", "babyBodyScale", "bodyYOffset", "headParts"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02441.class, "scaleHead;babyYHeadOffset;babyZHeadOffset;babyHeadScale;babyBodyScale;bodyYOffset;headParts", "scaleHead", "babyYHeadOffset", "babyZHeadOffset", "babyHeadScale", "babyBodyScale", "bodyYOffset", "headParts"}, this);
    }

    public class04792 apply(class04792 class047922) {
        float f = this.scaleHead ? 1.5f / this.babyHeadScale : 1.0f;
        float f2 = 1.0f / this.babyBodyScale;
        UnaryOperator unaryOperator = class048382 -> class048382.L(0.0f, this.babyYHeadOffset, this.babyZHeadOffset).y(f);
        UnaryOperator unaryOperator2 = class048382 -> class048382.L(0.0f, this.bodyYOffset, 0.0f).y(f2);
        class04792 class047923 = new class04792();
        for (Map.Entry entry : class047922.N().y()) {
            String string = (String)entry.getKey();
            class04839 class048392 = (class04839)entry.getValue();
            class047923.N().N(string, class048392.N(this.headParts.contains(string) ? unaryOperator : unaryOperator2));
        }
        return class047923;
    }

    public float i() {
        return this.babyBodyScale;
    }

    public float u() {
        return this.babyHeadScale;
    }

    public float y() {
        return this.babyYHeadOffset;
    }

    public boolean N() {
        return this.scaleHead;
    }

    public float R() {
        return this.bodyYOffset;
    }
}

