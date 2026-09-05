/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09078
 *  Nursultan.class09087
 *  Nursultan.class09097
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class10203
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11187
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11224
 *  Nursultan.class11227
 *  Nursultan.class11235
 *  Nursultan.class11240
 *  Nursultan.class11243
 *  Nursultan.class11245
 *  Nursultan.class11248
 *  Nursultan.class11257
 *  Nursultan.class11274
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11792
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12027
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class01054
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04790
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08066
 *  minecraft.class08133
 *  org.joml.Math
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL13
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09078;
import Nursultan.class09087;
import Nursultan.class09097;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class10203;
import Nursultan.class11051;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11187;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11224;
import Nursultan.class11227;
import Nursultan.class11235;
import Nursultan.class11240;
import Nursultan.class11243;
import Nursultan.class11245;
import Nursultan.class11248;
import Nursultan.class11257;
import Nursultan.class11274;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11792;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12027;
import Nursultan.class12036;
import Nursultan.class12038;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01054;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08133;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL13;

public class class11002 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public static Object R_0;
    public static Object R_1;
    public Object M_0;
    public Object M_1;

    private static void L() {
    }

    private void L(class11257 class112572) {
        int n = ((class06202)this.L_0).Nt().U();
        int n2 = ((class06202)this.L_0).Nt().E();
        class112572.y(n).L(n2).N((float)n).y((float)n2);
        class112572.z().set((Matrix4fc)class11925.L());
    }

    private class09064 M() {
        return class09097.N(() -> this.i(((class06202)this.L_0).e().N), () -> this.i(((class06202)this.L_0).e().y), (boolean)false);
    }

    private class09064 T() {
        return class09097.L(() -> ((class06202)this.L_0).e().N / 2, () -> ((class06202)this.L_0).e().y / 2);
    }

    public class11002(EntityESP entityESP) {
        this.z();
        this.L_0 = class06202.Nq();
        this.L_1 = new class10203(null, 1, 1, true);
        this.L_2 = new class10203(null, 1, 1, true);
        this.L_3 = BufferUtils.createFloatBuffer((int)7);
        this.L_4 = class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024);
        this.M_0 = new class11257();
        this.M_1 = this.T();
        this.u_0 = this.M();
        this.u_1 = this.M();
        this.u_2 = class11218.N().N((class11192)new class11235((class11213)this.L_4)).y((class09064)this.M_1).N(this::N).N((class11192)new class11224((class11213)this.L_4)).L(() -> ((class06202)((class06202)this.L_0)).e()).L((class09064)this.M_1).N(33990, this::N).N((class11192)new class11274((class11213)this.L_4, this::y)).L(() -> ((class06202)((class06202)this.L_0)).e()).N(this::N).N();
        this.u_4 = -1;
        this.u_5 = this.N((class09322)class11185.i_2, true);
        this.u_6 = ((class09322)class11185.i_2).z("u_projection");
        this.u_7 = ((class09322)class11185.i_2).z("u_view");
        this.i_0 = ((class09322)class11185.i_2).L("texture_in");
        this.i_1 = ((class09322)class11185.i_2).L("depth_in");
        this.i_2 = ((class09322)class11185.i_2).L("depth_entity_in");
        this.y_0 = ((class09322)class11185.i_2).R("texel_size");
        this.y_1 = ((class09322)class11185.i_2).R("near_far");
        this.y_2 = entityESP;
        this.y_3 = (class11535)entityESP.L_5;
        this.N_0 = (class11535)entityESP.z_0;
        class11245 class112452 = new class11245("blur", true, this::y, class115352 -> {});
        class11245 class112453 = new class11245("waves", false, this::N, class115352 -> {});
        this.N_6 = class11524.N((class11512)entityESP, (String)"shader-effect", (class11535[])new class11245[]{class112452, class112453});
        ((class11517)this.N_6).N((T class115362) -> ((class11535)this.y_3).U());
        this.N_1 = (class11507)class11524.N((class11512)entityESP, (String)"glow-outline", (boolean)true).N((T class115362) -> ((class11535)this.y_3).U() && class112452.U());
        this.N_2 = (class11507)class11524.N((class11512)entityESP, (String)"pulse", (boolean)true).N((T class115362) -> ((class11535)this.y_3).U() && class112453.U());
        this.N_3 = (class11515)class11524.N((class11512)entityESP, (String)"glow-color", (int)-12025345).N((T class115362) -> ((class11535)this.y_3).U());
        this.N_5 = (class11504)class11524.N((class11512)entityESP, (String)"radius", (float)6.0f, (float)6.0f, (float)32.0f, (float)1.0f).N((T class115362) -> class112453.U() && ((class11535)this.y_3).U());
        this.N_4 = (class11515)class11524.N((class11512)entityESP, (String)"chams-color", (int)-12025345).N((T class115362) -> ((class11535)this.N_0).U());
        this.u();
    }

    static {
        class11002.L();
        class11002.Z();
    }

    private static void Z() {
        R_0 = Float.valueOf(6.0f);
        R_1 = 2;
    }

    private int i(int n) {
        return Math.max(1, (n + 2 - 1) / 2);
    }

    private class11218<class11257> s() {
        int n = Math.max(1, ((Float)((class11504)this.N_5).i()).intValue());
        if ((class11218)this.u_3 == null || (Integer)this.u_4 != n) {
            this.u_4 = n;
            this.u_3 = this.N(n);
        }
        return (class11218)this.u_3;
    }

    private double j() {
        if (!((Boolean)((class11507)this.N_2).i()).booleanValue()) {
            return 0.0;
        }
        return -((float)class11938.j().y() + ((class06202)this.L_0).NK().N(true));
    }

    private void z() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_4 = 0;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_7 = false;
        }
    }

    private void u() {
        ((FloatBuffer)this.L_3).clear();
        int n = 0;
        while ((float)n <= 6.0f) {
            ((FloatBuffer)this.L_3).put((float)this.N((float)n, 3.0f));
            ++n;
        }
        ((FloatBuffer)this.L_3).rewind();
    }

    private boolean y() {
        return (Boolean)((class11507)this.N_1).i();
    }

    private void y(class01054 class010542, int n, int n2, int n3) {
        this.N(n, n2, n3);
        ((class11218)this.u_2).execute((Object)((class11257)this.M_0));
    }

    private void N(class11174 class111742, class12038 class120382, class12038 class120383, float f, float f2, float f3, float f4, int n, Consumer<class09322> consumer) {
        class11176.N((class11213)((class11213)this.L_4), (float)f, (float)f2, (float)0.0f, (float)f3, (float)f4, (int)n);
        class111742.N((T class093222) -> {
            class120382.N(class11925.L());
            class120383.N(RenderSystem.getModelViewMatrix());
            consumer.accept((class09322)class093222);
        });
    }

    private class11257 N(int n, int n2, int n3) {
        ((class11257)this.M_0).y(n2).L(n3).N((float)n2).y((float)n3).N(n).u(((Float)((class11504)this.N_5).i()).floatValue()).N((FloatBuffer)this.L_3);
        ((class11257)this.M_0).z().set((Matrix4fc)class11925.L());
        ((class11257)this.M_0).N().set((Matrix4fc)((Matrix4f)class11925.y_3));
        return (class11257)this.M_0;
    }

    private class11218<class11257> N(int n) {
        class09064 class090642;
        class11187 class111872 = class11218.N();
        class111872.N((class11192)new class11243((class11213)this.L_4)).y(this::N).y(class112572 -> GL13.glClearColor((float)-1.0f, (float)-1.0f, (float)-1.0f, (float)1.0f)).y((class09064)this.u_0).N(this::N);
        class09064[] class09064Array = new class09064[]{(class09064)this.u_1, (class09064)this.u_0};
        int n2 = 0;
        for (int i = this.i(n + 2); i >= 1; i /= 2) {
            class090642 = class09064Array[n2 % 2];
            class09064 class090643 = class09064Array[(n2 + 1) % 2];
            int n3 = i;
            class111872.N((class11192)new class11248((class11213)this.L_4, n3)).y(class112572 -> GL13.glClearColor((float)-1.0f, (float)-1.0f, (float)-1.0f, (float)1.0f)).y(class090642).L(class090643);
            ++n2;
        }
        class090642 = class09064Array[(n2 + 1) % 2];
        return class111872.N((class11192)new class11240((class11213)this.L_4, this::j)).y(this::L).L(() -> ((class06202)((class06202)this.L_0)).e()).L(class090642).N(33990, this::N).N();
    }

    private class11174 N(class09322 class093222, boolean bl) {
        return class11174.N().N(class11204.L().N(bl ? (class12036)class12019.N_0 : (class12036)class12019.N_3).N(class093222).N(4).N()).N((class11213)this.L_4).N();
    }

    public void N(class09321 class093212) {
        this.N_7 = false;
        if (!((class11535)this.y_3).U() && !((class11535)this.N_0).U()) {
            return;
        }
        class08066 class080662 = ((class06202)this.L_0).e();
        class12027.N();
        class11925.N((class08066)((class08066)this.L_1), (int)class080662.N, (int)class080662.y);
        class11925.N((class08066)((class08066)this.L_2), (int)class080662.N, (int)class080662.y);
        class04790 class047902 = ((class03063)((class06202)this.L_0).B_2).Z;
        class08133 class081332 = ((class03063)((class06202)this.L_0).B_2).z;
        class06959 class069592 = ((class03063)((class06202)this.L_0).B_2).B.N;
        class01422 class014222 = ((class03063)((class06202)this.L_0).B_2).u.L();
        class06889 class068892 = class093212.y().y();
        class01421 class014212 = new class01421();
        class014212.L().N().mul((Matrix4fc)class093212.N());
        ((class08066)this.L_2).N(class080662);
        RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.L_1).L(), 0, ((class08066)this.L_1).i(), 1.0);
        class09078.N((class08066)((class08066)this.L_1));
        for (class07049 class070492 : ((class03448)class06202.Nq().T_3).M()) {
            if (!class11925.y((class07049)class070492)) continue;
            Iterator iterator = ((List)((class11523)((EntityESP)this.y_2).i_2).i()).iterator();
            while (iterator.hasNext()) {
                if (!((class11051)((Object)iterator.next())).test(class070492)) continue;
                this.N_7 = true;
                ((class11792)((class06202)this.L_0).Ng()).N(class070492, class069592, class068892.M, class068892.B, class068892.Z, class093212.u().N(((class03448)((class06202)this.L_0).T_3).method_54719().N(class070492)), class014212, (class01237)class047902);
            }
        }
        class11925.N((class08066)((class08066)this.L_1), (boolean)true);
        class081332.N();
        class014222.u();
        class09078.L();
        class11925.N((class08066)class080662, (boolean)true);
        GlStateManager._depthFunc((int)515);
        class12027.y();
    }

    public void N(class01054 class010542) {
        if (!((Boolean)this.N_7).booleanValue()) {
            return;
        }
        int n = ((class06202)this.L_0).Nt().U();
        int n2 = ((class06202)this.L_0).Nt().E();
        int n3 = (Integer)((class11515)this.N_3).i();
        GlStateManager._depthMask((boolean)false);
        if (((class11535)this.y_3).U()) {
            ((class11227)((class11535)((class11517)this.N_6).i())).draw(class010542, n3, n, n2);
        }
        class11925.N((class08066)((class06202)this.L_0).e(), (boolean)true);
        if (((class11535)this.N_0).U()) {
            this.N((class11174)this.u_5, (class12038)this.u_6, (class12038)this.u_7, 0.0f, 0.0f, n, n2, (Integer)((class11515)this.N_4).i(), class093222 -> {
                this.N(33984, class11925.N((class08066)((class08066)this.L_1)));
                this.N(33990, class11925.y((class08066)((class08066)this.L_2)));
                this.N(33991, class11925.y((class08066)((class08066)this.L_1)));
                ((class12003)this.i_0).N(0);
                ((class12003)this.i_1).N(6);
                ((class12003)this.i_2).N(7);
                ((class11993)this.y_0).N(3.0f / (float)n, 3.0f / (float)n2);
                ((class11993)this.y_1).N(0.05f, ((class03386)((class06202)this.L_0).i_5).P());
            });
        }
        GlStateManager._depthMask((boolean)false);
    }

    private void N(class11257 class112572) {
        int n = this.i(class112572.Z());
        int n2 = this.i(class112572.i());
        class112572.y(n).L(n2).N((float)n).y((float)n2);
        class112572.z().setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1.0f);
    }

    private int N() {
        return class11925.N((class08066)((class08066)this.L_1));
    }

    private void N(class01054 class010542, int n, int n2, int n3) {
        this.N(n, n2, n3).u(((Float)((class11504)this.N_5).i()).floatValue());
        this.s().execute((Object)((class11257)this.M_0));
    }

    private double N(float f, float f2) {
        double d = Math.pow(f2, 2.0);
        return org.joml.Math.invsqrt((double)(Math.PI * 2 * d)) * Math.exp(-Math.pow(f, 2.0) / (2.0 * d));
    }

    private void N(int n, int n2) {
        GlStateManager._activeTexture((int)n);
        GlStateManager._bindTexture((int)n2);
    }
}

