/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1304
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.nu;
import ruhack.phobia.nv;
import ruhack.phobia.nz;
import ruhack.phobia.oc;
import ruhack.phobia.pn;

public class ev
extends ds {
    private boolean fireworkFromHotbar;
    private final ka elytraBind;
    private static final String SWAP_ID_FIREWORK = "ElytraHelper_Firework";
    private static final int TEMP_HOTBAR_SLOT = 8;
    private static final long dp = 4845067410337218550L;
    private final kf mode;
    private static final int CHEST_ARMOR_SLOT = 6;
    private int elytraTargetSlot;
    private int previousSlot;
    private static int[] bnbx = new int[637];
    private final ka fireworkBind;
    public static final boolean c;
    private int fireworkSlot;
    private static final String SWAP_ID_ELYTRA = "ElytraHelper_Elytra";
    public static final boolean a;
    private static int[] bnby;
    private static long[] bnct;
    private final kb recast;
    private static long[] bncs;
    public static final int b;

    private static /* synthetic */ void bomc() {
        ev.bnbx[300] = 1412126788;
        ev.bnbx[301] = 1497914367;
        ev.bnbx[302] = -714864786;
        ev.bnbx[303] = 125966305;
        ev.bnbx[304] = 1106968273;
        ev.bnbx[305] = -2039798467;
        ev.bnbx[306] = 242730221;
        ev.bnbx[307] = -941617594;
        ev.bnbx[308] = -1627573476;
        ev.bnbx[309] = -1508717126;
        ev.bnbx[310] = -29920956;
        ev.bnbx[311] = -1767126425;
        ev.bnbx[312] = 1205358231;
        ev.bnbx[313] = -1635670204;
        ev.bnbx[314] = 1985602917;
        ev.bnbx[315] = -1505940191;
        ev.bnbx[316] = 1828825298;
        ev.bnbx[317] = 314991315;
        ev.bnbx[318] = -255974626;
        ev.bnbx[319] = 333837080;
        ev.bnbx[320] = -552600277;
        ev.bnbx[321] = -1053222316;
        ev.bnbx[322] = -491137912;
        ev.bnbx[323] = 187815571;
        ev.bnbx[324] = -1803871978;
        ev.bnbx[325] = -979580969;
        ev.bnbx[326] = 989339621;
        ev.bnbx[327] = 733109547;
        ev.bnbx[328] = 1605300668;
        ev.bnbx[329] = -751143326;
        ev.bnbx[330] = -877294809;
        ev.bnbx[331] = 1570620272;
        ev.bnbx[332] = -770274633;
        ev.bnbx[333] = -624113960;
        ev.bnbx[334] = 749599524;
        ev.bnbx[335] = -2105720428;
        ev.bnbx[336] = -884343319;
        ev.bnbx[337] = -1937802802;
        ev.bnbx[338] = -1004362945;
        ev.bnbx[339] = -107400546;
        ev.bnbx[340] = 2064567185;
        ev.bnbx[341] = 47734858;
        ev.bnbx[342] = 1921506173;
        ev.bnbx[343] = 981756609;
        ev.bnbx[344] = -106207235;
        ev.bnbx[345] = -227065707;
        ev.bnbx[346] = -159329698;
        ev.bnbx[347] = 391719225;
        ev.bnbx[348] = 1175455140;
        ev.bnbx[349] = 1037338332;
        ev.bnbx[350] = -1013625206;
        ev.bnbx[351] = 2002080997;
        ev.bnbx[352] = -1752144971;
        ev.bnbx[353] = -1550235746;
        ev.bnbx[354] = -1485798022;
        ev.bnbx[355] = -430894727;
        ev.bnbx[356] = 1995148809;
        ev.bnbx[357] = -1167299823;
        ev.bnbx[358] = 230302145;
        ev.bnbx[359] = -1788951060;
        ev.bnbx[360] = -1090261725;
        ev.bnbx[361] = -562304972;
        ev.bnbx[362] = 321768168;
        ev.bnbx[363] = 1574298101;
        ev.bnbx[364] = -682951231;
        ev.bnbx[365] = -8232138;
        ev.bnbx[366] = -167376902;
        ev.bnbx[367] = 1828249201;
        ev.bnbx[368] = 1731098685;
        ev.bnbx[369] = -9288650;
        ev.bnbx[370] = -908475955;
        ev.bnbx[371] = 1875597882;
        ev.bnbx[372] = -1582603079;
        ev.bnbx[373] = 434964320;
        ev.bnbx[374] = -2079975506;
        ev.bnbx[375] = 759887816;
        ev.bnbx[376] = -2093405458;
        ev.bnbx[377] = 384502051;
        ev.bnbx[378] = 0x77000AA0;
        ev.bnbx[379] = -1835251390;
        ev.bnbx[380] = -1881597977;
        ev.bnbx[381] = -355893920;
        ev.bnbx[382] = -847505408;
        ev.bnbx[383] = -1140810903;
        ev.bnbx[384] = -735358117;
        ev.bnbx[385] = -1118839004;
        ev.bnbx[386] = 1614365996;
        ev.bnbx[387] = 1812085220;
        ev.bnbx[388] = -1730827215;
        ev.bnbx[389] = 490044142;
        ev.bnbx[390] = 704674014;
        ev.bnbx[391] = 827058060;
        ev.bnbx[392] = 2034881960;
        ev.bnbx[393] = 979599604;
        ev.bnbx[394] = -856045811;
        ev.bnbx[395] = -384170506;
        ev.bnbx[396] = -731320206;
        ev.bnbx[397] = -371863666;
        ev.bnbx[398] = 1696551392;
        ev.bnbx[399] = -448610630;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ev() {
        var2_1 /* !! */  = ev.b;
        super("ElytraHelper", "\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u044d\u043b\u0438\u0442\u0440\u044b \u0438 \u0431\u044b\u0441\u0442\u0440\u044b\u0439 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a", du.MISC);
        this.elytraBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u044d\u043b\u0438\u0442\u0440\u044b", "\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u044d\u043b\u0438\u0442\u0440\u044b/\u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a\u0430");
        this.fireworkBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", "\u0411\u044b\u0441\u0442\u0440\u043e\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430");
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u043e\u0434\u0438\u043d \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"});
        this.recast = new kb("\u0410\u0432\u0442\u043e \u0432\u0437\u043b\u0435\u0442", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043d\u0430\u0447\u0438\u043d\u0430\u0435\u0442 \u043f\u043e\u043b\u0435\u0442").setValue((boolean)ev.bnbz("bnca", bnbw(int ), (int)0));
        this.fireworkSlot = (int)ev.bnbz("bncb", bnbw(int ), (int)1);
        this.previousSlot = (int)ev.bnbz("bncc", bnbw(int ), (int)2);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.fireworkFromHotbar = ev.bnbz("bncd", bnbw(int ), (int)3);
                this.elytraTargetSlot = (int)ev.bnbz("bnce", bnbw(int ), (int)4);
                this.settings(new jx[]{this.elytraBind, this.fireworkBind, this.mode, this.recast});
                return;
            }
lbl16:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)ev.bnbz("bncf", bnbw(int ), (int)5);
                ** GOTO lbl48
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ev.bnbz("bncg", bnbw(int ), (int)6);
                    continue;
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)ev.bnbz("bnch", bnbw(int ), (int)7);
                break;
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)ev.bnbz("bnci", bnbw(int ), (int)8);
                }
            }
lbl30:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)ev.bnbz("bncj", bnbw(int ), (int)9);
                ** GOTO lbl36
            }
            case 5: {
                var2_1 /* !! */  = (int)ev.bnbz("bnck", bnbw(int ), (int)10);
                ** GOTO lbl16
            }
lbl36:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)ev.bnbz("bncl", bnbw(int ), (int)11);
                break;
            }
            case 7: {
                var2_1 /* !! */  = (int)ev.bnbz("bncm", bnbw(int ), (int)12);
                ** GOTO lbl48
            }
            case 8: {
                var2_1 /* !! */  = (int)ev.bnbz("bncn", bnbw(int ), (int)13);
                ** GOTO lbl30
            }
            case 9: {
                var2_1 /* !! */  = (int)ev.bnbz("bnco", bnbw(int ), (int)14);
                break;
            }
lbl48:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)ev.bnbz("bncp", bnbw(int ), (int)15);
                ** GOTO lbl16
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)ev.bnbz("bncq", bnbw(int ), (int)16);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block144: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bncu", bncr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ev.bnbz("bncv", bnbw(int ), (int)17)) break;
                v0 /* !! */  = (long)ev.bnbz("bncw", bnbw(int ), (int)18);
            }
            var4_2 = ev.c;
            v1 /* !! */  = ev.dp;
            if (true) ** GOTO lbl11
            block97: while (true) {
                v1 /* !! */  = (long)(v2 - ev.bnbz("bncx", bncr(int ), (int)1));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1309097994: {
                        break block97;
                    }
                    case 1057195534: {
                        v2 = ev.bnbz("bncy", bncr(int ), (int)2);
                        continue block97;
                    }
                    case 1256145723: {
                        v2 = ev.bnbz("bncz", bncr(int ), (int)3);
                        continue block97;
                    }
                }
                break;
            }
            var3_3 /* !! */  = ev.b;
            v3 /* !! */  = ev.dp;
            if (true) ** GOTO lbl25
            block98: while (true) {
                v3 /* !! */  = (long)(ev.bnbz("bndb", bncr(int ), (int)5) - ev.bnbz("bnda", bncr(int ), (int)4));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1855757971: {
                        continue block98;
                    }
                    case -1309097994: {
                        break block98;
                    }
                }
                break;
            }
            var2_4 = ev.a;
            if (var4_2) {
                throw null;
lbl33:
                // 13 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl33
            v4 /* !! */  = ev.dp;
            if (true) ** GOTO lbl40
            block100: while (true) {
                v4 /* !! */  = (long)(ev.bnbz("bndd", bncr(int ), (int)7) - ev.bnbz("bndc", bncr(int ), (int)6));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1309097994: {
                        break block100;
                    }
                    case -190097571: {
                        continue block100;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bnde", bncr(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ev.bnbz("bndf", bnbw(int ), (int)19)) break;
                v5 /* !! */  = (long)ev.bnbz("bndg", bnbw(int ), (int)20);
            }
            if (ev.mc.field_1724 != null) break block144;
            if (var2_4 || var2_4) ** GOTO lbl33
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        v6 /* !! */  = ev.dp;
        if (true) ** GOTO lbl59
        block102: while (true) {
            v6 /* !! */  = (long)(ev.bnbz("bndi", bncr(int ), (int)10) - ev.bnbz("bndh", bncr(int ), (int)9));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1309097994: {
                    break block102;
                }
                case -1222448933: {
                    continue block102;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bndj", bncr(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ev.bnbz("bndk", bnbw(int ), (int)21)) break;
            v7 /* !! */  = (long)ev.bnbz("bndl", bnbw(int ), (int)22);
        }
        if (this.recast.isValue()) ** GOTO lbl75
        if (var2_4 || var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl75:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl33
            v8 /* !! */  = ev.dp;
            if (true) ** GOTO lbl80
            block104: while (true) {
                v8 /* !! */  = (long)(v9 - ev.bnbz("bndm", bncr(int ), (int)12));
lbl80:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1462197884: {
                        v9 = ev.bnbz("bndn", bncr(int ), (int)13);
                        continue block104;
                    }
                    case -1309097994: {
                        break block104;
                    }
                    case -700022158: {
                        v9 = ev.bnbz("bndo", bncr(int ), (int)14);
                        continue block104;
                    }
                    case -162299936: {
                        v9 = ev.bnbz("bndp", bncr(int ), (int)15);
                        continue block104;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bndq", bncr(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == ev.bnbz("bndr", bnbw(int ), (int)23)) break;
                v10 /* !! */  = (long)ev.bnbz("bnds", bnbw(int ), (int)24);
            }
            v11 = ev.mc.field_1724;
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bndt", bncr(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ev.bnbz("bndu", bnbw(int ), (int)25)) break;
                v12 /* !! */  = (long)ev.bnbz("bndv", bnbw(int ), (int)26);
            }
            v13 /* !! */  = ev.dp;
            if (true) ** GOTO lbl107
            block107: while (true) {
                v13 /* !! */  = (long)(ev.bnbz("bndx", bncr(int ), (int)19) - ev.bnbz("bndw", bncr(int ), (int)18));
lbl107:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1309097994: {
                        break block107;
                    }
                    case 548634198: {
                        continue block107;
                    }
                }
                break;
            }
            v14 = v11.method_6118(class_1304.field_6174);
            v15 /* !! */  = ev.dp;
            if (true) ** GOTO lbl117
            block108: while (true) {
                v15 /* !! */  = (long)(v16 - ev.bnbz("bndy", bncr(int ), (int)20));
lbl117:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1309097994: {
                        break block108;
                    }
                    case 21705368: {
                        v16 = ev.bnbz("bndz", bncr(int ), (int)21);
                        continue block108;
                    }
                    case 2021836991: {
                        v16 = ev.bnbz("bnea", bncr(int ), (int)22);
                        continue block108;
                    }
                }
                break;
            }
            v17 = v14.method_7909();
            v18 /* !! */  = ev.dp;
            if (true) ** GOTO lbl131
            block109: while (true) {
                v18 /* !! */  = (long)(v19 - ev.bnbz("bneb", bncr(int ), (int)23));
lbl131:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1763365568: {
                        v19 = ev.bnbz("bnec", bncr(int ), (int)24);
                        continue block109;
                    }
                    case -1309097994: {
                        break block109;
                    }
                    case -970456960: {
                        v19 = ev.bnbz("bned", bncr(int ), (int)25);
                        continue block109;
                    }
                    case -421522428: {
                        v19 = ev.bnbz("bnee", bncr(int ), (int)26);
                        continue block109;
                    }
                }
                break;
            }
            if (v17 == class_1802.field_8833) ** GOTO lbl146
            if (var2_4 || var2_4) ** GOTO lbl33
            return;
lbl146:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl33
            v20 /* !! */  = ev.dp;
            if (true) ** GOTO lbl151
            block110: while (true) {
                v20 /* !! */  = (long)(v21 - ev.bnbz("bnef", bncr(int ), (int)27));
lbl151:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1309097994: {
                        break block110;
                    }
                    case -823791152: {
                        v21 = ev.bnbz("bneg", bncr(int ), (int)28);
                        continue block110;
                    }
                    case 1617664769: {
                        v21 = ev.bnbz("bneh", bncr(int ), (int)29);
                        continue block110;
                    }
                    case 1829161272: {
                        v21 = ev.bnbz("bnei", bncr(int ), (int)30);
                        continue block110;
                    }
                }
                break;
            }
            v22 /* !! */  = ev.dp;
            if (true) ** GOTO lbl167
            block111: while (true) {
                v22 /* !! */  = (long)(v23 - ev.bnbz("bnej", bncr(int ), (int)31));
lbl167:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1309097994: {
                        break block111;
                    }
                    case -642049820: {
                        v23 = ev.bnbz("bnek", bncr(int ), (int)32);
                        continue block111;
                    }
                    case -476137363: {
                        v23 = ev.bnbz("bnel", bncr(int ), (int)33);
                        continue block111;
                    }
                    case 2024255959: {
                        v23 = ev.bnbz("bnem", bncr(int ), (int)34);
                        continue block111;
                    }
                }
                break;
            }
            v24 = ev.mc.field_1724;
            v25 /* !! */  = ev.dp;
            if (true) ** GOTO lbl184
            block112: while (true) {
                v25 /* !! */  = (long)(v26 - ev.bnbz("bnen", bncr(int ), (int)35));
lbl184:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -1309097994: {
                        break block112;
                    }
                    case -609366779: {
                        v26 = ev.bnbz("bneo", bncr(int ), (int)36);
                        continue block112;
                    }
                    case 308707387: {
                        v26 = ev.bnbz("bnep", bncr(int ), (int)37);
                        continue block112;
                    }
                    case 1286597304: {
                        v26 = ev.bnbz("bneq", bncr(int ), (int)38);
                        continue block112;
                    }
                }
                break;
            }
            if (!v24.method_24828()) ** GOTO lbl209
            if (var2_4 || var2_4) ** GOTO lbl33
            v27 = ev.bnbz("bner", bnbw(int ), (int)27);
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_5 = ev.dp - ev.bnbz("bnes", bncr(int ), (int)39)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == ev.bnbz("bnet", bnbw(int ), (int)28)) break;
                v28 /* !! */  = (long)ev.bnbz("bneu", bnbw(int ), (int)29);
            }
            var1_1.setJumping((boolean)v27);
            if (var2_4) ** GOTO lbl33
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl251
lbl209:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl33
            v29 /* !! */  = ev.dp;
            if (true) ** GOTO lbl214
            block114: while (true) {
                v29 /* !! */  = (long)(v30 - ev.bnbz("bnev", bncr(int ), (int)40));
lbl214:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -1899626453: {
                        v30 = ev.bnbz("bnew", bncr(int ), (int)41);
                        continue block114;
                    }
                    case -1309097994: {
                        break block114;
                    }
                    case 176843950: {
                        v30 = ev.bnbz("bnex", bncr(int ), (int)42);
                        continue block114;
                    }
                }
                break;
            }
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_6 = ev.dp - ev.bnbz("bney", bncr(int ), (int)43)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == ev.bnbz("bnez", bnbw(int ), (int)30)) break;
                v31 /* !! */  = (long)ev.bnbz("bnfa", bnbw(int ), (int)31);
            }
            v32 = ev.mc.field_1724;
            while (true) {
                if ((v33 /* !! */  = (cfr_temp_7 = ev.dp - ev.bnbz("bnfb", bncr(int ), (int)44)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v33 /* !! */  == ev.bnbz("bnfc", bnbw(int ), (int)32)) break;
                v33 /* !! */  = (long)ev.bnbz("bnfd", bnbw(int ), (int)33);
            }
            if (v32.method_6128()) ** GOTO lbl251
            if (var2_4 || var2_4) ** GOTO lbl33
            v34 /* !! */  = ev.dp;
            if (true) ** GOTO lbl240
            block117: while (true) {
                v34 /* !! */  = (long)(v35 - ev.bnbz("bnfe", bncr(int ), (int)45));
lbl240:
                // 2 sources

                switch ((int)v34 /* !! */ ) {
                    case -1309097994: {
                        break block117;
                    }
                    case -483990931: {
                        v35 = ev.bnbz("bnff", bncr(int ), (int)46);
                        continue block117;
                    }
                    case 1679089258: {
                        v35 = ev.bnbz("bnfg", bncr(int ), (int)47);
                        continue block117;
                    }
                }
                break;
            }
            pn.startFallFlying();
            if (var2_4) ** GOTO lbl33
lbl251:
            // 3 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl254:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ev.bnbz("bnfh", bnbw(int ), (int)34);
                } while (!var4_2);
                throw null;
            }
lbl259:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfi", bnbw(int ), (int)35);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 2: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfj", bnbw(int ), (int)36);
                if (!var4_2) ** GOTO lbl259
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfk", bnbw(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl273:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfl", bnbw(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 5: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfm", bnbw(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 6: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfn", bnbw(int ), (int)40);
                if (!var4_2) ** GOTO lbl273
                throw null;
            }
lbl287:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfo", bnbw(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl292:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfp", bnbw(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 9: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfq", bnbw(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl302:
            // 4 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ev.bnbz("bnfr", bnbw(int ), (int)44);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl330
                    break;
                }
            }
lbl308:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfs", bnbw(int ), (int)45);
                if (!var4_2) ** GOTO lbl287
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)ev.bnbz("bnft", bnbw(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 13: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfu", bnbw(int ), (int)47);
                if (!var4_2) ** GOTO lbl273
                throw null;
            }
lbl321:
            // 2 sources

            case 14: {
                do {
                    var3_3 /* !! */  = (int)ev.bnbz("bnfv", bnbw(int ), (int)48);
                } while (!var4_2);
                throw null;
            }
lbl326:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfw", bnbw(int ), (int)49);
                if (!var4_2) ** GOTO lbl302
                throw null;
            }
lbl330:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfx", bnbw(int ), (int)50);
                if (!var4_2) break;
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfy", bnbw(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 18: {
                var3_3 /* !! */  = (int)ev.bnbz("bnfz", bnbw(int ), (int)52);
                if (!var4_2) ** GOTO lbl292
                throw null;
            }
lbl343:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)ev.bnbz("bnga", bnbw(int ), (int)53);
                if (!var4_2) ** GOTO lbl254
                throw null;
            }
lbl347:
            // 3 sources

            case 20: {
                var3_3 /* !! */  = (int)ev.bnbz("bngb", bnbw(int ), (int)54);
                if (!var4_2) ** GOTO lbl273
                throw null;
            }
lbl351:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)ev.bnbz("bngc", bnbw(int ), (int)55);
                if (!var4_2) ** GOTO lbl302
                throw null;
            }
lbl355:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ev.bnbz("bngd", bnbw(int ), (int)56);
                if (!var4_2) ** GOTO lbl321
                throw null;
            }
            case 23: {
                var3_3 /* !! */  = (int)ev.bnbz("bnge", bnbw(int ), (int)57);
                if (!var4_2) ** GOTO lbl347
                throw null;
            }
lbl363:
            // 3 sources

            case 24: {
                do {
                    var3_3 /* !! */  = (int)ev.bnbz("bngf", bnbw(int ), (int)58);
                } while (!var4_2);
                throw null;
            }
            case 25: {
                var3_3 /* !! */  = (int)ev.bnbz("bngg", bnbw(int ), (int)59);
                if (!var4_2) ** GOTO lbl343
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)ev.bnbz("bngh", bnbw(int ), (int)60);
                if (!var4_2) ** GOTO lbl308
                throw null;
            }
            case 27: 
        }
        var3_3 /* !! */  = (int)ev.bnbz("bngi", bnbw(int ), (int)61);
        ** while (!var4_2)
lbl379:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanupElytra() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bnqq", bncr(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ev.bnbz("bnqr", bnbw(int ), (int)281)) break;
            v0 /* !! */  = (long)ev.bnbz("bnqs", bnbw(int ), (int)282);
        }
        var3_1 = ev.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bnqt", bncr(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ev.bnbz("bnqu", bnbw(int ), (int)283)) break;
            v1 /* !! */  = (long)ev.bnbz("bnqv", bnbw(int ), (int)284);
        }
        var2_2 /* !! */  = ev.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bnqw", bncr(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ev.bnbz("bnqx", bnbw(int ), (int)285)) break;
            v2 /* !! */  = (long)ev.bnbz("bnqy", bnbw(int ), (int)286);
        }
        var1_3 = ev.a;
        if (var3_1) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v3 = ev.bnbz("bnqz", bnbw(int ), (int)287);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bnra", bncr(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ev.bnbz("bnrb", bnbw(int ), (int)288)) break;
            v4 /* !! */  = (long)ev.bnbz("bnrc", bnbw(int ), (int)289);
        }
        this.elytraTargetSlot = (int)v3;
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl38:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ev.bnbz("bnrd", bnbw(int ), (int)290);
                } while (!var3_1);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ev.bnbz("bnre", bnbw(int ), (int)291);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ev.bnbz("bnrf", bnbw(int ), (int)292);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ev.bnbz("bnrg", bnbw(int ), (int)293);
                } while (!var3_1);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ev.bnbz("bnrh", bnbw(int ), (int)294);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("bnri", bnbw(int ), (int)295);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bomb() {
        ev.bnbx[200] = 759764157;
        ev.bnbx[201] = 524817168;
        ev.bnbx[202] = -1471599717;
        ev.bnbx[203] = 286589298;
        ev.bnbx[204] = 1236117964;
        ev.bnbx[205] = -287492528;
        ev.bnbx[206] = 1369836362;
        ev.bnbx[207] = 1527206859;
        ev.bnbx[208] = -522209133;
        ev.bnbx[209] = -878816654;
        ev.bnbx[210] = 947547840;
        ev.bnbx[211] = -1056825842;
        ev.bnbx[212] = -2144927049;
        ev.bnbx[213] = 1177073510;
        ev.bnbx[214] = 1554855559;
        ev.bnbx[215] = -1205990394;
        ev.bnbx[216] = 2008918702;
        ev.bnbx[217] = 1382537340;
        ev.bnbx[218] = -797726604;
        ev.bnbx[219] = 1493843169;
        ev.bnbx[220] = 1356341300;
        ev.bnbx[221] = -143211550;
        ev.bnbx[222] = -1438200878;
        ev.bnbx[223] = -842005328;
        ev.bnbx[224] = 911836237;
        ev.bnbx[225] = -1577430247;
        ev.bnbx[226] = 1414043408;
        ev.bnbx[227] = 1377350547;
        ev.bnbx[228] = -425998091;
        ev.bnbx[229] = -1711014496;
        ev.bnbx[230] = 1914426169;
        ev.bnbx[231] = -720865941;
        ev.bnbx[232] = 761467394;
        ev.bnbx[233] = 169380532;
        ev.bnbx[234] = 1761335835;
        ev.bnbx[235] = -1050763453;
        ev.bnbx[236] = 1082661412;
        ev.bnbx[237] = 1727336345;
        ev.bnbx[238] = -1559260389;
        ev.bnbx[239] = -1698890115;
        ev.bnbx[240] = -1872912551;
        ev.bnbx[241] = 1113584591;
        ev.bnbx[242] = -1329245936;
        ev.bnbx[243] = 855440170;
        ev.bnbx[244] = -628024161;
        ev.bnbx[245] = -33887944;
        ev.bnbx[246] = 398162038;
        ev.bnbx[247] = -2121095376;
        ev.bnbx[248] = 1132942106;
        ev.bnbx[249] = -119139671;
        ev.bnbx[250] = -1198256902;
        ev.bnbx[251] = 1047201420;
        ev.bnbx[252] = 1530488907;
        ev.bnbx[253] = 1207112123;
        ev.bnbx[254] = 765278053;
        ev.bnbx[255] = 689189833;
        ev.bnbx[256] = 1265603116;
        ev.bnbx[257] = 2077884716;
        ev.bnbx[258] = 1744757453;
        ev.bnbx[259] = 1064217730;
        ev.bnbx[260] = 1342319398;
        ev.bnbx[261] = 1878852572;
        ev.bnbx[262] = 1702617288;
        ev.bnbx[263] = 1002604675;
        ev.bnbx[264] = 894716060;
        ev.bnbx[265] = 932721023;
        ev.bnbx[266] = -612495395;
        ev.bnbx[267] = 2010425686;
        ev.bnbx[268] = 575525026;
        ev.bnbx[269] = -848933093;
        ev.bnbx[270] = -1176700714;
        ev.bnbx[271] = -1057420777;
        ev.bnbx[272] = 1070475158;
        ev.bnbx[273] = 1720658772;
        ev.bnbx[274] = 967771416;
        ev.bnbx[275] = -1169807628;
        ev.bnbx[276] = 1382075594;
        ev.bnbx[277] = 2091850000;
        ev.bnbx[278] = -512187182;
        ev.bnbx[279] = 1446752788;
        ev.bnbx[280] = 1789651441;
        ev.bnbx[281] = 532255334;
        ev.bnbx[282] = -1998760148;
        ev.bnbx[283] = 1465782773;
        ev.bnbx[284] = -1399236255;
        ev.bnbx[285] = 153339073;
        ev.bnbx[286] = 1353952573;
        ev.bnbx[287] = -1156005058;
        ev.bnbx[288] = -1105818609;
        ev.bnbx[289] = -636054050;
        ev.bnbx[290] = 197795819;
        ev.bnbx[291] = -665988349;
        ev.bnbx[292] = -2021988339;
        ev.bnbx[293] = 980365285;
        ev.bnbx[294] = -2033908264;
        ev.bnbx[295] = 1920714652;
        ev.bnbx[296] = -1522147409;
        ev.bnbx[297] = 1542702960;
        ev.bnbx[298] = 476500568;
        ev.bnbx[299] = 604452787;
    }

    private static /* synthetic */ void bomj() {
        ev.bnby[300] = 1412126802;
        ev.bnby[301] = 1497914341;
        ev.bnby[302] = -714864793;
        ev.bnby[303] = 125966329;
        ev.bnby[304] = 1106968256;
        ev.bnby[305] = -2039798477;
        ev.bnby[306] = 242730235;
        ev.bnby[307] = -941617583;
        ev.bnby[308] = -1627573499;
        ev.bnby[309] = -1508717139;
        ev.bnby[310] = -29920960;
        ev.bnby[311] = -1767126414;
        ev.bnby[312] = 1205358233;
        ev.bnby[313] = -1635670169;
        ev.bnby[314] = 1985602940;
        ev.bnby[315] = -1505940183;
        ev.bnby[316] = 1828825281;
        ev.bnby[317] = 314991301;
        ev.bnby[318] = -255974644;
        ev.bnby[319] = 333837077;
        ev.bnby[320] = -552600268;
        ev.bnby[321] = -1053222322;
        ev.bnby[322] = -491137877;
        ev.bnby[323] = 187815581;
        ev.bnby[324] = -1803871999;
        ev.bnby[325] = -979580987;
        ev.bnby[326] = 989339636;
        ev.bnby[327] = 733109539;
        ev.bnby[328] = 1605300655;
        ev.bnby[329] = -751143302;
        ev.bnby[330] = -877294811;
        ev.bnby[331] = 1570620281;
        ev.bnby[332] = -770274651;
        ev.bnby[333] = -624113955;
        ev.bnby[334] = 749599525;
        ev.bnby[335] = -2105720427;
        ev.bnby[336] = 51065398;
        ev.bnby[337] = -1937802801;
        ev.bnby[338] = -416058536;
        ev.bnby[339] = -107400545;
        ev.bnby[340] = -1613326099;
        ev.bnby[341] = 47734859;
        ev.bnby[342] = 335060196;
        ev.bnby[343] = 981756608;
        ev.bnby[344] = 91700742;
        ev.bnby[345] = -227065708;
        ev.bnby[346] = -1344568443;
        ev.bnby[347] = 391719224;
        ev.bnby[348] = 1174950836;
        ev.bnby[349] = -1037338333;
        ev.bnby[350] = -1395337309;
        ev.bnby[351] = 2002080996;
        ev.bnby[352] = -114326877;
        ev.bnby[353] = -1550235754;
        ev.bnby[354] = -1485798032;
        ev.bnby[355] = -430894726;
        ev.bnby[356] = 1995148808;
        ev.bnby[357] = -1167299820;
        ev.bnby[358] = 230302163;
        ev.bnby[359] = -1788951069;
        ev.bnby[360] = -1090261712;
        ev.bnby[361] = -562304970;
        ev.bnby[362] = 321768186;
        ev.bnby[363] = 1574298098;
        ev.bnby[364] = -682951228;
        ev.bnby[365] = -8232154;
        ev.bnby[366] = -167376904;
        ev.bnby[367] = 1828249189;
        ev.bnby[368] = 1731098685;
        ev.bnby[369] = -9288646;
        ev.bnby[370] = -908475954;
        ev.bnby[371] = 1875597878;
        ev.bnby[372] = -1582603094;
        ev.bnby[373] = 434964326;
        ev.bnby[374] = -2079975505;
        ev.bnby[375] = -1650749711;
        ev.bnby[376] = -2093405457;
        ev.bnby[377] = -728212770;
        ev.bnby[378] = -1996491425;
        ev.bnby[379] = -1835251389;
        ev.bnby[380] = 113244857;
        ev.bnby[381] = 355893919;
        ev.bnby[382] = -847505408;
        ev.bnby[383] = -1140810904;
        ev.bnby[384] = 1855890084;
        ev.bnby[385] = -1118839003;
        ev.bnby[386] = 1614365996;
        ev.bnby[387] = 1812085217;
        ev.bnby[388] = -1730827207;
        ev.bnby[389] = 490044139;
        ev.bnby[390] = 704674010;
        ev.bnby[391] = 827058061;
        ev.bnby[392] = 2034881952;
        ev.bnby[393] = 979599600;
        ev.bnby[394] = -856045810;
        ev.bnby[395] = -384170505;
        ev.bnby[396] = -852451011;
        ev.bnby[397] = 371863665;
        ev.bnby[398] = -542640026;
        ev.bnby[399] = -448610629;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oc createSwapSettings() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bnww", bncr(int ), (int)140)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ev.bnbz("bnwx", bnbw(int ), (int)395)) break;
            v0 /* !! */  = (long)ev.bnbz("bnwy", bnbw(int ), (int)396);
        }
        var3_1 = ev.c;
        v1 /* !! */  = ev.dp;
        if (true) ** GOTO lbl11
        block66: while (true) {
            v1 /* !! */  = (long)(ev.bnbz("bnxa", bncr(int ), (int)142) - ev.bnbz("bnwz", bncr(int ), (int)141));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1695792852: {
                    continue block66;
                }
                case -1309097994: {
                    break block66;
                }
            }
            break;
        }
        var2_2 /* !! */  = ev.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ev.dp;
                if (true) ** GOTO lbl24
                block67: while (true) {
                    v2 /* !! */  = (long)(ev.bnbz("bnxc", bncr(int ), (int)144) - ev.bnbz("bnxb", bncr(int ), (int)143));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1309097994: {
                            break block67;
                        }
                        case 1177510979: {
                            continue block67;
                        }
                    }
                    break;
                }
                var1_3 = ev.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v3 /* !! */  = ev.dp;
                if (true) ** GOTO lbl39
                block69: while (true) {
                    v3 /* !! */  = (long)(ev.bnbz("bnxe", bncr(int ), (int)146) - ev.bnbz("bnxd", bncr(int ), (int)145));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1309097994: {
                            break block69;
                        }
                        case 1232890672: {
                            continue block69;
                        }
                    }
                    break;
                }
                v4 /* !! */  = ev.dp;
                if (true) ** GOTO lbl48
                block70: while (true) {
                    v4 /* !! */  = (long)(v5 - ev.bnbz("bnxf", bncr(int ), (int)147));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1309097994: {
                            break block70;
                        }
                        case 268569433: {
                            v5 = ev.bnbz("bnxg", bncr(int ), (int)148);
                            continue block70;
                        }
                        case 1504723043: {
                            v5 = ev.bnbz("bnxh", bncr(int ), (int)149);
                            continue block70;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("ReallyWorld")) ** GOTO lbl160
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bnxi", bncr(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ev.bnbz("bnxj", bnbw(int ), (int)397)) break;
                    v6 /* !! */  = (long)ev.bnbz("bnxk", bnbw(int ), (int)398);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bnxl", bncr(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ev.bnbz("bnxm", bnbw(int ), (int)399)) break;
                    v7 /* !! */  = (long)ev.bnbz("bnxn", bnbw(int ), (int)400);
                }
                v8 = new oc();
                v9 = ev.bnbz("bnxo", bnbw(int ), (int)401);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bnxp", bncr(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ev.bnbz("bnxq", bnbw(int ), (int)402)) break;
                    v10 /* !! */  = (long)ev.bnbz("bnxr", bnbw(int ), (int)403);
                }
                v11 = v8.stopMovement((boolean)v9);
                v12 = ev.bnbz("bnxs", bnbw(int ), (int)404);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bnxt", bncr(int ), (int)153)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ev.bnbz("bnxu", bnbw(int ), (int)405)) break;
                    v13 /* !! */  = (long)ev.bnbz("bnxv", bnbw(int ), (int)406);
                }
                v14 = v11.stopSprint((boolean)v12);
                v15 = ev.bnbz("bnxw", bnbw(int ), (int)407);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ev.dp - ev.bnbz("bnxx", bncr(int ), (int)154)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ev.bnbz("bnxy", bnbw(int ), (int)408)) break;
                    v16 /* !! */  = (long)ev.bnbz("bnxz", bnbw(int ), (int)409);
                }
                v17 = v14.closeInventory((boolean)v15);
                v18 = ev.bnbz("bnya", bnbw(int ), (int)410);
                v19 = ev.bnbz("bnyb", bnbw(int ), (int)411);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = ev.dp - ev.bnbz("bnyc", bncr(int ), (int)155)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ev.bnbz("bnyd", bnbw(int ), (int)412)) break;
                    v20 /* !! */  = (long)ev.bnbz("bnye", bnbw(int ), (int)413);
                }
                v21 = v17.preStopDelay((int)v18, (int)v19);
                v22 = ev.bnbz("bnyf", bnbw(int ), (int)414);
                v23 = ev.bnbz("bnyg", bnbw(int ), (int)415);
                v24 /* !! */  = ev.dp;
                if (true) ** GOTO lbl105
                block77: while (true) {
                    v24 /* !! */  = (long)(v25 - ev.bnbz("bnyh", bncr(int ), (int)156));
lbl105:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1309097994: {
                            break block77;
                        }
                        case -1020605405: {
                            v25 = ev.bnbz("bnyi", bncr(int ), (int)157);
                            continue block77;
                        }
                        case -841737592: {
                            v25 = ev.bnbz("bnyj", bncr(int ), (int)158);
                            continue block77;
                        }
                        case -171919020: {
                            v25 = ev.bnbz("bnyk", bncr(int ), (int)159);
                            continue block77;
                        }
                    }
                    break;
                }
                v26 = v21.waitStopDelay((int)v22, (int)v23);
                v27 = ev.bnbz("bnyl", bnbw(int ), (int)416);
                v28 /* !! */  = ev.dp;
                if (true) ** GOTO lbl123
                block78: while (true) {
                    v28 /* !! */  = (long)(v29 - ev.bnbz("bnym", bncr(int ), (int)160));
lbl123:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1322670317: {
                            v29 = ev.bnbz("bnyn", bncr(int ), (int)161);
                            continue block78;
                        }
                        case -1309097994: {
                            break block78;
                        }
                        case 293804213: {
                            v29 = ev.bnbz("bnyo", bncr(int ), (int)162);
                            continue block78;
                        }
                        case 1865916489: {
                            v29 = ev.bnbz("bnyp", bncr(int ), (int)163);
                            continue block78;
                        }
                    }
                    break;
                }
                v30 = v26.minimumStopDelay((int)v27);
                v31 = ev.bnbz("bnyq", bnbw(int ), (int)417);
                v32 = ev.bnbz("bnyr", bnbw(int ), (int)418);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_7 = ev.dp - ev.bnbz("bnys", bncr(int ), (int)164)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ev.bnbz("bnyt", bnbw(int ), (int)419)) break;
                    v33 /* !! */  = (long)ev.bnbz("bnyu", bnbw(int ), (int)420);
                }
                v34 = v30.preSwapDelay((int)v31, (int)v32);
                v35 = ev.bnbz("bnyv", bnbw(int ), (int)421);
                v36 = ev.bnbz("bnyw", bnbw(int ), (int)422);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_8 = ev.dp - ev.bnbz("bnyx", bncr(int ), (int)165)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ev.bnbz("bnyy", bnbw(int ), (int)423)) break;
                    v37 /* !! */  = (long)ev.bnbz("bnyz", bnbw(int ), (int)424);
                }
                v38 = v34.postSwapDelay((int)v35, (int)v36);
                v39 = ev.bnbz("bnza", bnbw(int ), (int)425);
                v40 = ev.bnbz("bnzb", bnbw(int ), (int)426);
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_9 = ev.dp - ev.bnbz("bnzc", bncr(int ), (int)166)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == ev.bnbz("bnzd", bnbw(int ), (int)427)) break;
                    v41 /* !! */  = (long)ev.bnbz("bnze", bnbw(int ), (int)428);
                }
                return v38.resumeDelay((int)v39, (int)v40);
lbl160:
                // 1 sources

                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_10 = ev.dp - ev.bnbz("bnzf", bncr(int ), (int)167)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == ev.bnbz("bnzg", bnbw(int ), (int)429)) break;
                    v42 /* !! */  = (long)ev.bnbz("bnzh", bnbw(int ), (int)430);
                }
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_11 = ev.dp - ev.bnbz("bnzi", bncr(int ), (int)168)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ev.bnbz("bnzj", bnbw(int ), (int)431)) break;
                    v43 /* !! */  = (long)ev.bnbz("bnzk", bnbw(int ), (int)432);
                }
                v44 = new oc();
                v45 = ev.bnbz("bnzl", bnbw(int ), (int)433);
                v46 /* !! */  = ev.dp;
                if (true) ** GOTO lbl177
                block84: while (true) {
                    v46 /* !! */  = (long)(v47 - ev.bnbz("bnzm", bncr(int ), (int)169));
lbl177:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -1978282946: {
                            v47 = ev.bnbz("bnzn", bncr(int ), (int)170);
                            continue block84;
                        }
                        case -1309097994: {
                            break block84;
                        }
                        case 1724042943: {
                            v47 = ev.bnbz("bnzo", bncr(int ), (int)171);
                            continue block84;
                        }
                        case 1838648060: {
                            v47 = ev.bnbz("bnzp", bncr(int ), (int)172);
                            continue block84;
                        }
                    }
                    break;
                }
                v48 = v44.stopMovement((boolean)v45);
                v49 = ev.bnbz("bnzq", bnbw(int ), (int)434);
                v50 /* !! */  = ev.dp;
                if (true) ** GOTO lbl195
                block85: while (true) {
                    v50 /* !! */  = (long)(v51 - ev.bnbz("bnzr", bncr(int ), (int)173));
lbl195:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -1943568285: {
                            v51 = ev.bnbz("bnzs", bncr(int ), (int)174);
                            continue block85;
                        }
                        case -1309097994: {
                            break block85;
                        }
                        case 385578922: {
                            v51 = ev.bnbz("bnzt", bncr(int ), (int)175);
                            continue block85;
                        }
                    }
                    break;
                }
                v52 = v48.stopSprint((boolean)v49);
                v53 = ev.bnbz("bnzu", bnbw(int ), (int)435);
                v54 /* !! */  = ev.dp;
                if (true) ** GOTO lbl210
                block86: while (true) {
                    v54 /* !! */  = (long)(ev.bnbz("bnzw", bncr(int ), (int)177) - ev.bnbz("bnzv", bncr(int ), (int)176));
lbl210:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1309097994: {
                            break block86;
                        }
                        case 145811395: {
                            continue block86;
                        }
                    }
                    break;
                }
                v55 = v52.closeInventory((boolean)v53);
                v56 = ev.bnbz("bnzx", bnbw(int ), (int)436);
                v57 = ev.bnbz("bnzy", bnbw(int ), (int)437);
                while (true) {
                    if ((v58 /* !! */  = (cfr_temp_12 = ev.dp - ev.bnbz("bnzz", bncr(int ), (int)178)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v58 /* !! */  == ev.bnbz("boaa", bnbw(int ), (int)438)) break;
                    v58 /* !! */  = (long)ev.bnbz("boab", bnbw(int ), (int)439);
                }
                v59 = v55.preStopDelay((int)v56, (int)v57);
                v60 = ev.bnbz("boac", bnbw(int ), (int)440);
                v61 = ev.bnbz("boad", bnbw(int ), (int)441);
                while (true) {
                    if ((v62 /* !! */  = (cfr_temp_13 = ev.dp - ev.bnbz("boae", bncr(int ), (int)179)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v62 /* !! */  == ev.bnbz("boaf", bnbw(int ), (int)442)) break;
                    v62 /* !! */  = (long)ev.bnbz("boag", bnbw(int ), (int)443);
                }
                v63 = v59.waitStopDelay((int)v60, (int)v61);
                v64 = ev.bnbz("boah", bnbw(int ), (int)444);
                v65 /* !! */  = ev.dp;
                if (true) ** GOTO lbl237
                block89: while (true) {
                    v65 /* !! */  = (long)(ev.bnbz("boaj", bncr(int ), (int)181) - ev.bnbz("boai", bncr(int ), (int)180));
lbl237:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -1309097994: {
                            break block89;
                        }
                        case -1037209800: {
                            continue block89;
                        }
                    }
                    break;
                }
                v66 = v63.minimumStopDelay((int)v64);
                v67 = ev.bnbz("boak", bnbw(int ), (int)445);
                v68 = ev.bnbz("boal", bnbw(int ), (int)446);
                while (true) {
                    if ((v69 /* !! */  = (cfr_temp_14 = ev.dp - ev.bnbz("boam", bncr(int ), (int)182)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v69 /* !! */  == ev.bnbz("boan", bnbw(int ), (int)447)) break;
                    v69 /* !! */  = (long)ev.bnbz("boao", bnbw(int ), (int)448);
                }
                v70 = v66.preSwapDelay((int)v67, (int)v68);
                v71 = ev.bnbz("boap", bnbw(int ), (int)449);
                v72 = ev.bnbz("boaq", bnbw(int ), (int)450);
                while (true) {
                    if ((v73 /* !! */  = (cfr_temp_15 = ev.dp - ev.bnbz("boar", bncr(int ), (int)183)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v73 /* !! */  == ev.bnbz("boas", bnbw(int ), (int)451)) break;
                    v73 /* !! */  = (long)ev.bnbz("boat", bnbw(int ), (int)452);
                }
                v74 = v70.postSwapDelay((int)v71, (int)v72);
                v75 = ev.bnbz("boau", bnbw(int ), (int)453);
                v76 = ev.bnbz("boav", bnbw(int ), (int)454);
                while (true) {
                    if ((v77 /* !! */  = (cfr_temp_16 = ev.dp - ev.bnbz("boaw", bncr(int ), (int)184)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v77 /* !! */  == ev.bnbz("boax", bnbw(int ), (int)455)) break;
                    v77 /* !! */  = (long)ev.bnbz("boay", bnbw(int ), (int)456);
                }
                v78 = v74.resumeDelay((int)v75, (int)v76);
                v79 = ev.bnbz("boba", boaz(int ), (int)185);
                v80 /* !! */  = ev.dp;
                if (true) ** GOTO lbl272
                block93: while (true) {
                    v80 /* !! */  = (long)(v81 - ev.bnbz("bobb", bncr(int ), (int)186));
lbl272:
                    // 2 sources

                    switch ((int)v80 /* !! */ ) {
                        case -1309097994: {
                            break block93;
                        }
                        case -1208693679: {
                            v81 = ev.bnbz("bobc", bncr(int ), (int)187);
                            continue block93;
                        }
                        case -1135701291: {
                            v81 = ev.bnbz("bobd", bncr(int ), (int)188);
                            continue block93;
                        }
                        case 780660345: {
                            v81 = ev.bnbz("bobe", bncr(int ), (int)189);
                            continue block93;
                        }
                    }
                    break;
                }
                return v78.velocityThreshold((double)v79);
            }
            case 0: {
                var2_2 /* !! */  = (int)ev.bnbz("bobf", bnbw(int ), (int)457);
                if (!var3_1) break;
                throw null;
            }
lbl289:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ev.bnbz("bobg", bnbw(int ), (int)458);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl294:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ev.bnbz("bobh", bnbw(int ), (int)459);
                if (!var3_1) break;
                throw null;
            }
lbl298:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ev.bnbz("bobi", bnbw(int ), (int)460);
                if (!var3_1) ** GOTO lbl289
                throw null;
            }
lbl302:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ev.bnbz("bobj", bnbw(int ), (int)461);
                if (!var3_1) ** GOTO lbl298
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ev.bnbz("bobk", bnbw(int ), (int)462);
                if (!var3_1) ** GOTO lbl302
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ev.bnbz("bobl", bnbw(int ), (int)463);
                if (!var3_1) ** GOTO lbl302
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ev.bnbz("bobm", bnbw(int ), (int)464);
                if (!var3_1) ** GOTO lbl294
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("bobn", bnbw(int ), (int)465);
        ** while (!var3_1)
lbl321:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bnbz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int bnbw(int n2) {
        return bnbx[n2] ^ bnby[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeElytraSwapInstant() {
        block73: {
            block71: {
                block72: {
                    var6_1 = ev.c;
                    var5_2 /* !! */  = ev.b;
                    var4_3 = ev.a;
                    if (var6_1) {
                        throw null;
lbl6:
                        // 17 sources

                        return;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    var1_4 = ev.mc.field_1724.method_6118(class_1304.field_6174).method_7909();
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (var1_4 != class_1802.field_8833) break block71;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    var3_5 = this.findChestplate();
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (var3_5.found()) break block72;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_7 = var3_5.slot();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl40
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            var3_6 = this.findItem(class_1802.field_8833);
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var3_6.found()) break block73;
            if (var4_3 || var4_3) ** GOTO lbl6
            return;
        }
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                var2_7 = var3_6.slot();
                if (var4_3) ** GOTO lbl6
lbl40:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                nv.swapHotbar(var2_7, (int)ev.bnbz("bnkl", bnbw(int ), (int)141));
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.click((int)ev.bnbz("bnkm", bnbw(int ), (int)142), (int)ev.bnbz("bnkn", bnbw(int ), (int)143), class_1713.field_7791);
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.swapHotbar(var2_7, (int)ev.bnbz("bnko", bnbw(int ), (int)144));
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkp", bnbw(int ), (int)145);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl54:
            // 3 sources

            case 1: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkq", bnbw(int ), (int)146);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl59:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkr", bnbw(int ), (int)147);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl64:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)ev.bnbz("bnks", bnbw(int ), (int)148);
                if (!var6_1) ** GOTO lbl54
                throw null;
            }
lbl68:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkt", bnbw(int ), (int)149);
                if (var6_1) {
                    throw null;
                }
            }
            case 5: {
                var5_2 /* !! */  = (int)ev.bnbz("bnku", bnbw(int ), (int)150);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 6: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkv", bnbw(int ), (int)151);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl82:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkw", bnbw(int ), (int)152);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl87:
            // 3 sources

            case 8: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkx", bnbw(int ), (int)153);
                if (!var6_1) ** GOTO lbl82
                throw null;
            }
lbl91:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)ev.bnbz("bnky", bnbw(int ), (int)154);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl96:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)ev.bnbz("bnkz", bnbw(int ), (int)155);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl101:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)ev.bnbz("bnla", bnbw(int ), (int)156);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 12: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlb", bnbw(int ), (int)157);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 13: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlc", bnbw(int ), (int)158);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 14: {
                var5_2 /* !! */  = (int)ev.bnbz("bnld", bnbw(int ), (int)159);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 15: {
                var5_2 /* !! */  = (int)ev.bnbz("bnle", bnbw(int ), (int)160);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 16: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlf", bnbw(int ), (int)161);
                if (!var6_1) ** GOTO lbl82
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlg", bnbw(int ), (int)162);
                if (!var6_1) ** GOTO lbl59
                throw null;
            }
lbl134:
            // 4 sources

            case 18: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlh", bnbw(int ), (int)163);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 19: {
                var5_2 /* !! */  = (int)ev.bnbz("bnli", bnbw(int ), (int)164);
                if (!var6_1) ** GOTO lbl54
                throw null;
            }
lbl143:
            // 5 sources

            case 20: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlj", bnbw(int ), (int)165);
                if (!var6_1) ** GOTO lbl64
                throw null;
            }
lbl147:
            // 3 sources

            case 21: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlk", bnbw(int ), (int)166);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl152:
            // 3 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ev.bnbz("bnll", bnbw(int ), (int)167);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                    break;
                }
            }
lbl158:
            // 5 sources

            case 23: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlm", bnbw(int ), (int)168);
                if (!var6_1) ** GOTO lbl68
                throw null;
            }
            case 24: {
                var5_2 /* !! */  = (int)ev.bnbz("bnln", bnbw(int ), (int)169);
                if (!var6_1) ** GOTO lbl96
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlo", bnbw(int ), (int)170);
                if (!var6_1) ** GOTO lbl158
                throw null;
            }
            case 26: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlp", bnbw(int ), (int)171);
                if (!var6_1) ** GOTO lbl134
                throw null;
            }
            case 27: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlq", bnbw(int ), (int)172);
                if (!var6_1) ** GOTO lbl143
                throw null;
            }
lbl178:
            // 2 sources

            case 28: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlr", bnbw(int ), (int)173);
                if (!var6_1) ** GOTO lbl147
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)ev.bnbz("bnls", bnbw(int ), (int)174);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl187:
            // 2 sources

            case 30: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlt", bnbw(int ), (int)175);
                if (!var6_1) ** GOTO lbl147
                throw null;
            }
lbl191:
            // 2 sources

            case 31: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlu", bnbw(int ), (int)176);
                if (!var6_1) ** GOTO lbl134
                throw null;
            }
lbl195:
            // 3 sources

            case 32: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlv", bnbw(int ), (int)177);
                if (!var6_1) ** GOTO lbl91
                throw null;
            }
            case 33: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlw", bnbw(int ), (int)178);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
            case 34: 
        }
        var5_2 /* !! */  = (int)ev.bnbz("bnlx", bnbw(int ), (int)179);
        ** while (!var6_1)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeFireworkInstant() {
        block76: {
            block75: {
                block74: {
                    var6_1 = ev.c;
                    var5_2 /* !! */  = ev.b;
                    var4_3 = ev.a;
                    if (var6_1) {
                        throw null;
lbl6:
                        // 18 sources

                        return;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (ev.mc.field_1724.method_6128()) break block74;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = this.findItemHotbar(class_1802.field_8639);
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var1_4.found()) break block75;
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = var1_4.slot();
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.selectSlotSilent(var2_5);
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.sendUsePacket(class_1268.field_5808);
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.selectSlotSilent(ev.mc.field_1724.method_31548().method_67532());
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl49
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_6 = this.findItem(class_1802.field_8639);
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var2_6.found()) break block76;
            if (var4_3 || var4_3) ** GOTO lbl6
            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var3_7 = ev.mc.field_1724.method_31548().method_67532();
        if (var4_3 || var4_3) ** GOTO lbl6
        nv.swapHotbar(var2_6.slot(), var3_7);
        if (var4_3 || var4_3) ** GOTO lbl6
        nv.sendUsePacket(class_1268.field_5808);
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3 || var4_3) ** GOTO lbl6
                nv.swapHotbar(var2_6.slot(), var3_7);
                if (var4_3) ** GOTO lbl6
lbl49:
                // 2 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
lbl52:
            // 4 sources

            case 0: {
                var5_2 /* !! */  = (int)ev.bnbz("bnly", bnbw(int ), (int)180);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl57:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)ev.bnbz("bnlz", bnbw(int ), (int)181);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl62:
            // 3 sources

            case 2: {
                var5_2 /* !! */  = (int)ev.bnbz("bnma", bnbw(int ), (int)182);
                if (!var6_1) ** GOTO lbl57
                throw null;
            }
lbl66:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmb", bnbw(int ), (int)183);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl71:
            // 4 sources

            case 4: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmc", bnbw(int ), (int)184);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl76:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmd", bnbw(int ), (int)185);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 6: {
                var5_2 /* !! */  = (int)ev.bnbz("bnme", bnbw(int ), (int)186);
                if (!var6_1) ** GOTO lbl52
                throw null;
            }
lbl85:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmf", bnbw(int ), (int)187);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 8: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmg", bnbw(int ), (int)188);
                if (!var6_1) ** GOTO lbl66
                throw null;
            }
lbl94:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmh", bnbw(int ), (int)189);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl99:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmi", bnbw(int ), (int)190);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 11: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmj", bnbw(int ), (int)191);
                if (!var6_1) ** GOTO lbl71
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ev.bnbz("bnmk", bnbw(int ), (int)192);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                    break;
                }
            }
            case 13: {
                var5_2 /* !! */  = (int)ev.bnbz("bnml", bnbw(int ), (int)193);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl119:
            // 3 sources

            case 14: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmm", bnbw(int ), (int)194);
                if (!var6_1) ** GOTO lbl52
                throw null;
            }
lbl123:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmn", bnbw(int ), (int)195);
                if (!var6_1) ** GOTO lbl62
                throw null;
            }
            case 16: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmo", bnbw(int ), (int)196);
                if (!var6_1) ** GOTO lbl85
                throw null;
            }
lbl131:
            // 2 sources

            case 17: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmp", bnbw(int ), (int)197);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl136:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmq", bnbw(int ), (int)198);
                if (!var6_1) ** GOTO lbl94
                throw null;
            }
lbl140:
            // 4 sources

            case 19: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmr", bnbw(int ), (int)199);
                if (!var6_1) ** GOTO lbl119
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)ev.bnbz("bnms", bnbw(int ), (int)200);
                if (!var6_1) ** GOTO lbl62
                throw null;
            }
            case 21: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmt", bnbw(int ), (int)201);
                if (!var6_1) ** GOTO lbl71
                throw null;
            }
lbl152:
            // 3 sources

            case 22: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmu", bnbw(int ), (int)202);
                if (!var6_1) ** GOTO lbl71
                throw null;
            }
lbl156:
            // 4 sources

            case 23: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmv", bnbw(int ), (int)203);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 24: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmw", bnbw(int ), (int)204);
                if (!var6_1) ** GOTO lbl156
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmx", bnbw(int ), (int)205);
                if (!var6_1) ** GOTO lbl156
                throw null;
            }
lbl169:
            // 2 sources

            case 26: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmy", bnbw(int ), (int)206);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 27: {
                var5_2 /* !! */  = (int)ev.bnbz("bnmz", bnbw(int ), (int)207);
                if (!var6_1) ** GOTO lbl119
                throw null;
            }
lbl178:
            // 4 sources

            case 28: {
                var5_2 /* !! */  = (int)ev.bnbz("bnna", bnbw(int ), (int)208);
                if (!var6_1) ** GOTO lbl99
                throw null;
            }
lbl182:
            // 2 sources

            case 29: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnb", bnbw(int ), (int)209);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 30: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnc", bnbw(int ), (int)210);
                if (!var6_1) ** GOTO lbl123
                throw null;
            }
            case 31: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnd", bnbw(int ), (int)211);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl196:
            // 3 sources

            case 32: {
                var5_2 /* !! */  = (int)ev.bnbz("bnne", bnbw(int ), (int)212);
                if (!var6_1) ** GOTO lbl85
                throw null;
            }
lbl200:
            // 2 sources

            case 33: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnf", bnbw(int ), (int)213);
                if (!var6_1) ** GOTO lbl52
                throw null;
            }
lbl204:
            // 2 sources

            case 34: {
                var5_2 /* !! */  = (int)ev.bnbz("bnng", bnbw(int ), (int)214);
                if (!var6_1) ** GOTO lbl152
                throw null;
            }
            case 35: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnh", bnbw(int ), (int)215);
                if (!var6_1) ** GOTO lbl76
                throw null;
            }
lbl212:
            // 2 sources

            case 36: {
                var5_2 /* !! */  = (int)ev.bnbz("bnni", bnbw(int ), (int)216);
                if (!var6_1) ** GOTO lbl156
                throw null;
            }
            case 37: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnj", bnbw(int ), (int)217);
                if (!var6_1) ** GOTO lbl169
                throw null;
            }
            case 38: 
        }
        var5_2 /* !! */  = (int)ev.bnbz("bnnk", bnbw(int ), (int)218);
        ** while (!var6_1)
lbl223:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @aw
    public void onWorldRender(dj dj2) {
        boolean bl2;
        block42: {
            Object object = dp;
            block17: while (true) {
                switch ((int)object) {
                    case -1309097994: {
                        break block17;
                    }
                    case 201052245: {
                        object = ev.bnbz("bnjf", bncr(int ), (int)59) - ev.bnbz("bnje", bncr(int ), (int)58);
                        continue block17;
                    }
                }
                break;
            }
            boolean bl3 = c;
            Object object2 = dp;
            boolean bl4 = true;
            block18: while (true) {
                CallSite callSite;
                if (!bl4 || (bl4 = false) || !true) {
                    object2 = callSite - ev.bnbz("bnjg", bncr(int ), (int)60);
                }
                switch ((int)object2) {
                    case -1309097994: {
                        break block18;
                    }
                    case -792688266: {
                        callSite = ev.bnbz("bnjh", bncr(int ), (int)61);
                        continue block18;
                    }
                    case 997062398: {
                        callSite = ev.bnbz("bnji", bncr(int ), (int)62);
                        continue block18;
                    }
                }
                break;
            }
            int n2 = b;
            while (true) {
                long l2;
                Object object3;
                if ((object3 = (l2 = dp - ev.bnbz("bnjj", bncr(int ), (int)63)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object3 == ev.bnbz("bnjk", bnbw(int ), (int)121)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object3 = ev.bnbz("bnjl", bnbw(int ), (int)122);
            }
            if (bl2 || bl2) return;
            Object object4 = dp;
            block20: while (true) {
                switch ((int)object4) {
                    case -1309097994: {
                        break block20;
                    }
                    case -227578510: {
                        object4 = ev.bnbz("bnjn", bncr(int ), (int)65) - ev.bnbz("bnjm", bncr(int ), (int)64);
                        continue block20;
                    }
                }
                break;
            }
            while (true) {
                long l3;
                Object object5;
                if ((object5 = (l3 = dp - ev.bnbz("bnjo", bncr(int ), (int)66)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object5 == ev.bnbz("bnjp", bnbw(int ), (int)123)) {
                    if (this.mode.isSelected("ReallyWorld")) {
                        break;
                    }
                    break block42;
                }
                object5 = ev.bnbz("bnjq", bnbw(int ), (int)124);
            }
            if (bl2) return;
            Object object6 = dp;
            block22: while (true) {
                switch ((int)object6) {
                    case -1959199855: {
                        object6 = ev.bnbz("bnjs", bncr(int ), (int)68) - ev.bnbz("bnjr", bncr(int ), (int)67);
                        continue block22;
                    }
                    case -1309097994: {
                        break block22;
                    }
                }
                break;
            }
            if (!nz.isSwapQueued(SWAP_ID_ELYTRA)) {
                if (bl2) return;
                while (true) {
                    long l4;
                    Object object7;
                    if ((object7 = (l4 = dp - ev.bnbz("bnjt", bncr(int ), (int)69)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (object7 == ev.bnbz("bnju", bnbw(int ), (int)125)) {
                        if (nz.isSwapQueued(SWAP_ID_FIREWORK)) {
                            break;
                        }
                        break block42;
                    }
                    object7 = ev.bnbz("bnjv", bnbw(int ), (int)126);
                }
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            while (true) {
                long l5;
                Object object8;
                if ((object8 = (l5 = dp - ev.bnbz("bnjw", bncr(int ), (int)70)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object8 == ev.bnbz("bnjx", bnbw(int ), (int)127)) {
                    nz.tick();
                    if (bl2) return;
                    break;
                }
                object8 = ev.bnbz("bnjy", bnbw(int ), (int)128);
            }
        }
        if (!bl2 && !bl2) return;
    }

    static {
        bnby = new int[637];
        ev.bolz();
        ev.boma();
        ev.bomb();
        ev.bomc();
        ev.bomd();
        ev.bome();
        ev.bomf();
        ev.bomg();
        ev.bomh();
        ev.bomi();
        ev.bomj();
        ev.bomk();
        ev.boml();
        ev.bomm();
        bncs = new long[290];
        bnct = new long[290];
        ev.bomn();
        ev.bomo();
        ev.bomp();
        ev.bomq();
        ev.bomr();
        ev.boms();
    }

    private static /* synthetic */ void bomd() {
        ev.bnbx[400] = -1999375451;
        ev.bnbx[401] = -1718221303;
        ev.bnbx[402] = 475692322;
        ev.bnbx[403] = -1332880016;
        ev.bnbx[404] = 1336986451;
        ev.bnbx[405] = -585097772;
        ev.bnbx[406] = -1804127638;
        ev.bnbx[407] = 245177614;
        ev.bnbx[408] = 1889186336;
        ev.bnbx[409] = 36761751;
        ev.bnbx[410] = 1171197406;
        ev.bnbx[411] = 264388726;
        ev.bnbx[412] = 960478087;
        ev.bnbx[413] = -893843880;
        ev.bnbx[414] = 219694512;
        ev.bnbx[415] = -1178484702;
        ev.bnbx[416] = 1316658557;
        ev.bnbx[417] = -989973212;
        ev.bnbx[418] = 1366910322;
        ev.bnbx[419] = -1112997046;
        ev.bnbx[420] = -1574070201;
        ev.bnbx[421] = 1743982032;
        ev.bnbx[422] = -701792819;
        ev.bnbx[423] = 2065753641;
        ev.bnbx[424] = 1958490435;
        ev.bnbx[425] = -453271150;
        ev.bnbx[426] = -74540788;
        ev.bnbx[427] = 1185787445;
        ev.bnbx[428] = -418392325;
        ev.bnbx[429] = 434420659;
        ev.bnbx[430] = -1020633143;
        ev.bnbx[431] = -1009693278;
        ev.bnbx[432] = 1430091286;
        ev.bnbx[433] = -974186586;
        ev.bnbx[434] = 1688945238;
        ev.bnbx[435] = -1636738292;
        ev.bnbx[436] = 415259920;
        ev.bnbx[437] = 1958905850;
        ev.bnbx[438] = 174100138;
        ev.bnbx[439] = 874447162;
        ev.bnbx[440] = -1062994694;
        ev.bnbx[441] = -1864424642;
        ev.bnbx[442] = 1601269829;
        ev.bnbx[443] = 79648863;
        ev.bnbx[444] = -1043795598;
        ev.bnbx[445] = 1387296899;
        ev.bnbx[446] = 2108377351;
        ev.bnbx[447] = 2106418959;
        ev.bnbx[448] = 1710792933;
        ev.bnbx[449] = -2019401792;
        ev.bnbx[450] = 1100123728;
        ev.bnbx[451] = -416527845;
        ev.bnbx[452] = -1672925147;
        ev.bnbx[453] = 953388084;
        ev.bnbx[454] = 778710721;
        ev.bnbx[455] = -1017458817;
        ev.bnbx[456] = 1800020747;
        ev.bnbx[457] = -590695685;
        ev.bnbx[458] = 1167620393;
        ev.bnbx[459] = 412616046;
        ev.bnbx[460] = -2031497890;
        ev.bnbx[461] = 1238965659;
        ev.bnbx[462] = -1153481900;
        ev.bnbx[463] = 503386276;
        ev.bnbx[464] = -181748324;
        ev.bnbx[465] = 757778849;
        ev.bnbx[466] = 616122484;
        ev.bnbx[467] = 968575137;
        ev.bnbx[468] = -1492900772;
        ev.bnbx[469] = -1540666337;
        ev.bnbx[470] = 736586326;
        ev.bnbx[471] = -2091665301;
        ev.bnbx[472] = 1683223537;
        ev.bnbx[473] = 554220116;
        ev.bnbx[474] = 1624287474;
        ev.bnbx[475] = -374943026;
        ev.bnbx[476] = 1373804829;
        ev.bnbx[477] = 1709024502;
        ev.bnbx[478] = -2052559428;
        ev.bnbx[479] = -1864007333;
        ev.bnbx[480] = 104110429;
        ev.bnbx[481] = -932179694;
        ev.bnbx[482] = -501070455;
        ev.bnbx[483] = 712445383;
        ev.bnbx[484] = 30583929;
        ev.bnbx[485] = 1535191077;
        ev.bnbx[486] = -1333803335;
        ev.bnbx[487] = 35428939;
        ev.bnbx[488] = 1114954156;
        ev.bnbx[489] = 937043030;
        ev.bnbx[490] = 517675979;
        ev.bnbx[491] = -49232766;
        ev.bnbx[492] = 1704490641;
        ev.bnbx[493] = -266267141;
        ev.bnbx[494] = 673111833;
        ev.bnbx[495] = -344834230;
        ev.bnbx[496] = -1641747670;
        ev.bnbx[497] = 1796575229;
        ev.bnbx[498] = -372522235;
        ev.bnbx[499] = 1634310190;
    }

    private static /* synthetic */ void boml() {
        ev.bnby[500] = -56794711;
        ev.bnby[501] = -247295365;
        ev.bnby[502] = 783339602;
        ev.bnby[503] = 935959296;
        ev.bnby[504] = -2137275524;
        ev.bnby[505] = 1848919588;
        ev.bnby[506] = -1111278712;
        ev.bnby[507] = -873657577;
        ev.bnby[508] = -281827032;
        ev.bnby[509] = -1089118964;
        ev.bnby[510] = 1401886694;
        ev.bnby[511] = -1014259497;
        ev.bnby[512] = 849485845;
        ev.bnby[513] = -2105463589;
        ev.bnby[514] = 1149921671;
        ev.bnby[515] = 1449886861;
        ev.bnby[516] = -291935563;
        ev.bnby[517] = -1533749740;
        ev.bnby[518] = 935730918;
        ev.bnby[519] = -669315923;
        ev.bnby[520] = 1799834511;
        ev.bnby[521] = -59661033;
        ev.bnby[522] = 419593102;
        ev.bnby[523] = -117149659;
        ev.bnby[524] = 1059262152;
        ev.bnby[525] = 826661171;
        ev.bnby[526] = -1886005337;
        ev.bnby[527] = 1778379040;
        ev.bnby[528] = 845990921;
        ev.bnby[529] = -306203647;
        ev.bnby[530] = 213467662;
        ev.bnby[531] = -1164931330;
        ev.bnby[532] = -1064316381;
        ev.bnby[533] = 2046604475;
        ev.bnby[534] = -1668855772;
        ev.bnby[535] = 845752285;
        ev.bnby[536] = -1473104178;
        ev.bnby[537] = 51071003;
        ev.bnby[538] = -1153053318;
        ev.bnby[539] = 88780019;
        ev.bnby[540] = -600207553;
        ev.bnby[541] = -1163768218;
        ev.bnby[542] = -1339056792;
        ev.bnby[543] = 757042029;
        ev.bnby[544] = -113822648;
        ev.bnby[545] = 1613949823;
        ev.bnby[546] = -1385148860;
        ev.bnby[547] = -21743994;
        ev.bnby[548] = 293017507;
        ev.bnby[549] = 1243855602;
        ev.bnby[550] = 800645162;
        ev.bnby[551] = 1104527846;
        ev.bnby[552] = -268762271;
        ev.bnby[553] = -533016749;
        ev.bnby[554] = -197212637;
        ev.bnby[555] = 1238309780;
        ev.bnby[556] = -54854542;
        ev.bnby[557] = 348095310;
        ev.bnby[558] = -1225324386;
        ev.bnby[559] = -1485132897;
        ev.bnby[560] = -2089726660;
        ev.bnby[561] = -116483109;
        ev.bnby[562] = 743673235;
        ev.bnby[563] = 1188717427;
        ev.bnby[564] = -460422059;
        ev.bnby[565] = -1592665680;
        ev.bnby[566] = -863777390;
        ev.bnby[567] = 999449529;
        ev.bnby[568] = 431331001;
        ev.bnby[569] = 195342748;
        ev.bnby[570] = 1211049678;
        ev.bnby[571] = 7895146;
        ev.bnby[572] = -1804118549;
        ev.bnby[573] = -1032196401;
        ev.bnby[574] = -905054449;
        ev.bnby[575] = 433564717;
        ev.bnby[576] = -2102931595;
        ev.bnby[577] = -1738084441;
        ev.bnby[578] = 1647062239;
        ev.bnby[579] = -417180925;
        ev.bnby[580] = 1469683050;
        ev.bnby[581] = 487718102;
        ev.bnby[582] = 1079271185;
        ev.bnby[583] = -1384632213;
        ev.bnby[584] = 1754399969;
        ev.bnby[585] = 2076001021;
        ev.bnby[586] = 1285587093;
        ev.bnby[587] = -1763076975;
        ev.bnby[588] = 698739607;
        ev.bnby[589] = 900823548;
        ev.bnby[590] = -1746938009;
        ev.bnby[591] = -1331155519;
        ev.bnby[592] = 1557025655;
        ev.bnby[593] = -627472666;
        ev.bnby[594] = 1727484467;
        ev.bnby[595] = -371477973;
        ev.bnby[596] = -813611201;
        ev.bnby[597] = 1414188130;
        ev.bnby[598] = 1979623538;
        ev.bnby[599] = 1134071732;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findChestplate$1(class_1799 var0) {
        v0 /* !! */  = ev.dp;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(ev.bnbz("bojh", bncr(int ), (int)263) - ev.bnbz("bojg", bncr(int ), (int)262));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1309097994: {
                    break block43;
                }
                case 1209763702: {
                    continue block43;
                }
            }
            break;
        }
        var4_1 = ev.c;
        v1 /* !! */  = ev.dp;
        if (true) ** GOTO lbl15
        block44: while (true) {
            v1 /* !! */  = (long)(v2 - ev.bnbz("boji", bncr(int ), (int)264));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1309097994: {
                    break block44;
                }
                case -1065810356: {
                    v2 = ev.bnbz("bojj", bncr(int ), (int)265);
                    continue block44;
                }
                case 489407812: {
                    v2 = ev.bnbz("bojk", bncr(int ), (int)266);
                    continue block44;
                }
                case 2142978166: {
                    v2 = ev.bnbz("bojl", bncr(int ), (int)267);
                    continue block44;
                }
            }
            break;
        }
        var3_2 /* !! */  = ev.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bojm", bncr(int ), (int)268)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ev.bnbz("bojn", bnbw(int ), (int)594)) break;
            v3 /* !! */  = (long)ev.bnbz("bojo", bnbw(int ), (int)595);
        }
        var2_3 = ev.a;
        if (var4_1) {
            throw null;
lbl37:
            // 10 sources

            return (boolean)ev.bnbz("bojp", bnbw(int ), (int)596);
        }
        if (var2_3 || var2_3) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bojq", bncr(int ), (int)269)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ev.bnbz("bojr", bnbw(int ), (int)597)) break;
            v4 /* !! */  = (long)ev.bnbz("bojs", bnbw(int ), (int)598);
        }
        var1_4 = var0.method_7909();
        if (var2_3 || var2_3) ** GOTO lbl37
        v5 /* !! */  = ev.dp;
        if (true) ** GOTO lbl52
        block48: while (true) {
            v5 /* !! */  = (long)(ev.bnbz("boju", bncr(int ), (int)271) - ev.bnbz("bojt", bncr(int ), (int)270));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1309097994: {
                    break block48;
                }
                case -801389276: {
                    continue block48;
                }
            }
            break;
        }
        if (var1_4 == class_1802.field_22028) ** GOTO lbl115
        if (var2_3) ** GOTO lbl37
        v6 /* !! */  = ev.dp;
        if (true) ** GOTO lbl63
        block49: while (true) {
            v6 /* !! */  = (long)(ev.bnbz("bojw", bncr(int ), (int)273) - ev.bnbz("bojv", bncr(int ), (int)272));
lbl63:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1309097994: {
                    break block49;
                }
                case 663503157: {
                    continue block49;
                }
            }
            break;
        }
        if (var1_4 == class_1802.field_8058) ** GOTO lbl115
        if (var2_3) ** GOTO lbl37
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bojx", bncr(int ), (int)274)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == ev.bnbz("bojy", bnbw(int ), (int)599)) break;
            v7 /* !! */  = (long)ev.bnbz("bojz", bnbw(int ), (int)600);
        }
        if (var1_4 == class_1802.field_8523) ** GOTO lbl115
        if (var2_3) ** GOTO lbl37
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("boka", bncr(int ), (int)275)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ev.bnbz("bokb", bnbw(int ), (int)601)) break;
            v8 /* !! */  = (long)ev.bnbz("bokc", bnbw(int ), (int)602);
        }
        if (var1_4 == class_1802.field_8678) ** GOTO lbl115
        if (var2_3) ** GOTO lbl37
        v9 /* !! */  = ev.dp;
        if (true) ** GOTO lbl90
        block52: while (true) {
            v9 /* !! */  = (long)(v10 - ev.bnbz("bokd", bncr(int ), (int)276));
lbl90:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1592422130: {
                    v10 = ev.bnbz("boke", bncr(int ), (int)277);
                    continue block52;
                }
                case -1309097994: {
                    break block52;
                }
                case -885221329: {
                    v10 = ev.bnbz("bokf", bncr(int ), (int)278);
                    continue block52;
                }
                case -867533170: {
                    v10 = ev.bnbz("bokg", bncr(int ), (int)279);
                    continue block52;
                }
            }
            break;
        }
        if (var1_4 == class_1802.field_8873) ** GOTO lbl115
        if (var2_3) ** GOTO lbl37
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bokh", bncr(int ), (int)280)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ev.bnbz("boki", bnbw(int ), (int)603)) break;
                    v11 /* !! */  = (long)ev.bnbz("bokj", bnbw(int ), (int)604);
                }
                if (var1_4 != class_1802.field_8577) ** GOTO lbl120
                if (var2_3) ** GOTO lbl37
lbl115:
                // 6 sources

                if (var2_3 || var2_3) ** GOTO lbl37
                v12 = ev.bnbz("bokk", bnbw(int ), (int)605);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl123
lbl120:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v12 = ev.bnbz("bokl", bnbw(int ), (int)606);
lbl123:
                // 2 sources

                return (boolean)v12;
            }
lbl124:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ev.bnbz("bokm", bnbw(int ), (int)607);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                    break;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)ev.bnbz("bokn", bnbw(int ), (int)608);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl135:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ev.bnbz("boko", bnbw(int ), (int)609);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl140:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)ev.bnbz("bokp", bnbw(int ), (int)610);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl145:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)ev.bnbz("bokq", bnbw(int ), (int)611);
                if (!var4_1) ** GOTO lbl140
                throw null;
            }
lbl149:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ev.bnbz("bokr", bnbw(int ), (int)612);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 6: {
                var3_2 /* !! */  = (int)ev.bnbz("boks", bnbw(int ), (int)613);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 7: {
                var3_2 /* !! */  = (int)ev.bnbz("bokt", bnbw(int ), (int)614);
                if (!var4_1) ** GOTO lbl135
                throw null;
            }
lbl163:
            // 4 sources

            case 8: {
                var3_2 /* !! */  = (int)ev.bnbz("boku", bnbw(int ), (int)615);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl168:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)ev.bnbz("bokv", bnbw(int ), (int)616);
                if (!var4_1) ** GOTO lbl163
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)ev.bnbz("bokw", bnbw(int ), (int)617);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl177:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)ev.bnbz("bokx", bnbw(int ), (int)618);
                if (!var4_1) ** GOTO lbl145
                throw null;
            }
lbl181:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)ev.bnbz("boky", bnbw(int ), (int)619);
                if (!var4_1) ** GOTO lbl163
                throw null;
            }
lbl185:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)ev.bnbz("bokz", bnbw(int ), (int)620);
                if (!var4_1) ** GOTO lbl181
                throw null;
            }
lbl189:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)ev.bnbz("bola", bnbw(int ), (int)621);
                if (!var4_1) ** GOTO lbl124
                throw null;
            }
lbl193:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)ev.bnbz("bolb", bnbw(int ), (int)622);
                if (!var4_1) ** GOTO lbl189
                throw null;
            }
            case 16: 
        }
        var3_2 /* !! */  = (int)ev.bnbz("bolc", bnbw(int ), (int)623);
        ** while (!var4_1)
lbl200:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bomq() {
        ev.bnct[0] = -7679713367515450580L;
        ev.bnct[1] = -8279709267537190797L;
        ev.bnct[2] = 246738195743922399L;
        ev.bnct[3] = -3461240583671290329L;
        ev.bnct[4] = -3603531847407007546L;
        ev.bnct[5] = -168945776275979306L;
        ev.bnct[6] = 1080175389901962436L;
        ev.bnct[7] = -3242193457233325171L;
        ev.bnct[8] = 1431300406089457290L;
        ev.bnct[9] = -7475533559971846046L;
        ev.bnct[10] = -8092874091712790775L;
        ev.bnct[11] = 1574893039458233491L;
        ev.bnct[12] = 2042376927050936073L;
        ev.bnct[13] = 2614543782494816907L;
        ev.bnct[14] = 1090758039954994485L;
        ev.bnct[15] = -365936010948080073L;
        ev.bnct[16] = 4676028610538303538L;
        ev.bnct[17] = -8036334333382695640L;
        ev.bnct[18] = -8391123904340461579L;
        ev.bnct[19] = -3779896790142317647L;
        ev.bnct[20] = -4078469731881976823L;
        ev.bnct[21] = 8748949923808536105L;
        ev.bnct[22] = -2011931515890471023L;
        ev.bnct[23] = 3512203328274945287L;
        ev.bnct[24] = 5201968427367482583L;
        ev.bnct[25] = -5493881853780057933L;
        ev.bnct[26] = -8699885893340176920L;
        ev.bnct[27] = 1528319031703142086L;
        ev.bnct[28] = -473815954029765002L;
        ev.bnct[29] = 7351231201141575816L;
        ev.bnct[30] = -1440004165653776384L;
        ev.bnct[31] = -5203650451814791756L;
        ev.bnct[32] = 1092470073490412591L;
        ev.bnct[33] = 4385561394104362877L;
        ev.bnct[34] = 2257844203247894915L;
        ev.bnct[35] = 7645839780382527445L;
        ev.bnct[36] = -356095491740826066L;
        ev.bnct[37] = 7126066993493741804L;
        ev.bnct[38] = 5120737989642386751L;
        ev.bnct[39] = -4889623909887020285L;
        ev.bnct[40] = -8984718428227517585L;
        ev.bnct[41] = 6156119040932399570L;
        ev.bnct[42] = 7174303639086498015L;
        ev.bnct[43] = 4359742969262573124L;
        ev.bnct[44] = 1225794185472649113L;
        ev.bnct[45] = 66027196658656254L;
        ev.bnct[46] = -2532110646781172948L;
        ev.bnct[47] = -6211546392687972284L;
        ev.bnct[48] = -6555487710458706663L;
        ev.bnct[49] = -1672960540309977833L;
        ev.bnct[50] = 3284765206084773311L;
        ev.bnct[51] = -5597941438906832455L;
        ev.bnct[52] = 7352424309095384351L;
        ev.bnct[53] = 213092973495271865L;
        ev.bnct[54] = 1479428815058075227L;
        ev.bnct[55] = 7240471080594151921L;
        ev.bnct[56] = 8020013602825898694L;
        ev.bnct[57] = -6302528181520145787L;
        ev.bnct[58] = -3799342189160025625L;
        ev.bnct[59] = -3923392197181828585L;
        ev.bnct[60] = -1140198904343054420L;
        ev.bnct[61] = 3435198872582178458L;
        ev.bnct[62] = -3049821381673949000L;
        ev.bnct[63] = 108643677660750427L;
        ev.bnct[64] = -8412859253506298737L;
        ev.bnct[65] = -1986700774649505128L;
        ev.bnct[66] = -555131112563253283L;
        ev.bnct[67] = 6518744155962066755L;
        ev.bnct[68] = 389504395959849520L;
        ev.bnct[69] = -2213957498169850565L;
        ev.bnct[70] = -2645112673730057959L;
        ev.bnct[71] = -5524852710097055718L;
        ev.bnct[72] = 8841740822473841680L;
        ev.bnct[73] = -5679130614852366283L;
        ev.bnct[74] = -7939006807861437889L;
        ev.bnct[75] = 915250365335514591L;
        ev.bnct[76] = -2387165868190509151L;
        ev.bnct[77] = -6147399287180586622L;
        ev.bnct[78] = -547501771418703982L;
        ev.bnct[79] = 3220534584129822205L;
        ev.bnct[80] = -6475476642066981508L;
        ev.bnct[81] = 2132408801291440731L;
        ev.bnct[82] = 3697140378147558565L;
        ev.bnct[83] = 4037935276471352956L;
        ev.bnct[84] = -6952167351414657921L;
        ev.bnct[85] = 3124675803709552283L;
        ev.bnct[86] = -619400954320376880L;
        ev.bnct[87] = 8854749686866090148L;
        ev.bnct[88] = -1699704608543532423L;
        ev.bnct[89] = -9161463102577656329L;
        ev.bnct[90] = 2492450153166476417L;
        ev.bnct[91] = -8454848947963358056L;
        ev.bnct[92] = -3607683722070009093L;
        ev.bnct[93] = -8956085614203546707L;
        ev.bnct[94] = -3488303002389782785L;
        ev.bnct[95] = -5254482519371933190L;
        ev.bnct[96] = 8794331137572162764L;
        ev.bnct[97] = -2420799893797990969L;
        ev.bnct[98] = -6840407640826465166L;
        ev.bnct[99] = -8362931294228097968L;
    }

    private static /* synthetic */ void bomm() {
        ev.bnby[600] = -937280601;
        ev.bnby[601] = 1742685592;
        ev.bnby[602] = -533146001;
        ev.bnby[603] = 702760701;
        ev.bnby[604] = 888218218;
        ev.bnby[605] = -787105429;
        ev.bnby[606] = 1059295288;
        ev.bnby[607] = 1690829760;
        ev.bnby[608] = 1246878272;
        ev.bnby[609] = -1453593485;
        ev.bnby[610] = 88651471;
        ev.bnby[611] = -1401542312;
        ev.bnby[612] = 1847450946;
        ev.bnby[613] = 1884870566;
        ev.bnby[614] = 691832745;
        ev.bnby[615] = 1006291479;
        ev.bnby[616] = 770911440;
        ev.bnby[617] = -1949316379;
        ev.bnby[618] = 1184157878;
        ev.bnby[619] = 1317787843;
        ev.bnby[620] = 1080302082;
        ev.bnby[621] = -695955201;
        ev.bnby[622] = -1034861321;
        ev.bnby[623] = 1167537767;
        ev.bnby[624] = 1214157669;
        ev.bnby[625] = -1303099032;
        ev.bnby[626] = 345336769;
        ev.bnby[627] = 196600313;
        ev.bnby[628] = 1344307724;
        ev.bnby[629] = 606484798;
        ev.bnby[630] = -331872870;
        ev.bnby[631] = -213955582;
        ev.bnby[632] = 1800653037;
        ev.bnby[633] = -265310980;
        ev.bnby[634] = 743315157;
        ev.bnby[635] = 65138314;
        ev.bnby[636] = 170597632;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeChestSwapLegit() {
        v0 /* !! */  = ev.dp;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - ev.bnbz("bnot", bncr(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2104782305: {
                    v1 = ev.bnbz("bnou", bncr(int ), (int)72);
                    continue block46;
                }
                case -1309097994: {
                    break block46;
                }
                case 370079956: {
                    v1 = ev.bnbz("bnov", bncr(int ), (int)73);
                    continue block46;
                }
            }
            break;
        }
        var3_1 = ev.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bnow", bncr(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ev.bnbz("bnox", bnbw(int ), (int)253)) break;
            v2 /* !! */  = (long)ev.bnbz("bnoy", bnbw(int ), (int)254);
        }
        var2_2 /* !! */  = ev.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bnoz", bncr(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ev.bnbz("bnpa", bnbw(int ), (int)255)) break;
            v3 /* !! */  = (long)ev.bnbz("bnpb", bnbw(int ), (int)256);
        }
        var1_3 = ev.a;
        if (var3_1) {
            throw null;
lbl29:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bnpc", bncr(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ev.bnbz("bnpd", bnbw(int ), (int)257)) break;
                    v4 /* !! */  = (long)ev.bnbz("bnpe", bnbw(int ), (int)258);
                }
                if (this.elytraTargetSlot != ev.bnbz("bnpf", bnbw(int ), (int)259)) ** GOTO lbl43
                if (var1_3 || var1_3) ** GOTO lbl29
                return;
lbl43:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v5 /* !! */  = ev.dp;
                if (true) ** GOTO lbl48
                block51: while (true) {
                    v5 /* !! */  = (long)(v6 - ev.bnbz("bnpg", bncr(int ), (int)77));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1992708760: {
                            v6 = ev.bnbz("bnph", bncr(int ), (int)78);
                            continue block51;
                        }
                        case -1309097994: {
                            break block51;
                        }
                        case -1217894728: {
                            v6 = ev.bnbz("bnpi", bncr(int ), (int)79);
                            continue block51;
                        }
                        case -268384423: {
                            v6 = ev.bnbz("bnpj", bncr(int ), (int)80);
                            continue block51;
                        }
                    }
                    break;
                }
                v7 = ev.bnbz("bnpk", bnbw(int ), (int)260);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bnpl", bncr(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ev.bnbz("bnpm", bnbw(int ), (int)261)) break;
                    v8 /* !! */  = (long)ev.bnbz("bnpn", bnbw(int ), (int)262);
                }
                nv.swapHotbar(this.elytraTargetSlot, (int)v7);
                if (var1_3 || var1_3) ** GOTO lbl29
                v9 = ev.bnbz("bnpo", bnbw(int ), (int)263);
                v10 = ev.bnbz("bnpp", bnbw(int ), (int)264);
                v11 /* !! */  = ev.dp;
                if (true) ** GOTO lbl74
                block53: while (true) {
                    v11 /* !! */  = (long)(v12 - ev.bnbz("bnpq", bncr(int ), (int)82));
lbl74:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1309097994: {
                            break block53;
                        }
                        case -1022803335: {
                            v12 = ev.bnbz("bnpr", bncr(int ), (int)83);
                            continue block53;
                        }
                        case 762684472: {
                            v12 = ev.bnbz("bnps", bncr(int ), (int)84);
                            continue block53;
                        }
                    }
                    break;
                }
                v13 /* !! */  = ev.dp;
                if (true) ** GOTO lbl87
                block54: while (true) {
                    v13 /* !! */  = (long)(ev.bnbz("bnpu", bncr(int ), (int)86) - ev.bnbz("bnpt", bncr(int ), (int)85));
lbl87:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1309097994: {
                            break block54;
                        }
                        case 1543991475: {
                            continue block54;
                        }
                    }
                    break;
                }
                nv.click((int)v9, (int)v10, class_1713.field_7791);
                if (var1_3 || var1_3) ** GOTO lbl29
                v14 /* !! */  = ev.dp;
                if (true) ** GOTO lbl98
                block55: while (true) {
                    v14 /* !! */  = (long)(ev.bnbz("bnpw", bncr(int ), (int)88) - ev.bnbz("bnpv", bncr(int ), (int)87));
lbl98:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1309097994: {
                            break block55;
                        }
                        case 2074100177: {
                            continue block55;
                        }
                    }
                    break;
                }
                v15 = ev.bnbz("bnpx", bnbw(int ), (int)265);
                v16 /* !! */  = ev.dp;
                if (true) ** GOTO lbl108
                block56: while (true) {
                    v16 /* !! */  = (long)(v17 - ev.bnbz("bnpy", bncr(int ), (int)89));
lbl108:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1309097994: {
                            break block56;
                        }
                        case -512527827: {
                            v17 = ev.bnbz("bnpz", bncr(int ), (int)90);
                            continue block56;
                        }
                        case -476734227: {
                            v17 = ev.bnbz("bnqa", bncr(int ), (int)91);
                            continue block56;
                        }
                    }
                    break;
                }
                nv.swapHotbar(this.elytraTargetSlot, (int)v15);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl120:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqb", bnbw(int ), (int)266);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ev.bnbz("bnqc", bnbw(int ), (int)267);
                } while (!var3_1);
                throw null;
            }
lbl129:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqd", bnbw(int ), (int)268);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
lbl133:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ev.bnbz("bnqe", bnbw(int ), (int)269);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                    break;
                }
            }
lbl139:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqf", bnbw(int ), (int)270);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqg", bnbw(int ), (int)271);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl148:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqh", bnbw(int ), (int)272);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
lbl152:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqi", bnbw(int ), (int)273);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
lbl156:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqj", bnbw(int ), (int)274);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqk", bnbw(int ), (int)275);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ev.bnbz("bnql", bnbw(int ), (int)276);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
lbl168:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqm", bnbw(int ), (int)277);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqn", bnbw(int ), (int)278);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)ev.bnbz("bnqo", bnbw(int ), (int)279);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("bnqp", bnbw(int ), (int)280);
        ** while (!var3_1)
lbl183:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bomf() {
        ev.bnbx[600] = 445665509;
        ev.bnbx[601] = 1742685593;
        ev.bnbx[602] = 984621396;
        ev.bnbx[603] = 702760700;
        ev.bnbx[604] = 1699013304;
        ev.bnbx[605] = -787105430;
        ev.bnbx[606] = 1059295288;
        ev.bnbx[607] = 1690829769;
        ev.bnbx[608] = 1246878275;
        ev.bnbx[609] = -1453593485;
        ev.bnbx[610] = 88651468;
        ev.bnbx[611] = -1401542312;
        ev.bnbx[612] = 1847450951;
        ev.bnbx[613] = 1884870566;
        ev.bnbx[614] = 691832741;
        ev.bnbx[615] = 1006291480;
        ev.bnbx[616] = 770911424;
        ev.bnbx[617] = -1949316370;
        ev.bnbx[618] = 1184157882;
        ev.bnbx[619] = 1317787843;
        ev.bnbx[620] = 1080302082;
        ev.bnbx[621] = -695955214;
        ev.bnbx[622] = -1034861322;
        ev.bnbx[623] = 1167537773;
        ev.bnbx[624] = 1214157668;
        ev.bnbx[625] = 1077633185;
        ev.bnbx[626] = 345336769;
        ev.bnbx[627] = 196600312;
        ev.bnbx[628] = 1344307724;
        ev.bnbx[629] = 606484795;
        ev.bnbx[630] = -331872868;
        ev.bnbx[631] = -213955577;
        ev.bnbx[632] = 1800653037;
        ev.bnbx[633] = -265310984;
        ev.bnbx[634] = 743315155;
        ev.bnbx[635] = 65138316;
        ev.bnbx[636] = 170597633;
    }

    private static /* synthetic */ void bomp() {
        ev.bncs[200] = -4850573067837721445L;
        ev.bncs[201] = -2060445660613928282L;
        ev.bncs[202] = -2130149108380318735L;
        ev.bncs[203] = 4463293104548260383L;
        ev.bncs[204] = -3400705634680436205L;
        ev.bncs[205] = -7950101739397940546L;
        ev.bncs[206] = -9141356598982362467L;
        ev.bncs[207] = -1314382142055978981L;
        ev.bncs[208] = -4768586610888075477L;
        ev.bncs[209] = 6128570279175696839L;
        ev.bncs[210] = 5182743214139936116L;
        ev.bncs[211] = -4895498231715905420L;
        ev.bncs[212] = 2566663960209498942L;
        ev.bncs[213] = 1012785194880663405L;
        ev.bncs[214] = -2658064109054784303L;
        ev.bncs[215] = 3508352365407909043L;
        ev.bncs[216] = -7258878797237269426L;
        ev.bncs[217] = 2636016187643607819L;
        ev.bncs[218] = -8695997525946447824L;
        ev.bncs[219] = 1029569043418715383L;
        ev.bncs[220] = -1078927303855073806L;
        ev.bncs[221] = 9066545464235194238L;
        ev.bncs[222] = 3014728081946350109L;
        ev.bncs[223] = 37958203182331234L;
        ev.bncs[224] = -5882715593156499293L;
        ev.bncs[225] = 37595449859980919L;
        ev.bncs[226] = 5754660340993623718L;
        ev.bncs[227] = 523467376864658604L;
        ev.bncs[228] = -1955270701481316517L;
        ev.bncs[229] = -8324490623229485000L;
        ev.bncs[230] = -5834181797227791049L;
        ev.bncs[231] = 1976325591332648834L;
        ev.bncs[232] = -7585922373573586592L;
        ev.bncs[233] = 2061087443609983598L;
        ev.bncs[234] = 6525223005063743213L;
        ev.bncs[235] = -8410929018397703178L;
        ev.bncs[236] = 6017794119641027050L;
        ev.bncs[237] = -146866353567104697L;
        ev.bncs[238] = 7441065091281960366L;
        ev.bncs[239] = -7338596239391650387L;
        ev.bncs[240] = 1267228628927774236L;
        ev.bncs[241] = -1235828566980016950L;
        ev.bncs[242] = -6305904123167647457L;
        ev.bncs[243] = 2449744736263161462L;
        ev.bncs[244] = -1081136645483794044L;
        ev.bncs[245] = 2626859726916095565L;
        ev.bncs[246] = 7825241762633081010L;
        ev.bncs[247] = -617213298650014486L;
        ev.bncs[248] = 4906018257263565767L;
        ev.bncs[249] = -5894982251983735823L;
        ev.bncs[250] = -6497644216363352758L;
        ev.bncs[251] = 2384371803674565919L;
        ev.bncs[252] = -7226638118929975898L;
        ev.bncs[253] = 2773445928319331077L;
        ev.bncs[254] = 706073056297419600L;
        ev.bncs[255] = 3320532271372451830L;
        ev.bncs[256] = -3867266324740119866L;
        ev.bncs[257] = -1480866352403032152L;
        ev.bncs[258] = 8192259290218310906L;
        ev.bncs[259] = -422361969682803648L;
        ev.bncs[260] = 8946361677868857778L;
        ev.bncs[261] = -6559404738235862669L;
        ev.bncs[262] = -939492452724491106L;
        ev.bncs[263] = 6236110792751280123L;
        ev.bncs[264] = -3236459910559026581L;
        ev.bncs[265] = 3601094433076544325L;
        ev.bncs[266] = 371453881579301440L;
        ev.bncs[267] = -571607212816915170L;
        ev.bncs[268] = -6179741536412483701L;
        ev.bncs[269] = 4299521088755660710L;
        ev.bncs[270] = 6666841043927930636L;
        ev.bncs[271] = 6266192368668257060L;
        ev.bncs[272] = -171795871699262448L;
        ev.bncs[273] = -141770478749815110L;
        ev.bncs[274] = 3250406950421205046L;
        ev.bncs[275] = 6322390302801638198L;
        ev.bncs[276] = 5335911555585128228L;
        ev.bncs[277] = 7042628921996635507L;
        ev.bncs[278] = -1238172181842431308L;
        ev.bncs[279] = 4328128266689843908L;
        ev.bncs[280] = -727346179080429439L;
        ev.bncs[281] = -3283981562937691547L;
        ev.bncs[282] = -9125973231232588953L;
        ev.bncs[283] = 2831554336678649332L;
        ev.bncs[284] = -4382012085436766073L;
        ev.bncs[285] = -4592027704195100313L;
        ev.bncs[286] = 2607524079407725015L;
        ev.bncs[287] = -7646081935129513348L;
        ev.bncs[288] = 3875634083124628066L;
        ev.bncs[289] = -8232650132268982425L;
    }

    private static /* synthetic */ void boma() {
        ev.bnbx[100] = -1160960527;
        ev.bnbx[101] = -648168770;
        ev.bnbx[102] = -291555226;
        ev.bnbx[103] = 2031818463;
        ev.bnbx[104] = 467347018;
        ev.bnbx[105] = -1290524852;
        ev.bnbx[106] = 1718987135;
        ev.bnbx[107] = -959407246;
        ev.bnbx[108] = 1474972326;
        ev.bnbx[109] = -666179738;
        ev.bnbx[110] = -689656313;
        ev.bnbx[111] = -1068965694;
        ev.bnbx[112] = -1211708448;
        ev.bnbx[113] = 1875341197;
        ev.bnbx[114] = -927498496;
        ev.bnbx[115] = -1153601575;
        ev.bnbx[116] = 844733855;
        ev.bnbx[117] = 135026666;
        ev.bnbx[118] = -370121269;
        ev.bnbx[119] = -1897634384;
        ev.bnbx[120] = -555083160;
        ev.bnbx[121] = -929060840;
        ev.bnbx[122] = -987335776;
        ev.bnbx[123] = 59400332;
        ev.bnbx[124] = -870268932;
        ev.bnbx[125] = 395746669;
        ev.bnbx[126] = -1509813959;
        ev.bnbx[127] = -148371799;
        ev.bnbx[128] = 200671192;
        ev.bnbx[129] = 2130923497;
        ev.bnbx[130] = 1331328702;
        ev.bnbx[131] = -952776942;
        ev.bnbx[132] = -1783036417;
        ev.bnbx[133] = -918938972;
        ev.bnbx[134] = 1052771414;
        ev.bnbx[135] = -2118748821;
        ev.bnbx[136] = 660634055;
        ev.bnbx[137] = 0x57775553;
        ev.bnbx[138] = -1946168651;
        ev.bnbx[139] = 459128897;
        ev.bnbx[140] = 1768104805;
        ev.bnbx[141] = -716540465;
        ev.bnbx[142] = 378160031;
        ev.bnbx[143] = -1063766354;
        ev.bnbx[144] = 2076164374;
        ev.bnbx[145] = -571022551;
        ev.bnbx[146] = 1075450460;
        ev.bnbx[147] = -1975062495;
        ev.bnbx[148] = 1112245369;
        ev.bnbx[149] = -1864641988;
        ev.bnbx[150] = -914738562;
        ev.bnbx[151] = 1987071125;
        ev.bnbx[152] = -1844484595;
        ev.bnbx[153] = 820603843;
        ev.bnbx[154] = 881867181;
        ev.bnbx[155] = -1504374947;
        ev.bnbx[156] = -1926714063;
        ev.bnbx[157] = 501527765;
        ev.bnbx[158] = -230574624;
        ev.bnbx[159] = 1036676610;
        ev.bnbx[160] = -2134659034;
        ev.bnbx[161] = 475981291;
        ev.bnbx[162] = 189601865;
        ev.bnbx[163] = -995171640;
        ev.bnbx[164] = -1934356471;
        ev.bnbx[165] = -27513371;
        ev.bnbx[166] = 966071459;
        ev.bnbx[167] = -1034364809;
        ev.bnbx[168] = 983430619;
        ev.bnbx[169] = 1307643263;
        ev.bnbx[170] = 99064542;
        ev.bnbx[171] = 20677467;
        ev.bnbx[172] = -1747447213;
        ev.bnbx[173] = 199017135;
        ev.bnbx[174] = 1396166676;
        ev.bnbx[175] = -1611694857;
        ev.bnbx[176] = 157706278;
        ev.bnbx[177] = 161118155;
        ev.bnbx[178] = 1305782609;
        ev.bnbx[179] = -1047399687;
        ev.bnbx[180] = -655744944;
        ev.bnbx[181] = -137746203;
        ev.bnbx[182] = 1637616667;
        ev.bnbx[183] = 1531347092;
        ev.bnbx[184] = -731713479;
        ev.bnbx[185] = 980252021;
        ev.bnbx[186] = 801413535;
        ev.bnbx[187] = -1529543520;
        ev.bnbx[188] = 2103628416;
        ev.bnbx[189] = -1283207015;
        ev.bnbx[190] = 1775667284;
        ev.bnbx[191] = 136186249;
        ev.bnbx[192] = 1729960598;
        ev.bnbx[193] = 1834271850;
        ev.bnbx[194] = -1911673055;
        ev.bnbx[195] = -743075386;
        ev.bnbx[196] = 29761870;
        ev.bnbx[197] = -949076418;
        ev.bnbx[198] = 938027030;
        ev.bnbx[199] = 1235050085;
    }

    private static /* synthetic */ long bncr(int n2) {
        return bncs[n2] ^ bnct[n2];
    }

    private static /* synthetic */ double boaz(int n2) {
        return Double.longBitsToDouble(bncs[n2] ^ bnct[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = ev.dp;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(ev.bnbz("bohm", bncr(int ), (int)244) - ev.bnbz("bohl", bncr(int ), (int)243));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1309097994: {
                    break block43;
                }
                case 5162932: {
                    continue block43;
                }
            }
            break;
        }
        var3_1 = ev.c;
        v1 /* !! */  = ev.dp;
        if (true) ** GOTO lbl15
        block44: while (true) {
            v1 /* !! */  = (long)(ev.bnbz("boho", bncr(int ), (int)246) - ev.bnbz("bohn", bncr(int ), (int)245));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1309097994: {
                    break block44;
                }
                case 835011967: {
                    continue block44;
                }
            }
            break;
        }
        var2_2 /* !! */  = ev.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bohp", bncr(int ), (int)247)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ev.bnbz("bohq", bnbw(int ), (int)566)) break;
            v2 /* !! */  = (long)ev.bnbz("bohr", bnbw(int ), (int)567);
        }
        var1_3 = ev.a;
        if (var3_1) {
            throw null;
lbl29:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bohs", bncr(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ev.bnbz("boht", bnbw(int ), (int)568)) break;
            v3 /* !! */  = (long)ev.bnbz("bohu", bnbw(int ), (int)569);
        }
        nz.cancelSwap("ElytraHelper_Elytra");
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 /* !! */  = ev.dp;
        if (true) ** GOTO lbl43
        block48: while (true) {
            v4 /* !! */  = (long)(v5 - ev.bnbz("bohv", bncr(int ), (int)249));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1309097994: {
                    break block48;
                }
                case -1213900528: {
                    v5 = ev.bnbz("bohw", bncr(int ), (int)250);
                    continue block48;
                }
                case 295020323: {
                    v5 = ev.bnbz("bohx", bncr(int ), (int)251);
                    continue block48;
                }
                case 1830948115: {
                    v5 = ev.bnbz("bohy", bncr(int ), (int)252);
                    continue block48;
                }
            }
            break;
        }
        nz.cancelSwap("ElytraHelper_Firework");
        if (var1_3 || var1_3) ** GOTO lbl29
        v6 = ev.bnbz("bohz", bnbw(int ), (int)570);
        v7 /* !! */  = ev.dp;
        if (true) ** GOTO lbl62
        block49: while (true) {
            v7 /* !! */  = (long)(v8 - ev.bnbz("boia", bncr(int ), (int)253));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1309097994: {
                    break block49;
                }
                case -1134380571: {
                    v8 = ev.bnbz("boib", bncr(int ), (int)254);
                    continue block49;
                }
                case 933307030: {
                    v8 = ev.bnbz("boic", bncr(int ), (int)255);
                    continue block49;
                }
            }
            break;
        }
        this.previousSlot = (int)v6;
        if (var1_3 || var1_3) ** GOTO lbl29
        v9 = ev.bnbz("boid", bnbw(int ), (int)571);
        v10 /* !! */  = ev.dp;
        if (true) ** GOTO lbl78
        block50: while (true) {
            v10 /* !! */  = (long)(v11 - ev.bnbz("boie", bncr(int ), (int)256));
lbl78:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1543905691: {
                    v11 = ev.bnbz("boif", bncr(int ), (int)257);
                    continue block50;
                }
                case -1309097994: {
                    break block50;
                }
                case -215541996: {
                    v11 = ev.bnbz("boig", bncr(int ), (int)258);
                    continue block50;
                }
                case 11766694: {
                    v11 = ev.bnbz("boih", bncr(int ), (int)259);
                    continue block50;
                }
            }
            break;
        }
        this.fireworkSlot = (int)v9;
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v12 = ev.bnbz("boii", bnbw(int ), (int)572);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("boij", bncr(int ), (int)260)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ev.bnbz("boik", bnbw(int ), (int)573)) break;
                    v13 /* !! */  = (long)ev.bnbz("boil", bnbw(int ), (int)574);
                }
                this.fireworkFromHotbar = v12;
                if (var1_3 || var1_3) ** GOTO lbl29
                v14 = ev.bnbz("boim", bnbw(int ), (int)575);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("boin", bncr(int ), (int)261)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ev.bnbz("boio", bnbw(int ), (int)576)) break;
                    v15 /* !! */  = (long)ev.bnbz("boip", bnbw(int ), (int)577);
                }
                this.elytraTargetSlot = (int)v14;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ev.bnbz("boiq", bnbw(int ), (int)578);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl119:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ev.bnbz("boir", bnbw(int ), (int)579);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl124:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ev.bnbz("bois", bnbw(int ), (int)580);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 3: {
                var2_2 /* !! */  = (int)ev.bnbz("boit", bnbw(int ), (int)581);
                if (!var3_1) break;
                throw null;
            }
lbl133:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ev.bnbz("boiu", bnbw(int ), (int)582);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl165
                    break;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ev.bnbz("boiv", bnbw(int ), (int)583);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl144:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ev.bnbz("boiw", bnbw(int ), (int)584);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ev.bnbz("boix", bnbw(int ), (int)585);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
lbl152:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ev.bnbz("boiy", bnbw(int ), (int)586);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)ev.bnbz("boiz", bnbw(int ), (int)587);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 10: {
                var2_2 /* !! */  = (int)ev.bnbz("boja", bnbw(int ), (int)588);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl165:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ev.bnbz("bojb", bnbw(int ), (int)589);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
lbl169:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ev.bnbz("bojc", bnbw(int ), (int)590);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl173:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ev.bnbz("bojd", bnbw(int ), (int)591);
                if (!var3_1) break;
                throw null;
            }
lbl177:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ev.bnbz("boje", bnbw(int ), (int)592);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("bojf", bnbw(int ), (int)593);
        ** while (!var3_1)
lbl184:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(df df2) {
        boolean bl2;
        block25: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = dp - ev.bnbz("bnib", bncr(int ), (int)48)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == ev.bnbz("bnic", bnbw(int ), (int)102)) break;
                object = ev.bnbz("bnid", bnbw(int ), (int)103);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = dp - ev.bnbz("bnie", bncr(int ), (int)49)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == ev.bnbz("bnif", bnbw(int ), (int)104)) break;
                object = ev.bnbz("bnig", bnbw(int ), (int)105);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = dp - ev.bnbz("bnih", bncr(int ), (int)50)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == ev.bnbz("bnii", bnbw(int ), (int)106)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object = ev.bnbz("bnij", bnbw(int ), (int)107);
            }
            if (bl2 || bl2) return;
            Object object = dp;
            boolean bl4 = true;
            block13: while (true) {
                CallSite callSite;
                if (!bl4 || (bl4 = false) || !true) {
                    object = callSite - ev.bnbz("bnik", bncr(int ), (int)51);
                }
                switch ((int)object) {
                    case -1309097994: {
                        break block13;
                    }
                    case -835044017: {
                        callSite = ev.bnbz("bnil", bncr(int ), (int)52);
                        continue block13;
                    }
                    case 766600891: {
                        callSite = ev.bnbz("bnim", bncr(int ), (int)53);
                        continue block13;
                    }
                    case 1167297135: {
                        callSite = ev.bnbz("bnin", bncr(int ), (int)54);
                        continue block13;
                    }
                }
                break;
            }
            while (true) {
                long l5;
                Object object2;
                if ((object2 = (l5 = dp - ev.bnbz("bnio", bncr(int ), (int)55)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object2 == ev.bnbz("bnip", bnbw(int ), (int)108)) {
                    if (ev.mc.field_1724 == null) {
                        break;
                    }
                    break block25;
                }
                object2 = ev.bnbz("bniq", bnbw(int ), (int)109);
            }
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        Object object = dp;
        block15: while (true) {
            switch ((int)object) {
                case -1309097994: {
                    break block15;
                }
                case 1430588447: {
                    object = ev.bnbz("bnis", bncr(int ), (int)57) - ev.bnbz("bnir", bncr(int ), (int)56);
                    continue block15;
                }
            }
            break;
        }
        nz.tick();
        if (!bl2 && !bl2) return;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void cleanupFirework() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bnvs", bncr(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ev.bnbz("bnvt", bnbw(int ), (int)374)) break;
            v0 /* !! */  = (long)ev.bnbz("bnvu", bnbw(int ), (int)375);
        }
        var3_1 = ev.c;
        v1 /* !! */  = ev.dp;
        block22: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1835223687: {
                    v1 /* !! */  = (long)(ev.bnbz("bnvw", bncr(int ), (int)133) - ev.bnbz("bnvv", bncr(int ), (int)132));
                    continue block22;
                }
                case -1309097994: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ev.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bnvx", bncr(int ), (int)134)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ev.bnbz("bnvy", bnbw(int ), (int)376)) {
                var1_3 = ev.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ev.bnbz("bnvz", bnbw(int ), (int)377);
        }
        if (var1_3 || var1_3) return;
        v3 = ev.bnbz("bnwa", bnbw(int ), (int)378);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bnwb", bncr(int ), (int)135)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ev.bnbz("bnwc", bnbw(int ), (int)379)) {
                this.previousSlot = (int)v3;
                if (var1_3) return;
                break;
            }
            v4 /* !! */  = (long)ev.bnbz("bnwd", bnbw(int ), (int)380);
        }
        if (var1_3) return;
        v5 = ev.bnbz("bnwe", bnbw(int ), (int)381);
        v6 /* !! */  = ev.dp;
        if (true) ** GOTO lbl41
        block25: while (true) {
            v6 /* !! */  = (long)(v7 - ev.bnbz("bnwf", bncr(int ), (int)136));
lbl41:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1966695523: {
                    v7 = ev.bnbz("bnwg", bncr(int ), (int)137);
                    continue block25;
                }
                case -1732172655: {
                    v7 = ev.bnbz("bnwh", bncr(int ), (int)138);
                    continue block25;
                }
                case -1309097994: {
                    break block25;
                }
            }
            break;
        }
        this.fireworkSlot = (int)v5;
        if (var1_3 || var1_3) return;
        v8 = ev.bnbz("bnwi", bnbw(int ), (int)382);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bnwj", bncr(int ), (int)139)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ev.bnbz("bnwk", bnbw(int ), (int)383)) {
                this.fireworkFromHotbar = v8;
                if (var1_3) return;
                break;
            }
            v9 /* !! */  = (long)ev.bnbz("bnwl", bnbw(int ), (int)384);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block27: while (true) {
            block47: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwm", bnbw(int ), (int)385);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwo", bnbw(int ), (int)387);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block47;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwp", bnbw(int ), (int)388);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block47;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwr", bnbw(int ), (int)390);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block47;
                    }
                    case 6: {
                        ** GOTO lbl96
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwv", bnbw(int ), (int)394);
                        if (var3_1) {
                            throw null;
                        }
lbl96:
                        // 3 sources

                        var2_2 /* !! */  = (int)ev.bnbz("bnws", bnbw(int ), (int)391);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwt", bnbw(int ), (int)392);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwu", bnbw(int ), (int)393);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block47;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ev.bnbz("bnwn", bnbw(int ), (int)386);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl118
            }
            do {
                if (true) continue block27;
lbl118:
                // 2 sources

                var2_2 /* !! */  = (int)ev.bnbz("bnwq", bnbw(int ), (int)389);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void bomo() {
        ev.bncs[100] = 3006018475544808727L;
        ev.bncs[101] = 1283162317442069625L;
        ev.bncs[102] = -8591639178471398301L;
        ev.bncs[103] = -635602161860864396L;
        ev.bncs[104] = 5516031315329205207L;
        ev.bncs[105] = 6705721054341572516L;
        ev.bncs[106] = 1507012732432655852L;
        ev.bncs[107] = -982473833653495871L;
        ev.bncs[108] = -1378271416867653366L;
        ev.bncs[109] = 7460161078634198427L;
        ev.bncs[110] = 3909497211277177294L;
        ev.bncs[111] = -3262081482187359773L;
        ev.bncs[112] = 9201177698000800986L;
        ev.bncs[113] = 3896964897446824044L;
        ev.bncs[114] = -8682556201767506618L;
        ev.bncs[115] = 992851421222057074L;
        ev.bncs[116] = -3806090970229415703L;
        ev.bncs[117] = 1546023366616707332L;
        ev.bncs[118] = -7089719084980516678L;
        ev.bncs[119] = 5053624222761448096L;
        ev.bncs[120] = 6384702076339096410L;
        ev.bncs[121] = -2613327756744141280L;
        ev.bncs[122] = 1122677003376987052L;
        ev.bncs[123] = -6227394983130444253L;
        ev.bncs[124] = -3447277228428363887L;
        ev.bncs[125] = -1061972184424028284L;
        ev.bncs[126] = 4537089838557435474L;
        ev.bncs[127] = -3925221660797402676L;
        ev.bncs[128] = 4487631269506038908L;
        ev.bncs[129] = 2815248707832031050L;
        ev.bncs[130] = 3437845720024161538L;
        ev.bncs[131] = 5478633964860658055L;
        ev.bncs[132] = 3050790892943213426L;
        ev.bncs[133] = 5596652208796977321L;
        ev.bncs[134] = 3100484456296052573L;
        ev.bncs[135] = -2086402956208061997L;
        ev.bncs[136] = 4080198244025761246L;
        ev.bncs[137] = -7339825408135731963L;
        ev.bncs[138] = -996362913387621330L;
        ev.bncs[139] = -5807851244205682081L;
        ev.bncs[140] = -9130156883258883316L;
        ev.bncs[141] = 5335112308994598563L;
        ev.bncs[142] = -3351563700866676682L;
        ev.bncs[143] = 5949177791358660842L;
        ev.bncs[144] = -4799428159439384608L;
        ev.bncs[145] = 749429214481316443L;
        ev.bncs[146] = -3658962379450792748L;
        ev.bncs[147] = 8435470722618317744L;
        ev.bncs[148] = 3051157043712797381L;
        ev.bncs[149] = -8364953292456482837L;
        ev.bncs[150] = 5126387083916663317L;
        ev.bncs[151] = -5661084389542287153L;
        ev.bncs[152] = 6195935654655804046L;
        ev.bncs[153] = 8805853335779811698L;
        ev.bncs[154] = 814372488460726940L;
        ev.bncs[155] = -8003648452875389973L;
        ev.bncs[156] = 4518011704151057050L;
        ev.bncs[157] = 612821562614059347L;
        ev.bncs[158] = 7604147549695556859L;
        ev.bncs[159] = -1785872457683611400L;
        ev.bncs[160] = -6219569732325501828L;
        ev.bncs[161] = 3154313065570157493L;
        ev.bncs[162] = -1913072975365480219L;
        ev.bncs[163] = 5838548027254098625L;
        ev.bncs[164] = 7451485630048010879L;
        ev.bncs[165] = 3830545982698489627L;
        ev.bncs[166] = 1686196850916488769L;
        ev.bncs[167] = -8415932502344924734L;
        ev.bncs[168] = 1046272380432852736L;
        ev.bncs[169] = -5709578323759976317L;
        ev.bncs[170] = -1045583067177536067L;
        ev.bncs[171] = 2644283395840081799L;
        ev.bncs[172] = 808390867425025764L;
        ev.bncs[173] = -2194735924086552867L;
        ev.bncs[174] = -4897878958107446834L;
        ev.bncs[175] = 249695555148909515L;
        ev.bncs[176] = -1936672209208971512L;
        ev.bncs[177] = -1567599497284552251L;
        ev.bncs[178] = -1231014278299582565L;
        ev.bncs[179] = -434914562348739808L;
        ev.bncs[180] = -281299082513758397L;
        ev.bncs[181] = -3493323941387371097L;
        ev.bncs[182] = -6153355294356035272L;
        ev.bncs[183] = -2450844160130127873L;
        ev.bncs[184] = 7976211784397774987L;
        ev.bncs[185] = 1079605892149665760L;
        ev.bncs[186] = -6267158760464341638L;
        ev.bncs[187] = 8086330235683196211L;
        ev.bncs[188] = 9142348930624820581L;
        ev.bncs[189] = -2520764614078066812L;
        ev.bncs[190] = -5037308238952204446L;
        ev.bncs[191] = -5267217036387237027L;
        ev.bncs[192] = -2045324558077217004L;
        ev.bncs[193] = -189830521493610379L;
        ev.bncs[194] = -5029612628702979101L;
        ev.bncs[195] = 44425840600261714L;
        ev.bncs[196] = -8162726172402587322L;
        ev.bncs[197] = -8866197139304028931L;
        ev.bncs[198] = -7489646977161724294L;
        ev.bncs[199] = 6584015095709250509L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findItem(Predicate<class_1799> var1_1) {
        block80: {
            block81: {
                var6_2 = ev.c;
                var5_3 /* !! */  = ev.b;
                var4_4 = ev.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 21 sources

                    return null;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (ev.mc.field_1724 != null) break block81;
                if (var4_4 || var4_4) ** GOTO lbl6
                return nu.notFound();
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_5 = ev.bnbz("bocg", bnbw(int ), (int)472);
            if (var4_4) ** GOTO lbl6
            do {
                block82: {
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 >= ev.bnbz("boch", bnbw(int ), (int)473)) break block80;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var3_6 = ev.mc.field_1724.method_31548().method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var3_6.method_7960()) break block82;
                    if (var4_4) ** GOTO lbl6
                    if (!var1_1.test(var3_6)) break block82;
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.of((int)(var2_5 + ev.bnbz("boci", bnbw(int ), (int)474)), var3_6);
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                ++var2_5;
                if (var4_4) ** GOTO lbl6
            } while (!var6_2);
            throw null;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = ev.bnbz("bocj", bnbw(int ), (int)475);
        if (var4_4) ** GOTO lbl6
        block45: while (true) {
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 >= ev.bnbz("bock", bnbw(int ), (int)476)) ** GOTO lbl56
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var3_6 = ev.mc.field_1724.method_31548().method_5438((int)var2_5);
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var3_6.method_7960()) ** GOTO lbl51
                    if (var4_4) ** GOTO lbl6
                    if (!var1_1.test(var3_6)) ** GOTO lbl51
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return nu.of((int)var2_5, var3_6);
lbl51:
                    // 2 sources

                    if (var4_4 || var4_4) ** GOTO lbl6
                    ++var2_5;
                    if (var4_4) ** GOTO lbl6
                    if (!var6_2) continue block45;
                    throw null;
lbl56:
                    // 1 sources

                    if (!var4_4 && !var4_4) ** break;
                    ** continue;
                    return nu.notFound();
                }
lbl59:
                // 4 sources

                case 0: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocl", bnbw(int ), (int)477);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
lbl64:
                // 3 sources

                case 1: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocm", bnbw(int ), (int)478);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl69:
                // 3 sources

                case 2: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocn", bnbw(int ), (int)479);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl74:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)ev.bnbz("boco", bnbw(int ), (int)480);
                    if (!var6_2) ** GOTO lbl59
                    throw null;
                }
lbl78:
                // 2 sources

                case 4: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocp", bnbw(int ), (int)481);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl93
                }
lbl83:
                // 2 sources

                case 5: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocq", bnbw(int ), (int)482);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
                case 6: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocr", bnbw(int ), (int)483);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl93:
                // 2 sources

                case 7: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocs", bnbw(int ), (int)484);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl98:
                // 3 sources

                case 8: {
                    var5_3 /* !! */  = (int)ev.bnbz("boct", bnbw(int ), (int)485);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
                case 9: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)ev.bnbz("bocu", bnbw(int ), (int)486);
                        if (!var6_2) ** GOTO lbl78
                        throw null;
                    }
                }
lbl108:
                // 2 sources

                case 10: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocv", bnbw(int ), (int)487);
                    if (!var6_2) ** GOTO lbl69
                    throw null;
                }
lbl112:
                // 2 sources

                case 11: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocw", bnbw(int ), (int)488);
                    if (!var6_2) ** GOTO lbl83
                    throw null;
                }
                case 12: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocx", bnbw(int ), (int)489);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 13: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocy", bnbw(int ), (int)490);
                    if (!var6_2) ** GOTO lbl64
                    throw null;
                }
lbl125:
                // 2 sources

                case 14: {
                    var5_3 /* !! */  = (int)ev.bnbz("bocz", bnbw(int ), (int)491);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl129:
                // 5 sources

                case 15: {
                    var5_3 /* !! */  = (int)ev.bnbz("boda", bnbw(int ), (int)492);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl198
                }
lbl134:
                // 2 sources

                case 16: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodb", bnbw(int ), (int)493);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl138:
                // 4 sources

                case 17: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodc", bnbw(int ), (int)494);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl143:
                // 3 sources

                case 18: {
                    do {
                        var5_3 /* !! */  = (int)ev.bnbz("bodd", bnbw(int ), (int)495);
                    } while (!var6_2);
                    throw null;
                }
lbl148:
                // 3 sources

                case 19: {
                    var5_3 /* !! */  = (int)ev.bnbz("bode", bnbw(int ), (int)496);
                    if (!var6_2) ** GOTO lbl125
                    throw null;
                }
                case 20: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodf", bnbw(int ), (int)497);
                    if (!var6_2) ** GOTO lbl59
                    throw null;
                }
                case 21: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodg", bnbw(int ), (int)498);
                    if (!var6_2) ** GOTO lbl143
                    throw null;
                }
lbl160:
                // 2 sources

                case 22: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodh", bnbw(int ), (int)499);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
                case 23: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodi", bnbw(int ), (int)500);
                    if (var6_2) {
                        throw null;
                    }
                }
                case 24: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodj", bnbw(int ), (int)501);
                    if (!var6_2) ** GOTO lbl74
                    throw null;
                }
                case 25: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodk", bnbw(int ), (int)502);
                    if (!var6_2) ** GOTO lbl148
                    throw null;
                }
lbl177:
                // 3 sources

                case 26: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodl", bnbw(int ), (int)503);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
                case 27: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodm", bnbw(int ), (int)504);
                    if (!var6_2) ** GOTO lbl160
                    throw null;
                }
lbl186:
                // 2 sources

                case 28: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodn", bnbw(int ), (int)505);
                    if (!var6_2) ** GOTO lbl69
                    throw null;
                }
                case 29: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodo", bnbw(int ), (int)506);
                    if (!var6_2) ** GOTO lbl112
                    throw null;
                }
                case 30: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodp", bnbw(int ), (int)507);
                    if (!var6_2) ** GOTO lbl138
                    throw null;
                }
lbl198:
                // 2 sources

                case 31: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodq", bnbw(int ), (int)508);
                    if (!var6_2) ** GOTO lbl64
                    throw null;
                }
lbl202:
                // 4 sources

                case 32: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodr", bnbw(int ), (int)509);
                    if (!var6_2) ** GOTO lbl59
                    throw null;
                }
                case 33: {
                    var5_3 /* !! */  = (int)ev.bnbz("bods", bnbw(int ), (int)510);
                    if (!var6_2) ** GOTO lbl108
                    throw null;
                }
                case 34: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodt", bnbw(int ), (int)511);
                    if (!var6_2) ** GOTO lbl98
                    throw null;
                }
                case 35: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodu", bnbw(int ), (int)512);
                    if (!var6_2) ** GOTO lbl202
                    throw null;
                }
lbl218:
                // 2 sources

                case 36: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodv", bnbw(int ), (int)513);
                    if (!var6_2) ** GOTO lbl98
                    throw null;
                }
lbl222:
                // 2 sources

                case 37: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodw", bnbw(int ), (int)514);
                    if (!var6_2) break block45;
                    throw null;
                }
                case 38: {
                    var5_3 /* !! */  = (int)ev.bnbz("bodx", bnbw(int ), (int)515);
                    if (!var6_2) ** GOTO lbl143
                    throw null;
                }
lbl230:
                // 2 sources

                case 39: {
                    var5_3 /* !! */  = (int)ev.bnbz("body", bnbw(int ), (int)516);
                    if (!var6_2) ** GOTO lbl148
                    throw null;
                }
                case 40: 
            }
            break;
        }
        var5_3 /* !! */  = (int)ev.bnbz("bodz", bnbw(int ), (int)517);
        ** while (!var6_2)
lbl237:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void boms() {
        ev.bnct[200] = -3115090030684632450L;
        ev.bnct[201] = -8482062726163258939L;
        ev.bnct[202] = -6689995832676862007L;
        ev.bnct[203] = 7936084217135833612L;
        ev.bnct[204] = -2369660201028332062L;
        ev.bnct[205] = 1029988391889351872L;
        ev.bnct[206] = 5213310987029892933L;
        ev.bnct[207] = 1700471212562995815L;
        ev.bnct[208] = 4109130334370124569L;
        ev.bnct[209] = -4549796988303241760L;
        ev.bnct[210] = 8202457948476600273L;
        ev.bnct[211] = 7213725756148403961L;
        ev.bnct[212] = 7277003036234620576L;
        ev.bnct[213] = 6439461473880529147L;
        ev.bnct[214] = -5197134700810496152L;
        ev.bnct[215] = 8788347881689156876L;
        ev.bnct[216] = -8548046009017803954L;
        ev.bnct[217] = -730643896297232294L;
        ev.bnct[218] = -7972814758823508896L;
        ev.bnct[219] = -241093939345082537L;
        ev.bnct[220] = -8091173845415410054L;
        ev.bnct[221] = -651509369034521319L;
        ev.bnct[222] = 1006464096951092222L;
        ev.bnct[223] = -7836979166573978555L;
        ev.bnct[224] = 7223867654677771067L;
        ev.bnct[225] = -5623375953194276493L;
        ev.bnct[226] = 4234968590797898174L;
        ev.bnct[227] = -3569894009577078579L;
        ev.bnct[228] = -6871699423963432285L;
        ev.bnct[229] = 1015873203018043162L;
        ev.bnct[230] = -265371126900224007L;
        ev.bnct[231] = -4440090143677976394L;
        ev.bnct[232] = -2535334243307411864L;
        ev.bnct[233] = 7752877001184098521L;
        ev.bnct[234] = 7056545446735020315L;
        ev.bnct[235] = -8221990455571554546L;
        ev.bnct[236] = -6321566629059748172L;
        ev.bnct[237] = 461506572053325643L;
        ev.bnct[238] = 2105415349458858368L;
        ev.bnct[239] = 857838707767932736L;
        ev.bnct[240] = -5725580447725485934L;
        ev.bnct[241] = -8300149272919662065L;
        ev.bnct[242] = -4962462612096925882L;
        ev.bnct[243] = -663648826744050067L;
        ev.bnct[244] = 5091349677741878775L;
        ev.bnct[245] = 3548189013336971186L;
        ev.bnct[246] = -37142377929439679L;
        ev.bnct[247] = -5857709659935229636L;
        ev.bnct[248] = 1030339626409707573L;
        ev.bnct[249] = 441637124578169480L;
        ev.bnct[250] = 1854010260106481384L;
        ev.bnct[251] = 4865641155499327923L;
        ev.bnct[252] = -5634343073184874669L;
        ev.bnct[253] = 5472144998129082402L;
        ev.bnct[254] = 3194661263515218903L;
        ev.bnct[255] = -3230747547604554185L;
        ev.bnct[256] = -5810585397830350991L;
        ev.bnct[257] = -7433882549785514453L;
        ev.bnct[258] = -25357489115240026L;
        ev.bnct[259] = -8531226332001483302L;
        ev.bnct[260] = -8959198500572882939L;
        ev.bnct[261] = 2071610164693580559L;
        ev.bnct[262] = 2751742228973363192L;
        ev.bnct[263] = 4194099468399908304L;
        ev.bnct[264] = 8854120303095833818L;
        ev.bnct[265] = 3620099575639801067L;
        ev.bnct[266] = 606769246160795369L;
        ev.bnct[267] = 6269174714177535189L;
        ev.bnct[268] = 6454860211779927028L;
        ev.bnct[269] = -845160725232283172L;
        ev.bnct[270] = 6867048510955231071L;
        ev.bnct[271] = 2766861456520645213L;
        ev.bnct[272] = 930898480721603034L;
        ev.bnct[273] = 7576419215780991020L;
        ev.bnct[274] = 6286207437104169148L;
        ev.bnct[275] = -7440539742493306268L;
        ev.bnct[276] = -1594363426417022712L;
        ev.bnct[277] = 481373456846728071L;
        ev.bnct[278] = 6544321996573270488L;
        ev.bnct[279] = -3725276694879267562L;
        ev.bnct[280] = 8901660361519659618L;
        ev.bnct[281] = -2937295916875226193L;
        ev.bnct[282] = 2210058114184096456L;
        ev.bnct[283] = -5622313056371510826L;
        ev.bnct[284] = 6392644730344045230L;
        ev.bnct[285] = -8520639479369175292L;
        ev.bnct[286] = -3636145254264928760L;
        ev.bnct[287] = 8522099694811089497L;
        ev.bnct[288] = 5809211080488984506L;
        ev.bnct[289] = 5447274622036122892L;
    }

    private static /* synthetic */ void bomg() {
        ev.bnby[0] = -1653365271;
        ev.bnby[1] = -2009706400;
        ev.bnby[2] = 993286688;
        ev.bnby[3] = 319550883;
        ev.bnby[4] = -288904406;
        ev.bnby[5] = 1133903726;
        ev.bnby[6] = -1542656848;
        ev.bnby[7] = 1826423446;
        ev.bnby[8] = 538936490;
        ev.bnby[9] = 1224677055;
        ev.bnby[10] = 1640685750;
        ev.bnby[11] = 1634757840;
        ev.bnby[12] = 174820784;
        ev.bnby[13] = 208003364;
        ev.bnby[14] = 189392377;
        ev.bnby[15] = 1093437859;
        ev.bnby[16] = 2081826053;
        ev.bnby[17] = -1564319106;
        ev.bnby[18] = -1105970473;
        ev.bnby[19] = -2060546222;
        ev.bnby[20] = -841806504;
        ev.bnby[21] = -967196517;
        ev.bnby[22] = -933397448;
        ev.bnby[23] = 1568791491;
        ev.bnby[24] = -1402864954;
        ev.bnby[25] = 258904592;
        ev.bnby[26] = 1585269786;
        ev.bnby[27] = -1564082576;
        ev.bnby[28] = -413736445;
        ev.bnby[29] = 1519298283;
        ev.bnby[30] = 949781294;
        ev.bnby[31] = 1004900616;
        ev.bnby[32] = -599173321;
        ev.bnby[33] = 414933823;
        ev.bnby[34] = 826290498;
        ev.bnby[35] = 1862951614;
        ev.bnby[36] = 1606738818;
        ev.bnby[37] = -1680818956;
        ev.bnby[38] = -1634817177;
        ev.bnby[39] = -702910626;
        ev.bnby[40] = -2088789898;
        ev.bnby[41] = -856919898;
        ev.bnby[42] = 710812960;
        ev.bnby[43] = 2021836390;
        ev.bnby[44] = 2044687264;
        ev.bnby[45] = -1548258414;
        ev.bnby[46] = -1319713926;
        ev.bnby[47] = -1636410156;
        ev.bnby[48] = 1237302865;
        ev.bnby[49] = -939679641;
        ev.bnby[50] = 1171537649;
        ev.bnby[51] = -883151302;
        ev.bnby[52] = 1778217920;
        ev.bnby[53] = 64712283;
        ev.bnby[54] = -1758509583;
        ev.bnby[55] = -264190215;
        ev.bnby[56] = -1108750034;
        ev.bnby[57] = -952784765;
        ev.bnby[58] = 1406927769;
        ev.bnby[59] = -728121938;
        ev.bnby[60] = 1586709579;
        ev.bnby[61] = -568015260;
        ev.bnby[62] = 1193529025;
        ev.bnby[63] = 1631768555;
        ev.bnby[64] = 2118409176;
        ev.bnby[65] = 1768208841;
        ev.bnby[66] = 723273022;
        ev.bnby[67] = 602117673;
        ev.bnby[68] = 929996429;
        ev.bnby[69] = -946649642;
        ev.bnby[70] = -1730259100;
        ev.bnby[71] = 543687421;
        ev.bnby[72] = 1529965628;
        ev.bnby[73] = 2014589789;
        ev.bnby[74] = -1071380532;
        ev.bnby[75] = 2049253770;
        ev.bnby[76] = -1542763211;
        ev.bnby[77] = -434899345;
        ev.bnby[78] = 882631510;
        ev.bnby[79] = -102316234;
        ev.bnby[80] = 21386220;
        ev.bnby[81] = 546740534;
        ev.bnby[82] = 112031089;
        ev.bnby[83] = 1085942944;
        ev.bnby[84] = -711559975;
        ev.bnby[85] = -2062942206;
        ev.bnby[86] = -413516647;
        ev.bnby[87] = 202678737;
        ev.bnby[88] = -110430049;
        ev.bnby[89] = 1504696993;
        ev.bnby[90] = 1738203937;
        ev.bnby[91] = 1043648945;
        ev.bnby[92] = 1977773168;
        ev.bnby[93] = -442181902;
        ev.bnby[94] = -1554989006;
        ev.bnby[95] = 143673531;
        ev.bnby[96] = 1113765038;
        ev.bnby[97] = 848292028;
        ev.bnby[98] = 1121969426;
        ev.bnby[99] = 889598708;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareFireworkNew() {
        block71: {
            var5_1 = ev.c;
            var4_2 /* !! */  = ev.b;
            var3_3 = ev.a;
            if (var5_1) {
                throw null;
lbl6:
                // 17 sources

                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (ev.mc.field_1724.method_6128()) break block71;
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        var1_4 = this.findItemHotbar(class_1802.field_8639);
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!var1_4.found()) ** GOTO lbl30
                if (var3_3 || var3_3) ** GOTO lbl6
                this.previousSlot = ev.mc.field_1724.method_31548().method_67532();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.fireworkSlot = var1_4.slot();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.fireworkFromHotbar = ev.bnbz("bnrj", bnbw(int ), (int)296);
                if (var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl43
lbl30:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                var2_5 = this.findItem(class_1802.field_8639);
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_5.found()) ** GOTO lbl36
                if (var3_3 || var3_3) ** GOTO lbl6
                return;
lbl36:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.previousSlot = ev.mc.field_1724.method_31548().method_67532();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.fireworkSlot = var2_5.slot();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.fireworkFromHotbar = ev.bnbz("bnrk", bnbw(int ), (int)297);
                if (var3_3) ** GOTO lbl6
lbl43:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                nz.queueSwap("ElytraHelper_Firework", (int)ev.bnbz("bnrl", bnbw(int ), (int)298), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeFireworkLegit(), ()V)((ev)this), this.createSwapSettings(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, cleanupFirework(), ()V)((ev)this));
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrm", bnbw(int ), (int)299);
                if (var5_1) {
                    throw null;
                }
            }
lbl53:
            // 4 sources

            case 1: {
                do {
                    var4_2 /* !! */  = (int)ev.bnbz("bnrn", bnbw(int ), (int)300);
                } while (!var5_1);
                throw null;
            }
lbl58:
            // 5 sources

            case 2: {
                var4_2 /* !! */  = (int)ev.bnbz("bnro", bnbw(int ), (int)301);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl63:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrp", bnbw(int ), (int)302);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl68:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrq", bnbw(int ), (int)303);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrr", bnbw(int ), (int)304);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrs", bnbw(int ), (int)305);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl81:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrt", bnbw(int ), (int)306);
                if (var5_1) {
                    throw null;
                }
            }
lbl85:
            // 4 sources

            case 8: {
                var4_2 /* !! */  = (int)ev.bnbz("bnru", bnbw(int ), (int)307);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl90:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrv", bnbw(int ), (int)308);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 10: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrw", bnbw(int ), (int)309);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 11: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrx", bnbw(int ), (int)310);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 12: {
                var4_2 /* !! */  = (int)ev.bnbz("bnry", bnbw(int ), (int)311);
                if (!var5_1) ** GOTO lbl63
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)ev.bnbz("bnrz", bnbw(int ), (int)312);
                if (!var5_1) break;
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsa", bnbw(int ), (int)313);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsb", bnbw(int ), (int)314);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 16: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsc", bnbw(int ), (int)315);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl127:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsd", bnbw(int ), (int)316);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl132:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)ev.bnbz("bnse", bnbw(int ), (int)317);
                if (!var5_1) ** GOTO lbl53
                throw null;
            }
lbl136:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsf", bnbw(int ), (int)318);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
lbl140:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsg", bnbw(int ), (int)319);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
lbl144:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsh", bnbw(int ), (int)320);
                if (var5_1) {
                    throw null;
                }
            }
lbl148:
            // 6 sources

            case 22: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsi", bnbw(int ), (int)321);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl153:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsj", bnbw(int ), (int)322);
                if (var5_1) {
                    throw null;
                }
            }
            case 24: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsk", bnbw(int ), (int)323);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
lbl161:
            // 2 sources

            case 25: {
                do {
                    var4_2 /* !! */  = (int)ev.bnbz("bnsl", bnbw(int ), (int)324);
                } while (!var5_1);
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsm", bnbw(int ), (int)325);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl171:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsn", bnbw(int ), (int)326);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
lbl175:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)ev.bnbz("bnso", bnbw(int ), (int)327);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 29: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsp", bnbw(int ), (int)328);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
            case 30: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsq", bnbw(int ), (int)329);
                if (!var5_1) ** GOTO lbl68
                throw null;
            }
lbl188:
            // 2 sources

            case 31: {
                var4_2 /* !! */  = (int)ev.bnbz("bnsr", bnbw(int ), (int)330);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl192:
            // 3 sources

            case 32: {
                var4_2 /* !! */  = (int)ev.bnbz("bnss", bnbw(int ), (int)331);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
lbl196:
            // 2 sources

            case 33: {
                var4_2 /* !! */  = (int)ev.bnbz("bnst", bnbw(int ), (int)332);
                if (!var5_1) ** GOTO lbl132
                throw null;
            }
            case 34: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ev.bnbz("bnsu", bnbw(int ), (int)333);
                    if (!var5_1) ** GOTO lbl81
                    throw null;
                }
            }
            case 35: 
        }
        var4_2 /* !! */  = (int)ev.bnbz("bnsv", bnbw(int ), (int)334);
        ** while (!var5_1)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bomr() {
        ev.bnct[100] = 2715025781648423281L;
        ev.bnct[101] = 7820089403220792720L;
        ev.bnct[102] = 7580498161623393322L;
        ev.bnct[103] = 8821044210644471080L;
        ev.bnct[104] = -5680477522321105398L;
        ev.bnct[105] = 610603749806487712L;
        ev.bnct[106] = -4185485743139203623L;
        ev.bnct[107] = 854354438351185745L;
        ev.bnct[108] = -6267028361802661163L;
        ev.bnct[109] = -2169536503527798742L;
        ev.bnct[110] = 8205589916741262503L;
        ev.bnct[111] = 7135049357317569722L;
        ev.bnct[112] = 7194719596586684580L;
        ev.bnct[113] = -3853621720559799236L;
        ev.bnct[114] = -4912800651795657354L;
        ev.bnct[115] = 4756443380896740347L;
        ev.bnct[116] = -6834542183656252385L;
        ev.bnct[117] = -7911161195332320782L;
        ev.bnct[118] = -8045355703984880322L;
        ev.bnct[119] = -5027109866730580558L;
        ev.bnct[120] = -1868254577410357617L;
        ev.bnct[121] = 6638671959684330376L;
        ev.bnct[122] = -703921537533928264L;
        ev.bnct[123] = -7956538395268524578L;
        ev.bnct[124] = -165387496126569151L;
        ev.bnct[125] = 5286654807147350241L;
        ev.bnct[126] = 3236909733868657764L;
        ev.bnct[127] = -2865195033800650749L;
        ev.bnct[128] = -809853712690422389L;
        ev.bnct[129] = 5545386613946664345L;
        ev.bnct[130] = -1636040827175173504L;
        ev.bnct[131] = -8233899773177087695L;
        ev.bnct[132] = -4102385477162985530L;
        ev.bnct[133] = -6947229242347459221L;
        ev.bnct[134] = -8449374139463653344L;
        ev.bnct[135] = -831815226344465389L;
        ev.bnct[136] = -1543070654799295432L;
        ev.bnct[137] = -9020588574711876372L;
        ev.bnct[138] = 2718752025429264366L;
        ev.bnct[139] = 3431817892625374993L;
        ev.bnct[140] = 6028223700273576369L;
        ev.bnct[141] = -8518601595774374306L;
        ev.bnct[142] = 2039741889479212319L;
        ev.bnct[143] = -1459278754928692201L;
        ev.bnct[144] = 7344425487233019063L;
        ev.bnct[145] = 4008225345863956336L;
        ev.bnct[146] = 1611093087085114001L;
        ev.bnct[147] = 2346155785200568577L;
        ev.bnct[148] = -6168856112401361334L;
        ev.bnct[149] = -2330056466416750707L;
        ev.bnct[150] = 2910024404487175509L;
        ev.bnct[151] = 4050980507435895803L;
        ev.bnct[152] = -2495466285479300740L;
        ev.bnct[153] = -8363949688087150732L;
        ev.bnct[154] = 8839305433409437473L;
        ev.bnct[155] = -5362176314344349240L;
        ev.bnct[156] = 550505211240067207L;
        ev.bnct[157] = 2713464321144071614L;
        ev.bnct[158] = -5181921508097895612L;
        ev.bnct[159] = 5178411542202306978L;
        ev.bnct[160] = 6867651288303270873L;
        ev.bnct[161] = 4227051536707004379L;
        ev.bnct[162] = -2774510843614522629L;
        ev.bnct[163] = 4040962855451220906L;
        ev.bnct[164] = 1869284082982685278L;
        ev.bnct[165] = -5269699924240841394L;
        ev.bnct[166] = 6617619634002130363L;
        ev.bnct[167] = -7976498982796957161L;
        ev.bnct[168] = 140334425114709488L;
        ev.bnct[169] = 81258730106176047L;
        ev.bnct[170] = -5327364750076996137L;
        ev.bnct[171] = -3705237602458459530L;
        ev.bnct[172] = -933602875606105317L;
        ev.bnct[173] = -8603535863054690079L;
        ev.bnct[174] = 2708953352357721926L;
        ev.bnct[175] = -2385660781513549157L;
        ev.bnct[176] = -1336342902589639925L;
        ev.bnct[177] = -6379982034179455044L;
        ev.bnct[178] = -3366402773150909649L;
        ev.bnct[179] = 3849448963390428918L;
        ev.bnct[180] = 5439523178906400285L;
        ev.bnct[181] = 6336992190377850261L;
        ev.bnct[182] = -8758327962227650330L;
        ev.bnct[183] = 7595099595271127099L;
        ev.bnct[184] = 8094461117831269528L;
        ev.bnct[185] = 3572221617575928090L;
        ev.bnct[186] = 2568854552736233416L;
        ev.bnct[187] = -6679576829454462458L;
        ev.bnct[188] = 3296505011065997834L;
        ev.bnct[189] = -7259928847117735684L;
        ev.bnct[190] = -3540725760446580723L;
        ev.bnct[191] = -6504470048184145594L;
        ev.bnct[192] = 2178758672637538556L;
        ev.bnct[193] = -481098665947445516L;
        ev.bnct[194] = -5371144350065589387L;
        ev.bnct[195] = -685051429216552770L;
        ev.bnct[196] = -8496776597831196814L;
        ev.bnct[197] = 4547539336455517413L;
        ev.bnct[198] = -5588239560256627793L;
        ev.bnct[199] = 1049442685827606360L;
    }

    private static /* synthetic */ void bomi() {
        ev.bnby[200] = 759764133;
        ev.bnby[201] = 524817176;
        ev.bnby[202] = -1471599729;
        ev.bnby[203] = 286589310;
        ev.bnby[204] = 1236117978;
        ev.bnby[205] = -287492495;
        ev.bnby[206] = 1369836363;
        ev.bnby[207] = 1527206879;
        ev.bnby[208] = -522209097;
        ev.bnby[209] = -878816687;
        ev.bnby[210] = 947547868;
        ev.bnby[211] = -1056825814;
        ev.bnby[212] = -2144927046;
        ev.bnby[213] = 1177073519;
        ev.bnby[214] = 1554855557;
        ev.bnby[215] = -1205990369;
        ev.bnby[216] = 2008918693;
        ev.bnby[217] = 1382537306;
        ev.bnby[218] = -797726619;
        ev.bnby[219] = 1493843179;
        ev.bnby[220] = 1356341309;
        ev.bnby[221] = -143211534;
        ev.bnby[222] = -1438200871;
        ev.bnby[223] = -842005315;
        ev.bnby[224] = 911836239;
        ev.bnby[225] = -1577430248;
        ev.bnby[226] = 1414043423;
        ev.bnby[227] = 1377350552;
        ev.bnby[228] = -425998093;
        ev.bnby[229] = -1711014488;
        ev.bnby[230] = 1914426171;
        ev.bnby[231] = -720865942;
        ev.bnby[232] = 761467412;
        ev.bnby[233] = 169380519;
        ev.bnby[234] = 1761335837;
        ev.bnby[235] = -1050763426;
        ev.bnby[236] = 1082661422;
        ev.bnby[237] = 1727336377;
        ev.bnby[238] = -1559260413;
        ev.bnby[239] = -1698890130;
        ev.bnby[240] = -1872912551;
        ev.bnby[241] = 1113584597;
        ev.bnby[242] = -1329245924;
        ev.bnby[243] = 855440187;
        ev.bnby[244] = -628024185;
        ev.bnby[245] = -33887941;
        ev.bnby[246] = 398162030;
        ev.bnby[247] = -2121095392;
        ev.bnby[248] = 1132942089;
        ev.bnby[249] = -119139676;
        ev.bnby[250] = -1198256904;
        ev.bnby[251] = 1047201412;
        ev.bnby[252] = 1530488919;
        ev.bnby[253] = 1207112122;
        ev.bnby[254] = -1713795442;
        ev.bnby[255] = -689189834;
        ev.bnby[256] = 76423031;
        ev.bnby[257] = 2077884717;
        ev.bnby[258] = 825518256;
        ev.bnby[259] = -1064217731;
        ev.bnby[260] = 1342319406;
        ev.bnby[261] = 1878852573;
        ev.bnby[262] = 364265780;
        ev.bnby[263] = 1002604677;
        ev.bnby[264] = 894716052;
        ev.bnby[265] = 932721015;
        ev.bnby[266] = -612495399;
        ev.bnby[267] = 2010425694;
        ev.bnby[268] = 575525034;
        ev.bnby[269] = -848933092;
        ev.bnby[270] = -1176700708;
        ev.bnby[271] = -1057420772;
        ev.bnby[272] = 1070475157;
        ev.bnby[273] = 1720658782;
        ev.bnby[274] = 967771418;
        ev.bnby[275] = -1169807624;
        ev.bnby[276] = 1382075599;
        ev.bnby[277] = 2091850011;
        ev.bnby[278] = -512187180;
        ev.bnby[279] = 1446752788;
        ev.bnby[280] = 1789651453;
        ev.bnby[281] = 532255335;
        ev.bnby[282] = -1984656405;
        ev.bnby[283] = 1465782772;
        ev.bnby[284] = 1869285037;
        ev.bnby[285] = -153339074;
        ev.bnby[286] = 1565980679;
        ev.bnby[287] = 1156005057;
        ev.bnby[288] = -1105818610;
        ev.bnby[289] = 12945332;
        ev.bnby[290] = 197795822;
        ev.bnby[291] = -665988346;
        ev.bnby[292] = -2021988338;
        ev.bnby[293] = 980365287;
        ev.bnby[294] = -2033908261;
        ev.bnby[295] = 1920714649;
        ev.bnby[296] = -1522147410;
        ev.bnby[297] = 1542702960;
        ev.bnby[298] = 476500562;
        ev.bnby[299] = 604452796;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onKey(cn var1_1) {
        block98: {
            var6_2 = ev.c;
            var5_3 /* !! */  = ev.b;
            var4_4 = ev.a;
            if (var6_2) {
                throw null;
            }
            if (var4_4 || var4_4) return;
            if (ev.mc.field_1724 == null) ** GOTO lbl16
            if (var4_4) return;
            if (ev.mc.field_1755 == null) ** GOTO lbl18
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4) return;
lbl16:
                        // 2 sources

                        if (var4_4 || var4_4) return;
                        return;
                    }
lbl18:
                    // 1 sources

                    if (var4_4 || var4_4) return;
                    var2_5 = this.mode.getValue();
                    if (var4_4 || var4_4) return;
                    var3_6 = var2_5.equals("\u0411\u044b\u0441\u0442\u0440\u044b\u0439");
                    if (var4_4 || var4_4) return;
                    if (var1_1.isBindReleased(this.elytraBind)) {
                        if (var4_4 || var4_4) return;
                        if (var3_6) {
                            if (var4_4 || var4_4) return;
                            this.executeElytraSwapInstant();
                            if (var4_4) return;
                            if (var6_2) {
                                throw null;
                            }
                        } else {
                            if (var4_4 || var4_4) return;
                            if (!nz.isSwapQueued("ElytraHelper_Elytra")) {
                                if (var4_4 || var4_4) return;
                                this.prepareElytraSwapNew();
                                if (var4_4) return;
                            }
                        }
                    }
                    if (var4_4 || var4_4) return;
                    if (var1_1.isBindReleased(this.fireworkBind)) {
                        if (var4_4 || var4_4) return;
                        if (var3_6) {
                            if (var4_4 || var4_4) return;
                            this.executeFireworkInstant();
                            if (var4_4) return;
                            if (var6_2) {
                                throw null;
                            }
                        } else {
                            if (var4_4 || var4_4) return;
                            if (!nz.isSwapQueued("ElytraHelper_Firework")) {
                                if (var4_4 || var4_4) return;
                                this.prepareFireworkNew();
                                if (var4_4) return;
                            }
                        }
                    }
                    if (!var4_4 && !var4_4) return;
                    return;
                    case 0: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngn", bnbw(int ), (int)62);
                        cfr_temp_0 = 5;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngp", bnbw(int ), (int)64);
                        cfr_temp_0 = 34;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngq", bnbw(int ), (int)65);
                        cfr_temp_0 = 29;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngr", bnbw(int ), (int)66);
                        cfr_temp_0 = 31;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 5: {
                        do {
                            var5_3 /* !! */  = (int)ev.bnbz("bngs", bnbw(int ), (int)67);
                        } while (!var6_2);
                        throw null;
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngt", bnbw(int ), (int)68);
                        cfr_temp_0 = 22;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngx", bnbw(int ), (int)72);
                        cfr_temp_0 = 28;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngz", bnbw(int ), (int)74);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhb", bnbw(int ), (int)76);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhf", bnbw(int ), (int)80);
                        cfr_temp_0 = 29;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhg", bnbw(int ), (int)81);
                        if (!var6_2) ** break;
                        throw null;
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhh", bnbw(int ), (int)82);
                        cfr_temp_0 = 36;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhi", bnbw(int ), (int)83);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngu", bnbw(int ), (int)69);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 23: {
                        do {
                            var5_3 /* !! */  = (int)ev.bnbz("bnhk", bnbw(int ), (int)85);
                        } while (!var6_2);
                        throw null;
                    }
                    case 24: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhl", bnbw(int ), (int)86);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhj", bnbw(int ), (int)84);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngv", bnbw(int ), (int)70);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 28: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhp", bnbw(int ), (int)90);
                        cfr_temp_0 = 33;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 29: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhq", bnbw(int ), (int)91);
                        cfr_temp_0 = 16;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 30: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhr", bnbw(int ), (int)92);
                        cfr_temp_0 = 16;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 31: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhs", bnbw(int ), (int)93);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhm", bnbw(int ), (int)87);
                        cfr_temp_0 = 13;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 35: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhw", bnbw(int ), (int)97);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngy", bnbw(int ), (int)73);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngw", bnbw(int ), (int)71);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnha", bnbw(int ), (int)75);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhc", bnbw(int ), (int)77);
                        cfr_temp_0 = 26;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 36: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhx", bnbw(int ), (int)98);
                        cfr_temp_0 = 26;
                        if (var6_2) {
                            throw null;
                        }
                        break block98;
                    }
                    case 37: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhy", bnbw(int ), (int)99);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        do {
                            var5_3 /* !! */  = (int)ev.bnbz("bnhe", bnbw(int ), (int)79);
                        } while (!var6_2);
                        throw null;
                    }
                    case 38: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhz", bnbw(int ), (int)100);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)ev.bnbz("bngo", bnbw(int ), (int)63);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhd", bnbw(int ), (int)78);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 32: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnht", bnbw(int ), (int)94);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        do {
                            var5_3 /* !! */  = (int)ev.bnbz("bnhu", bnbw(int ), (int)95);
                        } while (!var6_2);
                        throw null;
                    }
                    case 39: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnia", bnbw(int ), (int)101);
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 26: lbl-1000:
                    // 2 sources

                    {
                        var5_3 /* !! */  = (int)ev.bnbz("bnhn", bnbw(int ), (int)88);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 27: {
                        var5_3 /* !! */  = (int)ev.bnbz("bnho", bnbw(int ), (int)89);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 34: 
                }
                break;
            }
            ** GOTO lbl252
        }
        do {
            if (true) ** continue;
lbl252:
            // 2 sources

            var5_3 /* !! */  = (int)ev.bnbz("bnhv", bnbw(int ), (int)96);
            cfr_temp_0 = 26;
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void executeFireworkLegit() {
        v0 /* !! */  = ev.dp;
        if (true) ** GOTO lbl5
        block67: while (true) {
            v0 /* !! */  = (long)(ev.bnbz("bnsx", bncr(int ), (int)97) - ev.bnbz("bnsw", bncr(int ), (int)96));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1309097994: {
                    break block67;
                }
                case 1506864454: {
                    continue block67;
                }
            }
            break;
        }
        var3_1 = ev.c;
        v1 /* !! */  = ev.dp;
        if (true) ** GOTO lbl15
        block68: while (true) {
            v1 /* !! */  = (long)(ev.bnbz("bnsz", bncr(int ), (int)99) - ev.bnbz("bnsy", bncr(int ), (int)98));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1564456877: {
                    continue block68;
                }
                case -1309097994: {
                    break block68;
                }
            }
            break;
        }
        var2_2 /* !! */  = ev.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bnta", bncr(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ev.bnbz("bntb", bnbw(int ), (int)335)) break;
            v2 /* !! */  = (long)ev.bnbz("bntc", bnbw(int ), (int)336);
        }
        var1_3 = ev.a;
        if (var3_1) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v3 /* !! */  = ev.dp;
                if (true) ** GOTO lbl40
                block71: while (true) {
                    v3 /* !! */  = (long)(ev.bnbz("bnte", bncr(int ), (int)102) - ev.bnbz("bntd", bncr(int ), (int)101));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1309097994: {
                            break block71;
                        }
                        case -66589742: {
                            continue block71;
                        }
                    }
                    break;
                }
                if (!this.fireworkFromHotbar) ** GOTO lbl120
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bntf", bncr(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ev.bnbz("bntg", bnbw(int ), (int)337)) break;
                    v4 /* !! */  = (long)ev.bnbz("bnth", bnbw(int ), (int)338);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bnti", bncr(int ), (int)104)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ev.bnbz("bntj", bnbw(int ), (int)339)) break;
                    v5 /* !! */  = (long)ev.bnbz("bntk", bnbw(int ), (int)340);
                }
                nv.selectSlot(this.fireworkSlot);
                if (var1_3 || var1_3) ** GOTO lbl29
                v6 /* !! */  = ev.dp;
                if (true) ** GOTO lbl63
                block74: while (true) {
                    v6 /* !! */  = (long)(v7 - ev.bnbz("bntl", bncr(int ), (int)105));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2098649880: {
                            v7 = ev.bnbz("bntm", bncr(int ), (int)106);
                            continue block74;
                        }
                        case -1309097994: {
                            break block74;
                        }
                        case -713061641: {
                            v7 = ev.bnbz("bntn", bncr(int ), (int)107);
                            continue block74;
                        }
                        case 376970051: {
                            v7 = ev.bnbz("bnto", bncr(int ), (int)108);
                            continue block74;
                        }
                    }
                    break;
                }
                v8 /* !! */  = ev.dp;
                if (true) ** GOTO lbl79
                block75: while (true) {
                    v8 /* !! */  = (long)(ev.bnbz("bntq", bncr(int ), (int)110) - ev.bnbz("bntp", bncr(int ), (int)109));
lbl79:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1309097994: {
                            break block75;
                        }
                        case 1234368316: {
                            continue block75;
                        }
                    }
                    break;
                }
                nv.use(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl29
                v9 /* !! */  = ev.dp;
                if (true) ** GOTO lbl90
                block76: while (true) {
                    v9 /* !! */  = (long)(v10 - ev.bnbz("bntr", bncr(int ), (int)111));
lbl90:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1309097994: {
                            break block76;
                        }
                        case 524463843: {
                            v10 = ev.bnbz("bnts", bncr(int ), (int)112);
                            continue block76;
                        }
                        case 675869850: {
                            v10 = ev.bnbz("bntt", bncr(int ), (int)113);
                            continue block76;
                        }
                        case 1574329084: {
                            v10 = ev.bnbz("bntu", bncr(int ), (int)114);
                            continue block76;
                        }
                    }
                    break;
                }
                v11 /* !! */  = ev.dp;
                if (true) ** GOTO lbl106
                block77: while (true) {
                    v11 /* !! */  = (long)(v12 - ev.bnbz("bntv", bncr(int ), (int)115));
lbl106:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1309097994: {
                            break block77;
                        }
                        case -999355495: {
                            v12 = ev.bnbz("bntw", bncr(int ), (int)116);
                            continue block77;
                        }
                        case 1728131348: {
                            v12 = ev.bnbz("bntx", bncr(int ), (int)117);
                            continue block77;
                        }
                    }
                    break;
                }
                nv.selectSlot(this.previousSlot);
                if (var1_3) ** GOTO lbl29
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl186
lbl120:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v13 /* !! */  = ev.dp;
                if (true) ** GOTO lbl125
                block78: while (true) {
                    v13 /* !! */  = (long)(v14 - ev.bnbz("bnty", bncr(int ), (int)118));
lbl125:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1309097994: {
                            break block78;
                        }
                        case -641059833: {
                            v14 = ev.bnbz("bntz", bncr(int ), (int)119);
                            continue block78;
                        }
                        case 474093068: {
                            v14 = ev.bnbz("bnua", bncr(int ), (int)120);
                            continue block78;
                        }
                        case 1542765850: {
                            v14 = ev.bnbz("bnub", bncr(int ), (int)121);
                            continue block78;
                        }
                    }
                    break;
                }
                v15 /* !! */  = ev.dp;
                if (true) ** GOTO lbl141
                block79: while (true) {
                    v15 /* !! */  = (long)(v16 - ev.bnbz("bnuc", bncr(int ), (int)122));
lbl141:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1309097994: {
                            break block79;
                        }
                        case 998760097: {
                            v16 = ev.bnbz("bnud", bncr(int ), (int)123);
                            continue block79;
                        }
                        case 1367436517: {
                            v16 = ev.bnbz("bnue", bncr(int ), (int)124);
                            continue block79;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bnuf", bncr(int ), (int)125)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ev.bnbz("bnug", bnbw(int ), (int)341)) break;
                    v17 /* !! */  = (long)ev.bnbz("bnuh", bnbw(int ), (int)342);
                }
                nv.swapHotbar(this.fireworkSlot, this.previousSlot);
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bnui", bncr(int ), (int)126)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ev.bnbz("bnuj", bnbw(int ), (int)343)) break;
                    v18 /* !! */  = (long)ev.bnbz("bnuk", bnbw(int ), (int)344);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = ev.dp - ev.bnbz("bnul", bncr(int ), (int)127)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ev.bnbz("bnum", bnbw(int ), (int)345)) break;
                    v19 /* !! */  = (long)ev.bnbz("bnun", bnbw(int ), (int)346);
                }
                nv.use(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = ev.dp - ev.bnbz("bnuo", bncr(int ), (int)128)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ev.bnbz("bnup", bnbw(int ), (int)347)) break;
                    v20 /* !! */  = (long)ev.bnbz("bnuq", bnbw(int ), (int)348);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = ev.dp - ev.bnbz("bnur", bncr(int ), (int)129)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ev.bnbz("bnus", bnbw(int ), (int)349)) break;
                    v21 /* !! */  = (long)ev.bnbz("bnut", bnbw(int ), (int)350);
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_8 = ev.dp - ev.bnbz("bnuu", bncr(int ), (int)130)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ev.bnbz("bnuv", bnbw(int ), (int)351)) break;
                    v22 /* !! */  = (long)ev.bnbz("bnuw", bnbw(int ), (int)352);
                }
                nv.swapHotbar(this.fireworkSlot, this.previousSlot);
                if (var1_3) ** GOTO lbl29
lbl186:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ev.bnbz("bnux", bnbw(int ), (int)353);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 1: {
                var2_2 /* !! */  = (int)ev.bnbz("bnuy", bnbw(int ), (int)354);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl199:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ev.bnbz("bnuz", bnbw(int ), (int)355);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl215
                    break;
                }
            }
lbl205:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ev.bnbz("bnva", bnbw(int ), (int)356);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 4: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvb", bnbw(int ), (int)357);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl215:
            // 6 sources

            case 5: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvc", bnbw(int ), (int)358);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 6: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvd", bnbw(int ), (int)359);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl225:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ev.bnbz("bnve", bnbw(int ), (int)360);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvf", bnbw(int ), (int)361);
                if (!var3_1) break;
                throw null;
            }
lbl233:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvg", bnbw(int ), (int)362);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 10: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvh", bnbw(int ), (int)363);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
lbl242:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvi", bnbw(int ), (int)364);
                if (!var3_1) ** GOTO lbl225
                throw null;
            }
lbl246:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvj", bnbw(int ), (int)365);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl251:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvk", bnbw(int ), (int)366);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvl", bnbw(int ), (int)367);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvm", bnbw(int ), (int)368);
                if (!var3_1) ** GOTO lbl225
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvn", bnbw(int ), (int)369);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl267:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvo", bnbw(int ), (int)370);
                if (!var3_1) break;
                throw null;
            }
lbl271:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvp", bnbw(int ), (int)371);
                if (!var3_1) ** GOTO lbl242
                throw null;
            }
lbl275:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)ev.bnbz("bnvq", bnbw(int ), (int)372);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
            case 20: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("bnvr", bnbw(int ), (int)373);
        ** while (!var3_1)
lbl282:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bolz() {
        ev.bnbx[0] = -1653365272;
        ev.bnbx[1] = 2009706399;
        ev.bnbx[2] = -993286689;
        ev.bnbx[3] = 319550883;
        ev.bnbx[4] = 288904405;
        ev.bnbx[5] = 1133903727;
        ev.bnbx[6] = -1542656839;
        ev.bnbx[7] = 1826423447;
        ev.bnbx[8] = 538936492;
        ev.bnbx[9] = 1224677055;
        ev.bnbx[10] = 1640685749;
        ev.bnbx[11] = 1634757845;
        ev.bnbx[12] = 174820789;
        ev.bnbx[13] = 208003363;
        ev.bnbx[14] = 189392370;
        ev.bnbx[15] = 1093437863;
        ev.bnbx[16] = 2081826050;
        ev.bnbx[17] = -1564319105;
        ev.bnbx[18] = 1777006529;
        ev.bnbx[19] = 2060546221;
        ev.bnbx[20] = -2124343643;
        ev.bnbx[21] = -967196518;
        ev.bnbx[22] = 1899044828;
        ev.bnbx[23] = 1568791490;
        ev.bnbx[24] = -570754515;
        ev.bnbx[25] = 258904593;
        ev.bnbx[26] = 990320058;
        ev.bnbx[27] = -1564082575;
        ev.bnbx[28] = -413736446;
        ev.bnbx[29] = 706379457;
        ev.bnbx[30] = 949781295;
        ev.bnbx[31] = 425782388;
        ev.bnbx[32] = -599173322;
        ev.bnbx[33] = 1920537096;
        ev.bnbx[34] = 826290507;
        ev.bnbx[35] = 1862951598;
        ev.bnbx[36] = 1606738840;
        ev.bnbx[37] = -1680818972;
        ev.bnbx[38] = -1634817162;
        ev.bnbx[39] = -702910647;
        ev.bnbx[40] = -2088789895;
        ev.bnbx[41] = -856919899;
        ev.bnbx[42] = 710812969;
        ev.bnbx[43] = 2021836398;
        ev.bnbx[44] = 2044687267;
        ev.bnbx[45] = -1548258432;
        ev.bnbx[46] = -1319713949;
        ev.bnbx[47] = -1636410172;
        ev.bnbx[48] = 1237302878;
        ev.bnbx[49] = -939679620;
        ev.bnbx[50] = 1171537653;
        ev.bnbx[51] = -883151308;
        ev.bnbx[52] = 1778217924;
        ev.bnbx[53] = 64712273;
        ev.bnbx[54] = -1758509595;
        ev.bnbx[55] = -264190216;
        ev.bnbx[56] = -1108750048;
        ev.bnbx[57] = -952784760;
        ev.bnbx[58] = 1406927761;
        ev.bnbx[59] = -728121945;
        ev.bnbx[60] = 1586709592;
        ev.bnbx[61] = -568015247;
        ev.bnbx[62] = 1193529043;
        ev.bnbx[63] = 1631768549;
        ev.bnbx[64] = 2118409163;
        ev.bnbx[65] = 1768208858;
        ev.bnbx[66] = 723273017;
        ev.bnbx[67] = 602117686;
        ev.bnbx[68] = 929996426;
        ev.bnbx[69] = -946649635;
        ev.bnbx[70] = -1730259101;
        ev.bnbx[71] = 543687384;
        ev.bnbx[72] = 1529965619;
        ev.bnbx[73] = 2014589822;
        ev.bnbx[74] = -1071380500;
        ev.bnbx[75] = 2049253767;
        ev.bnbx[76] = -1542763207;
        ev.bnbx[77] = -434899377;
        ev.bnbx[78] = 882631500;
        ev.bnbx[79] = -102316255;
        ev.bnbx[80] = 21386238;
        ev.bnbx[81] = 546740529;
        ev.bnbx[82] = 112031099;
        ev.bnbx[83] = 1085942945;
        ev.bnbx[84] = -711559978;
        ev.bnbx[85] = -2062942193;
        ev.bnbx[86] = -413516667;
        ev.bnbx[87] = 202678744;
        ev.bnbx[88] = -110430061;
        ev.bnbx[89] = 1504697020;
        ev.bnbx[90] = 1738203904;
        ev.bnbx[91] = 1043648951;
        ev.bnbx[92] = 1977773167;
        ev.bnbx[93] = -442181907;
        ev.bnbx[94] = -1554989007;
        ev.bnbx[95] = 143673497;
        ev.bnbx[96] = 1113765024;
        ev.bnbx[97] = 848292018;
        ev.bnbx[98] = 1121969426;
        ev.bnbx[99] = 889598716;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findItemHotbar(class_1792 var1_1) {
        block112: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("boes", bncr(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ev.bnbz("boet", bnbw(int ), (int)528)) break;
                v0 /* !! */  = (long)ev.bnbz("boeu", bnbw(int ), (int)529);
            }
            var6_2 = ev.c;
            v1 /* !! */  = ev.dp;
            if (true) ** GOTO lbl11
            block76: while (true) {
                v1 /* !! */  = (long)(v2 - ev.bnbz("boev", bncr(int ), (int)211));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1309097994: {
                        break block76;
                    }
                    case -994264406: {
                        v2 = ev.bnbz("boew", bncr(int ), (int)212);
                        continue block76;
                    }
                    case 719974372: {
                        v2 = ev.bnbz("boex", bncr(int ), (int)213);
                        continue block76;
                    }
                }
                break;
            }
            var5_3 /* !! */  = ev.b;
            v3 /* !! */  = ev.dp;
            if (true) ** GOTO lbl25
            block77: while (true) {
                v3 /* !! */  = (long)(v4 - ev.bnbz("boey", bncr(int ), (int)214));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1309097994: {
                        break block77;
                    }
                    case -335983433: {
                        v4 = ev.bnbz("boez", bncr(int ), (int)215);
                        continue block77;
                    }
                    case 2125338996: {
                        v4 = ev.bnbz("bofa", bncr(int ), (int)216);
                        continue block77;
                    }
                }
                break;
            }
            var4_4 = ev.a;
            if (var6_2) {
                throw null;
lbl37:
                // 12 sources

                return null;
            }
            if (var4_4 || var4_4) ** GOTO lbl37
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("bofb", bncr(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ev.bnbz("bofc", bnbw(int ), (int)530)) break;
                v5 /* !! */  = (long)ev.bnbz("bofd", bnbw(int ), (int)531);
            }
            v6 /* !! */  = ev.dp;
            if (true) ** GOTO lbl49
            block80: while (true) {
                v6 /* !! */  = (long)(v7 - ev.bnbz("bofe", bncr(int ), (int)218));
lbl49:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1627577687: {
                        v7 = ev.bnbz("boff", bncr(int ), (int)219);
                        continue block80;
                    }
                    case -1309097994: {
                        break block80;
                    }
                    case 1637007130: {
                        v7 = ev.bnbz("bofg", bncr(int ), (int)220);
                        continue block80;
                    }
                }
                break;
            }
            if (ev.mc.field_1724 != null) break block112;
            if (var4_4 || var4_4) ** GOTO lbl37
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("bofh", bncr(int ), (int)221)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ev.bnbz("bofi", bnbw(int ), (int)532)) break;
                v8 /* !! */  = (long)ev.bnbz("bofj", bnbw(int ), (int)533);
            }
            return nu.notFound();
        }
        if (var4_4 || var4_4) ** GOTO lbl37
        var2_5 = ev.bnbz("bofk", bnbw(int ), (int)534);
        if (var4_4) ** GOTO lbl37
        block82: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl37
            if (var2_5 >= ev.bnbz("bofl", bnbw(int ), (int)535)) ** GOTO lbl175
            if (var4_4 || var4_4) ** GOTO lbl37
            v9 /* !! */  = ev.dp;
            if (true) ** GOTO lbl78
            block83: while (true) {
                v9 /* !! */  = (long)(v10 - ev.bnbz("bofm", bncr(int ), (int)222));
lbl78:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1309097994: {
                        break block83;
                    }
                    case 458902197: {
                        v10 = ev.bnbz("bofn", bncr(int ), (int)223);
                        continue block83;
                    }
                    case 1067556303: {
                        v10 = ev.bnbz("bofo", bncr(int ), (int)224);
                        continue block83;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = ev.dp - ev.bnbz("bofp", bncr(int ), (int)225)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ev.bnbz("bofq", bnbw(int ), (int)536)) break;
                v11 /* !! */  = (long)ev.bnbz("bofr", bnbw(int ), (int)537);
            }
            v12 = ev.mc.field_1724;
            v13 /* !! */  = ev.dp;
            if (true) ** GOTO lbl97
            block85: while (true) {
                v13 /* !! */  = (long)(v14 - ev.bnbz("bofs", bncr(int ), (int)226));
lbl97:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1309097994: {
                        break block85;
                    }
                    case -1285537684: {
                        v14 = ev.bnbz("boft", bncr(int ), (int)227);
                        continue block85;
                    }
                    case -570883636: {
                        v14 = ev.bnbz("bofu", bncr(int ), (int)228);
                        continue block85;
                    }
                }
                break;
            }
            v15 = v12.method_31548();
            v16 /* !! */  = ev.dp;
            if (true) ** GOTO lbl111
            block86: while (true) {
                v16 /* !! */  = (long)(v17 - ev.bnbz("bofv", bncr(int ), (int)229));
lbl111:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -2061857015: {
                        v17 = ev.bnbz("bofw", bncr(int ), (int)230);
                        continue block86;
                    }
                    case -1808290676: {
                        v17 = ev.bnbz("bofx", bncr(int ), (int)231);
                        continue block86;
                    }
                    case -1443642821: {
                        v17 = ev.bnbz("bofy", bncr(int ), (int)232);
                        continue block86;
                    }
                    case -1309097994: {
                        break block86;
                    }
                }
                break;
            }
            var3_6 = v15.method_5438((int)var2_5);
            if (var4_4 || var4_4) ** GOTO lbl37
            v18 /* !! */  = ev.dp;
            if (true) ** GOTO lbl129
            block87: while (true) {
                v18 /* !! */  = (long)(v19 - ev.bnbz("bofz", bncr(int ), (int)233));
lbl129:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1309097994: {
                        break block87;
                    }
                    case -1291763598: {
                        v19 = ev.bnbz("boga", bncr(int ), (int)234);
                        continue block87;
                    }
                    case 215778316: {
                        v19 = ev.bnbz("bogb", bncr(int ), (int)235);
                        continue block87;
                    }
                }
                break;
            }
            if (var3_6.method_7960()) ** GOTO lbl170
            if (var4_4) ** GOTO lbl37
            v20 /* !! */  = ev.dp;
            if (true) ** GOTO lbl144
            block88: while (true) {
                v20 /* !! */  = (long)(ev.bnbz("bogd", bncr(int ), (int)237) - ev.bnbz("bogc", bncr(int ), (int)236));
lbl144:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1309097994: {
                        break block88;
                    }
                    case -79439485: {
                        continue block88;
                    }
                }
                break;
            }
            if (var3_6.method_7909() != var1_1) ** GOTO lbl170
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4 || var4_4) ** GOTO lbl37
                    v21 /* !! */  = ev.dp;
                    if (true) ** GOTO lbl158
                    block89: while (true) {
                        v21 /* !! */  = (long)(ev.bnbz("bogf", bncr(int ), (int)239) - ev.bnbz("boge", bncr(int ), (int)238));
lbl158:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1309097994: {
                                break block89;
                            }
                            case -907607471: {
                                continue block89;
                            }
                        }
                        break;
                    }
                    v22 = ev.bnbz("bogg", bnbw(int ), (int)538);
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_4 = ev.dp - ev.bnbz("bogh", bncr(int ), (int)240)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == ev.bnbz("bogi", bnbw(int ), (int)539)) break;
                        v23 /* !! */  = (long)ev.bnbz("bogj", bnbw(int ), (int)540);
                    }
                    return new nu((int)var2_5, (boolean)v22, var3_6);
                }
lbl170:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl37
                ++var2_5;
                if (var4_4) ** GOTO lbl37
                if (!var6_2) continue block82;
                throw null;
lbl175:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v24 /* !! */  = ev.dp;
                if (true) ** GOTO lbl181
                block91: while (true) {
                    v24 /* !! */  = (long)(ev.bnbz("bogl", bncr(int ), (int)242) - ev.bnbz("bogk", bncr(int ), (int)241));
lbl181:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1309097994: {
                            break block91;
                        }
                        case 670578578: {
                            continue block91;
                        }
                    }
                    break;
                }
                return nu.notFound();
                case 0: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogm", bnbw(int ), (int)541);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl226
                }
lbl192:
                // 2 sources

                case 1: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogn", bnbw(int ), (int)542);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl197:
                // 5 sources

                case 2: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogo", bnbw(int ), (int)543);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl202:
                // 3 sources

                case 3: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogp", bnbw(int ), (int)544);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl207:
                // 3 sources

                case 4: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogq", bnbw(int ), (int)545);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl212:
                // 2 sources

                case 5: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogr", bnbw(int ), (int)546);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
                case 6: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogs", bnbw(int ), (int)547);
                    if (!var6_2) ** GOTO lbl207
                    throw null;
                }
lbl221:
                // 3 sources

                case 7: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogt", bnbw(int ), (int)548);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
lbl226:
                // 2 sources

                case 8: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogu", bnbw(int ), (int)549);
                    if (!var6_2) ** GOTO lbl212
                    throw null;
                }
                case 9: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogv", bnbw(int ), (int)550);
                    if (!var6_2) ** GOTO lbl202
                    throw null;
                }
lbl234:
                // 4 sources

                case 10: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogw", bnbw(int ), (int)551);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
                case 11: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogx", bnbw(int ), (int)552);
                    if (!var6_2) ** GOTO lbl197
                    throw null;
                }
lbl243:
                // 2 sources

                case 12: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogy", bnbw(int ), (int)553);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl247:
                // 4 sources

                case 13: {
                    var5_3 /* !! */  = (int)ev.bnbz("bogz", bnbw(int ), (int)554);
                    if (!var6_2) ** GOTO lbl234
                    throw null;
                }
                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)ev.bnbz("boha", bnbw(int ), (int)555);
                        if (!var6_2) ** GOTO lbl243
                        throw null;
                    }
                }
                case 15: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohb", bnbw(int ), (int)556);
                    if (!var6_2) ** GOTO lbl207
                    throw null;
                }
                case 16: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohc", bnbw(int ), (int)557);
                    if (!var6_2) ** GOTO lbl197
                    throw null;
                }
lbl264:
                // 3 sources

                case 17: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohd", bnbw(int ), (int)558);
                    if (!var6_2) ** GOTO lbl247
                    throw null;
                }
                case 18: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohe", bnbw(int ), (int)559);
                    if (!var6_2) ** GOTO lbl221
                    throw null;
                }
                case 19: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohf", bnbw(int ), (int)560);
                    if (!var6_2) ** GOTO lbl234
                    throw null;
                }
lbl276:
                // 2 sources

                case 20: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohg", bnbw(int ), (int)561);
                    if (!var6_2) ** GOTO lbl197
                    throw null;
                }
                case 21: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohh", bnbw(int ), (int)562);
                    if (!var6_2) ** GOTO lbl192
                    throw null;
                }
lbl284:
                // 2 sources

                case 22: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohi", bnbw(int ), (int)563);
                    if (!var6_2) ** GOTO lbl197
                    throw null;
                }
lbl288:
                // 2 sources

                case 23: {
                    var5_3 /* !! */  = (int)ev.bnbz("bohj", bnbw(int ), (int)564);
                    if (!var6_2) ** GOTO lbl234
                    throw null;
                }
                case 24: 
            }
            break;
        }
        var5_3 /* !! */  = (int)ev.bnbz("bohk", bnbw(int ), (int)565);
        ** while (!var6_2)
lbl295:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nu findChestplate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("boea", bncr(int ), (int)202)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ev.bnbz("boeb", bnbw(int ), (int)518)) break;
            v0 /* !! */  = (long)ev.bnbz("boec", bnbw(int ), (int)519);
        }
        var3_1 = ev.c;
        v1 /* !! */  = ev.dp;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - ev.bnbz("boed", bncr(int ), (int)203));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1309097994: {
                    break block16;
                }
                case -463294836: {
                    v2 = ev.bnbz("boee", bncr(int ), (int)204);
                    continue block16;
                }
                case 316686377: {
                    v2 = ev.bnbz("boef", bncr(int ), (int)205);
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = ev.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ev.dp;
                if (true) ** GOTO lbl28
                block17: while (true) {
                    v3 /* !! */  = (long)(ev.bnbz("boeh", bncr(int ), (int)207) - ev.bnbz("boeg", bncr(int ), (int)206));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1309097994: {
                            break block17;
                        }
                        case 1269013088: {
                            continue block17;
                        }
                    }
                    break;
                }
                var1_3 = ev.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ev.dp - ev.bnbz("boei", bncr(int ), (int)208)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ev.bnbz("boej", bnbw(int ), (int)520)) break;
                    v4 /* !! */  = (long)ev.bnbz("boek", bnbw(int ), (int)521);
                }
                v5 = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findChestplate$1(net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ev.dp - ev.bnbz("boel", bncr(int ), (int)209)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ev.bnbz("boem", bnbw(int ), (int)522)) break;
                    v6 /* !! */  = (long)ev.bnbz("boen", bnbw(int ), (int)523);
                }
                return this.findItem(v5);
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ev.bnbz("boeo", bnbw(int ), (int)524);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ev.bnbz("boep", bnbw(int ), (int)525);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ev.bnbz("boeq", bnbw(int ), (int)526);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ev.bnbz("boer", bnbw(int ), (int)527);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bome() {
        ev.bnbx[500] = -56794712;
        ev.bnbx[501] = -247295375;
        ev.bnbx[502] = 783339596;
        ev.bnbx[503] = 935959299;
        ev.bnbx[504] = -2137275542;
        ev.bnbx[505] = 1848919593;
        ev.bnbx[506] = -1111278710;
        ev.bnbx[507] = -873657573;
        ev.bnbx[508] = -281827010;
        ev.bnbx[509] = -1089118974;
        ev.bnbx[510] = 1401886658;
        ev.bnbx[511] = -1014259519;
        ev.bnbx[512] = 849485834;
        ev.bnbx[513] = -2105463605;
        ev.bnbx[514] = 1149921675;
        ev.bnbx[515] = 1449886888;
        ev.bnbx[516] = -291935600;
        ev.bnbx[517] = -1533749737;
        ev.bnbx[518] = 935730919;
        ev.bnbx[519] = -1432391440;
        ev.bnbx[520] = 1799834510;
        ev.bnbx[521] = 397542124;
        ev.bnbx[522] = 419593103;
        ev.bnbx[523] = -1333965695;
        ev.bnbx[524] = 1059262153;
        ev.bnbx[525] = 826661169;
        ev.bnbx[526] = -1886005340;
        ev.bnbx[527] = 1778379040;
        ev.bnbx[528] = 845990920;
        ev.bnbx[529] = -1117945444;
        ev.bnbx[530] = 213467663;
        ev.bnbx[531] = 712428571;
        ev.bnbx[532] = -1064316382;
        ev.bnbx[533] = -259776404;
        ev.bnbx[534] = -1668855772;
        ev.bnbx[535] = 845752276;
        ev.bnbx[536] = -1473104177;
        ev.bnbx[537] = 710606004;
        ev.bnbx[538] = -1153053317;
        ev.bnbx[539] = 88780018;
        ev.bnbx[540] = 1007989724;
        ev.bnbx[541] = -1163768220;
        ev.bnbx[542] = -1339056797;
        ev.bnbx[543] = 757042040;
        ev.bnbx[544] = -113822625;
        ev.bnbx[545] = 1613949804;
        ev.bnbx[546] = -1385148860;
        ev.bnbx[547] = -21743997;
        ev.bnbx[548] = 293017518;
        ev.bnbx[549] = 1243855589;
        ev.bnbx[550] = 800645178;
        ev.bnbx[551] = 1104527863;
        ev.bnbx[552] = -268762251;
        ev.bnbx[553] = -533016751;
        ev.bnbx[554] = -197212622;
        ev.bnbx[555] = 1238309766;
        ev.bnbx[556] = -54854560;
        ev.bnbx[557] = 348095323;
        ev.bnbx[558] = -1225324405;
        ev.bnbx[559] = -1485132898;
        ev.bnbx[560] = -2089726679;
        ev.bnbx[561] = -116483114;
        ev.bnbx[562] = 743673238;
        ev.bnbx[563] = 1188717415;
        ev.bnbx[564] = -460422056;
        ev.bnbx[565] = -1592665673;
        ev.bnbx[566] = 863777389;
        ev.bnbx[567] = -1376999679;
        ev.bnbx[568] = -431331002;
        ev.bnbx[569] = 682247933;
        ev.bnbx[570] = -1211049679;
        ev.bnbx[571] = -7895147;
        ev.bnbx[572] = -1804118549;
        ev.bnbx[573] = -1032196402;
        ev.bnbx[574] = 1206465243;
        ev.bnbx[575] = -433564718;
        ev.bnbx[576] = -2102931596;
        ev.bnbx[577] = 1523462512;
        ev.bnbx[578] = 1647062236;
        ev.bnbx[579] = -417180915;
        ev.bnbx[580] = 1469683054;
        ev.bnbx[581] = 487718108;
        ev.bnbx[582] = 1079271197;
        ev.bnbx[583] = -1384632217;
        ev.bnbx[584] = 1754399973;
        ev.bnbx[585] = 2076001018;
        ev.bnbx[586] = 1285587090;
        ev.bnbx[587] = -1763076968;
        ev.bnbx[588] = 698739606;
        ev.bnbx[589] = 900823548;
        ev.bnbx[590] = -1746938009;
        ev.bnbx[591] = -1331155517;
        ev.bnbx[592] = 1557025655;
        ev.bnbx[593] = -627472672;
        ev.bnbx[594] = 1727484466;
        ev.bnbx[595] = -1220895502;
        ev.bnbx[596] = -813611202;
        ev.bnbx[597] = 1414188131;
        ev.bnbx[598] = 975833115;
        ev.bnbx[599] = -1134071733;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareElytraSwapNew() {
        block63: {
            block64: {
                var6_1 = ev.c;
                var5_2 /* !! */  = ev.b;
                var4_3 = ev.a;
                if (var6_1) {
                    throw null;
lbl6:
                    // 16 sources

                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = ev.mc.field_1724.method_6118(class_1304.field_6174).method_7909();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var1_4 != class_1802.field_8833) break block63;
                if (var4_3 || var4_3) ** GOTO lbl6
                var3_5 = this.findChestplate();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var3_5.found()) break block64;
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            var2_7 = var3_5.slot();
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var6_1) {
                throw null;
            }
            ** GOTO lbl39
        }
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                var3_6 = this.findItem(class_1802.field_8833);
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var3_6.found()) ** GOTO lbl36
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
lbl36:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                var2_7 = var3_6.slot();
                if (var4_3) ** GOTO lbl6
lbl39:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.elytraTargetSlot = var2_7;
                if (var4_3 || var4_3) ** GOTO lbl6
                nz.queueSwap("ElytraHelper_Elytra", (int)ev.bnbz("bnnl", bnbw(int ), (int)219), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, executeChestSwapLegit(), ()V)((ev)this), this.createSwapSettings(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, cleanupElytra(), ()V)((ev)this));
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnm", bnbw(int ), (int)220);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 1: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnn", bnbw(int ), (int)221);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var5_2 /* !! */  = (int)ev.bnbz("bnno", bnbw(int ), (int)222);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl62:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnp", bnbw(int ), (int)223);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 4: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnq", bnbw(int ), (int)224);
                if (!var6_1) break;
                throw null;
            }
            case 5: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnr", bnbw(int ), (int)225);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl76:
            // 3 sources

            case 6: {
                var5_2 /* !! */  = (int)ev.bnbz("bnns", bnbw(int ), (int)226);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl81:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnt", bnbw(int ), (int)227);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl86:
            // 4 sources

            case 8: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnu", bnbw(int ), (int)228);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 9: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnv", bnbw(int ), (int)229);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl96:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnw", bnbw(int ), (int)230);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 11: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnx", bnbw(int ), (int)231);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl106:
            // 3 sources

            case 12: {
                var5_2 /* !! */  = (int)ev.bnbz("bnny", bnbw(int ), (int)232);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl111:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)ev.bnbz("bnnz", bnbw(int ), (int)233);
                if (!var6_1) break;
                throw null;
            }
lbl115:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ev.bnbz("bnoa", bnbw(int ), (int)234);
                    if (!var6_1) ** GOTO lbl96
                    throw null;
                }
            }
lbl120:
            // 6 sources

            case 15: {
                var5_2 /* !! */  = (int)ev.bnbz("bnob", bnbw(int ), (int)235);
                if (!var6_1) ** GOTO lbl86
                throw null;
            }
            case 16: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoc", bnbw(int ), (int)236);
                if (!var6_1) ** GOTO lbl106
                throw null;
            }
lbl128:
            // 2 sources

            case 17: {
                var5_2 /* !! */  = (int)ev.bnbz("bnod", bnbw(int ), (int)237);
                if (!var6_1) ** GOTO lbl120
                throw null;
            }
lbl132:
            // 5 sources

            case 18: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoe", bnbw(int ), (int)238);
                if (!var6_1) ** GOTO lbl86
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)ev.bnbz("bnof", bnbw(int ), (int)239);
                if (!var6_1) ** GOTO lbl132
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)ev.bnbz("bnog", bnbw(int ), (int)240);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 21: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoh", bnbw(int ), (int)241);
                if (!var6_1) ** GOTO lbl132
                throw null;
            }
lbl149:
            // 3 sources

            case 22: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoi", bnbw(int ), (int)242);
                if (!var6_1) ** GOTO lbl132
                throw null;
            }
lbl153:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoj", bnbw(int ), (int)243);
                if (!var6_1) ** GOTO lbl149
                throw null;
            }
lbl157:
            // 3 sources

            case 24: {
                var5_2 /* !! */  = (int)ev.bnbz("bnok", bnbw(int ), (int)244);
                if (!var6_1) ** GOTO lbl86
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)ev.bnbz("bnol", bnbw(int ), (int)245);
                if (!var6_1) ** GOTO lbl76
                throw null;
            }
lbl165:
            // 3 sources

            case 26: {
                var5_2 /* !! */  = (int)ev.bnbz("bnom", bnbw(int ), (int)246);
                if (!var6_1) ** GOTO lbl106
                throw null;
            }
lbl169:
            // 2 sources

            case 27: {
                var5_2 /* !! */  = (int)ev.bnbz("bnon", bnbw(int ), (int)247);
                if (!var6_1) ** GOTO lbl165
                throw null;
            }
            case 28: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoo", bnbw(int ), (int)248);
                if (!var6_1) ** GOTO lbl132
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)ev.bnbz("bnop", bnbw(int ), (int)249);
                if (!var6_1) ** GOTO lbl62
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)ev.bnbz("bnoq", bnbw(int ), (int)250);
                if (!var6_1) ** GOTO lbl81
                throw null;
            }
            case 31: {
                var5_2 /* !! */  = (int)ev.bnbz("bnor", bnbw(int ), (int)251);
                if (!var6_1) ** GOTO lbl169
                throw null;
            }
            case 32: 
        }
        var5_2 /* !! */  = (int)ev.bnbz("bnos", bnbw(int ), (int)252);
        ** while (!var6_1)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bomh() {
        ev.bnby[100] = -1160960554;
        ev.bnby[101] = -648168773;
        ev.bnby[102] = 291555225;
        ev.bnby[103] = -451306244;
        ev.bnby[104] = 467347019;
        ev.bnby[105] = 1714848874;
        ev.bnby[106] = -1718987136;
        ev.bnby[107] = 179302311;
        ev.bnby[108] = -1474972327;
        ev.bnby[109] = -808700782;
        ev.bnby[110] = -689656313;
        ev.bnby[111] = -1068965691;
        ev.bnby[112] = -1211708443;
        ev.bnby[113] = 1875341196;
        ev.bnby[114] = -927498496;
        ev.bnby[115] = -1153601576;
        ev.bnby[116] = 844733846;
        ev.bnby[117] = 135026667;
        ev.bnby[118] = -370121271;
        ev.bnby[119] = -1897634380;
        ev.bnby[120] = -555083158;
        ev.bnby[121] = -929060839;
        ev.bnby[122] = 2080272578;
        ev.bnby[123] = 59400333;
        ev.bnby[124] = -565935772;
        ev.bnby[125] = -395746670;
        ev.bnby[126] = -129654357;
        ev.bnby[127] = 148371798;
        ev.bnby[128] = -277112275;
        ev.bnby[129] = 2130923489;
        ev.bnby[130] = 1331328694;
        ev.bnby[131] = -952776943;
        ev.bnby[132] = -1783036424;
        ev.bnby[133] = -918938972;
        ev.bnby[134] = 1052771410;
        ev.bnby[135] = -2118748831;
        ev.bnby[136] = 660634048;
        ev.bnby[137] = 0x57775559;
        ev.bnby[138] = -1946168650;
        ev.bnby[139] = 459128900;
        ev.bnby[140] = 1768104812;
        ev.bnby[141] = -716540473;
        ev.bnby[142] = 378160025;
        ev.bnby[143] = -1063766362;
        ev.bnby[144] = 2076164382;
        ev.bnby[145] = -571022552;
        ev.bnby[146] = 1075450436;
        ev.bnby[147] = -1975062469;
        ev.bnby[148] = 1112245360;
        ev.bnby[149] = -1864642019;
        ev.bnby[150] = -914738568;
        ev.bnby[151] = 1987071119;
        ev.bnby[152] = -1844484607;
        ev.bnby[153] = 820603873;
        ev.bnby[154] = 881867151;
        ev.bnby[155] = -1504374950;
        ev.bnby[156] = -1926714065;
        ev.bnby[157] = 501527745;
        ev.bnby[158] = -230574624;
        ev.bnby[159] = 1036676632;
        ev.bnby[160] = -2134659035;
        ev.bnby[161] = 475981259;
        ev.bnby[162] = 189601896;
        ev.bnby[163] = -995171623;
        ev.bnby[164] = -1934356457;
        ev.bnby[165] = -27513403;
        ev.bnby[166] = 966071461;
        ev.bnby[167] = -1034364843;
        ev.bnby[168] = 983430604;
        ev.bnby[169] = 1307643232;
        ev.bnby[170] = 99064517;
        ev.bnby[171] = 20677443;
        ev.bnby[172] = -1747447204;
        ev.bnby[173] = 199017133;
        ev.bnby[174] = 1396166656;
        ev.bnby[175] = -1611694870;
        ev.bnby[176] = 157706299;
        ev.bnby[177] = 161118160;
        ev.bnby[178] = 1305782593;
        ev.bnby[179] = -1047399689;
        ev.bnby[180] = -655744907;
        ev.bnby[181] = -137746190;
        ev.bnby[182] = 1637616651;
        ev.bnby[183] = 1531347089;
        ev.bnby[184] = -731713478;
        ev.bnby[185] = 980252028;
        ev.bnby[186] = 801413530;
        ev.bnby[187] = -1529543510;
        ev.bnby[188] = 2103628445;
        ev.bnby[189] = -1283207039;
        ev.bnby[190] = 1775667272;
        ev.bnby[191] = 136186264;
        ev.bnby[192] = 1729960600;
        ev.bnby[193] = 1834271867;
        ev.bnby[194] = -1911673038;
        ev.bnby[195] = -743075357;
        ev.bnby[196] = 29761875;
        ev.bnby[197] = -949076423;
        ev.bnby[198] = 938027035;
        ev.bnby[199] = 1235050080;
    }

    private static /* synthetic */ void bomk() {
        ev.bnby[400] = 1879632399;
        ev.bnby[401] = -1718221304;
        ev.bnby[402] = 475692323;
        ev.bnby[403] = -1414205871;
        ev.bnby[404] = 1336986451;
        ev.bnby[405] = -585097771;
        ev.bnby[406] = 496577398;
        ev.bnby[407] = 245177614;
        ev.bnby[408] = -1889186337;
        ev.bnby[409] = -1730551331;
        ev.bnby[410] = 1171197406;
        ev.bnby[411] = 264388726;
        ev.bnby[412] = 960478086;
        ev.bnby[413] = 700830176;
        ev.bnby[414] = 219694512;
        ev.bnby[415] = -1178484702;
        ev.bnby[416] = 1316658557;
        ev.bnby[417] = -989973239;
        ev.bnby[418] = 1366910303;
        ev.bnby[419] = 1112997045;
        ev.bnby[420] = 556492714;
        ev.bnby[421] = 1743982032;
        ev.bnby[422] = -701792819;
        ev.bnby[423] = 2065753640;
        ev.bnby[424] = 1751577620;
        ev.bnby[425] = -453271150;
        ev.bnby[426] = -74540788;
        ev.bnby[427] = -1185787446;
        ev.bnby[428] = 1182280121;
        ev.bnby[429] = 434420658;
        ev.bnby[430] = -2129121468;
        ev.bnby[431] = -1009693277;
        ev.bnby[432] = 1849877494;
        ev.bnby[433] = -974186585;
        ev.bnby[434] = 1688945238;
        ev.bnby[435] = -1636738292;
        ev.bnby[436] = 415259920;
        ev.bnby[437] = 1958905850;
        ev.bnby[438] = 174100139;
        ev.bnby[439] = 2128804226;
        ev.bnby[440] = -1062994694;
        ev.bnby[441] = -1864424642;
        ev.bnby[442] = 1601269828;
        ev.bnby[443] = -2124053205;
        ev.bnby[444] = -1043795648;
        ev.bnby[445] = 1387296899;
        ev.bnby[446] = 2108377351;
        ev.bnby[447] = 2106418958;
        ev.bnby[448] = 1105249354;
        ev.bnby[449] = -2019401792;
        ev.bnby[450] = 1100123728;
        ev.bnby[451] = -416527846;
        ev.bnby[452] = -630063758;
        ev.bnby[453] = 953388084;
        ev.bnby[454] = 778710721;
        ev.bnby[455] = -1017458818;
        ev.bnby[456] = -1429013483;
        ev.bnby[457] = -590695685;
        ev.bnby[458] = 1167620392;
        ev.bnby[459] = 412616042;
        ev.bnby[460] = -2031497895;
        ev.bnby[461] = 1238965656;
        ev.bnby[462] = -1153481898;
        ev.bnby[463] = 503386284;
        ev.bnby[464] = -181748328;
        ev.bnby[465] = 757778851;
        ev.bnby[466] = 616122485;
        ev.bnby[467] = -961522270;
        ev.bnby[468] = -1492900770;
        ev.bnby[469] = -1540666339;
        ev.bnby[470] = 736586327;
        ev.bnby[471] = -2091665302;
        ev.bnby[472] = 1683223537;
        ev.bnby[473] = 554220125;
        ev.bnby[474] = 1624287446;
        ev.bnby[475] = -374943033;
        ev.bnby[476] = 1373804857;
        ev.bnby[477] = 1709024480;
        ev.bnby[478] = -2052559463;
        ev.bnby[479] = -1864007336;
        ev.bnby[480] = 104110426;
        ev.bnby[481] = -932179660;
        ev.bnby[482] = -501070421;
        ev.bnby[483] = 712445377;
        ev.bnby[484] = 30583906;
        ev.bnby[485] = 1535191075;
        ev.bnby[486] = -1333803351;
        ev.bnby[487] = 35428935;
        ev.bnby[488] = 1114954160;
        ev.bnby[489] = 937043016;
        ev.bnby[490] = 517675977;
        ev.bnby[491] = -49232766;
        ev.bnby[492] = 1704490643;
        ev.bnby[493] = -266267163;
        ev.bnby[494] = 673111838;
        ev.bnby[495] = -344834224;
        ev.bnby[496] = -1641747663;
        ev.bnby[497] = 1796575220;
        ev.bnby[498] = -372522215;
        ev.bnby[499] = 1634310157;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findItem$0(class_1792 var0, class_1799 var1_1) {
        block23: {
            block22: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bold", bncr(int ), (int)281)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == ev.bnbz("bole", bnbw(int ), (int)624)) break;
                    v0 /* !! */  = (long)ev.bnbz("bolf", bnbw(int ), (int)625);
                }
                var4_2 = ev.c;
                v1 /* !! */  = ev.dp;
                if (true) ** GOTO lbl12
                block15: while (true) {
                    v1 /* !! */  = (long)(v2 - ev.bnbz("bolg", bncr(int ), (int)282));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2102341634: {
                            v2 = ev.bnbz("bolh", bncr(int ), (int)283);
                            continue block15;
                        }
                        case -1309097994: {
                            break block15;
                        }
                        case -160078672: {
                            v2 = ev.bnbz("boli", bncr(int ), (int)284);
                            continue block15;
                        }
                    }
                    break;
                }
                var3_3 = ev.b;
                v3 /* !! */  = ev.dp;
                if (true) ** GOTO lbl26
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - ev.bnbz("bolj", bncr(int ), (int)285));
lbl26:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1309097994: {
                            break block16;
                        }
                        case 1001273923: {
                            v4 = ev.bnbz("bolk", bncr(int ), (int)286);
                            continue block16;
                        }
                        case 1570226786: {
                            v4 = ev.bnbz("boll", bncr(int ), (int)287);
                            continue block16;
                        }
                    }
                    break;
                }
                var2_4 = ev.a;
                if (var4_2) {
                    throw null;
lbl38:
                    // 3 sources

                    return (boolean)ev.bnbz("bolm", bnbw(int ), (int)626);
                }
                if (var2_4 || var2_4) ** GOTO lbl38
                v5 /* !! */  = ev.dp;
                if (true) ** GOTO lbl45
                block18: while (true) {
                    v5 /* !! */  = (long)(ev.bnbz("bolo", bncr(int ), (int)289) - ev.bnbz("boln", bncr(int ), (int)288));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1309097994: {
                            break block18;
                        }
                        case 954516982: {
                            continue block18;
                        }
                    }
                    break;
                }
                if (var1_1.method_7909() != var0) break block22;
                if (var2_4) ** GOTO lbl38
                v6 = ev.bnbz("bolp", bnbw(int ), (int)627);
                if (var4_2) {
                    throw null;
                }
                break block23;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v6 = ev.bnbz("bolq", bnbw(int ), (int)628);
        }
        return (boolean)v6;
    }

    private static /* synthetic */ void bomn() {
        ev.bncs[0] = -6055723395266307908L;
        ev.bncs[1] = -9052505487905180111L;
        ev.bncs[2] = -2408870945526431167L;
        ev.bncs[3] = 456235399679403565L;
        ev.bncs[4] = -439163425113178249L;
        ev.bncs[5] = -5155595965200604588L;
        ev.bncs[6] = -1372203507037005495L;
        ev.bncs[7] = 4078578251700572180L;
        ev.bncs[8] = 7196496677686569828L;
        ev.bncs[9] = 5600204998070131681L;
        ev.bncs[10] = 2194685355877453571L;
        ev.bncs[11] = 1759839689506851185L;
        ev.bncs[12] = 1444193197185484299L;
        ev.bncs[13] = -2686588262681064812L;
        ev.bncs[14] = -2310850192125773102L;
        ev.bncs[15] = -3115507744140556662L;
        ev.bncs[16] = -8699946481913482949L;
        ev.bncs[17] = 6402059300773354865L;
        ev.bncs[18] = 3545175605986772318L;
        ev.bncs[19] = -4301069587470998460L;
        ev.bncs[20] = -8589177259511715292L;
        ev.bncs[21] = 1593367878481869884L;
        ev.bncs[22] = -4578608919981873161L;
        ev.bncs[23] = 4603111104198721201L;
        ev.bncs[24] = 6725573105468173136L;
        ev.bncs[25] = -8160262941456111779L;
        ev.bncs[26] = 8356832267033497896L;
        ev.bncs[27] = -3541682785428223257L;
        ev.bncs[28] = -1254112632260085599L;
        ev.bncs[29] = 2885433318745056983L;
        ev.bncs[30] = 2268000241262433739L;
        ev.bncs[31] = 1167047879154502803L;
        ev.bncs[32] = 8322509888351111754L;
        ev.bncs[33] = -1641350683887616235L;
        ev.bncs[34] = 3166023102823860805L;
        ev.bncs[35] = 4738175370215702726L;
        ev.bncs[36] = 6729116551593650736L;
        ev.bncs[37] = 4413887883231706365L;
        ev.bncs[38] = -6609443976416969690L;
        ev.bncs[39] = 7544238728536321033L;
        ev.bncs[40] = 7423521238873781980L;
        ev.bncs[41] = 5938116963553808956L;
        ev.bncs[42] = -8640607545939405142L;
        ev.bncs[43] = 2071505101992792677L;
        ev.bncs[44] = -8173309491289090965L;
        ev.bncs[45] = 3950148679837647869L;
        ev.bncs[46] = -7025138404402190595L;
        ev.bncs[47] = 7787603197152484119L;
        ev.bncs[48] = -500844569003523025L;
        ev.bncs[49] = 5554386018057105247L;
        ev.bncs[50] = 9075648737283699437L;
        ev.bncs[51] = 8173275925121926146L;
        ev.bncs[52] = 4951922249522415768L;
        ev.bncs[53] = -6054770403568508265L;
        ev.bncs[54] = -3451273939321471426L;
        ev.bncs[55] = 3233952715305295220L;
        ev.bncs[56] = -2060207407130995538L;
        ev.bncs[57] = 4828373661230493673L;
        ev.bncs[58] = 7135925797436075222L;
        ev.bncs[59] = -5976738699609491945L;
        ev.bncs[60] = 5167132243495500177L;
        ev.bncs[61] = 560913839656629116L;
        ev.bncs[62] = -8562149260344699086L;
        ev.bncs[63] = -1712482395241391496L;
        ev.bncs[64] = -1254483583232887428L;
        ev.bncs[65] = 9016633930573176093L;
        ev.bncs[66] = -2466155694258647339L;
        ev.bncs[67] = -8949312420156023566L;
        ev.bncs[68] = -360010471406273295L;
        ev.bncs[69] = -6337965162335099065L;
        ev.bncs[70] = -7131444618076894015L;
        ev.bncs[71] = -6987865278150145535L;
        ev.bncs[72] = -1552466230340816886L;
        ev.bncs[73] = 7810211198229087542L;
        ev.bncs[74] = 4479733858121685180L;
        ev.bncs[75] = 6527469908749836970L;
        ev.bncs[76] = 6231254384903310576L;
        ev.bncs[77] = 2451798344845579997L;
        ev.bncs[78] = -5275018182675328504L;
        ev.bncs[79] = -8739465409662283751L;
        ev.bncs[80] = -2264598379795992746L;
        ev.bncs[81] = -1786515878455824790L;
        ev.bncs[82] = 1519954873190546176L;
        ev.bncs[83] = -5264621282848660122L;
        ev.bncs[84] = -6262237304854135004L;
        ev.bncs[85] = -7200189274167476055L;
        ev.bncs[86] = -264997582040569085L;
        ev.bncs[87] = -610484431509712934L;
        ev.bncs[88] = 7871705881975302703L;
        ev.bncs[89] = -194426339717833430L;
        ev.bncs[90] = -1742407161949958821L;
        ev.bncs[91] = -3809175668643246408L;
        ev.bncs[92] = 2911697344612946348L;
        ev.bncs[93] = 4091126724745042951L;
        ev.bncs[94] = -6485692005948474859L;
        ev.bncs[95] = -7904780034293333172L;
        ev.bncs[96] = 1293948720993992055L;
        ev.bncs[97] = -7346960432647375150L;
        ev.bncs[98] = -2887141652545565858L;
        ev.bncs[99] = 1618452723470852255L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private nu findItem(class_1792 var1_1) {
        v0 /* !! */  = ev.dp;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ev.bnbz("bobo", bncr(int ), (int)190));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2015264862: {
                    v1 = ev.bnbz("bobp", bncr(int ), (int)191);
                    continue block25;
                }
                case -1309097994: {
                    break block25;
                }
                case 1340699641: {
                    v1 = ev.bnbz("bobq", bncr(int ), (int)192);
                    continue block25;
                }
            }
            break;
        }
        var4_2 = ev.c;
        v2 /* !! */  = ev.dp;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - ev.bnbz("bobr", bncr(int ), (int)193));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1457503001: {
                    v3 = ev.bnbz("bobs", bncr(int ), (int)194);
                    continue block26;
                }
                case -1309097994: {
                    break block26;
                }
                case 681173464: {
                    v3 = ev.bnbz("bobt", bncr(int ), (int)195);
                    continue block26;
                }
                case 962507156: {
                    v3 = ev.bnbz("bobu", bncr(int ), (int)196);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = ev.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ev.dp - ev.bnbz("bobv", bncr(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ev.bnbz("bobw", bnbw(int ), (int)466)) {
                var2_4 = ev.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)ev.bnbz("bobx", bnbw(int ), (int)467);
        }
        if (var2_4 != false) return null;
        if (var2_4 != false) return null;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = ev.dp;
                block28: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1309097994: {
                            break block28;
                        }
                        case 1596268331: {
                            v5 /* !! */  = (long)(ev.bnbz("bobz", bncr(int ), (int)199) - ev.bnbz("boby", bncr(int ), (int)198));
                            continue block28;
                        }
                    }
                    break;
                }
                v6 = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findItem$0(net.minecraft.class_1792 net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((class_1792)var1_1);
                v7 /* !! */  = ev.dp;
                block29: while (true) {
                    switch ((int)v7 /* !! */ ) {
                        case -1309097994: {
                            return this.findItem(v6);
                        }
                        case 1453676216: {
                            v7 /* !! */  = (long)(ev.bnbz("bocb", bncr(int ), (int)201) - ev.bnbz("boca", bncr(int ), (int)200));
                            continue block29;
                        }
                    }
                    break;
                }
                return this.findItem(v6);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ev.bnbz("bocc", bnbw(int ), (int)468);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                ** GOTO lbl76
            }
            case 3: {
                var3_3 /* !! */  = (int)ev.bnbz("bocf", bnbw(int ), (int)471);
                if (var4_2) {
                    throw null;
                }
lbl76:
                // 3 sources

                var3_3 /* !! */  = (int)ev.bnbz("bocd", bnbw(int ), (int)469);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var3_3 /* !! */  = (int)ev.bnbz("boce", bnbw(int ), (int)470);
        } while (!var4_2);
        throw null;
    }
}

