/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class iy$EntityType
extends Enum<iy$EntityType> {
    public static final int b;
    public static final boolean c;
    private static long[] dkfb;
    protected static final long ho = -4404708240282039152L;
    public static final /* enum */ iy$EntityType VILLAGER;
    public static final /* enum */ iy$EntityType ZOMBIE_VILLAGER;
    private static final /* synthetic */ iy$EntityType[] $VALUES;
    private static int[] dkfh;
    private final int color;
    private static long[] dkfc;
    private final String entityName;
    public static final boolean a;
    private static int[] dkfg;

    private static /* synthetic */ int dkff(int n2) {
        return dkfg[n2] ^ dkfh[n2];
    }

    private static /* synthetic */ void dkhs() {
        iy$EntityType.dkfg[0] = 1066977261;
        iy$EntityType.dkfg[1] = 1033167416;
        iy$EntityType.dkfg[2] = 1822006462;
        iy$EntityType.dkfg[3] = 2142984152;
        iy$EntityType.dkfg[4] = -689310126;
        iy$EntityType.dkfg[5] = -825161214;
        iy$EntityType.dkfg[6] = -876000028;
        iy$EntityType.dkfg[7] = 49201156;
        iy$EntityType.dkfg[8] = -125009738;
        iy$EntityType.dkfg[9] = 618536728;
        iy$EntityType.dkfg[10] = -851144780;
        iy$EntityType.dkfg[11] = 389239669;
        iy$EntityType.dkfg[12] = 276922735;
        iy$EntityType.dkfg[13] = -638964146;
        iy$EntityType.dkfg[14] = -107433026;
        iy$EntityType.dkfg[15] = 127402370;
        iy$EntityType.dkfg[16] = 418358745;
        iy$EntityType.dkfg[17] = -1141381104;
        iy$EntityType.dkfg[18] = -637991270;
        iy$EntityType.dkfg[19] = 923465165;
        iy$EntityType.dkfg[20] = 165043887;
        iy$EntityType.dkfg[21] = 1613026127;
        iy$EntityType.dkfg[22] = -505220793;
        iy$EntityType.dkfg[23] = 1530236440;
        iy$EntityType.dkfg[24] = 1160210912;
        iy$EntityType.dkfg[25] = -1796008871;
        iy$EntityType.dkfg[26] = -1066312131;
        iy$EntityType.dkfg[27] = -1343497943;
        iy$EntityType.dkfg[28] = 1279922519;
        iy$EntityType.dkfg[29] = 1944338138;
        iy$EntityType.dkfg[30] = -867281277;
        iy$EntityType.dkfg[31] = -319176998;
        iy$EntityType.dkfg[32] = -1061079574;
        iy$EntityType.dkfg[33] = -969676958;
        iy$EntityType.dkfg[34] = 1153755696;
        iy$EntityType.dkfg[35] = -875046299;
        iy$EntityType.dkfg[36] = 1634108117;
        iy$EntityType.dkfg[37] = 1264716777;
        iy$EntityType.dkfg[38] = -1266218285;
        iy$EntityType.dkfg[39] = -712184142;
    }

    static {
        dkfg = new int[40];
        dkfh = new int[40];
        iy$EntityType.dkhs();
        iy$EntityType.dkht();
        dkfb = new long[23];
        dkfc = new long[23];
        iy$EntityType.dkhu();
        iy$EntityType.dkhv();
        VILLAGER = new iy$EntityType("villager", (int)iy$EntityType.dkfd("dkhp", dkff(int ), (int)37));
        ZOMBIE_VILLAGER = new iy$EntityType("zombie_villager", (int)iy$EntityType.dkfd("dkhr", dkff(int ), (int)39));
        $VALUES = iy$EntityType.$values();
    }

    private static /* synthetic */ void dkhu() {
        iy$EntityType.dkfb[0] = -5063034322498574754L;
        iy$EntityType.dkfb[1] = -1676242835765147813L;
        iy$EntityType.dkfb[2] = 5874942469523361367L;
        iy$EntityType.dkfb[3] = -3904782807794697615L;
        iy$EntityType.dkfb[4] = 3170667061499037334L;
        iy$EntityType.dkfb[5] = -293403016871074356L;
        iy$EntityType.dkfb[6] = 1297284191735486983L;
        iy$EntityType.dkfb[7] = -3689204048342739207L;
        iy$EntityType.dkfb[8] = 7045857425469562787L;
        iy$EntityType.dkfb[9] = 3707855075158717797L;
        iy$EntityType.dkfb[10] = -8855531764255984539L;
        iy$EntityType.dkfb[11] = -6029883941322485239L;
        iy$EntityType.dkfb[12] = -3261868462962485527L;
        iy$EntityType.dkfb[13] = 5918535185626160938L;
        iy$EntityType.dkfb[14] = -8061421269003615171L;
        iy$EntityType.dkfb[15] = 4725433921199541353L;
        iy$EntityType.dkfb[16] = -1038749735303479957L;
        iy$EntityType.dkfb[17] = 5995511835612166851L;
        iy$EntityType.dkfb[18] = 5947900980946333665L;
        iy$EntityType.dkfb[19] = -3562456704035871327L;
        iy$EntityType.dkfb[20] = -6469870868043393760L;
        iy$EntityType.dkfb[21] = 8116271844366841267L;
        iy$EntityType.dkfb[22] = -5919499373265745832L;
    }

    private static /* synthetic */ void dkht() {
        iy$EntityType.dkfh[0] = 1066977260;
        iy$EntityType.dkfh[1] = 919007218;
        iy$EntityType.dkfh[2] = -1822006463;
        iy$EntityType.dkfh[3] = -2135350701;
        iy$EntityType.dkfh[4] = 689310125;
        iy$EntityType.dkfh[5] = 1707819139;
        iy$EntityType.dkfh[6] = -876000027;
        iy$EntityType.dkfh[7] = -15834366;
        iy$EntityType.dkfh[8] = -125009738;
        iy$EntityType.dkfh[9] = 618536731;
        iy$EntityType.dkfh[10] = -851144778;
        iy$EntityType.dkfh[11] = 389239668;
        iy$EntityType.dkfh[12] = 276922734;
        iy$EntityType.dkfh[13] = -1243756513;
        iy$EntityType.dkfh[14] = 107433025;
        iy$EntityType.dkfh[15] = 1870369825;
        iy$EntityType.dkfh[16] = 418358744;
        iy$EntityType.dkfh[17] = -1141381101;
        iy$EntityType.dkfh[18] = -637991270;
        iy$EntityType.dkfh[19] = 923465166;
        iy$EntityType.dkfh[20] = 165043887;
        iy$EntityType.dkfh[21] = 1613026124;
        iy$EntityType.dkfh[22] = -505220797;
        iy$EntityType.dkfh[23] = 1530236444;
        iy$EntityType.dkfh[24] = 1160210916;
        iy$EntityType.dkfh[25] = 1796008870;
        iy$EntityType.dkfh[26] = 1335616669;
        iy$EntityType.dkfh[27] = 1343497942;
        iy$EntityType.dkfh[28] = -805189370;
        iy$EntityType.dkfh[29] = 1944338138;
        iy$EntityType.dkfh[30] = -867281278;
        iy$EntityType.dkfh[31] = 319176997;
        iy$EntityType.dkfh[32] = -1061079573;
        iy$EntityType.dkfh[33] = -969676959;
        iy$EntityType.dkfh[34] = 1153755696;
        iy$EntityType.dkfh[35] = -875046299;
        iy$EntityType.dkfh[36] = 1634108117;
        iy$EntityType.dkfh[37] = 1261958166;
        iy$EntityType.dkfh[38] = -1266218286;
        iy$EntityType.dkfh[39] = -713835545;
    }

    public static /* synthetic */ CallSite dkfd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dkhv() {
        iy$EntityType.dkfc[0] = 1285681657229506923L;
        iy$EntityType.dkfc[1] = -5083428857519981654L;
        iy$EntityType.dkfc[2] = -8326604079254377775L;
        iy$EntityType.dkfc[3] = 4845354969255598400L;
        iy$EntityType.dkfc[4] = -2232654028362835587L;
        iy$EntityType.dkfc[5] = 982551229326577989L;
        iy$EntityType.dkfc[6] = -7496588677077134044L;
        iy$EntityType.dkfc[7] = 7993558410168923084L;
        iy$EntityType.dkfc[8] = 2882553858326852873L;
        iy$EntityType.dkfc[9] = 3707213782832527881L;
        iy$EntityType.dkfc[10] = 2561840176329221128L;
        iy$EntityType.dkfc[11] = -1143347493276318568L;
        iy$EntityType.dkfc[12] = 5928724788283359703L;
        iy$EntityType.dkfc[13] = 5946701473038214826L;
        iy$EntityType.dkfc[14] = 6591576201826115566L;
        iy$EntityType.dkfc[15] = 6952434051214842309L;
        iy$EntityType.dkfc[16] = 5487182496549952512L;
        iy$EntityType.dkfc[17] = -7357925688962491239L;
        iy$EntityType.dkfc[18] = -8130894688198640239L;
        iy$EntityType.dkfc[19] = 6907427930287596805L;
        iy$EntityType.dkfc[20] = 3519392818967878931L;
        iy$EntityType.dkfc[21] = 2110919134272878456L;
        iy$EntityType.dkfc[22] = -8913625485993533948L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iy$EntityType[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iy$EntityType.ho - iy$EntityType.dkfd("dkfe", dkfa(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iy$EntityType.dkfd("dkfi", dkff(int ), (int)0)) break;
            v0 /* !! */  = (long)iy$EntityType.dkfd("dkfj", dkff(int ), (int)1);
        }
        var2 = iy$EntityType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iy$EntityType.ho - iy$EntityType.dkfd("dkfk", dkfa(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy$EntityType.dkfd("dkfl", dkff(int ), (int)2)) break;
            v1 /* !! */  = (long)iy$EntityType.dkfd("dkfm", dkff(int ), (int)3);
        }
        var1_1 = iy$EntityType.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = iy$EntityType.ho - iy$EntityType.dkfd("dkfn", dkfa(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy$EntityType.dkfd("dkfo", dkff(int ), (int)4)) break;
            v2 /* !! */  = (long)iy$EntityType.dkfd("dkfp", dkff(int ), (int)5);
        }
        var0_2 = iy$EntityType.a;
        if (var2) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl27:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = iy$EntityType.ho - iy$EntityType.dkfd("dkfq", dkfa(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iy$EntityType.dkfd("dkfr", dkff(int ), (int)6)) break;
            v3 /* !! */  = (long)iy$EntityType.dkfd("dkfs", dkff(int ), (int)7);
        }
        v4 /* !! */  = iy$EntityType.ho;
        if (true) ** GOTO lbl37
        block11: while (true) {
            v4 /* !! */  = (long)(v5 - iy$EntityType.dkfd("dkft", dkfa(int ), (int)4));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1357035368: {
                    v5 = iy$EntityType.dkfd("dkfu", dkfa(int ), (int)5);
                    continue block11;
                }
                case -894915768: {
                    v5 = iy$EntityType.dkfd("dkfv", dkfa(int ), (int)6);
                    continue block11;
                }
                case 40768888: {
                    v5 = iy$EntityType.dkfd("dkfw", dkfa(int ), (int)7);
                    continue block11;
                }
                case 1321258128: {
                    break block11;
                }
            }
            break;
        }
        return (iy$EntityType[])iy$EntityType.$VALUES.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ iy$EntityType[] $values() {
        boolean bl2;
        Object object = ho;
        block9: while (true) {
            switch ((int)object) {
                case -924851826: {
                    object = iy$EntityType.dkfd("dkgw", dkfa(int ), (int)16) - iy$EntityType.dkfd("dkgv", dkfa(int ), (int)15);
                    continue block9;
                }
                case 1321258128: {
                    break block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ho - iy$EntityType.dkfd("dkgx", dkfa(int ), (int)17)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == iy$EntityType.dkfd("dkgy", dkff(int ), (int)25)) break;
            object2 = iy$EntityType.dkfd("dkgz", dkff(int ), (int)26);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ho - iy$EntityType.dkfd("dkha", dkfa(int ), (int)18)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == iy$EntityType.dkfd("dkhb", dkff(int ), (int)27)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = iy$EntityType.dkfd("dkhc", dkff(int ), (int)28);
        }
        if (bl2 || bl2) {
            return null;
        }
        iy$EntityType[] iy$EntityTypeArray = new iy$EntityType[2];
        CallSite callSite = iy$EntityType.dkfd("dkhd", dkff(int ), (int)29);
        Object object4 = ho;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite2 - iy$EntityType.dkfd("dkhe", dkfa(int ), (int)19);
            }
            switch ((int)object4) {
                case 411158831: {
                    callSite2 = iy$EntityType.dkfd("dkhf", dkfa(int ), (int)20);
                    continue block12;
                }
                case 1321258128: {
                    break block12;
                }
                case 1841350915: {
                    callSite2 = iy$EntityType.dkfd("dkhg", dkfa(int ), (int)21);
                    continue block12;
                }
            }
            break;
        }
        iy$EntityTypeArray[callSite] = VILLAGER;
        CallSite callSite3 = iy$EntityType.dkfd("dkhh", dkff(int ), (int)30);
        while (true) {
            long l4;
            long l5;
            if ((l5 = (l4 = ho - iy$EntityType.dkfd("dkhi", dkfa(int ), (int)22)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (l5 == iy$EntityType.dkfd("dkhj", dkff(int ), (int)31)) {
                iy$EntityTypeArray[callSite3] = ZOMBIE_VILLAGER;
                return iy$EntityTypeArray;
            }
            l5 = -1560518356;
        }
    }

    private static /* synthetic */ long dkfa(int n2) {
        return dkfb[n2] ^ dkfc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private iy$EntityType(String var3_3, int var4_4) {
        var6_5 /* !! */  = iy$EntityType.b;
        var5_6 = iy$EntityType.a;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                this.entityName = var3_3;
                this.color = var4_4;
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)iy$EntityType.dkfd("dkgq", dkff(int ), (int)20);
                ** GOTO lbl16
            }
            case 1: {
                var6_5 /* !! */  = (int)iy$EntityType.dkfd("dkgr", dkff(int ), (int)21);
                ** GOTO lbl10
            }
lbl16:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)iy$EntityType.dkfd("dkgs", dkff(int ), (int)22);
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)iy$EntityType.dkfd("dkgt", dkff(int ), (int)23);
                    ** GOTO lbl10
                    break;
                }
            }
            case 4: 
        }
        var6_5 /* !! */  = (int)iy$EntityType.dkfd("dkgu", dkff(int ), (int)24);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iy$EntityType valueOf(String var0) {
        v0 /* !! */  = iy$EntityType.ho;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(iy$EntityType.dkfd("dkgc", dkfa(int ), (int)9) - iy$EntityType.dkfd("dkgb", dkfa(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1872339076: {
                    continue block15;
                }
                case 1321258128: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = iy$EntityType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = iy$EntityType.ho - iy$EntityType.dkfd("dkgd", dkfa(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iy$EntityType.dkfd("dkge", dkff(int ), (int)12)) break;
            v1 /* !! */  = (long)iy$EntityType.dkfd("dkgf", dkff(int ), (int)13);
        }
        var2_2 /* !! */  = iy$EntityType.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = iy$EntityType.ho - iy$EntityType.dkfd("dkgg", dkfa(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iy$EntityType.dkfd("dkgh", dkff(int ), (int)14)) break;
            v2 /* !! */  = (long)iy$EntityType.dkfd("dkgi", dkff(int ), (int)15);
        }
        var1_3 = iy$EntityType.a;
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
                v3 /* !! */  = iy$EntityType.ho;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - iy$EntityType.dkfd("dkgj", dkfa(int ), (int)12));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1887650006: {
                            v4 = iy$EntityType.dkfd("dkgk", dkfa(int ), (int)13);
                            continue block19;
                        }
                        case -431448218: {
                            v4 = iy$EntityType.dkfd("dkgl", dkfa(int ), (int)14);
                            continue block19;
                        }
                        case 1321258128: {
                            break block19;
                        }
                    }
                    break;
                }
                return Enum.valueOf(iy$EntityType.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)iy$EntityType.dkfd("dkgm", dkff(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
lbl51:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)iy$EntityType.dkfd("dkgn", dkff(int ), (int)17);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)iy$EntityType.dkfd("dkgo", dkff(int ), (int)18);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)iy$EntityType.dkfd("dkgp", dkff(int ), (int)19);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }
}

