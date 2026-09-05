/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09087
 *  Nursultan.class09097
 *  Nursultan.class09321
 *  Nursultan.class11925
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09087;
import Nursultan.class09097;
import Nursultan.class09321;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11242;
import Nursultan.class11250;
import Nursultan.class11258;
import Nursultan.class11262;
import Nursultan.class11267;
import Nursultan.class11270;
import Nursultan.class11925;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.function.IntSupplier;
import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4fc;

public class class11238 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public static Object y_0;

    public class11238() {
        this.U();
        this.N_0 = class11213.N((class09087)class09063.N_2, 4096, 1024);
        this.N_1 = new class11270();
        this.N_2 = class09097.y(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
        this.N_3 = class09097.y(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
        this.N_4 = class09097.L(() -> ((class06202)y_0).Nt().U() / 2, () -> ((class06202)y_0).Nt().E() / 2);
        this.N_5 = class09097.L(() -> ((class06202)y_0).Nt().U() / 4, () -> ((class06202)y_0).Nt().E() / 4);
        this.N_6 = () -> class11925.y((class08066)((class06202)y_0).e());
        this.N_7 = class11218.N().N(new class11242((class11213)this.N_0)).N((class09064)this.N_2).N(() -> class11925.N((class08066)((class06202)y_0).e())).N(33990, (IntSupplier)this.N_6).N(new class11258((class11213)this.N_0)).N((class09064)this.N_3).L((class09064)this.N_2).N(new class11250((class11213)this.N_0, 1.0f)).N((class09064)this.N_4).L((class09064)this.N_3).N(new class11250((class11213)this.N_0, 2.0f)).N((class09064)this.N_5).L((class09064)this.N_4).N(new class11262((class11213)this.N_0, (float[])class11262.L_0, 4.0f)).N((class09064)this.N_4).L((class09064)this.N_5).N(new class11262((class11213)this.N_0, (float[])class11262.L_1, 4.0f)).N((class09064)this.N_5).L((class09064)this.N_4).N(new class11267((class11213)this.N_0)).L(() -> ((class06202)((class06202)y_0)).e()).L((class09064)this.N_5).N(33990, (IntSupplier)this.N_6).N();
    }

    static {
        class11238.Z();
        y_0 = class06202.Nq();
    }

    private static void Z() {
        y_0 = null;
    }

    private void U() {
    }

    public void N(class09321 class093212, int n, float f, int n2, FloatBuffer floatBuffer) {
        class08066 class080662 = ((class06202)y_0).e();
        int n3 = ((class06202)y_0).Nt().U();
        int n4 = ((class06202)y_0).Nt().E();
        ((class11270)this.N_1).R().setOrtho(0.0f, (float)class080662.N, (float)class080662.y, 0.0f, -1.0f, 1.0f);
        ((class11270)this.N_1).L().set((Matrix4fc)class093212.i()).invert();
        ((class11270)this.N_1).E().set((Matrix4fc)class093212.N()).invert();
        ((class11270)this.N_1).M().set((Matrix4fc)RenderSystem.getModelViewMatrix());
        ((class11270)this.N_1).u(class080662.N).y(class080662.y).N((float)n3).L((float)n4).y(f).L(n).N(n2).N(floatBuffer);
        ((class11218)this.N_7).execute((class11270)this.N_1);
    }
}

