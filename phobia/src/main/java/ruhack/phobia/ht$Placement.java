/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_3965
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

final class ht$Placement
extends Record {
    private final class_2338 placePos;
    private final class_243 hitVec;
    private static int[] bfit;
    public static final boolean a;
    private final class_3965 hitResult;
    private static long[] bfja;
    protected static final long df = -7876709847033634454L;
    private static int[] bfis;
    public static final boolean c;
    public static final int b;
    private final class_2338 supportPos;
    private static long[] bfjb;

    private static /* synthetic */ void bfnr() {
        ht$Placement.bfjb[0] = -99601730965411600L;
        ht$Placement.bfjb[1] = -4000976680836774746L;
        ht$Placement.bfjb[2] = 6926833858568834579L;
        ht$Placement.bfjb[3] = 3595593127904756838L;
        ht$Placement.bfjb[4] = 2924844958909034749L;
        ht$Placement.bfjb[5] = 5640725623762560402L;
        ht$Placement.bfjb[6] = -8718837030707787272L;
        ht$Placement.bfjb[7] = 6693634915290168327L;
        ht$Placement.bfjb[8] = -7997949058252280239L;
        ht$Placement.bfjb[9] = -7437330625503309677L;
        ht$Placement.bfjb[10] = 6072844431373136112L;
        ht$Placement.bfjb[11] = 1329593892268979540L;
        ht$Placement.bfjb[12] = -8888045908610952842L;
        ht$Placement.bfjb[13] = 1131661376944830315L;
        ht$Placement.bfjb[14] = 4983363197207659504L;
        ht$Placement.bfjb[15] = 461219406198766367L;
        ht$Placement.bfjb[16] = 1145832640479400748L;
        ht$Placement.bfjb[17] = 62876759180356711L;
        ht$Placement.bfjb[18] = 6373575737052876471L;
        ht$Placement.bfjb[19] = -540545673663144819L;
        ht$Placement.bfjb[20] = -967497217004210439L;
        ht$Placement.bfjb[21] = -6049021837218204072L;
        ht$Placement.bfjb[22] = -4239935036159618688L;
        ht$Placement.bfjb[23] = -4699281522762428302L;
        ht$Placement.bfjb[24] = -1930570755484783695L;
        ht$Placement.bfjb[25] = 6177869350779281532L;
        ht$Placement.bfjb[26] = 7325960663341771520L;
        ht$Placement.bfjb[27] = -6670133828957822476L;
        ht$Placement.bfjb[28] = -2137231955727764378L;
        ht$Placement.bfjb[29] = 5557029072749239411L;
        ht$Placement.bfjb[30] = 4760602998237535371L;
        ht$Placement.bfjb[31] = 5557457154455189604L;
        ht$Placement.bfjb[32] = -4478167760355367215L;
        ht$Placement.bfjb[33] = 3328008308756598912L;
        ht$Placement.bfjb[34] = 403512309437658021L;
        ht$Placement.bfjb[35] = 1706965120750619278L;
        ht$Placement.bfjb[36] = 7335388001775474471L;
        ht$Placement.bfjb[37] = 6290994389129147371L;
        ht$Placement.bfjb[38] = -6154928717574784838L;
        ht$Placement.bfjb[39] = 7931354355384737286L;
        ht$Placement.bfjb[40] = -4439180367292021868L;
        ht$Placement.bfjb[41] = -3128435987785401150L;
        ht$Placement.bfjb[42] = -2999250574297699879L;
        ht$Placement.bfjb[43] = -4687115129963542759L;
        ht$Placement.bfjb[44] = -5041445379650126953L;
        ht$Placement.bfjb[45] = 311587341678187825L;
        ht$Placement.bfjb[46] = -8551573343011731335L;
        ht$Placement.bfjb[47] = 8040224521648483192L;
        ht$Placement.bfjb[48] = 5656915700085193361L;
        ht$Placement.bfjb[49] = -6095009487644198074L;
        ht$Placement.bfjb[50] = -248111665512085429L;
        ht$Placement.bfjb[51] = 4222757353387269561L;
        ht$Placement.bfjb[52] = -3860548534002291860L;
        ht$Placement.bfjb[53] = -8669010217422022094L;
        ht$Placement.bfjb[54] = -210234549891544559L;
        ht$Placement.bfjb[55] = -8437803629086048194L;
        ht$Placement.bfjb[56] = 4615925869188720803L;
        ht$Placement.bfjb[57] = -6039391611572953518L;
        ht$Placement.bfjb[58] = 4752199860244778277L;
        ht$Placement.bfjb[59] = -4228703425720304599L;
    }

    private static /* synthetic */ long bfiz(int n2) {
        return bfja[n2] ^ bfjb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - ht$Placement.bfiu("bfjr", bfiz(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 72083103: {
                    v1 = ht$Placement.bfiu("bfjs", bfiz(int ), (int)6);
                    continue block22;
                }
                case 805677968: {
                    v1 = ht$Placement.bfiu("bfjt", bfiz(int ), (int)7);
                    continue block22;
                }
                case 1891443050: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = ht$Placement.c;
        v2 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ht$Placement.bfiu("bfju", bfiz(int ), (int)8));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -774964767: {
                    v3 = ht$Placement.bfiu("bfjv", bfiz(int ), (int)9);
                    continue block23;
                }
                case 1698539737: {
                    v3 = ht$Placement.bfiu("bfjw", bfiz(int ), (int)10);
                    continue block23;
                }
                case 1891443050: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht$Placement.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfjx", bfiz(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ht$Placement.bfiu("bfjy", bfir(int ), (int)14)) break;
            v4 /* !! */  = (long)ht$Placement.bfiu("bfjz", bfir(int ), (int)15);
        }
        var1_3 = ht$Placement.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (int)ht$Placement.bfiu("bfka", bfir(int ), (int)16);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = ht$Placement.df;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - ht$Placement.bfiu("bfkb", bfiz(int ), (int)12));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -492978305: {
                            v6 = ht$Placement.bfiu("bfkc", bfiz(int ), (int)13);
                            continue block26;
                        }
                        case 1237933754: {
                            v6 = ht$Placement.bfiu("bfkd", bfiz(int ), (int)14);
                            continue block26;
                        }
                        case 1353756247: {
                            v6 = ht$Placement.bfiu("bfke", bfiz(int ), (int)15);
                            continue block26;
                        }
                        case 1891443050: {
                            break block26;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ht$Placement.class, "placePos;supportPos;hitVec;hitResult", "placePos", "supportPos", "hitVec", "hitResult"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfkf", bfir(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfkg", bfir(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfkh", bfir(int ), (int)19);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ht$Placement.bfiu("bfki", bfir(int ), (int)20);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_3965 hitResult() {
        v0 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(ht$Placement.bfiu("bfna", bfiz(int ), (int)52) - ht$Placement.bfiu("bfmz", bfiz(int ), (int)51));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1836119123: {
                    continue block20;
                }
                case 1891443050: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = ht$Placement.c;
        v1 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(ht$Placement.bfiu("bfnc", bfiz(int ), (int)54) - ht$Placement.bfiu("bfnb", bfiz(int ), (int)53));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 509128729: {
                    continue block21;
                }
                case 1891443050: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht$Placement.b;
        v2 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl25
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ht$Placement.bfiu("bfnd", bfiz(int ), (int)55));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1514859944: {
                    v3 = ht$Placement.bfiu("bfne", bfiz(int ), (int)56);
                    continue block22;
                }
                case 308474035: {
                    v3 = ht$Placement.bfiu("bfnf", bfiz(int ), (int)57);
                    continue block22;
                }
                case 1671591469: {
                    v3 = ht$Placement.bfiu("bfng", bfiz(int ), (int)58);
                    continue block22;
                }
                case 1891443050: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = ht$Placement.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfnh", bfiz(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ht$Placement.bfiu("bfni", bfir(int ), (int)54)) break;
                    v4 /* !! */  = (long)ht$Placement.bfiu("bfnj", bfir(int ), (int)55);
                }
                return this.hitResult;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfnk", bfir(int ), (int)56);
                    if (!var3_1) break block14;
                    throw null;
                }
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfnl", bfir(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfnm", bfir(int ), (int)58);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ht$Placement.bfiu("bfnn", bfir(int ), (int)59);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_2338 placePos() {
        v0 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ht$Placement.bfiu("bflb", bfiz(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1897058791: {
                    v1 = ht$Placement.bfiu("bflc", bfiz(int ), (int)24);
                    continue block23;
                }
                case -970583099: {
                    v1 = ht$Placement.bfiu("bfld", bfiz(int ), (int)25);
                    continue block23;
                }
                case 1891443050: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = ht$Placement.c;
        v2 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - ht$Placement.bfiu("bfle", bfiz(int ), (int)26));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1102074668: {
                    v3 = ht$Placement.bfiu("bflf", bfiz(int ), (int)27);
                    continue block24;
                }
                case -578135237: {
                    v3 = ht$Placement.bfiu("bflg", bfiz(int ), (int)28);
                    continue block24;
                }
                case 96867955: {
                    v3 = ht$Placement.bfiu("bflh", bfiz(int ), (int)29);
                    continue block24;
                }
                case 1891443050: {
                    break block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht$Placement.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfli", bfiz(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ht$Placement.bfiu("bflj", bfir(int ), (int)32)) {
                        var1_3 = ht$Placement.a;
                        if (var3_1) {
                            throw null;
                        }
                        break;
                    }
                    v4 /* !! */  = (long)ht$Placement.bfiu("bflk", bfir(int ), (int)33);
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                v5 /* !! */  = ht$Placement.df;
                block26: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -617236037: {
                            v6 = ht$Placement.bfiu("bflm", bfiz(int ), (int)32);
                            ** GOTO lbl58
                        }
                        case 139916602: {
                            v6 = ht$Placement.bfiu("bfln", bfiz(int ), (int)33);
                            ** GOTO lbl58
                        }
                        case 940541625: {
                            v6 = ht$Placement.bfiu("bflo", bfiz(int ), (int)34);
lbl58:
                            // 3 sources

                            v5 /* !! */  = (long)(v6 - ht$Placement.bfiu("bfll", bfiz(int ), (int)31));
                            continue block26;
                        }
                        case 1891443050: {
                            return this.placePos;
                        }
                    }
                    break;
                }
                return this.placePos;
            }
            case 0: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bflp", bfir(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl73
            }
            case 3: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfls", bfir(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
lbl73:
                // 3 sources

                var2_2 /* !! */  = (int)ht$Placement.bfiu("bflq", bfir(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)ht$Placement.bfiu("bflr", bfir(int ), (int)36);
        } while (!var3_1);
        throw null;
    }

    static {
        bfis = new int[60];
        bfit = new int[60];
        ht$Placement.bfno();
        ht$Placement.bfnp();
        bfja = new long[60];
        bfjb = new long[60];
        ht$Placement.bfnq();
        ht$Placement.bfnr();
    }

    private static /* synthetic */ void bfno() {
        ht$Placement.bfis[0] = -1333205553;
        ht$Placement.bfis[1] = 98198565;
        ht$Placement.bfis[2] = -788071718;
        ht$Placement.bfis[3] = 1414337821;
        ht$Placement.bfis[4] = -1940765020;
        ht$Placement.bfis[5] = 1281382255;
        ht$Placement.bfis[6] = 1934415105;
        ht$Placement.bfis[7] = -822129318;
        ht$Placement.bfis[8] = 1359251331;
        ht$Placement.bfis[9] = -2070345039;
        ht$Placement.bfis[10] = 1495397902;
        ht$Placement.bfis[11] = -1306398860;
        ht$Placement.bfis[12] = 482572833;
        ht$Placement.bfis[13] = -255714883;
        ht$Placement.bfis[14] = -824529368;
        ht$Placement.bfis[15] = 243452522;
        ht$Placement.bfis[16] = -1109843536;
        ht$Placement.bfis[17] = 40747077;
        ht$Placement.bfis[18] = 1575713665;
        ht$Placement.bfis[19] = 2050736851;
        ht$Placement.bfis[20] = -1368008414;
        ht$Placement.bfis[21] = -1141584949;
        ht$Placement.bfis[22] = 2021612157;
        ht$Placement.bfis[23] = 675797303;
        ht$Placement.bfis[24] = -436303523;
        ht$Placement.bfis[25] = 293190924;
        ht$Placement.bfis[26] = -1667890494;
        ht$Placement.bfis[27] = -891402167;
        ht$Placement.bfis[28] = -978642773;
        ht$Placement.bfis[29] = -1401187424;
        ht$Placement.bfis[30] = 1410795781;
        ht$Placement.bfis[31] = 1437285376;
        ht$Placement.bfis[32] = 1173628965;
        ht$Placement.bfis[33] = 373906835;
        ht$Placement.bfis[34] = 0x2DDDDDD4;
        ht$Placement.bfis[35] = 1138832801;
        ht$Placement.bfis[36] = -1530251335;
        ht$Placement.bfis[37] = 1326334354;
        ht$Placement.bfis[38] = -877506949;
        ht$Placement.bfis[39] = 1936987567;
        ht$Placement.bfis[40] = 1777713530;
        ht$Placement.bfis[41] = 1927746586;
        ht$Placement.bfis[42] = -25082261;
        ht$Placement.bfis[43] = 647036877;
        ht$Placement.bfis[44] = 186000526;
        ht$Placement.bfis[45] = -1935315020;
        ht$Placement.bfis[46] = 2126764873;
        ht$Placement.bfis[47] = 1290468189;
        ht$Placement.bfis[48] = 1784586780;
        ht$Placement.bfis[49] = 1516710029;
        ht$Placement.bfis[50] = 785415753;
        ht$Placement.bfis[51] = -1120028723;
        ht$Placement.bfis[52] = -269822941;
        ht$Placement.bfis[53] = 861688997;
        ht$Placement.bfis[54] = 745891015;
        ht$Placement.bfis[55] = 55508949;
        ht$Placement.bfis[56] = -1258372696;
        ht$Placement.bfis[57] = 1018159575;
        ht$Placement.bfis[58] = 1968434820;
        ht$Placement.bfis[59] = 1335994549;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 hitVec() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfmk", bfiz(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ht$Placement.bfiu("bfml", bfir(int ), (int)44)) break;
            v0 /* !! */  = (long)ht$Placement.bfiu("bfmm", bfir(int ), (int)45);
        }
        var3_1 = ht$Placement.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ht$Placement.df - ht$Placement.bfiu("bfmn", bfiz(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ht$Placement.bfiu("bfmo", bfir(int ), (int)46)) break;
            v1 /* !! */  = (long)ht$Placement.bfiu("bfmp", bfir(int ), (int)47);
        }
        var2_2 /* !! */  = ht$Placement.b;
        v2 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(ht$Placement.bfiu("bfmr", bfiz(int ), (int)49) - ht$Placement.bfiu("bfmq", bfiz(int ), (int)48));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1891443050: {
                    break block12;
                }
                case 1894437410: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = ht$Placement.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ht$Placement.df - ht$Placement.bfiu("bfms", bfiz(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ht$Placement.bfiu("bfmt", bfir(int ), (int)48)) break;
                    v3 /* !! */  = (long)ht$Placement.bfiu("bfmu", bfir(int ), (int)49);
                }
                return this.hitVec;
            }
lbl41:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfmv", bfir(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl51
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfmw", bfir(int ), (int)51);
                    if (!var3_1) ** GOTO lbl41
                    throw null;
                }
            }
lbl51:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfmx", bfir(int ), (int)52);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ht$Placement.bfiu("bfmy", bfir(int ), (int)53);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bfiu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ht$Placement(class_2338 var1_1, class_2338 var2_2, class_243 var3_3, class_3965 var4_4) {
        var6_5 /* !! */  = ht$Placement.b;
        super();
        this.placePos = var1_1;
        this.supportPos = var2_2;
        this.hitVec = var3_3;
        this.hitResult = var4_4;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var6_5 /* !! */  = (int)ht$Placement.bfiu("bfiv", bfir(int ), (int)0);
                ** GOTO lbl18
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)ht$Placement.bfiu("bfiw", bfir(int ), (int)1);
                    ** GOTO lbl11
                    break;
                }
            }
lbl18:
            // 2 sources

            case 2: {
                while (true) {
                    var6_5 /* !! */  = (int)ht$Placement.bfiu("bfix", bfir(int ), (int)2);
                }
            }
            case 3: 
        }
        var6_5 /* !! */  = (int)ht$Placement.bfiu("bfiy", bfir(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2338 supportPos() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bflt", bfiz(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ht$Placement.bfiu("bflu", bfir(int ), (int)38)) break;
            v0 /* !! */  = (long)ht$Placement.bfiu("bflv", bfir(int ), (int)39);
        }
        var3_1 = ht$Placement.c;
        v1 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ht$Placement.bfiu("bflw", bfiz(int ), (int)36));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2122943306: {
                    v2 = ht$Placement.bfiu("bflx", bfiz(int ), (int)37);
                    continue block17;
                }
                case -2008846087: {
                    v2 = ht$Placement.bfiu("bfly", bfiz(int ), (int)38);
                    continue block17;
                }
                case 422958987: {
                    v2 = ht$Placement.bfiu("bflz", bfiz(int ), (int)39);
                    continue block17;
                }
                case 1891443050: {
                    break block17;
                }
            }
            break;
        }
        var2_2 = ht$Placement.b;
        v3 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(ht$Placement.bfiu("bfmb", bfiz(int ), (int)41) - ht$Placement.bfiu("bfma", bfiz(int ), (int)40));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1257352378: {
                    continue block18;
                }
                case 1891443050: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = ht$Placement.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl44
        block20: while (true) {
            v4 /* !! */  = (long)(v5 - ht$Placement.bfiu("bfmc", bfiz(int ), (int)42));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1539929053: {
                    v5 = ht$Placement.bfiu("bfmd", bfiz(int ), (int)43);
                    continue block20;
                }
                case -373362298: {
                    v5 = ht$Placement.bfiu("bfme", bfiz(int ), (int)44);
                    continue block20;
                }
                case 162394374: {
                    v5 = ht$Placement.bfiu("bfmf", bfiz(int ), (int)45);
                    continue block20;
                }
                case 1891443050: {
                    break block20;
                }
            }
            break;
        }
        return this.supportPos;
    }

    private static /* synthetic */ void bfnp() {
        ht$Placement.bfit[0] = -1333205554;
        ht$Placement.bfit[1] = 98198566;
        ht$Placement.bfit[2] = -788071718;
        ht$Placement.bfit[3] = 1414337823;
        ht$Placement.bfit[4] = 1940765019;
        ht$Placement.bfit[5] = 55632288;
        ht$Placement.bfit[6] = -1934415106;
        ht$Placement.bfit[7] = 904260931;
        ht$Placement.bfit[8] = -1359251332;
        ht$Placement.bfit[9] = -1217408831;
        ht$Placement.bfit[10] = 1495397903;
        ht$Placement.bfit[11] = -1306398858;
        ht$Placement.bfit[12] = 482572835;
        ht$Placement.bfit[13] = -255714884;
        ht$Placement.bfit[14] = 824529367;
        ht$Placement.bfit[15] = -627025223;
        ht$Placement.bfit[16] = 548746761;
        ht$Placement.bfit[17] = 40747077;
        ht$Placement.bfit[18] = 1575713666;
        ht$Placement.bfit[19] = 2050736849;
        ht$Placement.bfit[20] = -1368008415;
        ht$Placement.bfit[21] = 1141584948;
        ht$Placement.bfit[22] = -1958060621;
        ht$Placement.bfit[23] = -675797304;
        ht$Placement.bfit[24] = 508709541;
        ht$Placement.bfit[25] = 293190924;
        ht$Placement.bfit[26] = 1667890493;
        ht$Placement.bfit[27] = 1860357859;
        ht$Placement.bfit[28] = -978642776;
        ht$Placement.bfit[29] = -1401187424;
        ht$Placement.bfit[30] = 1410795781;
        ht$Placement.bfit[31] = 1437285379;
        ht$Placement.bfit[32] = -1173628966;
        ht$Placement.bfit[33] = -1978668055;
        ht$Placement.bfit[34] = 0x2DDDDDD5;
        ht$Placement.bfit[35] = 1138832801;
        ht$Placement.bfit[36] = -1530251335;
        ht$Placement.bfit[37] = 1326334354;
        ht$Placement.bfit[38] = 877506948;
        ht$Placement.bfit[39] = 1861081199;
        ht$Placement.bfit[40] = 1777713528;
        ht$Placement.bfit[41] = 1927746585;
        ht$Placement.bfit[42] = -25082264;
        ht$Placement.bfit[43] = 647036878;
        ht$Placement.bfit[44] = -186000527;
        ht$Placement.bfit[45] = -1424633;
        ht$Placement.bfit[46] = -2126764874;
        ht$Placement.bfit[47] = 1351014460;
        ht$Placement.bfit[48] = -1784586781;
        ht$Placement.bfit[49] = -1710649616;
        ht$Placement.bfit[50] = 785415752;
        ht$Placement.bfit[51] = -1120028721;
        ht$Placement.bfit[52] = -269822942;
        ht$Placement.bfit[53] = 861688998;
        ht$Placement.bfit[54] = -745891016;
        ht$Placement.bfit[55] = -1968574593;
        ht$Placement.bfit[56] = -1258372696;
        ht$Placement.bfit[57] = 1018159575;
        ht$Placement.bfit[58] = 1968434820;
        ht$Placement.bfit[59] = 1335994549;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ht$Placement.bfiu("bfkj", bfiz(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1405336939: {
                    v1 = ht$Placement.bfiu("bfkk", bfiz(int ), (int)17);
                    continue block12;
                }
                case 1759707052: {
                    v1 = ht$Placement.bfiu("bfkl", bfiz(int ), (int)18);
                    continue block12;
                }
                case 1766803687: {
                    v1 = ht$Placement.bfiu("bfkm", bfiz(int ), (int)19);
                    continue block12;
                }
                case 1891443050: {
                    break block12;
                }
            }
            break;
        }
        var4_2 = ht$Placement.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfkn", bfiz(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht$Placement.bfiu("bfko", bfir(int ), (int)21)) break;
            v2 /* !! */  = (long)ht$Placement.bfiu("bfkp", bfir(int ), (int)22);
        }
        var3_3 /* !! */  = ht$Placement.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ht$Placement.df - ht$Placement.bfiu("bfkq", bfiz(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ht$Placement.bfiu("bfkr", bfir(int ), (int)23)) break;
            v3 /* !! */  = (long)ht$Placement.bfiu("bfks", bfir(int ), (int)24);
        }
        var2_4 = ht$Placement.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return (boolean)ht$Placement.bfiu("bfkt", bfir(int ), (int)25);
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ht$Placement.df - ht$Placement.bfiu("bfku", bfiz(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ht$Placement.bfiu("bfkv", bfir(int ), (int)26)) break;
                    v4 /* !! */  = (long)ht$Placement.bfiu("bfkw", bfir(int ), (int)27);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ht$Placement.class, "placePos;supportPos;hitVec;hitResult", "placePos", "supportPos", "hitVec", "hitResult"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)ht$Placement.bfiu("bfkx", bfir(int ), (int)28);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: {
                var3_3 /* !! */  = (int)ht$Placement.bfiu("bfky", bfir(int ), (int)29);
                if (!var4_2) break;
                throw null;
            }
lbl57:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ht$Placement.bfiu("bfkz", bfir(int ), (int)30);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ht$Placement.bfiu("bfla", bfir(int ), (int)31);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bfnq() {
        ht$Placement.bfja[0] = -9049908941203172480L;
        ht$Placement.bfja[1] = 5785192878774222735L;
        ht$Placement.bfja[2] = 7226815284751857999L;
        ht$Placement.bfja[3] = 9020678869702720224L;
        ht$Placement.bfja[4] = 7216250726660877319L;
        ht$Placement.bfja[5] = -114069231747159096L;
        ht$Placement.bfja[6] = 9112526885997172757L;
        ht$Placement.bfja[7] = 1036209636879124300L;
        ht$Placement.bfja[8] = 7589734510300412015L;
        ht$Placement.bfja[9] = 2555752532510795232L;
        ht$Placement.bfja[10] = 5057625703933102538L;
        ht$Placement.bfja[11] = 5103707700651342842L;
        ht$Placement.bfja[12] = 3544817525455860945L;
        ht$Placement.bfja[13] = 3371505274579053162L;
        ht$Placement.bfja[14] = -4653623225303548765L;
        ht$Placement.bfja[15] = 2833561684099954378L;
        ht$Placement.bfja[16] = -3439022929027145050L;
        ht$Placement.bfja[17] = 6308233932960067297L;
        ht$Placement.bfja[18] = -8604873209287574380L;
        ht$Placement.bfja[19] = -8572212119045243352L;
        ht$Placement.bfja[20] = -4682659944034907768L;
        ht$Placement.bfja[21] = 8952453559070003141L;
        ht$Placement.bfja[22] = -2556257414656516294L;
        ht$Placement.bfja[23] = -7747282688625007072L;
        ht$Placement.bfja[24] = 3902060766412384188L;
        ht$Placement.bfja[25] = 2643544307296484550L;
        ht$Placement.bfja[26] = -638526355752105191L;
        ht$Placement.bfja[27] = -2725938039103509991L;
        ht$Placement.bfja[28] = 5656957611828425143L;
        ht$Placement.bfja[29] = 6581465951404060155L;
        ht$Placement.bfja[30] = -8385872769817222563L;
        ht$Placement.bfja[31] = -5833128919999487799L;
        ht$Placement.bfja[32] = 2796818409911085802L;
        ht$Placement.bfja[33] = -4200841371913609212L;
        ht$Placement.bfja[34] = -4197717568852373695L;
        ht$Placement.bfja[35] = -5455212164968500628L;
        ht$Placement.bfja[36] = 6311220490459179136L;
        ht$Placement.bfja[37] = 2145045203745683570L;
        ht$Placement.bfja[38] = -1568142108406360444L;
        ht$Placement.bfja[39] = -6788311339533666347L;
        ht$Placement.bfja[40] = -7728739879729845470L;
        ht$Placement.bfja[41] = -622287783625916857L;
        ht$Placement.bfja[42] = -9172829779727827287L;
        ht$Placement.bfja[43] = -5691229236120560696L;
        ht$Placement.bfja[44] = 3082243631691596851L;
        ht$Placement.bfja[45] = -8686366109933559374L;
        ht$Placement.bfja[46] = -6949488083303903378L;
        ht$Placement.bfja[47] = 6334906809876975960L;
        ht$Placement.bfja[48] = 977015312707191825L;
        ht$Placement.bfja[49] = -741262638083806093L;
        ht$Placement.bfja[50] = -3185698033262395768L;
        ht$Placement.bfja[51] = -6339074877582464915L;
        ht$Placement.bfja[52] = -3776686374161281042L;
        ht$Placement.bfja[53] = -6271613712876525170L;
        ht$Placement.bfja[54] = -623666828848684572L;
        ht$Placement.bfja[55] = 4769357576355789558L;
        ht$Placement.bfja[56] = -160004238465515311L;
        ht$Placement.bfja[57] = 955357485187350512L;
        ht$Placement.bfja[58] = -3378334559003012519L;
        ht$Placement.bfja[59] = -9089454348013433193L;
    }

    private static /* synthetic */ int bfir(int n2) {
        return bfis[n2] ^ bfit[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = ht$Placement.df;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(ht$Placement.bfiu("bfjd", bfiz(int ), (int)1) - ht$Placement.bfiu("bfjc", bfiz(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 999544948: {
                    continue block10;
                }
                case 1891443050: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = ht$Placement.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ht$Placement.df - ht$Placement.bfiu("bfje", bfiz(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ht$Placement.bfiu("bfjf", bfir(int ), (int)4)) break;
            v1 /* !! */  = (long)ht$Placement.bfiu("bfjg", bfir(int ), (int)5);
        }
        var2_2 /* !! */  = ht$Placement.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ht$Placement.df - ht$Placement.bfiu("bfjh", bfiz(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht$Placement.bfiu("bfji", bfir(int ), (int)6)) break;
            v2 /* !! */  = (long)ht$Placement.bfiu("bfjj", bfir(int ), (int)7);
        }
        var1_3 = ht$Placement.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ht$Placement.df - ht$Placement.bfiu("bfjk", bfiz(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ht$Placement.bfiu("bfjl", bfir(int ), (int)8)) break;
                    v3 /* !! */  = (long)ht$Placement.bfiu("bfjm", bfir(int ), (int)9);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{ht$Placement.class, "placePos;supportPos;hitVec;hitResult", "placePos", "supportPos", "hitVec", "hitResult"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfjn", bfir(int ), (int)10);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl45:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ht$Placement.bfiu("bfjo", bfir(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ht$Placement.bfiu("bfjp", bfir(int ), (int)12);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ht$Placement.bfiu("bfjq", bfir(int ), (int)13);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }
}

