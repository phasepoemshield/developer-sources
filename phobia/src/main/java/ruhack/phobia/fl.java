/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_3262
 *  net.minecraft.class_5250
 *  net.minecraft.class_8518
 */
package ruhack.phobia;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_3262;
import net.minecraft.class_5250;
import net.minecraft.class_8518;
import ruhack.phobia.a.f;
import ruhack.phobia.aw;
import ruhack.phobia.bp;
import ruhack.phobia.cy;
import ruhack.phobia.d;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.g;
import ruhack.phobia.jx;
import ruhack.phobia.kh;
import ruhack.phobia.mk;
import ruhack.phobia.na;
import ruhack.phobia.nj;
import ruhack.phobia.pp;

public final class fl
extends ds {
    private final kh returnText;
    private static int[] hqis;
    static final long ou = 7585798360419557175L;
    private final Set<ds> restoreModules;
    private static final Path CLIENT_FOLDER;
    private int windowRestoreTicks;
    private static volatile boolean hiddenFolderNameRequested;
    public static final int b;
    private static final AtomicBoolean FOLDER_RENAME_WORKER_RUNNING;
    private boolean confirmationPending;
    private static volatile boolean unhooked;
    public static final boolean c;
    private static long[] hqjb;
    private static long[] hqjc;
    private static int[] hqir;
    public static final boolean a;
    private static final Path HIDDEN_CLIENT_FOLDER;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isClientFolderNameApplied(boolean var0) {
        block94: {
            block93: {
                block92: {
                    block91: {
                        block90: {
                            block89: {
                                while (true) {
                                    if ((v0 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hred", hqja(int ), (int)160)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                        continue;
                                    }
                                    if (v0 /* !! */  == fl.hqit("hree", hqiq(int ), (int)392)) break;
                                    v0 /* !! */  = (long)fl.hqit("href", hqiq(int ), (int)393);
                                }
                                var5_1 = fl.c;
                                while (true) {
                                    if ((v1 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hreg", hqja(int ), (int)161)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                        continue;
                                    }
                                    if (v1 /* !! */  == fl.hqit("hreh", hqiq(int ), (int)394)) break;
                                    v1 /* !! */  = (long)fl.hqit("hrei", hqiq(int ), (int)395);
                                }
                                var4_2 /* !! */  = fl.b;
                                v2 /* !! */  = fl.ou;
                                if (true) ** GOTO lbl19
                                block52: while (true) {
                                    v2 /* !! */  = (long)(v3 - fl.hqit("hrej", hqja(int ), (int)162));
lbl19:
                                    // 2 sources

                                    switch ((int)v2 /* !! */ ) {
                                        case -494117065: {
                                            break block52;
                                        }
                                        case -38563461: {
                                            v3 = fl.hqit("hrek", hqja(int ), (int)163);
                                            continue block52;
                                        }
                                        case 1444380036: {
                                            v3 = fl.hqit("hrel", hqja(int ), (int)164);
                                            continue block52;
                                        }
                                    }
                                    break;
                                }
                                var3_3 = fl.a;
                                if (var5_1) {
                                    throw null;
lbl31:
                                    // 11 sources

                                    return (boolean)fl.hqit("hrem", hqiq(int ), (int)396);
                                }
                                if (var3_3 || var3_3) ** GOTO lbl31
                                if (!var0) break block89;
                                if (var3_3) ** GOTO lbl31
                                v4 /* !! */  = fl.ou;
                                if (true) ** GOTO lbl40
                                block54: while (true) {
                                    v4 /* !! */  = (long)(v5 - fl.hqit("hren", hqja(int ), (int)165));
lbl40:
                                    // 2 sources

                                    switch ((int)v4 /* !! */ ) {
                                        case -1751102218: {
                                            v5 = fl.hqit("hreo", hqja(int ), (int)166);
                                            continue block54;
                                        }
                                        case -494117065: {
                                            break block54;
                                        }
                                        case 1483900971: {
                                            v5 = fl.hqit("hrep", hqja(int ), (int)167);
                                            continue block54;
                                        }
                                    }
                                    break;
                                }
                                v6 = fl.CLIENT_FOLDER;
                                if (var5_1) {
                                    throw null;
                                }
                                break block90;
                            }
                            if (var3_3 || var3_3) ** GOTO lbl31
                            while (true) {
                                if ((v7 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hreq", hqja(int ), (int)168)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                    continue;
                                }
                                if (v7 /* !! */  == fl.hqit("hrer", hqiq(int ), (int)397)) {
                                    v6 = fl.HIDDEN_CLIENT_FOLDER;
                                    break;
                                }
                                v7 /* !! */  = (long)fl.hqit("hres", hqiq(int ), (int)398);
                            }
                        }
                        var1_4 = v6;
                        if (var3_3 || var3_3) ** GOTO lbl31
                        if (!var0) break block91;
                        if (var3_3) ** GOTO lbl31
                        v8 /* !! */  = fl.ou;
                        if (true) ** GOTO lbl72
                        block56: while (true) {
                            v8 /* !! */  = (long)(v9 - fl.hqit("hret", hqja(int ), (int)169));
lbl72:
                            // 2 sources

                            switch ((int)v8 /* !! */ ) {
                                case -1138408888: {
                                    v9 = fl.hqit("hreu", hqja(int ), (int)170);
                                    continue block56;
                                }
                                case -494117065: {
                                    break block56;
                                }
                                case 1053990583: {
                                    v9 = fl.hqit("hrev", hqja(int ), (int)171);
                                    continue block56;
                                }
                                case 1810024960: {
                                    v9 = fl.hqit("hrew", hqja(int ), (int)172);
                                    continue block56;
                                }
                            }
                            break;
                        }
                        v10 = fl.HIDDEN_CLIENT_FOLDER;
                        if (var5_1) {
                            throw null;
                        }
                        break block92;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl31
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hrex", hqja(int ), (int)173)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == fl.hqit("hrey", hqiq(int ), (int)399)) {
                            v10 = fl.CLIENT_FOLDER;
                            break;
                        }
                        v11 /* !! */  = (long)fl.hqit("hrez", hqiq(int ), (int)400);
                    }
                }
                var2_5 = v10;
                if (var3_3 || var3_3) ** GOTO lbl31
                v12 = new LinkOption[]{};
                v13 /* !! */  = fl.ou;
                if (true) ** GOTO lbl106
                block58: while (true) {
                    v13 /* !! */  = (long)(fl.hqit("hrfb", hqja(int ), (int)175) - fl.hqit("hrfa", hqja(int ), (int)174));
lbl106:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -494117065: {
                            break block58;
                        }
                        case 1958440091: {
                            continue block58;
                        }
                    }
                    break;
                }
                if (!Files.exists(var1_4, v12)) break block93;
                if (var3_3) ** GOTO lbl31
                v14 = new LinkOption[]{};
                v15 /* !! */  = fl.ou;
                if (true) ** GOTO lbl118
                block59: while (true) {
                    v15 /* !! */  = (long)(v16 - fl.hqit("hrfc", hqja(int ), (int)176));
lbl118:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1579077650: {
                            v16 = fl.hqit("hrfd", hqja(int ), (int)177);
                            continue block59;
                        }
                        case -494117065: {
                            break block59;
                        }
                        case 1186387277: {
                            v16 = fl.hqit("hrfe", hqja(int ), (int)178);
                            continue block59;
                        }
                        case 1732220048: {
                            v16 = fl.hqit("hrff", hqja(int ), (int)179);
                            continue block59;
                        }
                    }
                    break;
                }
                if (!Files.exists(var2_5, v14)) break block94;
                if (var3_3) ** GOTO lbl31
            }
            if (var3_3 || var3_3) ** GOTO lbl31
            v17 = fl.hqit("hrfg", hqiq(int ), (int)401);
            if (var5_1) {
                throw null;
            }
            ** GOTO lbl145
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v17 = fl.hqit("hrfh", hqiq(int ), (int)402);
lbl145:
                // 2 sources

                return (boolean)v17;
            }
            case 0: {
                var4_2 /* !! */  = (int)fl.hqit("hrfi", hqiq(int ), (int)403);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 1: {
                var4_2 /* !! */  = (int)fl.hqit("hrfj", hqiq(int ), (int)404);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 2: {
                var4_2 /* !! */  = (int)fl.hqit("hrfk", hqiq(int ), (int)405);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl161:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)fl.hqit("hrfl", hqiq(int ), (int)406);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl166:
            // 4 sources

            case 4: {
                var4_2 /* !! */  = (int)fl.hqit("hrfm", hqiq(int ), (int)407);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)fl.hqit("hrfn", hqiq(int ), (int)408);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl175:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)fl.hqit("hrfo", hqiq(int ), (int)409);
                if (var5_1) {
                    throw null;
                }
            }
lbl179:
            // 5 sources

            case 7: {
                var4_2 /* !! */  = (int)fl.hqit("hrfp", hqiq(int ), (int)410);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl184:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)fl.hqit("hrfq", hqiq(int ), (int)411);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl189:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fl.hqit("hrfr", hqiq(int ), (int)412);
                    if (!var5_1) ** GOTO lbl166
                    throw null;
                }
            }
lbl194:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)fl.hqit("hrfs", hqiq(int ), (int)413);
                if (!var5_1) ** GOTO lbl179
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)fl.hqit("hrft", hqiq(int ), (int)414);
                if (!var5_1) ** GOTO lbl184
                throw null;
            }
lbl202:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)fl.hqit("hrfu", hqiq(int ), (int)415);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl207:
            // 4 sources

            case 13: {
                var4_2 /* !! */  = (int)fl.hqit("hrfv", hqiq(int ), (int)416);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl212:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)fl.hqit("hrfw", hqiq(int ), (int)417);
                if (!var5_1) ** GOTO lbl166
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)fl.hqit("hrfx", hqiq(int ), (int)418);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)fl.hqit("hrfy", hqiq(int ), (int)419);
                if (!var5_1) ** GOTO lbl166
                throw null;
            }
lbl224:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)fl.hqit("hrfz", hqiq(int ), (int)420);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl229:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)fl.hqit("hrga", hqiq(int ), (int)421);
                if (!var5_1) ** GOTO lbl189
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)fl.hqit("hrgb", hqiq(int ), (int)422);
                if (!var5_1) ** GOTO lbl194
                throw null;
            }
lbl237:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)fl.hqit("hrgc", hqiq(int ), (int)423);
                if (!var5_1) ** GOTO lbl207
                throw null;
            }
            case 21: 
        }
        var4_2 /* !! */  = (int)fl.hqit("hrgd", hqiq(int ), (int)424);
        ** while (!var5_1)
lbl244:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hrok() {
        fl.hqjb[200] = 8231369819691819696L;
        fl.hqjb[201] = -2469260793069007217L;
        fl.hqjb[202] = 3554966901148553425L;
        fl.hqjb[203] = -464454084793237788L;
        fl.hqjb[204] = 135946661884483771L;
        fl.hqjb[205] = -162241344955133310L;
        fl.hqjb[206] = -2567852512629228671L;
        fl.hqjb[207] = 2972892891442614231L;
        fl.hqjb[208] = 7957883405153214507L;
        fl.hqjb[209] = 1986362846393606609L;
        fl.hqjb[210] = -8578220835384757617L;
        fl.hqjb[211] = -1167337967195295564L;
        fl.hqjb[212] = 8707628732151040898L;
        fl.hqjb[213] = 7213760099693158730L;
        fl.hqjb[214] = -5835758905644800727L;
        fl.hqjb[215] = 5409158822957925080L;
        fl.hqjb[216] = -770421057306844819L;
        fl.hqjb[217] = -230218166845947968L;
        fl.hqjb[218] = 8024336102349331116L;
        fl.hqjb[219] = 4737013886494810108L;
        fl.hqjb[220] = 4984739244946313910L;
        fl.hqjb[221] = -1718847305632582115L;
        fl.hqjb[222] = 799208821402898666L;
        fl.hqjb[223] = 8099411119874746920L;
        fl.hqjb[224] = -2028049052438294157L;
        fl.hqjb[225] = 3324190147184218436L;
        fl.hqjb[226] = -2223055787254355542L;
        fl.hqjb[227] = -5170048088745912791L;
        fl.hqjb[228] = 2276446291940448345L;
        fl.hqjb[229] = 7835273176101531568L;
        fl.hqjb[230] = 3594965724289712680L;
        fl.hqjb[231] = 6977087497104890501L;
        fl.hqjb[232] = 2950854436506351604L;
        fl.hqjb[233] = -1764257538509846208L;
        fl.hqjb[234] = 7369831697818153981L;
        fl.hqjb[235] = 119379475216260543L;
        fl.hqjb[236] = -5738292436833906621L;
        fl.hqjb[237] = -3487243992789313752L;
        fl.hqjb[238] = 3193615615896593717L;
        fl.hqjb[239] = 1989756630378411594L;
    }

    private static /* synthetic */ void hrnx() {
        fl.hqir[100] = -2098980532;
        fl.hqir[101] = 1834251509;
        fl.hqir[102] = -1004314897;
        fl.hqir[103] = 1517892693;
        fl.hqir[104] = -1633412684;
        fl.hqir[105] = 1548889678;
        fl.hqir[106] = -117429990;
        fl.hqir[107] = -1959804953;
        fl.hqir[108] = 283890115;
        fl.hqir[109] = -1165739573;
        fl.hqir[110] = -250437700;
        fl.hqir[111] = 961967157;
        fl.hqir[112] = 565176203;
        fl.hqir[113] = 1227203685;
        fl.hqir[114] = -870150964;
        fl.hqir[115] = 1529443829;
        fl.hqir[116] = -1224832378;
        fl.hqir[117] = -1850292076;
        fl.hqir[118] = 1164113681;
        fl.hqir[119] = -53195099;
        fl.hqir[120] = 749814267;
        fl.hqir[121] = 651248025;
        fl.hqir[122] = 1183508797;
        fl.hqir[123] = -467921647;
        fl.hqir[124] = -2008595903;
        fl.hqir[125] = 1185817912;
        fl.hqir[126] = 1749223131;
        fl.hqir[127] = 2082370404;
        fl.hqir[128] = 734811756;
        fl.hqir[129] = 368443375;
        fl.hqir[130] = 116529503;
        fl.hqir[131] = 1547341930;
        fl.hqir[132] = -814736845;
        fl.hqir[133] = 658302696;
        fl.hqir[134] = 535747424;
        fl.hqir[135] = -2128311831;
        fl.hqir[136] = -442068506;
        fl.hqir[137] = 1063572809;
        fl.hqir[138] = -1773502414;
        fl.hqir[139] = 195286586;
        fl.hqir[140] = 1180427833;
        fl.hqir[141] = -512782866;
        fl.hqir[142] = 2122469743;
        fl.hqir[143] = -1120001919;
        fl.hqir[144] = 710140775;
        fl.hqir[145] = 223546805;
        fl.hqir[146] = 1233370578;
        fl.hqir[147] = -1302966984;
        fl.hqir[148] = 559271474;
        fl.hqir[149] = -802832754;
        fl.hqir[150] = 303277515;
        fl.hqir[151] = 1782087165;
        fl.hqir[152] = 275271956;
        fl.hqir[153] = -1792907754;
        fl.hqir[154] = -299114342;
        fl.hqir[155] = -1770065499;
        fl.hqir[156] = -672001635;
        fl.hqir[157] = 273336128;
        fl.hqir[158] = -1012277717;
        fl.hqir[159] = 2007901398;
        fl.hqir[160] = 2031755491;
        fl.hqir[161] = 1429611330;
        fl.hqir[162] = 79606594;
        fl.hqir[163] = -430705015;
        fl.hqir[164] = -809321930;
        fl.hqir[165] = 1707537381;
        fl.hqir[166] = 516040910;
        fl.hqir[167] = -361900441;
        fl.hqir[168] = -852752908;
        fl.hqir[169] = -95057112;
        fl.hqir[170] = 1980735221;
        fl.hqir[171] = 1284913931;
        fl.hqir[172] = -437005240;
        fl.hqir[173] = 496203737;
        fl.hqir[174] = -861087023;
        fl.hqir[175] = -1917194431;
        fl.hqir[176] = -1476230686;
        fl.hqir[177] = 1011209379;
        fl.hqir[178] = -2065166075;
        fl.hqir[179] = -1625690871;
        fl.hqir[180] = 692354089;
        fl.hqir[181] = -1439504959;
        fl.hqir[182] = -2045001773;
        fl.hqir[183] = 90625277;
        fl.hqir[184] = -367847277;
        fl.hqir[185] = 746694703;
        fl.hqir[186] = -1516490350;
        fl.hqir[187] = -2096152693;
        fl.hqir[188] = -2061060722;
        fl.hqir[189] = -1936705524;
        fl.hqir[190] = 1908127282;
        fl.hqir[191] = 933916813;
        fl.hqir[192] = -166243788;
        fl.hqir[193] = 1731211399;
        fl.hqir[194] = -2045777363;
        fl.hqir[195] = 1492987303;
        fl.hqir[196] = -1374676711;
        fl.hqir[197] = -1719244348;
        fl.hqir[198] = 670277528;
        fl.hqir[199] = 1303297160;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fl.ou;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - fl.hqit("hqpy", hqja(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1653511401: {
                    v1 = fl.hqit("hqpz", hqja(int ), (int)57);
                    continue block28;
                }
                case -494117065: {
                    break block28;
                }
                case 1346863929: {
                    v1 = fl.hqit("hqqa", hqja(int ), (int)58);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = fl.c;
        v2 /* !! */  = fl.ou;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - fl.hqit("hqqb", hqja(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1093776099: {
                    v3 = fl.hqit("hqqc", hqja(int ), (int)60);
                    continue block29;
                }
                case -1059825137: {
                    v3 = fl.hqit("hqqd", hqja(int ), (int)61);
                    continue block29;
                }
                case -494117065: {
                    break block29;
                }
                case 1304591311: {
                    v3 = fl.hqit("hqqe", hqja(int ), (int)62);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = fl.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqqf", hqja(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fl.hqit("hqqg", hqiq(int ), (int)127)) break;
            v4 /* !! */  = (long)fl.hqit("hqqh", hqiq(int ), (int)128);
        }
        var1_3 = fl.a;
        if (var3_1) {
            throw null;
lbl41:
            // 5 sources

            return;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqqi", hqja(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fl.hqit("hqqj", hqiq(int ), (int)129)) break;
                    v5 /* !! */  = (long)fl.hqit("hqqk", hqiq(int ), (int)130);
                }
                if (fl.unhooked) ** GOTO lbl75
                if (var1_3 || var1_3) ** GOTO lbl41
                v6 = fl.hqit("hqql", hqiq(int ), (int)131);
                v7 /* !! */  = fl.ou;
                if (true) ** GOTO lbl61
                block33: while (true) {
                    v7 /* !! */  = (long)(v8 - fl.hqit("hqqm", hqja(int ), (int)65));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1794977616: {
                            v8 = fl.hqit("hqqn", hqja(int ), (int)66);
                            continue block33;
                        }
                        case -753884422: {
                            v8 = fl.hqit("hqqo", hqja(int ), (int)67);
                            continue block33;
                        }
                        case -494117065: {
                            break block33;
                        }
                        case 1299269496: {
                            v8 = fl.hqit("hqqp", hqja(int ), (int)68);
                            continue block33;
                        }
                    }
                    break;
                }
                this.confirmationPending = v6;
                if (var1_3) ** GOTO lbl41
lbl75:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl78:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)fl.hqit("hqqq", hqiq(int ), (int)132);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fl.hqit("hqqr", hqiq(int ), (int)133);
                    if (!var3_1) ** GOTO lbl78
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)fl.hqit("hqqs", hqiq(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
            }
lbl92:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)fl.hqit("hqqt", hqiq(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)fl.hqit("hqqu", hqiq(int ), (int)136);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fl.hqit("hqqv", hqiq(int ), (int)137);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)fl.hqit("hqqw", hqiq(int ), (int)138);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)fl.hqit("hqqx", hqiq(int ), (int)139);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)fl.hqit("hqqy", hqiq(int ), (int)140);
        ** while (!var3_1)
lbl115:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isClientMessage(String var1_1) {
        v0 /* !! */  = fl.ou;
        if (true) ** GOTO lbl5
        block58: while (true) {
            v0 /* !! */  = (long)(fl.hqit("hrjy", hqja(int ), (int)213) - fl.hqit("hrjx", hqja(int ), (int)212));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1291443913: {
                    continue block58;
                }
                case -494117065: {
                    break block58;
                }
            }
            break;
        }
        var5_2 = fl.c;
        v1 /* !! */  = fl.ou;
        if (true) ** GOTO lbl15
        block59: while (true) {
            v1 /* !! */  = (long)(fl.hqit("hrka", hqja(int ), (int)215) - fl.hqit("hrjz", hqja(int ), (int)214));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -494117065: {
                    break block59;
                }
                case -365272117: {
                    continue block59;
                }
            }
            break;
        }
        var4_3 /* !! */  = fl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hrkb", hqja(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fl.hqit("hrkc", hqiq(int ), (int)490)) break;
            v2 /* !! */  = (long)fl.hqit("hrkd", hqiq(int ), (int)491);
        }
        var3_4 = fl.a;
        if (var5_2) {
            throw null;
lbl29:
            // 12 sources

            return (boolean)fl.hqit("hrke", hqiq(int ), (int)492);
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hrkf", hqja(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fl.hqit("hrkg", hqiq(int ), (int)493)) break;
            v3 /* !! */  = (long)fl.hqit("hrkh", hqiq(int ), (int)494);
        }
        v4 = var1_1.strip();
        v5 /* !! */  = fl.ou;
        if (true) ** GOTO lbl42
        block63: while (true) {
            v5 /* !! */  = (long)(v6 - fl.hqit("hrki", hqja(int ), (int)218));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -494117065: {
                    break block63;
                }
                case 1229175039: {
                    v6 = fl.hqit("hrkj", hqja(int ), (int)219);
                    continue block63;
                }
                case 1364827214: {
                    v6 = fl.hqit("hrkk", hqja(int ), (int)220);
                    continue block63;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hrkl", hqja(int ), (int)221)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == fl.hqit("hrkm", hqiq(int ), (int)495)) break;
            v7 /* !! */  = (long)fl.hqit("hrkn", hqiq(int ), (int)496);
        }
        var2_5 = v4.toLowerCase(Locale.ROOT);
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hrko", hqja(int ), (int)222)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == fl.hqit("hrkp", hqiq(int ), (int)497)) break;
            v8 /* !! */  = (long)fl.hqit("hrkq", hqiq(int ), (int)498);
        }
        if (var2_5.startsWith("phobia client")) ** GOTO lbl151
        if (var3_4) ** GOTO lbl29
        v9 /* !! */  = fl.ou;
        if (true) ** GOTO lbl69
        block66: while (true) {
            v9 /* !! */  = (long)(v10 - fl.hqit("hrkr", hqja(int ), (int)223));
lbl69:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -494117065: {
                    break block66;
                }
                case 259297851: {
                    v10 = fl.hqit("hrks", hqja(int ), (int)224);
                    continue block66;
                }
                case 365833069: {
                    v10 = fl.hqit("hrkt", hqja(int ), (int)225);
                    continue block66;
                }
                case 1545612253: {
                    v10 = fl.hqit("hrku", hqja(int ), (int)226);
                    continue block66;
                }
            }
            break;
        }
        if (var2_5.startsWith("autobuy ->")) ** GOTO lbl151
        if (var3_4) ** GOTO lbl29
        v11 /* !! */  = fl.ou;
        if (true) ** GOTO lbl87
        block67: while (true) {
            v11 /* !! */  = (long)(v12 - fl.hqit("hrkv", hqja(int ), (int)227));
lbl87:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -494117065: {
                    break block67;
                }
                case 1122880839: {
                    v12 = fl.hqit("hrkw", hqja(int ), (int)228);
                    continue block67;
                }
                case 1343836125: {
                    v12 = fl.hqit("hrkx", hqja(int ), (int)229);
                    continue block67;
                }
                case 1879364135: {
                    v12 = fl.hqit("hrky", hqja(int ), (int)230);
                    continue block67;
                }
            }
            break;
        }
        if (var2_5.startsWith("ancient xray ->")) ** GOTO lbl151
        if (var3_4) ** GOTO lbl29
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = fl.ou - fl.hqit("hrkz", hqja(int ), (int)231)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == fl.hqit("hrla", hqiq(int ), (int)499)) break;
            v13 /* !! */  = (long)fl.hqit("hrlb", hqiq(int ), (int)500);
        }
        if (var2_5.startsWith("help ->")) ** GOTO lbl151
        if (var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v14 /* !! */  = fl.ou;
                if (true) ** GOTO lbl115
                block69: while (true) {
                    v14 /* !! */  = (long)(fl.hqit("hrld", hqja(int ), (int)233) - fl.hqit("hrlc", hqja(int ), (int)232));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -494117065: {
                            break block69;
                        }
                        case 5723278: {
                            continue block69;
                        }
                    }
                    break;
                }
                if (var2_5.startsWith("autoswap ->")) ** GOTO lbl151
                if (var3_4) ** GOTO lbl29
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = fl.ou - fl.hqit("hrle", hqja(int ), (int)234)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fl.hqit("hrlf", hqiq(int ), (int)501)) break;
                    v15 /* !! */  = (long)fl.hqit("hrlg", hqiq(int ), (int)502);
                }
                if (var2_5.startsWith("[baritone]")) ** GOTO lbl151
                if (var3_4) ** GOTO lbl29
                v16 /* !! */  = fl.ou;
                if (true) ** GOTO lbl133
                block71: while (true) {
                    v16 /* !! */  = (long)(fl.hqit("hrli", hqja(int ), (int)236) - fl.hqit("hrlh", hqja(int ), (int)235));
lbl133:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -494117065: {
                            break block71;
                        }
                        case 1881141560: {
                            continue block71;
                        }
                    }
                    break;
                }
                if (var2_5.startsWith("[irc]")) ** GOTO lbl151
                if (var3_4) ** GOTO lbl29
                v17 /* !! */  = fl.ou;
                if (true) ** GOTO lbl144
                block72: while (true) {
                    v17 /* !! */  = (long)(fl.hqit("hrlk", hqja(int ), (int)238) - fl.hqit("hrlj", hqja(int ), (int)237));
lbl144:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -494117065: {
                            break block72;
                        }
                        case -389403265: {
                            continue block72;
                        }
                    }
                    break;
                }
                if (!var2_5.startsWith("[irc dm]")) ** GOTO lbl156
                if (var3_4) ** GOTO lbl29
lbl151:
                // 8 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v18 = fl.hqit("hrll", hqiq(int ), (int)503);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl159
lbl156:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v18 = fl.hqit("hrlm", hqiq(int ), (int)504);
lbl159:
                // 2 sources

                return (boolean)v18;
            }
lbl160:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)fl.hqit("hrln", hqiq(int ), (int)505);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 1: {
                var4_3 /* !! */  = (int)fl.hqit("hrlo", hqiq(int ), (int)506);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 2: {
                var4_3 /* !! */  = (int)fl.hqit("hrlp", hqiq(int ), (int)507);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 3: {
                var4_3 /* !! */  = (int)fl.hqit("hrlq", hqiq(int ), (int)508);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl180:
            // 4 sources

            case 4: {
                var4_3 /* !! */  = (int)fl.hqit("hrlr", hqiq(int ), (int)509);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl185:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)fl.hqit("hrls", hqiq(int ), (int)510);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)fl.hqit("hrlt", hqiq(int ), (int)511);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl194:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)fl.hqit("hrlu", hqiq(int ), (int)512);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl199:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fl.hqit("hrlv", hqiq(int ), (int)513);
                    if (!var5_2) ** GOTO lbl160
                    throw null;
                }
            }
            case 9: {
                do {
                    var4_3 /* !! */  = (int)fl.hqit("hrlw", hqiq(int ), (int)514);
                } while (!var5_2);
                throw null;
            }
lbl209:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)fl.hqit("hrlx", hqiq(int ), (int)515);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl214:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)fl.hqit("hrly", hqiq(int ), (int)516);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
lbl218:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)fl.hqit("hrlz", hqiq(int ), (int)517);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl222:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)fl.hqit("hrma", hqiq(int ), (int)518);
                if (!var5_2) ** GOTO lbl199
                throw null;
            }
lbl226:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)fl.hqit("hrmb", hqiq(int ), (int)519);
                if (!var5_2) ** GOTO lbl199
                throw null;
            }
lbl230:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)fl.hqit("hrmc", hqiq(int ), (int)520);
                if (!var5_2) ** GOTO lbl209
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)fl.hqit("hrmd", hqiq(int ), (int)521);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl238:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)fl.hqit("hrme", hqiq(int ), (int)522);
                if (!var5_2) ** GOTO lbl218
                throw null;
            }
            case 18: 
        }
        var4_3 /* !! */  = (int)fl.hqit("hrmf", hqiq(int ), (int)523);
        ** while (!var5_2)
lbl245:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private void restoreVanillaWindow() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 35[SWITCH]
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

    private static /* synthetic */ void hrob() {
        fl.hqir[500] = 1893316945;
        fl.hqir[501] = -1593113966;
        fl.hqir[502] = -381352456;
        fl.hqir[503] = -1473722469;
        fl.hqir[504] = 544028183;
        fl.hqir[505] = -1330183925;
        fl.hqir[506] = 246036419;
        fl.hqir[507] = -858827113;
        fl.hqir[508] = -329781999;
        fl.hqir[509] = 1421223817;
        fl.hqir[510] = 910582206;
        fl.hqir[511] = 1157260572;
        fl.hqir[512] = 340151154;
        fl.hqir[513] = -2042228842;
        fl.hqir[514] = 491233091;
        fl.hqir[515] = -1562471983;
        fl.hqir[516] = 430244272;
        fl.hqir[517] = -614514697;
        fl.hqir[518] = -163749472;
        fl.hqir[519] = 838720874;
        fl.hqir[520] = 750092666;
        fl.hqir[521] = 1378087259;
        fl.hqir[522] = 372854211;
        fl.hqir[523] = -1891936525;
        fl.hqir[524] = -1141553772;
        fl.hqir[525] = 299797798;
        fl.hqir[526] = 215727967;
        fl.hqir[527] = 870624091;
        fl.hqir[528] = 222311016;
        fl.hqir[529] = -1990801707;
        fl.hqir[530] = -1202351593;
        fl.hqir[531] = 1967092421;
        fl.hqir[532] = -405510835;
        fl.hqir[533] = -234207154;
        fl.hqir[534] = 1853738006;
        fl.hqir[535] = 923260102;
        fl.hqir[536] = 1368629133;
        fl.hqir[537] = -444716711;
        fl.hqir[538] = -254699936;
        fl.hqir[539] = 1946301056;
        fl.hqir[540] = 257038651;
        fl.hqir[541] = -471368026;
        fl.hqir[542] = -1461921560;
        fl.hqir[543] = -140865246;
        fl.hqir[544] = 572201143;
        fl.hqir[545] = 1593760587;
        fl.hqir[546] = -1631048227;
        fl.hqir[547] = -1556540009;
        fl.hqir[548] = 1718546400;
        fl.hqir[549] = 603680825;
        fl.hqir[550] = 354802802;
        fl.hqir[551] = -554690822;
        fl.hqir[552] = 681800169;
        fl.hqir[553] = 1697335676;
        fl.hqir[554] = -2137059377;
        fl.hqir[555] = -1126241923;
        fl.hqir[556] = 1653421653;
        fl.hqir[557] = -151883344;
        fl.hqir[558] = -1098793889;
        fl.hqir[559] = -827143771;
        fl.hqir[560] = 1109999003;
        fl.hqir[561] = 542309733;
        fl.hqir[562] = -1203574968;
        fl.hqir[563] = -278820575;
        fl.hqir[564] = 610520124;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqmn", hqja(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fl.hqit("hqmo", hqiq(int ), (int)80)) break;
            v0 /* !! */  = (long)fl.hqit("hqmp", hqiq(int ), (int)81);
        }
        var5_1 = fl.c;
        v1 /* !! */  = fl.ou;
        if (true) ** GOTO lbl11
        block66: while (true) {
            v1 /* !! */  = (long)(fl.hqit("hqmr", hqja(int ), (int)16) - fl.hqit("hqmq", hqja(int ), (int)15));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -494117065: {
                    break block66;
                }
                case 803247792: {
                    continue block66;
                }
            }
            break;
        }
        var4_2 /* !! */  = fl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqms", hqja(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fl.hqit("hqmt", hqiq(int ), (int)82)) break;
            v2 /* !! */  = (long)fl.hqit("hqmu", hqiq(int ), (int)83);
        }
        var3_3 = fl.a;
        if (var5_1) {
            throw null;
lbl25:
            // 7 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        v3 /* !! */  = fl.ou;
        if (true) ** GOTO lbl32
        block69: while (true) {
            v3 /* !! */  = (long)(v4 - fl.hqit("hqmv", hqja(int ), (int)18));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1408495636: {
                    v4 = fl.hqit("hqmw", hqja(int ), (int)19);
                    continue block69;
                }
                case -494117065: {
                    break block69;
                }
                case 1162173691: {
                    v4 = fl.hqit("hqmx", hqja(int ), (int)20);
                    continue block69;
                }
                case 1702938507: {
                    v4 = fl.hqit("hqmy", hqja(int ), (int)21);
                    continue block69;
                }
            }
            break;
        }
        if (!fl.unhooked) ** GOTO lbl50
        if (var3_3 || var3_3) ** GOTO lbl25
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl50:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl25
            v5 = fl.hqit("hqmz", hqiq(int ), (int)84);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hqna", hqja(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == fl.hqit("hqnb", hqiq(int ), (int)85)) break;
                v6 /* !! */  = (long)fl.hqit("hqnc", hqiq(int ), (int)86);
            }
            this.confirmationPending = v5;
            if (var3_3 || var3_3) ** GOTO lbl25
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hqnd", hqja(int ), (int)23)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == fl.hqit("hqne", hqiq(int ), (int)87)) break;
                v7 /* !! */  = (long)fl.hqit("hqnf", hqiq(int ), (int)88);
            }
            v8 = g.getInstance();
            v9 /* !! */  = fl.ou;
            if (true) ** GOTO lbl69
            block72: while (true) {
                v9 /* !! */  = (long)(v10 - fl.hqit("hqng", hqja(int ), (int)24));
lbl69:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -494117065: {
                        break block72;
                    }
                    case 470047634: {
                        v10 = fl.hqit("hqnh", hqja(int ), (int)25);
                        continue block72;
                    }
                    case 1653587911: {
                        v10 = fl.hqit("hqni", hqja(int ), (int)26);
                        continue block72;
                    }
                }
                break;
            }
            var1_4 = v8.getPrefix();
            if (var3_3 || var3_3) ** GOTO lbl25
            v11 /* !! */  = fl.ou;
            if (true) ** GOTO lbl84
            block73: while (true) {
                v11 /* !! */  = (long)(v12 - fl.hqit("hqnj", hqja(int ), (int)27));
lbl84:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -494117065: {
                        break block73;
                    }
                    case 384741613: {
                        v12 = fl.hqit("hqnk", hqja(int ), (int)28);
                        continue block73;
                    }
                    case 1732060356: {
                        v12 = fl.hqit("hqnl", hqja(int ), (int)29);
                        continue block73;
                    }
                }
                break;
            }
            v13 = class_2561.method_43470((String)"[\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u044c]");
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = fl.ou - fl.hqit("hqnm", hqja(int ), (int)30)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == fl.hqit("hqnn", hqiq(int ), (int)89)) break;
                v14 /* !! */  = (long)fl.hqit("hqno", hqiq(int ), (int)90);
            }
            v15 /* !! */  = fl.ou;
            if (true) ** GOTO lbl103
            block75: while (true) {
                v15 /* !! */  = (long)(v16 - fl.hqit("hqnp", hqja(int ), (int)31));
lbl103:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -494117065: {
                        break block75;
                    }
                    case 834866025: {
                        v16 = fl.hqit("hqnq", hqja(int ), (int)32);
                        continue block75;
                    }
                    case 2033158409: {
                        v16 = fl.hqit("hqnr", hqja(int ), (int)33);
                        continue block75;
                    }
                }
                break;
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = fl.ou - fl.hqit("hqns", hqja(int ), (int)34)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == fl.hqit("hqnt", hqiq(int ), (int)91)) break;
                v17 /* !! */  = (long)fl.hqit("hqnu", hqiq(int ), (int)92);
            }
            v18 = class_2583.field_24360.method_10977(class_124.field_1060);
            v19 = fl.hqit("hqnv", hqiq(int ), (int)93);
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_6 = fl.ou - fl.hqit("hqnw", hqja(int ), (int)35)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == fl.hqit("hqnx", hqiq(int ), (int)94)) break;
                v20 /* !! */  = (long)fl.hqit("hqny", hqiq(int ), (int)95);
            }
            v21 = (boolean)v19;
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_7 = fl.ou - fl.hqit("hqnz", hqja(int ), (int)36)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == fl.hqit("hqoa", hqiq(int ), (int)96)) break;
                v22 /* !! */  = (long)fl.hqit("hqob", hqiq(int ), (int)97);
            }
            v23 = v18.method_10982(v21);
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_8 = fl.ou - fl.hqit("hqoc", hqja(int ), (int)37)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == fl.hqit("hqod", hqiq(int ), (int)98)) break;
                v24 /* !! */  = (long)fl.hqit("hqoe", hqiq(int ), (int)99);
            }
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_9 = fl.ou - fl.hqit("hqof", hqja(int ), (int)38)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == fl.hqit("hqog", hqiq(int ), (int)100)) break;
                v25 /* !! */  = (long)fl.hqit("hqoh", hqiq(int ), (int)101);
            }
            v26 = var1_4 + "selfdestruct confirm";
            while (true) {
                if ((v27 /* !! */  = (cfr_temp_10 = fl.ou - fl.hqit("hqoi", hqja(int ), (int)39)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v27 /* !! */  == fl.hqit("hqoj", hqiq(int ), (int)102)) break;
                v27 /* !! */  = (long)fl.hqit("hqok", hqiq(int ), (int)103);
            }
            v28 = new class_2558.class_10609(v26);
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_11 = fl.ou - fl.hqit("hqol", hqja(int ), (int)40)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == fl.hqit("hqom", hqiq(int ), (int)104)) break;
                v29 /* !! */  = (long)fl.hqit("hqon", hqiq(int ), (int)105);
            }
            v30 = v23.method_10958((class_2558)v28);
            v31 /* !! */  = fl.ou;
            if (true) ** GOTO lbl158
            block83: while (true) {
                v31 /* !! */  = (long)(v32 - fl.hqit("hqoo", hqja(int ), (int)41));
lbl158:
                // 2 sources

                switch ((int)v31 /* !! */ ) {
                    case -1397656915: {
                        v32 = fl.hqit("hqop", hqja(int ), (int)42);
                        continue block83;
                    }
                    case -494117065: {
                        break block83;
                    }
                    case 447726754: {
                        v32 = fl.hqit("hqoq", hqja(int ), (int)43);
                        continue block83;
                    }
                    case 806786145: {
                        v32 = fl.hqit("hqor", hqja(int ), (int)44);
                        continue block83;
                    }
                }
                break;
            }
            var2_5 = v13.method_10862(v30);
            if (var3_3 || var3_3) ** GOTO lbl25
            while (true) {
                if ((v33 /* !! */  = (cfr_temp_12 = fl.ou - fl.hqit("hqos", hqja(int ), (int)45)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                if (v33 /* !! */  == fl.hqit("hqot", hqiq(int ), (int)106)) break;
                v33 /* !! */  = (long)fl.hqit("hqou", hqiq(int ), (int)107);
            }
            v34 = class_2561.method_43470((String)"\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0435 \u0432\u044b\u0433\u0440\u0443\u0437\u043a\u0443 \u043a\u043b\u0438\u0435\u043d\u0442\u0430. ");
            v35 /* !! */  = fl.ou;
            if (true) ** GOTO lbl182
            block85: while (true) {
                v35 /* !! */  = (long)(v36 - fl.hqit("hqov", hqja(int ), (int)46));
lbl182:
                // 2 sources

                switch ((int)v35 /* !! */ ) {
                    case -691016183: {
                        v36 = fl.hqit("hqow", hqja(int ), (int)47);
                        continue block85;
                    }
                    case -494117065: {
                        break block85;
                    }
                    case -57975116: {
                        v36 = fl.hqit("hqox", hqja(int ), (int)48);
                        continue block85;
                    }
                    case 68226603: {
                        v36 = fl.hqit("hqoy", hqja(int ), (int)49);
                        continue block85;
                    }
                }
                break;
            }
            v37 /* !! */  = fl.ou;
            if (true) ** GOTO lbl198
            block86: while (true) {
                v37 /* !! */  = (long)(v38 - fl.hqit("hqoz", hqja(int ), (int)50));
lbl198:
                // 2 sources

                switch ((int)v37 /* !! */ ) {
                    case -2051647538: {
                        v38 = fl.hqit("hqpa", hqja(int ), (int)51);
                        continue block86;
                    }
                    case -494117065: {
                        break block86;
                    }
                    case 1941782727: {
                        v38 = fl.hqit("hqpb", hqja(int ), (int)52);
                        continue block86;
                    }
                }
                break;
            }
            v39 = v34.method_27692(class_124.field_1080);
            while (true) {
                if ((v40 /* !! */  = (cfr_temp_13 = fl.ou - fl.hqit("hqpc", hqja(int ), (int)53)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                if (v40 /* !! */  == fl.hqit("hqpd", hqiq(int ), (int)108)) break;
                v40 /* !! */  = (long)fl.hqit("hqpe", hqiq(int ), (int)109);
            }
            v41 = v39.method_10852((class_2561)var2_5);
            v42 /* !! */  = fl.ou;
            if (true) ** GOTO lbl218
            block88: while (true) {
                v42 /* !! */  = (long)(fl.hqit("hqpg", hqja(int ), (int)55) - fl.hqit("hqpf", hqja(int ), (int)54));
lbl218:
                // 2 sources

                switch ((int)v42 /* !! */ ) {
                    case -494117065: {
                        break block88;
                    }
                    case 1202870623: {
                        continue block88;
                    }
                }
                break;
            }
            pp.brandmessage((class_2561)v41);
            if (var3_3 || var3_3) ** continue;
            return;
lbl226:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)fl.hqit("hqph", hqiq(int ), (int)110);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl231:
            // 2 sources

            case 1: {
                do {
                    var4_2 /* !! */  = (int)fl.hqit("hqpi", hqiq(int ), (int)111);
                } while (!var5_1);
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)fl.hqit("hqpj", hqiq(int ), (int)112);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 3: {
                var4_2 /* !! */  = (int)fl.hqit("hqpk", hqiq(int ), (int)113);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 4: {
                var4_2 /* !! */  = (int)fl.hqit("hqpl", hqiq(int ), (int)114);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 5: {
                var4_2 /* !! */  = (int)fl.hqit("hqpm", hqiq(int ), (int)115);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl256:
            // 5 sources

            case 6: {
                var4_2 /* !! */  = (int)fl.hqit("hqpn", hqiq(int ), (int)116);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 7: {
                var4_2 /* !! */  = (int)fl.hqit("hqpo", hqiq(int ), (int)117);
                if (!var5_1) ** GOTO lbl231
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)fl.hqit("hqpp", hqiq(int ), (int)118);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fl.hqit("hqpq", hqiq(int ), (int)119);
                    if (!var5_1) ** GOTO lbl256
                    throw null;
                }
            }
lbl275:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)fl.hqit("hqpr", hqiq(int ), (int)120);
                if (!var5_1) ** GOTO lbl256
                throw null;
            }
lbl279:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)fl.hqit("hqps", hqiq(int ), (int)121);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 12: {
                var4_2 /* !! */  = (int)fl.hqit("hqpt", hqiq(int ), (int)122);
                if (!var5_1) ** GOTO lbl226
                throw null;
            }
            case 13: {
                do {
                    var4_2 /* !! */  = (int)fl.hqit("hqpu", hqiq(int ), (int)123);
                } while (!var5_1);
                throw null;
            }
lbl293:
            // 4 sources

            case 14: {
                var4_2 /* !! */  = (int)fl.hqit("hqpv", hqiq(int ), (int)124);
                if (!var5_1) ** GOTO lbl279
                throw null;
            }
lbl297:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)fl.hqit("hqpw", hqiq(int ), (int)125);
                if (!var5_1) ** GOTO lbl275
                throw null;
            }
            case 16: 
        }
        var4_2 /* !! */  = (int)fl.hqit("hqpx", hqiq(int ), (int)126);
        ** while (!var5_1)
lbl304:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void confirmUnload() {
        block110: {
            block109: {
                var5_1 = fl.c;
                var4_2 /* !! */  = fl.b;
                var3_3 = fl.a;
                if (var5_1) {
                    throw null;
lbl6:
                    // 30 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.confirmationPending) break block109;
                if (var3_3) ** GOTO lbl6
                if (fl.unhooked) break block109;
                if (var3_3) ** GOTO lbl6
                if (fl.mc.field_1724 != null) break block110;
                if (var3_3) ** GOTO lbl6
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        this.confirmationPending = fl.hqit("hqqz", hqiq(int ), (int)141);
        if (var3_3 || var3_3) ** GOTO lbl6
        this.restoreModules.clear();
        if (var3_3 || var3_3) ** GOTO lbl6
        var1_4 = d.getInstance().getManager().getModuleRepository().allModules().iterator();
        if (var3_3) ** GOTO lbl6
        block58: while (true) {
            if (var3_3 || var3_3) ** GOTO lbl6
            if (!var1_4.hasNext()) ** GOTO lbl47
            if (var3_3) ** GOTO lbl6
            var2_5 = var1_4.next();
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var2_5 == this) ** GOTO lbl44
            if (var3_3) ** GOTO lbl6
            if (!var2_5.isState()) ** GOTO lbl44
            if (var3_3 || var3_3) ** GOTO lbl6
            this.restoreModules.add(var2_5);
            if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_5.setState((boolean)fl.hqit("hqra", hqiq(int ), (int)142));
                    if (var3_3) ** GOTO lbl6
lbl44:
                    // 3 sources

                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (!var5_1) continue block58;
                    throw null;
                }
lbl47:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                fl.unhooked = fl.hqit("hqrb", hqiq(int ), (int)143);
                if (var3_3 || var3_3) ** GOTO lbl6
                fl.requestClientFolderName((boolean)fl.hqit("hqrc", hqiq(int ), (int)144));
                if (var3_3 || var3_3) ** GOTO lbl6
                na.stop();
                if (var3_3 || var3_3) ** GOTO lbl6
                na.setCommandsEnabled((boolean)fl.hqit("hqrd", hqiq(int ), (int)145));
                if (var3_3 || var3_3) ** GOTO lbl6
                mk.INSTANCE.stopForSelfDestruct();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (d.getInstance().getDiscordManager() == null) ** GOTO lbl62
                if (var3_3 || var3_3) ** GOTO lbl6
                d.getInstance().getDiscordManager().stopRPC();
                if (var3_3) ** GOTO lbl6
lbl62:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.windowRestoreTicks = (int)fl.hqit("hqre", hqiq(int ), (int)146);
                if (var3_3 || var3_3) ** GOTO lbl6
                this.restoreVanillaWindow();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.removeClientMessages();
                if (var3_3 || var3_3) ** GOTO lbl6
                fl.mc.method_1507(null);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
lbl73:
                // 2 sources

                case 0: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrf", hqiq(int ), (int)147);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
lbl78:
                // 3 sources

                case 1: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrg", hqiq(int ), (int)148);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
lbl83:
                // 2 sources

                case 2: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrh", hqiq(int ), (int)149);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
lbl88:
                // 2 sources

                case 3: {
                    var4_2 /* !! */  = (int)fl.hqit("hqri", hqiq(int ), (int)150);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 4: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrj", hqiq(int ), (int)151);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 5: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrk", hqiq(int ), (int)152);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
                case 6: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrl", hqiq(int ), (int)153);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
lbl108:
                // 3 sources

                case 7: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrm", hqiq(int ), (int)154);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
lbl113:
                // 2 sources

                case 8: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrn", hqiq(int ), (int)155);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl236
                }
                case 9: {
                    var4_2 /* !! */  = (int)fl.hqit("hqro", hqiq(int ), (int)156);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl123:
                // 2 sources

                case 10: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrp", hqiq(int ), (int)157);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
                case 11: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrq", hqiq(int ), (int)158);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl165
                }
lbl133:
                // 2 sources

                case 12: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrr", hqiq(int ), (int)159);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
lbl138:
                // 2 sources

                case 13: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrs", hqiq(int ), (int)160);
                    if (var5_1) {
                        throw null;
                    }
                }
lbl142:
                // 4 sources

                case 14: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrt", hqiq(int ), (int)161);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
                case 15: {
                    var4_2 /* !! */  = (int)fl.hqit("hqru", hqiq(int ), (int)162);
                    if (!var5_1) ** GOTO lbl83
                    throw null;
                }
lbl151:
                // 2 sources

                case 16: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrv", hqiq(int ), (int)163);
                    if (!var5_1) ** GOTO lbl78
                    throw null;
                }
                case 17: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrw", hqiq(int ), (int)164);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl280
                }
lbl160:
                // 4 sources

                case 18: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrx", hqiq(int ), (int)165);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl309
                }
lbl165:
                // 2 sources

                case 19: {
                    var4_2 /* !! */  = (int)fl.hqit("hqry", hqiq(int ), (int)166);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl309
                }
                case 20: {
                    var4_2 /* !! */  = (int)fl.hqit("hqrz", hqiq(int ), (int)167);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 21: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsa", hqiq(int ), (int)168);
                    if (!var5_1) ** GOTO lbl133
                    throw null;
                }
lbl179:
                // 2 sources

                case 22: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsb", hqiq(int ), (int)169);
                    if (!var5_1) ** GOTO lbl78
                    throw null;
                }
lbl183:
                // 2 sources

                case 23: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsc", hqiq(int ), (int)170);
                    if (!var5_1) ** GOTO lbl179
                    throw null;
                }
lbl187:
                // 3 sources

                case 24: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsd", hqiq(int ), (int)171);
                    if (!var5_1) ** GOTO lbl88
                    throw null;
                }
lbl191:
                // 2 sources

                case 25: {
                    var4_2 /* !! */  = (int)fl.hqit("hqse", hqiq(int ), (int)172);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl196:
                // 3 sources

                case 26: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsf", hqiq(int ), (int)173);
                    if (!var5_1) ** GOTO lbl183
                    throw null;
                }
                case 27: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsg", hqiq(int ), (int)174);
                    if (!var5_1) ** GOTO lbl123
                    throw null;
                }
lbl204:
                // 2 sources

                case 28: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsh", hqiq(int ), (int)175);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl245
                }
lbl209:
                // 2 sources

                case 29: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsi", hqiq(int ), (int)176);
                    if (!var5_1) ** GOTO lbl160
                    throw null;
                }
lbl213:
                // 2 sources

                case 30: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsj", hqiq(int ), (int)177);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 31: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsk", hqiq(int ), (int)178);
                    if (!var5_1) ** GOTO lbl142
                    throw null;
                }
                case 32: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsl", hqiq(int ), (int)179);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl227:
                // 3 sources

                case 33: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsm", hqiq(int ), (int)180);
                    if (!var5_1) ** GOTO lbl160
                    throw null;
                }
                case 34: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsn", hqiq(int ), (int)181);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl236:
                // 2 sources

                case 35: {
                    var4_2 /* !! */  = (int)fl.hqit("hqso", hqiq(int ), (int)182);
                    if (!var5_1) ** GOTO lbl187
                    throw null;
                }
                case 36: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsp", hqiq(int ), (int)183);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
lbl245:
                // 2 sources

                case 37: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsq", hqiq(int ), (int)184);
                    if (!var5_1) ** GOTO lbl160
                    throw null;
                }
lbl249:
                // 5 sources

                case 38: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsr", hqiq(int ), (int)185);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl254:
                // 2 sources

                case 39: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_2 /* !! */  = (int)fl.hqit("hqss", hqiq(int ), (int)186);
                        if (!var5_1) ** GOTO lbl113
                        throw null;
                    }
                }
                case 40: {
                    var4_2 /* !! */  = (int)fl.hqit("hqst", hqiq(int ), (int)187);
                    if (!var5_1) ** GOTO lbl108
                    throw null;
                }
lbl263:
                // 2 sources

                case 41: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsu", hqiq(int ), (int)188);
                    if (!var5_1) ** GOTO lbl108
                    throw null;
                }
                case 42: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsv", hqiq(int ), (int)189);
                    if (!var5_1) ** GOTO lbl249
                    throw null;
                }
                case 43: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsw", hqiq(int ), (int)190);
                    if (!var5_1) ** GOTO lbl249
                    throw null;
                }
lbl275:
                // 2 sources

                case 44: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsx", hqiq(int ), (int)191);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl280:
                // 3 sources

                case 45: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsy", hqiq(int ), (int)192);
                    if (!var5_1) ** GOTO lbl213
                    throw null;
                }
                case 46: {
                    var4_2 /* !! */  = (int)fl.hqit("hqsz", hqiq(int ), (int)193);
                    if (!var5_1) ** GOTO lbl73
                    throw null;
                }
lbl288:
                // 3 sources

                case 47: {
                    var4_2 /* !! */  = (int)fl.hqit("hqta", hqiq(int ), (int)194);
                    if (!var5_1) ** GOTO lbl204
                    throw null;
                }
                case 48: {
                    var4_2 /* !! */  = (int)fl.hqit("hqtb", hqiq(int ), (int)195);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl297:
                // 3 sources

                case 49: {
                    var4_2 /* !! */  = (int)fl.hqit("hqtc", hqiq(int ), (int)196);
                    if (!var5_1) ** GOTO lbl187
                    throw null;
                }
lbl301:
                // 7 sources

                case 50: {
                    var4_2 /* !! */  = (int)fl.hqit("hqtd", hqiq(int ), (int)197);
                    if (!var5_1) ** GOTO lbl280
                    throw null;
                }
                case 51: {
                    var4_2 /* !! */  = (int)fl.hqit("hqte", hqiq(int ), (int)198);
                    if (!var5_1) ** GOTO lbl138
                    throw null;
                }
lbl309:
                // 3 sources

                case 52: {
                    var4_2 /* !! */  = (int)fl.hqit("hqtf", hqiq(int ), (int)199);
                    if (!var5_1) ** GOTO lbl209
                    throw null;
                }
lbl313:
                // 2 sources

                case 53: {
                    var4_2 /* !! */  = (int)fl.hqit("hqtg", hqiq(int ), (int)200);
                    if (!var5_1) ** GOTO lbl191
                    throw null;
                }
                case 54: 
            }
            break;
        }
        var4_2 /* !! */  = (int)fl.hqit("hqth", hqiq(int ), (int)201);
        ** while (!var5_1)
lbl320:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fl() {
        var2_1 /* !! */  = fl.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("SelfDestruct", "\u0412\u0440\u0435\u043c\u0435\u043d\u043d\u043e \u0432\u044b\u0433\u0440\u0443\u0436\u0430\u0435\u0442 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441 \u0438 \u0444\u0443\u043d\u043a\u0446\u0438\u0438 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", du.MISC);
                this.returnText = new kh("\u0422\u0435\u043a\u0441\u0442 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0435\u043d\u0438\u044f", "\u0412\u0432\u0435\u0434\u0451\u043d\u043d\u044b\u0439 \u0442\u0435\u043a\u0441\u0442 \u0432\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442 \u043f\u043e\u0441\u043b\u0435 \u0430\u043d\u0445\u0443\u043a\u0430", "\u0412\u0435\u0440\u043d\u0443\u0442\u044c");
                this.restoreModules = new LinkedHashSet<ds>();
                this.settings(new jx[]{this.returnText});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fl.hqit("hqiu", hqiq(int ), (int)0);
                ** GOTO lbl24
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)fl.hqit("hqiv", hqiq(int ), (int)1);
                }
            }
lbl17:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fl.hqit("hqiw", hqiq(int ), (int)2);
                ** GOTO lbl24
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)fl.hqit("hqix", hqiq(int ), (int)3);
                }
            }
lbl24:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fl.hqit("hqiy", hqiq(int ), (int)4);
                    ** GOTO lbl17
                    break;
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)fl.hqit("hqiz", hqiq(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ void hrom() {
        fl.hqjc[100] = -3317124191415798815L;
        fl.hqjc[101] = 2057048539675213211L;
        fl.hqjc[102] = -8201062388275771768L;
        fl.hqjc[103] = 505929120971150365L;
        fl.hqjc[104] = 7376055496239804669L;
        fl.hqjc[105] = -2147728083801027246L;
        fl.hqjc[106] = 6781182362238021347L;
        fl.hqjc[107] = -7016106585518341278L;
        fl.hqjc[108] = 7451107611579548188L;
        fl.hqjc[109] = -1070753586347846444L;
        fl.hqjc[110] = -5133223341842376686L;
        fl.hqjc[111] = -9065070292914764988L;
        fl.hqjc[112] = -1080163286114759521L;
        fl.hqjc[113] = -4599486021475536068L;
        fl.hqjc[114] = 7636150142138544804L;
        fl.hqjc[115] = 1504116440372314618L;
        fl.hqjc[116] = 6075389871570607454L;
        fl.hqjc[117] = 1611150197067405849L;
        fl.hqjc[118] = 9022705715375668325L;
        fl.hqjc[119] = -536949660028454361L;
        fl.hqjc[120] = -4318639558855025780L;
        fl.hqjc[121] = -7031586411971812112L;
        fl.hqjc[122] = 394723144918805614L;
        fl.hqjc[123] = -98191954394699752L;
        fl.hqjc[124] = 586836040799174243L;
        fl.hqjc[125] = -3870197810935444861L;
        fl.hqjc[126] = 6781069266450941033L;
        fl.hqjc[127] = 1828118405867037721L;
        fl.hqjc[128] = 6830302244115058829L;
        fl.hqjc[129] = -8313741104308427058L;
        fl.hqjc[130] = -5658211230486964375L;
        fl.hqjc[131] = 7213776580006556028L;
        fl.hqjc[132] = 393390052084771598L;
        fl.hqjc[133] = 7252536518391232200L;
        fl.hqjc[134] = -5736389285223968814L;
        fl.hqjc[135] = -1591916036287316101L;
        fl.hqjc[136] = -655726666981129802L;
        fl.hqjc[137] = -2404975901557328508L;
        fl.hqjc[138] = -5210057189207584562L;
        fl.hqjc[139] = -2296399925011300326L;
        fl.hqjc[140] = 1401857530239447881L;
        fl.hqjc[141] = -521579945304499013L;
        fl.hqjc[142] = 7389031773263114953L;
        fl.hqjc[143] = 7955287845438226334L;
        fl.hqjc[144] = -1165970885397112950L;
        fl.hqjc[145] = 9125211877709566598L;
        fl.hqjc[146] = -8348877791714653510L;
        fl.hqjc[147] = -2149450257257108621L;
        fl.hqjc[148] = -8184552160018373277L;
        fl.hqjc[149] = -4153763405685826312L;
        fl.hqjc[150] = -7371469383798914647L;
        fl.hqjc[151] = -5483019395282751808L;
        fl.hqjc[152] = 8514682296944551321L;
        fl.hqjc[153] = 1779024241999037875L;
        fl.hqjc[154] = 6674581668832975459L;
        fl.hqjc[155] = 1766791002011008094L;
        fl.hqjc[156] = 8945984224077526631L;
        fl.hqjc[157] = 7249275403827385480L;
        fl.hqjc[158] = -6487507956455464533L;
        fl.hqjc[159] = -1780040459065122711L;
        fl.hqjc[160] = 8518106212028664920L;
        fl.hqjc[161] = -2970130594701454739L;
        fl.hqjc[162] = -3488726989071573212L;
        fl.hqjc[163] = 6424968396507586546L;
        fl.hqjc[164] = 784547203558879226L;
        fl.hqjc[165] = 6133394706119272343L;
        fl.hqjc[166] = 8545482900687607875L;
        fl.hqjc[167] = 7173255059317101206L;
        fl.hqjc[168] = 8590674265158721525L;
        fl.hqjc[169] = 8822327292030013079L;
        fl.hqjc[170] = 1476976466768927070L;
        fl.hqjc[171] = 3465742138186430800L;
        fl.hqjc[172] = -8371954412331368785L;
        fl.hqjc[173] = -6495877403165520593L;
        fl.hqjc[174] = -906722896887571801L;
        fl.hqjc[175] = -1104544281594032079L;
        fl.hqjc[176] = -3200359868283886534L;
        fl.hqjc[177] = 1850805925242194966L;
        fl.hqjc[178] = -815575023663209357L;
        fl.hqjc[179] = -4049356462551504483L;
        fl.hqjc[180] = 4264166724114351382L;
        fl.hqjc[181] = -3503415095279034213L;
        fl.hqjc[182] = 3580726130279261178L;
        fl.hqjc[183] = -516935496551219027L;
        fl.hqjc[184] = 5435237881783413773L;
        fl.hqjc[185] = -3028746394393835448L;
        fl.hqjc[186] = 8986508532330821787L;
        fl.hqjc[187] = -4170858298582537021L;
        fl.hqjc[188] = 9072720965609053001L;
        fl.hqjc[189] = -393346135755660597L;
        fl.hqjc[190] = -3438608381486279959L;
        fl.hqjc[191] = 5681748960902080136L;
        fl.hqjc[192] = 526612150484005754L;
        fl.hqjc[193] = -2891374641411377547L;
        fl.hqjc[194] = -1013939906791158657L;
        fl.hqjc[195] = 1418712040332240977L;
        fl.hqjc[196] = -7923557109741157577L;
        fl.hqjc[197] = -3891066375193089063L;
        fl.hqjc[198] = 8798180479835547952L;
        fl.hqjc[199] = -6042250136079272355L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean renameClientFolder(boolean var0) {
        block99: {
            block98: {
                block97: {
                    block96: {
                        v0 /* !! */  = fl.ou;
                        if (true) ** GOTO lbl5
                        block56: while (true) {
                            v0 /* !! */  = (long)(fl.hqit("hrbu", hqja(int ), (int)142) - fl.hqit("hrbt", hqja(int ), (int)141));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case -494117065: {
                                    break block56;
                                }
                                case 1629189556: {
                                    continue block56;
                                }
                            }
                            break;
                        }
                        var6_1 = fl.c;
                        v1 /* !! */  = fl.ou;
                        if (true) ** GOTO lbl15
                        block57: while (true) {
                            v1 /* !! */  = (long)(v2 - fl.hqit("hrbv", hqja(int ), (int)143));
lbl15:
                            // 2 sources

                            switch ((int)v1 /* !! */ ) {
                                case -1882936197: {
                                    v2 = fl.hqit("hrbw", hqja(int ), (int)144);
                                    continue block57;
                                }
                                case -494117065: {
                                    break block57;
                                }
                                case 390819564: {
                                    v2 = fl.hqit("hrbx", hqja(int ), (int)145);
                                    continue block57;
                                }
                            }
                            break;
                        }
                        var5_2 /* !! */  = fl.b;
                        v3 /* !! */  = fl.ou;
                        if (true) ** GOTO lbl29
                        block58: while (true) {
                            v3 /* !! */  = (long)(v4 - fl.hqit("hrby", hqja(int ), (int)146));
lbl29:
                            // 2 sources

                            switch ((int)v3 /* !! */ ) {
                                case -1078651379: {
                                    v4 = fl.hqit("hrbz", hqja(int ), (int)147);
                                    continue block58;
                                }
                                case -494117065: {
                                    break block58;
                                }
                                case 390514318: {
                                    v4 = fl.hqit("hrca", hqja(int ), (int)148);
                                    continue block58;
                                }
                            }
                            break;
                        }
                        var4_3 = fl.a;
                        if (var6_1) {
                            throw null;
lbl41:
                            // 14 sources

                            return (boolean)fl.hqit("hrcb", hqiq(int ), (int)349);
                        }
                        if (var4_3 || var4_3) ** GOTO lbl41
                        if (!var0) break block96;
                        if (var4_3) ** GOTO lbl41
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hrcc", hqja(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  == fl.hqit("hrcd", hqiq(int ), (int)350)) break;
                            v5 /* !! */  = (long)fl.hqit("hrce", hqiq(int ), (int)351);
                        }
                        v6 = fl.CLIENT_FOLDER;
                        if (var6_1) {
                            throw null;
                        }
                        break block97;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl41
                    v7 /* !! */  = fl.ou;
                    if (true) ** GOTO lbl61
                    block61: while (true) {
                        v7 /* !! */  = (long)(v8 - fl.hqit("hrcf", hqja(int ), (int)150));
lbl61:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1853571861: {
                                v8 = fl.hqit("hrcg", hqja(int ), (int)151);
                                continue block61;
                            }
                            case -494117065: {
                                break block61;
                            }
                            case 77050651: {
                                v8 = fl.hqit("hrch", hqja(int ), (int)152);
                                continue block61;
                            }
                            case 1748158454: {
                                v8 = fl.hqit("hrci", hqja(int ), (int)153);
                                continue block61;
                            }
                        }
                        break;
                    }
                    v6 = var1_4 = fl.HIDDEN_CLIENT_FOLDER;
                }
                if (var4_3 || var4_3) ** GOTO lbl41
                if (!var0) break block98;
                if (var4_3) ** GOTO lbl41
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hrcj", hqja(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fl.hqit("hrck", hqiq(int ), (int)352)) break;
                    v9 /* !! */  = (long)fl.hqit("hrcl", hqiq(int ), (int)353);
                }
                v10 = fl.HIDDEN_CLIENT_FOLDER;
                if (var6_1) {
                    throw null;
                }
                break block99;
            }
            if (var4_3 || var4_3) ** GOTO lbl41
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hrcm", hqja(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == fl.hqit("hrcn", hqiq(int ), (int)354)) {
                    v10 = fl.CLIENT_FOLDER;
                    break;
                }
                v11 /* !! */  = (long)fl.hqit("hrco", hqiq(int ), (int)355);
            }
        }
        var2_5 = v10;
        if (var4_3 || var4_3) ** GOTO lbl41
        v12 = new LinkOption[]{};
        v13 /* !! */  = fl.ou;
        if (true) ** GOTO lbl104
        block64: while (true) {
            v13 /* !! */  = (long)(fl.hqit("hrcq", hqja(int ), (int)157) - fl.hqit("hrcp", hqja(int ), (int)156));
lbl104:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -494117065: {
                    break block64;
                }
                case -205853507: {
                    continue block64;
                }
            }
            break;
        }
        if (Files.exists(var1_4, v12)) ** GOTO lbl116
        if (var4_3) ** GOTO lbl41
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl41
                return (boolean)fl.hqit("hrcr", hqiq(int ), (int)356);
            }
lbl116:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl41
            v14 = new LinkOption[]{};
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hrcs", hqja(int ), (int)158)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == fl.hqit("hrct", hqiq(int ), (int)357)) break;
                v15 /* !! */  = (long)fl.hqit("hrcu", hqiq(int ), (int)358);
            }
            if (!Files.exists(var2_5, v14)) ** GOTO lbl126
            if (var4_3 || var4_3) ** GOTO lbl41
            return (boolean)fl.hqit("hrcv", hqiq(int ), (int)359);
lbl126:
            // 1 sources

            try {
                if (var4_3 || var4_3) ** GOTO lbl41
                v16 = new CopyOption[]{};
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = fl.ou - fl.hqit("hrcw", hqja(int ), (int)159)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fl.hqit("hrcx", hqiq(int ), (int)360)) break;
                    v17 /* !! */  = (long)fl.hqit("hrcy", hqiq(int ), (int)361);
                }
                Files.move(var1_4, var2_5, v16);
                if (var4_3 || var4_3) ** GOTO lbl41
                return (boolean)fl.hqit("hrcz", hqiq(int ), (int)362);
            }
            catch (IOException | SecurityException var3_6) {
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return (boolean)fl.hqit("hrda", hqiq(int ), (int)363);
            }
lbl141:
            // 3 sources

            case 0: {
                var5_2 /* !! */  = (int)fl.hqit("hrdb", hqiq(int ), (int)364);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl146:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)fl.hqit("hrdc", hqiq(int ), (int)365);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl151:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)fl.hqit("hrdd", hqiq(int ), (int)366);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl156:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)fl.hqit("hrde", hqiq(int ), (int)367);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 4: {
                var5_2 /* !! */  = (int)fl.hqit("hrdf", hqiq(int ), (int)368);
                if (!var6_1) ** GOTO lbl146
                throw null;
            }
lbl165:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)fl.hqit("hrdg", hqiq(int ), (int)369);
                if (!var6_1) break;
                throw null;
            }
lbl169:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)fl.hqit("hrdh", hqiq(int ), (int)370);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 7: {
                var5_2 /* !! */  = (int)fl.hqit("hrdi", hqiq(int ), (int)371);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 8: {
                var5_2 /* !! */  = (int)fl.hqit("hrdj", hqiq(int ), (int)372);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 9: {
                var5_2 /* !! */  = (int)fl.hqit("hrdk", hqiq(int ), (int)373);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl189:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)fl.hqit("hrdl", hqiq(int ), (int)374);
                if (!var6_1) ** GOTO lbl151
                throw null;
            }
lbl193:
            // 3 sources

            case 11: {
                var5_2 /* !! */  = (int)fl.hqit("hrdm", hqiq(int ), (int)375);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 12: {
                var5_2 /* !! */  = (int)fl.hqit("hrdn", hqiq(int ), (int)376);
                if (!var6_1) ** GOTO lbl141
                throw null;
            }
lbl202:
            // 3 sources

            case 13: {
                var5_2 /* !! */  = (int)fl.hqit("hrdo", hqiq(int ), (int)377);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl207:
            // 4 sources

            case 14: {
                var5_2 /* !! */  = (int)fl.hqit("hrdp", hqiq(int ), (int)378);
                if (!var6_1) ** GOTO lbl156
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)fl.hqit("hrdq", hqiq(int ), (int)379);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl216:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)fl.hqit("hrdr", hqiq(int ), (int)380);
                if (!var6_1) ** GOTO lbl169
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)fl.hqit("hrds", hqiq(int ), (int)381);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl225:
            // 4 sources

            case 18: {
                var5_2 /* !! */  = (int)fl.hqit("hrdt", hqiq(int ), (int)382);
                if (!var6_1) ** GOTO lbl202
                throw null;
            }
lbl229:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)fl.hqit("hrdu", hqiq(int ), (int)383);
                if (!var6_1) ** GOTO lbl207
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)fl.hqit("hrdv", hqiq(int ), (int)384);
                if (!var6_1) ** GOTO lbl207
                throw null;
            }
            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)fl.hqit("hrdw", hqiq(int ), (int)385);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl247
                    break;
                }
            }
            case 22: {
                var5_2 /* !! */  = (int)fl.hqit("hrdx", hqiq(int ), (int)386);
                if (!var6_1) ** GOTO lbl216
                throw null;
            }
lbl247:
            // 4 sources

            case 23: {
                var5_2 /* !! */  = (int)fl.hqit("hrdy", hqiq(int ), (int)387);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl252:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)fl.hqit("hrdz", hqiq(int ), (int)388);
                if (!var6_1) ** GOTO lbl193
                throw null;
            }
lbl256:
            // 2 sources

            case 25: {
                var5_2 /* !! */  = (int)fl.hqit("hrea", hqiq(int ), (int)389);
                if (!var6_1) ** GOTO lbl141
                throw null;
            }
lbl260:
            // 2 sources

            case 26: {
                var5_2 /* !! */  = (int)fl.hqit("hreb", hqiq(int ), (int)390);
                if (!var6_1) ** GOTO lbl256
                throw null;
            }
            case 27: 
        }
        var5_2 /* !! */  = (int)fl.hqit("hrec", hqiq(int ), (int)391);
        ** while (!var6_1)
lbl267:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hrod() {
        fl.hqis[100] = -2098980531;
        fl.hqis[101] = 1817513305;
        fl.hqis[102] = -1004314898;
        fl.hqis[103] = -149485413;
        fl.hqis[104] = -1633412683;
        fl.hqis[105] = 1608140120;
        fl.hqis[106] = -117429989;
        fl.hqis[107] = 719600077;
        fl.hqis[108] = 283890114;
        fl.hqis[109] = -1492326416;
        fl.hqis[110] = -250437705;
        fl.hqis[111] = 961967159;
        fl.hqis[112] = 565176200;
        fl.hqis[113] = 1227203689;
        fl.hqis[114] = -870150973;
        fl.hqis[115] = 1529443837;
        fl.hqis[116] = -1224832384;
        fl.hqis[117] = -1850292071;
        fl.hqis[118] = 1164113691;
        fl.hqis[119] = -53195098;
        fl.hqis[120] = 749814256;
        fl.hqis[121] = 651248022;
        fl.hqis[122] = 1183508784;
        fl.hqis[123] = -467921636;
        fl.hqis[124] = -2008595891;
        fl.hqis[125] = 1185817915;
        fl.hqis[126] = 1749223122;
        fl.hqis[127] = 2082370405;
        fl.hqis[128] = 1703901013;
        fl.hqis[129] = 368443374;
        fl.hqis[130] = 123823288;
        fl.hqis[131] = 1547341930;
        fl.hqis[132] = -814736845;
        fl.hqis[133] = 658302699;
        fl.hqis[134] = 535747427;
        fl.hqis[135] = -2128311828;
        fl.hqis[136] = -442068506;
        fl.hqis[137] = 1063572810;
        fl.hqis[138] = -1773502410;
        fl.hqis[139] = 195286588;
        fl.hqis[140] = 1180427825;
        fl.hqis[141] = -512782866;
        fl.hqis[142] = 2122469743;
        fl.hqis[143] = -1120001920;
        fl.hqis[144] = 710140774;
        fl.hqis[145] = 223546805;
        fl.hqis[146] = 1233370618;
        fl.hqis[147] = -1302966979;
        fl.hqis[148] = 559271459;
        fl.hqis[149] = -802832708;
        fl.hqis[150] = 303277512;
        fl.hqis[151] = 1782087167;
        fl.hqis[152] = 275271948;
        fl.hqis[153] = -1792907776;
        fl.hqis[154] = -299114341;
        fl.hqis[155] = -1770065504;
        fl.hqis[156] = -672001606;
        fl.hqis[157] = 273336135;
        fl.hqis[158] = -1012277727;
        fl.hqis[159] = 2007901386;
        fl.hqis[160] = 2031755506;
        fl.hqis[161] = 1429611328;
        fl.hqis[162] = 79606596;
        fl.hqis[163] = -430704967;
        fl.hqis[164] = -809321959;
        fl.hqis[165] = 1707537385;
        fl.hqis[166] = 516040896;
        fl.hqis[167] = -361900475;
        fl.hqis[168] = -852752921;
        fl.hqis[169] = -95057104;
        fl.hqis[170] = 1980735221;
        fl.hqis[171] = 1284913951;
        fl.hqis[172] = -437005221;
        fl.hqis[173] = 496203741;
        fl.hqis[174] = -861086978;
        fl.hqis[175] = -1917194406;
        fl.hqis[176] = -1476230674;
        fl.hqis[177] = 1011209390;
        fl.hqis[178] = -2065166079;
        fl.hqis[179] = -1625690835;
        fl.hqis[180] = 692354059;
        fl.hqis[181] = -1439504957;
        fl.hqis[182] = -2045001784;
        fl.hqis[183] = 90625271;
        fl.hqis[184] = -367847235;
        fl.hqis[185] = 746694716;
        fl.hqis[186] = -1516490352;
        fl.hqis[187] = -2096152702;
        fl.hqis[188] = -2061060694;
        fl.hqis[189] = -1936705504;
        fl.hqis[190] = 1908127265;
        fl.hqis[191] = 933916811;
        fl.hqis[192] = -166243777;
        fl.hqis[193] = 1731211392;
        fl.hqis[194] = -2045777378;
        fl.hqis[195] = 1492987265;
        fl.hqis[196] = -1374676692;
        fl.hqis[197] = -1719244325;
        fl.hqis[198] = 670277534;
        fl.hqis[199] = 1303297165;
    }

    private static /* synthetic */ void hrnz() {
        fl.hqir[300] = 1645309899;
        fl.hqir[301] = 1170003815;
        fl.hqir[302] = 265639422;
        fl.hqir[303] = 2080428139;
        fl.hqir[304] = -1416745192;
        fl.hqir[305] = 882399060;
        fl.hqir[306] = 136555274;
        fl.hqir[307] = -1988509649;
        fl.hqir[308] = 587217012;
        fl.hqir[309] = -752202311;
        fl.hqir[310] = 1571219239;
        fl.hqir[311] = -1106993502;
        fl.hqir[312] = -1757186653;
        fl.hqir[313] = 1810103840;
        fl.hqir[314] = -1049421429;
        fl.hqir[315] = -348004383;
        fl.hqir[316] = 886203062;
        fl.hqir[317] = -1430214951;
        fl.hqir[318] = -1639819786;
        fl.hqir[319] = 95299657;
        fl.hqir[320] = -1075613455;
        fl.hqir[321] = 1186553624;
        fl.hqir[322] = 1410148672;
        fl.hqir[323] = -1122846269;
        fl.hqir[324] = -1243484623;
        fl.hqir[325] = -1365357203;
        fl.hqir[326] = 1097554784;
        fl.hqir[327] = 2031407548;
        fl.hqir[328] = -559834325;
        fl.hqir[329] = -46772115;
        fl.hqir[330] = 276590327;
        fl.hqir[331] = -1380397387;
        fl.hqir[332] = 855185459;
        fl.hqir[333] = 394312363;
        fl.hqir[334] = 165640798;
        fl.hqir[335] = 657571734;
        fl.hqir[336] = 1663768755;
        fl.hqir[337] = -750184785;
        fl.hqir[338] = -404374541;
        fl.hqir[339] = -36766147;
        fl.hqir[340] = -710935046;
        fl.hqir[341] = 740285190;
        fl.hqir[342] = -116176724;
        fl.hqir[343] = 794185995;
        fl.hqir[344] = 366377653;
        fl.hqir[345] = -2718292;
        fl.hqir[346] = 1353749390;
        fl.hqir[347] = 1121928475;
        fl.hqir[348] = 1944369472;
        fl.hqir[349] = 114338133;
        fl.hqir[350] = 1479183208;
        fl.hqir[351] = 1204814405;
        fl.hqir[352] = -154381788;
        fl.hqir[353] = -916590528;
        fl.hqir[354] = -1173434814;
        fl.hqir[355] = 1217460054;
        fl.hqir[356] = -906610840;
        fl.hqir[357] = -520253321;
        fl.hqir[358] = 633208153;
        fl.hqir[359] = 185961218;
        fl.hqir[360] = -199020304;
        fl.hqir[361] = 1127506750;
        fl.hqir[362] = -27229389;
        fl.hqir[363] = 43332518;
        fl.hqir[364] = -1428992301;
        fl.hqir[365] = 1117862990;
        fl.hqir[366] = 1035379752;
        fl.hqir[367] = 1898857564;
        fl.hqir[368] = 259996086;
        fl.hqir[369] = 801502395;
        fl.hqir[370] = 2000847722;
        fl.hqir[371] = -1082552871;
        fl.hqir[372] = 1958336402;
        fl.hqir[373] = -1375538811;
        fl.hqir[374] = -2069825231;
        fl.hqir[375] = -117765615;
        fl.hqir[376] = -1938286927;
        fl.hqir[377] = -708716092;
        fl.hqir[378] = -1989248503;
        fl.hqir[379] = 1045354624;
        fl.hqir[380] = -2049593313;
        fl.hqir[381] = 1520597512;
        fl.hqir[382] = -938339648;
        fl.hqir[383] = 290911053;
        fl.hqir[384] = 2108897961;
        fl.hqir[385] = -389016994;
        fl.hqir[386] = 1725380744;
        fl.hqir[387] = 63199006;
        fl.hqir[388] = -873896819;
        fl.hqir[389] = 1146028279;
        fl.hqir[390] = 2041077611;
        fl.hqir[391] = 1075347730;
        fl.hqir[392] = -1130859694;
        fl.hqir[393] = -2107441925;
        fl.hqir[394] = -1207871340;
        fl.hqir[395] = 1302858834;
        fl.hqir[396] = 175898130;
        fl.hqir[397] = 1676346268;
        fl.hqir[398] = -191235890;
        fl.hqir[399] = -1277358770;
    }

    private static /* synthetic */ long hqja(int n2) {
        return hqjb[n2] ^ hqjc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPostTick(cy var1_1) {
        block64: {
            v0 /* !! */  = fl.ou;
            if (true) ** GOTO lbl5
            block38: while (true) {
                v0 /* !! */  = (long)(v1 - fl.hqit("hqti", hqja(int ), (int)69));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1809387192: {
                        v1 = fl.hqit("hqtj", hqja(int ), (int)70);
                        continue block38;
                    }
                    case -1785117907: {
                        v1 = fl.hqit("hqtk", hqja(int ), (int)71);
                        continue block38;
                    }
                    case -764265695: {
                        v1 = fl.hqit("hqtl", hqja(int ), (int)72);
                        continue block38;
                    }
                    case -494117065: {
                        break block38;
                    }
                }
                break;
            }
            var4_2 = fl.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqtm", hqja(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == fl.hqit("hqtn", hqiq(int ), (int)202)) break;
                v2 /* !! */  = (long)fl.hqit("hqto", hqiq(int ), (int)203);
            }
            var3_3 /* !! */  = fl.b;
            v3 /* !! */  = fl.ou;
            if (true) ** GOTO lbl29
            block40: while (true) {
                v3 /* !! */  = (long)(v4 - fl.hqit("hqtp", hqja(int ), (int)74));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1814678088: {
                        v4 = fl.hqit("hqtq", hqja(int ), (int)75);
                        continue block40;
                    }
                    case -494117065: {
                        break block40;
                    }
                    case 709441159: {
                        v4 = fl.hqit("hqtr", hqja(int ), (int)76);
                        continue block40;
                    }
                }
                break;
            }
            var2_4 = fl.a;
            if (var4_2) {
                throw null;
lbl41:
                // 7 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqts", hqja(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == fl.hqit("hqtt", hqiq(int ), (int)204)) break;
                v5 /* !! */  = (long)fl.hqit("hqtu", hqiq(int ), (int)205);
            }
            if (!fl.unhooked) break block64;
            if (var2_4) ** GOTO lbl41
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hqtv", hqja(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == fl.hqit("hqtw", hqiq(int ), (int)206)) break;
                v6 /* !! */  = (long)fl.hqit("hqtx", hqiq(int ), (int)207);
            }
            if (this.windowRestoreTicks > 0) ** GOTO lbl66
            if (var2_4) ** GOTO lbl41
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl66:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl41
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hqty", hqja(int ), (int)79)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == fl.hqit("hqtz", hqiq(int ), (int)208)) break;
                v7 /* !! */  = (long)fl.hqit("hqua", hqiq(int ), (int)209);
            }
            v8 = this.windowRestoreTicks - fl.hqit("hqub", hqiq(int ), (int)210);
            v9 /* !! */  = fl.ou;
            if (true) ** GOTO lbl78
            block45: while (true) {
                v9 /* !! */  = (long)(fl.hqit("hqud", hqja(int ), (int)81) - fl.hqit("hquc", hqja(int ), (int)80));
lbl78:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -494117065: {
                        break block45;
                    }
                    case 1934488598: {
                        continue block45;
                    }
                }
                break;
            }
            this.windowRestoreTicks = v8;
            if (var2_4 || var2_4) ** GOTO lbl41
            v10 /* !! */  = fl.ou;
            if (true) ** GOTO lbl89
            block46: while (true) {
                v10 /* !! */  = (long)(v11 - fl.hqit("hque", hqja(int ), (int)82));
lbl89:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1225154747: {
                        v11 = fl.hqit("hquf", hqja(int ), (int)83);
                        continue block46;
                    }
                    case -801405566: {
                        v11 = fl.hqit("hqug", hqja(int ), (int)84);
                        continue block46;
                    }
                    case -494117065: {
                        break block46;
                    }
                    case 1342611873: {
                        v11 = fl.hqit("hquh", hqja(int ), (int)85);
                        continue block46;
                    }
                }
                break;
            }
            this.restoreVanillaWindow();
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl105:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fl.hqit("hqui", hqiq(int ), (int)211);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 1: {
                var3_3 /* !! */  = (int)fl.hqit("hquj", hqiq(int ), (int)212);
                if (!var4_2) ** GOTO lbl105
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fl.hqit("hquk", hqiq(int ), (int)213);
                if (var4_2) {
                    throw null;
                }
            }
lbl118:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)fl.hqit("hqul", hqiq(int ), (int)214);
                if (var4_2) {
                    throw null;
                }
            }
lbl122:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)fl.hqit("hqum", hqiq(int ), (int)215);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 5: {
                var3_3 /* !! */  = (int)fl.hqit("hqun", hqiq(int ), (int)216);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl132:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)fl.hqit("hquo", hqiq(int ), (int)217);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)fl.hqit("hqup", hqiq(int ), (int)218);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)fl.hqit("hquq", hqiq(int ), (int)219);
                if (!var4_2) break;
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)fl.hqit("hqur", hqiq(int ), (int)220);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 10: {
                var3_3 /* !! */  = (int)fl.hqit("hqus", hqiq(int ), (int)221);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
lbl153:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)fl.hqit("hqut", hqiq(int ), (int)222);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
lbl157:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fl.hqit("hquu", hqiq(int ), (int)223);
                    if (!var4_2) ** GOTO lbl105
                    throw null;
                }
            }
lbl162:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)fl.hqit("hquv", hqiq(int ), (int)224);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
            case 14: 
        }
        var3_3 /* !! */  = (int)fl.hqit("hquw", hqiq(int ), (int)225);
        ** while (!var4_2)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hrny() {
        fl.hqir[200] = 531467557;
        fl.hqir[201] = -1195525437;
        fl.hqir[202] = -1851109902;
        fl.hqir[203] = 1340809513;
        fl.hqir[204] = 985421297;
        fl.hqir[205] = -1048697419;
        fl.hqir[206] = -1825303443;
        fl.hqir[207] = 1507224696;
        fl.hqir[208] = 464333540;
        fl.hqir[209] = -428461259;
        fl.hqir[210] = -1467379567;
        fl.hqir[211] = 2138765578;
        fl.hqir[212] = -29241827;
        fl.hqir[213] = -2086709983;
        fl.hqir[214] = 0x9FFF00;
        fl.hqir[215] = 416413012;
        fl.hqir[216] = 115229780;
        fl.hqir[217] = 894648938;
        fl.hqir[218] = -1991660782;
        fl.hqir[219] = 368693636;
        fl.hqir[220] = -1380391042;
        fl.hqir[221] = -489975987;
        fl.hqir[222] = 743382129;
        fl.hqir[223] = 1451092103;
        fl.hqir[224] = -1703406945;
        fl.hqir[225] = 452612230;
        fl.hqir[226] = -292058503;
        fl.hqir[227] = 140474267;
        fl.hqir[228] = 388028389;
        fl.hqir[229] = 894605874;
        fl.hqir[230] = 1889930203;
        fl.hqir[231] = -213030552;
        fl.hqir[232] = 642214324;
        fl.hqir[233] = 1537303419;
        fl.hqir[234] = -1727650240;
        fl.hqir[235] = 587231497;
        fl.hqir[236] = -29341828;
        fl.hqir[237] = -720115493;
        fl.hqir[238] = 344895520;
        fl.hqir[239] = 985010496;
        fl.hqir[240] = -1076044205;
        fl.hqir[241] = 1992631767;
        fl.hqir[242] = -1238687663;
        fl.hqir[243] = -506088277;
        fl.hqir[244] = -986698605;
        fl.hqir[245] = 110235256;
        fl.hqir[246] = 1337583343;
        fl.hqir[247] = -954010017;
        fl.hqir[248] = -174889524;
        fl.hqir[249] = 2073893510;
        fl.hqir[250] = -1835229111;
        fl.hqir[251] = -1765363059;
        fl.hqir[252] = -1430246799;
        fl.hqir[253] = -1353977520;
        fl.hqir[254] = -1118009979;
        fl.hqir[255] = 1159175884;
        fl.hqir[256] = 1909151406;
        fl.hqir[257] = 677478363;
        fl.hqir[258] = -302052659;
        fl.hqir[259] = -1966992166;
        fl.hqir[260] = 1166109944;
        fl.hqir[261] = -2059488529;
        fl.hqir[262] = -510770779;
        fl.hqir[263] = -300638760;
        fl.hqir[264] = -1867291174;
        fl.hqir[265] = -1287477526;
        fl.hqir[266] = -784067259;
        fl.hqir[267] = -2133688313;
        fl.hqir[268] = 751508753;
        fl.hqir[269] = -2061274674;
        fl.hqir[270] = -853232551;
        fl.hqir[271] = 537136917;
        fl.hqir[272] = 582864176;
        fl.hqir[273] = 470215570;
        fl.hqir[274] = 868596271;
        fl.hqir[275] = -59456437;
        fl.hqir[276] = -1696183078;
        fl.hqir[277] = 28645625;
        fl.hqir[278] = -1396379546;
        fl.hqir[279] = -1626643076;
        fl.hqir[280] = 985138837;
        fl.hqir[281] = 733224030;
        fl.hqir[282] = 1615509146;
        fl.hqir[283] = -332875608;
        fl.hqir[284] = 2027346109;
        fl.hqir[285] = -239611717;
        fl.hqir[286] = 1730242849;
        fl.hqir[287] = 285052828;
        fl.hqir[288] = -265333098;
        fl.hqir[289] = 1003320096;
        fl.hqir[290] = -1918084863;
        fl.hqir[291] = -40818584;
        fl.hqir[292] = -462546074;
        fl.hqir[293] = 1615724238;
        fl.hqir[294] = 1167992980;
        fl.hqir[295] = -1841484662;
        fl.hqir[296] = 1693197892;
        fl.hqir[297] = -853008836;
        fl.hqir[298] = -537419582;
        fl.hqir[299] = -134951046;
    }

    public static /* synthetic */ CallSite hqit(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hssz() {
        fl.hqjc[200] = 6341771753041530601L;
        fl.hqjc[201] = 1678961440326810278L;
        fl.hqjc[202] = -5483279852339422081L;
        fl.hqjc[203] = -9133225744539632010L;
        fl.hqjc[204] = -6005319075374452280L;
        fl.hqjc[205] = 4525096716224520616L;
        fl.hqjc[206] = -7839934009297408643L;
        fl.hqjc[207] = 1406925224415154462L;
        fl.hqjc[208] = 6300305761355632848L;
        fl.hqjc[209] = -6500502128233466651L;
        fl.hqjc[210] = -7651878984223738779L;
        fl.hqjc[211] = 3466267088404373352L;
        fl.hqjc[212] = 3025228364292606390L;
        fl.hqjc[213] = -8508735170859025150L;
        fl.hqjc[214] = -2359513759947301587L;
        fl.hqjc[215] = 194210594133116785L;
        fl.hqjc[216] = 4409237192000446674L;
        fl.hqjc[217] = 4653050646518106621L;
        fl.hqjc[218] = -825479140288092759L;
        fl.hqjc[219] = -8317753745002716643L;
        fl.hqjc[220] = -4450534670724551911L;
        fl.hqjc[221] = -7400931476278307677L;
        fl.hqjc[222] = 2219886200125772708L;
        fl.hqjc[223] = -8771237036408155104L;
        fl.hqjc[224] = -4080706450551497250L;
        fl.hqjc[225] = -3115029048176562465L;
        fl.hqjc[226] = 2268867869997355107L;
        fl.hqjc[227] = -2041775702177428063L;
        fl.hqjc[228] = -8940195078058161253L;
        fl.hqjc[229] = -2334220093719103590L;
        fl.hqjc[230] = 3318751927336497495L;
        fl.hqjc[231] = 4562501008822513948L;
        fl.hqjc[232] = -3227511456712252778L;
        fl.hqjc[233] = 5247052726968043899L;
        fl.hqjc[234] = -4097812628020266308L;
        fl.hqjc[235] = -817391315105775609L;
        fl.hqjc[236] = -486129770543838042L;
        fl.hqjc[237] = 4495664897951057248L;
        fl.hqjc[238] = 740128342655174578L;
        fl.hqjc[239] = 1989756630378411966L;
    }

    private static /* synthetic */ int hqiq(int n2) {
        return hqir[n2] ^ hqis[n2];
    }

    private static /* synthetic */ void hroj() {
        fl.hqjb[100] = -5518424578467164662L;
        fl.hqjb[101] = -2588208463551962359L;
        fl.hqjb[102] = -1546853676837838618L;
        fl.hqjb[103] = -5371318563677532510L;
        fl.hqjb[104] = 6490342802219232089L;
        fl.hqjb[105] = 6922813311414307921L;
        fl.hqjb[106] = 7052099150313269675L;
        fl.hqjb[107] = 1721427325592588263L;
        fl.hqjb[108] = 5489703798438196601L;
        fl.hqjb[109] = 603628329721396921L;
        fl.hqjb[110] = 2146527895947501106L;
        fl.hqjb[111] = 3750802964240171014L;
        fl.hqjb[112] = -658203340358389734L;
        fl.hqjb[113] = 4184750903462646102L;
        fl.hqjb[114] = 8097233468592203724L;
        fl.hqjb[115] = 1597295829460511634L;
        fl.hqjb[116] = -6232360672803756155L;
        fl.hqjb[117] = -8813074930008237761L;
        fl.hqjb[118] = -2686441805965570155L;
        fl.hqjb[119] = 4746966890225902882L;
        fl.hqjb[120] = 4301663734297356442L;
        fl.hqjb[121] = -6643101833002425290L;
        fl.hqjb[122] = 8623925512114936439L;
        fl.hqjb[123] = -9061873531570947385L;
        fl.hqjb[124] = 275592223159209764L;
        fl.hqjb[125] = 9021934694222708453L;
        fl.hqjb[126] = -4175958585803357056L;
        fl.hqjb[127] = -4302232407113634047L;
        fl.hqjb[128] = -1657857758060339701L;
        fl.hqjb[129] = 7137699185640659499L;
        fl.hqjb[130] = -7366831107131677711L;
        fl.hqjb[131] = -1752398900631924034L;
        fl.hqjb[132] = 8626960216718321104L;
        fl.hqjb[133] = 8273093504622415094L;
        fl.hqjb[134] = -5944361754409226297L;
        fl.hqjb[135] = 1311758169154289235L;
        fl.hqjb[136] = 4114782738360340694L;
        fl.hqjb[137] = -1974487680955657057L;
        fl.hqjb[138] = -703306557697167077L;
        fl.hqjb[139] = 6405930577616330116L;
        fl.hqjb[140] = -5670845703481645575L;
        fl.hqjb[141] = -5759549333976737314L;
        fl.hqjb[142] = 7852767422920185939L;
        fl.hqjb[143] = 586883587846659359L;
        fl.hqjb[144] = -8025235874294994777L;
        fl.hqjb[145] = 1593781029438605823L;
        fl.hqjb[146] = 3850364883797083110L;
        fl.hqjb[147] = -3206663827518364665L;
        fl.hqjb[148] = -3741039890851273004L;
        fl.hqjb[149] = -5396185516708928702L;
        fl.hqjb[150] = 3614933011203194967L;
        fl.hqjb[151] = 2196316026427482756L;
        fl.hqjb[152] = -8885033179489580875L;
        fl.hqjb[153] = -7598593542748843189L;
        fl.hqjb[154] = -759242430004643964L;
        fl.hqjb[155] = -524323446335372001L;
        fl.hqjb[156] = -7119490124452597907L;
        fl.hqjb[157] = -8707129010065466401L;
        fl.hqjb[158] = 6050973509297374129L;
        fl.hqjb[159] = 1489958814207989775L;
        fl.hqjb[160] = 2283730125179143753L;
        fl.hqjb[161] = -7641297356447765625L;
        fl.hqjb[162] = 805238145087236854L;
        fl.hqjb[163] = 8992296138288750682L;
        fl.hqjb[164] = -2994513307822256033L;
        fl.hqjb[165] = 2455437156884088173L;
        fl.hqjb[166] = -4458717551443192401L;
        fl.hqjb[167] = 8416324178095945049L;
        fl.hqjb[168] = -5632419277463541345L;
        fl.hqjb[169] = 2146158799528090942L;
        fl.hqjb[170] = -9099943339231621312L;
        fl.hqjb[171] = -4051749734108764554L;
        fl.hqjb[172] = 6780960393560646256L;
        fl.hqjb[173] = -7228079636385125056L;
        fl.hqjb[174] = 1805354562431831678L;
        fl.hqjb[175] = -3451791102201676784L;
        fl.hqjb[176] = 1210824501662254214L;
        fl.hqjb[177] = 1895203583347484778L;
        fl.hqjb[178] = 867341713612861287L;
        fl.hqjb[179] = 1326980539517033739L;
        fl.hqjb[180] = -2527720677826978798L;
        fl.hqjb[181] = 6804682404511341353L;
        fl.hqjb[182] = -8114572863936522221L;
        fl.hqjb[183] = -5896565136810870773L;
        fl.hqjb[184] = 3442379779221637691L;
        fl.hqjb[185] = 1419756051417896343L;
        fl.hqjb[186] = -2312172961057084460L;
        fl.hqjb[187] = 6303361531499481688L;
        fl.hqjb[188] = -7042290933895205347L;
        fl.hqjb[189] = -18031032009451120L;
        fl.hqjb[190] = 3816843584116669427L;
        fl.hqjb[191] = 7366805228485915221L;
        fl.hqjb[192] = 2932881670860577441L;
        fl.hqjb[193] = -3584856780010193453L;
        fl.hqjb[194] = 8476778683866137449L;
        fl.hqjb[195] = -6029578379952468841L;
        fl.hqjb[196] = 6942320352664734199L;
        fl.hqjb[197] = 7605223236464696034L;
        fl.hqjb[198] = 5078428909674458941L;
        fl.hqjb[199] = -2981419848696827435L;
    }

    private static /* synthetic */ void hroh() {
        fl.hqis[500] = -1901422755;
        fl.hqis[501] = -1593113965;
        fl.hqis[502] = 295147743;
        fl.hqis[503] = -1473722470;
        fl.hqis[504] = 544028183;
        fl.hqis[505] = -1330183929;
        fl.hqis[506] = 246036416;
        fl.hqis[507] = -858827119;
        fl.hqis[508] = -329781991;
        fl.hqis[509] = 1421223810;
        fl.hqis[510] = 910582200;
        fl.hqis[511] = 1157260573;
        fl.hqis[512] = 340151138;
        fl.hqis[513] = -2042228858;
        fl.hqis[514] = 491233095;
        fl.hqis[515] = -1562471977;
        fl.hqis[516] = 430244272;
        fl.hqis[517] = -614514689;
        fl.hqis[518] = -163749462;
        fl.hqis[519] = 838720869;
        fl.hqis[520] = 750092664;
        fl.hqis[521] = 1378087262;
        fl.hqis[522] = 372854221;
        fl.hqis[523] = -1891936516;
        fl.hqis[524] = -1141553772;
        fl.hqis[525] = 299797798;
        fl.hqis[526] = 215727967;
        fl.hqis[527] = 870624072;
        fl.hqis[528] = 222311031;
        fl.hqis[529] = -1990801723;
        fl.hqis[530] = -1202351599;
        fl.hqis[531] = 1967092439;
        fl.hqis[532] = -405510828;
        fl.hqis[533] = -234207145;
        fl.hqis[534] = 1853737999;
        fl.hqis[535] = 923260126;
        fl.hqis[536] = 1368629120;
        fl.hqis[537] = -444716678;
        fl.hqis[538] = -254699923;
        fl.hqis[539] = 1946301065;
        fl.hqis[540] = 257038622;
        fl.hqis[541] = -471368014;
        fl.hqis[542] = -1461921549;
        fl.hqis[543] = -140865246;
        fl.hqis[544] = 572201140;
        fl.hqis[545] = 1593760618;
        fl.hqis[546] = -1631048247;
        fl.hqis[547] = -1556539978;
        fl.hqis[548] = 1718546426;
        fl.hqis[549] = 603680824;
        fl.hqis[550] = 354802798;
        fl.hqis[551] = -554690825;
        fl.hqis[552] = 681800181;
        fl.hqis[553] = 1697335653;
        fl.hqis[554] = -2137059346;
        fl.hqis[555] = -1126241948;
        fl.hqis[556] = 1653421637;
        fl.hqis[557] = -151883349;
        fl.hqis[558] = -1098793900;
        fl.hqis[559] = -827143770;
        fl.hqis[560] = 1109999034;
        fl.hqis[561] = 542309696;
        fl.hqis[562] = -1203574948;
        fl.hqis[563] = -278820547;
        fl.hqis[564] = 610520108;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Path redirectPackFolder(Path var0) {
        block110: {
            block109: {
                block108: {
                    var11_1 = fl.c;
                    var10_2 /* !! */  = fl.b;
                    var9_3 = fl.a;
                    if (var11_1) {
                        throw null;
lbl6:
                        // 31 sources

                        return null;
                    }
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!fl.unhooked) break block108;
                    if (var9_3) ** GOTO lbl6
                    if (var0 == null) break block108;
                    if (var9_3) ** GOTO lbl6
                    if (var0.getFileName() != null) break block109;
                    if (var9_3) ** GOTO lbl6
                }
                if (var9_3 || var9_3) ** GOTO lbl6
                return var0;
            }
            if (var9_3 || var9_3) ** GOTO lbl6
            var1_4 = var0.getFileName().toString();
            if (var9_3 || var9_3) ** GOTO lbl6
            if (var1_4.equalsIgnoreCase("resourcepacks")) break block110;
            if (var9_3) ** GOTO lbl6
            if (var1_4.equalsIgnoreCase("shaderpacks")) break block110;
            if (var9_3 || var9_3) ** GOTO lbl6
            return var0;
        }
        if (var9_3 || var9_3) ** GOTO lbl6
        if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_5 = System.getenv("APPDATA");
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var2_5 == null) ** GOTO lbl38
                if (var9_3) ** GOTO lbl6
                if (!var2_5.isBlank()) ** GOTO lbl40
                if (var9_3) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                return var0;
lbl40:
                // 1 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                var3_6 = Path.of(var2_5, new String[]{".minecraft"}).toAbsolutePath().normalize();
                if (var9_3 || var9_3) ** GOTO lbl6
                var4_7 = Path.of(var2_5, new String[]{".tlegacy", "game"}).toAbsolutePath().normalize();
                if (var9_3 || var9_3) ** GOTO lbl6
                var5_8 = class_310.method_1551().field_1697.toPath().toAbsolutePath().normalize();
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var5_8.startsWith(var4_7)) ** GOTO lbl53
                if (var9_3) ** GOTO lbl6
                if (Files.isDirectory(var3_6, new LinkOption[0])) ** GOTO lbl59
                if (var9_3) ** GOTO lbl6
                if (!Files.isDirectory(var4_7, new LinkOption[0])) ** GOTO lbl59
                if (var9_3) ** GOTO lbl6
lbl53:
                // 2 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                var6_9 = var4_7;
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl62
lbl59:
                // 2 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                var6_9 = var3_6;
                if (var9_3) ** GOTO lbl6
lbl62:
                // 2 sources

                if (var9_3 || var9_3) ** GOTO lbl6
                var7_10 = var6_9.resolve(var1_4.toLowerCase(Locale.ROOT));
                if (var9_3) ** GOTO lbl6
                try {
                    if (var9_3) ** GOTO lbl6
                    Files.createDirectories(var7_10, new FileAttribute[0]);
                    if (var9_3 || var9_3) ** GOTO lbl6
                    ** if (!var11_1) goto lbl-1000
                }
                catch (IOException var8_11) {
                    if (var9_3 || var9_3) ** GOTO lbl6
                    return var0;
                }
lbl-1000:
                // 1 sources

                {
                    throw null;
                }
lbl-1000:
                // 1 sources

                {
                }
                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return var7_10;
            }
lbl79:
            // 2 sources

            case 0: {
                var10_2 /* !! */  = (int)fl.hqit("hqkk", hqiq(int ), (int)25);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl84:
            // 3 sources

            case 1: {
                var10_2 /* !! */  = (int)fl.hqit("hqkl", hqiq(int ), (int)26);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl89:
            // 2 sources

            case 2: {
                var10_2 /* !! */  = (int)fl.hqit("hqkm", hqiq(int ), (int)27);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl94:
            // 2 sources

            case 3: {
                var10_2 /* !! */  = (int)fl.hqit("hqkn", hqiq(int ), (int)28);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl99:
            // 2 sources

            case 4: {
                var10_2 /* !! */  = (int)fl.hqit("hqko", hqiq(int ), (int)29);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl104:
            // 5 sources

            case 5: {
                var10_2 /* !! */  = (int)fl.hqit("hqkp", hqiq(int ), (int)30);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl109:
            // 2 sources

            case 6: {
                var10_2 /* !! */  = (int)fl.hqit("hqkq", hqiq(int ), (int)31);
                if (!var11_1) ** GOTO lbl94
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var10_2 /* !! */  = (int)fl.hqit("hqkr", hqiq(int ), (int)32);
                if (!var11_1) ** GOTO lbl109
                throw null;
            }
lbl117:
            // 2 sources

            case 8: {
                var10_2 /* !! */  = (int)fl.hqit("hqks", hqiq(int ), (int)33);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 9: {
                var10_2 /* !! */  = (int)fl.hqit("hqkt", hqiq(int ), (int)34);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl127:
            // 2 sources

            case 10: {
                var10_2 /* !! */  = (int)fl.hqit("hqku", hqiq(int ), (int)35);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl132:
            // 2 sources

            case 11: {
                var10_2 /* !! */  = (int)fl.hqit("hqkv", hqiq(int ), (int)36);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl137:
            // 3 sources

            case 12: {
                var10_2 /* !! */  = (int)fl.hqit("hqkw", hqiq(int ), (int)37);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl142:
            // 3 sources

            case 13: {
                var10_2 /* !! */  = (int)fl.hqit("hqkx", hqiq(int ), (int)38);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 14: {
                var10_2 /* !! */  = (int)fl.hqit("hqky", hqiq(int ), (int)39);
                if (!var11_1) ** GOTO lbl104
                throw null;
            }
lbl151:
            // 3 sources

            case 15: {
                var10_2 /* !! */  = (int)fl.hqit("hqkz", hqiq(int ), (int)40);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl156:
            // 2 sources

            case 16: {
                var10_2 /* !! */  = (int)fl.hqit("hqla", hqiq(int ), (int)41);
                if (!var11_1) ** GOTO lbl132
                throw null;
            }
lbl160:
            // 2 sources

            case 17: {
                var10_2 /* !! */  = (int)fl.hqit("hqlb", hqiq(int ), (int)42);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl165:
            // 3 sources

            case 18: {
                var10_2 /* !! */  = (int)fl.hqit("hqlc", hqiq(int ), (int)43);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl170:
            // 3 sources

            case 19: {
                var10_2 /* !! */  = (int)fl.hqit("hqld", hqiq(int ), (int)44);
                if (!var11_1) ** GOTO lbl137
                throw null;
            }
lbl174:
            // 2 sources

            case 20: {
                var10_2 /* !! */  = (int)fl.hqit("hqle", hqiq(int ), (int)45);
                if (!var11_1) ** GOTO lbl104
                throw null;
            }
lbl178:
            // 3 sources

            case 21: {
                var10_2 /* !! */  = (int)fl.hqit("hqlf", hqiq(int ), (int)46);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 22: {
                var10_2 /* !! */  = (int)fl.hqit("hqlg", hqiq(int ), (int)47);
                if (!var11_1) ** GOTO lbl165
                throw null;
            }
            case 23: {
                var10_2 /* !! */  = (int)fl.hqit("hqlh", hqiq(int ), (int)48);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 24: {
                var10_2 /* !! */  = (int)fl.hqit("hqli", hqiq(int ), (int)49);
                if (!var11_1) ** GOTO lbl104
                throw null;
            }
lbl196:
            // 4 sources

            case 25: {
                var10_2 /* !! */  = (int)fl.hqit("hqlj", hqiq(int ), (int)50);
                if (var11_1) {
                    throw null;
                }
            }
lbl200:
            // 4 sources

            case 26: {
                var10_2 /* !! */  = (int)fl.hqit("hqlk", hqiq(int ), (int)51);
                if (!var11_1) ** GOTO lbl84
                throw null;
            }
lbl204:
            // 2 sources

            case 27: {
                var10_2 /* !! */  = (int)fl.hqit("hqll", hqiq(int ), (int)52);
                if (!var11_1) ** GOTO lbl170
                throw null;
            }
lbl208:
            // 2 sources

            case 28: {
                var10_2 /* !! */  = (int)fl.hqit("hqlm", hqiq(int ), (int)53);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 29: {
                var10_2 /* !! */  = (int)fl.hqit("hqln", hqiq(int ), (int)54);
                if (!var11_1) ** GOTO lbl165
                throw null;
            }
lbl217:
            // 2 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_2 /* !! */  = (int)fl.hqit("hqlo", hqiq(int ), (int)55);
                    if (!var11_1) ** GOTO lbl84
                    throw null;
                }
            }
            case 31: {
                var10_2 /* !! */  = (int)fl.hqit("hqlp", hqiq(int ), (int)56);
                if (!var11_1) ** GOTO lbl178
                throw null;
            }
            case 32: {
                var10_2 /* !! */  = (int)fl.hqit("hqlq", hqiq(int ), (int)57);
                if (!var11_1) ** GOTO lbl79
                throw null;
            }
lbl230:
            // 3 sources

            case 33: {
                var10_2 /* !! */  = (int)fl.hqit("hqlr", hqiq(int ), (int)58);
                if (!var11_1) ** GOTO lbl178
                throw null;
            }
            case 34: {
                var10_2 /* !! */  = (int)fl.hqit("hqls", hqiq(int ), (int)59);
                if (!var11_1) ** GOTO lbl117
                throw null;
            }
lbl238:
            // 3 sources

            case 35: {
                var10_2 /* !! */  = (int)fl.hqit("hqlt", hqiq(int ), (int)60);
                if (!var11_1) ** GOTO lbl196
                throw null;
            }
lbl242:
            // 2 sources

            case 36: {
                var10_2 /* !! */  = (int)fl.hqit("hqlu", hqiq(int ), (int)61);
                if (!var11_1) ** GOTO lbl127
                throw null;
            }
lbl246:
            // 2 sources

            case 37: {
                var10_2 /* !! */  = (int)fl.hqit("hqlv", hqiq(int ), (int)62);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 38: {
                var10_2 /* !! */  = (int)fl.hqit("hqlw", hqiq(int ), (int)63);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 39: {
                var10_2 /* !! */  = (int)fl.hqit("hqlx", hqiq(int ), (int)64);
                if (!var11_1) ** GOTO lbl196
                throw null;
            }
lbl260:
            // 2 sources

            case 40: {
                var10_2 /* !! */  = (int)fl.hqit("hqly", hqiq(int ), (int)65);
                if (!var11_1) break;
                throw null;
            }
            case 41: {
                var10_2 /* !! */  = (int)fl.hqit("hqlz", hqiq(int ), (int)66);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 42: {
                var10_2 /* !! */  = (int)fl.hqit("hqma", hqiq(int ), (int)67);
                if (!var11_1) ** GOTO lbl104
                throw null;
            }
            case 43: {
                var10_2 /* !! */  = (int)fl.hqit("hqmb", hqiq(int ), (int)68);
                if (!var11_1) ** GOTO lbl238
                throw null;
            }
lbl277:
            // 2 sources

            case 44: {
                var10_2 /* !! */  = (int)fl.hqit("hqmc", hqiq(int ), (int)69);
                if (!var11_1) ** GOTO lbl156
                throw null;
            }
            case 45: {
                var10_2 /* !! */  = (int)fl.hqit("hqmd", hqiq(int ), (int)70);
                if (!var11_1) ** GOTO lbl170
                throw null;
            }
lbl285:
            // 3 sources

            case 46: {
                var10_2 /* !! */  = (int)fl.hqit("hqme", hqiq(int ), (int)71);
                if (var11_1) {
                    throw null;
                }
            }
            case 47: {
                var10_2 /* !! */  = (int)fl.hqit("hqmf", hqiq(int ), (int)72);
                if (!var11_1) ** GOTO lbl230
                throw null;
            }
            case 48: {
                var10_2 /* !! */  = (int)fl.hqit("hqmg", hqiq(int ), (int)73);
                if (!var11_1) ** GOTO lbl217
                throw null;
            }
lbl297:
            // 2 sources

            case 49: {
                var10_2 /* !! */  = (int)fl.hqit("hqmh", hqiq(int ), (int)74);
                if (!var11_1) ** GOTO lbl151
                throw null;
            }
            case 50: {
                var10_2 /* !! */  = (int)fl.hqit("hqmi", hqiq(int ), (int)75);
                if (!var11_1) ** GOTO lbl89
                throw null;
            }
lbl305:
            // 2 sources

            case 51: {
                var10_2 /* !! */  = (int)fl.hqit("hqmj", hqiq(int ), (int)76);
                if (!var11_1) ** GOTO lbl137
                throw null;
            }
lbl309:
            // 3 sources

            case 52: {
                var10_2 /* !! */  = (int)fl.hqit("hqmk", hqiq(int ), (int)77);
                if (!var11_1) ** GOTO lbl99
                throw null;
            }
            case 53: {
                var10_2 /* !! */  = (int)fl.hqit("hqml", hqiq(int ), (int)78);
                if (!var11_1) ** GOTO lbl160
                throw null;
            }
            case 54: 
        }
        var10_2 /* !! */  = (int)fl.hqit("hqmm", hqiq(int ), (int)79);
        ** while (!var11_1)
lbl320:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hrof() {
        fl.hqis[300] = 1645309897;
        fl.hqis[301] = 1170003824;
        fl.hqis[302] = 0xFD555FD;
        fl.hqis[303] = 2080428138;
        fl.hqis[304] = -1416745206;
        fl.hqis[305] = 882399067;
        fl.hqis[306] = 136555308;
        fl.hqis[307] = -1988509650;
        fl.hqis[308] = 1394047122;
        fl.hqis[309] = -752202312;
        fl.hqis[310] = -2041312715;
        fl.hqis[311] = -1106993501;
        fl.hqis[312] = 2140888181;
        fl.hqis[313] = 1810103841;
        fl.hqis[314] = -1049421427;
        fl.hqis[315] = -348004380;
        fl.hqis[316] = 886203063;
        fl.hqis[317] = -1430214947;
        fl.hqis[318] = -1639819789;
        fl.hqis[319] = 95299659;
        fl.hqis[320] = -1075613452;
        fl.hqis[321] = 1186553625;
        fl.hqis[322] = 457717628;
        fl.hqis[323] = -1122846270;
        fl.hqis[324] = -448780442;
        fl.hqis[325] = -1365357203;
        fl.hqis[326] = 1097554785;
        fl.hqis[327] = 2031407549;
        fl.hqis[328] = 1680554704;
        fl.hqis[329] = -46772116;
        fl.hqis[330] = 632279795;
        fl.hqis[331] = -1380397388;
        fl.hqis[332] = -557631117;
        fl.hqis[333] = 394312362;
        fl.hqis[334] = 165640784;
        fl.hqis[335] = 657571740;
        fl.hqis[336] = 1663768756;
        fl.hqis[337] = -750184788;
        fl.hqis[338] = -404374534;
        fl.hqis[339] = -36766148;
        fl.hqis[340] = -710935042;
        fl.hqis[341] = 740285192;
        fl.hqis[342] = -116176723;
        fl.hqis[343] = 794185987;
        fl.hqis[344] = 366377657;
        fl.hqis[345] = -2718304;
        fl.hqis[346] = 1353749390;
        fl.hqis[347] = 1121928471;
        fl.hqis[348] = 1944369480;
        fl.hqis[349] = 114338132;
        fl.hqis[350] = -1479183209;
        fl.hqis[351] = -1872320872;
        fl.hqis[352] = -154381787;
        fl.hqis[353] = -901474932;
        fl.hqis[354] = -1173434813;
        fl.hqis[355] = -1280904254;
        fl.hqis[356] = -906610839;
        fl.hqis[357] = -520253322;
        fl.hqis[358] = 1256979714;
        fl.hqis[359] = 185961219;
        fl.hqis[360] = -199020303;
        fl.hqis[361] = -124579510;
        fl.hqis[362] = -27229390;
        fl.hqis[363] = 43332518;
        fl.hqis[364] = -1428992296;
        fl.hqis[365] = 1117862988;
        fl.hqis[366] = 1035379769;
        fl.hqis[367] = 1898857541;
        fl.hqis[368] = 259996076;
        fl.hqis[369] = 801502391;
        fl.hqis[370] = 2000847718;
        fl.hqis[371] = -1082552884;
        fl.hqis[372] = 1958336389;
        fl.hqis[373] = -1375538793;
        fl.hqis[374] = -2069825232;
        fl.hqis[375] = -117765606;
        fl.hqis[376] = -1938286923;
        fl.hqis[377] = -708716075;
        fl.hqis[378] = -1989248503;
        fl.hqis[379] = 1045354630;
        fl.hqis[380] = -2049593317;
        fl.hqis[381] = 1520597504;
        fl.hqis[382] = -938339629;
        fl.hqis[383] = 290911047;
        fl.hqis[384] = 2108897976;
        fl.hqis[385] = -389017009;
        fl.hqis[386] = 1725380755;
        fl.hqis[387] = 63198997;
        fl.hqis[388] = -873896830;
        fl.hqis[389] = 1146028262;
        fl.hqis[390] = 2041077603;
        fl.hqis[391] = 1075347728;
        fl.hqis[392] = 1130859693;
        fl.hqis[393] = -811178271;
        fl.hqis[394] = -1207871339;
        fl.hqis[395] = -18330338;
        fl.hqis[396] = 175898130;
        fl.hqis[397] = 1676346269;
        fl.hqis[398] = -448287394;
        fl.hqis[399] = -1277358769;
    }

    private static /* synthetic */ void hroc() {
        fl.hqis[0] = -1673756962;
        fl.hqis[1] = -898566018;
        fl.hqis[2] = 932525798;
        fl.hqis[3] = -2008266381;
        fl.hqis[4] = 680741749;
        fl.hqis[5] = -838365906;
        fl.hqis[6] = -1088155891;
        fl.hqis[7] = -2005718376;
        fl.hqis[8] = -1892733733;
        fl.hqis[9] = -190453401;
        fl.hqis[10] = -1098707699;
        fl.hqis[11] = -20447465;
        fl.hqis[12] = -1396168402;
        fl.hqis[13] = -1942627489;
        fl.hqis[14] = -482498491;
        fl.hqis[15] = 601197238;
        fl.hqis[16] = 302867811;
        fl.hqis[17] = 1527249732;
        fl.hqis[18] = -950906864;
        fl.hqis[19] = 601538072;
        fl.hqis[20] = -1616995359;
        fl.hqis[21] = -736542717;
        fl.hqis[22] = -835345073;
        fl.hqis[23] = -909772709;
        fl.hqis[24] = 557853326;
        fl.hqis[25] = -2106045654;
        fl.hqis[26] = 994193134;
        fl.hqis[27] = 1834424001;
        fl.hqis[28] = -1619009438;
        fl.hqis[29] = 136751112;
        fl.hqis[30] = 564707512;
        fl.hqis[31] = 998834428;
        fl.hqis[32] = -1225534541;
        fl.hqis[33] = -529023162;
        fl.hqis[34] = -542675514;
        fl.hqis[35] = 201434904;
        fl.hqis[36] = 183261308;
        fl.hqis[37] = -1651435855;
        fl.hqis[38] = 1505746133;
        fl.hqis[39] = -2083487448;
        fl.hqis[40] = 443396392;
        fl.hqis[41] = -955706491;
        fl.hqis[42] = 1971918650;
        fl.hqis[43] = 1101194530;
        fl.hqis[44] = -36472656;
        fl.hqis[45] = -1942414099;
        fl.hqis[46] = 458937106;
        fl.hqis[47] = -129149177;
        fl.hqis[48] = 712514023;
        fl.hqis[49] = 1630593738;
        fl.hqis[50] = -802771779;
        fl.hqis[51] = -1462290617;
        fl.hqis[52] = 613148692;
        fl.hqis[53] = -137311053;
        fl.hqis[54] = 1428620172;
        fl.hqis[55] = 1210610530;
        fl.hqis[56] = 636267713;
        fl.hqis[57] = -1972513476;
        fl.hqis[58] = -1051562568;
        fl.hqis[59] = -867230510;
        fl.hqis[60] = 478658258;
        fl.hqis[61] = -356428421;
        fl.hqis[62] = 1677588373;
        fl.hqis[63] = -867366361;
        fl.hqis[64] = 954070744;
        fl.hqis[65] = -754219833;
        fl.hqis[66] = 268935688;
        fl.hqis[67] = -641997196;
        fl.hqis[68] = 1726092455;
        fl.hqis[69] = 678932675;
        fl.hqis[70] = -2038049738;
        fl.hqis[71] = 2006471401;
        fl.hqis[72] = 501180965;
        fl.hqis[73] = 289239450;
        fl.hqis[74] = -561007490;
        fl.hqis[75] = -479527231;
        fl.hqis[76] = -1331699868;
        fl.hqis[77] = 1458200203;
        fl.hqis[78] = 2021498024;
        fl.hqis[79] = -938419874;
        fl.hqis[80] = 893394270;
        fl.hqis[81] = -1043217743;
        fl.hqis[82] = 1041964256;
        fl.hqis[83] = -863245791;
        fl.hqis[84] = 1592433391;
        fl.hqis[85] = 815570084;
        fl.hqis[86] = 1154166724;
        fl.hqis[87] = -544117662;
        fl.hqis[88] = 407705744;
        fl.hqis[89] = -1567796938;
        fl.hqis[90] = -384716637;
        fl.hqis[91] = -1106219840;
        fl.hqis[92] = -1449133167;
        fl.hqis[93] = 1680026208;
        fl.hqis[94] = -1216421433;
        fl.hqis[95] = -271601010;
        fl.hqis[96] = 2113730604;
        fl.hqis[97] = 216791526;
        fl.hqis[98] = 1404632830;
        fl.hqis[99] = 639179356;
    }

    private static /* synthetic */ void hrol() {
        fl.hqjc[0] = 1875374492341243852L;
        fl.hqjc[1] = 841864670399219981L;
        fl.hqjc[2] = -5496544367619193544L;
        fl.hqjc[3] = -6265238735660609121L;
        fl.hqjc[4] = 1648583470873982723L;
        fl.hqjc[5] = 6332730662019684033L;
        fl.hqjc[6] = 4061520505056016039L;
        fl.hqjc[7] = -5348499481746019514L;
        fl.hqjc[8] = -5049782553900578254L;
        fl.hqjc[9] = -5961484480410812583L;
        fl.hqjc[10] = 1556215106024894243L;
        fl.hqjc[11] = 1233583878493601534L;
        fl.hqjc[12] = -1852287268915953100L;
        fl.hqjc[13] = -845738770713338704L;
        fl.hqjc[14] = -4979393550359460185L;
        fl.hqjc[15] = 1566726490247803353L;
        fl.hqjc[16] = -1054048083135472161L;
        fl.hqjc[17] = 6231015280640634407L;
        fl.hqjc[18] = -3645830726310417098L;
        fl.hqjc[19] = -3656478767267494421L;
        fl.hqjc[20] = 2248580326354187795L;
        fl.hqjc[21] = 4385738248581709904L;
        fl.hqjc[22] = 6294465680517617341L;
        fl.hqjc[23] = 1496537221191292789L;
        fl.hqjc[24] = 3443616360109531726L;
        fl.hqjc[25] = 7684727902349110939L;
        fl.hqjc[26] = -3247204238676727492L;
        fl.hqjc[27] = 5976709775672616670L;
        fl.hqjc[28] = -5650671459707984286L;
        fl.hqjc[29] = 1244666785083954137L;
        fl.hqjc[30] = -6701651802921475056L;
        fl.hqjc[31] = 7402186069373063148L;
        fl.hqjc[32] = 9108854939183663426L;
        fl.hqjc[33] = 3357874909647523182L;
        fl.hqjc[34] = 9105733310276457532L;
        fl.hqjc[35] = 8833829833369193473L;
        fl.hqjc[36] = 1390136855514397078L;
        fl.hqjc[37] = -7795363415134681611L;
        fl.hqjc[38] = -3529015309861917524L;
        fl.hqjc[39] = -3538818241930918492L;
        fl.hqjc[40] = 6213137713909302953L;
        fl.hqjc[41] = -7574736434771420887L;
        fl.hqjc[42] = -208817180112087639L;
        fl.hqjc[43] = 8731421360036628539L;
        fl.hqjc[44] = 5107941636914048038L;
        fl.hqjc[45] = -4705994938091205917L;
        fl.hqjc[46] = -5767547694955254124L;
        fl.hqjc[47] = 8017645842241635879L;
        fl.hqjc[48] = -3513111861035244043L;
        fl.hqjc[49] = 1887783734580110765L;
        fl.hqjc[50] = -4894016903980187673L;
        fl.hqjc[51] = 4962055024090100327L;
        fl.hqjc[52] = 6932759372668177095L;
        fl.hqjc[53] = 5104862215579806421L;
        fl.hqjc[54] = 3773334176442506003L;
        fl.hqjc[55] = 4917766478324831107L;
        fl.hqjc[56] = -6863836191971778400L;
        fl.hqjc[57] = 3007673074872515558L;
        fl.hqjc[58] = -7658222687356648875L;
        fl.hqjc[59] = -3232902968332017065L;
        fl.hqjc[60] = 2572037451760121427L;
        fl.hqjc[61] = 7497986088259982154L;
        fl.hqjc[62] = -2022319073298298036L;
        fl.hqjc[63] = 4564339705041590165L;
        fl.hqjc[64] = -8539906731796681872L;
        fl.hqjc[65] = 14224851827827105L;
        fl.hqjc[66] = 937514021585889893L;
        fl.hqjc[67] = -229418989083027508L;
        fl.hqjc[68] = 1403402859852165135L;
        fl.hqjc[69] = -6492435866560999470L;
        fl.hqjc[70] = -3006913086334263614L;
        fl.hqjc[71] = -4818113933770923787L;
        fl.hqjc[72] = -4804882263295137929L;
        fl.hqjc[73] = 6617167500408766687L;
        fl.hqjc[74] = 4969623497131843521L;
        fl.hqjc[75] = -2101120902290773334L;
        fl.hqjc[76] = 744887243965600088L;
        fl.hqjc[77] = -2998958769016975181L;
        fl.hqjc[78] = -8876435764101948269L;
        fl.hqjc[79] = 3982270673231556171L;
        fl.hqjc[80] = -8851233475334567762L;
        fl.hqjc[81] = -4065328119387839942L;
        fl.hqjc[82] = -8308559510696821482L;
        fl.hqjc[83] = -8025208818591553822L;
        fl.hqjc[84] = 4540671955009582520L;
        fl.hqjc[85] = -1669249297083145084L;
        fl.hqjc[86] = -1105031759630529858L;
        fl.hqjc[87] = -4742209605827875318L;
        fl.hqjc[88] = 3211679540034339604L;
        fl.hqjc[89] = -1280397508815044209L;
        fl.hqjc[90] = -2577350434925394033L;
        fl.hqjc[91] = 5518367072822743190L;
        fl.hqjc[92] = 8328642488685047978L;
        fl.hqjc[93] = 3624083120573839436L;
        fl.hqjc[94] = -8450652680014204945L;
        fl.hqjc[95] = 4904860819818672640L;
        fl.hqjc[96] = -4368024776265271858L;
        fl.hqjc[97] = 173697572204706142L;
        fl.hqjc[98] = 3835228509083479231L;
        fl.hqjc[99] = -6976060090980651313L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw(value=0)
    public void onChat(bp var1_1) {
        v0 /* !! */  = fl.ou;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(fl.hqit("hquy", hqja(int ), (int)87) - fl.hqit("hqux", hqja(int ), (int)86));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -494117065: {
                    break block53;
                }
                case 353407281: {
                    continue block53;
                }
            }
            break;
        }
        var5_2 = fl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hquz", hqja(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fl.hqit("hqva", hqiq(int ), (int)226)) break;
            v1 /* !! */  = (long)fl.hqit("hqvb", hqiq(int ), (int)227);
        }
        var4_3 /* !! */  = fl.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = fl.ou;
                if (true) ** GOTO lbl24
                block55: while (true) {
                    v2 /* !! */  = (long)(fl.hqit("hqvd", hqja(int ), (int)90) - fl.hqit("hqvc", hqja(int ), (int)89));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -494117065: {
                            break block55;
                        }
                        case 206302112: {
                            continue block55;
                        }
                    }
                    break;
                }
                var3_4 = fl.a;
                if (var5_2) {
                    throw null;
lbl32:
                    // 10 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl32
                v3 /* !! */  = fl.ou;
                if (true) ** GOTO lbl39
                block57: while (true) {
                    v3 /* !! */  = (long)(v4 - fl.hqit("hqve", hqja(int ), (int)91));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -494117065: {
                            break block57;
                        }
                        case 1304811416: {
                            v4 = fl.hqit("hqvf", hqja(int ), (int)92);
                            continue block57;
                        }
                        case 1759758991: {
                            v4 = fl.hqit("hqvg", hqja(int ), (int)93);
                            continue block57;
                        }
                    }
                    break;
                }
                if (!fl.unhooked) ** GOTO lbl57
                if (var3_4) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqvh", hqja(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fl.hqit("hqvi", hqiq(int ), (int)228)) break;
                    v5 /* !! */  = (long)fl.hqit("hqvj", hqiq(int ), (int)229);
                }
                if (var1_1.getMessage() != null) ** GOTO lbl59
                if (var3_4) ** GOTO lbl32
lbl57:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl32
                return;
lbl59:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hqvk", hqja(int ), (int)95)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fl.hqit("hqvl", hqiq(int ), (int)230)) break;
                    v6 /* !! */  = (long)fl.hqit("hqvm", hqiq(int ), (int)231);
                }
                v7 = var1_1.getMessage();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hqvn", hqja(int ), (int)96)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fl.hqit("hqvo", hqiq(int ), (int)232)) break;
                    v8 /* !! */  = (long)fl.hqit("hqvp", hqiq(int ), (int)233);
                }
                var2_5 = v7.trim();
                if (var3_4 || var3_4) ** GOTO lbl32
                v9 /* !! */  = fl.ou;
                if (true) ** GOTO lbl77
                block61: while (true) {
                    v9 /* !! */  = (long)(v10 - fl.hqit("hqvq", hqja(int ), (int)97));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1904561056: {
                            v10 = fl.hqit("hqvr", hqja(int ), (int)98);
                            continue block61;
                        }
                        case -928712311: {
                            v10 = fl.hqit("hqvs", hqja(int ), (int)99);
                            continue block61;
                        }
                        case -494117065: {
                            break block61;
                        }
                        case 258102934: {
                            v10 = fl.hqit("hqvt", hqja(int ), (int)100);
                            continue block61;
                        }
                    }
                    break;
                }
                v11 /* !! */  = fl.ou;
                if (true) ** GOTO lbl93
                block62: while (true) {
                    v11 /* !! */  = (long)(v12 - fl.hqit("hqvu", hqja(int ), (int)101));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1910249594: {
                            v12 = fl.hqit("hqvv", hqja(int ), (int)102);
                            continue block62;
                        }
                        case -1752668185: {
                            v12 = fl.hqit("hqvw", hqja(int ), (int)103);
                            continue block62;
                        }
                        case -1206534601: {
                            v12 = fl.hqit("hqvx", hqja(int ), (int)104);
                            continue block62;
                        }
                        case -494117065: {
                            break block62;
                        }
                    }
                    break;
                }
                v13 = this.returnText.getValue();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = fl.ou - fl.hqit("hqvy", hqja(int ), (int)105)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fl.hqit("hqvz", hqiq(int ), (int)234)) break;
                    v14 /* !! */  = (long)fl.hqit("hqwa", hqiq(int ), (int)235);
                }
                v15 = v13.trim();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = fl.ou - fl.hqit("hqwb", hqja(int ), (int)106)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == fl.hqit("hqwc", hqiq(int ), (int)236)) break;
                    v16 /* !! */  = (long)fl.hqit("hqwd", hqiq(int ), (int)237);
                }
                if (!var2_5.equalsIgnoreCase(v15)) ** GOTO lbl142
                if (var3_4 || var3_4) ** GOTO lbl32
                v17 /* !! */  = fl.ou;
                if (true) ** GOTO lbl123
                block65: while (true) {
                    v17 /* !! */  = (long)(v18 - fl.hqit("hqwe", hqja(int ), (int)107));
lbl123:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -494117065: {
                            break block65;
                        }
                        case -184195963: {
                            v18 = fl.hqit("hqwf", hqja(int ), (int)108);
                            continue block65;
                        }
                        case 1435040600: {
                            v18 = fl.hqit("hqwg", hqja(int ), (int)109);
                            continue block65;
                        }
                    }
                    break;
                }
                var1_1.cancel();
                if (var3_4 || var3_4) ** GOTO lbl32
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = fl.ou - fl.hqit("hqwh", hqja(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fl.hqit("hqwi", hqiq(int ), (int)238)) break;
                    v19 /* !! */  = (long)fl.hqit("hqwj", hqiq(int ), (int)239);
                }
                this.restoreClient();
                if (var3_4 || var3_4) ** GOTO lbl32
                return;
lbl142:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl145:
            // 4 sources

            case 0: {
                var4_3 /* !! */  = (int)fl.hqit("hqwk", hqiq(int ), (int)240);
                if (var5_2) {
                    throw null;
                }
            }
lbl149:
            // 5 sources

            case 1: {
                var4_3 /* !! */  = (int)fl.hqit("hqwl", hqiq(int ), (int)241);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl154:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)fl.hqit("hqwm", hqiq(int ), (int)242);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl159:
            // 3 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)fl.hqit("hqwn", hqiq(int ), (int)243);
                } while (!var5_2);
                throw null;
            }
lbl164:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)fl.hqit("hqwo", hqiq(int ), (int)244);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)fl.hqit("hqwp", hqiq(int ), (int)245);
                if (!var5_2) ** GOTO lbl159
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)fl.hqit("hqwq", hqiq(int ), (int)246);
                if (!var5_2) ** GOTO lbl159
                throw null;
            }
lbl176:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)fl.hqit("hqwr", hqiq(int ), (int)247);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 8: {
                var4_3 /* !! */  = (int)fl.hqit("hqws", hqiq(int ), (int)248);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl185:
            // 3 sources

            case 9: {
                var4_3 /* !! */  = (int)fl.hqit("hqwt", hqiq(int ), (int)249);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl190:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)fl.hqit("hqwu", hqiq(int ), (int)250);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)fl.hqit("hqwv", hqiq(int ), (int)251);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl199:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)fl.hqit("hqww", hqiq(int ), (int)252);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
            case 13: {
                do {
                    var4_3 /* !! */  = (int)fl.hqit("hqwx", hqiq(int ), (int)253);
                } while (!var5_2);
                throw null;
            }
lbl208:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)fl.hqit("hqwy", hqiq(int ), (int)254);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl212:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)fl.hqit("hqwz", hqiq(int ), (int)255);
                if (!var5_2) ** GOTO lbl176
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)fl.hqit("hqxa", hqiq(int ), (int)256);
                if (!var5_2) ** GOTO lbl190
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)fl.hqit("hqxb", hqiq(int ), (int)257);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
lbl224:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)fl.hqit("hqxc", hqiq(int ), (int)258);
                if (!var5_2) ** GOTO lbl212
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fl.hqit("hqxd", hqiq(int ), (int)259);
                    if (!var5_2) ** GOTO lbl154
                    throw null;
                }
            }
            case 20: 
        }
        var4_3 /* !! */  = (int)fl.hqit("hqxe", hqiq(int ), (int)260);
        ** while (!var5_2)
lbl236:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fl getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqjd", hqja(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fl.hqit("hqje", hqiq(int ), (int)6)) break;
            v0 /* !! */  = (long)fl.hqit("hqjf", hqiq(int ), (int)7);
        }
        var2 = fl.c;
        v1 /* !! */  = fl.ou;
        if (true) ** GOTO lbl12
        block10: while (true) {
            v1 /* !! */  = (long)(v2 - fl.hqit("hqjg", hqja(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1385490333: {
                    v2 = fl.hqit("hqjh", hqja(int ), (int)2);
                    continue block10;
                }
                case -774593407: {
                    v2 = fl.hqit("hqji", hqja(int ), (int)3);
                    continue block10;
                }
                case -494117065: {
                    break block10;
                }
            }
            break;
        }
        var1_1 = fl.b;
        v3 /* !! */  = fl.ou;
        if (true) ** GOTO lbl26
        block11: while (true) {
            v3 /* !! */  = (long)(fl.hqit("hqjk", hqja(int ), (int)5) - fl.hqit("hqjj", hqja(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -494117065: {
                    break block11;
                }
                case 274209976: {
                    continue block11;
                }
            }
            break;
        }
        var0_2 = fl.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqjl", hqja(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fl.hqit("hqjm", hqiq(int ), (int)8)) break;
            v4 /* !! */  = (long)fl.hqit("hqjn", hqiq(int ), (int)9);
        }
        return nj.get(fl.class);
    }

    private static /* synthetic */ void hroi() {
        fl.hqjb[0] = -6639334121915723098L;
        fl.hqjb[1] = 8941282369103108041L;
        fl.hqjb[2] = -5824532619239068163L;
        fl.hqjb[3] = 2715245580312367172L;
        fl.hqjb[4] = -5871354258241494933L;
        fl.hqjb[5] = -1139830317435149773L;
        fl.hqjb[6] = -200966056202175240L;
        fl.hqjb[7] = -5423383667842115355L;
        fl.hqjb[8] = -6047989601536614561L;
        fl.hqjb[9] = -1334788403457879005L;
        fl.hqjb[10] = -6492247747658322322L;
        fl.hqjb[11] = -5099829913836547108L;
        fl.hqjb[12] = -7032873643149198236L;
        fl.hqjb[13] = -4818891373527962037L;
        fl.hqjb[14] = -46970407257961841L;
        fl.hqjb[15] = 6009434506464946030L;
        fl.hqjb[16] = 1770633714350039829L;
        fl.hqjb[17] = -3154855816153894751L;
        fl.hqjb[18] = 818167798466030378L;
        fl.hqjb[19] = 7039809908391120706L;
        fl.hqjb[20] = 7244320375135690978L;
        fl.hqjb[21] = -5801662943727563256L;
        fl.hqjb[22] = 6043662305737163903L;
        fl.hqjb[23] = -7067230980741849835L;
        fl.hqjb[24] = -1037240751811882623L;
        fl.hqjb[25] = -871301121572102637L;
        fl.hqjb[26] = -7694047404348662656L;
        fl.hqjb[27] = 4777052511888591667L;
        fl.hqjb[28] = -6181981925481363389L;
        fl.hqjb[29] = -7686779153230052461L;
        fl.hqjb[30] = -8393941806755678787L;
        fl.hqjb[31] = 5174600391394213209L;
        fl.hqjb[32] = 5698798031496910458L;
        fl.hqjb[33] = 7166049506720635844L;
        fl.hqjb[34] = 7114420862226931458L;
        fl.hqjb[35] = 584046647979795888L;
        fl.hqjb[36] = 4133422365260738707L;
        fl.hqjb[37] = -5752645871298969902L;
        fl.hqjb[38] = -9002224664935522704L;
        fl.hqjb[39] = -5786039811064954770L;
        fl.hqjb[40] = -3459126962709893715L;
        fl.hqjb[41] = -1705905329103047224L;
        fl.hqjb[42] = 724409023389106085L;
        fl.hqjb[43] = -1352488636724215210L;
        fl.hqjb[44] = 3332550947249428410L;
        fl.hqjb[45] = 6501179208922519162L;
        fl.hqjb[46] = 2397661731635463092L;
        fl.hqjb[47] = -2613787941575161341L;
        fl.hqjb[48] = 6125781154785506764L;
        fl.hqjb[49] = -7022587693830987162L;
        fl.hqjb[50] = -8381795902041325642L;
        fl.hqjb[51] = -8711427844701121514L;
        fl.hqjb[52] = 1017164103334061132L;
        fl.hqjb[53] = -822672062164376716L;
        fl.hqjb[54] = 1232170594150436798L;
        fl.hqjb[55] = -38918523848300753L;
        fl.hqjb[56] = 2425930368743833185L;
        fl.hqjb[57] = 5240022827022400288L;
        fl.hqjb[58] = -8767813717421266726L;
        fl.hqjb[59] = -7427128770450073460L;
        fl.hqjb[60] = 1026728753593683523L;
        fl.hqjb[61] = -7478201065851681961L;
        fl.hqjb[62] = 5014355968917976360L;
        fl.hqjb[63] = -4183173827712303369L;
        fl.hqjb[64] = -2439716091639059695L;
        fl.hqjb[65] = -7735662681085347988L;
        fl.hqjb[66] = -5653057467514795129L;
        fl.hqjb[67] = -8650490037472722967L;
        fl.hqjb[68] = -3690979856032845083L;
        fl.hqjb[69] = -4407313666510241649L;
        fl.hqjb[70] = -8776484812090427406L;
        fl.hqjb[71] = 3722325562593082726L;
        fl.hqjb[72] = -4364315964030429841L;
        fl.hqjb[73] = 1245458470068301571L;
        fl.hqjb[74] = 2792910685772130409L;
        fl.hqjb[75] = -5138130080031947016L;
        fl.hqjb[76] = 5976722890424368628L;
        fl.hqjb[77] = 1164129995784148872L;
        fl.hqjb[78] = -8907536456534158150L;
        fl.hqjb[79] = -3289428456905273133L;
        fl.hqjb[80] = 5982392762177929604L;
        fl.hqjb[81] = -4249419844190766115L;
        fl.hqjb[82] = 952160719672796318L;
        fl.hqjb[83] = 2677604116767015222L;
        fl.hqjb[84] = -6272903148064101629L;
        fl.hqjb[85] = -8939610621202783556L;
        fl.hqjb[86] = 5215421776825322871L;
        fl.hqjb[87] = -7115706639527248771L;
        fl.hqjb[88] = 3317761122962135492L;
        fl.hqjb[89] = 2552810003619317066L;
        fl.hqjb[90] = -945803929439358364L;
        fl.hqjb[91] = -8974745264051012530L;
        fl.hqjb[92] = -325933073122134978L;
        fl.hqjb[93] = 6748272560099907342L;
        fl.hqjb[94] = -8560296359988432786L;
        fl.hqjb[95] = 6731521346787228368L;
        fl.hqjb[96] = -6907926315621651482L;
        fl.hqjb[97] = -4052474535526987070L;
        fl.hqjb[98] = 1767693386109674201L;
        fl.hqjb[99] = 8419883395746301711L;
    }

    /*
     * Exception decompiling
     */
    private static /* synthetic */ void lambda$startFolderRenameWorker$0() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[CATCHBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void hroa() {
        fl.hqir[400] = 955360756;
        fl.hqir[401] = 70310636;
        fl.hqir[402] = 1700773656;
        fl.hqir[403] = 1569724834;
        fl.hqir[404] = 570397449;
        fl.hqir[405] = 1511518442;
        fl.hqir[406] = -501427807;
        fl.hqir[407] = 166579475;
        fl.hqir[408] = 70841422;
        fl.hqir[409] = -383153766;
        fl.hqir[410] = -48113934;
        fl.hqir[411] = -355445245;
        fl.hqir[412] = 360474354;
        fl.hqir[413] = 915534333;
        fl.hqir[414] = -617950690;
        fl.hqir[415] = -655420109;
        fl.hqir[416] = 680696183;
        fl.hqir[417] = -1800164924;
        fl.hqir[418] = -2071153440;
        fl.hqir[419] = -447801364;
        fl.hqir[420] = -1064861284;
        fl.hqir[421] = 2003105345;
        fl.hqir[422] = 1509487876;
        fl.hqir[423] = 666890977;
        fl.hqir[424] = 876163404;
        fl.hqir[425] = -1013289442;
        fl.hqir[426] = -60055787;
        fl.hqir[427] = 1345289398;
        fl.hqir[428] = 1047241400;
        fl.hqir[429] = -1401929792;
        fl.hqir[430] = 25421730;
        fl.hqir[431] = -43728127;
        fl.hqir[432] = -928782347;
        fl.hqir[433] = 1622535054;
        fl.hqir[434] = 1538796882;
        fl.hqir[435] = -1108837264;
        fl.hqir[436] = 492949930;
        fl.hqir[437] = 1829888437;
        fl.hqir[438] = -1882614111;
        fl.hqir[439] = -1880813169;
        fl.hqir[440] = 1394153092;
        fl.hqir[441] = -335478270;
        fl.hqir[442] = 879798514;
        fl.hqir[443] = 1005426001;
        fl.hqir[444] = -1838431630;
        fl.hqir[445] = -1931407903;
        fl.hqir[446] = -25720375;
        fl.hqir[447] = 1689843331;
        fl.hqir[448] = -418308986;
        fl.hqir[449] = -1514686193;
        fl.hqir[450] = -706640736;
        fl.hqir[451] = 1817057194;
        fl.hqir[452] = -1196463461;
        fl.hqir[453] = -1898402995;
        fl.hqir[454] = 27118876;
        fl.hqir[455] = 2013518068;
        fl.hqir[456] = -2111681834;
        fl.hqir[457] = 75276331;
        fl.hqir[458] = 869552970;
        fl.hqir[459] = 386183303;
        fl.hqir[460] = 807433243;
        fl.hqir[461] = 375055540;
        fl.hqir[462] = -411356647;
        fl.hqir[463] = 1353167898;
        fl.hqir[464] = 626087741;
        fl.hqir[465] = 705094587;
        fl.hqir[466] = 1560315831;
        fl.hqir[467] = 634833685;
        fl.hqir[468] = -2114765424;
        fl.hqir[469] = -1990555354;
        fl.hqir[470] = -367251741;
        fl.hqir[471] = -1677561633;
        fl.hqir[472] = -845907901;
        fl.hqir[473] = 998144866;
        fl.hqir[474] = -1172305413;
        fl.hqir[475] = -1522161675;
        fl.hqir[476] = -294161089;
        fl.hqir[477] = 1353543921;
        fl.hqir[478] = 240440940;
        fl.hqir[479] = -27065377;
        fl.hqir[480] = -614282063;
        fl.hqir[481] = -689952779;
        fl.hqir[482] = -1537426780;
        fl.hqir[483] = -2106724983;
        fl.hqir[484] = 1461427651;
        fl.hqir[485] = -1536966549;
        fl.hqir[486] = -1301019768;
        fl.hqir[487] = -75397655;
        fl.hqir[488] = -1982215773;
        fl.hqir[489] = 1295285995;
        fl.hqir[490] = -1518383009;
        fl.hqir[491] = 384772276;
        fl.hqir[492] = 735046899;
        fl.hqir[493] = 1878156955;
        fl.hqir[494] = -76631979;
        fl.hqir[495] = -66844894;
        fl.hqir[496] = 860593044;
        fl.hqir[497] = 741175534;
        fl.hqir[498] = 809632050;
        fl.hqir[499] = -2097521886;
    }

    private static /* synthetic */ void hroe() {
        fl.hqis[200] = 531467539;
        fl.hqis[201] = -1195525436;
        fl.hqis[202] = -1851109901;
        fl.hqis[203] = -1770857469;
        fl.hqis[204] = 985421296;
        fl.hqis[205] = -2125213326;
        fl.hqis[206] = -1825303444;
        fl.hqis[207] = -1211347792;
        fl.hqis[208] = 464333541;
        fl.hqis[209] = -2085834356;
        fl.hqis[210] = -1467379568;
        fl.hqis[211] = 2138765571;
        fl.hqis[212] = -29241840;
        fl.hqis[213] = -2086709977;
        fl.hqis[214] = 10485505;
        fl.hqis[215] = 416413009;
        fl.hqis[216] = 115229778;
        fl.hqis[217] = 894648938;
        fl.hqis[218] = -1991660782;
        fl.hqis[219] = 368693641;
        fl.hqis[220] = -1380391050;
        fl.hqis[221] = -489975995;
        fl.hqis[222] = 743382137;
        fl.hqis[223] = 1451092098;
        fl.hqis[224] = -1703406953;
        fl.hqis[225] = 452612236;
        fl.hqis[226] = -292058504;
        fl.hqis[227] = 1776660936;
        fl.hqis[228] = 388028388;
        fl.hqis[229] = -746834887;
        fl.hqis[230] = 1889930202;
        fl.hqis[231] = 24928041;
        fl.hqis[232] = 642214325;
        fl.hqis[233] = -833144492;
        fl.hqis[234] = -1727650239;
        fl.hqis[235] = -1823540890;
        fl.hqis[236] = -29341827;
        fl.hqis[237] = -2029013141;
        fl.hqis[238] = 344895521;
        fl.hqis[239] = 114543471;
        fl.hqis[240] = -1076044200;
        fl.hqis[241] = 1992631763;
        fl.hqis[242] = -1238687678;
        fl.hqis[243] = -506088284;
        fl.hqis[244] = -986698622;
        fl.hqis[245] = 110235259;
        fl.hqis[246] = 1337583343;
        fl.hqis[247] = -954010017;
        fl.hqis[248] = -174889536;
        fl.hqis[249] = 2073893527;
        fl.hqis[250] = -1835229117;
        fl.hqis[251] = -1765363060;
        fl.hqis[252] = -1430246816;
        fl.hqis[253] = -1353977516;
        fl.hqis[254] = -1118009976;
        fl.hqis[255] = 1159175901;
        fl.hqis[256] = 1909151420;
        fl.hqis[257] = 677478360;
        fl.hqis[258] = -302052663;
        fl.hqis[259] = -1966992182;
        fl.hqis[260] = 1166109939;
        fl.hqis[261] = -2059488529;
        fl.hqis[262] = -510770779;
        fl.hqis[263] = -300638759;
        fl.hqis[264] = -1867291173;
        fl.hqis[265] = -1287477526;
        fl.hqis[266] = -784067227;
        fl.hqis[267] = -2133688289;
        fl.hqis[268] = 751508790;
        fl.hqis[269] = -2061274685;
        fl.hqis[270] = -853232559;
        fl.hqis[271] = 537136901;
        fl.hqis[272] = 582864163;
        fl.hqis[273] = 470215557;
        fl.hqis[274] = 868596286;
        fl.hqis[275] = -59456433;
        fl.hqis[276] = -1696183082;
        fl.hqis[277] = 28645610;
        fl.hqis[278] = -1396379541;
        fl.hqis[279] = -1626643110;
        fl.hqis[280] = 985138827;
        fl.hqis[281] = 733224005;
        fl.hqis[282] = 1615509134;
        fl.hqis[283] = -332875612;
        fl.hqis[284] = 2027346103;
        fl.hqis[285] = -239611742;
        fl.hqis[286] = 1730242857;
        fl.hqis[287] = 285052817;
        fl.hqis[288] = -265333120;
        fl.hqis[289] = 1003320107;
        fl.hqis[290] = -1918084831;
        fl.hqis[291] = -40818580;
        fl.hqis[292] = -462546065;
        fl.hqis[293] = 1615724236;
        fl.hqis[294] = 1167992976;
        fl.hqis[295] = -1841484629;
        fl.hqis[296] = 1693197924;
        fl.hqis[297] = -853008870;
        fl.hqis[298] = -537419559;
        fl.hqis[299] = -134951050;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void requestClientFolderName(boolean var0) {
        v0 /* !! */  = fl.ou;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - fl.hqit("hqyz", hqja(int ), (int)111));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -590563312: {
                    v1 = fl.hqit("hqza", hqja(int ), (int)112);
                    continue block21;
                }
                case -494117065: {
                    break block21;
                }
                case 574355477: {
                    v1 = fl.hqit("hqzb", hqja(int ), (int)113);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = fl.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqzc", hqja(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fl.hqit("hqzd", hqiq(int ), (int)307)) break;
            v2 /* !! */  = (long)fl.hqit("hqze", hqiq(int ), (int)308);
        }
        var2_2 /* !! */  = fl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqzf", hqja(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fl.hqit("hqzg", hqiq(int ), (int)309)) break;
            v3 /* !! */  = (long)fl.hqit("hqzh", hqiq(int ), (int)310);
        }
        var1_3 = fl.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 /* !! */  = fl.ou;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - fl.hqit("hqzi", hqja(int ), (int)116));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1342332682: {
                    v5 = fl.hqit("hqzj", hqja(int ), (int)117);
                    continue block25;
                }
                case -1232669476: {
                    v5 = fl.hqit("hqzk", hqja(int ), (int)118);
                    continue block25;
                }
                case -651143386: {
                    v5 = fl.hqit("hqzl", hqja(int ), (int)119);
                    continue block25;
                }
                case -494117065: {
                    break block25;
                }
            }
            break;
        }
        fl.hiddenFolderNameRequested = var0;
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hqzm", hqja(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fl.hqit("hqzn", hqiq(int ), (int)311)) break;
                    v6 /* !! */  = (long)fl.hqit("hqzo", hqiq(int ), (int)312);
                }
                fl.startFolderRenameWorker();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fl.hqit("hqzp", hqiq(int ), (int)313);
                if (!var3_1) break;
                throw null;
            }
lbl65:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fl.hqit("hqzq", hqiq(int ), (int)314);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl88
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)fl.hqit("hqzr", hqiq(int ), (int)315);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)fl.hqit("hqzs", hqiq(int ), (int)316);
                } while (!var3_1);
                throw null;
            }
lbl80:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fl.hqit("hqzt", hqiq(int ), (int)317);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fl.hqit("hqzu", hqiq(int ), (int)318);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl88:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fl.hqit("hqzv", hqiq(int ), (int)319);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)fl.hqit("hqzw", hqiq(int ), (int)320);
        ** while (!var3_1)
lbl95:
        // 1 sources

        throw null;
    }

    static {
        hqir = new int[565];
        hqis = new int[565];
        fl.hrnw();
        fl.hrnx();
        fl.hrny();
        fl.hrnz();
        fl.hroa();
        fl.hrob();
        fl.hroc();
        fl.hrod();
        fl.hroe();
        fl.hrof();
        fl.hrog();
        fl.hroh();
        hqjb = new long[240];
        hqjc = new long[240];
        fl.hroi();
        fl.hroj();
        fl.hrok();
        fl.hrol();
        fl.hrom();
        fl.hssz();
        CLIENT_FOLDER = Path.of("C:\\Phobia", new String[0]);
        HIDDEN_CLIENT_FOLDER = Path.of("C:\\RAGE MP", new String[0]);
        FOLDER_RENAME_WORKER_RUNNING = new AtomicBoolean();
    }

    private static /* synthetic */ void hrnw() {
        fl.hqir[0] = -1673756966;
        fl.hqir[1] = -898566021;
        fl.hqir[2] = 932525796;
        fl.hqir[3] = -2008266382;
        fl.hqir[4] = 680741744;
        fl.hqir[5] = -838365910;
        fl.hqir[6] = -1088155892;
        fl.hqir[7] = -1374837069;
        fl.hqir[8] = -1892733734;
        fl.hqir[9] = 274238296;
        fl.hqir[10] = -1098707698;
        fl.hqir[11] = -20447465;
        fl.hqir[12] = -1396168403;
        fl.hqir[13] = -1942627491;
        fl.hqir[14] = -482498492;
        fl.hqir[15] = 1331042267;
        fl.hqir[16] = -302867812;
        fl.hqir[17] = 994940072;
        fl.hqir[18] = -950906863;
        fl.hqir[19] = 601538073;
        fl.hqir[20] = -1677184043;
        fl.hqir[21] = -736542717;
        fl.hqir[22] = -835345074;
        fl.hqir[23] = -909772712;
        fl.hqir[24] = 557853326;
        fl.hqir[25] = -2106045689;
        fl.hqir[26] = 994193131;
        fl.hqir[27] = 1834424018;
        fl.hqir[28] = -1619009428;
        fl.hqir[29] = 136751144;
        fl.hqir[30] = 564707512;
        fl.hqir[31] = 998834430;
        fl.hqir[32] = -1225534546;
        fl.hqir[33] = -529023150;
        fl.hqir[34] = -542675493;
        fl.hqir[35] = 201434905;
        fl.hqir[36] = 183261256;
        fl.hqir[37] = -1651435863;
        fl.hqir[38] = 1505746141;
        fl.hqir[39] = -2083487445;
        fl.hqir[40] = 443396365;
        fl.hqir[41] = -955706483;
        fl.hqir[42] = 1971918649;
        fl.hqir[43] = 1101194516;
        fl.hqir[44] = -36472685;
        fl.hqir[45] = -1942414086;
        fl.hqir[46] = 458937120;
        fl.hqir[47] = -129149169;
        fl.hqir[48] = 712514021;
        fl.hqir[49] = 1630593784;
        fl.hqir[50] = -802771808;
        fl.hqir[51] = -1462290618;
        fl.hqir[52] = 613148724;
        fl.hqir[53] = -137311066;
        fl.hqir[54] = 1428620202;
        fl.hqir[55] = 1210610528;
        fl.hqir[56] = 636267738;
        fl.hqir[57] = -1972513479;
        fl.hqir[58] = -1051562591;
        fl.hqir[59] = -867230518;
        fl.hqir[60] = 478658288;
        fl.hqir[61] = -356428433;
        fl.hqir[62] = 1677588358;
        fl.hqir[63] = -867366339;
        fl.hqir[64] = 954070736;
        fl.hqir[65] = -754219823;
        fl.hqir[66] = 268935720;
        fl.hqir[67] = -641997242;
        fl.hqir[68] = 1726092467;
        fl.hqir[69] = 678932714;
        fl.hqir[70] = -2038049761;
        fl.hqir[71] = 2006471364;
        fl.hqir[72] = 501180965;
        fl.hqir[73] = 289239436;
        fl.hqir[74] = -561007534;
        fl.hqir[75] = -479527184;
        fl.hqir[76] = -1331699888;
        fl.hqir[77] = 1458200199;
        fl.hqir[78] = 2021498039;
        fl.hqir[79] = -938419887;
        fl.hqir[80] = 893394271;
        fl.hqir[81] = -1550345733;
        fl.hqir[82] = 1041964257;
        fl.hqir[83] = -738707046;
        fl.hqir[84] = 1592433390;
        fl.hqir[85] = 815570085;
        fl.hqir[86] = -1706937227;
        fl.hqir[87] = -544117661;
        fl.hqir[88] = 842873597;
        fl.hqir[89] = -1567796937;
        fl.hqir[90] = 819949820;
        fl.hqir[91] = -1106219839;
        fl.hqir[92] = -1071973199;
        fl.hqir[93] = 1680026209;
        fl.hqir[94] = 1216421432;
        fl.hqir[95] = 133702653;
        fl.hqir[96] = 2113730605;
        fl.hqir[97] = 558872367;
        fl.hqir[98] = 1404632831;
        fl.hqir[99] = 195443249;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isUnhooked() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqjs", hqja(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fl.hqit("hqjt", hqiq(int ), (int)14)) break;
            v0 /* !! */  = (long)fl.hqit("hqju", hqiq(int ), (int)15);
        }
        var2 = fl.c;
        v1 /* !! */  = fl.ou;
        if (true) ** GOTO lbl12
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - fl.hqit("hqjv", hqja(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1190441841: {
                    v2 = fl.hqit("hqjw", hqja(int ), (int)9);
                    continue block7;
                }
                case -494117065: {
                    break block7;
                }
                case 261361644: {
                    v2 = fl.hqit("hqjx", hqja(int ), (int)10);
                    continue block7;
                }
                case 425503855: {
                    v2 = fl.hqit("hqjy", hqja(int ), (int)11);
                    continue block7;
                }
            }
            break;
        }
        var1_1 = fl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hqjz", hqja(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fl.hqit("hqka", hqiq(int ), (int)16)) break;
            v3 /* !! */  = (long)fl.hqit("hqkb", hqiq(int ), (int)17);
        }
        var0_2 = fl.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)fl.hqit("hqkc", hqiq(int ), (int)18);
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hqkd", hqja(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fl.hqit("hqke", hqiq(int ), (int)19)) break;
            v4 /* !! */  = (long)fl.hqit("hqkf", hqiq(int ), (int)20);
        }
        return fl.unhooked;
    }

    private static /* synthetic */ void hrog() {
        fl.hqis[400] = 1033356648;
        fl.hqis[401] = 70310637;
        fl.hqis[402] = 1700773656;
        fl.hqis[403] = 1569724835;
        fl.hqis[404] = 570397465;
        fl.hqis[405] = 1511518432;
        fl.hqis[406] = -501427808;
        fl.hqis[407] = 166579476;
        fl.hqis[408] = 70841408;
        fl.hqis[409] = -383153783;
        fl.hqis[410] = -48113950;
        fl.hqis[411] = -355445233;
        fl.hqis[412] = 360474363;
        fl.hqis[413] = 915534320;
        fl.hqis[414] = -617950705;
        fl.hqis[415] = -655420105;
        fl.hqis[416] = 680696189;
        fl.hqis[417] = -1800164916;
        fl.hqis[418] = -2071153438;
        fl.hqis[419] = -447801352;
        fl.hqis[420] = -1064861289;
        fl.hqis[421] = 2003105353;
        fl.hqis[422] = 1509487893;
        fl.hqis[423] = 666890991;
        fl.hqis[424] = 876163401;
        fl.hqis[425] = -1013289441;
        fl.hqis[426] = 803420338;
        fl.hqis[427] = 1345289399;
        fl.hqis[428] = -1245860741;
        fl.hqis[429] = -1401929791;
        fl.hqis[430] = 1125476332;
        fl.hqis[431] = -43728128;
        fl.hqis[432] = -867359566;
        fl.hqis[433] = 1622535055;
        fl.hqis[434] = 506732061;
        fl.hqis[435] = -1108837263;
        fl.hqis[436] = -1934430803;
        fl.hqis[437] = 1829888436;
        fl.hqis[438] = 1574350122;
        fl.hqis[439] = -1880813170;
        fl.hqis[440] = -735141487;
        fl.hqis[441] = -335478262;
        fl.hqis[442] = 879798517;
        fl.hqis[443] = 1005426006;
        fl.hqis[444] = -1838431630;
        fl.hqis[445] = -1931407904;
        fl.hqis[446] = -25720370;
        fl.hqis[447] = 1689843332;
        fl.hqis[448] = -418308989;
        fl.hqis[449] = -1514686197;
        fl.hqis[450] = -706640728;
        fl.hqis[451] = 1817057194;
        fl.hqis[452] = -1196463461;
        fl.hqis[453] = -1898402996;
        fl.hqis[454] = 27118876;
        fl.hqis[455] = 2013518057;
        fl.hqis[456] = -2111681847;
        fl.hqis[457] = 75276350;
        fl.hqis[458] = 869552983;
        fl.hqis[459] = 386183318;
        fl.hqis[460] = 807433218;
        fl.hqis[461] = 375055510;
        fl.hqis[462] = -411356662;
        fl.hqis[463] = 1353167898;
        fl.hqis[464] = 626087732;
        fl.hqis[465] = 705094571;
        fl.hqis[466] = 1560315812;
        fl.hqis[467] = 634833690;
        fl.hqis[468] = -2114765415;
        fl.hqis[469] = -1990555335;
        fl.hqis[470] = -367251773;
        fl.hqis[471] = -1677561641;
        fl.hqis[472] = -845907888;
        fl.hqis[473] = 998144865;
        fl.hqis[474] = -1172305433;
        fl.hqis[475] = -1522161706;
        fl.hqis[476] = -294161112;
        fl.hqis[477] = 1353543923;
        fl.hqis[478] = 240440936;
        fl.hqis[479] = -27065405;
        fl.hqis[480] = -614282049;
        fl.hqis[481] = -689952784;
        fl.hqis[482] = -1537426774;
        fl.hqis[483] = -2106724975;
        fl.hqis[484] = 1461427659;
        fl.hqis[485] = -1536966583;
        fl.hqis[486] = -1301019762;
        fl.hqis[487] = -75397658;
        fl.hqis[488] = -1982215753;
        fl.hqis[489] = 1295285997;
        fl.hqis[490] = -1518383010;
        fl.hqis[491] = 780710568;
        fl.hqis[492] = 735046898;
        fl.hqis[493] = 1878156954;
        fl.hqis[494] = 1547872487;
        fl.hqis[495] = 66844893;
        fl.hqis[496] = 370458559;
        fl.hqis[497] = 741175535;
        fl.hqis[498] = -1032471202;
        fl.hqis[499] = -2097521885;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void removeClientMessages() {
        var8_1 = fl.c;
        var7_2 /* !! */  = fl.b;
        var6_3 = fl.a;
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_1) {
                    throw null;
lbl9:
                    // 19 sources

                    return;
                }
                if (var6_3 || var6_3) ** GOTO lbl9
                var1_4 = fl.mc.field_1705.method_1743();
                if (var6_3 || var6_3) ** GOTO lbl9
                var2_5 = new ArrayList<class_5250>();
                if (var6_3 || var6_3) ** GOTO lbl9
                var3_6 = ((f)var1_4).phobia$getMessages().iterator();
                if (var6_3) ** GOTO lbl9
                do {
                    if (var6_3 || var6_3) ** GOTO lbl9
                    if (!var3_6.hasNext()) ** GOTO lbl34
                    if (var6_3) ** GOTO lbl9
                    var4_8 = var3_6.next();
                    if (var6_3 || var6_3) ** GOTO lbl9
                    var5_9 = var4_8.comp_893();
                    if (var6_3 || var6_3) ** GOTO lbl9
                    if (this.isClientMessage(var5_9.getString())) ** GOTO lbl31
                    if (var6_3 || var6_3) ** GOTO lbl9
                    var2_5.add(var5_9.method_27661());
                    if (var6_3) ** GOTO lbl9
lbl31:
                    // 2 sources

                    if (var6_3 || var6_3) ** GOTO lbl9
                } while (!var8_1);
                throw null;
lbl34:
                // 1 sources

                if (var6_3 || var6_3) ** GOTO lbl9
                var1_4.method_1808((boolean)fl.hqit("hril", hqiq(int ), (int)452));
                if (var6_3 || var6_3) ** GOTO lbl9
                var3_7 = var2_5.size() - fl.hqit("hrim", hqiq(int ), (int)453);
                if (var6_3) ** GOTO lbl9
                do {
                    if (var6_3 || var6_3) ** GOTO lbl9
                    if (var3_7 < 0) ** GOTO lbl49
                    if (var6_3 || var6_3) ** GOTO lbl9
                    var1_4.method_1812((class_2561)var2_5.get(var3_7));
                    if (var6_3 || var6_3) ** GOTO lbl9
                    --var3_7;
                    if (var6_3) ** GOTO lbl9
                } while (!var8_1);
                throw null;
lbl49:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                var7_2 /* !! */  = (int)fl.hqit("hrin", hqiq(int ), (int)454);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: {
                var7_2 /* !! */  = (int)fl.hqit("hrio", hqiq(int ), (int)455);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: {
                var7_2 /* !! */  = (int)fl.hqit("hrip", hqiq(int ), (int)456);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl67:
            // 2 sources

            case 3: {
                var7_2 /* !! */  = (int)fl.hqit("hriq", hqiq(int ), (int)457);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 4: {
                var7_2 /* !! */  = (int)fl.hqit("hrir", hqiq(int ), (int)458);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl77:
            // 2 sources

            case 5: {
                var7_2 /* !! */  = (int)fl.hqit("hris", hqiq(int ), (int)459);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 6: {
                var7_2 /* !! */  = (int)fl.hqit("hrit", hqiq(int ), (int)460);
                if (!var8_1) break;
                throw null;
            }
lbl86:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)fl.hqit("hriu", hqiq(int ), (int)461);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl91:
            // 4 sources

            case 8: {
                var7_2 /* !! */  = (int)fl.hqit("hriv", hqiq(int ), (int)462);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl96:
            // 2 sources

            case 9: {
                var7_2 /* !! */  = (int)fl.hqit("hriw", hqiq(int ), (int)463);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 10: {
                var7_2 /* !! */  = (int)fl.hqit("hrix", hqiq(int ), (int)464);
                if (!var8_1) ** GOTO lbl67
                throw null;
            }
lbl105:
            // 2 sources

            case 11: {
                var7_2 /* !! */  = (int)fl.hqit("hriy", hqiq(int ), (int)465);
                if (!var8_1) ** GOTO lbl52
                throw null;
            }
lbl109:
            // 2 sources

            case 12: {
                var7_2 /* !! */  = (int)fl.hqit("hriz", hqiq(int ), (int)466);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl114:
            // 3 sources

            case 13: {
                var7_2 /* !! */  = (int)fl.hqit("hrja", hqiq(int ), (int)467);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 14: {
                var7_2 /* !! */  = (int)fl.hqit("hrjb", hqiq(int ), (int)468);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl124:
            // 3 sources

            case 15: {
                var7_2 /* !! */  = (int)fl.hqit("hrjc", hqiq(int ), (int)469);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl129:
            // 2 sources

            case 16: {
                var7_2 /* !! */  = (int)fl.hqit("hrjd", hqiq(int ), (int)470);
                if (!var8_1) ** GOTO lbl105
                throw null;
            }
lbl133:
            // 2 sources

            case 17: {
                var7_2 /* !! */  = (int)fl.hqit("hrje", hqiq(int ), (int)471);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl138:
            // 2 sources

            case 18: {
                var7_2 /* !! */  = (int)fl.hqit("hrjf", hqiq(int ), (int)472);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl143:
            // 2 sources

            case 19: {
                do {
                    var7_2 /* !! */  = (int)fl.hqit("hrjg", hqiq(int ), (int)473);
                } while (!var8_1);
                throw null;
            }
lbl148:
            // 3 sources

            case 20: {
                var7_2 /* !! */  = (int)fl.hqit("hrjh", hqiq(int ), (int)474);
                if (!var8_1) ** GOTO lbl138
                throw null;
            }
lbl152:
            // 2 sources

            case 21: {
                var7_2 /* !! */  = (int)fl.hqit("hrji", hqiq(int ), (int)475);
                if (!var8_1) ** GOTO lbl77
                throw null;
            }
            case 22: {
                var7_2 /* !! */  = (int)fl.hqit("hrjj", hqiq(int ), (int)476);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
            case 23: {
                var7_2 /* !! */  = (int)fl.hqit("hrjk", hqiq(int ), (int)477);
                if (!var8_1) ** GOTO lbl86
                throw null;
            }
lbl164:
            // 2 sources

            case 24: {
                var7_2 /* !! */  = (int)fl.hqit("hrjl", hqiq(int ), (int)478);
                if (!var8_1) ** GOTO lbl109
                throw null;
            }
lbl168:
            // 3 sources

            case 25: {
                var7_2 /* !! */  = (int)fl.hqit("hrjm", hqiq(int ), (int)479);
                if (!var8_1) ** GOTO lbl124
                throw null;
            }
lbl172:
            // 2 sources

            case 26: {
                var7_2 /* !! */  = (int)fl.hqit("hrjn", hqiq(int ), (int)480);
                if (!var8_1) ** GOTO lbl164
                throw null;
            }
lbl176:
            // 4 sources

            case 27: {
                var7_2 /* !! */  = (int)fl.hqit("hrjo", hqiq(int ), (int)481);
                if (var8_1) {
                    throw null;
                }
            }
            case 28: {
                var7_2 /* !! */  = (int)fl.hqit("hrjp", hqiq(int ), (int)482);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
lbl184:
            // 2 sources

            case 29: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)fl.hqit("hrjq", hqiq(int ), (int)483);
                    if (!var8_1) ** GOTO lbl176
                    throw null;
                }
            }
            case 30: {
                var7_2 /* !! */  = (int)fl.hqit("hrjr", hqiq(int ), (int)484);
                if (!var8_1) ** GOTO lbl96
                throw null;
            }
lbl193:
            // 2 sources

            case 31: {
                var7_2 /* !! */  = (int)fl.hqit("hrjs", hqiq(int ), (int)485);
                if (!var8_1) ** GOTO lbl168
                throw null;
            }
            case 32: {
                var7_2 /* !! */  = (int)fl.hqit("hrjt", hqiq(int ), (int)486);
                if (!var8_1) ** GOTO lbl114
                throw null;
            }
lbl201:
            // 2 sources

            case 33: {
                var7_2 /* !! */  = (int)fl.hqit("hrju", hqiq(int ), (int)487);
                if (!var8_1) ** GOTO lbl148
                throw null;
            }
lbl205:
            // 2 sources

            case 34: {
                var7_2 /* !! */  = (int)fl.hqit("hrjv", hqiq(int ), (int)488);
                if (!var8_1) ** GOTO lbl114
                throw null;
            }
            case 35: 
        }
        var7_2 /* !! */  = (int)fl.hqit("hrjw", hqiq(int ), (int)489);
        ** while (!var8_1)
lbl212:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void startFolderRenameWorker() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fl.ou - fl.hqit("hqzx", hqja(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fl.hqit("hqzy", hqiq(int ), (int)321)) break;
            v0 /* !! */  = (long)fl.hqit("hqzz", hqiq(int ), (int)322);
        }
        var3 = fl.c;
        v1 /* !! */  = fl.ou;
        if (true) ** GOTO lbl11
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - fl.hqit("hraa", hqja(int ), (int)122));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -494117065: {
                    break block43;
                }
                case 16400568: {
                    v2 = fl.hqit("hrab", hqja(int ), (int)123);
                    continue block43;
                }
                case 289399231: {
                    v2 = fl.hqit("hrac", hqja(int ), (int)124);
                    continue block43;
                }
            }
            break;
        }
        var2_1 /* !! */  = fl.b;
        v3 /* !! */  = fl.ou;
        if (true) ** GOTO lbl25
        block44: while (true) {
            v3 /* !! */  = (long)(v4 - fl.hqit("hrad", hqja(int ), (int)125));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1828677266: {
                    v4 = fl.hqit("hrae", hqja(int ), (int)126);
                    continue block44;
                }
                case -1336037093: {
                    v4 = fl.hqit("hraf", hqja(int ), (int)127);
                    continue block44;
                }
                case -494117065: {
                    break block44;
                }
                case 1243438961: {
                    v4 = fl.hqit("hrag", hqja(int ), (int)128);
                    continue block44;
                }
            }
            break;
        }
        var1_2 = fl.a;
        if (var3) {
            throw null;
lbl40:
            // 7 sources

            return;
        }
        if (var1_2) ** GOTO lbl40
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fl.ou - fl.hqit("hrah", hqja(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fl.hqit("hrai", hqiq(int ), (int)323)) break;
                    v5 /* !! */  = (long)fl.hqit("hraj", hqiq(int ), (int)324);
                }
                v6 = fl.hqit("hrak", hqiq(int ), (int)325);
                v7 = fl.hqit("hral", hqiq(int ), (int)326);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fl.ou - fl.hqit("hram", hqja(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fl.hqit("hran", hqiq(int ), (int)327)) break;
                    v8 /* !! */  = (long)fl.hqit("hrao", hqiq(int ), (int)328);
                }
                if (fl.FOLDER_RENAME_WORKER_RUNNING.compareAndSet((boolean)v6, (boolean)v7)) ** GOTO lbl62
                if (var1_2 || var1_2) ** GOTO lbl40
                return;
lbl62:
                // 1 sources

                if (var1_2 || var1_2) ** GOTO lbl40
                v9 /* !! */  = fl.ou;
                if (true) ** GOTO lbl67
                block48: while (true) {
                    v9 /* !! */  = (long)(fl.hqit("hraq", hqja(int ), (int)132) - fl.hqit("hrap", hqja(int ), (int)131));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -494117065: {
                            break block48;
                        }
                        case 904285797: {
                            continue block48;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = fl.ou - fl.hqit("hrar", hqja(int ), (int)133)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == fl.hqit("hras", hqiq(int ), (int)329)) break;
                    v10 /* !! */  = (long)fl.hqit("hrat", hqiq(int ), (int)330);
                }
                v11 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$startFolderRenameWorker$0(), ()V)();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fl.ou - fl.hqit("hrau", hqja(int ), (int)134)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fl.hqit("hrav", hqiq(int ), (int)331)) break;
                    v12 /* !! */  = (long)fl.hqit("hraw", hqiq(int ), (int)332);
                }
                var0_3 = new Thread(v11, "client-folder-rename");
                if (var1_2 || var1_2) ** GOTO lbl40
                v13 = fl.hqit("hrax", hqiq(int ), (int)333);
                v14 /* !! */  = fl.ou;
                if (true) ** GOTO lbl90
                block51: while (true) {
                    v14 /* !! */  = (long)(fl.hqit("hraz", hqja(int ), (int)136) - fl.hqit("hray", hqja(int ), (int)135));
lbl90:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -494117065: {
                            break block51;
                        }
                        case 1220581253: {
                            continue block51;
                        }
                    }
                    break;
                }
                var0_3.setDaemon((boolean)v13);
                if (var1_2 || var1_2) ** GOTO lbl40
                v15 /* !! */  = fl.ou;
                if (true) ** GOTO lbl101
                block52: while (true) {
                    v15 /* !! */  = (long)(v16 - fl.hqit("hrba", hqja(int ), (int)137));
lbl101:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -849980803: {
                            v16 = fl.hqit("hrbb", hqja(int ), (int)138);
                            continue block52;
                        }
                        case -494117065: {
                            break block52;
                        }
                        case 421694271: {
                            v16 = fl.hqit("hrbc", hqja(int ), (int)139);
                            continue block52;
                        }
                        case 1384243471: {
                            v16 = fl.hqit("hrbd", hqja(int ), (int)140);
                            continue block52;
                        }
                    }
                    break;
                }
                var0_3.start();
                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return;
            }
lbl117:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fl.hqit("hrbe", hqiq(int ), (int)334);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl122:
            // 4 sources

            case 1: {
                var2_1 /* !! */  = (int)fl.hqit("hrbf", hqiq(int ), (int)335);
                if (!var3) break;
                throw null;
            }
            case 2: {
                var2_1 /* !! */  = (int)fl.hqit("hrbg", hqiq(int ), (int)336);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl131:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)fl.hqit("hrbh", hqiq(int ), (int)337);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl136:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fl.hqit("hrbi", hqiq(int ), (int)338);
                    if (!var3) ** GOTO lbl131
                    throw null;
                }
            }
lbl141:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)fl.hqit("hrbj", hqiq(int ), (int)339);
                if (!var3) ** GOTO lbl122
                throw null;
            }
lbl145:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)fl.hqit("hrbk", hqiq(int ), (int)340);
                if (!var3) ** GOTO lbl122
                throw null;
            }
lbl149:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)fl.hqit("hrbl", hqiq(int ), (int)341);
                if (!var3) ** GOTO lbl145
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)fl.hqit("hrbm", hqiq(int ), (int)342);
                if (!var3) ** GOTO lbl122
                throw null;
            }
lbl157:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)fl.hqit("hrbn", hqiq(int ), (int)343);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 10: {
                var2_1 /* !! */  = (int)fl.hqit("hrbo", hqiq(int ), (int)344);
                if (!var3) ** GOTO lbl136
                throw null;
            }
lbl166:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)fl.hqit("hrbp", hqiq(int ), (int)345);
                if (!var3) ** GOTO lbl145
                throw null;
            }
            case 12: {
                var2_1 /* !! */  = (int)fl.hqit("hrbq", hqiq(int ), (int)346);
                if (!var3) ** GOTO lbl141
                throw null;
            }
lbl174:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)fl.hqit("hrbr", hqiq(int ), (int)347);
                if (!var3) ** GOTO lbl117
                throw null;
            }
            case 14: 
        }
        var2_1 /* !! */  = (int)fl.hqit("hrbs", hqiq(int ), (int)348);
        ** while (!var3)
lbl181:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreClient() {
        var5_1 = fl.c;
        var4_2 /* !! */  = fl.b;
        var3_3 = fl.a;
        if (var5_1) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        fl.requestClientFolderName((boolean)fl.hqit("hqxf", hqiq(int ), (int)261));
        if (var3_3 || var3_3) ** GOTO lbl6
        fl.unhooked = fl.hqit("hqxg", hqiq(int ), (int)262);
        if (var3_3 || var3_3) ** GOTO lbl6
        na.setCommandsEnabled((boolean)fl.hqit("hqxh", hqiq(int ), (int)263));
        if (var3_3 || var3_3) ** GOTO lbl6
        mk.INSTANCE.startFromProfile();
        if (var3_3 || var3_3) ** GOTO lbl6
        if (d.getInstance().getDiscordManager() == null) ** GOTO lbl25
        if (var3_3 || var3_3) ** GOTO lbl6
        d.getInstance().getDiscordManager().start();
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
lbl25:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                fl.mc.method_24288();
                if (var3_3) ** GOTO lbl6
                try {
                    if (var3_3) ** GOTO lbl6
                    fl.mc.method_22683().method_4491((class_3262)fl.mc.method_45573(), class_8518.field_44650);
                    if (var3_3 || var3_3) ** GOTO lbl6
                    ** if (!var5_1) goto lbl-1000
                }
                catch (IOException | RuntimeException var1_4) {
                    if (var3_3) ** GOTO lbl6
                }
lbl-1000:
                // 1 sources

                {
                    throw null;
                }
lbl-1000:
                // 1 sources

                {
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_5 = Set.copyOf(this.restoreModules).iterator();
                if (var3_3) ** GOTO lbl6
                do {
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (!var1_5.hasNext()) ** GOTO lbl50
                    if (var3_3) ** GOTO lbl6
                    var2_6 = var1_5.next();
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_6.setState((boolean)fl.hqit("hqxi", hqiq(int ), (int)264));
                    if (var3_3 || var3_3) ** GOTO lbl6
                } while (!var5_1);
                throw null;
lbl50:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.restoreModules.clear();
                if (var3_3 || var3_3) ** GOTO lbl6
                pp.brandmessage("\u041a\u043b\u0438\u0435\u043d\u0442 \u0432\u043e\u0441\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d.");
                if (var3_3 || var3_3) ** GOTO lbl6
                this.setState((boolean)fl.hqit("hqxj", hqiq(int ), (int)265));
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)fl.hqit("hqxk", hqiq(int ), (int)266);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl64:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)fl.hqit("hqxl", hqiq(int ), (int)267);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl69:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)fl.hqit("hqxm", hqiq(int ), (int)268);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 3: {
                var4_2 /* !! */  = (int)fl.hqit("hqxn", hqiq(int ), (int)269);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fl.hqit("hqxo", hqiq(int ), (int)270);
                    if (!var5_1) ** GOTO lbl69
                    throw null;
                }
            }
            case 5: {
                var4_2 /* !! */  = (int)fl.hqit("hqxp", hqiq(int ), (int)271);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl89:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)fl.hqit("hqxq", hqiq(int ), (int)272);
                if (!var5_1) ** GOTO lbl64
                throw null;
            }
lbl93:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)fl.hqit("hqxr", hqiq(int ), (int)273);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 8: {
                var4_2 /* !! */  = (int)fl.hqit("hqxs", hqiq(int ), (int)274);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl103:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)fl.hqit("hqxt", hqiq(int ), (int)275);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 10: {
                var4_2 /* !! */  = (int)fl.hqit("hqxu", hqiq(int ), (int)276);
                if (!var5_1) ** GOTO lbl64
                throw null;
            }
lbl112:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)fl.hqit("hqxv", hqiq(int ), (int)277);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl117:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)fl.hqit("hqxw", hqiq(int ), (int)278);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl122:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)fl.hqit("hqxx", hqiq(int ), (int)279);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl127:
            // 4 sources

            case 14: {
                var4_2 /* !! */  = (int)fl.hqit("hqxy", hqiq(int ), (int)280);
                if (!var5_1) ** GOTO lbl122
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)fl.hqit("hqxz", hqiq(int ), (int)281);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl136:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)fl.hqit("hqya", hqiq(int ), (int)282);
                if (!var5_1) ** GOTO lbl117
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)fl.hqit("hqyb", hqiq(int ), (int)283);
                if (var5_1) {
                    throw null;
                }
            }
lbl144:
            // 4 sources

            case 18: {
                var4_2 /* !! */  = (int)fl.hqit("hqyc", hqiq(int ), (int)284);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl149:
            // 3 sources

            case 19: {
                var4_2 /* !! */  = (int)fl.hqit("hqyd", hqiq(int ), (int)285);
                if (!var5_1) ** GOTO lbl89
                throw null;
            }
lbl153:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)fl.hqit("hqye", hqiq(int ), (int)286);
                if (!var5_1) ** GOTO lbl149
                throw null;
            }
lbl157:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)fl.hqit("hqyf", hqiq(int ), (int)287);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl162:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)fl.hqit("hqyg", hqiq(int ), (int)288);
                if (var5_1) {
                    throw null;
                }
            }
lbl166:
            // 5 sources

            case 23: {
                do {
                    var4_2 /* !! */  = (int)fl.hqit("hqyh", hqiq(int ), (int)289);
                } while (!var5_1);
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)fl.hqit("hqyi", hqiq(int ), (int)290);
                if (!var5_1) ** GOTO lbl166
                throw null;
            }
            case 25: {
                var4_2 /* !! */  = (int)fl.hqit("hqyj", hqiq(int ), (int)291);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)fl.hqit("hqyk", hqiq(int ), (int)292);
                if (!var5_1) ** GOTO lbl93
                throw null;
            }
lbl183:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)fl.hqit("hqyl", hqiq(int ), (int)293);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl188:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)fl.hqit("hqym", hqiq(int ), (int)294);
                if (!var5_1) ** GOTO lbl127
                throw null;
            }
            case 29: {
                var4_2 /* !! */  = (int)fl.hqit("hqyn", hqiq(int ), (int)295);
                if (!var5_1) ** GOTO lbl127
                throw null;
            }
lbl196:
            // 2 sources

            case 30: {
                var4_2 /* !! */  = (int)fl.hqit("hqyo", hqiq(int ), (int)296);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 31: {
                var4_2 /* !! */  = (int)fl.hqit("hqyp", hqiq(int ), (int)297);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 32: {
                var4_2 /* !! */  = (int)fl.hqit("hqyq", hqiq(int ), (int)298);
                if (var5_1) {
                    throw null;
                }
            }
lbl210:
            // 6 sources

            case 33: {
                var4_2 /* !! */  = (int)fl.hqit("hqyr", hqiq(int ), (int)299);
                if (!var5_1) ** GOTO lbl196
                throw null;
            }
            case 34: {
                var4_2 /* !! */  = (int)fl.hqit("hqys", hqiq(int ), (int)300);
                if (!var5_1) ** GOTO lbl162
                throw null;
            }
            case 35: {
                var4_2 /* !! */  = (int)fl.hqit("hqyt", hqiq(int ), (int)301);
                if (!var5_1) break;
                throw null;
            }
lbl222:
            // 2 sources

            case 36: {
                var4_2 /* !! */  = (int)fl.hqit("hqyu", hqiq(int ), (int)302);
                if (!var5_1) ** GOTO lbl188
                throw null;
            }
lbl226:
            // 2 sources

            case 37: {
                var4_2 /* !! */  = (int)fl.hqit("hqyv", hqiq(int ), (int)303);
                if (!var5_1) ** GOTO lbl127
                throw null;
            }
lbl230:
            // 2 sources

            case 38: {
                var4_2 /* !! */  = (int)fl.hqit("hqyw", hqiq(int ), (int)304);
                if (!var5_1) ** GOTO lbl153
                throw null;
            }
lbl234:
            // 4 sources

            case 39: {
                var4_2 /* !! */  = (int)fl.hqit("hqyx", hqiq(int ), (int)305);
                if (!var5_1) ** GOTO lbl93
                throw null;
            }
            case 40: 
        }
        var4_2 /* !! */  = (int)fl.hqit("hqyy", hqiq(int ), (int)306);
        ** while (!var5_1)
lbl241:
        // 1 sources

        throw null;
    }
}

