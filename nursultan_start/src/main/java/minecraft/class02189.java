/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02132
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class05911
 *  minecraft.class06078
 *  minecraft.class06563
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07144
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08489
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02132;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class05911;
import minecraft.class06078;
import minecraft.class06563;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07144;
import minecraft.class07438;
import minecraft.class08476;
import minecraft.class08489;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class02189
extends class02840<class07144, class08489, class02132> {
    private static final class01894 N = class05911.l.y().N(string -> "textures/" + string + ".png");
    private static final class01894[] i = (class01894[])class05911.d.stream().map(class059132 -> class059132.y().N(string -> "textures/" + string + ".png")).toArray(class01894[]::new);

    private static /* synthetic */ String L(String string) {
        return "textures/" + string + ".png";
    }

    public class02189(class04832 class048322) {
        super(class048322, (class06078)new class02132(class048322.N(class04802.ui)), 0.0f);
    }

    public class08489 method_55269() {
        return new class08489();
    }

    public class01894 y(class08489 class084892) {
        return class02189.N(class084892.y);
    }

    public class06889 method_23169(class08489 class084892) {
        return class084892.N;
    }

    protected void y(class08489 class084892, class01421 class014212, float f, float f2) {
        super.y((class08476)class084892, class014212, f + 180.0f, f2);
        class014212.N((Quaternionfc)class084892.R.b().y(), 0.0f, 0.5f, 0.0f);
    }

    public static class01894 N(@Nullable class06563 class065632) {
        if (class065632 == null) {
            return N;
        }
        return i[class065632.N()];
    }

    public void method_62354(class07144 class071442, class08489 class084892, float f) {
        super.method_62354((class07438)class071442, (class08476)class084892, f);
        class084892.N = Objects.requireNonNullElse(class071442.i(f), class06889.L);
        class084892.y = class071442.m();
        class084892.L = class071442.u(f);
        class084892.u = class071442.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
        class084892.i = class071442.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        class084892.R = class071442.E();
    }

    public boolean method_3933(class07144 class071442, class01383 class013832, double d, double d2, double d3) {
        if (super.method_3933((class07049)class071442, class013832, d, d2, d3)) {
            return true;
        }
        class06889 class068892 = class071442.i(0.0f);
        if (class068892 == null) {
            return false;
        }
        class07078 var10 = class071442.method_5864();
        float f = var10.U() / 2.0f;
        float f2 = var10.z() / 2.0f;
        class06889 class068893 = class06889.L((class00753)class071442.method_24515());
        return class013832.method_23093(new class00734(class068892.M, class068892.B + (double)f, class068892.Z, class068893.M, class068893.B + (double)f, class068893.Z).L((double)f2, (double)f, (double)f2));
    }
}

