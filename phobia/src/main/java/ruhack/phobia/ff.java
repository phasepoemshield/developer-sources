/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ff$1;
import ruhack.phobia.jx;
import ruhack.phobia.kb;

public final class ff
extends ds {
    public final kb removeShadows;
    private static long[] ikkn;
    public final kb removeWeather;
    private static int[] ikju;
    public static final boolean c;
    public static final int b;
    private static long[] ikkm;
    public final kb removeParticles;
    private static int[] ikjv;
    public final kb removeBlur;
    public final kb extraOptimization;
    public static final boolean a;
    public static final long pw = 3478635240278984596L;
    private static volatile ff instance;

    private static /* synthetic */ void ikur() {
        ff.ikkn[0] = -4605911905675816313L;
        ff.ikkn[1] = -860631057795416294L;
        ff.ikkn[2] = 6486467205526352942L;
        ff.ikkn[3] = -447615039674095017L;
        ff.ikkn[4] = 2251827376092104423L;
        ff.ikkn[5] = 8287687047484195403L;
        ff.ikkn[6] = -5378365427018582046L;
        ff.ikkn[7] = -7902537338309692820L;
        ff.ikkn[8] = -7093756444581015801L;
        ff.ikkn[9] = 9059876781332791741L;
        ff.ikkn[10] = 4815194008045695613L;
        ff.ikkn[11] = -4240184608274987259L;
        ff.ikkn[12] = -3497093747116085529L;
        ff.ikkn[13] = 3233259054404596813L;
        ff.ikkn[14] = 3951904381863295605L;
        ff.ikkn[15] = 1040403774278073088L;
        ff.ikkn[16] = 2032186908576991921L;
        ff.ikkn[17] = 7128846458539505319L;
        ff.ikkn[18] = 6954225603232908915L;
        ff.ikkn[19] = 4809283894510386906L;
        ff.ikkn[20] = 6473817804790700596L;
        ff.ikkn[21] = 6215456159362746069L;
        ff.ikkn[22] = -2246303632676827891L;
        ff.ikkn[23] = -9112335522948818802L;
        ff.ikkn[24] = -6084083003969343611L;
        ff.ikkn[25] = 3348776087803032712L;
        ff.ikkn[26] = -3876360819170588083L;
        ff.ikkn[27] = -1597755621287290443L;
        ff.ikkn[28] = -7144157057595837210L;
        ff.ikkn[29] = -9035169226294995672L;
        ff.ikkn[30] = -1519467854039690954L;
        ff.ikkn[31] = 7308739514493406855L;
        ff.ikkn[32] = 2040869955325194265L;
        ff.ikkn[33] = 1635728153553858629L;
        ff.ikkn[34] = -7373498428750780423L;
        ff.ikkn[35] = -2417840498646839291L;
        ff.ikkn[36] = -1786000765143595868L;
        ff.ikkn[37] = 2158154618177094461L;
        ff.ikkn[38] = -6720914876761494483L;
        ff.ikkn[39] = 8522788194040111929L;
        ff.ikkn[40] = 4699385712243149201L;
        ff.ikkn[41] = -4782096631463191828L;
        ff.ikkn[42] = -6953634572117458388L;
        ff.ikkn[43] = -4578852693756370322L;
        ff.ikkn[44] = -7650503014927895521L;
        ff.ikkn[45] = -8724052143439998745L;
        ff.ikkn[46] = -1500892998529549330L;
        ff.ikkn[47] = 1820179790410731085L;
        ff.ikkn[48] = -7588730341914416991L;
        ff.ikkn[49] = -5211001501308860899L;
        ff.ikkn[50] = -2577785683027944813L;
        ff.ikkn[51] = 880055662104613959L;
        ff.ikkn[52] = -8226041448409657419L;
        ff.ikkn[53] = 6330779612836987560L;
        ff.ikkn[54] = -52502372291819840L;
        ff.ikkn[55] = 126178086351319531L;
        ff.ikkn[56] = -3137642438724128981L;
        ff.ikkn[57] = 175721059079794575L;
        ff.ikkn[58] = 896344688760428026L;
        ff.ikkn[59] = 928939625754932332L;
        ff.ikkn[60] = 8740185888800887778L;
        ff.ikkn[61] = 5208336911538766364L;
        ff.ikkn[62] = 881063207546627369L;
        ff.ikkn[63] = 2511962432223916537L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ff() {
        var2_1 /* !! */  = ff.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Optimization", "\u041e\u0442\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0442\u044f\u0436\u0451\u043b\u044b\u0435 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u044b", du.MISC);
                this.removeBlur = new kb("\u0423\u0434\u0430\u043b\u044f\u0442\u044c \u0431\u043b\u044e\u0440", "\u041e\u0442\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u044b\u0442\u0438\u0435 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u043e\u0432 \u043a\u043b\u0438\u0435\u043d\u0442\u0430 \u0438 \u044d\u043a\u0440\u0430\u043d\u043e\u0432 Minecraft").setValue((boolean)ff.ikjw("ikjx", ikjt(int ), (int)0));
                this.removeParticles = new kb("\u0423\u0434\u0430\u043b\u044f\u0442\u044c \u0447\u0430\u0441\u0442\u0438\u0446\u044b", "\u041d\u0435 \u0441\u043e\u0437\u0434\u0430\u0451\u0442 \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u044b\u0435 \u0447\u0430\u0441\u0442\u0438\u0446\u044b Minecraft").setValue((boolean)ff.ikjw("ikjy", ikjt(int ), (int)1));
                this.removeWeather = new kb("\u0423\u0434\u0430\u043b\u044f\u0442\u044c \u043f\u043e\u0433\u043e\u0434\u0443", "\u041d\u0435 \u043e\u0442\u0440\u0438\u0441\u043e\u0432\u044b\u0432\u0430\u0435\u0442 \u0434\u043e\u0436\u0434\u044c \u0438 \u0441\u043d\u0435\u0433").setValue((boolean)ff.ikjw("ikjz", ikjt(int ), (int)2));
                this.removeShadows = new kb("\u0423\u0434\u0430\u043b\u044f\u0442\u044c \u0442\u0435\u043d\u0438", "\u041d\u0435 \u043e\u0442\u0440\u0438\u0441\u043e\u0432\u044b\u0432\u0430\u0435\u0442 \u0442\u0435\u043d\u0438 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439").setValue((boolean)ff.ikjw("ikka", ikjt(int ), (int)3));
                this.extraOptimization = new ff$1(this, "\u0414\u043e\u043f \u041e\u043f\u0442\u0438\u043c\u0438\u0437\u0430\u0446\u0438\u044f", "\u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u0442 \u043e\u0431\u0440\u0430\u0442\u0438\u043c\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 Minecraft \u043d\u0430 \u0432\u044b\u0441\u043e\u043a\u0438\u0439 FPS");
                ff.instance = this;
                this.settings(new jx[]{this.removeBlur, this.removeParticles, this.removeWeather, this.removeShadows, this.extraOptimization});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ff.ikjw("ikkb", ikjt(int ), (int)4);
                ** GOTO lbl24
            }
            case 1: {
                var2_1 /* !! */  = (int)ff.ikjw("ikkc", ikjt(int ), (int)5);
                ** GOTO lbl38
            }
lbl20:
            // 3 sources

            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)ff.ikjw("ikkd", ikjt(int ), (int)6);
                }
            }
lbl24:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)ff.ikjw("ikke", ikjt(int ), (int)7);
                ** GOTO lbl31
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ff.ikjw("ikkf", ikjt(int ), (int)8);
                    ** GOTO lbl40
                    break;
                }
            }
lbl31:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)ff.ikjw("ikkg", ikjt(int ), (int)9);
                ** GOTO lbl20
            }
            case 6: {
                while (true) {
                    var2_1 /* !! */  = (int)ff.ikjw("ikkh", ikjt(int ), (int)10);
                }
            }
lbl38:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)ff.ikjw("ikki", ikjt(int ), (int)11);
            }
lbl40:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)ff.ikjw("ikkj", ikjt(int ), (int)12);
                ** GOTO lbl20
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)ff.ikjw("ikkk", ikjt(int ), (int)13);
        ** while (true)
    }

    private static /* synthetic */ void ikui() {
        ff.ikjv[0] = -1672987465;
        ff.ikjv[1] = 1085432126;
        ff.ikjv[2] = -523849477;
        ff.ikjv[3] = -299681844;
        ff.ikjv[4] = 76891497;
        ff.ikjv[5] = 1505098689;
        ff.ikjv[6] = -1988122418;
        ff.ikjv[7] = 258297368;
        ff.ikjv[8] = 26726365;
        ff.ikjv[9] = -1397593949;
        ff.ikjv[10] = -1289177370;
        ff.ikjv[11] = 1196505470;
        ff.ikjv[12] = -1954208042;
        ff.ikjv[13] = -334634793;
        ff.ikjv[14] = 1183527673;
        ff.ikjv[15] = 425926800;
        ff.ikjv[16] = -1659462613;
        ff.ikjv[17] = 1468260965;
        ff.ikjv[18] = 642316309;
        ff.ikjv[19] = -1797185369;
        ff.ikjv[20] = 1460168282;
        ff.ikjv[21] = -1608156448;
        ff.ikjv[22] = 1866279418;
        ff.ikjv[23] = 348935112;
        ff.ikjv[24] = 308441704;
        ff.ikjv[25] = 1001968567;
        ff.ikjv[26] = 855735102;
        ff.ikjv[27] = 268661467;
        ff.ikjv[28] = 944152289;
        ff.ikjv[29] = -1433071424;
        ff.ikjv[30] = 1343645921;
        ff.ikjv[31] = 812837501;
        ff.ikjv[32] = 233614446;
        ff.ikjv[33] = -424098539;
        ff.ikjv[34] = 414889457;
        ff.ikjv[35] = -1240436220;
        ff.ikjv[36] = 952795715;
        ff.ikjv[37] = -1901518212;
        ff.ikjv[38] = -1727406919;
        ff.ikjv[39] = 1322838375;
        ff.ikjv[40] = -1745958606;
        ff.ikjv[41] = -617933850;
        ff.ikjv[42] = 156707070;
        ff.ikjv[43] = 421673300;
        ff.ikjv[44] = -905288500;
        ff.ikjv[45] = 558415159;
        ff.ikjv[46] = -1986940356;
        ff.ikjv[47] = 1360366991;
        ff.ikjv[48] = -2109405885;
        ff.ikjv[49] = -335403623;
        ff.ikjv[50] = -1571158639;
        ff.ikjv[51] = -743621283;
        ff.ikjv[52] = 180213883;
        ff.ikjv[53] = 1192019841;
        ff.ikjv[54] = -336240292;
        ff.ikjv[55] = -1729118101;
        ff.ikjv[56] = -710235675;
        ff.ikjv[57] = 1135458222;
        ff.ikjv[58] = 1851078125;
        ff.ikjv[59] = -441499985;
        ff.ikjv[60] = -530534578;
        ff.ikjv[61] = 1811569181;
        ff.ikjv[62] = 1523317871;
        ff.ikjv[63] = 341298458;
        ff.ikjv[64] = -79643707;
        ff.ikjv[65] = 2122165836;
        ff.ikjv[66] = -1208670566;
        ff.ikjv[67] = 61741333;
        ff.ikjv[68] = 957714489;
        ff.ikjv[69] = 425776093;
        ff.ikjv[70] = 1547008905;
        ff.ikjv[71] = 1502606697;
        ff.ikjv[72] = 506744169;
        ff.ikjv[73] = 747126903;
        ff.ikjv[74] = 658678790;
        ff.ikjv[75] = 574350095;
        ff.ikjv[76] = -9333184;
        ff.ikjv[77] = -1875605544;
        ff.ikjv[78] = 314573276;
        ff.ikjv[79] = -2000049932;
        ff.ikjv[80] = -638075302;
        ff.ikjv[81] = 706811367;
        ff.ikjv[82] = -533736442;
        ff.ikjv[83] = -277015166;
        ff.ikjv[84] = 889704976;
        ff.ikjv[85] = 1380973830;
        ff.ikjv[86] = -1243228237;
        ff.ikjv[87] = 1858850668;
        ff.ikjv[88] = -1665422331;
        ff.ikjv[89] = 1509545102;
        ff.ikjv[90] = -1123450359;
        ff.ikjv[91] = -1162066365;
        ff.ikjv[92] = 1451325193;
        ff.ikjv[93] = 932001426;
        ff.ikjv[94] = -1142968314;
        ff.ikjv[95] = -1463511328;
        ff.ikjv[96] = -1375379340;
        ff.ikjv[97] = -464157454;
        ff.ikjv[98] = -1916822398;
        ff.ikjv[99] = -918685798;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean shadowsDisabled() {
        block49: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ff.pw - ff.ikjw("iksf", ikkl(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ff.ikjw("iksg", ikjt(int ), (int)85)) break;
                v0 /* !! */  = (long)ff.ikjw("iksi", ikjt(int ), (int)86);
            }
            var3 = ff.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ff.pw - ff.ikjw("iksj", ikkl(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ff.ikjw("iksk", ikjt(int ), (int)87)) break;
                v1 /* !! */  = (long)ff.ikjw("iksm", ikjt(int ), (int)88);
            }
            var2_1 /* !! */  = ff.b;
            v2 /* !! */  = ff.pw;
            if (true) ** GOTO lbl17
            block33: while (true) {
                v2 /* !! */  = (long)(ff.ikjw("iksp", ikkl(int ), (int)55) - ff.ikjw("ikso", ikkl(int ), (int)54));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -378535837: {
                        continue block33;
                    }
                    case 133957524: {
                        break block33;
                    }
                }
                break;
            }
            var1_2 = ff.a;
            if (var3) {
                throw null;
lbl25:
                // 6 sources

                return (boolean)ff.ikjw("iksr", ikjt(int ), (int)89);
            }
            if (var1_2 || var1_2) ** GOTO lbl25
            v3 /* !! */  = ff.pw;
            if (true) ** GOTO lbl32
            block35: while (true) {
                v3 /* !! */  = (long)(ff.ikjw("iksu", ikkl(int ), (int)57) - ff.ikjw("ikss", ikkl(int ), (int)56));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 111131702: {
                        continue block35;
                    }
                    case 133957524: {
                        break block35;
                    }
                }
                break;
            }
            var0_3 = ff.instance;
            if (var1_2 || var1_2) ** GOTO lbl25
            if (var0_3 == null) break block49;
            if (var1_2) ** GOTO lbl25
            v4 /* !! */  = ff.pw;
            if (true) ** GOTO lbl45
            block36: while (true) {
                v4 /* !! */  = (long)(v5 - ff.ikjw("iksx", ikkl(int ), (int)58));
lbl45:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1871888587: {
                        v5 = ff.ikjw("iksy", ikkl(int ), (int)59);
                        continue block36;
                    }
                    case 133957524: {
                        break block36;
                    }
                    case 1225842113: {
                        v5 = ff.ikjw("iksz", ikkl(int ), (int)60);
                        continue block36;
                    }
                }
                break;
            }
            if (!var0_3.isState()) break block49;
            if (var1_2) ** GOTO lbl25
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = ff.pw - ff.ikjw("iktb", ikkl(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ff.ikjw("iktc", ikjt(int ), (int)90)) break;
                v6 /* !! */  = (long)ff.ikjw("ikte", ikjt(int ), (int)91);
            }
            v7 = var0_3.removeShadows;
            v8 /* !! */  = ff.pw;
            if (true) ** GOTO lbl66
            block38: while (true) {
                v8 /* !! */  = (long)(ff.ikjw("ikth", ikkl(int ), (int)63) - ff.ikjw("iktg", ikkl(int ), (int)62));
lbl66:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1523073128: {
                        continue block38;
                    }
                    case 133957524: {
                        break block38;
                    }
                }
                break;
            }
            if (!v7.isValue()) break block49;
            if (var1_2) ** GOTO lbl25
            v9 = ff.ikjw("iktj", ikjt(int ), (int)92);
            if (var3) {
                throw null;
            }
            ** GOTO lbl84
        }
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v9 = ff.ikjw("iktl", ikjt(int ), (int)93);
lbl84:
                // 2 sources

                return (boolean)v9;
            }
lbl85:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)ff.ikjw("iktn", ikjt(int ), (int)94);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl90:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ff.ikjw("ikto", ikjt(int ), (int)95);
                if (!var3) break;
                throw null;
            }
            case 2: {
                var2_1 /* !! */  = (int)ff.ikjw("iktp", ikjt(int ), (int)96);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 3: {
                var2_1 /* !! */  = (int)ff.ikjw("iktq", ikjt(int ), (int)97);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 4: {
                var2_1 /* !! */  = (int)ff.ikjw("ikts", ikjt(int ), (int)98);
                if (!var3) ** GOTO lbl85
                throw null;
            }
lbl108:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)ff.ikjw("iktt", ikjt(int ), (int)99);
                if (var3) {
                    throw null;
                }
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ff.ikjw("iktv", ikjt(int ), (int)100);
                    if (!var3) break block17;
                    throw null;
                }
            }
lbl117:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)ff.ikjw("iktw", ikjt(int ), (int)101);
                if (!var3) break;
                throw null;
            }
lbl121:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)ff.ikjw("iktx", ikjt(int ), (int)102);
                if (!var3) ** GOTO lbl90
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)ff.ikjw("iktz", ikjt(int ), (int)103);
                if (!var3) ** GOTO lbl85
                throw null;
            }
            case 10: {
                var2_1 /* !! */  = (int)ff.ikjw("ikua", ikjt(int ), (int)104);
                if (!var3) ** GOTO lbl121
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)ff.ikjw("ikuc", ikjt(int ), (int)105);
        ** while (!var3)
lbl136:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static ff getInstance() {
        boolean bl2;
        Object object = pw;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ff.ikjw("ikko", ikkl(int ), (int)0);
            }
            switch ((int)object) {
                case -1964704572: {
                    callSite = ff.ikjw("ikkp", ikkl(int ), (int)1);
                    continue block11;
                }
                case -1595336324: {
                    callSite = ff.ikjw("ikkq", ikkl(int ), (int)2);
                    continue block11;
                }
                case 133957524: {
                    break block11;
                }
                case 1442737860: {
                    callSite = ff.ikjw("ikkr", ikkl(int ), (int)3);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = pw;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - ff.ikjw("ikks", ikkl(int ), (int)4);
            }
            switch ((int)object2) {
                case -1427197915: {
                    callSite = ff.ikjw("ikkt", ikkl(int ), (int)5);
                    continue block12;
                }
                case 133957524: {
                    break block12;
                }
                case 724256302: {
                    callSite = ff.ikjw("ikku", ikkl(int ), (int)6);
                    continue block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = pw - ff.ikjw("ikkv", ikkl(int ), (int)7)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ff.ikjw("ikkw", ikjt(int ), (int)14)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ff.ikjw("ikkx", ikjt(int ), (int)15);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = pw - ff.ikjw("ikky", ikkl(int ), (int)8)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ff.ikjw("ikkz", ikjt(int ), (int)16)) {
                return instance;
            }
            object4 = ff.ikjw("ikla", ikjt(int ), (int)17);
        }
    }

    private static /* synthetic */ void ikum() {
        ff.ikjv[100] = 1774036254;
        ff.ikjv[101] = 883485665;
        ff.ikjv[102] = -211408972;
        ff.ikjv[103] = -1067165297;
        ff.ikjv[104] = 1320655959;
        ff.ikjv[105] = 1280064921;
    }

    private static /* synthetic */ void ikue() {
        ff.ikju[0] = -1672987466;
        ff.ikju[1] = 1085432127;
        ff.ikju[2] = -523849478;
        ff.ikju[3] = -299681843;
        ff.ikju[4] = 76891501;
        ff.ikju[5] = 1505098696;
        ff.ikju[6] = -1988122425;
        ff.ikju[7] = 258297373;
        ff.ikju[8] = 26726360;
        ff.ikju[9] = -1397593948;
        ff.ikju[10] = -1289177361;
        ff.ikju[11] = 1196505464;
        ff.ikju[12] = -1954208042;
        ff.ikju[13] = -334634795;
        ff.ikju[14] = -1183527674;
        ff.ikju[15] = 1729569089;
        ff.ikju[16] = -1659462614;
        ff.ikju[17] = 532361884;
        ff.ikju[18] = 642316308;
        ff.ikju[19] = -1797185369;
        ff.ikju[20] = 1460168283;
        ff.ikju[21] = -1608156446;
        ff.ikju[22] = -1866279419;
        ff.ikju[23] = -1644300397;
        ff.ikju[24] = 308441705;
        ff.ikju[25] = -1318122114;
        ff.ikju[26] = -855735103;
        ff.ikju[27] = 819837713;
        ff.ikju[28] = 944152288;
        ff.ikju[29] = -1433071423;
        ff.ikju[30] = 1343645921;
        ff.ikju[31] = 812837499;
        ff.ikju[32] = 233614439;
        ff.ikju[33] = -424098544;
        ff.ikju[34] = 414889457;
        ff.ikju[35] = -1240436221;
        ff.ikju[36] = 952795715;
        ff.ikju[37] = -1901518220;
        ff.ikju[38] = -1727406928;
        ff.ikju[39] = 1322838374;
        ff.ikju[40] = -1745958605;
        ff.ikju[41] = -617933841;
        ff.ikju[42] = 156707062;
        ff.ikju[43] = 421673301;
        ff.ikju[44] = -1929492353;
        ff.ikju[45] = 558415158;
        ff.ikju[46] = -1274206213;
        ff.ikju[47] = 1360366991;
        ff.ikju[48] = -2109405886;
        ff.ikju[49] = -1028624562;
        ff.ikju[50] = -1571158640;
        ff.ikju[51] = -743621283;
        ff.ikju[52] = 180213873;
        ff.ikju[53] = 1192019846;
        ff.ikju[54] = -336240299;
        ff.ikju[55] = -1729118102;
        ff.ikju[56] = -710235668;
        ff.ikju[57] = 1135458221;
        ff.ikju[58] = 1851078119;
        ff.ikju[59] = -441499988;
        ff.ikju[60] = -530534580;
        ff.ikju[61] = 1811569178;
        ff.ikju[62] = 1523317862;
        ff.ikju[63] = 341298459;
        ff.ikju[64] = 79643706;
        ff.ikju[65] = 1610383097;
        ff.ikju[66] = 1208670565;
        ff.ikju[67] = -1019661794;
        ff.ikju[68] = 957714489;
        ff.ikju[69] = 425776092;
        ff.ikju[70] = -1911580762;
        ff.ikju[71] = 1502606696;
        ff.ikju[72] = 506744169;
        ff.ikju[73] = 747126909;
        ff.ikju[74] = 658678787;
        ff.ikju[75] = 574350094;
        ff.ikju[76] = -9333184;
        ff.ikju[77] = -1875605542;
        ff.ikju[78] = 314573274;
        ff.ikju[79] = -2000049933;
        ff.ikju[80] = -638075298;
        ff.ikju[81] = 706811366;
        ff.ikju[82] = -533736441;
        ff.ikju[83] = -277015159;
        ff.ikju[84] = 889704979;
        ff.ikju[85] = 1380973831;
        ff.ikju[86] = 1744090777;
        ff.ikju[87] = -1858850669;
        ff.ikju[88] = -813111732;
        ff.ikju[89] = 1509545103;
        ff.ikju[90] = 1123450358;
        ff.ikju[91] = 696590110;
        ff.ikju[92] = 1451325192;
        ff.ikju[93] = 932001426;
        ff.ikju[94] = -1142968318;
        ff.ikju[95] = -1463511322;
        ff.ikju[96] = -1375379340;
        ff.ikju[97] = -464157452;
        ff.ikju[98] = -1916822389;
        ff.ikju[99] = -918685797;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean particlesDisabled() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ff.pw - ff.ikjw("ikmr", ikkl(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ff.ikjw("ikmt", ikjt(int ), (int)43)) break;
            v0 /* !! */  = (long)ff.ikjw("ikmu", ikjt(int ), (int)44);
        }
        var3 = ff.c;
        v1 /* !! */  = ff.pw;
        if (true) ** GOTO lbl12
        block34: while (true) {
            v1 /* !! */  = (long)(ff.ikjw("ikmy", ikkl(int ), (int)24) - ff.ikjw("ikmw", ikkl(int ), (int)23));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -135950741: {
                    continue block34;
                }
                case 133957524: {
                    break block34;
                }
            }
            break;
        }
        var2_1 /* !! */  = ff.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ff.pw - ff.ikjw("ikna", ikkl(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ff.ikjw("iknb", ikjt(int ), (int)45)) break;
            v2 /* !! */  = (long)ff.ikjw("iknd", ikjt(int ), (int)46);
        }
        var1_2 = ff.a;
        if (var3) {
            throw null;
lbl27:
            // 7 sources

            return (boolean)ff.ikjw("iknf", ikjt(int ), (int)47);
        }
        if (var1_2 || var1_2) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ff.pw - ff.ikjw("iknh", ikkl(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ff.ikjw("iknl", ikjt(int ), (int)48)) break;
            v3 /* !! */  = (long)ff.ikjw("iknn", ikjt(int ), (int)49);
        }
        var0_3 = ff.instance;
        if (var1_2) ** GOTO lbl27
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl27
                if (var0_3 == null) ** GOTO lbl91
                if (var1_2) ** GOTO lbl27
                v4 /* !! */  = ff.pw;
                if (true) ** GOTO lbl48
                block38: while (true) {
                    v4 /* !! */  = (long)(v5 - ff.ikjw("iknp", ikkl(int ), (int)27));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 87194382: {
                            v5 = ff.ikjw("iknq", ikkl(int ), (int)28);
                            continue block38;
                        }
                        case 133957524: {
                            break block38;
                        }
                        case 261700119: {
                            v5 = ff.ikjw("ikns", ikkl(int ), (int)29);
                            continue block38;
                        }
                    }
                    break;
                }
                if (!var0_3.isState()) ** GOTO lbl91
                if (var1_2) ** GOTO lbl27
                v6 /* !! */  = ff.pw;
                if (true) ** GOTO lbl63
                block39: while (true) {
                    v6 /* !! */  = (long)(ff.ikjw("iknw", ikkl(int ), (int)31) - ff.ikjw("iknu", ikkl(int ), (int)30));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 133957524: {
                            break block39;
                        }
                        case 357222333: {
                            continue block39;
                        }
                    }
                    break;
                }
                v7 = var0_3.removeParticles;
                v8 /* !! */  = ff.pw;
                if (true) ** GOTO lbl73
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - ff.ikjw("ikny", ikkl(int ), (int)32));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1303018725: {
                            v9 = ff.ikjw("ikoa", ikkl(int ), (int)33);
                            continue block40;
                        }
                        case 133957524: {
                            break block40;
                        }
                        case 213494405: {
                            v9 = ff.ikjw("ikod", ikkl(int ), (int)34);
                            continue block40;
                        }
                        case 1262433284: {
                            v9 = ff.ikjw("ikoe", ikkl(int ), (int)35);
                            continue block40;
                        }
                    }
                    break;
                }
                if (!v7.isValue()) ** GOTO lbl91
                if (var1_2) ** GOTO lbl27
                v10 = ff.ikjw("ikoh", ikjt(int ), (int)50);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl94
lbl91:
                // 3 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v10 = ff.ikjw("ikoj", ikjt(int ), (int)51);
lbl94:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var2_1 /* !! */  = (int)ff.ikjw("ikok", ikjt(int ), (int)52);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl100:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)ff.ikjw("ikom", ikjt(int ), (int)53);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl105:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ff.ikjw("ikoo", ikjt(int ), (int)54);
                if (!var3) ** GOTO lbl100
                throw null;
            }
lbl109:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)ff.ikjw("ikoq", ikjt(int ), (int)55);
                if (!var3) break;
                throw null;
            }
            case 4: {
                var2_1 /* !! */  = (int)ff.ikjw("ikot", ikjt(int ), (int)56);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl118:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ff.ikjw("ikov", ikjt(int ), (int)57);
                    if (!var3) ** GOTO lbl109
                    throw null;
                }
            }
lbl123:
            // 4 sources

            case 6: {
                var2_1 /* !! */  = (int)ff.ikjw("ikow", ikjt(int ), (int)58);
                if (!var3) ** GOTO lbl105
                throw null;
            }
            case 7: {
                var2_1 /* !! */  = (int)ff.ikjw("ikoy", ikjt(int ), (int)59);
                if (!var3) ** GOTO lbl109
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)ff.ikjw("ikpa", ikjt(int ), (int)60);
                if (!var3) ** GOTO lbl118
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)ff.ikjw("ikpc", ikjt(int ), (int)61);
                if (!var3) ** GOTO lbl118
                throw null;
            }
            case 10: {
                var2_1 /* !! */  = (int)ff.ikjw("ikpe", ikjt(int ), (int)62);
                if (!var3) ** GOTO lbl100
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)ff.ikjw("ikph", ikjt(int ), (int)63);
        ** while (!var3)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean blurDisabled() {
        block59: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ff.pw - ff.ikjw("iklf", ikkl(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ff.ikjw("iklg", ikjt(int ), (int)22)) break;
                v0 /* !! */  = (long)ff.ikjw("iklh", ikjt(int ), (int)23);
            }
            var3 = ff.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ff.pw - ff.ikjw("ikli", ikkl(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ff.ikjw("iklj", ikjt(int ), (int)24)) break;
                v1 /* !! */  = (long)ff.ikjw("iklk", ikjt(int ), (int)25);
            }
            var2_1 /* !! */  = ff.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = ff.pw - ff.ikjw("ikll", ikkl(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ff.ikjw("iklm", ikjt(int ), (int)26)) {
                    var1_2 = ff.a;
                    if (var3) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)ff.ikjw("ikln", ikjt(int ), (int)27);
            }
            if (var1_2 || var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
            v3 /* !! */  = ff.pw;
            if (true) ** GOTO lbl27
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - ff.ikjw("iklp", ikkl(int ), (int)12));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -310543300: {
                        v4 = ff.ikjw("iklq", ikkl(int ), (int)13);
                        continue block35;
                    }
                    case 133957524: {
                        break block35;
                    }
                    case 1834693635: {
                        v4 = ff.ikjw("iklr", ikkl(int ), (int)14);
                        continue block35;
                    }
                }
                break;
            }
            var0_3 = ff.instance;
            if (var1_2 || var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
            if (var0_3 == null) break block59;
            if (var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
            v5 /* !! */  = ff.pw;
            block36: while (true) {
                switch ((int)v5 /* !! */ ) {
                    case 133957524: {
                        break block36;
                    }
                    case 933093998: {
                        v5 /* !! */  = (long)(ff.ikjw("iklt", ikkl(int ), (int)16) - ff.ikjw("ikls", ikkl(int ), (int)15));
                        continue block36;
                    }
                }
                break;
            }
            if (!var0_3.isState()) break block59;
            if (var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
            v6 /* !! */  = ff.pw;
            if (true) ** GOTO lbl54
            block37: while (true) {
                v6 /* !! */  = (long)(v7 - ff.ikjw("iklu", ikkl(int ), (int)17));
lbl54:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 133957524: {
                        break block37;
                    }
                    case 590792373: {
                        v7 = ff.ikjw("iklv", ikkl(int ), (int)18);
                        continue block37;
                    }
                    case 2029565364: {
                        v7 = ff.ikjw("iklw", ikkl(int ), (int)19);
                        continue block37;
                    }
                }
                break;
            }
            v8 = var0_3.removeBlur;
            v9 /* !! */  = ff.pw;
            block38: while (true) {
                switch ((int)v9 /* !! */ ) {
                    case 133957524: {
                        break block38;
                    }
                    case 1798249086: {
                        v9 /* !! */  = (long)(ff.ikjw("ikly", ikkl(int ), (int)21) - ff.ikjw("iklx", ikkl(int ), (int)20));
                        continue block38;
                    }
                }
                break;
            }
            if (v8.isValue()) {
                if (var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
                v10 = ff.ikjw("iklz", ikjt(int ), (int)29);
                if (!var3) return (boolean)v10;
                throw null;
            }
        }
        if (var1_2) return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block39: while (true) {
            block60: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_2) {
                            return (boolean)ff.ikjw("iklo", ikjt(int ), (int)28);
                        }
                        v10 = ff.ikjw("ikma", ikjt(int ), (int)30);
                        return (boolean)v10;
                    }
                    case 1: {
                        ** GOTO lbl122
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikme", ikjt(int ), (int)34);
                        cfr_temp_0 = 0;
                        if (var3) {
                            throw null;
                        }
                        break block60;
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmi", ikjt(int ), (int)38);
                        cfr_temp_0 = 10;
                        if (var3) {
                            throw null;
                        }
                        break block60;
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmj", ikjt(int ), (int)39);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmb", ikjt(int ), (int)31);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmf", ikjt(int ), (int)35);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 10: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikml", ikjt(int ), (int)41);
                        if (!var3) ** break;
                        throw null;
                    }
                    case 11: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmm", ikjt(int ), (int)42);
                        if (var3) {
                            throw null;
                        }
lbl122:
                        // 3 sources

                        var2_1 /* !! */  = (int)ff.ikjw("ikmc", ikjt(int ), (int)32);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 9: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmk", ikjt(int ), (int)40);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmd", ikjt(int ), (int)33);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikmh", ikjt(int ), (int)37);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl142
            }
            do {
                if (true) continue block39;
lbl142:
                // 2 sources

                var2_1 /* !! */  = (int)ff.ikjw("ikmg", ikjt(int ), (int)36);
                cfr_temp_0 = 2;
            } while (!var3);
            break;
        }
        throw null;
    }

    static {
        ikju = new int[106];
        ikjv = new int[106];
        ff.ikue();
        ff.ikuh();
        ff.ikui();
        ff.ikum();
        ikkm = new long[64];
        ikkn = new long[64];
        ff.ikun();
        ff.ikur();
    }

    private static /* synthetic */ int ikjt(int n2) {
        return ikju[n2] ^ ikjv[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean weatherDisabled() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ff.pw - ff.ikjw("ikpn", ikkl(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ff.ikjw("ikpp", ikjt(int ), (int)64)) break;
            v0 /* !! */  = (long)ff.ikjw("ikpq", ikjt(int ), (int)65);
        }
        var3 = ff.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ff.pw - ff.ikjw("ikps", ikkl(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ff.ikjw("ikpu", ikjt(int ), (int)66)) break;
            v1 /* !! */  = (long)ff.ikjw("ikpv", ikjt(int ), (int)67);
        }
        var2_1 /* !! */  = ff.b;
        v2 /* !! */  = ff.pw;
        block37: while (true) {
            switch ((int)v2 /* !! */ ) {
                case 133957524: {
                    break block37;
                }
                case 1303896394: {
                    v2 /* !! */  = (long)(ff.ikjw("ikpy", ikkl(int ), (int)39) - ff.ikjw("ikpw", ikkl(int ), (int)38));
                    continue block37;
                }
            }
            break;
        }
        var1_2 = ff.a;
        if (var3) {
            throw null;
        }
        if (var1_2 || var1_2) return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
        v3 /* !! */  = ff.pw;
        if (true) ** GOTO lbl29
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - ff.ikjw("ikqc", ikkl(int ), (int)40));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1782242599: {
                    v4 = ff.ikjw("ikqe", ikkl(int ), (int)41);
                    continue block38;
                }
                case 133957524: {
                    break block38;
                }
                case 1949451214: {
                    v4 = ff.ikjw("ikqg", ikkl(int ), (int)42);
                    continue block38;
                }
            }
            break;
        }
        var0_3 = ff.instance;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block39: while (true) {
            block62: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_2 || var1_2) return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
                        if (var0_3 == null) ** GOTO lbl92
                        if (var1_2) return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
                        v5 /* !! */  = ff.pw;
                        block40: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -183778543: {
                                    v6 = ff.ikjw("ikqk", ikkl(int ), (int)44);
                                    ** GOTO lbl60
                                }
                                case 133957524: {
                                    break block40;
                                }
                                case 1212721852: {
                                    v6 = ff.ikjw("ikqm", ikkl(int ), (int)45);
                                    ** GOTO lbl60
                                }
                                case 1597846263: {
                                    v6 = ff.ikjw("ikqn", ikkl(int ), (int)46);
lbl60:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - ff.ikjw("ikqi", ikkl(int ), (int)43));
                                    continue block40;
                                }
                            }
                            break;
                        }
                        if (!var0_3.isState()) ** GOTO lbl92
                        if (var1_2) return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
                        v7 /* !! */  = ff.pw;
                        block41: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1778522971: {
                                    v8 = ff.ikjw("ikqr", ikkl(int ), (int)48);
                                    ** GOTO lbl75
                                }
                                case -845058497: {
                                    v8 = ff.ikjw("ikqs", ikkl(int ), (int)49);
                                    ** GOTO lbl75
                                }
                                case -297208107: {
                                    v8 = ff.ikjw("ikqu", ikkl(int ), (int)50);
lbl75:
                                    // 3 sources

                                    v7 /* !! */  = (long)(v8 - ff.ikjw("ikqp", ikkl(int ), (int)47));
                                    continue block41;
                                }
                                case 133957524: {
                                    break block41;
                                }
                            }
                            break;
                        }
                        v9 = var0_3.removeWeather;
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_3 = ff.pw - ff.ikjw("ikqw", ikkl(int ), (int)51)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v10 /* !! */  != ff.ikjw("ikqy", ikjt(int ), (int)69)) ** GOTO lbl86
                            if (v9.isValue()) {
                                break;
                            }
                            ** GOTO lbl92
lbl86:
                            // 1 sources

                            v10 /* !! */  = (long)ff.ikjw("ikqz", ikjt(int ), (int)70);
                        }
                        if (var1_2) return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
                        v11 = ff.ikjw("ikrb", ikjt(int ), (int)71);
                        if (!var3) return (boolean)v11;
                        throw null;
lbl92:
                        // 3 sources

                        if (var1_2 || var1_2) {
                            return (boolean)ff.ikjw("ikqa", ikjt(int ), (int)68);
                        }
                        v11 = ff.ikjw("ikrd", ikjt(int ), (int)72);
                        return (boolean)v11;
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrl", ikjt(int ), (int)76);
                        cfr_temp_0 = 4;
                        if (var3) {
                            throw null;
                        }
                        break block62;
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrq", ikjt(int ), (int)79);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrj", ikjt(int ), (int)75);
                        cfr_temp_0 = 8;
                        if (var3) {
                            throw null;
                        }
                        break block62;
                    }
                    case 9: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrw", ikjt(int ), (int)82);
                        cfr_temp_0 = 8;
                        if (var3) {
                            throw null;
                        }
                        break block62;
                    }
                    case 10: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikry", ikjt(int ), (int)83);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrs", ikjt(int ), (int)80);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikro", ikjt(int ), (int)78);
                        cfr_temp_0 = 8;
                        if (var3) {
                            throw null;
                        }
                        break block62;
                    }
                    case 11: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrz", ikjt(int ), (int)84);
                        if (var3) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrf", ikjt(int ), (int)73);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikrh", ikjt(int ), (int)74);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_1 /* !! */  = (int)ff.ikjw("ikru", ikjt(int ), (int)81);
                        if (var3) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl154
            }
            do {
                if (true) continue block39;
lbl154:
                // 2 sources

                var2_1 /* !! */  = (int)ff.ikjw("ikrn", ikjt(int ), (int)77);
                cfr_temp_0 = 0;
            } while (!var3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ikun() {
        ff.ikkm[0] = -3676105005322226188L;
        ff.ikkm[1] = 5603300231609133692L;
        ff.ikkm[2] = -2010137230455945731L;
        ff.ikkm[3] = -6318427140092485892L;
        ff.ikkm[4] = -4349451249328737952L;
        ff.ikkm[5] = 1760267913730472113L;
        ff.ikkm[6] = -5949755415307621047L;
        ff.ikkm[7] = -6148375473375166611L;
        ff.ikkm[8] = -7205836301594002757L;
        ff.ikkm[9] = 4528210393716207627L;
        ff.ikkm[10] = -7117670557103241825L;
        ff.ikkm[11] = -7499472508104885895L;
        ff.ikkm[12] = 6697711084841430044L;
        ff.ikkm[13] = -1407054650780356478L;
        ff.ikkm[14] = -2551941259130292241L;
        ff.ikkm[15] = -6302058673976196769L;
        ff.ikkm[16] = -8161467569685046359L;
        ff.ikkm[17] = -2232799056488789296L;
        ff.ikkm[18] = -7567125280646431479L;
        ff.ikkm[19] = 9124522942436545451L;
        ff.ikkm[20] = 934941717295994479L;
        ff.ikkm[21] = -4316172947158239751L;
        ff.ikkm[22] = 6748829389787036853L;
        ff.ikkm[23] = -5993068218624348318L;
        ff.ikkm[24] = -1516766528475180689L;
        ff.ikkm[25] = -4302131115389225036L;
        ff.ikkm[26] = 3422317867653322752L;
        ff.ikkm[27] = -5006586171242806300L;
        ff.ikkm[28] = -5120949218571383356L;
        ff.ikkm[29] = -8561326260571029007L;
        ff.ikkm[30] = 7997702187289285742L;
        ff.ikkm[31] = 2801645678380273531L;
        ff.ikkm[32] = -1565525840909805204L;
        ff.ikkm[33] = -3677828014953937679L;
        ff.ikkm[34] = 5680447306647110007L;
        ff.ikkm[35] = 1349643383235331873L;
        ff.ikkm[36] = -3362294032675573134L;
        ff.ikkm[37] = 8160843607791941017L;
        ff.ikkm[38] = -2700231334174159664L;
        ff.ikkm[39] = -4566114808586989300L;
        ff.ikkm[40] = 1197320462894872200L;
        ff.ikkm[41] = 3475013269792278407L;
        ff.ikkm[42] = -699144594264944944L;
        ff.ikkm[43] = 4420179476434979476L;
        ff.ikkm[44] = -8422185183091469923L;
        ff.ikkm[45] = -6257562639028928700L;
        ff.ikkm[46] = -4044170499783982275L;
        ff.ikkm[47] = 6932881952828279145L;
        ff.ikkm[48] = 522601210533523616L;
        ff.ikkm[49] = 1774010370098790664L;
        ff.ikkm[50] = -9109494636551636874L;
        ff.ikkm[51] = -8190837084618755058L;
        ff.ikkm[52] = -8501462281914914541L;
        ff.ikkm[53] = 4444060334286470247L;
        ff.ikkm[54] = 5042531618161750060L;
        ff.ikkm[55] = 9212000237178459811L;
        ff.ikkm[56] = -1684170628211652380L;
        ff.ikkm[57] = 7930177444969906031L;
        ff.ikkm[58] = 1978459226445823848L;
        ff.ikkm[59] = -6789045993291743400L;
        ff.ikkm[60] = -3082651114190171900L;
        ff.ikkm[61] = 1994304332804333547L;
        ff.ikkm[62] = 7439866115631855248L;
        ff.ikkm[63] = 7511686581038241702L;
    }

    private static /* synthetic */ void ikuh() {
        ff.ikju[100] = 1774036246;
        ff.ikju[101] = 883485669;
        ff.ikju[102] = -211408964;
        ff.ikju[103] = -1067165298;
        ff.ikju[104] = 1320655964;
        ff.ikju[105] = 1280064915;
    }

    private static /* synthetic */ long ikkl(int n2) {
        return ikkm[n2] ^ ikkn[n2];
    }

    public static /* synthetic */ CallSite ikjw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

