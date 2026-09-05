/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00674;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class00655
extends class00891 {
    public static final MapCodec<class00655> N = class00655.y(class00655::new);
    public static final class06667 y = class06665.o;

    public class00655(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (!class065842.N(class06570.sf) && !class065842.N(class06570.GZ)) {
            return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
        }
        if (class00655.N(class072992, class072092, (class07438)class080362)) {
            class072992.method_8652(class072092, class00869.N.W(), 11);
            class06581 class065812 = class065842.B();
            if (class065842.N(class06570.sf)) {
                class065842.N(1, (class07438)class080362, class070502.N());
            } else {
                class065842.N(1, (class07438)class080362);
            }
            class080362.method_7259(class01235.L.y((Object)class065812));
        } else if (class072992 instanceof class04782 && !((Boolean)((class04782)class072992).method_64395().N(class07305.Nu)).booleanValue()) {
            class080362.method_7353((class00392)class00392.L((String)"block.minecraft.tnt.disabled"), true);
            return class07082.i;
        }
        return class07082.N;
    }

    protected void N(class07299 class072992, class00500 class005002, class06183 class061832, class08005 class080052) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class07209 class072092 = class061832.u();
            class07049 class070492 = class080052.z();
            if (class080052.method_5809() && class080052.method_36971(class047822, class072092) && class00655.N(class072992, class072092, class070492 instanceof class07438 ? (class07438)class070492 : null)) {
                class072992.method_8650(class072092, false);
            }
        }
    }

    private static boolean N(class07299 class072992, class07209 class072092, @Nullable class07438 class074382) {
        if (!(class072992 instanceof class04782) || !((Boolean)((class04782)class072992).method_64395().N(class07305.Nu)).booleanValue()) {
            return false;
        }
        class00674 class006742 = new class00674(class072992, (double)class072092.method_10263() + 0.5, class072092.method_10264(), (double)class072092.method_10260() + 0.5, class074382);
        class072992.method_8649((class07049)class006742);
        class072992.method_43128(null, class006742.method_23317(), class006742.method_23318(), class006742.method_23321(), class04909.Qp, class04911.field_15245, 1.0f, 1.0f);
        class072992.N((class07049)class074382, (class03556)class01194.q, class072092);
        return true;
    }

    public boolean N(class07307 class073072) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public MapCodec<class00655> N() {
        return N;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        if (class072992.W(class072092) && class00655.N(class072992, class072092)) {
            class072992.method_8650(class072092, false);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.W(class072092) && class00655.N(class072992, class072092)) {
            class072992.method_8650(class072092, false);
        }
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        if (!class072992.method_8608() && !class080362.method_31549().u && ((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class00655.N(class072992, class072092);
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    public void N_5(class04782 class047822, class07209 class072092, class07307 class073072) {
        if (!((Boolean)class047822.method_64395().N(class07305.Nu)).booleanValue()) {
            return;
        }
        class00674 class006742 = new class00674((class07299)class047822, (double)class072092.method_10263() + 0.5, class072092.method_10264(), (double)class072092.method_10260() + 0.5, class073072.L());
        int n = class006742.y();
        class006742.N((short)(class047822.field_9229.y(n / 4) + n / 8));
        class047822.method_8649((class07049)class006742);
    }

    public static boolean N(class07299 class072992, class07209 class072092) {
        return class00655.N(class072992, class072092, null);
    }
}

