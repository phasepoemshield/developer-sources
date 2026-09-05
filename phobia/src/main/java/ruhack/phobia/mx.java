/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class mx
extends Enum<mx> {
    private static long[] fnat;
    public static final /* enum */ mx BACKWARDS;
    protected static final long mr = 2441095449840357989L;
    private static final /* synthetic */ mx[] $VALUES;
    private static int[] fnbb;
    private static int[] fnbc;
    public static final boolean c;
    public static final boolean a;
    public static final /* enum */ mx FORWARDS;
    private static long[] fnau;
    public static final int b;

    private static /* synthetic */ int fnba(int n2) {
        return fnbb[n2] ^ fnbc[n2];
    }

    static {
        fnbb = new int[34];
        fnbc = new int[34];
        mx.fnfm();
        mx.fnfs();
        fnat = new long[28];
        fnau = new long[28];
        mx.fngb();
        mx.fngk();
        FORWARDS = new mx();
        BACKWARDS = new mx();
        $VALUES = mx.$values();
    }

    private static /* synthetic */ void fngk() {
        mx.fnau[0] = -8419831951736435457L;
        mx.fnau[1] = 554814274144806868L;
        mx.fnau[2] = -8235395724197665940L;
        mx.fnau[3] = 6552894389695884215L;
        mx.fnau[4] = -5604638016423439122L;
        mx.fnau[5] = 2824816290471075844L;
        mx.fnau[6] = -4452953144941031002L;
        mx.fnau[7] = 5060800570230440509L;
        mx.fnau[8] = -3976718156643703704L;
        mx.fnau[9] = -9209387070243495319L;
        mx.fnau[10] = -3657807606835289526L;
        mx.fnau[11] = -8349700429749530809L;
        mx.fnau[12] = -429012469674594314L;
        mx.fnau[13] = -7885742680205711504L;
        mx.fnau[14] = 3489975984943548690L;
        mx.fnau[15] = -4877840328057559774L;
        mx.fnau[16] = -7557086668132680360L;
        mx.fnau[17] = -2735005950779612068L;
        mx.fnau[18] = -766126184579008044L;
        mx.fnau[19] = 1153707901541446298L;
        mx.fnau[20] = -758046379125739927L;
        mx.fnau[21] = 3691320430863017042L;
        mx.fnau[22] = -6233226939166735965L;
        mx.fnau[23] = -4574926298584292565L;
        mx.fnau[24] = -2347268555576748297L;
        mx.fnau[25] = -5523413139422962564L;
        mx.fnau[26] = 3419515496251783402L;
        mx.fnau[27] = 977844677038618913L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mx[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mx.mr - mx.fnaw("fnaz", fnar(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mx.fnaw("fnbd", fnba(int ), (int)0)) break;
            v0 /* !! */  = (long)mx.fnaw("fnbe", fnba(int ), (int)1);
        }
        var2 = mx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mx.mr - mx.fnaw("fnbf", fnar(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mx.fnaw("fnbh", fnba(int ), (int)2)) break;
            v1 /* !! */  = (long)mx.fnaw("fnbi", fnba(int ), (int)3);
        }
        var1_1 = mx.b;
        v2 /* !! */  = mx.mr;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - mx.fnaw("fnbj", fnar(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1401678321: {
                    v3 = mx.fnaw("fnbk", fnar(int ), (int)3);
                    continue block8;
                }
                case -1129095567: {
                    v3 = mx.fnaw("fnbl", fnar(int ), (int)4);
                    continue block8;
                }
                case -829517211: {
                    break block8;
                }
                case 394669080: {
                    v3 = mx.fnaw("fnbm", fnar(int ), (int)5);
                    continue block8;
                }
            }
            break;
        }
        var0_2 = mx.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mx.mr - mx.fnaw("fnbo", fnar(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mx.fnaw("fnbp", fnba(int ), (int)4)) break;
            v4 /* !! */  = (long)mx.fnaw("fnbq", fnba(int ), (int)5);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = mx.mr - mx.fnaw("fnbs", fnar(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mx.fnaw("fnbt", fnba(int ), (int)6)) break;
            v5 /* !! */  = (long)mx.fnaw("fnbv", fnba(int ), (int)7);
        }
        return (mx[])mx.$VALUES.clone();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ mx[] $values() {
        block38: {
            block39: {
                v0 /* !! */  = mx.mr;
                if (true) ** GOTO lbl5
                block26: while (true) {
                    v0 /* !! */  = (long)(v1 - mx.fnaw("fndt", fnar(int ), (int)15));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -829517211: {
                            break block26;
                        }
                        case -470458305: {
                            v1 = mx.fnaw("fndv", fnar(int ), (int)16);
                            continue block26;
                        }
                        case 1025662141: {
                            v1 = mx.fnaw("fndw", fnar(int ), (int)17);
                            continue block26;
                        }
                        case 1860653109: {
                            v1 = mx.fnaw("fneb", fnar(int ), (int)18);
                            continue block26;
                        }
                    }
                    break;
                }
                var2 = mx.c;
                v2 /* !! */  = mx.mr;
                block27: while (true) {
                    switch ((int)v2 /* !! */ ) {
                        case -1305419004: {
                            v2 /* !! */  = (long)(mx.fnaw("fnef", fnar(int ), (int)20) - mx.fnaw("fned", fnar(int ), (int)19));
                            continue block27;
                        }
                        case -829517211: {
                            break block27;
                        }
                    }
                    break;
                }
                var1_1 /* !! */  = mx.b;
                v3 /* !! */  = mx.mr;
                if (true) ** GOTO lbl31
                block28: while (true) {
                    v3 /* !! */  = (long)(v4 - mx.fnaw("fneh", fnar(int ), (int)21));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2130344310: {
                            v4 = mx.fnaw("fnei", fnar(int ), (int)22);
                            continue block28;
                        }
                        case -2024318469: {
                            v4 = mx.fnaw("fnej", fnar(int ), (int)23);
                            continue block28;
                        }
                        case -829517211: {
                            break block28;
                        }
                        case 1617076944: {
                            v4 = mx.fnaw("fnen", fnar(int ), (int)24);
                            continue block28;
                        }
                    }
                    break;
                }
                var0_2 = mx.a;
                if (var2) {
                    throw null;
                }
                if (var0_2 || var0_2) break block39;
                v5 = new mx[2];
                v6 = mx.fnaw("fneq", fnba(int ), (int)25);
                ** GOTO lbl55
            }
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl55:
                // 1 sources

                while (true) {
                    if ((v7 = (cfr_temp_0 = mx.mr - mx.fnaw("fner", fnar(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == mx.fnaw("fnet", fnba(int ), (int)26)) {
                        v5[v6] = mx.FORWARDS;
                        v8 = mx.fnaw("fnev", fnba(int ), (int)27);
                        v9 /* !! */  = mx.mr;
                        break block38;
                    }
                    v7 = -845772790;
                }
                case 0: {
                    ** GOTO lbl76
                }
                case 2: {
                    var1_1 /* !! */  = (int)mx.fnaw("fnff", fnba(int ), (int)30);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)mx.fnaw("fnfh", fnba(int ), (int)31);
                    if (var2) {
                        throw null;
                    }
lbl76:
                    // 3 sources

                    var1_1 /* !! */  = (int)mx.fnaw("fnfb", fnba(int ), (int)28);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            do {
                var1_1 /* !! */  = (int)mx.fnaw("fnfd", fnba(int ), (int)29);
            } while (!var2);
            throw null;
        }
        block31: while (true) {
            switch ((int)v9 /* !! */ ) {
                case -1305054624: {
                    v9 /* !! */  = (long)(mx.fnaw("fnez", fnar(int ), (int)27) - mx.fnaw("fnew", fnar(int ), (int)26));
                    continue block31;
                }
                case -829517211: {
                    break block31;
                }
            }
            break;
        }
        v5[v8] = mx.BACKWARDS;
        return v5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mx() {
        var4_3 /* !! */  = mx.b;
        var3_4 = mx.a;
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
                var4_3 /* !! */  = (int)mx.fnaw("fndk", fnba(int ), (int)22);
            }
            case 1: {
                var4_3 /* !! */  = (int)mx.fnaw("fndp", fnba(int ), (int)23);
                ** GOTO lbl8
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)mx.fnaw("fndr", fnba(int ), (int)24);
        }
    }

    private static /* synthetic */ long fnar(int n2) {
        return fnat[n2] ^ fnau[n2];
    }

    public static /* synthetic */ CallSite fnaw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fnfm() {
        mx.fnbb[0] = -2028531058;
        mx.fnbb[1] = -1651813823;
        mx.fnbb[2] = -428238499;
        mx.fnbb[3] = 2001797242;
        mx.fnbb[4] = 1025875070;
        mx.fnbb[5] = 1993244044;
        mx.fnbb[6] = 1854896183;
        mx.fnbb[7] = 634591824;
        mx.fnbb[8] = -1724657678;
        mx.fnbb[9] = -1945832152;
        mx.fnbb[10] = -1319321176;
        mx.fnbb[11] = -1977614462;
        mx.fnbb[12] = -1693013591;
        mx.fnbb[13] = -461968485;
        mx.fnbb[14] = 1205984780;
        mx.fnbb[15] = -847863319;
        mx.fnbb[16] = 698280789;
        mx.fnbb[17] = 1610916179;
        mx.fnbb[18] = 24164253;
        mx.fnbb[19] = -2061677153;
        mx.fnbb[20] = -1550001384;
        mx.fnbb[21] = -1789839272;
        mx.fnbb[22] = -1604589846;
        mx.fnbb[23] = -123337060;
        mx.fnbb[24] = -342599431;
        mx.fnbb[25] = -979352042;
        mx.fnbb[26] = -1262532752;
        mx.fnbb[27] = -351191353;
        mx.fnbb[28] = -1042658775;
        mx.fnbb[29] = -1894766864;
        mx.fnbb[30] = -160436886;
        mx.fnbb[31] = -240976993;
        mx.fnbb[32] = 1477609716;
        mx.fnbb[33] = 1858456485;
    }

    private static /* synthetic */ void fnfs() {
        mx.fnbc[0] = -2028531057;
        mx.fnbc[1] = 1494120786;
        mx.fnbc[2] = -428238500;
        mx.fnbc[3] = -730010800;
        mx.fnbc[4] = 1025875071;
        mx.fnbc[5] = -420837806;
        mx.fnbc[6] = 1854896182;
        mx.fnbc[7] = -2054365789;
        mx.fnbc[8] = -1724657678;
        mx.fnbc[9] = -1945832149;
        mx.fnbc[10] = -1319321173;
        mx.fnbc[11] = -1977614463;
        mx.fnbc[12] = 1693013590;
        mx.fnbc[13] = 1464925893;
        mx.fnbc[14] = -1205984781;
        mx.fnbc[15] = -1108205642;
        mx.fnbc[16] = -698280790;
        mx.fnbc[17] = -679805611;
        mx.fnbc[18] = 24164255;
        mx.fnbc[19] = -2061677155;
        mx.fnbc[20] = -1550001381;
        mx.fnbc[21] = -1789839269;
        mx.fnbc[22] = -1604589845;
        mx.fnbc[23] = -123337058;
        mx.fnbc[24] = -342599432;
        mx.fnbc[25] = -979352042;
        mx.fnbc[26] = -1262532751;
        mx.fnbc[27] = -351191354;
        mx.fnbc[28] = -1042658774;
        mx.fnbc[29] = -1894766861;
        mx.fnbc[30] = -160436886;
        mx.fnbc[31] = -240976993;
        mx.fnbc[32] = 1477609716;
        mx.fnbc[33] = 1858456484;
    }

    private static /* synthetic */ void fngb() {
        mx.fnat[0] = 1344418149558181402L;
        mx.fnat[1] = -7447732624126566246L;
        mx.fnat[2] = 5555900181274774762L;
        mx.fnat[3] = 4717125703239984740L;
        mx.fnat[4] = -680904863133335014L;
        mx.fnat[5] = 3177053554688568269L;
        mx.fnat[6] = -3290200539483919781L;
        mx.fnat[7] = -5599817413025568926L;
        mx.fnat[8] = -8887721861427626591L;
        mx.fnat[9] = -6037314416476552620L;
        mx.fnat[10] = -5256820566723731905L;
        mx.fnat[11] = 734340580214605206L;
        mx.fnat[12] = -5996862107491608105L;
        mx.fnat[13] = -3627953695370118137L;
        mx.fnat[14] = -762515934067391082L;
        mx.fnat[15] = 9053077984287359512L;
        mx.fnat[16] = -1917548895693876683L;
        mx.fnat[17] = 1999575467904509209L;
        mx.fnat[18] = -8013682821067373735L;
        mx.fnat[19] = -3753406836132958229L;
        mx.fnat[20] = 1425355273681637994L;
        mx.fnat[21] = -4085138547707886058L;
        mx.fnat[22] = -4770772450685303741L;
        mx.fnat[23] = -30790522750504861L;
        mx.fnat[24] = 2621810689953716516L;
        mx.fnat[25] = -6210234220080947205L;
        mx.fnat[26] = -1298953884972918427L;
        mx.fnat[27] = -2830640359189360780L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mx valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mx.mr - mx.fnaw("fncd", fnar(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mx.fnaw("fncf", fnba(int ), (int)12)) break;
            v0 /* !! */  = (long)mx.fnaw("fncg", fnba(int ), (int)13);
        }
        var3_1 = mx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mx.mr - mx.fnaw("fnci", fnar(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mx.fnaw("fncm", fnba(int ), (int)14)) break;
            v1 /* !! */  = (long)mx.fnaw("fncn", fnba(int ), (int)15);
        }
        var2_2 /* !! */  = mx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mx.mr - mx.fnaw("fncq", fnar(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mx.fnaw("fncs", fnba(int ), (int)16)) break;
            v2 /* !! */  = (long)mx.fnaw("fnct", fnba(int ), (int)17);
        }
        var1_3 = mx.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = mx.mr;
                if (true) ** GOTO lbl35
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - mx.fnaw("fncu", fnar(int ), (int)11));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1881923218: {
                            v4 = mx.fnaw("fncv", fnar(int ), (int)12);
                            continue block16;
                        }
                        case -829517211: {
                            break block16;
                        }
                        case 1079262401: {
                            v4 = mx.fnaw("fncz", fnar(int ), (int)13);
                            continue block16;
                        }
                        case 1927632945: {
                            v4 = mx.fnaw("fndb", fnar(int ), (int)14);
                            continue block16;
                        }
                    }
                    break;
                }
                return Enum.valueOf(mx.class, var0);
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mx.fnaw("fndd", fnba(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mx.fnaw("fndf", fnba(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mx.fnaw("fndh", fnba(int ), (int)20);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mx.fnaw("fndj", fnba(int ), (int)21);
        } while (!var3_1);
        throw null;
    }
}

