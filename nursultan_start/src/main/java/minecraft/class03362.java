/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00396
 *  minecraft.class00991
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04802
 *  minecraft.class04806
 *  minecraft.class04811
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04995
 *  minecraft.class05913
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07311
 *  minecraft.class08097
 *  minecraft.class08141
 *  minecraft.class08388
 *  minecraft.class08571
 *  minecraft.class08626
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00396;
import minecraft.class00991;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class03358;
import minecraft.class04792;
import minecraft.class04802;
import minecraft.class04806;
import minecraft.class04811;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04995;
import minecraft.class05913;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07311;
import minecraft.class08097;
import minecraft.class08141;
import minecraft.class08388;
import minecraft.class08571;
import minecraft.class08626;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03362
implements class03358<class00396, class00991> {
    public static final class08571 N = new class08571(class08626.N, "entity/conduit");
    public static final class05913 y = N.N("base");
    public static final class05913 L = N.N("cage");
    public static final class05913 u = N.N("wind");
    public static final class05913 i = N.N("wind_vertical");
    public static final class05913 R = N.N("open_eye");
    public static final class05913 M = N.N("closed_eye");
    private final class08097 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;

    public static class04806 M() {
        class04792 class047922 = new class04792();
        class047922.N().N("shell", class04822.L().N(0, 0).N(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)32, (int)16);
    }

    public class03362(class04811 class048112) {
        this.B = class048112.B();
        this.Z = class048112.N(class04802.NU);
        this.z = class048112.N(class04802.NW);
        this.U = class048112.N(class04802.NE);
        this.E = class048112.N(class04802.Nz);
    }

    @Override
    public class00991 i() {
        return new class00991();
    }

    public static class04806 u() {
        class04792 class047922 = new class04792();
        class047922.N().N("wind", class04822.L().N(0, 0).N(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    @Override
    public void N(class00991 class009912, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (!class009912.y) {
            class014212.N();
            class014212.N(0.5f, 0.5f, 0.5f);
            class014212.N((Quaternionfc)new Quaternionf().rotationY(class009912.L * ((float)Math.PI / 180)));
            class012372.N(this.U, class014212, y.N(class06851::u), class009912.Z, class01384.u, this.B.N(y), -1, class009912.z);
            class014212.y();
            return;
        }
        float f = class009912.L * 57.295776f;
        float f2 = class04995.m((double)(class009912.N * 0.1f)) / 2.0f + 0.5f;
        f2 = f2 * f2 + f2;
        class014212.N();
        class014212.N(0.5f, 0.3f + f2 * 0.2f, 0.5f);
        Vector3f vector3f = new Vector3f(0.5f, 1.0f, 0.5f).normalize();
        class014212.N((Quaternionfc)new Quaternionf().rotationAxis(f * ((float)Math.PI / 180), (Vector3fc)vector3f));
        class012372.N(this.E, class014212, L.N(class06851::M), class009912.Z, class01384.u, this.B.N(L), -1, class009912.z);
        class014212.y();
        class014212.N();
        class014212.N(0.5f, 0.5f, 0.5f);
        if (class009912.u == 1) {
            class014212.N((Quaternionfc)new Quaternionf().rotationX(1.5707964f));
        } else if (class009912.u == 2) {
            class014212.N((Quaternionfc)new Quaternionf().rotationZ(1.5707964f));
        }
        class05913 class059132 = class009912.u == 1 ? i : u;
        class07311 class073112 = class059132.N(class06851::M);
        class08388 class083882 = this.B.N(class059132);
        class012372.N(this.z, class014212, class073112, class009912.Z, class01384.u, class083882);
        class014212.y();
        class014212.N();
        class014212.N(0.5f, 0.5f, 0.5f);
        class014212.y(0.875f, 0.875f, 0.875f);
        class014212.N((Quaternionfc)new Quaternionf().rotationXYZ((float)Math.PI, 0.0f, (float)Math.PI));
        class012372.N(this.z, class014212, class073112, class009912.Z, class01384.u, class083882);
        class014212.y();
        class014212.N();
        class014212.N(0.5f, 0.3f + f2 * 0.2f, 0.5f);
        class014212.y(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class069592.i);
        class014212.N((Quaternionfc)new Quaternionf().rotationZ((float)Math.PI).rotateY((float)Math.PI));
        float f3 = 1.3333334f;
        class014212.y(1.3333334f, 1.3333334f, 1.3333334f);
        class05913 class059133 = class009912.i ? R : M;
        class012372.N(this.Z, class014212, class059133.N(class06851::M), class009912.Z, class01384.u, this.B.N(class059133));
        class014212.y();
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class047922.N().N("eye", class04822.L().N(0, 0).N(-4.0f, -4.0f, 0.0f, 8.0f, 8.0f, 0.0f, new class04834(0.01f)), class04838.N);
        return class04806.N((class04792)class047922, (int)16, (int)16);
    }

    @Override
    public void N(class00396 class003962, class00991 class009912, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class003962, class009912, f, class068892, class081412);
        class009912.y = class003962.L();
        class009912.L = class003962.N(class003962.L() ? f : 0.0f);
        class009912.N = (float)class003962.N + f;
        class009912.u = class003962.N / 66 % 3;
        class009912.i = class003962.u();
    }

    public static class04806 R() {
        class04792 class047922 = new class04792();
        class047922.N().N("shell", class04822.L().N(0, 0).N(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)32, (int)16);
    }
}

