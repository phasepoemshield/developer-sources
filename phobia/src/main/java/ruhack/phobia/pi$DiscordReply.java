/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class pi$DiscordReply
extends Enum<pi$DiscordReply> {
    private static int[] svy;
    private static long[] svi;
    private static int[] svx;
    public static final boolean a;
    public static final long bc = 1108405621095755309L;
    public static final int b;
    public static final /* enum */ pi$DiscordReply IGNORE;
    public static final /* enum */ pi$DiscordReply NO;
    private static final /* synthetic */ pi$DiscordReply[] $VALUES;
    public final int reply;
    private static long[] svh;
    public static final boolean c;
    public static final /* enum */ pi$DiscordReply YES;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private pi$DiscordReply(int var3_3) {
        var5_4 /* !! */  = pi$DiscordReply.b;
        var4_5 = pi$DiscordReply.a;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                this.reply = var3_3;
                return;
            }
lbl9:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)pi$DiscordReply.svj("swt", svw(int ), (int)12);
                break;
            }
            case 1: {
                var5_4 /* !! */  = (int)pi$DiscordReply.svj("swu", svw(int ), (int)13);
                ** GOTO lbl9
            }
            case 2: {
                var5_4 /* !! */  = (int)pi$DiscordReply.svj("swv", svw(int ), (int)14);
                ** GOTO lbl9
            }
            case 3: 
        }
        while (true) {
            var5_4 /* !! */  = (int)pi$DiscordReply.svj("sww", svw(int ), (int)15);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pi$DiscordReply[] values() {
        v0 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(pi$DiscordReply.svj("svl", svg(int ), (int)1) - pi$DiscordReply.svj("svk", svg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -625386008: {
                    continue block28;
                }
                case 813002285: {
                    break block28;
                }
            }
            break;
        }
        var2 = pi$DiscordReply.c;
        v1 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(pi$DiscordReply.svj("svn", svg(int ), (int)3) - pi$DiscordReply.svj("svm", svg(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1010823268: {
                    continue block29;
                }
                case 813002285: {
                    break block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = pi$DiscordReply.b;
        v2 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl25
        block30: while (true) {
            v2 /* !! */  = (long)(pi$DiscordReply.svj("svp", svg(int ), (int)5) - pi$DiscordReply.svj("svo", svg(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 811291855: {
                    continue block30;
                }
                case 813002285: {
                    break block30;
                }
            }
            break;
        }
        var0_2 = pi$DiscordReply.a;
        if (var2) {
            throw null;
lbl33:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl36:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl43
                block32: while (true) {
                    v3 /* !! */  = (long)(pi$DiscordReply.svj("svr", svg(int ), (int)7) - pi$DiscordReply.svj("svq", svg(int ), (int)6));
lbl43:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -651578889: {
                            continue block32;
                        }
                        case 813002285: {
                            break block32;
                        }
                    }
                    break;
                }
                v4 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl52
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - pi$DiscordReply.svj("svs", svg(int ), (int)8));
lbl52:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -507221092: {
                            v5 = pi$DiscordReply.svj("svt", svg(int ), (int)9);
                            continue block33;
                        }
                        case 304156748: {
                            v5 = pi$DiscordReply.svj("svu", svg(int ), (int)10);
                            continue block33;
                        }
                        case 813002285: {
                            break block33;
                        }
                        case 2141049093: {
                            v5 = pi$DiscordReply.svj("svv", svg(int ), (int)11);
                            continue block33;
                        }
                    }
                    break;
                }
                return (pi$DiscordReply[])pi$DiscordReply.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)pi$DiscordReply.svj("svz", svw(int ), (int)0);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)pi$DiscordReply.svj("swa", svw(int ), (int)1);
                } while (!var2);
                throw null;
            }
lbl75:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)pi$DiscordReply.svj("swb", svw(int ), (int)2);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)pi$DiscordReply.svj("swc", svw(int ), (int)3);
        ** while (!var2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static pi$DiscordReply[] getReplies() {
        v0 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(pi$DiscordReply.svj("swy", svg(int ), (int)21) - pi$DiscordReply.svj("swx", svg(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 813002285: {
                    break block20;
                }
                case 1846404483: {
                    continue block20;
                }
            }
            break;
        }
        var2 = pi$DiscordReply.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = pi$DiscordReply.bc - pi$DiscordReply.svj("swz", svg(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pi$DiscordReply.svj("sxa", svw(int ), (int)16)) break;
            v1 /* !! */  = (long)pi$DiscordReply.svj("sxb", svw(int ), (int)17);
        }
        var1_1 /* !! */  = pi$DiscordReply.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = pi$DiscordReply.bc - pi$DiscordReply.svj("sxc", svg(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pi$DiscordReply.svj("sxd", svw(int ), (int)18)) break;
            v2 /* !! */  = (long)pi$DiscordReply.svj("sxe", svw(int ), (int)19);
        }
        var0_2 = pi$DiscordReply.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 = new pi$DiscordReply[3];
                v4 = pi$DiscordReply.svj("sxf", svw(int ), (int)20);
                while (true) {
                    if ((v5 = (cfr_temp_2 = pi$DiscordReply.bc - pi$DiscordReply.svj("sxg", svg(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 == pi$DiscordReply.svj("sxh", svw(int ), (int)21)) break;
                    v5 = 1338975037;
                }
                v3[v4] = pi$DiscordReply.NO;
                v6 = pi$DiscordReply.svj("sxi", svw(int ), (int)22);
                v7 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    v7 /* !! */  = (long)(v8 - pi$DiscordReply.svj("sxj", svg(int ), (int)25));
lbl48:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1629404554: {
                            v8 = pi$DiscordReply.svj("sxk", svg(int ), (int)26);
                            continue block25;
                        }
                        case -90555213: {
                            v8 = pi$DiscordReply.svj("sxl", svg(int ), (int)27);
                            continue block25;
                        }
                        case 813002285: {
                            break block25;
                        }
                        case 1682895121: {
                            v8 = pi$DiscordReply.svj("sxm", svg(int ), (int)28);
                            continue block25;
                        }
                    }
                    break;
                }
                v3[v6] = pi$DiscordReply.YES;
                v9 = pi$DiscordReply.svj("sxn", svw(int ), (int)23);
                v10 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl66
                block26: while (true) {
                    v10 /* !! */  = (long)(pi$DiscordReply.svj("sxp", svg(int ), (int)30) - pi$DiscordReply.svj("sxo", svg(int ), (int)29));
lbl66:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1540132073: {
                            continue block26;
                        }
                        case 813002285: {
                            break block26;
                        }
                    }
                    break;
                }
                v3[v9] = pi$DiscordReply.IGNORE;
                return v3;
            }
            case 0: {
                var1_1 /* !! */  = (int)pi$DiscordReply.svj("sxq", svw(int ), (int)24);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)pi$DiscordReply.svj("sxr", svw(int ), (int)25);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)pi$DiscordReply.svj("sxs", svw(int ), (int)26);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)pi$DiscordReply.svj("sxt", svw(int ), (int)27);
        ** while (!var2)
lbl90:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void syz() {
        pi$DiscordReply.svx[0] = 115013530;
        pi$DiscordReply.svx[1] = -1301857310;
        pi$DiscordReply.svx[2] = 1084131628;
        pi$DiscordReply.svx[3] = -2037998325;
        pi$DiscordReply.svx[4] = -1408744082;
        pi$DiscordReply.svx[5] = -1117621371;
        pi$DiscordReply.svx[6] = 1292669600;
        pi$DiscordReply.svx[7] = 1653844523;
        pi$DiscordReply.svx[8] = -532452992;
        pi$DiscordReply.svx[9] = 63239537;
        pi$DiscordReply.svx[10] = 1412531545;
        pi$DiscordReply.svx[11] = -1526700391;
        pi$DiscordReply.svx[12] = 1606145781;
        pi$DiscordReply.svx[13] = 671086944;
        pi$DiscordReply.svx[14] = -2140226164;
        pi$DiscordReply.svx[15] = -1679887600;
        pi$DiscordReply.svx[16] = -131658679;
        pi$DiscordReply.svx[17] = -1258151231;
        pi$DiscordReply.svx[18] = -1087223039;
        pi$DiscordReply.svx[19] = 1099447516;
        pi$DiscordReply.svx[20] = -915552862;
        pi$DiscordReply.svx[21] = -404575865;
        pi$DiscordReply.svx[22] = 479227464;
        pi$DiscordReply.svx[23] = 35984403;
        pi$DiscordReply.svx[24] = 1679374412;
        pi$DiscordReply.svx[25] = 1873713579;
        pi$DiscordReply.svx[26] = 2100105195;
        pi$DiscordReply.svx[27] = -973769172;
        pi$DiscordReply.svx[28] = 514722011;
        pi$DiscordReply.svx[29] = -2118878589;
        pi$DiscordReply.svx[30] = 1756162256;
        pi$DiscordReply.svx[31] = 190751491;
        pi$DiscordReply.svx[32] = 169014078;
        pi$DiscordReply.svx[33] = 1962421842;
        pi$DiscordReply.svx[34] = -1055382683;
        pi$DiscordReply.svx[35] = 727973340;
        pi$DiscordReply.svx[36] = 982970903;
        pi$DiscordReply.svx[37] = -1747869106;
        pi$DiscordReply.svx[38] = -660663472;
        pi$DiscordReply.svx[39] = 1956883128;
        pi$DiscordReply.svx[40] = 864762941;
        pi$DiscordReply.svx[41] = 114145735;
        pi$DiscordReply.svx[42] = 1560786259;
        pi$DiscordReply.svx[43] = -1761875870;
    }

    private static /* synthetic */ long svg(int n2) {
        return svh[n2] ^ svi[n2];
    }

    private static /* synthetic */ void szc() {
        pi$DiscordReply.svi[0] = -3733430297300785814L;
        pi$DiscordReply.svi[1] = -7216854390332517653L;
        pi$DiscordReply.svi[2] = -3859902291818837183L;
        pi$DiscordReply.svi[3] = -3025371697685512513L;
        pi$DiscordReply.svi[4] = -5063890934485062034L;
        pi$DiscordReply.svi[5] = 4696351144120343530L;
        pi$DiscordReply.svi[6] = -1010516572157593213L;
        pi$DiscordReply.svi[7] = -8468023568343930715L;
        pi$DiscordReply.svi[8] = 8273385483807840225L;
        pi$DiscordReply.svi[9] = 8256546786407098116L;
        pi$DiscordReply.svi[10] = 1846312390607679269L;
        pi$DiscordReply.svi[11] = -5744289032812595828L;
        pi$DiscordReply.svi[12] = -5309667126989798002L;
        pi$DiscordReply.svi[13] = -537269593847158884L;
        pi$DiscordReply.svi[14] = 8022319969352244673L;
        pi$DiscordReply.svi[15] = -6961338754844715750L;
        pi$DiscordReply.svi[16] = -6840800621165928803L;
        pi$DiscordReply.svi[17] = 6464725833441640596L;
        pi$DiscordReply.svi[18] = 1453168966828481672L;
        pi$DiscordReply.svi[19] = 8258093320900853537L;
        pi$DiscordReply.svi[20] = -5883074809672690071L;
        pi$DiscordReply.svi[21] = 2519145368424222835L;
        pi$DiscordReply.svi[22] = -8242188968226674799L;
        pi$DiscordReply.svi[23] = 466181243228176533L;
        pi$DiscordReply.svi[24] = -18799030701934893L;
        pi$DiscordReply.svi[25] = 123632149847259484L;
        pi$DiscordReply.svi[26] = -1020289500895299149L;
        pi$DiscordReply.svi[27] = -3290302348879514030L;
        pi$DiscordReply.svi[28] = 8538094103755154032L;
        pi$DiscordReply.svi[29] = -2529670885370612788L;
        pi$DiscordReply.svi[30] = -5842930120870169640L;
        pi$DiscordReply.svi[31] = -8744446718954018123L;
        pi$DiscordReply.svi[32] = 4155493348147778882L;
        pi$DiscordReply.svi[33] = 7048404229932926988L;
        pi$DiscordReply.svi[34] = 6437496902335204504L;
        pi$DiscordReply.svi[35] = -5327364452037671113L;
        pi$DiscordReply.svi[36] = -1478866461003963778L;
        pi$DiscordReply.svi[37] = 3378336593049296983L;
        pi$DiscordReply.svi[38] = 6922721237522081294L;
        pi$DiscordReply.svi[39] = -8384246156580791266L;
        pi$DiscordReply.svi[40] = -6877599372469039406L;
        pi$DiscordReply.svi[41] = -8397234283538562108L;
        pi$DiscordReply.svi[42] = 7714737383445073204L;
        pi$DiscordReply.svi[43] = 1681722115703200828L;
        pi$DiscordReply.svi[44] = -2376589743843636144L;
        pi$DiscordReply.svi[45] = -266586265451713714L;
    }

    public static /* synthetic */ CallSite svj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int svw(int n2) {
        return svx[n2] ^ svy[n2];
    }

    static {
        svx = new int[44];
        svy = new int[44];
        pi$DiscordReply.syz();
        pi$DiscordReply.sza();
        svh = new long[46];
        svi = new long[46];
        pi$DiscordReply.szb();
        pi$DiscordReply.szc();
        NO = new pi$DiscordReply((int)pi$DiscordReply.svj("syu", svw(int ), (int)39));
        IGNORE = new pi$DiscordReply((int)pi$DiscordReply.svj("syw", svw(int ), (int)41));
        YES = new pi$DiscordReply((int)pi$DiscordReply.svj("syy", svw(int ), (int)43));
        $VALUES = pi$DiscordReply.$values();
    }

    private static /* synthetic */ void szb() {
        pi$DiscordReply.svh[0] = 5182589840996758953L;
        pi$DiscordReply.svh[1] = -9053276681872647559L;
        pi$DiscordReply.svh[2] = 5566323288200073015L;
        pi$DiscordReply.svh[3] = 6925325775885640110L;
        pi$DiscordReply.svh[4] = -1019006852679935589L;
        pi$DiscordReply.svh[5] = -6723594365969369582L;
        pi$DiscordReply.svh[6] = 270691953120564615L;
        pi$DiscordReply.svh[7] = 4496094761200282212L;
        pi$DiscordReply.svh[8] = 9127803208993997256L;
        pi$DiscordReply.svh[9] = -4484785128920061139L;
        pi$DiscordReply.svh[10] = -901678532857319482L;
        pi$DiscordReply.svh[11] = -5308162557268259772L;
        pi$DiscordReply.svh[12] = 5173543742313047727L;
        pi$DiscordReply.svh[13] = 1299250171394828811L;
        pi$DiscordReply.svh[14] = 875442982282235003L;
        pi$DiscordReply.svh[15] = 9025698434501532081L;
        pi$DiscordReply.svh[16] = -580630365153600006L;
        pi$DiscordReply.svh[17] = -6952956115896467649L;
        pi$DiscordReply.svh[18] = -4815607204809004734L;
        pi$DiscordReply.svh[19] = 1440074685585337954L;
        pi$DiscordReply.svh[20] = 5980481370688946195L;
        pi$DiscordReply.svh[21] = 6735870702990172665L;
        pi$DiscordReply.svh[22] = -8482293055479312295L;
        pi$DiscordReply.svh[23] = 3520717268346428970L;
        pi$DiscordReply.svh[24] = -307123216582763773L;
        pi$DiscordReply.svh[25] = -583236425875912840L;
        pi$DiscordReply.svh[26] = 6253253027081830210L;
        pi$DiscordReply.svh[27] = -3918000212017543928L;
        pi$DiscordReply.svh[28] = -4300682339322437621L;
        pi$DiscordReply.svh[29] = -668925740510181119L;
        pi$DiscordReply.svh[30] = 3054660917614540585L;
        pi$DiscordReply.svh[31] = 2282860336237969661L;
        pi$DiscordReply.svh[32] = 3610030658274408900L;
        pi$DiscordReply.svh[33] = -7310204733141690630L;
        pi$DiscordReply.svh[34] = 895368490767091206L;
        pi$DiscordReply.svh[35] = 8838453782159971339L;
        pi$DiscordReply.svh[36] = 5587169946199715542L;
        pi$DiscordReply.svh[37] = 125004590483564787L;
        pi$DiscordReply.svh[38] = 247108867435150861L;
        pi$DiscordReply.svh[39] = 4580119272207347062L;
        pi$DiscordReply.svh[40] = -4624342722179439252L;
        pi$DiscordReply.svh[41] = 6794982341074192403L;
        pi$DiscordReply.svh[42] = -8798755423112441116L;
        pi$DiscordReply.svh[43] = -5090175367119087686L;
        pi$DiscordReply.svh[44] = -8231846805628259623L;
        pi$DiscordReply.svh[45] = 8475806558027288514L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ pi$DiscordReply[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pi$DiscordReply.bc - pi$DiscordReply.svj("sxu", svg(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pi$DiscordReply.svj("sxv", svw(int ), (int)28)) break;
            v0 /* !! */  = (long)pi$DiscordReply.svj("sxw", svw(int ), (int)29);
        }
        var2 = pi$DiscordReply.c;
        v1 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl12
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - pi$DiscordReply.svj("sxx", svg(int ), (int)32));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1567403733: {
                    v2 = pi$DiscordReply.svj("sxy", svg(int ), (int)33);
                    continue block28;
                }
                case -830065784: {
                    v2 = pi$DiscordReply.svj("sxz", svg(int ), (int)34);
                    continue block28;
                }
                case 813002285: {
                    break block28;
                }
                case 1978681338: {
                    v2 = pi$DiscordReply.svj("sya", svg(int ), (int)35);
                    continue block28;
                }
            }
            break;
        }
        var1_1 /* !! */  = pi$DiscordReply.b;
        v3 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - pi$DiscordReply.svj("syb", svg(int ), (int)36));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 813002285: {
                    break block29;
                }
                case 1193565715: {
                    v4 = pi$DiscordReply.svj("syc", svg(int ), (int)37);
                    continue block29;
                }
                case 1258049579: {
                    v4 = pi$DiscordReply.svj("syd", svg(int ), (int)38);
                    continue block29;
                }
                case 1758165785: {
                    v4 = pi$DiscordReply.svj("sye", svg(int ), (int)39);
                    continue block29;
                }
            }
            break;
        }
        var0_2 = pi$DiscordReply.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v5 = new pi$DiscordReply[3];
                v6 = pi$DiscordReply.svj("syf", svw(int ), (int)30);
                v7 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl56
                block31: while (true) {
                    v7 /* !! */  = (long)(pi$DiscordReply.svj("syh", svg(int ), (int)41) - pi$DiscordReply.svj("syg", svg(int ), (int)40));
lbl56:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 39498064: {
                            continue block31;
                        }
                        case 813002285: {
                            break block31;
                        }
                    }
                    break;
                }
                v5[v6] = pi$DiscordReply.NO;
                v8 = pi$DiscordReply.svj("syi", svw(int ), (int)31);
                v9 /* !! */  = pi$DiscordReply.bc;
                if (true) ** GOTO lbl67
                block32: while (true) {
                    v9 /* !! */  = (long)(v10 - pi$DiscordReply.svj("syj", svg(int ), (int)42));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 813002285: {
                            break block32;
                        }
                        case 1003335220: {
                            v10 = pi$DiscordReply.svj("syk", svg(int ), (int)43);
                            continue block32;
                        }
                        case 1927961787: {
                            v10 = pi$DiscordReply.svj("syl", svg(int ), (int)44);
                            continue block32;
                        }
                    }
                    break;
                }
                v5[v8] = pi$DiscordReply.IGNORE;
                v11 = pi$DiscordReply.svj("sym", svw(int ), (int)32);
                while (true) {
                    if ((v12 = (cfr_temp_1 = pi$DiscordReply.bc - pi$DiscordReply.svj("syn", svg(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == pi$DiscordReply.svj("syo", svw(int ), (int)33)) break;
                    v12 = 434816371;
                }
                v5[v11] = pi$DiscordReply.YES;
                return v5;
            }
lbl86:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)pi$DiscordReply.svj("syp", svw(int ), (int)34);
                } while (!var2);
                throw null;
            }
lbl91:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)pi$DiscordReply.svj("syq", svw(int ), (int)35);
                if (!var2) ** GOTO lbl86
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)pi$DiscordReply.svj("syr", svw(int ), (int)36);
                if (!var2) ** GOTO lbl91
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)pi$DiscordReply.svj("sys", svw(int ), (int)37);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void sza() {
        pi$DiscordReply.svy[0] = 115013529;
        pi$DiscordReply.svy[1] = -1301857311;
        pi$DiscordReply.svy[2] = 1084131631;
        pi$DiscordReply.svy[3] = -2037998328;
        pi$DiscordReply.svy[4] = -1408744081;
        pi$DiscordReply.svy[5] = 1823902513;
        pi$DiscordReply.svy[6] = -1292669601;
        pi$DiscordReply.svy[7] = -1237540796;
        pi$DiscordReply.svy[8] = -532452989;
        pi$DiscordReply.svy[9] = 63239537;
        pi$DiscordReply.svy[10] = 1412531544;
        pi$DiscordReply.svy[11] = -1526700390;
        pi$DiscordReply.svy[12] = 1606145781;
        pi$DiscordReply.svy[13] = 671086944;
        pi$DiscordReply.svy[14] = -2140226164;
        pi$DiscordReply.svy[15] = -1679887597;
        pi$DiscordReply.svy[16] = -131658680;
        pi$DiscordReply.svy[17] = 613658746;
        pi$DiscordReply.svy[18] = 1087223038;
        pi$DiscordReply.svy[19] = 2091637297;
        pi$DiscordReply.svy[20] = -915552862;
        pi$DiscordReply.svy[21] = -404575866;
        pi$DiscordReply.svy[22] = 479227465;
        pi$DiscordReply.svy[23] = 35984401;
        pi$DiscordReply.svy[24] = 1679374413;
        pi$DiscordReply.svy[25] = 1873713579;
        pi$DiscordReply.svy[26] = 2100105193;
        pi$DiscordReply.svy[27] = -973769172;
        pi$DiscordReply.svy[28] = 514722010;
        pi$DiscordReply.svy[29] = 393746074;
        pi$DiscordReply.svy[30] = 1756162256;
        pi$DiscordReply.svy[31] = 190751490;
        pi$DiscordReply.svy[32] = 169014076;
        pi$DiscordReply.svy[33] = 1962421843;
        pi$DiscordReply.svy[34] = -1055382682;
        pi$DiscordReply.svy[35] = 727973342;
        pi$DiscordReply.svy[36] = 982970901;
        pi$DiscordReply.svy[37] = -1747869106;
        pi$DiscordReply.svy[38] = -660663472;
        pi$DiscordReply.svy[39] = 1956883128;
        pi$DiscordReply.svy[40] = 864762940;
        pi$DiscordReply.svy[41] = 114145733;
        pi$DiscordReply.svy[42] = 1560786257;
        pi$DiscordReply.svy[43] = -1761875869;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static pi$DiscordReply valueOf(String var0) {
        v0 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(pi$DiscordReply.svj("swe", svg(int ), (int)13) - pi$DiscordReply.svj("swd", svg(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 651033302: {
                    continue block16;
                }
                case 813002285: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = pi$DiscordReply.c;
        v1 /* !! */  = pi$DiscordReply.bc;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - pi$DiscordReply.svj("swf", svg(int ), (int)14));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 159730413: {
                    v2 = pi$DiscordReply.svj("swg", svg(int ), (int)15);
                    continue block17;
                }
                case 813002285: {
                    break block17;
                }
                case 855728935: {
                    v2 = pi$DiscordReply.svj("swh", svg(int ), (int)16);
                    continue block17;
                }
                case 1203942715: {
                    v2 = pi$DiscordReply.svj("swi", svg(int ), (int)17);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = pi$DiscordReply.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = pi$DiscordReply.bc - pi$DiscordReply.svj("swj", svg(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pi$DiscordReply.svj("swk", svw(int ), (int)4)) break;
            v3 /* !! */  = (long)pi$DiscordReply.svj("swl", svw(int ), (int)5);
        }
        var1_3 = pi$DiscordReply.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pi$DiscordReply.bc - pi$DiscordReply.svj("swm", svg(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pi$DiscordReply.svj("swn", svw(int ), (int)6)) break;
                    v4 /* !! */  = (long)pi$DiscordReply.svj("swo", svw(int ), (int)7);
                }
                return Enum.valueOf(pi$DiscordReply.class, var0);
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)pi$DiscordReply.svj("swp", svw(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)pi$DiscordReply.svj("swq", svw(int ), (int)9);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)pi$DiscordReply.svj("swr", svw(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)pi$DiscordReply.svj("sws", svw(int ), (int)11);
        } while (!var3_1);
        throw null;
    }
}

