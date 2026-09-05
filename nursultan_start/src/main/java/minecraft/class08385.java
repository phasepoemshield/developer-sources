/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00981
 *  minecraft.class00985
 *  minecraft.class01028
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01583
 *  minecraft.class01590
 *  minecraft.class02058
 *  minecraft.class02566
 *  minecraft.class03358
 *  minecraft.class03610
 *  minecraft.class04453
 *  minecraft.class04811
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class05904
 *  minecraft.class05913
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06244
 *  minecraft.class06260
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07036
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07267
 *  minecraft.class07311
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00981;
import minecraft.class00985;
import minecraft.class01028;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01583;
import minecraft.class01590;
import minecraft.class02058;
import minecraft.class02566;
import minecraft.class03358;
import minecraft.class03610;
import minecraft.class04453;
import minecraft.class04811;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class05904;
import minecraft.class05913;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06244;
import minecraft.class06260;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07036;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07267;
import minecraft.class07311;
import minecraft.class08097;
import minecraft.class08141;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public abstract class class08385
implements class03358<class07267, class00981> {
    private static final int N = -988212;
    private static final int y = class04995.Z((int)16);
    private final class01590 L;
    private final class08097 u;

    protected abstract class06889 L();

    public class08385(class04811 class048112) {
        this.L = class048112.M();
        this.u = class048112.B();
    }

    public class00981 i() {
        return new class00981();
    }

    protected abstract float y();

    public void N(class07267 class072672, class00981 class009812, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class072672, (class00985)class009812, f, class068892, class081412);
        class009812.u = class072672.M();
        class009812.L = class072672.R();
        class009812.N = class072672.L();
        class009812.y = class072672.u();
        class009812.i = class06202.Nq().yi();
        class009812.U = class08385.N(class072672.d());
    }

    private static boolean N(class07209 class072092) {
        class06202 class062022 = class06202.Nq();
        class04453 class044532 = (class04453)class062022.T_4;
        if (class044532 != null && ((class05630)class062022.i_7).NS().N() && class044532.method_31550()) {
            return true;
        }
        class07049 class070492 = class062022.F();
        return class070492 != null && class070492.method_5707(class06889.y((class00753)class072092)) < (double)y;
    }

    public static int N(class03610 class036102) {
        int n = class036102.y().R();
        if (n == class06563.field_7963.R() && class036102.N()) {
            return -988212;
        }
        return class02566.y((int)n, (float)0.4f);
    }

    private void N(class00981 class009812, class01421 class014212, class01237 class012372, boolean bl) {
        int n;
        boolean bl2;
        int n2;
        class03610 class036102;
        class03610 class036103 = class036102 = bl ? class009812.N : class009812.y;
        if (class036102 == null) {
            return;
        }
        class014212.N();
        this.N(class014212, bl, this.L());
        int n3 = class08385.N(class036102);
        int n4 = 4 * class009812.L / 2;
        class01028[] class01028Array = class036102.N(class009812.i, class003922 -> {
            List var3 = this.L.L((class05936)class003922, class009812.u);
            return var3.isEmpty() ? class01028.N : (class01028)var3.get(0);
        });
        if (class036102.N()) {
            n2 = class036102.y().R();
            bl2 = n2 == class06563.field_7963.R() || class009812.U;
            n = 0xF000F0;
        } else {
            n2 = n3;
            bl2 = false;
            n = class009812.Z;
        }
        for (int i = 0; i < 4; ++i) {
            class01028 class010282 = class01028Array[i];
            float f = -this.L.N(class010282) / 2;
            class012372.N(class014212, f, (float)(i * class009812.L - n4), class010282, false, class01583.field_33995, n, n2, 0, bl2 ? n3 : 0);
        }
        class014212.y();
    }

    public void N(class00981 class009812, class01421 class014212, class01237 class012372, class06959 class069592) {
        class00500 class005002 = class009812.M;
        class07036 class070362 = (class07036)class005002.i();
        class06260 class062602 = this.N(class005002, class070362.L());
        this.N(class009812, class014212, class005002, class070362, class070362.L(), class062602, class009812.z, class012372);
    }

    protected abstract void N(class01421 var1, float var2, class00500 var3);

    protected abstract class05913 N(class05904 var1);

    protected abstract float N();

    private void N(class01421 class014212, boolean bl, class06889 class068892) {
        if (!bl) {
            class014212.N((Quaternionfc)class02058.u.N(180.0f));
        }
        float f = 0.015625f * this.y();
        class014212.N(class068892);
        class014212.y(f, -f, f);
    }

    protected abstract class06260 N(class00500 var1, class05904 var2);

    protected void N(class01421 class014212, int n, class05904 class059042, class06260 class062602, @Nullable class08141 class081412, class01237 class012372) {
        class014212.N();
        float f = this.N();
        class014212.y(f, -f, -f);
        class05913 class059132 = this.N(class059042);
        class07311 class073112 = class059132.N(arg_0 -> ((class06260)class062602).method_23500(arg_0));
        class012372.N((class06271)class062602, (Object)class06244.field_17274, class014212, class073112, n, class01384.u, -1, this.u.N(class059132), 0, class081412);
        class014212.y();
    }

    private void N(class00981 class009812, class01421 class014212, class00500 class005002, class07036 class070362, class05904 class059042, class06260 class062602, @Nullable class08141 class081412, class01237 class012372) {
        class014212.N();
        this.N(class014212, -class070362.U(class005002), class005002);
        this.N(class014212, class009812.Z, class059042, class062602, class081412, class012372);
        this.N(class009812, class014212, class012372, true);
        this.N(class009812, class014212, class012372, false);
        class014212.y();
    }
}

