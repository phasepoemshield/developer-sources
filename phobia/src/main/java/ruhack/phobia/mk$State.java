/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class mk$State
extends Enum<mk$State> {
    public static final int b;
    public static final boolean c;
    public static final boolean a;
    public static final /* enum */ mk$State CONNECTING;
    public static final long il = -1431734603938588941L;
    public static final /* enum */ mk$State ONLINE;
    private static long[] dpgi;
    private static int[] dpgm;
    private static final /* synthetic */ mk$State[] $VALUES;
    private static int[] dpgn;
    public static final /* enum */ mk$State OFFLINE;
    private static long[] dpgh;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mk$State() {
        var4_3 /* !! */  = mk$State.b;
        var3_4 = mk$State.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mk$State.dpgj("dphv", dpgl(int ), (int)14);
                    break block0;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var4_3 /* !! */  = (int)mk$State.dpgj("dphw", dpgl(int ), (int)15);
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)mk$State.dpgj("dphx", dpgl(int ), (int)16);
        ** while (true)
    }

    private static /* synthetic */ void dpjb() {
        mk$State.dpgi[0] = 4536580346484618495L;
        mk$State.dpgi[1] = -2193695303565992129L;
        mk$State.dpgi[2] = -7394326243508887523L;
        mk$State.dpgi[3] = -5267206435258590411L;
        mk$State.dpgi[4] = 5936790228380431704L;
        mk$State.dpgi[5] = 588926287647566273L;
        mk$State.dpgi[6] = -463926430378897562L;
        mk$State.dpgi[7] = -5615660209235073124L;
        mk$State.dpgi[8] = -2171596415568765050L;
        mk$State.dpgi[9] = 9153259506872812849L;
        mk$State.dpgi[10] = -2283512204904397105L;
        mk$State.dpgi[11] = 2967089375545359121L;
        mk$State.dpgi[12] = 802691691206419873L;
        mk$State.dpgi[13] = 806627609154645483L;
        mk$State.dpgi[14] = 2231003517988591784L;
        mk$State.dpgi[15] = 8475241287529138587L;
        mk$State.dpgi[16] = -5493994109436302976L;
        mk$State.dpgi[17] = 3525280616064677613L;
        mk$State.dpgi[18] = -3439953250733933073L;
        mk$State.dpgi[19] = -1304205207764549166L;
        mk$State.dpgi[20] = 1894121237583852162L;
        mk$State.dpgi[21] = 2830099405826353263L;
        mk$State.dpgi[22] = -3569924097841022333L;
        mk$State.dpgi[23] = -579075230425133412L;
        mk$State.dpgi[24] = -3586721631644435354L;
        mk$State.dpgi[25] = 1897292011825850436L;
        mk$State.dpgi[26] = 4914149624602048600L;
        mk$State.dpgi[27] = -1264975887511791911L;
        mk$State.dpgi[28] = 2847594461139986662L;
        mk$State.dpgi[29] = 4054514011849279459L;
    }

    private static /* synthetic */ long dpgg(int n2) {
        return dpgh[n2] ^ dpgi[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ mk$State[] $values() {
        block30: {
            block31: {
                v0 /* !! */  = mk$State.il;
                block16: while (true) {
                    switch ((int)v0 /* !! */ ) {
                        case -1617225997: {
                            break block16;
                        }
                        case -869360950: {
                            v0 /* !! */  = (long)(mk$State.dpgj("dphz", dpgg(int ), (int)21) - mk$State.dpgj("dphy", dpgg(int ), (int)20));
                            continue block16;
                        }
                    }
                    break;
                }
                var2 = mk$State.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = mk$State.il - mk$State.dpgj("dpia", dpgg(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == mk$State.dpgj("dpib", dpgl(int ), (int)17)) break;
                    v1 /* !! */  = (long)mk$State.dpgj("dpic", dpgl(int ), (int)18);
                }
                var1_1 /* !! */  = mk$State.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = mk$State.il - mk$State.dpgj("dpid", dpgg(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == mk$State.dpgj("dpie", dpgl(int ), (int)19)) {
                        var0_2 = mk$State.a;
                        if (var2) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)mk$State.dpgj("dpif", dpgl(int ), (int)20);
                }
                if (var0_2 || var0_2) break block31;
                v3 = new mk$State[3];
                v4 = mk$State.dpgj("dpig", dpgl(int ), (int)21);
                ** GOTO lbl36
            }
            if (var1_1 /* !! */  == 0) return null;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: {
                        return null;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        if ((v5 = (cfr_temp_3 = mk$State.il - mk$State.dpgj("dpih", dpgg(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 != mk$State.dpgj("dpii", dpgl(int ), (int)22)) {
                            v5 = -1420339715;
                            continue;
                        }
                        ** GOTO lbl53
                        break;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)mk$State.dpgj("dpit", dpgl(int ), (int)28);
                        cfr_temp_0 = 1;
                        if (var2) {
                            throw null;
                        }
                        break block30;
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)mk$State.dpgj("dpiu", dpgl(int ), (int)29);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl53:
                    // 1 sources

                    v3[v4] = mk$State.CONNECTING;
                    v6 = mk$State.dpgj("dpij", dpgl(int ), (int)23);
                    while (true) {
                        if ((v7 = (cfr_temp_4 = mk$State.il - mk$State.dpgj("dpik", dpgg(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v7 != mk$State.dpgj("dpil", dpgl(int ), (int)24)) ** GOTO lbl62
                        v3[v6] = mk$State.ONLINE;
                        v8 = mk$State.dpgj("dpim", dpgl(int ), (int)25);
                        v9 /* !! */  = mk$State.il;
                        if (true) ** GOTO lbl66
lbl62:
                        // 1 sources

                        v7 = -180262543;
                    }
                    block22: while (true) {
                        v9 /* !! */  = (long)(v10 - mk$State.dpgj("dpin", dpgg(int ), (int)26));
lbl66:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1785798168: {
                                v10 = mk$State.dpgj("dpio", dpgg(int ), (int)27);
                                continue block22;
                            }
                            case -1617225997: {
                                break block22;
                            }
                            case -1313215120: {
                                v10 = mk$State.dpgj("dpip", dpgg(int ), (int)28);
                                continue block22;
                            }
                            case -270408988: {
                                v10 = mk$State.dpgj("dpiq", dpgg(int ), (int)29);
                                continue block22;
                            }
                        }
                        break;
                    }
                    v3[v8] = mk$State.OFFLINE;
                    return v3;
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)mk$State.dpgj("dpir", dpgl(int ), (int)26);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            }
            ** GOTO lbl89
        }
        do {
            if (true) ** continue;
lbl89:
            // 2 sources

            var1_1 /* !! */  = (int)mk$State.dpgj("dpis", dpgl(int ), (int)27);
            cfr_temp_0 = 0;
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void dpiy() {
        mk$State.dpgm[0] = -29588201;
        mk$State.dpgm[1] = 1614083191;
        mk$State.dpgm[2] = -1960862831;
        mk$State.dpgm[3] = -192610387;
        mk$State.dpgm[4] = -118001205;
        mk$State.dpgm[5] = -868284169;
        mk$State.dpgm[6] = -1182390091;
        mk$State.dpgm[7] = 1027262609;
        mk$State.dpgm[8] = 997735494;
        mk$State.dpgm[9] = -480297604;
        mk$State.dpgm[10] = -1600364717;
        mk$State.dpgm[11] = 1138328561;
        mk$State.dpgm[12] = -2087689784;
        mk$State.dpgm[13] = 2128660297;
        mk$State.dpgm[14] = -7145023;
        mk$State.dpgm[15] = 1616543498;
        mk$State.dpgm[16] = -1396453513;
        mk$State.dpgm[17] = -1831148007;
        mk$State.dpgm[18] = -1125716216;
        mk$State.dpgm[19] = 837477420;
        mk$State.dpgm[20] = 1621443116;
        mk$State.dpgm[21] = -1354343598;
        mk$State.dpgm[22] = 1912043687;
        mk$State.dpgm[23] = -1171946698;
        mk$State.dpgm[24] = 750116010;
        mk$State.dpgm[25] = -719440508;
        mk$State.dpgm[26] = -1843992180;
        mk$State.dpgm[27] = -2034192926;
        mk$State.dpgm[28] = 498033197;
        mk$State.dpgm[29] = -652262421;
        mk$State.dpgm[30] = -1776876691;
        mk$State.dpgm[31] = -1349224327;
        mk$State.dpgm[32] = -1649832918;
    }

    static {
        dpgm = new int[33];
        dpgn = new int[33];
        mk$State.dpiy();
        mk$State.dpiz();
        dpgh = new long[30];
        dpgi = new long[30];
        mk$State.dpja();
        mk$State.dpjb();
        CONNECTING = new mk$State();
        ONLINE = new mk$State();
        OFFLINE = new mk$State();
        $VALUES = mk$State.$values();
    }

    private static /* synthetic */ void dpiz() {
        mk$State.dpgn[0] = 29588200;
        mk$State.dpgn[1] = 263712810;
        mk$State.dpgn[2] = 1960862830;
        mk$State.dpgn[3] = -826281005;
        mk$State.dpgn[4] = -118001207;
        mk$State.dpgn[5] = -868284171;
        mk$State.dpgn[6] = -1182390091;
        mk$State.dpgn[7] = 1027262608;
        mk$State.dpgn[8] = -997735495;
        mk$State.dpgn[9] = 1547641860;
        mk$State.dpgn[10] = -1600364717;
        mk$State.dpgn[11] = 1138328563;
        mk$State.dpgn[12] = -2087689783;
        mk$State.dpgn[13] = 2128660299;
        mk$State.dpgn[14] = -7145021;
        mk$State.dpgn[15] = 1616543496;
        mk$State.dpgn[16] = -1396453514;
        mk$State.dpgn[17] = 1831148006;
        mk$State.dpgn[18] = 1743971791;
        mk$State.dpgn[19] = -837477421;
        mk$State.dpgn[20] = 1881759905;
        mk$State.dpgn[21] = -1354343598;
        mk$State.dpgn[22] = 1912043686;
        mk$State.dpgn[23] = -1171946697;
        mk$State.dpgn[24] = -750116011;
        mk$State.dpgn[25] = -719440506;
        mk$State.dpgn[26] = -1843992178;
        mk$State.dpgn[27] = -2034192928;
        mk$State.dpgn[28] = 498033199;
        mk$State.dpgn[29] = -652262424;
        mk$State.dpgn[30] = -1776876691;
        mk$State.dpgn[31] = -1349224328;
        mk$State.dpgn[32] = -1649832920;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mk$State valueOf(String var0) {
        v0 /* !! */  = mk$State.il;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - mk$State.dpgj("dphh", dpgg(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1617225997: {
                    break block19;
                }
                case -1520251429: {
                    v1 = mk$State.dpgj("dphi", dpgg(int ), (int)13);
                    continue block19;
                }
                case -1376016219: {
                    v1 = mk$State.dpgj("dphj", dpgg(int ), (int)14);
                    continue block19;
                }
            }
            break;
        }
        var3_1 = mk$State.c;
        v2 /* !! */  = mk$State.il;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(mk$State.dpgj("dphl", dpgg(int ), (int)16) - mk$State.dpgj("dphk", dpgg(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1617225997: {
                    break block20;
                }
                case -231419776: {
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$State.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mk$State.il;
                if (true) ** GOTO lbl32
                block21: while (true) {
                    v3 /* !! */  = (long)(mk$State.dpgj("dphn", dpgg(int ), (int)18) - mk$State.dpgj("dphm", dpgg(int ), (int)17));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1617225997: {
                            break block21;
                        }
                        case 136365960: {
                            continue block21;
                        }
                    }
                    break;
                }
                var1_3 = mk$State.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mk$State.il - mk$State.dpgj("dpho", dpgg(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$State.dpgj("dphp", dpgl(int ), (int)8)) break;
                    v4 /* !! */  = (long)mk$State.dpgj("dphq", dpgl(int ), (int)9);
                }
                return Enum.valueOf(mk$State.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)mk$State.dpgj("dphr", dpgl(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mk$State.dpgj("dphs", dpgl(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$State.dpgj("dpht", dpgl(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mk$State.dpgj("dphu", dpgl(int ), (int)13);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mk$State[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$State.il - mk$State.dpgj("dpgk", dpgg(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$State.dpgj("dpgo", dpgl(int ), (int)0)) break;
            v0 /* !! */  = (long)mk$State.dpgj("dpgp", dpgl(int ), (int)1);
        }
        var2 = mk$State.c;
        v1 /* !! */  = mk$State.il;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - mk$State.dpgj("dpgq", dpgg(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1838007401: {
                    v2 = mk$State.dpgj("dpgr", dpgg(int ), (int)2);
                    continue block23;
                }
                case -1617225997: {
                    break block23;
                }
                case 631084838: {
                    v2 = mk$State.dpgj("dpgs", dpgg(int ), (int)3);
                    continue block23;
                }
                case 1351120681: {
                    v2 = mk$State.dpgj("dpgt", dpgg(int ), (int)4);
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = mk$State.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$State.il - mk$State.dpgj("dpgu", dpgg(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mk$State.dpgj("dpgv", dpgl(int ), (int)2)) break;
            v3 /* !! */  = (long)mk$State.dpgj("dpgw", dpgl(int ), (int)3);
        }
        var0_2 = mk$State.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = mk$State.il;
                if (true) ** GOTO lbl45
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - mk$State.dpgj("dpgx", dpgg(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1617225997: {
                            break block26;
                        }
                        case -561906207: {
                            v5 = mk$State.dpgj("dpgy", dpgg(int ), (int)7);
                            continue block26;
                        }
                        case -293349127: {
                            v5 = mk$State.dpgj("dpgz", dpgg(int ), (int)8);
                            continue block26;
                        }
                    }
                    break;
                }
                v6 /* !! */  = mk$State.il;
                if (true) ** GOTO lbl58
                block27: while (true) {
                    v6 /* !! */  = (long)(v7 - mk$State.dpgj("dpha", dpgg(int ), (int)9));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1617225997: {
                            break block27;
                        }
                        case -1004921977: {
                            v7 = mk$State.dpgj("dphb", dpgg(int ), (int)10);
                            continue block27;
                        }
                        case -474334505: {
                            v7 = mk$State.dpgj("dphc", dpgg(int ), (int)11);
                            continue block27;
                        }
                    }
                    break;
                }
                return (mk$State[])mk$State.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)mk$State.dpgj("dphd", dpgl(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 1: {
                var1_1 /* !! */  = (int)mk$State.dpgj("dphe", dpgl(int ), (int)5);
                if (var2) {
                    throw null;
                }
            }
lbl77:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)mk$State.dpgj("dphf", dpgl(int ), (int)6);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)mk$State.dpgj("dphg", dpgl(int ), (int)7);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void dpja() {
        mk$State.dpgh[0] = 2008587419308156398L;
        mk$State.dpgh[1] = 8416210607206229251L;
        mk$State.dpgh[2] = 5759187572746893925L;
        mk$State.dpgh[3] = -950244334713217449L;
        mk$State.dpgh[4] = -8706303062406922861L;
        mk$State.dpgh[5] = 2844283464038066342L;
        mk$State.dpgh[6] = 6487662662332174736L;
        mk$State.dpgh[7] = 2456507674555111772L;
        mk$State.dpgh[8] = -1949274458712619082L;
        mk$State.dpgh[9] = -1847643763839266738L;
        mk$State.dpgh[10] = -6545240450387952899L;
        mk$State.dpgh[11] = 2302972248210135647L;
        mk$State.dpgh[12] = -458565105587833687L;
        mk$State.dpgh[13] = -7112530325625389314L;
        mk$State.dpgh[14] = 716724511728577814L;
        mk$State.dpgh[15] = -6114142816665760844L;
        mk$State.dpgh[16] = 2097729284774693789L;
        mk$State.dpgh[17] = 1821865275017178742L;
        mk$State.dpgh[18] = 6840969401393601317L;
        mk$State.dpgh[19] = -6930836108418310334L;
        mk$State.dpgh[20] = -6137150501499702291L;
        mk$State.dpgh[21] = -4181890724870865732L;
        mk$State.dpgh[22] = -5595992181774818558L;
        mk$State.dpgh[23] = 1984837616488642304L;
        mk$State.dpgh[24] = 2946000152568640668L;
        mk$State.dpgh[25] = 5201735366949232283L;
        mk$State.dpgh[26] = -9203369607191296479L;
        mk$State.dpgh[27] = 2287751592271979569L;
        mk$State.dpgh[28] = 493243977064843194L;
        mk$State.dpgh[29] = -5072860840978748350L;
    }

    private static /* synthetic */ int dpgl(int n2) {
        return dpgm[n2] ^ dpgn[n2];
    }

    public static /* synthetic */ CallSite dpgj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

