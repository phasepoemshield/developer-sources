/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09316
 *  Nursultan.class10976
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11252
 *  Nursultan.class11260
 *  Nursultan.class11268
 *  Nursultan.class11384
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11787
 *  minecraft.class03386
 *  minecraft.class05363
 *  minecraft.class06202
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09316;
import Nursultan.class10976;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11252;
import Nursultan.class11260;
import Nursultan.class11268;
import Nursultan.class11384;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11787;
import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import org.joml.Vector2f;

@class11080(L="FreeLook", y=class11072.VISUAL, N=class11106.WORLD)
public class FreeLook
extends class11067 {
    public Object L_0;
    public Object L_1;

    public FreeLook() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"pov", (class11535[])new class11787[]{new class11268("back", true), new class11260("front", false), new class11252("nothing", false)});
        this.L_1 = new Vector2f(0.0f, 0.0f);
    }

    public boolean Z() {
        this.b();
        class05363 class053632 = ((class03386)((class06202)this.y_0).i_5).s();
        this.L_1 = new Vector2f(class053632.R(), class053632.i());
        return super.Z();
    }

    private void b() {
    }

    @class11782
    public void N(class10976 class109762) {
        this.b();
        ((class11787)((class11517)this.L_0).i()).y((Object)class109762);
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11384 class113842) {
        this.b();
        ((Vector2f)this.L_1).x += (float)class113842.u() * 0.15f;
        ((Vector2f)this.L_1).y += (float)class113842.L() * 0.15f;
        class113842.N();
    }

    @class11782(y=class11777.AFTER)
    public void N(class09316 class093162) {
        this.b();
        class093162.N(((Vector2f)this.L_1).x);
        class093162.y(((Vector2f)this.L_1).y);
    }
}

