/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09467
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01340
 *  minecraft.class01894
 *  minecraft.class02957
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04043
 *  minecraft.class04053
 *  minecraft.class04227
 *  minecraft.class04641
 *  minecraft.class04689
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06563
 *  minecraft.class06889
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 *  minecraft.class07752
 *  minecraft.class08089
 *  minecraft.class08216
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09467;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01340;
import minecraft.class01344;
import minecraft.class01351;
import minecraft.class01354;
import minecraft.class01371;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04043;
import minecraft.class04053;
import minecraft.class04227;
import minecraft.class04641;
import minecraft.class04689;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06563;
import minecraft.class06889;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class07752;
import minecraft.class08089;
import minecraft.class08216;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01362 {
    public static final Codec<class01362> N = MapCodec.unitCodec(() -> class01362.N());
    Function<class00500, class04689> y = class005002 -> class04689.N;
    boolean L = true;
    class07752 u = class07752.R;
    ToIntFunction<class00500> i = class005002 -> 0;
    float R;
    float M;
    boolean B;
    boolean Z;
    float z = 0.6f;
    float U = 1.0f;
    float E = 1.0f;
    private @Nullable class05946<class00891> I;
    private class08216<class00891, Optional<class05946<class05074>>> J = class059462 -> Optional.of(class05946.N((class05946)class04227.yJ, (class01894)class059462.N().R("blocks/")));
    private class08216<class00891, String> o = class059462 -> class07536.N((String)"block", (class01894)class059462.N());
    boolean W = true;
    boolean m;
    boolean P;
    @Deprecated
    boolean s;
    @Deprecated
    boolean T;
    boolean b;
    class04641 j = class04641.field_15974;
    boolean v = true;
    class08089 n = class08089.field_12648;
    boolean t;
    class01371<class07078<?>> G = (class005002, class072902, class072092, class070782) -> class005002.L(class072902, class072092, class07211.field_11036) && class005002.m() < 14;
    class01340 l = (class005002, class072902, class072092) -> class005002.W(class072902, class072092);
    class01340 d;
    class01340 w = this.d = (class005002, class072902, class072092) -> class005002.M() && class005002.W(class072902, class072092);
    class01340 k = (class005002, class072902, class072092) -> false;
    class01340 Y = (class005002, class072902, class072092) -> false;
    boolean Q;
    class03767 O = class03794.M;
    @Nullable class01351 g;
    private static final float q = -0.25f;
    private static final float K = 0.25f;
    private static final int V = 16;

    public class01362 L(float f) {
        this.E = f;
        return this;
    }

    public class01362 L() {
        this.W = false;
        return this;
    }

    public class01362 L(class01340 class013402) {
        this.w = class013402;
        return this;
    }

    public class01362 M() {
        this.J = class08216.N(Optional.empty());
        return this;
    }

    public class01362 P() {
        this.v = false;
        return this;
    }

    public String T() {
        return (String)this.o.get(Objects.requireNonNull(this.I, "Block id not set"));
    }

    protected class01362() {
    }

    public Optional<class05946<class05074>> B() {
        return (Optional)this.J.get(Objects.requireNonNull(this.I, "Block id not set"));
    }

    public class01362 Z() {
        this.P = true;
        return this;
    }

    public class01362 i() {
        this.Z = true;
        return this;
    }

    public class01362 i(class01340 class013402) {
        this.Y = class013402;
        return this;
    }

    public class01362 i(float f) {
        this.M = f;
        return this;
    }

    public class01362 s() {
        this.t = true;
        return this;
    }

    public class01362 m() {
        this.B = true;
        return this;
    }

    public class01362 U() {
        this.b = true;
        return this;
    }

    public class01362 z() {
        this.s = true;
        return this;
    }

    public class01362 u() {
        return this.u(0.0f);
    }

    public class01362 u(float f) {
        this.N(f, f);
        return this;
    }

    public class01362 u(class01340 class013402) {
        this.k = class013402;
        return this;
    }

    public class01362 y() {
        this.L = false;
        this.W = false;
        return this;
    }

    public class01362 y(class01340 class013402) {
        this.d = class013402;
        return this;
    }

    @Deprecated
    public static class01362 y(class01354 class013542) {
        class01362 class013622 = new class01362();
        class01362 class013623 = class013542.X;
        class013622.M = class013623.M;
        class013622.R = class013623.R;
        class013622.L = class013623.L;
        class013622.Z = class013623.Z;
        class013622.i = class013623.i;
        class013622.y = class013623.y;
        class013622.u = class013623.u;
        class013622.z = class013623.z;
        class013622.U = class013623.U;
        class013622.Q = class013623.Q;
        class013622.W = class013623.W;
        class013622.m = class013623.m;
        class013622.P = class013623.P;
        class013622.s = class013623.s;
        class013622.T = class013623.T;
        class013622.b = class013623.b;
        class013622.j = class013623.j;
        class013622.B = class013623.B;
        class013622.g = class013623.g;
        class013622.v = class013623.v;
        class013622.O = class013623.O;
        class013622.Y = class013623.Y;
        class013622.n = class013623.n;
        class013622.t = class013623.t;
        return class013622;
    }

    public class01362 y(float f) {
        this.U = f;
        return this;
    }

    @Deprecated
    public class01362 E() {
        this.T = true;
        return this;
    }

    private static class06889 N(class07209 class072092, class01344 class013442) {
        long l = class01362.N(class072092.method_10263(), class072092.method_10260());
        long l2 = class04043.N((long)l);
        long l3 = class04043.N((long)(l + -7046029254386353131L));
        class04053 class040532 = new class04053(l2, l3);
        float f = class01362.N(-0.25f, 0.25f, class01362.N(class040532.N()));
        float f2 = switch (class09467.N[class013442.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> {
                class040532.N();
                yield 0.0f;
            }
            case 2 -> class01362.N(-0.2f, 0.0f, class01362.N(class040532.N()));
            case 3 -> 0.0f;
        };
        float f3 = class01362.N(-0.25f, 0.25f, class01362.N(class040532.N()));
        return new class06889((double)f, (double)f2, (double)f3);
    }

    private static float N(long l) {
        return (float)(l >>> 40) * 5.9604645E-8f;
    }

    private static float N(float f, float f2, float f3) {
        if (f >= f2) {
            return f;
        }
        float f4 = (f2 - f) / 15.0f;
        float f5 = (float)Math.floor(16.0f * f3);
        return f + f5 * f4;
    }

    public static class01362 N() {
        return new class01362();
    }

    private void N(class01344 class013442, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) && class013442 != class01344.field_10656) {
            this.g = (class005002, class072092) -> class01362.N(class072092, class013442);
        }
    }

    public static class01362 N(class01354 class013542) {
        class01362 class013622 = class01362.y(class013542);
        class01362 class013623 = class013542.X;
        class013622.E = class013623.E;
        class013622.l = class013623.l;
        class013622.G = class013623.G;
        class013622.k = class013623.k;
        class013622.d = class013623.d;
        class013622.w = class013623.w;
        class013622.J = class013623.J;
        class013622.o = class013623.o;
        return class013622;
    }

    private static long N(int n, int n2) {
        long l = 116129781L * (long)n2 ^ 13442693585698817L * Integer.toUnsignedLong(n) >> 32;
        return (long)((int)(l * (42317861L * l + 11L) >>> 16)) ^ 0x6A09E667F3BCC909L;
    }

    public class01362 N(class04641 class046412) {
        this.j = class046412;
        return this;
    }

    public class01362 N(class01371<class07078<?>> class013712) {
        this.G = class013712;
        return this;
    }

    public class01362 N_9(class01340 class013402) {
        this.l = class013402;
        return this;
    }

    public class01362 N(float f) {
        this.z = f;
        return this;
    }

    public class01362 N_25(Function<class00500, class04689> function) {
        this.y = function;
        return this;
    }

    public class01362 N(float f, float f2) {
        return this.i(f).R(f2);
    }

    public class01362 N(ToIntFunction<class00500> toIntFunction) {
        this.i = toIntFunction;
        return this;
    }

    public class01362 N(Optional<class05946<class05074>> optional) {
        this.J = class08216.N(optional);
        return this;
    }

    public class01362 N(class07752 class077522) {
        this.u = class077522;
        return this;
    }

    public class01362 N(class05946<class00891> class059462) {
        this.I = class059462;
        return this;
    }

    public class01362 N(String string) {
        this.o = class08216.N((Object)string);
        return this;
    }

    public class01362 N(class06563 class065632) {
        this.y = class005002 -> class065632.u();
        return this;
    }

    public class01362 N(class08089 class080892) {
        this.n = class080892;
        return this;
    }

    public class01362 N(class04689 class046892) {
        this.y = class005002 -> class046892;
        return this;
    }

    public class01362 N(class02957 ... class02957Array) {
        this.O = class03794.i.N(class02957Array);
        return this;
    }

    public class01362 N(class01344 class013442) {
        this.g = switch (class013442.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> null;
            case 2 -> (class005002, class072092) -> {
                class00891 class008912 = class005002.i();
                long l = class04995.y((int)class072092.method_10263(), (int)0, (int)class072092.method_10260());
                double d = ((double)((float)(l >> 4 & 0xFL) / 15.0f) - 1.0) * (double)class008912.l();
                float f = class008912.G();
                double d2 = class04995.N((double)(((double)((float)(l & 0xFL) / 15.0f) - 0.5) * 0.5), (double)(-f), (double)f);
                double d3 = class04995.N((double)(((double)((float)(l >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5), (double)(-f), (double)f);
                return new class06889(d2, d, d3);
            };
            case 1 -> (class005002, class072092) -> {
                class00891 class008912 = class005002.i();
                long l = class04995.y((int)class072092.method_10263(), (int)0, (int)class072092.method_10260());
                float f = class008912.G();
                double d = class04995.N((double)(((double)((float)(l & 0xFL) / 15.0f) - 0.5) * 0.5), (double)(-f), (double)f);
                double d2 = class04995.N((double)(((double)((float)(l >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5), (double)(-f), (double)f);
                return new class06889(d, 0.0, d2);
            };
        };
        this.N(class013442, null);
        return this;
    }

    public class01362 W() {
        this.m = true;
        return this;
    }

    public class01362 R() {
        this.Q = true;
        return this;
    }

    public class01362 R(float f) {
        this.R = Math.max(0.0f, f);
        return this;
    }
}

