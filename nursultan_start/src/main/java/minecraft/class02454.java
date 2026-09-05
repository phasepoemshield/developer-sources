/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02058
 *  minecraft.class03127
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08792
 *  org.joml.Quaternionf
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02058;
import minecraft.class03127;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08792;
import org.joml.Quaternionf;

public class class02454
extends class06078<class08792> {
    private static final String i = "outer_glass";
    private static final String R = "inner_glass";
    private static final String M = "base";
    private static final float B = (float)Math.sin(0.7853981633974483);
    public final class01686 N;
    public final class01686 y;
    public final class01686 L;
    public final class01686 u;

    public class02454(class01686 class016862) {
        super(class016862);
        this.N = class016862.y(M);
        this.y = class016862.y(i);
        this.L = this.y.y(R);
        this.u = this.L.y("cube");
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 0.875f;
        class04822 class048222 = class04822.L().N(0, 0).N(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        class048392.N(i, class048222, class04838.N((float)0.0f, (float)24.0f, (float)0.0f)).N(R, class048222, class04838.N.N(0.875f)).N("cube", class04822.L().N(32, 0).N(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N.N(0.765625f));
        class048392.N(M, class04822.L().N(0, 16).N(-6.0f, 0.0f, -6.0f, 12.0f, 4.0f, 12.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    public void method_2819(class08792 class087922) {
        super.method_2819((Object)class087922);
        this.N.U = class087922.N;
        float f = class087922.P * 3.0f;
        float f2 = class03127.N((float)class087922.P) * 16.0f;
        this.y.L += f2 / 2.0f;
        this.y.N(class02058.u.N(f).rotateAxis(1.0471976f, B, 0.0f, B));
        this.L.N(new Quaternionf().setAngleAxis(1.0471976f, B, 0.0f, B).rotateY(f * ((float)Math.PI / 180)));
        this.u.N(new Quaternionf().setAngleAxis(1.0471976f, B, 0.0f, B).rotateY(f * ((float)Math.PI / 180)));
    }
}

