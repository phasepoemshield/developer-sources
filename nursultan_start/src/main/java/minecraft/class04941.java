/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02058
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06240
 *  minecraft.class07070
 *  minecraft.class08140
 *  minecraft.class08970
 *  minecraft.class08979
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.Set;
import minecraft.class00094;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02058;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06240;
import minecraft.class07070;
import minecraft.class08140;
import minecraft.class08970;
import minecraft.class08979;
import org.joml.Quaternionfc;

public class class04941
extends class06078<class08140>
implements class06230,
class06240<class08140> {
    private static final float N = 2.0f;
    private static final float y = 2.5f;
    private static final float L = 0.015f;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class00094 B;
    private final class00094 Z;
    private final class00094 z;
    private final class00094 U;
    private final class00094 E;
    private final class00094 W;
    private final class00094 m;

    public static class04806 L() {
        class04792 class047922 = new class04792().N_50(class048382 -> class048382.L(0.0f, 0.0f, 0.0f));
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(3, 19).N(-3.0f, -4.0f, -4.525f, 6.0f, 1.0f, 6.0f, new class04834(0.0f)).N(0, 15).N(-4.0f, -3.0f, -3.525f, 8.0f, 6.0f, 6.0f, new class04834(0.0f)), class04838.N(0.0f, -3.0f, 2.325f));
        class048393.N("body_r1", class04822.L().N(3, 18).N(-4.0f, -3.0f, -2.2f, 8.0f, 6.0f, 3.0f, new class04834(0.0f)), class04838.N(0.0f, -1.0f, -4.325f, 0.0f, 0.0f, -3.1416f));
        class04839 class048394 = class048393.N("head", class04822.L().N(37, 8).N(-1.0f, -7.0f, -3.3f, 2.0f, 4.0f, 2.0f, new class04834(-0.015f)).N(37, 0).N(-2.0f, -11.0f, -4.3f, 4.0f, 4.0f, 4.0f, new class04834(-0.015f)).N(0, 0).N(-4.0f, -3.0f, -7.325f, 8.0f, 5.0f, 10.0f, new class04834(0.0f)).N(56, 0).N(-1.0f, 0.0f, -8.325f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)), class04838.N(0.0f, -6.0f, -0.2f));
        class048393.N("right_arm", class04822.L(), class04838.N(-4.0f, -5.6f, -1.8f, 0.4363f, 0.0f, 0.0f)).N("right_arm_r1", class04822.L().N(36, 16).N(-3.075f, -0.9733f, -1.9966f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(0.0f, 0.0893f, 0.1198f, -1.0472f, 0.0f, 0.0f));
        class048393.N("left_arm", class04822.L(), class04838.N(4.0f, -5.6f, -1.7f, 0.4363f, 0.0f, 0.0f)).N("left_arm_r1", class04822.L().N(50, 16).N(0.075f, -1.0443f, -1.8997f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(0.0f, -0.0015f, -0.0808f, -1.0472f, 0.0f, 0.0f));
        class048392.N("right_leg", class04822.L(), class04838.N(-2.1f, -2.1f, -2.075f)).N("right_leg_r1", class04822.L().N(0, 27).N(-2.0f, 0.975f, 0.0f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(0.05f, -1.9f, 1.075f, -1.5708f, 0.0f, 0.0f));
        class048392.N("left_leg", class04822.L(), class04838.N(2.0f, -2.0f, -2.075f)).N("left_leg_r1", class04822.L().N(16, 27).N(-2.0f, 0.975f, 0.0f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(0.05f, -2.0f, 1.075f, -1.5708f, 0.0f, 0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    private void M() {
        this.R.i = Math.min(this.R.i, -0.87266463f);
        this.M.i = Math.min(this.M.i, -0.87266463f);
        this.R.R = Math.min(this.R.R, -0.1134464f);
        this.M.R = Math.max(this.M.R, 0.1134464f);
        this.R.M = Math.min(this.R.M, -0.064577185f);
        this.M.M = Math.max(this.M.M, 0.064577185f);
    }

    public class04941(class01686 class016862) {
        super(class016862);
        this.i = class016862.y("body");
        this.u = this.i.y("head");
        this.R = this.i.y("right_arm");
        this.M = this.i.y("left_arm");
        this.B = class08970.N.N(class016862);
        this.Z = class08970.L.N(class016862);
        this.z = class08970.y.N(class016862);
        this.U = class08970.R.N(class016862);
        this.E = class08970.M.N(class016862);
        this.W = class08970.u.N(class016862);
        this.m = class08970.i.N(class016862);
    }

    public static class04806 i() {
        return class04941.N().N(class047922 -> {
            class047922.N().N(Set.of("eyes"));
            return class047922;
        });
    }

    public static class04806 u() {
        class04792 class047922 = new class04792().N_50(class048382 -> class048382.L(0.0f, 0.0f, 0.0f));
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 15).N(-4.0f, -6.0f, -3.0f, 8.0f, 6.0f, 6.0f, new class04834(0.0f)), class04838.N(0.0f, -5.0f, 0.0f));
        class048393.N("head", class04822.L().N(0, 0).N(-4.0f, -5.0f, -5.0f, 8.0f, 5.0f, 10.0f, new class04834(0.0f)).N(56, 0).N(-1.0f, -2.0f, -6.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)).N(37, 8).N(-1.0f, -9.0f, -1.0f, 2.0f, 4.0f, 2.0f, new class04834(-0.015f)).N(37, 0).N(-2.0f, -13.0f, -2.0f, 4.0f, 4.0f, 4.0f, new class04834(-0.015f)), class04838.N(0.0f, -6.0f, 0.0f));
        class04839 class048394 = class048393.N("right_arm", class04822.L(), class04838.N(-4.0f, -6.0f, 0.0f));
        class048394.N("right_arm_r1", class04822.L().N(36, 16).N(-1.5f, -5.0f, -2.0f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.9199f));
        class048394.N("rightItem", class04822.L(), class04838.N(-1.0f, 7.4f, -1.0f));
        class048393.N("left_arm", class04822.L(), class04838.N(4.0f, -6.0f, 0.0f)).N("left_arm_r1", class04822.L().N(50, 16).N(-1.5f, -5.0f, -2.0f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.9199f));
        class048392.N("right_leg", class04822.L(), class04838.N(-3.0f, -5.0f, 0.0f)).N("right_leg_r1", class04822.L().N(0, 27).N(-2.0f, -2.5f, -2.0f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(0.35f, 2.0f, 0.01f, 0.0f, 0.0f, 0.2618f));
        class048392.N("left_leg", class04822.L(), class04838.N(1.0f, -5.0f, 0.0f)).N("left_leg_r1", class04822.L().N(16, 27).N(-2.0f, -2.5f, -2.0f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(1.65f, 2.0f, 0.0f, 0.0f, 0.0f, -0.2618f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public static class04806 y() {
        class04792 class047922 = new class04792().N_50(class048382 -> class048382.L(0.0f, 0.0f, 0.0f));
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L(), class04838.N(-1.064f, -5.0f, 0.0f));
        class048393.N("body_r1", class04822.L().N(0, 15).N(-4.02f, -6.116f, -3.5f, 8.0f, 6.0f, 6.0f, new class04834(0.0f)), class04838.N(1.1f, 0.1f, 0.7f, 0.1204f, -0.0064f, -0.0779f));
        class048393.N("head", class04822.L().N(0, 0).N(-4.0f, -5.1f, -5.0f, 8.0f, 5.0f, 10.0f, new class04834(0.0f)).N(56, 0).N(-1.02f, -2.1f, -6.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)).N(37, 8).N(-1.02f, -9.1f, -1.0f, 2.0f, 4.0f, 2.0f, new class04834(-0.015f)).N(37, 0).N(-2.0f, -13.1f, -2.0f, 4.0f, 4.0f, 4.0f, new class04834(-0.015f)), class04838.N(0.7f, -5.6f, -1.8f));
        class048393.N("right_arm", class04822.L(), class04838.N(-4.0f, -6.0f, 0.0f)).N("right_arm_r1", class04822.L().N(36, 16).N(-3.052f, -1.11f, -2.036f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(0.7f, -0.248f, -1.62f, 1.0036f, 0.0f, 0.0f));
        class048393.N("left_arm", class04822.L(), class04838.N(4.0f, -6.0f, 0.0f)).N("left_arm_r1", class04822.L().N(50, 16).N(0.032f, -1.1f, -2.0f, 3.0f, 10.0f, 4.0f, new class04834(0.0f)), class04838.N(0.732f, 0.0f, 0.0f, -0.8715f, -0.0535f, -0.0449f));
        class048392.N("right_leg", class04822.L(), class04838.N(-3.064f, -5.0f, 0.0f)).N("right_leg_r1", class04822.L().N(0, 27).N(-1.856f, -0.1f, -1.09f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(1.048f, 0.0f, -0.9f, -0.8727f, 0.0f, 0.0f));
        class048392.N("left_leg", class04822.L(), class04838.N(0.936f, -5.0f, 0.0f)).N("left_leg_r1", class04822.L().N(16, 27).N(-2.088f, -0.1f, -2.0f, 4.0f, 5.0f, 4.0f, new class04834(0.0f)), class04838.N(1.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void y(class01421 class014212) {
        this.field_54014.N(class014212);
        this.i.N(class014212);
        this.u.N(class014212);
        class014212.N(0.0, -2.25, 0.0);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792().N_50(class048382 -> class048382.L(0.0f, 24.0f, 0.0f));
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 15).N(-4.0f, -6.0f, -3.0f, 8.0f, 6.0f, 6.0f, class04834.N), class04838.N(0.0f, -5.0f, 0.0f));
        class048393.N("head", class04822.L().N(0, 0).N(-4.0f, -5.0f, -5.0f, 8.0f, 5.0f, 10.0f, new class04834(0.015f)).N(56, 0).N(-1.0f, -2.0f, -6.0f, 2.0f, 3.0f, 2.0f, class04834.N).N(37, 8).N(-1.0f, -9.0f, -1.0f, 2.0f, 4.0f, 2.0f, new class04834(-0.015f)).N(37, 0).N(-2.0f, -13.0f, -2.0f, 4.0f, 4.0f, 4.0f, new class04834(-0.015f)), class04838.N(0.0f, -6.0f, 0.0f));
        class048393.N("right_arm", class04822.L().N(36, 16).N(-3.0f, -1.0f, -2.0f, 3.0f, 10.0f, 4.0f, class04834.N), class04838.N(-4.0f, -6.0f, 0.0f));
        class048393.N("left_arm", class04822.L().N(50, 16).N(0.0f, -1.0f, -2.0f, 3.0f, 10.0f, 4.0f, class04834.N), class04838.N(4.0f, -6.0f, 0.0f));
        class048392.N("right_leg", class04822.L().N(0, 27).N(-4.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, class04834.N), class04838.N(0.0f, -5.0f, 0.0f));
        class048392.N("left_leg", class04822.L().N(16, 27).N(0.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, class04834.N), class04838.N(0.0f, -5.0f, 0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08140 class081402) {
        super.method_2819((Object)class081402);
        this.u.i = class081402.h * ((float)Math.PI / 180);
        this.u.R = class081402.D * ((float)Math.PI / 180);
        if (class081402.Nq.i() && class081402.Ne.i()) {
            this.B.N(class081402.NN, class081402.Ny, 2.0f, 2.5f);
        } else {
            this.Z.N(class081402.NN, class081402.Ny, 2.0f, 2.5f);
            this.M();
        }
        this.z.N(class081402.L, class081402.P);
        this.U.N(class081402.u, class081402.P);
        this.E.N(class081402.i, class081402.P);
        this.W.N(class081402.R, class081402.P);
        this.m.N(class081402.M, class081402.P);
    }

    public void N(class08140 class081402, class07070 class070702, class01421 class014212) {
        this.field_54014.N(class014212);
        this.i.N(class014212);
        (class070702 == class07070.field_6183 ? this.R : this.M).N(class014212);
        if (class081402.y.equals((Object)class08979.field_61292)) {
            class014212.N((Quaternionfc)class02058.u.N(class070702 == class07070.field_6183 ? -90.0f : 90.0f));
            class014212.N(0.0f, 0.0f, 0.125f);
        } else {
            class014212.y(0.55f, 0.55f, 0.55f);
            class014212.N(-0.125f, 0.3125f, -0.1875f);
        }
    }

    public void N(class01421 class014212) {
        this.i.N(class014212);
        this.u.N(class014212);
        class014212.N(0.0f, 0.125f, 0.0f);
        class014212.y(1.0625f, 1.0625f, 1.0625f);
    }

    public class01686 R() {
        return this.u;
    }
}

