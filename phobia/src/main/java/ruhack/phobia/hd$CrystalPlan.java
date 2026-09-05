/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2338
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;

final class hd$CrystalPlan
extends Record {
    private static long[] fffe;
    private static long[] fffd;
    private static int[] ffew;
    private final float targetDamage;
    public static final boolean c;
    public static final long ls = 3945304891946294825L;
    private static int[] ffex;
    public static final int b;
    private final class_2338 base;
    public static final boolean a;

    static {
        ffew = new int[50];
        ffex = new int[50];
        hd$CrystalPlan.ffin();
        hd$CrystalPlan.ffio();
        fffd = new long[38];
        fffe = new long[38];
        hd$CrystalPlan.ffip();
        hd$CrystalPlan.ffiq();
    }

    private static /* synthetic */ int ffev(int n2) {
        return ffew[n2] ^ ffex[n2];
    }

    public static /* synthetic */ CallSite ffey(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffgn", fffc(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hd$CrystalPlan.ffey("ffgo", ffev(int ), (int)24)) break;
            v0 /* !! */  = (long)hd$CrystalPlan.ffey("ffgp", ffev(int ), (int)25);
        }
        var4_2 = hd$CrystalPlan.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffgq", fffc(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hd$CrystalPlan.ffey("ffgr", ffev(int ), (int)26)) break;
            v1 /* !! */  = (long)hd$CrystalPlan.ffey("ffgs", ffev(int ), (int)27);
        }
        var3_3 /* !! */  = hd$CrystalPlan.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = hd$CrystalPlan.ls;
                if (true) ** GOTO lbl22
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - hd$CrystalPlan.ffey("ffgt", fffc(int ), (int)15));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1494230561: {
                            v3 = hd$CrystalPlan.ffey("ffgu", fffc(int ), (int)16);
                            continue block13;
                        }
                        case 1359524217: {
                            v3 = hd$CrystalPlan.ffey("ffgv", fffc(int ), (int)17);
                            continue block13;
                        }
                        case 1729224233: {
                            break block13;
                        }
                    }
                    break;
                }
                var2_4 = hd$CrystalPlan.a;
                if (var4_2) {
                    throw null;
                    return (boolean)hd$CrystalPlan.ffey("ffgw", ffev(int ), (int)28);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffgx", fffc(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hd$CrystalPlan.ffey("ffgy", ffev(int ), (int)29)) break;
                    v4 /* !! */  = (long)hd$CrystalPlan.ffey("ffgz", ffev(int ), (int)30);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hd$CrystalPlan.class, "base;targetDamage", "base", "targetDamage"}, this, var1_1);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)hd$CrystalPlan.ffey("ffha", ffev(int ), (int)31);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)hd$CrystalPlan.ffey("ffhb", ffev(int ), (int)32);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)hd$CrystalPlan.ffey("ffhc", ffev(int ), (int)33);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)hd$CrystalPlan.ffey("ffhd", ffev(int ), (int)34);
        ** while (!var4_2)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ffip() {
        hd$CrystalPlan.fffd[0] = 5069159849461202134L;
        hd$CrystalPlan.fffd[1] = -332042107404108450L;
        hd$CrystalPlan.fffd[2] = -4702119398623390725L;
        hd$CrystalPlan.fffd[3] = 8389485863960402987L;
        hd$CrystalPlan.fffd[4] = 4327016017912689446L;
        hd$CrystalPlan.fffd[5] = -3826091994311715698L;
        hd$CrystalPlan.fffd[6] = 705116200897894953L;
        hd$CrystalPlan.fffd[7] = 6258663000121962803L;
        hd$CrystalPlan.fffd[8] = 8386866836419558145L;
        hd$CrystalPlan.fffd[9] = -1642729563683245301L;
        hd$CrystalPlan.fffd[10] = 8677684543446356331L;
        hd$CrystalPlan.fffd[11] = 8471178389824382619L;
        hd$CrystalPlan.fffd[12] = 7803358688160598182L;
        hd$CrystalPlan.fffd[13] = 7937474794546212738L;
        hd$CrystalPlan.fffd[14] = -1518498570871699590L;
        hd$CrystalPlan.fffd[15] = 1708071932975064498L;
        hd$CrystalPlan.fffd[16] = 6482218688605066860L;
        hd$CrystalPlan.fffd[17] = 6697117181017834273L;
        hd$CrystalPlan.fffd[18] = 6581186906434376472L;
        hd$CrystalPlan.fffd[19] = -5835544270753418901L;
        hd$CrystalPlan.fffd[20] = -8558810968519473602L;
        hd$CrystalPlan.fffd[21] = -7808083090817636575L;
        hd$CrystalPlan.fffd[22] = 2571468317708332768L;
        hd$CrystalPlan.fffd[23] = 463876394143355066L;
        hd$CrystalPlan.fffd[24] = 1678245417806458121L;
        hd$CrystalPlan.fffd[25] = -627540463942141665L;
        hd$CrystalPlan.fffd[26] = 4248828647871163584L;
        hd$CrystalPlan.fffd[27] = -2854534050293138345L;
        hd$CrystalPlan.fffd[28] = 2699912924135839907L;
        hd$CrystalPlan.fffd[29] = 3947685648483227456L;
        hd$CrystalPlan.fffd[30] = -7688495274186309808L;
        hd$CrystalPlan.fffd[31] = -6042227406923810251L;
        hd$CrystalPlan.fffd[32] = -4298078641138887205L;
        hd$CrystalPlan.fffd[33] = -3226697672940176007L;
        hd$CrystalPlan.fffd[34] = -5856805168116171457L;
        hd$CrystalPlan.fffd[35] = 767751062681354719L;
        hd$CrystalPlan.fffd[36] = 5766108522441583708L;
        hd$CrystalPlan.fffd[37] = -5954405170844745678L;
    }

    private static /* synthetic */ void ffin() {
        hd$CrystalPlan.ffew[0] = -997248295;
        hd$CrystalPlan.ffew[1] = -133596293;
        hd$CrystalPlan.ffew[2] = -680695422;
        hd$CrystalPlan.ffew[3] = 828968893;
        hd$CrystalPlan.ffew[4] = 1214774760;
        hd$CrystalPlan.ffew[5] = -1418197401;
        hd$CrystalPlan.ffew[6] = 1343042032;
        hd$CrystalPlan.ffew[7] = -396435662;
        hd$CrystalPlan.ffew[8] = 1286306012;
        hd$CrystalPlan.ffew[9] = 72017614;
        hd$CrystalPlan.ffew[10] = 951720897;
        hd$CrystalPlan.ffew[11] = -2093762054;
        hd$CrystalPlan.ffew[12] = -532009206;
        hd$CrystalPlan.ffew[13] = -869375016;
        hd$CrystalPlan.ffew[14] = -1445158759;
        hd$CrystalPlan.ffew[15] = 1373124579;
        hd$CrystalPlan.ffew[16] = 1433239625;
        hd$CrystalPlan.ffew[17] = 256320617;
        hd$CrystalPlan.ffew[18] = -781961745;
        hd$CrystalPlan.ffew[19] = -1002680228;
        hd$CrystalPlan.ffew[20] = 1705753630;
        hd$CrystalPlan.ffew[21] = -1227579672;
        hd$CrystalPlan.ffew[22] = 925222962;
        hd$CrystalPlan.ffew[23] = 1390233012;
        hd$CrystalPlan.ffew[24] = 1732756852;
        hd$CrystalPlan.ffew[25] = 1035047629;
        hd$CrystalPlan.ffew[26] = -306246312;
        hd$CrystalPlan.ffew[27] = 402203826;
        hd$CrystalPlan.ffew[28] = 1761232879;
        hd$CrystalPlan.ffew[29] = 1637285149;
        hd$CrystalPlan.ffew[30] = 1557749467;
        hd$CrystalPlan.ffew[31] = -22214541;
        hd$CrystalPlan.ffew[32] = 284436690;
        hd$CrystalPlan.ffew[33] = -730026664;
        hd$CrystalPlan.ffew[34] = -1003689621;
        hd$CrystalPlan.ffew[35] = 1677576707;
        hd$CrystalPlan.ffew[36] = 1651986737;
        hd$CrystalPlan.ffew[37] = 1418809044;
        hd$CrystalPlan.ffew[38] = -240201975;
        hd$CrystalPlan.ffew[39] = 2052097016;
        hd$CrystalPlan.ffew[40] = 1522639574;
        hd$CrystalPlan.ffew[41] = -482613098;
        hd$CrystalPlan.ffew[42] = -1499067508;
        hd$CrystalPlan.ffew[43] = -1104867636;
        hd$CrystalPlan.ffew[44] = -1664672366;
        hd$CrystalPlan.ffew[45] = 1304421082;
        hd$CrystalPlan.ffew[46] = -781138612;
        hd$CrystalPlan.ffew[47] = -993335910;
        hd$CrystalPlan.ffew[48] = 2099224639;
        hd$CrystalPlan.ffew[49] = -1986735391;
    }

    private static /* synthetic */ void ffio() {
        hd$CrystalPlan.ffex[0] = -997248293;
        hd$CrystalPlan.ffex[1] = -133596293;
        hd$CrystalPlan.ffex[2] = -680695421;
        hd$CrystalPlan.ffex[3] = -828968894;
        hd$CrystalPlan.ffex[4] = -451760346;
        hd$CrystalPlan.ffex[5] = -1418197402;
        hd$CrystalPlan.ffex[6] = 1558661602;
        hd$CrystalPlan.ffex[7] = -396435661;
        hd$CrystalPlan.ffex[8] = 1299565236;
        hd$CrystalPlan.ffex[9] = 72017615;
        hd$CrystalPlan.ffex[10] = 951720899;
        hd$CrystalPlan.ffex[11] = -2093762056;
        hd$CrystalPlan.ffex[12] = -532009206;
        hd$CrystalPlan.ffex[13] = -869375015;
        hd$CrystalPlan.ffex[14] = -1303089251;
        hd$CrystalPlan.ffex[15] = 1373124578;
        hd$CrystalPlan.ffex[16] = -2025553674;
        hd$CrystalPlan.ffex[17] = -44964705;
        hd$CrystalPlan.ffex[18] = 781961744;
        hd$CrystalPlan.ffex[19] = 769150247;
        hd$CrystalPlan.ffex[20] = 1705753631;
        hd$CrystalPlan.ffex[21] = -1227579672;
        hd$CrystalPlan.ffex[22] = 925222963;
        hd$CrystalPlan.ffex[23] = 1390233013;
        hd$CrystalPlan.ffex[24] = -1732756853;
        hd$CrystalPlan.ffex[25] = 838181906;
        hd$CrystalPlan.ffex[26] = -306246311;
        hd$CrystalPlan.ffex[27] = 82136234;
        hd$CrystalPlan.ffex[28] = 1761232879;
        hd$CrystalPlan.ffex[29] = 1637285148;
        hd$CrystalPlan.ffex[30] = 212805283;
        hd$CrystalPlan.ffex[31] = -22214543;
        hd$CrystalPlan.ffex[32] = 284436689;
        hd$CrystalPlan.ffex[33] = -730026662;
        hd$CrystalPlan.ffex[34] = -1003689622;
        hd$CrystalPlan.ffex[35] = -1677576708;
        hd$CrystalPlan.ffex[36] = 246823907;
        hd$CrystalPlan.ffex[37] = 1418809045;
        hd$CrystalPlan.ffex[38] = -1787847672;
        hd$CrystalPlan.ffex[39] = 2052097017;
        hd$CrystalPlan.ffex[40] = 1522639572;
        hd$CrystalPlan.ffex[41] = -482613097;
        hd$CrystalPlan.ffex[42] = -1499067508;
        hd$CrystalPlan.ffex[43] = -1104867635;
        hd$CrystalPlan.ffex[44] = -1967342344;
        hd$CrystalPlan.ffex[45] = 1895301338;
        hd$CrystalPlan.ffex[46] = -781138612;
        hd$CrystalPlan.ffex[47] = -993335912;
        hd$CrystalPlan.ffex[48] = 2099224636;
        hd$CrystalPlan.ffex[49] = -1986735391;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float targetDamage() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffhu", fffc(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hd$CrystalPlan.ffey("ffhv", ffev(int ), (int)43)) break;
            v0 /* !! */  = (long)hd$CrystalPlan.ffey("ffhw", ffev(int ), (int)44);
        }
        var3_1 = hd$CrystalPlan.c;
        v1 /* !! */  = hd$CrystalPlan.ls;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - hd$CrystalPlan.ffey("ffhx", fffc(int ), (int)28));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 490075070: {
                    v2 = hd$CrystalPlan.ffey("ffhy", fffc(int ), (int)29);
                    continue block17;
                }
                case 1729224233: {
                    break block17;
                }
                case 2078130213: {
                    v2 = hd$CrystalPlan.ffey("ffhz", fffc(int ), (int)30);
                    continue block17;
                }
            }
            break;
        }
        var2_2 = hd$CrystalPlan.b;
        v3 /* !! */  = hd$CrystalPlan.ls;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - hd$CrystalPlan.ffey("ffia", fffc(int ), (int)31));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -759004252: {
                    v4 = hd$CrystalPlan.ffey("ffib", fffc(int ), (int)32);
                    continue block18;
                }
                case -626669381: {
                    v4 = hd$CrystalPlan.ffey("ffic", fffc(int ), (int)33);
                    continue block18;
                }
                case 1094408716: {
                    v4 = hd$CrystalPlan.ffey("ffid", fffc(int ), (int)34);
                    continue block18;
                }
                case 1729224233: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = hd$CrystalPlan.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (float)hd$CrystalPlan.ffey("ffif", ffie(int ), (int)45);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = hd$CrystalPlan.ls;
        if (true) ** GOTO lbl48
        block20: while (true) {
            v5 /* !! */  = (long)(v6 - hd$CrystalPlan.ffey("ffig", fffc(int ), (int)35));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 303569546: {
                    v6 = hd$CrystalPlan.ffey("ffih", fffc(int ), (int)36);
                    continue block20;
                }
                case 1181720415: {
                    v6 = hd$CrystalPlan.ffey("ffii", fffc(int ), (int)37);
                    continue block20;
                }
                case 1729224233: {
                    break block20;
                }
            }
            break;
        }
        return this.targetDamage;
    }

    private static /* synthetic */ long fffc(int n2) {
        return fffd[n2] ^ fffe[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        Object object = ls;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hd$CrystalPlan.ffey("ffff", fffc(int ), (int)0);
            }
            switch ((int)object) {
                case -714959098: {
                    callSite = hd$CrystalPlan.ffey("fffg", fffc(int ), (int)1);
                    continue block5;
                }
                case 515239055: {
                    callSite = hd$CrystalPlan.ffey("fffh", fffc(int ), (int)2);
                    continue block5;
                }
                case 1729224233: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ls - hd$CrystalPlan.ffey("fffi", fffc(int ), (int)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hd$CrystalPlan.ffey("fffj", ffev(int ), (int)3)) break;
            object2 = hd$CrystalPlan.ffey("fffk", ffev(int ), (int)4);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ls - hd$CrystalPlan.ffey("fffl", fffc(int ), (int)4)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hd$CrystalPlan.ffey("fffm", ffev(int ), (int)5)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hd$CrystalPlan.ffey("fffn", ffev(int ), (int)6);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = ls - hd$CrystalPlan.ffey("fffo", fffc(int ), (int)5)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == hd$CrystalPlan.ffey("fffp", ffev(int ), (int)7)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{hd$CrystalPlan.class, "base;targetDamage", "base", "targetDamage"}, this);
            }
            object4 = hd$CrystalPlan.ffey("fffq", ffev(int ), (int)8);
        }
    }

    private static /* synthetic */ void ffiq() {
        hd$CrystalPlan.fffe[0] = -8573322972848170653L;
        hd$CrystalPlan.fffe[1] = -1845285342344962461L;
        hd$CrystalPlan.fffe[2] = 1290286213192300572L;
        hd$CrystalPlan.fffe[3] = 67430104053408177L;
        hd$CrystalPlan.fffe[4] = -7055289031764286638L;
        hd$CrystalPlan.fffe[5] = -3462978384460377340L;
        hd$CrystalPlan.fffe[6] = -1196063121500425874L;
        hd$CrystalPlan.fffe[7] = 4947923097806345386L;
        hd$CrystalPlan.fffe[8] = -5840400487176015610L;
        hd$CrystalPlan.fffe[9] = -7303276881975486412L;
        hd$CrystalPlan.fffe[10] = -124678832786769568L;
        hd$CrystalPlan.fffe[11] = 4478866567975204875L;
        hd$CrystalPlan.fffe[12] = 5895043163330012356L;
        hd$CrystalPlan.fffe[13] = 912392116744117597L;
        hd$CrystalPlan.fffe[14] = 3137195332490210891L;
        hd$CrystalPlan.fffe[15] = -5315412661117058735L;
        hd$CrystalPlan.fffe[16] = 1567537745990889859L;
        hd$CrystalPlan.fffe[17] = -8454828654766472811L;
        hd$CrystalPlan.fffe[18] = 8453481262225075669L;
        hd$CrystalPlan.fffe[19] = -3086708932121065335L;
        hd$CrystalPlan.fffe[20] = 2171426666177045577L;
        hd$CrystalPlan.fffe[21] = 6878027708589911395L;
        hd$CrystalPlan.fffe[22] = 8909781724508975301L;
        hd$CrystalPlan.fffe[23] = -1274048350399898204L;
        hd$CrystalPlan.fffe[24] = 1126485484830889722L;
        hd$CrystalPlan.fffe[25] = 7591434155679124214L;
        hd$CrystalPlan.fffe[26] = 6522611675712555619L;
        hd$CrystalPlan.fffe[27] = -4579460661678998281L;
        hd$CrystalPlan.fffe[28] = -7027142696707796417L;
        hd$CrystalPlan.fffe[29] = 2675229665072529665L;
        hd$CrystalPlan.fffe[30] = -994039476559954495L;
        hd$CrystalPlan.fffe[31] = 4074511379542931227L;
        hd$CrystalPlan.fffe[32] = 1557750124895241638L;
        hd$CrystalPlan.fffe[33] = -8274802026658674336L;
        hd$CrystalPlan.fffe[34] = -7774903464526442926L;
        hd$CrystalPlan.fffe[35] = 3524715729977034689L;
        hd$CrystalPlan.fffe[36] = 310004865506877882L;
        hd$CrystalPlan.fffe[37] = 448885204484828037L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hd$CrystalPlan(class_2338 var1_1, float var2_2) {
        var4_3 /* !! */  = hd$CrystalPlan.b;
        super();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.base = var1_1;
                this.targetDamage = var2_2;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)hd$CrystalPlan.ffey("ffez", ffev(int ), (int)0);
            }
            case 1: {
                while (true) {
                    var4_3 /* !! */  = (int)hd$CrystalPlan.ffey("fffa", ffev(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)hd$CrystalPlan.ffey("fffb", ffev(int ), (int)2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2338 base() {
        v0 /* !! */  = hd$CrystalPlan.ls;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - hd$CrystalPlan.ffey("ffhe", fffc(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1578841786: {
                    v1 = hd$CrystalPlan.ffey("ffhf", fffc(int ), (int)20);
                    continue block16;
                }
                case -1056137452: {
                    v1 = hd$CrystalPlan.ffey("ffhg", fffc(int ), (int)21);
                    continue block16;
                }
                case 1729224233: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = hd$CrystalPlan.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffhh", fffc(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hd$CrystalPlan.ffey("ffhi", ffev(int ), (int)35)) break;
            v2 /* !! */  = (long)hd$CrystalPlan.ffey("ffhj", ffev(int ), (int)36);
        }
        var2_2 /* !! */  = hd$CrystalPlan.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffhk", fffc(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hd$CrystalPlan.ffey("ffhl", ffev(int ), (int)37)) break;
            v3 /* !! */  = (long)hd$CrystalPlan.ffey("ffhm", ffev(int ), (int)38);
        }
        var1_3 = hd$CrystalPlan.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hd$CrystalPlan.ls;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - hd$CrystalPlan.ffey("ffhn", fffc(int ), (int)24));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1656866059: {
                            v5 = hd$CrystalPlan.ffey("ffho", fffc(int ), (int)25);
                            continue block20;
                        }
                        case -387950385: {
                            v5 = hd$CrystalPlan.ffey("ffhp", fffc(int ), (int)26);
                            continue block20;
                        }
                        case 1729224233: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.base;
            }
            case 0: {
                var2_2 /* !! */  = (int)hd$CrystalPlan.ffey("ffhq", ffev(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hd$CrystalPlan.ffey("ffhr", ffev(int ), (int)40);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hd$CrystalPlan.ffey("ffhs", ffev(int ), (int)41);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hd$CrystalPlan.ffey("ffht", ffev(int ), (int)42);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ffie(int n2) {
        return Float.intBitsToFloat(ffew[n2] ^ ffex[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("fffv", fffc(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hd$CrystalPlan.ffey("fffw", ffev(int ), (int)13)) break;
            v0 /* !! */  = (long)hd$CrystalPlan.ffey("fffx", ffev(int ), (int)14);
        }
        var3_1 = hd$CrystalPlan.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("fffy", fffc(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hd$CrystalPlan.ffey("fffz", ffev(int ), (int)15)) break;
            v1 /* !! */  = (long)hd$CrystalPlan.ffey("ffga", ffev(int ), (int)16);
        }
        var2_2 = hd$CrystalPlan.b;
        v2 /* !! */  = hd$CrystalPlan.ls;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - hd$CrystalPlan.ffey("ffgb", fffc(int ), (int)8));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -479802800: {
                    v3 = hd$CrystalPlan.ffey("ffgc", fffc(int ), (int)9);
                    continue block8;
                }
                case 510689516: {
                    v3 = hd$CrystalPlan.ffey("ffgd", fffc(int ), (int)10);
                    continue block8;
                }
                case 891172328: {
                    v3 = hd$CrystalPlan.ffey("ffge", fffc(int ), (int)11);
                    continue block8;
                }
                case 1729224233: {
                    break block8;
                }
            }
            break;
        }
        var1_3 = hd$CrystalPlan.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (int)hd$CrystalPlan.ffey("ffgf", ffev(int ), (int)17);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hd$CrystalPlan.ls - hd$CrystalPlan.ffey("ffgg", fffc(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hd$CrystalPlan.ffey("ffgh", ffev(int ), (int)18)) break;
            v4 /* !! */  = (long)hd$CrystalPlan.ffey("ffgi", ffev(int ), (int)19);
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hd$CrystalPlan.class, "base;targetDamage", "base", "targetDamage"}, this);
    }
}

