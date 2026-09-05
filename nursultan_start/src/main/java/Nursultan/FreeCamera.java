/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09305
 *  Nursultan.class09316
 *  Nursultan.class10967
 *  Nursultan.class10976
 *  Nursultan.class10991
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11176
 *  Nursultan.class11381
 *  Nursultan.class11384
 *  Nursultan.class11385
 *  Nursultan.class11400
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11902
 *  Nursultan.class11907
 *  Nursultan.class11908
 *  Nursultan.class11925
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class08844
 *  org.joml.Vector2f
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09305;
import Nursultan.class09316;
import Nursultan.class10967;
import Nursultan.class10976;
import Nursultan.class10991;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11176;
import Nursultan.class11381;
import Nursultan.class11384;
import Nursultan.class11385;
import Nursultan.class11400;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11902;
import Nursultan.class11907;
import Nursultan.class11908;
import Nursultan.class11925;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class08844;
import org.joml.Vector2f;
import org.joml.Vector3d;
import org.joml.Vector3dc;

@class11080(L="FreeCamera", y=class11072.MOVEMENT, N=class11106.TOOLS)
public class FreeCamera
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;

    public FreeCamera() {
        this.v();
        this.L_0 = class11524.N((class11512)this, (String)"speed-xz", (float)1.0f, (float)0.1f, (float)4.0f, (float)0.1f);
        this.L_1 = class11524.N((class11512)this, (String)"speed-y", (float)0.6f, (float)0.1f, (float)2.0f, (float)0.1f);
        this.L_2 = class11524.N((class11512)this, (String)"walk-by-click", (boolean)false);
        this.L_3 = class11524.N((class11512)this, (String)"show-camera-position", (boolean)true);
        this.L_4 = new Vector3d(0.0, 0.0, 0.0);
        this.L_5 = new Vector3d(0.0, 0.0, 0.0);
        this.L_6 = new Vector2f(0.0f, 0.0f);
    }

    public boolean Z() {
        this.v();
        if ((class04453)((class06202)this.y_0).T_4 == null || (class03448)((class06202)this.y_0).T_3 == null) {
            this.N(false);
            return false;
        }
        class05363 class053632 = ((class03386)((class06202)this.y_0).i_5).s();
        class06889 class068892 = class053632.y();
        ((Vector3d)this.L_5).set((Vector3dc)new Vector3d(class068892.M, class068892.B, class068892.Z));
        ((Vector3d)this.L_4).set((Vector3dc)((Vector3d)this.L_5));
        this.L_6 = new Vector2f(class053632.R(), class053632.i());
        return super.Z();
    }

    public boolean i() {
        if ((class04453)((class06202)this.y_0).T_4 != null && class11907.i()) {
            IPathingBehavior iPathingBehavior = class11907.N().getPathingBehavior();
            iPathingBehavior.cancelEverything();
            iPathingBehavior.forceCancel();
        }
        return super.i();
    }

    private void v() {
    }

    @class11782
    public void N(class09305 class093052) {
        class093052.N(true);
    }

    @class11782(y=class11777.AFTER)
    public void N(class09316 class093162) {
        this.v();
        class093162.N(((Vector2f)this.L_6).x);
        class093162.y(((Vector2f)this.L_6).y);
        class093162.L(class04995.u((double)class11925.N((class07049)((class04453)((class06202)this.y_0).T_4)), (double)((Vector3d)this.L_4).x, (double)((Vector3d)this.L_5).x));
        class093162.y(class04995.u((double)class11925.N((class07049)((class04453)((class06202)this.y_0).T_4)), (double)((Vector3d)this.L_4).y, (double)((Vector3d)this.L_5).y));
        class093162.N(class04995.u((double)class11925.N((class07049)((class04453)((class06202)this.y_0).T_4)), (double)((Vector3d)this.L_4).z, (double)((Vector3d)this.L_5).z));
        class093162.N();
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class10967 class109672) {
        this.v();
        if (!((Boolean)((class11507)this.L_3).i()).booleanValue()) {
            return;
        }
        String string = String.format("x: %s y: %s z: %s", (int)((Vector3d)this.L_5).x(), (int)((Vector3d)this.L_5).y(), (int)((Vector3d)this.L_5).z());
        class08844 class088442 = ((class06202)this.y_0).Nt();
        class09093 class090932 = class09080.u();
        float f = (float)class088442.U() / 2.0f;
        float f2 = (float)class088442.E() / 2.0f;
        float f3 = 16.0f;
        class11176.N((class09093)class090932, (String)string, (float)(f - class090932.y(string, f3, class09079.REGULAR, false) / 2.0f), (float)(f2 - 60.0f), (float)f3, (int)-1, (int)-16777216);
    }

    @class11782
    public void N(class10991 class109912) {
        class109912.N(true);
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        class06889 class068892;
        class06889 class068893;
        this.v();
        if (!((Boolean)((class11507)this.L_2).i()).booleanValue() || class114002.Z() != class11381.MOUSE || class114002.z() != 1) {
            return;
        }
        if (class11907.i()) {
            return;
        }
        class06889 class068894 = ((class03386)((class06202)this.y_0).i_5).s().y();
        class06183 class061832 = ((class03448)((class06202)this.y_0).T_3).N(new class05862(class068894, class068893 = class068894.i(class068892 = ((class04453)((class06202)this.y_0).T_4).method_5631(((Vector2f)this.L_6).y, ((Vector2f)this.L_6).x).L(256.0)), class05849.field_17558, class05835.field_1348, (class07049)((class04453)((class06202)this.y_0).T_4)));
        if (class061832 == null || class061832.N() != class07113.field_1332) {
            return;
        }
        class07209 class072092 = class061832.u();
        class11907.N().getCustomGoalProcess().setGoalAndPath((Goal)new GoalBlock(class072092.method_10263(), class072092.method_10264() + 1, class072092.method_10260()));
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class10996 class109962) {
        float f;
        this.v();
        ((Vector3d)this.L_4).set((Vector3dc)((Vector3d)this.L_5));
        if (class11902.y()) {
            return;
        }
        boolean bl = class11902.N((int)((class05630)((class06202)this.y_0).i_7).n.N.y());
        boolean bl2 = class11902.N((int)((class05630)((class06202)this.y_0).i_7).G.N.y());
        boolean bl3 = class11902.N((int)((class05630)((class06202)this.y_0).i_7).t.N.y());
        boolean bl4 = class11902.N((int)((class05630)((class06202)this.y_0).i_7).l.N.y());
        float f2 = bl == bl2 ? 0.0f : (f = bl ? 1.0f : -1.0f);
        float f3 = bl3 == bl4 ? 0.0f : (bl3 ? 1.0f : -1.0f);
        boolean bl5 = class11902.N((int)((class05630)((class06202)this.y_0).i_7).d.N.y());
        boolean bl6 = class11902.N((int)((class05630)((class06202)this.y_0).i_7).w.N.y());
        if (bl5) {
            ((Vector3d)this.L_5).y += (double)((Float)((class11504)this.L_1).i()).floatValue();
        }
        if (bl6) {
            ((Vector3d)this.L_5).y -= (double)((Float)((class11504)this.L_1).i()).floatValue();
        }
        if (f3 != 0.0f || f != 0.0f) {
            float f4 = class11908.N((float)class11902.N((float)((Vector2f)this.L_6).x, (float)f, (float)f3));
            ((Vector3d)this.L_5).x += (double)(-class04995.m((double)f4) * ((Float)((class11504)this.L_0).i()).floatValue());
            ((Vector3d)this.L_5).z += (double)(class04995.P((double)f4) * ((Float)((class11504)this.L_0).i()).floatValue());
        }
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11385 class113852) {
        class11902.N((class11385)class113852);
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11384 class113842) {
        this.v();
        ((Vector2f)this.L_6).x += (float)class113842.u() * 0.15f;
        ((Vector2f)this.L_6).y += (float)class113842.L() * 0.15f;
        ((Vector2f)this.L_6).y = class04995.N((float)((Vector2f)this.L_6).y, (float)-90.0f, (float)90.0f);
        class113842.N();
    }

    @class11782(y=class11777.AFTER)
    public void N(class10976 class109762) {
        class109762.N(true);
        class109762.y(false);
    }
}

