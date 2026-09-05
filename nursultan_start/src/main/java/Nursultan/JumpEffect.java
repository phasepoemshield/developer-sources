/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09087
 *  Nursultan.class09097
 *  Nursultan.class09321
 *  Nursultan.class10959
 *  Nursultan.class10996
 *  Nursultan.class11037
 *  Nursultan.class11041
 *  Nursultan.class11049
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11192
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class08066
 *  org.lwjgl.BufferUtils
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09087;
import Nursultan.class09097;
import Nursultan.class09321;
import Nursultan.class10959;
import Nursultan.class10996;
import Nursultan.class11037;
import Nursultan.class11041;
import Nursultan.class11049;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11192;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11925;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08066;
import org.lwjgl.BufferUtils;

@class11080(L="JumpEffect", y=class11072.VISUAL, N=class11106.WORLD)
public class JumpEffect
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public static Object i_0;

    public static /* synthetic */ class06202 L(JumpEffect jumpEffect) {
        return (class06202)jumpEffect.y_0;
    }

    public JumpEffect() {
        this.t();
        this.u_0 = class11524.N((class11512)this, (String)"radius", (float)2.0f, (float)1.0f, (float)2.5f, (float)0.1f);
        this.u_1 = class11524.N((class11512)this, (String)"wave-amplitude", (float)1.0f, (float)0.1f, (float)3.0f, (float)0.05f);
        this.u_2 = class11524.N((class11512)this, (String)"first-color", (int)-11104513);
        this.u_3 = class11524.N((class11512)this, (String)"second-color", (int)-11104513);
        this.u_4 = new ArrayList();
        this.L_0 = BufferUtils.createFloatBuffer((int)40);
        this.L_2 = class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024);
        this.L_3 = class09097.i(() -> ((class06202)this.y_0).e().N, () -> ((class06202)this.y_0).e().y);
        this.L_4 = class11218.N().N((class11192)new class11041(this, (class11213)this.L_2)).N((class09064)this.L_3).N(() -> class11925.N((class08066)((class06202)this.y_0).e())).N(33990, () -> class11925.y((class08066)((class06202)this.y_0).e())).N((class11192)new class11049(this, (class11213)this.L_2)).L(() -> ((class06202)((class06202)this.y_0)).e()).L((class09064)this.L_3).N();
    }

    static {
        JumpEffect.l();
    }

    private static void l() {
        i_0 = 8;
    }

    private void t() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0;
        }
    }

    public static /* synthetic */ class06202 y(JumpEffect jumpEffect) {
        return (class06202)jumpEffect.y_0;
    }

    @class11782
    public void N(class10959 class109592) {
        this.t();
        ((List)this.u_4).add(new class11037(((class04453)((class06202)this.y_0).T_4).method_73189()));
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class09321 class093212) {
        this.t();
        if (((List)this.u_4).isEmpty()) {
            return;
        }
        ((class11218)this.L_4).execute((Object)class093212);
    }

    void N(class06889 class068892, float f) {
        this.t();
        ((FloatBuffer)this.L_0).clear();
        int n = Math.max(0, ((List)this.u_4).size() - 8);
        for (int i = 0; i < 8; ++i) {
            int n2 = n + i;
            if (n2 < ((List)this.u_4).size()) {
                class11037 class110372 = (class11037)((List)this.u_4).get(n2);
                ((FloatBuffer)this.L_0).put((float)(((class06889)class110372.N_0).M - class068892.M));
                ((FloatBuffer)this.L_0).put((float)(((class06889)class110372.N_0).B - class068892.B));
                ((FloatBuffer)this.L_0).put((float)(((class06889)class110372.N_0).Z - class068892.Z));
                ((FloatBuffer)this.L_0).put(((Float)((class11504)this.u_0).i()).floatValue() * class110372.N(f));
                ((FloatBuffer)this.L_0).put(class110372.y(f));
                continue;
            }
            ((FloatBuffer)this.L_0).put(0.0f).put(0.0f).put(0.0f).put(0.0f).put(0.0f);
        }
    }

    public static /* synthetic */ class06202 N(JumpEffect jumpEffect) {
        return (class06202)jumpEffect.y_0;
    }

    @class11782
    public void N(class10996 class109962) {
        this.t();
        this.L_1 = (Integer)this.L_1 + 1;
        Iterator iterator = ((List)this.u_4).iterator();
        while (iterator.hasNext()) {
            class11037 class110372 = (class11037)iterator.next();
            class110372.L();
            if (!class110372.N()) continue;
            iterator.remove();
        }
    }
}

