/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.du;

public final class mj
extends Enum<mj> {
    private static final /* synthetic */ mj[] $VALUES;
    public static final /* enum */ mj COMBAT;
    private static int[] jezn;
    public static final /* enum */ mj PLAYER;
    public static final /* enum */ mj VISUALS;
    private static int[] jezm;
    public static final int b;
    public static final boolean a;
    public static final /* enum */ mj MOVEMENT;
    public static final /* enum */ mj MISC;
    protected static final long rf = -6793078968020542937L;
    public static final /* enum */ mj THEME;
    public static final boolean c;
    private static long[] jezh;
    private static long[] jezi;
    private final String readableName;
    public static final /* enum */ mj IRC;
    private final String icon;
    private final du[] moduleCategories;

    private static /* synthetic */ void jfis() {
        mj.jezh[0] = 5627669782365306713L;
        mj.jezh[1] = -9153851145547904419L;
        mj.jezh[2] = -6080463024511831159L;
        mj.jezh[3] = -8757089986889818993L;
        mj.jezh[4] = 3567947446045485529L;
        mj.jezh[5] = -4129565677544770765L;
        mj.jezh[6] = -6437411038954915943L;
        mj.jezh[7] = -1906354361016137474L;
        mj.jezh[8] = -8939277620719599443L;
        mj.jezh[9] = -782912859492639995L;
        mj.jezh[10] = 3949207726148302345L;
        mj.jezh[11] = 3828719178126386071L;
        mj.jezh[12] = -5908486982920814065L;
        mj.jezh[13] = -3730595941857979059L;
        mj.jezh[14] = -3981253069990789966L;
        mj.jezh[15] = 6001708780944721737L;
        mj.jezh[16] = 7610364840053283340L;
        mj.jezh[17] = -4624396732968600621L;
        mj.jezh[18] = 6845894273824807923L;
        mj.jezh[19] = -7466890574957385520L;
        mj.jezh[20] = 7327963767693124096L;
        mj.jezh[21] = -8821970459854300847L;
        mj.jezh[22] = 298500515088991624L;
        mj.jezh[23] = -3034927446932211583L;
        mj.jezh[24] = 6683679970827240678L;
        mj.jezh[25] = -5193899132282216794L;
        mj.jezh[26] = -2446577615054730818L;
        mj.jezh[27] = -3733386212907954519L;
        mj.jezh[28] = -7283322183225934929L;
        mj.jezh[29] = -7897129271194017697L;
        mj.jezh[30] = 1105452837873999440L;
        mj.jezh[31] = -8113496678221667990L;
        mj.jezh[32] = 7734955894584830286L;
        mj.jezh[33] = -3842705417181230385L;
        mj.jezh[34] = 7065695186825221241L;
        mj.jezh[35] = 3663774990165772244L;
        mj.jezh[36] = 8926406227716268575L;
        mj.jezh[37] = -7875771208921606896L;
        mj.jezh[38] = -7857747537033822253L;
        mj.jezh[39] = 817675897493027232L;
        mj.jezh[40] = 6029681557114888845L;
        mj.jezh[41] = -6822378685439942449L;
        mj.jezh[42] = -1387581773555631847L;
        mj.jezh[43] = 8595950201966211801L;
        mj.jezh[44] = 5316812548949036195L;
        mj.jezh[45] = 5385485380646806370L;
        mj.jezh[46] = 5963001427469144649L;
        mj.jezh[47] = 7684881746982998042L;
        mj.jezh[48] = -1585480497236566477L;
        mj.jezh[49] = 3551415308886596167L;
        mj.jezh[50] = -6645686327928252394L;
        mj.jezh[51] = -2032306589313199102L;
        mj.jezh[52] = 6951008031466008233L;
        mj.jezh[53] = 8592233577968814096L;
        mj.jezh[54] = 8276316882785799742L;
        mj.jezh[55] = -7826180610524991085L;
        mj.jezh[56] = -2974936164567462304L;
        mj.jezh[57] = -624614565051888574L;
        mj.jezh[58] = 2951342693062673132L;
        mj.jezh[59] = -2718498617064485220L;
        mj.jezh[60] = -4021553150390889537L;
        mj.jezh[61] = -366800819494753210L;
        mj.jezh[62] = -8921191868761713506L;
        mj.jezh[63] = 2272850380239345097L;
        mj.jezh[64] = -7312685096335596990L;
        mj.jezh[65] = -988524773972255459L;
        mj.jezh[66] = -2456934734788591808L;
        mj.jezh[67] = 6020815077278555462L;
        mj.jezh[68] = 7995844129629690061L;
        mj.jezh[69] = 3537527683386571241L;
        mj.jezh[70] = -2661051986323992341L;
        mj.jezh[71] = 629681861298499245L;
        mj.jezh[72] = -8175679549360963365L;
        mj.jezh[73] = -2748088833703584360L;
        mj.jezh[74] = -7965593678509533357L;
        mj.jezh[75] = -4732624892181376597L;
        mj.jezh[76] = 6501427789975543383L;
        mj.jezh[77] = -4964420701831090175L;
        mj.jezh[78] = 550862011870245729L;
        mj.jezh[79] = 2345401764485680096L;
        mj.jezh[80] = 2997793693292444619L;
        mj.jezh[81] = -5506494582315030838L;
        mj.jezh[82] = 1240714027333385485L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mj(String var3_3, String var4_4, du ... var5_5) {
        var7_6 /* !! */  = mj.b;
        var6_7 = mj.a;
        super(var1_1, var2_2);
        this.readableName = var3_3;
        this.icon = var4_4;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.moduleCategories = var5_5;
                return;
            }
            case 0: {
                while (true) {
                    var7_6 /* !! */  = (int)mj.jezj("jfay", jezl(int ), (int)16);
                }
            }
lbl15:
            // 2 sources

            case 1: {
                var7_6 /* !! */  = (int)mj.jezj("jfaz", jezl(int ), (int)17);
                break;
            }
            case 2: {
                while (true) {
                    var7_6 /* !! */  = (int)mj.jezj("jfba", jezl(int ), (int)18);
                }
            }
            case 3: {
                var7_6 /* !! */  = (int)mj.jezj("jfbb", jezl(int ), (int)19);
                ** GOTO lbl15
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)mj.jezj("jfbc", jezl(int ), (int)20);
                    break;
                }
            }
            case 5: 
        }
        var7_6 /* !! */  = (int)mj.jezj("jfbd", jezl(int ), (int)21);
        ** while (true)
    }

    private static /* synthetic */ void jfip() {
        mj.jezn[100] = -1007060328;
        mj.jezn[101] = -1218817928;
        mj.jezn[102] = -525274349;
        mj.jezn[103] = 1821757950;
        mj.jezn[104] = -2111083967;
        mj.jezn[105] = 1768874571;
        mj.jezn[106] = -10346353;
        mj.jezn[107] = -1741106585;
        mj.jezn[108] = -523769774;
        mj.jezn[109] = 156337839;
        mj.jezn[110] = 1521467557;
        mj.jezn[111] = 1852573259;
        mj.jezn[112] = -593343075;
        mj.jezn[113] = -61734911;
        mj.jezn[114] = -1412687975;
        mj.jezn[115] = -2135452232;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static mj fromModuleCategory(du var0) {
        block73: {
            v0 /* !! */  = mj.rf;
            if (true) ** GOTO lbl5
            block42: while (true) {
                v0 /* !! */  = (long)(v1 - mj.jezj("jfdu", jezg(int ), (int)45));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -340238137: {
                        v1 = mj.jezj("jfdv", jezg(int ), (int)46);
                        continue block42;
                    }
                    case -241242798: {
                        v1 = mj.jezj("jfdw", jezg(int ), (int)47);
                        continue block42;
                    }
                    case 2079676967: {
                        break block42;
                    }
                }
                break;
            }
            var7_1 = mj.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jfdx", jezg(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == mj.jezj("jfdy", jezl(int ), (int)66)) break;
                v2 /* !! */  = (long)mj.jezj("jfdz", jezl(int ), (int)67);
            }
            var6_2 /* !! */  = mj.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = mj.rf - mj.jezj("jfea", jezg(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == mj.jezj("jfeb", jezl(int ), (int)68)) {
                    var5_3 = mj.a;
                    if (var7_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)mj.jezj("jfec", jezl(int ), (int)69);
            }
            if (var5_3 != false) return null;
            if (var5_3 != false) return null;
            v4 /* !! */  = mj.rf;
            if (true) ** GOTO lbl36
            block45: while (true) {
                v4 /* !! */  = (long)(v5 - mj.jezj("jfed", jezg(int ), (int)50));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1266283285: {
                        v5 = mj.jezj("jfee", jezg(int ), (int)51);
                        continue block45;
                    }
                    case 155554710: {
                        v5 = mj.jezj("jfef", jezg(int ), (int)52);
                        continue block45;
                    }
                    case 2079676967: {
                        break block45;
                    }
                }
                break;
            }
            var1_4 = mj.values();
            if (var5_3 != false) return null;
            var2_5 = var1_4.length;
            if (var5_3 != false) return null;
            var3_6 = mj.jezj("jfeg", jezl(int ), (int)70);
            if (var5_3 != false) return null;
            block46: while (true) {
                block74: {
                    if (var5_3 != false) return null;
                    if (var5_3 != false) return null;
                    if (var3_6 >= var2_5) break block74;
                    if (var5_3 != false) return null;
                    var4_7 = var1_4[var3_6];
                    if (var5_3 != false) return null;
                    if (var5_3 != false) return null;
                    v6 /* !! */  = mj.rf;
                    if (true) ** GOTO lbl68
                }
                if (var5_3 != false) return null;
                if (var5_3 != false) return null;
                v7 /* !! */  = mj.rf;
                ** GOTO lbl171
                block47: while (true) {
                    v6 /* !! */  = (long)(v8 - mj.jezj("jfeh", jezg(int ), (int)53));
lbl68:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -980043066: {
                            v8 = mj.jezj("jfei", jezg(int ), (int)54);
                            continue block47;
                        }
                        case -549469266: {
                            v8 = mj.jezj("jfej", jezg(int ), (int)55);
                            continue block47;
                        }
                        case -189831734: {
                            v8 = mj.jezj("jfek", jezg(int ), (int)56);
                            continue block47;
                        }
                        case 2079676967: {
                            break block47;
                        }
                    }
                    break;
                }
                if (var4_7.contains(var0)) {
                    if (var5_3 != false) return null;
                    if (var5_3 != false) return null;
                    return var4_7;
                }
                if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var6_2 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var5_3 != false) return null;
                            if (var5_3 != false) return null;
                            ++var3_6;
                            if (var5_3 != false) return null;
                            if (!var7_1) continue block46;
                            throw null;
                        }
                        case 0: {
                            var6_2 /* !! */  = (int)mj.jezj("jfen", jezl(int ), (int)71);
                            cfr_temp_0 = 9;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 1: {
                            do {
                                var6_2 /* !! */  = (int)mj.jezj("jfeo", jezl(int ), (int)72);
                            } while (!var7_1);
                            throw null;
                        }
                        case 3: {
                            var6_2 /* !! */  = (int)mj.jezj("jfeq", jezl(int ), (int)74);
                            cfr_temp_0 = 12;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 4: {
                            ** break;
                        }
                        case 7: {
                            var6_2 /* !! */  = (int)mj.jezj("jfeu", jezl(int ), (int)78);
                            cfr_temp_0 = 15;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 8: {
                            var6_2 /* !! */  = (int)mj.jezj("jfev", jezl(int ), (int)79);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 9: {
                            var6_2 /* !! */  = (int)mj.jezj("jfew", jezl(int ), (int)80);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 2: {
                            var6_2 /* !! */  = (int)mj.jezj("jfep", jezl(int ), (int)73);
                            if (var7_1) {
                                throw null;
                            }
                            ** GOTO lbl189
                        }
                        case 10: {
                            var6_2 /* !! */  = (int)mj.jezj("jfex", jezl(int ), (int)81);
                            cfr_temp_0 = 12;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 14: {
                            var6_2 /* !! */  = (int)mj.jezj("jffb", jezl(int ), (int)85);
                            cfr_temp_0 = 13;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 15: {
                            var6_2 /* !! */  = (int)mj.jezj("jffc", jezl(int ), (int)86);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 12: {
                            var6_2 /* !! */  = (int)mj.jezj("jfez", jezl(int ), (int)83);
                            cfr_temp_0 = 18;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                        }
                        case 16: {
                            var6_2 /* !! */  = (int)mj.jezj("jffd", jezl(int ), (int)87);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 13: {
                            do {
                                var6_2 /* !! */  = (int)mj.jezj("jffa", jezl(int ), (int)84);
                            } while (!var7_1);
                            throw null;
                        }
                        case 18: {
                            do {
                                var6_2 /* !! */  = (int)mj.jezj("jfff", jezl(int ), (int)89);
                            } while (!var7_1);
                            throw null;
                        }
                        case 19: {
                            ** GOTO lbl189
                        }
lbl171:
                        // 1 sources

                        block52: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1932654013: {
                                    v7 /* !! */  = (long)(mj.jezj("jfem", jezg(int ), (int)58) - mj.jezj("jfel", jezg(int ), (int)57));
                                    continue block52;
                                }
                                case 2079676967: {
                                    return mj.MISC;
                                }
                            }
                            break;
                        }
                        return mj.MISC;
lbl179:
                        // 2 sources

                        while (true) {
                            var6_2 /* !! */  = (int)mj.jezj("jfer", jezl(int ), (int)75);
                            cfr_temp_0 = 5;
                            if (var7_1) {
                                throw null;
                            }
                            break block73;
                            break;
                        }
                        case 5: {
                            var6_2 /* !! */  = (int)mj.jezj("jfes", jezl(int ), (int)76);
                            if (var7_1) {
                                throw null;
                            }
lbl189:
                            // 4 sources

                            var6_2 /* !! */  = (int)mj.jezj("jffg", jezl(int ), (int)90);
                            if (!var7_1) ** continue;
                            throw null;
                        }
                        case 6: {
                            var6_2 /* !! */  = (int)mj.jezj("jfet", jezl(int ), (int)77);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 11: {
                            var6_2 /* !! */  = (int)mj.jezj("jfey", jezl(int ), (int)82);
                            if (var7_1) {
                                throw null;
                            }
                        }
                        case 17: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl205
        }
        do {
            if (true) ** continue;
lbl205:
            // 2 sources

            var6_2 /* !! */  = (int)mj.jezj("jffe", jezl(int ), (int)88);
            cfr_temp_0 = 6;
        } while (!var7_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mj[] $values() {
        v0 /* !! */  = mj.rf;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - mj.jezj("jffh", jezg(int ), (int)59));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1390119435: {
                    v1 = mj.jezj("jffi", jezg(int ), (int)60);
                    continue block35;
                }
                case -818139627: {
                    v1 = mj.jezj("jffj", jezg(int ), (int)61);
                    continue block35;
                }
                case -21862064: {
                    v1 = mj.jezj("jffk", jezg(int ), (int)62);
                    continue block35;
                }
                case 2079676967: {
                    break block35;
                }
            }
            break;
        }
        var2 = mj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mj.rf - mj.jezj("jffl", jezg(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mj.jezj("jffm", jezl(int ), (int)91)) break;
            v2 /* !! */  = (long)mj.jezj("jffn", jezl(int ), (int)92);
        }
        var1_1 /* !! */  = mj.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jffo", jezg(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mj.jezj("jffp", jezl(int ), (int)93)) break;
            v3 /* !! */  = (long)mj.jezj("jffq", jezl(int ), (int)94);
        }
        var0_2 = mj.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 = new mj[7];
                v5 = mj.jezj("jffr", jezl(int ), (int)95);
                while (true) {
                    if ((v6 = (cfr_temp_2 = mj.rf - mj.jezj("jffs", jezg(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == mj.jezj("jfft", jezl(int ), (int)96)) break;
                    v6 = 1281648249;
                }
                v4[v5] = mj.COMBAT;
                v7 = mj.jezj("jffu", jezl(int ), (int)97);
                v8 /* !! */  = mj.rf;
                if (true) ** GOTO lbl54
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - mj.jezj("jffv", jezg(int ), (int)66));
lbl54:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -472759628: {
                            v9 = mj.jezj("jffw", jezg(int ), (int)67);
                            continue block40;
                        }
                        case -174801563: {
                            v9 = mj.jezj("jffx", jezg(int ), (int)68);
                            continue block40;
                        }
                        case 1171906448: {
                            v9 = mj.jezj("jffy", jezg(int ), (int)69);
                            continue block40;
                        }
                        case 2079676967: {
                            break block40;
                        }
                    }
                    break;
                }
                v4[v7] = mj.MOVEMENT;
                v10 = mj.jezj("jffz", jezl(int ), (int)98);
                while (true) {
                    if ((v11 = (cfr_temp_3 = mj.rf - mj.jezj("jfga", jezg(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 == mj.jezj("jfgb", jezl(int ), (int)99)) break;
                    v11 = 1123946866;
                }
                v4[v10] = mj.PLAYER;
                v12 = mj.jezj("jfgc", jezl(int ), (int)100);
                v13 /* !! */  = mj.rf;
                if (true) ** GOTO lbl80
                block42: while (true) {
                    v13 /* !! */  = (long)(v14 - mj.jezj("jfgd", jezg(int ), (int)71));
lbl80:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1073130372: {
                            v14 = mj.jezj("jfge", jezg(int ), (int)72);
                            continue block42;
                        }
                        case 555714577: {
                            v14 = mj.jezj("jfgf", jezg(int ), (int)73);
                            continue block42;
                        }
                        case 753416697: {
                            v14 = mj.jezj("jfgg", jezg(int ), (int)74);
                            continue block42;
                        }
                        case 2079676967: {
                            break block42;
                        }
                    }
                    break;
                }
                v4[v12] = mj.VISUALS;
                v15 = mj.jezj("jfgh", jezl(int ), (int)101);
                v16 /* !! */  = mj.rf;
                if (true) ** GOTO lbl98
                block43: while (true) {
                    v16 /* !! */  = (long)(v17 - mj.jezj("jfgi", jezg(int ), (int)75));
lbl98:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -488547518: {
                            v17 = mj.jezj("jfgj", jezg(int ), (int)76);
                            continue block43;
                        }
                        case 927324564: {
                            v17 = mj.jezj("jfgk", jezg(int ), (int)77);
                            continue block43;
                        }
                        case 1477202498: {
                            v17 = mj.jezj("jfgl", jezg(int ), (int)78);
                            continue block43;
                        }
                        case 2079676967: {
                            break block43;
                        }
                    }
                    break;
                }
                v4[v15] = mj.MISC;
                v18 = mj.jezj("jfgm", jezl(int ), (int)102);
                v19 /* !! */  = mj.rf;
                if (true) ** GOTO lbl116
                block44: while (true) {
                    v19 /* !! */  = (long)(v20 - mj.jezj("jfgn", jezg(int ), (int)79));
lbl116:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1890301142: {
                            v20 = mj.jezj("jfgo", jezg(int ), (int)80);
                            continue block44;
                        }
                        case -1422776390: {
                            v20 = mj.jezj("jfgp", jezg(int ), (int)81);
                            continue block44;
                        }
                        case 2079676967: {
                            break block44;
                        }
                    }
                    break;
                }
                v4[v18] = mj.THEME;
                v21 = mj.jezj("jfgq", jezl(int ), (int)103);
                while (true) {
                    if ((v22 = (cfr_temp_4 = mj.rf - mj.jezj("jfgr", jezg(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v22 == mj.jezj("jfgs", jezl(int ), (int)104)) break;
                    v22 = 687387960;
                }
                v4[v21] = mj.IRC;
                return v4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mj.jezj("jfgt", jezl(int ), (int)105);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl146
                    break;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)mj.jezj("jfgu", jezl(int ), (int)106);
                } while (!var2);
                throw null;
            }
lbl146:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)mj.jezj("jfgv", jezl(int ), (int)107);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mj.jezj("jfgw", jezl(int ), (int)108);
        ** while (!var2)
lbl153:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jfig() {
        mj.jezn[0] = 216792746;
        mj.jezn[1] = 1259061245;
        mj.jezn[2] = -917873045;
        mj.jezn[3] = -1129578327;
        mj.jezn[4] = -1156819550;
        mj.jezn[5] = 1317788468;
        mj.jezn[6] = 597791224;
        mj.jezn[7] = -199799827;
        mj.jezn[8] = -1411943743;
        mj.jezn[9] = -387351346;
        mj.jezn[10] = -537050347;
        mj.jezn[11] = 2107268528;
        mj.jezn[12] = -1463543732;
        mj.jezn[13] = 1888505015;
        mj.jezn[14] = -1634085102;
        mj.jezn[15] = 644942681;
        mj.jezn[16] = -781541173;
        mj.jezn[17] = 1923129598;
        mj.jezn[18] = -672826659;
        mj.jezn[19] = -893717722;
        mj.jezn[20] = 888573127;
        mj.jezn[21] = -1926611991;
        mj.jezn[22] = -2034698187;
        mj.jezn[23] = 1095478424;
        mj.jezn[24] = -468774602;
        mj.jezn[25] = 1904952716;
        mj.jezn[26] = -18466991;
        mj.jezn[27] = -225356863;
        mj.jezn[28] = -1702564663;
        mj.jezn[29] = -163836961;
        mj.jezn[30] = -914009016;
        mj.jezn[31] = -371427861;
        mj.jezn[32] = 1905782226;
        mj.jezn[33] = -390903486;
        mj.jezn[34] = -1679066716;
        mj.jezn[35] = -1394853543;
        mj.jezn[36] = 570459290;
        mj.jezn[37] = 545650621;
        mj.jezn[38] = 262387874;
        mj.jezn[39] = -1869874485;
        mj.jezn[40] = 758532904;
        mj.jezn[41] = -439245003;
        mj.jezn[42] = 324833411;
        mj.jezn[43] = 864577704;
        mj.jezn[44] = -1128487629;
        mj.jezn[45] = -1136057484;
        mj.jezn[46] = 973035084;
        mj.jezn[47] = -380856865;
        mj.jezn[48] = 2002350405;
        mj.jezn[49] = 2061679160;
        mj.jezn[50] = 900550300;
        mj.jezn[51] = 556205058;
        mj.jezn[52] = 1740577781;
        mj.jezn[53] = 1794975206;
        mj.jezn[54] = 1657298965;
        mj.jezn[55] = -1140481429;
        mj.jezn[56] = 1639777834;
        mj.jezn[57] = -50295601;
        mj.jezn[58] = -234242046;
        mj.jezn[59] = -584919953;
        mj.jezn[60] = -287540451;
        mj.jezn[61] = 1597017251;
        mj.jezn[62] = -47510852;
        mj.jezn[63] = -702632969;
        mj.jezn[64] = -667969185;
        mj.jezn[65] = 1473186087;
        mj.jezn[66] = -752439232;
        mj.jezn[67] = -1523580330;
        mj.jezn[68] = -1961586059;
        mj.jezn[69] = -1975738740;
        mj.jezn[70] = 1413346412;
        mj.jezn[71] = 858951871;
        mj.jezn[72] = -68333986;
        mj.jezn[73] = -320780377;
        mj.jezn[74] = -1959042825;
        mj.jezn[75] = 3744472;
        mj.jezn[76] = 208159137;
        mj.jezn[77] = 788736472;
        mj.jezn[78] = 1461857084;
        mj.jezn[79] = 89084275;
        mj.jezn[80] = -1901663245;
        mj.jezn[81] = 53559663;
        mj.jezn[82] = -1624624057;
        mj.jezn[83] = 1106387294;
        mj.jezn[84] = 335438401;
        mj.jezn[85] = -1553327889;
        mj.jezn[86] = 1371263861;
        mj.jezn[87] = -930808516;
        mj.jezn[88] = 1198632131;
        mj.jezn[89] = 723407827;
        mj.jezn[90] = -1968102163;
        mj.jezn[91] = -362306282;
        mj.jezn[92] = -73959221;
        mj.jezn[93] = 2002151160;
        mj.jezn[94] = -1549122944;
        mj.jezn[95] = 564681574;
        mj.jezn[96] = -1802114944;
        mj.jezn[97] = 1644684393;
        mj.jezn[98] = -468032824;
        mj.jezn[99] = -1789560231;
    }

    private static /* synthetic */ void jfjd() {
        mj.jezi[0] = -8337207756542490687L;
        mj.jezi[1] = -8942880658343037897L;
        mj.jezi[2] = 793710632030073474L;
        mj.jezi[3] = -5344135784373147953L;
        mj.jezi[4] = -4235543241481484437L;
        mj.jezi[5] = 7414498845427152557L;
        mj.jezi[6] = 6603659984701807588L;
        mj.jezi[7] = 8249513505627268587L;
        mj.jezi[8] = 3012876368465170009L;
        mj.jezi[9] = -9208021218348237037L;
        mj.jezi[10] = 4163019476922926412L;
        mj.jezi[11] = -8659880357551699905L;
        mj.jezi[12] = 5959311758462408480L;
        mj.jezi[13] = 1692194408510038291L;
        mj.jezi[14] = 7958259093424322611L;
        mj.jezi[15] = -6181523117833873829L;
        mj.jezi[16] = 6199983837485040553L;
        mj.jezi[17] = 1420333941021332685L;
        mj.jezi[18] = -6763974250862459174L;
        mj.jezi[19] = -5717810524706282101L;
        mj.jezi[20] = 8900449257544363752L;
        mj.jezi[21] = -8821596387703850735L;
        mj.jezi[22] = -4841863452606869759L;
        mj.jezi[23] = 1764701495261577215L;
        mj.jezi[24] = -1520092302628511843L;
        mj.jezi[25] = 2118034134590268246L;
        mj.jezi[26] = -1604631493152524846L;
        mj.jezi[27] = -3804365653462746300L;
        mj.jezi[28] = 2995348708241463705L;
        mj.jezi[29] = -5856590444449742947L;
        mj.jezi[30] = -2441029702112628065L;
        mj.jezi[31] = 7199481863800842735L;
        mj.jezi[32] = -2023819302144362655L;
        mj.jezi[33] = -5727724414889604605L;
        mj.jezi[34] = -6489528090291747560L;
        mj.jezi[35] = -8440427112755261840L;
        mj.jezi[36] = 2122988303966047615L;
        mj.jezi[37] = -1534439528154930134L;
        mj.jezi[38] = -6626910145145774030L;
        mj.jezi[39] = 7449928510857047635L;
        mj.jezi[40] = 8274813270912153304L;
        mj.jezi[41] = 3126051006587391430L;
        mj.jezi[42] = -8461326533067546038L;
        mj.jezi[43] = -1848014335077208874L;
        mj.jezi[44] = 886513881732554858L;
        mj.jezi[45] = 6007237093487065423L;
        mj.jezi[46] = -128554762633170395L;
        mj.jezi[47] = -3768743936433683394L;
        mj.jezi[48] = -3973093322045557596L;
        mj.jezi[49] = 9097082380941151065L;
        mj.jezi[50] = -873762234622991779L;
        mj.jezi[51] = -5377286718710831606L;
        mj.jezi[52] = -3549416044386663905L;
        mj.jezi[53] = -3475602147585897652L;
        mj.jezi[54] = -9115860025093103938L;
        mj.jezi[55] = -3208313047718022028L;
        mj.jezi[56] = 3539371680520184328L;
        mj.jezi[57] = -6904979920700002236L;
        mj.jezi[58] = 7374842707406765818L;
        mj.jezi[59] = -3609294686110005372L;
        mj.jezi[60] = -84162395172575299L;
        mj.jezi[61] = 4216757128407000865L;
        mj.jezi[62] = -7149412766031111615L;
        mj.jezi[63] = -5459756014433810992L;
        mj.jezi[64] = 1646906296944229540L;
        mj.jezi[65] = -328853972430125833L;
        mj.jezi[66] = -8066370631030178211L;
        mj.jezi[67] = 9012137476174654269L;
        mj.jezi[68] = 4875768007292549400L;
        mj.jezi[69] = 1047766805848915200L;
        mj.jezi[70] = 1912552827581540897L;
        mj.jezi[71] = 9063565043373446151L;
        mj.jezi[72] = 8288381216279168876L;
        mj.jezi[73] = 3202319720411051247L;
        mj.jezi[74] = -8918770678487840053L;
        mj.jezi[75] = -7536354194167195103L;
        mj.jezi[76] = 6962503697419972543L;
        mj.jezi[77] = -7041577578259727920L;
        mj.jezi[78] = 5087801750978132010L;
        mj.jezi[79] = 6893495486073791131L;
        mj.jezi[80] = -4589186935873713404L;
        mj.jezi[81] = -4122380181658717847L;
        mj.jezi[82] = -5846179238557029186L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mj[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mj.rf - mj.jezj("jezk", jezg(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mj.jezj("jezo", jezl(int ), (int)0)) break;
            v0 /* !! */  = (long)mj.jezj("jezp", jezl(int ), (int)1);
        }
        var2 = mj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jezq", jezg(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mj.jezj("jezr", jezl(int ), (int)2)) break;
            v1 /* !! */  = (long)mj.jezj("jezs", jezl(int ), (int)3);
        }
        var1_1 /* !! */  = mj.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mj.rf;
                if (true) ** GOTO lbl22
                block26: while (true) {
                    v2 /* !! */  = (long)(v3 - mj.jezj("jezt", jezg(int ), (int)2));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1418743487: {
                            v3 = mj.jezj("jezu", jezg(int ), (int)3);
                            continue block26;
                        }
                        case -860744717: {
                            v3 = mj.jezj("jezv", jezg(int ), (int)4);
                            continue block26;
                        }
                        case -36831779: {
                            v3 = mj.jezj("jezw", jezg(int ), (int)5);
                            continue block26;
                        }
                        case 2079676967: {
                            break block26;
                        }
                    }
                    break;
                }
                var0_2 = mj.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = mj.rf;
                if (true) ** GOTO lbl44
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - mj.jezj("jezx", jezg(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 236054054: {
                            v5 = mj.jezj("jezy", jezg(int ), (int)7);
                            continue block28;
                        }
                        case 1254726686: {
                            v5 = mj.jezj("jezz", jezg(int ), (int)8);
                            continue block28;
                        }
                        case 1901109978: {
                            v5 = mj.jezj("jfaa", jezg(int ), (int)9);
                            continue block28;
                        }
                        case 2079676967: {
                            break block28;
                        }
                    }
                    break;
                }
                v6 /* !! */  = mj.rf;
                if (true) ** GOTO lbl60
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - mj.jezj("jfab", jezg(int ), (int)10));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1777038807: {
                            v7 = mj.jezj("jfac", jezg(int ), (int)11);
                            continue block29;
                        }
                        case -1240296351: {
                            v7 = mj.jezj("jfad", jezg(int ), (int)12);
                            continue block29;
                        }
                        case 2079676967: {
                            break block29;
                        }
                        case 2083000958: {
                            v7 = mj.jezj("jfae", jezg(int ), (int)13);
                            continue block29;
                        }
                    }
                    break;
                }
                return (mj[])mj.$VALUES.clone();
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)mj.jezj("jfaf", jezl(int ), (int)4);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mj.jezj("jfag", jezl(int ), (int)5);
                    if (!var2) break block0;
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)mj.jezj("jfah", jezl(int ), (int)6);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mj.jezj("jfai", jezl(int ), (int)7);
        ** while (!var2)
lbl91:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jfif() {
        mj.jezm[100] = -1007060325;
        mj.jezm[101] = -1218817924;
        mj.jezm[102] = -525274346;
        mj.jezm[103] = 1821757944;
        mj.jezm[104] = 2111083966;
        mj.jezm[105] = 1768874571;
        mj.jezm[106] = -10346353;
        mj.jezm[107] = -1741106588;
        mj.jezm[108] = -523769773;
        mj.jezm[109] = 156337839;
        mj.jezm[110] = 1521467556;
        mj.jezm[111] = 1852573257;
        mj.jezm[112] = -593343074;
        mj.jezm[113] = -61734907;
        mj.jezm[114] = -1412687972;
        mj.jezm[115] = -2135452226;
    }

    static {
        jezm = new int[116];
        jezn = new int[116];
        mj.jfhe();
        mj.jfif();
        mj.jfig();
        mj.jfip();
        jezh = new long[83];
        jezi = new long[83];
        mj.jfis();
        mj.jfjd();
        COMBAT = new mj("Combat", "V", du.RAGE, du.LEGIT);
        MOVEMENT = new mj("Movement", "W", du.MOVEMENT);
        PLAYER = new mj("Player", "Y", du.PLAYER, du.PVE);
        VISUALS = new mj("Visuals", "Z", du.RENDER, du.DISPLAY, du.ESP);
        MISC = new mj("Misc", "X", du.MISC, du.BINDS);
        THEME = new mj("Theme", "T", du.OTHER);
        IRC = new mj("IRC", "\ue00b", new du[0]);
        $VALUES = mj.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean contains(du var1_1) {
        v0 /* !! */  = mj.rf;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - mj.jezj("jfcj", jezg(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1379108245: {
                    v1 = mj.jezj("jfck", jezg(int ), (int)37);
                    continue block33;
                }
                case 355183902: {
                    v1 = mj.jezj("jfcl", jezg(int ), (int)38);
                    continue block33;
                }
                case 737434448: {
                    v1 = mj.jezj("jfcm", jezg(int ), (int)39);
                    continue block33;
                }
                case 2079676967: {
                    break block33;
                }
            }
            break;
        }
        var8_2 = mj.c;
        v2 /* !! */  = mj.rf;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - mj.jezj("jfcn", jezg(int ), (int)40));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1381951600: {
                    v3 = mj.jezj("jfco", jezg(int ), (int)41);
                    continue block34;
                }
                case -1314590244: {
                    v3 = mj.jezj("jfcp", jezg(int ), (int)42);
                    continue block34;
                }
                case 2079676967: {
                    break block34;
                }
            }
            break;
        }
        var7_3 /* !! */  = mj.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = mj.rf - mj.jezj("jfcq", jezg(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mj.jezj("jfcr", jezl(int ), (int)38)) break;
            v4 /* !! */  = (long)mj.jezj("jfcs", jezl(int ), (int)39);
        }
        var6_4 = mj.a;
        if (var8_2) {
            throw null;
lbl41:
            // 11 sources

            return (boolean)mj.jezj("jfct", jezl(int ), (int)40);
        }
        if (var6_4 || var6_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jfcu", jezg(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mj.jezj("jfcv", jezl(int ), (int)41)) break;
            v5 /* !! */  = (long)mj.jezj("jfcw", jezl(int ), (int)42);
        }
        var2_5 = this.moduleCategories;
        if (var6_4) ** GOTO lbl41
        var3_6 = var2_5.length;
        if (var6_4) ** GOTO lbl41
        var4_7 = mj.jezj("jfcx", jezl(int ), (int)43);
        if (var6_4) ** GOTO lbl41
        block38: while (true) {
            if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_4 || var6_4) ** GOTO lbl41
                    if (var4_7 >= var3_6) ** GOTO lbl73
                    if (var6_4) ** GOTO lbl41
                    var5_8 = var2_5[var4_7];
                    if (var6_4 || var6_4) ** GOTO lbl41
                    if (var5_8 != var1_1) ** GOTO lbl68
                    if (var6_4 || var6_4) ** GOTO lbl41
                    return (boolean)mj.jezj("jfcy", jezl(int ), (int)44);
lbl68:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl41
                    ++var4_7;
                    if (var6_4) ** GOTO lbl41
                    if (!var8_2) continue block38;
                    throw null;
lbl73:
                    // 1 sources

                    if (!var6_4 && !var6_4) ** break;
                    ** continue;
                    return (boolean)mj.jezj("jfcz", jezl(int ), (int)45);
                }
                case 0: {
                    var7_3 /* !! */  = (int)mj.jezj("jfda", jezl(int ), (int)46);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl81:
                // 3 sources

                case 1: {
                    do {
                        var7_3 /* !! */  = (int)mj.jezj("jfdb", jezl(int ), (int)47);
                    } while (!var8_2);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_3 /* !! */  = (int)mj.jezj("jfdc", jezl(int ), (int)48);
                        if (var8_2) {
                            throw null;
                        }
                        ** GOTO lbl140
                        break;
                    }
                }
                case 3: {
                    do {
                        var7_3 /* !! */  = (int)mj.jezj("jfdd", jezl(int ), (int)49);
                    } while (!var8_2);
                    throw null;
                }
lbl97:
                // 2 sources

                case 4: {
                    var7_3 /* !! */  = (int)mj.jezj("jfde", jezl(int ), (int)50);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
                case 5: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdf", jezl(int ), (int)51);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl107:
                // 2 sources

                case 6: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdg", jezl(int ), (int)52);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
                case 7: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdh", jezl(int ), (int)53);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
lbl117:
                // 2 sources

                case 8: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdi", jezl(int ), (int)54);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl122:
                // 2 sources

                case 9: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdj", jezl(int ), (int)55);
                    if (!var8_2) ** GOTO lbl97
                    throw null;
                }
lbl126:
                // 2 sources

                case 10: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdk", jezl(int ), (int)56);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl131:
                // 3 sources

                case 11: {
                    do {
                        var7_3 /* !! */  = (int)mj.jezj("jfdl", jezl(int ), (int)57);
                    } while (!var8_2);
                    throw null;
                }
lbl136:
                // 2 sources

                case 12: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdm", jezl(int ), (int)58);
                    if (!var8_2) ** GOTO lbl117
                    throw null;
                }
lbl140:
                // 2 sources

                case 13: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdn", jezl(int ), (int)59);
                    if (!var8_2) ** GOTO lbl107
                    throw null;
                }
                case 14: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdo", jezl(int ), (int)60);
                    if (!var8_2) ** GOTO lbl131
                    throw null;
                }
lbl148:
                // 3 sources

                case 15: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdp", jezl(int ), (int)61);
                    if (!var8_2) ** GOTO lbl126
                    throw null;
                }
lbl152:
                // 3 sources

                case 16: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdq", jezl(int ), (int)62);
                    if (!var8_2) ** GOTO lbl81
                    throw null;
                }
                case 17: {
                    var7_3 /* !! */  = (int)mj.jezj("jfdr", jezl(int ), (int)63);
                    if (!var8_2) ** GOTO lbl81
                    throw null;
                }
lbl160:
                // 2 sources

                case 18: {
                    var7_3 /* !! */  = (int)mj.jezj("jfds", jezl(int ), (int)64);
                    if (!var8_2) ** GOTO lbl122
                    throw null;
                }
                case 19: 
            }
            break;
        }
        var7_3 /* !! */  = (int)mj.jezj("jfdt", jezl(int ), (int)65);
        ** while (!var8_2)
lbl167:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jezl(int n2) {
        return jezm[n2] ^ jezn[n2];
    }

    public static /* synthetic */ CallSite jezj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getIcon() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = rf - mj.jezj("jfbv", jezg(int ), (int)30)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mj.jezj("jfbw", jezl(int ), (int)30)) break;
            object = mj.jezj("jfbx", jezl(int ), (int)31);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = rf - mj.jezj("jfby", jezg(int ), (int)31)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mj.jezj("jfbz", jezl(int ), (int)32)) break;
            object = mj.jezj("jfca", jezl(int ), (int)33);
        }
        int n2 = b;
        Object object = rf;
        block10: while (true) {
            switch ((int)object) {
                case -903321534: {
                    object = mj.jezj("jfcc", jezg(int ), (int)33) - mj.jezj("jfcb", jezg(int ), (int)32);
                    continue block10;
                }
                case 2079676967: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object2 = rf;
        block11: while (true) {
            switch ((int)object2) {
                case 2079676967: {
                    return this.icon;
                }
                case 2090411796: {
                    object2 = mj.jezj("jfce", jezg(int ), (int)35) - mj.jezj("jfcd", jezg(int ), (int)34);
                    continue block11;
                }
            }
            break;
        }
        return this.icon;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mj valueOf(String var0) {
        v0 /* !! */  = mj.rf;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(mj.jezj("jfak", jezg(int ), (int)15) - mj.jezj("jfaj", jezg(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1351590748: {
                    continue block15;
                }
                case 2079676967: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = mj.c;
        v1 /* !! */  = mj.rf;
        if (true) ** GOTO lbl15
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - mj.jezj("jfal", jezg(int ), (int)16));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -393424039: {
                    v2 = mj.jezj("jfam", jezg(int ), (int)17);
                    continue block16;
                }
                case -373468112: {
                    v2 = mj.jezj("jfan", jezg(int ), (int)18);
                    continue block16;
                }
                case 2079676967: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = mj.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = mj.rf - mj.jezj("jfao", jezg(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mj.jezj("jfap", jezl(int ), (int)8)) break;
                    v3 /* !! */  = (long)mj.jezj("jfaq", jezl(int ), (int)9);
                }
                var1_3 = mj.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jfar", jezg(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mj.jezj("jfas", jezl(int ), (int)10)) break;
                    v4 /* !! */  = (long)mj.jezj("jfat", jezl(int ), (int)11);
                }
                return Enum.valueOf(mj.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)mj.jezj("jfau", jezl(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mj.jezj("jfav", jezl(int ), (int)13);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mj.jezj("jfaw", jezl(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mj.jezj("jfax", jezl(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getReadableName() {
        v0 /* !! */  = mj.rf;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mj.jezj("jfbe", jezg(int ), (int)21));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1113371161: {
                    v1 = mj.jezj("jfbf", jezg(int ), (int)22);
                    continue block17;
                }
                case -109118361: {
                    v1 = mj.jezj("jfbg", jezg(int ), (int)23);
                    continue block17;
                }
                case 1902879930: {
                    v1 = mj.jezj("jfbh", jezg(int ), (int)24);
                    continue block17;
                }
                case 2079676967: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = mj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mj.rf - mj.jezj("jfbi", jezg(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mj.jezj("jfbj", jezl(int ), (int)22)) break;
            v2 /* !! */  = (long)mj.jezj("jfbk", jezl(int ), (int)23);
        }
        var2_2 /* !! */  = mj.b;
        v3 /* !! */  = mj.rf;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - mj.jezj("jfbl", jezg(int ), (int)26));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1524063404: {
                    v4 = mj.jezj("jfbm", jezg(int ), (int)27);
                    continue block19;
                }
                case 1841639680: {
                    v4 = mj.jezj("jfbn", jezg(int ), (int)28);
                    continue block19;
                }
                case 2079676967: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = mj.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mj.rf - mj.jezj("jfbo", jezg(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mj.jezj("jfbp", jezl(int ), (int)24)) break;
                    v5 /* !! */  = (long)mj.jezj("jfbq", jezl(int ), (int)25);
                }
                return this.readableName;
            }
            case 0: {
                var2_2 /* !! */  = (int)mj.jezj("jfbr", jezl(int ), (int)26);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mj.jezj("jfbs", jezl(int ), (int)27);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mj.jezj("jfbt", jezl(int ), (int)28);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mj.jezj("jfbu", jezl(int ), (int)29);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long jezg(int n2) {
        return jezh[n2] ^ jezi[n2];
    }

    private static /* synthetic */ void jfhe() {
        mj.jezm[0] = -216792747;
        mj.jezm[1] = -1749394014;
        mj.jezm[2] = 917873044;
        mj.jezm[3] = -1408016122;
        mj.jezm[4] = -1156819552;
        mj.jezm[5] = 1317788469;
        mj.jezm[6] = 597791224;
        mj.jezm[7] = -199799825;
        mj.jezm[8] = 1411943742;
        mj.jezm[9] = 1629165795;
        mj.jezm[10] = 537050346;
        mj.jezm[11] = -1026935959;
        mj.jezm[12] = -1463543730;
        mj.jezm[13] = 1888505012;
        mj.jezm[14] = -1634085101;
        mj.jezm[15] = 644942682;
        mj.jezm[16] = -781541175;
        mj.jezm[17] = 1923129598;
        mj.jezm[18] = -672826663;
        mj.jezm[19] = -893717724;
        mj.jezm[20] = 888573122;
        mj.jezm[21] = -1926611990;
        mj.jezm[22] = 2034698186;
        mj.jezm[23] = 212164525;
        mj.jezm[24] = 468774601;
        mj.jezm[25] = 609719414;
        mj.jezm[26] = -18466992;
        mj.jezm[27] = -225356862;
        mj.jezm[28] = -1702564661;
        mj.jezm[29] = -163836963;
        mj.jezm[30] = 914009015;
        mj.jezm[31] = 525199246;
        mj.jezm[32] = -1905782227;
        mj.jezm[33] = -84991764;
        mj.jezm[34] = -1679066713;
        mj.jezm[35] = -1394853543;
        mj.jezm[36] = 570459291;
        mj.jezm[37] = 545650620;
        mj.jezm[38] = 262387875;
        mj.jezm[39] = 878869940;
        mj.jezm[40] = 758532904;
        mj.jezm[41] = 439245002;
        mj.jezm[42] = -1631482404;
        mj.jezm[43] = 864577704;
        mj.jezm[44] = -1128487630;
        mj.jezm[45] = -1136057484;
        mj.jezm[46] = 973035087;
        mj.jezm[47] = -380856881;
        mj.jezm[48] = 2002350401;
        mj.jezm[49] = 2061679159;
        mj.jezm[50] = 900550286;
        mj.jezm[51] = 556205056;
        mj.jezm[52] = 1740577791;
        mj.jezm[53] = 1794975204;
        mj.jezm[54] = 1657298960;
        mj.jezm[55] = -1140481437;
        mj.jezm[56] = 1639777837;
        mj.jezm[57] = -50295609;
        mj.jezm[58] = -234242039;
        mj.jezm[59] = -584919962;
        mj.jezm[60] = -287540468;
        mj.jezm[61] = 1597017263;
        mj.jezm[62] = -47510860;
        mj.jezm[63] = -702632971;
        mj.jezm[64] = -667969185;
        mj.jezm[65] = 1473186088;
        mj.jezm[66] = 752439231;
        mj.jezm[67] = -1590776580;
        mj.jezm[68] = 1961586058;
        mj.jezm[69] = -317555493;
        mj.jezm[70] = 1413346412;
        mj.jezm[71] = 858951856;
        mj.jezm[72] = -68333997;
        mj.jezm[73] = -320780369;
        mj.jezm[74] = -1959042819;
        mj.jezm[75] = 3744477;
        mj.jezm[76] = 208159137;
        mj.jezm[77] = 788736466;
        mj.jezm[78] = 1461857080;
        mj.jezm[79] = 89084286;
        mj.jezm[80] = -1901663263;
        mj.jezm[81] = 53559662;
        mj.jezm[82] = -1624624064;
        mj.jezm[83] = 1106387279;
        mj.jezm[84] = 335438417;
        mj.jezm[85] = -1553327896;
        mj.jezm[86] = 1371263845;
        mj.jezm[87] = -930808515;
        mj.jezm[88] = 1198632146;
        mj.jezm[89] = 723407836;
        mj.jezm[90] = -1968102163;
        mj.jezm[91] = 362306281;
        mj.jezm[92] = 1285201617;
        mj.jezm[93] = 2002151161;
        mj.jezm[94] = -739912162;
        mj.jezm[95] = 564681574;
        mj.jezm[96] = 1802114943;
        mj.jezm[97] = 1644684392;
        mj.jezm[98] = -468032822;
        mj.jezm[99] = 1789560230;
    }
}

