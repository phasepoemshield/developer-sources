/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ji$ParticleKind
extends Enum<ji$ParticleKind> {
    private static int[] bvim;
    public static final boolean c;
    public static final /* enum */ ji$ParticleKind AMBIENT;
    public static final boolean a;
    public static final int b;
    private static final /* synthetic */ ji$ParticleKind[] $VALUES;
    public static final /* enum */ ji$ParticleKind CRITICAL;
    public static final /* enum */ ji$ParticleKind TOTEM;
    private static long[] bvif;
    public static final /* enum */ ji$ParticleKind PEARL;
    private static long[] bvie;
    private static final long em = -6768601826487033083L;
    private static int[] bvil;

    private static /* synthetic */ int bvik(int n2) {
        return bvil[n2] ^ bvim[n2];
    }

    private static /* synthetic */ void bvlb() {
        ji$ParticleKind.bvim[0] = -812782378;
        ji$ParticleKind.bvim[1] = 407580772;
        ji$ParticleKind.bvim[2] = 1396980551;
        ji$ParticleKind.bvim[3] = 536022892;
        ji$ParticleKind.bvim[4] = 231365341;
        ji$ParticleKind.bvim[5] = 589912680;
        ji$ParticleKind.bvim[6] = 1738133655;
        ji$ParticleKind.bvim[7] = -163717704;
        ji$ParticleKind.bvim[8] = -101130022;
        ji$ParticleKind.bvim[9] = -1837338729;
        ji$ParticleKind.bvim[10] = -1227893376;
        ji$ParticleKind.bvim[11] = 782052922;
        ji$ParticleKind.bvim[12] = -491341662;
        ji$ParticleKind.bvim[13] = -1746080115;
        ji$ParticleKind.bvim[14] = 451972610;
        ji$ParticleKind.bvim[15] = 2121536465;
        ji$ParticleKind.bvim[16] = 154211256;
        ji$ParticleKind.bvim[17] = 243121094;
        ji$ParticleKind.bvim[18] = 1155308286;
        ji$ParticleKind.bvim[19] = -1995259932;
        ji$ParticleKind.bvim[20] = 425728427;
        ji$ParticleKind.bvim[21] = -1818368850;
        ji$ParticleKind.bvim[22] = 145813050;
        ji$ParticleKind.bvim[23] = 2033380928;
        ji$ParticleKind.bvim[24] = 1723697334;
        ji$ParticleKind.bvim[25] = 357311335;
        ji$ParticleKind.bvim[26] = 987911910;
        ji$ParticleKind.bvim[27] = 372695450;
        ji$ParticleKind.bvim[28] = -1076238938;
        ji$ParticleKind.bvim[29] = 2141995275;
        ji$ParticleKind.bvim[30] = -142443400;
        ji$ParticleKind.bvim[31] = 1037248782;
        ji$ParticleKind.bvim[32] = 46575359;
        ji$ParticleKind.bvim[33] = 1880173200;
        ji$ParticleKind.bvim[34] = 459232801;
        ji$ParticleKind.bvim[35] = -188416838;
        ji$ParticleKind.bvim[36] = 1033182514;
        ji$ParticleKind.bvim[37] = -386382479;
        ji$ParticleKind.bvim[38] = 514217170;
        ji$ParticleKind.bvim[39] = 1348292171;
    }

    private static /* synthetic */ long bvid(int n2) {
        return bvie[n2] ^ bvif[n2];
    }

    static {
        bvil = new int[40];
        bvim = new int[40];
        ji$ParticleKind.bvla();
        ji$ParticleKind.bvlb();
        bvie = new long[28];
        bvif = new long[28];
        ji$ParticleKind.bvlc();
        ji$ParticleKind.bvld();
        AMBIENT = new ji$ParticleKind();
        PEARL = new ji$ParticleKind();
        CRITICAL = new ji$ParticleKind();
        TOTEM = new ji$ParticleKind();
        $VALUES = ji$ParticleKind.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ji$ParticleKind[] values() {
        v0 /* !! */  = ji$ParticleKind.em;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ji$ParticleKind.bvig("bvii", bvid(int ), (int)1) - ji$ParticleKind.bvig("bvih", bvid(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -618893011: {
                    continue block15;
                }
                case 439231237: {
                    break block15;
                }
            }
            break;
        }
        var2 = ji$ParticleKind.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvij", bvid(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ji$ParticleKind.bvig("bvin", bvik(int ), (int)0)) break;
            v1 /* !! */  = (long)ji$ParticleKind.bvig("bvio", bvik(int ), (int)1);
        }
        var1_1 /* !! */  = ji$ParticleKind.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvip", bvid(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ji$ParticleKind.bvig("bviq", bvik(int ), (int)2)) break;
            v2 /* !! */  = (long)ji$ParticleKind.bvig("bvir", bvik(int ), (int)3);
        }
        var0_2 = ji$ParticleKind.a;
        if (!var2) ** GOTO lbl31
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var0_2 || var0_2) continue block18;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvis", bvid(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ji$ParticleKind.bvig("bvit", bvik(int ), (int)4)) break;
                    v3 /* !! */  = (long)ji$ParticleKind.bvig("bviu", bvik(int ), (int)5);
                }
                v4 /* !! */  = ji$ParticleKind.em;
                if (true) ** GOTO lbl42
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ji$ParticleKind.bvig("bviv", bvid(int ), (int)5));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 439231237: {
                            break block20;
                        }
                        case 1342422908: {
                            v5 = ji$ParticleKind.bvig("bviw", bvid(int ), (int)6);
                            continue block20;
                        }
                        case 1930402710: {
                            v5 = ji$ParticleKind.bvig("bvix", bvid(int ), (int)7);
                            continue block20;
                        }
                    }
                    break;
                }
                return (ji$ParticleKind[])ji$ParticleKind.$VALUES.clone();
lbl52:
                // 2 sources

                case 0: {
                    do {
                        var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bviy", bvik(int ), (int)6);
                    } while (!var2);
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bviz", bvik(int ), (int)7);
                    if (!var2) ** GOTO lbl52
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvja", bvik(int ), (int)8);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvjb", bvik(int ), (int)9);
        ** while (!var2)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ji$ParticleKind() {
        var4_3 /* !! */  = ji$ParticleKind.b;
        var3_4 = ji$ParticleKind.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ji$ParticleKind.bvig("bvju", bvik(int ), (int)18);
            }
            case 1: {
                var4_3 /* !! */  = (int)ji$ParticleKind.bvig("bvjv", bvik(int ), (int)19);
                ** GOTO lbl8
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)ji$ParticleKind.bvig("bvjw", bvik(int ), (int)20);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ji$ParticleKind valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvjc", bvid(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ji$ParticleKind.bvig("bvjd", bvik(int ), (int)10)) break;
            v0 /* !! */  = (long)ji$ParticleKind.bvig("bvje", bvik(int ), (int)11);
        }
        var3_1 = ji$ParticleKind.c;
        v1 /* !! */  = ji$ParticleKind.em;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - ji$ParticleKind.bvig("bvjf", bvid(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 439231237: {
                    break block19;
                }
                case 634648835: {
                    v2 = ji$ParticleKind.bvig("bvjg", bvid(int ), (int)10);
                    continue block19;
                }
                case 1300588212: {
                    v2 = ji$ParticleKind.bvig("bvjh", bvid(int ), (int)11);
                    continue block19;
                }
                case 1854920549: {
                    v2 = ji$ParticleKind.bvig("bvji", bvid(int ), (int)12);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = ji$ParticleKind.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvjj", bvid(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ji$ParticleKind.bvig("bvjk", bvik(int ), (int)12)) break;
                    v3 /* !! */  = (long)ji$ParticleKind.bvig("bvjl", bvik(int ), (int)13);
                }
                var1_3 = ji$ParticleKind.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ji$ParticleKind.em;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - ji$ParticleKind.bvig("bvjm", bvid(int ), (int)14));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1807008157: {
                            v5 = ji$ParticleKind.bvig("bvjn", bvid(int ), (int)15);
                            continue block22;
                        }
                        case 317720035: {
                            v5 = ji$ParticleKind.bvig("bvjo", bvid(int ), (int)16);
                            continue block22;
                        }
                        case 439231237: {
                            break block22;
                        }
                        case 691112819: {
                            v5 = ji$ParticleKind.bvig("bvjp", bvid(int ), (int)17);
                            continue block22;
                        }
                    }
                    break;
                }
                return Enum.valueOf(ji$ParticleKind.class, var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ji$ParticleKind.bvig("bvjq", bvik(int ), (int)14);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ji$ParticleKind.bvig("bvjr", bvik(int ), (int)15);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ji$ParticleKind.bvig("bvjs", bvik(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ji$ParticleKind.bvig("bvjt", bvik(int ), (int)17);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bvig(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bvla() {
        ji$ParticleKind.bvil[0] = -812782377;
        ji$ParticleKind.bvil[1] = 1163898574;
        ji$ParticleKind.bvil[2] = -1396980552;
        ji$ParticleKind.bvil[3] = -1639657237;
        ji$ParticleKind.bvil[4] = -231365342;
        ji$ParticleKind.bvil[5] = -1117298271;
        ji$ParticleKind.bvil[6] = 1738133655;
        ji$ParticleKind.bvil[7] = -163717703;
        ji$ParticleKind.bvil[8] = -101130024;
        ji$ParticleKind.bvil[9] = -1837338730;
        ji$ParticleKind.bvil[10] = 1227893375;
        ji$ParticleKind.bvil[11] = 297827561;
        ji$ParticleKind.bvil[12] = 491341661;
        ji$ParticleKind.bvil[13] = 1984157920;
        ji$ParticleKind.bvil[14] = 451972611;
        ji$ParticleKind.bvil[15] = 2121536466;
        ji$ParticleKind.bvil[16] = 154211257;
        ji$ParticleKind.bvil[17] = 243121092;
        ji$ParticleKind.bvil[18] = 1155308287;
        ji$ParticleKind.bvil[19] = -1995259930;
        ji$ParticleKind.bvil[20] = 425728425;
        ji$ParticleKind.bvil[21] = 1818368849;
        ji$ParticleKind.bvil[22] = 1719234902;
        ji$ParticleKind.bvil[23] = -2033380929;
        ji$ParticleKind.bvil[24] = 1561355667;
        ji$ParticleKind.bvil[25] = 357311335;
        ji$ParticleKind.bvil[26] = 987911911;
        ji$ParticleKind.bvil[27] = -372695451;
        ji$ParticleKind.bvil[28] = -1076238940;
        ji$ParticleKind.bvil[29] = -2141995276;
        ji$ParticleKind.bvil[30] = -142443397;
        ji$ParticleKind.bvil[31] = -1037248783;
        ji$ParticleKind.bvil[32] = 46575358;
        ji$ParticleKind.bvil[33] = 1880173202;
        ji$ParticleKind.bvil[34] = 459232802;
        ji$ParticleKind.bvil[35] = -188416840;
        ji$ParticleKind.bvil[36] = 1033182514;
        ji$ParticleKind.bvil[37] = -386382480;
        ji$ParticleKind.bvil[38] = 514217168;
        ji$ParticleKind.bvil[39] = 1348292168;
    }

    private static /* synthetic */ void bvld() {
        ji$ParticleKind.bvif[0] = -2736651424714583071L;
        ji$ParticleKind.bvif[1] = -8690939454136551412L;
        ji$ParticleKind.bvif[2] = 4586905266883389583L;
        ji$ParticleKind.bvif[3] = -4402241962866052597L;
        ji$ParticleKind.bvif[4] = 2954509720970129714L;
        ji$ParticleKind.bvif[5] = 3124580303182394987L;
        ji$ParticleKind.bvif[6] = 5038071621543187047L;
        ji$ParticleKind.bvif[7] = -8683354234549253893L;
        ji$ParticleKind.bvif[8] = 8577739433981662364L;
        ji$ParticleKind.bvif[9] = -4879826487849720516L;
        ji$ParticleKind.bvif[10] = -3142589031772746440L;
        ji$ParticleKind.bvif[11] = -5853215375877455139L;
        ji$ParticleKind.bvif[12] = -5763267343020376685L;
        ji$ParticleKind.bvif[13] = -3567207691807517615L;
        ji$ParticleKind.bvif[14] = -7754961498532686416L;
        ji$ParticleKind.bvif[15] = -2623957503011493762L;
        ji$ParticleKind.bvif[16] = -3301932596984471224L;
        ji$ParticleKind.bvif[17] = 8814462627103703271L;
        ji$ParticleKind.bvif[18] = 4778229229035502426L;
        ji$ParticleKind.bvif[19] = -372543077405255986L;
        ji$ParticleKind.bvif[20] = -4229341981307831855L;
        ji$ParticleKind.bvif[21] = 9046002475020493742L;
        ji$ParticleKind.bvif[22] = 7485531136762750740L;
        ji$ParticleKind.bvif[23] = 8537175919822386925L;
        ji$ParticleKind.bvif[24] = -7905129020644827430L;
        ji$ParticleKind.bvif[25] = -4322670398428028809L;
        ji$ParticleKind.bvif[26] = 4252338793319214590L;
        ji$ParticleKind.bvif[27] = -931254544904922477L;
    }

    private static /* synthetic */ void bvlc() {
        ji$ParticleKind.bvie[0] = -111195474677940447L;
        ji$ParticleKind.bvie[1] = -4013175572319498873L;
        ji$ParticleKind.bvie[2] = -6018232173940792786L;
        ji$ParticleKind.bvie[3] = 8642912501089756898L;
        ji$ParticleKind.bvie[4] = 3479358321447161774L;
        ji$ParticleKind.bvie[5] = 7793871111221867263L;
        ji$ParticleKind.bvie[6] = -727678884375911116L;
        ji$ParticleKind.bvie[7] = -2182925573541148614L;
        ji$ParticleKind.bvie[8] = -8490346768074428673L;
        ji$ParticleKind.bvie[9] = -7397161593719249565L;
        ji$ParticleKind.bvie[10] = 6589149631408163206L;
        ji$ParticleKind.bvie[11] = 133747640076903614L;
        ji$ParticleKind.bvie[12] = -3616213337310328819L;
        ji$ParticleKind.bvie[13] = 6954289699383392090L;
        ji$ParticleKind.bvie[14] = -205655265791875237L;
        ji$ParticleKind.bvie[15] = -6439744697430029313L;
        ji$ParticleKind.bvie[16] = -3691952683317105906L;
        ji$ParticleKind.bvie[17] = -6246421462579055273L;
        ji$ParticleKind.bvie[18] = 8053484063739874511L;
        ji$ParticleKind.bvie[19] = 4378753008637843186L;
        ji$ParticleKind.bvie[20] = 9074048701823619366L;
        ji$ParticleKind.bvie[21] = -3479286137476567647L;
        ji$ParticleKind.bvie[22] = 7845610298823735419L;
        ji$ParticleKind.bvie[23] = -1322762370080353368L;
        ji$ParticleKind.bvie[24] = 4510415929542872811L;
        ji$ParticleKind.bvie[25] = 2767536589028468471L;
        ji$ParticleKind.bvie[26] = 6646765070676525982L;
        ji$ParticleKind.bvie[27] = -644262572714016098L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ji$ParticleKind[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvjx", bvid(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ji$ParticleKind.bvig("bvjy", bvik(int ), (int)21)) break;
            v0 /* !! */  = (long)ji$ParticleKind.bvig("bvjz", bvik(int ), (int)22);
        }
        var2 = ji$ParticleKind.c;
        v1 /* !! */  = ji$ParticleKind.em;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - ji$ParticleKind.bvig("bvka", bvid(int ), (int)19));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 205141305: {
                    v2 = ji$ParticleKind.bvig("bvkb", bvid(int ), (int)20);
                    continue block16;
                }
                case 430063449: {
                    v2 = ji$ParticleKind.bvig("bvkc", bvid(int ), (int)21);
                    continue block16;
                }
                case 439231237: {
                    break block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = ji$ParticleKind.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvkd", bvid(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ji$ParticleKind.bvig("bvke", bvik(int ), (int)23)) break;
            v3 /* !! */  = (long)ji$ParticleKind.bvig("bvkf", bvik(int ), (int)24);
        }
        var0_2 = ji$ParticleKind.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 = new ji$ParticleKind[4];
                v5 = ji$ParticleKind.bvig("bvkg", bvik(int ), (int)25);
                v6 /* !! */  = ji$ParticleKind.em;
                if (true) ** GOTO lbl44
                block19: while (true) {
                    v6 /* !! */  = (long)(ji$ParticleKind.bvig("bvki", bvid(int ), (int)24) - ji$ParticleKind.bvig("bvkh", bvid(int ), (int)23));
lbl44:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -292296235: {
                            continue block19;
                        }
                        case 439231237: {
                            break block19;
                        }
                    }
                    break;
                }
                v4[v5] = ji$ParticleKind.AMBIENT;
                v7 = ji$ParticleKind.bvig("bvkj", bvik(int ), (int)26);
                while (true) {
                    if ((v8 = (cfr_temp_2 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvkk", bvid(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == ji$ParticleKind.bvig("bvkl", bvik(int ), (int)27)) break;
                    v8 = -1189875077;
                }
                v4[v7] = ji$ParticleKind.PEARL;
                v9 = ji$ParticleKind.bvig("bvkm", bvik(int ), (int)28);
                while (true) {
                    if ((v10 = (cfr_temp_3 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvkn", bvid(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 == ji$ParticleKind.bvig("bvko", bvik(int ), (int)29)) break;
                    v10 = 455068953;
                }
                v4[v9] = ji$ParticleKind.CRITICAL;
                v11 = ji$ParticleKind.bvig("bvkp", bvik(int ), (int)30);
                while (true) {
                    if ((v12 = (cfr_temp_4 = ji$ParticleKind.em - ji$ParticleKind.bvig("bvkq", bvid(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == ji$ParticleKind.bvig("bvkr", bvik(int ), (int)31)) break;
                    v12 = 1567109921;
                }
                v4[v11] = ji$ParticleKind.TOTEM;
                return v4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvks", bvik(int ), (int)32);
                    if (!var2) break block5;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvkt", bvik(int ), (int)33);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvku", bvik(int ), (int)34);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ji$ParticleKind.bvig("bvkv", bvik(int ), (int)35);
        ** while (!var2)
lbl92:
        // 1 sources

        throw null;
    }
}

