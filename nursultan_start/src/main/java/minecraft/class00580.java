/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01609
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class07536
 *  minecraft.class08652
 *  org.joml.Matrix3x2f
 *  org.joml.Vector2f
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00575;
import minecraft.class00577;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01609;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class07536;
import minecraft.class08652;
import org.joml.Matrix3x2f;
import org.joml.Vector2f;

public interface class00580 {
    public static final double N = 0.5;
    public static final double y = 3.0;

    default public void N(class00392 class003922, int n, int n2, int n3, int n4) {
        this.N(class003922, (n + n2) / 2, n, n2, n3, n4);
    }

    default public void N(class00392 class003922, int n, int n2, int n3, int n4, int n5) {
        this.N(class003922, n, n2, n3, n4, n5, this.N());
    }

    public void N(class00392 var1, int var2, int var3, int var4, int var5, int var6, class00577 var7);

    default public void N(class00937 class009372, int n, int n2, class01028 class010282) {
        this.N(class009372, n, n2, this.N(), class010282);
    }

    default public void N(class00392 class003922, int n, int n2, int n3, int n4, int n5, int n6, int n7, class00577 class005772) {
        int n8 = (n4 + n5 - n7) / 2 + 1;
        int n9 = n3 - n2;
        if (n6 > n9) {
            int n10 = n6 - n9;
            double d = (double)class07536.L() / 1000.0;
            double d2 = Math.max((double)n10 * 0.5, 3.0);
            double d3 = class04995.u((double)(Math.sin(1.5707963267948966 * Math.cos(Math.PI * 2 * d / d2)) / 2.0 + 0.5), (double)0.0, (double)n10);
            class00577 class005773 = class005772.N(n2, n3, n4, n5);
            this.N(class00937.field_62009, n2 - (int)d3, n8, class005773, class003922.method_30937());
        } else {
            int n11 = class04995.N((int)n, (int)(n2 + n6 / 2), (int)(n3 - n6 / 2));
            this.N(class00937.field_62010, n11, n8, class003922);
        }
    }

    public static void N(class08652 class086522, float f, float f2, Consumer<class00405> consumer) {
        class03255 class032552 = class086522.comp_4274();
        if (class032552 == null || !class032552.N((int)f, (int)f2)) {
            return;
        }
        Vector2f vector2f = class086522.L.invert(new Matrix3x2f()).transformPosition(new Vector2f(f, f2));
        float f3 = vector2f.x();
        float f4 = vector2f.y();
        class086522.N().N((class01609)new class00575(f3, f4, consumer));
    }

    public static boolean N(float f, float f2, float f3, float f4, float f5, float f6) {
        return f >= f3 && f < f5 && f2 >= f4 && f2 < f6;
    }

    default public void N(int n, int n2, class00392 class003922) {
        this.N(class00937.field_62009, n, n2, this.N(), class003922.method_30937());
    }

    default public void N(int n, int n2, class01028 class010282) {
        this.N(class00937.field_62009, n, n2, this.N(), class010282);
    }

    public void N(class00577 var1);

    public class00577 N();

    default public void N(class00937 class009372, int n, int n2, class00577 class005772, class00392 class003922) {
        this.N(class009372, n, n2, class005772, class003922.method_30937());
    }

    public void N(class00937 var1, int var2, int var3, class00577 var4, class01028 var5);

    default public void N(class00937 class009372, int n, int n2, class00392 class003922) {
        this.N(class009372, n, n2, class003922.method_30937());
    }
}

