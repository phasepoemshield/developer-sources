/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ji$ParticleKind;

final class ji$GlowParticle {
    private static long[] cbqp;
    private static long[] cbqo;
    double x;
    float size;
    float maxAge;
    double vx;
    protected static final long fh = -3843002227118292591L;
    double vz;
    ji.ParticleKind kind;
    double y;
    boolean falling;
    int color;
    private static int[] cbqu;
    float age;
    float phase;
    public static final int b;
    double vy;
    private static int[] cbqt;
    double z;
    public static final boolean c;
    public static final boolean a;

    private static /* synthetic */ void cbum() {
        ji$GlowParticle.cbqp[0] = -4881961391995162253L;
        ji$GlowParticle.cbqp[1] = -7431473780826368091L;
        ji$GlowParticle.cbqp[2] = 7082099350025299556L;
        ji$GlowParticle.cbqp[3] = 1659314362518713468L;
        ji$GlowParticle.cbqp[4] = -8042041146868286686L;
        ji$GlowParticle.cbqp[5] = 2090249901347371160L;
        ji$GlowParticle.cbqp[6] = 4901614965133967490L;
        ji$GlowParticle.cbqp[7] = 1478122298736014518L;
        ji$GlowParticle.cbqp[8] = -1246318589827219862L;
        ji$GlowParticle.cbqp[9] = 8389658629410905393L;
        ji$GlowParticle.cbqp[10] = 5214635972582519906L;
        ji$GlowParticle.cbqp[11] = -5687333896344195225L;
        ji$GlowParticle.cbqp[12] = 4632208534810424566L;
        ji$GlowParticle.cbqp[13] = -4277613956841565767L;
        ji$GlowParticle.cbqp[14] = 9073055138987582319L;
        ji$GlowParticle.cbqp[15] = 2004534904418404176L;
        ji$GlowParticle.cbqp[16] = -2614445737629334000L;
        ji$GlowParticle.cbqp[17] = 781762759733778746L;
        ji$GlowParticle.cbqp[18] = -4904296555077387871L;
        ji$GlowParticle.cbqp[19] = 8584555454527840878L;
        ji$GlowParticle.cbqp[20] = -2389253648645183261L;
        ji$GlowParticle.cbqp[21] = -2363956001467819935L;
        ji$GlowParticle.cbqp[22] = -1813292059906982707L;
        ji$GlowParticle.cbqp[23] = -6549766156481097599L;
        ji$GlowParticle.cbqp[24] = -618214144037962327L;
        ji$GlowParticle.cbqp[25] = 3532599433173451799L;
        ji$GlowParticle.cbqp[26] = -1403046628227943014L;
        ji$GlowParticle.cbqp[27] = -3242958061939484349L;
        ji$GlowParticle.cbqp[28] = -3657281485884899939L;
        ji$GlowParticle.cbqp[29] = 4268904114405916170L;
        ji$GlowParticle.cbqp[30] = -8365477966079546871L;
        ji$GlowParticle.cbqp[31] = 5573388311880869746L;
    }

    private static /* synthetic */ long cbqn(int n2) {
        return cbqo[n2] ^ cbqp[n2];
    }

    private static /* synthetic */ int cbqs(int n2) {
        return cbqt[n2] ^ cbqu[n2];
    }

    public static /* synthetic */ CallSite cbqq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cbuj() {
        ji$GlowParticle.cbqt[0] = 759895821;
        ji$GlowParticle.cbqt[1] = 1235147633;
        ji$GlowParticle.cbqt[2] = 1576086464;
        ji$GlowParticle.cbqt[3] = 434134230;
        ji$GlowParticle.cbqt[4] = 345822758;
        ji$GlowParticle.cbqt[5] = 445547049;
        ji$GlowParticle.cbqt[6] = 845870591;
        ji$GlowParticle.cbqt[7] = -1543994588;
        ji$GlowParticle.cbqt[8] = -844012336;
        ji$GlowParticle.cbqt[9] = -1747955085;
        ji$GlowParticle.cbqt[10] = 1316075899;
        ji$GlowParticle.cbqt[11] = -424974720;
        ji$GlowParticle.cbqt[12] = -1024713973;
        ji$GlowParticle.cbqt[13] = -1215413266;
        ji$GlowParticle.cbqt[14] = 1907396425;
        ji$GlowParticle.cbqt[15] = -1685104201;
        ji$GlowParticle.cbqt[16] = 1294585543;
        ji$GlowParticle.cbqt[17] = 46600191;
        ji$GlowParticle.cbqt[18] = -437297826;
        ji$GlowParticle.cbqt[19] = 482765994;
        ji$GlowParticle.cbqt[20] = -1086597575;
        ji$GlowParticle.cbqt[21] = -1565483282;
        ji$GlowParticle.cbqt[22] = 792953758;
        ji$GlowParticle.cbqt[23] = 885932569;
        ji$GlowParticle.cbqt[24] = 1045244530;
        ji$GlowParticle.cbqt[25] = -47590065;
        ji$GlowParticle.cbqt[26] = -500359282;
        ji$GlowParticle.cbqt[27] = -767661779;
        ji$GlowParticle.cbqt[28] = -2137644240;
        ji$GlowParticle.cbqt[29] = 1076914756;
        ji$GlowParticle.cbqt[30] = -1208960369;
        ji$GlowParticle.cbqt[31] = 197374266;
        ji$GlowParticle.cbqt[32] = -2115725231;
        ji$GlowParticle.cbqt[33] = 1353052075;
        ji$GlowParticle.cbqt[34] = -71825475;
        ji$GlowParticle.cbqt[35] = 143720395;
        ji$GlowParticle.cbqt[36] = -1458151293;
        ji$GlowParticle.cbqt[37] = -797803882;
        ji$GlowParticle.cbqt[38] = -31321079;
        ji$GlowParticle.cbqt[39] = -1050538848;
        ji$GlowParticle.cbqt[40] = 793583236;
        ji$GlowParticle.cbqt[41] = 1438941507;
        ji$GlowParticle.cbqt[42] = -347646471;
        ji$GlowParticle.cbqt[43] = 1527093498;
        ji$GlowParticle.cbqt[44] = 186340017;
        ji$GlowParticle.cbqt[45] = -2020268107;
        ji$GlowParticle.cbqt[46] = 1414548335;
        ji$GlowParticle.cbqt[47] = 2124975219;
        ji$GlowParticle.cbqt[48] = -1570196751;
        ji$GlowParticle.cbqt[49] = 559001393;
        ji$GlowParticle.cbqt[50] = -370366931;
        ji$GlowParticle.cbqt[51] = -765693221;
        ji$GlowParticle.cbqt[52] = -70843726;
        ji$GlowParticle.cbqt[53] = 275605460;
        ji$GlowParticle.cbqt[54] = -1476153463;
        ji$GlowParticle.cbqt[55] = -1227509970;
        ji$GlowParticle.cbqt[56] = -113442384;
        ji$GlowParticle.cbqt[57] = 2062278713;
        ji$GlowParticle.cbqt[58] = -137262811;
        ji$GlowParticle.cbqt[59] = 1568574188;
        ji$GlowParticle.cbqt[60] = 508021324;
    }

    private static /* synthetic */ void cbul() {
        ji$GlowParticle.cbqo[0] = -638516366373242286L;
        ji$GlowParticle.cbqo[1] = 6217560775698887972L;
        ji$GlowParticle.cbqo[2] = -4826377356309996513L;
        ji$GlowParticle.cbqo[3] = -2351742601431387371L;
        ji$GlowParticle.cbqo[4] = -4573645770536489902L;
        ji$GlowParticle.cbqo[5] = -494487489030195840L;
        ji$GlowParticle.cbqo[6] = -283523004519420814L;
        ji$GlowParticle.cbqo[7] = 322037701117861745L;
        ji$GlowParticle.cbqo[8] = -3922520263358664777L;
        ji$GlowParticle.cbqo[9] = 753795202559326997L;
        ji$GlowParticle.cbqo[10] = 7934117026563693837L;
        ji$GlowParticle.cbqo[11] = 4651519925568446098L;
        ji$GlowParticle.cbqo[12] = -8581965002240700293L;
        ji$GlowParticle.cbqo[13] = -936891444890796319L;
        ji$GlowParticle.cbqo[14] = -6231921220445237101L;
        ji$GlowParticle.cbqo[15] = 7550185673358857824L;
        ji$GlowParticle.cbqo[16] = -137777762569958718L;
        ji$GlowParticle.cbqo[17] = 7291401580648077199L;
        ji$GlowParticle.cbqo[18] = -8390679846781375880L;
        ji$GlowParticle.cbqo[19] = 9069617237272727433L;
        ji$GlowParticle.cbqo[20] = 6976813854690443510L;
        ji$GlowParticle.cbqo[21] = 2781691112497131897L;
        ji$GlowParticle.cbqo[22] = 5914815145000377112L;
        ji$GlowParticle.cbqo[23] = 8823688108385748633L;
        ji$GlowParticle.cbqo[24] = -2110818098355519026L;
        ji$GlowParticle.cbqo[25] = 2070270880395271716L;
        ji$GlowParticle.cbqo[26] = 6982342751175760744L;
        ji$GlowParticle.cbqo[27] = 7277895867545867849L;
        ji$GlowParticle.cbqo[28] = -6269272615842363165L;
        ji$GlowParticle.cbqo[29] = -2982791389511592260L;
        ji$GlowParticle.cbqo[30] = 7840045223578323446L;
        ji$GlowParticle.cbqo[31] = -5661732482824396639L;
    }

    static {
        cbqt = new int[61];
        cbqu = new int[61];
        ji$GlowParticle.cbuj();
        ji$GlowParticle.cbuk();
        cbqo = new long[32];
        cbqp = new long[32];
        ji$GlowParticle.cbul();
        ji$GlowParticle.cbum();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void reset(double var1_1, double var3_2, double var5_3, double var7_4, double var9_5, double var11_6, float var13_7, float var14_8, float var15_9, boolean var16_10, ji.ParticleKind var17_11, int var18_12) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbrl", cbqn(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ji$GlowParticle.cbqq("cbrm", cbqs(int ), (int)11)) break;
            v0 /* !! */  = (long)ji$GlowParticle.cbqq("cbrn", cbqs(int ), (int)12);
        }
        var21_13 = ji$GlowParticle.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbro", cbqn(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ji$GlowParticle.cbqq("cbrp", cbqs(int ), (int)13)) break;
            v1 /* !! */  = (long)ji$GlowParticle.cbqq("cbrq", cbqs(int ), (int)14);
        }
        var20_14 /* !! */  = ji$GlowParticle.b;
        v2 /* !! */  = ji$GlowParticle.fh;
        if (true) ** GOTO lbl17
        block62: while (true) {
            v2 /* !! */  = (long)(v3 - ji$GlowParticle.cbqq("cbrr", cbqn(int ), (int)8));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1544837355: {
                    v3 = ji$GlowParticle.cbqq("cbrs", cbqn(int ), (int)9);
                    continue block62;
                }
                case -443268719: {
                    break block62;
                }
                case 1717269392: {
                    v3 = ji$GlowParticle.cbqq("cbrt", cbqn(int ), (int)10);
                    continue block62;
                }
            }
            break;
        }
        var19_15 = ji$GlowParticle.a;
        if (var21_13) {
            throw null;
lbl29:
            // 14 sources

            return;
        }
        if (var19_15 || var19_15) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbru", cbqn(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ji$GlowParticle.cbqq("cbrv", cbqs(int ), (int)15)) break;
            v4 /* !! */  = (long)ji$GlowParticle.cbqq("cbrw", cbqs(int ), (int)16);
        }
        this.x = var1_1;
        if (var19_15 || var19_15) ** GOTO lbl29
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbrx", cbqn(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ji$GlowParticle.cbqq("cbry", cbqs(int ), (int)17)) break;
            v5 /* !! */  = (long)ji$GlowParticle.cbqq("cbrz", cbqs(int ), (int)18);
        }
        this.y = var3_2;
        if (var20_14 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_14 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_15 || var19_15) ** GOTO lbl29
                v6 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl53
                block66: while (true) {
                    v6 /* !! */  = (long)(ji$GlowParticle.cbqq("cbsb", cbqn(int ), (int)14) - ji$GlowParticle.cbqq("cbsa", cbqn(int ), (int)13));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1965010827: {
                            continue block66;
                        }
                        case -443268719: {
                            break block66;
                        }
                    }
                    break;
                }
                this.z = var5_3;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbsc", cbqn(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ji$GlowParticle.cbqq("cbsd", cbqs(int ), (int)19)) break;
                    v7 /* !! */  = (long)ji$GlowParticle.cbqq("cbse", cbqs(int ), (int)20);
                }
                this.vx = var7_4;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbsf", cbqn(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ji$GlowParticle.cbqq("cbsg", cbqs(int ), (int)21)) break;
                    v8 /* !! */  = (long)ji$GlowParticle.cbqq("cbsh", cbqs(int ), (int)22);
                }
                this.vy = var9_5;
                if (var19_15 || var19_15) ** GOTO lbl29
                v9 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl78
                block69: while (true) {
                    v9 /* !! */  = (long)(v10 - ji$GlowParticle.cbqq("cbsi", cbqn(int ), (int)17));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2092824986: {
                            v10 = ji$GlowParticle.cbqq("cbsj", cbqn(int ), (int)18);
                            continue block69;
                        }
                        case -805010711: {
                            v10 = ji$GlowParticle.cbqq("cbsk", cbqn(int ), (int)19);
                            continue block69;
                        }
                        case -443268719: {
                            break block69;
                        }
                        case 410429169: {
                            v10 = ji$GlowParticle.cbqq("cbsl", cbqn(int ), (int)20);
                            continue block69;
                        }
                    }
                    break;
                }
                this.vz = var11_6;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbsm", cbqn(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ji$GlowParticle.cbqq("cbsn", cbqs(int ), (int)23)) break;
                    v11 /* !! */  = (long)ji$GlowParticle.cbqq("cbso", cbqs(int ), (int)24);
                }
                this.size = var13_7;
                if (var19_15 || var19_15) ** GOTO lbl29
                v12 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl103
                block71: while (true) {
                    v12 /* !! */  = (long)(ji$GlowParticle.cbqq("cbsq", cbqn(int ), (int)23) - ji$GlowParticle.cbqq("cbsp", cbqn(int ), (int)22));
lbl103:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -547383143: {
                            continue block71;
                        }
                        case -443268719: {
                            break block71;
                        }
                    }
                    break;
                }
                this.phase = var14_8;
                if (var19_15 || var19_15) ** GOTO lbl29
                v13 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl114
                block72: while (true) {
                    v13 /* !! */  = (long)(v14 - ji$GlowParticle.cbqq("cbsr", cbqn(int ), (int)24));
lbl114:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -880781540: {
                            v14 = ji$GlowParticle.cbqq("cbss", cbqn(int ), (int)25);
                            continue block72;
                        }
                        case -443268719: {
                            break block72;
                        }
                        case -54377101: {
                            v14 = ji$GlowParticle.cbqq("cbst", cbqn(int ), (int)26);
                            continue block72;
                        }
                    }
                    break;
                }
                this.maxAge = var15_9;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbsu", cbqn(int ), (int)27)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ji$GlowParticle.cbqq("cbsv", cbqs(int ), (int)25)) break;
                    v15 /* !! */  = (long)ji$GlowParticle.cbqq("cbsw", cbqs(int ), (int)26);
                }
                this.falling = var16_10;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_8 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbsx", cbqn(int ), (int)28)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ji$GlowParticle.cbqq("cbsy", cbqs(int ), (int)27)) break;
                    v16 /* !! */  = (long)ji$GlowParticle.cbqq("cbsz", cbqs(int ), (int)28);
                }
                this.kind = var17_11;
                if (var19_15 || var19_15) ** GOTO lbl29
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_9 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbta", cbqn(int ), (int)29)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ji$GlowParticle.cbqq("cbtb", cbqs(int ), (int)29)) break;
                    v17 /* !! */  = (long)ji$GlowParticle.cbqq("cbtc", cbqs(int ), (int)30);
                }
                this.color = var18_12;
                if (var19_15 || var19_15) ** GOTO lbl29
                v18 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl150
                block76: while (true) {
                    v18 /* !! */  = (long)(ji$GlowParticle.cbqq("cbte", cbqn(int ), (int)31) - ji$GlowParticle.cbqq("cbtd", cbqn(int ), (int)30));
lbl150:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -443268719: {
                            break block76;
                        }
                        case 1429273143: {
                            continue block76;
                        }
                    }
                    break;
                }
                this.age = 0.0f;
                if (var19_15 || var19_15) ** continue;
                return;
            }
lbl158:
            // 2 sources

            case 0: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtf", cbqs(int ), (int)31);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl163:
            // 2 sources

            case 1: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtg", cbqs(int ), (int)32);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl168:
            // 3 sources

            case 2: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbth", cbqs(int ), (int)33);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl173:
            // 3 sources

            case 3: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbti", cbqs(int ), (int)34);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 4: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtj", cbqs(int ), (int)35);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 5: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtk", cbqs(int ), (int)36);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 6: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtl", cbqs(int ), (int)37);
                if (!var21_13) ** GOTO lbl173
                throw null;
            }
lbl192:
            // 2 sources

            case 7: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtm", cbqs(int ), (int)38);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl197:
            // 2 sources

            case 8: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtn", cbqs(int ), (int)39);
                if (!var21_13) ** GOTO lbl163
                throw null;
            }
lbl201:
            // 2 sources

            case 9: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbto", cbqs(int ), (int)40);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 10: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtp", cbqs(int ), (int)41);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl211:
            // 2 sources

            case 11: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtq", cbqs(int ), (int)42);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl216:
            // 4 sources

            case 12: {
                do {
                    var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtr", cbqs(int ), (int)43);
                } while (!var21_13);
                throw null;
            }
            case 13: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbts", cbqs(int ), (int)44);
                if (!var21_13) ** GOTO lbl197
                throw null;
            }
lbl225:
            // 3 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtt", cbqs(int ), (int)45);
                    if (var21_13) {
                        throw null;
                    }
                    ** GOTO lbl286
                    break;
                }
            }
lbl231:
            // 2 sources

            case 15: {
                do {
                    var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtu", cbqs(int ), (int)46);
                } while (!var21_13);
                throw null;
            }
            case 16: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtv", cbqs(int ), (int)47);
                if (!var21_13) ** GOTO lbl173
                throw null;
            }
            case 17: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtw", cbqs(int ), (int)48);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl245:
            // 2 sources

            case 18: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtx", cbqs(int ), (int)49);
                if (!var21_13) ** GOTO lbl225
                throw null;
            }
            case 19: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbty", cbqs(int ), (int)50);
                if (!var21_13) ** GOTO lbl211
                throw null;
            }
lbl253:
            // 3 sources

            case 20: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbtz", cbqs(int ), (int)51);
                if (!var21_13) ** GOTO lbl216
                throw null;
            }
lbl257:
            // 3 sources

            case 21: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbua", cbqs(int ), (int)52);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl262:
            // 3 sources

            case 22: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbub", cbqs(int ), (int)53);
                if (!var21_13) ** GOTO lbl201
                throw null;
            }
            case 23: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbuc", cbqs(int ), (int)54);
                if (!var21_13) ** GOTO lbl216
                throw null;
            }
            case 24: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbud", cbqs(int ), (int)55);
                if (!var21_13) ** GOTO lbl158
                throw null;
            }
lbl274:
            // 2 sources

            case 25: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbue", cbqs(int ), (int)56);
                if (!var21_13) ** GOTO lbl168
                throw null;
            }
lbl278:
            // 2 sources

            case 26: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbuf", cbqs(int ), (int)57);
                if (!var21_13) ** GOTO lbl262
                throw null;
            }
lbl282:
            // 2 sources

            case 27: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbug", cbqs(int ), (int)58);
                if (!var21_13) ** GOTO lbl168
                throw null;
            }
lbl286:
            // 2 sources

            case 28: {
                var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbuh", cbqs(int ), (int)59);
                if (!var21_13) ** GOTO lbl216
                throw null;
            }
            case 29: 
        }
        var20_14 /* !! */  = (int)ji$GlowParticle.cbqq("cbui", cbqs(int ), (int)60);
        ** while (!var21_13)
lbl293:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cbuk() {
        ji$GlowParticle.cbqu[0] = -759895822;
        ji$GlowParticle.cbqu[1] = -1062195324;
        ji$GlowParticle.cbqu[2] = -1576086465;
        ji$GlowParticle.cbqu[3] = -2040081971;
        ji$GlowParticle.cbqu[4] = 345822758;
        ji$GlowParticle.cbqu[5] = 445547053;
        ji$GlowParticle.cbqu[6] = 845870590;
        ji$GlowParticle.cbqu[7] = -1543994587;
        ji$GlowParticle.cbqu[8] = -844012334;
        ji$GlowParticle.cbqu[9] = -1747955086;
        ji$GlowParticle.cbqu[10] = 1316075902;
        ji$GlowParticle.cbqu[11] = -424974719;
        ji$GlowParticle.cbqu[12] = 122786105;
        ji$GlowParticle.cbqu[13] = 1215413265;
        ji$GlowParticle.cbqu[14] = -330871161;
        ji$GlowParticle.cbqu[15] = 1685104200;
        ji$GlowParticle.cbqu[16] = -1774037446;
        ji$GlowParticle.cbqu[17] = 46600190;
        ji$GlowParticle.cbqu[18] = 325712059;
        ji$GlowParticle.cbqu[19] = -482765995;
        ji$GlowParticle.cbqu[20] = 980628342;
        ji$GlowParticle.cbqu[21] = 1565483281;
        ji$GlowParticle.cbqu[22] = -1563912293;
        ji$GlowParticle.cbqu[23] = -885932570;
        ji$GlowParticle.cbqu[24] = -1328457189;
        ji$GlowParticle.cbqu[25] = -47590066;
        ji$GlowParticle.cbqu[26] = 1430634408;
        ji$GlowParticle.cbqu[27] = 767661778;
        ji$GlowParticle.cbqu[28] = 1178718772;
        ji$GlowParticle.cbqu[29] = -1076914757;
        ji$GlowParticle.cbqu[30] = -1155476183;
        ji$GlowParticle.cbqu[31] = 197374265;
        ji$GlowParticle.cbqu[32] = -2115725236;
        ji$GlowParticle.cbqu[33] = 1353052065;
        ji$GlowParticle.cbqu[34] = -71825493;
        ji$GlowParticle.cbqu[35] = 143720415;
        ji$GlowParticle.cbqu[36] = -1458151286;
        ji$GlowParticle.cbqu[37] = -797803902;
        ji$GlowParticle.cbqu[38] = -31321062;
        ji$GlowParticle.cbqu[39] = -1050538846;
        ji$GlowParticle.cbqu[40] = 793583251;
        ji$GlowParticle.cbqu[41] = 1438941529;
        ji$GlowParticle.cbqu[42] = -347646496;
        ji$GlowParticle.cbqu[43] = 1527093490;
        ji$GlowParticle.cbqu[44] = 186340004;
        ji$GlowParticle.cbqu[45] = -2020268104;
        ji$GlowParticle.cbqu[46] = 1414548331;
        ji$GlowParticle.cbqu[47] = 2124975226;
        ji$GlowParticle.cbqu[48] = -1570196740;
        ji$GlowParticle.cbqu[49] = 559001407;
        ji$GlowParticle.cbqu[50] = -370366930;
        ji$GlowParticle.cbqu[51] = -765693239;
        ji$GlowParticle.cbqu[52] = -70843729;
        ji$GlowParticle.cbqu[53] = 275605461;
        ji$GlowParticle.cbqu[54] = -1476153452;
        ji$GlowParticle.cbqu[55] = -1227509964;
        ji$GlowParticle.cbqu[56] = -113442375;
        ji$GlowParticle.cbqu[57] = 2062278708;
        ji$GlowParticle.cbqu[58] = -137262799;
        ji$GlowParticle.cbqu[59] = 1568574201;
        ji$GlowParticle.cbqu[60] = 508021333;
    }

    private ji$GlowParticle() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void reset(double var1_1, double var3_2, double var5_3, double var7_4, double var9_5, double var11_6, float var13_7, float var14_8, float var15_9, boolean var16_10, ji.ParticleKind var17_11) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbqr", cbqn(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ji$GlowParticle.cbqq("cbqv", cbqs(int ), (int)0)) break;
            v0 /* !! */  = (long)ji$GlowParticle.cbqq("cbqw", cbqs(int ), (int)1);
        }
        var20_12 = ji$GlowParticle.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ji$GlowParticle.fh - ji$GlowParticle.cbqq("cbqx", cbqn(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ji$GlowParticle.cbqq("cbqy", cbqs(int ), (int)2)) break;
            v1 /* !! */  = (long)ji$GlowParticle.cbqq("cbqz", cbqs(int ), (int)3);
        }
        var19_13 /* !! */  = ji$GlowParticle.b;
        v2 /* !! */  = ji$GlowParticle.fh;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(ji$GlowParticle.cbqq("cbrb", cbqn(int ), (int)3) - ji$GlowParticle.cbqq("cbra", cbqn(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1956499954: {
                    continue block18;
                }
                case -443268719: {
                    break block18;
                }
            }
            break;
        }
        var18_14 = ji$GlowParticle.a;
        if (!var20_12) ** GOTO lbl31
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var19_13 /* !! */  == 0) ** GOTO lbl-1000
            switch (var19_13 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl31:
                // 1 sources

                if (var18_14 || var18_14) ** GOTO lbl-1000
                v3 = ji$GlowParticle.cbqq("cbrc", cbqs(int ), (int)4);
                v4 /* !! */  = ji$GlowParticle.fh;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v4 /* !! */  = (long)(ji$GlowParticle.cbqq("cbre", cbqn(int ), (int)5) - ji$GlowParticle.cbqq("cbrd", cbqn(int ), (int)4));
lbl37:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -969498690: {
                            continue block20;
                        }
                        case -443268719: {
                            break block20;
                        }
                    }
                    break;
                }
                this.reset(var1_1, var3_2, var5_3, var7_4, var9_5, var11_6, var13_7, var14_8, var15_9, var16_10, var17_11, (int)v3);
                if (var18_14 || var18_14) continue block19;
                return;
lbl45:
                // 2 sources

                case 0: {
                    do {
                        var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbrf", cbqs(int ), (int)5);
                    } while (!var20_12);
                    throw null;
                }
lbl50:
                // 2 sources

                case 1: {
                    var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbrg", cbqs(int ), (int)6);
                    if (var20_12) {
                        throw null;
                    }
                    ** GOTO lbl59
                }
                case 2: {
                    var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbrh", cbqs(int ), (int)7);
                    if (!var20_12) ** GOTO lbl50
                    throw null;
                }
lbl59:
                // 2 sources

                case 3: {
                    var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbri", cbqs(int ), (int)8);
                    if (var20_12) {
                        throw null;
                    }
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbrj", cbqs(int ), (int)9);
                        if (!var20_12) ** GOTO lbl45
                        throw null;
                    }
                }
                case 5: 
            }
        }
        var19_13 /* !! */  = (int)ji$GlowParticle.cbqq("cbrk", cbqs(int ), (int)10);
        ** while (!var20_12)
lbl71:
        // 1 sources

        throw null;
    }
}

