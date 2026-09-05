/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  minecraft.class00331
 *  minecraft.class00387
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00979
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04792
 *  minecraft.class04802
 *  minecraft.class04806
 *  minecraft.class04811
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class05993
 *  minecraft.class05994
 *  minecraft.class06025
 *  minecraft.class06029
 *  minecraft.class06244
 *  minecraft.class06260
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06637
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07789
 *  minecraft.class08092
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.function.Consumer;
import minecraft.class00331;
import minecraft.class00387;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00979;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class04792;
import minecraft.class04802;
import minecraft.class04806;
import minecraft.class04811;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class05993;
import minecraft.class05994;
import minecraft.class06025;
import minecraft.class06029;
import minecraft.class06244;
import minecraft.class06260;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06637;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07789;
import minecraft.class08092;
import minecraft.class08097;
import minecraft.class08141;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03357
implements class03358<class00387, class00979> {
    private final class08097 N;
    private final class06260 y;
    private final class06260 L;

    public class03357(class08097 class080972, class01140 class011402) {
        this.N = class080972;
        this.y = new class06260(class011402.N(class04802.n), class06851::u);
        this.L = new class06260(class011402.N(class04802.v), class06851::u);
    }

    public class03357(class00331 class003312) {
        this(class003312.L(), class003312.y());
    }

    public class03357(class04811 class048112) {
        this(class048112.B(), class048112.R());
    }

    public static class04806 u() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("main", class04822.L().N(0, 22).N(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), class04838.N);
        class048392.N("left_leg", class04822.L().N(50, 0).N(0.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), class04838.y((float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(50, 12).N(-16.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f), class04838.y((float)1.5707964f, (float)0.0f, (float)4.712389f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class03357.N(class014212, false, class07211.field_11035);
        this.y.method_63512().N(class014212, consumer);
        class014212.i();
        class03357.N(class014212, true, class07211.field_11035);
        this.L.method_63512().N(class014212, consumer);
    }

    private static void N(class01421 class014212, boolean bl, class07211 class072112) {
        class014212.N(0.0f, 0.5625f, bl ? -1.0f : 0.0f);
        class014212.N((Quaternionfc)class02058.y.N(90.0f));
        class014212.N(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.R.N(180.0f + class072112.U()));
        class014212.N(-0.5f, -0.5f, -0.5f);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("main", class04822.L().N(0, 0).N(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f), class04838.N);
        class048392.N("left_leg", class04822.L().N(50, 6).N(0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), class04838.y((float)1.5707964f, (float)0.0f, (float)1.5707964f));
        class048392.N("right_leg", class04822.L().N(50, 18).N(-16.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f), class04838.y((float)1.5707964f, (float)0.0f, (float)((float)Math.PI)));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    @Override
    public void N(class00387 class003872, class00979 class009792, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class003872, class009792, f, class068892, class081412);
        class009792.N = class003872.L();
        class009792.y = (class07211)class003872.w().L((class08092)class07789.R);
        boolean bl = class009792.L = class003872.w().L((class08092)class07789.y) == class06637.field_12560;
        if (class003872.G() != null) {
            class06025 var6 = class05994.N((class00404)class00404.field_11910, class07789::E, class07789::U, (class08092)class00860.u, (class00500)class003872.w(), (class07284)class003872.G(), (class07209)class003872.d(), (class072842, class072092) -> false);
            class009792.Z = ((Int2IntFunction)var6.apply((class06029)new class05993())).get(class009792.Z);
        }
    }

    @Override
    public void N(class00979 class009792, class01421 class014212, class01237 class012372, class06959 class069592) {
        class05913 class059132 = class05911.N((class06563)class009792.N);
        this.N(class014212, class012372, class009792.L ? this.y : this.L, class009792.y, class059132, class009792.Z, class01384.u, false, class009792.z, 0);
    }

    public void N(class01421 class014212, class01237 class012372, int n, int n2, class05913 class059132, int n3) {
        this.N(class014212, class012372, this.y, class07211.field_11035, class059132, n, n2, false, null, n3);
        this.N(class014212, class012372, this.L, class07211.field_11035, class059132, n, n2, true, null, n3);
    }

    private void N(class01421 class014212, class01237 class012372, class06260 class062602, class07211 class072112, class05913 class059132, int n, int n2, boolean bl, @Nullable class08141 class081412, int n3) {
        class014212.N();
        class03357.N(class014212, bl, class072112);
        class012372.N((class06271)class062602, (Object)class06244.field_17274, class014212, class059132.N(class06851::u), n, n2, -1, this.N.N(class059132), n3, class081412);
        class014212.y();
    }

    @Override
    public class00979 i() {
        return new class00979();
    }
}

