/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class it$SwapPhase
extends Enum<it$SwapPhase> {
    public static final /* enum */ it$SwapPhase RESUMING;
    private static int[] jymv;
    private static int[] jymw;
    private static final /* synthetic */ it$SwapPhase[] $VALUES;
    private static long[] jymn;
    public static final boolean a;
    private static long[] jymp;
    public static final /* enum */ it$SwapPhase STOPPING;
    public static final /* enum */ it$SwapPhase POST_SWAP;
    public static final /* enum */ it$SwapPhase WAIT_STOP;
    public static final /* enum */ it$SwapPhase IDLE;
    public static final int b;
    public static final /* enum */ it$SwapPhase PRE_SWAP;
    public static final boolean c;
    public static final /* enum */ it$SwapPhase DO_SWAP;
    protected static final long ry = -6950592286181996745L;
    public static final /* enum */ it$SwapPhase PRE_STOP;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static it$SwapPhase valueOf(String var0) {
        v0 /* !! */  = it$SwapPhase.ry;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(it$SwapPhase.jymq("jyol", jyml(int ), (int)7) - it$SwapPhase.jymq("jyok", jyml(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1242903561: {
                    continue block10;
                }
                case 999114551: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = it$SwapPhase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = it$SwapPhase.ry - it$SwapPhase.jymq("jyon", jyml(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == it$SwapPhase.jymq("jyoo", jymu(int ), (int)12)) break;
            v1 /* !! */  = (long)it$SwapPhase.jymq("jyoq", jymu(int ), (int)13);
        }
        var2_2 /* !! */  = it$SwapPhase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = it$SwapPhase.ry - it$SwapPhase.jymq("jyos", jyml(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == it$SwapPhase.jymq("jyot", jymu(int ), (int)14)) break;
            v2 /* !! */  = (long)it$SwapPhase.jymq("jyov", jymu(int ), (int)15);
        }
        var1_3 = it$SwapPhase.a;
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
                    if ((v3 /* !! */  = (cfr_temp_2 = it$SwapPhase.ry - it$SwapPhase.jymq("jyox", jyml(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == it$SwapPhase.jymq("jyoz", jymu(int ), (int)16)) break;
                    v3 /* !! */  = (long)it$SwapPhase.jymq("jypa", jymu(int ), (int)17);
                }
                return Enum.valueOf(it$SwapPhase.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)it$SwapPhase.jymq("jypc", jymu(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl49
            }
            case 1: {
                var2_2 /* !! */  = (int)it$SwapPhase.jymq("jypd", jymu(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)it$SwapPhase.jymq("jype", jymu(int ), (int)20);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)it$SwapPhase.jymq("jypg", jymu(int ), (int)21);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static it$SwapPhase[] values() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ry - it$SwapPhase.jymq("jyms", jyml(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == it$SwapPhase.jymq("jymy", jymu(int ), (int)0)) break;
            object = it$SwapPhase.jymq("jyna", jymu(int ), (int)1);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ry - it$SwapPhase.jymq("jyni", jyml(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == it$SwapPhase.jymq("jynk", jymu(int ), (int)2)) break;
            object = it$SwapPhase.jymq("jynl", jymu(int ), (int)3);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ry - it$SwapPhase.jymq("jynn", jyml(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == it$SwapPhase.jymq("jynp", jymu(int ), (int)4)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = it$SwapPhase.jymq("jynr", jymu(int ), (int)5);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = ry;
        block7: while (true) {
            switch ((int)object) {
                case -1272723072: {
                    object = it$SwapPhase.jymq("jynv", jyml(int ), (int)4) - it$SwapPhase.jymq("jynt", jyml(int ), (int)3);
                    continue block7;
                }
                case 999114551: {
                    break block7;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = ry - it$SwapPhase.jymq("jynx", jyml(int ), (int)5)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == it$SwapPhase.jymq("jyny", jymu(int ), (int)6)) {
                return (it$SwapPhase[])$VALUES.clone();
            }
            object2 = it$SwapPhase.jymq("jyoa", jymu(int ), (int)7);
        }
    }

    private static /* synthetic */ void jyrx() {
        it$SwapPhase.jymv[0] = -1799254738;
        it$SwapPhase.jymv[1] = 1168602177;
        it$SwapPhase.jymv[2] = -1308899907;
        it$SwapPhase.jymv[3] = 1706970973;
        it$SwapPhase.jymv[4] = 1764164737;
        it$SwapPhase.jymv[5] = -1309740238;
        it$SwapPhase.jymv[6] = -2008177338;
        it$SwapPhase.jymv[7] = -258508303;
        it$SwapPhase.jymv[8] = 1615740817;
        it$SwapPhase.jymv[9] = -1444943187;
        it$SwapPhase.jymv[10] = 422357411;
        it$SwapPhase.jymv[11] = -69760305;
        it$SwapPhase.jymv[12] = 261905756;
        it$SwapPhase.jymv[13] = 709607188;
        it$SwapPhase.jymv[14] = 1364441008;
        it$SwapPhase.jymv[15] = -1963784296;
        it$SwapPhase.jymv[16] = -1238130868;
        it$SwapPhase.jymv[17] = 1655977757;
        it$SwapPhase.jymv[18] = 1299188167;
        it$SwapPhase.jymv[19] = -76802260;
        it$SwapPhase.jymv[20] = 1895547013;
        it$SwapPhase.jymv[21] = -24096812;
        it$SwapPhase.jymv[22] = -1621117008;
        it$SwapPhase.jymv[23] = 1802889822;
        it$SwapPhase.jymv[24] = -695168750;
        it$SwapPhase.jymv[25] = -1215414514;
        it$SwapPhase.jymv[26] = 2127091118;
        it$SwapPhase.jymv[27] = -1518628112;
        it$SwapPhase.jymv[28] = 1043347451;
        it$SwapPhase.jymv[29] = 815941505;
        it$SwapPhase.jymv[30] = -2050484901;
        it$SwapPhase.jymv[31] = -311260772;
        it$SwapPhase.jymv[32] = 1815378480;
        it$SwapPhase.jymv[33] = -1235904898;
        it$SwapPhase.jymv[34] = 865795261;
        it$SwapPhase.jymv[35] = -1657730747;
        it$SwapPhase.jymv[36] = -1717764883;
        it$SwapPhase.jymv[37] = -994880211;
        it$SwapPhase.jymv[38] = 727496497;
        it$SwapPhase.jymv[39] = 866232817;
        it$SwapPhase.jymv[40] = -181820530;
        it$SwapPhase.jymv[41] = 1142569363;
        it$SwapPhase.jymv[42] = 2024983578;
        it$SwapPhase.jymv[43] = 781262343;
        it$SwapPhase.jymv[44] = 1791733108;
        it$SwapPhase.jymv[45] = -1618044291;
        it$SwapPhase.jymv[46] = 678948331;
        it$SwapPhase.jymv[47] = 1391707357;
        it$SwapPhase.jymv[48] = 2064214067;
        it$SwapPhase.jymv[49] = -682525858;
        it$SwapPhase.jymv[50] = -969938668;
        it$SwapPhase.jymv[51] = 813942513;
        it$SwapPhase.jymv[52] = -2008957572;
    }

    private static /* synthetic */ void jysb() {
        it$SwapPhase.jymw[0] = 1799254737;
        it$SwapPhase.jymw[1] = 37997721;
        it$SwapPhase.jymw[2] = 1308899906;
        it$SwapPhase.jymw[3] = 354921247;
        it$SwapPhase.jymw[4] = -1764164738;
        it$SwapPhase.jymw[5] = 2065299887;
        it$SwapPhase.jymw[6] = 2008177337;
        it$SwapPhase.jymw[7] = -1948171957;
        it$SwapPhase.jymw[8] = 1615740818;
        it$SwapPhase.jymw[9] = -1444943185;
        it$SwapPhase.jymw[10] = 422357411;
        it$SwapPhase.jymw[11] = -69760305;
        it$SwapPhase.jymw[12] = -261905757;
        it$SwapPhase.jymw[13] = 461322210;
        it$SwapPhase.jymw[14] = -1364441009;
        it$SwapPhase.jymw[15] = 86376212;
        it$SwapPhase.jymw[16] = 1238130867;
        it$SwapPhase.jymw[17] = -1178020851;
        it$SwapPhase.jymw[18] = 1299188164;
        it$SwapPhase.jymw[19] = -76802259;
        it$SwapPhase.jymw[20] = 1895547012;
        it$SwapPhase.jymw[21] = -24096810;
        it$SwapPhase.jymw[22] = -1621117007;
        it$SwapPhase.jymw[23] = 1802889820;
        it$SwapPhase.jymw[24] = -695168749;
        it$SwapPhase.jymw[25] = 1215414513;
        it$SwapPhase.jymw[26] = 154748394;
        it$SwapPhase.jymw[27] = -1518628112;
        it$SwapPhase.jymw[28] = -1043347452;
        it$SwapPhase.jymw[29] = 815941504;
        it$SwapPhase.jymw[30] = -2050484903;
        it$SwapPhase.jymw[31] = 311260771;
        it$SwapPhase.jymw[32] = 1815378483;
        it$SwapPhase.jymw[33] = -1235904902;
        it$SwapPhase.jymw[34] = -865795262;
        it$SwapPhase.jymw[35] = -1657730752;
        it$SwapPhase.jymw[36] = 1717764882;
        it$SwapPhase.jymw[37] = -994880213;
        it$SwapPhase.jymw[38] = -727496498;
        it$SwapPhase.jymw[39] = 866232822;
        it$SwapPhase.jymw[40] = 181820529;
        it$SwapPhase.jymw[41] = 1142569361;
        it$SwapPhase.jymw[42] = 2024983578;
        it$SwapPhase.jymw[43] = 781262343;
        it$SwapPhase.jymw[44] = 1791733109;
        it$SwapPhase.jymw[45] = -1618044291;
        it$SwapPhase.jymw[46] = 678948330;
        it$SwapPhase.jymw[47] = 1391707359;
        it$SwapPhase.jymw[48] = 2064214064;
        it$SwapPhase.jymw[49] = -682525862;
        it$SwapPhase.jymw[50] = -969938671;
        it$SwapPhase.jymw[51] = 813942519;
        it$SwapPhase.jymw[52] = -2008957573;
    }

    private static /* synthetic */ void jyse() {
        it$SwapPhase.jymn[0] = 4338628113265240736L;
        it$SwapPhase.jymn[1] = -7205552526499375378L;
        it$SwapPhase.jymn[2] = 5061218757471003561L;
        it$SwapPhase.jymn[3] = -4098388212301558978L;
        it$SwapPhase.jymn[4] = -2962687036926808884L;
        it$SwapPhase.jymn[5] = 7723634373529278040L;
        it$SwapPhase.jymn[6] = -4473229892674837020L;
        it$SwapPhase.jymn[7] = -3414222329117878510L;
        it$SwapPhase.jymn[8] = -1072848817526339745L;
        it$SwapPhase.jymn[9] = -5924463910148240359L;
        it$SwapPhase.jymn[10] = -2161686286604578551L;
        it$SwapPhase.jymn[11] = -8590199962597316816L;
        it$SwapPhase.jymn[12] = 6992695703804525002L;
        it$SwapPhase.jymn[13] = -2241013537349425831L;
        it$SwapPhase.jymn[14] = 2298291292711177539L;
        it$SwapPhase.jymn[15] = 8690067118587924132L;
        it$SwapPhase.jymn[16] = -8207280481156242582L;
        it$SwapPhase.jymn[17] = 5403107650257061126L;
        it$SwapPhase.jymn[18] = 1853007760331852126L;
        it$SwapPhase.jymn[19] = 3330024381306496841L;
        it$SwapPhase.jymn[20] = -8717079027726877994L;
        it$SwapPhase.jymn[21] = -5200775179817792623L;
        it$SwapPhase.jymn[22] = -1604134990239201007L;
        it$SwapPhase.jymn[23] = 8676264380273242138L;
        it$SwapPhase.jymn[24] = 202559285021847051L;
        it$SwapPhase.jymn[25] = -470870880628999468L;
        it$SwapPhase.jymn[26] = -8918720588784448555L;
        it$SwapPhase.jymn[27] = 4704214466099030776L;
        it$SwapPhase.jymn[28] = 6190802392913011681L;
        it$SwapPhase.jymn[29] = -3488332513037462505L;
        it$SwapPhase.jymn[30] = 8220713702005490063L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private it$SwapPhase() {
        var4_3 /* !! */  = it$SwapPhase.b;
        var3_4 = it$SwapPhase.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)it$SwapPhase.jymq("jyph", jymu(int ), (int)22);
                break;
            }
            case 1: {
                var4_3 /* !! */  = (int)it$SwapPhase.jymq("jypi", jymu(int ), (int)23);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)it$SwapPhase.jymq("jypj", jymu(int ), (int)24);
        }
    }

    public static /* synthetic */ CallSite jymq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long jyml(int n2) {
        return jymn[n2] ^ jymp[n2];
    }

    private static /* synthetic */ void jysh() {
        it$SwapPhase.jymp[0] = -1181599271407892603L;
        it$SwapPhase.jymp[1] = -5610524801390841004L;
        it$SwapPhase.jymp[2] = -1243469489269346871L;
        it$SwapPhase.jymp[3] = 8558077700147294983L;
        it$SwapPhase.jymp[4] = 7386285833800615259L;
        it$SwapPhase.jymp[5] = 7910609037570316661L;
        it$SwapPhase.jymp[6] = 3455322490054940609L;
        it$SwapPhase.jymp[7] = 457993004873751223L;
        it$SwapPhase.jymp[8] = 4206417145929333906L;
        it$SwapPhase.jymp[9] = -5756724495196789090L;
        it$SwapPhase.jymp[10] = -333343166039403801L;
        it$SwapPhase.jymp[11] = -6199134117266166111L;
        it$SwapPhase.jymp[12] = 5161829158879122421L;
        it$SwapPhase.jymp[13] = 2673323175778427638L;
        it$SwapPhase.jymp[14] = -3894298042524828442L;
        it$SwapPhase.jymp[15] = 5615168452132935996L;
        it$SwapPhase.jymp[16] = -4209215313363021574L;
        it$SwapPhase.jymp[17] = -8737376239032622667L;
        it$SwapPhase.jymp[18] = 2869378496199546794L;
        it$SwapPhase.jymp[19] = 7576585418273448038L;
        it$SwapPhase.jymp[20] = 2050925546432094437L;
        it$SwapPhase.jymp[21] = 5238523651898436916L;
        it$SwapPhase.jymp[22] = 1469849308404439885L;
        it$SwapPhase.jymp[23] = -3625498717241335103L;
        it$SwapPhase.jymp[24] = -6723571442161714076L;
        it$SwapPhase.jymp[25] = 6000811513294982045L;
        it$SwapPhase.jymp[26] = 4318972708645151156L;
        it$SwapPhase.jymp[27] = 2578953376496174937L;
        it$SwapPhase.jymp[28] = 7753566393255190407L;
        it$SwapPhase.jymp[29] = 560976091628600740L;
        it$SwapPhase.jymp[30] = 7883397529773567177L;
    }

    static {
        jymv = new int[53];
        jymw = new int[53];
        it$SwapPhase.jyrx();
        it$SwapPhase.jysb();
        jymn = new long[31];
        jymp = new long[31];
        it$SwapPhase.jyse();
        it$SwapPhase.jysh();
        IDLE = new it$SwapPhase();
        PRE_STOP = new it$SwapPhase();
        STOPPING = new it$SwapPhase();
        WAIT_STOP = new it$SwapPhase();
        PRE_SWAP = new it$SwapPhase();
        DO_SWAP = new it$SwapPhase();
        POST_SWAP = new it$SwapPhase();
        RESUMING = new it$SwapPhase();
        $VALUES = it$SwapPhase.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ it$SwapPhase[] $values() {
        v0 /* !! */  = it$SwapPhase.ry;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - it$SwapPhase.jymq("jypl", jyml(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1322785247: {
                    v1 = it$SwapPhase.jymq("jypn", jyml(int ), (int)12);
                    continue block27;
                }
                case 48976727: {
                    v1 = it$SwapPhase.jymq("jypo", jyml(int ), (int)13);
                    continue block27;
                }
                case 999114551: {
                    break block27;
                }
                case 1685695495: {
                    v1 = it$SwapPhase.jymq("jypp", jyml(int ), (int)14);
                    continue block27;
                }
            }
            break;
        }
        var2 = it$SwapPhase.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = it$SwapPhase.ry - it$SwapPhase.jymq("jypq", jyml(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == it$SwapPhase.jymq("jypr", jymu(int ), (int)25)) break;
            v2 /* !! */  = (long)it$SwapPhase.jymq("jyps", jymu(int ), (int)26);
        }
        var1_1 /* !! */  = it$SwapPhase.b;
        v3 /* !! */  = it$SwapPhase.ry;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - it$SwapPhase.jymq("jypt", jyml(int ), (int)16));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -342422581: {
                    v4 = it$SwapPhase.jymq("jypu", jyml(int ), (int)17);
                    continue block29;
                }
                case 999114551: {
                    break block29;
                }
                case 1807162707: {
                    v4 = it$SwapPhase.jymq("jypv", jyml(int ), (int)18);
                    continue block29;
                }
            }
            break;
        }
        var0_2 = it$SwapPhase.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v5 = new it$SwapPhase[8];
                v6 = it$SwapPhase.jymq("jypw", jymu(int ), (int)27);
                while (true) {
                    if ((v7 = (cfr_temp_1 = it$SwapPhase.ry - it$SwapPhase.jymq("jypx", jyml(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == it$SwapPhase.jymq("jypy", jymu(int ), (int)28)) break;
                    v7 = -1072009656;
                }
                v5[v6] = it$SwapPhase.IDLE;
                v8 = it$SwapPhase.jymq("jypz", jymu(int ), (int)29);
                v9 /* !! */  = it$SwapPhase.ry;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v9 /* !! */  = (long)(v10 - it$SwapPhase.jymq("jyqa", jyml(int ), (int)20));
lbl61:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1625322975: {
                            v10 = it$SwapPhase.jymq("jyqb", jyml(int ), (int)21);
                            continue block32;
                        }
                        case -1246500952: {
                            v10 = it$SwapPhase.jymq("jyqc", jyml(int ), (int)22);
                            continue block32;
                        }
                        case -347297802: {
                            v10 = it$SwapPhase.jymq("jyqd", jyml(int ), (int)23);
                            continue block32;
                        }
                        case 999114551: {
                            break block32;
                        }
                    }
                    break;
                }
                v5[v8] = it$SwapPhase.PRE_STOP;
                v11 = it$SwapPhase.jymq("jyqe", jymu(int ), (int)30);
                while (true) {
                    if ((v12 = (cfr_temp_2 = it$SwapPhase.ry - it$SwapPhase.jymq("jyqf", jyml(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 == it$SwapPhase.jymq("jyqg", jymu(int ), (int)31)) break;
                    v12 = 840138376;
                }
                v5[v11] = it$SwapPhase.STOPPING;
                v13 = it$SwapPhase.jymq("jyqh", jymu(int ), (int)32);
                v14 /* !! */  = it$SwapPhase.ry;
                if (true) ** GOTO lbl87
                block34: while (true) {
                    v14 /* !! */  = (long)(it$SwapPhase.jymq("jyqj", jyml(int ), (int)26) - it$SwapPhase.jymq("jyqi", jyml(int ), (int)25));
lbl87:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 999114551: {
                            break block34;
                        }
                        case 1149169058: {
                            continue block34;
                        }
                    }
                    break;
                }
                v5[v13] = it$SwapPhase.WAIT_STOP;
                v15 = it$SwapPhase.jymq("jyqk", jymu(int ), (int)33);
                while (true) {
                    if ((v16 = (cfr_temp_3 = it$SwapPhase.ry - it$SwapPhase.jymq("jyql", jyml(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v16 == it$SwapPhase.jymq("jyqn", jymu(int ), (int)34)) break;
                    v16 = 174912460;
                }
                v5[v15] = it$SwapPhase.PRE_SWAP;
                v17 = it$SwapPhase.jymq("jyqo", jymu(int ), (int)35);
                while (true) {
                    if ((v18 = (cfr_temp_4 = it$SwapPhase.ry - it$SwapPhase.jymq("jyqp", jyml(int ), (int)28)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 == it$SwapPhase.jymq("jyqq", jymu(int ), (int)36)) break;
                    v18 = -974290700;
                }
                v5[v17] = it$SwapPhase.DO_SWAP;
                v19 = it$SwapPhase.jymq("jyqs", jymu(int ), (int)37);
                while (true) {
                    if ((v20 = (cfr_temp_5 = it$SwapPhase.ry - it$SwapPhase.jymq("jyqu", jyml(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 == it$SwapPhase.jymq("jyqw", jymu(int ), (int)38)) break;
                    v20 = 1648833352;
                }
                v5[v19] = it$SwapPhase.POST_SWAP;
                v21 = it$SwapPhase.jymq("jyqx", jymu(int ), (int)39);
                while (true) {
                    if ((v22 = (cfr_temp_6 = it$SwapPhase.ry - it$SwapPhase.jymq("jyqz", jyml(int ), (int)30)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v22 == it$SwapPhase.jymq("jyrb", jymu(int ), (int)40)) break;
                    v22 = 1316591225;
                }
                v5[v21] = it$SwapPhase.RESUMING;
                return v5;
            }
            case 0: {
                var1_1 /* !! */  = (int)it$SwapPhase.jymq("jyrd", jymu(int ), (int)41);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)it$SwapPhase.jymq("jyrf", jymu(int ), (int)42);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)it$SwapPhase.jymq("jyrh", jymu(int ), (int)43);
                    if (!var2) break block11;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)it$SwapPhase.jymq("jyri", jymu(int ), (int)44);
        ** while (!var2)
lbl142:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jymu(int n2) {
        return jymv[n2] ^ jymw[n2];
    }
}

