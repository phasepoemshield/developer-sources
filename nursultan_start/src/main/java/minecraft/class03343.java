/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  java.lang.MatchException
 *  minecraft.class00394
 *  minecraft.class00476
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00958
 *  minecraft.class00959
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02443
 *  minecraft.class02774
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class05993
 *  minecraft.class06025
 *  minecraft.class06029
 *  minecraft.class06271
 *  minecraft.class06638
 *  minecraft.class06842
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class07274
 *  minecraft.class07281
 *  minecraft.class07311
 *  minecraft.class08092
 *  minecraft.class08097
 *  minecraft.class08141
 *  minecraft.class08388
 *  minecraft.class08950
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import minecraft.class00394;
import minecraft.class00476;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00958;
import minecraft.class00959;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02443;
import minecraft.class02774;
import minecraft.class03358;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class05993;
import minecraft.class06025;
import minecraft.class06029;
import minecraft.class06271;
import minecraft.class06638;
import minecraft.class06842;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class07274;
import minecraft.class07281;
import minecraft.class07311;
import minecraft.class08092;
import minecraft.class08097;
import minecraft.class08141;
import minecraft.class08388;
import minecraft.class08950;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class03343<T extends class00394>
implements class03358<T, class00958> {
    private final class08097 N;
    private final class02443 y;
    private final class02443 L;
    private final class02443 u;
    private final boolean i;

    public class03343(class04811 class048112) {
        this.N = class048112.B();
        this.i = class03343.N();
        this.y = new class02443(class048112.N(class04802.D));
        this.L = new class02443(class048112.N(class04802.NV));
        this.u = new class02443(class048112.N(class04802.Ne));
    }

    @Override
    public class00958 i() {
        return new class00958();
    }

    @Override
    public void N(class00958 class009582, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(-class009582.L));
        class014212.N(-0.5f, -0.5f, -0.5f);
        float f = class009582.y;
        f = 1.0f - f;
        f = 1.0f - f * f * f;
        class05913 class059132 = class05911.N((class00959)class009582.u, (class06638)class009582.N);
        class07311 class073112 = class059132.N(class06851::R);
        class08388 class083882 = this.N.N(class059132);
        if (class009582.N != class06638.field_12569) {
            if (class009582.N == class06638.field_12574) {
                class012372.N((class06271)this.L, (Object)Float.valueOf(f), class014212, class073112, class009582.Z, class01384.u, -1, class083882, 0, class009582.z);
            } else {
                class012372.N((class06271)this.u, (Object)Float.valueOf(f), class014212, class073112, class009582.Z, class01384.u, -1, class083882, 0, class009582.z);
            }
        } else {
            class012372.N((class06271)this.y, (Object)Float.valueOf(f), class014212, class073112, class009582.Z, class01384.u, -1, class083882, 0, class009582.z);
        }
        class014212.y();
    }

    private class00959 N(class00394 class003942, boolean bl) {
        if (class003942 instanceof class07281) {
            return class00959.field_62697;
        }
        if (bl) {
            return class00959.field_62698;
        }
        if (class003942 instanceof class00476) {
            return class00959.field_62699;
        }
        class00891 class008912 = class003942.w().i();
        if (class008912 instanceof class08950) {
            class08950 class089502 = (class08950)class008912;
            return switch (class089502.y()) {
                default -> throw new MatchException(null, null);
                case class02774.field_28704 -> class00959.field_62700;
                case class02774.field_28705 -> class00959.field_62701;
                case class02774.field_28706 -> class00959.field_62702;
                case class02774.field_28707 -> class00959.field_62703;
            };
        }
        return class00959.field_62704;
    }

    public static boolean N() {
        return class06842.L();
    }

    @Override
    public void N(T t, class00958 class009582, float f, class06889 class068892, @Nullable class08141 class081412) {
        class06025 class060252;
        class00891 class008912;
        class03358.super.N(t, class009582, f, class068892, class081412);
        boolean bl = t.G() != null;
        class00500 class005002 = bl ? t.w() : (class00500)class00869.LA.W().y((class08092)class00860.u, (Comparable)class07211.field_11035);
        class009582.N = class005002.y((class08092)class00860.i) ? (class06638)class005002.L((class08092)class00860.i) : class06638.field_12569;
        class009582.L = ((class07211)class005002.L((class08092)class00860.u)).U();
        class009582.u = this.N((class00394)t, this.i);
        if (bl && (class008912 = class005002.i()) instanceof class00860) {
            class06025 var8 = ((class00860)class008912).N(class005002, t.G(), t.d(), true);
        } else {
            class060252 = class06029::y;
        }
        class009582.y = ((Float2FloatFunction)class060252.apply(class00860.N((class07274)((class07274)t)))).get(f);
        if (class009582.N != class06638.field_12569) {
            class009582.Z = ((Int2IntFunction)class060252.apply((class06029)new class05993())).applyAsInt(class009582.Z);
        }
    }
}

