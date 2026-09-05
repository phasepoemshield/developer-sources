/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class08441
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08441;

public class class06047<T extends class08441>
extends class06078<T> {
    public static final class02415 y = new class02441(true, 10.0f, 4.0f, Set.of("head"));
    private static final float N = 0.0f;
    private static final float m = 16.0f;
    private static final float P = -9.0f;
    protected static final float L = 18.0f;
    protected static final float u = 5.0f;
    protected static final float i = 14.1f;
    private static final float s = -5.0f;
    private static final String T = "tail1";
    private static final String b = "tail2";
    protected final class01686 R;
    protected final class01686 M;
    protected final class01686 B;
    protected final class01686 Z;
    protected final class01686 z;
    protected final class01686 U;
    protected final class01686 E;
    protected final class01686 W;

    public class06047(class01686 class016862) {
        super(class016862);
        this.E = class016862.y("head");
        this.W = class016862.y("body");
        this.z = class016862.y(T);
        this.U = class016862.y(b);
        this.R = class016862.y("left_hind_leg");
        this.M = class016862.y("right_hind_leg");
        this.B = class016862.y("left_front_leg");
        this.Z = class016862.y("right_front_leg");
    }

    public static class04792 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04834 class048343 = new class04834(-0.02f);
        class048392.N("head", class04822.L().N("main", -2.5f, -2.0f, -3.0f, 5.0f, 4.0f, 5.0f, class048342).N("nose", -1.5f, -0.001f, -4.0f, 3, 2, 2, class048342, 0, 24).N("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2, class048342, 0, 10).N("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2, class048342, 6, 10), class04838.N((float)0.0f, (float)15.0f, (float)-9.0f));
        class048392.N("body", class04822.L().N(20, 0).N(-2.0f, 3.0f, -8.0f, 4.0f, 16.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)12.0f, (float)-10.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N(T, class04822.L().N(0, 15).N(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, class048342), class04838.N((float)0.0f, (float)15.0f, (float)8.0f, (float)0.9f, (float)0.0f, (float)0.0f));
        class048392.N(b, class04822.L().N(4, 15).N(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, class048343), class04838.N((float)0.0f, (float)20.0f, (float)14.0f));
        class04822 class048222 = class04822.L().N(8, 13).N(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, class048342);
        class048392.N("left_hind_leg", class048222, class04838.N((float)1.1f, (float)18.0f, (float)5.0f));
        class048392.N("right_hind_leg", class048222, class04838.N((float)-1.1f, (float)18.0f, (float)5.0f));
        class04822 class048223 = class04822.L().N(40, 0).N(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, class048342);
        class048392.N("left_front_leg", class048223, class04838.N((float)1.2f, (float)14.1f, (float)-5.0f));
        class048392.N("right_front_leg", class048223, class04838.N((float)-1.2f, (float)14.1f, (float)-5.0f));
        return class047922;
    }

    public void method_2819(T t) {
        super.method_2819(t);
        float f = ((class08441)t).Nu;
        if (((class08441)t).u) {
            this.W.L += 1.0f * f;
            this.E.L += 2.0f * f;
            this.z.L += 1.0f * f;
            this.U.L += -4.0f * f;
            this.U.u += 2.0f * f;
            this.z.i = 1.5707964f;
            this.U.i = 1.5707964f;
        } else if (((class08441)t).i) {
            this.U.L = this.z.L;
            this.U.u += 2.0f * f;
            this.z.i = 1.5707964f;
            this.U.i = 1.5707964f;
        }
        this.E.i = ((class08441)t).h * ((float)Math.PI / 180);
        this.E.R = ((class08441)t).D * ((float)Math.PI / 180);
        if (!((class08441)t).R) {
            this.W.i = 1.5707964f;
            float f2 = ((class08441)t).Ny;
            float f3 = ((class08441)t).NN;
            if (((class08441)t).i) {
                this.R.i = class04995.P((double)(f3 * 0.6662f)) * f2;
                this.M.i = class04995.P((double)(f3 * 0.6662f + 0.3f)) * f2;
                this.B.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI + 0.3f)) * f2;
                this.Z.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * f2;
                this.U.i = 1.7278761f + 0.31415927f * class04995.P((double)f3) * f2;
            } else {
                this.R.i = class04995.P((double)(f3 * 0.6662f)) * f2;
                this.M.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * f2;
                this.B.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * f2;
                this.Z.i = class04995.P((double)(f3 * 0.6662f)) * f2;
                this.U.i = !((class08441)t).u ? 1.7278761f + 0.7853982f * class04995.P((double)f3) * f2 : 1.7278761f + 0.47123894f * class04995.P((double)f3) * f2;
            }
        }
        if (((class08441)t).R) {
            this.W.i = 0.7853982f;
            this.W.L += -4.0f * f;
            this.W.u += 5.0f * f;
            this.E.L += -3.3f * f;
            this.E.u += 1.0f * f;
            this.z.L += 8.0f * f;
            this.z.u += -2.0f * f;
            this.U.L += 2.0f * f;
            this.U.u += -0.8f * f;
            this.z.i = 1.7278761f;
            this.U.i = 2.670354f;
            this.B.i = -0.15707964f;
            this.B.L += 2.0f * f;
            this.B.u -= 2.0f * f;
            this.Z.i = -0.15707964f;
            this.Z.L += 2.0f * f;
            this.Z.u -= 2.0f * f;
            this.R.i = -1.5707964f;
            this.R.L += 3.0f * f;
            this.R.u -= 4.0f * f;
            this.M.i = -1.5707964f;
            this.M.L += 3.0f * f;
            this.M.u -= 4.0f * f;
        }
        if (((class08441)t).M > 0.0f) {
            this.E.M = class04995.Z((float)((class08441)t).M, (float)this.E.M, (float)-1.2707963f);
            this.E.R = class04995.Z((float)((class08441)t).M, (float)this.E.R, (float)1.2707963f);
            this.B.i = -1.2707963f;
            this.Z.i = -0.47079635f;
            this.Z.M = -0.2f;
            this.Z.y += f;
            this.R.i = -0.4f;
            this.M.i = 0.5f;
            this.M.M = -0.5f;
            this.M.y += 0.8f * f;
            this.M.L += 2.0f * f;
            this.z.i = class04995.Z((float)((class08441)t).B, (float)this.z.i, (float)0.8f);
            this.U.i = class04995.Z((float)((class08441)t).B, (float)this.U.i, (float)-0.4f);
        }
        if (((class08441)t).Z > 0.0f) {
            this.E.i = class04995.Z((float)((class08441)t).Z, (float)this.E.i, (float)-0.58177644f);
        }
    }
}

