/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class kd
extends jx {
    public static final int b;
    private static int[] livp;
    private float saturation;
    private int[] previousColors;
    private int[] presets;
    private float alpha;
    public static final boolean c;
    private int previousColorsCount;
    private float brightness;
    private static int[] livo;
    private float hue;
    private static long[] liwc;
    private static final long ty = 2976099198248600381L;
    private static long[] liwb;
    public static final boolean a;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kd setSaturation(float f2) {
        boolean bl2;
        Object object = ty;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kd.livq("ljfi", liwa(int ), (int)100);
            }
            switch ((int)object) {
                case -1727848055: {
                    callSite = kd.livq("ljfj", liwa(int ), (int)101);
                    continue block14;
                }
                case -980518977: {
                    callSite = kd.livq("ljfk", liwa(int ), (int)102);
                    continue block14;
                }
                case -403782851: {
                    break block14;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ty;
        boolean bl5 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - kd.livq("ljfl", liwa(int ), (int)103);
            }
            switch ((int)object2) {
                case -403782851: {
                    break block15;
                }
                case 263651605: {
                    callSite = kd.livq("ljfm", liwa(int ), (int)104);
                    continue block15;
                }
                case 378119601: {
                    callSite = kd.livq("ljfn", liwa(int ), (int)105);
                    continue block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ty - kd.livq("ljfo", liwa(int ), (int)106)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kd.livq("ljfp", livn(int ), (int)147)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kd.livq("ljfq", livn(int ), (int)148);
        }
        if (bl2 || bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ty - kd.livq("ljfr", liwa(int ), (int)107)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == kd.livq("ljfs", livn(int ), (int)149)) break;
            object4 = kd.livq("ljft", livn(int ), (int)150);
        }
        float f3 = Math.min(1.0f, f2);
        Object object5 = ty;
        block18: while (true) {
            switch ((int)object5) {
                case -403782851: {
                    break block18;
                }
                case 1684874762: {
                    object5 = kd.livq("ljfv", liwa(int ), (int)109) - kd.livq("ljfu", liwa(int ), (int)108);
                    continue block18;
                }
            }
            break;
        }
        float f4 = Math.max(0.0f, f3);
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = ty - kd.livq("ljfw", liwa(int ), (int)110)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == kd.livq("ljfx", livn(int ), (int)151)) {
                this.saturation = f4;
                if (bl2) return null;
                break;
            }
            object6 = kd.livq("ljfy", livn(int ), (int)152);
        }
        if (!bl2) return this;
        return null;
    }

    private static /* synthetic */ void ljrn() {
        kd.livp[200] = 1424588718;
        kd.livp[201] = 224592900;
        kd.livp[202] = 1986906045;
        kd.livp[203] = -2133465199;
        kd.livp[204] = -286466245;
        kd.livp[205] = 980299067;
        kd.livp[206] = -1508305353;
        kd.livp[207] = -1707518347;
        kd.livp[208] = 827575264;
        kd.livp[209] = -1657857000;
        kd.livp[210] = 1626098655;
        kd.livp[211] = 554532904;
        kd.livp[212] = 308948270;
        kd.livp[213] = 771339806;
        kd.livp[214] = 1761510793;
        kd.livp[215] = 1142831546;
        kd.livp[216] = 1620090100;
        kd.livp[217] = -925728849;
        kd.livp[218] = -185434397;
        kd.livp[219] = -337975687;
        kd.livp[220] = 1239842265;
        kd.livp[221] = 1541297461;
        kd.livp[222] = 859119483;
        kd.livp[223] = 1541109808;
        kd.livp[224] = -1221707537;
        kd.livp[225] = -202451466;
        kd.livp[226] = -1073288911;
        kd.livp[227] = 369451719;
        kd.livp[228] = 1807570233;
        kd.livp[229] = -324834743;
        kd.livp[230] = 1590175831;
        kd.livp[231] = 1866101671;
        kd.livp[232] = 1498345541;
        kd.livp[233] = 2034220221;
        kd.livp[234] = -2140534855;
        kd.livp[235] = -1945918616;
        kd.livp[236] = 1000503367;
        kd.livp[237] = 0x3434422;
        kd.livp[238] = 1499384182;
        kd.livp[239] = -1905032647;
        kd.livp[240] = 849436594;
        kd.livp[241] = 1195980317;
        kd.livp[242] = -1473345208;
        kd.livp[243] = -354919405;
        kd.livp[244] = -1607321055;
        kd.livp[245] = 1780605176;
        kd.livp[246] = -1343948860;
        kd.livp[247] = 1122609433;
        kd.livp[248] = -737045794;
        kd.livp[249] = -1373378797;
        kd.livp[250] = 1734413236;
        kd.livp[251] = 202362271;
        kd.livp[252] = -1821133388;
        kd.livp[253] = 1440601213;
        kd.livp[254] = 1850871057;
        kd.livp[255] = 1251564506;
        kd.livp[256] = -1113808461;
        kd.livp[257] = -2007087729;
        kd.livp[258] = 728713864;
        kd.livp[259] = 635548835;
        kd.livp[260] = -1902503148;
        kd.livp[261] = -1569646953;
        kd.livp[262] = 461335162;
        kd.livp[263] = -1005438187;
        kd.livp[264] = 1694556512;
        kd.livp[265] = 608413591;
        kd.livp[266] = -410492641;
        kd.livp[267] = 1037458478;
        kd.livp[268] = 1003060335;
        kd.livp[269] = -965758942;
        kd.livp[270] = 628425779;
        kd.livp[271] = -121623340;
        kd.livp[272] = 1210748481;
        kd.livp[273] = -2083409075;
        kd.livp[274] = 1147973446;
        kd.livp[275] = 1660980323;
        kd.livp[276] = -167673447;
        kd.livp[277] = 711012207;
        kd.livp[278] = 1519919584;
        kd.livp[279] = 1631395800;
        kd.livp[280] = 1846998259;
        kd.livp[281] = 2137645388;
        kd.livp[282] = 1193097120;
        kd.livp[283] = 1938646485;
        kd.livp[284] = -1270903439;
        kd.livp[285] = -659713428;
        kd.livp[286] = 618612727;
        kd.livp[287] = -1198219281;
        kd.livp[288] = -1145235048;
        kd.livp[289] = 1685973516;
        kd.livp[290] = 1222154124;
        kd.livp[291] = 330776355;
        kd.livp[292] = 178220051;
        kd.livp[293] = -1063157239;
        kd.livp[294] = -2130790514;
        kd.livp[295] = -1510070898;
        kd.livp[296] = -1708443426;
        kd.livp[297] = 134871178;
        kd.livp[298] = -889076730;
        kd.livp[299] = -1237393142;
    }

    private static /* synthetic */ void ljrp() {
        kd.liwb[0] = 372304071738346477L;
        kd.liwb[1] = 6118451987639289297L;
        kd.liwb[2] = 4886343257039205285L;
        kd.liwb[3] = -7840709485551620088L;
        kd.liwb[4] = 3908191890373501344L;
        kd.liwb[5] = -7995771264000869750L;
        kd.liwb[6] = -351523816867703343L;
        kd.liwb[7] = 6952941649098487853L;
        kd.liwb[8] = 37269812429751946L;
        kd.liwb[9] = 1843604930048433685L;
        kd.liwb[10] = -5897051548662878882L;
        kd.liwb[11] = -5257432147212590522L;
        kd.liwb[12] = -3046233257701613329L;
        kd.liwb[13] = -7193131415929697744L;
        kd.liwb[14] = -3206154417565625833L;
        kd.liwb[15] = 6898289449454329098L;
        kd.liwb[16] = 366676450575716175L;
        kd.liwb[17] = 1037453815200309107L;
        kd.liwb[18] = 8082207628423607930L;
        kd.liwb[19] = -323231777683674875L;
        kd.liwb[20] = 2579149216658925190L;
        kd.liwb[21] = -5646012054407436313L;
        kd.liwb[22] = -2324231989449821337L;
        kd.liwb[23] = -5644273479800798318L;
        kd.liwb[24] = 283710594975685341L;
        kd.liwb[25] = 1986538675326410730L;
        kd.liwb[26] = 856325371595930343L;
        kd.liwb[27] = 8063361757435375941L;
        kd.liwb[28] = 5033092489029395219L;
        kd.liwb[29] = -121636055888964916L;
        kd.liwb[30] = 6005234499032254581L;
        kd.liwb[31] = 516732126442074535L;
        kd.liwb[32] = 8873736987182264292L;
        kd.liwb[33] = -550687885327210248L;
        kd.liwb[34] = -8520757359283389885L;
        kd.liwb[35] = -7943483244297773515L;
        kd.liwb[36] = -8575554493894262081L;
        kd.liwb[37] = -477398125858937352L;
        kd.liwb[38] = -3967601459077506318L;
        kd.liwb[39] = -8763082505101190158L;
        kd.liwb[40] = -3704214019697014390L;
        kd.liwb[41] = -5357826958155169625L;
        kd.liwb[42] = -7903275217514592618L;
        kd.liwb[43] = 2595784082329806810L;
        kd.liwb[44] = 4816690030152953542L;
        kd.liwb[45] = 8429669495624419987L;
        kd.liwb[46] = -8728089149283297619L;
        kd.liwb[47] = 9150317385326641379L;
        kd.liwb[48] = -639129224529105251L;
        kd.liwb[49] = -5216226285923668753L;
        kd.liwb[50] = 4631303288402351014L;
        kd.liwb[51] = -121860807169208872L;
        kd.liwb[52] = -3516939228034574479L;
        kd.liwb[53] = -5839931282324493277L;
        kd.liwb[54] = 4532387467929160357L;
        kd.liwb[55] = -7157470855441085991L;
        kd.liwb[56] = -4979394970204864281L;
        kd.liwb[57] = -7109614320927344547L;
        kd.liwb[58] = 6529677752845009130L;
        kd.liwb[59] = 7935093669746718536L;
        kd.liwb[60] = -1821898627710441177L;
        kd.liwb[61] = -2256285843657881827L;
        kd.liwb[62] = -2675554897526655533L;
        kd.liwb[63] = -6744681546235582323L;
        kd.liwb[64] = 998878178429795529L;
        kd.liwb[65] = 565762772786824847L;
        kd.liwb[66] = 5764286605740889343L;
        kd.liwb[67] = 821741199520514292L;
        kd.liwb[68] = -8342917792458807669L;
        kd.liwb[69] = -8387112982901333795L;
        kd.liwb[70] = 6682840551518150178L;
        kd.liwb[71] = -8485608843172229936L;
        kd.liwb[72] = 2357345333567158991L;
        kd.liwb[73] = 2166312958759299447L;
        kd.liwb[74] = 4933011680411428921L;
        kd.liwb[75] = 5878340287872693857L;
        kd.liwb[76] = 6080131958097350473L;
        kd.liwb[77] = -3937715062564094611L;
        kd.liwb[78] = 3067383580487592627L;
        kd.liwb[79] = -8690523553290054097L;
        kd.liwb[80] = 6725492475298528573L;
        kd.liwb[81] = 8380888131661711832L;
        kd.liwb[82] = -2171023472143138926L;
        kd.liwb[83] = 4360243753878754856L;
        kd.liwb[84] = 1815099461327569998L;
        kd.liwb[85] = 868154190045480288L;
        kd.liwb[86] = -8818082670363734540L;
        kd.liwb[87] = 6794546077215997879L;
        kd.liwb[88] = 7974716764190006697L;
        kd.liwb[89] = 1953238355221661893L;
        kd.liwb[90] = -9117603429842943777L;
        kd.liwb[91] = 1223560424101645509L;
        kd.liwb[92] = -3953365515175266611L;
        kd.liwb[93] = -7906607180566537826L;
        kd.liwb[94] = 3910157663090479694L;
        kd.liwb[95] = 1395093774820678839L;
        kd.liwb[96] = -3798694056770649641L;
        kd.liwb[97] = -4098852687806755268L;
        kd.liwb[98] = 7030527038421845723L;
        kd.liwb[99] = -5514560068563352171L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int[] getPresets() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljnj", liwa(int ), (int)193));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2046318886: {
                    v1 = kd.livq("ljnk", liwa(int ), (int)194);
                    continue block24;
                }
                case -1825031211: {
                    v1 = kd.livq("ljnl", liwa(int ), (int)195);
                    continue block24;
                }
                case -403782851: {
                    break block24;
                }
                case 1316919935: {
                    v1 = kd.livq("ljnm", liwa(int ), (int)196);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljnn", liwa(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("ljno", livn(int ), (int)263)) break;
            v2 /* !! */  = (long)kd.livq("ljnp", livn(int ), (int)264);
        }
        var2_2 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - kd.livq("ljnq", liwa(int ), (int)198));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2113359883: {
                    v4 = kd.livq("ljnr", liwa(int ), (int)199);
                    continue block26;
                }
                case -1660469195: {
                    v4 = kd.livq("ljns", liwa(int ), (int)200);
                    continue block26;
                }
                case -415902040: {
                    v4 = kd.livq("ljnt", liwa(int ), (int)201);
                    continue block26;
                }
                case -403782851: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = kd.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block27;
                v5 /* !! */  = kd.ty;
                if (true) ** GOTO lbl53
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - kd.livq("ljnu", liwa(int ), (int)202));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -743474764: {
                            v6 = kd.livq("ljnv", liwa(int ), (int)203);
                            continue block28;
                        }
                        case -599616951: {
                            v6 = kd.livq("ljnw", liwa(int ), (int)204);
                            continue block28;
                        }
                        case -403782851: {
                            break block28;
                        }
                        case -163908267: {
                            v6 = kd.livq("ljnx", liwa(int ), (int)205);
                            continue block28;
                        }
                    }
                    break;
                }
                return this.presets;
lbl66:
                // 3 sources

                case 0: {
                    var2_2 /* !! */  = (int)kd.livq("ljny", livn(int ), (int)265);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)kd.livq("ljnz", livn(int ), (int)266);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)kd.livq("ljoa", livn(int ), (int)267);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)kd.livq("ljob", livn(int ), (int)268);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ljru() {
        kd.liwc[200] = -2678558119351381100L;
        kd.liwc[201] = 3587571711288341085L;
        kd.liwc[202] = -5224707011609213245L;
        kd.liwc[203] = -6183317995829014911L;
        kd.liwc[204] = 3628162207060597426L;
        kd.liwc[205] = -9026615350271794033L;
        kd.liwc[206] = -4450519241902294713L;
        kd.liwc[207] = 5671676629730705537L;
        kd.liwc[208] = 2455792416938443623L;
        kd.liwc[209] = -1756544024472631616L;
        kd.liwc[210] = 1584318227871615103L;
        kd.liwc[211] = 7230823446808479781L;
        kd.liwc[212] = 1224245126350871128L;
        kd.liwc[213] = -2829855605362922935L;
        kd.liwc[214] = -8264766507537616952L;
        kd.liwc[215] = 8827408801280638797L;
        kd.liwc[216] = -6448490064851123915L;
        kd.liwc[217] = 6831459341791256573L;
        kd.liwc[218] = -3316964113404237481L;
        kd.liwc[219] = 1987915886661090681L;
        kd.liwc[220] = -6545088599484148063L;
        kd.liwc[221] = -1804855073757644814L;
        kd.liwc[222] = -5990531464440568455L;
        kd.liwc[223] = -9061255636493163294L;
        kd.liwc[224] = -7772601979077183734L;
        kd.liwc[225] = 5555171645354415633L;
        kd.liwc[226] = -6522399322383032454L;
        kd.liwc[227] = 5434424959000338139L;
        kd.liwc[228] = 7667482864146439798L;
        kd.liwc[229] = -8766268516252961982L;
        kd.liwc[230] = 1980399943200115738L;
        kd.liwc[231] = -7530360820853209075L;
        kd.liwc[232] = 5326406819046589556L;
        kd.liwc[233] = 4952976441575752703L;
        kd.liwc[234] = 2006133596678365722L;
        kd.liwc[235] = 4910369967716096078L;
        kd.liwc[236] = -8386449282915340643L;
        kd.liwc[237] = 2120373796230684102L;
        kd.liwc[238] = -2232711346386722384L;
        kd.liwc[239] = -5979356648232397520L;
        kd.liwc[240] = -7977495854382365463L;
        kd.liwc[241] = 6272745440833411309L;
        kd.liwc[242] = 3381932219090501852L;
        kd.liwc[243] = 397835952210971310L;
        kd.liwc[244] = -6202653685595151881L;
        kd.liwc[245] = -4174775843310475768L;
        kd.liwc[246] = 6394511188612742407L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPresets(int[] var1_1) {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljpk", liwa(int ), (int)227));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block16;
                }
                case 1207989982: {
                    v1 = kd.livq("ljpl", liwa(int ), (int)228);
                    continue block16;
                }
                case 1981412435: {
                    v1 = kd.livq("ljpm", liwa(int ), (int)229);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljpn", liwa(int ), (int)230)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kd.livq("ljpo", livn(int ), (int)282)) break;
            v2 /* !! */  = (long)kd.livq("ljpp", livn(int ), (int)283);
        }
        var3_3 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl25
        block18: while (true) {
            v3 /* !! */  = (long)(kd.livq("ljpr", liwa(int ), (int)232) - kd.livq("ljpq", liwa(int ), (int)231));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1220624199: {
                    continue block18;
                }
                case -403782851: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljps", liwa(int ), (int)233)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kd.livq("ljpt", livn(int ), (int)284)) break;
                    v4 /* !! */  = (long)kd.livq("ljpu", livn(int ), (int)285);
                }
                this.presets = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kd.livq("ljpv", livn(int ), (int)286);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljpw", livn(int ), (int)287);
                } while (!var4_2);
                throw null;
            }
lbl58:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("ljpx", livn(int ), (int)288);
                    if (!var4_2) ** GOTO lbl48
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kd.livq("ljpy", livn(int ), (int)289);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kd.livq("ljpz", livn(int ), (int)290);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("liyf", liwa(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("liyg", livn(int ), (int)45)) break;
            v0 /* !! */  = (long)kd.livq("liyh", livn(int ), (int)46);
        }
        var5_1 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("liyi", liwa(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("liyj", livn(int ), (int)47)) break;
            v1 /* !! */  = (long)kd.livq("liyk", livn(int ), (int)48);
        }
        var4_2 /* !! */  = kd.b;
        v2 /* !! */  = kd.ty;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - kd.livq("liyl", liwa(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -403782851: {
                    break block27;
                }
                case 1172082385: {
                    v3 = kd.livq("liym", liwa(int ), (int)21);
                    continue block27;
                }
                case 1678407294: {
                    v3 = kd.livq("liyn", liwa(int ), (int)22);
                    continue block27;
                }
            }
            break;
        }
        var3_3 = kd.a;
        if (var5_1) {
            throw null;
lbl31:
            // 4 sources

            return (int)kd.livq("liyo", livn(int ), (int)49);
        }
        if (var3_3 || var3_3) ** GOTO lbl31
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("liyp", liwa(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == kd.livq("liyq", livn(int ), (int)50)) break;
            v4 /* !! */  = (long)kd.livq("liyr", livn(int ), (int)51);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = kd.ty - kd.livq("liys", liwa(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == kd.livq("liyt", livn(int ), (int)52)) break;
            v5 /* !! */  = (long)kd.livq("liyu", livn(int ), (int)53);
        }
        v6 /* !! */  = kd.ty;
        if (true) ** GOTO lbl50
        block31: while (true) {
            v6 /* !! */  = (long)(v7 - kd.livq("liyv", liwa(int ), (int)25));
lbl50:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -810308416: {
                    v7 = kd.livq("liyw", liwa(int ), (int)26);
                    continue block31;
                }
                case -403782851: {
                    break block31;
                }
                case 207380241: {
                    v7 = kd.livq("liyx", liwa(int ), (int)27);
                    continue block31;
                }
            }
            break;
        }
        v8 /* !! */  = kd.ty;
        if (true) ** GOTO lbl63
        block32: while (true) {
            v8 /* !! */  = (long)(v9 - kd.livq("liyy", liwa(int ), (int)28));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2128197740: {
                    v9 = kd.livq("liyz", liwa(int ), (int)29);
                    continue block32;
                }
                case -403782851: {
                    break block32;
                }
                case 1792401001: {
                    v9 = kd.livq("liza", liwa(int ), (int)30);
                    continue block32;
                }
            }
            break;
        }
        var1_4 = Color.HSBtoRGB(this.hue, this.saturation, this.brightness);
        if (var3_3 || var3_3) ** GOTO lbl31
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = kd.ty - kd.livq("lizb", liwa(int ), (int)31)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == kd.livq("lizc", livn(int ), (int)54)) break;
            v10 /* !! */  = (long)kd.livq("lizd", livn(int ), (int)55);
        }
        v11 = this.alpha * kd.livq("lizf", lize(int ), (int)56);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = kd.ty - kd.livq("lizg", liwa(int ), (int)32)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == kd.livq("lizh", livn(int ), (int)57)) break;
            v12 /* !! */  = (long)kd.livq("lizi", livn(int ), (int)58);
        }
        var2_5 = Math.round(v11);
        if (var3_3) ** GOTO lbl31
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_3) ** break;
                ** continue;
                return var2_5 << kd.livq("lizj", livn(int ), (int)59) | var1_4 & kd.livq("lizk", livn(int ), (int)60);
            }
            case 0: {
                var4_2 /* !! */  = (int)kd.livq("lizl", livn(int ), (int)61);
                if (var5_1) {
                    throw null;
                }
            }
lbl99:
            // 5 sources

            case 1: {
                do {
                    var4_2 /* !! */  = (int)kd.livq("lizm", livn(int ), (int)62);
                } while (!var5_1);
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)kd.livq("lizn", livn(int ), (int)63);
                if (!var5_1) break;
                throw null;
            }
            case 3: {
                do {
                    var4_2 /* !! */  = (int)kd.livq("lizo", livn(int ), (int)64);
                } while (!var5_1);
                throw null;
            }
            case 4: {
                var4_2 /* !! */  = (int)kd.livq("lizp", livn(int ), (int)65);
                if (!var5_1) ** GOTO lbl99
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)kd.livq("lizq", livn(int ), (int)66);
                    if (!var5_1) ** GOTO lbl99
                    throw null;
                }
            }
            case 6: {
                var4_2 /* !! */  = (int)kd.livq("lizr", livn(int ), (int)67);
                if (!var5_1) break;
                throw null;
            }
            case 7: 
        }
        var4_2 /* !! */  = (int)kd.livq("lizs", livn(int ), (int)68);
        ** while (!var5_1)
lbl129:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljrj() {
        kd.livo[200] = 1424588729;
        kd.livo[201] = 224592900;
        kd.livo[202] = 1986906035;
        kd.livo[203] = -2133465213;
        kd.livo[204] = -286466266;
        kd.livo[205] = 980299054;
        kd.livo[206] = -1508305346;
        kd.livo[207] = -1707518367;
        kd.livo[208] = 827575283;
        kd.livo[209] = -1657857020;
        kd.livo[210] = 1626098649;
        kd.livo[211] = 554532908;
        kd.livo[212] = 308948261;
        kd.livo[213] = 771339805;
        kd.livo[214] = 1761510789;
        kd.livo[215] = 1142831523;
        kd.livo[216] = 1620090094;
        kd.livo[217] = -925728834;
        kd.livo[218] = -185434389;
        kd.livo[219] = -337975688;
        kd.livo[220] = 513280615;
        kd.livo[221] = -1541297462;
        kd.livo[222] = -717077950;
        kd.livo[223] = 1541109808;
        kd.livo[224] = -1210988784;
        kd.livo[225] = -202451467;
        kd.livo[226] = -1073288907;
        kd.livo[227] = 369451718;
        kd.livo[228] = 1807570236;
        kd.livo[229] = -324834743;
        kd.livo[230] = 1590175829;
        kd.livo[231] = 1866101670;
        kd.livo[232] = 1377783744;
        kd.livo[233] = 1181753623;
        kd.livo[234] = -2140534855;
        kd.livo[235] = -1945918614;
        kd.livo[236] = 1000503366;
        kd.livo[237] = 54740001;
        kd.livo[238] = 1499384183;
        kd.livo[239] = 1564432722;
        kd.livo[240] = 208234376;
        kd.livo[241] = 1195980316;
        kd.livo[242] = 1107536931;
        kd.livo[243] = -354919405;
        kd.livo[244] = -1607321054;
        kd.livo[245] = 1780605178;
        kd.livo[246] = -1343948859;
        kd.livo[247] = 1122609432;
        kd.livo[248] = -1080790186;
        kd.livo[249] = -1856315490;
        kd.livo[250] = 1734413239;
        kd.livo[251] = 202362268;
        kd.livo[252] = -1821133388;
        kd.livo[253] = 1440601213;
        kd.livo[254] = -1850871058;
        kd.livo[255] = 291391465;
        kd.livo[256] = -1113808462;
        kd.livo[257] = 384239391;
        kd.livo[258] = 337636482;
        kd.livo[259] = 635548832;
        kd.livo[260] = -1902503147;
        kd.livo[261] = -1569646956;
        kd.livo[262] = 461335163;
        kd.livo[263] = -1005438188;
        kd.livo[264] = 922031161;
        kd.livo[265] = 608413588;
        kd.livo[266] = -410492642;
        kd.livo[267] = 1037458476;
        kd.livo[268] = 1003060333;
        kd.livo[269] = -965758941;
        kd.livo[270] = 628425777;
        kd.livo[271] = -121623339;
        kd.livo[272] = 1210748482;
        kd.livo[273] = -2083409076;
        kd.livo[274] = 1569108248;
        kd.livo[275] = 473132802;
        kd.livo[276] = -167673448;
        kd.livo[277] = -924721688;
        kd.livo[278] = 1519919584;
        kd.livo[279] = 1631395800;
        kd.livo[280] = 1846998259;
        kd.livo[281] = 2137645388;
        kd.livo[282] = 1193097121;
        kd.livo[283] = -141318550;
        kd.livo[284] = -1270903440;
        kd.livo[285] = -1138794352;
        kd.livo[286] = 618612723;
        kd.livo[287] = -1198219281;
        kd.livo[288] = -1145235046;
        kd.livo[289] = 1685973512;
        kd.livo[290] = 1222154125;
        kd.livo[291] = -330776356;
        kd.livo[292] = 698171930;
        kd.livo[293] = -1063157235;
        kd.livo[294] = -2130790515;
        kd.livo[295] = -1510070902;
        kd.livo[296] = -1708443427;
        kd.livo[297] = 134871179;
        kd.livo[298] = -889076729;
        kd.livo[299] = -1958998464;
    }

    private static /* synthetic */ float lize(int n2) {
        return Float.intBitsToFloat(livo[n2] ^ livp[n2]);
    }

    private static /* synthetic */ void ljrh() {
        kd.livo[0] = -2013490241;
        kd.livo[1] = 1487065403;
        kd.livo[2] = -322884922;
        kd.livo[3] = -434095264;
        kd.livo[4] = -1154827775;
        kd.livo[5] = -390866403;
        kd.livo[6] = -623035377;
        kd.livo[7] = -1688788726;
        kd.livo[8] = -1534916879;
        kd.livo[9] = -707487727;
        kd.livo[10] = -994423203;
        kd.livo[11] = -1160140205;
        kd.livo[12] = -1204934056;
        kd.livo[13] = -1528655788;
        kd.livo[14] = -507591586;
        kd.livo[15] = 444184358;
        kd.livo[16] = -1593641980;
        kd.livo[17] = 673684220;
        kd.livo[18] = 628084629;
        kd.livo[19] = -1215982333;
        kd.livo[20] = 343943734;
        kd.livo[21] = -1774712408;
        kd.livo[22] = 1148680091;
        kd.livo[23] = 952619177;
        kd.livo[24] = -1619271154;
        kd.livo[25] = -1372125621;
        kd.livo[26] = 1075274159;
        kd.livo[27] = -1497418819;
        kd.livo[28] = 1805552743;
        kd.livo[29] = 935736581;
        kd.livo[30] = -169370921;
        kd.livo[31] = 481778043;
        kd.livo[32] = -284784938;
        kd.livo[33] = 1785875464;
        kd.livo[34] = -1297099934;
        kd.livo[35] = 399739226;
        kd.livo[36] = 143377723;
        kd.livo[37] = 1331422290;
        kd.livo[38] = 2116985403;
        kd.livo[39] = -1551923370;
        kd.livo[40] = 1693279935;
        kd.livo[41] = -1755832771;
        kd.livo[42] = 618187831;
        kd.livo[43] = 1520724410;
        kd.livo[44] = -1164640085;
        kd.livo[45] = -1093342775;
        kd.livo[46] = -1216283860;
        kd.livo[47] = -1777495750;
        kd.livo[48] = -1881839217;
        kd.livo[49] = -1662011298;
        kd.livo[50] = -980521763;
        kd.livo[51] = -1751010329;
        kd.livo[52] = 1990399969;
        kd.livo[53] = -1652681675;
        kd.livo[54] = -744754673;
        kd.livo[55] = -1157519119;
        kd.livo[56] = -1442094617;
        kd.livo[57] = -888994219;
        kd.livo[58] = 2091037686;
        kd.livo[59] = -488389043;
        kd.livo[60] = -1003065413;
        kd.livo[61] = -53055324;
        kd.livo[62] = -1833907042;
        kd.livo[63] = 1169746253;
        kd.livo[64] = 1191062687;
        kd.livo[65] = 1761224523;
        kd.livo[66] = -227034119;
        kd.livo[67] = 769362140;
        kd.livo[68] = -771550929;
        kd.livo[69] = 1016231160;
        kd.livo[70] = -1267824180;
        kd.livo[71] = -1088882991;
        kd.livo[72] = -890886736;
        kd.livo[73] = 395746511;
        kd.livo[74] = -1175044039;
        kd.livo[75] = 661161148;
        kd.livo[76] = -1378317545;
        kd.livo[77] = -1148925860;
        kd.livo[78] = -570250814;
        kd.livo[79] = 1674474033;
        kd.livo[80] = 839877962;
        kd.livo[81] = -1316520164;
        kd.livo[82] = -375943717;
        kd.livo[83] = 599011193;
        kd.livo[84] = -332160049;
        kd.livo[85] = 862259555;
        kd.livo[86] = -2053419070;
        kd.livo[87] = 1367078561;
        kd.livo[88] = -257385798;
        kd.livo[89] = -1296278386;
        kd.livo[90] = 1196876666;
        kd.livo[91] = -1958208005;
        kd.livo[92] = -1335165019;
        kd.livo[93] = -1931105200;
        kd.livo[94] = 474471254;
        kd.livo[95] = 638839107;
        kd.livo[96] = -473701361;
        kd.livo[97] = -1927352323;
        kd.livo[98] = -1277477724;
        kd.livo[99] = 2093506031;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd setAlpha(float var1_1) {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljhe", liwa(int ), (int)124));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -600428546: {
                    v1 = kd.livq("ljhf", liwa(int ), (int)125);
                    continue block32;
                }
                case -403782851: {
                    break block32;
                }
                case 1773254379: {
                    v1 = kd.livq("ljhg", liwa(int ), (int)126);
                    continue block32;
                }
            }
            break;
        }
        var4_2 = kd.c;
        v2 /* !! */  = kd.ty;
        if (true) ** GOTO lbl19
        block33: while (true) {
            v2 /* !! */  = (long)(kd.livq("ljhi", liwa(int ), (int)128) - kd.livq("ljhh", liwa(int ), (int)127));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -403782851: {
                    break block33;
                }
                case 956755886: {
                    continue block33;
                }
            }
            break;
        }
        var3_3 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl29
        block34: while (true) {
            v3 /* !! */  = (long)(kd.livq("ljhk", liwa(int ), (int)130) - kd.livq("ljhj", liwa(int ), (int)129));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -403782851: {
                    break block34;
                }
                case 251561083: {
                    continue block34;
                }
            }
            break;
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                v4 /* !! */  = kd.ty;
                if (true) ** GOTO lbl48
                block36: while (true) {
                    v4 /* !! */  = (long)(v5 - kd.livq("ljhl", liwa(int ), (int)131));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -856968026: {
                            v5 = kd.livq("ljhm", liwa(int ), (int)132);
                            continue block36;
                        }
                        case -403782851: {
                            break block36;
                        }
                        case 1555871910: {
                            v5 = kd.livq("ljhn", liwa(int ), (int)133);
                            continue block36;
                        }
                        case 2058087377: {
                            v5 = kd.livq("ljho", liwa(int ), (int)134);
                            continue block36;
                        }
                    }
                    break;
                }
                v6 = Math.min(1.0f, var1_1);
                v7 /* !! */  = kd.ty;
                if (true) ** GOTO lbl65
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - kd.livq("ljhp", liwa(int ), (int)135));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -403782851: {
                            break block37;
                        }
                        case 1356340706: {
                            v8 = kd.livq("ljhq", liwa(int ), (int)136);
                            continue block37;
                        }
                        case 1790210933: {
                            v8 = kd.livq("ljhr", liwa(int ), (int)137);
                            continue block37;
                        }
                    }
                    break;
                }
                v9 = Math.max(0.0f, v6);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljhs", liwa(int ), (int)138)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kd.livq("ljht", livn(int ), (int)171)) break;
                    v10 /* !! */  = (long)kd.livq("ljhu", livn(int ), (int)172);
                }
                this.alpha = v9;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return this;
            }
lbl84:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kd.livq("ljhv", livn(int ), (int)173);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("ljhw", livn(int ), (int)174);
                    if (!var4_2) ** GOTO lbl84
                    throw null;
                }
            }
lbl94:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)kd.livq("ljhx", livn(int ), (int)175);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljhy", livn(int ), (int)176);
                } while (!var4_2);
                throw null;
            }
lbl104:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)kd.livq("ljhz", livn(int ), (int)177);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kd.livq("ljia", livn(int ), (int)178);
        ** while (!var4_2)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljrt() {
        kd.liwc[100] = -3530293616011493878L;
        kd.liwc[101] = -8568295334613640699L;
        kd.liwc[102] = -1826090234678588777L;
        kd.liwc[103] = 1872308128700947045L;
        kd.liwc[104] = -9103828661124919325L;
        kd.liwc[105] = 7460231947841025753L;
        kd.liwc[106] = -2801494870256274300L;
        kd.liwc[107] = -321770382337802169L;
        kd.liwc[108] = -4044590204349050542L;
        kd.liwc[109] = -1647522450844118270L;
        kd.liwc[110] = -5342908450811854968L;
        kd.liwc[111] = -147891438479016085L;
        kd.liwc[112] = -7178606172703927819L;
        kd.liwc[113] = -5553085028993960900L;
        kd.liwc[114] = 4498991745074335610L;
        kd.liwc[115] = 938619152718777582L;
        kd.liwc[116] = 8494305320893329353L;
        kd.liwc[117] = -1156520824871238073L;
        kd.liwc[118] = -5914462172559496728L;
        kd.liwc[119] = -3147946519595888625L;
        kd.liwc[120] = 1523084189243283775L;
        kd.liwc[121] = -5385697943648752207L;
        kd.liwc[122] = -3179779249406232032L;
        kd.liwc[123] = 3653017197511040505L;
        kd.liwc[124] = 5656045854773258708L;
        kd.liwc[125] = -9180284515225346641L;
        kd.liwc[126] = 3605615049454866567L;
        kd.liwc[127] = -7767209572781127749L;
        kd.liwc[128] = 1151459526091691947L;
        kd.liwc[129] = -1336190109790042218L;
        kd.liwc[130] = -3063434621296330197L;
        kd.liwc[131] = -5096900178669736783L;
        kd.liwc[132] = -151192519972866833L;
        kd.liwc[133] = -622183739307473340L;
        kd.liwc[134] = -1094856852008877950L;
        kd.liwc[135] = -2764469937842065516L;
        kd.liwc[136] = -5156884471807704843L;
        kd.liwc[137] = -5376142939413029768L;
        kd.liwc[138] = 6885027371038822402L;
        kd.liwc[139] = 3969096965479228168L;
        kd.liwc[140] = 237666525027035463L;
        kd.liwc[141] = 4905333894224351291L;
        kd.liwc[142] = -8446125710408291367L;
        kd.liwc[143] = 5355459990467477403L;
        kd.liwc[144] = 126176435431664057L;
        kd.liwc[145] = -7087783907897337484L;
        kd.liwc[146] = 2958803169922046376L;
        kd.liwc[147] = -5193721768378014160L;
        kd.liwc[148] = 7791008611600735456L;
        kd.liwc[149] = -1017927848686218822L;
        kd.liwc[150] = 8248088293240148501L;
        kd.liwc[151] = -6843429383322060345L;
        kd.liwc[152] = 2056998821108332327L;
        kd.liwc[153] = 6482530534282878195L;
        kd.liwc[154] = 8677580315541960917L;
        kd.liwc[155] = -3406296657243342239L;
        kd.liwc[156] = 1789910274515430666L;
        kd.liwc[157] = 8606785489509986637L;
        kd.liwc[158] = -1797604271604017234L;
        kd.liwc[159] = 571250635286021838L;
        kd.liwc[160] = 8350594827813264417L;
        kd.liwc[161] = 2041447994195616789L;
        kd.liwc[162] = 8164550266856988572L;
        kd.liwc[163] = -4682047588778584856L;
        kd.liwc[164] = 6902243174624799455L;
        kd.liwc[165] = -566499391696255072L;
        kd.liwc[166] = -7820892127465843779L;
        kd.liwc[167] = -3406386608006853760L;
        kd.liwc[168] = -7872020420254741648L;
        kd.liwc[169] = 6734344098505552353L;
        kd.liwc[170] = -5103103198293807624L;
        kd.liwc[171] = 476454827184321119L;
        kd.liwc[172] = 3878478038561582314L;
        kd.liwc[173] = -7257893089124704078L;
        kd.liwc[174] = 5240142672550883864L;
        kd.liwc[175] = 5209697319618753010L;
        kd.liwc[176] = -6236527656873733766L;
        kd.liwc[177] = 1635141097229728581L;
        kd.liwc[178] = 543761497900589736L;
        kd.liwc[179] = 7003938449507751196L;
        kd.liwc[180] = 8877023064077402802L;
        kd.liwc[181] = -3144612784882058991L;
        kd.liwc[182] = 8574457145622156554L;
        kd.liwc[183] = 8548994909917103372L;
        kd.liwc[184] = 4250620265959718776L;
        kd.liwc[185] = -163751441810110520L;
        kd.liwc[186] = -3044733861364487826L;
        kd.liwc[187] = -2633766630763966508L;
        kd.liwc[188] = 360944231169895646L;
        kd.liwc[189] = -4319859647878427177L;
        kd.liwc[190] = -4038783242829148359L;
        kd.liwc[191] = -1979559380015135021L;
        kd.liwc[192] = 4938991836604718279L;
        kd.liwc[193] = -7195442010091699355L;
        kd.liwc[194] = -948642894575982096L;
        kd.liwc[195] = 569904608927695985L;
        kd.liwc[196] = -8656717537849692609L;
        kd.liwc[197] = 375029224133190790L;
        kd.liwc[198] = -3603212881542366821L;
        kd.liwc[199] = 7337185708973353930L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int[] getPreviousColors() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljoc", liwa(int ), (int)206));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block27;
                }
                case 48566836: {
                    v1 = kd.livq("ljod", liwa(int ), (int)207);
                    continue block27;
                }
                case 1909371268: {
                    v1 = kd.livq("ljoe", liwa(int ), (int)208);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = kd.c;
        v2 /* !! */  = kd.ty;
        if (true) ** GOTO lbl19
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - kd.livq("ljof", liwa(int ), (int)209));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -810245820: {
                    v3 = kd.livq("ljog", liwa(int ), (int)210);
                    continue block28;
                }
                case -403782851: {
                    break block28;
                }
                case 677574866: {
                    v3 = kd.livq("ljoh", liwa(int ), (int)211);
                    continue block28;
                }
                case 1656779148: {
                    v3 = kd.livq("ljoi", liwa(int ), (int)212);
                    continue block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = kd.b;
        v4 /* !! */  = kd.ty;
        if (true) ** GOTO lbl36
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - kd.livq("ljoj", liwa(int ), (int)213));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1410212210: {
                    v5 = kd.livq("ljok", liwa(int ), (int)214);
                    continue block29;
                }
                case -403782851: {
                    break block29;
                }
                case 1753498998: {
                    v5 = kd.livq("ljol", liwa(int ), (int)215);
                    continue block29;
                }
            }
            break;
        }
        var1_3 = kd.a;
        if (var3_1) {
            throw null;
lbl48:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v6 /* !! */  = kd.ty;
                if (true) ** GOTO lbl59
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - kd.livq("ljom", liwa(int ), (int)216));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1862255946: {
                            v7 = kd.livq("ljon", liwa(int ), (int)217);
                            continue block31;
                        }
                        case -403782851: {
                            break block31;
                        }
                        case 779165130: {
                            v7 = kd.livq("ljoo", liwa(int ), (int)218);
                            continue block31;
                        }
                    }
                    break;
                }
                return this.previousColors;
            }
lbl69:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljop", livn(int ), (int)269);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl74:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)kd.livq("ljoq", livn(int ), (int)270);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
lbl78:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)kd.livq("ljor", livn(int ), (int)271);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)kd.livq("ljos", livn(int ), (int)272);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd visible(Supplier<Boolean> var1_1) {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block13: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("lixn", liwa(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2057677385: {
                    v1 = kd.livq("lixo", liwa(int ), (int)13);
                    continue block13;
                }
                case -403782851: {
                    break block13;
                }
                case 758163873: {
                    v1 = kd.livq("lixp", liwa(int ), (int)14);
                    continue block13;
                }
            }
            break;
        }
        var4_2 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("lixq", liwa(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kd.livq("lixr", livn(int ), (int)33)) break;
            v2 /* !! */  = (long)kd.livq("lixs", livn(int ), (int)34);
        }
        var3_3 /* !! */  = kd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("lixt", liwa(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kd.livq("lixu", livn(int ), (int)35)) break;
            v3 /* !! */  = (long)kd.livq("lixv", livn(int ), (int)36);
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("lixw", liwa(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kd.livq("lixx", livn(int ), (int)37)) break;
            v4 /* !! */  = (long)kd.livq("lixy", livn(int ), (int)38);
        }
        this.setVisible(var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl43:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kd.livq("lixz", livn(int ), (int)39);
                if (!var4_2) break;
                throw null;
            }
lbl47:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kd.livq("liya", livn(int ), (int)40);
                if (!var4_2) ** GOTO lbl43
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)kd.livq("liyb", livn(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)kd.livq("liyc", livn(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("liyd", livn(int ), (int)43);
                    if (!var4_2) ** GOTO lbl47
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kd.livq("liye", livn(int ), (int)44);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getAlpha() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljmr", liwa(int ), (int)184));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1488308376: {
                    v1 = kd.livq("ljms", liwa(int ), (int)185);
                    continue block17;
                }
                case -1059605332: {
                    v1 = kd.livq("ljmt", liwa(int ), (int)186);
                    continue block17;
                }
                case -403782851: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljmu", liwa(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("ljmv", livn(int ), (int)254)) break;
            v2 /* !! */  = (long)kd.livq("ljmw", livn(int ), (int)255);
        }
        var2_2 /* !! */  = kd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljmx", liwa(int ), (int)188)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kd.livq("ljmy", livn(int ), (int)256)) break;
            v3 /* !! */  = (long)kd.livq("ljmz", livn(int ), (int)257);
        }
        var1_3 = kd.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (float)kd.livq("ljna", lize(int ), (int)258);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = kd.ty;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - kd.livq("ljnb", liwa(int ), (int)189));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1839028624: {
                            v5 = kd.livq("ljnc", liwa(int ), (int)190);
                            continue block21;
                        }
                        case -403782851: {
                            break block21;
                        }
                        case -45887877: {
                            v5 = kd.livq("ljnd", liwa(int ), (int)191);
                            continue block21;
                        }
                        case 770219638: {
                            v5 = kd.livq("ljne", liwa(int ), (int)192);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.alpha;
            }
            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljnf", livn(int ), (int)259);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kd.livq("ljng", livn(int ), (int)260);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)kd.livq("ljnh", livn(int ), (int)261);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kd.livq("ljni", livn(int ), (int)262);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljrl() {
        kd.livp[0] = -2013490241;
        kd.livp[1] = 1487065402;
        kd.livp[2] = -322884927;
        kd.livp[3] = -434095257;
        kd.livp[4] = -1154827773;
        kd.livp[5] = -390866401;
        kd.livp[6] = -623035384;
        kd.livp[7] = -1688788728;
        kd.livp[8] = -1534916879;
        kd.livp[9] = -707487728;
        kd.livp[10] = 604545690;
        kd.livp[11] = -1160140206;
        kd.livp[12] = -226389562;
        kd.livp[13] = -1528655787;
        kd.livp[14] = 1450813655;
        kd.livp[15] = 444184359;
        kd.livp[16] = -1593641984;
        kd.livp[17] = 673684216;
        kd.livp[18] = 628084624;
        kd.livp[19] = -1215982329;
        kd.livp[20] = 343943735;
        kd.livp[21] = -1774712407;
        kd.livp[22] = -27600810;
        kd.livp[23] = -952619178;
        kd.livp[24] = -601105743;
        kd.livp[25] = 1372125620;
        kd.livp[26] = 888457245;
        kd.livp[27] = -1497418824;
        kd.livp[28] = 1805552739;
        kd.livp[29] = 935736582;
        kd.livp[30] = -169370924;
        kd.livp[31] = 481778041;
        kd.livp[32] = -284784939;
        kd.livp[33] = 1785875465;
        kd.livp[34] = 378959571;
        kd.livp[35] = 399739227;
        kd.livp[36] = -1421839334;
        kd.livp[37] = -1331422291;
        kd.livp[38] = 702019097;
        kd.livp[39] = -1551923371;
        kd.livp[40] = 1693279931;
        kd.livp[41] = -1755832771;
        kd.livp[42] = 618187831;
        kd.livp[43] = 1520724414;
        kd.livp[44] = -1164640087;
        kd.livp[45] = -1093342776;
        kd.livp[46] = 122199981;
        kd.livp[47] = 1777495749;
        kd.livp[48] = 290566877;
        kd.livp[49] = 892418624;
        kd.livp[50] = -980521764;
        kd.livp[51] = 1646243493;
        kd.livp[52] = -1990399970;
        kd.livp[53] = -1833074194;
        kd.livp[54] = -744754674;
        kd.livp[55] = -463830689;
        kd.livp[56] = -378248729;
        kd.livp[57] = -888994220;
        kd.livp[58] = 1777459661;
        kd.livp[59] = -488389035;
        kd.livp[60] = -993423292;
        kd.livp[61] = -53055324;
        kd.livp[62] = -1833907048;
        kd.livp[63] = 1169746250;
        kd.livp[64] = 1191062684;
        kd.livp[65] = 1761224525;
        kd.livp[66] = -227034113;
        kd.livp[67] = 769362141;
        kd.livp[68] = -771550936;
        kd.livp[69] = 1016231161;
        kd.livp[70] = -39677083;
        kd.livp[71] = -1000841639;
        kd.livp[72] = -890886736;
        kd.livp[73] = 395746511;
        kd.livp[74] = -1175044038;
        kd.livp[75] = 661161149;
        kd.livp[76] = 1378317544;
        kd.livp[77] = -210940840;
        kd.livp[78] = 570250813;
        kd.livp[79] = 1432060539;
        kd.livp[80] = -1324861942;
        kd.livp[81] = -1316520163;
        kd.livp[82] = 564178208;
        kd.livp[83] = -592171143;
        kd.livp[84] = -332160052;
        kd.livp[85] = 862259555;
        kd.livp[86] = -2053419071;
        kd.livp[87] = 1367078563;
        kd.livp[88] = -257385797;
        kd.livp[89] = 1354833041;
        kd.livp[90] = 1196876650;
        kd.livp[91] = -1958208252;
        kd.livp[92] = -1335165011;
        kd.livp[93] = -1931105105;
        kd.livp[94] = 474471337;
        kd.livp[95] = 638839131;
        kd.livp[96] = -473701136;
        kd.livp[97] = -1927352324;
        kd.livp[98] = -1427986877;
        kd.livp[99] = -2093506032;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getHexString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljjp", liwa(int ), (int)139)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("ljjq", livn(int ), (int)219)) break;
            v0 /* !! */  = (long)kd.livq("ljjr", livn(int ), (int)220);
        }
        var4_1 = kd.c;
        v1 /* !! */  = kd.ty;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - kd.livq("ljjs", liwa(int ), (int)140));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -403782851: {
                    break block23;
                }
                case 87728367: {
                    v2 = kd.livq("ljjt", liwa(int ), (int)141);
                    continue block23;
                }
                case 701030487: {
                    v2 = kd.livq("ljju", liwa(int ), (int)142);
                    continue block23;
                }
                case 1639706937: {
                    v2 = kd.livq("ljjv", liwa(int ), (int)143);
                    continue block23;
                }
            }
            break;
        }
        var3_2 = kd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljjw", liwa(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kd.livq("ljjx", livn(int ), (int)221)) break;
            v3 /* !! */  = (long)kd.livq("ljjy", livn(int ), (int)222);
        }
        var2_3 = kd.a;
        if (var4_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl34
        v4 /* !! */  = kd.ty;
        if (true) ** GOTO lbl41
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - kd.livq("ljjz", liwa(int ), (int)145));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -880007117: {
                    v5 = kd.livq("ljka", liwa(int ), (int)146);
                    continue block26;
                }
                case -403782851: {
                    break block26;
                }
                case 1858363300: {
                    v5 = kd.livq("ljkb", liwa(int ), (int)147);
                    continue block26;
                }
                case 2111987914: {
                    v5 = kd.livq("ljkc", liwa(int ), (int)148);
                    continue block26;
                }
            }
            break;
        }
        var1_4 = this.getColorNoAlpha();
        ** while (var2_3 || var2_3)
lbl55:
        // 1 sources

        v6 = new Object[1];
        v7 = kd.livq("ljkd", livn(int ), (int)223);
        v8 = var1_4 & kd.livq("ljke", livn(int ), (int)224);
        v9 /* !! */  = kd.ty;
        if (true) ** GOTO lbl62
        block27: while (true) {
            v9 /* !! */  = (long)(v10 - kd.livq("ljkf", liwa(int ), (int)149));
lbl62:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -403782851: {
                    break block27;
                }
                case 39063574: {
                    v10 = kd.livq("ljkg", liwa(int ), (int)150);
                    continue block27;
                }
                case 108687096: {
                    v10 = kd.livq("ljkh", liwa(int ), (int)151);
                    continue block27;
                }
                case 757438891: {
                    v10 = kd.livq("ljki", liwa(int ), (int)152);
                    continue block27;
                }
            }
            break;
        }
        v6[v7] = v8;
        v11 /* !! */  = kd.ty;
        if (true) ** GOTO lbl79
        block28: while (true) {
            v11 /* !! */  = (long)(kd.livq("ljkk", liwa(int ), (int)154) - kd.livq("ljkj", liwa(int ), (int)153));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1659236867: {
                    continue block28;
                }
                case -403782851: {
                    break block28;
                }
            }
            break;
        }
        return String.format("#%06X", v6);
    }

    private static /* synthetic */ int livn(int n2) {
        return livo[n2] ^ livp[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPreviousColorsCount(int n2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ty - kd.livq("ljqq", liwa(int ), (int)243)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == kd.livq("ljqr", livn(int ), (int)298)) break;
            object = kd.livq("ljqs", livn(int ), (int)299);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ty - kd.livq("ljqt", liwa(int ), (int)244)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == kd.livq("ljqu", livn(int ), (int)300)) break;
            object = kd.livq("ljqv", livn(int ), (int)301);
        }
        int n3 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ty - kd.livq("ljqw", liwa(int ), (int)245)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == kd.livq("ljqx", livn(int ), (int)302)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = kd.livq("ljqy", livn(int ), (int)303);
        }
        if (bl2 || bl2) return;
        while (true) {
            Object object;
            block7: {
                long l5;
                if ((object = (l5 = ty - kd.livq("ljqz", liwa(int ), (int)246)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == kd.livq("ljra", livn(int ), (int)304)) {
                    this.previousColorsCount = n2;
                    if (!bl2) return;
                }
                break block7;
                return;
            }
            object = kd.livq("ljrb", livn(int ), (int)305);
        }
    }

    private static /* synthetic */ long liwa(int n2) {
        return liwb[n2] ^ liwc[n2];
    }

    public static /* synthetic */ CallSite livq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ljrq() {
        kd.liwb[100] = -4639017930650550870L;
        kd.liwb[101] = 6648420583535122198L;
        kd.liwb[102] = 4537128267037559720L;
        kd.liwb[103] = 8601108170074695561L;
        kd.liwb[104] = -4849250708153918260L;
        kd.liwb[105] = 2443303375748452431L;
        kd.liwb[106] = -7916092131365628207L;
        kd.liwb[107] = -3455967937354007884L;
        kd.liwb[108] = -2028732116741514297L;
        kd.liwb[109] = 5018278008961969895L;
        kd.liwb[110] = 1225772282985805366L;
        kd.liwb[111] = 23791411383607004L;
        kd.liwb[112] = 5107157378901674071L;
        kd.liwb[113] = 3383965599434791863L;
        kd.liwb[114] = 112576954578693327L;
        kd.liwb[115] = 7011122111893559927L;
        kd.liwb[116] = 8363154247790097072L;
        kd.liwb[117] = 8047667298110657678L;
        kd.liwb[118] = 6978491424013879639L;
        kd.liwb[119] = 4886011110178778439L;
        kd.liwb[120] = 5398853151562475454L;
        kd.liwb[121] = 7337287985523637467L;
        kd.liwb[122] = 2295220046755696851L;
        kd.liwb[123] = 7783863212979168894L;
        kd.liwb[124] = -1523290272004566943L;
        kd.liwb[125] = -6547270508297901268L;
        kd.liwb[126] = 7900718091233316182L;
        kd.liwb[127] = 2869356892415697980L;
        kd.liwb[128] = 2122757261936011161L;
        kd.liwb[129] = -2595652751584353748L;
        kd.liwb[130] = -4079689405823954942L;
        kd.liwb[131] = -3950642272946736162L;
        kd.liwb[132] = -241479818725662583L;
        kd.liwb[133] = -2008757735254778849L;
        kd.liwb[134] = -675205511689317105L;
        kd.liwb[135] = -2362047744105818803L;
        kd.liwb[136] = -726101374247418534L;
        kd.liwb[137] = -7328086652158455744L;
        kd.liwb[138] = -5189565298230364206L;
        kd.liwb[139] = -1888694166058495660L;
        kd.liwb[140] = -8828987350250092860L;
        kd.liwb[141] = 5669714926743651696L;
        kd.liwb[142] = 3634968112618461554L;
        kd.liwb[143] = -7511718209672275088L;
        kd.liwb[144] = 6402253440693827037L;
        kd.liwb[145] = 3174331239225817808L;
        kd.liwb[146] = 8039005825014353680L;
        kd.liwb[147] = 8224109713332158000L;
        kd.liwb[148] = 4751728485217944069L;
        kd.liwb[149] = -8211920934206266361L;
        kd.liwb[150] = -193232952407973363L;
        kd.liwb[151] = -6322927724524682767L;
        kd.liwb[152] = -8879379900305926640L;
        kd.liwb[153] = 285277846290040086L;
        kd.liwb[154] = -217629958350862051L;
        kd.liwb[155] = 3972384165646631102L;
        kd.liwb[156] = 7763056845556538829L;
        kd.liwb[157] = -8346819326843335515L;
        kd.liwb[158] = -5760615637452145377L;
        kd.liwb[159] = -1174898631248796847L;
        kd.liwb[160] = -3199502554828244465L;
        kd.liwb[161] = -9135640676718455576L;
        kd.liwb[162] = -5400039016399163481L;
        kd.liwb[163] = -6352204142059348122L;
        kd.liwb[164] = 5659529453015264238L;
        kd.liwb[165] = 2496756446201135047L;
        kd.liwb[166] = -5825782648954297109L;
        kd.liwb[167] = 6114086839579515087L;
        kd.liwb[168] = -5319886536895087608L;
        kd.liwb[169] = 4414309518433785937L;
        kd.liwb[170] = -8890529162923114398L;
        kd.liwb[171] = -8027008300853472178L;
        kd.liwb[172] = 3800531686000660061L;
        kd.liwb[173] = -3974774615437913205L;
        kd.liwb[174] = -7401545133636880798L;
        kd.liwb[175] = 2879795495306479901L;
        kd.liwb[176] = 4802629176044482203L;
        kd.liwb[177] = -1704415884202367541L;
        kd.liwb[178] = 123776818701274916L;
        kd.liwb[179] = -7846700206209671868L;
        kd.liwb[180] = 2879300246758861663L;
        kd.liwb[181] = 8669279329250970693L;
        kd.liwb[182] = 2520234359235528631L;
        kd.liwb[183] = -2613547203413200281L;
        kd.liwb[184] = 1413216212868798175L;
        kd.liwb[185] = -3508582253897702478L;
        kd.liwb[186] = 1565114443460228986L;
        kd.liwb[187] = -1199378568775529530L;
        kd.liwb[188] = -991863816332001475L;
        kd.liwb[189] = -5747207179564923613L;
        kd.liwb[190] = 5773307208518699878L;
        kd.liwb[191] = 641102987181957934L;
        kd.liwb[192] = 684336853751061976L;
        kd.liwb[193] = 6385351530737805496L;
        kd.liwb[194] = -9058673943032781636L;
        kd.liwb[195] = 5837090190260961672L;
        kd.liwb[196] = 5569350495303923973L;
        kd.liwb[197] = 88775042527302587L;
        kd.liwb[198] = 6781678745244687010L;
        kd.liwb[199] = 1559456919959388545L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd setHue(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljej", liwa(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kd.livq("ljek", livn(int ), (int)137)) break;
            v0 /* !! */  = (long)kd.livq("ljel", livn(int ), (int)138);
        }
        var4_2 = kd.c;
        v1 /* !! */  = kd.ty;
        if (true) ** GOTO lbl11
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - kd.livq("ljem", liwa(int ), (int)86));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -670914508: {
                    v2 = kd.livq("ljen", liwa(int ), (int)87);
                    continue block30;
                }
                case -403782851: {
                    break block30;
                }
                case 460102976: {
                    v2 = kd.livq("ljeo", liwa(int ), (int)88);
                    continue block30;
                }
                case 687552633: {
                    v2 = kd.livq("ljep", liwa(int ), (int)89);
                    continue block30;
                }
            }
            break;
        }
        var3_3 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl28
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - kd.livq("ljeq", liwa(int ), (int)90));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -403782851: {
                    break block31;
                }
                case -225772396: {
                    v4 = kd.livq("ljer", liwa(int ), (int)91);
                    continue block31;
                }
                case 672498736: {
                    v4 = kd.livq("ljes", liwa(int ), (int)92);
                    continue block31;
                }
            }
            break;
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl40:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        v5 /* !! */  = kd.ty;
        if (true) ** GOTO lbl47
        block33: while (true) {
            v5 /* !! */  = (long)(v6 - kd.livq("ljet", liwa(int ), (int)93));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -498713370: {
                    v6 = kd.livq("ljeu", liwa(int ), (int)94);
                    continue block33;
                }
                case -403782851: {
                    break block33;
                }
                case 1510742391: {
                    v6 = kd.livq("ljev", liwa(int ), (int)95);
                    continue block33;
                }
                case 1677843507: {
                    v6 = kd.livq("ljew", liwa(int ), (int)96);
                    continue block33;
                }
            }
            break;
        }
        v7 = Math.min(1.0f, var1_1);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljex", liwa(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == kd.livq("ljey", livn(int ), (int)139)) break;
            v8 /* !! */  = (long)kd.livq("ljez", livn(int ), (int)140);
        }
        v9 = Math.max(0.0f, v7);
        v10 /* !! */  = kd.ty;
        if (true) ** GOTO lbl70
        block35: while (true) {
            v10 /* !! */  = (long)(kd.livq("ljfb", liwa(int ), (int)99) - kd.livq("ljfa", liwa(int ), (int)98));
lbl70:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -403782851: {
                    break block35;
                }
                case 1162989114: {
                    continue block35;
                }
            }
            break;
        }
        this.hue = v9;
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block21 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljfc", livn(int ), (int)141);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)kd.livq("ljfd", livn(int ), (int)142);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var3_3 /* !! */  = (int)kd.livq("ljfe", livn(int ), (int)143);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljff", livn(int ), (int)144);
                } while (!var4_2);
                throw null;
            }
lbl102:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("ljfg", livn(int ), (int)145);
                    if (!var4_2) break block21;
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kd.livq("ljfh", livn(int ), (int)146);
        ** while (!var4_2)
lbl110:
        // 1 sources

        throw null;
    }

    static {
        livo = new int[311];
        livp = new int[311];
        kd.ljrh();
        kd.ljri();
        kd.ljrj();
        kd.ljrk();
        kd.ljrl();
        kd.ljrm();
        kd.ljrn();
        kd.ljro();
        liwb = new long[247];
        liwc = new long[247];
        kd.ljrp();
        kd.ljrq();
        kd.ljrr();
        kd.ljrs();
        kd.ljrt();
        kd.ljru();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public Color getAwtColor() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljdn", liwa(int ), (int)74));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block25;
                }
                case -119285808: {
                    v1 = kd.livq("ljdo", liwa(int ), (int)75);
                    continue block25;
                }
                case 1976031342: {
                    v1 = kd.livq("ljdp", liwa(int ), (int)76);
                    continue block25;
                }
            }
            break;
        }
        var4_1 = kd.c;
        while (true) {
            block43: {
                if ((v2 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljdq", liwa(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != kd.livq("ljdr", livn(int ), (int)126)) break block43;
                var3_2 /* !! */  = kd.b;
                if (var3_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)kd.livq("ljds", livn(int ), (int)127);
        }
        cfr_temp_0 = -2147483648;
        block27: while (true) {
            block44: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("ljdt", liwa(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == kd.livq("ljdu", livn(int ), (int)128)) {
                                var2_3 = kd.a;
                                if (var4_1) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)kd.livq("ljdv", livn(int ), (int)129);
                        }
                        if (var2_3 != false) return null;
                        if (var2_3 != false) return null;
                        v4 /* !! */  = kd.ty;
                        block29: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -403782851: {
                                    break block29;
                                }
                                case 1475149032: {
                                    v4 /* !! */  = (long)(kd.livq("ljdx", liwa(int ), (int)80) - kd.livq("ljdw", liwa(int ), (int)79));
                                    continue block29;
                                }
                            }
                            break;
                        }
                        var1_4 = this.getColor();
                        if (var2_3 != false) return null;
                        if (var2_3 != false) return null;
                        v5 /* !! */  = kd.ty;
                        block30: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -571295020: {
                                    v5 /* !! */  = (long)(kd.livq("ljdz", liwa(int ), (int)82) - kd.livq("ljdy", liwa(int ), (int)81));
                                    continue block30;
                                }
                                case -403782851: {
                                    break block30;
                                }
                            }
                            break;
                        }
                        v6 = kd.livq("ljea", livn(int ), (int)130);
                        v7 /* !! */  = kd.ty;
                        block31: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -403782851: {
                                    return new Color(var1_4, (boolean)v6);
                                }
                                case 163205650: {
                                    v7 /* !! */  = (long)(kd.livq("ljec", liwa(int ), (int)84) - kd.livq("ljeb", liwa(int ), (int)83));
                                    continue block31;
                                }
                            }
                            break;
                        }
                        return new Color(var1_4, (boolean)v6);
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)kd.livq("ljee", livn(int ), (int)132);
                        cfr_temp_0 = 4;
                        if (var4_1) {
                            throw null;
                        }
                        break block44;
                    }
                    case 3: {
                        ** GOTO lbl83
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)kd.livq("ljei", livn(int ), (int)136);
                        if (var4_1) {
                            throw null;
                        }
lbl83:
                        // 3 sources

                        var3_2 /* !! */  = (int)kd.livq("ljeg", livn(int ), (int)134);
                        cfr_temp_0 = 4;
                        if (var4_1) {
                            throw null;
                        }
                        break block44;
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)kd.livq("ljed", livn(int ), (int)131);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)kd.livq("ljef", livn(int ), (int)133);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl101
            }
            do {
                if (true) continue block27;
lbl101:
                // 2 sources

                var3_2 /* !! */  = (int)kd.livq("ljeh", livn(int ), (int)135);
                cfr_temp_0 = 0;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getColorNoAlpha() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljai", liwa(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("ljaj", livn(int ), (int)76)) break;
            v0 /* !! */  = (long)kd.livq("ljak", livn(int ), (int)77);
        }
        var3_1 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljal", liwa(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("ljam", livn(int ), (int)78)) break;
            v1 /* !! */  = (long)kd.livq("ljan", livn(int ), (int)79);
        }
        var2_2 /* !! */  = kd.b;
        v2 /* !! */  = kd.ty;
        if (true) ** GOTO lbl19
        block31: while (true) {
            v2 /* !! */  = (long)(v3 - kd.livq("ljao", liwa(int ), (int)43));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -741827980: {
                    v3 = kd.livq("ljap", liwa(int ), (int)44);
                    continue block31;
                }
                case -403782851: {
                    break block31;
                }
                case 1581506387: {
                    v3 = kd.livq("ljaq", liwa(int ), (int)45);
                    continue block31;
                }
                case 1800176351: {
                    v3 = kd.livq("ljar", liwa(int ), (int)46);
                    continue block31;
                }
            }
            break;
        }
        var1_3 = kd.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)kd.livq("ljas", livn(int ), (int)80);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = kd.ty;
                if (true) ** GOTO lbl44
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - kd.livq("ljat", liwa(int ), (int)47));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -403782851: {
                            break block33;
                        }
                        case 146249801: {
                            v5 = kd.livq("ljau", liwa(int ), (int)48);
                            continue block33;
                        }
                        case 712662801: {
                            v5 = kd.livq("ljav", liwa(int ), (int)49);
                            continue block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("ljaw", liwa(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == kd.livq("ljax", livn(int ), (int)81)) break;
                    v6 /* !! */  = (long)kd.livq("ljay", livn(int ), (int)82);
                }
                v7 /* !! */  = kd.ty;
                if (true) ** GOTO lbl63
                block35: while (true) {
                    v7 /* !! */  = (long)(v8 - kd.livq("ljaz", liwa(int ), (int)51));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -403782851: {
                            break block35;
                        }
                        case 73704314: {
                            v8 = kd.livq("ljba", liwa(int ), (int)52);
                            continue block35;
                        }
                        case 941181082: {
                            v8 = kd.livq("ljbb", liwa(int ), (int)53);
                            continue block35;
                        }
                        case 1864901319: {
                            v8 = kd.livq("ljbc", liwa(int ), (int)54);
                            continue block35;
                        }
                    }
                    break;
                }
                v9 /* !! */  = kd.ty;
                if (true) ** GOTO lbl79
                block36: while (true) {
                    v9 /* !! */  = (long)(v10 - kd.livq("ljbd", liwa(int ), (int)55));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -430405778: {
                            v10 = kd.livq("ljbe", liwa(int ), (int)56);
                            continue block36;
                        }
                        case -403782851: {
                            break block36;
                        }
                        case -226854583: {
                            v10 = kd.livq("ljbf", liwa(int ), (int)57);
                            continue block36;
                        }
                        case 1703377617: {
                            v10 = kd.livq("ljbg", liwa(int ), (int)58);
                            continue block36;
                        }
                    }
                    break;
                }
                return Color.HSBtoRGB(this.hue, this.saturation, this.brightness) | kd.livq("ljbh", livn(int ), (int)83);
            }
            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljbi", livn(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl97:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)kd.livq("ljbj", livn(int ), (int)85);
                if (var3_1) {
                    throw null;
                }
            }
lbl101:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kd.livq("ljbk", livn(int ), (int)86);
                    if (!var3_1) ** GOTO lbl97
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kd.livq("ljbl", livn(int ), (int)87);
        ** while (!var3_1)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float getHue() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ty - kd.livq("ljkr", liwa(int ), (int)155)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == kd.livq("ljks", livn(int ), (int)231)) break;
            object = kd.livq("ljkt", livn(int ), (int)232);
        }
        boolean bl2 = c;
        Object object = ty;
        block14: while (true) {
            switch ((int)object) {
                case -1041422167: {
                    object = kd.livq("ljkv", liwa(int ), (int)157) - kd.livq("ljku", liwa(int ), (int)156);
                    continue block14;
                }
                case -403782851: {
                    break block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = ty;
        block15: while (true) {
            switch ((int)object2) {
                case -403782851: {
                    break block15;
                }
                case 1716338875: {
                    object2 = kd.livq("ljkx", liwa(int ), (int)159) - kd.livq("ljkw", liwa(int ), (int)158);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (float)kd.livq("ljky", lize(int ), (int)233);
        if (bl3) return (float)kd.livq("ljky", lize(int ), (int)233);
        Object object3 = ty;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - kd.livq("ljkz", liwa(int ), (int)160);
            }
            switch ((int)object3) {
                case -796129500: {
                    callSite = kd.livq("ljla", liwa(int ), (int)161);
                    continue block16;
                }
                case -403782851: {
                    return this.hue;
                }
                case 1220683457: {
                    callSite = kd.livq("ljlb", liwa(int ), (int)162);
                    continue block16;
                }
            }
            break;
        }
        return this.hue;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kd setColor(int var1_1) {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljbm", liwa(int ), (int)59));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1180549870: {
                    v1 = kd.livq("ljbn", liwa(int ), (int)60);
                    continue block43;
                }
                case -403782851: {
                    break block43;
                }
                case 741526485: {
                    v1 = kd.livq("ljbo", liwa(int ), (int)61);
                    continue block43;
                }
            }
            break;
        }
        var9_2 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljbp", liwa(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kd.livq("ljbq", livn(int ), (int)88)) break;
            v2 /* !! */  = (long)kd.livq("ljbr", livn(int ), (int)89);
        }
        var8_3 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        block45: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -403782851: {
                    break block45;
                }
                case 566022498: {
                    v3 /* !! */  = (long)(kd.livq("ljbt", liwa(int ), (int)64) - kd.livq("ljbs", liwa(int ), (int)63));
                    continue block45;
                }
            }
            break;
        }
        var7_4 = kd.a;
        if (var9_2) {
            throw null;
        }
        if (var7_4 || var7_4) return null;
        var2_5 = var1_1 >> kd.livq("ljbu", livn(int ), (int)90) & kd.livq("ljbv", livn(int ), (int)91);
        if (var7_4 || var7_4) return null;
        var3_6 = var1_1 >> kd.livq("ljbw", livn(int ), (int)92) & kd.livq("ljbx", livn(int ), (int)93);
        if (var7_4 || var7_4) return null;
        var4_7 = var1_1 & kd.livq("ljby", livn(int ), (int)94);
        if (var7_4 || var7_4) return null;
        var5_8 = var1_1 >> kd.livq("ljbz", livn(int ), (int)95) & kd.livq("ljca", livn(int ), (int)96);
        if (var7_4 || var7_4) return null;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("ljcb", liwa(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kd.livq("ljcc", livn(int ), (int)97)) {
                var6_9 = Color.RGBtoHSB(var2_5, var3_6, var4_7, null);
                if (var7_4) return null;
                break;
            }
            v4 /* !! */  = (long)kd.livq("ljcd", livn(int ), (int)98);
        }
        if (var7_4) return null;
        v5 = var6_9[0];
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = kd.ty - kd.livq("ljce", liwa(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == kd.livq("ljcf", livn(int ), (int)99)) {
                this.hue = v5;
                if (var7_4) return null;
                break;
            }
            v6 /* !! */  = (long)kd.livq("ljcg", livn(int ), (int)100);
        }
        if (var7_4) return null;
        v7 = var6_9[1];
        v8 /* !! */  = kd.ty;
        if (true) ** GOTO lbl65
        block48: while (true) {
            v8 /* !! */  = (long)(v9 - kd.livq("ljch", liwa(int ), (int)67));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -853629216: {
                    v9 = kd.livq("ljci", liwa(int ), (int)68);
                    continue block48;
                }
                case -455783417: {
                    v9 = kd.livq("ljcj", liwa(int ), (int)69);
                    continue block48;
                }
                case -403782851: {
                    break block48;
                }
                case 1674619191: {
                    v9 = kd.livq("ljck", liwa(int ), (int)70);
                    continue block48;
                }
            }
            break;
        }
        this.saturation = v7;
        if (var7_4 || var7_4) return null;
        v10 = var6_9[2];
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = kd.ty - kd.livq("ljcl", liwa(int ), (int)71)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == kd.livq("ljcm", livn(int ), (int)101)) {
                this.brightness = v10;
                if (var7_4) return null;
                break;
            }
            v11 /* !! */  = (long)kd.livq("ljcn", livn(int ), (int)102);
        }
        if (var7_4) return null;
        v12 = (float)var5_8 / kd.livq("ljco", lize(int ), (int)103);
        v13 /* !! */  = kd.ty;
        block50: while (true) {
            switch ((int)v13 /* !! */ ) {
                case -403782851: {
                    break block50;
                }
                case 2062383987: {
                    v13 /* !! */  = (long)(kd.livq("ljcq", liwa(int ), (int)73) - kd.livq("ljcp", liwa(int ), (int)72));
                    continue block50;
                }
            }
            break;
        }
        this.alpha = v12;
        if (var7_4) return null;
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block51: do {
            switch (cfr_temp_0 == -2147483648 ? var8_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var7_4) return this;
                    return null;
                }
                case 0: {
                    var8_3 /* !! */  = (int)kd.livq("ljcr", livn(int ), (int)104);
                    cfr_temp_0 = 16;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 2: {
                    var8_3 /* !! */  = (int)kd.livq("ljct", livn(int ), (int)106);
                    cfr_temp_0 = 3;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 5: {
                    var8_3 /* !! */  = (int)kd.livq("ljcw", livn(int ), (int)109);
                    if (!var9_2) ** break;
                    throw null;
                }
                case 6: {
                    ** GOTO lbl194
                }
                case 8: {
                    var8_3 /* !! */  = (int)kd.livq("ljcz", livn(int ), (int)112);
                    cfr_temp_0 = 3;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 10: {
                    var8_3 /* !! */  = (int)kd.livq("ljdb", livn(int ), (int)114);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 11: {
                    var8_3 /* !! */  = (int)kd.livq("ljdc", livn(int ), (int)115);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 3: {
                    do {
                        var8_3 /* !! */  = (int)kd.livq("ljcu", livn(int ), (int)107);
                    } while (!var9_2);
                    throw null;
                }
                case 15: {
                    var8_3 /* !! */  = (int)kd.livq("ljdg", livn(int ), (int)119);
                    cfr_temp_0 = 19;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 16: {
                    var8_3 /* !! */  = (int)kd.livq("ljdh", livn(int ), (int)120);
                    cfr_temp_0 = 7;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 17: {
                    var8_3 /* !! */  = (int)kd.livq("ljdi", livn(int ), (int)121);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 4: {
                    var8_3 /* !! */  = (int)kd.livq("ljcv", livn(int ), (int)108);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 12: {
                    var8_3 /* !! */  = (int)kd.livq("ljdd", livn(int ), (int)116);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 14: {
                    var8_3 /* !! */  = (int)kd.livq("ljdf", livn(int ), (int)118);
                    cfr_temp_0 = 9;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 18: {
                    var8_3 /* !! */  = (int)kd.livq("ljdj", livn(int ), (int)122);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 19: {
                    var8_3 /* !! */  = (int)kd.livq("ljdk", livn(int ), (int)123);
                    cfr_temp_0 = 7;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 20: {
                    var8_3 /* !! */  = (int)kd.livq("ljdl", livn(int ), (int)124);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 1: {
                    var8_3 /* !! */  = (int)kd.livq("ljcs", livn(int ), (int)105);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 13: {
                    var8_3 /* !! */  = (int)kd.livq("ljde", livn(int ), (int)117);
                    cfr_temp_0 = 7;
                    if (!var9_2) continue block51;
                    throw null;
                }
                case 21: {
                    var8_3 /* !! */  = (int)kd.livq("ljdm", livn(int ), (int)125);
                    if (var9_2) {
                        throw null;
                    }
lbl194:
                    // 3 sources

                    var8_3 /* !! */  = (int)kd.livq("ljcx", livn(int ), (int)110);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 9: {
                    var8_3 /* !! */  = (int)kd.livq("ljda", livn(int ), (int)113);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 7: 
            }
            break;
        } while (true);
        do {
            var8_3 /* !! */  = (int)kd.livq("ljcy", livn(int ), (int)111);
        } while (!var9_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd(String var1_1, String var2_2) {
        var4_3 /* !! */  = kd.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                this.hue = 0.0f;
                this.saturation = 1.0f;
                this.brightness = 1.0f;
                this.alpha = 1.0f;
                this.presets = new int[0];
                this.previousColors = new int[8];
                this.previousColorsCount = (int)kd.livq("livr", livn(int ), (int)0);
                return;
            }
lbl14:
            // 3 sources

            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)kd.livq("livs", livn(int ), (int)1);
                }
            }
lbl18:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)kd.livq("livt", livn(int ), (int)2);
                    ** GOTO lbl14
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)kd.livq("livu", livn(int ), (int)3);
                ** GOTO lbl29
            }
            case 3: {
                while (true) {
                    var4_3 /* !! */  = (int)kd.livq("livv", livn(int ), (int)4);
                }
            }
lbl29:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)kd.livq("livw", livn(int ), (int)5);
                ** GOTO lbl14
            }
            case 5: {
                while (true) {
                    var4_3 /* !! */  = (int)kd.livq("livx", livn(int ), (int)6);
                }
            }
            case 6: {
                var4_3 /* !! */  = (int)kd.livq("livy", livn(int ), (int)7);
                ** GOTO lbl18
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)kd.livq("livz", livn(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getColorWithAlpha() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block13: while (true) {
            v0 /* !! */  = (long)(kd.livq("lizu", liwa(int ), (int)34) - kd.livq("lizt", liwa(int ), (int)33));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -428603951: {
                    continue block13;
                }
                case -403782851: {
                    break block13;
                }
            }
            break;
        }
        var3_1 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("lizv", liwa(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("lizw", livn(int ), (int)69)) break;
            v1 /* !! */  = (long)kd.livq("lizx", livn(int ), (int)70);
        }
        var2_2 = kd.b;
        v2 /* !! */  = kd.ty;
        if (true) ** GOTO lbl22
        block15: while (true) {
            v2 /* !! */  = (long)(v3 - kd.livq("lizy", liwa(int ), (int)36));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1825781918: {
                    v3 = kd.livq("lizz", liwa(int ), (int)37);
                    continue block15;
                }
                case -403782851: {
                    break block15;
                }
                case 423534603: {
                    v3 = kd.livq("ljaa", liwa(int ), (int)38);
                    continue block15;
                }
            }
            break;
        }
        var1_3 = kd.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (int)kd.livq("ljab", livn(int ), (int)71);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = kd.ty;
        if (true) ** GOTO lbl41
        block17: while (true) {
            v4 /* !! */  = (long)(kd.livq("ljad", liwa(int ), (int)40) - kd.livq("ljac", liwa(int ), (int)39));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2140613681: {
                    continue block17;
                }
                case -403782851: {
                    break block17;
                }
            }
            break;
        }
        return this.getColor();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getBrightness() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("ljlz", liwa(int ), (int)173));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block22;
                }
                case -319234153: {
                    v1 = kd.livq("ljma", liwa(int ), (int)174);
                    continue block22;
                }
                case -117278547: {
                    v1 = kd.livq("ljmb", liwa(int ), (int)175);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljmc", liwa(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("ljmd", livn(int ), (int)247)) break;
            v2 /* !! */  = (long)kd.livq("ljme", livn(int ), (int)248);
        }
        var2_2 /* !! */  = kd.b;
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - kd.livq("ljmf", liwa(int ), (int)177));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2022918881: {
                    v4 = kd.livq("ljmg", liwa(int ), (int)178);
                    continue block24;
                }
                case -1269206961: {
                    v4 = kd.livq("ljmh", liwa(int ), (int)179);
                    continue block24;
                }
                case -403782851: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = kd.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (float)kd.livq("ljmi", lize(int ), (int)249);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = kd.ty;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - kd.livq("ljmj", liwa(int ), (int)180));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -417975607: {
                            v6 = kd.livq("ljmk", liwa(int ), (int)181);
                            continue block26;
                        }
                        case -403782851: {
                            break block26;
                        }
                        case 243575357: {
                            v6 = kd.livq("ljml", liwa(int ), (int)182);
                            continue block26;
                        }
                        case 886923919: {
                            v6 = kd.livq("ljmm", liwa(int ), (int)183);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.brightness;
            }
            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljmn", livn(int ), (int)250);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)kd.livq("ljmo", livn(int ), (int)251);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)kd.livq("ljmp", livn(int ), (int)252);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)kd.livq("ljmq", livn(int ), (int)253);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd setBrightness(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljgf", liwa(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("ljgg", livn(int ), (int)159)) break;
            v0 /* !! */  = (long)kd.livq("ljgh", livn(int ), (int)160);
        }
        var4_2 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljgi", liwa(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("ljgj", livn(int ), (int)161)) break;
            v1 /* !! */  = (long)kd.livq("ljgk", livn(int ), (int)162);
        }
        var3_3 /* !! */  = kd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("ljgl", liwa(int ), (int)113)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("ljgm", livn(int ), (int)163)) break;
            v2 /* !! */  = (long)kd.livq("ljgn", livn(int ), (int)164);
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl24
        v3 /* !! */  = kd.ty;
        if (true) ** GOTO lbl31
        block28: while (true) {
            v3 /* !! */  = (long)(kd.livq("ljgp", liwa(int ), (int)115) - kd.livq("ljgo", liwa(int ), (int)114));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -403782851: {
                    break block28;
                }
                case 1330539168: {
                    continue block28;
                }
            }
            break;
        }
        v4 = Math.min(1.0f, var1_1);
        v5 /* !! */  = kd.ty;
        if (true) ** GOTO lbl41
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - kd.livq("ljgq", liwa(int ), (int)116));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2129929218: {
                    v6 = kd.livq("ljgr", liwa(int ), (int)117);
                    continue block29;
                }
                case -1076921702: {
                    v6 = kd.livq("ljgs", liwa(int ), (int)118);
                    continue block29;
                }
                case -403782851: {
                    break block29;
                }
                case 2145200192: {
                    v6 = kd.livq("ljgt", liwa(int ), (int)119);
                    continue block29;
                }
            }
            break;
        }
        v7 = Math.max(0.0f, v4);
        v8 /* !! */  = kd.ty;
        if (true) ** GOTO lbl58
        block30: while (true) {
            v8 /* !! */  = (long)(v9 - kd.livq("ljgu", liwa(int ), (int)120));
lbl58:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1883863574: {
                    v9 = kd.livq("ljgv", liwa(int ), (int)121);
                    continue block30;
                }
                case -811328027: {
                    v9 = kd.livq("ljgw", liwa(int ), (int)122);
                    continue block30;
                }
                case -403782851: {
                    break block30;
                }
                case 1336736773: {
                    v9 = kd.livq("ljgx", liwa(int ), (int)123);
                    continue block30;
                }
            }
            break;
        }
        this.brightness = v7;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl76:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kd.livq("ljgy", livn(int ), (int)165);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljgz", livn(int ), (int)166);
                } while (!var4_2);
                throw null;
            }
lbl86:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("ljha", livn(int ), (int)167);
                    if (!var4_2) ** GOTO lbl76
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("ljhb", livn(int ), (int)168);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)kd.livq("ljhc", livn(int ), (int)169);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kd.livq("ljhd", livn(int ), (int)170);
        ** while (!var4_2)
lbl103:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setPreviousColors(int[] var1_1) {
        v0 /* !! */  = kd.ty;
        block21: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block21;
                }
                case 1143919163: {
                    v0 /* !! */  = (long)(kd.livq("ljqb", liwa(int ), (int)235) - kd.livq("ljqa", liwa(int ), (int)234));
                    continue block21;
                }
            }
            break;
        }
        var4_2 = kd.c;
        v1 /* !! */  = kd.ty;
        block22: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -403782851: {
                    break block22;
                }
                case 1442771038: {
                    v1 /* !! */  = (long)(kd.livq("ljqd", liwa(int ), (int)237) - kd.livq("ljqc", liwa(int ), (int)236));
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = kd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljqe", liwa(int ), (int)238)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("ljqf", livn(int ), (int)291)) {
                var2_4 = kd.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)kd.livq("ljqg", livn(int ), (int)292);
        }
        if (var2_4 || var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block24: while (true) {
            block36: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = kd.ty;
                        block25: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -491986643: {
                                    v4 = kd.livq("ljqi", liwa(int ), (int)240);
                                    ** GOTO lbl48
                                }
                                case -403782851: {
                                    break block25;
                                }
                                case 540997132: {
                                    v4 = kd.livq("ljqj", liwa(int ), (int)241);
                                    ** GOTO lbl48
                                }
                                case 1279357967: {
                                    v4 = kd.livq("ljqk", liwa(int ), (int)242);
lbl48:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - kd.livq("ljqh", liwa(int ), (int)239));
                                    continue block25;
                                }
                            }
                            break;
                        }
                        this.previousColors = var1_1;
                        if (!var2_4) return;
                        return;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)kd.livq("ljqm", livn(int ), (int)294);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block36;
                    }
                    case 2: {
                        ** GOTO lbl70
                    }
                    case 4: {
                        ** GOTO lbl67
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)kd.livq("ljql", livn(int ), (int)293);
                        if (!var4_2) ** break;
                        throw null;
lbl67:
                        // 2 sources

                        var3_3 /* !! */  = (int)kd.livq("ljqp", livn(int ), (int)297);
                        if (var4_2) {
                            throw null;
                        }
lbl70:
                        // 3 sources

                        var3_3 /* !! */  = (int)kd.livq("ljqn", livn(int ), (int)295);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl78
            }
            do {
                if (true) continue block24;
lbl78:
                // 2 sources

                var3_3 /* !! */  = (int)kd.livq("ljqo", livn(int ), (int)296);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ljrm() {
        kd.livp[100] = -1862679643;
        kd.livp[101] = 1697546796;
        kd.livp[102] = -1584263739;
        kd.livp[103] = -2082137101;
        kd.livp[104] = -1730056898;
        kd.livp[105] = 1596112563;
        kd.livp[106] = -977117969;
        kd.livp[107] = -698324606;
        kd.livp[108] = -127590357;
        kd.livp[109] = 443062302;
        kd.livp[110] = 246505048;
        kd.livp[111] = -141124608;
        kd.livp[112] = -713217213;
        kd.livp[113] = 1342526895;
        kd.livp[114] = -1150119110;
        kd.livp[115] = -495499311;
        kd.livp[116] = 1797987383;
        kd.livp[117] = -1492039547;
        kd.livp[118] = 811562246;
        kd.livp[119] = 344357811;
        kd.livp[120] = -1014384245;
        kd.livp[121] = 242578042;
        kd.livp[122] = -1262867569;
        kd.livp[123] = 759168737;
        kd.livp[124] = 571150784;
        kd.livp[125] = -400404362;
        kd.livp[126] = -627478456;
        kd.livp[127] = 1380111349;
        kd.livp[128] = -1049898353;
        kd.livp[129] = 1818092117;
        kd.livp[130] = -640821352;
        kd.livp[131] = -1458108806;
        kd.livp[132] = 2065496712;
        kd.livp[133] = 1156076291;
        kd.livp[134] = 363076630;
        kd.livp[135] = 1274552755;
        kd.livp[136] = -1876552773;
        kd.livp[137] = -1322919603;
        kd.livp[138] = -520200509;
        kd.livp[139] = -792622879;
        kd.livp[140] = 1952432196;
        kd.livp[141] = -1575051018;
        kd.livp[142] = 1558160967;
        kd.livp[143] = 784698;
        kd.livp[144] = 167836154;
        kd.livp[145] = 807312456;
        kd.livp[146] = 896616492;
        kd.livp[147] = 1356152105;
        kd.livp[148] = 466311977;
        kd.livp[149] = 171719213;
        kd.livp[150] = -1815301923;
        kd.livp[151] = -1221634588;
        kd.livp[152] = 493025837;
        kd.livp[153] = -1572497437;
        kd.livp[154] = 1250906672;
        kd.livp[155] = 1444201242;
        kd.livp[156] = -554736448;
        kd.livp[157] = -1760567912;
        kd.livp[158] = 692218840;
        kd.livp[159] = 904278621;
        kd.livp[160] = -899002249;
        kd.livp[161] = 949404545;
        kd.livp[162] = -627709487;
        kd.livp[163] = 1202840097;
        kd.livp[164] = -1821626849;
        kd.livp[165] = -123673912;
        kd.livp[166] = -879319985;
        kd.livp[167] = 2111577280;
        kd.livp[168] = 195773251;
        kd.livp[169] = 1843948745;
        kd.livp[170] = -1831130684;
        kd.livp[171] = 1596260847;
        kd.livp[172] = 1744579096;
        kd.livp[173] = -1013297299;
        kd.livp[174] = 1756579187;
        kd.livp[175] = -715745231;
        kd.livp[176] = 323450872;
        kd.livp[177] = -92712604;
        kd.livp[178] = 858251716;
        kd.livp[179] = 1884280639;
        kd.livp[180] = -1493250764;
        kd.livp[181] = -1451657529;
        kd.livp[182] = 407027463;
        kd.livp[183] = 1855757198;
        kd.livp[184] = 1928564237;
        kd.livp[185] = 552356046;
        kd.livp[186] = 252832775;
        kd.livp[187] = 32361058;
        kd.livp[188] = -296008285;
        kd.livp[189] = 2074341726;
        kd.livp[190] = 852776368;
        kd.livp[191] = -340457122;
        kd.livp[192] = -511981564;
        kd.livp[193] = -679653696;
        kd.livp[194] = 627565230;
        kd.livp[195] = 101440350;
        kd.livp[196] = -1083641755;
        kd.livp[197] = 1657474707;
        kd.livp[198] = 1896555859;
        kd.livp[199] = -1624295804;
    }

    private static /* synthetic */ void ljrs() {
        kd.liwc[0] = 387778428983289120L;
        kd.liwc[1] = -4736980773494251777L;
        kd.liwc[2] = -7156955183832304307L;
        kd.liwc[3] = -973936975378522723L;
        kd.liwc[4] = -6848739767720407308L;
        kd.liwc[5] = 2072240788539952548L;
        kd.liwc[6] = 2862697284690610266L;
        kd.liwc[7] = 7345913435030308383L;
        kd.liwc[8] = 7299518654670837190L;
        kd.liwc[9] = 8856703077925808062L;
        kd.liwc[10] = 8815925320981145175L;
        kd.liwc[11] = 812312677160071603L;
        kd.liwc[12] = 95751200856501614L;
        kd.liwc[13] = 123527653458381988L;
        kd.liwc[14] = -2616583196741898628L;
        kd.liwc[15] = -6765797436170940172L;
        kd.liwc[16] = -4812541639200476296L;
        kd.liwc[17] = 3581083119769457425L;
        kd.liwc[18] = 5888695750005454653L;
        kd.liwc[19] = -3742980416032115872L;
        kd.liwc[20] = -1249641095507239299L;
        kd.liwc[21] = -4983593779977948301L;
        kd.liwc[22] = 7555260284036857510L;
        kd.liwc[23] = 9031046513244026535L;
        kd.liwc[24] = 7588120709773178911L;
        kd.liwc[25] = -8512866691436391205L;
        kd.liwc[26] = 4732883682210946346L;
        kd.liwc[27] = -3688608083884694350L;
        kd.liwc[28] = 7578198495259605185L;
        kd.liwc[29] = -6328085678254597015L;
        kd.liwc[30] = -2401300576800624918L;
        kd.liwc[31] = -3314939595483109560L;
        kd.liwc[32] = -2827268899721340207L;
        kd.liwc[33] = 6589223781605729575L;
        kd.liwc[34] = -6646024119097845869L;
        kd.liwc[35] = 3570986916460213648L;
        kd.liwc[36] = -8808881923658720718L;
        kd.liwc[37] = -6101549609397966897L;
        kd.liwc[38] = -7405910358791678749L;
        kd.liwc[39] = 550201835191917680L;
        kd.liwc[40] = 2125281188182883388L;
        kd.liwc[41] = -3619465702827869592L;
        kd.liwc[42] = -524218170165774461L;
        kd.liwc[43] = 1611109997591810008L;
        kd.liwc[44] = -1047058311906039975L;
        kd.liwc[45] = -6644739974723808119L;
        kd.liwc[46] = -6740386187628213507L;
        kd.liwc[47] = -1973047973992141958L;
        kd.liwc[48] = -2473204482128225433L;
        kd.liwc[49] = -5279488703201224226L;
        kd.liwc[50] = -2774224795636571917L;
        kd.liwc[51] = -2175805523152451996L;
        kd.liwc[52] = -6300460062466417855L;
        kd.liwc[53] = 3515391925214378751L;
        kd.liwc[54] = 4828795259088846571L;
        kd.liwc[55] = 3050234624166092382L;
        kd.liwc[56] = -75235265065381928L;
        kd.liwc[57] = 6110751249323788659L;
        kd.liwc[58] = 2190062526012783988L;
        kd.liwc[59] = 6109635475517642545L;
        kd.liwc[60] = -2408525876782961451L;
        kd.liwc[61] = -2875756267209116861L;
        kd.liwc[62] = 2725397385540443363L;
        kd.liwc[63] = -6247032135189687849L;
        kd.liwc[64] = 7266637385555557484L;
        kd.liwc[65] = -9021856621140499881L;
        kd.liwc[66] = 4028888273785739650L;
        kd.liwc[67] = -2380777045897608210L;
        kd.liwc[68] = -5816016472890440105L;
        kd.liwc[69] = 5056317882000912953L;
        kd.liwc[70] = 9115414260369878173L;
        kd.liwc[71] = 3474337134649859647L;
        kd.liwc[72] = 5863291710783134704L;
        kd.liwc[73] = 2527005820967761119L;
        kd.liwc[74] = 8086541656128984453L;
        kd.liwc[75] = 8027060183013815810L;
        kd.liwc[76] = 5370657840062306410L;
        kd.liwc[77] = 229885104550759963L;
        kd.liwc[78] = -7642484028365630136L;
        kd.liwc[79] = 1389366501921939694L;
        kd.liwc[80] = 2201062708667446521L;
        kd.liwc[81] = -5960465573554239517L;
        kd.liwc[82] = 5484470790131564866L;
        kd.liwc[83] = -47146783567844041L;
        kd.liwc[84] = -192946176386557154L;
        kd.liwc[85] = 5548195954924056930L;
        kd.liwc[86] = -3376185561738144507L;
        kd.liwc[87] = -4547035009142914788L;
        kd.liwc[88] = 8860185022808476678L;
        kd.liwc[89] = 8026600550711862355L;
        kd.liwc[90] = -8295732424124061542L;
        kd.liwc[91] = -4495348672614514997L;
        kd.liwc[92] = -8685298778352153983L;
        kd.liwc[93] = -7532638165177850691L;
        kd.liwc[94] = 2229371996982788528L;
        kd.liwc[95] = 3127603331307840896L;
        kd.liwc[96] = 2469720676832556847L;
        kd.liwc[97] = 7088938210984179978L;
        kd.liwc[98] = -767336961993309770L;
        kd.liwc[99] = -4322848943970058287L;
    }

    private static /* synthetic */ void ljrr() {
        kd.liwb[200] = 7107498083437773025L;
        kd.liwb[201] = 762403244919429386L;
        kd.liwb[202] = -5350064982997868351L;
        kd.liwb[203] = -2281382159822809088L;
        kd.liwb[204] = -5388239275753218464L;
        kd.liwb[205] = 921932283962866489L;
        kd.liwb[206] = 3627558443284660723L;
        kd.liwb[207] = -7818154079494417429L;
        kd.liwb[208] = 6435222050824910971L;
        kd.liwb[209] = -289647959838263327L;
        kd.liwb[210] = -7327149528768991934L;
        kd.liwb[211] = -7709801310248298234L;
        kd.liwb[212] = 2455619067573212378L;
        kd.liwb[213] = 774474178335959224L;
        kd.liwb[214] = -5649755346086043878L;
        kd.liwb[215] = -178352564828224900L;
        kd.liwb[216] = -817143383022291689L;
        kd.liwb[217] = -6414983336674124725L;
        kd.liwb[218] = 3409943558265721296L;
        kd.liwb[219] = 7216446690749863568L;
        kd.liwb[220] = -718421285740209047L;
        kd.liwb[221] = 7137065541935550954L;
        kd.liwb[222] = 6270047410654530044L;
        kd.liwb[223] = 658909892902441077L;
        kd.liwb[224] = 9026388983193497697L;
        kd.liwb[225] = 7650557377045820565L;
        kd.liwb[226] = 8747578534350451183L;
        kd.liwb[227] = -7384436685802411889L;
        kd.liwb[228] = -6298253056992291532L;
        kd.liwb[229] = 1448284018497457530L;
        kd.liwb[230] = -8000502878359849509L;
        kd.liwb[231] = 8048792369064477531L;
        kd.liwb[232] = 8701283122700064729L;
        kd.liwb[233] = 5345245924681052665L;
        kd.liwb[234] = -4659643497003824678L;
        kd.liwb[235] = -2254106796265444476L;
        kd.liwb[236] = -4665083181666976232L;
        kd.liwb[237] = -8020512320709406194L;
        kd.liwb[238] = -5231611226232676766L;
        kd.liwb[239] = 4491529208700019367L;
        kd.liwb[240] = 7847435225408094134L;
        kd.liwb[241] = -429322221305723708L;
        kd.liwb[242] = 6805656906697063005L;
        kd.liwb[243] = -7815224617933846971L;
        kd.liwb[244] = 742977518673740166L;
        kd.liwb[245] = 3622895820641023527L;
        kd.liwb[246] = -2770668426594035327L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getSaturation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljlg", liwa(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("ljlh", livn(int ), (int)238)) break;
            v0 /* !! */  = (long)kd.livq("ljli", livn(int ), (int)239);
        }
        var3_1 = kd.c;
        v1 /* !! */  = kd.ty;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - kd.livq("ljlj", liwa(int ), (int)164));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1078730055: {
                    v2 = kd.livq("ljlk", liwa(int ), (int)165);
                    continue block19;
                }
                case -774907524: {
                    v2 = kd.livq("ljll", liwa(int ), (int)166);
                    continue block19;
                }
                case -403782851: {
                    break block19;
                }
                case 1183272191: {
                    v2 = kd.livq("ljlm", liwa(int ), (int)167);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = kd.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = kd.ty;
                if (true) ** GOTO lbl32
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - kd.livq("ljln", liwa(int ), (int)168));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -403782851: {
                            break block20;
                        }
                        case 358051531: {
                            v4 = kd.livq("ljlo", liwa(int ), (int)169);
                            continue block20;
                        }
                        case 1645994221: {
                            v4 = kd.livq("ljlp", liwa(int ), (int)170);
                            continue block20;
                        }
                        case 1754119346: {
                            v4 = kd.livq("ljlq", liwa(int ), (int)171);
                            continue block20;
                        }
                    }
                    break;
                }
                var1_3 = kd.a;
                if (var3_1) {
                    throw null;
                    return (float)kd.livq("ljlr", lize(int ), (int)240);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljls", liwa(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == kd.livq("ljlt", livn(int ), (int)241)) break;
                    v5 /* !! */  = (long)kd.livq("ljlu", livn(int ), (int)242);
                }
                return this.saturation;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljlv", livn(int ), (int)243);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)kd.livq("ljlw", livn(int ), (int)244);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)kd.livq("ljlx", livn(int ), (int)245);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)kd.livq("ljly", livn(int ), (int)246);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kd value(int var1_1) {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - kd.livq("liwd", liwa(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1304544000: {
                    v1 = kd.livq("liwe", liwa(int ), (int)1);
                    continue block14;
                }
                case -444095733: {
                    v1 = kd.livq("liwf", liwa(int ), (int)2);
                    continue block14;
                }
                case -403782851: {
                    break block14;
                }
                case -398794145: {
                    v1 = kd.livq("liwg", liwa(int ), (int)3);
                    continue block14;
                }
            }
            break;
        }
        var4_2 = kd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("liwh", liwa(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kd.livq("liwi", livn(int ), (int)9)) break;
            v2 /* !! */  = (long)kd.livq("liwj", livn(int ), (int)10);
        }
        var3_3 /* !! */  = kd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("liwk", liwa(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kd.livq("liwl", livn(int ), (int)11)) {
                var2_4 = kd.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)kd.livq("liwm", livn(int ), (int)12);
        }
        if (var2_4 || var2_4) return null;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = kd.ty - kd.livq("liwn", liwa(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kd.livq("liwo", livn(int ), (int)13)) {
                this.setColor(var1_1);
                if (var2_4) return null;
                break;
            }
            v4 /* !! */  = (long)kd.livq("liwp", livn(int ), (int)14);
        }
        if (var2_4) {
            return null;
        }
        if (var3_3 /* !! */  == 0) return this;
        cfr_temp_0 = -2147483648;
        block18: while (true) {
            block33: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: {
                        return this;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)kd.livq("liwq", livn(int ), (int)15);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: {
                        ** GOTO lbl67
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)kd.livq("liwu", livn(int ), (int)19);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block33;
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)kd.livq("liwv", livn(int ), (int)20);
                        if (var4_2) {
                            throw null;
                        }
lbl67:
                        // 3 sources

                        var3_3 /* !! */  = (int)kd.livq("liwr", livn(int ), (int)16);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block33;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)kd.livq("liws", livn(int ), (int)17);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl81
            }
            do {
                if (true) continue block18;
lbl81:
                // 2 sources

                var3_3 /* !! */  = (int)kd.livq("liwt", livn(int ), (int)18);
                cfr_temp_0 = 2;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getPreviousColorsCount() {
        v0 /* !! */  = kd.ty;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(kd.livq("ljou", liwa(int ), (int)220) - kd.livq("ljot", liwa(int ), (int)219));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -403782851: {
                    break block16;
                }
                case 670346803: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("ljov", liwa(int ), (int)221)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("ljow", livn(int ), (int)273)) break;
            v1 /* !! */  = (long)kd.livq("ljox", livn(int ), (int)274);
        }
        var2_2 /* !! */  = kd.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = kd.ty;
                if (true) ** GOTO lbl25
                block18: while (true) {
                    v2 /* !! */  = (long)(v3 - kd.livq("ljoy", liwa(int ), (int)222));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1171868768: {
                            v3 = kd.livq("ljoz", liwa(int ), (int)223);
                            continue block18;
                        }
                        case -466500949: {
                            v3 = kd.livq("ljpa", liwa(int ), (int)224);
                            continue block18;
                        }
                        case -403782851: {
                            break block18;
                        }
                        case 109848756: {
                            v3 = kd.livq("ljpb", liwa(int ), (int)225);
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = kd.a;
                if (var3_1) {
                    throw null;
                    return (int)kd.livq("ljpc", livn(int ), (int)275);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("ljpd", liwa(int ), (int)226)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kd.livq("ljpe", livn(int ), (int)276)) break;
                    v4 /* !! */  = (long)kd.livq("ljpf", livn(int ), (int)277);
                }
                return this.previousColorsCount;
            }
            case 0: {
                var2_2 /* !! */  = (int)kd.livq("ljpg", livn(int ), (int)278);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kd.livq("ljph", livn(int ), (int)279);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)kd.livq("ljpi", livn(int ), (int)280);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kd.livq("ljpj", livn(int ), (int)281);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljri() {
        kd.livo[100] = -1956603185;
        kd.livo[101] = 1697546797;
        kd.livo[102] = -37515127;
        kd.livo[103] = -1063642125;
        kd.livo[104] = -1730056909;
        kd.livo[105] = 1596112568;
        kd.livo[106] = -977117983;
        kd.livo[107] = -698324600;
        kd.livo[108] = -127590367;
        kd.livo[109] = 443062292;
        kd.livo[110] = 246505051;
        kd.livo[111] = -141124596;
        kd.livo[112] = -713217201;
        kd.livo[113] = 1342526887;
        kd.livo[114] = -1150119106;
        kd.livo[115] = -495499328;
        kd.livo[116] = 1797987364;
        kd.livo[117] = -1492039541;
        kd.livo[118] = 811562263;
        kd.livo[119] = 344357821;
        kd.livo[120] = -1014384253;
        kd.livo[121] = 242578036;
        kd.livo[122] = -1262867584;
        kd.livo[123] = 759168747;
        kd.livo[124] = 571150801;
        kd.livo[125] = -400404382;
        kd.livo[126] = -627478455;
        kd.livo[127] = 1450541749;
        kd.livo[128] = -1049898354;
        kd.livo[129] = 160556298;
        kd.livo[130] = -640821351;
        kd.livo[131] = -1458108806;
        kd.livo[132] = 2065496717;
        kd.livo[133] = 1156076294;
        kd.livo[134] = 363076629;
        kd.livo[135] = 1274552752;
        kd.livo[136] = -1876552770;
        kd.livo[137] = 1322919602;
        kd.livo[138] = 466714135;
        kd.livo[139] = -792622880;
        kd.livo[140] = 1337664529;
        kd.livo[141] = -1575051020;
        kd.livo[142] = 1558160965;
        kd.livo[143] = 784699;
        kd.livo[144] = 167836152;
        kd.livo[145] = 807312460;
        kd.livo[146] = 896616488;
        kd.livo[147] = -1356152106;
        kd.livo[148] = 615209490;
        kd.livo[149] = -171719214;
        kd.livo[150] = -263389726;
        kd.livo[151] = -1221634587;
        kd.livo[152] = -518880333;
        kd.livo[153] = -1572497440;
        kd.livo[154] = 1250906677;
        kd.livo[155] = 1444201242;
        kd.livo[156] = -554736443;
        kd.livo[157] = -1760567911;
        kd.livo[158] = 692218840;
        kd.livo[159] = 904278620;
        kd.livo[160] = 211787896;
        kd.livo[161] = 949404544;
        kd.livo[162] = -550529461;
        kd.livo[163] = 1202840096;
        kd.livo[164] = 157912034;
        kd.livo[165] = -123673909;
        kd.livo[166] = -879319989;
        kd.livo[167] = 2111577282;
        kd.livo[168] = 195773248;
        kd.livo[169] = 1843948746;
        kd.livo[170] = -1831130688;
        kd.livo[171] = 1596260846;
        kd.livo[172] = -1496766804;
        kd.livo[173] = -1013297303;
        kd.livo[174] = 1756579187;
        kd.livo[175] = -715745228;
        kd.livo[176] = 323450875;
        kd.livo[177] = -92712602;
        kd.livo[178] = 858251718;
        kd.livo[179] = 1884280639;
        kd.livo[180] = -1493250756;
        kd.livo[181] = -1451657529;
        kd.livo[182] = 407027462;
        kd.livo[183] = 1855757199;
        kd.livo[184] = 1928564237;
        kd.livo[185] = 552356047;
        kd.livo[186] = 252832768;
        kd.livo[187] = 32361075;
        kd.livo[188] = -296008286;
        kd.livo[189] = 2074341717;
        kd.livo[190] = 852776365;
        kd.livo[191] = -340457124;
        kd.livo[192] = -511981548;
        kd.livo[193] = -679653667;
        kd.livo[194] = 627565238;
        kd.livo[195] = 101440334;
        kd.livo[196] = -1083641754;
        kd.livo[197] = 1657474713;
        kd.livo[198] = 1896555858;
        kd.livo[199] = -1624295783;
    }

    private static /* synthetic */ void ljro() {
        kd.livp[300] = -1521021549;
        kd.livp[301] = -463817994;
        kd.livp[302] = -143407313;
        kd.livp[303] = 1506517841;
        kd.livp[304] = 2489207;
        kd.livp[305] = 698982124;
        kd.livp[306] = 67280886;
        kd.livp[307] = -1737465864;
        kd.livp[308] = -1440561990;
        kd.livp[309] = 976565205;
        kd.livp[310] = -1830361702;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void addToPreviousColors() {
        block71: {
            block70: {
                block68: {
                    var5_1 = kd.c;
                    var4_2 /* !! */  = kd.b;
                    var3_3 = kd.a;
                    if (var5_1) {
                        throw null;
lbl6:
                        // 17 sources

                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var1_4 = this.getColorNoAlpha();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_5 = kd.livq("ljib", livn(int ), (int)179);
                    if (var3_3) ** GOTO lbl6
                    do {
                        block69: {
                            if (var3_3 || var3_3) ** GOTO lbl6
                            if (var2_5 >= this.previousColorsCount) break block68;
                            if (var3_3 || var3_3) ** GOTO lbl6
                            if (this.previousColors[var2_5] != var1_4) break block69;
                            if (var3_3 || var3_3) ** GOTO lbl6
                            return;
                        }
                        if (var3_3 || var3_3) ** GOTO lbl6
                        ++var2_5;
                        if (var3_3) ** GOTO lbl6
                    } while (!var5_1);
                    throw null;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (this.previousColorsCount >= kd.livq("ljic", livn(int ), (int)180)) break block70;
                if (var3_3 || var3_3) ** GOTO lbl6
                System.arraycopy(this.previousColors, (int)kd.livq("ljid", livn(int ), (int)181), this.previousColors, (int)kd.livq("ljie", livn(int ), (int)182), this.previousColorsCount);
                if (var3_3 || var3_3) ** GOTO lbl6
                this.previousColorsCount += kd.livq("ljif", livn(int ), (int)183);
                if (var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                break block71;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            System.arraycopy(this.previousColors, (int)kd.livq("ljig", livn(int ), (int)184), this.previousColors, (int)kd.livq("ljih", livn(int ), (int)185), (int)kd.livq("ljii", livn(int ), (int)186));
            if (var3_3) ** GOTO lbl6
        }
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                this.previousColors[0] = var1_4;
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)kd.livq("ljij", livn(int ), (int)187);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var4_2 /* !! */  = (int)kd.livq("ljik", livn(int ), (int)188);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl61:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)kd.livq("ljil", livn(int ), (int)189);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 3: {
                var4_2 /* !! */  = (int)kd.livq("ljim", livn(int ), (int)190);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl71:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)kd.livq("ljin", livn(int ), (int)191);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl76:
            // 3 sources

            case 5: {
                do {
                    var4_2 /* !! */  = (int)kd.livq("ljio", livn(int ), (int)192);
                } while (!var5_1);
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)kd.livq("ljip", livn(int ), (int)193);
                    if (!var5_1) ** GOTO lbl71
                    throw null;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)kd.livq("ljiq", livn(int ), (int)194);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl91:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)kd.livq("ljir", livn(int ), (int)195);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
lbl95:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)kd.livq("ljis", livn(int ), (int)196);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl100:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)kd.livq("ljit", livn(int ), (int)197);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 11: {
                var4_2 /* !! */  = (int)kd.livq("ljiu", livn(int ), (int)198);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl110:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)kd.livq("ljiv", livn(int ), (int)199);
                if (!var5_1) ** GOTO lbl61
                throw null;
            }
lbl114:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)kd.livq("ljiw", livn(int ), (int)200);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl119:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)kd.livq("ljix", livn(int ), (int)201);
                if (var5_1) {
                    throw null;
                }
            }
lbl123:
            // 4 sources

            case 15: {
                var4_2 /* !! */  = (int)kd.livq("ljiy", livn(int ), (int)202);
                if (!var5_1) ** GOTO lbl71
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)kd.livq("ljiz", livn(int ), (int)203);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl132:
            // 2 sources

            case 17: {
                do {
                    var4_2 /* !! */  = (int)kd.livq("ljja", livn(int ), (int)204);
                } while (!var5_1);
                throw null;
            }
lbl137:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)kd.livq("ljjb", livn(int ), (int)205);
                if (!var5_1) ** GOTO lbl61
                throw null;
            }
lbl141:
            // 3 sources

            case 19: {
                var4_2 /* !! */  = (int)kd.livq("ljjc", livn(int ), (int)206);
                if (!var5_1) ** GOTO lbl100
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)kd.livq("ljjd", livn(int ), (int)207);
                if (var5_1) {
                    throw null;
                }
            }
lbl149:
            // 4 sources

            case 21: {
                var4_2 /* !! */  = (int)kd.livq("ljje", livn(int ), (int)208);
                if (!var5_1) ** GOTO lbl123
                throw null;
            }
lbl153:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)kd.livq("ljjf", livn(int ), (int)209);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 23: {
                var4_2 /* !! */  = (int)kd.livq("ljjg", livn(int ), (int)210);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 24: {
                var4_2 /* !! */  = (int)kd.livq("ljjh", livn(int ), (int)211);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
lbl167:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)kd.livq("ljji", livn(int ), (int)212);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
lbl171:
            // 4 sources

            case 26: {
                var4_2 /* !! */  = (int)kd.livq("ljjj", livn(int ), (int)213);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 27: {
                var4_2 /* !! */  = (int)kd.livq("ljjk", livn(int ), (int)214);
                if (!var5_1) ** GOTO lbl137
                throw null;
            }
            case 28: {
                var4_2 /* !! */  = (int)kd.livq("ljjl", livn(int ), (int)215);
                if (!var5_1) ** GOTO lbl119
                throw null;
            }
lbl184:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)kd.livq("ljjm", livn(int ), (int)216);
                if (!var5_1) ** GOTO lbl149
                throw null;
            }
lbl188:
            // 2 sources

            case 30: {
                var4_2 /* !! */  = (int)kd.livq("ljjn", livn(int ), (int)217);
                if (!var5_1) ** GOTO lbl114
                throw null;
            }
            case 31: 
        }
        var4_2 /* !! */  = (int)kd.livq("ljjo", livn(int ), (int)218);
        ** while (!var5_1)
lbl195:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljrk() {
        kd.livo[300] = -1521021550;
        kd.livo[301] = -169499053;
        kd.livo[302] = -143407314;
        kd.livo[303] = -2049767426;
        kd.livo[304] = 2489206;
        kd.livo[305] = 813976241;
        kd.livo[306] = 67280882;
        kd.livo[307] = -1737465861;
        kd.livo[308] = -1440561992;
        kd.livo[309] = 976565201;
        kd.livo[310] = -1830361704;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kd presets(int ... var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kd.ty - kd.livq("liww", liwa(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kd.livq("liwx", livn(int ), (int)21)) break;
            v0 /* !! */  = (long)kd.livq("liwy", livn(int ), (int)22);
        }
        var4_2 = kd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kd.ty - kd.livq("liwz", liwa(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kd.livq("lixa", livn(int ), (int)23)) break;
            v1 /* !! */  = (long)kd.livq("lixb", livn(int ), (int)24);
        }
        var3_3 /* !! */  = kd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kd.ty - kd.livq("lixc", liwa(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kd.livq("lixd", livn(int ), (int)25)) break;
            v2 /* !! */  = (long)kd.livq("lixe", livn(int ), (int)26);
        }
        var2_4 = kd.a;
        if (var4_2) {
            throw null;
lbl24:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl24
                v3 /* !! */  = kd.ty;
                if (true) ** GOTO lbl35
                block16: while (true) {
                    v3 /* !! */  = (long)(kd.livq("lixg", liwa(int ), (int)11) - kd.livq("lixf", liwa(int ), (int)10));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -403782851: {
                            break block16;
                        }
                        case 1867464452: {
                            continue block16;
                        }
                    }
                    break;
                }
                this.presets = var1_1;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return this;
            }
lbl44:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)kd.livq("lixh", livn(int ), (int)27);
                } while (!var4_2);
                throw null;
            }
lbl49:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)kd.livq("lixi", livn(int ), (int)28);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)kd.livq("lixj", livn(int ), (int)29);
                if (!var4_2) ** GOTO lbl49
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kd.livq("lixk", livn(int ), (int)30);
                    if (!var4_2) ** GOTO lbl44
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)kd.livq("lixl", livn(int ), (int)31);
                if (!var4_2) ** GOTO lbl49
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kd.livq("lixm", livn(int ), (int)32);
        ** while (!var4_2)
lbl69:
        // 1 sources

        throw null;
    }
}

