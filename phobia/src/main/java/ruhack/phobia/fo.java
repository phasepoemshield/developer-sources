/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348$class_5246
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.fo$Rank;
import ruhack.phobia.fo$Segment;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;

public final class fo
extends ds {
    private final kb hideKillsDeaths;
    public static final boolean c;
    private final kb hideDonate;
    static final long og = -4973108222034990277L;
    private final kf mode;
    private volatile String originalClan;
    private final kf donate;
    private static final Pattern CLAN;
    private final kb hideClan;
    private volatile String originalDonate;
    private static final Pattern SERVER;
    private final kb hideGrief;
    private static final Pattern DONATE;
    private static int[] hfkw;
    private static final Pattern KILLS_DEATHS;
    private static int[] hfky;
    private static long[] hfrf;
    private final kb hideServer;
    public static final int b;
    private static final Pattern GRIEF;
    private static long[] hfre;
    public static final boolean a;
    private static fo instance;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_2583 styleAt(List<fo$Segment> var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hhdj", hfrd(int ), (int)299)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo.hfla("hhdk", hfks(int ), (int)449)) break;
            v0 /* !! */  = (long)fo.hfla("hhdl", hfks(int ), (int)450);
        }
        var6_2 = fo.c;
        v1 /* !! */  = fo.og;
        if (true) ** GOTO lbl12
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - fo.hfla("hhdm", hfrd(int ), (int)300));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1834856113: {
                    v2 = fo.hfla("hhdn", hfrd(int ), (int)301);
                    continue block58;
                }
                case -1817570359: {
                    v2 = fo.hfla("hhdo", hfrd(int ), (int)302);
                    continue block58;
                }
                case -1274565829: {
                    break block58;
                }
                case 1981399811: {
                    v2 = fo.hfla("hhdp", hfrd(int ), (int)303);
                    continue block58;
                }
            }
            break;
        }
        var5_3 /* !! */  = fo.b;
        v3 /* !! */  = fo.og;
        if (true) ** GOTO lbl29
        block59: while (true) {
            v3 /* !! */  = (long)(v4 - fo.hfla("hhdq", hfrd(int ), (int)304));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2086027586: {
                    v4 = fo.hfla("hhdr", hfrd(int ), (int)305);
                    continue block59;
                }
                case -2028060844: {
                    v4 = fo.hfla("hhds", hfrd(int ), (int)306);
                    continue block59;
                }
                case -1274565829: {
                    break block59;
                }
            }
            break;
        }
        var4_4 = fo.a;
        if (var6_2) {
            throw null;
lbl41:
            // 9 sources

            return null;
        }
        if (var4_4 || var4_4) ** GOTO lbl41
        v5 /* !! */  = fo.og;
        if (true) ** GOTO lbl48
        block61: while (true) {
            v5 /* !! */  = (long)(v6 - fo.hfla("hhdt", hfrd(int ), (int)307));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1274565829: {
                    break block61;
                }
                case -1137408471: {
                    v6 = fo.hfla("hhdu", hfrd(int ), (int)308);
                    continue block61;
                }
                case -656281296: {
                    v6 = fo.hfla("hhdv", hfrd(int ), (int)309);
                    continue block61;
                }
                case 17836083: {
                    v6 = fo.hfla("hhdw", hfrd(int ), (int)310);
                    continue block61;
                }
            }
            break;
        }
        var2_5 = var0.iterator();
        if (var4_4) ** GOTO lbl41
        block62: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl41
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hhdx", hfrd(int ), (int)311)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == fo.hfla("hhdy", hfks(int ), (int)451)) break;
                v7 /* !! */  = (long)fo.hfla("hhdz", hfks(int ), (int)452);
            }
            if (!var2_5.hasNext()) ** GOTO lbl133
            if (var4_4) ** GOTO lbl41
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hhea", hfrd(int ), (int)312)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == fo.hfla("hheb", hfks(int ), (int)453)) break;
                v8 /* !! */  = (long)fo.hfla("hhec", hfks(int ), (int)454);
            }
            var3_6 = var2_5.next();
            if (var4_4 || var4_4) ** GOTO lbl41
            v9 /* !! */  = fo.og;
            if (true) ** GOTO lbl84
            block65: while (true) {
                v9 /* !! */  = (long)(v10 - fo.hfla("hhed", hfrd(int ), (int)313));
lbl84:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1664445536: {
                        v10 = fo.hfla("hhee", hfrd(int ), (int)314);
                        continue block65;
                    }
                    case -1274565829: {
                        break block65;
                    }
                    case 1473894775: {
                        v10 = fo.hfla("hhef", hfrd(int ), (int)315);
                        continue block65;
                    }
                }
                break;
            }
            if (var1_1 < var3_6.start) ** GOTO lbl130
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl41
                    v11 /* !! */  = fo.og;
                    if (true) ** GOTO lbl102
                    block66: while (true) {
                        v11 /* !! */  = (long)(v12 - fo.hfla("hheg", hfrd(int ), (int)316));
lbl102:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1274565829: {
                                break block66;
                            }
                            case 70177502: {
                                v12 = fo.hfla("hheh", hfrd(int ), (int)317);
                                continue block66;
                            }
                            case 899615350: {
                                v12 = fo.hfla("hhei", hfrd(int ), (int)318);
                                continue block66;
                            }
                        }
                        break;
                    }
                    if (var1_1 >= var3_6.end) ** GOTO lbl130
                    if (var4_4) ** GOTO lbl41
                    v13 /* !! */  = fo.og;
                    if (true) ** GOTO lbl117
                    block67: while (true) {
                        v13 /* !! */  = (long)(v14 - fo.hfla("hhej", hfrd(int ), (int)319));
lbl117:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -1274565829: {
                                break block67;
                            }
                            case -772232353: {
                                v14 = fo.hfla("hhek", hfrd(int ), (int)320);
                                continue block67;
                            }
                            case 297666345: {
                                v14 = fo.hfla("hhel", hfrd(int ), (int)321);
                                continue block67;
                            }
                            case 1869011384: {
                                v14 = fo.hfla("hhem", hfrd(int ), (int)322);
                                continue block67;
                            }
                        }
                        break;
                    }
                    return var3_6.style;
lbl130:
                    // 2 sources

                    if (var4_4 || var4_4) ** GOTO lbl41
                    if (!var6_2) continue block62;
                    throw null;
                }
lbl133:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v15 /* !! */  = fo.og;
                if (true) ** GOTO lbl139
                block68: while (true) {
                    v15 /* !! */  = (long)(v16 - fo.hfla("hhen", hfrd(int ), (int)323));
lbl139:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1274565829: {
                            break block68;
                        }
                        case -131722145: {
                            v16 = fo.hfla("hheo", hfrd(int ), (int)324);
                            continue block68;
                        }
                        case 1176585980: {
                            v16 = fo.hfla("hhep", hfrd(int ), (int)325);
                            continue block68;
                        }
                    }
                    break;
                }
                return class_2583.field_24360;
lbl149:
                // 2 sources

                case 0: {
                    var5_3 /* !! */  = (int)fo.hfla("hheq", hfks(int ), (int)455);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl154:
                // 2 sources

                case 1: {
                    var5_3 /* !! */  = (int)fo.hfla("hher", hfks(int ), (int)456);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl159:
                // 2 sources

                case 2: {
                    var5_3 /* !! */  = (int)fo.hfla("hhes", hfks(int ), (int)457);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl164:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)fo.hfla("hhet", hfks(int ), (int)458);
                    if (!var6_2) break block62;
                    throw null;
                }
                case 4: {
                    var5_3 /* !! */  = (int)fo.hfla("hheu", hfks(int ), (int)459);
                    if (!var6_2) ** GOTO lbl164
                    throw null;
                }
                case 5: {
                    var5_3 /* !! */  = (int)fo.hfla("hhev", hfks(int ), (int)460);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl177:
                // 3 sources

                case 6: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)fo.hfla("hhew", hfks(int ), (int)461);
                        if (!var6_2) ** GOTO lbl149
                        throw null;
                    }
                }
                case 7: {
                    var5_3 /* !! */  = (int)fo.hfla("hhex", hfks(int ), (int)462);
                    if (!var6_2) break block62;
                    throw null;
                }
lbl186:
                // 2 sources

                case 8: {
                    var5_3 /* !! */  = (int)fo.hfla("hhey", hfks(int ), (int)463);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl191:
                // 3 sources

                case 9: {
                    var5_3 /* !! */  = (int)fo.hfla("hhez", hfks(int ), (int)464);
                    if (var6_2) {
                        throw null;
                    }
                }
                case 10: {
                    var5_3 /* !! */  = (int)fo.hfla("hhfa", hfks(int ), (int)465);
                    if (!var6_2) ** GOTO lbl154
                    throw null;
                }
                case 11: {
                    var5_3 /* !! */  = (int)fo.hfla("hhfb", hfks(int ), (int)466);
                    if (!var6_2) ** GOTO lbl177
                    throw null;
                }
lbl203:
                // 3 sources

                case 12: {
                    var5_3 /* !! */  = (int)fo.hfla("hhfc", hfks(int ), (int)467);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl207:
                // 4 sources

                case 13: {
                    var5_3 /* !! */  = (int)fo.hfla("hhfd", hfks(int ), (int)468);
                    if (!var6_2) ** GOTO lbl177
                    throw null;
                }
                case 14: {
                    var5_3 /* !! */  = (int)fo.hfla("hhfe", hfks(int ), (int)469);
                    if (!var6_2) ** GOTO lbl159
                    throw null;
                }
                case 15: {
                    var5_3 /* !! */  = (int)fo.hfla("hhff", hfks(int ), (int)470);
                    if (!var6_2) ** GOTO lbl203
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var5_3 /* !! */  = (int)fo.hfla("hhfg", hfks(int ), (int)471);
        ** while (!var6_2)
lbl222:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhph() {
        fo.hfky[500] = -1914234545;
        fo.hfky[501] = 1473073716;
        fo.hfky[502] = -2079611263;
        fo.hfky[503] = -1417253561;
        fo.hfky[504] = -1027190202;
        fo.hfky[505] = 290996649;
        fo.hfky[506] = 997666618;
        fo.hfky[507] = 393088307;
        fo.hfky[508] = 1317102101;
        fo.hfky[509] = -1754565198;
        fo.hfky[510] = 1144330523;
        fo.hfky[511] = 1290638226;
        fo.hfky[512] = -1402787951;
        fo.hfky[513] = -1322664493;
        fo.hfky[514] = -700065688;
        fo.hfky[515] = 1438549036;
        fo.hfky[516] = -1848313859;
        fo.hfky[517] = 1435309215;
        fo.hfky[518] = -125436567;
        fo.hfky[519] = 1441768866;
        fo.hfky[520] = 1305355186;
        fo.hfky[521] = 1553518137;
        fo.hfky[522] = 535674122;
        fo.hfky[523] = 573326348;
        fo.hfky[524] = -950029465;
        fo.hfky[525] = -1421097007;
        fo.hfky[526] = 1386998364;
        fo.hfky[527] = -1726463837;
        fo.hfky[528] = -1244824791;
        fo.hfky[529] = -1702234818;
        fo.hfky[530] = 1191924811;
        fo.hfky[531] = -1124707772;
        fo.hfky[532] = -1418558385;
        fo.hfky[533] = -1225707901;
        fo.hfky[534] = -1501363116;
        fo.hfky[535] = 1120026688;
        fo.hfky[536] = 1400856078;
        fo.hfky[537] = 534440909;
        fo.hfky[538] = -1434243682;
        fo.hfky[539] = 1364519878;
        fo.hfky[540] = 224040949;
        fo.hfky[541] = -127014975;
        fo.hfky[542] = -313952045;
        fo.hfky[543] = 1323748846;
        fo.hfky[544] = -747526043;
        fo.hfky[545] = -867946268;
        fo.hfky[546] = -1978927271;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void appendRange(class_5250 var0, List<fo$Segment> var1_1, int var2_2, int var3_3) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block69: while (true) {
            v0 /* !! */  = (long)(fo.hfla("hhfi", hfrd(int ), (int)327) - fo.hfla("hhfh", hfrd(int ), (int)326));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block69;
                }
                case 2065047066: {
                    continue block69;
                }
            }
            break;
        }
        var10_4 = fo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hhfj", hfrd(int ), (int)328)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fo.hfla("hhfk", hfks(int ), (int)472)) break;
            v1 /* !! */  = (long)fo.hfla("hhfl", hfks(int ), (int)473);
        }
        var9_5 /* !! */  = fo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hhfm", hfrd(int ), (int)329)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fo.hfla("hhfn", hfks(int ), (int)474)) break;
            v2 /* !! */  = (long)fo.hfla("hhfo", hfks(int ), (int)475);
        }
        var8_6 = fo.a;
        if (var10_4) {
            throw null;
lbl25:
            // 11 sources

            return;
        }
        if (var8_6 || var8_6) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hhfp", hfrd(int ), (int)330)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fo.hfla("hhfq", hfks(int ), (int)476)) break;
            v3 /* !! */  = (long)fo.hfla("hhfr", hfks(int ), (int)477);
        }
        var4_7 = var1_1.iterator();
        if (var8_6) ** GOTO lbl25
        block74: while (true) {
            block107: {
                if (var8_6 || var8_6) ** GOTO lbl25
                v4 /* !! */  = fo.og;
                if (true) ** GOTO lbl41
                block75: while (true) {
                    v4 /* !! */  = (long)(v5 - fo.hfla("hhfs", hfrd(int ), (int)331));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1497694758: {
                            v5 = fo.hfla("hhft", hfrd(int ), (int)332);
                            continue block75;
                        }
                        case -1274565829: {
                            break block75;
                        }
                        case 591947825: {
                            v5 = fo.hfla("hhfu", hfrd(int ), (int)333);
                            continue block75;
                        }
                    }
                    break;
                }
                if (!var4_7.hasNext()) ** GOTO lbl199
                if (var8_6) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hhfv", hfrd(int ), (int)334)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fo.hfla("hhfw", hfks(int ), (int)478)) break;
                    v6 /* !! */  = (long)fo.hfla("hhfx", hfks(int ), (int)479);
                }
                var5_8 = var4_7.next();
                if (var8_6 || var8_6) ** GOTO lbl25
                v7 /* !! */  = fo.og;
                if (true) ** GOTO lbl63
                block77: while (true) {
                    v7 /* !! */  = (long)(v8 - fo.hfla("hhfy", hfrd(int ), (int)335));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1969657269: {
                            v8 = fo.hfla("hhfz", hfrd(int ), (int)336);
                            continue block77;
                        }
                        case -1274565829: {
                            break block77;
                        }
                        case -710361856: {
                            v8 = fo.hfla("hhga", hfrd(int ), (int)337);
                            continue block77;
                        }
                        case -234620492: {
                            v8 = fo.hfla("hhgb", hfrd(int ), (int)338);
                            continue block77;
                        }
                    }
                    break;
                }
                v9 = var5_8.start;
                v10 /* !! */  = fo.og;
                if (true) ** GOTO lbl80
                block78: while (true) {
                    v10 /* !! */  = (long)(v11 - fo.hfla("hhgc", hfrd(int ), (int)339));
lbl80:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1703206252: {
                            v11 = fo.hfla("hhgd", hfrd(int ), (int)340);
                            continue block78;
                        }
                        case -1274565829: {
                            break block78;
                        }
                        case -996474457: {
                            v11 = fo.hfla("hhge", hfrd(int ), (int)341);
                            continue block78;
                        }
                        case 549094559: {
                            v11 = fo.hfla("hhgf", hfrd(int ), (int)342);
                            continue block78;
                        }
                    }
                    break;
                }
                var6_9 = Math.max(var2_2, v9);
                if (var8_6 || var8_6) ** GOTO lbl25
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hhgg", hfrd(int ), (int)343)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fo.hfla("hhgh", hfks(int ), (int)480)) break;
                    v12 /* !! */  = (long)fo.hfla("hhgi", hfks(int ), (int)481);
                }
                v13 = var5_8.end;
                v14 /* !! */  = fo.og;
                if (true) ** GOTO lbl104
                block80: while (true) {
                    v14 /* !! */  = (long)(fo.hfla("hhgk", hfrd(int ), (int)345) - fo.hfla("hhgj", hfrd(int ), (int)344));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1274565829: {
                            break block80;
                        }
                        case -786625464: {
                            continue block80;
                        }
                    }
                    break;
                }
                var7_10 = Math.min(var3_3, v13);
                if (var8_6 || var8_6) ** GOTO lbl25
                if (var6_9 >= var7_10) break block107;
                if (var8_6 || var8_6) ** GOTO lbl25
                v15 /* !! */  = fo.og;
                if (true) ** GOTO lbl117
                block81: while (true) {
                    v15 /* !! */  = (long)(v16 - fo.hfla("hhgl", hfrd(int ), (int)346));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1274565829: {
                            break block81;
                        }
                        case -1233314351: {
                            v16 = fo.hfla("hhgm", hfrd(int ), (int)347);
                            continue block81;
                        }
                        case -614356990: {
                            v16 = fo.hfla("hhgn", hfrd(int ), (int)348);
                            continue block81;
                        }
                        case 574422743: {
                            v16 = fo.hfla("hhgo", hfrd(int ), (int)349);
                            continue block81;
                        }
                    }
                    break;
                }
                v17 = var5_8.value;
                v18 /* !! */  = fo.og;
                if (true) ** GOTO lbl134
                block82: while (true) {
                    v18 /* !! */  = (long)(v19 - fo.hfla("hhgp", hfrd(int ), (int)350));
lbl134:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1274565829: {
                            break block82;
                        }
                        case 1197768513: {
                            v19 = fo.hfla("hhgq", hfrd(int ), (int)351);
                            continue block82;
                        }
                        case 1221290983: {
                            v19 = fo.hfla("hhgr", hfrd(int ), (int)352);
                            continue block82;
                        }
                        case 1882003989: {
                            v19 = fo.hfla("hhgs", hfrd(int ), (int)353);
                            continue block82;
                        }
                    }
                    break;
                }
                v20 = var6_9 - var5_8.start;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = fo.og - fo.hfla("hhgt", hfrd(int ), (int)354)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fo.hfla("hhgu", hfks(int ), (int)482)) break;
                    v21 /* !! */  = (long)fo.hfla("hhgv", hfks(int ), (int)483);
                }
                v22 = var7_10 - var5_8.start;
                v23 /* !! */  = fo.og;
                if (true) ** GOTO lbl157
                block84: while (true) {
                    v23 /* !! */  = (long)(fo.hfla("hhgx", hfrd(int ), (int)356) - fo.hfla("hhgw", hfrd(int ), (int)355));
lbl157:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1274565829: {
                            break block84;
                        }
                        case -930847892: {
                            continue block84;
                        }
                    }
                    break;
                }
                v24 = v17.substring(v20, v22);
                v25 /* !! */  = fo.og;
                if (true) ** GOTO lbl167
                block85: while (true) {
                    v25 /* !! */  = (long)(fo.hfla("hhgz", hfrd(int ), (int)358) - fo.hfla("hhgy", hfrd(int ), (int)357));
lbl167:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1274565829: {
                            break block85;
                        }
                        case -781523899: {
                            continue block85;
                        }
                    }
                    break;
                }
                v26 = class_2561.method_43470((String)v24);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = fo.og - fo.hfla("hhha", hfrd(int ), (int)359)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fo.hfla("hhhb", hfks(int ), (int)484)) break;
                    v27 /* !! */  = (long)fo.hfla("hhhc", hfks(int ), (int)485);
                }
                v28 = var5_8.style;
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = fo.og - fo.hfla("hhhd", hfrd(int ), (int)360)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == fo.hfla("hhhe", hfks(int ), (int)486)) break;
                    v29 /* !! */  = (long)fo.hfla("hhhf", hfks(int ), (int)487);
                }
                v30 = v26.method_10862(v28);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_8 = fo.og - fo.hfla("hhhg", hfrd(int ), (int)361)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == fo.hfla("hhhh", hfks(int ), (int)488)) break;
                    v31 /* !! */  = (long)fo.hfla("hhhi", hfks(int ), (int)489);
                }
                var0.method_10852((class_2561)v30);
                if (var8_6) ** GOTO lbl25
            }
            if (var8_6 || var8_6) ** GOTO lbl25
            if (var9_5 /* !! */  == 0) continue;
            switch (var9_5 /* !! */ ) {
                default: {
                    if (!var10_4) continue block74;
                    throw null;
                }
lbl199:
                // 1 sources

                if (!var8_6 && !var8_6) ** break;
                ** continue;
                return;
lbl202:
                // 2 sources

                case 0: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhj", hfks(int ), (int)490);
                    if (var10_4) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl207:
                // 2 sources

                case 1: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhk", hfks(int ), (int)491);
                    if (var10_4) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
lbl212:
                // 3 sources

                case 2: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhl", hfks(int ), (int)492);
                    if (var10_4) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl217:
                // 2 sources

                case 3: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhm", hfks(int ), (int)493);
                    if (!var10_4) ** GOTO lbl212
                    throw null;
                }
lbl221:
                // 5 sources

                case 4: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhn", hfks(int ), (int)494);
                    if (var10_4) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl226:
                // 2 sources

                case 5: {
                    var9_5 /* !! */  = (int)fo.hfla("hhho", hfks(int ), (int)495);
                    if (!var10_4) ** GOTO lbl221
                    throw null;
                }
lbl230:
                // 3 sources

                case 6: {
                    do {
                        var9_5 /* !! */  = (int)fo.hfla("hhhp", hfks(int ), (int)496);
                    } while (!var10_4);
                    throw null;
                }
lbl235:
                // 3 sources

                case 7: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhq", hfks(int ), (int)497);
                    if (!var10_4) ** GOTO lbl221
                    throw null;
                }
lbl239:
                // 2 sources

                case 8: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhr", hfks(int ), (int)498);
                    if (!var10_4) ** GOTO lbl217
                    throw null;
                }
                case 9: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhs", hfks(int ), (int)499);
                    if (!var10_4) ** GOTO lbl235
                    throw null;
                }
                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_5 /* !! */  = (int)fo.hfla("hhht", hfks(int ), (int)500);
                        if (!var10_4) ** GOTO lbl212
                        throw null;
                    }
                }
                case 11: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhu", hfks(int ), (int)501);
                    if (!var10_4) ** GOTO lbl226
                    throw null;
                }
lbl256:
                // 2 sources

                case 12: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhv", hfks(int ), (int)502);
                    if (!var10_4) break block74;
                    throw null;
                }
                case 13: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhw", hfks(int ), (int)503);
                    if (!var10_4) ** GOTO lbl202
                    throw null;
                }
                case 14: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhx", hfks(int ), (int)504);
                    if (!var10_4) ** GOTO lbl207
                    throw null;
                }
                case 15: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhy", hfks(int ), (int)505);
                    if (!var10_4) ** GOTO lbl230
                    throw null;
                }
                case 16: {
                    var9_5 /* !! */  = (int)fo.hfla("hhhz", hfks(int ), (int)506);
                    if (!var10_4) ** GOTO lbl239
                    throw null;
                }
lbl276:
                // 2 sources

                case 17: {
                    var9_5 /* !! */  = (int)fo.hfla("hhia", hfks(int ), (int)507);
                    if (var10_4) {
                        throw null;
                    }
                    ** GOTO lbl289
                }
                case 18: {
                    var9_5 /* !! */  = (int)fo.hfla("hhib", hfks(int ), (int)508);
                    if (!var10_4) ** GOTO lbl221
                    throw null;
                }
                case 19: {
                    var9_5 /* !! */  = (int)fo.hfla("hhic", hfks(int ), (int)509);
                    if (!var10_4) ** GOTO lbl256
                    throw null;
                }
lbl289:
                // 3 sources

                case 20: {
                    var9_5 /* !! */  = (int)fo.hfla("hhid", hfks(int ), (int)510);
                    if (!var10_4) ** GOTO lbl221
                    throw null;
                }
                case 21: 
            }
            break;
        }
        var9_5 /* !! */  = (int)fo.hfla("hhie", hfks(int ), (int)511);
        ** while (!var10_4)
lbl296:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhpt() {
        fo.hfre[0] = 4930600259806920444L;
        fo.hfre[1] = -6931699824141217297L;
        fo.hfre[2] = -4804563281172286924L;
        fo.hfre[3] = -7591205656102927187L;
        fo.hfre[4] = -3913484177690965092L;
        fo.hfre[5] = -4117880209617461049L;
        fo.hfre[6] = -3826623550103098713L;
        fo.hfre[7] = 1860028338633689796L;
        fo.hfre[8] = -5796414702359697421L;
        fo.hfre[9] = 2457400347486107768L;
        fo.hfre[10] = -7233993278023179497L;
        fo.hfre[11] = -192001103736062613L;
        fo.hfre[12] = 7086150984501706729L;
        fo.hfre[13] = -6617799846554602619L;
        fo.hfre[14] = -2548094124000428275L;
        fo.hfre[15] = -3018793057915365379L;
        fo.hfre[16] = -1065955247531570252L;
        fo.hfre[17] = 4621975470746916394L;
        fo.hfre[18] = 7714661317878482985L;
        fo.hfre[19] = 2403603042144388285L;
        fo.hfre[20] = -4186289835939489727L;
        fo.hfre[21] = 564985986316506554L;
        fo.hfre[22] = 3323226616772957864L;
        fo.hfre[23] = -1548568980409470586L;
        fo.hfre[24] = 2826578556958799053L;
        fo.hfre[25] = 4023862941910478205L;
        fo.hfre[26] = -1970991013080950630L;
        fo.hfre[27] = 8702855587547031057L;
        fo.hfre[28] = 7609384326375183491L;
        fo.hfre[29] = 4823017571991465982L;
        fo.hfre[30] = 4175512960593140473L;
        fo.hfre[31] = 6563979086877865475L;
        fo.hfre[32] = -3939074563866753301L;
        fo.hfre[33] = -4772487466983275903L;
        fo.hfre[34] = 8857227437624624224L;
        fo.hfre[35] = 3770292244027847590L;
        fo.hfre[36] = -4291357813214790770L;
        fo.hfre[37] = -402399845916042339L;
        fo.hfre[38] = -922369861140157094L;
        fo.hfre[39] = 2283500275903038113L;
        fo.hfre[40] = -574570622764095239L;
        fo.hfre[41] = -8921003541391803546L;
        fo.hfre[42] = -96254757487498501L;
        fo.hfre[43] = -839215494863295928L;
        fo.hfre[44] = 1919650814305204067L;
        fo.hfre[45] = 3201016353564881599L;
        fo.hfre[46] = 2462975876034709536L;
        fo.hfre[47] = -2888698223160444385L;
        fo.hfre[48] = -6116900589418076715L;
        fo.hfre[49] = 8598435356908881525L;
        fo.hfre[50] = 7596694447567793421L;
        fo.hfre[51] = -5244365858121655013L;
        fo.hfre[52] = 1663113373730309338L;
        fo.hfre[53] = 3714007786120546964L;
        fo.hfre[54] = -1255428448952137600L;
        fo.hfre[55] = -3601855088291665389L;
        fo.hfre[56] = -6542892393423655668L;
        fo.hfre[57] = -8499197290657572565L;
        fo.hfre[58] = -9145099100539930105L;
        fo.hfre[59] = -3106996111270730059L;
        fo.hfre[60] = -5604438850100650124L;
        fo.hfre[61] = 6287568948563471212L;
        fo.hfre[62] = -3505367284864640821L;
        fo.hfre[63] = -1413559633693192876L;
        fo.hfre[64] = -5078142017215567045L;
        fo.hfre[65] = -4279645287628036837L;
        fo.hfre[66] = 3175775534278777826L;
        fo.hfre[67] = -539970866647086240L;
        fo.hfre[68] = -2840945131460817804L;
        fo.hfre[69] = -592927535283695800L;
        fo.hfre[70] = 211840261077615062L;
        fo.hfre[71] = -1759199072978472896L;
        fo.hfre[72] = -4142526678753043471L;
        fo.hfre[73] = 2666049049156320476L;
        fo.hfre[74] = 252194763174797079L;
        fo.hfre[75] = 4855972972591009070L;
        fo.hfre[76] = 5638148562451944508L;
        fo.hfre[77] = -4054195203437529672L;
        fo.hfre[78] = 5596064218197303573L;
        fo.hfre[79] = -4013074011353966735L;
        fo.hfre[80] = -29985929313568562L;
        fo.hfre[81] = -523053931352354726L;
        fo.hfre[82] = -6615083742239569154L;
        fo.hfre[83] = -5644318040602092103L;
        fo.hfre[84] = 7608674066878777221L;
        fo.hfre[85] = -1821603477425797734L;
        fo.hfre[86] = 8564646488191025091L;
        fo.hfre[87] = -5384187272649120014L;
        fo.hfre[88] = -1768598861181110250L;
        fo.hfre[89] = 507294416375193103L;
        fo.hfre[90] = 566712714326925601L;
        fo.hfre[91] = -1081987840513748857L;
        fo.hfre[92] = -2112192815165527158L;
        fo.hfre[93] = -8485990375577943936L;
        fo.hfre[94] = -534151599380683666L;
        fo.hfre[95] = -5998325788320806158L;
        fo.hfre[96] = 4493178275408657306L;
        fo.hfre[97] = -1679740082950641745L;
        fo.hfre[98] = -2453597715838505282L;
        fo.hfre[99] = -6463025844149892725L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void appendReplacement(class_5250 var0, List<fo$Segment> var1_1, String var2_2, int var3_3, int var4_4, Integer var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgzk", hfrd(int ), (int)259)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fo.hfla("hgzl", hfks(int ), (int)386)) break;
            v0 /* !! */  = (long)fo.hfla("hgzm", hfks(int ), (int)387);
        }
        var12_6 = fo.c;
        v1 /* !! */  = fo.og;
        if (true) ** GOTO lbl11
        block62: while (true) {
            v1 /* !! */  = (long)(v2 - fo.hfla("hgzn", hfrd(int ), (int)260));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1825662926: {
                    v2 = fo.hfla("hgzo", hfrd(int ), (int)261);
                    continue block62;
                }
                case -1274565829: {
                    break block62;
                }
                case -525506227: {
                    v2 = fo.hfla("hgzp", hfrd(int ), (int)262);
                    continue block62;
                }
            }
            break;
        }
        var11_7 /* !! */  = fo.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgzq", hfrd(int ), (int)263)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fo.hfla("hgzr", hfks(int ), (int)388)) break;
            v3 /* !! */  = (long)fo.hfla("hgzs", hfks(int ), (int)389);
        }
        var10_8 = fo.a;
        if (var12_6) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var10_8) ** GOTO lbl29
        if (var11_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_8) ** GOTO lbl29
                v4 = fo.hfla("hgzt", hfks(int ), (int)390);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgzu", hfrd(int ), (int)264)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fo.hfla("hgzv", hfks(int ), (int)391)) break;
                    v5 /* !! */  = (long)fo.hfla("hgzw", hfks(int ), (int)392);
                }
                var6_9 = Math.max((int)v4, var4_4 - var3_3);
                if (var10_8 || var10_8) ** GOTO lbl29
                var7_10 = fo.hfla("hgzx", hfks(int ), (int)393);
                if (var10_8) ** GOTO lbl29
                do {
                    if (var10_8 || var10_8) ** GOTO lbl29
                    v6 /* !! */  = fo.og;
                    if (true) ** GOTO lbl52
                    block67: while (true) {
                        v6 /* !! */  = (long)(fo.hfla("hgzz", hfrd(int ), (int)266) - fo.hfla("hgzy", hfrd(int ), (int)265));
lbl52:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1274565829: {
                                break block67;
                            }
                            case -832817621: {
                                continue block67;
                            }
                        }
                        break;
                    }
                    if (var7_10 >= var2_2.length()) ** GOTO lbl183
                    if (var10_8 || var10_8) ** GOTO lbl29
                    v7 = var6_9 - fo.hfla("hhaa", hfks(int ), (int)394);
                    v8 = var7_10 * var6_9;
                    v9 = fo.hfla("hhab", hfks(int ), (int)395);
                    v10 /* !! */  = fo.og;
                    if (true) ** GOTO lbl66
                    block68: while (true) {
                        v10 /* !! */  = (long)(fo.hfla("hhad", hfrd(int ), (int)268) - fo.hfla("hhac", hfrd(int ), (int)267));
lbl66:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1274565829: {
                                break block68;
                            }
                            case 961910200: {
                                continue block68;
                            }
                        }
                        break;
                    }
                    v11 = var2_2.length();
                    v12 /* !! */  = fo.og;
                    if (true) ** GOTO lbl76
                    block69: while (true) {
                        v12 /* !! */  = (long)(v13 - fo.hfla("hhae", hfrd(int ), (int)269));
lbl76:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1729754393: {
                                v13 = fo.hfla("hhaf", hfrd(int ), (int)270);
                                continue block69;
                            }
                            case -1274565829: {
                                break block69;
                            }
                            case -202871711: {
                                v13 = fo.hfla("hhag", hfrd(int ), (int)271);
                                continue block69;
                            }
                            case 419591449: {
                                v13 = fo.hfla("hhah", hfrd(int ), (int)272);
                                continue block69;
                            }
                        }
                        break;
                    }
                    v14 = v8 / Math.max((int)v9, v11);
                    v15 /* !! */  = fo.og;
                    if (true) ** GOTO lbl93
                    block70: while (true) {
                        v15 /* !! */  = (long)(v16 - fo.hfla("hhai", hfrd(int ), (int)273));
lbl93:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case -1931220823: {
                                v16 = fo.hfla("hhaj", hfrd(int ), (int)274);
                                continue block70;
                            }
                            case -1274565829: {
                                break block70;
                            }
                            case 565683396: {
                                v16 = fo.hfla("hhak", hfrd(int ), (int)275);
                                continue block70;
                            }
                            case 1667697996: {
                                v16 = fo.hfla("hhal", hfrd(int ), (int)276);
                                continue block70;
                            }
                        }
                        break;
                    }
                    var8_11 = var3_3 + Math.min(v7, (int)v14);
                    if (var10_8 || var10_8) ** GOTO lbl29
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hham", hfrd(int ), (int)277)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == fo.hfla("hhan", hfks(int ), (int)396)) break;
                        v17 /* !! */  = (long)fo.hfla("hhao", hfks(int ), (int)397);
                    }
                    var9_12 = fo.styleAt(var1_1, var8_11);
                    if (var10_8 || var10_8) ** GOTO lbl29
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hhap", hfrd(int ), (int)278)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == fo.hfla("hhaq", hfks(int ), (int)398)) break;
                        v18 /* !! */  = (long)fo.hfla("hhar", hfks(int ), (int)399);
                    }
                    v19 = var2_2.charAt((int)var7_10);
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_5 = fo.og - fo.hfla("hhas", hfrd(int ), (int)279)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == fo.hfla("hhat", hfks(int ), (int)400)) break;
                        v20 /* !! */  = (long)fo.hfla("hhau", hfks(int ), (int)401);
                    }
                    v21 = String.valueOf(v19);
                    v22 /* !! */  = fo.og;
                    if (true) ** GOTO lbl130
                    block74: while (true) {
                        v22 /* !! */  = (long)(fo.hfla("hhaw", hfrd(int ), (int)281) - fo.hfla("hhav", hfrd(int ), (int)280));
lbl130:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -1274565829: {
                                break block74;
                            }
                            case -1261120988: {
                                continue block74;
                            }
                        }
                        break;
                    }
                    v23 = class_2561.method_43470((String)v21);
                    if (var5_5 != null) ** GOTO lbl141
                    v24 = var9_12;
                    if (var12_6) {
                        throw null;
                    }
                    ** GOTO lbl157
lbl141:
                    // 1 sources

                    while (true) {
                        if ((v25 /* !! */  = (cfr_temp_6 = fo.og - fo.hfla("hhax", hfrd(int ), (int)282)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v25 /* !! */  == fo.hfla("hhay", hfks(int ), (int)402)) break;
                        v25 /* !! */  = (long)fo.hfla("hhaz", hfks(int ), (int)403);
                    }
                    v26 = var5_5;
                    v27 /* !! */  = fo.og;
                    if (true) ** GOTO lbl151
                    block76: while (true) {
                        v27 /* !! */  = (long)(fo.hfla("hhbb", hfrd(int ), (int)284) - fo.hfla("hhba", hfrd(int ), (int)283));
lbl151:
                        // 2 sources

                        switch ((int)v27 /* !! */ ) {
                            case -1274565829: {
                                break block76;
                            }
                            case 1918644164: {
                                continue block76;
                            }
                        }
                        break;
                    }
                    v24 = var9_12.method_36139(v26);
lbl157:
                    // 2 sources

                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_7 = fo.og - fo.hfla("hhbc", hfrd(int ), (int)285)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == fo.hfla("hhbd", hfks(int ), (int)404)) break;
                        v28 /* !! */  = (long)fo.hfla("hhbe", hfks(int ), (int)405);
                    }
                    v29 = v23.method_10862(v24);
                    v30 /* !! */  = fo.og;
                    if (true) ** GOTO lbl167
                    block78: while (true) {
                        v30 /* !! */  = (long)(v31 - fo.hfla("hhbf", hfrd(int ), (int)286));
lbl167:
                        // 2 sources

                        switch ((int)v30 /* !! */ ) {
                            case -1274565829: {
                                break block78;
                            }
                            case -642819987: {
                                v31 = fo.hfla("hhbg", hfrd(int ), (int)287);
                                continue block78;
                            }
                            case 568478197: {
                                v31 = fo.hfla("hhbh", hfrd(int ), (int)288);
                                continue block78;
                            }
                        }
                        break;
                    }
                    var0.method_10852((class_2561)v29);
                    if (var10_8 || var10_8) ** GOTO lbl29
                    ++var7_10;
                    if (var10_8) ** GOTO lbl29
                } while (!var12_6);
                throw null;
lbl183:
                // 1 sources

                if (!var10_8 && !var10_8) ** break;
                ** continue;
                return;
            }
lbl186:
            // 3 sources

            case 0: {
                var11_7 /* !! */  = (int)fo.hfla("hhbi", hfks(int ), (int)406);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 1: {
                var11_7 /* !! */  = (int)fo.hfla("hhbj", hfks(int ), (int)407);
                if (!var12_6) ** GOTO lbl186
                throw null;
            }
            case 2: {
                var11_7 /* !! */  = (int)fo.hfla("hhbk", hfks(int ), (int)408);
                if (var12_6) {
                    throw null;
                }
            }
lbl199:
            // 5 sources

            case 3: {
                var11_7 /* !! */  = (int)fo.hfla("hhbl", hfks(int ), (int)409);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl204:
            // 3 sources

            case 4: {
                var11_7 /* !! */  = (int)fo.hfla("hhbm", hfks(int ), (int)410);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl209:
            // 2 sources

            case 5: {
                var11_7 /* !! */  = (int)fo.hfla("hhbn", hfks(int ), (int)411);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 6: {
                var11_7 /* !! */  = (int)fo.hfla("hhbo", hfks(int ), (int)412);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl219:
            // 3 sources

            case 7: {
                do {
                    var11_7 /* !! */  = (int)fo.hfla("hhbp", hfks(int ), (int)413);
                } while (!var12_6);
                throw null;
            }
lbl224:
            // 2 sources

            case 8: {
                var11_7 /* !! */  = (int)fo.hfla("hhbq", hfks(int ), (int)414);
                if (!var12_6) ** GOTO lbl209
                throw null;
            }
            case 9: {
                var11_7 /* !! */  = (int)fo.hfla("hhbr", hfks(int ), (int)415);
                if (!var12_6) ** GOTO lbl186
                throw null;
            }
lbl232:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_7 /* !! */  = (int)fo.hfla("hhbs", hfks(int ), (int)416);
                    if (!var12_6) ** GOTO lbl199
                    throw null;
                }
            }
            case 11: {
                var11_7 /* !! */  = (int)fo.hfla("hhbt", hfks(int ), (int)417);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 12: {
                var11_7 /* !! */  = (int)fo.hfla("hhbu", hfks(int ), (int)418);
                if (!var12_6) ** GOTO lbl204
                throw null;
            }
lbl246:
            // 2 sources

            case 13: {
                var11_7 /* !! */  = (int)fo.hfla("hhbv", hfks(int ), (int)419);
                if (!var12_6) ** GOTO lbl232
                throw null;
            }
            case 14: {
                var11_7 /* !! */  = (int)fo.hfla("hhbw", hfks(int ), (int)420);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl255:
            // 2 sources

            case 15: {
                var11_7 /* !! */  = (int)fo.hfla("hhbx", hfks(int ), (int)421);
                if (var12_6) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl260:
            // 2 sources

            case 16: {
                var11_7 /* !! */  = (int)fo.hfla("hhby", hfks(int ), (int)422);
                if (!var12_6) ** GOTO lbl204
                throw null;
            }
lbl264:
            // 2 sources

            case 17: {
                var11_7 /* !! */  = (int)fo.hfla("hhbz", hfks(int ), (int)423);
                if (!var12_6) ** GOTO lbl199
                throw null;
            }
lbl268:
            // 2 sources

            case 18: {
                var11_7 /* !! */  = (int)fo.hfla("hhca", hfks(int ), (int)424);
                if (!var12_6) ** GOTO lbl246
                throw null;
            }
            case 19: {
                do {
                    var11_7 /* !! */  = (int)fo.hfla("hhcb", hfks(int ), (int)425);
                } while (!var12_6);
                throw null;
            }
            case 20: 
        }
        var11_7 /* !! */  = (int)fo.hfla("hhcc", hfks(int ), (int)426);
        ** while (!var12_6)
lbl280:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_2561 filterOwnTag(class_2561 var0) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block60: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hfwk", hfrd(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block60;
                }
                case 720543032: {
                    v1 = fo.hfla("hfwl", hfrd(int ), (int)32);
                    continue block60;
                }
                case 1378948752: {
                    v1 = fo.hfla("hfwm", hfrd(int ), (int)33);
                    continue block60;
                }
                case 1669402625: {
                    v1 = fo.hfla("hfwn", hfrd(int ), (int)34);
                    continue block60;
                }
            }
            break;
        }
        var5_1 = fo.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hfwo", hfrd(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fo.hfla("hfwp", hfks(int ), (int)105)) break;
            v2 /* !! */  = (long)fo.hfla("hfwq", hfks(int ), (int)106);
        }
        var4_2 /* !! */  = fo.b;
        v3 /* !! */  = fo.og;
        if (true) ** GOTO lbl28
        block62: while (true) {
            v3 /* !! */  = (long)(fo.hfla("hfwt", hfrd(int ), (int)37) - fo.hfla("hfwr", hfrd(int ), (int)36));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1285548953: {
                    continue block62;
                }
                case -1274565829: {
                    break block62;
                }
            }
            break;
        }
        var3_3 = fo.a;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_1) {
                    throw null;
lbl39:
                    // 7 sources

                    return null;
                }
                if (var3_3 || var3_3) ** GOTO lbl39
                v4 /* !! */  = fo.og;
                if (true) ** GOTO lbl46
                block64: while (true) {
                    v4 /* !! */  = (long)(v5 - fo.hfla("hfwu", hfrd(int ), (int)38));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1274565829: {
                            break block64;
                        }
                        case -1151562493: {
                            v5 = fo.hfla("hfwv", hfrd(int ), (int)39);
                            continue block64;
                        }
                        case 2050933446: {
                            v5 = fo.hfla("hfww", hfrd(int ), (int)40);
                            continue block64;
                        }
                    }
                    break;
                }
                var1_4 = fo.instance;
                if (var3_3 || var3_3) ** GOTO lbl39
                v6 /* !! */  = fo.og;
                if (true) ** GOTO lbl61
                block65: while (true) {
                    v6 /* !! */  = (long)(v7 - fo.hfla("hfwx", hfrd(int ), (int)41));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1274565829: {
                            break block65;
                        }
                        case -1195346473: {
                            v7 = fo.hfla("hfwy", hfrd(int ), (int)42);
                            continue block65;
                        }
                        case 656667761: {
                            v7 = fo.hfla("hfxb", hfrd(int ), (int)43);
                            continue block65;
                        }
                        case 1634953710: {
                            v7 = fo.hfla("hfxc", hfrd(int ), (int)44);
                            continue block65;
                        }
                    }
                    break;
                }
                var2_5 = class_310.method_1551();
                if (var3_3 || var3_3) ** GOTO lbl39
                v8 /* !! */  = fo.og;
                if (true) ** GOTO lbl79
                block66: while (true) {
                    v8 /* !! */  = (long)(v9 - fo.hfla("hfxd", hfrd(int ), (int)45));
lbl79:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1763313712: {
                            v9 = fo.hfla("hfxe", hfrd(int ), (int)46);
                            continue block66;
                        }
                        case -1274565829: {
                            break block66;
                        }
                        case -834405041: {
                            v9 = fo.hfla("hfxg", hfrd(int ), (int)47);
                            continue block66;
                        }
                        case 361627928: {
                            v9 = fo.hfla("hfxi", hfrd(int ), (int)48);
                            continue block66;
                        }
                    }
                    break;
                }
                if (!var1_4.active()) ** GOTO lbl156
                if (var3_3) ** GOTO lbl39
                if (var0 == null) ** GOTO lbl156
                if (var3_3) ** GOTO lbl39
                v10 /* !! */  = fo.og;
                if (true) ** GOTO lbl99
                block67: while (true) {
                    v10 /* !! */  = (long)(v11 - fo.hfla("hfxo", hfrd(int ), (int)49));
lbl99:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1274565829: {
                            break block67;
                        }
                        case 907989024: {
                            v11 = fo.hfla("hfxp", hfrd(int ), (int)50);
                            continue block67;
                        }
                        case 1629030239: {
                            v11 = fo.hfla("hfxq", hfrd(int ), (int)51);
                            continue block67;
                        }
                        case 2086545343: {
                            v11 = fo.hfla("hfxr", hfrd(int ), (int)52);
                            continue block67;
                        }
                    }
                    break;
                }
                if (var2_5.field_1724 == null) ** GOTO lbl156
                if (var3_3 || var3_3) ** GOTO lbl39
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hfxt", hfrd(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == fo.hfla("hfxu", hfks(int ), (int)107)) break;
                    v12 /* !! */  = (long)fo.hfla("hfyb", hfks(int ), (int)108);
                }
                v13 = var2_5.field_1724;
                v14 /* !! */  = fo.og;
                if (true) ** GOTO lbl123
                block69: while (true) {
                    v14 /* !! */  = (long)(v15 - fo.hfla("hfyc", hfrd(int ), (int)54));
lbl123:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1274565829: {
                            break block69;
                        }
                        case -1125461659: {
                            v15 = fo.hfla("hfyd", hfrd(int ), (int)55);
                            continue block69;
                        }
                        case 557875586: {
                            v15 = fo.hfla("hfye", hfrd(int ), (int)56);
                            continue block69;
                        }
                    }
                    break;
                }
                v16 = v13.method_7334();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hfyf", hfrd(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fo.hfla("hfyk", hfks(int ), (int)109)) break;
                    v17 /* !! */  = (long)fo.hfla("hfyl", hfks(int ), (int)110);
                }
                v18 = v16.name();
                v19 /* !! */  = fo.og;
                if (true) ** GOTO lbl143
                block71: while (true) {
                    v19 /* !! */  = (long)(v20 - fo.hfla("hfym", hfrd(int ), (int)58));
lbl143:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1274565829: {
                            break block71;
                        }
                        case 981055818: {
                            v20 = fo.hfla("hfyn", hfrd(int ), (int)59);
                            continue block71;
                        }
                        case 2012661096: {
                            v20 = fo.hfla("hfyo", hfrd(int ), (int)60);
                            continue block71;
                        }
                    }
                    break;
                }
                v21 = var1_4.filterIdentity(var0, v18);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl159
lbl156:
                // 3 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v21 = var0;
lbl159:
                // 2 sources

                return v21;
            }
lbl160:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)fo.hfla("hfyq", hfks(int ), (int)111);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl165:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)fo.hfla("hfys", hfks(int ), (int)112);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl170:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fo.hfla("hfyy", hfks(int ), (int)113);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl202
                    break;
                }
            }
lbl176:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)fo.hfla("hfyz", hfks(int ), (int)114);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 4: {
                var4_2 /* !! */  = (int)fo.hfla("hfza", hfks(int ), (int)115);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl186:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)fo.hfla("hfzb", hfks(int ), (int)116);
                if (!var5_1) ** GOTO lbl165
                throw null;
            }
lbl190:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)fo.hfla("hfzc", hfks(int ), (int)117);
                if (var5_1) {
                    throw null;
                }
            }
lbl194:
            // 4 sources

            case 7: {
                var4_2 /* !! */  = (int)fo.hfla("hfze", hfks(int ), (int)118);
                if (!var5_1) ** GOTO lbl160
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)fo.hfla("hfzg", hfks(int ), (int)119);
                if (!var5_1) ** GOTO lbl160
                throw null;
            }
lbl202:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)fo.hfla("hfzm", hfks(int ), (int)120);
                if (!var5_1) ** GOTO lbl186
                throw null;
            }
lbl206:
            // 2 sources

            case 10: {
                do {
                    var4_2 /* !! */  = (int)fo.hfla("hfzn", hfks(int ), (int)121);
                } while (!var5_1);
                throw null;
            }
lbl211:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)fo.hfla("hfzo", hfks(int ), (int)122);
                if (!var5_1) ** GOTO lbl206
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)fo.hfla("hfzp", hfks(int ), (int)123);
                if (!var5_1) ** GOTO lbl202
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)fo.hfla("hfzq", hfks(int ), (int)124);
                if (!var5_1) ** GOTO lbl170
                throw null;
            }
            case 14: 
        }
        var4_2 /* !! */  = (int)fo.hfla("hfzs", hfks(int ), (int)125);
        ** while (!var5_1)
lbl226:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhqj() {
        fo.hfre[100] = 471598393811079406L;
        fo.hfre[101] = -3058579141128431056L;
        fo.hfre[102] = 9070365530447695751L;
        fo.hfre[103] = 7300684114392180252L;
        fo.hfre[104] = -8223488488895885518L;
        fo.hfre[105] = 6182372482737509204L;
        fo.hfre[106] = 1707664190687553840L;
        fo.hfre[107] = -5088918839729050625L;
        fo.hfre[108] = -8062000658618475840L;
        fo.hfre[109] = 1949860768817652445L;
        fo.hfre[110] = 8626789952707738057L;
        fo.hfre[111] = -6495674059821850264L;
        fo.hfre[112] = -903346844086792834L;
        fo.hfre[113] = 4245491383502022550L;
        fo.hfre[114] = 7656666644576181623L;
        fo.hfre[115] = 8487397234001906468L;
        fo.hfre[116] = -285551498484497807L;
        fo.hfre[117] = 5243406648868561171L;
        fo.hfre[118] = -5838144543965281316L;
        fo.hfre[119] = -6716306333565977626L;
        fo.hfre[120] = 8582656782135120127L;
        fo.hfre[121] = -7899604640129776530L;
        fo.hfre[122] = -8168155248387040645L;
        fo.hfre[123] = 5322330480795013539L;
        fo.hfre[124] = -7038538415285101926L;
        fo.hfre[125] = -2506004940410357028L;
        fo.hfre[126] = -1762056467648938782L;
        fo.hfre[127] = 1301162480870792297L;
        fo.hfre[128] = -739020190989495116L;
        fo.hfre[129] = 7268240372064168109L;
        fo.hfre[130] = 3052648665246124427L;
        fo.hfre[131] = 9183177131867265853L;
        fo.hfre[132] = 142810180512703415L;
        fo.hfre[133] = -2272831923790933904L;
        fo.hfre[134] = -3652433238246896512L;
        fo.hfre[135] = -8730060999201174399L;
        fo.hfre[136] = -4612910692490745854L;
        fo.hfre[137] = -6303756485654590794L;
        fo.hfre[138] = 4379788530056013679L;
        fo.hfre[139] = -7109690767438136949L;
        fo.hfre[140] = -4130833590715752319L;
        fo.hfre[141] = 5405529535862961566L;
        fo.hfre[142] = -7827663562731125007L;
        fo.hfre[143] = -4721960212996183739L;
        fo.hfre[144] = 1269550683559115539L;
        fo.hfre[145] = 3853034642710578610L;
        fo.hfre[146] = -5156190845188108142L;
        fo.hfre[147] = 1534561074573458780L;
        fo.hfre[148] = -4623162163502313113L;
        fo.hfre[149] = 8012652626768144019L;
        fo.hfre[150] = 9060485698418612657L;
        fo.hfre[151] = -477585483153882331L;
        fo.hfre[152] = 5712247987540364795L;
        fo.hfre[153] = -8969889942253467099L;
        fo.hfre[154] = 1675763318627434939L;
        fo.hfre[155] = 5547640510292231848L;
        fo.hfre[156] = -5050364778015762057L;
        fo.hfre[157] = -4565919692874612137L;
        fo.hfre[158] = 7744832411706177270L;
        fo.hfre[159] = 5720264138470994798L;
        fo.hfre[160] = 4888696802666940814L;
        fo.hfre[161] = 6382144978547862567L;
        fo.hfre[162] = 5076843792521087056L;
        fo.hfre[163] = 1628596731475212021L;
        fo.hfre[164] = 8208518315670393761L;
        fo.hfre[165] = 5456907080201315852L;
        fo.hfre[166] = -4560096175807191456L;
        fo.hfre[167] = 1762115699931401304L;
        fo.hfre[168] = -6342410770690468L;
        fo.hfre[169] = 2225721956358634201L;
        fo.hfre[170] = -2579354446281541554L;
        fo.hfre[171] = -6586703621280353552L;
        fo.hfre[172] = -6253749367046460386L;
        fo.hfre[173] = -3977188759208450098L;
        fo.hfre[174] = -2172820868190148601L;
        fo.hfre[175] = 2821548591862553186L;
        fo.hfre[176] = 356775355642275723L;
        fo.hfre[177] = 1911674798575031456L;
        fo.hfre[178] = -309909433913812995L;
        fo.hfre[179] = 180767231566532345L;
        fo.hfre[180] = 7157460105299849357L;
        fo.hfre[181] = -4560612705829427657L;
        fo.hfre[182] = 8043271130047826680L;
        fo.hfre[183] = -4019470794690899652L;
        fo.hfre[184] = -6124645794207889404L;
        fo.hfre[185] = 4092468262292757987L;
        fo.hfre[186] = 8722281820798791746L;
        fo.hfre[187] = -9176010161940818535L;
        fo.hfre[188] = 3731721809138474093L;
        fo.hfre[189] = 461072967117317808L;
        fo.hfre[190] = -9171392204489194164L;
        fo.hfre[191] = -7593882895735173683L;
        fo.hfre[192] = -770875828975810739L;
        fo.hfre[193] = -7840130881673516027L;
        fo.hfre[194] = 3000794986082826983L;
        fo.hfre[195] = -4857442428912699038L;
        fo.hfre[196] = 4563965780098948492L;
        fo.hfre[197] = 3944863876494553958L;
        fo.hfre[198] = -7862279869623393503L;
        fo.hfre[199] = 2620978509088746064L;
    }

    private static /* synthetic */ void hhld() {
        fo.hfkw[400] = 384904870;
        fo.hfkw[401] = 471759387;
        fo.hfkw[402] = 95683229;
        fo.hfkw[403] = -2125271610;
        fo.hfkw[404] = 831299052;
        fo.hfkw[405] = -2115280042;
        fo.hfkw[406] = -1942206112;
        fo.hfkw[407] = -431507764;
        fo.hfkw[408] = 1265367356;
        fo.hfkw[409] = 1750434001;
        fo.hfkw[410] = 1288619201;
        fo.hfkw[411] = 328466768;
        fo.hfkw[412] = 2086408559;
        fo.hfkw[413] = 1039234482;
        fo.hfkw[414] = 322975347;
        fo.hfkw[415] = -2049796816;
        fo.hfkw[416] = 707234721;
        fo.hfkw[417] = -1084306320;
        fo.hfkw[418] = 1515372908;
        fo.hfkw[419] = -668763031;
        fo.hfkw[420] = -662620047;
        fo.hfkw[421] = 795639346;
        fo.hfkw[422] = 938698245;
        fo.hfkw[423] = -1585637710;
        fo.hfkw[424] = 36690206;
        fo.hfkw[425] = 673602185;
        fo.hfkw[426] = 1446916143;
        fo.hfkw[427] = 53212814;
        fo.hfkw[428] = -911152254;
        fo.hfkw[429] = -982025101;
        fo.hfkw[430] = -555089203;
        fo.hfkw[431] = -268073276;
        fo.hfkw[432] = -1096721693;
        fo.hfkw[433] = 930858617;
        fo.hfkw[434] = -400145040;
        fo.hfkw[435] = 1325741018;
        fo.hfkw[436] = -1501259997;
        fo.hfkw[437] = 855212818;
        fo.hfkw[438] = 1983616772;
        fo.hfkw[439] = 1073592937;
        fo.hfkw[440] = 880151147;
        fo.hfkw[441] = -276532633;
        fo.hfkw[442] = -598824471;
        fo.hfkw[443] = 664987700;
        fo.hfkw[444] = 190071280;
        fo.hfkw[445] = -1772974485;
        fo.hfkw[446] = -501120949;
        fo.hfkw[447] = -429641365;
        fo.hfkw[448] = -1286073597;
        fo.hfkw[449] = 1252472598;
        fo.hfkw[450] = 847512115;
        fo.hfkw[451] = 867024258;
        fo.hfkw[452] = -1010656377;
        fo.hfkw[453] = -33371798;
        fo.hfkw[454] = 1085045074;
        fo.hfkw[455] = -1385138339;
        fo.hfkw[456] = -1752669739;
        fo.hfkw[457] = -1317693987;
        fo.hfkw[458] = -1651255541;
        fo.hfkw[459] = 551148845;
        fo.hfkw[460] = 1949535446;
        fo.hfkw[461] = 1480054245;
        fo.hfkw[462] = 1218943061;
        fo.hfkw[463] = -1371453245;
        fo.hfkw[464] = 431261741;
        fo.hfkw[465] = 154529364;
        fo.hfkw[466] = 1982702407;
        fo.hfkw[467] = -539195486;
        fo.hfkw[468] = 270398109;
        fo.hfkw[469] = 1324094184;
        fo.hfkw[470] = -11001208;
        fo.hfkw[471] = 678525270;
        fo.hfkw[472] = -81367505;
        fo.hfkw[473] = -2138351136;
        fo.hfkw[474] = 801802253;
        fo.hfkw[475] = -14723570;
        fo.hfkw[476] = -805251100;
        fo.hfkw[477] = 1545138367;
        fo.hfkw[478] = -1503356478;
        fo.hfkw[479] = 526412463;
        fo.hfkw[480] = -1345343920;
        fo.hfkw[481] = 921964267;
        fo.hfkw[482] = 1010033467;
        fo.hfkw[483] = -1285932611;
        fo.hfkw[484] = -1045133686;
        fo.hfkw[485] = 637099521;
        fo.hfkw[486] = -1665635058;
        fo.hfkw[487] = 1912318385;
        fo.hfkw[488] = 114307808;
        fo.hfkw[489] = -14247092;
        fo.hfkw[490] = 811271071;
        fo.hfkw[491] = -1455327940;
        fo.hfkw[492] = 687091249;
        fo.hfkw[493] = -1569109967;
        fo.hfkw[494] = -853691577;
        fo.hfkw[495] = 735370353;
        fo.hfkw[496] = 81618749;
        fo.hfkw[497] = 1097267699;
        fo.hfkw[498] = 826139784;
        fo.hfkw[499] = -2103492830;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_2561 replace(class_2561 var0, Pattern var1_1, String var2_2) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(fo.hfla("hgxm", hfrd(int ), (int)254) - fo.hfla("hgxl", hfrd(int ), (int)253));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2035730450: {
                    continue block14;
                }
                case -1274565829: {
                    break block14;
                }
            }
            break;
        }
        var5_3 = fo.c;
        v1 /* !! */  = fo.og;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(fo.hfla("hgxo", hfrd(int ), (int)256) - fo.hfla("hgxn", hfrd(int ), (int)255));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1274565829: {
                    break block15;
                }
                case -169759528: {
                    continue block15;
                }
            }
            break;
        }
        var4_4 /* !! */  = fo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgxp", hfrd(int ), (int)257)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo.hfla("hgxq", hfks(int ), (int)341)) break;
            v2 /* !! */  = (long)fo.hfla("hgxr", hfks(int ), (int)342);
        }
        var3_5 = fo.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
                    return null;
                }
                if (var3_5 || var3_5) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgxs", hfrd(int ), (int)258)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo.hfla("hgxt", hfks(int ), (int)343)) break;
                    v3 /* !! */  = (long)fo.hfla("hgxu", hfks(int ), (int)344);
                }
                return fo.replace(var0, var1_1, var2_2, null);
            }
            case 0: {
                do {
                    var4_4 /* !! */  = (int)fo.hfla("hgxv", hfks(int ), (int)345);
                } while (!var5_3);
                throw null;
            }
lbl48:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)fo.hfla("hgxw", hfks(int ), (int)346);
                    if (!var5_3) break block8;
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)fo.hfla("hgxx", hfks(int ), (int)347);
                if (!var5_3) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)fo.hfla("hgxy", hfks(int ), (int)348);
        ** while (!var5_3)
lbl60:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hfrd(int n2) {
        return hfre[n2] ^ hfrf[n2];
    }

    private static /* synthetic */ void hhla() {
        fo.hfkw[100] = 48642818;
        fo.hfkw[101] = 1416891421;
        fo.hfkw[102] = -229509605;
        fo.hfkw[103] = 847576849;
        fo.hfkw[104] = 1405851500;
        fo.hfkw[105] = 1759678724;
        fo.hfkw[106] = -555361084;
        fo.hfkw[107] = -1933853105;
        fo.hfkw[108] = -2037046813;
        fo.hfkw[109] = -530721892;
        fo.hfkw[110] = -747041830;
        fo.hfkw[111] = -291977327;
        fo.hfkw[112] = -349292265;
        fo.hfkw[113] = 18191092;
        fo.hfkw[114] = 2123059977;
        fo.hfkw[115] = -398767924;
        fo.hfkw[116] = -1548006178;
        fo.hfkw[117] = -421306998;
        fo.hfkw[118] = -1046640921;
        fo.hfkw[119] = -379576014;
        fo.hfkw[120] = -1291583541;
        fo.hfkw[121] = -227490658;
        fo.hfkw[122] = -169720086;
        fo.hfkw[123] = 865610645;
        fo.hfkw[124] = 136748631;
        fo.hfkw[125] = -908390817;
        fo.hfkw[126] = 1293961309;
        fo.hfkw[127] = -420328399;
        fo.hfkw[128] = 107631506;
        fo.hfkw[129] = -1081096638;
        fo.hfkw[130] = -292450570;
        fo.hfkw[131] = 828428063;
        fo.hfkw[132] = -1378239766;
        fo.hfkw[133] = 1204229451;
        fo.hfkw[134] = 1471610800;
        fo.hfkw[135] = 1132398412;
        fo.hfkw[136] = -1059986122;
        fo.hfkw[137] = -300722387;
        fo.hfkw[138] = -321454891;
        fo.hfkw[139] = -2100794984;
        fo.hfkw[140] = 82996185;
        fo.hfkw[141] = 1978538790;
        fo.hfkw[142] = 2011112841;
        fo.hfkw[143] = -1883766472;
        fo.hfkw[144] = -2038741086;
        fo.hfkw[145] = 966862576;
        fo.hfkw[146] = 259569602;
        fo.hfkw[147] = 617124996;
        fo.hfkw[148] = 1443452876;
        fo.hfkw[149] = -1302624626;
        fo.hfkw[150] = -1236713120;
        fo.hfkw[151] = -1869422238;
        fo.hfkw[152] = -1038100811;
        fo.hfkw[153] = -1014919682;
        fo.hfkw[154] = -1596715507;
        fo.hfkw[155] = 761231203;
        fo.hfkw[156] = 2017979216;
        fo.hfkw[157] = -2083438207;
        fo.hfkw[158] = 1384385805;
        fo.hfkw[159] = 737443530;
        fo.hfkw[160] = 1996586294;
        fo.hfkw[161] = -2020779189;
        fo.hfkw[162] = 350029069;
        fo.hfkw[163] = -1357755611;
        fo.hfkw[164] = -699912703;
        fo.hfkw[165] = 443170718;
        fo.hfkw[166] = 1222510536;
        fo.hfkw[167] = 1731861563;
        fo.hfkw[168] = -10705623;
        fo.hfkw[169] = -1920386744;
        fo.hfkw[170] = -1533650765;
        fo.hfkw[171] = -525761274;
        fo.hfkw[172] = -1709173353;
        fo.hfkw[173] = -1209475378;
        fo.hfkw[174] = -1450092474;
        fo.hfkw[175] = -1589051761;
        fo.hfkw[176] = 2143620771;
        fo.hfkw[177] = -971437609;
        fo.hfkw[178] = -1278416283;
        fo.hfkw[179] = 498091625;
        fo.hfkw[180] = 1397108139;
        fo.hfkw[181] = 1611863629;
        fo.hfkw[182] = 1040413036;
        fo.hfkw[183] = -90763327;
        fo.hfkw[184] = 212606211;
        fo.hfkw[185] = -2040628411;
        fo.hfkw[186] = -36930925;
        fo.hfkw[187] = -772813990;
        fo.hfkw[188] = -71597016;
        fo.hfkw[189] = -700077077;
        fo.hfkw[190] = 1134651118;
        fo.hfkw[191] = -1502385651;
        fo.hfkw[192] = 319539003;
        fo.hfkw[193] = -731098222;
        fo.hfkw[194] = -1258498785;
        fo.hfkw[195] = -1939248915;
        fo.hfkw[196] = 982095737;
        fo.hfkw[197] = 1656132976;
        fo.hfkw[198] = -656209963;
        fo.hfkw[199] = -1685542524;
    }

    private static /* synthetic */ void hhtq() {
        fo.hfrf[200] = 3675053821749267692L;
        fo.hfrf[201] = -3525895854312855917L;
        fo.hfrf[202] = -8461664467158489712L;
        fo.hfrf[203] = -2854753488762467417L;
        fo.hfrf[204] = -1028860481427379357L;
        fo.hfrf[205] = -5289581339072168694L;
        fo.hfrf[206] = -5088221734623768159L;
        fo.hfrf[207] = 37041589029180200L;
        fo.hfrf[208] = 1219420549684421430L;
        fo.hfrf[209] = 5940637650348523827L;
        fo.hfrf[210] = -1098643146555385929L;
        fo.hfrf[211] = -596513458529392708L;
        fo.hfrf[212] = -2726107636770016303L;
        fo.hfrf[213] = 3169498423986400865L;
        fo.hfrf[214] = 2480898854243351533L;
        fo.hfrf[215] = 1468100290195249525L;
        fo.hfrf[216] = 6240679448386304791L;
        fo.hfrf[217] = 5359258401373059468L;
        fo.hfrf[218] = -7806546684737116851L;
        fo.hfrf[219] = 1597894910407744833L;
        fo.hfrf[220] = -4741595081266551945L;
        fo.hfrf[221] = 2683763052150364861L;
        fo.hfrf[222] = 2649971648252533152L;
        fo.hfrf[223] = 5976652829380879114L;
        fo.hfrf[224] = -7003959286351655844L;
        fo.hfrf[225] = 8181164462451556765L;
        fo.hfrf[226] = -6183027627142524432L;
        fo.hfrf[227] = -1581829672245426542L;
        fo.hfrf[228] = -926086756701050498L;
        fo.hfrf[229] = 2045915816079350799L;
        fo.hfrf[230] = 4204653731724158997L;
        fo.hfrf[231] = -66397525384164476L;
        fo.hfrf[232] = 2835600365381326524L;
        fo.hfrf[233] = -1126293864723136531L;
        fo.hfrf[234] = 8765468283470729895L;
        fo.hfrf[235] = -7145746475575948076L;
        fo.hfrf[236] = -2762838248856265073L;
        fo.hfrf[237] = 3792015262080372962L;
        fo.hfrf[238] = -7301121019560223409L;
        fo.hfrf[239] = 3478764328604621792L;
        fo.hfrf[240] = 8618392379406856865L;
        fo.hfrf[241] = -7365483366662600937L;
        fo.hfrf[242] = -6376590762829366848L;
        fo.hfrf[243] = -5110729294723227451L;
        fo.hfrf[244] = -277795212670704772L;
        fo.hfrf[245] = 7312291842019772029L;
        fo.hfrf[246] = -3833000432053191695L;
        fo.hfrf[247] = -5494743159010716520L;
        fo.hfrf[248] = -5693798469747864840L;
        fo.hfrf[249] = -7776652773199020961L;
        fo.hfrf[250] = 5083881286866538361L;
        fo.hfrf[251] = -1638821190207623578L;
        fo.hfrf[252] = 5479533537291188641L;
        fo.hfrf[253] = -8714433068989542105L;
        fo.hfrf[254] = 4189808038824905665L;
        fo.hfrf[255] = -866967901347619284L;
        fo.hfrf[256] = -5766597987541218089L;
        fo.hfrf[257] = 2794102775323796188L;
        fo.hfrf[258] = -5208762409763081538L;
        fo.hfrf[259] = 9059907536765906118L;
        fo.hfrf[260] = 886737664115283068L;
        fo.hfrf[261] = -2153447785079066967L;
        fo.hfrf[262] = 4647083585614148186L;
        fo.hfrf[263] = -6193693020928332639L;
        fo.hfrf[264] = 5715183855496047269L;
        fo.hfrf[265] = -7466080110767626671L;
        fo.hfrf[266] = 4278695422045281438L;
        fo.hfrf[267] = -3475487388210749368L;
        fo.hfrf[268] = 1395500010300602699L;
        fo.hfrf[269] = -7540578664943713911L;
        fo.hfrf[270] = 4861156428967254870L;
        fo.hfrf[271] = 410478830046053593L;
        fo.hfrf[272] = 894550431175181600L;
        fo.hfrf[273] = -3038491312651769412L;
        fo.hfrf[274] = 277822443961148291L;
        fo.hfrf[275] = 7995933351717242931L;
        fo.hfrf[276] = 5144022012018485255L;
        fo.hfrf[277] = -3023912963882020491L;
        fo.hfrf[278] = 3295220417395304415L;
        fo.hfrf[279] = 5994142170424214056L;
        fo.hfrf[280] = -869295512939131432L;
        fo.hfrf[281] = -3714723961446972479L;
        fo.hfrf[282] = 7073794332147959034L;
        fo.hfrf[283] = -8435367110291936496L;
        fo.hfrf[284] = 6670119493483629668L;
        fo.hfrf[285] = 7437502983497491782L;
        fo.hfrf[286] = 8116789442236228075L;
        fo.hfrf[287] = -2220090611445606218L;
        fo.hfrf[288] = 8481273681775870748L;
        fo.hfrf[289] = 4818425192287033946L;
        fo.hfrf[290] = 8249868876730839860L;
        fo.hfrf[291] = 7685811053617572869L;
        fo.hfrf[292] = -5470926287612875820L;
        fo.hfrf[293] = -7740977825708764955L;
        fo.hfrf[294] = 6540605824428283670L;
        fo.hfrf[295] = -6060514075759480107L;
        fo.hfrf[296] = -6780775578150230796L;
        fo.hfrf[297] = -5449685279697180579L;
        fo.hfrf[298] = -2385572570599237645L;
        fo.hfrf[299] = 1765142700098846554L;
    }

    private static /* synthetic */ void hhlk() {
        fo.hfkw[500] = -1914234546;
        fo.hfkw[501] = 1473073715;
        fo.hfkw[502] = -2079611244;
        fo.hfkw[503] = -1417253548;
        fo.hfkw[504] = -1027190185;
        fo.hfkw[505] = 290996640;
        fo.hfkw[506] = 997666607;
        fo.hfkw[507] = 393088312;
        fo.hfkw[508] = 1317102085;
        fo.hfkw[509] = -1754565210;
        fo.hfkw[510] = 1144330522;
        fo.hfkw[511] = 1290638211;
        fo.hfkw[512] = -1402787952;
        fo.hfkw[513] = 2077989594;
        fo.hfkw[514] = -700065687;
        fo.hfkw[515] = 679200211;
        fo.hfkw[516] = 1848313858;
        fo.hfkw[517] = 639545549;
        fo.hfkw[518] = -125436563;
        fo.hfkw[519] = 1441768870;
        fo.hfkw[520] = 1305355190;
        fo.hfkw[521] = 1553518142;
        fo.hfkw[522] = 535674114;
        fo.hfkw[523] = 573326351;
        fo.hfkw[524] = -950029469;
        fo.hfkw[525] = -1421097004;
        fo.hfkw[526] = 1386998357;
        fo.hfkw[527] = -1726463839;
        fo.hfkw[528] = -1244824792;
        fo.hfkw[529] = -294267289;
        fo.hfkw[530] = -1191924812;
        fo.hfkw[531] = 2006536887;
        fo.hfkw[532] = -1418558386;
        fo.hfkw[533] = -72410912;
        fo.hfkw[534] = 1501363115;
        fo.hfkw[535] = -516978264;
        fo.hfkw[536] = 1400856079;
        fo.hfkw[537] = 534440909;
        fo.hfkw[538] = -1434243683;
        fo.hfkw[539] = 1364519886;
        fo.hfkw[540] = 224040945;
        fo.hfkw[541] = -127014970;
        fo.hfkw[542] = -313952042;
        fo.hfkw[543] = 1323748840;
        fo.hfkw[544] = -747526041;
        fo.hfkw[545] = -867946272;
        fo.hfkw[546] = -1978927268;
    }

    private static /* synthetic */ void hhls() {
        fo.hfky[0] = -1674911209;
        fo.hfky[1] = -1727079586;
        fo.hfky[2] = -1177878587;
        fo.hfky[3] = -276175890;
        fo.hfky[4] = -560966520;
        fo.hfky[5] = -58595503;
        fo.hfky[6] = 1926311603;
        fo.hfky[7] = -990236069;
        fo.hfky[8] = -612995629;
        fo.hfky[9] = 1377062279;
        fo.hfky[10] = 276312138;
        fo.hfky[11] = -951836574;
        fo.hfky[12] = 1879385803;
        fo.hfky[13] = -1482630198;
        fo.hfky[14] = -2038252767;
        fo.hfky[15] = 1051160643;
        fo.hfky[16] = 1260173801;
        fo.hfky[17] = 1307069152;
        fo.hfky[18] = 1420761888;
        fo.hfky[19] = 248982174;
        fo.hfky[20] = -1774523465;
        fo.hfky[21] = 896198945;
        fo.hfky[22] = 924174986;
        fo.hfky[23] = 1416256808;
        fo.hfky[24] = 801240432;
        fo.hfky[25] = -57025976;
        fo.hfky[26] = 535435069;
        fo.hfky[27] = 588091548;
        fo.hfky[28] = 1794176488;
        fo.hfky[29] = -1405353843;
        fo.hfky[30] = 1313429560;
        fo.hfky[31] = 864102894;
        fo.hfky[32] = 1685589161;
        fo.hfky[33] = 135258866;
        fo.hfky[34] = 1166636894;
        fo.hfky[35] = -1199559994;
        fo.hfky[36] = -57638050;
        fo.hfky[37] = -1602935587;
        fo.hfky[38] = 675271545;
        fo.hfky[39] = 594412844;
        fo.hfky[40] = 52668789;
        fo.hfky[41] = 998073062;
        fo.hfky[42] = 105234048;
        fo.hfky[43] = -1000245633;
        fo.hfky[44] = -1911470593;
        fo.hfky[45] = -1855092494;
        fo.hfky[46] = 93330460;
        fo.hfky[47] = -2146591317;
        fo.hfky[48] = 1733346265;
        fo.hfky[49] = -407505536;
        fo.hfky[50] = -1224481688;
        fo.hfky[51] = 1617543322;
        fo.hfky[52] = -21595119;
        fo.hfky[53] = -1896284606;
        fo.hfky[54] = 717852408;
        fo.hfky[55] = 1309373674;
        fo.hfky[56] = -203898239;
        fo.hfky[57] = 1109174767;
        fo.hfky[58] = 2134747677;
        fo.hfky[59] = 2133729249;
        fo.hfky[60] = -1507419968;
        fo.hfky[61] = -2032290985;
        fo.hfky[62] = 1119691366;
        fo.hfky[63] = 161350045;
        fo.hfky[64] = -302240965;
        fo.hfky[65] = 2032609719;
        fo.hfky[66] = 1735392872;
        fo.hfky[67] = -445890673;
        fo.hfky[68] = 1067416734;
        fo.hfky[69] = 1792229966;
        fo.hfky[70] = 1431000270;
        fo.hfky[71] = -1383563794;
        fo.hfky[72] = -244093492;
        fo.hfky[73] = -627055880;
        fo.hfky[74] = -385893546;
        fo.hfky[75] = 1451771006;
        fo.hfky[76] = -1041121503;
        fo.hfky[77] = 345010193;
        fo.hfky[78] = -1326302332;
        fo.hfky[79] = 1869546120;
        fo.hfky[80] = -69613580;
        fo.hfky[81] = -1593792108;
        fo.hfky[82] = -1923769374;
        fo.hfky[83] = -931745190;
        fo.hfky[84] = 885044710;
        fo.hfky[85] = 1085523914;
        fo.hfky[86] = -301737654;
        fo.hfky[87] = -1247148961;
        fo.hfky[88] = 924003278;
        fo.hfky[89] = -101880740;
        fo.hfky[90] = 1520120118;
        fo.hfky[91] = -1852766405;
        fo.hfky[92] = 792233099;
        fo.hfky[93] = -1688737367;
        fo.hfky[94] = 1825276801;
        fo.hfky[95] = -1816003190;
        fo.hfky[96] = -1424518300;
        fo.hfky[97] = 1904623441;
        fo.hfky[98] = -1413236419;
        fo.hfky[99] = 2053598520;
    }

    private static /* synthetic */ void hhlb() {
        fo.hfkw[200] = 1500233314;
        fo.hfkw[201] = 345968113;
        fo.hfkw[202] = 1421598261;
        fo.hfkw[203] = -1225585346;
        fo.hfkw[204] = 1116412394;
        fo.hfkw[205] = -851085005;
        fo.hfkw[206] = -888255822;
        fo.hfkw[207] = -2012925338;
        fo.hfkw[208] = -1536038390;
        fo.hfkw[209] = 1389009724;
        fo.hfkw[210] = 1563914449;
        fo.hfkw[211] = 370436444;
        fo.hfkw[212] = -1358002025;
        fo.hfkw[213] = 1241746049;
        fo.hfkw[214] = 143083610;
        fo.hfkw[215] = 2075564278;
        fo.hfkw[216] = -1073527113;
        fo.hfkw[217] = 599297004;
        fo.hfkw[218] = -1128525949;
        fo.hfkw[219] = 1853448562;
        fo.hfkw[220] = -1957845881;
        fo.hfkw[221] = 2034218504;
        fo.hfkw[222] = -1258852685;
        fo.hfkw[223] = 2082802376;
        fo.hfkw[224] = 882393281;
        fo.hfkw[225] = 1293124457;
        fo.hfkw[226] = -120654967;
        fo.hfkw[227] = -12193800;
        fo.hfkw[228] = 915911521;
        fo.hfkw[229] = -768253848;
        fo.hfkw[230] = 1486112469;
        fo.hfkw[231] = 1291305289;
        fo.hfkw[232] = -342281284;
        fo.hfkw[233] = -1839900129;
        fo.hfkw[234] = 1690335672;
        fo.hfkw[235] = -661284776;
        fo.hfkw[236] = -1006721629;
        fo.hfkw[237] = -190666837;
        fo.hfkw[238] = -1644646008;
        fo.hfkw[239] = -923244991;
        fo.hfkw[240] = 60449080;
        fo.hfkw[241] = -1925261888;
        fo.hfkw[242] = -1051792124;
        fo.hfkw[243] = -376048817;
        fo.hfkw[244] = 1271125255;
        fo.hfkw[245] = -676753076;
        fo.hfkw[246] = -82605193;
        fo.hfkw[247] = 81081663;
        fo.hfkw[248] = 1744300592;
        fo.hfkw[249] = 76356649;
        fo.hfkw[250] = -1676203761;
        fo.hfkw[251] = -933059073;
        fo.hfkw[252] = -2029286947;
        fo.hfkw[253] = 811882107;
        fo.hfkw[254] = -254906784;
        fo.hfkw[255] = -840749018;
        fo.hfkw[256] = -1259430843;
        fo.hfkw[257] = -1374150325;
        fo.hfkw[258] = 1950339776;
        fo.hfkw[259] = 1700680930;
        fo.hfkw[260] = -682937890;
        fo.hfkw[261] = 1056171569;
        fo.hfkw[262] = -861677062;
        fo.hfkw[263] = -309528431;
        fo.hfkw[264] = 41725631;
        fo.hfkw[265] = -1290850509;
        fo.hfkw[266] = 547631967;
        fo.hfkw[267] = -1084179321;
        fo.hfkw[268] = -1882097438;
        fo.hfkw[269] = 19148806;
        fo.hfkw[270] = 1597770353;
        fo.hfkw[271] = 299269939;
        fo.hfkw[272] = 825901463;
        fo.hfkw[273] = -65770602;
        fo.hfkw[274] = 766956914;
        fo.hfkw[275] = 1509711041;
        fo.hfkw[276] = 1422014313;
        fo.hfkw[277] = -436074552;
        fo.hfkw[278] = 1434103965;
        fo.hfkw[279] = 56208065;
        fo.hfkw[280] = -368381709;
        fo.hfkw[281] = 1463587047;
        fo.hfkw[282] = 1204211929;
        fo.hfkw[283] = 1809813347;
        fo.hfkw[284] = -634551550;
        fo.hfkw[285] = 727026444;
        fo.hfkw[286] = -728643223;
        fo.hfkw[287] = 3333450;
        fo.hfkw[288] = -94403273;
        fo.hfkw[289] = -448136724;
        fo.hfkw[290] = 1987140092;
        fo.hfkw[291] = 1979631829;
        fo.hfkw[292] = -1139642497;
        fo.hfkw[293] = 2037392209;
        fo.hfkw[294] = 932282508;
        fo.hfkw[295] = 1797054968;
        fo.hfkw[296] = -1578720453;
        fo.hfkw[297] = 959537129;
        fo.hfkw[298] = -694434074;
        fo.hfkw[299] = 375272788;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_2561 replace(class_2561 var0, Pattern var1_1, String var2_2, Integer var3_3) {
        block67: {
            var12_4 = fo.c;
            var11_5 /* !! */  = fo.b;
            var10_6 = fo.a;
            if (var12_4) {
                throw null;
lbl6:
                // 18 sources

                return null;
            }
            if (var10_6 || var10_6) ** GOTO lbl6
            var4_7 = var0.getString();
            if (var10_6 || var10_6) ** GOTO lbl6
            var5_8 = var1_1.matcher(var4_7);
            if (var10_6 || var10_6) ** GOTO lbl6
            if (var5_8.find()) break block67;
            if (var10_6) ** GOTO lbl6
            return var0;
        }
        if (var10_6 || var10_6) ** GOTO lbl6
        var6_9 = var5_8.start((int)fo.hfla("hgxz", hfks(int ), (int)349));
        if (var10_6) ** GOTO lbl6
        if (var11_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_6) ** GOTO lbl6
                var7_10 = var5_8.end((int)fo.hfla("hgya", hfks(int ), (int)350));
                if (var10_6) ** GOTO lbl6
                do {
                    if (var10_6 || var10_6) ** GOTO lbl6
                    if (var7_10 <= var6_9) ** GOTO lbl36
                    if (var10_6) ** GOTO lbl6
                    if (!Character.isWhitespace(var4_7.charAt(var7_10 - fo.hfla("hgyb", hfks(int ), (int)351)))) ** GOTO lbl36
                    if (var10_6 || var10_6) ** GOTO lbl6
                    --var7_10;
                    if (var10_6) ** GOTO lbl6
                } while (!var12_4);
                throw null;
lbl36:
                // 2 sources

                if (var10_6 || var10_6) ** GOTO lbl6
                var8_11 = fo.segments(var0);
                if (var10_6 || var10_6) ** GOTO lbl6
                var9_12 = class_2561.method_43473();
                if (var10_6 || var10_6) ** GOTO lbl6
                fo.appendRange(var9_12, var8_11, (int)fo.hfla("hgyc", hfks(int ), (int)352), var6_9);
                if (var10_6 || var10_6) ** GOTO lbl6
                fo.appendReplacement(var9_12, var8_11, var2_2, var6_9, var7_10, var3_3);
                if (var10_6 || var10_6) ** GOTO lbl6
                fo.appendRange(var9_12, var8_11, var7_10, var4_7.length());
                if (!var10_6 && !var10_6) ** break;
                ** continue;
                return var9_12;
            }
lbl49:
            // 2 sources

            case 0: {
                var11_5 /* !! */  = (int)fo.hfla("hgyd", hfks(int ), (int)353);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl54:
            // 2 sources

            case 1: {
                var11_5 /* !! */  = (int)fo.hfla("hgye", hfks(int ), (int)354);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl59:
            // 3 sources

            case 2: {
                var11_5 /* !! */  = (int)fo.hfla("hgyf", hfks(int ), (int)355);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl64:
            // 2 sources

            case 3: {
                var11_5 /* !! */  = (int)fo.hfla("hgyg", hfks(int ), (int)356);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl69:
            // 3 sources

            case 4: {
                var11_5 /* !! */  = (int)fo.hfla("hgyh", hfks(int ), (int)357);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 5: {
                var11_5 /* !! */  = (int)fo.hfla("hgyi", hfks(int ), (int)358);
                if (!var12_4) ** GOTO lbl69
                throw null;
            }
lbl78:
            // 2 sources

            case 6: {
                var11_5 /* !! */  = (int)fo.hfla("hgyj", hfks(int ), (int)359);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl83:
            // 2 sources

            case 7: {
                var11_5 /* !! */  = (int)fo.hfla("hgyk", hfks(int ), (int)360);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 8: {
                var11_5 /* !! */  = (int)fo.hfla("hgyl", hfks(int ), (int)361);
                if (!var12_4) ** GOTO lbl49
                throw null;
            }
lbl92:
            // 4 sources

            case 9: {
                var11_5 /* !! */  = (int)fo.hfla("hgym", hfks(int ), (int)362);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 10: {
                var11_5 /* !! */  = (int)fo.hfla("hgyn", hfks(int ), (int)363);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl102:
            // 3 sources

            case 11: {
                var11_5 /* !! */  = (int)fo.hfla("hgyo", hfks(int ), (int)364);
                if (!var12_4) ** GOTO lbl92
                throw null;
            }
lbl106:
            // 2 sources

            case 12: {
                var11_5 /* !! */  = (int)fo.hfla("hgyp", hfks(int ), (int)365);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 13: {
                var11_5 /* !! */  = (int)fo.hfla("hgyq", hfks(int ), (int)366);
                if (!var12_4) ** GOTO lbl102
                throw null;
            }
lbl115:
            // 2 sources

            case 14: {
                var11_5 /* !! */  = (int)fo.hfla("hgyr", hfks(int ), (int)367);
                if (!var12_4) ** GOTO lbl92
                throw null;
            }
lbl119:
            // 2 sources

            case 15: {
                var11_5 /* !! */  = (int)fo.hfla("hgys", hfks(int ), (int)368);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl124:
            // 2 sources

            case 16: {
                var11_5 /* !! */  = (int)fo.hfla("hgyt", hfks(int ), (int)369);
                if (!var12_4) ** GOTO lbl83
                throw null;
            }
            case 17: {
                var11_5 /* !! */  = (int)fo.hfla("hgyu", hfks(int ), (int)370);
                if (!var12_4) ** GOTO lbl59
                throw null;
            }
            case 18: {
                var11_5 /* !! */  = (int)fo.hfla("hgyv", hfks(int ), (int)371);
                if (!var12_4) ** GOTO lbl119
                throw null;
            }
lbl136:
            // 4 sources

            case 19: {
                var11_5 /* !! */  = (int)fo.hfla("hgyw", hfks(int ), (int)372);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 20: {
                var11_5 /* !! */  = (int)fo.hfla("hgyx", hfks(int ), (int)373);
                if (!var12_4) ** GOTO lbl69
                throw null;
            }
lbl145:
            // 3 sources

            case 21: {
                var11_5 /* !! */  = (int)fo.hfla("hgyy", hfks(int ), (int)374);
                if (!var12_4) ** GOTO lbl54
                throw null;
            }
            case 22: {
                var11_5 /* !! */  = (int)fo.hfla("hgyz", hfks(int ), (int)375);
                if (!var12_4) ** GOTO lbl64
                throw null;
            }
            case 23: {
                var11_5 /* !! */  = (int)fo.hfla("hgza", hfks(int ), (int)376);
                if (!var12_4) ** GOTO lbl59
                throw null;
            }
lbl157:
            // 2 sources

            case 24: {
                var11_5 /* !! */  = (int)fo.hfla("hgzb", hfks(int ), (int)377);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl162:
            // 2 sources

            case 25: {
                var11_5 /* !! */  = (int)fo.hfla("hgzc", hfks(int ), (int)378);
                if (!var12_4) ** GOTO lbl136
                throw null;
            }
lbl166:
            // 3 sources

            case 26: {
                var11_5 /* !! */  = (int)fo.hfla("hgzd", hfks(int ), (int)379);
                if (!var12_4) ** GOTO lbl78
                throw null;
            }
lbl170:
            // 2 sources

            case 27: {
                var11_5 /* !! */  = (int)fo.hfla("hgze", hfks(int ), (int)380);
                if (!var12_4) ** GOTO lbl106
                throw null;
            }
lbl174:
            // 4 sources

            case 28: {
                var11_5 /* !! */  = (int)fo.hfla("hgzf", hfks(int ), (int)381);
                if (!var12_4) ** GOTO lbl145
                throw null;
            }
            case 29: {
                var11_5 /* !! */  = (int)fo.hfla("hgzg", hfks(int ), (int)382);
                if (!var12_4) ** GOTO lbl145
                throw null;
            }
lbl182:
            // 2 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_5 /* !! */  = (int)fo.hfla("hgzh", hfks(int ), (int)383);
                    if (!var12_4) ** GOTO lbl174
                    throw null;
                }
            }
            case 31: {
                var11_5 /* !! */  = (int)fo.hfla("hgzi", hfks(int ), (int)384);
                if (!var12_4) ** GOTO lbl115
                throw null;
            }
            case 32: 
        }
        var11_5 /* !! */  = (int)fo.hfla("hgzj", hfks(int ), (int)385);
        ** while (!var12_4)
lbl194:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fo() {
        var2_1 /* !! */  = fo.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("StreamerMode", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043b\u0438\u0447\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435 \u0432 scoreboard", du.MISC);
                this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u0435\u0440\u0432\u0435\u0440, \u0434\u043b\u044f \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u0442\u0441\u044f \u043f\u043e\u0434\u043c\u0435\u043d\u0430", "ReallyWorld", new String[]{"ReallyWorld", "Funtime"});
                this.hideDonate = fo.option("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0434\u043e\u043d\u0430\u0442", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u0440\u0430\u043d\u0433 \u0432 scoreboard").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isReallyWorld(), ()Ljava/lang/Boolean;)((fo)this));
                this.donate = new kf("\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0434\u043e\u043d\u0430\u0442", "\u0414\u043e\u043d\u0430\u0442 \u0434\u043b\u044f \u043f\u043e\u0434\u043c\u0435\u043d\u044b", "ADMIN", new String[]{"D.HELPER", "HELPER", "ML.MODER", "MODER", "MODER+", "ST.MODER", "GL.MODER", "ML.ADMIN", "ADMIN", "MEDIA", "YT"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fo)this));
                this.hideGrief = fo.option("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0433\u0440\u0438\u0444", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043d\u043e\u043c\u0435\u0440 \u0433\u0440\u0438\u0444\u0430").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isReallyWorld(), ()Ljava/lang/Boolean;)((fo)this));
                this.hideKillsDeaths = fo.option("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0423/\u0421", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0441\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043a\u0443 \u0443\u0431\u0438\u0439\u0441\u0442\u0432 \u0438 \u0441\u043c\u0435\u0440\u0442\u0435\u0439").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isReallyWorld(), ()Ljava/lang/Boolean;)((fo)this));
                this.hideClan = fo.option("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u043a\u043b\u0430\u043d", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u043a\u043b\u0430\u043d \u0432 scoreboard").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isReallyWorld(), ()Ljava/lang/Boolean;)((fo)this));
                this.hideServer = fo.option("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c ReallyWorld.ru", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u0430\u0434\u0440\u0435\u0441 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u0432 scoreboard").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isReallyWorld(), ()Ljava/lang/Boolean;)((fo)this));
                fo.instance = this;
                this.settings(new jx[]{this.mode, this.hideDonate, this.donate, this.hideGrief, this.hideKillsDeaths, this.hideClan, this.hideServer});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fo.hfla("hflb", hfks(int ), (int)0);
            }
lbl18:
            // 4 sources

            case 1: {
                var2_1 /* !! */  = (int)fo.hfla("hfld", hfks(int ), (int)1);
                ** GOTO lbl30
            }
            case 2: {
                var2_1 /* !! */  = (int)fo.hfla("hflf", hfks(int ), (int)2);
                ** GOTO lbl46
            }
            case 3: {
                var2_1 /* !! */  = (int)fo.hfla("hflg", hfks(int ), (int)3);
                ** GOTO lbl40
            }
            case 4: {
                var2_1 /* !! */  = (int)fo.hfla("hflk", hfks(int ), (int)4);
                ** GOTO lbl43
            }
lbl30:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fo.hfla("hfll", hfks(int ), (int)5);
                    ** GOTO lbl18
                    break;
                }
            }
lbl34:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)fo.hfla("hfln", hfks(int ), (int)6);
                break;
            }
            case 7: {
                var2_1 /* !! */  = (int)fo.hfla("hflp", hfks(int ), (int)7);
                ** GOTO lbl46
            }
lbl40:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)fo.hfla("hflr", hfks(int ), (int)8);
                ** GOTO lbl18
            }
lbl43:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)fo.hfla("hflt", hfks(int ), (int)9);
                ** GOTO lbl34
            }
lbl46:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)fo.hfla("hflv", hfks(int ), (int)10);
                ** GOTO lbl43
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)fo.hfla("hflz", hfks(int ), (int)11);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hhjq", hfrd(int ), (int)383)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo.hfla("hhjr", hfks(int ), (int)528)) break;
            v0 /* !! */  = (long)fo.hfla("hhjs", hfks(int ), (int)529);
        }
        var3_1 = fo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hhjt", hfrd(int ), (int)384)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo.hfla("hhju", hfks(int ), (int)530)) break;
            v1 /* !! */  = (long)fo.hfla("hhjv", hfks(int ), (int)531);
        }
        var2_2 /* !! */  = fo.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hhjw", hfrd(int ), (int)385)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == fo.hfla("hhjx", hfks(int ), (int)532)) break;
                    v2 /* !! */  = (long)fo.hfla("hhjy", hfks(int ), (int)533);
                }
                var1_3 = fo.a;
                if (var3_1) {
                    throw null;
lbl27:
                    // 4 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hhjz", hfrd(int ), (int)386)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo.hfla("hhka", hfks(int ), (int)534)) break;
                    v3 /* !! */  = (long)fo.hfla("hhkb", hfks(int ), (int)535);
                }
                if (!this.isReallyWorld()) ** GOTO lbl76
                if (var1_3) ** GOTO lbl27
                v4 /* !! */  = fo.og;
                if (true) ** GOTO lbl42
                block34: while (true) {
                    v4 /* !! */  = (long)(v5 - fo.hfla("hhkc", hfrd(int ), (int)387));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1274565829: {
                            break block34;
                        }
                        case -378587689: {
                            v5 = fo.hfla("hhkd", hfrd(int ), (int)388);
                            continue block34;
                        }
                        case 1537729184: {
                            v5 = fo.hfla("hhke", hfrd(int ), (int)389);
                            continue block34;
                        }
                        case 1642171740: {
                            v5 = fo.hfla("hhkf", hfrd(int ), (int)390);
                            continue block34;
                        }
                    }
                    break;
                }
                v6 /* !! */  = fo.og;
                if (true) ** GOTO lbl58
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - fo.hfla("hhkg", hfrd(int ), (int)391));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1452223921: {
                            v7 = fo.hfla("hhkh", hfrd(int ), (int)392);
                            continue block35;
                        }
                        case -1274565829: {
                            break block35;
                        }
                        case -683524077: {
                            v7 = fo.hfla("hhki", hfrd(int ), (int)393);
                            continue block35;
                        }
                        case 1433703319: {
                            v7 = fo.hfla("hhkj", hfrd(int ), (int)394);
                            continue block35;
                        }
                    }
                    break;
                }
                if (!this.hideDonate.isValue()) ** GOTO lbl76
                if (var1_3) ** GOTO lbl27
                v8 = fo.hfla("hhkk", hfks(int ), (int)536);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
lbl76:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = fo.hfla("hhkl", hfks(int ), (int)537);
lbl79:
                // 2 sources

                v9 /* !! */  = fo.og;
                if (true) ** GOTO lbl83
                block36: while (true) {
                    v9 /* !! */  = (long)(v10 - fo.hfla("hhkm", hfrd(int ), (int)395));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1642779906: {
                            v10 = fo.hfla("hhkn", hfrd(int ), (int)396);
                            continue block36;
                        }
                        case -1274565829: {
                            break block36;
                        }
                        case 1027501059: {
                            v10 = fo.hfla("hhko", hfrd(int ), (int)397);
                            continue block36;
                        }
                        case 1959130465: {
                            v10 = fo.hfla("hhkp", hfrd(int ), (int)398);
                            continue block36;
                        }
                    }
                    break;
                }
                return (boolean)v8;
            }
lbl96:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)fo.hfla("hhkq", hfks(int ), (int)538);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: {
                var2_2 /* !! */  = (int)fo.hfla("hhkr", hfks(int ), (int)539);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl105:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fo.hfla("hhks", hfks(int ), (int)540);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl110:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fo.hfla("hhkt", hfks(int ), (int)541);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)fo.hfla("hhku", hfks(int ), (int)542);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl118:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo.hfla("hhkv", hfks(int ), (int)543);
                    if (!var3_1) ** GOTO lbl96
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)fo.hfla("hhkw", hfks(int ), (int)544);
                if (!var3_1) break;
                throw null;
            }
lbl127:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fo.hfla("hhkx", hfks(int ), (int)545);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)fo.hfla("hhky", hfks(int ), (int)546);
        ** while (!var3_1)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String selectedDonateName() {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(fo.hfla("hgeg", hfrd(int ), (int)84) - fo.hfla("hgef", hfrd(int ), (int)83));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block44;
                }
                case 1638803066: {
                    continue block44;
                }
            }
            break;
        }
        var3 = fo.c;
        v1 /* !! */  = fo.og;
        if (true) ** GOTO lbl15
        block45: while (true) {
            v1 /* !! */  = (long)(v2 - fo.hfla("hgeh", hfrd(int ), (int)85));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1274565829: {
                    break block45;
                }
                case -463955265: {
                    v2 = fo.hfla("hgei", hfrd(int ), (int)86);
                    continue block45;
                }
                case -185218330: {
                    v2 = fo.hfla("hgem", hfrd(int ), (int)87);
                    continue block45;
                }
                case 399159149: {
                    v2 = fo.hfla("hgen", hfrd(int ), (int)88);
                    continue block45;
                }
            }
            break;
        }
        var2_1 /* !! */  = fo.b;
        v3 /* !! */  = fo.og;
        if (true) ** GOTO lbl32
        block46: while (true) {
            v3 /* !! */  = (long)(v4 - fo.hfla("hgep", hfrd(int ), (int)89));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1274565829: {
                    break block46;
                }
                case -140534494: {
                    v4 = fo.hfla("hgeq", hfrd(int ), (int)90);
                    continue block46;
                }
                case 614860935: {
                    v4 = fo.hfla("hger", hfrd(int ), (int)91);
                    continue block46;
                }
                case 859757794: {
                    v4 = fo.hfla("hget", hfrd(int ), (int)92);
                    continue block46;
                }
            }
            break;
        }
        var1_2 = fo.a;
        if (var3) {
            throw null;
lbl47:
            // 4 sources

            return null;
        }
        if (var1_2 || var1_2) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgev", hfrd(int ), (int)93)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fo.hfla("hgew", hfks(int ), (int)174)) break;
            v5 /* !! */  = (long)fo.hfla("hgey", hfks(int ), (int)175);
        }
        var0_3 = fo.instance;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2 || var1_2) ** GOTO lbl47
                if (var0_3 != null) ** GOTO lbl66
                if (var1_2) ** GOTO lbl47
                v6 = "ADMIN";
                if (var3) {
                    throw null;
                }
                ** GOTO lbl118
lbl66:
                // 1 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgfc", hfrd(int ), (int)94)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fo.hfla("hgfd", hfks(int ), (int)176)) break;
                    v7 /* !! */  = (long)fo.hfla("hgff", hfks(int ), (int)177);
                }
                v8 = var0_3.donate;
                v9 /* !! */  = fo.og;
                if (true) ** GOTO lbl78
                block50: while (true) {
                    v9 /* !! */  = (long)(fo.hfla("hgfh", hfrd(int ), (int)96) - fo.hfla("hgfg", hfrd(int ), (int)95));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1274565829: {
                            break block50;
                        }
                        case 1417632932: {
                            continue block50;
                        }
                    }
                    break;
                }
                v10 = v8.getValue();
                v11 /* !! */  = fo.og;
                if (true) ** GOTO lbl88
                block51: while (true) {
                    v11 /* !! */  = (long)(v12 - fo.hfla("hgfi", hfrd(int ), (int)97));
lbl88:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1274565829: {
                            break block51;
                        }
                        case 1016775110: {
                            v12 = fo.hfla("hgfj", hfrd(int ), (int)98);
                            continue block51;
                        }
                        case 1461354667: {
                            v12 = fo.hfla("hgfl", hfrd(int ), (int)99);
                            continue block51;
                        }
                        case 1871035310: {
                            v12 = fo.hfla("hgfn", hfrd(int ), (int)100);
                            continue block51;
                        }
                    }
                    break;
                }
                v13 = fo$Rank.byName(v10);
                v14 /* !! */  = fo.og;
                if (true) ** GOTO lbl105
                block52: while (true) {
                    v14 /* !! */  = (long)(v15 - fo.hfla("hgfp", hfrd(int ), (int)101));
lbl105:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1274565829: {
                            break block52;
                        }
                        case -365889151: {
                            v15 = fo.hfla("hgfs", hfrd(int ), (int)102);
                            continue block52;
                        }
                        case 1478639653: {
                            v15 = fo.hfla("hgft", hfrd(int ), (int)103);
                            continue block52;
                        }
                        case 1504692153: {
                            v15 = fo.hfla("hgfv", hfrd(int ), (int)104);
                            continue block52;
                        }
                    }
                    break;
                }
                v6 = v13.name();
lbl118:
                // 2 sources

                return v6;
            }
lbl119:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fo.hfla("hgfw", hfks(int ), (int)178);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl124:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)fo.hfla("hgfx", hfks(int ), (int)179);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fo.hfla("hgfy", hfks(int ), (int)180);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl140
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)fo.hfla("hggc", hfks(int ), (int)181);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl140:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)fo.hfla("hggf", hfks(int ), (int)182);
                if (!var3) ** GOTO lbl124
                throw null;
            }
lbl144:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)fo.hfla("hggg", hfks(int ), (int)183);
                if (!var3) ** GOTO lbl119
                throw null;
            }
            case 6: {
                var2_1 /* !! */  = (int)fo.hfla("hggh", hfks(int ), (int)184);
                if (!var3) break;
                throw null;
            }
lbl152:
            // 2 sources

            case 7: {
                do {
                    var2_1 /* !! */  = (int)fo.hfla("hggk", hfks(int ), (int)185);
                } while (!var3);
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)fo.hfla("hggn", hfks(int ), (int)186);
                if (!var3) ** GOTO lbl140
                throw null;
            }
            case 9: 
        }
        var2_1 /* !! */  = (int)fo.hfla("hggq", hfks(int ), (int)187);
        ** while (!var3)
lbl164:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_2561 filterOwnChat(class_2561 var0) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hfrh", hfrd(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block65;
                }
                case 162210108: {
                    v1 = fo.hfla("hfri", hfrd(int ), (int)1);
                    continue block65;
                }
                case 795956714: {
                    v1 = fo.hfla("hfrj", hfrd(int ), (int)2);
                    continue block65;
                }
            }
            break;
        }
        var5_1 = fo.c;
        v2 /* !! */  = fo.og;
        if (true) ** GOTO lbl19
        block66: while (true) {
            v2 /* !! */  = (long)(v3 - fo.hfla("hfrl", hfrd(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1274565829: {
                    break block66;
                }
                case -875560404: {
                    v3 = fo.hfla("hfrm", hfrd(int ), (int)4);
                    continue block66;
                }
                case 170713734: {
                    v3 = fo.hfla("hfrq", hfrd(int ), (int)5);
                    continue block66;
                }
                case 1326312338: {
                    v3 = fo.hfla("hfrr", hfrd(int ), (int)6);
                    continue block66;
                }
            }
            break;
        }
        var4_2 /* !! */  = fo.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hfrs", hfrd(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fo.hfla("hfrt", hfks(int ), (int)70)) break;
            v4 /* !! */  = (long)fo.hfla("hfru", hfks(int ), (int)71);
        }
        var3_3 = fo.a;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_1) {
                    throw null;
lbl43:
                    // 11 sources

                    return null;
                }
                if (var3_3 || var3_3) ** GOTO lbl43
                v5 /* !! */  = fo.og;
                if (true) ** GOTO lbl50
                block69: while (true) {
                    v5 /* !! */  = (long)(fo.hfla("hfry", hfrd(int ), (int)9) - fo.hfla("hfrx", hfrd(int ), (int)8));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1274565829: {
                            break block69;
                        }
                        case -1168795658: {
                            continue block69;
                        }
                    }
                    break;
                }
                var1_4 = fo.instance;
                if (var3_3 || var3_3) ** GOTO lbl43
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hfsd", hfrd(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fo.hfla("hfse", hfks(int ), (int)72)) break;
                    v6 /* !! */  = (long)fo.hfla("hfsf", hfks(int ), (int)73);
                }
                if (!var1_4.active()) ** GOTO lbl66
                if (var3_3) ** GOTO lbl43
                if (var0 != null) ** GOTO lbl68
                if (var3_3) ** GOTO lbl43
lbl66:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl43
                return var0;
lbl68:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl43
                v7 /* !! */  = fo.og;
                if (true) ** GOTO lbl73
                block71: while (true) {
                    v7 /* !! */  = (long)(fo.hfla("hfsh", hfrd(int ), (int)12) - fo.hfla("hfsg", hfrd(int ), (int)11));
lbl73:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1274565829: {
                            break block71;
                        }
                        case 1139876488: {
                            continue block71;
                        }
                    }
                    break;
                }
                var2_5 = class_310.method_1551();
                if (var3_3 || var3_3) ** GOTO lbl43
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hfsn", hfrd(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fo.hfla("hfso", hfks(int ), (int)74)) break;
                    v8 /* !! */  = (long)fo.hfla("hfsp", hfks(int ), (int)75);
                }
                if (var2_5.field_1724 == null) ** GOTO lbl137
                if (var3_3) ** GOTO lbl43
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hfsq", hfrd(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fo.hfla("hfsr", hfks(int ), (int)76)) break;
                    v9 /* !! */  = (long)fo.hfla("hfst", hfks(int ), (int)77);
                }
                v10 = var0.getString();
                v11 /* !! */  = fo.og;
                if (true) ** GOTO lbl97
                block74: while (true) {
                    v11 /* !! */  = (long)(fo.hfla("hftb", hfrd(int ), (int)16) - fo.hfla("hfsv", hfrd(int ), (int)15));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1274565829: {
                            break block74;
                        }
                        case -498149164: {
                            continue block74;
                        }
                    }
                    break;
                }
                v12 = var2_5.field_1724;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hftc", hfrd(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fo.hfla("hftd", hfks(int ), (int)78)) break;
                    v13 /* !! */  = (long)fo.hfla("hfte", hfks(int ), (int)79);
                }
                v14 = v12.method_7334();
                v15 /* !! */  = fo.og;
                if (true) ** GOTO lbl113
                block76: while (true) {
                    v15 /* !! */  = (long)(v16 - fo.hfla("hftf", hfrd(int ), (int)18));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1274565829: {
                            break block76;
                        }
                        case -1131547480: {
                            v16 = fo.hfla("hftg", hfrd(int ), (int)19);
                            continue block76;
                        }
                        case 921046519: {
                            v16 = fo.hfla("hfti", hfrd(int ), (int)20);
                            continue block76;
                        }
                        case 1065763617: {
                            v16 = fo.hfla("hfto", hfrd(int ), (int)21);
                            continue block76;
                        }
                    }
                    break;
                }
                v17 = v14.name();
                v18 /* !! */  = fo.og;
                if (true) ** GOTO lbl130
                block77: while (true) {
                    v18 /* !! */  = (long)(fo.hfla("hftq", hfrd(int ), (int)23) - fo.hfla("hftp", hfrd(int ), (int)22));
lbl130:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1274565829: {
                            break block77;
                        }
                        case -457428651: {
                            continue block77;
                        }
                    }
                    break;
                }
                if (fo.containsIgnoreCase(v10, v17)) ** GOTO lbl139
                if (var3_3) ** GOTO lbl43
lbl137:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl43
                return var0;
lbl139:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = fo.og - fo.hfla("hftr", hfrd(int ), (int)24)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fo.hfla("hfts", hfks(int ), (int)80)) break;
                    v19 /* !! */  = (long)fo.hfla("hftt", hfks(int ), (int)81);
                }
                v20 = var2_5.field_1724;
                v21 /* !! */  = fo.og;
                if (true) ** GOTO lbl151
                block79: while (true) {
                    v21 /* !! */  = (long)(fo.hfla("hftz", hfrd(int ), (int)26) - fo.hfla("hfty", hfrd(int ), (int)25));
lbl151:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1274565829: {
                            break block79;
                        }
                        case 238978741: {
                            continue block79;
                        }
                    }
                    break;
                }
                v22 = v20.method_7334();
                v23 /* !! */  = fo.og;
                if (true) ** GOTO lbl161
                block80: while (true) {
                    v23 /* !! */  = (long)(v24 - fo.hfla("hfub", hfrd(int ), (int)27));
lbl161:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1274565829: {
                            break block80;
                        }
                        case -1077491806: {
                            v24 = fo.hfla("hfud", hfrd(int ), (int)28);
                            continue block80;
                        }
                        case 1175600835: {
                            v24 = fo.hfla("hfuf", hfrd(int ), (int)29);
                            continue block80;
                        }
                    }
                    break;
                }
                v25 = v22.name();
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_6 = fo.og - fo.hfla("hfuh", hfrd(int ), (int)30)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == fo.hfla("hfui", hfks(int ), (int)82)) break;
                    v26 /* !! */  = (long)fo.hfla("hfum", hfks(int ), (int)83);
                }
                return var1_4.filterIdentity(var0, v25);
            }
            case 0: {
                var4_2 /* !! */  = (int)fo.hfla("hfun", hfks(int ), (int)84);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 1: {
                var4_2 /* !! */  = (int)fo.hfla("hfuo", hfks(int ), (int)85);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl187:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)fo.hfla("hfuq", hfks(int ), (int)86);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl192:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)fo.hfla("hfus", hfks(int ), (int)87);
                if (var5_1) {
                    throw null;
                }
            }
lbl196:
            // 6 sources

            case 4: {
                var4_2 /* !! */  = (int)fo.hfla("hfuv", hfks(int ), (int)88);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 5: {
                var4_2 /* !! */  = (int)fo.hfla("hfuw", hfks(int ), (int)89);
                if (!var5_1) ** GOTO lbl192
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)fo.hfla("hfva", hfks(int ), (int)90);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl210:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)fo.hfla("hfvb", hfks(int ), (int)91);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 8: {
                var4_2 /* !! */  = (int)fo.hfla("hfvc", hfks(int ), (int)92);
                if (!var5_1) ** GOTO lbl196
                throw null;
            }
lbl219:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)fo.hfla("hfvd", hfks(int ), (int)93);
                if (!var5_1) ** GOTO lbl210
                throw null;
            }
lbl223:
            // 5 sources

            case 10: {
                var4_2 /* !! */  = (int)fo.hfla("hfvg", hfks(int ), (int)94);
                if (!var5_1) ** GOTO lbl187
                throw null;
            }
lbl227:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fo.hfla("hfvi", hfks(int ), (int)95);
                    if (!var5_1) ** GOTO lbl223
                    throw null;
                }
            }
lbl232:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)fo.hfla("hfvn", hfks(int ), (int)96);
                if (!var5_1) ** GOTO lbl223
                throw null;
            }
lbl236:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)fo.hfla("hfvp", hfks(int ), (int)97);
                if (!var5_1) ** GOTO lbl196
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)fo.hfla("hfvs", hfks(int ), (int)98);
                if (!var5_1) ** GOTO lbl219
                throw null;
            }
lbl244:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)fo.hfla("hfvu", hfks(int ), (int)99);
                if (!var5_1) ** GOTO lbl187
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)fo.hfla("hfvw", hfks(int ), (int)100);
                if (!var5_1) ** GOTO lbl219
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)fo.hfla("hfvz", hfks(int ), (int)101);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 18: {
                var4_2 /* !! */  = (int)fo.hfla("hfwa", hfks(int ), (int)102);
                if (!var5_1) ** GOTO lbl196
                throw null;
            }
lbl261:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)fo.hfla("hfwd", hfks(int ), (int)103);
                if (!var5_1) ** GOTO lbl227
                throw null;
            }
            case 20: 
        }
        var4_2 /* !! */  = (int)fo.hfla("hfwf", hfks(int ), (int)104);
        ** while (!var5_1)
lbl268:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Pattern literal(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgvj", hfrd(int ), (int)230)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fo.hfla("hgvk", hfks(int ), (int)310)) break;
            v0 /* !! */  = (long)fo.hfla("hgvl", hfks(int ), (int)311);
        }
        var3_1 = fo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgvm", hfrd(int ), (int)231)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fo.hfla("hgvn", hfks(int ), (int)312)) break;
            v1 /* !! */  = (long)fo.hfla("hgvo", hfks(int ), (int)313);
        }
        var2_2 /* !! */  = fo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgvp", hfrd(int ), (int)232)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fo.hfla("hgvq", hfks(int ), (int)314)) break;
            v2 /* !! */  = (long)fo.hfla("hgvr", hfks(int ), (int)315);
        }
        var1_3 = fo.a;
        if (var3_1) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl24:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgvs", hfrd(int ), (int)233)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fo.hfla("hgvt", hfks(int ), (int)316)) break;
                    v3 /* !! */  = (long)fo.hfla("hgvu", hfks(int ), (int)317);
                }
                v4 = Pattern.quote(var0);
                v5 /* !! */  = fo.og;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v5 /* !! */  = (long)(v6 - fo.hfla("hgvv", hfrd(int ), (int)234));
lbl37:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1274565829: {
                            break block20;
                        }
                        case 51323932: {
                            v6 = fo.hfla("hgvw", hfrd(int ), (int)235);
                            continue block20;
                        }
                        case 1266417698: {
                            v6 = fo.hfla("hgvx", hfrd(int ), (int)236);
                            continue block20;
                        }
                    }
                    break;
                }
                v7 = "(?iu)(" + v4 + ")";
                v8 /* !! */  = fo.og;
                if (true) ** GOTO lbl51
                block21: while (true) {
                    v8 /* !! */  = (long)(fo.hfla("hgvz", hfrd(int ), (int)238) - fo.hfla("hgvy", hfrd(int ), (int)237));
lbl51:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1274565829: {
                            break block21;
                        }
                        case 188064881: {
                            continue block21;
                        }
                    }
                    break;
                }
                return Pattern.compile(v7);
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)fo.hfla("hgwa", hfks(int ), (int)318);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fo.hfla("hgwb", hfks(int ), (int)319);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo.hfla("hgwc", hfks(int ), (int)320);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo.hfla("hgwd", hfks(int ), (int)321);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_2561 filterScoreboard(class_2561 var0) {
        block111: {
            block110: {
                block109: {
                    block108: {
                        block107: {
                            block106: {
                                block105: {
                                    var6_1 = fo.c;
                                    var5_2 /* !! */  = fo.b;
                                    var4_3 = fo.a;
                                    if (var6_1) {
                                        throw null;
lbl6:
                                        // 29 sources

                                        return null;
                                    }
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    var1_4 = fo.instance;
                                    if (var4_3 || var4_3) ** GOTO lbl6
                                    if (var1_4 == null) break block105;
                                    if (var4_3) ** GOTO lbl6
                                    if (!var1_4.isState()) break block105;
                                    if (var4_3) ** GOTO lbl6
                                    if (!var1_4.isReallyWorld()) break block105;
                                    if (var4_3) ** GOTO lbl6
                                    if (var0 != null) break block106;
                                    if (var4_3) ** GOTO lbl6
                                }
                                if (var4_3 || var4_3) ** GOTO lbl6
                                return var0;
                            }
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (!var1_4.hideDonate.isValue()) break block107;
                            if (var4_3 || var4_3) ** GOTO lbl6
                            var1_4.remember(var0, fo.DONATE, (boolean)fo.hfla("hfmf", hfks(int ), (int)12));
                            if (var4_3 || var4_3) ** GOTO lbl6
                            var2_5 = fo$Rank.byName(var1_4.donate.getValue());
                            if (var4_3 || var4_3) ** GOTO lbl6
                            var3_6 = fo.replace(var0, fo.DONATE, String.valueOf(var2_5.symbol()), (int)fo.hfla("hfml", hfks(int ), (int)13));
                            if (var4_3 || var4_3) ** GOTO lbl6
                            if (var3_6 == var0) break block107;
                            if (var4_3) ** GOTO lbl6
                            return var3_6;
                        }
                        if (var4_3 || var4_3) ** GOTO lbl6
                        if (!var1_4.hideGrief.isValue()) break block108;
                        if (var4_3 || var4_3) ** GOTO lbl6
                        var2_5 = fo.replace(var0, fo.GRIEF, "\u0413\u0420\u0418\u0424 #PHOBIA");
                        if (var4_3 || var4_3) ** GOTO lbl6
                        if (var2_5 == var0) break block108;
                        if (var4_3) ** GOTO lbl6
                        return var2_5;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (!var1_4.hideKillsDeaths.isValue()) break block109;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    var2_5 = fo.replace(var0, fo.KILLS_DEATHS, "6/7");
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (var2_5 == var0) break block109;
                    if (var4_3) ** GOTO lbl6
                    return var2_5;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var1_4.hideClan.isValue()) break block110;
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4.remember(var0, fo.CLAN, (boolean)fo.hfla("hfmn", hfks(int ), (int)14));
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = fo.replace(var0, fo.CLAN, "\u0431\u0443\u0440\u043c\u0430\u043b\u0434\u0430", (int)fo.hfla("hfmp", hfks(int ), (int)15));
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var2_5 == var0) break block110;
                if (var4_3) ** GOTO lbl6
                return var2_5;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!var1_4.hideServer.isValue()) break block111;
            if (var4_3) ** GOTO lbl6
            v0 = fo.replace(var0, fo.SERVER, "phobiadlc.fun");
            if (var6_1) {
                throw null;
            }
            ** GOTO lbl79
        }
        if (!var4_3 && !var4_3) ** break;
        ** while (true)
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v0 = var0;
lbl79:
                // 2 sources

                return v0;
            }
lbl80:
            // 5 sources

            case 0: {
                var5_2 /* !! */  = (int)fo.hfla("hfmv", hfks(int ), (int)16);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl85:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)fo.hfla("hfmw", hfks(int ), (int)17);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 2: {
                var5_2 /* !! */  = (int)fo.hfla("hfmx", hfks(int ), (int)18);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl95:
            // 3 sources

            case 3: {
                var5_2 /* !! */  = (int)fo.hfla("hfmy", hfks(int ), (int)19);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl100:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)fo.hfla("hfmz", hfks(int ), (int)20);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl105:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)fo.hfla("hfnf", hfks(int ), (int)21);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl110:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)fo.hfla("hfnh", hfks(int ), (int)22);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl115:
            // 4 sources

            case 7: {
                var5_2 /* !! */  = (int)fo.hfla("hfnj", hfks(int ), (int)23);
                if (var6_1) {
                    throw null;
                }
            }
            case 8: {
                var5_2 /* !! */  = (int)fo.hfla("hfnk", hfks(int ), (int)24);
                if (!var6_1) ** GOTO lbl80
                throw null;
            }
            case 9: {
                var5_2 /* !! */  = (int)fo.hfla("hfnl", hfks(int ), (int)25);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 10: {
                var5_2 /* !! */  = (int)fo.hfla("hfnm", hfks(int ), (int)26);
                if (!var6_1) ** GOTO lbl85
                throw null;
            }
lbl132:
            // 3 sources

            case 11: {
                do {
                    var5_2 /* !! */  = (int)fo.hfla("hfnt", hfks(int ), (int)27);
                } while (!var6_1);
                throw null;
            }
            case 12: {
                var5_2 /* !! */  = (int)fo.hfla("hfnv", hfks(int ), (int)28);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 13: {
                var5_2 /* !! */  = (int)fo.hfla("hfnw", hfks(int ), (int)29);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 14: {
                var5_2 /* !! */  = (int)fo.hfla("hfnx", hfks(int ), (int)30);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 15: {
                var5_2 /* !! */  = (int)fo.hfla("hfny", hfks(int ), (int)31);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl157:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)fo.hfla("hfnz", hfks(int ), (int)32);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 17: {
                var5_2 /* !! */  = (int)fo.hfla("hfob", hfks(int ), (int)33);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 18: {
                var5_2 /* !! */  = (int)fo.hfla("hfog", hfks(int ), (int)34);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl172:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)fo.hfla("hfoi", hfks(int ), (int)35);
                if (!var6_1) ** GOTO lbl105
                throw null;
            }
lbl176:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)fo.hfla("hfoj", hfks(int ), (int)36);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 21: {
                var5_2 /* !! */  = (int)fo.hfla("hfok", hfks(int ), (int)37);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 22: {
                var5_2 /* !! */  = (int)fo.hfla("hfol", hfks(int ), (int)38);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 23: {
                var5_2 /* !! */  = (int)fo.hfla("hfom", hfks(int ), (int)39);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl196:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)fo.hfla("hfop", hfks(int ), (int)40);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl201:
            // 3 sources

            case 25: {
                var5_2 /* !! */  = (int)fo.hfla("hfou", hfks(int ), (int)41);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 26: {
                var5_2 /* !! */  = (int)fo.hfla("hfov", hfks(int ), (int)42);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl211:
            // 3 sources

            case 27: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)fo.hfla("hfow", hfks(int ), (int)43);
                    if (!var6_1) ** GOTO lbl80
                    throw null;
                }
            }
lbl216:
            // 2 sources

            case 28: {
                var5_2 /* !! */  = (int)fo.hfla("hfox", hfks(int ), (int)44);
                if (!var6_1) ** GOTO lbl100
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)fo.hfla("hfoy", hfks(int ), (int)45);
                if (!var6_1) ** GOTO lbl157
                throw null;
            }
lbl224:
            // 2 sources

            case 30: {
                var5_2 /* !! */  = (int)fo.hfla("hfpb", hfks(int ), (int)46);
                if (!var6_1) ** GOTO lbl115
                throw null;
            }
            case 31: {
                var5_2 /* !! */  = (int)fo.hfla("hfpc", hfks(int ), (int)47);
                if (!var6_1) ** GOTO lbl201
                throw null;
            }
            case 32: {
                var5_2 /* !! */  = (int)fo.hfla("hfpi", hfks(int ), (int)48);
                if (!var6_1) ** GOTO lbl176
                throw null;
            }
lbl236:
            // 2 sources

            case 33: {
                var5_2 /* !! */  = (int)fo.hfla("hfpj", hfks(int ), (int)49);
                if (!var6_1) break;
                throw null;
            }
lbl240:
            // 2 sources

            case 34: {
                var5_2 /* !! */  = (int)fo.hfla("hfpk", hfks(int ), (int)50);
                if (!var6_1) ** GOTO lbl80
                throw null;
            }
            case 35: {
                var5_2 /* !! */  = (int)fo.hfla("hfpm", hfks(int ), (int)51);
                if (!var6_1) break;
                throw null;
            }
            case 36: {
                var5_2 /* !! */  = (int)fo.hfla("hfpo", hfks(int ), (int)52);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl253:
            // 2 sources

            case 37: {
                var5_2 /* !! */  = (int)fo.hfla("hfpq", hfks(int ), (int)53);
                if (!var6_1) ** GOTO lbl80
                throw null;
            }
            case 38: {
                var5_2 /* !! */  = (int)fo.hfla("hfpv", hfks(int ), (int)54);
                if (!var6_1) ** GOTO lbl115
                throw null;
            }
lbl261:
            // 4 sources

            case 39: {
                var5_2 /* !! */  = (int)fo.hfla("hfpw", hfks(int ), (int)55);
                if (!var6_1) ** GOTO lbl253
                throw null;
            }
            case 40: {
                var5_2 /* !! */  = (int)fo.hfla("hfpx", hfks(int ), (int)56);
                if (!var6_1) ** GOTO lbl95
                throw null;
            }
lbl269:
            // 2 sources

            case 41: {
                var5_2 /* !! */  = (int)fo.hfla("hfpy", hfks(int ), (int)57);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 42: {
                var5_2 /* !! */  = (int)fo.hfla("hfqa", hfks(int ), (int)58);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl279:
            // 2 sources

            case 43: {
                var5_2 /* !! */  = (int)fo.hfla("hfqc", hfks(int ), (int)59);
                if (!var6_1) ** GOTO lbl269
                throw null;
            }
lbl283:
            // 2 sources

            case 44: {
                var5_2 /* !! */  = (int)fo.hfla("hfqe", hfks(int ), (int)60);
                if (!var6_1) ** GOTO lbl115
                throw null;
            }
lbl287:
            // 7 sources

            case 45: {
                var5_2 /* !! */  = (int)fo.hfla("hfqj", hfks(int ), (int)61);
                if (!var6_1) ** GOTO lbl132
                throw null;
            }
            case 46: {
                var5_2 /* !! */  = (int)fo.hfla("hfqk", hfks(int ), (int)62);
                if (var6_1) {
                    throw null;
                }
            }
            case 47: {
                var5_2 /* !! */  = (int)fo.hfla("hfql", hfks(int ), (int)63);
                if (!var6_1) ** GOTO lbl95
                throw null;
            }
            case 48: {
                do {
                    var5_2 /* !! */  = (int)fo.hfla("hfqn", hfks(int ), (int)64);
                } while (!var6_1);
                throw null;
            }
lbl304:
            // 3 sources

            case 49: {
                var5_2 /* !! */  = (int)fo.hfla("hfqp", hfks(int ), (int)65);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl309:
            // 3 sources

            case 50: {
                var5_2 /* !! */  = (int)fo.hfla("hfqr", hfks(int ), (int)66);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl314:
            // 2 sources

            case 51: {
                var5_2 /* !! */  = (int)fo.hfla("hfqt", hfks(int ), (int)67);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
lbl318:
            // 3 sources

            case 52: {
                var5_2 /* !! */  = (int)fo.hfla("hfqv", hfks(int ), (int)68);
                if (!var6_1) ** GOTO lbl261
                throw null;
            }
            case 53: 
        }
        var5_2 /* !! */  = (int)fo.hfla("hfqw", hfks(int ), (int)69);
        ** while (!var6_1)
lbl325:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhta() {
        fo.hfrf[100] = 918289265499778443L;
        fo.hfrf[101] = -757831393257370804L;
        fo.hfrf[102] = 6203841896499576355L;
        fo.hfrf[103] = 4019022535889112618L;
        fo.hfrf[104] = -2236098565562185081L;
        fo.hfrf[105] = -8877567120278647387L;
        fo.hfrf[106] = -1407806996747059045L;
        fo.hfrf[107] = 7618993355533537160L;
        fo.hfrf[108] = 1527621095825604636L;
        fo.hfrf[109] = -5874283475813672113L;
        fo.hfrf[110] = -7117482737507594485L;
        fo.hfrf[111] = 594191395155051939L;
        fo.hfrf[112] = -4721379547537050925L;
        fo.hfrf[113] = 1926660707133965305L;
        fo.hfrf[114] = -893887027748155362L;
        fo.hfrf[115] = -7482848121094560698L;
        fo.hfrf[116] = -2899556476459266312L;
        fo.hfrf[117] = -8975784844108096260L;
        fo.hfrf[118] = 3298798734032374354L;
        fo.hfrf[119] = 4514207733127321253L;
        fo.hfrf[120] = 23896069180822744L;
        fo.hfrf[121] = 849850454172076263L;
        fo.hfrf[122] = -8700694220914882076L;
        fo.hfrf[123] = -3570748725736830788L;
        fo.hfrf[124] = -5035767218088642729L;
        fo.hfrf[125] = -4410602922955588280L;
        fo.hfrf[126] = -3271932498359819865L;
        fo.hfrf[127] = 4337546223822686264L;
        fo.hfrf[128] = 6552550923100869912L;
        fo.hfrf[129] = 7152321020880707314L;
        fo.hfrf[130] = 8162944781920096554L;
        fo.hfrf[131] = 3935238126237614685L;
        fo.hfrf[132] = -4178906760409208911L;
        fo.hfrf[133] = -4752891086414706314L;
        fo.hfrf[134] = 5255237587524823606L;
        fo.hfrf[135] = 1584331062693416891L;
        fo.hfrf[136] = -8104474487233899345L;
        fo.hfrf[137] = 4152302891948545172L;
        fo.hfrf[138] = -4223382772691250274L;
        fo.hfrf[139] = -5143540886031347878L;
        fo.hfrf[140] = 16239074014933204L;
        fo.hfrf[141] = -3730286824850362293L;
        fo.hfrf[142] = -445768670667698755L;
        fo.hfrf[143] = 827321497281865422L;
        fo.hfrf[144] = 2196952072803154388L;
        fo.hfrf[145] = 2570620801564228696L;
        fo.hfrf[146] = 2739709352541226189L;
        fo.hfrf[147] = 9072033152858965311L;
        fo.hfrf[148] = -6960487499809038478L;
        fo.hfrf[149] = -346605382496142997L;
        fo.hfrf[150] = 4170320211362323299L;
        fo.hfrf[151] = 3669597518105710107L;
        fo.hfrf[152] = -2508676821737057127L;
        fo.hfrf[153] = 1115730796871346084L;
        fo.hfrf[154] = -7120670824477804944L;
        fo.hfrf[155] = 6661932681178885983L;
        fo.hfrf[156] = 423952721386538175L;
        fo.hfrf[157] = 7942910817212077285L;
        fo.hfrf[158] = -5922318379498593752L;
        fo.hfrf[159] = -2770025210717409671L;
        fo.hfrf[160] = 6310362858227836848L;
        fo.hfrf[161] = 241691035229826245L;
        fo.hfrf[162] = -8126454923177208375L;
        fo.hfrf[163] = 7986939444666025294L;
        fo.hfrf[164] = 6745759246822783760L;
        fo.hfrf[165] = 8095688777573840136L;
        fo.hfrf[166] = -6490509592755019996L;
        fo.hfrf[167] = 3236054706093499408L;
        fo.hfrf[168] = -8276393600978469309L;
        fo.hfrf[169] = -8355045067976019779L;
        fo.hfrf[170] = 8309609268067757650L;
        fo.hfrf[171] = -387296090884372610L;
        fo.hfrf[172] = -6829331919608853999L;
        fo.hfrf[173] = -4958342677178014926L;
        fo.hfrf[174] = -4680335613578352226L;
        fo.hfrf[175] = 7754628875896426746L;
        fo.hfrf[176] = -587425362619075415L;
        fo.hfrf[177] = 2129021809841896996L;
        fo.hfrf[178] = -4345970435115851091L;
        fo.hfrf[179] = -2770642532054924421L;
        fo.hfrf[180] = 5276777377980241129L;
        fo.hfrf[181] = 518800646813161388L;
        fo.hfrf[182] = -7639168589914299305L;
        fo.hfrf[183] = 8796296786942794482L;
        fo.hfrf[184] = -7687907959987877884L;
        fo.hfrf[185] = 272058106845983725L;
        fo.hfrf[186] = -1902352927377026806L;
        fo.hfrf[187] = -579308531959259439L;
        fo.hfrf[188] = -2019560695715981632L;
        fo.hfrf[189] = -6160697308106640459L;
        fo.hfrf[190] = -5371590260985005522L;
        fo.hfrf[191] = -8878104305381680567L;
        fo.hfrf[192] = -8958687204137060377L;
        fo.hfrf[193] = -8086010340549783311L;
        fo.hfrf[194] = 1789868157549407214L;
        fo.hfrf[195] = 7389679470821660824L;
        fo.hfrf[196] = 4743809213435333502L;
        fo.hfrf[197] = -2907398204144850156L;
        fo.hfrf[198] = -3233319759861857289L;
        fo.hfrf[199] = 4261776971478155790L;
    }

    private static /* synthetic */ void hhmm() {
        fo.hfky[100] = 48642821;
        fo.hfky[101] = 1416891423;
        fo.hfky[102] = -229509601;
        fo.hfky[103] = 847576850;
        fo.hfky[104] = 1405851519;
        fo.hfky[105] = -1759678725;
        fo.hfky[106] = 206981431;
        fo.hfky[107] = 1933853104;
        fo.hfky[108] = -1745466134;
        fo.hfky[109] = -530721891;
        fo.hfky[110] = -1447627484;
        fo.hfky[111] = -291977327;
        fo.hfky[112] = -349292268;
        fo.hfky[113] = 18191094;
        fo.hfky[114] = 2123059981;
        fo.hfky[115] = -398767927;
        fo.hfky[116] = -1548006186;
        fo.hfky[117] = -421307002;
        fo.hfky[118] = -1046640926;
        fo.hfky[119] = -379576014;
        fo.hfky[120] = -1291583549;
        fo.hfky[121] = -227490659;
        fo.hfky[122] = -169720084;
        fo.hfky[123] = 865610648;
        fo.hfky[124] = 136748635;
        fo.hfky[125] = -908390827;
        fo.hfky[126] = 1293961308;
        fo.hfky[127] = -321445876;
        fo.hfky[128] = -107631507;
        fo.hfky[129] = -1449616506;
        fo.hfky[130] = -292450569;
        fo.hfky[131] = -828428064;
        fo.hfky[132] = -697397330;
        fo.hfky[133] = -1204229452;
        fo.hfky[134] = -115834355;
        fo.hfky[135] = -1132398413;
        fo.hfky[136] = 1209850115;
        fo.hfky[137] = -300722388;
        fo.hfky[138] = -321454891;
        fo.hfky[139] = -2100794990;
        fo.hfky[140] = 82996186;
        fo.hfky[141] = 1978538788;
        fo.hfky[142] = 2011112834;
        fo.hfky[143] = -1883766468;
        fo.hfky[144] = -2038741087;
        fo.hfky[145] = 966862576;
        fo.hfky[146] = 259569611;
        fo.hfky[147] = 617124995;
        fo.hfky[148] = 1443452876;
        fo.hfky[149] = -1302624634;
        fo.hfky[150] = -1236713112;
        fo.hfky[151] = -1869422237;
        fo.hfky[152] = -681038207;
        fo.hfky[153] = -1014919681;
        fo.hfky[154] = 1596715506;
        fo.hfky[155] = 323191180;
        fo.hfky[156] = -2017979217;
        fo.hfky[157] = -816111871;
        fo.hfky[158] = 1384385804;
        fo.hfky[159] = 453779160;
        fo.hfky[160] = 1996586295;
        fo.hfky[161] = -2020779189;
        fo.hfky[162] = 350029063;
        fo.hfky[163] = -1357755602;
        fo.hfky[164] = -699912704;
        fo.hfky[165] = 443170712;
        fo.hfky[166] = 1222510543;
        fo.hfky[167] = 1731861560;
        fo.hfky[168] = -10705621;
        fo.hfky[169] = -1920386750;
        fo.hfky[170] = -1533650766;
        fo.hfky[171] = -525761279;
        fo.hfky[172] = -1709173354;
        fo.hfky[173] = -1209475380;
        fo.hfky[174] = -1450092473;
        fo.hfky[175] = -579635063;
        fo.hfky[176] = 2143620770;
        fo.hfky[177] = 1947971232;
        fo.hfky[178] = -1278416275;
        fo.hfky[179] = 498091616;
        fo.hfky[180] = 1397108131;
        fo.hfky[181] = 1611863629;
        fo.hfky[182] = 1040413034;
        fo.hfky[183] = -90763324;
        fo.hfky[184] = 212606210;
        fo.hfky[185] = -2040628411;
        fo.hfky[186] = -36930924;
        fo.hfky[187] = -772813991;
        fo.hfky[188] = -71597015;
        fo.hfky[189] = 268167065;
        fo.hfky[190] = 1134651119;
        fo.hfky[191] = 1063316172;
        fo.hfky[192] = 319539002;
        fo.hfky[193] = -731098221;
        fo.hfky[194] = -686699602;
        fo.hfky[195] = -1939248913;
        fo.hfky[196] = 982095737;
        fo.hfky[197] = 1656132979;
        fo.hfky[198] = -656209961;
        fo.hfky[199] = 1685542523;
    }

    private static /* synthetic */ void hhsi() {
        fo.hfrf[0] = 1233303233325474346L;
        fo.hfrf[1] = -5561413960849215696L;
        fo.hfrf[2] = -3728573280713115178L;
        fo.hfrf[3] = 6145511461216391001L;
        fo.hfrf[4] = -2069229287679893717L;
        fo.hfrf[5] = -8778077740721222652L;
        fo.hfrf[6] = 8021682549738685019L;
        fo.hfrf[7] = -366618861215025347L;
        fo.hfrf[8] = 4351085783842553781L;
        fo.hfrf[9] = -3824871356228378443L;
        fo.hfrf[10] = -8252454587982459435L;
        fo.hfrf[11] = 754780459488910869L;
        fo.hfrf[12] = 140745379038395121L;
        fo.hfrf[13] = -7250813211246252915L;
        fo.hfrf[14] = -2679012978290096693L;
        fo.hfrf[15] = 1104269963543843047L;
        fo.hfrf[16] = -6574794371491025686L;
        fo.hfrf[17] = -7046293048268085547L;
        fo.hfrf[18] = 3900573925826087674L;
        fo.hfrf[19] = 3801509577208417628L;
        fo.hfrf[20] = 3735555966901508353L;
        fo.hfrf[21] = -8242456503351225665L;
        fo.hfrf[22] = 4460431724179602414L;
        fo.hfrf[23] = -5316186873792782298L;
        fo.hfrf[24] = -5995834279523941774L;
        fo.hfrf[25] = 6587341794880808065L;
        fo.hfrf[26] = -6957322565083210929L;
        fo.hfrf[27] = -2166663794956562911L;
        fo.hfrf[28] = 1495296352905695958L;
        fo.hfrf[29] = -2831639117067041915L;
        fo.hfrf[30] = -9123152452687318255L;
        fo.hfrf[31] = 4900208620438486042L;
        fo.hfrf[32] = -3678803615177489262L;
        fo.hfrf[33] = -8215674244704393911L;
        fo.hfrf[34] = 3637906956682675247L;
        fo.hfrf[35] = 6406038182680434705L;
        fo.hfrf[36] = 6591806166224771462L;
        fo.hfrf[37] = -8338482509117887863L;
        fo.hfrf[38] = 2056764131429327373L;
        fo.hfrf[39] = -2725751124529085893L;
        fo.hfrf[40] = -8618186435202705341L;
        fo.hfrf[41] = 2366402532158651686L;
        fo.hfrf[42] = 7175635665472050717L;
        fo.hfrf[43] = 2977240876382756519L;
        fo.hfrf[44] = 434411806180564048L;
        fo.hfrf[45] = -3040029629516940124L;
        fo.hfrf[46] = 7537379857253586931L;
        fo.hfrf[47] = -6073819210243655731L;
        fo.hfrf[48] = 8125488375671348833L;
        fo.hfrf[49] = -292039575418293212L;
        fo.hfrf[50] = 5059122619238712164L;
        fo.hfrf[51] = 244937243082806718L;
        fo.hfrf[52] = -8373528520078676593L;
        fo.hfrf[53] = -2404438660351130166L;
        fo.hfrf[54] = -8077544468282113070L;
        fo.hfrf[55] = -6233517652848125996L;
        fo.hfrf[56] = 7267788267462788929L;
        fo.hfrf[57] = 1310899577132397093L;
        fo.hfrf[58] = -5329249772968615278L;
        fo.hfrf[59] = -7112428816330510796L;
        fo.hfrf[60] = 6303982055116487253L;
        fo.hfrf[61] = -8028383402424686193L;
        fo.hfrf[62] = 1614099122236578863L;
        fo.hfrf[63] = -7533364681188253054L;
        fo.hfrf[64] = 3687150102234640966L;
        fo.hfrf[65] = -1275920833803993657L;
        fo.hfrf[66] = 2836439418710521674L;
        fo.hfrf[67] = -6497647018122833965L;
        fo.hfrf[68] = -9016330847994515564L;
        fo.hfrf[69] = -3161883627467362418L;
        fo.hfrf[70] = 2613619142644267814L;
        fo.hfrf[71] = 6798502065137157558L;
        fo.hfrf[72] = 344819210967090903L;
        fo.hfrf[73] = 6693330848554731237L;
        fo.hfrf[74] = -3031636364340951749L;
        fo.hfrf[75] = -3598807978091328622L;
        fo.hfrf[76] = -7317275473461145241L;
        fo.hfrf[77] = -5297412640021691452L;
        fo.hfrf[78] = 8567357814930712925L;
        fo.hfrf[79] = 1730764181523107135L;
        fo.hfrf[80] = 2059461655346063453L;
        fo.hfrf[81] = 3976189708626094955L;
        fo.hfrf[82] = 4406979522807763573L;
        fo.hfrf[83] = 5789938412541242981L;
        fo.hfrf[84] = 2207005401922946575L;
        fo.hfrf[85] = 4664323169177975524L;
        fo.hfrf[86] = 5064182197876022826L;
        fo.hfrf[87] = -5871162523977534535L;
        fo.hfrf[88] = 4604388308986459318L;
        fo.hfrf[89] = 7456925718562485034L;
        fo.hfrf[90] = 3174128704630086206L;
        fo.hfrf[91] = 2149306502599876641L;
        fo.hfrf[92] = -3309050320392168979L;
        fo.hfrf[93] = 1533389772983373564L;
        fo.hfrf[94] = 5292239821114121120L;
        fo.hfrf[95] = 4895878090220916948L;
        fo.hfrf[96] = 3537982551023817216L;
        fo.hfrf[97] = -8052317045141163829L;
        fo.hfrf[98] = 3201497851040834155L;
        fo.hfrf[99] = -1080163907935882494L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean replacesOwnClan() {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hgby", hfrd(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1340354964: {
                    v1 = fo.hfla("hgbz", hfrd(int ), (int)72);
                    continue block28;
                }
                case -1274565829: {
                    break block28;
                }
                case -830319841: {
                    v1 = fo.hfla("hgcb", hfrd(int ), (int)73);
                    continue block28;
                }
                case -626096881: {
                    v1 = fo.hfla("hgcc", hfrd(int ), (int)74);
                    continue block28;
                }
            }
            break;
        }
        var3 = fo.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgch", hfrd(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo.hfla("hgci", hfks(int ), (int)151)) break;
            v2 /* !! */  = (long)fo.hfla("hgcj", hfks(int ), (int)152);
        }
        var2_1 /* !! */  = fo.b;
        v3 /* !! */  = fo.og;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(fo.hfla("hgcl", hfrd(int ), (int)77) - fo.hfla("hgck", hfrd(int ), (int)76));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1274565829: {
                    break block30;
                }
                case -818594806: {
                    continue block30;
                }
            }
            break;
        }
        var1_2 = fo.a;
        if (var3) {
            throw null;
lbl37:
            // 6 sources

            return (boolean)fo.hfla("hgcm", hfks(int ), (int)153);
        }
        if (var1_2 || var1_2) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgcn", hfrd(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fo.hfla("hgco", hfks(int ), (int)154)) break;
            v4 /* !! */  = (long)fo.hfla("hgcp", hfks(int ), (int)155);
        }
        var0_3 = fo.instance;
        if (var1_2 || var1_2) ** GOTO lbl37
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_3 == null) ** GOTO lbl83
                if (var1_2) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgcr", hfrd(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fo.hfla("hgcs", hfks(int ), (int)156)) break;
                    v5 /* !! */  = (long)fo.hfla("hgcu", hfks(int ), (int)157);
                }
                if (!var0_3.active()) ** GOTO lbl83
                if (var1_2) ** GOTO lbl37
                v6 /* !! */  = fo.og;
                if (true) ** GOTO lbl65
                block34: while (true) {
                    v6 /* !! */  = (long)(fo.hfla("hgcz", hfrd(int ), (int)81) - fo.hfla("hgcv", hfrd(int ), (int)80));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1274565829: {
                            break block34;
                        }
                        case -1108927282: {
                            continue block34;
                        }
                    }
                    break;
                }
                v7 = var0_3.hideClan;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgda", hfrd(int ), (int)82)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fo.hfla("hgdb", hfks(int ), (int)158)) break;
                    v8 /* !! */  = (long)fo.hfla("hgdc", hfks(int ), (int)159);
                }
                if (!v7.isValue()) ** GOTO lbl83
                if (var1_2) ** GOTO lbl37
                v9 = fo.hfla("hgdd", hfks(int ), (int)160);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl86
lbl83:
                // 3 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v9 = fo.hfla("hgde", hfks(int ), (int)161);
lbl86:
                // 2 sources

                return (boolean)v9;
            }
            case 0: {
                var2_1 /* !! */  = (int)fo.hfla("hgdh", hfks(int ), (int)162);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var2_1 /* !! */  = (int)fo.hfla("hgdj", hfks(int ), (int)163);
                if (!var3) break;
                throw null;
            }
lbl96:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fo.hfla("hgdl", hfks(int ), (int)164);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl101:
            // 2 sources

            case 3: {
                do {
                    var2_1 /* !! */  = (int)fo.hfla("hgdm", hfks(int ), (int)165);
                } while (!var3);
                throw null;
            }
lbl106:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)fo.hfla("hgdn", hfks(int ), (int)166);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl111:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)fo.hfla("hgdo", hfks(int ), (int)167);
                if (var3) {
                    throw null;
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)fo.hfla("hgdp", hfks(int ), (int)168);
                if (!var3) ** GOTO lbl101
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fo.hfla("hgdr", hfks(int ), (int)169);
                    if (!var3) ** GOTO lbl106
                    throw null;
                }
            }
            case 8: {
                var2_1 /* !! */  = (int)fo.hfla("hgdt", hfks(int ), (int)170);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl129:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)fo.hfla("hgdv", hfks(int ), (int)171);
                if (!var3) ** GOTO lbl111
                throw null;
            }
lbl133:
            // 4 sources

            case 10: {
                var2_1 /* !! */  = (int)fo.hfla("hgdw", hfks(int ), (int)172);
                if (!var3) ** GOTO lbl96
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)fo.hfla("hgdy", hfks(int ), (int)173);
        ** while (!var3)
lbl140:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean containsIgnoreCase(String var0, String var1_1) {
        block30: {
            block29: {
                v0 /* !! */  = fo.og;
                if (true) ** GOTO lbl5
                block19: while (true) {
                    v0 /* !! */  = (long)(v1 - fo.hfla("hgwe", hfrd(int ), (int)239));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1274565829: {
                            break block19;
                        }
                        case -1023991320: {
                            v1 = fo.hfla("hgwf", hfrd(int ), (int)240);
                            continue block19;
                        }
                        case -741820589: {
                            v1 = fo.hfla("hgwg", hfrd(int ), (int)241);
                            continue block19;
                        }
                    }
                    break;
                }
                var4_2 = fo.c;
                v2 /* !! */  = fo.og;
                if (true) ** GOTO lbl19
                block20: while (true) {
                    v2 /* !! */  = (long)(fo.hfla("hgwi", hfrd(int ), (int)243) - fo.hfla("hgwh", hfrd(int ), (int)242));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1274565829: {
                            break block20;
                        }
                        case -497846886: {
                            continue block20;
                        }
                    }
                    break;
                }
                var3_3 = fo.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgwj", hfrd(int ), (int)244)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fo.hfla("hgwk", hfks(int ), (int)322)) break;
                    v3 /* !! */  = (long)fo.hfla("hgwl", hfks(int ), (int)323);
                }
                var2_4 = fo.a;
                if (var4_2) {
                    throw null;
lbl33:
                    // 5 sources

                    return (boolean)fo.hfla("hgwm", hfks(int ), (int)324);
                }
                if (var2_4 || var2_4) ** GOTO lbl33
                if (var1_1 == null) break block29;
                if (var2_4) ** GOTO lbl33
                v4 /* !! */  = fo.og;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(v5 - fo.hfla("hgwn", hfrd(int ), (int)245));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1274565829: {
                            break block23;
                        }
                        case -324544969: {
                            v5 = fo.hfla("hgwo", hfrd(int ), (int)246);
                            continue block23;
                        }
                        case 1087074892: {
                            v5 = fo.hfla("hgwp", hfrd(int ), (int)247);
                            continue block23;
                        }
                    }
                    break;
                }
                if (var1_1.isBlank()) break block29;
                if (var2_4) ** GOTO lbl33
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgwq", hfrd(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fo.hfla("hgwr", hfks(int ), (int)325)) break;
                    v6 /* !! */  = (long)fo.hfla("hgws", hfks(int ), (int)326);
                }
                v7 = var0.toLowerCase();
                v8 /* !! */  = fo.og;
                if (true) ** GOTO lbl63
                block25: while (true) {
                    v8 /* !! */  = (long)(v9 - fo.hfla("hgwt", hfrd(int ), (int)249));
lbl63:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1274565829: {
                            break block25;
                        }
                        case -733941084: {
                            v9 = fo.hfla("hgwu", hfrd(int ), (int)250);
                            continue block25;
                        }
                        case -391055375: {
                            v9 = fo.hfla("hgwv", hfrd(int ), (int)251);
                            continue block25;
                        }
                    }
                    break;
                }
                v10 = var1_1.toLowerCase();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgww", hfrd(int ), (int)252)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fo.hfla("hgwx", hfks(int ), (int)327)) break;
                    v11 /* !! */  = (long)fo.hfla("hgwy", hfks(int ), (int)328);
                }
                if (!v7.contains(v10)) break block29;
                if (var2_4) ** GOTO lbl33
                v12 = fo.hfla("hgwz", hfks(int ), (int)329);
                if (var4_2) {
                    throw null;
                }
                break block30;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v12 = fo.hfla("hgxa", hfks(int ), (int)330);
        }
        return (boolean)v12;
    }

    private static /* synthetic */ void hhrb() {
        fo.hfre[200] = -6910258270817593122L;
        fo.hfre[201] = 1093021513624779750L;
        fo.hfre[202] = 8056521416921053003L;
        fo.hfre[203] = 574332098437607378L;
        fo.hfre[204] = 5960452218690657141L;
        fo.hfre[205] = -7038636807062584737L;
        fo.hfre[206] = -6704651547378773807L;
        fo.hfre[207] = -5190389729335590530L;
        fo.hfre[208] = -4643090280921341440L;
        fo.hfre[209] = 1608847999327199316L;
        fo.hfre[210] = -3643338107883641358L;
        fo.hfre[211] = -9122059965275243498L;
        fo.hfre[212] = -1053675129332206976L;
        fo.hfre[213] = -9143111315463989144L;
        fo.hfre[214] = 7289898252864859954L;
        fo.hfre[215] = 4913666145629902887L;
        fo.hfre[216] = 7454911263236464280L;
        fo.hfre[217] = -6422766022400145381L;
        fo.hfre[218] = -1044125258091311287L;
        fo.hfre[219] = -4869067068194211482L;
        fo.hfre[220] = 6001155492188909808L;
        fo.hfre[221] = 5813579990362476186L;
        fo.hfre[222] = -4553071103734012779L;
        fo.hfre[223] = 7887504156586184255L;
        fo.hfre[224] = 3996883289032268159L;
        fo.hfre[225] = 4630384350810068776L;
        fo.hfre[226] = -4694397016423670142L;
        fo.hfre[227] = -3419095805781656218L;
        fo.hfre[228] = -3242584547592045141L;
        fo.hfre[229] = 3948248751164474581L;
        fo.hfre[230] = -6977810116852317698L;
        fo.hfre[231] = -5169552358994454091L;
        fo.hfre[232] = 1122313896308362547L;
        fo.hfre[233] = -7648111630200062971L;
        fo.hfre[234] = -3891355069196753522L;
        fo.hfre[235] = -7833667590976291211L;
        fo.hfre[236] = -9007292563677738166L;
        fo.hfre[237] = -2808335113563747943L;
        fo.hfre[238] = 6426129433120437634L;
        fo.hfre[239] = -6751546003286197754L;
        fo.hfre[240] = 5662034415229275122L;
        fo.hfre[241] = -3105903680226062690L;
        fo.hfre[242] = 5762401286135722720L;
        fo.hfre[243] = 3234517628667417078L;
        fo.hfre[244] = -3333308263297616089L;
        fo.hfre[245] = -2202027966718376877L;
        fo.hfre[246] = -6987463466797641664L;
        fo.hfre[247] = 4663030136968058039L;
        fo.hfre[248] = 4344430260578446008L;
        fo.hfre[249] = -8319193553675206542L;
        fo.hfre[250] = -3353623014321152156L;
        fo.hfre[251] = -2481715350624898848L;
        fo.hfre[252] = 3991234406465050669L;
        fo.hfre[253] = 7689805678669439013L;
        fo.hfre[254] = 1941928907248165612L;
        fo.hfre[255] = -7733038871497041645L;
        fo.hfre[256] = -114893360921231590L;
        fo.hfre[257] = 930175801215797839L;
        fo.hfre[258] = -8440880199321174634L;
        fo.hfre[259] = -5950901400485375708L;
        fo.hfre[260] = 4509359361363255749L;
        fo.hfre[261] = 6894457520002253372L;
        fo.hfre[262] = 5114800860259999819L;
        fo.hfre[263] = 7895137226142955894L;
        fo.hfre[264] = -6508478912494909825L;
        fo.hfre[265] = -7476778268243172762L;
        fo.hfre[266] = -2540107012076284476L;
        fo.hfre[267] = -8403687150842345991L;
        fo.hfre[268] = -648149346260564436L;
        fo.hfre[269] = 6497512190324910001L;
        fo.hfre[270] = -8032271554009123103L;
        fo.hfre[271] = -5655173067458639511L;
        fo.hfre[272] = -6825725049885555907L;
        fo.hfre[273] = -5375058847344392014L;
        fo.hfre[274] = -4298426953255980990L;
        fo.hfre[275] = -7851868439199823574L;
        fo.hfre[276] = -7125231193133037400L;
        fo.hfre[277] = -8187450292353750436L;
        fo.hfre[278] = -339494341728711242L;
        fo.hfre[279] = -5103641890669405224L;
        fo.hfre[280] = 3942897493228847900L;
        fo.hfre[281] = -7250846526926119620L;
        fo.hfre[282] = 6366373227404869764L;
        fo.hfre[283] = -3016031728059261582L;
        fo.hfre[284] = -6913128115362172932L;
        fo.hfre[285] = 495114630904593327L;
        fo.hfre[286] = -2285015832885651584L;
        fo.hfre[287] = 1417149304161171926L;
        fo.hfre[288] = -6270912305475506950L;
        fo.hfre[289] = 8484970686865593312L;
        fo.hfre[290] = -5139825100037385757L;
        fo.hfre[291] = -1473788145449960956L;
        fo.hfre[292] = -1882463867707510030L;
        fo.hfre[293] = 2888644136630865288L;
        fo.hfre[294] = 5766170275717041142L;
        fo.hfre[295] = 8484615434749205207L;
        fo.hfre[296] = 1665991271471612097L;
        fo.hfre[297] = 6852200898609516657L;
        fo.hfre[298] = 4037229887315181941L;
        fo.hfre[299] = 7846722014064258756L;
    }

    private static /* synthetic */ int hfks(int n2) {
        return hfkw[n2] ^ hfky[n2];
    }

    static {
        hfkw = new int[547];
        hfky = new int[547];
        fo.hhkz();
        fo.hhla();
        fo.hhlb();
        fo.hhlc();
        fo.hhld();
        fo.hhlk();
        fo.hhls();
        fo.hhmm();
        fo.hhnc();
        fo.hhnx();
        fo.hhor();
        fo.hhph();
        hfre = new long[399];
        hfrf = new long[399];
        fo.hhpt();
        fo.hhqj();
        fo.hhrb();
        fo.hhrw();
        fo.hhsi();
        fo.hhta();
        fo.hhtq();
        fo.hhtu();
        DONATE = Pattern.compile("(?iu)(?:\u0434\u043e\u043d\u0430\u0442|\u0440\u0430\u043d\u0433)\\s*[:\uff1a]\\s*(.+)$");
        GRIEF = Pattern.compile("(?iu)(\u0433\u0440\u0438\u0444\\s*#?\\s*\\d+)");
        KILLS_DEATHS = Pattern.compile("(?iu)\u0443\\s*/\\s*\u0441\\s*[:\uff1a]?\\s*(\\d+\\s*/\\s*\\d+)");
        CLAN = Pattern.compile("(?iu)\u043a\u043b\u0430\u043d\\s*[:\uff1a]\\s*(.+)$");
        SERVER = Pattern.compile("(?iu)(reallyworld\\.ru)");
    }

    private static /* synthetic */ void hhrw() {
        fo.hfre[300] = 4037559599961577879L;
        fo.hfre[301] = -5614129759919518332L;
        fo.hfre[302] = 8505171554668888973L;
        fo.hfre[303] = 4255682298957670767L;
        fo.hfre[304] = 4516229075844657939L;
        fo.hfre[305] = -4181203109986579117L;
        fo.hfre[306] = -3571288239763068967L;
        fo.hfre[307] = 1937326658623284040L;
        fo.hfre[308] = -2252773040507224708L;
        fo.hfre[309] = 4231293030700638340L;
        fo.hfre[310] = 1207801147511684408L;
        fo.hfre[311] = 5496217331241099506L;
        fo.hfre[312] = 6653055409918116152L;
        fo.hfre[313] = 4569389994889971776L;
        fo.hfre[314] = -2253721697983913228L;
        fo.hfre[315] = 8319735281080565385L;
        fo.hfre[316] = -1237539142389445109L;
        fo.hfre[317] = -9059876625316400284L;
        fo.hfre[318] = -5190116802625150082L;
        fo.hfre[319] = 2298501641091949740L;
        fo.hfre[320] = -3025323856392190007L;
        fo.hfre[321] = -5627411420775178192L;
        fo.hfre[322] = 8488574839486871726L;
        fo.hfre[323] = -7524338541181535275L;
        fo.hfre[324] = 8390846045155660411L;
        fo.hfre[325] = -454479042134624862L;
        fo.hfre[326] = 1308946725973541698L;
        fo.hfre[327] = -5616940709152823290L;
        fo.hfre[328] = -8866612013721277517L;
        fo.hfre[329] = 4000490403694667538L;
        fo.hfre[330] = 5960516144372946264L;
        fo.hfre[331] = -953174072806637516L;
        fo.hfre[332] = 4383101239588738561L;
        fo.hfre[333] = 5718447101944919983L;
        fo.hfre[334] = 715339222888166400L;
        fo.hfre[335] = 853534719001476483L;
        fo.hfre[336] = -2327152793127528117L;
        fo.hfre[337] = -3922564438063953394L;
        fo.hfre[338] = -4722823608856044788L;
        fo.hfre[339] = -3010364737671539807L;
        fo.hfre[340] = -7769306195177884784L;
        fo.hfre[341] = 2035993786775747248L;
        fo.hfre[342] = 6846915830145629672L;
        fo.hfre[343] = -2498232113507127255L;
        fo.hfre[344] = -2449733433507740442L;
        fo.hfre[345] = 3344837357993059524L;
        fo.hfre[346] = 1643793082264079878L;
        fo.hfre[347] = -2164892989327096594L;
        fo.hfre[348] = 718025417952204218L;
        fo.hfre[349] = 9206076509171347991L;
        fo.hfre[350] = -3467272853996488700L;
        fo.hfre[351] = -8311365755674023624L;
        fo.hfre[352] = 8937895156175480231L;
        fo.hfre[353] = -1023170632665229320L;
        fo.hfre[354] = 7443638075303213870L;
        fo.hfre[355] = 3534290016653414191L;
        fo.hfre[356] = -3415458304961933390L;
        fo.hfre[357] = -8727431855749512083L;
        fo.hfre[358] = -9192892689153044169L;
        fo.hfre[359] = -2482247748384018134L;
        fo.hfre[360] = -3216091098380769723L;
        fo.hfre[361] = 4977828188211864805L;
        fo.hfre[362] = -8277616696832500013L;
        fo.hfre[363] = 6492561827529354778L;
        fo.hfre[364] = -1365410334225566671L;
        fo.hfre[365] = -8872449077114019825L;
        fo.hfre[366] = 3640066492918167848L;
        fo.hfre[367] = -8351330680700376229L;
        fo.hfre[368] = 1217991143155178836L;
        fo.hfre[369] = -4495261183005311320L;
        fo.hfre[370] = -741077490513099934L;
        fo.hfre[371] = -8558395924991130084L;
        fo.hfre[372] = 148671113637901349L;
        fo.hfre[373] = -713784812506361799L;
        fo.hfre[374] = 2990630882938099259L;
        fo.hfre[375] = 220407409254578492L;
        fo.hfre[376] = 3529391269079168006L;
        fo.hfre[377] = -3003983673290855092L;
        fo.hfre[378] = 6664588766134038116L;
        fo.hfre[379] = 7093566812383968880L;
        fo.hfre[380] = 5188587211943962595L;
        fo.hfre[381] = 5967621894072205033L;
        fo.hfre[382] = -3901136351698631087L;
        fo.hfre[383] = -5260507913167793036L;
        fo.hfre[384] = 3775640150280793525L;
        fo.hfre[385] = -2840124896053572292L;
        fo.hfre[386] = -3553256484235626443L;
        fo.hfre[387] = 4654163928412504739L;
        fo.hfre[388] = 4958479367677693691L;
        fo.hfre[389] = 1985074684765158164L;
        fo.hfre[390] = -8374297296522496376L;
        fo.hfre[391] = 7398111557873466916L;
        fo.hfre[392] = 8657428730371917656L;
        fo.hfre[393] = 4110834243956818067L;
        fo.hfre[394] = -71743446395777048L;
        fo.hfre[395] = 5020217447729492741L;
        fo.hfre[396] = -4500830403097969923L;
        fo.hfre[397] = -3780622278214953568L;
        fo.hfre[398] = 6029798134931347631L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Optional lambda$segments$1(int[] var0, List var1_1, class_2583 var2_2, String var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hhif", hfrd(int ), (int)362)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo.hfla("hhig", hfks(int ), (int)512)) break;
            v0 /* !! */  = (long)fo.hfla("hhih", hfks(int ), (int)513);
        }
        var7_4 = fo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hhii", hfrd(int ), (int)363)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo.hfla("hhij", hfks(int ), (int)514)) break;
            v1 /* !! */  = (long)fo.hfla("hhik", hfks(int ), (int)515);
        }
        var6_5 /* !! */  = fo.b;
        v2 /* !! */  = fo.og;
        if (true) ** GOTO lbl19
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - fo.hfla("hhil", hfrd(int ), (int)364));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1274565829: {
                    break block42;
                }
                case -530188623: {
                    v3 = fo.hfla("hhim", hfrd(int ), (int)365);
                    continue block42;
                }
                case 1996914692: {
                    v3 = fo.hfla("hhin", hfrd(int ), (int)366);
                    continue block42;
                }
            }
            break;
        }
        var5_6 = fo.a;
        if (var7_4) {
            throw null;
lbl31:
            // 5 sources

            return null;
        }
        if (var5_6 || var5_6) ** GOTO lbl31
        var4_7 = var0[0];
        if (var5_6) ** GOTO lbl31
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_6) ** GOTO lbl31
                v4 = var0[0];
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hhio", hfrd(int ), (int)367)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fo.hfla("hhip", hfks(int ), (int)516)) break;
                    v5 /* !! */  = (long)fo.hfla("hhiq", hfks(int ), (int)517);
                }
                var0[0] = v4 + var3_3.length();
                if (var5_6 || var5_6) ** GOTO lbl31
                v6 /* !! */  = fo.og;
                if (true) ** GOTO lbl53
                block45: while (true) {
                    v6 /* !! */  = (long)(v7 - fo.hfla("hhir", hfrd(int ), (int)368));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2064648185: {
                            v7 = fo.hfla("hhis", hfrd(int ), (int)369);
                            continue block45;
                        }
                        case -1274565829: {
                            break block45;
                        }
                        case 1809133576: {
                            v7 = fo.hfla("hhit", hfrd(int ), (int)370);
                            continue block45;
                        }
                    }
                    break;
                }
                v8 = var0[0];
                v9 /* !! */  = fo.og;
                if (true) ** GOTO lbl67
                block46: while (true) {
                    v9 /* !! */  = (long)(v10 - fo.hfla("hhiu", hfrd(int ), (int)371));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1274565829: {
                            break block46;
                        }
                        case -261524160: {
                            v10 = fo.hfla("hhiv", hfrd(int ), (int)372);
                            continue block46;
                        }
                        case 708128510: {
                            v10 = fo.hfla("hhiw", hfrd(int ), (int)373);
                            continue block46;
                        }
                        case 1758341943: {
                            v10 = fo.hfla("hhix", hfrd(int ), (int)374);
                            continue block46;
                        }
                    }
                    break;
                }
                v11 = new fo$Segment(var4_7, v8, var3_3, var2_2);
                v12 /* !! */  = fo.og;
                if (true) ** GOTO lbl84
                block47: while (true) {
                    v12 /* !! */  = (long)(v13 - fo.hfla("hhiy", hfrd(int ), (int)375));
lbl84:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1821523735: {
                            v13 = fo.hfla("hhiz", hfrd(int ), (int)376);
                            continue block47;
                        }
                        case -1622338213: {
                            v13 = fo.hfla("hhja", hfrd(int ), (int)377);
                            continue block47;
                        }
                        case -1274565829: {
                            break block47;
                        }
                        case 77549484: {
                            v13 = fo.hfla("hhjb", hfrd(int ), (int)378);
                            continue block47;
                        }
                    }
                    break;
                }
                var1_1.add(v11);
                if (!var5_6 && !var5_6) ** break;
                ** continue;
                v14 /* !! */  = fo.og;
                if (true) ** GOTO lbl104
                block48: while (true) {
                    v14 /* !! */  = (long)(v15 - fo.hfla("hhjc", hfrd(int ), (int)379));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1274565829: {
                            break block48;
                        }
                        case -435321679: {
                            v15 = fo.hfla("hhjd", hfrd(int ), (int)380);
                            continue block48;
                        }
                        case -212007368: {
                            v15 = fo.hfla("hhje", hfrd(int ), (int)381);
                            continue block48;
                        }
                        case -127353344: {
                            v15 = fo.hfla("hhjf", hfrd(int ), (int)382);
                            continue block48;
                        }
                    }
                    break;
                }
                return Optional.empty();
            }
lbl117:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)fo.hfla("hhjg", hfks(int ), (int)518);
                if (var7_4) {
                    throw null;
                }
            }
lbl121:
            // 4 sources

            case 1: {
                var6_5 /* !! */  = (int)fo.hfla("hhjh", hfks(int ), (int)519);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl126:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)fo.hfla("hhji", hfks(int ), (int)520);
                if (!var7_4) ** GOTO lbl117
                throw null;
            }
lbl130:
            // 3 sources

            case 3: {
                var6_5 /* !! */  = (int)fo.hfla("hhjj", hfks(int ), (int)521);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 4: {
                var6_5 /* !! */  = (int)fo.hfla("hhjk", hfks(int ), (int)522);
                if (!var7_4) ** GOTO lbl126
                throw null;
            }
lbl139:
            // 2 sources

            case 5: {
                var6_5 /* !! */  = (int)fo.hfla("hhjl", hfks(int ), (int)523);
                if (!var7_4) ** GOTO lbl130
                throw null;
            }
lbl143:
            // 2 sources

            case 6: {
                var6_5 /* !! */  = (int)fo.hfla("hhjm", hfks(int ), (int)524);
                if (!var7_4) ** GOTO lbl121
                throw null;
            }
            case 7: {
                var6_5 /* !! */  = (int)fo.hfla("hhjn", hfks(int ), (int)525);
                if (!var7_4) ** GOTO lbl117
                throw null;
            }
            case 8: {
                var6_5 /* !! */  = (int)fo.hfla("hhjo", hfks(int ), (int)526);
                if (!var7_4) ** GOTO lbl130
                throw null;
            }
            case 9: 
        }
        do {
            var6_5 /* !! */  = (int)fo.hfla("hhjp", hfks(int ), (int)527);
        } while (!var7_4);
        throw null;
    }

    private static /* synthetic */ void hhlc() {
        fo.hfkw[300] = 496456480;
        fo.hfkw[301] = -1560368965;
        fo.hfkw[302] = -1673436650;
        fo.hfkw[303] = 1844737341;
        fo.hfkw[304] = 911205026;
        fo.hfkw[305] = 437966590;
        fo.hfkw[306] = -814479805;
        fo.hfkw[307] = 660381731;
        fo.hfkw[308] = -1916940648;
        fo.hfkw[309] = 1273053097;
        fo.hfkw[310] = 703956130;
        fo.hfkw[311] = -1412860412;
        fo.hfkw[312] = -1254280547;
        fo.hfkw[313] = 125771501;
        fo.hfkw[314] = 815551536;
        fo.hfkw[315] = 1327287564;
        fo.hfkw[316] = 935929961;
        fo.hfkw[317] = 961519461;
        fo.hfkw[318] = 876814754;
        fo.hfkw[319] = -1292248298;
        fo.hfkw[320] = -1256211649;
        fo.hfkw[321] = 1629471692;
        fo.hfkw[322] = 1201851486;
        fo.hfkw[323] = 364204811;
        fo.hfkw[324] = -370013623;
        fo.hfkw[325] = 2116158364;
        fo.hfkw[326] = 551939713;
        fo.hfkw[327] = 671309554;
        fo.hfkw[328] = -1318451;
        fo.hfkw[329] = 108276444;
        fo.hfkw[330] = 1432265300;
        fo.hfkw[331] = 1175810541;
        fo.hfkw[332] = 905857645;
        fo.hfkw[333] = 1139854826;
        fo.hfkw[334] = 937432917;
        fo.hfkw[335] = -1587658516;
        fo.hfkw[336] = -1173465520;
        fo.hfkw[337] = 114881844;
        fo.hfkw[338] = 1848815901;
        fo.hfkw[339] = 259953523;
        fo.hfkw[340] = -1903433868;
        fo.hfkw[341] = 22063617;
        fo.hfkw[342] = 1667614247;
        fo.hfkw[343] = 1983302658;
        fo.hfkw[344] = -466395452;
        fo.hfkw[345] = 1717532430;
        fo.hfkw[346] = -405505711;
        fo.hfkw[347] = 1357012368;
        fo.hfkw[348] = 1645101801;
        fo.hfkw[349] = 2111179122;
        fo.hfkw[350] = -442771600;
        fo.hfkw[351] = -1987883193;
        fo.hfkw[352] = 732906604;
        fo.hfkw[353] = -2093325515;
        fo.hfkw[354] = 1668444963;
        fo.hfkw[355] = 674786573;
        fo.hfkw[356] = -221073020;
        fo.hfkw[357] = -1203179119;
        fo.hfkw[358] = -224944953;
        fo.hfkw[359] = 1285291154;
        fo.hfkw[360] = 1719529715;
        fo.hfkw[361] = -1497956373;
        fo.hfkw[362] = 1499771011;
        fo.hfkw[363] = 1765616642;
        fo.hfkw[364] = 1521178286;
        fo.hfkw[365] = 1404960910;
        fo.hfkw[366] = -125201482;
        fo.hfkw[367] = -199246977;
        fo.hfkw[368] = 1619649455;
        fo.hfkw[369] = -393381400;
        fo.hfkw[370] = 740832622;
        fo.hfkw[371] = 1144330711;
        fo.hfkw[372] = 994799825;
        fo.hfkw[373] = -2086499790;
        fo.hfkw[374] = 1268053492;
        fo.hfkw[375] = -454488931;
        fo.hfkw[376] = 798214759;
        fo.hfkw[377] = -1283508499;
        fo.hfkw[378] = -1233381428;
        fo.hfkw[379] = 1474900952;
        fo.hfkw[380] = -1681948604;
        fo.hfkw[381] = 1814756137;
        fo.hfkw[382] = -947216692;
        fo.hfkw[383] = -940572647;
        fo.hfkw[384] = 761359662;
        fo.hfkw[385] = 1904822455;
        fo.hfkw[386] = -1086471131;
        fo.hfkw[387] = -682410479;
        fo.hfkw[388] = -694983355;
        fo.hfkw[389] = 364486272;
        fo.hfkw[390] = 1866597419;
        fo.hfkw[391] = 752794572;
        fo.hfkw[392] = -771967530;
        fo.hfkw[393] = 2083471083;
        fo.hfkw[394] = 1412138021;
        fo.hfkw[395] = 164305477;
        fo.hfkw[396] = -640408739;
        fo.hfkw[397] = -711760798;
        fo.hfkw[398] = -1595472499;
        fo.hfkw[399] = -199783951;
    }

    private static /* synthetic */ void hhnx() {
        fo.hfky[300] = 496456497;
        fo.hfky[301] = -1560368966;
        fo.hfky[302] = -1673436642;
        fo.hfky[303] = 1844737325;
        fo.hfky[304] = 911205044;
        fo.hfky[305] = 437966567;
        fo.hfky[306] = -814479799;
        fo.hfky[307] = 660381736;
        fo.hfky[308] = -1916940654;
        fo.hfky[309] = 1273053092;
        fo.hfky[310] = 703956131;
        fo.hfky[311] = 132727276;
        fo.hfky[312] = 1254280546;
        fo.hfky[313] = -312698546;
        fo.hfky[314] = -815551537;
        fo.hfky[315] = -1092646396;
        fo.hfky[316] = -935929962;
        fo.hfky[317] = -54052285;
        fo.hfky[318] = 876814755;
        fo.hfky[319] = -1292248298;
        fo.hfky[320] = -1256211649;
        fo.hfky[321] = 1629471694;
        fo.hfky[322] = -1201851487;
        fo.hfky[323] = -504282309;
        fo.hfky[324] = -370013624;
        fo.hfky[325] = 2116158365;
        fo.hfky[326] = 194755840;
        fo.hfky[327] = -671309555;
        fo.hfky[328] = 2084668497;
        fo.hfky[329] = 108276445;
        fo.hfky[330] = 1432265300;
        fo.hfky[331] = 1175810536;
        fo.hfky[332] = 905857646;
        fo.hfky[333] = 1139854826;
        fo.hfky[334] = 937432913;
        fo.hfky[335] = -1587658523;
        fo.hfky[336] = -1173465514;
        fo.hfky[337] = 114881847;
        fo.hfky[338] = 1848815901;
        fo.hfky[339] = 259953521;
        fo.hfky[340] = -1903433870;
        fo.hfky[341] = -22063618;
        fo.hfky[342] = 632760616;
        fo.hfky[343] = -1983302659;
        fo.hfky[344] = -461660794;
        fo.hfky[345] = 1717532430;
        fo.hfky[346] = -405505712;
        fo.hfky[347] = 1357012370;
        fo.hfky[348] = 1645101800;
        fo.hfky[349] = 2111179123;
        fo.hfky[350] = -442771599;
        fo.hfky[351] = -1987883194;
        fo.hfky[352] = 732906604;
        fo.hfky[353] = -2093325527;
        fo.hfky[354] = 1668444931;
        fo.hfky[355] = 674786584;
        fo.hfky[356] = -221072994;
        fo.hfky[357] = -1203179115;
        fo.hfky[358] = -224944948;
        fo.hfky[359] = 1285291151;
        fo.hfky[360] = 1719529722;
        fo.hfky[361] = -1497956378;
        fo.hfky[362] = 1499771036;
        fo.hfky[363] = 1765616654;
        fo.hfky[364] = 1521178287;
        fo.hfky[365] = 1404960907;
        fo.hfky[366] = -125201483;
        fo.hfky[367] = -199246997;
        fo.hfky[368] = 1619649445;
        fo.hfky[369] = -393381403;
        fo.hfky[370] = 740832614;
        fo.hfky[371] = 1144330689;
        fo.hfky[372] = 994799809;
        fo.hfky[373] = -2086499778;
        fo.hfky[374] = 1268053497;
        fo.hfky[375] = -454488955;
        fo.hfky[376] = 798214759;
        fo.hfky[377] = -1283508488;
        fo.hfky[378] = -1233381426;
        fo.hfky[379] = 1474900951;
        fo.hfky[380] = -1681948608;
        fo.hfky[381] = 1814756105;
        fo.hfky[382] = -947216697;
        fo.hfky[383] = -940572646;
        fo.hfky[384] = 761359676;
        fo.hfky[385] = 1904822438;
        fo.hfky[386] = 1086471130;
        fo.hfky[387] = 2016014910;
        fo.hfky[388] = 694983354;
        fo.hfky[389] = 1607034000;
        fo.hfky[390] = 1866597418;
        fo.hfky[391] = -752794573;
        fo.hfky[392] = -204747662;
        fo.hfky[393] = 2083471083;
        fo.hfky[394] = 1412138020;
        fo.hfky[395] = 164305476;
        fo.hfky[396] = 640408738;
        fo.hfky[397] = -651371845;
        fo.hfky[398] = 1595472498;
        fo.hfky[399] = -1971620536;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void remember(class_2561 var1_1, Pattern var2_2, boolean var3_3) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block64: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hgsx", hfrd(int ), (int)203));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block64;
                }
                case -784761900: {
                    v1 = fo.hfla("hgsy", hfrd(int ), (int)204);
                    continue block64;
                }
                case -463562597: {
                    v1 = fo.hfla("hgsz", hfrd(int ), (int)205);
                    continue block64;
                }
                case 449568417: {
                    v1 = fo.hfla("hgta", hfrd(int ), (int)206);
                    continue block64;
                }
            }
            break;
        }
        var8_4 = fo.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgtb", hfrd(int ), (int)207)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fo.hfla("hgtc", hfks(int ), (int)273)) break;
            v2 /* !! */  = (long)fo.hfla("hgtd", hfks(int ), (int)274);
        }
        var7_5 /* !! */  = fo.b;
        v3 /* !! */  = fo.og;
        if (true) ** GOTO lbl28
        block66: while (true) {
            v3 /* !! */  = (long)(v4 - fo.hfla("hgte", hfrd(int ), (int)208));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1274565829: {
                    break block66;
                }
                case -644866622: {
                    v4 = fo.hfla("hgtf", hfrd(int ), (int)209);
                    continue block66;
                }
                case 2045295004: {
                    v4 = fo.hfla("hgtg", hfrd(int ), (int)210);
                    continue block66;
                }
            }
            break;
        }
        var6_6 = fo.a;
        if (!var8_4) ** GOTO lbl44
        throw null;
        {
            if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_5 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl44:
                // 1 sources

                if (var6_6 || var6_6) continue block67;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgth", hfrd(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fo.hfla("hgti", hfks(int ), (int)275)) break;
                    v5 /* !! */  = (long)fo.hfla("hgtj", hfks(int ), (int)276);
                }
                v6 = var1_1.getString();
                v7 /* !! */  = fo.og;
                if (true) ** GOTO lbl55
                block69: while (true) {
                    v7 /* !! */  = (long)(v8 - fo.hfla("hgtk", hfrd(int ), (int)212));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1274565829: {
                            break block69;
                        }
                        case -467196937: {
                            v8 = fo.hfla("hgtl", hfrd(int ), (int)213);
                            continue block69;
                        }
                        case 24555063: {
                            v8 = fo.hfla("hgtm", hfrd(int ), (int)214);
                            continue block69;
                        }
                        case 1201393362: {
                            v8 = fo.hfla("hgtn", hfrd(int ), (int)215);
                            continue block69;
                        }
                    }
                    break;
                }
                var4_7 = var2_2.matcher(v6);
                if (var6_6 || var6_6) continue block67;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgto", hfrd(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fo.hfla("hgtp", hfks(int ), (int)277)) break;
                    v9 /* !! */  = (long)fo.hfla("hgtq", hfks(int ), (int)278);
                }
                if (!var4_7.find()) {
                    if (var6_6) continue block67;
                    return;
                }
                if (var6_6 || var6_6) continue block67;
                v10 = fo.hfla("hgtr", hfks(int ), (int)279);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgts", hfrd(int ), (int)217)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fo.hfla("hgtt", hfks(int ), (int)280)) break;
                    v11 /* !! */  = (long)fo.hfla("hgtu", hfks(int ), (int)281);
                }
                v12 = var4_7.group((int)v10);
                v13 /* !! */  = fo.og;
                if (true) ** GOTO lbl89
                block72: while (true) {
                    v13 /* !! */  = (long)(v14 - fo.hfla("hgtv", hfrd(int ), (int)218));
lbl89:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1274565829: {
                            break block72;
                        }
                        case -1137216125: {
                            v14 = fo.hfla("hgtw", hfrd(int ), (int)219);
                            continue block72;
                        }
                        case 1110961090: {
                            v14 = fo.hfla("hgtx", hfrd(int ), (int)220);
                            continue block72;
                        }
                    }
                    break;
                }
                var5_8 = v12.trim();
                if (var6_6 || var6_6) continue block67;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hgty", hfrd(int ), (int)221)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fo.hfla("hgtz", hfks(int ), (int)282)) break;
                    v15 /* !! */  = (long)fo.hfla("hgua", hfks(int ), (int)283);
                }
                if (var5_8.isEmpty()) ** GOTO lbl123
                if (var6_6) continue block67;
                v16 /* !! */  = fo.og;
                if (true) ** GOTO lbl111
                block74: while (true) {
                    v16 /* !! */  = (long)(v17 - fo.hfla("hgub", hfrd(int ), (int)222));
lbl111:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1466821236: {
                            v17 = fo.hfla("hguc", hfrd(int ), (int)223);
                            continue block74;
                        }
                        case -1274565829: {
                            break block74;
                        }
                        case 678331010: {
                            v17 = fo.hfla("hgud", hfrd(int ), (int)224);
                            continue block74;
                        }
                    }
                    break;
                }
                if (var5_8.equalsIgnoreCase("\u0431\u0443\u0440\u043c\u0430\u043b\u0434\u0430")) {
                    if (var6_6) continue block67;
                }
                ** GOTO lbl125
lbl123:
                // 2 sources

                if (var6_6 || var6_6) continue block67;
                return;
lbl125:
                // 1 sources

                if (var6_6 || var6_6) continue block67;
                if (!var3_3) ** GOTO lbl146
                if (var6_6) continue block67;
                v18 /* !! */  = fo.og;
                if (true) ** GOTO lbl132
                block75: while (true) {
                    v18 /* !! */  = (long)(v19 - fo.hfla("hgue", hfrd(int ), (int)225));
lbl132:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1274565829: {
                            break block75;
                        }
                        case -51791988: {
                            v19 = fo.hfla("hguf", hfrd(int ), (int)226);
                            continue block75;
                        }
                        case 2065742197: {
                            v19 = fo.hfla("hgug", hfrd(int ), (int)227);
                            continue block75;
                        }
                    }
                    break;
                }
                this.originalDonate = var5_8;
                if (var6_6) continue block67;
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl158
lbl146:
                // 1 sources

                if (var6_6 || var6_6) continue block67;
                v20 /* !! */  = fo.og;
                if (true) ** GOTO lbl151
                block76: while (true) {
                    v20 /* !! */  = (long)(fo.hfla("hgui", hfrd(int ), (int)229) - fo.hfla("hguh", hfrd(int ), (int)228));
lbl151:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1580973156: {
                            continue block76;
                        }
                        case -1274565829: {
                            break block76;
                        }
                    }
                    break;
                }
                this.originalClan = var5_8;
                if (var6_6) continue block67;
lbl158:
                // 2 sources

                if (!var6_6 && !var6_6) ** break;
                continue block67;
                return;
lbl161:
                // 3 sources

                case 0: {
                    var7_5 /* !! */  = (int)fo.hfla("hguj", hfks(int ), (int)284);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
                case 1: {
                    do {
                        var7_5 /* !! */  = (int)fo.hfla("hguk", hfks(int ), (int)285);
                    } while (!var8_4);
                    throw null;
                }
lbl171:
                // 2 sources

                case 2: {
                    var7_5 /* !! */  = (int)fo.hfla("hgul", hfks(int ), (int)286);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 3: {
                    var7_5 /* !! */  = (int)fo.hfla("hgum", hfks(int ), (int)287);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 4: {
                    var7_5 /* !! */  = (int)fo.hfla("hgun", hfks(int ), (int)288);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
lbl186:
                // 2 sources

                case 5: {
                    var7_5 /* !! */  = (int)fo.hfla("hguo", hfks(int ), (int)289);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl191:
                // 2 sources

                case 6: {
                    var7_5 /* !! */  = (int)fo.hfla("hgup", hfks(int ), (int)290);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl206
                }
                case 7: {
                    var7_5 /* !! */  = (int)fo.hfla("hguq", hfks(int ), (int)291);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
                case 8: {
                    var7_5 /* !! */  = (int)fo.hfla("hgur", hfks(int ), (int)292);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl206:
                // 4 sources

                case 9: {
                    var7_5 /* !! */  = (int)fo.hfla("hgus", hfks(int ), (int)293);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl246
                }
lbl211:
                // 3 sources

                case 10: {
                    var7_5 /* !! */  = (int)fo.hfla("hgut", hfks(int ), (int)294);
                    if (!var8_4) ** GOTO lbl161
                    throw null;
                }
                case 11: {
                    var7_5 /* !! */  = (int)fo.hfla("hguu", hfks(int ), (int)295);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl220:
                // 3 sources

                case 12: {
                    var7_5 /* !! */  = (int)fo.hfla("hguv", hfks(int ), (int)296);
                    if (var8_4) {
                        throw null;
                    }
                }
                case 13: {
                    var7_5 /* !! */  = (int)fo.hfla("hguw", hfks(int ), (int)297);
                    if (!var8_4) ** GOTO lbl211
                    throw null;
                }
                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_5 /* !! */  = (int)fo.hfla("hgux", hfks(int ), (int)298);
                        if (!var8_4) ** GOTO lbl206
                        throw null;
                    }
                }
lbl233:
                // 2 sources

                case 15: {
                    var7_5 /* !! */  = (int)fo.hfla("hguy", hfks(int ), (int)299);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl238:
                // 2 sources

                case 16: {
                    var7_5 /* !! */  = (int)fo.hfla("hguz", hfks(int ), (int)300);
                    if (!var8_4) ** GOTO lbl206
                    throw null;
                }
lbl242:
                // 2 sources

                case 17: {
                    var7_5 /* !! */  = (int)fo.hfla("hgva", hfks(int ), (int)301);
                    if (!var8_4) ** GOTO lbl186
                    throw null;
                }
lbl246:
                // 3 sources

                case 18: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvb", hfks(int ), (int)302);
                    if (!var8_4) ** GOTO lbl171
                    throw null;
                }
lbl250:
                // 4 sources

                case 19: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvc", hfks(int ), (int)303);
                    if (!var8_4) ** GOTO lbl242
                    throw null;
                }
                case 20: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvd", hfks(int ), (int)304);
                    if (var8_4) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl259:
                // 2 sources

                case 21: {
                    var7_5 /* !! */  = (int)fo.hfla("hgve", hfks(int ), (int)305);
                    if (!var8_4) ** GOTO lbl250
                    throw null;
                }
lbl263:
                // 2 sources

                case 22: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvf", hfks(int ), (int)306);
                    if (!var8_4) ** GOTO lbl191
                    throw null;
                }
                case 23: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvg", hfks(int ), (int)307);
                    if (!var8_4) ** GOTO lbl161
                    throw null;
                }
lbl271:
                // 2 sources

                case 24: {
                    var7_5 /* !! */  = (int)fo.hfla("hgvh", hfks(int ), (int)308);
                    if (!var8_4) ** GOTO lbl211
                    throw null;
                }
                case 25: 
            }
        }
        var7_5 /* !! */  = (int)fo.hfla("hgvi", hfks(int ), (int)309);
        ** while (!var8_4)
lbl278:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhkz() {
        fo.hfkw[0] = -1674911209;
        fo.hfkw[1] = -1727079596;
        fo.hfkw[2] = -1177878579;
        fo.hfkw[3] = -276175893;
        fo.hfkw[4] = -560966514;
        fo.hfkw[5] = -58595499;
        fo.hfkw[6] = 1926311601;
        fo.hfkw[7] = -990236078;
        fo.hfkw[8] = -612995622;
        fo.hfkw[9] = 1377062273;
        fo.hfkw[10] = 276312137;
        fo.hfkw[11] = -951836576;
        fo.hfkw[12] = 1879385802;
        fo.hfkw[13] = -1486937035;
        fo.hfkw[14] = -2038252767;
        fo.hfkw[15] = 1056083900;
        fo.hfkw[16] = 1260173789;
        fo.hfkw[17] = 1307069180;
        fo.hfkw[18] = 1420761868;
        fo.hfkw[19] = 248982168;
        fo.hfkw[20] = -1774523478;
        fo.hfkw[21] = 896198919;
        fo.hfkw[22] = 924175038;
        fo.hfkw[23] = 1416256776;
        fo.hfkw[24] = 801240402;
        fo.hfkw[25] = -57025983;
        fo.hfkw[26] = 535435070;
        fo.hfkw[27] = 588091527;
        fo.hfkw[28] = 1794176509;
        fo.hfkw[29] = -1405353822;
        fo.hfkw[30] = 1313429551;
        fo.hfkw[31] = 864102901;
        fo.hfkw[32] = 1685589171;
        fo.hfkw[33] = 135258837;
        fo.hfkw[34] = 1166636914;
        fo.hfkw[35] = -1199559960;
        fo.hfkw[36] = -57638072;
        fo.hfkw[37] = -1602935555;
        fo.hfkw[38] = 675271514;
        fo.hfkw[39] = 594412850;
        fo.hfkw[40] = 52668789;
        fo.hfkw[41] = 998073059;
        fo.hfkw[42] = 105234068;
        fo.hfkw[43] = -1000245684;
        fo.hfkw[44] = -1911470596;
        fo.hfkw[45] = -1855092500;
        fo.hfkw[46] = 93330460;
        fo.hfkw[47] = -2146591329;
        fo.hfkw[48] = 1733346292;
        fo.hfkw[49] = -407505488;
        fo.hfkw[50] = -1224481668;
        fo.hfkw[51] = 1617543357;
        fo.hfkw[52] = -21595112;
        fo.hfkw[53] = -1896284571;
        fo.hfkw[54] = 717852403;
        fo.hfkw[55] = 1309373643;
        fo.hfkw[56] = -203898205;
        fo.hfkw[57] = 1109174768;
        fo.hfkw[58] = 2134747677;
        fo.hfkw[59] = 2133729255;
        fo.hfkw[60] = -1507419968;
        fo.hfkw[61] = -2032290997;
        fo.hfkw[62] = 1119691375;
        fo.hfkw[63] = 161350022;
        fo.hfkw[64] = -302240988;
        fo.hfkw[65] = 2032609726;
        fo.hfkw[66] = 1735392858;
        fo.hfkw[67] = -445890644;
        fo.hfkw[68] = 1067416734;
        fo.hfkw[69] = 1792229955;
        fo.hfkw[70] = -1431000271;
        fo.hfkw[71] = 1431189478;
        fo.hfkw[72] = 244093491;
        fo.hfkw[73] = -708474784;
        fo.hfkw[74] = 385893545;
        fo.hfkw[75] = -477388756;
        fo.hfkw[76] = 1041121502;
        fo.hfkw[77] = -396926275;
        fo.hfkw[78] = 1326302331;
        fo.hfkw[79] = 598641251;
        fo.hfkw[80] = -69613579;
        fo.hfkw[81] = -504033614;
        fo.hfkw[82] = -1923769373;
        fo.hfkw[83] = 528974828;
        fo.hfkw[84] = 885044707;
        fo.hfkw[85] = 1085523913;
        fo.hfkw[86] = -301737640;
        fo.hfkw[87] = -1247148967;
        fo.hfkw[88] = 924003294;
        fo.hfkw[89] = -101880741;
        fo.hfkw[90] = 1520120112;
        fo.hfkw[91] = -1852766404;
        fo.hfkw[92] = 792233092;
        fo.hfkw[93] = -1688737368;
        fo.hfkw[94] = 1825276816;
        fo.hfkw[95] = -1816003196;
        fo.hfkw[96] = -1424518292;
        fo.hfkw[97] = 1904623426;
        fo.hfkw[98] = -1413236425;
        fo.hfkw[99] = 2053598504;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean replacesOwnDonate() {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hfzz", hfrd(int ), (int)61));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block23;
                }
                case 252539189: {
                    v1 = fo.hfla("hgaa", hfrd(int ), (int)62);
                    continue block23;
                }
                case 1938246856: {
                    v1 = fo.hfla("hgab", hfrd(int ), (int)63);
                    continue block23;
                }
            }
            break;
        }
        var3 = fo.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgac", hfrd(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo.hfla("hgad", hfks(int ), (int)126)) break;
            v2 /* !! */  = (long)fo.hfla("hgae", hfks(int ), (int)127);
        }
        var2_1 /* !! */  = fo.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgak", hfrd(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo.hfla("hgal", hfks(int ), (int)128)) break;
                    v3 /* !! */  = (long)fo.hfla("hgan", hfks(int ), (int)129);
                }
                var1_2 = fo.a;
                if (var3) {
                    throw null;
lbl34:
                    // 6 sources

                    return (boolean)fo.hfla("hgao", hfks(int ), (int)130);
                }
                if (var1_2 || var1_2) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgap", hfrd(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fo.hfla("hgaq", hfks(int ), (int)131)) break;
                    v4 /* !! */  = (long)fo.hfla("hgar", hfks(int ), (int)132);
                }
                var0_3 = fo.instance;
                if (var1_2 || var1_2) ** GOTO lbl34
                if (var0_3 == null) ** GOTO lbl77
                if (var1_2) ** GOTO lbl34
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgat", hfrd(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fo.hfla("hgau", hfks(int ), (int)133)) break;
                    v5 /* !! */  = (long)fo.hfla("hgav", hfks(int ), (int)134);
                }
                if (!var0_3.active()) ** GOTO lbl77
                if (var1_2) ** GOTO lbl34
                v6 /* !! */  = fo.og;
                if (true) ** GOTO lbl59
                block29: while (true) {
                    v6 /* !! */  = (long)(fo.hfla("hgax", hfrd(int ), (int)69) - fo.hfla("hgaw", hfrd(int ), (int)68));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1304683146: {
                            continue block29;
                        }
                        case -1274565829: {
                            break block29;
                        }
                    }
                    break;
                }
                v7 = var0_3.hideDonate;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hgay", hfrd(int ), (int)70)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fo.hfla("hgba", hfks(int ), (int)135)) break;
                    v8 /* !! */  = (long)fo.hfla("hgbb", hfks(int ), (int)136);
                }
                if (!v7.isValue()) ** GOTO lbl77
                if (var1_2) ** GOTO lbl34
                v9 = fo.hfla("hgbc", hfks(int ), (int)137);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl80
lbl77:
                // 3 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                v9 = fo.hfla("hgbd", hfks(int ), (int)138);
lbl80:
                // 2 sources

                return (boolean)v9;
            }
lbl81:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fo.hfla("hgbe", hfks(int ), (int)139);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl86:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fo.hfla("hgbf", hfks(int ), (int)140);
                    if (var3) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)fo.hfla("hgbg", hfks(int ), (int)141);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 3: {
                var2_1 /* !! */  = (int)fo.hfla("hgbh", hfks(int ), (int)142);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl102:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)fo.hfla("hgbi", hfks(int ), (int)143);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 5: {
                do {
                    var2_1 /* !! */  = (int)fo.hfla("hgbk", hfks(int ), (int)144);
                } while (!var3);
                throw null;
            }
lbl112:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)fo.hfla("hgbn", hfks(int ), (int)145);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 7: {
                var2_1 /* !! */  = (int)fo.hfla("hgbq", hfks(int ), (int)146);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl122:
            // 4 sources

            case 8: {
                var2_1 /* !! */  = (int)fo.hfla("hgbs", hfks(int ), (int)147);
                if (!var3) ** GOTO lbl86
                throw null;
            }
lbl126:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)fo.hfla("hgbt", hfks(int ), (int)148);
                if (!var3) break;
                throw null;
            }
            case 10: {
                var2_1 /* !! */  = (int)fo.hfla("hgbu", hfks(int ), (int)149);
                if (!var3) ** GOTO lbl81
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)fo.hfla("hgbv", hfks(int ), (int)150);
        ** while (!var3)
lbl137:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite hfla(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isReallyWorld() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgis", hfrd(int ), (int)115)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo.hfla("hgit", hfks(int ), (int)199)) break;
            v0 /* !! */  = (long)fo.hfla("hgiu", hfks(int ), (int)200);
        }
        var3_1 = fo.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgiv", hfrd(int ), (int)116)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo.hfla("hgix", hfks(int ), (int)201)) break;
            v1 /* !! */  = (long)fo.hfla("hgiy", hfks(int ), (int)202);
        }
        var2_2 /* !! */  = fo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgiz", hfrd(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo.hfla("hgjb", hfks(int ), (int)203)) break;
            v2 /* !! */  = (long)fo.hfla("hgjd", hfks(int ), (int)204);
        }
        var1_3 = fo.a;
        if (var3_1) {
            throw null;
            return (boolean)fo.hfla("hgjf", hfks(int ), (int)205);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = fo.og;
                if (true) ** GOTO lbl34
                block14: while (true) {
                    v3 /* !! */  = (long)(fo.hfla("hgjk", hfrd(int ), (int)119) - fo.hfla("hgji", hfrd(int ), (int)118));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1827745077: {
                            continue block14;
                        }
                        case -1274565829: {
                            break block14;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgjm", hfrd(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fo.hfla("hgjn", hfks(int ), (int)206)) break;
                    v4 /* !! */  = (long)fo.hfla("hgjo", hfks(int ), (int)207);
                }
                return this.mode.isSelected("ReallyWorld");
            }
lbl46:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fo.hfla("hgjq", hfks(int ), (int)208);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fo.hfla("hgjr", hfks(int ), (int)209);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fo.hfla("hgjs", hfks(int ), (int)210);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fo.hfla("hgjt", hfks(int ), (int)211);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2561 filterIdentity(class_2561 var1_1, String var2_2) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block123: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hgkx", hfrd(int ), (int)134));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block123;
                }
                case 832467247: {
                    v1 = fo.hfla("hgkz", hfrd(int ), (int)135);
                    continue block123;
                }
                case 2119236718: {
                    v1 = fo.hfla("hgla", hfrd(int ), (int)136);
                    continue block123;
                }
            }
            break;
        }
        var8_3 = fo.c;
        v2 /* !! */  = fo.og;
        if (true) ** GOTO lbl19
        block124: while (true) {
            v2 /* !! */  = (long)(v3 - fo.hfla("hglb", hfrd(int ), (int)137));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1274565829: {
                    break block124;
                }
                case -206626513: {
                    v3 = fo.hfla("hglc", hfrd(int ), (int)138);
                    continue block124;
                }
                case 625776514: {
                    v3 = fo.hfla("hgld", hfrd(int ), (int)139);
                    continue block124;
                }
                case 1043335881: {
                    v3 = fo.hfla("hgle", hfrd(int ), (int)140);
                    continue block124;
                }
            }
            break;
        }
        var7_4 /* !! */  = fo.b;
        v4 /* !! */  = fo.og;
        if (true) ** GOTO lbl36
        block125: while (true) {
            v4 /* !! */  = (long)(v5 - fo.hfla("hglf", hfrd(int ), (int)141));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1274565829: {
                    break block125;
                }
                case 785544500: {
                    v5 = fo.hfla("hglg", hfrd(int ), (int)142);
                    continue block125;
                }
                case 962706928: {
                    v5 = fo.hfla("hglh", hfrd(int ), (int)143);
                    continue block125;
                }
            }
            break;
        }
        var6_5 = fo.a;
        if (var8_3) {
            throw null;
lbl48:
            // 13 sources

            return null;
        }
        if (var6_5 || var6_5) ** GOTO lbl48
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 = var1_1;
                if (var6_5 || var6_5) ** GOTO lbl48
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgli", hfrd(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fo.hfla("hglj", hfks(int ), (int)226)) break;
                    v6 /* !! */  = (long)fo.hfla("hglk", hfks(int ), (int)227);
                }
                v7 /* !! */  = fo.og;
                if (true) ** GOTO lbl65
                block128: while (true) {
                    v7 /* !! */  = (long)(v8 - fo.hfla("hgll", hfrd(int ), (int)145));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1274565829: {
                            break block128;
                        }
                        case 188669144: {
                            v8 = fo.hfla("hglm", hfrd(int ), (int)146);
                            continue block128;
                        }
                        case 546678092: {
                            v8 = fo.hfla("hgln", hfrd(int ), (int)147);
                            continue block128;
                        }
                        case 1780704823: {
                            v8 = fo.hfla("hglo", hfrd(int ), (int)148);
                            continue block128;
                        }
                    }
                    break;
                }
                if (!this.hideDonate.isValue()) ** GOTO lbl283
                if (var6_5) ** GOTO lbl48
                v9 /* !! */  = fo.og;
                if (true) ** GOTO lbl83
                block129: while (true) {
                    v9 /* !! */  = (long)(fo.hfla("hglq", hfrd(int ), (int)150) - fo.hfla("hglp", hfrd(int ), (int)149));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1274565829: {
                            break block129;
                        }
                        case -63658416: {
                            continue block129;
                        }
                    }
                    break;
                }
                if (this.originalDonate == null) ** GOTO lbl283
                if (var6_5 || var6_5) ** GOTO lbl48
                v10 /* !! */  = fo.og;
                if (true) ** GOTO lbl94
                block130: while (true) {
                    v10 /* !! */  = (long)(v11 - fo.hfla("hglr", hfrd(int ), (int)151));
lbl94:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1900592782: {
                            v11 = fo.hfla("hglt", hfrd(int ), (int)152);
                            continue block130;
                        }
                        case -1274565829: {
                            break block130;
                        }
                        case -1165297476: {
                            v11 = fo.hfla("hglu", hfrd(int ), (int)153);
                            continue block130;
                        }
                        case 903859847: {
                            v11 = fo.hfla("hglv", hfrd(int ), (int)154);
                            continue block130;
                        }
                    }
                    break;
                }
                v12 /* !! */  = fo.og;
                if (true) ** GOTO lbl110
                block131: while (true) {
                    v12 /* !! */  = (long)(fo.hfla("hglx", hfrd(int ), (int)156) - fo.hfla("hglw", hfrd(int ), (int)155));
lbl110:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1274565829: {
                            break block131;
                        }
                        case 1396297315: {
                            continue block131;
                        }
                    }
                    break;
                }
                v13 = this.donate.getValue();
                v14 /* !! */  = fo.og;
                if (true) ** GOTO lbl120
                block132: while (true) {
                    v14 /* !! */  = (long)(v15 - fo.hfla("hgly", hfrd(int ), (int)157));
lbl120:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1274565829: {
                            break block132;
                        }
                        case 563441473: {
                            v15 = fo.hfla("hglz", hfrd(int ), (int)158);
                            continue block132;
                        }
                        case 1237163318: {
                            v15 = fo.hfla("hgma", hfrd(int ), (int)159);
                            continue block132;
                        }
                        case 1923267360: {
                            v15 = fo.hfla("hgmb", hfrd(int ), (int)160);
                            continue block132;
                        }
                    }
                    break;
                }
                var4_7 = fo$Rank.byName(v13);
                if (var6_5 || var6_5) ** GOTO lbl48
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hgmc", hfrd(int ), (int)161)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == fo.hfla("hgmd", hfks(int ), (int)228)) break;
                    v16 /* !! */  = (long)fo.hfla("hgme", hfks(int ), (int)229);
                }
                v17 /* !! */  = fo.og;
                if (true) ** GOTO lbl143
                block134: while (true) {
                    v17 /* !! */  = (long)(v18 - fo.hfla("hgmf", hfrd(int ), (int)162));
lbl143:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1274565829: {
                            break block134;
                        }
                        case 495798044: {
                            v18 = fo.hfla("hgmg", hfrd(int ), (int)163);
                            continue block134;
                        }
                        case 1717344228: {
                            v18 = fo.hfla("hgmh", hfrd(int ), (int)164);
                            continue block134;
                        }
                        case 1735924749: {
                            v18 = fo.hfla("hgmi", hfrd(int ), (int)165);
                            continue block134;
                        }
                    }
                    break;
                }
                v19 = fo.literal(this.originalDonate);
                v20 /* !! */  = fo.og;
                if (true) ** GOTO lbl160
                block135: while (true) {
                    v20 /* !! */  = (long)(v21 - fo.hfla("hgmj", hfrd(int ), (int)166));
lbl160:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1274565829: {
                            break block135;
                        }
                        case 77419977: {
                            v21 = fo.hfla("hgml", hfrd(int ), (int)167);
                            continue block135;
                        }
                        case 1622536883: {
                            v21 = fo.hfla("hgmm", hfrd(int ), (int)168);
                            continue block135;
                        }
                        case 1916611456: {
                            v21 = fo.hfla("hgmn", hfrd(int ), (int)169);
                            continue block135;
                        }
                    }
                    break;
                }
                v22 = var4_7.symbol();
                v23 /* !! */  = fo.og;
                if (true) ** GOTO lbl177
                block136: while (true) {
                    v23 /* !! */  = (long)(v24 - fo.hfla("hgmo", hfrd(int ), (int)170));
lbl177:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1414140599: {
                            v24 = fo.hfla("hgmp", hfrd(int ), (int)171);
                            continue block136;
                        }
                        case -1310164425: {
                            v24 = fo.hfla("hgmq", hfrd(int ), (int)172);
                            continue block136;
                        }
                        case -1274565829: {
                            break block136;
                        }
                        case -667473165: {
                            v24 = fo.hfla("hgmr", hfrd(int ), (int)173);
                            continue block136;
                        }
                    }
                    break;
                }
                v25 = String.valueOf(v22);
                v26 = fo.hfla("hgms", hfks(int ), (int)230);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgmt", hfrd(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fo.hfla("hgmu", hfks(int ), (int)231)) break;
                    v27 /* !! */  = (long)fo.hfla("hgmv", hfks(int ), (int)232);
                }
                v28 = (int)v26;
                v29 /* !! */  = fo.og;
                if (true) ** GOTO lbl201
                block138: while (true) {
                    v29 /* !! */  = (long)(v30 - fo.hfla("hgmx", hfrd(int ), (int)175));
lbl201:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1767386500: {
                            v30 = fo.hfla("hgmy", hfrd(int ), (int)176);
                            continue block138;
                        }
                        case -1274565829: {
                            break block138;
                        }
                        case -746147129: {
                            v30 = fo.hfla("hgmz", hfrd(int ), (int)177);
                            continue block138;
                        }
                        case 571018956: {
                            v30 = fo.hfla("hgna", hfrd(int ), (int)178);
                            continue block138;
                        }
                    }
                    break;
                }
                var3_6 = fo.replace(var3_6, v19, v25, v28);
                if (var6_5 || var6_5) ** GOTO lbl48
                v31 /* !! */  = fo.og;
                if (true) ** GOTO lbl219
                block139: while (true) {
                    v31 /* !! */  = (long)(fo.hfla("hgnc", hfrd(int ), (int)180) - fo.hfla("hgnb", hfrd(int ), (int)179));
lbl219:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1274565829: {
                            break block139;
                        }
                        case 733890648: {
                            continue block139;
                        }
                    }
                    break;
                }
                v32 = Pattern.quote(var2_2);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hgnd", hfrd(int ), (int)181)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == fo.hfla("hgne", hfks(int ), (int)233)) break;
                    v33 /* !! */  = (long)fo.hfla("hgnf", hfks(int ), (int)234);
                }
                v34 = "(?iu)(\\S+)\\s+(?=" + v32 + ")";
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hgng", hfrd(int ), (int)182)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == fo.hfla("hgnh", hfks(int ), (int)235)) break;
                    v35 /* !! */  = (long)fo.hfla("hgni", hfks(int ), (int)236);
                }
                var5_8 = Pattern.compile(v34);
                if (var6_5 || var6_5) ** GOTO lbl48
                v36 /* !! */  = fo.og;
                if (true) ** GOTO lbl242
                block142: while (true) {
                    v36 /* !! */  = (long)(fo.hfla("hgnk", hfrd(int ), (int)184) - fo.hfla("hgnj", hfrd(int ), (int)183));
lbl242:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1274565829: {
                            break block142;
                        }
                        case 304680849: {
                            continue block142;
                        }
                    }
                    break;
                }
                v37 = var4_7.symbol();
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_5 = fo.og - fo.hfla("hgnl", hfrd(int ), (int)185)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == fo.hfla("hgnm", hfks(int ), (int)237)) break;
                    v38 /* !! */  = (long)fo.hfla("hgnp", hfks(int ), (int)238);
                }
                v39 = String.valueOf(v37);
                v40 = fo.hfla("hgnq", hfks(int ), (int)239);
                v41 /* !! */  = fo.og;
                if (true) ** GOTO lbl259
                block144: while (true) {
                    v41 /* !! */  = (long)(fo.hfla("hgns", hfrd(int ), (int)187) - fo.hfla("hgnr", hfrd(int ), (int)186));
lbl259:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1274565829: {
                            break block144;
                        }
                        case -236454884: {
                            continue block144;
                        }
                    }
                    break;
                }
                v42 = (int)v40;
                v43 /* !! */  = fo.og;
                if (true) ** GOTO lbl269
                block145: while (true) {
                    v43 /* !! */  = (long)(v44 - fo.hfla("hgnt", hfrd(int ), (int)188));
lbl269:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1274565829: {
                            break block145;
                        }
                        case -100274062: {
                            v44 = fo.hfla("hgnu", hfrd(int ), (int)189);
                            continue block145;
                        }
                        case 193539331: {
                            v44 = fo.hfla("hgnv", hfrd(int ), (int)190);
                            continue block145;
                        }
                        case 570988723: {
                            v44 = fo.hfla("hgnw", hfrd(int ), (int)191);
                            continue block145;
                        }
                    }
                    break;
                }
                var3_6 = fo.replace(var3_6, var5_8, v39, v42);
                if (var6_5) ** GOTO lbl48
lbl283:
                // 3 sources

                if (var6_5 || var6_5) ** GOTO lbl48
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_6 = fo.og - fo.hfla("hgnx", hfrd(int ), (int)192)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == fo.hfla("hgny", hfks(int ), (int)240)) break;
                    v45 /* !! */  = (long)fo.hfla("hgnz", hfks(int ), (int)241);
                }
                v46 /* !! */  = fo.og;
                if (true) ** GOTO lbl293
                block147: while (true) {
                    v46 /* !! */  = (long)(fo.hfla("hgoc", hfrd(int ), (int)194) - fo.hfla("hgoa", hfrd(int ), (int)193));
lbl293:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -1274565829: {
                            break block147;
                        }
                        case 1421776243: {
                            continue block147;
                        }
                    }
                    break;
                }
                if (!this.hideClan.isValue()) ** GOTO lbl344
                if (var6_5) ** GOTO lbl48
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_7 = fo.og - fo.hfla("hgod", hfrd(int ), (int)195)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == fo.hfla("hgoe", hfks(int ), (int)242)) break;
                    v47 /* !! */  = (long)fo.hfla("hgof", hfks(int ), (int)243);
                }
                if (this.originalClan == null) ** GOTO lbl344
                if (var6_5 || var6_5) ** GOTO lbl48
                v48 /* !! */  = fo.og;
                if (true) ** GOTO lbl311
                block149: while (true) {
                    v48 /* !! */  = (long)(fo.hfla("hgoh", hfrd(int ), (int)197) - fo.hfla("hgog", hfrd(int ), (int)196));
lbl311:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -1274565829: {
                            break block149;
                        }
                        case -1160509104: {
                            continue block149;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_8 = fo.og - fo.hfla("hgoi", hfrd(int ), (int)198)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == fo.hfla("hgoj", hfks(int ), (int)244)) break;
                    v49 /* !! */  = (long)fo.hfla("hgok", hfks(int ), (int)245);
                }
                v50 = fo.literal(this.originalClan);
                v51 = fo.hfla("hgol", hfks(int ), (int)246);
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_9 = fo.og - fo.hfla("hgom", hfrd(int ), (int)199)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == fo.hfla("hgon", hfks(int ), (int)247)) break;
                    v52 /* !! */  = (long)fo.hfla("hgoo", hfks(int ), (int)248);
                }
                v53 = (int)v51;
                v54 /* !! */  = fo.og;
                if (true) ** GOTO lbl333
                block152: while (true) {
                    v54 /* !! */  = (long)(v55 - fo.hfla("hgop", hfrd(int ), (int)200));
lbl333:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1595472120: {
                            v55 = fo.hfla("hgoq", hfrd(int ), (int)201);
                            continue block152;
                        }
                        case -1274565829: {
                            break block152;
                        }
                        case 791045412: {
                            v55 = fo.hfla("hgor", hfrd(int ), (int)202);
                            continue block152;
                        }
                    }
                    break;
                }
                var3_6 = fo.replace(var3_6, v50, "\u0431\u0443\u0440\u043c\u0430\u043b\u0434\u0430", v53);
                if (var6_5) ** GOTO lbl48
lbl344:
                // 3 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return var3_6;
            }
            case 0: {
                var7_4 /* !! */  = (int)fo.hfla("hgos", hfks(int ), (int)249);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 1: {
                var7_4 /* !! */  = (int)fo.hfla("hgot", hfks(int ), (int)250);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl357:
            // 2 sources

            case 2: {
                var7_4 /* !! */  = (int)fo.hfla("hgou", hfks(int ), (int)251);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl362:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)fo.hfla("hgov", hfks(int ), (int)252);
                if (var8_3) {
                    throw null;
                }
            }
lbl366:
            // 4 sources

            case 4: {
                var7_4 /* !! */  = (int)fo.hfla("hgsd", hfks(int ), (int)253);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl418
            }
            case 5: {
                var7_4 /* !! */  = (int)fo.hfla("hgse", hfks(int ), (int)254);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl376:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)fo.hfla("hgsf", hfks(int ), (int)255);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl381:
            // 2 sources

            case 7: {
                var7_4 /* !! */  = (int)fo.hfla("hgsg", hfks(int ), (int)256);
                if (!var8_3) ** GOTO lbl357
                throw null;
            }
lbl385:
            // 3 sources

            case 8: {
                var7_4 /* !! */  = (int)fo.hfla("hgsh", hfks(int ), (int)257);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl390:
            // 3 sources

            case 9: {
                var7_4 /* !! */  = (int)fo.hfla("hgsi", hfks(int ), (int)258);
                if (!var8_3) break;
                throw null;
            }
lbl394:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)fo.hfla("hgsj", hfks(int ), (int)259);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl439
                    break;
                }
            }
            case 11: {
                var7_4 /* !! */  = (int)fo.hfla("hgsk", hfks(int ), (int)260);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl443
            }
            case 12: {
                var7_4 /* !! */  = (int)fo.hfla("hgsl", hfks(int ), (int)261);
                if (!var8_3) ** GOTO lbl385
                throw null;
            }
            case 13: {
                var7_4 /* !! */  = (int)fo.hfla("hgsm", hfks(int ), (int)262);
                if (var8_3) {
                    throw null;
                }
            }
            case 14: {
                var7_4 /* !! */  = (int)fo.hfla("hgsn", hfks(int ), (int)263);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl439
            }
lbl418:
            // 2 sources

            case 15: {
                do {
                    var7_4 /* !! */  = (int)fo.hfla("hgso", hfks(int ), (int)264);
                } while (!var8_3);
                throw null;
            }
lbl423:
            // 3 sources

            case 16: {
                var7_4 /* !! */  = (int)fo.hfla("hgsp", hfks(int ), (int)265);
                if (!var8_3) ** GOTO lbl394
                throw null;
            }
lbl427:
            // 2 sources

            case 17: {
                var7_4 /* !! */  = (int)fo.hfla("hgsq", hfks(int ), (int)266);
                if (!var8_3) ** GOTO lbl362
                throw null;
            }
            case 18: {
                var7_4 /* !! */  = (int)fo.hfla("hgsr", hfks(int ), (int)267);
                if (!var8_3) ** GOTO lbl366
                throw null;
            }
            case 19: {
                var7_4 /* !! */  = (int)fo.hfla("hgss", hfks(int ), (int)268);
                if (!var8_3) ** GOTO lbl381
                throw null;
            }
lbl439:
            // 3 sources

            case 20: {
                var7_4 /* !! */  = (int)fo.hfla("hgst", hfks(int ), (int)269);
                if (!var8_3) ** GOTO lbl390
                throw null;
            }
lbl443:
            // 3 sources

            case 21: {
                var7_4 /* !! */  = (int)fo.hfla("hgsu", hfks(int ), (int)270);
                if (!var8_3) ** GOTO lbl427
                throw null;
            }
lbl447:
            // 2 sources

            case 22: {
                var7_4 /* !! */  = (int)fo.hfla("hgsv", hfks(int ), (int)271);
                if (!var8_3) ** GOTO lbl423
                throw null;
            }
            case 23: 
        }
        var7_4 /* !! */  = (int)fo.hfla("hgsw", hfks(int ), (int)272);
        ** while (!var8_3)
lbl454:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhtu() {
        fo.hfrf[300] = 3200710177930808874L;
        fo.hfrf[301] = -2236226053645181068L;
        fo.hfrf[302] = 7173956764028164231L;
        fo.hfrf[303] = 3755740047432565808L;
        fo.hfrf[304] = -2577990843876689827L;
        fo.hfrf[305] = 1971608871251312901L;
        fo.hfrf[306] = 5722388677022765399L;
        fo.hfrf[307] = -3023662971012549077L;
        fo.hfrf[308] = 6314028962541191882L;
        fo.hfrf[309] = 2635380915510884745L;
        fo.hfrf[310] = -1128872688106662959L;
        fo.hfrf[311] = 7360246146583746939L;
        fo.hfrf[312] = -4206182633693902890L;
        fo.hfrf[313] = -9004149371874971352L;
        fo.hfrf[314] = 4616413444218269268L;
        fo.hfrf[315] = 4409744167491093571L;
        fo.hfrf[316] = -2255249721701615733L;
        fo.hfrf[317] = 6633860509528665596L;
        fo.hfrf[318] = 5106537029099505454L;
        fo.hfrf[319] = -1098446829124956880L;
        fo.hfrf[320] = 5823197642424854540L;
        fo.hfrf[321] = -1063770218508918009L;
        fo.hfrf[322] = 7994176403142389946L;
        fo.hfrf[323] = 2098006500070802300L;
        fo.hfrf[324] = -7541339982198632009L;
        fo.hfrf[325] = -2049909213787600356L;
        fo.hfrf[326] = -7564357494767015209L;
        fo.hfrf[327] = -3564146493107603723L;
        fo.hfrf[328] = 6521175061994004997L;
        fo.hfrf[329] = -5883705400519068988L;
        fo.hfrf[330] = 8311600546465742153L;
        fo.hfrf[331] = 2635184251871658041L;
        fo.hfrf[332] = -8478992273873691568L;
        fo.hfrf[333] = -7799410073699629441L;
        fo.hfrf[334] = -97930706393912283L;
        fo.hfrf[335] = 4237568754904838609L;
        fo.hfrf[336] = -2613789069162451509L;
        fo.hfrf[337] = -1595866307332298088L;
        fo.hfrf[338] = 6092377619015104501L;
        fo.hfrf[339] = -3599432531645505536L;
        fo.hfrf[340] = 8306387839951792165L;
        fo.hfrf[341] = -1845990087190961975L;
        fo.hfrf[342] = -3890599377233218100L;
        fo.hfrf[343] = 3723609381566125337L;
        fo.hfrf[344] = -6027844077926473221L;
        fo.hfrf[345] = 2154066591882964297L;
        fo.hfrf[346] = 8614062074537119754L;
        fo.hfrf[347] = 3719394846292932867L;
        fo.hfrf[348] = 962080492393851241L;
        fo.hfrf[349] = -8636225084806734106L;
        fo.hfrf[350] = 5351924696261051125L;
        fo.hfrf[351] = -4811448709440447461L;
        fo.hfrf[352] = -7748785251508788034L;
        fo.hfrf[353] = 3615307913774171312L;
        fo.hfrf[354] = -7388139164929817166L;
        fo.hfrf[355] = -1746598112963948902L;
        fo.hfrf[356] = 6411401132220477642L;
        fo.hfrf[357] = 4067968873968736330L;
        fo.hfrf[358] = 9032868248394165379L;
        fo.hfrf[359] = -1774047366534948588L;
        fo.hfrf[360] = 2490806076175807869L;
        fo.hfrf[361] = 5928484567238633523L;
        fo.hfrf[362] = 228680346511564548L;
        fo.hfrf[363] = -526799110178632330L;
        fo.hfrf[364] = 988644578773071132L;
        fo.hfrf[365] = -4361941536531695919L;
        fo.hfrf[366] = -848102044003733356L;
        fo.hfrf[367] = -7537871830750217629L;
        fo.hfrf[368] = -397548170289670234L;
        fo.hfrf[369] = -6878301321974699789L;
        fo.hfrf[370] = -3871919432177102217L;
        fo.hfrf[371] = 6688216824029436494L;
        fo.hfrf[372] = 4455586218410687484L;
        fo.hfrf[373] = 295561392596580814L;
        fo.hfrf[374] = -2427924661236124644L;
        fo.hfrf[375] = -5617294954465632897L;
        fo.hfrf[376] = -1156151303332622799L;
        fo.hfrf[377] = 3159495166643516981L;
        fo.hfrf[378] = -646181125956203268L;
        fo.hfrf[379] = -6366674546031104356L;
        fo.hfrf[380] = 3690156901230815705L;
        fo.hfrf[381] = 234763700841670541L;
        fo.hfrf[382] = 5923854065201257267L;
        fo.hfrf[383] = 1984537571084509389L;
        fo.hfrf[384] = 9202758867523211612L;
        fo.hfrf[385] = 7602182333511778242L;
        fo.hfrf[386] = 3567201042927175243L;
        fo.hfrf[387] = -4037653070287559556L;
        fo.hfrf[388] = -8070693281129294962L;
        fo.hfrf[389] = -7023584970926420084L;
        fo.hfrf[390] = 5018134745962484195L;
        fo.hfrf[391] = -2944414821852424686L;
        fo.hfrf[392] = 478982768286232295L;
        fo.hfrf[393] = -3373545082157053185L;
        fo.hfrf[394] = -2931829520353456497L;
        fo.hfrf[395] = 1573764016841930858L;
        fo.hfrf[396] = -7477597669806950920L;
        fo.hfrf[397] = -3715238812853982150L;
        fo.hfrf[398] = 3376536946335899565L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean active() {
        block47: {
            v0 /* !! */  = fo.og;
            if (true) ** GOTO lbl5
            block31: while (true) {
                v0 /* !! */  = (long)(v1 - fo.hfla("hgju", hfrd(int ), (int)121));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1274565829: {
                        break block31;
                    }
                    case -65536268: {
                        v1 = fo.hfla("hgjv", hfrd(int ), (int)122);
                        continue block31;
                    }
                    case 130222983: {
                        v1 = fo.hfla("hgjw", hfrd(int ), (int)123);
                        continue block31;
                    }
                    case 1150212113: {
                        v1 = fo.hfla("hgjx", hfrd(int ), (int)124);
                        continue block31;
                    }
                }
                break;
            }
            var3_1 = fo.c;
            v2 /* !! */  = fo.og;
            if (true) ** GOTO lbl22
            block32: while (true) {
                v2 /* !! */  = (long)(v3 - fo.hfla("hgjy", hfrd(int ), (int)125));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1274565829: {
                        break block32;
                    }
                    case 707226938: {
                        v3 = fo.hfla("hgjz", hfrd(int ), (int)126);
                        continue block32;
                    }
                    case 775035062: {
                        v3 = fo.hfla("hgka", hfrd(int ), (int)127);
                        continue block32;
                    }
                }
                break;
            }
            var2_2 /* !! */  = fo.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hgkb", hfrd(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == fo.hfla("hgkc", hfks(int ), (int)212)) break;
                v4 /* !! */  = (long)fo.hfla("hgkd", hfks(int ), (int)213);
            }
            var1_3 = fo.a;
            if (var3_1) {
                throw null;
lbl41:
                // 4 sources

                return (boolean)fo.hfla("hgke", hfks(int ), (int)214);
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            v5 /* !! */  = fo.og;
            if (true) ** GOTO lbl48
            block35: while (true) {
                v5 /* !! */  = (long)(v6 - fo.hfla("hgkf", hfrd(int ), (int)129));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1274565829: {
                        break block35;
                    }
                    case -831857591: {
                        v6 = fo.hfla("hgkg", hfrd(int ), (int)130);
                        continue block35;
                    }
                    case 1442941240: {
                        v6 = fo.hfla("hgki", hfrd(int ), (int)131);
                        continue block35;
                    }
                }
                break;
            }
            if (!this.isState()) break block47;
            if (var1_3) ** GOTO lbl41
            v7 /* !! */  = fo.og;
            if (true) ** GOTO lbl63
            block36: while (true) {
                v7 /* !! */  = (long)(fo.hfla("hgkk", hfrd(int ), (int)133) - fo.hfla("hgkj", hfrd(int ), (int)132));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1578665860: {
                        continue block36;
                    }
                    case -1274565829: {
                        break block36;
                    }
                }
                break;
            }
            if (!this.isReallyWorld()) break block47;
            if (var1_3) ** GOTO lbl41
            v8 = fo.hfla("hgkl", hfks(int ), (int)215);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl81
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = fo.hfla("hgkm", hfks(int ), (int)216);
lbl81:
                // 2 sources

                return (boolean)v8;
            }
            case 0: {
                var2_2 /* !! */  = (int)fo.hfla("hgkn", hfks(int ), (int)217);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fo.hfla("hgko", hfks(int ), (int)218);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl91:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)fo.hfla("hgkp", hfks(int ), (int)219);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl96:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)fo.hfla("hgkq", hfks(int ), (int)220);
                } while (!var3_1);
                throw null;
            }
lbl101:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fo.hfla("hgkr", hfks(int ), (int)221);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl105:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fo.hfla("hgks", hfks(int ), (int)222);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 6: {
                var2_2 /* !! */  = (int)fo.hfla("hgkt", hfks(int ), (int)223);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl114:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fo.hfla("hgku", hfks(int ), (int)224);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)fo.hfla("hgkv", hfks(int ), (int)225);
        ** while (!var3_1)
lbl121:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static kb option(String var0, String var1_1) {
        v0 /* !! */  = fo.og;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - fo.hfla("hggz", hfrd(int ), (int)105));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1274565829: {
                    break block19;
                }
                case -281249610: {
                    v1 = fo.hfla("hgha", hfrd(int ), (int)106);
                    continue block19;
                }
                case 116524358: {
                    v1 = fo.hfla("hghb", hfrd(int ), (int)107);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = fo.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hghc", hfrd(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo.hfla("hghe", hfks(int ), (int)188)) break;
            v2 /* !! */  = (long)fo.hfla("hghg", hfks(int ), (int)189);
        }
        var3_3 /* !! */  = fo.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = fo.og;
                if (true) ** GOTO lbl29
                block21: while (true) {
                    v3 /* !! */  = (long)(fo.hfla("hghn", hfrd(int ), (int)110) - fo.hfla("hghm", hfrd(int ), (int)109));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1638910263: {
                            continue block21;
                        }
                        case -1274565829: {
                            break block21;
                        }
                    }
                    break;
                }
                var2_4 = fo.a;
                if (var4_2) {
                    throw null;
                    return null;
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hghq", hfrd(int ), (int)111)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fo.hfla("hghr", hfks(int ), (int)190)) break;
                    v4 /* !! */  = (long)fo.hfla("hght", hfks(int ), (int)191);
                }
                v5 /* !! */  = fo.og;
                if (true) ** GOTO lbl50
                block24: while (true) {
                    v5 /* !! */  = (long)(fo.hfla("hghw", hfrd(int ), (int)113) - fo.hfla("hghv", hfrd(int ), (int)112));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1274565829: {
                            break block24;
                        }
                        case 329896468: {
                            continue block24;
                        }
                    }
                    break;
                }
                v6 = new kb(var0, var1_1);
                v7 = fo.hfla("hgic", hfks(int ), (int)192);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hgid", hfrd(int ), (int)114)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fo.hfla("hgie", hfks(int ), (int)193)) break;
                    v8 /* !! */  = (long)fo.hfla("hgif", hfks(int ), (int)194);
                }
                return v6.setValue((boolean)v7);
            }
            case 0: {
                var3_3 /* !! */  = (int)fo.hfla("hgik", hfks(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl69:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fo.hfla("hgil", hfks(int ), (int)196);
                    if (!var4_2) break block5;
                    throw null;
                }
            }
lbl74:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fo.hfla("hgim", hfks(int ), (int)197);
                if (!var4_2) ** GOTO lbl69
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)fo.hfla("hgin", hfks(int ), (int)198);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hhor() {
        fo.hfky[400] = -384904871;
        fo.hfky[401] = -1782228158;
        fo.hfky[402] = -95683230;
        fo.hfky[403] = -1081858000;
        fo.hfky[404] = -831299053;
        fo.hfky[405] = -468536336;
        fo.hfky[406] = -1942206107;
        fo.hfky[407] = -431507775;
        fo.hfky[408] = 1265367356;
        fo.hfky[409] = 1750433985;
        fo.hfky[410] = 1288619201;
        fo.hfky[411] = 328466770;
        fo.hfky[412] = 2086408544;
        fo.hfky[413] = 1039234493;
        fo.hfky[414] = 322975351;
        fo.hfky[415] = -2049796808;
        fo.hfky[416] = 707234725;
        fo.hfky[417] = -1084306335;
        fo.hfky[418] = 1515372908;
        fo.hfky[419] = -668763036;
        fo.hfky[420] = -662620048;
        fo.hfky[421] = 795639328;
        fo.hfky[422] = 938698250;
        fo.hfky[423] = -1585637700;
        fo.hfky[424] = 36690198;
        fo.hfky[425] = 673602185;
        fo.hfky[426] = 1446916128;
        fo.hfky[427] = -53212815;
        fo.hfky[428] = -386081018;
        fo.hfky[429] = 982025100;
        fo.hfky[430] = -1806691595;
        fo.hfky[431] = 268073275;
        fo.hfky[432] = -311246554;
        fo.hfky[433] = -930858618;
        fo.hfky[434] = -861270397;
        fo.hfky[435] = -1325741019;
        fo.hfky[436] = -497796604;
        fo.hfky[437] = -855212819;
        fo.hfky[438] = -486310204;
        fo.hfky[439] = 1073592937;
        fo.hfky[440] = 880151147;
        fo.hfky[441] = -276532637;
        fo.hfky[442] = -598824466;
        fo.hfky[443] = 664987702;
        fo.hfky[444] = 190071281;
        fo.hfky[445] = -1772974488;
        fo.hfky[446] = -501120948;
        fo.hfky[447] = -429641374;
        fo.hfky[448] = -1286073595;
        fo.hfky[449] = -1252472599;
        fo.hfky[450] = -1206072889;
        fo.hfky[451] = -867024259;
        fo.hfky[452] = -501858888;
        fo.hfky[453] = -33371797;
        fo.hfky[454] = -382175075;
        fo.hfky[455] = -1385138344;
        fo.hfky[456] = -1752669743;
        fo.hfky[457] = -1317693997;
        fo.hfky[458] = -1651255539;
        fo.hfky[459] = 551148841;
        fo.hfky[460] = 1949535430;
        fo.hfky[461] = 1480054249;
        fo.hfky[462] = 1218943057;
        fo.hfky[463] = -1371453248;
        fo.hfky[464] = 431261741;
        fo.hfky[465] = 154529372;
        fo.hfky[466] = 1982702412;
        fo.hfky[467] = -539195479;
        fo.hfky[468] = 270398102;
        fo.hfky[469] = 1324094180;
        fo.hfky[470] = -11001213;
        fo.hfky[471] = 678525275;
        fo.hfky[472] = 81367504;
        fo.hfky[473] = 1074397737;
        fo.hfky[474] = 801802252;
        fo.hfky[475] = -44470408;
        fo.hfky[476] = 805251099;
        fo.hfky[477] = -1924038753;
        fo.hfky[478] = 1503356477;
        fo.hfky[479] = 588439135;
        fo.hfky[480] = 1345343919;
        fo.hfky[481] = 757020120;
        fo.hfky[482] = -1010033468;
        fo.hfky[483] = 7030887;
        fo.hfky[484] = 1045133685;
        fo.hfky[485] = 1755970537;
        fo.hfky[486] = 1665635057;
        fo.hfky[487] = -24603938;
        fo.hfky[488] = -114307809;
        fo.hfky[489] = -355105833;
        fo.hfky[490] = 811271052;
        fo.hfky[491] = -1455327939;
        fo.hfky[492] = 687091254;
        fo.hfky[493] = -1569109957;
        fo.hfky[494] = -853691581;
        fo.hfky[495] = 735370356;
        fo.hfky[496] = 81618729;
        fo.hfky[497] = 1097267697;
        fo.hfky[498] = 826139802;
        fo.hfky[499] = -2103492815;
    }

    private static /* synthetic */ void hhnc() {
        fo.hfky[200] = 2063354155;
        fo.hfky[201] = -345968114;
        fo.hfky[202] = 1740889292;
        fo.hfky[203] = 1225585345;
        fo.hfky[204] = 1748382768;
        fo.hfky[205] = -851085006;
        fo.hfky[206] = 888255821;
        fo.hfky[207] = -1283314804;
        fo.hfky[208] = -1536038392;
        fo.hfky[209] = 1389009724;
        fo.hfky[210] = 1563914448;
        fo.hfky[211] = 370436445;
        fo.hfky[212] = -1358002026;
        fo.hfky[213] = 2108314891;
        fo.hfky[214] = 143083610;
        fo.hfky[215] = 2075564279;
        fo.hfky[216] = -1073527113;
        fo.hfky[217] = 599297003;
        fo.hfky[218] = -1128525948;
        fo.hfky[219] = 1853448561;
        fo.hfky[220] = -1957845885;
        fo.hfky[221] = 2034218507;
        fo.hfky[222] = -1258852677;
        fo.hfky[223] = 2082802376;
        fo.hfky[224] = 882393285;
        fo.hfky[225] = 1293124461;
        fo.hfky[226] = 120654966;
        fo.hfky[227] = 621879055;
        fo.hfky[228] = -915911522;
        fo.hfky[229] = -2005900911;
        fo.hfky[230] = 1483454762;
        fo.hfky[231] = -1291305290;
        fo.hfky[232] = -487159183;
        fo.hfky[233] = 1839900128;
        fo.hfky[234] = -714752411;
        fo.hfky[235] = 661284775;
        fo.hfky[236] = -1161384445;
        fo.hfky[237] = 190666836;
        fo.hfky[238] = 904221648;
        fo.hfky[239] = -939025986;
        fo.hfky[240] = -60449081;
        fo.hfky[241] = 1942484652;
        fo.hfky[242] = 1051792123;
        fo.hfky[243] = 68603914;
        fo.hfky[244] = -1271125256;
        fo.hfky[245] = -178686546;
        fo.hfky[246] = -79268728;
        fo.hfky[247] = -81081664;
        fo.hfky[248] = -1151968650;
        fo.hfky[249] = 76356653;
        fo.hfky[250] = -1676203776;
        fo.hfky[251] = -933059087;
        fo.hfky[252] = -2029286965;
        fo.hfky[253] = 811882107;
        fo.hfky[254] = -254906767;
        fo.hfky[255] = -840749012;
        fo.hfky[256] = -1259430841;
        fo.hfky[257] = -1374150325;
        fo.hfky[258] = 1950339783;
        fo.hfky[259] = 1700680951;
        fo.hfky[260] = -682937908;
        fo.hfky[261] = 1056171553;
        fo.hfky[262] = -861677058;
        fo.hfky[263] = -309528432;
        fo.hfky[264] = 41725630;
        fo.hfky[265] = -1290850501;
        fo.hfky[266] = 547631944;
        fo.hfky[267] = -1084179326;
        fo.hfky[268] = -1882097430;
        fo.hfky[269] = 19148807;
        fo.hfky[270] = 1597770362;
        fo.hfky[271] = 299269945;
        fo.hfky[272] = 825901441;
        fo.hfky[273] = -65770601;
        fo.hfky[274] = -183864771;
        fo.hfky[275] = -1509711042;
        fo.hfky[276] = -1648669847;
        fo.hfky[277] = 436074551;
        fo.hfky[278] = -84544551;
        fo.hfky[279] = 56208064;
        fo.hfky[280] = 368381708;
        fo.hfky[281] = 959199475;
        fo.hfky[282] = -1204211930;
        fo.hfky[283] = -531383591;
        fo.hfky[284] = -634551531;
        fo.hfky[285] = 727026458;
        fo.hfky[286] = -728643225;
        fo.hfky[287] = 3333455;
        fo.hfky[288] = -94403296;
        fo.hfky[289] = -448136732;
        fo.hfky[290] = 1987140074;
        fo.hfky[291] = 1979631833;
        fo.hfky[292] = -1139642516;
        fo.hfky[293] = 2037392216;
        fo.hfky[294] = 932282506;
        fo.hfky[295] = 1797054965;
        fo.hfky[296] = -1578720466;
        fo.hfky[297] = 959537124;
        fo.hfky[298] = -694434072;
        fo.hfky[299] = 375272795;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static List<fo$Segment> segments(class_2561 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo.og - fo.hfla("hhcd", hfrd(int ), (int)289)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fo.hfla("hhce", hfks(int ), (int)427)) break;
            v0 /* !! */  = (long)fo.hfla("hhcf", hfks(int ), (int)428);
        }
        var5_1 = fo.c;
        v1 /* !! */  = fo.og;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(fo.hfla("hhch", hfrd(int ), (int)291) - fo.hfla("hhcg", hfrd(int ), (int)290));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1274565829: {
                    break block21;
                }
                case -13144318: {
                    continue block21;
                }
            }
            break;
        }
        var4_2 /* !! */  = fo.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fo.og - fo.hfla("hhci", hfrd(int ), (int)292)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fo.hfla("hhcj", hfks(int ), (int)429)) break;
            v2 /* !! */  = (long)fo.hfla("hhck", hfks(int ), (int)430);
        }
        var3_3 = fo.a;
        if (var5_1) {
            throw null;
lbl25:
            // 4 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl25
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = fo.og - fo.hfla("hhcl", hfrd(int ), (int)293)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fo.hfla("hhcm", hfks(int ), (int)431)) break;
                    v3 /* !! */  = (long)fo.hfla("hhcn", hfks(int ), (int)432);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = fo.og - fo.hfla("hhco", hfrd(int ), (int)294)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fo.hfla("hhcp", hfks(int ), (int)433)) break;
                    v4 /* !! */  = (long)fo.hfla("hhcq", hfks(int ), (int)434);
                }
                var1_4 = new ArrayList<fo$Segment>();
                if (var3_3 || var3_3) ** GOTO lbl25
                var2_5 = new int[]{0};
                if (var3_3 || var3_3) ** GOTO lbl25
                v5 /* !! */  = fo.og;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(fo.hfla("hhcs", hfrd(int ), (int)296) - fo.hfla("hhcr", hfrd(int ), (int)295));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1274565829: {
                            break block26;
                        }
                        case -560801952: {
                            continue block26;
                        }
                    }
                    break;
                }
                v6 = (class_5348.class_5246)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;, lambda$segments$1(int[] java.util.List net.minecraft.class_2583 java.lang.String ), (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;)((int[])var2_5, var1_4);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = fo.og - fo.hfla("hhct", hfrd(int ), (int)297)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fo.hfla("hhcu", hfks(int ), (int)435)) break;
                    v7 /* !! */  = (long)fo.hfla("hhcv", hfks(int ), (int)436);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = fo.og - fo.hfla("hhcw", hfrd(int ), (int)298)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fo.hfla("hhcx", hfks(int ), (int)437)) break;
                    v8 /* !! */  = (long)fo.hfla("hhcy", hfks(int ), (int)438);
                }
                var0.method_27658(v6, class_2583.field_24360);
                if (var3_3 || var3_3) ** continue;
                return var1_4;
            }
lbl68:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)fo.hfla("hhcz", hfks(int ), (int)439);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: {
                var4_2 /* !! */  = (int)fo.hfla("hhda", hfks(int ), (int)440);
                if (!var5_1) ** GOTO lbl68
                throw null;
            }
lbl77:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)fo.hfla("hhdb", hfks(int ), (int)441);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)fo.hfla("hhdc", hfks(int ), (int)442);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl100
                    break;
                }
            }
lbl88:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)fo.hfla("hhdd", hfks(int ), (int)443);
                if (var5_1) {
                    throw null;
                }
            }
lbl92:
            // 4 sources

            case 5: {
                var4_2 /* !! */  = (int)fo.hfla("hhde", hfks(int ), (int)444);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)fo.hfla("hhdf", hfks(int ), (int)445);
                if (!var5_1) ** GOTO lbl92
                throw null;
            }
lbl100:
            // 3 sources

            case 7: {
                do {
                    var4_2 /* !! */  = (int)fo.hfla("hhdg", hfks(int ), (int)446);
                } while (!var5_1);
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)fo.hfla("hhdh", hfks(int ), (int)447);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
            case 9: 
        }
        var4_2 /* !! */  = (int)fo.hfla("hhdi", hfks(int ), (int)448);
        ** while (!var5_1)
lbl112:
        // 1 sources

        throw null;
    }
}

