/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11184
 *  Nursultan.class11190
 *  Nursultan.class11223
 *  Nursultan.class11225
 *  Nursultan.class11226
 *  Nursultan.class11228
 *  Nursultan.class11241
 *  Nursultan.class11249
 *  Nursultan.class11254
 *  Nursultan.class11264
 *  Nursultan.class11266
 *  Nursultan.class11300
 *  Nursultan.class11355
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  Nursultan.class11925
 *  minecraft.class00734
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07438
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11184;
import Nursultan.class11190;
import Nursultan.class11223;
import Nursultan.class11225;
import Nursultan.class11226;
import Nursultan.class11228;
import Nursultan.class11241;
import Nursultan.class11249;
import Nursultan.class11254;
import Nursultan.class11264;
import Nursultan.class11266;
import Nursultan.class11300;
import Nursultan.class11355;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11907;
import Nursultan.class11925;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07438;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@class11080(L="Trajectory", y=class11072.VISUAL, N=class11106.WORLD)
public class Trajectory
extends class11067 {
    public Object L_0;
    public Object L_1;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public static Object R_0;

    private static void T() {
        R_0 = Float.valueOf(4.0f);
    }

    public Trajectory() {
        this.j();
        this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2, class11264.N));
        this.i_1 = new class11254("trident", true, (class11228)new class11249((class11225)class11225.L_1, class11264.N));
        this.i_2 = new class11254("bow", true, (class11228)new class11249((class11225)class11225.L_0, class11264.N));
        this.i_3 = new class11254("potions", true, new class11228((class11225)class11225.L_3, class11264.N));
        this.i_4 = new class11254("crossbow", true, (class11228)new class11249((class11225)class11225.L_0, class11264.N));
        this.u_0 = new class11254("snowball", true, new class11228((class11225)class11225.L_4, class11264.N));
        this.u_1 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5, class11264.N));
        this.u_2 = class11524.y((class11512)this, (String)"predict-entity", (class11535[])new class11254[]{(class11254)this.i_1, (class11254)this.i_0, (class11254)this.i_2, (class11254)this.i_4, (class11254)this.i_3, (class11254)this.u_0, (class11254)this.u_1});
        this.u_3 = class11524.N((class11512)this, (String)"line-color", (int)-11104513);
        this.u_4 = class11524.N((class11512)this, (String)"hit-line-color", (int)-43691);
        this.u_5 = class06889.L;
        this.u_6 = class06889.L;
        this.L_0 = 0;
        this.L_1 = 0;
    }

    static {
        Trajectory.T();
    }

    private int s() {
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return 0;
        }
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class070502);
            if (!class065842.N(class06570.sx)) continue;
            return class065842.N((class07438)((class04453)((class06202)this.y_0).T_4)) - ((class04453)((class06202)this.y_0).T_4).method_6014();
        }
        return 0;
    }

    private void j() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
        }
    }

    private void y(class11174 class111742, Matrix4fStack matrix4fStack, int n) {
        float f = 0.6f;
        class11184 class111842 = class111742.R();
        int n2 = class111842.i();
        class06889 class068892 = new class06889((double)f, 0.0, 0.0);
        class06889 class068893 = new class06889(0.0, 0.0, (double)f);
        class06889 class068894 = new class06889((double)(-f), 0.0, 0.0);
        class06889 class068895 = new class06889(0.0, 0.0, (double)(-f));
        int n3 = class11300.N((int)n, (int)((int)((float)class11300.y((int)n) * 0.196f * 2.0f)));
        class111842.N((Matrix4f)matrix4fStack, (float)class068892.M, (float)class068892.B, (float)class068892.Z).y(n3).y();
        class111842.N((Matrix4f)matrix4fStack, (float)class068893.M, (float)class068893.B, (float)class068893.Z).y(n3).y();
        class111842.N((Matrix4f)matrix4fStack, (float)class068894.M, (float)class068894.B, (float)class068894.Z).y(n3).y();
        class111842.N((Matrix4f)matrix4fStack, (float)class068895.M, (float)class068895.B, (float)class068895.Z).y(n3).y();
        class111742.L().y(n2);
    }

    private List<class11266> y(class06889 class068892, float f) {
        this.j();
        float f2 = ((class04453)((class06202)this.y_0).T_4).method_36455();
        float f3 = ((class04453)((class06202)this.y_0).T_4).method_36454();
        class06889 class068893 = new class06889(class11925.i((class07049)((class04453)((class06202)this.y_0).T_4)), class11925.u((class07049)((class04453)((class06202)this.y_0).T_4)) + (double)((class04453)((class06202)this.y_0).T_4).method_18381(((class04453)((class06202)this.y_0).T_4).method_18376()), class11925.L((class07049)((class04453)((class06202)this.y_0).T_4)));
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class070502);
            if (class065842.N(class06570.db) && ((class11254)this.i_1).U()) {
                return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, 0.0f, 2.5f), ((class11254)this.i_1).N()));
            }
            if (class065842.N(class06570.nz) && ((class11254)this.i_0).U()) {
                return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, 0.0f, 1.5f), ((class11254)this.i_0).N()));
            }
            if (class065842.N(class06570.dw) && ((class11254)this.i_4).U()) {
                if (!class06593.u((class06584)class065842)) {
                    return Collections.emptyList();
                }
                int[] nArray = ((class02820)class065842.a_(class02484.x, (Object)class02820.N)).N().size() == 1 ? new int[]{0} : new int[]{-10, 0, 10};
                ArrayList<class11266> arrayList = new ArrayList<class11266>();
                for (int n : nArray) {
                    class06889 class068894 = ((class04453)((class06202)this.y_0).T_4).method_18864(1.0f);
                    Quaternionf quaternionf = new Quaternionf().setAngleAxis((double)((float)n * ((float)Math.PI / 180)), class068894.M, class068894.B, class068894.Z);
                    Vector3f vector3f = ((class04453)((class06202)this.y_0).T_4).method_5828(1.0f).W().rotate((Quaternionfc)quaternionf);
                    class06889 class068895 = Trajectory.N(vector3f.x, vector3f.y, vector3f.z, 3.15f);
                    arrayList.add(new class11266(class068893, class068895, ((class11254)this.i_4).N()));
                }
                return arrayList;
            }
            if (class065842.N(class06570.sx) && ((class11254)this.i_2).U()) {
                float f4 = f <= 0.0f ? 1.0f : Trajectory.N(f) * 3.0f;
                return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, 0.0f, f4), ((class11254)this.i_2).N()));
            }
            if (class065842.N(class06570.lO) && ((class11254)this.i_3).U()) {
                return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, -20.0f, 0.5f), ((class11254)this.i_3).N(), 4.0f));
            }
            if (class065842.N(class06570.jP) && ((class11254)this.u_0).U()) {
                return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, 0.0f, 1.5f), ((class11254)this.u_0).N()));
            }
            if (!class065842.N(class06570.Gz) || !((class11254)this.u_1).U()) continue;
            return List.of(new class11266(class068893, Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068892, f2, f3, 0.0f, 1.5f), ((class11254)this.u_1).N()));
        }
        return Collections.emptyList();
    }

    private static float N(float f) {
        float f2 = f / 20.0f;
        f2 = (f2 * f2 + f2 * 2.0f) / 3.0f;
        return Math.min(f2, 1.0f);
    }

    private void N(class11174 class111742, Matrix4fStack matrix4fStack, class06889 class068892, class06889 class068893, class06889 class068894, int n, int n2, float f) {
        class06889 class068895 = class068893.u(class068892);
        class06889 class068896 = class068894.u(class068892);
        class111742.R().N((Matrix4f)matrix4fStack, (float)class068895.M, (float)class068895.B, (float)class068895.Z).N((Matrix4f)matrix4fStack, (float)class068896.M, (float)class068896.B, (float)class068896.Z).y(n).y(n2).N(f).y();
    }

    @class11782
    public void N(class11355 class113552) {
        this.j();
        this.u_5 = (class06889)this.u_6;
        this.u_6 = class11907.y();
        this.L_0 = (int)((Integer)this.L_1);
        this.L_1 = this.s();
    }

    private int N(class11241 class112412, float f) {
        this.j();
        if (class112412.N().isPresent()) {
            class11223 class112232 = (class11223)class112412.N().get();
            if (class112232.y() instanceof class06145) {
                return (Integer)((class11515)this.u_4).i();
            }
            if (f > 0.0f && this.N(class112232.N(), f)) {
                return (Integer)((class11515)this.u_4).i();
            }
        }
        return (Integer)((class11515)this.u_3).i();
    }

    public static class06889 N(class07049 class070492, class06889 class068892, float f, float f2, float f3, float f4) {
        float f5 = -class04995.m((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f * ((float)Math.PI / 180)));
        float f6 = -class04995.m((double)((f + f3) * ((float)Math.PI / 180)));
        float f7 = class04995.P((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f * ((float)Math.PI / 180)));
        return Trajectory.N(f5, f6, f7, f4).y(class068892.M, class070492.method_24828() ? 0.0 : class068892.B, class068892.Z);
    }

    private boolean N(class06889 class068892, float f) {
        double d;
        class00734 class007342 = class00734.N((class06889)class068892, (double)(f * 2.0f), (double)(f * 2.0f), (double)(f * 2.0f));
        return !((class03448)((class06202)this.y_0).T_3).N(class07438.class, class007342, arg_0 -> this.N(class068892, d = (double)(f * f), arg_0)).isEmpty();
    }

    public static class06889 N(double d, double d2, double d3, float f) {
        return new class06889(d, d2, d3).u().L((double)f);
    }

    private /* synthetic */ boolean N(class06889 class068892, double d, class07438 class074382) {
        return class074382 != (class04453)((class06202)this.y_0).T_4 && class074382.method_5805() && class074382.method_5707(class068892) <= d;
    }

    @class11782
    public void N(class09321 class093212) {
        class11266 class1126622;
        this.j();
        float f = class093212.u().N(true);
        class06889 class068892 = ((class06889)this.u_5).L((double)(1.0f - f)).i(((class06889)this.u_6).L((double)f));
        float f2 = (float)((Integer)this.L_0).intValue() + (float)((Integer)this.L_1 - (Integer)this.L_0) * f;
        List<class11266> var5 = this.y(class068892, f2);
        if (var5.isEmpty()) {
            return;
        }
        ArrayList<class11241> arrayList = new ArrayList<class11241>();
        for (class11266 class1126622 : var5) {
            arrayList.add(class1126622.y());
        }
        float f3 = ((class04453)((class06202)this.y_0).T_4).method_36454();
        class1126622 = new class06889((double)(-class04995.P((double)(f3 * ((float)Math.PI / 180))) * 0.15f), 0.0, (double)(-class04995.m((double)(f3 * ((float)Math.PI / 180))) * 0.15f));
        class11174 class111742 = (class11174)class11190.N_2;
        class11174 class111743 = (class11174)class11190.y_3;
        Matrix4fStack matrix4fStack = class093212.R();
        class06889 class068893 = class093212.y().y();
        for (int i = 0; i < arrayList.size(); ++i) {
            class06183 class061832;
            class11241 class112412 = (class11241)arrayList.get(i);
            int n = this.N(class112412, var5.get(i).u());
            List var16 = class112412.y();
            if (var16.isEmpty()) continue;
            class06889 class068894 = (class06889)var16.getFirst();
            class06889 class068895 = class112412.N().map(class11223::N).orElse((class06889)var16.getLast());
            Quaternionf quaternionf = new Quaternionf().rotationTo((Vector3fc)new Vector3f((float)(class068894.M - class068895.M), (float)(class068894.B - class068895.B), (float)(class068894.Z - class068895.Z)), (Vector3fc)new Vector3f((float)(class068894.M + class1126622.M - class068895.M), (float)(class068894.B + class1126622.B - class068895.B), (float)(class068894.Z + class1126622.Z - class068895.Z)));
            matrix4fStack.pushMatrix();
            matrix4fStack.translate((float)(class068895.M - class068893.M), (float)(class068895.B - class068893.B), (float)(class068895.Z - class068893.Z));
            matrix4fStack.rotate((Quaternionfc)quaternionf);
            matrix4fStack.translate((float)(class068893.M - class068895.M), (float)(class068893.B - class068895.B), (float)(class068893.Z - class068895.Z));
            class06889 class068896 = (class06889)var16.getFirst();
            for (int j = 1; j < var16.size(); ++j) {
                class06889 class068897 = (class06889)var16.get(j);
                this.N(class111742, matrix4fStack, class068893, class068896, class068897, class11300.N((int)n, (int)((int)(Math.min(1.0f, (float)(j - 1) / 5.0f) * 255.0f))), class11300.N((int)n, (int)((int)(Math.min(1.0f, (float)j / 5.0f) * 255.0f))), 0.0f);
                class068896 = class068897;
            }
            matrix4fStack.popMatrix();
            if (class112412.N().isEmpty()) continue;
            class11223 class112232 = (class11223)class112412.N().get();
            float f4 = var5.get(i).u();
            if (f4 > 0.0f) {
                class11226.N((class06889)class068893, (class06889)class112232.N(), (float)f4, (int)n);
                continue;
            }
            class06889 class068898 = new class06889(0.0, 1.0, 0.0);
            class07089 class070892 = class112232.y();
            if (class070892 instanceof class06183) {
                class061832 = (class06183)class070892;
                class070892 = class061832.i();
                class068898 = new class06889((double)class070892.P(), (double)class070892.s(), (double)class070892.T());
            } else {
                class070892 = class112232.y();
                if (class070892 instanceof class06145) {
                    class06145 class061452 = (class06145)class070892;
                    class070892 = class061452.L();
                    class06889 class068899 = class061452.y();
                    class00734 class007342 = class070892.method_5829().M(1.0E-6);
                    double d = Math.max(1.0E-6, 0.5 * class007342.y());
                    double d2 = Math.max(1.0E-6, 0.5 * class007342.L());
                    double d3 = Math.max(1.0E-6, 0.5 * class007342.u());
                    class06889 class0688910 = class007342.R();
                    double d4 = class068899.M - class0688910.M;
                    double d5 = class068899.B - class0688910.B;
                    double d6 = class068899.Z - class0688910.Z;
                    double d7 = d4 / d;
                    double d8 = d5 / d2;
                    double d9 = d6 / d3;
                    double d10 = Math.abs(d7);
                    double d11 = Math.abs(d8);
                    double d12 = Math.abs(d9);
                    class068898 = d10 >= d11 && d10 >= d12 ? new class06889(Math.signum(d4), 0.0, 0.0) : (d11 >= d10 && d11 >= d12 ? new class06889(0.0, Math.signum(d5), 0.0) : new class06889(0.0, 0.0, Math.signum(d6)));
                }
            }
            class061832 = class112232.N();
            class068898 = class068898.u();
            matrix4fStack.pushMatrix();
            matrix4fStack.translate((float)(class061832.M - class068893.M), (float)(class061832.B - class068893.B), (float)(class061832.Z - class068893.Z));
            matrix4fStack.rotate((Quaternionfc)new Quaternionf().rotateTo((Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f), (Vector3fc)new Vector3f((float)class068898.M, (float)class068898.B, (float)class068898.Z)));
            this.y(class111743, matrix4fStack, n);
            this.N(class111742, matrix4fStack, n);
            matrix4fStack.popMatrix();
        }
        class11226.N((class09321)class093212);
    }

    private void N(class11174 class111742, Matrix4fStack matrix4fStack, int n) {
        float f = 0.6f;
        int n2 = 4;
        double d = (float)Math.PI * 2 / (float)n2;
        class06889 class068892 = null;
        for (int i = 0; i <= n2; ++i) {
            double d2 = (double)i * d;
            float f2 = (float)(Math.cos(d2) * (double)f);
            float f3 = (float)(Math.sin(d2) * (double)f);
            class06889 class068893 = new class06889((double)f2, 0.0, (double)f3);
            if (class068892 != null) {
                int n3 = class11300.N((int)n, (float)0.7f);
                this.N(class111742, matrix4fStack, class06889.L, class068892, class068893, n3, n3, 1.0f);
            }
            class068892 = class068893;
        }
    }
}

