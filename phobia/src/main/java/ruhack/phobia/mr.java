/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package ruhack.phobia;

import com.google.gson.Gson;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class mr {
    private static final Gson GSON;
    public static final boolean a;
    private static int[] fukh;
    private static final Path LEGACY_DIR;
    private static final long mz = 8630198278969073328L;
    public static final int b;
    private static long[] fukn;
    public static final boolean c;
    private static int[] fukg;
    private static final Path DIR;
    private static long[] fuko;

    private static /* synthetic */ void furx() {
        mr.fukh[0] = -1956547404;
        mr.fukh[1] = -2020927296;
        mr.fukh[2] = -720472837;
        mr.fukh[3] = 2141821348;
        mr.fukh[4] = -1605264397;
        mr.fukh[5] = -1186439417;
        mr.fukh[6] = -1705552834;
        mr.fukh[7] = 962804249;
        mr.fukh[8] = 1204847965;
        mr.fukh[9] = -391754227;
        mr.fukh[10] = 395774059;
        mr.fukh[11] = 1571224197;
        mr.fukh[12] = 1242795842;
        mr.fukh[13] = 1619703082;
        mr.fukh[14] = -1122050803;
        mr.fukh[15] = -1726811993;
        mr.fukh[16] = -1684535098;
        mr.fukh[17] = -192635682;
        mr.fukh[18] = 326904973;
        mr.fukh[19] = 2040770978;
        mr.fukh[20] = 2010192086;
        mr.fukh[21] = 1480133951;
        mr.fukh[22] = -1735405537;
        mr.fukh[23] = -1276342065;
        mr.fukh[24] = -154111952;
        mr.fukh[25] = -2009796833;
        mr.fukh[26] = -995976546;
        mr.fukh[27] = -30666068;
        mr.fukh[28] = -2018199970;
        mr.fukh[29] = 11261371;
        mr.fukh[30] = -332048087;
        mr.fukh[31] = -976262368;
        mr.fukh[32] = -1325792533;
        mr.fukh[33] = -293689702;
        mr.fukh[34] = 1225086250;
        mr.fukh[35] = -698924038;
        mr.fukh[36] = 1266868078;
        mr.fukh[37] = -1067647392;
        mr.fukh[38] = -1720603563;
        mr.fukh[39] = 787032210;
        mr.fukh[40] = 1167868491;
        mr.fukh[41] = 869475913;
        mr.fukh[42] = 1290324777;
        mr.fukh[43] = -2096616544;
        mr.fukh[44] = -1413332387;
        mr.fukh[45] = 268422839;
        mr.fukh[46] = 1795233245;
        mr.fukh[47] = -1856966369;
        mr.fukh[48] = 325358150;
        mr.fukh[49] = -189952015;
        mr.fukh[50] = 621032983;
        mr.fukh[51] = -990272230;
        mr.fukh[52] = 615008683;
        mr.fukh[53] = 611164770;
        mr.fukh[54] = 220984538;
        mr.fukh[55] = -1273783237;
        mr.fukh[56] = -364414506;
        mr.fukh[57] = 545612920;
        mr.fukh[58] = -2037505559;
        mr.fukh[59] = -885920207;
        mr.fukh[60] = -471156249;
        mr.fukh[61] = 973096806;
        mr.fukh[62] = 707486855;
        mr.fukh[63] = -1404902245;
        mr.fukh[64] = 1373666181;
        mr.fukh[65] = -842101317;
        mr.fukh[66] = 981414580;
        mr.fukh[67] = 911237394;
        mr.fukh[68] = 988446105;
        mr.fukh[69] = -2125185185;
        mr.fukh[70] = 1337046650;
        mr.fukh[71] = -1027886665;
        mr.fukh[72] = -1392717818;
        mr.fukh[73] = 32166081;
        mr.fukh[74] = -617975261;
        mr.fukh[75] = 1421436077;
        mr.fukh[76] = -1649945568;
        mr.fukh[77] = -1491262774;
        mr.fukh[78] = -137448793;
        mr.fukh[79] = 1489271549;
        mr.fukh[80] = -690594208;
        mr.fukh[81] = 692246059;
        mr.fukh[82] = -213511244;
        mr.fukh[83] = -582086993;
        mr.fukh[84] = 1174780833;
        mr.fukh[85] = -553279283;
        mr.fukh[86] = 52921051;
        mr.fukh[87] = 571825700;
        mr.fukh[88] = 1084892304;
        mr.fukh[89] = -46081314;
        mr.fukh[90] = 2002376643;
        mr.fukh[91] = 135909377;
        mr.fukh[92] = -1382318696;
        mr.fukh[93] = -639131246;
        mr.fukh[94] = -1988416064;
        mr.fukh[95] = -359263398;
        mr.fukh[96] = 1541764029;
        mr.fukh[97] = 1247387553;
        mr.fukh[98] = 2143692751;
        mr.fukh[99] = 1329975758;
    }

    private static /* synthetic */ long fukm(int n2) {
        return fukn[n2] ^ fuko[n2];
    }

    private static /* synthetic */ int fukf(int n2) {
        return fukg[n2] ^ fukh[n2];
    }

    private static /* synthetic */ void fury() {
        mr.fukh[100] = -201045884;
        mr.fukh[101] = -97573407;
    }

    public static /* synthetic */ CallSite fuki(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float[][] loadDataset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = mr.mz - mr.fuki("fuoz", fukm(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mr.fuki("fupa", fukf(int ), (int)55)) break;
            v0 /* !! */  = (long)mr.fuki("fupb", fukf(int ), (int)56);
        }
        var3 = mr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = mr.mz - mr.fuki("fupc", fukm(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mr.fuki("fupd", fukf(int ), (int)57)) break;
            v1 /* !! */  = (long)mr.fuki("fupe", fukf(int ), (int)58);
        }
        var2_1 /* !! */  = mr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = mr.mz - mr.fuki("fupf", fukm(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mr.fuki("fupg", fukf(int ), (int)59)) {
                var1_2 = mr.a;
                if (var3) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)mr.fuki("fuph", fukf(int ), (int)60);
        }
        if (var1_2 != false) return null;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: while (true) {
            block46: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_2 != false) return null;
                        v3 /* !! */  = mr.mz;
                        block27: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1845676913: {
                                    v4 = mr.fuki("fupj", fukm(int ), (int)66);
                                    ** GOTO lbl37
                                }
                                case -63237732: {
                                    v4 = mr.fuki("fupk", fukm(int ), (int)67);
lbl37:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - mr.fuki("fupi", fukm(int ), (int)65));
                                    continue block27;
                                }
                                case 656645808: {
                                    break block27;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = mr.mz - mr.fuki("fupl", fukm(int ), (int)68)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != mr.fuki("fupm", fukf(int ), (int)61)) ** GOTO lbl46
                            v6 = mr.DIR.resolve("holy8k.dataset.json");
                            ** GOTO lbl79
lbl46:
                            // 1 sources

                            v5 /* !! */  = (long)mr.fuki("fupn", fukf(int ), (int)62);
                        }
                    }
                    case 0: {
                        ** GOTO lbl74
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqe", fukf(int ), (int)72);
                        cfr_temp_0 = 4;
                        if (var3) {
                            throw null;
                        }
                        break block46;
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqh", fukf(int ), (int)75);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqd", fukf(int ), (int)71);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqj", fukf(int ), (int)77);
                        cfr_temp_0 = 4;
                        if (var3) {
                            throw null;
                        }
                        break block46;
                    }
                    case 9: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqk", fukf(int ), (int)78);
                        if (var3) {
                            throw null;
                        }
lbl74:
                        // 3 sources

                        var2_1 /* !! */  = (int)mr.fuki("fuqb", fukf(int ), (int)69);
                        cfr_temp_0 = 4;
                        if (var3) {
                            throw null;
                        }
                        break block46;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_5 = mr.mz - mr.fuki("fupo", fukm(int ), (int)69)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  != mr.fuki("fupp", fukf(int ), (int)63)) ** GOTO lbl88
                        var0_3 = mr.readFrames(v6);
                        if (var1_2 != false) return null;
                        if (var1_2 != false) return null;
                        if (var0_3.length > 0) {
                            break;
                        }
                        ** GOTO lbl92
lbl88:
                        // 1 sources

                        v7 /* !! */  = (long)mr.fuki("fupq", fukf(int ), (int)64);
                    }
                    if (var1_2 != false) return null;
                    return var0_3;
lbl92:
                    // 1 sources

                    if (var1_2 != false) return null;
                    if (var1_2 != false) return null;
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_6 = mr.mz - mr.fuki("fupr", fukm(int ), (int)70)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == mr.fuki("fups", fukf(int ), (int)65)) break;
                        v8 /* !! */  = (long)mr.fuki("fupt", fukf(int ), (int)66);
                    }
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_7 = mr.mz - mr.fuki("fupu", fukm(int ), (int)71)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  != mr.fuki("fupv", fukf(int ), (int)67)) ** GOTO lbl105
                        v10 = mr.LEGACY_DIR.resolve("holy8k.dataset.json");
                        v11 /* !! */  = mr.mz;
                        if (true) ** GOTO lbl109
lbl105:
                        // 1 sources

                        v9 /* !! */  = (long)mr.fuki("fupw", fukf(int ), (int)68);
                    }
                    block32: while (true) {
                        v11 /* !! */  = (long)(v12 - mr.fuki("fupx", fukm(int ), (int)72));
lbl109:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1724982799: {
                                v12 = mr.fuki("fupy", fukm(int ), (int)73);
                                continue block32;
                            }
                            case -1522082879: {
                                v12 = mr.fuki("fupz", fukm(int ), (int)74);
                                continue block32;
                            }
                            case 319554056: {
                                v12 = mr.fuki("fuqa", fukm(int ), (int)75);
                                continue block32;
                            }
                            case 656645808: {
                                return mr.readFrames(v10);
                            }
                        }
                        break;
                    }
                    return mr.readFrames(v10);
                    case 1: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqc", fukf(int ), (int)70);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqi", fukf(int ), (int)76);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)mr.fuki("fuqg", fukf(int ), (int)74);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl139
            }
            do {
                if (true) continue block26;
lbl139:
                // 2 sources

                var2_1 /* !! */  = (int)mr.fuki("fuqf", fukf(int ), (int)73);
                cfr_temp_0 = 1;
            } while (!var3);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path modelPath() {
        v0 /* !! */  = mr.mz;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(mr.fuki("fukq", fukm(int ), (int)1) - mr.fuki("fukp", fukm(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1967449789: {
                    continue block33;
                }
                case 656645808: {
                    break block33;
                }
            }
            break;
        }
        var3 = mr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mr.mz - mr.fuki("fukr", fukm(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mr.fuki("fuks", fukf(int ), (int)3)) break;
            v1 /* !! */  = (long)mr.fuki("fukt", fukf(int ), (int)4);
        }
        var2_1 /* !! */  = mr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mr.mz - mr.fuki("fuku", fukm(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mr.fuki("fukv", fukf(int ), (int)5)) break;
            v2 /* !! */  = (long)mr.fuki("fukw", fukf(int ), (int)6);
        }
        var1_2 = mr.a;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3) {
                    throw null;
lbl30:
                    // 4 sources

                    return null;
                }
                if (var1_2 || var1_2) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mr.mz - mr.fuki("fukx", fukm(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mr.fuki("fuky", fukf(int ), (int)7)) break;
                    v3 /* !! */  = (long)mr.fuki("fukz", fukf(int ), (int)8);
                }
                v4 /* !! */  = mr.mz;
                if (true) ** GOTO lbl43
                block38: while (true) {
                    v4 /* !! */  = (long)(v5 - mr.fuki("fula", fukm(int ), (int)5));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1050437243: {
                            v5 = mr.fuki("fulb", fukm(int ), (int)6);
                            continue block38;
                        }
                        case 656645808: {
                            break block38;
                        }
                        case 904780769: {
                            v5 = mr.fuki("fulc", fukm(int ), (int)7);
                            continue block38;
                        }
                    }
                    break;
                }
                var0_3 = mr.DIR.resolve("holy8k.model.json");
                if (var1_2 || var1_2) ** GOTO lbl30
                v6 = new LinkOption[]{};
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = mr.mz - mr.fuki("fuld", fukm(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == mr.fuki("fule", fukf(int ), (int)9)) break;
                    v7 /* !! */  = (long)mr.fuki("fulf", fukf(int ), (int)10);
                }
                if (!Files.exists(var0_3, v6)) ** GOTO lbl64
                if (var1_2) ** GOTO lbl30
                return var0_3;
lbl64:
                // 1 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v8 /* !! */  = mr.mz;
                if (true) ** GOTO lbl70
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - mr.fuki("fulg", fukm(int ), (int)9));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1872183573: {
                            v9 = mr.fuki("fulh", fukm(int ), (int)10);
                            continue block40;
                        }
                        case 93448138: {
                            v9 = mr.fuki("fuli", fukm(int ), (int)11);
                            continue block40;
                        }
                        case 656645808: {
                            break block40;
                        }
                        case 2146753351: {
                            v9 = mr.fuki("fulj", fukm(int ), (int)12);
                            continue block40;
                        }
                    }
                    break;
                }
                v10 /* !! */  = mr.mz;
                if (true) ** GOTO lbl86
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - mr.fuki("fulk", fukm(int ), (int)13));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 99761967: {
                            v11 = mr.fuki("full", fukm(int ), (int)14);
                            continue block41;
                        }
                        case 355322064: {
                            v11 = mr.fuki("fulm", fukm(int ), (int)15);
                            continue block41;
                        }
                        case 656645808: {
                            break block41;
                        }
                        case 914145618: {
                            v11 = mr.fuki("fuln", fukm(int ), (int)16);
                            continue block41;
                        }
                    }
                    break;
                }
                return mr.LEGACY_DIR.resolve("holy8k.model.json");
            }
            case 0: {
                var2_1 /* !! */  = (int)mr.fuki("fulo", fukf(int ), (int)11);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var2_1 /* !! */  = (int)mr.fuki("fulp", fukf(int ), (int)12);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 2: {
                var2_1 /* !! */  = (int)mr.fuki("fulq", fukf(int ), (int)13);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 3: {
                var2_1 /* !! */  = (int)mr.fuki("fulr", fukf(int ), (int)14);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 4: {
                var2_1 /* !! */  = (int)mr.fuki("fuls", fukf(int ), (int)15);
                if (!var3) break;
                throw null;
            }
            case 5: {
                var2_1 /* !! */  = (int)mr.fuki("fult", fukf(int ), (int)16);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 6: {
                var2_1 /* !! */  = (int)mr.fuki("fulu", fukf(int ), (int)17);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl133:
            // 4 sources

            case 7: {
                do {
                    var2_1 /* !! */  = (int)mr.fuki("fulv", fukf(int ), (int)18);
                } while (!var3);
                throw null;
            }
lbl138:
            // 4 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)mr.fuki("fulw", fukf(int ), (int)19);
                    if (!var3) break block4;
                    throw null;
                }
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)mr.fuki("fulx", fukf(int ), (int)20);
        ** while (!var3)
lbl146:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void furz() {
        mr.fukn[0] = -1926981206234223301L;
        mr.fukn[1] = 3937871612916986575L;
        mr.fukn[2] = -8124277718419042711L;
        mr.fukn[3] = -5647385364367275814L;
        mr.fukn[4] = -752933127293477331L;
        mr.fukn[5] = 8247317173163347262L;
        mr.fukn[6] = 8334292830735140665L;
        mr.fukn[7] = 4862526702707045322L;
        mr.fukn[8] = -9200801311764911399L;
        mr.fukn[9] = -2054469829143052937L;
        mr.fukn[10] = -5667090559159590231L;
        mr.fukn[11] = 1403363892317237029L;
        mr.fukn[12] = -8618495720531995921L;
        mr.fukn[13] = -2805430474527866679L;
        mr.fukn[14] = -644801378101456097L;
        mr.fukn[15] = 2108514285818975194L;
        mr.fukn[16] = 1702793470548115866L;
        mr.fukn[17] = 202198406971656328L;
        mr.fukn[18] = 3802867451156476745L;
        mr.fukn[19] = 8329158016838386841L;
        mr.fukn[20] = -5988343147633926961L;
        mr.fukn[21] = 7126750031170389721L;
        mr.fukn[22] = 2635045766229863765L;
        mr.fukn[23] = -1798896249847396412L;
        mr.fukn[24] = 5903140306630107300L;
        mr.fukn[25] = 3230080183054939515L;
        mr.fukn[26] = 3911933345570745693L;
        mr.fukn[27] = 5907660096972078187L;
        mr.fukn[28] = 2255576442133015316L;
        mr.fukn[29] = 7093583904044834801L;
        mr.fukn[30] = -4370721472998473171L;
        mr.fukn[31] = 7246141643198022340L;
        mr.fukn[32] = 629475182734112370L;
        mr.fukn[33] = 8250813720482495005L;
        mr.fukn[34] = -7353438571566452625L;
        mr.fukn[35] = 2978227382383440510L;
        mr.fukn[36] = -8591720581857291558L;
        mr.fukn[37] = -1391059529846814228L;
        mr.fukn[38] = 7429797013689852789L;
        mr.fukn[39] = -8579064596161172174L;
        mr.fukn[40] = -3653179631629025606L;
        mr.fukn[41] = 1904973252550167140L;
        mr.fukn[42] = -5280758482393666725L;
        mr.fukn[43] = -815159567028570561L;
        mr.fukn[44] = -6906248363817647527L;
        mr.fukn[45] = 679914451034021891L;
        mr.fukn[46] = 1042401883861845509L;
        mr.fukn[47] = 879978232714901994L;
        mr.fukn[48] = -5874987660745056538L;
        mr.fukn[49] = -3741061844017372260L;
        mr.fukn[50] = -782165891604249660L;
        mr.fukn[51] = -6346902492262247682L;
        mr.fukn[52] = -6086027177148028027L;
        mr.fukn[53] = 155184561949673800L;
        mr.fukn[54] = -7231892168764749877L;
        mr.fukn[55] = -6374718425314898250L;
        mr.fukn[56] = -725862515415800508L;
        mr.fukn[57] = -6003741204320196708L;
        mr.fukn[58] = 6967956823007224895L;
        mr.fukn[59] = -528000690047040161L;
        mr.fukn[60] = 8790884946387621724L;
        mr.fukn[61] = -5312759826469091471L;
        mr.fukn[62] = -6017502466318475989L;
        mr.fukn[63] = -5731903274957363437L;
        mr.fukn[64] = -3942349269402389487L;
        mr.fukn[65] = -1970433994581691995L;
        mr.fukn[66] = 2723822214278756768L;
        mr.fukn[67] = -7157135196117032144L;
        mr.fukn[68] = -3125436836640454164L;
        mr.fukn[69] = 1928542603912745577L;
        mr.fukn[70] = -4414824693051656241L;
        mr.fukn[71] = 6696763446855041743L;
        mr.fukn[72] = -3665374550319879913L;
        mr.fukn[73] = 3304426312604807168L;
        mr.fukn[74] = 4084705511212782706L;
        mr.fukn[75] = -8998323492533223418L;
        mr.fukn[76] = -8672695299468995594L;
        mr.fukn[77] = -1488011039448383851L;
        mr.fukn[78] = -7723181244393895829L;
        mr.fukn[79] = -192904077423470909L;
        mr.fukn[80] = -2758040555158496239L;
        mr.fukn[81] = 8144060756877073910L;
        mr.fukn[82] = 5665917823402169658L;
        mr.fukn[83] = -2692046218681836101L;
        mr.fukn[84] = 656162742058857869L;
        mr.fukn[85] = -5752395889225465588L;
        mr.fukn[86] = 7001807868462414648L;
        mr.fukn[87] = 3851376618319659300L;
        mr.fukn[88] = 5529248067288812860L;
    }

    private static /* synthetic */ void fusa() {
        mr.fuko[0] = 6215285306166147686L;
        mr.fuko[1] = 5269159560892288402L;
        mr.fuko[2] = 7589448038800212813L;
        mr.fuko[3] = -8317200806126791806L;
        mr.fuko[4] = 7411698533307733022L;
        mr.fuko[5] = -3857023636815135524L;
        mr.fuko[6] = 2958025655203403076L;
        mr.fuko[7] = -7230334450214145027L;
        mr.fuko[8] = -1684692396945638023L;
        mr.fuko[9] = -6303834244637717545L;
        mr.fuko[10] = 2527904809736825377L;
        mr.fuko[11] = -2150334052853847154L;
        mr.fuko[12] = -290043521817262903L;
        mr.fuko[13] = 8265330031315794541L;
        mr.fuko[14] = -3392924952220999514L;
        mr.fuko[15] = 84597471740341859L;
        mr.fuko[16] = 3290700343223233972L;
        mr.fuko[17] = 8787987638722250937L;
        mr.fuko[18] = -9181016608302424567L;
        mr.fuko[19] = -536049020036290340L;
        mr.fuko[20] = 2308750185392327275L;
        mr.fuko[21] = -4421329591745836686L;
        mr.fuko[22] = -4309579713404207488L;
        mr.fuko[23] = -1306684139707733814L;
        mr.fuko[24] = -8680729511922020216L;
        mr.fuko[25] = 2854382038286313958L;
        mr.fuko[26] = 8590782111052547076L;
        mr.fuko[27] = -2424019188367507035L;
        mr.fuko[28] = 3503668517690111352L;
        mr.fuko[29] = 3255931524665414179L;
        mr.fuko[30] = -1422673654218473869L;
        mr.fuko[31] = -5920255243829585824L;
        mr.fuko[32] = 2504670193826371020L;
        mr.fuko[33] = 6244872977530695725L;
        mr.fuko[34] = 2204898290609009168L;
        mr.fuko[35] = -40832985096674091L;
        mr.fuko[36] = 8673458102252378777L;
        mr.fuko[37] = 4634945590883472496L;
        mr.fuko[38] = 7355323766593175851L;
        mr.fuko[39] = 1039975547348870548L;
        mr.fuko[40] = 8374429949541892188L;
        mr.fuko[41] = -1861849292511378761L;
        mr.fuko[42] = -3558101395529108561L;
        mr.fuko[43] = -3484504778965197553L;
        mr.fuko[44] = 3340633226690531165L;
        mr.fuko[45] = -1660991938310627357L;
        mr.fuko[46] = -7652779260167081823L;
        mr.fuko[47] = -1464063760089433148L;
        mr.fuko[48] = -2165737063104015071L;
        mr.fuko[49] = 1133849620461052362L;
        mr.fuko[50] = 4852193161520471688L;
        mr.fuko[51] = 842972361515140674L;
        mr.fuko[52] = -5533146467201321527L;
        mr.fuko[53] = -5214848506849012785L;
        mr.fuko[54] = 6163879457345220954L;
        mr.fuko[55] = -7387019906426444759L;
        mr.fuko[56] = 6994526745701862378L;
        mr.fuko[57] = -7950615810481253326L;
        mr.fuko[58] = -3801874938432256698L;
        mr.fuko[59] = -4062248985646866474L;
        mr.fuko[60] = 1863000821429122717L;
        mr.fuko[61] = 1116873794764188471L;
        mr.fuko[62] = 5437326269593975024L;
        mr.fuko[63] = -3519043214967390304L;
        mr.fuko[64] = 3287752067524227217L;
        mr.fuko[65] = 8577444611494728774L;
        mr.fuko[66] = -8365483385690709602L;
        mr.fuko[67] = -1666498627145847404L;
        mr.fuko[68] = -5070859938280203500L;
        mr.fuko[69] = -3472510813607736814L;
        mr.fuko[70] = 6344231782264580069L;
        mr.fuko[71] = 1286089104514150243L;
        mr.fuko[72] = 6412171042763031852L;
        mr.fuko[73] = 6991849830233648897L;
        mr.fuko[74] = 9193047911321608241L;
        mr.fuko[75] = -4058065341468737756L;
        mr.fuko[76] = -4644156684878316736L;
        mr.fuko[77] = -6998163764928624212L;
        mr.fuko[78] = -2107354319767599026L;
        mr.fuko[79] = -4483271486575870579L;
        mr.fuko[80] = -8036150995937546729L;
        mr.fuko[81] = 5911948032031041163L;
        mr.fuko[82] = 2581378036230181454L;
        mr.fuko[83] = -7209412207641921801L;
        mr.fuko[84] = -8653806067223643062L;
        mr.fuko[85] = -6950328058802853961L;
        mr.fuko[86] = -9097076844931709830L;
        mr.fuko[87] = 7438593876432181034L;
        mr.fuko[88] = 6923986896555622671L;
    }

    private mr() {
        int n2 = b;
    }

    private static /* synthetic */ void furv() {
        mr.fukg[0] = -1956547402;
        mr.fukg[1] = -2020927294;
        mr.fukg[2] = -720472837;
        mr.fukg[3] = 2141821349;
        mr.fukg[4] = 188893280;
        mr.fukg[5] = -1186439418;
        mr.fukg[6] = 310532879;
        mr.fukg[7] = 962804248;
        mr.fukg[8] = -988354666;
        mr.fukg[9] = -391754228;
        mr.fukg[10] = 251859057;
        mr.fukg[11] = 1571224205;
        mr.fukg[12] = 1242795842;
        mr.fukg[13] = 1619703082;
        mr.fukg[14] = -1122050804;
        mr.fukg[15] = -1726811999;
        mr.fukg[16] = -1684535098;
        mr.fukg[17] = -192635683;
        mr.fukg[18] = 326904971;
        mr.fukg[19] = 2040770976;
        mr.fukg[20] = 2010192083;
        mr.fukg[21] = 1480133950;
        mr.fukg[22] = 526216938;
        mr.fukg[23] = -1276342066;
        mr.fukg[24] = 1736804510;
        mr.fukg[25] = -2009796837;
        mr.fukg[26] = -995976552;
        mr.fukg[27] = -30666072;
        mr.fukg[28] = -2018199972;
        mr.fukg[29] = 11261371;
        mr.fukg[30] = -332048095;
        mr.fukg[31] = -976262366;
        mr.fukg[32] = -1325792529;
        mr.fukg[33] = -293689709;
        mr.fukg[34] = 1225086251;
        mr.fukg[35] = -698924037;
        mr.fukg[36] = 865737673;
        mr.fukg[37] = -1067647392;
        mr.fukg[38] = -1720603564;
        mr.fukg[39] = 974407989;
        mr.fukg[40] = 1167868490;
        mr.fukg[41] = -1249630924;
        mr.fukg[42] = 1290324776;
        mr.fukg[43] = -2096616544;
        mr.fukg[44] = -1413332385;
        mr.fukg[45] = 268422835;
        mr.fukg[46] = 1795233237;
        mr.fukg[47] = -1856966375;
        mr.fukg[48] = 325358158;
        mr.fukg[49] = -189952016;
        mr.fukg[50] = 621032981;
        mr.fukg[51] = -990272231;
        mr.fukg[52] = 615008687;
        mr.fukg[53] = 611164774;
        mr.fukg[54] = 220984542;
        mr.fukg[55] = -1273783238;
        mr.fukg[56] = -892861008;
        mr.fukg[57] = -545612921;
        mr.fukg[58] = -1340697743;
        mr.fukg[59] = -885920208;
        mr.fukg[60] = 1478791393;
        mr.fukg[61] = 973096807;
        mr.fukg[62] = -1439374281;
        mr.fukg[63] = -1404902246;
        mr.fukg[64] = -1361590018;
        mr.fukg[65] = -842101318;
        mr.fukg[66] = -541092769;
        mr.fukg[67] = 911237395;
        mr.fukg[68] = -2114039612;
        mr.fukg[69] = -2125185186;
        mr.fukg[70] = 1337046650;
        mr.fukg[71] = -1027886657;
        mr.fukg[72] = -1392717817;
        mr.fukg[73] = 32166087;
        mr.fukg[74] = -617975253;
        mr.fukg[75] = 1421436073;
        mr.fukg[76] = -1649945566;
        mr.fukg[77] = -1491262774;
        mr.fukg[78] = -137448795;
        mr.fukg[79] = 1489271548;
        mr.fukg[80] = -262742695;
        mr.fukg[81] = 692246058;
        mr.fukg[82] = 2000718688;
        mr.fukg[83] = -582086994;
        mr.fukg[84] = 1435535285;
        mr.fukg[85] = -553279284;
        mr.fukg[86] = -1396515347;
        mr.fukg[87] = 571825709;
        mr.fukg[88] = 1084892309;
        mr.fukg[89] = -46081319;
        mr.fukg[90] = 2002376642;
        mr.fukg[91] = 135909387;
        mr.fukg[92] = -1382318694;
        mr.fukg[93] = -639131241;
        mr.fukg[94] = -1988416059;
        mr.fukg[95] = -359263406;
        mr.fukg[96] = 1541764031;
        mr.fukg[97] = 1247387557;
        mr.fukg[98] = 2143692742;
        mr.fukg[99] = 1329975746;
    }

    private static /* synthetic */ void furw() {
        mr.fukg[100] = -201045887;
        mr.fukg[101] = -97573393;
    }

    /*
     * Exception decompiling
     */
    private static float[][] readFrames(Path var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    static {
        fukg = new int[102];
        fukh = new int[102];
        mr.furv();
        mr.furw();
        mr.furx();
        mr.fury();
        fukn = new long[89];
        fuko = new long[89];
        mr.furz();
        mr.fusa();
        DIR = Paths.get("Phobia", "aim", "ml");
        LEGACY_DIR = Paths.get("Phobia", "neuro");
        GSON = new Gson();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean hasModel() {
        block45: {
            block44: {
                block43: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = mr.mz - mr.fuki("funj", fukm(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == mr.fuki("funk", fukf(int ), (int)35)) break;
                        v0 /* !! */  = (long)mr.fuki("funl", fukf(int ), (int)36);
                    }
                    var2 = mr.c;
                    v1 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl11
                    block32: while (true) {
                        v1 /* !! */  = (long)(v2 - mr.fuki("funm", fukm(int ), (int)41));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 190367597: {
                                v2 = mr.fuki("funn", fukm(int ), (int)42);
                                continue block32;
                            }
                            case 656645808: {
                                break block32;
                            }
                            case 835585604: {
                                v2 = mr.fuki("funo", fukm(int ), (int)43);
                                continue block32;
                            }
                            case 2096678536: {
                                v2 = mr.fuki("funp", fukm(int ), (int)44);
                                continue block32;
                            }
                        }
                        break;
                    }
                    var1_1 = mr.b;
                    v3 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl28
                    block33: while (true) {
                        v3 /* !! */  = (long)(mr.fuki("funr", fukm(int ), (int)46) - mr.fuki("funq", fukm(int ), (int)45));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case 656645808: {
                                break block33;
                            }
                            case 1143744289: {
                                continue block33;
                            }
                        }
                        break;
                    }
                    var0_2 = mr.a;
                    if (var2) {
                        throw null;
lbl36:
                        // 5 sources

                        return (boolean)mr.fuki("funs", fukf(int ), (int)37);
                    }
                    if (var0_2 || var0_2) ** GOTO lbl36
                    v4 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl43
                    block35: while (true) {
                        v4 /* !! */  = (long)(v5 - mr.fuki("funt", fukm(int ), (int)47));
lbl43:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1479270880: {
                                v5 = mr.fuki("funu", fukm(int ), (int)48);
                                continue block35;
                            }
                            case -189140758: {
                                v5 = mr.fuki("funv", fukm(int ), (int)49);
                                continue block35;
                            }
                            case 656645808: {
                                break block35;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl56
                    block36: while (true) {
                        v6 /* !! */  = (long)(v7 - mr.fuki("funw", fukm(int ), (int)50));
lbl56:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 656645808: {
                                break block36;
                            }
                            case 797223634: {
                                v7 = mr.fuki("funx", fukm(int ), (int)51);
                                continue block36;
                            }
                            case 850376184: {
                                v7 = mr.fuki("funy", fukm(int ), (int)52);
                                continue block36;
                            }
                            case 2072625899: {
                                v7 = mr.fuki("funz", fukm(int ), (int)53);
                                continue block36;
                            }
                        }
                        break;
                    }
                    v8 = mr.DIR.resolve("holy8k.model.json");
                    v9 = new LinkOption[]{};
                    v10 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl74
                    block37: while (true) {
                        v10 /* !! */  = (long)(v11 - mr.fuki("fuoa", fukm(int ), (int)54));
lbl74:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 556260644: {
                                v11 = mr.fuki("fuob", fukm(int ), (int)55);
                                continue block37;
                            }
                            case 656645808: {
                                break block37;
                            }
                            case 773799291: {
                                v11 = mr.fuki("fuoc", fukm(int ), (int)56);
                                continue block37;
                            }
                        }
                        break;
                    }
                    if (Files.exists(v8, v9)) break block43;
                    if (var0_2) ** GOTO lbl36
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_1 = mr.mz - mr.fuki("fuod", fukm(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == mr.fuki("fuoe", fukf(int ), (int)38)) break;
                        v12 /* !! */  = (long)mr.fuki("fuof", fukf(int ), (int)39);
                    }
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_2 = mr.mz - mr.fuki("fuog", fukm(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == mr.fuki("fuoh", fukf(int ), (int)40)) break;
                        v13 /* !! */  = (long)mr.fuki("fuoi", fukf(int ), (int)41);
                    }
                    v14 = mr.LEGACY_DIR.resolve("holy8k.model.json");
                    v15 = new LinkOption[]{};
                    v16 /* !! */  = mr.mz;
                    if (true) ** GOTO lbl101
                    block40: while (true) {
                        v16 /* !! */  = (long)(v17 - mr.fuki("fuoj", fukm(int ), (int)59));
lbl101:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -384247807: {
                                v17 = mr.fuki("fuok", fukm(int ), (int)60);
                                continue block40;
                            }
                            case 656645808: {
                                break block40;
                            }
                            case 1349059330: {
                                v17 = mr.fuki("fuol", fukm(int ), (int)61);
                                continue block40;
                            }
                        }
                        break;
                    }
                    if (!Files.exists(v14, v15)) break block44;
                    if (var0_2) ** GOTO lbl36
                }
                if (var0_2 || var0_2) ** GOTO lbl36
                v18 = mr.fuki("fuom", fukf(int ), (int)42);
                if (var2) {
                    throw null;
                }
                break block45;
            }
            if (!var0_2 && !var0_2) ** break;
            ** while (true)
            v18 = mr.fuki("fuon", fukf(int ), (int)43);
        }
        return (boolean)v18;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path datasetPath() {
        v0 /* !! */  = mr.mz;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - mr.fuki("fuly", fukm(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1850272216: {
                    v1 = mr.fuki("fulz", fukm(int ), (int)18);
                    continue block45;
                }
                case 197149251: {
                    v1 = mr.fuki("fuma", fukm(int ), (int)19);
                    continue block45;
                }
                case 656645808: {
                    break block45;
                }
            }
            break;
        }
        var3 = mr.c;
        v2 /* !! */  = mr.mz;
        if (true) ** GOTO lbl19
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - mr.fuki("fumb", fukm(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2079013140: {
                    v3 = mr.fuki("fumc", fukm(int ), (int)21);
                    continue block46;
                }
                case -1975350426: {
                    v3 = mr.fuki("fumd", fukm(int ), (int)22);
                    continue block46;
                }
                case -130840624: {
                    v3 = mr.fuki("fume", fukm(int ), (int)23);
                    continue block46;
                }
                case 656645808: {
                    break block46;
                }
            }
            break;
        }
        var2_1 /* !! */  = mr.b;
        v4 /* !! */  = mr.mz;
        if (true) ** GOTO lbl36
        block47: while (true) {
            v4 /* !! */  = (long)(v5 - mr.fuki("fumf", fukm(int ), (int)24));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1674840499: {
                    v5 = mr.fuki("fumg", fukm(int ), (int)25);
                    continue block47;
                }
                case -1256673584: {
                    v5 = mr.fuki("fumh", fukm(int ), (int)26);
                    continue block47;
                }
                case 656645808: {
                    break block47;
                }
                case 1204663868: {
                    v5 = mr.fuki("fumi", fukm(int ), (int)27);
                    continue block47;
                }
            }
            break;
        }
        var1_2 = mr.a;
        if (var3) {
            throw null;
lbl51:
            // 4 sources

            return null;
        }
        if (var1_2 || var1_2) ** GOTO lbl51
        v6 /* !! */  = mr.mz;
        if (true) ** GOTO lbl58
        block49: while (true) {
            v6 /* !! */  = (long)(v7 - mr.fuki("fumj", fukm(int ), (int)28));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1960771220: {
                    v7 = mr.fuki("fumk", fukm(int ), (int)29);
                    continue block49;
                }
                case -487216298: {
                    v7 = mr.fuki("fuml", fukm(int ), (int)30);
                    continue block49;
                }
                case 656645808: {
                    break block49;
                }
                case 1569754730: {
                    v7 = mr.fuki("fumm", fukm(int ), (int)31);
                    continue block49;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = mr.mz - mr.fuki("fumn", fukm(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == mr.fuki("fumo", fukf(int ), (int)21)) break;
            v8 /* !! */  = (long)mr.fuki("fump", fukf(int ), (int)22);
        }
        var0_3 = mr.DIR.resolve("holy8k.dataset.json");
        if (var1_2 || var1_2) ** GOTO lbl51
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = new LinkOption[]{};
                v10 /* !! */  = mr.mz;
                if (true) ** GOTO lbl86
                block51: while (true) {
                    v10 /* !! */  = (long)(mr.fuki("fumr", fukm(int ), (int)34) - mr.fuki("fumq", fukm(int ), (int)33));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2053505601: {
                            continue block51;
                        }
                        case 656645808: {
                            break block51;
                        }
                    }
                    break;
                }
                if (!Files.exists(var0_3, v9)) ** GOTO lbl94
                if (var1_2) ** GOTO lbl51
                return var0_3;
lbl94:
                // 1 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = mr.mz - mr.fuki("fums", fukm(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == mr.fuki("fumt", fukf(int ), (int)23)) break;
                    v11 /* !! */  = (long)mr.fuki("fumu", fukf(int ), (int)24);
                }
                v12 /* !! */  = mr.mz;
                if (true) ** GOTO lbl106
                block53: while (true) {
                    v12 /* !! */  = (long)(v13 - mr.fuki("fumv", fukm(int ), (int)36));
lbl106:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2078195815: {
                            v13 = mr.fuki("fumw", fukm(int ), (int)37);
                            continue block53;
                        }
                        case 656645808: {
                            break block53;
                        }
                        case 1161013507: {
                            v13 = mr.fuki("fumx", fukm(int ), (int)38);
                            continue block53;
                        }
                        case 1378615187: {
                            v13 = mr.fuki("fumy", fukm(int ), (int)39);
                            continue block53;
                        }
                    }
                    break;
                }
                return mr.LEGACY_DIR.resolve("holy8k.dataset.json");
            }
lbl119:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)mr.fuki("fumz", fukf(int ), (int)25);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 1: {
                var2_1 /* !! */  = (int)mr.fuki("funa", fukf(int ), (int)26);
                if (!var3) ** GOTO lbl119
                throw null;
            }
lbl128:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)mr.fuki("funb", fukf(int ), (int)27);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 3: {
                var2_1 /* !! */  = (int)mr.fuki("func", fukf(int ), (int)28);
                if (!var3) ** GOTO lbl119
                throw null;
            }
lbl137:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)mr.fuki("fund", fukf(int ), (int)29);
                if (!var3) ** GOTO lbl128
                throw null;
            }
lbl141:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)mr.fuki("fune", fukf(int ), (int)30);
                if (var3) {
                    throw null;
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)mr.fuki("funf", fukf(int ), (int)31);
                if (!var3) break;
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)mr.fuki("fung", fukf(int ), (int)32);
                    if (!var3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl154:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)mr.fuki("funh", fukf(int ), (int)33);
                if (!var3) ** GOTO lbl141
                throw null;
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)mr.fuki("funi", fukf(int ), (int)34);
        ** while (!var3)
lbl161:
        // 1 sources

        throw null;
    }
}

