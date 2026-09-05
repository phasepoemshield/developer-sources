/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09408
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 *  java.lang.MatchException
 *  minecraft.class00379
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00734
 *  minecraft.class00888
 *  minecraft.class00890
 *  minecraft.class00891
 *  minecraft.class00906
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01514
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04907
 *  minecraft.class05487
 *  minecraft.class05982
 *  minecraft.class05992
 *  minecraft.class05994
 *  minecraft.class06025
 *  minecraft.class06029
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06638
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07274
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07617
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09408;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import minecraft.class00379;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00861;
import minecraft.class00888;
import minecraft.class00890;
import minecraft.class00891;
import minecraft.class00906;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01514;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04907;
import minecraft.class05487;
import minecraft.class05982;
import minecraft.class05992;
import minecraft.class05994;
import minecraft.class06025;
import minecraft.class06029;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06638;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07274;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07617;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00860
extends class05982<class00379>
implements class06084 {
    public static final MapCodec<class00860> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.y.T().fieldOf("open_sound").forGetter(class00860::j), (App)class04206.y.T().fieldOf("close_sound").forGetter(class00860::v), (App)class00860.t()).apply(instance, (class048912, class048913, class013622) -> new class00860(() -> class00404.field_11914, (class04891)class048912, (class04891)class048913, (class01362)class013622)));
    public static final class08064<class07211> u = class07101.R;
    public static final class08064<class06638> i = class06665.yB;
    public static final class06667 R = class06665.q;
    public static final int M = 1;
    private static final class00494 N = class00891.y((double)14.0, (double)0.0, (double)14.0);
    private static final Map<class07211, class00494> y = class00389.L((class00494)class00891.N((double)14.0, (double)0.0, (double)14.0, (double)0.0, (double)15.0));
    private final class04891 Z;
    private final class04891 O;
    private static final class06029<class00379, Optional<class06695>> F = new class00888();
    private static final class06029<class00379, Optional<class06237>> A = new class00861();
    private static final class00494 f;
    private static final Map C;

    public boolean L(class00500 class005002) {
        return class005002.N((class00891)this);
    }

    protected class04907<class01894> T() {
        return class01235.Z.y((Object)class01235.NT);
    }

    public class00860(Supplier<class00404<? extends class00379>> supplier, class04891 class048912, class04891 class048913, class01362 class013622) {
        super(class013622, supplier);
        this.Z = class048912;
        this.O = class048913;
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(u, (Comparable)class07211.field_11043)).y(i, (Comparable)class06638.field_12569)).y((class08092)R, (Comparable)Boolean.valueOf(false)));
    }

    public class00404<? extends class00379> b() {
        return (class00404)this.B.get();
    }

    public class04891 v() {
        return this.O;
    }

    public class04891 j() {
        return this.Z;
    }

    public static class05992 U(class00500 class005002) {
        class06638 class066382 = (class06638)class005002.L(i);
        if (class066382 == class06638.field_12569) {
            return class05992.field_21783;
        }
        if (class066382 == class06638.field_12571) {
            return class05992.field_21784;
        }
        return class05992.field_21785;
    }

    public class00494 z(class00500 class005002) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            if (class005002.L(i) == class06638.field_12569) {
                return N;
            }
            return y.get(class00860.E(class005002));
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public static class07209 y(class07209 class072092, class00500 class005002) {
        class07211 class072112 = class00860.E(class005002);
        return class072092.method_10093(class072112);
    }

    private static boolean y(class07284 class072842, class07209 class072092) {
        List list = class072842.N(class07617.class, new class00734((double)class072092.method_10263(), (double)(class072092.method_10264() + 1), (double)class072092.method_10260(), (double)(class072092.method_10263() + 1), (double)(class072092.method_10264() + 2), (double)(class072092.method_10260() + 1)));
        if (!list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((class07617)iterator.next()).Ng()) continue;
                return true;
            }
        }
        return false;
    }

    private @Nullable class07211 y(class07299 class072992, class07209 class072092, class07211 class072112) {
        class00500 class005002 = class072992.method_8320(class072092.method_10093(class072112));
        return this.L(class005002) && class005002.L(i) == class06638.field_12569 ? (class07211)class005002.L(u) : null;
    }

    public static class07211 E(class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L(u);
        return class005002.L(i) == class06638.field_12574 ? class072112.R() : class072112.M();
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u, i, R});
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class07482.L((class06695)class00860.N(this, class005002, class072992, class072092, false));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(u, (Comparable)class069932.N((class07211)class005002.L(u)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(u)));
    }

    public MapCodec<? extends class00860> N() {
        return L;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.y());
        } else if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)(switch (class00890.N[((class06638)class005002.L(i)).ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> f;
                case 2, 3 -> (class00494)C.get(class00860.E(class005002));
            }));
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class00379) {
            ((class00379)class003942).u();
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class06237 class062372 = this.N(class005002, class072992, class072092);
            if (class062372 != null) {
                class080362.method_17355(class062372);
                class080362.method_7259(this.T());
                class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
            }
        }
        return class07082.N;
    }

    public static @Nullable class06695 N(class00860 class008602, class00500 class005002, class07299 class072992, class07209 class072092, boolean bl) {
        return ((Optional)class008602.N(class005002, class072992, class072092, bl).apply(F)).orElse(null);
    }

    public class06025<? extends class00379> N(class00500 class005002, class07299 class072992, class07209 class072093, boolean bl) {
        BiPredicate<class07284, class07209> biPredicate = bl ? (class072842, class072092) -> false : class00860::N;
        return class05994.N((class00404)((class00404)this.B.get()), class00860::U, class00860::E, u, (class00500)class005002, (class07284)class072992, (class07209)class072093, biPredicate);
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (this.L(class005003) && class072112.z().L()) {
            class06638 class066382 = (class06638)class005003.L(i);
            if (class005002.L(i) == class06638.field_12569 && class066382 != class06638.field_12569 && class005002.L(u) == class005003.L(u) && class00860.E(class005003) == class072112.b()) {
                return (class00500)class005002.y(i, (Comparable)class066382.N());
            }
        } else if (class00860.E(class005002) == class072112) {
            return (class00500)class005002.y(i, (Comparable)class06638.field_12569);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return switch (class09408.N[((class06638)class005002.L(i)).ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> N;
            case 2, 3 -> y.get(class00860.E(class005002));
        };
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112;
        class06638 class066382 = class06638.field_12569;
        class07211 class072113 = class069422.method_8042().b();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        boolean bl = class069422.method_8046();
        class07211 class072114 = class069422.method_8038();
        if (class072114.z().L() && bl && (class072112 = this.y(class069422.method_8045(), class069422.method_8037(), class072114.b())) != null && class072112.z() != class072114.z()) {
            class072113 = class072112;
            class06638 class066383 = class066382 = class072113.M() == class072114.b() ? class06638.field_12571 : class06638.field_12574;
        }
        if (class066382 == class06638.field_12569 && !bl) {
            class066382 = this.N(class069422.method_8045(), class069422.method_8037(), class072113);
        }
        return (class00500)((class00500)((class00500)this.W().y(u, (Comparable)class072113)).y(i, (Comparable)class066382)).y((class08092)R, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected class06638 N(class07299 class072992, class07209 class072092, class07211 class072112) {
        if (class072112 == this.y(class072992, class072092, class072112.R())) {
            return class06638.field_12574;
        }
        if (class072112 == this.y(class072992, class072092, class072112.M())) {
            return class06638.field_12571;
        }
        return class06638.field_12569;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? class00860.N(class004042, this.b(), class00379::N) : null;
    }

    public static boolean N(class07284 class072842, class07209 class072092) {
        return class00860.N((class07290)class072842, class072092) || class00860.y(class072842, class072092);
    }

    private static boolean N(class07290 class072902, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        return class072902.method_8320(class072093).u(class072902, class072093);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00379(class072092, class005002);
    }

    public static class06029<class00379, Float2FloatFunction> N(class07274 class072742) {
        return new class00906(class072742);
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        return ((Optional)this.N(class005002, class072992, class072092, false).apply(A)).orElse(null);
    }
}

