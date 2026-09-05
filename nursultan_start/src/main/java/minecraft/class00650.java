/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.features.block.interaction.Block1_14
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06008
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07003
 *  minecraft.class07100
 *  minecraft.class07111
 *  minecraft.class07188
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06008;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07003;
import minecraft.class07100;
import minecraft.class07111;
import minecraft.class07188;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00650
extends class00891
implements class06084 {
    public static final MapCodec<class00650> N = class00650.y(class00650::new);
    public static final class06667 y = class06665.e;
    public static final class08064<class06008> L = class06665.r;
    public static final class08064<class06008> u = class06665.NN;
    public static final class08064<class06008> i = class06665.Ny;
    public static final class08064<class06008> R = class06665.NL;
    public static final Map<class07211, class08064<class06008>> M = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(class07211.field_11043, u, class07211.field_11034, L, class07211.field_11035, i, class07211.field_11039, R)));
    public static final class06667 B = class06665.q;
    private final Function<class00500, class00494> Z;
    private final Function<class00500, class00494> O;
    private static final class00494 F = class00891.y((double)2.0, (double)0.0, (double)16.0);
    private static final Map<class07211, class00494> A = class00389.L((class00494)class00891.y((double)2.0, (double)16.0, (double)0.0, (double)9.0));
    private final Object2IntMap f = new Object2IntOpenHashMap();
    private class00494[] C;
    private class00494[] S;

    private int T(class00500 class005003) {
        return this.f.computeIntIfAbsent((Object)class005003, class005002 -> {
            int n = 0;
            if (!class06008.field_22178.equals((Object)class005002.L(u))) {
                n |= class00650.N(class07211.field_11043);
            }
            if (!class06008.field_22178.equals((Object)class005002.L(L))) {
                n |= class00650.N(class07211.field_11034);
            }
            if (!class06008.field_22178.equals((Object)class005002.L(i))) {
                n |= class00650.N(class07211.field_11035);
            }
            if (!class06008.field_22178.equals((Object)class005002.L(R))) {
                n |= class00650.N(class07211.field_11039);
            }
            return n;
        });
    }

    public class00650(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true))).y(u, (Comparable)class06008.field_22178)).y(L, (Comparable)class06008.field_22178)).y(i, (Comparable)class06008.field_22178)).y(R, (Comparable)class06008.field_22178)).y((class08092)B, (Comparable)Boolean.valueOf(false)));
        this.Z = this.N(16.0f, 14.0f);
        this.O = this.N(24.0f, 24.0f);
        this.N(class013622, null);
    }

    private static class00500 U(class00500 class005002) {
        boolean bl = false;
        if (class005002.L(u) == class06008.field_22180) {
            class005002 = (class00500)class005002.y(u, (Comparable)class06008.field_22179);
            bl = true;
        }
        if (class005002.L(L) == class06008.field_22180) {
            class005002 = (class00500)class005002.y(L, (Comparable)class06008.field_22179);
            bl = true;
        }
        if (class005002.L(i) == class06008.field_22180) {
            class005002 = (class00500)class005002.y(i, (Comparable)class06008.field_22179);
            bl = true;
        }
        if (class005002.L(R) == class06008.field_22180) {
            class005002 = (class00500)class005002.y(R, (Comparable)class06008.field_22179);
            bl = true;
        }
        if (bl) {
            class005002 = (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true));
        }
        return class005002;
    }

    public class00494 z(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return this.Z.apply(class005002);
        }
        return super.z(class005002);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)B)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private void y(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)this.S[this.T(class005002)]);
        }
    }

    protected boolean y(class00500 class005002) {
        return (Boolean)class005002.L((class08092)B) == false;
    }

    private class00494[] y(float f, float f2) {
        float f3 = 4.0f;
        float f4 = 12.0f;
        float f5 = 5.0f;
        float f6 = 11.0f;
        class00494 class004942 = class00891.N((double)4.0, (double)0.0, (double)4.0, (double)12.0, (double)f, (double)12.0);
        class00494 class004943 = class00891.N((double)5.0, (double)0.0, (double)0.0, (double)11.0, (double)f2, (double)11.0);
        class00494 class004944 = class00891.N((double)5.0, (double)0.0, (double)5.0, (double)11.0, (double)f2, (double)16.0);
        class00494 class004945 = class00891.N((double)0.0, (double)0.0, (double)5.0, (double)11.0, (double)f2, (double)11.0);
        class00494 class004946 = class00891.N((double)5.0, (double)0.0, (double)5.0, (double)16.0, (double)f2, (double)11.0);
        class00494[] class00494Array = new class00494[]{class00389.N(), class00891.N((double)4.0, (double)0.0, (double)5.0, (double)12.0, (double)f, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)4.0, (double)11.0, (double)f, (double)12.0), class00891.N((double)0.0, (double)0.0, (double)4.0, (double)12.0, (double)f, (double)16.0), class00891.N((double)4.0, (double)0.0, (double)0.0, (double)12.0, (double)f, (double)11.0), class00389.N((class00494)class004944, (class00494)class004943), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)12.0, (double)f, (double)12.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)12.0, (double)f, (double)16.0), class00891.N((double)5.0, (double)0.0, (double)4.0, (double)16.0, (double)f, (double)12.0), class00891.N((double)4.0, (double)0.0, (double)4.0, (double)16.0, (double)f, (double)16.0), class00389.N((class00494)class004945, (class00494)class004946), class00891.N((double)0.0, (double)0.0, (double)4.0, (double)16.0, (double)f, (double)16.0), class00891.N((double)4.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)12.0), class00891.N((double)4.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)12.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)16.0)};
        for (int i = 0; i < 16; ++i) {
            class00494Array[i] = class00389.N((class00494)class004942, (class00494)class00494Array[i]);
        }
        return class00494Array;
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00650.U((class00500)callbackInfoReturnable.getReturnValue()));
        }
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.O.apply(class005002);
    }

    private void N(class01362 class013622, CallbackInfo callbackInfo) {
        this.C = this.y(24.0f, 24.0f);
        this.S = this.y(16.0f, 14.0f);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00650.U((class00500)callbackInfoReturnable.getReturnValue()));
        }
    }

    private boolean N(class00500 class005002, boolean bl, class07211 class072112) {
        class00891 class008912 = class005002.i();
        boolean bl2 = class008912 instanceof class07188 && class07188.N((class00500)class005002, (class07211)class072112);
        boolean bl3 = class005002.N(class01210.q) || !class00650.m((class00500)class005002) && bl || class008912 instanceof class07100 || bl2;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl3);
        this.N(class005002, bl, class072112, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl3;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)B)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 == class07211.field_11033) {
            class00500 class005004 = super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
            class00500 class005005 = class005004;
            class005005 = new CallbackInfoReturnable("", true, (Object)class005005);
            this.y((CallbackInfoReturnable)class005005);
            if (class005005.isCancelled()) {
                return (class00500)class005005.getReturnValue();
            }
            return class005004;
        }
        if (class072112 == class07211.field_11036) {
            class00500 class005006 = this.N(class054872, class005002, class072093, class005003);
            class00500 class005007 = class005006;
            class005007 = new CallbackInfoReturnable("", true, (Object)class005007);
            this.y((CallbackInfoReturnable)class005007);
            if (class005007.isCancelled()) {
                return (class00500)class005007.getReturnValue();
            }
            return class005006;
        }
        class00500 class005008 = this.N(class054872, class072092, class005002, class072093, class005003, class072112);
        class00500 class005009 = class005008;
        class005009 = new CallbackInfoReturnable("", true, (Object)class005009);
        this.y((CallbackInfoReturnable)class005009);
        if (class005009.isCancelled()) {
            return (class00500)class005009.getReturnValue();
        }
        return class005008;
    }

    private static int N(class07211 class072112) {
        return 1 << class072112.u();
    }

    public class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07209 class072093 = class072092.method_10095();
        class07209 class072094 = class072092.method_10078();
        class07209 class072095 = class072092.method_10072();
        class07209 class072096 = class072092.method_10067();
        class07209 class072097 = class072092.method_10084();
        class00500 class005002 = class072992.method_8320(class072093);
        class00500 class005003 = class072992.method_8320(class072094);
        class00500 class005004 = class072992.method_8320(class072095);
        class00500 class005005 = class072992.method_8320(class072096);
        class00500 class005006 = class072992.method_8320(class072097);
        boolean bl = this.N(class005002, class005002.L((class07290)class072992, class072093, class07211.field_11035), class07211.field_11035);
        boolean bl2 = this.N(class005003, class005003.L((class07290)class072992, class072094, class07211.field_11039), class07211.field_11039);
        boolean bl3 = this.N(class005004, class005004.L((class07290)class072992, class072095, class07211.field_11043), class07211.field_11043);
        boolean bl4 = this.N(class005005, class005005.L((class07290)class072992, class072096, class07211.field_11034), class07211.field_11034);
        class00500 class005007 = (class00500)this.W().y((class08092)B, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        class00500 class005008 = this.N((class05487)class072992, class005007, class072097, class005006, bl, bl2, bl3, bl4);
        class00500 class005009 = class005008;
        class005009 = new CallbackInfoReturnable("", true, (Object)class005009);
        this.N((CallbackInfoReturnable)class005009);
        if (class005009.isCancelled()) {
            return (class00500)class005009.getReturnValue();
        }
        return class005008;
    }

    public MapCodec<class00650> N() {
        return N;
    }

    private Function<class00500, class00494> N(float f, float f2) {
        class00494 class004942 = class00891.y((double)8.0, (double)0.0, (double)f);
        int n = 6;
        Map var5 = class00389.L((class00494)class00891.N((double)6.0, (double)0.0, (double)f2, (double)0.0, (double)11.0));
        Map var6 = class00389.L((class00494)class00891.N((double)6.0, (double)0.0, (double)f, (double)0.0, (double)11.0));
        return this.N((T class005002) -> {
            class00494 class004943 = (Boolean)class005002.L((class08092)y) != false ? class004942 : class00389.N();
            for (Map.Entry<class07211, class08064<class06008>> entry : M.entrySet()) {
                class004943 = class00389.N((class00494)class004943, (class00494)(switch ((class06008)class005002.L((class08092)entry.getValue())) {
                    default -> throw new MatchException(null, null);
                    case class06008.field_22178 -> class00389.N();
                    case class06008.field_22179 -> (class00494)var5.get(entry.getKey());
                    case class06008.field_22180 -> (class00494)var6.get(entry.getKey());
                }));
            }
            return class004943;
        }, new class08092[]{B});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.Z.apply(class005002);
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)this.C[this.T(class005002)]);
        }
    }

    private void N(class00500 class005002, boolean bl, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && !Block1_14.isExceptBlockForAttachWithPiston((class00891)class005002.i())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private class06008 N(boolean bl, class00494 class004942, class00494 class004943) {
        if (bl) {
            if (class00650.N(class004942, class004943)) {
                return class06008.field_22180;
            }
            return class06008.field_22179;
        }
        return class06008.field_22178;
    }

    private class00500 N(class00500 class005002, boolean bl, boolean bl2, boolean bl3, boolean bl4, class00494 class004942) {
        return (class00500)((class00500)((class00500)((class00500)class005002.y(u, (Comparable)this.N(bl, class004942, A.get(class07211.field_11043)))).y(L, (Comparable)this.N(bl2, class004942, A.get(class07211.field_11034)))).y(i, (Comparable)this.N(bl3, class004942, A.get(class07211.field_11035)))).y(R, (Comparable)this.N(bl4, class004942, A.get(class07211.field_11039)));
    }

    private boolean N(class00500 class005002, class00500 class005003, class00494 class004942) {
        if (class005003.i() instanceof class00650 && (Boolean)class005003.L((class08092)y) != false) {
            return true;
        }
        class06008 class060082 = (class06008)class005002.L(u);
        class06008 class060083 = (class06008)class005002.L(i);
        class06008 class060084 = (class06008)class005002.L(L);
        class06008 class060085 = (class06008)class005002.L(R);
        boolean bl = class060083 == class06008.field_22178;
        boolean bl2 = class060085 == class06008.field_22178;
        boolean bl3 = class060084 == class06008.field_22178;
        boolean bl4 = class060082 == class06008.field_22178;
        if (bl4 && bl && bl2 && bl3 || bl4 != bl || bl2 != bl3) {
            return true;
        }
        if (class060082 == class06008.field_22180 && class060083 == class06008.field_22180 || class060084 == class06008.field_22180 && class060085 == class06008.field_22180) {
            return false;
        }
        return class005003.N(class01210.yL) || class00650.N(class004942, F);
    }

    private class00500 N(class05487 class054872, class00500 class005002, class07209 class072092, class00500 class005003, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        class00494 class004942 = class005003.M((class07290)class054872, class072092).method_20538(class07211.field_11033);
        class00500 class005004 = this.N(class005002, bl, bl2, bl3, bl4, class004942);
        return (class00500)class005004.y((class08092)y, (Comparable)Boolean.valueOf(this.N(class005004, class005003, class004942)));
    }

    private class00500 N(class05487 class054872, class07209 class072092, class00500 class005002, class07209 class072093, class00500 class005003, class07211 class072112) {
        class07211 class072113 = class072112.b();
        boolean bl = class072112 == class07211.field_11043 ? this.N(class005003, class005003.L((class07290)class054872, class072093, class072113), class072113) : class00650.N(class005002, u);
        boolean bl2 = class072112 == class07211.field_11034 ? this.N(class005003, class005003.L((class07290)class054872, class072093, class072113), class072113) : class00650.N(class005002, L);
        boolean bl3 = class072112 == class07211.field_11035 ? this.N(class005003, class005003.L((class07290)class054872, class072093, class072113), class072113) : class00650.N(class005002, i);
        boolean bl4 = class072112 == class07211.field_11039 ? this.N(class005003, class005003.L((class07290)class054872, class072093, class072113), class072113) : class00650.N(class005002, R);
        class07209 class072094 = class072092.method_10084();
        class00500 class005004 = class054872.method_8320(class072094);
        return this.N(class054872, class005002, class072094, class005004, bl, bl2, bl3, bl4);
    }

    private class00500 N(class05487 class054872, class00500 class005002, class07209 class072092, class00500 class005003) {
        boolean bl = class00650.N(class005002, u);
        boolean bl2 = class00650.N(class005002, L);
        boolean bl3 = class00650.N(class005002, i);
        boolean bl4 = class00650.N(class005002, R);
        return this.N(class054872, class005002, class072092, class005003, bl, bl2, bl3, bl4);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        switch (class071112) {
            case field_11300: {
                return (class00500)((class00500)class005002.y(u, (Comparable)((class06008)class005002.L(i)))).y(i, (Comparable)((class06008)class005002.L(u)));
            }
            case field_11301: {
                return (class00500)((class00500)class005002.y(L, (Comparable)((class06008)class005002.L(R)))).y(R, (Comparable)((class06008)class005002.L(L)));
            }
        }
        return super.N(class005002, class071112);
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        switch (class069932) {
            case field_11464: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(u, (Comparable)((class06008)class005002.L(i)))).y(L, (Comparable)((class06008)class005002.L(R)))).y(i, (Comparable)((class06008)class005002.L(u)))).y(R, (Comparable)((class06008)class005002.L(L)));
            }
            case field_11465: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(u, (Comparable)((class06008)class005002.L(L)))).y(L, (Comparable)((class06008)class005002.L(i)))).y(i, (Comparable)((class06008)class005002.L(R)))).y(R, (Comparable)((class06008)class005002.L(u)));
            }
            case field_11463: {
                return (class00500)((class00500)((class00500)((class00500)class005002.y(u, (Comparable)((class06008)class005002.L(R)))).y(L, (Comparable)((class06008)class005002.L(u)))).y(i, (Comparable)((class06008)class005002.L(L)))).y(R, (Comparable)((class06008)class005002.L(i)));
            }
        }
        return class005002;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, u, L, R, i, B});
    }

    private static boolean N(class00500 class005002, class08092<class06008> class080922) {
        return class005002.L(class080922) != class06008.field_22178;
    }

    private static boolean N(class00494 class004942, class00494 class004943) {
        return !class00389.L((class00494)class004943, (class00494)class004942, (class07003)class07003.i);
    }
}

