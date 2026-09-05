/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00624
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02566
 *  minecraft.class02732
 *  minecraft.class02733
 *  minecraft.class02738
 *  minecraft.class02752
 *  minecraft.class02761
 *  minecraft.class03794
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06859
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07126
 *  minecraft.class07138
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08075
 *  minecraft.class08092
 *  minecraft.class08713
 *  net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations
 *  net.caffeinemc.mods.lithium.common.util.DirectionConstants
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00624;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02566;
import minecraft.class02732;
import minecraft.class02733;
import minecraft.class02738;
import minecraft.class02752;
import minecraft.class02761;
import minecraft.class03794;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06859;
import minecraft.class06869;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07126;
import minecraft.class07138;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08075;
import minecraft.class08092;
import minecraft.class08713;
import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06884
extends class00891 {
    public static final MapCodec<class06884> N = class06884.y(class06884::new);
    public static final class08064<class08075> y = class06665.Ni;
    public static final class08064<class08075> L = class06665.Nu;
    public static final class08064<class08075> u = class06665.NR;
    public static final class08064<class08075> i = class06665.NM;
    public static final class08071 R = class06665.ND;
    public static final Map<class07211, class08064<class08075>> M = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(class07211.field_11043, y, class07211.field_11034, L, class07211.field_11035, u, class07211.field_11039, i)));
    private static final int[] B = (int[])class07536.N((Object)new int[16], (T nArray) -> {
        for (int i = 0; i <= 15; ++i) {
            float f;
            float f2 = f * 0.6f + ((f = (float)i / 15.0f) > 0.0f ? 0.4f : 0.3f);
            float f3 = class04995.N((float)(f * f * 0.7f - 0.5f), (float)0.0f, (float)1.0f);
            float f4 = class04995.N((float)(f * f * 0.6f - 0.7f), (float)0.0f, (float)1.0f);
            nArray[i] = class02566.N((float)1.0f, (float)f2, (float)f3, (float)f4);
        }
    });
    private static final float Z = 0.2f;
    private final Function<class00500, class00494> O;
    private final class00500 F;
    private final class02761 A;
    private boolean f = true;
    private final class00494 C = class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)0.0625, (double)1.0);

    private void L(class07299 class072992, class07209 class072092) {
        for (class07211 class072112 : class07221.field_11062) {
            this.y(class072992, class072092.method_10093(class072112));
        }
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (class072992.method_8320(class072093).u((class07290)class072992, class072093)) {
                this.y(class072992, class072093.method_10084());
                continue;
            }
            this.y(class072992, class072093.method_10074());
        }
    }

    private class07211[] L() {
        return DirectionConstants.ALL;
    }

    private static boolean T(class00500 class005002) {
        return ((class08075)class005002.L(y)).N() && ((class08075)class005002.L(u)).N() && ((class08075)class005002.L(L)).N() && ((class08075)class005002.L(i)).N();
    }

    public class06884(class01362 class013622) {
        super(class013622);
        this.A = new class02738(this);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class08075.field_12687)).y(L, (Comparable)class08075.field_12687)).y(u, (Comparable)class08075.field_12687)).y(i, (Comparable)class08075.field_12687)).y((class08092)R, (Comparable)Integer.valueOf(0)));
        this.O = this.y();
        this.F = (class00500)((class00500)((class00500)((class00500)this.W().y(y, (Comparable)class08075.field_12689)).y(L, (Comparable)class08075.field_12689)).y(u, (Comparable)class08075.field_12689)).y(i, (Comparable)class08075.field_12689);
    }

    private static boolean b(class00500 class005002) {
        return !((class08075)class005002.L(y)).N() && !((class08075)class005002.L(u)).N() && !((class08075)class005002.L(L)).N() && !((class08075)class005002.L(i)).N();
    }

    protected static boolean U(class00500 class005002) {
        return class06884.N(class005002, null);
    }

    private class07211[] u() {
        return DirectionConstants.ALL;
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!this.f) {
            return 0;
        }
        return class005002.N(class072902, class072092, class072112);
    }

    public static int y(int n) {
        return B[n];
    }

    private Function<class00500, class00494> y() {
        boolean bl = true;
        int n = 10;
        class00494 class004942 = class00891.y((double)10.0, (double)0.0, (double)1.0);
        Map var4 = class00389.L((class00494)class00891.N((double)10.0, (double)0.0, (double)1.0, (double)0.0, (double)8.0));
        Map var5 = class00389.L((class00494)class00891.y((double)10.0, (double)16.0, (double)0.0, (double)1.0));
        return this.N((T class005002) -> {
            class00494 class004943 = class004942;
            for (Map.Entry<class07211, class08064<class08075>> entry : M.entrySet()) {
                class004943 = switch ((class08075)class005002.L((class08092)entry.getValue())) {
                    default -> throw new MatchException(null, null);
                    case class08075.field_12686 -> class00389.N((class00494)class004943, (class00494[])new class00494[]{(class00494)var4.get(entry.getKey()), (class00494)var5.get(entry.getKey())});
                    case class08075.field_12689 -> class00389.N((class00494)class004943, (class00494)((class00494)var4.get(entry.getKey())));
                    case class08075.field_12687 -> class004943;
                };
            }
            return class004943;
        }, new class08092[]{R});
    }

    private void y(class07299 class072992, class07209 class072092) {
        if (!class072992.method_8320(class072092).N((class00891)this)) {
            return;
        }
        class072992.method_8408(class072092, (class00891)this);
        for (class07211 class072112 : this.u()) {
            class072992.method_8408(class072092.method_10093(class072112), (class00891)this);
        }
    }

    private class00500 y(class07290 class072902, class00500 class005002, class07209 class072092) {
        boolean bl = !class072902.method_8320(class072092.method_10084()).u(class072902, class072092);
        for (class07211 class072112 : class07221.field_11062) {
            if (((class08075)class005002.L((class08092)M.get(class072112))).N()) continue;
            class08075 class080752 = this.N(class072902, class072092, class072112, bl);
            class005002 = (class00500)class005002.y((class08092)M.get(class072112), (Comparable)class080752);
        }
        return class005002;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        int n = (Integer)class005002.L((class08092)R);
        if (n == 0) {
            return;
        }
        block4: for (class07211 class072112 : class07221.field_11062) {
            class08075 class080752 = (class08075)class005002.L((class08092)M.get(class072112));
            switch (class080752) {
                case field_12686: {
                    class06884.N(class072992, class060692, class072092, B[n], class072112, class07211.field_11036, -0.5f, 0.5f);
                }
                case field_12689: {
                    class06884.N(class072992, class060692, class072092, B[n], class07211.field_11033, class072112, 0.0f, 0.5f);
                    continue block4;
                }
            }
            class06884.N(class072992, class060692, class072092, B[n], class07211.field_11033, class072112, 0.0f, 0.3f);
        }
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11464: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(y, (Comparable)((class08075)class005002.L(u)))).y(L, (Comparable)((class08075)class005002.L(i)))).y(u, (Comparable)((class08075)class005002.L(y)))).y(i, (Comparable)((class08075)class005002.L(L)));
            }
            case field_11465: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(y, (Comparable)((class08075)class005002.L(L)))).y(L, (Comparable)((class08075)class005002.L(u)))).y(u, (Comparable)((class08075)class005002.L(i)))).y(i, (Comparable)((class08075)class005002.L(y)));
            }
            case field_11463: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(y, (Comparable)((class08075)class005002.L(i)))).y(L, (Comparable)((class08075)class005002.L(y)))).y(u, (Comparable)((class08075)class005002.L(L)))).y(i, (Comparable)((class08075)class005002.L(u)));
            }
        }
        return class005002;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)this.C);
        }
    }

    protected static boolean N(class00500 class005002, @Nullable class07211 class072112) {
        if (class005002.N(class00869.Lf)) {
            return true;
        }
        if (class005002.N(class00869.iH)) {
            class07211 class072113 = (class07211)class005002.L((class08092)class06859.R);
            return class072113 == class072112 || class072113.b() == class072112;
        }
        if (class005002.N(class00869.EV)) {
            return class072112 == class005002.L((class08092)class06869.y);
        }
        return class005002.j() && class072112 != null;
    }

    private static void N(class07299 class072992, class06069 class060692, class07209 class072092, int n, class07211 class072112, class07211 class072113, float f, float f2) {
        float f3 = f2 - f;
        if (class060692.z() >= 0.2f * f3) {
            return;
        }
        float f4 = 0.4375f;
        float f5 = f + f3 * class060692.z();
        double d = 0.5 + (double)(0.4375f * (float)class072112.P()) + (double)(f5 * (float)class072113.P());
        double d2 = 0.5 + (double)(0.4375f * (float)class072112.s()) + (double)(f5 * (float)class072113.s());
        double d3 = 0.5 + (double)(0.4375f * (float)class072112.T()) + (double)(f5 * (float)class072113.T());
        class072992.method_8406((class07126)new class07138(n, 1.0f), (double)class072092.method_10263() + d, (double)class072092.method_10264() + d2, (double)class072092.method_10260() + d3, 0.0, 0.0, 0.0);
    }

    private void N(class07299 class072992, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)RedstoneWirePowerCalculations.getNeighborBlockSignal((class00891)this, (class02761)this.A, (class07299)class072992, (class07209)class072092));
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        switch (class071112) {
            case field_11300: {
                return (class00500)((class00500)class005002.y(y, (Comparable)((class08075)class005002.L(u)))).y(u, (Comparable)((class08075)class005002.L(y)));
            }
            case field_11301: {
                return (class00500)((class00500)class005002.y(L, (Comparable)((class08075)class005002.L(i)))).y(i, (Comparable)((class08075)class005002.L(L)));
            }
        }
        return super.N(class005002, class071112);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i, R});
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072992, class072092, class080362, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        if (!class080362.method_31549().i) {
            return class07082.i;
        }
        if (class06884.T(class005002) || class06884.b(class005002)) {
            class00500 class005003 = class06884.T(class005002) ? this.W() : this.F;
            class005003 = (class00500)class005003.y((class08092)R, (Comparable)((Integer)class005002.L((class08092)R)));
            if ((class005003 = this.N((class07290)class072992, class005003, class072092)) != class005002) {
                class072992.method_8652(class072092, class005003, 3);
                this.N(class072992, class072092, class005002, class005003);
                return class07082.N;
            }
        }
        return class07082.i;
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002, class00500 class005003) {
        class02733 class027332 = class02752.N((class07299)class072992, null, (class07211)class07211.field_11036);
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (((class08075)class005002.L((class08092)M.get(class072112))).N() == ((class08075)class005003.L((class08092)M.get(class072112))).N() || !class072992.method_8320(class072093).u((class07290)class072992, class072093)) continue;
            class072992.method_8508(class072093, class005003.i(), class072112.b(), class02752.N((class02733)class027332, (class07211)class072112));
        }
    }

    protected void N(class00500 class005002, class07284 class072842, class07209 class072092, int n, int n2) {
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093;
            if ((class08075)class005002.L((class08092)M.get(class072112)) == class08075.field_12687 || class072842.method_8320((class07209)class072182.N((class00753)class072092, class072112)).N((class00891)this)) continue;
            class072182.N(class07211.field_11033);
            if (class072842.method_8320((class07209)class072182).N((class00891)this)) {
                class072093 = class072182.method_10093(class072112.b());
                class072842.method_42308(class072112.b(), (class07209)class072182, class072093, class072842.method_8320(class072093), n, n2);
            }
            class072182.N((class00753)class072092, class072112).N(class07211.field_11036);
            class072093 = class072842.method_8320((class07209)class072182);
            if (!class072093.N((class00891)this)) continue;
            class07209 class072094 = class072182.method_10093(class072112.b());
            class072842.method_42308(class072112.b(), (class07209)class072182, class072094, class072842.method_8320(class072094), n, n2);
        }
    }

    public final class08075 N(class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.N(class072902, class072092, class072112, !class072902.method_8320(class072092.method_10084()).u(class072902, class072092));
    }

    private class08075 N(class07290 class072902, class07209 class072092, class07211 class072112, boolean bl) {
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005002 = class072902.method_8320(class072093);
        if (bl && (class005002.i() instanceof class00624 || this.N(class072902, class072093, class005002)) && class06884.U(class072902.method_8320(class072093.method_10084()))) {
            if (class005002.L(class072902, class072093, class072112.b())) {
                return class08075.field_12686;
            }
            return class08075.field_12689;
        }
        if (class06884.N(class005002, class072112) || !class005002.u(class072902, class072093) && class06884.U(class072902.method_8320(class072093.method_10074()))) {
            return class08075.field_12689;
        }
        return class08075.field_12687;
    }

    public MapCodec<class06884> N() {
        return N;
    }

    private boolean N(class07290 class072902, class07209 class072092, class00500 class005002) {
        return class005002.L(class072902, class072092, class07211.field_11036) || class005002.N(class00869.Bf);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.O.apply(class005002);
    }

    public class00500 N(class06942 class069422) {
        return this.N((class07290)class069422.method_8045(), this.F, class069422.method_8037());
    }

    private class00500 N(class07290 class072902, class00500 class005002, class07209 class072092) {
        boolean bl;
        boolean bl2 = class06884.b(class005002);
        class005002 = this.y(class072902, (class00500)this.W().y((class08092)R, (Comparable)((Integer)class005002.L((class08092)R))), class072092);
        if (bl2 && class06884.b(class005002)) {
            return class005002;
        }
        boolean bl3 = ((class08075)class005002.L(y)).N();
        boolean bl4 = ((class08075)class005002.L(u)).N();
        boolean bl5 = ((class08075)class005002.L(L)).N();
        boolean bl6 = ((class08075)class005002.L(i)).N();
        boolean bl7 = !bl3 && !bl4;
        boolean bl8 = bl = !bl5 && !bl6;
        if (!bl6 && bl7) {
            class005002 = (class00500)class005002.y(i, (Comparable)class08075.field_12689);
        }
        if (!bl5 && bl7) {
            class005002 = (class00500)class005002.y(L, (Comparable)class08075.field_12689);
        }
        if (!bl3 && bl) {
            class005002 = (class00500)class005002.y(y, (Comparable)class08075.field_12689);
        }
        if (!bl4 && bl) {
            class005002 = (class00500)class005002.y(u, (Comparable)class08075.field_12689);
        }
        return class005002;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033) {
            if (!this.N((class07290)class054872, class072093, class005003)) {
                return class00869.N.W();
            }
            return class005002;
        }
        if (class072112 == class07211.field_11036) {
            return this.N((class07290)class054872, class005002, class072092);
        }
        class08075 class080752 = this.N((class07290)class054872, class072092, class072112);
        if (class080752.N() == ((class08075)class005002.L((class08092)M.get(class072112))).N() && !class06884.T(class005002)) {
            return (class00500)class005002.y((class08092)M.get(class072112), (Comparable)class080752);
        }
        return this.N((class07290)class054872, (class00500)((class00500)this.F.y((class08092)R, (Comparable)((Integer)class005002.L((class08092)R)))).y((class08092)M.get(class072112), (Comparable)class080752), class072092);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (bl) {
            return;
        }
        for (class07211 class072112 : this.L()) {
            class047822.method_8408(class072092.method_10093(class072112), (class00891)this);
        }
        this.N((class07299)class047822, class072092, class005002, null, false);
        this.L((class07299)class047822, class072092);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        if (class008912 == this && class06884.N(class072992)) {
            return;
        }
        if (class005002.N((class05487)class072992, class072092)) {
            this.N(class072992, class072092, class005002, class027332, false);
        } else {
            class06884.y((class00500)class005002, (class07299)class072992, (class07209)class072092);
            class072992.method_8650(class072092, false);
        }
    }

    private static boolean N(class07299 class072992) {
        return class072992.method_45162().y(class03794.L);
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!this.f || class072112 == class07211.field_11033) {
            return 0;
        }
        int n = (Integer)class005002.L((class08092)R);
        if (n == 0) {
            return 0;
        }
        if (class072112 == class07211.field_11036 || ((class08075)this.N(class072902, class005002, class072092).L((class08092)M.get(class072112.b()))).N()) {
            return n;
        }
        return 0;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i()) || class072992.method_8608()) {
            return;
        }
        this.N(class072992, class072092, class005002, null, true);
        for (class07211 class072112 : class07221.field_11064) {
            class072992.method_8408(class072092.method_10093(class072112), (class00891)this);
        }
        this.L(class072992, class072092);
    }

    public int N(class07299 class072992, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        this.f = false;
        int n = class072992.m(class072092);
        this.f = true;
        return n;
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class02733 class027332, boolean bl) {
        if (class06884.N(class072992)) {
            new class02732(this).N(class072992, class072092, class005002, class027332, bl);
        } else {
            this.A.N(class072992, class072092, class005002, class027332, bl);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        return this.N((class07290)class054872, class072093, class005003);
    }

    protected boolean i_(class00500 class005002) {
        return this.f;
    }
}

