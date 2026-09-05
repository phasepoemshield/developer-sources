/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.nm;
import ruhack.phobia.ot;

public class ov {
    public static final boolean a;
    private float pitch;
    public static ov DEFAULT;
    private static long[] kjsp;
    private static int[] kjsv;
    public static final int b;
    private static long[] kjso;
    private float yaw;
    private static int[] kjsw;
    static final long sl = 8985591253845667503L;
    public static final boolean c;

    private static /* synthetic */ int kjsu(int n2) {
        return kjsv[n2] ^ kjsw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov addPitch(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjzy", kjsn(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ov.kjsq("kjzz", kjsu(int ), (int)93)) break;
            v0 /* !! */  = (long)ov.kjsq("kkaa", kjsu(int ), (int)94);
        }
        var4_2 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kkab", kjsn(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ov.kjsq("kkac", kjsu(int ), (int)95)) break;
            v1 /* !! */  = (long)ov.kjsq("kkad", kjsu(int ), (int)96);
        }
        var3_3 = ov.b;
        v2 /* !! */  = ov.sl;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ov.kjsq("kkae", kjsn(int ), (int)94));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -902843429: {
                    v3 = ov.kjsq("kkaf", kjsn(int ), (int)95);
                    continue block23;
                }
                case 65695593: {
                    v3 = ov.kjsq("kkag", kjsn(int ), (int)96);
                    continue block23;
                }
                case 1045687983: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = ov.sl;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - ov.kjsq("kkah", kjsn(int ), (int)97));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1829787596: {
                    v5 = ov.kjsq("kkai", kjsn(int ), (int)98);
                    continue block25;
                }
                case 316949518: {
                    v5 = ov.kjsq("kkaj", kjsn(int ), (int)99);
                    continue block25;
                }
                case 1045687983: {
                    break block25;
                }
                case 1638619629: {
                    v5 = ov.kjsq("kkak", kjsn(int ), (int)100);
                    continue block25;
                }
            }
            break;
        }
        v6 = ov.kjsq("kkal", kjuh(int ), (int)97);
        v7 = ov.kjsq("kkam", kjuh(int ), (int)98);
        v8 /* !! */  = ov.sl;
        if (true) ** GOTO lbl56
        block26: while (true) {
            v8 /* !! */  = (long)(ov.kjsq("kkao", kjsn(int ), (int)102) - ov.kjsq("kkan", kjsn(int ), (int)101));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1045687983: {
                    break block26;
                }
                case 1097414564: {
                    continue block26;
                }
            }
            break;
        }
        v9 = class_3532.method_15363((float)(this.pitch + var1_1), (float)v6, (float)v7);
        v10 /* !! */  = ov.sl;
        if (true) ** GOTO lbl66
        block27: while (true) {
            v10 /* !! */  = (long)(v11 - ov.kjsq("kkap", kjsn(int ), (int)103));
lbl66:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1996692532: {
                    v11 = ov.kjsq("kkaq", kjsn(int ), (int)104);
                    continue block27;
                }
                case 522014380: {
                    v11 = ov.kjsq("kkar", kjsn(int ), (int)105);
                    continue block27;
                }
                case 653157981: {
                    v11 = ov.kjsq("kkas", kjsn(int ), (int)106);
                    continue block27;
                }
                case 1045687983: {
                    break block27;
                }
            }
            break;
        }
        this.pitch = v9;
        ** while (var2_4 || var2_4)
lbl80:
        // 1 sources

        return this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov addYaw(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjyz", kjsn(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ov.kjsq("kjza", kjsu(int ), (int)83)) break;
            v0 /* !! */  = (long)ov.kjsq("kjzb", kjsu(int ), (int)84);
        }
        var4_2 = ov.c;
        v1 /* !! */  = ov.sl;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ov.kjsq("kjzc", kjsn(int ), (int)78));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1120746028: {
                    v2 = ov.kjsq("kjzd", kjsn(int ), (int)79);
                    continue block21;
                }
                case 1045687983: {
                    break block21;
                }
                case 1397803169: {
                    v2 = ov.kjsq("kjze", kjsn(int ), (int)80);
                    continue block21;
                }
            }
            break;
        }
        var3_3 = ov.b;
        v3 /* !! */  = ov.sl;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - ov.kjsq("kjzf", kjsn(int ), (int)81));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -973248324: {
                    v4 = ov.kjsq("kjzg", kjsn(int ), (int)82);
                    continue block22;
                }
                case -90874210: {
                    v4 = ov.kjsq("kjzh", kjsn(int ), (int)83);
                    continue block22;
                }
                case 1045687983: {
                    break block22;
                }
                case 1843954030: {
                    v4 = ov.kjsq("kjzi", kjsn(int ), (int)84);
                    continue block22;
                }
            }
            break;
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kjzj", kjsn(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ov.kjsq("kjzk", kjsu(int ), (int)85)) break;
            v5 /* !! */  = (long)ov.kjsq("kjzl", kjsu(int ), (int)86);
        }
        v6 /* !! */  = ov.sl;
        if (true) ** GOTO lbl54
        block25: while (true) {
            v6 /* !! */  = (long)(v7 - ov.kjsq("kjzm", kjsn(int ), (int)86));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 85524350: {
                    v7 = ov.kjsq("kjzn", kjsn(int ), (int)87);
                    continue block25;
                }
                case 1045687983: {
                    break block25;
                }
                case 1590589384: {
                    v7 = ov.kjsq("kjzo", kjsn(int ), (int)88);
                    continue block25;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kjzp", kjsn(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ov.kjsq("kjzq", kjsu(int ), (int)87)) break;
            v8 /* !! */  = (long)ov.kjsq("kjzr", kjsu(int ), (int)88);
        }
        v9 /* !! */  = ov.sl;
        if (true) ** GOTO lbl73
        block27: while (true) {
            v9 /* !! */  = (long)(ov.kjsq("kjzt", kjsn(int ), (int)91) - ov.kjsq("kjzs", kjsn(int ), (int)90));
lbl73:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1260265163: {
                    continue block27;
                }
                case 1045687983: {
                    break block27;
                }
            }
            break;
        }
        return new ov(this.yaw + var1_1, this.pitch);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setYaw(float var1_1) {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kkdd", kjsn(int ), (int)137) - ov.kjsq("kkdc", kjsn(int ), (int)136));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 364211960: {
                    continue block21;
                }
                case 1045687983: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkde", kjsn(int ), (int)138)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ov.kjsq("kkdf", kjsu(int ), (int)131)) break;
            v1 /* !! */  = (long)ov.kjsq("kkdg", kjsu(int ), (int)132);
        }
        var3_3 /* !! */  = ov.b;
        v2 /* !! */  = ov.sl;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(ov.kjsq("kkdi", kjsn(int ), (int)140) - ov.kjsq("kkdh", kjsn(int ), (int)139));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 338950735: {
                    continue block23;
                }
                case 1045687983: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
lbl30:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl30
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl30
                v3 /* !! */  = ov.sl;
                if (true) ** GOTO lbl41
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - ov.kjsq("kkdj", kjsn(int ), (int)141));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -908275253: {
                            v4 = ov.kjsq("kkdk", kjsn(int ), (int)142);
                            continue block25;
                        }
                        case 964399239: {
                            v4 = ov.kjsq("kkdl", kjsn(int ), (int)143);
                            continue block25;
                        }
                        case 1045687983: {
                            break block25;
                        }
                        case 2138253885: {
                            v4 = ov.kjsq("kkdm", kjsn(int ), (int)144);
                            continue block25;
                        }
                    }
                    break;
                }
                this.yaw = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ov.kjsq("kkdn", kjsu(int ), (int)133);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ov.kjsq("kkdo", kjsu(int ), (int)134);
                if (!var4_2) ** GOTO lbl56
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ov.kjsq("kkdp", kjsu(int ), (int)135);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ov.kjsq("kkdq", kjsu(int ), (int)136);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)ov.kjsq("kkdr", kjsu(int ), (int)137);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void kkfk() {
        ov.kjsw[0] = -699670506;
        ov.kjsw[1] = 1467457151;
        ov.kjsw[2] = -1163247763;
        ov.kjsw[3] = -1948516762;
        ov.kjsw[4] = -1341957418;
        ov.kjsw[5] = 1392126006;
        ov.kjsw[6] = -855240194;
        ov.kjsw[7] = 1475140919;
        ov.kjsw[8] = 427519354;
        ov.kjsw[9] = 1535096050;
        ov.kjsw[10] = -1046525564;
        ov.kjsw[11] = 1967835361;
        ov.kjsw[12] = 1596635846;
        ov.kjsw[13] = 1353072870;
        ov.kjsw[14] = -803308093;
        ov.kjsw[15] = 1286466379;
        ov.kjsw[16] = 419204403;
        ov.kjsw[17] = -1011424117;
        ov.kjsw[18] = 1704654057;
        ov.kjsw[19] = 417517321;
        ov.kjsw[20] = -2048787677;
        ov.kjsw[21] = -1977708068;
        ov.kjsw[22] = -719135243;
        ov.kjsw[23] = -9758678;
        ov.kjsw[24] = -244039230;
        ov.kjsw[25] = 1462955396;
        ov.kjsw[26] = 45059255;
        ov.kjsw[27] = 503944408;
        ov.kjsw[28] = -874310572;
        ov.kjsw[29] = 1282920188;
        ov.kjsw[30] = 369332125;
        ov.kjsw[31] = -1583452422;
        ov.kjsw[32] = 1774178463;
        ov.kjsw[33] = 760542654;
        ov.kjsw[34] = -961457285;
        ov.kjsw[35] = 16477528;
        ov.kjsw[36] = -1034753404;
        ov.kjsw[37] = -1138247491;
        ov.kjsw[38] = 1903544100;
        ov.kjsw[39] = 61289690;
        ov.kjsw[40] = -1505875468;
        ov.kjsw[41] = 1996836148;
        ov.kjsw[42] = -1559317672;
        ov.kjsw[43] = 1705663502;
        ov.kjsw[44] = -1944291361;
        ov.kjsw[45] = 1482762814;
        ov.kjsw[46] = 686713944;
        ov.kjsw[47] = -1550103913;
        ov.kjsw[48] = 1805995396;
        ov.kjsw[49] = 660004748;
        ov.kjsw[50] = 486757862;
        ov.kjsw[51] = -515012042;
        ov.kjsw[52] = 42792983;
        ov.kjsw[53] = 136802696;
        ov.kjsw[54] = -1065405743;
        ov.kjsw[55] = 797406235;
        ov.kjsw[56] = 1693595186;
        ov.kjsw[57] = -474092372;
        ov.kjsw[58] = -1871468343;
        ov.kjsw[59] = -1973552295;
        ov.kjsw[60] = 1863075674;
        ov.kjsw[61] = 1758401226;
        ov.kjsw[62] = 2136686096;
        ov.kjsw[63] = -1145157368;
        ov.kjsw[64] = 1377870241;
        ov.kjsw[65] = -681030366;
        ov.kjsw[66] = -2138979366;
        ov.kjsw[67] = -72846256;
        ov.kjsw[68] = -1784120399;
        ov.kjsw[69] = -2035485562;
        ov.kjsw[70] = 2102216625;
        ov.kjsw[71] = -899736034;
        ov.kjsw[72] = 1655786247;
        ov.kjsw[73] = 1206627371;
        ov.kjsw[74] = 763834488;
        ov.kjsw[75] = 1610764275;
        ov.kjsw[76] = 761204136;
        ov.kjsw[77] = 47916581;
        ov.kjsw[78] = 766779183;
        ov.kjsw[79] = 955516557;
        ov.kjsw[80] = -664557955;
        ov.kjsw[81] = -308346955;
        ov.kjsw[82] = -17510279;
        ov.kjsw[83] = 645122499;
        ov.kjsw[84] = 91934604;
        ov.kjsw[85] = 53176530;
        ov.kjsw[86] = 178801647;
        ov.kjsw[87] = -93574555;
        ov.kjsw[88] = -701351892;
        ov.kjsw[89] = 2058962179;
        ov.kjsw[90] = 1935222714;
        ov.kjsw[91] = 2082982727;
        ov.kjsw[92] = 1085103191;
        ov.kjsw[93] = 1987192873;
        ov.kjsw[94] = -828944664;
        ov.kjsw[95] = -1300007225;
        ov.kjsw[96] = -525865609;
        ov.kjsw[97] = -357300096;
        ov.kjsw[98] = -314488829;
        ov.kjsw[99] = 820827830;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getPitch() {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kkco", kjsn(int ), (int)131) - ov.kjsq("kkcn", kjsn(int ), (int)130));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 594626384: {
                    continue block14;
                }
                case 1045687983: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = ov.c;
        v1 /* !! */  = ov.sl;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(ov.kjsq("kkcq", kjsn(int ), (int)133) - ov.kjsq("kkcp", kjsn(int ), (int)132));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1045687983: {
                    break block15;
                }
                case 1167666415: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ov.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkcr", kjsn(int ), (int)134)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ov.kjsq("kkcs", kjsu(int ), (int)122)) break;
            v2 /* !! */  = (long)ov.kjsq("kkct", kjsu(int ), (int)123);
        }
        var1_3 = ov.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (float)ov.kjsq("kkcu", kjuh(int ), (int)124);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kkcv", kjsn(int ), (int)135)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ov.kjsq("kkcw", kjsu(int ), (int)125)) break;
                    v3 /* !! */  = (long)ov.kjsq("kkcx", kjsu(int ), (int)126);
                }
                return this.pitch;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ov.kjsq("kkcy", kjsu(int ), (int)127);
                    if (!var3_1) break block8;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ov.kjsq("kkcz", kjsu(int ), (int)128);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ov.kjsq("kkda", kjsu(int ), (int)129);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ov.kjsq("kkdb", kjsu(int ), (int)130);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkei", kjsn(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ov.kjsq("kkej", kjsu(int ), (int)145)) break;
            v0 /* !! */  = (long)ov.kjsq("kkek", kjsu(int ), (int)146);
        }
        var3_1 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kkel", kjsn(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ov.kjsq("kkem", kjsu(int ), (int)147)) break;
            v1 /* !! */  = (long)ov.kjsq("kken", kjsu(int ), (int)148);
        }
        var2_2 /* !! */  = ov.b;
        v2 /* !! */  = ov.sl;
        if (true) ** GOTO lbl17
        block18: while (true) {
            v2 /* !! */  = (long)(ov.kjsq("kkep", kjsn(int ), (int)157) - ov.kjsq("kkeo", kjsn(int ), (int)156));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 528269587: {
                    continue block18;
                }
                case 1045687983: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = ov.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ov.sl;
                if (true) ** GOTO lbl35
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - ov.kjsq("kkeq", kjsn(int ), (int)158));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1949986328: {
                            v4 = ov.kjsq("kker", kjsn(int ), (int)159);
                            continue block20;
                        }
                        case -789831939: {
                            v4 = ov.kjsq("kkes", kjsn(int ), (int)160);
                            continue block20;
                        }
                        case 131763100: {
                            v4 = ov.kjsq("kket", kjsn(int ), (int)161);
                            continue block20;
                        }
                        case 1045687983: {
                            break block20;
                        }
                    }
                    break;
                }
                v5 = this.getYaw();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kkeu", kjsn(int ), (int)162)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ov.kjsq("kkev", kjsu(int ), (int)149)) break;
                    v6 /* !! */  = (long)ov.kjsq("kkew", kjsu(int ), (int)150);
                }
                v7 = this.getPitch();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ov.sl - ov.kjsq("kkex", kjsn(int ), (int)163)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ov.kjsq("kkey", kjsu(int ), (int)151)) break;
                    v8 /* !! */  = (long)ov.kjsq("kkez", kjsu(int ), (int)152);
                }
                return "Angle(yaw=" + v5 + ", pitch=" + v7 + ")";
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ov.kjsq("kkfa", kjsu(int ), (int)153);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ov.kjsq("kkfb", kjsu(int ), (int)154);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ov.kjsq("kkfc", kjsu(int ), (int)155);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ov.kjsq("kkfd", kjsu(int ), (int)156);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite kjsq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getYaw() {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kkbz", kjsn(int ), (int)123) - ov.kjsq("kkby", kjsn(int ), (int)122));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1045687983: {
                    break block19;
                }
                case 2048061342: {
                    continue block19;
                }
            }
            break;
        }
        var3_1 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkca", kjsn(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ov.kjsq("kkcb", kjsu(int ), (int)115)) break;
            v1 /* !! */  = (long)ov.kjsq("kkcc", kjsu(int ), (int)116);
        }
        var2_2 /* !! */  = ov.b;
        v2 /* !! */  = ov.sl;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ov.kjsq("kkcd", kjsn(int ), (int)125));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1102491289: {
                    v3 = ov.kjsq("kkce", kjsn(int ), (int)126);
                    continue block21;
                }
                case 1045687983: {
                    break block21;
                }
                case 1931598455: {
                    v3 = ov.kjsq("kkcf", kjsn(int ), (int)127);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = ov.a;
        if (var3_1) {
            throw null;
            return (float)ov.kjsq("kkcg", kjuh(int ), (int)117);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ov.sl;
                if (true) ** GOTO lbl44
                block23: while (true) {
                    v4 /* !! */  = (long)(ov.kjsq("kkci", kjsn(int ), (int)129) - ov.kjsq("kkch", kjsn(int ), (int)128));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1045687983: {
                            break block23;
                        }
                        case 1692527319: {
                            continue block23;
                        }
                    }
                    break;
                }
                return this.yaw;
            }
lbl50:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ov.kjsq("kkcj", kjsu(int ), (int)118);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ov.kjsq("kkck", kjsu(int ), (int)119);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ov.kjsq("kkcl", kjsu(int ), (int)120);
                    if (!var3_1) ** GOTO lbl50
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ov.kjsq("kkcm", kjsu(int ), (int)121);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float kjuh(int n2) {
        return Float.intBitsToFloat(kjsv[n2] ^ kjsw[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final class_243 toVector() {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kjxa", kjsn(int ), (int)54) - ov.kjsq("kjwz", kjsn(int ), (int)53));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 764053050: {
                    continue block49;
                }
                case 1045687983: {
                    break block49;
                }
            }
            break;
        }
        var9_1 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjxb", kjsn(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ov.kjsq("kjxc", kjsu(int ), (int)55)) break;
            v1 /* !! */  = (long)ov.kjsq("kjxd", kjsu(int ), (int)56);
        }
        var8_2 /* !! */  = ov.b;
        v2 /* !! */  = ov.sl;
        if (true) ** GOTO lbl22
        block51: while (true) {
            v2 /* !! */  = (long)(v3 - ov.kjsq("kjxe", kjsn(int ), (int)56));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1405032557: {
                    v3 = ov.kjsq("kjxf", kjsn(int ), (int)57);
                    continue block51;
                }
                case 795652858: {
                    v3 = ov.kjsq("kjxg", kjsn(int ), (int)58);
                    continue block51;
                }
                case 848059593: {
                    v3 = ov.kjsq("kjxh", kjsn(int ), (int)59);
                    continue block51;
                }
                case 1045687983: {
                    break block51;
                }
            }
            break;
        }
        var7_3 = ov.a;
        if (var9_1) {
            throw null;
lbl37:
            // 7 sources

            return null;
        }
        if (var7_3 || var7_3) ** GOTO lbl37
        v4 /* !! */  = ov.sl;
        if (true) ** GOTO lbl44
        block53: while (true) {
            v4 /* !! */  = (long)(v5 - ov.kjsq("kjxi", kjsn(int ), (int)60));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1531719196: {
                    v5 = ov.kjsq("kjxj", kjsn(int ), (int)61);
                    continue block53;
                }
                case 1045687983: {
                    break block53;
                }
                case 1833841519: {
                    v5 = ov.kjsq("kjxk", kjsn(int ), (int)62);
                    continue block53;
                }
            }
            break;
        }
        var1_4 = this.pitch * ov.kjsq("kjxl", kjuh(int ), (int)57);
        if (var7_3 || var7_3) ** GOTO lbl37
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kjxm", kjsn(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ov.kjsq("kjxn", kjsu(int ), (int)58)) break;
            v6 /* !! */  = (long)ov.kjsq("kjxo", kjsu(int ), (int)59);
        }
        var2_5 = -this.yaw * ov.kjsq("kjxp", kjuh(int ), (int)60);
        if (var7_3 || var7_3) ** GOTO lbl37
        v7 = var2_5;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kjxq", kjsn(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ov.kjsq("kjxr", kjsu(int ), (int)61)) break;
            v8 /* !! */  = (long)ov.kjsq("kjxs", kjsu(int ), (int)62);
        }
        var3_6 = class_3532.method_15362((double)v7);
        if (var7_3 || var7_3) ** GOTO lbl37
        v9 = var2_5;
        v10 /* !! */  = ov.sl;
        if (true) ** GOTO lbl77
        block56: while (true) {
            v10 /* !! */  = (long)(v11 - ov.kjsq("kjxt", kjsn(int ), (int)65));
lbl77:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -314985552: {
                    v11 = ov.kjsq("kjxu", kjsn(int ), (int)66);
                    continue block56;
                }
                case 1026677515: {
                    v11 = ov.kjsq("kjxv", kjsn(int ), (int)67);
                    continue block56;
                }
                case 1045687983: {
                    break block56;
                }
                case 1406461256: {
                    v11 = ov.kjsq("kjxw", kjsn(int ), (int)68);
                    continue block56;
                }
            }
            break;
        }
        var4_7 = class_3532.method_15374((double)v9);
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3 || var7_3) ** GOTO lbl37
                v12 = var1_4;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ov.sl - ov.kjsq("kjxx", kjsn(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ov.kjsq("kjxy", kjsu(int ), (int)63)) break;
                    v13 /* !! */  = (long)ov.kjsq("kjxz", kjsu(int ), (int)64);
                }
                var5_8 = class_3532.method_15362((double)v12);
                if (var7_3 || var7_3) ** GOTO lbl37
                v14 = var1_4;
                v15 /* !! */  = ov.sl;
                if (true) ** GOTO lbl108
                block58: while (true) {
                    v15 /* !! */  = (long)(ov.kjsq("kjyb", kjsn(int ), (int)71) - ov.kjsq("kjya", kjsn(int ), (int)70));
lbl108:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 713698986: {
                            continue block58;
                        }
                        case 1045687983: {
                            break block58;
                        }
                    }
                    break;
                }
                var6_9 = class_3532.method_15374((double)v14);
                if (var7_3 || var7_3) ** continue;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = ov.sl - ov.kjsq("kjyc", kjsn(int ), (int)72)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v16 /* !! */  == ov.kjsq("kjyd", kjsu(int ), (int)65)) break;
                    v16 /* !! */  = (long)ov.kjsq("kjye", kjsu(int ), (int)66);
                }
                v17 = var4_7 * var5_8;
                v18 = -var6_9;
                v19 = var3_6 * var5_8;
                v20 /* !! */  = ov.sl;
                if (true) ** GOTO lbl128
                block60: while (true) {
                    v20 /* !! */  = (long)(v21 - ov.kjsq("kjyf", kjsn(int ), (int)73));
lbl128:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1442221632: {
                            v21 = ov.kjsq("kjyg", kjsn(int ), (int)74);
                            continue block60;
                        }
                        case 1045687983: {
                            break block60;
                        }
                        case 1242883710: {
                            v21 = ov.kjsq("kjyh", kjsn(int ), (int)75);
                            continue block60;
                        }
                        case 1760126221: {
                            v21 = ov.kjsq("kjyi", kjsn(int ), (int)76);
                            continue block60;
                        }
                    }
                    break;
                }
                return new class_243(v17, v18, v19);
            }
            case 0: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyj", kjsu(int ), (int)67);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl146:
            // 2 sources

            case 1: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyk", kjsu(int ), (int)68);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl151:
            // 2 sources

            case 2: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyl", kjsu(int ), (int)69);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl156:
            // 2 sources

            case 3: {
                var8_2 /* !! */  = (int)ov.kjsq("kjym", kjsu(int ), (int)70);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl161:
            // 4 sources

            case 4: {
                do {
                    var8_2 /* !! */  = (int)ov.kjsq("kjyn", kjsu(int ), (int)71);
                } while (!var9_1);
                throw null;
            }
            case 5: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyo", kjsu(int ), (int)72);
                if (!var9_1) ** GOTO lbl161
                throw null;
            }
lbl170:
            // 2 sources

            case 6: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyp", kjsu(int ), (int)73);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 7: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyq", kjsu(int ), (int)74);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl180:
            // 3 sources

            case 8: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyr", kjsu(int ), (int)75);
                if (!var9_1) ** GOTO lbl146
                throw null;
            }
lbl184:
            // 2 sources

            case 9: {
                var8_2 /* !! */  = (int)ov.kjsq("kjys", kjsu(int ), (int)76);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)ov.kjsq("kjyt", kjsu(int ), (int)77);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl203
                    break;
                }
            }
            case 11: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyu", kjsu(int ), (int)78);
                if (!var9_1) ** GOTO lbl170
                throw null;
            }
            case 12: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyv", kjsu(int ), (int)79);
                if (!var9_1) ** GOTO lbl184
                throw null;
            }
lbl203:
            // 3 sources

            case 13: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyw", kjsu(int ), (int)80);
                if (!var9_1) ** GOTO lbl161
                throw null;
            }
lbl207:
            // 3 sources

            case 14: {
                var8_2 /* !! */  = (int)ov.kjsq("kjyx", kjsu(int ), (int)81);
                if (!var9_1) ** GOTO lbl151
                throw null;
            }
            case 15: 
        }
        var8_2 /* !! */  = (int)ov.kjsq("kjyy", kjsu(int ), (int)82);
        ** while (!var9_1)
lbl214:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float adjustAxis(float var1_1, float var2_2, double var3_3) {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ov.kjsq("kjwh", kjsn(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 582792148: {
                    v1 = ov.kjsq("kjwi", kjsn(int ), (int)47);
                    continue block17;
                }
                case 1045687983: {
                    break block17;
                }
                case 1297911357: {
                    v1 = ov.kjsq("kjwj", kjsn(int ), (int)48);
                    continue block17;
                }
            }
            break;
        }
        var8_4 = ov.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjwk", kjsn(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ov.kjsq("kjwl", kjsu(int ), (int)44)) break;
            v2 /* !! */  = (long)ov.kjsq("kjwm", kjsu(int ), (int)45);
        }
        var7_5 /* !! */  = ov.b;
        v3 /* !! */  = ov.sl;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(ov.kjsq("kjwo", kjsn(int ), (int)51) - ov.kjsq("kjwn", kjsn(int ), (int)50));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1048629299: {
                    continue block19;
                }
                case 1045687983: {
                    break block19;
                }
            }
            break;
        }
        var6_6 = ov.a;
        if (var8_4) {
            throw null;
lbl34:
            // 2 sources

            return (float)ov.kjsq("kjwp", kjuh(int ), (int)46);
        }
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_6 || var6_6) ** GOTO lbl34
                var5_7 = var1_1 - var2_2;
                if (var6_6 || var6_6) ** continue;
                v4 = (double)var5_7 / var3_3;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kjwq", kjsn(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ov.kjsq("kjwr", kjsu(int ), (int)47)) break;
                    v5 /* !! */  = (long)ov.kjsq("kjws", kjsu(int ), (int)48);
                }
                return var2_2 + (float)Math.round(v4) * (float)var3_3;
            }
            case 0: {
                var7_5 /* !! */  = (int)ov.kjsq("kjwt", kjsu(int ), (int)49);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl55:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)ov.kjsq("kjwu", kjsu(int ), (int)50);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 2: {
                var7_5 /* !! */  = (int)ov.kjsq("kjwv", kjsu(int ), (int)51);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl66:
            // 3 sources

            case 3: {
                var7_5 /* !! */  = (int)ov.kjsq("kjww", kjsu(int ), (int)52);
                if (!var8_4) ** GOTO lbl55
                throw null;
            }
lbl70:
            // 2 sources

            case 4: {
                var7_5 /* !! */  = (int)ov.kjsq("kjwx", kjsu(int ), (int)53);
                if (!var8_4) break;
                throw null;
            }
            case 5: 
        }
        var7_5 /* !! */  = (int)ov.kjsq("kjwy", kjsu(int ), (int)54);
        ** while (!var8_4)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPitch(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkds", kjsn(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ov.kjsq("kkdt", kjsu(int ), (int)138)) break;
            v0 /* !! */  = (long)ov.kjsq("kkdu", kjsu(int ), (int)139);
        }
        var4_2 = ov.c;
        v1 /* !! */  = ov.sl;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ov.kjsq("kkdv", kjsn(int ), (int)146));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 614138415: {
                    v2 = ov.kjsq("kkdw", kjsn(int ), (int)147);
                    continue block22;
                }
                case 630932669: {
                    v2 = ov.kjsq("kkdx", kjsn(int ), (int)148);
                    continue block22;
                }
                case 1045687983: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = ov.b;
        v3 /* !! */  = ov.sl;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(ov.kjsq("kkdz", kjsn(int ), (int)150) - ov.kjsq("kkdy", kjsn(int ), (int)149));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1045687983: {
                    break block23;
                }
                case 1959312458: {
                    continue block23;
                }
            }
            break;
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ov.sl;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ov.kjsq("kkea", kjsn(int ), (int)151));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1441814833: {
                            v5 = ov.kjsq("kkeb", kjsn(int ), (int)152);
                            continue block25;
                        }
                        case -239235492: {
                            v5 = ov.kjsq("kkec", kjsn(int ), (int)153);
                            continue block25;
                        }
                        case 1045687983: {
                            break block25;
                        }
                    }
                    break;
                }
                this.pitch = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ov.kjsq("kked", kjsu(int ), (int)140);
                if (var4_2) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)ov.kjsq("kkee", kjsu(int ), (int)141);
                if (var4_2) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)ov.kjsq("kkef", kjsu(int ), (int)142);
                if (!var4_2) ** GOTO lbl61
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ov.kjsq("kkeg", kjsu(int ), (int)143);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)ov.kjsq("kkeh", kjsu(int ), (int)144);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void kkfj() {
        ov.kjsv[100] = -1165554378;
        ov.kjsv[101] = 1191769245;
        ov.kjsv[102] = 2006707290;
        ov.kjsv[103] = -2000345289;
        ov.kjsv[104] = -587358384;
        ov.kjsv[105] = -265242310;
        ov.kjsv[106] = 1677655241;
        ov.kjsv[107] = -1698789867;
        ov.kjsv[108] = -1609424708;
        ov.kjsv[109] = -309822964;
        ov.kjsv[110] = -1697208636;
        ov.kjsv[111] = -1129095417;
        ov.kjsv[112] = 585241369;
        ov.kjsv[113] = -1013673732;
        ov.kjsv[114] = -1460073687;
        ov.kjsv[115] = -986499656;
        ov.kjsv[116] = -828305967;
        ov.kjsv[117] = -1691041373;
        ov.kjsv[118] = -1492028449;
        ov.kjsv[119] = -1827823162;
        ov.kjsv[120] = -927060193;
        ov.kjsv[121] = -1962708069;
        ov.kjsv[122] = -338023587;
        ov.kjsv[123] = 1731706683;
        ov.kjsv[124] = 1030009500;
        ov.kjsv[125] = -520921877;
        ov.kjsv[126] = 1443634056;
        ov.kjsv[127] = -714937606;
        ov.kjsv[128] = 1058318104;
        ov.kjsv[129] = 731134279;
        ov.kjsv[130] = 1222189895;
        ov.kjsv[131] = -1440799207;
        ov.kjsv[132] = -1738148609;
        ov.kjsv[133] = -978655997;
        ov.kjsv[134] = -1146371923;
        ov.kjsv[135] = 1362141873;
        ov.kjsv[136] = -1213898280;
        ov.kjsv[137] = -28609741;
        ov.kjsv[138] = 1987479724;
        ov.kjsv[139] = 544550188;
        ov.kjsv[140] = -1914864813;
        ov.kjsv[141] = -1597122351;
        ov.kjsv[142] = -2030983189;
        ov.kjsv[143] = 312421443;
        ov.kjsv[144] = 226502246;
        ov.kjsv[145] = -173104951;
        ov.kjsv[146] = -683917857;
        ov.kjsv[147] = 361399671;
        ov.kjsv[148] = 2001861980;
        ov.kjsv[149] = -1356737971;
        ov.kjsv[150] = 122792110;
        ov.kjsv[151] = 186773634;
        ov.kjsv[152] = 1071280780;
        ov.kjsv[153] = 1266627817;
        ov.kjsv[154] = -2035680777;
        ov.kjsv[155] = 843108450;
        ov.kjsv[156] = 238457437;
        ov.kjsv[157] = 663955605;
        ov.kjsv[158] = -1200451402;
        ov.kjsv[159] = -1717556640;
        ov.kjsv[160] = 2079572698;
    }

    private static /* synthetic */ void kkfn() {
        ov.kjso[100] = -1316020060126406914L;
        ov.kjso[101] = 2854165663896866125L;
        ov.kjso[102] = 3846093714376466864L;
        ov.kjso[103] = -823816935929977455L;
        ov.kjso[104] = 4344091147772994914L;
        ov.kjso[105] = -1220487482719163150L;
        ov.kjso[106] = 1888619538562714555L;
        ov.kjso[107] = -279652545869428152L;
        ov.kjso[108] = 40521156766325503L;
        ov.kjso[109] = -4916039249039818274L;
        ov.kjso[110] = 5439385268207117310L;
        ov.kjso[111] = 6418308666270912015L;
        ov.kjso[112] = -1020667957027731663L;
        ov.kjso[113] = 3966905340705940368L;
        ov.kjso[114] = 7730652748234330668L;
        ov.kjso[115] = -1150615685597214162L;
        ov.kjso[116] = -9159127933731426299L;
        ov.kjso[117] = 9190659964145918716L;
        ov.kjso[118] = 4948104293888578327L;
        ov.kjso[119] = 6056672723814252441L;
        ov.kjso[120] = 1115831785624475192L;
        ov.kjso[121] = -7482593712062942544L;
        ov.kjso[122] = 912083837894714306L;
        ov.kjso[123] = 1558990060606326017L;
        ov.kjso[124] = 7146124672282471877L;
        ov.kjso[125] = 5358601067184260751L;
        ov.kjso[126] = 8328856390635752043L;
        ov.kjso[127] = 5368280738303123001L;
        ov.kjso[128] = -8620665036706084972L;
        ov.kjso[129] = 1964667779872735926L;
        ov.kjso[130] = -1565908447004293580L;
        ov.kjso[131] = 1642316734510780320L;
        ov.kjso[132] = -538575052695032312L;
        ov.kjso[133] = -4649443734696090606L;
        ov.kjso[134] = -8019194383055816620L;
        ov.kjso[135] = 999296378645740028L;
        ov.kjso[136] = -2991977141330725207L;
        ov.kjso[137] = -8711884202136928936L;
        ov.kjso[138] = 9046551960456177602L;
        ov.kjso[139] = -4479935375117182354L;
        ov.kjso[140] = -335259909700876412L;
        ov.kjso[141] = 1139267016840791898L;
        ov.kjso[142] = 8922946811771138469L;
        ov.kjso[143] = 1365333774343448350L;
        ov.kjso[144] = 7971118279036998107L;
        ov.kjso[145] = 5039277360912612073L;
        ov.kjso[146] = 5256642690829343661L;
        ov.kjso[147] = 6926623183729933885L;
        ov.kjso[148] = -8913570122971360128L;
        ov.kjso[149] = 8798124618433592146L;
        ov.kjso[150] = -8546353557060502458L;
        ov.kjso[151] = 7780394192607138477L;
        ov.kjso[152] = 655757854778856606L;
        ov.kjso[153] = 8331043727076880263L;
        ov.kjso[154] = -60699051025356507L;
        ov.kjso[155] = 3349670345330338800L;
        ov.kjso[156] = 6416642214303495179L;
        ov.kjso[157] = -6770534563614253633L;
        ov.kjso[158] = -1064139227962272539L;
        ov.kjso[159] = 1516192225291593604L;
        ov.kjso[160] = -8482823825400336258L;
        ov.kjso[161] = 1302011724925593090L;
        ov.kjso[162] = 5566333437208665536L;
        ov.kjso[163] = 5780299404121499493L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov random(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjvc", kjsn(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ov.kjsq("kjvd", kjsu(int ), (int)26)) break;
            v0 /* !! */  = (long)ov.kjsq("kjve", kjsu(int ), (int)27);
        }
        var4_2 = ov.c;
        v1 /* !! */  = ov.sl;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ov.kjsq("kjvf", kjsn(int ), (int)34));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -204280412: {
                    v2 = ov.kjsq("kjvg", kjsn(int ), (int)35);
                    continue block17;
                }
                case 262412198: {
                    v2 = ov.kjsq("kjvh", kjsn(int ), (int)36);
                    continue block17;
                }
                case 876605410: {
                    v2 = ov.kjsq("kjvi", kjsn(int ), (int)37);
                    continue block17;
                }
                case 1045687983: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = ov.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kjvj", kjsn(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ov.kjsq("kjvk", kjsu(int ), (int)28)) break;
            v3 /* !! */  = (long)ov.kjsq("kjvl", kjsu(int ), (int)29);
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kjvm", kjsn(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ov.kjsq("kjvn", kjsu(int ), (int)30)) break;
                    v4 /* !! */  = (long)ov.kjsq("kjvo", kjsu(int ), (int)31);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ov.sl - ov.kjsq("kjvp", kjsn(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ov.kjsq("kjvq", kjsu(int ), (int)32)) break;
                    v5 /* !! */  = (long)ov.kjsq("kjvr", kjsu(int ), (int)33);
                }
                v6 = -var1_1;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ov.sl - ov.kjsq("kjvs", kjsn(int ), (int)41)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ov.kjsq("kjvt", kjsu(int ), (int)34)) break;
                    v7 /* !! */  = (long)ov.kjsq("kjvu", kjsu(int ), (int)35);
                }
                v8 = this.yaw + nm.getRandom(v6, var1_1);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = ov.sl - ov.kjsq("kjvv", kjsn(int ), (int)42)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ov.kjsq("kjvw", kjsu(int ), (int)36)) break;
                    v9 /* !! */  = (long)ov.kjsq("kjvx", kjsu(int ), (int)37);
                }
                v10 = -var1_1;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = ov.sl - ov.kjsq("kjvy", kjsn(int ), (int)43)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ov.kjsq("kjvz", kjsu(int ), (int)38)) break;
                    v11 /* !! */  = (long)ov.kjsq("kjwa", kjsu(int ), (int)39);
                }
                v12 = this.pitch + nm.getRandom(v10, var1_1);
                v13 /* !! */  = ov.sl;
                if (true) ** GOTO lbl79
                block25: while (true) {
                    v13 /* !! */  = (long)(ov.kjsq("kjwc", kjsn(int ), (int)45) - ov.kjsq("kjwb", kjsn(int ), (int)44));
lbl79:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -90925072: {
                            continue block25;
                        }
                        case 1045687983: {
                            break block25;
                        }
                    }
                    break;
                }
                return new ov(v8, v12);
            }
lbl85:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ov.kjsq("kjwd", kjsu(int ), (int)40);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 1: {
                var3_3 /* !! */  = (int)ov.kjsq("kjwe", kjsu(int ), (int)41);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ov.kjsq("kjwf", kjsu(int ), (int)42);
                    if (!var4_2) ** GOTO lbl85
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ov.kjsq("kjwg", kjsu(int ), (int)43);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkfp() {
        ov.kjsp[100] = -5193340669333204341L;
        ov.kjsp[101] = 2316532219235021909L;
        ov.kjsp[102] = -1427020320240859534L;
        ov.kjsp[103] = 7736253748123658435L;
        ov.kjsp[104] = 3538770184840819795L;
        ov.kjsp[105] = -7115847329378839036L;
        ov.kjsp[106] = -4164041691841216470L;
        ov.kjsp[107] = 3213845756658305192L;
        ov.kjsp[108] = 7802214146557549636L;
        ov.kjsp[109] = -8010825165365362697L;
        ov.kjsp[110] = 2866544190887419997L;
        ov.kjsp[111] = -6828935167701500328L;
        ov.kjsp[112] = 782296106279654381L;
        ov.kjsp[113] = -1269824415347264697L;
        ov.kjsp[114] = 610370252669776941L;
        ov.kjsp[115] = 567879423982478424L;
        ov.kjsp[116] = -2765070543341468884L;
        ov.kjsp[117] = -1346299891658850788L;
        ov.kjsp[118] = 2809914637659683279L;
        ov.kjsp[119] = -4233204749179708269L;
        ov.kjsp[120] = 4160457895843122588L;
        ov.kjsp[121] = 9024173125647867330L;
        ov.kjsp[122] = -3610436258898878931L;
        ov.kjsp[123] = 4336681823879239232L;
        ov.kjsp[124] = 8877158447989027134L;
        ov.kjsp[125] = 6488475411172520397L;
        ov.kjsp[126] = 6668887415758247809L;
        ov.kjsp[127] = -2435604675359071956L;
        ov.kjsp[128] = 6825294844408223432L;
        ov.kjsp[129] = 5555292963472774517L;
        ov.kjsp[130] = -5176920666611012313L;
        ov.kjsp[131] = -940718123423093416L;
        ov.kjsp[132] = 8981271496536038395L;
        ov.kjsp[133] = 5357325365444154273L;
        ov.kjsp[134] = -1467837613135043028L;
        ov.kjsp[135] = 3474453842028641586L;
        ov.kjsp[136] = 3695339308568291994L;
        ov.kjsp[137] = -3139254652138052190L;
        ov.kjsp[138] = 4039811603579746092L;
        ov.kjsp[139] = -519383015163598456L;
        ov.kjsp[140] = -3942266497059470756L;
        ov.kjsp[141] = 2423354206880545577L;
        ov.kjsp[142] = -4793763291966841204L;
        ov.kjsp[143] = -6909447334217964023L;
        ov.kjsp[144] = 4592685733672611534L;
        ov.kjsp[145] = -3346994305904996234L;
        ov.kjsp[146] = 162622016963842557L;
        ov.kjsp[147] = -1307366959447930212L;
        ov.kjsp[148] = -7014215965038015292L;
        ov.kjsp[149] = 5676264028559985586L;
        ov.kjsp[150] = -7987301228740748004L;
        ov.kjsp[151] = -4478855680061440442L;
        ov.kjsp[152] = -3862458606477203430L;
        ov.kjsp[153] = -8318021028697751988L;
        ov.kjsp[154] = 1489913870165820086L;
        ov.kjsp[155] = 1885446488318289714L;
        ov.kjsp[156] = -4242911999663277411L;
        ov.kjsp[157] = -381989129232487460L;
        ov.kjsp[158] = 2901224247133879488L;
        ov.kjsp[159] = -5477762398131125024L;
        ov.kjsp[160] = 2524947699396656722L;
        ov.kjsp[161] = -6762894793911381928L;
        ov.kjsp[162] = 4720370176203004316L;
        ov.kjsp[163] = 1704954447650427231L;
    }

    private static /* synthetic */ void kkfl() {
        ov.kjsw[100] = -1165554378;
        ov.kjsw[101] = 1191769245;
        ov.kjsw[102] = 2006707291;
        ov.kjsw[103] = -2000345294;
        ov.kjsw[104] = -587358383;
        ov.kjsw[105] = -265242309;
        ov.kjsw[106] = 983662891;
        ov.kjsw[107] = -1698789868;
        ov.kjsw[108] = 59972132;
        ov.kjsw[109] = -309822963;
        ov.kjsw[110] = 1282822224;
        ov.kjsw[111] = -1129095420;
        ov.kjsw[112] = 585241371;
        ov.kjsw[113] = -1013673731;
        ov.kjsw[114] = -1460073686;
        ov.kjsw[115] = -986499655;
        ov.kjsw[116] = 917357180;
        ov.kjsw[117] = -1537817809;
        ov.kjsw[118] = -1492028450;
        ov.kjsw[119] = -1827823163;
        ov.kjsw[120] = -927060196;
        ov.kjsw[121] = -1962708071;
        ov.kjsw[122] = -338023588;
        ov.kjsw[123] = -742091707;
        ov.kjsw[124] = 52429196;
        ov.kjsw[125] = -520921878;
        ov.kjsw[126] = 907024591;
        ov.kjsw[127] = -714937608;
        ov.kjsw[128] = 1058318107;
        ov.kjsw[129] = 731134277;
        ov.kjsw[130] = 1222189893;
        ov.kjsw[131] = -1440799208;
        ov.kjsw[132] = 2118660587;
        ov.kjsw[133] = -978655997;
        ov.kjsw[134] = -1146371922;
        ov.kjsw[135] = 1362141875;
        ov.kjsw[136] = -1213898277;
        ov.kjsw[137] = -28609744;
        ov.kjsw[138] = 1987479725;
        ov.kjsw[139] = 856179021;
        ov.kjsw[140] = -1914864816;
        ov.kjsw[141] = -1597122350;
        ov.kjsw[142] = -2030983192;
        ov.kjsw[143] = 312421442;
        ov.kjsw[144] = 226502242;
        ov.kjsw[145] = -173104952;
        ov.kjsw[146] = -197804821;
        ov.kjsw[147] = 361399670;
        ov.kjsw[148] = 1204109357;
        ov.kjsw[149] = -1356737972;
        ov.kjsw[150] = -636389662;
        ov.kjsw[151] = 186773635;
        ov.kjsw[152] = 1371265049;
        ov.kjsw[153] = 1266627817;
        ov.kjsw[154] = -2035680779;
        ov.kjsw[155] = 843108449;
        ov.kjsw[156] = 238457438;
        ov.kjsw[157] = 663955604;
        ov.kjsw[158] = -1200451403;
        ov.kjsw[159] = -1717556637;
        ov.kjsw[160] = 2079572699;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov adjustSensitivity() {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kjss", kjsn(int ), (int)1) - ov.kjsq("kjsr", kjsn(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 879585041: {
                    continue block59;
                }
                case 1045687983: {
                    break block59;
                }
            }
            break;
        }
        var8_1 = ov.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kjst", kjsn(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ov.kjsq("kjsx", kjsu(int ), (int)0)) break;
            v1 /* !! */  = (long)ov.kjsq("kjsy", kjsu(int ), (int)1);
        }
        var7_2 /* !! */  = ov.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kjsz", kjsn(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ov.kjsq("kjta", kjsu(int ), (int)2)) break;
            v2 /* !! */  = (long)ov.kjsq("kjtb", kjsu(int ), (int)3);
        }
        var6_3 = ov.a;
        if (var8_1) {
            throw null;
lbl25:
            // 6 sources

            return null;
        }
        if (var6_3) ** GOTO lbl25
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) ** GOTO lbl25
                v3 /* !! */  = ov.sl;
                if (true) ** GOTO lbl36
                block63: while (true) {
                    v3 /* !! */  = (long)(v4 - ov.kjsq("kjtc", kjsn(int ), (int)4));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1824122663: {
                            v4 = ov.kjsq("kjtd", kjsn(int ), (int)5);
                            continue block63;
                        }
                        case 1045687983: {
                            break block63;
                        }
                        case 1304363178: {
                            v4 = ov.kjsq("kjte", kjsn(int ), (int)6);
                            continue block63;
                        }
                    }
                    break;
                }
                var1_4 = nm.computeGcd();
                if (var6_3 || var6_3) ** GOTO lbl25
                v5 /* !! */  = ov.sl;
                if (true) ** GOTO lbl51
                block64: while (true) {
                    v5 /* !! */  = (long)(v6 - ov.kjsq("kjtf", kjsn(int ), (int)7));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2036822824: {
                            v6 = ov.kjsq("kjtg", kjsn(int ), (int)8);
                            continue block64;
                        }
                        case 612403080: {
                            v6 = ov.kjsq("kjth", kjsn(int ), (int)9);
                            continue block64;
                        }
                        case 1045687983: {
                            break block64;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kjti", kjsn(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ov.kjsq("kjtj", kjsu(int ), (int)4)) break;
                    v7 /* !! */  = (long)ov.kjsq("kjtk", kjsu(int ), (int)5);
                }
                var3_5 = ot.INSTANCE.getServerAngle();
                if (var6_3 || var6_3) ** GOTO lbl25
                v8 /* !! */  = ov.sl;
                if (true) ** GOTO lbl71
                block66: while (true) {
                    v8 /* !! */  = (long)(ov.kjsq("kjtm", kjsn(int ), (int)12) - ov.kjsq("kjtl", kjsn(int ), (int)11));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 719786189: {
                            continue block66;
                        }
                        case 1045687983: {
                            break block66;
                        }
                    }
                    break;
                }
                v9 /* !! */  = ov.sl;
                if (true) ** GOTO lbl80
                block67: while (true) {
                    v9 /* !! */  = (long)(v10 - ov.kjsq("kjtn", kjsn(int ), (int)13));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1045687983: {
                            break block67;
                        }
                        case 1116904396: {
                            v10 = ov.kjsq("kjto", kjsn(int ), (int)14);
                            continue block67;
                        }
                        case 1636508298: {
                            v10 = ov.kjsq("kjtp", kjsn(int ), (int)15);
                            continue block67;
                        }
                    }
                    break;
                }
                v11 = var3_5.yaw;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = ov.sl - ov.kjsq("kjtq", kjsn(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ov.kjsq("kjtr", kjsu(int ), (int)6)) break;
                    v12 /* !! */  = (long)ov.kjsq("kjts", kjsu(int ), (int)7);
                }
                var4_6 = this.adjustAxis(this.yaw, v11, var1_4);
                if (var6_3 || var6_3) ** GOTO lbl25
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ov.sl - ov.kjsq("kjtt", kjsn(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ov.kjsq("kjtu", kjsu(int ), (int)8)) break;
                    v13 /* !! */  = (long)ov.kjsq("kjtv", kjsu(int ), (int)9);
                }
                v14 /* !! */  = ov.sl;
                if (true) ** GOTO lbl106
                block70: while (true) {
                    v14 /* !! */  = (long)(v15 - ov.kjsq("kjtw", kjsn(int ), (int)18));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1920250160: {
                            v15 = ov.kjsq("kjtx", kjsn(int ), (int)19);
                            continue block70;
                        }
                        case 675688912: {
                            v15 = ov.kjsq("kjty", kjsn(int ), (int)20);
                            continue block70;
                        }
                        case 1045687983: {
                            break block70;
                        }
                        case 1735605839: {
                            v15 = ov.kjsq("kjtz", kjsn(int ), (int)21);
                            continue block70;
                        }
                    }
                    break;
                }
                v16 = var3_5.pitch;
                v17 /* !! */  = ov.sl;
                if (true) ** GOTO lbl123
                block71: while (true) {
                    v17 /* !! */  = (long)(v18 - ov.kjsq("kjua", kjsn(int ), (int)22));
lbl123:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 110361434: {
                            v18 = ov.kjsq("kjub", kjsn(int ), (int)23);
                            continue block71;
                        }
                        case 876231858: {
                            v18 = ov.kjsq("kjuc", kjsn(int ), (int)24);
                            continue block71;
                        }
                        case 903905830: {
                            v18 = ov.kjsq("kjud", kjsn(int ), (int)25);
                            continue block71;
                        }
                        case 1045687983: {
                            break block71;
                        }
                    }
                    break;
                }
                var5_7 = this.adjustAxis(this.pitch, v16, var1_4);
                if (!var6_3 && !var6_3) ** break;
                ** continue;
                v19 /* !! */  = ov.sl;
                if (true) ** GOTO lbl142
                block72: while (true) {
                    v19 /* !! */  = (long)(v20 - ov.kjsq("kjue", kjsn(int ), (int)26));
lbl142:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1147767384: {
                            v20 = ov.kjsq("kjuf", kjsn(int ), (int)27);
                            continue block72;
                        }
                        case -1021715453: {
                            v20 = ov.kjsq("kjug", kjsn(int ), (int)28);
                            continue block72;
                        }
                        case 1045687983: {
                            break block72;
                        }
                    }
                    break;
                }
                v21 = ov.kjsq("kjui", kjuh(int ), (int)10);
                v22 = ov.kjsq("kjuj", kjuh(int ), (int)11);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = ov.sl - ov.kjsq("kjuk", kjsn(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ov.kjsq("kjul", kjsu(int ), (int)12)) break;
                    v23 /* !! */  = (long)ov.kjsq("kjum", kjsu(int ), (int)13);
                }
                v24 = class_3532.method_15363((float)var5_7, (float)v21, (float)v22);
                v25 /* !! */  = ov.sl;
                if (true) ** GOTO lbl163
                block74: while (true) {
                    v25 /* !! */  = (long)(v26 - ov.kjsq("kjun", kjsn(int ), (int)30));
lbl163:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1807534812: {
                            v26 = ov.kjsq("kjuo", kjsn(int ), (int)31);
                            continue block74;
                        }
                        case -140645318: {
                            v26 = ov.kjsq("kjup", kjsn(int ), (int)32);
                            continue block74;
                        }
                        case 1045687983: {
                            break block74;
                        }
                    }
                    break;
                }
                return new ov(var4_6, v24);
            }
            case 0: {
                var7_2 /* !! */  = (int)ov.kjsq("kjuq", kjsu(int ), (int)14);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)ov.kjsq("kjur", kjsu(int ), (int)15);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl211
                    break;
                }
            }
            case 2: {
                var7_2 /* !! */  = (int)ov.kjsq("kjus", kjsu(int ), (int)16);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl189:
            // 2 sources

            case 3: {
                var7_2 /* !! */  = (int)ov.kjsq("kjut", kjsu(int ), (int)17);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl194:
            // 3 sources

            case 4: {
                do {
                    var7_2 /* !! */  = (int)ov.kjsq("kjuu", kjsu(int ), (int)18);
                } while (!var8_1);
                throw null;
            }
lbl199:
            // 2 sources

            case 5: {
                var7_2 /* !! */  = (int)ov.kjsq("kjuv", kjsu(int ), (int)19);
                if (!var8_1) break;
                throw null;
            }
lbl203:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)ov.kjsq("kjuw", kjsu(int ), (int)20);
                if (!var8_1) ** GOTO lbl194
                throw null;
            }
lbl207:
            // 3 sources

            case 7: {
                var7_2 /* !! */  = (int)ov.kjsq("kjux", kjsu(int ), (int)21);
                if (!var8_1) ** GOTO lbl199
                throw null;
            }
lbl211:
            // 2 sources

            case 8: {
                var7_2 /* !! */  = (int)ov.kjsq("kjuy", kjsu(int ), (int)22);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 9: {
                var7_2 /* !! */  = (int)ov.kjsq("kjuz", kjsu(int ), (int)23);
                if (!var8_1) ** GOTO lbl203
                throw null;
            }
lbl220:
            // 2 sources

            case 10: {
                var7_2 /* !! */  = (int)ov.kjsq("kjva", kjsu(int ), (int)24);
                if (!var8_1) ** GOTO lbl189
                throw null;
            }
            case 11: 
        }
        var7_2 /* !! */  = (int)ov.kjsq("kjvb", kjsu(int ), (int)25);
        ** while (!var8_1)
lbl227:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long kjsn(int n2) {
        return kjso[n2] ^ kjsp[n2];
    }

    private static /* synthetic */ void kkfm() {
        ov.kjso[0] = 7778241245224064750L;
        ov.kjso[1] = -5820541279382608664L;
        ov.kjso[2] = -5083695505055033065L;
        ov.kjso[3] = -5772376523152678744L;
        ov.kjso[4] = -51591688006649832L;
        ov.kjso[5] = 1939290511161897659L;
        ov.kjso[6] = -6979057761176788000L;
        ov.kjso[7] = -1377121573638368867L;
        ov.kjso[8] = -4515091283420425014L;
        ov.kjso[9] = -1764032736812030115L;
        ov.kjso[10] = -484245484514707928L;
        ov.kjso[11] = 6171752425509133157L;
        ov.kjso[12] = 6958421274921514476L;
        ov.kjso[13] = 6857556513555953696L;
        ov.kjso[14] = -6932656317919607315L;
        ov.kjso[15] = -451981598202699639L;
        ov.kjso[16] = 7308038308226890302L;
        ov.kjso[17] = 6672471365623661343L;
        ov.kjso[18] = -330357313935713739L;
        ov.kjso[19] = -8959530124624007135L;
        ov.kjso[20] = 891076088283317993L;
        ov.kjso[21] = -8190560473948985551L;
        ov.kjso[22] = -3230141734269643535L;
        ov.kjso[23] = -4418931141993905115L;
        ov.kjso[24] = -573249189720695401L;
        ov.kjso[25] = -3973873277699923350L;
        ov.kjso[26] = 8666781142516869858L;
        ov.kjso[27] = 990110056745211630L;
        ov.kjso[28] = 4565292987273740552L;
        ov.kjso[29] = 3289286670795558366L;
        ov.kjso[30] = 9021430292245938707L;
        ov.kjso[31] = 6496957289272599568L;
        ov.kjso[32] = -6704612306995319822L;
        ov.kjso[33] = 8917388157702737527L;
        ov.kjso[34] = 7349596312683666460L;
        ov.kjso[35] = 5607870598722340815L;
        ov.kjso[36] = 2703087787351463714L;
        ov.kjso[37] = -5480952013899771030L;
        ov.kjso[38] = -7933115620899813910L;
        ov.kjso[39] = -2279444320584174547L;
        ov.kjso[40] = 2886150487551779598L;
        ov.kjso[41] = 7517239944364172345L;
        ov.kjso[42] = -1887501427415774094L;
        ov.kjso[43] = 5759334012140673133L;
        ov.kjso[44] = -1741929376771298431L;
        ov.kjso[45] = 607642784354128657L;
        ov.kjso[46] = 1054210511237805750L;
        ov.kjso[47] = -6225764226341658532L;
        ov.kjso[48] = -4557701689618312922L;
        ov.kjso[49] = -7074334956139390288L;
        ov.kjso[50] = 1084334948939711669L;
        ov.kjso[51] = 5316023663984635417L;
        ov.kjso[52] = -53910965704042L;
        ov.kjso[53] = -6701516267543095692L;
        ov.kjso[54] = 2730426625603420005L;
        ov.kjso[55] = 8730828515674097355L;
        ov.kjso[56] = -4689491614600340263L;
        ov.kjso[57] = -6882915657406536982L;
        ov.kjso[58] = 1471705151462614478L;
        ov.kjso[59] = 1113500203454496161L;
        ov.kjso[60] = 5747516821957496131L;
        ov.kjso[61] = 599879750619551176L;
        ov.kjso[62] = 6844063581734710339L;
        ov.kjso[63] = -2537172365767216393L;
        ov.kjso[64] = 1396138184924244713L;
        ov.kjso[65] = 633736156587128236L;
        ov.kjso[66] = 1548982029435830815L;
        ov.kjso[67] = -8444679494477896284L;
        ov.kjso[68] = -2696136009948102928L;
        ov.kjso[69] = 141252726970786673L;
        ov.kjso[70] = -4534958319161415888L;
        ov.kjso[71] = 312201818573712780L;
        ov.kjso[72] = 2910807248243182721L;
        ov.kjso[73] = -1796469109001237518L;
        ov.kjso[74] = 4273353627196731756L;
        ov.kjso[75] = -8054559041532505575L;
        ov.kjso[76] = 6230740534348058827L;
        ov.kjso[77] = 4149499848126513185L;
        ov.kjso[78] = -4654640961717459364L;
        ov.kjso[79] = 7486601028463893851L;
        ov.kjso[80] = 245656320724235217L;
        ov.kjso[81] = 1357756231933559284L;
        ov.kjso[82] = 7549488544446201594L;
        ov.kjso[83] = -5395681809337602163L;
        ov.kjso[84] = 4282287445038688272L;
        ov.kjso[85] = -5584315396301804686L;
        ov.kjso[86] = 3268335062539647390L;
        ov.kjso[87] = 6782660993026876750L;
        ov.kjso[88] = 5720727649331549538L;
        ov.kjso[89] = -5041984820194627316L;
        ov.kjso[90] = -7027882461784637907L;
        ov.kjso[91] = 6600190449206761716L;
        ov.kjso[92] = -5132095017504835587L;
        ov.kjso[93] = -7485286534138188193L;
        ov.kjso[94] = -2445305543773159931L;
        ov.kjso[95] = -8849246192748970884L;
        ov.kjso[96] = 5064896173337591139L;
        ov.kjso[97] = 5092436966464362157L;
        ov.kjso[98] = 2452987685902564581L;
        ov.kjso[99] = 1373800320584261235L;
    }

    private static /* synthetic */ void kkfo() {
        ov.kjsp[0] = -8518980987687156099L;
        ov.kjsp[1] = -5527390047933920532L;
        ov.kjsp[2] = 4573350567082373777L;
        ov.kjsp[3] = -4312928090985325025L;
        ov.kjsp[4] = 7509843513472850008L;
        ov.kjsp[5] = 8385243667890521300L;
        ov.kjsp[6] = -2963493644121776393L;
        ov.kjsp[7] = -205996468843900007L;
        ov.kjsp[8] = -7239085651772836938L;
        ov.kjsp[9] = -8317082122898249544L;
        ov.kjsp[10] = 8223000840142198019L;
        ov.kjsp[11] = -1142558788931449357L;
        ov.kjsp[12] = -4480213764238905548L;
        ov.kjsp[13] = -3230402549484187274L;
        ov.kjsp[14] = -7097558305806646208L;
        ov.kjsp[15] = -2839692381307235124L;
        ov.kjsp[16] = -6558874837259814681L;
        ov.kjsp[17] = 1041120653091197070L;
        ov.kjsp[18] = -7596773088492142463L;
        ov.kjsp[19] = -7251966306711536799L;
        ov.kjsp[20] = -3190297741702144692L;
        ov.kjsp[21] = -1325671141083970423L;
        ov.kjsp[22] = -6762196865503606455L;
        ov.kjsp[23] = 6773290265275268033L;
        ov.kjsp[24] = 4088909149569661050L;
        ov.kjsp[25] = -4239284342266446423L;
        ov.kjsp[26] = 1206144781755473304L;
        ov.kjsp[27] = 805275212797205851L;
        ov.kjsp[28] = -5570093037676850069L;
        ov.kjsp[29] = -2437599384504541860L;
        ov.kjsp[30] = 3633218170585153096L;
        ov.kjsp[31] = 842095326701262767L;
        ov.kjsp[32] = 3703704099407813782L;
        ov.kjsp[33] = -1745050098339986985L;
        ov.kjsp[34] = -2309409453624419244L;
        ov.kjsp[35] = 4349702932668849624L;
        ov.kjsp[36] = -6178700681291515018L;
        ov.kjsp[37] = 8789960147704507590L;
        ov.kjsp[38] = 4665399232141711442L;
        ov.kjsp[39] = 4156837248080157238L;
        ov.kjsp[40] = -3750506612895712547L;
        ov.kjsp[41] = 1936303301192268253L;
        ov.kjsp[42] = -9073179276600863900L;
        ov.kjsp[43] = 5466227115687783971L;
        ov.kjsp[44] = -6200590085861608311L;
        ov.kjsp[45] = -2701125140295395604L;
        ov.kjsp[46] = -4195432796920486236L;
        ov.kjsp[47] = -6318206455548191213L;
        ov.kjsp[48] = 4772836384410274353L;
        ov.kjsp[49] = -5240240822280363627L;
        ov.kjsp[50] = -4597589837916065458L;
        ov.kjsp[51] = 9116419744243163055L;
        ov.kjsp[52] = -8241839494584109803L;
        ov.kjsp[53] = -3272076089897834344L;
        ov.kjsp[54] = -7043689117936509884L;
        ov.kjsp[55] = 687593629003373386L;
        ov.kjsp[56] = 4185360297465962965L;
        ov.kjsp[57] = -6188619939236249506L;
        ov.kjsp[58] = 6066394078625345318L;
        ov.kjsp[59] = -4919705059893027111L;
        ov.kjsp[60] = -534189376746357358L;
        ov.kjsp[61] = 7846972193159423689L;
        ov.kjsp[62] = 9016434212535612225L;
        ov.kjsp[63] = 3718903925900889837L;
        ov.kjsp[64] = -3084735160941922791L;
        ov.kjsp[65] = 25206606683089304L;
        ov.kjsp[66] = 3323891466737308077L;
        ov.kjsp[67] = 8443990685991734669L;
        ov.kjsp[68] = -2744220674126153481L;
        ov.kjsp[69] = 5193205182801207233L;
        ov.kjsp[70] = 1384343543345061730L;
        ov.kjsp[71] = 3063277955974679248L;
        ov.kjsp[72] = -8593733332381903575L;
        ov.kjsp[73] = -3580912662396077633L;
        ov.kjsp[74] = 8680629268675138384L;
        ov.kjsp[75] = 7165338662239329884L;
        ov.kjsp[76] = 786856206662027838L;
        ov.kjsp[77] = 5112640425652677112L;
        ov.kjsp[78] = 574636465931487284L;
        ov.kjsp[79] = -4215067751950588175L;
        ov.kjsp[80] = -7405877528855546535L;
        ov.kjsp[81] = -6651202547007792756L;
        ov.kjsp[82] = -4218034889030273979L;
        ov.kjsp[83] = -6937624191917676582L;
        ov.kjsp[84] = 7655650594252826472L;
        ov.kjsp[85] = 1816083861712397690L;
        ov.kjsp[86] = -3086843774023900434L;
        ov.kjsp[87] = 8392516057411879716L;
        ov.kjsp[88] = 8625297027449925538L;
        ov.kjsp[89] = -4478653881414496748L;
        ov.kjsp[90] = -6677996332975677583L;
        ov.kjsp[91] = -2397339640347032364L;
        ov.kjsp[92] = 1784258835493404568L;
        ov.kjsp[93] = -3757301399940000629L;
        ov.kjsp[94] = 1422941105533320133L;
        ov.kjsp[95] = -5344280641640582860L;
        ov.kjsp[96] = -630478066154401963L;
        ov.kjsp[97] = 3940130048845829974L;
        ov.kjsp[98] = -4885868734147659384L;
        ov.kjsp[99] = 6195081877587014936L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov(float var1_1, float var2_2) {
        var4_3 /* !! */  = ov.b;
        var3_4 = ov.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.yaw = var1_1;
                this.pitch = var2_2;
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)ov.kjsq("kkfe", kjsu(int ), (int)157);
                ** GOTO lbl16
            }
            case 1: {
                var4_3 /* !! */  = (int)ov.kjsq("kkff", kjsu(int ), (int)158);
                ** GOTO lbl10
            }
lbl16:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ov.kjsq("kkfg", kjsu(int ), (int)159);
                    ** GOTO lbl10
                    break;
                }
            }
            case 3: 
        }
        var4_3 /* !! */  = (int)ov.kjsq("kkfh", kjsu(int ), (int)160);
        ** while (true)
    }

    static {
        kjsv = new int[161];
        kjsw = new int[161];
        ov.kkfi();
        ov.kkfj();
        ov.kkfk();
        ov.kkfl();
        kjso = new long[164];
        kjsp = new long[164];
        ov.kkfm();
        ov.kkfn();
        ov.kkfo();
        ov.kkfp();
        DEFAULT = new ov(0.0f, 0.0f);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov of(ov var1_1) {
        v0 /* !! */  = ov.sl;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(ov.kjsq("kkba", kjsn(int ), (int)108) - ov.kjsq("kkaz", kjsn(int ), (int)107));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1045687983: {
                    break block26;
                }
                case 1152326863: {
                    continue block26;
                }
            }
            break;
        }
        var4_2 = ov.c;
        v1 /* !! */  = ov.sl;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - ov.kjsq("kkbb", kjsn(int ), (int)109));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -253135410: {
                    v2 = ov.kjsq("kkbc", kjsn(int ), (int)110);
                    continue block27;
                }
                case 927573072: {
                    v2 = ov.kjsq("kkbd", kjsn(int ), (int)111);
                    continue block27;
                }
                case 1045687983: {
                    break block27;
                }
                case 1748595460: {
                    v2 = ov.kjsq("kkbe", kjsn(int ), (int)112);
                    continue block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = ov.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ov.sl - ov.kjsq("kkbf", kjsn(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ov.kjsq("kkbg", kjsu(int ), (int)105)) break;
            v3 /* !! */  = (long)ov.kjsq("kkbh", kjsu(int ), (int)106);
        }
        var2_4 = ov.a;
        if (var4_2) {
            throw null;
            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = ov.sl;
                if (true) ** GOTO lbl46
                block30: while (true) {
                    v4 /* !! */  = (long)(ov.kjsq("kkbj", kjsn(int ), (int)115) - ov.kjsq("kkbi", kjsn(int ), (int)114));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1045687983: {
                            break block30;
                        }
                        case 1183857048: {
                            continue block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ov.sl - ov.kjsq("kkbk", kjsn(int ), (int)116)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ov.kjsq("kkbl", kjsu(int ), (int)107)) break;
                    v5 /* !! */  = (long)ov.kjsq("kkbm", kjsu(int ), (int)108);
                }
                v6 = var1_1.getYaw();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ov.sl - ov.kjsq("kkbn", kjsn(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ov.kjsq("kkbo", kjsu(int ), (int)109)) break;
                    v7 /* !! */  = (long)ov.kjsq("kkbp", kjsu(int ), (int)110);
                }
                v8 = var1_1.getPitch();
                v9 /* !! */  = ov.sl;
                if (true) ** GOTO lbl67
                block33: while (true) {
                    v9 /* !! */  = (long)(v10 - ov.kjsq("kkbq", kjsn(int ), (int)118));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2106415836: {
                            v10 = ov.kjsq("kkbr", kjsn(int ), (int)119);
                            continue block33;
                        }
                        case -1469431505: {
                            v10 = ov.kjsq("kkbs", kjsn(int ), (int)120);
                            continue block33;
                        }
                        case -687141621: {
                            v10 = ov.kjsq("kkbt", kjsn(int ), (int)121);
                            continue block33;
                        }
                        case 1045687983: {
                            break block33;
                        }
                    }
                    break;
                }
                return new ov(v6, v8);
            }
lbl80:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ov.kjsq("kkbu", kjsu(int ), (int)111);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ov.kjsq("kkbv", kjsu(int ), (int)112);
                    if (!var4_2) ** GOTO lbl80
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ov.kjsq("kkbw", kjsu(int ), (int)113);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ov.kjsq("kkbx", kjsu(int ), (int)114);
        ** while (!var4_2)
lbl97:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kkfi() {
        ov.kjsv[0] = -699670505;
        ov.kjsv[1] = 300563198;
        ov.kjsv[2] = -1163247764;
        ov.kjsv[3] = -393869842;
        ov.kjsv[4] = -1341957417;
        ov.kjsv[5] = -1439546052;
        ov.kjsv[6] = -855240193;
        ov.kjsv[7] = 494290806;
        ov.kjsv[8] = 427519355;
        ov.kjsv[9] = 376937692;
        ov.kjsv[10] = 53168516;
        ov.kjsv[11] = 939444449;
        ov.kjsv[12] = 1596635847;
        ov.kjsv[13] = 1181729639;
        ov.kjsv[14] = -803308094;
        ov.kjsv[15] = 1286466378;
        ov.kjsv[16] = 419204409;
        ov.kjsv[17] = -1011424116;
        ov.kjsv[18] = 1704654062;
        ov.kjsv[19] = 417517313;
        ov.kjsv[20] = -2048787675;
        ov.kjsv[21] = -1977708069;
        ov.kjsv[22] = -719135235;
        ov.kjsv[23] = -9758687;
        ov.kjsv[24] = -244039221;
        ov.kjsv[25] = 1462955393;
        ov.kjsv[26] = 45059254;
        ov.kjsv[27] = -1222980472;
        ov.kjsv[28] = -874310571;
        ov.kjsv[29] = -123730117;
        ov.kjsv[30] = 369332124;
        ov.kjsv[31] = -779205595;
        ov.kjsv[32] = 1774178462;
        ov.kjsv[33] = -1837087617;
        ov.kjsv[34] = -961457286;
        ov.kjsv[35] = 1439151108;
        ov.kjsv[36] = -1034753403;
        ov.kjsv[37] = 400455757;
        ov.kjsv[38] = 1903544101;
        ov.kjsv[39] = 1601878058;
        ov.kjsv[40] = -1505875468;
        ov.kjsv[41] = 1996836149;
        ov.kjsv[42] = -1559317670;
        ov.kjsv[43] = 1705663501;
        ov.kjsv[44] = -1944291362;
        ov.kjsv[45] = 926171006;
        ov.kjsv[46] = 397831415;
        ov.kjsv[47] = -1550103914;
        ov.kjsv[48] = 1245997826;
        ov.kjsv[49] = 660004748;
        ov.kjsv[50] = 486757860;
        ov.kjsv[51] = -515012041;
        ov.kjsv[52] = 42792983;
        ov.kjsv[53] = 136802698;
        ov.kjsv[54] = -1065405742;
        ov.kjsv[55] = 797406234;
        ov.kjsv[56] = -53728660;
        ov.kjsv[57] = -550300007;
        ov.kjsv[58] = -1871468344;
        ov.kjsv[59] = -1310937854;
        ov.kjsv[60] = 1401077103;
        ov.kjsv[61] = 1758401227;
        ov.kjsv[62] = 2026526216;
        ov.kjsv[63] = -1145157367;
        ov.kjsv[64] = 578426995;
        ov.kjsv[65] = -681030365;
        ov.kjsv[66] = -1841268949;
        ov.kjsv[67] = -72846248;
        ov.kjsv[68] = -1784120389;
        ov.kjsv[69] = -2035485557;
        ov.kjsv[70] = 2102216635;
        ov.kjsv[71] = -899736040;
        ov.kjsv[72] = 1655786240;
        ov.kjsv[73] = 1206627372;
        ov.kjsv[74] = 763834489;
        ov.kjsv[75] = 1610764274;
        ov.kjsv[76] = 761204131;
        ov.kjsv[77] = 47916582;
        ov.kjsv[78] = 766779180;
        ov.kjsv[79] = 955516544;
        ov.kjsv[80] = -664557958;
        ov.kjsv[81] = -308346959;
        ov.kjsv[82] = -17510274;
        ov.kjsv[83] = -645122500;
        ov.kjsv[84] = -727962960;
        ov.kjsv[85] = 53176531;
        ov.kjsv[86] = -1240487635;
        ov.kjsv[87] = -93574556;
        ov.kjsv[88] = -1585476889;
        ov.kjsv[89] = 2058962178;
        ov.kjsv[90] = 1935222713;
        ov.kjsv[91] = 2082982724;
        ov.kjsv[92] = 1085103188;
        ov.kjsv[93] = 1987192872;
        ov.kjsv[94] = 1748466148;
        ov.kjsv[95] = -1300007226;
        ov.kjsv[96] = 1536167892;
        ov.kjsv[97] = 0x28000880;
        ov.kjsv[98] = -1342879741;
        ov.kjsv[99] = 820827830;
    }
}

