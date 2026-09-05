/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import ruhack.phobia.ae$ConfigData;
import ruhack.phobia.ae$ItemConfig;

public class ae {
    private ae$ConfigData data;
    private static long[] claf;
    private final Gson gson;
    public static final boolean c;
    private final Path configPath;
    protected static final long gb = 919826538042540342L;
    private static int[] ckyv;
    private static long[] clad;
    public static final int b;
    public static final boolean a;
    private static ae instance;
    private static int[] ckyy;

    private static /* synthetic */ void cmvj() {
        ae.ckyv[200] = 314979494;
        ae.ckyv[201] = -1838186923;
        ae.ckyv[202] = 2109338818;
        ae.ckyv[203] = -1450583990;
        ae.ckyv[204] = -510529739;
        ae.ckyv[205] = 1220355600;
        ae.ckyv[206] = 337313350;
        ae.ckyv[207] = 100743844;
        ae.ckyv[208] = 401019207;
        ae.ckyv[209] = -1401612036;
        ae.ckyv[210] = 80510896;
        ae.ckyv[211] = 942359946;
        ae.ckyv[212] = 801902726;
        ae.ckyv[213] = 581109336;
        ae.ckyv[214] = -24740217;
        ae.ckyv[215] = 1454979046;
        ae.ckyv[216] = -1852755042;
        ae.ckyv[217] = -59554577;
        ae.ckyv[218] = 958972770;
        ae.ckyv[219] = -1973267693;
        ae.ckyv[220] = -237059121;
        ae.ckyv[221] = 13405924;
        ae.ckyv[222] = 1839975489;
        ae.ckyv[223] = -281356574;
        ae.ckyv[224] = 2130294943;
        ae.ckyv[225] = -1348941269;
        ae.ckyv[226] = 13399877;
        ae.ckyv[227] = 814404621;
        ae.ckyv[228] = -264287948;
        ae.ckyv[229] = -883931192;
        ae.ckyv[230] = -724052140;
        ae.ckyv[231] = 1922866572;
        ae.ckyv[232] = 717976876;
        ae.ckyv[233] = 157409101;
        ae.ckyv[234] = 811778979;
        ae.ckyv[235] = 704076395;
        ae.ckyv[236] = 1379279833;
        ae.ckyv[237] = -2010121407;
        ae.ckyv[238] = -1132354211;
        ae.ckyv[239] = -2077604586;
        ae.ckyv[240] = -170801079;
        ae.ckyv[241] = -1974407905;
        ae.ckyv[242] = -279559479;
        ae.ckyv[243] = -976471831;
        ae.ckyv[244] = -1323685476;
        ae.ckyv[245] = 837664733;
        ae.ckyv[246] = 576650061;
        ae.ckyv[247] = -1722660212;
        ae.ckyv[248] = -898749351;
        ae.ckyv[249] = 617472306;
        ae.ckyv[250] = 382686558;
        ae.ckyv[251] = -1359162801;
        ae.ckyv[252] = -546048021;
        ae.ckyv[253] = 1865503229;
        ae.ckyv[254] = 785668946;
        ae.ckyv[255] = 1188614618;
        ae.ckyv[256] = 313888255;
        ae.ckyv[257] = -1103699944;
        ae.ckyv[258] = 50358968;
        ae.ckyv[259] = 1411034707;
        ae.ckyv[260] = -1107511188;
        ae.ckyv[261] = -1763505430;
        ae.ckyv[262] = 1359056126;
        ae.ckyv[263] = -2137467645;
        ae.ckyv[264] = 1769186364;
        ae.ckyv[265] = 2047566184;
        ae.ckyv[266] = -1837661856;
        ae.ckyv[267] = -167009813;
        ae.ckyv[268] = -939734899;
        ae.ckyv[269] = 1739987611;
        ae.ckyv[270] = 407028247;
        ae.ckyv[271] = 278774934;
        ae.ckyv[272] = -9683858;
        ae.ckyv[273] = 1814507649;
        ae.ckyv[274] = 1857292440;
        ae.ckyv[275] = -1980647252;
        ae.ckyv[276] = -590545733;
        ae.ckyv[277] = -378595428;
        ae.ckyv[278] = 96972215;
        ae.ckyv[279] = 221404547;
        ae.ckyv[280] = -867912471;
        ae.ckyv[281] = -1569402870;
        ae.ckyv[282] = -1095975596;
        ae.ckyv[283] = 333018580;
        ae.ckyv[284] = 718737379;
        ae.ckyv[285] = -834976352;
        ae.ckyv[286] = -1040679604;
        ae.ckyv[287] = -1658948848;
        ae.ckyv[288] = 1181456851;
        ae.ckyv[289] = -1936043301;
        ae.ckyv[290] = 451907644;
        ae.ckyv[291] = 600867622;
        ae.ckyv[292] = -2057051311;
        ae.ckyv[293] = 977418692;
        ae.ckyv[294] = -1609119743;
        ae.ckyv[295] = 228104788;
        ae.ckyv[296] = -79021526;
        ae.ckyv[297] = -1772193075;
        ae.ckyv[298] = 899413645;
        ae.ckyv[299] = -724908536;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ae() {
        var4_1 /* !! */  = ae.b;
        super();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.data = new ae$ConfigData();
        var1_2 = Paths.get("Phobia", new String[]{"configs", "autobuy"});
        try {
            Files.createDirectories(var1_2, new FileAttribute[0]);
        }
        catch (IOException var2_3) {
            // empty catch block
        }
        this.configPath = var1_2.resolve("autobuy.file");
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        block1 : switch (var4_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.load();
                return;
            }
lbl18:
            // 2 sources

            case 0: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzc", ckys(int ), (int)0);
                ** GOTO lbl39
            }
lbl21:
            // 4 sources

            case 1: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzf", ckys(int ), (int)1);
            }
            case 2: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzh", ckys(int ), (int)2);
                ** GOTO lbl21
            }
            case 3: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzj", ckys(int ), (int)3);
                ** GOTO lbl18
            }
            case 4: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzm", ckys(int ), (int)4);
                ** GOTO lbl21
            }
lbl32:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)ae.ckyz("ckzp", ckys(int ), (int)5);
                    break block1;
                    break;
                }
            }
lbl36:
            // 2 sources

            case 6: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzq", ckys(int ), (int)6);
                ** GOTO lbl32
            }
lbl39:
            // 2 sources

            case 7: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzs", ckys(int ), (int)7);
                ** GOTO lbl36
            }
            case 8: {
                var4_1 /* !! */  = (int)ae.ckyz("ckzu", ckys(int ), (int)8);
                ** GOTO lbl21
            }
            case 9: 
        }
        var4_1 /* !! */  = (int)ae.ckyz("ckzw", ckys(int ), (int)9);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public Map<String, ae$ItemConfig> getAllItemConfigs() {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("cmoc", clac(int ), (int)291));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -419380938: {
                    break block38;
                }
                case 1108622204: {
                    v1 = ae.ckyz("cmoe", clac(int ), (int)292);
                    continue block38;
                }
                case 1291372922: {
                    v1 = ae.ckyz("cmoh", clac(int ), (int)293);
                    continue block38;
                }
            }
            break;
        }
        var3_1 = ae.c;
        while (true) {
            block53: {
                if ((v2 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmoj", clac(int ), (int)294)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != ae.ckyz("cmol", ckys(int ), (int)359)) break block53;
                var2_2 /* !! */  = ae.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)ae.ckyz("cmon", ckys(int ), (int)360);
        }
        cfr_temp_0 = -2147483648;
        block40: while (true) {
            block54: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = ae.gb;
                        block41: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -792176479: {
                                    v3 /* !! */  = (long)(ae.ckyz("cmot", clac(int ), (int)296) - ae.ckyz("cmoq", clac(int ), (int)295));
                                    continue block41;
                                }
                                case -419380938: {
                                    break block41;
                                }
                            }
                            break;
                        }
                        var1_3 = ae.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v4 /* !! */  = ae.gb;
                        block42: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1924243121: {
                                    v5 = ae.ckyz("cmpa", clac(int ), (int)298);
                                    ** GOTO lbl56
                                }
                                case -1841352800: {
                                    v5 = ae.ckyz("cmpb", clac(int ), (int)299);
                                    ** GOTO lbl56
                                }
                                case -419380938: {
                                    break block42;
                                }
                                case 704725933: {
                                    v5 = ae.ckyz("cmpe", clac(int ), (int)300);
lbl56:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - ae.ckyz("cmoy", clac(int ), (int)297));
                                    continue block42;
                                }
                            }
                            break;
                        }
                        v6 /* !! */  = ae.gb;
                        block43: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case -1254410660: {
                                    v7 = ae.ckyz("cmpj", clac(int ), (int)302);
                                    ** GOTO lbl71
                                }
                                case -888545101: {
                                    v7 = ae.ckyz("cmpl", clac(int ), (int)303);
                                    ** GOTO lbl71
                                }
                                case -419380938: {
                                    break block43;
                                }
                                case 1858619477: {
                                    v7 = ae.ckyz("cmpm", clac(int ), (int)304);
lbl71:
                                    // 3 sources

                                    v6 /* !! */  = (long)(v7 - ae.ckyz("cmph", clac(int ), (int)301));
                                    continue block43;
                                }
                            }
                            break;
                        }
                        v8 /* !! */  = ae.gb;
                        block44: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -554831297: {
                                    v9 = ae.ckyz("cmpo", clac(int ), (int)306);
                                    ** GOTO lbl83
                                }
                                case -419380938: {
                                    break block44;
                                }
                                case 1426287223: {
                                    v9 = ae.ckyz("cmpp", clac(int ), (int)307);
lbl83:
                                    // 2 sources

                                    v8 /* !! */  = (long)(v9 - ae.ckyz("cmpn", clac(int ), (int)305));
                                    continue block44;
                                }
                            }
                            break;
                        }
                        v10 = this.data.getItems();
                        v11 /* !! */  = ae.gb;
                        block45: while (true) {
                            switch ((int)v11 /* !! */ ) {
                                case -762648594: {
                                    v12 = ae.ckyz("cmpr", clac(int ), (int)309);
                                    ** GOTO lbl99
                                }
                                case -419380938: {
                                    return new HashMap<String, ae$ItemConfig>(v10);
                                }
                                case 121744596: {
                                    v12 = ae.ckyz("cmps", clac(int ), (int)310);
                                    ** GOTO lbl99
                                }
                                case 2043963510: {
                                    v12 = ae.ckyz("cmpt", clac(int ), (int)311);
lbl99:
                                    // 3 sources

                                    v11 /* !! */  = (long)(v12 - ae.ckyz("cmpq", clac(int ), (int)308));
                                    continue block45;
                                }
                            }
                            break;
                        }
                        return new HashMap<String, ae$ItemConfig>(v10);
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ae.ckyz("cmpu", ckys(int ), (int)361);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block54;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ae.ckyz("cmqa", ckys(int ), (int)364);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ae.ckyz("cmpv", ckys(int ), (int)362);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl122
            }
            do {
                if (true) continue block40;
lbl122:
                // 2 sources

                var2_2 /* !! */  = (int)ae.ckyz("cmpx", ckys(int ), (int)363);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public void reset() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 42[SWITCH]
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

    private static /* synthetic */ void cmvs() {
        ae.ckyy[200] = -1876893555;
        ae.ckyy[201] = -1838186926;
        ae.ckyy[202] = 2109338817;
        ae.ckyy[203] = -1450583990;
        ae.ckyy[204] = -510529744;
        ae.ckyy[205] = 1220355605;
        ae.ckyy[206] = 337313348;
        ae.ckyy[207] = 100743845;
        ae.ckyy[208] = 401019201;
        ae.ckyy[209] = 1401612035;
        ae.ckyy[210] = -338241193;
        ae.ckyy[211] = 942359947;
        ae.ckyy[212] = 814264626;
        ae.ckyy[213] = 581109343;
        ae.ckyy[214] = -24740218;
        ae.ckyy[215] = 1454979043;
        ae.ckyy[216] = -1852755047;
        ae.ckyy[217] = -59554578;
        ae.ckyy[218] = 958972773;
        ae.ckyy[219] = -1973267691;
        ae.ckyy[220] = -237059121;
        ae.ckyy[221] = 13405921;
        ae.ckyy[222] = 1839975489;
        ae.ckyy[223] = 281356573;
        ae.ckyy[224] = -72318916;
        ae.ckyy[225] = -1348941270;
        ae.ckyy[226] = -400940746;
        ae.ckyy[227] = -814404622;
        ae.ckyy[228] = 869168187;
        ae.ckyy[229] = -883931191;
        ae.ckyy[230] = 1573210207;
        ae.ckyy[231] = 1922866573;
        ae.ckyy[232] = 717976876;
        ae.ckyy[233] = 157409097;
        ae.ckyy[234] = 811778982;
        ae.ckyy[235] = 704076395;
        ae.ckyy[236] = 1379279832;
        ae.ckyy[237] = -2010121402;
        ae.ckyy[238] = -1132354212;
        ae.ckyy[239] = -2077604585;
        ae.ckyy[240] = 204014895;
        ae.ckyy[241] = -1974407906;
        ae.ckyy[242] = 1584533274;
        ae.ckyy[243] = 976471830;
        ae.ckyy[244] = -318053276;
        ae.ckyy[245] = 837664730;
        ae.ckyy[246] = 576650060;
        ae.ckyy[247] = -1722660210;
        ae.ckyy[248] = -898749350;
        ae.ckyy[249] = 617472305;
        ae.ckyy[250] = 382686553;
        ae.ckyy[251] = -1359162809;
        ae.ckyy[252] = -546048030;
        ae.ckyy[253] = 1865503225;
        ae.ckyy[254] = 785668944;
        ae.ckyy[255] = -1188614619;
        ae.ckyy[256] = 1082311729;
        ae.ckyy[257] = 1103699943;
        ae.ckyy[258] = -646950190;
        ae.ckyy[259] = 1411034706;
        ae.ckyy[260] = 856151111;
        ae.ckyy[261] = -1763505431;
        ae.ckyy[262] = 1359056126;
        ae.ckyy[263] = -2137467643;
        ae.ckyy[264] = 1769186366;
        ae.ckyy[265] = 2047566188;
        ae.ckyy[266] = -1837661856;
        ae.ckyy[267] = -167009813;
        ae.ckyy[268] = -939734903;
        ae.ckyy[269] = -1739987612;
        ae.ckyy[270] = 74338516;
        ae.ckyy[271] = -278774935;
        ae.ckyy[272] = -1762356486;
        ae.ckyy[273] = -1814507650;
        ae.ckyy[274] = 905287327;
        ae.ckyy[275] = -1980647259;
        ae.ckyy[276] = -590545730;
        ae.ckyy[277] = -378595436;
        ae.ckyy[278] = 96972223;
        ae.ckyy[279] = 221404548;
        ae.ckyy[280] = -867912480;
        ae.ckyy[281] = -1569402865;
        ae.ckyy[282] = -1095975587;
        ae.ckyy[283] = 333018577;
        ae.ckyy[284] = 718737379;
        ae.ckyy[285] = -834976351;
        ae.ckyy[286] = 731680042;
        ae.ckyy[287] = -1658948847;
        ae.ckyy[288] = -1181456852;
        ae.ckyy[289] = -629759875;
        ae.ckyy[290] = 451907645;
        ae.ckyy[291] = 600867622;
        ae.ckyy[292] = -2057051301;
        ae.ckyy[293] = 977418694;
        ae.ckyy[294] = -1609119733;
        ae.ckyy[295] = 228104785;
        ae.ckyy[296] = -79021525;
        ae.ckyy[297] = -1772193074;
        ae.ckyy[298] = 899413636;
        ae.ckyy[299] = -724908535;
    }

    private static /* synthetic */ void cmva() {
        ae.ckyv[100] = -1068330034;
        ae.ckyv[101] = 584430788;
        ae.ckyv[102] = -798089298;
        ae.ckyv[103] = 661738348;
        ae.ckyv[104] = -1046965975;
        ae.ckyv[105] = 2104094092;
        ae.ckyv[106] = 1695495996;
        ae.ckyv[107] = -1658120578;
        ae.ckyv[108] = 541241331;
        ae.ckyv[109] = 771642666;
        ae.ckyv[110] = 199192303;
        ae.ckyv[111] = 398210526;
        ae.ckyv[112] = -1609213267;
        ae.ckyv[113] = 515419137;
        ae.ckyv[114] = -2141555944;
        ae.ckyv[115] = 2002383745;
        ae.ckyv[116] = -1165057497;
        ae.ckyv[117] = -2011026447;
        ae.ckyv[118] = -1273103992;
        ae.ckyv[119] = -1424432827;
        ae.ckyv[120] = -1124513934;
        ae.ckyv[121] = 1338106297;
        ae.ckyv[122] = -352734532;
        ae.ckyv[123] = -1125260844;
        ae.ckyv[124] = 1642220104;
        ae.ckyv[125] = -1222155119;
        ae.ckyv[126] = 680218097;
        ae.ckyv[127] = 390428371;
        ae.ckyv[128] = 1301446181;
        ae.ckyv[129] = 824306738;
        ae.ckyv[130] = -2041905440;
        ae.ckyv[131] = -1030339259;
        ae.ckyv[132] = -36084502;
        ae.ckyv[133] = 1102520094;
        ae.ckyv[134] = -1397725348;
        ae.ckyv[135] = -1834412932;
        ae.ckyv[136] = 1639722085;
        ae.ckyv[137] = -1819801010;
        ae.ckyv[138] = 1118204446;
        ae.ckyv[139] = -912938000;
        ae.ckyv[140] = -1851215319;
        ae.ckyv[141] = 2137935384;
        ae.ckyv[142] = 74347575;
        ae.ckyv[143] = 1683596800;
        ae.ckyv[144] = -336079233;
        ae.ckyv[145] = -1806300254;
        ae.ckyv[146] = 1576717328;
        ae.ckyv[147] = 1031328631;
        ae.ckyv[148] = 1932486273;
        ae.ckyv[149] = 1393623311;
        ae.ckyv[150] = -535514426;
        ae.ckyv[151] = 60528798;
        ae.ckyv[152] = 700406738;
        ae.ckyv[153] = -1408060230;
        ae.ckyv[154] = 2009075746;
        ae.ckyv[155] = -223673163;
        ae.ckyv[156] = -664424473;
        ae.ckyv[157] = 662123910;
        ae.ckyv[158] = 320156022;
        ae.ckyv[159] = -1815192811;
        ae.ckyv[160] = -56781757;
        ae.ckyv[161] = -2019233409;
        ae.ckyv[162] = 93900901;
        ae.ckyv[163] = 906732449;
        ae.ckyv[164] = -284774116;
        ae.ckyv[165] = 71449083;
        ae.ckyv[166] = -642061464;
        ae.ckyv[167] = 98433644;
        ae.ckyv[168] = -965783783;
        ae.ckyv[169] = 1724645499;
        ae.ckyv[170] = -1019282416;
        ae.ckyv[171] = -1316756280;
        ae.ckyv[172] = -2091972345;
        ae.ckyv[173] = -1020012676;
        ae.ckyv[174] = 241339767;
        ae.ckyv[175] = 1394661135;
        ae.ckyv[176] = 829371271;
        ae.ckyv[177] = -1096642559;
        ae.ckyv[178] = 471174647;
        ae.ckyv[179] = 1496455963;
        ae.ckyv[180] = 1273727564;
        ae.ckyv[181] = -980838153;
        ae.ckyv[182] = 1293517186;
        ae.ckyv[183] = 1813335923;
        ae.ckyv[184] = 1947789285;
        ae.ckyv[185] = 1755048817;
        ae.ckyv[186] = -1359378516;
        ae.ckyv[187] = 863601104;
        ae.ckyv[188] = -342356301;
        ae.ckyv[189] = -1354718025;
        ae.ckyv[190] = 2064576099;
        ae.ckyv[191] = 1004423308;
        ae.ckyv[192] = -1712925968;
        ae.ckyv[193] = -2001872246;
        ae.ckyv[194] = -1222455812;
        ae.ckyv[195] = -131024018;
        ae.ckyv[196] = -722286350;
        ae.ckyv[197] = -1430834615;
        ae.ckyv[198] = -1880146766;
        ae.ckyv[199] = 48293074;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 24[SWITCH]
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
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 19[SWITCH]
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
    private static /* synthetic */ ae$ItemConfig lambda$getItemConfig$0(String var0) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block9: while (true) {
            v0 /* !! */  = (long)(ae.ckyz("cmrk", clac(int ), (int)323) - ae.ckyz("cmri", clac(int ), (int)322));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -419380938: {
                    break block9;
                }
                case 623484805: {
                    continue block9;
                }
            }
            break;
        }
        var3_1 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmrm", clac(int ), (int)324)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ae.ckyz("cmrn", ckys(int ), (int)371)) break;
            v1 /* !! */  = (long)ae.ckyz("cmrp", ckys(int ), (int)372);
        }
        var2_2 = ae.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmrr", clac(int ), (int)325)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ae.ckyz("cmrt", ckys(int ), (int)373)) break;
            v2 /* !! */  = (long)ae.ckyz("cmrw", ckys(int ), (int)374);
        }
        var1_3 = ae.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmsa", clac(int ), (int)326)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ae.ckyz("cmsc", ckys(int ), (int)375)) break;
            v3 /* !! */  = (long)ae.ckyz("cmse", ckys(int ), (int)376);
        }
        v4 /* !! */  = ae.gb;
        if (true) ** GOTO lbl40
        block14: while (true) {
            v4 /* !! */  = (long)(v5 - ae.ckyz("cmsg", clac(int ), (int)327));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1879433304: {
                    v5 = ae.ckyz("cmsi", clac(int ), (int)328);
                    continue block14;
                }
                case -419380938: {
                    break block14;
                }
                case 164066637: {
                    v5 = ae.ckyz("cmsk", clac(int ), (int)329);
                    continue block14;
                }
            }
            break;
        }
        return new ae$ItemConfig();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static ae getInstance() {
        block47: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clag", clac(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ae.ckyz("clai", ckys(int ), (int)10)) break;
                v0 /* !! */  = (long)ae.ckyz("claj", ckys(int ), (int)11);
            }
            var2 = ae.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("clam", clac(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ae.ckyz("clao", ckys(int ), (int)12)) break;
                v1 /* !! */  = (long)ae.ckyz("clap", ckys(int ), (int)13);
            }
            var1_1 /* !! */  = ae.b;
            v2 /* !! */  = ae.gb;
            block31: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -1783973719: {
                        v2 /* !! */  = (long)(ae.ckyz("clas", clac(int ), (int)3) - ae.ckyz("clar", clac(int ), (int)2));
                        continue block31;
                    }
                    case -419380938: {
                        break block31;
                    }
                }
                break;
            }
            var0_2 = ae.a;
            if (var2) {
                throw null;
            }
            if (var0_2 != false) return null;
            if (var0_2 != false) return null;
            v3 /* !! */  = ae.gb;
            block32: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -419380938: {
                        break block32;
                    }
                    case 1851124230: {
                        v3 /* !! */  = (long)(ae.ckyz("clax", clac(int ), (int)5) - ae.ckyz("clav", clac(int ), (int)4));
                        continue block32;
                    }
                }
                break;
            }
            if (ae.instance != null) ** GOTO lbl-1000
            if (var0_2 != false) return null;
            if (var0_2 != false) return null;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = ae.gb - ae.ckyz("claz", clac(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ae.ckyz("clba", ckys(int ), (int)14)) break;
                v4 /* !! */  = (long)ae.ckyz("clbc", ckys(int ), (int)15);
            }
            v5 /* !! */  = ae.gb;
            block34: while (true) {
                switch ((int)v5 /* !! */ ) {
                    case -419380938: {
                        break block34;
                    }
                    case 1389967370: {
                        v5 /* !! */  = (long)(ae.ckyz("clbe", clac(int ), (int)8) - ae.ckyz("clbd", clac(int ), (int)7));
                        continue block34;
                    }
                }
                break;
            }
            v6 = new ae();
            while (true) {
                block48: {
                    if ((v7 /* !! */  = (cfr_temp_4 = ae.gb - ae.ckyz("clbh", clac(int ), (int)9)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  != ae.ckyz("clbj", ckys(int ), (int)16)) break block48;
                    ae.instance = v6;
                    if (var0_2 != false) return null;
                    if (var1_1 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v7 /* !! */  = (long)ae.ckyz("clbl", ckys(int ), (int)17);
            }
            cfr_temp_0 = -2147483648;
            block36: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 3 sources

                    {
                        if (var0_2 != false) return null;
                        if (var0_2 != false) return null;
                        v8 /* !! */  = ae.gb;
                        block37: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -1601464253: {
                                    v9 = ae.ckyz("clbp", clac(int ), (int)11);
                                    ** GOTO lbl81
                                }
                                case -635141576: {
                                    v9 = ae.ckyz("clbs", clac(int ), (int)12);
                                    ** GOTO lbl81
                                }
                                case -419380938: {
                                    return ae.instance;
                                }
                                case 686576592: {
                                    v9 = ae.ckyz("clbv", clac(int ), (int)13);
lbl81:
                                    // 3 sources

                                    v8 /* !! */  = (long)(v9 - ae.ckyz("clbn", clac(int ), (int)10));
                                    continue block37;
                                }
                            }
                            break;
                        }
                        return ae.instance;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)ae.ckyz("clbx", ckys(int ), (int)18);
                        cfr_temp_0 = 4;
                        if (!var2) continue block36;
                        throw null;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)ae.ckyz("clcb", ckys(int ), (int)20);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)ae.ckyz("clcq", ckys(int ), (int)25);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)ae.ckyz("clcn", ckys(int ), (int)24);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)ae.ckyz("clby", ckys(int ), (int)19);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        ** break;
                    }
                    case 8: {
                        break block47;
                    }
lbl109:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)ae.ckyz("clce", ckys(int ), (int)21);
                        cfr_temp_0 = 5;
                        if (!var2) continue block36;
                        throw null;
                    }
                    case 5: {
                        var1_1 /* !! */  = (int)ae.ckyz("clcl", ckys(int ), (int)23);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)ae.ckyz("clch", ckys(int ), (int)22);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)ae.ckyz("clcs", ckys(int ), (int)26);
        ** while (!var2)
lbl127:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ConfigData getData() {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("cmqd", clac(int ), (int)312));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1499678751: {
                    v1 = ae.ckyz("cmqe", clac(int ), (int)313);
                    continue block21;
                }
                case -419380938: {
                    break block21;
                }
                case 1255698473: {
                    v1 = ae.ckyz("cmqf", clac(int ), (int)314);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ae.c;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cmqg", clac(int ), (int)315));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1107255633: {
                    v3 = ae.ckyz("cmqh", clac(int ), (int)316);
                    continue block22;
                }
                case -873310769: {
                    v3 = ae.ckyz("cmqi", clac(int ), (int)317);
                    continue block22;
                }
                case -419380938: {
                    break block22;
                }
                case 2073417924: {
                    v3 = ae.ckyz("cmqj", clac(int ), (int)318);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ae.b;
        v4 /* !! */  = ae.gb;
        if (true) ** GOTO lbl36
        block23: while (true) {
            v4 /* !! */  = (long)(ae.ckyz("cmql", clac(int ), (int)320) - ae.ckyz("cmqk", clac(int ), (int)319));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -642749105: {
                    continue block23;
                }
                case -419380938: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = ae.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmqq", clac(int ), (int)321)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ae.ckyz("cmqt", ckys(int ), (int)365)) break;
                    v5 /* !! */  = (long)ae.ckyz("cmqv", ckys(int ), (int)366);
                }
                return this.data;
            }
            case 0: {
                var2_2 /* !! */  = (int)ae.ckyz("cmqx", ckys(int ), (int)367);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ae.ckyz("cmra", ckys(int ), (int)368);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl68:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ae.ckyz("cmrc", ckys(int ), (int)369);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ae.ckyz("cmre", ckys(int ), (int)370);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ckyz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ItemConfig getItemConfig(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cltp", clac(int ), (int)106)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ae.ckyz("cltr", ckys(int ), (int)155)) break;
            v0 /* !! */  = (long)ae.ckyz("clts", ckys(int ), (int)156);
        }
        var4_2 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cltt", clac(int ), (int)107)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ae.ckyz("cltu", ckys(int ), (int)157)) break;
            v1 /* !! */  = (long)ae.ckyz("cltv", ckys(int ), (int)158);
        }
        var3_3 /* !! */  = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl19
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cltw", clac(int ), (int)108));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -419380938: {
                    break block33;
                }
                case -142094354: {
                    v3 = ae.ckyz("clty", clac(int ), (int)109);
                    continue block33;
                }
                case 1691392807: {
                    v3 = ae.ckyz("cltz", clac(int ), (int)110);
                    continue block33;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 /* !! */  = ae.gb;
                if (true) ** GOTO lbl42
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - ae.ckyz("clua", clac(int ), (int)111));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -419380938: {
                            break block35;
                        }
                        case 410629249: {
                            v5 = ae.ckyz("cluc", clac(int ), (int)112);
                            continue block35;
                        }
                        case 1458177802: {
                            v5 = ae.ckyz("clud", clac(int ), (int)113);
                            continue block35;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ae.gb;
                if (true) ** GOTO lbl55
                block36: while (true) {
                    v6 /* !! */  = (long)(v7 - ae.ckyz("clue", clac(int ), (int)114));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1303503977: {
                            v7 = ae.ckyz("cluf", clac(int ), (int)115);
                            continue block36;
                        }
                        case -419380938: {
                            break block36;
                        }
                        case 1014874956: {
                            v7 = ae.ckyz("cluh", clac(int ), (int)116);
                            continue block36;
                        }
                        case 1766054514: {
                            v7 = ae.ckyz("clui", clac(int ), (int)117);
                            continue block36;
                        }
                    }
                    break;
                }
                v8 = this.data.getItems();
                v9 /* !! */  = ae.gb;
                if (true) ** GOTO lbl72
                block37: while (true) {
                    v9 /* !! */  = (long)(v10 - ae.ckyz("cluj", clac(int ), (int)118));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -419380938: {
                            break block37;
                        }
                        case -320732118: {
                            v10 = ae.ckyz("cluk", clac(int ), (int)119);
                            continue block37;
                        }
                        case 1171602123: {
                            v10 = ae.ckyz("clul", clac(int ), (int)120);
                            continue block37;
                        }
                    }
                    break;
                }
                v11 = (Function<String, ae$ItemConfig>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$getItemConfig$0(java.lang.String ), (Ljava/lang/String;)Lruhack/phobia/ae$ItemConfig;)();
                v12 /* !! */  = ae.gb;
                if (true) ** GOTO lbl86
                block38: while (true) {
                    v12 /* !! */  = (long)(ae.ckyz("cluo", clac(int ), (int)122) - ae.ckyz("clun", clac(int ), (int)121));
lbl86:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1416324774: {
                            continue block38;
                        }
                        case -419380938: {
                            break block38;
                        }
                    }
                    break;
                }
                return v8.computeIfAbsent(var1_1, v11);
            }
            case 0: {
                var3_3 /* !! */  = (int)ae.ckyz("clup", ckys(int ), (int)159);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ae.ckyz("clur", ckys(int ), (int)160);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae.ckyz("clus", ckys(int ), (int)161);
                    if (!var4_2) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ae.ckyz("clut", ckys(int ), (int)162);
        ** while (!var4_2)
lbl108:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cmvo() {
        ae.ckyv[300] = 1810655710;
        ae.ckyv[301] = -277200329;
        ae.ckyv[302] = 553213878;
        ae.ckyv[303] = -191298618;
        ae.ckyv[304] = -1381517041;
        ae.ckyv[305] = -979227219;
        ae.ckyv[306] = 1755226734;
        ae.ckyv[307] = -252955265;
        ae.ckyv[308] = -529889049;
        ae.ckyv[309] = 146456405;
        ae.ckyv[310] = 580976560;
        ae.ckyv[311] = -1098358304;
        ae.ckyv[312] = 195141893;
        ae.ckyv[313] = 193533466;
        ae.ckyv[314] = 1142210288;
        ae.ckyv[315] = 1986141517;
        ae.ckyv[316] = 489304742;
        ae.ckyv[317] = 329362847;
        ae.ckyv[318] = 1016689799;
        ae.ckyv[319] = -523865680;
        ae.ckyv[320] = -2062409859;
        ae.ckyv[321] = 1601759952;
        ae.ckyv[322] = 1089812191;
        ae.ckyv[323] = -1359728153;
        ae.ckyv[324] = -122946726;
        ae.ckyv[325] = 1335300357;
        ae.ckyv[326] = 406137379;
        ae.ckyv[327] = 1657687669;
        ae.ckyv[328] = 78677635;
        ae.ckyv[329] = 1565454680;
        ae.ckyv[330] = 2072435740;
        ae.ckyv[331] = -989006250;
        ae.ckyv[332] = -77250599;
        ae.ckyv[333] = -2141328361;
        ae.ckyv[334] = -1140537048;
        ae.ckyv[335] = -1059306780;
        ae.ckyv[336] = 1913771522;
        ae.ckyv[337] = -44450821;
        ae.ckyv[338] = -669289213;
        ae.ckyv[339] = -1670192076;
        ae.ckyv[340] = -969751826;
        ae.ckyv[341] = -2075763627;
        ae.ckyv[342] = 263448934;
        ae.ckyv[343] = -1375443969;
        ae.ckyv[344] = 1318199237;
        ae.ckyv[345] = 583489010;
        ae.ckyv[346] = -1215690160;
        ae.ckyv[347] = -48463092;
        ae.ckyv[348] = 1859583683;
        ae.ckyv[349] = 953068367;
        ae.ckyv[350] = 350870947;
        ae.ckyv[351] = 1902186640;
        ae.ckyv[352] = 1803696586;
        ae.ckyv[353] = -93263161;
        ae.ckyv[354] = -1792363616;
        ae.ckyv[355] = 2085280369;
        ae.ckyv[356] = 1269292274;
        ae.ckyv[357] = -428572555;
        ae.ckyv[358] = -632447812;
        ae.ckyv[359] = -314760204;
        ae.ckyv[360] = -1492295897;
        ae.ckyv[361] = 1647025341;
        ae.ckyv[362] = -1192833312;
        ae.ckyv[363] = -2141134774;
        ae.ckyv[364] = 374888993;
        ae.ckyv[365] = -1628447366;
        ae.ckyv[366] = 1460027909;
        ae.ckyv[367] = 1892112093;
        ae.ckyv[368] = 1887475005;
        ae.ckyv[369] = 165521217;
        ae.ckyv[370] = 1538688145;
        ae.ckyv[371] = 1182964957;
        ae.ckyv[372] = 244943014;
        ae.ckyv[373] = -2074869905;
        ae.ckyv[374] = 1793055552;
        ae.ckyv[375] = -1867894931;
        ae.ckyv[376] = 1418836839;
        ae.ckyv[377] = -206019440;
        ae.ckyv[378] = 1985546405;
        ae.ckyv[379] = -1452038397;
        ae.ckyv[380] = -1740305314;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setItemBuyBelow(String var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmbh", clac(int ), (int)191)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ae.ckyz("cmbi", ckys(int ), (int)223)) break;
            v0 /* !! */  = (long)ae.ckyz("cmbj", ckys(int ), (int)224);
        }
        var6_3 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmbm", clac(int ), (int)192)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ae.ckyz("cmbn", ckys(int ), (int)225)) break;
            v1 /* !! */  = (long)ae.ckyz("cmbo", ckys(int ), (int)226);
        }
        var5_4 /* !! */  = ae.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = ae.gb - ae.ckyz("cmbp", clac(int ), (int)193)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae.ckyz("cmbq", ckys(int ), (int)227)) {
                var4_5 = ae.a;
                if (var6_3) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ae.ckyz("cmbr", ckys(int ), (int)228);
        }
        if (var4_5 || var4_5) return;
        v3 /* !! */  = ae.gb;
        if (true) ** GOTO lbl27
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - ae.ckyz("cmbt", clac(int ), (int)194));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -419380938: {
                    break block19;
                }
                case 718289503: {
                    v4 = ae.ckyz("cmbu", clac(int ), (int)195);
                    continue block19;
                }
                case 1164660776: {
                    v4 = ae.ckyz("cmbv", clac(int ), (int)196);
                    continue block19;
                }
                case 1785401763: {
                    v4 = ae.ckyz("cmbw", clac(int ), (int)197);
                    continue block19;
                }
            }
            break;
        }
        var3_6 = this.getItemConfig(var1_1);
        if (var4_5 || var4_5) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = ae.gb - ae.ckyz("cmby", clac(int ), (int)198)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ae.ckyz("cmbz", ckys(int ), (int)229)) {
                var3_6.setBuyBelow(var2_2);
                if (var4_5) return;
                break;
            }
            v5 /* !! */  = (long)ae.ckyz("cmca", ckys(int ), (int)230);
        }
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: do {
            switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var4_5) return;
                    return;
                }
                case 1: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmcd", ckys(int ), (int)232);
                    cfr_temp_0 = 0;
                    if (!var6_3) continue block21;
                    throw null;
                }
                case 6: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmcj", ckys(int ), (int)237);
                    if (var6_3) {
                        throw null;
                    }
                }
                case 0: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmcb", ckys(int ), (int)231);
                    if (var6_3) {
                        throw null;
                    }
                }
                case 2: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmce", ckys(int ), (int)233);
                    if (var6_3) {
                        throw null;
                    }
                }
                case 3: {
                    ** GOTO lbl79
                }
                case 7: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmck", ckys(int ), (int)238);
                    if (var6_3) {
                        throw null;
                    }
lbl79:
                    // 3 sources

                    var5_4 /* !! */  = (int)ae.ckyz("cmcf", ckys(int ), (int)234);
                    if (var6_3) {
                        throw null;
                    }
                }
                case 5: {
                    var5_4 /* !! */  = (int)ae.ckyz("cmci", ckys(int ), (int)236);
                    if (var6_3) {
                        throw null;
                    }
                }
                case 4: 
            }
            break;
        } while (true);
        do {
            var5_4 /* !! */  = (int)ae.ckyz("cmcg", ckys(int ), (int)235);
        } while (!var6_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void loadItemSettings(String var1_1, int var2_2) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("cmlm", clac(int ), (int)279));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -976949616: {
                    v1 = ae.ckyz("cmln", clac(int ), (int)280);
                    continue block19;
                }
                case -419380938: {
                    break block19;
                }
                case 503473239: {
                    v1 = ae.ckyz("cmlp", clac(int ), (int)281);
                    continue block19;
                }
                case 1043147312: {
                    v1 = ae.ckyz("cmlq", clac(int ), (int)282);
                    continue block19;
                }
            }
            break;
        }
        var6_3 = ae.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmls", clac(int ), (int)283)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae.ckyz("cmlt", ckys(int ), (int)330)) break;
            v2 /* !! */  = (long)ae.ckyz("cmlv", ckys(int ), (int)331);
        }
        var5_4 /* !! */  = ae.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmlw", clac(int ), (int)284)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ae.ckyz("cmly", ckys(int ), (int)332)) break;
                    v3 /* !! */  = (long)ae.ckyz("cmlz", ckys(int ), (int)333);
                }
                var4_5 = ae.a;
                if (var6_3) {
                    throw null;
lbl35:
                    // 5 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmmb", clac(int ), (int)285)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ae.ckyz("cmmc", ckys(int ), (int)334)) break;
                    v4 /* !! */  = (long)ae.ckyz("cmme", ckys(int ), (int)335);
                }
                if (this.hasItemConfig(var1_1)) ** GOTO lbl77
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ae.gb - ae.ckyz("cmmg", clac(int ), (int)286)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ae.ckyz("cmmh", ckys(int ), (int)336)) break;
                    v5 /* !! */  = (long)ae.ckyz("cmmi", ckys(int ), (int)337);
                }
                v6 = ae.ckyz("cmmj", ckys(int ), (int)338);
                v7 = ae.ckyz("cmmk", ckys(int ), (int)339);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ae.gb - ae.ckyz("cmmm", clac(int ), (int)287)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ae.ckyz("cmmn", ckys(int ), (int)340)) break;
                    v8 /* !! */  = (long)ae.ckyz("cmmp", ckys(int ), (int)341);
                }
                var3_6 = new ae$ItemConfig((boolean)v6, var2_2, (int)v7);
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = ae.gb - ae.ckyz("cmmr", clac(int ), (int)288)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ae.ckyz("cmms", ckys(int ), (int)342)) break;
                    v9 /* !! */  = (long)ae.ckyz("cmmu", ckys(int ), (int)343);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = ae.gb - ae.ckyz("cmmv", clac(int ), (int)289)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ae.ckyz("cmmx", ckys(int ), (int)344)) break;
                    v10 /* !! */  = (long)ae.ckyz("cmmy", ckys(int ), (int)345);
                }
                v11 = this.data.getItems();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = ae.gb - ae.ckyz("cmna", clac(int ), (int)290)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ae.ckyz("cmnb", ckys(int ), (int)346)) break;
                    v12 /* !! */  = (long)ae.ckyz("cmnd", ckys(int ), (int)347);
                }
                v11.put(var1_1, var3_6);
                if (var4_5) ** GOTO lbl35
lbl77:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl80:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnf", ckys(int ), (int)348);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 1: {
                var5_4 /* !! */  = (int)ae.ckyz("cmng", ckys(int ), (int)349);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 2: {
                var5_4 /* !! */  = (int)ae.ckyz("cmni", ckys(int ), (int)350);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 3: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnk", ckys(int ), (int)351);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 4: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnm", ckys(int ), (int)352);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl105:
            // 4 sources

            case 5: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnn", ckys(int ), (int)353);
                if (!var6_3) ** GOTO lbl80
                throw null;
            }
lbl109:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ae.ckyz("cmno", ckys(int ), (int)354);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl119
                    break;
                }
            }
lbl115:
            // 3 sources

            case 7: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnp", ckys(int ), (int)355);
                if (!var6_3) ** GOTO lbl109
                throw null;
            }
lbl119:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnq", ckys(int ), (int)356);
                if (!var6_3) ** GOTO lbl80
                throw null;
            }
lbl123:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)ae.ckyz("cmnr", ckys(int ), (int)357);
                if (!var6_3) ** GOTO lbl105
                throw null;
            }
            case 10: 
        }
        var5_4 /* !! */  = (int)ae.ckyz("cmnt", ckys(int ), (int)358);
        ** while (!var6_3)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cmuq() {
        ae.ckyv[0] = -1711462364;
        ae.ckyv[1] = 669772734;
        ae.ckyv[2] = -719529786;
        ae.ckyv[3] = 170437234;
        ae.ckyv[4] = 204633049;
        ae.ckyv[5] = 295985916;
        ae.ckyv[6] = -1008853337;
        ae.ckyv[7] = 1057432428;
        ae.ckyv[8] = 117188380;
        ae.ckyv[9] = -1739044229;
        ae.ckyv[10] = 1703224818;
        ae.ckyv[11] = 589818853;
        ae.ckyv[12] = -1054050692;
        ae.ckyv[13] = -1837494159;
        ae.ckyv[14] = -2123157259;
        ae.ckyv[15] = -1271651017;
        ae.ckyv[16] = -471868968;
        ae.ckyv[17] = 1427425916;
        ae.ckyv[18] = 301184127;
        ae.ckyv[19] = -1839686962;
        ae.ckyv[20] = 1884971085;
        ae.ckyv[21] = -1441240921;
        ae.ckyv[22] = -2093895020;
        ae.ckyv[23] = 1476494788;
        ae.ckyv[24] = -1190926712;
        ae.ckyv[25] = -980474461;
        ae.ckyv[26] = 1988653126;
        ae.ckyv[27] = 1903835522;
        ae.ckyv[28] = 353085456;
        ae.ckyv[29] = 1384095423;
        ae.ckyv[30] = 934820148;
        ae.ckyv[31] = -1130401421;
        ae.ckyv[32] = 464775387;
        ae.ckyv[33] = 768699798;
        ae.ckyv[34] = -270660481;
        ae.ckyv[35] = 1585569970;
        ae.ckyv[36] = 48006111;
        ae.ckyv[37] = 694150847;
        ae.ckyv[38] = 1096344592;
        ae.ckyv[39] = -1048350590;
        ae.ckyv[40] = 1754145331;
        ae.ckyv[41] = 900600884;
        ae.ckyv[42] = -1934971399;
        ae.ckyv[43] = -1034290360;
        ae.ckyv[44] = 246052374;
        ae.ckyv[45] = 296469418;
        ae.ckyv[46] = -1386336788;
        ae.ckyv[47] = 16443652;
        ae.ckyv[48] = 166570836;
        ae.ckyv[49] = 104325110;
        ae.ckyv[50] = -1186989507;
        ae.ckyv[51] = 1978743555;
        ae.ckyv[52] = -1540899404;
        ae.ckyv[53] = 459902721;
        ae.ckyv[54] = 2091949681;
        ae.ckyv[55] = -2012505975;
        ae.ckyv[56] = 2100151908;
        ae.ckyv[57] = 1669540339;
        ae.ckyv[58] = -1211055247;
        ae.ckyv[59] = -979834547;
        ae.ckyv[60] = 2106531225;
        ae.ckyv[61] = 1518731879;
        ae.ckyv[62] = -113687925;
        ae.ckyv[63] = -1639216868;
        ae.ckyv[64] = -1258216732;
        ae.ckyv[65] = 1357088985;
        ae.ckyv[66] = 1956588066;
        ae.ckyv[67] = 2128224476;
        ae.ckyv[68] = -153589095;
        ae.ckyv[69] = 799283933;
        ae.ckyv[70] = -786811032;
        ae.ckyv[71] = -352379982;
        ae.ckyv[72] = 420820119;
        ae.ckyv[73] = 164996222;
        ae.ckyv[74] = -636547517;
        ae.ckyv[75] = -1414279952;
        ae.ckyv[76] = -643450885;
        ae.ckyv[77] = -1257230252;
        ae.ckyv[78] = -1927728473;
        ae.ckyv[79] = 1064463268;
        ae.ckyv[80] = 1050898912;
        ae.ckyv[81] = -1039080153;
        ae.ckyv[82] = 866942104;
        ae.ckyv[83] = 180737334;
        ae.ckyv[84] = 1793829514;
        ae.ckyv[85] = -1130206802;
        ae.ckyv[86] = 979695897;
        ae.ckyv[87] = -1045379736;
        ae.ckyv[88] = 2140507600;
        ae.ckyv[89] = -1805480998;
        ae.ckyv[90] = 1451625408;
        ae.ckyv[91] = -1670285705;
        ae.ckyv[92] = -1472499588;
        ae.ckyv[93] = -2077399556;
        ae.ckyv[94] = -733529893;
        ae.ckyv[95] = 286120610;
        ae.ckyv[96] = -2141843111;
        ae.ckyv[97] = -946610100;
        ae.ckyv[98] = -1710410295;
        ae.ckyv[99] = 999291719;
    }

    private static /* synthetic */ long clac(int n2) {
        return clad[n2] ^ claf[n2];
    }

    private static /* synthetic */ void cmvx() {
        ae.ckyy[300] = 1810655702;
        ae.ckyy[301] = -277200329;
        ae.ckyy[302] = 553213879;
        ae.ckyy[303] = -191298617;
        ae.ckyy[304] = 1992224064;
        ae.ckyy[305] = -784125432;
        ae.ckyy[306] = 1755226735;
        ae.ckyy[307] = -2016662938;
        ae.ckyy[308] = -529889050;
        ae.ckyy[309] = 1489616520;
        ae.ckyy[310] = 580976560;
        ae.ckyy[311] = -1098358303;
        ae.ckyy[312] = 195141893;
        ae.ckyy[313] = 193533466;
        ae.ckyy[314] = 1142210289;
        ae.ckyy[315] = 1475219896;
        ae.ckyy[316] = -1684993108;
        ae.ckyy[317] = 329362847;
        ae.ckyy[318] = 1016689799;
        ae.ckyy[319] = -523865679;
        ae.ckyy[320] = -2062409860;
        ae.ckyy[321] = 1601759953;
        ae.ckyy[322] = -638171798;
        ae.ckyy[323] = -1359728154;
        ae.ckyy[324] = 1917725723;
        ae.ckyy[325] = 1335300357;
        ae.ckyy[326] = 406137378;
        ae.ckyy[327] = 1657687671;
        ae.ckyy[328] = 78677632;
        ae.ckyy[329] = 1565454682;
        ae.ckyy[330] = -2072435741;
        ae.ckyy[331] = 109637721;
        ae.ckyy[332] = 77250598;
        ae.ckyy[333] = 1520072911;
        ae.ckyy[334] = 1140537047;
        ae.ckyy[335] = 857114174;
        ae.ckyy[336] = 1913771523;
        ae.ckyy[337] = 1319592997;
        ae.ckyy[338] = -669289213;
        ae.ckyy[339] = -1670192075;
        ae.ckyy[340] = 969751825;
        ae.ckyy[341] = -1068392832;
        ae.ckyy[342] = 263448935;
        ae.ckyy[343] = 1952565288;
        ae.ckyy[344] = 1318199236;
        ae.ckyy[345] = 1598037894;
        ae.ckyy[346] = 1215690159;
        ae.ckyy[347] = -1136394681;
        ae.ckyy[348] = 1859583690;
        ae.ckyy[349] = 953068358;
        ae.ckyy[350] = 350870954;
        ae.ckyy[351] = 1902186644;
        ae.ckyy[352] = 1803696585;
        ae.ckyy[353] = -93263161;
        ae.ckyy[354] = -1792363609;
        ae.ckyy[355] = 2085280371;
        ae.ckyy[356] = 1269292280;
        ae.ckyy[357] = -428572560;
        ae.ckyy[358] = -632447813;
        ae.ckyy[359] = -314760203;
        ae.ckyy[360] = 347790944;
        ae.ckyy[361] = 1647025340;
        ae.ckyy[362] = -1192833311;
        ae.ckyy[363] = -2141134773;
        ae.ckyy[364] = 374888993;
        ae.ckyy[365] = -1628447365;
        ae.ckyy[366] = 1808125067;
        ae.ckyy[367] = 1892112093;
        ae.ckyy[368] = 1887475006;
        ae.ckyy[369] = 165521217;
        ae.ckyy[370] = 1538688145;
        ae.ckyy[371] = -1182964958;
        ae.ckyy[372] = 1644873386;
        ae.ckyy[373] = -2074869906;
        ae.ckyy[374] = 143435780;
        ae.ckyy[375] = -1867894932;
        ae.ckyy[376] = 897169300;
        ae.ckyy[377] = -206019439;
        ae.ckyy[378] = 1985546406;
        ae.ckyy[379] = -1452038398;
        ae.ckyy[380] = -1740305316;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setItemMinQuantityAndSave(String var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmev", clac(int ), (int)217)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ae.ckyz("cmew", ckys(int ), (int)269)) break;
            v0 /* !! */  = (long)ae.ckyz("cmex", ckys(int ), (int)270);
        }
        var6_3 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmez", clac(int ), (int)218)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ae.ckyz("cmfa", ckys(int ), (int)271)) break;
            v1 /* !! */  = (long)ae.ckyz("cmfb", ckys(int ), (int)272);
        }
        var5_4 /* !! */  = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl17
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cmfc", clac(int ), (int)219));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -419380938: {
                    break block29;
                }
                case 1491945800: {
                    v3 = ae.ckyz("cmfd", clac(int ), (int)220);
                    continue block29;
                }
                case 2000961903: {
                    v3 = ae.ckyz("cmfe", clac(int ), (int)221);
                    continue block29;
                }
            }
            break;
        }
        var4_5 = ae.a;
        if (var6_3) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl29
        v4 /* !! */  = ae.gb;
        if (true) ** GOTO lbl36
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - ae.ckyz("cmfg", clac(int ), (int)222));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1719952998: {
                    v5 = ae.ckyz("cmfh", clac(int ), (int)223);
                    continue block31;
                }
                case -419380938: {
                    break block31;
                }
                case 146543626: {
                    v5 = ae.ckyz("cmfi", clac(int ), (int)224);
                    continue block31;
                }
            }
            break;
        }
        var3_6 = this.getItemConfig(var1_1);
        if (var4_5 || var4_5) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmfj", clac(int ), (int)225)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ae.ckyz("cmfl", ckys(int ), (int)273)) break;
            v6 /* !! */  = (long)ae.ckyz("cmfm", ckys(int ), (int)274);
        }
        var3_6.setMinQuantity(var2_2);
        if (var4_5 || var4_5) ** GOTO lbl29
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = ae.gb;
                if (true) ** GOTO lbl61
                block33: while (true) {
                    v7 /* !! */  = (long)(v8 - ae.ckyz("cmfn", clac(int ), (int)226));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -419380938: {
                            break block33;
                        }
                        case -253396670: {
                            v8 = ae.ckyz("cmfp", clac(int ), (int)227);
                            continue block33;
                        }
                        case 297251347: {
                            v8 = ae.ckyz("cmfq", clac(int ), (int)228);
                            continue block33;
                        }
                    }
                    break;
                }
                this.save();
                if (var4_5 || var4_5) ** continue;
                return;
            }
            case 0: {
                do {
                    var5_4 /* !! */  = (int)ae.ckyz("cmfr", ckys(int ), (int)275);
                } while (!var6_3);
                throw null;
            }
lbl78:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfs", ckys(int ), (int)276);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl83:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfu", ckys(int ), (int)277);
                if (!var6_3) ** GOTO lbl78
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfv", ckys(int ), (int)278);
                if (!var6_3) break;
                throw null;
            }
lbl91:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfw", ckys(int ), (int)279);
                if (!var6_3) ** GOTO lbl83
                throw null;
            }
            case 5: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfx", ckys(int ), (int)280);
                if (!var6_3) ** GOTO lbl83
                throw null;
            }
lbl99:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ae.ckyz("cmfz", ckys(int ), (int)281);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 7: {
                var5_4 /* !! */  = (int)ae.ckyz("cmga", ckys(int ), (int)282);
                if (!var6_3) ** GOTO lbl91
                throw null;
            }
lbl108:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)ae.ckyz("cmgb", ckys(int ), (int)283);
                if (!var6_3) break;
                throw null;
            }
            case 9: 
        }
        do {
            var5_4 /* !! */  = (int)ae.ckyz("cmgc", ckys(int ), (int)284);
        } while (!var6_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setItemBuyBelowAndSave(String var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmcm", clac(int ), (int)199)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ae.ckyz("cmcn", ckys(int ), (int)239)) break;
            v0 /* !! */  = (long)ae.ckyz("cmco", ckys(int ), (int)240);
        }
        var6_3 = ae.c;
        v1 /* !! */  = ae.gb;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(ae.ckyz("cmcr", clac(int ), (int)201) - ae.ckyz("cmcp", clac(int ), (int)200));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -419380938: {
                    break block26;
                }
                case 1146140541: {
                    continue block26;
                }
            }
            break;
        }
        var5_4 /* !! */  = ae.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmcs", clac(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ae.ckyz("cmct", ckys(int ), (int)241)) break;
            v2 /* !! */  = (long)ae.ckyz("cmcu", ckys(int ), (int)242);
        }
        var4_5 = ae.a;
        if (var6_3) {
            throw null;
lbl27:
            // 4 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl27
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmcw", clac(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ae.ckyz("cmcx", ckys(int ), (int)243)) break;
                    v3 /* !! */  = (long)ae.ckyz("cmcy", ckys(int ), (int)244);
                }
                var3_6 = this.getItemConfig(var1_1);
                if (var4_5 || var4_5) ** GOTO lbl27
                v4 /* !! */  = ae.gb;
                if (true) ** GOTO lbl45
                block30: while (true) {
                    v4 /* !! */  = (long)(ae.ckyz("cmdb", clac(int ), (int)205) - ae.ckyz("cmcz", clac(int ), (int)204));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -419380938: {
                            break block30;
                        }
                        case 322150225: {
                            continue block30;
                        }
                    }
                    break;
                }
                var3_6.setBuyBelow(var2_2);
                if (var4_5 || var4_5) ** GOTO lbl27
                v5 /* !! */  = ae.gb;
                if (true) ** GOTO lbl56
                block31: while (true) {
                    v5 /* !! */  = (long)(v6 - ae.ckyz("cmdc", clac(int ), (int)206));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1120749034: {
                            v6 = ae.ckyz("cmdd", clac(int ), (int)207);
                            continue block31;
                        }
                        case -432336073: {
                            v6 = ae.ckyz("cmde", clac(int ), (int)208);
                            continue block31;
                        }
                        case -419380938: {
                            break block31;
                        }
                    }
                    break;
                }
                this.save();
                if (var4_5 || var4_5) ** continue;
                return;
            }
lbl68:
            // 3 sources

            case 0: {
                do {
                    var5_4 /* !! */  = (int)ae.ckyz("cmdg", ckys(int ), (int)245);
                } while (!var6_3);
                throw null;
            }
            case 1: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdh", ckys(int ), (int)246);
                if (!var6_3) ** GOTO lbl68
                throw null;
            }
            case 2: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdi", ckys(int ), (int)247);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl82:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ae.ckyz("cmdk", ckys(int ), (int)248);
                    if (!var6_3) ** GOTO lbl68
                    throw null;
                }
            }
lbl87:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdl", ckys(int ), (int)249);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl92:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdm", ckys(int ), (int)250);
                if (!var6_3) ** GOTO lbl82
                throw null;
            }
            case 6: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdn", ckys(int ), (int)251);
                if (!var6_3) ** GOTO lbl87
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdp", ckys(int ), (int)252);
                if (!var6_3) ** GOTO lbl82
                throw null;
            }
lbl104:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)ae.ckyz("cmdq", ckys(int ), (int)253);
                if (!var6_3) ** GOTO lbl92
                throw null;
            }
            case 9: 
        }
        var5_4 /* !! */  = (int)ae.ckyz("cmdr", ckys(int ), (int)254);
        ** while (!var6_3)
lbl111:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setItemMinQuantity(String var1_1, int var2_2) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(ae.ckyz("cmdu", clac(int ), (int)210) - ae.ckyz("cmdt", clac(int ), (int)209));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -529263455: {
                    continue block19;
                }
                case -419380938: {
                    break block19;
                }
            }
            break;
        }
        var6_3 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmdw", clac(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ae.ckyz("cmdx", ckys(int ), (int)255)) break;
            v1 /* !! */  = (long)ae.ckyz("cmdy", ckys(int ), (int)256);
        }
        var5_4 /* !! */  = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl21
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cmdz", clac(int ), (int)212));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -419380938: {
                    break block21;
                }
                case -93219902: {
                    v3 = ae.ckyz("cmea", clac(int ), (int)213);
                    continue block21;
                }
                case 61001322: {
                    v3 = ae.ckyz("cmeb", clac(int ), (int)214);
                    continue block21;
                }
            }
            break;
        }
        var4_5 = ae.a;
        if (var6_3) {
            throw null;
lbl33:
            // 4 sources

            return;
        }
        if (var4_5) ** GOTO lbl33
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmed", clac(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ae.ckyz("cmee", ckys(int ), (int)257)) break;
                    v4 /* !! */  = (long)ae.ckyz("cmef", ckys(int ), (int)258);
                }
                var3_6 = this.getItemConfig(var1_1);
                if (var4_5 || var4_5) ** GOTO lbl33
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmeh", clac(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ae.ckyz("cmei", ckys(int ), (int)259)) break;
                    v5 /* !! */  = (long)ae.ckyz("cmej", ckys(int ), (int)260);
                }
                var3_6.setMinQuantity(var2_2);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ae.ckyz("cmek", ckys(int ), (int)261);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl61:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)ae.ckyz("cmel", ckys(int ), (int)262);
                if (!var6_3) ** GOTO lbl56
                throw null;
            }
lbl65:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ae.ckyz("cmen", ckys(int ), (int)263);
                    if (!var6_3) ** GOTO lbl61
                    throw null;
                }
            }
            case 3: {
                var5_4 /* !! */  = (int)ae.ckyz("cmeo", ckys(int ), (int)264);
                if (!var6_3) ** GOTO lbl65
                throw null;
            }
lbl74:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)ae.ckyz("cmep", ckys(int ), (int)265);
                if (var6_3) {
                    throw null;
                }
            }
            case 5: {
                var5_4 /* !! */  = (int)ae.ckyz("cmeq", ckys(int ), (int)266);
                if (!var6_3) break;
                throw null;
            }
lbl82:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ae.ckyz("cmes", ckys(int ), (int)267);
                if (!var6_3) ** GOTO lbl74
                throw null;
            }
            case 7: 
        }
        var5_4 /* !! */  = (int)ae.ckyz("cmet", ckys(int ), (int)268);
        ** while (!var6_3)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getItemBuyBelow(String var1_1) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("cmhq", clac(int ), (int)242));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1618585802: {
                    v1 = ae.ckyz("cmhr", clac(int ), (int)243);
                    continue block16;
                }
                case -419380938: {
                    break block16;
                }
                case -397821158: {
                    v1 = ae.ckyz("cmhs", clac(int ), (int)244);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = ae.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmht", clac(int ), (int)245)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae.ckyz("cmhu", ckys(int ), (int)303)) break;
            v2 /* !! */  = (long)ae.ckyz("cmhv", ckys(int ), (int)304);
        }
        var3_3 /* !! */  = ae.b;
        v3 /* !! */  = ae.gb;
        if (true) ** GOTO lbl25
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - ae.ckyz("cmhw", clac(int ), (int)246));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -419380938: {
                    break block18;
                }
                case -414127636: {
                    v4 = ae.ckyz("cmhx", clac(int ), (int)247);
                    continue block18;
                }
                case 1205575849: {
                    v4 = ae.ckyz("cmhy", clac(int ), (int)248);
                    continue block18;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return (int)ae.ckyz("cmhz", ckys(int ), (int)305);
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmia", clac(int ), (int)249)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ae.ckyz("cmib", ckys(int ), (int)306)) break;
                    v5 /* !! */  = (long)ae.ckyz("cmic", ckys(int ), (int)307);
                }
                v6 = this.getItemConfig(var1_1);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmid", clac(int ), (int)250)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ae.ckyz("cmie", ckys(int ), (int)308)) break;
                    v7 /* !! */  = (long)ae.ckyz("cmig", ckys(int ), (int)309);
                }
                return v6.getBuyBelow();
            }
lbl56:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ae.ckyz("cmih", ckys(int ), (int)310);
                if (var4_2) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae.ckyz("cmij", ckys(int ), (int)311);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ae.ckyz("cmik", ckys(int ), (int)312);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ae.ckyz("cmil", ckys(int ), (int)313);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setItemConfig(String var1_1, ae$ItemConfig var2_2) {
        block41: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clvy", clac(int ), (int)135)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ae.ckyz("clvz", ckys(int ), (int)173)) break;
                v0 /* !! */  = (long)ae.ckyz("clwa", ckys(int ), (int)174);
            }
            var5_3 = ae.c;
            while (true) {
                block42: {
                    if ((v1 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("clwb", clac(int ), (int)136)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != ae.ckyz("clwd", ckys(int ), (int)175)) break block42;
                    var4_4 /* !! */  = ae.b;
                    v2 /* !! */  = ae.gb;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)ae.ckyz("clwe", ckys(int ), (int)176);
            }
            block25: while (true) {
                v2 /* !! */  = (long)(v3 - ae.ckyz("clwf", clac(int ), (int)137));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1265229426: {
                        v3 = ae.ckyz("clwg", clac(int ), (int)138);
                        continue block25;
                    }
                    case -419380938: {
                        break block25;
                    }
                    case 1917560906: {
                        v3 = ae.ckyz("clwh", clac(int ), (int)139);
                        continue block25;
                    }
                }
                break;
            }
            var3_5 = ae.a;
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block26: do {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_3) {
                            throw null;
                        }
                        if (var3_5 || var3_5) return;
                        v4 /* !! */  = ae.gb;
                        block27: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -419380938: {
                                    break block27;
                                }
                                case 130734641: {
                                    v4 /* !! */  = (long)(ae.ckyz("clwk", clac(int ), (int)141) - ae.ckyz("clwj", clac(int ), (int)140));
                                    continue block27;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = ae.gb;
                        block28: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1125601278: {
                                    v6 = ae.ckyz("clwn", clac(int ), (int)143);
                                    ** GOTO lbl57
                                }
                                case -419380938: {
                                    break block28;
                                }
                                case 930797053: {
                                    v6 = ae.ckyz("clwo", clac(int ), (int)144);
                                    ** GOTO lbl57
                                }
                                case 1202084344: {
                                    v6 = ae.ckyz("clwp", clac(int ), (int)145);
lbl57:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - ae.ckyz("clwl", clac(int ), (int)142));
                                    continue block28;
                                }
                            }
                            break;
                        }
                        v7 = this.data.getItems();
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = ae.gb - ae.ckyz("clwq", clac(int ), (int)146)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == ae.ckyz("clwr", ckys(int ), (int)177)) {
                                v7.put(var1_1, var2_2);
                                if (var3_5) return;
                                break;
                            }
                            v8 /* !! */  = (long)ae.ckyz("clws", ckys(int ), (int)178);
                        }
                        if (!var3_5) return;
                        return;
                    }
                    case 0: {
                        do {
                            var4_4 /* !! */  = (int)ae.ckyz("clwt", ckys(int ), (int)179);
                        } while (!var5_3);
                        throw null;
                    }
                    case 2: {
                        var4_4 /* !! */  = (int)ae.ckyz("clww", ckys(int ), (int)181);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_4 /* !! */  = (int)ae.ckyz("clwu", ckys(int ), (int)180);
                        if (var5_3) {
                            throw null;
                        }
                        break block41;
                    }
                    case 3: {
                        ** break;
                    }
                    case 5: {
                        break block41;
                    }
lbl88:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = (int)ae.ckyz("clwx", ckys(int ), (int)182);
                        cfr_temp_0 = 4;
                        if (!var5_3) continue block26;
                        throw null;
                    }
                    case 4: 
                }
                break;
            } while (true);
            var4_4 /* !! */  = (int)ae.ckyz("clwy", ckys(int ), (int)183);
            if (var5_3) {
                throw null;
            }
        }
        var4_4 /* !! */  = (int)ae.ckyz("clwz", ckys(int ), (int)184);
        ** while (!var5_3)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setGlobalEnabled(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("clrh", clac(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ae.ckyz("clri", ckys(int ), (int)129)) break;
            v0 /* !! */  = (long)ae.ckyz("clrj", ckys(int ), (int)130);
        }
        var4_2 = ae.c;
        v1 /* !! */  = ae.gb;
        if (true) ** GOTO lbl11
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - ae.ckyz("clrk", clac(int ), (int)87));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1696561929: {
                    v2 = ae.ckyz("clrl", clac(int ), (int)88);
                    continue block11;
                }
                case -959862523: {
                    v2 = ae.ckyz("clrn", clac(int ), (int)89);
                    continue block11;
                }
                case -419380938: {
                    break block11;
                }
            }
            break;
        }
        var3_3 = ae.b;
        v3 /* !! */  = ae.gb;
        if (true) ** GOTO lbl25
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - ae.ckyz("clro", clac(int ), (int)90));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -419380938: {
                    break block12;
                }
                case -170107238: {
                    v4 = ae.ckyz("clrq", clac(int ), (int)91);
                    continue block12;
                }
                case 1233409256: {
                    v4 = ae.ckyz("clrr", clac(int ), (int)92);
                    continue block12;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clrs", clac(int ), (int)93)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ae.ckyz("clrt", ckys(int ), (int)131)) break;
            v5 /* !! */  = (long)ae.ckyz("clru", ckys(int ), (int)132);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("clrv", clac(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ae.ckyz("clrw", ckys(int ), (int)133)) break;
            v6 /* !! */  = (long)ae.ckyz("clrx", ckys(int ), (int)134);
        }
        this.data.setGlobalEnabled(var1_1);
        ** while (var2_4 || var2_4)
lbl52:
        // 1 sources

    }

    private static /* synthetic */ void cmxs() {
        ae.claf[100] = 8154476753664802775L;
        ae.claf[101] = 5883967182087116903L;
        ae.claf[102] = 2187457065255267214L;
        ae.claf[103] = -4248486320940583809L;
        ae.claf[104] = 298931379774252561L;
        ae.claf[105] = -3890081403914025569L;
        ae.claf[106] = 9018051946666592001L;
        ae.claf[107] = -9193045695775173487L;
        ae.claf[108] = -8658281626490070651L;
        ae.claf[109] = -2685731451539573579L;
        ae.claf[110] = -7394231888951782380L;
        ae.claf[111] = 8736184073205113342L;
        ae.claf[112] = -7384132025549864038L;
        ae.claf[113] = 8742267849081596784L;
        ae.claf[114] = 6408762552372480977L;
        ae.claf[115] = -8752999752840795745L;
        ae.claf[116] = -8464348437910137026L;
        ae.claf[117] = -1434221151577974621L;
        ae.claf[118] = -4048557176991339283L;
        ae.claf[119] = 8332405487512897255L;
        ae.claf[120] = -554624199485854369L;
        ae.claf[121] = -3710201713419461312L;
        ae.claf[122] = 8491377928174856899L;
        ae.claf[123] = -2712114656247567667L;
        ae.claf[124] = -5701899237765690013L;
        ae.claf[125] = -3406682388582780436L;
        ae.claf[126] = -9096544963396946267L;
        ae.claf[127] = 5484881534360605710L;
        ae.claf[128] = -7972293012079350659L;
        ae.claf[129] = 4715332615642598638L;
        ae.claf[130] = -3866297749607989073L;
        ae.claf[131] = 1333716350666991547L;
        ae.claf[132] = -5037500666571099301L;
        ae.claf[133] = 7070416989939798273L;
        ae.claf[134] = -84099101603471979L;
        ae.claf[135] = 2074519488074795387L;
        ae.claf[136] = -7285001212039496377L;
        ae.claf[137] = -8773541281638211457L;
        ae.claf[138] = -4677215452382318916L;
        ae.claf[139] = 4877222476430230592L;
        ae.claf[140] = 7109383079958453199L;
        ae.claf[141] = 5205988720030296936L;
        ae.claf[142] = -244865264793162518L;
        ae.claf[143] = -3116920371559277684L;
        ae.claf[144] = -914198088519923690L;
        ae.claf[145] = 1994651156967639344L;
        ae.claf[146] = 6974776208474276440L;
        ae.claf[147] = -7292026363531511001L;
        ae.claf[148] = 1583717966147118497L;
        ae.claf[149] = -6686141932617537716L;
        ae.claf[150] = -4155416317339126077L;
        ae.claf[151] = -1423572739002618406L;
        ae.claf[152] = 3753576219619634925L;
        ae.claf[153] = 6870139085787450138L;
        ae.claf[154] = -8455626834289107205L;
        ae.claf[155] = -538586160931198193L;
        ae.claf[156] = 867475156243692985L;
        ae.claf[157] = -961868798258500119L;
        ae.claf[158] = -4490040099305324433L;
        ae.claf[159] = 1259493380306402684L;
        ae.claf[160] = -1762008004006878550L;
        ae.claf[161] = 7599515663971853501L;
        ae.claf[162] = 3340156124195448509L;
        ae.claf[163] = -2255638838823316835L;
        ae.claf[164] = -483919893433409798L;
        ae.claf[165] = 6370113059157594117L;
        ae.claf[166] = 9222802807119970139L;
        ae.claf[167] = -3209491088264141216L;
        ae.claf[168] = 3161568422298854002L;
        ae.claf[169] = -2737013546900601463L;
        ae.claf[170] = -7738112641932358128L;
        ae.claf[171] = -2686117985741018955L;
        ae.claf[172] = 1694623132638080836L;
        ae.claf[173] = -5208437441004978023L;
        ae.claf[174] = -676863760502893111L;
        ae.claf[175] = 8842224159039381129L;
        ae.claf[176] = -3216850922811190872L;
        ae.claf[177] = -5034304057432799683L;
        ae.claf[178] = -3656780689759599582L;
        ae.claf[179] = 3725480205420153825L;
        ae.claf[180] = 5058808175084624095L;
        ae.claf[181] = 2275123494114226385L;
        ae.claf[182] = 7206815225675038456L;
        ae.claf[183] = -6397900869224447126L;
        ae.claf[184] = 8308435024055901592L;
        ae.claf[185] = 6353708634912803566L;
        ae.claf[186] = -5660296218454551225L;
        ae.claf[187] = 2768147084085304803L;
        ae.claf[188] = 6020494860384249420L;
        ae.claf[189] = 6948564291684739080L;
        ae.claf[190] = 45594030554213656L;
        ae.claf[191] = 9027206097397796766L;
        ae.claf[192] = -7033430635015372314L;
        ae.claf[193] = -7090238821340574512L;
        ae.claf[194] = -2105563841668560533L;
        ae.claf[195] = 9139903465482059069L;
        ae.claf[196] = -2253073326522254218L;
        ae.claf[197] = 3082646505324069378L;
        ae.claf[198] = -4872675517951306625L;
        ae.claf[199] = -3291740246813808287L;
    }

    private static /* synthetic */ void cmxg() {
        ae.clad[300] = 740122310262783717L;
        ae.clad[301] = 1926205570783194905L;
        ae.clad[302] = -8146264689195912697L;
        ae.clad[303] = 910007822896815977L;
        ae.clad[304] = -4443261865176398904L;
        ae.clad[305] = -2113825723481046306L;
        ae.clad[306] = -1059974106582014744L;
        ae.clad[307] = -8592523493409630845L;
        ae.clad[308] = -6067903356901086270L;
        ae.clad[309] = 848383304608048391L;
        ae.clad[310] = 2059473219911114686L;
        ae.clad[311] = 2052726933435344570L;
        ae.clad[312] = -7634633160083517991L;
        ae.clad[313] = 2872436337244245155L;
        ae.clad[314] = -8441922373204454157L;
        ae.clad[315] = -1776331384459542668L;
        ae.clad[316] = 5092172685368735913L;
        ae.clad[317] = 2878665083775021867L;
        ae.clad[318] = 719675277257459737L;
        ae.clad[319] = -7254695063362946370L;
        ae.clad[320] = -5890460161582329988L;
        ae.clad[321] = 2809246155665584548L;
        ae.clad[322] = 3606116097840911480L;
        ae.clad[323] = 5954480889589115393L;
        ae.clad[324] = 4417856515269666366L;
        ae.clad[325] = 74070015343197728L;
        ae.clad[326] = -3454395572291615897L;
        ae.clad[327] = -4771500113882965422L;
        ae.clad[328] = 2042974667386809967L;
        ae.clad[329] = 2834797835437897659L;
    }

    private static /* synthetic */ void cmwx() {
        ae.clad[200] = 9003596287747895801L;
        ae.clad[201] = -1607607441584969124L;
        ae.clad[202] = 6827987168553325825L;
        ae.clad[203] = 1720603979012263003L;
        ae.clad[204] = 1512928328175992410L;
        ae.clad[205] = -2997718801079643285L;
        ae.clad[206] = -2273521649040251994L;
        ae.clad[207] = 6663075988810428052L;
        ae.clad[208] = 787594766816235467L;
        ae.clad[209] = 969901567804914005L;
        ae.clad[210] = -8756033595868438480L;
        ae.clad[211] = -6533076204008578303L;
        ae.clad[212] = 2672249269629934451L;
        ae.clad[213] = -3179411703470482736L;
        ae.clad[214] = 5722215601059002474L;
        ae.clad[215] = 718016853424949785L;
        ae.clad[216] = -6263898065896887218L;
        ae.clad[217] = -5970063898458821730L;
        ae.clad[218] = 439800297747712649L;
        ae.clad[219] = 8944641253970171565L;
        ae.clad[220] = 9036333574659435697L;
        ae.clad[221] = -2722986659324058687L;
        ae.clad[222] = 8768838468914419326L;
        ae.clad[223] = -5530967375894978214L;
        ae.clad[224] = 5435011201615204926L;
        ae.clad[225] = 6211672092377130197L;
        ae.clad[226] = -6019580741979435915L;
        ae.clad[227] = 1206183981657880442L;
        ae.clad[228] = 8814586145647191514L;
        ae.clad[229] = 5620361092994333689L;
        ae.clad[230] = -3066271631543302835L;
        ae.clad[231] = -8811219551872950724L;
        ae.clad[232] = 1981400774712841768L;
        ae.clad[233] = 4414333840613544696L;
        ae.clad[234] = -3161992345260740191L;
        ae.clad[235] = 4628244123135243477L;
        ae.clad[236] = -3641594480136658490L;
        ae.clad[237] = -8136134373763850963L;
        ae.clad[238] = -5646029133781926822L;
        ae.clad[239] = 26546145579503255L;
        ae.clad[240] = -756119844907385356L;
        ae.clad[241] = 964368695767395809L;
        ae.clad[242] = 7943591743682276991L;
        ae.clad[243] = 4840176340929928151L;
        ae.clad[244] = -9116427544498090921L;
        ae.clad[245] = 1073106047864421446L;
        ae.clad[246] = -754964501003829645L;
        ae.clad[247] = 140577993024873048L;
        ae.clad[248] = -7910250821122890925L;
        ae.clad[249] = -1236357700340792524L;
        ae.clad[250] = 5201961268143925886L;
        ae.clad[251] = 5152342089059440812L;
        ae.clad[252] = -2109946681989230588L;
        ae.clad[253] = 9063109677343832236L;
        ae.clad[254] = -7245263608604769143L;
        ae.clad[255] = -6945257787165846750L;
        ae.clad[256] = -6236090074884372471L;
        ae.clad[257] = -7527850174768403255L;
        ae.clad[258] = 7029616441667372246L;
        ae.clad[259] = 4201922733416323092L;
        ae.clad[260] = 8549616614696823777L;
        ae.clad[261] = -5708864703135283286L;
        ae.clad[262] = -2231003790768438045L;
        ae.clad[263] = 6738641236710352763L;
        ae.clad[264] = 6226323666278856861L;
        ae.clad[265] = 7008460049175440297L;
        ae.clad[266] = -989914824478902682L;
        ae.clad[267] = -5883548144960919084L;
        ae.clad[268] = -2114692187277083540L;
        ae.clad[269] = -2112589380786153959L;
        ae.clad[270] = -5972064229020793136L;
        ae.clad[271] = 794005778498333807L;
        ae.clad[272] = 3103714559336418573L;
        ae.clad[273] = -2626197429894084159L;
        ae.clad[274] = 1869319567570730371L;
        ae.clad[275] = 761616184524906386L;
        ae.clad[276] = -7725178708251356817L;
        ae.clad[277] = -855508895972725149L;
        ae.clad[278] = 1766262918875309671L;
        ae.clad[279] = -5377974963730384534L;
        ae.clad[280] = 4645201787278110220L;
        ae.clad[281] = 7506887329992027592L;
        ae.clad[282] = -5760830029367700252L;
        ae.clad[283] = -5681363939675475781L;
        ae.clad[284] = -7199087731157289583L;
        ae.clad[285] = 6746494568380101922L;
        ae.clad[286] = -4388554295035016992L;
        ae.clad[287] = -4943034951869047266L;
        ae.clad[288] = 8632320187044071596L;
        ae.clad[289] = 2817886081931509624L;
        ae.clad[290] = -7036446843188890059L;
        ae.clad[291] = 8536615213915024334L;
        ae.clad[292] = 5284186951894987047L;
        ae.clad[293] = 34926396464339288L;
        ae.clad[294] = 7951565603613848228L;
        ae.clad[295] = -8129198414644936304L;
        ae.clad[296] = 3624794142913414443L;
        ae.clad[297] = -7693801736884277760L;
        ae.clad[298] = 7577118466968380086L;
        ae.clad[299] = -4900877891573941718L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isItemEnabled(String var1_1) {
        block51: {
            v0 /* !! */  = ae.gb;
            if (true) ** GOTO lbl5
            block30: while (true) {
                v0 /* !! */  = (long)(v1 - ae.ckyz("cmgf", clac(int ), (int)229));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -419380938: {
                        break block30;
                    }
                    case -212658162: {
                        v1 = ae.ckyz("cmgg", clac(int ), (int)230);
                        continue block30;
                    }
                    case 605116484: {
                        v1 = ae.ckyz("cmgh", clac(int ), (int)231);
                        continue block30;
                    }
                    case 1811748725: {
                        v1 = ae.ckyz("cmgi", clac(int ), (int)232);
                        continue block30;
                    }
                }
                break;
            }
            var5_2 = ae.c;
            v2 /* !! */  = ae.gb;
            if (true) ** GOTO lbl22
            block31: while (true) {
                v2 /* !! */  = (long)(v3 - ae.ckyz("cmgj", clac(int ), (int)233));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1283505926: {
                        v3 = ae.ckyz("cmgl", clac(int ), (int)234);
                        continue block31;
                    }
                    case -419380938: {
                        break block31;
                    }
                    case 105381687: {
                        v3 = ae.ckyz("cmgm", clac(int ), (int)235);
                        continue block31;
                    }
                }
                break;
            }
            var4_3 /* !! */  = ae.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmgn", clac(int ), (int)236)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ae.ckyz("cmgo", ckys(int ), (int)285)) break;
                v4 /* !! */  = (long)ae.ckyz("cmgp", ckys(int ), (int)286);
            }
            var3_4 = ae.a;
            if (var5_2) {
                throw null;
lbl41:
                // 5 sources

                return (boolean)ae.ckyz("cmgr", ckys(int ), (int)287);
            }
            if (var3_4 || var3_4) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmgs", clac(int ), (int)237)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ae.ckyz("cmgt", ckys(int ), (int)288)) break;
                v5 /* !! */  = (long)ae.ckyz("cmgu", ckys(int ), (int)289);
            }
            var2_5 = this.getItemConfigOrNull(var1_1);
            if (var3_4 || var3_4) ** GOTO lbl41
            if (var2_5 == null) break block51;
            if (var3_4) ** GOTO lbl41
            v6 /* !! */  = ae.gb;
            if (true) ** GOTO lbl58
            block35: while (true) {
                v6 /* !! */  = (long)(v7 - ae.ckyz("cmgw", clac(int ), (int)238));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -419380938: {
                        break block35;
                    }
                    case 478657293: {
                        v7 = ae.ckyz("cmgx", clac(int ), (int)239);
                        continue block35;
                    }
                    case 1905341047: {
                        v7 = ae.ckyz("cmgy", clac(int ), (int)240);
                        continue block35;
                    }
                    case 2125588935: {
                        v7 = ae.ckyz("cmgz", clac(int ), (int)241);
                        continue block35;
                    }
                }
                break;
            }
            if (!var2_5.isEnabled()) break block51;
            if (var3_4) ** GOTO lbl41
            v8 = ae.ckyz("cmha", ckys(int ), (int)290);
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl83
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v8 = ae.ckyz("cmhc", ckys(int ), (int)291);
lbl83:
                // 2 sources

                return (boolean)v8;
            }
lbl84:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhd", ckys(int ), (int)292);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhe", ckys(int ), (int)293);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl94:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhf", ckys(int ), (int)294);
                if (!var5_2) ** GOTO lbl84
                throw null;
            }
lbl98:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ae.ckyz("cmhh", ckys(int ), (int)295);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl127
                    break;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhi", ckys(int ), (int)296);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 5: {
                do {
                    var4_3 /* !! */  = (int)ae.ckyz("cmhj", ckys(int ), (int)297);
                } while (!var5_2);
                throw null;
            }
lbl114:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhk", ckys(int ), (int)298);
                if (!var5_2) ** GOTO lbl89
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhm", ckys(int ), (int)299);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl123:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ae.ckyz("cmhn", ckys(int ), (int)300);
                if (!var5_2) ** GOTO lbl98
                throw null;
            }
lbl127:
            // 3 sources

            case 9: {
                var4_3 /* !! */  = (int)ae.ckyz("cmho", ckys(int ), (int)301);
                if (!var5_2) ** GOTO lbl123
                throw null;
            }
            case 10: 
        }
        var4_3 /* !! */  = (int)ae.ckyz("cmhp", ckys(int ), (int)302);
        ** while (!var5_2)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isGlobalEnabled() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = gb - ae.ckyz("clqh", clac(int ), (int)81)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ae.ckyz("clqi", ckys(int ), (int)114)) break;
            object = ae.ckyz("clqj", ckys(int ), (int)115);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = gb - ae.ckyz("clqk", clac(int ), (int)82)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ae.ckyz("clql", ckys(int ), (int)116)) break;
            object = ae.ckyz("clqn", ckys(int ), (int)117);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = gb - ae.ckyz("clqo", clac(int ), (int)83)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ae.ckyz("clqp", ckys(int ), (int)118)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ae.ckyz("clqq", ckys(int ), (int)119);
        }
        if (bl2) return (boolean)ae.ckyz("clqs", ckys(int ), (int)120);
        if (bl2) return (boolean)ae.ckyz("clqs", ckys(int ), (int)120);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = gb - ae.ckyz("clqt", clac(int ), (int)84)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == ae.ckyz("clqu", ckys(int ), (int)121)) break;
            object = ae.ckyz("clqw", ckys(int ), (int)122);
        }
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = gb - ae.ckyz("clqx", clac(int ), (int)85)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == ae.ckyz("clqy", ckys(int ), (int)123)) {
                return this.data.isGlobalEnabled();
            }
            object = ae.ckyz("clqz", ckys(int ), (int)124);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ItemConfig getItemConfigOrNull(String var1_1) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("cluw", clac(int ), (int)123));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -419380938: {
                    break block21;
                }
                case 96938326: {
                    v1 = ae.ckyz("clux", clac(int ), (int)124);
                    continue block21;
                }
                case 1718239313: {
                    v1 = ae.ckyz("cluy", clac(int ), (int)125);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = ae.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("clva", clac(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae.ckyz("clvb", ckys(int ), (int)163)) break;
            v2 /* !! */  = (long)ae.ckyz("clvc", ckys(int ), (int)164);
        }
        var3_3 /* !! */  = ae.b;
        v3 /* !! */  = ae.gb;
        if (true) ** GOTO lbl25
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - ae.ckyz("clvd", clac(int ), (int)127));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1567402359: {
                    v4 = ae.ckyz("clve", clac(int ), (int)128);
                    continue block23;
                }
                case -1153921823: {
                    v4 = ae.ckyz("clvg", clac(int ), (int)129);
                    continue block23;
                }
                case -419380938: {
                    break block23;
                }
                case 472229647: {
                    v4 = ae.ckyz("clvh", clac(int ), (int)130);
                    continue block23;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v5 /* !! */  = ae.gb;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v5 /* !! */  = (long)(ae.ckyz("clvk", clac(int ), (int)132) - ae.ckyz("clvi", clac(int ), (int)131));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -419380938: {
                            break block25;
                        }
                        case -158424289: {
                            continue block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clvl", clac(int ), (int)133)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ae.ckyz("clvm", ckys(int ), (int)165)) break;
                    v6 /* !! */  = (long)ae.ckyz("clvn", ckys(int ), (int)166);
                }
                v7 = this.data.getItems();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("clvp", clac(int ), (int)134)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ae.ckyz("clvq", ckys(int ), (int)167)) break;
                    v8 /* !! */  = (long)ae.ckyz("clvr", ckys(int ), (int)168);
                }
                return v7.get(var1_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae.ckyz("clvs", ckys(int ), (int)169);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ae.ckyz("clvu", ckys(int ), (int)170);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ae.ckyz("clvv", ckys(int ), (int)171);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ae.ckyz("clvw", ckys(int ), (int)172);
        ** while (!var4_2)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getItemMinQuantity(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmim", clac(int ), (int)251)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ae.ckyz("cmin", ckys(int ), (int)314)) break;
            v0 /* !! */  = (long)ae.ckyz("cmio", ckys(int ), (int)315);
        }
        var4_2 = ae.c;
        v1 /* !! */  = ae.gb;
        if (true) ** GOTO lbl12
        block28: while (true) {
            v1 /* !! */  = (long)(ae.ckyz("cmir", clac(int ), (int)253) - ae.ckyz("cmip", clac(int ), (int)252));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -419380938: {
                    break block28;
                }
                case 1310934486: {
                    continue block28;
                }
            }
            break;
        }
        var3_3 /* !! */  = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cmit", clac(int ), (int)254));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1042277606: {
                    v3 = ae.ckyz("cmiu", clac(int ), (int)255);
                    continue block29;
                }
                case -419380938: {
                    break block29;
                }
                case 303728300: {
                    v3 = ae.ckyz("cmiw", clac(int ), (int)256);
                    continue block29;
                }
                case 2117545394: {
                    v3 = ae.ckyz("cmiy", clac(int ), (int)257);
                    continue block29;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (int)ae.ckyz("cmiz", ckys(int ), (int)316);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = ae.gb;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - ae.ckyz("cmjc", clac(int ), (int)258));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1276172484: {
                            v5 = ae.ckyz("cmjd", clac(int ), (int)259);
                            continue block31;
                        }
                        case -419380938: {
                            break block31;
                        }
                        case 754318543: {
                            v5 = ae.ckyz("cmjf", clac(int ), (int)260);
                            continue block31;
                        }
                        case 985704844: {
                            v5 = ae.ckyz("cmjg", clac(int ), (int)261);
                            continue block31;
                        }
                    }
                    break;
                }
                v6 = this.getItemConfig(var1_1);
                v7 /* !! */  = ae.gb;
                if (true) ** GOTO lbl64
                block32: while (true) {
                    v7 /* !! */  = (long)(v8 - ae.ckyz("cmji", clac(int ), (int)262));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1136601283: {
                            v8 = ae.ckyz("cmjk", clac(int ), (int)263);
                            continue block32;
                        }
                        case -869195399: {
                            v8 = ae.ckyz("cmjl", clac(int ), (int)264);
                            continue block32;
                        }
                        case -419380938: {
                            break block32;
                        }
                    }
                    break;
                }
                return v6.getMinQuantity();
            }
lbl74:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ae.ckyz("cmjn", ckys(int ), (int)317);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl79:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ae.ckyz("cmjp", ckys(int ), (int)318);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ae.ckyz("cmjr", ckys(int ), (int)319);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ae.ckyz("cmjt", ckys(int ), (int)320);
        ** while (!var4_2)
lbl90:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cmwf() {
        ae.clad[0] = 5531416125961931160L;
        ae.clad[1] = -9120620699382855619L;
        ae.clad[2] = -8515707680973703255L;
        ae.clad[3] = -2105357986073541893L;
        ae.clad[4] = -3736756939085407894L;
        ae.clad[5] = 7668520373563858046L;
        ae.clad[6] = 3639771601496691159L;
        ae.clad[7] = 7353602779807998846L;
        ae.clad[8] = 8179269377891510183L;
        ae.clad[9] = 7168806168920124148L;
        ae.clad[10] = -3246804260502386329L;
        ae.clad[11] = -7601879685648969959L;
        ae.clad[12] = -4520401914857268536L;
        ae.clad[13] = 4368886823771445902L;
        ae.clad[14] = -1240781727305442826L;
        ae.clad[15] = 1010623591093796172L;
        ae.clad[16] = 872276733009285874L;
        ae.clad[17] = -394657493246116703L;
        ae.clad[18] = 1704459397881557494L;
        ae.clad[19] = -2214282350354771405L;
        ae.clad[20] = -8900781229248802606L;
        ae.clad[21] = 8327224361644436546L;
        ae.clad[22] = 5816099568705408367L;
        ae.clad[23] = 1980914646603903985L;
        ae.clad[24] = -3903334661300161483L;
        ae.clad[25] = 7192894279181863581L;
        ae.clad[26] = -5617086726580786505L;
        ae.clad[27] = 4688178868084435304L;
        ae.clad[28] = -5179456477044695472L;
        ae.clad[29] = 8090701243571392342L;
        ae.clad[30] = -520558412301938273L;
        ae.clad[31] = -8790516068339371905L;
        ae.clad[32] = 7294256983656910740L;
        ae.clad[33] = 1390182885796532273L;
        ae.clad[34] = -1197260243133645920L;
        ae.clad[35] = 248470983787497242L;
        ae.clad[36] = 5103511864884805800L;
        ae.clad[37] = -3233267585234902376L;
        ae.clad[38] = 3595478651577108508L;
        ae.clad[39] = -5576260023668673876L;
        ae.clad[40] = 5280140684523393323L;
        ae.clad[41] = -3607495512089913535L;
        ae.clad[42] = 2221623293016294077L;
        ae.clad[43] = 4600945265388489086L;
        ae.clad[44] = 9100046837464033180L;
        ae.clad[45] = -500672178012899256L;
        ae.clad[46] = 9007581565055668233L;
        ae.clad[47] = 4221546896043864966L;
        ae.clad[48] = -8476250668153385443L;
        ae.clad[49] = -5410932432502936362L;
        ae.clad[50] = 3729521854547954659L;
        ae.clad[51] = 7068704157614698199L;
        ae.clad[52] = -8324720780408655445L;
        ae.clad[53] = -7073094456386578940L;
        ae.clad[54] = 1682374078740872633L;
        ae.clad[55] = 4614370708802734899L;
        ae.clad[56] = -3371299760215112292L;
        ae.clad[57] = 1564955708571361922L;
        ae.clad[58] = -2076530165133963403L;
        ae.clad[59] = 2034294980812308610L;
        ae.clad[60] = 6314267231214112075L;
        ae.clad[61] = 7989534501269676144L;
        ae.clad[62] = -4557914861429444771L;
        ae.clad[63] = 1277423651314015664L;
        ae.clad[64] = -4249052938598861016L;
        ae.clad[65] = 5918174737314876306L;
        ae.clad[66] = -217275634765040495L;
        ae.clad[67] = -4931943452007958175L;
        ae.clad[68] = -5160533884098385760L;
        ae.clad[69] = -8234918910704537413L;
        ae.clad[70] = -2725185880778335316L;
        ae.clad[71] = 4260690037746251741L;
        ae.clad[72] = 6308127512385097355L;
        ae.clad[73] = 5986341542062284452L;
        ae.clad[74] = 4516327055971376773L;
        ae.clad[75] = -4846141187223882311L;
        ae.clad[76] = -7425738912408766235L;
        ae.clad[77] = 177519336887805929L;
        ae.clad[78] = -289673094378813442L;
        ae.clad[79] = 7031527934547809096L;
        ae.clad[80] = 564839425178004750L;
        ae.clad[81] = -8654360304734658084L;
        ae.clad[82] = 2604775515039466733L;
        ae.clad[83] = -4530028283890764865L;
        ae.clad[84] = -4060246411090169223L;
        ae.clad[85] = 3153634816062918766L;
        ae.clad[86] = -6717647837343382310L;
        ae.clad[87] = -3517419478895769514L;
        ae.clad[88] = 7882336588107184458L;
        ae.clad[89] = 527027522291309794L;
        ae.clad[90] = -6524677413464089642L;
        ae.clad[91] = -7066037354487030472L;
        ae.clad[92] = -726860762578012030L;
        ae.clad[93] = 3917882739682222127L;
        ae.clad[94] = 5739091540370646327L;
        ae.clad[95] = 2819956648437977729L;
        ae.clad[96] = -280241130930752061L;
        ae.clad[97] = 8727606003477385591L;
        ae.clad[98] = -1655142992791327189L;
        ae.clad[99] = -3809955995197808193L;
    }

    private static /* synthetic */ void cmxx() {
        ae.claf[200] = -6701882673833099969L;
        ae.claf[201] = -46605180312972250L;
        ae.claf[202] = -7432836911034528295L;
        ae.claf[203] = 6379543080865446419L;
        ae.claf[204] = -45081274360655829L;
        ae.claf[205] = -6616215916388155177L;
        ae.claf[206] = -8250845886696036923L;
        ae.claf[207] = 7256072126463014896L;
        ae.claf[208] = -1723551163525685949L;
        ae.claf[209] = -8164210139173414676L;
        ae.claf[210] = 5806807713684064866L;
        ae.claf[211] = -7899490525812826343L;
        ae.claf[212] = 7929938986040435753L;
        ae.claf[213] = -6516917776016744831L;
        ae.claf[214] = 1490796404921943250L;
        ae.claf[215] = 1205959468452084271L;
        ae.claf[216] = 2602056134025696609L;
        ae.claf[217] = -3667138417312312760L;
        ae.claf[218] = 8617844596247143954L;
        ae.claf[219] = -5137000453043474391L;
        ae.claf[220] = -7932806026711836524L;
        ae.claf[221] = -2127730105990468932L;
        ae.claf[222] = 2604179669963559379L;
        ae.claf[223] = -6667892452432955471L;
        ae.claf[224] = 6210993330658763151L;
        ae.claf[225] = 1926013308937264346L;
        ae.claf[226] = 1773759364004122470L;
        ae.claf[227] = 4003716945418970730L;
        ae.claf[228] = -1326977775648734567L;
        ae.claf[229] = 8701813066373227434L;
        ae.claf[230] = 6409423296269368381L;
        ae.claf[231] = -4120720376895751107L;
        ae.claf[232] = -3417133271760764265L;
        ae.claf[233] = 5278331070418925318L;
        ae.claf[234] = -6335068471390295069L;
        ae.claf[235] = 9054586917389024898L;
        ae.claf[236] = 579992266785338547L;
        ae.claf[237] = -4935978412638222353L;
        ae.claf[238] = 3115798154443187934L;
        ae.claf[239] = -8033817704596672245L;
        ae.claf[240] = 2470832385975034575L;
        ae.claf[241] = 6697092808699859322L;
        ae.claf[242] = 6845524039772954242L;
        ae.claf[243] = 3560228063177986796L;
        ae.claf[244] = -158380414924389133L;
        ae.claf[245] = -2896415212375369408L;
        ae.claf[246] = -1488572195350890124L;
        ae.claf[247] = 4785307905604216009L;
        ae.claf[248] = 830956464374850817L;
        ae.claf[249] = 8826698375397782889L;
        ae.claf[250] = -1904275084190452172L;
        ae.claf[251] = -3890487992798384553L;
        ae.claf[252] = 7160253925280861831L;
        ae.claf[253] = -261233306584284751L;
        ae.claf[254] = 3866878394390909136L;
        ae.claf[255] = 811953846434039054L;
        ae.claf[256] = -179144536207310939L;
        ae.claf[257] = 8288779199291970770L;
        ae.claf[258] = 138881974781359334L;
        ae.claf[259] = -2570992979196620169L;
        ae.claf[260] = 1121304675009964257L;
        ae.claf[261] = -4628898978808750607L;
        ae.claf[262] = -7320247861270175818L;
        ae.claf[263] = -8925393316904985614L;
        ae.claf[264] = -8440026463296829057L;
        ae.claf[265] = -6646886174098330070L;
        ae.claf[266] = 2739118139517313331L;
        ae.claf[267] = -7346074079055483250L;
        ae.claf[268] = -5207780728382338749L;
        ae.claf[269] = -4067557451860038226L;
        ae.claf[270] = 8509557367246747791L;
        ae.claf[271] = 3450819171302336064L;
        ae.claf[272] = 1795064859420928242L;
        ae.claf[273] = 8129602219001426626L;
        ae.claf[274] = 3602107173795740598L;
        ae.claf[275] = 8189182507008810788L;
        ae.claf[276] = -8391038041981966368L;
        ae.claf[277] = 5712239667720735950L;
        ae.claf[278] = 2925487343429193520L;
        ae.claf[279] = -5807665521490802047L;
        ae.claf[280] = 1145305525932601097L;
        ae.claf[281] = -7932124168870125661L;
        ae.claf[282] = -4080436812286019290L;
        ae.claf[283] = -2656329420828266552L;
        ae.claf[284] = -654869743120173770L;
        ae.claf[285] = 4420024827668678130L;
        ae.claf[286] = -3777366362326881949L;
        ae.claf[287] = -9127213018995442088L;
        ae.claf[288] = -1584526710907179589L;
        ae.claf[289] = -8480623089990185651L;
        ae.claf[290] = -3243428000241362072L;
        ae.claf[291] = -3926945997301060388L;
        ae.claf[292] = -2530031544178332143L;
        ae.claf[293] = -5102859377336987642L;
        ae.claf[294] = -2429936655269589216L;
        ae.claf[295] = 8547839629831211808L;
        ae.claf[296] = 4011858876386054601L;
        ae.claf[297] = -819201997567834695L;
        ae.claf[298] = 208327454024412132L;
        ae.claf[299] = -7437116328190441731L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setItemEnabled(String var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("clyr", clac(int ), (int)165)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ae.ckyz("clyt", ckys(int ), (int)197)) break;
            v0 /* !! */  = (long)ae.ckyz("clyu", ckys(int ), (int)198);
        }
        var6_3 = ae.c;
        v1 /* !! */  = ae.gb;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - ae.ckyz("clyv", clac(int ), (int)166));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1024480308: {
                    v2 = ae.ckyz("clyw", clac(int ), (int)167);
                    continue block26;
                }
                case -419380938: {
                    break block26;
                }
                case 823458668: {
                    v2 = ae.ckyz("clyx", clac(int ), (int)168);
                    continue block26;
                }
            }
            break;
        }
        var5_4 /* !! */  = ae.b;
        v3 /* !! */  = ae.gb;
        if (true) ** GOTO lbl26
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - ae.ckyz("clyz", clac(int ), (int)169));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -419380938: {
                    break block27;
                }
                case 807499804: {
                    v4 = ae.ckyz("clza", clac(int ), (int)170);
                    continue block27;
                }
                case 1619228816: {
                    v4 = ae.ckyz("clzb", clac(int ), (int)171);
                    continue block27;
                }
            }
            break;
        }
        var4_5 = ae.a;
        if (var6_3) {
            throw null;
lbl38:
            // 4 sources

            return;
        }
        if (var4_5) ** GOTO lbl38
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl38
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clzd", clac(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ae.ckyz("clze", ckys(int ), (int)199)) break;
                    v5 /* !! */  = (long)ae.ckyz("clzf", ckys(int ), (int)200);
                }
                var3_6 = this.getItemConfig(var1_1);
                if (var4_5 || var4_5) ** GOTO lbl38
                v6 /* !! */  = ae.gb;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - ae.ckyz("clzg", clac(int ), (int)173));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1894168428: {
                            v7 = ae.ckyz("clzi", clac(int ), (int)174);
                            continue block30;
                        }
                        case -419380938: {
                            break block30;
                        }
                        case 905537469: {
                            v7 = ae.ckyz("clzj", clac(int ), (int)175);
                            continue block30;
                        }
                    }
                    break;
                }
                var3_6.setEnabled(var2_2);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)ae.ckyz("clzk", ckys(int ), (int)201);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl75:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)ae.ckyz("clzl", ckys(int ), (int)202);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 2: {
                var5_4 /* !! */  = (int)ae.ckyz("clzn", ckys(int ), (int)203);
                if (!var6_3) ** GOTO lbl75
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)ae.ckyz("clzo", ckys(int ), (int)204);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl89:
            // 4 sources

            case 4: {
                var5_4 /* !! */  = (int)ae.ckyz("clzp", ckys(int ), (int)205);
                if (var6_3) {
                    throw null;
                }
            }
lbl93:
            // 4 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ae.ckyz("clzq", ckys(int ), (int)206);
                    if (!var6_3) ** GOTO lbl89
                    throw null;
                }
            }
lbl98:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ae.ckyz("clzs", ckys(int ), (int)207);
                if (!var6_3) ** GOTO lbl89
                throw null;
            }
            case 7: 
        }
        var5_4 /* !! */  = (int)ae.ckyz("clzt", ckys(int ), (int)208);
        ** while (!var6_3)
lbl105:
        // 1 sources

        throw null;
    }

    static {
        ckyv = new int[381];
        ckyy = new int[381];
        ae.cmuq();
        ae.cmva();
        ae.cmvj();
        ae.cmvo();
        ae.cmvp();
        ae.cmvq();
        ae.cmvs();
        ae.cmvx();
        clad = new long[330];
        claf = new long[330];
        ae.cmwf();
        ae.cmwp();
        ae.cmwx();
        ae.cmxg();
        ae.cmxl();
        ae.cmxs();
        ae.cmxx();
        ae.cmyc();
    }

    private static /* synthetic */ int ckys(int n2) {
        return ckyv[n2] ^ ckyy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setItemConfigAndSave(String var1_1, ae$ItemConfig var2_2) {
        v0 /* !! */  = ae.gb;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - ae.ckyz("clxc", clac(int ), (int)147));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1947216702: {
                    v1 = ae.ckyz("clxd", clac(int ), (int)148);
                    continue block36;
                }
                case -612652116: {
                    v1 = ae.ckyz("clxe", clac(int ), (int)149);
                    continue block36;
                }
                case -419380938: {
                    break block36;
                }
                case 565364261: {
                    v1 = ae.ckyz("clxg", clac(int ), (int)150);
                    continue block36;
                }
            }
            break;
        }
        var5_3 = ae.c;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("clxh", clac(int ), (int)151));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -419380938: {
                    break block37;
                }
                case 751789797: {
                    v3 = ae.ckyz("clxi", clac(int ), (int)152);
                    continue block37;
                }
                case 1118004407: {
                    v3 = ae.ckyz("clxj", clac(int ), (int)153);
                    continue block37;
                }
            }
            break;
        }
        var4_4 /* !! */  = ae.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("clxk", clac(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ae.ckyz("clxm", ckys(int ), (int)185)) break;
            v4 /* !! */  = (long)ae.ckyz("clxn", ckys(int ), (int)186);
        }
        var3_5 = ae.a;
        if (var5_3) {
            throw null;
lbl40:
            // 4 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl40
        v5 /* !! */  = ae.gb;
        if (true) ** GOTO lbl47
        block40: while (true) {
            v5 /* !! */  = (long)(v6 - ae.ckyz("clxo", clac(int ), (int)155));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1543554557: {
                    v6 = ae.ckyz("clxp", clac(int ), (int)156);
                    continue block40;
                }
                case -1134417365: {
                    v6 = ae.ckyz("clxr", clac(int ), (int)157);
                    continue block40;
                }
                case -419380938: {
                    break block40;
                }
                case 537862621: {
                    v6 = ae.ckyz("clxs", clac(int ), (int)158);
                    continue block40;
                }
            }
            break;
        }
        v7 /* !! */  = ae.gb;
        if (true) ** GOTO lbl63
        block41: while (true) {
            v7 /* !! */  = (long)(ae.ckyz("clxu", clac(int ), (int)160) - ae.ckyz("clxt", clac(int ), (int)159));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -419380938: {
                    break block41;
                }
                case 369020450: {
                    continue block41;
                }
            }
            break;
        }
        v8 = this.data.getItems();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clxw", clac(int ), (int)161)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ae.ckyz("clxx", ckys(int ), (int)187)) break;
            v9 /* !! */  = (long)ae.ckyz("clxy", ckys(int ), (int)188);
        }
        v8.put(var1_1, var2_2);
        if (var3_5) ** GOTO lbl40
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block21 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl40
                v10 /* !! */  = ae.gb;
                if (true) ** GOTO lbl84
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - ae.ckyz("clya", clac(int ), (int)162));
lbl84:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -419380938: {
                            break block43;
                        }
                        case 475133796: {
                            v11 = ae.ckyz("clyb", clac(int ), (int)163);
                            continue block43;
                        }
                        case 2034695572: {
                            v11 = ae.ckyz("clyc", clac(int ), (int)164);
                            continue block43;
                        }
                    }
                    break;
                }
                this.save();
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)ae.ckyz("clyd", ckys(int ), (int)189);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl102:
            // 3 sources

            case 1: {
                var4_4 /* !! */  = (int)ae.ckyz("clyf", ckys(int ), (int)190);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 2: {
                do {
                    var4_4 /* !! */  = (int)ae.ckyz("clyg", ckys(int ), (int)191);
                } while (!var5_3);
                throw null;
            }
lbl112:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ae.ckyz("clyk", ckys(int ), (int)192);
                    if (!var5_3) break block21;
                    throw null;
                }
            }
lbl117:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)ae.ckyz("clyl", ckys(int ), (int)193);
                if (!var5_3) ** GOTO lbl102
                throw null;
            }
            case 5: {
                do {
                    var4_4 /* !! */  = (int)ae.ckyz("clym", ckys(int ), (int)194);
                } while (!var5_3);
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)ae.ckyz("clyo", ckys(int ), (int)195);
                if (!var5_3) ** GOTO lbl102
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)ae.ckyz("clyp", ckys(int ), (int)196);
        ** while (!var5_3)
lbl133:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasItemConfig(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("cmjz", clac(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ae.ckyz("cmkb", ckys(int ), (int)321)) break;
            v0 /* !! */  = (long)ae.ckyz("cmkc", ckys(int ), (int)322);
        }
        var4_2 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("cmke", clac(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ae.ckyz("cmkf", ckys(int ), (int)323)) break;
            v1 /* !! */  = (long)ae.ckyz("cmkg", ckys(int ), (int)324);
        }
        var3_3 /* !! */  = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl19
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("cmkh", clac(int ), (int)267));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -627328286: {
                    v3 = ae.ckyz("cmkj", clac(int ), (int)268);
                    continue block28;
                }
                case -419380938: {
                    break block28;
                }
                case 247112239: {
                    v3 = ae.ckyz("cmkk", clac(int ), (int)269);
                    continue block28;
                }
                case 1491978945: {
                    v3 = ae.ckyz("cmkm", clac(int ), (int)270);
                    continue block28;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
            return (boolean)ae.ckyz("cmkn", ckys(int ), (int)325);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = ae.gb;
                if (true) ** GOTO lbl44
                block30: while (true) {
                    v4 /* !! */  = (long)(ae.ckyz("cmks", clac(int ), (int)272) - ae.ckyz("cmkq", clac(int ), (int)271));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -419380938: {
                            break block30;
                        }
                        case 845462882: {
                            continue block30;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ae.gb;
                if (true) ** GOTO lbl53
                block31: while (true) {
                    v5 /* !! */  = (long)(ae.ckyz("cmkv", clac(int ), (int)274) - ae.ckyz("cmkt", clac(int ), (int)273));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1879398087: {
                            continue block31;
                        }
                        case -419380938: {
                            break block31;
                        }
                    }
                    break;
                }
                v6 = this.data.getItems();
                v7 /* !! */  = ae.gb;
                if (true) ** GOTO lbl63
                block32: while (true) {
                    v7 /* !! */  = (long)(v8 - ae.ckyz("cmkx", clac(int ), (int)275));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -490201261: {
                            v8 = ae.ckyz("cmky", clac(int ), (int)276);
                            continue block32;
                        }
                        case -419380938: {
                            break block32;
                        }
                        case 1368814626: {
                            v8 = ae.ckyz("cmkz", clac(int ), (int)277);
                            continue block32;
                        }
                        case 1702411331: {
                            v8 = ae.ckyz("cmlb", clac(int ), (int)278);
                            continue block32;
                        }
                    }
                    break;
                }
                return v6.containsKey(var1_1);
            }
lbl76:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ae.ckyz("cmld", ckys(int ), (int)326);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ae.ckyz("cmle", ckys(int ), (int)327);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ae.ckyz("cmlg", ckys(int ), (int)328);
                if (!var4_2) ** GOTO lbl76
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ae.ckyz("cmli", ckys(int ), (int)329);
        ** while (!var4_2)
lbl92:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setGlobalEnabledAndSave(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ae.gb - ae.ckyz("clsh", clac(int ), (int)95)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ae.ckyz("clsj", ckys(int ), (int)141)) break;
            v0 /* !! */  = (long)ae.ckyz("clsk", ckys(int ), (int)142);
        }
        var4_2 = ae.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clsm", clac(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ae.ckyz("clso", ckys(int ), (int)143)) break;
            v1 /* !! */  = (long)ae.ckyz("clsp", ckys(int ), (int)144);
        }
        var3_3 = ae.b;
        v2 /* !! */  = ae.gb;
        if (true) ** GOTO lbl17
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - ae.ckyz("clsq", clac(int ), (int)97));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -419380938: {
                    break block16;
                }
                case -138151433: {
                    v3 = ae.ckyz("clsr", clac(int ), (int)98);
                    continue block16;
                }
                case 633168849: {
                    v3 = ae.ckyz("clst", clac(int ), (int)99);
                    continue block16;
                }
            }
            break;
        }
        var2_4 = ae.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        v4 /* !! */  = ae.gb;
        if (true) ** GOTO lbl36
        block18: while (true) {
            v4 /* !! */  = (long)(ae.ckyz("clsv", clac(int ), (int)101) - ae.ckyz("clsu", clac(int ), (int)100));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -541691673: {
                    continue block18;
                }
                case -419380938: {
                    break block18;
                }
            }
            break;
        }
        v5 /* !! */  = ae.gb;
        if (true) ** GOTO lbl45
        block19: while (true) {
            v5 /* !! */  = (long)(v6 - ae.ckyz("clsx", clac(int ), (int)102));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1206993818: {
                    v6 = ae.ckyz("clsy", clac(int ), (int)103);
                    continue block19;
                }
                case -419380938: {
                    break block19;
                }
                case 785650571: {
                    v6 = ae.ckyz("clsz", clac(int ), (int)104);
                    continue block19;
                }
            }
            break;
        }
        this.data.setGlobalEnabled(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cltb", clac(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ae.ckyz("cltc", ckys(int ), (int)145)) break;
            v7 /* !! */  = (long)ae.ckyz("cltd", ckys(int ), (int)146);
        }
        this.save();
        ** while (var2_4 || var2_4)
lbl63:
        // 1 sources

    }

    private static /* synthetic */ void cmyc() {
        ae.claf[300] = -7148220459074001619L;
        ae.claf[301] = -8011389626181627240L;
        ae.claf[302] = -3155876127391549108L;
        ae.claf[303] = 185040247482138182L;
        ae.claf[304] = 2572597500774720685L;
        ae.claf[305] = -5322079287265313916L;
        ae.claf[306] = -6277202836403722416L;
        ae.claf[307] = 8501656848754821258L;
        ae.claf[308] = -5185246241696243491L;
        ae.claf[309] = -2519679986889343881L;
        ae.claf[310] = 8506257207358904827L;
        ae.claf[311] = -6104131215787089202L;
        ae.claf[312] = -6779701680158175444L;
        ae.claf[313] = -710132212713199093L;
        ae.claf[314] = -7445482000371333389L;
        ae.claf[315] = -914091035986869150L;
        ae.claf[316] = 7310886628653368600L;
        ae.claf[317] = -2012948348440910419L;
        ae.claf[318] = 4104038776286974688L;
        ae.claf[319] = -8352608343955044140L;
        ae.claf[320] = -6351092545449676602L;
        ae.claf[321] = -2898811977597394410L;
        ae.claf[322] = -6236513019555587303L;
        ae.claf[323] = -7919788057423606679L;
        ae.claf[324] = 6558897557922613794L;
        ae.claf[325] = -6911321258446653825L;
        ae.claf[326] = 8642204773973122352L;
        ae.claf[327] = -6030917930060722555L;
        ae.claf[328] = -1333004844910886791L;
        ae.claf[329] = 2444254872037477329L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setItemEnabledAndSave(String var1_1, boolean var2_2) {
        block53: {
            block54: {
                v0 /* !! */  = ae.gb;
                if (true) ** GOTO lbl5
                block33: while (true) {
                    v0 /* !! */  = (long)(v1 - ae.ckyz("clzv", clac(int ), (int)176));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -674575814: {
                            v1 = ae.ckyz("clzx", clac(int ), (int)177);
                            continue block33;
                        }
                        case -419380938: {
                            break block33;
                        }
                        case 266151709: {
                            v1 = ae.ckyz("clzy", clac(int ), (int)178);
                            continue block33;
                        }
                    }
                    break;
                }
                var6_3 = ae.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ae.gb - ae.ckyz("clzz", clac(int ), (int)179)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ae.ckyz("cmaa", ckys(int ), (int)209)) break;
                    v2 /* !! */  = (long)ae.ckyz("cmab", ckys(int ), (int)210);
                }
                var5_4 /* !! */  = ae.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ae.gb - ae.ckyz("cmad", clac(int ), (int)180)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ae.ckyz("cmae", ckys(int ), (int)211)) {
                        var4_5 = ae.a;
                        if (var6_3) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)ae.ckyz("cmaf", ckys(int ), (int)212);
                }
                if (var4_5 || var4_5) break block54;
                v4 /* !! */  = ae.gb;
                if (true) ** GOTO lbl87
            }
            block36: while (true) lbl-1000:
            // 4 sources

            {
                if (var5_4 /* !! */  == 0) return;
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                        default: {
                            return;
                        }
                        case 0: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmat", ckys(int ), (int)213);
                            cfr_temp_0 = 4;
                            if (var6_3) {
                                throw null;
                            }
                            break block53;
                        }
                        case 1: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmau", ckys(int ), (int)214);
                            cfr_temp_0 = 5;
                            if (var6_3) {
                                throw null;
                            }
                            break block53;
                        }
                        case 3: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmax", ckys(int ), (int)216);
                            cfr_temp_0 = 2;
                            if (var6_3) {
                                throw null;
                            }
                            break block53;
                        }
                        case 4: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmay", ckys(int ), (int)217);
                            cfr_temp_0 = 8;
                            if (var6_3) {
                                throw null;
                            }
                            break block53;
                        }
                        case 5: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmaz", ckys(int ), (int)218);
                            if (var6_3) {
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
                        case 8: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmbd", ckys(int ), (int)221);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 2: {
                            var5_4 /* !! */  = (int)ae.ckyz("cmav", ckys(int ), (int)215);
                            cfr_temp_0 = 6;
                            if (var6_3) {
                                throw null;
                            }
                            break block53;
                        }
                        case 9: lbl-1000:
                        // 2 sources

                        {
                            var5_4 /* !! */  = (int)ae.ckyz("cmbe", ckys(int ), (int)222);
                            if (var6_3) {
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
                        block38: while (true) {
                            v4 /* !! */  = (long)(v5 - ae.ckyz("cmag", clac(int ), (int)181));
lbl87:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -419380938: {
                                    break block38;
                                }
                                case 111524859: {
                                    v5 = ae.ckyz("cmai", clac(int ), (int)182);
                                    continue block38;
                                }
                                case 489668205: {
                                    v5 = ae.ckyz("cmaj", clac(int ), (int)183);
                                    continue block38;
                                }
                            }
                            break;
                        }
                        var3_6 = this.getItemConfig(var1_1);
                        if (var4_5 || var4_5) ** GOTO lbl-1000
                        v6 /* !! */  = ae.gb;
                        if (true) ** GOTO lbl102
                        block39: while (true) {
                            v6 /* !! */  = (long)(v7 - ae.ckyz("cmak", clac(int ), (int)184));
lbl102:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -954411803: {
                                    v7 = ae.ckyz("cmal", clac(int ), (int)185);
                                    continue block39;
                                }
                                case -419380938: {
                                    break block39;
                                }
                                case 841798713: {
                                    v7 = ae.ckyz("cman", clac(int ), (int)186);
                                    continue block39;
                                }
                                case 1428616677: {
                                    v7 = ae.ckyz("cmao", clac(int ), (int)187);
                                    continue block39;
                                }
                            }
                            break;
                        }
                        var3_6.setEnabled(var2_2);
                        if (var4_5 || var4_5) ** GOTO lbl-1000
                        v8 /* !! */  = ae.gb;
                        if (true) ** GOTO lbl120
                        block40: while (true) {
                            v8 /* !! */  = (long)(v9 - ae.ckyz("cmap", clac(int ), (int)188));
lbl120:
                            // 2 sources

                            switch ((int)v8 /* !! */ ) {
                                case -419380938: {
                                    break block40;
                                }
                                case 774319653: {
                                    v9 = ae.ckyz("cmaq", clac(int ), (int)189);
                                    continue block40;
                                }
                                case 1878002614: {
                                    v9 = ae.ckyz("cmas", clac(int ), (int)190);
                                    continue block40;
                                }
                            }
                            break;
                        }
                        this.save();
                        if (var4_5 || var4_5) continue block36;
                        return;
                        case 6: lbl-1000:
                        // 2 sources

                        {
                            var5_4 /* !! */  = (int)ae.ckyz("cmbb", ckys(int ), (int)219);
                            if (var6_3) {
                                throw null;
                            }
                        }
                        case 7: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl141
        }
        do {
            if (true) ** continue;
lbl141:
            // 2 sources

            var5_4 /* !! */  = (int)ae.ckyz("cmbc", ckys(int ), (int)220);
            cfr_temp_0 = 6;
        } while (!var6_3);
        throw null;
    }

    private static /* synthetic */ void cmvq() {
        ae.ckyy[100] = -1068330038;
        ae.ckyy[101] = 584430796;
        ae.ckyy[102] = -798089309;
        ae.ckyy[103] = 661738350;
        ae.ckyy[104] = -1046965973;
        ae.ckyy[105] = 2104094090;
        ae.ckyy[106] = 1695495997;
        ae.ckyy[107] = -1658120588;
        ae.ckyy[108] = 541241341;
        ae.ckyy[109] = 771642659;
        ae.ckyy[110] = 199192295;
        ae.ckyy[111] = 398210521;
        ae.ckyy[112] = -1609213267;
        ae.ckyy[113] = 515419136;
        ae.ckyy[114] = 2141555943;
        ae.ckyy[115] = 687903008;
        ae.ckyy[116] = -1165057498;
        ae.ckyy[117] = 1718710039;
        ae.ckyy[118] = -1273103991;
        ae.ckyy[119] = -259017383;
        ae.ckyy[120] = -1124513933;
        ae.ckyy[121] = 1338106296;
        ae.ckyy[122] = -862569793;
        ae.ckyy[123] = 1125260843;
        ae.ckyy[124] = 1563125089;
        ae.ckyy[125] = -1222155117;
        ae.ckyy[126] = 680218097;
        ae.ckyy[127] = 390428368;
        ae.ckyy[128] = 1301446180;
        ae.ckyy[129] = 824306739;
        ae.ckyy[130] = 66162541;
        ae.ckyy[131] = 1030339258;
        ae.ckyy[132] = 511217065;
        ae.ckyy[133] = -1102520095;
        ae.ckyy[134] = 187839313;
        ae.ckyy[135] = -1834412929;
        ae.ckyy[136] = 1639722084;
        ae.ckyy[137] = -1819801013;
        ae.ckyy[138] = 1118204447;
        ae.ckyy[139] = -912937999;
        ae.ckyy[140] = -1851215316;
        ae.ckyy[141] = 2137935385;
        ae.ckyy[142] = -1199617107;
        ae.ckyy[143] = 1683596801;
        ae.ckyy[144] = 1783298184;
        ae.ckyy[145] = 1806300253;
        ae.ckyy[146] = -193432646;
        ae.ckyy[147] = 1031328629;
        ae.ckyy[148] = 1932486278;
        ae.ckyy[149] = 1393623311;
        ae.ckyy[150] = -535514427;
        ae.ckyy[151] = 60528796;
        ae.ckyy[152] = 700406740;
        ae.ckyy[153] = -1408060226;
        ae.ckyy[154] = 2009075749;
        ae.ckyy[155] = -223673164;
        ae.ckyy[156] = 1793422741;
        ae.ckyy[157] = 662123911;
        ae.ckyy[158] = -1966193428;
        ae.ckyy[159] = -1815192809;
        ae.ckyy[160] = -56781759;
        ae.ckyy[161] = -2019233411;
        ae.ckyy[162] = 93900900;
        ae.ckyy[163] = 906732448;
        ae.ckyy[164] = 934576610;
        ae.ckyy[165] = -71449084;
        ae.ckyy[166] = -1350270605;
        ae.ckyy[167] = -98433645;
        ae.ckyy[168] = 1583734594;
        ae.ckyy[169] = 1724645499;
        ae.ckyy[170] = -1019282416;
        ae.ckyy[171] = -1316756278;
        ae.ckyy[172] = -2091972346;
        ae.ckyy[173] = 1020012675;
        ae.ckyy[174] = 487753921;
        ae.ckyy[175] = 1394661134;
        ae.ckyy[176] = -571800240;
        ae.ckyy[177] = -1096642560;
        ae.ckyy[178] = -1634856143;
        ae.ckyy[179] = 1496455962;
        ae.ckyy[180] = 1273727560;
        ae.ckyy[181] = -980838155;
        ae.ckyy[182] = 1293517190;
        ae.ckyy[183] = 1813335921;
        ae.ckyy[184] = 1947789284;
        ae.ckyy[185] = 1755048816;
        ae.ckyy[186] = 1724426923;
        ae.ckyy[187] = 863601105;
        ae.ckyy[188] = -1687681042;
        ae.ckyy[189] = -1354718025;
        ae.ckyy[190] = 2064576101;
        ae.ckyy[191] = 1004423304;
        ae.ckyy[192] = -1712925967;
        ae.ckyy[193] = -2001872244;
        ae.ckyy[194] = -1222455814;
        ae.ckyy[195] = -131024017;
        ae.ckyy[196] = -722286345;
        ae.ckyy[197] = 1430834614;
        ae.ckyy[198] = 0x48B8B848;
        ae.ckyy[199] = -48293075;
    }

    private static /* synthetic */ void cmxl() {
        ae.claf[0] = -189658362973306035L;
        ae.claf[1] = 4661467053826614582L;
        ae.claf[2] = -1200360042821536517L;
        ae.claf[3] = 3648233359561478687L;
        ae.claf[4] = -292181460408728567L;
        ae.claf[5] = 3593695528730534409L;
        ae.claf[6] = 608512710808807013L;
        ae.claf[7] = -2205044240755729420L;
        ae.claf[8] = 2871217755252841842L;
        ae.claf[9] = -4174911479977768458L;
        ae.claf[10] = -5810509140408121133L;
        ae.claf[11] = -1592747683721766664L;
        ae.claf[12] = 4316916244464994842L;
        ae.claf[13] = 2571657145064223658L;
        ae.claf[14] = -4297812084541747091L;
        ae.claf[15] = 1744459675491447696L;
        ae.claf[16] = -2502421519575134723L;
        ae.claf[17] = 7538989165988713014L;
        ae.claf[18] = 5576070828663252375L;
        ae.claf[19] = -550902642385595859L;
        ae.claf[20] = 5709349106969723780L;
        ae.claf[21] = 4115196567741795875L;
        ae.claf[22] = 2369730172150637863L;
        ae.claf[23] = 1758762437420216780L;
        ae.claf[24] = 27545439146687258L;
        ae.claf[25] = 1600139840373560626L;
        ae.claf[26] = -2380479534219917980L;
        ae.claf[27] = 735697377156730930L;
        ae.claf[28] = 1984516061834461954L;
        ae.claf[29] = 7025382864088616210L;
        ae.claf[30] = -8614173820003003120L;
        ae.claf[31] = -1632001533399056713L;
        ae.claf[32] = -8020898379965616780L;
        ae.claf[33] = -5367164712309541272L;
        ae.claf[34] = 4752833202518408830L;
        ae.claf[35] = -4173041598854971722L;
        ae.claf[36] = -8624386256771734080L;
        ae.claf[37] = 2687404001986295960L;
        ae.claf[38] = -979348581778934128L;
        ae.claf[39] = 2206551153644357002L;
        ae.claf[40] = 6496576299137578578L;
        ae.claf[41] = 8321370784044423345L;
        ae.claf[42] = -8585621462458207853L;
        ae.claf[43] = -2723001816957765664L;
        ae.claf[44] = 7812815114920748427L;
        ae.claf[45] = -2678494823876970578L;
        ae.claf[46] = 2005551829689133484L;
        ae.claf[47] = -5107089885519025490L;
        ae.claf[48] = -4368755336679648778L;
        ae.claf[49] = -5900983877166989856L;
        ae.claf[50] = -6151400316733791608L;
        ae.claf[51] = 1119457450326829177L;
        ae.claf[52] = 5501477741725098630L;
        ae.claf[53] = -9209893381293241368L;
        ae.claf[54] = -7267079581675956290L;
        ae.claf[55] = 4734718860109295441L;
        ae.claf[56] = 1433929816457840727L;
        ae.claf[57] = -2184125627542974966L;
        ae.claf[58] = 1224449535716519001L;
        ae.claf[59] = 201515773243510645L;
        ae.claf[60] = -4871935383118010688L;
        ae.claf[61] = 4929018387071234683L;
        ae.claf[62] = 4301083261508012465L;
        ae.claf[63] = -804260344703880341L;
        ae.claf[64] = -6385034291551933754L;
        ae.claf[65] = -653903545135091714L;
        ae.claf[66] = -8206426613030110992L;
        ae.claf[67] = 2293036575929520575L;
        ae.claf[68] = 4995550002907163219L;
        ae.claf[69] = -4822641384710428959L;
        ae.claf[70] = -664657297749690392L;
        ae.claf[71] = 5239686317816816720L;
        ae.claf[72] = -6944157639230400157L;
        ae.claf[73] = -6225111633399293505L;
        ae.claf[74] = -7918193445035407532L;
        ae.claf[75] = 5203339888615776910L;
        ae.claf[76] = -2401611685463967783L;
        ae.claf[77] = -6708920662149457784L;
        ae.claf[78] = -1183350593558891218L;
        ae.claf[79] = 8513825967135663967L;
        ae.claf[80] = -7154867185758603471L;
        ae.claf[81] = -2914338960731390965L;
        ae.claf[82] = -1730830159336388406L;
        ae.claf[83] = 3735816510070714307L;
        ae.claf[84] = 4078956678747554541L;
        ae.claf[85] = 7806539670036908343L;
        ae.claf[86] = 2507104962219559448L;
        ae.claf[87] = 6955377030437087283L;
        ae.claf[88] = -248571199468842645L;
        ae.claf[89] = -3558555050732106841L;
        ae.claf[90] = 2648055928051757965L;
        ae.claf[91] = -1348849690869696183L;
        ae.claf[92] = -2780771366523598540L;
        ae.claf[93] = 8220838247510930741L;
        ae.claf[94] = 3858186026342197725L;
        ae.claf[95] = -7258831833425704631L;
        ae.claf[96] = 1288652053490559038L;
        ae.claf[97] = -7091951411643305258L;
        ae.claf[98] = 6333340743278455003L;
        ae.claf[99] = -572528960866757429L;
    }

    private static /* synthetic */ void cmwp() {
        ae.clad[100] = 1424247187700999912L;
        ae.clad[101] = 1117731466517896600L;
        ae.clad[102] = 3499134435791408789L;
        ae.clad[103] = 6151322753245554634L;
        ae.clad[104] = 1009614624448466664L;
        ae.clad[105] = -717678233823411277L;
        ae.clad[106] = -2937403673322882061L;
        ae.clad[107] = 1810885741455980933L;
        ae.clad[108] = -4120539952571899496L;
        ae.clad[109] = -8540158763341288955L;
        ae.clad[110] = 4882329998299739505L;
        ae.clad[111] = -3765156331508317041L;
        ae.clad[112] = -2573575987069232254L;
        ae.clad[113] = 3464060536607608244L;
        ae.clad[114] = -8658169852691522273L;
        ae.clad[115] = -8957878998159905672L;
        ae.clad[116] = 5820124661968199777L;
        ae.clad[117] = -1686147643965261880L;
        ae.clad[118] = -3464563638037463004L;
        ae.clad[119] = -8281386720830697137L;
        ae.clad[120] = 1578797608832203501L;
        ae.clad[121] = 1929961050372511562L;
        ae.clad[122] = 4593260707879679189L;
        ae.clad[123] = -9009341951852645353L;
        ae.clad[124] = -5221500689733398342L;
        ae.clad[125] = 4942836838179347684L;
        ae.clad[126] = 211551029533832493L;
        ae.clad[127] = -6052928328015625143L;
        ae.clad[128] = -3374944486479547924L;
        ae.clad[129] = 7893504962399023355L;
        ae.clad[130] = 6699301548933309150L;
        ae.clad[131] = -7022829878532468942L;
        ae.clad[132] = 6252977241550672628L;
        ae.clad[133] = 3294926765847859221L;
        ae.clad[134] = -7636109325054662422L;
        ae.clad[135] = 4731149486825938160L;
        ae.clad[136] = 6069408948341617958L;
        ae.clad[137] = 4672799810256045380L;
        ae.clad[138] = -1005720597437976916L;
        ae.clad[139] = -6364932457824262761L;
        ae.clad[140] = 2999262119883019538L;
        ae.clad[141] = 5110177811288983546L;
        ae.clad[142] = 7388160301564337198L;
        ae.clad[143] = -3611512443258483346L;
        ae.clad[144] = -8916973529233212160L;
        ae.clad[145] = -1476495036098531280L;
        ae.clad[146] = -1609280385435428579L;
        ae.clad[147] = 1531953845630652185L;
        ae.clad[148] = 950234659145404173L;
        ae.clad[149] = 1213091691427766679L;
        ae.clad[150] = -4265329704682448618L;
        ae.clad[151] = 1670148387638029213L;
        ae.clad[152] = 5892642776054126450L;
        ae.clad[153] = -3134121835461760531L;
        ae.clad[154] = -8579787555095461995L;
        ae.clad[155] = 5221883968737533135L;
        ae.clad[156] = 3530847324057678194L;
        ae.clad[157] = -3133876187456093587L;
        ae.clad[158] = -8018348794942544108L;
        ae.clad[159] = -4848651051966658697L;
        ae.clad[160] = -3599116987732609439L;
        ae.clad[161] = -9133610029545714366L;
        ae.clad[162] = -6345596125394115802L;
        ae.clad[163] = -4959261500486978962L;
        ae.clad[164] = -4997068597493781904L;
        ae.clad[165] = 2791858809875658521L;
        ae.clad[166] = -4705044514016690282L;
        ae.clad[167] = -2348240364858487375L;
        ae.clad[168] = -7465648706937272912L;
        ae.clad[169] = -1517270881513378635L;
        ae.clad[170] = 3554736888278384463L;
        ae.clad[171] = -891002377709735859L;
        ae.clad[172] = 3580608409287359635L;
        ae.clad[173] = 4501263044278440358L;
        ae.clad[174] = 3578261313174179171L;
        ae.clad[175] = -2064889062430027380L;
        ae.clad[176] = -4047593333449741166L;
        ae.clad[177] = 4045653553961282048L;
        ae.clad[178] = 2904891804412011980L;
        ae.clad[179] = 6164909932417696088L;
        ae.clad[180] = 5383840989166466313L;
        ae.clad[181] = 6368076651955211894L;
        ae.clad[182] = 3360703804389978298L;
        ae.clad[183] = 5467583905389639814L;
        ae.clad[184] = 1826479182603894652L;
        ae.clad[185] = -6303403294665635896L;
        ae.clad[186] = -5603397888811048557L;
        ae.clad[187] = 6520715075674137255L;
        ae.clad[188] = 5374170960079248642L;
        ae.clad[189] = 1067378578682031833L;
        ae.clad[190] = -1907426058263021431L;
        ae.clad[191] = 1073576032449624431L;
        ae.clad[192] = 2378623615570734794L;
        ae.clad[193] = -8943295365899752949L;
        ae.clad[194] = 1141358572464206126L;
        ae.clad[195] = -2487670160264615957L;
        ae.clad[196] = -8416692612096063705L;
        ae.clad[197] = 5713419363722716896L;
        ae.clad[198] = 1359015053423810694L;
        ae.clad[199] = 5102449365839815558L;
    }

    private static /* synthetic */ void cmvp() {
        ae.ckyy[0] = -1711462355;
        ae.ckyy[1] = 669772730;
        ae.ckyy[2] = -719529786;
        ae.ckyy[3] = 170437239;
        ae.ckyy[4] = 204633049;
        ae.ckyy[5] = 295985915;
        ae.ckyy[6] = -1008853329;
        ae.ckyy[7] = 1057432421;
        ae.ckyy[8] = 117188373;
        ae.ckyy[9] = -1739044232;
        ae.ckyy[10] = 1703224819;
        ae.ckyy[11] = -1819706403;
        ae.ckyy[12] = -1054050691;
        ae.ckyy[13] = -1495307617;
        ae.ckyy[14] = 2123157258;
        ae.ckyy[15] = 112086270;
        ae.ckyy[16] = -471868967;
        ae.ckyy[17] = 2087810262;
        ae.ckyy[18] = 301184127;
        ae.ckyy[19] = -1839686970;
        ae.ckyy[20] = 1884971085;
        ae.ckyy[21] = -1441240926;
        ae.ckyy[22] = -2093895022;
        ae.ckyy[23] = 1476494786;
        ae.ckyy[24] = -1190926706;
        ae.ckyy[25] = -980474464;
        ae.ckyy[26] = 1988653120;
        ae.ckyy[27] = 1903835523;
        ae.ckyy[28] = 790045899;
        ae.ckyy[29] = -1384095424;
        ae.ckyy[30] = -92568252;
        ae.ckyy[31] = -1130401422;
        ae.ckyy[32] = 57878117;
        ae.ckyy[33] = -768699799;
        ae.ckyy[34] = -338630238;
        ae.ckyy[35] = -1585569971;
        ae.ckyy[36] = 1189067381;
        ae.ckyy[37] = -694150848;
        ae.ckyy[38] = 563815164;
        ae.ckyy[39] = 1048350589;
        ae.ckyy[40] = -1112036092;
        ae.ckyy[41] = 900600885;
        ae.ckyy[42] = -2132861473;
        ae.ckyy[43] = -1034290359;
        ae.ckyy[44] = -719621452;
        ae.ckyy[45] = 296469419;
        ae.ckyy[46] = 60019686;
        ae.ckyy[47] = 16443659;
        ae.ckyy[48] = 166570816;
        ae.ckyy[49] = 104325110;
        ae.ckyy[50] = -1186989520;
        ae.ckyy[51] = 1978743557;
        ae.ckyy[52] = -1540899398;
        ae.ckyy[53] = 459902721;
        ae.ckyy[54] = 2091949685;
        ae.ckyy[55] = -2012505957;
        ae.ckyy[56] = 2100151919;
        ae.ckyy[57] = 1669540322;
        ae.ckyy[58] = -1211055238;
        ae.ckyy[59] = -979834552;
        ae.ckyy[60] = 2106531222;
        ae.ckyy[61] = 1518731886;
        ae.ckyy[62] = -113687929;
        ae.ckyy[63] = -1639216877;
        ae.ckyy[64] = -1258216727;
        ae.ckyy[65] = 1357088988;
        ae.ckyy[66] = 1956588087;
        ae.ckyy[67] = 2128224460;
        ae.ckyy[68] = -153589092;
        ae.ckyy[69] = 799283932;
        ae.ckyy[70] = 761030761;
        ae.ckyy[71] = -352379981;
        ae.ckyy[72] = 317026338;
        ae.ckyy[73] = 164996223;
        ae.ckyy[74] = 467704973;
        ae.ckyy[75] = -1414279945;
        ae.ckyy[76] = -643450887;
        ae.ckyy[77] = -1257230244;
        ae.ckyy[78] = -1927728480;
        ae.ckyy[79] = 1064463267;
        ae.ckyy[80] = 1050898912;
        ae.ckyy[81] = -1039080157;
        ae.ckyy[82] = 866942098;
        ae.ckyy[83] = 180737334;
        ae.ckyy[84] = 1793829515;
        ae.ckyy[85] = -1130206803;
        ae.ckyy[86] = -979695898;
        ae.ckyy[87] = -1044619872;
        ae.ckyy[88] = -2140507601;
        ae.ckyy[89] = 1633552338;
        ae.ckyy[90] = -1451625409;
        ae.ckyy[91] = -96008967;
        ae.ckyy[92] = 1472499587;
        ae.ckyy[93] = 659636208;
        ae.ckyy[94] = 733529892;
        ae.ckyy[95] = 12963528;
        ae.ckyy[96] = -2141843112;
        ae.ckyy[97] = -1108417456;
        ae.ckyy[98] = -1710410303;
        ae.ckyy[99] = 999291714;
    }
}

