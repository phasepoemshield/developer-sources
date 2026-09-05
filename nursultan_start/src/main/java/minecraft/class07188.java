/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05904
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05904;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07188
extends class07101 {
    public static final MapCodec<class07188> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05904.N.fieldOf("wood_type").forGetter(class071882 -> class071882.A), (App)class07188.t()).apply(instance, class07188::new));
    public static final class06667 y = class06665.d;
    public static final class06667 L = class06665.k;
    public static final class06667 u = class06665.v;
    private static final Map<class07185, class00494> i = class00389.N((class00494)class00891.N((double)16.0, (double)16.0, (double)4.0));
    private static final Map<class07185, class00494> M = Maps.newEnumMap((Map)class07536.N(i, (T class004942) -> class00389.N((class00494)class004942, (class00494)class00891.y((double)16.0, (double)13.0, (double)16.0), (class07003)class07003.i)));
    private static final Map<class07185, class00494> B = class00389.N((class00494)class00891.N((double)16.0, (double)4.0, (double)0.0, (double)24.0));
    private static final Map<class07185, class00494> Z = class00389.N((class00494)class00891.N((double)16.0, (double)4.0, (double)5.0, (double)24.0));
    private static final Map<class07185, class00494> O = class00389.N((class00494)class00389.N((class00494)class00891.N((double)0.0, (double)5.0, (double)7.0, (double)2.0, (double)16.0, (double)9.0), (class00494)class00891.N((double)14.0, (double)5.0, (double)7.0, (double)16.0, (double)16.0, (double)9.0)));
    private static final Map<class07185, class00494> F = Maps.newEnumMap((Map)class07536.N(O, (T class004942) -> class004942.method_1096(0.0, -0.1875, 0.0).method_1097()));
    private final class05904 A;
    private static final class00494 f;

    public class07188(class05904 class059042, class01362 class013622) {
        super(class013622.N(class059042.u()));
        this.A = class059042;
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    private boolean U(class00500 class005002) {
        return class005002.N(class01210.q);
    }

    protected class00494 z(class00500 class005002) {
        class07185 class071852 = ((class07211)((Object)class005002.L((class08092)R))).z();
        return ((Boolean)class005002.L((class08092)u) != false ? F : O).get(class071852);
    }

    protected class00494 u(class00500 class005002, class07290 class072902, class07209 class072092) {
        class07185 class071852 = ((class07211)((Object)class005002.L((class08092)R))).z();
        return (Boolean)class005002.L((class08092)y) != false ? class00389.N() : Z.get(class071852);
    }

    private void y(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (!((Boolean)class005002.L((class08092)y)).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            callbackInfoReturnable.setReturnValue((Object)f);
        }
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        class07185 class071852 = ((class07211)((Object)class005002.L((class08092)R))).z();
        return (Boolean)class005002.L((class08092)y) != false ? class00389.N() : B.get(class071852);
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (!((Boolean)class005002.L((class08092)u)).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        }
    }

    public MapCodec<class07188> N() {
        return N;
    }

    public static boolean N(class00500 class005002, class07211 class072112) {
        return ((class07211)((Object)class005002.L((class08092)R))).z() == class072112.R().z();
    }

    public class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        boolean bl = class072992.W(class072092);
        class07211 class072112 = class069422.method_8042();
        class07185 class071852 = class072112.z();
        boolean bl2 = class071852 == class07185.field_11051 && (this.U(class072992.method_8320(class072092.method_10067())) || this.U(class072992.method_8320(class072092.method_10078()))) || class071852 == class07185.field_11048 && (this.U(class072992.method_8320(class072092.method_10095())) || this.U(class072992.method_8320(class072092.method_10072())));
        return (class00500)((class00500)((class00500)((class00500)this.W().y((class08092)R, (Comparable)((Object)class072112))).y((class08092)y, (Comparable)Boolean.valueOf(bl))).y((class08092)L, (Comparable)Boolean.valueOf(bl))).y((class08092)u, (Comparable)Boolean.valueOf(bl2));
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        switch (class087912) {
            case field_50: {
                return (Boolean)class005002.L((class08092)y);
            }
            case field_48: {
                return false;
            }
            case field_51: {
                return (Boolean)class005002.L((class08092)y);
            }
        }
        return false;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class07185 class071852 = class072112.z();
        if (((class07211)((Object)class005002.L((class08092)R))).R().z() == class071852) {
            boolean bl = this.U(class005003) || this.U(class054872.method_8320(class072092.method_10093(class072112.b())));
            return (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(bl));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        class07185 class071852 = ((class07211)((Object)class005002.L((class08092)R))).z();
        return ((Boolean)class005002.L((class08092)u) != false ? M : i).get(class071852);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, y, L, u});
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        boolean bl2 = class072992.W(class072092);
        if ((Boolean)class005002.L((class08092)L) != bl2) {
            class072992.method_8652(class072092, (class00500)((class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(bl2))).y((class08092)y, (Comparable)Boolean.valueOf(bl2)), 2);
            if ((Boolean)class005002.L((class08092)y) != bl2) {
                class072992.method_8396(null, class072092, bl2 ? this.A.M() : this.A.R(), class04911.field_15245, 1.0f, class072992.method_8409().z() * 0.1f + 0.9f);
                class072992.N(null, (class03556)(bl2 ? class01194.B : class01194.u), class072092);
            }
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M() && !((Boolean)class005002.L((class08092)L)).booleanValue()) {
            boolean bl = (Boolean)class005002.L((class08092)y);
            class047822.method_8501(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(!bl)));
            class047822.method_8396(null, class072092, bl ? this.A.R() : this.A.M(), class04911.field_15245, 1.0f, class047822.method_8409().z() * 0.1f + 0.9f);
            class047822.N((class03556)(bl ? class01194.u : class01194.B), class072092, class01164.N((class00500)class005002));
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(false));
            class072992.method_8652(class072092, class005002, 10);
        } else {
            class07211 class072112 = class080362.method_5735();
            if (class005002.L((class08092)R) == class072112.b()) {
                class005002 = (class00500)class005002.y((class08092)R, (Comparable)((Object)class072112));
            }
            class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true));
            class072992.method_8652(class072092, class005002, 10);
        }
        boolean bl = (Boolean)class005002.L((class08092)y);
        class072992.method_8396((class07049)class080362, class072092, bl ? this.A.M() : this.A.R(), class04911.field_15245, 1.0f, class072992.method_8409().z() * 0.1f + 0.9f);
        class072992.N((class07049)class080362, (class03556)(bl ? class01194.B : class01194.u), class072092);
        return class07082.N;
    }
}

