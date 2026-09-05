/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00331
 *  minecraft.class00950
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07027
 *  minecraft.class07211
 *  minecraft.class07278
 *  minecraft.class08092
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00331;
import minecraft.class00950;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class03353;
import minecraft.class03358;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07027;
import minecraft.class07211;
import minecraft.class07278;
import minecraft.class08092;
import minecraft.class08097;
import minecraft.class08141;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03360
implements class03358<class07278, class00950> {
    private final class08097 N;
    private final class03353 y;

    public class03360(class01140 class011402, class08097 class080972) {
        this.N = class080972;
        this.y = new class03353(class011402.N(class04802.uR));
    }

    public class03360(class00331 class003312) {
        this(class003312.y(), class003312.L());
    }

    public class03360(class04811 class048112) {
        this(class048112.R(), class048112.B());
    }

    public void N(class07211 class072112, float f, Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        this.N(class014212, class072112, f);
        this.y.method_63512().N(class014212, consumer);
    }

    public void N(class01421 class014212, class01237 class012372, int n, int n2, class07211 class072112, float f, @Nullable class08141 class081412, class05913 class059132, int n3) {
        class014212.N();
        this.N(class014212, class072112, f);
        class012372.N((class06271)this.y, (Object)Float.valueOf(f), class014212, class059132.N(arg_0 -> ((class03353)this.y).method_23500(arg_0)), n, n2, -1, this.N.N(class059132), n3, class081412);
        class014212.y();
    }

    @Override
    public void N(class07278 class072782, class00950 class009502, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class072782, class009502, f, class068892, class081412);
        class009502.N = (class07211)class072782.w().N((class08092)class07027.L, (Comparable)class07211.field_11036);
        class009502.y = class072782.z();
        class009502.L = class072782.N(f);
    }

    @Override
    public void N(class00950 class009502, class01421 class014212, class01237 class012372, class06959 class069592) {
        class06563 class065632 = class009502.y;
        class05913 class059132 = class065632 == null ? class05911.l : class05911.u((class06563)class065632);
        this.N(class014212, class012372, class009502.Z, class01384.u, class009502.N, class009502.L, class009502.z, class059132, 0);
    }

    @Override
    public class00950 i() {
        return new class00950();
    }

    private void N(class01421 class014212, class07211 class072112, float f) {
        class014212.N(0.5f, 0.5f, 0.5f);
        float f2 = 0.9995f;
        class014212.y(0.9995f, 0.9995f, 0.9995f);
        class014212.N((Quaternionfc)class072112.y());
        class014212.y(1.0f, -1.0f, -1.0f);
        class014212.N(0.0f, -1.0f, 0.0f);
        this.y.method_2819(Float.valueOf(f));
    }
}

