/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11207
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11328
 *  Nursultan.class11400
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11542
 *  Nursultan.class11548
 *  Nursultan.class11549
 *  Nursultan.class11550
 *  Nursultan.class11562
 *  Nursultan.class11571
 *  Nursultan.class11581
 *  Nursultan.class11583
 *  Nursultan.class11782
 *  Nursultan.class11884
 *  Nursultan.class11900
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  org.joml.Matrix4fStack
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11207;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11328;
import Nursultan.class11400;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11542;
import Nursultan.class11548;
import Nursultan.class11549;
import Nursultan.class11550;
import Nursultan.class11562;
import Nursultan.class11571;
import Nursultan.class11581;
import Nursultan.class11583;
import Nursultan.class11782;
import Nursultan.class11884;
import Nursultan.class11900;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Matrix4fStack;

@class11080(L="HolyHelper", y=class11072.MISC, N=class11106.HELPER)
public class HolyHelper
extends class11067
implements class11542 {
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
    public Object u_2;
    public Object u_3;

    public HolyHelper() {
        this.j();
        this.u_0 = new class11550(this, "explosive-stuff");
        this.u_1 = new class11549(this, "exp-bottle");
        this.u_2 = new class11581(this, "explosive-trap");
        this.u_3 = new class11562(this, "snow-ball");
        this.L_0 = new class11571(this, "stun");
        this.L_1 = new class11548(this, "trap");
        this.L_2 = List.of((class11583)this.u_0, (class11583)this.u_1, (class11583)this.u_2, (class11583)this.u_3, (class11583)this.L_0, (class11583)this.L_1);
        this.L_3 = class11524.N((class11512)this, (String)"show-stun-zone", (boolean)false);
        this.L_4 = (class11515)class11524.N((class11512)this, (String)"zone-color", (int)-11104513).N(class115362 -> {
            this.j();
            return (Boolean)((class11507)this.L_3).i();
        });
        this.L_5 = new class11900(5, 1);
        this.L_6 = new class11884(-15.0, -15.0, -15.0, 15.0, 15.0, 15.0).i(-0.05);
    }

    private void n() {
        this.j();
        if (!((Boolean)((class11507)this.L_3).i()).booleanValue()) {
            return;
        }
        this.L_7 = ((class11583)this.L_0).L().test((Object)((class04453)((class06202)this.y_0).T_4).method_6047());
    }

    private void j() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_7 = false;
        }
    }

    @class11782
    public void N(class09321 class093212) {
        this.j();
        class06889 class068892 = class093212.y().y();
        Matrix4fStack matrix4fStack = class093212.R();
        if (((Boolean)this.L_7).booleanValue()) {
            this.N(class093212, matrix4fStack, class068892);
        }
    }

    private void N(class09321 class093212, Matrix4fStack matrix4fStack, class06889 class068892) {
        this.j();
        matrix4fStack.pushMatrix();
        class06889 class068893 = new class06889(((class04453)((class06202)this.y_0).T_4).field_6014, ((class04453)((class06202)this.y_0).T_4).field_6036, ((class04453)((class06202)this.y_0).T_4).field_5969).N(((class04453)((class06202)this.y_0).T_4).method_73189(), (double)class093212.u().N(true)).u(class068892);
        matrix4fStack.translate((float)class068893.M, (float)class068893.B, (float)class068893.Z);
        class11207.N((Matrix4fStack)matrix4fStack, (class11213)((class11174)class11190.N_3).u(), (class11213)((class11174)class11190.N_1).u(), (class06889)class06889.L, (class11884)((class11884)this.L_6), (int)class11300.N((int)((Integer)((class11515)this.L_4).i()), (int)120));
        matrix4fStack.popMatrix();
    }

    public void N(class11328 class113282) {
        this.j();
        ((class11900)this.L_5).N(class113282);
    }

    @class11782
    public void N(class10992 class109922) {
        this.j();
        ((class11900)this.L_5).y((Object)class109922);
        this.n();
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.j();
        ((List)this.L_2).forEach(class115832 -> class115832.y((Object)class114002));
    }
}

