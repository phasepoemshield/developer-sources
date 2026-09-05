/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public final class om {
    private static int[] lxyi;
    private static final ByteBuffer[] BUFFERS;
    public static final int b;
    public static final long us = -4879965096281058368L;
    public static final boolean c;
    private static int[] lxyh;
    private static long[] lxyp;
    private static long[] lxyo;
    public static final boolean a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private om() {
        int n2 = b;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                CallSite callSite = om.lxyj("lxyk", lxyg(int ), (int)0);
                break;
            }
            case 1: {
                CallSite callSite = om.lxyj("lxyl", lxyg(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = om.lxyj("lxym", lxyg(int ), (int)2);
        }
    }

    private static /* synthetic */ void lycd() {
        om.lxyh[0] = -1966166128;
        om.lxyh[1] = 1096383326;
        om.lxyh[2] = 304348911;
        om.lxyh[3] = 1998285442;
        om.lxyh[4] = -285050988;
        om.lxyh[5] = 1684760547;
        om.lxyh[6] = 1029952986;
        om.lxyh[7] = 1238194449;
        om.lxyh[8] = 10678093;
        om.lxyh[9] = 2038160999;
        om.lxyh[10] = 1714130689;
        om.lxyh[11] = -534004960;
        om.lxyh[12] = -2060436145;
        om.lxyh[13] = 1063862243;
        om.lxyh[14] = -446622118;
        om.lxyh[15] = 457501793;
        om.lxyh[16] = -1816896102;
        om.lxyh[17] = -596505851;
        om.lxyh[18] = -1065833655;
        om.lxyh[19] = -1512355334;
        om.lxyh[20] = -1002276605;
        om.lxyh[21] = 2075864831;
        om.lxyh[22] = -722963598;
        om.lxyh[23] = -1601801165;
        om.lxyh[24] = -1989240317;
        om.lxyh[25] = 729611083;
        om.lxyh[26] = 342426231;
        om.lxyh[27] = 132384304;
        om.lxyh[28] = 396298956;
        om.lxyh[29] = 246510998;
        om.lxyh[30] = -1871928410;
        om.lxyh[31] = 1513702383;
        om.lxyh[32] = -355830583;
        om.lxyh[33] = -1316695811;
        om.lxyh[34] = -632524581;
        om.lxyh[35] = 1472323882;
        om.lxyh[36] = -145318338;
        om.lxyh[37] = 988193985;
        om.lxyh[38] = -1910442831;
        om.lxyh[39] = -892504781;
        om.lxyh[40] = 1195725944;
        om.lxyh[41] = 214139001;
        om.lxyh[42] = -1922255423;
        om.lxyh[43] = 1582522336;
        om.lxyh[44] = 1753903292;
        om.lxyh[45] = 297947101;
        om.lxyh[46] = -131456;
        om.lxyh[47] = -2097182334;
        om.lxyh[48] = 1391387716;
        om.lxyh[49] = 954342622;
        om.lxyh[50] = -2121905617;
        om.lxyh[51] = 1986232967;
        om.lxyh[52] = 2096686926;
        om.lxyh[53] = -621283262;
        om.lxyh[54] = 2137838028;
        om.lxyh[55] = 1579619929;
        om.lxyh[56] = 1427387807;
        om.lxyh[57] = -533506226;
        om.lxyh[58] = 433349849;
    }

    public static /* synthetic */ CallSite lxyj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int nextCapacity(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = om.us - om.lxyj("lyay", lxyn(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == om.lxyj("lyaz", lxyg(int ), (int)37)) break;
            v0 /* !! */  = (long)om.lxyj("lyba", lxyg(int ), (int)38);
        }
        var4_1 = om.c;
        v1 /* !! */  = om.us;
        if (true) ** GOTO lbl12
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - om.lxyj("lybb", lxyn(int ), (int)27));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1612917824: {
                    break block28;
                }
                case -624718156: {
                    v2 = om.lxyj("lybc", lxyn(int ), (int)28);
                    continue block28;
                }
                case -486329906: {
                    v2 = om.lxyj("lybd", lxyn(int ), (int)29);
                    continue block28;
                }
            }
            break;
        }
        var3_2 /* !! */  = om.b;
        v3 /* !! */  = om.us;
        if (true) ** GOTO lbl26
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - om.lxyj("lybe", lxyn(int ), (int)30));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1612917824: {
                    break block29;
                }
                case -1393427666: {
                    v4 = om.lxyj("lybf", lxyn(int ), (int)31);
                    continue block29;
                }
                case 665604878: {
                    v4 = om.lxyj("lybg", lxyn(int ), (int)32);
                    continue block29;
                }
                case 762502263: {
                    v4 = om.lxyj("lybh", lxyn(int ), (int)33);
                    continue block29;
                }
            }
            break;
        }
        var2_3 = om.a;
        if (var4_1) {
            throw null;
lbl41:
            // 7 sources

            return (int)om.lxyj("lybi", lxyg(int ), (int)39);
        }
        if (var2_3 || var2_3) ** GOTO lbl41
        var1_4 = om.lxyj("lybj", lxyg(int ), (int)40);
        if (var2_3) ** GOTO lbl41
        block31: while (true) {
            if (var2_3 || var2_3) ** GOTO lbl41
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_4 >= var0) ** GOTO lbl59
                    if (var2_3) ** GOTO lbl41
                    if (var1_4 >= om.lxyj("lybk", lxyg(int ), (int)41)) ** GOTO lbl59
                    if (var2_3 || var2_3) ** GOTO lbl41
                    var1_4 <<= om.lxyj("lybl", lxyg(int ), (int)42);
                    if (var2_3) ** GOTO lbl41
                    if (!var4_1) continue block31;
                    throw null;
lbl59:
                    // 2 sources

                    if (!var2_3 && !var2_3) ** break;
                    ** continue;
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = om.us - om.lxyj("lybm", lxyn(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == om.lxyj("lybn", lxyg(int ), (int)43)) break;
                        v5 /* !! */  = (long)om.lxyj("lybo", lxyg(int ), (int)44);
                    }
                    return Math.max(var0, (int)var1_4);
                }
lbl68:
                // 3 sources

                case 0: {
                    var3_2 /* !! */  = (int)om.lxyj("lybp", lxyg(int ), (int)45);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl123
                }
                case 1: {
                    var3_2 /* !! */  = (int)om.lxyj("lybq", lxyg(int ), (int)46);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl93
                }
lbl78:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)om.lxyj("lybr", lxyg(int ), (int)47);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl93
                        break;
                    }
                }
                case 3: {
                    do {
                        var3_2 /* !! */  = (int)om.lxyj("lybs", lxyg(int ), (int)48);
                    } while (!var4_1);
                    throw null;
                }
                case 4: {
                    var3_2 /* !! */  = (int)om.lxyj("lybt", lxyg(int ), (int)49);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl93:
                // 6 sources

                case 5: {
                    var3_2 /* !! */  = (int)om.lxyj("lybu", lxyg(int ), (int)50);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
lbl98:
                // 2 sources

                case 6: {
                    do {
                        var3_2 /* !! */  = (int)om.lxyj("lybv", lxyg(int ), (int)51);
                    } while (!var4_1);
                    throw null;
                }
                case 7: {
                    var3_2 /* !! */  = (int)om.lxyj("lybw", lxyg(int ), (int)52);
                    if (!var4_1) ** GOTO lbl68
                    throw null;
                }
                case 8: {
                    var3_2 /* !! */  = (int)om.lxyj("lybx", lxyg(int ), (int)53);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl111:
                // 4 sources

                case 9: {
                    var3_2 /* !! */  = (int)om.lxyj("lyby", lxyg(int ), (int)54);
                    if (!var4_1) ** GOTO lbl78
                    throw null;
                }
                case 10: {
                    var3_2 /* !! */  = (int)om.lxyj("lybz", lxyg(int ), (int)55);
                    if (!var4_1) ** GOTO lbl68
                    throw null;
                }
                case 11: {
                    var3_2 /* !! */  = (int)om.lxyj("lyca", lxyg(int ), (int)56);
                    if (!var4_1) ** GOTO lbl93
                    throw null;
                }
lbl123:
                // 2 sources

                case 12: {
                    var3_2 /* !! */  = (int)om.lxyj("lycb", lxyg(int ), (int)57);
                    if (!var4_1) ** GOTO lbl98
                    throw null;
                }
                case 13: 
            }
            break;
        }
        var3_2 /* !! */  = (int)om.lxyj("lycc", lxyg(int ), (int)58);
        ** while (!var4_1)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lyce() {
        om.lxyi[0] = -1966166127;
        om.lxyi[1] = 1096383327;
        om.lxyi[2] = 304348910;
        om.lxyi[3] = 1998285443;
        om.lxyi[4] = -1569838326;
        om.lxyi[5] = -1684760548;
        om.lxyi[6] = 1951073403;
        om.lxyi[7] = -1238194450;
        om.lxyi[8] = -403996804;
        om.lxyi[9] = -2038161000;
        om.lxyi[10] = -206864776;
        om.lxyi[11] = 534004959;
        om.lxyi[12] = 1825198017;
        om.lxyi[13] = 1063862263;
        om.lxyi[14] = -446622136;
        om.lxyi[15] = 457501795;
        om.lxyi[16] = -1816896098;
        om.lxyi[17] = -596505840;
        om.lxyi[18] = -1065833652;
        om.lxyi[19] = -1512355349;
        om.lxyi[20] = -1002276591;
        om.lxyi[21] = 2075864828;
        om.lxyi[22] = -722963611;
        om.lxyi[23] = -1601801181;
        om.lxyi[24] = -1989240302;
        om.lxyi[25] = 729611081;
        om.lxyi[26] = 342426213;
        om.lxyi[27] = 132384314;
        om.lxyi[28] = 396298972;
        om.lxyi[29] = 246510978;
        om.lxyi[30] = -1871928393;
        om.lxyi[31] = 1513702395;
        om.lxyi[32] = -355830566;
        om.lxyi[33] = -1316695816;
        om.lxyi[34] = -632524583;
        om.lxyi[35] = 1472323886;
        om.lxyi[36] = -145318347;
        om.lxyi[37] = -988193986;
        om.lxyi[38] = -223548243;
        om.lxyi[39] = -788661633;
        om.lxyi[40] = 1195726200;
        om.lxyi[41] = 1287880825;
        om.lxyi[42] = -1922255424;
        om.lxyi[43] = -1582522337;
        om.lxyi[44] = 807623855;
        om.lxyi[45] = 297947094;
        om.lxyi[46] = -131453;
        om.lxyi[47] = -2097182334;
        om.lxyi[48] = 1391387726;
        om.lxyi[49] = 954342622;
        om.lxyi[50] = -2121905626;
        om.lxyi[51] = 1986232972;
        om.lxyi[52] = 2096686916;
        om.lxyi[53] = -621283256;
        om.lxyi[54] = 2137838017;
        om.lxyi[55] = 1579619925;
        om.lxyi[56] = 1427387794;
        om.lxyi[57] = -533506232;
        om.lxyi[58] = 433349848;
    }

    private static /* synthetic */ int lxyg(int n2) {
        return lxyh[n2] ^ lxyi[n2];
    }

    private static /* synthetic */ void lycg() {
        om.lxyp[0] = 6720071825728226818L;
        om.lxyp[1] = -775859264306423525L;
        om.lxyp[2] = -5002634860567790872L;
        om.lxyp[3] = 887737314686030665L;
        om.lxyp[4] = 7144756065492429378L;
        om.lxyp[5] = -5845609404596037994L;
        om.lxyp[6] = 7763982536008875827L;
        om.lxyp[7] = -7956548123649698569L;
        om.lxyp[8] = 3431600648319175840L;
        om.lxyp[9] = 7233661061015951842L;
        om.lxyp[10] = -9142802981823551498L;
        om.lxyp[11] = 8959499890504046884L;
        om.lxyp[12] = -1676096850443909611L;
        om.lxyp[13] = -6509079283486419216L;
        om.lxyp[14] = -7031704326431657077L;
        om.lxyp[15] = -2240830156630164166L;
        om.lxyp[16] = -6009931750182527995L;
        om.lxyp[17] = 7013402288825397829L;
        om.lxyp[18] = 999503085567317249L;
        om.lxyp[19] = 2740065238093651912L;
        om.lxyp[20] = -1788816297020877157L;
        om.lxyp[21] = 3974855586339174700L;
        om.lxyp[22] = -5121191766467998641L;
        om.lxyp[23] = 3189930677075279259L;
        om.lxyp[24] = 3844931286581346545L;
        om.lxyp[25] = 292892102470111318L;
        om.lxyp[26] = 1364343043197229831L;
        om.lxyp[27] = 7848219500345203768L;
        om.lxyp[28] = 1201837794621899179L;
        om.lxyp[29] = -3303051097259097267L;
        om.lxyp[30] = -6794448178566855785L;
        om.lxyp[31] = 4928001472910315400L;
        om.lxyp[32] = 2525770317650684007L;
        om.lxyp[33] = -7381809299391705286L;
        om.lxyp[34] = 1463728860823906464L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ByteBuffer acquire(int var0, int var1_1) {
        block94: {
            block95: {
                block93: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = om.us - om.lxyj("lxyq", lxyn(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == om.lxyj("lxyr", lxyg(int ), (int)3)) break;
                        v0 /* !! */  = (long)om.lxyj("lxys", lxyg(int ), (int)4);
                    }
                    var5_2 = om.c;
                    v1 /* !! */  = om.us;
                    if (true) ** GOTO lbl11
                    block60: while (true) {
                        v1 /* !! */  = (long)(v2 - om.lxyj("lxyt", lxyn(int ), (int)1));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1670781251: {
                                v2 = om.lxyj("lxyu", lxyn(int ), (int)2);
                                continue block60;
                            }
                            case -1612917824: {
                                break block60;
                            }
                            case -1446833628: {
                                v2 = om.lxyj("lxyv", lxyn(int ), (int)3);
                                continue block60;
                            }
                            case -1058722079: {
                                v2 = om.lxyj("lxyw", lxyn(int ), (int)4);
                                continue block60;
                            }
                        }
                        break;
                    }
                    var4_3 /* !! */  = om.b;
                    v3 /* !! */  = om.us;
                    if (true) ** GOTO lbl28
                    block61: while (true) {
                        v3 /* !! */  = (long)(v4 - om.lxyj("lxyx", lxyn(int ), (int)5));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -2133218592: {
                                v4 = om.lxyj("lxyy", lxyn(int ), (int)6);
                                continue block61;
                            }
                            case -1692504046: {
                                v4 = om.lxyj("lxyz", lxyn(int ), (int)7);
                                continue block61;
                            }
                            case -1612917824: {
                                break block61;
                            }
                        }
                        break;
                    }
                    var3_4 = om.a;
                    if (var5_2) {
                        throw null;
lbl40:
                        // 13 sources

                        return null;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl40
                    v5 /* !! */  = om.us;
                    if (true) ** GOTO lbl47
                    block63: while (true) {
                        v5 /* !! */  = (long)(v6 - om.lxyj("lxza", lxyn(int ), (int)8));
lbl47:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1612917824: {
                                break block63;
                            }
                            case -509531023: {
                                v6 = om.lxyj("lxzb", lxyn(int ), (int)9);
                                continue block63;
                            }
                            case 1700849219: {
                                v6 = om.lxyj("lxzc", lxyn(int ), (int)10);
                                continue block63;
                            }
                        }
                        break;
                    }
                    var2_5 = om.BUFFERS[var0];
                    if (var3_4 || var3_4) ** GOTO lbl40
                    if (var2_5 == null) break block93;
                    if (var3_4) ** GOTO lbl40
                    v7 /* !! */  = om.us;
                    if (true) ** GOTO lbl64
                    block64: while (true) {
                        v7 /* !! */  = (long)(v8 - om.lxyj("lxzd", lxyn(int ), (int)11));
lbl64:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1612917824: {
                                break block64;
                            }
                            case -1178712918: {
                                v8 = om.lxyj("lxze", lxyn(int ), (int)12);
                                continue block64;
                            }
                            case 1581170146: {
                                v8 = om.lxyj("lxzf", lxyn(int ), (int)13);
                                continue block64;
                            }
                        }
                        break;
                    }
                    if (var2_5.capacity() >= var1_1) break block94;
                    if (var3_4) ** GOTO lbl40
                }
                if (var3_4 || var3_4) ** GOTO lbl40
                if (var2_5 == null) break block95;
                if (var3_4 || var3_4) ** GOTO lbl40
                v9 /* !! */  = om.us;
                if (true) ** GOTO lbl83
                block65: while (true) {
                    v9 /* !! */  = (long)(v10 - om.lxyj("lxzg", lxyn(int ), (int)14));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1751642773: {
                            v10 = om.lxyj("lxzh", lxyn(int ), (int)15);
                            continue block65;
                        }
                        case -1612917824: {
                            break block65;
                        }
                        case -545064670: {
                            v10 = om.lxyj("lxzi", lxyn(int ), (int)16);
                            continue block65;
                        }
                        case 829873405: {
                            v10 = om.lxyj("lxzj", lxyn(int ), (int)17);
                            continue block65;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)var2_5);
                if (var3_4) ** GOTO lbl40
            }
            if (var3_4 || var3_4) ** GOTO lbl40
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_1 = om.us - om.lxyj("lxzk", lxyn(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == om.lxyj("lxzl", lxyg(int ), (int)5)) break;
                v11 /* !! */  = (long)om.lxyj("lxzm", lxyg(int ), (int)6);
            }
            v12 = om.nextCapacity(var1_1);
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_2 = om.us - om.lxyj("lxzn", lxyn(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == om.lxyj("lxzo", lxyg(int ), (int)7)) break;
                v13 /* !! */  = (long)om.lxyj("lxzp", lxyg(int ), (int)8);
            }
            var2_5 = MemoryUtil.memAlloc((int)v12);
            if (var3_4 || var3_4) ** GOTO lbl40
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = om.us - om.lxyj("lxzq", lxyn(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == om.lxyj("lxzr", lxyg(int ), (int)9)) break;
                v14 /* !! */  = (long)om.lxyj("lxzs", lxyg(int ), (int)10);
            }
            om.BUFFERS[var0] = var2_5;
            if (var3_4) ** GOTO lbl40
        }
        if (var3_4 || var3_4) ** GOTO lbl40
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = om.us - om.lxyj("lxzt", lxyn(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == om.lxyj("lxzu", lxyg(int ), (int)11)) break;
            v15 /* !! */  = (long)om.lxyj("lxzv", lxyg(int ), (int)12);
        }
        var2_5.clear();
        if (var3_4 || var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v16 /* !! */  = om.us;
                if (true) ** GOTO lbl135
                block70: while (true) {
                    v16 /* !! */  = (long)(v17 - om.lxyj("lxzw", lxyn(int ), (int)22));
lbl135:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1612917824: {
                            break block70;
                        }
                        case -1417313090: {
                            v17 = om.lxyj("lxzx", lxyn(int ), (int)23);
                            continue block70;
                        }
                        case -590475590: {
                            v17 = om.lxyj("lxzy", lxyn(int ), (int)24);
                            continue block70;
                        }
                        case 1564039532: {
                            v17 = om.lxyj("lxzz", lxyn(int ), (int)25);
                            continue block70;
                        }
                    }
                    break;
                }
                var2_5.limit(var1_1);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return var2_5;
            }
            case 0: {
                var4_3 /* !! */  = (int)om.lxyj("lyaa", lxyg(int ), (int)13);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 1: {
                var4_3 /* !! */  = (int)om.lxyj("lyab", lxyg(int ), (int)14);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl162:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)om.lxyj("lyac", lxyg(int ), (int)15);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl167:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)om.lxyj("lyad", lxyg(int ), (int)16);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl172:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)om.lxyj("lyae", lxyg(int ), (int)17);
                if (!var5_2) ** GOTO lbl167
                throw null;
            }
lbl176:
            // 4 sources

            case 5: {
                var4_3 /* !! */  = (int)om.lxyj("lyaf", lxyg(int ), (int)18);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 6: {
                var4_3 /* !! */  = (int)om.lxyj("lyag", lxyg(int ), (int)19);
                if (var5_2) {
                    throw null;
                }
            }
lbl185:
            // 4 sources

            case 7: {
                var4_3 /* !! */  = (int)om.lxyj("lyah", lxyg(int ), (int)20);
                if (!var5_2) break;
                throw null;
            }
lbl189:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)om.lxyj("lyai", lxyg(int ), (int)21);
                if (!var5_2) ** GOTO lbl162
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)om.lxyj("lyaj", lxyg(int ), (int)22);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl198:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)om.lxyj("lyak", lxyg(int ), (int)23);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 11: {
                var4_3 /* !! */  = (int)om.lxyj("lyal", lxyg(int ), (int)24);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl208:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)om.lxyj("lyam", lxyg(int ), (int)25);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)om.lxyj("lyan", lxyg(int ), (int)26);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 14: {
                var4_3 /* !! */  = (int)om.lxyj("lyao", lxyg(int ), (int)27);
                if (!var5_2) ** GOTO lbl176
                throw null;
            }
lbl221:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)om.lxyj("lyap", lxyg(int ), (int)28);
                if (!var5_2) ** GOTO lbl208
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)om.lxyj("lyaq", lxyg(int ), (int)29);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 17: {
                var4_3 /* !! */  = (int)om.lxyj("lyar", lxyg(int ), (int)30);
                if (!var5_2) ** GOTO lbl208
                throw null;
            }
lbl234:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)om.lxyj("lyas", lxyg(int ), (int)31);
                if (!var5_2) ** GOTO lbl189
                throw null;
            }
lbl238:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)om.lxyj("lyat", lxyg(int ), (int)32);
                if (!var5_2) ** GOTO lbl162
                throw null;
            }
lbl242:
            // 2 sources

            case 20: {
                do {
                    var4_3 /* !! */  = (int)om.lxyj("lyau", lxyg(int ), (int)33);
                } while (!var5_2);
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)om.lxyj("lyav", lxyg(int ), (int)34);
                if (!var5_2) ** GOTO lbl198
                throw null;
            }
lbl251:
            // 4 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)om.lxyj("lyaw", lxyg(int ), (int)35);
                    if (!var5_2) ** GOTO lbl172
                    throw null;
                }
            }
            case 23: 
        }
        var4_3 /* !! */  = (int)om.lxyj("lyax", lxyg(int ), (int)36);
        ** while (!var5_2)
lbl259:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lxyn(int n2) {
        return lxyo[n2] ^ lxyp[n2];
    }

    private static /* synthetic */ void lycf() {
        om.lxyo[0] = -4141412152937833213L;
        om.lxyo[1] = 6746742529335414293L;
        om.lxyo[2] = -5699982081449958808L;
        om.lxyo[3] = -5151842478588232264L;
        om.lxyo[4] = -6889102516441434258L;
        om.lxyo[5] = 8706694779447218758L;
        om.lxyo[6] = -1647428287503131747L;
        om.lxyo[7] = -2033266605315456935L;
        om.lxyo[8] = 984528431642754504L;
        om.lxyo[9] = 6772003568167498538L;
        om.lxyo[10] = 305014943537940555L;
        om.lxyo[11] = 3424947525816433127L;
        om.lxyo[12] = -4333501112105196886L;
        om.lxyo[13] = 7503755947609142373L;
        om.lxyo[14] = 2401893676184574103L;
        om.lxyo[15] = -1495503360178917705L;
        om.lxyo[16] = -508761618600482955L;
        om.lxyo[17] = 8911176237803621279L;
        om.lxyo[18] = 950068978212465976L;
        om.lxyo[19] = 258942956973820836L;
        om.lxyo[20] = -2634995236792038299L;
        om.lxyo[21] = 2791580909433542091L;
        om.lxyo[22] = 1092115425888228492L;
        om.lxyo[23] = -3814303667583245417L;
        om.lxyo[24] = -4813581977986773347L;
        om.lxyo[25] = -744714642279426137L;
        om.lxyo[26] = 8761331427494656505L;
        om.lxyo[27] = 3210690738329822686L;
        om.lxyo[28] = -5455886328547782449L;
        om.lxyo[29] = 5409495021454306682L;
        om.lxyo[30] = -4342644236555797806L;
        om.lxyo[31] = -7947065687659682387L;
        om.lxyo[32] = 2570373579225501202L;
        om.lxyo[33] = -7690293720113206892L;
        om.lxyo[34] = -2373176061118079462L;
    }

    static {
        lxyh = new int[59];
        lxyi = new int[59];
        om.lycd();
        om.lyce();
        lxyo = new long[35];
        lxyp = new long[35];
        om.lycf();
        om.lycg();
        BUFFERS = new ByteBuffer[4];
    }
}

