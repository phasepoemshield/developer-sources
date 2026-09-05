/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09468
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04688
 *  minecraft.class04744
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05042
 *  minecraft.class05188
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07051
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07328
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09468;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01284;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04688;
import minecraft.class04744;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05042;
import minecraft.class05188;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07051;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07328;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01338
extends class00891 {
    public static final MapCodec<class01338> N = class01338.y(class01338::new);
    public static final int y = 0;
    public static final int L = 4;
    public static final class08071 u = class06665.yu;
    private static final ImmutableList<class00753> i = ImmutableList.of((Object)new class00753(0, 0, -1), (Object)new class00753(-1, 0, 0), (Object)new class00753(0, 0, 1), (Object)new class00753(1, 0, 0), (Object)new class00753(-1, 0, -1), (Object)new class00753(1, 0, -1), (Object)new class00753(-1, 0, 1), (Object)new class00753(1, 0, 1));
    private static final ImmutableList<class00753> R = new ImmutableList.Builder().addAll(i).addAll(i.stream().map(class00753::method_23228).iterator()).addAll(i.stream().map(class00753::method_30931).iterator()).add((Object)new class00753(0, 1, 0)).build();

    public class01338(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Integer.valueOf(0)));
    }

    private static boolean U(class00500 class005002) {
        return (Integer)class005002.L((class08092)u) < 4;
    }

    public static int N(class00500 class005002, int n) {
        return class04995.y((float)((float)((Integer)class005002.L((class08092)u) - 0) / 4.0f * (float)n));
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return class01338.N(class005002, 15);
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u});
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9) && callbackInfoReturnable.getReturnValue() == class07082.L && !((Boolean)class072992.method_75728().N(class00608.O, class072092)).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private static Optional<class06889> N(class07078<?> class070782, class07322 class073222, class07209 class072092, boolean bl) {
        class07218 class072182 = new class07218();
        for (class00753 class007532 : R) {
            class072182.N((class00753)class072092).y(class007532);
            class06889 class068892 = class05188.N(class070782, (class07322)class073222, (class07209)class072182, (boolean)bl);
            if (class068892 == null) continue;
            return Optional.of(class068892);
        }
        return Optional.empty();
    }

    public static Optional<class06889> N(class07078<?> class070782, class07322 class073222, class07209 class072092) {
        Optional<class06889> var3 = class01338.N(class070782, class073222, class072092, true);
        if (var3.isPresent()) {
            return var3;
        }
        return class01338.N(class070782, class073222, class072092, false);
    }

    private static boolean N(class07209 class072092, class07299 class072992) {
        class04688 class046882 = class072992.method_8316(class072092);
        if (!class046882.N(class01231.N)) {
            return false;
        }
        if (class046882.u()) {
            return true;
        }
        if ((float)class046882.R() < 2.0f) {
            return false;
        }
        return !class072992.method_8316(class072092.method_10074()).N(class01231.N);
    }

    private static boolean N(class06584 class065842) {
        return class065842.N(class06570.Mu);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if ((Integer)class005002.L((class08092)u) == 0) {
            class07051 class070512 = class07082.i;
            class07051 class070513 = class070512;
            class070513 = new CallbackInfoReturnable("", true, (Object)class070513);
            this.N(class005002, class072992, class072092, class080362, class061832, (CallbackInfoReturnable)class070513);
            if (class070513.isCancelled()) {
                return (class07082)class070513.getReturnValue();
            }
            return class070512;
        }
        if (!(class072992 instanceof class04782)) {
            class07041 class070412 = class07082.L;
            class07041 class070413 = class070412;
            class070413 = new CallbackInfoReturnable("", true, (Object)class070413);
            this.N(class005002, class072992, class072092, class080362, class061832, (CallbackInfoReturnable)class070413);
            if (class070413.isCancelled()) {
                return (class07082)class070413.getReturnValue();
            }
            return class070412;
        }
        class04782 class047822 = (class04782)class072992;
        if (class01338.N(class047822, class072092)) {
            if (class080362 instanceof class04770) {
                class04770 class047702 = (class04770)class080362;
                class04744 class047442 = class047702.method_67564();
                class04744 class047443 = new class04744(class05042.N((class05946)class047822.method_27983(), (class07209)class072092, (float)0.0f, (float)0.0f), false);
                if (class047442 == null || !class047442.y(class047443)) {
                    class047702.method_26284(class047443, true);
                    class047822.method_43128(null, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.dv, class04911.field_15245, 1.0f, 1.0f);
                    class07041 class070414 = class07082.y;
                    class07041 class070415 = class070414;
                    class070415 = new CallbackInfoReturnable("", true, (Object)class070415);
                    this.N(class005002, class072992, class072092, class080362, class061832, (CallbackInfoReturnable)class070415);
                    if (class070415.isCancelled()) {
                        return (class07082)class070415.getReturnValue();
                    }
                    return class070414;
                }
            }
            class07041 class070416 = class07082.L;
            class07041 class070417 = class070416;
            class070417 = new CallbackInfoReturnable("", true, (Object)class070417);
            this.N(class005002, class072992, class072092, class080362, class061832, (CallbackInfoReturnable)class070417);
            if (class070417.isCancelled()) {
                return (class07082)class070417.getReturnValue();
            }
            return class070416;
        }
        this.N(class005002, class047822, class072092);
        class07041 class070418 = class07082.y;
        class07041 class070419 = class070418;
        class070419 = new CallbackInfoReturnable("", true, (Object)class070419);
        this.N(class005002, class072992, class072092, class080362, class061832, (CallbackInfoReturnable)class070419);
        if (class070419.isCancelled()) {
            return (class07082)class070419.getReturnValue();
        }
        return class070418;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class01338.N(class065842) && class01338.U(class005002)) {
            class01338.N((class07049)class080362, class072992, class072092, class005002);
            class065842.N(1, (class07438)class080362);
            return class07082.N;
        }
        if (class070502 == class07050.field_5808 && class01338.N(class080362.method_5998(class07050.field_5810)) && class01338.U(class005002)) {
            return class07082.i;
        }
        return class07082.R;
    }

    public MapCodec<class01338> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if ((Integer)class005002.L((class08092)u) == 0) {
            return;
        }
        if (class060692.y(100) == 0) {
            class072992.method_45446(class072092, class04909.dT, class04911.field_15245, 1.0f, 1.0f, false);
        }
        double d = (double)class072092.method_10263() + 0.5 + (0.5 - class060692.U());
        double d2 = (double)class072092.method_10264() + 1.0;
        double d3 = (double)class072092.method_10260() + 0.5 + (0.5 - class060692.U());
        double d4 = (double)class060692.z() * 0.04;
        class072992.method_8406((class07126)class07107.Ne, d, d2, d3, 0.0, d4, 0.0);
    }

    public static void N(@Nullable class07049 class070492, class07299 class072992, class07209 class072092, class00500 class005002) {
        class00500 class005003 = (class00500)class005002.y((class08092)u, (Comparable)Integer.valueOf((Integer)class005002.L((class08092)u) + 1));
        class072992.method_8652(class072092, class005003, 3);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class070492, (class00500)class005003));
        class072992.method_43128(null, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.db, class04911.field_15245, 1.0f, 1.0f);
    }

    public static boolean N(class04782 class047822, class07209 class072092) {
        return (Boolean)class047822.method_75728().N(class00608.O, class072092);
    }

    private void N(class00500 class005002, class04782 class047822, class07209 class072093) {
        class047822.method_8650(class072093, false);
        boolean bl = class07221.field_11062.N().map(arg_0 -> ((class07209)class072093).method_10093(arg_0)).anyMatch(class072092 -> class01338.N(class072092, (class07299)class047822)) || class047822.method_8316(class072093.method_10084()).N(class01231.N);
        class09468 class094682 = new class09468(this, class072093, bl);
        class06889 class068892 = class072093.method_46558();
        class047822.method_46407(null, class047822.method_48963().N(class068892), (class01284)class094682, class068892, 5.0f, true, class07328.field_40889);
    }
}

