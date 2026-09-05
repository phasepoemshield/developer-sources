/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class09719
 *  Nursultan.class11174
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12019
 *  Nursultan.class12036
 *  com.mojang.blaze3d.systems.RenderSystem
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05194
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class09059;
import Nursultan.class09063;
import Nursultan.class09071;
import Nursultan.class09075;
import Nursultan.class09077;
import Nursultan.class09079;
import Nursultan.class09087;
import Nursultan.class09090;
import Nursultan.class09093;
import Nursultan.class09102;
import Nursultan.class09322;
import Nursultan.class09719;
import Nursultan.class11174;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11925;
import Nursultan.class12019;
import Nursultan.class12036;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class class09106 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object y_7;

    private void L() {
        this.N_5 = 0;
        ((ByteBuffer)this.N_3).position(0);
    }

    public class09106() {
        this.u();
        this.N_0 = new class09090();
        this.N_1 = new class09059(this);
        this.N_2 = new class09075(this);
        this.N_3 = MemoryUtil.memAlloc((int)(512 * (Integer)class09077.y_1));
        this.N_4 = new Object[512];
        this.N_6 = -1;
        this.N_7 = -1;
    }

    static {
        class09106.y();
        class09106.N();
        y_0 = LogManager.getLogger(String.class);
        y_5 = class09079.values();
        y_6 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.W_0).N(4).N()).N(class11213.N((class09087)((class09087)((Object)class09063.N_6)), (int)65536)).N(6).N();
        y_7 = class11174.N().N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)((class09087)((Object)class09063.N_2)), (int)4096, (int)1024)).N();
    }

    private void B(int n) {
        int n2;
        int n3;
        if (((Object[])this.N_4).length < n) {
            for (n3 = ((Object[])this.N_4).length; n3 < n; n3 *= 2) {
            }
            this.N_4 = Arrays.copyOf((Object[])this.N_4, n3);
        }
        n3 = n * (Integer)class09077.y_1;
        if (((ByteBuffer)this.N_3).capacity() >= n3) {
            return;
        }
        for (n2 = ((ByteBuffer)this.N_3).capacity(); n2 < n3; n2 *= 2) {
        }
        this.N_3 = MemoryUtil.memRealloc((ByteBuffer)((ByteBuffer)this.N_3), (int)n2);
    }

    void U() {
        if ((Integer)this.N_7 == -1) {
            return;
        }
        ((class11174)y_7).N(class093222 -> {
            class093222.z("u_projection").N(class11925.L());
            class093222.z("u_view").N(RenderSystem.getModelViewMatrix());
            class093222.M("texture_in").N(((Integer)this.N_7).intValue());
        });
    }

    private void z() {
        ((class11174)y_6).y(class093222 -> {
            class093222.z("u_projection").N(class11925.L());
            class093222.M("texture_in").N(((Integer)this.N_6).intValue());
        });
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = 0;
            this.N_6 = 0;
            this.N_7 = 0;
        }
    }

    private static void y() {
    }

    private class09079 y(int n) {
        int n2 = n >>> 8 & 0xFF;
        if (n2 >= ((class09079[])y_5).length) {
            return class09079.REGULAR;
        }
        return ((class09079[])y_5)[n2];
    }

    private int N(class09079 class090792, boolean bl, boolean bl2) {
        int n = (class090792.ordinal() & 0xFF) << 8;
        if (bl) {
            n |= 1;
        }
        if (bl2) {
            n |= 2;
        }
        return n;
    }

    public void N(String string, float f, float f2, byte by, class09079 class090792, boolean bl, int n, int n2, int n3, byte by2) {
        this.N(string, f, f2, by, n, n2, this.N(class090792, bl, n3 != 0), n3, by2);
    }

    public void N(class09093 class090932) {
        int n;
        class09071 class090712;
        byte by;
        int n2;
        int n3;
        float f;
        int n4;
        Object object;
        int n5;
        if ((Integer)this.N_5 == 0) {
            return;
        }
        this.N_6 = -1;
        this.N_7 = -1;
        for (n5 = 0; n5 < (Integer)this.N_5; ++n5) {
            int n6;
            object = ((Object[])this.N_4)[n5];
            if (object == null || ((n6 = ((ByteBuffer)this.N_3).getInt((n4 = n5 * (Integer)class09077.y_1) + (Integer)class09077.N_4)) & 2) == 0) continue;
            f = ((ByteBuffer)this.N_3).getFloat(n4 + (Integer)class09077.N_1);
            float f2 = ((ByteBuffer)this.N_3).getFloat(n4 + (Integer)class09077.N_2);
            n3 = ((ByteBuffer)this.N_3).getInt(n4 + (Integer)class09077.N_5);
            n2 = ((ByteBuffer)this.N_3).get(n4 + (Integer)class09077.N_7);
            by = ((ByteBuffer)this.N_3).get(n4 + (Integer)class09077.y_0);
            class090712 = class090932.y(this.y(n6));
            n = class090712.R();
            if (n != (Integer)this.N_6) {
                this.z();
                this.N_6 = n;
            }
            ((class09075)this.N_2).N(class090712, n2, f2, n3, (float)by);
            this.N(class090712, n2, object, f, f2, (class09075)this.N_2);
        }
        this.z();
        for (n5 = 0; n5 < (Integer)this.N_5; ++n5) {
            object = ((Object[])this.N_4)[n5];
            ((Object[])this.N_4)[n5] = null;
            if (object == null) continue;
            n4 = n5 * (Integer)class09077.y_1;
            float f3 = ((ByteBuffer)this.N_3).getFloat(n4 + (Integer)class09077.N_1);
            f = ((ByteBuffer)this.N_3).getFloat(n4 + (Integer)class09077.N_2);
            int n7 = ((ByteBuffer)this.N_3).getInt(n4 + (Integer)class09077.N_3);
            n3 = ((ByteBuffer)this.N_3).getInt(n4 + (Integer)class09077.N_6);
            n2 = ((ByteBuffer)this.N_3).getInt(n4 + (Integer)class09077.N_4);
            by = ((ByteBuffer)this.N_3).get(n4 + (Integer)class09077.N_7);
            class090712 = class090932.y(this.y(n2));
            n = class090712.R();
            if (n != (Integer)this.N_6) {
                this.z();
                this.N_6 = n;
            }
            float f4 = class090712.L() / (float)Math.max(1, class090712.u());
            float f5 = class090712.L() / (float)Math.max(1, class090712.M());
            ((class09059)this.N_1).N(n7, n3, f4, f5);
            this.N(class090712, by, object, f3, f, (class09059)this.N_1);
        }
        this.L();
        this.z();
        this.U();
    }

    static int N(class00405 class004052, int n) {
        if (class004052 == null) {
            return n;
        }
        class05194 class051942 = class004052.N();
        if (class051942 == null) {
            return n;
        }
        return n & 0xFF000000 | class051942.N() & 0xFFFFFF;
    }

    private void N(Object object, float f, float f2, byte by, int n, int n2, int n3, int n4, byte by2) {
        int n5 = (Integer)this.N_5 + 1;
        this.B(n5);
        int n6 = (Integer)this.N_5 * (Integer)class09077.y_1;
        ((ByteBuffer)this.N_3).putFloat(n6 + (Integer)class09077.N_1, f);
        ((ByteBuffer)this.N_3).putFloat(n6 + (Integer)class09077.N_2, f2);
        ((ByteBuffer)this.N_3).putInt(n6 + (Integer)class09077.N_3, n);
        ((ByteBuffer)this.N_3).putInt(n6 + (Integer)class09077.N_6, n2);
        ((ByteBuffer)this.N_3).putInt(n6 + (Integer)class09077.N_4, n3);
        ((ByteBuffer)this.N_3).putInt(n6 + (Integer)class09077.N_5, n4);
        ((ByteBuffer)this.N_3).put(n6 + (Integer)class09077.N_7, by);
        ((ByteBuffer)this.N_3).put(n6 + (Integer)class09077.y_0, by2);
        ((ByteBuffer)this.N_3).position(n5 * (Integer)class09077.y_1);
        ((Object[])this.N_4)[((Integer)this.N_5).intValue()] = object;
        this.N_5 = n5;
    }

    void N(float f, float f2, float f3, float f4, int n) {
        ((class11174)y_6).R().N(f).N(f2).N(f3).N(f4).N(0.0f).N(0.0f).N(0.0f).N(0.0f).y(n).N(0.0f).N(0.0f).y(0).y();
    }

    private void N(class09071 class090712, float f, Object object, float f2, float f3, class09102 class091022) {
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{String.class, class01028.class}, (Object)object3, (int)n)) {
            case 0: {
                String string = (String)object3;
                ((class09090)this.N_0).N(class090712, f, 1.0f, string, f2, f3, class091022);
                break;
            }
            case 1: {
                class01028 class010282 = (class01028)object3;
                ((class09090)this.N_0).N(class090712, f, 1.0f, class010282, f2, f3, class091022);
                break;
            }
            default: {
                ((Logger)y_0).warn("Unknown payload type: {}", (Object)object.getClass().getSimpleName());
            }
        }
    }

    private static void N() {
        y_0 = null;
        y_1 = 512;
        y_2 = 1;
        y_3 = 2;
        y_4 = 8;
        y_5 = null;
        y_6 = null;
        y_7 = null;
    }

    public void N(class01028 class010282, float f, float f2, byte by, class09079 class090792, boolean bl, int n, int n2, int n3, byte by2) {
        this.N(class010282, f, f2, by, n, n2, this.N(class090792, bl, n3 != 0), n3, by2);
    }

    void N(class09719 class097192, int n, int n2, float f, float f2) {
        float f3 = ((class09090)this.N_0).y() + (((class09090)this.N_0).R() - ((class09090)this.N_0).N());
        float f4 = ((class09090)this.N_0).u();
        float f5 = f3 + class097192.N;
        float f6 = f3 + class097192.L;
        float f7 = f4 - class097192.u;
        float f8 = f4 - class097192.y;
        float f9 = class097192.i;
        float f10 = class097192.B;
        float f11 = class097192.M;
        float f12 = class097192.R;
        ((class11174)y_6).R().N(f5).N(f7).N(f6).N(f8).N(f9).N(f10).N(f11).N(f12).y(n).N(f).N(f2).y(n2).y();
    }
}

