/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class mf$Section
extends Enum<mf$Section> {
    private static final /* synthetic */ mf$Section[] $VALUES;
    private static int[] fzz = new int[35];
    private static int[] gaa = new int[35];
    private static final long aa = -4710177828889372865L;
    public static final boolean a;
    public static final /* enum */ mf$Section WIDGETS;
    private static long[] fzj;
    public static final int b;
    public static final /* enum */ mf$Section VIEW;
    public static final boolean c;
    private static long[] fzl;

    static {
        mf$Section.gca();
        mf$Section.gcb();
        fzj = new long[24];
        fzl = new long[24];
        mf$Section.gcc();
        mf$Section.gcd();
        WIDGETS = new mf$Section();
        VIEW = new mf$Section();
        $VALUES = mf$Section.$values();
    }

    private static /* synthetic */ void gcb() {
        mf$Section.gaa[0] = 698250038;
        mf$Section.gaa[1] = 1144387694;
        mf$Section.gaa[2] = -1147584165;
        mf$Section.gaa[3] = 115093665;
        mf$Section.gaa[4] = -1522381907;
        mf$Section.gaa[5] = 1108717467;
        mf$Section.gaa[6] = -1743984629;
        mf$Section.gaa[7] = -180069128;
        mf$Section.gaa[8] = 1309284573;
        mf$Section.gaa[9] = 1507621347;
        mf$Section.gaa[10] = -1115791069;
        mf$Section.gaa[11] = 1249843945;
        mf$Section.gaa[12] = -1747705729;
        mf$Section.gaa[13] = -863477849;
        mf$Section.gaa[14] = 1954731196;
        mf$Section.gaa[15] = -103369447;
        mf$Section.gaa[16] = 23795363;
        mf$Section.gaa[17] = -259723679;
        mf$Section.gaa[18] = 1329057498;
        mf$Section.gaa[19] = -1858083048;
        mf$Section.gaa[20] = -1912957373;
        mf$Section.gaa[21] = -89356720;
        mf$Section.gaa[22] = 1865196906;
        mf$Section.gaa[23] = -1945654710;
        mf$Section.gaa[24] = -1966999524;
        mf$Section.gaa[25] = -535528395;
        mf$Section.gaa[26] = -1132493091;
        mf$Section.gaa[27] = 787892026;
        mf$Section.gaa[28] = 85452526;
        mf$Section.gaa[29] = -1145908269;
        mf$Section.gaa[30] = -573629542;
        mf$Section.gaa[31] = 1474517970;
        mf$Section.gaa[32] = 2080815615;
        mf$Section.gaa[33] = 1202994873;
        mf$Section.gaa[34] = 1905032861;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mf$Section[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mf$Section.aa - mf$Section.fzn("gbd", fzi(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mf$Section.fzn("gbe", fzy(int ), (int)23)) break;
            v0 /* !! */  = (long)mf$Section.fzn("gbf", fzy(int ), (int)24);
        }
        var2 = mf$Section.c;
        v1 /* !! */  = mf$Section.aa;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - mf$Section.fzn("gbg", fzi(int ), (int)14));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1133083206: {
                    v2 = mf$Section.fzn("gbh", fzi(int ), (int)15);
                    continue block22;
                }
                case 904984567: {
                    v2 = mf$Section.fzn("gbi", fzi(int ), (int)16);
                    continue block22;
                }
                case 1612764991: {
                    break block22;
                }
            }
            break;
        }
        var1_1 /* !! */  = mf$Section.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mf$Section.aa - mf$Section.fzn("gbj", fzi(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mf$Section.fzn("gbk", fzy(int ), (int)25)) break;
            v3 /* !! */  = (long)mf$Section.fzn("gbl", fzy(int ), (int)26);
        }
        var0_2 = mf$Section.a;
        if (!var2) ** GOTO lbl35
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var0_2 || var0_2) continue block24;
                v4 = new mf$Section[2];
                v5 = mf$Section.fzn("gbm", fzy(int ), (int)27);
                v6 /* !! */  = mf$Section.aa;
                if (true) ** GOTO lbl42
                block25: while (true) {
                    v6 /* !! */  = (long)(mf$Section.fzn("gbo", fzi(int ), (int)19) - mf$Section.fzn("gbn", fzi(int ), (int)18));
lbl42:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1937354379: {
                            continue block25;
                        }
                        case 1612764991: {
                            break block25;
                        }
                    }
                    break;
                }
                v4[v5] = mf$Section.WIDGETS;
                v7 = mf$Section.fzn("gbp", fzy(int ), (int)28);
                v8 /* !! */  = mf$Section.aa;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v8 /* !! */  = (long)(v9 - mf$Section.fzn("gbq", fzi(int ), (int)20));
lbl53:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1419163017: {
                            v9 = mf$Section.fzn("gbr", fzi(int ), (int)21);
                            continue block26;
                        }
                        case 285059068: {
                            v9 = mf$Section.fzn("gbs", fzi(int ), (int)22);
                            continue block26;
                        }
                        case 1111845839: {
                            v9 = mf$Section.fzn("gbt", fzi(int ), (int)23);
                            continue block26;
                        }
                        case 1612764991: {
                            break block26;
                        }
                    }
                    break;
                }
                v4[v7] = mf$Section.VIEW;
                return v4;
lbl67:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)mf$Section.fzn("gbu", fzy(int ), (int)29);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)mf$Section.fzn("gbv", fzy(int ), (int)30);
                    if (!var2) ** GOTO lbl67
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)mf$Section.fzn("gbw", fzy(int ), (int)31);
                        if (!var2) break block24;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)mf$Section.fzn("gbx", fzy(int ), (int)32);
        ** while (!var2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mf$Section valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mf$Section.aa - mf$Section.fzn("gak", fzi(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mf$Section.fzn("gal", fzy(int ), (int)8)) break;
            v0 /* !! */  = (long)mf$Section.fzn("gam", fzy(int ), (int)9);
        }
        var3_1 = mf$Section.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mf$Section.aa - mf$Section.fzn("gan", fzi(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mf$Section.fzn("gao", fzy(int ), (int)10)) break;
            v1 /* !! */  = (long)mf$Section.fzn("gap", fzy(int ), (int)11);
        }
        var2_2 /* !! */  = mf$Section.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mf$Section.aa - mf$Section.fzn("gaq", fzi(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mf$Section.fzn("gar", fzy(int ), (int)12)) break;
            v2 /* !! */  = (long)mf$Section.fzn("gas", fzy(int ), (int)13);
        }
        var1_3 = mf$Section.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = mf$Section.aa - mf$Section.fzn("gat", fzi(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mf$Section.fzn("gau", fzy(int ), (int)14)) break;
                    v3 /* !! */  = (long)mf$Section.fzn("gav", fzy(int ), (int)15);
                }
                return Enum.valueOf(mf$Section.class, var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mf$Section.fzn("gaw", fzy(int ), (int)16);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mf$Section.fzn("gax", fzy(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mf$Section.fzn("gay", fzy(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mf$Section.fzn("gaz", fzy(int ), (int)19);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fzn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void gcd() {
        mf$Section.fzl[0] = 7250447919722683402L;
        mf$Section.fzl[1] = -2081882024247086848L;
        mf$Section.fzl[2] = -2252761671365626858L;
        mf$Section.fzl[3] = -1294990911214930848L;
        mf$Section.fzl[4] = 8863667047935335866L;
        mf$Section.fzl[5] = 7241585971527857404L;
        mf$Section.fzl[6] = 1380971702801850941L;
        mf$Section.fzl[7] = -3678103757905553731L;
        mf$Section.fzl[8] = 8115743880067715908L;
        mf$Section.fzl[9] = 4947468328620058636L;
        mf$Section.fzl[10] = -8244682835936102831L;
        mf$Section.fzl[11] = 137969988238071277L;
        mf$Section.fzl[12] = -1194143198810314024L;
        mf$Section.fzl[13] = 6811490076626511366L;
        mf$Section.fzl[14] = 1398901363225979682L;
        mf$Section.fzl[15] = 816342823284136086L;
        mf$Section.fzl[16] = -4530000113494172446L;
        mf$Section.fzl[17] = -1948806936277652346L;
        mf$Section.fzl[18] = -4634031417961350907L;
        mf$Section.fzl[19] = 8551344392171337709L;
        mf$Section.fzl[20] = -3568919880884985003L;
        mf$Section.fzl[21] = 4911334951796777254L;
        mf$Section.fzl[22] = -1210923595390323765L;
        mf$Section.fzl[23] = 8420777872992717630L;
    }

    private static /* synthetic */ void gcc() {
        mf$Section.fzj[0] = -517121171544797895L;
        mf$Section.fzj[1] = 3419514741515048962L;
        mf$Section.fzj[2] = 5014048905373098393L;
        mf$Section.fzj[3] = 9013530365222977695L;
        mf$Section.fzj[4] = 9132490382548148711L;
        mf$Section.fzj[5] = -2484270919835131250L;
        mf$Section.fzj[6] = 4119153542144763279L;
        mf$Section.fzj[7] = 6561296506255598926L;
        mf$Section.fzj[8] = 7022643478520234388L;
        mf$Section.fzj[9] = 7161112564888069926L;
        mf$Section.fzj[10] = -1488855311423100162L;
        mf$Section.fzj[11] = 1548478691014683215L;
        mf$Section.fzj[12] = -4926249614361093943L;
        mf$Section.fzj[13] = 5601934523428853858L;
        mf$Section.fzj[14] = -4575061188143055352L;
        mf$Section.fzj[15] = 819442382503706168L;
        mf$Section.fzj[16] = -244935397068218434L;
        mf$Section.fzj[17] = 1575989355440342687L;
        mf$Section.fzj[18] = -1021386085304081422L;
        mf$Section.fzj[19] = -6813004003312066094L;
        mf$Section.fzj[20] = -5624395857790117486L;
        mf$Section.fzj[21] = -2259793614679841233L;
        mf$Section.fzj[22] = -3997455400824915764L;
        mf$Section.fzj[23] = -1258844345502780444L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mf$Section[] values() {
        v0 /* !! */  = mf$Section.aa;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - mf$Section.fzn("fzp", fzi(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -425586251: {
                    v1 = mf$Section.fzn("fzr", fzi(int ), (int)1);
                    continue block19;
                }
                case 1612764991: {
                    break block19;
                }
                case 1910380232: {
                    v1 = mf$Section.fzn("fzs", fzi(int ), (int)2);
                    continue block19;
                }
            }
            break;
        }
        var2 = mf$Section.c;
        v2 /* !! */  = mf$Section.aa;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(mf$Section.fzn("fzu", fzi(int ), (int)4) - mf$Section.fzn("fzt", fzi(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 533879129: {
                    continue block20;
                }
                case 1612764991: {
                    break block20;
                }
            }
            break;
        }
        var1_1 /* !! */  = mf$Section.b;
        v3 /* !! */  = mf$Section.aa;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(mf$Section.fzn("fzw", fzi(int ), (int)6) - mf$Section.fzn("fzv", fzi(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 426588830: {
                    continue block21;
                }
                case 1612764991: {
                    break block21;
                }
            }
            break;
        }
        var0_2 = mf$Section.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mf$Section.aa - mf$Section.fzn("fzx", fzi(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mf$Section.fzn("gab", fzy(int ), (int)0)) break;
                    v4 /* !! */  = (long)mf$Section.fzn("gac", fzy(int ), (int)1);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mf$Section.aa - mf$Section.fzn("gad", fzi(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mf$Section.fzn("gae", fzy(int ), (int)2)) break;
                    v5 /* !! */  = (long)mf$Section.fzn("gaf", fzy(int ), (int)3);
                }
                return (mf$Section[])mf$Section.$VALUES.clone();
            }
lbl57:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)mf$Section.fzn("gag", fzy(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mf$Section.fzn("gah", fzy(int ), (int)5);
                    if (!var2) break block13;
                    throw null;
                }
            }
lbl67:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)mf$Section.fzn("gai", fzy(int ), (int)6);
                if (!var2) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mf$Section.fzn("gaj", fzy(int ), (int)7);
        ** while (!var2)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int fzy(int n2) {
        return fzz[n2] ^ gaa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mf$Section() {
        var4_3 /* !! */  = mf$Section.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_4 = mf$Section.a;
                super(var1_1, var2_2);
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)mf$Section.fzn("gba", fzy(int ), (int)20);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mf$Section.fzn("gbb", fzy(int ), (int)21);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)mf$Section.fzn("gbc", fzy(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ void gca() {
        mf$Section.fzz[0] = 698250039;
        mf$Section.fzz[1] = 2139357865;
        mf$Section.fzz[2] = 1147584164;
        mf$Section.fzz[3] = -342937780;
        mf$Section.fzz[4] = -1522381905;
        mf$Section.fzz[5] = 1108717464;
        mf$Section.fzz[6] = -1743984632;
        mf$Section.fzz[7] = -180069126;
        mf$Section.fzz[8] = -1309284574;
        mf$Section.fzz[9] = 241378306;
        mf$Section.fzz[10] = 1115791068;
        mf$Section.fzz[11] = 906246116;
        mf$Section.fzz[12] = 1747705728;
        mf$Section.fzz[13] = 1147940266;
        mf$Section.fzz[14] = -1954731197;
        mf$Section.fzz[15] = 32474800;
        mf$Section.fzz[16] = 23795362;
        mf$Section.fzz[17] = -259723677;
        mf$Section.fzz[18] = 1329057496;
        mf$Section.fzz[19] = -1858083045;
        mf$Section.fzz[20] = -1912957375;
        mf$Section.fzz[21] = -89356719;
        mf$Section.fzz[22] = 1865196907;
        mf$Section.fzz[23] = 1945654709;
        mf$Section.fzz[24] = 1176288524;
        mf$Section.fzz[25] = 535528394;
        mf$Section.fzz[26] = 1260270105;
        mf$Section.fzz[27] = 787892026;
        mf$Section.fzz[28] = 85452527;
        mf$Section.fzz[29] = -1145908270;
        mf$Section.fzz[30] = -573629542;
        mf$Section.fzz[31] = 1474517968;
        mf$Section.fzz[32] = 2080815614;
        mf$Section.fzz[33] = 1202994873;
        mf$Section.fzz[34] = 1905032860;
    }

    private static /* synthetic */ long fzi(int n2) {
        return fzj[n2] ^ fzl[n2];
    }
}

