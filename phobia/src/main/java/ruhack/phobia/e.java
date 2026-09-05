/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.aa;
import ruhack.phobia.ag;
import ruhack.phobia.ah;
import ruhack.phobia.aj;
import ruhack.phobia.ak;
import ruhack.phobia.am;
import ruhack.phobia.an;
import ruhack.phobia.ao;
import ruhack.phobia.aq;
import ruhack.phobia.av;
import ruhack.phobia.ax;
import ruhack.phobia.dn;
import ruhack.phobia.dq;
import ruhack.phobia.dr;
import ruhack.phobia.dt;
import ruhack.phobia.g;
import ruhack.phobia.hv;
import ruhack.phobia.ot;

public class e {
    private g commandManager;
    private dr moduleRepository;
    public hv attackPerpetrator;
    private ax eventManager;
    public static final boolean c;
    private static long[] bibs;
    private dt moduleSwitcher;
    private static final long di = -2613510722834822924L;
    public static final int b;
    private static int[] bhxc;
    private aa configSystem;
    private av hudManager;
    private static long[] bibq;
    private dq moduleProvider;
    public static final boolean a;
    private static int[] bhxb;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hv getAttackPerpetrator() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("bibt", bibp(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == e.bhxe("bibu", bhwy(int ), (int)50)) break;
            v0 /* !! */  = (long)e.bhxe("bibv", bhwy(int ), (int)51);
        }
        var3_1 = e.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = e.di - e.bhxe("bibx", bibp(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == e.bhxe("biby", bhwy(int ), (int)52)) break;
            v1 /* !! */  = (long)e.bhxe("bibz", bhwy(int ), (int)53);
        }
        var2_2 /* !! */  = e.b;
        v2 /* !! */  = e.di;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - e.bhxe("bica", bibp(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1080069628: {
                    v3 = e.bhxe("bicb", bibp(int ), (int)3);
                    continue block13;
                }
                case -31825362: {
                    v3 = e.bhxe("bicc", bibp(int ), (int)4);
                    continue block13;
                }
                case 885098740: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = e.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = e.di - e.bhxe("bice", bibp(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == e.bhxe("bicf", bhwy(int ), (int)54)) break;
                    v4 /* !! */  = (long)e.bhxe("bicg", bhwy(int ), (int)55);
                }
                return this.attackPerpetrator;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("bich", bhwy(int ), (int)56);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)e.bhxe("bici", bhwy(int ), (int)57);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("bicj", bhwy(int ), (int)58);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)e.bhxe("bihk", bhwy(int ), (int)59);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dt getModuleSwitcher() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("bims", bibp(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == e.bhxe("bimu", bhwy(int ), (int)84)) break;
            v0 /* !! */  = (long)e.bhxe("bimx", bhwy(int ), (int)85);
        }
        var3_1 = e.c;
        v1 /* !! */  = e.di;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(e.bhxe("binc", bibp(int ), (int)36) - e.bhxe("bimz", bibp(int ), (int)35));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 819952998: {
                    continue block11;
                }
                case 885098740: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = e.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = e.di - e.bhxe("bine", bibp(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == e.bhxe("binh", bhwy(int ), (int)86)) break;
            v2 /* !! */  = (long)e.bhxe("binj", bhwy(int ), (int)87);
        }
        var1_3 = e.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = e.di - e.bhxe("binl", bibp(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == e.bhxe("binn", bhwy(int ), (int)88)) break;
                    v3 /* !! */  = (long)e.bhxe("binq", bhwy(int ), (int)89);
                }
                return this.moduleSwitcher;
            }
            case 0: {
                var2_2 /* !! */  = (int)e.bhxe("bins", bhwy(int ), (int)90);
                if (!var3_1) break;
                throw null;
            }
lbl44:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("binw", bhwy(int ), (int)91);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)e.bhxe("biny", bhwy(int ), (int)92);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)e.bhxe("bioc", bhwy(int ), (int)93);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dr getModuleRepository() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("bilc", bibp(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == e.bhxe("bild", bhwy(int ), (int)76)) break;
            v0 /* !! */  = (long)e.bhxe("bili", bhwy(int ), (int)77);
        }
        var3_1 = e.c;
        v1 /* !! */  = e.di;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(e.bhxe("biln", bibp(int ), (int)28) - e.bhxe("bill", bibp(int ), (int)27));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 885098740: {
                    break block17;
                }
                case 1044008418: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = e.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = e.di - e.bhxe("bilo", bibp(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == e.bhxe("bilp", bhwy(int ), (int)78)) break;
            v2 /* !! */  = (long)e.bhxe("bilr", bhwy(int ), (int)79);
        }
        var1_3 = e.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = e.di;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - e.bhxe("bils", bibp(int ), (int)30));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1554172108: {
                            v4 = e.bhxe("bilx", bibp(int ), (int)31);
                            continue block20;
                        }
                        case -956115940: {
                            v4 = e.bhxe("bily", bibp(int ), (int)32);
                            continue block20;
                        }
                        case 885098740: {
                            break block20;
                        }
                        case 1670747984: {
                            v4 = e.bhxe("bima", bibp(int ), (int)33);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.moduleRepository;
            }
            case 0: {
                var2_2 /* !! */  = (int)e.bhxe("bimc", bhwy(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)e.bhxe("bimf", bhwy(int ), (int)81);
                if (!var3_1) break;
                throw null;
            }
lbl59:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)e.bhxe("bimh", bhwy(int ), (int)82);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)e.bhxe("bimk", bhwy(int ), (int)83);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void biqp() {
        e.bhxc[100] = 225720860;
        e.bhxc[101] = -49999478;
        e.bhxc[102] = -1146279693;
        e.bhxc[103] = 208761874;
        e.bhxc[104] = 1328019242;
        e.bhxc[105] = -304530637;
        e.bhxc[106] = 684909831;
        e.bhxc[107] = 1289008229;
        e.bhxc[108] = 1377627101;
        e.bhxc[109] = 1332373149;
        e.bhxc[110] = -1476789531;
        e.bhxc[111] = 137298633;
        e.bhxc[112] = -220918524;
        e.bhxc[113] = -210340040;
    }

    private static /* synthetic */ void biqn() {
        e.bhxc[0] = 1695302399;
        e.bhxc[1] = 637922671;
        e.bhxc[2] = 746862769;
        e.bhxc[3] = 1406631359;
        e.bhxc[4] = 1059438985;
        e.bhxc[5] = 820309606;
        e.bhxc[6] = -468633536;
        e.bhxc[7] = -380951348;
        e.bhxc[8] = 281278197;
        e.bhxc[9] = 1075607044;
        e.bhxc[10] = -260332442;
        e.bhxc[11] = 976630880;
        e.bhxc[12] = -175048916;
        e.bhxc[13] = 2043385055;
        e.bhxc[14] = -1018282838;
        e.bhxc[15] = -576721681;
        e.bhxc[16] = -1903293031;
        e.bhxc[17] = 1132449887;
        e.bhxc[18] = -1248022448;
        e.bhxc[19] = 1176866929;
        e.bhxc[20] = 2040285491;
        e.bhxc[21] = 1624529006;
        e.bhxc[22] = -1241697282;
        e.bhxc[23] = 1021342001;
        e.bhxc[24] = -634174278;
        e.bhxc[25] = -136158096;
        e.bhxc[26] = 1758678433;
        e.bhxc[27] = -2103600668;
        e.bhxc[28] = 1233497920;
        e.bhxc[29] = -182064271;
        e.bhxc[30] = 371260049;
        e.bhxc[31] = 1532977916;
        e.bhxc[32] = 709318890;
        e.bhxc[33] = 1660496797;
        e.bhxc[34] = 1539412978;
        e.bhxc[35] = -1630369474;
        e.bhxc[36] = 88131575;
        e.bhxc[37] = 1140634868;
        e.bhxc[38] = -1690036899;
        e.bhxc[39] = -253388399;
        e.bhxc[40] = -333932031;
        e.bhxc[41] = 854125373;
        e.bhxc[42] = -1513051712;
        e.bhxc[43] = -917846503;
        e.bhxc[44] = 393950595;
        e.bhxc[45] = -2136919237;
        e.bhxc[46] = -1998609790;
        e.bhxc[47] = 211384452;
        e.bhxc[48] = 21860251;
        e.bhxc[49] = 1110458142;
        e.bhxc[50] = 320866832;
        e.bhxc[51] = -287822276;
        e.bhxc[52] = -522015339;
        e.bhxc[53] = -103255040;
        e.bhxc[54] = -524617016;
        e.bhxc[55] = -1357202338;
        e.bhxc[56] = 451304437;
        e.bhxc[57] = -1878783540;
        e.bhxc[58] = 146315464;
        e.bhxc[59] = -264352579;
        e.bhxc[60] = -7688413;
        e.bhxc[61] = -1557902777;
        e.bhxc[62] = 1753104969;
        e.bhxc[63] = 475358741;
        e.bhxc[64] = -139573111;
        e.bhxc[65] = 53247927;
        e.bhxc[66] = -1026142785;
        e.bhxc[67] = -2003538202;
        e.bhxc[68] = 229211076;
        e.bhxc[69] = -1896601206;
        e.bhxc[70] = -80000524;
        e.bhxc[71] = -842750137;
        e.bhxc[72] = -409267069;
        e.bhxc[73] = 1340417156;
        e.bhxc[74] = 751987008;
        e.bhxc[75] = 452690058;
        e.bhxc[76] = 548283729;
        e.bhxc[77] = 1816140066;
        e.bhxc[78] = 1894419828;
        e.bhxc[79] = -1901495863;
        e.bhxc[80] = 156387448;
        e.bhxc[81] = -798201224;
        e.bhxc[82] = 1103055892;
        e.bhxc[83] = -129621348;
        e.bhxc[84] = -1638477776;
        e.bhxc[85] = -1886798329;
        e.bhxc[86] = 1470857237;
        e.bhxc[87] = 1125971094;
        e.bhxc[88] = -537954005;
        e.bhxc[89] = 1010339510;
        e.bhxc[90] = 284802403;
        e.bhxc[91] = -314945640;
        e.bhxc[92] = 960800856;
        e.bhxc[93] = -952800032;
        e.bhxc[94] = 1332441370;
        e.bhxc[95] = -1973184174;
        e.bhxc[96] = 925030982;
        e.bhxc[97] = -402903004;
        e.bhxc[98] = -1771039603;
        e.bhxc[99] = -17147061;
    }

    private static /* synthetic */ int bhwy(int n2) {
        return bhxb[n2] ^ bhxc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public aa getConfigSystem() {
        v0 /* !! */  = e.di;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(e.bhxe("bioj", bibp(int ), (int)40) - e.bhxe("bioh", bibp(int ), (int)39));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 885098740: {
                    break block20;
                }
                case 1516192998: {
                    continue block20;
                }
            }
            break;
        }
        var3_1 = e.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("biok", bibp(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == e.bhxe("biol", bhwy(int ), (int)94)) break;
            v1 /* !! */  = (long)e.bhxe("biom", bhwy(int ), (int)95);
        }
        var2_2 /* !! */  = e.b;
        v2 /* !! */  = e.di;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(e.bhxe("bioo", bibp(int ), (int)43) - e.bhxe("bion", bibp(int ), (int)42));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -879473010: {
                    continue block22;
                }
                case 885098740: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = e.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = e.di;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - e.bhxe("biop", bibp(int ), (int)44));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 681326813: {
                            v4 = e.bhxe("bioq", bibp(int ), (int)45);
                            continue block24;
                        }
                        case 885098740: {
                            break block24;
                        }
                        case 1335221784: {
                            v4 = e.bhxe("bios", bibp(int ), (int)46);
                            continue block24;
                        }
                        case 1942539798: {
                            v4 = e.bhxe("biot", bibp(int ), (int)47);
                            continue block24;
                        }
                    }
                    break;
                }
                return this.configSystem;
            }
            case 0: {
                var2_2 /* !! */  = (int)e.bhxe("biou", bhwy(int ), (int)96);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("biov", bhwy(int ), (int)97);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)e.bhxe("biow", bhwy(int ), (int)98);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)e.bhxe("biox", bhwy(int ), (int)99);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite bhxe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void biql() {
        e.bhxb[100] = -225720861;
        e.bhxb[101] = 2107976449;
        e.bhxb[102] = 1146279692;
        e.bhxb[103] = 1047043530;
        e.bhxb[104] = 1328019242;
        e.bhxb[105] = -304530640;
        e.bhxb[106] = 684909829;
        e.bhxb[107] = 1289008228;
        e.bhxb[108] = -1377627102;
        e.bhxb[109] = 1091002964;
        e.bhxb[110] = -1476789532;
        e.bhxb[111] = 137298633;
        e.bhxb[112] = -220918522;
        e.bhxb[113] = -210340039;
    }

    private static /* synthetic */ long bibp(int n2) {
        return bibq[n2] ^ bibs[n2];
    }

    private static /* synthetic */ void biqq() {
        e.bibq[0] = -5421157861750218969L;
        e.bibq[1] = 8748144482576632799L;
        e.bibq[2] = -325940910991181763L;
        e.bibq[3] = -8903501905575417028L;
        e.bibq[4] = -3550107655117463788L;
        e.bibq[5] = -2397671745709595537L;
        e.bibq[6] = 5205956764820397545L;
        e.bibq[7] = 6390347580953540887L;
        e.bibq[8] = 2398172666472743736L;
        e.bibq[9] = -9138954399884169327L;
        e.bibq[10] = -283432112784438102L;
        e.bibq[11] = -2470942548803383860L;
        e.bibq[12] = 3037355092349084891L;
        e.bibq[13] = -8626683914674929697L;
        e.bibq[14] = 6231202136384696180L;
        e.bibq[15] = -6016186016570995489L;
        e.bibq[16] = 3595582157624626571L;
        e.bibq[17] = 2746652729700373213L;
        e.bibq[18] = -7781916149263299532L;
        e.bibq[19] = -6115826743982465517L;
        e.bibq[20] = 5181839019368412779L;
        e.bibq[21] = 1529049355100815445L;
        e.bibq[22] = -1445469927208606589L;
        e.bibq[23] = 5326483179841116561L;
        e.bibq[24] = -3602883889466670574L;
        e.bibq[25] = -3172551679762126517L;
        e.bibq[26] = 8047220148473907828L;
        e.bibq[27] = -2116371857388055139L;
        e.bibq[28] = -9085464313955632507L;
        e.bibq[29] = 2323143543636667241L;
        e.bibq[30] = 6244758527469271807L;
        e.bibq[31] = -307198163810380920L;
        e.bibq[32] = -6701934885587416996L;
        e.bibq[33] = 8088681343302507696L;
        e.bibq[34] = 6076396101650167338L;
        e.bibq[35] = 388047569715988207L;
        e.bibq[36] = -7908970567614116492L;
        e.bibq[37] = -6454905804620518377L;
        e.bibq[38] = -4968209267791987087L;
        e.bibq[39] = -4726842164290356227L;
        e.bibq[40] = -1914929172405852096L;
        e.bibq[41] = 3204082856574116237L;
        e.bibq[42] = 1767729813840590541L;
        e.bibq[43] = 4946529893377486780L;
        e.bibq[44] = -8988596455405078449L;
        e.bibq[45] = 398175163277557355L;
        e.bibq[46] = 963038242527947549L;
        e.bibq[47] = 325550550480558472L;
        e.bibq[48] = 6606467040177027379L;
        e.bibq[49] = 5367886215020099953L;
        e.bibq[50] = 2469941216854849112L;
        e.bibq[51] = -3199790265914472797L;
        e.bibq[52] = 2214576180033020396L;
        e.bibq[53] = 2224107922773639427L;
        e.bibq[54] = 8282652280610995931L;
        e.bibq[55] = -2720383569118382778L;
        e.bibq[56] = 1132989803604249233L;
        e.bibq[57] = 8871800156733654638L;
        e.bibq[58] = 5648012284267467025L;
        e.bibq[59] = 8000829154202996193L;
        e.bibq[60] = -2180789538688111725L;
        e.bibq[61] = 4476085069714400553L;
        e.bibq[62] = 5867921365732283347L;
        e.bibq[63] = -2843768040273149212L;
        e.bibq[64] = 5068523341464214384L;
        e.bibq[65] = -2925988765013332481L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ax getEventManager() {
        v0 /* !! */  = e.di;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - e.bhxe("bihs", bibp(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1908992915: {
                    v1 = e.bhxe("bihw", bibp(int ), (int)7);
                    continue block24;
                }
                case -1143455734: {
                    v1 = e.bhxe("bihx", bibp(int ), (int)8);
                    continue block24;
                }
                case 885098740: {
                    break block24;
                }
                case 1759112209: {
                    v1 = e.bhxe("bihy", bibp(int ), (int)9);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = e.c;
        v2 /* !! */  = e.di;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - e.bhxe("biia", bibp(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -955842143: {
                    v3 = e.bhxe("biid", bibp(int ), (int)11);
                    continue block25;
                }
                case 885098740: {
                    break block25;
                }
                case 1163870393: {
                    v3 = e.bhxe("biih", bibp(int ), (int)12);
                    continue block25;
                }
                case 2073246622: {
                    v3 = e.bhxe("biii", bibp(int ), (int)13);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = e.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("biiq", bibp(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == e.bhxe("biir", bhwy(int ), (int)60)) break;
            v4 /* !! */  = (long)e.bhxe("biis", bhwy(int ), (int)61);
        }
        var1_3 = e.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = e.di;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - e.bhxe("biiv", bibp(int ), (int)15));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1490641775: {
                            v6 = e.bhxe("biiy", bibp(int ), (int)16);
                            continue block28;
                        }
                        case -758052878: {
                            v6 = e.bhxe("bija", bibp(int ), (int)17);
                            continue block28;
                        }
                        case 885098740: {
                            break block28;
                        }
                        case 1772027443: {
                            v6 = e.bhxe("bijh", bibp(int ), (int)18);
                            continue block28;
                        }
                    }
                    break;
                }
                return this.eventManager;
            }
            case 0: {
                var2_2 /* !! */  = (int)e.bhxe("bijk", bhwy(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("bijm", bhwy(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)e.bhxe("bijn", bhwy(int ), (int)64);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)e.bhxe("bijo", bhwy(int ), (int)65);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public av getHudManager() {
        v0 /* !! */  = e.di;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - e.bhxe("bipr", bibp(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -940757034: {
                    v1 = e.bhxe("bips", bibp(int ), (int)57);
                    continue block21;
                }
                case -362510961: {
                    v1 = e.bhxe("bipt", bibp(int ), (int)58);
                    continue block21;
                }
                case 885098740: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = e.c;
        v2 /* !! */  = e.di;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - e.bhxe("bipu", bibp(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -880141163: {
                    v3 = e.bhxe("bipv", bibp(int ), (int)60);
                    continue block22;
                }
                case 885098740: {
                    break block22;
                }
                case 1167832429: {
                    v3 = e.bhxe("bipx", bibp(int ), (int)61);
                    continue block22;
                }
                case 1362053838: {
                    v3 = e.bhxe("bipy", bibp(int ), (int)62);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = e.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("bipz", bibp(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == e.bhxe("biqa", bhwy(int ), (int)108)) break;
            v4 /* !! */  = (long)e.bhxe("biqb", bhwy(int ), (int)109);
        }
        var1_3 = e.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v5 /* !! */  = e.di;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v5 /* !! */  = (long)(e.bhxe("biqd", bibp(int ), (int)65) - e.bhxe("biqc", bibp(int ), (int)64));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -296789359: {
                            continue block25;
                        }
                        case 885098740: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.hudManager;
lbl56:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)e.bhxe("biqe", bhwy(int ), (int)110);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)e.bhxe("biqf", bhwy(int ), (int)111);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)e.bhxe("biqg", bhwy(int ), (int)112);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)e.bhxe("biqh", bhwy(int ), (int)113);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    static {
        bhxb = new int[114];
        bhxc = new int[114];
        e.biqj();
        e.biql();
        e.biqn();
        e.biqp();
        bibq = new long[66];
        bibs = new long[66];
        e.biqq();
        e.biqs();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public e() {
        var2_1 /* !! */  = e.b;
        super();
        this.attackPerpetrator = new hv();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.hudManager = new av();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)e.bhxe("bhxl", bhwy(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)e.bhxe("bhxm", bhwy(int ), (int)1);
                    break block0;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)e.bhxe("bhxn", bhwy(int ), (int)2);
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)e.bhxe("bhxo", bhwy(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public g getCommandManager() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = e.di - e.bhxe("bioz", bibp(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == e.bhxe("bipa", bhwy(int ), (int)100)) break;
            v0 /* !! */  = (long)e.bhxe("bipb", bhwy(int ), (int)101);
        }
        var3_1 = e.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = e.di - e.bhxe("bipd", bibp(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == e.bhxe("bipe", bhwy(int ), (int)102)) break;
            v1 /* !! */  = (long)e.bhxe("bipf", bhwy(int ), (int)103);
        }
        var2_2 /* !! */  = e.b;
        v2 /* !! */  = e.di;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(e.bhxe("biph", bibp(int ), (int)51) - e.bhxe("bipg", bibp(int ), (int)50));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -916808209: {
                    continue block18;
                }
                case 885098740: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = e.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = e.di;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - e.bhxe("bipi", bibp(int ), (int)52));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -35385920: {
                            v4 = e.bhxe("bipj", bibp(int ), (int)53);
                            continue block20;
                        }
                        case 885098740: {
                            break block20;
                        }
                        case 1587280888: {
                            v4 = e.bhxe("bipk", bibp(int ), (int)54);
                            continue block20;
                        }
                        case 2038443651: {
                            v4 = e.bhxe("bipl", bibp(int ), (int)55);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.commandManager;
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)e.bhxe("bipm", bhwy(int ), (int)104);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)e.bhxe("bipn", bhwy(int ), (int)105);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)e.bhxe("bipp", bhwy(int ), (int)106);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)e.bhxe("bipq", bhwy(int ), (int)107);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void init() {
        var3_1 = e.c;
        var2_2 /* !! */  = e.b;
        var1_3 = e.a;
        if (var3_1) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        dn.getInstance().init();
        if (var1_3 || var1_3) ** GOTO lbl6
        ah.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        ak.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        am.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        ao.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        an.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        aj.getInstance().load();
        if (var1_3 || var1_3) ** GOTO lbl6
        ag.getInstance();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.eventManager = new ax();
        if (var1_3 || var1_3) ** GOTO lbl6
        ot.INSTANCE.init();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.hudManager = new av();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.hudManager.initElements();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.moduleRepository = new dr();
        if (var1_3 || var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.moduleRepository.setup();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.moduleProvider = new dq(this.moduleRepository.modules());
                if (var1_3 || var1_3) ** GOTO lbl6
                this.moduleSwitcher = new dt(this.moduleRepository.modules(), this.eventManager);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.configSystem = new aa();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.configSystem.init();
                if (var1_3 || var1_3) ** GOTO lbl6
                aq.getInstance().init();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.commandManager = new g();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.commandManager.init();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl56:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)e.bhxe("bhyg", bhwy(int ), (int)4);
                if (var3_1) {
                    throw null;
                }
            }
lbl60:
            // 6 sources

            case 1: {
                var2_2 /* !! */  = (int)e.bhxe("bhyj", bhwy(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl65:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)e.bhxe("bhyl", bhwy(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 3: {
                var2_2 /* !! */  = (int)e.bhxe("bhym", bhwy(int ), (int)7);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 4: {
                var2_2 /* !! */  = (int)e.bhxe("bhyo", bhwy(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl80:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)e.bhxe("bhyp", bhwy(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)e.bhxe("bhyq", bhwy(int ), (int)10);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)e.bhxe("bhyv", bhwy(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 8: {
                var2_2 /* !! */  = (int)e.bhxe("bhyx", bhwy(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl100:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)e.bhxe("bhyz", bhwy(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl105:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)e.bhxe("bhza", bhwy(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 11: {
                var2_2 /* !! */  = (int)e.bhxe("bhzb", bhwy(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 12: {
                var2_2 /* !! */  = (int)e.bhxe("bhzc", bhwy(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 13: {
                var2_2 /* !! */  = (int)e.bhxe("bhze", bhwy(int ), (int)17);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl124:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)e.bhxe("bhzi", bhwy(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl129:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)e.bhxe("bhzl", bhwy(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl134:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)e.bhxe("bhzn", bhwy(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 17: {
                var2_2 /* !! */  = (int)e.bhxe("bhzo", bhwy(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 18: {
                var2_2 /* !! */  = (int)e.bhxe("bhzp", bhwy(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl149:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)e.bhxe("bhzr", bhwy(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl154:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)e.bhxe("bhzt", bhwy(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl159:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)e.bhxe("bhzy", bhwy(int ), (int)25);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
lbl163:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)e.bhxe("biaa", bhwy(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 23: {
                var2_2 /* !! */  = (int)e.bhxe("biab", bhwy(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl173:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)e.bhxe("biac", bhwy(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl178:
            // 2 sources

            case 25: {
                var2_2 /* !! */  = (int)e.bhxe("biad", bhwy(int ), (int)29);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 26: {
                var2_2 /* !! */  = (int)e.bhxe("biag", bhwy(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl187:
            // 3 sources

            case 27: {
                var2_2 /* !! */  = (int)e.bhxe("biai", bhwy(int ), (int)31);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
lbl191:
            // 2 sources

            case 28: {
                var2_2 /* !! */  = (int)e.bhxe("biam", bhwy(int ), (int)32);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
lbl195:
            // 2 sources

            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)e.bhxe("biao", bhwy(int ), (int)33);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                    break;
                }
            }
lbl201:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)e.bhxe("biap", bhwy(int ), (int)34);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
lbl205:
            // 4 sources

            case 31: {
                var2_2 /* !! */  = (int)e.bhxe("biaq", bhwy(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 32: {
                var2_2 /* !! */  = (int)e.bhxe("biar", bhwy(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
            }
lbl214:
            // 4 sources

            case 33: {
                var2_2 /* !! */  = (int)e.bhxe("biat", bhwy(int ), (int)37);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl218:
            // 2 sources

            case 34: {
                var2_2 /* !! */  = (int)e.bhxe("biau", bhwy(int ), (int)38);
                if (!var3_1) ** GOTO lbl191
                throw null;
            }
lbl222:
            // 6 sources

            case 35: {
                var2_2 /* !! */  = (int)e.bhxe("biay", bhwy(int ), (int)39);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 36: {
                var2_2 /* !! */  = (int)e.bhxe("biaz", bhwy(int ), (int)40);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl230:
            // 3 sources

            case 37: {
                var2_2 /* !! */  = (int)e.bhxe("biba", bhwy(int ), (int)41);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
lbl234:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)e.bhxe("bibc", bhwy(int ), (int)42);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
            case 39: {
                var2_2 /* !! */  = (int)e.bhxe("bibd", bhwy(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 40: {
                var2_2 /* !! */  = (int)e.bhxe("bibe", bhwy(int ), (int)44);
                if (!var3_1) ** GOTO lbl205
                throw null;
            }
            case 41: {
                var2_2 /* !! */  = (int)e.bhxe("bibf", bhwy(int ), (int)45);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
lbl251:
            // 2 sources

            case 42: {
                var2_2 /* !! */  = (int)e.bhxe("bibh", bhwy(int ), (int)46);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 43: {
                var2_2 /* !! */  = (int)e.bhxe("bibj", bhwy(int ), (int)47);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
lbl259:
            // 4 sources

            case 44: {
                var2_2 /* !! */  = (int)e.bhxe("bibk", bhwy(int ), (int)48);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
            case 45: 
        }
        var2_2 /* !! */  = (int)e.bhxe("bibm", bhwy(int ), (int)49);
        ** while (!var3_1)
lbl266:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public dq getModuleProvider() {
        while (true) {
            block27: {
                if ((v0 /* !! */  = (cfr_temp_1 = e.di - e.bhxe("bijq", bibp(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != e.bhxe("bijv", bhwy(int ), (int)66)) break block27;
                var3_1 = e.c;
                v1 /* !! */  = e.di;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)e.bhxe("bijw", bhwy(int ), (int)67);
        }
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - e.bhxe("bijx", bibp(int ), (int)20));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1659980123: {
                    v2 = e.bhxe("bijz", bibp(int ), (int)21);
                    continue block13;
                }
                case 732616842: {
                    v2 = e.bhxe("bika", bibp(int ), (int)22);
                    continue block13;
                }
                case 885098740: {
                    break block13;
                }
                case 1822564274: {
                    v2 = e.bhxe("bikb", bibp(int ), (int)23);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = e.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = e.di - e.bhxe("bikh", bibp(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == e.bhxe("bikj", bhwy(int ), (int)68)) {
                var1_3 = e.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)e.bhxe("bikk", bhwy(int ), (int)69);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block15: while (true) {
            block28: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = e.di - e.bhxe("bikl", bibp(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == e.bhxe("bikn", bhwy(int ), (int)70)) {
                                return this.moduleProvider;
                            }
                            v4 /* !! */  = (long)e.bhxe("bikp", bhwy(int ), (int)71);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)e.bhxe("bikr", bhwy(int ), (int)72);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block28;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)e.bhxe("bikx", bhwy(int ), (int)75);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)e.bhxe("biks", bhwy(int ), (int)73);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl70
            }
            do {
                if (true) continue block15;
lbl70:
                // 2 sources

                var2_2 /* !! */  = (int)e.bhxe("bikv", bhwy(int ), (int)74);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void biqj() {
        e.bhxb[0] = 1695302399;
        e.bhxb[1] = 637922669;
        e.bhxb[2] = 746862771;
        e.bhxb[3] = 1406631358;
        e.bhxb[4] = 1059438993;
        e.bhxb[5] = 820309601;
        e.bhxb[6] = -468633530;
        e.bhxb[7] = -380951341;
        e.bhxb[8] = 281278196;
        e.bhxb[9] = 1075607067;
        e.bhxb[10] = -260332440;
        e.bhxb[11] = 976630881;
        e.bhxb[12] = -175048899;
        e.bhxb[13] = 2043385042;
        e.bhxb[14] = -1018282822;
        e.bhxb[15] = -576721723;
        e.bhxb[16] = -1903293056;
        e.bhxb[17] = 1132449909;
        e.bhxb[18] = -1248022433;
        e.bhxb[19] = 1176866941;
        e.bhxb[20] = 2040285475;
        e.bhxb[21] = 1624528993;
        e.bhxb[22] = -1241697312;
        e.bhxb[23] = 1021342014;
        e.bhxb[24] = -634174286;
        e.bhxb[25] = -136158118;
        e.bhxb[26] = 1758678411;
        e.bhxb[27] = -2103600646;
        e.bhxb[28] = 1233497943;
        e.bhxb[29] = -182064265;
        e.bhxb[30] = 371260049;
        e.bhxb[31] = 1532977899;
        e.bhxb[32] = 709318884;
        e.bhxb[33] = 1660496829;
        e.bhxb[34] = 1539412960;
        e.bhxb[35] = -1630369500;
        e.bhxb[36] = 88131562;
        e.bhxb[37] = 1140634844;
        e.bhxb[38] = -1690036920;
        e.bhxb[39] = -253388387;
        e.bhxb[40] = -333932022;
        e.bhxb[41] = 854125338;
        e.bhxb[42] = -1513051707;
        e.bhxb[43] = -917846466;
        e.bhxb[44] = 393950626;
        e.bhxb[45] = -2136919257;
        e.bhxb[46] = -1998609780;
        e.bhxb[47] = 211384459;
        e.bhxb[48] = 21860246;
        e.bhxb[49] = 1110458172;
        e.bhxb[50] = -320866833;
        e.bhxb[51] = 1593644150;
        e.bhxb[52] = -522015340;
        e.bhxb[53] = 925371310;
        e.bhxb[54] = 524617015;
        e.bhxb[55] = 500158302;
        e.bhxb[56] = 451304439;
        e.bhxb[57] = -1878783539;
        e.bhxb[58] = 146315465;
        e.bhxb[59] = -264352578;
        e.bhxb[60] = -7688414;
        e.bhxb[61] = 345864724;
        e.bhxb[62] = 1753104970;
        e.bhxb[63] = 475358743;
        e.bhxb[64] = -139573112;
        e.bhxb[65] = 53247927;
        e.bhxb[66] = -1026142786;
        e.bhxb[67] = 631358777;
        e.bhxb[68] = -229211077;
        e.bhxb[69] = 797793957;
        e.bhxb[70] = -80000523;
        e.bhxb[71] = -1811353233;
        e.bhxb[72] = -409267069;
        e.bhxb[73] = 1340417156;
        e.bhxb[74] = 751987011;
        e.bhxb[75] = 452690057;
        e.bhxb[76] = 548283728;
        e.bhxb[77] = 1350554669;
        e.bhxb[78] = -1894419829;
        e.bhxb[79] = -1585708066;
        e.bhxb[80] = 156387448;
        e.bhxb[81] = -798201223;
        e.bhxb[82] = 1103055892;
        e.bhxb[83] = -129621348;
        e.bhxb[84] = -1638477775;
        e.bhxb[85] = 562475964;
        e.bhxb[86] = -1470857238;
        e.bhxb[87] = -2334191;
        e.bhxb[88] = 537954004;
        e.bhxb[89] = 580606628;
        e.bhxb[90] = 284802400;
        e.bhxb[91] = -314945639;
        e.bhxb[92] = 960800857;
        e.bhxb[93] = -952800030;
        e.bhxb[94] = -1332441371;
        e.bhxb[95] = 92722081;
        e.bhxb[96] = 925030980;
        e.bhxb[97] = -402903001;
        e.bhxb[98] = -1771039603;
        e.bhxb[99] = -17147061;
    }

    private static /* synthetic */ void biqs() {
        e.bibs[0] = 4775571430043956643L;
        e.bibs[1] = -2630144236305209796L;
        e.bibs[2] = 3557996763414583582L;
        e.bibs[3] = -8057990533232543198L;
        e.bibs[4] = -2825976883148352908L;
        e.bibs[5] = 106424566841553432L;
        e.bibs[6] = -58693590564800626L;
        e.bibs[7] = -6521983361178717106L;
        e.bibs[8] = 6398170563748237643L;
        e.bibs[9] = 5248792303339055866L;
        e.bibs[10] = 4855415851072643839L;
        e.bibs[11] = 2384413411101732203L;
        e.bibs[12] = -2395886008177657753L;
        e.bibs[13] = 6638187466568220642L;
        e.bibs[14] = -7987749649768362501L;
        e.bibs[15] = 6080666683128503579L;
        e.bibs[16] = 1501641382175023489L;
        e.bibs[17] = -4805048044694882424L;
        e.bibs[18] = -7167722099479178745L;
        e.bibs[19] = 383617071719284381L;
        e.bibs[20] = -3818903924709874377L;
        e.bibs[21] = 129745160471251639L;
        e.bibs[22] = -1420254510812107608L;
        e.bibs[23] = -1738799364964664144L;
        e.bibs[24] = -2810526638137095655L;
        e.bibs[25] = 4759134170573967369L;
        e.bibs[26] = -285281205948586348L;
        e.bibs[27] = 2511394218707449592L;
        e.bibs[28] = 3389045197144606695L;
        e.bibs[29] = -3147069572235765741L;
        e.bibs[30] = -4196429137208960729L;
        e.bibs[31] = 8740218899803697701L;
        e.bibs[32] = 3967815356140748994L;
        e.bibs[33] = 3169971105946156122L;
        e.bibs[34] = -2070755606943118383L;
        e.bibs[35] = -8640715293667322747L;
        e.bibs[36] = 4577021855442236407L;
        e.bibs[37] = -4059862213638660634L;
        e.bibs[38] = -249900202061423203L;
        e.bibs[39] = 3491068690338794307L;
        e.bibs[40] = 2068454659269595052L;
        e.bibs[41] = 1367801555348436981L;
        e.bibs[42] = -6056075063937510228L;
        e.bibs[43] = 2376041661609131649L;
        e.bibs[44] = -5617231622556252419L;
        e.bibs[45] = 6917135806818709615L;
        e.bibs[46] = 3672203961574581573L;
        e.bibs[47] = 387185935067878448L;
        e.bibs[48] = 7504069140006170412L;
        e.bibs[49] = 322315713374135508L;
        e.bibs[50] = -236130536015049294L;
        e.bibs[51] = -350714642577955406L;
        e.bibs[52] = 8448862855411375849L;
        e.bibs[53] = -670136671296220033L;
        e.bibs[54] = -6001264492892342305L;
        e.bibs[55] = 4542103942552151200L;
        e.bibs[56] = -1778344868597169426L;
        e.bibs[57] = 494562043992886686L;
        e.bibs[58] = -8027324533602786313L;
        e.bibs[59] = -7573884407256836054L;
        e.bibs[60] = 7757730326300603596L;
        e.bibs[61] = 7867972729624355277L;
        e.bibs[62] = 1360306252105026415L;
        e.bibs[63] = -5265695551283605689L;
        e.bibs[64] = 6361181441030572705L;
        e.bibs[65] = 7761303620420417093L;
    }
}

