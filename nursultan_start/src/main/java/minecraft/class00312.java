/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03337
 *  org.joml.Matrix4f
 */
package minecraft;

import minecraft.class00284;
import minecraft.class03337;
import org.joml.Matrix4f;

public final class class00312
extends Enum<class00312> {
    public static final /* enum */ class00312 field_54953 = new class00312(class03337.N, (matrix4f, f) -> matrix4f.scale(1.0f - f / 4096.0f));
    public static final /* enum */ class00312 field_54954 = new class00312(class03337.L, (matrix4f, f) -> matrix4f.translate(0.0f, 0.0f, f / 512.0f));
    private final class03337 field_54955;
    private final class00284 field_54956;
    private static final /* synthetic */ class00312[] field_54957;

    private class00312(class03337 class033372, class00284 class002842) {
        this.field_54955 = class033372;
        this.field_54956 = class002842;
    }

    public static class00312[] values() {
        return (class00312[])field_54957.clone();
    }

    public static class00312 valueOf(String string) {
        return Enum.valueOf(class00312.class, string);
    }

    private static /* synthetic */ class00312[] y() {
        return new class00312[]{field_54953, field_54954};
    }

    public void N(Matrix4f matrix4f, float f) {
        this.field_54956.apply(matrix4f, f);
    }

    public class03337 N() {
        return this.field_54955;
    }

    static {
        field_54957 = class00312.y();
    }
}

