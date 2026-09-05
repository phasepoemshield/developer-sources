/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11170
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11200
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12003
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class04453
 *  minecraft.class06202
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11170;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11476;
import Nursultan.class11925;
import Nursultan.class12003;
import Nursultan.class12019;
import Nursultan.class12036;
import Nursultan.class12038;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import minecraft.class04453;
import minecraft.class06202;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class11465
implements class11192<class09321> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;

    private static void L() {
        y_0 = 6;
    }

    class11465(class11476 class114762, class11213 class112132) {
        this.N();
        this.N_6 = class114762;
        this.L_2 = new Matrix4f();
        this.L_3 = new Matrix4f();
        this.N_0 = ((class09322)class11185.N_1).z("u_projection");
        this.N_1 = ((class09322)class11185.N_1).z("u_view");
        this.N_2 = ((class09322)class11185.N_1).L("depth_texture_in");
        this.N_3 = ((class09322)class11185.N_1).z("inv_mvp");
        this.N_4 = ((class09322)class11185.N_1).i("u_time");
        this.N_5 = ((class09322)class11185.N_1).y("waves");
        this.L_0 = class112132;
        this.L_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.N_1).N(4).N()).N(class112132).N();
    }

    static {
        class11465.L();
    }

    private void N() {
    }

    public void execute(class09321 class093212) {
        int n = ((class09064)((class11476)this.N_6).L_3).G();
        int n2 = ((class09064)((class11476)this.N_6).L_3).u();
        ((Matrix4f)this.L_2).setOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.L_0), (float)0.0f, (float)0.0f, (float)0.0f, (float)n, (float)n2, (int)-1);
        ((Matrix4f)this.L_3).set((Matrix4fc)class093212.i()).mul((Matrix4fc)class093212.N()).invert();
        class11925.N((GpuTexture)((class06202)((class11476)this.N_6).L_0).e().i());
        ((class11174)this.L_1).N(class093222 -> {
            ((class12038)this.N_0).N((Matrix4f)this.L_2);
            ((class12038)this.N_1).N((Matrix4f)class11925.y_3);
            ((class12003)this.N_2).N(6);
            ((class12038)this.N_3).N((Matrix4f)this.L_3);
            double d = (double)((float)((class04453)((class06202)((class11476)this.N_6).L_0).T_4).field_6012 + ((class06202)((class11476)this.N_6).L_0).NK().N(false)) / 20.0;
            ((class11200)this.N_4).N((float)(d % (Math.PI * 10)));
            ((class11170)this.N_5).N((FloatBuffer)((class11476)this.N_6).L_1);
        });
    }
}

