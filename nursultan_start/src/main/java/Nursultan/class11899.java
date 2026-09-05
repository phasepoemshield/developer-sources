/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11781
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class04474
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class07055
 *  minecraft.class07438
 *  minecraft.class07469
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.class11781;
import Nursultan.class11891;
import Nursultan.class11897;
import Nursultan.class11915;
import java.util.List;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class07055;
import minecraft.class07438;
import minecraft.class07469;
import minecraft.class08687;

public class class11899 {
    public static Object[] N;
    private static byte[] G;
    private static String[] d;

    private static void L() {
        for (class03556 class035562 : (List)N[1]) {
            class07469 class074692 = ((class04453)((class06202)class11899.N[0]).T_4).method_5996(class035562);
            class07469 class074693 = ((class11897)((Object)N[2])).method_5996(class035562);
            if (class074692 == null || class074693 == null) continue;
            class074693.R();
            class074693.N(class074692.y());
            class074692.L().forEach(arg_0 -> ((class07469)class074693).y(arg_0));
        }
    }

    private static void M() {
        N = new Object[G[0]];
    }

    private class11899() {
        throw new UnsupportedOperationException(d[0]);
    }

    static {
        class11899.u();
        class11899.N();
        class11899.R();
        class11899.M();
        class11899.N[0] = class06202.Nq();
        class11899.N[1] = List.of(class05298.l, class05298.Y, class05298.T, class05298.s, class05298.O, class05298.G, class05298.o);
    }

    private static void u() {
        G = new byte[1];
        class11899.G[0] = 3;
    }

    public static class11915 N(boolean bl, boolean bl2, boolean bl3, int n) {
        if ((class11897)((Object)N[2]) == null || ((class11897)((Object)N[2])).method_73183() != (class03448)((class06202)class11899.N[0]).T_3) {
            class11897 class118972 = new class11897((class03448)((class06202)class11899.N[0]).T_3);
            class11899.N[2] = class118972;
        }
        class11899.N(bl, bl2, bl3);
        for (int i = 0; i < n; ++i) {
            ((class11897)((Object)N[2])).B();
            ((class11897)((Object)N[2])).method_6007();
            class11891.N((class11897)((Object)N[2]));
            ((class11897)((Object)class11899.N[2])).N_5 = ((class11897)((Object)N[2])).L();
            ((class11897)((Object)class11899.N[2])).N_6 = ((class11897)((Object)N[2])).method_23318();
        }
        return new class11915(((class11897)((Object)N[2])).method_5715(), ((class11897)((Object)N[2])).method_5624(), (Boolean)((class11897)((Object)class11899.N[2])).N_1, ((class11897)((Object)N[2])).method_5799(), ((class11897)((Object)N[2])).method_24828(), ((class11897)((Object)class11899.N[2])).field_6017, ((class07438)((class11897)((Object)class11899.N[2]))).fields_8212a028292fd3c078969e3ee4c71d9e8_5, (class11897)((Object)N[2]));
    }

    private static void N() {
    }

    public static class11915 N(int n) {
        return class11899.N(((class04474)((class04453)((class06202)class11899.N[0]).T_4).L_1).field_54155, n);
    }

    public static class11915 N(class08687 class086872, int n) {
        return class11899.N(class086872.R(), class086872.M(), class086872.i(), n);
    }

    private static void N(boolean bl, boolean bl2, boolean bl3) {
        class11899.L();
        ((class11897)((Object)N[2])).method_6088().clear();
        ((class04453)((class06202)class11899.N[0]).T_4).method_6088().forEach((class035562, class070552) -> ((class11897)((Object)((Object)N[2]))).method_26082((class07055)class070552, null));
        ((class04474)((class11897)((Object)class11899.N[2])).N_0).field_55868 = ((class04474)((class04453)((class06202)class11899.N[0]).T_4).L_1).method_3128();
        ((class11897)((Object)class11899.N[2])).N_1 = bl3;
        ((class11897)((Object)class11899.N[2])).N_2 = bl;
        ((class11897)((Object)class11899.N[2])).N_3 = bl2;
        ((class11897)((Object)N[2])).method_5728(bl2);
        ((class11897)((Object)class11899.N[2])).N_4 = Float.valueOf(((class04453)((class06202)class11899.N[0]).T_4).method_6115() && !((class04453)((class06202)class11899.N[0]).T_4).method_5765() ? ((class04453)((class06202)class11899.N[0]).T_4).Y() : 1.0f);
        ((class11897)((Object)class11899.N[2])).field_5957 = ((class04453)((class06202)class11899.N[0]).T_4).method_5799();
        ((class11897)((Object)N[2])).method_6033(((class04453)((class06202)class11899.N[0]).T_4).method_6032());
        ((class07438)((class11897)((Object)class11899.N[2]))).fields_8212a028292fd3c078969e3ee4c71d9e8_5 = (int)((class04453)((class06202)class11899.N[0]).T_4).fields_8212a028292fd3c078969e3ee4c71d9e8_5;
        ((class11897)((Object)class11899.N[2])).field_17046 = ((class04453)((class06202)class11899.N[0]).T_4).field_17046;
        ((class11897)((Object)N[2])).method_5814(((class04453)((class06202)class11899.N[0]).T_4).method_23317(), ((class04453)((class06202)class11899.N[0]).T_4).method_23318(), ((class04453)((class06202)class11899.N[0]).T_4).method_23321());
        ((class11897)((Object)N[2])).method_60608(((class04453)((class06202)class11899.N[0]).T_4).method_36454(), ((class04453)((class06202)class11899.N[0]).T_4).method_36455());
        ((class11897)((Object)N[2])).method_18380(((class04453)((class06202)class11899.N[0]).T_4).method_18376());
        ((class11897)((Object)N[2])).method_5796(((class04453)((class06202)class11899.N[0]).T_4).method_5681());
        ((class11897)((Object)N[2])).method_24830(((class04453)((class06202)class11899.N[0]).T_4).method_24828());
        ((class11897)((Object)class11899.N[2])).field_5976 = ((class04453)((class06202)class11899.N[0]).T_4).field_5976;
        ((class11897)((Object)class11899.N[2])).field_6017 = ((class04453)((class06202)class11899.N[0]).T_4).field_6017;
        ((class11897)((Object)N[2])).method_18799(((class04453)((class06202)class11899.N[0]).T_4).method_18798());
        class11781 class117812 = (class11781)((class04453)((class06202)class11899.N[0]).T_4);
        ((class11897)((Object)N[2])).N(class117812.N());
        ((class11897)((Object)N[2])).N(class117812.R());
        ((class11897)((Object)class11899.N[2])).N_6 = (double)((Double)((class04453)((class06202)class11899.N[0]).T_4).M_2);
        ((class11897)((Object)class11899.N[2])).N_5 = (boolean)((Boolean)((class04453)((class06202)class11899.N[0]).T_4).R_3);
    }

    private static void R() {
        d = new String[1];
        class11899.d[0] = "This is a utility class and cannot be instantiated";
    }
}

