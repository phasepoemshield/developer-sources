/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_3489
 *  net.minecraft.class_6880
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_3489;
import net.minecraft.class_6880;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.pn;
import ruhack.phobia.pr;

public class fy
extends ds {
    private final pr timer;
    private static int[] jgla;
    public static final int b;
    public static final long rk = 3342380047019354647L;
    private static int[] jgkz;
    private boolean boosting;
    private boolean spearTurn;
    private final kb autoSpear;
    private final kg swapSlot;
    private final kg spearSlot;
    private int savedSlot;
    private final ka boostBind;
    public static final boolean c;
    private final kg burstDelay;
    private static long[] jgoq;
    public static final boolean a;
    private static long[] jgor;

    private static /* synthetic */ void jhdk() {
        fy.jgkz[300] = 1142289614;
        fy.jgkz[301] = 1177046670;
        fy.jgkz[302] = -1794455948;
        fy.jgkz[303] = -1138798490;
        fy.jgkz[304] = 355982117;
        fy.jgkz[305] = 2051164628;
        fy.jgkz[306] = 992601517;
    }

    private static /* synthetic */ float jgld(int n2) {
        return Float.intBitsToFloat(jgkz[n2] ^ jgla[n2]);
    }

    private static /* synthetic */ void jhdh() {
        fy.jgkz[0] = -1667985730;
        fy.jgkz[1] = -2118415842;
        fy.jgkz[2] = -308786553;
        fy.jgkz[3] = -989313779;
        fy.jgkz[4] = -642507241;
        fy.jgkz[5] = 442250624;
        fy.jgkz[6] = 1578244474;
        fy.jgkz[7] = 68510475;
        fy.jgkz[8] = 831010089;
        fy.jgkz[9] = -1739752465;
        fy.jgkz[10] = -205489331;
        fy.jgkz[11] = -1807739800;
        fy.jgkz[12] = 104356385;
        fy.jgkz[13] = -785820579;
        fy.jgkz[14] = 1438826434;
        fy.jgkz[15] = -162383761;
        fy.jgkz[16] = 297142788;
        fy.jgkz[17] = 1385943982;
        fy.jgkz[18] = 1742913099;
        fy.jgkz[19] = 1967010670;
        fy.jgkz[20] = 1661594041;
        fy.jgkz[21] = 1675803209;
        fy.jgkz[22] = 1202591857;
        fy.jgkz[23] = 365930146;
        fy.jgkz[24] = -2008513764;
        fy.jgkz[25] = 162445071;
        fy.jgkz[26] = 1830716139;
        fy.jgkz[27] = -1711320811;
        fy.jgkz[28] = 737219299;
        fy.jgkz[29] = 567640267;
        fy.jgkz[30] = -872204097;
        fy.jgkz[31] = -713331044;
        fy.jgkz[32] = 1697458630;
        fy.jgkz[33] = -764424634;
        fy.jgkz[34] = -1276380208;
        fy.jgkz[35] = 673654279;
        fy.jgkz[36] = -1832769626;
        fy.jgkz[37] = -1443241307;
        fy.jgkz[38] = -1653060944;
        fy.jgkz[39] = -462888946;
        fy.jgkz[40] = 1444007932;
        fy.jgkz[41] = -2075877706;
        fy.jgkz[42] = 1291036629;
        fy.jgkz[43] = 1279824693;
        fy.jgkz[44] = -443055528;
        fy.jgkz[45] = -495955581;
        fy.jgkz[46] = -850255959;
        fy.jgkz[47] = 1457283094;
        fy.jgkz[48] = -1188834265;
        fy.jgkz[49] = 1913238684;
        fy.jgkz[50] = 1110338029;
        fy.jgkz[51] = -661450992;
        fy.jgkz[52] = -839871680;
        fy.jgkz[53] = 1140116360;
        fy.jgkz[54] = -1919070562;
        fy.jgkz[55] = 164708299;
        fy.jgkz[56] = -104630805;
        fy.jgkz[57] = -430399864;
        fy.jgkz[58] = 1304441288;
        fy.jgkz[59] = -380672368;
        fy.jgkz[60] = 183892557;
        fy.jgkz[61] = -1602618642;
        fy.jgkz[62] = -264575356;
        fy.jgkz[63] = 401859217;
        fy.jgkz[64] = -1684194598;
        fy.jgkz[65] = 1403172789;
        fy.jgkz[66] = 357512445;
        fy.jgkz[67] = -1681536732;
        fy.jgkz[68] = 1618262000;
        fy.jgkz[69] = -1810486851;
        fy.jgkz[70] = 1805823384;
        fy.jgkz[71] = 1548366799;
        fy.jgkz[72] = 1960534759;
        fy.jgkz[73] = -269827707;
        fy.jgkz[74] = -1495681372;
        fy.jgkz[75] = 493299927;
        fy.jgkz[76] = 1415734425;
        fy.jgkz[77] = -894696474;
        fy.jgkz[78] = 1887236601;
        fy.jgkz[79] = -1945866349;
        fy.jgkz[80] = 1013017700;
        fy.jgkz[81] = -483962864;
        fy.jgkz[82] = -766746497;
        fy.jgkz[83] = 2052319376;
        fy.jgkz[84] = -50560432;
        fy.jgkz[85] = 1744382780;
        fy.jgkz[86] = -579474842;
        fy.jgkz[87] = 1714435910;
        fy.jgkz[88] = 2101586307;
        fy.jgkz[89] = 1184367194;
        fy.jgkz[90] = -1848323156;
        fy.jgkz[91] = -1972719826;
        fy.jgkz[92] = 887940034;
        fy.jgkz[93] = 2109230680;
        fy.jgkz[94] = -1436758565;
        fy.jgkz[95] = -470140936;
        fy.jgkz[96] = -1801721758;
        fy.jgkz[97] = -1804143212;
        fy.jgkz[98] = 131205199;
        fy.jgkz[99] = -2123740067;
    }

    private static /* synthetic */ void jhdo() {
        fy.jgla[300] = 1142289613;
        fy.jgla[301] = 1177046671;
        fy.jgla[302] = -1794455948;
        fy.jgla[303] = -1138798491;
        fy.jgla[304] = 355982117;
        fy.jgla[305] = 2051164631;
        fy.jgla[306] = 992601515;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int resolveSpearSlot() {
        block118: {
            block117: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jgqt", jgop(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fy.jglb("jgqu", jgky(int ), (int)120)) break;
                    v0 /* !! */  = (long)fy.jglb("jgqv", jgky(int ), (int)121);
                }
                var4_1 = fy.c;
                v1 /* !! */  = fy.rk;
                if (true) ** GOTO lbl11
                block73: while (true) {
                    v1 /* !! */  = (long)(fy.jglb("jgqx", jgop(int ), (int)25) - fy.jglb("jgqw", jgop(int ), (int)24));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1359926761: {
                            break block73;
                        }
                        case -25701228: {
                            continue block73;
                        }
                    }
                    break;
                }
                var3_2 /* !! */  = fy.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jgqy", jgop(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == fy.jglb("jgqz", jgky(int ), (int)122)) break;
                    v2 /* !! */  = (long)fy.jglb("jgra", jgky(int ), (int)123);
                }
                var2_3 = fy.a;
                if (var4_1) {
                    throw null;
lbl25:
                    // 13 sources

                    return (int)fy.jglb("jgrb", jgky(int ), (int)124);
                }
                if (var2_3 || var2_3) ** GOTO lbl25
                v3 /* !! */  = fy.rk;
                if (true) ** GOTO lbl32
                block76: while (true) {
                    v3 /* !! */  = (long)(v4 - fy.jglb("jgrc", jgop(int ), (int)27));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1359926761: {
                            break block76;
                        }
                        case -940467813: {
                            v4 = fy.jglb("jgrd", jgop(int ), (int)28);
                            continue block76;
                        }
                        case 1663392081: {
                            v4 = fy.jglb("jgre", jgop(int ), (int)29);
                            continue block76;
                        }
                    }
                    break;
                }
                v5 /* !! */  = fy.rk;
                if (true) ** GOTO lbl45
                block77: while (true) {
                    v5 /* !! */  = (long)(v6 - fy.jglb("jgrf", jgop(int ), (int)30));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1359926761: {
                            break block77;
                        }
                        case -870915662: {
                            v6 = fy.jglb("jgrg", jgop(int ), (int)31);
                            continue block77;
                        }
                        case 1994564037: {
                            v6 = fy.jglb("jgrh", jgop(int ), (int)32);
                            continue block77;
                        }
                    }
                    break;
                }
                if (!this.autoSpear.isValue()) break block118;
                if (var2_3 || var2_3) ** GOTO lbl25
                var1_4 = fy.jglb("jgri", jgky(int ), (int)125);
                if (var2_3) ** GOTO lbl25
                do {
                    block119: {
                        if (var2_3 || var2_3) ** GOTO lbl25
                        if (var1_4 >= fy.jglb("jgrj", jgky(int ), (int)126)) break block117;
                        if (var2_3 || var2_3) ** GOTO lbl25
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = fy.rk - fy.jglb("jgrk", jgop(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == fy.jglb("jgrl", jgky(int ), (int)127)) break;
                            v7 /* !! */  = (long)fy.jglb("jgrm", jgky(int ), (int)128);
                        }
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = fy.rk - fy.jglb("jgrn", jgop(int ), (int)34)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == fy.jglb("jgro", jgky(int ), (int)129)) break;
                            v8 /* !! */  = (long)fy.jglb("jgrp", jgky(int ), (int)130);
                        }
                        v9 = fy.mc.field_1724;
                        v10 /* !! */  = fy.rk;
                        if (true) ** GOTO lbl77
                        block81: while (true) {
                            v10 /* !! */  = (long)(fy.jglb("jgrr", jgop(int ), (int)36) - fy.jglb("jgrq", jgop(int ), (int)35));
lbl77:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case -1990448411: {
                                    continue block81;
                                }
                                case -1359926761: {
                                    break block81;
                                }
                            }
                            break;
                        }
                        v11 = v9.method_31548();
                        v12 /* !! */  = fy.rk;
                        if (true) ** GOTO lbl87
                        block82: while (true) {
                            v12 /* !! */  = (long)(fy.jglb("jgrt", jgop(int ), (int)38) - fy.jglb("jgrs", jgop(int ), (int)37));
lbl87:
                            // 2 sources

                            switch ((int)v12 /* !! */ ) {
                                case -1359926761: {
                                    break block82;
                                }
                                case 1198724258: {
                                    continue block82;
                                }
                            }
                            break;
                        }
                        v13 = v11.method_5438((int)var1_4);
                        while (true) {
                            if ((v14 /* !! */  = (cfr_temp_4 = fy.rk - fy.jglb("jgru", jgop(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v14 /* !! */  == fy.jglb("jgrv", jgky(int ), (int)131)) break;
                            v14 /* !! */  = (long)fy.jglb("jgrw", jgky(int ), (int)132);
                        }
                        if (!this.isLungeSpear(v13)) break block119;
                        if (var2_3 || var2_3) ** GOTO lbl25
                        return (int)var1_4;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl25
                    ++var1_4;
                    if (var2_3) ** GOTO lbl25
                } while (!var4_1);
                throw null;
            }
            if (var2_3 || var2_3) ** GOTO lbl25
            return (int)fy.jglb("jgrx", jgky(int ), (int)133);
        }
        if (var2_3 || var2_3) ** GOTO lbl25
        v15 /* !! */  = fy.rk;
        if (true) ** GOTO lbl116
        block84: while (true) {
            v15 /* !! */  = (long)(fy.jglb("jgrz", jgop(int ), (int)41) - fy.jglb("jgry", jgop(int ), (int)40));
lbl116:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1359926761: {
                    break block84;
                }
                case -377505079: {
                    continue block84;
                }
            }
            break;
        }
        v16 /* !! */  = fy.rk;
        if (true) ** GOTO lbl125
        block85: while (true) {
            v16 /* !! */  = (long)(v17 - fy.jglb("jgsa", jgop(int ), (int)42));
lbl125:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1807557567: {
                    v17 = fy.jglb("jgsb", jgop(int ), (int)43);
                    continue block85;
                }
                case -1359926761: {
                    break block85;
                }
                case -1261177531: {
                    v17 = fy.jglb("jgsc", jgop(int ), (int)44);
                    continue block85;
                }
                case 1147896026: {
                    v17 = fy.jglb("jgsd", jgop(int ), (int)45);
                    continue block85;
                }
            }
            break;
        }
        v18 = this.spearSlot.getValue();
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_5 = fy.rk - fy.jglb("jgse", jgop(int ), (int)46)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == fy.jglb("jgsf", jgky(int ), (int)134)) break;
            v19 /* !! */  = (long)fy.jglb("jgsg", jgky(int ), (int)135);
        }
        var1_5 = this.hotbarIndex(v18);
        if (var2_3 || var2_3) ** GOTO lbl25
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_6 = fy.rk - fy.jglb("jgsh", jgop(int ), (int)47)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == fy.jglb("jgsi", jgky(int ), (int)136)) break;
            v20 /* !! */  = (long)fy.jglb("jgsj", jgky(int ), (int)137);
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_7 = fy.rk - fy.jglb("jgsk", jgop(int ), (int)48)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == fy.jglb("jgsl", jgky(int ), (int)138)) break;
            v21 /* !! */  = (long)fy.jglb("jgsm", jgky(int ), (int)139);
        }
        v22 = fy.mc.field_1724;
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_8 = fy.rk - fy.jglb("jgsn", jgop(int ), (int)49)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == fy.jglb("jgso", jgky(int ), (int)140)) break;
            v23 /* !! */  = (long)fy.jglb("jgsp", jgky(int ), (int)141);
        }
        v24 = v22.method_31548();
        v25 /* !! */  = fy.rk;
        if (true) ** GOTO lbl166
        block90: while (true) {
            v25 /* !! */  = (long)(v26 - fy.jglb("jgsq", jgop(int ), (int)50));
lbl166:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1359926761: {
                    break block90;
                }
                case -962402909: {
                    v26 = fy.jglb("jgsr", jgop(int ), (int)51);
                    continue block90;
                }
                case -610637598: {
                    v26 = fy.jglb("jgss", jgop(int ), (int)52);
                    continue block90;
                }
                case 885791792: {
                    v26 = fy.jglb("jgst", jgop(int ), (int)53);
                    continue block90;
                }
            }
            break;
        }
        v27 = v24.method_5438(var1_5);
        v28 /* !! */  = fy.rk;
        if (true) ** GOTO lbl183
        block91: while (true) {
            v28 /* !! */  = (long)(v29 - fy.jglb("jgsu", jgop(int ), (int)54));
lbl183:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1359926761: {
                    break block91;
                }
                case -541469616: {
                    v29 = fy.jglb("jgsv", jgop(int ), (int)55);
                    continue block91;
                }
                case -78814231: {
                    v29 = fy.jglb("jgsw", jgop(int ), (int)56);
                    continue block91;
                }
            }
            break;
        }
        if (!this.isLungeSpear(v27)) ** GOTO lbl201
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl25
                v30 /* !! */  = var1_5;
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl201:
            // 1 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v30 /* !! */  = (int)fy.jglb("jgsx", jgky(int ), (int)142);
lbl204:
            // 2 sources

            return v30 /* !! */ ;
lbl205:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)fy.jglb("jgsy", jgky(int ), (int)143);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 1: {
                var3_2 /* !! */  = (int)fy.jglb("jgsz", jgky(int ), (int)144);
                if (!var4_1) ** GOTO lbl205
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)fy.jglb("jgta", jgky(int ), (int)145);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl219:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)fy.jglb("jgtb", jgky(int ), (int)146);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl224:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)fy.jglb("jgtc", jgky(int ), (int)147);
                if (!var4_1) break;
                throw null;
            }
lbl228:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)fy.jglb("jgtd", jgky(int ), (int)148);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl233:
            // 4 sources

            case 6: {
                var3_2 /* !! */  = (int)fy.jglb("jgte", jgky(int ), (int)149);
                if (!var4_1) break;
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)fy.jglb("jgtf", jgky(int ), (int)150);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl242:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)fy.jglb("jgtg", jgky(int ), (int)151);
                if (!var4_1) ** GOTO lbl233
                throw null;
            }
            case 9: {
                do {
                    var3_2 /* !! */  = (int)fy.jglb("jgth", jgky(int ), (int)152);
                } while (!var4_1);
                throw null;
            }
lbl251:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)fy.jglb("jgti", jgky(int ), (int)153);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl256:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)fy.jglb("jgtj", jgky(int ), (int)154);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl261:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)fy.jglb("jgtk", jgky(int ), (int)155);
                if (!var4_1) ** GOTO lbl219
                throw null;
            }
lbl265:
            // 3 sources

            case 13: {
                var3_2 /* !! */  = (int)fy.jglb("jgtl", jgky(int ), (int)156);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 14: {
                var3_2 /* !! */  = (int)fy.jglb("jgtm", jgky(int ), (int)157);
                if (!var4_1) ** GOTO lbl224
                throw null;
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fy.jglb("jgtn", jgky(int ), (int)158);
                    if (!var4_1) ** GOTO lbl265
                    throw null;
                }
            }
            case 16: {
                var3_2 /* !! */  = (int)fy.jglb("jgto", jgky(int ), (int)159);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl284:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)fy.jglb("jgtp", jgky(int ), (int)160);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl289:
            // 3 sources

            case 18: {
                var3_2 /* !! */  = (int)fy.jglb("jgtq", jgky(int ), (int)161);
                if (!var4_1) ** GOTO lbl233
                throw null;
            }
lbl293:
            // 4 sources

            case 19: {
                var3_2 /* !! */  = (int)fy.jglb("jgtr", jgky(int ), (int)162);
                if (!var4_1) ** GOTO lbl228
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)fy.jglb("jgts", jgky(int ), (int)163);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl302:
            // 3 sources

            case 21: {
                var3_2 /* !! */  = (int)fy.jglb("jgtt", jgky(int ), (int)164);
                if (!var4_1) ** GOTO lbl261
                throw null;
            }
lbl306:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)fy.jglb("jgtu", jgky(int ), (int)165);
                if (!var4_1) ** GOTO lbl289
                throw null;
            }
            case 23: {
                var3_2 /* !! */  = (int)fy.jglb("jgtv", jgky(int ), (int)166);
                if (!var4_1) ** GOTO lbl302
                throw null;
            }
lbl314:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)fy.jglb("jgtw", jgky(int ), (int)167);
                if (!var4_1) ** GOTO lbl233
                throw null;
            }
            case 25: {
                var3_2 /* !! */  = (int)fy.jglb("jgtx", jgky(int ), (int)168);
                if (!var4_1) ** GOTO lbl251
                throw null;
            }
            case 26: 
        }
        var3_2 /* !! */  = (int)fy.jglb("jgty", jgky(int ), (int)169);
        ** while (!var4_1)
lbl325:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jgky(int n2) {
        return jgkz[n2] ^ jgla[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        var6_2 = fy.c;
        var5_3 /* !! */  = fy.b;
        var4_4 = fy.a;
        if (var6_2) {
            throw null;
lbl6:
            // 36 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (fy.mc.field_1724 == null) ** GOTO lbl20
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (fy.mc.field_1687 == null) ** GOTO lbl20
                if (var4_4) ** GOTO lbl6
                if (fy.mc.field_1755 != null) ** GOTO lbl20
                if (var4_4) ** GOTO lbl6
                if (fy.mc.method_1562() != null) ** GOTO lbl24
                if (var4_4) ** GOTO lbl6
lbl20:
                // 4 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.stopBoost();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl24:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (pn.isKey(this.boostBind)) ** GOTO lbl30
                if (var4_4 || var4_4) ** GOTO lbl6
                this.stopBoost();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl30:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = this.resolveSpearSlot();
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_6 = this.hotbarIndex(this.swapSlot.getValue());
                if (var4_4 || var4_4) ** GOTO lbl6
                if (var2_5 < 0) ** GOTO lbl41
                if (var4_4) ** GOTO lbl6
                if (var3_6 < 0) ** GOTO lbl41
                if (var4_4) ** GOTO lbl6
                if (var2_5 != var3_6) ** GOTO lbl45
                if (var4_4) ** GOTO lbl6
lbl41:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.stopBoost();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl45:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.boosting) ** GOTO lbl62
                if (var4_4 || var4_4) ** GOTO lbl6
                this.savedSlot = fy.mc.field_1724.method_31548().method_67532();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.boosting = fy.jglb("jglw", jgky(int ), (int)19);
                if (var4_4 || var4_4) ** GOTO lbl6
                if (fy.mc.field_1724.method_31548().method_67532() != var2_5) {
                    v0 /* !! */  = fy.jglb("jglx", jgky(int ), (int)20);
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    this.spearTurn = fy.jglb("jgly", jgky(int ), (int)21);
                    v0 /* !! */  = (CallSite)this.spearTurn;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                this.timer.reset();
                if (var4_4) ** GOTO lbl6
lbl62:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (!(this.burstDelay.getValue() > 0.0f)) ** GOTO lbl68
                if (var4_4) ** GOTO lbl6
                if (this.timer.finished(this.burstDelay.getValue())) ** GOTO lbl68
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl68:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (!(this.burstDelay.getValue() <= 0.0f)) ** GOTO lbl78
                if (var4_4 || var4_4) ** GOTO lbl6
                this.swapAttack(var2_5);
                if (var4_4 || var4_4) ** GOTO lbl6
                this.swapAttack(var3_6);
                if (var4_4) ** GOTO lbl6
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl95
lbl78:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.spearTurn) {
                    v1 = var2_5;
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    v1 = var3_6;
                }
                this.swapAttack(v1);
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.spearTurn) {
                    v2 /* !! */  = fy.jglb("jglz", jgky(int ), (int)22);
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    this.spearTurn = fy.jglb("jgma", jgky(int ), (int)23);
                    v2 /* !! */  = (CallSite)this.spearTurn;
                }
                if (var4_4) ** GOTO lbl6
lbl95:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.timer.reset();
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl100:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)fy.jglb("jgmb", jgky(int ), (int)24);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 1: {
                var5_3 /* !! */  = (int)fy.jglb("jgmc", jgky(int ), (int)25);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl110:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)fy.jglb("jgmd", jgky(int ), (int)26);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 3: {
                var5_3 /* !! */  = (int)fy.jglb("jgme", jgky(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 4: {
                var5_3 /* !! */  = (int)fy.jglb("jgmf", jgky(int ), (int)28);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl125:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)fy.jglb("jgmg", jgky(int ), (int)29);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl130:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)fy.jglb("jgmh", jgky(int ), (int)30);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 7: {
                var5_3 /* !! */  = (int)fy.jglb("jgmi", jgky(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl140:
            // 5 sources

            case 8: {
                var5_3 /* !! */  = (int)fy.jglb("jgmj", jgky(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl145:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)fy.jglb("jgmk", jgky(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl150:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)fy.jglb("jgml", jgky(int ), (int)34);
                if (!var6_2) ** GOTO lbl130
                throw null;
            }
lbl154:
            // 4 sources

            case 11: {
                var5_3 /* !! */  = (int)fy.jglb("jgmm", jgky(int ), (int)35);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
lbl158:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)fy.jglb("jgmn", jgky(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl163:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)fy.jglb("jgmo", jgky(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl168:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)fy.jglb("jgmp", jgky(int ), (int)38);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl172:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)fy.jglb("jgmq", jgky(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl177:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)fy.jglb("jgmr", jgky(int ), (int)40);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)fy.jglb("jgms", jgky(int ), (int)41);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl186:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)fy.jglb("jgmt", jgky(int ), (int)42);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 19: {
                var5_3 /* !! */  = (int)fy.jglb("jgmu", jgky(int ), (int)43);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)fy.jglb("jgmv", jgky(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 21: {
                var5_3 /* !! */  = (int)fy.jglb("jgmw", jgky(int ), (int)45);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
lbl204:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)fy.jglb("jgmx", jgky(int ), (int)46);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl209:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)fy.jglb("jgmy", jgky(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 24: {
                var5_3 /* !! */  = (int)fy.jglb("jgmz", jgky(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 25: {
                var5_3 /* !! */  = (int)fy.jglb("jgna", jgky(int ), (int)49);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)fy.jglb("jgnb", jgky(int ), (int)50);
                if (!var6_2) ** GOTO lbl186
                throw null;
            }
lbl227:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)fy.jglb("jgnc", jgky(int ), (int)51);
                if (!var6_2) ** GOTO lbl150
                throw null;
            }
lbl231:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)fy.jglb("jgnd", jgky(int ), (int)52);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
lbl235:
            // 2 sources

            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fy.jglb("jgne", jgky(int ), (int)53);
                    if (!var6_2) ** GOTO lbl130
                    throw null;
                }
            }
            case 30: {
                var5_3 /* !! */  = (int)fy.jglb("jgnf", jgky(int ), (int)54);
                if (!var6_2) ** GOTO lbl204
                throw null;
            }
lbl244:
            // 5 sources

            case 31: {
                var5_3 /* !! */  = (int)fy.jglb("jgng", jgky(int ), (int)55);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl249:
            // 3 sources

            case 32: {
                var5_3 /* !! */  = (int)fy.jglb("jgnh", jgky(int ), (int)56);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
lbl253:
            // 2 sources

            case 33: {
                var5_3 /* !! */  = (int)fy.jglb("jgni", jgky(int ), (int)57);
                if (!var6_2) ** GOTO lbl172
                throw null;
            }
lbl257:
            // 3 sources

            case 34: {
                var5_3 /* !! */  = (int)fy.jglb("jgnj", jgky(int ), (int)58);
                if (!var6_2) ** GOTO lbl227
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)fy.jglb("jgnk", jgky(int ), (int)59);
                if (!var6_2) ** GOTO lbl244
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)fy.jglb("jgnl", jgky(int ), (int)60);
                if (!var6_2) break;
                throw null;
            }
            case 37: {
                var5_3 /* !! */  = (int)fy.jglb("jgnm", jgky(int ), (int)61);
                if (!var6_2) ** GOTO lbl231
                throw null;
            }
lbl273:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)fy.jglb("jgnn", jgky(int ), (int)62);
                if (!var6_2) ** GOTO lbl249
                throw null;
            }
            case 39: {
                var5_3 /* !! */  = (int)fy.jglb("jgno", jgky(int ), (int)63);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
            case 40: {
                var5_3 /* !! */  = (int)fy.jglb("jgnp", jgky(int ), (int)64);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
            case 41: {
                var5_3 /* !! */  = (int)fy.jglb("jgnq", jgky(int ), (int)65);
                if (var6_2) {
                    throw null;
                }
            }
lbl289:
            // 4 sources

            case 42: {
                var5_3 /* !! */  = (int)fy.jglb("jgnr", jgky(int ), (int)66);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl294:
            // 2 sources

            case 43: {
                var5_3 /* !! */  = (int)fy.jglb("jgns", jgky(int ), (int)67);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 44: {
                var5_3 /* !! */  = (int)fy.jglb("jgnt", jgky(int ), (int)68);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 45: {
                var5_3 /* !! */  = (int)fy.jglb("jgnu", jgky(int ), (int)69);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 46: {
                var5_3 /* !! */  = (int)fy.jglb("jgnv", jgky(int ), (int)70);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
            case 47: {
                var5_3 /* !! */  = (int)fy.jglb("jgnw", jgky(int ), (int)71);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl317:
            // 3 sources

            case 48: {
                do {
                    var5_3 /* !! */  = (int)fy.jglb("jgnx", jgky(int ), (int)72);
                } while (!var6_2);
                throw null;
            }
            case 49: {
                var5_3 /* !! */  = (int)fy.jglb("jgny", jgky(int ), (int)73);
                if (!var6_2) ** GOTO lbl244
                throw null;
            }
lbl326:
            // 2 sources

            case 50: {
                var5_3 /* !! */  = (int)fy.jglb("jgnz", jgky(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl331:
            // 3 sources

            case 51: {
                var5_3 /* !! */  = (int)fy.jglb("jgoa", jgky(int ), (int)75);
                if (!var6_2) ** GOTO lbl289
                throw null;
            }
lbl335:
            // 2 sources

            case 52: {
                var5_3 /* !! */  = (int)fy.jglb("jgob", jgky(int ), (int)76);
                if (!var6_2) ** GOTO lbl326
                throw null;
            }
lbl339:
            // 3 sources

            case 53: {
                var5_3 /* !! */  = (int)fy.jglb("jgoc", jgky(int ), (int)77);
                if (!var6_2) ** GOTO lbl317
                throw null;
            }
lbl343:
            // 2 sources

            case 54: {
                var5_3 /* !! */  = (int)fy.jglb("jgod", jgky(int ), (int)78);
                if (!var6_2) ** GOTO lbl209
                throw null;
            }
            case 55: {
                var5_3 /* !! */  = (int)fy.jglb("jgoe", jgky(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
            }
            case 56: {
                var5_3 /* !! */  = (int)fy.jglb("jgof", jgky(int ), (int)80);
                if (!var6_2) ** GOTO lbl273
                throw null;
            }
lbl355:
            // 2 sources

            case 57: {
                var5_3 /* !! */  = (int)fy.jglb("jgog", jgky(int ), (int)81);
                if (!var6_2) ** GOTO lbl253
                throw null;
            }
lbl359:
            // 4 sources

            case 58: {
                var5_3 /* !! */  = (int)fy.jglb("jgoh", jgky(int ), (int)82);
                if (!var6_2) ** GOTO lbl186
                throw null;
            }
lbl363:
            // 4 sources

            case 59: {
                var5_3 /* !! */  = (int)fy.jglb("jgoi", jgky(int ), (int)83);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
            case 60: {
                var5_3 /* !! */  = (int)fy.jglb("jgoj", jgky(int ), (int)84);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl371:
            // 2 sources

            case 61: {
                var5_3 /* !! */  = (int)fy.jglb("jgok", jgky(int ), (int)85);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl375:
            // 2 sources

            case 62: {
                var5_3 /* !! */  = (int)fy.jglb("jgol", jgky(int ), (int)86);
                if (!var6_2) ** GOTO lbl371
                throw null;
            }
lbl379:
            // 2 sources

            case 63: {
                var5_3 /* !! */  = (int)fy.jglb("jgom", jgky(int ), (int)87);
                if (!var6_2) ** GOTO lbl235
                throw null;
            }
            case 64: {
                var5_3 /* !! */  = (int)fy.jglb("jgon", jgky(int ), (int)88);
                if (!var6_2) ** GOTO lbl359
                throw null;
            }
            case 65: 
        }
        var5_3 /* !! */  = (int)fy.jglb("jgoo", jgky(int ), (int)89);
        ** while (!var6_2)
lbl390:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopBoost() {
        v0 /* !! */  = fy.rk;
        if (true) ** GOTO lbl5
        block88: while (true) {
            v0 /* !! */  = (long)(v1 - fy.jglb("jgxo", jgop(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1359926761: {
                    break block88;
                }
                case -919322749: {
                    v1 = fy.jglb("jgxp", jgop(int ), (int)93);
                    continue block88;
                }
                case -242350219: {
                    v1 = fy.jglb("jgxq", jgop(int ), (int)94);
                    continue block88;
                }
                case 844749275: {
                    v1 = fy.jglb("jgxr", jgop(int ), (int)95);
                    continue block88;
                }
            }
            break;
        }
        var3_1 = fy.c;
        v2 /* !! */  = fy.rk;
        if (true) ** GOTO lbl22
        block89: while (true) {
            v2 /* !! */  = (long)(v3 - fy.jglb("jgxs", jgop(int ), (int)96));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1359926761: {
                    break block89;
                }
                case -981976525: {
                    v3 = fy.jglb("jgxt", jgop(int ), (int)97);
                    continue block89;
                }
                case -806651923: {
                    v3 = fy.jglb("jgxu", jgop(int ), (int)98);
                    continue block89;
                }
            }
            break;
        }
        var2_2 /* !! */  = fy.b;
        v4 /* !! */  = fy.rk;
        if (true) ** GOTO lbl36
        block90: while (true) {
            v4 /* !! */  = (long)(v5 - fy.jglb("jgxv", jgop(int ), (int)99));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2097900240: {
                    v5 = fy.jglb("jgxw", jgop(int ), (int)100);
                    continue block90;
                }
                case -1359926761: {
                    break block90;
                }
                case -801251844: {
                    v5 = fy.jglb("jgxx", jgop(int ), (int)101);
                    continue block90;
                }
                case 1273100494: {
                    v5 = fy.jglb("jgxy", jgop(int ), (int)102);
                    continue block90;
                }
            }
            break;
        }
        var1_3 = fy.a;
        if (var3_1) {
            throw null;
lbl51:
            // 14 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl51
        v6 /* !! */  = fy.rk;
        if (true) ** GOTO lbl58
        block92: while (true) {
            v6 /* !! */  = (long)(v7 - fy.jglb("jgxz", jgop(int ), (int)103));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1359926761: {
                    break block92;
                }
                case 40156441: {
                    v7 = fy.jglb("jgya", jgop(int ), (int)104);
                    continue block92;
                }
                case 1761676776: {
                    v7 = fy.jglb("jgyb", jgop(int ), (int)105);
                    continue block92;
                }
            }
            break;
        }
        if (this.boosting) ** GOTO lbl74
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl51
                return;
            }
lbl74:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl51
            v8 = fy.jglb("jgyc", jgky(int ), (int)228);
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jgyd", jgop(int ), (int)106)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == fy.jglb("jgye", jgky(int ), (int)229)) break;
                v9 /* !! */  = (long)fy.jglb("jgyf", jgky(int ), (int)230);
            }
            this.boosting = v8;
            if (var1_3 || var1_3) ** GOTO lbl51
            v10 = fy.jglb("jgyg", jgky(int ), (int)231);
            v11 /* !! */  = fy.rk;
            if (true) ** GOTO lbl88
            block94: while (true) {
                v11 /* !! */  = (long)(v12 - fy.jglb("jgyh", jgop(int ), (int)107));
lbl88:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1359926761: {
                        break block94;
                    }
                    case 120750133: {
                        v12 = fy.jglb("jgyi", jgop(int ), (int)108);
                        continue block94;
                    }
                    case 983004143: {
                        v12 = fy.jglb("jgyj", jgop(int ), (int)109);
                        continue block94;
                    }
                }
                break;
            }
            this.spearTurn = v10;
            if (var1_3 || var1_3) ** GOTO lbl51
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jgyk", jgop(int ), (int)110)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == fy.jglb("jgyl", jgky(int ), (int)232)) break;
                v13 /* !! */  = (long)fy.jglb("jgym", jgky(int ), (int)233);
            }
            if (this.savedSlot < 0) ** GOTO lbl246
            if (var1_3) ** GOTO lbl51
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_2 = fy.rk - fy.jglb("jgyn", jgop(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == fy.jglb("jgyo", jgky(int ), (int)234)) break;
                v14 /* !! */  = (long)fy.jglb("jgyp", jgky(int ), (int)235);
            }
            if (this.savedSlot > fy.jglb("jgyq", jgky(int ), (int)236)) ** GOTO lbl246
            if (var1_3) ** GOTO lbl51
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = fy.rk - fy.jglb("jgyr", jgop(int ), (int)112)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == fy.jglb("jgys", jgky(int ), (int)237)) break;
                v15 /* !! */  = (long)fy.jglb("jgyt", jgky(int ), (int)238);
            }
            v16 /* !! */  = fy.rk;
            if (true) ** GOTO lbl122
            block98: while (true) {
                v16 /* !! */  = (long)(v17 - fy.jglb("jgyu", jgop(int ), (int)113));
lbl122:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1537396286: {
                        v17 = fy.jglb("jgyv", jgop(int ), (int)114);
                        continue block98;
                    }
                    case -1359926761: {
                        break block98;
                    }
                    case 985704705: {
                        v17 = fy.jglb("jgyw", jgop(int ), (int)115);
                        continue block98;
                    }
                    case 1846227602: {
                        v17 = fy.jglb("jgyx", jgop(int ), (int)116);
                        continue block98;
                    }
                }
                break;
            }
            if (fy.mc.field_1724 == null) ** GOTO lbl246
            if (var1_3) ** GOTO lbl51
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_4 = fy.rk - fy.jglb("jgyy", jgop(int ), (int)117)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == fy.jglb("jgyz", jgky(int ), (int)239)) break;
                v18 /* !! */  = (long)fy.jglb("jgza", jgky(int ), (int)240);
            }
            v19 /* !! */  = fy.rk;
            if (true) ** GOTO lbl145
            block100: while (true) {
                v19 /* !! */  = (long)(fy.jglb("jgzc", jgop(int ), (int)119) - fy.jglb("jgzb", jgop(int ), (int)118));
lbl145:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1359926761: {
                        break block100;
                    }
                    case 495929661: {
                        continue block100;
                    }
                }
                break;
            }
            if (fy.mc.method_1562() == null) ** GOTO lbl246
            if (var1_3 || var1_3) ** GOTO lbl51
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = fy.rk - fy.jglb("jgzd", jgop(int ), (int)120)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == fy.jglb("jgze", jgky(int ), (int)241)) break;
                v20 /* !! */  = (long)fy.jglb("jgzf", jgky(int ), (int)242);
            }
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = fy.rk - fy.jglb("jgzg", jgop(int ), (int)121)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == fy.jglb("jgzh", jgky(int ), (int)243)) break;
                v21 /* !! */  = (long)fy.jglb("jgzi", jgky(int ), (int)244);
            }
            v22 = fy.mc.method_1562();
            v23 /* !! */  = fy.rk;
            if (true) ** GOTO lbl167
            block103: while (true) {
                v23 /* !! */  = (long)(fy.jglb("jgzk", jgop(int ), (int)123) - fy.jglb("jgzj", jgop(int ), (int)122));
lbl167:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1927893565: {
                        continue block103;
                    }
                    case -1359926761: {
                        break block103;
                    }
                }
                break;
            }
            v24 /* !! */  = fy.rk;
            if (true) ** GOTO lbl176
            block104: while (true) {
                v24 /* !! */  = (long)(v25 - fy.jglb("jgzl", jgop(int ), (int)124));
lbl176:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1359926761: {
                        break block104;
                    }
                    case 546155281: {
                        v25 = fy.jglb("jgzm", jgop(int ), (int)125);
                        continue block104;
                    }
                    case 948329739: {
                        v25 = fy.jglb("jgzn", jgop(int ), (int)126);
                        continue block104;
                    }
                }
                break;
            }
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_7 = fy.rk - fy.jglb("jgzo", jgop(int ), (int)127)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == fy.jglb("jgzp", jgky(int ), (int)245)) break;
                v26 /* !! */  = (long)fy.jglb("jgzq", jgky(int ), (int)246);
            }
            v27 = new class_2868(this.savedSlot);
            v28 /* !! */  = fy.rk;
            if (true) ** GOTO lbl195
            block106: while (true) {
                v28 /* !! */  = (long)(v29 - fy.jglb("jgzr", jgop(int ), (int)128));
lbl195:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case -1359926761: {
                        break block106;
                    }
                    case -833134064: {
                        v29 = fy.jglb("jgzs", jgop(int ), (int)129);
                        continue block106;
                    }
                    case -789014792: {
                        v29 = fy.jglb("jgzt", jgop(int ), (int)130);
                        continue block106;
                    }
                    case 825707072: {
                        v29 = fy.jglb("jgzu", jgop(int ), (int)131);
                        continue block106;
                    }
                }
                break;
            }
            v22.method_52787((class_2596)v27);
            if (var1_3 || var1_3) ** GOTO lbl51
            v30 /* !! */  = fy.rk;
            if (true) ** GOTO lbl213
            block107: while (true) {
                v30 /* !! */  = (long)(v31 - fy.jglb("jgzv", jgop(int ), (int)132));
lbl213:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1654579669: {
                        v31 = fy.jglb("jgzw", jgop(int ), (int)133);
                        continue block107;
                    }
                    case -1359926761: {
                        break block107;
                    }
                    case 1759985554: {
                        v31 = fy.jglb("jgzx", jgop(int ), (int)134);
                        continue block107;
                    }
                }
                break;
            }
            while (true) {
                if ((v32 /* !! */  = (cfr_temp_8 = fy.rk - fy.jglb("jgzy", jgop(int ), (int)135)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  == fy.jglb("jgzz", jgky(int ), (int)247)) break;
                v32 /* !! */  = (long)fy.jglb("jhaa", jgky(int ), (int)248);
            }
            v33 = fy.mc.field_1724;
            while (true) {
                if ((v34 /* !! */  = (cfr_temp_9 = fy.rk - fy.jglb("jhab", jgop(int ), (int)136)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v34 /* !! */  == fy.jglb("jhac", jgky(int ), (int)249)) break;
                v34 /* !! */  = (long)fy.jglb("jhad", jgky(int ), (int)250);
            }
            v35 = v33.method_31548();
            while (true) {
                if ((v36 /* !! */  = (cfr_temp_10 = fy.rk - fy.jglb("jhae", jgop(int ), (int)137)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v36 /* !! */  == fy.jglb("jhaf", jgky(int ), (int)251)) break;
                v36 /* !! */  = (long)fy.jglb("jhag", jgky(int ), (int)252);
            }
            while (true) {
                if ((v37 /* !! */  = (cfr_temp_11 = fy.rk - fy.jglb("jhah", jgop(int ), (int)138)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v37 /* !! */  == fy.jglb("jhai", jgky(int ), (int)253)) break;
                v37 /* !! */  = (long)fy.jglb("jhaj", jgky(int ), (int)254);
            }
            v35.method_61496(this.savedSlot);
            if (var1_3) ** GOTO lbl51
lbl246:
            // 5 sources

            if (var1_3 || var1_3) ** GOTO lbl51
            v38 = fy.jglb("jhak", jgky(int ), (int)255);
            v39 /* !! */  = fy.rk;
            if (true) ** GOTO lbl252
            block112: while (true) {
                v39 /* !! */  = (long)(fy.jglb("jham", jgop(int ), (int)140) - fy.jglb("jhal", jgop(int ), (int)139));
lbl252:
                // 2 sources

                switch ((int)v39 /* !! */ ) {
                    case -1359926761: {
                        break block112;
                    }
                    case 1134884822: {
                        continue block112;
                    }
                }
                break;
            }
            this.savedSlot = (int)v38;
            if (!var1_3 && !var1_3) ** break;
            ** continue;
            return;
lbl261:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fy.jglb("jhan", jgky(int ), (int)256);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl347
                    break;
                }
            }
lbl267:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fy.jglb("jhao", jgky(int ), (int)257);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl272:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fy.jglb("jhap", jgky(int ), (int)258);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 3: {
                var2_2 /* !! */  = (int)fy.jglb("jhaq", jgky(int ), (int)259);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl282:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)fy.jglb("jhar", jgky(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl287:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)fy.jglb("jhas", jgky(int ), (int)261);
                } while (!var3_1);
                throw null;
            }
lbl292:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fy.jglb("jhat", jgky(int ), (int)262);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 7: {
                var2_2 /* !! */  = (int)fy.jglb("jhau", jgky(int ), (int)263);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl302:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fy.jglb("jhav", jgky(int ), (int)264);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 9: {
                var2_2 /* !! */  = (int)fy.jglb("jhaw", jgky(int ), (int)265);
                if (!var3_1) ** GOTO lbl267
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fy.jglb("jhax", jgky(int ), (int)266);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 11: {
                var2_2 /* !! */  = (int)fy.jglb("jhay", jgky(int ), (int)267);
                if (!var3_1) ** GOTO lbl292
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)fy.jglb("jhaz", jgky(int ), (int)268);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl325:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fy.jglb("jhba", jgky(int ), (int)269);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl330:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)fy.jglb("jhbb", jgky(int ), (int)270);
                if (!var3_1) break;
                throw null;
            }
lbl334:
            // 2 sources

            case 15: {
                do {
                    var2_2 /* !! */  = (int)fy.jglb("jhbc", jgky(int ), (int)271);
                } while (!var3_1);
                throw null;
            }
lbl339:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)fy.jglb("jhbd", jgky(int ), (int)272);
                if (!var3_1) ** GOTO lbl282
                throw null;
            }
lbl343:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)fy.jglb("jhbe", jgky(int ), (int)273);
                if (!var3_1) ** GOTO lbl302
                throw null;
            }
lbl347:
            // 4 sources

            case 18: {
                var2_2 /* !! */  = (int)fy.jglb("jhbf", jgky(int ), (int)274);
                if (!var3_1) ** GOTO lbl261
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)fy.jglb("jhbg", jgky(int ), (int)275);
                if (!var3_1) ** GOTO lbl347
                throw null;
            }
lbl355:
            // 3 sources

            case 20: {
                var2_2 /* !! */  = (int)fy.jglb("jhbh", jgky(int ), (int)276);
                if (!var3_1) ** GOTO lbl282
                throw null;
            }
            case 21: {
                var2_2 /* !! */  = (int)fy.jglb("jhbi", jgky(int ), (int)277);
                if (!var3_1) ** GOTO lbl339
                throw null;
            }
            case 22: {
                do {
                    var2_2 /* !! */  = (int)fy.jglb("jhbj", jgky(int ), (int)278);
                } while (!var3_1);
                throw null;
            }
lbl368:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)fy.jglb("jhbk", jgky(int ), (int)279);
                if (!var3_1) ** GOTO lbl272
                throw null;
            }
            case 24: 
        }
        var2_2 /* !! */  = (int)fy.jglb("jhbl", jgky(int ), (int)280);
        ** while (!var3_1)
lbl375:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jhdm() {
        fy.jgla[100] = -851991600;
        fy.jgla[101] = 630870596;
        fy.jgla[102] = -645199063;
        fy.jgla[103] = -1010102557;
        fy.jgla[104] = -1630856321;
        fy.jgla[105] = 235297819;
        fy.jgla[106] = 1086381519;
        fy.jgla[107] = 1059796409;
        fy.jgla[108] = -1780664153;
        fy.jgla[109] = 1168612684;
        fy.jgla[110] = -2086197749;
        fy.jgla[111] = 886011124;
        fy.jgla[112] = -889786466;
        fy.jgla[113] = -1097522009;
        fy.jgla[114] = 335502136;
        fy.jgla[115] = 274557543;
        fy.jgla[116] = -348078514;
        fy.jgla[117] = -1299267165;
        fy.jgla[118] = 603363833;
        fy.jgla[119] = 884427948;
        fy.jgla[120] = -955670492;
        fy.jgla[121] = 66324358;
        fy.jgla[122] = 551455566;
        fy.jgla[123] = -1325113056;
        fy.jgla[124] = -743888457;
        fy.jgla[125] = 1486658783;
        fy.jgla[126] = -1063501254;
        fy.jgla[127] = 1274926263;
        fy.jgla[128] = 1073832361;
        fy.jgla[129] = -162097264;
        fy.jgla[130] = -69919786;
        fy.jgla[131] = -435753592;
        fy.jgla[132] = 750404536;
        fy.jgla[133] = -575100472;
        fy.jgla[134] = 1939329572;
        fy.jgla[135] = 1473171764;
        fy.jgla[136] = -1411323917;
        fy.jgla[137] = 1072407470;
        fy.jgla[138] = -1192038769;
        fy.jgla[139] = 518812532;
        fy.jgla[140] = 641507671;
        fy.jgla[141] = 1804583524;
        fy.jgla[142] = -541367757;
        fy.jgla[143] = -1732947915;
        fy.jgla[144] = -1303843630;
        fy.jgla[145] = 1909279408;
        fy.jgla[146] = 1281097266;
        fy.jgla[147] = -647735071;
        fy.jgla[148] = 1482124727;
        fy.jgla[149] = -1404862296;
        fy.jgla[150] = -1773634619;
        fy.jgla[151] = 1918306814;
        fy.jgla[152] = -1128475274;
        fy.jgla[153] = 1689908344;
        fy.jgla[154] = -934574679;
        fy.jgla[155] = 1684802262;
        fy.jgla[156] = -14281997;
        fy.jgla[157] = 1561304881;
        fy.jgla[158] = 1814394481;
        fy.jgla[159] = -499019375;
        fy.jgla[160] = 393969054;
        fy.jgla[161] = -956183568;
        fy.jgla[162] = 1214388615;
        fy.jgla[163] = -1756222997;
        fy.jgla[164] = 1033316379;
        fy.jgla[165] = -1573085254;
        fy.jgla[166] = 1457191024;
        fy.jgla[167] = -511003865;
        fy.jgla[168] = -449103580;
        fy.jgla[169] = 38521487;
        fy.jgla[170] = 664432302;
        fy.jgla[171] = -1061374535;
        fy.jgla[172] = -1924865228;
        fy.jgla[173] = -777944688;
        fy.jgla[174] = 1207376240;
        fy.jgla[175] = -1882500987;
        fy.jgla[176] = -2088498183;
        fy.jgla[177] = 1301690058;
        fy.jgla[178] = 640083688;
        fy.jgla[179] = 1617264734;
        fy.jgla[180] = -265197514;
        fy.jgla[181] = -234220446;
        fy.jgla[182] = 1993866907;
        fy.jgla[183] = -1378618356;
        fy.jgla[184] = 1158998055;
        fy.jgla[185] = -1960910124;
        fy.jgla[186] = 395402547;
        fy.jgla[187] = -713532195;
        fy.jgla[188] = 724087653;
        fy.jgla[189] = 720707404;
        fy.jgla[190] = 277074902;
        fy.jgla[191] = 755373559;
        fy.jgla[192] = -1100860227;
        fy.jgla[193] = -65797472;
        fy.jgla[194] = 712996307;
        fy.jgla[195] = 1966203011;
        fy.jgla[196] = -1738520247;
        fy.jgla[197] = -1427554637;
        fy.jgla[198] = 1959530460;
        fy.jgla[199] = -627032892;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isLungeSpear(class_1799 var1_1) {
        block98: {
            block97: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jgtz", jgop(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == fy.jglb("jgua", jgky(int ), (int)170)) break;
                    v0 /* !! */  = (long)fy.jglb("jgub", jgky(int ), (int)171);
                }
                var7_2 = fy.c;
                v1 /* !! */  = fy.rk;
                if (true) ** GOTO lbl12
                block52: while (true) {
                    v1 /* !! */  = (long)(v2 - fy.jglb("jguc", jgop(int ), (int)58));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1359926761: {
                            break block52;
                        }
                        case -674155288: {
                            v2 = fy.jglb("jgud", jgop(int ), (int)59);
                            continue block52;
                        }
                        case 9680131: {
                            v2 = fy.jglb("jgue", jgop(int ), (int)60);
                            continue block52;
                        }
                        case 290485143: {
                            v2 = fy.jglb("jguf", jgop(int ), (int)61);
                            continue block52;
                        }
                    }
                    break;
                }
                var6_3 /* !! */  = fy.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jgug", jgop(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fy.jglb("jguh", jgky(int ), (int)172)) break;
                    v3 /* !! */  = (long)fy.jglb("jgui", jgky(int ), (int)173);
                }
                var5_4 = fy.a;
                if (var7_2) {
                    throw null;
lbl34:
                    // 14 sources

                    return (boolean)fy.jglb("jguj", jgky(int ), (int)174);
                }
                if (var5_4 || var5_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fy.rk - fy.jglb("jguk", jgop(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fy.jglb("jgul", jgky(int ), (int)175)) break;
                    v4 /* !! */  = (long)fy.jglb("jgum", jgky(int ), (int)176);
                }
                if (var1_1.method_7960()) break block97;
                if (var5_4) ** GOTO lbl34
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fy.rk - fy.jglb("jgun", jgop(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fy.jglb("jguo", jgky(int ), (int)177)) break;
                    v5 /* !! */  = (long)fy.jglb("jgup", jgky(int ), (int)178);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = fy.rk - fy.jglb("jguq", jgop(int ), (int)65)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fy.jglb("jgur", jgky(int ), (int)179)) break;
                    v6 /* !! */  = (long)fy.jglb("jgus", jgky(int ), (int)180);
                }
                if (var1_1.method_31573(class_3489.field_63257)) break block98;
                if (var5_4) ** GOTO lbl34
            }
            if (var5_4 || var5_4) ** GOTO lbl34
            return (boolean)fy.jglb("jgut", jgky(int ), (int)181);
        }
        if (var5_4 || var5_4) ** GOTO lbl34
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = fy.rk - fy.jglb("jguu", jgop(int ), (int)66)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == fy.jglb("jguv", jgky(int ), (int)182)) break;
            v7 /* !! */  = (long)fy.jglb("jguw", jgky(int ), (int)183);
        }
        var2_5 = class_1890.method_57532((class_1799)var1_1);
        if (var5_4 || var5_4) ** GOTO lbl34
        v8 /* !! */  = fy.rk;
        if (true) ** GOTO lbl76
        block59: while (true) {
            v8 /* !! */  = (long)(fy.jglb("jguy", jgop(int ), (int)68) - fy.jglb("jgux", jgop(int ), (int)67));
lbl76:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2115547743: {
                    continue block59;
                }
                case -1359926761: {
                    break block59;
                }
            }
            break;
        }
        v9 = var2_5.method_57534();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = fy.rk - fy.jglb("jguz", jgop(int ), (int)69)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == fy.jglb("jgva", jgky(int ), (int)184)) break;
            v10 /* !! */  = (long)fy.jglb("jgvb", jgky(int ), (int)185);
        }
        var3_6 = v9.iterator();
        if (var5_4) ** GOTO lbl34
        block61: while (true) {
            block99: {
                if (var5_4 || var5_4) ** GOTO lbl34
                v11 /* !! */  = fy.rk;
                if (true) ** GOTO lbl96
                block62: while (true) {
                    v11 /* !! */  = (long)(v12 - fy.jglb("jgvc", jgop(int ), (int)70));
lbl96:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1359926761: {
                            break block62;
                        }
                        case -467541898: {
                            v12 = fy.jglb("jgvd", jgop(int ), (int)71);
                            continue block62;
                        }
                        case 257013870: {
                            v12 = fy.jglb("jgve", jgop(int ), (int)72);
                            continue block62;
                        }
                    }
                    break;
                }
                if (!var3_6.hasNext()) ** GOTO lbl144
                if (var5_4) ** GOTO lbl34
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = fy.rk - fy.jglb("jgvf", jgop(int ), (int)73)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == fy.jglb("jgvg", jgky(int ), (int)186)) break;
                    v13 /* !! */  = (long)fy.jglb("jgvh", jgky(int ), (int)187);
                }
                var4_7 = (class_6880)var3_6.next();
                if (var5_4 || var5_4) ** GOTO lbl34
                v14 /* !! */  = fy.rk;
                if (true) ** GOTO lbl119
                block64: while (true) {
                    v14 /* !! */  = (long)(fy.jglb("jgvj", jgop(int ), (int)75) - fy.jglb("jgvi", jgop(int ), (int)74));
lbl119:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1359926761: {
                            break block64;
                        }
                        case -487845995: {
                            continue block64;
                        }
                    }
                    break;
                }
                v15 /* !! */  = fy.rk;
                if (true) ** GOTO lbl128
                block65: while (true) {
                    v15 /* !! */  = (long)(fy.jglb("jgvl", jgop(int ), (int)77) - fy.jglb("jgvk", jgop(int ), (int)76));
lbl128:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1359926761: {
                            break block65;
                        }
                        case 1218113539: {
                            continue block65;
                        }
                    }
                    break;
                }
                if (!var4_7.method_40225(class_1893.field_63420)) break block99;
                if (var5_4 || var5_4) ** GOTO lbl34
                return (boolean)fy.jglb("jgvm", jgky(int ), (int)188);
            }
            if (var5_4) ** GOTO lbl34
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl34
                    if (!var7_2) continue block61;
                    throw null;
                }
lbl144:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return (boolean)fy.jglb("jgvn", jgky(int ), (int)189);
lbl147:
                // 2 sources

                case 0: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvo", jgky(int ), (int)190);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
                case 1: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvp", jgky(int ), (int)191);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl157:
                // 2 sources

                case 2: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvq", jgky(int ), (int)192);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl162:
                // 2 sources

                case 3: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvr", jgky(int ), (int)193);
                    if (!var7_2) ** GOTO lbl147
                    throw null;
                }
lbl166:
                // 2 sources

                case 4: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvs", jgky(int ), (int)194);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl171:
                // 2 sources

                case 5: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvt", jgky(int ), (int)195);
                    if (!var7_2) ** GOTO lbl157
                    throw null;
                }
lbl175:
                // 3 sources

                case 6: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvu", jgky(int ), (int)196);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl180:
                // 2 sources

                case 7: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvv", jgky(int ), (int)197);
                    if (!var7_2) ** GOTO lbl171
                    throw null;
                }
                case 8: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvw", jgky(int ), (int)198);
                    if (!var7_2) ** GOTO lbl175
                    throw null;
                }
lbl188:
                // 3 sources

                case 9: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvx", jgky(int ), (int)199);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)fy.jglb("jgvy", jgky(int ), (int)200);
                        if (var7_2) {
                            throw null;
                        }
                        ** GOTO lbl213
                        break;
                    }
                }
                case 11: {
                    var6_3 /* !! */  = (int)fy.jglb("jgvz", jgky(int ), (int)201);
                    if (!var7_2) break block61;
                    throw null;
                }
lbl203:
                // 4 sources

                case 12: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwa", jgky(int ), (int)202);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl231
                }
                case 13: {
                    do {
                        var6_3 /* !! */  = (int)fy.jglb("jgwb", jgky(int ), (int)203);
                    } while (!var7_2);
                    throw null;
                }
lbl213:
                // 3 sources

                case 14: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwc", jgky(int ), (int)204);
                    if (!var7_2) ** GOTO lbl180
                    throw null;
                }
lbl217:
                // 3 sources

                case 15: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwd", jgky(int ), (int)205);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
lbl222:
                // 4 sources

                case 16: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwe", jgky(int ), (int)206);
                    if (!var7_2) ** GOTO lbl217
                    throw null;
                }
                case 17: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwf", jgky(int ), (int)207);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
lbl231:
                // 2 sources

                case 18: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwg", jgky(int ), (int)208);
                    if (!var7_2) ** GOTO lbl175
                    throw null;
                }
                case 19: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwh", jgky(int ), (int)209);
                    if (!var7_2) ** GOTO lbl217
                    throw null;
                }
                case 20: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwi", jgky(int ), (int)210);
                    if (!var7_2) ** GOTO lbl213
                    throw null;
                }
lbl243:
                // 2 sources

                case 21: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwj", jgky(int ), (int)211);
                    if (!var7_2) ** GOTO lbl166
                    throw null;
                }
lbl247:
                // 2 sources

                case 22: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwk", jgky(int ), (int)212);
                    if (!var7_2) ** GOTO lbl188
                    throw null;
                }
                case 23: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwl", jgky(int ), (int)213);
                    if (!var7_2) ** GOTO lbl162
                    throw null;
                }
                case 24: {
                    var6_3 /* !! */  = (int)fy.jglb("jgwm", jgky(int ), (int)214);
                    if (!var7_2) ** GOTO lbl188
                    throw null;
                }
                case 25: 
            }
            break;
        }
        var6_3 /* !! */  = (int)fy.jglb("jgwn", jgky(int ), (int)215);
        ** while (!var7_2)
lbl262:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jhdp() {
        fy.jgoq[0] = 7515068884280427151L;
        fy.jgoq[1] = 7348377019357482256L;
        fy.jgoq[2] = -4706438759583767222L;
        fy.jgoq[3] = -7725355142965101648L;
        fy.jgoq[4] = 4963645352568161569L;
        fy.jgoq[5] = 1847312030693853171L;
        fy.jgoq[6] = 1098279623848281517L;
        fy.jgoq[7] = 5143462286698854859L;
        fy.jgoq[8] = 8973832686573965986L;
        fy.jgoq[9] = 8120316772375558960L;
        fy.jgoq[10] = 5080051506499037390L;
        fy.jgoq[11] = -1182193890411207774L;
        fy.jgoq[12] = -3711669822819897294L;
        fy.jgoq[13] = 1754741514557824159L;
        fy.jgoq[14] = 5049956447035788242L;
        fy.jgoq[15] = -535765563279235110L;
        fy.jgoq[16] = -2732605852206770607L;
        fy.jgoq[17] = -4259965974134305087L;
        fy.jgoq[18] = 5717379299817998545L;
        fy.jgoq[19] = -7566864568945237487L;
        fy.jgoq[20] = -1432844582428453247L;
        fy.jgoq[21] = -2306140280420477309L;
        fy.jgoq[22] = -1147607736120981989L;
        fy.jgoq[23] = 443460287175868229L;
        fy.jgoq[24] = -5549554511062885351L;
        fy.jgoq[25] = -1929957860075060419L;
        fy.jgoq[26] = -1328522530882332387L;
        fy.jgoq[27] = 7723371455472700398L;
        fy.jgoq[28] = 4070700698556509554L;
        fy.jgoq[29] = -8004733462138825705L;
        fy.jgoq[30] = 2849258966240617395L;
        fy.jgoq[31] = 1210221660411540317L;
        fy.jgoq[32] = 691839437502811697L;
        fy.jgoq[33] = 342434693096635731L;
        fy.jgoq[34] = 9019820702421299239L;
        fy.jgoq[35] = 7738214932164586795L;
        fy.jgoq[36] = 421330064148108702L;
        fy.jgoq[37] = 3020478379544018540L;
        fy.jgoq[38] = 7007552782157899258L;
        fy.jgoq[39] = 7282204995145459093L;
        fy.jgoq[40] = -5803539834522163816L;
        fy.jgoq[41] = -2566878591922713596L;
        fy.jgoq[42] = -5574270495335972096L;
        fy.jgoq[43] = 6016011726227486241L;
        fy.jgoq[44] = 7752584397149050548L;
        fy.jgoq[45] = 4281362287712821340L;
        fy.jgoq[46] = -2331323744891933892L;
        fy.jgoq[47] = 5670330993681423280L;
        fy.jgoq[48] = -8286988793133583305L;
        fy.jgoq[49] = -2988767141179919239L;
        fy.jgoq[50] = 710116405282714172L;
        fy.jgoq[51] = 5711195334940500074L;
        fy.jgoq[52] = 4378070210525929090L;
        fy.jgoq[53] = 239085056150815345L;
        fy.jgoq[54] = -816738158938845208L;
        fy.jgoq[55] = -7247293624698666062L;
        fy.jgoq[56] = 3684449029349932448L;
        fy.jgoq[57] = 8142251593184342200L;
        fy.jgoq[58] = -4769628679904683311L;
        fy.jgoq[59] = -6807841774429802829L;
        fy.jgoq[60] = 1650539768738775080L;
        fy.jgoq[61] = -2875121128759823405L;
        fy.jgoq[62] = -6693526974434057088L;
        fy.jgoq[63] = -7984878103703749014L;
        fy.jgoq[64] = -13791505977075143L;
        fy.jgoq[65] = -9019461776327344832L;
        fy.jgoq[66] = 1601246293488223357L;
        fy.jgoq[67] = -2309718695400799228L;
        fy.jgoq[68] = 6711029886183114096L;
        fy.jgoq[69] = 2347024882709758326L;
        fy.jgoq[70] = -6367439405168593335L;
        fy.jgoq[71] = 1009803289259919377L;
        fy.jgoq[72] = 2260762809549064221L;
        fy.jgoq[73] = -7496206209508248173L;
        fy.jgoq[74] = -2505302449752581947L;
        fy.jgoq[75] = -5944519806470360693L;
        fy.jgoq[76] = 3190820207427585110L;
        fy.jgoq[77] = -5232234301716705039L;
        fy.jgoq[78] = -1934584465597729078L;
        fy.jgoq[79] = -8494193592894839982L;
        fy.jgoq[80] = 7656301777954274521L;
        fy.jgoq[81] = 4186315088114275728L;
        fy.jgoq[82] = -4670755808629565333L;
        fy.jgoq[83] = -2698437800419603561L;
        fy.jgoq[84] = -7142647878171718508L;
        fy.jgoq[85] = -3393866856143536487L;
        fy.jgoq[86] = -6241336251269963237L;
        fy.jgoq[87] = 7779720961253255201L;
        fy.jgoq[88] = 793266249389018463L;
        fy.jgoq[89] = 426381158324001650L;
        fy.jgoq[90] = -6184952663764909980L;
        fy.jgoq[91] = -4072330535701438551L;
        fy.jgoq[92] = 4819366489053104623L;
        fy.jgoq[93] = -35940859742907406L;
        fy.jgoq[94] = 7170648198852869291L;
        fy.jgoq[95] = -113598563183098212L;
        fy.jgoq[96] = -208400330099963879L;
        fy.jgoq[97] = 6048041766214620562L;
        fy.jgoq[98] = 1234125216772541943L;
        fy.jgoq[99] = 6506333589443773055L;
    }

    private static /* synthetic */ void jhdi() {
        fy.jgkz[100] = -851991599;
        fy.jgkz[101] = -1059746377;
        fy.jgkz[102] = -645199064;
        fy.jgkz[103] = -1842429497;
        fy.jgkz[104] = -1630856322;
        fy.jgkz[105] = 1735123627;
        fy.jgkz[106] = 1086381518;
        fy.jgkz[107] = 640167535;
        fy.jgkz[108] = -1780664154;
        fy.jgkz[109] = 1070467050;
        fy.jgkz[110] = -2086197746;
        fy.jgkz[111] = 886011124;
        fy.jgkz[112] = -889786465;
        fy.jgkz[113] = -1097522012;
        fy.jgkz[114] = 335502136;
        fy.jgkz[115] = 274557551;
        fy.jgkz[116] = -348078522;
        fy.jgkz[117] = -1299267162;
        fy.jgkz[118] = 603363835;
        fy.jgkz[119] = 884427950;
        fy.jgkz[120] = -955670491;
        fy.jgkz[121] = 1782832234;
        fy.jgkz[122] = -551455567;
        fy.jgkz[123] = -372103580;
        fy.jgkz[124] = 263755283;
        fy.jgkz[125] = 1486658783;
        fy.jgkz[126] = -1063501261;
        fy.jgkz[127] = 1274926262;
        fy.jgkz[128] = -405550322;
        fy.jgkz[129] = 162097263;
        fy.jgkz[130] = -1372911446;
        fy.jgkz[131] = 435753591;
        fy.jgkz[132] = -968547279;
        fy.jgkz[133] = 575100471;
        fy.jgkz[134] = 1939329573;
        fy.jgkz[135] = 1263943345;
        fy.jgkz[136] = -1411323918;
        fy.jgkz[137] = 1865768390;
        fy.jgkz[138] = -1192038770;
        fy.jgkz[139] = 758957604;
        fy.jgkz[140] = 641507670;
        fy.jgkz[141] = -1730898848;
        fy.jgkz[142] = 541367756;
        fy.jgkz[143] = -1732947932;
        fy.jgkz[144] = -1303843641;
        fy.jgkz[145] = 1909279420;
        fy.jgkz[146] = 1281097249;
        fy.jgkz[147] = -647735064;
        fy.jgkz[148] = 1482124728;
        fy.jgkz[149] = -1404862280;
        fy.jgkz[150] = -1773634596;
        fy.jgkz[151] = 1918306798;
        fy.jgkz[152] = -1128475292;
        fy.jgkz[153] = 1689908337;
        fy.jgkz[154] = -934574671;
        fy.jgkz[155] = 1684802242;
        fy.jgkz[156] = -14281990;
        fy.jgkz[157] = 1561304886;
        fy.jgkz[158] = 1814394469;
        fy.jgkz[159] = -499019368;
        fy.jgkz[160] = 393969046;
        fy.jgkz[161] = -956183564;
        fy.jgkz[162] = 1214388619;
        fy.jgkz[163] = -1756223002;
        fy.jgkz[164] = 1033316380;
        fy.jgkz[165] = -1573085262;
        fy.jgkz[166] = 1457191035;
        fy.jgkz[167] = -511003861;
        fy.jgkz[168] = -449103556;
        fy.jgkz[169] = 38521495;
        fy.jgkz[170] = 664432303;
        fy.jgkz[171] = -2021336507;
        fy.jgkz[172] = -1924865227;
        fy.jgkz[173] = -855391292;
        fy.jgkz[174] = 1207376240;
        fy.jgkz[175] = -1882500988;
        fy.jgkz[176] = -53187790;
        fy.jgkz[177] = 1301690059;
        fy.jgkz[178] = -698093896;
        fy.jgkz[179] = -1617264735;
        fy.jgkz[180] = 1988203357;
        fy.jgkz[181] = -234220446;
        fy.jgkz[182] = -1993866908;
        fy.jgkz[183] = -1400089207;
        fy.jgkz[184] = -1158998056;
        fy.jgkz[185] = 1770773812;
        fy.jgkz[186] = -395402548;
        fy.jgkz[187] = 1219756696;
        fy.jgkz[188] = 724087652;
        fy.jgkz[189] = 720707404;
        fy.jgkz[190] = 277074901;
        fy.jgkz[191] = 755373540;
        fy.jgkz[192] = -1100860231;
        fy.jgkz[193] = -65797464;
        fy.jgkz[194] = 712996306;
        fy.jgkz[195] = 1966203015;
        fy.jgkz[196] = -1738520244;
        fy.jgkz[197] = -1427554652;
        fy.jgkz[198] = 1959530456;
        fy.jgkz[199] = -627032868;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = fy.rk;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - fy.jglb("jhce", jgop(int ), (int)151));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1359926761: {
                    break block21;
                }
                case 621186345: {
                    v1 = fy.jglb("jhcf", jgop(int ), (int)152);
                    continue block21;
                }
                case 1469750510: {
                    v1 = fy.jglb("jhcg", jgop(int ), (int)153);
                    continue block21;
                }
                case 2033889363: {
                    v1 = fy.jglb("jhch", jgop(int ), (int)154);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = fy.c;
        v2 /* !! */  = fy.rk;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - fy.jglb("jhci", jgop(int ), (int)155));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1359926761: {
                    break block22;
                }
                case -661655027: {
                    v3 = fy.jglb("jhcj", jgop(int ), (int)156);
                    continue block22;
                }
                case 1435493052: {
                    v3 = fy.jglb("jhck", jgop(int ), (int)157);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = fy.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jhcl", jgop(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fy.jglb("jhcm", jgky(int ), (int)289)) break;
                    v4 /* !! */  = (long)fy.jglb("jhcn", jgky(int ), (int)290);
                }
                var1_3 = fy.a;
                if (var3_1) {
                    throw null;
lbl44:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jhco", jgop(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fy.jglb("jhcp", jgky(int ), (int)291)) break;
                    v5 /* !! */  = (long)fy.jglb("jhcq", jgky(int ), (int)292);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fy.rk - fy.jglb("jhcr", jgop(int ), (int)160)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fy.jglb("jhcs", jgky(int ), (int)293)) break;
                    v6 /* !! */  = (long)fy.jglb("jhct", jgky(int ), (int)294);
                }
                if (this.autoSpear.isValue()) ** GOTO lbl65
                if (var1_3) ** GOTO lbl44
                v7 = fy.jglb("jhcu", jgky(int ), (int)295);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl68
lbl65:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = fy.jglb("jhcv", jgky(int ), (int)296);
lbl68:
                // 2 sources

                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fy.rk - fy.jglb("jhcw", jgop(int ), (int)161)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fy.jglb("jhcx", jgky(int ), (int)297)) break;
                    v8 /* !! */  = (long)fy.jglb("jhcy", jgky(int ), (int)298);
                }
                return (boolean)v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)fy.jglb("jhcz", jgky(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: {
                var2_2 /* !! */  = (int)fy.jglb("jhda", jgky(int ), (int)300);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fy.jglb("jhdb", jgky(int ), (int)301);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl100
                    break;
                }
            }
lbl91:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)fy.jglb("jhdc", jgky(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 4: {
                var2_2 /* !! */  = (int)fy.jglb("jhdd", jgky(int ), (int)303);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl100:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)fy.jglb("jhde", jgky(int ), (int)304);
                if (!var3_1) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fy.jglb("jhdf", jgky(int ), (int)305);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)fy.jglb("jhdg", jgky(int ), (int)306);
        ** while (!var3_1)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long jgop(int n2) {
        return jgoq[n2] ^ jgor[n2];
    }

    private static /* synthetic */ void jhdq() {
        fy.jgoq[100] = 4505847407701225217L;
        fy.jgoq[101] = -4357322116875437973L;
        fy.jgoq[102] = 6785281769885666285L;
        fy.jgoq[103] = -3711829371453619318L;
        fy.jgoq[104] = -8060231538933801609L;
        fy.jgoq[105] = 2651341336710922498L;
        fy.jgoq[106] = -7472957468955170587L;
        fy.jgoq[107] = 1241464981335203735L;
        fy.jgoq[108] = -6977433433655011945L;
        fy.jgoq[109] = 699171606361406770L;
        fy.jgoq[110] = -674388638874406468L;
        fy.jgoq[111] = -5884273353842928540L;
        fy.jgoq[112] = 5363159409460494095L;
        fy.jgoq[113] = -4358191809145486904L;
        fy.jgoq[114] = -6902902832728227497L;
        fy.jgoq[115] = 8772154803722343186L;
        fy.jgoq[116] = 7115340442563830228L;
        fy.jgoq[117] = 4529417168015918648L;
        fy.jgoq[118] = 6163970004760681203L;
        fy.jgoq[119] = -1955573208546816134L;
        fy.jgoq[120] = 279490547354523787L;
        fy.jgoq[121] = -6190867837577617344L;
        fy.jgoq[122] = 7879602821407684741L;
        fy.jgoq[123] = 1946915804687162698L;
        fy.jgoq[124] = -1673924566046278586L;
        fy.jgoq[125] = -6840064726386067005L;
        fy.jgoq[126] = 480130864964136917L;
        fy.jgoq[127] = -4015450299085161412L;
        fy.jgoq[128] = -8147824339358515613L;
        fy.jgoq[129] = -1334373771799246495L;
        fy.jgoq[130] = 647774306355313801L;
        fy.jgoq[131] = -5760324024093541685L;
        fy.jgoq[132] = -2092870439564068270L;
        fy.jgoq[133] = -7763200389724658122L;
        fy.jgoq[134] = 8622972631138059189L;
        fy.jgoq[135] = 1505977449486740513L;
        fy.jgoq[136] = 8126738303598750222L;
        fy.jgoq[137] = -6674760072046028399L;
        fy.jgoq[138] = 7818614027039569829L;
        fy.jgoq[139] = -1413823863191991098L;
        fy.jgoq[140] = 9187297178912940126L;
        fy.jgoq[141] = 31111518488245131L;
        fy.jgoq[142] = -5191074876731995237L;
        fy.jgoq[143] = 5989904976822344041L;
        fy.jgoq[144] = -8098631007819327950L;
        fy.jgoq[145] = 4546242984596264037L;
        fy.jgoq[146] = 5696776491320470858L;
        fy.jgoq[147] = 5593512273996781090L;
        fy.jgoq[148] = 7925919771290757975L;
        fy.jgoq[149] = -4819619742959485793L;
        fy.jgoq[150] = 7637294149024633144L;
        fy.jgoq[151] = -929278012110287153L;
        fy.jgoq[152] = -5474090848882075854L;
        fy.jgoq[153] = 4310424233944287965L;
        fy.jgoq[154] = -5763670431221112052L;
        fy.jgoq[155] = 1674665275912737462L;
        fy.jgoq[156] = -7090619273535925158L;
        fy.jgoq[157] = 3656556242276490316L;
        fy.jgoq[158] = 7827049394512064993L;
        fy.jgoq[159] = -1770410492670987869L;
        fy.jgoq[160] = -1242949888717357956L;
        fy.jgoq[161] = -2146878064451932635L;
    }

    private static /* synthetic */ void jhds() {
        fy.jgor[100] = -3312557027042923057L;
        fy.jgor[101] = 4435089800938544144L;
        fy.jgor[102] = 6067166755675738403L;
        fy.jgor[103] = -8395919292764128002L;
        fy.jgor[104] = -6596277548977985165L;
        fy.jgor[105] = 1737622347202455915L;
        fy.jgor[106] = 4878975867084579966L;
        fy.jgor[107] = -7747199870605692886L;
        fy.jgor[108] = 3165201580572131225L;
        fy.jgor[109] = -4663447995555429287L;
        fy.jgor[110] = -1894470259633486465L;
        fy.jgor[111] = 185461443363195778L;
        fy.jgor[112] = -8242167964628336131L;
        fy.jgor[113] = 4033487580105719421L;
        fy.jgor[114] = 5511119270881180122L;
        fy.jgor[115] = -6168633239697377388L;
        fy.jgor[116] = 8168111724575545296L;
        fy.jgor[117] = -7467688459155790968L;
        fy.jgor[118] = -8251199204279550823L;
        fy.jgor[119] = 1459530065385814589L;
        fy.jgor[120] = -8477803046286336410L;
        fy.jgor[121] = -2170462909710723698L;
        fy.jgor[122] = -6435517984102578791L;
        fy.jgor[123] = -5612764242330323443L;
        fy.jgor[124] = 4519020283919272217L;
        fy.jgor[125] = 6821882578932530671L;
        fy.jgor[126] = 8823126937196179468L;
        fy.jgor[127] = -4884947570591405282L;
        fy.jgor[128] = -3022610762504344769L;
        fy.jgor[129] = 5687983750955703689L;
        fy.jgor[130] = 7177030979274386294L;
        fy.jgor[131] = -7092558145846085570L;
        fy.jgor[132] = -681188890838439893L;
        fy.jgor[133] = 6251190345554652993L;
        fy.jgor[134] = 5899882257480398096L;
        fy.jgor[135] = -5469216342606774185L;
        fy.jgor[136] = -1328627015352782775L;
        fy.jgor[137] = -8622276442570224376L;
        fy.jgor[138] = -4052150432563859945L;
        fy.jgor[139] = -8211936613715947929L;
        fy.jgor[140] = -5159658674531438367L;
        fy.jgor[141] = 6027184952363285651L;
        fy.jgor[142] = 1165454025399440780L;
        fy.jgor[143] = 6849500437814408365L;
        fy.jgor[144] = -6681593678988074865L;
        fy.jgor[145] = 3855224237711374599L;
        fy.jgor[146] = 6776545371189546261L;
        fy.jgor[147] = 882631959154587246L;
        fy.jgor[148] = -8971451885651313981L;
        fy.jgor[149] = 9043259294273590071L;
        fy.jgor[150] = -3705132605491202913L;
        fy.jgor[151] = 1795639910595368832L;
        fy.jgor[152] = -5576802499388057149L;
        fy.jgor[153] = 4027727720272548437L;
        fy.jgor[154] = -3823374493642769995L;
        fy.jgor[155] = 3777507233932716348L;
        fy.jgor[156] = 5566679979203359395L;
        fy.jgor[157] = 3073356401377361425L;
        fy.jgor[158] = -2699579561225031592L;
        fy.jgor[159] = -217571969704243080L;
        fy.jgor[160] = -1335410285809436115L;
        fy.jgor[161] = -596580161997175738L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int hotbarIndex(float var1_1) {
        v0 /* !! */  = fy.rk;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - fy.jglb("jgwo", jgop(int ), (int)78));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1359926761: {
                    break block26;
                }
                case -1009689375: {
                    v1 = fy.jglb("jgwp", jgop(int ), (int)79);
                    continue block26;
                }
                case -736779671: {
                    v1 = fy.jglb("jgwq", jgop(int ), (int)80);
                    continue block26;
                }
                case 89186231: {
                    v1 = fy.jglb("jgwr", jgop(int ), (int)81);
                    continue block26;
                }
            }
            break;
        }
        var4_2 = fy.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jgws", jgop(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fy.jglb("jgwt", jgky(int ), (int)216)) break;
            v2 /* !! */  = (long)fy.jglb("jgwu", jgky(int ), (int)217);
        }
        var3_3 /* !! */  = fy.b;
        v3 /* !! */  = fy.rk;
        if (true) ** GOTO lbl28
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - fy.jglb("jgwv", jgop(int ), (int)83));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1359926761: {
                    break block28;
                }
                case -575521581: {
                    v4 = fy.jglb("jgww", jgop(int ), (int)84);
                    continue block28;
                }
                case 1262379210: {
                    v4 = fy.jglb("jgwx", jgop(int ), (int)85);
                    continue block28;
                }
            }
            break;
        }
        var2_4 = fy.a;
        if (var4_2) {
            throw null;
            return (int)fy.jglb("jgwy", jgky(int ), (int)218);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v5 = fy.jglb("jgwz", jgky(int ), (int)219);
                v6 = fy.jglb("jgxa", jgky(int ), (int)220);
                v7 /* !! */  = fy.rk;
                if (true) ** GOTO lbl52
                block30: while (true) {
                    v7 /* !! */  = (long)(v8 - fy.jglb("jgxb", jgop(int ), (int)86));
lbl52:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1432036731: {
                            v8 = fy.jglb("jgxc", jgop(int ), (int)87);
                            continue block30;
                        }
                        case -1359926761: {
                            break block30;
                        }
                        case -253725113: {
                            v8 = fy.jglb("jgxd", jgop(int ), (int)88);
                            continue block30;
                        }
                    }
                    break;
                }
                v9 = Math.round(var1_1) - fy.jglb("jgxe", jgky(int ), (int)221);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jgxf", jgop(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fy.jglb("jgxg", jgky(int ), (int)222)) break;
                    v10 /* !! */  = (long)fy.jglb("jgxh", jgky(int ), (int)223);
                }
                v11 = Math.min((int)v6, v9);
                v12 /* !! */  = fy.rk;
                if (true) ** GOTO lbl72
                block32: while (true) {
                    v12 /* !! */  = (long)(fy.jglb("jgxj", jgop(int ), (int)91) - fy.jglb("jgxi", jgop(int ), (int)90));
lbl72:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1359926761: {
                            break block32;
                        }
                        case 2007091703: {
                            continue block32;
                        }
                    }
                    break;
                }
                return Math.max((int)v5, v11);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)fy.jglb("jgxk", jgky(int ), (int)224);
                } while (!var4_2);
                throw null;
            }
lbl83:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fy.jglb("jgxl", jgky(int ), (int)225);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fy.jglb("jgxm", jgky(int ), (int)226);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)fy.jglb("jgxn", jgky(int ), (int)227);
        ** while (!var4_2)
lbl95:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jhdn() {
        fy.jgla[200] = -1461526626;
        fy.jgla[201] = -1187461270;
        fy.jgla[202] = -337255416;
        fy.jgla[203] = 42640016;
        fy.jgla[204] = -167540158;
        fy.jgla[205] = -209543745;
        fy.jgla[206] = -854807850;
        fy.jgla[207] = -746139450;
        fy.jgla[208] = 67070502;
        fy.jgla[209] = -1268891140;
        fy.jgla[210] = -859968688;
        fy.jgla[211] = 201239714;
        fy.jgla[212] = 1381416307;
        fy.jgla[213] = 434017573;
        fy.jgla[214] = -38129299;
        fy.jgla[215] = 712393297;
        fy.jgla[216] = -1002374039;
        fy.jgla[217] = -1960124571;
        fy.jgla[218] = -1755636165;
        fy.jgla[219] = -1552189006;
        fy.jgla[220] = -599509581;
        fy.jgla[221] = 1537899579;
        fy.jgla[222] = -88043850;
        fy.jgla[223] = 1201767631;
        fy.jgla[224] = -1056918246;
        fy.jgla[225] = 1217094861;
        fy.jgla[226] = -1184959006;
        fy.jgla[227] = -1083041715;
        fy.jgla[228] = 554795569;
        fy.jgla[229] = 1075540565;
        fy.jgla[230] = 334363657;
        fy.jgla[231] = -1399562570;
        fy.jgla[232] = 829786358;
        fy.jgla[233] = -1899274202;
        fy.jgla[234] = 1280835749;
        fy.jgla[235] = 2131748029;
        fy.jgla[236] = -658156848;
        fy.jgla[237] = 217395338;
        fy.jgla[238] = 671871979;
        fy.jgla[239] = -446914352;
        fy.jgla[240] = 46795614;
        fy.jgla[241] = -1259916091;
        fy.jgla[242] = -1991956406;
        fy.jgla[243] = 187761223;
        fy.jgla[244] = 789858769;
        fy.jgla[245] = -701859529;
        fy.jgla[246] = -2057404284;
        fy.jgla[247] = -1214478622;
        fy.jgla[248] = -2118991517;
        fy.jgla[249] = 2093757028;
        fy.jgla[250] = 1106975856;
        fy.jgla[251] = -1137906422;
        fy.jgla[252] = 259407449;
        fy.jgla[253] = 827599044;
        fy.jgla[254] = -1135126247;
        fy.jgla[255] = 544958465;
        fy.jgla[256] = 608772361;
        fy.jgla[257] = -854344000;
        fy.jgla[258] = -1981668842;
        fy.jgla[259] = -201868650;
        fy.jgla[260] = -19804999;
        fy.jgla[261] = -1321873173;
        fy.jgla[262] = 348566051;
        fy.jgla[263] = -1576071011;
        fy.jgla[264] = 809149662;
        fy.jgla[265] = -1380261403;
        fy.jgla[266] = -1925162382;
        fy.jgla[267] = -120032168;
        fy.jgla[268] = 900141403;
        fy.jgla[269] = 453822816;
        fy.jgla[270] = -504289743;
        fy.jgla[271] = -907423746;
        fy.jgla[272] = 830931258;
        fy.jgla[273] = 2002405334;
        fy.jgla[274] = 1585319360;
        fy.jgla[275] = -500407085;
        fy.jgla[276] = 1759088339;
        fy.jgla[277] = 614416865;
        fy.jgla[278] = -2083671694;
        fy.jgla[279] = -1660000104;
        fy.jgla[280] = 1102266919;
        fy.jgla[281] = 1415215400;
        fy.jgla[282] = 59348867;
        fy.jgla[283] = 1081644499;
        fy.jgla[284] = -346596105;
        fy.jgla[285] = -1793002776;
        fy.jgla[286] = -154954300;
        fy.jgla[287] = 67951579;
        fy.jgla[288] = -467012735;
        fy.jgla[289] = 1378341179;
        fy.jgla[290] = -1817897134;
        fy.jgla[291] = 314106907;
        fy.jgla[292] = -993403354;
        fy.jgla[293] = 1337072035;
        fy.jgla[294] = -950044511;
        fy.jgla[295] = 1402997738;
        fy.jgla[296] = -25261050;
        fy.jgla[297] = 2141557379;
        fy.jgla[298] = 1774896155;
        fy.jgla[299] = 1181998787;
    }

    private static /* synthetic */ void jhdl() {
        fy.jgla[0] = -1667985729;
        fy.jgla[1] = -1050965474;
        fy.jgla[2] = -1400354169;
        fy.jgla[3] = -2078784243;
        fy.jgla[4] = -1700651497;
        fy.jgla[5] = -442250625;
        fy.jgla[6] = 1578244475;
        fy.jgla[7] = 68510465;
        fy.jgla[8] = 831010091;
        fy.jgla[9] = -1739752469;
        fy.jgla[10] = -205489336;
        fy.jgla[11] = -1807739807;
        fy.jgla[12] = 104356391;
        fy.jgla[13] = -785820578;
        fy.jgla[14] = 1438826433;
        fy.jgla[15] = -162383765;
        fy.jgla[16] = 297142797;
        fy.jgla[17] = 1385943983;
        fy.jgla[18] = 1742913096;
        fy.jgla[19] = 1967010671;
        fy.jgla[20] = 1661594040;
        fy.jgla[21] = 1675803209;
        fy.jgla[22] = 1202591856;
        fy.jgla[23] = 365930146;
        fy.jgla[24] = -2008513763;
        fy.jgla[25] = 162445089;
        fy.jgla[26] = 1830716132;
        fy.jgla[27] = -1711320782;
        fy.jgla[28] = 737219284;
        fy.jgla[29] = 567640291;
        fy.jgla[30] = -872204154;
        fy.jgla[31] = -713331046;
        fy.jgla[32] = 1697458646;
        fy.jgla[33] = -764424594;
        fy.jgla[34] = -1276380197;
        fy.jgla[35] = 673654326;
        fy.jgla[36] = -1832769656;
        fy.jgla[37] = -1443241341;
        fy.jgla[38] = -1653060955;
        fy.jgla[39] = -462888935;
        fy.jgla[40] = 1444007928;
        fy.jgla[41] = -2075877704;
        fy.jgla[42] = 1291036625;
        fy.jgla[43] = 1279824670;
        fy.jgla[44] = -443055515;
        fy.jgla[45] = -495955534;
        fy.jgla[46] = -850255981;
        fy.jgla[47] = 1457283133;
        fy.jgla[48] = -1188834300;
        fy.jgla[49] = 1913238674;
        fy.jgla[50] = 1110337999;
        fy.jgla[51] = -661450977;
        fy.jgla[52] = -839871743;
        fy.jgla[53] = 1140116399;
        fy.jgla[54] = -1919070534;
        fy.jgla[55] = 164708339;
        fy.jgla[56] = -104630845;
        fy.jgla[57] = -430399866;
        fy.jgla[58] = 1304441281;
        fy.jgla[59] = -380672382;
        fy.jgla[60] = 183892596;
        fy.jgla[61] = -1602618642;
        fy.jgla[62] = -264575319;
        fy.jgla[63] = 401859201;
        fy.jgla[64] = -1684194624;
        fy.jgla[65] = 1403172751;
        fy.jgla[66] = 357512439;
        fy.jgla[67] = -1681536731;
        fy.jgla[68] = 1618261980;
        fy.jgla[69] = -1810486892;
        fy.jgla[70] = 1805823377;
        fy.jgla[71] = 1548366845;
        fy.jgla[72] = 1960534729;
        fy.jgla[73] = -269827681;
        fy.jgla[74] = -1495681372;
        fy.jgla[75] = 493299963;
        fy.jgla[76] = 1415734489;
        fy.jgla[77] = -894696451;
        fy.jgla[78] = 1887236552;
        fy.jgla[79] = -1945866285;
        fy.jgla[80] = 1013017714;
        fy.jgla[81] = -483962854;
        fy.jgla[82] = -766746526;
        fy.jgla[83] = 2052319368;
        fy.jgla[84] = -50560495;
        fy.jgla[85] = 1744382775;
        fy.jgla[86] = -579474870;
        fy.jgla[87] = 1714435906;
        fy.jgla[88] = 2101586321;
        fy.jgla[89] = 1184367193;
        fy.jgla[90] = -1848323155;
        fy.jgla[91] = 720672644;
        fy.jgla[92] = 887940035;
        fy.jgla[93] = -224948695;
        fy.jgla[94] = -1436758566;
        fy.jgla[95] = 1487325916;
        fy.jgla[96] = 1801721757;
        fy.jgla[97] = -283416337;
        fy.jgla[98] = -131205200;
        fy.jgla[99] = -1700848120;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fy() {
        var2_1 /* !! */  = fy.b;
        super("LungeHelper", "\u0411\u0435\u0441\u043a\u043e\u043d\u0435\u0447\u043d\u044b\u0439 \u0431\u0443\u0441\u0442 \u043a\u043e\u043f\u044c\u044f: \u0441\u0432\u0430\u043f \u0441\u043b\u043e\u0442\u0430 \u0438 \u041b\u041a\u041c \u043e\u0434\u043d\u043e\u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e", du.MOVEMENT);
        this.boostBind = new ka("\u0411\u0443\u0441\u0442", "\u0423\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0439 \u2014 \u0441\u0432\u0430\u043f \u0441\u043b\u043e\u0442\u0430 + \u041b\u041a\u041c \u0432 \u043e\u0434\u043d\u043e\u043c \u0442\u0438\u043a\u0435");
        this.autoSpear = new kb("\u0410\u0432\u0442\u043e \u043a\u043e\u043f\u044c\u0451", "\u0421\u0430\u043c \u0438\u0449\u0435\u0442 \u043a\u043e\u043f\u044c\u0451 \u0441 \u0420\u044b\u0432\u043a\u043e\u043c \u0432 \u0445\u043e\u0442\u0431\u0430\u0440\u0435").setValue((boolean)fy.jglb("jglc", jgky(int ), (int)0));
        this.spearSlot = new kg("\u0421\u043b\u043e\u0442 \u043a\u043e\u043f\u044c\u044f", "\u0425\u043e\u0442\u0431\u0430\u0440-\u0441\u043b\u043e\u0442 \u0441 \u043a\u043e\u043f\u044c\u0451\u043c (1-9)", (float)fy.jglb("jgle", jgld(int ), (int)1)).range(1.0f, (float)fy.jglb("jglf", jgld(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fy)this));
        this.swapSlot = new kg("\u0421\u043b\u043e\u0442 \u0441\u0432\u0430\u043f\u0430", "\u0421\u043b\u043e\u0442 \u043e\u0442\u043a\u0443\u0434\u0430 \u0434\u0435\u043b\u0430\u0435\u0442\u0441\u044f \u0440\u044b\u0432\u043e\u043a", 2.0f).range(1.0f, (float)fy.jglb("jglg", jgld(int ), (int)3));
        this.burstDelay = new kg("\u0418\u043d\u0442\u0435\u0440\u0432\u0430\u043b", "\u041f\u0430\u0443\u0437\u0430 \u043c\u0435\u0436\u0434\u0443 \u0431\u0443\u0441\u0442\u0430\u043c\u0438", 0.0f).range(0.0f, (float)fy.jglb("jglh", jgld(int ), (int)4)).suffix("ms");
        this.timer = new pr();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.savedSlot = (int)fy.jglb("jgli", jgky(int ), (int)5);
                this.spearTurn = fy.jglb("jglj", jgky(int ), (int)6);
                this.settings(new jx[]{this.boostBind, this.autoSpear, this.spearSlot, this.swapSlot, this.burstDelay});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fy.jglb("jglk", jgky(int ), (int)7);
                ** GOTO lbl39
            }
lbl19:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)fy.jglb("jgll", jgky(int ), (int)8);
                ** GOTO lbl33
            }
lbl22:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fy.jglb("jglm", jgky(int ), (int)9);
                break;
            }
lbl25:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)fy.jglb("jgln", jgky(int ), (int)10);
            }
            case 4: {
                var2_1 /* !! */  = (int)fy.jglb("jglo", jgky(int ), (int)11);
                ** GOTO lbl25
            }
lbl30:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)fy.jglb("jglp", jgky(int ), (int)12);
                ** GOTO lbl22
            }
lbl33:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)fy.jglb("jglq", jgky(int ), (int)13);
                ** GOTO lbl30
            }
lbl36:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)fy.jglb("jglr", jgky(int ), (int)14);
                ** GOTO lbl30
            }
lbl39:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)fy.jglb("jgls", jgky(int ), (int)15);
                ** GOTO lbl19
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fy.jglb("jglt", jgky(int ), (int)16);
                    ** GOTO lbl36
                    break;
                }
            }
            case 10: {
                while (true) {
                    var2_1 /* !! */  = (int)fy.jglb("jglu", jgky(int ), (int)17);
                }
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)fy.jglb("jglv", jgky(int ), (int)18);
        ** while (true)
    }

    public static /* synthetic */ CallSite jglb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        jgkz = new int[307];
        jgla = new int[307];
        fy.jhdh();
        fy.jhdi();
        fy.jhdj();
        fy.jhdk();
        fy.jhdl();
        fy.jhdm();
        fy.jhdn();
        fy.jhdo();
        jgoq = new long[162];
        jgor = new long[162];
        fy.jhdp();
        fy.jhdq();
        fy.jhdr();
        fy.jhds();
    }

    private static /* synthetic */ void jhdr() {
        fy.jgor[0] = 7015247761098004837L;
        fy.jgor[1] = -6274456344065476640L;
        fy.jgor[2] = 2116363495397362370L;
        fy.jgor[3] = -6170052136675007982L;
        fy.jgor[4] = -2475835312975865271L;
        fy.jgor[5] = 664545146889758687L;
        fy.jgor[6] = 1495777036133061480L;
        fy.jgor[7] = 556334641095094165L;
        fy.jgor[8] = 3711093129462490770L;
        fy.jgor[9] = 7843666531799235064L;
        fy.jgor[10] = 826665822261740996L;
        fy.jgor[11] = -8810676641298048818L;
        fy.jgor[12] = -2444868369264418529L;
        fy.jgor[13] = 3573079260269140980L;
        fy.jgor[14] = -3194058961454717567L;
        fy.jgor[15] = -6319134337264434750L;
        fy.jgor[16] = 2893071927112028766L;
        fy.jgor[17] = 5948834316916749746L;
        fy.jgor[18] = -6036172062417503253L;
        fy.jgor[19] = -5026623229194615771L;
        fy.jgor[20] = 265287248959555964L;
        fy.jgor[21] = -5664915054722158099L;
        fy.jgor[22] = -1019281574568436858L;
        fy.jgor[23] = -6197140909220888972L;
        fy.jgor[24] = -1058211576464831395L;
        fy.jgor[25] = -5724185892545925570L;
        fy.jgor[26] = -7827637622102784706L;
        fy.jgor[27] = -4568813679657841220L;
        fy.jgor[28] = 58360054570165481L;
        fy.jgor[29] = 4310713634793477308L;
        fy.jgor[30] = -431157007018619113L;
        fy.jgor[31] = -7701332853518020929L;
        fy.jgor[32] = -6251605281669965426L;
        fy.jgor[33] = -3396763762412439076L;
        fy.jgor[34] = 336370863573698415L;
        fy.jgor[35] = -1450498376420307077L;
        fy.jgor[36] = 459923271390932058L;
        fy.jgor[37] = 1510410088983135009L;
        fy.jgor[38] = -6672557885925904284L;
        fy.jgor[39] = 1731363352688092109L;
        fy.jgor[40] = 4416502772650391694L;
        fy.jgor[41] = 7905904198079443740L;
        fy.jgor[42] = -5686953909491882284L;
        fy.jgor[43] = 5561602685262797428L;
        fy.jgor[44] = 7067443070057347119L;
        fy.jgor[45] = 4481348214985635944L;
        fy.jgor[46] = 8663943658464297497L;
        fy.jgor[47] = -2415367998634418049L;
        fy.jgor[48] = 1106295323858083800L;
        fy.jgor[49] = 4533340043620103289L;
        fy.jgor[50] = 765304720966243111L;
        fy.jgor[51] = -994544121964810928L;
        fy.jgor[52] = -1525393979642544403L;
        fy.jgor[53] = -8354455721988268046L;
        fy.jgor[54] = -3938597192466178000L;
        fy.jgor[55] = -282543583959034851L;
        fy.jgor[56] = 5148067433650731264L;
        fy.jgor[57] = 7042143635570018627L;
        fy.jgor[58] = 2241187030118174060L;
        fy.jgor[59] = -5457466328518179996L;
        fy.jgor[60] = 403349907944767923L;
        fy.jgor[61] = -8836117657992072333L;
        fy.jgor[62] = 7700190618619964417L;
        fy.jgor[63] = 6894857409252090561L;
        fy.jgor[64] = 8813529056993496169L;
        fy.jgor[65] = -433017644715859599L;
        fy.jgor[66] = 8644236543962986969L;
        fy.jgor[67] = 7544519954284812482L;
        fy.jgor[68] = 1206733069886448819L;
        fy.jgor[69] = 5379239463776359710L;
        fy.jgor[70] = -3755773503993903032L;
        fy.jgor[71] = 4761760163896175455L;
        fy.jgor[72] = -7700302709134596857L;
        fy.jgor[73] = -5185519294124096526L;
        fy.jgor[74] = -5132412288236989878L;
        fy.jgor[75] = -4940199748672551267L;
        fy.jgor[76] = 5882669032765994741L;
        fy.jgor[77] = 7816982645568592448L;
        fy.jgor[78] = 472902739845569973L;
        fy.jgor[79] = -1388016097032619320L;
        fy.jgor[80] = 380975569536869261L;
        fy.jgor[81] = -7105605796959986992L;
        fy.jgor[82] = -6619714759145334999L;
        fy.jgor[83] = -2401925075630622700L;
        fy.jgor[84] = -6996041832762913983L;
        fy.jgor[85] = -6470258930218815842L;
        fy.jgor[86] = 7769286372287715787L;
        fy.jgor[87] = 7429543777042303652L;
        fy.jgor[88] = -8633705544110171615L;
        fy.jgor[89] = -2967478577522405066L;
        fy.jgor[90] = 3282348248869513767L;
        fy.jgor[91] = -6144850847470124194L;
        fy.jgor[92] = -8339334260498659378L;
        fy.jgor[93] = -2621948515657630769L;
        fy.jgor[94] = -8650274281575325314L;
        fy.jgor[95] = 366111878126757242L;
        fy.jgor[96] = 4120373016425810839L;
        fy.jgor[97] = -4382223955154659049L;
        fy.jgor[98] = 6985357081055311401L;
        fy.jgor[99] = -4540608214198489927L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fy.rk;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - fy.jglb("jhbm", jgop(int ), (int)141));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1359926761: {
                    break block23;
                }
                case -1084506314: {
                    v1 = fy.jglb("jhbn", jgop(int ), (int)142);
                    continue block23;
                }
                case 527453249: {
                    v1 = fy.jglb("jhbo", jgop(int ), (int)143);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = fy.c;
        v2 /* !! */  = fy.rk;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(fy.jglb("jhbq", jgop(int ), (int)145) - fy.jglb("jhbp", jgop(int ), (int)144));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1359926761: {
                    break block24;
                }
                case 911316888: {
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = fy.b;
        v3 /* !! */  = fy.rk;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - fy.jglb("jhbr", jgop(int ), (int)146));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1359926761: {
                    break block25;
                }
                case -1320409872: {
                    v4 = fy.jglb("jhbs", jgop(int ), (int)147);
                    continue block25;
                }
                case -743915204: {
                    v4 = fy.jglb("jhbt", jgop(int ), (int)148);
                    continue block25;
                }
                case 417161248: {
                    v4 = fy.jglb("jhbu", jgop(int ), (int)149);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = fy.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jhbv", jgop(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fy.jglb("jhbw", jgky(int ), (int)281)) break;
            v5 /* !! */  = (long)fy.jglb("jhbx", jgky(int ), (int)282);
        }
        this.stopBoost();
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fy.jglb("jhby", jgky(int ), (int)283);
                if (var3_1) {
                    throw null;
                }
            }
lbl64:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)fy.jglb("jhbz", jgky(int ), (int)284);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 2: {
                var2_2 /* !! */  = (int)fy.jglb("jhca", jgky(int ), (int)285);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)fy.jglb("jhcb", jgky(int ), (int)286);
                if (!var3_1) break;
                throw null;
            }
lbl77:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fy.jglb("jhcc", jgky(int ), (int)287);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)fy.jglb("jhcd", jgky(int ), (int)288);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jhdj() {
        fy.jgkz[200] = -1461526625;
        fy.jgkz[201] = -1187461275;
        fy.jgkz[202] = -337255408;
        fy.jgkz[203] = 42640020;
        fy.jgkz[204] = -167540160;
        fy.jgkz[205] = -209543745;
        fy.jgkz[206] = -854807853;
        fy.jgkz[207] = -746139456;
        fy.jgkz[208] = 67070496;
        fy.jgkz[209] = -1268891141;
        fy.jgkz[210] = -859968703;
        fy.jgkz[211] = 201239731;
        fy.jgkz[212] = 1381416295;
        fy.jgkz[213] = 434017582;
        fy.jgkz[214] = -38129291;
        fy.jgkz[215] = 712393308;
        fy.jgkz[216] = -1002374040;
        fy.jgkz[217] = -404010036;
        fy.jgkz[218] = -796188921;
        fy.jgkz[219] = -1552189006;
        fy.jgkz[220] = -599509573;
        fy.jgkz[221] = 1537899578;
        fy.jgkz[222] = -88043849;
        fy.jgkz[223] = 18705307;
        fy.jgkz[224] = -1056918248;
        fy.jgkz[225] = 1217094863;
        fy.jgkz[226] = -1184959007;
        fy.jgkz[227] = -1083041716;
        fy.jgkz[228] = 554795569;
        fy.jgkz[229] = 1075540564;
        fy.jgkz[230] = -1097785412;
        fy.jgkz[231] = -1399562569;
        fy.jgkz[232] = 829786359;
        fy.jgkz[233] = -1446851131;
        fy.jgkz[234] = 1280835748;
        fy.jgkz[235] = 1523810999;
        fy.jgkz[236] = -658156840;
        fy.jgkz[237] = 217395339;
        fy.jgkz[238] = 764333981;
        fy.jgkz[239] = -446914351;
        fy.jgkz[240] = -500846713;
        fy.jgkz[241] = -1259916092;
        fy.jgkz[242] = -235902709;
        fy.jgkz[243] = -187761224;
        fy.jgkz[244] = -343352035;
        fy.jgkz[245] = 701859528;
        fy.jgkz[246] = -1506520684;
        fy.jgkz[247] = -1214478621;
        fy.jgkz[248] = 1478685927;
        fy.jgkz[249] = 2093757029;
        fy.jgkz[250] = 1590009668;
        fy.jgkz[251] = -1137906421;
        fy.jgkz[252] = -6812039;
        fy.jgkz[253] = 827599045;
        fy.jgkz[254] = 1374202099;
        fy.jgkz[255] = -544958466;
        fy.jgkz[256] = 608772382;
        fy.jgkz[257] = -854343976;
        fy.jgkz[258] = -1981668837;
        fy.jgkz[259] = -201868667;
        fy.jgkz[260] = -19804998;
        fy.jgkz[261] = -1321873180;
        fy.jgkz[262] = 348566069;
        fy.jgkz[263] = -1576071022;
        fy.jgkz[264] = 809149642;
        fy.jgkz[265] = -1380261379;
        fy.jgkz[266] = -1925162371;
        fy.jgkz[267] = -120032163;
        fy.jgkz[268] = 900141399;
        fy.jgkz[269] = 453822830;
        fy.jgkz[270] = -504289755;
        fy.jgkz[271] = -907423752;
        fy.jgkz[272] = 830931250;
        fy.jgkz[273] = 2002405341;
        fy.jgkz[274] = 1585319375;
        fy.jgkz[275] = -500407101;
        fy.jgkz[276] = 1759088323;
        fy.jgkz[277] = 614416867;
        fy.jgkz[278] = -2083671683;
        fy.jgkz[279] = -1660000115;
        fy.jgkz[280] = 1102266917;
        fy.jgkz[281] = 1415215401;
        fy.jgkz[282] = 1854259071;
        fy.jgkz[283] = 1081644496;
        fy.jgkz[284] = -346596106;
        fy.jgkz[285] = -1793002773;
        fy.jgkz[286] = -154954304;
        fy.jgkz[287] = 67951582;
        fy.jgkz[288] = -467012733;
        fy.jgkz[289] = 1378341178;
        fy.jgkz[290] = -675344137;
        fy.jgkz[291] = 314106906;
        fy.jgkz[292] = -1195104239;
        fy.jgkz[293] = 1337072034;
        fy.jgkz[294] = 1681334099;
        fy.jgkz[295] = 1402997739;
        fy.jgkz[296] = -25261050;
        fy.jgkz[297] = 2141557378;
        fy.jgkz[298] = -1446510959;
        fy.jgkz[299] = 1181998788;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void swapAttack(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fy.rk - fy.jglb("jgos", jgop(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fy.jglb("jgot", jgky(int ), (int)90)) break;
            v0 /* !! */  = (long)fy.jglb("jgou", jgky(int ), (int)91);
        }
        var4_2 = fy.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fy.rk - fy.jglb("jgov", jgop(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fy.jglb("jgow", jgky(int ), (int)92)) break;
            v1 /* !! */  = (long)fy.jglb("jgox", jgky(int ), (int)93);
        }
        var3_3 /* !! */  = fy.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fy.rk - fy.jglb("jgoy", jgop(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fy.jglb("jgoz", jgky(int ), (int)94)) break;
            v2 /* !! */  = (long)fy.jglb("jgpa", jgky(int ), (int)95);
        }
        var2_4 = fy.a;
        if (var4_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v3 /* !! */  = fy.rk;
        if (true) ** GOTO lbl28
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - fy.jglb("jgpb", jgop(int ), (int)3));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1390861967: {
                    v4 = fy.jglb("jgpc", jgop(int ), (int)4);
                    continue block37;
                }
                case -1359926761: {
                    break block37;
                }
                case 539903101: {
                    v4 = fy.jglb("jgpd", jgop(int ), (int)5);
                    continue block37;
                }
                case 933234591: {
                    v4 = fy.jglb("jgpe", jgop(int ), (int)6);
                    continue block37;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fy.rk - fy.jglb("jgpf", jgop(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fy.jglb("jgpg", jgky(int ), (int)96)) break;
            v5 /* !! */  = (long)fy.jglb("jgph", jgky(int ), (int)97);
        }
        v6 = fy.mc.method_1562();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = fy.rk - fy.jglb("jgpi", jgop(int ), (int)8)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == fy.jglb("jgpj", jgky(int ), (int)98)) break;
            v7 /* !! */  = (long)fy.jglb("jgpk", jgky(int ), (int)99);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_5 = fy.rk - fy.jglb("jgpl", jgop(int ), (int)9)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == fy.jglb("jgpm", jgky(int ), (int)100)) break;
            v8 /* !! */  = (long)fy.jglb("jgpn", jgky(int ), (int)101);
        }
        v9 = new class_2868(var1_1);
        v10 /* !! */  = fy.rk;
        if (true) ** GOTO lbl61
        block41: while (true) {
            v10 /* !! */  = (long)(fy.jglb("jgpp", jgop(int ), (int)11) - fy.jglb("jgpo", jgop(int ), (int)10));
lbl61:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1359926761: {
                    break block41;
                }
                case 1348263356: {
                    continue block41;
                }
            }
            break;
        }
        v6.method_52787((class_2596)v9);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = fy.rk - fy.jglb("jgpq", jgop(int ), (int)12)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fy.jglb("jgpr", jgky(int ), (int)102)) break;
                    v11 /* !! */  = (long)fy.jglb("jgps", jgky(int ), (int)103);
                }
                v12 /* !! */  = fy.rk;
                if (true) ** GOTO lbl81
                block43: while (true) {
                    v12 /* !! */  = (long)(v13 - fy.jglb("jgpt", jgop(int ), (int)13));
lbl81:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1836743836: {
                            v13 = fy.jglb("jgpu", jgop(int ), (int)14);
                            continue block43;
                        }
                        case -1641980187: {
                            v13 = fy.jglb("jgpv", jgop(int ), (int)15);
                            continue block43;
                        }
                        case -1359926761: {
                            break block43;
                        }
                        case -391920561: {
                            v13 = fy.jglb("jgpw", jgop(int ), (int)16);
                            continue block43;
                        }
                    }
                    break;
                }
                v14 = fy.mc.field_1724;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = fy.rk - fy.jglb("jgpx", jgop(int ), (int)17)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fy.jglb("jgpy", jgky(int ), (int)104)) break;
                    v15 /* !! */  = (long)fy.jglb("jgpz", jgky(int ), (int)105);
                }
                v16 = v14.method_31548();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_8 = fy.rk - fy.jglb("jgqa", jgop(int ), (int)18)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fy.jglb("jgqb", jgky(int ), (int)106)) break;
                    v17 /* !! */  = (long)fy.jglb("jgqc", jgky(int ), (int)107);
                }
                v16.method_61496(var1_1);
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_9 = fy.rk - fy.jglb("jgqd", jgop(int ), (int)19)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == fy.jglb("jgqe", jgky(int ), (int)108)) break;
                    v18 /* !! */  = (long)fy.jglb("jgqf", jgky(int ), (int)109);
                }
                v19 /* !! */  = fy.rk;
                if (true) ** GOTO lbl116
                block47: while (true) {
                    v19 /* !! */  = (long)(v20 - fy.jglb("jgqg", jgop(int ), (int)20));
lbl116:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1794378240: {
                            v20 = fy.jglb("jgqh", jgop(int ), (int)21);
                            continue block47;
                        }
                        case -1459979858: {
                            v20 = fy.jglb("jgqi", jgop(int ), (int)22);
                            continue block47;
                        }
                        case -1359926761: {
                            break block47;
                        }
                    }
                    break;
                }
                fy.mc.method_1536();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl130:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fy.jglb("jgqj", jgky(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 1: {
                var3_3 /* !! */  = (int)fy.jglb("jgqk", jgky(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)fy.jglb("jgql", jgky(int ), (int)112);
                } while (!var4_2);
                throw null;
            }
lbl145:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fy.jglb("jgqm", jgky(int ), (int)113);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
lbl149:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)fy.jglb("jgqn", jgky(int ), (int)114);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl154:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)fy.jglb("jgqo", jgky(int ), (int)115);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)fy.jglb("jgqp", jgky(int ), (int)116);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)fy.jglb("jgqq", jgky(int ), (int)117);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
lbl166:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fy.jglb("jgqr", jgky(int ), (int)118);
                    if (!var4_2) ** GOTO lbl149
                    throw null;
                }
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)fy.jglb("jgqs", jgky(int ), (int)119);
        ** while (!var4_2)
lbl174:
        // 1 sources

        throw null;
    }
}

