/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00331
 *  minecraft.class00394
 *  minecraft.class00971
 *  minecraft.class00985
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01944
 *  minecraft.class01958
 *  minecraft.class01967
 *  minecraft.class02058
 *  minecraft.class03358
 *  minecraft.class03490
 *  minecraft.class04792
 *  minecraft.class04802
 *  minecraft.class04806
 *  minecraft.class04811
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class07311
 *  minecraft.class08097
 *  minecraft.class08141
 *  minecraft.class08388
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00331;
import minecraft.class00394;
import minecraft.class00971;
import minecraft.class00985;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01944;
import minecraft.class01958;
import minecraft.class01967;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class03490;
import minecraft.class04792;
import minecraft.class04802;
import minecraft.class04806;
import minecraft.class04811;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class07311;
import minecraft.class08097;
import minecraft.class08141;
import minecraft.class08388;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03574
implements class03358<class01958, class00971> {
    private final class08097 N;
    private static final String y = "neck";
    private static final String L = "front";
    private static final String u = "back";
    private static final String i = "left";
    private static final String R = "right";
    private static final String M = "top";
    private static final String B = "bottom";
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class01686 P;
    private static final float s = 0.125f;

    public class03574(class01140 class011402, class08097 class080972) {
        this.N = class080972;
        class01686 class016862 = class011402.N(class04802.NQ);
        this.Z = class016862.y(y);
        this.m = class016862.y(M);
        this.P = class016862.y(B);
        class01686 class016863 = class011402.N(class04802.NO);
        this.z = class016863.y(L);
        this.U = class016863.y(u);
        this.E = class016863.y(i);
        this.W = class016863.y(R);
    }

    public class03574(class00331 class003312) {
        this(class003312.y(), class003312.L());
    }

    public class03574(class04811 class048112) {
        this(class048112.R(), class048112.B());
    }

    public static class04806 u() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04822 class048222 = class04822.L().N(1, 0).N(0.0f, 0.0f, 0.0f, 14.0f, 16.0f, 0.0f, EnumSet.of(class07211.field_11043));
        class048392.N(u, class048222, class04838.N((float)15.0f, (float)16.0f, (float)1.0f, (float)0.0f, (float)0.0f, (float)((float)Math.PI)));
        class048392.N(i, class048222, class04838.N((float)1.0f, (float)16.0f, (float)1.0f, (float)0.0f, (float)-1.5707964f, (float)((float)Math.PI)));
        class048392.N(R, class048222, class04838.N((float)15.0f, (float)16.0f, (float)15.0f, (float)0.0f, (float)1.5707964f, (float)((float)Math.PI)));
        class048392.N(L, class048222, class04838.N((float)1.0f, (float)16.0f, (float)15.0f, (float)((float)Math.PI), (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)16, (int)16);
    }

    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        this.Z.N(class014212, consumer);
        this.m.N(class014212, consumer);
        this.P.N(class014212, consumer);
    }

    public void N(class01421 class014212, class01237 class012372, int n, int n2, class03490 class034902, int n3) {
        class07311 class073112 = class05911.g.N(class06851::u);
        class08388 class083882 = this.N.N(class05911.g);
        class012372.N(this.Z, class014212, class073112, n, n2, class083882, false, false, -1, null, n3);
        class012372.N(this.m, class014212, class073112, n, n2, class083882, false, false, -1, null, n3);
        class012372.N(this.P, class014212, class073112, n, n2, class083882, false, false, -1, null, n3);
        class05913 class059132 = class03574.N(class034902.i());
        class012372.N(this.z, class014212, class059132.N(class06851::u), n, n2, this.N.N(class059132), false, false, -1, null, n3);
        class05913 class059133 = class03574.N(class034902.y());
        class012372.N(this.U, class014212, class059133.N(class06851::u), n, n2, this.N.N(class059133), false, false, -1, null, n3);
        class05913 class059134 = class03574.N(class034902.L());
        class012372.N(this.E, class014212, class059134.N(class06851::u), n, n2, this.N.N(class059134), false, false, -1, null, n3);
        class05913 class059135 = class03574.N(class034902.u());
        class012372.N(this.W, class014212, class059135.N(class06851::u), n, n2, this.N.N(class059135), false, false, -1, null, n3);
    }

    public void N(class01958 class019582, class00971 class009712, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class019582, (class00985)class009712, f, class068892, class081412);
        class009712.u = class019582.z();
        class009712.i = class019582.u();
        class01967 class019672 = class019582.R;
        class009712.L = class019672 != null && class019582.G() != null ? ((float)(class019582.G().N() - class019582.i) + f) / (float)class019672.field_46666 : 0.0f;
    }

    private static class05913 N(Optional<class06581> optional) {
        class05913 class059132;
        if (optional.isPresent() && (class059132 = class05911.N((class05946)class01944.N((class06581)optional.get()))) != null) {
            return class059132;
        }
        return class05911.I;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04834 class048342 = new class04834(0.2f);
        class04834 class048343 = new class04834(-0.1f);
        class048392.N(y, class04822.L().N(0, 0).N(4.0f, 17.0f, 4.0f, 8.0f, 3.0f, 8.0f, class048343).N(0, 5).N(5.0f, 20.0f, 5.0f, 6.0f, 1.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)37.0f, (float)16.0f, (float)((float)Math.PI), (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(-14, 13).N(0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 14.0f);
        class048392.N(M, class048222, class04838.N((float)1.0f, (float)16.0f, (float)1.0f, (float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N(B, class048222, class04838.N((float)1.0f, (float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }

    public void N(class00971 class009712, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class07211 class072112 = class009712.i;
        class014212.N(0.5, 0.0, 0.5);
        class014212.N((Quaternionfc)class02058.u.N(180.0f - class072112.U()));
        class014212.N(-0.5, 0.0, -0.5);
        if (class009712.L >= 0.0f && class009712.L <= 1.0f) {
            if (class009712.y == class01967.field_46664) {
                float f = 0.015625f;
                float f2 = class009712.L * ((float)Math.PI * 2);
                float f3 = -1.5f * (class04995.P((double)f2) + 0.5f) * class04995.m((double)(f2 / 2.0f));
                class014212.N((Quaternionfc)class02058.y.rotation(f3 * 0.015625f), 0.5f, 0.0f, 0.5f);
                float f4 = class04995.m((double)f2);
                class014212.N((Quaternionfc)class02058.R.rotation(f4 * 0.015625f), 0.5f, 0.0f, 0.5f);
            } else {
                float f = class04995.m((double)(-class009712.L * 3.0f * (float)Math.PI)) * 0.125f;
                float f5 = 1.0f - class009712.L;
                class014212.N((Quaternionfc)class02058.u.rotation(f * f5), 0.5f, 0.0f, 0.5f);
            }
        }
        this.N(class014212, class012372, class009712.Z, class01384.u, class009712.u, 0);
        class014212.y();
    }

    public class00971 i() {
        return new class00971();
    }
}

