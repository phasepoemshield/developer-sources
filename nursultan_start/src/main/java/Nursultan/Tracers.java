/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11184
 *  Nursultan.class11190
 *  Nursultan.class11414
 *  Nursultan.class11419
 *  Nursultan.class11437
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11801
 *  Nursultan.class11925
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11184;
import Nursultan.class11190;
import Nursultan.class11414;
import Nursultan.class11419;
import Nursultan.class11437;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11801;
import Nursultan.class11925;
import java.util.List;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@class11080(L="Tracers", y=class11072.VISUAL, N=class11106.SCREEN)
public class Tracers
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    public Tracers() {
        this.s();
        this.L_0 = new Matrix4f();
        this.L_1 = new class11414(this, "players", true);
        this.L_2 = new class11437(this, "friends", true);
        this.L_3 = class11524.y((class11512)this, (String)"entities", (class11535[])new class11419[]{(class11414)this.L_1, (class11437)this.L_2});
        this.L_4 = new Matrix4f();
        for (class11419 class114192 : ((class11523)this.L_3).L()) {
            if (!(class114192 instanceof class11801)) continue;
            class114192.N((Object)this);
        }
    }

    private void s() {
    }

    @class11782(y=class11777.BEFORE)
    public void N(class09321 class093212) {
        this.s();
        class11184 class111842 = ((class11174)class11190.N_2).R();
        class06889 class068892 = class093212.y().y();
        Matrix4f matrix4f = class093212.L().L().N().invert((Matrix4f)this.L_4);
        Matrix4f matrix4f2 = class093212.N().invert((Matrix4f)this.L_0).mul((Matrix4fc)matrix4f);
        for (class07049 class070492 : ((class03448)((class06202)this.y_0).T_3).M()) {
            if (class070492 == (class04453)((class06202)this.y_0).T_4) continue;
            for (int i = 0; i < ((List)((class11523)this.L_3).i()).size(); ++i) {
                class11419 class114192 = (class11419)((List)((class11523)this.L_3).i()).get(i);
                if (!class114192.test((Object)class070492)) continue;
                int n = class114192.N();
                class111842.N(matrix4f2, 0.0f, 0.0f, -1.0f).N((Matrix4f)class093212.R(), (float)(class11925.i((class07049)class070492) - class068892.M), (float)(class11925.u((class07049)class070492) - class068892.B), (float)(class11925.L((class07049)class070492) - class068892.Z)).y(n).y(n).N(0.0f).y();
            }
        }
    }
}

