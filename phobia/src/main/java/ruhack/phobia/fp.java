/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;

public class fp
extends ds {
    private static long[] hdpq;
    private static final ExecutorService SOUND_EXECUTOR;
    private static final Map<String, byte[]> SOUND_CACHE;
    private static int[] hdpb;
    public static final int b;
    public static final boolean c;
    private static final String SOUND_ROOT = "/assets/phobia/sounds/toggle/";
    private static long[] hdpp;
    private final kg volume;
    private static int[] hdpa;
    private final kf soundType;
    public static final boolean a;
    private static volatile fp instance;
    public static final long od = -2504560956306704905L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$play$2(Clip var0, LineEvent var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fp.od - fp.hdpc("heaa", hdpo(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fp.hdpc("heab", hdpe(int ), (int)194)) break;
            v0 /* !! */  = (long)fp.hdpc("heac", hdpe(int ), (int)195);
        }
        var4_2 = fp.c;
        v1 /* !! */  = fp.od;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(fp.hdpc("heae", hdpo(int ), (int)86) - fp.hdpc("head", hdpo(int ), (int)85));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1843758446: {
                    continue block22;
                }
                case 2030482935: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = fp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fp.od - fp.hdpc("heaf", hdpo(int ), (int)87)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fp.hdpc("heag", hdpe(int ), (int)196)) break;
            v2 /* !! */  = (long)fp.hdpc("heah", hdpe(int ), (int)197);
        }
        var2_4 = fp.a;
        if (var4_2) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = fp.od - fp.hdpc("heai", hdpo(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fp.hdpc("heaj", hdpe(int ), (int)198)) break;
            v3 /* !! */  = (long)fp.hdpc("heak", hdpe(int ), (int)199);
        }
        v4 = var1_1.getType();
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fp.od - fp.hdpc("heal", hdpo(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fp.hdpc("heam", hdpe(int ), (int)200)) break;
            v5 /* !! */  = (long)fp.hdpc("hean", hdpe(int ), (int)201);
        }
        if (v4 != LineEvent.Type.STOP) ** GOTO lbl62
        if (var2_4 || var2_4) ** GOTO lbl25
        v6 /* !! */  = fp.od;
        if (true) ** GOTO lbl45
        block27: while (true) {
            v6 /* !! */  = (long)(v7 - fp.hdpc("heao", hdpo(int ), (int)90));
lbl45:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1682668120: {
                    v7 = fp.hdpc("heap", hdpo(int ), (int)91);
                    continue block27;
                }
                case 1966510043: {
                    v7 = fp.hdpc("heaq", hdpo(int ), (int)92);
                    continue block27;
                }
                case 2030482935: {
                    break block27;
                }
                case 2066211465: {
                    v7 = fp.hdpc("hear", hdpo(int ), (int)93);
                    continue block27;
                }
            }
            break;
        }
        var0.close();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl25
lbl62:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl65:
            // 6 sources

            case 0: {
                var3_3 /* !! */  = (int)fp.hdpc("heas", hdpe(int ), (int)202);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fp.hdpc("heat", hdpe(int ), (int)203);
                    if (!var4_2) ** GOTO lbl65
                    throw null;
                }
            }
lbl75:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fp.hdpc("heau", hdpe(int ), (int)204);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
            case 3: {
                var3_3 /* !! */  = (int)fp.hdpc("heav", hdpe(int ), (int)205);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)fp.hdpc("heaw", hdpe(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
            case 5: {
                var3_3 /* !! */  = (int)fp.hdpc("heax", hdpe(int ), (int)207);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl93:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)fp.hdpc("heay", hdpe(int ), (int)208);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)fp.hdpc("heaz", hdpe(int ), (int)209);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)fp.hdpc("heba", hdpe(int ), (int)210);
        ** while (!var4_2)
lbl104:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hedc() {
        fp.hdpp[100] = 7190638872658105152L;
        fp.hdpp[101] = 5947233149733592484L;
        fp.hdpp[102] = -1736334604896649519L;
        fp.hdpp[103] = -7097360612939241723L;
        fp.hdpp[104] = 7538917625362798943L;
        fp.hdpp[105] = -921118343236709986L;
        fp.hdpp[106] = -2958122177155116072L;
        fp.hdpp[107] = 5483669310716653403L;
        fp.hdpp[108] = 8723778419490237693L;
        fp.hdpp[109] = 5336727604389628602L;
        fp.hdpp[110] = 3535796512871248309L;
        fp.hdpp[111] = -3507001755967493478L;
        fp.hdpp[112] = -4713496480991049807L;
        fp.hdpp[113] = 8046208264445747834L;
        fp.hdpp[114] = 9209247259416927229L;
        fp.hdpp[115] = 4480298547411628042L;
    }

    private static /* synthetic */ void hecx() {
        fp.hdpa[200] = 1532278465;
        fp.hdpa[201] = 1552300597;
        fp.hdpa[202] = 1095042001;
        fp.hdpa[203] = 2026253629;
        fp.hdpa[204] = 1847347728;
        fp.hdpa[205] = 42307563;
        fp.hdpa[206] = 35680897;
        fp.hdpa[207] = 1090432048;
        fp.hdpa[208] = -913094679;
        fp.hdpa[209] = 250366360;
        fp.hdpa[210] = -1238542047;
        fp.hdpa[211] = 43938672;
        fp.hdpa[212] = -647579421;
        fp.hdpa[213] = -136209062;
        fp.hdpa[214] = -739397308;
        fp.hdpa[215] = -983106976;
        fp.hdpa[216] = 855059639;
        fp.hdpa[217] = -933687475;
        fp.hdpa[218] = -1767921986;
        fp.hdpa[219] = 1054236370;
        fp.hdpa[220] = -1714707891;
        fp.hdpa[221] = 377271242;
        fp.hdpa[222] = -1833654167;
        fp.hdpa[223] = -1888289545;
        fp.hdpa[224] = 825040950;
        fp.hdpa[225] = 565988360;
        fp.hdpa[226] = 1198085036;
        fp.hdpa[227] = 1635042208;
        fp.hdpa[228] = -1678273067;
        fp.hdpa[229] = 370498378;
        fp.hdpa[230] = 0x19199091;
        fp.hdpa[231] = -397283390;
        fp.hdpa[232] = -2034501405;
        fp.hdpa[233] = -318814723;
        fp.hdpa[234] = -1187860417;
    }

    private static /* synthetic */ void hede() {
        fp.hdpq[100] = -2787550091608363747L;
        fp.hdpq[101] = 2287143571200582409L;
        fp.hdpq[102] = 5127803873691842469L;
        fp.hdpq[103] = -3982227461295012865L;
        fp.hdpq[104] = 2333148406734353387L;
        fp.hdpq[105] = -4305339227523489436L;
        fp.hdpq[106] = 3134819224782431518L;
        fp.hdpq[107] = 1446451056719129641L;
        fp.hdpq[108] = 3694771349434904633L;
        fp.hdpq[109] = -4209201541743308093L;
        fp.hdpq[110] = 6734853002573459222L;
        fp.hdpq[111] = -3643652841342034434L;
        fp.hdpq[112] = 8975226844839875865L;
        fp.hdpq[113] = 3660969855814848771L;
        fp.hdpq[114] = -741815020132416894L;
        fp.hdpq[115] = -6520337513743352214L;
    }

    private static /* synthetic */ float hdoz(int n2) {
        return Float.intBitsToFloat(hdpa[n2] ^ hdpb[n2]);
    }

    private static /* synthetic */ void hecw() {
        fp.hdpa[100] = 848286751;
        fp.hdpa[101] = 1611758645;
        fp.hdpa[102] = 2096478783;
        fp.hdpa[103] = -907808325;
        fp.hdpa[104] = 166114168;
        fp.hdpa[105] = 240566757;
        fp.hdpa[106] = 919716418;
        fp.hdpa[107] = 1790257710;
        fp.hdpa[108] = 1119880651;
        fp.hdpa[109] = -1087675280;
        fp.hdpa[110] = 816490206;
        fp.hdpa[111] = 2033927484;
        fp.hdpa[112] = 975635413;
        fp.hdpa[113] = 8872439;
        fp.hdpa[114] = 1841797679;
        fp.hdpa[115] = -1095630549;
        fp.hdpa[116] = 652876044;
        fp.hdpa[117] = -743323676;
        fp.hdpa[118] = 1321009858;
        fp.hdpa[119] = -902928378;
        fp.hdpa[120] = -1519632360;
        fp.hdpa[121] = -1379506376;
        fp.hdpa[122] = 799272403;
        fp.hdpa[123] = -1491553958;
        fp.hdpa[124] = 1528595046;
        fp.hdpa[125] = -1260035441;
        fp.hdpa[126] = 532369814;
        fp.hdpa[127] = -309415817;
        fp.hdpa[128] = -151319984;
        fp.hdpa[129] = -806367464;
        fp.hdpa[130] = -1367364932;
        fp.hdpa[131] = -1072590552;
        fp.hdpa[132] = -379808283;
        fp.hdpa[133] = 1974745306;
        fp.hdpa[134] = -391869139;
        fp.hdpa[135] = -606385771;
        fp.hdpa[136] = 571429797;
        fp.hdpa[137] = -1251427091;
        fp.hdpa[138] = 636967084;
        fp.hdpa[139] = -926963203;
        fp.hdpa[140] = 216228904;
        fp.hdpa[141] = -29038865;
        fp.hdpa[142] = -2094864131;
        fp.hdpa[143] = 692128279;
        fp.hdpa[144] = -180190963;
        fp.hdpa[145] = 291035447;
        fp.hdpa[146] = 549543385;
        fp.hdpa[147] = -26601946;
        fp.hdpa[148] = 164076820;
        fp.hdpa[149] = 1452507380;
        fp.hdpa[150] = -1626426603;
        fp.hdpa[151] = 1785560028;
        fp.hdpa[152] = 1879291826;
        fp.hdpa[153] = 451808688;
        fp.hdpa[154] = -177522706;
        fp.hdpa[155] = -929131245;
        fp.hdpa[156] = 2032630977;
        fp.hdpa[157] = 1033728503;
        fp.hdpa[158] = -274341041;
        fp.hdpa[159] = -42446236;
        fp.hdpa[160] = 776344795;
        fp.hdpa[161] = -297928779;
        fp.hdpa[162] = 1928109817;
        fp.hdpa[163] = -1201620204;
        fp.hdpa[164] = 641640183;
        fp.hdpa[165] = -1660460037;
        fp.hdpa[166] = -1692659789;
        fp.hdpa[167] = 375408163;
        fp.hdpa[168] = -860268829;
        fp.hdpa[169] = 505247086;
        fp.hdpa[170] = -1404657123;
        fp.hdpa[171] = -13823820;
        fp.hdpa[172] = 855015939;
        fp.hdpa[173] = 1325474635;
        fp.hdpa[174] = -1944799705;
        fp.hdpa[175] = 589266399;
        fp.hdpa[176] = 1821931339;
        fp.hdpa[177] = -1209717198;
        fp.hdpa[178] = 1945037013;
        fp.hdpa[179] = 1276806583;
        fp.hdpa[180] = 1958758759;
        fp.hdpa[181] = 1285184006;
        fp.hdpa[182] = -816884634;
        fp.hdpa[183] = 1241229207;
        fp.hdpa[184] = -934070676;
        fp.hdpa[185] = 534564593;
        fp.hdpa[186] = -283208093;
        fp.hdpa[187] = 618397548;
        fp.hdpa[188] = -822234072;
        fp.hdpa[189] = -1178196732;
        fp.hdpa[190] = 637141181;
        fp.hdpa[191] = -627308637;
        fp.hdpa[192] = 147553073;
        fp.hdpa[193] = 1086246446;
        fp.hdpa[194] = 819706189;
        fp.hdpa[195] = -1887113611;
        fp.hdpa[196] = 792053712;
        fp.hdpa[197] = 249167766;
        fp.hdpa[198] = 747613737;
        fp.hdpa[199] = 1645919066;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void applyVolume(Clip var0, float var1_1) {
        block105: {
            block104: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fp.od - fp.hdpc("hdxh", hdpo(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fp.hdpc("hdxi", hdpe(int ), (int)159)) break;
                    v0 /* !! */  = (long)fp.hdpc("hdxj", hdpe(int ), (int)160);
                }
                var6_2 = fp.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = fp.od - fp.hdpc("hdxk", hdpo(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == fp.hdpc("hdxl", hdpe(int ), (int)161)) break;
                    v1 /* !! */  = (long)fp.hdpc("hdxm", hdpe(int ), (int)162);
                }
                var5_3 /* !! */  = fp.b;
                v2 /* !! */  = fp.od;
                if (true) ** GOTO lbl17
                block70: while (true) {
                    v2 /* !! */  = (long)(v3 - fp.hdpc("hdxn", hdpo(int ), (int)51));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1386308404: {
                            v3 = fp.hdpc("hdxo", hdpo(int ), (int)52);
                            continue block70;
                        }
                        case -319155496: {
                            v3 = fp.hdpc("hdxp", hdpo(int ), (int)53);
                            continue block70;
                        }
                        case 734908739: {
                            v3 = fp.hdpc("hdxq", hdpo(int ), (int)54);
                            continue block70;
                        }
                        case 2030482935: {
                            break block70;
                        }
                    }
                    break;
                }
                var4_4 = fp.a;
                if (var6_2) {
                    throw null;
lbl32:
                    // 10 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl32
                v4 /* !! */  = fp.od;
                if (true) ** GOTO lbl39
                block72: while (true) {
                    v4 /* !! */  = (long)(fp.hdpc("hdxs", hdpo(int ), (int)56) - fp.hdpc("hdxr", hdpo(int ), (int)55));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -494070045: {
                            continue block72;
                        }
                        case 2030482935: {
                            break block72;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fp.od - fp.hdpc("hdxt", hdpo(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fp.hdpc("hdxu", hdpe(int ), (int)163)) break;
                    v5 /* !! */  = (long)fp.hdpc("hdxv", hdpe(int ), (int)164);
                }
                if (var0.isControlSupported(FloatControl.Type.MASTER_GAIN)) break block104;
                if (var4_4 || var4_4) ** GOTO lbl32
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl32
            v6 /* !! */  = fp.od;
            if (true) ** GOTO lbl58
            block74: while (true) {
                v6 /* !! */  = (long)(v7 - fp.hdpc("hdxw", hdpo(int ), (int)58));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -302577674: {
                        v7 = fp.hdpc("hdxx", hdpo(int ), (int)59);
                        continue block74;
                    }
                    case 1463942670: {
                        v7 = fp.hdpc("hdxy", hdpo(int ), (int)60);
                        continue block74;
                    }
                    case 2030482935: {
                        break block74;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = fp.od - fp.hdpc("hdxz", hdpo(int ), (int)61)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == fp.hdpc("hdya", hdpe(int ), (int)165)) break;
                v8 /* !! */  = (long)fp.hdpc("hdyb", hdpe(int ), (int)166);
            }
            var2_5 = (FloatControl)var0.getControl(FloatControl.Type.MASTER_GAIN);
            if (var4_4 || var4_4) ** GOTO lbl32
            if (!(var1_1 <= 0.0f)) break block105;
            if (var4_4 || var4_4) ** GOTO lbl32
            v9 /* !! */  = fp.od;
            if (true) ** GOTO lbl80
            block76: while (true) {
                v9 /* !! */  = (long)(fp.hdpc("hdyd", hdpo(int ), (int)63) - fp.hdpc("hdyc", hdpo(int ), (int)62));
lbl80:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 117995852: {
                        continue block76;
                    }
                    case 2030482935: {
                        break block76;
                    }
                }
                break;
            }
            v10 = var2_5.getMinimum();
            v11 /* !! */  = fp.od;
            if (true) ** GOTO lbl90
            block77: while (true) {
                v11 /* !! */  = (long)(v12 - fp.hdpc("hdye", hdpo(int ), (int)64));
lbl90:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1051758840: {
                        v12 = fp.hdpc("hdyf", hdpo(int ), (int)65);
                        continue block77;
                    }
                    case -423588138: {
                        v12 = fp.hdpc("hdyg", hdpo(int ), (int)66);
                        continue block77;
                    }
                    case -43327608: {
                        v12 = fp.hdpc("hdyh", hdpo(int ), (int)67);
                        continue block77;
                    }
                    case 2030482935: {
                        break block77;
                    }
                }
                break;
            }
            var2_5.setValue(v10);
            if (var4_4 || var4_4) ** GOTO lbl32
            return;
        }
        if (var4_4) ** GOTO lbl32
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl32
                v13 = fp.hdpc("hdyj", hdyi(int ), (int)68);
                v14 /* !! */  = fp.od;
                if (true) ** GOTO lbl116
                block78: while (true) {
                    v14 /* !! */  = (long)(fp.hdpc("hdyl", hdpo(int ), (int)70) - fp.hdpc("hdyk", hdpo(int ), (int)69));
lbl116:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1320661693: {
                            continue block78;
                        }
                        case 2030482935: {
                            break block78;
                        }
                    }
                    break;
                }
                v15 = Math.min(var1_1, 1.0f);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = fp.od - fp.hdpc("hdym", hdpo(int ), (int)71)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == fp.hdpc("hdyn", hdpe(int ), (int)167)) break;
                    v16 /* !! */  = (long)fp.hdpc("hdyo", hdpe(int ), (int)168);
                }
                var3_6 = (float)(v13 * Math.log10(v15));
                if (var4_4 || var4_4) ** GOTO lbl32
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = fp.od - fp.hdpc("hdyp", hdpo(int ), (int)72)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fp.hdpc("hdyq", hdpe(int ), (int)169)) break;
                    v17 /* !! */  = (long)fp.hdpc("hdyr", hdpe(int ), (int)170);
                }
                v18 = var2_5.getMinimum();
                v19 /* !! */  = fp.od;
                if (true) ** GOTO lbl139
                block81: while (true) {
                    v19 /* !! */  = (long)(v20 - fp.hdpc("hdys", hdpo(int ), (int)73));
lbl139:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -115778363: {
                            v20 = fp.hdpc("hdyt", hdpo(int ), (int)74);
                            continue block81;
                        }
                        case 1692616737: {
                            v20 = fp.hdpc("hdyu", hdpo(int ), (int)75);
                            continue block81;
                        }
                        case 1820244174: {
                            v20 = fp.hdpc("hdyv", hdpo(int ), (int)76);
                            continue block81;
                        }
                        case 2030482935: {
                            break block81;
                        }
                    }
                    break;
                }
                v21 = var2_5.getMaximum();
                v22 /* !! */  = fp.od;
                if (true) ** GOTO lbl156
                block82: while (true) {
                    v22 /* !! */  = (long)(fp.hdpc("hdyx", hdpo(int ), (int)78) - fp.hdpc("hdyw", hdpo(int ), (int)77));
lbl156:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -247533558: {
                            continue block82;
                        }
                        case 2030482935: {
                            break block82;
                        }
                    }
                    break;
                }
                v23 = Math.min(v21, var3_6);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = fp.od - fp.hdpc("hdyy", hdpo(int ), (int)79)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == fp.hdpc("hdyz", hdpe(int ), (int)171)) break;
                    v24 /* !! */  = (long)fp.hdpc("hdza", hdpe(int ), (int)172);
                }
                v25 = Math.max(v18, v23);
                v26 /* !! */  = fp.od;
                if (true) ** GOTO lbl172
                block84: while (true) {
                    v26 /* !! */  = (long)(v27 - fp.hdpc("hdzb", hdpo(int ), (int)80));
lbl172:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 637768540: {
                            v27 = fp.hdpc("hdzc", hdpo(int ), (int)81);
                            continue block84;
                        }
                        case 861731572: {
                            v27 = fp.hdpc("hdzd", hdpo(int ), (int)82);
                            continue block84;
                        }
                        case 1042907946: {
                            v27 = fp.hdpc("hdze", hdpo(int ), (int)83);
                            continue block84;
                        }
                        case 2030482935: {
                            break block84;
                        }
                    }
                    break;
                }
                var2_5.setValue(v25);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzf", hdpe(int ), (int)173);
                if (!var6_2) break;
                throw null;
            }
lbl192:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzg", hdpe(int ), (int)174);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 2: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzh", hdpe(int ), (int)175);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 3: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzi", hdpe(int ), (int)176);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fp.hdpc("hdzj", hdpe(int ), (int)177);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl223
                    break;
                }
            }
            case 5: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzk", hdpe(int ), (int)178);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl218:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzl", hdpe(int ), (int)179);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl223:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzm", hdpe(int ), (int)180);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 8: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzn", hdpe(int ), (int)181);
                if (!var6_2) ** GOTO lbl218
                throw null;
            }
            case 9: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzo", hdpe(int ), (int)182);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 10: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzp", hdpe(int ), (int)183);
                if (!var6_2) break;
                throw null;
            }
lbl241:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzq", hdpe(int ), (int)184);
                if (var6_2) {
                    throw null;
                }
            }
lbl245:
            // 5 sources

            case 12: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzr", hdpe(int ), (int)185);
                if (var6_2) {
                    throw null;
                }
            }
lbl249:
            // 5 sources

            case 13: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzs", hdpe(int ), (int)186);
                if (!var6_2) ** GOTO lbl245
                throw null;
            }
lbl253:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzt", hdpe(int ), (int)187);
                if (!var6_2) ** GOTO lbl192
                throw null;
            }
lbl257:
            // 2 sources

            case 15: {
                do {
                    var5_3 /* !! */  = (int)fp.hdpc("hdzu", hdpe(int ), (int)188);
                } while (!var6_2);
                throw null;
            }
lbl262:
            // 4 sources

            case 16: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzv", hdpe(int ), (int)189);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 17: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzw", hdpe(int ), (int)190);
                if (!var6_2) ** GOTO lbl262
                throw null;
            }
lbl271:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzx", hdpe(int ), (int)191);
                if (!var6_2) ** GOTO lbl262
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)fp.hdpc("hdzy", hdpe(int ), (int)192);
                if (!var6_2) ** GOTO lbl249
                throw null;
            }
            case 20: 
        }
        var5_3 /* !! */  = (int)fp.hdpc("hdzz", hdpe(int ), (int)193);
        ** while (!var6_2)
lbl282:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hecy() {
        fp.hdpb[0] = -1675295958;
        fp.hdpb[1] = -571595010;
        fp.hdpb[2] = -449690949;
        fp.hdpb[3] = -1130468158;
        fp.hdpb[4] = 1888442254;
        fp.hdpb[5] = -1230327801;
        fp.hdpb[6] = 991211489;
        fp.hdpb[7] = 1337037622;
        fp.hdpb[8] = 977046891;
        fp.hdpb[9] = 1073000066;
        fp.hdpb[10] = -1249591000;
        fp.hdpb[11] = -817377463;
        fp.hdpb[12] = -197628921;
        fp.hdpb[13] = 1012894747;
        fp.hdpb[14] = -2058688180;
        fp.hdpb[15] = -24198366;
        fp.hdpb[16] = 1471011893;
        fp.hdpb[17] = 1887148605;
        fp.hdpb[18] = -808685247;
        fp.hdpb[19] = -394708491;
        fp.hdpb[20] = -805916932;
        fp.hdpb[21] = -1429995545;
        fp.hdpb[22] = -1636872898;
        fp.hdpb[23] = 1761587037;
        fp.hdpb[24] = -1189497872;
        fp.hdpb[25] = 1579644191;
        fp.hdpb[26] = 1811941785;
        fp.hdpb[27] = 99974919;
        fp.hdpb[28] = -1310480525;
        fp.hdpb[29] = -2013122533;
        fp.hdpb[30] = -66145353;
        fp.hdpb[31] = 919967707;
        fp.hdpb[32] = -2140268502;
        fp.hdpb[33] = -996287073;
        fp.hdpb[34] = -986353232;
        fp.hdpb[35] = 1401405491;
        fp.hdpb[36] = -1759177997;
        fp.hdpb[37] = -767774446;
        fp.hdpb[38] = 1043880633;
        fp.hdpb[39] = 1848371254;
        fp.hdpb[40] = 801316852;
        fp.hdpb[41] = -2090491316;
        fp.hdpb[42] = 729262317;
        fp.hdpb[43] = -208574041;
        fp.hdpb[44] = -907227131;
        fp.hdpb[45] = 885499304;
        fp.hdpb[46] = 1985916056;
        fp.hdpb[47] = -1950123906;
        fp.hdpb[48] = -1686598212;
        fp.hdpb[49] = 1975269739;
        fp.hdpb[50] = -704348680;
        fp.hdpb[51] = -1904530965;
        fp.hdpb[52] = -2030489053;
        fp.hdpb[53] = -1328386448;
        fp.hdpb[54] = -1420688625;
        fp.hdpb[55] = 536635289;
        fp.hdpb[56] = 588296362;
        fp.hdpb[57] = -1385212154;
        fp.hdpb[58] = 1210187450;
        fp.hdpb[59] = -2051517642;
        fp.hdpb[60] = -559083937;
        fp.hdpb[61] = -1077149672;
        fp.hdpb[62] = 1902804226;
        fp.hdpb[63] = 2125717043;
        fp.hdpb[64] = -1312745380;
        fp.hdpb[65] = -965257073;
        fp.hdpb[66] = 228602033;
        fp.hdpb[67] = 1717148104;
        fp.hdpb[68] = -1389523585;
        fp.hdpb[69] = 1980017395;
        fp.hdpb[70] = 2054788648;
        fp.hdpb[71] = -45481158;
        fp.hdpb[72] = -425283744;
        fp.hdpb[73] = 1123388760;
        fp.hdpb[74] = 826339183;
        fp.hdpb[75] = -1020407712;
        fp.hdpb[76] = -1448251777;
        fp.hdpb[77] = -243766409;
        fp.hdpb[78] = -1136562803;
        fp.hdpb[79] = 2059534435;
        fp.hdpb[80] = -193813059;
        fp.hdpb[81] = 1350766362;
        fp.hdpb[82] = -1412621542;
        fp.hdpb[83] = 1720562884;
        fp.hdpb[84] = 971905293;
        fp.hdpb[85] = 1818413757;
        fp.hdpb[86] = 723409938;
        fp.hdpb[87] = -181528925;
        fp.hdpb[88] = 1088039787;
        fp.hdpb[89] = -95278478;
        fp.hdpb[90] = 372315883;
        fp.hdpb[91] = 1613024317;
        fp.hdpb[92] = 216039436;
        fp.hdpb[93] = 1832800005;
        fp.hdpb[94] = 1591532264;
        fp.hdpb[95] = 1675215542;
        fp.hdpb[96] = -883754282;
        fp.hdpb[97] = -102475937;
        fp.hdpb[98] = 440047535;
        fp.hdpb[99] = -347516904;
    }

    private static /* synthetic */ void hecv() {
        fp.hdpa[0] = -558693590;
        fp.hdpa[1] = -571595010;
        fp.hdpa[2] = -449690913;
        fp.hdpa[3] = -1130468156;
        fp.hdpa[4] = 1888442255;
        fp.hdpa[5] = -1230327806;
        fp.hdpa[6] = 991211488;
        fp.hdpa[7] = 1337037621;
        fp.hdpa[8] = 977046891;
        fp.hdpa[9] = 1073000064;
        fp.hdpa[10] = 1249590999;
        fp.hdpa[11] = -414298032;
        fp.hdpa[12] = -197628922;
        fp.hdpa[13] = -1640468134;
        fp.hdpa[14] = -2058688180;
        fp.hdpa[15] = 24198365;
        fp.hdpa[16] = -1100738460;
        fp.hdpa[17] = 1887148604;
        fp.hdpa[18] = -1191615575;
        fp.hdpa[19] = 394708490;
        fp.hdpa[20] = 1969770920;
        fp.hdpa[21] = -1429995546;
        fp.hdpa[22] = 1240913371;
        fp.hdpa[23] = -1761587038;
        fp.hdpa[24] = 772012101;
        fp.hdpa[25] = 1579644188;
        fp.hdpa[26] = -1811941786;
        fp.hdpa[27] = -1222388729;
        fp.hdpa[28] = -1310480526;
        fp.hdpa[29] = 149845262;
        fp.hdpa[30] = -1094274121;
        fp.hdpa[31] = -919967708;
        fp.hdpa[32] = 197258592;
        fp.hdpa[33] = -996287094;
        fp.hdpa[34] = -986353231;
        fp.hdpa[35] = 1401405502;
        fp.hdpa[36] = -1759177996;
        fp.hdpa[37] = -767774434;
        fp.hdpa[38] = 1043880634;
        fp.hdpa[39] = 1848371254;
        fp.hdpa[40] = 801316853;
        fp.hdpa[41] = -2090491302;
        fp.hdpa[42] = 729262310;
        fp.hdpa[43] = -208574035;
        fp.hdpa[44] = -907227129;
        fp.hdpa[45] = 885499325;
        fp.hdpa[46] = 1985916062;
        fp.hdpa[47] = -1950123917;
        fp.hdpa[48] = -1686598224;
        fp.hdpa[49] = 1975269759;
        fp.hdpa[50] = -704348696;
        fp.hdpa[51] = -1904530952;
        fp.hdpa[52] = -2030489044;
        fp.hdpa[53] = -1328386460;
        fp.hdpa[54] = -1420688628;
        fp.hdpa[55] = 536635279;
        fp.hdpa[56] = 588296381;
        fp.hdpa[57] = -1385212140;
        fp.hdpa[58] = 1210187434;
        fp.hdpa[59] = -2051517644;
        fp.hdpa[60] = -559083937;
        fp.hdpa[61] = -1077149687;
        fp.hdpa[62] = 1902804240;
        fp.hdpa[63] = 2125717035;
        fp.hdpa[64] = -1312745406;
        fp.hdpa[65] = -965257029;
        fp.hdpa[66] = 228601986;
        fp.hdpa[67] = 1717148122;
        fp.hdpa[68] = -1389523604;
        fp.hdpa[69] = 1980017407;
        fp.hdpa[70] = 2054788668;
        fp.hdpa[71] = -45481193;
        fp.hdpa[72] = -425283743;
        fp.hdpa[73] = 1123388741;
        fp.hdpa[74] = 826339190;
        fp.hdpa[75] = -1020407686;
        fp.hdpa[76] = -1448251792;
        fp.hdpa[77] = -243766437;
        fp.hdpa[78] = -1136562778;
        fp.hdpa[79] = 2059534453;
        fp.hdpa[80] = -193813082;
        fp.hdpa[81] = 1350766368;
        fp.hdpa[82] = -1412621567;
        fp.hdpa[83] = 1720562909;
        fp.hdpa[84] = 971905315;
        fp.hdpa[85] = 1818413711;
        fp.hdpa[86] = 723409928;
        fp.hdpa[87] = -181528926;
        fp.hdpa[88] = 1088039763;
        fp.hdpa[89] = -95278523;
        fp.hdpa[90] = 372315852;
        fp.hdpa[91] = 1613024273;
        fp.hdpa[92] = 216039455;
        fp.hdpa[93] = 1832800047;
        fp.hdpa[94] = 1591532241;
        fp.hdpa[95] = 1675215524;
        fp.hdpa[96] = -883754247;
        fp.hdpa[97] = -102475961;
        fp.hdpa[98] = 440047516;
        fp.hdpa[99] = -347516896;
    }

    private static /* synthetic */ double hdyi(int n2) {
        return Double.longBitsToDouble(hdpp[n2] ^ hdpq[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Thread lambda$static$0(Runnable var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fp.od - fp.hdpc("hebu", hdpo(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fp.hdpc("hebv", hdpe(int ), (int)220)) break;
            v0 /* !! */  = (long)fp.hdpc("hebw", hdpe(int ), (int)221);
        }
        var4_1 = fp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fp.od - fp.hdpc("hebx", hdpo(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fp.hdpc("heby", hdpe(int ), (int)222)) break;
            v1 /* !! */  = (long)fp.hdpc("hebz", hdpe(int ), (int)223);
        }
        var3_2 /* !! */  = fp.b;
        v2 /* !! */  = fp.od;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(fp.hdpc("hecb", hdpo(int ), (int)107) - fp.hdpc("heca", hdpo(int ), (int)106));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -917035489: {
                    continue block27;
                }
                case 2030482935: {
                    break block27;
                }
            }
            break;
        }
        var2_3 = fp.a;
        if (var4_1) {
            throw null;
lbl27:
            // 3 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl27
        v3 /* !! */  = fp.od;
        if (true) ** GOTO lbl34
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - fp.hdpc("hecc", hdpo(int ), (int)108));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1031394181: {
                    v4 = fp.hdpc("hecd", hdpo(int ), (int)109);
                    continue block29;
                }
                case 840473325: {
                    v4 = fp.hdpc("hece", hdpo(int ), (int)110);
                    continue block29;
                }
                case 1702544770: {
                    v4 = fp.hdpc("hecf", hdpo(int ), (int)111);
                    continue block29;
                }
                case 2030482935: {
                    break block29;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = fp.od - fp.hdpc("hecg", hdpo(int ), (int)112)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == fp.hdpc("hech", hdpe(int ), (int)224)) break;
            v5 /* !! */  = (long)fp.hdpc("heci", hdpe(int ), (int)225);
        }
        var1_4 = new Thread(var0, "Phobia-ToggleSounds");
        if (var2_3 || var2_3) ** GOTO lbl27
        v6 = fp.hdpc("hecj", hdpe(int ), (int)226);
        v7 /* !! */  = fp.od;
        if (true) ** GOTO lbl59
        block31: while (true) {
            v7 /* !! */  = (long)(v8 - fp.hdpc("heck", hdpo(int ), (int)113));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1103071002: {
                    v8 = fp.hdpc("hecl", hdpo(int ), (int)114);
                    continue block31;
                }
                case -485511263: {
                    v8 = fp.hdpc("hecm", hdpo(int ), (int)115);
                    continue block31;
                }
                case 2030482935: {
                    break block31;
                }
            }
            break;
        }
        var1_4.setDaemon((boolean)v6);
        ** while (var2_3 || var2_3)
lbl70:
        // 1 sources

        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return var1_4;
            }
lbl74:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)fp.hdpc("hecn", hdpe(int ), (int)227);
                if (!var4_1) break;
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)fp.hdpc("heco", hdpe(int ), (int)228);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var3_2 /* !! */  = (int)fp.hdpc("hecp", hdpe(int ), (int)229);
                if (var4_1) {
                    throw null;
                }
            }
lbl87:
            // 4 sources

            case 3: {
                var3_2 /* !! */  = (int)fp.hdpc("hecq", hdpe(int ), (int)230);
                if (!var4_1) ** GOTO lbl74
                throw null;
            }
lbl91:
            // 2 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)fp.hdpc("hecr", hdpe(int ), (int)231);
                } while (!var4_1);
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)fp.hdpc("hecs", hdpe(int ), (int)232);
                if (var4_1) {
                    throw null;
                }
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fp.hdpc("hect", hdpe(int ), (int)233);
                    if (!var4_1) ** GOTO lbl87
                    throw null;
                }
            }
            case 7: 
        }
        var3_2 /* !! */  = (int)fp.hdpc("hecu", hdpe(int ), (int)234);
        ** while (!var4_1)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$playToggle$1(String var0, float var1_1) {
        v0 /* !! */  = fp.od;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - fp.hdpc("hebb", hdpo(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -408622554: {
                    v1 = fp.hdpc("hebc", hdpo(int ), (int)95);
                    continue block19;
                }
                case 1621361495: {
                    v1 = fp.hdpc("hebd", hdpo(int ), (int)96);
                    continue block19;
                }
                case 1918609015: {
                    v1 = fp.hdpc("hebe", hdpo(int ), (int)97);
                    continue block19;
                }
                case 2030482935: {
                    break block19;
                }
            }
            break;
        }
        var4_2 = fp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fp.od - fp.hdpc("hebf", hdpo(int ), (int)98)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fp.hdpc("hebg", hdpe(int ), (int)211)) break;
            v2 /* !! */  = (long)fp.hdpc("hebh", hdpe(int ), (int)212);
        }
        var3_3 /* !! */  = fp.b;
        v3 /* !! */  = fp.od;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - fp.hdpc("hebi", hdpo(int ), (int)99));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 471375248: {
                    v4 = fp.hdpc("hebj", hdpo(int ), (int)100);
                    continue block21;
                }
                case 798694511: {
                    v4 = fp.hdpc("hebk", hdpo(int ), (int)101);
                    continue block21;
                }
                case 1023987767: {
                    v4 = fp.hdpc("hebl", hdpo(int ), (int)102);
                    continue block21;
                }
                case 2030482935: {
                    break block21;
                }
            }
            break;
        }
        var2_4 = fp.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl46:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fp.od - fp.hdpc("hebm", hdpo(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fp.hdpc("hebn", hdpe(int ), (int)213)) break;
                    v5 /* !! */  = (long)fp.hdpc("hebo", hdpe(int ), (int)214);
                }
                fp.play(var0, var1_1);
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fp.hdpc("hebp", hdpe(int ), (int)215);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)fp.hdpc("hebq", hdpe(int ), (int)216);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fp.hdpc("hebr", hdpe(int ), (int)217);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)fp.hdpc("hebs", hdpe(int ), (int)218);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)fp.hdpc("hebt", hdpe(int ), (int)219);
        ** while (!var4_2)
lbl79:
        // 1 sources

        throw null;
    }

    static {
        hdpa = new int[235];
        hdpb = new int[235];
        fp.hecv();
        fp.hecw();
        fp.hecx();
        fp.hecy();
        fp.hecz();
        fp.heda();
        hdpp = new long[116];
        hdpq = new long[116];
        fp.hedb();
        fp.hedc();
        fp.hedd();
        fp.hede();
        SOUND_CACHE = new ConcurrentHashMap<String, byte[]>();
        SOUND_EXECUTOR = Executors.newSingleThreadExecutor(fp::lambda$static$0);
    }

    private static /* synthetic */ void hedb() {
        fp.hdpp[0] = 865649611728528135L;
        fp.hdpp[1] = 530273959477912237L;
        fp.hdpp[2] = -1561109206638072176L;
        fp.hdpp[3] = 319553099510388875L;
        fp.hdpp[4] = -6334755898002678374L;
        fp.hdpp[5] = -8360031050718661895L;
        fp.hdpp[6] = -1558163529054060985L;
        fp.hdpp[7] = 4620314025040073629L;
        fp.hdpp[8] = 8459233802732090592L;
        fp.hdpp[9] = 4632712525504740298L;
        fp.hdpp[10] = -5222540367904465332L;
        fp.hdpp[11] = 5789606732288052456L;
        fp.hdpp[12] = 2110050284024392331L;
        fp.hdpp[13] = 3547580234148256402L;
        fp.hdpp[14] = 1852666206703884095L;
        fp.hdpp[15] = -8777402947188630368L;
        fp.hdpp[16] = 3497597366781420944L;
        fp.hdpp[17] = 4629048259583929293L;
        fp.hdpp[18] = -5417253612696518081L;
        fp.hdpp[19] = 6688661920325591382L;
        fp.hdpp[20] = -2563765170789583403L;
        fp.hdpp[21] = -4337213834424447367L;
        fp.hdpp[22] = 2384497583317150866L;
        fp.hdpp[23] = 8924923414744143911L;
        fp.hdpp[24] = -793587565370080464L;
        fp.hdpp[25] = -3814855024776889075L;
        fp.hdpp[26] = -3008704553187561857L;
        fp.hdpp[27] = -1873579229955902616L;
        fp.hdpp[28] = -970792529299359264L;
        fp.hdpp[29] = -8667522304695594201L;
        fp.hdpp[30] = 7534721449050899389L;
        fp.hdpp[31] = -2220592712555869130L;
        fp.hdpp[32] = -3582359839261266737L;
        fp.hdpp[33] = 4574437506118371871L;
        fp.hdpp[34] = 3994526507889809671L;
        fp.hdpp[35] = -6872241161523643903L;
        fp.hdpp[36] = -7583390877071027241L;
        fp.hdpp[37] = -3791523882189921871L;
        fp.hdpp[38] = -328511461502296564L;
        fp.hdpp[39] = -7889657459604056907L;
        fp.hdpp[40] = -2533175170786347632L;
        fp.hdpp[41] = 5919807393860606783L;
        fp.hdpp[42] = -1058196883721377558L;
        fp.hdpp[43] = 8270852529375181439L;
        fp.hdpp[44] = -611918720509764266L;
        fp.hdpp[45] = -7360886413973350550L;
        fp.hdpp[46] = -2451585141957673590L;
        fp.hdpp[47] = -6620893489156286551L;
        fp.hdpp[48] = 7341556992306802659L;
        fp.hdpp[49] = -1972493094185587937L;
        fp.hdpp[50] = -1765397097981987198L;
        fp.hdpp[51] = 304497677416746849L;
        fp.hdpp[52] = -4074045282088408228L;
        fp.hdpp[53] = -2025869266042206889L;
        fp.hdpp[54] = -8738276656067418105L;
        fp.hdpp[55] = -3679377368458889055L;
        fp.hdpp[56] = 3608766683476861750L;
        fp.hdpp[57] = -1220297578416590876L;
        fp.hdpp[58] = -8018429787756254440L;
        fp.hdpp[59] = -1414999925911057081L;
        fp.hdpp[60] = -1641660395093246254L;
        fp.hdpp[61] = 5576245915212290014L;
        fp.hdpp[62] = 3452998149999241117L;
        fp.hdpp[63] = -8064065082637786481L;
        fp.hdpp[64] = 405071145325082434L;
        fp.hdpp[65] = -7941206003975922606L;
        fp.hdpp[66] = -9220728303691100690L;
        fp.hdpp[67] = 1870342517398926345L;
        fp.hdpp[68] = 699612517460051394L;
        fp.hdpp[69] = 3834099157467489264L;
        fp.hdpp[70] = -7914149416281739960L;
        fp.hdpp[71] = -8974226976125870208L;
        fp.hdpp[72] = 5541683183645346276L;
        fp.hdpp[73] = 717584687869669815L;
        fp.hdpp[74] = -97070853362466158L;
        fp.hdpp[75] = -7662733767774376778L;
        fp.hdpp[76] = 6172234777793089621L;
        fp.hdpp[77] = 7122640509429518984L;
        fp.hdpp[78] = 1214049824990595514L;
        fp.hdpp[79] = 8023189431826736363L;
        fp.hdpp[80] = 873970770171125675L;
        fp.hdpp[81] = -5000142755785195268L;
        fp.hdpp[82] = -2555618598455337972L;
        fp.hdpp[83] = -6302145080879699395L;
        fp.hdpp[84] = -6162123738026067288L;
        fp.hdpp[85] = -7523846133917828095L;
        fp.hdpp[86] = -8521808193077878524L;
        fp.hdpp[87] = 4513241745341787049L;
        fp.hdpp[88] = -4215930961163163890L;
        fp.hdpp[89] = 4131116150099561581L;
        fp.hdpp[90] = -7294491013335217825L;
        fp.hdpp[91] = -7778658823623713433L;
        fp.hdpp[92] = 5980452558849355184L;
        fp.hdpp[93] = -8726902358587270262L;
        fp.hdpp[94] = -960434063822493607L;
        fp.hdpp[95] = -2720791225680236639L;
        fp.hdpp[96] = -819914079320126300L;
        fp.hdpp[97] = -5949602122267042715L;
        fp.hdpp[98] = 4688057969251029512L;
        fp.hdpp[99] = 2670726398436551208L;
    }

    private static /* synthetic */ int hdpe(int n2) {
        return hdpa[n2] ^ hdpb[n2];
    }

    /*
     * Exception decompiling
     */
    private static byte[] load(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 18[SWITCH]
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

    private static /* synthetic */ void hecz() {
        fp.hdpb[100] = 848286738;
        fp.hdpb[101] = 1611758639;
        fp.hdpb[102] = 2096478745;
        fp.hdpb[103] = -907808357;
        fp.hdpb[104] = 166114143;
        fp.hdpb[105] = 240566726;
        fp.hdpb[106] = 919716425;
        fp.hdpb[107] = 1790257702;
        fp.hdpb[108] = 1119880681;
        fp.hdpb[109] = -1087675326;
        fp.hdpb[110] = 816490239;
        fp.hdpb[111] = 2033927445;
        fp.hdpb[112] = 975635419;
        fp.hdpb[113] = 8872430;
        fp.hdpb[114] = 1841797678;
        fp.hdpb[115] = -1095630532;
        fp.hdpb[116] = 652876049;
        fp.hdpb[117] = -743323671;
        fp.hdpb[118] = 1321009867;
        fp.hdpb[119] = -902928340;
        fp.hdpb[120] = 1519632359;
        fp.hdpb[121] = 185226676;
        fp.hdpb[122] = 799272402;
        fp.hdpb[123] = 2100043980;
        fp.hdpb[124] = -1528595047;
        fp.hdpb[125] = 1036579871;
        fp.hdpb[126] = 532369815;
        fp.hdpb[127] = 126209381;
        fp.hdpb[128] = 151319983;
        fp.hdpb[129] = 314958681;
        fp.hdpb[130] = 1367364931;
        fp.hdpb[131] = 1272087049;
        fp.hdpb[132] = -379808281;
        fp.hdpb[133] = 1974745298;
        fp.hdpb[134] = -391869150;
        fp.hdpb[135] = -606385777;
        fp.hdpb[136] = 571429813;
        fp.hdpb[137] = -1251427094;
        fp.hdpb[138] = 636967074;
        fp.hdpb[139] = -926963207;
        fp.hdpb[140] = 216228908;
        fp.hdpb[141] = -29038869;
        fp.hdpb[142] = -2094864136;
        fp.hdpb[143] = 692128260;
        fp.hdpb[144] = -180190963;
        fp.hdpb[145] = 291035428;
        fp.hdpb[146] = 549543369;
        fp.hdpb[147] = -26601942;
        fp.hdpb[148] = 164076807;
        fp.hdpb[149] = 1452507383;
        fp.hdpb[150] = -1626426624;
        fp.hdpb[151] = 1785560031;
        fp.hdpb[152] = 1879291829;
        fp.hdpb[153] = 451808701;
        fp.hdpb[154] = -177522719;
        fp.hdpb[155] = -929131242;
        fp.hdpb[156] = 2032630986;
        fp.hdpb[157] = 1033728486;
        fp.hdpb[158] = -274341026;
        fp.hdpb[159] = -42446235;
        fp.hdpb[160] = -1616438871;
        fp.hdpb[161] = 297928778;
        fp.hdpb[162] = 176797450;
        fp.hdpb[163] = 1201620203;
        fp.hdpb[164] = -1136096436;
        fp.hdpb[165] = 1660460036;
        fp.hdpb[166] = 1832846519;
        fp.hdpb[167] = -375408164;
        fp.hdpb[168] = -447328529;
        fp.hdpb[169] = 505247087;
        fp.hdpb[170] = -2002250263;
        fp.hdpb[171] = 13823819;
        fp.hdpb[172] = -551371681;
        fp.hdpb[173] = 1325474624;
        fp.hdpb[174] = -1944799711;
        fp.hdpb[175] = 589266387;
        fp.hdpb[176] = 1821931343;
        fp.hdpb[177] = -1209717197;
        fp.hdpb[178] = 1945037012;
        fp.hdpb[179] = 1276806587;
        fp.hdpb[180] = 1958758774;
        fp.hdpb[181] = 1285184001;
        fp.hdpb[182] = -816884638;
        fp.hdpb[183] = 1241229212;
        fp.hdpb[184] = -934070657;
        fp.hdpb[185] = 534564600;
        fp.hdpb[186] = -283208083;
        fp.hdpb[187] = 618397551;
        fp.hdpb[188] = -822234069;
        fp.hdpb[189] = -1178196721;
        fp.hdpb[190] = 637141177;
        fp.hdpb[191] = -627308629;
        fp.hdpb[192] = 147553072;
        fp.hdpb[193] = 1086246442;
        fp.hdpb[194] = 819706188;
        fp.hdpb[195] = -1482334053;
        fp.hdpb[196] = -792053713;
        fp.hdpb[197] = 170955227;
        fp.hdpb[198] = -747613738;
        fp.hdpb[199] = 987104677;
    }

    /*
     * Exception decompiling
     */
    private static void play(String var0, float var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 0[TRYBLOCK]], but top level block is 6[SWITCH]
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

    public static /* synthetic */ CallSite hdpc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hedd() {
        fp.hdpq[0] = -4847200787708254167L;
        fp.hdpq[1] = 296886153457110523L;
        fp.hdpq[2] = 8862851682374324175L;
        fp.hdpq[3] = 6667012523917813461L;
        fp.hdpq[4] = 6025257570711378920L;
        fp.hdpq[5] = 8002144949145513577L;
        fp.hdpq[6] = 6161373147184134318L;
        fp.hdpq[7] = -7232762026391494054L;
        fp.hdpq[8] = -240423768618672902L;
        fp.hdpq[9] = 2063373066716208897L;
        fp.hdpq[10] = -961834772539703160L;
        fp.hdpq[11] = -3629778144924518080L;
        fp.hdpq[12] = 755627523746546627L;
        fp.hdpq[13] = -1765610903852487346L;
        fp.hdpq[14] = -856085404144884094L;
        fp.hdpq[15] = -7428069664030328463L;
        fp.hdpq[16] = 4416627544434098663L;
        fp.hdpq[17] = -1276888904908425076L;
        fp.hdpq[18] = -7657668018805701350L;
        fp.hdpq[19] = 4155727501792806244L;
        fp.hdpq[20] = -671012410212221807L;
        fp.hdpq[21] = -7327619084543773054L;
        fp.hdpq[22] = -7363002325578730170L;
        fp.hdpq[23] = 7173940475032837683L;
        fp.hdpq[24] = 4539235153803002316L;
        fp.hdpq[25] = -3882066458319957712L;
        fp.hdpq[26] = 4235502787697865694L;
        fp.hdpq[27] = -1660887182798686422L;
        fp.hdpq[28] = -6681572768840572326L;
        fp.hdpq[29] = -8214691306914112215L;
        fp.hdpq[30] = 7048740590618227564L;
        fp.hdpq[31] = 2450117458556749582L;
        fp.hdpq[32] = 3477121016155690211L;
        fp.hdpq[33] = 1985143033575023876L;
        fp.hdpq[34] = 5152195201529464560L;
        fp.hdpq[35] = -19974831499742294L;
        fp.hdpq[36] = -6355946586044258919L;
        fp.hdpq[37] = 187884072802037227L;
        fp.hdpq[38] = -1076564871924850017L;
        fp.hdpq[39] = 7555966372444230337L;
        fp.hdpq[40] = 3870661821924508945L;
        fp.hdpq[41] = 1906814110259123934L;
        fp.hdpq[42] = -2594206713921409169L;
        fp.hdpq[43] = -8065139774487585764L;
        fp.hdpq[44] = 6518207667932984313L;
        fp.hdpq[45] = 1895769846292901245L;
        fp.hdpq[46] = 6296077669174652229L;
        fp.hdpq[47] = 6591157801525587684L;
        fp.hdpq[48] = 5253569110578590402L;
        fp.hdpq[49] = 7154750901633884810L;
        fp.hdpq[50] = -4367753617530078341L;
        fp.hdpq[51] = -5238287025878569124L;
        fp.hdpq[52] = 2986335911127118834L;
        fp.hdpq[53] = -7911114160346542250L;
        fp.hdpq[54] = 5482506752317126223L;
        fp.hdpq[55] = -1168834938924123791L;
        fp.hdpq[56] = -4186759315271244767L;
        fp.hdpq[57] = -6764402034885886135L;
        fp.hdpq[58] = -4278089141236317184L;
        fp.hdpq[59] = -7436440299694263632L;
        fp.hdpq[60] = 3375609072140666230L;
        fp.hdpq[61] = -5611591783791564682L;
        fp.hdpq[62] = -4892813516653174356L;
        fp.hdpq[63] = 5449879217284579765L;
        fp.hdpq[64] = 6217350383120072468L;
        fp.hdpq[65] = -6248011847231668682L;
        fp.hdpq[66] = -6088893119064847560L;
        fp.hdpq[67] = 8116039997314268175L;
        fp.hdpq[68] = 5296661837098485186L;
        fp.hdpq[69] = -3089335702053492078L;
        fp.hdpq[70] = -778213114671804406L;
        fp.hdpq[71] = -7651616918011693244L;
        fp.hdpq[72] = -1553358202416548397L;
        fp.hdpq[73] = 3802779282830922566L;
        fp.hdpq[74] = -9137828677383065762L;
        fp.hdpq[75] = 3542535828058490997L;
        fp.hdpq[76] = 1753460682009957941L;
        fp.hdpq[77] = -6698238078741397572L;
        fp.hdpq[78] = -2650630411104979799L;
        fp.hdpq[79] = -9112401931187052053L;
        fp.hdpq[80] = 1631359830802005632L;
        fp.hdpq[81] = -8535965004457710663L;
        fp.hdpq[82] = -4876709564885089513L;
        fp.hdpq[83] = -5214628719301192596L;
        fp.hdpq[84] = 803593613451646768L;
        fp.hdpq[85] = -7498459495484303001L;
        fp.hdpq[86] = 5863071664744531436L;
        fp.hdpq[87] = 669177800236688550L;
        fp.hdpq[88] = -3717262963535981864L;
        fp.hdpq[89] = 5463337677340475484L;
        fp.hdpq[90] = -2435696493444704978L;
        fp.hdpq[91] = -748353725765519743L;
        fp.hdpq[92] = -9145391079143916476L;
        fp.hdpq[93] = -1337062808239869348L;
        fp.hdpq[94] = -5699336174961479467L;
        fp.hdpq[95] = 6728830985932073201L;
        fp.hdpq[96] = -4073296567197034948L;
        fp.hdpq[97] = 3612853976034595105L;
        fp.hdpq[98] = 2213412502471573484L;
        fp.hdpq[99] = -2216294533555231446L;
    }

    private static /* synthetic */ void heda() {
        fp.hdpb[200] = -1532278466;
        fp.hdpb[201] = -289766521;
        fp.hdpb[202] = 1095042004;
        fp.hdpb[203] = 2026253626;
        fp.hdpb[204] = 1847347729;
        fp.hdpb[205] = 42307566;
        fp.hdpb[206] = 35680901;
        fp.hdpb[207] = 1090432048;
        fp.hdpb[208] = -913094679;
        fp.hdpb[209] = 250366365;
        fp.hdpb[210] = -1238542039;
        fp.hdpb[211] = -43938673;
        fp.hdpb[212] = 1657128195;
        fp.hdpb[213] = 136209061;
        fp.hdpb[214] = 2093333556;
        fp.hdpb[215] = -983106975;
        fp.hdpb[216] = 855059636;
        fp.hdpb[217] = -933687473;
        fp.hdpb[218] = -1767921990;
        fp.hdpb[219] = 1054236371;
        fp.hdpb[220] = 1714707890;
        fp.hdpb[221] = 1775548858;
        fp.hdpb[222] = 1833654166;
        fp.hdpb[223] = 1782346098;
        fp.hdpb[224] = 825040951;
        fp.hdpb[225] = -1766616617;
        fp.hdpb[226] = 1198085037;
        fp.hdpb[227] = 1635042208;
        fp.hdpb[228] = -1678273072;
        fp.hdpb[229] = 370498382;
        fp.hdpb[230] = 421105810;
        fp.hdpb[231] = -397283387;
        fp.hdpb[232] = -2034501406;
        fp.hdpb[233] = -318814723;
        fp.hdpb[234] = -1187860417;
    }

    private static /* synthetic */ long hdpo(int n2) {
        return hdpp[n2] ^ hdpq[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void playToggle(boolean bl2, ds ds2) {
        String string;
        int n2;
        fp fp2;
        boolean bl3;
        boolean bl4;
        block79: {
            block80: {
                Object object = od;
                boolean bl5 = true;
                block39: while (true) {
                    CallSite callSite;
                    if (!bl5 || (bl5 = false) || !true) {
                        object = callSite - fp.hdpc("hdpr", hdpo(int ), (int)0);
                    }
                    switch ((int)object) {
                        case -1927895781: {
                            callSite = fp.hdpc("hdps", hdpo(int ), (int)1);
                            continue block39;
                        }
                        case 94205630: {
                            callSite = fp.hdpc("hdpt", hdpo(int ), (int)2);
                            continue block39;
                        }
                        case 1396412988: {
                            callSite = fp.hdpc("hdpu", hdpo(int ), (int)3);
                            continue block39;
                        }
                        case 2030482935: {
                            break block39;
                        }
                    }
                    break;
                }
                bl4 = c;
                while (true) {
                    long l2;
                    Object object2;
                    if ((object2 = (l2 = od - fp.hdpc("hdpv", hdpo(int ), (int)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                    if (object2 == fp.hdpc("hdpw", hdpe(int ), (int)10)) break;
                    object2 = fp.hdpc("hdpx", hdpe(int ), (int)11);
                }
                int n3 = b;
                Object object3 = od;
                block41: while (true) {
                    switch ((int)object3) {
                        case 398105599: {
                            object3 = fp.hdpc("hdpz", hdpo(int ), (int)6) - fp.hdpc("hdpy", hdpo(int ), (int)5);
                            continue block41;
                        }
                        case 2030482935: {
                            break block41;
                        }
                    }
                    break;
                }
                bl3 = a;
                if (bl4) {
                    throw null;
                }
                if (bl3 || bl3) return;
                Object object4 = od;
                boolean bl6 = true;
                block42: while (true) {
                    CallSite callSite;
                    if (!bl6 || (bl6 = false) || !true) {
                        object4 = callSite - fp.hdpc("hdqa", hdpo(int ), (int)7);
                    }
                    switch ((int)object4) {
                        case -1680314904: {
                            callSite = fp.hdpc("hdqb", hdpo(int ), (int)8);
                            continue block42;
                        }
                        case 1356325405: {
                            callSite = fp.hdpc("hdqc", hdpo(int ), (int)9);
                            continue block42;
                        }
                        case 2030482935: {
                            break block42;
                        }
                        case 2138884876: {
                            callSite = fp.hdpc("hdqd", hdpo(int ), (int)10);
                            continue block42;
                        }
                    }
                    break;
                }
                fp2 = instance;
                if (bl3 || bl3) return;
                if (fp2 == null) break block80;
                if (bl3) return;
                while (true) {
                    long l3;
                    Object object5;
                    if ((object5 = (l3 = od - fp.hdpc("hdqe", hdpo(int ), (int)11)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                    if (object5 == fp.hdpc("hdqf", hdpe(int ), (int)12)) {
                        if (!fp2.isState()) {
                            break;
                        }
                        break block79;
                    }
                    object5 = fp.hdpc("hdqg", hdpe(int ), (int)13);
                }
                if (bl3) return;
                if (ds2 == fp2) break block79;
                if (bl3) return;
            }
            if (bl3 || bl3) return;
            return;
        }
        if (bl3 || bl3) return;
        CallSite callSite = fp.hdpc("hdqh", hdpe(int ), (int)14);
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = od - fp.hdpc("hdqi", hdpo(int ), (int)12)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == fp.hdpc("hdqj", hdpe(int ), (int)15)) break;
            object = fp.hdpc("hdqk", hdpe(int ), (int)16);
        }
        kf kf2 = fp2.soundType;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = od - fp.hdpc("hdql", hdpo(int ), (int)13)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == fp.hdpc("hdqm", hdpe(int ), (int)17)) break;
            object = fp.hdpc("hdqn", hdpe(int ), (int)18);
        }
        List<String> list = kf2.getList();
        Object object = od;
        block46: while (true) {
            switch ((int)object) {
                case -349426232: {
                    object = fp.hdpc("hdqp", hdpo(int ), (int)15) - fp.hdpc("hdqo", hdpo(int ), (int)14);
                    continue block46;
                }
                case 2030482935: {
                    break block46;
                }
            }
            break;
        }
        kf kf3 = fp2.soundType;
        while (true) {
            long l6;
            Object object6;
            if ((object6 = (l6 = od - fp.hdpc("hdqq", hdpo(int ), (int)16)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object6 == fp.hdpc("hdqr", hdpe(int ), (int)19)) break;
            object6 = fp.hdpc("hdqs", hdpe(int ), (int)20);
        }
        String string2 = kf3.getValue();
        while (true) {
            long l7;
            Object object7;
            if ((object7 = (l7 = od - fp.hdpc("hdqt", hdpo(int ), (int)17)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object7 == fp.hdpc("hdqu", hdpe(int ), (int)21)) break;
            object7 = fp.hdpc("hdqv", hdpe(int ), (int)22);
        }
        int n4 = list.indexOf(string2);
        while (true) {
            long l8;
            Object object8;
            if ((object8 = (l8 = od - fp.hdpc("hdqw", hdpo(int ), (int)18)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            if (object8 == fp.hdpc("hdqx", hdpe(int ), (int)23)) {
                n2 = Math.max((int)callSite, n4);
                if (bl3) return;
                break;
            }
            object8 = fp.hdpc("hdqy", hdpe(int ), (int)24);
        }
        if (bl3) return;
        if (bl2) {
            if (bl3) return;
            string = "enabled";
            if (bl4) {
                throw null;
            }
        } else {
            if (bl3 || bl3) return;
            string = "disabled";
        }
        CallSite callSite2 = fp.hdpc("hdqz", hdpe(int ), (int)25);
        while (true) {
            long l9;
            Object object9;
            if ((object9 = (l9 = od - fp.hdpc("hdra", hdpo(int ), (int)19)) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false) continue;
            if (object9 == fp.hdpc("hdrb", hdpe(int ), (int)26)) break;
            object9 = fp.hdpc("hdrc", hdpe(int ), (int)27);
        }
        int n5 = Math.min(n2, (int)callSite2);
        Object object10 = od;
        block51: while (true) {
            switch ((int)object10) {
                case 899733382: {
                    object10 = fp.hdpc("hdre", hdpo(int ), (int)21) - fp.hdpc("hdrd", hdpo(int ), (int)20);
                    continue block51;
                }
                case 2030482935: {
                    break block51;
                }
            }
            break;
        }
        String string3 = string + n5;
        if (bl3 || bl3) return;
        while (true) {
            long l10;
            Object object11;
            if ((object11 = (l10 = od - fp.hdpc("hdrf", hdpo(int ), (int)22)) == 0L ? 0 : (l10 < 0L ? -1 : 1)) == false) continue;
            if (object11 == fp.hdpc("hdrg", hdpe(int ), (int)28)) break;
            object11 = fp.hdpc("hdrh", hdpe(int ), (int)29);
        }
        kg kg2 = fp2.volume;
        Object object12 = od;
        block53: while (true) {
            switch ((int)object12) {
                case 1838365205: {
                    object12 = fp.hdpc("hdrj", hdpo(int ), (int)24) - fp.hdpc("hdri", hdpo(int ), (int)23);
                    continue block53;
                }
                case 2030482935: {
                    break block53;
                }
            }
            break;
        }
        float f2 = kg2.getValue() / fp.hdpc("hdrk", hdoz(int ), (int)30);
        if (bl3 || bl3) return;
        Object object13 = od;
        boolean bl7 = true;
        block54: while (true) {
            CallSite callSite3;
            if (!bl7 || (bl7 = false) || !true) {
                object13 = callSite3 - fp.hdpc("hdrl", hdpo(int ), (int)25);
            }
            switch ((int)object13) {
                case -1214354495: {
                    callSite3 = fp.hdpc("hdrm", hdpo(int ), (int)26);
                    continue block54;
                }
                case 834305639: {
                    callSite3 = fp.hdpc("hdrn", hdpo(int ), (int)27);
                    continue block54;
                }
                case 2030482935: {
                    break block54;
                }
            }
            break;
        }
        Object object14 = od;
        boolean bl8 = true;
        block55: while (true) {
            CallSite callSite4;
            if (!bl8 || (bl8 = false) || !true) {
                object14 = callSite4 - fp.hdpc("hdro", hdpo(int ), (int)28);
            }
            switch ((int)object14) {
                case -1551302983: {
                    callSite4 = fp.hdpc("hdrp", hdpo(int ), (int)29);
                    continue block55;
                }
                case 594951534: {
                    callSite4 = fp.hdpc("hdrq", hdpo(int ), (int)30);
                    continue block55;
                }
                case 2007493214: {
                    callSite4 = fp.hdpc("hdrr", hdpo(int ), (int)31);
                    continue block55;
                }
                case 2030482935: {
                    break block55;
                }
            }
            break;
        }
        Runnable runnable = () -> fp.lambda$playToggle$1(string3, f2);
        while (true) {
            long l11;
            Object object15;
            if ((object15 = (l11 = od - fp.hdpc("hdrs", hdpo(int ), (int)32)) == 0L ? 0 : (l11 < 0L ? -1 : 1)) == false) continue;
            if (object15 == fp.hdpc("hdrt", hdpe(int ), (int)31)) {
                SOUND_EXECUTOR.execute(runnable);
                if (bl3) return;
                break;
            }
            object15 = fp.hdpc("hdru", hdpe(int ), (int)32);
        }
        if (!bl3) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fp() {
        var2_1 /* !! */  = fp.b;
        super("ToggleSounds", "\u0412\u043e\u0441\u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u0442 \u0437\u0432\u0443\u043a\u0438 \u043f\u0440\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0438 \u0438 \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0438 \u043c\u043e\u0434\u0443\u043b\u0435\u0439", du.MISC);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.soundType = new kf("\u0422\u0438\u043f \u0437\u0432\u0443\u043a\u0430", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043d\u0430\u0431\u043e\u0440 \u0437\u0432\u0443\u043a\u043e\u0432 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u0438 \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", "\u0422\u0438\u043f 1", new String[]{"\u0422\u0438\u043f 1", "\u0422\u0438\u043f 2", "\u0422\u0438\u043f 3", "\u0422\u0438\u043f 4"});
                this.volume = new kg("\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c", "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c \u0437\u0432\u0443\u043a\u043e\u0432 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u043c\u043e\u0434\u0443\u043b\u0435\u0439", (float)fp.hdpc("hdpd", hdoz(int ), (int)0)).range((int)fp.hdpc("hdpf", hdpe(int ), (int)1), (int)fp.hdpc("hdpg", hdpe(int ), (int)2)).suffix("%");
                fp.instance = this;
                this.settings(new jx[]{this.soundType, this.volume});
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)fp.hdpc("hdph", hdpe(int ), (int)3);
                }
            }
lbl15:
            // 2 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)fp.hdpc("hdpi", hdpe(int ), (int)4);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)fp.hdpc("hdpj", hdpe(int ), (int)5);
            }
            case 3: {
                var2_1 /* !! */  = (int)fp.hdpc("hdpk", hdpe(int ), (int)6);
                break;
            }
            case 4: {
                var2_1 /* !! */  = (int)fp.hdpc("hdpl", hdpe(int ), (int)7);
                ** GOTO lbl11
            }
            case 5: {
                var2_1 /* !! */  = (int)fp.hdpc("hdpm", hdpe(int ), (int)8);
                ** GOTO lbl15
            }
            case 6: 
        }
        while (true) {
            var2_1 /* !! */  = (int)fp.hdpc("hdpn", hdpe(int ), (int)9);
        }
    }
}

