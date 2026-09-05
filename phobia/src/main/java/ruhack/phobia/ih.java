/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class ih
extends hx {
    private static long[] adlz;
    private static long[] adlx;
    private static final float SNAP_SPEED = 50.0f;
    public static final int b;
    private static final long SNAP_HOLD_MS = 50L;
    private static int[] adkq;
    public static final boolean c;
    private static int[] adks;
    public static final boolean a;
    protected static final long bo = -6925921310897747664L;

    private static /* synthetic */ double adlw(int n2) {
        return Double.longBitsToDouble(adlx[n2] ^ adlz[n2]);
    }

    private static /* synthetic */ void adrt() {
        ih.adlx[0] = 4554634462785787112L;
        ih.adlx[1] = -5973155253326813007L;
        ih.adlx[2] = 4605374722326725356L;
        ih.adlx[3] = -7813764553792843639L;
        ih.adlx[4] = -7412824671851037987L;
        ih.adlx[5] = -3352379310097876146L;
        ih.adlx[6] = 3392128734424521266L;
        ih.adlx[7] = 1524103120973821084L;
        ih.adlx[8] = 1712511110477092927L;
        ih.adlx[9] = 4173503023754943032L;
        ih.adlx[10] = 6713970618092213281L;
        ih.adlx[11] = 6128752643538010144L;
    }

    public static /* synthetic */ CallSite adkt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long adpo(int n2) {
        return adlx[n2] ^ adlz[n2];
    }

    private static /* synthetic */ int adkn(int n2) {
        return adkq[n2] ^ adks[n2];
    }

    static {
        adkq = new int[60];
        adks = new int[60];
        ih.adqx();
        ih.adrh();
        adlx = new long[12];
        adlz = new long[12];
        ih.adrt();
        ih.adrx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ih() {
        var2_1 /* !! */  = ih.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Intave");
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ih.adkt("adkx", adkn(int ), (int)0);
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)ih.adkt("adkz", adkn(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)ih.adkt("adlb", adkn(int ), (int)2);
        }
    }

    private static /* synthetic */ void adrh() {
        ih.adks[0] = -2005025765;
        ih.adks[1] = 1836208507;
        ih.adks[2] = 836856238;
        ih.adks[3] = 1180465463;
        ih.adks[4] = 792754041;
        ih.adks[5] = -382559628;
        ih.adks[6] = -1525669351;
        ih.adks[7] = -1349202364;
        ih.adks[8] = 1767345921;
        ih.adks[9] = -240143880;
        ih.adks[10] = -841880578;
        ih.adks[11] = -1769139457;
        ih.adks[12] = -275303464;
        ih.adks[13] = 1630546803;
        ih.adks[14] = -1511644385;
        ih.adks[15] = 410680437;
        ih.adks[16] = -1050210494;
        ih.adks[17] = -39330886;
        ih.adks[18] = 1940933332;
        ih.adks[19] = -473543540;
        ih.adks[20] = -893783049;
        ih.adks[21] = 1373875915;
        ih.adks[22] = -1274440637;
        ih.adks[23] = -1928545468;
        ih.adks[24] = -1076753427;
        ih.adks[25] = -1475737104;
        ih.adks[26] = -795460104;
        ih.adks[27] = 1901184458;
        ih.adks[28] = -447223371;
        ih.adks[29] = -1254290600;
        ih.adks[30] = -311845404;
        ih.adks[31] = 1502153261;
        ih.adks[32] = 1653001253;
        ih.adks[33] = -295129373;
        ih.adks[34] = 89278375;
        ih.adks[35] = 806562391;
        ih.adks[36] = -10029002;
        ih.adks[37] = -1978799044;
        ih.adks[38] = 1019990801;
        ih.adks[39] = 62515770;
        ih.adks[40] = -583447248;
        ih.adks[41] = 1985552940;
        ih.adks[42] = -1754790170;
        ih.adks[43] = 647200073;
        ih.adks[44] = -742033660;
        ih.adks[45] = -2132581587;
        ih.adks[46] = -2141623327;
        ih.adks[47] = -792152279;
        ih.adks[48] = -848403720;
        ih.adks[49] = -1419544770;
        ih.adks[50] = 1759874043;
        ih.adks[51] = -2034166872;
        ih.adks[52] = 790979052;
        ih.adks[53] = 49465837;
        ih.adks[54] = 1843881473;
        ih.adks[55] = 219995493;
        ih.adks[56] = -1723490134;
        ih.adks[57] = -855340737;
        ih.adks[58] = -1406350284;
        ih.adks[59] = 141163519;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ih.bo - ih.adkt("adpq", adpo(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ih.adkt("adpr", adkn(int ), (int)52)) break;
            v0 /* !! */  = (long)ih.adkt("adpt", adkn(int ), (int)53);
        }
        var3_1 = ih.c;
        v1 /* !! */  = ih.bo;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - ih.adkt("adpv", adpo(int ), (int)2));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1665217931: {
                    v2 = ih.adkt("adpx", adpo(int ), (int)3);
                    continue block16;
                }
                case 96251099: {
                    v2 = ih.adkt("adpy", adpo(int ), (int)4);
                    continue block16;
                }
                case 1235339568: {
                    break block16;
                }
                case 1935223975: {
                    v2 = ih.adkt("adqa", adpo(int ), (int)5);
                    continue block16;
                }
            }
            break;
        }
        var2_2 = ih.b;
        v3 /* !! */  = ih.bo;
        if (true) ** GOTO lbl29
        block17: while (true) {
            v3 /* !! */  = (long)(v4 - ih.adkt("adqc", adpo(int ), (int)6));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1990291483: {
                    v4 = ih.adkt("adqe", adpo(int ), (int)7);
                    continue block17;
                }
                case 824298943: {
                    v4 = ih.adkt("adqf", adpo(int ), (int)8);
                    continue block17;
                }
                case 1235339568: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = ih.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ih.bo - ih.adkt("adqh", adpo(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ih.adkt("adqi", adkn(int ), (int)54)) break;
            v5 /* !! */  = (long)ih.adkt("adqj", adkn(int ), (int)55);
        }
        v6 /* !! */  = ih.bo;
        if (true) ** GOTO lbl54
        block20: while (true) {
            v6 /* !! */  = (long)(ih.adkt("adql", adpo(int ), (int)11) - ih.adkt("adqk", adpo(int ), (int)10));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 802595577: {
                    continue block20;
                }
                case 1235339568: {
                    break block20;
                }
            }
            break;
        }
        return new class_243(0.0, 0.0, 0.0);
    }

    private static /* synthetic */ void adrx() {
        ih.adlz[0] = 9186305204559631592L;
        ih.adlz[1] = -4321526509001201931L;
        ih.adlz[2] = 836095631631492058L;
        ih.adlz[3] = -2243147819285979407L;
        ih.adlz[4] = -793499308047785487L;
        ih.adlz[5] = -7374190498567656659L;
        ih.adlz[6] = -5605432749639141736L;
        ih.adlz[7] = -3656700686978807915L;
        ih.adlz[8] = -2233903208604512109L;
        ih.adlz[9] = -1797729355710360124L;
        ih.adlz[10] = 3093887750444603255L;
        ih.adlz[11] = 4842831378323730401L;
    }

    private static /* synthetic */ void adqx() {
        ih.adkq[0] = -2005025767;
        ih.adkq[1] = 1836208505;
        ih.adkq[2] = 836856236;
        ih.adkq[3] = 1180465462;
        ih.adkq[4] = 1829271417;
        ih.adkq[5] = -688743820;
        ih.adkq[6] = -413654503;
        ih.adkq[7] = -1873490364;
        ih.adkq[8] = 723488513;
        ih.adkq[9] = -240143909;
        ih.adkq[10] = -841880590;
        ih.adkq[11] = -1769139460;
        ih.adkq[12] = -275303427;
        ih.adkq[13] = 1630546785;
        ih.adkq[14] = -1511644395;
        ih.adkq[15] = 410680443;
        ih.adkq[16] = -1050210457;
        ih.adkq[17] = -39330916;
        ih.adkq[18] = 1940933328;
        ih.adkq[19] = -473543524;
        ih.adkq[20] = -893783046;
        ih.adkq[21] = 1373875910;
        ih.adkq[22] = -1274440626;
        ih.adkq[23] = -1928545449;
        ih.adkq[24] = -1076753463;
        ih.adkq[25] = -1475737113;
        ih.adkq[26] = -795460126;
        ih.adkq[27] = 1901184448;
        ih.adkq[28] = -447223379;
        ih.adkq[29] = -1254290624;
        ih.adkq[30] = -311845392;
        ih.adkq[31] = 1502153249;
        ih.adkq[32] = 1653001217;
        ih.adkq[33] = -295129376;
        ih.adkq[34] = 89278343;
        ih.adkq[35] = 806562429;
        ih.adkq[36] = -10029020;
        ih.adkq[37] = -1978799058;
        ih.adkq[38] = 1019990793;
        ih.adkq[39] = 62515737;
        ih.adkq[40] = -583447258;
        ih.adkq[41] = 1985552905;
        ih.adkq[42] = -1754790171;
        ih.adkq[43] = 647200071;
        ih.adkq[44] = -742033620;
        ih.adkq[45] = -2132581573;
        ih.adkq[46] = -2141623309;
        ih.adkq[47] = -792152320;
        ih.adkq[48] = -848403760;
        ih.adkq[49] = -1419544776;
        ih.adkq[50] = 1759874018;
        ih.adkq[51] = -2034166910;
        ih.adkq[52] = -790979053;
        ih.adkq[53] = 2063740996;
        ih.adkq[54] = -1843881474;
        ih.adkq[55] = 269796329;
        ih.adkq[56] = -1723490136;
        ih.adkq[57] = -855340740;
        ih.adkq[58] = -1406350284;
        ih.adkq[59] = 141163518;
    }

    private static /* synthetic */ float adlk(int n2) {
        return Float.intBitsToFloat(adkq[n2] ^ adks[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        var16_5 = ih.c;
        var15_6 /* !! */  = ih.b;
        var14_7 = ih.a;
        if (var16_5) {
            throw null;
lbl6:
            // 22 sources

            return null;
        }
        if (var14_7 || var14_7) ** GOTO lbl6
        if (var4_4 == null) ** GOTO lbl30
        if (var14_7) ** GOTO lbl6
        if (!d.getInstance().getManager().getAttackPerpetrator().getAttackHandler().canAttack(hn.getInstance().getConfig(), (int)ih.adkt("adlf", adkn(int ), (int)3))) ** GOTO lbl30
        if (var14_7 || var14_7) ** GOTO lbl6
        var5_8 = ow.calculateDelta(var1_1, var2_2);
        if (var14_7 || var14_7) ** GOTO lbl6
        var6_10 = var5_8.getYaw();
        if (var14_7) ** GOTO lbl6
        if (var15_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var14_7) ** GOTO lbl6
                var7_12 = var5_8.getPitch();
                if (var14_7 || var14_7) ** GOTO lbl6
                var8_14 = (float)Math.hypot(Math.abs(var6_10), Math.abs(var7_12));
                if (var14_7 || var14_7) ** GOTO lbl6
                var9_16 = Math.abs(var6_10 / var8_14) * ih.adkt("adlm", adlk(int ), (int)4) * ih.adkt("adlo", adlk(int ), (int)5);
                if (var14_7 || var14_7) ** GOTO lbl6
                var10_18 = Math.abs(var7_12 / var8_14) * ih.adkt("adlr", adlk(int ), (int)6) * ih.adkt("adls", adlk(int ), (int)7);
                if (var14_7 || var14_7) ** GOTO lbl6
                return new ov(var1_1.getYaw() + Math.min(Math.max(var6_10, -var9_16), var9_16), var1_1.getPitch() + Math.min(Math.max(var7_12, -var10_18), var10_18));
            }
lbl30:
            // 2 sources

            if (var14_7 || var14_7) ** GOTO lbl6
            var5_9 = new ov(ih.mc.field_1724.method_36454(), ih.mc.field_1724.method_36455());
            if (var14_7 || var14_7) ** GOTO lbl6
            var6_11 = ow.calculateDelta(var1_1, var5_9);
            if (var14_7 || var14_7) ** GOTO lbl6
            var7_13 = var6_11.getYaw();
            if (var14_7 || var14_7) ** GOTO lbl6
            var8_15 = var6_11.getPitch();
            if (var14_7 || var14_7) ** GOTO lbl6
            var9_17 = (float)Math.hypot(Math.abs(var7_13), Math.abs(var8_15));
            if (var14_7 || var14_7) ** GOTO lbl6
            var10_19 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler().getAttackTimer().finished((double)ih.adkt("admb", adlw(int ), (int)0));
            if (var14_7 || var14_7) ** GOTO lbl6
            if (!var10_19) ** GOTO lbl49
            if (var14_7) ** GOTO lbl6
            v0 /* !! */  = ih.adkt("adme", adlk(int ), (int)8);
            if (var16_5) {
                throw null;
            }
            ** GOTO lbl51
lbl49:
            // 1 sources

            if (var14_7 || var14_7) ** GOTO lbl6
            v0 /* !! */  = var11_20 /* !! */  = (CallSite)0.0f;
lbl51:
            // 2 sources

            if (var14_7 || var14_7) ** GOTO lbl6
            var12_21 = Math.abs(var7_13 / var9_17) * var11_20 /* !! */ ;
            if (var14_7 || var14_7) ** GOTO lbl6
            var13_22 = Math.abs(var8_15 / var9_17) * var11_20 /* !! */ ;
            if (!var14_7 && !var14_7) ** break;
            ** continue;
            return new ov(var1_1.getYaw() + Math.min(Math.max(var7_13, -var12_21), var12_21), var1_1.getPitch() + Math.min(Math.max(var8_15, -var13_22), var13_22));
lbl58:
            // 3 sources

            case 0: {
                var15_6 /* !! */  = (int)ih.adkt("admh", adkn(int ), (int)9);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl63:
            // 2 sources

            case 1: {
                var15_6 /* !! */  = (int)ih.adkt("admj", adkn(int ), (int)10);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 2: {
                var15_6 /* !! */  = (int)ih.adkt("admk", adkn(int ), (int)11);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl73:
            // 2 sources

            case 3: {
                var15_6 /* !! */  = (int)ih.adkt("admm", adkn(int ), (int)12);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl78:
            // 2 sources

            case 4: {
                var15_6 /* !! */  = (int)ih.adkt("admo", adkn(int ), (int)13);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 5: {
                var15_6 /* !! */  = (int)ih.adkt("admq", adkn(int ), (int)14);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 6: {
                var15_6 /* !! */  = (int)ih.adkt("admr", adkn(int ), (int)15);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 7: {
                var15_6 /* !! */  = (int)ih.adkt("admt", adkn(int ), (int)16);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl98:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_6 /* !! */  = (int)ih.adkt("admu", adkn(int ), (int)17);
                    if (!var16_5) ** GOTO lbl63
                    throw null;
                }
            }
            case 9: {
                var15_6 /* !! */  = (int)ih.adkt("admw", adkn(int ), (int)18);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl108:
            // 2 sources

            case 10: {
                var15_6 /* !! */  = (int)ih.adkt("admy", adkn(int ), (int)19);
                if (!var16_5) ** GOTO lbl58
                throw null;
            }
lbl112:
            // 2 sources

            case 11: {
                var15_6 /* !! */  = (int)ih.adkt("admz", adkn(int ), (int)20);
                if (!var16_5) ** GOTO lbl98
                throw null;
            }
lbl116:
            // 3 sources

            case 12: {
                var15_6 /* !! */  = (int)ih.adkt("adnb", adkn(int ), (int)21);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 13: {
                var15_6 /* !! */  = (int)ih.adkt("adnd", adkn(int ), (int)22);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 14: {
                var15_6 /* !! */  = (int)ih.adkt("adnf", adkn(int ), (int)23);
                if (var16_5) {
                    throw null;
                }
            }
            case 15: {
                var15_6 /* !! */  = (int)ih.adkt("adnh", adkn(int ), (int)24);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl135:
            // 2 sources

            case 16: {
                var15_6 /* !! */  = (int)ih.adkt("adnj", adkn(int ), (int)25);
                if (!var16_5) ** GOTO lbl58
                throw null;
            }
            case 17: {
                var15_6 /* !! */  = (int)ih.adkt("adnl", adkn(int ), (int)26);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl144:
            // 2 sources

            case 18: {
                var15_6 /* !! */  = (int)ih.adkt("adnn", adkn(int ), (int)27);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 19: {
                var15_6 /* !! */  = (int)ih.adkt("adnp", adkn(int ), (int)28);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 20: {
                var15_6 /* !! */  = (int)ih.adkt("adnr", adkn(int ), (int)29);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 21: {
                var15_6 /* !! */  = (int)ih.adkt("adnt", adkn(int ), (int)30);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 22: {
                var15_6 /* !! */  = (int)ih.adkt("adnv", adkn(int ), (int)31);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl169:
            // 3 sources

            case 23: {
                var15_6 /* !! */  = (int)ih.adkt("adnx", adkn(int ), (int)32);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl174:
            // 2 sources

            case 24: {
                var15_6 /* !! */  = (int)ih.adkt("adnz", adkn(int ), (int)33);
                if (!var16_5) ** GOTO lbl135
                throw null;
            }
lbl178:
            // 4 sources

            case 25: {
                var15_6 /* !! */  = (int)ih.adkt("adob", adkn(int ), (int)34);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl183:
            // 3 sources

            case 26: {
                var15_6 /* !! */  = (int)ih.adkt("adod", adkn(int ), (int)35);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 27: {
                var15_6 /* !! */  = (int)ih.adkt("adof", adkn(int ), (int)36);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl193:
            // 2 sources

            case 28: {
                var15_6 /* !! */  = (int)ih.adkt("adoi", adkn(int ), (int)37);
                if (!var16_5) break;
                throw null;
            }
lbl197:
            // 3 sources

            case 29: {
                var15_6 /* !! */  = (int)ih.adkt("adoj", adkn(int ), (int)38);
                if (!var16_5) ** GOTO lbl178
                throw null;
            }
lbl201:
            // 2 sources

            case 30: {
                var15_6 /* !! */  = (int)ih.adkt("adom", adkn(int ), (int)39);
                if (!var16_5) break;
                throw null;
            }
lbl205:
            // 3 sources

            case 31: {
                var15_6 /* !! */  = (int)ih.adkt("adoo", adkn(int ), (int)40);
                if (var16_5) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl210:
            // 2 sources

            case 32: {
                var15_6 /* !! */  = (int)ih.adkt("adoq", adkn(int ), (int)41);
                if (!var16_5) ** GOTO lbl78
                throw null;
            }
lbl214:
            // 2 sources

            case 33: {
                var15_6 /* !! */  = (int)ih.adkt("ados", adkn(int ), (int)42);
                if (!var16_5) ** GOTO lbl73
                throw null;
            }
            case 34: {
                var15_6 /* !! */  = (int)ih.adkt("adou", adkn(int ), (int)43);
                if (!var16_5) ** GOTO lbl98
                throw null;
            }
lbl222:
            // 3 sources

            case 35: {
                var15_6 /* !! */  = (int)ih.adkt("adow", adkn(int ), (int)44);
                if (var16_5) {
                    throw null;
                }
            }
            case 36: {
                var15_6 /* !! */  = (int)ih.adkt("adoy", adkn(int ), (int)45);
                if (!var16_5) ** GOTO lbl169
                throw null;
            }
            case 37: {
                var15_6 /* !! */  = (int)ih.adkt("adpa", adkn(int ), (int)46);
                if (!var16_5) ** GOTO lbl169
                throw null;
            }
lbl234:
            // 4 sources

            case 38: {
                var15_6 /* !! */  = (int)ih.adkt("adpc", adkn(int ), (int)47);
                if (!var16_5) ** GOTO lbl108
                throw null;
            }
lbl238:
            // 3 sources

            case 39: {
                var15_6 /* !! */  = (int)ih.adkt("adpf", adkn(int ), (int)48);
                if (!var16_5) ** GOTO lbl214
                throw null;
            }
lbl242:
            // 3 sources

            case 40: {
                var15_6 /* !! */  = (int)ih.adkt("adph", adkn(int ), (int)49);
                if (!var16_5) ** GOTO lbl222
                throw null;
            }
            case 41: {
                var15_6 /* !! */  = (int)ih.adkt("adpj", adkn(int ), (int)50);
                if (!var16_5) ** GOTO lbl201
                throw null;
            }
            case 42: 
        }
        var15_6 /* !! */  = (int)ih.adkt("adpl", adkn(int ), (int)51);
        ** while (!var16_5)
lbl253:
        // 1 sources

        throw null;
    }
}

