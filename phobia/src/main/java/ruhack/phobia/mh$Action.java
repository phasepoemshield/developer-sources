/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class mh$Action
extends Enum<mh$Action> {
    private static long[] krjw;
    public static final /* enum */ mh$Action MULTIPLAYER;
    public static final /* enum */ mh$Action OPTIONS;
    public static final boolean c;
    public static final /* enum */ mh$Action SINGLEPLAYER;
    private static long[] krjv;
    public static final /* enum */ mh$Action ACCOUNTS;
    public static final int b;
    private static final /* synthetic */ mh$Action[] $VALUES;
    protected static final long tc = 488640231165409701L;
    private static int[] krke;
    public static final boolean a;
    private static int[] krkf;

    private static /* synthetic */ void krmv() {
        mh$Action.krke[0] = 374157271;
        mh$Action.krke[1] = -486278360;
        mh$Action.krke[2] = 1581682840;
        mh$Action.krke[3] = 1841645243;
        mh$Action.krke[4] = 456646742;
        mh$Action.krke[5] = 1986095080;
        mh$Action.krke[6] = 1792149104;
        mh$Action.krke[7] = 2029047065;
        mh$Action.krke[8] = 725470251;
        mh$Action.krke[9] = 269807468;
        mh$Action.krke[10] = -503935437;
        mh$Action.krke[11] = -103722518;
        mh$Action.krke[12] = 1199232032;
        mh$Action.krke[13] = -1368687473;
        mh$Action.krke[14] = 1148459581;
        mh$Action.krke[15] = 1883130842;
        mh$Action.krke[16] = -601826791;
        mh$Action.krke[17] = -351761653;
        mh$Action.krke[18] = -1544808301;
        mh$Action.krke[19] = -960862744;
        mh$Action.krke[20] = 198139681;
        mh$Action.krke[21] = 106811434;
        mh$Action.krke[22] = 1643911854;
        mh$Action.krke[23] = 1607105675;
        mh$Action.krke[24] = 708794908;
        mh$Action.krke[25] = 528602603;
        mh$Action.krke[26] = 344809608;
        mh$Action.krke[27] = 396015861;
        mh$Action.krke[28] = 1681658728;
        mh$Action.krke[29] = 321770190;
        mh$Action.krke[30] = -1983339459;
        mh$Action.krke[31] = 1429048873;
        mh$Action.krke[32] = -1090133945;
        mh$Action.krke[33] = 1676780669;
        mh$Action.krke[34] = -1033328487;
        mh$Action.krke[35] = -202173866;
        mh$Action.krke[36] = 1209470552;
        mh$Action.krke[37] = 1316078763;
        mh$Action.krke[38] = -732330904;
    }

    private static /* synthetic */ void krmx() {
        mh$Action.krjv[0] = 7998862021896992576L;
        mh$Action.krjv[1] = 4754809287872026740L;
        mh$Action.krjv[2] = -4951510286289755031L;
        mh$Action.krjv[3] = -2905536942833175287L;
        mh$Action.krjv[4] = -2656192443101768183L;
        mh$Action.krjv[5] = 5322496383561019351L;
        mh$Action.krjv[6] = -6533713272443211264L;
        mh$Action.krjv[7] = 2271178162237664477L;
        mh$Action.krjv[8] = -8591261738710551853L;
        mh$Action.krjv[9] = -6106780424192235473L;
        mh$Action.krjv[10] = 5339418134019890517L;
        mh$Action.krjv[11] = 2919553503067220742L;
        mh$Action.krjv[12] = -4492872687227425992L;
        mh$Action.krjv[13] = 952554453632841560L;
        mh$Action.krjv[14] = 5200057869001603821L;
        mh$Action.krjv[15] = 896821335643624198L;
        mh$Action.krjv[16] = -157630254183554042L;
        mh$Action.krjv[17] = 4875456823820958926L;
        mh$Action.krjv[18] = -2896894383634647598L;
        mh$Action.krjv[19] = 3006415714477042493L;
        mh$Action.krjv[20] = 960527944992716226L;
        mh$Action.krjv[21] = 3947006907928636947L;
        mh$Action.krjv[22] = -6977572470857009381L;
        mh$Action.krjv[23] = 2572380085937637295L;
        mh$Action.krjv[24] = 2733829673495282470L;
        mh$Action.krjv[25] = -5814812421744388321L;
        mh$Action.krjv[26] = -616754647441173340L;
        mh$Action.krjv[27] = 2186634336467322404L;
        mh$Action.krjv[28] = 7620680642162168086L;
        mh$Action.krjv[29] = -7657062585053705122L;
        mh$Action.krjv[30] = 6577845525554276372L;
        mh$Action.krjv[31] = 1046052556157298285L;
        mh$Action.krjv[32] = -6040474886476191072L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mh$Action[] $values() {
        v0 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - mh$Action.krjx("krlo", krju(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1986774619: {
                    break block22;
                }
                case -1172432615: {
                    v1 = mh$Action.krjx("krlp", krju(int ), (int)17);
                    continue block22;
                }
                case -1018354989: {
                    v1 = mh$Action.krjx("krlq", krju(int ), (int)18);
                    continue block22;
                }
                case 954348435: {
                    v1 = mh$Action.krjx("krlr", krju(int ), (int)19);
                    continue block22;
                }
            }
            break;
        }
        var2 = mh$Action.c;
        v2 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - mh$Action.krjx("krls", krju(int ), (int)20));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1986774619: {
                    break block23;
                }
                case -932985529: {
                    v3 = mh$Action.krjx("krlt", krju(int ), (int)21);
                    continue block23;
                }
                case -441206347: {
                    v3 = mh$Action.krjx("krlu", krju(int ), (int)22);
                    continue block23;
                }
            }
            break;
        }
        var1_1 = mh$Action.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = mh$Action.tc - mh$Action.krjx("krlv", krju(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mh$Action.krjx("krlw", krkd(int ), (int)23)) break;
            v4 /* !! */  = (long)mh$Action.krjx("krlx", krkd(int ), (int)24);
        }
        var0_2 = mh$Action.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        v5 = new mh$Action[4];
        v6 = mh$Action.krjx("krly", krkd(int ), (int)25);
        while (true) {
            if ((v7 = (cfr_temp_1 = mh$Action.tc - mh$Action.krjx("krlz", krju(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 == mh$Action.krjx("krma", krkd(int ), (int)26)) break;
            v7 = -610179783;
        }
        v5[v6] = mh$Action.MULTIPLAYER;
        v8 = mh$Action.krjx("krmb", krkd(int ), (int)27);
        v9 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl58
        block27: while (true) {
            v9 /* !! */  = (long)(v10 - mh$Action.krjx("krmc", krju(int ), (int)25));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1986774619: {
                    break block27;
                }
                case -1602730795: {
                    v10 = mh$Action.krjx("krmd", krju(int ), (int)26);
                    continue block27;
                }
                case -1512642729: {
                    v10 = mh$Action.krjx("krme", krju(int ), (int)27);
                    continue block27;
                }
                case 536374112: {
                    v10 = mh$Action.krjx("krmf", krju(int ), (int)28);
                    continue block27;
                }
            }
            break;
        }
        v5[v8] = mh$Action.SINGLEPLAYER;
        v11 = mh$Action.krjx("krmg", krkd(int ), (int)28);
        v12 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl76
        block28: while (true) {
            v12 /* !! */  = (long)(v13 - mh$Action.krjx("krmh", krju(int ), (int)29));
lbl76:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2137327971: {
                    v13 = mh$Action.krjx("krmi", krju(int ), (int)30);
                    continue block28;
                }
                case -1986774619: {
                    break block28;
                }
                case -1876859185: {
                    v13 = mh$Action.krjx("krmj", krju(int ), (int)31);
                    continue block28;
                }
            }
            break;
        }
        v5[v11] = mh$Action.OPTIONS;
        v14 = mh$Action.krjx("krmk", krkd(int ), (int)29);
        while (true) {
            if ((v15 = (cfr_temp_2 = mh$Action.tc - mh$Action.krjx("krml", krju(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v15 == mh$Action.krjx("krmm", krkd(int ), (int)30)) break;
            v15 = 918305277;
        }
        v5[v14] = mh$Action.ACCOUNTS;
        return v5;
    }

    private static /* synthetic */ long krju(int n2) {
        return krjv[n2] ^ krjw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mh$Action[] values() {
        v0 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - mh$Action.krjx("krjy", krju(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1986774619: {
                    break block18;
                }
                case -1475337021: {
                    v1 = mh$Action.krjx("krjz", krju(int ), (int)1);
                    continue block18;
                }
                case -934225474: {
                    v1 = mh$Action.krjx("krka", krju(int ), (int)2);
                    continue block18;
                }
                case 2044213268: {
                    v1 = mh$Action.krjx("krkb", krju(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var2 = mh$Action.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mh$Action.tc - mh$Action.krjx("krkc", krju(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mh$Action.krjx("krkg", krkd(int ), (int)0)) break;
            v2 /* !! */  = (long)mh$Action.krjx("krkh", krkd(int ), (int)1);
        }
        var1_1 /* !! */  = mh$Action.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mh$Action.tc - mh$Action.krjx("krki", krju(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mh$Action.krjx("krkj", krkd(int ), (int)2)) break;
            v3 /* !! */  = (long)mh$Action.krjx("krkk", krkd(int ), (int)3);
        }
        var0_2 = mh$Action.a;
        if (!var2) ** GOTO lbl38
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var0_2 || var0_2) continue block21;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mh$Action.tc - mh$Action.krjx("krkl", krju(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mh$Action.krjx("krkm", krkd(int ), (int)4)) break;
                    v4 /* !! */  = (long)mh$Action.krjx("krkn", krkd(int ), (int)5);
                }
                v5 /* !! */  = mh$Action.tc;
                if (true) ** GOTO lbl49
                block23: while (true) {
                    v5 /* !! */  = (long)(v6 - mh$Action.krjx("krko", krju(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1986774619: {
                            break block23;
                        }
                        case -1299193436: {
                            v6 = mh$Action.krjx("krkp", krju(int ), (int)8);
                            continue block23;
                        }
                        case -697597181: {
                            v6 = mh$Action.krjx("krkq", krju(int ), (int)9);
                            continue block23;
                        }
                        case 2139195787: {
                            v6 = mh$Action.krjx("krkr", krju(int ), (int)10);
                            continue block23;
                        }
                    }
                    break;
                }
                return (mh$Action[])mh$Action.$VALUES.clone();
lbl62:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)mh$Action.krjx("krks", krkd(int ), (int)6);
                    if (!var2) break block21;
                    throw null;
                }
lbl66:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)mh$Action.krjx("krkt", krkd(int ), (int)7);
                        if (!var2) ** GOTO lbl62
                        throw null;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)mh$Action.krjx("krku", krkd(int ), (int)8);
                    if (!var2) ** GOTO lbl66
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)mh$Action.krjx("krkv", krkd(int ), (int)9);
        ** while (!var2)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int krkd(int n2) {
        return krke[n2] ^ krkf[n2];
    }

    static {
        krke = new int[39];
        krkf = new int[39];
        mh$Action.krmv();
        mh$Action.krmw();
        krjv = new long[33];
        krjw = new long[33];
        mh$Action.krmx();
        mh$Action.krmy();
        MULTIPLAYER = new mh$Action();
        SINGLEPLAYER = new mh$Action();
        OPTIONS = new mh$Action();
        ACCOUNTS = new mh$Action();
        $VALUES = mh$Action.$values();
    }

    public static /* synthetic */ CallSite krjx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void krmy() {
        mh$Action.krjw[0] = -1276673809396321870L;
        mh$Action.krjw[1] = -1264262123069033499L;
        mh$Action.krjw[2] = 2631415686319891836L;
        mh$Action.krjw[3] = -8989388001864333826L;
        mh$Action.krjw[4] = 4333652305775035685L;
        mh$Action.krjw[5] = -3166963049337223753L;
        mh$Action.krjw[6] = 4583156475099971753L;
        mh$Action.krjw[7] = 2301483263323244844L;
        mh$Action.krjw[8] = -6166708866572929257L;
        mh$Action.krjw[9] = 2579205451669340869L;
        mh$Action.krjw[10] = -536827267521719677L;
        mh$Action.krjw[11] = 3498797486179801362L;
        mh$Action.krjw[12] = -8140807934014967977L;
        mh$Action.krjw[13] = 2274166997799893783L;
        mh$Action.krjw[14] = -5980089089367961923L;
        mh$Action.krjw[15] = 8241562873333923721L;
        mh$Action.krjw[16] = 6415834551563144773L;
        mh$Action.krjw[17] = 7810508164460445021L;
        mh$Action.krjw[18] = 8336148270933631355L;
        mh$Action.krjw[19] = -4749535584839120782L;
        mh$Action.krjw[20] = 1714013775477720629L;
        mh$Action.krjw[21] = -7339697598646026825L;
        mh$Action.krjw[22] = -3231423454180198788L;
        mh$Action.krjw[23] = -1031690918142553922L;
        mh$Action.krjw[24] = 2184552439856911383L;
        mh$Action.krjw[25] = 1443178829031518556L;
        mh$Action.krjw[26] = -1133274300279270824L;
        mh$Action.krjw[27] = 2258419513528408696L;
        mh$Action.krjw[28] = -6485700356830056003L;
        mh$Action.krjw[29] = -1851056488160696586L;
        mh$Action.krjw[30] = -7542955044790104673L;
        mh$Action.krjw[31] = 3526456292790112218L;
        mh$Action.krjw[32] = -4203183964129268935L;
    }

    private static /* synthetic */ void krmw() {
        mh$Action.krkf[0] = 374157270;
        mh$Action.krkf[1] = -677659278;
        mh$Action.krkf[2] = 1581682841;
        mh$Action.krkf[3] = 1041732197;
        mh$Action.krkf[4] = 456646743;
        mh$Action.krkf[5] = 1909967010;
        mh$Action.krkf[6] = 1792149106;
        mh$Action.krkf[7] = 2029047067;
        mh$Action.krkf[8] = 725470248;
        mh$Action.krkf[9] = 269807469;
        mh$Action.krkf[10] = 503935436;
        mh$Action.krkf[11] = -1639346893;
        mh$Action.krkf[12] = 1199232033;
        mh$Action.krkf[13] = -1464713962;
        mh$Action.krkf[14] = -1148459582;
        mh$Action.krkf[15] = 1276728107;
        mh$Action.krkf[16] = -601826790;
        mh$Action.krkf[17] = -351761655;
        mh$Action.krkf[18] = -1544808301;
        mh$Action.krkf[19] = -960862743;
        mh$Action.krkf[20] = 198139683;
        mh$Action.krkf[21] = 106811435;
        mh$Action.krkf[22] = 1643911852;
        mh$Action.krkf[23] = 1607105674;
        mh$Action.krkf[24] = -480116647;
        mh$Action.krkf[25] = 528602603;
        mh$Action.krkf[26] = -344809609;
        mh$Action.krkf[27] = 396015860;
        mh$Action.krkf[28] = 1681658730;
        mh$Action.krkf[29] = 321770189;
        mh$Action.krkf[30] = 1983339458;
        mh$Action.krkf[31] = 1429048874;
        mh$Action.krkf[32] = -1090133945;
        mh$Action.krkf[33] = 1676780671;
        mh$Action.krkf[34] = -1033328487;
        mh$Action.krkf[35] = -202173866;
        mh$Action.krkf[36] = 1209470553;
        mh$Action.krkf[37] = 1316078761;
        mh$Action.krkf[38] = -732330901;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mh$Action() {
        var4_3 /* !! */  = mh$Action.b;
        var3_4 = mh$Action.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)mh$Action.krjx("krll", krkd(int ), (int)20);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mh$Action.krjx("krlm", krkd(int ), (int)21);
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)mh$Action.krjx("krln", krkd(int ), (int)22);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mh$Action valueOf(String var0) {
        v0 /* !! */  = mh$Action.tc;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(mh$Action.krjx("krkx", krju(int ), (int)12) - mh$Action.krjx("krkw", krju(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1986774619: {
                    break block10;
                }
                case -1592520908: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = mh$Action.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mh$Action.tc - mh$Action.krjx("krky", krju(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mh$Action.krjx("krkz", krkd(int ), (int)10)) break;
            v1 /* !! */  = (long)mh$Action.krjx("krla", krkd(int ), (int)11);
        }
        var2_2 /* !! */  = mh$Action.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = mh$Action.tc - mh$Action.krjx("krlb", krju(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == mh$Action.krjx("krlc", krkd(int ), (int)12)) break;
                    v2 /* !! */  = (long)mh$Action.krjx("krld", krkd(int ), (int)13);
                }
                var1_3 = mh$Action.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mh$Action.tc - mh$Action.krjx("krle", krju(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mh$Action.krjx("krlf", krkd(int ), (int)14)) break;
                    v3 /* !! */  = (long)mh$Action.krjx("krlg", krkd(int ), (int)15);
                }
                return Enum.valueOf(mh$Action.class, var0);
            }
lbl40:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mh$Action.krjx("krlh", krkd(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl49
            }
            case 1: {
                var2_2 /* !! */  = (int)mh$Action.krjx("krli", krkd(int ), (int)17);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
lbl49:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mh$Action.krjx("krlj", krkd(int ), (int)18);
                    if (!var3_1) ** GOTO lbl40
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mh$Action.krjx("krlk", krkd(int ), (int)19);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }
}

