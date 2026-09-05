/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class it$FireworkPhase
extends Enum<it$FireworkPhase> {
    public static final /* enum */ it$FireworkPhase POST_USE;
    private static long[] bdhy;
    public static final /* enum */ it$FireworkPhase WAIT_STOP;
    public static final /* enum */ it$FireworkPhase AWAIT_ITEM;
    public static final boolean a;
    private static long[] bdic;
    private static int[] bdij;
    public static final /* enum */ it$FireworkPhase STOPPING;
    public static final boolean c;
    public static final /* enum */ it$FireworkPhase PRE_SWAP;
    public static final /* enum */ it$FireworkPhase USE;
    public static final /* enum */ it$FireworkPhase RESUMING;
    public static final /* enum */ it$FireworkPhase PRE_STOP;
    public static final /* enum */ it$FireworkPhase SWAP_TO_HAND;
    private static final long cx = 5052898820872295629L;
    private static final /* synthetic */ it$FireworkPhase[] $VALUES;
    public static final int b;
    public static final /* enum */ it$FireworkPhase IDLE;
    private static int[] bdih;
    public static final /* enum */ it$FireworkPhase SWAP_BACK;

    private static /* synthetic */ void bdoc() {
        it$FireworkPhase.bdhy[0] = -4695617242862684273L;
        it$FireworkPhase.bdhy[1] = -8152814020781119897L;
        it$FireworkPhase.bdhy[2] = -8314378108862226148L;
        it$FireworkPhase.bdhy[3] = 3337585644528350391L;
        it$FireworkPhase.bdhy[4] = -2215950651532202319L;
        it$FireworkPhase.bdhy[5] = -3514122593887367014L;
        it$FireworkPhase.bdhy[6] = 1638566316806078600L;
        it$FireworkPhase.bdhy[7] = 4777619240948544864L;
        it$FireworkPhase.bdhy[8] = 1906289033493069384L;
        it$FireworkPhase.bdhy[9] = -5656718628767623370L;
        it$FireworkPhase.bdhy[10] = 5557129067842328943L;
        it$FireworkPhase.bdhy[11] = 3144945239701004840L;
        it$FireworkPhase.bdhy[12] = -3422996361122945025L;
        it$FireworkPhase.bdhy[13] = -1067242673677374673L;
        it$FireworkPhase.bdhy[14] = 8976084832505730241L;
        it$FireworkPhase.bdhy[15] = 3372864223460147411L;
        it$FireworkPhase.bdhy[16] = 7774681716185492196L;
        it$FireworkPhase.bdhy[17] = 6609367822387553185L;
        it$FireworkPhase.bdhy[18] = 568882214594972824L;
        it$FireworkPhase.bdhy[19] = -4687148051413304975L;
        it$FireworkPhase.bdhy[20] = 4969099322136072510L;
        it$FireworkPhase.bdhy[21] = -6693781961150177771L;
        it$FireworkPhase.bdhy[22] = 1714499573020555833L;
        it$FireworkPhase.bdhy[23] = 7941045994302862495L;
        it$FireworkPhase.bdhy[24] = 1748814793937153281L;
        it$FireworkPhase.bdhy[25] = -7956228965285419575L;
        it$FireworkPhase.bdhy[26] = 8063219293038897322L;
        it$FireworkPhase.bdhy[27] = -2517159065069069848L;
        it$FireworkPhase.bdhy[28] = -1382870112406261978L;
        it$FireworkPhase.bdhy[29] = -2035571776733458533L;
        it$FireworkPhase.bdhy[30] = 5235970792685552058L;
        it$FireworkPhase.bdhy[31] = 5509133870484363058L;
        it$FireworkPhase.bdhy[32] = -711880755377029985L;
        it$FireworkPhase.bdhy[33] = 5058031592593528365L;
        it$FireworkPhase.bdhy[34] = -1668637658870802910L;
        it$FireworkPhase.bdhy[35] = -8337845231304865882L;
        it$FireworkPhase.bdhy[36] = -4159636099742877661L;
        it$FireworkPhase.bdhy[37] = 8110086814940993141L;
        it$FireworkPhase.bdhy[38] = 1672400964161336812L;
        it$FireworkPhase.bdhy[39] = 9042814662194784940L;
        it$FireworkPhase.bdhy[40] = 6825443462640092854L;
        it$FireworkPhase.bdhy[41] = 2272948211361004875L;
        it$FireworkPhase.bdhy[42] = 9147552154820049461L;
        it$FireworkPhase.bdhy[43] = -8260317368378358113L;
        it$FireworkPhase.bdhy[44] = 1991465107883634753L;
        it$FireworkPhase.bdhy[45] = -3928949279060582710L;
        it$FireworkPhase.bdhy[46] = -4553579911068127095L;
        it$FireworkPhase.bdhy[47] = 5598787854131680831L;
    }

    private static /* synthetic */ void bdod() {
        it$FireworkPhase.bdic[0] = -4862540924828528439L;
        it$FireworkPhase.bdic[1] = 3397653851642677856L;
        it$FireworkPhase.bdic[2] = -4273142631724155986L;
        it$FireworkPhase.bdic[3] = -7307134107934211873L;
        it$FireworkPhase.bdic[4] = 5455888216848564570L;
        it$FireworkPhase.bdic[5] = 4724945316383191601L;
        it$FireworkPhase.bdic[6] = -9203137485030447243L;
        it$FireworkPhase.bdic[7] = -7360702791287029285L;
        it$FireworkPhase.bdic[8] = 707950473467881127L;
        it$FireworkPhase.bdic[9] = 2176004531041940269L;
        it$FireworkPhase.bdic[10] = -242494183733874061L;
        it$FireworkPhase.bdic[11] = -7525526090931514700L;
        it$FireworkPhase.bdic[12] = 499024916503121143L;
        it$FireworkPhase.bdic[13] = 1862996506491278461L;
        it$FireworkPhase.bdic[14] = 3101051321560090020L;
        it$FireworkPhase.bdic[15] = 8648403213359157231L;
        it$FireworkPhase.bdic[16] = -8116090468876724777L;
        it$FireworkPhase.bdic[17] = -2090022550228369420L;
        it$FireworkPhase.bdic[18] = -2607097445744292395L;
        it$FireworkPhase.bdic[19] = -2871901686299272867L;
        it$FireworkPhase.bdic[20] = 3628840225390481453L;
        it$FireworkPhase.bdic[21] = 3964589227889962618L;
        it$FireworkPhase.bdic[22] = -759123761717203406L;
        it$FireworkPhase.bdic[23] = 8924689057984079123L;
        it$FireworkPhase.bdic[24] = 6386724954273540202L;
        it$FireworkPhase.bdic[25] = 8209832538334581606L;
        it$FireworkPhase.bdic[26] = 1469234108744162144L;
        it$FireworkPhase.bdic[27] = -3510743502825933406L;
        it$FireworkPhase.bdic[28] = 3539763150806947581L;
        it$FireworkPhase.bdic[29] = 978219075853124435L;
        it$FireworkPhase.bdic[30] = 830594697296257528L;
        it$FireworkPhase.bdic[31] = 1491763407800121930L;
        it$FireworkPhase.bdic[32] = 7561039418980049645L;
        it$FireworkPhase.bdic[33] = -1771071212093048876L;
        it$FireworkPhase.bdic[34] = 9181348343422109842L;
        it$FireworkPhase.bdic[35] = -5235753001959607689L;
        it$FireworkPhase.bdic[36] = 221856242089810548L;
        it$FireworkPhase.bdic[37] = -358148378645976508L;
        it$FireworkPhase.bdic[38] = -8824416927642478553L;
        it$FireworkPhase.bdic[39] = -4105404241492522548L;
        it$FireworkPhase.bdic[40] = 5110302954289324672L;
        it$FireworkPhase.bdic[41] = -1514738280393563489L;
        it$FireworkPhase.bdic[42] = 2548526150556067240L;
        it$FireworkPhase.bdic[43] = -5904869717738009442L;
        it$FireworkPhase.bdic[44] = 3045332568070984931L;
        it$FireworkPhase.bdic[45] = 3674177161292619475L;
        it$FireworkPhase.bdic[46] = -4075247220409707317L;
        it$FireworkPhase.bdic[47] = -7615512007877408452L;
    }

    private static /* synthetic */ int bdig(int n2) {
        return bdih[n2] ^ bdij[n2];
    }

    static {
        bdih = new int[52];
        bdij = new int[52];
        it$FireworkPhase.bdnz();
        it$FireworkPhase.bdob();
        bdhy = new long[48];
        bdic = new long[48];
        it$FireworkPhase.bdoc();
        it$FireworkPhase.bdod();
        IDLE = new it$FireworkPhase();
        PRE_STOP = new it$FireworkPhase();
        STOPPING = new it$FireworkPhase();
        WAIT_STOP = new it$FireworkPhase();
        PRE_SWAP = new it$FireworkPhase();
        SWAP_TO_HAND = new it$FireworkPhase();
        AWAIT_ITEM = new it$FireworkPhase();
        USE = new it$FireworkPhase();
        POST_USE = new it$FireworkPhase();
        SWAP_BACK = new it$FireworkPhase();
        RESUMING = new it$FireworkPhase();
        $VALUES = it$FireworkPhase.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ it$FireworkPhase[] $values() {
        v0 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(v1 - it$FireworkPhase.bdid("bdkr", bdhv(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -938126131: {
                    break block40;
                }
                case -854514564: {
                    v1 = it$FireworkPhase.bdid("bdkt", bdhv(int ), (int)19);
                    continue block40;
                }
                case 1006674624: {
                    v1 = it$FireworkPhase.bdid("bdky", bdhv(int ), (int)20);
                    continue block40;
                }
            }
            break;
        }
        var2 = it$FireworkPhase.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdkz", bdhv(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == it$FireworkPhase.bdid("bdlb", bdig(int ), (int)19)) break;
            v2 /* !! */  = (long)it$FireworkPhase.bdid("bdlc", bdig(int ), (int)20);
        }
        var1_1 = it$FireworkPhase.b;
        v3 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl26
        block42: while (true) {
            v3 /* !! */  = (long)(v4 - it$FireworkPhase.bdid("bdld", bdhv(int ), (int)22));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2040402487: {
                    v4 = it$FireworkPhase.bdid("bdle", bdhv(int ), (int)23);
                    continue block42;
                }
                case -938126131: {
                    break block42;
                }
                case 157372853: {
                    v4 = it$FireworkPhase.bdid("bdlk", bdhv(int ), (int)24);
                    continue block42;
                }
            }
            break;
        }
        var0_2 = it$FireworkPhase.a;
        if (var2) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl41:
        // 1 sources

        v5 = new it$FireworkPhase[11];
        v6 = it$FireworkPhase.bdid("bdll", bdig(int ), (int)21);
        v7 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl47
        block44: while (true) {
            v7 /* !! */  = (long)(it$FireworkPhase.bdid("bdlo", bdhv(int ), (int)26) - it$FireworkPhase.bdid("bdlm", bdhv(int ), (int)25));
lbl47:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -938126131: {
                    break block44;
                }
                case -298984840: {
                    continue block44;
                }
            }
            break;
        }
        v5[v6] = it$FireworkPhase.IDLE;
        v8 = it$FireworkPhase.bdid("bdlp", bdig(int ), (int)22);
        v9 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl58
        block45: while (true) {
            v9 /* !! */  = (long)(v10 - it$FireworkPhase.bdid("bdlq", bdhv(int ), (int)27));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1500343235: {
                    v10 = it$FireworkPhase.bdid("bdls", bdhv(int ), (int)28);
                    continue block45;
                }
                case -1365539842: {
                    v10 = it$FireworkPhase.bdid("bdlx", bdhv(int ), (int)29);
                    continue block45;
                }
                case -938126131: {
                    break block45;
                }
                case 2057190098: {
                    v10 = it$FireworkPhase.bdid("bdlz", bdhv(int ), (int)30);
                    continue block45;
                }
            }
            break;
        }
        v5[v8] = it$FireworkPhase.PRE_STOP;
        v11 = it$FireworkPhase.bdid("bdmb", bdig(int ), (int)23);
        while (true) {
            if ((v12 = (cfr_temp_1 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdmc", bdhv(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 == it$FireworkPhase.bdid("bdmd", bdig(int ), (int)24)) break;
            v12 = 1612204456;
        }
        v5[v11] = it$FireworkPhase.STOPPING;
        v13 = it$FireworkPhase.bdid("bdme", bdig(int ), (int)25);
        v14 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl84
        block47: while (true) {
            v14 /* !! */  = (long)(v15 - it$FireworkPhase.bdid("bdmg", bdhv(int ), (int)32));
lbl84:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -2080498269: {
                    v15 = it$FireworkPhase.bdid("bdmh", bdhv(int ), (int)33);
                    continue block47;
                }
                case -938126131: {
                    break block47;
                }
                case 1769029514: {
                    v15 = it$FireworkPhase.bdid("bdmi", bdhv(int ), (int)34);
                    continue block47;
                }
            }
            break;
        }
        v5[v13] = it$FireworkPhase.WAIT_STOP;
        v16 = it$FireworkPhase.bdid("bdmj", bdig(int ), (int)26);
        while (true) {
            if ((v17 = (cfr_temp_2 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdmk", bdhv(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v17 == it$FireworkPhase.bdid("bdml", bdig(int ), (int)27)) break;
            v17 = 2082576219;
        }
        v5[v16] = it$FireworkPhase.PRE_SWAP;
        v18 = it$FireworkPhase.bdid("bdmm", bdig(int ), (int)28);
        v19 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl107
        block49: while (true) {
            v19 /* !! */  = (long)(v20 - it$FireworkPhase.bdid("bdmo", bdhv(int ), (int)36));
lbl107:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -938126131: {
                    break block49;
                }
                case 188654688: {
                    v20 = it$FireworkPhase.bdid("bdmp", bdhv(int ), (int)37);
                    continue block49;
                }
                case 1155839731: {
                    v20 = it$FireworkPhase.bdid("bdmq", bdhv(int ), (int)38);
                    continue block49;
                }
                case 1268662499: {
                    v20 = it$FireworkPhase.bdid("bdmr", bdhv(int ), (int)39);
                    continue block49;
                }
            }
            break;
        }
        v5[v18] = it$FireworkPhase.SWAP_TO_HAND;
        v21 = it$FireworkPhase.bdid("bdms", bdig(int ), (int)29);
        while (true) {
            if ((v22 = (cfr_temp_3 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdmt", bdhv(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v22 == it$FireworkPhase.bdid("bdmu", bdig(int ), (int)30)) break;
            v22 = 1098385005;
        }
        v5[v21] = it$FireworkPhase.AWAIT_ITEM;
        v23 = it$FireworkPhase.bdid("bdmv", bdig(int ), (int)31);
        while (true) {
            if ((v24 = (cfr_temp_4 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdmw", bdhv(int ), (int)41)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v24 == it$FireworkPhase.bdid("bdmx", bdig(int ), (int)32)) break;
            v24 = 1697304438;
        }
        v5[v23] = it$FireworkPhase.USE;
        v25 = it$FireworkPhase.bdid("bdmz", bdig(int ), (int)33);
        while (true) {
            if ((v26 = (cfr_temp_5 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdna", bdhv(int ), (int)42)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v26 == it$FireworkPhase.bdid("bdnb", bdig(int ), (int)34)) break;
            v26 = 143361826;
        }
        v5[v25] = it$FireworkPhase.POST_USE;
        v27 = it$FireworkPhase.bdid("bdnc", bdig(int ), (int)35);
        v28 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl149
        block53: while (true) {
            v28 /* !! */  = (long)(it$FireworkPhase.bdid("bdne", bdhv(int ), (int)44) - it$FireworkPhase.bdid("bdnd", bdhv(int ), (int)43));
lbl149:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -938126131: {
                    break block53;
                }
                case 666193140: {
                    continue block53;
                }
            }
            break;
        }
        v5[v27] = it$FireworkPhase.SWAP_BACK;
        v29 = it$FireworkPhase.bdid("bdnf", bdig(int ), (int)36);
        v30 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl160
        block54: while (true) {
            v30 /* !! */  = (long)(v31 - it$FireworkPhase.bdid("bdng", bdhv(int ), (int)45));
lbl160:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case -1103339777: {
                    v31 = it$FireworkPhase.bdid("bdnh", bdhv(int ), (int)46);
                    continue block54;
                }
                case -1021252954: {
                    v31 = it$FireworkPhase.bdid("bdni", bdhv(int ), (int)47);
                    continue block54;
                }
                case -938126131: {
                    break block54;
                }
            }
            break;
        }
        v5[v29] = it$FireworkPhase.RESUMING;
        return v5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static it$FireworkPhase valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdjo", bdhv(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == it$FireworkPhase.bdid("bdjq", bdig(int ), (int)6)) break;
            v0 /* !! */  = (long)it$FireworkPhase.bdid("bdjr", bdig(int ), (int)7);
        }
        var3_1 = it$FireworkPhase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdjt", bdhv(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == it$FireworkPhase.bdid("bdjv", bdig(int ), (int)8)) break;
            v1 /* !! */  = (long)it$FireworkPhase.bdid("bdjw", bdig(int ), (int)9);
        }
        var2_2 /* !! */  = it$FireworkPhase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdjy", bdhv(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == it$FireworkPhase.bdid("bdjz", bdig(int ), (int)10)) break;
            v2 /* !! */  = (long)it$FireworkPhase.bdid("bdka", bdig(int ), (int)11);
        }
        var1_3 = it$FireworkPhase.a;
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
                v3 /* !! */  = it$FireworkPhase.cx;
                if (true) ** GOTO lbl35
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - it$FireworkPhase.bdid("bdkb", bdhv(int ), (int)15));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -938126131: {
                            break block15;
                        }
                        case -391300995: {
                            v4 = it$FireworkPhase.bdid("bdkd", bdhv(int ), (int)16);
                            continue block15;
                        }
                        case 1796061541: {
                            v4 = it$FireworkPhase.bdid("bdke", bdhv(int ), (int)17);
                            continue block15;
                        }
                    }
                    break;
                }
                return Enum.valueOf(it$FireworkPhase.class, var0);
            }
lbl45:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)it$FireworkPhase.bdid("bdkg", bdig(int ), (int)12);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)it$FireworkPhase.bdid("bdki", bdig(int ), (int)13);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)it$FireworkPhase.bdid("bdkj", bdig(int ), (int)14);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)it$FireworkPhase.bdid("bdkk", bdig(int ), (int)15);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bdid(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static it$FireworkPhase[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = it$FireworkPhase.cx - it$FireworkPhase.bdid("bdie", bdhv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == it$FireworkPhase.bdid("bdio", bdig(int ), (int)0)) break;
            v0 /* !! */  = (long)it$FireworkPhase.bdid("bdiq", bdig(int ), (int)1);
        }
        var2 = it$FireworkPhase.c;
        v1 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl12
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - it$FireworkPhase.bdid("bdir", bdhv(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -941830155: {
                    v2 = it$FireworkPhase.bdid("bdis", bdhv(int ), (int)2);
                    continue block20;
                }
                case -938126131: {
                    break block20;
                }
                case 719165609: {
                    v2 = it$FireworkPhase.bdid("bdit", bdhv(int ), (int)3);
                    continue block20;
                }
                case 1136388929: {
                    v2 = it$FireworkPhase.bdid("bdiu", bdhv(int ), (int)4);
                    continue block20;
                }
            }
            break;
        }
        var1_1 = it$FireworkPhase.b;
        v3 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - it$FireworkPhase.bdid("bdiv", bdhv(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1636117462: {
                    v4 = it$FireworkPhase.bdid("bdiw", bdhv(int ), (int)6);
                    continue block21;
                }
                case -938126131: {
                    break block21;
                }
                case 1284370029: {
                    v4 = it$FireworkPhase.bdid("bdiy", bdhv(int ), (int)7);
                    continue block21;
                }
            }
            break;
        }
        var0_2 = it$FireworkPhase.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        v5 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl48
        block23: while (true) {
            v5 /* !! */  = (long)(it$FireworkPhase.bdid("bdjc", bdhv(int ), (int)9) - it$FireworkPhase.bdid("bdja", bdhv(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1590866959: {
                    continue block23;
                }
                case -938126131: {
                    break block23;
                }
            }
            break;
        }
        v6 /* !! */  = it$FireworkPhase.cx;
        if (true) ** GOTO lbl57
        block24: while (true) {
            v6 /* !! */  = (long)(it$FireworkPhase.bdid("bdjf", bdhv(int ), (int)11) - it$FireworkPhase.bdid("bdje", bdhv(int ), (int)10));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1665276458: {
                    continue block24;
                }
                case -938126131: {
                    break block24;
                }
            }
            break;
        }
        return (it$FireworkPhase[])it$FireworkPhase.$VALUES.clone();
    }

    private static /* synthetic */ void bdnz() {
        it$FireworkPhase.bdih[0] = 182225333;
        it$FireworkPhase.bdih[1] = 1684803939;
        it$FireworkPhase.bdih[2] = -607211791;
        it$FireworkPhase.bdih[3] = 356073933;
        it$FireworkPhase.bdih[4] = 685783354;
        it$FireworkPhase.bdih[5] = -1811922189;
        it$FireworkPhase.bdih[6] = -1680327136;
        it$FireworkPhase.bdih[7] = 147817752;
        it$FireworkPhase.bdih[8] = -1989788259;
        it$FireworkPhase.bdih[9] = 1791279119;
        it$FireworkPhase.bdih[10] = 1834525196;
        it$FireworkPhase.bdih[11] = 1336201266;
        it$FireworkPhase.bdih[12] = 961751306;
        it$FireworkPhase.bdih[13] = 2074892863;
        it$FireworkPhase.bdih[14] = 2096311139;
        it$FireworkPhase.bdih[15] = 1118729077;
        it$FireworkPhase.bdih[16] = -788423664;
        it$FireworkPhase.bdih[17] = 1860901947;
        it$FireworkPhase.bdih[18] = 825226544;
        it$FireworkPhase.bdih[19] = 370386552;
        it$FireworkPhase.bdih[20] = -1947263292;
        it$FireworkPhase.bdih[21] = 657148995;
        it$FireworkPhase.bdih[22] = -182889264;
        it$FireworkPhase.bdih[23] = 1605003798;
        it$FireworkPhase.bdih[24] = 166975499;
        it$FireworkPhase.bdih[25] = -2083346803;
        it$FireworkPhase.bdih[26] = -1280226855;
        it$FireworkPhase.bdih[27] = 1282162691;
        it$FireworkPhase.bdih[28] = 160851038;
        it$FireworkPhase.bdih[29] = 1486612475;
        it$FireworkPhase.bdih[30] = -275205898;
        it$FireworkPhase.bdih[31] = 593359878;
        it$FireworkPhase.bdih[32] = 1720145429;
        it$FireworkPhase.bdih[33] = 666456288;
        it$FireworkPhase.bdih[34] = 484047734;
        it$FireworkPhase.bdih[35] = 1909798679;
        it$FireworkPhase.bdih[36] = 2120200745;
        it$FireworkPhase.bdih[37] = -700959693;
        it$FireworkPhase.bdih[38] = -179834140;
        it$FireworkPhase.bdih[39] = 920128792;
        it$FireworkPhase.bdih[40] = -1898843793;
        it$FireworkPhase.bdih[41] = -1406501584;
        it$FireworkPhase.bdih[42] = -578279686;
        it$FireworkPhase.bdih[43] = -1519132546;
        it$FireworkPhase.bdih[44] = -908248976;
        it$FireworkPhase.bdih[45] = -78038840;
        it$FireworkPhase.bdih[46] = 96682774;
        it$FireworkPhase.bdih[47] = -1228333221;
        it$FireworkPhase.bdih[48] = -408053189;
        it$FireworkPhase.bdih[49] = 1822616763;
        it$FireworkPhase.bdih[50] = 1559076500;
        it$FireworkPhase.bdih[51] = -413084479;
    }

    private static /* synthetic */ void bdob() {
        it$FireworkPhase.bdij[0] = 182225332;
        it$FireworkPhase.bdij[1] = 176353620;
        it$FireworkPhase.bdij[2] = -607211790;
        it$FireworkPhase.bdij[3] = 356073935;
        it$FireworkPhase.bdij[4] = 685783354;
        it$FireworkPhase.bdij[5] = -1811922190;
        it$FireworkPhase.bdij[6] = -1680327135;
        it$FireworkPhase.bdij[7] = 863101008;
        it$FireworkPhase.bdij[8] = -1989788260;
        it$FireworkPhase.bdij[9] = 2075570259;
        it$FireworkPhase.bdij[10] = -1834525197;
        it$FireworkPhase.bdij[11] = 1873416206;
        it$FireworkPhase.bdij[12] = 961751304;
        it$FireworkPhase.bdij[13] = 2074892861;
        it$FireworkPhase.bdij[14] = 2096311138;
        it$FireworkPhase.bdij[15] = 1118729077;
        it$FireworkPhase.bdij[16] = -788423663;
        it$FireworkPhase.bdij[17] = 1860901945;
        it$FireworkPhase.bdij[18] = 825226545;
        it$FireworkPhase.bdij[19] = 370386553;
        it$FireworkPhase.bdij[20] = 1731881487;
        it$FireworkPhase.bdij[21] = 657148995;
        it$FireworkPhase.bdij[22] = -182889263;
        it$FireworkPhase.bdij[23] = 1605003796;
        it$FireworkPhase.bdij[24] = -166975500;
        it$FireworkPhase.bdij[25] = -2083346802;
        it$FireworkPhase.bdij[26] = -1280226851;
        it$FireworkPhase.bdij[27] = 1282162690;
        it$FireworkPhase.bdij[28] = 160851035;
        it$FireworkPhase.bdij[29] = 1486612477;
        it$FireworkPhase.bdij[30] = -275205897;
        it$FireworkPhase.bdij[31] = 593359873;
        it$FireworkPhase.bdij[32] = 1720145428;
        it$FireworkPhase.bdij[33] = 666456296;
        it$FireworkPhase.bdij[34] = -484047735;
        it$FireworkPhase.bdij[35] = 1909798686;
        it$FireworkPhase.bdij[36] = 2120200739;
        it$FireworkPhase.bdij[37] = -700959693;
        it$FireworkPhase.bdij[38] = -179834138;
        it$FireworkPhase.bdij[39] = 920128793;
        it$FireworkPhase.bdij[40] = -1898843793;
        it$FireworkPhase.bdij[41] = -1406501584;
        it$FireworkPhase.bdij[42] = -578279685;
        it$FireworkPhase.bdij[43] = -1519132548;
        it$FireworkPhase.bdij[44] = -908248973;
        it$FireworkPhase.bdij[45] = -78038836;
        it$FireworkPhase.bdij[46] = 96682771;
        it$FireworkPhase.bdij[47] = -1228333219;
        it$FireworkPhase.bdij[48] = -408053188;
        it$FireworkPhase.bdij[49] = 1822616755;
        it$FireworkPhase.bdij[50] = 1559076509;
        it$FireworkPhase.bdij[51] = -413084469;
    }

    private static /* synthetic */ long bdhv(int n2) {
        return bdhy[n2] ^ bdic[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private it$FireworkPhase() {
        var4_3 /* !! */  = it$FireworkPhase.b;
        var3_4 = it$FireworkPhase.a;
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
                var4_3 /* !! */  = (int)it$FireworkPhase.bdid("bdkn", bdig(int ), (int)16);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)it$FireworkPhase.bdid("bdkp", bdig(int ), (int)17);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)it$FireworkPhase.bdid("bdkq", bdig(int ), (int)18);
        ** while (true)
    }
}

