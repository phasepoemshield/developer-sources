/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09718
 *  Nursultan.class09719
 *  Nursultan.class09731
 *  Nursultan.class09742
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09718;
import Nursultan.class09719;
import Nursultan.class09731;
import Nursultan.class09742;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class09071 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public Object y_7;
    public boolean y_init;
    public static Object L_0;
    public static Object L_1;

    public float L() {
        return ((Float)this.y_0).floatValue();
    }

    public int M() {
        return ((class09742)this.N_0).i();
    }

    public class09071(class09742 class097422, int n, float f, Path path) {
        this.m();
        this.y_5 = System.currentTimeMillis();
        this.N_0 = class097422;
        this.N_1 = n;
        this.y_0 = Float.valueOf(f);
        this.y_1 = path;
    }

    static {
        class09071.j();
        L_0 = LogManager.getLogger(String.class);
    }

    private void B() {
        if (((Boolean)this.y_7).booleanValue() || (Path)this.y_1 == null || !((Boolean)this.y_6).booleanValue()) {
            return;
        }
        if (System.currentTimeMillis() - (Long)this.y_5 < 2000L) {
            return;
        }
        this.y_7 = true;
        try {
            ((class09742)this.N_0).N((Path)this.y_1);
        }
        catch (Exception exception) {
            ((Logger)L_0).warn("Font atlas cache save failed ({}): {}", (Object)((Path)this.y_1), (Object)exception.toString());
        }
    }

    public void i() {
        ((class09742)this.N_0).close();
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_2 = 0;
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_5 = 0L;
            this.y_6 = false;
            this.y_7 = false;
        }
    }

    private static void j() {
        L_0 = null;
        L_1 = 2000L;
    }

    public int u() {
        return ((class09742)this.N_0).u();
    }

    public boolean y(int n) {
        return ((class09742)this.N_0).L(n);
    }

    public int y() {
        return (Integer)this.N_1;
    }

    public float y(float f) {
        return (float)(((class09742)this.N_0).z().N() * (double)f);
    }

    private void E() {
        this.y_2 = GL11.glGenTextures();
        int n = GL11.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)((Integer)this.y_2));
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
        GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
        GlStateManager._bindTexture((int)n);
    }

    public boolean N(int n, float f, class09719 class097192) {
        return ((class09742)this.N_0).N(n, f, class097192);
    }

    public float N(int n, float f) {
        return (float)(((class09742)this.N_0).y(n) * (double)f);
    }

    public void N(int n) {
        ((class09742)this.N_0).N(n);
    }

    public float N(float f) {
        class09718 class097182 = ((class09742)this.N_0).z();
        double d = class097182.L();
        if (d <= 0.0) {
            d = class097182.N() - class097182.y();
        }
        return (float)(d * (double)f);
    }

    public float N(int n, int n2, float f) {
        return (float)(((class09742)this.N_0).N(n, n2) * (double)f);
    }

    public void N() {
        class09731 class097312 = ((class09742)this.N_0).N();
        if (!class097312.N() && (Integer)this.y_2 != 0) {
            this.B();
            return;
        }
        if ((Integer)this.y_2 == 0) {
            this.E();
        }
        int n = ((class09742)this.N_0).u();
        int n2 = ((class09742)this.N_0).i();
        ByteBuffer byteBuffer = ((class09742)this.N_0).L();
        int n3 = GL11.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)((Integer)this.y_2));
        GL11.glPixelStorei((int)3317, (int)4);
        if (class097312.y() || (Integer)this.y_3 != n || (Integer)this.y_4 != n2) {
            GL11.glPixelStorei((int)3314, (int)0);
            GL11.glPixelStorei((int)3316, (int)0);
            GL11.glPixelStorei((int)3315, (int)0);
            GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)n, (int)n2, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
            this.y_3 = n;
            this.y_4 = n2;
        } else {
            GL11.glPixelStorei((int)3314, (int)n);
            for (int i = 0; i < class097312.M(); ++i) {
                int n4 = class097312.N(i);
                int n5 = class097312.y(i);
                GL11.glPixelStorei((int)3316, (int)n4);
                GL11.glPixelStorei((int)3315, (int)n5);
                GL11.glTexSubImage2D((int)3553, (int)0, (int)n4, (int)n5, (int)class097312.L(i), (int)class097312.u(i), (int)6408, (int)5121, (ByteBuffer)byteBuffer);
            }
            GL11.glPixelStorei((int)3314, (int)0);
            GL11.glPixelStorei((int)3316, (int)0);
            GL11.glPixelStorei((int)3315, (int)0);
        }
        GlStateManager._bindTexture((int)n3);
        this.y_6 = true;
        this.y_5 = System.currentTimeMillis();
    }

    public int R() {
        this.N();
        return (Integer)this.y_2;
    }
}

