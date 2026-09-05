/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import ruhack.phobia.ae;
import ruhack.phobia.ae$ItemConfig;
import ruhack.phobia.d;
import ruhack.phobia.dr;
import ruhack.phobia.ds;
import ruhack.phobia.dy;
import ruhack.phobia.et;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kd;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.kh;

public class ad {
    public static final boolean c;
    private static long[] cpsd;
    private static int[] cppd;
    public static final boolean a;
    private static long[] cpsc;
    private static int[] cppc;
    protected static final long gd = -5079989350642789500L;
    public static final int b;
    private static final Gson GSON;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void deserializeHud(JsonObject var1_1) {
        block91: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ad.gd - ad.cppe("cqpu", cpsb(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ad.cppe("cqpv", cppb(int ), (int)279)) break;
                v0 /* !! */  = (long)ad.cppe("cqpx", cppb(int ), (int)280);
            }
            var6_2 = ad.c;
            v1 /* !! */  = ad.gd;
            if (true) ** GOTO lbl11
            block60: while (true) {
                v1 /* !! */  = (long)(v2 - ad.cppe("cqpy", cpsb(int ), (int)29));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1138011260: {
                        break block60;
                    }
                    case -532450175: {
                        v2 = ad.cppe("cqqa", cpsb(int ), (int)30);
                        continue block60;
                    }
                    case 1819850035: {
                        v2 = ad.cppe("cqqc", cpsb(int ), (int)31);
                        continue block60;
                    }
                }
                break;
            }
            var5_3 /* !! */  = ad.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ad.gd - ad.cppe("cqqd", cpsb(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ad.cppe("cqqe", cppb(int ), (int)281)) break;
                v3 /* !! */  = (long)ad.cppe("cqqf", cppb(int ), (int)282);
            }
            var4_4 = ad.a;
            if (var6_2) {
                throw null;
lbl29:
                // 11 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            if (var1_1 != null) break block91;
            if (var4_4) ** GOTO lbl29
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v4 /* !! */  = ad.gd;
        if (true) ** GOTO lbl41
        block63: while (true) {
            v4 /* !! */  = (long)(v5 - ad.cppe("cqqi", cpsb(int ), (int)33));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1138011260: {
                    break block63;
                }
                case -792081152: {
                    v5 = ad.cppe("cqql", cpsb(int ), (int)34);
                    continue block63;
                }
                case 604943546: {
                    v5 = ad.cppe("cqqo", cpsb(int ), (int)35);
                    continue block63;
                }
                case 1736123276: {
                    v5 = ad.cppe("cqqq", cpsb(int ), (int)36);
                    continue block63;
                }
            }
            break;
        }
        v6 = dy.getInstance();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ad.gd - ad.cppe("cqqs", cpsb(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ad.cppe("cqqw", cppb(int ), (int)283)) break;
            v7 /* !! */  = (long)ad.cppe("cqqz", cppb(int ), (int)284);
        }
        v8 = v6.settings();
        v9 /* !! */  = ad.gd;
        if (true) ** GOTO lbl64
        block65: while (true) {
            v9 /* !! */  = (long)(ad.cppe("cqrf", cpsb(int ), (int)39) - ad.cppe("cqrc", cpsb(int ), (int)38));
lbl64:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1138011260: {
                    break block65;
                }
                case 2073294698: {
                    continue block65;
                }
            }
            break;
        }
        var2_5 = v8.iterator();
        if (var4_4) ** GOTO lbl29
        block66: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl29
            v10 /* !! */  = ad.gd;
            if (true) ** GOTO lbl77
            block67: while (true) {
                v10 /* !! */  = (long)(v11 - ad.cppe("cqrj", cpsb(int ), (int)40));
lbl77:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1978270064: {
                        v11 = ad.cppe("cqrl", cpsb(int ), (int)41);
                        continue block67;
                    }
                    case -1138011260: {
                        break block67;
                    }
                    case -610161113: {
                        v11 = ad.cppe("cqrm", cpsb(int ), (int)42);
                        continue block67;
                    }
                }
                break;
            }
            if (!var2_5.hasNext()) ** GOTO lbl159
            if (var4_4) ** GOTO lbl29
            v12 /* !! */  = ad.gd;
            if (true) ** GOTO lbl92
            block68: while (true) {
                v12 /* !! */  = (long)(v13 - ad.cppe("cqrn", cpsb(int ), (int)43));
lbl92:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1138011260: {
                        break block68;
                    }
                    case -412612087: {
                        v13 = ad.cppe("cqrp", cpsb(int ), (int)44);
                        continue block68;
                    }
                    case 962604814: {
                        v13 = ad.cppe("cqrq", cpsb(int ), (int)45);
                        continue block68;
                    }
                    case 1696877084: {
                        v13 = ad.cppe("cqrr", cpsb(int ), (int)46);
                        continue block68;
                    }
                }
                break;
            }
            var3_6 = var2_5.next();
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = ad.gd - ad.cppe("cqrs", cpsb(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == ad.cppe("cqrt", cppb(int ), (int)285)) break;
                v14 /* !! */  = (long)ad.cppe("cqrv", cppb(int ), (int)286);
            }
            v15 = var3_6.getName();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_4 = ad.gd - ad.cppe("cqrw", cpsb(int ), (int)48)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == ad.cppe("cqrx", cppb(int ), (int)287)) break;
                v16 /* !! */  = (long)ad.cppe("cqrz", cppb(int ), (int)288);
            }
            if (!var1_1.has(v15)) ** GOTO lbl-1000
            if (var4_4 || var4_4) ** GOTO lbl29
            v17 /* !! */  = ad.gd;
            if (true) ** GOTO lbl123
            block71: while (true) {
                v17 /* !! */  = (long)(ad.cppe("cqsc", cpsb(int ), (int)50) - ad.cppe("cqsa", cpsb(int ), (int)49));
lbl123:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1138011260: {
                        break block71;
                    }
                    case -65313156: {
                        continue block71;
                    }
                }
                break;
            }
            v18 = var3_6.getName();
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_5 = ad.gd - ad.cppe("cqsd", cpsb(int ), (int)51)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == ad.cppe("cqse", cppb(int ), (int)289)) break;
                v19 /* !! */  = (long)ad.cppe("cqsf", cppb(int ), (int)290);
            }
            v20 = var1_1.get(v18);
            v21 /* !! */  = ad.gd;
            if (true) ** GOTO lbl139
            block73: while (true) {
                v21 /* !! */  = (long)(v22 - ad.cppe("cqsh", cpsb(int ), (int)52));
lbl139:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1684225318: {
                        v22 = ad.cppe("cqsi", cpsb(int ), (int)53);
                        continue block73;
                    }
                    case -1138011260: {
                        break block73;
                    }
                    case -1003932670: {
                        v22 = ad.cppe("cqsj", cpsb(int ), (int)54);
                        continue block73;
                    }
                    case -503923684: {
                        v22 = ad.cppe("cqsk", cpsb(int ), (int)55);
                        continue block73;
                    }
                }
                break;
            }
            this.deserializeSetting(var3_6, v20);
            if (var4_4) ** GOTO lbl29
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 3 sources

                {
                    if (var4_4 || var4_4) ** GOTO lbl29
                    if (!var6_2) continue block66;
                    throw null;
                }
lbl159:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
                case 0: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsn", cppb(int ), (int)291);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl167:
                // 5 sources

                case 1: {
                    var5_3 /* !! */  = (int)ad.cppe("cqso", cppb(int ), (int)292);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 2: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsp", cppb(int ), (int)293);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl177:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsr", cppb(int ), (int)294);
                    if (!var6_2) ** GOTO lbl167
                    throw null;
                }
                case 4: {
                    var5_3 /* !! */  = (int)ad.cppe("cqss", cppb(int ), (int)295);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl186:
                // 2 sources

                case 5: {
                    do {
                        var5_3 /* !! */  = (int)ad.cppe("cqst", cppb(int ), (int)296);
                    } while (!var6_2);
                    throw null;
                }
                case 6: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsv", cppb(int ), (int)297);
                    if (!var6_2) ** GOTO lbl167
                    throw null;
                }
                case 7: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsw", cppb(int ), (int)298);
                    if (!var6_2) ** GOTO lbl186
                    throw null;
                }
lbl199:
                // 3 sources

                case 8: {
                    var5_3 /* !! */  = (int)ad.cppe("cqsx", cppb(int ), (int)299);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl231
                }
lbl204:
                // 2 sources

                case 9: {
                    do {
                        var5_3 /* !! */  = (int)ad.cppe("cqsz", cppb(int ), (int)300);
                    } while (!var6_2);
                    throw null;
                }
lbl209:
                // 2 sources

                case 10: {
                    var5_3 /* !! */  = (int)ad.cppe("cqta", cppb(int ), (int)301);
                    if (!var6_2) ** GOTO lbl199
                    throw null;
                }
lbl213:
                // 2 sources

                case 11: {
                    var5_3 /* !! */  = (int)ad.cppe("cqtb", cppb(int ), (int)302);
                    if (!var6_2) ** GOTO lbl209
                    throw null;
                }
                case 12: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)ad.cppe("cqtc", cppb(int ), (int)303);
                        if (!var6_2) ** GOTO lbl167
                        throw null;
                    }
                }
lbl222:
                // 3 sources

                case 13: {
                    do {
                        var5_3 /* !! */  = (int)ad.cppe("cqte", cppb(int ), (int)304);
                    } while (!var6_2);
                    throw null;
                }
                case 14: {
                    var5_3 /* !! */  = (int)ad.cppe("cqtf", cppb(int ), (int)305);
                    if (!var6_2) ** GOTO lbl167
                    throw null;
                }
lbl231:
                // 2 sources

                case 15: {
                    var5_3 /* !! */  = (int)ad.cppe("cqth", cppb(int ), (int)306);
                    if (!var6_2) ** GOTO lbl204
                    throw null;
                }
lbl235:
                // 3 sources

                case 16: {
                    var5_3 /* !! */  = (int)ad.cppe("cqti", cppb(int ), (int)307);
                    if (!var6_2) ** GOTO lbl213
                    throw null;
                }
                case 17: {
                    var5_3 /* !! */  = (int)ad.cppe("cqtj", cppb(int ), (int)308);
                    if (!var6_2) break block66;
                    throw null;
                }
                case 18: {
                    var5_3 /* !! */  = (int)ad.cppe("cqtk", cppb(int ), (int)309);
                    if (!var6_2) ** GOTO lbl199
                    throw null;
                }
                case 19: {
                    var5_3 /* !! */  = (int)ad.cppe("cqtm", cppb(int ), (int)310);
                    if (!var6_2) ** GOTO lbl235
                    throw null;
                }
                case 20: 
            }
            break;
        }
        var5_3 /* !! */  = (int)ad.cppe("cqtn", cppb(int ), (int)311);
        ** while (!var6_2)
lbl254:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void crkf() {
        ad.cppc[200] = -97569999;
        ad.cppc[201] = 1800326944;
        ad.cppc[202] = -766118946;
        ad.cppc[203] = -1005694980;
        ad.cppc[204] = -201602939;
        ad.cppc[205] = 566622150;
        ad.cppc[206] = -969742582;
        ad.cppc[207] = 946912001;
        ad.cppc[208] = 1359765466;
        ad.cppc[209] = 1052944089;
        ad.cppc[210] = 2031006048;
        ad.cppc[211] = -104067761;
        ad.cppc[212] = -1824566479;
        ad.cppc[213] = -1020400256;
        ad.cppc[214] = 308273851;
        ad.cppc[215] = 1690836235;
        ad.cppc[216] = 1429760023;
        ad.cppc[217] = -65832260;
        ad.cppc[218] = -1553477498;
        ad.cppc[219] = 2098755618;
        ad.cppc[220] = 1238632231;
        ad.cppc[221] = 216477898;
        ad.cppc[222] = 2131748491;
        ad.cppc[223] = -814439616;
        ad.cppc[224] = 411651209;
        ad.cppc[225] = -1335884334;
        ad.cppc[226] = 475646429;
        ad.cppc[227] = 1133712723;
        ad.cppc[228] = 610565133;
        ad.cppc[229] = -38969744;
        ad.cppc[230] = 1024555938;
        ad.cppc[231] = 2014395712;
        ad.cppc[232] = -1109944594;
        ad.cppc[233] = -93628976;
        ad.cppc[234] = -608250340;
        ad.cppc[235] = 1174678531;
        ad.cppc[236] = -550036915;
        ad.cppc[237] = 2131602410;
        ad.cppc[238] = -876212943;
        ad.cppc[239] = -242044391;
        ad.cppc[240] = -1399509704;
        ad.cppc[241] = 1790986004;
        ad.cppc[242] = -1015212396;
        ad.cppc[243] = 1102251428;
        ad.cppc[244] = 1376630807;
        ad.cppc[245] = -2143844734;
        ad.cppc[246] = -1544152664;
        ad.cppc[247] = 2016626565;
        ad.cppc[248] = 465188920;
        ad.cppc[249] = 635030970;
        ad.cppc[250] = -1952624849;
        ad.cppc[251] = -1110083089;
        ad.cppc[252] = 1487684882;
        ad.cppc[253] = -61929437;
        ad.cppc[254] = -1983188245;
        ad.cppc[255] = -1313032102;
        ad.cppc[256] = -1564862817;
        ad.cppc[257] = 370807026;
        ad.cppc[258] = 2018520190;
        ad.cppc[259] = 552783594;
        ad.cppc[260] = -539457565;
        ad.cppc[261] = 212547634;
        ad.cppc[262] = -1894772896;
        ad.cppc[263] = -2018870823;
        ad.cppc[264] = -479043095;
        ad.cppc[265] = 714757528;
        ad.cppc[266] = 321134031;
        ad.cppc[267] = -2091653073;
        ad.cppc[268] = 652536376;
        ad.cppc[269] = 178921314;
        ad.cppc[270] = 287173106;
        ad.cppc[271] = 1071535088;
        ad.cppc[272] = 205914696;
        ad.cppc[273] = -149047214;
        ad.cppc[274] = 1189985872;
        ad.cppc[275] = -1260731614;
        ad.cppc[276] = 1981306037;
        ad.cppc[277] = -805000920;
        ad.cppc[278] = 1209037377;
        ad.cppc[279] = 2001684346;
        ad.cppc[280] = -1799871607;
        ad.cppc[281] = 1144035990;
        ad.cppc[282] = 592861501;
        ad.cppc[283] = -1744741816;
        ad.cppc[284] = 1548193176;
        ad.cppc[285] = 2009329895;
        ad.cppc[286] = -51466081;
        ad.cppc[287] = -65052148;
        ad.cppc[288] = 1390432514;
        ad.cppc[289] = 467001523;
        ad.cppc[290] = -1842046690;
        ad.cppc[291] = -1526595480;
        ad.cppc[292] = 608208853;
        ad.cppc[293] = 1639902130;
        ad.cppc[294] = 1299367759;
        ad.cppc[295] = 2028550695;
        ad.cppc[296] = 349776580;
        ad.cppc[297] = 791212254;
        ad.cppc[298] = 649037052;
        ad.cppc[299] = -679267326;
    }

    /*
     * Exception decompiling
     */
    private void deserializeSetting(jx var1_1, JsonElement var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 14[SWITCH]
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
    private static boolean isLegacyMouseButton(int var0) {
        block31: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ad.gd - ad.cppe("crhz", cpsb(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ad.cppe("cria", cppb(int ), (int)631)) break;
                v0 /* !! */  = (long)ad.cppe("crib", cppb(int ), (int)632);
            }
            var3_1 = ad.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ad.gd - ad.cppe("cric", cpsb(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ad.cppe("crid", cppb(int ), (int)633)) break;
                v1 /* !! */  = (long)ad.cppe("crie", cppb(int ), (int)634);
            }
            var2_2 /* !! */  = ad.b;
            v2 /* !! */  = ad.gd;
            if (true) ** GOTO lbl19
            block17: while (true) {
                v2 /* !! */  = (long)(ad.cppe("crig", cpsb(int ), (int)80) - ad.cppe("crif", cpsb(int ), (int)79));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1138011260: {
                        break block17;
                    }
                    case 1115046802: {
                        continue block17;
                    }
                }
                break;
            }
            var1_3 = ad.a;
            if (var3_1) {
                throw null;
lbl27:
                // 5 sources

                return (boolean)ad.cppe("crih", cppb(int ), (int)635);
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            if (var0 < 0) break block31;
            if (var1_3) ** GOTO lbl27
            if (var0 > ad.cppe("crii", cppb(int ), (int)636)) break block31;
            if (var1_3) ** GOTO lbl27
            v3 = ad.cppe("crij", cppb(int ), (int)637);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl46
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v3 = ad.cppe("crik", cppb(int ), (int)638);
lbl46:
                // 2 sources

                return (boolean)v3;
            }
            case 0: {
                var2_2 /* !! */  = (int)ad.cppe("cril", cppb(int ), (int)639);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl52:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ad.cppe("crim", cppb(int ), (int)640);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl57:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ad.cppe("crin", cppb(int ), (int)641);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ad.cppe("crio", cppb(int ), (int)642);
                    if (!var3_1) ** GOTO lbl52
                    throw null;
                }
            }
lbl66:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ad.cppe("crip", cppb(int ), (int)643);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ad.cppe("criq", cppb(int ), (int)644);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ad.cppe("crir", cppb(int ), (int)645);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ad.cppe("cris", cppb(int ), (int)646);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ad.cppe("crit", cppb(int ), (int)647);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite cppe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void crkm() {
        ad.cppd[200] = -97569999;
        ad.cppd[201] = 1800326963;
        ad.cppd[202] = -766119023;
        ad.cppd[203] = -1005695054;
        ad.cppd[204] = -201602939;
        ad.cppd[205] = 566622094;
        ad.cppd[206] = -969742521;
        ad.cppd[207] = 946912034;
        ad.cppd[208] = 1359765475;
        ad.cppd[209] = 1052944026;
        ad.cppd[210] = 2031006077;
        ad.cppd[211] = -104067758;
        ad.cppd[212] = -1824566498;
        ad.cppd[213] = -1020400238;
        ad.cppd[214] = 308273844;
        ad.cppd[215] = 1690836264;
        ad.cppd[216] = 1429760044;
        ad.cppd[217] = -65832289;
        ad.cppd[218] = -1553477429;
        ad.cppd[219] = 2098755630;
        ad.cppd[220] = 1238632238;
        ad.cppd[221] = 216477839;
        ad.cppd[222] = 2131748513;
        ad.cppd[223] = -814439583;
        ad.cppd[224] = 411651245;
        ad.cppd[225] = -1335884348;
        ad.cppd[226] = 475646463;
        ad.cppd[227] = 1133712712;
        ad.cppd[228] = 610565158;
        ad.cppd[229] = -38969746;
        ad.cppd[230] = 1024555957;
        ad.cppd[231] = 2014395720;
        ad.cppd[232] = -1109944632;
        ad.cppd[233] = -93628932;
        ad.cppd[234] = -608250366;
        ad.cppd[235] = 1174678582;
        ad.cppd[236] = -550036869;
        ad.cppd[237] = 2131602383;
        ad.cppd[238] = -876212936;
        ad.cppd[239] = -242044371;
        ad.cppd[240] = -1399509724;
        ad.cppd[241] = 1790986032;
        ad.cppd[242] = -1015212384;
        ad.cppd[243] = 1102251426;
        ad.cppd[244] = 1376630823;
        ad.cppd[245] = -2143844732;
        ad.cppd[246] = -1544152678;
        ad.cppd[247] = 2016626613;
        ad.cppd[248] = 465188909;
        ad.cppd[249] = 635030974;
        ad.cppd[250] = -1952624887;
        ad.cppd[251] = -1110083127;
        ad.cppd[252] = 1487684902;
        ad.cppd[253] = -61929452;
        ad.cppd[254] = -1983188243;
        ad.cppd[255] = -1313032106;
        ad.cppd[256] = -1564862831;
        ad.cppd[257] = 370807028;
        ad.cppd[258] = 2018520144;
        ad.cppd[259] = 552783613;
        ad.cppd[260] = -539457542;
        ad.cppd[261] = 212547641;
        ad.cppd[262] = -1894772890;
        ad.cppd[263] = -2018870820;
        ad.cppd[264] = -479043132;
        ad.cppd[265] = 714757529;
        ad.cppd[266] = 321134063;
        ad.cppd[267] = -2091653085;
        ad.cppd[268] = 652536360;
        ad.cppd[269] = 178921314;
        ad.cppd[270] = 287173088;
        ad.cppd[271] = 1071535079;
        ad.cppd[272] = 205914749;
        ad.cppd[273] = -149047195;
        ad.cppd[274] = 1189985857;
        ad.cppd[275] = -1260731594;
        ad.cppd[276] = 1981306041;
        ad.cppd[277] = -805000910;
        ad.cppd[278] = 1209037400;
        ad.cppd[279] = -2001684347;
        ad.cppd[280] = -333133049;
        ad.cppd[281] = -1144035991;
        ad.cppd[282] = 2015428540;
        ad.cppd[283] = 1744741815;
        ad.cppd[284] = 2141953334;
        ad.cppd[285] = 2009329894;
        ad.cppd[286] = 1337372771;
        ad.cppd[287] = 65052147;
        ad.cppd[288] = -1414109089;
        ad.cppd[289] = -467001524;
        ad.cppd[290] = 761496352;
        ad.cppd[291] = -1526595477;
        ad.cppd[292] = 608208850;
        ad.cppd[293] = 1639902118;
        ad.cppd[294] = 1299367753;
        ad.cppd[295] = 2028550692;
        ad.cppd[296] = 349776581;
        ad.cppd[297] = 791212247;
        ad.cppd[298] = 649037043;
        ad.cppd[299] = -679267320;
    }

    private static /* synthetic */ void crkl() {
        ad.cppd[100] = -1609063306;
        ad.cppd[101] = -1609964735;
        ad.cppd[102] = -1830913820;
        ad.cppd[103] = -551812238;
        ad.cppd[104] = 1862145539;
        ad.cppd[105] = 845336901;
        ad.cppd[106] = -1697338917;
        ad.cppd[107] = 330280335;
        ad.cppd[108] = -1715648227;
        ad.cppd[109] = 177913637;
        ad.cppd[110] = 534369635;
        ad.cppd[111] = -1844769786;
        ad.cppd[112] = 1438433248;
        ad.cppd[113] = -1380964352;
        ad.cppd[114] = 1054929851;
        ad.cppd[115] = -1354143516;
        ad.cppd[116] = -2070131863;
        ad.cppd[117] = -682597485;
        ad.cppd[118] = -1205639490;
        ad.cppd[119] = -434857374;
        ad.cppd[120] = -824896616;
        ad.cppd[121] = -1642984278;
        ad.cppd[122] = -553987772;
        ad.cppd[123] = -166096773;
        ad.cppd[124] = -1677928682;
        ad.cppd[125] = 256563922;
        ad.cppd[126] = -545881912;
        ad.cppd[127] = 1556064190;
        ad.cppd[128] = 1622058905;
        ad.cppd[129] = -84090029;
        ad.cppd[130] = 866864459;
        ad.cppd[131] = 696374629;
        ad.cppd[132] = 546088550;
        ad.cppd[133] = 530740572;
        ad.cppd[134] = -1991830665;
        ad.cppd[135] = 245760165;
        ad.cppd[136] = 2013431063;
        ad.cppd[137] = -1101068928;
        ad.cppd[138] = 1960783110;
        ad.cppd[139] = -301982393;
        ad.cppd[140] = -1381445986;
        ad.cppd[141] = -40969119;
        ad.cppd[142] = -1509717148;
        ad.cppd[143] = -164373641;
        ad.cppd[144] = 447036553;
        ad.cppd[145] = 2031516842;
        ad.cppd[146] = 1133926547;
        ad.cppd[147] = -1195310885;
        ad.cppd[148] = 476355719;
        ad.cppd[149] = 1080947778;
        ad.cppd[150] = 897729102;
        ad.cppd[151] = -783040793;
        ad.cppd[152] = -321975766;
        ad.cppd[153] = 158567613;
        ad.cppd[154] = 1441256305;
        ad.cppd[155] = -1265395089;
        ad.cppd[156] = 1759477998;
        ad.cppd[157] = -2846954;
        ad.cppd[158] = 1652326295;
        ad.cppd[159] = -851396483;
        ad.cppd[160] = 1955859065;
        ad.cppd[161] = -1164833125;
        ad.cppd[162] = -2057550588;
        ad.cppd[163] = 186164324;
        ad.cppd[164] = 1320946980;
        ad.cppd[165] = 521334568;
        ad.cppd[166] = 87623877;
        ad.cppd[167] = -1661410540;
        ad.cppd[168] = -1954644295;
        ad.cppd[169] = 1653840535;
        ad.cppd[170] = 501289237;
        ad.cppd[171] = -2142836816;
        ad.cppd[172] = 1506410366;
        ad.cppd[173] = -1294526090;
        ad.cppd[174] = -842513917;
        ad.cppd[175] = 1879719261;
        ad.cppd[176] = 981279090;
        ad.cppd[177] = 218399483;
        ad.cppd[178] = 299237456;
        ad.cppd[179] = 933165661;
        ad.cppd[180] = -130719786;
        ad.cppd[181] = 1490483252;
        ad.cppd[182] = 1081335453;
        ad.cppd[183] = 2092159067;
        ad.cppd[184] = -795374866;
        ad.cppd[185] = 1576377986;
        ad.cppd[186] = 100104389;
        ad.cppd[187] = 1269321223;
        ad.cppd[188] = -1278432248;
        ad.cppd[189] = -1397994169;
        ad.cppd[190] = -1589370489;
        ad.cppd[191] = 1972708837;
        ad.cppd[192] = -518347331;
        ad.cppd[193] = 563405534;
        ad.cppd[194] = -30980504;
        ad.cppd[195] = -1718514078;
        ad.cppd[196] = 405804150;
        ad.cppd[197] = -2142473013;
        ad.cppd[198] = -440619561;
        ad.cppd[199] = 1348865832;
    }

    private static /* synthetic */ long cpsb(int n2) {
        return cpsc[n2] ^ cpsd[n2];
    }

    private static /* synthetic */ void crkg() {
        ad.cppc[300] = 978970146;
        ad.cppc[301] = -197661687;
        ad.cppc[302] = 226470828;
        ad.cppc[303] = -1587155337;
        ad.cppc[304] = 337305061;
        ad.cppc[305] = -232491012;
        ad.cppc[306] = -517264908;
        ad.cppc[307] = 248394107;
        ad.cppc[308] = 318838605;
        ad.cppc[309] = 2094439832;
        ad.cppc[310] = 380010611;
        ad.cppc[311] = 1349882674;
        ad.cppc[312] = -1790219287;
        ad.cppc[313] = -1905754035;
        ad.cppc[314] = 178467461;
        ad.cppc[315] = 912426644;
        ad.cppc[316] = 421850477;
        ad.cppc[317] = 177427768;
        ad.cppc[318] = -1728202256;
        ad.cppc[319] = 1556203412;
        ad.cppc[320] = 1643871570;
        ad.cppc[321] = 1368922455;
        ad.cppc[322] = -2001766197;
        ad.cppc[323] = 2147072196;
        ad.cppc[324] = 1195482305;
        ad.cppc[325] = -1520911428;
        ad.cppc[326] = -1125308253;
        ad.cppc[327] = 589137687;
        ad.cppc[328] = -131155638;
        ad.cppc[329] = 225291721;
        ad.cppc[330] = -343879823;
        ad.cppc[331] = -537975794;
        ad.cppc[332] = -1887340450;
        ad.cppc[333] = -749793260;
        ad.cppc[334] = 1341671713;
        ad.cppc[335] = 318533853;
        ad.cppc[336] = -2139371171;
        ad.cppc[337] = -848826992;
        ad.cppc[338] = 1362087718;
        ad.cppc[339] = 1112877062;
        ad.cppc[340] = 1535688077;
        ad.cppc[341] = -1570948581;
        ad.cppc[342] = -716037101;
        ad.cppc[343] = -1893966441;
        ad.cppc[344] = -1854378398;
        ad.cppc[345] = 205097111;
        ad.cppc[346] = 1977500798;
        ad.cppc[347] = -1022252959;
        ad.cppc[348] = -1472302617;
        ad.cppc[349] = 952740941;
        ad.cppc[350] = 1943847020;
        ad.cppc[351] = 2019247849;
        ad.cppc[352] = -136075907;
        ad.cppc[353] = 1887811929;
        ad.cppc[354] = 577578790;
        ad.cppc[355] = 1687935304;
        ad.cppc[356] = -1172025684;
        ad.cppc[357] = -1557850143;
        ad.cppc[358] = 225845620;
        ad.cppc[359] = -1108116330;
        ad.cppc[360] = 2000673549;
        ad.cppc[361] = -1078747285;
        ad.cppc[362] = -506911935;
        ad.cppc[363] = -634036120;
        ad.cppc[364] = -1492140620;
        ad.cppc[365] = 1894313196;
        ad.cppc[366] = -1514874523;
        ad.cppc[367] = -1147655221;
        ad.cppc[368] = 2060398997;
        ad.cppc[369] = 81946901;
        ad.cppc[370] = 588231038;
        ad.cppc[371] = -71778134;
        ad.cppc[372] = -95033922;
        ad.cppc[373] = -1267486786;
        ad.cppc[374] = 544614639;
        ad.cppc[375] = 53229053;
        ad.cppc[376] = -81538229;
        ad.cppc[377] = -515354739;
        ad.cppc[378] = -1257324933;
        ad.cppc[379] = 1649875703;
        ad.cppc[380] = -2000894243;
        ad.cppc[381] = 642586666;
        ad.cppc[382] = 1256173559;
        ad.cppc[383] = 1829590710;
        ad.cppc[384] = 1890998726;
        ad.cppc[385] = -1702469511;
        ad.cppc[386] = -706681609;
        ad.cppc[387] = 2128558819;
        ad.cppc[388] = 566454306;
        ad.cppc[389] = 2128348951;
        ad.cppc[390] = 330739115;
        ad.cppc[391] = -282224177;
        ad.cppc[392] = -2009841766;
        ad.cppc[393] = -1027926302;
        ad.cppc[394] = -408406691;
        ad.cppc[395] = 862451427;
        ad.cppc[396] = 739447268;
        ad.cppc[397] = -1795668256;
        ad.cppc[398] = -768683623;
        ad.cppc[399] = -931847249;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private JsonElement serializeSetting(jx var1_1) {
        block159: {
            var8_2 = ad.c;
            var7_3 /* !! */  = ad.b;
            var6_4 = ad.a;
            if (var8_2) {
                throw null;
lbl6:
                // 43 sources

                return null;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof kb)) break block159;
            if (var6_4) ** GOTO lbl6
            var2_5 = (kb)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_12 = new JsonObject();
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_12.addProperty("value", Boolean.valueOf(var2_5.isValue()));
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_12.addProperty("key", (Number)var2_5.getKey());
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_12.addProperty("type", (Number)var2_5.getType());
            if (var6_4 || var6_4) ** GOTO lbl6
            return var3_12;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (!(var1_1 instanceof kg)) ** GOTO lbl33
        if (var6_4) ** GOTO lbl6
        var2_6 = (kg)var1_1;
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                return new JsonPrimitive((Number)Float.valueOf(var2_6.getValue()));
            }
lbl33:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof ka)) ** GOTO lbl47
            if (var6_4) ** GOTO lbl6
            var2_7 = (ka)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_13 = new JsonObject();
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_13.addProperty("key", (Number)var2_7.getKey());
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_13.addProperty("type", (Number)var2_7.getType());
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_13.addProperty("mouse", Boolean.valueOf(var2_7.isMouse()));
            if (var6_4 || var6_4) ** GOTO lbl6
            return var3_13;
lbl47:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof kh)) ** GOTO lbl59
            if (var6_4) ** GOTO lbl6
            var2_8 = (kh)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var2_8.getValue() != null) {
                v0 = var2_8.getValue();
                if (var8_2) {
                    throw null;
                }
            } else {
                v0 = "";
            }
            return new JsonPrimitive(v0);
lbl59:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof kf)) ** GOTO lbl65
            if (var6_4) ** GOTO lbl6
            var2_9 = (kf)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            return new JsonPrimitive(var2_9.getValue());
lbl65:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof kd)) ** GOTO lbl81
            if (var6_4) ** GOTO lbl6
            var2_10 = (kd)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_14 = new JsonObject();
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_14.addProperty("hue", (Number)Float.valueOf(var2_10.getHue()));
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_14.addProperty("saturation", (Number)Float.valueOf(var2_10.getSaturation()));
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_14.addProperty("brightness", (Number)Float.valueOf(var2_10.getBrightness()));
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_14.addProperty("alpha", (Number)Float.valueOf(var2_10.getAlpha()));
            if (var6_4 || var6_4) ** GOTO lbl6
            return var3_14;
lbl81:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var1_1 instanceof ke)) ** GOTO lbl102
            if (var6_4) ** GOTO lbl6
            var2_11 = (ke)var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_15 = new JsonArray();
            if (var6_4 || var6_4) ** GOTO lbl6
            var4_16 = var2_11.getSelected().iterator();
            if (var6_4) ** GOTO lbl6
            do {
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!var4_16.hasNext()) ** GOTO lbl100
                if (var6_4) ** GOTO lbl6
                var5_17 = var4_16.next();
                if (var6_4 || var6_4) ** GOTO lbl6
                var3_15.add(var5_17);
                if (var6_4 || var6_4) ** GOTO lbl6
            } while (!var8_2);
            throw null;
lbl100:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            return var3_15;
lbl102:
            // 1 sources

            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return null;
lbl105:
            // 3 sources

            case 0: {
                var7_3 /* !! */  = (int)ad.cppe("cqbw", cppb(int ), (int)142);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl110:
            // 4 sources

            case 1: {
                var7_3 /* !! */  = (int)ad.cppe("cqbx", cppb(int ), (int)143);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 2: {
                var7_3 /* !! */  = (int)ad.cppe("cqca", cppb(int ), (int)144);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 3: {
                var7_3 /* !! */  = (int)ad.cppe("cqcc", cppb(int ), (int)145);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 4: {
                var7_3 /* !! */  = (int)ad.cppe("cqcf", cppb(int ), (int)146);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 5: {
                var7_3 /* !! */  = (int)ad.cppe("cqci", cppb(int ), (int)147);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl135:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)ad.cppe("cqck", cppb(int ), (int)148);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl140:
            // 3 sources

            case 7: {
                var7_3 /* !! */  = (int)ad.cppe("cqcn", cppb(int ), (int)149);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl145:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)ad.cppe("cqcp", cppb(int ), (int)150);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl150:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)ad.cppe("cqcq", cppb(int ), (int)151);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl155:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)ad.cppe("cqct", cppb(int ), (int)152);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 11: {
                var7_3 /* !! */  = (int)ad.cppe("cqcw", cppb(int ), (int)153);
                if (!var8_2) ** GOTO lbl145
                throw null;
            }
lbl164:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)ad.cppe("cqcy", cppb(int ), (int)154);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 13: {
                var7_3 /* !! */  = (int)ad.cppe("cqdb", cppb(int ), (int)155);
                if (!var8_2) ** GOTO lbl110
                throw null;
            }
lbl173:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)ad.cppe("cqdc", cppb(int ), (int)156);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl178:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)ad.cppe("cqdd", cppb(int ), (int)157);
                if (!var8_2) ** GOTO lbl173
                throw null;
            }
lbl182:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)ad.cppe("cqdg", cppb(int ), (int)158);
                if (!var8_2) ** GOTO lbl105
                throw null;
            }
lbl186:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)ad.cppe("cqdi", cppb(int ), (int)159);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl191:
            // 3 sources

            case 18: {
                var7_3 /* !! */  = (int)ad.cppe("cqdl", cppb(int ), (int)160);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
lbl195:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)ad.cppe("cqdn", cppb(int ), (int)161);
                if (!var8_2) ** GOTO lbl178
                throw null;
            }
lbl199:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)ad.cppe("cqdp", cppb(int ), (int)162);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl204:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)ad.cppe("cqdr", cppb(int ), (int)163);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl209:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)ad.cppe("cqdt", cppb(int ), (int)164);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl214:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)ad.cppe("cqdw", cppb(int ), (int)165);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
lbl218:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)ad.cppe("cqdz", cppb(int ), (int)166);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl223:
            // 3 sources

            case 25: {
                var7_3 /* !! */  = (int)ad.cppe("cqeb", cppb(int ), (int)167);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl228:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)ad.cppe("cqec", cppb(int ), (int)168);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
            case 27: {
                var7_3 /* !! */  = (int)ad.cppe("cqef", cppb(int ), (int)169);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 28: {
                var7_3 /* !! */  = (int)ad.cppe("cqej", cppb(int ), (int)170);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 29: {
                var7_3 /* !! */  = (int)ad.cppe("cqem", cppb(int ), (int)171);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl435
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ad.cppe("cqeo", cppb(int ), (int)172);
                    if (!var8_2) ** GOTO lbl228
                    throw null;
                }
            }
            case 31: {
                var7_3 /* !! */  = (int)ad.cppe("cqer", cppb(int ), (int)173);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl258:
            // 3 sources

            case 32: {
                var7_3 /* !! */  = (int)ad.cppe("cqet", cppb(int ), (int)174);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
            case 33: {
                var7_3 /* !! */  = (int)ad.cppe("cqew", cppb(int ), (int)175);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
            case 34: {
                var7_3 /* !! */  = (int)ad.cppe("cqez", cppb(int ), (int)176);
                if (var8_2) {
                    throw null;
                }
            }
            case 35: {
                var7_3 /* !! */  = (int)ad.cppe("cqfa", cppb(int ), (int)177);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 36: {
                var7_3 /* !! */  = (int)ad.cppe("cqfb", cppb(int ), (int)178);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl280:
            // 3 sources

            case 37: {
                var7_3 /* !! */  = (int)ad.cppe("cqfe", cppb(int ), (int)179);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl285:
            // 2 sources

            case 38: {
                var7_3 /* !! */  = (int)ad.cppe("cqfh", cppb(int ), (int)180);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 39: {
                var7_3 /* !! */  = (int)ad.cppe("cqfl", cppb(int ), (int)181);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl295:
            // 2 sources

            case 40: {
                var7_3 /* !! */  = (int)ad.cppe("cqfo", cppb(int ), (int)182);
                if (!var8_2) break;
                throw null;
            }
lbl299:
            // 3 sources

            case 41: {
                var7_3 /* !! */  = (int)ad.cppe("cqfq", cppb(int ), (int)183);
                if (!var8_2) ** GOTO lbl105
                throw null;
            }
lbl303:
            // 2 sources

            case 42: {
                var7_3 /* !! */  = (int)ad.cppe("cqft", cppb(int ), (int)184);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl418
            }
            case 43: {
                var7_3 /* !! */  = (int)ad.cppe("cqfw", cppb(int ), (int)185);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
            case 44: {
                var7_3 /* !! */  = (int)ad.cppe("cqfz", cppb(int ), (int)186);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl317:
            // 5 sources

            case 45: {
                var7_3 /* !! */  = (int)ad.cppe("cqga", cppb(int ), (int)187);
                if (!var8_2) ** GOTO lbl280
                throw null;
            }
lbl321:
            // 3 sources

            case 46: {
                var7_3 /* !! */  = (int)ad.cppe("cqgd", cppb(int ), (int)188);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl326:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)ad.cppe("cqgg", cppb(int ), (int)189);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
lbl330:
            // 2 sources

            case 48: {
                var7_3 /* !! */  = (int)ad.cppe("cqgi", cppb(int ), (int)190);
                if (!var8_2) ** GOTO lbl321
                throw null;
            }
            case 49: {
                var7_3 /* !! */  = (int)ad.cppe("cqgj", cppb(int ), (int)191);
                if (!var8_2) ** GOTO lbl280
                throw null;
            }
lbl338:
            // 3 sources

            case 50: {
                var7_3 /* !! */  = (int)ad.cppe("cqgs", cppb(int ), (int)192);
                if (!var8_2) ** GOTO lbl164
                throw null;
            }
            case 51: {
                var7_3 /* !! */  = (int)ad.cppe("cqgv", cppb(int ), (int)193);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl347:
            // 2 sources

            case 52: {
                var7_3 /* !! */  = (int)ad.cppe("cqgx", cppb(int ), (int)194);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
lbl351:
            // 2 sources

            case 53: {
                var7_3 /* !! */  = (int)ad.cppe("cqha", cppb(int ), (int)195);
                if (!var8_2) ** GOTO lbl223
                throw null;
            }
            case 54: {
                var7_3 /* !! */  = (int)ad.cppe("cqhd", cppb(int ), (int)196);
                if (!var8_2) ** GOTO lbl145
                throw null;
            }
lbl359:
            // 2 sources

            case 55: {
                var7_3 /* !! */  = (int)ad.cppe("cqhf", cppb(int ), (int)197);
                if (!var8_2) ** GOTO lbl199
                throw null;
            }
lbl363:
            // 2 sources

            case 56: {
                var7_3 /* !! */  = (int)ad.cppe("cqhi", cppb(int ), (int)198);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl368:
            // 2 sources

            case 57: {
                var7_3 /* !! */  = (int)ad.cppe("cqhl", cppb(int ), (int)199);
                if (!var8_2) ** GOTO lbl218
                throw null;
            }
lbl372:
            // 4 sources

            case 58: {
                var7_3 /* !! */  = (int)ad.cppe("cqho", cppb(int ), (int)200);
                if (!var8_2) ** GOTO lbl321
                throw null;
            }
            case 59: {
                var7_3 /* !! */  = (int)ad.cppe("cqhq", cppb(int ), (int)201);
                if (!var8_2) ** GOTO lbl338
                throw null;
            }
            case 60: {
                var7_3 /* !! */  = (int)ad.cppe("cqhr", cppb(int ), (int)202);
                if (!var8_2) ** GOTO lbl140
                throw null;
            }
lbl384:
            // 4 sources

            case 61: {
                var7_3 /* !! */  = (int)ad.cppe("cqhs", cppb(int ), (int)203);
                if (!var8_2) ** GOTO lbl155
                throw null;
            }
            case 62: {
                var7_3 /* !! */  = (int)ad.cppe("cqhu", cppb(int ), (int)204);
                if (!var8_2) ** GOTO lbl330
                throw null;
            }
lbl392:
            // 2 sources

            case 63: {
                var7_3 /* !! */  = (int)ad.cppe("cqhy", cppb(int ), (int)205);
                if (!var8_2) ** GOTO lbl110
                throw null;
            }
lbl396:
            // 2 sources

            case 64: {
                var7_3 /* !! */  = (int)ad.cppe("cqib", cppb(int ), (int)206);
                if (var8_2) {
                    throw null;
                }
            }
lbl400:
            // 4 sources

            case 65: {
                var7_3 /* !! */  = (int)ad.cppe("cqif", cppb(int ), (int)207);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl405:
            // 4 sources

            case 66: {
                var7_3 /* !! */  = (int)ad.cppe("cqih", cppb(int ), (int)208);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 67: {
                var7_3 /* !! */  = (int)ad.cppe("cqik", cppb(int ), (int)209);
                if (!var8_2) ** GOTO lbl317
                throw null;
            }
lbl414:
            // 2 sources

            case 68: {
                var7_3 /* !! */  = (int)ad.cppe("cqin", cppb(int ), (int)210);
                if (!var8_2) ** GOTO lbl110
                throw null;
            }
lbl418:
            // 2 sources

            case 69: {
                var7_3 /* !! */  = (int)ad.cppe("cqir", cppb(int ), (int)211);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
lbl422:
            // 3 sources

            case 70: {
                var7_3 /* !! */  = (int)ad.cppe("cqiu", cppb(int ), (int)212);
                if (!var8_2) ** GOTO lbl338
                throw null;
            }
lbl426:
            // 2 sources

            case 71: {
                var7_3 /* !! */  = (int)ad.cppe("cqix", cppb(int ), (int)213);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl435
            }
lbl431:
            // 2 sources

            case 72: {
                var7_3 /* !! */  = (int)ad.cppe("cqja", cppb(int ), (int)214);
                if (!var8_2) ** GOTO lbl317
                throw null;
            }
lbl435:
            // 3 sources

            case 73: {
                var7_3 /* !! */  = (int)ad.cppe("cqjc", cppb(int ), (int)215);
                if (!var8_2) ** GOTO lbl303
                throw null;
            }
            case 74: {
                var7_3 /* !! */  = (int)ad.cppe("cqjd", cppb(int ), (int)216);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
            case 75: {
                var7_3 /* !! */  = (int)ad.cppe("cqjf", cppb(int ), (int)217);
                if (!var8_2) ** GOTO lbl299
                throw null;
            }
            case 76: {
                var7_3 /* !! */  = (int)ad.cppe("cqjj", cppb(int ), (int)218);
                if (!var8_2) ** GOTO lbl372
                throw null;
            }
            case 77: {
                var7_3 /* !! */  = (int)ad.cppe("cqjn", cppb(int ), (int)219);
                if (!var8_2) ** GOTO lbl204
                throw null;
            }
lbl455:
            // 3 sources

            case 78: {
                var7_3 /* !! */  = (int)ad.cppe("cqjp", cppb(int ), (int)220);
                if (!var8_2) ** GOTO lbl396
                throw null;
            }
            case 79: {
                var7_3 /* !! */  = (int)ad.cppe("cqjs", cppb(int ), (int)221);
                if (!var8_2) ** GOTO lbl405
                throw null;
            }
            case 80: 
        }
        var7_3 /* !! */  = (int)ad.cppe("cqjw", cppb(int ), (int)222);
        ** while (!var8_2)
lbl466:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void deserializeAutoBuy(JsonObject var1_1) {
        block97: {
            var14_2 = ad.c;
            var13_3 /* !! */  = ad.b;
            var12_4 = ad.a;
            if (var14_2) {
                throw null;
lbl6:
                // 26 sources

                return;
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            var2_5 = ae.getInstance();
            if (var12_4 || var12_4) ** GOTO lbl6
            if (!var1_1.has("globalEnabled")) break block97;
            if (var12_4 || var12_4) ** GOTO lbl6
            var2_5.setGlobalEnabled(var1_1.get("globalEnabled").getAsBoolean());
            if (var12_4) ** GOTO lbl6
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        if (!var1_1.has("items")) ** GOTO lbl71
        if (var12_4 || var12_4) ** GOTO lbl6
        var3_6 = var1_1.getAsJsonObject("items");
        if (var12_4 || var12_4) ** GOTO lbl6
        var4_7 = var3_6.entrySet().iterator();
        if (var12_4) ** GOTO lbl6
        block52: while (true) {
            if (var12_4 || var12_4) ** GOTO lbl6
            if (!var4_7.hasNext()) ** GOTO lbl71
            if (var12_4) ** GOTO lbl6
            var5_8 = (Map.Entry)var4_7.next();
            if (var12_4 || var12_4) ** GOTO lbl6
            var6_9 = (String)var5_8.getKey();
            if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var7_10 = ((JsonElement)var5_8.getValue()).getAsJsonObject();
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (!var7_10.has("enabled")) ** GOTO lbl44
                    if (var12_4) ** GOTO lbl6
                    if (!var7_10.get("enabled").getAsBoolean()) ** GOTO lbl44
                    if (var12_4) ** GOTO lbl6
                    v0 = ad.cppe("cqtp", cppb(int ), (int)312);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl46
lbl44:
                    // 2 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    v0 = var8_11 = ad.cppe("cqtq", cppb(int ), (int)313);
lbl46:
                    // 2 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (!var7_10.has("buyBelow")) ** GOTO lbl53
                    if (var12_4) ** GOTO lbl6
                    v1 /* !! */  = var7_10.get("buyBelow").getAsInt();
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl55
lbl53:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    v1 /* !! */  = var9_12 /* !! */  = (int)ad.cppe("cqtr", cppb(int ), (int)314);
lbl55:
                    // 2 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (!var7_10.has("minQuantity")) ** GOTO lbl62
                    if (var12_4) ** GOTO lbl6
                    v2 /* !! */  = var7_10.get("minQuantity").getAsInt();
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl64
lbl62:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    v2 /* !! */  = var10_13 /* !! */  = (int)ad.cppe("cqtt", cppb(int ), (int)315);
lbl64:
                    // 2 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    var11_14 = new ae$ItemConfig((boolean)var8_11, var9_12 /* !! */ , var10_13 /* !! */ );
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var2_5.setItemConfig(var6_9, var11_14);
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (!var14_2) continue block52;
                    throw null;
                }
lbl71:
                // 2 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
lbl74:
                // 2 sources

                case 0: {
                    var13_3 /* !! */  = (int)ad.cppe("cqtu", cppb(int ), (int)316);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 1: {
                    var13_3 /* !! */  = (int)ad.cppe("cqtv", cppb(int ), (int)317);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
lbl84:
                // 2 sources

                case 2: {
                    var13_3 /* !! */  = (int)ad.cppe("cqtw", cppb(int ), (int)318);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
                case 3: {
                    var13_3 /* !! */  = (int)ad.cppe("cqtx", cppb(int ), (int)319);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl99
                }
lbl94:
                // 3 sources

                case 4: {
                    var13_3 /* !! */  = (int)ad.cppe("cqty", cppb(int ), (int)320);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl99:
                // 3 sources

                case 5: {
                    var13_3 /* !! */  = (int)ad.cppe("cqua", cppb(int ), (int)321);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl104:
                // 5 sources

                case 6: {
                    var13_3 /* !! */  = (int)ad.cppe("cqub", cppb(int ), (int)322);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl109:
                // 3 sources

                case 7: {
                    var13_3 /* !! */  = (int)ad.cppe("cquc", cppb(int ), (int)323);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
                case 8: {
                    var13_3 /* !! */  = (int)ad.cppe("cqud", cppb(int ), (int)324);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl170
                }
lbl119:
                // 4 sources

                case 9: {
                    var13_3 /* !! */  = (int)ad.cppe("cquf", cppb(int ), (int)325);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
lbl124:
                // 3 sources

                case 10: {
                    var13_3 /* !! */  = (int)ad.cppe("cqug", cppb(int ), (int)326);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
lbl129:
                // 3 sources

                case 11: {
                    var13_3 /* !! */  = (int)ad.cppe("cquh", cppb(int ), (int)327);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 12: {
                    var13_3 /* !! */  = (int)ad.cppe("cqui", cppb(int ), (int)328);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl214
                }
lbl139:
                // 2 sources

                case 13: {
                    var13_3 /* !! */  = (int)ad.cppe("cquj", cppb(int ), (int)329);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl144:
                // 3 sources

                case 14: {
                    var13_3 /* !! */  = (int)ad.cppe("cqul", cppb(int ), (int)330);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl206
                }
lbl149:
                // 4 sources

                case 15: {
                    var13_3 /* !! */  = (int)ad.cppe("cqum", cppb(int ), (int)331);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl244
                }
                case 16: {
                    var13_3 /* !! */  = (int)ad.cppe("cqun", cppb(int ), (int)332);
                    if (!var14_2) ** GOTO lbl119
                    throw null;
                }
lbl158:
                // 2 sources

                case 17: {
                    var13_3 /* !! */  = (int)ad.cppe("cquo", cppb(int ), (int)333);
                    if (!var14_2) ** GOTO lbl84
                    throw null;
                }
                case 18: {
                    var13_3 /* !! */  = (int)ad.cppe("cquq", cppb(int ), (int)334);
                    if (!var14_2) ** GOTO lbl99
                    throw null;
                }
lbl166:
                // 3 sources

                case 19: {
                    var13_3 /* !! */  = (int)ad.cppe("cqur", cppb(int ), (int)335);
                    if (!var14_2) ** GOTO lbl119
                    throw null;
                }
lbl170:
                // 2 sources

                case 20: {
                    var13_3 /* !! */  = (int)ad.cppe("cqus", cppb(int ), (int)336);
                    if (!var14_2) ** GOTO lbl104
                    throw null;
                }
                case 21: {
                    var13_3 /* !! */  = (int)ad.cppe("cqut", cppb(int ), (int)337);
                    if (!var14_2) ** GOTO lbl74
                    throw null;
                }
                case 22: {
                    var13_3 /* !! */  = (int)ad.cppe("cquv", cppb(int ), (int)338);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
                case 23: {
                    var13_3 /* !! */  = (int)ad.cppe("cquw", cppb(int ), (int)339);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl232
                }
lbl188:
                // 2 sources

                case 24: {
                    var13_3 /* !! */  = (int)ad.cppe("cqux", cppb(int ), (int)340);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl277
                }
lbl193:
                // 3 sources

                case 25: {
                    var13_3 /* !! */  = (int)ad.cppe("cquz", cppb(int ), (int)341);
                    if (!var14_2) ** GOTO lbl104
                    throw null;
                }
lbl197:
                // 2 sources

                case 26: {
                    var13_3 /* !! */  = (int)ad.cppe("cqva", cppb(int ), (int)342);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl261
                }
                case 27: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvb", cppb(int ), (int)343);
                    if (var14_2) {
                        throw null;
                    }
                }
lbl206:
                // 4 sources

                case 28: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvc", cppb(int ), (int)344);
                    if (!var14_2) ** GOTO lbl124
                    throw null;
                }
lbl210:
                // 2 sources

                case 29: {
                    var13_3 /* !! */  = (int)ad.cppe("cqve", cppb(int ), (int)345);
                    if (!var14_2) ** GOTO lbl124
                    throw null;
                }
lbl214:
                // 3 sources

                case 30: {
                    do {
                        var13_3 /* !! */  = (int)ad.cppe("cqvf", cppb(int ), (int)346);
                    } while (!var14_2);
                    throw null;
                }
lbl219:
                // 2 sources

                case 31: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvg", cppb(int ), (int)347);
                    if (!var14_2) ** GOTO lbl193
                    throw null;
                }
                case 32: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvi", cppb(int ), (int)348);
                    if (!var14_2) ** GOTO lbl193
                    throw null;
                }
                case 33: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_3 /* !! */  = (int)ad.cppe("cqvj", cppb(int ), (int)349);
                        if (!var14_2) ** GOTO lbl104
                        throw null;
                    }
                }
lbl232:
                // 2 sources

                case 34: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvk", cppb(int ), (int)350);
                    if (!var14_2) ** GOTO lbl119
                    throw null;
                }
lbl236:
                // 2 sources

                case 35: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvl", cppb(int ), (int)351);
                    if (!var14_2) ** GOTO lbl149
                    throw null;
                }
                case 36: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvn", cppb(int ), (int)352);
                    if (!var14_2) ** GOTO lbl94
                    throw null;
                }
lbl244:
                // 2 sources

                case 37: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvo", cppb(int ), (int)353);
                    if (!var14_2) ** GOTO lbl109
                    throw null;
                }
                case 38: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvp", cppb(int ), (int)354);
                    if (!var14_2) ** GOTO lbl219
                    throw null;
                }
                case 39: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvq", cppb(int ), (int)355);
                    if (!var14_2) ** GOTO lbl188
                    throw null;
                }
                case 40: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvs", cppb(int ), (int)356);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
lbl261:
                // 2 sources

                case 41: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvt", cppb(int ), (int)357);
                    if (!var14_2) ** GOTO lbl109
                    throw null;
                }
                case 42: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvu", cppb(int ), (int)358);
                    if (!var14_2) ** GOTO lbl94
                    throw null;
                }
lbl269:
                // 3 sources

                case 43: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvv", cppb(int ), (int)359);
                    if (!var14_2) ** GOTO lbl144
                    throw null;
                }
                case 44: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvx", cppb(int ), (int)360);
                    if (!var14_2) ** GOTO lbl166
                    throw null;
                }
lbl277:
                // 3 sources

                case 45: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvy", cppb(int ), (int)361);
                    if (!var14_2) ** GOTO lbl236
                    throw null;
                }
                case 46: {
                    var13_3 /* !! */  = (int)ad.cppe("cqvz", cppb(int ), (int)362);
                    if (!var14_2) ** GOTO lbl197
                    throw null;
                }
                case 47: {
                    var13_3 /* !! */  = (int)ad.cppe("cqwa", cppb(int ), (int)363);
                    if (!var14_2) ** GOTO lbl104
                    throw null;
                }
                case 48: 
            }
            break;
        }
        var13_3 /* !! */  = (int)ad.cppe("cqwc", cppb(int ), (int)364);
        ** while (!var14_2)
lbl292:
        // 1 sources

        throw null;
    }

    static {
        cppc = new int[670];
        cppd = new int[670];
        ad.crkd();
        ad.crke();
        ad.crkf();
        ad.crkg();
        ad.crkh();
        ad.crki();
        ad.crkj();
        ad.crkk();
        ad.crkl();
        ad.crkm();
        ad.crkn();
        ad.crko();
        ad.crkp();
        ad.crkq();
        cpsc = new long[94];
        cpsd = new long[94];
        ad.crkr();
        ad.crks();
        GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String serialize() {
        var9_1 = ad.c;
        var8_2 /* !! */  = ad.b;
        var7_3 = ad.a;
        if (var9_1) {
            throw null;
lbl6:
            // 19 sources

            return null;
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var1_4 = new JsonObject();
        if (var7_3 || var7_3) ** GOTO lbl6
        var2_5 = new JsonObject();
        if (var7_3 || var7_3) ** GOTO lbl6
        var3_6 = this.getModuleRepository();
        if (var7_3 || var7_3) ** GOTO lbl6
        if (var3_6 == null) ** GOTO lbl35
        if (var7_3 || var7_3) ** GOTO lbl6
        var4_7 = var3_6.modules().iterator();
        if (var7_3) ** GOTO lbl6
        block40: while (true) {
            if (var7_3) ** GOTO lbl6
            if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_3) ** GOTO lbl6
                    if (!var4_7.hasNext()) ** GOTO lbl35
                    if (var7_3) ** GOTO lbl6
                    var5_8 = var4_7.next();
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var6_9 = this.serializeModule(var5_8);
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var2_5.add(var5_8.getName(), (JsonElement)var6_9);
                    if (var7_3 || var7_3) ** GOTO lbl6
                    if (!var9_1) continue block40;
                    throw null;
lbl35:
                    // 2 sources

                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.add("modules", (JsonElement)var2_5);
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.add("hud", (JsonElement)this.serializeHud());
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.add("autobuy", (JsonElement)this.serializeAutoBuy());
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.addProperty("version", "3.0");
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.addProperty("timestamp", (Number)System.currentTimeMillis());
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4.addProperty("client", "Phobia Beta");
                    if (!var7_3 && !var7_3) ** break;
                    ** continue;
                    return ad.GSON.toJson((JsonElement)var1_4);
                }
                case 0: {
                    var8_2 /* !! */  = (int)ad.cppe("cppf", cppb(int ), (int)0);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl113
                }
lbl55:
                // 3 sources

                case 1: {
                    var8_2 /* !! */  = (int)ad.cppe("cppg", cppb(int ), (int)1);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl117
                }
lbl60:
                // 2 sources

                case 2: {
                    var8_2 /* !! */  = (int)ad.cppe("cpph", cppb(int ), (int)2);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl84
                }
lbl65:
                // 3 sources

                case 3: {
                    var8_2 /* !! */  = (int)ad.cppe("cppi", cppb(int ), (int)3);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl70:
                // 2 sources

                case 4: {
                    var8_2 /* !! */  = (int)ad.cppe("cppj", cppb(int ), (int)4);
                    if (var9_1) {
                        throw null;
                    }
                }
                case 5: {
                    var8_2 /* !! */  = (int)ad.cppe("cppk", cppb(int ), (int)5);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
                case 6: {
                    var8_2 /* !! */  = (int)ad.cppe("cppl", cppb(int ), (int)6);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl117
                }
lbl84:
                // 3 sources

                case 7: {
                    var8_2 /* !! */  = (int)ad.cppe("cppm", cppb(int ), (int)7);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl99
                }
                case 8: {
                    var8_2 /* !! */  = (int)ad.cppe("cppn", cppb(int ), (int)8);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
                case 9: {
                    var8_2 /* !! */  = (int)ad.cppe("cppo", cppb(int ), (int)9);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl99:
                // 2 sources

                case 10: {
                    var8_2 /* !! */  = (int)ad.cppe("cppp", cppb(int ), (int)10);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
                case 11: {
                    var8_2 /* !! */  = (int)ad.cppe("cppq", cppb(int ), (int)11);
                    if (!var9_1) break block40;
                    throw null;
                }
                case 12: {
                    var8_2 /* !! */  = (int)ad.cppe("cppr", cppb(int ), (int)12);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl113:
                // 2 sources

                case 13: {
                    var8_2 /* !! */  = (int)ad.cppe("cpps", cppb(int ), (int)13);
                    if (!var9_1) ** GOTO lbl65
                    throw null;
                }
lbl117:
                // 4 sources

                case 14: {
                    var8_2 /* !! */  = (int)ad.cppe("cppt", cppb(int ), (int)14);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl122:
                // 2 sources

                case 15: {
                    var8_2 /* !! */  = (int)ad.cppe("cppu", cppb(int ), (int)15);
                    if (!var9_1) ** GOTO lbl70
                    throw null;
                }
                case 16: {
                    var8_2 /* !! */  = (int)ad.cppe("cppv", cppb(int ), (int)16);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl169
                }
lbl131:
                // 2 sources

                case 17: {
                    var8_2 /* !! */  = (int)ad.cppe("cppw", cppb(int ), (int)17);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl136:
                // 3 sources

                case 18: {
                    var8_2 /* !! */  = (int)ad.cppe("cppx", cppb(int ), (int)18);
                    if (!var9_1) ** GOTO lbl122
                    throw null;
                }
                case 19: {
                    var8_2 /* !! */  = (int)ad.cppe("cppy", cppb(int ), (int)19);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 20: {
                    var8_2 /* !! */  = (int)ad.cppe("cppz", cppb(int ), (int)20);
                    if (!var9_1) ** GOTO lbl60
                    throw null;
                }
lbl149:
                // 3 sources

                case 21: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqa", cppb(int ), (int)21);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
                case 22: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqb", cppb(int ), (int)22);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
                case 23: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqc", cppb(int ), (int)23);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
lbl164:
                // 2 sources

                case 24: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqd", cppb(int ), (int)24);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl182
                }
lbl169:
                // 2 sources

                case 25: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqe", cppb(int ), (int)25);
                    if (!var9_1) ** GOTO lbl65
                    throw null;
                }
lbl173:
                // 2 sources

                case 26: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqf", cppb(int ), (int)26);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
                case 27: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqg", cppb(int ), (int)27);
                    if (!var9_1) break block40;
                    throw null;
                }
lbl182:
                // 4 sources

                case 28: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqh", cppb(int ), (int)28);
                    if (!var9_1) ** GOTO lbl55
                    throw null;
                }
lbl186:
                // 2 sources

                case 29: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqi", cppb(int ), (int)29);
                    if (!var9_1) ** GOTO lbl149
                    throw null;
                }
                case 30: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_2 /* !! */  = (int)ad.cppe("cpqj", cppb(int ), (int)30);
                        if (!var9_1) ** GOTO lbl136
                        throw null;
                    }
                }
lbl195:
                // 2 sources

                case 31: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqk", cppb(int ), (int)31);
                    if (!var9_1) ** GOTO lbl131
                    throw null;
                }
lbl199:
                // 4 sources

                case 32: {
                    var8_2 /* !! */  = (int)ad.cppe("cpql", cppb(int ), (int)32);
                    if (!var9_1) ** GOTO lbl55
                    throw null;
                }
lbl203:
                // 2 sources

                case 33: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqm", cppb(int ), (int)33);
                    if (!var9_1) ** GOTO lbl117
                    throw null;
                }
lbl207:
                // 2 sources

                case 34: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqn", cppb(int ), (int)34);
                    if (!var9_1) ** GOTO lbl84
                    throw null;
                }
lbl211:
                // 2 sources

                case 35: {
                    var8_2 /* !! */  = (int)ad.cppe("cpqo", cppb(int ), (int)35);
                    if (!var9_1) ** GOTO lbl173
                    throw null;
                }
                case 36: 
            }
            break;
        }
        var8_2 /* !! */  = (int)ad.cppe("cpqp", cppb(int ), (int)36);
        ** while (!var9_1)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void crkj() {
        ad.cppc[600] = -1830163759;
        ad.cppc[601] = 1732073254;
        ad.cppc[602] = 688819117;
        ad.cppc[603] = 685834204;
        ad.cppc[604] = -85087694;
        ad.cppc[605] = -1183553079;
        ad.cppc[606] = 2060841462;
        ad.cppc[607] = -1115388980;
        ad.cppc[608] = -1955056801;
        ad.cppc[609] = -991450754;
        ad.cppc[610] = -1295059382;
        ad.cppc[611] = -1703565014;
        ad.cppc[612] = -601851825;
        ad.cppc[613] = -1047016664;
        ad.cppc[614] = 1655386616;
        ad.cppc[615] = 196271883;
        ad.cppc[616] = 0x63377677;
        ad.cppc[617] = -600662820;
        ad.cppc[618] = 13138720;
        ad.cppc[619] = 1374577017;
        ad.cppc[620] = -1180578577;
        ad.cppc[621] = 1201615116;
        ad.cppc[622] = 2046721207;
        ad.cppc[623] = 1913252340;
        ad.cppc[624] = -1087919986;
        ad.cppc[625] = -1663318688;
        ad.cppc[626] = 1269530978;
        ad.cppc[627] = 2123035707;
        ad.cppc[628] = -1373323360;
        ad.cppc[629] = 165817430;
        ad.cppc[630] = -1880280480;
        ad.cppc[631] = 2068313820;
        ad.cppc[632] = 303783927;
        ad.cppc[633] = -1057927246;
        ad.cppc[634] = -976613912;
        ad.cppc[635] = -899061756;
        ad.cppc[636] = -1580540107;
        ad.cppc[637] = -1095708333;
        ad.cppc[638] = 818482595;
        ad.cppc[639] = -181587501;
        ad.cppc[640] = -1914705796;
        ad.cppc[641] = -1048990556;
        ad.cppc[642] = 839976540;
        ad.cppc[643] = -1687849575;
        ad.cppc[644] = -448966134;
        ad.cppc[645] = 281942972;
        ad.cppc[646] = 869684;
        ad.cppc[647] = 381414197;
        ad.cppc[648] = -70732599;
        ad.cppc[649] = -1638212655;
        ad.cppc[650] = -1205418807;
        ad.cppc[651] = -1039842174;
        ad.cppc[652] = -765783474;
        ad.cppc[653] = 1384261397;
        ad.cppc[654] = 159708481;
        ad.cppc[655] = 253314288;
        ad.cppc[656] = 878404564;
        ad.cppc[657] = -1793042840;
        ad.cppc[658] = -340069832;
        ad.cppc[659] = 2067735214;
        ad.cppc[660] = -1730647876;
        ad.cppc[661] = -1457496542;
        ad.cppc[662] = -708547910;
        ad.cppc[663] = 1992961125;
        ad.cppc[664] = -1092919843;
        ad.cppc[665] = -2136468659;
        ad.cppc[666] = 1803912918;
        ad.cppc[667] = 1225617760;
        ad.cppc[668] = 885552666;
        ad.cppc[669] = 1999905994;
    }

    private static /* synthetic */ void crks() {
        ad.cpsd[0] = 2148482334552155957L;
        ad.cpsd[1] = -8062870238577846680L;
        ad.cpsd[2] = -527802539463534736L;
        ad.cpsd[3] = 2048278926806551408L;
        ad.cpsd[4] = 8631303176389536459L;
        ad.cpsd[5] = 1054764583851991891L;
        ad.cpsd[6] = -1693507542685980295L;
        ad.cpsd[7] = 3697371530596764449L;
        ad.cpsd[8] = 1177667549322335431L;
        ad.cpsd[9] = -592890648914861157L;
        ad.cpsd[10] = -2686987504828538136L;
        ad.cpsd[11] = 6508139269224114433L;
        ad.cpsd[12] = 1500627349964120569L;
        ad.cpsd[13] = 7258285965353723746L;
        ad.cpsd[14] = -219744090758110476L;
        ad.cpsd[15] = -3583620356653897244L;
        ad.cpsd[16] = -1481860127343990924L;
        ad.cpsd[17] = 7288126496336114336L;
        ad.cpsd[18] = 1360247505021875475L;
        ad.cpsd[19] = -21867590551123795L;
        ad.cpsd[20] = -8013020818992669933L;
        ad.cpsd[21] = -2339684649676885184L;
        ad.cpsd[22] = -4122678164485510752L;
        ad.cpsd[23] = -3821156725673823077L;
        ad.cpsd[24] = -6190806850011915868L;
        ad.cpsd[25] = -1944431130251489963L;
        ad.cpsd[26] = 2833590185138556561L;
        ad.cpsd[27] = 6662005498886487040L;
        ad.cpsd[28] = 1576618765197923639L;
        ad.cpsd[29] = -7071979893411210054L;
        ad.cpsd[30] = 6326527231093575282L;
        ad.cpsd[31] = 2011631488919690929L;
        ad.cpsd[32] = 7619969726474071524L;
        ad.cpsd[33] = 6736472808278993395L;
        ad.cpsd[34] = 1740682268460191854L;
        ad.cpsd[35] = -6940776329267145503L;
        ad.cpsd[36] = -288087018008727468L;
        ad.cpsd[37] = 1930618648701065029L;
        ad.cpsd[38] = -2074398141611828503L;
        ad.cpsd[39] = -6953494099117378916L;
        ad.cpsd[40] = -1144917320346042378L;
        ad.cpsd[41] = -5746202041149497965L;
        ad.cpsd[42] = 8369323749626183758L;
        ad.cpsd[43] = 2669063378036148400L;
        ad.cpsd[44] = -7579465303141997255L;
        ad.cpsd[45] = 5086228983861134421L;
        ad.cpsd[46] = -5751929233940122814L;
        ad.cpsd[47] = 7974351520692580146L;
        ad.cpsd[48] = -3638640209812462833L;
        ad.cpsd[49] = 8808633883766024647L;
        ad.cpsd[50] = -2036351486407421073L;
        ad.cpsd[51] = 8202604154382909079L;
        ad.cpsd[52] = 950384620095659928L;
        ad.cpsd[53] = 3937879319754832251L;
        ad.cpsd[54] = -7674065674399730806L;
        ad.cpsd[55] = 4446772111485374054L;
        ad.cpsd[56] = -836124128014548960L;
        ad.cpsd[57] = -5150568693739381580L;
        ad.cpsd[58] = 8485619941488521015L;
        ad.cpsd[59] = 256235052690447892L;
        ad.cpsd[60] = -3449699688540893801L;
        ad.cpsd[61] = 8798689812930413189L;
        ad.cpsd[62] = 8521019731808164628L;
        ad.cpsd[63] = 8158716026110251450L;
        ad.cpsd[64] = -284892705891910881L;
        ad.cpsd[65] = -4366920583053115747L;
        ad.cpsd[66] = 6183649520569740344L;
        ad.cpsd[67] = 9193233958276721107L;
        ad.cpsd[68] = 4449011024974751101L;
        ad.cpsd[69] = 6533339901122251040L;
        ad.cpsd[70] = -2201637746338908280L;
        ad.cpsd[71] = 194683905746205781L;
        ad.cpsd[72] = 9220032679014482645L;
        ad.cpsd[73] = 8224913009317123912L;
        ad.cpsd[74] = 1979129977160682782L;
        ad.cpsd[75] = 7098758129361155791L;
        ad.cpsd[76] = -5473243072258861917L;
        ad.cpsd[77] = -5840707865371226004L;
        ad.cpsd[78] = 6572150547256840149L;
        ad.cpsd[79] = 476908906543280071L;
        ad.cpsd[80] = -2828328710491077106L;
        ad.cpsd[81] = -6720877746594699605L;
        ad.cpsd[82] = -6954472872070530511L;
        ad.cpsd[83] = -7907245130409722541L;
        ad.cpsd[84] = 6237330970669476904L;
        ad.cpsd[85] = 8495209436871803710L;
        ad.cpsd[86] = 5530321388599118832L;
        ad.cpsd[87] = 6479297175729109389L;
        ad.cpsd[88] = 6153038991712406635L;
        ad.cpsd[89] = 8743800721543522920L;
        ad.cpsd[90] = 7727468574431214473L;
        ad.cpsd[91] = -4584648712987711589L;
        ad.cpsd[92] = 3030863543075641237L;
        ad.cpsd[93] = -1231192345514873932L;
    }

    private static /* synthetic */ int cppb(int n2) {
        return cppc[n2] ^ cppd[n2];
    }

    private static /* synthetic */ void crke() {
        ad.cppc[100] = -1609063306;
        ad.cppc[101] = -1609964715;
        ad.cppc[102] = -1830913803;
        ad.cppc[103] = -551812255;
        ad.cppc[104] = 1862145537;
        ad.cppc[105] = 845336909;
        ad.cppc[106] = -1697338930;
        ad.cppc[107] = 330280323;
        ad.cppc[108] = -1715648241;
        ad.cppc[109] = 177913633;
        ad.cppc[110] = 534369656;
        ad.cppc[111] = -1844769763;
        ad.cppc[112] = 1438433251;
        ad.cppc[113] = -1380964346;
        ad.cppc[114] = 1054929854;
        ad.cppc[115] = -1354143520;
        ad.cppc[116] = -2070131863;
        ad.cppc[117] = -682597497;
        ad.cppc[118] = -1205639511;
        ad.cppc[119] = -434857371;
        ad.cppc[120] = -824896627;
        ad.cppc[121] = -1642984275;
        ad.cppc[122] = -553987763;
        ad.cppc[123] = -166096784;
        ad.cppc[124] = -1677928676;
        ad.cppc[125] = 256563908;
        ad.cppc[126] = -545881908;
        ad.cppc[127] = 1556064184;
        ad.cppc[128] = 1622058906;
        ad.cppc[129] = -84090029;
        ad.cppc[130] = 866864466;
        ad.cppc[131] = 696374641;
        ad.cppc[132] = 546088554;
        ad.cppc[133] = 530740553;
        ad.cppc[134] = -1991830666;
        ad.cppc[135] = 245760172;
        ad.cppc[136] = 2013431067;
        ad.cppc[137] = -1101068897;
        ad.cppc[138] = 1960783127;
        ad.cppc[139] = -301982381;
        ad.cppc[140] = -1381446007;
        ad.cppc[141] = -40969090;
        ad.cppc[142] = -1509717124;
        ad.cppc[143] = -164373672;
        ad.cppc[144] = 447036583;
        ad.cppc[145] = 2031516922;
        ad.cppc[146] = 1133926573;
        ad.cppc[147] = -1195310954;
        ad.cppc[148] = 476355781;
        ad.cppc[149] = 1080947724;
        ad.cppc[150] = 897729117;
        ad.cppc[151] = -783040794;
        ad.cppc[152] = -321975770;
        ad.cppc[153] = 158567590;
        ad.cppc[154] = 1441256246;
        ad.cppc[155] = -1265395127;
        ad.cppc[156] = 1759477964;
        ad.cppc[157] = -2846945;
        ad.cppc[158] = 1652326329;
        ad.cppc[159] = -851396506;
        ad.cppc[160] = 1955859050;
        ad.cppc[161] = -1164833140;
        ad.cppc[162] = -2057550580;
        ad.cppc[163] = 186164309;
        ad.cppc[164] = 1320946968;
        ad.cppc[165] = 521334627;
        ad.cppc[166] = 87623907;
        ad.cppc[167] = -1661410471;
        ad.cppc[168] = -1954644316;
        ad.cppc[169] = 1653840522;
        ad.cppc[170] = 501289278;
        ad.cppc[171] = -2142836854;
        ad.cppc[172] = 1506410315;
        ad.cppc[173] = -1294526144;
        ad.cppc[174] = -842513846;
        ad.cppc[175] = 1879719280;
        ad.cppc[176] = 981279040;
        ad.cppc[177] = 218399413;
        ad.cppc[178] = 299237491;
        ad.cppc[179] = 933165689;
        ad.cppc[180] = -130719778;
        ad.cppc[181] = 1490483252;
        ad.cppc[182] = 1081335514;
        ad.cppc[183] = 2092159073;
        ad.cppc[184] = -795374908;
        ad.cppc[185] = 1576378012;
        ad.cppc[186] = 100104331;
        ad.cppc[187] = 1269321263;
        ad.cppc[188] = -1278432220;
        ad.cppc[189] = -1397994161;
        ad.cppc[190] = -1589370439;
        ad.cppc[191] = 1972708831;
        ad.cppc[192] = -518347384;
        ad.cppc[193] = 563405518;
        ad.cppc[194] = -30980486;
        ad.cppc[195] = -1718514084;
        ad.cppc[196] = 405804112;
        ad.cppc[197] = -2142473008;
        ad.cppc[198] = -440619540;
        ad.cppc[199] = 1348865807;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private JsonObject serializeModule(ds var1_1) {
        var9_2 = ad.c;
        var8_3 /* !! */  = ad.b;
        var7_4 = ad.a;
        if (var9_2) {
            throw null;
lbl6:
            // 17 sources

            return null;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = new JsonObject();
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5.addProperty("enabled", Boolean.valueOf(var1_1.isState()));
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5.addProperty("key", (Number)var1_1.getKey());
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5.addProperty("type", (Number)var1_1.getType());
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4 || var7_4) ** GOTO lbl6
                var2_5.addProperty("favorite", Boolean.valueOf(var1_1.isFavorite()));
                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6 = new JsonObject();
                if (var7_4 || var7_4) ** GOTO lbl6
                var4_7 = var1_1.settings().iterator();
                if (var7_4) ** GOTO lbl6
                do {
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (!var4_7.hasNext()) ** GOTO lbl41
                    if (var7_4) ** GOTO lbl6
                    var5_8 = var4_7.next();
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var6_9 = this.serializeSetting(var5_8);
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var6_9 == null) ** GOTO lbl38
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var3_6.add(var5_8.getName(), var6_9);
                    if (var7_4) ** GOTO lbl6
lbl38:
                    // 2 sources

                    if (var7_4 || var7_4) ** GOTO lbl6
                } while (!var9_2);
                throw null;
lbl41:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var2_5.add("settings", (JsonElement)var3_6);
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return var2_5;
            }
lbl46:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)ad.cppe("cpwk", cppb(int ), (int)108);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var8_3 /* !! */  = (int)ad.cppe("cpwm", cppb(int ), (int)109);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl56:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)ad.cppe("cpwo", cppb(int ), (int)110);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl61:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)ad.cppe("cpwp", cppb(int ), (int)111);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 4: {
                do {
                    var8_3 /* !! */  = (int)ad.cppe("cpwr", cppb(int ), (int)112);
                } while (!var9_2);
                throw null;
            }
lbl71:
            // 4 sources

            case 5: {
                var8_3 /* !! */  = (int)ad.cppe("cpwt", cppb(int ), (int)113);
                if (!var9_2) ** GOTO lbl61
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)ad.cppe("cpww", cppb(int ), (int)114);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl114
                    break;
                }
            }
            case 7: {
                var8_3 /* !! */  = (int)ad.cppe("cpwz", cppb(int ), (int)115);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl86:
            // 2 sources

            case 8: {
                do {
                    var8_3 /* !! */  = (int)ad.cppe("cpxc", cppb(int ), (int)116);
                } while (!var9_2);
                throw null;
            }
lbl91:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)ad.cppe("cpxf", cppb(int ), (int)117);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 10: {
                var8_3 /* !! */  = (int)ad.cppe("cpxj", cppb(int ), (int)118);
                if (!var9_2) ** GOTO lbl56
                throw null;
            }
lbl100:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)ad.cppe("cpxm", cppb(int ), (int)119);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 12: {
                var8_3 /* !! */  = (int)ad.cppe("cpxp", cppb(int ), (int)120);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl110:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)ad.cppe("cpxt", cppb(int ), (int)121);
                if (!var9_2) ** GOTO lbl71
                throw null;
            }
lbl114:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)ad.cppe("cpxv", cppb(int ), (int)122);
                if (var9_2) {
                    throw null;
                }
            }
            case 15: {
                var8_3 /* !! */  = (int)ad.cppe("cpxy", cppb(int ), (int)123);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl123:
            // 2 sources

            case 16: {
                var8_3 /* !! */  = (int)ad.cppe("cpyb", cppb(int ), (int)124);
                if (!var9_2) ** GOTO lbl46
                throw null;
            }
            case 17: {
                var8_3 /* !! */  = (int)ad.cppe("cpye", cppb(int ), (int)125);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
            case 18: {
                var8_3 /* !! */  = (int)ad.cppe("cpyh", cppb(int ), (int)126);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 19: {
                var8_3 /* !! */  = (int)ad.cppe("cpyk", cppb(int ), (int)127);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl141:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)ad.cppe("cpym", cppb(int ), (int)128);
                if (!var9_2) ** GOTO lbl71
                throw null;
            }
            case 21: {
                var8_3 /* !! */  = (int)ad.cppe("cpyo", cppb(int ), (int)129);
                if (!var9_2) ** GOTO lbl56
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)ad.cppe("cpyr", cppb(int ), (int)130);
                if (!var9_2) ** GOTO lbl71
                throw null;
            }
lbl153:
            // 2 sources

            case 23: {
                var8_3 /* !! */  = (int)ad.cppe("cpyv", cppb(int ), (int)131);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
            case 24: {
                var8_3 /* !! */  = (int)ad.cppe("cpyz", cppb(int ), (int)132);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl162:
            // 4 sources

            case 25: {
                var8_3 /* !! */  = (int)ad.cppe("cpzc", cppb(int ), (int)133);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl167:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)ad.cppe("cpze", cppb(int ), (int)134);
                if (!var9_2) break;
                throw null;
            }
lbl171:
            // 3 sources

            case 27: {
                var8_3 /* !! */  = (int)ad.cppe("cpzk", cppb(int ), (int)135);
                if (!var9_2) ** GOTO lbl153
                throw null;
            }
lbl175:
            // 2 sources

            case 28: {
                var8_3 /* !! */  = (int)ad.cppe("cpzm", cppb(int ), (int)136);
                if (!var9_2) ** GOTO lbl123
                throw null;
            }
lbl179:
            // 4 sources

            case 29: {
                var8_3 /* !! */  = (int)ad.cppe("cpzo", cppb(int ), (int)137);
                if (!var9_2) ** GOTO lbl175
                throw null;
            }
lbl183:
            // 2 sources

            case 30: {
                var8_3 /* !! */  = (int)ad.cppe("cpzu", cppb(int ), (int)138);
                if (!var9_2) ** GOTO lbl110
                throw null;
            }
            case 31: {
                var8_3 /* !! */  = (int)ad.cppe("cpzy", cppb(int ), (int)139);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
lbl191:
            // 3 sources

            case 32: {
                var8_3 /* !! */  = (int)ad.cppe("cqab", cppb(int ), (int)140);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
            case 33: 
        }
        var8_3 /* !! */  = (int)ad.cppe("cqae", cppb(int ), (int)141);
        ** while (!var9_2)
lbl198:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dr getModuleRepository() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ad.gd - ad.cppe("criu", cpsb(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ad.cppe("criv", cppb(int ), (int)648)) break;
            v0 /* !! */  = (long)ad.cppe("criw", cppb(int ), (int)649);
        }
        var4_1 = ad.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ad.gd - ad.cppe("crix", cpsb(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ad.cppe("criy", cppb(int ), (int)650)) break;
            v1 /* !! */  = (long)ad.cppe("criz", cppb(int ), (int)651);
        }
        var3_2 /* !! */  = ad.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ad.gd - ad.cppe("crja", cpsb(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ad.cppe("crjb", cppb(int ), (int)652)) break;
            v2 /* !! */  = (long)ad.cppe("crjc", cppb(int ), (int)653);
        }
        var2_3 = ad.a;
        if (var4_1) {
            throw null;
lbl24:
            // 5 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl24
        v3 /* !! */  = ad.gd;
        if (true) ** GOTO lbl31
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - ad.cppe("crjd", cpsb(int ), (int)84));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1625135696: {
                    v4 = ad.cppe("crje", cpsb(int ), (int)85);
                    continue block30;
                }
                case -1471905901: {
                    v4 = ad.cppe("crjf", cpsb(int ), (int)86);
                    continue block30;
                }
                case -1138011260: {
                    break block30;
                }
                case -631265349: {
                    v4 = ad.cppe("crjg", cpsb(int ), (int)87);
                    continue block30;
                }
            }
            break;
        }
        var1_4 = d.getInstance();
        if (var2_3 || var2_3) ** GOTO lbl24
        if (var1_4 == null) ** GOTO lbl82
        if (var2_3) ** GOTO lbl24
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ad.gd - ad.cppe("crjh", cpsb(int ), (int)88)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ad.cppe("crji", cppb(int ), (int)654)) break;
            v5 /* !! */  = (long)ad.cppe("crjj", cppb(int ), (int)655);
        }
        if (var1_4.getManager() == null) ** GOTO lbl82
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl24
                v6 /* !! */  = ad.gd;
                if (true) ** GOTO lbl62
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - ad.cppe("crjk", cpsb(int ), (int)89));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1251425911: {
                            v7 = ad.cppe("crjl", cpsb(int ), (int)90);
                            continue block32;
                        }
                        case -1138011260: {
                            break block32;
                        }
                        case 920271415: {
                            v7 = ad.cppe("crjm", cpsb(int ), (int)91);
                            continue block32;
                        }
                        case 1419321482: {
                            v7 = ad.cppe("crjn", cpsb(int ), (int)92);
                            continue block32;
                        }
                    }
                    break;
                }
                v8 = var1_4.getManager();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ad.gd - ad.cppe("crjo", cpsb(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ad.cppe("crjp", cppb(int ), (int)656)) break;
                    v9 /* !! */  = (long)ad.cppe("crjq", cppb(int ), (int)657);
                }
                return v8.getModuleRepository();
            }
lbl82:
            // 2 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return null;
lbl85:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ad.cppe("crjr", cppb(int ), (int)658);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl90:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)ad.cppe("crjs", cppb(int ), (int)659);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl95:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ad.cppe("crjt", cppb(int ), (int)660);
                if (!var4_1) ** GOTO lbl90
                throw null;
            }
lbl99:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ad.cppe("crju", cppb(int ), (int)661);
                    if (!var4_1) ** GOTO lbl90
                    throw null;
                }
            }
lbl104:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)ad.cppe("crjv", cppb(int ), (int)662);
                if (!var4_1) ** GOTO lbl99
                throw null;
            }
            case 5: {
                do {
                    var3_2 /* !! */  = (int)ad.cppe("crjw", cppb(int ), (int)663);
                } while (!var4_1);
                throw null;
            }
lbl113:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)ad.cppe("crjx", cppb(int ), (int)664);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)ad.cppe("crjy", cppb(int ), (int)665);
                if (var4_1) {
                    throw null;
                }
            }
            case 8: {
                var3_2 /* !! */  = (int)ad.cppe("crjz", cppb(int ), (int)666);
                if (!var4_1) ** GOTO lbl95
                throw null;
            }
            case 9: {
                do {
                    var3_2 /* !! */  = (int)ad.cppe("crka", cppb(int ), (int)667);
                } while (!var4_1);
                throw null;
            }
lbl130:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)ad.cppe("crkb", cppb(int ), (int)668);
                if (!var4_1) ** GOTO lbl85
                throw null;
            }
            case 11: 
        }
        var3_2 /* !! */  = (int)ad.cppe("crkc", cppb(int ), (int)669);
        ** while (!var4_1)
lbl137:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private JsonObject serializeAutoBuy() {
        var11_1 = ad.c;
        var10_2 /* !! */  = ad.b;
        var9_3 = ad.a;
        if (var11_1) {
            throw null;
lbl6:
            // 18 sources

            return null;
        }
        if (var9_3 || var9_3) ** GOTO lbl6
        var1_4 = new JsonObject();
        if (var9_3 || var9_3) ** GOTO lbl6
        var2_5 = ae.getInstance();
        if (var9_3 || var9_3) ** GOTO lbl6
        var1_4.addProperty("globalEnabled", Boolean.valueOf(var2_5.isGlobalEnabled()));
        if (var9_3 || var9_3) ** GOTO lbl6
        var3_6 = new JsonObject();
        if (var9_3 || var9_3) ** GOTO lbl6
        var4_7 = var2_5.getAllItemConfigs();
        if (var9_3 || var9_3) ** GOTO lbl6
        var5_8 = var4_7.entrySet().iterator();
        if (var9_3) ** GOTO lbl6
        block40: while (true) {
            if (var9_3 || var9_3) ** GOTO lbl6
            if (!var5_8.hasNext()) ** GOTO lbl44
            if (var9_3) ** GOTO lbl6
            var6_9 = var5_8.next();
            if (var9_3 || var9_3) ** GOTO lbl6
            var7_10 = new JsonObject();
            if (var9_3 || var9_3) ** GOTO lbl6
            var8_11 = var6_9.getValue();
            if (var9_3 || var9_3) ** GOTO lbl6
            var7_10.addProperty("enabled", Boolean.valueOf(var8_11.isEnabled()));
            if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var7_10.addProperty("buyBelow", (Number)var8_11.getBuyBelow());
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var7_10.addProperty("minQuantity", (Number)var8_11.getMinQuantity());
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var3_6.add(var6_9.getKey(), (JsonElement)var7_10);
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!var11_1) continue block40;
                    throw null;
                }
lbl44:
                // 1 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                var1_4.add("items", (JsonElement)var3_6);
                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return var1_4;
lbl49:
                // 4 sources

                case 0: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqq", cppb(int ), (int)37);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl73
                }
lbl54:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var10_2 /* !! */  = (int)ad.cppe("cpqr", cppb(int ), (int)38);
                        if (var11_1) {
                            throw null;
                        }
                        ** GOTO lbl189
                        break;
                    }
                }
lbl60:
                // 2 sources

                case 2: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqs", cppb(int ), (int)39);
                    if (var11_1) {
                        throw null;
                    }
                }
lbl64:
                // 4 sources

                case 3: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqt", cppb(int ), (int)40);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl83
                }
lbl69:
                // 3 sources

                case 4: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqu", cppb(int ), (int)41);
                    if (!var11_1) ** GOTO lbl64
                    throw null;
                }
lbl73:
                // 3 sources

                case 5: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqv", cppb(int ), (int)42);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl78:
                // 2 sources

                case 6: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqw", cppb(int ), (int)43);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl103
                }
lbl83:
                // 4 sources

                case 7: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqx", cppb(int ), (int)44);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
                case 8: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqy", cppb(int ), (int)45);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
                case 9: {
                    var10_2 /* !! */  = (int)ad.cppe("cpqz", cppb(int ), (int)46);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl172
                }
lbl98:
                // 2 sources

                case 10: {
                    var10_2 /* !! */  = (int)ad.cppe("cpra", cppb(int ), (int)47);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl103:
                // 2 sources

                case 11: {
                    var10_2 /* !! */  = (int)ad.cppe("cprb", cppb(int ), (int)48);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl126
                }
                case 12: {
                    var10_2 /* !! */  = (int)ad.cppe("cprc", cppb(int ), (int)49);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl113:
                // 2 sources

                case 13: {
                    do {
                        var10_2 /* !! */  = (int)ad.cppe("cprd", cppb(int ), (int)50);
                    } while (!var11_1);
                    throw null;
                }
lbl118:
                // 2 sources

                case 14: {
                    var10_2 /* !! */  = (int)ad.cppe("cpre", cppb(int ), (int)51);
                    if (!var11_1) ** GOTO lbl83
                    throw null;
                }
                case 15: {
                    var10_2 /* !! */  = (int)ad.cppe("cprf", cppb(int ), (int)52);
                    if (!var11_1) ** GOTO lbl78
                    throw null;
                }
lbl126:
                // 3 sources

                case 16: {
                    var10_2 /* !! */  = (int)ad.cppe("cprg", cppb(int ), (int)53);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl131:
                // 2 sources

                case 17: {
                    var10_2 /* !! */  = (int)ad.cppe("cprh", cppb(int ), (int)54);
                    if (!var11_1) ** GOTO lbl49
                    throw null;
                }
lbl135:
                // 2 sources

                case 18: {
                    var10_2 /* !! */  = (int)ad.cppe("cpri", cppb(int ), (int)55);
                    if (!var11_1) ** GOTO lbl113
                    throw null;
                }
                case 19: {
                    var10_2 /* !! */  = (int)ad.cppe("cprj", cppb(int ), (int)56);
                    if (!var11_1) ** GOTO lbl83
                    throw null;
                }
lbl143:
                // 3 sources

                case 20: {
                    var10_2 /* !! */  = (int)ad.cppe("cprk", cppb(int ), (int)57);
                    if (!var11_1) ** GOTO lbl135
                    throw null;
                }
                case 21: {
                    var10_2 /* !! */  = (int)ad.cppe("cprl", cppb(int ), (int)58);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl152:
                // 2 sources

                case 22: {
                    var10_2 /* !! */  = (int)ad.cppe("cprm", cppb(int ), (int)59);
                    if (!var11_1) ** GOTO lbl69
                    throw null;
                }
lbl156:
                // 2 sources

                case 23: {
                    var10_2 /* !! */  = (int)ad.cppe("cprn", cppb(int ), (int)60);
                    if (!var11_1) ** GOTO lbl60
                    throw null;
                }
lbl160:
                // 2 sources

                case 24: {
                    var10_2 /* !! */  = (int)ad.cppe("cpro", cppb(int ), (int)61);
                    if (!var11_1) ** GOTO lbl69
                    throw null;
                }
                case 25: {
                    var10_2 /* !! */  = (int)ad.cppe("cprp", cppb(int ), (int)62);
                    if (!var11_1) ** GOTO lbl152
                    throw null;
                }
                case 26: {
                    var10_2 /* !! */  = (int)ad.cppe("cprq", cppb(int ), (int)63);
                    if (!var11_1) ** GOTO lbl73
                    throw null;
                }
lbl172:
                // 2 sources

                case 27: {
                    var10_2 /* !! */  = (int)ad.cppe("cprr", cppb(int ), (int)64);
                    if (!var11_1) ** GOTO lbl143
                    throw null;
                }
                case 28: {
                    var10_2 /* !! */  = (int)ad.cppe("cprs", cppb(int ), (int)65);
                    if (!var11_1) ** GOTO lbl49
                    throw null;
                }
lbl180:
                // 2 sources

                case 29: {
                    var10_2 /* !! */  = (int)ad.cppe("cprt", cppb(int ), (int)66);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl205
                }
                case 30: {
                    var10_2 /* !! */  = (int)ad.cppe("cpru", cppb(int ), (int)67);
                    if (!var11_1) ** GOTO lbl126
                    throw null;
                }
lbl189:
                // 3 sources

                case 31: {
                    var10_2 /* !! */  = (int)ad.cppe("cprv", cppb(int ), (int)68);
                    if (!var11_1) ** GOTO lbl54
                    throw null;
                }
lbl193:
                // 2 sources

                case 32: {
                    var10_2 /* !! */  = (int)ad.cppe("cprw", cppb(int ), (int)69);
                    if (!var11_1) ** GOTO lbl156
                    throw null;
                }
lbl197:
                // 2 sources

                case 33: {
                    var10_2 /* !! */  = (int)ad.cppe("cprx", cppb(int ), (int)70);
                    if (!var11_1) ** GOTO lbl189
                    throw null;
                }
                case 34: {
                    var10_2 /* !! */  = (int)ad.cppe("cpry", cppb(int ), (int)71);
                    if (!var11_1) ** GOTO lbl98
                    throw null;
                }
lbl205:
                // 2 sources

                case 35: {
                    var10_2 /* !! */  = (int)ad.cppe("cprz", cppb(int ), (int)72);
                    if (!var11_1) ** GOTO lbl49
                    throw null;
                }
                case 36: 
            }
            break;
        }
        var10_2 /* !! */  = (int)ad.cppe("cpsa", cppb(int ), (int)73);
        ** while (!var11_1)
lbl212:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void crkd() {
        ad.cppc[0] = -1711077575;
        ad.cppc[1] = -485711872;
        ad.cppc[2] = -1447717433;
        ad.cppc[3] = 1024729526;
        ad.cppc[4] = 2050191562;
        ad.cppc[5] = 1467718210;
        ad.cppc[6] = -73753214;
        ad.cppc[7] = -1269841261;
        ad.cppc[8] = -1472854177;
        ad.cppc[9] = -1434982044;
        ad.cppc[10] = 1360730749;
        ad.cppc[11] = 1609005961;
        ad.cppc[12] = -781480894;
        ad.cppc[13] = 127879593;
        ad.cppc[14] = 1278503441;
        ad.cppc[15] = -246938189;
        ad.cppc[16] = -1346161673;
        ad.cppc[17] = -1013707100;
        ad.cppc[18] = -261583344;
        ad.cppc[19] = 1298645935;
        ad.cppc[20] = 324488055;
        ad.cppc[21] = -1266193428;
        ad.cppc[22] = -1006998339;
        ad.cppc[23] = -1211419953;
        ad.cppc[24] = 203406364;
        ad.cppc[25] = 1660158907;
        ad.cppc[26] = -1933843177;
        ad.cppc[27] = 1142887596;
        ad.cppc[28] = -321655534;
        ad.cppc[29] = 2130571423;
        ad.cppc[30] = 319611229;
        ad.cppc[31] = 511878849;
        ad.cppc[32] = -1716926030;
        ad.cppc[33] = 1015857113;
        ad.cppc[34] = 1039713148;
        ad.cppc[35] = 1903000423;
        ad.cppc[36] = -331878111;
        ad.cppc[37] = -528020083;
        ad.cppc[38] = 1381095142;
        ad.cppc[39] = -87963961;
        ad.cppc[40] = 899502609;
        ad.cppc[41] = -606160734;
        ad.cppc[42] = -360667441;
        ad.cppc[43] = -1454033330;
        ad.cppc[44] = -512707291;
        ad.cppc[45] = 2023219802;
        ad.cppc[46] = 1203199828;
        ad.cppc[47] = 508011920;
        ad.cppc[48] = -2095120968;
        ad.cppc[49] = -119264222;
        ad.cppc[50] = 899128718;
        ad.cppc[51] = 2065711881;
        ad.cppc[52] = -997777228;
        ad.cppc[53] = 1812916709;
        ad.cppc[54] = -782544851;
        ad.cppc[55] = 606010195;
        ad.cppc[56] = -1676731833;
        ad.cppc[57] = -1349633319;
        ad.cppc[58] = -210268061;
        ad.cppc[59] = -960938668;
        ad.cppc[60] = 1113416125;
        ad.cppc[61] = -1890042514;
        ad.cppc[62] = -1195732141;
        ad.cppc[63] = 337013557;
        ad.cppc[64] = -1198087864;
        ad.cppc[65] = -1361390801;
        ad.cppc[66] = 341056102;
        ad.cppc[67] = -674132621;
        ad.cppc[68] = 2008529180;
        ad.cppc[69] = 1994893034;
        ad.cppc[70] = 1900676824;
        ad.cppc[71] = -645195164;
        ad.cppc[72] = -2069869933;
        ad.cppc[73] = 1271753551;
        ad.cppc[74] = 1830660249;
        ad.cppc[75] = 904335667;
        ad.cppc[76] = -827346369;
        ad.cppc[77] = 277147687;
        ad.cppc[78] = 210127186;
        ad.cppc[79] = 2033233882;
        ad.cppc[80] = 1925596178;
        ad.cppc[81] = -341047033;
        ad.cppc[82] = -1251740095;
        ad.cppc[83] = -200954936;
        ad.cppc[84] = 1847594166;
        ad.cppc[85] = 728092571;
        ad.cppc[86] = 1280690411;
        ad.cppc[87] = -684169107;
        ad.cppc[88] = -940795660;
        ad.cppc[89] = 1075665299;
        ad.cppc[90] = -1743337804;
        ad.cppc[91] = 248510276;
        ad.cppc[92] = -1645608015;
        ad.cppc[93] = -1455109808;
        ad.cppc[94] = 1131825438;
        ad.cppc[95] = 17175633;
        ad.cppc[96] = -356192815;
        ad.cppc[97] = 624734035;
        ad.cppc[98] = -1466709326;
        ad.cppc[99] = 0x7B3BB377;
    }

    private static /* synthetic */ void crkq() {
        ad.cppd[600] = -1830163759;
        ad.cppd[601] = -1732073255;
        ad.cppd[602] = 584072441;
        ad.cppd[603] = -685834205;
        ad.cppd[604] = -1638520790;
        ad.cppd[605] = 1183553078;
        ad.cppd[606] = 1179472866;
        ad.cppd[607] = -1115388979;
        ad.cppd[608] = -24510265;
        ad.cppd[609] = -991450773;
        ad.cppd[610] = -1295059379;
        ad.cppd[611] = -1703565019;
        ad.cppd[612] = -601851812;
        ad.cppd[613] = -1047016659;
        ad.cppd[614] = 1655386604;
        ad.cppd[615] = 196271874;
        ad.cppd[616] = 1664579198;
        ad.cppd[617] = -600662835;
        ad.cppd[618] = 13138741;
        ad.cppd[619] = 1374577019;
        ad.cppd[620] = -1180578562;
        ad.cppd[621] = 1201615116;
        ad.cppd[622] = 2046721210;
        ad.cppd[623] = 1913252336;
        ad.cppd[624] = -1087920000;
        ad.cppd[625] = -1663318683;
        ad.cppd[626] = 1269530990;
        ad.cppd[627] = 2123035706;
        ad.cppd[628] = -1373323355;
        ad.cppd[629] = 165817439;
        ad.cppd[630] = -1880280473;
        ad.cppd[631] = -2068313821;
        ad.cppd[632] = -1786712858;
        ad.cppd[633] = 1057927245;
        ad.cppd[634] = -633015148;
        ad.cppd[635] = -899061755;
        ad.cppd[636] = -1580540110;
        ad.cppd[637] = -1095708334;
        ad.cppd[638] = 818482595;
        ad.cppd[639] = -181587497;
        ad.cppd[640] = -1914705800;
        ad.cppd[641] = -1048990554;
        ad.cppd[642] = 839976540;
        ad.cppd[643] = -1687849575;
        ad.cppd[644] = -448966136;
        ad.cppd[645] = 281942973;
        ad.cppd[646] = 869692;
        ad.cppd[647] = 381414195;
        ad.cppd[648] = -70732600;
        ad.cppd[649] = 942353321;
        ad.cppd[650] = -1205418808;
        ad.cppd[651] = -603660400;
        ad.cppd[652] = -765783473;
        ad.cppd[653] = -242753348;
        ad.cppd[654] = 159708480;
        ad.cppd[655] = 748292098;
        ad.cppd[656] = -878404565;
        ad.cppd[657] = -268898476;
        ad.cppd[658] = -340069829;
        ad.cppd[659] = 2067735212;
        ad.cppd[660] = -1730647884;
        ad.cppd[661] = -1457496540;
        ad.cppd[662] = -708547910;
        ad.cppd[663] = 1992961121;
        ad.cppd[664] = -1092919852;
        ad.cppd[665] = -2136468668;
        ad.cppd[666] = 1803912919;
        ad.cppd[667] = 1225617764;
        ad.cppd[668] = 885552666;
        ad.cppd[669] = 1999905998;
    }

    /*
     * Exception decompiling
     */
    public void deserialize(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CASE]
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

    private static /* synthetic */ void crki() {
        ad.cppc[500] = 1000132948;
        ad.cppc[501] = -346676417;
        ad.cppc[502] = -1703298957;
        ad.cppc[503] = 1257097262;
        ad.cppc[504] = 1081120292;
        ad.cppc[505] = 704779787;
        ad.cppc[506] = 1705577671;
        ad.cppc[507] = 1309808302;
        ad.cppc[508] = 865160912;
        ad.cppc[509] = -2097349742;
        ad.cppc[510] = -178769834;
        ad.cppc[511] = -684473745;
        ad.cppc[512] = 622006592;
        ad.cppc[513] = 2040658479;
        ad.cppc[514] = -549451688;
        ad.cppc[515] = -1532332048;
        ad.cppc[516] = 1220361261;
        ad.cppc[517] = 1125822144;
        ad.cppc[518] = -1636123528;
        ad.cppc[519] = 1294044692;
        ad.cppc[520] = -308909618;
        ad.cppc[521] = -994774769;
        ad.cppc[522] = 2099195517;
        ad.cppc[523] = 1447733630;
        ad.cppc[524] = 654388875;
        ad.cppc[525] = -191626871;
        ad.cppc[526] = 297653036;
        ad.cppc[527] = 1821980767;
        ad.cppc[528] = -1026732021;
        ad.cppc[529] = 407862230;
        ad.cppc[530] = 1917994831;
        ad.cppc[531] = -1549763897;
        ad.cppc[532] = -1818652399;
        ad.cppc[533] = 1598412905;
        ad.cppc[534] = 965690450;
        ad.cppc[535] = -1909268049;
        ad.cppc[536] = 1646148419;
        ad.cppc[537] = -2138089740;
        ad.cppc[538] = -1314857737;
        ad.cppc[539] = -805645425;
        ad.cppc[540] = 850986135;
        ad.cppc[541] = 1641652626;
        ad.cppc[542] = 853222758;
        ad.cppc[543] = -1523438819;
        ad.cppc[544] = -350812471;
        ad.cppc[545] = -599554591;
        ad.cppc[546] = -1282823119;
        ad.cppc[547] = 1906249366;
        ad.cppc[548] = -1100887848;
        ad.cppc[549] = -1445755620;
        ad.cppc[550] = -92907104;
        ad.cppc[551] = 995223222;
        ad.cppc[552] = 1495313543;
        ad.cppc[553] = -2003096311;
        ad.cppc[554] = 369407426;
        ad.cppc[555] = -1593208595;
        ad.cppc[556] = 1364212122;
        ad.cppc[557] = 189032107;
        ad.cppc[558] = 2661188;
        ad.cppc[559] = 1289756218;
        ad.cppc[560] = 1732577115;
        ad.cppc[561] = 820329418;
        ad.cppc[562] = 1917702573;
        ad.cppc[563] = -1691109426;
        ad.cppc[564] = 822631231;
        ad.cppc[565] = 986298403;
        ad.cppc[566] = 1035477159;
        ad.cppc[567] = -2132513204;
        ad.cppc[568] = -1472682522;
        ad.cppc[569] = -978655143;
        ad.cppc[570] = 1262081608;
        ad.cppc[571] = 339287352;
        ad.cppc[572] = 307788209;
        ad.cppc[573] = -1748689572;
        ad.cppc[574] = 446221057;
        ad.cppc[575] = 910862076;
        ad.cppc[576] = -249908824;
        ad.cppc[577] = -38864674;
        ad.cppc[578] = 81287193;
        ad.cppc[579] = 150348029;
        ad.cppc[580] = 736285179;
        ad.cppc[581] = -940188160;
        ad.cppc[582] = 388032156;
        ad.cppc[583] = 1145816720;
        ad.cppc[584] = -778247807;
        ad.cppc[585] = -895755129;
        ad.cppc[586] = 1818487320;
        ad.cppc[587] = 1467598871;
        ad.cppc[588] = -1971303149;
        ad.cppc[589] = 551429688;
        ad.cppc[590] = 1883406241;
        ad.cppc[591] = -192838668;
        ad.cppc[592] = 780557386;
        ad.cppc[593] = 1323394768;
        ad.cppc[594] = -257727780;
        ad.cppc[595] = -1353171849;
        ad.cppc[596] = -1595424069;
        ad.cppc[597] = -26708230;
        ad.cppc[598] = -111436651;
        ad.cppc[599] = -2133805627;
    }

    private static /* synthetic */ void crkh() {
        ad.cppc[400] = 1903716088;
        ad.cppc[401] = 1163774358;
        ad.cppc[402] = 967413363;
        ad.cppc[403] = -1686643197;
        ad.cppc[404] = 1663802344;
        ad.cppc[405] = 1929518940;
        ad.cppc[406] = 2089983051;
        ad.cppc[407] = 52839786;
        ad.cppc[408] = 241151072;
        ad.cppc[409] = 992796998;
        ad.cppc[410] = 994739719;
        ad.cppc[411] = 923022838;
        ad.cppc[412] = -593704390;
        ad.cppc[413] = 1600763490;
        ad.cppc[414] = -1167634676;
        ad.cppc[415] = 775808139;
        ad.cppc[416] = -85226226;
        ad.cppc[417] = 649651920;
        ad.cppc[418] = -592191062;
        ad.cppc[419] = 501303779;
        ad.cppc[420] = 861845420;
        ad.cppc[421] = -925875020;
        ad.cppc[422] = -806458085;
        ad.cppc[423] = 1930048135;
        ad.cppc[424] = 1684331059;
        ad.cppc[425] = 576084617;
        ad.cppc[426] = -686121598;
        ad.cppc[427] = 981338557;
        ad.cppc[428] = 941315089;
        ad.cppc[429] = 556603050;
        ad.cppc[430] = 2066140032;
        ad.cppc[431] = -646860731;
        ad.cppc[432] = -378503810;
        ad.cppc[433] = 394289529;
        ad.cppc[434] = 351373197;
        ad.cppc[435] = -872089760;
        ad.cppc[436] = -847580708;
        ad.cppc[437] = -157262303;
        ad.cppc[438] = -55627622;
        ad.cppc[439] = -1566275150;
        ad.cppc[440] = 1229475384;
        ad.cppc[441] = 1324760430;
        ad.cppc[442] = 2022008375;
        ad.cppc[443] = -1724095015;
        ad.cppc[444] = -1480204949;
        ad.cppc[445] = 64870807;
        ad.cppc[446] = -1322481173;
        ad.cppc[447] = 523383807;
        ad.cppc[448] = 2089416012;
        ad.cppc[449] = -2011326192;
        ad.cppc[450] = -842682228;
        ad.cppc[451] = 1321207753;
        ad.cppc[452] = 2137853965;
        ad.cppc[453] = -2057748501;
        ad.cppc[454] = -770333586;
        ad.cppc[455] = 1253928388;
        ad.cppc[456] = -296885819;
        ad.cppc[457] = 1299424134;
        ad.cppc[458] = -902047531;
        ad.cppc[459] = 2087571141;
        ad.cppc[460] = -431232538;
        ad.cppc[461] = -610367757;
        ad.cppc[462] = 788955898;
        ad.cppc[463] = -993493055;
        ad.cppc[464] = -260551353;
        ad.cppc[465] = 1796667225;
        ad.cppc[466] = -1670176104;
        ad.cppc[467] = -2027940018;
        ad.cppc[468] = 1471478538;
        ad.cppc[469] = 1719662266;
        ad.cppc[470] = -218285043;
        ad.cppc[471] = 1934873184;
        ad.cppc[472] = 846615107;
        ad.cppc[473] = 1135892234;
        ad.cppc[474] = -1303180076;
        ad.cppc[475] = -1391515009;
        ad.cppc[476] = 1268508187;
        ad.cppc[477] = -1878784065;
        ad.cppc[478] = -752718297;
        ad.cppc[479] = 961075943;
        ad.cppc[480] = -170324820;
        ad.cppc[481] = 1063270720;
        ad.cppc[482] = 204360158;
        ad.cppc[483] = -327939608;
        ad.cppc[484] = 225331451;
        ad.cppc[485] = 826088425;
        ad.cppc[486] = 1459567348;
        ad.cppc[487] = -1343535332;
        ad.cppc[488] = -125775456;
        ad.cppc[489] = -1222172587;
        ad.cppc[490] = -1467463726;
        ad.cppc[491] = 893816675;
        ad.cppc[492] = -680675243;
        ad.cppc[493] = -696976971;
        ad.cppc[494] = 1145231552;
        ad.cppc[495] = -1077243683;
        ad.cppc[496] = -1874168962;
        ad.cppc[497] = -1889614408;
        ad.cppc[498] = 1389578415;
        ad.cppc[499] = -802104114;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void deserializeModule(ds var1_1, JsonObject var2_2) {
        block124: {
            block123: {
                block122: {
                    var10_3 = ad.c;
                    var9_4 /* !! */  = ad.b;
                    var8_5 = ad.a;
                    if (var10_3) {
                        throw null;
lbl6:
                        // 35 sources

                        return;
                    }
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!var2_2.has("key")) break block122;
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var1_1.setKey(var2_2.get("key").getAsInt());
                    if (var8_5) ** GOTO lbl6
                }
                if (var8_5 || var8_5) ** GOTO lbl6
                if (!var2_2.has("type")) break block123;
                if (var8_5 || var8_5) ** GOTO lbl6
                var1_1.setType(var2_2.get("type").getAsInt());
                if (var8_5) ** GOTO lbl6
            }
            if (var8_5 || var8_5) ** GOTO lbl6
            if (!var2_2.has("favorite")) break block124;
            if (var8_5 || var8_5) ** GOTO lbl6
            var1_1.setFavorite(var2_2.get("favorite").getAsBoolean());
            if (var8_5) ** GOTO lbl6
        }
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_5 || var8_5) ** GOTO lbl6
                if (!var2_2.has("settings")) ** GOTO lbl71
                if (var8_5 || var8_5) ** GOTO lbl6
                var3_6 = var2_2.getAsJsonObject("settings");
                if (var8_5 || var8_5) ** GOTO lbl6
                this.applyMissingSettingDefaults(var1_1, var3_6);
                if (var8_5 || var8_5) ** GOTO lbl6
                var4_8 = var1_1.settings().iterator();
                if (var8_5) ** GOTO lbl6
                do {
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!var4_8.hasNext()) ** GOTO lbl71
                    if (var8_5) ** GOTO lbl6
                    var5_9 = var4_8.next();
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!var3_6.has(var5_9.getName())) ** GOTO lbl68
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var6_10 = var3_6.get(var5_9.getName());
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!(var1_1 instanceof et)) ** GOTO lbl65
                    if (var8_5) ** GOTO lbl6
                    if (!(var5_9 instanceof kf)) ** GOTO lbl65
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var7_11 = (kf)var5_9;
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!var6_10.isJsonPrimitive()) ** GOTO lbl65
                    if (var8_5) ** GOTO lbl6
                    if (!"ReallyWorld".equals(var6_10.getAsString())) ** GOTO lbl65
                    if (var8_5) ** GOTO lbl6
                    if (!var7_11.getList().contains("New")) ** GOTO lbl65
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var7_11.setValue("New");
                    if (var8_5) ** GOTO lbl6
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl68
lbl65:
                    // 5 sources

                    if (var8_5 || var8_5) ** GOTO lbl6
                    this.deserializeSetting(var5_9, var6_10);
                    if (var8_5) ** GOTO lbl6
lbl68:
                    // 3 sources

                    if (var8_5 || var8_5) ** GOTO lbl6
                } while (!var10_3);
                throw null;
lbl71:
                // 2 sources

                if (var8_5 || var8_5) ** GOTO lbl6
                if (!var2_2.has("enabled")) ** GOTO lbl80
                if (var8_5 || var8_5) ** GOTO lbl6
                var3_7 = var2_2.get("enabled").getAsBoolean();
                if (var8_5 || var8_5) ** GOTO lbl6
                if (var3_7 == var1_1.isState()) ** GOTO lbl80
                if (var8_5 || var8_5) ** GOTO lbl6
                var1_1.setState(var3_7);
                if (var8_5) ** GOTO lbl6
lbl80:
                // 3 sources

                if (!var8_5 && !var8_5) ** break;
                ** continue;
                return;
            }
lbl83:
            // 2 sources

            case 0: {
                var9_4 /* !! */  = (int)ad.cppe("cqwg", cppb(int ), (int)365);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 1: {
                var9_4 /* !! */  = (int)ad.cppe("cqwh", cppb(int ), (int)366);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 2: {
                var9_4 /* !! */  = (int)ad.cppe("cqwi", cppb(int ), (int)367);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl98:
            // 3 sources

            case 3: {
                var9_4 /* !! */  = (int)ad.cppe("cqwj", cppb(int ), (int)368);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl103:
            // 4 sources

            case 4: {
                var9_4 /* !! */  = (int)ad.cppe("cqwk", cppb(int ), (int)369);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 5: {
                var9_4 /* !! */  = (int)ad.cppe("cqwl", cppb(int ), (int)370);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 6: {
                var9_4 /* !! */  = (int)ad.cppe("cqwn", cppb(int ), (int)371);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 7: {
                var9_4 /* !! */  = (int)ad.cppe("cqwo", cppb(int ), (int)372);
                if (!var10_3) ** GOTO lbl103
                throw null;
            }
lbl122:
            // 3 sources

            case 8: {
                var9_4 /* !! */  = (int)ad.cppe("cqwp", cppb(int ), (int)373);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl127:
            // 2 sources

            case 9: {
                var9_4 /* !! */  = (int)ad.cppe("cqwq", cppb(int ), (int)374);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl132:
            // 2 sources

            case 10: {
                var9_4 /* !! */  = (int)ad.cppe("cqwr", cppb(int ), (int)375);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 11: {
                var9_4 /* !! */  = (int)ad.cppe("cqws", cppb(int ), (int)376);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl142:
            // 3 sources

            case 12: {
                var9_4 /* !! */  = (int)ad.cppe("cqwt", cppb(int ), (int)377);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl147:
            // 2 sources

            case 13: {
                var9_4 /* !! */  = (int)ad.cppe("cqwu", cppb(int ), (int)378);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl152:
            // 2 sources

            case 14: {
                var9_4 /* !! */  = (int)ad.cppe("cqwv", cppb(int ), (int)379);
                if (!var10_3) ** GOTO lbl142
                throw null;
            }
lbl156:
            // 3 sources

            case 15: {
                var9_4 /* !! */  = (int)ad.cppe("cqww", cppb(int ), (int)380);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl161:
            // 3 sources

            case 16: {
                var9_4 /* !! */  = (int)ad.cppe("cqwy", cppb(int ), (int)381);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 17: {
                var9_4 /* !! */  = (int)ad.cppe("cqwz", cppb(int ), (int)382);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl171:
            // 3 sources

            case 18: {
                var9_4 /* !! */  = (int)ad.cppe("cqxa", cppb(int ), (int)383);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 19: {
                var9_4 /* !! */  = (int)ad.cppe("cqxd", cppb(int ), (int)384);
                if (!var10_3) ** GOTO lbl156
                throw null;
            }
            case 20: {
                var9_4 /* !! */  = (int)ad.cppe("cqxe", cppb(int ), (int)385);
                if (!var10_3) ** GOTO lbl142
                throw null;
            }
lbl184:
            // 4 sources

            case 21: {
                var9_4 /* !! */  = (int)ad.cppe("cqxf", cppb(int ), (int)386);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 22: {
                var9_4 /* !! */  = (int)ad.cppe("cqxg", cppb(int ), (int)387);
                if (!var10_3) ** GOTO lbl98
                throw null;
            }
            case 23: {
                var9_4 /* !! */  = (int)ad.cppe("cqxh", cppb(int ), (int)388);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl198:
            // 3 sources

            case 24: {
                var9_4 /* !! */  = (int)ad.cppe("cqxi", cppb(int ), (int)389);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl203:
            // 2 sources

            case 25: {
                var9_4 /* !! */  = (int)ad.cppe("cqxk", cppb(int ), (int)390);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 26: {
                var9_4 /* !! */  = (int)ad.cppe("cqxl", cppb(int ), (int)391);
                if (!var10_3) ** GOTO lbl184
                throw null;
            }
lbl212:
            // 2 sources

            case 27: {
                var9_4 /* !! */  = (int)ad.cppe("cqxm", cppb(int ), (int)392);
                if (!var10_3) ** GOTO lbl161
                throw null;
            }
            case 28: {
                var9_4 /* !! */  = (int)ad.cppe("cqxn", cppb(int ), (int)393);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl221:
            // 3 sources

            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)ad.cppe("cqxo", cppb(int ), (int)394);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl345
                    break;
                }
            }
            case 30: {
                var9_4 /* !! */  = (int)ad.cppe("cqxp", cppb(int ), (int)395);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 31: {
                var9_4 /* !! */  = (int)ad.cppe("cqxq", cppb(int ), (int)396);
                if (!var10_3) ** GOTO lbl221
                throw null;
            }
            case 32: {
                var9_4 /* !! */  = (int)ad.cppe("cqxs", cppb(int ), (int)397);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl241:
            // 2 sources

            case 33: {
                var9_4 /* !! */  = (int)ad.cppe("cqxt", cppb(int ), (int)398);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl246:
            // 2 sources

            case 34: {
                var9_4 /* !! */  = (int)ad.cppe("cqxu", cppb(int ), (int)399);
                if (!var10_3) ** GOTO lbl221
                throw null;
            }
            case 35: {
                var9_4 /* !! */  = (int)ad.cppe("cqxv", cppb(int ), (int)400);
                if (!var10_3) ** GOTO lbl103
                throw null;
            }
lbl254:
            // 4 sources

            case 36: {
                var9_4 /* !! */  = (int)ad.cppe("cqxw", cppb(int ), (int)401);
                if (!var10_3) ** GOTO lbl198
                throw null;
            }
lbl258:
            // 2 sources

            case 37: {
                var9_4 /* !! */  = (int)ad.cppe("cqxx", cppb(int ), (int)402);
                if (!var10_3) ** GOTO lbl254
                throw null;
            }
            case 38: {
                var9_4 /* !! */  = (int)ad.cppe("cqxy", cppb(int ), (int)403);
                if (!var10_3) ** GOTO lbl122
                throw null;
            }
lbl266:
            // 2 sources

            case 39: {
                var9_4 /* !! */  = (int)ad.cppe("cqya", cppb(int ), (int)404);
                if (!var10_3) ** GOTO lbl171
                throw null;
            }
lbl270:
            // 2 sources

            case 40: {
                var9_4 /* !! */  = (int)ad.cppe("cqyb", cppb(int ), (int)405);
                if (!var10_3) ** GOTO lbl103
                throw null;
            }
lbl274:
            // 3 sources

            case 41: {
                var9_4 /* !! */  = (int)ad.cppe("cqyc", cppb(int ), (int)406);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 42: {
                var9_4 /* !! */  = (int)ad.cppe("cqyd", cppb(int ), (int)407);
                if (var10_3) {
                    throw null;
                }
            }
lbl283:
            // 4 sources

            case 43: {
                var9_4 /* !! */  = (int)ad.cppe("cqye", cppb(int ), (int)408);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl288:
            // 4 sources

            case 44: {
                var9_4 /* !! */  = (int)ad.cppe("cqyf", cppb(int ), (int)409);
                if (!var10_3) ** GOTO lbl132
                throw null;
            }
lbl292:
            // 4 sources

            case 45: {
                var9_4 /* !! */  = (int)ad.cppe("cqyh", cppb(int ), (int)410);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl297:
            // 2 sources

            case 46: {
                var9_4 /* !! */  = (int)ad.cppe("cqyi", cppb(int ), (int)411);
                if (!var10_3) ** GOTO lbl127
                throw null;
            }
lbl301:
            // 2 sources

            case 47: {
                var9_4 /* !! */  = (int)ad.cppe("cqyj", cppb(int ), (int)412);
                if (!var10_3) ** GOTO lbl274
                throw null;
            }
lbl305:
            // 2 sources

            case 48: {
                var9_4 /* !! */  = (int)ad.cppe("cqyk", cppb(int ), (int)413);
                if (!var10_3) ** GOTO lbl266
                throw null;
            }
lbl309:
            // 2 sources

            case 49: {
                var9_4 /* !! */  = (int)ad.cppe("cqyl", cppb(int ), (int)414);
                if (!var10_3) ** GOTO lbl301
                throw null;
            }
lbl313:
            // 3 sources

            case 50: {
                var9_4 /* !! */  = (int)ad.cppe("cqym", cppb(int ), (int)415);
                if (!var10_3) ** GOTO lbl147
                throw null;
            }
            case 51: {
                var9_4 /* !! */  = (int)ad.cppe("cqyn", cppb(int ), (int)416);
                if (!var10_3) ** GOTO lbl152
                throw null;
            }
            case 52: {
                var9_4 /* !! */  = (int)ad.cppe("cqyo", cppb(int ), (int)417);
                if (!var10_3) ** GOTO lbl254
                throw null;
            }
            case 53: {
                var9_4 /* !! */  = (int)ad.cppe("cqyq", cppb(int ), (int)418);
                if (!var10_3) ** GOTO lbl184
                throw null;
            }
lbl329:
            // 3 sources

            case 54: {
                var9_4 /* !! */  = (int)ad.cppe("cqyr", cppb(int ), (int)419);
                if (!var10_3) ** GOTO lbl288
                throw null;
            }
            case 55: {
                var9_4 /* !! */  = (int)ad.cppe("cqys", cppb(int ), (int)420);
                if (!var10_3) ** GOTO lbl83
                throw null;
            }
lbl337:
            // 2 sources

            case 56: {
                var9_4 /* !! */  = (int)ad.cppe("cqyu", cppb(int ), (int)421);
                if (!var10_3) ** GOTO lbl270
                throw null;
            }
lbl341:
            // 2 sources

            case 57: {
                var9_4 /* !! */  = (int)ad.cppe("cqyv", cppb(int ), (int)422);
                if (!var10_3) ** GOTO lbl241
                throw null;
            }
lbl345:
            // 3 sources

            case 58: {
                var9_4 /* !! */  = (int)ad.cppe("cqyw", cppb(int ), (int)423);
                if (!var10_3) ** GOTO lbl171
                throw null;
            }
lbl349:
            // 2 sources

            case 59: {
                var9_4 /* !! */  = (int)ad.cppe("cqyx", cppb(int ), (int)424);
                if (!var10_3) ** GOTO lbl98
                throw null;
            }
            case 60: {
                do {
                    var9_4 /* !! */  = (int)ad.cppe("cqyy", cppb(int ), (int)425);
                } while (!var10_3);
                throw null;
            }
            case 61: 
        }
        var9_4 /* !! */  = (int)ad.cppe("cqza", cppb(int ), (int)426);
        ** while (!var10_3)
lbl361:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void crkp() {
        ad.cppd[500] = 1000132947;
        ad.cppd[501] = -346676297;
        ad.cppd[502] = -1703298861;
        ad.cppd[503] = 1257097242;
        ad.cppd[504] = 1081120321;
        ad.cppd[505] = 704779894;
        ad.cppd[506] = 1705577686;
        ad.cppd[507] = 1309808324;
        ad.cppd[508] = 865160923;
        ad.cppd[509] = -2097349863;
        ad.cppd[510] = -178769902;
        ad.cppd[511] = -684473623;
        ad.cppd[512] = 622006720;
        ad.cppd[513] = 2040658552;
        ad.cppd[514] = -549451654;
        ad.cppd[515] = -1532332176;
        ad.cppd[516] = 1220361236;
        ad.cppd[517] = 1125822191;
        ad.cppd[518] = -1636123546;
        ad.cppd[519] = 1294044820;
        ad.cppd[520] = -308909624;
        ad.cppd[521] = -994774706;
        ad.cppd[522] = 2099195506;
        ad.cppd[523] = 1447733754;
        ad.cppd[524] = 654388766;
        ad.cppd[525] = -191626989;
        ad.cppd[526] = 297653157;
        ad.cppd[527] = 1821980676;
        ad.cppd[528] = -1026731924;
        ad.cppd[529] = 407862234;
        ad.cppd[530] = 1917994966;
        ad.cppd[531] = -1549763993;
        ad.cppd[532] = -1818652385;
        ad.cppd[533] = 1598412820;
        ad.cppd[534] = 965690442;
        ad.cppd[535] = -1909267974;
        ad.cppd[536] = 1646148354;
        ad.cppd[537] = -2138089737;
        ad.cppd[538] = -1314857822;
        ad.cppd[539] = -805645359;
        ad.cppd[540] = 850986176;
        ad.cppd[541] = 1641652661;
        ad.cppd[542] = 853222899;
        ad.cppd[543] = -1523438710;
        ad.cppd[544] = -350812505;
        ad.cppd[545] = -599554576;
        ad.cppd[546] = -1282823114;
        ad.cppd[547] = 1906249446;
        ad.cppd[548] = -1100887890;
        ad.cppd[549] = -1445755540;
        ad.cppd[550] = -92907038;
        ad.cppd[551] = 995223195;
        ad.cppd[552] = 1495313593;
        ad.cppd[553] = -2003096315;
        ad.cppd[554] = 369407447;
        ad.cppd[555] = -1593208729;
        ad.cppd[556] = 1364211994;
        ad.cppd[557] = 189032164;
        ad.cppd[558] = 2661246;
        ad.cppd[559] = 1289756264;
        ad.cppd[560] = 1732577115;
        ad.cppd[561] = 820329453;
        ad.cppd[562] = 1917702445;
        ad.cppd[563] = -1691109462;
        ad.cppd[564] = 822631226;
        ad.cppd[565] = 986298491;
        ad.cppd[566] = 1035477199;
        ad.cppd[567] = -2132513279;
        ad.cppd[568] = -1472682508;
        ad.cppd[569] = -978655153;
        ad.cppd[570] = 1262081731;
        ad.cppd[571] = 339287321;
        ad.cppd[572] = 307788230;
        ad.cppd[573] = -1748689467;
        ad.cppd[574] = 446221061;
        ad.cppd[575] = 910862027;
        ad.cppd[576] = -249908816;
        ad.cppd[577] = -38864824;
        ad.cppd[578] = 81287307;
        ad.cppd[579] = 150347953;
        ad.cppd[580] = 736285051;
        ad.cppd[581] = -940188153;
        ad.cppd[582] = 388032241;
        ad.cppd[583] = 1145816828;
        ad.cppd[584] = -778247683;
        ad.cppd[585] = -895755032;
        ad.cppd[586] = 1818487383;
        ad.cppd[587] = 1467598980;
        ad.cppd[588] = -1971303012;
        ad.cppd[589] = 551429820;
        ad.cppd[590] = -1883406242;
        ad.cppd[591] = -1781756378;
        ad.cppd[592] = -780557387;
        ad.cppd[593] = -1288780432;
        ad.cppd[594] = 257727779;
        ad.cppd[595] = 186769960;
        ad.cppd[596] = 1595424068;
        ad.cppd[597] = 1814473703;
        ad.cppd[598] = 111436650;
        ad.cppd[599] = 1215459525;
    }

    public ad() {
    }

    private static /* synthetic */ void crkn() {
        ad.cppd[300] = 978970150;
        ad.cppd[301] = -197661672;
        ad.cppd[302] = 226470847;
        ad.cppd[303] = -1587155357;
        ad.cppd[304] = 337305069;
        ad.cppd[305] = -232491009;
        ad.cppd[306] = -517264910;
        ad.cppd[307] = 248394099;
        ad.cppd[308] = 318838602;
        ad.cppd[309] = 2094439830;
        ad.cppd[310] = 380010599;
        ad.cppd[311] = 1349882682;
        ad.cppd[312] = -1790219288;
        ad.cppd[313] = -1905754035;
        ad.cppd[314] = 178467181;
        ad.cppd[315] = 912426645;
        ad.cppd[316] = 421850485;
        ad.cppd[317] = 177427762;
        ad.cppd[318] = -1728202257;
        ad.cppd[319] = 1556203405;
        ad.cppd[320] = 1643871586;
        ad.cppd[321] = 1368922463;
        ad.cppd[322] = -2001766186;
        ad.cppd[323] = 2147072236;
        ad.cppd[324] = 1195482343;
        ad.cppd[325] = -1520911438;
        ad.cppd[326] = -1125308246;
        ad.cppd[327] = 589137683;
        ad.cppd[328] = -131155639;
        ad.cppd[329] = 225291715;
        ad.cppd[330] = -343879809;
        ad.cppd[331] = -537975798;
        ad.cppd[332] = -1887340449;
        ad.cppd[333] = -749793262;
        ad.cppd[334] = 1341671694;
        ad.cppd[335] = 318533848;
        ad.cppd[336] = -2139371182;
        ad.cppd[337] = -848827008;
        ad.cppd[338] = 1362087713;
        ad.cppd[339] = 1112877077;
        ad.cppd[340] = 1535688099;
        ad.cppd[341] = -1570948608;
        ad.cppd[342] = -716037068;
        ad.cppd[343] = -1893966403;
        ad.cppd[344] = -1854378382;
        ad.cppd[345] = 205097102;
        ad.cppd[346] = 1977500761;
        ad.cppd[347] = -1022252986;
        ad.cppd[348] = -1472302596;
        ad.cppd[349] = 952740959;
        ad.cppd[350] = 1943847004;
        ad.cppd[351] = 2019247859;
        ad.cppd[352] = -136075931;
        ad.cppd[353] = 1887811929;
        ad.cppd[354] = 577578790;
        ad.cppd[355] = 1687935338;
        ad.cppd[356] = -1172025673;
        ad.cppd[357] = -1557850171;
        ad.cppd[358] = 225845606;
        ad.cppd[359] = -1108116348;
        ad.cppd[360] = 2000673578;
        ad.cppd[361] = -1078747326;
        ad.cppd[362] = -506911891;
        ad.cppd[363] = -634036124;
        ad.cppd[364] = -1492140635;
        ad.cppd[365] = 1894313212;
        ad.cppd[366] = -1514874535;
        ad.cppd[367] = -1147655222;
        ad.cppd[368] = 2060398980;
        ad.cppd[369] = 81946910;
        ad.cppd[370] = 588231029;
        ad.cppd[371] = -71778135;
        ad.cppd[372] = -95033957;
        ad.cppd[373] = -1267486844;
        ad.cppd[374] = 544614624;
        ad.cppd[375] = 53229046;
        ad.cppd[376] = -81538181;
        ad.cppd[377] = -515354699;
        ad.cppd[378] = -1257324949;
        ad.cppd[379] = 1649875650;
        ad.cppd[380] = -2000894221;
        ad.cppd[381] = 642586640;
        ad.cppd[382] = 1256173511;
        ad.cppd[383] = 1829590666;
        ad.cppd[384] = 1890998745;
        ad.cppd[385] = -1702469564;
        ad.cppd[386] = -706681632;
        ad.cppd[387] = 2128558797;
        ad.cppd[388] = 566454282;
        ad.cppd[389] = 2128348933;
        ad.cppd[390] = 330739075;
        ad.cppd[391] = -282224161;
        ad.cppd[392] = -2009841746;
        ad.cppd[393] = -1027926276;
        ad.cppd[394] = -408406714;
        ad.cppd[395] = 862451453;
        ad.cppd[396] = 739447232;
        ad.cppd[397] = -1795668226;
        ad.cppd[398] = -768683608;
        ad.cppd[399] = -931847264;
    }

    /*
     * Exception decompiling
     */
    private JsonObject serializeHud() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[CASE]], but top level block is 78[DOLOOP]
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

    private static /* synthetic */ void crkr() {
        ad.cpsc[0] = 6562946189726198587L;
        ad.cpsc[1] = 184863348208083587L;
        ad.cpsc[2] = 7871636055310379014L;
        ad.cpsc[3] = 7990030630624599028L;
        ad.cpsc[4] = 1276913261062791016L;
        ad.cpsc[5] = 4373993320084375234L;
        ad.cpsc[6] = 6223378440205494964L;
        ad.cpsc[7] = -4289059095629020780L;
        ad.cpsc[8] = -9104812181807409915L;
        ad.cpsc[9] = -7899895393624375400L;
        ad.cpsc[10] = 3012246078875173539L;
        ad.cpsc[11] = 5064029173766926439L;
        ad.cpsc[12] = 2151333695422454658L;
        ad.cpsc[13] = -5364978855725055891L;
        ad.cpsc[14] = -3040470283817409055L;
        ad.cpsc[15] = 8518203169306945481L;
        ad.cpsc[16] = -517052571744194759L;
        ad.cpsc[17] = -6745496138904144584L;
        ad.cpsc[18] = -6569532927249677250L;
        ad.cpsc[19] = -3757376200588743932L;
        ad.cpsc[20] = -8707133775429244337L;
        ad.cpsc[21] = 7528378657817164736L;
        ad.cpsc[22] = 786789991199381916L;
        ad.cpsc[23] = 8496059829950905279L;
        ad.cpsc[24] = -5707416712248259838L;
        ad.cpsc[25] = -3686601632846996721L;
        ad.cpsc[26] = -3590542076971759207L;
        ad.cpsc[27] = -2680149436038467838L;
        ad.cpsc[28] = 5581346008989889397L;
        ad.cpsc[29] = -5794349549042301705L;
        ad.cpsc[30] = -6290199518997419275L;
        ad.cpsc[31] = -8755524202681871538L;
        ad.cpsc[32] = -7507032860593015831L;
        ad.cpsc[33] = -6601282968253906395L;
        ad.cpsc[34] = 8485415815692308362L;
        ad.cpsc[35] = -2004492985731926517L;
        ad.cpsc[36] = -7028129769434889991L;
        ad.cpsc[37] = 2670462670444638149L;
        ad.cpsc[38] = -5769462974415030301L;
        ad.cpsc[39] = -8820564568201917656L;
        ad.cpsc[40] = -413466097009207501L;
        ad.cpsc[41] = -4694334630066879458L;
        ad.cpsc[42] = 4314756120277897771L;
        ad.cpsc[43] = 5057307219254294597L;
        ad.cpsc[44] = 7352333917962430897L;
        ad.cpsc[45] = -2147674528054659861L;
        ad.cpsc[46] = 1036690431048606147L;
        ad.cpsc[47] = -432341719595725271L;
        ad.cpsc[48] = -7451053815697108539L;
        ad.cpsc[49] = 4117418363114546872L;
        ad.cpsc[50] = -7228707633059414130L;
        ad.cpsc[51] = -6187080042607343490L;
        ad.cpsc[52] = -736537803449863224L;
        ad.cpsc[53] = -6244610173736186709L;
        ad.cpsc[54] = -4651191582277403074L;
        ad.cpsc[55] = -5105973790806924653L;
        ad.cpsc[56] = -8021530309663354019L;
        ad.cpsc[57] = -2520136595152734487L;
        ad.cpsc[58] = -687459869550466831L;
        ad.cpsc[59] = -7417500185022065201L;
        ad.cpsc[60] = -627422027287962284L;
        ad.cpsc[61] = -8019531889978247778L;
        ad.cpsc[62] = -3809910742399118161L;
        ad.cpsc[63] = 5952184445031346089L;
        ad.cpsc[64] = -3717411604489363416L;
        ad.cpsc[65] = 8796094421281387741L;
        ad.cpsc[66] = 335725244534252335L;
        ad.cpsc[67] = -6046320626972032089L;
        ad.cpsc[68] = 8128361653641835221L;
        ad.cpsc[69] = 6171872170897560038L;
        ad.cpsc[70] = -6663356466299277111L;
        ad.cpsc[71] = 2832838357717153484L;
        ad.cpsc[72] = 8227294332784032072L;
        ad.cpsc[73] = 398582972479412213L;
        ad.cpsc[74] = -8911156105412996360L;
        ad.cpsc[75] = -4810570672285509793L;
        ad.cpsc[76] = 4111126612255521478L;
        ad.cpsc[77] = -8148759935193068411L;
        ad.cpsc[78] = 1793613855866848814L;
        ad.cpsc[79] = 6862022774022013636L;
        ad.cpsc[80] = -7439978325833962568L;
        ad.cpsc[81] = 764728606900397128L;
        ad.cpsc[82] = 922114756550876516L;
        ad.cpsc[83] = 1643233168814020222L;
        ad.cpsc[84] = 3364766060944542424L;
        ad.cpsc[85] = 2115541265930502717L;
        ad.cpsc[86] = -8842034446699120182L;
        ad.cpsc[87] = 9077753529070550913L;
        ad.cpsc[88] = -2428908528583416580L;
        ad.cpsc[89] = -3691061244433416030L;
        ad.cpsc[90] = -1909355408686218003L;
        ad.cpsc[91] = -5774338084893644060L;
        ad.cpsc[92] = -6280183211690026301L;
        ad.cpsc[93] = -8075039967614894216L;
    }

    private static /* synthetic */ void crko() {
        ad.cppd[400] = 1903716045;
        ad.cppd[401] = 1163774336;
        ad.cppd[402] = 967413366;
        ad.cppd[403] = -1686643178;
        ad.cppd[404] = 1663802363;
        ad.cppd[405] = 1929518922;
        ad.cppd[406] = 2089983088;
        ad.cppd[407] = 52839757;
        ad.cppd[408] = 241151052;
        ad.cppd[409] = 992797035;
        ad.cppd[410] = 994739756;
        ad.cppd[411] = 923022834;
        ad.cppd[412] = -593704412;
        ad.cppd[413] = 1600763500;
        ad.cppd[414] = -1167634629;
        ad.cppd[415] = 775808186;
        ad.cppd[416] = -85226232;
        ad.cppd[417] = 649651912;
        ad.cppd[418] = -592191095;
        ad.cppd[419] = 501303806;
        ad.cppd[420] = 861845416;
        ad.cppd[421] = -925875046;
        ad.cppd[422] = -806458103;
        ad.cppd[423] = 1930048141;
        ad.cppd[424] = 1684331038;
        ad.cppd[425] = 576084632;
        ad.cppd[426] = -686121583;
        ad.cppd[427] = 981338557;
        ad.cppd[428] = 941315192;
        ad.cppd[429] = 556602943;
        ad.cppd[430] = 2066139906;
        ad.cppd[431] = -646860605;
        ad.cppd[432] = -378503821;
        ad.cppd[433] = 394289488;
        ad.cppd[434] = 351373227;
        ad.cppd[435] = -872089788;
        ad.cppd[436] = -847580791;
        ad.cppd[437] = -157262214;
        ad.cppd[438] = -55627538;
        ad.cppd[439] = -1566275285;
        ad.cppd[440] = 1229475374;
        ad.cppd[441] = 1324760408;
        ad.cppd[442] = 2022008356;
        ad.cppd[443] = -1724095044;
        ad.cppd[444] = -1480204971;
        ad.cppd[445] = 0x3DDD99D;
        ad.cppd[446] = -1322481219;
        ad.cppd[447] = 523383785;
        ad.cppd[448] = 2089415993;
        ad.cppd[449] = -2011326067;
        ad.cppd[450] = -842682196;
        ad.cppd[451] = 1321207780;
        ad.cppd[452] = 2137854041;
        ad.cppd[453] = -2057748562;
        ad.cppd[454] = -770333695;
        ad.cppd[455] = 1253928437;
        ad.cppd[456] = -296885821;
        ad.cppd[457] = 1299424191;
        ad.cppd[458] = -902047529;
        ad.cppd[459] = 2087571085;
        ad.cppd[460] = -431232619;
        ad.cppd[461] = -610367767;
        ad.cppd[462] = 788955759;
        ad.cppd[463] = -993493094;
        ad.cppd[464] = -260551232;
        ad.cppd[465] = 1796667188;
        ad.cppd[466] = -1670176099;
        ad.cppd[467] = -2027940068;
        ad.cppd[468] = 1471478543;
        ad.cppd[469] = 1719662140;
        ad.cppd[470] = -218284958;
        ad.cppd[471] = 1934873335;
        ad.cppd[472] = 846615143;
        ad.cppd[473] = 1135892259;
        ad.cppd[474] = -1303180070;
        ad.cppd[475] = -1391515125;
        ad.cppd[476] = 1268508240;
        ad.cppd[477] = -1878784055;
        ad.cppd[478] = -752718248;
        ad.cppd[479] = 961075841;
        ad.cppd[480] = -170324813;
        ad.cppd[481] = 1063270714;
        ad.cppd[482] = 204360143;
        ad.cppd[483] = -327939737;
        ad.cppd[484] = 225331429;
        ad.cppd[485] = 826088296;
        ad.cppd[486] = 1459567219;
        ad.cppd[487] = -1343535233;
        ad.cppd[488] = -125775389;
        ad.cppd[489] = -1222172647;
        ad.cppd[490] = -1467463777;
        ad.cppd[491] = 893816659;
        ad.cppd[492] = -680675105;
        ad.cppd[493] = -696977118;
        ad.cppd[494] = 1145231608;
        ad.cppd[495] = -1077243763;
        ad.cppd[496] = -1874168837;
        ad.cppd[497] = -1889614379;
        ad.cppd[498] = 1389578451;
        ad.cppd[499] = -802104187;
    }

    private static /* synthetic */ void crkk() {
        ad.cppd[0] = -1711077606;
        ad.cppd[1] = -485711846;
        ad.cppd[2] = -1447717423;
        ad.cppd[3] = 1024729507;
        ad.cppd[4] = 2050191571;
        ad.cppd[5] = 1467718213;
        ad.cppd[6] = -73753215;
        ad.cppd[7] = -1269841269;
        ad.cppd[8] = -1472854146;
        ad.cppd[9] = -1434982019;
        ad.cppd[10] = 1360730737;
        ad.cppd[11] = 1609005958;
        ad.cppd[12] = -781480868;
        ad.cppd[13] = 127879596;
        ad.cppd[14] = 1278503442;
        ad.cppd[15] = -246938198;
        ad.cppd[16] = -1346161707;
        ad.cppd[17] = -1013707093;
        ad.cppd[18] = -261583312;
        ad.cppd[19] = 1298645937;
        ad.cppd[20] = 324488056;
        ad.cppd[21] = -1266193417;
        ad.cppd[22] = -1006998370;
        ad.cppd[23] = -1211419960;
        ad.cppd[24] = 203406399;
        ad.cppd[25] = 1660158884;
        ad.cppd[26] = -1933843183;
        ad.cppd[27] = 1142887591;
        ad.cppd[28] = -321655529;
        ad.cppd[29] = 2130571409;
        ad.cppd[30] = 319611212;
        ad.cppd[31] = 511878881;
        ad.cppd[32] = -1716926048;
        ad.cppd[33] = 1015857116;
        ad.cppd[34] = 1039713149;
        ad.cppd[35] = 1903000444;
        ad.cppd[36] = -331878095;
        ad.cppd[37] = -528020072;
        ad.cppd[38] = 1381095142;
        ad.cppd[39] = -87963964;
        ad.cppd[40] = 899502622;
        ad.cppd[41] = -606160707;
        ad.cppd[42] = -360667456;
        ad.cppd[43] = -1454033316;
        ad.cppd[44] = -512707268;
        ad.cppd[45] = 2023219807;
        ad.cppd[46] = 1203199835;
        ad.cppd[47] = 508011925;
        ad.cppd[48] = -2095120987;
        ad.cppd[49] = -119264221;
        ad.cppd[50] = 899128713;
        ad.cppd[51] = 2065711874;
        ad.cppd[52] = -997777224;
        ad.cppd[53] = 1812916717;
        ad.cppd[54] = -782544835;
        ad.cppd[55] = 606010187;
        ad.cppd[56] = -1676731805;
        ad.cppd[57] = -1349633314;
        ad.cppd[58] = -210268050;
        ad.cppd[59] = -960938687;
        ad.cppd[60] = 1113416100;
        ad.cppd[61] = -1890042499;
        ad.cppd[62] = -1195732159;
        ad.cppd[63] = 337013555;
        ad.cppd[64] = -1198087860;
        ad.cppd[65] = -1361390797;
        ad.cppd[66] = 341056102;
        ad.cppd[67] = -674132609;
        ad.cppd[68] = 2008529157;
        ad.cppd[69] = 1994893052;
        ad.cppd[70] = 1900676801;
        ad.cppd[71] = -645195157;
        ad.cppd[72] = -2069869929;
        ad.cppd[73] = 1271753563;
        ad.cppd[74] = -1830660250;
        ad.cppd[75] = -1796045938;
        ad.cppd[76] = -827346370;
        ad.cppd[77] = -472609789;
        ad.cppd[78] = 210127187;
        ad.cppd[79] = -1097632246;
        ad.cppd[80] = 1925596179;
        ad.cppd[81] = 1130280595;
        ad.cppd[82] = 1251740094;
        ad.cppd[83] = 631014027;
        ad.cppd[84] = 1847594167;
        ad.cppd[85] = 1555031236;
        ad.cppd[86] = 1280690406;
        ad.cppd[87] = -684169114;
        ad.cppd[88] = -940795664;
        ad.cppd[89] = 1075665311;
        ad.cppd[90] = -1743337799;
        ad.cppd[91] = 248510277;
        ad.cppd[92] = -1645608006;
        ad.cppd[93] = -1455109804;
        ad.cppd[94] = 1131825427;
        ad.cppd[95] = 17175618;
        ad.cppd[96] = -356192810;
        ad.cppd[97] = 624734045;
        ad.cppd[98] = -1466709324;
        ad.cppd[99] = 2067510141;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyMissingSettingDefaults(ds var1_1, JsonObject var2_2) {
        block78: {
            block77: {
                v0 /* !! */  = ad.gd;
                if (true) ** GOTO lbl5
                block44: while (true) {
                    v0 /* !! */  = (long)(v1 - ad.cppe("crfp", cpsb(int ), (int)56));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1752965563: {
                            v1 = ad.cppe("crfq", cpsb(int ), (int)57);
                            continue block44;
                        }
                        case -1138011260: {
                            break block44;
                        }
                        case -641232993: {
                            v1 = ad.cppe("crfr", cpsb(int ), (int)58);
                            continue block44;
                        }
                        case 1418202006: {
                            v1 = ad.cppe("crfs", cpsb(int ), (int)59);
                            continue block44;
                        }
                    }
                    break;
                }
                var6_3 = ad.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ad.gd - ad.cppe("crft", cpsb(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ad.cppe("crfu", cppb(int ), (int)590)) break;
                    v2 /* !! */  = (long)ad.cppe("crfv", cppb(int ), (int)591);
                }
                var5_4 /* !! */  = ad.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ad.gd - ad.cppe("crfw", cpsb(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ad.cppe("crfx", cppb(int ), (int)592)) break;
                    v3 /* !! */  = (long)ad.cppe("crfy", cppb(int ), (int)593);
                }
                var4_5 = ad.a;
                if (var6_3) {
                    throw null;
lbl32:
                    // 12 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl32
                if (!(var1_1 instanceof hn)) break block77;
                if (var4_5) ** GOTO lbl32
                var3_6 = (hn)var1_1;
                if (var4_5 || var4_5) ** GOTO lbl32
                if (var6_3) {
                    throw null;
                }
                break block78;
            }
            if (var4_5 || var4_5) ** GOTO lbl32
            return;
        }
        if (var4_5) ** GOTO lbl32
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ad.gd - ad.cppe("crfz", cpsb(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ad.cppe("crga", cppb(int ), (int)594)) break;
                    v4 /* !! */  = (long)ad.cppe("crgb", cppb(int ), (int)595);
                }
                v5 = var3_6.smartCriticals;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ad.gd - ad.cppe("crgc", cpsb(int ), (int)63)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ad.cppe("crgd", cppb(int ), (int)596)) break;
                    v6 /* !! */  = (long)ad.cppe("crge", cppb(int ), (int)597);
                }
                v7 = v5.getName();
                v8 /* !! */  = ad.gd;
                if (true) ** GOTO lbl67
                block50: while (true) {
                    v8 /* !! */  = (long)(ad.cppe("crgg", cpsb(int ), (int)65) - ad.cppe("crgf", cpsb(int ), (int)64));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1770977880: {
                            continue block50;
                        }
                        case -1138011260: {
                            break block50;
                        }
                    }
                    break;
                }
                if (var2_2.has(v7)) ** GOTO lbl88
                if (var4_5 || var4_5) ** GOTO lbl32
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ad.gd - ad.cppe("crgh", cpsb(int ), (int)66)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ad.cppe("crgi", cppb(int ), (int)598)) break;
                    v9 /* !! */  = (long)ad.cppe("crgj", cppb(int ), (int)599);
                }
                v10 = var3_6.smartCriticals;
                v11 = ad.cppe("crgk", cppb(int ), (int)600);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ad.gd - ad.cppe("crgl", cpsb(int ), (int)67)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ad.cppe("crgm", cppb(int ), (int)601)) break;
                    v12 /* !! */  = (long)ad.cppe("crgn", cppb(int ), (int)602);
                }
                v10.setValue((boolean)v11);
                if (var4_5) ** GOTO lbl32
lbl88:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl32
                v13 /* !! */  = ad.gd;
                if (true) ** GOTO lbl93
                block53: while (true) {
                    v13 /* !! */  = (long)(ad.cppe("crgp", cpsb(int ), (int)69) - ad.cppe("crgo", cpsb(int ), (int)68));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1138011260: {
                            break block53;
                        }
                        case 870013530: {
                            continue block53;
                        }
                    }
                    break;
                }
                v14 = var3_6.movementCorrection;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = ad.gd - ad.cppe("crgq", cpsb(int ), (int)70)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ad.cppe("crgr", cppb(int ), (int)603)) break;
                    v15 /* !! */  = (long)ad.cppe("crgs", cppb(int ), (int)604);
                }
                v16 = v14.getName();
                v17 /* !! */  = ad.gd;
                if (true) ** GOTO lbl109
                block55: while (true) {
                    v17 /* !! */  = (long)(v18 - ad.cppe("crgt", cpsb(int ), (int)71));
lbl109:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1811305229: {
                            v18 = ad.cppe("crgu", cpsb(int ), (int)72);
                            continue block55;
                        }
                        case -1138011260: {
                            break block55;
                        }
                        case -127038241: {
                            v18 = ad.cppe("crgv", cpsb(int ), (int)73);
                            continue block55;
                        }
                        case 1969264092: {
                            v18 = ad.cppe("crgw", cpsb(int ), (int)74);
                            continue block55;
                        }
                    }
                    break;
                }
                if (var2_2.has(v16)) ** GOTO lbl136
                if (var4_5 || var4_5) ** GOTO lbl32
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = ad.gd - ad.cppe("crgx", cpsb(int ), (int)75)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ad.cppe("crgy", cppb(int ), (int)605)) break;
                    v19 /* !! */  = (long)ad.cppe("crgz", cppb(int ), (int)606);
                }
                v20 = var3_6.movementCorrection;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = ad.gd - ad.cppe("crha", cpsb(int ), (int)76)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ad.cppe("crhb", cppb(int ), (int)607)) break;
                    v21 /* !! */  = (long)ad.cppe("crhc", cppb(int ), (int)608);
                }
                v20.setValue("\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f");
                if (var4_5) ** GOTO lbl32
lbl136:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl139:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ad.cppe("crhd", cppb(int ), (int)609);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 1: {
                var5_4 /* !! */  = (int)ad.cppe("crhe", cppb(int ), (int)610);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 2: {
                var5_4 /* !! */  = (int)ad.cppe("crhf", cppb(int ), (int)611);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 3: {
                var5_4 /* !! */  = (int)ad.cppe("crhg", cppb(int ), (int)612);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ad.cppe("crhh", cppb(int ), (int)613);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl202
                    break;
                }
            }
            case 5: {
                var5_4 /* !! */  = (int)ad.cppe("crhi", cppb(int ), (int)614);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl170:
            // 3 sources

            case 6: {
                var5_4 /* !! */  = (int)ad.cppe("crhj", cppb(int ), (int)615);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl175:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)ad.cppe("crhk", cppb(int ), (int)616);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl180:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)ad.cppe("crhl", cppb(int ), (int)617);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl185:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)ad.cppe("crhm", cppb(int ), (int)618);
                if (!var6_3) ** GOTO lbl175
                throw null;
            }
lbl189:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)ad.cppe("crhn", cppb(int ), (int)619);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 11: {
                var5_4 /* !! */  = (int)ad.cppe("crho", cppb(int ), (int)620);
                if (!var6_3) break;
                throw null;
            }
lbl198:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)ad.cppe("crhp", cppb(int ), (int)621);
                if (!var6_3) break;
                throw null;
            }
lbl202:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)ad.cppe("crhq", cppb(int ), (int)622);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl207:
            // 3 sources

            case 14: {
                var5_4 /* !! */  = (int)ad.cppe("crhr", cppb(int ), (int)623);
                if (!var6_3) ** GOTO lbl139
                throw null;
            }
lbl211:
            // 3 sources

            case 15: {
                var5_4 /* !! */  = (int)ad.cppe("crhs", cppb(int ), (int)624);
                if (!var6_3) ** GOTO lbl170
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)ad.cppe("crht", cppb(int ), (int)625);
                if (!var6_3) ** GOTO lbl207
                throw null;
            }
            case 17: {
                do {
                    var5_4 /* !! */  = (int)ad.cppe("crhu", cppb(int ), (int)626);
                } while (!var6_3);
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)ad.cppe("crhv", cppb(int ), (int)627);
                if (!var6_3) break;
                throw null;
            }
            case 19: {
                var5_4 /* !! */  = (int)ad.cppe("crhw", cppb(int ), (int)628);
                if (!var6_3) ** GOTO lbl207
                throw null;
            }
lbl232:
            // 4 sources

            case 20: {
                var5_4 /* !! */  = (int)ad.cppe("crhx", cppb(int ), (int)629);
                if (!var6_3) ** GOTO lbl170
                throw null;
            }
            case 21: 
        }
        var5_4 /* !! */  = (int)ad.cppe("crhy", cppb(int ), (int)630);
        ** while (!var6_3)
lbl239:
        // 1 sources

        throw null;
    }
}

