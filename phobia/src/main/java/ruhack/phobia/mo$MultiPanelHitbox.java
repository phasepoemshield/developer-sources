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

record mo$MultiPanelHitbox(float x, float height, float y, float width) {
    public static final boolean a;
    private final float x;
    private final float height;
    public static final int b;
    private static int[] eelo;
    private final float y;
    public static final boolean c;
    public static final long km = 4868435785049766687L;
    private final float width;
    private static long[] eeme;
    private static int[] eeln;
    private static long[] eemg;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        v0 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(mo$MultiPanelHitbox.eelp("eert", eemc(int ), (int)38) - mo$MultiPanelHitbox.eelp("eerr", eemc(int ), (int)37));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 549268534: {
                    continue block14;
                }
                case 1806760735: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = mo$MultiPanelHitbox.c;
        v1 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(mo$MultiPanelHitbox.eelp("eerv", eemc(int ), (int)40) - mo$MultiPanelHitbox.eelp("eeru", eemc(int ), (int)39));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1858985355: {
                    continue block15;
                }
                case 1806760735: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$MultiPanelHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eerx", eemc(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiPanelHitbox.eelp("eery", eelm(int ), (int)37)) break;
            v2 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eesc", eelm(int ), (int)38);
        }
        var1_3 = mo$MultiPanelHitbox.a;
        if (!var3_1) ** GOTO lbl34
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)mo$MultiPanelHitbox.eelp("eesd", eeqw(int ), (int)39);
                }
lbl34:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eese", eemc(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$MultiPanelHitbox.eelp("eesf", eelm(int ), (int)40)) break;
                    v3 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eesg", eelm(int ), (int)41);
                }
                return this.y;
lbl42:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eesh", eelm(int ), (int)42);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl52
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eesi", eelm(int ), (int)43);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl52:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eesl", eelm(int ), (int)44);
                    if (!var3_1) ** GOTO lbl42
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eesm", eelm(int ), (int)45);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eewq() {
        mo$MultiPanelHitbox.eelo[0] = -2129255554;
        mo$MultiPanelHitbox.eelo[1] = 981485947;
        mo$MultiPanelHitbox.eelo[2] = -932435175;
        mo$MultiPanelHitbox.eelo[3] = -563902721;
        mo$MultiPanelHitbox.eelo[4] = -1202202680;
        mo$MultiPanelHitbox.eelo[5] = 1150837678;
        mo$MultiPanelHitbox.eelo[6] = -1127706902;
        mo$MultiPanelHitbox.eelo[7] = -681701320;
        mo$MultiPanelHitbox.eelo[8] = 1346015483;
        mo$MultiPanelHitbox.eelo[9] = -1025049557;
        mo$MultiPanelHitbox.eelo[10] = 1395449632;
        mo$MultiPanelHitbox.eelo[11] = 2143633116;
        mo$MultiPanelHitbox.eelo[12] = 1058044218;
        mo$MultiPanelHitbox.eelo[13] = 907738036;
        mo$MultiPanelHitbox.eelo[14] = 1369441588;
        mo$MultiPanelHitbox.eelo[15] = -1774864412;
        mo$MultiPanelHitbox.eelo[16] = 1749200584;
        mo$MultiPanelHitbox.eelo[17] = 1307420237;
        mo$MultiPanelHitbox.eelo[18] = 861888322;
        mo$MultiPanelHitbox.eelo[19] = -680302795;
        mo$MultiPanelHitbox.eelo[20] = 1042602491;
        mo$MultiPanelHitbox.eelo[21] = -1423158365;
        mo$MultiPanelHitbox.eelo[22] = -1976876355;
        mo$MultiPanelHitbox.eelo[23] = -1593707994;
        mo$MultiPanelHitbox.eelo[24] = -2077426892;
        mo$MultiPanelHitbox.eelo[25] = -693821781;
        mo$MultiPanelHitbox.eelo[26] = 417584665;
        mo$MultiPanelHitbox.eelo[27] = 760600985;
        mo$MultiPanelHitbox.eelo[28] = -98749114;
        mo$MultiPanelHitbox.eelo[29] = -1903384999;
        mo$MultiPanelHitbox.eelo[30] = -594978769;
        mo$MultiPanelHitbox.eelo[31] = 1337508501;
        mo$MultiPanelHitbox.eelo[32] = -1073990416;
        mo$MultiPanelHitbox.eelo[33] = -1991679005;
        mo$MultiPanelHitbox.eelo[34] = 357931908;
        mo$MultiPanelHitbox.eelo[35] = 46075148;
        mo$MultiPanelHitbox.eelo[36] = -1347698711;
        mo$MultiPanelHitbox.eelo[37] = 1676471161;
        mo$MultiPanelHitbox.eelo[38] = -2129009989;
        mo$MultiPanelHitbox.eelo[39] = -1864117001;
        mo$MultiPanelHitbox.eelo[40] = -409364132;
        mo$MultiPanelHitbox.eelo[41] = 692967381;
        mo$MultiPanelHitbox.eelo[42] = 1904735195;
        mo$MultiPanelHitbox.eelo[43] = -1225643945;
        mo$MultiPanelHitbox.eelo[44] = -1320487167;
        mo$MultiPanelHitbox.eelo[45] = -11308845;
        mo$MultiPanelHitbox.eelo[46] = 890847027;
        mo$MultiPanelHitbox.eelo[47] = 1710240023;
        mo$MultiPanelHitbox.eelo[48] = -1286792361;
        mo$MultiPanelHitbox.eelo[49] = -539993679;
        mo$MultiPanelHitbox.eelo[50] = 696586794;
        mo$MultiPanelHitbox.eelo[51] = 557891163;
        mo$MultiPanelHitbox.eelo[52] = 1608157956;
        mo$MultiPanelHitbox.eelo[53] = 53585567;
        mo$MultiPanelHitbox.eelo[54] = 627634761;
        mo$MultiPanelHitbox.eelo[55] = -1470546802;
        mo$MultiPanelHitbox.eelo[56] = -1294355538;
        mo$MultiPanelHitbox.eelo[57] = 522293467;
        mo$MultiPanelHitbox.eelo[58] = 907628399;
        mo$MultiPanelHitbox.eelo[59] = -162200514;
        mo$MultiPanelHitbox.eelo[60] = -664059;
        mo$MultiPanelHitbox.eelo[61] = -1592634386;
        mo$MultiPanelHitbox.eelo[62] = 2008806056;
        mo$MultiPanelHitbox.eelo[63] = -385067295;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float x() {
        block34: {
            v0 /* !! */  = mo$MultiPanelHitbox.km;
            if (true) ** GOTO lbl5
            block23: while (true) {
                v0 /* !! */  = (long)(v1 - mo$MultiPanelHitbox.eelp("eeqf", eemc(int ), (int)25));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1223095301: {
                        v1 = mo$MultiPanelHitbox.eelp("eeqi", eemc(int ), (int)26);
                        continue block23;
                    }
                    case -546967291: {
                        v1 = mo$MultiPanelHitbox.eelp("eeqj", eemc(int ), (int)27);
                        continue block23;
                    }
                    case 1806760735: {
                        break block23;
                    }
                }
                break;
            }
            var3_1 = mo$MultiPanelHitbox.c;
            v2 /* !! */  = mo$MultiPanelHitbox.km;
            if (true) ** GOTO lbl19
            block24: while (true) {
                v2 /* !! */  = (long)(v3 - mo$MultiPanelHitbox.eelp("eeqk", eemc(int ), (int)28));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1889644713: {
                        v3 = mo$MultiPanelHitbox.eelp("eeql", eemc(int ), (int)29);
                        continue block24;
                    }
                    case -572802944: {
                        v3 = mo$MultiPanelHitbox.eelp("eeqm", eemc(int ), (int)30);
                        continue block24;
                    }
                    case 848784150: {
                        v3 = mo$MultiPanelHitbox.eelp("eeqo", eemc(int ), (int)31);
                        continue block24;
                    }
                    case 1806760735: {
                        break block24;
                    }
                }
                break;
            }
            var2_2 /* !! */  = mo$MultiPanelHitbox.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eeqp", eemc(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == mo$MultiPanelHitbox.eelp("eeqt", eelm(int ), (int)30)) {
                    var1_3 = mo$MultiPanelHitbox.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v4 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eequ", eelm(int ), (int)31);
            }
            if (var1_3 != false) return (float)mo$MultiPanelHitbox.eelp("eeqz", eeqw(int ), (int)32);
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block26: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return (float)mo$MultiPanelHitbox.eelp("eeqz", eeqw(int ), (int)32);
                        v5 /* !! */  = mo$MultiPanelHitbox.km;
                        block27: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -919787649: {
                                    v6 = mo$MultiPanelHitbox.eelp("eerb", eemc(int ), (int)34);
                                    ** GOTO lbl60
                                }
                                case 142720633: {
                                    v6 = mo$MultiPanelHitbox.eelp("eeri", eemc(int ), (int)35);
                                    ** GOTO lbl60
                                }
                                case 1533435738: {
                                    v6 = mo$MultiPanelHitbox.eelp("eerj", eemc(int ), (int)36);
lbl60:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - mo$MultiPanelHitbox.eelp("eera", eemc(int ), (int)33));
                                    continue block27;
                                }
                                case 1806760735: {
                                    return this.x;
                                }
                            }
                            break;
                        }
                        return this.x;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eerl", eelm(int ), (int)33);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block34;
                    }
lbl73:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eerm", eelm(int ), (int)34);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block26;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eern", eelm(int ), (int)35);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eerp", eelm(int ), (int)36);
        ** while (!var3_1)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiPanelHitbox.eelp("eenn", eemc(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1784187624: {
                    v1 = mo$MultiPanelHitbox.eelp("eeno", eemc(int ), (int)7);
                    continue block11;
                }
                case -702512135: {
                    v1 = mo$MultiPanelHitbox.eelp("eenp", eemc(int ), (int)8);
                    continue block11;
                }
                case -14574854: {
                    v1 = mo$MultiPanelHitbox.eelp("eenq", eemc(int ), (int)9);
                    continue block11;
                }
                case 1806760735: {
                    break block11;
                }
            }
            break;
        }
        var3_1 = mo$MultiPanelHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eenr", eemc(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiPanelHitbox.eelp("eens", eelm(int ), (int)14)) break;
            v2 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eenx", eelm(int ), (int)15);
        }
        var2_2 = mo$MultiPanelHitbox.b;
        v3 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl29
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - mo$MultiPanelHitbox.eelp("eeny", eemc(int ), (int)11));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1157706462: {
                    v4 = mo$MultiPanelHitbox.eelp("eeoa", eemc(int ), (int)12);
                    continue block13;
                }
                case 1511030629: {
                    v4 = mo$MultiPanelHitbox.eelp("eeob", eemc(int ), (int)13);
                    continue block13;
                }
                case 1806760735: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = mo$MultiPanelHitbox.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (int)mo$MultiPanelHitbox.eelp("eeoc", eelm(int ), (int)16);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eeod", eemc(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mo$MultiPanelHitbox.eelp("eeog", eelm(int ), (int)17)) break;
            v5 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eeol", eelm(int ), (int)18);
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$MultiPanelHitbox.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    private static /* synthetic */ void eexd() {
        mo$MultiPanelHitbox.eeme[0] = 344403232192067235L;
        mo$MultiPanelHitbox.eeme[1] = -477218212235797880L;
        mo$MultiPanelHitbox.eeme[2] = 7563912355516431446L;
        mo$MultiPanelHitbox.eeme[3] = -5198075089233470984L;
        mo$MultiPanelHitbox.eeme[4] = 1841529766980406112L;
        mo$MultiPanelHitbox.eeme[5] = -6220891385966888546L;
        mo$MultiPanelHitbox.eeme[6] = -7706893707300150201L;
        mo$MultiPanelHitbox.eeme[7] = -3182439883409058789L;
        mo$MultiPanelHitbox.eeme[8] = -4226460507270911700L;
        mo$MultiPanelHitbox.eeme[9] = 5074195653919630026L;
        mo$MultiPanelHitbox.eeme[10] = -3095962898226253843L;
        mo$MultiPanelHitbox.eeme[11] = 8342750085079756477L;
        mo$MultiPanelHitbox.eeme[12] = -758368975441384850L;
        mo$MultiPanelHitbox.eeme[13] = -7027705010942252707L;
        mo$MultiPanelHitbox.eeme[14] = 5947800801719007127L;
        mo$MultiPanelHitbox.eeme[15] = 3565794041311375019L;
        mo$MultiPanelHitbox.eeme[16] = 2939819154019719060L;
        mo$MultiPanelHitbox.eeme[17] = -3678963452014651311L;
        mo$MultiPanelHitbox.eeme[18] = -1384926825578560771L;
        mo$MultiPanelHitbox.eeme[19] = 1394336071030596909L;
        mo$MultiPanelHitbox.eeme[20] = 4674571197696156323L;
        mo$MultiPanelHitbox.eeme[21] = 2490024994705531354L;
        mo$MultiPanelHitbox.eeme[22] = -703372369630244587L;
        mo$MultiPanelHitbox.eeme[23] = -1543620311293813879L;
        mo$MultiPanelHitbox.eeme[24] = -5376965361542489954L;
        mo$MultiPanelHitbox.eeme[25] = -4927676748311378800L;
        mo$MultiPanelHitbox.eeme[26] = -845086952249086607L;
        mo$MultiPanelHitbox.eeme[27] = -7819035413535404110L;
        mo$MultiPanelHitbox.eeme[28] = -1444492563459351948L;
        mo$MultiPanelHitbox.eeme[29] = 8755111348007516492L;
        mo$MultiPanelHitbox.eeme[30] = 5300162902263546982L;
        mo$MultiPanelHitbox.eeme[31] = -7252601792530771803L;
        mo$MultiPanelHitbox.eeme[32] = -6809054029705072221L;
        mo$MultiPanelHitbox.eeme[33] = 3533745506966254615L;
        mo$MultiPanelHitbox.eeme[34] = -3103102353330126176L;
        mo$MultiPanelHitbox.eeme[35] = -5784586222400410838L;
        mo$MultiPanelHitbox.eeme[36] = -1734015294810213309L;
        mo$MultiPanelHitbox.eeme[37] = 7920815571420966893L;
        mo$MultiPanelHitbox.eeme[38] = -705115461930256879L;
        mo$MultiPanelHitbox.eeme[39] = -24599012536617826L;
        mo$MultiPanelHitbox.eeme[40] = 2524196239005016442L;
        mo$MultiPanelHitbox.eeme[41] = -1911563807458372393L;
        mo$MultiPanelHitbox.eeme[42] = 4313471655900194347L;
        mo$MultiPanelHitbox.eeme[43] = 8998653590124780322L;
        mo$MultiPanelHitbox.eeme[44] = 2594274783870696042L;
        mo$MultiPanelHitbox.eeme[45] = -2389430347380620985L;
        mo$MultiPanelHitbox.eeme[46] = -6880543508253173479L;
        mo$MultiPanelHitbox.eeme[47] = 4249030217817393043L;
        mo$MultiPanelHitbox.eeme[48] = -1075912828315227220L;
        mo$MultiPanelHitbox.eeme[49] = -5264986796962684498L;
        mo$MultiPanelHitbox.eeme[50] = -9052322488146972119L;
        mo$MultiPanelHitbox.eeme[51] = -2509934040729043598L;
        mo$MultiPanelHitbox.eeme[52] = 1567423741070452408L;
        mo$MultiPanelHitbox.eeme[53] = 5433562016753520020L;
        mo$MultiPanelHitbox.eeme[54] = -9184457393925480115L;
        mo$MultiPanelHitbox.eeme[55] = -8921160418393593421L;
        mo$MultiPanelHitbox.eeme[56] = 6678113066954705070L;
    }

    private static /* synthetic */ void eexr() {
        mo$MultiPanelHitbox.eemg[0] = 417817550371306555L;
        mo$MultiPanelHitbox.eemg[1] = 3189366149158447505L;
        mo$MultiPanelHitbox.eemg[2] = 1631758708882218645L;
        mo$MultiPanelHitbox.eemg[3] = 2654490922672967820L;
        mo$MultiPanelHitbox.eemg[4] = 7302553456629129170L;
        mo$MultiPanelHitbox.eemg[5] = 4542099019770496900L;
        mo$MultiPanelHitbox.eemg[6] = 1949982621403650106L;
        mo$MultiPanelHitbox.eemg[7] = 5230371260582470510L;
        mo$MultiPanelHitbox.eemg[8] = 4608224929920942716L;
        mo$MultiPanelHitbox.eemg[9] = -6844606906317956145L;
        mo$MultiPanelHitbox.eemg[10] = 2749498718980688786L;
        mo$MultiPanelHitbox.eemg[11] = -533402080616810416L;
        mo$MultiPanelHitbox.eemg[12] = -2454584063551061184L;
        mo$MultiPanelHitbox.eemg[13] = -3233942643342129786L;
        mo$MultiPanelHitbox.eemg[14] = -2826788107654627958L;
        mo$MultiPanelHitbox.eemg[15] = 7852453298662228867L;
        mo$MultiPanelHitbox.eemg[16] = 695737121328549992L;
        mo$MultiPanelHitbox.eemg[17] = -4481088441117018833L;
        mo$MultiPanelHitbox.eemg[18] = -2068406170986861406L;
        mo$MultiPanelHitbox.eemg[19] = -4328447569918225069L;
        mo$MultiPanelHitbox.eemg[20] = 3981801310186562496L;
        mo$MultiPanelHitbox.eemg[21] = -7424020575240325132L;
        mo$MultiPanelHitbox.eemg[22] = -4444708179468219122L;
        mo$MultiPanelHitbox.eemg[23] = 2064147293721305957L;
        mo$MultiPanelHitbox.eemg[24] = 8602889122743153458L;
        mo$MultiPanelHitbox.eemg[25] = -8485245779218317949L;
        mo$MultiPanelHitbox.eemg[26] = -7023507381795946489L;
        mo$MultiPanelHitbox.eemg[27] = -8347993790240440645L;
        mo$MultiPanelHitbox.eemg[28] = -7085030654330199838L;
        mo$MultiPanelHitbox.eemg[29] = -7061393414162701694L;
        mo$MultiPanelHitbox.eemg[30] = -6427856797939202946L;
        mo$MultiPanelHitbox.eemg[31] = -340975017585284153L;
        mo$MultiPanelHitbox.eemg[32] = 8027254438258287149L;
        mo$MultiPanelHitbox.eemg[33] = -2713309289042086097L;
        mo$MultiPanelHitbox.eemg[34] = 758820028039815917L;
        mo$MultiPanelHitbox.eemg[35] = -1001082824713189117L;
        mo$MultiPanelHitbox.eemg[36] = -1507463343710191960L;
        mo$MultiPanelHitbox.eemg[37] = 5800986363501338929L;
        mo$MultiPanelHitbox.eemg[38] = 8472427352239624277L;
        mo$MultiPanelHitbox.eemg[39] = -2867199113948696783L;
        mo$MultiPanelHitbox.eemg[40] = 5153126772728029974L;
        mo$MultiPanelHitbox.eemg[41] = 6927065350937286552L;
        mo$MultiPanelHitbox.eemg[42] = 2449575466758816591L;
        mo$MultiPanelHitbox.eemg[43] = 6429245123901513818L;
        mo$MultiPanelHitbox.eemg[44] = -945093729753358155L;
        mo$MultiPanelHitbox.eemg[45] = 7182364965671393162L;
        mo$MultiPanelHitbox.eemg[46] = 1591126155291776948L;
        mo$MultiPanelHitbox.eemg[47] = 7134256493749657793L;
        mo$MultiPanelHitbox.eemg[48] = -5089631966664632637L;
        mo$MultiPanelHitbox.eemg[49] = 6088445854645316468L;
        mo$MultiPanelHitbox.eemg[50] = 5105577992402035286L;
        mo$MultiPanelHitbox.eemg[51] = -2190048083008744176L;
        mo$MultiPanelHitbox.eemg[52] = -8860215922752749810L;
        mo$MultiPanelHitbox.eemg[53] = 2876001477360318823L;
        mo$MultiPanelHitbox.eemg[54] = -3932784895791243455L;
        mo$MultiPanelHitbox.eemg[55] = -3535717835025795538L;
        mo$MultiPanelHitbox.eemg[56] = -2840984377565155401L;
    }

    static {
        eeln = new int[64];
        eelo = new int[64];
        mo$MultiPanelHitbox.eevw();
        mo$MultiPanelHitbox.eewq();
        eeme = new long[57];
        eemg = new long[57];
        mo$MultiPanelHitbox.eexd();
        mo$MultiPanelHitbox.eexr();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        v0 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(mo$MultiPanelHitbox.eelp("eesq", eemc(int ), (int)44) - mo$MultiPanelHitbox.eelp("eesp", eemc(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 767015575: {
                    continue block19;
                }
                case 1806760735: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = mo$MultiPanelHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eess", eemc(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$MultiPanelHitbox.eelp("eest", eelm(int ), (int)46)) break;
            v1 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eesu", eelm(int ), (int)47);
        }
        var2_2 /* !! */  = mo$MultiPanelHitbox.b;
        v2 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(mo$MultiPanelHitbox.eelp("eesx", eemc(int ), (int)47) - mo$MultiPanelHitbox.eelp("eesv", eemc(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1183970895: {
                    continue block21;
                }
                case 1806760735: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = mo$MultiPanelHitbox.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (float)mo$MultiPanelHitbox.eelp("eesy", eeqw(int ), (int)48);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = mo$MultiPanelHitbox.km;
                if (true) ** GOTO lbl41
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - mo$MultiPanelHitbox.eelp("eetc", eemc(int ), (int)48));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 341619095: {
                            v4 = mo$MultiPanelHitbox.eelp("eetk", eemc(int ), (int)49);
                            continue block23;
                        }
                        case 1806760735: {
                            break block23;
                        }
                        case 1938441784: {
                            v4 = mo$MultiPanelHitbox.eelp("eetn", eemc(int ), (int)50);
                            continue block23;
                        }
                    }
                    break;
                }
                return this.width;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eetp", eelm(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eetq", eelm(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eetr", eelm(int ), (int)51);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eett", eelm(int ), (int)52);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int eelm(int n2) {
        return eeln[n2] ^ eelo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$MultiPanelHitbox(float var1_1, float var2_2, float var3_3, float var4_4) {
        var6_5 /* !! */  = mo$MultiPanelHitbox.b;
        super();
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.x = var1_1;
                this.y = var2_2;
                this.width = var3_3;
                this.height = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eelq", eelm(int ), (int)0);
            }
lbl13:
            // 3 sources

            case 1: {
                while (true) {
                    var6_5 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eelr", eelm(int ), (int)1);
                }
            }
            case 2: {
                var6_5 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eelz", eelm(int ), (int)2);
                ** GOTO lbl13
            }
            case 3: 
        }
        while (true) {
            var6_5 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eema", eelm(int ), (int)3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiPanelHitbox.eelp("eemi", eemc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1209845605: {
                    v1 = mo$MultiPanelHitbox.eelp("eeml", eemc(int ), (int)1);
                    continue block11;
                }
                case 1806760735: {
                    break block11;
                }
                case 1950599799: {
                    v1 = mo$MultiPanelHitbox.eelp("eemn", eemc(int ), (int)2);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = mo$MultiPanelHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eemo", eemc(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiPanelHitbox.eelp("eemq", eelm(int ), (int)4)) break;
            v2 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eemr", eelm(int ), (int)5);
        }
        var2_2 /* !! */  = mo$MultiPanelHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eemt", eemc(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$MultiPanelHitbox.eelp("eemv", eelm(int ), (int)6)) break;
            v3 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eemy", eelm(int ), (int)7);
        }
        var1_3 = mo$MultiPanelHitbox.a;
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
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eena", eemc(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$MultiPanelHitbox.eelp("eenc", eelm(int ), (int)8)) break;
                    v4 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eend", eelm(int ), (int)9);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$MultiPanelHitbox.class, "x;y;width;height", "x", "y", "width", "height"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eenf", eelm(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eenh", eelm(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eeni", eelm(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eenk", eelm(int ), (int)13);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(mo$MultiPanelHitbox.eelp("eeoy", eemc(int ), (int)16) - mo$MultiPanelHitbox.eelp("eeow", eemc(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 534211062: {
                    continue block21;
                }
                case 1806760735: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = mo$MultiPanelHitbox.c;
        v1 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - mo$MultiPanelHitbox.eelp("eeoz", eemc(int ), (int)17));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -643129667: {
                    v2 = mo$MultiPanelHitbox.eelp("eepa", eemc(int ), (int)18);
                    continue block22;
                }
                case 1705462345: {
                    v2 = mo$MultiPanelHitbox.eelp("eepb", eemc(int ), (int)19);
                    continue block22;
                }
                case 1806760735: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = mo$MultiPanelHitbox.b;
        v3 /* !! */  = mo$MultiPanelHitbox.km;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - mo$MultiPanelHitbox.eelp("eepd", eemc(int ), (int)20));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2016644764: {
                    v4 = mo$MultiPanelHitbox.eelp("eepf", eemc(int ), (int)21);
                    continue block23;
                }
                case 553774446: {
                    v4 = mo$MultiPanelHitbox.eelp("eepl", eemc(int ), (int)22);
                    continue block23;
                }
                case 673535917: {
                    v4 = mo$MultiPanelHitbox.eelp("eepm", eemc(int ), (int)23);
                    continue block23;
                }
                case 1806760735: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = mo$MultiPanelHitbox.a;
        if (var4_2) {
            throw null;
lbl44:
            // 2 sources

            return (boolean)mo$MultiPanelHitbox.eelp("eepn", eelm(int ), (int)23);
        }
        if (var2_4) ** GOTO lbl44
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eepp", eemc(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$MultiPanelHitbox.eelp("eeps", eelm(int ), (int)24)) break;
                    v5 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eepv", eelm(int ), (int)25);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$MultiPanelHitbox.class, "x;y;width;height", "x", "y", "width", "height"}, this, var1_1);
            }
lbl58:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eepw", eelm(int ), (int)26);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eepy", eelm(int ), (int)27);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eeqa", eelm(int ), (int)28);
                    if (!var4_2) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eeqb", eelm(int ), (int)29);
        ** while (!var4_2)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float eeqw(int n2) {
        return Float.intBitsToFloat(eeln[n2] ^ eelo[n2]);
    }

    private static /* synthetic */ long eemc(int n2) {
        return eeme[n2] ^ eemg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eeug", eemc(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$MultiPanelHitbox.eelp("eeuh", eelm(int ), (int)53)) break;
            v0 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eeui", eelm(int ), (int)54);
        }
        var3_1 = mo$MultiPanelHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eeuj", eemc(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$MultiPanelHitbox.eelp("eeuk", eelm(int ), (int)55)) break;
            v1 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eeul", eelm(int ), (int)56);
        }
        var2_2 /* !! */  = mo$MultiPanelHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mo$MultiPanelHitbox.km - mo$MultiPanelHitbox.eelp("eeum", eemc(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiPanelHitbox.eelp("eeuu", eelm(int ), (int)57)) break;
            v2 /* !! */  = (long)mo$MultiPanelHitbox.eelp("eeuv", eelm(int ), (int)58);
        }
        var1_3 = mo$MultiPanelHitbox.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (float)mo$MultiPanelHitbox.eelp("eeuw", eeqw(int ), (int)59);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = mo$MultiPanelHitbox.km;
                if (true) ** GOTO lbl35
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - mo$MultiPanelHitbox.eelp("eeva", eemc(int ), (int)54));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -98647690: {
                            v4 = mo$MultiPanelHitbox.eelp("eevc", eemc(int ), (int)55);
                            continue block15;
                        }
                        case 1275344880: {
                            v4 = mo$MultiPanelHitbox.eelp("eevd", eemc(int ), (int)56);
                            continue block15;
                        }
                        case 1806760735: {
                            break block15;
                        }
                    }
                    break;
                }
                return this.height;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eevm", eelm(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eevo", eelm(int ), (int)61);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eevr", eelm(int ), (int)62);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$MultiPanelHitbox.eelp("eevt", eelm(int ), (int)63);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void eevw() {
        mo$MultiPanelHitbox.eeln[0] = -2129255553;
        mo$MultiPanelHitbox.eeln[1] = 981485946;
        mo$MultiPanelHitbox.eeln[2] = -932435174;
        mo$MultiPanelHitbox.eeln[3] = -563902723;
        mo$MultiPanelHitbox.eeln[4] = -1202202679;
        mo$MultiPanelHitbox.eeln[5] = 52440711;
        mo$MultiPanelHitbox.eeln[6] = 1127706901;
        mo$MultiPanelHitbox.eeln[7] = 1183414953;
        mo$MultiPanelHitbox.eeln[8] = 1346015482;
        mo$MultiPanelHitbox.eeln[9] = -212917982;
        mo$MultiPanelHitbox.eeln[10] = 1395449633;
        mo$MultiPanelHitbox.eeln[11] = 2143633119;
        mo$MultiPanelHitbox.eeln[12] = 1058044216;
        mo$MultiPanelHitbox.eeln[13] = 907738037;
        mo$MultiPanelHitbox.eeln[14] = 1369441589;
        mo$MultiPanelHitbox.eeln[15] = -1769664522;
        mo$MultiPanelHitbox.eeln[16] = 1828036351;
        mo$MultiPanelHitbox.eeln[17] = 1307420236;
        mo$MultiPanelHitbox.eeln[18] = -364691797;
        mo$MultiPanelHitbox.eeln[19] = -680302796;
        mo$MultiPanelHitbox.eeln[20] = 1042602490;
        mo$MultiPanelHitbox.eeln[21] = -1423158368;
        mo$MultiPanelHitbox.eeln[22] = -1976876354;
        mo$MultiPanelHitbox.eeln[23] = -1593707994;
        mo$MultiPanelHitbox.eeln[24] = -2077426891;
        mo$MultiPanelHitbox.eeln[25] = 1978810772;
        mo$MultiPanelHitbox.eeln[26] = 417584667;
        mo$MultiPanelHitbox.eeln[27] = 760600987;
        mo$MultiPanelHitbox.eeln[28] = -98749115;
        mo$MultiPanelHitbox.eeln[29] = -1903384999;
        mo$MultiPanelHitbox.eeln[30] = -594978770;
        mo$MultiPanelHitbox.eeln[31] = -1864963815;
        mo$MultiPanelHitbox.eeln[32] = -2112808688;
        mo$MultiPanelHitbox.eeln[33] = -1991679007;
        mo$MultiPanelHitbox.eeln[34] = 357931910;
        mo$MultiPanelHitbox.eeln[35] = 46075149;
        mo$MultiPanelHitbox.eeln[36] = -1347698711;
        mo$MultiPanelHitbox.eeln[37] = 1676471160;
        mo$MultiPanelHitbox.eeln[38] = 703795467;
        mo$MultiPanelHitbox.eeln[39] = -1344380038;
        mo$MultiPanelHitbox.eeln[40] = -409364131;
        mo$MultiPanelHitbox.eeln[41] = -1746854193;
        mo$MultiPanelHitbox.eeln[42] = 1904735192;
        mo$MultiPanelHitbox.eeln[43] = -1225643945;
        mo$MultiPanelHitbox.eeln[44] = -1320487166;
        mo$MultiPanelHitbox.eeln[45] = -11308845;
        mo$MultiPanelHitbox.eeln[46] = 890847026;
        mo$MultiPanelHitbox.eeln[47] = 1852830082;
        mo$MultiPanelHitbox.eeln[48] = -1901221521;
        mo$MultiPanelHitbox.eeln[49] = -539993680;
        mo$MultiPanelHitbox.eeln[50] = 696586795;
        mo$MultiPanelHitbox.eeln[51] = 557891160;
        mo$MultiPanelHitbox.eeln[52] = 1608157956;
        mo$MultiPanelHitbox.eeln[53] = 53585566;
        mo$MultiPanelHitbox.eeln[54] = 1065626443;
        mo$MultiPanelHitbox.eeln[55] = -1470546801;
        mo$MultiPanelHitbox.eeln[56] = 5329600;
        mo$MultiPanelHitbox.eeln[57] = -522293468;
        mo$MultiPanelHitbox.eeln[58] = -709648499;
        mo$MultiPanelHitbox.eeln[59] = -873432938;
        mo$MultiPanelHitbox.eeln[60] = -664059;
        mo$MultiPanelHitbox.eeln[61] = -1592634385;
        mo$MultiPanelHitbox.eeln[62] = 2008806056;
        mo$MultiPanelHitbox.eeln[63] = -385067294;
    }

    public static /* synthetic */ CallSite eelp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

