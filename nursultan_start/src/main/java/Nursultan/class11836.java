/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09078
 *  Nursultan.class09081
 *  Nursultan.class09343
 *  Nursultan.class10203
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11392
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  Nursultan.class11929
 *  Nursultan.class12027
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class01054
 *  minecraft.class02484
 *  minecraft.class02689
 *  minecraft.class03386
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class08066
 *  org.joml.Matrix3x2fStack
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09078;
import Nursultan.class09081;
import Nursultan.class09343;
import Nursultan.class10203;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11392;
import Nursultan.class11782;
import Nursultan.class11867;
import Nursultan.class11925;
import Nursultan.class11929;
import Nursultan.class12027;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class02689;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class08066;
import org.joml.Matrix3x2fStack;
import org.lwjgl.opengl.GL11;

public class class11836 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public boolean u_init;

    private void L(int n) {
        if (((boolean[])this.u_4)[n]) {
            return;
        }
        ((boolean[])this.u_4)[n] = true;
        ((IntArrayList)this.u_3).add(n);
    }

    private void L(class01054 class010542) {
        class12027.N();
        ((class03386)((class06202)class11836.N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
        if (!((Boolean)this.L_1).booleanValue()) {
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.y_5).L(), 0, ((class08066)this.y_5).i(), 1.0);
            this.m();
            this.L_1 = true;
        }
        class09078.N((class08066)((class08066)this.y_5));
        class11925.y((float)((Integer)this.y_2).intValue(), (float)((Integer)this.y_2).intValue());
        class09081.N((GpuBufferSlice)RenderSystem.getProjectionMatrixBuffer());
        try {
            class11925.N((class08066)((class08066)this.y_5), (boolean)true);
            this.Z();
            this.y(class010542);
            ((class03386)((class06202)class11836.N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
        }
        finally {
            class09081.N();
            class09078.L();
            class11925.N((class08066)((class06202)N_0).e(), (boolean)true);
            class11925.N();
        }
        for (int i = 0; i < ((IntArrayList)this.u_3).size(); ++i) {
            ((boolean[])this.u_4)[((IntArrayList)this.u_3).getInt((int)i)] = false;
        }
        ((IntArrayList)this.u_3).clear();
        class12027.y();
    }

    public int L() {
        return (Integer)this.y_0;
    }

    public class11836() {
        this(32, 32);
    }

    public class11836(int n, int n2) {
        this.R();
        this.y_6 = new Int2IntOpenHashMap();
        this.u_3 = new IntArrayList(64);
        this.L_2 = -1;
        this.L_3 = "glidfy:0";
        this.y_0 = n;
        this.y_1 = n2;
        this.y_2 = n2 * n;
        this.y_3 = Float.valueOf(1.0f / (float)n2);
        this.y_4 = n2 * n2;
        this.y_5 = new class10203(null, ((Integer)this.y_2).intValue(), ((Integer)this.y_2).intValue(), true);
        this.u_0 = new int[((Integer)this.y_4).intValue()];
        this.u_1 = new int[((Integer)this.y_4).intValue()];
        this.u_2 = new class06584[((Integer)this.y_4).intValue()];
        this.u_4 = new boolean[((Integer)this.y_4).intValue()];
        ((Int2IntOpenHashMap)this.y_6).defaultReturnValue(-1);
    }

    static {
        class11836.u();
        N_0 = class06202.Nq();
    }

    private class11867 B(int n) {
        int n2 = n % (Integer)this.y_1;
        int n3 = n / (Integer)this.y_1;
        float f = (float)n2 * ((Float)this.y_3).floatValue();
        float f2 = (float)n3 * ((Float)this.y_3).floatValue();
        float f3 = f + ((Float)this.y_3).floatValue();
        float f4 = f2 + ((Float)this.y_3).floatValue();
        return new class11867(n, f, f2, f3, f4);
    }

    private void Z() {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glDepthMask((boolean)true);
        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glEnable((int)3089);
        for (int i = 0; i < ((IntArrayList)this.u_3).size(); ++i) {
            int n = ((IntArrayList)this.u_3).getInt(i);
            int n2 = n % (Integer)this.y_1;
            int n3 = n / (Integer)this.y_1;
            int n4 = n2 * (Integer)this.y_0;
            int n5 = n3 * (Integer)this.y_0;
            int n6 = (Integer)this.y_2 - n5 - (Integer)this.y_0;
            GL11.glScissor((int)n4, (int)n6, (int)((Integer)this.y_0), (int)((Integer)this.y_0));
            GL11.glClear((int)16384);
        }
        GL11.glDisable((int)3089);
    }

    private void m() {
        GlStateManager._activeTexture((int)33984);
        GlStateManager._bindTexture((int)class11925.N((class08066)((class08066)this.y_5)));
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
    }

    private int z() {
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < (Integer)this.y_4; ++i) {
            if (((int[])this.u_1)[i] >= n2) continue;
            n2 = ((int[])this.u_1)[i];
            n = i;
            if (n2 == 0) break;
        }
        return n;
    }

    private static void u() {
        N_0 = null;
        N_1 = 32;
        N_2 = 32;
        N_3 = 16;
    }

    private void y(Property property) {
        for (int i = 0; i < (Integer)this.y_4; ++i) {
            GameProfile gameProfile;
            class02689 class026892;
            class06584 class065842 = ((class06584[])this.u_2)[i];
            if (class065842 == null || class065842.R() || (class026892 = (class02689)class065842.method_58694(class02484.Nb)) == null || (gameProfile = class026892.y()) == null || !gameProfile.properties().get((Object)"textures").contains(property)) continue;
            this.L(i);
        }
    }

    private void y(class01054 class010542) {
        class12027.N();
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        float f = (float)((Integer)this.y_0).intValue() / 16.0f;
        for (int i = 0; i < ((IntArrayList)this.u_3).size(); ++i) {
            int n = ((IntArrayList)this.u_3).getInt(i);
            class06584 class065842 = ((class06584[])this.u_2)[n];
            if (class065842 == null || class065842.R()) continue;
            int n2 = n % (Integer)this.y_1;
            int n3 = n / (Integer)this.y_1;
            float f2 = n2 * (Integer)this.y_0;
            float f3 = n3 * (Integer)this.y_0;
            matrix3x2fStack.pushMatrix();
            matrix3x2fStack.translate(f2, f3);
            matrix3x2fStack.scale(f);
            class010542.N(class065842, 0, 0);
            matrix3x2fStack.popMatrix();
        }
    }

    public String y() {
        int n = class11925.N((class08066)((class08066)this.y_5));
        if (n != (Integer)this.L_2) {
            this.L_2 = n;
            this.L_3 = "glidfy:" + n;
        }
        return (String)this.L_3;
    }

    @class11782
    public void N(class11392 class113922) {
        Property property = class113922.N();
        if (property == null) {
            return;
        }
        ((class06202)N_0).execute(() -> this.y(property));
    }

    @class11782
    public void N(class09343 class093432) {
        ((Int2IntOpenHashMap)this.y_6).clear();
        for (int i = 0; i < (Integer)this.y_4; ++i) {
            ((int[])this.u_0)[i] = 0;
            ((int[])this.u_1)[i] = 0;
            ((class06584[])this.u_2)[i] = null;
            ((boolean[])this.u_4)[i] = false;
        }
        ((IntArrayList)this.u_3).clear();
        this.u_5 = 0;
        this.L_1 = false;
        this.L_2 = -1;
    }

    public void N(class06584 class065842, float f, float f2, float f3) {
        class11867 class118672 = this.N(class065842);
        if (!class118672.L()) {
            return;
        }
        class11176.N((class11213)((class11174)class11190.y_1).u(), (float)class04995.y((float)f), (float)class04995.y((float)f2), (float)f3, (float)f3, (float)class118672.y(), (float)(1.0f - class118672.N()), (float)class118672.R(), (float)(1.0f - class118672.i()), (int)-1);
    }

    private int N(int n, class06584 class065842) {
        int n2;
        if ((Integer)this.u_5 < (Integer)this.y_4) {
            int n3 = (Integer)this.u_5;
            this.u_5 = n3 + 1;
            n2 = n3;
        } else {
            n2 = this.z();
            if (n2 < 0) {
                return -1;
            }
            ((Int2IntOpenHashMap)this.y_6).remove(((int[])this.u_0)[n2]);
        }
        ((Int2IntOpenHashMap)this.y_6).put(n, n2);
        ((int[])this.u_0)[n2] = n;
        ((class06584[])this.u_2)[n2] = class065842;
        this.L(n2);
        return n2;
    }

    public void N(class01054 class010542) {
        this.L_0 = (Integer)this.L_0 + 1;
        if (((IntArrayList)this.u_3).isEmpty() && ((Boolean)this.L_1).booleanValue()) {
            return;
        }
        this.L(class010542);
    }

    public int N() {
        return class11925.N((class08066)((class08066)this.y_5));
    }

    public class11867 N(class06584 class065842) {
        if (class065842 == null || class065842.R()) {
            return (class11867)((Object)class11867.y_0);
        }
        int n = class11929.R((class06584)class065842);
        int n2 = ((Int2IntOpenHashMap)this.y_6).get(n);
        if (n2 < 0) {
            n2 = this.N(n, class065842);
            if (n2 < 0) {
                return (class11867)((Object)class11867.y_0);
            }
        } else {
            ((class06584[])this.u_2)[n2] = class065842;
        }
        ((int[])this.u_1)[n2] = (Integer)this.L_0;
        return this.B(n2);
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
            this.y_1 = 0;
            this.y_2 = 0;
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = 0;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_5 = 0;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = false;
            this.L_2 = 0;
        }
    }
}

