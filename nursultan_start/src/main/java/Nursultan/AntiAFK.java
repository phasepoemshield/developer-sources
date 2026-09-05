/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11385
 *  Nursultan.class11464
 *  Nursultan.class11478
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11672
 *  Nursultan.class11688
 *  Nursultan.class11696
 *  Nursultan.class11705
 *  Nursultan.class11782
 *  Nursultan.class11801
 *  Nursultan.class11807
 *  Nursultan.class11907
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11385;
import Nursultan.class11464;
import Nursultan.class11478;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11672;
import Nursultan.class11688;
import Nursultan.class11696;
import Nursultan.class11705;
import Nursultan.class11782;
import Nursultan.class11801;
import Nursultan.class11807;
import Nursultan.class11907;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="AntiAFK", y=class11072.PLAYER, N=class11106.BASE)
public class AntiAFK
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;

    public AntiAFK() {
        this.b();
        this.L_0 = new class11478();
        this.L_1 = new class11705("camera-shake", true);
        this.L_2 = new class11688("click", true);
        this.L_3 = new class11672(this, (class11688)this.L_2, (class11705)this.L_1, "custom", true);
        this.L_4 = new class11696(this, (class11688)this.L_2, (class11705)this.L_1, "ft", false);
        this.L_5 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11807[]{(class11807)this.L_3, (class11807)this.L_4});
        ((class11517)this.L_5).L().forEach(class118072 -> {
            if (class118072 instanceof class11801) {
                ((class11801)class118072).N((Object)this);
            }
        });
    }

    private void b() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_6 = false;
        }
    }

    @class11782
    public void N(class11385 class113852) {
        this.b();
        if (((Boolean)this.L_6).booleanValue()) {
            ((class11807)((class11517)this.L_5).i()).y((Object)class113852);
        }
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        this.L_6 = false;
        if (((class06202)this.y_0).q()) {
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).k() || class11907.u()) {
            ((class11478)this.L_0).y();
            return;
        }
        if (((class11478)this.L_0).N(class11464.u((int)30))) {
            this.L_6 = true;
            ((class11478)this.L_0).y();
        }
        if (((Boolean)this.L_6).booleanValue()) {
            ((class11807)((class11517)this.L_5).i()).y((Object)class109922);
        }
    }
}

