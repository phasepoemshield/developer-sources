/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
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
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06996
extends class00864
implements class00873,
class06084 {
    public static final MapCodec<class06996> N = class06996.y(class06996::new);
    public static final int y = 4;
    public static final class08071 L = class06665.Nx;
    public static final class06667 u = class06665.q;
    private static final class00494 i = class00891.y((double)4.0, (double)0.0, (double)6.0);
    private static final class00494 R = class00891.y((double)10.0, (double)0.0, (double)6.0);
    private static final class00494 M = class00891.y((double)12.0, (double)0.0, (double)6.0);
    private static final class00494 B = class00891.y((double)12.0, (double)0.0, (double)7.0);
    private static final class00494 Z;

    public class06996(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(1))).y((class08092)u, (Comparable)Boolean.valueOf(true)));
    }

    public static boolean U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)u) == false;
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return switch ((Integer)class005002.L((class08092)L)) {
                case 2 -> R;
                case 3 -> M;
                case 4 -> B;
                default -> i;
            };
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return class00389.N();
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = 5;
        int n2 = 1;
        int n3 = 2;
        int n4 = 0;
        int n5 = class072092.method_10263() - 2;
        int n6 = 0;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < n2; ++j) {
                int n7 = 2 + class072092.method_10264() - 1;
                for (int k = n7 - 2; k < n7; ++k) {
                    class07209 class072093 = new class07209(n5 + i, k, class072092.method_10260() - n6 + j);
                    if (class072093.equals((Object)class072092) || class060692.y(6) != 0 || !class047822.method_8320(class072093).N(class00869.K) || !class047822.method_8320(class072093.method_10074()).N(class01210.NJ)) continue;
                    class047822.method_8652(class072093, (class00500)class00869.mA.W().y((class08092)L, (Comparable)Integer.valueOf(class060692.y(4) + 1)), 3);
                }
            }
            if (n4 < 2) {
                n2 += 2;
                ++n6;
            } else {
                n2 -= 2;
                --n6;
            }
            ++n4;
        }
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(4)), 2);
    }

    public MapCodec<class06996> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return !class06996.U(class005002) && class054872.method_8320(class072092.method_10074()).N(class01210.NJ);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005002.N((class00891)this)) {
            return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(Math.min(4, (Integer)class005002.L((class08092)L) + 1)));
        }
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)super.N(class069422).y((class08092)u, (Comparable)Boolean.valueOf(bl));
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)Z);
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        if (!class069422.method_8046() && class069422.method_8041().N(this.B()) && (Integer)class005002.L((class08092)L) < 4) {
            return true;
        }
        return super.N(class005002, class069422);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u});
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return !class005002.M(class072902, class072092).method_20538(class07211.field_11036).method_1110() || class005002.L(class072902, class072092, class07211.field_11036);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return switch ((Integer)class005002.L((class08092)L)) {
            default -> i;
            case 2 -> R;
            case 3 -> M;
            case 4 -> B;
        };
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return this.N(class054872.method_8320(class072093), (class07290)class054872, class072093);
    }
}

