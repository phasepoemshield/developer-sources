/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.features.block.interaction.Block1_14
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00664;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00637
extends class00891 {
    public static final MapCodec<class00637> N = class00637.y(class00637::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.k;
    public static final class06667 u = class06665.N;
    protected static final int i = 1;
    protected static final int R = 42;
    private static final int M = 10;
    private static final Map<class07211, class00494> B = class00389.L((class00494)class00891.N((double)6.0, (double)0.0, (double)10.0, (double)10.0, (double)16.0));

    public class00637(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return 0;
        }
        if (class005002.L(y) == class072112) {
            return 15;
        }
        return 0;
    }

    private static void N(class00891 class008912, class07299 class072992, class07209 class072092, class07211 class072112) {
        class07211 class072113 = class072112.b();
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)class072113, (class07211)class07211.field_11036);
        class072992.method_8452(class072092, class008912, class027332);
        class072992.method_8452(class072092.method_10093(class072113), class008912, class027332);
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)L) != false ? 15 : 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (bl) {
            return;
        }
        boolean bl2 = (Boolean)class005002.L((class08092)u);
        boolean bl3 = (Boolean)class005002.L((class08092)L);
        if (bl2 || bl3) {
            class00637.N((class07299)class047822, class072092, class005002, true, false, -1, null);
        }
        if (bl3) {
            class00637.N(this, (class07299)class047822, class072092, (class07211)class005002.L(y));
        }
    }

    private void N(class00500 class005002, class05487 class054872, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && Block1_14.isExceptBlockForAttachWithPiston((class00891)class054872.method_8320(class072092).i())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = (class00500)((class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false));
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            class07211 class072113;
            if (!class072112.z().L() || !(class005002 = (class00500)class005002.y(y, (Comparable)(class072113 = class072112.b()))).N((class05487)class072992, class072092)) continue;
            return class005002;
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112.b() == class005002.L(y) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return B.get(class005002.L(y));
    }

    public MapCodec<class00637> N() {
        return N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00637.N((class07299)class047822, class072092, class005002, false, true, -1, null);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl, boolean bl2, int n, @Nullable class00500 class005003) {
        class00500 class005004;
        class07209 class072093;
        Optional optional = class005002.u(y);
        if (!optional.isPresent()) {
            return;
        }
        class07211 class072112 = (class07211)optional.get();
        boolean bl3 = class005002.u((class08092)u).orElse(false);
        boolean bl4 = class005002.u((class08092)L).orElse(false);
        class00891 class008912 = class005002.i();
        boolean bl5 = !bl;
        boolean bl6 = false;
        int n2 = 0;
        class00500[] class00500Array = new class00500[42];
        for (int i = 1; i < 42; ++i) {
            class072093 = class072092.method_10079(class072112, i);
            class005004 = class072992.method_8320(class072093);
            if (class005004.N(class00869.MG)) {
                if (class005004.L(y) != class072112.b()) break;
                n2 = i;
                break;
            }
            if (class005004.N(class00869.Ml) || i == n) {
                if (i == n) {
                    class005004 = (class00500)MoreObjects.firstNonNull((Object)class005003, (Object)class005004);
                }
                boolean bl7 = (Boolean)class005004.L((class08092)class00664.u) == false;
                boolean bl8 = (Boolean)class005004.L((class08092)class00664.y);
                bl6 |= bl7 && bl8;
                class00500Array[i] = class005004;
                if (i != n) continue;
                class072992.N(class072092, class008912, 10);
                bl5 &= bl7;
                continue;
            }
            class00500Array[i] = null;
            bl5 = false;
        }
        class00500 class005005 = (class00500)((class00500)class008912.W().L((class08092)u, (Comparable)Boolean.valueOf(bl5))).L((class08092)L, (Comparable)Boolean.valueOf(bl6 &= (bl5 &= n2 > 1)));
        if (n2 > 0) {
            class072093 = class072092.method_10079(class072112, n2);
            class005004 = class072112.b();
            class072992.method_8652(class072093, (class00500)class005005.y(y, (Comparable)class005004), 3);
            class00637.N(class008912, class072992, class072093, (class07211)class005004);
            class00637.N(class072992, class072093, bl5, bl6, bl3, bl4);
        }
        class00637.N(class072992, class072092, bl5, bl6, bl3, bl4);
        if (!bl) {
            class072992.method_8652(class072092, (class00500)class005005.y(y, (Comparable)class072112), 3);
            if (bl2) {
                class00637.N(class008912, class072992, class072092, class072112);
            }
        }
        if (bl3 != bl5) {
            for (int i = 1; i < n2; ++i) {
                class00500 class005006;
                class005004 = class072092.method_10079(class072112, i);
                class00500 class005007 = class00500Array[i];
                if (class005007 == null || !(class005006 = class072992.method_8320((class07209)class005004)).N(class00869.Ml) && !class005006.N(class00869.MG)) continue;
                class072992.method_8652((class07209)class005004, (class00500)class005007.L((class08092)u, (Comparable)Boolean.valueOf(bl5)), 3);
            }
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class00637.N(class072992, class072092, class005002, false, false, -1, null);
    }

    private static void N(class07299 class072992, class07209 class072092, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            class072992.method_8396(null, class072092, class04909.OL, class04911.field_15245, 0.4f, 0.6f);
            class072992.N(null, (class03556)class01194.N, class072092);
        } else if (!bl2 && bl4) {
            class072992.method_8396(null, class072092, class04909.Oy, class04911.field_15245, 0.4f, 0.5f);
            class072992.N(null, (class03556)class01194.i, class072092);
        } else if (bl && !bl3) {
            class072992.method_8396(null, class072092, class04909.ON, class04911.field_15245, 0.4f, 0.7f);
            class072992.N(null, (class03556)class01194.y, class072092);
        } else if (!bl && bl3) {
            class072992.method_8396(null, class072092, class04909.Ou, class04911.field_15245, 0.4f, 1.2f / (class072992.field_9229.z() * 0.2f + 0.9f));
            class072992.N(null, (class03556)class01194.M, class072092);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = (class07211)class005002.L(y);
        class07209 class072093 = class072092.method_10093(class072112.b());
        class00500 class005003 = class054872.method_8320(class072093);
        boolean bl = class072112.z().L() && class005003.L((class07290)class054872, class072093, class072112);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl);
        this.N(class005002, class054872, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl;
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

