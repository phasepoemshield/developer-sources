/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import ruhack.phobia.aw;
import ruhack.phobia.dc;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.ot;

public class gi
extends ds {
    private static int[] eejb;
    public static final boolean a;
    private final kb iceBoost;
    protected static final long kl = -180338941284226461L;
    private final kg iceBoostSpeed;
    private final kf modeSetting;
    private static long[] eejq;
    private static long[] eejp;
    private static int[] eeja;
    public static final boolean c;
    public static final int b;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public gi() {
        var2_1 /* !! */  = gi.b;
        super("WaterSpeed", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u0432\u043e\u0434\u0435", du.MOVEMENT);
        this.modeSetting = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0440\u0435\u0436\u0438\u043c \u043e\u0431\u0445\u043e\u0434\u0430", "FunTime", new String[]{"FunTime"});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block9: do {
            switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    this.iceBoost = new kb("\u0423\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435 \u043f\u043e\u0434 \u043b\u044c\u0434\u043e\u043c", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u043a\u043e\u0433\u0434\u0430 \u0443\u043f\u0438\u0440\u0430\u0435\u0448\u044c\u0441\u044f \u0433\u043e\u043b\u043e\u0432\u043e\u0439 \u0432 \u043b\u0451\u0434").setValue((boolean)gi.eejc("eejd", eeiz(int ), (int)0));
                    this.iceBoostSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u0434 \u043b\u044c\u0434\u043e\u043c", "\u041c\u043d\u043e\u0436\u0438\u0442\u0435\u043b\u044c \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438 \u043f\u043e\u0434 \u043b\u044c\u0434\u043e\u043c", (float)gi.eejc("eejf", eeje(int ), (int)1)).range(1.0f, (float)gi.eejc("eejg", eeje(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((gi)this));
                    this.settings(new jx[]{this.modeSetting, this.iceBoost, this.iceBoostSpeed});
                    return;
                }
                case 3: {
                    var2_1 /* !! */  = (int)gi.eejc("eejk", eeiz(int ), (int)6);
                }
                case 0: {
                    ** GOTO lbl29
                }
                case 4: {
                    var2_1 /* !! */  = (int)gi.eejc("eejl", eeiz(int ), (int)7);
                    cfr_temp_0 = 2;
                    continue block9;
                }
                case 5: {
                    var2_1 /* !! */  = (int)gi.eejc("eejm", eeiz(int ), (int)8);
                }
                case 2: {
                    while (true) {
                        var2_1 /* !! */  = (int)gi.eejc("eejj", eeiz(int ), (int)5);
                    }
                }
                case 6: {
                    var2_1 /* !! */  = (int)gi.eejc("eejn", eeiz(int ), (int)9);
lbl29:
                    // 2 sources

                    var2_1 /* !! */  = (int)gi.eejc("eejh", eeiz(int ), (int)3);
                }
                case 1: 
            }
            break;
        } while (true);
        while (true) {
            var2_1 /* !! */  = (int)gi.eejc("eeji", eeiz(int ), (int)4);
        }
    }

    private static /* synthetic */ float eeje(int n2) {
        return Float.intBitsToFloat(eeja[n2] ^ eejb[n2]);
    }

    private static /* synthetic */ void efjd() {
        gi.eeja[0] = -1684529931;
        gi.eeja[1] = 1830632957;
        gi.eeja[2] = -1230992968;
        gi.eeja[3] = -158646119;
        gi.eeja[4] = 544710693;
        gi.eeja[5] = 712868126;
        gi.eeja[6] = 23645231;
        gi.eeja[7] = 1357031343;
        gi.eeja[8] = 483361697;
        gi.eeja[9] = -1929525766;
        gi.eeja[10] = -427481453;
        gi.eeja[11] = -844903633;
        gi.eeja[12] = 26985374;
        gi.eeja[13] = -421155651;
        gi.eeja[14] = 110058208;
        gi.eeja[15] = 707864155;
        gi.eeja[16] = -982225757;
        gi.eeja[17] = 54110205;
        gi.eeja[18] = 1278324558;
        gi.eeja[19] = 1300517272;
        gi.eeja[20] = -1378529824;
        gi.eeja[21] = -1533316171;
        gi.eeja[22] = 1172826485;
        gi.eeja[23] = -1997641491;
        gi.eeja[24] = 153057670;
        gi.eeja[25] = 884982588;
        gi.eeja[26] = 372302190;
        gi.eeja[27] = 532437200;
        gi.eeja[28] = 1691814001;
        gi.eeja[29] = 1369493039;
        gi.eeja[30] = -1317576421;
        gi.eeja[31] = 101051704;
        gi.eeja[32] = 1172181115;
        gi.eeja[33] = 733097734;
        gi.eeja[34] = 750166661;
        gi.eeja[35] = -927370625;
        gi.eeja[36] = 1888390679;
        gi.eeja[37] = -473171977;
        gi.eeja[38] = 1217765208;
        gi.eeja[39] = -2134547083;
        gi.eeja[40] = -691536624;
        gi.eeja[41] = -1693121609;
        gi.eeja[42] = 670450376;
        gi.eeja[43] = -1650065684;
        gi.eeja[44] = -151549429;
        gi.eeja[45] = 957678240;
        gi.eeja[46] = -148142674;
        gi.eeja[47] = -688750289;
        gi.eeja[48] = -2055474521;
        gi.eeja[49] = 901179406;
        gi.eeja[50] = -150989123;
        gi.eeja[51] = 745598036;
        gi.eeja[52] = -255625397;
        gi.eeja[53] = -2703122;
        gi.eeja[54] = 98902086;
        gi.eeja[55] = -1175589234;
        gi.eeja[56] = 654691878;
        gi.eeja[57] = 1084127316;
        gi.eeja[58] = -314856795;
        gi.eeja[59] = -97452473;
        gi.eeja[60] = -1709519413;
        gi.eeja[61] = 109215758;
        gi.eeja[62] = 2004519441;
        gi.eeja[63] = 1792772805;
        gi.eeja[64] = 2007602705;
        gi.eeja[65] = 1147116284;
        gi.eeja[66] = -425850696;
        gi.eeja[67] = 1984628733;
        gi.eeja[68] = 42714977;
        gi.eeja[69] = 1973837701;
        gi.eeja[70] = -623709925;
        gi.eeja[71] = -1948008082;
        gi.eeja[72] = 1354681360;
        gi.eeja[73] = 769401020;
        gi.eeja[74] = 1724915372;
        gi.eeja[75] = -1904714320;
        gi.eeja[76] = -1354798283;
        gi.eeja[77] = -777223142;
        gi.eeja[78] = -802908007;
        gi.eeja[79] = -1198008497;
        gi.eeja[80] = -492615808;
        gi.eeja[81] = 149240381;
        gi.eeja[82] = 743385349;
        gi.eeja[83] = 2116192211;
        gi.eeja[84] = 325878654;
        gi.eeja[85] = -777189399;
        gi.eeja[86] = 1597043082;
        gi.eeja[87] = 2018635379;
        gi.eeja[88] = 675759784;
        gi.eeja[89] = 32630975;
        gi.eeja[90] = 755210939;
        gi.eeja[91] = -576397211;
        gi.eeja[92] = -2058106888;
        gi.eeja[93] = 33890143;
        gi.eeja[94] = -356821415;
        gi.eeja[95] = 934957361;
        gi.eeja[96] = 1790530162;
        gi.eeja[97] = 2004142382;
        gi.eeja[98] = -146052583;
        gi.eeja[99] = 1320065880;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isIceBlock(class_2338 var1_1) {
        block78: {
            v0 /* !! */  = gi.kl;
            if (true) ** GOTO lbl5
            block43: while (true) {
                v0 /* !! */  = (long)(v1 - gi.eejc("efgj", eejo(int ), (int)221));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1501271923: {
                        v1 = gi.eejc("efgk", eejo(int ), (int)222);
                        continue block43;
                    }
                    case 725276118: {
                        v1 = gi.eejc("efgl", eejo(int ), (int)223);
                        continue block43;
                    }
                    case 966093411: {
                        break block43;
                    }
                }
                break;
            }
            var5_2 = gi.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = gi.kl - gi.eejc("efgm", eejo(int ), (int)224)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gi.eejc("efgn", eeiz(int ), (int)248)) break;
                v2 /* !! */  = (long)gi.eejc("efgo", eeiz(int ), (int)249);
            }
            var4_3 /* !! */  = gi.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = gi.kl - gi.eejc("efgp", eejo(int ), (int)225)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gi.eejc("efgq", eeiz(int ), (int)250)) {
                    var3_4 = gi.a;
                    if (var5_2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)gi.eejc("efgr", eeiz(int ), (int)251);
            }
            if (var3_4 || var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
            v4 /* !! */  = gi.kl;
            if (true) ** GOTO lbl35
            block46: while (true) {
                v4 /* !! */  = (long)(v5 - gi.eejc("efgt", eejo(int ), (int)226));
lbl35:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -538274196: {
                        v5 = gi.eejc("efgu", eejo(int ), (int)227);
                        continue block46;
                    }
                    case 966093411: {
                        break block46;
                    }
                    case 1157451826: {
                        v5 = gi.eejc("efgv", eejo(int ), (int)228);
                        continue block46;
                    }
                }
                break;
            }
            v6 /* !! */  = gi.kl;
            if (true) ** GOTO lbl48
            block47: while (true) {
                v6 /* !! */  = (long)(v7 - gi.eejc("efgw", eejo(int ), (int)229));
lbl48:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -82451633: {
                        v7 = gi.eejc("efgx", eejo(int ), (int)230);
                        continue block47;
                    }
                    case 715232041: {
                        v7 = gi.eejc("efgy", eejo(int ), (int)231);
                        continue block47;
                    }
                    case 966093411: {
                        break block47;
                    }
                }
                break;
            }
            v8 = gi.mc.field_1687;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = gi.kl - gi.eejc("efgz", eejo(int ), (int)232)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gi.eejc("efha", eeiz(int ), (int)253)) break;
                v9 /* !! */  = (long)gi.eejc("efhb", eeiz(int ), (int)254);
            }
            v10 = v8.method_8320(var1_1);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = gi.kl - gi.eejc("efhc", eejo(int ), (int)233)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gi.eejc("efhd", eeiz(int ), (int)255)) {
                    var2_5 = v10.method_26204();
                    if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
                    break;
                }
                v11 /* !! */  = (long)gi.eejc("efhe", eeiz(int ), (int)256);
            }
            if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
            while (true) {
                block79: {
                    if ((v12 /* !! */  = (cfr_temp_5 = gi.kl - gi.eejc("efhf", eejo(int ), (int)234)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  != gi.eejc("efhg", eeiz(int ), (int)257)) break block79;
                    if (var2_5 != class_2246.field_10295) {
                        break;
                    }
                    ** GOTO lbl129
                }
                v12 /* !! */  = (long)gi.eejc("efhh", eeiz(int ), (int)258);
            }
            if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
            while (true) {
                block80: {
                    if ((v13 /* !! */  = (cfr_temp_6 = gi.kl - gi.eejc("efhi", eejo(int ), (int)235)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  != gi.eejc("efhj", eeiz(int ), (int)259)) break block80;
                    if (var2_5 != class_2246.field_10225) {
                        break;
                    }
                    ** GOTO lbl129
                }
                v13 /* !! */  = (long)gi.eejc("efhk", eeiz(int ), (int)260);
            }
            if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block52: do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v14 /* !! */  = gi.kl;
                        block53: while (true) {
                            switch ((int)v14 /* !! */ ) {
                                case -1735889285: {
                                    v15 = gi.eejc("efhm", eejo(int ), (int)237);
                                    ** GOTO lbl108
                                }
                                case 966093411: {
                                    break block53;
                                }
                                case 1933917280: {
                                    v15 = gi.eejc("efhn", eejo(int ), (int)238);
lbl108:
                                    // 2 sources

                                    v14 /* !! */  = (long)(v15 - gi.eejc("efhl", eejo(int ), (int)236));
                                    continue block53;
                                }
                            }
                            break;
                        }
                        if (var2_5 == class_2246.field_10384) ** GOTO lbl129
                        if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
                        v16 /* !! */  = gi.kl;
                        block54: while (true) {
                            switch ((int)v16 /* !! */ ) {
                                case -1937737334: {
                                    v17 = gi.eejc("efhp", eejo(int ), (int)240);
                                    ** GOTO lbl123
                                }
                                case -1233314469: {
                                    v17 = gi.eejc("efhq", eejo(int ), (int)241);
                                    ** GOTO lbl123
                                }
                                case 363945923: {
                                    v17 = gi.eejc("efhr", eejo(int ), (int)242);
lbl123:
                                    // 3 sources

                                    v16 /* !! */  = (long)(v17 - gi.eejc("efho", eejo(int ), (int)239));
                                    continue block54;
                                }
                                case 966093411: {
                                    break block54;
                                }
                            }
                            break;
                        }
                        if (var2_5 != class_2246.field_10110) ** GOTO lbl133
                        if (var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
lbl129:
                        // 4 sources

                        if (var3_4 || var3_4) return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
                        v18 = gi.eejc("efhs", eeiz(int ), (int)261);
                        if (!var5_2) return (boolean)v18;
                        throw null;
lbl133:
                        // 1 sources

                        if (var3_4 || var3_4) {
                            return (boolean)gi.eejc("efgs", eeiz(int ), (int)252);
                        }
                        v18 = gi.eejc("efht", eeiz(int ), (int)262);
                        return (boolean)v18;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)gi.eejc("efhu", eeiz(int ), (int)263);
                        cfr_temp_0 = 7;
                        if (!var5_2) continue block52;
                        throw null;
                    }
                    case 3: {
                        ** break;
                    }
                    case 8: {
                        var4_3 /* !! */  = (int)gi.eejc("efic", eeiz(int ), (int)271);
                        cfr_temp_0 = 6;
                        if (!var5_2) continue block52;
                        throw null;
                    }
                    case 11: {
                        var4_3 /* !! */  = (int)gi.eejc("efif", eeiz(int ), (int)274);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)gi.eejc("efhw", eeiz(int ), (int)265);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var4_3 /* !! */  = (int)gi.eejc("efid", eeiz(int ), (int)272);
                        if (!var5_2) ** break;
                        throw null;
                    }
                    case 12: {
                        var4_3 /* !! */  = (int)gi.eejc("efig", eeiz(int ), (int)275);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_3 /* !! */  = (int)gi.eejc("efib", eeiz(int ), (int)270);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_3 /* !! */  = (int)gi.eejc("efhv", eeiz(int ), (int)264);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)gi.eejc("efia", eeiz(int ), (int)269);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        do {
                            var4_3 /* !! */  = (int)gi.eejc("efih", eeiz(int ), (int)276);
                        } while (!var5_2);
                        throw null;
                    }
                    case 14: {
                        break block78;
                    }
lbl184:
                    // 2 sources

                    while (true) {
                        var4_3 /* !! */  = (int)gi.eejc("efhx", eeiz(int ), (int)266);
                        cfr_temp_0 = 10;
                        if (!var5_2) continue block52;
                        throw null;
                    }
                    case 10: {
                        var4_3 /* !! */  = (int)gi.eejc("efie", eeiz(int ), (int)273);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)gi.eejc("efhy", eeiz(int ), (int)267);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)gi.eejc("efhz", eeiz(int ), (int)268);
            if (!var5_2) ** break;
            throw null;
        }
        var4_3 /* !! */  = (int)gi.eejc("efii", eeiz(int ), (int)277);
        ** while (!var5_2)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onSwimming(dc var1_1) {
        block69: {
            block68: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gi.kl - gi.eejc("eeyk", eejo(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gi.eejc("eeyl", eeiz(int ), (int)127)) break;
                    v0 /* !! */  = (long)gi.eejc("eeym", eeiz(int ), (int)128);
                }
                var4_2 = gi.c;
                v1 /* !! */  = gi.kl;
                if (true) ** GOTO lbl11
                block47: while (true) {
                    v1 /* !! */  = (long)(v2 - gi.eejc("eeyn", eejo(int ), (int)136));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2121852924: {
                            v2 = gi.eejc("eeyo", eejo(int ), (int)137);
                            continue block47;
                        }
                        case -290176191: {
                            v2 = gi.eejc("eeyp", eejo(int ), (int)138);
                            continue block47;
                        }
                        case 966093411: {
                            break block47;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = gi.b;
                v3 /* !! */  = gi.kl;
                if (true) ** GOTO lbl25
                block48: while (true) {
                    v3 /* !! */  = (long)(v4 - gi.eejc("eeyq", eejo(int ), (int)139));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 523561842: {
                            v4 = gi.eejc("eeyr", eejo(int ), (int)140);
                            continue block48;
                        }
                        case 966093411: {
                            break block48;
                        }
                        case 1404014202: {
                            v4 = gi.eejc("eeys", eejo(int ), (int)141);
                            continue block48;
                        }
                        case 1886478569: {
                            v4 = gi.eejc("eeyt", eejo(int ), (int)142);
                            continue block48;
                        }
                    }
                    break;
                }
                var2_4 = gi.a;
                if (var4_2) {
                    throw null;
lbl40:
                    // 9 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gi.kl - gi.eejc("eeyu", eejo(int ), (int)143)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gi.eejc("eeyv", eeiz(int ), (int)129)) break;
                    v5 /* !! */  = (long)gi.eejc("eeyw", eeiz(int ), (int)130);
                }
                v6 /* !! */  = gi.kl;
                if (true) ** GOTO lbl52
                block51: while (true) {
                    v6 /* !! */  = (long)(v7 - gi.eejc("eeyx", eejo(int ), (int)144));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1681405043: {
                            v7 = gi.eejc("eeyy", eejo(int ), (int)145);
                            continue block51;
                        }
                        case 966093411: {
                            break block51;
                        }
                        case 2114524872: {
                            v7 = gi.eejc("eeyz", eejo(int ), (int)146);
                            continue block51;
                        }
                    }
                    break;
                }
                if (gi.mc.field_1724 == null) break block68;
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = gi.kl - gi.eejc("eeza", eejo(int ), (int)147)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gi.eejc("eezb", eeiz(int ), (int)131)) break;
                    v8 /* !! */  = (long)gi.eejc("eezc", eeiz(int ), (int)132);
                }
                v9 /* !! */  = gi.kl;
                if (true) ** GOTO lbl72
                block53: while (true) {
                    v9 /* !! */  = (long)(gi.eejc("eeze", eejo(int ), (int)149) - gi.eejc("eezd", eejo(int ), (int)148));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -77486008: {
                            continue block53;
                        }
                        case 966093411: {
                            break block53;
                        }
                    }
                    break;
                }
                if (gi.mc.field_1687 != null) break block69;
                if (var2_4) ** GOTO lbl40
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            return;
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                v10 /* !! */  = gi.kl;
                if (true) ** GOTO lbl92
                block54: while (true) {
                    v10 /* !! */  = (long)(gi.eejc("eezg", eejo(int ), (int)151) - gi.eejc("eezf", eejo(int ), (int)150));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 53778381: {
                            continue block54;
                        }
                        case 966093411: {
                            break block54;
                        }
                    }
                    break;
                }
                v11 /* !! */  = gi.kl;
                if (true) ** GOTO lbl101
                block55: while (true) {
                    v11 /* !! */  = (long)(gi.eejc("eezi", eejo(int ), (int)153) - gi.eejc("eezh", eejo(int ), (int)152));
lbl101:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 282324599: {
                            continue block55;
                        }
                        case 966093411: {
                            break block55;
                        }
                    }
                    break;
                }
                if (!this.modeSetting.isSelected("FunTime")) ** GOTO lbl115
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = gi.kl - gi.eejc("eezj", eejo(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gi.eejc("eezk", eeiz(int ), (int)133)) break;
                    v12 /* !! */  = (long)gi.eejc("eezl", eeiz(int ), (int)134);
                }
                this.processSwimmingBoost(var1_1);
                if (var2_4) ** GOTO lbl40
lbl115:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl118:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)gi.eejc("eezm", eeiz(int ), (int)135);
                if (!var4_2) break;
                throw null;
            }
lbl122:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gi.eejc("eezn", eeiz(int ), (int)136);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 2: {
                var3_3 /* !! */  = (int)gi.eejc("eezo", eeiz(int ), (int)137);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)gi.eejc("eezp", eeiz(int ), (int)138);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl135:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gi.eejc("eezq", eeiz(int ), (int)139);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 5: {
                var3_3 /* !! */  = (int)gi.eejc("eezr", eeiz(int ), (int)140);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
lbl144:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gi.eejc("eezs", eeiz(int ), (int)141);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 7: {
                var3_3 /* !! */  = (int)gi.eejc("eezt", eeiz(int ), (int)142);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 8: {
                var3_3 /* !! */  = (int)gi.eejc("eezu", eeiz(int ), (int)143);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl159:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)gi.eejc("eezv", eeiz(int ), (int)144);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)gi.eejc("eezw", eeiz(int ), (int)145);
                if (!var4_2) ** GOTO lbl144
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)gi.eejc("eezx", eeiz(int ), (int)146);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl172:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)gi.eejc("eezy", eeiz(int ), (int)147);
                if (!var4_2) break;
                throw null;
            }
lbl176:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)gi.eejc("eezz", eeiz(int ), (int)148);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
lbl180:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)gi.eejc("efaa", eeiz(int ), (int)149);
                if (!var4_2) break;
                throw null;
            }
            case 15: 
        }
        var3_3 /* !! */  = (int)gi.eejc("efab", eeiz(int ), (int)150);
        ** while (!var4_2)
lbl187:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efjk() {
        gi.eejp[100] = 7551216397113884208L;
        gi.eejp[101] = -6209917559682596846L;
        gi.eejp[102] = 2837829682259900344L;
        gi.eejp[103] = -5292753351172318176L;
        gi.eejp[104] = -455812739121871366L;
        gi.eejp[105] = 951085488941421434L;
        gi.eejp[106] = -7128013173227112645L;
        gi.eejp[107] = -1476443727777993987L;
        gi.eejp[108] = 1655733762554649667L;
        gi.eejp[109] = 4237817739064040347L;
        gi.eejp[110] = -5214432534788935545L;
        gi.eejp[111] = 2759759048401977571L;
        gi.eejp[112] = 7791394471598085291L;
        gi.eejp[113] = 975854110085709613L;
        gi.eejp[114] = 4073364660385385286L;
        gi.eejp[115] = 4845556829340008929L;
        gi.eejp[116] = 7340734503820159451L;
        gi.eejp[117] = -4292566218853512776L;
        gi.eejp[118] = -2044457715973421808L;
        gi.eejp[119] = -5737925827275554447L;
        gi.eejp[120] = 2217290051401499102L;
        gi.eejp[121] = 5479374711294805170L;
        gi.eejp[122] = 5788912753031658156L;
        gi.eejp[123] = 23809554847476879L;
        gi.eejp[124] = -8207195272986159860L;
        gi.eejp[125] = 2873388596214272466L;
        gi.eejp[126] = -248343879287234410L;
        gi.eejp[127] = -3901399538701455562L;
        gi.eejp[128] = -3497332847952777248L;
        gi.eejp[129] = 4684695656247206661L;
        gi.eejp[130] = 8850131088242520255L;
        gi.eejp[131] = -8035824769960656590L;
        gi.eejp[132] = -1652675326435255694L;
        gi.eejp[133] = -584058795358078435L;
        gi.eejp[134] = 1647937373312222004L;
        gi.eejp[135] = 4358361254520540500L;
        gi.eejp[136] = -3341397431036945570L;
        gi.eejp[137] = -8306952300566501595L;
        gi.eejp[138] = 4601601967041509094L;
        gi.eejp[139] = -1201906160415325239L;
        gi.eejp[140] = -4528511724772017597L;
        gi.eejp[141] = -2571801014518475707L;
        gi.eejp[142] = 4490031026725971299L;
        gi.eejp[143] = 107370463372015175L;
        gi.eejp[144] = 46161997952246524L;
        gi.eejp[145] = -3146149943691767223L;
        gi.eejp[146] = 2748589130429103271L;
        gi.eejp[147] = 9047985384592215503L;
        gi.eejp[148] = 4257690387650531767L;
        gi.eejp[149] = 5831239126108863271L;
        gi.eejp[150] = 7091949592448438286L;
        gi.eejp[151] = -2710526561030528191L;
        gi.eejp[152] = -2781513600193690069L;
        gi.eejp[153] = 1186927815435783101L;
        gi.eejp[154] = -4206772690508490349L;
        gi.eejp[155] = -3812873772783755312L;
        gi.eejp[156] = 6125873884663547819L;
        gi.eejp[157] = 7610868862422936291L;
        gi.eejp[158] = -6752269950093568974L;
        gi.eejp[159] = -4081777661193014696L;
        gi.eejp[160] = -4253782920095793619L;
        gi.eejp[161] = 5043949032447291205L;
        gi.eejp[162] = 6563508519380664600L;
        gi.eejp[163] = -7496266123202585524L;
        gi.eejp[164] = 260725077865322162L;
        gi.eejp[165] = -2325125712502154691L;
        gi.eejp[166] = -8066660847752082538L;
        gi.eejp[167] = 8852251925583471562L;
        gi.eejp[168] = -848968091396072497L;
        gi.eejp[169] = -3805037717066705429L;
        gi.eejp[170] = -3025231931544289374L;
        gi.eejp[171] = 2620494352084307800L;
        gi.eejp[172] = 373310369213769496L;
        gi.eejp[173] = 1989520652846565900L;
        gi.eejp[174] = -3181848050706041866L;
        gi.eejp[175] = -5496258349357992780L;
        gi.eejp[176] = -1634334324884163320L;
        gi.eejp[177] = 2089821274996784687L;
        gi.eejp[178] = -5401043379465709383L;
        gi.eejp[179] = -749807266136156653L;
        gi.eejp[180] = -737870169840513427L;
        gi.eejp[181] = -3387303908499034460L;
        gi.eejp[182] = -3663054547240713525L;
        gi.eejp[183] = -7739362882912595297L;
        gi.eejp[184] = -8002330892560291503L;
        gi.eejp[185] = -8786976566941929759L;
        gi.eejp[186] = -35506531346904594L;
        gi.eejp[187] = 7120635069310908585L;
        gi.eejp[188] = 4008897601161957202L;
        gi.eejp[189] = 2154140269999498256L;
        gi.eejp[190] = -6338832135780611936L;
        gi.eejp[191] = -3493705658600237304L;
        gi.eejp[192] = 6908248682935682368L;
        gi.eejp[193] = -3839593173633970607L;
        gi.eejp[194] = -45755183096827098L;
        gi.eejp[195] = -8481400085261786685L;
        gi.eejp[196] = -6467686256891083000L;
        gi.eejp[197] = 538545248889164651L;
        gi.eejp[198] = -4105008005188676627L;
        gi.eejp[199] = 1396790970755176749L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyIceBoost() {
        v0 /* !! */  = gi.kl;
        if (true) ** GOTO lbl5
        block108: while (true) {
            v0 /* !! */  = (long)(gi.eejc("eesz", eejo(int ), (int)69) - gi.eejc("eesw", eejo(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 966093411: {
                    break block108;
                }
                case 1045942088: {
                    continue block108;
                }
            }
            break;
        }
        var16_1 = gi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = gi.kl - gi.eejc("eeta", eejo(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gi.eejc("eetb", eeiz(int ), (int)79)) break;
            v1 /* !! */  = (long)gi.eejc("eetd", eeiz(int ), (int)80);
        }
        var15_2 /* !! */  = gi.b;
        v2 /* !! */  = gi.kl;
        if (true) ** GOTO lbl21
        block110: while (true) {
            v2 /* !! */  = (long)(v3 - gi.eejc("eete", eejo(int ), (int)71));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -28897759: {
                    v3 = gi.eejc("eetf", eejo(int ), (int)72);
                    continue block110;
                }
                case 966093411: {
                    break block110;
                }
                case 1605384607: {
                    v3 = gi.eejc("eetg", eejo(int ), (int)73);
                    continue block110;
                }
                case 1608478961: {
                    v3 = gi.eejc("eeth", eejo(int ), (int)74);
                    continue block110;
                }
            }
            break;
        }
        var14_3 = gi.a;
        if (var16_1) {
            throw null;
lbl36:
            // 10 sources

            return;
        }
        if (var14_3 || var14_3) ** GOTO lbl36
        v4 /* !! */  = gi.kl;
        if (true) ** GOTO lbl43
        block112: while (true) {
            v4 /* !! */  = (long)(v5 - gi.eejc("eeti", eejo(int ), (int)75));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -775392718: {
                    v5 = gi.eejc("eetj", eejo(int ), (int)76);
                    continue block112;
                }
                case 966093411: {
                    break block112;
                }
                case 1806514122: {
                    v5 = gi.eejc("eetl", eejo(int ), (int)77);
                    continue block112;
                }
            }
            break;
        }
        v6 /* !! */  = gi.kl;
        if (true) ** GOTO lbl56
        block113: while (true) {
            v6 /* !! */  = (long)(gi.eejc("eeto", eejo(int ), (int)79) - gi.eejc("eetm", eejo(int ), (int)78));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 301584073: {
                    continue block113;
                }
                case 966093411: {
                    break block113;
                }
            }
            break;
        }
        var1_4 = this.iceBoostSpeed.getValue();
        if (var14_3 || var14_3) ** GOTO lbl36
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = gi.kl - gi.eejc("eets", eejo(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gi.eejc("eetu", eeiz(int ), (int)81)) break;
            v7 /* !! */  = (long)gi.eejc("eetv", eeiz(int ), (int)82);
        }
        v8 /* !! */  = gi.kl;
        if (true) ** GOTO lbl72
        block115: while (true) {
            v8 /* !! */  = (long)(v9 - gi.eejc("eetw", eejo(int ), (int)81));
lbl72:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 608604993: {
                    v9 = gi.eejc("eetx", eejo(int ), (int)82);
                    continue block115;
                }
                case 966093411: {
                    break block115;
                }
                case 1366456803: {
                    v9 = gi.eejc("eety", eejo(int ), (int)83);
                    continue block115;
                }
            }
            break;
        }
        v10 = gi.mc.field_1724;
        v11 /* !! */  = gi.kl;
        if (true) ** GOTO lbl86
        block116: while (true) {
            v11 /* !! */  = (long)(gi.eejc("eeua", eejo(int ), (int)85) - gi.eejc("eetz", eejo(int ), (int)84));
lbl86:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case 572868242: {
                    continue block116;
                }
                case 966093411: {
                    break block116;
                }
            }
            break;
        }
        v12 = v10.method_36454();
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = gi.kl - gi.eejc("eeub", eejo(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == gi.eejc("eeuc", eeiz(int ), (int)83)) break;
            v13 /* !! */  = (long)gi.eejc("eeud", eeiz(int ), (int)84);
        }
        var2_5 = Math.toRadians(v12);
        if (var14_3 || var14_3) ** GOTO lbl36
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = gi.kl - gi.eejc("eeue", eejo(int ), (int)87)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gi.eejc("eeuf", eeiz(int ), (int)85)) break;
            v14 /* !! */  = (long)gi.eejc("eeun", eeiz(int ), (int)86);
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = gi.kl - gi.eejc("eeuo", eejo(int ), (int)88)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == gi.eejc("eeup", eeiz(int ), (int)87)) break;
            v15 /* !! */  = (long)gi.eejc("eeuq", eeiz(int ), (int)88);
        }
        v16 = gi.mc.field_1724;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = gi.kl - gi.eejc("eeur", eejo(int ), (int)89)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == gi.eejc("eeus", eeiz(int ), (int)89)) break;
            v17 /* !! */  = (long)gi.eejc("eeut", eeiz(int ), (int)90);
        }
        v18 = v16.method_36455();
        v19 /* !! */  = gi.kl;
        if (true) ** GOTO lbl120
        block121: while (true) {
            v19 /* !! */  = (long)(v20 - gi.eejc("eeux", eejo(int ), (int)90));
lbl120:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1735002291: {
                    v20 = gi.eejc("eeuy", eejo(int ), (int)91);
                    continue block121;
                }
                case 47249091: {
                    v20 = gi.eejc("eeuz", eejo(int ), (int)92);
                    continue block121;
                }
                case 966093411: {
                    break block121;
                }
                case 1091502404: {
                    v20 = gi.eejc("eevb", eejo(int ), (int)93);
                    continue block121;
                }
            }
            break;
        }
        var4_6 = Math.toRadians(v18);
        if (var14_3 || var14_3) ** GOTO lbl36
        var6_7 = gi.eejc("eevd", eent(int ), (int)94) * (double)var1_4;
        if (var14_3 || var14_3) ** GOTO lbl36
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_6 = gi.kl - gi.eejc("eeve", eejo(int ), (int)95)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == gi.eejc("eevf", eeiz(int ), (int)91)) break;
            v21 /* !! */  = (long)gi.eejc("eevg", eeiz(int ), (int)92);
        }
        var8_8 = Math.cos(var4_6) * var6_7;
        if (var14_3 || var14_3) ** GOTO lbl36
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_7 = gi.kl - gi.eejc("eevh", eejo(int ), (int)96)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == gi.eejc("eevi", eeiz(int ), (int)93)) break;
            v22 /* !! */  = (long)gi.eejc("eevj", eeiz(int ), (int)94);
        }
        var10_9 = -Math.sin(var2_5) * var8_8;
        if (var14_3 || var14_3) ** GOTO lbl36
        v23 /* !! */  = gi.kl;
        if (true) ** GOTO lbl154
        block124: while (true) {
            v23 /* !! */  = (long)(gi.eejc("eevl", eejo(int ), (int)98) - gi.eejc("eevk", eejo(int ), (int)97));
lbl154:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 762444049: {
                    continue block124;
                }
                case 966093411: {
                    break block124;
                }
            }
            break;
        }
        var12_10 = Math.cos(var2_5) * var8_8;
        if (var14_3) ** GOTO lbl36
        if (var15_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var14_3) ** GOTO lbl36
                v24 /* !! */  = gi.kl;
                if (true) ** GOTO lbl169
                block125: while (true) {
                    v24 /* !! */  = (long)(v25 - gi.eejc("eevn", eejo(int ), (int)99));
lbl169:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -2004790564: {
                            v25 = gi.eejc("eevp", eejo(int ), (int)100);
                            continue block125;
                        }
                        case 882662179: {
                            v25 = gi.eejc("eevq", eejo(int ), (int)101);
                            continue block125;
                        }
                        case 966093411: {
                            break block125;
                        }
                    }
                    break;
                }
                v26 /* !! */  = gi.kl;
                if (true) ** GOTO lbl182
                block126: while (true) {
                    v26 /* !! */  = (long)(gi.eejc("eevu", eejo(int ), (int)103) - gi.eejc("eevs", eejo(int ), (int)102));
lbl182:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -576328871: {
                            continue block126;
                        }
                        case 966093411: {
                            break block126;
                        }
                    }
                    break;
                }
                v27 = gi.mc.field_1724;
                v28 /* !! */  = gi.kl;
                if (true) ** GOTO lbl192
                block127: while (true) {
                    v28 /* !! */  = (long)(v29 - gi.eejc("eevv", eejo(int ), (int)104));
lbl192:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1583221051: {
                            v29 = gi.eejc("eevx", eejo(int ), (int)105);
                            continue block127;
                        }
                        case -1287573818: {
                            v29 = gi.eejc("eevy", eejo(int ), (int)106);
                            continue block127;
                        }
                        case 966093411: {
                            break block127;
                        }
                        case 1114773566: {
                            v29 = gi.eejc("eevz", eejo(int ), (int)107);
                            continue block127;
                        }
                    }
                    break;
                }
                v30 /* !! */  = gi.kl;
                if (true) ** GOTO lbl208
                block128: while (true) {
                    v30 /* !! */  = (long)(v31 - gi.eejc("eewa", eejo(int ), (int)108));
lbl208:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1817766876: {
                            v31 = gi.eejc("eewb", eejo(int ), (int)109);
                            continue block128;
                        }
                        case -1313715171: {
                            v31 = gi.eejc("eewc", eejo(int ), (int)110);
                            continue block128;
                        }
                        case 966093411: {
                            break block128;
                        }
                        case 1123919948: {
                            v31 = gi.eejc("eewd", eejo(int ), (int)111);
                            continue block128;
                        }
                    }
                    break;
                }
                v32 = gi.mc.field_1724;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_8 = gi.kl - gi.eejc("eewe", eejo(int ), (int)112)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == gi.eejc("eewf", eeiz(int ), (int)95)) break;
                    v33 /* !! */  = (long)gi.eejc("eewg", eeiz(int ), (int)96);
                }
                v34 = v32.method_18798();
                v35 /* !! */  = gi.kl;
                if (true) ** GOTO lbl231
                block130: while (true) {
                    v35 /* !! */  = (long)(v36 - gi.eejc("eewh", eejo(int ), (int)113));
lbl231:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -283169250: {
                            v36 = gi.eejc("eewi", eejo(int ), (int)114);
                            continue block130;
                        }
                        case 936178624: {
                            v36 = gi.eejc("eewj", eejo(int ), (int)115);
                            continue block130;
                        }
                        case 966093411: {
                            break block130;
                        }
                        case 1073635692: {
                            v36 = gi.eejc("eewk", eejo(int ), (int)116);
                            continue block130;
                        }
                    }
                    break;
                }
                v37 = v34.field_1352 + var10_9;
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_9 = gi.kl - gi.eejc("eewl", eejo(int ), (int)117)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == gi.eejc("eewm", eeiz(int ), (int)97)) break;
                    v38 /* !! */  = (long)gi.eejc("eewn", eeiz(int ), (int)98);
                }
                v39 /* !! */  = gi.kl;
                if (true) ** GOTO lbl253
                block132: while (true) {
                    v39 /* !! */  = (long)(v40 - gi.eejc("eewo", eejo(int ), (int)118));
lbl253:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case 966093411: {
                            break block132;
                        }
                        case 1863191736: {
                            v40 = gi.eejc("eewp", eejo(int ), (int)119);
                            continue block132;
                        }
                        case 1945860319: {
                            v40 = gi.eejc("eewr", eejo(int ), (int)120);
                            continue block132;
                        }
                    }
                    break;
                }
                v41 = gi.mc.field_1724;
                v42 /* !! */  = gi.kl;
                if (true) ** GOTO lbl267
                block133: while (true) {
                    v42 /* !! */  = (long)(v43 - gi.eejc("eews", eejo(int ), (int)121));
lbl267:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1306824209: {
                            v43 = gi.eejc("eewt", eejo(int ), (int)122);
                            continue block133;
                        }
                        case 495319654: {
                            v43 = gi.eejc("eewu", eejo(int ), (int)123);
                            continue block133;
                        }
                        case 966093411: {
                            break block133;
                        }
                        case 1360275508: {
                            v43 = gi.eejc("eewv", eejo(int ), (int)124);
                            continue block133;
                        }
                    }
                    break;
                }
                v44 = v41.method_18798();
                v45 /* !! */  = gi.kl;
                if (true) ** GOTO lbl284
                block134: while (true) {
                    v45 /* !! */  = (long)(v46 - gi.eejc("eeww", eejo(int ), (int)125));
lbl284:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case 966093411: {
                            break block134;
                        }
                        case 1626010277: {
                            v46 = gi.eejc("eewx", eejo(int ), (int)126);
                            continue block134;
                        }
                        case 2120163451: {
                            v46 = gi.eejc("eewy", eejo(int ), (int)127);
                            continue block134;
                        }
                    }
                    break;
                }
                v47 = v44.field_1351;
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_10 = gi.kl - gi.eejc("eewz", eejo(int ), (int)128)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == gi.eejc("eexa", eeiz(int ), (int)99)) break;
                    v48 /* !! */  = (long)gi.eejc("eexb", eeiz(int ), (int)100);
                }
                v49 /* !! */  = gi.kl;
                if (true) ** GOTO lbl303
                block136: while (true) {
                    v49 /* !! */  = (long)(v50 - gi.eejc("eexc", eejo(int ), (int)129));
lbl303:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1293808531: {
                            v50 = gi.eejc("eexe", eejo(int ), (int)130);
                            continue block136;
                        }
                        case -1111301356: {
                            v50 = gi.eejc("eexf", eejo(int ), (int)131);
                            continue block136;
                        }
                        case 966093411: {
                            break block136;
                        }
                    }
                    break;
                }
                v51 = gi.mc.field_1724;
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_11 = gi.kl - gi.eejc("eexg", eejo(int ), (int)132)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == gi.eejc("eexh", eeiz(int ), (int)101)) break;
                    v52 /* !! */  = (long)gi.eejc("eexi", eeiz(int ), (int)102);
                }
                v53 = v51.method_18798();
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_12 = gi.kl - gi.eejc("eexj", eejo(int ), (int)133)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == gi.eejc("eexk", eeiz(int ), (int)103)) break;
                    v54 /* !! */  = (long)gi.eejc("eexl", eeiz(int ), (int)104);
                }
                v55 = v53.field_1350 + var12_10;
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_13 = gi.kl - gi.eejc("eexm", eejo(int ), (int)134)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == gi.eejc("eexn", eeiz(int ), (int)105)) break;
                    v56 /* !! */  = (long)gi.eejc("eexo", eeiz(int ), (int)106);
                }
                v27.method_18800(v37, v47, v55);
                if (!var14_3 && !var14_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var15_2 /* !! */  = (int)gi.eejc("eexp", eeiz(int ), (int)107);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 1: {
                var15_2 /* !! */  = (int)gi.eejc("eexq", eeiz(int ), (int)108);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 2: {
                do {
                    var15_2 /* !! */  = (int)gi.eejc("eexs", eeiz(int ), (int)109);
                } while (!var16_1);
                throw null;
            }
            case 3: {
                var15_2 /* !! */  = (int)gi.eejc("eext", eeiz(int ), (int)110);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 4: {
                var15_2 /* !! */  = (int)gi.eejc("eexu", eeiz(int ), (int)111);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl359:
            // 3 sources

            case 5: {
                var15_2 /* !! */  = (int)gi.eejc("eexv", eeiz(int ), (int)112);
                if (!var16_1) break;
                throw null;
            }
lbl363:
            // 2 sources

            case 6: {
                var15_2 /* !! */  = (int)gi.eejc("eexw", eeiz(int ), (int)113);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl368:
            // 2 sources

            case 7: {
                var15_2 /* !! */  = (int)gi.eejc("eexx", eeiz(int ), (int)114);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl373:
            // 4 sources

            case 8: {
                var15_2 /* !! */  = (int)gi.eejc("eexy", eeiz(int ), (int)115);
                if (!var16_1) ** GOTO lbl359
                throw null;
            }
            case 9: {
                var15_2 /* !! */  = (int)gi.eejc("eexz", eeiz(int ), (int)116);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl382:
            // 2 sources

            case 10: {
                var15_2 /* !! */  = (int)gi.eejc("eeya", eeiz(int ), (int)117);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl406
            }
            case 11: {
                var15_2 /* !! */  = (int)gi.eejc("eeyb", eeiz(int ), (int)118);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl397
            }
lbl392:
            // 2 sources

            case 12: {
                var15_2 /* !! */  = (int)gi.eejc("eeyc", eeiz(int ), (int)119);
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl397:
            // 2 sources

            case 13: {
                do {
                    var15_2 /* !! */  = (int)gi.eejc("eeyd", eeiz(int ), (int)120);
                } while (!var16_1);
                throw null;
            }
lbl402:
            // 2 sources

            case 14: {
                var15_2 /* !! */  = (int)gi.eejc("eeye", eeiz(int ), (int)121);
                if (var16_1) {
                    throw null;
                }
            }
lbl406:
            // 5 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_2 /* !! */  = (int)gi.eejc("eeyf", eeiz(int ), (int)122);
                    if (!var16_1) ** GOTO lbl359
                    throw null;
                }
            }
lbl411:
            // 2 sources

            case 16: {
                var15_2 /* !! */  = (int)gi.eejc("eeyg", eeiz(int ), (int)123);
                if (!var16_1) ** GOTO lbl373
                throw null;
            }
            case 17: {
                var15_2 /* !! */  = (int)gi.eejc("eeyh", eeiz(int ), (int)124);
                if (!var16_1) ** GOTO lbl373
                throw null;
            }
lbl419:
            // 2 sources

            case 18: {
                var15_2 /* !! */  = (int)gi.eejc("eeyi", eeiz(int ), (int)125);
                if (!var16_1) ** GOTO lbl406
                throw null;
            }
            case 19: 
        }
        var15_2 /* !! */  = (int)gi.eejc("eeyj", eeiz(int ), (int)126);
        ** while (!var16_1)
lbl426:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efjg() {
        gi.eejb[0] = -1684529932;
        gi.eejb[1] = 1390231037;
        gi.eejb[2] = -153056840;
        gi.eejb[3] = -158646119;
        gi.eejb[4] = 544710692;
        gi.eejb[5] = 712868127;
        gi.eejb[6] = 23645227;
        gi.eejb[7] = 1357031343;
        gi.eejb[8] = 483361697;
        gi.eejb[9] = -1929525764;
        gi.eejb[10] = -427481454;
        gi.eejb[11] = 1367327372;
        gi.eejb[12] = -26985375;
        gi.eejb[13] = -2143009342;
        gi.eejb[14] = -110058209;
        gi.eejb[15] = 843785235;
        gi.eejb[16] = -982225758;
        gi.eejb[17] = -709521554;
        gi.eejb[18] = 1278324559;
        gi.eejb[19] = -202734185;
        gi.eejb[20] = 1378529823;
        gi.eejb[21] = -195093094;
        gi.eejb[22] = -1172826486;
        gi.eejb[23] = 331514542;
        gi.eejb[24] = 153057671;
        gi.eejb[25] = -1208214611;
        gi.eejb[26] = -372302191;
        gi.eejb[27] = 538208241;
        gi.eejb[28] = -1691814002;
        gi.eejb[29] = 1635049367;
        gi.eejb[30] = 1317576420;
        gi.eejb[31] = -71378619;
        gi.eejb[32] = -1172181116;
        gi.eejb[33] = -438624165;
        gi.eejb[34] = -750166662;
        gi.eejb[35] = 1907101826;
        gi.eejb[36] = 1888390678;
        gi.eejb[37] = -1465797377;
        gi.eejb[38] = -1217765209;
        gi.eejb[39] = 1273464927;
        gi.eejb[40] = 691536623;
        gi.eejb[41] = 1183958648;
        gi.eejb[42] = -670450377;
        gi.eejb[43] = 1035004063;
        gi.eejb[44] = -151549430;
        gi.eejb[45] = -2138291787;
        gi.eejb[46] = 148142673;
        gi.eejb[47] = -1341750454;
        gi.eejb[48] = 2055474520;
        gi.eejb[49] = -1408804978;
        gi.eejb[50] = 150989122;
        gi.eejb[51] = -2064456947;
        gi.eejb[52] = -255625406;
        gi.eejb[53] = -2703112;
        gi.eejb[54] = 98902108;
        gi.eejb[55] = -1175589221;
        gi.eejb[56] = 654691887;
        gi.eejb[57] = 1084127300;
        gi.eejb[58] = -314856795;
        gi.eejb[59] = -97452470;
        gi.eejb[60] = -1709519417;
        gi.eejb[61] = 109215770;
        gi.eejb[62] = 2004519448;
        gi.eejb[63] = 1792772806;
        gi.eejb[64] = 2007602715;
        gi.eejb[65] = 1147116260;
        gi.eejb[66] = -425850704;
        gi.eejb[67] = 1984628716;
        gi.eejb[68] = 42714987;
        gi.eejb[69] = 1973837703;
        gi.eejb[70] = -623709927;
        gi.eejb[71] = -1948008087;
        gi.eejb[72] = 1354681344;
        gi.eejb[73] = 769400996;
        gi.eejb[74] = 1724915370;
        gi.eejb[75] = -1904714336;
        gi.eejb[76] = -1354798280;
        gi.eejb[77] = -777223142;
        gi.eejb[78] = -802908015;
        gi.eejb[79] = 1198008496;
        gi.eejb[80] = -639911065;
        gi.eejb[81] = -149240382;
        gi.eejb[82] = 631997054;
        gi.eejb[83] = 2116192210;
        gi.eejb[84] = -330437344;
        gi.eejb[85] = 777189398;
        gi.eejb[86] = 1537828817;
        gi.eejb[87] = -2018635380;
        gi.eejb[88] = -337287257;
        gi.eejb[89] = 32630974;
        gi.eejb[90] = 1413385764;
        gi.eejb[91] = -576397212;
        gi.eejb[92] = -97636625;
        gi.eejb[93] = -33890144;
        gi.eejb[94] = -104662901;
        gi.eejb[95] = 934957360;
        gi.eejb[96] = -1674418490;
        gi.eejb[97] = -2004142383;
        gi.eejb[98] = -97526154;
        gi.eejb[99] = 1320065881;
    }

    public static /* synthetic */ CallSite eejc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void efje() {
        gi.eeja[100] = 1972764570;
        gi.eeja[101] = 1987894287;
        gi.eeja[102] = 1645388048;
        gi.eeja[103] = -2083576776;
        gi.eeja[104] = 1352404795;
        gi.eeja[105] = -1344185082;
        gi.eeja[106] = 499388308;
        gi.eeja[107] = 940950766;
        gi.eeja[108] = 899665761;
        gi.eeja[109] = -350305264;
        gi.eeja[110] = 287489646;
        gi.eeja[111] = 303548673;
        gi.eeja[112] = -1599647351;
        gi.eeja[113] = -804225503;
        gi.eeja[114] = -1044226733;
        gi.eeja[115] = 1545322134;
        gi.eeja[116] = -2083302189;
        gi.eeja[117] = 1950901753;
        gi.eeja[118] = 1424424273;
        gi.eeja[119] = 56758795;
        gi.eeja[120] = -1859577763;
        gi.eeja[121] = -913288362;
        gi.eeja[122] = -261056092;
        gi.eeja[123] = -1058958356;
        gi.eeja[124] = 84440769;
        gi.eeja[125] = -1073528254;
        gi.eeja[126] = -466188347;
        gi.eeja[127] = -198706390;
        gi.eeja[128] = -674838404;
        gi.eeja[129] = 1529498223;
        gi.eeja[130] = -1865064883;
        gi.eeja[131] = 506380340;
        gi.eeja[132] = -1259745786;
        gi.eeja[133] = -2028330347;
        gi.eeja[134] = 1585605712;
        gi.eeja[135] = 1687648675;
        gi.eeja[136] = 132455895;
        gi.eeja[137] = 1894250904;
        gi.eeja[138] = 859785266;
        gi.eeja[139] = -1030686120;
        gi.eeja[140] = 1656370324;
        gi.eeja[141] = -192237479;
        gi.eeja[142] = 1008113728;
        gi.eeja[143] = -465727357;
        gi.eeja[144] = 274648505;
        gi.eeja[145] = -478363249;
        gi.eeja[146] = 350047699;
        gi.eeja[147] = -1073429488;
        gi.eeja[148] = -2094747279;
        gi.eeja[149] = -574732039;
        gi.eeja[150] = -932382743;
        gi.eeja[151] = -606361439;
        gi.eeja[152] = -1250433981;
        gi.eeja[153] = 1448352736;
        gi.eeja[154] = -1978877772;
        gi.eeja[155] = 1602438499;
        gi.eeja[156] = 674522759;
        gi.eeja[157] = -509548253;
        gi.eeja[158] = -129941122;
        gi.eeja[159] = -878478747;
        gi.eeja[160] = -1729156775;
        gi.eeja[161] = -1351795264;
        gi.eeja[162] = -300986288;
        gi.eeja[163] = -602760008;
        gi.eeja[164] = 1347967814;
        gi.eeja[165] = -331386485;
        gi.eeja[166] = 1394436124;
        gi.eeja[167] = -2098862831;
        gi.eeja[168] = -63281489;
        gi.eeja[169] = -1725051161;
        gi.eeja[170] = -1110030026;
        gi.eeja[171] = -554738124;
        gi.eeja[172] = 316118459;
        gi.eeja[173] = -1838162206;
        gi.eeja[174] = -1474051659;
        gi.eeja[175] = 1556759102;
        gi.eeja[176] = -51005199;
        gi.eeja[177] = 685734631;
        gi.eeja[178] = -1144861040;
        gi.eeja[179] = 1050990711;
        gi.eeja[180] = 948132080;
        gi.eeja[181] = 1347408926;
        gi.eeja[182] = -1319989270;
        gi.eeja[183] = 2083830766;
        gi.eeja[184] = 677628722;
        gi.eeja[185] = 972640112;
        gi.eeja[186] = -1651381282;
        gi.eeja[187] = 1964334687;
        gi.eeja[188] = -860295454;
        gi.eeja[189] = -1882468957;
        gi.eeja[190] = -327012098;
        gi.eeja[191] = 2043583607;
        gi.eeja[192] = 233769442;
        gi.eeja[193] = -478429075;
        gi.eeja[194] = -614397337;
        gi.eeja[195] = 814247119;
        gi.eeja[196] = -280659951;
        gi.eeja[197] = 310424046;
        gi.eeja[198] = 48916516;
        gi.eeja[199] = -1220744709;
    }

    private static /* synthetic */ long eejo(int n2) {
        return eejp[n2] ^ eejq[n2];
    }

    static {
        eeja = new int[284];
        eejb = new int[284];
        gi.efjd();
        gi.efje();
        gi.efjf();
        gi.efjg();
        gi.efjh();
        gi.efji();
        eejp = new long[257];
        eejq = new long[257];
        gi.efjj();
        gi.efjk();
        gi.efjy();
        gi.efke();
        gi.efkn();
        gi.eflc();
    }

    private static /* synthetic */ void efjy() {
        gi.eejp[200] = -4011045718421730791L;
        gi.eejp[201] = -4653478780439793561L;
        gi.eejp[202] = -2734754507561184310L;
        gi.eejp[203] = -6160765435491510810L;
        gi.eejp[204] = -2975446089759828201L;
        gi.eejp[205] = -7526209438362257047L;
        gi.eejp[206] = -4301795490567195767L;
        gi.eejp[207] = 8074878607858297264L;
        gi.eejp[208] = 5823360953296112212L;
        gi.eejp[209] = -7536905930877570875L;
        gi.eejp[210] = -2756687488104926123L;
        gi.eejp[211] = 6148124720894229543L;
        gi.eejp[212] = 8027317007275238800L;
        gi.eejp[213] = -7811367716748864189L;
        gi.eejp[214] = 5143807035559391351L;
        gi.eejp[215] = 1595742321563420940L;
        gi.eejp[216] = -3587336028677911289L;
        gi.eejp[217] = 7643416485207136397L;
        gi.eejp[218] = 6764414009896768631L;
        gi.eejp[219] = -7281363267308862650L;
        gi.eejp[220] = 3480358686424902514L;
        gi.eejp[221] = 8089581545421176507L;
        gi.eejp[222] = -7502025867184471062L;
        gi.eejp[223] = 4489875713559355696L;
        gi.eejp[224] = -7489167689648807385L;
        gi.eejp[225] = 2455240798447674670L;
        gi.eejp[226] = -8740728357414823478L;
        gi.eejp[227] = -9001143352930226377L;
        gi.eejp[228] = 5574179960205719333L;
        gi.eejp[229] = -4462650312707322203L;
        gi.eejp[230] = 4476310564783777561L;
        gi.eejp[231] = -3255584305628452911L;
        gi.eejp[232] = 7982599335403289103L;
        gi.eejp[233] = 1107662415149348797L;
        gi.eejp[234] = -889318446666142017L;
        gi.eejp[235] = -8258624987045817370L;
        gi.eejp[236] = 6826479024901861596L;
        gi.eejp[237] = 7968785917250343050L;
        gi.eejp[238] = 5804486148226866708L;
        gi.eejp[239] = -2189253870340762721L;
        gi.eejp[240] = 2648203314510045131L;
        gi.eejp[241] = -7552892847273027109L;
        gi.eejp[242] = -5156105353789211883L;
        gi.eejp[243] = -3804107947167168354L;
        gi.eejp[244] = -4013774986335953504L;
        gi.eejp[245] = 2402192248563328508L;
        gi.eejp[246] = -6984802697126845055L;
        gi.eejp[247] = -7183165557590584973L;
        gi.eejp[248] = -4071747918440593050L;
        gi.eejp[249] = -1159369429624022061L;
        gi.eejp[250] = 2232266399911963632L;
        gi.eejp[251] = 3943352479482522547L;
        gi.eejp[252] = -6366408300997506993L;
        gi.eejp[253] = 5154541890597748219L;
        gi.eejp[254] = -4569802111949372666L;
        gi.eejp[255] = 8226051174759940500L;
        gi.eejp[256] = 7440609585055377247L;
    }

    private static /* synthetic */ int eeiz(int n2) {
        return eeja[n2] ^ eejb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block169: {
            block168: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gi.kl - gi.eejc("eejr", eejo(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gi.eejc("eejs", eeiz(int ), (int)10)) break;
                    v0 /* !! */  = (long)gi.eejc("eejt", eeiz(int ), (int)11);
                }
                var4_2 = gi.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = gi.kl - gi.eejc("eeju", eejo(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gi.eejc("eejv", eeiz(int ), (int)12)) break;
                    v1 /* !! */  = (long)gi.eejc("eejw", eeiz(int ), (int)13);
                }
                var3_3 /* !! */  = gi.b;
                v2 /* !! */  = gi.kl;
                if (true) ** GOTO lbl17
                block107: while (true) {
                    v2 /* !! */  = (long)(v3 - gi.eejc("eejx", eejo(int ), (int)2));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1683783589: {
                            v3 = gi.eejc("eejy", eejo(int ), (int)3);
                            continue block107;
                        }
                        case 446756061: {
                            v3 = gi.eejc("eejz", eejo(int ), (int)4);
                            continue block107;
                        }
                        case 966093411: {
                            break block107;
                        }
                        case 1941782676: {
                            v3 = gi.eejc("eeka", eejo(int ), (int)5);
                            continue block107;
                        }
                    }
                    break;
                }
                var2_4 = gi.a;
                if (var4_2) {
                    throw null;
lbl32:
                    // 17 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                v4 /* !! */  = gi.kl;
                if (true) ** GOTO lbl39
                block109: while (true) {
                    v4 /* !! */  = (long)(v5 - gi.eejc("eekb", eejo(int ), (int)6));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 187915414: {
                            v5 = gi.eejc("eekc", eejo(int ), (int)7);
                            continue block109;
                        }
                        case 295745179: {
                            v5 = gi.eejc("eekd", eejo(int ), (int)8);
                            continue block109;
                        }
                        case 672641179: {
                            v5 = gi.eejc("eeke", eejo(int ), (int)9);
                            continue block109;
                        }
                        case 966093411: {
                            break block109;
                        }
                    }
                    break;
                }
                v6 /* !! */  = gi.kl;
                if (true) ** GOTO lbl55
                block110: while (true) {
                    v6 /* !! */  = (long)(v7 - gi.eejc("eekf", eejo(int ), (int)10));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 888345655: {
                            v7 = gi.eejc("eekg", eejo(int ), (int)11);
                            continue block110;
                        }
                        case 966093411: {
                            break block110;
                        }
                        case 967748766: {
                            v7 = gi.eejc("eekh", eejo(int ), (int)12);
                            continue block110;
                        }
                    }
                    break;
                }
                if (gi.mc.field_1724 == null) break block168;
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = gi.kl - gi.eejc("eeki", eejo(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gi.eejc("eekj", eeiz(int ), (int)14)) break;
                    v8 /* !! */  = (long)gi.eejc("eekk", eeiz(int ), (int)15);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = gi.kl - gi.eejc("eekl", eejo(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gi.eejc("eekm", eeiz(int ), (int)16)) break;
                    v9 /* !! */  = (long)gi.eejc("eekn", eeiz(int ), (int)17);
                }
                if (gi.mc.field_1687 != null) break block169;
                if (var2_4) ** GOTO lbl32
            }
            if (var2_4 || var2_4) ** GOTO lbl32
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v10 /* !! */  = gi.kl;
        if (true) ** GOTO lbl87
        block113: while (true) {
            v10 /* !! */  = (long)(gi.eejc("eekp", eejo(int ), (int)16) - gi.eejc("eeko", eejo(int ), (int)15));
lbl87:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1225115251: {
                    continue block113;
                }
                case 966093411: {
                    break block113;
                }
            }
            break;
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = gi.kl - gi.eejc("eekq", eejo(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gi.eejc("eekr", eeiz(int ), (int)18)) break;
            v11 /* !! */  = (long)gi.eejc("eeks", eeiz(int ), (int)19);
        }
        if (!this.modeSetting.isSelected("FunTime")) ** GOTO lbl300
        if (var2_4) ** GOTO lbl32
        v12 /* !! */  = gi.kl;
        if (true) ** GOTO lbl103
        block115: while (true) {
            v12 /* !! */  = (long)(v13 - gi.eejc("eekt", eejo(int ), (int)18));
lbl103:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 93104670: {
                    v13 = gi.eejc("eeku", eejo(int ), (int)19);
                    continue block115;
                }
                case 966093411: {
                    break block115;
                }
                case 1461346465: {
                    v13 = gi.eejc("eekv", eejo(int ), (int)20);
                    continue block115;
                }
            }
            break;
        }
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = gi.kl - gi.eejc("eekw", eejo(int ), (int)21)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gi.eejc("eekx", eeiz(int ), (int)20)) break;
            v14 /* !! */  = (long)gi.eejc("eeky", eeiz(int ), (int)21);
        }
        v15 = gi.mc.field_1724;
        v16 /* !! */  = gi.kl;
        if (true) ** GOTO lbl122
        block117: while (true) {
            v16 /* !! */  = (long)(v17 - gi.eejc("eekz", eejo(int ), (int)22));
lbl122:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case 372080480: {
                    v17 = gi.eejc("eela", eejo(int ), (int)23);
                    continue block117;
                }
                case 966093411: {
                    break block117;
                }
                case 1225971876: {
                    v17 = gi.eejc("eelb", eejo(int ), (int)24);
                    continue block117;
                }
                case 2092873741: {
                    v17 = gi.eejc("eelc", eejo(int ), (int)25);
                    continue block117;
                }
            }
            break;
        }
        if (!v15.method_5681()) ** GOTO lbl300
        if (var2_4) ** GOTO lbl32
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = gi.kl - gi.eejc("eeld", eejo(int ), (int)26)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == gi.eejc("eele", eeiz(int ), (int)22)) break;
            v18 /* !! */  = (long)gi.eejc("eelf", eeiz(int ), (int)23);
        }
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_7 = gi.kl - gi.eejc("eelg", eejo(int ), (int)27)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == gi.eejc("eelh", eeiz(int ), (int)24)) break;
            v19 /* !! */  = (long)gi.eejc("eeli", eeiz(int ), (int)25);
        }
        v20 = gi.mc.field_1724;
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = gi.kl - gi.eejc("eelj", eejo(int ), (int)28)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == gi.eejc("eelk", eeiz(int ), (int)26)) break;
            v21 /* !! */  = (long)gi.eejc("eell", eeiz(int ), (int)27);
        }
        if (!v20.method_24828()) ** GOTO lbl300
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_9 = gi.kl - gi.eejc("eels", eejo(int ), (int)29)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == gi.eejc("eelt", eeiz(int ), (int)28)) break;
            v22 /* !! */  = (long)gi.eejc("eelu", eeiz(int ), (int)29);
        }
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_10 = gi.kl - gi.eejc("eelv", eejo(int ), (int)30)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == gi.eejc("eelw", eeiz(int ), (int)30)) break;
            v23 /* !! */  = (long)gi.eejc("eelx", eeiz(int ), (int)31);
        }
        v24 = gi.mc.field_1724;
        v25 /* !! */  = gi.kl;
        if (true) ** GOTO lbl169
        block123: while (true) {
            v25 /* !! */  = (long)(gi.eejc("eemb", eejo(int ), (int)32) - gi.eejc("eely", eejo(int ), (int)31));
lbl169:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -2129077699: {
                    continue block123;
                }
                case 966093411: {
                    break block123;
                }
            }
            break;
        }
        v24.method_6043();
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                v26 /* !! */  = gi.kl;
                if (true) ** GOTO lbl184
                block124: while (true) {
                    v26 /* !! */  = (long)(v27 - gi.eejc("eemd", eejo(int ), (int)33));
lbl184:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1724054015: {
                            v27 = gi.eejc("eemf", eejo(int ), (int)34);
                            continue block124;
                        }
                        case -349270965: {
                            v27 = gi.eejc("eemh", eejo(int ), (int)35);
                            continue block124;
                        }
                        case 966093411: {
                            break block124;
                        }
                    }
                    break;
                }
                v28 /* !! */  = gi.kl;
                if (true) ** GOTO lbl197
                block125: while (true) {
                    v28 /* !! */  = (long)(v29 - gi.eejc("eemj", eejo(int ), (int)36));
lbl197:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -2071339953: {
                            v29 = gi.eejc("eemk", eejo(int ), (int)37);
                            continue block125;
                        }
                        case -685497564: {
                            v29 = gi.eejc("eemm", eejo(int ), (int)38);
                            continue block125;
                        }
                        case 966093411: {
                            break block125;
                        }
                    }
                    break;
                }
                v30 = gi.mc.field_1724;
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_11 = gi.kl - gi.eejc("eemp", eejo(int ), (int)39)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gi.eejc("eems", eeiz(int ), (int)32)) break;
                    v31 /* !! */  = (long)gi.eejc("eemu", eeiz(int ), (int)33);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_12 = gi.kl - gi.eejc("eemw", eejo(int ), (int)40)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == gi.eejc("eemx", eeiz(int ), (int)34)) break;
                    v32 /* !! */  = (long)gi.eejc("eemz", eeiz(int ), (int)35);
                }
                v33 = gi.mc.field_1724;
                v34 /* !! */  = gi.kl;
                if (true) ** GOTO lbl222
                block128: while (true) {
                    v34 /* !! */  = (long)(v35 - gi.eejc("eenb", eejo(int ), (int)41));
lbl222:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case 546408661: {
                            v35 = gi.eejc("eene", eejo(int ), (int)42);
                            continue block128;
                        }
                        case 966093411: {
                            break block128;
                        }
                        case 1873492429: {
                            v35 = gi.eejc("eeng", eejo(int ), (int)43);
                            continue block128;
                        }
                    }
                    break;
                }
                v36 = v33.method_18798();
                v37 /* !! */  = gi.kl;
                if (true) ** GOTO lbl236
                block129: while (true) {
                    v37 /* !! */  = (long)(v38 - gi.eejc("eenj", eejo(int ), (int)44));
lbl236:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -395908475: {
                            v38 = gi.eejc("eenl", eejo(int ), (int)45);
                            continue block129;
                        }
                        case 966093411: {
                            break block129;
                        }
                        case 1991156381: {
                            v38 = gi.eejc("eenm", eejo(int ), (int)46);
                            continue block129;
                        }
                    }
                    break;
                }
                v39 = v36.field_1352;
                v40 = gi.eejc("eenu", eent(int ), (int)47);
                v41 /* !! */  = gi.kl;
                if (true) ** GOTO lbl251
                block130: while (true) {
                    v41 /* !! */  = (long)(v42 - gi.eejc("eenv", eejo(int ), (int)48));
lbl251:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1438560002: {
                            v42 = gi.eejc("eenw", eejo(int ), (int)49);
                            continue block130;
                        }
                        case -1274789122: {
                            v42 = gi.eejc("eenz", eejo(int ), (int)50);
                            continue block130;
                        }
                        case 519034593: {
                            v42 = gi.eejc("eeoe", eejo(int ), (int)51);
                            continue block130;
                        }
                        case 966093411: {
                            break block130;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_13 = gi.kl - gi.eejc("eeof", eejo(int ), (int)52)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == gi.eejc("eeoh", eeiz(int ), (int)36)) break;
                    v43 /* !! */  = (long)gi.eejc("eeoi", eeiz(int ), (int)37);
                }
                v44 = gi.mc.field_1724;
                v45 /* !! */  = gi.kl;
                if (true) ** GOTO lbl273
                block132: while (true) {
                    v45 /* !! */  = (long)(v46 - gi.eejc("eeoj", eejo(int ), (int)53));
lbl273:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case 575169114: {
                            v46 = gi.eejc("eeok", eejo(int ), (int)54);
                            continue block132;
                        }
                        case 577546058: {
                            v46 = gi.eejc("eeoq", eejo(int ), (int)55);
                            continue block132;
                        }
                        case 966093411: {
                            break block132;
                        }
                    }
                    break;
                }
                v47 = v44.method_18798();
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_14 = gi.kl - gi.eejc("eeor", eejo(int ), (int)56)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == gi.eejc("eeos", eeiz(int ), (int)38)) break;
                    v48 /* !! */  = (long)gi.eejc("eeot", eeiz(int ), (int)39);
                }
                v49 = v47.field_1350;
                v50 /* !! */  = gi.kl;
                if (true) ** GOTO lbl293
                block134: while (true) {
                    v50 /* !! */  = (long)(gi.eejc("eeov", eejo(int ), (int)58) - gi.eejc("eeou", eejo(int ), (int)57));
lbl293:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case 966093411: {
                            break block134;
                        }
                        case 1269759026: {
                            continue block134;
                        }
                    }
                    break;
                }
                v30.method_18800(v39, (double)v40, v49);
                if (var2_4) ** GOTO lbl32
lbl300:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_15 = gi.kl - gi.eejc("eeox", eejo(int ), (int)59)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == gi.eejc("eepc", eeiz(int ), (int)40)) break;
                    v51 /* !! */  = (long)gi.eejc("eepe", eeiz(int ), (int)41);
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_16 = gi.kl - gi.eejc("eepg", eejo(int ), (int)60)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == gi.eejc("eeph", eeiz(int ), (int)42)) break;
                    v52 /* !! */  = (long)gi.eejc("eepi", eeiz(int ), (int)43);
                }
                if (!this.iceBoost.isValue()) ** GOTO lbl353
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_17 = gi.kl - gi.eejc("eepj", eejo(int ), (int)61)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == gi.eejc("eepk", eeiz(int ), (int)44)) break;
                    v53 /* !! */  = (long)gi.eejc("eepo", eeiz(int ), (int)45);
                }
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_18 = gi.kl - gi.eejc("eepq", eejo(int ), (int)62)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == gi.eejc("eepr", eeiz(int ), (int)46)) break;
                    v54 /* !! */  = (long)gi.eejc("eept", eeiz(int ), (int)47);
                }
                v55 = gi.mc.field_1724;
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_19 = gi.kl - gi.eejc("eepu", eejo(int ), (int)63)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == gi.eejc("eepx", eeiz(int ), (int)48)) break;
                    v56 /* !! */  = (long)gi.eejc("eepz", eeiz(int ), (int)49);
                }
                if (!v55.method_5681()) ** GOTO lbl353
                if (var2_4) ** GOTO lbl32
                v57 /* !! */  = gi.kl;
                if (true) ** GOTO lbl335
                block140: while (true) {
                    v57 /* !! */  = (long)(v58 - gi.eejc("eeqc", eejo(int ), (int)64));
lbl335:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -1246558357: {
                            v58 = gi.eejc("eeqd", eejo(int ), (int)65);
                            continue block140;
                        }
                        case 718933906: {
                            v58 = gi.eejc("eeqe", eejo(int ), (int)66);
                            continue block140;
                        }
                        case 966093411: {
                            break block140;
                        }
                    }
                    break;
                }
                if (!this.isHeadUnderIce()) ** GOTO lbl353
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v59 /* !! */  = (cfr_temp_20 = gi.kl - gi.eejc("eeqg", eejo(int ), (int)67)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v59 /* !! */  == gi.eejc("eeqh", eeiz(int ), (int)50)) break;
                    v59 /* !! */  = (long)gi.eejc("eeqn", eeiz(int ), (int)51);
                }
                this.applyIceBoost();
                if (var2_4) ** GOTO lbl32
lbl353:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl356:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gi.eejc("eeqq", eeiz(int ), (int)52);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl401
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)gi.eejc("eeqr", eeiz(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 2: {
                var3_3 /* !! */  = (int)gi.eejc("eeqs", eeiz(int ), (int)54);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl469
            }
lbl372:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gi.eejc("eeqv", eeiz(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl377:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gi.eejc("eeqx", eeiz(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl382:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gi.eejc("eeqy", eeiz(int ), (int)57);
                if (!var4_2) ** GOTO lbl372
                throw null;
            }
lbl386:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)gi.eejc("eerc", eeiz(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl391:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)gi.eejc("eerd", eeiz(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl396:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gi.eejc("eere", eeiz(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl465
            }
lbl401:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)gi.eejc("eerf", eeiz(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 10: {
                do {
                    var3_3 /* !! */  = (int)gi.eejc("eerg", eeiz(int ), (int)62);
                } while (!var4_2);
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gi.eejc("eerh", eeiz(int ), (int)63);
                if (!var4_2) ** GOTO lbl396
                throw null;
            }
lbl415:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)gi.eejc("eerk", eeiz(int ), (int)64);
                if (!var4_2) ** GOTO lbl377
                throw null;
            }
lbl419:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)gi.eejc("eero", eeiz(int ), (int)65);
                if (!var4_2) ** GOTO lbl391
                throw null;
            }
lbl423:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)gi.eejc("eerq", eeiz(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl453
            }
            case 15: {
                var3_3 /* !! */  = (int)gi.eejc("eers", eeiz(int ), (int)67);
                if (!var4_2) ** GOTO lbl386
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)gi.eejc("eerw", eeiz(int ), (int)68);
                if (var4_2) {
                    throw null;
                }
            }
            case 17: {
                var3_3 /* !! */  = (int)gi.eejc("eerz", eeiz(int ), (int)69);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl445
            }
            case 18: {
                var3_3 /* !! */  = (int)gi.eejc("eesa", eeiz(int ), (int)70);
                if (!var4_2) ** GOTO lbl386
                throw null;
            }
lbl445:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)gi.eejc("eesb", eeiz(int ), (int)71);
                if (!var4_2) ** GOTO lbl415
                throw null;
            }
lbl449:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)gi.eejc("eesi", eeiz(int ), (int)72);
                if (!var4_2) ** GOTO lbl382
                throw null;
            }
lbl453:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)gi.eejc("eesj", eeiz(int ), (int)73);
                if (!var4_2) ** GOTO lbl382
                throw null;
            }
            case 22: {
                var3_3 /* !! */  = (int)gi.eejc("eesk", eeiz(int ), (int)74);
                if (!var4_2) ** GOTO lbl445
                throw null;
            }
            case 23: {
                var3_3 /* !! */  = (int)gi.eejc("eesl", eeiz(int ), (int)75);
                if (!var4_2) ** GOTO lbl449
                throw null;
            }
lbl465:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)gi.eejc("eesn", eeiz(int ), (int)76);
                if (!var4_2) ** GOTO lbl356
                throw null;
            }
lbl469:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)gi.eejc("eeso", eeiz(int ), (int)77);
                if (!var4_2) ** GOTO lbl453
                throw null;
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)gi.eejc("eesr", eeiz(int ), (int)78);
        ** while (!var4_2)
lbl476:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efjj() {
        gi.eejp[0] = 3051074418676726121L;
        gi.eejp[1] = 5331493747991221906L;
        gi.eejp[2] = 6072100357183457226L;
        gi.eejp[3] = 6622854028652096457L;
        gi.eejp[4] = -3843773955987614849L;
        gi.eejp[5] = 1978028190633120604L;
        gi.eejp[6] = -714812654670593906L;
        gi.eejp[7] = -642865692441987962L;
        gi.eejp[8] = -3237055894047328557L;
        gi.eejp[9] = -4104710369705154714L;
        gi.eejp[10] = -6303480410666993619L;
        gi.eejp[11] = -3645746937267902575L;
        gi.eejp[12] = 5254378378767910803L;
        gi.eejp[13] = -5711380272115839987L;
        gi.eejp[14] = -3801072019927781274L;
        gi.eejp[15] = -6873151778260943272L;
        gi.eejp[16] = -1012331156064259136L;
        gi.eejp[17] = 4597465904288731474L;
        gi.eejp[18] = 8644775306497827354L;
        gi.eejp[19] = 3049166561432499835L;
        gi.eejp[20] = -3973244634506762919L;
        gi.eejp[21] = -7842737610076399542L;
        gi.eejp[22] = -1592697497047164164L;
        gi.eejp[23] = 7593734298208910658L;
        gi.eejp[24] = 5757787567139405959L;
        gi.eejp[25] = 1286551462518678356L;
        gi.eejp[26] = 1900026627452471613L;
        gi.eejp[27] = 1205217681675791818L;
        gi.eejp[28] = -2986610033089613002L;
        gi.eejp[29] = -8164358172705059051L;
        gi.eejp[30] = -3438340015574715236L;
        gi.eejp[31] = 8342582757544459833L;
        gi.eejp[32] = -4653549302570522661L;
        gi.eejp[33] = -5163547684644354598L;
        gi.eejp[34] = -6402569880303579660L;
        gi.eejp[35] = -6210382972582797687L;
        gi.eejp[36] = 6836686488165154724L;
        gi.eejp[37] = 3255450298094362939L;
        gi.eejp[38] = -641082443679111110L;
        gi.eejp[39] = 5879697749723831020L;
        gi.eejp[40] = -5323823310057983973L;
        gi.eejp[41] = 4119439231551590717L;
        gi.eejp[42] = 6040440854993598972L;
        gi.eejp[43] = -7801066823108227383L;
        gi.eejp[44] = 1136092736187909106L;
        gi.eejp[45] = -7995155897801248776L;
        gi.eejp[46] = 7464583438922405833L;
        gi.eejp[47] = -9166730077678970475L;
        gi.eejp[48] = -4137474754076121141L;
        gi.eejp[49] = -3716165881032259410L;
        gi.eejp[50] = 504504785518773857L;
        gi.eejp[51] = -7010906998785568004L;
        gi.eejp[52] = -3732228774176081387L;
        gi.eejp[53] = 6017854534749938565L;
        gi.eejp[54] = 7125647431151538789L;
        gi.eejp[55] = -7135617172375460788L;
        gi.eejp[56] = 6748162440333262191L;
        gi.eejp[57] = -3363074339263349129L;
        gi.eejp[58] = 1754392111821486141L;
        gi.eejp[59] = 6392854230833050081L;
        gi.eejp[60] = -6580357424235483297L;
        gi.eejp[61] = -169641756286503414L;
        gi.eejp[62] = 6056586452387044349L;
        gi.eejp[63] = -5434303759912600885L;
        gi.eejp[64] = 4687056035977747165L;
        gi.eejp[65] = -2444935611096517903L;
        gi.eejp[66] = -5365957910172932321L;
        gi.eejp[67] = 4983656863690850829L;
        gi.eejp[68] = 6932509292910198479L;
        gi.eejp[69] = -2863529411884760196L;
        gi.eejp[70] = 5766059188604515771L;
        gi.eejp[71] = -1517438136408030114L;
        gi.eejp[72] = -7868966788338709305L;
        gi.eejp[73] = 1683425918183464182L;
        gi.eejp[74] = -1924681638325823402L;
        gi.eejp[75] = 8255073713461817287L;
        gi.eejp[76] = -2343334702697730690L;
        gi.eejp[77] = 7745951422041117355L;
        gi.eejp[78] = -4015781189375975389L;
        gi.eejp[79] = 8013063198369942217L;
        gi.eejp[80] = 7701358267024221638L;
        gi.eejp[81] = 2500963169432267931L;
        gi.eejp[82] = 2636724191024497039L;
        gi.eejp[83] = -3522506841938689130L;
        gi.eejp[84] = 4609832067998384049L;
        gi.eejp[85] = 8356036678038889850L;
        gi.eejp[86] = 7500057933001528560L;
        gi.eejp[87] = 1139823451276567628L;
        gi.eejp[88] = 1963004007033410160L;
        gi.eejp[89] = 1667161339826882892L;
        gi.eejp[90] = 3516321647008310730L;
        gi.eejp[91] = -4790831622443822945L;
        gi.eejp[92] = -3023675129475007989L;
        gi.eejp[93] = 4229679476806638564L;
        gi.eejp[94] = -7846972348300004859L;
        gi.eejp[95] = 7096146375096679135L;
        gi.eejp[96] = 5582379720995593669L;
        gi.eejp[97] = 6387606631034621700L;
        gi.eejp[98] = -8760813173299571390L;
        gi.eejp[99] = -5163913125181609644L;
    }

    private static /* synthetic */ void efjf() {
        gi.eeja[200] = 2113527217;
        gi.eeja[201] = -360570238;
        gi.eeja[202] = 1377157176;
        gi.eeja[203] = -628474650;
        gi.eeja[204] = 2135486707;
        gi.eeja[205] = -1709579963;
        gi.eeja[206] = 1602621605;
        gi.eeja[207] = 1247423396;
        gi.eeja[208] = -767578870;
        gi.eeja[209] = 782320139;
        gi.eeja[210] = -89670267;
        gi.eeja[211] = -324185917;
        gi.eeja[212] = -1680210691;
        gi.eeja[213] = -349120839;
        gi.eeja[214] = -2100455509;
        gi.eeja[215] = 389299736;
        gi.eeja[216] = -916936521;
        gi.eeja[217] = -313488157;
        gi.eeja[218] = 1850346481;
        gi.eeja[219] = -499052437;
        gi.eeja[220] = -446582578;
        gi.eeja[221] = -1018144681;
        gi.eeja[222] = 458587965;
        gi.eeja[223] = 121648968;
        gi.eeja[224] = 1972880539;
        gi.eeja[225] = 488622588;
        gi.eeja[226] = 369990660;
        gi.eeja[227] = -359697094;
        gi.eeja[228] = -791104352;
        gi.eeja[229] = 217921606;
        gi.eeja[230] = -1650235857;
        gi.eeja[231] = -394896508;
        gi.eeja[232] = -1419806063;
        gi.eeja[233] = -1212456523;
        gi.eeja[234] = 1574380902;
        gi.eeja[235] = -1619802190;
        gi.eeja[236] = -1722755377;
        gi.eeja[237] = 1457955930;
        gi.eeja[238] = -1673625668;
        gi.eeja[239] = 1665671765;
        gi.eeja[240] = -319227306;
        gi.eeja[241] = -402573390;
        gi.eeja[242] = -1547545786;
        gi.eeja[243] = -329487670;
        gi.eeja[244] = -1082919287;
        gi.eeja[245] = 1436550898;
        gi.eeja[246] = -108583036;
        gi.eeja[247] = -1566422496;
        gi.eeja[248] = 925290300;
        gi.eeja[249] = 1291754967;
        gi.eeja[250] = 325171521;
        gi.eeja[251] = -146432581;
        gi.eeja[252] = 1419648224;
        gi.eeja[253] = -156905176;
        gi.eeja[254] = 2120758186;
        gi.eeja[255] = 786579659;
        gi.eeja[256] = 153802826;
        gi.eeja[257] = -1751592794;
        gi.eeja[258] = -619518659;
        gi.eeja[259] = 1104692254;
        gi.eeja[260] = 1991462095;
        gi.eeja[261] = 654178299;
        gi.eeja[262] = 529187529;
        gi.eeja[263] = -991679771;
        gi.eeja[264] = 2012255179;
        gi.eeja[265] = 2008136793;
        gi.eeja[266] = 1809418499;
        gi.eeja[267] = 887028073;
        gi.eeja[268] = 703742418;
        gi.eeja[269] = 296574999;
        gi.eeja[270] = 1996465057;
        gi.eeja[271] = 516513276;
        gi.eeja[272] = -1201259678;
        gi.eeja[273] = -1525570196;
        gi.eeja[274] = 332306519;
        gi.eeja[275] = 2030503526;
        gi.eeja[276] = 272915276;
        gi.eeja[277] = 1273196555;
        gi.eeja[278] = 515123219;
        gi.eeja[279] = -2107894099;
        gi.eeja[280] = 345358844;
        gi.eeja[281] = 1462831389;
        gi.eeja[282] = 40088969;
        gi.eeja[283] = -365236864;
    }

    private static /* synthetic */ void efji() {
        gi.eejb[200] = -2113527218;
        gi.eejb[201] = -360570237;
        gi.eejb[202] = 1377157176;
        gi.eejb[203] = -628474650;
        gi.eejb[204] = 2135486706;
        gi.eejb[205] = -1709579963;
        gi.eejb[206] = 1602621628;
        gi.eejb[207] = 1247423419;
        gi.eejb[208] = -767578876;
        gi.eejb[209] = 782320169;
        gi.eejb[210] = -89670252;
        gi.eejb[211] = -324185895;
        gi.eejb[212] = -1680210692;
        gi.eejb[213] = -349120837;
        gi.eejb[214] = -2100455502;
        gi.eejb[215] = 389299740;
        gi.eejb[216] = -916936516;
        gi.eejb[217] = -313488135;
        gi.eejb[218] = 1850346467;
        gi.eejb[219] = -499052448;
        gi.eejb[220] = -446582592;
        gi.eejb[221] = -1018144642;
        gi.eejb[222] = 458587936;
        gi.eejb[223] = 121648967;
        gi.eejb[224] = 1972880531;
        gi.eejb[225] = 488622562;
        gi.eejb[226] = 369990691;
        gi.eejb[227] = -359697095;
        gi.eejb[228] = -791104380;
        gi.eejb[229] = 217921631;
        gi.eejb[230] = -1650235843;
        gi.eejb[231] = -394896468;
        gi.eejb[232] = -1419806055;
        gi.eejb[233] = -1212456520;
        gi.eejb[234] = 1574380902;
        gi.eejb[235] = -1619802203;
        gi.eejb[236] = -1722755388;
        gi.eejb[237] = 1457955925;
        gi.eejb[238] = -1673625707;
        gi.eejb[239] = 1665671805;
        gi.eejb[240] = -319227308;
        gi.eejb[241] = -402573390;
        gi.eejb[242] = -1547545774;
        gi.eejb[243] = -329487640;
        gi.eejb[244] = -1082919250;
        gi.eejb[245] = 1436550906;
        gi.eejb[246] = -108583032;
        gi.eejb[247] = -1566422477;
        gi.eejb[248] = 925290301;
        gi.eejb[249] = 104567276;
        gi.eejb[250] = -325171522;
        gi.eejb[251] = -1263289108;
        gi.eejb[252] = 1419648225;
        gi.eejb[253] = 156905175;
        gi.eejb[254] = -1211861803;
        gi.eejb[255] = 786579658;
        gi.eejb[256] = 14858727;
        gi.eejb[257] = 1751592793;
        gi.eejb[258] = 1142001252;
        gi.eejb[259] = 1104692255;
        gi.eejb[260] = -2126906436;
        gi.eejb[261] = 654178298;
        gi.eejb[262] = 529187529;
        gi.eejb[263] = -991679765;
        gi.eejb[264] = 2012255175;
        gi.eejb[265] = 2008136793;
        gi.eejb[266] = 1809418496;
        gi.eejb[267] = 887028072;
        gi.eejb[268] = 703742424;
        gi.eejb[269] = 296574997;
        gi.eejb[270] = 1996465058;
        gi.eejb[271] = 516513279;
        gi.eejb[272] = -1201259679;
        gi.eejb[273] = -1525570194;
        gi.eejb[274] = 332306519;
        gi.eejb[275] = 2030503525;
        gi.eejb[276] = 272915275;
        gi.eejb[277] = 1273196546;
        gi.eejb[278] = 515123218;
        gi.eejb[279] = 972448200;
        gi.eejb[280] = 345358847;
        gi.eejb[281] = 1462831390;
        gi.eejb[282] = 40088969;
        gi.eejb[283] = -365236863;
    }

    private static /* synthetic */ double eent(int n2) {
        return Double.longBitsToDouble(eejp[n2] ^ eejq[n2]);
    }

    private static /* synthetic */ void efkn() {
        gi.eejq[100] = -415854031935109946L;
        gi.eejq[101] = -3245587262978118195L;
        gi.eejq[102] = -5676078950485042446L;
        gi.eejq[103] = -5875513853908613168L;
        gi.eejq[104] = -6926270469271211059L;
        gi.eejq[105] = 6147498387347850895L;
        gi.eejq[106] = -2997888892697250171L;
        gi.eejq[107] = 5560421563068025018L;
        gi.eejq[108] = -5626889450487347564L;
        gi.eejq[109] = 1638728070407449901L;
        gi.eejq[110] = 7578214529375941465L;
        gi.eejq[111] = -5273787492194345303L;
        gi.eejq[112] = -8422296409297351452L;
        gi.eejq[113] = -6967951545907269103L;
        gi.eejq[114] = 7129777267658849320L;
        gi.eejq[115] = -5539380226623542313L;
        gi.eejq[116] = 4380053884363210737L;
        gi.eejq[117] = -7303879774385755679L;
        gi.eejq[118] = 2999577941030450270L;
        gi.eejq[119] = 6064297129291712308L;
        gi.eejq[120] = -5693945152576510187L;
        gi.eejq[121] = 5856394563919360004L;
        gi.eejq[122] = -4148738586573043269L;
        gi.eejq[123] = 7632472890358536078L;
        gi.eejq[124] = 6370969850709580168L;
        gi.eejq[125] = 7023909853918493435L;
        gi.eejq[126] = 9164945315503577095L;
        gi.eejq[127] = -8418518250080816402L;
        gi.eejq[128] = 8441852440779273005L;
        gi.eejq[129] = -2445365000934106451L;
        gi.eejq[130] = -4809639368057869127L;
        gi.eejq[131] = -6620371858807482742L;
        gi.eejq[132] = 5096905043235939133L;
        gi.eejq[133] = 6502775831151535176L;
        gi.eejq[134] = -7361789665243784741L;
        gi.eejq[135] = -4136521067608892593L;
        gi.eejq[136] = -4571100121933099662L;
        gi.eejq[137] = 6591899840102554839L;
        gi.eejq[138] = -2047481793759049627L;
        gi.eejq[139] = -9200626159812770086L;
        gi.eejq[140] = 736948290882982242L;
        gi.eejq[141] = 4743442166974157526L;
        gi.eejq[142] = -8832885165932674712L;
        gi.eejq[143] = 2913025153325790284L;
        gi.eejq[144] = -8629803744855968155L;
        gi.eejq[145] = -814862911732982190L;
        gi.eejq[146] = 6694211283165136198L;
        gi.eejq[147] = 7408606479591216344L;
        gi.eejq[148] = -4897573101021839406L;
        gi.eejq[149] = -1543037448708017242L;
        gi.eejq[150] = 8462422983275980380L;
        gi.eejq[151] = 5679147825087065560L;
        gi.eejq[152] = -3812347476491111989L;
        gi.eejq[153] = -1939136149250590303L;
        gi.eejq[154] = -3210828073420501467L;
        gi.eejq[155] = 8187186283878399471L;
        gi.eejq[156] = -7953731401174414175L;
        gi.eejq[157] = 3456704121124538028L;
        gi.eejq[158] = 908083778844838950L;
        gi.eejq[159] = -8839698414747385803L;
        gi.eejq[160] = -8159611979394531047L;
        gi.eejq[161] = 6961507440940771929L;
        gi.eejq[162] = 7818848431336452634L;
        gi.eejq[163] = -4759632347316556308L;
        gi.eejq[164] = -7910792565507614566L;
        gi.eejq[165] = 7594331547456315831L;
        gi.eejq[166] = -2957996444112228103L;
        gi.eejq[167] = -2109571545743562064L;
        gi.eejq[168] = 3549245345450424272L;
        gi.eejq[169] = -8108599821309088918L;
        gi.eejq[170] = 3544996226814126218L;
        gi.eejq[171] = 1867202504098510542L;
        gi.eejq[172] = -6944774225198149319L;
        gi.eejq[173] = 4934214091530959371L;
        gi.eejq[174] = 8241477476347695014L;
        gi.eejq[175] = 5275906269642625482L;
        gi.eejq[176] = 3601789925226040234L;
        gi.eejq[177] = -8567099257020563802L;
        gi.eejq[178] = -6509018164997766469L;
        gi.eejq[179] = 5681034004794993883L;
        gi.eejq[180] = -1132725128964998967L;
        gi.eejq[181] = 8734853162337289020L;
        gi.eejq[182] = -958193150621834678L;
        gi.eejq[183] = 4753365033831263594L;
        gi.eejq[184] = -6914558470366504045L;
        gi.eejq[185] = 818554107570279746L;
        gi.eejq[186] = 3768061893378163050L;
        gi.eejq[187] = 3586374604602441623L;
        gi.eejq[188] = -3378661490356584744L;
        gi.eejq[189] = -4655033024513718906L;
        gi.eejq[190] = -6818547542910346310L;
        gi.eejq[191] = -1136520435991196014L;
        gi.eejq[192] = 2195404357538236871L;
        gi.eejq[193] = 3726808667718062797L;
        gi.eejq[194] = 4956664812939059755L;
        gi.eejq[195] = -576925116693298676L;
        gi.eejq[196] = 7347354677233902987L;
        gi.eejq[197] = 2253974622206358959L;
        gi.eejq[198] = 8335667129418719601L;
        gi.eejq[199] = -1628786432221813019L;
    }

    private static /* synthetic */ void eflc() {
        gi.eejq[200] = 4643761556334054549L;
        gi.eejq[201] = 6715311456260442593L;
        gi.eejq[202] = 2595354808576555801L;
        gi.eejq[203] = -9194628595427686477L;
        gi.eejq[204] = -6255919471807646166L;
        gi.eejq[205] = 1864542363653597830L;
        gi.eejq[206] = -1608025538852558886L;
        gi.eejq[207] = 5493656188640451133L;
        gi.eejq[208] = 6000138080426393104L;
        gi.eejq[209] = -2219682668311086461L;
        gi.eejq[210] = -929298769547982657L;
        gi.eejq[211] = -4264609552575801825L;
        gi.eejq[212] = -615431134374204532L;
        gi.eejq[213] = -6038244122154389816L;
        gi.eejq[214] = 2929268916060243729L;
        gi.eejq[215] = 5893481977010967660L;
        gi.eejq[216] = 1641964466334012194L;
        gi.eejq[217] = 1099995964984048124L;
        gi.eejq[218] = -4021043503621943630L;
        gi.eejq[219] = 6496633946496991104L;
        gi.eejq[220] = -2318312467548774854L;
        gi.eejq[221] = -5196622649385020946L;
        gi.eejq[222] = -1852029897031435828L;
        gi.eejq[223] = -7934517205305755636L;
        gi.eejq[224] = 8897646981639109895L;
        gi.eejq[225] = 7268626853028164382L;
        gi.eejq[226] = -5963885784974709448L;
        gi.eejq[227] = 5291374486469890731L;
        gi.eejq[228] = -7367266459683997883L;
        gi.eejq[229] = -8709722940850594133L;
        gi.eejq[230] = -6764104494297191551L;
        gi.eejq[231] = -3096482990999683391L;
        gi.eejq[232] = 4691782510171093817L;
        gi.eejq[233] = -3471697474824408478L;
        gi.eejq[234] = -5106215109692460340L;
        gi.eejq[235] = 7247835485510135447L;
        gi.eejq[236] = -6835319339265681947L;
        gi.eejq[237] = -592333735632626896L;
        gi.eejq[238] = 3938106140468702161L;
        gi.eejq[239] = 1764365492972828144L;
        gi.eejq[240] = 8154686658952115871L;
        gi.eejq[241] = 1776763177140507236L;
        gi.eejq[242] = -2808648631284842701L;
        gi.eejq[243] = -2335169834671473030L;
        gi.eejq[244] = -8553816583734897550L;
        gi.eejq[245] = 557202330159776393L;
        gi.eejq[246] = -2076902642758386106L;
        gi.eejq[247] = 3019330516292088270L;
        gi.eejq[248] = 9199777582178111501L;
        gi.eejq[249] = 7469733636374029624L;
        gi.eejq[250] = -728538246794465681L;
        gi.eejq[251] = 3099309416595374473L;
        gi.eejq[252] = 4909839973594612503L;
        gi.eejq[253] = -1653892796378670506L;
        gi.eejq[254] = 4095827841459116118L;
        gi.eejq[255] = -4442103354328537774L;
        gi.eejq[256] = 3041630734382903956L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isHeadUnderIce() {
        block88: {
            block87: {
                var9_1 = gi.c;
                var8_2 /* !! */  = gi.b;
                var7_3 = gi.a;
                if (var9_1) {
                    throw null;
lbl6:
                    // 23 sources

                    return (boolean)gi.eejc("efeh", eeiz(int ), (int)194);
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                if (gi.mc.field_1724 == null) break block87;
                if (var7_3) ** GOTO lbl6
                if (gi.mc.field_1687 != null) break block88;
                if (var7_3) ** GOTO lbl6
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            return (boolean)gi.eejc("efei", eeiz(int ), (int)195);
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var1_4 = gi.mc.field_1724.method_24515().method_10086((int)gi.eejc("efej", eeiz(int ), (int)196));
        if (var7_3 || var7_3) ** GOTO lbl6
        var2_5 = gi.mc.field_1724.method_24515().method_10086((int)gi.eejc("efek", eeiz(int ), (int)197));
        if (var7_3 || var7_3) ** GOTO lbl6
        var3_6 = gi.eejc("efel", eeiz(int ), (int)198);
        if (var7_3) ** GOTO lbl6
        block45: while (true) {
            if (var7_3 || var7_3) ** GOTO lbl6
            if (var3_6 > gi.eejc("efem", eeiz(int ), (int)199)) ** GOTO lbl59
            if (var7_3 || var7_3) ** GOTO lbl6
            var4_7 = gi.eejc("efen", eeiz(int ), (int)200);
            if (var7_3) ** GOTO lbl6
            block46: while (true) {
                block90: {
                    block89: {
                        if (var7_3 || var7_3) ** GOTO lbl6
                        if (var4_7 > gi.eejc("efeo", eeiz(int ), (int)201)) ** GOTO lbl54
                        if (var7_3 || var7_3) ** GOTO lbl6
                        var5_8 = var1_4.method_10069((int)var3_6, (int)gi.eejc("efep", eeiz(int ), (int)202), (int)var4_7);
                        if (var7_3 || var7_3) ** GOTO lbl6
                        var6_9 = var2_5.method_10069((int)var3_6, (int)gi.eejc("efeq", eeiz(int ), (int)203), (int)var4_7);
                        if (var7_3 || var7_3) ** GOTO lbl6
                        if (this.isIceBlock(var5_8)) break block89;
                        if (var7_3) ** GOTO lbl6
                        if (!this.isIceBlock(var6_9)) break block90;
                        if (var7_3) ** GOTO lbl6
                    }
                    if (var7_3 || var7_3) ** GOTO lbl6
                    return (boolean)gi.eejc("efer", eeiz(int ), (int)204);
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
                switch (var8_2 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        ++var4_7;
                        if (var7_3) ** GOTO lbl6
                        if (!var9_1) continue block46;
                        throw null;
                    }
lbl54:
                    // 1 sources

                    if (var7_3 || var7_3) ** GOTO lbl6
                    ++var3_6;
                    if (var7_3) ** GOTO lbl6
                    if (!var9_1) continue block45;
                    throw null;
lbl59:
                    // 1 sources

                    if (!var7_3 && !var7_3) ** break;
                    ** continue;
                    return (boolean)gi.eejc("efes", eeiz(int ), (int)205);
lbl62:
                    // 3 sources

                    case 0: {
                        var8_2 /* !! */  = (int)gi.eejc("efet", eeiz(int ), (int)206);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl183
                    }
lbl67:
                    // 2 sources

                    case 1: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var8_2 /* !! */  = (int)gi.eejc("efeu", eeiz(int ), (int)207);
                            if (var9_1) {
                                throw null;
                            }
                            ** GOTO lbl243
                            break;
                        }
                    }
lbl73:
                    // 2 sources

                    case 2: {
                        var8_2 /* !! */  = (int)gi.eejc("efev", eeiz(int ), (int)208);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl128
                    }
                    case 3: {
                        var8_2 /* !! */  = (int)gi.eejc("efew", eeiz(int ), (int)209);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl160
                    }
lbl83:
                    // 2 sources

                    case 4: {
                        var8_2 /* !! */  = (int)gi.eejc("efex", eeiz(int ), (int)210);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl98
                    }
                    case 5: {
                        var8_2 /* !! */  = (int)gi.eejc("efey", eeiz(int ), (int)211);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl235
                    }
                    case 6: {
                        var8_2 /* !! */  = (int)gi.eejc("efez", eeiz(int ), (int)212);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl123
                    }
lbl98:
                    // 2 sources

                    case 7: {
                        var8_2 /* !! */  = (int)gi.eejc("effa", eeiz(int ), (int)213);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl213
                    }
                    case 8: {
                        var8_2 /* !! */  = (int)gi.eejc("effb", eeiz(int ), (int)214);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl209
                    }
                    case 9: {
                        var8_2 /* !! */  = (int)gi.eejc("effc", eeiz(int ), (int)215);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl123
                    }
lbl113:
                    // 2 sources

                    case 10: {
                        var8_2 /* !! */  = (int)gi.eejc("effd", eeiz(int ), (int)216);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl146
                    }
lbl118:
                    // 3 sources

                    case 11: {
                        var8_2 /* !! */  = (int)gi.eejc("effe", eeiz(int ), (int)217);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl132
                    }
lbl123:
                    // 4 sources

                    case 12: {
                        var8_2 /* !! */  = (int)gi.eejc("efff", eeiz(int ), (int)218);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl183
                    }
lbl128:
                    // 4 sources

                    case 13: {
                        var8_2 /* !! */  = (int)gi.eejc("effg", eeiz(int ), (int)219);
                        if (!var9_1) ** GOTO lbl67
                        throw null;
                    }
lbl132:
                    // 2 sources

                    case 14: {
                        var8_2 /* !! */  = (int)gi.eejc("effh", eeiz(int ), (int)220);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl142
                    }
                    case 15: {
                        var8_2 /* !! */  = (int)gi.eejc("effi", eeiz(int ), (int)221);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl205
                    }
lbl142:
                    // 2 sources

                    case 16: {
                        var8_2 /* !! */  = (int)gi.eejc("effj", eeiz(int ), (int)222);
                        if (!var9_1) ** GOTO lbl128
                        throw null;
                    }
lbl146:
                    // 2 sources

                    case 17: {
                        var8_2 /* !! */  = (int)gi.eejc("effk", eeiz(int ), (int)223);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl192
                    }
                    case 18: {
                        var8_2 /* !! */  = (int)gi.eejc("effl", eeiz(int ), (int)224);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl192
                    }
                    case 19: {
                        var8_2 /* !! */  = (int)gi.eejc("effm", eeiz(int ), (int)225);
                        if (var9_1) {
                            throw null;
                        }
                    }
lbl160:
                    // 4 sources

                    case 20: {
                        var8_2 /* !! */  = (int)gi.eejc("effn", eeiz(int ), (int)226);
                        if (!var9_1) ** GOTO lbl113
                        throw null;
                    }
                    case 21: {
                        var8_2 /* !! */  = (int)gi.eejc("effo", eeiz(int ), (int)227);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl213
                    }
lbl169:
                    // 2 sources

                    case 22: {
                        var8_2 /* !! */  = (int)gi.eejc("effp", eeiz(int ), (int)228);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl188
                    }
                    case 23: {
                        var8_2 /* !! */  = (int)gi.eejc("effq", eeiz(int ), (int)229);
                        if (!var9_1) ** GOTO lbl83
                        throw null;
                    }
lbl178:
                    // 2 sources

                    case 24: {
                        var8_2 /* !! */  = (int)gi.eejc("effr", eeiz(int ), (int)230);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl213
                    }
lbl183:
                    // 3 sources

                    case 25: {
                        var8_2 /* !! */  = (int)gi.eejc("effs", eeiz(int ), (int)231);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl247
                    }
lbl188:
                    // 3 sources

                    case 26: {
                        var8_2 /* !! */  = (int)gi.eejc("efft", eeiz(int ), (int)232);
                        if (!var9_1) ** GOTO lbl62
                        throw null;
                    }
lbl192:
                    // 3 sources

                    case 27: {
                        var8_2 /* !! */  = (int)gi.eejc("effu", eeiz(int ), (int)233);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl235
                    }
                    case 28: {
                        var8_2 /* !! */  = (int)gi.eejc("effv", eeiz(int ), (int)234);
                        if (!var9_1) ** GOTO lbl188
                        throw null;
                    }
                    case 29: {
                        var8_2 /* !! */  = (int)gi.eejc("effw", eeiz(int ), (int)235);
                        if (!var9_1) ** GOTO lbl128
                        throw null;
                    }
lbl205:
                    // 2 sources

                    case 30: {
                        var8_2 /* !! */  = (int)gi.eejc("effx", eeiz(int ), (int)236);
                        if (!var9_1) ** GOTO lbl73
                        throw null;
                    }
lbl209:
                    // 2 sources

                    case 31: {
                        var8_2 /* !! */  = (int)gi.eejc("effy", eeiz(int ), (int)237);
                        if (!var9_1) ** GOTO lbl118
                        throw null;
                    }
lbl213:
                    // 4 sources

                    case 32: {
                        var8_2 /* !! */  = (int)gi.eejc("effz", eeiz(int ), (int)238);
                        if (!var9_1) ** GOTO lbl178
                        throw null;
                    }
                    case 33: {
                        var8_2 /* !! */  = (int)gi.eejc("efga", eeiz(int ), (int)239);
                        if (!var9_1) ** GOTO lbl169
                        throw null;
                    }
lbl221:
                    // 2 sources

                    case 34: {
                        var8_2 /* !! */  = (int)gi.eejc("efgb", eeiz(int ), (int)240);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl235
                    }
                    case 35: {
                        do {
                            var8_2 /* !! */  = (int)gi.eejc("efgc", eeiz(int ), (int)241);
                        } while (!var9_1);
                        throw null;
                    }
                    case 36: {
                        var8_2 /* !! */  = (int)gi.eejc("efgd", eeiz(int ), (int)242);
                        if (!var9_1) ** GOTO lbl62
                        throw null;
                    }
lbl235:
                    // 4 sources

                    case 37: {
                        var8_2 /* !! */  = (int)gi.eejc("efge", eeiz(int ), (int)243);
                        if (!var9_1) ** GOTO lbl221
                        throw null;
                    }
                    case 38: {
                        var8_2 /* !! */  = (int)gi.eejc("efgf", eeiz(int ), (int)244);
                        if (!var9_1) ** GOTO lbl123
                        throw null;
                    }
lbl243:
                    // 2 sources

                    case 39: {
                        var8_2 /* !! */  = (int)gi.eejc("efgg", eeiz(int ), (int)245);
                        if (!var9_1) ** GOTO lbl118
                        throw null;
                    }
lbl247:
                    // 2 sources

                    case 40: {
                        do {
                            var8_2 /* !! */  = (int)gi.eejc("efgh", eeiz(int ), (int)246);
                        } while (!var9_1);
                        throw null;
                    }
                    case 41: 
                }
                break;
            }
            break;
        }
        var8_2 /* !! */  = (int)gi.eejc("efgi", eeiz(int ), (int)247);
        ** while (!var9_1)
lbl255:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efjh() {
        gi.eejb[100] = 59550644;
        gi.eejb[101] = 1987894286;
        gi.eejb[102] = -1820216595;
        gi.eejb[103] = -2083576775;
        gi.eejb[104] = -575318728;
        gi.eejb[105] = -1344185081;
        gi.eejb[106] = 230444634;
        gi.eejb[107] = 940950764;
        gi.eejb[108] = 899665767;
        gi.eejb[109] = -350305280;
        gi.eejb[110] = 287489636;
        gi.eejb[111] = 303548683;
        gi.eejb[112] = -1599647358;
        gi.eejb[113] = -804225494;
        gi.eejb[114] = -1044226724;
        gi.eejb[115] = 1545322142;
        gi.eejb[116] = -2083302184;
        gi.eejb[117] = 1950901751;
        gi.eejb[118] = 1424424273;
        gi.eejb[119] = 56758794;
        gi.eejb[120] = -1859577761;
        gi.eejb[121] = -913288354;
        gi.eejb[122] = -261056081;
        gi.eejb[123] = -1058958362;
        gi.eejb[124] = 84440782;
        gi.eejb[125] = -1073528249;
        gi.eejb[126] = -466188332;
        gi.eejb[127] = -198706389;
        gi.eejb[128] = 1846844642;
        gi.eejb[129] = -1529498224;
        gi.eejb[130] = -1910082003;
        gi.eejb[131] = -506380341;
        gi.eejb[132] = -735020889;
        gi.eejb[133] = 2028330346;
        gi.eejb[134] = 1092000709;
        gi.eejb[135] = 1687648681;
        gi.eejb[136] = 132455891;
        gi.eejb[137] = 1894250898;
        gi.eejb[138] = 859785278;
        gi.eejb[139] = -1030686115;
        gi.eejb[140] = 1656370324;
        gi.eejb[141] = -192237478;
        gi.eejb[142] = 1008113743;
        gi.eejb[143] = -465727357;
        gi.eejb[144] = 274648501;
        gi.eejb[145] = -478363262;
        gi.eejb[146] = 350047705;
        gi.eejb[147] = -1073429481;
        gi.eejb[148] = -2094747265;
        gi.eejb[149] = -574732044;
        gi.eejb[150] = -932382740;
        gi.eejb[151] = -1712346975;
        gi.eejb[152] = -1250433982;
        gi.eejb[153] = -364867844;
        gi.eejb[154] = -1257457484;
        gi.eejb[155] = -1602438500;
        gi.eejb[156] = -3418188;
        gi.eejb[157] = 509548252;
        gi.eejb[158] = -199012302;
        gi.eejb[159] = 878478746;
        gi.eejb[160] = 331681138;
        gi.eejb[161] = -1351795263;
        gi.eejb[162] = -215333031;
        gi.eejb[163] = -602760007;
        gi.eejb[164] = 535386502;
        gi.eejb[165] = -331386486;
        gi.eejb[166] = -1647761837;
        gi.eejb[167] = -2098862820;
        gi.eejb[168] = -63281491;
        gi.eejb[169] = -1725051160;
        gi.eejb[170] = -1110030022;
        gi.eejb[171] = -554738131;
        gi.eejb[172] = 316118441;
        gi.eejb[173] = -1838162201;
        gi.eejb[174] = -1474051656;
        gi.eejb[175] = 1556759103;
        gi.eejb[176] = -51005208;
        gi.eejb[177] = 685734653;
        gi.eejb[178] = -1144861025;
        gi.eejb[179] = 1050990689;
        gi.eejb[180] = 948132092;
        gi.eejb[181] = 1347408914;
        gi.eejb[182] = -1319989270;
        gi.eejb[183] = 2083830781;
        gi.eejb[184] = 677628731;
        gi.eejb[185] = 972640098;
        gi.eejb[186] = -1651381302;
        gi.eejb[187] = 1964334686;
        gi.eejb[188] = -860295433;
        gi.eejb[189] = -1882468952;
        gi.eejb[190] = -327012098;
        gi.eejb[191] = 2043583601;
        gi.eejb[192] = 233769458;
        gi.eejb[193] = -478429064;
        gi.eejb[194] = -614397337;
        gi.eejb[195] = 814247119;
        gi.eejb[196] = -280659952;
        gi.eejb[197] = 310424044;
        gi.eejb[198] = -48916517;
        gi.eejb[199] = -1220744710;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void processSwimmingBoost(dc var1_1) {
        block187: {
            v0 /* !! */  = gi.kl;
            if (true) ** GOTO lbl5
            block121: while (true) {
                v0 /* !! */  = (long)(v1 - gi.eejc("efac", eejo(int ), (int)155));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -433668548: {
                        v1 = gi.eejc("efad", eejo(int ), (int)156);
                        continue block121;
                    }
                    case 265264233: {
                        v1 = gi.eejc("efae", eejo(int ), (int)157);
                        continue block121;
                    }
                    case 831801886: {
                        v1 = gi.eejc("efaf", eejo(int ), (int)158);
                        continue block121;
                    }
                    case 966093411: {
                        break block121;
                    }
                }
                break;
            }
            var6_2 = gi.c;
            v2 /* !! */  = gi.kl;
            if (true) ** GOTO lbl22
            block122: while (true) {
                v2 /* !! */  = (long)(v3 - gi.eejc("efag", eejo(int ), (int)159));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1630008132: {
                        v3 = gi.eejc("efah", eejo(int ), (int)160);
                        continue block122;
                    }
                    case -1456092518: {
                        v3 = gi.eejc("efai", eejo(int ), (int)161);
                        continue block122;
                    }
                    case -866801113: {
                        v3 = gi.eejc("efaj", eejo(int ), (int)162);
                        continue block122;
                    }
                    case 966093411: {
                        break block122;
                    }
                }
                break;
            }
            var5_3 /* !! */  = gi.b;
            v4 /* !! */  = gi.kl;
            if (true) ** GOTO lbl39
            block123: while (true) {
                v4 /* !! */  = (long)(v5 - gi.eejc("efak", eejo(int ), (int)163));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2136219528: {
                        v5 = gi.eejc("efal", eejo(int ), (int)164);
                        continue block123;
                    }
                    case 269687930: {
                        v5 = gi.eejc("efam", eejo(int ), (int)165);
                        continue block123;
                    }
                    case 428930248: {
                        v5 = gi.eejc("efan", eejo(int ), (int)166);
                        continue block123;
                    }
                    case 966093411: {
                        break block123;
                    }
                }
                break;
            }
            var4_4 = gi.a;
            if (var6_2) {
                throw null;
            }
            if (var4_4 || var4_4) return;
            v6 /* !! */  = gi.kl;
            if (true) ** GOTO lbl59
            block124: while (true) {
                v6 /* !! */  = (long)(v7 - gi.eejc("efao", eejo(int ), (int)167));
lbl59:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 709511378: {
                        v7 = gi.eejc("efap", eejo(int ), (int)168);
                        continue block124;
                    }
                    case 834492507: {
                        v7 = gi.eejc("efaq", eejo(int ), (int)169);
                        continue block124;
                    }
                    case 966093411: {
                        break block124;
                    }
                }
                break;
            }
            v8 /* !! */  = gi.kl;
            block125: while (true) {
                switch ((int)v8 /* !! */ ) {
                    case 966093411: {
                        break block125;
                    }
                    case 1153913459: {
                        v8 /* !! */  = (long)(gi.eejc("efas", eejo(int ), (int)171) - gi.eejc("efar", eejo(int ), (int)170));
                        continue block125;
                    }
                }
                break;
            }
            v9 = gi.mc.field_1690;
            v10 /* !! */  = gi.kl;
            if (true) ** GOTO lbl81
            block126: while (true) {
                v10 /* !! */  = (long)(v11 - gi.eejc("efat", eejo(int ), (int)172));
lbl81:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1276344574: {
                        v11 = gi.eejc("efau", eejo(int ), (int)173);
                        continue block126;
                    }
                    case 924466528: {
                        v11 = gi.eejc("efav", eejo(int ), (int)174);
                        continue block126;
                    }
                    case 966093411: {
                        break block126;
                    }
                    case 1274646850: {
                        v11 = gi.eejc("efaw", eejo(int ), (int)175);
                        continue block126;
                    }
                }
                break;
            }
            v12 = v9.field_1903;
            v13 /* !! */  = gi.kl;
            if (true) ** GOTO lbl98
            block127: while (true) {
                v13 /* !! */  = (long)(v14 - gi.eejc("efax", eejo(int ), (int)176));
lbl98:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1718396807: {
                        v14 = gi.eejc("efay", eejo(int ), (int)177);
                        continue block127;
                    }
                    case -82844553: {
                        v14 = gi.eejc("efaz", eejo(int ), (int)178);
                        continue block127;
                    }
                    case 966093411: {
                        break block127;
                    }
                    case 1147417607: {
                        v14 = gi.eejc("efba", eejo(int ), (int)179);
                        continue block127;
                    }
                }
                break;
            }
            if (!v12.method_1434()) break block187;
            if (var4_4 || var4_4) return;
            v15 /* !! */  = gi.kl;
            if (true) ** GOTO lbl116
            block128: while (true) {
                v15 /* !! */  = (long)(v16 - gi.eejc("efbb", eejo(int ), (int)180));
lbl116:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 151028228: {
                        v16 = gi.eejc("efbc", eejo(int ), (int)181);
                        continue block128;
                    }
                    case 294449028: {
                        v16 = gi.eejc("efbd", eejo(int ), (int)182);
                        continue block128;
                    }
                    case 966093411: {
                        break block128;
                    }
                }
                break;
            }
            v17 /* !! */  = gi.kl;
            if (true) ** GOTO lbl129
            block129: while (true) {
                v17 /* !! */  = (long)(v18 - gi.eejc("efbe", eejo(int ), (int)183));
lbl129:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -443652984: {
                        v18 = gi.eejc("efbf", eejo(int ), (int)184);
                        continue block129;
                    }
                    case -47920518: {
                        v18 = gi.eejc("efbg", eejo(int ), (int)185);
                        continue block129;
                    }
                    case 966093411: {
                        break block129;
                    }
                    case 1506643873: {
                        v18 = gi.eejc("efbh", eejo(int ), (int)186);
                        continue block129;
                    }
                }
                break;
            }
            v19 = ot.INSTANCE.getRotation();
            v20 /* !! */  = gi.kl;
            block130: while (true) {
                switch ((int)v20 /* !! */ ) {
                    case 61585452: {
                        v20 /* !! */  = (long)(gi.eejc("efbj", eejo(int ), (int)188) - gi.eejc("efbi", eejo(int ), (int)187));
                        continue block130;
                    }
                    case 966093411: {
                        break block130;
                    }
                }
                break;
            }
            var2_5 = v19.getPitch();
            if (var4_4 || var4_4) return;
            if (!(var2_5 >= 0.0f)) {
                if (var4_4 || var4_4) return;
                v21 /* !! */  = gi.eejc("efbo", eeje(int ), (int)154);
            } else {
                if (var4_4) return;
                v22 = var2_5 / gi.eejc("efbk", eeje(int ), (int)151);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_1 = gi.kl - gi.eejc("efbl", eejo(int ), (int)189)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == gi.eejc("efbm", eeiz(int ), (int)152)) {
                        v21 /* !! */  = (CallSite)class_3532.method_15363((float)v22, (float)1.0f, (float)2.0f);
                        if (var6_2) {
                            throw null;
                        }
                        break;
                    }
                    v23 /* !! */  = (long)gi.eejc("efbn", eeiz(int ), (int)153);
                }
            }
            var3_6 = v21 /* !! */ ;
            if (var4_4 || var4_4) return;
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_2 = gi.kl - gi.eejc("efbp", eejo(int ), (int)190)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == gi.eejc("efbq", eeiz(int ), (int)155)) break;
                v24 /* !! */  = (long)gi.eejc("efbr", eeiz(int ), (int)156);
            }
            v25 = var1_1.getVector();
            v26 = gi.eejc("efbs", eent(int ), (int)191) * (double)var3_6;
            while (true) {
                if ((v27 /* !! */  = (cfr_temp_3 = gi.kl - gi.eejc("efbt", eejo(int ), (int)192)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v27 /* !! */  == gi.eejc("efbu", eeiz(int ), (int)157)) {
                    v25.field_1351 = (double)v26;
                    if (var4_4) return;
                    break;
                }
                v27 /* !! */  = (long)gi.eejc("efbv", eeiz(int ), (int)158);
            }
        }
        if (var4_4 || var4_4) return;
        v28 /* !! */  = gi.kl;
        if (true) ** GOTO lbl190
        block134: while (true) {
            v28 /* !! */  = (long)(v29 - gi.eejc("efbw", eejo(int ), (int)193));
lbl190:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case 442903018: {
                    v29 = gi.eejc("efbx", eejo(int ), (int)194);
                    continue block134;
                }
                case 966093411: {
                    break block134;
                }
                case 1466810940: {
                    v29 = gi.eejc("efby", eejo(int ), (int)195);
                    continue block134;
                }
                case 2140000332: {
                    v29 = gi.eejc("efbz", eejo(int ), (int)196);
                    continue block134;
                }
            }
            break;
        }
        while (true) {
            block188: {
                if ((v30 /* !! */  = (cfr_temp_4 = gi.kl - gi.eejc("efca", eejo(int ), (int)197)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  != gi.eejc("efcb", eeiz(int ), (int)159)) break block188;
                if (this.iceBoost.isValue()) {
                    break;
                }
                ** GOTO lbl331
            }
            v30 /* !! */  = (long)gi.eejc("efcc", eeiz(int ), (int)160);
        }
        if (var4_4) return;
        v31 /* !! */  = gi.kl;
        if (true) ** GOTO lbl216
        block136: while (true) {
            v31 /* !! */  = (long)(v32 - gi.eejc("efcd", eejo(int ), (int)198));
lbl216:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -1384443358: {
                    v32 = gi.eejc("efce", eejo(int ), (int)199);
                    continue block136;
                }
                case -819736264: {
                    v32 = gi.eejc("efcf", eejo(int ), (int)200);
                    continue block136;
                }
                case 966093411: {
                    break block136;
                }
            }
            break;
        }
        if (!this.isHeadUnderIce()) ** GOTO lbl331
        if (var4_4 || var4_4) return;
        v33 /* !! */  = gi.kl;
        if (true) ** GOTO lbl231
        block137: while (true) {
            v33 /* !! */  = (long)(v34 - gi.eejc("efcg", eejo(int ), (int)201));
lbl231:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case 489604954: {
                    v34 = gi.eejc("efch", eejo(int ), (int)202);
                    continue block137;
                }
                case 932307154: {
                    v34 = gi.eejc("efci", eejo(int ), (int)203);
                    continue block137;
                }
                case 966093411: {
                    break block137;
                }
                case 1443613048: {
                    v34 = gi.eejc("efcj", eejo(int ), (int)204);
                    continue block137;
                }
            }
            break;
        }
        v35 /* !! */  = gi.kl;
        if (true) ** GOTO lbl247
        block138: while (true) {
            v35 /* !! */  = (long)(v36 - gi.eejc("efck", eejo(int ), (int)205));
lbl247:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -887791857: {
                    v36 = gi.eejc("efcl", eejo(int ), (int)206);
                    continue block138;
                }
                case -502894750: {
                    v36 = gi.eejc("efcm", eejo(int ), (int)207);
                    continue block138;
                }
                case -192846207: {
                    v36 = gi.eejc("efcn", eejo(int ), (int)208);
                    continue block138;
                }
                case 966093411: {
                    break block138;
                }
            }
            break;
        }
        var2_5 = this.iceBoostSpeed.getValue();
        if (var4_4 || var4_4) return;
        v37 /* !! */  = gi.kl;
        block139: while (true) {
            switch ((int)v37 /* !! */ ) {
                case -866776870: {
                    v37 /* !! */  = (long)(gi.eejc("efcp", eejo(int ), (int)210) - gi.eejc("efco", eejo(int ), (int)209));
                    continue block139;
                }
                case 966093411: {
                    break block139;
                }
            }
            break;
        }
        v38 = var1_1.getVector();
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_5 = gi.kl - gi.eejc("efcq", eejo(int ), (int)211)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == gi.eejc("efcr", eeiz(int ), (int)161)) break;
            v39 /* !! */  = (long)gi.eejc("efcs", eeiz(int ), (int)162);
        }
        v40 = v38.field_1352 * (double)var2_5;
        while (true) {
            if ((v41 /* !! */  = (cfr_temp_6 = gi.kl - gi.eejc("efct", eejo(int ), (int)212)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v41 /* !! */  == gi.eejc("efcu", eeiz(int ), (int)163)) {
                v38.field_1352 = v40;
                if (var4_4) return;
                break;
            }
            v41 /* !! */  = (long)gi.eejc("efcv", eeiz(int ), (int)164);
        }
        if (var4_4) return;
        v42 /* !! */  = gi.kl;
        if (true) ** GOTO lbl289
        block142: while (true) {
            v42 /* !! */  = (long)(v43 - gi.eejc("efcw", eejo(int ), (int)213));
lbl289:
            // 2 sources

            switch ((int)v42 /* !! */ ) {
                case -814472473: {
                    v43 = gi.eejc("efcx", eejo(int ), (int)214);
                    continue block142;
                }
                case 966093411: {
                    break block142;
                }
                case 1404849708: {
                    v43 = gi.eejc("efcy", eejo(int ), (int)215);
                    continue block142;
                }
                case 1699247562: {
                    v43 = gi.eejc("efcz", eejo(int ), (int)216);
                    continue block142;
                }
            }
            break;
        }
        v44 = var1_1.getVector();
        v45 /* !! */  = gi.kl;
        if (true) ** GOTO lbl306
        block143: while (true) {
            v45 /* !! */  = (long)(v46 - gi.eejc("efda", eejo(int ), (int)217));
lbl306:
            // 2 sources

            switch ((int)v45 /* !! */ ) {
                case -1855221766: {
                    v46 = gi.eejc("efdb", eejo(int ), (int)218);
                    continue block143;
                }
                case -1686781945: {
                    v46 = gi.eejc("efdc", eejo(int ), (int)219);
                    continue block143;
                }
                case 966093411: {
                    break block143;
                }
            }
            break;
        }
        v47 = v44.field_1350 * (double)var2_5;
        while (true) {
            block189: {
                if ((v48 /* !! */  = (cfr_temp_7 = gi.kl - gi.eejc("efdd", eejo(int ), (int)220)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v48 /* !! */  != gi.eejc("efde", eeiz(int ), (int)165)) break block189;
                v44.field_1350 = v47;
                if (var5_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v48 /* !! */  = (long)gi.eejc("efdf", eeiz(int ), (int)166);
        }
        cfr_temp_0 = -2147483648;
        block145: while (true) {
            block190: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4) return;
lbl331:
                        // 3 sources

                        if (!var4_4 && !var4_4) return;
                        return;
                    }
                    case 0: {
                        var5_3 /* !! */  = (int)gi.eejc("efdg", eeiz(int ), (int)167);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)gi.eejc("efdj", eeiz(int ), (int)170);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)gi.eejc("efdk", eeiz(int ), (int)171);
                        cfr_temp_0 = 12;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 5: {
                        var5_3 /* !! */  = (int)gi.eejc("efdl", eeiz(int ), (int)172);
                        cfr_temp_0 = 7;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)gi.eejc("efdm", eeiz(int ), (int)173);
                        cfr_temp_0 = 21;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)gi.eejc("efdq", eeiz(int ), (int)177);
                        cfr_temp_0 = 24;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 12: {
                        ** GOTO lbl425
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)gi.eejc("efdw", eeiz(int ), (int)183);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)gi.eejc("efdn", eeiz(int ), (int)174);
                        cfr_temp_0 = 23;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)gi.eejc("efdz", eeiz(int ), (int)186);
                        cfr_temp_0 = 11;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)gi.eejc("efeb", eeiz(int ), (int)188);
                        cfr_temp_0 = 8;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 23: {
                        var5_3 /* !! */  = (int)gi.eejc("efed", eeiz(int ), (int)190);
                        cfr_temp_0 = 22;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 24: {
                        var5_3 /* !! */  = (int)gi.eejc("efee", eeiz(int ), (int)191);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)gi.eejc("efdr", eeiz(int ), (int)178);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)gi.eejc("efdo", eeiz(int ), (int)175);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)gi.eejc("efdi", eeiz(int ), (int)169);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)gi.eejc("efdx", eeiz(int ), (int)184);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 26: {
                        var5_3 /* !! */  = (int)gi.eejc("efeg", eeiz(int ), (int)193);
                        if (var6_2) {
                            throw null;
                        }
lbl425:
                        // 3 sources

                        var5_3 /* !! */  = (int)gi.eejc("efds", eeiz(int ), (int)179);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)gi.eejc("efdt", eeiz(int ), (int)180);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)gi.eejc("efec", eeiz(int ), (int)189);
                        cfr_temp_0 = 18;
                        if (var6_2) {
                            throw null;
                        }
                        break block190;
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)gi.eejc("efdh", eeiz(int ), (int)168);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)gi.eejc("efdy", eeiz(int ), (int)185);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)gi.eejc("efdv", eeiz(int ), (int)182);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)gi.eejc("efdu", eeiz(int ), (int)181);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var5_3 /* !! */  = (int)gi.eejc("efef", eeiz(int ), (int)192);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)gi.eejc("efdp", eeiz(int ), (int)176);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 20: 
                }
                ** GOTO lbl467
            }
            do {
                if (true) continue block145;
lbl467:
                // 2 sources

                var5_3 /* !! */  = (int)gi.eejc("efea", eeiz(int ), (int)187);
                cfr_temp_0 = 1;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$0() {
        boolean bl2;
        Object object = kl;
        boolean bl3 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gi.eejc("efij", eejo(int ), (int)243);
            }
            switch ((int)object) {
                case -1151082522: {
                    callSite = gi.eejc("efik", eejo(int ), (int)244);
                    continue block23;
                }
                case 219252963: {
                    callSite = gi.eejc("efil", eejo(int ), (int)245);
                    continue block23;
                }
                case 966093411: {
                    break block23;
                }
                case 1104070165: {
                    callSite = gi.eejc("efim", eejo(int ), (int)246);
                    continue block23;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = kl;
        block24: while (true) {
            switch ((int)object2) {
                case 966093411: {
                    break block24;
                }
                case 1699458015: {
                    object2 = gi.eejc("efio", eejo(int ), (int)248) - gi.eejc("efin", eejo(int ), (int)247);
                    continue block24;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = kl - gi.eejc("efip", eejo(int ), (int)249)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == gi.eejc("efiq", eeiz(int ), (int)278)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gi.eejc("efir", eeiz(int ), (int)279);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = kl;
        boolean bl5 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - gi.eejc("efis", eejo(int ), (int)250);
            }
            switch ((int)object4) {
                case -1243701556: {
                    callSite = gi.eejc("efit", eejo(int ), (int)251);
                    continue block26;
                }
                case -988804870: {
                    callSite = gi.eejc("efiu", eejo(int ), (int)252);
                    continue block26;
                }
                case 966093411: {
                    break block26;
                }
            }
            break;
        }
        Object object5 = kl;
        block27: while (true) {
            switch ((int)object5) {
                case -1631724686: {
                    object5 = gi.eejc("efiw", eejo(int ), (int)254) - gi.eejc("efiv", eejo(int ), (int)253);
                    continue block27;
                }
                case 966093411: {
                    break block27;
                }
            }
            break;
        }
        boolean bl6 = this.iceBoost.isValue();
        Object object6 = kl;
        block28: while (true) {
            switch ((int)object6) {
                case -1403134481: {
                    object6 = gi.eejc("efiy", eejo(int ), (int)256) - gi.eejc("efix", eejo(int ), (int)255);
                    continue block28;
                }
                case 966093411: {
                    return bl6;
                }
            }
            break;
        }
        return bl6;
    }

    private static /* synthetic */ void efke() {
        gi.eejq[0] = -2088105350279290154L;
        gi.eejq[1] = 7397673817741198575L;
        gi.eejq[2] = 4180419031451482834L;
        gi.eejq[3] = -6597558150675733741L;
        gi.eejq[4] = -5890072906059953039L;
        gi.eejq[5] = -2343882445426175432L;
        gi.eejq[6] = 3796395645531442237L;
        gi.eejq[7] = -6485457654453565647L;
        gi.eejq[8] = 8430758803507992775L;
        gi.eejq[9] = 5119107850505930381L;
        gi.eejq[10] = -8086284210011269974L;
        gi.eejq[11] = 3167785151809272296L;
        gi.eejq[12] = 4491484180480833705L;
        gi.eejq[13] = -7048631408491771723L;
        gi.eejq[14] = 452784138274814269L;
        gi.eejq[15] = -7918060105226002969L;
        gi.eejq[16] = 5408808021074199892L;
        gi.eejq[17] = -2385273944123977031L;
        gi.eejq[18] = 581748898481311518L;
        gi.eejq[19] = -8424378503274465621L;
        gi.eejq[20] = -4265562512752160791L;
        gi.eejq[21] = -3330595627522700987L;
        gi.eejq[22] = -2773911495458459073L;
        gi.eejq[23] = 2323419191131861727L;
        gi.eejq[24] = 8571174201173679806L;
        gi.eejq[25] = 4739109120566740828L;
        gi.eejq[26] = 4114216087996810902L;
        gi.eejq[27] = -2878314896813588244L;
        gi.eejq[28] = -7007843961079202020L;
        gi.eejq[29] = -3382150703902273059L;
        gi.eejq[30] = -3508305630627570525L;
        gi.eejq[31] = -963659066790307004L;
        gi.eejq[32] = 6754509174010872426L;
        gi.eejq[33] = 6620203360622419422L;
        gi.eejq[34] = -5676331080735156278L;
        gi.eejq[35] = -1538742662731473161L;
        gi.eejq[36] = -8085299750419226055L;
        gi.eejq[37] = 8891288455060019172L;
        gi.eejq[38] = -3538766316980552794L;
        gi.eejq[39] = 5042061201556305775L;
        gi.eejq[40] = -7489412474165698893L;
        gi.eejq[41] = 4336317398760654923L;
        gi.eejq[42] = -2390949839890954774L;
        gi.eejq[43] = 2732379926869556651L;
        gi.eejq[44] = 4445782587967177227L;
        gi.eejq[45] = -6229671901778870579L;
        gi.eejq[46] = -2276066643403835321L;
        gi.eejq[47] = -4652040198466060273L;
        gi.eejq[48] = -4423038142775912334L;
        gi.eejq[49] = -669961301334154661L;
        gi.eejq[50] = -4069978948316365420L;
        gi.eejq[51] = -7764630390990108280L;
        gi.eejq[52] = 9112880362721314029L;
        gi.eejq[53] = 2476159177963163960L;
        gi.eejq[54] = -1359768380291039583L;
        gi.eejq[55] = 8551005961842998835L;
        gi.eejq[56] = 9112003595659879400L;
        gi.eejq[57] = -1728871650230256308L;
        gi.eejq[58] = -597033866684257020L;
        gi.eejq[59] = 4014589352830027751L;
        gi.eejq[60] = -7672736884968430245L;
        gi.eejq[61] = 1510255997612733939L;
        gi.eejq[62] = 5863992997927416072L;
        gi.eejq[63] = -2528156102771007579L;
        gi.eejq[64] = -8811148426726777491L;
        gi.eejq[65] = 2819158699089061582L;
        gi.eejq[66] = 8616078667804722109L;
        gi.eejq[67] = 2437032941136884030L;
        gi.eejq[68] = 1003223895519721954L;
        gi.eejq[69] = -3531228037407331249L;
        gi.eejq[70] = 6037808083191905227L;
        gi.eejq[71] = 2400575764794919577L;
        gi.eejq[72] = -3708893559881224111L;
        gi.eejq[73] = 6199872715575989718L;
        gi.eejq[74] = -6307050859801456971L;
        gi.eejq[75] = 5400860340287721551L;
        gi.eejq[76] = 1880104862522921685L;
        gi.eejq[77] = -7118876283398267233L;
        gi.eejq[78] = -3086999382090476470L;
        gi.eejq[79] = 3416482045367687942L;
        gi.eejq[80] = 2762639247455199218L;
        gi.eejq[81] = 150892436835499304L;
        gi.eejq[82] = -8656410871835353328L;
        gi.eejq[83] = 8694537016563634742L;
        gi.eejq[84] = 7270695533035242339L;
        gi.eejq[85] = 20075922829466631L;
        gi.eejq[86] = -4136722356268930155L;
        gi.eejq[87] = 7675894281550780237L;
        gi.eejq[88] = 808801028197822736L;
        gi.eejq[89] = -9205746852472367404L;
        gi.eejq[90] = 2966471828034525138L;
        gi.eejq[91] = -8675898604950280527L;
        gi.eejq[92] = -1375145611792811104L;
        gi.eejq[93] = 2956920904115426771L;
        gi.eejq[94] = -5999482069436209538L;
        gi.eejq[95] = -1084394268591945827L;
        gi.eejq[96] = 1866234655937892709L;
        gi.eejq[97] = 3997314253815495354L;
        gi.eejq[98] = -6493557116797491181L;
        gi.eejq[99] = -8470325151957016172L;
    }
}

