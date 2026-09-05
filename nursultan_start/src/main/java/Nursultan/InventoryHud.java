/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09180
 *  Nursultan.class09181
 *  Nursultan.class09211
 *  Nursultan.class09227
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09801
 *  Nursultan.class09804
 *  Nursultan.class09809
 *  Nursultan.class09838
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09973
 *  Nursultan.class09975
 *  Nursultan.class09983
 *  Nursultan.class09991
 *  Nursultan.class11300
 *  Nursultan.class11352
 *  Nursultan.class11756
 *  Nursultan.class11761
 *  Nursultan.class11769
 *  Nursultan.class11782
 *  Nursultan.class11867
 *  Nursultan.class11938
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09180;
import Nursultan.class09181;
import Nursultan.class09211;
import Nursultan.class09227;
import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09804;
import Nursultan.class09809;
import Nursultan.class09838;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class09983;
import Nursultan.class09991;
import Nursultan.class11300;
import Nursultan.class11352;
import Nursultan.class11756;
import Nursultan.class11761;
import Nursultan.class11769;
import Nursultan.class11782;
import Nursultan.class11867;
import Nursultan.class11938;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

@class11761(u="inventory", i=10.0f, N=220.0f)
public class InventoryHud
extends class11769 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object u_0;
    public static Object u_1;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;
    public static Object R_4;

    private static void T() {
        y_0 = null;
        y_1 = "itemSlot";
        y_2 = 9;
        y_3 = 3;
        y_4 = 9;
        y_5 = 16;
        i_0 = 32;
        i_1 = 1;
        i_2 = 296;
        i_3 = 98;
        i_4 = 1;
        u_0 = 297;
        u_1 = 100;
        R_0 = 361;
        R_1 = 1;
        R_2 = 14;
        R_3 = 2;
        R_4 = 10;
        L_0 = -16777216;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        N_7 = null;
    }

    public InventoryHud() {
        super(InventoryHud::N);
    }

    static {
        InventoryHud.T();
        y_0 = class06202.Nq();
        L_0 = class11300.y((int)0, (int)0, (int)0, (int)255);
        class09991 class099912 = class09991.N().N(class09962.N((float)0.0f, (float)361.0f));
        L_1 = class09991.N((class09991[])new class09991[]{(class09991)class11756.y_1, class099912.y(class09962.N()).N(class09975.ROW)});
        L_2 = class09991.N().N(class09962.N()).y(class09962.N((float)100.0f)).N(12.0f).i(11.0f).N(class09973.CENTER).y(class09973.CENTER).N(class09983.BORDER_BOX);
        L_3 = class09227.N((T class092112) -> class09991.N().u(16.0f, 16.0f).i(class092112.M()));
        L_4 = class09991.N().N(class09962.y((float)297.0f)).y(class09962.y((float)100.0f)).L(1.0f).N(class09975.COLUMN).B(1.0f).N(class09983.BORDER_BOX);
        L_5 = class09991.N().N(class09962.N((float)100.0f)).y(class09962.y((float)32.0f)).N(class09975.ROW).B(1.0f);
        N_0 = class09991.N().u(32.0f, 32.0f).N(8.0f).N(class09983.BORDER_BOX);
        N_1 = class09991.N().u(16.0f, 16.0f);
        N_2 = class09991.N().N(class09969.FLOATING).N(1.0f, 13.0f).u(14.0f, 2.0f).y(((Integer)L_0).intValue());
        N_3 = class09991.N().N(class09969.FLOATING).N(0.0f, 0.0f).R().N(class09973.END).y(class09973.END).i(((Integer)class09181.N_0).intValue());
        N_4 = class09991.N().N(class09969.FLOATING).N(class09962.y((float)1.0f)).y(class09962.y((float)98.0f)).y(((Integer)class09181.L_3).intValue());
        N_5 = class09991.N().N(class09969.FLOATING).N(class09962.y((float)296.0f)).y(class09962.y((float)1.0f)).y(((Integer)class09181.L_3).intValue());
        N_6 = class09991.N().t(8.0f).N(new class09838("minecraft", class09079.REGULAR.N()));
        class09991 class099913 = class09991.N();
        N_7 = class09991.N((class09991[])new class09991[]{(class09991)N_6, class099913.i(((Integer)class09181.N_0).intValue()).N(1.0f, -16777216)});
    }

    private static class09798 i(int n) {
        String string = "itemSlot" + n;
        class06584 class065842 = (class04453)((class06202)InventoryHud.y_0).T_4 == null ? class06584.E : ((class04453)((class06202)InventoryHud.y_0).T_4).method_31548().method_5438(n);
        return class09778.N((class09991)((class09991)N_0), (T class097842) -> {
            class097842.N(string);
            if (class065842.R()) {
                return;
            }
            class11867 class118672 = class11938.k().N(class065842);
            if (class118672.L()) {
                class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)N_1, class09991.N().N(class118672.y(), class118672.N(), class118672.R(), class118672.i())});
                class097842.L(class097772 -> ((class09777)class097772.N(string + "-icon")).L(class11938.k().y()).N(class099912));
            }
            InventoryHud.N(class097842, string, class065842);
            InventoryHud.y(class097842, string, class065842);
        });
    }

    private static class09798 b() {
        return class09778.N((class09991)((class09991)L_4), (T class097843) -> {
            int n;
            float f;
            class097843.N("inventoryContent");
            int n2 = 0;
            while (n2 < 8) {
                f = n2 * 33 + 32;
                n = n2++;
                class097843.N((T class097842) -> ((class09784)class097842.N("inventoryVDivider-" + n)).N(class09991.N((class09991[])new class09991[]{(class09991)N_4, class09991.N().N(f, 0.0f)})));
            }
            n2 = 0;
            while (n2 < 2) {
                f = n2 * 33 + 32;
                n = n2++;
                class097843.N((T class097842) -> ((class09784)class097842.N("inventoryHDivider-" + n)).N(class09991.N((class09991[])new class09991[]{(class09991)N_5, class09991.N().N(0.0f, f)})));
            }
            n2 = 0;
            while (n2 < 3) {
                int n3 = n2++;
                class097843.N_3((class09991)L_5, class097842 -> {
                    class097842.N("inventoryRow-" + n3);
                    for (int i = 0; i < 9; ++i) {
                        int n2 = 9 + n3 * 9 + i;
                        class097842.y(InventoryHud.i(n2));
                    }
                });
            }
        });
    }

    public boolean y() {
        return class11938.u().NQ().U();
    }

    private static void y(class09784 class097843, String string, class06584 class065842) {
        int n = class065842.c();
        if (n <= 1) {
            return;
        }
        String string2 = Integer.toString(n);
        class097843.N_3((class09991)N_3, class097842 -> {
            class097842.N(string + "-count");
            class097842.y((T class098012) -> ((class09801)class098012.N(string + "-count-text")).L(string2).N((class09991)N_7));
        });
    }

    private static class09798 N(Void void_, class09809 class098092) {
        class09211 class092112 = (class09211)class098092.N((class09804)class09211.N_6);
        return class09778.N((class09991)((class09991)L_1), (T class097843) -> {
            class097843.N("inventoryWindow");
            class097843.N_3((class09991)L_2, class097842 -> {
                class097842.N("inventoryIconArea");
                class097842.L(class097772 -> ((class09777)class097772.N("hud-inventory")).L("icon:hud/inventory").N(((class09227)L_3).N(class092112)));
            });
            class097843.N((T class097842) -> ((class09784)class097842.N("inventoryDivider")).N((class09991)class09180.N_3));
            class097843.y(InventoryHud.b());
        });
    }

    @class11782
    public void N(class11352 class113522) {
        if (!this.y()) {
            return;
        }
        class11938.i().N();
    }

    private static void N(class09784 class097842, String string, class06584 class065842) {
        if (!class065842.m()) {
            return;
        }
        int n = class065842.s();
        if (n <= 0) {
            return;
        }
        float f = 1.0f - (float)class065842.P() / (float)n;
        int n2 = Math.max(0, Math.round(f * 14.0f));
        int n3 = class11300.N((float)f);
        class097842.N_3((class09991)N_2, class097843 -> {
            class097843.N(string + "-damageBg");
            if (n2 > 0) {
                class09991 class099912 = class09991.N().u((float)n2, 1.0f).y(n3);
                class097843.N((T class097842) -> ((class09784)class097842.N(string + "-damageBar")).N(class099912));
            }
        });
    }
}

