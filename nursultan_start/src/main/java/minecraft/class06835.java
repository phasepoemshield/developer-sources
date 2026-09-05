/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.joml.Matrix4f
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07536;
import org.joml.Matrix4f;

public class class06835 {
    public static final double N = 8.0;
    private final String R;
    private final Supplier<Matrix4f> M;
    public static final class06835 y = new class06835("default_texturing", Matrix4f::new);
    public static final class06835 L = new class06835("glint_texturing", () -> class06835.N(8.0f));
    public static final class06835 u = new class06835("entity_glint_texturing", () -> class06835.N(0.5f));
    public static final class06835 i = new class06835("armor_entity_glint_texturing", () -> class06835.N(0.16f));

    public class06835(String string, Supplier<Matrix4f> supplier) {
        this.R = string;
        this.M = supplier;
    }

    public String toString() {
        return "TexturingStateShard[" + this.R + "]";
    }

    private static Matrix4f N(float f) {
        long l = (long)((double)class07536.L() * (Double)((class05630)class06202.Nq().i_7).Ng().method_41753() * 8.0);
        float f2 = (float)(l % 110000L) / 110000.0f;
        float f3 = (float)(l % 30000L) / 30000.0f;
        Matrix4f matrix4f = new Matrix4f().translation(-f2, f3, 0.0f);
        matrix4f.rotateZ(0.17453292f).scale(f);
        return matrix4f;
    }

    public Matrix4f N() {
        return this.M.get();
    }
}

