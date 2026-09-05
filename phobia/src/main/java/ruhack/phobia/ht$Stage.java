/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ht$Stage
extends Enum<ht$Stage> {
    private static int[] eanm;
    private static final /* synthetic */ ht$Stage[] $VALUES;
    private static long[] eanc;
    public static final boolean a;
    public static final /* enum */ ht$Stage PREPARE_PLACEMENT;
    public static final /* enum */ ht$Stage WAIT_ROTATION;
    public static final long ke = 871245821499918585L;
    public static final /* enum */ ht$Stage IDLE;
    private static long[] eand;
    public static final int b;
    private static int[] eanl;
    public static final boolean c;
    public static final /* enum */ ht$Stage READY_TO_PLACE;
    public static final /* enum */ ht$Stage REQUESTED;
    public static final /* enum */ ht$Stage RESTORE;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ht$Stage() {
        var4_3 /* !! */  = ht$Stage.b;
        var3_4 = ht$Stage.a;
        super(var1_1, var2_2);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
                case 2: {
                    var4_3 /* !! */  = (int)ht$Stage.eane("eaoy", eank(int ), (int)16);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var4_3 /* !! */  = (int)ht$Stage.eane("eaow", eank(int ), (int)14);
                }
                case 1: 
            }
            if (true) ** GOTO lbl19
            break;
        }
        while (true) {
            if (true) ** continue;
lbl19:
            // 2 sources

            var4_3 /* !! */  = (int)ht$Stage.eane("eaox", eank(int ), (int)15);
            cfr_temp_0 = 0;
        }
    }

    private static /* synthetic */ void eaqk() {
        ht$Stage.eanl[0] = 1455487568;
        ht$Stage.eanl[1] = 1792250612;
        ht$Stage.eanl[2] = 410216128;
        ht$Stage.eanl[3] = -966787754;
        ht$Stage.eanl[4] = 338346037;
        ht$Stage.eanl[5] = -927375246;
        ht$Stage.eanl[6] = -1629109927;
        ht$Stage.eanl[7] = -1187048395;
        ht$Stage.eanl[8] = 1040525877;
        ht$Stage.eanl[9] = 1526986150;
        ht$Stage.eanl[10] = 844455567;
        ht$Stage.eanl[11] = 1448807009;
        ht$Stage.eanl[12] = 1037296897;
        ht$Stage.eanl[13] = -638564440;
        ht$Stage.eanl[14] = -1807061027;
        ht$Stage.eanl[15] = 2062000655;
        ht$Stage.eanl[16] = 1555151648;
        ht$Stage.eanl[17] = -1000050321;
        ht$Stage.eanl[18] = 1510973094;
        ht$Stage.eanl[19] = 895391775;
        ht$Stage.eanl[20] = -388625209;
        ht$Stage.eanl[21] = 1434610256;
        ht$Stage.eanl[22] = 209636367;
        ht$Stage.eanl[23] = 1584387019;
        ht$Stage.eanl[24] = 431149049;
        ht$Stage.eanl[25] = 1881238878;
        ht$Stage.eanl[26] = 1346196672;
        ht$Stage.eanl[27] = 1945067077;
        ht$Stage.eanl[28] = -9260720;
        ht$Stage.eanl[29] = -2135287284;
        ht$Stage.eanl[30] = -1371871235;
        ht$Stage.eanl[31] = -97484242;
        ht$Stage.eanl[32] = -1829271929;
        ht$Stage.eanl[33] = -652721329;
        ht$Stage.eanl[34] = -1874116639;
        ht$Stage.eanl[35] = 101673876;
        ht$Stage.eanl[36] = -508904982;
        ht$Stage.eanl[37] = 1495041214;
        ht$Stage.eanl[38] = 1212313750;
        ht$Stage.eanl[39] = 1968546574;
    }

    private static /* synthetic */ void eaqn() {
        ht$Stage.eand[0] = -1343498954563813346L;
        ht$Stage.eand[1] = 2597844540738405031L;
        ht$Stage.eand[2] = -7121447718694476008L;
        ht$Stage.eand[3] = -8678468107690232826L;
        ht$Stage.eand[4] = 1951124021024710228L;
        ht$Stage.eand[5] = 3660629554834924655L;
        ht$Stage.eand[6] = -2143133757313426856L;
        ht$Stage.eand[7] = -5085002989160997949L;
        ht$Stage.eand[8] = 4763125010645861052L;
        ht$Stage.eand[9] = -1739254910961392221L;
        ht$Stage.eand[10] = 1925413712398081089L;
        ht$Stage.eand[11] = 6099101252407930341L;
        ht$Stage.eand[12] = 4351494410401377847L;
        ht$Stage.eand[13] = -5108993167397282594L;
        ht$Stage.eand[14] = 3240516140201564564L;
        ht$Stage.eand[15] = 215772486154217339L;
        ht$Stage.eand[16] = 905913778411672760L;
        ht$Stage.eand[17] = 354342037488849000L;
        ht$Stage.eand[18] = -4935842691603938445L;
        ht$Stage.eand[19] = 7763452604569625689L;
        ht$Stage.eand[20] = -990769979034875793L;
        ht$Stage.eand[21] = 4906494028916326191L;
        ht$Stage.eand[22] = 7381590273640069236L;
        ht$Stage.eand[23] = 2444587809726751974L;
        ht$Stage.eand[24] = 8279741848035637222L;
        ht$Stage.eand[25] = 6486878099591431344L;
        ht$Stage.eand[26] = 5211979831138130260L;
        ht$Stage.eand[27] = 6523906002535602194L;
        ht$Stage.eand[28] = 172742937421807913L;
        ht$Stage.eand[29] = 4441147251056058639L;
        ht$Stage.eand[30] = 7619858699648223808L;
        ht$Stage.eand[31] = -1965362348956109079L;
        ht$Stage.eand[32] = 8900483351279723108L;
        ht$Stage.eand[33] = -5938132086786838279L;
        ht$Stage.eand[34] = -5497125320515935339L;
        ht$Stage.eand[35] = 6298075915995952447L;
        ht$Stage.eand[36] = -2088147370514276921L;
        ht$Stage.eand[37] = -8701423884322097164L;
        ht$Stage.eand[38] = -319593143746696625L;
        ht$Stage.eand[39] = -8038313610382123895L;
    }

    private static /* synthetic */ void eaql() {
        ht$Stage.eanm[0] = 1455487569;
        ht$Stage.eanm[1] = 979512540;
        ht$Stage.eanm[2] = -410216129;
        ht$Stage.eanm[3] = -684807520;
        ht$Stage.eanm[4] = 338346038;
        ht$Stage.eanm[5] = -927375248;
        ht$Stage.eanm[6] = -1629109925;
        ht$Stage.eanm[7] = -1187048394;
        ht$Stage.eanm[8] = -1040525878;
        ht$Stage.eanm[9] = -595268462;
        ht$Stage.eanm[10] = 844455567;
        ht$Stage.eanm[11] = 1448807010;
        ht$Stage.eanm[12] = 1037296897;
        ht$Stage.eanm[13] = -638564439;
        ht$Stage.eanm[14] = -1807061028;
        ht$Stage.eanm[15] = 2062000655;
        ht$Stage.eanm[16] = 1555151648;
        ht$Stage.eanm[17] = 1000050320;
        ht$Stage.eanm[18] = 1309107935;
        ht$Stage.eanm[19] = 895391775;
        ht$Stage.eanm[20] = -388625210;
        ht$Stage.eanm[21] = 1434610257;
        ht$Stage.eanm[22] = 209636366;
        ht$Stage.eanm[23] = 1584387017;
        ht$Stage.eanm[24] = 431149048;
        ht$Stage.eanm[25] = 1881238877;
        ht$Stage.eanm[26] = -1346196673;
        ht$Stage.eanm[27] = 1945067073;
        ht$Stage.eanm[28] = -9260715;
        ht$Stage.eanm[29] = -2135287283;
        ht$Stage.eanm[30] = -1371871233;
        ht$Stage.eanm[31] = -97484241;
        ht$Stage.eanm[32] = -1829271931;
        ht$Stage.eanm[33] = -652721330;
        ht$Stage.eanm[34] = -1874116639;
        ht$Stage.eanm[35] = 101673877;
        ht$Stage.eanm[36] = -508904984;
        ht$Stage.eanm[37] = 1495041213;
        ht$Stage.eanm[38] = 1212313746;
        ht$Stage.eanm[39] = 1968546571;
    }

    static {
        eanl = new int[40];
        eanm = new int[40];
        ht$Stage.eaqk();
        ht$Stage.eaql();
        eanc = new long[40];
        eand = new long[40];
        ht$Stage.eaqm();
        ht$Stage.eaqn();
        IDLE = new ht$Stage();
        REQUESTED = new ht$Stage();
        PREPARE_PLACEMENT = new ht$Stage();
        WAIT_ROTATION = new ht$Stage();
        READY_TO_PLACE = new ht$Stage();
        RESTORE = new ht$Stage();
        $VALUES = ht$Stage.$values();
    }

    private static /* synthetic */ int eank(int n2) {
        return eanl[n2] ^ eanm[n2];
    }

    private static /* synthetic */ void eaqm() {
        ht$Stage.eanc[0] = -3456032222385413771L;
        ht$Stage.eanc[1] = 1848597857062815219L;
        ht$Stage.eanc[2] = 1734415624457728383L;
        ht$Stage.eanc[3] = -6684047457610979073L;
        ht$Stage.eanc[4] = -5483469605242930091L;
        ht$Stage.eanc[5] = -2178879020225731016L;
        ht$Stage.eanc[6] = 8812738567990727229L;
        ht$Stage.eanc[7] = 7367423008086610087L;
        ht$Stage.eanc[8] = -1335620965952425961L;
        ht$Stage.eanc[9] = -6342509732468848238L;
        ht$Stage.eanc[10] = -579116252793947000L;
        ht$Stage.eanc[11] = 5138357511236988142L;
        ht$Stage.eanc[12] = 1903011523561656313L;
        ht$Stage.eanc[13] = -2147336196297672093L;
        ht$Stage.eanc[14] = 4413039330218154203L;
        ht$Stage.eanc[15] = 6495996006433887742L;
        ht$Stage.eanc[16] = 1836335503183315622L;
        ht$Stage.eanc[17] = 3181683748180066026L;
        ht$Stage.eanc[18] = 8514320223342860460L;
        ht$Stage.eanc[19] = 6120471075924396404L;
        ht$Stage.eanc[20] = 3483527222612592696L;
        ht$Stage.eanc[21] = 6734769142114198651L;
        ht$Stage.eanc[22] = 4249088659629516813L;
        ht$Stage.eanc[23] = 362016137896366717L;
        ht$Stage.eanc[24] = 7341583090440821158L;
        ht$Stage.eanc[25] = 8683502503363437153L;
        ht$Stage.eanc[26] = 7388865235080649163L;
        ht$Stage.eanc[27] = -6601518659537868152L;
        ht$Stage.eanc[28] = 1115762809863099975L;
        ht$Stage.eanc[29] = -235344872708292904L;
        ht$Stage.eanc[30] = 428219879564005506L;
        ht$Stage.eanc[31] = 4353225561086451850L;
        ht$Stage.eanc[32] = -3944906544916524758L;
        ht$Stage.eanc[33] = 7496987269658084185L;
        ht$Stage.eanc[34] = 2858065330996077688L;
        ht$Stage.eanc[35] = 7770805137201418061L;
        ht$Stage.eanc[36] = -2366104463683983678L;
        ht$Stage.eanc[37] = -2543468890073151432L;
        ht$Stage.eanc[38] = -7107187443161866097L;
        ht$Stage.eanc[39] = 4864678293741179834L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ht$Stage valueOf(String var0) {
        v0 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ht$Stage.eane("eaod", eanb(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2081756750: {
                    v1 = ht$Stage.eane("eaoe", eanb(int ), (int)14);
                    continue block24;
                }
                case -357434308: {
                    v1 = ht$Stage.eane("eaof", eanb(int ), (int)15);
                    continue block24;
                }
                case 391782059: {
                    v1 = ht$Stage.eane("eaog", eanb(int ), (int)16);
                    continue block24;
                }
                case 1720436985: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = ht$Stage.c;
        v2 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - ht$Stage.eane("eaoh", eanb(int ), (int)17));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1844639690: {
                    v3 = ht$Stage.eane("eaoi", eanb(int ), (int)18);
                    continue block25;
                }
                case -1037306645: {
                    v3 = ht$Stage.eane("eaoj", eanb(int ), (int)19);
                    continue block25;
                }
                case 1373936687: {
                    v3 = ht$Stage.eane("eaok", eanb(int ), (int)20);
                    continue block25;
                }
                case 1720436985: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht$Stage.b;
        v4 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl39
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - ht$Stage.eane("eaol", eanb(int ), (int)21));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -971296746: {
                    v5 = ht$Stage.eane("eaom", eanb(int ), (int)22);
                    continue block26;
                }
                case -229580696: {
                    v5 = ht$Stage.eane("eaon", eanb(int ), (int)23);
                    continue block26;
                }
                case -84860705: {
                    v5 = ht$Stage.eane("eaoo", eanb(int ), (int)24);
                    continue block26;
                }
                case 1720436985: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = ht$Stage.a;
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
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = ht$Stage.ke - ht$Stage.eane("eaop", eanb(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ht$Stage.eane("eaoq", eank(int ), (int)8)) break;
                    v6 /* !! */  = (long)ht$Stage.eane("eaor", eank(int ), (int)9);
                }
                return Enum.valueOf(ht$Stage.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)ht$Stage.eane("eaos", eank(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ht$Stage.eane("eaot", eank(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht$Stage.eane("eaou", eank(int ), (int)12);
                    if (!var3_1) ** GOTO lbl71
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ht$Stage.eane("eaov", eank(int ), (int)13);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite eane(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ht$Stage[] values() {
        v0 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ht$Stage.eane("eanf", eanb(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1027618491: {
                    v1 = ht$Stage.eane("eang", eanb(int ), (int)1);
                    continue block23;
                }
                case -561133127: {
                    v1 = ht$Stage.eane("eanh", eanb(int ), (int)2);
                    continue block23;
                }
                case 588927757: {
                    v1 = ht$Stage.eane("eani", eanb(int ), (int)3);
                    continue block23;
                }
                case 1720436985: {
                    break block23;
                }
            }
            break;
        }
        var2 = ht$Stage.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht$Stage.ke - ht$Stage.eane("eanj", eanb(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht$Stage.eane("eann", eank(int ), (int)0)) break;
            v2 /* !! */  = (long)ht$Stage.eane("eano", eank(int ), (int)1);
        }
        var1_1 /* !! */  = ht$Stage.b;
        v3 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - ht$Stage.eane("eanp", eanb(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -563696735: {
                    v4 = ht$Stage.eane("eanq", eanb(int ), (int)6);
                    continue block25;
                }
                case 501106623: {
                    v4 = ht$Stage.eane("eanr", eanb(int ), (int)7);
                    continue block25;
                }
                case 1420943868: {
                    v4 = ht$Stage.eane("eans", eanb(int ), (int)8);
                    continue block25;
                }
                case 1720436985: {
                    break block25;
                }
            }
            break;
        }
        var0_2 = ht$Stage.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = ht$Stage.ke;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ht$Stage.eane("eant", eanb(int ), (int)9));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 89824867: {
                            v6 = ht$Stage.eane("eanu", eanb(int ), (int)10);
                            continue block27;
                        }
                        case 1720436985: {
                            break block27;
                        }
                        case 2016826501: {
                            v6 = ht$Stage.eane("eanv", eanb(int ), (int)11);
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ht$Stage.ke - ht$Stage.eane("eanw", eanb(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ht$Stage.eane("eanx", eank(int ), (int)2)) break;
                    v7 /* !! */  = (long)ht$Stage.eane("eany", eank(int ), (int)3);
                }
                return (ht$Stage[])ht$Stage.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)ht$Stage.eane("eanz", eank(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                var1_1 /* !! */  = (int)ht$Stage.eane("eaoa", eank(int ), (int)5);
                if (!var2) break;
                throw null;
            }
lbl79:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ht$Stage.eane("eaob", eank(int ), (int)6);
                    if (!var2) break block12;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ht$Stage.eane("eaoc", eank(int ), (int)7);
        ** while (!var2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ht$Stage[] $values() {
        v0 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(ht$Stage.eane("eapa", eanb(int ), (int)27) - ht$Stage.eane("eaoz", eanb(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1842886392: {
                    continue block20;
                }
                case 1720436985: {
                    break block20;
                }
            }
            break;
        }
        var2 = ht$Stage.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ht$Stage.ke - ht$Stage.eane("eapb", eanb(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ht$Stage.eane("eapc", eank(int ), (int)17)) break;
            v1 /* !! */  = (long)ht$Stage.eane("eapd", eank(int ), (int)18);
        }
        var1_1 /* !! */  = ht$Stage.b;
        v2 /* !! */  = ht$Stage.ke;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ht$Stage.eane("eape", eanb(int ), (int)29));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -263527965: {
                    v3 = ht$Stage.eane("eapf", eanb(int ), (int)30);
                    continue block22;
                }
                case -260486275: {
                    v3 = ht$Stage.eane("eapg", eanb(int ), (int)31);
                    continue block22;
                }
                case 1720436985: {
                    break block22;
                }
            }
            break;
        }
        var0_2 = ht$Stage.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = new ht$Stage[6];
                v5 = ht$Stage.eane("eaph", eank(int ), (int)19);
                while (true) {
                    if ((v6 = (cfr_temp_1 = ht$Stage.ke - ht$Stage.eane("eapi", eanb(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == ht$Stage.eane("eapj", eank(int ), (int)20)) break;
                    v6 = 1331950980;
                }
                v4[v5] = ht$Stage.IDLE;
                v7 = ht$Stage.eane("eapk", eank(int ), (int)21);
                while (true) {
                    if ((v8 = (cfr_temp_2 = ht$Stage.ke - ht$Stage.eane("eapl", eanb(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == ht$Stage.eane("eapm", eank(int ), (int)22)) break;
                    v8 = 151557766;
                }
                v4[v7] = ht$Stage.REQUESTED;
                v9 = ht$Stage.eane("eapn", eank(int ), (int)23);
                while (true) {
                    if ((v10 = (cfr_temp_3 = ht$Stage.ke - ht$Stage.eane("eapo", eanb(int ), (int)34)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 == ht$Stage.eane("eapp", eank(int ), (int)24)) break;
                    v10 = -1593846068;
                }
                v4[v9] = ht$Stage.PREPARE_PLACEMENT;
                v11 = ht$Stage.eane("eapq", eank(int ), (int)25);
                while (true) {
                    if ((v12 = (cfr_temp_4 = ht$Stage.ke - ht$Stage.eane("eapr", eanb(int ), (int)35)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == ht$Stage.eane("eaps", eank(int ), (int)26)) break;
                    v12 = 762397052;
                }
                v4[v11] = ht$Stage.WAIT_ROTATION;
                v13 = ht$Stage.eane("eapt", eank(int ), (int)27);
                v14 /* !! */  = ht$Stage.ke;
                if (true) ** GOTO lbl78
                block28: while (true) {
                    v14 /* !! */  = (long)(v15 - ht$Stage.eane("eapu", eanb(int ), (int)36));
lbl78:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1275441116: {
                            v15 = ht$Stage.eane("eapv", eanb(int ), (int)37);
                            continue block28;
                        }
                        case 969000473: {
                            v15 = ht$Stage.eane("eapw", eanb(int ), (int)38);
                            continue block28;
                        }
                        case 1720436985: {
                            break block28;
                        }
                    }
                    break;
                }
                v4[v13] = ht$Stage.READY_TO_PLACE;
                v16 = ht$Stage.eane("eapx", eank(int ), (int)28);
                while (true) {
                    if ((v17 = (cfr_temp_5 = ht$Stage.ke - ht$Stage.eane("eapy", eanb(int ), (int)39)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 == ht$Stage.eane("eapz", eank(int ), (int)29)) break;
                    v17 = 520264084;
                }
                v4[v16] = ht$Stage.RESTORE;
                return v4;
            }
lbl97:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ht$Stage.eane("eaqa", eank(int ), (int)30);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)ht$Stage.eane("eaqb", eank(int ), (int)31);
                } while (!var2);
                throw null;
            }
lbl107:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ht$Stage.eane("eaqc", eank(int ), (int)32);
                    if (!var2) ** GOTO lbl97
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ht$Stage.eane("eaqd", eank(int ), (int)33);
        ** while (!var2)
lbl115:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long eanb(int n2) {
        return eanc[n2] ^ eand[n2];
    }
}

