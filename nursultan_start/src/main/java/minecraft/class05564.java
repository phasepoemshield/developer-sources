/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08464
 */
package minecraft;

import java.util.Map;
import java.util.function.UnaryOperator;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08464;

public class class05564
extends class06078<class08464> {
    public static final class02415 N = class05564::N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;

    public class05564(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.M = class016862.y("right_chest");
        this.B = class016862.y("left_chest");
        this.L = class016862.y("right_hind_leg");
        this.u = class016862.y("left_hind_leg");
        this.i = class016862.y("right_front_leg");
        this.R = class016862.y("left_front_leg");
    }

    public static class04806 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-2.0f, -14.0f, -10.0f, 4.0f, 4.0f, 9.0f, class048342).N(0, 14).N("neck", -4.0f, -16.0f, -6.0f, 8.0f, 18.0f, 6.0f, class048342).N(17, 0).N("ear", -4.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, class048342).N(17, 0).N("ear", 1.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, class048342), class04838.N((float)0.0f, (float)7.0f, (float)-6.0f));
        class048392.N("body", class04822.L().N(29, 0).N(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f, class048342), class04838.N((float)0.0f, (float)5.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N("right_chest", class04822.L().N(45, 28).N(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, class048342), class04838.N((float)-8.5f, (float)3.0f, (float)3.0f, (float)0.0f, (float)1.5707964f, (float)0.0f));
        class048392.N("left_chest", class04822.L().N(45, 41).N(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, class048342), class04838.N((float)5.5f, (float)3.0f, (float)3.0f, (float)0.0f, (float)1.5707964f, (float)0.0f));
        int n = 4;
        int n2 = 14;
        class04822 class048222 = class04822.L().N(29, 29).N(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, class048342);
        class048392.N("right_hind_leg", class048222, class04838.N((float)-3.5f, (float)10.0f, (float)6.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)3.5f, (float)10.0f, (float)6.0f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-3.5f, (float)10.0f, (float)-5.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)3.5f, (float)10.0f, (float)-5.0f));
        return class04806.N((class04792)class047922, (int)128, (int)64);
    }

    public void method_2819(class08464 class084642) {
        super.method_2819((Object)class084642);
        this.y.i = class084642.h * ((float)Math.PI / 180);
        this.y.R = class084642.D * ((float)Math.PI / 180);
        float f = class084642.Ny;
        float f2 = class084642.NN;
        this.L.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f;
        this.u.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f;
        this.i.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f;
        this.R.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f;
        this.M.U = class084642.y;
        this.B.U = class084642.y;
    }

    private static class04792 N(class04792 class047922) {
        float f = 2.0f;
        float f2 = 0.7f;
        float f3 = 1.1f;
        UnaryOperator unaryOperator = class048382 -> class048382.L(0.0f, 21.0f, 3.52f).u(0.71428573f, 0.64935064f, 0.7936508f);
        UnaryOperator unaryOperator2 = class048382 -> class048382.L(0.0f, 33.0f, 0.0f).u(0.625f, 0.45454544f, 0.45454544f);
        UnaryOperator unaryOperator3 = class048382 -> class048382.L(0.0f, 33.0f, 0.0f).u(0.45454544f, 0.41322312f, 0.45454544f);
        class04792 class047923 = new class04792();
        for (Map.Entry entry : class047922.N().y()) {
            String string = (String)entry.getKey();
            class04839 class048392 = (class04839)entry.getValue();
            UnaryOperator unaryOperator4 = switch (string) {
                case "head" -> unaryOperator;
                case "body" -> unaryOperator2;
                default -> unaryOperator3;
            };
            class047923.N().N(string, class048392.N(unaryOperator4));
        }
        return class047923;
    }
}

