/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11247
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  minecraft.class01421
 *  minecraft.class03049
 *  minecraft.class04453
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07050
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11247;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11782;
import minecraft.class01421;
import minecraft.class03049;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07050;
import org.joml.Matrix4f;

@class11080(L="Hands", y=class11072.VISUAL, N=class11106.WORLD)
public class Hands
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    public Hands() {
        this.n();
        this.L_0 = class11524.N((class11512)this, (String)"color-right", (int)-7694081);
        this.L_1 = class11524.N((class11512)this, (String)"color-left", (int)-7694081);
        this.L_2 = class11524.N((class11512)this, (String)"blur", (float)10.0f, (float)0.0f, (float)30.0f, (float)1.0f);
        this.L_3 = class11524.N((class11512)this, (String)"texture-mix", (float)0.5f, (float)0.0f, (float)0.5f, (float)0.1f);
        this.L_4 = new class11247();
    }

    private void n() {
    }

    public boolean m() {
        this.n();
        return this.U() && ((class11247)this.L_4).y();
    }

    public void y() {
        this.n();
        ((class11247)this.L_4).N();
    }

    public void N(class03049 class030492, float f, class01421 class014212, class04453 class044532, int n, Matrix4f matrix4f) {
        this.n();
        ((class11247)this.L_4).N(class030492, f, class014212, class044532, n, matrix4f, ((Integer)((class11515)this.L_0).i()).intValue(), ((Integer)((class11515)this.L_1).i()).intValue(), ((Float)((class11504)this.L_3).i()).floatValue());
    }

    @class11782
    public void N(class09321 class093212) {
        this.n();
        if (!((class05630)((class06202)this.y_0).i_7).NS().N() || ((class05630)((class06202)this.y_0).i_7).NG) {
            ((class11247)this.L_4).N();
            return;
        }
        ((class11247)this.L_4).N(((Float)((class11504)this.L_2).i()).intValue());
    }

    public boolean N(class07050 class070502) {
        this.n();
        return ((class11247)this.L_4).N(class070502);
    }
}

