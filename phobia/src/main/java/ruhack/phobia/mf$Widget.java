/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

record mf$Widget(String setting, String icon, String label) {
    private final String setting;
    protected static final long at = -593097774187571965L;
    private static long[] ldh;
    private final String icon;
    private static int[] lcy;
    public static final boolean a;
    private static int[] lcz;
    private static long[] ldi;
    private final String label;
    public static final int b;
    public static final boolean c;

    static {
        lcy = new int[60];
        lcz = new int[60];
        mf$Widget.lhj();
        mf$Widget.lhk();
        ldh = new long[42];
        ldi = new long[42];
        mf$Widget.lhl();
        mf$Widget.lhm();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String setting() {
        while (true) {
            block26: {
                if ((v0 /* !! */  = (cfr_temp_1 = mf$Widget.at - mf$Widget.lda("lge", ldg(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != mf$Widget.lda("lgf", lcx(int ), (int)44)) break block26;
                var3_1 = mf$Widget.c;
                v1 /* !! */  = mf$Widget.at;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)mf$Widget.lda("lgg", lcx(int ), (int)45);
        }
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - mf$Widget.lda("lgh", ldg(int ), (int)28));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -937504767: {
                    v2 = mf$Widget.lda("lgi", ldg(int ), (int)29);
                    continue block12;
                }
                case 480304016: {
                    v2 = mf$Widget.lda("lgj", ldg(int ), (int)30);
                    continue block12;
                }
                case 2088342787: {
                    break block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = mf$Widget.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block13: while (true) {
            block27: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = mf$Widget.at - mf$Widget.lda("lgk", ldg(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == mf$Widget.lda("lgl", lcx(int ), (int)46)) {
                                var1_3 = mf$Widget.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)mf$Widget.lda("lgm", lcx(int ), (int)47);
                        }
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = mf$Widget.at - mf$Widget.lda("lgn", ldg(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == mf$Widget.lda("lgo", lcx(int ), (int)48)) {
                                return this.setting;
                            }
                            v4 /* !! */  = (long)mf$Widget.lda("lgp", lcx(int ), (int)49);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)mf$Widget.lda("lgq", lcx(int ), (int)50);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block27;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)mf$Widget.lda("lgt", lcx(int ), (int)53);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)mf$Widget.lda("lgr", lcx(int ), (int)51);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl67
            }
            do {
                if (true) continue block13;
lbl67:
                // 2 sources

                var2_2 /* !! */  = (int)mf$Widget.lda("lgs", lcx(int ), (int)52);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mf$Widget(String var1_1, String var2_2, String var3_3) {
        var5_4 /* !! */  = mf$Widget.b;
        super();
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.label = var1_1;
                this.setting = var2_2;
                this.icon = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)mf$Widget.lda("ldb", lcx(int ), (int)0);
                ** GOTO lbl17
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)mf$Widget.lda("ldd", lcx(int ), (int)1);
                    break block0;
                    break;
                }
            }
lbl17:
            // 2 sources

            case 2: {
                while (true) {
                    var5_4 /* !! */  = (int)mf$Widget.lda("lde", lcx(int ), (int)2);
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)mf$Widget.lda("ldf", lcx(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String icon() {
        v0 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(mf$Widget.lda("lgv", ldg(int ), (int)34) - mf$Widget.lda("lgu", ldg(int ), (int)33));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 329741757: {
                    continue block20;
                }
                case 2088342787: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = mf$Widget.c;
        v1 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(mf$Widget.lda("lgx", ldg(int ), (int)36) - mf$Widget.lda("lgw", ldg(int ), (int)35));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -582068257: {
                    continue block21;
                }
                case 2088342787: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = mf$Widget.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mf$Widget.at - mf$Widget.lda("lgy", ldg(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mf$Widget.lda("lgz", lcx(int ), (int)54)) break;
            v2 /* !! */  = (long)mf$Widget.lda("lha", lcx(int ), (int)55);
        }
        var1_3 = mf$Widget.a;
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
                v3 /* !! */  = mf$Widget.at;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - mf$Widget.lda("lhb", ldg(int ), (int)38));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -973955345: {
                            v4 = mf$Widget.lda("lhc", ldg(int ), (int)39);
                            continue block24;
                        }
                        case -584812458: {
                            v4 = mf$Widget.lda("lhd", ldg(int ), (int)40);
                            continue block24;
                        }
                        case 534561301: {
                            v4 = mf$Widget.lda("lhe", ldg(int ), (int)41);
                            continue block24;
                        }
                        case 2088342787: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.icon;
            }
lbl53:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mf$Widget.lda("lhf", lcx(int ), (int)56);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mf$Widget.lda("lhg", lcx(int ), (int)57);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mf$Widget.lda("lhh", lcx(int ), (int)58);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mf$Widget.lda("lhi", lcx(int ), (int)59);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mf$Widget.at - mf$Widget.lda("ldj", ldg(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mf$Widget.lda("ldk", lcx(int ), (int)4)) break;
            v0 /* !! */  = (long)mf$Widget.lda("ldl", lcx(int ), (int)5);
        }
        var3_1 = mf$Widget.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mf$Widget.at - mf$Widget.lda("ldn", ldg(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mf$Widget.lda("ldo", lcx(int ), (int)6)) break;
            v1 /* !! */  = (long)mf$Widget.lda("ldp", lcx(int ), (int)7);
        }
        var2_2 /* !! */  = mf$Widget.b;
        v2 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(mf$Widget.lda("ldr", ldg(int ), (int)3) - mf$Widget.lda("ldq", ldg(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1829964928: {
                    continue block12;
                }
                case 2088342787: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = mf$Widget.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mf$Widget.at - mf$Widget.lda("lds", ldg(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mf$Widget.lda("ldt", lcx(int ), (int)8)) break;
                    v3 /* !! */  = (long)mf$Widget.lda("ldu", lcx(int ), (int)9);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mf$Widget.class, "label;setting;icon", "label", "setting", "icon"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mf$Widget.lda("ldv", lcx(int ), (int)10);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl45:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mf$Widget.lda("ldx", lcx(int ), (int)11);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mf$Widget.lda("ldy", lcx(int ), (int)12);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mf$Widget.lda("ldz", lcx(int ), (int)13);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lhl() {
        mf$Widget.ldh[0] = -111040760401210519L;
        mf$Widget.ldh[1] = 4868485908387469870L;
        mf$Widget.ldh[2] = 3191825733097013969L;
        mf$Widget.ldh[3] = 2572908769035382551L;
        mf$Widget.ldh[4] = 8489674357141184603L;
        mf$Widget.ldh[5] = 4600097387436742950L;
        mf$Widget.ldh[6] = -8066187191721622468L;
        mf$Widget.ldh[7] = 2348159934523637396L;
        mf$Widget.ldh[8] = 3027240675991612761L;
        mf$Widget.ldh[9] = -2629712938137640020L;
        mf$Widget.ldh[10] = 215121698572363808L;
        mf$Widget.ldh[11] = -5364832156671457394L;
        mf$Widget.ldh[12] = -2424165077945286349L;
        mf$Widget.ldh[13] = -297547181051895987L;
        mf$Widget.ldh[14] = -1184662232682826365L;
        mf$Widget.ldh[15] = 6102155873699700934L;
        mf$Widget.ldh[16] = -7191065140275028514L;
        mf$Widget.ldh[17] = 5884824551362368325L;
        mf$Widget.ldh[18] = 502277666785266712L;
        mf$Widget.ldh[19] = 6781462379967445327L;
        mf$Widget.ldh[20] = 2716430598237164811L;
        mf$Widget.ldh[21] = 2963455586341301523L;
        mf$Widget.ldh[22] = -6654727574880366183L;
        mf$Widget.ldh[23] = -7248070682072463810L;
        mf$Widget.ldh[24] = 8257649166548114767L;
        mf$Widget.ldh[25] = 8523055547398549131L;
        mf$Widget.ldh[26] = 6488273027955232479L;
        mf$Widget.ldh[27] = 6917879487127192525L;
        mf$Widget.ldh[28] = -4852923995919140122L;
        mf$Widget.ldh[29] = -1423311606824625266L;
        mf$Widget.ldh[30] = 1314292801972635470L;
        mf$Widget.ldh[31] = -5577158252244552034L;
        mf$Widget.ldh[32] = 4789949148748365177L;
        mf$Widget.ldh[33] = -5949720467120687129L;
        mf$Widget.ldh[34] = 4902291305423713544L;
        mf$Widget.ldh[35] = 5419219826031568084L;
        mf$Widget.ldh[36] = -3975016198820460618L;
        mf$Widget.ldh[37] = -1738925459937101331L;
        mf$Widget.ldh[38] = 1575473020960054053L;
        mf$Widget.ldh[39] = -3212438676307126494L;
        mf$Widget.ldh[40] = -8327350183137258943L;
        mf$Widget.ldh[41] = 6444762123174139365L;
    }

    private static /* synthetic */ void lhj() {
        mf$Widget.lcy[0] = -1958237578;
        mf$Widget.lcy[1] = 660621701;
        mf$Widget.lcy[2] = 880021608;
        mf$Widget.lcy[3] = -324219343;
        mf$Widget.lcy[4] = -1990536072;
        mf$Widget.lcy[5] = -1113451653;
        mf$Widget.lcy[6] = -551182881;
        mf$Widget.lcy[7] = -673809434;
        mf$Widget.lcy[8] = 1224812262;
        mf$Widget.lcy[9] = 854306594;
        mf$Widget.lcy[10] = -1656729691;
        mf$Widget.lcy[11] = -653664823;
        mf$Widget.lcy[12] = -782140614;
        mf$Widget.lcy[13] = 1396087441;
        mf$Widget.lcy[14] = 941930463;
        mf$Widget.lcy[15] = -526063891;
        mf$Widget.lcy[16] = 2060959821;
        mf$Widget.lcy[17] = 1742353671;
        mf$Widget.lcy[18] = 1276568198;
        mf$Widget.lcy[19] = 1970063787;
        mf$Widget.lcy[20] = 1049724227;
        mf$Widget.lcy[21] = -102814264;
        mf$Widget.lcy[22] = 504995303;
        mf$Widget.lcy[23] = -1455000596;
        mf$Widget.lcy[24] = -138917728;
        mf$Widget.lcy[25] = -1877642504;
        mf$Widget.lcy[26] = -536009207;
        mf$Widget.lcy[27] = -1677560329;
        mf$Widget.lcy[28] = 1187052418;
        mf$Widget.lcy[29] = 880196360;
        mf$Widget.lcy[30] = 2060561978;
        mf$Widget.lcy[31] = -788912738;
        mf$Widget.lcy[32] = 1900278553;
        mf$Widget.lcy[33] = -1280696549;
        mf$Widget.lcy[34] = -1667710556;
        mf$Widget.lcy[35] = -1084992978;
        mf$Widget.lcy[36] = -1001441163;
        mf$Widget.lcy[37] = -384030609;
        mf$Widget.lcy[38] = 18101694;
        mf$Widget.lcy[39] = 705907865;
        mf$Widget.lcy[40] = 1503793003;
        mf$Widget.lcy[41] = 1857737992;
        mf$Widget.lcy[42] = 507677281;
        mf$Widget.lcy[43] = -1360901275;
        mf$Widget.lcy[44] = -1309221420;
        mf$Widget.lcy[45] = -1566242589;
        mf$Widget.lcy[46] = 1081829603;
        mf$Widget.lcy[47] = 268954462;
        mf$Widget.lcy[48] = 1780635486;
        mf$Widget.lcy[49] = 642254991;
        mf$Widget.lcy[50] = 16849160;
        mf$Widget.lcy[51] = 1400126966;
        mf$Widget.lcy[52] = -560934848;
        mf$Widget.lcy[53] = 2067324188;
        mf$Widget.lcy[54] = 1589398140;
        mf$Widget.lcy[55] = 1643522287;
        mf$Widget.lcy[56] = 1942294076;
        mf$Widget.lcy[57] = 1203397706;
        mf$Widget.lcy[58] = 212403964;
        mf$Widget.lcy[59] = -1729119822;
    }

    private static /* synthetic */ void lhm() {
        mf$Widget.ldi[0] = -3813676599441868029L;
        mf$Widget.ldi[1] = 8947327125482568344L;
        mf$Widget.ldi[2] = -3672232530778206289L;
        mf$Widget.ldi[3] = 5778492160987914638L;
        mf$Widget.ldi[4] = 5493309242167806767L;
        mf$Widget.ldi[5] = 4240234785385349013L;
        mf$Widget.ldi[6] = -299861266693505829L;
        mf$Widget.ldi[7] = -7935392838816187347L;
        mf$Widget.ldi[8] = 3532248985693365419L;
        mf$Widget.ldi[9] = 1511983656029152940L;
        mf$Widget.ldi[10] = -7007267346868393993L;
        mf$Widget.ldi[11] = 3609114874100884554L;
        mf$Widget.ldi[12] = -6388173555211109464L;
        mf$Widget.ldi[13] = 3679173916882572600L;
        mf$Widget.ldi[14] = 734351276825236829L;
        mf$Widget.ldi[15] = 6765569549998810023L;
        mf$Widget.ldi[16] = 4721624319145606456L;
        mf$Widget.ldi[17] = -606450241107106091L;
        mf$Widget.ldi[18] = -7149637252781029416L;
        mf$Widget.ldi[19] = -3158078547215534067L;
        mf$Widget.ldi[20] = 13299412641325935L;
        mf$Widget.ldi[21] = 3596929003515015090L;
        mf$Widget.ldi[22] = 9217991806437914874L;
        mf$Widget.ldi[23] = -2128003114378420577L;
        mf$Widget.ldi[24] = -2466469494371625688L;
        mf$Widget.ldi[25] = 4764891575626636906L;
        mf$Widget.ldi[26] = -1670239855461644078L;
        mf$Widget.ldi[27] = 4161523200809448560L;
        mf$Widget.ldi[28] = 1865887438979979599L;
        mf$Widget.ldi[29] = 2976958037012172102L;
        mf$Widget.ldi[30] = 5647436843870050376L;
        mf$Widget.ldi[31] = 2294297186885117956L;
        mf$Widget.ldi[32] = -2970543512426672780L;
        mf$Widget.ldi[33] = 2182011747554299438L;
        mf$Widget.ldi[34] = 4877923685232104554L;
        mf$Widget.ldi[35] = 3718284374375981522L;
        mf$Widget.ldi[36] = 878779789262548052L;
        mf$Widget.ldi[37] = -4463085081679331388L;
        mf$Widget.ldi[38] = 1480162612338365283L;
        mf$Widget.ldi[39] = 2361148697177165383L;
        mf$Widget.ldi[40] = -3607626502836719843L;
        mf$Widget.ldi[41] = -8562422395159954219L;
    }

    public static /* synthetic */ CallSite lda(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lhk() {
        mf$Widget.lcz[0] = -1958237578;
        mf$Widget.lcz[1] = 660621700;
        mf$Widget.lcz[2] = 880021608;
        mf$Widget.lcz[3] = -324219343;
        mf$Widget.lcz[4] = 1990536071;
        mf$Widget.lcz[5] = 1183852229;
        mf$Widget.lcz[6] = 551182880;
        mf$Widget.lcz[7] = 804017132;
        mf$Widget.lcz[8] = -1224812263;
        mf$Widget.lcz[9] = -327796013;
        mf$Widget.lcz[10] = -1656729689;
        mf$Widget.lcz[11] = -653664822;
        mf$Widget.lcz[12] = -782140614;
        mf$Widget.lcz[13] = 1396087440;
        mf$Widget.lcz[14] = -941930464;
        mf$Widget.lcz[15] = 1726418686;
        mf$Widget.lcz[16] = -2060959822;
        mf$Widget.lcz[17] = -878181204;
        mf$Widget.lcz[18] = 1276568199;
        mf$Widget.lcz[19] = -15463242;
        mf$Widget.lcz[20] = -1236406825;
        mf$Widget.lcz[21] = 102814263;
        mf$Widget.lcz[22] = 779063039;
        mf$Widget.lcz[23] = -1455000596;
        mf$Widget.lcz[24] = -138917726;
        mf$Widget.lcz[25] = -1877642501;
        mf$Widget.lcz[26] = -536009207;
        mf$Widget.lcz[27] = 1677560328;
        mf$Widget.lcz[28] = 1649172481;
        mf$Widget.lcz[29] = 880196361;
        mf$Widget.lcz[30] = 2060561979;
        mf$Widget.lcz[31] = 439827475;
        mf$Widget.lcz[32] = 1900278555;
        mf$Widget.lcz[33] = -1280696550;
        mf$Widget.lcz[34] = -1667710555;
        mf$Widget.lcz[35] = -1084992979;
        mf$Widget.lcz[36] = -1001441164;
        mf$Widget.lcz[37] = -1046534249;
        mf$Widget.lcz[38] = -18101695;
        mf$Widget.lcz[39] = 1964424998;
        mf$Widget.lcz[40] = 1503793002;
        mf$Widget.lcz[41] = 1857737993;
        mf$Widget.lcz[42] = 507677281;
        mf$Widget.lcz[43] = -1360901275;
        mf$Widget.lcz[44] = 1309221419;
        mf$Widget.lcz[45] = -1717986428;
        mf$Widget.lcz[46] = 1081829602;
        mf$Widget.lcz[47] = 1882882530;
        mf$Widget.lcz[48] = 1780635487;
        mf$Widget.lcz[49] = 1929703875;
        mf$Widget.lcz[50] = 0x1011909;
        mf$Widget.lcz[51] = 1400126966;
        mf$Widget.lcz[52] = -560934845;
        mf$Widget.lcz[53] = 2067324190;
        mf$Widget.lcz[54] = -1589398141;
        mf$Widget.lcz[55] = 1306264053;
        mf$Widget.lcz[56] = 1942294076;
        mf$Widget.lcz[57] = 1203397704;
        mf$Widget.lcz[58] = 212403965;
        mf$Widget.lcz[59] = -1729119823;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mf$Widget.at - mf$Widget.lda("lea", ldg(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mf$Widget.lda("leb", lcx(int ), (int)14)) break;
            v0 /* !! */  = (long)mf$Widget.lda("lec", lcx(int ), (int)15);
        }
        var3_1 = mf$Widget.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mf$Widget.at - mf$Widget.lda("led", ldg(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mf$Widget.lda("lee", lcx(int ), (int)16)) break;
            v1 /* !! */  = (long)mf$Widget.lda("lef", lcx(int ), (int)17);
        }
        var2_2 /* !! */  = mf$Widget.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mf$Widget.at - mf$Widget.lda("leh", ldg(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mf$Widget.lda("lei", lcx(int ), (int)18)) break;
            v2 /* !! */  = (long)mf$Widget.lda("lej", lcx(int ), (int)19);
        }
        var1_3 = mf$Widget.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)mf$Widget.lda("lek", lcx(int ), (int)20);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = mf$Widget.at - mf$Widget.lda("lel", ldg(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mf$Widget.lda("lem", lcx(int ), (int)21)) break;
                    v3 /* !! */  = (long)mf$Widget.lda("len", lcx(int ), (int)22);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mf$Widget.class, "label;setting;icon", "label", "setting", "icon"}, this);
            }
lbl38:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mf$Widget.lda("leo", lcx(int ), (int)23);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mf$Widget.lda("lep", lcx(int ), (int)24);
                    if (!var3_1) ** GOTO lbl38
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mf$Widget.lda("leq", lcx(int ), (int)25);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mf$Widget.lda("ler", lcx(int ), (int)26);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String label() {
        v0 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mf$Widget.lda("lfn", ldg(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -55344578: {
                    v1 = mf$Widget.lda("lfo", ldg(int ), (int)19);
                    continue block17;
                }
                case 1226015012: {
                    v1 = mf$Widget.lda("lfp", ldg(int ), (int)20);
                    continue block17;
                }
                case 1385597365: {
                    v1 = mf$Widget.lda("lfq", ldg(int ), (int)21);
                    continue block17;
                }
                case 2088342787: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = mf$Widget.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mf$Widget.at - mf$Widget.lda("lfr", ldg(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mf$Widget.lda("lfs", lcx(int ), (int)36)) break;
            v2 /* !! */  = (long)mf$Widget.lda("lft", lcx(int ), (int)37);
        }
        var2_2 /* !! */  = mf$Widget.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mf$Widget.at - mf$Widget.lda("lfu", ldg(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mf$Widget.lda("lfv", lcx(int ), (int)38)) break;
            v3 /* !! */  = (long)mf$Widget.lda("lfw", lcx(int ), (int)39);
        }
        var1_3 = mf$Widget.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mf$Widget.at;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - mf$Widget.lda("lfx", ldg(int ), (int)24));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 382866778: {
                            v5 = mf$Widget.lda("lfy", ldg(int ), (int)25);
                            continue block21;
                        }
                        case 467530053: {
                            v5 = mf$Widget.lda("lfz", ldg(int ), (int)26);
                            continue block21;
                        }
                        case 2088342787: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.label;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mf$Widget.lda("lga", lcx(int ), (int)40);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mf$Widget.lda("lgb", lcx(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mf$Widget.lda("lgc", lcx(int ), (int)42);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mf$Widget.lda("lgd", lcx(int ), (int)43);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mf$Widget.lda("let", ldg(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2017358911: {
                    v1 = mf$Widget.lda("leu", ldg(int ), (int)10);
                    continue block17;
                }
                case 2008127170: {
                    v1 = mf$Widget.lda("lev", ldg(int ), (int)11);
                    continue block17;
                }
                case 2088342787: {
                    break block17;
                }
            }
            break;
        }
        var4_2 = mf$Widget.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mf$Widget.at - mf$Widget.lda("lew", ldg(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mf$Widget.lda("lex", lcx(int ), (int)27)) break;
            v2 /* !! */  = (long)mf$Widget.lda("ley", lcx(int ), (int)28);
        }
        var3_3 /* !! */  = mf$Widget.b;
        v3 /* !! */  = mf$Widget.at;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - mf$Widget.lda("lez", ldg(int ), (int)13));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -976187555: {
                    v4 = mf$Widget.lda("lfa", ldg(int ), (int)14);
                    continue block19;
                }
                case 272786513: {
                    v4 = mf$Widget.lda("lfb", ldg(int ), (int)15);
                    continue block19;
                }
                case 1394409713: {
                    v4 = mf$Widget.lda("lfd", ldg(int ), (int)16);
                    continue block19;
                }
                case 2088342787: {
                    break block19;
                }
            }
            break;
        }
        var2_4 = mf$Widget.a;
        if (!var4_2) ** GOTO lbl45
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)mf$Widget.lda("lfe", lcx(int ), (int)29);
                }
lbl45:
                // 1 sources

                if (var2_4 || var2_4) continue block20;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mf$Widget.at - mf$Widget.lda("lff", ldg(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mf$Widget.lda("lfg", lcx(int ), (int)30)) break;
                    v5 /* !! */  = (long)mf$Widget.lda("lfh", lcx(int ), (int)31);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mf$Widget.class, "label;setting;icon", "label", "setting", "icon"}, this, var1_1);
lbl53:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)mf$Widget.lda("lfi", lcx(int ), (int)32);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl63
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)mf$Widget.lda("lfj", lcx(int ), (int)33);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl63:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)mf$Widget.lda("lfk", lcx(int ), (int)34);
                    if (!var4_2) ** GOTO lbl53
                    throw null;
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)mf$Widget.lda("lfm", lcx(int ), (int)35);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lcx(int n2) {
        return lcy[n2] ^ lcz[n2];
    }

    private static /* synthetic */ long ldg(int n2) {
        return ldh[n2] ^ ldi[n2];
    }
}

