/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09181
 *  Nursultan.class09321
 *  Nursultan.class09343
 *  Nursultan.class10401
 *  Nursultan.class10967
 *  Nursultan.class10972
 *  Nursultan.class11002
 *  Nursultan.class11004
 *  Nursultan.class11005
 *  Nursultan.class11007
 *  Nursultan.class11020
 *  Nursultan.class11033
 *  Nursultan.class11035
 *  Nursultan.class11043
 *  Nursultan.class11051
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11234
 *  Nursultan.class11236
 *  Nursultan.class11269
 *  Nursultan.class11273
 *  Nursultan.class11300
 *  Nursultan.class11371
 *  Nursultan.class11396
 *  Nursultan.class11464
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11785
 *  Nursultan.class11786
 *  Nursultan.class11793
 *  Nursultan.class11806
 *  Nursultan.class11814
 *  Nursultan.class11816
 *  Nursultan.class11817
 *  Nursultan.class11824
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  minecraft.class01054
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class07049
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09181;
import Nursultan.class09321;
import Nursultan.class09343;
import Nursultan.class10401;
import Nursultan.class10967;
import Nursultan.class10972;
import Nursultan.class11002;
import Nursultan.class11004;
import Nursultan.class11005;
import Nursultan.class11007;
import Nursultan.class11020;
import Nursultan.class11033;
import Nursultan.class11035;
import Nursultan.class11043;
import Nursultan.class11051;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11234;
import Nursultan.class11236;
import Nursultan.class11269;
import Nursultan.class11273;
import Nursultan.class11300;
import Nursultan.class11371;
import Nursultan.class11396;
import Nursultan.class11464;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11785;
import Nursultan.class11786;
import Nursultan.class11793;
import Nursultan.class11806;
import Nursultan.class11814;
import Nursultan.class11816;
import Nursultan.class11817;
import Nursultan.class11824;
import Nursultan.class11925;
import Nursultan.class11938;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import minecraft.class01054;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class07049;
import org.joml.Vector4f;

@class11080(L="EntityESP", y=class11072.VISUAL, N=class11106.SCREEN)
public class EntityESP
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public Object M_3;
    public Object B_0;
    public Object B_1;
    public Object B_2;
    public Object B_3;
    public Object Z_0;
    public Object Z_1;
    public Object Z_2;
    public Object Z_3;
    public Object Z_4;
    public Object Z_5;
    public Object z_0;
    public Object z_1;

    private int P() {
        this.s();
        if (((class11535)this.u_2).U()) {
            return (Integer)((class11515)this.u_6).i();
        }
        if (((class11535)this.u_3).U()) {
            return class11300.y((int)class09181.N(), (float)0.2f);
        }
        return -65536;
    }

    public EntityESP() {
        this.s();
        this.R_0 = new class11273(this, "players", true);
        this.R_1 = new class11005(this, "friends", true);
        this.R_2 = new class11269(this, "villagers", true);
        this.R_3 = new class11236(this, "monsters", false);
        this.R_4 = new class11033(this, "animals", false);
        this.R_5 = new class11035(this, "items", true);
        this.M_0 = new class11234(this, "self", false);
        this.M_1 = new class11004(this, "chest-minecart", false);
        this.M_2 = new class11785("invisible", true);
        this.M_3 = new class11786("naked", true);
        this.i_0 = new class11793("bot", false);
        this.i_1 = new class11020("dormant", false);
        this.i_2 = class11524.y((class11512)this, (String)"entities", (class11535[])new class11051[]{(class11273)this.R_0, (class11005)this.R_1, (class11269)this.R_2, (class11035)this.R_5, (class11234)this.M_0, (class11236)this.R_3, (class11033)this.R_4, (class11004)this.M_1});
        this.i_3 = (class11523)class11524.y((class11512)this, (String)"target-condition", (class11535[])new class11817[]{(class11785)this.M_2, (class11786)this.M_3, (class11793)this.i_0, (class11020)this.i_1}).N((T class115362) -> {
            this.s();
            return ((class11273)this.R_0).U();
        });
        this.i_4 = new class11535("name", true);
        this.L_0 = new class11535("equipment", true);
        this.L_1 = new class11535("hold-in-hands", false);
        this.L_2 = new class11535("box", true);
        this.L_3 = new class11535("ft-spheres", true);
        this.L_4 = new class11535("health-bar", true);
        this.L_5 = new class11535("shader", true);
        this.z_0 = new class11535("chams", false);
        this.z_1 = class11524.y((class11512)this, (String)"details", (class11535[])new class11535[]{(class11535)this.L_0, (class11535)this.L_1, (class11535)this.i_4, (class11535)this.L_2, (class11535)this.L_3, (class11535)this.L_4, (class11535)this.L_5, (class11535)this.z_0});
        this.B_0 = new class11007("_1x", false, 1);
        this.B_1 = new class11007("_2x", true, 2);
        this.B_2 = (class11517)class11524.N((class11512)this, (String)"equipment-size", (class11535[])new class11007[]{(class11007)this.B_0, (class11007)this.B_1}).N((T class115362) -> {
            this.s();
            return ((class11535)this.L_0).U();
        });
        this.B_3 = (class11504)class11524.N((class11512)this, (String)"dormant-display-time", (float)3.0f, (float)2.0f, (float)10.0f, (float)1.0f).N((T class115362) -> {
            this.s();
            return ((class11020)this.i_1).U() && ((class11523)this.i_3).E();
        });
        this.u_0 = (class11515)class11524.N((class11512)this, (String)"box-color", (int)-11104513).N((T class115362) -> {
            this.s();
            return ((class11535)this.L_2).U();
        });
        this.u_1 = new class11535("health", true);
        this.u_2 = new class11535("custom", false);
        this.u_3 = new class11535("client", false);
        this.u_4 = (class11517)class11524.N((class11512)this, (String)"health-bar-mode", (class11535[])new class11535[]{(class11535)this.u_1, (class11535)this.u_2, (class11535)this.u_3}).N((T class115362) -> {
            this.s();
            return ((class11535)this.L_4).U();
        });
        this.u_5 = (class11515)class11524.N((class11512)this, (String)"health-bar-color", (int)-16711936).N((T class115362) -> {
            this.s();
            return ((class11535)this.L_4).U() && ((class11535)this.u_2).U();
        });
        this.u_6 = (class11515)class11524.N((class11512)this, (String)"health-bar-color-bottom", (int)-65536).N((T class115362) -> {
            this.s();
            return ((class11535)this.L_4).U() && ((class11535)this.u_2).U();
        });
        this.u_7 = (class11504)class11524.N((class11512)this, (String)"scale", (float)20.0f, (float)12.0f, (float)24.0f, (float)4.0f).N((T class115362) -> {
            this.s();
            return ((class11535)this.i_4).U();
        });
        this.Z_0 = new class11535("formatted", true);
        this.Z_1 = new class11535("item-name", false);
        this.Z_2 = new class11535("both", false);
        this.Z_3 = (class11517)class11524.N((class11512)this, (String)"item-name-mode", (class11535[])new class11535[]{(class11535)this.Z_0, (class11535)this.Z_1, (class11535)this.Z_2}).N((T class115362) -> {
            this.s();
            return ((class11535)this.i_4).U() && ((class11035)this.R_5).U();
        });
        this.Z_4 = new class11002(this);
        this.Z_5 = new HashSet();
    }

    private void s() {
    }

    public class11504 m() {
        this.s();
        return (class11504)this.u_7;
    }

    private int j() {
        this.s();
        if (((class11535)this.u_2).U()) {
            return (Integer)((class11515)this.u_5).i();
        }
        if (((class11535)this.u_3).U()) {
            return class11300.N((int)class09181.N(), (float)0.9f);
        }
        return -16711936;
    }

    @class11782
    public void N(class11396 class113962) {
        this.s();
        if (!((class11020)this.i_1).U() || !((class11523)this.i_3).E()) {
            return;
        }
        class07049 class070492 = class113962.N();
        if (!(class070492 instanceof class10401)) {
            return;
        }
        class10401 class104012 = (class10401)class070492;
        ((class11824)((class11814)class104012).dataManager()).y().N((Object)true);
        ((Set)this.Z_5).add(EntityESP.N(class104012));
    }

    @class11782
    public void N(class09321 class093212) {
        this.s();
        ((class11002)this.Z_4).N(class093212);
    }

    @class11782
    public void N(class11371 class113712) {
        this.s();
        class07049 class070492 = class113712.N();
        if (!(class070492 instanceof class10401)) {
            return;
        }
        class10401 class104012 = (class10401)class070492;
        ((Set)this.Z_5).remove(EntityESP.N(class104012));
    }

    @class11782(y=class11777.BEFORE)
    public void N(class10967 class109672) {
        this.s();
        class01054 class010542 = class109672.N();
        ((class11002)this.Z_4).N(class010542);
        class09093 class090932 = class09080.u();
        for (class07049 class070492 : ((class03448)((class06202)this.y_0).T_3).M()) {
            if (!class11925.y((class07049)class070492)) continue;
            this.N(class070492, class010542, class090932);
        }
        ((Set)this.Z_5).removeIf(class110432 -> {
            this.s();
            if (class11938.j().y() - class110432.y() > class11464.u((int)((Float)((class11504)this.B_3).i()).intValue())) {
                return true;
            }
            this.N((class07049)class110432.N(), class010542, class090932);
            return false;
        });
    }

    private static class11043 N(class10401 class104012) {
        return new class11043(class104012, class11938.j().y());
    }

    @class11782
    public void N(class10972 class109722) {
        this.s();
        if (!((class11535)this.i_4).U()) {
            return;
        }
        class07049 class070492 = (class07049)((class11816)((class11806)class109722.L()).dataManager()).N().N();
        Iterator iterator = ((List)((class11523)this.i_2).i()).iterator();
        while (iterator.hasNext()) {
            if (!((class11051)iterator.next()).test((Object)class070492)) continue;
            class109722.N();
        }
    }

    @class11782
    public void N(class09343 class093432) {
        this.s();
        ((Set)this.Z_5).clear();
    }

    private void N(class07049 class070492, class01054 class010542, class09093 class090932) {
        this.s();
        Vector4f vector4f = class11925.N((class07049)class070492, (boolean)true);
        if (vector4f == null || class070492.method_5476() == null) {
            return;
        }
        for (class11051 class110512 : (List)((class11523)this.i_2).i()) {
            if (!class110512.test((Object)class070492)) continue;
            if (((class11535)this.L_4).U()) {
                class110512.N(class010542, class090932, vector4f, class070492, this.j(), this.P());
            }
            if (((class11535)this.L_2).U()) {
                class110512.N(class010542, class090932, vector4f, class070492, ((Integer)((class11515)this.u_0).i()).intValue());
            }
            if (((class11535)this.i_4).U()) {
                class110512.N(class010542, class090932, vector4f, class070492);
            }
            if (((class11535)this.L_0).U()) {
                class110512.L(class010542, class090932, vector4f, class070492);
            }
            if (!((class11535)this.L_1).U()) break;
            class110512.y(class010542, class090932, vector4f, class070492);
            break;
        }
    }
}

