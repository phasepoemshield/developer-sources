/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import ruhack.phobia.in;
import ruhack.phobia.io;
import ruhack.phobia.ip;
import ruhack.phobia.it$Stage;
import ruhack.phobia.nv;
import ruhack.phobia.pr;

public class is {
    private final io fireworkHandler;
    private float height;
    private boolean silentMode;
    private final pr fireworkTimer;
    private boolean reallyWorldMode;
    private static final class_310 mc;
    public static final boolean a;
    private static long[] dxw;
    private final in armorSwapHandler;
    private it$Stage stage;
    public static final int b;
    public static final long u = -6626421512870591488L;
    private static int[] dwp;
    private final ip attackHandler;
    private static long[] dxx;
    public static final boolean c;
    private static int[] dwn;

    private static /* synthetic */ int dwl(int n2) {
        return dwn[n2] ^ dwp[n2];
    }

    private static /* synthetic */ void etk() {
        is.dwp[100] = -1881285880;
        is.dwp[101] = -1134184112;
        is.dwp[102] = 1140495043;
        is.dwp[103] = 1923206755;
        is.dwp[104] = 1506358321;
        is.dwp[105] = 1310085792;
        is.dwp[106] = -2009671346;
        is.dwp[107] = 1620975445;
        is.dwp[108] = -1994186320;
        is.dwp[109] = 1159095409;
        is.dwp[110] = -489000489;
        is.dwp[111] = -2115678837;
        is.dwp[112] = 392615437;
        is.dwp[113] = -2134626531;
        is.dwp[114] = 1922108169;
        is.dwp[115] = 646751960;
        is.dwp[116] = -193929229;
        is.dwp[117] = 1581668447;
        is.dwp[118] = 2019253181;
        is.dwp[119] = 1662170919;
        is.dwp[120] = 1849797838;
        is.dwp[121] = 1117031466;
        is.dwp[122] = 561869317;
        is.dwp[123] = -1696151119;
        is.dwp[124] = 542026604;
        is.dwp[125] = 1158803547;
        is.dwp[126] = -1033462499;
        is.dwp[127] = -1671572899;
        is.dwp[128] = -994752476;
        is.dwp[129] = 555210742;
        is.dwp[130] = -108364492;
        is.dwp[131] = 1683287406;
        is.dwp[132] = -2130670583;
        is.dwp[133] = -2058500233;
        is.dwp[134] = 491630456;
        is.dwp[135] = 2042487498;
        is.dwp[136] = -756154038;
        is.dwp[137] = 577930249;
        is.dwp[138] = 717955887;
        is.dwp[139] = 1861005215;
        is.dwp[140] = 2053504847;
        is.dwp[141] = -606454423;
        is.dwp[142] = -156739011;
        is.dwp[143] = -1606430100;
        is.dwp[144] = -40289962;
        is.dwp[145] = 1586313966;
        is.dwp[146] = -1269816771;
        is.dwp[147] = 624284872;
        is.dwp[148] = -574603527;
        is.dwp[149] = 939434542;
        is.dwp[150] = 87171805;
        is.dwp[151] = 376698069;
        is.dwp[152] = -652224732;
        is.dwp[153] = 1870235180;
        is.dwp[154] = -1137864575;
        is.dwp[155] = 1458989343;
        is.dwp[156] = -443356970;
        is.dwp[157] = -965658374;
        is.dwp[158] = -1637243936;
        is.dwp[159] = 1529238870;
        is.dwp[160] = -1579528861;
        is.dwp[161] = -1748057842;
        is.dwp[162] = -427490321;
        is.dwp[163] = 641437023;
        is.dwp[164] = 638122332;
        is.dwp[165] = -875051811;
        is.dwp[166] = 2025410925;
        is.dwp[167] = 219167212;
        is.dwp[168] = 1628644073;
        is.dwp[169] = 706609596;
        is.dwp[170] = 1770892693;
        is.dwp[171] = -1531258210;
        is.dwp[172] = -1176098238;
        is.dwp[173] = -2063356477;
        is.dwp[174] = 167941089;
        is.dwp[175] = -1055977826;
        is.dwp[176] = 2085120885;
        is.dwp[177] = -1895144366;
        is.dwp[178] = -902075723;
        is.dwp[179] = -7193848;
        is.dwp[180] = 192615265;
        is.dwp[181] = -107664288;
        is.dwp[182] = -1977100584;
        is.dwp[183] = 1012230100;
        is.dwp[184] = 496505005;
        is.dwp[185] = 664375868;
        is.dwp[186] = 1609089102;
        is.dwp[187] = -2029016098;
        is.dwp[188] = 101064956;
        is.dwp[189] = 1758854830;
        is.dwp[190] = 762168485;
        is.dwp[191] = -1991290204;
        is.dwp[192] = 688127326;
        is.dwp[193] = -923542437;
        is.dwp[194] = -1345914226;
        is.dwp[195] = 644946510;
        is.dwp[196] = -581608951;
        is.dwp[197] = 1606340077;
        is.dwp[198] = 982756680;
        is.dwp[199] = -177815545;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void handleFlyingUp(class_1309 var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eao", dxv(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == is.dwq("eap", dwl(int ), (int)47)) break;
            v0 /* !! */  = (long)is.dwq("eaq", dwl(int ), (int)48);
        }
        var5_3 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl11
        block69: while (true) {
            v1 /* !! */  = (long)(v2 - is.dwq("ear", dxv(int ), (int)20));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -898813550: {
                    v2 = is.dwq("eas", dxv(int ), (int)21);
                    continue block69;
                }
                case 156730368: {
                    break block69;
                }
                case 277978095: {
                    v2 = is.dwq("eat", dxv(int ), (int)22);
                    continue block69;
                }
            }
            break;
        }
        var4_4 /* !! */  = is.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = is.u - is.dwq("eau", dxv(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == is.dwq("eav", dwl(int ), (int)49)) break;
            v3 /* !! */  = (long)is.dwq("eaw", dwl(int ), (int)50);
        }
        var3_5 = is.a;
        if (var5_3) {
            throw null;
lbl29:
            // 12 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl29
        if (var2_2) ** GOTO lbl50
        if (var3_5 || var3_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = is.u - is.dwq("eax", dxv(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == is.dwq("eay", dwl(int ), (int)51)) break;
            v4 /* !! */  = (long)is.dwq("eaz", dwl(int ), (int)52);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = is.u - is.dwq("eba", dxv(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == is.dwq("ebb", dwl(int ), (int)53)) break;
            v5 /* !! */  = (long)is.dwq("ebc", dwl(int ), (int)54);
        }
        this.stage = it$Stage.PREPARE;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl29
                return;
            }
lbl50:
            // 1 sources

            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = is.u - is.dwq("ebd", dxv(int ), (int)26)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == is.dwq("ebe", dwl(int ), (int)55)) break;
                v6 /* !! */  = (long)is.dwq("ebf", dwl(int ), (int)56);
            }
            v7 /* !! */  = is.u;
            if (true) ** GOTO lbl60
            block75: while (true) {
                v7 /* !! */  = (long)(is.dwq("ebh", dxv(int ), (int)28) - is.dwq("ebg", dxv(int ), (int)27));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2004546384: {
                        continue block75;
                    }
                    case 156730368: {
                        break block75;
                    }
                }
                break;
            }
            v8 = is.mc.field_1724;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_5 = is.u - is.dwq("ebi", dxv(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == is.dwq("ebj", dwl(int ), (int)57)) break;
                v9 /* !! */  = (long)is.dwq("ebk", dwl(int ), (int)58);
            }
            if (!v8.method_6128()) ** GOTO lbl153
            if (var3_5) ** GOTO lbl29
            v10 /* !! */  = is.u;
            if (true) ** GOTO lbl77
            block77: while (true) {
                v10 /* !! */  = (long)(is.dwq("ebm", dxv(int ), (int)31) - is.dwq("ebl", dxv(int ), (int)30));
lbl77:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -327381628: {
                        continue block77;
                    }
                    case 156730368: {
                        break block77;
                    }
                }
                break;
            }
            v11 = is.dwq("ebo", ebn(int ), (int)32);
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = is.u - is.dwq("ebp", dxv(int ), (int)33)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == is.dwq("ebq", dwl(int ), (int)59)) break;
                v12 /* !! */  = (long)is.dwq("ebr", dwl(int ), (int)60);
            }
            if (!this.fireworkTimer.finished((double)v11)) ** GOTO lbl153
            if (var3_5 || var3_5) ** GOTO lbl29
            v13 /* !! */  = is.u;
            if (true) ** GOTO lbl94
            block79: while (true) {
                v13 /* !! */  = (long)(v14 - is.dwq("ebs", dxv(int ), (int)34));
lbl94:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -2065364236: {
                        v14 = is.dwq("ebt", dxv(int ), (int)35);
                        continue block79;
                    }
                    case -937914884: {
                        v14 = is.dwq("ebu", dxv(int ), (int)36);
                        continue block79;
                    }
                    case 156730368: {
                        break block79;
                    }
                    case 822443276: {
                        v14 = is.dwq("ebv", dxv(int ), (int)37);
                        continue block79;
                    }
                }
                break;
            }
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_7 = is.u - is.dwq("ebw", dxv(int ), (int)38)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == is.dwq("ebx", dwl(int ), (int)61)) break;
                v15 /* !! */  = (long)is.dwq("eby", dwl(int ), (int)62);
            }
            v16 /* !! */  = is.u;
            if (true) ** GOTO lbl115
            block81: while (true) {
                v16 /* !! */  = (long)(is.dwq("eca", dxv(int ), (int)40) - is.dwq("ebz", dxv(int ), (int)39));
lbl115:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 156730368: {
                        break block81;
                    }
                    case 1631671646: {
                        continue block81;
                    }
                }
                break;
            }
            this.fireworkHandler.useFirework(this.silentMode);
            if (var3_5 || var3_5) ** GOTO lbl29
            v17 /* !! */  = is.u;
            if (true) ** GOTO lbl126
            block82: while (true) {
                v17 /* !! */  = (long)(v18 - is.dwq("ecb", dxv(int ), (int)41));
lbl126:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -346187293: {
                        v18 = is.dwq("ecc", dxv(int ), (int)42);
                        continue block82;
                    }
                    case 156730368: {
                        break block82;
                    }
                    case 405855417: {
                        v18 = is.dwq("ecd", dxv(int ), (int)43);
                        continue block82;
                    }
                }
                break;
            }
            v19 /* !! */  = is.u;
            if (true) ** GOTO lbl139
            block83: while (true) {
                v19 /* !! */  = (long)(v20 - is.dwq("ece", dxv(int ), (int)44));
lbl139:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -2013786631: {
                        v20 = is.dwq("ecf", dxv(int ), (int)45);
                        continue block83;
                    }
                    case 144021698: {
                        v20 = is.dwq("ecg", dxv(int ), (int)46);
                        continue block83;
                    }
                    case 156730368: {
                        break block83;
                    }
                    case 1374328882: {
                        v20 = is.dwq("ech", dxv(int ), (int)47);
                        continue block83;
                    }
                }
                break;
            }
            this.fireworkTimer.reset();
            if (var3_5) ** GOTO lbl29
lbl153:
            // 3 sources

            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_8 = is.u - is.dwq("eci", dxv(int ), (int)48)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == is.dwq("ecj", dwl(int ), (int)63)) break;
                v21 /* !! */  = (long)is.dwq("eck", dwl(int ), (int)64);
            }
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_9 = is.u - is.dwq("ecl", dxv(int ), (int)49)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == is.dwq("ecm", dwl(int ), (int)65)) break;
                v22 /* !! */  = (long)is.dwq("ecn", dwl(int ), (int)66);
            }
            v23 = is.mc.field_1724;
            v24 /* !! */  = is.u;
            if (true) ** GOTO lbl169
            block86: while (true) {
                v24 /* !! */  = (long)(is.dwq("ecp", dxv(int ), (int)51) - is.dwq("eco", dxv(int ), (int)50));
lbl169:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case 156730368: {
                        break block86;
                    }
                    case 1933269344: {
                        continue block86;
                    }
                }
                break;
            }
            v25 = v23.method_23318();
            v26 /* !! */  = is.u;
            if (true) ** GOTO lbl179
            block87: while (true) {
                v26 /* !! */  = (long)(is.dwq("ecr", dxv(int ), (int)53) - is.dwq("ecq", dxv(int ), (int)52));
lbl179:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case 156730368: {
                        break block87;
                    }
                    case 1082459131: {
                        continue block87;
                    }
                }
                break;
            }
            v27 = v25 - var1_1.method_23318();
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_10 = is.u - is.dwq("ecs", dxv(int ), (int)54)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == is.dwq("ect", dwl(int ), (int)67)) break;
                v28 /* !! */  = (long)is.dwq("ecu", dwl(int ), (int)68);
            }
            if (!(v27 >= (double)this.height)) ** GOTO lbl204
            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_11 = is.u - is.dwq("ecv", dxv(int ), (int)55)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == is.dwq("ecw", dwl(int ), (int)69)) break;
                v29 /* !! */  = (long)is.dwq("ecx", dwl(int ), (int)70);
            }
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_12 = is.u - is.dwq("ecy", dxv(int ), (int)56)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == is.dwq("ecz", dwl(int ), (int)71)) break;
                v30 /* !! */  = (long)is.dwq("eda", dwl(int ), (int)72);
            }
            this.stage = it$Stage.TARGETTING;
            if (var3_5) ** GOTO lbl29
lbl204:
            // 2 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            return;
            case 0: {
                var4_4 /* !! */  = (int)is.dwq("edb", dwl(int ), (int)73);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl212:
            // 3 sources

            case 1: {
                var4_4 /* !! */  = (int)is.dwq("edc", dwl(int ), (int)74);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 2: {
                var4_4 /* !! */  = (int)is.dwq("edd", dwl(int ), (int)75);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl222:
            // 3 sources

            case 3: {
                var4_4 /* !! */  = (int)is.dwq("ede", dwl(int ), (int)76);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 4: {
                var4_4 /* !! */  = (int)is.dwq("edf", dwl(int ), (int)77);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl232:
            // 3 sources

            case 5: {
                var4_4 /* !! */  = (int)is.dwq("edg", dwl(int ), (int)78);
                if (!var5_3) ** GOTO lbl212
                throw null;
            }
lbl236:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)is.dwq("edh", dwl(int ), (int)79);
                if (!var5_3) ** GOTO lbl232
                throw null;
            }
lbl240:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)is.dwq("edi", dwl(int ), (int)80);
                if (!var5_3) ** GOTO lbl232
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)is.dwq("edj", dwl(int ), (int)81);
                if (!var5_3) ** GOTO lbl240
                throw null;
            }
lbl248:
            // 2 sources

            case 9: {
                var4_4 /* !! */  = (int)is.dwq("edk", dwl(int ), (int)82);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl253:
            // 2 sources

            case 10: {
                var4_4 /* !! */  = (int)is.dwq("edl", dwl(int ), (int)83);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl258:
            // 2 sources

            case 11: {
                var4_4 /* !! */  = (int)is.dwq("edm", dwl(int ), (int)84);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 12: {
                var4_4 /* !! */  = (int)is.dwq("edn", dwl(int ), (int)85);
                if (!var5_3) ** GOTO lbl212
                throw null;
            }
lbl267:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)is.dwq("edo", dwl(int ), (int)86);
                    if (!var5_3) ** GOTO lbl258
                    throw null;
                }
            }
            case 14: {
                var4_4 /* !! */  = (int)is.dwq("edp", dwl(int ), (int)87);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 15: {
                var4_4 /* !! */  = (int)is.dwq("edq", dwl(int ), (int)88);
                if (!var5_3) ** GOTO lbl222
                throw null;
            }
            case 16: {
                var4_4 /* !! */  = (int)is.dwq("edr", dwl(int ), (int)89);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 17: {
                var4_4 /* !! */  = (int)is.dwq("eds", dwl(int ), (int)90);
                if (!var5_3) ** GOTO lbl236
                throw null;
            }
lbl290:
            // 3 sources

            case 18: {
                var4_4 /* !! */  = (int)is.dwq("edt", dwl(int ), (int)91);
                if (!var5_3) ** GOTO lbl222
                throw null;
            }
            case 19: {
                var4_4 /* !! */  = (int)is.dwq("edu", dwl(int ), (int)92);
                if (!var5_3) break;
                throw null;
            }
lbl298:
            // 5 sources

            case 20: {
                var4_4 /* !! */  = (int)is.dwq("edv", dwl(int ), (int)93);
                if (!var5_3) ** GOTO lbl253
                throw null;
            }
lbl302:
            // 2 sources

            case 21: {
                var4_4 /* !! */  = (int)is.dwq("edw", dwl(int ), (int)94);
                if (!var5_3) ** GOTO lbl248
                throw null;
            }
lbl306:
            // 3 sources

            case 22: {
                var4_4 /* !! */  = (int)is.dwq("edx", dwl(int ), (int)95);
                if (!var5_3) ** GOTO lbl298
                throw null;
            }
            case 23: 
        }
        var4_4 /* !! */  = (int)is.dwq("edy", dwl(int ), (int)96);
        ** while (!var5_3)
lbl313:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isSilentMode() {
        Object object = u;
        boolean bl2 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - is.dwq("eop", dxv(int ), (int)183);
            }
            switch ((int)object) {
                case 156730368: {
                    break block16;
                }
                case 250952665: {
                    callSite = is.dwq("eoq", dxv(int ), (int)184);
                    continue block16;
                }
                case 351809280: {
                    callSite = is.dwq("eor", dxv(int ), (int)185);
                    continue block16;
                }
                case 926727570: {
                    callSite = is.dwq("eos", dxv(int ), (int)186);
                    continue block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = u;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - is.dwq("eot", dxv(int ), (int)187);
            }
            switch ((int)object2) {
                case -1806846762: {
                    callSite = is.dwq("eou", dxv(int ), (int)188);
                    continue block17;
                }
                case -731878225: {
                    callSite = is.dwq("eov", dxv(int ), (int)189);
                    continue block17;
                }
                case 156730368: {
                    break block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = u;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - is.dwq("eow", dxv(int ), (int)190);
            }
            switch ((int)object3) {
                case -389187961: {
                    callSite = is.dwq("eox", dxv(int ), (int)191);
                    continue block18;
                }
                case 156730368: {
                    break block18;
                }
                case 1621371908: {
                    callSite = is.dwq("eoy", dxv(int ), (int)192);
                    continue block18;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (boolean)is.dwq("eoz", dwl(int ), (int)247);
        if (bl6) return (boolean)is.dwq("eoz", dwl(int ), (int)247);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = u - is.dwq("epa", dxv(int ), (int)193)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == is.dwq("epb", dwl(int ), (int)248)) {
                return this.silentMode;
            }
            object4 = is.dwq("epc", dwl(int ), (int)249);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void handleTargetting(class_1309 var1_1) {
        block88: {
            v0 /* !! */  = is.u;
            if (true) ** GOTO lbl5
            block49: while (true) {
                v0 /* !! */  = (long)(is.dwq("eea", dxv(int ), (int)58) - is.dwq("edz", dxv(int ), (int)57));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1639961354: {
                        continue block49;
                    }
                    case 156730368: {
                        break block49;
                    }
                }
                break;
            }
            var6_2 = is.c;
            v1 /* !! */  = is.u;
            if (true) ** GOTO lbl15
            block50: while (true) {
                v1 /* !! */  = (long)(is.dwq("eec", dxv(int ), (int)60) - is.dwq("eeb", dxv(int ), (int)59));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 156730368: {
                        break block50;
                    }
                    case 368976392: {
                        continue block50;
                    }
                }
                break;
            }
            var5_3 /* !! */  = is.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eed", dxv(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == is.dwq("eee", dwl(int ), (int)97)) break;
                v2 /* !! */  = (long)is.dwq("eef", dwl(int ), (int)98);
            }
            var4_4 = is.a;
            if (var6_2) {
                throw null;
lbl29:
                // 13 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            var2_5 = is.dwq("eeg", dww(int ), (int)99);
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = is.u - is.dwq("eeh", dxv(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == is.dwq("eei", dwl(int ), (int)100)) break;
                v3 /* !! */  = (long)is.dwq("eej", dwl(int ), (int)101);
            }
            if (!nv.hasElytra()) break block88;
            if (var4_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = is.u - is.dwq("eek", dxv(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == is.dwq("eel", dwl(int ), (int)102)) break;
                v4 /* !! */  = (long)is.dwq("eem", dwl(int ), (int)103);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = is.u - is.dwq("een", dxv(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == is.dwq("eeo", dwl(int ), (int)104)) break;
                v5 /* !! */  = (long)is.dwq("eep", dwl(int ), (int)105);
            }
            v6 = is.mc.field_1724;
            v7 /* !! */  = is.u;
            if (true) ** GOTO lbl56
            block56: while (true) {
                v7 /* !! */  = (long)(is.dwq("eer", dxv(int ), (int)66) - is.dwq("eeq", dxv(int ), (int)65));
lbl56:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 156730368: {
                        break block56;
                    }
                    case 642063630: {
                        continue block56;
                    }
                }
                break;
            }
            if (!(v6.method_5739((class_1297)var1_1) < var2_5)) break block88;
            if (var4_4) ** GOTO lbl29
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = is.u - is.dwq("ees", dxv(int ), (int)67)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == is.dwq("eet", dwl(int ), (int)106)) break;
                v8 /* !! */  = (long)is.dwq("eeu", dwl(int ), (int)107);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_5 = is.u - is.dwq("eev", dxv(int ), (int)68)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == is.dwq("eew", dwl(int ), (int)108)) break;
                v9 /* !! */  = (long)is.dwq("eex", dwl(int ), (int)109);
            }
            if (this.armorSwapHandler.isActive()) break block88;
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_6 = is.u - is.dwq("eey", dxv(int ), (int)69)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == is.dwq("eez", dwl(int ), (int)110)) break;
                v10 /* !! */  = (long)is.dwq("efa", dwl(int ), (int)111);
            }
            var3_6 = nv.findChestArmorSlot();
            if (var4_4 || var4_4) ** GOTO lbl29
            if (var3_6 == is.dwq("efb", dwl(int ), (int)112)) break block88;
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_7 = is.u - is.dwq("efc", dxv(int ), (int)70)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == is.dwq("efd", dwl(int ), (int)113)) break;
                v11 /* !! */  = (long)is.dwq("efe", dwl(int ), (int)114);
            }
            v12 /* !! */  = is.u;
            if (true) ** GOTO lbl93
            block61: while (true) {
                v12 /* !! */  = (long)(is.dwq("efg", dxv(int ), (int)72) - is.dwq("eff", dxv(int ), (int)71));
lbl93:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1406521987: {
                        continue block61;
                    }
                    case 156730368: {
                        break block61;
                    }
                }
                break;
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_8 = is.u - is.dwq("efh", dxv(int ), (int)73)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == is.dwq("efi", dwl(int ), (int)115)) break;
                v13 /* !! */  = (long)is.dwq("efj", dwl(int ), (int)116);
            }
            this.armorSwapHandler.startSwap(var3_6, this.silentMode);
            if (var4_4) ** GOTO lbl29
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_9 = is.u - is.dwq("efk", dxv(int ), (int)74)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == is.dwq("efl", dwl(int ), (int)117)) break;
            v14 /* !! */  = (long)is.dwq("efm", dwl(int ), (int)118);
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_10 = is.u - is.dwq("efn", dxv(int ), (int)75)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == is.dwq("efo", dwl(int ), (int)119)) break;
            v15 /* !! */  = (long)is.dwq("efp", dwl(int ), (int)120);
        }
        v16 = is.mc.field_1724;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_11 = is.u - is.dwq("efq", dxv(int ), (int)76)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == is.dwq("efr", dwl(int ), (int)121)) break;
            v17 /* !! */  = (long)is.dwq("efs", dwl(int ), (int)122);
        }
        if (!(v16.method_5739((class_1297)var1_1) < is.dwq("eft", dww(int ), (int)123))) ** GOTO lbl153
        if (var4_4) ** GOTO lbl29
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
                v18 /* !! */  = is.u;
                if (true) ** GOTO lbl133
                block66: while (true) {
                    v18 /* !! */  = (long)(v19 - is.dwq("efu", dxv(int ), (int)77));
lbl133:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2076631374: {
                            v19 = is.dwq("efv", dxv(int ), (int)78);
                            continue block66;
                        }
                        case 156730368: {
                            break block66;
                        }
                        case 582161264: {
                            v19 = is.dwq("efw", dxv(int ), (int)79);
                            continue block66;
                        }
                    }
                    break;
                }
                v20 /* !! */  = is.u;
                if (true) ** GOTO lbl146
                block67: while (true) {
                    v20 /* !! */  = (long)(is.dwq("efy", dxv(int ), (int)81) - is.dwq("efx", dxv(int ), (int)80));
lbl146:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -811392037: {
                            continue block67;
                        }
                        case 156730368: {
                            break block67;
                        }
                    }
                    break;
                }
                this.stage = it$Stage.ATTACKING;
                if (var4_4) ** GOTO lbl29
lbl153:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl156:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)is.dwq("efz", dwl(int ), (int)124);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl161:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)is.dwq("ega", dwl(int ), (int)125);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl166:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)is.dwq("egb", dwl(int ), (int)126);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl171:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)is.dwq("egc", dwl(int ), (int)127);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl176:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)is.dwq("egd", dwl(int ), (int)128);
                if (!var6_2) ** GOTO lbl166
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)is.dwq("ege", dwl(int ), (int)129);
                if (!var6_2) ** GOTO lbl171
                throw null;
            }
lbl184:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)is.dwq("egf", dwl(int ), (int)130);
                if (!var6_2) ** GOTO lbl161
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)is.dwq("egg", dwl(int ), (int)131);
                if (!var6_2) ** GOTO lbl184
                throw null;
            }
lbl192:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)is.dwq("egh", dwl(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 9: {
                var5_3 /* !! */  = (int)is.dwq("egi", dwl(int ), (int)133);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl202:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)is.dwq("egj", dwl(int ), (int)134);
                if (!var6_2) break;
                throw null;
            }
lbl206:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)is.dwq("egk", dwl(int ), (int)135);
                if (!var6_2) ** GOTO lbl176
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)is.dwq("egl", dwl(int ), (int)136);
                if (!var6_2) ** GOTO lbl202
                throw null;
            }
lbl214:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)is.dwq("egm", dwl(int ), (int)137);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl219:
            // 2 sources

            case 14: {
                do {
                    var5_3 /* !! */  = (int)is.dwq("egn", dwl(int ), (int)138);
                } while (!var6_2);
                throw null;
            }
lbl224:
            // 4 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)is.dwq("ego", dwl(int ), (int)139);
                    if (!var6_2) ** GOTO lbl192
                    throw null;
                }
            }
lbl229:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)is.dwq("egp", dwl(int ), (int)140);
                if (!var6_2) ** GOTO lbl156
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)is.dwq("egq", dwl(int ), (int)141);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl237:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)is.dwq("egr", dwl(int ), (int)142);
                if (!var6_2) ** GOTO lbl176
                throw null;
            }
lbl241:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)is.dwq("egs", dwl(int ), (int)143);
                if (!var6_2) ** GOTO lbl192
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)is.dwq("egt", dwl(int ), (int)144);
                if (!var6_2) ** GOTO lbl237
                throw null;
            }
            case 21: 
        }
        var5_3 /* !! */  = (int)is.dwq("egu", dwl(int ), (int)145);
        ** while (!var6_2)
lbl252:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double ebn(int n2) {
        return Double.longBitsToDouble(dxw[n2] ^ dxx[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void handlePrepare(boolean var1_1) {
        v0 /* !! */  = is.u;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(is.dwq("dya", dxv(int ), (int)1) - is.dwq("dxy", dxv(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1569132108: {
                    continue block45;
                }
                case 156730368: {
                    break block45;
                }
            }
            break;
        }
        var5_2 = is.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = is.u - is.dwq("dyc", dxv(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == is.dwq("dyd", dwl(int ), (int)14)) break;
            v1 /* !! */  = (long)is.dwq("dye", dwl(int ), (int)15);
        }
        var4_3 /* !! */  = is.b;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl21
        block47: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("dyg", dxv(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1981922222: {
                    v3 = is.dwq("dyi", dxv(int ), (int)4);
                    continue block47;
                }
                case -867631885: {
                    v3 = is.dwq("dyk", dxv(int ), (int)5);
                    continue block47;
                }
                case 156730368: {
                    break block47;
                }
                case 1459074629: {
                    v3 = is.dwq("dyl", dxv(int ), (int)6);
                    continue block47;
                }
            }
            break;
        }
        var3_4 = is.a;
        if (var5_2) {
            throw null;
lbl36:
            // 10 sources

            return;
        }
        if (var3_4) ** GOTO lbl36
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl36
                if (var1_1) ** GOTO lbl85
                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = is.u - is.dwq("dyp", dxv(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == is.dwq("dyr", dwl(int ), (int)16)) break;
                    v4 /* !! */  = (long)is.dwq("dyt", dwl(int ), (int)17);
                }
                var2_5 = nv.findElytraSlot();
                if (var3_4 || var3_4) ** GOTO lbl36
                if (var2_5 == is.dwq("dyv", dwl(int ), (int)18)) ** GOTO lbl83
                if (var3_4 || var3_4) ** GOTO lbl36
                v5 /* !! */  = is.u;
                if (true) ** GOTO lbl58
                block50: while (true) {
                    v5 /* !! */  = (long)(v6 - is.dwq("dyx", dxv(int ), (int)8));
lbl58:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -478593941: {
                            v6 = is.dwq("dyy", dxv(int ), (int)9);
                            continue block50;
                        }
                        case 156730368: {
                            break block50;
                        }
                        case 1541233473: {
                            v6 = is.dwq("dza", dxv(int ), (int)10);
                            continue block50;
                        }
                    }
                    break;
                }
                v7 /* !! */  = is.u;
                if (true) ** GOTO lbl71
                block51: while (true) {
                    v7 /* !! */  = (long)(is.dwq("dzc", dxv(int ), (int)12) - is.dwq("dzb", dxv(int ), (int)11));
lbl71:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 156730368: {
                            break block51;
                        }
                        case 1014785373: {
                            continue block51;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = is.u - is.dwq("dze", dxv(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == is.dwq("dzf", dwl(int ), (int)19)) break;
                    v8 /* !! */  = (long)is.dwq("dzg", dwl(int ), (int)20);
                }
                this.armorSwapHandler.startSwap(var2_5, this.silentMode);
                if (var3_4) ** GOTO lbl36
lbl83:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                return;
lbl85:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = is.u - is.dwq("dzi", dxv(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == is.dwq("dzj", dwl(int ), (int)21)) break;
                    v9 /* !! */  = (long)is.dwq("dzk", dwl(int ), (int)22);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = is.u - is.dwq("dzl", dxv(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == is.dwq("dzm", dwl(int ), (int)23)) break;
                    v10 /* !! */  = (long)is.dwq("dzo", dwl(int ), (int)24);
                }
                this.stage = it$Stage.FLYING_UP;
                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = is.u - is.dwq("dzp", dxv(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == is.dwq("dzq", dwl(int ), (int)25)) break;
                    v11 /* !! */  = (long)is.dwq("dzr", dwl(int ), (int)26);
                }
                v12 /* !! */  = is.u;
                if (true) ** GOTO lbl107
                block56: while (true) {
                    v12 /* !! */  = (long)(is.dwq("dzt", dxv(int ), (int)18) - is.dwq("dzs", dxv(int ), (int)17));
lbl107:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 156730368: {
                            break block56;
                        }
                        case 950430834: {
                            continue block56;
                        }
                    }
                    break;
                }
                this.fireworkTimer.reset();
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)is.dwq("dzu", dwl(int ), (int)27);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl121:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)is.dwq("dzv", dwl(int ), (int)28);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 2: {
                var4_3 /* !! */  = (int)is.dwq("dzw", dwl(int ), (int)29);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl131:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)is.dwq("dzx", dwl(int ), (int)30);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var4_3 /* !! */  = (int)is.dwq("dzy", dwl(int ), (int)31);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl141:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)is.dwq("dzz", dwl(int ), (int)32);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl146:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)is.dwq("eaa", dwl(int ), (int)33);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 7: {
                var4_3 /* !! */  = (int)is.dwq("eab", dwl(int ), (int)34);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl156:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)is.dwq("eac", dwl(int ), (int)35);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl161:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)is.dwq("ead", dwl(int ), (int)36);
                if (!var5_2) ** GOTO lbl121
                throw null;
            }
lbl165:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)is.dwq("eae", dwl(int ), (int)37);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl170:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)is.dwq("eaf", dwl(int ), (int)38);
                if (!var5_2) break;
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)is.dwq("eag", dwl(int ), (int)39);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl179:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)is.dwq("eah", dwl(int ), (int)40);
                if (!var5_2) ** GOTO lbl170
                throw null;
            }
lbl183:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)is.dwq("eai", dwl(int ), (int)41);
                if (!var5_2) ** GOTO lbl131
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)is.dwq("eaj", dwl(int ), (int)42);
                if (var5_2) {
                    throw null;
                }
            }
lbl191:
            // 4 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)is.dwq("eak", dwl(int ), (int)43);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl201
                    break;
                }
            }
            case 17: {
                var4_3 /* !! */  = (int)is.dwq("eal", dwl(int ), (int)44);
                if (!var5_2) ** GOTO lbl156
                throw null;
            }
lbl201:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)is.dwq("eam", dwl(int ), (int)45);
                if (!var5_2) ** GOTO lbl146
                throw null;
            }
            case 19: 
        }
        var4_3 /* !! */  = (int)is.dwq("ean", dwl(int ), (int)46);
        ** while (!var5_2)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void etp() {
        is.dxw[200] = 8176842874012573015L;
        is.dxw[201] = 7021124094618577986L;
        is.dxw[202] = -1259285800122085103L;
        is.dxw[203] = 6515671406480827499L;
        is.dxw[204] = 3201471697806021550L;
        is.dxw[205] = 4526215978631003262L;
        is.dxw[206] = 2001336414361800035L;
        is.dxw[207] = -5258688918959126966L;
        is.dxw[208] = -9170294608685436300L;
        is.dxw[209] = -2932233323683728308L;
        is.dxw[210] = 7375969816526155034L;
        is.dxw[211] = 4328655050677585582L;
        is.dxw[212] = 3061027811863343539L;
        is.dxw[213] = -2761959465619489559L;
        is.dxw[214] = 598659070312249155L;
        is.dxw[215] = -5615135857526664957L;
        is.dxw[216] = 4468936741201837151L;
        is.dxw[217] = -4503352575129939869L;
        is.dxw[218] = 2649699159818439639L;
        is.dxw[219] = 2467833535131957862L;
        is.dxw[220] = 4827951335720194146L;
        is.dxw[221] = -8681917069214750736L;
        is.dxw[222] = -2300644422448181686L;
        is.dxw[223] = -5133937600339047525L;
        is.dxw[224] = -3842510930335423293L;
        is.dxw[225] = 4476324985895867904L;
        is.dxw[226] = 5105276116723262451L;
        is.dxw[227] = 4381372999304045382L;
        is.dxw[228] = -1927418709947081311L;
        is.dxw[229] = 8635275824481681804L;
        is.dxw[230] = 3170583409367016937L;
        is.dxw[231] = -1006034234596647707L;
        is.dxw[232] = 2146728945526881074L;
        is.dxw[233] = -7185109488245102550L;
        is.dxw[234] = -2076370627878752183L;
        is.dxw[235] = -4442482466293917516L;
        is.dxw[236] = -7785572820109845282L;
        is.dxw[237] = 261588543029887654L;
        is.dxw[238] = -9222634071727927546L;
        is.dxw[239] = -7985713252747531219L;
        is.dxw[240] = -4352847592782846658L;
        is.dxw[241] = -4552074314102861680L;
        is.dxw[242] = -1524203675631381778L;
        is.dxw[243] = 6578137442522523136L;
        is.dxw[244] = 5146087718210495032L;
        is.dxw[245] = 7322075043155698289L;
        is.dxw[246] = 3975251867907949952L;
        is.dxw[247] = 1797862776958843616L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setSilentMode(boolean var1_1) {
        v0 /* !! */  = is.u;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - is.dwq("erg", dxv(int ), (int)220));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1730629887: {
                    v1 = is.dwq("erh", dxv(int ), (int)221);
                    continue block22;
                }
                case -468651924: {
                    v1 = is.dwq("eri", dxv(int ), (int)222);
                    continue block22;
                }
                case 156730368: {
                    break block22;
                }
                case 797788501: {
                    v1 = is.dwq("erj", dxv(int ), (int)223);
                    continue block22;
                }
            }
            break;
        }
        var4_2 = is.c;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(is.dwq("erl", dxv(int ), (int)225) - is.dwq("erk", dxv(int ), (int)224));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 115241978: {
                    continue block23;
                }
                case 156730368: {
                    break block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = is.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = is.u - is.dwq("erm", dxv(int ), (int)226)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == is.dwq("ern", dwl(int ), (int)279)) break;
            v3 /* !! */  = (long)is.dwq("ero", dwl(int ), (int)280);
        }
        var2_4 = is.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        v4 /* !! */  = is.u;
        if (true) ** GOTO lbl44
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - is.dwq("erp", dxv(int ), (int)227));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -170065904: {
                    v5 = is.dwq("erq", dxv(int ), (int)228);
                    continue block26;
                }
                case 87861812: {
                    v5 = is.dwq("err", dxv(int ), (int)229);
                    continue block26;
                }
                case 156730368: {
                    break block26;
                }
            }
            break;
        }
        this.silentMode = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)is.dwq("ers", dwl(int ), (int)281);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl65:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)is.dwq("ert", dwl(int ), (int)282);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)is.dwq("eru", dwl(int ), (int)283);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl74:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)is.dwq("erv", dwl(int ), (int)284);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)is.dwq("erw", dwl(int ), (int)285);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void etf() {
        is.dwn[0] = -2007719007;
        is.dwn[1] = 1334665946;
        is.dwn[2] = 541343331;
        is.dwn[3] = -504613114;
        is.dwn[4] = 758746279;
        is.dwn[5] = 5248889;
        is.dwn[6] = 518564443;
        is.dwn[7] = 2056811581;
        is.dwn[8] = 384249096;
        is.dwn[9] = 356252615;
        is.dwn[10] = 523057406;
        is.dwn[11] = 1047144547;
        is.dwn[12] = -628809943;
        is.dwn[13] = 1777627728;
        is.dwn[14] = 1320493297;
        is.dwn[15] = -1835413990;
        is.dwn[16] = 793679903;
        is.dwn[17] = -1988684740;
        is.dwn[18] = -455579808;
        is.dwn[19] = 1386604668;
        is.dwn[20] = -460535750;
        is.dwn[21] = 1249097091;
        is.dwn[22] = 630132303;
        is.dwn[23] = 1187937620;
        is.dwn[24] = 450749527;
        is.dwn[25] = 1350745785;
        is.dwn[26] = -1955349244;
        is.dwn[27] = 545516794;
        is.dwn[28] = -769274113;
        is.dwn[29] = -718556452;
        is.dwn[30] = -827000285;
        is.dwn[31] = -455041160;
        is.dwn[32] = -1587934621;
        is.dwn[33] = 1280958205;
        is.dwn[34] = 940145963;
        is.dwn[35] = 341164129;
        is.dwn[36] = -1252599362;
        is.dwn[37] = -929474240;
        is.dwn[38] = -1898466899;
        is.dwn[39] = 13844339;
        is.dwn[40] = -986771136;
        is.dwn[41] = 1037148737;
        is.dwn[42] = -764771052;
        is.dwn[43] = 1024417011;
        is.dwn[44] = 1049809943;
        is.dwn[45] = -251633945;
        is.dwn[46] = -564628233;
        is.dwn[47] = -64194871;
        is.dwn[48] = 1442617266;
        is.dwn[49] = -1443927054;
        is.dwn[50] = -128610896;
        is.dwn[51] = -1111101794;
        is.dwn[52] = -51551478;
        is.dwn[53] = -225972378;
        is.dwn[54] = -1715379459;
        is.dwn[55] = -274526580;
        is.dwn[56] = 190726884;
        is.dwn[57] = 2124703957;
        is.dwn[58] = 1325344844;
        is.dwn[59] = -1682976395;
        is.dwn[60] = 1118045845;
        is.dwn[61] = 966589422;
        is.dwn[62] = -2066157247;
        is.dwn[63] = -1169836544;
        is.dwn[64] = 59323293;
        is.dwn[65] = 2116369625;
        is.dwn[66] = 210958175;
        is.dwn[67] = -1645355500;
        is.dwn[68] = -1513788659;
        is.dwn[69] = 448378427;
        is.dwn[70] = 780892454;
        is.dwn[71] = 777212226;
        is.dwn[72] = 192401747;
        is.dwn[73] = -573219284;
        is.dwn[74] = 2034862264;
        is.dwn[75] = 2009688911;
        is.dwn[76] = 229569199;
        is.dwn[77] = 255089384;
        is.dwn[78] = -2038119512;
        is.dwn[79] = -1242359476;
        is.dwn[80] = 1805519453;
        is.dwn[81] = 960634473;
        is.dwn[82] = 1350729441;
        is.dwn[83] = -785433468;
        is.dwn[84] = 1238493134;
        is.dwn[85] = -371783661;
        is.dwn[86] = -557675689;
        is.dwn[87] = -410956728;
        is.dwn[88] = -484504376;
        is.dwn[89] = 806599950;
        is.dwn[90] = 93163705;
        is.dwn[91] = 1000971936;
        is.dwn[92] = 1838713569;
        is.dwn[93] = -463961737;
        is.dwn[94] = -1129976500;
        is.dwn[95] = -1064700248;
        is.dwn[96] = 1632953334;
        is.dwn[97] = -56271862;
        is.dwn[98] = -136984893;
        is.dwn[99] = 299872423;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isReallyWorldMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eph", dxv(int ), (int)194)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("epi", dwl(int ), (int)254)) break;
            v0 /* !! */  = (long)is.dwq("epj", dwl(int ), (int)255);
        }
        var3_1 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - is.dwq("epk", dxv(int ), (int)195));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2119271799: {
                    v2 = is.dwq("epl", dxv(int ), (int)196);
                    continue block17;
                }
                case -1648145461: {
                    v2 = is.dwq("epm", dxv(int ), (int)197);
                    continue block17;
                }
                case -573422522: {
                    v2 = is.dwq("epn", dxv(int ), (int)198);
                    continue block17;
                }
                case 156730368: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        v3 /* !! */  = is.u;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(is.dwq("epp", dxv(int ), (int)200) - is.dwq("epo", dxv(int ), (int)199));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1990387227: {
                    continue block18;
                }
                case 156730368: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (boolean)is.dwq("epq", dwl(int ), (int)256);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = is.u - is.dwq("epr", dxv(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == is.dwq("eps", dwl(int ), (int)257)) break;
                    v4 /* !! */  = (long)is.dwq("ept", dwl(int ), (int)258);
                }
                return this.reallyWorldMode;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("epu", dwl(int ), (int)259);
                } while (!var3_1);
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)is.dwq("epv", dwl(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)is.dwq("epw", dwl(int ), (int)261);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)is.dwq("epx", dwl(int ), (int)262);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void eth() {
        is.dwn[200] = -1320168382;
        is.dwn[201] = -128096701;
        is.dwn[202] = 543028985;
        is.dwn[203] = 409636429;
        is.dwn[204] = -1735574951;
        is.dwn[205] = -113062136;
        is.dwn[206] = 381794096;
        is.dwn[207] = -2140365360;
        is.dwn[208] = -1613999956;
        is.dwn[209] = 1779871508;
        is.dwn[210] = 1305476313;
        is.dwn[211] = 1907039953;
        is.dwn[212] = 487592819;
        is.dwn[213] = 379375704;
        is.dwn[214] = -1104499067;
        is.dwn[215] = -153966039;
        is.dwn[216] = -2101252795;
        is.dwn[217] = 641174113;
        is.dwn[218] = -1200090769;
        is.dwn[219] = 1389761401;
        is.dwn[220] = 1022295474;
        is.dwn[221] = -1529383144;
        is.dwn[222] = -143472526;
        is.dwn[223] = 870308435;
        is.dwn[224] = 1963418940;
        is.dwn[225] = 1300470312;
        is.dwn[226] = 1198226418;
        is.dwn[227] = -1085504160;
        is.dwn[228] = 1950525811;
        is.dwn[229] = 593748918;
        is.dwn[230] = -1116583557;
        is.dwn[231] = -1199745152;
        is.dwn[232] = -717054423;
        is.dwn[233] = -402162693;
        is.dwn[234] = -270143358;
        is.dwn[235] = -768863586;
        is.dwn[236] = 458667790;
        is.dwn[237] = -944937060;
        is.dwn[238] = -947261821;
        is.dwn[239] = 720382507;
        is.dwn[240] = 1480542115;
        is.dwn[241] = 519096929;
        is.dwn[242] = 472459143;
        is.dwn[243] = -858654464;
        is.dwn[244] = 70364497;
        is.dwn[245] = -1506699778;
        is.dwn[246] = -1190893300;
        is.dwn[247] = -1145600983;
        is.dwn[248] = 1760054756;
        is.dwn[249] = -1777429595;
        is.dwn[250] = -709834791;
        is.dwn[251] = 1718851564;
        is.dwn[252] = -1308706865;
        is.dwn[253] = -1001684782;
        is.dwn[254] = 367546529;
        is.dwn[255] = 512010391;
        is.dwn[256] = 2098300200;
        is.dwn[257] = -674030607;
        is.dwn[258] = -2108307228;
        is.dwn[259] = -223268660;
        is.dwn[260] = 1875333421;
        is.dwn[261] = -535224677;
        is.dwn[262] = 1873060331;
        is.dwn[263] = 461363573;
        is.dwn[264] = -517809462;
        is.dwn[265] = -200769421;
        is.dwn[266] = 896863665;
        is.dwn[267] = -623562733;
        is.dwn[268] = 530428491;
        is.dwn[269] = 31283823;
        is.dwn[270] = 2077975119;
        is.dwn[271] = 429673008;
        is.dwn[272] = -737382252;
        is.dwn[273] = -75315574;
        is.dwn[274] = 2037385319;
        is.dwn[275] = 1985708166;
        is.dwn[276] = 1035718279;
        is.dwn[277] = -445336913;
        is.dwn[278] = -98334099;
        is.dwn[279] = 1966609997;
        is.dwn[280] = 1012187150;
        is.dwn[281] = 290821725;
        is.dwn[282] = 1779131862;
        is.dwn[283] = -1712785685;
        is.dwn[284] = -1302781532;
        is.dwn[285] = -668747795;
        is.dwn[286] = 1710984143;
        is.dwn[287] = -1278707793;
        is.dwn[288] = 713365985;
        is.dwn[289] = 632187780;
        is.dwn[290] = 393142422;
        is.dwn[291] = 1566480020;
        is.dwn[292] = 548165235;
        is.dwn[293] = 1306112381;
        is.dwn[294] = 1896504853;
        is.dwn[295] = 1000033101;
        is.dwn[296] = -1069782825;
        is.dwn[297] = 147830837;
        is.dwn[298] = -511583986;
        is.dwn[299] = -1206859510;
    }

    private static /* synthetic */ void ets() {
        is.dxx[200] = -147909131821998747L;
        is.dxx[201] = -8796964735210939262L;
        is.dxx[202] = 8739483141860903597L;
        is.dxx[203] = 2283274272482778342L;
        is.dxx[204] = -6382045358202100958L;
        is.dxx[205] = -5526803820664658309L;
        is.dxx[206] = -2163443774030225100L;
        is.dxx[207] = 179830115157490371L;
        is.dxx[208] = -1014125666553973024L;
        is.dxx[209] = -3475413830789766855L;
        is.dxx[210] = -890691970954635211L;
        is.dxx[211] = 7382815221912719020L;
        is.dxx[212] = 5372546191388806648L;
        is.dxx[213] = 9064590724690550000L;
        is.dxx[214] = -7872068636599825426L;
        is.dxx[215] = -8646569576268028746L;
        is.dxx[216] = 3822531613033717334L;
        is.dxx[217] = 2578408164104253532L;
        is.dxx[218] = -8190293487401143078L;
        is.dxx[219] = -6793394448968766665L;
        is.dxx[220] = 4806082366848341797L;
        is.dxx[221] = 2040127817435818109L;
        is.dxx[222] = 4397230767241059652L;
        is.dxx[223] = -457157829087059795L;
        is.dxx[224] = -6128026807966131598L;
        is.dxx[225] = 5211901130360425598L;
        is.dxx[226] = 5672454799320174110L;
        is.dxx[227] = 5449755004478552543L;
        is.dxx[228] = 4985424114586310790L;
        is.dxx[229] = -8060707803209625839L;
        is.dxx[230] = 1139159628997294092L;
        is.dxx[231] = 8577604137278091749L;
        is.dxx[232] = -1990114626327866884L;
        is.dxx[233] = -4132832889900293873L;
        is.dxx[234] = -8202203625158268970L;
        is.dxx[235] = 3564056178954608247L;
        is.dxx[236] = 1661451350022000412L;
        is.dxx[237] = 2747389947505211141L;
        is.dxx[238] = 8833157399307408438L;
        is.dxx[239] = 8082119893100696949L;
        is.dxx[240] = 8332323291898554297L;
        is.dxx[241] = 2706953875670295666L;
        is.dxx[242] = 4654825248329236939L;
        is.dxx[243] = 2623618994238727726L;
        is.dxx[244] = 750052286036336292L;
        is.dxx[245] = -1439853982452017365L;
        is.dxx[246] = 8669670138872766260L;
        is.dxx[247] = -5246909397450374673L;
    }

    private static /* synthetic */ void etm() {
        is.dwp[300] = 1990873628;
        is.dwp[301] = -141417171;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void handleAttacking(class_1309 var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("egv", dxv(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == is.dwq("egw", dwl(int ), (int)146)) break;
            v0 /* !! */  = (long)is.dwq("egx", dwl(int ), (int)147);
        }
        var6_3 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl11
        block95: while (true) {
            v1 /* !! */  = (long)(is.dwq("egz", dxv(int ), (int)84) - is.dwq("egy", dxv(int ), (int)83));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 156730368: {
                    break block95;
                }
                case 1394388677: {
                    continue block95;
                }
            }
            break;
        }
        var5_4 /* !! */  = is.b;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl21
        block96: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("eha", dxv(int ), (int)85));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2058944902: {
                    v3 = is.dwq("ehb", dxv(int ), (int)86);
                    continue block96;
                }
                case 156730368: {
                    break block96;
                }
                case 737635508: {
                    v3 = is.dwq("ehc", dxv(int ), (int)87);
                    continue block96;
                }
            }
            break;
        }
        var4_5 = is.a;
        if (var6_3) {
            throw null;
lbl33:
            // 15 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl33
        if (!var2_2) ** GOTO lbl107
        if (var4_5) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = is.u - is.dwq("ehd", dxv(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == is.dwq("ehe", dwl(int ), (int)148)) break;
            v4 /* !! */  = (long)is.dwq("ehf", dwl(int ), (int)149);
        }
        v5 /* !! */  = is.u;
        if (true) ** GOTO lbl47
        block99: while (true) {
            v5 /* !! */  = (long)(v6 - is.dwq("ehg", dxv(int ), (int)89));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 156730368: {
                    break block99;
                }
                case 307636173: {
                    v6 = is.dwq("ehh", dxv(int ), (int)90);
                    continue block99;
                }
                case 600799692: {
                    v6 = is.dwq("ehi", dxv(int ), (int)91);
                    continue block99;
                }
            }
            break;
        }
        if (this.armorSwapHandler.isActive()) ** GOTO lbl107
        if (var4_5 || var4_5) ** GOTO lbl33
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = is.u - is.dwq("ehj", dxv(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == is.dwq("ehk", dwl(int ), (int)150)) break;
            v7 /* !! */  = (long)is.dwq("ehl", dwl(int ), (int)151);
        }
        var3_6 = nv.findChestArmorSlot();
        if (var4_5 || var4_5) ** GOTO lbl33
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_6 == is.dwq("ehm", dwl(int ), (int)152)) ** GOTO lbl107
                if (var4_5 || var4_5) ** GOTO lbl33
                v8 /* !! */  = is.u;
                if (true) ** GOTO lbl74
                block101: while (true) {
                    v8 /* !! */  = (long)(v9 - is.dwq("ehn", dxv(int ), (int)93));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 156730368: {
                            break block101;
                        }
                        case 879036557: {
                            v9 = is.dwq("eho", dxv(int ), (int)94);
                            continue block101;
                        }
                        case 1171843484: {
                            v9 = is.dwq("ehp", dxv(int ), (int)95);
                            continue block101;
                        }
                        case 1996145646: {
                            v9 = is.dwq("ehq", dxv(int ), (int)96);
                            continue block101;
                        }
                    }
                    break;
                }
                v10 /* !! */  = is.u;
                if (true) ** GOTO lbl90
                block102: while (true) {
                    v10 /* !! */  = (long)(v11 - is.dwq("ehr", dxv(int ), (int)97));
lbl90:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1588029025: {
                            v11 = is.dwq("ehs", dxv(int ), (int)98);
                            continue block102;
                        }
                        case -353600717: {
                            v11 = is.dwq("eht", dxv(int ), (int)99);
                            continue block102;
                        }
                        case 156730368: {
                            break block102;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = is.u - is.dwq("ehu", dxv(int ), (int)100)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == is.dwq("ehv", dwl(int ), (int)153)) break;
                    v12 /* !! */  = (long)is.dwq("ehw", dwl(int ), (int)154);
                }
                this.armorSwapHandler.startSwap(var3_6, this.silentMode);
                if (var4_5 || var4_5) ** GOTO lbl33
                return;
lbl107:
                // 3 sources

                if (var4_5 || var4_5) ** GOTO lbl33
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = is.u - is.dwq("ehx", dxv(int ), (int)101)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == is.dwq("ehy", dwl(int ), (int)155)) break;
                    v13 /* !! */  = (long)is.dwq("ehz", dwl(int ), (int)156);
                }
                v14 /* !! */  = is.u;
                if (true) ** GOTO lbl117
                block105: while (true) {
                    v14 /* !! */  = (long)(is.dwq("eib", dxv(int ), (int)103) - is.dwq("eia", dxv(int ), (int)102));
lbl117:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -972328084: {
                            continue block105;
                        }
                        case 156730368: {
                            break block105;
                        }
                    }
                    break;
                }
                if (!this.armorSwapHandler.isActive()) ** GOTO lbl125
                if (var4_5) ** GOTO lbl33
                return;
lbl125:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl33
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = is.u - is.dwq("eic", dxv(int ), (int)104)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == is.dwq("eid", dwl(int ), (int)157)) break;
                    v15 /* !! */  = (long)is.dwq("eie", dwl(int ), (int)158);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = is.u - is.dwq("eif", dxv(int ), (int)105)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == is.dwq("eig", dwl(int ), (int)159)) break;
                    v16 /* !! */  = (long)is.dwq("eih", dwl(int ), (int)160);
                }
                this.attackHandler.holdMace();
                if (var4_5 || var4_5) ** GOTO lbl33
                v17 /* !! */  = is.u;
                if (true) ** GOTO lbl142
                block108: while (true) {
                    v17 /* !! */  = (long)(is.dwq("eij", dxv(int ), (int)107) - is.dwq("eii", dxv(int ), (int)106));
lbl142:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 156730368: {
                            break block108;
                        }
                        case 542527987: {
                            continue block108;
                        }
                    }
                    break;
                }
                v18 /* !! */  = is.u;
                if (true) ** GOTO lbl151
                block109: while (true) {
                    v18 /* !! */  = (long)(is.dwq("eil", dxv(int ), (int)109) - is.dwq("eik", dxv(int ), (int)108));
lbl151:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -719433169: {
                            continue block109;
                        }
                        case 156730368: {
                            break block109;
                        }
                    }
                    break;
                }
                v19 = is.mc.field_1724;
                v20 /* !! */  = is.u;
                if (true) ** GOTO lbl161
                block110: while (true) {
                    v20 /* !! */  = (long)(v21 - is.dwq("eim", dxv(int ), (int)110));
lbl161:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2083238954: {
                            v21 = is.dwq("ein", dxv(int ), (int)111);
                            continue block110;
                        }
                        case -29802600: {
                            v21 = is.dwq("eio", dxv(int ), (int)112);
                            continue block110;
                        }
                        case 156730368: {
                            break block110;
                        }
                    }
                    break;
                }
                if (!v19.method_24828()) ** GOTO lbl248
                if (var4_5) ** GOTO lbl33
                v22 /* !! */  = is.u;
                if (true) ** GOTO lbl176
                block111: while (true) {
                    v22 /* !! */  = (long)(v23 - is.dwq("eip", dxv(int ), (int)113));
lbl176:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1534477555: {
                            v23 = is.dwq("eiq", dxv(int ), (int)114);
                            continue block111;
                        }
                        case 156730368: {
                            break block111;
                        }
                        case 766984941: {
                            v23 = is.dwq("eir", dxv(int ), (int)115);
                            continue block111;
                        }
                    }
                    break;
                }
                v24 /* !! */  = is.u;
                if (true) ** GOTO lbl189
                block112: while (true) {
                    v24 /* !! */  = (long)(v25 - is.dwq("eis", dxv(int ), (int)116));
lbl189:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1213063980: {
                            v25 = is.dwq("eit", dxv(int ), (int)117);
                            continue block112;
                        }
                        case -1208694072: {
                            v25 = is.dwq("eiu", dxv(int ), (int)118);
                            continue block112;
                        }
                        case -503962101: {
                            v25 = is.dwq("eiv", dxv(int ), (int)119);
                            continue block112;
                        }
                        case 156730368: {
                            break block112;
                        }
                    }
                    break;
                }
                v26 = is.mc.field_1724;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = is.u - is.dwq("eiw", dxv(int ), (int)120)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == is.dwq("eix", dwl(int ), (int)161)) break;
                    v27 /* !! */  = (long)is.dwq("eiy", dwl(int ), (int)162);
                }
                if (!(v26.method_5739((class_1297)var1_1) > is.dwq("eiz", dww(int ), (int)163))) ** GOTO lbl248
                if (var4_5 || var4_5) ** GOTO lbl33
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = is.u - is.dwq("eja", dxv(int ), (int)121)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == is.dwq("ejb", dwl(int ), (int)164)) break;
                    v28 /* !! */  = (long)is.dwq("ejc", dwl(int ), (int)165);
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = is.u - is.dwq("ejd", dxv(int ), (int)122)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == is.dwq("eje", dwl(int ), (int)166)) break;
                    v29 /* !! */  = (long)is.dwq("ejf", dwl(int ), (int)167);
                }
                this.stage = it$Stage.FLYING_UP;
                if (var4_5 || var4_5) ** GOTO lbl33
                v30 /* !! */  = is.u;
                if (true) ** GOTO lbl225
                block116: while (true) {
                    v30 /* !! */  = (long)(v31 - is.dwq("ejg", dxv(int ), (int)123));
lbl225:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1768046447: {
                            v31 = is.dwq("ejh", dxv(int ), (int)124);
                            continue block116;
                        }
                        case -1236411722: {
                            v31 = is.dwq("eji", dxv(int ), (int)125);
                            continue block116;
                        }
                        case 156730368: {
                            break block116;
                        }
                        case 448835446: {
                            v31 = is.dwq("ejj", dxv(int ), (int)126);
                            continue block116;
                        }
                    }
                    break;
                }
                v32 /* !! */  = is.u;
                if (true) ** GOTO lbl241
                block117: while (true) {
                    v32 /* !! */  = (long)(is.dwq("ejl", dxv(int ), (int)128) - is.dwq("ejk", dxv(int ), (int)127));
lbl241:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case 156730368: {
                            break block117;
                        }
                        case 1547557500: {
                            continue block117;
                        }
                    }
                    break;
                }
                this.fireworkTimer.reset();
                if (var4_5) ** GOTO lbl33
lbl248:
                // 3 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl251:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)is.dwq("ejm", dwl(int ), (int)168);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl256:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)is.dwq("ejn", dwl(int ), (int)169);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 2: {
                var5_4 /* !! */  = (int)is.dwq("ejo", dwl(int ), (int)170);
                if (!var6_3) ** GOTO lbl251
                throw null;
            }
lbl265:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)is.dwq("ejp", dwl(int ), (int)171);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl347
                    break;
                }
            }
            case 4: {
                var5_4 /* !! */  = (int)is.dwq("ejq", dwl(int ), (int)172);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 5: {
                var5_4 /* !! */  = (int)is.dwq("ejr", dwl(int ), (int)173);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 6: {
                var5_4 /* !! */  = (int)is.dwq("ejs", dwl(int ), (int)174);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 7: {
                var5_4 /* !! */  = (int)is.dwq("ejt", dwl(int ), (int)175);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl291:
            // 4 sources

            case 8: {
                var5_4 /* !! */  = (int)is.dwq("eju", dwl(int ), (int)176);
                if (var6_3) {
                    throw null;
                }
            }
            case 9: {
                var5_4 /* !! */  = (int)is.dwq("ejv", dwl(int ), (int)177);
                if (!var6_3) ** GOTO lbl291
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)is.dwq("ejw", dwl(int ), (int)178);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 11: {
                var5_4 /* !! */  = (int)is.dwq("ejx", dwl(int ), (int)179);
                if (!var6_3) ** GOTO lbl265
                throw null;
            }
lbl308:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)is.dwq("ejy", dwl(int ), (int)180);
                if (!var6_3) ** GOTO lbl291
                throw null;
            }
lbl312:
            // 5 sources

            case 13: {
                var5_4 /* !! */  = (int)is.dwq("ejz", dwl(int ), (int)181);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl364
            }
            case 14: {
                var5_4 /* !! */  = (int)is.dwq("eka", dwl(int ), (int)182);
                if (!var6_3) ** GOTO lbl291
                throw null;
            }
lbl321:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)is.dwq("ekb", dwl(int ), (int)183);
                if (!var6_3) ** GOTO lbl312
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)is.dwq("ekc", dwl(int ), (int)184);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl330:
            // 2 sources

            case 17: {
                var5_4 /* !! */  = (int)is.dwq("ekd", dwl(int ), (int)185);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl335:
            // 3 sources

            case 18: {
                var5_4 /* !! */  = (int)is.dwq("eke", dwl(int ), (int)186);
                if (!var6_3) ** GOTO lbl308
                throw null;
            }
lbl339:
            // 2 sources

            case 19: {
                var5_4 /* !! */  = (int)is.dwq("ekf", dwl(int ), (int)187);
                if (!var6_3) ** GOTO lbl330
                throw null;
            }
lbl343:
            // 3 sources

            case 20: {
                var5_4 /* !! */  = (int)is.dwq("ekg", dwl(int ), (int)188);
                if (!var6_3) ** GOTO lbl312
                throw null;
            }
lbl347:
            // 2 sources

            case 21: {
                var5_4 /* !! */  = (int)is.dwq("ekh", dwl(int ), (int)189);
                if (!var6_3) ** GOTO lbl256
                throw null;
            }
            case 22: {
                var5_4 /* !! */  = (int)is.dwq("eki", dwl(int ), (int)190);
                if (!var6_3) ** GOTO lbl321
                throw null;
            }
lbl355:
            // 2 sources

            case 23: {
                var5_4 /* !! */  = (int)is.dwq("ekj", dwl(int ), (int)191);
                if (!var6_3) ** GOTO lbl335
                throw null;
            }
lbl359:
            // 3 sources

            case 24: {
                do {
                    var5_4 /* !! */  = (int)is.dwq("ekk", dwl(int ), (int)192);
                } while (!var6_3);
                throw null;
            }
lbl364:
            // 3 sources

            case 25: {
                var5_4 /* !! */  = (int)is.dwq("ekl", dwl(int ), (int)193);
                if (!var6_3) ** GOTO lbl312
                throw null;
            }
            case 26: {
                var5_4 /* !! */  = (int)is.dwq("ekm", dwl(int ), (int)194);
                if (!var6_3) ** GOTO lbl265
                throw null;
            }
lbl372:
            // 2 sources

            case 27: {
                var5_4 /* !! */  = (int)is.dwq("ekn", dwl(int ), (int)195);
                if (!var6_3) ** GOTO lbl359
                throw null;
            }
            case 28: 
        }
        var5_4 /* !! */  = (int)is.dwq("eko", dwl(int ), (int)196);
        ** while (!var6_3)
lbl379:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void etn() {
        is.dxw[0] = 646096193050602597L;
        is.dxw[1] = 3230188400228042541L;
        is.dxw[2] = 4337216915579439958L;
        is.dxw[3] = -7967809165148671731L;
        is.dxw[4] = -270721695699553945L;
        is.dxw[5] = 8946147242287430498L;
        is.dxw[6] = -758842385879067117L;
        is.dxw[7] = -3925244377929647857L;
        is.dxw[8] = -5552693351795640718L;
        is.dxw[9] = -6357462759485588810L;
        is.dxw[10] = -6871221174725849620L;
        is.dxw[11] = -4680181245170607190L;
        is.dxw[12] = -304752221592325317L;
        is.dxw[13] = 8725023184011156444L;
        is.dxw[14] = -4489215334210792640L;
        is.dxw[15] = -447028735337937057L;
        is.dxw[16] = 3261381637713191004L;
        is.dxw[17] = 7037529869192052301L;
        is.dxw[18] = 6429817535214535619L;
        is.dxw[19] = -6959736000761664163L;
        is.dxw[20] = -5367317088036385954L;
        is.dxw[21] = -4714681685234086050L;
        is.dxw[22] = -7997860211700504499L;
        is.dxw[23] = 426244530951496135L;
        is.dxw[24] = 3962793343901997848L;
        is.dxw[25] = -6846631467313886957L;
        is.dxw[26] = -5898853851729243912L;
        is.dxw[27] = -4453277854654917464L;
        is.dxw[28] = 3925053166633841671L;
        is.dxw[29] = 2063349739880925329L;
        is.dxw[30] = -7044612683561590674L;
        is.dxw[31] = -568335097971331084L;
        is.dxw[32] = 7705384277000028720L;
        is.dxw[33] = 6869243538987990966L;
        is.dxw[34] = 4117766643949575847L;
        is.dxw[35] = -4934697718738060795L;
        is.dxw[36] = 7672096833805821091L;
        is.dxw[37] = -1015790606596915157L;
        is.dxw[38] = 2100646945458813302L;
        is.dxw[39] = 3956918677365572523L;
        is.dxw[40] = -4304800247785079605L;
        is.dxw[41] = -5788129804229007113L;
        is.dxw[42] = -8899516172810933107L;
        is.dxw[43] = -4706960229617200009L;
        is.dxw[44] = 1428338207656247418L;
        is.dxw[45] = -5952779861096055574L;
        is.dxw[46] = 8048006132634155658L;
        is.dxw[47] = 1390688886957429761L;
        is.dxw[48] = 5798652152354619460L;
        is.dxw[49] = -5495099753491675200L;
        is.dxw[50] = 794352999709718250L;
        is.dxw[51] = 5309351970833350354L;
        is.dxw[52] = 7902704442508588122L;
        is.dxw[53] = -8333552957479630310L;
        is.dxw[54] = 8636556646153165592L;
        is.dxw[55] = 2226517392464520897L;
        is.dxw[56] = -8428853776461472586L;
        is.dxw[57] = -9115064385064941333L;
        is.dxw[58] = 3083043748178320967L;
        is.dxw[59] = 5654381257932597355L;
        is.dxw[60] = 5546310129790627880L;
        is.dxw[61] = -7833890832308807586L;
        is.dxw[62] = -3508944514950034398L;
        is.dxw[63] = 2564588945028058402L;
        is.dxw[64] = -237963007843297499L;
        is.dxw[65] = 736907474794624541L;
        is.dxw[66] = -6732591134646047980L;
        is.dxw[67] = -3622870097797682116L;
        is.dxw[68] = -2530223366096520261L;
        is.dxw[69] = -6563408561821797263L;
        is.dxw[70] = 3942204878684623427L;
        is.dxw[71] = -1635984640085642725L;
        is.dxw[72] = 7781700143103273272L;
        is.dxw[73] = 8800310620335001159L;
        is.dxw[74] = -4598838568685428757L;
        is.dxw[75] = 2180971280472206956L;
        is.dxw[76] = 2535774433172240308L;
        is.dxw[77] = 8424517931039870164L;
        is.dxw[78] = -3721738795260719938L;
        is.dxw[79] = 6408024895603359014L;
        is.dxw[80] = -3094544647328735634L;
        is.dxw[81] = 8168302473978853825L;
        is.dxw[82] = -3375715920143687462L;
        is.dxw[83] = -3126925377010633072L;
        is.dxw[84] = -8548723858808638987L;
        is.dxw[85] = 3602197220342330455L;
        is.dxw[86] = 4529783923299678718L;
        is.dxw[87] = -2423040204914465580L;
        is.dxw[88] = 8892136454976065619L;
        is.dxw[89] = -3625356209543358293L;
        is.dxw[90] = -2253832298503800809L;
        is.dxw[91] = -797047301684061102L;
        is.dxw[92] = 7544207990091142999L;
        is.dxw[93] = 2998178852476196803L;
        is.dxw[94] = 8372724692912699834L;
        is.dxw[95] = 4504564277030985022L;
        is.dxw[96] = 8119811098607498461L;
        is.dxw[97] = 9177833493198289681L;
        is.dxw[98] = -5027187598699482544L;
        is.dxw[99] = -2791195700503350767L;
    }

    private static /* synthetic */ void eto() {
        is.dxw[100] = -6003171011091373242L;
        is.dxw[101] = 4508726681038795046L;
        is.dxw[102] = -3876051340327676799L;
        is.dxw[103] = 4866336561581677737L;
        is.dxw[104] = -6849783182625154533L;
        is.dxw[105] = 518216445515286601L;
        is.dxw[106] = -5878684399998921091L;
        is.dxw[107] = -7728755624420123129L;
        is.dxw[108] = -6490968419332590120L;
        is.dxw[109] = -2806343213784738779L;
        is.dxw[110] = -8713015218071927406L;
        is.dxw[111] = 60635879357903104L;
        is.dxw[112] = 3886127966506080935L;
        is.dxw[113] = -5867599414461816936L;
        is.dxw[114] = -4091096621439113023L;
        is.dxw[115] = -8778119581138752870L;
        is.dxw[116] = 6892176565416385242L;
        is.dxw[117] = -1831347307478567882L;
        is.dxw[118] = 2232106335637905685L;
        is.dxw[119] = -7509512863576797443L;
        is.dxw[120] = -1257758981411867575L;
        is.dxw[121] = -1260750267545813935L;
        is.dxw[122] = -2421457072906210716L;
        is.dxw[123] = 8921126741952515228L;
        is.dxw[124] = 5753244671059304333L;
        is.dxw[125] = 5455332801776843096L;
        is.dxw[126] = 5900866930581504129L;
        is.dxw[127] = -7615825265213115026L;
        is.dxw[128] = 5914697283462954848L;
        is.dxw[129] = -8967662852371010116L;
        is.dxw[130] = 518982434427989712L;
        is.dxw[131] = 3000269408987605868L;
        is.dxw[132] = 8101022763833302341L;
        is.dxw[133] = 304798734684875061L;
        is.dxw[134] = -9028555796560772092L;
        is.dxw[135] = -7415290088332918910L;
        is.dxw[136] = -6832930324775538952L;
        is.dxw[137] = 3537198805211782166L;
        is.dxw[138] = -5217576182552542904L;
        is.dxw[139] = 627408570339103037L;
        is.dxw[140] = 4433568316845174633L;
        is.dxw[141] = 6875167783685303712L;
        is.dxw[142] = 4939735098855361528L;
        is.dxw[143] = -7788400833850773865L;
        is.dxw[144] = 48130338019067076L;
        is.dxw[145] = -4643056455403506778L;
        is.dxw[146] = -1035922894029945271L;
        is.dxw[147] = 8063104646191460171L;
        is.dxw[148] = -6526637176800948004L;
        is.dxw[149] = -2553489417482576821L;
        is.dxw[150] = -8029489302914544554L;
        is.dxw[151] = -2286223668315385361L;
        is.dxw[152] = -5820767931503113077L;
        is.dxw[153] = -150600697560009888L;
        is.dxw[154] = -795502571439144371L;
        is.dxw[155] = 7439351357303563002L;
        is.dxw[156] = 7489428873857051046L;
        is.dxw[157] = -2770829590270945941L;
        is.dxw[158] = -3657942824213003798L;
        is.dxw[159] = -385277653768278456L;
        is.dxw[160] = 6708263965606291339L;
        is.dxw[161] = 8579861556215972132L;
        is.dxw[162] = 6179839574014670298L;
        is.dxw[163] = 6118743398752709595L;
        is.dxw[164] = 9090502382043351606L;
        is.dxw[165] = 4914951028910079013L;
        is.dxw[166] = -8042288663525648673L;
        is.dxw[167] = 5097737742441075830L;
        is.dxw[168] = -411028539379961954L;
        is.dxw[169] = 4838042937102074119L;
        is.dxw[170] = 6755182189918321991L;
        is.dxw[171] = -1712169522348658546L;
        is.dxw[172] = 2583354149169114650L;
        is.dxw[173] = 2706544245139362986L;
        is.dxw[174] = -1614915976354468150L;
        is.dxw[175] = -7437515401092322984L;
        is.dxw[176] = 6163859417909968593L;
        is.dxw[177] = 3294584247370632731L;
        is.dxw[178] = 6116367188722833897L;
        is.dxw[179] = 3477504681645051080L;
        is.dxw[180] = -1924613567194971892L;
        is.dxw[181] = 2985531692846325821L;
        is.dxw[182] = 1593738346621256966L;
        is.dxw[183] = -9145180281011720037L;
        is.dxw[184] = -528240525295101075L;
        is.dxw[185] = 6590203460386946592L;
        is.dxw[186] = -654712846077332182L;
        is.dxw[187] = 3207825128937323168L;
        is.dxw[188] = 7757407331079015026L;
        is.dxw[189] = 6260460894585323131L;
        is.dxw[190] = -5926748150927623834L;
        is.dxw[191] = -8741620883666279145L;
        is.dxw[192] = -5481376352289850614L;
        is.dxw[193] = -3411069973561143874L;
        is.dxw[194] = 6190079471934044524L;
        is.dxw[195] = 207811173471758683L;
        is.dxw[196] = 148707879434359934L;
        is.dxw[197] = -7611935843875325851L;
        is.dxw[198] = -4632340504853166115L;
        is.dxw[199] = 5161538480447474688L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("ekp", dxv(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == is.dwq("ekq", dwl(int ), (int)197)) break;
            v0 /* !! */  = (long)is.dwq("ekr", dwl(int ), (int)198);
        }
        var3_1 = is.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = is.u - is.dwq("eks", dxv(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == is.dwq("ekt", dwl(int ), (int)199)) break;
            v1 /* !! */  = (long)is.dwq("eku", dwl(int ), (int)200);
        }
        var2_2 /* !! */  = is.b;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl17
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("ekv", dxv(int ), (int)131));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1600281108: {
                    v3 = is.dwq("ekw", dxv(int ), (int)132);
                    continue block16;
                }
                case 156730368: {
                    break block16;
                }
                case 330568958: {
                    v3 = is.dwq("ekx", dxv(int ), (int)133);
                    continue block16;
                }
                case 2051148711: {
                    v3 = is.dwq("eky", dxv(int ), (int)134);
                    continue block16;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = is.u - is.dwq("ekz", dxv(int ), (int)135)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == is.dwq("ela", dwl(int ), (int)201)) break;
            v4 /* !! */  = (long)is.dwq("elb", dwl(int ), (int)202);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = is.u - is.dwq("elc", dxv(int ), (int)136)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == is.dwq("eld", dwl(int ), (int)203)) break;
            v5 /* !! */  = (long)is.dwq("ele", dwl(int ), (int)204);
        }
        this.stage = it$Stage.PREPARE;
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)is.dwq("elf", dwl(int ), (int)205);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("elg", dwl(int ), (int)206);
                } while (!var3_1);
                throw null;
            }
lbl62:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)is.dwq("elh", dwl(int ), (int)207);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)is.dwq("eli", dwl(int ), (int)208);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("elj", dwl(int ), (int)209);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)is.dwq("elk", dwl(int ), (int)210);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ip getAttackHandler() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("emt", dxv(int ), (int)159)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("emu", dwl(int ), (int)223)) break;
            v0 /* !! */  = (long)is.dwq("emv", dwl(int ), (int)224);
        }
        var3_1 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - is.dwq("emw", dxv(int ), (int)160));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1941170429: {
                    v2 = is.dwq("emx", dxv(int ), (int)161);
                    continue block13;
                }
                case -1428247300: {
                    v2 = is.dwq("emy", dxv(int ), (int)162);
                    continue block13;
                }
                case 47725527: {
                    v2 = is.dwq("emz", dxv(int ), (int)163);
                    continue block13;
                }
                case 156730368: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = is.u - is.dwq("ena", dxv(int ), (int)164)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == is.dwq("enb", dwl(int ), (int)225)) break;
            v3 /* !! */  = (long)is.dwq("enc", dwl(int ), (int)226);
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = is.u - is.dwq("end", dxv(int ), (int)165)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == is.dwq("ene", dwl(int ), (int)227)) break;
                    v4 /* !! */  = (long)is.dwq("enf", dwl(int ), (int)228);
                }
                return this.attackHandler;
            }
            case 0: {
                var2_2 /* !! */  = (int)is.dwq("eng", dwl(int ), (int)229);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                var2_2 /* !! */  = (int)is.dwq("enh", dwl(int ), (int)230);
                if (var3_1) {
                    throw null;
                }
            }
lbl56:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("eni", dwl(int ), (int)231);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)is.dwq("enj", dwl(int ), (int)232);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getHeight() {
        v0 /* !! */  = is.u;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - is.dwq("epy", dxv(int ), (int)202));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -736620849: {
                    v1 = is.dwq("epz", dxv(int ), (int)203);
                    continue block22;
                }
                case 156730368: {
                    break block22;
                }
                case 706313635: {
                    v1 = is.dwq("eqa", dxv(int ), (int)204);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = is.c;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("eqb", dxv(int ), (int)205));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 156730368: {
                    break block23;
                }
                case 247432078: {
                    v3 = is.dwq("eqc", dxv(int ), (int)206);
                    continue block23;
                }
                case 1047733454: {
                    v3 = is.dwq("eqd", dxv(int ), (int)207);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eqe", dxv(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == is.dwq("eqf", dwl(int ), (int)263)) break;
            v4 /* !! */  = (long)is.dwq("eqg", dwl(int ), (int)264);
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (float)is.dwq("eqh", dww(int ), (int)265);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = is.u;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - is.dwq("eqi", dxv(int ), (int)209));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1625549064: {
                            v6 = is.dwq("eqj", dxv(int ), (int)210);
                            continue block26;
                        }
                        case 156730368: {
                            break block26;
                        }
                        case 221674347: {
                            v6 = is.dwq("eqk", dxv(int ), (int)211);
                            continue block26;
                        }
                        case 836675416: {
                            v6 = is.dwq("eql", dxv(int ), (int)212);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.height;
            }
            case 0: {
                var2_2 /* !! */  = (int)is.dwq("eqm", dwl(int ), (int)266);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("eqn", dwl(int ), (int)267);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)is.dwq("eqo", dwl(int ), (int)268);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)is.dwq("eqp", dwl(int ), (int)269);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite dwq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void etj() {
        is.dwp[0] = -2007719008;
        is.dwp[1] = 1334665946;
        is.dwp[2] = 1639202403;
        is.dwp[3] = -504613119;
        is.dwp[4] = 758746277;
        is.dwp[5] = 5248880;
        is.dwp[6] = 518564442;
        is.dwp[7] = 2056811581;
        is.dwp[8] = 384249103;
        is.dwp[9] = 356252609;
        is.dwp[10] = 523057396;
        is.dwp[11] = 1047144555;
        is.dwp[12] = -628809951;
        is.dwp[13] = 1777627732;
        is.dwp[14] = 1320493296;
        is.dwp[15] = 416323495;
        is.dwp[16] = -793679904;
        is.dwp[17] = -534062780;
        is.dwp[18] = 455579807;
        is.dwp[19] = -1386604669;
        is.dwp[20] = -50782597;
        is.dwp[21] = -1249097092;
        is.dwp[22] = 407827670;
        is.dwp[23] = -1187937621;
        is.dwp[24] = 1229593654;
        is.dwp[25] = -1350745786;
        is.dwp[26] = 1683305316;
        is.dwp[27] = 545516776;
        is.dwp[28] = -769274124;
        is.dwp[29] = -718556450;
        is.dwp[30] = -827000277;
        is.dwp[31] = -455041173;
        is.dwp[32] = -1587934607;
        is.dwp[33] = 1280958202;
        is.dwp[34] = 940145962;
        is.dwp[35] = 341164128;
        is.dwp[36] = -1252599380;
        is.dwp[37] = -929474232;
        is.dwp[38] = -1898466900;
        is.dwp[39] = 13844337;
        is.dwp[40] = -986771133;
        is.dwp[41] = 1037148746;
        is.dwp[42] = -764771066;
        is.dwp[43] = 1024417022;
        is.dwp[44] = 1049809940;
        is.dwp[45] = -251633938;
        is.dwp[46] = -564628226;
        is.dwp[47] = 64194870;
        is.dwp[48] = 1913494941;
        is.dwp[49] = 1443927053;
        is.dwp[50] = 1550282249;
        is.dwp[51] = 1111101793;
        is.dwp[52] = 1428997606;
        is.dwp[53] = 225972377;
        is.dwp[54] = -764811196;
        is.dwp[55] = 274526579;
        is.dwp[56] = 1000574317;
        is.dwp[57] = -2124703958;
        is.dwp[58] = 39526996;
        is.dwp[59] = -1682976396;
        is.dwp[60] = 223427794;
        is.dwp[61] = -966589423;
        is.dwp[62] = 216769141;
        is.dwp[63] = 1169836543;
        is.dwp[64] = 979000599;
        is.dwp[65] = -2116369626;
        is.dwp[66] = 148652905;
        is.dwp[67] = -1645355499;
        is.dwp[68] = -627250222;
        is.dwp[69] = -448378428;
        is.dwp[70] = 2123835119;
        is.dwp[71] = -777212227;
        is.dwp[72] = 2143435718;
        is.dwp[73] = -573219281;
        is.dwp[74] = 2034862248;
        is.dwp[75] = 2009688906;
        is.dwp[76] = 229569196;
        is.dwp[77] = 255089385;
        is.dwp[78] = -2038119507;
        is.dwp[79] = -1242359461;
        is.dwp[80] = 1805519455;
        is.dwp[81] = 960634495;
        is.dwp[82] = 1350729463;
        is.dwp[83] = -785433466;
        is.dwp[84] = 1238493127;
        is.dwp[85] = -371783673;
        is.dwp[86] = -557675684;
        is.dwp[87] = -410956722;
        is.dwp[88] = -484504354;
        is.dwp[89] = 806599939;
        is.dwp[90] = 93163707;
        is.dwp[91] = 1000971943;
        is.dwp[92] = 1838713579;
        is.dwp[93] = -463961734;
        is.dwp[94] = -1129976497;
        is.dwp[95] = -1064700231;
        is.dwp[96] = 1632953333;
        is.dwp[97] = 56271861;
        is.dwp[98] = 560790012;
        is.dwp[99] = 1352642727;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public in getArmorSwapHandler() {
        v0 /* !! */  = is.u;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - is.dwq("ell", dxv(int ), (int)137));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -813028025: {
                    v1 = is.dwq("elm", dxv(int ), (int)138);
                    continue block23;
                }
                case 156730368: {
                    break block23;
                }
                case 237100103: {
                    v1 = is.dwq("eln", dxv(int ), (int)139);
                    continue block23;
                }
                case 379465101: {
                    v1 = is.dwq("elo", dxv(int ), (int)140);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = is.c;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("elp", dxv(int ), (int)141));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -229274864: {
                    v3 = is.dwq("elq", dxv(int ), (int)142);
                    continue block24;
                }
                case 26648937: {
                    v3 = is.dwq("elr", dxv(int ), (int)143);
                    continue block24;
                }
                case 156730368: {
                    break block24;
                }
                case 932803286: {
                    v3 = is.dwq("els", dxv(int ), (int)144);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        v4 /* !! */  = is.u;
        if (true) ** GOTO lbl39
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - is.dwq("elt", dxv(int ), (int)145));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -565457680: {
                    v5 = is.dwq("elu", dxv(int ), (int)146);
                    continue block25;
                }
                case 156730368: {
                    break block25;
                }
                case 679201660: {
                    v5 = is.dwq("elv", dxv(int ), (int)147);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl51:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = is.u - is.dwq("elw", dxv(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == is.dwq("elx", dwl(int ), (int)211)) break;
                    v6 /* !! */  = (long)is.dwq("ely", dwl(int ), (int)212);
                }
                return this.armorSwapHandler;
            }
            case 0: {
                var2_2 /* !! */  = (int)is.dwq("elz", dwl(int ), (int)213);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)is.dwq("ema", dwl(int ), (int)214);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)is.dwq("emb", dwl(int ), (int)215);
                    if (!var3_1) break block17;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)is.dwq("emc", dwl(int ), (int)216);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eti() {
        is.dwn[300] = 1990873631;
        is.dwn[301] = -141417171;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getFireworkTimer() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("enk", dxv(int ), (int)166)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("enl", dwl(int ), (int)233)) break;
            v0 /* !! */  = (long)is.dwq("enm", dwl(int ), (int)234);
        }
        var3_1 = is.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = is.u - is.dwq("enn", dxv(int ), (int)167)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == is.dwq("eno", dwl(int ), (int)235)) break;
            v1 /* !! */  = (long)is.dwq("enp", dwl(int ), (int)236);
        }
        var2_2 /* !! */  = is.b;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("enq", dxv(int ), (int)168));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -897755418: {
                    v3 = is.dwq("enr", dxv(int ), (int)169);
                    continue block18;
                }
                case 156730368: {
                    break block18;
                }
                case 2009855634: {
                    v3 = is.dwq("ens", dxv(int ), (int)170);
                    continue block18;
                }
                case 2051289476: {
                    v3 = is.dwq("ent", dxv(int ), (int)171);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = is.u;
                if (true) ** GOTO lbl44
                block20: while (true) {
                    v4 /* !! */  = (long)(is.dwq("env", dxv(int ), (int)173) - is.dwq("enu", dxv(int ), (int)172));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 156730368: {
                            break block20;
                        }
                        case 1584938573: {
                            continue block20;
                        }
                    }
                    break;
                }
                return this.fireworkTimer;
            }
            case 0: {
                var2_2 /* !! */  = (int)is.dwq("enw", dwl(int ), (int)237);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)is.dwq("enx", dwl(int ), (int)238);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)is.dwq("eny", dwl(int ), (int)239);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)is.dwq("enz", dwl(int ), (int)240);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dww(int n2) {
        return Float.intBitsToFloat(dwn[n2] ^ dwp[n2]);
    }

    private static /* synthetic */ long dxv(int n2) {
        return dxw[n2] ^ dxx[n2];
    }

    private static /* synthetic */ void etq() {
        is.dxx[0] = -6990063271229290425L;
        is.dxx[1] = 2289787649701576740L;
        is.dxx[2] = -5048697634401127234L;
        is.dxx[3] = 5944392216331118477L;
        is.dxx[4] = -4879923054678831092L;
        is.dxx[5] = 2435288576278922792L;
        is.dxx[6] = -3700714675375944508L;
        is.dxx[7] = -8518413281104396580L;
        is.dxx[8] = 4827036601176138818L;
        is.dxx[9] = 8321522945330811131L;
        is.dxx[10] = -2633626498685957324L;
        is.dxx[11] = 6427634861994024223L;
        is.dxx[12] = 7794020528932887059L;
        is.dxx[13] = 4608860635855047424L;
        is.dxx[14] = -6253706983004375500L;
        is.dxx[15] = -485626195690210655L;
        is.dxx[16] = -2340143705103147402L;
        is.dxx[17] = -7227640672197220513L;
        is.dxx[18] = -5904981641394572487L;
        is.dxx[19] = -6225776652894539791L;
        is.dxx[20] = 5368025676398776724L;
        is.dxx[21] = -8492795927213879224L;
        is.dxx[22] = -4556868837571083312L;
        is.dxx[23] = 3512046487789864977L;
        is.dxx[24] = -4518545851738763446L;
        is.dxx[25] = 5992924680432937563L;
        is.dxx[26] = -7859014810650027051L;
        is.dxx[27] = 3764769204068423110L;
        is.dxx[28] = 3969663033282530441L;
        is.dxx[29] = -5019974695794774962L;
        is.dxx[30] = 5499477022512291186L;
        is.dxx[31] = -6391264316023050479L;
        is.dxx[32] = 3070828416714900016L;
        is.dxx[33] = -4163884548817526850L;
        is.dxx[34] = -5608801242341935480L;
        is.dxx[35] = 3964828606828968071L;
        is.dxx[36] = 4318223831011370624L;
        is.dxx[37] = 7440357244761509422L;
        is.dxx[38] = 7000062559357220495L;
        is.dxx[39] = 8622480280622849959L;
        is.dxx[40] = -5528517521169903326L;
        is.dxx[41] = 4100912766212905531L;
        is.dxx[42] = -6047280897843316304L;
        is.dxx[43] = 7422222950307122928L;
        is.dxx[44] = -5151743362808741603L;
        is.dxx[45] = 2828846767862013588L;
        is.dxx[46] = -8724368550983983870L;
        is.dxx[47] = 3287179406727918927L;
        is.dxx[48] = -399889240144577565L;
        is.dxx[49] = 6116537855349874376L;
        is.dxx[50] = 1698872723271776268L;
        is.dxx[51] = 8759278384000575029L;
        is.dxx[52] = 4643042989452796788L;
        is.dxx[53] = 3037030636703308825L;
        is.dxx[54] = -1830222644826535037L;
        is.dxx[55] = 792281482359590923L;
        is.dxx[56] = -701662446339522041L;
        is.dxx[57] = 1988179136053950024L;
        is.dxx[58] = 5872056076670275446L;
        is.dxx[59] = 2821833138942619031L;
        is.dxx[60] = 9029749155384170063L;
        is.dxx[61] = 8836634413862633737L;
        is.dxx[62] = 4091773798519078233L;
        is.dxx[63] = -5835704163988211560L;
        is.dxx[64] = 9073626823586350120L;
        is.dxx[65] = 3641776229377878541L;
        is.dxx[66] = -850573107508504205L;
        is.dxx[67] = -6535300372706963293L;
        is.dxx[68] = -3337581506856893541L;
        is.dxx[69] = 8666022129874192706L;
        is.dxx[70] = -7180628928783130263L;
        is.dxx[71] = 2999890211618398138L;
        is.dxx[72] = 6011714798951580861L;
        is.dxx[73] = -3661674827437607036L;
        is.dxx[74] = 348228650946746839L;
        is.dxx[75] = 5233197339366138958L;
        is.dxx[76] = 5278034159712736899L;
        is.dxx[77] = 4738818993859701302L;
        is.dxx[78] = -2627465235670015807L;
        is.dxx[79] = -7673916034772135729L;
        is.dxx[80] = -5897626863944920754L;
        is.dxx[81] = -4057616711489889966L;
        is.dxx[82] = 884583325656115616L;
        is.dxx[83] = -1533055098445555583L;
        is.dxx[84] = -5572015277490684532L;
        is.dxx[85] = -3273645011401779633L;
        is.dxx[86] = -6410708979113861137L;
        is.dxx[87] = 8925443796668058536L;
        is.dxx[88] = -4924614622813203247L;
        is.dxx[89] = -3407475376574679683L;
        is.dxx[90] = 6339479187403041382L;
        is.dxx[91] = 505567258067619375L;
        is.dxx[92] = -1879974599052788765L;
        is.dxx[93] = -4023276174783597529L;
        is.dxx[94] = -6866995361776018919L;
        is.dxx[95] = 1872288774483283574L;
        is.dxx[96] = -4550224836560717064L;
        is.dxx[97] = 526937831534988287L;
        is.dxx[98] = 4326708593908564453L;
        is.dxx[99] = -4222281766509679199L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setStage(it$Stage var1_1) {
        v0 /* !! */  = is.u;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - is.dwq("eqq", dxv(int ), (int)213));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2070851681: {
                    v1 = is.dwq("eqr", dxv(int ), (int)214);
                    continue block16;
                }
                case 156730368: {
                    break block16;
                }
                case 1227315014: {
                    v1 = is.dwq("eqs", dxv(int ), (int)215);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = is.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eqt", dxv(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == is.dwq("equ", dwl(int ), (int)270)) break;
            v2 /* !! */  = (long)is.dwq("eqv", dwl(int ), (int)271);
        }
        var3_3 /* !! */  = is.b;
        v3 /* !! */  = is.u;
        if (true) ** GOTO lbl25
        block18: while (true) {
            v3 /* !! */  = (long)(is.dwq("eqx", dxv(int ), (int)218) - is.dwq("eqw", dxv(int ), (int)217));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -502189029: {
                    continue block18;
                }
                case 156730368: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = is.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = is.u - is.dwq("eqy", dxv(int ), (int)219)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == is.dwq("eqz", dwl(int ), (int)272)) break;
            v4 /* !! */  = (long)is.dwq("era", dwl(int ), (int)273);
        }
        this.stage = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)is.dwq("erb", dwl(int ), (int)274);
                if (!var4_2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)is.dwq("erc", dwl(int ), (int)275);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl63
                    break;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)is.dwq("erd", dwl(int ), (int)276);
                } while (!var4_2);
                throw null;
            }
lbl63:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)is.dwq("ere", dwl(int ), (int)277);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)is.dwq("erf", dwl(int ), (int)278);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public is(in var1_1, io var2_2, ip var3_3, pr var4_4) {
        var6_5 /* !! */  = is.b;
        super();
        this.stage = it$Stage.PREPARE;
        this.silentMode = is.dwq("dws", dwl(int ), (int)0);
        this.reallyWorldMode = is.dwq("dwu", dwl(int ), (int)1);
        this.height = (float)is.dwq("dwy", dww(int ), (int)2);
        this.armorSwapHandler = var1_1;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.fireworkHandler = var2_2;
                this.attackHandler = var3_3;
                this.fireworkTimer = var4_4;
                return;
            }
lbl15:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)is.dwq("dxb", dwl(int ), (int)3);
                ** GOTO lbl32
            }
lbl18:
            // 2 sources

            case 1: {
                var6_5 /* !! */  = (int)is.dwq("dxc", dwl(int ), (int)4);
                ** GOTO lbl15
            }
            case 2: {
                var6_5 /* !! */  = (int)is.dwq("dxe", dwl(int ), (int)5);
                ** GOTO lbl38
            }
lbl24:
            // 3 sources

            case 3: {
                while (true) {
                    var6_5 /* !! */  = (int)is.dwq("dxg", dwl(int ), (int)6);
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)is.dwq("dxh", dwl(int ), (int)7);
                    ** GOTO lbl24
                    break;
                }
            }
lbl32:
            // 2 sources

            case 5: {
                var6_5 /* !! */  = (int)is.dwq("dxi", dwl(int ), (int)8);
                ** GOTO lbl43
            }
            case 6: {
                var6_5 /* !! */  = (int)is.dwq("dxk", dwl(int ), (int)9);
                ** GOTO lbl15
            }
lbl38:
            // 2 sources

            case 7: {
                var6_5 /* !! */  = (int)is.dwq("dxl", dwl(int ), (int)10);
            }
            case 8: {
                var6_5 /* !! */  = (int)is.dwq("dxn", dwl(int ), (int)11);
                ** GOTO lbl18
            }
lbl43:
            // 2 sources

            case 9: {
                var6_5 /* !! */  = (int)is.dwq("dxo", dwl(int ), (int)12);
                ** GOTO lbl24
            }
            case 10: 
        }
        var6_5 /* !! */  = (int)is.dwq("dxq", dwl(int ), (int)13);
        ** while (true)
    }

    private static /* synthetic */ void etr() {
        is.dxx[100] = 3957156939632253076L;
        is.dxx[101] = -6163519686121485316L;
        is.dxx[102] = -4394376928022792885L;
        is.dxx[103] = 2156744547589084673L;
        is.dxx[104] = 490381606860013081L;
        is.dxx[105] = 9175159172107678687L;
        is.dxx[106] = 4424828401335180970L;
        is.dxx[107] = -3500350770784512930L;
        is.dxx[108] = -2896681464436453621L;
        is.dxx[109] = 1606240604876423840L;
        is.dxx[110] = -1740559809597794479L;
        is.dxx[111] = 4725992066160732229L;
        is.dxx[112] = -4994462686959410183L;
        is.dxx[113] = 3182243324369873736L;
        is.dxx[114] = 2962918620433737573L;
        is.dxx[115] = -3083969270427190180L;
        is.dxx[116] = -4074035082740822836L;
        is.dxx[117] = 2135769822775493883L;
        is.dxx[118] = -2083354970054023566L;
        is.dxx[119] = 2732321497972892350L;
        is.dxx[120] = 5759680784525527832L;
        is.dxx[121] = -2640773269816186352L;
        is.dxx[122] = 2001148981724604288L;
        is.dxx[123] = 8424061857000480835L;
        is.dxx[124] = 641218110759427672L;
        is.dxx[125] = -9165103767261150978L;
        is.dxx[126] = -2580111424651170442L;
        is.dxx[127] = -5223462688753323593L;
        is.dxx[128] = 6421747329315542119L;
        is.dxx[129] = 7339793639055743662L;
        is.dxx[130] = -2608847029782617674L;
        is.dxx[131] = -5252231236856660048L;
        is.dxx[132] = 6346109890944161695L;
        is.dxx[133] = -4499851757391107940L;
        is.dxx[134] = -3533443617348380200L;
        is.dxx[135] = -3658283552328213957L;
        is.dxx[136] = -7432137785349723351L;
        is.dxx[137] = -8212964726885811309L;
        is.dxx[138] = -784339416792661941L;
        is.dxx[139] = 5110304132393899410L;
        is.dxx[140] = 6553222361305106246L;
        is.dxx[141] = 7120458972298860778L;
        is.dxx[142] = 826347007074353812L;
        is.dxx[143] = -5399156738361113026L;
        is.dxx[144] = -6459574052882253684L;
        is.dxx[145] = 4209581762552226624L;
        is.dxx[146] = -1266449987717675796L;
        is.dxx[147] = -1328452098598915925L;
        is.dxx[148] = -4885128510070341144L;
        is.dxx[149] = 1919202664669931048L;
        is.dxx[150] = 6238507850980900202L;
        is.dxx[151] = 5869999552995899758L;
        is.dxx[152] = 2949561952910333998L;
        is.dxx[153] = 9137185107113078802L;
        is.dxx[154] = 2926168687326055668L;
        is.dxx[155] = 7069918685754204666L;
        is.dxx[156] = -7329539426266175122L;
        is.dxx[157] = -2829098953750684478L;
        is.dxx[158] = 2262379601637715027L;
        is.dxx[159] = -1042631575043916571L;
        is.dxx[160] = -6590413365866514481L;
        is.dxx[161] = -6344097813606920358L;
        is.dxx[162] = -1776188850998366495L;
        is.dxx[163] = 6839044346535383411L;
        is.dxx[164] = -8852689180022609274L;
        is.dxx[165] = 8097798696329378642L;
        is.dxx[166] = 1356705071841290118L;
        is.dxx[167] = -6520304192676012988L;
        is.dxx[168] = -7529833576714905601L;
        is.dxx[169] = 3764752027514661160L;
        is.dxx[170] = 2033519796945225969L;
        is.dxx[171] = 2981931159037109592L;
        is.dxx[172] = -756957701443583243L;
        is.dxx[173] = -5971999857334104113L;
        is.dxx[174] = 8489397658772894418L;
        is.dxx[175] = 5218658428817051495L;
        is.dxx[176] = 2015333878727167397L;
        is.dxx[177] = 1587207533928421556L;
        is.dxx[178] = 3277368862282951396L;
        is.dxx[179] = -2129731652530713585L;
        is.dxx[180] = 3014938804074190985L;
        is.dxx[181] = 4700701830202961646L;
        is.dxx[182] = -6736245475975799482L;
        is.dxx[183] = -3534230172989969529L;
        is.dxx[184] = 7975729131103199205L;
        is.dxx[185] = -6581569568941768955L;
        is.dxx[186] = 3494578302892047872L;
        is.dxx[187] = -2903580669543710023L;
        is.dxx[188] = -8219347276129310451L;
        is.dxx[189] = 9098754850676750954L;
        is.dxx[190] = 724222138369327819L;
        is.dxx[191] = 6299502970020510067L;
        is.dxx[192] = 4815651163909722334L;
        is.dxx[193] = 4702955072515899930L;
        is.dxx[194] = -5207456811008549272L;
        is.dxx[195] = 8961683587337187195L;
        is.dxx[196] = 5950940783443469968L;
        is.dxx[197] = -3840926457278792382L;
        is.dxx[198] = 6290841848886564996L;
        is.dxx[199] = -3879135092511832542L;
    }

    private static /* synthetic */ void etg() {
        is.dwn[100] = 1881285879;
        is.dwn[101] = -778248405;
        is.dwn[102] = 1140495042;
        is.dwn[103] = -1556699040;
        is.dwn[104] = 1506358320;
        is.dwn[105] = 1962008873;
        is.dwn[106] = 2009671345;
        is.dwn[107] = 90649501;
        is.dwn[108] = 1994186319;
        is.dwn[109] = -1198266312;
        is.dwn[110] = 489000488;
        is.dwn[111] = -1796842278;
        is.dwn[112] = -392615438;
        is.dwn[113] = 2134626530;
        is.dwn[114] = -1185742292;
        is.dwn[115] = -646751961;
        is.dwn[116] = -1494227869;
        is.dwn[117] = -1581668448;
        is.dwn[118] = -785444446;
        is.dwn[119] = -1662170920;
        is.dwn[120] = 687782684;
        is.dwn[121] = -1117031467;
        is.dwn[122] = -1203678178;
        is.dwn[123] = -614020687;
        is.dwn[124] = 542026599;
        is.dwn[125] = 1158803550;
        is.dwn[126] = -1033462499;
        is.dwn[127] = -1671572901;
        is.dwn[128] = -994752463;
        is.dwn[129] = 555210749;
        is.dwn[130] = -108364481;
        is.dwn[131] = 1683287423;
        is.dwn[132] = -2130670579;
        is.dwn[133] = -2058500251;
        is.dwn[134] = 491630441;
        is.dwn[135] = 2042487519;
        is.dwn[136] = -756154045;
        is.dwn[137] = 577930264;
        is.dwn[138] = 717955886;
        is.dwn[139] = 1861005209;
        is.dwn[140] = 2053504844;
        is.dwn[141] = -606454425;
        is.dwn[142] = -156739025;
        is.dwn[143] = -1606430108;
        is.dwn[144] = -40289967;
        is.dwn[145] = 1586313966;
        is.dwn[146] = 1269816770;
        is.dwn[147] = -211760041;
        is.dwn[148] = 574603526;
        is.dwn[149] = -2021823976;
        is.dwn[150] = 87171804;
        is.dwn[151] = -328440129;
        is.dwn[152] = 652224731;
        is.dwn[153] = 1870235181;
        is.dwn[154] = -1682919093;
        is.dwn[155] = 1458989342;
        is.dwn[156] = -1940053720;
        is.dwn[157] = 965658373;
        is.dwn[158] = -1098009543;
        is.dwn[159] = -1529238871;
        is.dwn[160] = -1809657395;
        is.dwn[161] = -1748057841;
        is.dwn[162] = -1025320947;
        is.dwn[163] = 1727761759;
        is.dwn[164] = -638122333;
        is.dwn[165] = -930455982;
        is.dwn[166] = -2025410926;
        is.dwn[167] = -257899119;
        is.dwn[168] = 1628644069;
        is.dwn[169] = 706609573;
        is.dwn[170] = 1770892685;
        is.dwn[171] = -1531258216;
        is.dwn[172] = -1176098232;
        is.dwn[173] = -2063356454;
        is.dwn[174] = 167941109;
        is.dwn[175] = -1055977846;
        is.dwn[176] = 2085120884;
        is.dwn[177] = -1895144359;
        is.dwn[178] = -902075729;
        is.dwn[179] = -7193827;
        is.dwn[180] = 192615280;
        is.dwn[181] = -107664275;
        is.dwn[182] = -1977100584;
        is.dwn[183] = 1012230104;
        is.dwn[184] = 496505006;
        is.dwn[185] = 664375852;
        is.dwn[186] = 1609089095;
        is.dwn[187] = -2029016110;
        is.dwn[188] = 101064928;
        is.dwn[189] = 1758854844;
        is.dwn[190] = 762168488;
        is.dwn[191] = -1991290199;
        is.dwn[192] = 688127301;
        is.dwn[193] = -923542447;
        is.dwn[194] = -1345914237;
        is.dwn[195] = 644946508;
        is.dwn[196] = -581608943;
        is.dwn[197] = -1606340078;
        is.dwn[198] = 1252530598;
        is.dwn[199] = 177815544;
    }

    static {
        dwn = new int[302];
        dwp = new int[302];
        is.etf();
        is.etg();
        is.eth();
        is.eti();
        is.etj();
        is.etk();
        is.etl();
        is.etm();
        dxw = new long[248];
        dxx = new long[248];
        is.etn();
        is.eto();
        is.etp();
        is.etq();
        is.etr();
        is.ets();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public io getFireworkHandler() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("emd", dxv(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("eme", dwl(int ), (int)217)) break;
            v0 /* !! */  = (long)is.dwq("emf", dwl(int ), (int)218);
        }
        var3_1 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - is.dwq("emg", dxv(int ), (int)150));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1559897596: {
                    v2 = is.dwq("emh", dxv(int ), (int)151);
                    continue block22;
                }
                case -26218241: {
                    v2 = is.dwq("emi", dxv(int ), (int)152);
                    continue block22;
                }
                case 156730368: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        v3 /* !! */  = is.u;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - is.dwq("emj", dxv(int ), (int)153));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1854788031: {
                    v4 = is.dwq("emk", dxv(int ), (int)154);
                    continue block23;
                }
                case 156730368: {
                    break block23;
                }
                case 671737315: {
                    v4 = is.dwq("eml", dxv(int ), (int)155);
                    continue block23;
                }
                case 1623938498: {
                    v4 = is.dwq("emm", dxv(int ), (int)156);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v5 /* !! */  = is.u;
                if (true) ** GOTO lbl50
                block25: while (true) {
                    v5 /* !! */  = (long)(is.dwq("emo", dxv(int ), (int)158) - is.dwq("emn", dxv(int ), (int)157));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 156730368: {
                            break block25;
                        }
                        case 872692299: {
                            continue block25;
                        }
                    }
                    break;
                }
                return this.fireworkHandler;
lbl56:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)is.dwq("emp", dwl(int ), (int)219);
                    if (!var3_1) break block24;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)is.dwq("emq", dwl(int ), (int)220);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)is.dwq("emr", dwl(int ), (int)221);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)is.dwq("ems", dwl(int ), (int)222);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setHeight(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("esn", dxv(int ), (int)237)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("eso", dwl(int ), (int)295)) break;
            v0 /* !! */  = (long)is.dwq("esp", dwl(int ), (int)296);
        }
        var4_2 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(is.dwq("esr", dxv(int ), (int)239) - is.dwq("esq", dxv(int ), (int)238));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -480074012: {
                    continue block24;
                }
                case 156730368: {
                    break block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = is.b;
        v2 /* !! */  = is.u;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - is.dwq("ess", dxv(int ), (int)240));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1757277093: {
                    v3 = is.dwq("est", dxv(int ), (int)241);
                    continue block25;
                }
                case 156730368: {
                    break block25;
                }
                case 476040101: {
                    v3 = is.dwq("esu", dxv(int ), (int)242);
                    continue block25;
                }
                case 1507990408: {
                    v3 = is.dwq("esv", dxv(int ), (int)243);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = is.a;
        if (var4_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        v4 /* !! */  = is.u;
        if (true) ** GOTO lbl44
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - is.dwq("esw", dxv(int ), (int)244));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2146990450: {
                    v5 = is.dwq("esx", dxv(int ), (int)245);
                    continue block27;
                }
                case -483015085: {
                    v5 = is.dwq("esy", dxv(int ), (int)246);
                    continue block27;
                }
                case 156730368: {
                    break block27;
                }
                case 1449193943: {
                    v5 = is.dwq("esz", dxv(int ), (int)247);
                    continue block27;
                }
            }
            break;
        }
        this.height = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)is.dwq("eta", dwl(int ), (int)297);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl74
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)is.dwq("etb", dwl(int ), (int)298);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl74:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)is.dwq("etc", dwl(int ), (int)299);
                if (var4_2) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)is.dwq("etd", dwl(int ), (int)300);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)is.dwq("ete", dwl(int ), (int)301);
        ** while (!var4_2)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void etl() {
        is.dwp[200] = 1682960818;
        is.dwp[201] = 128096700;
        is.dwp[202] = -2023429747;
        is.dwp[203] = -409636430;
        is.dwp[204] = 1024238987;
        is.dwp[205] = -113062136;
        is.dwp[206] = 381794097;
        is.dwp[207] = -2140365357;
        is.dwp[208] = -1613999955;
        is.dwp[209] = 1779871505;
        is.dwp[210] = 1305476316;
        is.dwp[211] = -1907039954;
        is.dwp[212] = 2093550454;
        is.dwp[213] = 379375707;
        is.dwp[214] = -1104499066;
        is.dwp[215] = -153966037;
        is.dwp[216] = -2101252794;
        is.dwp[217] = -641174114;
        is.dwp[218] = -69550045;
        is.dwp[219] = 1389761402;
        is.dwp[220] = 1022295472;
        is.dwp[221] = -1529383142;
        is.dwp[222] = -143472525;
        is.dwp[223] = -870308436;
        is.dwp[224] = 790414603;
        is.dwp[225] = -1300470313;
        is.dwp[226] = -1184914859;
        is.dwp[227] = 1085504159;
        is.dwp[228] = 1710580536;
        is.dwp[229] = 593748917;
        is.dwp[230] = -1116583558;
        is.dwp[231] = -1199745151;
        is.dwp[232] = -717054423;
        is.dwp[233] = -402162694;
        is.dwp[234] = 521566680;
        is.dwp[235] = 768863585;
        is.dwp[236] = 746493616;
        is.dwp[237] = -944937057;
        is.dwp[238] = -947261824;
        is.dwp[239] = 720382504;
        is.dwp[240] = 1480542115;
        is.dwp[241] = 519096928;
        is.dwp[242] = -1960878648;
        is.dwp[243] = -858654463;
        is.dwp[244] = 70364499;
        is.dwp[245] = -1506699777;
        is.dwp[246] = -1190893300;
        is.dwp[247] = -1145600983;
        is.dwp[248] = 1760054757;
        is.dwp[249] = -973865126;
        is.dwp[250] = -709834792;
        is.dwp[251] = 1718851567;
        is.dwp[252] = -1308706868;
        is.dwp[253] = -1001684782;
        is.dwp[254] = -367546530;
        is.dwp[255] = -968983388;
        is.dwp[256] = 2098300201;
        is.dwp[257] = 674030606;
        is.dwp[258] = -622672147;
        is.dwp[259] = -223268657;
        is.dwp[260] = 1875333423;
        is.dwp[261] = -535224680;
        is.dwp[262] = 1873060329;
        is.dwp[263] = -461363574;
        is.dwp[264] = -489230256;
        is.dwp[265] = -894848741;
        is.dwp[266] = 896863666;
        is.dwp[267] = -623562736;
        is.dwp[268] = 530428488;
        is.dwp[269] = 31283820;
        is.dwp[270] = -2077975120;
        is.dwp[271] = -1310555022;
        is.dwp[272] = -737382251;
        is.dwp[273] = -545237871;
        is.dwp[274] = 2037385318;
        is.dwp[275] = 1985708166;
        is.dwp[276] = 1035718277;
        is.dwp[277] = -445336917;
        is.dwp[278] = -98334098;
        is.dwp[279] = -1966609998;
        is.dwp[280] = 432597006;
        is.dwp[281] = 290821725;
        is.dwp[282] = 1779131863;
        is.dwp[283] = -1712785685;
        is.dwp[284] = -1302781532;
        is.dwp[285] = -668747796;
        is.dwp[286] = -1710984144;
        is.dwp[287] = 1361117347;
        is.dwp[288] = -713365986;
        is.dwp[289] = 233800904;
        is.dwp[290] = 393142423;
        is.dwp[291] = 1566480023;
        is.dwp[292] = 548165239;
        is.dwp[293] = 1306112380;
        is.dwp[294] = 1896504855;
        is.dwp[295] = -1000033102;
        is.dwp[296] = -1906360088;
        is.dwp[297] = 147830839;
        is.dwp[298] = -511583985;
        is.dwp[299] = -1206859511;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public it$Stage getStage() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("eoa", dxv(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("eob", dwl(int ), (int)241)) break;
            v0 /* !! */  = (long)is.dwq("eoc", dwl(int ), (int)242);
        }
        var3_1 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - is.dwq("eod", dxv(int ), (int)175));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -391016903: {
                    v2 = is.dwq("eoe", dxv(int ), (int)176);
                    continue block21;
                }
                case 38664679: {
                    v2 = is.dwq("eof", dxv(int ), (int)177);
                    continue block21;
                }
                case 156730368: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = is.b;
        v3 /* !! */  = is.u;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - is.dwq("eog", dxv(int ), (int)178));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1330022244: {
                    v4 = is.dwq("eoh", dxv(int ), (int)179);
                    continue block22;
                }
                case 156730368: {
                    break block22;
                }
                case 2025829998: {
                    v4 = is.dwq("eoi", dxv(int ), (int)180);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = is.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = is.u;
                if (true) ** GOTO lbl49
                block24: while (true) {
                    v5 /* !! */  = (long)(is.dwq("eok", dxv(int ), (int)182) - is.dwq("eoj", dxv(int ), (int)181));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -950848181: {
                            continue block24;
                        }
                        case 156730368: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.stage;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)is.dwq("eol", dwl(int ), (int)243);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)is.dwq("eom", dwl(int ), (int)244);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)is.dwq("eon", dwl(int ), (int)245);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)is.dwq("eoo", dwl(int ), (int)246);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setReallyWorldMode(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = is.u - is.dwq("erx", dxv(int ), (int)230)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == is.dwq("ery", dwl(int ), (int)286)) break;
            v0 /* !! */  = (long)is.dwq("erz", dwl(int ), (int)287);
        }
        var4_2 = is.c;
        v1 /* !! */  = is.u;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(is.dwq("esb", dxv(int ), (int)232) - is.dwq("esa", dxv(int ), (int)231));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1322303902: {
                    continue block17;
                }
                case 156730368: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = is.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = is.u - is.dwq("esc", dxv(int ), (int)233)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == is.dwq("esd", dwl(int ), (int)288)) break;
            v2 /* !! */  = (long)is.dwq("ese", dwl(int ), (int)289);
        }
        var2_4 = is.a;
        if (var4_2) {
            throw null;
lbl27:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = is.u;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - is.dwq("esf", dxv(int ), (int)234));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1662945269: {
                            v4 = is.dwq("esg", dxv(int ), (int)235);
                            continue block20;
                        }
                        case -1315216093: {
                            v4 = is.dwq("esh", dxv(int ), (int)236);
                            continue block20;
                        }
                        case 156730368: {
                            break block20;
                        }
                    }
                    break;
                }
                this.reallyWorldMode = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)is.dwq("esi", dwl(int ), (int)290);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl65
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)is.dwq("esj", dwl(int ), (int)291);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 2: {
                var3_3 /* !! */  = (int)is.dwq("esk", dwl(int ), (int)292);
                if (!var4_2) break;
                throw null;
            }
lbl65:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)is.dwq("esl", dwl(int ), (int)293);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)is.dwq("esm", dwl(int ), (int)294);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }
}

