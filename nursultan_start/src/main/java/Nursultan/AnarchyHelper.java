/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09343
 *  Nursultan.class10967
 *  Nursultan.class10990
 *  Nursultan.class10992
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11107
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11328
 *  Nursultan.class11400
 *  Nursultan.class11542
 *  Nursultan.class11545
 *  Nursultan.class11561
 *  Nursultan.class11563
 *  Nursultan.class11568
 *  Nursultan.class11576
 *  Nursultan.class11585
 *  Nursultan.class11592
 *  Nursultan.class11782
 *  Nursultan.class11900
 *  Nursultan.class11910
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  org.joml.Vector2f
 *  org.joml.Vector3d
 */
package Nursultan;

import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09343;
import Nursultan.class10967;
import Nursultan.class10990;
import Nursultan.class10992;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11107;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11328;
import Nursultan.class11400;
import Nursultan.class11542;
import Nursultan.class11545;
import Nursultan.class11561;
import Nursultan.class11563;
import Nursultan.class11568;
import Nursultan.class11576;
import Nursultan.class11585;
import Nursultan.class11592;
import Nursultan.class11782;
import Nursultan.class11900;
import Nursultan.class11910;
import Nursultan.class11925;
import Nursultan.class11938;
import java.util.Iterator;
import java.util.List;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import org.joml.Vector2f;
import org.joml.Vector3d;

@class11080(L="AnarchyHelper", y=class11072.MISC, N=class11106.HELPER)
public class AnarchyHelper
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
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;

    public AnarchyHelper() {
        this.b();
        this.i_0 = new class11561(this, "desorientation", class06570.nG, "\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f", "desorientation");
        this.i_1 = new class11561(this, "trap", class06570.TW, "\u0422\u0440\u0430\u043f\u043a\u0430", "trap");
        this.i_2 = new class11561(this, "god-aura", class06570.ss, "\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430", "godsaura");
        this.i_3 = new class11561(this, "sheer-dust", class06570.vg, "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", "sheerdust");
        this.u_0 = new class11561(this, "stratum", class06570.ny, "\u041f\u043b\u0430\u0441\u0442", "stratum");
        this.u_1 = new class11561(this, "snowball", class06570.jP, "\u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", "freezeball");
        this.u_2 = new class11561(this, "fierytornado", class06570.GZ, "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447", "fierytornado");
        this.u_3 = new class11592(this, "holy-water", class11107.W, "potion-holy-water");
        this.u_4 = new class11592(this, "rage", class11107.t, "potion-rage");
        this.u_5 = new class11592(this, "paladin", class11107.N, "potion-paladin");
        this.L_0 = new class11592(this, "assassin", class11107.i, "potion-assassin");
        this.L_1 = new class11592(this, "drowsiness", class11107.X, "potion-drowsiness");
        this.L_2 = new class11592(this, "radiation", class11107.z, "potion-radiation");
        this.L_3 = List.of((class11561)this.i_0, (class11561)this.i_1, (class11561)this.i_2, (class11561)this.i_3, (class11561)this.u_0, (class11561)this.u_1, (class11561)this.u_2, (class11561)this.u_3, (class11561)this.u_4, (class11561)this.u_5, (class11561)this.L_0, (class11561)this.L_1, (class11561)this.L_2);
        this.L_4 = new class11568();
        this.L_5 = new class11585(this, (class11576)((class11568)this.L_4));
        this.L_6 = new class11545(this);
        this.L_7 = new class11900(0);
    }

    private void b() {
    }

    public void N(class11328 class113282) {
        this.b();
        ((class11900)this.L_7).N(class113282);
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        ((class11900)this.L_7).N(class11910.i() ? 2 : 0);
        ((class11900)this.L_7).y((Object)class109922);
    }

    @class11782
    public void N(class10996 class109962) {
        this.b();
        ((class11585)this.L_5).N();
    }

    @class11782
    public void N(class10967 class109672) {
        this.b();
        List var2 = ((class11568)this.L_4).N();
        if (var2.isEmpty()) {
            return;
        }
        Iterator var3 = var2.iterator();
        class09093 class090932 = class09080.u();
        while (var3.hasNext()) {
            int n;
            class11563 class115632 = (class11563)var3.next();
            int n2 = class115632.y();
            int n3 = n2 - (n = class11938.j().y());
            if (n3 < -10) {
                var3.remove();
                continue;
            }
            class06889 class068892 = ((class03386)((class06202)this.y_0).i_5).s().y();
            Vector3d vector3d = class115632.N().sub(class068892.M, class068892.B, class068892.Z, new Vector3d());
            Vector2f vector2f = class11925.N((float)((float)vector3d.x), (float)((float)vector3d.y), (float)((float)vector3d.z));
            if (vector2f == null) continue;
            vector2f = vector2f.round();
            int n4 = class115632.u().y();
            float f = n4 <= 0 ? 0.0f : (float)Math.max(n3, 0) / (float)n4;
            class11925.N((class09093)class090932, (class11213)((class11174)class11190.y_3).u(), (String)class115632.u().N(), (int)16, (float)vector2f.x, (float)vector2f.y, (class06584)class115632.L(), (int)n3, (float)f);
        }
    }

    @class11782
    public void N(class09343 class093432) {
        this.b();
        ((class11585)this.L_5).y();
        ((class11568)this.L_4).y();
    }

    @class11782
    public void N(class10990 class109902) {
        this.b();
        ((class11545)this.L_6).N(class109902);
        ((class11585)this.L_5).N(class109902);
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.b();
        ((List)this.L_3).forEach(class115612 -> class115612.y((Object)class114002));
    }
}

