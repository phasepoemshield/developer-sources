/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class my {
    private boolean closing;
    public static final long DEFAULT_CLOSE_NS = 180000000L;
    private long closingAt;
    public static final int b;
    public static final long DEFAULT_OPEN_NS = 300000000L;
    private static final long mo = -2447910535145004946L;
    public static final boolean c;
    private static long[] flor;
    private final long openDurationNs;
    private static int[] floy;
    private static long[] flos;
    private final long closeDurationNs;
    private long openedAt;
    public static final boolean a;
    private static int[] flox;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float openRaw() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flzt", floq(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == my.flot("flzu", flow(int ), (int)152)) break;
            v0 /* !! */  = (long)my.flot("flzv", flow(int ), (int)153);
        }
        var3_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flzw", floq(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == my.flot("flzx", flow(int ), (int)154)) break;
            v1 /* !! */  = (long)my.flot("flzy", flow(int ), (int)155);
        }
        var2_2 /* !! */  = my.b;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - my.flot("flzz", floq(int ), (int)131));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1159644575: {
                    v3 = my.flot("fmaa", floq(int ), (int)132);
                    continue block23;
                }
                case -273021354: {
                    v3 = my.flot("fmab", floq(int ), (int)133);
                    continue block23;
                }
                case 1262674662: {
                    v3 = my.flot("fmac", floq(int ), (int)134);
                    continue block23;
                }
                case 2126438510: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = my.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (float)my.flot("fmad", fluq(int ), (int)156);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = my.mo;
                if (true) ** GOTO lbl45
                block25: while (true) {
                    v4 /* !! */  = (long)(my.flot("fmaf", floq(int ), (int)136) - my.flot("fmae", floq(int ), (int)135));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -908823762: {
                            continue block25;
                        }
                        case 2126438510: {
                            break block25;
                        }
                    }
                    break;
                }
                v5 = System.nanoTime();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = my.mo - my.flot("fmag", floq(int ), (int)137)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == my.flot("fmah", flow(int ), (int)157)) break;
                    v6 /* !! */  = (long)my.flot("fmai", flow(int ), (int)158);
                }
                v7 = v5 - this.openedAt;
                v8 /* !! */  = my.mo;
                if (true) ** GOTO lbl62
                block27: while (true) {
                    v8 /* !! */  = (long)(v9 - my.flot("fmaj", floq(int ), (int)138));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1804620230: {
                            v9 = my.flot("fmak", floq(int ), (int)139);
                            continue block27;
                        }
                        case 290496445: {
                            v9 = my.flot("fmal", floq(int ), (int)140);
                            continue block27;
                        }
                        case 2126438510: {
                            break block27;
                        }
                    }
                    break;
                }
                v10 = v7 / (float)this.openDurationNs;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = my.mo - my.flot("fmam", floq(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == my.flot("fman", flow(int ), (int)159)) break;
                    v11 /* !! */  = (long)my.flot("fmao", flow(int ), (int)160);
                }
                return my.clamp01(v10);
            }
lbl79:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)my.flot("fmap", flow(int ), (int)161);
                if (var3_1) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)my.flot("fmaq", flow(int ), (int)162);
                    if (!var3_1) ** GOTO lbl79
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)my.flot("fmar", flow(int ), (int)163);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)my.flot("fmas", flow(int ), (int)164);
        ** while (!var3_1)
lbl95:
        // 1 sources

        throw null;
    }

    static {
        flox = new int[231];
        floy = new int[231];
        my.fmfo();
        my.fmhd();
        my.fmii();
        my.fmiu();
        my.fmkc();
        my.fmlj();
        flor = new long[185];
        flos = new long[185];
        my.fmlv();
        my.fmmz();
        my.fmnx();
        my.fmov();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isAlive() {
        block53: {
            block52: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flsp", floq(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == my.flot("flsq", flow(int ), (int)58)) break;
                    v0 /* !! */  = (long)my.flot("flsr", flow(int ), (int)59);
                }
                var3_1 = my.c;
                v1 /* !! */  = my.mo;
                if (true) ** GOTO lbl12
                block33: while (true) {
                    v1 /* !! */  = (long)(v2 - my.flot("flss", floq(int ), (int)39));
lbl12:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -295075576: {
                            v2 = my.flot("flst", floq(int ), (int)40);
                            continue block33;
                        }
                        case 1317951834: {
                            v2 = my.flot("flsu", floq(int ), (int)41);
                            continue block33;
                        }
                        case 2126438510: {
                            break block33;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = my.b;
                v3 /* !! */  = my.mo;
                if (true) ** GOTO lbl26
                block34: while (true) {
                    v3 /* !! */  = (long)(v4 - my.flot("flsv", floq(int ), (int)42));
lbl26:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1314194437: {
                            v4 = my.flot("flsw", floq(int ), (int)43);
                            continue block34;
                        }
                        case 201081756: {
                            v4 = my.flot("flsx", floq(int ), (int)44);
                            continue block34;
                        }
                        case 1332743624: {
                            v4 = my.flot("flsy", floq(int ), (int)45);
                            continue block34;
                        }
                        case 2126438510: {
                            break block34;
                        }
                    }
                    break;
                }
                var1_3 = my.a;
                if (var3_1) {
                    throw null;
lbl41:
                    // 6 sources

                    return (boolean)my.flot("flsz", flow(int ), (int)60);
                }
                if (var1_3 || var1_3) ** GOTO lbl41
                v5 /* !! */  = my.mo;
                if (true) ** GOTO lbl48
                block36: while (true) {
                    v5 /* !! */  = (long)(my.flot("fltb", floq(int ), (int)47) - my.flot("flta", floq(int ), (int)46));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 930844465: {
                            continue block36;
                        }
                        case 2126438510: {
                            break block36;
                        }
                    }
                    break;
                }
                if (!this.closing) break block52;
                if (var1_3) ** GOTO lbl41
                v6 /* !! */  = my.mo;
                if (true) ** GOTO lbl59
                block37: while (true) {
                    v6 /* !! */  = (long)(my.flot("fltd", floq(int ), (int)49) - my.flot("fltc", floq(int ), (int)48));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 232266078: {
                            continue block37;
                        }
                        case 2126438510: {
                            break block37;
                        }
                    }
                    break;
                }
                if (!(this.closeRaw() < 1.0f)) break block53;
                if (var1_3) ** GOTO lbl41
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            v7 = my.flot("flte", flow(int ), (int)61);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl80
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v7 = my.flot("fltf", flow(int ), (int)62);
lbl80:
                // 2 sources

                return (boolean)v7;
            }
lbl81:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)my.flot("fltg", flow(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)my.flot("flth", flow(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl91:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flti", flow(int ), (int)65);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)my.flot("fltj", flow(int ), (int)66);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl124
                    break;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)my.flot("fltk", flow(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl107:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)my.flot("fltl", flow(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)my.flot("fltm", flow(int ), (int)69);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)my.flot("fltn", flow(int ), (int)70);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
lbl119:
            // 3 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flto", flow(int ), (int)71);
                } while (!var3_1);
                throw null;
            }
lbl124:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)my.flot("fltp", flow(int ), (int)72);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)my.flot("fltq", flow(int ), (int)73);
        ** while (!var3_1)
lbl131:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fmnx() {
        my.flos[0] = -8421484434953119585L;
        my.flos[1] = -5584932461828963802L;
        my.flos[2] = 6860191879632002768L;
        my.flos[3] = -5166257250742589693L;
        my.flos[4] = -171086641088920266L;
        my.flos[5] = -4212298978168471013L;
        my.flos[6] = 3888176100745067440L;
        my.flos[7] = 9014025938614259964L;
        my.flos[8] = 6668199201322599159L;
        my.flos[9] = -7987485786080208233L;
        my.flos[10] = 4016698696067761157L;
        my.flos[11] = 2722084611607505533L;
        my.flos[12] = -4717099066139868671L;
        my.flos[13] = 7127983813685409060L;
        my.flos[14] = -5768262626827051488L;
        my.flos[15] = -1248594099237189092L;
        my.flos[16] = -3934022511954739526L;
        my.flos[17] = -7376786768562865021L;
        my.flos[18] = -6521078556695235624L;
        my.flos[19] = -8013032416378102941L;
        my.flos[20] = 4594727315198651677L;
        my.flos[21] = 5046718858489855068L;
        my.flos[22] = -4494984129901483177L;
        my.flos[23] = 1185927565457793384L;
        my.flos[24] = -6533242965557785083L;
        my.flos[25] = 7755361245402529310L;
        my.flos[26] = 637606728098219934L;
        my.flos[27] = -1774199829534735914L;
        my.flos[28] = 6311049094066526083L;
        my.flos[29] = -5059950310259713881L;
        my.flos[30] = 6381829161493871268L;
        my.flos[31] = 7051280989232193751L;
        my.flos[32] = -6926382625607428745L;
        my.flos[33] = -4434874793253479016L;
        my.flos[34] = 9113130963044768229L;
        my.flos[35] = 3974626998372008627L;
        my.flos[36] = -2387545072839307816L;
        my.flos[37] = 2214916931731593226L;
        my.flos[38] = 8717269286923960624L;
        my.flos[39] = 5205043968804233758L;
        my.flos[40] = -2755876217948204115L;
        my.flos[41] = 7952652244375364135L;
        my.flos[42] = -4917045363014750671L;
        my.flos[43] = -7912879597588594227L;
        my.flos[44] = -4530097328874391428L;
        my.flos[45] = -9189103844966901219L;
        my.flos[46] = -5879240782746757134L;
        my.flos[47] = 4875693281852939378L;
        my.flos[48] = -4141087381778436738L;
        my.flos[49] = 341098225856704619L;
        my.flos[50] = -695936859055067054L;
        my.flos[51] = 8154873134658737540L;
        my.flos[52] = 370414340798393353L;
        my.flos[53] = 1152780921177657374L;
        my.flos[54] = 4173141092731152110L;
        my.flos[55] = 7064010108931264672L;
        my.flos[56] = 2165564193697232943L;
        my.flos[57] = 2918795018525537456L;
        my.flos[58] = 2703475478986448694L;
        my.flos[59] = 7550502823143715180L;
        my.flos[60] = 3113975357369153545L;
        my.flos[61] = 8898693967878616714L;
        my.flos[62] = -6030275503329620747L;
        my.flos[63] = -3621171112944398313L;
        my.flos[64] = -4746377984373388710L;
        my.flos[65] = 9163673950994666396L;
        my.flos[66] = -1746050951255215197L;
        my.flos[67] = -6196044355957162355L;
        my.flos[68] = 8379471332678431506L;
        my.flos[69] = -6258113485236634157L;
        my.flos[70] = 5083651080360386750L;
        my.flos[71] = -4990789544355534827L;
        my.flos[72] = -7390536689906609941L;
        my.flos[73] = 7160057141503982062L;
        my.flos[74] = -4437800787632995549L;
        my.flos[75] = -7891491201634201799L;
        my.flos[76] = 3307220050037616587L;
        my.flos[77] = 5738683498817531285L;
        my.flos[78] = 5897695281430060209L;
        my.flos[79] = -79609092669984422L;
        my.flos[80] = -1107481728820767850L;
        my.flos[81] = -708835288597046670L;
        my.flos[82] = 2420345314198601991L;
        my.flos[83] = 7348345945468850103L;
        my.flos[84] = 9168213242406270918L;
        my.flos[85] = 1933766969632907387L;
        my.flos[86] = 4340302014073662100L;
        my.flos[87] = 3250279705893563780L;
        my.flos[88] = -3228415625220359837L;
        my.flos[89] = -6249654894425824251L;
        my.flos[90] = -1103486269796615765L;
        my.flos[91] = -6760364020817840839L;
        my.flos[92] = -579466303218128999L;
        my.flos[93] = -3406401989239485567L;
        my.flos[94] = -8234027128801831128L;
        my.flos[95] = -1503251867375016444L;
        my.flos[96] = 6574519982615530665L;
        my.flos[97] = -4314498987918145989L;
        my.flos[98] = -3866393272413032070L;
        my.flos[99] = 4632976953687167816L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float scale() {
        block37: {
            v0 /* !! */  = my.mo;
            if (true) ** GOTO lbl5
            block27: while (true) {
                v0 /* !! */  = (long)(v1 - my.flot("flvn", floq(int ), (int)73));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1893325999: {
                        v1 = my.flot("flvo", floq(int ), (int)74);
                        continue block27;
                    }
                    case 421200063: {
                        v1 = my.flot("flvp", floq(int ), (int)75);
                        continue block27;
                    }
                    case 1774995951: {
                        v1 = my.flot("flvq", floq(int ), (int)76);
                        continue block27;
                    }
                    case 2126438510: {
                        break block27;
                    }
                }
                break;
            }
            var3_1 = my.c;
            v2 /* !! */  = my.mo;
            if (true) ** GOTO lbl22
            block28: while (true) {
                v2 /* !! */  = (long)(v3 - my.flot("flvr", floq(int ), (int)77));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1925111193: {
                        v3 = my.flot("flvs", floq(int ), (int)78);
                        continue block28;
                    }
                    case 81614014: {
                        v3 = my.flot("flvt", floq(int ), (int)79);
                        continue block28;
                    }
                    case 330774572: {
                        v3 = my.flot("flvu", floq(int ), (int)80);
                        continue block28;
                    }
                    case 2126438510: {
                        break block28;
                    }
                }
                break;
            }
            var2_2 = my.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flvv", floq(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == my.flot("flvw", flow(int ), (int)98)) break;
                v4 /* !! */  = (long)my.flot("flvx", flow(int ), (int)99);
            }
            var1_3 = my.a;
            if (var3_1) {
                throw null;
lbl43:
                // 3 sources

                return (float)my.flot("flvy", fluq(int ), (int)100);
            }
            if (var1_3 || var1_3) ** GOTO lbl43
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flvz", floq(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == my.flot("flwa", flow(int ), (int)101)) break;
                v5 /* !! */  = (long)my.flot("flwb", flow(int ), (int)102);
            }
            if (!this.closing) break block37;
            if (var1_3) ** GOTO lbl43
            v6 /* !! */  = my.mo;
            if (true) ** GOTO lbl57
            block32: while (true) {
                v6 /* !! */  = (long)(v7 - my.flot("flwc", floq(int ), (int)83));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -949121748: {
                        v7 = my.flot("flwd", floq(int ), (int)84);
                        continue block32;
                    }
                    case 320458496: {
                        v7 = my.flot("flwe", floq(int ), (int)85);
                        continue block32;
                    }
                    case 1021604240: {
                        v7 = my.flot("flwf", floq(int ), (int)86);
                        continue block32;
                    }
                    case 2126438510: {
                        break block32;
                    }
                }
                break;
            }
            v8 = this.closeRaw();
            v9 /* !! */  = my.mo;
            if (true) ** GOTO lbl74
            block33: while (true) {
                v9 /* !! */  = (long)(my.flot("flwh", floq(int ), (int)88) - my.flot("flwg", floq(int ), (int)87));
lbl74:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 2062416178: {
                        continue block33;
                    }
                    case 2126438510: {
                        break block33;
                    }
                }
                break;
            }
            return 1.0f - my.easeInCubic(v8) * my.flot("flwi", fluq(int ), (int)103);
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        v10 = my.flot("flwj", fluq(int ), (int)104);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = my.mo - my.flot("flwk", floq(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == my.flot("flwl", flow(int ), (int)105)) break;
            v11 /* !! */  = (long)my.flot("flwm", flow(int ), (int)106);
        }
        v12 = this.openRaw();
        v13 /* !! */  = my.mo;
        if (true) ** GOTO lbl94
        block35: while (true) {
            v13 /* !! */  = (long)(v14 - my.flot("flwn", floq(int ), (int)90));
lbl94:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1972228930: {
                    v14 = my.flot("flwo", floq(int ), (int)91);
                    continue block35;
                }
                case -1561166494: {
                    v14 = my.flot("flwp", floq(int ), (int)92);
                    continue block35;
                }
                case 2126438510: {
                    break block35;
                }
            }
            break;
        }
        return (float)(v10 + my.easeOutBack(v12) * my.flot("flwq", fluq(int ), (int)107));
    }

    private static /* synthetic */ void fmhd() {
        my.flox[100] = 33103034;
        my.flox[101] = 1526104753;
        my.flox[102] = 1976249336;
        my.flox[103] = -1558991514;
        my.flox[104] = 252570460;
        my.flox[105] = -1732103890;
        my.flox[106] = 1075646874;
        my.flox[107] = 845266709;
        my.flox[108] = -781359664;
        my.flox[109] = -1919191339;
        my.flox[110] = 1500102425;
        my.flox[111] = 472499817;
        my.flox[112] = -192458009;
        my.flox[113] = -1309412625;
        my.flox[114] = -173562188;
        my.flox[115] = -1473810386;
        my.flox[116] = -804885866;
        my.flox[117] = 690488351;
        my.flox[118] = -1188672064;
        my.flox[119] = 1992940283;
        my.flox[120] = 815509460;
        my.flox[121] = -1244580778;
        my.flox[122] = 1003716017;
        my.flox[123] = 1637560148;
        my.flox[124] = 1999388125;
        my.flox[125] = 1433429309;
        my.flox[126] = 1422059434;
        my.flox[127] = 1106889895;
        my.flox[128] = 1312680676;
        my.flox[129] = 539913780;
        my.flox[130] = 1391492140;
        my.flox[131] = -1959062922;
        my.flox[132] = -724709298;
        my.flox[133] = -1936805862;
        my.flox[134] = 2118688166;
        my.flox[135] = -869886274;
        my.flox[136] = -846739353;
        my.flox[137] = -254626386;
        my.flox[138] = -1780126215;
        my.flox[139] = 987560738;
        my.flox[140] = 1081668334;
        my.flox[141] = -269485880;
        my.flox[142] = -1083338920;
        my.flox[143] = 51143032;
        my.flox[144] = -1779042598;
        my.flox[145] = 303558980;
        my.flox[146] = 432725257;
        my.flox[147] = 1256223093;
        my.flox[148] = 1626630261;
        my.flox[149] = -758314544;
        my.flox[150] = 1790184314;
        my.flox[151] = 892685393;
        my.flox[152] = 619110761;
        my.flox[153] = -483783573;
        my.flox[154] = 801388358;
        my.flox[155] = 1244997792;
        my.flox[156] = 1127822977;
        my.flox[157] = 1424308239;
        my.flox[158] = -637377217;
        my.flox[159] = -657951767;
        my.flox[160] = -522612115;
        my.flox[161] = 1097991707;
        my.flox[162] = 1199818167;
        my.flox[163] = -1555193216;
        my.flox[164] = 213909970;
        my.flox[165] = -1810781844;
        my.flox[166] = -832518518;
        my.flox[167] = 1473059635;
        my.flox[168] = -1170249870;
        my.flox[169] = -1738984991;
        my.flox[170] = 1481576280;
        my.flox[171] = 823066530;
        my.flox[172] = -855034632;
        my.flox[173] = -579912785;
        my.flox[174] = 478930581;
        my.flox[175] = -1681214799;
        my.flox[176] = -513951907;
        my.flox[177] = -1713998478;
        my.flox[178] = -1792532596;
        my.flox[179] = 1525818350;
        my.flox[180] = -147247451;
        my.flox[181] = 1375817589;
        my.flox[182] = -367227405;
        my.flox[183] = 1674387556;
        my.flox[184] = -1265826436;
        my.flox[185] = -486719102;
        my.flox[186] = -822060854;
        my.flox[187] = 1241285560;
        my.flox[188] = -1612614859;
        my.flox[189] = 378006817;
        my.flox[190] = -1040718698;
        my.flox[191] = -482486988;
        my.flox[192] = -295578371;
        my.flox[193] = -1375873351;
        my.flox[194] = 1252059884;
        my.flox[195] = 245403457;
        my.flox[196] = -461491013;
        my.flox[197] = -905972506;
        my.flox[198] = 362017140;
        my.flox[199] = -1304786434;
    }

    private static /* synthetic */ void fmiu() {
        my.floy[0] = -1716380757;
        my.floy[1] = 1222668426;
        my.floy[2] = -1363338614;
        my.floy[3] = 1927082878;
        my.floy[4] = 1179774211;
        my.floy[5] = -1135048929;
        my.floy[6] = 464532728;
        my.floy[7] = -1350467696;
        my.floy[8] = -744672931;
        my.floy[9] = 915371931;
        my.floy[10] = 1703241919;
        my.floy[11] = 1344515812;
        my.floy[12] = -1091341634;
        my.floy[13] = 1729270079;
        my.floy[14] = 1518910939;
        my.floy[15] = -213796677;
        my.floy[16] = -89442353;
        my.floy[17] = 1564819011;
        my.floy[18] = -248057820;
        my.floy[19] = 1915910939;
        my.floy[20] = -1797739327;
        my.floy[21] = 1378239057;
        my.floy[22] = -1866368772;
        my.floy[23] = 1552584052;
        my.floy[24] = 947968813;
        my.floy[25] = -3724370;
        my.floy[26] = 139337850;
        my.floy[27] = -258494923;
        my.floy[28] = -1169911627;
        my.floy[29] = -679466928;
        my.floy[30] = 575265816;
        my.floy[31] = 1346296261;
        my.floy[32] = -764571705;
        my.floy[33] = -1809719321;
        my.floy[34] = 101443887;
        my.floy[35] = -597707740;
        my.floy[36] = 1465976045;
        my.floy[37] = 1596941983;
        my.floy[38] = 1479915710;
        my.floy[39] = 1210657206;
        my.floy[40] = 2090976175;
        my.floy[41] = -1051378884;
        my.floy[42] = -1119468531;
        my.floy[43] = 1260168698;
        my.floy[44] = -2062531467;
        my.floy[45] = -2114741434;
        my.floy[46] = -88899177;
        my.floy[47] = -1182183572;
        my.floy[48] = 1100337527;
        my.floy[49] = -1712632375;
        my.floy[50] = -120509341;
        my.floy[51] = 1989595225;
        my.floy[52] = 1494535574;
        my.floy[53] = 33672984;
        my.floy[54] = -298572522;
        my.floy[55] = 1551270694;
        my.floy[56] = -1812439985;
        my.floy[57] = 61998546;
        my.floy[58] = -1648978021;
        my.floy[59] = 1701472733;
        my.floy[60] = -2025024390;
        my.floy[61] = 87919674;
        my.floy[62] = -1232669859;
        my.floy[63] = 2103341659;
        my.floy[64] = -964763648;
        my.floy[65] = 1951147638;
        my.floy[66] = -547920521;
        my.floy[67] = -1212344806;
        my.floy[68] = -1906807722;
        my.floy[69] = -295548733;
        my.floy[70] = 1807997096;
        my.floy[71] = 355899080;
        my.floy[72] = 1403375946;
        my.floy[73] = 1595769719;
        my.floy[74] = 813932001;
        my.floy[75] = 916519921;
        my.floy[76] = -21068804;
        my.floy[77] = 474350243;
        my.floy[78] = -1657659752;
        my.floy[79] = -1227728656;
        my.floy[80] = -5584430;
        my.floy[81] = 1740892993;
        my.floy[82] = 283122236;
        my.floy[83] = 707998594;
        my.floy[84] = -1245725632;
        my.floy[85] = -890290913;
        my.floy[86] = -1303733367;
        my.floy[87] = -146236468;
        my.floy[88] = 847414095;
        my.floy[89] = 1584682137;
        my.floy[90] = 1762625302;
        my.floy[91] = -2005837453;
        my.floy[92] = -686356218;
        my.floy[93] = -1023860827;
        my.floy[94] = 1807561854;
        my.floy[95] = 1327750220;
        my.floy[96] = -160613312;
        my.floy[97] = -1509664973;
        my.floy[98] = -528531247;
        my.floy[99] = 1919790007;
    }

    private static /* synthetic */ long floq(int n2) {
        return flor[n2] ^ flos[n2];
    }

    private static /* synthetic */ float fluq(int n2) {
        return Float.intBitsToFloat(flox[n2] ^ floy[n2]);
    }

    public static /* synthetic */ CallSite flot(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float easeInCubic(float var0) {
        v0 /* !! */  = my.mo;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - my.flot("fmdg", floq(int ), (int)170));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -697812849: {
                    v1 = my.flot("fmdh", floq(int ), (int)171);
                    continue block18;
                }
                case 1955751796: {
                    v1 = my.flot("fmdi", floq(int ), (int)172);
                    continue block18;
                }
                case 2126438510: {
                    break block18;
                }
                case 2131293463: {
                    v1 = my.flot("fmdj", floq(int ), (int)173);
                    continue block18;
                }
            }
            break;
        }
        var4_1 = my.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = my.mo - my.flot("fmdk", floq(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == my.flot("fmdl", flow(int ), (int)202)) break;
            v2 /* !! */  = (long)my.flot("fmdm", flow(int ), (int)203);
        }
        var3_2 /* !! */  = my.b;
        v3 /* !! */  = my.mo;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(my.flot("fmdo", floq(int ), (int)176) - my.flot("fmdn", floq(int ), (int)175));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2143264659: {
                    continue block20;
                }
                case 2126438510: {
                    break block20;
                }
            }
            break;
        }
        var2_3 = my.a;
        if (var4_1) {
            throw null;
lbl37:
            // 3 sources

            return (float)my.flot("fmdp", fluq(int ), (int)204);
        }
        if (var2_3 || var2_3) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = my.mo - my.flot("fmdq", floq(int ), (int)177)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == my.flot("fmdr", flow(int ), (int)205)) break;
            v4 /* !! */  = (long)my.flot("fmds", flow(int ), (int)206);
        }
        var1_4 = my.clamp01(var0);
        if (var2_3) ** GOTO lbl37
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return var1_4 * var1_4 * var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)my.flot("fmdt", flow(int ), (int)207);
                if (!var4_1) break;
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)my.flot("fmdu", flow(int ), (int)208);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)my.flot("fmdv", flow(int ), (int)209);
                    if (!var4_1) break block10;
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_2 /* !! */  = (int)my.flot("fmdw", flow(int ), (int)210);
                } while (!var4_1);
                throw null;
            }
lbl73:
            // 2 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)my.flot("fmdx", flow(int ), (int)211);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)my.flot("fmdy", flow(int ), (int)212);
        ** while (!var4_1)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fmii() {
        my.flox[200] = 1504400935;
        my.flox[201] = -2065994828;
        my.flox[202] = 726874651;
        my.flox[203] = -1758069830;
        my.flox[204] = 1089824144;
        my.flox[205] = 1206530802;
        my.flox[206] = 1032124538;
        my.flox[207] = -1953963015;
        my.flox[208] = -1691390087;
        my.flox[209] = -828460518;
        my.flox[210] = 1595561925;
        my.flox[211] = -491059998;
        my.flox[212] = -1435113580;
        my.flox[213] = 271667235;
        my.flox[214] = -1441191044;
        my.flox[215] = -1609288269;
        my.flox[216] = 478210646;
        my.flox[217] = -145527540;
        my.flox[218] = -238746060;
        my.flox[219] = 1182701151;
        my.flox[220] = -605927303;
        my.flox[221] = 1998407105;
        my.flox[222] = 1325029191;
        my.flox[223] = 789958060;
        my.flox[224] = 641023610;
        my.flox[225] = 1234393446;
        my.flox[226] = 1137589967;
        my.flox[227] = 954290634;
        my.flox[228] = -753935242;
        my.flox[229] = -1263745385;
        my.flox[230] = -498855129;
    }

    private static /* synthetic */ int flow(int n2) {
        return flox[n2] ^ floy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isClosing() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flrz", floq(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == my.flot("flsa", flow(int ), (int)47)) break;
            v0 /* !! */  = (long)my.flot("flsb", flow(int ), (int)48);
        }
        var3_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flsc", floq(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == my.flot("flsd", flow(int ), (int)49)) break;
            v1 /* !! */  = (long)my.flot("flse", flow(int ), (int)50);
        }
        var2_2 /* !! */  = my.b;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(my.flot("flsg", floq(int ), (int)36) - my.flot("flsf", floq(int ), (int)35));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1689191479: {
                    continue block12;
                }
                case 2126438510: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = my.a;
        if (var3_1) {
            throw null;
            return (boolean)my.flot("flsh", flow(int ), (int)51);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = my.mo - my.flot("flsi", floq(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == my.flot("flsj", flow(int ), (int)52)) break;
                    v3 /* !! */  = (long)my.flot("flsk", flow(int ), (int)53);
                }
                return this.closing;
            }
            case 0: {
                var2_2 /* !! */  = (int)my.flot("flsl", flow(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flsm", flow(int ), (int)55);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)my.flot("flsn", flow(int ), (int)56);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)my.flot("flso", flow(int ), (int)57);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public my() {
        var2_1 /* !! */  = my.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this((long)my.flot("flou", floq(int ), (int)0), (long)my.flot("flov", floq(int ), (int)1));
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)my.flot("floz", flow(int ), (int)0);
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)my.flot("flpa", flow(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)my.flot("flpb", flow(int ), (int)2);
        }
    }

    private static /* synthetic */ void fmmz() {
        my.flor[100] = 3676344067313461005L;
        my.flor[101] = 5318135744274054180L;
        my.flor[102] = 1304398233940002080L;
        my.flor[103] = -7811869243428922873L;
        my.flor[104] = -8754832423888909619L;
        my.flor[105] = 853673259582678859L;
        my.flor[106] = 2016873457882494667L;
        my.flor[107] = 98762664229910798L;
        my.flor[108] = 5951702349952985499L;
        my.flor[109] = -7368711348637118237L;
        my.flor[110] = 7019978180428969677L;
        my.flor[111] = 6588993073001538526L;
        my.flor[112] = -6674813190250837990L;
        my.flor[113] = 8405207189156028497L;
        my.flor[114] = -9174603801103854721L;
        my.flor[115] = -7303933988690997903L;
        my.flor[116] = 6936272870812779548L;
        my.flor[117] = 8995861843187269580L;
        my.flor[118] = 1387084037275138506L;
        my.flor[119] = 5025711035220715838L;
        my.flor[120] = 9068025866248473587L;
        my.flor[121] = -3921471303825225050L;
        my.flor[122] = -6883653578341091380L;
        my.flor[123] = -8902894823521169420L;
        my.flor[124] = -4294480500241846811L;
        my.flor[125] = 1403757054036928023L;
        my.flor[126] = -1662158406614212064L;
        my.flor[127] = 4404438121496809905L;
        my.flor[128] = -2226997957338749371L;
        my.flor[129] = -5931808408705518173L;
        my.flor[130] = -4848869586514677468L;
        my.flor[131] = -4159244595983805202L;
        my.flor[132] = 5651144486692632938L;
        my.flor[133] = 4815940322548666301L;
        my.flor[134] = -5390057405182636954L;
        my.flor[135] = -2069300367064931533L;
        my.flor[136] = 4066718690277390524L;
        my.flor[137] = -1745002904224211890L;
        my.flor[138] = -6054495004955078162L;
        my.flor[139] = -3611020274629337648L;
        my.flor[140] = 29087173827654855L;
        my.flor[141] = 4125143022425875335L;
        my.flor[142] = -5926912778902001276L;
        my.flor[143] = -3289043314997403891L;
        my.flor[144] = 7628637082576476384L;
        my.flor[145] = -8643725524575551046L;
        my.flor[146] = 1079939726391285122L;
        my.flor[147] = 3086848758050334254L;
        my.flor[148] = -4971800676353037263L;
        my.flor[149] = -6935353782792707293L;
        my.flor[150] = -1317112659946211754L;
        my.flor[151] = 4415274166470368701L;
        my.flor[152] = 8614940778242557563L;
        my.flor[153] = 8660058832391258148L;
        my.flor[154] = -1748918700850746748L;
        my.flor[155] = 6464979652062061673L;
        my.flor[156] = -853727731431374821L;
        my.flor[157] = 1727214657197706541L;
        my.flor[158] = 2806809966072955110L;
        my.flor[159] = -1627767783211363503L;
        my.flor[160] = -5496550590153566813L;
        my.flor[161] = 1290879387903446986L;
        my.flor[162] = 4401139457016020327L;
        my.flor[163] = 5104814975446693611L;
        my.flor[164] = 3851501719931634135L;
        my.flor[165] = -5654710079582607558L;
        my.flor[166] = -1528219047013092627L;
        my.flor[167] = 3355492896750490107L;
        my.flor[168] = 8186468781495876128L;
        my.flor[169] = -5037366889115628429L;
        my.flor[170] = 8723811664317592359L;
        my.flor[171] = 6700889887511257183L;
        my.flor[172] = 5525917553671978914L;
        my.flor[173] = -7530487280411629689L;
        my.flor[174] = -4040346404144378272L;
        my.flor[175] = 570023854232922284L;
        my.flor[176] = -1883132894755135212L;
        my.flor[177] = -8851344577987869893L;
        my.flor[178] = 8409485630434719670L;
        my.flor[179] = -4966730356247787358L;
        my.flor[180] = 8039943442515288938L;
        my.flor[181] = 7852621273903240731L;
        my.flor[182] = 9032205955493866889L;
        my.flor[183] = -5025223894292531006L;
        my.flor[184] = 943286962750868601L;
    }

    private static /* synthetic */ void fmov() {
        my.flos[100] = -2990626924297589623L;
        my.flos[101] = -1815520716749874073L;
        my.flos[102] = -405744834891783301L;
        my.flos[103] = -3457210747353527342L;
        my.flos[104] = 6421489484537332742L;
        my.flos[105] = -3152467798336858608L;
        my.flos[106] = -9018537533250377063L;
        my.flos[107] = 4084221262643251139L;
        my.flos[108] = -4976997034843522460L;
        my.flos[109] = -2137051882900007043L;
        my.flos[110] = -3900183431858675426L;
        my.flos[111] = -8035329759097231688L;
        my.flos[112] = -4114480879100742642L;
        my.flos[113] = 238772480493244419L;
        my.flos[114] = -7296785171795871549L;
        my.flos[115] = 7557937401680998747L;
        my.flos[116] = 2394461611552007539L;
        my.flos[117] = -2292573590482000736L;
        my.flos[118] = 9203812982182522302L;
        my.flos[119] = 2146030551318104552L;
        my.flos[120] = 2135091583856413566L;
        my.flos[121] = 7548929207172300298L;
        my.flos[122] = 6493754457317875129L;
        my.flos[123] = 3633320358880797029L;
        my.flos[124] = -7709476002645814195L;
        my.flos[125] = 1142398894158658806L;
        my.flos[126] = -14343655564227495L;
        my.flos[127] = 3264114742348376762L;
        my.flos[128] = -3259969290371022627L;
        my.flos[129] = -649792861231940716L;
        my.flos[130] = 6814322060551467015L;
        my.flos[131] = 4853501793237958790L;
        my.flos[132] = -6501046334482284068L;
        my.flos[133] = 5024897448521659272L;
        my.flos[134] = -8228529210890302848L;
        my.flos[135] = 4825618147635914837L;
        my.flos[136] = -8232200793109304L;
        my.flos[137] = -683876638306256301L;
        my.flos[138] = 1904932995707082625L;
        my.flos[139] = -7519597392468635876L;
        my.flos[140] = -5156814384010886151L;
        my.flos[141] = 702331188904240744L;
        my.flos[142] = -3517305579090728147L;
        my.flos[143] = 8489633337765746048L;
        my.flos[144] = 3338961730226487029L;
        my.flos[145] = 7205885878675833940L;
        my.flos[146] = 4797659350834758719L;
        my.flos[147] = 649967079657776272L;
        my.flos[148] = 8492072093461766522L;
        my.flos[149] = -936778304303085362L;
        my.flos[150] = -7651244006538574285L;
        my.flos[151] = -7804047757158636441L;
        my.flos[152] = 6229284651382068740L;
        my.flos[153] = -2602395688461606511L;
        my.flos[154] = 2102327447548641156L;
        my.flos[155] = -6962058296967443633L;
        my.flos[156] = -1880435130732588857L;
        my.flos[157] = 4982457234601292224L;
        my.flos[158] = -1985291877267123629L;
        my.flos[159] = 850787162226569789L;
        my.flos[160] = 7370642440853997264L;
        my.flos[161] = -1273039605356864696L;
        my.flos[162] = -2585829532013786451L;
        my.flos[163] = -222002705935555617L;
        my.flos[164] = 4473905541409440796L;
        my.flos[165] = -5767587006171386743L;
        my.flos[166] = 1219892412865306723L;
        my.flos[167] = -5406488804047701368L;
        my.flos[168] = 9096705942718963286L;
        my.flos[169] = 5933221483897664080L;
        my.flos[170] = 2154292507824361944L;
        my.flos[171] = 4490519374111019682L;
        my.flos[172] = 6915800798646349445L;
        my.flos[173] = -6797654085601033131L;
        my.flos[174] = -1790991443630498239L;
        my.flos[175] = -6142079258252292502L;
        my.flos[176] = 3323410464678262658L;
        my.flos[177] = 4758692116167001883L;
        my.flos[178] = -4725072691249275146L;
        my.flos[179] = 370344119438970170L;
        my.flos[180] = 8966050186724839174L;
        my.flos[181] = 8890301024348177800L;
        my.flos[182] = -2385227346988111375L;
        my.flos[183] = -2626662595344584941L;
        my.flos[184] = -8393478623993844761L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public my(long var1_1, long var3_2) {
        var6_3 /* !! */  = my.b;
        super();
        this.openDurationNs = Math.max((long)my.flot("flpc", floq(int ), (int)2), var1_1);
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.closeDurationNs = Math.max((long)my.flot("flpd", floq(int ), (int)3), var3_2);
                this.open();
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)my.flot("flpe", flow(int ), (int)3);
                ** GOTO lbl16
            }
lbl13:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)my.flot("flpf", flow(int ), (int)4);
                ** GOTO lbl23
            }
lbl16:
            // 2 sources

            case 2: {
                while (true) {
                    var6_3 /* !! */  = (int)my.flot("flpg", flow(int ), (int)5);
                }
            }
lbl20:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)my.flot("flph", flow(int ), (int)6);
                ** GOTO lbl13
            }
lbl23:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)my.flot("flpi", flow(int ), (int)7);
                ** GOTO lbl20
            }
            case 5: 
        }
        while (true) {
            var6_3 /* !! */  = (int)my.flot("flpj", flow(int ), (int)8);
        }
    }

    private static /* synthetic */ void fmlv() {
        my.flor[0] = -8421484435227870305L;
        my.flor[1] = -5584932461720529114L;
        my.flor[2] = 6860191879632002769L;
        my.flor[3] = -5166257250742589694L;
        my.flor[4] = -5041647362658712017L;
        my.flor[5] = -2411401769608352643L;
        my.flor[6] = -6995596419175926602L;
        my.flor[7] = -4209595892549973121L;
        my.flor[8] = -403405079666487259L;
        my.flor[9] = -8485791052067122855L;
        my.flor[10] = 6211208711574474546L;
        my.flor[11] = -5552145935019193021L;
        my.flor[12] = 7086100021380807032L;
        my.flor[13] = 7127983813685409060L;
        my.flor[14] = -7606850534219908968L;
        my.flor[15] = -6742261477850022356L;
        my.flor[16] = 4067723790148289143L;
        my.flor[17] = -3680742580071547340L;
        my.flor[18] = -7946758595671661342L;
        my.flor[19] = 5623853349161117940L;
        my.flor[20] = -153563960566250275L;
        my.flor[21] = -6868489048780100293L;
        my.flor[22] = -3347436179074585975L;
        my.flor[23] = -2123289682017805761L;
        my.flor[24] = -7883377804491227196L;
        my.flor[25] = 7513799138305512867L;
        my.flor[26] = -8168197191778782874L;
        my.flor[27] = -2219039247155519834L;
        my.flor[28] = -4879340240065212882L;
        my.flor[29] = 8849449086353243759L;
        my.flor[30] = 646932993332195236L;
        my.flor[31] = 3703137206235612439L;
        my.flor[32] = -199910302339572846L;
        my.flor[33] = 2820358502716043921L;
        my.flor[34] = 4898875878554669669L;
        my.flor[35] = 1521480945249399796L;
        my.flor[36] = -9216785320752115286L;
        my.flor[37] = -8200988367688435120L;
        my.flor[38] = 1790547646274445638L;
        my.flor[39] = 260567642476515387L;
        my.flor[40] = -6671195336457972562L;
        my.flor[41] = 5309239889552023349L;
        my.flor[42] = -5323625760593613931L;
        my.flor[43] = -2477740655005534415L;
        my.flor[44] = 7091205077827868802L;
        my.flor[45] = -4818648019578227820L;
        my.flor[46] = -1473587327967419060L;
        my.flor[47] = 9148109185765845189L;
        my.flor[48] = -1548648109336314514L;
        my.flor[49] = 5057352081122801760L;
        my.flor[50] = 958436902502375466L;
        my.flor[51] = -6869180895666607490L;
        my.flor[52] = 699339094487858061L;
        my.flor[53] = 6885837113382100886L;
        my.flor[54] = -3831534117870324462L;
        my.flor[55] = 3960287288698935180L;
        my.flor[56] = -2260199691433014419L;
        my.flor[57] = 230133106395994526L;
        my.flor[58] = 6101759490859721435L;
        my.flor[59] = 6731636864572447077L;
        my.flor[60] = -2284224772282186601L;
        my.flor[61] = -2632533515933041079L;
        my.flor[62] = -7010622788194237556L;
        my.flor[63] = -6628594834833148666L;
        my.flor[64] = 6724761446977171114L;
        my.flor[65] = -3483436558180436062L;
        my.flor[66] = -7828790427277765979L;
        my.flor[67] = 7376626451866219863L;
        my.flor[68] = 3334110514505790482L;
        my.flor[69] = -8792115697285780741L;
        my.flor[70] = 4728752923500511405L;
        my.flor[71] = 2680629309991858872L;
        my.flor[72] = 7597358747368537915L;
        my.flor[73] = 3630788442181133450L;
        my.flor[74] = 3766335567325086210L;
        my.flor[75] = 1835489033638317653L;
        my.flor[76] = 7281752503174693950L;
        my.flor[77] = -5560828402392772536L;
        my.flor[78] = -3606490606955645544L;
        my.flor[79] = 3079168336728472434L;
        my.flor[80] = 219826005501387267L;
        my.flor[81] = -4035093188959636799L;
        my.flor[82] = 4294190177480013959L;
        my.flor[83] = -6081941999915025589L;
        my.flor[84] = -360005810268563607L;
        my.flor[85] = 2763962871596031499L;
        my.flor[86] = -6994295414360955823L;
        my.flor[87] = 1358115499229120312L;
        my.flor[88] = 3987991058557143980L;
        my.flor[89] = -1342814002714029947L;
        my.flor[90] = 6061422582328110046L;
        my.flor[91] = -3700229869711724261L;
        my.flor[92] = 5022384153164327713L;
        my.flor[93] = 9044301765258017610L;
        my.flor[94] = -4726703826333016191L;
        my.flor[95] = -679293427874136269L;
        my.flor[96] = 3893716081163114299L;
        my.flor[97] = -1260532088323971604L;
        my.flor[98] = -1345823778179209938L;
        my.flor[99] = -6024604622031411121L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float clamp01(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("fmbr", floq(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == my.flot("fmbs", flow(int ), (int)180)) break;
            v0 /* !! */  = (long)my.flot("fmbt", flow(int ), (int)181);
        }
        var3_1 = my.c;
        v1 /* !! */  = my.mo;
        if (true) ** GOTO lbl11
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - my.flot("fmbu", floq(int ), (int)152));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 109959331: {
                    v2 = my.flot("fmbv", floq(int ), (int)153);
                    continue block12;
                }
                case 585667101: {
                    v2 = my.flot("fmbw", floq(int ), (int)154);
                    continue block12;
                }
                case 2126438510: {
                    break block12;
                }
            }
            break;
        }
        var2_2 = my.b;
        v3 /* !! */  = my.mo;
        if (true) ** GOTO lbl25
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - my.flot("fmbx", floq(int ), (int)155));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1818984524: {
                    v4 = my.flot("fmby", floq(int ), (int)156);
                    continue block13;
                }
                case -1090326068: {
                    v4 = my.flot("fmbz", floq(int ), (int)157);
                    continue block13;
                }
                case 154536496: {
                    v4 = my.flot("fmca", floq(int ), (int)158);
                    continue block13;
                }
                case 2126438510: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = my.a;
        if (var3_1) {
            throw null;
lbl40:
            // 1 sources

            return (float)my.flot("fmcb", fluq(int ), (int)182);
        }
        ** while (var1_3 || var1_3)
lbl43:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = my.mo - my.flot("fmcc", floq(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == my.flot("fmcd", flow(int ), (int)183)) break;
            v5 /* !! */  = (long)my.flot("fmce", flow(int ), (int)184);
        }
        v6 = Math.min(1.0f, var0);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = my.mo - my.flot("fmcf", floq(int ), (int)160)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == my.flot("fmcg", flow(int ), (int)185)) break;
            v7 /* !! */  = (long)my.flot("fmch", flow(int ), (int)186);
        }
        return Math.max(0.0f, v6);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float easeOutBack(float var0) {
        v0 /* !! */  = my.mo;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(my.flot("fmea", floq(int ), (int)179) - my.flot("fmdz", floq(int ), (int)178));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1818026245: {
                    continue block23;
                }
                case 2126438510: {
                    break block23;
                }
            }
            break;
        }
        var7_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = my.mo - my.flot("fmeb", floq(int ), (int)180)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == my.flot("fmec", flow(int ), (int)213)) break;
            v1 /* !! */  = (long)my.flot("fmed", flow(int ), (int)214);
        }
        var6_2 /* !! */  = my.b;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - my.flot("fmee", floq(int ), (int)181));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1104003330: {
                    v3 = my.flot("fmef", floq(int ), (int)182);
                    continue block25;
                }
                case -288903327: {
                    v3 = my.flot("fmeg", floq(int ), (int)183);
                    continue block25;
                }
                case 2126438510: {
                    break block25;
                }
            }
            break;
        }
        var5_3 = my.a;
        if (var7_1) {
            throw null;
lbl34:
            // 6 sources

            return (float)my.flot("fmeh", fluq(int ), (int)215);
        }
        if (var5_3 || var5_3) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = my.mo - my.flot("fmei", floq(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == my.flot("fmej", flow(int ), (int)216)) break;
            v4 /* !! */  = (long)my.flot("fmek", flow(int ), (int)217);
        }
        var1_4 = my.clamp01(var0);
        if (var5_3 || var5_3) ** GOTO lbl34
        var2_5 = my.flot("fmel", fluq(int ), (int)218);
        if (var5_3 || var5_3) ** GOTO lbl34
        var3_6 = var2_5 + 1.0f;
        if (var5_3 || var5_3) ** GOTO lbl34
        var4_7 = var1_4 - 1.0f;
        if (var5_3) ** GOTO lbl34
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_3) ** break;
                ** continue;
                return 1.0f + var3_6 * var4_7 * var4_7 * var4_7 + var2_5 * var4_7 * var4_7;
            }
lbl57:
            // 5 sources

            case 0: {
                var6_2 /* !! */  = (int)my.flot("fmem", flow(int ), (int)219);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl62:
            // 2 sources

            case 1: {
                var6_2 /* !! */  = (int)my.flot("fmen", flow(int ), (int)220);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl67:
            // 3 sources

            case 2: {
                var6_2 /* !! */  = (int)my.flot("fmeo", flow(int ), (int)221);
                if (!var7_1) ** GOTO lbl57
                throw null;
            }
            case 3: {
                var6_2 /* !! */  = (int)my.flot("fmep", flow(int ), (int)222);
                if (!var7_1) ** GOTO lbl57
                throw null;
            }
            case 4: {
                var6_2 /* !! */  = (int)my.flot("fmet", flow(int ), (int)223);
                if (!var7_1) break;
                throw null;
            }
            case 5: {
                var6_2 /* !! */  = (int)my.flot("fmeu", flow(int ), (int)224);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 6: {
                var6_2 /* !! */  = (int)my.flot("fmev", flow(int ), (int)225);
                if (!var7_1) ** GOTO lbl57
                throw null;
            }
            case 7: {
                var6_2 /* !! */  = (int)my.flot("fmew", flow(int ), (int)226);
                if (!var7_1) ** GOTO lbl67
                throw null;
            }
lbl92:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)my.flot("fmey", flow(int ), (int)227);
                    if (!var7_1) ** GOTO lbl62
                    throw null;
                }
            }
lbl97:
            // 3 sources

            case 9: {
                var6_2 /* !! */  = (int)my.flot("fmfa", flow(int ), (int)228);
                if (!var7_1) ** GOTO lbl57
                throw null;
            }
            case 10: {
                var6_2 /* !! */  = (int)my.flot("fmfc", flow(int ), (int)229);
                if (!var7_1) ** GOTO lbl97
                throw null;
            }
            case 11: 
        }
        var6_2 /* !! */  = (int)my.flot("fmfh", flow(int ), (int)230);
        ** while (!var7_1)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean blocksInput() {
        v0 /* !! */  = my.mo;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - my.flot("fltr", floq(int ), (int)50));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 507623679: {
                    v1 = my.flot("flts", floq(int ), (int)51);
                    continue block22;
                }
                case 1756741167: {
                    v1 = my.flot("fltt", floq(int ), (int)52);
                    continue block22;
                }
                case 2126438510: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = my.c;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - my.flot("fltu", floq(int ), (int)53));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -664314909: {
                    v3 = my.flot("fltv", floq(int ), (int)54);
                    continue block23;
                }
                case 127491510: {
                    v3 = my.flot("fltw", floq(int ), (int)55);
                    continue block23;
                }
                case 1507442363: {
                    v3 = my.flot("fltx", floq(int ), (int)56);
                    continue block23;
                }
                case 2126438510: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = my.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flty", floq(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == my.flot("fltz", flow(int ), (int)74)) break;
            v4 /* !! */  = (long)my.flot("flua", flow(int ), (int)75);
        }
        var1_3 = my.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)my.flot("flub", flow(int ), (int)76);
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                v5 /* !! */  = my.mo;
                if (true) ** GOTO lbl50
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - my.flot("fluc", floq(int ), (int)58));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -621312039: {
                            v6 = my.flot("flud", floq(int ), (int)59);
                            continue block26;
                        }
                        case 396859384: {
                            v6 = my.flot("flue", floq(int ), (int)60);
                            continue block26;
                        }
                        case 2126438510: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.closing;
lbl60:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)my.flot("fluf", flow(int ), (int)77);
                        if (!var3_1) break block25;
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)my.flot("flug", flow(int ), (int)78);
                    if (!var3_1) break block25;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)my.flot("fluh", flow(int ), (int)79);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)my.flot("flui", flow(int ), (int)80);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void open() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flpk", floq(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == my.flot("flpl", flow(int ), (int)9)) break;
            v0 /* !! */  = (long)my.flot("flpm", flow(int ), (int)10);
        }
        var3_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = my.mo - my.flot("flpn", floq(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == my.flot("flpo", flow(int ), (int)11)) break;
            v1 /* !! */  = (long)my.flot("flpp", flow(int ), (int)12);
        }
        var2_2 /* !! */  = my.b;
        while (true) {
            block49: {
                if ((v2 /* !! */  = (cfr_temp_3 = my.mo - my.flot("flpq", floq(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != my.flot("flpr", flow(int ), (int)13)) break block49;
                var1_3 = my.a;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)my.flot("flps", flow(int ), (int)14);
        }
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block50: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) return;
                        v3 /* !! */  = my.mo;
                        block26: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -646447631: {
                                    v4 = my.flot("flpu", floq(int ), (int)8);
                                    ** GOTO lbl38
                                }
                                case -389481279: {
                                    v4 = my.flot("flpv", floq(int ), (int)9);
lbl38:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - my.flot("flpt", floq(int ), (int)7));
                                    continue block26;
                                }
                                case 2126438510: {
                                    break block26;
                                }
                            }
                            break;
                        }
                        v5 = System.nanoTime();
                        v6 /* !! */  = my.mo;
                        block27: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case 381548968: {
                                    v7 = my.flot("flpx", floq(int ), (int)11);
                                    ** GOTO lbl51
                                }
                                case 1543927613: {
                                    v7 = my.flot("flpy", floq(int ), (int)12);
lbl51:
                                    // 2 sources

                                    v6 /* !! */  = (long)(v7 - my.flot("flpw", floq(int ), (int)10));
                                    continue block27;
                                }
                                case 2126438510: {
                                    break block27;
                                }
                            }
                            break;
                        }
                        this.openedAt = v5;
                        if (var1_3 || var1_3) return;
                        v8 = my.flot("flpz", floq(int ), (int)13);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_4 = my.mo - my.flot("flqa", floq(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == my.flot("flqb", flow(int ), (int)15)) {
                                this.closingAt = (long)v8;
                                if (var1_3) return;
                                break;
                            }
                            v9 /* !! */  = (long)my.flot("flqc", flow(int ), (int)16);
                        }
                        if (var1_3) return;
                        v10 = my.flot("flqd", flow(int ), (int)17);
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_5 = my.mo - my.flot("flqe", floq(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  == my.flot("flqf", flow(int ), (int)18)) {
                                this.closing = v10;
                                if (var1_3) return;
                                break;
                            }
                            v11 /* !! */  = (long)my.flot("flqg", flow(int ), (int)19);
                        }
                        if (!var1_3) return;
                        return;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)my.flot("flql", flow(int ), (int)24);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)my.flot("flqp", flow(int ), (int)28);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block50;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)my.flot("flqq", flow(int ), (int)29);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)my.flot("flqh", flow(int ), (int)20);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)my.flot("flqm", flow(int ), (int)25);
                        cfr_temp_0 = 0;
                        if (var3_1) {
                            throw null;
                        }
                        break block50;
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)my.flot("flqi", flow(int ), (int)21);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)my.flot("flqo", flow(int ), (int)27);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)my.flot("flqj", flow(int ), (int)22);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)my.flot("flqk", flow(int ), (int)23);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl124
            }
            do {
                if (true) continue block25;
lbl124:
                // 2 sources

                var2_2 /* !! */  = (int)my.flot("flqn", flow(int ), (int)26);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void fmfo() {
        my.flox[0] = -1716380758;
        my.flox[1] = 1222668427;
        my.flox[2] = -1363338613;
        my.flox[3] = 1927082875;
        my.flox[4] = 1179774214;
        my.flox[5] = -1135048934;
        my.flox[6] = 464532731;
        my.flox[7] = -1350467692;
        my.flox[8] = -744672936;
        my.flox[9] = -915371932;
        my.flox[10] = 793906265;
        my.flox[11] = -1344515813;
        my.flox[12] = -505155192;
        my.flox[13] = 1729270078;
        my.flox[14] = -622306143;
        my.flox[15] = 213796676;
        my.flox[16] = -1800415908;
        my.flox[17] = 1564819011;
        my.flox[18] = 248057819;
        my.flox[19] = -2044923886;
        my.flox[20] = -1797739324;
        my.flox[21] = 1378239057;
        my.flox[22] = -1866368770;
        my.flox[23] = 1552584061;
        my.flox[24] = 947968804;
        my.flox[25] = -3724371;
        my.flox[26] = 139337842;
        my.flox[27] = -258494924;
        my.flox[28] = -1169911631;
        my.flox[29] = -679466924;
        my.flox[30] = 575265817;
        my.flox[31] = 444311017;
        my.flox[32] = -764571706;
        my.flox[33] = 1809719320;
        my.flox[34] = 103653351;
        my.flox[35] = -597707731;
        my.flox[36] = 1465976044;
        my.flox[37] = 1596941973;
        my.flox[38] = 1479915708;
        my.flox[39] = 1210657201;
        my.flox[40] = 2090976165;
        my.flox[41] = -1051378888;
        my.flox[42] = -1119468532;
        my.flox[43] = 1260168690;
        my.flox[44] = -2062531472;
        my.flox[45] = -2114741426;
        my.flox[46] = -88899172;
        my.flox[47] = 1182183571;
        my.flox[48] = 1095076740;
        my.flox[49] = 1712632374;
        my.flox[50] = -706391185;
        my.flox[51] = 1989595225;
        my.flox[52] = 1494535575;
        my.flox[53] = 736250092;
        my.flox[54] = -298572523;
        my.flox[55] = 1551270695;
        my.flox[56] = -1812439988;
        my.flox[57] = 61998547;
        my.flox[58] = 1648978020;
        my.flox[59] = -1027335830;
        my.flox[60] = -2025024389;
        my.flox[61] = 87919675;
        my.flox[62] = -1232669859;
        my.flox[63] = 2103341659;
        my.flox[64] = -964763638;
        my.flox[65] = 1951147637;
        my.flox[66] = -547920527;
        my.flox[67] = -1212344802;
        my.flox[68] = -1906807728;
        my.flox[69] = -295548736;
        my.flox[70] = 1807997090;
        my.flox[71] = 355899081;
        my.flox[72] = 1403375951;
        my.flox[73] = 1595769716;
        my.flox[74] = -813932002;
        my.flox[75] = 1735185756;
        my.flox[76] = -21068804;
        my.flox[77] = 474350241;
        my.flox[78] = -1657659749;
        my.flox[79] = -1227728656;
        my.flox[80] = -5584432;
        my.flox[81] = 1740892992;
        my.flox[82] = 1225774907;
        my.flox[83] = 359068300;
        my.flox[84] = 1245725631;
        my.flox[85] = -559515860;
        my.flox[86] = 1303733366;
        my.flox[87] = -1071998639;
        my.flox[88] = -847414096;
        my.flox[89] = 1007044865;
        my.flox[90] = 1762625303;
        my.flox[91] = -2005837456;
        my.flox[92] = -686356223;
        my.flox[93] = -1023860830;
        my.flox[94] = 1807561850;
        my.flox[95] = 1327750219;
        my.flox[96] = -160613309;
        my.flox[97] = -1509664971;
        my.flox[98] = 528531246;
        my.flox[99] = -785289758;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float alpha() {
        block49: {
            block51: {
                v0 /* !! */  = my.mo;
                block26: while (true) {
                    switch ((int)v0 /* !! */ ) {
                        case -285370648: {
                            v0 /* !! */  = (long)(my.flot("fluk", floq(int ), (int)62) - my.flot("fluj", floq(int ), (int)61));
                            continue block26;
                        }
                        case 2126438510: {
                            break block26;
                        }
                    }
                    break;
                }
                var3_1 = my.c;
                v1 /* !! */  = my.mo;
                block27: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case -1352432069: {
                            v1 /* !! */  = (long)(my.flot("flum", floq(int ), (int)64) - my.flot("flul", floq(int ), (int)63));
                            continue block27;
                        }
                        case 2126438510: {
                            break block27;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = my.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flun", floq(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == my.flot("fluo", flow(int ), (int)81)) {
                        var1_3 = my.a;
                        if (var3_1) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)my.flot("flup", flow(int ), (int)82);
                }
                if (var1_3 != false) return (float)my.flot("flur", fluq(int ), (int)83);
                if (var1_3 != false) return (float)my.flot("flur", fluq(int ), (int)83);
                while (true) {
                    block50: {
                        if ((v3 /* !! */  = (cfr_temp_2 = my.mo - my.flot("flus", floq(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v3 /* !! */  != my.flot("flut", flow(int ), (int)84)) break block50;
                        if (this.closing) {
                            break;
                        }
                        ** GOTO lbl63
                    }
                    v3 /* !! */  = (long)my.flot("fluu", flow(int ), (int)85);
                }
                if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl43:
                // 2 sources

                block30: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var1_3 != false) return (float)my.flot("flur", fluq(int ), (int)83);
                            v4 /* !! */  = my.mo;
                            block31: while (true) {
                                switch ((int)v4 /* !! */ ) {
                                    case -1602140537: {
                                        v4 /* !! */  = (long)(my.flot("fluw", floq(int ), (int)68) - my.flot("fluv", floq(int ), (int)67));
                                        continue block31;
                                    }
                                    case 2126438510: {
                                        break block31;
                                    }
                                }
                                break;
                            }
                            v5 = this.closeRaw();
                            while (true) {
                                if ((v6 /* !! */  = (cfr_temp_3 = my.mo - my.flot("flux", floq(int ), (int)69)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v6 /* !! */  == my.flot("fluy", flow(int ), (int)86)) {
                                    return 1.0f - my.easeInCubic(v5);
                                }
                                v6 /* !! */  = (long)my.flot("fluz", flow(int ), (int)87);
                            }
                        }
lbl63:
                        // 1 sources

                        if (var1_3 != false) return (float)my.flot("flur", fluq(int ), (int)83);
                        if (var1_3 != false) return (float)my.flot("flur", fluq(int ), (int)83);
                        v7 /* !! */  = my.mo;
                        break block49;
                        case 1: {
                            var2_2 /* !! */  = (int)my.flot("flvg", flow(int ), (int)91);
                            cfr_temp_0 = 2;
                            if (!var3_1) continue block30;
                            throw null;
                        }
                        case 3: {
                            var2_2 /* !! */  = (int)my.flot("flvi", flow(int ), (int)93);
                            cfr_temp_0 = 0;
                            if (!var3_1) continue block30;
                            throw null;
                        }
                        case 4: {
                            var2_2 /* !! */  = (int)my.flot("flvj", flow(int ), (int)94);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 2: {
                            var2_2 /* !! */  = (int)my.flot("flvh", flow(int ), (int)92);
                            cfr_temp_0 = 6;
                            if (!var3_1) continue block30;
                            throw null;
                        }
                        case 5: {
                            ** GOTO lbl92
                        }
                        case 7: {
                            var2_2 /* !! */  = (int)my.flot("flvm", flow(int ), (int)97);
                            if (var3_1) {
                                throw null;
                            }
lbl92:
                            // 3 sources

                            var2_2 /* !! */  = (int)my.flot("flvk", flow(int ), (int)95);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 6: {
                            var2_2 /* !! */  = (int)my.flot("flvl", flow(int ), (int)96);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 0: 
                    }
                    break;
                }
                break block51;
                ** while (true)
            }
            do {
                var2_2 /* !! */  = (int)my.flot("flvf", flow(int ), (int)90);
            } while (!var3_1);
            throw null;
        }
        block34: while (true) {
            switch ((int)v7 /* !! */ ) {
                case -2085814323: {
                    v7 /* !! */  = (long)(my.flot("flvb", floq(int ), (int)71) - my.flot("flva", floq(int ), (int)70));
                    continue block34;
                }
                case 2126438510: {
                    break block34;
                }
            }
            break;
        }
        v8 = this.openRaw();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = my.mo - my.flot("flvc", floq(int ), (int)72)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == my.flot("flvd", flow(int ), (int)88)) {
                return my.easeOutCubic(v8);
            }
            v9 /* !! */  = (long)my.flot("flve", flow(int ), (int)89);
        }
    }

    private static /* synthetic */ void fmkc() {
        my.floy[100] = 1071349330;
        my.floy[101] = -1526104754;
        my.floy[102] = 2068358421;
        my.floy[103] = -1629065239;
        my.floy[104] = 810664874;
        my.floy[105] = 1732103889;
        my.floy[106] = 196901828;
        my.floy[107] = 208593724;
        my.floy[108] = -781359657;
        my.floy[109] = -1919191344;
        my.floy[110] = 1500102425;
        my.floy[111] = 472499821;
        my.floy[112] = -192458014;
        my.floy[113] = -1309412627;
        my.floy[114] = -173562191;
        my.floy[115] = -1473810387;
        my.floy[116] = -804885865;
        my.floy[117] = -443430539;
        my.floy[118] = -2045269313;
        my.floy[119] = -1992940284;
        my.floy[120] = -1159586615;
        my.floy[121] = -197053354;
        my.floy[122] = 2053340593;
        my.floy[123] = 1637560146;
        my.floy[124] = 1999388120;
        my.floy[125] = 1433429308;
        my.floy[126] = 1422059439;
        my.floy[127] = 1106889889;
        my.floy[128] = 1312680672;
        my.floy[129] = 539913777;
        my.floy[130] = 1391492140;
        my.floy[131] = 1959062921;
        my.floy[132] = -490924381;
        my.floy[133] = 1936805861;
        my.floy[134] = -1530853477;
        my.floy[135] = 869886273;
        my.floy[136] = -1538633667;
        my.floy[137] = -825953750;
        my.floy[138] = -1780126216;
        my.floy[139] = 190604664;
        my.floy[140] = 22606574;
        my.floy[141] = 269485879;
        my.floy[142] = -1325018418;
        my.floy[143] = 1114399096;
        my.floy[144] = -1779042595;
        my.floy[145] = 303558980;
        my.floy[146] = 432725257;
        my.floy[147] = 1256223093;
        my.floy[148] = 1626630256;
        my.floy[149] = -758314541;
        my.floy[150] = 1790184313;
        my.floy[151] = 892685394;
        my.floy[152] = -619110762;
        my.floy[153] = -142034332;
        my.floy[154] = -801388359;
        my.floy[155] = 389157771;
        my.floy[156] = 2123357649;
        my.floy[157] = -1424308240;
        my.floy[158] = -87928741;
        my.floy[159] = 657951766;
        my.floy[160] = -1339549475;
        my.floy[161] = 1097991706;
        my.floy[162] = 1199818165;
        my.floy[163] = -1555193214;
        my.floy[164] = 213909968;
        my.floy[165] = 1810781843;
        my.floy[166] = 335601064;
        my.floy[167] = 1473059634;
        my.floy[168] = 379975265;
        my.floy[169] = -1541989407;
        my.floy[170] = -1481576281;
        my.floy[171] = 60692528;
        my.floy[172] = 855034631;
        my.floy[173] = 1840729682;
        my.floy[174] = 478930580;
        my.floy[175] = -514091786;
        my.floy[176] = -513951905;
        my.floy[177] = -1713998477;
        my.floy[178] = -1792532595;
        my.floy[179] = 1525818349;
        my.floy[180] = -147247452;
        my.floy[181] = 145088125;
        my.floy[182] = -735403325;
        my.floy[183] = -1674387557;
        my.floy[184] = 743532786;
        my.floy[185] = -486719101;
        my.floy[186] = -1683279236;
        my.floy[187] = 1241285560;
        my.floy[188] = -1612614859;
        my.floy[189] = 378006819;
        my.floy[190] = -1040718698;
        my.floy[191] = 482486987;
        my.floy[192] = -1572021015;
        my.floy[193] = 1375873350;
        my.floy[194] = -1766965881;
        my.floy[195] = 831084585;
        my.floy[196] = -461491013;
        my.floy[197] = -905972507;
        my.floy[198] = 362017143;
        my.floy[199] = -1304786435;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float offsetY() {
        block31: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flyj", floq(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == my.flot("flyk", flow(int ), (int)131)) break;
                v0 /* !! */  = (long)my.flot("flyl", flow(int ), (int)132);
            }
            var3_1 = my.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flym", floq(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == my.flot("flyn", flow(int ), (int)133)) break;
                v1 /* !! */  = (long)my.flot("flyo", flow(int ), (int)134);
            }
            var2_2 = my.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = my.mo - my.flot("flyp", floq(int ), (int)116)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == my.flot("flyq", flow(int ), (int)135)) break;
                v2 /* !! */  = (long)my.flot("flyr", flow(int ), (int)136);
            }
            var1_3 = my.a;
            if (var3_1) {
                throw null;
lbl24:
                // 3 sources

                return (float)my.flot("flys", fluq(int ), (int)137);
            }
            if (var1_3 || var1_3) ** GOTO lbl24
            v3 /* !! */  = my.mo;
            if (true) ** GOTO lbl31
            block20: while (true) {
                v3 /* !! */  = (long)(my.flot("flyu", floq(int ), (int)118) - my.flot("flyt", floq(int ), (int)117));
lbl31:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 1695369482: {
                        continue block20;
                    }
                    case 2126438510: {
                        break block20;
                    }
                }
                break;
            }
            if (!this.closing) break block31;
            if (var1_3) ** GOTO lbl24
            v4 /* !! */  = my.mo;
            if (true) ** GOTO lbl42
            block21: while (true) {
                v4 /* !! */  = (long)(v5 - my.flot("flyv", floq(int ), (int)119));
lbl42:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1206162911: {
                        v5 = my.flot("flyw", floq(int ), (int)120);
                        continue block21;
                    }
                    case 400862930: {
                        v5 = my.flot("flyx", floq(int ), (int)121);
                        continue block21;
                    }
                    case 415678768: {
                        v5 = my.flot("flyy", floq(int ), (int)122);
                        continue block21;
                    }
                    case 2126438510: {
                        break block21;
                    }
                }
                break;
            }
            v6 = this.closeRaw();
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = my.mo - my.flot("flyz", floq(int ), (int)123)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == my.flot("flza", flow(int ), (int)138)) break;
                v7 /* !! */  = (long)my.flot("flzb", flow(int ), (int)139);
            }
            return my.easeInCubic(v6) * my.flot("flzc", fluq(int ), (int)140);
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        v8 /* !! */  = my.mo;
        if (true) ** GOTO lbl69
        block23: while (true) {
            v8 /* !! */  = (long)(v9 - my.flot("flzd", floq(int ), (int)124));
lbl69:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -236229245: {
                    v9 = my.flot("flze", floq(int ), (int)125);
                    continue block23;
                }
                case 1396367012: {
                    v9 = my.flot("flzf", floq(int ), (int)126);
                    continue block23;
                }
                case 2020764613: {
                    v9 = my.flot("flzg", floq(int ), (int)127);
                    continue block23;
                }
                case 2126438510: {
                    break block23;
                }
            }
            break;
        }
        v10 = this.openRaw();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = my.mo - my.flot("flzh", floq(int ), (int)128)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == my.flot("flzi", flow(int ), (int)141)) break;
            v11 /* !! */  = (long)my.flot("flzj", flow(int ), (int)142);
        }
        return (1.0f - my.easeOutCubic(v10)) * my.flot("flzk", fluq(int ), (int)143);
    }

    private static /* synthetic */ void fmlj() {
        my.floy[200] = 1504400931;
        my.floy[201] = -2065994832;
        my.floy[202] = -726874652;
        my.floy[203] = 1566308092;
        my.floy[204] = 2142368549;
        my.floy[205] = 1206530803;
        my.floy[206] = 848630039;
        my.floy[207] = -1953963015;
        my.floy[208] = -1691390085;
        my.floy[209] = -828460517;
        my.floy[210] = 1595561927;
        my.floy[211] = -491059999;
        my.floy[212] = -1435113577;
        my.floy[213] = -271667236;
        my.floy[214] = 473936686;
        my.floy[215] = -1649737157;
        my.floy[216] = 478210647;
        my.floy[217] = 1433485410;
        my.floy[218] = -836973740;
        my.floy[219] = 1182701143;
        my.floy[220] = -605927311;
        my.floy[221] = 1998407113;
        my.floy[222] = 1325029187;
        my.floy[223] = 789958053;
        my.floy[224] = 641023615;
        my.floy[225] = 1234393453;
        my.floy[226] = 1137589960;
        my.floy[227] = 954290624;
        my.floy[228] = -753935241;
        my.floy[229] = -1263745385;
        my.floy[230] = -498855122;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float closeRaw() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("fmat", floq(int ), (int)142)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == my.flot("fmau", flow(int ), (int)165)) break;
            v0 /* !! */  = (long)my.flot("fmav", flow(int ), (int)166);
        }
        var3_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = my.mo - my.flot("fmaw", floq(int ), (int)143)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == my.flot("fmax", flow(int ), (int)167)) break;
            v1 /* !! */  = (long)my.flot("fmay", flow(int ), (int)168);
        }
        var2_2 /* !! */  = my.b;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl17
        block16: while (true) {
            v2 /* !! */  = (long)(my.flot("fmba", floq(int ), (int)145) - my.flot("fmaz", floq(int ), (int)144));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1342496236: {
                    continue block16;
                }
                case 2126438510: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = my.a;
        if (!var3_1) ** GOTO lbl29
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)my.flot("fmbb", fluq(int ), (int)169);
                }
lbl29:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = my.mo - my.flot("fmbc", floq(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == my.flot("fmbd", flow(int ), (int)170)) break;
                    v3 /* !! */  = (long)my.flot("fmbe", flow(int ), (int)171);
                }
                v4 = System.nanoTime();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = my.mo - my.flot("fmbf", floq(int ), (int)147)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == my.flot("fmbg", flow(int ), (int)172)) break;
                    v5 /* !! */  = (long)my.flot("fmbh", flow(int ), (int)173);
                }
                v6 = v4 - this.closingAt;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = my.mo - my.flot("fmbi", floq(int ), (int)148)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == my.flot("fmbj", flow(int ), (int)174)) break;
                    v7 /* !! */  = (long)my.flot("fmbk", flow(int ), (int)175);
                }
                v8 = v6 / (float)this.closeDurationNs;
                v9 /* !! */  = my.mo;
                if (true) ** GOTO lbl52
                block21: while (true) {
                    v9 /* !! */  = (long)(my.flot("fmbm", floq(int ), (int)150) - my.flot("fmbl", floq(int ), (int)149));
lbl52:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1951896561: {
                            continue block21;
                        }
                        case 2126438510: {
                            break block21;
                        }
                    }
                    break;
                }
                return my.clamp01(v8);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)my.flot("fmbn", flow(int ), (int)176);
                        if (!var3_1) break block17;
                        throw null;
                    }
                }
lbl63:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)my.flot("fmbo", flow(int ), (int)177);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)my.flot("fmbp", flow(int ), (int)178);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)my.flot("fmbq", flow(int ), (int)179);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float easeOutCubic(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("fmcm", floq(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == my.flot("fmcn", flow(int ), (int)191)) break;
            v0 /* !! */  = (long)my.flot("fmco", flow(int ), (int)192);
        }
        var4_1 = my.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = my.mo - my.flot("fmcp", floq(int ), (int)162)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == my.flot("fmcq", flow(int ), (int)193)) break;
            v1 /* !! */  = (long)my.flot("fmcr", flow(int ), (int)194);
        }
        var3_2 /* !! */  = my.b;
        v2 /* !! */  = my.mo;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - my.flot("fmcs", floq(int ), (int)163));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1372597669: {
                    v3 = my.flot("fmct", floq(int ), (int)164);
                    continue block21;
                }
                case 958855365: {
                    v3 = my.flot("fmcu", floq(int ), (int)165);
                    continue block21;
                }
                case 1365152089: {
                    v3 = my.flot("fmcv", floq(int ), (int)166);
                    continue block21;
                }
                case 2126438510: {
                    break block21;
                }
            }
            break;
        }
        var2_3 = my.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl37:
                    // 2 sources

                    return (float)my.flot("fmcw", fluq(int ), (int)195);
                }
                if (var2_3 || var2_3) ** GOTO lbl37
                v4 /* !! */  = my.mo;
                if (true) ** GOTO lbl44
                block23: while (true) {
                    v4 /* !! */  = (long)(v5 - my.flot("fmcx", floq(int ), (int)167));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 150085216: {
                            v5 = my.flot("fmcy", floq(int ), (int)168);
                            continue block23;
                        }
                        case 2055481176: {
                            v5 = my.flot("fmcz", floq(int ), (int)169);
                            continue block23;
                        }
                        case 2126438510: {
                            break block23;
                        }
                    }
                    break;
                }
                var1_4 = 1.0f - my.clamp01(var0);
                if (var2_3 || var2_3) ** continue;
                return 1.0f - var1_4 * var1_4 * var1_4;
            }
lbl56:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)my.flot("fmda", flow(int ), (int)196);
                if (!var4_1) break;
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)my.flot("fmdb", flow(int ), (int)197);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 2: {
                var3_2 /* !! */  = (int)my.flot("fmdc", flow(int ), (int)198);
                if (!var4_1) break;
                throw null;
            }
lbl69:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)my.flot("fmdd", flow(int ), (int)199);
                    if (!var4_1) ** GOTO lbl56
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)my.flot("fmde", flow(int ), (int)200);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)my.flot("fmdf", flow(int ), (int)201);
        ** while (!var4_1)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void close() {
        block57: {
            v0 /* !! */  = my.mo;
            if (true) ** GOTO lbl5
            block39: while (true) {
                v0 /* !! */  = (long)(v1 - my.flot("flqr", floq(int ), (int)16));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -667023118: {
                        v1 = my.flot("flqs", floq(int ), (int)17);
                        continue block39;
                    }
                    case -82063718: {
                        v1 = my.flot("flqt", floq(int ), (int)18);
                        continue block39;
                    }
                    case 1781190315: {
                        v1 = my.flot("flqu", floq(int ), (int)19);
                        continue block39;
                    }
                    case 2126438510: {
                        break block39;
                    }
                }
                break;
            }
            var3_1 = my.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flqv", floq(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == my.flot("flqw", flow(int ), (int)30)) break;
                v2 /* !! */  = (long)my.flot("flqx", flow(int ), (int)31);
            }
            var2_2 /* !! */  = my.b;
            v3 /* !! */  = my.mo;
            if (true) ** GOTO lbl28
            block41: while (true) {
                v3 /* !! */  = (long)(v4 - my.flot("flqy", floq(int ), (int)21));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 42026401: {
                        v4 = my.flot("flqz", floq(int ), (int)22);
                        continue block41;
                    }
                    case 1863336136: {
                        v4 = my.flot("flra", floq(int ), (int)23);
                        continue block41;
                    }
                    case 2126438510: {
                        break block41;
                    }
                }
                break;
            }
            var1_3 = my.a;
            if (var3_1) {
                throw null;
lbl40:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v5 /* !! */  = my.mo;
            if (true) ** GOTO lbl47
            block43: while (true) {
                v5 /* !! */  = (long)(v6 - my.flot("flrb", floq(int ), (int)24));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -382120620: {
                        v6 = my.flot("flrc", floq(int ), (int)25);
                        continue block43;
                    }
                    case 1247238368: {
                        v6 = my.flot("flrd", floq(int ), (int)26);
                        continue block43;
                    }
                    case 2126438510: {
                        break block43;
                    }
                }
                break;
            }
            if (!this.closing) break block57;
            if (var1_3) ** GOTO lbl40
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v7 = my.flot("flre", flow(int ), (int)32);
        v8 /* !! */  = my.mo;
        if (true) ** GOTO lbl66
        block44: while (true) {
            v8 /* !! */  = (long)(my.flot("flrg", floq(int ), (int)28) - my.flot("flrf", floq(int ), (int)27));
lbl66:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1757178702: {
                    continue block44;
                }
                case 2126438510: {
                    break block44;
                }
            }
            break;
        }
        this.closing = v7;
        if (var1_3 || var1_3) ** GOTO lbl40
        v9 /* !! */  = my.mo;
        if (true) ** GOTO lbl77
        block45: while (true) {
            v9 /* !! */  = (long)(v10 - my.flot("flrh", floq(int ), (int)29));
lbl77:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -705754839: {
                    v10 = my.flot("flri", floq(int ), (int)30);
                    continue block45;
                }
                case 1720476646: {
                    v10 = my.flot("flrj", floq(int ), (int)31);
                    continue block45;
                }
                case 2126438510: {
                    break block45;
                }
            }
            break;
        }
        v11 = System.nanoTime();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flrk", floq(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == my.flot("flrl", flow(int ), (int)33)) break;
            v12 /* !! */  = (long)my.flot("flrm", flow(int ), (int)34);
        }
        this.closingAt = v11;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)my.flot("flrn", flow(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl104:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)my.flot("flro", flow(int ), (int)36);
                if (!var3_1) break;
                throw null;
            }
lbl108:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flrp", flow(int ), (int)37);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)my.flot("flrq", flow(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 4: {
                var2_2 /* !! */  = (int)my.flot("flrr", flow(int ), (int)39);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl122:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flrs", flow(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
lbl127:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)my.flot("flrt", flow(int ), (int)41);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl132:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)my.flot("flru", flow(int ), (int)42);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)my.flot("flrv", flow(int ), (int)43);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)my.flot("flrw", flow(int ), (int)44);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl144:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)my.flot("flrx", flow(int ), (int)45);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)my.flot("flry", flow(int ), (int)46);
        ** while (!var3_1)
lbl151:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float slide() {
        block59: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = my.mo - my.flot("flwz", floq(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == my.flot("flxa", flow(int ), (int)116)) break;
                v0 /* !! */  = (long)my.flot("flxb", flow(int ), (int)117);
            }
            var3_1 = my.c;
            v1 /* !! */  = my.mo;
            if (true) ** GOTO lbl11
            block42: while (true) {
                v1 /* !! */  = (long)(v2 - my.flot("flxc", floq(int ), (int)94));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1823939964: {
                        v2 = my.flot("flxd", floq(int ), (int)95);
                        continue block42;
                    }
                    case -632290081: {
                        v2 = my.flot("flxe", floq(int ), (int)96);
                        continue block42;
                    }
                    case 2126438510: {
                        break block42;
                    }
                }
                break;
            }
            var2_2 /* !! */  = my.b;
            v3 /* !! */  = my.mo;
            if (true) ** GOTO lbl25
            block43: while (true) {
                v3 /* !! */  = (long)(v4 - my.flot("flxf", floq(int ), (int)97));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -986172553: {
                        v4 = my.flot("flxg", floq(int ), (int)98);
                        continue block43;
                    }
                    case 337843845: {
                        v4 = my.flot("flxh", floq(int ), (int)99);
                        continue block43;
                    }
                    case 985003310: {
                        v4 = my.flot("flxi", floq(int ), (int)100);
                        continue block43;
                    }
                    case 2126438510: {
                        break block43;
                    }
                }
                break;
            }
            var1_3 = my.a;
            if (var3_1) {
                throw null;
lbl40:
                // 3 sources

                return (float)my.flot("flxj", fluq(int ), (int)118);
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v5 /* !! */  = my.mo;
            if (true) ** GOTO lbl47
            block45: while (true) {
                v5 /* !! */  = (long)(v6 - my.flot("flxk", floq(int ), (int)101));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -326376311: {
                        v6 = my.flot("flxl", floq(int ), (int)102);
                        continue block45;
                    }
                    case 904236496: {
                        v6 = my.flot("flxm", floq(int ), (int)103);
                        continue block45;
                    }
                    case 2126438510: {
                        break block45;
                    }
                }
                break;
            }
            if (!this.closing) break block59;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = my.mo - my.flot("flxn", floq(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == my.flot("flxo", flow(int ), (int)119)) break;
                v7 /* !! */  = (long)my.flot("flxp", flow(int ), (int)120);
            }
            v8 = this.closeRaw();
            v9 /* !! */  = my.mo;
            if (true) ** GOTO lbl68
            block47: while (true) {
                v9 /* !! */  = (long)(my.flot("flxr", floq(int ), (int)106) - my.flot("flxq", floq(int ), (int)105));
lbl68:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 1519642056: {
                        continue block47;
                    }
                    case 2126438510: {
                        break block47;
                    }
                }
                break;
            }
            return my.easeInCubic(v8) * my.flot("flxs", fluq(int ), (int)121);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v10 /* !! */  = my.mo;
                if (true) ** GOTO lbl84
                block48: while (true) {
                    v10 /* !! */  = (long)(v11 - my.flot("flxt", floq(int ), (int)107));
lbl84:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 205239592: {
                            v11 = my.flot("flxu", floq(int ), (int)108);
                            continue block48;
                        }
                        case 657903082: {
                            v11 = my.flot("flxv", floq(int ), (int)109);
                            continue block48;
                        }
                        case 2066511922: {
                            v11 = my.flot("flxw", floq(int ), (int)110);
                            continue block48;
                        }
                        case 2126438510: {
                            break block48;
                        }
                    }
                    break;
                }
                v12 = this.openRaw();
                v13 /* !! */  = my.mo;
                if (true) ** GOTO lbl101
                block49: while (true) {
                    v13 /* !! */  = (long)(v14 - my.flot("flxx", floq(int ), (int)111));
lbl101:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -726175524: {
                            v14 = my.flot("flxy", floq(int ), (int)112);
                            continue block49;
                        }
                        case 1350749386: {
                            v14 = my.flot("flxz", floq(int ), (int)113);
                            continue block49;
                        }
                        case 2126438510: {
                            break block49;
                        }
                    }
                    break;
                }
                return (1.0f - my.easeOutCubic(v12)) * my.flot("flya", fluq(int ), (int)122);
            }
lbl111:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)my.flot("flyb", flow(int ), (int)123);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl116:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)my.flot("flyc", flow(int ), (int)124);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl121:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flyd", flow(int ), (int)125);
                } while (!var3_1);
                throw null;
            }
lbl126:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)my.flot("flye", flow(int ), (int)126);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)my.flot("flyf", flow(int ), (int)127);
                    if (!var3_1) ** GOTO lbl111
                    throw null;
                }
            }
lbl135:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)my.flot("flyg", flow(int ), (int)128);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)my.flot("flyh", flow(int ), (int)129);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)my.flot("flyi", flow(int ), (int)130);
        ** while (!var3_1)
lbl147:
        // 1 sources

        throw null;
    }
}

