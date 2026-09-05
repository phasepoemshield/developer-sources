/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class09324
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11238
 *  Nursultan.class11300
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11925
 *  org.lwjgl.BufferUtils
 */
package Nursultan;

import Nursultan.Tracers;
import Nursultan.class09321;
import Nursultan.class09324;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11238;
import Nursultan.class11300;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11925;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;

@class11080(L="Fog", y=class11072.VISUAL, N=class11106.WORLD)
public class Fog
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;

    private void T() {
    }

    public Fog() {
        this.T();
        this.L_0 = new class11535("color", true);
        this.L_1 = new class11535("blur", true);
        this.L_2 = class11524.y((class11512)this, (String)"details", (class11535[])new class11535[]{(class11535)this.L_0, (class11535)this.L_1});
        this.L_3 = (class11515)class11524.N((class11512)this, (String)"color", (int)1297584127).N(class115362 -> {
            this.T();
            return ((class11535)this.L_0).U() || ((class11535)this.L_1).U();
        });
        this.L_4 = (class11504)class11524.N((class11512)this, (String)"distance", (float)50.0f, (float)10.0f, (float)150.0f, (float)1.0f).N(class115362 -> {
            this.T();
            return ((class11535)this.L_1).U();
        });
        this.L_5 = new class11238();
        this.L_7 = BufferUtils.createFloatBuffer((int)20);
        this.L_6 = (class11504)class11524.N((class11512)this, (String)"radius", (float)12.0f, (float)8.0f, (float)20.0f, (float)1.0f).N(class115362 -> {
            this.T();
            return ((class11535)this.L_1).U();
        }).N_6((class115362, f) -> {
            this.T();
            class11925.N((FloatBuffer)((FloatBuffer)this.L_7), (int)Math.max(0, f.intValue() - 1));
        });
        class11925.N((FloatBuffer)((FloatBuffer)this.L_7), (int)Math.max(0, ((Float)((class11504)this.L_6).i()).intValue() - 1));
    }

    @class11782(y=class11777.BEFORE, N={Tracers.class})
    public void N(class09321 class093212) {
        this.T();
        if (!((class11535)this.L_1).U()) {
            return;
        }
        ((class11238)this.L_5).N(class093212, ((Integer)((class11515)this.L_3).i()).intValue(), ((Float)((class11504)this.L_4).i()).floatValue(), ((Float)((class11504)this.L_6).i()).intValue(), (FloatBuffer)this.L_7);
    }

    @class11782
    public void N(class09324 class093242) {
        this.T();
        if (((class11535)this.L_0).U()) {
            int n = (Integer)((class11515)this.L_3).i();
            class093242.y((float)class11300.u((int)n) / 255.0f);
            class093242.N((float)class11300.N((int)n) / 255.0f);
            class093242.L((float)class11300.i((int)n) / 255.0f);
            class093242.u((float)class11300.y((int)n) / 255.0f);
        }
    }
}

