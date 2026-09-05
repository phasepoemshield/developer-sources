/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import ruhack.phobia.ab;
import ruhack.phobia.ac;
import ruhack.phobia.ad;
import ruhack.phobia.af;
import ruhack.phobia.ai;

public class aa {
    private final ab fileHandler;
    private final AtomicBoolean initialized;
    private static int[] cueo = new int[481];
    private final AtomicBoolean saving;
    public static final boolean a;
    static final long gl = 6558199580928255983L;
    public static final boolean c;
    private static int[] cuep;
    private final af autoSaver;
    public static final int b;
    private static long[] cufe;
    private static long[] cufd;
    private String defaultConfig;
    private static aa instance;
    private final ad serializer;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CompletableFuture<Void> saveAsync() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(aa.cueq("culq", cufc(int ), (int)78) - aa.cueq("culp", cufc(int ), (int)77));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808716654: {
                    continue block24;
                }
                case -1554503697: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = aa.c;
        v1 /* !! */  = aa.gl;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(aa.cueq("culs", cufc(int ), (int)80) - aa.cueq("culr", cufc(int ), (int)79));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1554503697: {
                    break block25;
                }
                case -600732611: {
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cult", cufc(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == aa.cueq("culu", cuen(int ), (int)100)) break;
            v2 /* !! */  = (long)aa.cueq("culv", cuen(int ), (int)101);
        }
        var1_3 = aa.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = aa.gl;
                if (true) ** GOTO lbl41
                block28: while (true) {
                    v3 /* !! */  = (long)(aa.cueq("culx", cufc(int ), (int)83) - aa.cueq("culw", cufc(int ), (int)82));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1554503697: {
                            break block28;
                        }
                        case -1109850360: {
                            continue block28;
                        }
                    }
                    break;
                }
                v4 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, save(), ()V)((aa)this);
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl51
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - aa.cueq("culy", cufc(int ), (int)84));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1554503697: {
                            break block29;
                        }
                        case -1449006494: {
                            v6 = aa.cueq("culz", cufc(int ), (int)85);
                            continue block29;
                        }
                        case -400157279: {
                            v6 = aa.cueq("cuma", cufc(int ), (int)86);
                            continue block29;
                        }
                        case -41578987: {
                            v6 = aa.cueq("cumb", cufc(int ), (int)87);
                            continue block29;
                        }
                    }
                    break;
                }
                return CompletableFuture.runAsync(v4);
            }
            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cumc", cuen(int ), (int)102);
                if (var3_1) {
                    throw null;
                }
            }
lbl68:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cumd", cuen(int ), (int)103);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cume", cuen(int ), (int)104);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)aa.cueq("cumf", cuen(int ), (int)105);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static aa getInstance() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cuff", cufc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block23;
                }
                case 389121668: {
                    v1 = aa.cueq("cufg", cufc(int ), (int)1);
                    continue block23;
                }
                case 505444542: {
                    v1 = aa.cueq("cufh", cufc(int ), (int)2);
                    continue block23;
                }
                case 872018657: {
                    v1 = aa.cueq("cufi", cufc(int ), (int)3);
                    continue block23;
                }
            }
            break;
        }
        var2 = aa.c;
        v2 /* !! */  = aa.gl;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - aa.cueq("cufj", cufc(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1554503697: {
                    break block24;
                }
                case -1275754670: {
                    v3 = aa.cueq("cufk", cufc(int ), (int)5);
                    continue block24;
                }
                case 911231384: {
                    v3 = aa.cueq("cufl", cufc(int ), (int)6);
                    continue block24;
                }
            }
            break;
        }
        var1_1 /* !! */  = aa.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cufm", cufc(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == aa.cueq("cufn", cuen(int ), (int)11)) break;
            v4 /* !! */  = (long)aa.cueq("cufo", cuen(int ), (int)12);
        }
        var0_2 = aa.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - aa.cueq("cufp", cufc(int ), (int)8));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1554503697: {
                            break block27;
                        }
                        case -1406515548: {
                            v6 = aa.cueq("cufq", cufc(int ), (int)9);
                            continue block27;
                        }
                        case -1016134764: {
                            v6 = aa.cueq("cufr", cufc(int ), (int)10);
                            continue block27;
                        }
                        case -332558723: {
                            v6 = aa.cueq("cufs", cufc(int ), (int)11);
                            continue block27;
                        }
                    }
                    break;
                }
                return aa.instance;
            }
            case 0: {
                var1_1 /* !! */  = (int)aa.cueq("cuft", cuen(int ), (int)13);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)aa.cueq("cufu", cuen(int ), (int)14);
                    if (!var2) break block11;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)aa.cueq("cufv", cuen(int ), (int)15);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)aa.cueq("cufw", cuen(int ), (int)16);
        ** while (!var2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cvqx() {
        aa.cueo[200] = 803241342;
        aa.cueo[201] = 385586891;
        aa.cueo[202] = 1438554291;
        aa.cueo[203] = -2023225073;
        aa.cueo[204] = 469812193;
        aa.cueo[205] = -876059889;
        aa.cueo[206] = 873555291;
        aa.cueo[207] = -533844762;
        aa.cueo[208] = 594585520;
        aa.cueo[209] = -147639468;
        aa.cueo[210] = -1553761019;
        aa.cueo[211] = 149692369;
        aa.cueo[212] = -1413315491;
        aa.cueo[213] = -156264978;
        aa.cueo[214] = 85017179;
        aa.cueo[215] = 443578525;
        aa.cueo[216] = 1298079001;
        aa.cueo[217] = -2071299477;
        aa.cueo[218] = 1760016971;
        aa.cueo[219] = 1750339091;
        aa.cueo[220] = -94263341;
        aa.cueo[221] = 893383716;
        aa.cueo[222] = -2006897606;
        aa.cueo[223] = 1791303596;
        aa.cueo[224] = -1435328244;
        aa.cueo[225] = -1503392557;
        aa.cueo[226] = -407106120;
        aa.cueo[227] = 211317310;
        aa.cueo[228] = 494481072;
        aa.cueo[229] = -1381795142;
        aa.cueo[230] = 1614381961;
        aa.cueo[231] = -1881471416;
        aa.cueo[232] = 1204003691;
        aa.cueo[233] = 992860665;
        aa.cueo[234] = 1701500759;
        aa.cueo[235] = 521780353;
        aa.cueo[236] = 82254774;
        aa.cueo[237] = -973583593;
        aa.cueo[238] = 713029154;
        aa.cueo[239] = -1268160508;
        aa.cueo[240] = 761816221;
        aa.cueo[241] = -2142200807;
        aa.cueo[242] = 1628851609;
        aa.cueo[243] = 652089160;
        aa.cueo[244] = -1649434125;
        aa.cueo[245] = 1075273745;
        aa.cueo[246] = -1826056021;
        aa.cueo[247] = -993488162;
        aa.cueo[248] = -1628739362;
        aa.cueo[249] = -92694323;
        aa.cueo[250] = 984970137;
        aa.cueo[251] = 1164498589;
        aa.cueo[252] = 146992759;
        aa.cueo[253] = 1118331757;
        aa.cueo[254] = -709311711;
        aa.cueo[255] = 1144915524;
        aa.cueo[256] = -358409656;
        aa.cueo[257] = -1796360713;
        aa.cueo[258] = -2044727689;
        aa.cueo[259] = -1738277345;
        aa.cueo[260] = 1903811718;
        aa.cueo[261] = 1467898589;
        aa.cueo[262] = 1800826912;
        aa.cueo[263] = -394018127;
        aa.cueo[264] = 1744230536;
        aa.cueo[265] = 1614196466;
        aa.cueo[266] = -1803693864;
        aa.cueo[267] = -1216123402;
        aa.cueo[268] = -1151664054;
        aa.cueo[269] = 596077883;
        aa.cueo[270] = -1016324382;
        aa.cueo[271] = 1283849009;
        aa.cueo[272] = 1399775479;
        aa.cueo[273] = -1465584491;
        aa.cueo[274] = 1966390452;
        aa.cueo[275] = -272302627;
        aa.cueo[276] = 1922740805;
        aa.cueo[277] = -1588218579;
        aa.cueo[278] = 2040503447;
        aa.cueo[279] = -18226826;
        aa.cueo[280] = 408554853;
        aa.cueo[281] = -1597193540;
        aa.cueo[282] = -910100706;
        aa.cueo[283] = -1228306232;
        aa.cueo[284] = 1270570865;
        aa.cueo[285] = 743556636;
        aa.cueo[286] = 2074286266;
        aa.cueo[287] = 1087968887;
        aa.cueo[288] = 184414445;
        aa.cueo[289] = -1586024521;
        aa.cueo[290] = 1931664721;
        aa.cueo[291] = 718843853;
        aa.cueo[292] = -1840476524;
        aa.cueo[293] = 1615814371;
        aa.cueo[294] = -1701280837;
        aa.cueo[295] = 263176953;
        aa.cueo[296] = -926593673;
        aa.cueo[297] = 703718401;
        aa.cueo[298] = 204549973;
        aa.cueo[299] = -2081122014;
    }

    private static /* synthetic */ void cvrg() {
        aa.cufd[100] = 4947526279771921922L;
        aa.cufd[101] = 5316737196561182910L;
        aa.cufd[102] = -854282525436090536L;
        aa.cufd[103] = 397509149334571164L;
        aa.cufd[104] = -845628452806716287L;
        aa.cufd[105] = -868866143222764422L;
        aa.cufd[106] = 5298983381238957447L;
        aa.cufd[107] = 6074058878682293442L;
        aa.cufd[108] = -8763879270499907984L;
        aa.cufd[109] = 4052466325607714938L;
        aa.cufd[110] = -6498768305471413087L;
        aa.cufd[111] = 8365400247044906722L;
        aa.cufd[112] = 3256137323297142940L;
        aa.cufd[113] = -3221795030837217033L;
        aa.cufd[114] = 540663695346831125L;
        aa.cufd[115] = -7025062564874642569L;
        aa.cufd[116] = 4925075044842007017L;
        aa.cufd[117] = 7679124893085816299L;
        aa.cufd[118] = 2367063515035095187L;
        aa.cufd[119] = 1536686744610386328L;
        aa.cufd[120] = 7052112271371725911L;
        aa.cufd[121] = -8877046845874817495L;
        aa.cufd[122] = 5671962881734562754L;
        aa.cufd[123] = 6201564491341163633L;
        aa.cufd[124] = -565135324730757792L;
        aa.cufd[125] = 4910027336560032652L;
        aa.cufd[126] = -638435087400165985L;
        aa.cufd[127] = 5382287815164452332L;
        aa.cufd[128] = 3622441790295861338L;
        aa.cufd[129] = 3989657986633556083L;
        aa.cufd[130] = -6009608055164490565L;
        aa.cufd[131] = -2661203101956982282L;
        aa.cufd[132] = 6505345505518471057L;
        aa.cufd[133] = 8554875020192225993L;
        aa.cufd[134] = 2892467658485136414L;
        aa.cufd[135] = -6517109699992358430L;
        aa.cufd[136] = -8032940228336562756L;
        aa.cufd[137] = 7712594437336804179L;
        aa.cufd[138] = -9025798217029909418L;
        aa.cufd[139] = -2710339220099527020L;
        aa.cufd[140] = 3862159326652213097L;
        aa.cufd[141] = 5075540221484250444L;
        aa.cufd[142] = -8361266120966191441L;
        aa.cufd[143] = -3963919135626144885L;
        aa.cufd[144] = 2192281977341351834L;
        aa.cufd[145] = 2883103099661465473L;
        aa.cufd[146] = 8818175850431413506L;
        aa.cufd[147] = 5831205477198177761L;
        aa.cufd[148] = -5709351022044071873L;
        aa.cufd[149] = -632259134369233219L;
        aa.cufd[150] = -3688895982128008328L;
        aa.cufd[151] = 6826807005351892343L;
        aa.cufd[152] = 2155528839220710502L;
        aa.cufd[153] = -5060989932843662922L;
        aa.cufd[154] = -4321944721522981293L;
        aa.cufd[155] = 3989586679886690594L;
        aa.cufd[156] = -5672035666897971111L;
        aa.cufd[157] = -8270729274435079926L;
        aa.cufd[158] = -7594749810298127593L;
        aa.cufd[159] = -4348340143918614705L;
        aa.cufd[160] = -5122415278749929782L;
        aa.cufd[161] = 2465939429635701019L;
        aa.cufd[162] = -2063546970800968088L;
        aa.cufd[163] = -7322549790882053265L;
        aa.cufd[164] = 3621570674162305184L;
        aa.cufd[165] = 7278523109133310805L;
        aa.cufd[166] = -7793175111118517043L;
        aa.cufd[167] = -48197585830037170L;
        aa.cufd[168] = 938306562338559046L;
        aa.cufd[169] = -8790351829696405519L;
        aa.cufd[170] = -5184320179899673759L;
        aa.cufd[171] = -129862243048811616L;
        aa.cufd[172] = 4161575530975666478L;
        aa.cufd[173] = -2044375165200779640L;
        aa.cufd[174] = -516946632724175860L;
        aa.cufd[175] = 346787337717702272L;
        aa.cufd[176] = -8319136083689131676L;
        aa.cufd[177] = 5134141962672701539L;
        aa.cufd[178] = -1737894338861539398L;
        aa.cufd[179] = -5940533887404319939L;
        aa.cufd[180] = -6225978578320057340L;
        aa.cufd[181] = -8340415724462675772L;
        aa.cufd[182] = -1364689892044318539L;
        aa.cufd[183] = 7460354383474836551L;
        aa.cufd[184] = -2836954373881036478L;
        aa.cufd[185] = -2558233075057740860L;
        aa.cufd[186] = -5754565677150671799L;
        aa.cufd[187] = -3648587295224502951L;
        aa.cufd[188] = -5593050476411812160L;
        aa.cufd[189] = 2877786353391643186L;
        aa.cufd[190] = 7542137799995794138L;
        aa.cufd[191] = 612778637720691358L;
        aa.cufd[192] = -3404577254786539612L;
        aa.cufd[193] = 5063824371720577732L;
        aa.cufd[194] = -5463271908700108303L;
        aa.cufd[195] = 6562886475371827296L;
        aa.cufd[196] = 5205709758834659463L;
        aa.cufd[197] = 8713871020995931413L;
        aa.cufd[198] = -4256356562750539740L;
        aa.cufd[199] = 8053705016065890618L;
    }

    static {
        cuep = new int[481];
        aa.cvqv();
        aa.cvqw();
        aa.cvqx();
        aa.cvqy();
        aa.cvqz();
        aa.cvra();
        aa.cvrb();
        aa.cvrc();
        aa.cvrd();
        aa.cvre();
        cufd = new long[347];
        cufe = new long[347];
        aa.cvrf();
        aa.cvrg();
        aa.cvrh();
        aa.cvri();
        aa.cvrj();
        aa.cvrk();
        aa.cvrl();
        aa.cvrm();
    }

    private static /* synthetic */ int cuen(int n2) {
        return cueo[n2] ^ cuep[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public aa() {
        var2_1 /* !! */  = aa.b;
        super();
        aa.instance = this;
        this.serializer = new ad();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.fileHandler = new ab();
                this.autoSaver = new af((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, save(), ()V)((aa)this));
                this.initialized = new AtomicBoolean((boolean)aa.cueq("cuer", cuen(int ), (int)0));
                this.saving = new AtomicBoolean((boolean)aa.cueq("cues", cuen(int ), (int)1));
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)aa.cueq("cuet", cuen(int ), (int)2);
                ** GOTO lbl19
            }
            case 1: {
                var2_1 /* !! */  = (int)aa.cueq("cueu", cuen(int ), (int)3);
                ** GOTO lbl25
            }
lbl19:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)aa.cueq("cuev", cuen(int ), (int)4);
                ** GOTO lbl29
            }
lbl22:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)aa.cueq("cuew", cuen(int ), (int)5);
                break;
            }
lbl25:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)aa.cueq("cuex", cuen(int ), (int)6);
                    break block0;
                    break;
                }
            }
lbl29:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)aa.cueq("cuey", cuen(int ), (int)7);
                ** GOTO lbl22
            }
            case 6: {
                var2_1 /* !! */  = (int)aa.cueq("cuez", cuen(int ), (int)8);
                ** GOTO lbl22
            }
            case 7: {
                var2_1 /* !! */  = (int)aa.cueq("cufa", cuen(int ), (int)9);
                ** GOTO lbl22
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)aa.cueq("cufb", cuen(int ), (int)10);
        ** while (true)
    }

    private static /* synthetic */ void cvqz() {
        aa.cueo[400] = -456387575;
        aa.cueo[401] = 283229858;
        aa.cueo[402] = 653297455;
        aa.cueo[403] = -1728578489;
        aa.cueo[404] = -912311891;
        aa.cueo[405] = 1912905714;
        aa.cueo[406] = 565232689;
        aa.cueo[407] = -852719374;
        aa.cueo[408] = -1660770644;
        aa.cueo[409] = -1117322973;
        aa.cueo[410] = 896376924;
        aa.cueo[411] = -734399299;
        aa.cueo[412] = -2129853215;
        aa.cueo[413] = 205562187;
        aa.cueo[414] = 38088385;
        aa.cueo[415] = -1575480842;
        aa.cueo[416] = 158660254;
        aa.cueo[417] = 802837956;
        aa.cueo[418] = 1408385149;
        aa.cueo[419] = -1807771337;
        aa.cueo[420] = -1017520014;
        aa.cueo[421] = 2096095959;
        aa.cueo[422] = -966999938;
        aa.cueo[423] = 1023323710;
        aa.cueo[424] = -2084702754;
        aa.cueo[425] = 677124959;
        aa.cueo[426] = -1134272781;
        aa.cueo[427] = 92893680;
        aa.cueo[428] = 252865992;
        aa.cueo[429] = -1543655449;
        aa.cueo[430] = -1632704512;
        aa.cueo[431] = 1045336492;
        aa.cueo[432] = -352898486;
        aa.cueo[433] = -951751544;
        aa.cueo[434] = -169622363;
        aa.cueo[435] = -811048021;
        aa.cueo[436] = 729732304;
        aa.cueo[437] = -1948815784;
        aa.cueo[438] = 159318337;
        aa.cueo[439] = 1930966293;
        aa.cueo[440] = -2126431478;
        aa.cueo[441] = -207573085;
        aa.cueo[442] = 999560222;
        aa.cueo[443] = 748464938;
        aa.cueo[444] = 340334174;
        aa.cueo[445] = -1333848168;
        aa.cueo[446] = 121711255;
        aa.cueo[447] = -380614278;
        aa.cueo[448] = -1965269186;
        aa.cueo[449] = -502863764;
        aa.cueo[450] = 603556789;
        aa.cueo[451] = 1587708351;
        aa.cueo[452] = -849759565;
        aa.cueo[453] = 1447761243;
        aa.cueo[454] = -2014563891;
        aa.cueo[455] = -1436937060;
        aa.cueo[456] = -324362793;
        aa.cueo[457] = -1795942785;
        aa.cueo[458] = -1334165815;
        aa.cueo[459] = 402564565;
        aa.cueo[460] = 2066361948;
        aa.cueo[461] = -1149187062;
        aa.cueo[462] = -1034458789;
        aa.cueo[463] = 159169728;
        aa.cueo[464] = 1044379535;
        aa.cueo[465] = -1743168100;
        aa.cueo[466] = 265875221;
        aa.cueo[467] = 1312398903;
        aa.cueo[468] = 966895571;
        aa.cueo[469] = -855851233;
        aa.cueo[470] = -495868565;
        aa.cueo[471] = 232361767;
        aa.cueo[472] = 1134302355;
        aa.cueo[473] = 1031117331;
        aa.cueo[474] = -874181616;
        aa.cueo[475] = -760420548;
        aa.cueo[476] = -878439377;
        aa.cueo[477] = 1994586365;
        aa.cueo[478] = -438148011;
        aa.cueo[479] = 285481909;
        aa.cueo[480] = -2032328839;
    }

    private static /* synthetic */ void cvqv() {
        aa.cueo[0] = -1709923359;
        aa.cueo[1] = 342801722;
        aa.cueo[2] = 662686962;
        aa.cueo[3] = -707360984;
        aa.cueo[4] = -1003067452;
        aa.cueo[5] = 687947812;
        aa.cueo[6] = -1563420168;
        aa.cueo[7] = 338272250;
        aa.cueo[8] = -1948014401;
        aa.cueo[9] = -522795381;
        aa.cueo[10] = 1280430493;
        aa.cueo[11] = 1387831445;
        aa.cueo[12] = -1487489106;
        aa.cueo[13] = 0xCC7D7DC;
        aa.cueo[14] = 993039726;
        aa.cueo[15] = 1167474839;
        aa.cueo[16] = 415564597;
        aa.cueo[17] = 1603155668;
        aa.cueo[18] = -2036309131;
        aa.cueo[19] = 377098414;
        aa.cueo[20] = -712585588;
        aa.cueo[21] = -2048288630;
        aa.cueo[22] = -1282345358;
        aa.cueo[23] = -1492146007;
        aa.cueo[24] = -805247183;
        aa.cueo[25] = 1621448046;
        aa.cueo[26] = -2000011666;
        aa.cueo[27] = -531415248;
        aa.cueo[28] = 992551918;
        aa.cueo[29] = 691761037;
        aa.cueo[30] = 1493235507;
        aa.cueo[31] = -547217082;
        aa.cueo[32] = 1687043661;
        aa.cueo[33] = -1768310747;
        aa.cueo[34] = 988119379;
        aa.cueo[35] = -1448740585;
        aa.cueo[36] = 2033937751;
        aa.cueo[37] = -94011091;
        aa.cueo[38] = 1940837888;
        aa.cueo[39] = 1582100778;
        aa.cueo[40] = -1545147853;
        aa.cueo[41] = 987854631;
        aa.cueo[42] = 1837347562;
        aa.cueo[43] = -336341931;
        aa.cueo[44] = 1437774091;
        aa.cueo[45] = 1980485834;
        aa.cueo[46] = 1099852393;
        aa.cueo[47] = 593415116;
        aa.cueo[48] = -49760294;
        aa.cueo[49] = -444750078;
        aa.cueo[50] = 1764665730;
        aa.cueo[51] = 1866719917;
        aa.cueo[52] = -1596010630;
        aa.cueo[53] = -1954117794;
        aa.cueo[54] = -435815337;
        aa.cueo[55] = 932076420;
        aa.cueo[56] = -1534214029;
        aa.cueo[57] = 1134398633;
        aa.cueo[58] = -990253238;
        aa.cueo[59] = 710435350;
        aa.cueo[60] = -1815701776;
        aa.cueo[61] = -990961233;
        aa.cueo[62] = -309751998;
        aa.cueo[63] = -776459651;
        aa.cueo[64] = 1796887742;
        aa.cueo[65] = 1733093031;
        aa.cueo[66] = -367059000;
        aa.cueo[67] = 924230573;
        aa.cueo[68] = -1251172064;
        aa.cueo[69] = -1004660985;
        aa.cueo[70] = 1576973369;
        aa.cueo[71] = -883201177;
        aa.cueo[72] = 1078765746;
        aa.cueo[73] = 627419651;
        aa.cueo[74] = -437737620;
        aa.cueo[75] = -1488826782;
        aa.cueo[76] = 1389169397;
        aa.cueo[77] = 358763939;
        aa.cueo[78] = -309941996;
        aa.cueo[79] = 1161624799;
        aa.cueo[80] = 1832038474;
        aa.cueo[81] = 447052949;
        aa.cueo[82] = 32591666;
        aa.cueo[83] = -1219898208;
        aa.cueo[84] = 83597448;
        aa.cueo[85] = 915354675;
        aa.cueo[86] = -1945672535;
        aa.cueo[87] = -1638734808;
        aa.cueo[88] = 1060893923;
        aa.cueo[89] = -286257053;
        aa.cueo[90] = 858744698;
        aa.cueo[91] = 1278643585;
        aa.cueo[92] = -1671354977;
        aa.cueo[93] = -815018507;
        aa.cueo[94] = -1246828486;
        aa.cueo[95] = -1613927443;
        aa.cueo[96] = -246453443;
        aa.cueo[97] = -263030365;
        aa.cueo[98] = -28654832;
        aa.cueo[99] = 1498897676;
    }

    private static /* synthetic */ void cvrb() {
        aa.cuep[100] = -756604766;
        aa.cuep[101] = -2068406241;
        aa.cuep[102] = 2102326224;
        aa.cuep[103] = -1026500061;
        aa.cuep[104] = -1439391417;
        aa.cuep[105] = -355091278;
        aa.cuep[106] = -1806536531;
        aa.cuep[107] = -1057246696;
        aa.cuep[108] = 1602184752;
        aa.cuep[109] = 1298618939;
        aa.cuep[110] = 1662268011;
        aa.cuep[111] = -2057063116;
        aa.cuep[112] = 272301980;
        aa.cuep[113] = -1869578557;
        aa.cuep[114] = -1072793051;
        aa.cuep[115] = -764084758;
        aa.cuep[116] = 524493394;
        aa.cuep[117] = 1155608764;
        aa.cuep[118] = 1723654785;
        aa.cuep[119] = 27309086;
        aa.cuep[120] = 114261814;
        aa.cuep[121] = -2021582623;
        aa.cuep[122] = -2134788083;
        aa.cuep[123] = -96112970;
        aa.cuep[124] = 978347296;
        aa.cuep[125] = 293702810;
        aa.cuep[126] = -740334531;
        aa.cuep[127] = 1917031755;
        aa.cuep[128] = -2090720943;
        aa.cuep[129] = -1846078771;
        aa.cuep[130] = 397586548;
        aa.cuep[131] = 674095270;
        aa.cuep[132] = -1528823323;
        aa.cuep[133] = -409985923;
        aa.cuep[134] = -1524612794;
        aa.cuep[135] = -1817836457;
        aa.cuep[136] = 1505645399;
        aa.cuep[137] = 1932402175;
        aa.cuep[138] = -1944602892;
        aa.cuep[139] = -1137073966;
        aa.cuep[140] = 387174248;
        aa.cuep[141] = 1234297691;
        aa.cuep[142] = 157573449;
        aa.cuep[143] = -124374955;
        aa.cuep[144] = 170238074;
        aa.cuep[145] = 317092622;
        aa.cuep[146] = -2126781169;
        aa.cuep[147] = -455364279;
        aa.cuep[148] = 182437406;
        aa.cuep[149] = -2100242166;
        aa.cuep[150] = 1846363333;
        aa.cuep[151] = -581968124;
        aa.cuep[152] = 305500470;
        aa.cuep[153] = 1830304519;
        aa.cuep[154] = -1459019307;
        aa.cuep[155] = 847361015;
        aa.cuep[156] = 1072848992;
        aa.cuep[157] = 1287001114;
        aa.cuep[158] = -703917208;
        aa.cuep[159] = 1265661331;
        aa.cuep[160] = -1515179919;
        aa.cuep[161] = 5241827;
        aa.cuep[162] = -530983995;
        aa.cuep[163] = 57096895;
        aa.cuep[164] = -66463013;
        aa.cuep[165] = 694028981;
        aa.cuep[166] = 856524042;
        aa.cuep[167] = 864581531;
        aa.cuep[168] = 45073848;
        aa.cuep[169] = 1664200574;
        aa.cuep[170] = -612957459;
        aa.cuep[171] = 1063526317;
        aa.cuep[172] = -1360076980;
        aa.cuep[173] = 2137245087;
        aa.cuep[174] = 982035896;
        aa.cuep[175] = 502800690;
        aa.cuep[176] = 880383131;
        aa.cuep[177] = -778426581;
        aa.cuep[178] = 1181717747;
        aa.cuep[179] = 88136352;
        aa.cuep[180] = 467722377;
        aa.cuep[181] = 2127544690;
        aa.cuep[182] = -194150602;
        aa.cuep[183] = 1207270255;
        aa.cuep[184] = 1092240477;
        aa.cuep[185] = -388294200;
        aa.cuep[186] = 753036518;
        aa.cuep[187] = 1800765885;
        aa.cuep[188] = 558447231;
        aa.cuep[189] = -113400920;
        aa.cuep[190] = 615457324;
        aa.cuep[191] = 2053216217;
        aa.cuep[192] = -1904253085;
        aa.cuep[193] = -2138712872;
        aa.cuep[194] = -515894703;
        aa.cuep[195] = -681623800;
        aa.cuep[196] = -1796708614;
        aa.cuep[197] = 595318731;
        aa.cuep[198] = -1995756466;
        aa.cuep[199] = 2007360134;
    }

    /*
     * Exception decompiling
     */
    public boolean saveNamed(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 23[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void cvrk() {
        aa.cufe[100] = 598351362951026284L;
        aa.cufe[101] = -2519618530158442907L;
        aa.cufe[102] = -7223811209749022910L;
        aa.cufe[103] = 3629863998033772326L;
        aa.cufe[104] = 8790198185813164044L;
        aa.cufe[105] = 7576377936408075715L;
        aa.cufe[106] = -5527545081893504389L;
        aa.cufe[107] = -665435045131028732L;
        aa.cufe[108] = 7580574267464871953L;
        aa.cufe[109] = 8192683800915878842L;
        aa.cufe[110] = -2877419295606589332L;
        aa.cufe[111] = -2849656635662616535L;
        aa.cufe[112] = 2697785618970234746L;
        aa.cufe[113] = 3496221496862748395L;
        aa.cufe[114] = -1260130480092921714L;
        aa.cufe[115] = 8311472503564802961L;
        aa.cufe[116] = 7597835224514838891L;
        aa.cufe[117] = -6662472090708435155L;
        aa.cufe[118] = -2438496187172961364L;
        aa.cufe[119] = -333150752226914082L;
        aa.cufe[120] = 2863229714428359843L;
        aa.cufe[121] = -3720361637563694441L;
        aa.cufe[122] = 7887904782108634516L;
        aa.cufe[123] = 7502018446353254684L;
        aa.cufe[124] = -169765700014924461L;
        aa.cufe[125] = 4799212017981185303L;
        aa.cufe[126] = 6824245494708541749L;
        aa.cufe[127] = 2769420320909500961L;
        aa.cufe[128] = 6259477585915732221L;
        aa.cufe[129] = 4558849101198703651L;
        aa.cufe[130] = 9044810040713365718L;
        aa.cufe[131] = -2694967682047867990L;
        aa.cufe[132] = -6772522727222083932L;
        aa.cufe[133] = -286056331549241941L;
        aa.cufe[134] = 5524119932581659270L;
        aa.cufe[135] = 5991779197040746237L;
        aa.cufe[136] = -6414007605349120796L;
        aa.cufe[137] = 6346164346761900276L;
        aa.cufe[138] = 2390013571272942314L;
        aa.cufe[139] = -7577369320483091979L;
        aa.cufe[140] = 8880629410347462002L;
        aa.cufe[141] = 4340679318699912342L;
        aa.cufe[142] = 8546218300075611407L;
        aa.cufe[143] = 5489698856355398814L;
        aa.cufe[144] = 8170469746284391687L;
        aa.cufe[145] = 642136219826732535L;
        aa.cufe[146] = -1344183238285903184L;
        aa.cufe[147] = -1718531908219222951L;
        aa.cufe[148] = 7652241437672275600L;
        aa.cufe[149] = -4907162107464305901L;
        aa.cufe[150] = -920938043192250661L;
        aa.cufe[151] = 1745345721377387011L;
        aa.cufe[152] = -2991375017024594781L;
        aa.cufe[153] = 1692340001298045031L;
        aa.cufe[154] = -8473721581659847264L;
        aa.cufe[155] = -4768726154685765873L;
        aa.cufe[156] = -4012172900083127276L;
        aa.cufe[157] = 2266893768685209634L;
        aa.cufe[158] = 5551459087592761188L;
        aa.cufe[159] = 7693522581802058409L;
        aa.cufe[160] = -3949863510069399042L;
        aa.cufe[161] = -7447443823635252966L;
        aa.cufe[162] = 3307155658618456022L;
        aa.cufe[163] = -1943865066960430845L;
        aa.cufe[164] = 7560982082748212309L;
        aa.cufe[165] = -3621415641839170483L;
        aa.cufe[166] = -7836278843047855420L;
        aa.cufe[167] = 8834276868034409401L;
        aa.cufe[168] = 4682999080884846485L;
        aa.cufe[169] = -4334535655747700044L;
        aa.cufe[170] = -316674382266540045L;
        aa.cufe[171] = 5325245426329561089L;
        aa.cufe[172] = -4555173372810932480L;
        aa.cufe[173] = -3867660582194184865L;
        aa.cufe[174] = 4428594405003547407L;
        aa.cufe[175] = -3263824765475651911L;
        aa.cufe[176] = -2162105860264626938L;
        aa.cufe[177] = -3685414699838976202L;
        aa.cufe[178] = 7083708132003683737L;
        aa.cufe[179] = 3600930904343896491L;
        aa.cufe[180] = -3131881052449522467L;
        aa.cufe[181] = -22026163743140070L;
        aa.cufe[182] = 7620511851145431780L;
        aa.cufe[183] = -2560362738518195974L;
        aa.cufe[184] = -5663958692606712724L;
        aa.cufe[185] = 3510844411240322866L;
        aa.cufe[186] = -5434469171104017901L;
        aa.cufe[187] = 1756575873033657391L;
        aa.cufe[188] = -4568138668983728028L;
        aa.cufe[189] = 6583094134193263218L;
        aa.cufe[190] = 2730888687687184931L;
        aa.cufe[191] = 8665923789265659800L;
        aa.cufe[192] = -8038183054144665590L;
        aa.cufe[193] = -5581198338828736608L;
        aa.cufe[194] = -7360921872988193091L;
        aa.cufe[195] = -530499020630014899L;
        aa.cufe[196] = -7975881532784810540L;
        aa.cufe[197] = -8554866367968680115L;
        aa.cufe[198] = -6323830008470431721L;
        aa.cufe[199] = -3994475611691253878L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void registerShutdownHook() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block40: while (true) {
            v0 /* !! */  = (long)(aa.cueq("cuix", cufc(int ), (int)59) - aa.cueq("cuiw", cufc(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block40;
                }
                case -1122619675: {
                    continue block40;
                }
            }
            break;
        }
        var3_1 = aa.c;
        v1 /* !! */  = aa.gl;
        if (true) ** GOTO lbl15
        block41: while (true) {
            v1 /* !! */  = (long)(v2 - aa.cueq("cuiy", cufc(int ), (int)60));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2095961229: {
                    v2 = aa.cueq("cuiz", cufc(int ), (int)61);
                    continue block41;
                }
                case -1554503697: {
                    break block41;
                }
                case -1194880172: {
                    v2 = aa.cueq("cuja", cufc(int ), (int)62);
                    continue block41;
                }
                case -256520792: {
                    v2 = aa.cueq("cujb", cufc(int ), (int)63);
                    continue block41;
                }
            }
            break;
        }
        var2_2 /* !! */  = aa.b;
        v3 /* !! */  = aa.gl;
        if (true) ** GOTO lbl32
        block42: while (true) {
            v3 /* !! */  = (long)(aa.cueq("cujd", cufc(int ), (int)65) - aa.cueq("cujc", cufc(int ), (int)64));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1554503697: {
                    break block42;
                }
                case -73633614: {
                    continue block42;
                }
            }
            break;
        }
        var1_3 = aa.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl43:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl43
                v4 /* !! */  = aa.gl;
                if (true) ** GOTO lbl50
                block44: while (true) {
                    v4 /* !! */  = (long)(v5 - aa.cueq("cuje", cufc(int ), (int)66));
lbl50:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1554503697: {
                            break block44;
                        }
                        case -957090589: {
                            v5 = aa.cueq("cujf", cufc(int ), (int)67);
                            continue block44;
                        }
                        case -842678544: {
                            v5 = aa.cueq("cujg", cufc(int ), (int)68);
                            continue block44;
                        }
                    }
                    break;
                }
                v6 = Runtime.getRuntime();
                v7 /* !! */  = aa.gl;
                if (true) ** GOTO lbl64
                block45: while (true) {
                    v7 /* !! */  = (long)(aa.cueq("cuji", cufc(int ), (int)70) - aa.cueq("cujh", cufc(int ), (int)69));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1554503697: {
                            break block45;
                        }
                        case 1702493190: {
                            continue block45;
                        }
                    }
                    break;
                }
                v8 /* !! */  = aa.gl;
                if (true) ** GOTO lbl73
                block46: while (true) {
                    v8 /* !! */  = (long)(v9 - aa.cueq("cujj", cufc(int ), (int)71));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1554503697: {
                            break block46;
                        }
                        case 552266277: {
                            v9 = aa.cueq("cujk", cufc(int ), (int)72);
                            continue block46;
                        }
                        case 1585383962: {
                            v9 = aa.cueq("cujl", cufc(int ), (int)73);
                            continue block46;
                        }
                    }
                    break;
                }
                v10 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$registerShutdownHook$0(), ()V)((aa)this);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cujm", cufc(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == aa.cueq("cujn", cuen(int ), (int)48)) break;
                    v11 /* !! */  = (long)aa.cueq("cujo", cuen(int ), (int)49);
                }
                v12 = new Thread(v10, "Rich-ConfigShutdown");
                v13 /* !! */  = aa.gl;
                if (true) ** GOTO lbl93
                block48: while (true) {
                    v13 /* !! */  = (long)(aa.cueq("cujq", cufc(int ), (int)76) - aa.cueq("cujp", cufc(int ), (int)75));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1554503697: {
                            break block48;
                        }
                        case -140243885: {
                            continue block48;
                        }
                    }
                    break;
                }
                v6.addShutdownHook(v12);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl101:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cujr", cuen(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cujs", cuen(int ), (int)51);
                    if (!var3_1) break block14;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cujt", cuen(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 3: {
                var2_2 /* !! */  = (int)aa.cueq("cuju", cuen(int ), (int)53);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl120:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)aa.cueq("cujv", cuen(int ), (int)54);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cujw", cuen(int ), (int)55);
        ** while (!var3_1)
lbl127:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$listNamedConfigs$5(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvmj", cufc(int ), (int)300)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == aa.cueq("cvmk", cuen(int ), (int)412)) break;
            v0 /* !! */  = (long)aa.cueq("cvml", cuen(int ), (int)413);
        }
        var3_1 = aa.c;
        v1 /* !! */  = aa.gl;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - aa.cueq("cvmm", cufc(int ), (int)301));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1554503697: {
                    break block12;
                }
                case 1287268048: {
                    v2 = aa.cueq("cvmn", cufc(int ), (int)302);
                    continue block12;
                }
                case 2023222011: {
                    v2 = aa.cueq("cvmo", cufc(int ), (int)303);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvmp", cufc(int ), (int)304)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == aa.cueq("cvmq", cuen(int ), (int)414)) break;
            v3 /* !! */  = (long)aa.cueq("cvmr", cuen(int ), (int)415);
        }
        var1_3 = aa.a;
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
                v4 = aa.cueq("cvms", cuen(int ), (int)416);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvmt", cufc(int ), (int)305)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == aa.cueq("cvmu", cuen(int ), (int)417)) break;
                    v5 /* !! */  = (long)aa.cueq("cvmv", cuen(int ), (int)418);
                }
                v6 = var0.length() - aa.cueq("cvmw", cuen(int ), (int)419);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = aa.gl - aa.cueq("cvmx", cufc(int ), (int)306)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == aa.cueq("cvmy", cuen(int ), (int)420)) break;
                    v7 /* !! */  = (long)aa.cueq("cvmz", cuen(int ), (int)421);
                }
                return var0.substring((int)v4, v6);
            }
            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvna", cuen(int ), (int)422);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cvnb", cuen(int ), (int)423);
                if (var3_1) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cvnc", cuen(int ), (int)424);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)aa.cueq("cvnd", cuen(int ), (int)425);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInitialized() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvkf", cufc(int ), (int)278)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == aa.cueq("cvkg", cuen(int ), (int)378)) break;
            v0 /* !! */  = (long)aa.cueq("cvkh", cuen(int ), (int)379);
        }
        var3_1 = aa.c;
        v1 /* !! */  = aa.gl;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - aa.cueq("cvki", cufc(int ), (int)279));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1683371583: {
                    v2 = aa.cueq("cvkj", cufc(int ), (int)280);
                    continue block12;
                }
                case -1554503697: {
                    break block12;
                }
                case 708809518: {
                    v2 = aa.cueq("cvkk", cufc(int ), (int)281);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvkl", cufc(int ), (int)282)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == aa.cueq("cvkm", cuen(int ), (int)380)) break;
            v3 /* !! */  = (long)aa.cueq("cvkn", cuen(int ), (int)381);
        }
        var1_3 = aa.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)aa.cueq("cvko", cuen(int ), (int)382);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvkp", cufc(int ), (int)283)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == aa.cueq("cvkq", cuen(int ), (int)383)) break;
                    v4 /* !! */  = (long)aa.cueq("cvkr", cuen(int ), (int)384);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = aa.gl - aa.cueq("cvks", cufc(int ), (int)284)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == aa.cueq("cvkt", cuen(int ), (int)385)) break;
                    v5 /* !! */  = (long)aa.cueq("cvku", cuen(int ), (int)386);
                }
                return this.initialized.get();
lbl49:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)aa.cueq("cvkv", cuen(int ), (int)387);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)aa.cueq("cvkw", cuen(int ), (int)388);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)aa.cueq("cvkx", cuen(int ), (int)389);
                    if (!var3_1) ** GOTO lbl49
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)aa.cueq("cvky", cuen(int ), (int)390);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cvqw() {
        aa.cueo[100] = -756604765;
        aa.cueo[101] = 2058076972;
        aa.cueo[102] = 2102326224;
        aa.cueo[103] = -1026500063;
        aa.cueo[104] = -1439391417;
        aa.cueo[105] = -355091280;
        aa.cueo[106] = -1806536532;
        aa.cueo[107] = -361845939;
        aa.cueo[108] = 1602184753;
        aa.cueo[109] = 1298618938;
        aa.cueo[110] = -1474209688;
        aa.cueo[111] = -2057063116;
        aa.cueo[112] = 272301981;
        aa.cueo[113] = 1421347903;
        aa.cueo[114] = -1072793052;
        aa.cueo[115] = -774953885;
        aa.cueo[116] = 524493395;
        aa.cueo[117] = 1343072512;
        aa.cueo[118] = 1723654784;
        aa.cueo[119] = -1950693186;
        aa.cueo[120] = -114261815;
        aa.cueo[121] = -1501319949;
        aa.cueo[122] = -2134788084;
        aa.cueo[123] = 1639066135;
        aa.cueo[124] = 978347297;
        aa.cueo[125] = -1756593389;
        aa.cueo[126] = -740334531;
        aa.cueo[127] = 1917031775;
        aa.cueo[128] = -2090720936;
        aa.cueo[129] = -1846078771;
        aa.cueo[130] = 397586544;
        aa.cueo[131] = 674095287;
        aa.cueo[132] = -1528823325;
        aa.cueo[133] = -409985936;
        aa.cueo[134] = -1524612791;
        aa.cueo[135] = -1817836479;
        aa.cueo[136] = 1505645400;
        aa.cueo[137] = 1932402173;
        aa.cueo[138] = -1944602883;
        aa.cueo[139] = -1137073981;
        aa.cueo[140] = 387174240;
        aa.cueo[141] = 1234297689;
        aa.cueo[142] = 157573469;
        aa.cueo[143] = -124374960;
        aa.cueo[144] = 170238061;
        aa.cueo[145] = 317092639;
        aa.cueo[146] = -2126781169;
        aa.cueo[147] = -455364285;
        aa.cueo[148] = 182437399;
        aa.cueo[149] = -2100242145;
        aa.cueo[150] = 1846363342;
        aa.cueo[151] = -581968124;
        aa.cueo[152] = 305500471;
        aa.cueo[153] = 737583216;
        aa.cueo[154] = -1459019308;
        aa.cueo[155] = -830863480;
        aa.cueo[156] = 1072848993;
        aa.cueo[157] = 1567652337;
        aa.cueo[158] = -703917207;
        aa.cueo[159] = 1979778475;
        aa.cueo[160] = -1515179919;
        aa.cueo[161] = 5241826;
        aa.cueo[162] = 1083841588;
        aa.cueo[163] = 57096894;
        aa.cueo[164] = 1713032114;
        aa.cueo[165] = 694028980;
        aa.cueo[166] = 101117100;
        aa.cueo[167] = 864581530;
        aa.cueo[168] = 45073848;
        aa.cueo[169] = 1664200575;
        aa.cueo[170] = 1194217108;
        aa.cueo[171] = 1063526316;
        aa.cueo[172] = 26698447;
        aa.cueo[173] = 2137245087;
        aa.cueo[174] = 982035894;
        aa.cueo[175] = 502800702;
        aa.cueo[176] = 880383117;
        aa.cueo[177] = -778426583;
        aa.cueo[178] = 1181717753;
        aa.cueo[179] = 88136370;
        aa.cueo[180] = 467722377;
        aa.cueo[181] = 2127544678;
        aa.cueo[182] = -194150621;
        aa.cueo[183] = 1207270271;
        aa.cueo[184] = 0x411A4444;
        aa.cueo[185] = -388294203;
        aa.cueo[186] = 753036526;
        aa.cueo[187] = 1800765884;
        aa.cueo[188] = 558447217;
        aa.cueo[189] = -113400923;
        aa.cueo[190] = 615457318;
        aa.cueo[191] = 2053216213;
        aa.cueo[192] = -1904253083;
        aa.cueo[193] = -2138712895;
        aa.cueo[194] = -515894700;
        aa.cueo[195] = -681623784;
        aa.cueo[196] = -1796708632;
        aa.cueo[197] = 595318729;
        aa.cueo[198] = -1995756479;
        aa.cueo[199] = 2007360151;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$listNamedConfigs$2(Path path) {
        boolean bl2;
        Object object = gl;
        block12: while (true) {
            switch ((int)object) {
                case -1554503697: {
                    break block12;
                }
                case -1080656497: {
                    object = aa.cueq("cvos", cufc(int ), (int)323) - aa.cueq("cvor", cufc(int ), (int)322);
                    continue block12;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = gl;
        block13: while (true) {
            switch ((int)object2) {
                case -1554503697: {
                    break block13;
                }
                case -1271460318: {
                    object2 = aa.cueq("cvou", cufc(int ), (int)325) - aa.cueq("cvot", cufc(int ), (int)324);
                    continue block13;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = gl - aa.cueq("cvov", cufc(int ), (int)326)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == aa.cueq("cvow", cuen(int ), (int)450)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = aa.cueq("cvox", cuen(int ), (int)451);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = gl;
        block15: while (true) {
            switch ((int)object4) {
                case -1554503697: {
                    break block15;
                }
                case 346161580: {
                    object4 = aa.cueq("cvoz", cufc(int ), (int)328) - aa.cueq("cvoy", cufc(int ), (int)327);
                    continue block15;
                }
            }
            break;
        }
        Path path2 = path.getFileName();
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = gl - aa.cueq("cvpa", cufc(int ), (int)329)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == aa.cueq("cvpb", cuen(int ), (int)452)) {
                return path2.toString();
            }
            object5 = aa.cueq("cvpc", cuen(int ), (int)453);
        }
    }

    private static /* synthetic */ void cvqy() {
        aa.cueo[300] = -1043753368;
        aa.cueo[301] = 997427926;
        aa.cueo[302] = -1511527719;
        aa.cueo[303] = -1911237298;
        aa.cueo[304] = -805089950;
        aa.cueo[305] = 1973235339;
        aa.cueo[306] = -1893428008;
        aa.cueo[307] = 1266463262;
        aa.cueo[308] = -1307068371;
        aa.cueo[309] = -1540818917;
        aa.cueo[310] = 155734297;
        aa.cueo[311] = -1459934997;
        aa.cueo[312] = 637493015;
        aa.cueo[313] = 336759490;
        aa.cueo[314] = -330343034;
        aa.cueo[315] = -2137583244;
        aa.cueo[316] = -1783069881;
        aa.cueo[317] = -1291109701;
        aa.cueo[318] = 1473136849;
        aa.cueo[319] = 425785962;
        aa.cueo[320] = 475679187;
        aa.cueo[321] = 1252345508;
        aa.cueo[322] = 1020221240;
        aa.cueo[323] = 923820147;
        aa.cueo[324] = 398400256;
        aa.cueo[325] = -1456971921;
        aa.cueo[326] = -604822899;
        aa.cueo[327] = -925688883;
        aa.cueo[328] = -348469618;
        aa.cueo[329] = 2026100722;
        aa.cueo[330] = -555896100;
        aa.cueo[331] = 2101496615;
        aa.cueo[332] = -2025860078;
        aa.cueo[333] = -1525446394;
        aa.cueo[334] = 1527651328;
        aa.cueo[335] = -1913018768;
        aa.cueo[336] = -2104200761;
        aa.cueo[337] = -384421059;
        aa.cueo[338] = 2094075121;
        aa.cueo[339] = 2932773;
        aa.cueo[340] = 1696469203;
        aa.cueo[341] = 490191764;
        aa.cueo[342] = 1554235008;
        aa.cueo[343] = -36578172;
        aa.cueo[344] = 126200260;
        aa.cueo[345] = -270261046;
        aa.cueo[346] = 540232479;
        aa.cueo[347] = 1897354540;
        aa.cueo[348] = 1973793489;
        aa.cueo[349] = 693263159;
        aa.cueo[350] = 2042990382;
        aa.cueo[351] = 1492926108;
        aa.cueo[352] = 718267037;
        aa.cueo[353] = 861631239;
        aa.cueo[354] = 260820555;
        aa.cueo[355] = 1576683580;
        aa.cueo[356] = 793803971;
        aa.cueo[357] = -884540512;
        aa.cueo[358] = -694820782;
        aa.cueo[359] = -392851511;
        aa.cueo[360] = -1166695921;
        aa.cueo[361] = -413221100;
        aa.cueo[362] = -726900879;
        aa.cueo[363] = 63200623;
        aa.cueo[364] = -2112073080;
        aa.cueo[365] = -557484241;
        aa.cueo[366] = -1764400444;
        aa.cueo[367] = -1547699565;
        aa.cueo[368] = -1251846672;
        aa.cueo[369] = -1590808588;
        aa.cueo[370] = 1759922752;
        aa.cueo[371] = -1817117735;
        aa.cueo[372] = -765286361;
        aa.cueo[373] = -1714570911;
        aa.cueo[374] = 707379665;
        aa.cueo[375] = -1547944183;
        aa.cueo[376] = 1027930808;
        aa.cueo[377] = 80104855;
        aa.cueo[378] = -1804870373;
        aa.cueo[379] = -2055429183;
        aa.cueo[380] = -1509265792;
        aa.cueo[381] = 653870072;
        aa.cueo[382] = -496343569;
        aa.cueo[383] = -260781741;
        aa.cueo[384] = 1900444937;
        aa.cueo[385] = -180259100;
        aa.cueo[386] = 542537099;
        aa.cueo[387] = 1952695110;
        aa.cueo[388] = 1334870004;
        aa.cueo[389] = -1804677217;
        aa.cueo[390] = -40477617;
        aa.cueo[391] = 2093983133;
        aa.cueo[392] = 1860122209;
        aa.cueo[393] = -1234334207;
        aa.cueo[394] = -1441409729;
        aa.cueo[395] = -34319986;
        aa.cueo[396] = -380350111;
        aa.cueo[397] = -1252825819;
        aa.cueo[398] = 1832236528;
        aa.cueo[399] = -1786045316;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$listNamedConfigs$3(String var0) {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(aa.cueq("cvob", cufc(int ), (int)315) - aa.cueq("cvoa", cufc(int ), (int)314));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block16;
                }
                case -1356789665: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = aa.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvoc", cufc(int ), (int)316)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == aa.cueq("cvod", cuen(int ), (int)441)) break;
            v1 /* !! */  = (long)aa.cueq("cvoe", cuen(int ), (int)442);
        }
        var2_2 /* !! */  = aa.b;
        v2 /* !! */  = aa.gl;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - aa.cueq("cvof", cufc(int ), (int)317));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2116768657: {
                    v3 = aa.cueq("cvog", cufc(int ), (int)318);
                    continue block18;
                }
                case -1554503697: {
                    break block18;
                }
                case -1026920788: {
                    v3 = aa.cueq("cvoh", cufc(int ), (int)319);
                    continue block18;
                }
                case 1106168644: {
                    v3 = aa.cueq("cvoi", cufc(int ), (int)320);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = aa.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (boolean)aa.cueq("cvoj", cuen(int ), (int)443);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvok", cufc(int ), (int)321)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == aa.cueq("cvol", cuen(int ), (int)444)) break;
                    v4 /* !! */  = (long)aa.cueq("cvom", cuen(int ), (int)445);
                }
                return var0.endsWith(".file");
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvon", cuen(int ), (int)446);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cvoo", cuen(int ), (int)447);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvop", cuen(int ), (int)448);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvoq", cuen(int ), (int)449);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cvrj() {
        aa.cufe[0] = -5999880814632976490L;
        aa.cufe[1] = 7196949130646590850L;
        aa.cufe[2] = 4219634284665203675L;
        aa.cufe[3] = 1851536679993332748L;
        aa.cufe[4] = 6807454529332300578L;
        aa.cufe[5] = -1805739499287490833L;
        aa.cufe[6] = 6342967160287056860L;
        aa.cufe[7] = 7287431617559787266L;
        aa.cufe[8] = -1734770647046737575L;
        aa.cufe[9] = 1069331854376390269L;
        aa.cufe[10] = -2429860109796255342L;
        aa.cufe[11] = 290851676384933688L;
        aa.cufe[12] = -7878317429577200221L;
        aa.cufe[13] = 4610484394400005965L;
        aa.cufe[14] = -2635258346843512849L;
        aa.cufe[15] = -4461723620075579988L;
        aa.cufe[16] = -1925439859052683664L;
        aa.cufe[17] = -1982574758430978251L;
        aa.cufe[18] = 4857867918630074435L;
        aa.cufe[19] = 8473585330625357577L;
        aa.cufe[20] = -9001536373325652841L;
        aa.cufe[21] = -1661184587199095135L;
        aa.cufe[22] = -3223240133672961837L;
        aa.cufe[23] = 8517941973611834768L;
        aa.cufe[24] = -3234296797653005511L;
        aa.cufe[25] = 8681072435705012175L;
        aa.cufe[26] = -479816869555318268L;
        aa.cufe[27] = -6239943556370189520L;
        aa.cufe[28] = -2504468687458075636L;
        aa.cufe[29] = 4275444936302500228L;
        aa.cufe[30] = 5051082410859504680L;
        aa.cufe[31] = 991575286628316156L;
        aa.cufe[32] = -5210853848218596417L;
        aa.cufe[33] = 576366556555911644L;
        aa.cufe[34] = 7419540269893544607L;
        aa.cufe[35] = -8789534686270192018L;
        aa.cufe[36] = 1335915889071220749L;
        aa.cufe[37] = 5402294928560650808L;
        aa.cufe[38] = -8531349814397035664L;
        aa.cufe[39] = 5740643856892768687L;
        aa.cufe[40] = 8750073786778200615L;
        aa.cufe[41] = 8816160509847738597L;
        aa.cufe[42] = 7775074575437169600L;
        aa.cufe[43] = 5720724169087969165L;
        aa.cufe[44] = -2478055147243997796L;
        aa.cufe[45] = -5989359540778908639L;
        aa.cufe[46] = 7093884789010075773L;
        aa.cufe[47] = 4685167912413076942L;
        aa.cufe[48] = 5242059432233580330L;
        aa.cufe[49] = 8056614208684440683L;
        aa.cufe[50] = 3586416517118439811L;
        aa.cufe[51] = 482935453874903975L;
        aa.cufe[52] = -860152358866035498L;
        aa.cufe[53] = -995052870445775486L;
        aa.cufe[54] = 1292063350349696368L;
        aa.cufe[55] = 3397309197336092670L;
        aa.cufe[56] = -8284883845331815051L;
        aa.cufe[57] = -4180572958100725227L;
        aa.cufe[58] = 2450913036707154964L;
        aa.cufe[59] = -8967476462687243058L;
        aa.cufe[60] = 5079081684249026045L;
        aa.cufe[61] = 6192914946900710140L;
        aa.cufe[62] = -8476913145298405265L;
        aa.cufe[63] = -4260931304964037898L;
        aa.cufe[64] = 5015293428057541210L;
        aa.cufe[65] = 6163353498092294411L;
        aa.cufe[66] = -1958550031794692576L;
        aa.cufe[67] = 6152327407321454660L;
        aa.cufe[68] = 2759586586562017840L;
        aa.cufe[69] = -7638979333151388252L;
        aa.cufe[70] = -8230698324529190924L;
        aa.cufe[71] = -3352234811254334544L;
        aa.cufe[72] = 5987795674031949037L;
        aa.cufe[73] = 3184357442560012848L;
        aa.cufe[74] = -380302553490341349L;
        aa.cufe[75] = 3013456273068963233L;
        aa.cufe[76] = -2639382952505459103L;
        aa.cufe[77] = 1425496966544412743L;
        aa.cufe[78] = 1341617675959523130L;
        aa.cufe[79] = -4011130298427469351L;
        aa.cufe[80] = 128212744513514610L;
        aa.cufe[81] = -2894721935864639965L;
        aa.cufe[82] = -6957759658023818073L;
        aa.cufe[83] = 2148118896030675693L;
        aa.cufe[84] = -1677737259297311434L;
        aa.cufe[85] = 3549773271636986100L;
        aa.cufe[86] = -5953983958684803915L;
        aa.cufe[87] = -6870931457023799784L;
        aa.cufe[88] = 4736451497745188826L;
        aa.cufe[89] = -718019996209665425L;
        aa.cufe[90] = -2887930825560173292L;
        aa.cufe[91] = -4579451888367616136L;
        aa.cufe[92] = -7629714310636565583L;
        aa.cufe[93] = 1664565693044194259L;
        aa.cufe[94] = -1263935637479461322L;
        aa.cufe[95] = -7290619240832635128L;
        aa.cufe[96] = -7458798779098822622L;
        aa.cufe[97] = 8490362027105960841L;
        aa.cufe[98] = 121374764251226199L;
        aa.cufe[99] = -515265515615975722L;
    }

    /*
     * Exception decompiling
     */
    public boolean deleteNamed(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 7[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void cvra() {
        aa.cuep[0] = -1709923359;
        aa.cuep[1] = 342801722;
        aa.cuep[2] = 662686961;
        aa.cuep[3] = -707360984;
        aa.cuep[4] = -1003067456;
        aa.cuep[5] = 687947810;
        aa.cuep[6] = -1563420168;
        aa.cuep[7] = 338272252;
        aa.cuep[8] = -1948014409;
        aa.cuep[9] = -522795378;
        aa.cuep[10] = 1280430492;
        aa.cuep[11] = -1387831446;
        aa.cuep[12] = 933840703;
        aa.cuep[13] = 214423518;
        aa.cuep[14] = 993039726;
        aa.cuep[15] = 1167474838;
        aa.cuep[16] = 415564596;
        aa.cuep[17] = 1603155669;
        aa.cuep[18] = -506204110;
        aa.cuep[19] = 377098414;
        aa.cuep[20] = -712585587;
        aa.cuep[21] = 2048288629;
        aa.cuep[22] = -145223396;
        aa.cuep[23] = -1492146008;
        aa.cuep[24] = -800726974;
        aa.cuep[25] = 1621448047;
        aa.cuep[26] = -747002637;
        aa.cuep[27] = -531415243;
        aa.cuep[28] = 992551917;
        aa.cuep[29] = 691761028;
        aa.cuep[30] = 1493235509;
        aa.cuep[31] = -547217068;
        aa.cuep[32] = 1687043658;
        aa.cuep[33] = -1768310746;
        aa.cuep[34] = 988119381;
        aa.cuep[35] = -1448740579;
        aa.cuep[36] = 2033937731;
        aa.cuep[37] = -94011098;
        aa.cuep[38] = 1940837908;
        aa.cuep[39] = 1582100770;
        aa.cuep[40] = -1545147848;
        aa.cuep[41] = 987854632;
        aa.cuep[42] = 1837347565;
        aa.cuep[43] = -336341930;
        aa.cuep[44] = 1437774082;
        aa.cuep[45] = 1980485837;
        aa.cuep[46] = 1099852391;
        aa.cuep[47] = 593415119;
        aa.cuep[48] = -49760293;
        aa.cuep[49] = -1199706569;
        aa.cuep[50] = 1764665734;
        aa.cuep[51] = 1866719913;
        aa.cuep[52] = -1596010632;
        aa.cuep[53] = -1954117796;
        aa.cuep[54] = -435815339;
        aa.cuep[55] = 932076421;
        aa.cuep[56] = -1534214029;
        aa.cuep[57] = 1134398632;
        aa.cuep[58] = -990253238;
        aa.cuep[59] = 710435350;
        aa.cuep[60] = -1815701776;
        aa.cuep[61] = -990961246;
        aa.cuep[62] = -309751983;
        aa.cuep[63] = -776459663;
        aa.cuep[64] = 1796887715;
        aa.cuep[65] = 1733093054;
        aa.cuep[66] = -367058979;
        aa.cuep[67] = 924230590;
        aa.cuep[68] = -1251172036;
        aa.cuep[69] = -1004660973;
        aa.cuep[70] = 1576973340;
        aa.cuep[71] = -883201181;
        aa.cuep[72] = 1078765748;
        aa.cuep[73] = 627419676;
        aa.cuep[74] = -437737620;
        aa.cuep[75] = -1488826782;
        aa.cuep[76] = 1389169385;
        aa.cuep[77] = 358763964;
        aa.cuep[78] = -309942004;
        aa.cuep[79] = 1161624831;
        aa.cuep[80] = 1832038508;
        aa.cuep[81] = 447052930;
        aa.cuep[82] = 32591638;
        aa.cuep[83] = -1219898202;
        aa.cuep[84] = 83597466;
        aa.cuep[85] = 915354670;
        aa.cuep[86] = -1945672532;
        aa.cuep[87] = -1638734838;
        aa.cuep[88] = 1060893929;
        aa.cuep[89] = -286257036;
        aa.cuep[90] = 858744689;
        aa.cuep[91] = 1278643601;
        aa.cuep[92] = -1671355005;
        aa.cuep[93] = -815018497;
        aa.cuep[94] = -1246828485;
        aa.cuep[95] = -1613927442;
        aa.cuep[96] = -246453480;
        aa.cuep[97] = -263030344;
        aa.cuep[98] = -28654842;
        aa.cuep[99] = 1498897679;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public af getAutoSaver() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvls", cufc(int ), (int)293)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == aa.cueq("cvlt", cuen(int ), (int)402)) break;
            v0 /* !! */  = (long)aa.cueq("cvlu", cuen(int ), (int)403);
        }
        var3_1 = aa.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvlv", cufc(int ), (int)294)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == aa.cueq("cvlw", cuen(int ), (int)404)) break;
            v1 /* !! */  = (long)aa.cueq("cvlx", cuen(int ), (int)405);
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = aa.gl - aa.cueq("cvly", cufc(int ), (int)295)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == aa.cueq("cvlz", cuen(int ), (int)406)) {
                var1_3 = aa.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)aa.cueq("cvma", cuen(int ), (int)407);
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block15: while (true) {
            block23: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = aa.gl;
                        block16: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1554503697: {
                                    return this.autoSaver;
                                }
                                case -848745715: {
                                    v4 = aa.cueq("cvmc", cufc(int ), (int)297);
                                    ** GOTO lbl42
                                }
                                case -146684156: {
                                    v4 = aa.cueq("cvmd", cufc(int ), (int)298);
                                    ** GOTO lbl42
                                }
                                case 1996033005: {
                                    v4 = aa.cueq("cvme", cufc(int ), (int)299);
lbl42:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - aa.cueq("cvmb", cufc(int ), (int)296));
                                    continue block16;
                                }
                            }
                            break;
                        }
                        return this.autoSaver;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)aa.cueq("cvmh", cuen(int ), (int)410);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block23;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)aa.cueq("cvmi", cuen(int ), (int)411);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)aa.cueq("cvmf", cuen(int ), (int)408);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl65
            }
            do {
                if (true) continue block15;
lbl65:
                // 2 sources

                var2_2 /* !! */  = (int)aa.cueq("cvmg", cuen(int ), (int)409);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void cvrf() {
        aa.cufd[0] = -4117220734358263453L;
        aa.cufd[1] = -1166838044502117418L;
        aa.cufd[2] = -3592143233258390006L;
        aa.cufd[3] = 4467549500295086490L;
        aa.cufd[4] = 6397939574383370373L;
        aa.cufd[5] = -6077473703900606578L;
        aa.cufd[6] = 1381269073749088919L;
        aa.cufd[7] = 543684202883604425L;
        aa.cufd[8] = -7435093371969972211L;
        aa.cufd[9] = 5303017947368967961L;
        aa.cufd[10] = 8265021052709467715L;
        aa.cufd[11] = 463735120999468420L;
        aa.cufd[12] = 2922698406477670422L;
        aa.cufd[13] = 4676692573374974438L;
        aa.cufd[14] = 4312821931819212933L;
        aa.cufd[15] = -1243244312528188724L;
        aa.cufd[16] = -6610593955682268339L;
        aa.cufd[17] = -1596414479809719326L;
        aa.cufd[18] = -264013244602775292L;
        aa.cufd[19] = 2995482582843377726L;
        aa.cufd[20] = 6309858179582109850L;
        aa.cufd[21] = 7477806289869894320L;
        aa.cufd[22] = 6807011587042993064L;
        aa.cufd[23] = 912212720164230161L;
        aa.cufd[24] = 950089638981395707L;
        aa.cufd[25] = 6356668108029441744L;
        aa.cufd[26] = 5692393073864381373L;
        aa.cufd[27] = 1652461970243501887L;
        aa.cufd[28] = 6565418561278446950L;
        aa.cufd[29] = 6862708578304145314L;
        aa.cufd[30] = -8798526529498930944L;
        aa.cufd[31] = 2500122886902228207L;
        aa.cufd[32] = 2228088515242943353L;
        aa.cufd[33] = 1521362467655273637L;
        aa.cufd[34] = -1424517844937041309L;
        aa.cufd[35] = -4344586976414622438L;
        aa.cufd[36] = 5863273080141569926L;
        aa.cufd[37] = 3701302861324725959L;
        aa.cufd[38] = 365023420671063095L;
        aa.cufd[39] = 9019976419720262251L;
        aa.cufd[40] = -3729014017253150528L;
        aa.cufd[41] = 8425663522039476182L;
        aa.cufd[42] = 8423336499114101849L;
        aa.cufd[43] = 1251073684264517518L;
        aa.cufd[44] = 1340072617627807879L;
        aa.cufd[45] = -8970838784430962457L;
        aa.cufd[46] = -3601526130641007045L;
        aa.cufd[47] = 3810477373834531803L;
        aa.cufd[48] = 6104346792142989821L;
        aa.cufd[49] = -6943285177774042491L;
        aa.cufd[50] = -598655509346312154L;
        aa.cufd[51] = 6438598190751347125L;
        aa.cufd[52] = -2123199138653981830L;
        aa.cufd[53] = -7436461072188252561L;
        aa.cufd[54] = -4770540500359447496L;
        aa.cufd[55] = -5516992583235462892L;
        aa.cufd[56] = -4373163825034272748L;
        aa.cufd[57] = -8554555256057424141L;
        aa.cufd[58] = 7220613821244147838L;
        aa.cufd[59] = 4120299092412929831L;
        aa.cufd[60] = -1230154033476359653L;
        aa.cufd[61] = 1454920288198184760L;
        aa.cufd[62] = -6990735603040720468L;
        aa.cufd[63] = -2133912320358364255L;
        aa.cufd[64] = -5980721738050320911L;
        aa.cufd[65] = 8031882270983648801L;
        aa.cufd[66] = -488873913777306170L;
        aa.cufd[67] = -4175026393680405821L;
        aa.cufd[68] = 5974586978459963076L;
        aa.cufd[69] = 915496505048545941L;
        aa.cufd[70] = 2019959879264632666L;
        aa.cufd[71] = -3919058543898564831L;
        aa.cufd[72] = -250162654776760619L;
        aa.cufd[73] = -6858740486912526894L;
        aa.cufd[74] = -3767326782601463895L;
        aa.cufd[75] = -3566510729232326821L;
        aa.cufd[76] = 3241020382506944968L;
        aa.cufd[77] = -3755394533338642571L;
        aa.cufd[78] = -7774902255314062277L;
        aa.cufd[79] = -1866436655922007473L;
        aa.cufd[80] = 6713625623709888281L;
        aa.cufd[81] = 3261863752782709606L;
        aa.cufd[82] = 4821239993220825391L;
        aa.cufd[83] = -7014834315755765498L;
        aa.cufd[84] = 3380499090376757802L;
        aa.cufd[85] = 7767019162419888236L;
        aa.cufd[86] = -2529444988803276194L;
        aa.cufd[87] = 8674843759655364425L;
        aa.cufd[88] = 7520412748471430533L;
        aa.cufd[89] = -6723547032084718177L;
        aa.cufd[90] = 9098520092478486857L;
        aa.cufd[91] = 2880546496269681124L;
        aa.cufd[92] = 1444208402478803731L;
        aa.cufd[93] = 534205322547220243L;
        aa.cufd[94] = -7423453972318714050L;
        aa.cufd[95] = -2576404761612378864L;
        aa.cufd[96] = -5341622357749162714L;
        aa.cufd[97] = 698438932257528236L;
        aa.cufd[98] = 8517489043538515537L;
        aa.cufd[99] = 3551829525231034116L;
    }

    private static /* synthetic */ void cvre() {
        aa.cuep[400] = -456387576;
        aa.cuep[401] = 283229857;
        aa.cuep[402] = 653297454;
        aa.cuep[403] = 21008955;
        aa.cuep[404] = -912311892;
        aa.cuep[405] = -1018095307;
        aa.cuep[406] = -565232690;
        aa.cuep[407] = 307921185;
        aa.cuep[408] = -1660770644;
        aa.cuep[409] = -1117322976;
        aa.cuep[410] = 896376925;
        aa.cuep[411] = -734399298;
        aa.cuep[412] = -2129853216;
        aa.cuep[413] = -1530404639;
        aa.cuep[414] = 38088384;
        aa.cuep[415] = 1931575442;
        aa.cuep[416] = 158660254;
        aa.cuep[417] = -802837957;
        aa.cuep[418] = 699727104;
        aa.cuep[419] = -1807771342;
        aa.cuep[420] = -1017520013;
        aa.cuep[421] = 1639381028;
        aa.cuep[422] = -966999940;
        aa.cuep[423] = 1023323711;
        aa.cuep[424] = -2084702756;
        aa.cuep[425] = 677124957;
        aa.cuep[426] = -1134272782;
        aa.cuep[427] = -87705160;
        aa.cuep[428] = 252865993;
        aa.cuep[429] = -1543655450;
        aa.cuep[430] = 1864712393;
        aa.cuep[431] = 1045336493;
        aa.cuep[432] = -352898486;
        aa.cuep[433] = -951751543;
        aa.cuep[434] = -169622368;
        aa.cuep[435] = -811048018;
        aa.cuep[436] = 729732307;
        aa.cuep[437] = -1948815783;
        aa.cuep[438] = 159318340;
        aa.cuep[439] = 1930966295;
        aa.cuep[440] = -2126431474;
        aa.cuep[441] = -207573086;
        aa.cuep[442] = 1546502900;
        aa.cuep[443] = 748464939;
        aa.cuep[444] = 340334175;
        aa.cuep[445] = 1186475881;
        aa.cuep[446] = 121711252;
        aa.cuep[447] = -380614280;
        aa.cuep[448] = -1965269188;
        aa.cuep[449] = -502863761;
        aa.cuep[450] = 603556788;
        aa.cuep[451] = 102077319;
        aa.cuep[452] = -849759566;
        aa.cuep[453] = 273820491;
        aa.cuep[454] = -2014563889;
        aa.cuep[455] = -1436937057;
        aa.cuep[456] = -324362795;
        aa.cuep[457] = -1795942786;
        aa.cuep[458] = -1334165816;
        aa.cuep[459] = 1538498312;
        aa.cuep[460] = 2066361949;
        aa.cuep[461] = 963710017;
        aa.cuep[462] = -1034458790;
        aa.cuep[463] = 159169728;
        aa.cuep[464] = 1044379532;
        aa.cuep[465] = -1743168098;
        aa.cuep[466] = 265875220;
        aa.cuep[467] = 1312398902;
        aa.cuep[468] = -1792579919;
        aa.cuep[469] = -855851234;
        aa.cuep[470] = -1719612758;
        aa.cuep[471] = 232361766;
        aa.cuep[472] = 837898016;
        aa.cuep[473] = 1031117332;
        aa.cuep[474] = -874181615;
        aa.cuep[475] = -760420547;
        aa.cuep[476] = -878439377;
        aa.cuep[477] = 1994586361;
        aa.cuep[478] = -438148009;
        aa.cuep[479] = 285481904;
        aa.cuep[480] = -2032328838;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void shutdown() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cveq", cufc(int ), (int)212));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block34;
                }
                case -517222875: {
                    v1 = aa.cueq("cver", cufc(int ), (int)213);
                    continue block34;
                }
                case 525178521: {
                    v1 = aa.cueq("cves", cufc(int ), (int)214);
                    continue block34;
                }
                case 1354686164: {
                    v1 = aa.cueq("cvet", cufc(int ), (int)215);
                    continue block34;
                }
            }
            break;
        }
        var3_1 = aa.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cveu", cufc(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == aa.cueq("cvev", cuen(int ), (int)299)) break;
            v2 /* !! */  = (long)aa.cueq("cvew", cuen(int ), (int)300);
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvex", cufc(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == aa.cueq("cvey", cuen(int ), (int)301)) break;
            v3 /* !! */  = (long)aa.cueq("cvez", cuen(int ), (int)302);
        }
        var1_3 = aa.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl35:
                    // 6 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl35
                v4 /* !! */  = aa.gl;
                if (true) ** GOTO lbl42
                block38: while (true) {
                    v4 /* !! */  = (long)(v5 - aa.cueq("cvfa", cufc(int ), (int)218));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1601017675: {
                            v5 = aa.cueq("cvfb", cufc(int ), (int)219);
                            continue block38;
                        }
                        case -1554503697: {
                            break block38;
                        }
                        case -568769503: {
                            v5 = aa.cueq("cvfc", cufc(int ), (int)220);
                            continue block38;
                        }
                        case 1482477523: {
                            v5 = aa.cueq("cvfd", cufc(int ), (int)221);
                            continue block38;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvfe", cufc(int ), (int)222)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == aa.cueq("cvff", cuen(int ), (int)303)) break;
                    v6 /* !! */  = (long)aa.cueq("cvfg", cuen(int ), (int)304);
                }
                if (this.initialized.get()) ** GOTO lbl62
                if (var1_3 || var1_3) ** GOTO lbl35
                return;
lbl62:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl35
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = aa.gl - aa.cueq("cvfh", cufc(int ), (int)223)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == aa.cueq("cvfi", cuen(int ), (int)305)) break;
                    v7 /* !! */  = (long)aa.cueq("cvfj", cuen(int ), (int)306);
                }
                v8 /* !! */  = aa.gl;
                if (true) ** GOTO lbl72
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - aa.cueq("cvfk", cufc(int ), (int)224));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1554503697: {
                            break block41;
                        }
                        case -957180340: {
                            v9 = aa.cueq("cvfl", cufc(int ), (int)225);
                            continue block41;
                        }
                        case 337245217: {
                            v9 = aa.cueq("cvfm", cufc(int ), (int)226);
                            continue block41;
                        }
                    }
                    break;
                }
                this.autoSaver.shutdown();
                if (var1_3 || var1_3) ** GOTO lbl35
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = aa.gl - aa.cueq("cvfn", cufc(int ), (int)227)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == aa.cueq("cvfo", cuen(int ), (int)307)) break;
                    v10 /* !! */  = (long)aa.cueq("cvfp", cuen(int ), (int)308);
                }
                this.save();
                if (var1_3 || var1_3) ** GOTO lbl35
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = aa.gl - aa.cueq("cvfq", cufc(int ), (int)228)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == aa.cueq("cvfr", cuen(int ), (int)309)) break;
                    v11 /* !! */  = (long)aa.cueq("cvfs", cuen(int ), (int)310);
                }
                ai.success("AutoConfiguration: Shutdown complete!");
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvft", cuen(int ), (int)311);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cvfu", cuen(int ), (int)312);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl108:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cvfv", cuen(int ), (int)313);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl113:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)aa.cueq("cvfw", cuen(int ), (int)314);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 4: {
                var2_2 /* !! */  = (int)aa.cueq("cvfx", cuen(int ), (int)315);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvfy", cuen(int ), (int)316);
                } while (!var3_1);
                throw null;
            }
lbl127:
            // 3 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvfz", cuen(int ), (int)317);
                } while (!var3_1);
                throw null;
            }
lbl132:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)aa.cueq("cvga", cuen(int ), (int)318);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)aa.cueq("cvgb", cuen(int ), (int)319);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
lbl140:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvgc", cuen(int ), (int)320);
                    if (!var3_1) ** GOTO lbl127
                    throw null;
                }
            }
            case 10: {
                var2_2 /* !! */  = (int)aa.cueq("cvgd", cuen(int ), (int)321);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)aa.cueq("cvge", cuen(int ), (int)322);
                if (!var3_1) break;
                throw null;
            }
lbl153:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)aa.cueq("cvgf", cuen(int ), (int)323);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)aa.cueq("cvgg", cuen(int ), (int)324);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvgh", cuen(int ), (int)325);
        ** while (!var3_1)
lbl164:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$registerShutdownHook$0() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cvpx", cufc(int ), (int)337));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2131546774: {
                    v1 = aa.cueq("cvpy", cufc(int ), (int)338);
                    continue block21;
                }
                case -1554503697: {
                    break block21;
                }
                case 651851689: {
                    v1 = aa.cueq("cvpz", cufc(int ), (int)339);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = aa.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvqa", cufc(int ), (int)340)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == aa.cueq("cvqb", cuen(int ), (int)467)) break;
            v2 /* !! */  = (long)aa.cueq("cvqc", cuen(int ), (int)468);
        }
        var2_2 /* !! */  = aa.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvqd", cufc(int ), (int)341)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == aa.cueq("cvqe", cuen(int ), (int)469)) break;
                    v3 /* !! */  = (long)aa.cueq("cvqf", cuen(int ), (int)470);
                }
                var1_3 = aa.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 3 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvqg", cufc(int ), (int)342)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == aa.cueq("cvqh", cuen(int ), (int)471)) break;
                    v4 /* !! */  = (long)aa.cueq("cvqi", cuen(int ), (int)472);
                }
                ai.info("AutoConfiguration: Shutdown detected, saving...");
                if (var1_3 || var1_3) ** GOTO lbl32
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl46
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - aa.cueq("cvqj", cufc(int ), (int)343));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1692272449: {
                            v6 = aa.cueq("cvqk", cufc(int ), (int)344);
                            continue block26;
                        }
                        case -1554503697: {
                            break block26;
                        }
                        case -1320139626: {
                            v6 = aa.cueq("cvql", cufc(int ), (int)345);
                            continue block26;
                        }
                        case -586404491: {
                            v6 = aa.cueq("cvqm", cufc(int ), (int)346);
                            continue block26;
                        }
                    }
                    break;
                }
                this.shutdown();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl61:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvqn", cuen(int ), (int)473);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl66:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvqo", cuen(int ), (int)474);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cvqp", cuen(int ), (int)475);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)aa.cueq("cvqq", cuen(int ), (int)476);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl79:
            // 3 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvqr", cuen(int ), (int)477);
                } while (!var3_1);
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvqs", cuen(int ), (int)478);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)aa.cueq("cvqt", cuen(int ), (int)479);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvqu", cuen(int ), (int)480);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$listNamedConfigs$4(String var0) {
        block35: {
            v0 /* !! */  = aa.gl;
            if (true) ** GOTO lbl5
            block19: while (true) {
                v0 /* !! */  = (long)(v1 - aa.cueq("cvne", cufc(int ), (int)307));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1554503697: {
                        break block19;
                    }
                    case -749951603: {
                        v1 = aa.cueq("cvnf", cufc(int ), (int)308);
                        continue block19;
                    }
                    case 1696622599: {
                        v1 = aa.cueq("cvng", cufc(int ), (int)309);
                        continue block19;
                    }
                }
                break;
            }
            var3_1 = aa.c;
            v2 /* !! */  = aa.gl;
            if (true) ** GOTO lbl19
            block20: while (true) {
                v2 /* !! */  = (long)(aa.cueq("cvni", cufc(int ), (int)311) - aa.cueq("cvnh", cufc(int ), (int)310));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1554503697: {
                        break block20;
                    }
                    case 1492756929: {
                        continue block20;
                    }
                }
                break;
            }
            var2_2 /* !! */  = aa.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvnj", cufc(int ), (int)312)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == aa.cueq("cvnk", cuen(int ), (int)426)) break;
                v3 /* !! */  = (long)aa.cueq("cvnl", cuen(int ), (int)427);
            }
            var1_3 = aa.a;
            if (var3_1) {
                throw null;
lbl34:
                // 3 sources

                return (boolean)aa.cueq("cvnm", cuen(int ), (int)428);
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvnn", cufc(int ), (int)313)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == aa.cueq("cvno", cuen(int ), (int)429)) break;
                v4 /* !! */  = (long)aa.cueq("cvnp", cuen(int ), (int)430);
            }
            if (var0.equals("autoconfig.file")) break block35;
            if (var1_3) ** GOTO lbl34
            v5 = aa.cueq("cvnq", cuen(int ), (int)431);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl56
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v5 = aa.cueq("cvnr", cuen(int ), (int)432);
lbl56:
                // 2 sources

                return (boolean)v5;
            }
            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvns", cuen(int ), (int)433);
                if (var3_1) {
                    throw null;
                }
            }
lbl61:
            // 5 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvnt", cuen(int ), (int)434);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cvnu", cuen(int ), (int)435);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 3: {
                var2_2 /* !! */  = (int)aa.cueq("cvnv", cuen(int ), (int)436);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl75:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)aa.cueq("cvnw", cuen(int ), (int)437);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvnx", cuen(int ), (int)438);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)aa.cueq("cvny", cuen(int ), (int)439);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvnz", cuen(int ), (int)440);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public boolean resetToDefaults() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 58[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public List<String> listNamedConfigs() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSaving() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cvkz", cufc(int ), (int)285));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2124988699: {
                    v1 = aa.cueq("cvla", cufc(int ), (int)286);
                    continue block15;
                }
                case -1554503697: {
                    break block15;
                }
                case -471083790: {
                    v1 = aa.cueq("cvlb", cufc(int ), (int)287);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = aa.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvlc", cufc(int ), (int)288)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == aa.cueq("cvld", cuen(int ), (int)391)) break;
            v2 /* !! */  = (long)aa.cueq("cvle", cuen(int ), (int)392);
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvlf", cufc(int ), (int)289)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == aa.cueq("cvlg", cuen(int ), (int)393)) break;
            v3 /* !! */  = (long)aa.cueq("cvlh", cuen(int ), (int)394);
        }
        var1_3 = aa.a;
        if (var3_1) {
            throw null;
            return (boolean)aa.cueq("cvli", cuen(int ), (int)395);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvlj", cufc(int ), (int)290)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == aa.cueq("cvlk", cuen(int ), (int)396)) break;
                    v4 /* !! */  = (long)aa.cueq("cvll", cuen(int ), (int)397);
                }
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl47
                block20: while (true) {
                    v5 /* !! */  = (long)(aa.cueq("cvln", cufc(int ), (int)292) - aa.cueq("cvlm", cufc(int ), (int)291));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1554503697: {
                            break block20;
                        }
                        case 1204900857: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.saving.get();
            }
            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvlo", cuen(int ), (int)398);
                if (!var3_1) break;
                throw null;
            }
lbl57:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cvlp", cuen(int ), (int)399);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvlq", cuen(int ), (int)400);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvlr", cuen(int ), (int)401);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void init() {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block89: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cufx", cufc(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block89;
                }
                case -1331612453: {
                    v1 = aa.cueq("cufy", cufc(int ), (int)13);
                    continue block89;
                }
                case 324945161: {
                    v1 = aa.cueq("cufz", cufc(int ), (int)14);
                    continue block89;
                }
            }
            break;
        }
        var3_1 = aa.c;
        v2 /* !! */  = aa.gl;
        if (true) ** GOTO lbl19
        block90: while (true) {
            v2 /* !! */  = (long)(aa.cueq("cugb", cufc(int ), (int)16) - aa.cueq("cuga", cufc(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1554503697: {
                    break block90;
                }
                case 244389703: {
                    continue block90;
                }
            }
            break;
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cugc", cufc(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == aa.cueq("cugd", cuen(int ), (int)17)) break;
            v3 /* !! */  = (long)aa.cueq("cuge", cuen(int ), (int)18);
        }
        var1_3 = aa.a;
        if (var3_1) {
            throw null;
lbl33:
            // 11 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v4 /* !! */  = aa.gl;
        if (true) ** GOTO lbl40
        block93: while (true) {
            v4 /* !! */  = (long)(v5 - aa.cueq("cugf", cufc(int ), (int)18));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2098796917: {
                    v5 = aa.cueq("cugg", cufc(int ), (int)19);
                    continue block93;
                }
                case -1701138146: {
                    v5 = aa.cueq("cugh", cufc(int ), (int)20);
                    continue block93;
                }
                case -1554503697: {
                    break block93;
                }
                case 1562244495: {
                    v5 = aa.cueq("cugi", cufc(int ), (int)21);
                    continue block93;
                }
            }
            break;
        }
        v6 = aa.cueq("cugj", cuen(int ), (int)19);
        v7 = aa.cueq("cugk", cuen(int ), (int)20);
        v8 /* !! */  = aa.gl;
        if (true) ** GOTO lbl58
        block94: while (true) {
            v8 /* !! */  = (long)(v9 - aa.cueq("cugl", cufc(int ), (int)22));
lbl58:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1554503697: {
                    break block94;
                }
                case -939483588: {
                    v9 = aa.cueq("cugm", cufc(int ), (int)23);
                    continue block94;
                }
                case 1364668016: {
                    v9 = aa.cueq("cugn", cufc(int ), (int)24);
                    continue block94;
                }
                case 1367057639: {
                    v9 = aa.cueq("cugo", cufc(int ), (int)25);
                    continue block94;
                }
            }
            break;
        }
        if (!this.initialized.compareAndSet((boolean)v6, (boolean)v7)) ** GOTO lbl224
        if (var1_3 || var1_3) ** GOTO lbl33
        v10 /* !! */  = aa.gl;
        if (true) ** GOTO lbl76
        block95: while (true) {
            v10 /* !! */  = (long)(v11 - aa.cueq("cugp", cufc(int ), (int)26));
lbl76:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1554503697: {
                    break block95;
                }
                case -913721800: {
                    v11 = aa.cueq("cugq", cufc(int ), (int)27);
                    continue block95;
                }
                case 557599530: {
                    v11 = aa.cueq("cugr", cufc(int ), (int)28);
                    continue block95;
                }
            }
            break;
        }
        ac.init();
        if (var1_3 || var1_3) ** GOTO lbl33
        v12 /* !! */  = aa.gl;
        if (true) ** GOTO lbl91
        block96: while (true) {
            v12 /* !! */  = (long)(v13 - aa.cueq("cugs", cufc(int ), (int)29));
lbl91:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1554503697: {
                    break block96;
                }
                case 41520903: {
                    v13 = aa.cueq("cugt", cufc(int ), (int)30);
                    continue block96;
                }
                case 198562373: {
                    v13 = aa.cueq("cugu", cufc(int ), (int)31);
                    continue block96;
                }
                case 1914990085: {
                    v13 = aa.cueq("cugv", cufc(int ), (int)32);
                    continue block96;
                }
            }
            break;
        }
        v14 /* !! */  = aa.gl;
        if (true) ** GOTO lbl107
        block97: while (true) {
            v14 /* !! */  = (long)(v15 - aa.cueq("cugw", cufc(int ), (int)33));
lbl107:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1554503697: {
                    break block97;
                }
                case -886839881: {
                    v15 = aa.cueq("cugx", cufc(int ), (int)34);
                    continue block97;
                }
                case -231209976: {
                    v15 = aa.cueq("cugy", cufc(int ), (int)35);
                    continue block97;
                }
                case 1774353892: {
                    v15 = aa.cueq("cugz", cufc(int ), (int)36);
                    continue block97;
                }
            }
            break;
        }
        this.fileHandler.createDirectories();
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cuha", cufc(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == aa.cueq("cuhb", cuen(int ), (int)21)) break;
            v16 /* !! */  = (long)aa.cueq("cuhc", cuen(int ), (int)22);
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cuhd", cufc(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == aa.cueq("cuhe", cuen(int ), (int)23)) break;
            v17 /* !! */  = (long)aa.cueq("cuhf", cuen(int ), (int)24);
        }
        v18 = this.serializer.serialize();
        v19 /* !! */  = aa.gl;
        if (true) ** GOTO lbl136
        block100: while (true) {
            v19 /* !! */  = (long)(v20 - aa.cueq("cuhg", cufc(int ), (int)39));
lbl136:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1554503697: {
                    break block100;
                }
                case -1022490276: {
                    v20 = aa.cueq("cuhh", cufc(int ), (int)40);
                    continue block100;
                }
                case 225816954: {
                    v20 = aa.cueq("cuhi", cufc(int ), (int)41);
                    continue block100;
                }
                case 827311323: {
                    v20 = aa.cueq("cuhj", cufc(int ), (int)42);
                    continue block100;
                }
            }
            break;
        }
        this.defaultConfig = v18;
        if (var1_3 || var1_3) ** GOTO lbl33
        v21 /* !! */  = aa.gl;
        if (true) ** GOTO lbl154
        block101: while (true) {
            v21 /* !! */  = (long)(v22 - aa.cueq("cuhk", cufc(int ), (int)43));
lbl154:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1554503697: {
                    break block101;
                }
                case -523304587: {
                    v22 = aa.cueq("cuhl", cufc(int ), (int)44);
                    continue block101;
                }
                case 1158534113: {
                    v22 = aa.cueq("cuhm", cufc(int ), (int)45);
                    continue block101;
                }
                case 1397022896: {
                    v22 = aa.cueq("cuhn", cufc(int ), (int)46);
                    continue block101;
                }
            }
            break;
        }
        this.load();
        if (var1_3 || var1_3) ** GOTO lbl33
        v23 /* !! */  = aa.gl;
        if (true) ** GOTO lbl172
        block102: while (true) {
            v23 /* !! */  = (long)(v24 - aa.cueq("cuho", cufc(int ), (int)47));
lbl172:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -2121718602: {
                    v24 = aa.cueq("cuhp", cufc(int ), (int)48);
                    continue block102;
                }
                case -1591090137: {
                    v24 = aa.cueq("cuhq", cufc(int ), (int)49);
                    continue block102;
                }
                case -1554503697: {
                    break block102;
                }
                case 298546035: {
                    v24 = aa.cueq("cuhr", cufc(int ), (int)50);
                    continue block102;
                }
            }
            break;
        }
        v25 /* !! */  = aa.gl;
        if (true) ** GOTO lbl188
        block103: while (true) {
            v25 /* !! */  = (long)(v26 - aa.cueq("cuhs", cufc(int ), (int)51));
lbl188:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1727437689: {
                    v26 = aa.cueq("cuht", cufc(int ), (int)52);
                    continue block103;
                }
                case -1554503697: {
                    break block103;
                }
                case -1336344864: {
                    v26 = aa.cueq("cuhu", cufc(int ), (int)53);
                    continue block103;
                }
                case 441854044: {
                    v26 = aa.cueq("cuhv", cufc(int ), (int)54);
                    continue block103;
                }
            }
            break;
        }
        this.autoSaver.start();
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                v27 /* !! */  = aa.gl;
                if (true) ** GOTO lbl210
                block104: while (true) {
                    v27 /* !! */  = (long)(aa.cueq("cuhx", cufc(int ), (int)56) - aa.cueq("cuhw", cufc(int ), (int)55));
lbl210:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1861379551: {
                            continue block104;
                        }
                        case -1554503697: {
                            break block104;
                        }
                    }
                    break;
                }
                this.registerShutdownHook();
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_3 = aa.gl - aa.cueq("cuhy", cufc(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == aa.cueq("cuhz", cuen(int ), (int)25)) break;
                    v28 /* !! */  = (long)aa.cueq("cuia", cuen(int ), (int)26);
                }
                ai.success("AutoConfiguration: System initialized!");
                if (var1_3) ** GOTO lbl33
lbl224:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl227:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cuib", cuen(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl232:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cuic", cuen(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl237:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cuid", cuen(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 3: {
                var2_2 /* !! */  = (int)aa.cueq("cuie", cuen(int ), (int)30);
                if (!var3_1) ** GOTO lbl227
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)aa.cueq("cuif", cuen(int ), (int)31);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
lbl250:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cuig", cuen(int ), (int)32);
                    if (!var3_1) ** GOTO lbl227
                    throw null;
                }
            }
lbl255:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)aa.cueq("cuih", cuen(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl260:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)aa.cueq("cuii", cuen(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl265:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)aa.cueq("cuij", cuen(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl270:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)aa.cueq("cuik", cuen(int ), (int)36);
                if (!var3_1) ** GOTO lbl227
                throw null;
            }
lbl274:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)aa.cueq("cuil", cuen(int ), (int)37);
                if (!var3_1) ** GOTO lbl250
                throw null;
            }
lbl278:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)aa.cueq("cuim", cuen(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 12: {
                var2_2 /* !! */  = (int)aa.cueq("cuin", cuen(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 13: {
                var2_2 /* !! */  = (int)aa.cueq("cuio", cuen(int ), (int)40);
                if (!var3_1) ** GOTO lbl270
                throw null;
            }
            case 14: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cuip", cuen(int ), (int)41);
                } while (!var3_1);
                throw null;
            }
lbl297:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)aa.cueq("cuiq", cuen(int ), (int)42);
                if (!var3_1) ** GOTO lbl237
                throw null;
            }
lbl301:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)aa.cueq("cuir", cuen(int ), (int)43);
                if (!var3_1) ** GOTO lbl255
                throw null;
            }
lbl305:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)aa.cueq("cuis", cuen(int ), (int)44);
                if (!var3_1) ** GOTO lbl301
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)aa.cueq("cuit", cuen(int ), (int)45);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)aa.cueq("cuiu", cuen(int ), (int)46);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 20: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cuiv", cuen(int ), (int)47);
        ** while (!var3_1)
lbl320:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cvri() {
        aa.cufd[300] = -8447993328789860021L;
        aa.cufd[301] = 2302589946855951870L;
        aa.cufd[302] = 4806847301920595841L;
        aa.cufd[303] = -3169177417026414624L;
        aa.cufd[304] = 8438115533203743462L;
        aa.cufd[305] = 2491537749077006719L;
        aa.cufd[306] = 1521669129936763365L;
        aa.cufd[307] = -7553343231584241853L;
        aa.cufd[308] = -839136618955750078L;
        aa.cufd[309] = 77408159767831272L;
        aa.cufd[310] = -7598176966858263503L;
        aa.cufd[311] = -4345361488578561703L;
        aa.cufd[312] = -1747104373983908933L;
        aa.cufd[313] = 3303191814880071089L;
        aa.cufd[314] = -5897078747090700403L;
        aa.cufd[315] = 83206634055561848L;
        aa.cufd[316] = 2631686631304888953L;
        aa.cufd[317] = -7003187003414835046L;
        aa.cufd[318] = -3199231524448708560L;
        aa.cufd[319] = 6753310214176202921L;
        aa.cufd[320] = -3404056563268066782L;
        aa.cufd[321] = 4495556911730035450L;
        aa.cufd[322] = -8810620001299440636L;
        aa.cufd[323] = -4724815808426640357L;
        aa.cufd[324] = -2637252338243285770L;
        aa.cufd[325] = 5601647295638464435L;
        aa.cufd[326] = -1279646725919135935L;
        aa.cufd[327] = 1516230980157328134L;
        aa.cufd[328] = -3561387027296989823L;
        aa.cufd[329] = -275791114866078453L;
        aa.cufd[330] = 5391614814870186505L;
        aa.cufd[331] = 8170503102689757990L;
        aa.cufd[332] = 4451505275395054059L;
        aa.cufd[333] = -187054323805952650L;
        aa.cufd[334] = -9108487543410585992L;
        aa.cufd[335] = 3394657955806851403L;
        aa.cufd[336] = -4381262267283405706L;
        aa.cufd[337] = 8517386251048597243L;
        aa.cufd[338] = -2760422625345401177L;
        aa.cufd[339] = -5326983365536855296L;
        aa.cufd[340] = 5422731947955450146L;
        aa.cufd[341] = -4388042003548053483L;
        aa.cufd[342] = 4586758547734274683L;
        aa.cufd[343] = -1281057244062348834L;
        aa.cufd[344] = 9029302574921682318L;
        aa.cufd[345] = 1153575271316196781L;
        aa.cufd[346] = -88431867098060513L;
    }

    public static /* synthetic */ CallSite cueq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long cufc(int n2) {
        return cufd[n2] ^ cufe[n2];
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 74[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reload() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvgi", cufc(int ), (int)229)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == aa.cueq("cvgj", cuen(int ), (int)326)) break;
            v0 /* !! */  = (long)aa.cueq("cvgk", cuen(int ), (int)327);
        }
        var3_1 = aa.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvgl", cufc(int ), (int)230)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == aa.cueq("cvgm", cuen(int ), (int)328)) break;
            v1 /* !! */  = (long)aa.cueq("cvgn", cuen(int ), (int)329);
        }
        var2_2 /* !! */  = aa.b;
        v2 /* !! */  = aa.gl;
        if (true) ** GOTO lbl17
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - aa.cueq("cvgo", cufc(int ), (int)231));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1559433963: {
                    v3 = aa.cueq("cvgp", cufc(int ), (int)232);
                    continue block24;
                }
                case -1554503697: {
                    break block24;
                }
                case -1156895009: {
                    v3 = aa.cueq("cvgq", cufc(int ), (int)233);
                    continue block24;
                }
                case 277483756: {
                    v3 = aa.cueq("cvgr", cufc(int ), (int)234);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = aa.a;
        if (var3_1) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = aa.gl - aa.cueq("cvgs", cufc(int ), (int)235)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == aa.cueq("cvgt", cuen(int ), (int)330)) break;
                    v4 /* !! */  = (long)aa.cueq("cvgu", cuen(int ), (int)331);
                }
                this.load();
                if (var1_3 || var1_3) ** GOTO lbl32
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl50
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - aa.cueq("cvgv", cufc(int ), (int)236));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1949354184: {
                            v6 = aa.cueq("cvgw", cufc(int ), (int)237);
                            continue block27;
                        }
                        case -1702491309: {
                            v6 = aa.cueq("cvgx", cufc(int ), (int)238);
                            continue block27;
                        }
                        case -1554503697: {
                            break block27;
                        }
                        case -1321994740: {
                            v6 = aa.cueq("cvgy", cufc(int ), (int)239);
                            continue block27;
                        }
                    }
                    break;
                }
                ai.success("AutoConfiguration: Config reloaded!");
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl66:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)aa.cueq("cvgz", cuen(int ), (int)332);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 1: {
                var2_2 /* !! */  = (int)aa.cueq("cvha", cuen(int ), (int)333);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 2: {
                var2_2 /* !! */  = (int)aa.cueq("cvhb", cuen(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl81:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)aa.cueq("cvhc", cuen(int ), (int)335);
                } while (!var3_1);
                throw null;
            }
lbl86:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)aa.cueq("cvhd", cuen(int ), (int)336);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)aa.cueq("cvhe", cuen(int ), (int)337);
                if (!var3_1) break;
                throw null;
            }
lbl95:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)aa.cueq("cvhf", cuen(int ), (int)338);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)aa.cueq("cvhg", cuen(int ), (int)339);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public boolean loadNamed(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 36[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void cvrl() {
        aa.cufe[200] = -1220493489623265344L;
        aa.cufe[201] = 6230119219737416271L;
        aa.cufe[202] = 1566300527628837982L;
        aa.cufe[203] = 2313483220811155025L;
        aa.cufe[204] = -1878982130829685893L;
        aa.cufe[205] = 8866769741792431553L;
        aa.cufe[206] = 3749462490212853232L;
        aa.cufe[207] = -2874372340448605378L;
        aa.cufe[208] = -3709496319031316846L;
        aa.cufe[209] = 2378842635054570909L;
        aa.cufe[210] = -6416132011532363724L;
        aa.cufe[211] = 3557985987270306228L;
        aa.cufe[212] = -5896744402650603901L;
        aa.cufe[213] = -788058306306463100L;
        aa.cufe[214] = 6845737802443728200L;
        aa.cufe[215] = -3716652315641889112L;
        aa.cufe[216] = 4290468807211091421L;
        aa.cufe[217] = 4757612742091382287L;
        aa.cufe[218] = 1124157906923838939L;
        aa.cufe[219] = 3395703832801899736L;
        aa.cufe[220] = 1981497962943787810L;
        aa.cufe[221] = 5882676332539243507L;
        aa.cufe[222] = -5305847311447540580L;
        aa.cufe[223] = -1382085256287766515L;
        aa.cufe[224] = 1231271743802711991L;
        aa.cufe[225] = 146566170127970669L;
        aa.cufe[226] = 7312360152504249103L;
        aa.cufe[227] = 2213156377070165441L;
        aa.cufe[228] = -2705885897063578702L;
        aa.cufe[229] = -292861407771769364L;
        aa.cufe[230] = 6472402808310757049L;
        aa.cufe[231] = 4749964412839767901L;
        aa.cufe[232] = 4751705910176644292L;
        aa.cufe[233] = 1752833153747061158L;
        aa.cufe[234] = -6743911265962768200L;
        aa.cufe[235] = -8652813253822622755L;
        aa.cufe[236] = 6397336019888715304L;
        aa.cufe[237] = 6564384402696302530L;
        aa.cufe[238] = 5727766448887384623L;
        aa.cufe[239] = -1609198496362569964L;
        aa.cufe[240] = 2256666485491275614L;
        aa.cufe[241] = 3933458499194870407L;
        aa.cufe[242] = 1238679941384806552L;
        aa.cufe[243] = 8007878233533851461L;
        aa.cufe[244] = -254181635321253065L;
        aa.cufe[245] = 6007997601698277060L;
        aa.cufe[246] = 2863237157570063130L;
        aa.cufe[247] = 3752333580780365866L;
        aa.cufe[248] = -6169628330985238652L;
        aa.cufe[249] = 8040783799285372214L;
        aa.cufe[250] = 7005288307854646486L;
        aa.cufe[251] = 2253694686248594545L;
        aa.cufe[252] = -5613875672933644998L;
        aa.cufe[253] = -7192340066705503073L;
        aa.cufe[254] = 7771934013558881670L;
        aa.cufe[255] = -4423084979981827421L;
        aa.cufe[256] = 7345495707126381187L;
        aa.cufe[257] = -4893328390786118305L;
        aa.cufe[258] = -2408428390685024094L;
        aa.cufe[259] = -3910578075449876258L;
        aa.cufe[260] = -4541599747928158451L;
        aa.cufe[261] = 3599608825717124459L;
        aa.cufe[262] = -5327470901072531844L;
        aa.cufe[263] = -5785007634781222598L;
        aa.cufe[264] = -8820275003708119112L;
        aa.cufe[265] = -806125151163920577L;
        aa.cufe[266] = 7085194145162932229L;
        aa.cufe[267] = 1004940829815597472L;
        aa.cufe[268] = 5833063174397067875L;
        aa.cufe[269] = 4383802509598928942L;
        aa.cufe[270] = -2708594196882569753L;
        aa.cufe[271] = 7692119750124679417L;
        aa.cufe[272] = -437414525960035200L;
        aa.cufe[273] = 6315320010778029077L;
        aa.cufe[274] = -2651316475750725728L;
        aa.cufe[275] = 2170324452670603266L;
        aa.cufe[276] = -2508514648460502922L;
        aa.cufe[277] = -1975345094492752647L;
        aa.cufe[278] = 501145373023596832L;
        aa.cufe[279] = 4656783648826486901L;
        aa.cufe[280] = -1787600058777721112L;
        aa.cufe[281] = 2930543053956812624L;
        aa.cufe[282] = -4357804568103164859L;
        aa.cufe[283] = 6105433442699613003L;
        aa.cufe[284] = -1129262393991396878L;
        aa.cufe[285] = 9141263094081276810L;
        aa.cufe[286] = 5877074333136262169L;
        aa.cufe[287] = -2782335853789952992L;
        aa.cufe[288] = -3372988644371214745L;
        aa.cufe[289] = -8395845385344232390L;
        aa.cufe[290] = -6555785333307968859L;
        aa.cufe[291] = 4065973025962035810L;
        aa.cufe[292] = -1895053590295952838L;
        aa.cufe[293] = -554739442440327604L;
        aa.cufe[294] = -2086819784375032218L;
        aa.cufe[295] = 3904743333023317501L;
        aa.cufe[296] = 3963243931209180293L;
        aa.cufe[297] = -78111966230409410L;
        aa.cufe[298] = -897160335031764582L;
        aa.cufe[299] = -1592289873814124804L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$listNamedConfigs$1(Path var0) {
        v0 /* !! */  = aa.gl;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - aa.cueq("cvph", cufc(int ), (int)330));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1554503697: {
                    break block15;
                }
                case -784556669: {
                    v1 = aa.cueq("cvpi", cufc(int ), (int)331);
                    continue block15;
                }
                case 100043300: {
                    v1 = aa.cueq("cvpj", cufc(int ), (int)332);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = aa.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = aa.gl - aa.cueq("cvpk", cufc(int ), (int)333)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == aa.cueq("cvpl", cuen(int ), (int)458)) break;
            v2 /* !! */  = (long)aa.cueq("cvpm", cuen(int ), (int)459);
        }
        var2_2 /* !! */  = aa.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = aa.gl - aa.cueq("cvpn", cufc(int ), (int)334)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == aa.cueq("cvpo", cuen(int ), (int)460)) break;
            v3 /* !! */  = (long)aa.cueq("cvpp", cuen(int ), (int)461);
        }
        var1_3 = aa.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)aa.cueq("cvpq", cuen(int ), (int)462);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                v4 = new LinkOption[]{};
                v5 /* !! */  = aa.gl;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v5 /* !! */  = (long)(aa.cueq("cvps", cufc(int ), (int)336) - aa.cueq("cvpr", cufc(int ), (int)335));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1554503697: {
                            break block19;
                        }
                        case -860164132: {
                            continue block19;
                        }
                    }
                    break;
                }
                return Files.isRegularFile(var0, v4);
lbl47:
                // 3 sources

                case 0: {
                    var2_2 /* !! */  = (int)aa.cueq("cvpt", cuen(int ), (int)463);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)aa.cueq("cvpu", cuen(int ), (int)464);
                        if (!var3_1) ** GOTO lbl47
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)aa.cueq("cvpv", cuen(int ), (int)465);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)aa.cueq("cvpw", cuen(int ), (int)466);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cvrh() {
        aa.cufd[200] = 2657761027296356235L;
        aa.cufd[201] = -4324618448863878082L;
        aa.cufd[202] = -5818140176614522350L;
        aa.cufd[203] = -6574219936962206538L;
        aa.cufd[204] = -7389402610558068914L;
        aa.cufd[205] = 9200729913101840837L;
        aa.cufd[206] = -1416328917238635432L;
        aa.cufd[207] = 7735998290189053634L;
        aa.cufd[208] = -3069332504973590407L;
        aa.cufd[209] = 7623219051724067027L;
        aa.cufd[210] = -3846769096973464384L;
        aa.cufd[211] = 3332951326819180611L;
        aa.cufd[212] = 270328081415493120L;
        aa.cufd[213] = -9181187007650070420L;
        aa.cufd[214] = -719881042984981508L;
        aa.cufd[215] = -3300529156987636994L;
        aa.cufd[216] = -3888314854111617362L;
        aa.cufd[217] = -2455876600645356518L;
        aa.cufd[218] = -5765324136648653961L;
        aa.cufd[219] = -4933879715076157088L;
        aa.cufd[220] = -1538931924762107332L;
        aa.cufd[221] = 5744332804927358653L;
        aa.cufd[222] = 3168682494746355723L;
        aa.cufd[223] = -6018951596811548583L;
        aa.cufd[224] = -3915560096017223771L;
        aa.cufd[225] = -8929637248575659686L;
        aa.cufd[226] = 292363437862363112L;
        aa.cufd[227] = 7524246228873337290L;
        aa.cufd[228] = 6829339769232556228L;
        aa.cufd[229] = 8030101316548823164L;
        aa.cufd[230] = -850422921363683748L;
        aa.cufd[231] = 2139832790450949590L;
        aa.cufd[232] = 6634196484109680589L;
        aa.cufd[233] = -7403740409486304654L;
        aa.cufd[234] = 3171729004718629058L;
        aa.cufd[235] = 6671104732467013088L;
        aa.cufd[236] = 614842433234517383L;
        aa.cufd[237] = -8018301197155125674L;
        aa.cufd[238] = -9126674221849548677L;
        aa.cufd[239] = -2943877512517395002L;
        aa.cufd[240] = 2015202381838952021L;
        aa.cufd[241] = -5088141137119215733L;
        aa.cufd[242] = 7390230383254896161L;
        aa.cufd[243] = -5696653771125264840L;
        aa.cufd[244] = 6988770118649965297L;
        aa.cufd[245] = 7448071834164353577L;
        aa.cufd[246] = -6263514453707202780L;
        aa.cufd[247] = -1666672383995197999L;
        aa.cufd[248] = -3233859559800367170L;
        aa.cufd[249] = -6482586523332670441L;
        aa.cufd[250] = -8562192249364311194L;
        aa.cufd[251] = -6514500379791947879L;
        aa.cufd[252] = -2352300039740633905L;
        aa.cufd[253] = -5397463784730419128L;
        aa.cufd[254] = 8486752238724888974L;
        aa.cufd[255] = 1760096219573014236L;
        aa.cufd[256] = -6355015997859801672L;
        aa.cufd[257] = 2148783540650998238L;
        aa.cufd[258] = 805887528379036026L;
        aa.cufd[259] = -2345167927701136258L;
        aa.cufd[260] = 213452567611275370L;
        aa.cufd[261] = -4064294766323121496L;
        aa.cufd[262] = -1891799960791366206L;
        aa.cufd[263] = 3290855656708363273L;
        aa.cufd[264] = 2117575234688222044L;
        aa.cufd[265] = -5823170309117616696L;
        aa.cufd[266] = -4685409082833797954L;
        aa.cufd[267] = -6768092871145093939L;
        aa.cufd[268] = -1578329103059097149L;
        aa.cufd[269] = -1969726730047773038L;
        aa.cufd[270] = 8442829972565707145L;
        aa.cufd[271] = 2767893425832010260L;
        aa.cufd[272] = 8420854069947028996L;
        aa.cufd[273] = -2250496211320167446L;
        aa.cufd[274] = 20804840989137770L;
        aa.cufd[275] = -1032360390546204695L;
        aa.cufd[276] = 1920505019860249510L;
        aa.cufd[277] = 7883141208419483558L;
        aa.cufd[278] = 3917348474845176466L;
        aa.cufd[279] = -1273929457409989208L;
        aa.cufd[280] = -8564728714393821873L;
        aa.cufd[281] = -4532539924897519829L;
        aa.cufd[282] = -6386375199393818840L;
        aa.cufd[283] = 8199921229926862960L;
        aa.cufd[284] = 4101599491653525813L;
        aa.cufd[285] = 1061674697517405516L;
        aa.cufd[286] = 4363575443027864047L;
        aa.cufd[287] = 2020785578549872760L;
        aa.cufd[288] = -8332957437943709428L;
        aa.cufd[289] = 7989982979403781418L;
        aa.cufd[290] = -6455923313691172724L;
        aa.cufd[291] = -1644152817127044541L;
        aa.cufd[292] = 2646062967566441168L;
        aa.cufd[293] = 726153416962431990L;
        aa.cufd[294] = -2884178509488145125L;
        aa.cufd[295] = 5146542588840314522L;
        aa.cufd[296] = 5483649799962987284L;
        aa.cufd[297] = 2603785104837074991L;
        aa.cufd[298] = -6485617638977651065L;
        aa.cufd[299] = -3061714830577245142L;
    }

    private static /* synthetic */ void cvrd() {
        aa.cuep[300] = -1254050551;
        aa.cuep[301] = 997427927;
        aa.cuep[302] = 645059909;
        aa.cuep[303] = -1911237297;
        aa.cuep[304] = 16974738;
        aa.cuep[305] = 1973235338;
        aa.cuep[306] = 787591373;
        aa.cuep[307] = -1266463263;
        aa.cuep[308] = -1635866957;
        aa.cuep[309] = -1540818918;
        aa.cuep[310] = -651798630;
        aa.cuep[311] = -1459935002;
        aa.cuep[312] = 637493013;
        aa.cuep[313] = 336759495;
        aa.cuep[314] = -330343027;
        aa.cuep[315] = -2137583234;
        aa.cuep[316] = -1783069888;
        aa.cuep[317] = -1291109697;
        aa.cuep[318] = 1473136853;
        aa.cuep[319] = 425785965;
        aa.cuep[320] = 475679199;
        aa.cuep[321] = 1252345505;
        aa.cuep[322] = 1020221237;
        aa.cuep[323] = 923820159;
        aa.cuep[324] = 398400264;
        aa.cuep[325] = -1456971935;
        aa.cuep[326] = -604822900;
        aa.cuep[327] = -169896701;
        aa.cuep[328] = -348469617;
        aa.cuep[329] = 47369127;
        aa.cuep[330] = -555896099;
        aa.cuep[331] = -1843585921;
        aa.cuep[332] = -2025860080;
        aa.cuep[333] = -1525446398;
        aa.cuep[334] = 1527651333;
        aa.cuep[335] = -1913018761;
        aa.cuep[336] = -2104200762;
        aa.cuep[337] = -384421062;
        aa.cuep[338] = 2094075127;
        aa.cuep[339] = 2932772;
        aa.cuep[340] = 1696469202;
        aa.cuep[341] = 344894347;
        aa.cuep[342] = 1554235008;
        aa.cuep[343] = 36578171;
        aa.cuep[344] = -941929354;
        aa.cuep[345] = -270261046;
        aa.cuep[346] = 540232478;
        aa.cuep[347] = -1305748154;
        aa.cuep[348] = 1973793488;
        aa.cuep[349] = -1630682447;
        aa.cuep[350] = 2042990383;
        aa.cuep[351] = 1936410656;
        aa.cuep[352] = 718267036;
        aa.cuep[353] = 1054013016;
        aa.cuep[354] = 260820554;
        aa.cuep[355] = 307773311;
        aa.cuep[356] = 793803970;
        aa.cuep[357] = 1209885643;
        aa.cuep[358] = -694820782;
        aa.cuep[359] = -392851510;
        aa.cuep[360] = -1166695931;
        aa.cuep[361] = -413221097;
        aa.cuep[362] = -726900877;
        aa.cuep[363] = 63200610;
        aa.cuep[364] = -2112073075;
        aa.cuep[365] = -557484250;
        aa.cuep[366] = -1764400438;
        aa.cuep[367] = -1547699582;
        aa.cuep[368] = -1251846658;
        aa.cuep[369] = -1590808582;
        aa.cuep[370] = 1759922753;
        aa.cuep[371] = -1817117749;
        aa.cuep[372] = -765286363;
        aa.cuep[373] = -1714570907;
        aa.cuep[374] = 707379665;
        aa.cuep[375] = -1547944186;
        aa.cuep[376] = 1027930810;
        aa.cuep[377] = 80104852;
        aa.cuep[378] = -1804870374;
        aa.cuep[379] = -261476168;
        aa.cuep[380] = 1509265791;
        aa.cuep[381] = 207420082;
        aa.cuep[382] = -496343569;
        aa.cuep[383] = -260781742;
        aa.cuep[384] = 1636115830;
        aa.cuep[385] = -180259099;
        aa.cuep[386] = -395737275;
        aa.cuep[387] = 1952695108;
        aa.cuep[388] = 1334870006;
        aa.cuep[389] = -1804677217;
        aa.cuep[390] = -40477617;
        aa.cuep[391] = -2093983134;
        aa.cuep[392] = -1843088064;
        aa.cuep[393] = -1234334208;
        aa.cuep[394] = 1570929307;
        aa.cuep[395] = -34319985;
        aa.cuep[396] = -380350112;
        aa.cuep[397] = -292722623;
        aa.cuep[398] = 1832236530;
        aa.cuep[399] = -1786045316;
    }

    private static /* synthetic */ void cvrm() {
        aa.cufe[300] = -3212788745929738838L;
        aa.cufe[301] = -3316407277367583457L;
        aa.cufe[302] = -3648128507171557636L;
        aa.cufe[303] = -7735308295179893862L;
        aa.cufe[304] = -1009241922691584663L;
        aa.cufe[305] = 8769521140836122937L;
        aa.cufe[306] = 4055096861293517611L;
        aa.cufe[307] = 8460148336901166270L;
        aa.cufe[308] = -2085919938817458063L;
        aa.cufe[309] = 596307795853159103L;
        aa.cufe[310] = -9138062666775543282L;
        aa.cufe[311] = -4950942264837395000L;
        aa.cufe[312] = -3466651727089080000L;
        aa.cufe[313] = -8751603553711229610L;
        aa.cufe[314] = 7607939273353406388L;
        aa.cufe[315] = 220815450362475618L;
        aa.cufe[316] = -2141366478051897012L;
        aa.cufe[317] = 819122042148282458L;
        aa.cufe[318] = -5567567845799640993L;
        aa.cufe[319] = 4672502749916960240L;
        aa.cufe[320] = 2839610497824954788L;
        aa.cufe[321] = -1333433849014703976L;
        aa.cufe[322] = 8084633772015502174L;
        aa.cufe[323] = -8904258955266428391L;
        aa.cufe[324] = -3781942388972679842L;
        aa.cufe[325] = 5339754897359665352L;
        aa.cufe[326] = 1950525086959051806L;
        aa.cufe[327] = 1134018759445703321L;
        aa.cufe[328] = 7194703629301914734L;
        aa.cufe[329] = -4530828414877150433L;
        aa.cufe[330] = -7482293929591902168L;
        aa.cufe[331] = 844820774927015459L;
        aa.cufe[332] = -7594447317345776979L;
        aa.cufe[333] = 1931015879607461238L;
        aa.cufe[334] = -9210225439447572877L;
        aa.cufe[335] = -6457023059696971431L;
        aa.cufe[336] = 3177856949464789559L;
        aa.cufe[337] = 4049765316687211769L;
        aa.cufe[338] = 1009457856286104671L;
        aa.cufe[339] = -1195555945186212955L;
        aa.cufe[340] = 4849844959296267053L;
        aa.cufe[341] = 6032113659203023982L;
        aa.cufe[342] = 386996841300927330L;
        aa.cufe[343] = -870917159308627125L;
        aa.cufe[344] = -6610845071396461195L;
        aa.cufe[345] = 9132738227302435940L;
        aa.cufe[346] = 8442245835736879350L;
    }

    private static /* synthetic */ void cvrc() {
        aa.cuep[200] = 803241323;
        aa.cuep[201] = 385586890;
        aa.cuep[202] = -956752126;
        aa.cuep[203] = -2023225074;
        aa.cuep[204] = -206994584;
        aa.cuep[205] = -876059890;
        aa.cuep[206] = -1583826924;
        aa.cuep[207] = -533844762;
        aa.cuep[208] = 594585521;
        aa.cuep[209] = -192323783;
        aa.cuep[210] = -1553761019;
        aa.cuep[211] = 149692374;
        aa.cuep[212] = -1413315495;
        aa.cuep[213] = -156264981;
        aa.cuep[214] = 85017183;
        aa.cuep[215] = 443578522;
        aa.cuep[216] = 1298079004;
        aa.cuep[217] = -2071299478;
        aa.cuep[218] = 1760016971;
        aa.cuep[219] = 1750339092;
        aa.cuep[220] = -94263354;
        aa.cuep[221] = 893383731;
        aa.cuep[222] = -2006897623;
        aa.cuep[223] = 1791303607;
        aa.cuep[224] = -1435328225;
        aa.cuep[225] = -1503392561;
        aa.cuep[226] = -407106122;
        aa.cuep[227] = 211317290;
        aa.cuep[228] = 494481069;
        aa.cuep[229] = -1381795145;
        aa.cuep[230] = 1614381982;
        aa.cuep[231] = -1881471410;
        aa.cuep[232] = 1204003689;
        aa.cuep[233] = 992860659;
        aa.cuep[234] = 1701500757;
        aa.cuep[235] = 521780352;
        aa.cuep[236] = 82254774;
        aa.cuep[237] = -973583613;
        aa.cuep[238] = 713029158;
        aa.cuep[239] = -1268160485;
        aa.cuep[240] = 761816206;
        aa.cuep[241] = -2142200829;
        aa.cuep[242] = 1628851595;
        aa.cuep[243] = 652089152;
        aa.cuep[244] = -1649434114;
        aa.cuep[245] = 1075273737;
        aa.cuep[246] = -1826056001;
        aa.cuep[247] = -993488167;
        aa.cuep[248] = -1628739373;
        aa.cuep[249] = -92694319;
        aa.cuep[250] = 984970130;
        aa.cuep[251] = 1164498588;
        aa.cuep[252] = -323238277;
        aa.cuep[253] = -1118331758;
        aa.cuep[254] = 1716976721;
        aa.cuep[255] = -1144915525;
        aa.cuep[256] = 1711457207;
        aa.cuep[257] = -1796360714;
        aa.cuep[258] = -36024768;
        aa.cuep[259] = -1738277346;
        aa.cuep[260] = 708066024;
        aa.cuep[261] = 1467898588;
        aa.cuep[262] = -43663104;
        aa.cuep[263] = 394018126;
        aa.cuep[264] = -1401947665;
        aa.cuep[265] = 1614196467;
        aa.cuep[266] = -1826993260;
        aa.cuep[267] = -1216123401;
        aa.cuep[268] = 685524427;
        aa.cuep[269] = 596077862;
        aa.cuep[270] = -1016324371;
        aa.cuep[271] = 1283849012;
        aa.cuep[272] = 1399775483;
        aa.cuep[273] = -1465584496;
        aa.cuep[274] = 1966390436;
        aa.cuep[275] = -272302645;
        aa.cuep[276] = 1922740814;
        aa.cuep[277] = -1588218576;
        aa.cuep[278] = 2040503436;
        aa.cuep[279] = -18226848;
        aa.cuep[280] = 408554855;
        aa.cuep[281] = -1597193561;
        aa.cuep[282] = -910100730;
        aa.cuep[283] = -1228306212;
        aa.cuep[284] = 1270570874;
        aa.cuep[285] = 743556629;
        aa.cuep[286] = 2074286261;
        aa.cuep[287] = 1087968880;
        aa.cuep[288] = 184414461;
        aa.cuep[289] = -1586024514;
        aa.cuep[290] = 1931664721;
        aa.cuep[291] = 718843865;
        aa.cuep[292] = -1840476513;
        aa.cuep[293] = 1615814377;
        aa.cuep[294] = -1701280836;
        aa.cuep[295] = 263176933;
        aa.cuep[296] = -926593671;
        aa.cuep[297] = 703718411;
        aa.cuep[298] = 204549970;
        aa.cuep[299] = -2081122013;
    }
}

