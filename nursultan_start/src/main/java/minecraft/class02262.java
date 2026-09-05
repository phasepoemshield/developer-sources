/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01235
 *  minecraft.class02649
 *  minecraft.class02661
 *  minecraft.class04499
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class06889
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00737;
import minecraft.class01235;
import minecraft.class02649;
import minecraft.class02661;
import minecraft.class04499;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;

public class class02262
extends class06581
implements class02661 {
    public static float N = 1.5f;

    public class02262(class06573 class065732) {
        super(class065732);
    }

    public class02649 N() {
        return class02649.N().N((class072102, class072112) -> class06758.N((class07210)class072102, (double)1.0, (class06889)class06889.L)).N(6.6666665f).y(1.0f).N(1051).N();
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065843 = class080362.method_5998(class070502);
        if (class072992 instanceof class04782) {
            class04782 class047823 = (class04782)class072992;
            class08005.N((class047822, class074382, class065842) -> new class04499(class080362, class072992, class080362.method_73189().N(), class080362.method_33571().y(), class080362.method_73189().L()), (class04782)class047823, (class06584)class065843, (class07438)class080362, (float)0.0f, (float)N, (float)1.0f);
        }
        class072992.method_43128(null, class080362.method_23317(), class080362.method_23318(), class080362.method_23321(), class04909.Ie, class04911.field_15254, 0.5f, 0.4f / (class072992.method_8409().z() * 0.4f + 0.8f));
        class080362.method_7259(class01235.L.y((Object)this));
        class065843.N(1, (class07438)class080362);
        return class07082.N;
    }

    public void N(class08005 class080052, double d, double d2, double d3, float f, float f2) {
    }

    public class08005 N(class07299 class072992, class00737 class007372, class06584 class065842, class07211 class072112) {
        class06069 class060692 = class072992.method_8409();
        double d = class060692.N((double)class072112.P(), 0.11485000000000001);
        double d2 = class060692.N((double)class072112.s(), 0.11485000000000001);
        double d3 = class060692.N((double)class072112.T(), 0.11485000000000001);
        class06889 class068892 = new class06889(d, d2, d3);
        class04499 class044992 = new class04499(class072992, class007372.N(), class007372.y(), class007372.L(), class068892);
        class044992.method_18799(class068892);
        return class044992;
    }
}

