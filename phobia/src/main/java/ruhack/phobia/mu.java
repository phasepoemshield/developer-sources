/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.mv;
import ruhack.phobia.mx;
import ruhack.phobia.ps;

public class mu
implements mv {
    public final ps counter;
    protected mx direction;
    private static int[] fqxo;
    private static int[] fqxn;
    protected int ms;
    public static final boolean a;
    private static long[] fqxw;
    public static final boolean c;
    public static final int b;
    private static long[] fqxv;
    private static final long mv = -3102268588363823500L;
    protected double value;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public Double getOutput() {
        double d2;
        block43: {
            double d3;
            boolean bl2;
            block42: {
                boolean bl3;
                block41: {
                    while (true) {
                        long l2;
                        Object object;
                        if ((object = (l2 = mv - mu.fqxp("frju", fqxu(int ), (int)84)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                        if (object == mu.fqxp("frjv", fqxm(int ), (int)113)) break;
                        object = mu.fqxp("frjw", fqxm(int ), (int)114);
                    }
                    bl3 = c;
                    Object object = mv;
                    block20: while (true) {
                        switch ((int)object) {
                            case -927414668: {
                                break block20;
                            }
                            case -801503437: {
                                object = mu.fqxp("frjy", fqxu(int ), (int)86) - mu.fqxp("frjx", fqxu(int ), (int)85);
                                continue block20;
                            }
                        }
                        break;
                    }
                    int n2 = b;
                    while (true) {
                        long l3;
                        Object object2;
                        if ((object2 = (l3 = mv - mu.fqxp("frjz", fqxu(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                        if (object2 == mu.fqxp("frka", fqxm(int ), (int)115)) {
                            bl2 = a;
                            if (bl3) {
                                throw null;
                            }
                            break;
                        }
                        object2 = mu.fqxp("frkb", fqxm(int ), (int)116);
                    }
                    if (bl2) return null;
                    if (bl2) return null;
                    while (true) {
                        long l4;
                        Object object3;
                        if ((object3 = (l4 = mv - mu.fqxp("frkc", fqxu(int ), (int)88)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                        if (object3 == mu.fqxp("frkd", fqxm(int ), (int)117)) break;
                        object3 = mu.fqxp("frke", fqxm(int ), (int)118);
                    }
                    while (true) {
                        long l5;
                        Object object4;
                        if ((object4 = (l5 = mv - mu.fqxp("frkf", fqxu(int ), (int)89)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                        if (object4 == mu.fqxp("frkg", fqxm(int ), (int)119)) break;
                        object4 = mu.fqxp("frkh", fqxm(int ), (int)120);
                    }
                    double d4 = this.counter.getTime();
                    while (true) {
                        long l6;
                        Object object5;
                        if ((object5 = (l6 = mv - mu.fqxp("frki", fqxu(int ), (int)90)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                        if (object5 == mu.fqxp("frkj", fqxm(int ), (int)121)) break;
                        object5 = mu.fqxp("frkk", fqxm(int ), (int)122);
                    }
                    double d5 = 1.0 - this.calculation(d4);
                    while (true) {
                        long l7;
                        Object object6;
                        if ((object6 = (l7 = mv - mu.fqxp("frkl", fqxu(int ), (int)91)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
                        if (object6 == mu.fqxp("frkm", fqxm(int ), (int)123)) break;
                        object6 = mu.fqxp("frko", fqxm(int ), (int)124);
                    }
                    d3 = d5 * this.value;
                    if (bl2) return null;
                    if (bl2) return null;
                    Object object7 = mv;
                    block26: while (true) {
                        switch ((int)object7) {
                            case -927414668: {
                                break block26;
                            }
                            case 2135938266: {
                                object7 = mu.fqxp("frkq", fqxu(int ), (int)93) - mu.fqxp("frkp", fqxu(int ), (int)92);
                                continue block26;
                            }
                        }
                        break;
                    }
                    while (true) {
                        long l8;
                        Object object8;
                        if ((object8 = (l8 = mv - mu.fqxp("frkr", fqxu(int ), (int)94)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
                        if (object8 == mu.fqxp("frks", fqxm(int ), (int)125)) {
                            if (this.direction == mx.FORWARDS) {
                                break;
                            }
                            break block41;
                        }
                        object8 = mu.fqxp("frkt", fqxm(int ), (int)126);
                    }
                    if (bl2) return null;
                    if (bl2) return null;
                    Object object9 = mv;
                    boolean bl4 = true;
                    block28: while (true) {
                        CallSite callSite;
                        if (!bl4 || (bl4 = false) || !true) {
                            object9 = callSite - mu.fqxp("frku", fqxu(int ), (int)95);
                        }
                        switch ((int)object9) {
                            case -927414668: {
                                break block28;
                            }
                            case 957066237: {
                                callSite = mu.fqxp("frkv", fqxu(int ), (int)96);
                                continue block28;
                            }
                            case 1093769695: {
                                callSite = mu.fqxp("frkw", fqxu(int ), (int)97);
                                continue block28;
                            }
                            case 1869088826: {
                                callSite = mu.fqxp("frkx", fqxu(int ), (int)98);
                                continue block28;
                            }
                        }
                        break;
                    }
                    d2 = this.endValue();
                    if (bl3) {
                        throw null;
                    }
                    break block43;
                }
                if (bl2) return null;
                if (bl2) return null;
                while (true) {
                    long l9;
                    Object object;
                    if ((object = (l9 = mv - mu.fqxp("frky", fqxu(int ), (int)99)) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false) continue;
                    if (object == mu.fqxp("frkz", fqxm(int ), (int)127)) {
                        if (this.isDone()) {
                            break;
                        }
                        break block42;
                    }
                    object = mu.fqxp("frla", fqxm(int ), (int)128);
                }
                if (bl2) return null;
                d2 = 0.0;
                if (bl3) {
                    throw null;
                }
                break block43;
            }
            if (bl2) return null;
            if (bl2) return null;
            d2 = d3;
        }
        Object object = mv;
        boolean bl5 = true;
        block30: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object = callSite - mu.fqxp("frlb", fqxu(int ), (int)100);
            }
            switch ((int)object) {
                case -927414668: {
                    return d2;
                }
                case 673536580: {
                    callSite = mu.fqxp("frld", fqxu(int ), (int)101);
                    continue block30;
                }
                case 785667022: {
                    callSite = mu.fqxp("frle", fqxu(int ), (int)102);
                    continue block30;
                }
            }
            break;
        }
        return d2;
    }

    private static /* synthetic */ void frpd() {
        mu.fqxw[0] = 5887910684187774385L;
        mu.fqxw[1] = 8170550560480313469L;
        mu.fqxw[2] = 6208007464849101921L;
        mu.fqxw[3] = -726338873597116836L;
        mu.fqxw[4] = -8216774933650162231L;
        mu.fqxw[5] = 4636704696713327220L;
        mu.fqxw[6] = -1702902751159693372L;
        mu.fqxw[7] = -442014243078447220L;
        mu.fqxw[8] = 2294927093484352584L;
        mu.fqxw[9] = -1854038959452246896L;
        mu.fqxw[10] = -4665778480950053081L;
        mu.fqxw[11] = -3334384191297984128L;
        mu.fqxw[12] = 4160921055063480352L;
        mu.fqxw[13] = -4985876205070880740L;
        mu.fqxw[14] = -284578975955939352L;
        mu.fqxw[15] = 8265516004091220944L;
        mu.fqxw[16] = -8392576706172014674L;
        mu.fqxw[17] = 5690359946377774388L;
        mu.fqxw[18] = 1865842432755649751L;
        mu.fqxw[19] = -3342104162421073700L;
        mu.fqxw[20] = 411219917631505947L;
        mu.fqxw[21] = 6877238238043175011L;
        mu.fqxw[22] = -8289225395878709330L;
        mu.fqxw[23] = 6650824443249968723L;
        mu.fqxw[24] = -8634520946495519148L;
        mu.fqxw[25] = 1182646261241093710L;
        mu.fqxw[26] = -5451852082611244561L;
        mu.fqxw[27] = 2612743019640151059L;
        mu.fqxw[28] = 692362182181508511L;
        mu.fqxw[29] = 816803013858893979L;
        mu.fqxw[30] = -7961620205135523453L;
        mu.fqxw[31] = 5124064150866485668L;
        mu.fqxw[32] = -7004321759233199026L;
        mu.fqxw[33] = -4225431556333735347L;
        mu.fqxw[34] = 5527111993552487162L;
        mu.fqxw[35] = -1124895167711692720L;
        mu.fqxw[36] = -7344537084107234758L;
        mu.fqxw[37] = -6763154062542295414L;
        mu.fqxw[38] = 7754803014503033732L;
        mu.fqxw[39] = -2690795133664304265L;
        mu.fqxw[40] = -4135492777479546014L;
        mu.fqxw[41] = -5612276005578325968L;
        mu.fqxw[42] = 7211180680016435715L;
        mu.fqxw[43] = -7500017882497893672L;
        mu.fqxw[44] = -6301177896986908583L;
        mu.fqxw[45] = 3579799372282715805L;
        mu.fqxw[46] = 8635922819356036755L;
        mu.fqxw[47] = -2013491063091833542L;
        mu.fqxw[48] = 2302606081691303027L;
        mu.fqxw[49] = -4052977906022609207L;
        mu.fqxw[50] = -7711099161514689824L;
        mu.fqxw[51] = 1575015452957993407L;
        mu.fqxw[52] = -1757172017513342529L;
        mu.fqxw[53] = -7981818490228673748L;
        mu.fqxw[54] = 5150794682018395225L;
        mu.fqxw[55] = -388557793363616394L;
        mu.fqxw[56] = 1426461201489288520L;
        mu.fqxw[57] = 9095757524842349106L;
        mu.fqxw[58] = -8009187479254486481L;
        mu.fqxw[59] = 5998369305633296211L;
        mu.fqxw[60] = 1511895033729728404L;
        mu.fqxw[61] = -781897477259334385L;
        mu.fqxw[62] = 6636166826715948260L;
        mu.fqxw[63] = -7011063898056770666L;
        mu.fqxw[64] = 5832130083796403805L;
        mu.fqxw[65] = -4847500043511289654L;
        mu.fqxw[66] = 7116600986046872327L;
        mu.fqxw[67] = -3210610212628400394L;
        mu.fqxw[68] = 7840106480153102477L;
        mu.fqxw[69] = -7848509815793107241L;
        mu.fqxw[70] = -3056245464484669238L;
        mu.fqxw[71] = -8275455803274596159L;
        mu.fqxw[72] = 459319561715887020L;
        mu.fqxw[73] = 7310180110687513639L;
        mu.fqxw[74] = 3054572046691419797L;
        mu.fqxw[75] = 166062103077506531L;
        mu.fqxw[76] = -4788476966178686553L;
        mu.fqxw[77] = -5646425208092966933L;
        mu.fqxw[78] = 6261341722415202591L;
        mu.fqxw[79] = 1999962872846782147L;
        mu.fqxw[80] = -3973928531144704175L;
        mu.fqxw[81] = 9141207655638843984L;
        mu.fqxw[82] = -7597013559032605542L;
        mu.fqxw[83] = 6513095049403456731L;
        mu.fqxw[84] = -7529064403950476528L;
        mu.fqxw[85] = -1532480077427997583L;
        mu.fqxw[86] = 1059965289279108861L;
        mu.fqxw[87] = -6237979468129140338L;
        mu.fqxw[88] = 6290394630539671004L;
        mu.fqxw[89] = -1545490163909626465L;
        mu.fqxw[90] = 2150872918927951226L;
        mu.fqxw[91] = -369534664005945527L;
        mu.fqxw[92] = -2598117186117173202L;
        mu.fqxw[93] = 8679925945118121495L;
        mu.fqxw[94] = 4369574260391582698L;
        mu.fqxw[95] = -7823859928867958419L;
        mu.fqxw[96] = 8253102574668806953L;
        mu.fqxw[97] = -4968823974335042385L;
        mu.fqxw[98] = 1047823871192743639L;
        mu.fqxw[99] = -5761879973185224256L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mu setMs(int var1_1) {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - mu.fqxp("frng", fqxu(int ), (int)123));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1189052666: {
                    v1 = mu.fqxp("frnh", fqxu(int ), (int)124);
                    continue block19;
                }
                case -927414668: {
                    break block19;
                }
                case 805030264: {
                    v1 = mu.fqxp("frni", fqxu(int ), (int)125);
                    continue block19;
                }
                case 1873146984: {
                    v1 = mu.fqxp("frnj", fqxu(int ), (int)126);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = mu.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frnk", fqxu(int ), (int)127)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mu.fqxp("frnl", fqxm(int ), (int)158)) break;
            v2 /* !! */  = (long)mu.fqxp("frnn", fqxm(int ), (int)159);
        }
        var3_3 /* !! */  = mu.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mu.mv;
                if (true) ** GOTO lbl31
                block21: while (true) {
                    v3 /* !! */  = (long)(v4 - mu.fqxp("frno", fqxu(int ), (int)128));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2088778230: {
                            v4 = mu.fqxp("frnp", fqxu(int ), (int)129);
                            continue block21;
                        }
                        case -927414668: {
                            break block21;
                        }
                        case -784186630: {
                            v4 = mu.fqxp("frnq", fqxu(int ), (int)130);
                            continue block21;
                        }
                        case 400423853: {
                            v4 = mu.fqxp("frnr", fqxu(int ), (int)131);
                            continue block21;
                        }
                    }
                    break;
                }
                var2_4 = mu.a;
                if (var4_2) {
                    throw null;
lbl46:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frnt", fqxu(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mu.fqxp("frnu", fqxm(int ), (int)160)) break;
                    v5 /* !! */  = (long)mu.fqxp("frnv", fqxm(int ), (int)161);
                }
                this.ms = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
lbl58:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mu.fqxp("frnw", fqxm(int ), (int)162);
                if (var4_2) {
                    throw null;
                }
            }
lbl62:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mu.fqxp("frnx", fqxm(int ), (int)163);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)mu.fqxp("frny", fqxm(int ), (int)164);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)mu.fqxp("frnz", fqxm(int ), (int)165);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)mu.fqxp("froa", fqxm(int ), (int)166);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frot() {
        mu.fqxn[100] = 1535691784;
        mu.fqxn[101] = -592113310;
        mu.fqxn[102] = 1960297421;
        mu.fqxn[103] = -33165780;
        mu.fqxn[104] = 215250181;
        mu.fqxn[105] = -1405931030;
        mu.fqxn[106] = 621134724;
        mu.fqxn[107] = -1246033311;
        mu.fqxn[108] = 1608337066;
        mu.fqxn[109] = -1767955911;
        mu.fqxn[110] = -132393873;
        mu.fqxn[111] = 1828890143;
        mu.fqxn[112] = -1046134905;
        mu.fqxn[113] = -499866816;
        mu.fqxn[114] = 226782771;
        mu.fqxn[115] = -788628368;
        mu.fqxn[116] = -2088246878;
        mu.fqxn[117] = -1201522397;
        mu.fqxn[118] = -2093379518;
        mu.fqxn[119] = -1537879607;
        mu.fqxn[120] = 1942419449;
        mu.fqxn[121] = -1769453962;
        mu.fqxn[122] = -1043478964;
        mu.fqxn[123] = -1040668916;
        mu.fqxn[124] = -1565246671;
        mu.fqxn[125] = 503000902;
        mu.fqxn[126] = 1361079193;
        mu.fqxn[127] = -175562012;
        mu.fqxn[128] = -907869938;
        mu.fqxn[129] = 71136552;
        mu.fqxn[130] = -1837120144;
        mu.fqxn[131] = -112258606;
        mu.fqxn[132] = -1034587768;
        mu.fqxn[133] = -350844324;
        mu.fqxn[134] = -1447210437;
        mu.fqxn[135] = -1798732785;
        mu.fqxn[136] = 336615974;
        mu.fqxn[137] = -1062845947;
        mu.fqxn[138] = -519639604;
        mu.fqxn[139] = 439785842;
        mu.fqxn[140] = 273229224;
        mu.fqxn[141] = 1185781186;
        mu.fqxn[142] = -362485850;
        mu.fqxn[143] = -166541276;
        mu.fqxn[144] = 1608072570;
        mu.fqxn[145] = -432128163;
        mu.fqxn[146] = -277099624;
        mu.fqxn[147] = 774806815;
        mu.fqxn[148] = -47814913;
        mu.fqxn[149] = 1120645989;
        mu.fqxn[150] = 1018115436;
        mu.fqxn[151] = -556774873;
        mu.fqxn[152] = 255691564;
        mu.fqxn[153] = -2066043389;
        mu.fqxn[154] = 1934814069;
        mu.fqxn[155] = 121238370;
        mu.fqxn[156] = 1147714421;
        mu.fqxn[157] = -826133000;
        mu.fqxn[158] = 1664533223;
        mu.fqxn[159] = -1312950943;
        mu.fqxn[160] = 238526669;
        mu.fqxn[161] = 1528201686;
        mu.fqxn[162] = 965508924;
        mu.fqxn[163] = 1104365133;
        mu.fqxn[164] = 856090395;
        mu.fqxn[165] = -519252781;
        mu.fqxn[166] = -92214308;
        mu.fqxn[167] = 1447728380;
        mu.fqxn[168] = 1190622984;
        mu.fqxn[169] = -868969041;
        mu.fqxn[170] = 792934686;
        mu.fqxn[171] = -1202954496;
        mu.fqxn[172] = -455126413;
        mu.fqxn[173] = 1548385323;
        mu.fqxn[174] = 1798918709;
        mu.fqxn[175] = 48848702;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setDirection(mx var1_1) {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - mu.fqxp("frfh", fqxu(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2078776012: {
                    v1 = mu.fqxp("frfm", fqxu(int ), (int)49);
                    continue block29;
                }
                case -927414668: {
                    break block29;
                }
                case 601647327: {
                    v1 = mu.fqxp("frfo", fqxu(int ), (int)50);
                    continue block29;
                }
            }
            break;
        }
        var4_2 = mu.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frfq", fqxu(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mu.fqxp("frfs", fqxm(int ), (int)57)) break;
            v2 /* !! */  = (long)mu.fqxp("frft", fqxm(int ), (int)58);
        }
        var3_3 /* !! */  = mu.b;
        v3 /* !! */  = mu.mv;
        if (true) ** GOTO lbl25
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - mu.fqxp("frfu", fqxu(int ), (int)52));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -927414668: {
                    break block31;
                }
                case 504144898: {
                    v4 = mu.fqxp("frfv", fqxu(int ), (int)53);
                    continue block31;
                }
                case 922579545: {
                    v4 = mu.fqxp("frfz", fqxu(int ), (int)54);
                    continue block31;
                }
            }
            break;
        }
        var2_4 = mu.a;
        if (var4_2) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl37
                v5 /* !! */  = mu.mv;
                if (true) ** GOTO lbl47
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - mu.fqxp("frgc", fqxu(int ), (int)55));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1663631045: {
                            v6 = mu.fqxp("frge", fqxu(int ), (int)56);
                            continue block33;
                        }
                        case -1622902070: {
                            v6 = mu.fqxp("frgf", fqxu(int ), (int)57);
                            continue block33;
                        }
                        case -1175100969: {
                            v6 = mu.fqxp("frgg", fqxu(int ), (int)58);
                            continue block33;
                        }
                        case -927414668: {
                            break block33;
                        }
                    }
                    break;
                }
                if (this.direction == var1_1) ** GOTO lbl75
                if (var2_4 || var2_4) ** GOTO lbl37
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frgk", fqxu(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mu.fqxp("frgm", fqxm(int ), (int)59)) break;
                    v7 /* !! */  = (long)mu.fqxp("frgo", fqxm(int ), (int)60);
                }
                this.direction = var1_1;
                if (var2_4 || var2_4) ** GOTO lbl37
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frgq", fqxu(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mu.fqxp("frgs", fqxm(int ), (int)61)) break;
                    v8 /* !! */  = (long)mu.fqxp("frgt", fqxm(int ), (int)62);
                }
                this.adjustTimer();
                if (var2_4) ** GOTO lbl37
lbl75:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl78:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mu.fqxp("frgu", fqxm(int ), (int)63);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 1: {
                var3_3 /* !! */  = (int)mu.fqxp("frgv", fqxm(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl88:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)mu.fqxp("frgw", fqxm(int ), (int)65);
                if (!var4_2) break;
                throw null;
            }
lbl92:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)mu.fqxp("frgx", fqxm(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)mu.fqxp("frgy", fqxm(int ), (int)67);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
lbl100:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mu.fqxp("frgz", fqxm(int ), (int)68);
                    if (!var4_2) break block10;
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)mu.fqxp("frhb", fqxm(int ), (int)69);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 7: {
                var3_3 /* !! */  = (int)mu.fqxp("frhc", fqxm(int ), (int)70);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
            case 8: {
                do {
                    var3_3 /* !! */  = (int)mu.fqxp("frhd", fqxm(int ), (int)71);
                } while (!var4_2);
                throw null;
            }
lbl119:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)mu.fqxp("frhe", fqxm(int ), (int)72);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)mu.fqxp("frhf", fqxm(int ), (int)73);
        ** while (!var4_2)
lbl126:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mu setValue(double var1_1) {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(mu.fqxp("froc", fqxu(int ), (int)134) - mu.fqxp("frob", fqxu(int ), (int)133));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -927414668: {
                    break block15;
                }
                case 34321980: {
                    continue block15;
                }
            }
            break;
        }
        var5_2 = mu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frod", fqxu(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mu.fqxp("froe", fqxm(int ), (int)167)) break;
            v1 /* !! */  = (long)mu.fqxp("frof", fqxm(int ), (int)168);
        }
        var4_3 /* !! */  = mu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frog", fqxu(int ), (int)136)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mu.fqxp("froh", fqxm(int ), (int)169)) break;
            v2 /* !! */  = (long)mu.fqxp("froi", fqxm(int ), (int)170);
        }
        var3_4 = mu.a;
        if (var5_2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var3_4 || var3_4) ** GOTO lbl27
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mu.mv;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(mu.fqxp("frol", fqxu(int ), (int)138) - mu.fqxp("froj", fqxu(int ), (int)137));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -927414668: {
                            break block19;
                        }
                        case 804218924: {
                            continue block19;
                        }
                    }
                    break;
                }
                this.value = var1_1;
                if (!var3_4) ** break;
                ** continue;
                return this;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mu.fqxp("from", fqxm(int ), (int)171);
                    if (!var5_2) break block4;
                    throw null;
                }
            }
            case 1: {
                do {
                    var4_3 /* !! */  = (int)mu.fqxp("fron", fqxm(int ), (int)172);
                } while (!var5_2);
                throw null;
            }
            case 2: {
                do {
                    var4_3 /* !! */  = (int)mu.fqxp("froo", fqxm(int ), (int)173);
                } while (!var5_2);
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)mu.fqxp("frop", fqxm(int ), (int)174);
                if (!var5_2) break;
                throw null;
            }
            case 4: 
        }
        var4_3 /* !! */  = (int)mu.fqxp("froq", fqxm(int ), (int)175);
        ** while (!var5_2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mx getDirection() {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - mu.fqxp("fred", fqxu(int ), (int)37));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -927414668: {
                    break block22;
                }
                case -662579293: {
                    v1 = mu.fqxp("free", fqxu(int ), (int)38);
                    continue block22;
                }
                case 932003517: {
                    v1 = mu.fqxp("fref", fqxu(int ), (int)39);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = mu.c;
        v2 /* !! */  = mu.mv;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - mu.fqxp("freg", fqxu(int ), (int)40));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1725589082: {
                    v3 = mu.fqxp("frei", fqxu(int ), (int)41);
                    continue block23;
                }
                case -1267050110: {
                    v3 = mu.fqxp("frej", fqxu(int ), (int)42);
                    continue block23;
                }
                case -927414668: {
                    break block23;
                }
                case 1872404713: {
                    v3 = mu.fqxp("freo", fqxu(int ), (int)43);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = mu.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("freq", fqxu(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mu.fqxp("frer", fqxm(int ), (int)51)) break;
                    v4 /* !! */  = (long)mu.fqxp("fres", fqxm(int ), (int)52);
                }
                var1_3 = mu.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mu.mv;
                if (true) ** GOTO lbl51
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - mu.fqxp("fret", fqxu(int ), (int)45));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -970154756: {
                            v6 = mu.fqxp("freu", fqxu(int ), (int)46);
                            continue block26;
                        }
                        case -927414668: {
                            break block26;
                        }
                        case 1494043541: {
                            v6 = mu.fqxp("frev", fqxu(int ), (int)47);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.direction;
            }
lbl61:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mu.fqxp("frez", fqxm(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
lbl66:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("frfb", fqxm(int ), (int)54);
                    if (!var3_1) ** GOTO lbl61
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mu.fqxp("frfd", fqxm(int ), (int)55);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("frff", fqxm(int ), (int)56);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double frmb(int n2) {
        return Double.longBitsToDouble(fqxv[n2] ^ fqxw[n2]);
    }

    private static /* synthetic */ void fror() {
        mu.fqxn[0] = -1959240648;
        mu.fqxn[1] = 1772497441;
        mu.fqxn[2] = 81873326;
        mu.fqxn[3] = -237969707;
        mu.fqxn[4] = 1917905452;
        mu.fqxn[5] = -626192433;
        mu.fqxn[6] = 1237216994;
        mu.fqxn[7] = -466474074;
        mu.fqxn[8] = 962012536;
        mu.fqxn[9] = -1318835873;
        mu.fqxn[10] = 670361482;
        mu.fqxn[11] = -1909253637;
        mu.fqxn[12] = 1044042653;
        mu.fqxn[13] = -213366208;
        mu.fqxn[14] = 329594388;
        mu.fqxn[15] = 1582747431;
        mu.fqxn[16] = 710593506;
        mu.fqxn[17] = -808643179;
        mu.fqxn[18] = 1866963145;
        mu.fqxn[19] = -747084335;
        mu.fqxn[20] = 97746514;
        mu.fqxn[21] = 595309752;
        mu.fqxn[22] = -875478814;
        mu.fqxn[23] = 1997108115;
        mu.fqxn[24] = 1025141398;
        mu.fqxn[25] = -1953481981;
        mu.fqxn[26] = 637591375;
        mu.fqxn[27] = -308703413;
        mu.fqxn[28] = 1740400006;
        mu.fqxn[29] = -1713855674;
        mu.fqxn[30] = -189891920;
        mu.fqxn[31] = -582750227;
        mu.fqxn[32] = -1583524542;
        mu.fqxn[33] = 2129073889;
        mu.fqxn[34] = -841845117;
        mu.fqxn[35] = 1771214295;
        mu.fqxn[36] = -640701884;
        mu.fqxn[37] = -1709873781;
        mu.fqxn[38] = 895664790;
        mu.fqxn[39] = -2017527859;
        mu.fqxn[40] = -1296984905;
        mu.fqxn[41] = -1605078048;
        mu.fqxn[42] = -1039509787;
        mu.fqxn[43] = 1486544022;
        mu.fqxn[44] = -1962441567;
        mu.fqxn[45] = -1247491715;
        mu.fqxn[46] = 451318170;
        mu.fqxn[47] = 1849457609;
        mu.fqxn[48] = -86710793;
        mu.fqxn[49] = 1303489357;
        mu.fqxn[50] = -952082685;
        mu.fqxn[51] = 1744953409;
        mu.fqxn[52] = 1908877587;
        mu.fqxn[53] = 1458583273;
        mu.fqxn[54] = 1963854268;
        mu.fqxn[55] = 1656545429;
        mu.fqxn[56] = 1161816332;
        mu.fqxn[57] = -1601451589;
        mu.fqxn[58] = 492816599;
        mu.fqxn[59] = 825403531;
        mu.fqxn[60] = 2022054062;
        mu.fqxn[61] = 784816223;
        mu.fqxn[62] = 427088612;
        mu.fqxn[63] = -1332416737;
        mu.fqxn[64] = -1591405114;
        mu.fqxn[65] = 921081984;
        mu.fqxn[66] = 1691289094;
        mu.fqxn[67] = 848836644;
        mu.fqxn[68] = -434275964;
        mu.fqxn[69] = -1033254227;
        mu.fqxn[70] = 2016524406;
        mu.fqxn[71] = 1254097205;
        mu.fqxn[72] = 2131708114;
        mu.fqxn[73] = 587173079;
        mu.fqxn[74] = 1867828396;
        mu.fqxn[75] = -872040360;
        mu.fqxn[76] = 905203036;
        mu.fqxn[77] = -720407189;
        mu.fqxn[78] = 180859865;
        mu.fqxn[79] = -152243336;
        mu.fqxn[80] = -1616271279;
        mu.fqxn[81] = 1824969759;
        mu.fqxn[82] = -1396379421;
        mu.fqxn[83] = 1260280301;
        mu.fqxn[84] = -45947897;
        mu.fqxn[85] = -909743526;
        mu.fqxn[86] = -564037364;
        mu.fqxn[87] = 1234218515;
        mu.fqxn[88] = -1833097621;
        mu.fqxn[89] = -1691030804;
        mu.fqxn[90] = -829992079;
        mu.fqxn[91] = -201964370;
        mu.fqxn[92] = 165936482;
        mu.fqxn[93] = 1335900416;
        mu.fqxn[94] = -1606391345;
        mu.fqxn[95] = 1349496922;
        mu.fqxn[96] = -1319274741;
        mu.fqxn[97] = 538559992;
        mu.fqxn[98] = -289376857;
        mu.fqxn[99] = -941843271;
    }

    private static /* synthetic */ void frox() {
        mu.fqxo[100] = 971533671;
        mu.fqxo[101] = -592113309;
        mu.fqxo[102] = 950073379;
        mu.fqxo[103] = -33165779;
        mu.fqxo[104] = 248453780;
        mu.fqxo[105] = -1405931029;
        mu.fqxo[106] = 1151613168;
        mu.fqxo[107] = -1246033308;
        mu.fqxo[108] = 1608337065;
        mu.fqxo[109] = -1767955912;
        mu.fqxo[110] = -132393875;
        mu.fqxo[111] = 1828890139;
        mu.fqxo[112] = -1046134907;
        mu.fqxo[113] = 499866815;
        mu.fqxo[114] = 321417040;
        mu.fqxo[115] = -788628367;
        mu.fqxo[116] = -270309752;
        mu.fqxo[117] = 1201522396;
        mu.fqxo[118] = -1760502234;
        mu.fqxo[119] = 1537879606;
        mu.fqxo[120] = 127176381;
        mu.fqxo[121] = 1769453961;
        mu.fqxo[122] = 791219605;
        mu.fqxo[123] = -1040668915;
        mu.fqxo[124] = -993841328;
        mu.fqxo[125] = -503000903;
        mu.fqxo[126] = 1015783190;
        mu.fqxo[127] = 175562011;
        mu.fqxo[128] = 222250366;
        mu.fqxo[129] = 71136548;
        mu.fqxo[130] = -1837120131;
        mu.fqxo[131] = -112258605;
        mu.fqxo[132] = -1034587763;
        mu.fqxo[133] = -350844327;
        mu.fqxo[134] = -1447210447;
        mu.fqxo[135] = -1798732785;
        mu.fqxo[136] = 336615983;
        mu.fqxo[137] = -1062845940;
        mu.fqxo[138] = -519639615;
        mu.fqxo[139] = 439785850;
        mu.fqxo[140] = 273229224;
        mu.fqxo[141] = 1185781194;
        mu.fqxo[142] = -362485856;
        mu.fqxo[143] = 166541275;
        mu.fqxo[144] = -1986619979;
        mu.fqxo[145] = -432128164;
        mu.fqxo[146] = 559175858;
        mu.fqxo[147] = 774806814;
        mu.fqxo[148] = 968207576;
        mu.fqxo[149] = 1120645986;
        mu.fqxo[150] = 1018115432;
        mu.fqxo[151] = -556774877;
        mu.fqxo[152] = 255691564;
        mu.fqxo[153] = -2066043389;
        mu.fqxo[154] = 1934814071;
        mu.fqxo[155] = 121238370;
        mu.fqxo[156] = 1147714418;
        mu.fqxo[157] = -826132994;
        mu.fqxo[158] = -1664533224;
        mu.fqxo[159] = -355166371;
        mu.fqxo[160] = 238526668;
        mu.fqxo[161] = -763829084;
        mu.fqxo[162] = 965508926;
        mu.fqxo[163] = 1104365134;
        mu.fqxo[164] = 856090392;
        mu.fqxo[165] = -519252777;
        mu.fqxo[166] = -92214312;
        mu.fqxo[167] = -1447728381;
        mu.fqxo[168] = -1742276387;
        mu.fqxo[169] = 868969040;
        mu.fqxo[170] = 887280748;
        mu.fqxo[171] = -1202954496;
        mu.fqxo[172] = -455126413;
        mu.fqxo[173] = 1548385320;
        mu.fqxo[174] = 1798918711;
        mu.fqxo[175] = 48848700;
    }

    static {
        fqxn = new int[176];
        fqxo = new int[176];
        mu.fror();
        mu.frot();
        mu.frov();
        mu.frox();
        fqxv = new long[139];
        fqxw = new long[139];
        mu.froz();
        mu.frpb();
        mu.frpd();
        mu.frpf();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("fqxx", fqxu(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mu.fqxp("fqxy", fqxm(int ), (int)4)) break;
            v0 /* !! */  = (long)mu.fqxp("fqya", fqxm(int ), (int)5);
        }
        var3_1 = mu.c;
        v1 /* !! */  = mu.mv;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(mu.fqxp("fqyd", fqxu(int ), (int)2) - mu.fqxp("fqyc", fqxu(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -927414668: {
                    break block17;
                }
                case 683394215: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = mu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("fqye", fqxu(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mu.fqxp("fqyf", fqxm(int ), (int)6)) break;
            v2 /* !! */  = (long)mu.fqxp("fqyg", fqxm(int ), (int)7);
        }
        var1_3 = mu.a;
        if (var3_1) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v3 /* !! */  = mu.mv;
                if (true) ** GOTO lbl36
                block20: while (true) {
                    v3 /* !! */  = (long)(mu.fqxp("fqym", fqxu(int ), (int)5) - mu.fqxp("fqyh", fqxu(int ), (int)4));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1503221822: {
                            continue block20;
                        }
                        case -927414668: {
                            break block20;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("fqyp", fqxu(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == mu.fqxp("fqyr", fqxm(int ), (int)8)) break;
                    v4 /* !! */  = (long)mu.fqxp("fqys", fqxm(int ), (int)9);
                }
                this.counter.resetCounter();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl50:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mu.fqxp("fqyt", fqxm(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mu.fqxp("fqyu", fqxm(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mu.fqxp("fqyv", fqxm(int ), (int)12);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl63:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("fqzc", fqxm(int ), (int)13);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)mu.fqxp("fqze", fqxm(int ), (int)14);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("fqzf", fqxm(int ), (int)15);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDone() {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(mu.fqxp("frak", fqxu(int ), (int)12) - mu.fqxp("frah", fqxu(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -927414668: {
                    break block21;
                }
                case 991076769: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = mu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("fral", fqxu(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mu.fqxp("fram", fqxm(int ), (int)24)) break;
            v1 /* !! */  = (long)mu.fqxp("frap", fqxm(int ), (int)25);
        }
        var2_2 /* !! */  = mu.b;
        v2 /* !! */  = mu.mv;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - mu.fqxp("frar", fqxu(int ), (int)14));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -927414668: {
                    break block23;
                }
                case 876648754: {
                    v3 = mu.fqxp("frat", fqxu(int ), (int)15);
                    continue block23;
                }
                case 1451319884: {
                    v3 = mu.fqxp("frav", fqxu(int ), (int)16);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = mu.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)mu.fqxp("frax", fqxm(int ), (int)26);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("fraz", fqxu(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mu.fqxp("frbb", fqxm(int ), (int)27)) break;
                    v4 /* !! */  = (long)mu.fqxp("frbd", fqxm(int ), (int)28);
                }
                v5 /* !! */  = mu.mv;
                if (true) ** GOTO lbl50
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - mu.fqxp("frbe", fqxu(int ), (int)18));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1568482526: {
                            v6 = mu.fqxp("frbg", fqxu(int ), (int)19);
                            continue block26;
                        }
                        case -927414668: {
                            break block26;
                        }
                        case 343263835: {
                            v6 = mu.fqxp("frbi", fqxu(int ), (int)20);
                            continue block26;
                        }
                        case 1767808856: {
                            v6 = mu.fqxp("frbj", fqxu(int ), (int)21);
                            continue block26;
                        }
                    }
                    break;
                }
                v7 = this.ms;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frbl", fqxu(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == mu.fqxp("frbn", fqxm(int ), (int)29)) break;
                    v8 /* !! */  = (long)mu.fqxp("frbp", fqxm(int ), (int)30);
                }
                return this.counter.isReached(v7);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)mu.fqxp("frbq", fqxm(int ), (int)31);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mu.fqxp("frbt", fqxm(int ), (int)32);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("frbv", fqxm(int ), (int)33);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("frbw", fqxm(int ), (int)34);
        ** while (!var3_1)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected double endValue() {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(mu.fqxp("frlv", fqxu(int ), (int)104) - mu.fqxp("frlu", fqxu(int ), (int)103));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -927414668: {
                    break block39;
                }
                case 1851109998: {
                    continue block39;
                }
            }
            break;
        }
        var3_1 = mu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frlw", fqxu(int ), (int)105)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mu.fqxp("frlx", fqxm(int ), (int)143)) break;
            v1 /* !! */  = (long)mu.fqxp("frly", fqxm(int ), (int)144);
        }
        var2_2 /* !! */  = mu.b;
        v2 /* !! */  = mu.mv;
        if (true) ** GOTO lbl22
        block41: while (true) {
            v2 /* !! */  = (long)(mu.fqxp("frma", fqxu(int ), (int)107) - mu.fqxp("frlz", fqxu(int ), (int)106));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -927414668: {
                    break block41;
                }
                case 2041495141: {
                    continue block41;
                }
            }
            break;
        }
        var1_3 = mu.a;
        if (var3_1) {
            throw null;
lbl30:
            // 3 sources

            return (double)mu.fqxp("frmc", frmb(int ), (int)108);
        }
        if (var1_3 || var1_3) ** GOTO lbl30
        v3 /* !! */  = mu.mv;
        if (true) ** GOTO lbl37
        block43: while (true) {
            v3 /* !! */  = (long)(mu.fqxp("frme", fqxu(int ), (int)110) - mu.fqxp("frmd", fqxu(int ), (int)109));
lbl37:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -927414668: {
                    break block43;
                }
                case 352556475: {
                    continue block43;
                }
            }
            break;
        }
        if (!this.isDone()) ** GOTO lbl67
        if (var1_3 || var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mu.mv;
                if (true) ** GOTO lbl51
                block44: while (true) {
                    v4 /* !! */  = (long)(v5 - mu.fqxp("frmf", fqxu(int ), (int)111));
lbl51:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -927414668: {
                            break block44;
                        }
                        case -889282439: {
                            v5 = mu.fqxp("frmg", fqxu(int ), (int)112);
                            continue block44;
                        }
                        case 516583509: {
                            v5 = mu.fqxp("frmh", fqxu(int ), (int)113);
                            continue block44;
                        }
                        case 1264903818: {
                            v5 = mu.fqxp("frmi", fqxu(int ), (int)114);
                            continue block44;
                        }
                    }
                    break;
                }
                v6 = this.value;
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl67:
            // 1 sources

            if (var1_3 || var1_3) ** continue;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frmk", fqxu(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == mu.fqxp("frml", fqxm(int ), (int)145)) break;
                v7 /* !! */  = (long)mu.fqxp("frmm", fqxm(int ), (int)146);
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frmn", fqxu(int ), (int)116)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == mu.fqxp("frmo", fqxm(int ), (int)147)) break;
                v8 /* !! */  = (long)mu.fqxp("frmp", fqxm(int ), (int)148);
            }
            v9 = this.counter.getTime();
            v10 /* !! */  = mu.mv;
            if (true) ** GOTO lbl85
            block47: while (true) {
                v10 /* !! */  = (long)(mu.fqxp("frmr", fqxu(int ), (int)118) - mu.fqxp("frmq", fqxu(int ), (int)117));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -927414668: {
                        break block47;
                    }
                    case -13457786: {
                        continue block47;
                    }
                }
                break;
            }
            v11 = this.calculation(v9);
            v12 /* !! */  = mu.mv;
            if (true) ** GOTO lbl95
            block48: while (true) {
                v12 /* !! */  = (long)(v13 - mu.fqxp("frms", fqxu(int ), (int)119));
lbl95:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1159212478: {
                        v13 = mu.fqxp("frmt", fqxu(int ), (int)120);
                        continue block48;
                    }
                    case -1126407290: {
                        v13 = mu.fqxp("frmu", fqxu(int ), (int)121);
                        continue block48;
                    }
                    case -927414668: {
                        break block48;
                    }
                    case 965841550: {
                        v13 = mu.fqxp("frmv", fqxu(int ), (int)122);
                        continue block48;
                    }
                }
                break;
            }
            v6 = v11 * this.value;
lbl108:
            // 2 sources

            return v6;
            case 0: {
                var2_2 /* !! */  = (int)mu.fqxp("frmw", fqxm(int ), (int)149);
                if (var3_1) {
                    throw null;
                }
            }
lbl113:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)mu.fqxp("frmx", fqxm(int ), (int)150);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 2: {
                var2_2 /* !! */  = (int)mu.fqxp("frmy", fqxm(int ), (int)151);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl122:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mu.fqxp("frna", fqxm(int ), (int)152);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)mu.fqxp("frnb", fqxm(int ), (int)153);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)mu.fqxp("frnc", fqxm(int ), (int)154);
                } while (!var3_1);
                throw null;
            }
lbl135:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)mu.fqxp("frnd", fqxm(int ), (int)155);
                if (!var3_1) break;
                throw null;
            }
lbl139:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("frne", fqxm(int ), (int)156);
                    if (!var3_1) ** GOTO lbl135
                    throw null;
                }
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("frnf", fqxm(int ), (int)157);
        ** while (!var3_1)
lbl147:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void froz() {
        mu.fqxv[0] = 4178395662388432425L;
        mu.fqxv[1] = 8483358239363609284L;
        mu.fqxv[2] = 5860124822980105566L;
        mu.fqxv[3] = 7721878627074302324L;
        mu.fqxv[4] = -4245815221200699942L;
        mu.fqxv[5] = -2876714569352600650L;
        mu.fqxv[6] = 649150717269493144L;
        mu.fqxv[7] = -4936823171037797703L;
        mu.fqxv[8] = 1139174524830925874L;
        mu.fqxv[9] = 1429884846108220293L;
        mu.fqxv[10] = 2596827825058570400L;
        mu.fqxv[11] = 1233818635344190110L;
        mu.fqxv[12] = 5641115375480685392L;
        mu.fqxv[13] = -3029189721246733407L;
        mu.fqxv[14] = -9063457595297528318L;
        mu.fqxv[15] = -8898142449822187270L;
        mu.fqxv[16] = 689618104826058730L;
        mu.fqxv[17] = 1787031335379279906L;
        mu.fqxv[18] = -2044556082031377805L;
        mu.fqxv[19] = -7569430057534651998L;
        mu.fqxv[20] = -7076071877903438257L;
        mu.fqxv[21] = -5144133694948209435L;
        mu.fqxv[22] = 2271429930144105619L;
        mu.fqxv[23] = -6524025552034237417L;
        mu.fqxv[24] = -4239162216061027486L;
        mu.fqxv[25] = -4182164941831734104L;
        mu.fqxv[26] = 1779372157422944715L;
        mu.fqxv[27] = -8887708281570374794L;
        mu.fqxv[28] = -8487112639143966485L;
        mu.fqxv[29] = 5590075102561883600L;
        mu.fqxv[30] = -13650782552387624L;
        mu.fqxv[31] = -6503263943869037301L;
        mu.fqxv[32] = -6117059803823862922L;
        mu.fqxv[33] = 7419606176560319703L;
        mu.fqxv[34] = 3309641392217329448L;
        mu.fqxv[35] = 4809616625544302923L;
        mu.fqxv[36] = -2356509302606220339L;
        mu.fqxv[37] = 1911813571711529008L;
        mu.fqxv[38] = 4053660711767073903L;
        mu.fqxv[39] = 8534907475015983335L;
        mu.fqxv[40] = 5846055859082421282L;
        mu.fqxv[41] = 7241440593125248075L;
        mu.fqxv[42] = -9043919433751823191L;
        mu.fqxv[43] = 8179853914668949319L;
        mu.fqxv[44] = 988589434881481930L;
        mu.fqxv[45] = 7955267233628785870L;
        mu.fqxv[46] = -3322579365818467672L;
        mu.fqxv[47] = -5259367331657601201L;
        mu.fqxv[48] = 8261218809457056718L;
        mu.fqxv[49] = 5716029043496018677L;
        mu.fqxv[50] = -1805700715928684058L;
        mu.fqxv[51] = 3715902691778339917L;
        mu.fqxv[52] = -2619061343157720317L;
        mu.fqxv[53] = -8132143762581325510L;
        mu.fqxv[54] = -4956146872648708540L;
        mu.fqxv[55] = -8381183063941640935L;
        mu.fqxv[56] = -3466770696149621443L;
        mu.fqxv[57] = 4790640886525018185L;
        mu.fqxv[58] = -8219460090707656521L;
        mu.fqxv[59] = 8874023557881543955L;
        mu.fqxv[60] = 52857891704418120L;
        mu.fqxv[61] = -4871278569057108935L;
        mu.fqxv[62] = 2698376595807278551L;
        mu.fqxv[63] = 4577841558138190615L;
        mu.fqxv[64] = 1460250217567758756L;
        mu.fqxv[65] = -718349952540750954L;
        mu.fqxv[66] = 8192579995990227623L;
        mu.fqxv[67] = 6405775627026070534L;
        mu.fqxv[68] = 191279983735125993L;
        mu.fqxv[69] = 1783609428550849793L;
        mu.fqxv[70] = 5606239398103370464L;
        mu.fqxv[71] = 1601200734116756349L;
        mu.fqxv[72] = -9157605252777717140L;
        mu.fqxv[73] = -1566896561691712709L;
        mu.fqxv[74] = 9194931942120067516L;
        mu.fqxv[75] = -6989375475505365889L;
        mu.fqxv[76] = -8844449044932984904L;
        mu.fqxv[77] = 3795904303351043788L;
        mu.fqxv[78] = -1970440003426278785L;
        mu.fqxv[79] = -2932767856899210179L;
        mu.fqxv[80] = -2146265749944821817L;
        mu.fqxv[81] = -704121946459390900L;
        mu.fqxv[82] = 2284440051178968123L;
        mu.fqxv[83] = -4528566565510138843L;
        mu.fqxv[84] = -4436438246692407527L;
        mu.fqxv[85] = -5127147187254769059L;
        mu.fqxv[86] = 8292598468592792403L;
        mu.fqxv[87] = 1939051496486851279L;
        mu.fqxv[88] = 2806322618113344859L;
        mu.fqxv[89] = 629527065208208751L;
        mu.fqxv[90] = 3001029802369385328L;
        mu.fqxv[91] = 8501574938907616906L;
        mu.fqxv[92] = 4561036138614953466L;
        mu.fqxv[93] = -6267659007658833882L;
        mu.fqxv[94] = 2799227632633324886L;
        mu.fqxv[95] = 3015850764291368809L;
        mu.fqxv[96] = 7872612588399638985L;
        mu.fqxv[97] = 8612973552535503795L;
        mu.fqxv[98] = -3744208562838570741L;
        mu.fqxv[99] = -1326846542852748842L;
    }

    private static /* synthetic */ void frov() {
        mu.fqxo[0] = -1959240646;
        mu.fqxo[1] = 1772497440;
        mu.fqxo[2] = 81873327;
        mu.fqxo[3] = -237969705;
        mu.fqxo[4] = -1917905453;
        mu.fqxo[5] = 878102721;
        mu.fqxo[6] = 1237216995;
        mu.fqxo[7] = 1720385888;
        mu.fqxo[8] = -962012537;
        mu.fqxo[9] = 633891298;
        mu.fqxo[10] = 670361487;
        mu.fqxo[11] = -1909253639;
        mu.fqxo[12] = 1044042652;
        mu.fqxo[13] = -213366204;
        mu.fqxo[14] = 329594384;
        mu.fqxo[15] = 1582747426;
        mu.fqxo[16] = -710593507;
        mu.fqxo[17] = 1758087593;
        mu.fqxo[18] = 1866963144;
        mu.fqxo[19] = 1453731477;
        mu.fqxo[20] = 97746514;
        mu.fqxo[21] = 595309755;
        mu.fqxo[22] = -875478815;
        mu.fqxo[23] = 1997108112;
        mu.fqxo[24] = -1025141399;
        mu.fqxo[25] = -333098106;
        mu.fqxo[26] = 637591375;
        mu.fqxo[27] = 308703412;
        mu.fqxo[28] = 1793105883;
        mu.fqxo[29] = -1713855673;
        mu.fqxo[30] = -2004369202;
        mu.fqxo[31] = -582750227;
        mu.fqxo[32] = -1583524544;
        mu.fqxo[33] = 2129073890;
        mu.fqxo[34] = -841845120;
        mu.fqxo[35] = -1771214296;
        mu.fqxo[36] = -321030956;
        mu.fqxo[37] = -1709873782;
        mu.fqxo[38] = -895664791;
        mu.fqxo[39] = 820486155;
        mu.fqxo[40] = -1296984906;
        mu.fqxo[41] = -1605078048;
        mu.fqxo[42] = -1039509790;
        mu.fqxo[43] = 1486544017;
        mu.fqxo[44] = -1962441566;
        mu.fqxo[45] = -1247491718;
        mu.fqxo[46] = 451318169;
        mu.fqxo[47] = 1849457615;
        mu.fqxo[48] = -86710793;
        mu.fqxo[49] = 1303489357;
        mu.fqxo[50] = -952082684;
        mu.fqxo[51] = 1744953408;
        mu.fqxo[52] = -851969583;
        mu.fqxo[53] = 1458583274;
        mu.fqxo[54] = 1963854271;
        mu.fqxo[55] = 1656545430;
        mu.fqxo[56] = 1161816332;
        mu.fqxo[57] = 1601451588;
        mu.fqxo[58] = -1798048744;
        mu.fqxo[59] = -825403532;
        mu.fqxo[60] = 1897627014;
        mu.fqxo[61] = -784816224;
        mu.fqxo[62] = 1770317006;
        mu.fqxo[63] = -1332416739;
        mu.fqxo[64] = -1591405108;
        mu.fqxo[65] = 921081987;
        mu.fqxo[66] = 1691289100;
        mu.fqxo[67] = 848836644;
        mu.fqxo[68] = -434275962;
        mu.fqxo[69] = -1033254230;
        mu.fqxo[70] = 2016524404;
        mu.fqxo[71] = 1254097201;
        mu.fqxo[72] = 2131708112;
        mu.fqxo[73] = 587173085;
        mu.fqxo[74] = -1867828397;
        mu.fqxo[75] = -906093660;
        mu.fqxo[76] = -905203037;
        mu.fqxo[77] = 1198052620;
        mu.fqxo[78] = 180859864;
        mu.fqxo[79] = 1890411690;
        mu.fqxo[80] = -1616271280;
        mu.fqxo[81] = -1824969760;
        mu.fqxo[82] = 246206828;
        mu.fqxo[83] = 1260280300;
        mu.fqxo[84] = -45947897;
        mu.fqxo[85] = -909743521;
        mu.fqxo[86] = -564037367;
        mu.fqxo[87] = 1234218517;
        mu.fqxo[88] = -1833097623;
        mu.fqxo[89] = -1691030804;
        mu.fqxo[90] = -829992077;
        mu.fqxo[91] = -201964373;
        mu.fqxo[92] = 165936486;
        mu.fqxo[93] = 1335900417;
        mu.fqxo[94] = -311216358;
        mu.fqxo[95] = -1349496923;
        mu.fqxo[96] = -1142568702;
        mu.fqxo[97] = 538559993;
        mu.fqxo[98] = -948930894;
        mu.fqxo[99] = 941843270;
    }

    private static /* synthetic */ int fqxm(int n2) {
        return fqxn[n2] ^ fqxo[n2];
    }

    public static /* synthetic */ CallSite fqxp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void frpf() {
        mu.fqxw[100] = 4563930747629882654L;
        mu.fqxw[101] = 4223655660760548304L;
        mu.fqxw[102] = -4237565888907573946L;
        mu.fqxw[103] = 5653625985736537922L;
        mu.fqxw[104] = -5903546515513627241L;
        mu.fqxw[105] = -4355554762046070033L;
        mu.fqxw[106] = -2543871359422297512L;
        mu.fqxw[107] = 4959560038662656899L;
        mu.fqxw[108] = -5379003497928280267L;
        mu.fqxw[109] = -2849171725320582020L;
        mu.fqxw[110] = -8964349116505864482L;
        mu.fqxw[111] = -1322322118583697477L;
        mu.fqxw[112] = 4162615655113849634L;
        mu.fqxw[113] = 7007503790148941046L;
        mu.fqxw[114] = 812161281829897303L;
        mu.fqxw[115] = -5685957207547386198L;
        mu.fqxw[116] = 1139622051066452887L;
        mu.fqxw[117] = -2957385496871787665L;
        mu.fqxw[118] = -1405052667391090252L;
        mu.fqxw[119] = -8028617941177767223L;
        mu.fqxw[120] = 710372993673100171L;
        mu.fqxw[121] = -5976767031507363237L;
        mu.fqxw[122] = -2300484145844914611L;
        mu.fqxw[123] = -7999710958402227280L;
        mu.fqxw[124] = -6608693191151571855L;
        mu.fqxw[125] = -6362050274916923566L;
        mu.fqxw[126] = -2248737186402719667L;
        mu.fqxw[127] = 1504626289838147864L;
        mu.fqxw[128] = -8414300975273777913L;
        mu.fqxw[129] = -1642201530961794170L;
        mu.fqxw[130] = -1791111325628526281L;
        mu.fqxw[131] = 4151286696202983504L;
        mu.fqxw[132] = 2177736914738000126L;
        mu.fqxw[133] = 181293367188925924L;
        mu.fqxw[134] = 2234261398267204807L;
        mu.fqxw[135] = 4935908356114166974L;
        mu.fqxw[136] = 8747769913081839692L;
        mu.fqxw[137] = -7242451936147224855L;
        mu.fqxw[138] = -8960617439904845316L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDirection(mx var1_1) {
        block29: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frhg", fqxu(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == mu.fqxp("frhh", fqxm(int ), (int)74)) break;
                v0 /* !! */  = (long)mu.fqxp("frhi", fqxm(int ), (int)75);
            }
            var4_2 = mu.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frhj", fqxu(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == mu.fqxp("frhk", fqxm(int ), (int)76)) break;
                v1 /* !! */  = (long)mu.fqxp("frhl", fqxm(int ), (int)77);
            }
            var3_3 /* !! */  = mu.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frhm", fqxu(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == mu.fqxp("frhn", fqxm(int ), (int)78)) break;
                v2 /* !! */  = (long)mu.fqxp("frho", fqxm(int ), (int)79);
            }
            var2_4 = mu.a;
            if (var4_2) {
                throw null;
lbl24:
                // 4 sources

                return (boolean)mu.fqxp("frhq", fqxm(int ), (int)80);
            }
            if (var2_4 || var2_4) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = mu.mv - mu.fqxp("frhr", fqxu(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == mu.fqxp("frhs", fqxm(int ), (int)81)) break;
                v3 /* !! */  = (long)mu.fqxp("frht", fqxm(int ), (int)82);
            }
            if (this.direction != var1_1) break block29;
            if (var2_4) ** GOTO lbl24
            v4 = mu.fqxp("frhu", fqxm(int ), (int)83);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl47
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                v4 = mu.fqxp("frhv", fqxm(int ), (int)84);
lbl47:
                // 2 sources

                return (boolean)v4;
            }
lbl48:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mu.fqxp("frhw", fqxm(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl53:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)mu.fqxp("frhx", fqxm(int ), (int)86);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)mu.fqxp("frhy", fqxm(int ), (int)87);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)mu.fqxp("frhz", fqxm(int ), (int)88);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl68:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)mu.fqxp("fria", fqxm(int ), (int)89);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
lbl72:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)mu.fqxp("frib", fqxm(int ), (int)90);
                } while (!var4_2);
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mu.fqxp("fric", fqxm(int ), (int)91);
                    if (!var4_2) ** GOTO lbl53
                    throw null;
                }
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)mu.fqxp("frid", fqxm(int ), (int)92);
        ** while (!var4_2)
lbl85:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void update() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("fqzg", fqxu(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mu.fqxp("fqzh", fqxm(int ), (int)16)) break;
            v0 /* !! */  = (long)mu.fqxp("fqzj", fqxm(int ), (int)17);
        }
        var3_1 = mu.c;
        v1 /* !! */  = mu.mv;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(mu.fqxp("fqzr", fqxu(int ), (int)9) - mu.fqxp("fqzl", fqxu(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1098550523: {
                    continue block11;
                }
                case -927414668: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = mu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("fqzs", fqxu(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mu.fqxp("fqzt", fqxm(int ), (int)18)) break;
            v2 /* !! */  = (long)mu.fqxp("fqzu", fqxm(int ), (int)19);
        }
        var1_3 = mu.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("fqzx", fqxm(int ), (int)20);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl40:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mu.fqxp("fqzz", fqxm(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mu.fqxp("fraa", fqxm(int ), (int)22);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("frab", fqxm(int ), (int)23);
        ** while (!var3_1)
lbl51:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fqxu(int n2) {
        return fqxv[n2] ^ fqxw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void adjustTimer() {
        v0 /* !! */  = mu.mv;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(mu.fqxp("frif", fqxu(int ), (int)66) - mu.fqxp("frie", fqxu(int ), (int)65));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -927414668: {
                    break block28;
                }
                case 1214816307: {
                    continue block28;
                }
            }
            break;
        }
        var3_1 = mu.c;
        v1 /* !! */  = mu.mv;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - mu.fqxp("frig", fqxu(int ), (int)67));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -927414668: {
                    break block29;
                }
                case -101063641: {
                    v2 = mu.fqxp("frih", fqxu(int ), (int)68);
                    continue block29;
                }
                case 1376919378: {
                    v2 = mu.fqxp("frii", fqxu(int ), (int)69);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = mu.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mu.mv;
                if (true) ** GOTO lbl32
                block30: while (true) {
                    v3 /* !! */  = (long)(v4 - mu.fqxp("frij", fqxu(int ), (int)70));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -927414668: {
                            break block30;
                        }
                        case 293409817: {
                            v4 = mu.fqxp("fril", fqxu(int ), (int)71);
                            continue block30;
                        }
                        case 1694890861: {
                            v4 = mu.fqxp("frim", fqxu(int ), (int)72);
                            continue block30;
                        }
                    }
                    break;
                }
                var1_3 = mu.a;
                if (var3_1) {
                    throw null;
lbl44:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mu.mv - mu.fqxp("frin", fqxu(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mu.fqxp("frio", fqxm(int ), (int)93)) break;
                    v5 /* !! */  = (long)mu.fqxp("frip", fqxm(int ), (int)94);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("friq", fqxu(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mu.fqxp("frir", fqxm(int ), (int)95)) break;
                    v6 /* !! */  = (long)mu.fqxp("fris", fqxm(int ), (int)96);
                }
                v7 = System.currentTimeMillis();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frit", fqxu(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mu.fqxp("friu", fqxm(int ), (int)97)) break;
                    v8 /* !! */  = (long)mu.fqxp("friv", fqxm(int ), (int)98);
                }
                v9 = this.ms;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = mu.mv - mu.fqxp("friw", fqxu(int ), (int)76)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mu.fqxp("frix", fqxm(int ), (int)99)) break;
                    v10 /* !! */  = (long)mu.fqxp("friy", fqxm(int ), (int)100);
                }
                v11 = this.ms;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = mu.mv - mu.fqxp("friz", fqxu(int ), (int)77)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == mu.fqxp("frja", fqxm(int ), (int)101)) break;
                    v12 /* !! */  = (long)mu.fqxp("frjb", fqxm(int ), (int)102);
                }
                v13 /* !! */  = mu.mv;
                if (true) ** GOTO lbl79
                block37: while (true) {
                    v13 /* !! */  = (long)(v14 - mu.fqxp("frjc", fqxu(int ), (int)78));
lbl79:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -927414668: {
                            break block37;
                        }
                        case -376088876: {
                            v14 = mu.fqxp("frjd", fqxu(int ), (int)79);
                            continue block37;
                        }
                        case 385098819: {
                            v14 = mu.fqxp("frjf", fqxu(int ), (int)80);
                            continue block37;
                        }
                        case 1463084228: {
                            v14 = mu.fqxp("frjg", fqxu(int ), (int)81);
                            continue block37;
                        }
                    }
                    break;
                }
                v15 = this.counter.getTime();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = mu.mv - mu.fqxp("frjh", fqxu(int ), (int)82)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == mu.fqxp("frji", fqxm(int ), (int)103)) break;
                    v16 /* !! */  = (long)mu.fqxp("frjj", fqxm(int ), (int)104);
                }
                v17 = v7 - (v9 - Math.min(v11, v15));
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = mu.mv - mu.fqxp("frjk", fqxu(int ), (int)83)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == mu.fqxp("frjl", fqxm(int ), (int)105)) break;
                    v18 /* !! */  = (long)mu.fqxp("frjm", fqxm(int ), (int)106);
                }
                this.counter.setTime(v17);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl106:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mu.fqxp("frjn", fqxm(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 1: {
                var2_2 /* !! */  = (int)mu.fqxp("frjo", fqxm(int ), (int)108);
                if (!var3_1) ** GOTO lbl106
                throw null;
            }
lbl115:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)mu.fqxp("frjp", fqxm(int ), (int)109);
                if (!var3_1) ** GOTO lbl106
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)mu.fqxp("frjq", fqxm(int ), (int)110);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mu.fqxp("frjr", fqxm(int ), (int)111);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)mu.fqxp("frjs", fqxm(int ), (int)112);
        ** while (!var3_1)
lbl131:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mu() {
        var2_1 /* !! */  = mu.b;
        super();
        this.counter = new ps();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.direction = mx.FORWARDS;
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)mu.fqxp("fqxq", fqxm(int ), (int)0);
                ** GOTO lbl15
            }
            case 1: {
                var2_1 /* !! */  = (int)mu.fqxp("fqxr", fqxm(int ), (int)1);
                break;
            }
lbl15:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)mu.fqxp("fqxs", fqxm(int ), (int)2);
                    break;
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)mu.fqxp("fqxt", fqxm(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void frpb() {
        mu.fqxv[100] = 7966218161874954067L;
        mu.fqxv[101] = -8324334950753200471L;
        mu.fqxv[102] = 3869733420489043327L;
        mu.fqxv[103] = -2711244738580545214L;
        mu.fqxv[104] = -5509409138070596954L;
        mu.fqxv[105] = -8065688522739999741L;
        mu.fqxv[106] = 1531960164027590572L;
        mu.fqxv[107] = -5632302123773292437L;
        mu.fqxv[108] = -8439433871262344955L;
        mu.fqxv[109] = 6688307488792611226L;
        mu.fqxv[110] = -3044699740866960868L;
        mu.fqxv[111] = -233666225685639859L;
        mu.fqxv[112] = 2849576758200755036L;
        mu.fqxv[113] = 2661106285028274723L;
        mu.fqxv[114] = 4728827566817294176L;
        mu.fqxv[115] = 3766097050438680876L;
        mu.fqxv[116] = -6291640471964457469L;
        mu.fqxv[117] = -5203316594443117410L;
        mu.fqxv[118] = 2560258386973670059L;
        mu.fqxv[119] = -2642965927308413114L;
        mu.fqxv[120] = 8648968268076732722L;
        mu.fqxv[121] = -6627901192000561913L;
        mu.fqxv[122] = -1663758907845568513L;
        mu.fqxv[123] = -7672812031231794168L;
        mu.fqxv[124] = -8617160382038908667L;
        mu.fqxv[125] = -4674332321009969539L;
        mu.fqxv[126] = -1615872048917169138L;
        mu.fqxv[127] = 2618568908426713911L;
        mu.fqxv[128] = 4458320114511105711L;
        mu.fqxv[129] = -5367230666940207232L;
        mu.fqxv[130] = -8924597055253533549L;
        mu.fqxv[131] = 3433329532775555776L;
        mu.fqxv[132] = -5066919676424446353L;
        mu.fqxv[133] = 8215403815709867755L;
        mu.fqxv[134] = -582654565281813853L;
        mu.fqxv[135] = 2631333537999598200L;
        mu.fqxv[136] = 5874651247502565409L;
        mu.fqxv[137] = -3231847617794443265L;
        mu.fqxv[138] = 7759426699869977687L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isFinished(mx var1_1) {
        block49: {
            block52: {
                while (true) {
                    block50: {
                        if ((v0 /* !! */  = (cfr_temp_1 = mu.mv - mu.fqxp("frca", fqxu(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  != mu.fqxp("frcb", fqxm(int ), (int)35)) break block50;
                        var4_2 = mu.c;
                        v1 /* !! */  = mu.mv;
                        if (true) ** GOTO lbl13
                    }
                    v0 /* !! */  = (long)mu.fqxp("frcc", fqxm(int ), (int)36);
                }
                block30: while (true) {
                    v1 /* !! */  = (long)(v2 - mu.fqxp("frce", fqxu(int ), (int)24));
lbl13:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -927414668: {
                            break block30;
                        }
                        case -521593024: {
                            v2 = mu.fqxp("frcg", fqxu(int ), (int)25);
                            continue block30;
                        }
                        case 548931672: {
                            v2 = mu.fqxp("frcl", fqxu(int ), (int)26);
                            continue block30;
                        }
                        case 1243146855: {
                            v2 = mu.fqxp("frcm", fqxu(int ), (int)27);
                            continue block30;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = mu.b;
                v3 /* !! */  = mu.mv;
                if (true) ** GOTO lbl30
                block31: while (true) {
                    v3 /* !! */  = (long)(v4 - mu.fqxp("frcn", fqxu(int ), (int)28));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -927414668: {
                            break block31;
                        }
                        case -506889267: {
                            v4 = mu.fqxp("frco", fqxu(int ), (int)29);
                            continue block31;
                        }
                        case 1068200477: {
                            v4 = mu.fqxp("frcp", fqxu(int ), (int)30);
                            continue block31;
                        }
                        case 1566920466: {
                            v4 = mu.fqxp("frcq", fqxu(int ), (int)31);
                            continue block31;
                        }
                    }
                    break;
                }
                var2_4 = mu.a;
                if (var4_2) {
                    throw null;
                }
                if (var2_4 || var2_4) return (boolean)mu.fqxp("frcr", fqxm(int ), (int)37);
                while (true) {
                    block51: {
                        if ((v5 /* !! */  = (cfr_temp_2 = mu.mv - mu.fqxp("frcv", fqxu(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  != mu.fqxp("frcw", fqxm(int ), (int)38)) break block51;
                        if (this.direction == var1_1) {
                            break;
                        }
                        ** GOTO lbl83
                    }
                    v5 /* !! */  = (long)mu.fqxp("frcx", fqxm(int ), (int)39);
                }
                if (var2_4) return (boolean)mu.fqxp("frcr", fqxm(int ), (int)37);
                v6 /* !! */  = mu.mv;
                if (true) ** GOTO lbl61
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - mu.fqxp("frcz", fqxu(int ), (int)33));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1685861661: {
                            v7 = mu.fqxp("frdb", fqxu(int ), (int)34);
                            continue block33;
                        }
                        case -927414668: {
                            break block33;
                        }
                        case -479351173: {
                            v7 = mu.fqxp("frdc", fqxu(int ), (int)35);
                            continue block33;
                        }
                        case 1306680271: {
                            v7 = mu.fqxp("frdd", fqxu(int ), (int)36);
                            continue block33;
                        }
                    }
                    break;
                }
                if (!this.isDone()) ** GOTO lbl83
                if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl76:
                // 2 sources

                block34: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var2_4) return (boolean)mu.fqxp("frcr", fqxm(int ), (int)37);
                            v8 = mu.fqxp("frdg", fqxm(int ), (int)40);
                            if (!var4_2) return (boolean)v8;
                            throw null;
                        }
lbl83:
                        // 2 sources

                        if (var2_4 || var2_4) {
                            return (boolean)mu.fqxp("frcr", fqxm(int ), (int)37);
                        }
                        v8 = mu.fqxp("frdi", fqxm(int ), (int)41);
                        return (boolean)v8;
                        case 0: {
                            do {
                                var3_3 /* !! */  = (int)mu.fqxp("frdj", fqxm(int ), (int)42);
                            } while (!var4_2);
                            throw null;
                        }
                        case 1: {
                            var3_3 /* !! */  = (int)mu.fqxp("frdl", fqxm(int ), (int)43);
                            cfr_temp_0 = 5;
                            if (!var4_2) continue block34;
                            throw null;
                        }
                        case 2: {
                            var3_3 /* !! */  = (int)mu.fqxp("frdn", fqxm(int ), (int)44);
                            cfr_temp_0 = 6;
                            if (!var4_2) continue block34;
                            throw null;
                        }
                        case 5: {
                            do {
                                var3_3 /* !! */  = (int)mu.fqxp("frds", fqxm(int ), (int)47);
                            } while (!var4_2);
                            throw null;
                        }
                        case 6: {
                            var3_3 /* !! */  = (int)mu.fqxp("frdu", fqxm(int ), (int)48);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 3: {
                            ** break;
                        }
                        case 8: {
                            break block49;
                        }
lbl115:
                        // 2 sources

                        while (true) {
                            var3_3 /* !! */  = (int)mu.fqxp("frdp", fqxm(int ), (int)45);
                            cfr_temp_0 = 4;
                            if (!var4_2) continue block34;
                            throw null;
                        }
                        case 4: {
                            var3_3 /* !! */  = (int)mu.fqxp("frdr", fqxm(int ), (int)46);
                            if (var4_2) {
                                throw null;
                            }
                        }
                        case 7: 
                    }
                    break;
                }
                break block52;
                ** while (true)
            }
            var3_3 /* !! */  = (int)mu.fqxp("frdw", fqxm(int ), (int)49);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)mu.fqxp("frdy", fqxm(int ), (int)50);
        ** while (!var4_2)
lbl134:
        // 1 sources

        throw null;
    }
}

