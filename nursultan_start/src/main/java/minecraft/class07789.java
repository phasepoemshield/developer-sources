/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00387
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00586
 *  minecraft.class00608
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01372
 *  minecraft.class04995
 *  minecraft.class05188
 *  minecraft.class05487
 *  minecraft.class05992
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class06637
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08041
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00387;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00586;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01372;
import minecraft.class04995;
import minecraft.class05188;
import minecraft.class05487;
import minecraft.class05992;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06637;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08041;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07789
extends class07101
implements class07190 {
    public static final MapCodec<class07789> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class07789::y), (App)class07789.t()).apply(instance, class07789::new));
    public static final class08064<class06637> y = class06665.yM;
    public static final class06667 L = class06665.l;
    private static final Map<class07211, class00494> u = (Map)class07536.N(() -> {
        class00494 class004942 = class00891.N((double)0.0, (double)0.0, (double)0.0, (double)3.0, (double)3.0, (double)3.0);
        class00494 class004943 = class00389.N((class00494)class004942, (class01372)class01372.field_64511);
        return class00389.L((class00494)class00389.N((class00494)class00891.y((double)16.0, (double)3.0, (double)9.0), (class00494[])new class00494[]{class004942, class004943}));
    });
    private final class06563 i;
    private static final class00494 M;
    private boolean B;

    public class07789(class06563 class065632, class01362 class013622) {
        super(class013622);
        this.i = class065632;
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class06637.field_12557)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public static class07211 U(class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        return class005002.L(y) == class06637.field_12560 ? class072112.b() : class072112;
    }

    public class00494 z(class00500 class005002) {
        this.B = true;
        return super.z(class005002);
    }

    private void y(class07049 class070492, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            callbackInfo.cancel();
        }
    }

    private static boolean y(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092.method_10074()).i() instanceof class07789;
    }

    private static int[][] y(class07211 class072112, class07211 class072113) {
        return new int[][]{{class072113.P(), class072113.T()}, {class072113.P() - class072112.P(), class072113.T() - class072112.T()}, {class072113.P() - class072112.P() * 2, class072113.T() - class072112.T() * 2}, {-class072112.P() * 2, -class072112.T() * 2}, {-class072113.P() - class072112.P() * 2, -class072113.T() - class072112.T() * 2}, {-class072113.P() - class072112.P(), -class072113.T() - class072112.T()}, {-class072113.P(), -class072113.T()}, {-class072113.P() + class072112.P(), -class072113.T() + class072112.T()}, {class072112.P(), class072112.T()}, {class072113.P() + class072112.P(), class072113.T() + class072112.T()}};
    }

    public class06563 y() {
        return this.i;
    }

    public static class05992 E(class00500 class005002) {
        if ((class06637)class005002.L(y) == class06637.field_12560) {
            return class05992.field_21784;
        }
        return class05992.field_21785;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        super.N(class072992, class072092, class005002, class074382, class065842);
        if (!class072992.method_8608()) {
            class07209 class072093 = class072092.method_10093((class07211)class005002.L((class08092)R));
            class072992.method_8652(class072093, (class00500)class005002.y(y, (Comparable)class06637.field_12560), 3);
            class072992.method_8408(class072092, class00869.N);
            class005002.N((class07284)class072992, class072092, 3);
        }
    }

    protected long N(class00500 class005002, class07209 class072092) {
        class07209 class072093 = class072092.method_10079((class07211)class005002.L((class08092)R), class005002.L(y) == class06637.field_12560 ? 0 : 1);
        return class04995.y((int)class072093.method_10263(), (int)class072092.method_10264(), (int)class072093.method_10260());
    }

    private static int[][] N(class07211 class072112, class07211 class072113) {
        return (int[][])ArrayUtils.addAll((Object[])class07789.y(class072112, class072113), (Object[])class07789.N(class072112));
    }

    private void N(class07049 class070492, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfo.cancel();
            class06889 class068892 = class070492.method_18798();
            if (class068892.B < 0.0) {
                double d = class070492 instanceof class07438 ? 1.0 : 0.8;
                class070492.method_18800(class068892.M, Math.min(-class068892.B * 0.75 * d, 0.75), class068892.Z);
            }
        }
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.B) {
            this.B = false;
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) || ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)M);
        }
    }

    public MapCodec<class07789> N() {
        return N;
    }

    private static int[][] N(class07211 class072112) {
        return new int[][]{{0, 0}, {-class072112.P(), -class072112.T()}};
    }

    public void N(class07290 class072902, class07049 class070492) {
        if (class070492.method_21750()) {
            super.N(class072902, class070492);
        } else {
            this.N(class070492);
        }
    }

    private void N(class07049 class070492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.y(class070492, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        class06889 class068892 = class070492.method_18798();
        if (class068892.B < 0.0) {
            double d = class070492 instanceof class07438 ? 1.0 : 0.8;
            class070492.method_18800(class068892.M, -class068892.B * (double)0.66f * d, class068892.Z);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07789.N((class06637)class005002.L(y), (class07211)class005002.L((class08092)R))) {
            if (class005003.N((class00891)this) && class005003.L(y) != class005002.L(y)) {
                return (class00500)class005002.y((class08092)L, (Comparable)((Boolean)class005003.L((class08092)L)));
            }
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    private static class07211 N(class06637 class066372, class07211 class072112) {
        return class066372 == class06637.field_12557 ? class072112 : class072112.b();
    }

    public static @Nullable class07211 N(class07290 class072902, class07209 class072092) {
        class00500 class005002 = class072902.method_8320(class072092);
        return class005002.i() instanceof class07789 ? (class07211)class005002.L((class08092)R) : null;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (class072992.method_8608()) {
            return class07082.y;
        }
        if (class005002.L(y) != class06637.field_12560 && !(class005002 = class072992.method_8320(class072092 = class072092.method_10093((class07211)class005002.L((class08092)R)))).N((class00891)this)) {
            return class07082.L;
        }
        class00586 class005862 = (class00586)class072992.method_75728().N(class00608.Q, class072092);
        if (class005862.u()) {
            class005862.i().ifPresent(class003922 -> class080362.method_7353(class003922, true));
            class072992.method_8650(class072092, false);
            class07209 class072093 = class072092.method_10093(((class07211)class005002.L((class08092)R)).b());
            if (class072992.method_8320(class072093).N((class00891)this)) {
                class072992.method_8650(class072093, false);
            }
            class06889 class068892 = class072092.method_46558();
            class072992.method_46407(null, class072992.method_48963().N(class068892), null, class068892, 5.0f, true, class07328.field_40889);
            return class07082.y;
        }
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            if (!this.N(class072992, class072092)) {
                class080362.method_7353((class00392)class00392.L((String)"block.minecraft.bed.occupied"), true);
            }
            return class07082.y;
        }
        class080362.method_7269(class072092).ifLeft(class080352 -> {
            if (class080352.N() != null) {
                class080362.method_7353(class080352.N(), true);
            }
        });
        return class07082.y;
    }

    private boolean N(class07299 class072992, class07209 class072092) {
        List list = class072992.N(class08041.class, new class00734(class072092), class07438::method_6113);
        if (list.isEmpty()) {
            return false;
        }
        ((class08041)list.get(0)).method_18400();
        return true;
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        super.N(class072992, class005002, class072092, class070492, d * 0.5);
    }

    private static Optional<class06889> N(class07078<?> class070782, class07322 class073222, class07209 class072092, class07211 class072112, class07211 class072113) {
        int[][] nArray = class07789.y(class072112, class072113);
        Optional<class06889> optional = class07789.N(class070782, class073222, class072092, nArray, true);
        if (optional.isPresent()) {
            return optional;
        }
        class07209 class072093 = class072092.method_10074();
        Optional<class06889> optional2 = class07789.N(class070782, class073222, class072093, nArray, true);
        if (optional2.isPresent()) {
            return optional2;
        }
        int[][] nArray2 = class07789.N(class072112);
        Optional<class06889> optional3 = class07789.N(class070782, class073222, class072092, nArray2, true);
        if (optional3.isPresent()) {
            return optional3;
        }
        Optional<class06889> optional4 = class07789.N(class070782, class073222, class072092, nArray, false);
        if (optional4.isPresent()) {
            return optional4;
        }
        Optional<class06889> optional5 = class07789.N(class070782, class073222, class072093, nArray, false);
        if (optional5.isPresent()) {
            return optional5;
        }
        return class07789.N(class070782, class073222, class072092, nArray2, false);
    }

    private static Optional<class06889> N(class07078<?> class070782, class07322 class073222, class07209 class072092, int[][] nArray, boolean bl) {
        class07218 class072182 = new class07218();
        for (int[] nArray2 : nArray) {
            class072182.N(class072092.method_10263() + nArray2[0], class072092.method_10264(), class072092.method_10260() + nArray2[1]);
            class06889 class068892 = class05188.N(class070782, (class07322)class073222, (class07209)class072182, (boolean)bl);
            if (class068892 == null) continue;
            return Optional.of(class068892);
        }
        return Optional.empty();
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, y, L});
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00387(class072092, class005002, this.i);
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        class07209 class072093;
        class00500 class005003;
        class06637 class066372;
        if (!class072992.method_8608() && class080362.method_66324() && (class066372 = (class06637)class005002.L(y)) == class06637.field_12557 && (class005003 = class072992.method_8320(class072093 = class072092.method_10093(class07789.N(class066372, (class07211)class005002.L((class08092)R))))).N((class00891)this) && class005003.L(y) == class06637.field_12560) {
            class072992.method_8652(class072093, class00869.N.W(), 35);
            class072992.method_8444((class07049)class080362, 2001, class072093, class00891.W((class00500)class005003));
        }
        return super.N(class072992, class072092, class005002, class080362);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8042();
        class07209 class072092 = class069422.method_8037().method_10093(class072112);
        class07299 class072992 = class069422.method_8045();
        if (class072992.method_8320(class072092).N(class069422) && class072992.method_8621().N(class072092)) {
            return (class00500)this.W().y((class08092)R, (Comparable)class072112);
        }
        return null;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return u.get(class07789.U(class005002).b());
    }

    public static Optional<class06889> N(class07078<?> class070782, class07322 class073222, class07209 class072092, class07211 class072112, float f) {
        class07211 class072113;
        class07211 class072114 = class072112.R();
        class07211 class072115 = class072113 = class072114.N(f) ? class072114.b() : class072114;
        if (class07789.y((class07290)class073222, class072092)) {
            return class07789.N(class070782, class073222, class072092, class072112, class072113);
        }
        int[][] nArray = class07789.N(class072112, class072113);
        Optional<class06889> optional = class07789.N(class070782, class073222, class072092, nArray, true);
        if (optional.isPresent()) {
            return optional;
        }
        return class07789.N(class070782, class073222, class072092, nArray, false);
    }
}

