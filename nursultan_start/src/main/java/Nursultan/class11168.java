/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09060
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09069
 *  Nursultan.class09087
 *  Nursultan.class09097
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11300
 *  Nursultan.class11925
 *  Nursultan.class12014
 *  Nursultan.class12019
 *  Nursultan.class12026
 *  Nursultan.class12030
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class06202
 *  minecraft.class06889
 *  org.joml.Matrix4f
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.lwjgl.opengl.GL30
 */
package Nursultan;

import Nursultan.class09060;
import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09069;
import Nursultan.class09087;
import Nursultan.class09097;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11179;
import Nursultan.class11184;
import Nursultan.class11185;
import Nursultan.class11200;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11925;
import Nursultan.class12014;
import Nursultan.class12019;
import Nursultan.class12026;
import Nursultan.class12030;
import Nursultan.class12036;
import Nursultan.class12038;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.lwjgl.opengl.GL30;

public class class11168 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;

    private void M() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_5 = Float.valueOf(0.0f);
            this.L_6 = Float.valueOf(0.0f);
            this.L_7 = false;
        }
    }

    public class11168(int n, float f, float f2) {
        this(n, f, f2, (class12036)class12019.N_0);
    }

    public class11168(int n, float f, float f2, class12036 class120362) {
        this.M();
        this.u_0 = new ArrayList();
        this.u_1 = (class09065)class09065.y_0;
        this.y_0 = class09097.L((int)48, (int)48).N(() -> true);
        this.y_1 = class11213.N((class09087)class09063.N_2, 4096, 1024);
        this.y_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_3).N((class09322)class11185.i_5).N(4).N()).N((class11213)this.y_1).N();
        this.N_1 = ((class09322)class11185.i_5).z("u_projection");
        this.N_2 = ((class09322)class11185.i_5).z("u_view");
        this.L_0 = ((class09322)class11185.i_5).i("radius");
        this.L_1 = ((class09322)class11185.i_5).i("pinch");
        this.L_2 = ((class09322)class11185.E_6).z("u_projection");
        this.L_3 = ((class09322)class11185.E_6).z("u_view");
        this.L_4 = ((class09322)class11185.E_6).M("texture_in");
        this.L_7 = true;
        this.L_5 = Float.valueOf(f);
        this.L_6 = Float.valueOf(f2);
        this.y_2 = class11213.N((class09087)i_0, n);
        this.N_0 = class11174.N().N(class11204.L().N(class120362.L().N((class12030)class12030.N_0).N((class12014)class12014.y_1).N()).N((class09322)class11185.E_6).N(4).N()).N((class11213)this.y_2).N(6).N();
    }

    static {
        class11168.u();
        i_0 = new class09087(new class09069[]{class09069.N((int)3).R(), class09069.N((int)1).R(), class09069.N((int)1).R(), class09069.y().R()});
        i_2 = class06202.Nq();
    }

    private static void u() {
        i_0 = null;
        i_1 = Float.valueOf(5.0f);
        i_2 = null;
    }

    public void N(class11179 class111792) {
        ((List)this.u_0).add(class111792);
    }

    public void N(float f, float f2) {
        this.L_5 = Float.valueOf(f);
        this.L_6 = Float.valueOf(f2);
        this.L_7 = true;
    }

    public void N() {
        if (((List)this.u_0).isEmpty()) {
            return;
        }
        Iterator iterator = ((List)this.u_0).iterator();
        while (iterator.hasNext()) {
            class11179 class111792 = (class11179)iterator.next();
            class111792.E();
            if (!class111792.U()) continue;
            iterator.remove();
        }
    }

    public void N(class09321 class093212) {
        this.R();
        if (((List)this.u_0).isEmpty()) {
            return;
        }
        class06889 class068892 = class093212.y().y();
        float f = class093212.u().N(true);
        class11184 class111842 = ((class11213)this.y_2).M();
        for (class11179 class111792 : (List)this.u_0) {
            Vector3d vector3d = class111792.B().lerp((Vector3dc)class111792.W(), (double)f, new Vector3d());
            int n = class111792.u() - class111792.i();
            float f2 = Math.min(1.0f, (float)n / 5.0f);
            if (class111792.L() > 0) {
                f2 = Math.min(f2, Math.min(1.0f, ((float)class111792.i() + f) / (float)class111792.L()));
            }
            int n2 = class11300.N((int)class111792.R(), (int)((int)(255.0f * f2)));
            float f3 = 0.08f * class111792.N();
            float f4 = class111792.m() + (class111792.y() - class111792.m()) * f;
            class111842.N((float)(vector3d.x - class068892.M), (float)(vector3d.y - class068892.B), (float)(vector3d.z - class068892.Z)).N(f3).N(f4).y(n2).y();
        }
        ((class09065)this.u_1).N(((class06202)i_2).e(), true);
        ((class11174)this.N_0).y(class093222 -> {
            ((class12038)this.L_2).N(class093212.i());
            ((class12038)this.L_3).N(class093212.N());
            ((class12026)this.L_4).N(((class09064)this.y_0).U());
        });
    }

    private void R() {
        if (!((class09064)this.y_0).L()) {
            this.L_7 = true;
        }
        if (!((Boolean)this.L_7).booleanValue()) {
            return;
        }
        ((class09065)this.u_1).u((class09064)this.y_0);
        Matrix4f matrix4f = (Matrix4f)class11925.y_3;
        Matrix4f matrix4f2 = new Matrix4f().setOrtho(0.0f, (float)((class09064)this.y_0).G(), (float)((class09064)this.y_0).u(), 0.0f, -1000.0f, 1000.0f);
        class11176.y((class11213)this.y_1, 0.0f, 0.0f, 0.0f, ((class09064)this.y_0).G(), ((class09064)this.y_0).u(), -1);
        ((class11174)this.y_3).N((class09322 class093222) -> {
            ((class12038)this.N_1).N(matrix4f2);
            ((class12038)this.N_2).N(matrix4f);
            ((class11200)this.L_0).N(((Float)this.L_5).floatValue());
            ((class11200)this.L_1).N(((Float)this.L_6).floatValue());
        });
        class09060.N().N(0, ((class09064)this.y_0).U());
        GL30.glGenerateMipmap((int)3553);
        ((class09065)this.u_1).N(((class06202)i_2).e(), true);
        this.L_7 = false;
    }
}

