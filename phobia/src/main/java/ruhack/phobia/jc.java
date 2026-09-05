/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nd;

public class jc
extends ds {
    public static final String MODE_NORMAL = "\u041e\u0431\u044b\u0447\u043d\u044b\u0439";
    private static int[] ajsn = new int[124];
    public static final boolean c;
    public final kb onSelf;
    public final kf target;
    private static long[] ajsh;
    public static boolean renderContext;
    public static int visibleLight;
    public static final String MODE_SHADER = "\u0428\u0435\u0439\u0434\u0435\u0440";
    public final kf mode;
    public static int wallOverlay;
    public static int wallLight;
    public static final boolean a;
    public final kg speed;
    public static int visibleOverlay;
    protected static final long cb = 2999849330200875023L;
    public final kg fill;
    public static boolean wallContext;
    private static long[] ajsf;
    private static jc instance;
    public static final int b;
    public final kb throughWalls;
    public static boolean renderingSelf;
    private static int[] ajso;

    private static /* synthetic */ void ajzp() {
        jc.ajso[0] = 2144914458;
        jc.ajso[1] = 1133453555;
        jc.ajso[2] = 1656407204;
        jc.ajso[3] = -1429737477;
        jc.ajso[4] = -1693544187;
        jc.ajso[5] = 1744798279;
        jc.ajso[6] = 982333518;
        jc.ajso[7] = -374961333;
        jc.ajso[8] = -357152837;
        jc.ajso[9] = 110123133;
        jc.ajso[10] = 526215803;
        jc.ajso[11] = 611199368;
        jc.ajso[12] = -707027146;
        jc.ajso[13] = -2130642790;
        jc.ajso[14] = 1603623108;
        jc.ajso[15] = 1956766294;
        jc.ajso[16] = 295769535;
        jc.ajso[17] = 745545249;
        jc.ajso[18] = 1489187091;
        jc.ajso[19] = 418062828;
        jc.ajso[20] = 1559764474;
        jc.ajso[21] = -2088970332;
        jc.ajso[22] = 838519813;
        jc.ajso[23] = 1695295463;
        jc.ajso[24] = -1356323805;
        jc.ajso[25] = 388947134;
        jc.ajso[26] = -1062746750;
        jc.ajso[27] = -328634815;
        jc.ajso[28] = -743831236;
        jc.ajso[29] = -1754233162;
        jc.ajso[30] = 1432304940;
        jc.ajso[31] = 1153188084;
        jc.ajso[32] = -2062507069;
        jc.ajso[33] = 2074084645;
        jc.ajso[34] = -518883991;
        jc.ajso[35] = 634961586;
        jc.ajso[36] = -1674146011;
        jc.ajso[37] = 775427475;
        jc.ajso[38] = -25255021;
        jc.ajso[39] = -673043004;
        jc.ajso[40] = 316839576;
        jc.ajso[41] = -726229087;
        jc.ajso[42] = -115896621;
        jc.ajso[43] = -248427356;
        jc.ajso[44] = 768546424;
        jc.ajso[45] = -2130266944;
        jc.ajso[46] = -1403341041;
        jc.ajso[47] = 419528168;
        jc.ajso[48] = 782118714;
        jc.ajso[49] = -394378410;
        jc.ajso[50] = -1914530104;
        jc.ajso[51] = 1101167992;
        jc.ajso[52] = 579234600;
        jc.ajso[53] = 1062264122;
        jc.ajso[54] = -1236579615;
        jc.ajso[55] = -2098564513;
        jc.ajso[56] = -21906430;
        jc.ajso[57] = 183333167;
        jc.ajso[58] = -1412451176;
        jc.ajso[59] = -1590370310;
        jc.ajso[60] = 784758890;
        jc.ajso[61] = 935719205;
        jc.ajso[62] = 730836719;
        jc.ajso[63] = -1163863660;
        jc.ajso[64] = -193566393;
        jc.ajso[65] = 1642672088;
        jc.ajso[66] = 841690362;
        jc.ajso[67] = -1622146629;
        jc.ajso[68] = -1733436707;
        jc.ajso[69] = -1478340156;
        jc.ajso[70] = -1404760645;
        jc.ajso[71] = -1982591167;
        jc.ajso[72] = -1766766152;
        jc.ajso[73] = -1167485561;
        jc.ajso[74] = -1972259218;
        jc.ajso[75] = 470549540;
        jc.ajso[76] = 876809646;
        jc.ajso[77] = -1712150955;
        jc.ajso[78] = -809466123;
        jc.ajso[79] = 354998357;
        jc.ajso[80] = 450938089;
        jc.ajso[81] = -1942479747;
        jc.ajso[82] = 449482712;
        jc.ajso[83] = -860781395;
        jc.ajso[84] = 1568970099;
        jc.ajso[85] = -511250352;
        jc.ajso[86] = -1394218118;
        jc.ajso[87] = -1564653676;
        jc.ajso[88] = 965895880;
        jc.ajso[89] = -362591750;
        jc.ajso[90] = 1367136299;
        jc.ajso[91] = -1588999813;
        jc.ajso[92] = 179200683;
        jc.ajso[93] = 1412382915;
        jc.ajso[94] = -809260242;
        jc.ajso[95] = -794105258;
        jc.ajso[96] = -1344428142;
        jc.ajso[97] = -997415004;
        jc.ajso[98] = -510008385;
        jc.ajso[99] = -1943702965;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jc getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajsk", ajsb(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jc.ajsi("ajsr", ajsm(int ), (int)0)) break;
            v0 /* !! */  = (long)jc.ajsi("ajss", ajsm(int ), (int)1);
        }
        var2 = jc.c;
        v1 /* !! */  = jc.cb;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - jc.ajsi("ajsu", ajsb(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1714211547: {
                    v2 = jc.ajsi("ajsv", ajsb(int ), (int)2);
                    continue block18;
                }
                case -1191653836: {
                    v2 = jc.ajsi("ajsx", ajsb(int ), (int)3);
                    continue block18;
                }
                case -283687924: {
                    v2 = jc.ajsi("ajsy", ajsb(int ), (int)4);
                    continue block18;
                }
                case 1783697423: {
                    break block18;
                }
            }
            break;
        }
        var1_1 /* !! */  = jc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajsz", ajsb(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jc.ajsi("ajtb", ajsm(int ), (int)2)) break;
            v3 /* !! */  = (long)jc.ajsi("ajtc", ajsm(int ), (int)3);
        }
        var0_2 = jc.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = jc.cb;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - jc.ajsi("ajte", ajsb(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1600260853: {
                            v5 = jc.ajsi("ajtf", ajsb(int ), (int)7);
                            continue block21;
                        }
                        case 988327221: {
                            v5 = jc.ajsi("ajtg", ajsb(int ), (int)8);
                            continue block21;
                        }
                        case 1783697423: {
                            break block21;
                        }
                    }
                    break;
                }
                return jc.instance;
            }
lbl55:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)jc.ajsi("ajth", ajsm(int ), (int)4);
                    if (!var2) break block6;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)jc.ajsi("ajti", ajsm(int ), (int)5);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)jc.ajsi("ajtj", ajsm(int ), (int)6);
                if (!var2) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)jc.ajsi("ajtk", ajsm(int ), (int)7);
        ** while (!var2)
lbl71:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ajsi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ajzo() {
        jc.ajsn[100] = -1978319543;
        jc.ajsn[101] = 1798737678;
        jc.ajsn[102] = 1060825667;
        jc.ajsn[103] = -1833461317;
        jc.ajsn[104] = -1196347463;
        jc.ajsn[105] = 1158713421;
        jc.ajsn[106] = 2024079372;
        jc.ajsn[107] = 1489869825;
        jc.ajsn[108] = -343411643;
        jc.ajsn[109] = 1886860580;
        jc.ajsn[110] = 520168199;
        jc.ajsn[111] = -254817535;
        jc.ajsn[112] = -1494450969;
        jc.ajsn[113] = -1749151195;
        jc.ajsn[114] = 1405020475;
        jc.ajsn[115] = 1297797998;
        jc.ajsn[116] = 1580441175;
        jc.ajsn[117] = 8217972;
        jc.ajsn[118] = 1287887259;
        jc.ajsn[119] = 801778388;
        jc.ajsn[120] = 1803004673;
        jc.ajsn[121] = 907693554;
        jc.ajsn[122] = 1564214422;
        jc.ajsn[123] = -2084055206;
    }

    private static /* synthetic */ float ajtl(int n2) {
        return Float.intBitsToFloat(ajsn[n2] ^ ajso[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isShaderMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajux", ajsb(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jc.ajsi("ajuy", ajsm(int ), (int)35)) break;
            v0 /* !! */  = (long)jc.ajsi("ajuz", ajsm(int ), (int)36);
        }
        var3_1 = jc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajva", ajsb(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jc.ajsi("ajvb", ajsm(int ), (int)37)) break;
            v1 /* !! */  = (long)jc.ajsi("ajvc", ajsm(int ), (int)38);
        }
        var2_2 /* !! */  = jc.b;
        v2 /* !! */  = jc.cb;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(jc.ajsi("ajve", ajsb(int ), (int)22) - jc.ajsi("ajvd", ajsb(int ), (int)21));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 735203463: {
                    continue block12;
                }
                case 1783697423: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = jc.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)jc.ajsi("ajvf", ajsm(int ), (int)39);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = jc.cb - jc.ajsi("ajvg", ajsb(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jc.ajsi("ajvh", ajsm(int ), (int)40)) break;
                    v3 /* !! */  = (long)jc.ajsi("ajvi", ajsm(int ), (int)41);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = jc.cb - jc.ajsi("ajvj", ajsb(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jc.ajsi("ajvk", ajsm(int ), (int)42)) break;
                    v4 /* !! */  = (long)jc.ajsi("ajvl", ajsm(int ), (int)43);
                }
                return this.mode.isSelected("\u0428\u0435\u0439\u0434\u0435\u0440");
            }
            case 0: {
                var2_2 /* !! */  = (int)jc.ajsi("ajvm", ajsm(int ), (int)44);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jc.ajsi("ajvn", ajsm(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jc.ajsi("ajvo", ajsm(int ), (int)46);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jc.ajsi("ajvp", ajsm(int ), (int)47);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isNormalMode() {
        v0 /* !! */  = jc.cb;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(jc.ajsi("ajuf", ajsb(int ), (int)10) - jc.ajsi("ajue", ajsb(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -61210262: {
                    continue block20;
                }
                case 1783697423: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = jc.c;
        v1 /* !! */  = jc.cb;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - jc.ajsi("ajug", ajsb(int ), (int)11));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1750692487: {
                    v2 = jc.ajsi("ajuh", ajsb(int ), (int)12);
                    continue block21;
                }
                case 709441351: {
                    v2 = jc.ajsi("ajui", ajsb(int ), (int)13);
                    continue block21;
                }
                case 1783697423: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = jc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajuj", ajsb(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jc.ajsi("ajuk", ajsm(int ), (int)26)) break;
            v3 /* !! */  = (long)jc.ajsi("ajul", ajsm(int ), (int)27);
        }
        var1_3 = jc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)jc.ajsi("ajum", ajsm(int ), (int)28);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajun", ajsb(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jc.ajsi("ajuo", ajsm(int ), (int)29)) break;
                    v4 /* !! */  = (long)jc.ajsi("ajup", ajsm(int ), (int)30);
                }
                v5 /* !! */  = jc.cb;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - jc.ajsi("ajuq", ajsb(int ), (int)16));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -889719941: {
                            v6 = jc.ajsi("ajur", ajsb(int ), (int)17);
                            continue block25;
                        }
                        case 1343359236: {
                            v6 = jc.ajsi("ajus", ajsb(int ), (int)18);
                            continue block25;
                        }
                        case 1783697423: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
            }
lbl60:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)jc.ajsi("ajut", ajsm(int ), (int)31);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jc.ajsi("ajuu", ajsm(int ), (int)32);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jc.ajsi("ajuv", ajsm(int ), (int)33);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jc.ajsi("ajuw", ajsm(int ), (int)34);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ajsb(int n2) {
        return ajsf[n2] ^ ajsh[n2];
    }

    private static /* synthetic */ void ajzr() {
        jc.ajsf[0] = -6280437005077517357L;
        jc.ajsf[1] = 2615897547829439911L;
        jc.ajsf[2] = -5833274785340335149L;
        jc.ajsf[3] = 4487930884820027209L;
        jc.ajsf[4] = 1565054869738274616L;
        jc.ajsf[5] = 1826577978920053061L;
        jc.ajsf[6] = -2179387031368919040L;
        jc.ajsf[7] = 2195028165575444036L;
        jc.ajsf[8] = -3429399256536070562L;
        jc.ajsf[9] = -4180596355998074642L;
        jc.ajsf[10] = -5028535572870554025L;
        jc.ajsf[11] = -1352256020527306408L;
        jc.ajsf[12] = 6975895895235054761L;
        jc.ajsf[13] = 3735775952652553771L;
        jc.ajsf[14] = 7046046587690447130L;
        jc.ajsf[15] = 4646651035210125176L;
        jc.ajsf[16] = 6813158405017807599L;
        jc.ajsf[17] = -8443171819310539014L;
        jc.ajsf[18] = -1047744215639948169L;
        jc.ajsf[19] = 8491964545494376899L;
        jc.ajsf[20] = 9128086878567927142L;
        jc.ajsf[21] = -5479630483308958272L;
        jc.ajsf[22] = 5046521828673422912L;
        jc.ajsf[23] = -7772704661493387132L;
        jc.ajsf[24] = -2314347619353651855L;
        jc.ajsf[25] = -2617584749909894069L;
        jc.ajsf[26] = -567121910113711216L;
        jc.ajsf[27] = -7619458310608411292L;
        jc.ajsf[28] = 362253737473706279L;
        jc.ajsf[29] = 1816247143795158600L;
        jc.ajsf[30] = -8883926851203012370L;
        jc.ajsf[31] = 6901196817314084940L;
        jc.ajsf[32] = 4025765709389486707L;
        jc.ajsf[33] = -3867392465293874092L;
        jc.ajsf[34] = 5360822604913780790L;
        jc.ajsf[35] = 3264916292298577222L;
        jc.ajsf[36] = 6147331763938239126L;
        jc.ajsf[37] = -4640345779734903097L;
        jc.ajsf[38] = -8856038890829673710L;
        jc.ajsf[39] = -5531006513198998770L;
        jc.ajsf[40] = 3839966789736181011L;
        jc.ajsf[41] = -4240384940006487036L;
        jc.ajsf[42] = -5102047146384802303L;
        jc.ajsf[43] = -1072683578077744306L;
        jc.ajsf[44] = 3625292851570504369L;
        jc.ajsf[45] = -4809052453322694060L;
        jc.ajsf[46] = 6301844275266098824L;
        jc.ajsf[47] = -8204836120549422011L;
        jc.ajsf[48] = -6294279727679344134L;
        jc.ajsf[49] = 7017596394426796295L;
    }

    private static /* synthetic */ int ajsm(int n2) {
        return ajsn[n2] ^ ajso[n2];
    }

    static {
        ajso = new int[124];
        jc.ajzn();
        jc.ajzo();
        jc.ajzp();
        jc.ajzq();
        ajsf = new long[50];
        ajsh = new long[50];
        jc.ajzr();
        jc.ajzs();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float fillFraction() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajvq", ajsb(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jc.ajsi("ajvr", ajsm(int ), (int)48)) break;
            v0 /* !! */  = (long)jc.ajsi("ajvs", ajsm(int ), (int)49);
        }
        var3_1 = jc.c;
        v1 /* !! */  = jc.cb;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(jc.ajsi("ajvu", ajsb(int ), (int)27) - jc.ajsi("ajvt", ajsb(int ), (int)26));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1226813654: {
                    continue block22;
                }
                case 1783697423: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = jc.b;
        v2 /* !! */  = jc.cb;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - jc.ajsi("ajvv", ajsb(int ), (int)28));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1626937426: {
                    v3 = jc.ajsi("ajvw", ajsb(int ), (int)29);
                    continue block23;
                }
                case 648416188: {
                    v3 = jc.ajsi("ajvx", ajsb(int ), (int)30);
                    continue block23;
                }
                case 682863170: {
                    v3 = jc.ajsi("ajvy", ajsb(int ), (int)31);
                    continue block23;
                }
                case 1783697423: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = jc.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (float)jc.ajsi("ajvz", ajtl(int ), (int)50);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = jc.cb;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - jc.ajsi("ajwa", ajsb(int ), (int)32));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -524421842: {
                            v5 = jc.ajsi("ajwb", ajsb(int ), (int)33);
                            continue block25;
                        }
                        case 1682057435: {
                            v5 = jc.ajsi("ajwc", ajsb(int ), (int)34);
                            continue block25;
                        }
                        case 1783697423: {
                            break block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajwd", ajsb(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jc.ajsi("ajwe", ajsm(int ), (int)51)) break;
                    v6 /* !! */  = (long)jc.ajsi("ajwf", ajsm(int ), (int)52);
                }
                return this.fill.getValue() / jc.ajsi("ajwg", ajtl(int ), (int)53);
            }
            case 0: {
                var2_2 /* !! */  = (int)jc.ajsi("ajwh", ajsm(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
            }
lbl68:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)jc.ajsi("ajwi", ajsm(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jc.ajsi("ajwj", ajsm(int ), (int)56);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jc.ajsi("ajwk", ajsm(int ), (int)57);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ajzs() {
        jc.ajsh[0] = -8594995250014364357L;
        jc.ajsh[1] = 8884011323329528660L;
        jc.ajsh[2] = -3283944023577131588L;
        jc.ajsh[3] = -3765268780585481441L;
        jc.ajsh[4] = -5856759547006688208L;
        jc.ajsh[5] = 347318221749558552L;
        jc.ajsh[6] = -591791753098894105L;
        jc.ajsh[7] = -3741937003857023271L;
        jc.ajsh[8] = 4237311529946795768L;
        jc.ajsh[9] = 66284923648397406L;
        jc.ajsh[10] = -1339218790692827323L;
        jc.ajsh[11] = 4325585730848840243L;
        jc.ajsh[12] = -4221684145751401536L;
        jc.ajsh[13] = -2592435538111840597L;
        jc.ajsh[14] = 5783636109706882327L;
        jc.ajsh[15] = 3470841040287924594L;
        jc.ajsh[16] = 1219524286785139624L;
        jc.ajsh[17] = -7383978781753143117L;
        jc.ajsh[18] = -6048760997469303152L;
        jc.ajsh[19] = -7610141202782792946L;
        jc.ajsh[20] = -1164669860738146429L;
        jc.ajsh[21] = -4666232588424508904L;
        jc.ajsh[22] = 3016367318032344767L;
        jc.ajsh[23] = 969725042000203156L;
        jc.ajsh[24] = -4155008394774853809L;
        jc.ajsh[25] = -699098922157385477L;
        jc.ajsh[26] = -4273365791871602840L;
        jc.ajsh[27] = 2096529196097570690L;
        jc.ajsh[28] = -8682242715401398859L;
        jc.ajsh[29] = 5205957413164813492L;
        jc.ajsh[30] = -4339897581121691379L;
        jc.ajsh[31] = -6689597658872699069L;
        jc.ajsh[32] = 5707418112926884690L;
        jc.ajsh[33] = 2336885695159420921L;
        jc.ajsh[34] = -4456770439399634024L;
        jc.ajsh[35] = -7970893243525057293L;
        jc.ajsh[36] = -8497131808878213129L;
        jc.ajsh[37] = 1920047274018712468L;
        jc.ajsh[38] = 6896188621205758319L;
        jc.ajsh[39] = -7959685894167059269L;
        jc.ajsh[40] = 2212974095528175753L;
        jc.ajsh[41] = 4057325091435041526L;
        jc.ajsh[42] = -7273684631207576017L;
        jc.ajsh[43] = 4844258999731961737L;
        jc.ajsh[44] = -4241655641126363086L;
        jc.ajsh[45] = 6371836498247492659L;
        jc.ajsh[46] = 4382391416476941738L;
        jc.ajsh[47] = 4214246455031912982L;
        jc.ajsh[48] = -5944004706656630115L;
        jc.ajsh[49] = 7953754377688186547L;
    }

    private static /* synthetic */ void ajzq() {
        jc.ajso[100] = -1978319551;
        jc.ajso[101] = 1798737693;
        jc.ajso[102] = 1060825688;
        jc.ajso[103] = -1833461337;
        jc.ajso[104] = -1196347468;
        jc.ajso[105] = 1158713413;
        jc.ajso[106] = 2024079407;
        jc.ajso[107] = 1489869841;
        jc.ajso[108] = -343411647;
        jc.ajso[109] = 1886860578;
        jc.ajso[110] = 520168195;
        jc.ajso[111] = -254817535;
        jc.ajso[112] = -1494450946;
        jc.ajso[113] = -1749151174;
        jc.ajso[114] = 1405020440;
        jc.ajso[115] = 1297798002;
        jc.ajso[116] = 1580441183;
        jc.ajso[117] = 8217962;
        jc.ajso[118] = 1287887232;
        jc.ajso[119] = 801778389;
        jc.ajso[120] = 1803004707;
        jc.ajso[121] = 907693557;
        jc.ajso[122] = 1564214427;
        jc.ajso[123] = -2084055223;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPrimaryColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajwl", ajsb(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jc.ajsi("ajwm", ajsm(int ), (int)58)) break;
            v0 /* !! */  = (long)jc.ajsi("ajwn", ajsm(int ), (int)59);
        }
        var3_1 = jc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajwo", ajsb(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jc.ajsi("ajwp", ajsm(int ), (int)60)) break;
            v1 /* !! */  = (long)jc.ajsi("ajwq", ajsm(int ), (int)61);
        }
        var2_2 /* !! */  = jc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jc.cb - jc.ajsi("ajwr", ajsb(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jc.ajsi("ajws", ajsm(int ), (int)62)) break;
            v2 /* !! */  = (long)jc.ajsi("ajwt", ajsm(int ), (int)63);
        }
        var1_3 = jc.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)jc.ajsi("ajwu", ajsm(int ), (int)64);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block9;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jc.cb - jc.ajsi("ajwv", ajsb(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jc.ajsi("ajww", ajsm(int ), (int)65)) break;
                    v3 /* !! */  = (long)jc.ajsi("ajwx", ajsm(int ), (int)66);
                }
                return nd.getClientColorAt(0.0f);
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)jc.ajsi("ajwy", ajsm(int ), (int)67);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)jc.ajsi("ajwz", ajsm(int ), (int)68);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)jc.ajsi("ajxa", ajsm(int ), (int)69);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)jc.ajsi("ajxb", ajsm(int ), (int)70);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ajzn() {
        jc.ajsn[0] = 2144914459;
        jc.ajsn[1] = 1399622947;
        jc.ajsn[2] = 1656407205;
        jc.ajsn[3] = -540880714;
        jc.ajsn[4] = -1693544187;
        jc.ajsn[5] = 1744798277;
        jc.ajsn[6] = 982333516;
        jc.ajsn[7] = -374961334;
        jc.ajsn[8] = -679834762;
        jc.ajsn[9] = 1188059261;
        jc.ajsn[10] = 579970742;
        jc.ajsn[11] = 1722165640;
        jc.ajsn[12] = -707027146;
        jc.ajsn[13] = -2130642690;
        jc.ajsn[14] = 1603623109;
        jc.ajsn[15] = 1956766302;
        jc.ajsn[16] = 295769529;
        jc.ajsn[17] = 745545249;
        jc.ajsn[18] = 1489187089;
        jc.ajsn[19] = 418062831;
        jc.ajsn[20] = 1559764479;
        jc.ajsn[21] = -2088970335;
        jc.ajsn[22] = 838519820;
        jc.ajsn[23] = 1695295456;
        jc.ajsn[24] = -1356323797;
        jc.ajsn[25] = 388947134;
        jc.ajsn[26] = 1062746749;
        jc.ajsn[27] = -1801585523;
        jc.ajsn[28] = -743831235;
        jc.ajsn[29] = 1754233161;
        jc.ajsn[30] = 1640545844;
        jc.ajsn[31] = 1153188087;
        jc.ajsn[32] = -2062507069;
        jc.ajsn[33] = 2074084646;
        jc.ajsn[34] = -518883991;
        jc.ajsn[35] = 634961587;
        jc.ajsn[36] = -146249857;
        jc.ajsn[37] = 775427474;
        jc.ajsn[38] = 2065670574;
        jc.ajsn[39] = -673043003;
        jc.ajsn[40] = 316839577;
        jc.ajsn[41] = 905893058;
        jc.ajsn[42] = -115896622;
        jc.ajsn[43] = 320059299;
        jc.ajsn[44] = 768546425;
        jc.ajsn[45] = -2130266943;
        jc.ajsn[46] = -1403341043;
        jc.ajsn[47] = 419528171;
        jc.ajsn[48] = -782118715;
        jc.ajsn[49] = -1308227277;
        jc.ajsn[50] = -1285051816;
        jc.ajsn[51] = 1101167993;
        jc.ajsn[52] = 909798944;
        jc.ajsn[53] = 2107170106;
        jc.ajsn[54] = -1236579616;
        jc.ajsn[55] = -2098564514;
        jc.ajsn[56] = -21906431;
        jc.ajsn[57] = 183333164;
        jc.ajsn[58] = -1412451175;
        jc.ajsn[59] = 849485016;
        jc.ajsn[60] = 784758891;
        jc.ajsn[61] = 1672841289;
        jc.ajsn[62] = 730836718;
        jc.ajsn[63] = 657898262;
        jc.ajsn[64] = -781550590;
        jc.ajsn[65] = 1642672089;
        jc.ajsn[66] = -1641053968;
        jc.ajsn[67] = -1622146629;
        jc.ajsn[68] = -1733436705;
        jc.ajsn[69] = -1478340154;
        jc.ajsn[70] = -1404760646;
        jc.ajsn[71] = 1982591166;
        jc.ajsn[72] = -2137694520;
        jc.ajsn[73] = 302007409;
        jc.ajsn[74] = -1250838930;
        jc.ajsn[75] = 470549541;
        jc.ajsn[76] = -167716766;
        jc.ajsn[77] = -1712150954;
        jc.ajsn[78] = -809466121;
        jc.ajsn[79] = 354998357;
        jc.ajsn[80] = 450938089;
        jc.ajsn[81] = -1942479747;
        jc.ajsn[82] = 449482713;
        jc.ajsn[83] = -860781395;
        jc.ajsn[84] = 1568970099;
        jc.ajsn[85] = -511250351;
        jc.ajsn[86] = -1394218118;
        jc.ajsn[87] = -1564653675;
        jc.ajsn[88] = 965895888;
        jc.ajsn[89] = -362591769;
        jc.ajsn[90] = 1367136307;
        jc.ajsn[91] = -1588999827;
        jc.ajsn[92] = 179200674;
        jc.ajsn[93] = 1412382914;
        jc.ajsn[94] = -809260237;
        jc.ajsn[95] = -794105270;
        jc.ajsn[96] = -1344428145;
        jc.ajsn[97] = -997414993;
        jc.ajsn[98] = -510008409;
        jc.ajsn[99] = -1943702945;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jc() {
        var2_1 /* !! */  = jc.b;
        var1_2 = jc.a;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Chams", "\u0428\u0435\u0439\u0434\u0435\u0440\u043d\u0430\u044f \u043f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0430 \u043c\u043e\u0434\u0435\u043b\u0435\u0439 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439", du.RENDER);
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0422\u0438\u043f \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f Chams", "\u0428\u0435\u0439\u0434\u0435\u0440", new String[]{"\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "\u0428\u0435\u0439\u0434\u0435\u0440"});
                this.target = new kf("\u0426\u0435\u043b\u044c", "\u041d\u0430 \u043a\u043e\u0433\u043e \u043d\u0430\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u044d\u0444\u0444\u0435\u043a\u0442", "\u0418\u0433\u0440\u043e\u043a\u0438", new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438", "\u041c\u043e\u0431\u044b", "\u0412\u0441\u0435"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isShaderMode(), ()Ljava/lang/Boolean;)((jc)this));
                this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438", 1.0f).range((float)jc.ajsi("ajtm", ajtl(int ), (int)8), (float)jc.ajsi("ajtn", ajtl(int ), (int)9)).step((float)jc.ajsi("ajto", ajtl(int ), (int)10)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isShaderMode(), ()Ljava/lang/Boolean;)((jc)this));
                this.fill = new kg("\u0417\u0430\u043b\u0438\u0432\u043a\u0430", "\u041d\u0430\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u044d\u0444\u0444\u0435\u043a\u0442 \u043f\u0435\u0440\u0435\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0442\u0435\u043a\u0441\u0442\u0443\u0440\u0443", (float)jc.ajsi("ajtp", ajtl(int ), (int)11)).range((int)jc.ajsi("ajtq", ajsm(int ), (int)12), (int)jc.ajsi("ajtr", ajsm(int ), (int)13)).suffix("%").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isShaderMode(), ()Ljava/lang/Boolean;)((jc)this));
                this.throughWalls = new kb("\u0427\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439 \u0437\u0430 \u0441\u0442\u0435\u043d\u0430\u043c\u0438").setValue((boolean)jc.ajsi("ajts", ajsm(int ), (int)14)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isShaderMode(), ()Ljava/lang/Boolean;)((jc)this));
                this.onSelf = new kb("\u041d\u0430 \u0441\u0435\u0431\u0435", "\u041d\u0430\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u044d\u0444\u0444\u0435\u043a\u0442 \u043d\u0430 \u0441\u0435\u0431\u044f (\u0432\u0438\u0434 \u043e\u0442 \u0442\u0440\u0435\u0442\u044c\u0435\u0433\u043e \u043b\u0438\u0446\u0430)").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isShaderMode(), ()Ljava/lang/Boolean;)((jc)this));
                jc.instance = this;
                this.settings(new jx[]{this.mode, this.target, this.speed, this.fill, this.throughWalls, this.onSelf});
                return;
            }
lbl16:
            // 4 sources

            case 0: {
                var2_1 /* !! */  = (int)jc.ajsi("ajtt", ajsm(int ), (int)15);
                ** GOTO lbl41
            }
            case 1: {
                var2_1 /* !! */  = (int)jc.ajsi("ajtu", ajsm(int ), (int)16);
                ** GOTO lbl16
            }
            case 2: {
                var2_1 /* !! */  = (int)jc.ajsi("ajtv", ajsm(int ), (int)17);
                break;
            }
lbl25:
            // 3 sources

            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)jc.ajsi("ajtw", ajsm(int ), (int)18);
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)jc.ajsi("ajtx", ajsm(int ), (int)19);
                ** GOTO lbl16
            }
lbl32:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)jc.ajsi("ajty", ajsm(int ), (int)20);
                break;
            }
            case 6: {
                var2_1 /* !! */  = (int)jc.ajsi("ajtz", ajsm(int ), (int)21);
                ** GOTO lbl25
            }
            case 7: {
                var2_1 /* !! */  = (int)jc.ajsi("ajua", ajsm(int ), (int)22);
                ** GOTO lbl16
            }
lbl41:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)jc.ajsi("ajub", ajsm(int ), (int)23);
                ** GOTO lbl32
            }
            case 9: {
                var2_1 /* !! */  = (int)jc.ajsi("ajuc", ajsm(int ), (int)24);
                ** GOTO lbl25
            }
            case 10: 
        }
        while (true) {
            var2_1 /* !! */  = (int)jc.ajsi("ajud", ajsm(int ), (int)25);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldApply(class_10042 var1_1) {
        block78: {
            block77: {
                block73: {
                    block76: {
                        block74: {
                            block75: {
                                var5_2 = jc.c;
                                var4_3 /* !! */  = jc.b;
                                var3_4 = jc.a;
                                if (var5_2) {
                                    throw null;
lbl6:
                                    // 20 sources

                                    return (boolean)jc.ajsi("ajxw", ajsm(int ), (int)81);
                                }
                                if (var3_4 || var3_4) ** GOTO lbl6
                                var2_5 = var1_1 instanceof class_10055;
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (!this.isNormalMode()) break block73;
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (!var2_5) break block74;
                                if (var3_4) ** GOTO lbl6
                                if (jc.mc.field_1724 == null) break block75;
                                if (var3_4) ** GOTO lbl6
                                if (((class_10055)var1_1).field_53528 == jc.mc.field_1724.method_5628()) break block74;
                                if (var3_4) ** GOTO lbl6
                            }
                            if (var3_4 || var3_4) ** GOTO lbl6
                            v0 = jc.ajsi("ajxx", ajsm(int ), (int)82);
                            if (var5_2) {
                                throw null;
                            }
                            break block76;
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        v0 = jc.ajsi("ajxy", ajsm(int ), (int)83);
                    }
                    return (boolean)v0;
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                if (!var2_5) break block77;
                if (var3_4) ** GOTO lbl6
                if (this.onSelf.isValue()) break block77;
                if (var3_4) ** GOTO lbl6
                if (jc.mc.field_1724 == null) break block77;
                if (var3_4) ** GOTO lbl6
                if (((class_10055)var1_1).field_53528 != jc.mc.field_1724.method_5628()) break block77;
                if (var3_4 || var3_4) ** GOTO lbl6
                return (boolean)jc.ajsi("ajxz", ajsm(int ), (int)84);
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            if (!this.target.isSelected("\u0418\u0433\u0440\u043e\u043a\u0438")) break block78;
            if (var3_4) ** GOTO lbl6
            return var2_5;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        if (!this.target.isSelected("\u041c\u043e\u0431\u044b")) ** GOTO lbl62
        if (var3_4) ** GOTO lbl6
        if (var2_5) ** GOTO lbl59
        if (var3_4) ** GOTO lbl6
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v1 = jc.ajsi("ajya", ajsm(int ), (int)85);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl61
            }
lbl59:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            v1 = jc.ajsi("ajyb", ajsm(int ), (int)86);
lbl61:
            // 2 sources

            return (boolean)v1;
lbl62:
            // 1 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return (boolean)jc.ajsi("ajyc", ajsm(int ), (int)87);
            case 0: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyd", ajsm(int ), (int)88);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 1: {
                var4_3 /* !! */  = (int)jc.ajsi("ajye", ajsm(int ), (int)89);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 2: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyf", ajsm(int ), (int)90);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl80:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyg", ajsm(int ), (int)91);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl85:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyh", ajsm(int ), (int)92);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl90:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyi", ajsm(int ), (int)93);
                if (!var5_2) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyj", ajsm(int ), (int)94);
                if (var5_2) {
                    throw null;
                }
            }
lbl98:
            // 4 sources

            case 7: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyk", ajsm(int ), (int)95);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl103:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyl", ajsm(int ), (int)96);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl108:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)jc.ajsi("ajym", ajsm(int ), (int)97);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl113:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyn", ajsm(int ), (int)98);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyo", ajsm(int ), (int)99);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 12: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyp", ajsm(int ), (int)100);
                if (!var5_2) ** GOTO lbl94
                throw null;
            }
lbl126:
            // 3 sources

            case 13: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyq", ajsm(int ), (int)101);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl131:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyr", ajsm(int ), (int)102);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 15: {
                var4_3 /* !! */  = (int)jc.ajsi("ajys", ajsm(int ), (int)103);
                if (!var5_2) ** GOTO lbl103
                throw null;
            }
lbl140:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyt", ajsm(int ), (int)104);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl145:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyu", ajsm(int ), (int)105);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)jc.ajsi("ajyv", ajsm(int ), (int)106);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                    break;
                }
            }
lbl155:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyw", ajsm(int ), (int)107);
                if (!var5_2) ** GOTO lbl108
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyx", ajsm(int ), (int)108);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl164:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyy", ajsm(int ), (int)109);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
lbl168:
            // 2 sources

            case 22: {
                var4_3 /* !! */  = (int)jc.ajsi("ajyz", ajsm(int ), (int)110);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl173:
            // 2 sources

            case 23: {
                var4_3 /* !! */  = (int)jc.ajsi("ajza", ajsm(int ), (int)111);
                if (!var5_2) ** GOTO lbl113
                throw null;
            }
lbl177:
            // 4 sources

            case 24: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzb", ajsm(int ), (int)112);
                if (!var5_2) ** GOTO lbl94
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzc", ajsm(int ), (int)113);
                if (!var5_2) ** GOTO lbl164
                throw null;
            }
            case 26: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzd", ajsm(int ), (int)114);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
lbl189:
            // 3 sources

            case 27: {
                var4_3 /* !! */  = (int)jc.ajsi("ajze", ajsm(int ), (int)115);
                if (!var5_2) ** GOTO lbl155
                throw null;
            }
lbl193:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzf", ajsm(int ), (int)116);
                if (!var5_2) ** GOTO lbl113
                throw null;
            }
            case 29: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzg", ajsm(int ), (int)117);
                if (!var5_2) ** GOTO lbl189
                throw null;
            }
lbl201:
            // 2 sources

            case 30: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzh", ajsm(int ), (int)118);
                if (!var5_2) ** GOTO lbl168
                throw null;
            }
lbl205:
            // 2 sources

            case 31: {
                do {
                    var4_3 /* !! */  = (int)jc.ajsi("ajzi", ajsm(int ), (int)119);
                } while (!var5_2);
                throw null;
            }
lbl210:
            // 2 sources

            case 32: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzj", ajsm(int ), (int)120);
                if (!var5_2) ** GOTO lbl126
                throw null;
            }
            case 33: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzk", ajsm(int ), (int)121);
                if (!var5_2) ** GOTO lbl164
                throw null;
            }
            case 34: {
                var4_3 /* !! */  = (int)jc.ajsi("ajzl", ajsm(int ), (int)122);
                if (!var5_2) break;
                throw null;
            }
            case 35: 
        }
        var4_3 /* !! */  = (int)jc.ajsi("ajzm", ajsm(int ), (int)123);
        ** while (!var5_2)
lbl225:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSecondaryColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jc.cb - jc.ajsi("ajxc", ajsb(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jc.ajsi("ajxd", ajsm(int ), (int)71)) break;
            v0 /* !! */  = (long)jc.ajsi("ajxe", ajsm(int ), (int)72);
        }
        var3_1 = jc.c;
        v1 /* !! */  = jc.cb;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - jc.ajsi("ajxf", ajsb(int ), (int)41));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1639094248: {
                    v2 = jc.ajsi("ajxg", ajsb(int ), (int)42);
                    continue block19;
                }
                case -814923981: {
                    v2 = jc.ajsi("ajxh", ajsb(int ), (int)43);
                    continue block19;
                }
                case 350286885: {
                    v2 = jc.ajsi("ajxi", ajsb(int ), (int)44);
                    continue block19;
                }
                case 1783697423: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = jc.b;
        v3 /* !! */  = jc.cb;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - jc.ajsi("ajxj", ajsb(int ), (int)45));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1310038817: {
                    v4 = jc.ajsi("ajxk", ajsb(int ), (int)46);
                    continue block20;
                }
                case -1098240931: {
                    v4 = jc.ajsi("ajxl", ajsb(int ), (int)47);
                    continue block20;
                }
                case -629063271: {
                    v4 = jc.ajsi("ajxm", ajsb(int ), (int)48);
                    continue block20;
                }
                case 1783697423: {
                    break block20;
                }
            }
            break;
        }
        var1_3 = jc.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (int)jc.ajsi("ajxn", ajsm(int ), (int)73);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 = jc.ajsi("ajxo", ajtl(int ), (int)74);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = jc.cb - jc.ajsi("ajxp", ajsb(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jc.ajsi("ajxq", ajsm(int ), (int)75)) break;
                    v6 /* !! */  = (long)jc.ajsi("ajxr", ajsm(int ), (int)76);
                }
                return nd.getClientColorAt((float)v5);
            }
lbl58:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jc.ajsi("ajxs", ajsm(int ), (int)77);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jc.ajsi("ajxt", ajsm(int ), (int)78);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jc.ajsi("ajxu", ajsm(int ), (int)79);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jc.ajsi("ajxv", ajsm(int ), (int)80);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }
}

