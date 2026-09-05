/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09087
 *  Nursultan.class09322
 *  Nursultan.class09785
 *  Nursultan.class10989
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11181
 *  Nursultan.class11185
 *  Nursultan.class11199
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11307
 *  Nursultan.class11381
 *  Nursultan.class11389
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11872
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class08066
 *  org.joml.Vector2i
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09087;
import Nursultan.class09322;
import Nursultan.class09785;
import Nursultan.class10989;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11181;
import Nursultan.class11185;
import Nursultan.class11199;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11307;
import Nursultan.class11381;
import Nursultan.class11389;
import Nursultan.class11595;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11872;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12002;
import Nursultan.class12019;
import Nursultan.class12036;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class08066;
import org.joml.Vector2i;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class class11619 {
    private static String[] G;
    private static double[] I;
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
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public Object u_0;
    public boolean u_init;

    private void L() {
        long l = ((class06202)this.y_0).Nt().B();
        this.N_6 = GLFW.glfwGetInputMode((long)l, (int)208897);
        GLFW.glfwSetInputMode((long)l, (int)208897, (int)212994);
        this.N_7 = true;
    }

    public class11619(class11872 class118722, class09785<class11619> class097852, class09785<Boolean> class097853, class09785<Float> class097854, class09785<Float> class097855, class09785<Float> class097856, class09785<String> class097857, class09785<String> class097858) {
        this.y();
        this.y_0 = class06202.Nq();
        this.y_1 = class09064.y((int)((Integer)L_3), (int)((Integer)L_3)).y(class11181.RGB8).N(class11199.NEAREST, class11199.NEAREST).N(G[0]).N();
        this.N_6 = 212993;
        this.y_2 = class118722;
        this.y_3 = class097852;
        this.N_0 = class097853;
        this.N_1 = class097854;
        this.N_2 = class097855;
        this.N_3 = class097856;
        this.N_4 = class097857;
        this.N_5 = class097858;
        this.L();
    }

    static {
        class11619.z();
        class11619.i();
        class11619.Z();
        Math.ceil(I[0]);
        L_2 = 1;
        L_3 = (int)((Integer)L_2);
        L_4 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.u_0).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)6, (int)6)).N();
    }

    private void B() {
        class08066 class080662 = ((class06202)this.y_0).e();
        Vector2i vector2i = class11307.N((double)((class06220)((class06202)this.y_0).L_2).i(), (double)((class06220)((class06202)this.y_0).L_2).R());
        int n = Math.clamp((long)vector2i.x(), (int)0, (int)(class080662.N - 1));
        int n2 = Math.clamp((long)vector2i.y(), (int)0, (int)(class080662.y - 1));
        int n3 = Math.clamp((long)(n - (Integer)L_2), (int)0, (int)(class080662.N - (Integer)L_3));
        int n4 = Math.clamp((long)(n2 - (Integer)L_2), (int)0, (int)(class080662.y - (Integer)L_3));
        int n5 = class080662.y - n4 - (Integer)L_3;
        class11925.N((class08066)class080662, (class09064)((class09064)this.y_1), (int)n3, (int)n5, (int)((Integer)L_3), (int)((Integer)L_3), (int)0, (int)0, (int)((Integer)L_3), (int)((Integer)L_3));
        class11925.N((class08066)class080662, (boolean)false);
        float f = 144.0f;
        class11176.N((class11213)((class11174)L_4).u(), (float)((float)vector2i.x() - 72.0f), (float)((float)vector2i.y() - 72.0f), (float)f, (float)f, (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)-1);
        ((class11174)L_4).N(class093222 -> {
            class093222.z(G[1]).N(class11925.L());
            class093222.z(G[2]).N(RenderSystem.getModelViewMatrix());
            class093222.M(G[3]).N(((class09064)this.y_1).U());
            class093222.R(G[4]).N((float)((Integer)L_3).intValue(), (float)((Integer)L_3).intValue());
            class093222.R(G[5]).N((float)(n - n3), (float)(n2 - n4));
        });
    }

    private static void Z() {
        L_0 = Float.valueOf(72.0f);
        L_1 = Float.valueOf(12.0f);
        L_2 = 0;
        L_3 = 0;
    }

    private static void i() {
        G = new String[6];
        class11619.G[0] = "color_picker_pipette_preview";
        class11619.G[1] = "u_projection";
        class11619.G[2] = "u_view";
        class11619.G[3] = "texture_in";
        class11619.G[4] = "u_source_size";
        class11619.G[5] = "u_center_px";
    }

    private void m() {
        if (!((Boolean)this.N_7).booleanValue()) {
            return;
        }
        GLFW.glfwSetInputMode((long)((class06202)this.y_0).Nt().B(), (int)208897, (int)((Integer)this.N_6));
        this.N_7 = false;
    }

    private static void z() {
        I = new double[1];
        class11619.I[0] = Double.longBitsToDouble(4618441417868443648L);
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_6 = 0;
            this.N_7 = false;
        }
        if (!this.u_init) {
            this.u_init = true;
            this.u_0 = false;
        }
    }

    @class11782(y=class11777.LISTENER)
    public void N(class10989 class109892) {
        if (((Boolean)this.u_0).booleanValue()) {
            this.u_0 = false;
            int n = class11300.N((int)this.R(), (int)class11300.y((int)((class11872)this.y_2).y()));
            class11595.N((class11872)this.y_2, n, (class09785<Float>)((class09785)this.N_1), (class09785<Float>)((class09785)this.N_2), (class09785<Float>)((class09785)this.N_3));
            class11595.N((class11872)this.y_2, n, (class09785<String>)((class09785)this.N_4), (class09785<String>)((class09785)this.N_5));
            this.N();
            return;
        }
        this.B();
    }

    @class11782(y=class11777.BEFORE_ALL)
    public void N(class11389 class113892) {
        if (!class113892.B()) {
            return;
        }
        if (class113892.Z().N(class11381.MOUSE) && class113892.z() == 0) {
            class113892.N();
            this.u_0 = true;
            return;
        }
        if (class113892.Z().N(class11381.KEYBOARD) && class113892.y(class12002.ESCAPE)) {
            class113892.N();
            this.N();
        }
    }

    public void N() {
        class11938.L().N((Object)this);
        ((class09785)this.y_3).N(null);
        ((class09785)this.N_0).N((Object)false);
        this.u_0 = false;
        this.m();
    }

    private int R() {
        class08066 class080662 = ((class06202)this.y_0).e();
        Vector2i vector2i = class11307.N((double)((class06220)((class06202)this.y_0).L_2).i(), (double)((class06220)((class06202)this.y_0).L_2).R());
        int n = Math.clamp((long)vector2i.x(), (int)0, (int)(class080662.N - 1));
        int n2 = Math.clamp((long)(class080662.y - 1 - vector2i.y()), (int)0, (int)(class080662.y - 1));
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)3);
        class11925.N((class08066)class080662, (boolean)false);
        int n3 = GL11.glGetInteger((int)3333);
        GL11.glPixelStorei((int)3333, (int)1);
        GL11.glReadPixels((int)n, (int)n2, (int)1, (int)1, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glPixelStorei((int)3333, (int)n3);
        int n4 = byteBuffer.get(0) & 0xFF;
        int n5 = byteBuffer.get(1) & 0xFF;
        int n6 = byteBuffer.get(2) & 0xFF;
        return class11300.y((int)n4, (int)n5, (int)n6, (int)255);
    }
}

