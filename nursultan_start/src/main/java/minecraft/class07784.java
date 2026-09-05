/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06662
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06662;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07784
extends class00891
implements class00873 {
    public static final MapCodec<class07784> N = class07784.y(class07784::new);
    private static final class00494 O = class00891.y((double)6.0, (double)0.0, (double)16.0);
    private static final class00494 F = class00891.y((double)10.0, (double)0.0, (double)16.0);
    private static final class00494 A = class00891.y((double)3.0, (double)0.0, (double)16.0);
    public static final class08071 y = class06665.Nn;
    public static final class08064<class06662> L = class06665.ys;
    public static final class08071 u = class06665.Nh;
    public static final int i = 16;
    public static final int R = 0;
    public static final int M = 1;
    public static final int B = 0;
    public static final int Z = 1;
    private static final class00494 f;
    private static final class00494 C;

    public class07784(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0))).y(L, (Comparable)class06662.field_12469)).y((class08092)u, (Comparable)Integer.valueOf(0)));
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return A.method_64034(class005002.N(class072092));
    }

    protected int y(class07290 class072902, class07209 class072092) {
        int n;
        for (n = 0; n < 16 && class072902.method_8320(class072092.method_10087(n + 1)).N(class00869.mx); ++n) {
        }
        return n;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n;
        if ((Integer)class005002.L((class08092)u) != 0) {
            return;
        }
        if (class060692.y(3) == 0 && class047822.R(class072092.method_10084()) && class047822.method_22335(class072092.method_10084(), 0) >= 9 && (n = this.y((class07290)class047822, class072092) + 1) < 16) {
            this.N(class005002, (class07299)class047822, class072092, class060692, n);
        }
    }

    protected boolean y(class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = this.N((class07290)class047822, class072092);
        int n2 = this.y((class07290)class047822, class072092);
        int n3 = n + n2 + 1;
        int n4 = 1 + class060692.y(2);
        for (int i = 0; i < n4; ++i) {
            class07209 class072093 = class072092.method_10086(n);
            class00500 class005003 = class047822.method_8320(class072093);
            if (n3 >= 16 || (Integer)class005003.L((class08092)u) == 1 || !class047822.R(class072093.method_10084())) {
                return;
            }
            this.N(class005003, (class07299)class047822, class072093, class060692, n3);
            ++n;
            ++n3;
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        int n;
        int n2 = this.N((class07290)class054872, class072092);
        return n2 + (n = this.y((class07290)class054872, class072092)) + 1 < 16 && (Integer)class054872.method_8320(class072092.method_10086(n2)).L((class08092)u) != 1;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        if (class072112 == class07211.field_11036 && class005003.N(class00869.mx) && (Integer)class005003.L((class08092)y) > (Integer)class005002.L((class08092)y)) {
            return (class00500)class005002.N((class08092)y);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692, int n) {
        class00500 class005003 = class072992.method_8320(class072092.method_10074());
        class07209 class072093 = class072092.method_10087(2);
        class00500 class005004 = class072992.method_8320(class072093);
        class06662 class066622 = class06662.field_12469;
        if (n >= 1) {
            if (!class005003.N(class00869.mx) || class005003.L(L) == class06662.field_12469) {
                class066622 = class06662.field_12466;
            } else if (class005003.N(class00869.mx) && class005003.L(L) != class06662.field_12469) {
                class066622 = class06662.field_12468;
                if (class005004.N(class00869.mx)) {
                    class072992.method_8652(class072092.method_10074(), (class00500)class005003.y(L, (Comparable)class06662.field_12466), 3);
                    class072992.method_8652(class072093, (class00500)class005004.y(L, (Comparable)class06662.field_12469), 3);
                }
            }
        }
        int n2 = (Integer)class005002.L((class08092)y) == 1 || class005004.N(class00869.mx) ? 1 : 0;
        int n3 = n >= 11 && class060692.z() < 0.25f || n == 15 ? 1 : 0;
        class072992.method_8652(class072092.method_10084(), (class00500)((class00500)((class00500)this.W().y((class08092)y, (Comparable)Integer.valueOf(n2))).y(L, (Comparable)class066622)).y((class08092)u, (Comparable)Integer.valueOf(n3)), 3);
    }

    protected int N(class07290 class072902, class07209 class072092) {
        int n;
        for (n = 0; n < 16 && class072902.method_8320(class072092.method_10086(n + 1)).N(class00869.mx); ++n) {
        }
        return n;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            class00494 class004942 = (Integer)class005002.L((class08092)y) == Z ? C : f;
            callbackInfoReturnable.setReturnValue((Object)class004942.method_64034(class005002.N(class072092)));
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return (class005002.L(L) == class06662.field_12468 ? F : O).method_64034(class005002.N(class072092));
    }

    public MapCodec<class07784> N() {
        return N;
    }

    public @Nullable class00500 N(class06942 class069422) {
        if (!class069422.method_8045().method_8316(class069422.method_8037()).W()) {
            return null;
        }
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10074());
        if (class005002.N(class01210.NV)) {
            if (class005002.N(class00869.mS)) {
                return (class00500)this.W().y((class08092)y, (Comparable)Integer.valueOf(0));
            }
            if (class005002.N(class00869.mx)) {
                int n = (Integer)class005002.L((class08092)y) > 0 ? 1 : 0;
                return (class00500)this.W().y((class08092)y, (Comparable)Integer.valueOf(n));
            }
            class00500 class005003 = class069422.method_8045().method_8320(class069422.method_8037().method_10084());
            if (class005003.N(class00869.mx)) {
                return (class00500)this.W().y((class08092)y, (Comparable)((Integer)class005003.L((class08092)y)));
            }
            return class00869.mS.W();
        }
        return null;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).N(class01210.NV);
    }

    protected boolean a_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return false;
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)u) == 0;
    }
}

