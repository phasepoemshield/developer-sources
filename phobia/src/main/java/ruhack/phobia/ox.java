/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3545
 *  net.minecraft.class_3959$class_3960
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3545;
import net.minecraft.class_3959;
import ruhack.phobia.c;
import ruhack.phobia.ov;
import ruhack.phobia.ow;
import ruhack.phobia.oy;

public class ox
implements c {
    private class_243 offset;
    private static int[] kilp;
    public static final boolean a;
    private static long[] kily;
    public static final int b;
    public static final boolean c;
    public static final long sj = -9054571810756832244L;
    private static int[] kilo;
    private static long[] kilz;
    private final Random random;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Double lambda$generateCandidatePoints$1(double d2, Double d3) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = sj - ox.kilq("kjhl", kilx(int ), (int)270)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ox.kilq("kjhm", kiln(int ), (int)265)) break;
            object = ox.kilq("kjhn", kiln(int ), (int)266);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = sj - ox.kilq("kjho", kilx(int ), (int)271)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ox.kilq("kjhp", kiln(int ), (int)267)) break;
            object = ox.kilq("kjhq", kiln(int ), (int)268);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = sj - ox.kilq("kjhr", kilx(int ), (int)272)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ox.kilq("kjhs", kiln(int ), (int)269)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ox.kilq("kjht", kiln(int ), (int)270);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = sj - ox.kilq("kjhu", kilx(int ), (int)273)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == ox.kilq("kjhv", kiln(int ), (int)271)) break;
            object = ox.kilq("kjhw", kiln(int ), (int)272);
        }
        double d4 = d3 + d2;
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = sj - ox.kilq("kjhx", kilx(int ), (int)274)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == ox.kilq("kjhy", kiln(int ), (int)273)) {
                return d4;
            }
            object = ox.kilq("kjhz", kiln(int ), (int)274);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$generateCandidatePoints$3(float var1_1, boolean var2_2, class_243 var3_3) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - ox.kilq("kjff", kilx(int ), (int)239));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1558860571: {
                    v1 = ox.kilq("kjfg", kilx(int ), (int)240);
                    continue block19;
                }
                case 266099125: {
                    v1 = ox.kilq("kjfh", kilx(int ), (int)241);
                    continue block19;
                }
                case 1251136524: {
                    break block19;
                }
            }
            break;
        }
        var6_4 = ox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjfi", kilx(int ), (int)242)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kjfj", kiln(int ), (int)238)) break;
            v2 /* !! */  = (long)ox.kilq("kjfk", kiln(int ), (int)239);
        }
        var5_5 /* !! */  = ox.b;
        v3 /* !! */  = ox.sj;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v3 /* !! */  = (long)(ox.kilq("kjfm", kilx(int ), (int)244) - ox.kilq("kjfl", kilx(int ), (int)243));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -292598030: {
                    continue block21;
                }
                case 1251136524: {
                    break block21;
                }
            }
            break;
        }
        var4_6 = ox.a;
        if (var6_4) {
            throw null;
lbl33:
            // 2 sources

            return (boolean)ox.kilq("kjfn", kiln(int ), (int)240);
        }
        if (var4_6) ** GOTO lbl33
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjfo", kilx(int ), (int)245)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ox.kilq("kjfp", kiln(int ), (int)241)) break;
                    v4 /* !! */  = (long)ox.kilq("kjfq", kiln(int ), (int)242);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjfr", kilx(int ), (int)246)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ox.kilq("kjfs", kiln(int ), (int)243)) break;
                    v5 /* !! */  = (long)ox.kilq("kjft", kiln(int ), (int)244);
                }
                v6 = ox.mc.field_1724;
                v7 /* !! */  = ox.sj;
                if (true) ** GOTO lbl55
                block25: while (true) {
                    v7 /* !! */  = (long)(ox.kilq("kjfv", kilx(int ), (int)248) - ox.kilq("kjfu", kilx(int ), (int)247));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1251136524: {
                            break block25;
                        }
                        case 1439627085: {
                            continue block25;
                        }
                    }
                    break;
                }
                v8 = v6.method_33571();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kjfw", kilx(int ), (int)249)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ox.kilq("kjfx", kiln(int ), (int)245)) break;
                    v9 /* !! */  = (long)ox.kilq("kjfy", kiln(int ), (int)246);
                }
                return this.isValidPoint(v8, var3_3, var1_1, var2_2);
            }
            case 0: {
                var5_5 /* !! */  = (int)ox.kilq("kjfz", kiln(int ), (int)247);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 1: {
                do {
                    var5_5 /* !! */  = (int)ox.kilq("kjga", kiln(int ), (int)248);
                } while (!var6_4);
                throw null;
            }
lbl77:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)ox.kilq("kjgb", kiln(int ), (int)249);
                    if (!var6_4) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)ox.kilq("kjgc", kiln(int ), (int)250);
        ** while (!var6_4)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjjn() {
        ox.kily[200] = 662145306563287243L;
        ox.kily[201] = -6506619811803618299L;
        ox.kily[202] = -1019505769616367692L;
        ox.kily[203] = -2240986507104551923L;
        ox.kily[204] = 7988546060390480212L;
        ox.kily[205] = -6387772249176525750L;
        ox.kily[206] = 8345087598774485337L;
        ox.kily[207] = -502878630745738644L;
        ox.kily[208] = 3102958869267405952L;
        ox.kily[209] = -6400594924847524988L;
        ox.kily[210] = -1759824050143589890L;
        ox.kily[211] = 436090618862045140L;
        ox.kily[212] = 9049799835609877255L;
        ox.kily[213] = -2303068889341325117L;
        ox.kily[214] = -6295464392465408906L;
        ox.kily[215] = -7619469205266661185L;
        ox.kily[216] = 5305703771968101808L;
        ox.kily[217] = 2474922283605922979L;
        ox.kily[218] = 4099966633619292511L;
        ox.kily[219] = 8676264635561800950L;
        ox.kily[220] = 2078529095710120866L;
        ox.kily[221] = 2277590676539888233L;
        ox.kily[222] = 3700270922550048243L;
        ox.kily[223] = -6210410980809493615L;
        ox.kily[224] = -2295843245923517232L;
        ox.kily[225] = -1878628562601475160L;
        ox.kily[226] = -5459909638817979177L;
        ox.kily[227] = -5924132232780621747L;
        ox.kily[228] = 2467097264246117509L;
        ox.kily[229] = -2278212481065065195L;
        ox.kily[230] = -1722254361217783367L;
        ox.kily[231] = 74023354216548281L;
        ox.kily[232] = 6280675353663148610L;
        ox.kily[233] = 999728286418977882L;
        ox.kily[234] = 2631820075356849225L;
        ox.kily[235] = 2412228604822208593L;
        ox.kily[236] = -4333040700254012991L;
        ox.kily[237] = 6647579929157552662L;
        ox.kily[238] = -1381155237798973588L;
        ox.kily[239] = -6413746516886706151L;
        ox.kily[240] = 4110358502202583688L;
        ox.kily[241] = 1772038771810383353L;
        ox.kily[242] = -3045411798423473275L;
        ox.kily[243] = 8617863777743032497L;
        ox.kily[244] = -703612332774067335L;
        ox.kily[245] = 1800326501427228080L;
        ox.kily[246] = -8710983261525784517L;
        ox.kily[247] = 6212856914988862017L;
        ox.kily[248] = 3673688337880337536L;
        ox.kily[249] = -253231474957307820L;
        ox.kily[250] = 6089583178464605471L;
        ox.kily[251] = -4820808601990419624L;
        ox.kily[252] = -852393296213911394L;
        ox.kily[253] = 7409846313077291422L;
        ox.kily[254] = 4916523619365025476L;
        ox.kily[255] = -1092558515011920248L;
        ox.kily[256] = 8162668242475914245L;
        ox.kily[257] = -5528690152196116680L;
        ox.kily[258] = 8018242078170878523L;
        ox.kily[259] = 2079435948606674656L;
        ox.kily[260] = 8657779237419822587L;
        ox.kily[261] = -8006792502763672181L;
        ox.kily[262] = -9120831636406550713L;
        ox.kily[263] = 1597123881934388574L;
        ox.kily[264] = -929033712105726742L;
        ox.kily[265] = -715850976448871468L;
        ox.kily[266] = -2806608124178617524L;
        ox.kily[267] = 4563565904925142517L;
        ox.kily[268] = 6592494530312607131L;
        ox.kily[269] = -4336407347620233025L;
        ox.kily[270] = -8611708587094215664L;
        ox.kily[271] = -637074121562313702L;
        ox.kily[272] = -6329897317975858795L;
        ox.kily[273] = 7678928328134730711L;
        ox.kily[274] = -2959294572003864388L;
        ox.kily[275] = 2553505164847664193L;
        ox.kily[276] = 3886098769397636120L;
        ox.kily[277] = -7465183645251430536L;
        ox.kily[278] = -1458945235714003875L;
        ox.kily[279] = -8119332091429701507L;
        ox.kily[280] = 1637157023830588556L;
        ox.kily[281] = -1599347340769595423L;
        ox.kily[282] = -207061403971338112L;
        ox.kily[283] = 5030272695072038969L;
        ox.kily[284] = -8692506203496454016L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isValidPoint(class_243 var1_1, class_243 var2_2, float var3_3, boolean var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kitd", kilx(int ), (int)78)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ox.kilq("kite", kiln(int ), (int)85)) break;
            v0 /* !! */  = (long)ox.kilq("kitf", kiln(int ), (int)86);
        }
        var7_5 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kitg", kilx(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ox.kilq("kith", kiln(int ), (int)87)) break;
            v1 /* !! */  = (long)ox.kilq("kiti", kiln(int ), (int)88);
        }
        var6_6 /* !! */  = ox.b;
        v2 /* !! */  = ox.sj;
        if (true) ** GOTO lbl17
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - ox.kilq("kitj", kilx(int ), (int)80));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1686571059: {
                    v3 = ox.kilq("kitk", kilx(int ), (int)81);
                    continue block27;
                }
                case -1370787312: {
                    v3 = ox.kilq("kitl", kilx(int ), (int)82);
                    continue block27;
                }
                case 1251136524: {
                    break block27;
                }
            }
            break;
        }
        var5_7 = ox.a;
        if (var7_5) {
            throw null;
lbl29:
            // 7 sources

            return (boolean)ox.kilq("kitm", kiln(int ), (int)89);
        }
        if (var5_7) ** GOTO lbl29
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kitn", kilx(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ox.kilq("kito", kiln(int ), (int)90)) break;
                    v4 /* !! */  = (long)ox.kilq("kitp", kiln(int ), (int)91);
                }
                if (!(var1_1.method_1022(var2_2) <= (double)var3_3)) ** GOTO lbl90
                if (var5_7) ** GOTO lbl29
                if (var4_4) ** GOTO lbl85
                if (var5_7) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kitq", kilx(int ), (int)84)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ox.kilq("kitr", kiln(int ), (int)92)) break;
                    v5 /* !! */  = (long)ox.kilq("kits", kiln(int ), (int)93);
                }
                v6 /* !! */  = ox.sj;
                if (true) ** GOTO lbl54
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - ox.kilq("kitt", kilx(int ), (int)85));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1665551666: {
                            v7 = ox.kilq("kitu", kilx(int ), (int)86);
                            continue block31;
                        }
                        case 247424637: {
                            v7 = ox.kilq("kitv", kilx(int ), (int)87);
                            continue block31;
                        }
                        case 1251136524: {
                            break block31;
                        }
                        case 1794345152: {
                            v7 = ox.kilq("kitw", kilx(int ), (int)88);
                            continue block31;
                        }
                    }
                    break;
                }
                v8 = oy.raycast(var1_1, var2_2, class_3959.class_3960.field_17558);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kitx", kilx(int ), (int)89)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ox.kilq("kity", kiln(int ), (int)94)) break;
                    v9 /* !! */  = (long)ox.kilq("kitz", kiln(int ), (int)95);
                }
                v10 = v8.method_17783();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = ox.sj - ox.kilq("kiua", kilx(int ), (int)90)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ox.kilq("kiub", kiln(int ), (int)96)) break;
                    v11 /* !! */  = (long)ox.kilq("kiuc", kiln(int ), (int)97);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = ox.sj - ox.kilq("kiud", kilx(int ), (int)91)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ox.kilq("kiue", kiln(int ), (int)98)) break;
                    v12 /* !! */  = (long)ox.kilq("kiuf", kiln(int ), (int)99);
                }
                if (v10.equals((Object)class_239.class_240.field_1332)) ** GOTO lbl90
                if (var5_7) ** GOTO lbl29
lbl85:
                // 2 sources

                if (var5_7 || var5_7) ** GOTO lbl29
                v13 = ox.kilq("kiug", kiln(int ), (int)100);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl93
lbl90:
                // 2 sources

                if (!var5_7 && !var5_7) ** break;
                ** continue;
                v13 = ox.kilq("kiuh", kiln(int ), (int)101);
lbl93:
                // 2 sources

                return (boolean)v13;
            }
lbl94:
            // 2 sources

            case 0: {
                var6_6 /* !! */  = (int)ox.kilq("kiui", kiln(int ), (int)102);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 1: {
                var6_6 /* !! */  = (int)ox.kilq("kiuj", kiln(int ), (int)103);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl104:
            // 3 sources

            case 2: {
                var6_6 /* !! */  = (int)ox.kilq("kiuk", kiln(int ), (int)104);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 3: {
                var6_6 /* !! */  = (int)ox.kilq("kiul", kiln(int ), (int)105);
                if (var7_5) {
                    throw null;
                }
            }
lbl113:
            // 6 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)ox.kilq("kium", kiln(int ), (int)106);
                    if (!var7_5) ** GOTO lbl104
                    throw null;
                }
            }
            case 5: {
                var6_6 /* !! */  = (int)ox.kilq("kiun", kiln(int ), (int)107);
                if (!var7_5) ** GOTO lbl113
                throw null;
            }
lbl122:
            // 2 sources

            case 6: {
                var6_6 /* !! */  = (int)ox.kilq("kiuo", kiln(int ), (int)108);
                if (!var7_5) ** GOTO lbl94
                throw null;
            }
            case 7: {
                var6_6 /* !! */  = (int)ox.kilq("kiup", kiln(int ), (int)109);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl131:
            // 2 sources

            case 8: {
                var6_6 /* !! */  = (int)ox.kilq("kiuq", kiln(int ), (int)110);
                if (var7_5) {
                    throw null;
                }
            }
lbl135:
            // 4 sources

            case 9: {
                var6_6 /* !! */  = (int)ox.kilq("kiur", kiln(int ), (int)111);
                if (!var7_5) ** GOTO lbl104
                throw null;
            }
            case 10: {
                var6_6 /* !! */  = (int)ox.kilq("kius", kiln(int ), (int)112);
                if (!var7_5) ** GOTO lbl113
                throw null;
            }
            case 11: 
        }
        var6_6 /* !! */  = (int)ox.kilq("kiut", kiln(int ), (int)113);
        ** while (!var7_5)
lbl146:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjjj() {
        ox.kilp[100] = -1044360420;
        ox.kilp[101] = -713151813;
        ox.kilp[102] = -1920696292;
        ox.kilp[103] = -992453393;
        ox.kilp[104] = 1489031133;
        ox.kilp[105] = 2061502599;
        ox.kilp[106] = -574245504;
        ox.kilp[107] = 590527587;
        ox.kilp[108] = 2140018381;
        ox.kilp[109] = -509578509;
        ox.kilp[110] = 1046872459;
        ox.kilp[111] = -1292205525;
        ox.kilp[112] = -1428405090;
        ox.kilp[113] = 522146151;
        ox.kilp[114] = -2074552335;
        ox.kilp[115] = -167550936;
        ox.kilp[116] = 1704024916;
        ox.kilp[117] = -102280483;
        ox.kilp[118] = 1585605655;
        ox.kilp[119] = 563039751;
        ox.kilp[120] = 1506004609;
        ox.kilp[121] = 276207850;
        ox.kilp[122] = 2025967136;
        ox.kilp[123] = 1351592028;
        ox.kilp[124] = -781301418;
        ox.kilp[125] = -634493191;
        ox.kilp[126] = 1758665052;
        ox.kilp[127] = -537361251;
        ox.kilp[128] = -1011188895;
        ox.kilp[129] = 548213921;
        ox.kilp[130] = 287099789;
        ox.kilp[131] = 1551466184;
        ox.kilp[132] = 1953144526;
        ox.kilp[133] = 1296477123;
        ox.kilp[134] = 515969562;
        ox.kilp[135] = 1035892207;
        ox.kilp[136] = 1013537973;
        ox.kilp[137] = -1594148735;
        ox.kilp[138] = -686864650;
        ox.kilp[139] = -739656792;
        ox.kilp[140] = 262374679;
        ox.kilp[141] = -1883588525;
        ox.kilp[142] = -1951892978;
        ox.kilp[143] = -1008233488;
        ox.kilp[144] = 406279814;
        ox.kilp[145] = -1158194299;
        ox.kilp[146] = -749830665;
        ox.kilp[147] = 264781406;
        ox.kilp[148] = -214964680;
        ox.kilp[149] = 1175690819;
        ox.kilp[150] = 39431296;
        ox.kilp[151] = 380651268;
        ox.kilp[152] = 65076898;
        ox.kilp[153] = -648981006;
        ox.kilp[154] = 958161066;
        ox.kilp[155] = -617001442;
        ox.kilp[156] = 972913774;
        ox.kilp[157] = -1597556723;
        ox.kilp[158] = -587833271;
        ox.kilp[159] = 243607546;
        ox.kilp[160] = -1800877082;
        ox.kilp[161] = -663133910;
        ox.kilp[162] = -710609847;
        ox.kilp[163] = 1287077576;
        ox.kilp[164] = 207778856;
        ox.kilp[165] = -830078477;
        ox.kilp[166] = 1215018728;
        ox.kilp[167] = -739107909;
        ox.kilp[168] = -1165437973;
        ox.kilp[169] = -286328891;
        ox.kilp[170] = 479737483;
        ox.kilp[171] = -1708248708;
        ox.kilp[172] = -689661117;
        ox.kilp[173] = -1545508890;
        ox.kilp[174] = -910953195;
        ox.kilp[175] = 611008295;
        ox.kilp[176] = 643185558;
        ox.kilp[177] = 1826367428;
        ox.kilp[178] = -432048937;
        ox.kilp[179] = 616734949;
        ox.kilp[180] = 1409790582;
        ox.kilp[181] = 156816324;
        ox.kilp[182] = -846944648;
        ox.kilp[183] = -813323346;
        ox.kilp[184] = 210704859;
        ox.kilp[185] = -206651808;
        ox.kilp[186] = 1162619222;
        ox.kilp[187] = 1954087109;
        ox.kilp[188] = -532074686;
        ox.kilp[189] = -786673544;
        ox.kilp[190] = 112756800;
        ox.kilp[191] = 429598102;
        ox.kilp[192] = 779376080;
        ox.kilp[193] = 63698347;
        ox.kilp[194] = 1486849593;
        ox.kilp[195] = 1510583445;
        ox.kilp[196] = -231592014;
        ox.kilp[197] = 2094093288;
        ox.kilp[198] = 782183602;
        ox.kilp[199] = -438082223;
    }

    private static /* synthetic */ double kiov(int n2) {
        return Double.longBitsToDouble(kily[n2] ^ kilz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_243 lambda$generateCandidatePoints$2(class_238 var0, Double var1_1) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - ox.kilq("kjgd", kilx(int ), (int)250));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -557364847: {
                    v1 = ox.kilq("kjge", kilx(int ), (int)251);
                    continue block31;
                }
                case 1251136524: {
                    break block31;
                }
                case 1383023349: {
                    v1 = ox.kilq("kjgf", kilx(int ), (int)252);
                    continue block31;
                }
            }
            break;
        }
        var4_2 = ox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjgg", kilx(int ), (int)253)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kjgh", kiln(int ), (int)251)) break;
            v2 /* !! */  = (long)ox.kilq("kjgi", kiln(int ), (int)252);
        }
        var3_3 /* !! */  = ox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjgj", kilx(int ), (int)254)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ox.kilq("kjgk", kiln(int ), (int)253)) break;
            v3 /* !! */  = (long)ox.kilq("kjgl", kiln(int ), (int)254);
        }
        var2_4 = ox.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ox.sj;
                if (true) ** GOTO lbl39
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - ox.kilq("kjgm", kilx(int ), (int)255));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1861702722: {
                            v5 = ox.kilq("kjgn", kilx(int ), (int)256);
                            continue block35;
                        }
                        case 1251136524: {
                            break block35;
                        }
                        case 1578543021: {
                            v5 = ox.kilq("kjgo", kilx(int ), (int)257);
                            continue block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjgp", kilx(int ), (int)258)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ox.kilq("kjgq", kiln(int ), (int)255)) break;
                    v6 /* !! */  = (long)ox.kilq("kjgr", kiln(int ), (int)256);
                }
                v7 = var0.method_1005();
                v8 /* !! */  = ox.sj;
                if (true) ** GOTO lbl58
                block37: while (true) {
                    v8 /* !! */  = (long)(v9 - ox.kilq("kjgs", kilx(int ), (int)259));
lbl58:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -865400268: {
                            v9 = ox.kilq("kjgt", kilx(int ), (int)260);
                            continue block37;
                        }
                        case -772370916: {
                            v9 = ox.kilq("kjgu", kilx(int ), (int)261);
                            continue block37;
                        }
                        case 1251136524: {
                            break block37;
                        }
                    }
                    break;
                }
                v10 = v7.field_1352;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kjgv", kilx(int ), (int)262)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ox.kilq("kjgw", kiln(int ), (int)257)) break;
                    v11 /* !! */  = (long)ox.kilq("kjgx", kiln(int ), (int)258);
                }
                v12 = var1_1;
                v13 /* !! */  = ox.sj;
                if (true) ** GOTO lbl78
                block39: while (true) {
                    v13 /* !! */  = (long)(v14 - ox.kilq("kjgy", kilx(int ), (int)263));
lbl78:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 493230756: {
                            v14 = ox.kilq("kjgz", kilx(int ), (int)264);
                            continue block39;
                        }
                        case 1251136524: {
                            break block39;
                        }
                        case 1625311449: {
                            v14 = ox.kilq("kjha", kilx(int ), (int)265);
                            continue block39;
                        }
                    }
                    break;
                }
                v15 = var0.method_1005();
                v16 /* !! */  = ox.sj;
                if (true) ** GOTO lbl92
                block40: while (true) {
                    v16 /* !! */  = (long)(v17 - ox.kilq("kjhb", kilx(int ), (int)266));
lbl92:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -890430691: {
                            v17 = ox.kilq("kjhc", kilx(int ), (int)267);
                            continue block40;
                        }
                        case 83722419: {
                            v17 = ox.kilq("kjhd", kilx(int ), (int)268);
                            continue block40;
                        }
                        case 1251136524: {
                            break block40;
                        }
                    }
                    break;
                }
                v18 = v15.field_1350;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kjhe", kilx(int ), (int)269)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ox.kilq("kjhf", kiln(int ), (int)259)) break;
                    v19 /* !! */  = (long)ox.kilq("kjhg", kiln(int ), (int)260);
                }
                return new class_243(v10, v12, v18);
            }
lbl108:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ox.kilq("kjhh", kiln(int ), (int)261);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ox.kilq("kjhi", kiln(int ), (int)262);
                    if (!var4_2) ** GOTO lbl108
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ox.kilq("kjhj", kiln(int ), (int)263);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ox.kilq("kjhk", kiln(int ), (int)264);
        ** while (!var4_2)
lbl125:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$generateCandidatePoints$0(class_238 var0, Double var1_1) {
        block45: {
            while (true) {
                block46: {
                    if ((v0 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjie", kilx(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != ox.kilq("kjif", kiln(int ), (int)279)) break block46;
                    var4_2 = ox.c;
                    v1 /* !! */  = ox.sj;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)ox.kilq("kjig", kiln(int ), (int)280);
            }
            block22: while (true) {
                v1 /* !! */  = (long)(v2 - ox.kilq("kjih", kilx(int ), (int)276));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1059237066: {
                        v2 = ox.kilq("kjii", kilx(int ), (int)277);
                        continue block22;
                    }
                    case 1251136524: {
                        break block22;
                    }
                    case 1780186682: {
                        v2 = ox.kilq("kjij", kilx(int ), (int)278);
                        continue block22;
                    }
                }
                break;
            }
            var3_3 /* !! */  = ox.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjik", kilx(int ), (int)279)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ox.kilq("kjil", kiln(int ), (int)281)) {
                    var2_4 = ox.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ox.kilq("kjim", kiln(int ), (int)282);
            }
            if (var2_4 || var2_4) return (boolean)ox.kilq("kjin", kiln(int ), (int)283);
            while (true) {
                block47: {
                    if ((v4 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kjio", kilx(int ), (int)280)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  != ox.kilq("kjip", kiln(int ), (int)284)) break block47;
                    v5 = var1_1;
                    v6 /* !! */  = ox.sj;
                    if (true) ** GOTO lbl46
                }
                v4 /* !! */  = (long)ox.kilq("kjiq", kiln(int ), (int)285);
            }
            block25: while (true) {
                v6 /* !! */  = (long)(v7 - ox.kilq("kjir", kilx(int ), (int)281));
lbl46:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2063047716: {
                        v7 = ox.kilq("kjis", kilx(int ), (int)282);
                        continue block25;
                    }
                    case 1133378338: {
                        v7 = ox.kilq("kjit", kilx(int ), (int)283);
                        continue block25;
                    }
                    case 1251136524: {
                        break block25;
                    }
                    case 1661569359: {
                        v7 = ox.kilq("kjiu", kilx(int ), (int)284);
                        continue block25;
                    }
                }
                break;
            }
            if (!(v5 <= var0.field_1325)) ** GOTO lbl68
            if (var2_4) return (boolean)ox.kilq("kjin", kiln(int ), (int)283);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v8 = ox.kilq("kjiv", kiln(int ), (int)286);
                        if (!var4_2) return (boolean)v8;
                        throw null;
                    }
lbl68:
                    // 1 sources

                    if (var2_4 || var2_4) {
                        return (boolean)ox.kilq("kjin", kiln(int ), (int)283);
                    }
                    v8 = ox.kilq("kjiw", kiln(int ), (int)287);
                    return (boolean)v8;
                    case 0: {
                        ** GOTO lbl84
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ox.kilq("kjjb", kiln(int ), (int)292);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ox.kilq("kjje", kiln(int ), (int)295);
                        if (var4_2) {
                            throw null;
                        }
lbl84:
                        // 3 sources

                        var3_3 /* !! */  = (int)ox.kilq("kjix", kiln(int ), (int)288);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)ox.kilq("kjiy", kiln(int ), (int)289);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ox.kilq("kjjc", kiln(int ), (int)293);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)ox.kilq("kjjd", kiln(int ), (int)294);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ox.kilq("kjiz", kiln(int ), (int)290);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                break;
            }
            ** GOTO lbl110
        }
        do {
            if (true) ** continue;
lbl110:
            // 2 sources

            var3_3 /* !! */  = (int)ox.kilq("kjja", kiln(int ), (int)291);
            cfr_temp_0 = 2;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void kjji() {
        ox.kilp[0] = -1982710329;
        ox.kilp[1] = -757387459;
        ox.kilp[2] = 1551646239;
        ox.kilp[3] = -810190523;
        ox.kilp[4] = 1646530270;
        ox.kilp[5] = -1089179944;
        ox.kilp[6] = -1956283482;
        ox.kilp[7] = 1060767164;
        ox.kilp[8] = -12167712;
        ox.kilp[9] = -230084346;
        ox.kilp[10] = 480556566;
        ox.kilp[11] = 1807238711;
        ox.kilp[12] = -1198037300;
        ox.kilp[13] = -1726675784;
        ox.kilp[14] = -1923975412;
        ox.kilp[15] = 1445816140;
        ox.kilp[16] = 1805816399;
        ox.kilp[17] = -2120799983;
        ox.kilp[18] = 948281098;
        ox.kilp[19] = -1604692020;
        ox.kilp[20] = 2065277831;
        ox.kilp[21] = 1292455890;
        ox.kilp[22] = -94670094;
        ox.kilp[23] = -170329801;
        ox.kilp[24] = 2064199846;
        ox.kilp[25] = 823215518;
        ox.kilp[26] = 604238645;
        ox.kilp[27] = 925300373;
        ox.kilp[28] = 1942816693;
        ox.kilp[29] = -534403582;
        ox.kilp[30] = 1400772405;
        ox.kilp[31] = 135877722;
        ox.kilp[32] = -1859401492;
        ox.kilp[33] = 1862415545;
        ox.kilp[34] = -282833980;
        ox.kilp[35] = 1955822074;
        ox.kilp[36] = 387078709;
        ox.kilp[37] = 1925639296;
        ox.kilp[38] = 1063853516;
        ox.kilp[39] = 1571870845;
        ox.kilp[40] = 498173684;
        ox.kilp[41] = -363097186;
        ox.kilp[42] = 463683719;
        ox.kilp[43] = -1737730166;
        ox.kilp[44] = -619092915;
        ox.kilp[45] = 1510767611;
        ox.kilp[46] = -1826600416;
        ox.kilp[47] = 642709042;
        ox.kilp[48] = 929380655;
        ox.kilp[49] = 1240760209;
        ox.kilp[50] = 548610850;
        ox.kilp[51] = 851197191;
        ox.kilp[52] = -1800366771;
        ox.kilp[53] = -1782055822;
        ox.kilp[54] = 776262792;
        ox.kilp[55] = -204829139;
        ox.kilp[56] = 1087255738;
        ox.kilp[57] = -1468882259;
        ox.kilp[58] = 49382357;
        ox.kilp[59] = 2100379365;
        ox.kilp[60] = 590909913;
        ox.kilp[61] = -1464574494;
        ox.kilp[62] = -192864419;
        ox.kilp[63] = -597611576;
        ox.kilp[64] = 1514991483;
        ox.kilp[65] = -5073625;
        ox.kilp[66] = -1454712541;
        ox.kilp[67] = -1744686921;
        ox.kilp[68] = 2030625317;
        ox.kilp[69] = -282030755;
        ox.kilp[70] = -1601158916;
        ox.kilp[71] = 407654745;
        ox.kilp[72] = 2038027823;
        ox.kilp[73] = -518234580;
        ox.kilp[74] = -771792101;
        ox.kilp[75] = -966053617;
        ox.kilp[76] = 1337620886;
        ox.kilp[77] = 1584333456;
        ox.kilp[78] = 1788965179;
        ox.kilp[79] = -2064077874;
        ox.kilp[80] = -1340291762;
        ox.kilp[81] = -2048197374;
        ox.kilp[82] = 1090796363;
        ox.kilp[83] = -139413765;
        ox.kilp[84] = -2106586272;
        ox.kilp[85] = -2018449111;
        ox.kilp[86] = -284575432;
        ox.kilp[87] = -1975432895;
        ox.kilp[88] = -881140938;
        ox.kilp[89] = -1200322714;
        ox.kilp[90] = -1364717470;
        ox.kilp[91] = -513267019;
        ox.kilp[92] = -1853052387;
        ox.kilp[93] = -1561771362;
        ox.kilp[94] = 2046694388;
        ox.kilp[95] = 954688418;
        ox.kilp[96] = 465859341;
        ox.kilp[97] = -1017492310;
        ox.kilp[98] = 1779819582;
        ox.kilp[99] = 1824965416;
    }

    private static /* synthetic */ long kilx(int n2) {
        return kily[n2] ^ kilz[n2];
    }

    private static /* synthetic */ int kiln(int n2) {
        return kilo[n2] ^ kilp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_3545<class_243, class_238> computeVector(class_1309 var1_1, float var2_2, ov var3_3, class_243 var4_4, boolean var5_5) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(ox.kilq("kimc", kilx(int ), (int)1) - ox.kilq("kima", kilx(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1944080129: {
                    continue block32;
                }
                case 1251136524: {
                    break block32;
                }
            }
            break;
        }
        var10_6 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kimd", kilx(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ox.kilq("kime", kiln(int ), (int)4)) break;
            v1 /* !! */  = (long)ox.kilq("kimf", kiln(int ), (int)5);
        }
        var9_7 /* !! */  = ox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kimg", kilx(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ox.kilq("kimh", kiln(int ), (int)6)) break;
            v2 /* !! */  = (long)ox.kilq("kimi", kiln(int ), (int)7);
        }
        var8_8 = ox.a;
        if (var10_6) {
            throw null;
lbl27:
            // 4 sources

            return null;
        }
        if (var8_8 || var8_8) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kimk", kilx(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ox.kilq("kiml", kiln(int ), (int)8)) break;
            v3 /* !! */  = (long)ox.kilq("kimm", kiln(int ), (int)9);
        }
        var6_9 = this.generateCandidatePoints(var1_1, var2_2, var5_5);
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_8 || var8_8) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kimn", kilx(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ox.kilq("kimo", kiln(int ), (int)10)) break;
                    v4 /* !! */  = (long)ox.kilq("kimq", kiln(int ), (int)11);
                }
                v5 = (List)var6_9.method_15442();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kimr", kilx(int ), (int)6)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ox.kilq("kims", kiln(int ), (int)12)) break;
                    v6 /* !! */  = (long)ox.kilq("kimt", kiln(int ), (int)13);
                }
                var7_10 = this.findBestVector(v5, var3_3);
                if (var8_8 || var8_8) ** GOTO lbl27
                v7 /* !! */  = ox.sj;
                if (true) ** GOTO lbl60
                block39: while (true) {
                    v7 /* !! */  = (long)(ox.kilq("kimw", kilx(int ), (int)8) - ox.kilq("kimu", kilx(int ), (int)7));
lbl60:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -557077764: {
                            continue block39;
                        }
                        case 1251136524: {
                            break block39;
                        }
                    }
                    break;
                }
                this.updateOffset(var4_4);
                if (var8_8 || var8_8) ** continue;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = ox.sj - ox.kilq("kimx", kilx(int ), (int)9)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ox.kilq("kimy", kiln(int ), (int)14)) break;
                    v8 /* !! */  = (long)ox.kilq("kimz", kiln(int ), (int)15);
                }
                if (var7_10 != null) ** GOTO lbl87
                v9 /* !! */  = ox.sj;
                if (true) ** GOTO lbl78
                block41: while (true) {
                    v9 /* !! */  = (long)(ox.kilq("kinb", kilx(int ), (int)11) - ox.kilq("kina", kilx(int ), (int)10));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 825513741: {
                            continue block41;
                        }
                        case 1251136524: {
                            break block41;
                        }
                    }
                    break;
                }
                v10 = var1_1.method_33571();
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl88
lbl87:
                // 1 sources

                v10 = var7_10;
lbl88:
                // 2 sources

                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = ox.sj - ox.kilq("kind", kilx(int ), (int)12)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ox.kilq("kine", kiln(int ), (int)16)) break;
                    v11 /* !! */  = (long)ox.kilq("kinf", kiln(int ), (int)17);
                }
                v12 /* !! */  = ox.sj;
                if (true) ** GOTO lbl98
                block43: while (true) {
                    v12 /* !! */  = (long)(ox.kilq("kini", kilx(int ), (int)14) - ox.kilq("king", kilx(int ), (int)13));
lbl98:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -294578960: {
                            continue block43;
                        }
                        case 1251136524: {
                            break block43;
                        }
                    }
                    break;
                }
                v13 = v10.method_1019(this.offset);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_7 = ox.sj - ox.kilq("kinj", kilx(int ), (int)15)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == ox.kilq("kink", kiln(int ), (int)18)) break;
                    v14 /* !! */  = (long)ox.kilq("kinl", kiln(int ), (int)19);
                }
                v15 = (class_238)var6_9.method_15441();
                v16 /* !! */  = ox.sj;
                if (true) ** GOTO lbl115
                block45: while (true) {
                    v16 /* !! */  = (long)(ox.kilq("kino", kilx(int ), (int)17) - ox.kilq("kinm", kilx(int ), (int)16));
lbl115:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1192865903: {
                            continue block45;
                        }
                        case 1251136524: {
                            break block45;
                        }
                    }
                    break;
                }
                return new class_3545((Object)v13, (Object)v15);
            }
            case 0: {
                var9_7 /* !! */  = (int)ox.kilq("kinp", kiln(int ), (int)20);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 1: {
                var9_7 /* !! */  = (int)ox.kilq("kinr", kiln(int ), (int)21);
                if (!var10_6) break;
                throw null;
            }
lbl130:
            // 4 sources

            case 2: {
                var9_7 /* !! */  = (int)ox.kilq("kins", kiln(int ), (int)22);
                if (!var10_6) break;
                throw null;
            }
lbl134:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_7 /* !! */  = (int)ox.kilq("kint", kiln(int ), (int)23);
                    if (var10_6) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
lbl140:
            // 2 sources

            case 4: {
                var9_7 /* !! */  = (int)ox.kilq("kinv", kiln(int ), (int)24);
                if (!var10_6) ** GOTO lbl130
                throw null;
            }
            case 5: {
                var9_7 /* !! */  = (int)ox.kilq("kinx", kiln(int ), (int)25);
                if (!var10_6) ** GOTO lbl130
                throw null;
            }
lbl148:
            // 2 sources

            case 6: {
                var9_7 /* !! */  = (int)ox.kilq("kiny", kiln(int ), (int)26);
                if (!var10_6) ** GOTO lbl130
                throw null;
            }
            case 7: {
                var9_7 /* !! */  = (int)ox.kilq("kioa", kiln(int ), (int)27);
                if (!var10_6) ** GOTO lbl134
                throw null;
            }
            case 8: {
                do {
                    var9_7 /* !! */  = (int)ox.kilq("kiob", kiln(int ), (int)28);
                } while (!var10_6);
                throw null;
            }
            case 9: 
        }
        var9_7 /* !! */  = (int)ox.kilq("kioc", kiln(int ), (int)29);
        ** while (!var10_6)
lbl164:
        // 1 sources

        throw null;
    }

    static {
        kilo = new int[296];
        kilp = new int[296];
        ox.kjjf();
        ox.kjjg();
        ox.kjjh();
        ox.kjji();
        ox.kjjj();
        ox.kjjk();
        kily = new long[285];
        kilz = new long[285];
        ox.kjjl();
        ox.kjjm();
        ox.kjjn();
        ox.kjjo();
        ox.kjjp();
        ox.kjjq();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double calculateRotationDifference(class_243 var1_1, class_243 var2_2, ov var3_3) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ox.kilq("kivv", kilx(int ), (int)107));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1888342665: {
                    v1 = ox.kilq("kivw", kilx(int ), (int)108);
                    continue block17;
                }
                case -1805243703: {
                    v1 = ox.kilq("kivx", kilx(int ), (int)109);
                    continue block17;
                }
                case 1251136524: {
                    break block17;
                }
                case 1519107624: {
                    v1 = ox.kilq("kivy", kilx(int ), (int)110);
                    continue block17;
                }
            }
            break;
        }
        var8_4 = ox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kivz", kilx(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kiwa", kiln(int ), (int)126)) break;
            v2 /* !! */  = (long)ox.kilq("kiwb", kiln(int ), (int)127);
        }
        var7_5 = ox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kiwc", kilx(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ox.kilq("kiwd", kiln(int ), (int)128)) break;
            v3 /* !! */  = (long)ox.kilq("kiwe", kiln(int ), (int)129);
        }
        var6_6 = ox.a;
        if (var8_4) {
            throw null;
lbl32:
            // 3 sources

            return (double)ox.kilq("kiwf", kiov(int ), (int)113);
        }
        if (var6_6 || var6_6) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kiwg", kilx(int ), (int)114)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ox.kilq("kiwh", kiln(int ), (int)130)) break;
            v4 /* !! */  = (long)ox.kilq("kiwi", kiln(int ), (int)131);
        }
        v5 = var2_2.method_1020(var1_1);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kiwj", kilx(int ), (int)115)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ox.kilq("kiwk", kiln(int ), (int)132)) break;
            v6 /* !! */  = (long)ox.kilq("kiwl", kiln(int ), (int)133);
        }
        var4_7 = ow.fromVec3d(v5);
        if (var6_6 || var6_6) ** GOTO lbl32
        v7 /* !! */  = ox.sj;
        if (true) ** GOTO lbl52
        block23: while (true) {
            v7 /* !! */  = (long)(v8 - ox.kilq("kiwm", kilx(int ), (int)116));
lbl52:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1931622369: {
                    v8 = ox.kilq("kiwn", kilx(int ), (int)117);
                    continue block23;
                }
                case -217932245: {
                    v8 = ox.kilq("kiwo", kilx(int ), (int)118);
                    continue block23;
                }
                case 1251136524: {
                    break block23;
                }
            }
            break;
        }
        var5_8 = ow.calculateDelta(var3_3, var4_7);
        ** while (var6_6 || var6_6)
lbl63:
        // 1 sources

        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kiwp", kilx(int ), (int)119)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ox.kilq("kiwq", kiln(int ), (int)134)) break;
            v9 /* !! */  = (long)ox.kilq("kiwr", kiln(int ), (int)135);
        }
        v10 = var5_8.getYaw();
        v11 /* !! */  = ox.sj;
        if (true) ** GOTO lbl73
        block25: while (true) {
            v11 /* !! */  = (long)(v12 - ox.kilq("kiws", kilx(int ), (int)120));
lbl73:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -749917651: {
                    v12 = ox.kilq("kiwt", kilx(int ), (int)121);
                    continue block25;
                }
                case 1251136524: {
                    break block25;
                }
                case 1934663635: {
                    v12 = ox.kilq("kiwu", kilx(int ), (int)122);
                    continue block25;
                }
                case 1947810547: {
                    v12 = ox.kilq("kiwv", kilx(int ), (int)123);
                    continue block25;
                }
            }
            break;
        }
        v13 = var5_8.getPitch();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = ox.sj - ox.kilq("kiww", kilx(int ), (int)124)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ox.kilq("kiwx", kiln(int ), (int)136)) break;
            v14 /* !! */  = (long)ox.kilq("kiwy", kiln(int ), (int)137);
        }
        return Math.hypot(v10, v13);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_3545<List<class_243>, class_238> generateCandidatePoints(class_1309 var1_1, float var2_2, boolean var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kiof", kilx(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ox.kilq("kiog", kiln(int ), (int)30)) break;
            v0 /* !! */  = (long)ox.kilq("kioh", kiln(int ), (int)31);
        }
        var10_4 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kioi", kilx(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ox.kilq("kioj", kiln(int ), (int)32)) break;
            v1 /* !! */  = (long)ox.kilq("kiok", kiln(int ), (int)33);
        }
        var9_5 = ox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kiol", kilx(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kiom", kiln(int ), (int)34)) break;
            v2 /* !! */  = (long)ox.kilq("kion", kiln(int ), (int)35);
        }
        var8_6 = ox.a;
        if (var10_4) {
            throw null;
lbl21:
            // 4 sources

            return null;
        }
        if (var8_6 || var8_6) ** GOTO lbl21
        v3 /* !! */  = ox.sj;
        if (true) ** GOTO lbl28
        block28: while (true) {
            v3 /* !! */  = (long)(ox.kilq("kioq", kilx(int ), (int)22) - ox.kilq("kioo", kilx(int ), (int)21));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -67837586: {
                    continue block28;
                }
                case 1251136524: {
                    break block28;
                }
            }
            break;
        }
        var4_7 = var1_1.method_5829();
        if (var8_6 || var8_6) ** GOTO lbl21
        v4 /* !! */  = ox.sj;
        if (true) ** GOTO lbl39
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - ox.kilq("kior", kilx(int ), (int)23));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 511367605: {
                    v5 = ox.kilq("kios", kilx(int ), (int)24);
                    continue block29;
                }
                case 1112891460: {
                    v5 = ox.kilq("kiot", kilx(int ), (int)25);
                    continue block29;
                }
                case 1251136524: {
                    break block29;
                }
                case 1602149347: {
                    v5 = ox.kilq("kiou", kilx(int ), (int)26);
                    continue block29;
                }
            }
            break;
        }
        var5_8 = var4_7.method_17940() / ox.kilq("kiox", kiov(int ), (int)27);
        if (var8_6 || var8_6) ** GOTO lbl21
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kioz", kilx(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ox.kilq("kipa", kiln(int ), (int)36)) break;
            v6 /* !! */  = (long)ox.kilq("kipb", kiln(int ), (int)37);
        }
        v7 = var4_7.field_1322;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kipc", kilx(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ox.kilq("kipd", kiln(int ), (int)38)) break;
            v8 /* !! */  = (long)ox.kilq("kipe", kiln(int ), (int)39);
        }
        v9 = v7;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = ox.sj - ox.kilq("kipf", kilx(int ), (int)30)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ox.kilq("kipg", kiln(int ), (int)40)) break;
            v10 /* !! */  = (long)ox.kilq("kiph", kiln(int ), (int)41);
        }
        v11 = (Predicate<Double>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$generateCandidatePoints$0(net.minecraft.class_238 java.lang.Double ), (Ljava/lang/Double;)Z)((class_238)var4_7);
        v12 /* !! */  = ox.sj;
        if (true) ** GOTO lbl75
        block33: while (true) {
            v12 /* !! */  = (long)(v13 - ox.kilq("kipi", kilx(int ), (int)31));
lbl75:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1443382175: {
                    v13 = ox.kilq("kipj", kilx(int ), (int)32);
                    continue block33;
                }
                case 249305072: {
                    v13 = ox.kilq("kipk", kilx(int ), (int)33);
                    continue block33;
                }
                case 1251136524: {
                    break block33;
                }
            }
            break;
        }
        v14 = (UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$generateCandidatePoints$1(double java.lang.Double ), (Ljava/lang/Double;)Ljava/lang/Double;)((double)var5_8);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = ox.sj - ox.kilq("kipl", kilx(int ), (int)34)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == ox.kilq("kipm", kiln(int ), (int)42)) break;
            v15 /* !! */  = (long)ox.kilq("kipo", kiln(int ), (int)43);
        }
        v16 = Stream.iterate(v9, v11, v14);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = ox.sj - ox.kilq("kipp", kilx(int ), (int)35)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ox.kilq("kipq", kiln(int ), (int)44)) break;
            v17 /* !! */  = (long)ox.kilq("kipr", kiln(int ), (int)45);
        }
        v18 = (Function<Double, class_243>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$generateCandidatePoints$2(net.minecraft.class_238 java.lang.Double ), (Ljava/lang/Double;)Lnet/minecraft/class_243;)((class_238)var4_7);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_8 = ox.sj - ox.kilq("kips", kilx(int ), (int)36)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ox.kilq("kipt", kiln(int ), (int)46)) break;
            v19 /* !! */  = (long)ox.kilq("kipu", kiln(int ), (int)47);
        }
        v20 = v16.map(v18);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_9 = ox.sj - ox.kilq("kipv", kilx(int ), (int)37)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == ox.kilq("kipw", kiln(int ), (int)48)) break;
            v21 /* !! */  = (long)ox.kilq("kipx", kiln(int ), (int)49);
        }
        v22 = (Predicate<class_243>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$generateCandidatePoints$3(float boolean net.minecraft.class_243 ), (Lnet/minecraft/class_243;)Z)((ox)this, (float)var2_2, (boolean)var3_3);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_10 = ox.sj - ox.kilq("kipz", kilx(int ), (int)38)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == ox.kilq("kiqa", kiln(int ), (int)50)) break;
            v23 /* !! */  = (long)ox.kilq("kiqb", kiln(int ), (int)51);
        }
        v24 = v20.filter(v22);
        v25 /* !! */  = ox.sj;
        if (true) ** GOTO lbl119
        block39: while (true) {
            v25 /* !! */  = (long)(ox.kilq("kiqd", kilx(int ), (int)40) - ox.kilq("kiqc", kilx(int ), (int)39));
lbl119:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case 121683742: {
                    continue block39;
                }
                case 1251136524: {
                    break block39;
                }
            }
            break;
        }
        var7_9 = v24.toList();
        ** while (var8_6 || var8_6)
lbl126:
        // 1 sources

        while (true) {
            if ((v26 /* !! */  = (cfr_temp_11 = ox.sj - ox.kilq("kiqe", kilx(int ), (int)41)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == ox.kilq("kiqf", kiln(int ), (int)52)) break;
            v26 /* !! */  = (long)ox.kilq("kiqg", kiln(int ), (int)53);
        }
        v27 /* !! */  = ox.sj;
        if (true) ** GOTO lbl135
        block41: while (true) {
            v27 /* !! */  = (long)(v28 - ox.kilq("kiqh", kilx(int ), (int)42));
lbl135:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1132273987: {
                    v28 = ox.kilq("kiqi", kilx(int ), (int)43);
                    continue block41;
                }
                case -390001586: {
                    v28 = ox.kilq("kiqj", kilx(int ), (int)44);
                    continue block41;
                }
                case 1251136524: {
                    break block41;
                }
            }
            break;
        }
        return new class_3545((Object)var7_9, (Object)var4_7);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$hasValidPoint$7(float var1_1, boolean var2_2, class_243 var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjbk", kilx(int ), (int)188)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ox.kilq("kjbl", kiln(int ), (int)190)) break;
            v0 /* !! */  = (long)ox.kilq("kjbm", kiln(int ), (int)191);
        }
        var6_4 = ox.c;
        v1 /* !! */  = ox.sj;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ox.kilq("kjbn", kilx(int ), (int)189));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -939577809: {
                    v2 = ox.kilq("kjbo", kilx(int ), (int)190);
                    continue block21;
                }
                case 1251136524: {
                    break block21;
                }
                case 1266756396: {
                    v2 = ox.kilq("kjbp", kilx(int ), (int)191);
                    continue block21;
                }
            }
            break;
        }
        var5_5 = ox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjbq", kilx(int ), (int)192)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ox.kilq("kjbr", kiln(int ), (int)192)) break;
            v3 /* !! */  = (long)ox.kilq("kjbs", kiln(int ), (int)193);
        }
        var4_6 = ox.a;
        if (var6_4) {
            throw null;
lbl29:
            // 1 sources

            return (boolean)ox.kilq("kjbt", kiln(int ), (int)194);
        }
        ** while (var4_6 || var4_6)
lbl32:
        // 1 sources

        v4 /* !! */  = ox.sj;
        if (true) ** GOTO lbl36
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - ox.kilq("kjbu", kilx(int ), (int)193));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1924897654: {
                    v5 = ox.kilq("kjbv", kilx(int ), (int)194);
                    continue block24;
                }
                case -989851667: {
                    v5 = ox.kilq("kjbw", kilx(int ), (int)195);
                    continue block24;
                }
                case 549723670: {
                    v5 = ox.kilq("kjbx", kilx(int ), (int)196);
                    continue block24;
                }
                case 1251136524: {
                    break block24;
                }
            }
            break;
        }
        v6 /* !! */  = ox.sj;
        if (true) ** GOTO lbl52
        block25: while (true) {
            v6 /* !! */  = (long)(ox.kilq("kjbz", kilx(int ), (int)198) - ox.kilq("kjby", kilx(int ), (int)197));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1525338496: {
                    continue block25;
                }
                case 1251136524: {
                    break block25;
                }
            }
            break;
        }
        v7 = ox.mc.field_1724;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjca", kilx(int ), (int)199)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ox.kilq("kjcb", kiln(int ), (int)195)) break;
            v8 /* !! */  = (long)ox.kilq("kjcc", kiln(int ), (int)196);
        }
        v9 = v7.method_33571();
        v10 /* !! */  = ox.sj;
        if (true) ** GOTO lbl68
        block27: while (true) {
            v10 /* !! */  = (long)(v11 - ox.kilq("kjcd", kilx(int ), (int)200));
lbl68:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1245825662: {
                    v11 = ox.kilq("kjce", kilx(int ), (int)201);
                    continue block27;
                }
                case 201847139: {
                    v11 = ox.kilq("kjcf", kilx(int ), (int)202);
                    continue block27;
                }
                case 1251136524: {
                    break block27;
                }
            }
            break;
        }
        return this.isValidPoint(v9, var3_3, var1_1, var2_2);
    }

    private static /* synthetic */ void kjjl() {
        ox.kily[0] = 4196365349207654935L;
        ox.kily[1] = -8944969920140844481L;
        ox.kily[2] = 7638129060917713809L;
        ox.kily[3] = -8595713892799620146L;
        ox.kily[4] = 1316226229684377734L;
        ox.kily[5] = -1876764140949675865L;
        ox.kily[6] = -3039235157985807744L;
        ox.kily[7] = -4042339379983811947L;
        ox.kily[8] = -2649599557454897686L;
        ox.kily[9] = 2022424290690112982L;
        ox.kily[10] = 2804621479820683878L;
        ox.kily[11] = -3124975267947756060L;
        ox.kily[12] = 3514906279012230619L;
        ox.kily[13] = 4816530246290780356L;
        ox.kily[14] = 6901052657440646701L;
        ox.kily[15] = 8819269511165043982L;
        ox.kily[16] = 4224882889591905255L;
        ox.kily[17] = 1519425536683421540L;
        ox.kily[18] = -2622386568635352065L;
        ox.kily[19] = 3640533895115317489L;
        ox.kily[20] = 5128674007362291700L;
        ox.kily[21] = -4437298414908730945L;
        ox.kily[22] = 5133850814954137290L;
        ox.kily[23] = 6083426763235300797L;
        ox.kily[24] = 905510401510258822L;
        ox.kily[25] = -8554228594297728408L;
        ox.kily[26] = 8967868317159745465L;
        ox.kily[27] = 1714515726040063611L;
        ox.kily[28] = -1766880125382174957L;
        ox.kily[29] = 3933670963514867698L;
        ox.kily[30] = 4255468823852781100L;
        ox.kily[31] = -7395654323156351115L;
        ox.kily[32] = 1212672902033189801L;
        ox.kily[33] = -6584703177671382516L;
        ox.kily[34] = 2889393573285619025L;
        ox.kily[35] = 2690300218318004731L;
        ox.kily[36] = 8850944242813632127L;
        ox.kily[37] = -5935727360259429618L;
        ox.kily[38] = 2200098125467636485L;
        ox.kily[39] = -1685484103411150519L;
        ox.kily[40] = 564042716582737125L;
        ox.kily[41] = 6955746517760491855L;
        ox.kily[42] = 7476193086314601738L;
        ox.kily[43] = -4307080522446741867L;
        ox.kily[44] = -7318770573475625308L;
        ox.kily[45] = -4617106317531198335L;
        ox.kily[46] = 4502410248278372536L;
        ox.kily[47] = 7912280665884475872L;
        ox.kily[48] = -2599943526734448381L;
        ox.kily[49] = -340183675104874995L;
        ox.kily[50] = -4732182086572147363L;
        ox.kily[51] = 8634829539026854417L;
        ox.kily[52] = -9056197972545102267L;
        ox.kily[53] = 8375570932665518155L;
        ox.kily[54] = -6432812636022206887L;
        ox.kily[55] = -5932905285980143593L;
        ox.kily[56] = -8571520828940599034L;
        ox.kily[57] = 3784353553430331473L;
        ox.kily[58] = 4180211909318471031L;
        ox.kily[59] = -1871763966843927272L;
        ox.kily[60] = -4411582652677260824L;
        ox.kily[61] = -6045872879571118038L;
        ox.kily[62] = 8526942964802919712L;
        ox.kily[63] = 5615190296471097982L;
        ox.kily[64] = -6487122110599260453L;
        ox.kily[65] = 3724395904998811505L;
        ox.kily[66] = 2515733986028082156L;
        ox.kily[67] = 3854577123556993725L;
        ox.kily[68] = -944415394769406402L;
        ox.kily[69] = 4441665858081183088L;
        ox.kily[70] = 5796270806995143421L;
        ox.kily[71] = -2034898366112797293L;
        ox.kily[72] = -3827975940330401872L;
        ox.kily[73] = -4897670252770601623L;
        ox.kily[74] = -6238569474877538075L;
        ox.kily[75] = -4459447222778939697L;
        ox.kily[76] = 658033727462621864L;
        ox.kily[77] = -5512650140166975275L;
        ox.kily[78] = -6884198942001459474L;
        ox.kily[79] = 6143094043558257664L;
        ox.kily[80] = -1473144325260716796L;
        ox.kily[81] = 6917393885873831942L;
        ox.kily[82] = -2560895150205105260L;
        ox.kily[83] = 4143864928660715290L;
        ox.kily[84] = 7732027609774277467L;
        ox.kily[85] = -5669750966781620563L;
        ox.kily[86] = -4041032028724038364L;
        ox.kily[87] = 3094251501346148659L;
        ox.kily[88] = -1474014517911441283L;
        ox.kily[89] = -8573361498064139701L;
        ox.kily[90] = 755346001658430407L;
        ox.kily[91] = -516179576710048805L;
        ox.kily[92] = -267486821783334488L;
        ox.kily[93] = -8430313458038750331L;
        ox.kily[94] = 3945071794025780830L;
        ox.kily[95] = 104705312880680001L;
        ox.kily[96] = -5343085857047697037L;
        ox.kily[97] = -4535769732728746849L;
        ox.kily[98] = -6761215078356651392L;
        ox.kily[99] = 2490995002796837378L;
    }

    private static /* synthetic */ void kjjg() {
        ox.kilo[100] = -1044360419;
        ox.kilo[101] = -713151813;
        ox.kilo[102] = -1920696289;
        ox.kilo[103] = -992453404;
        ox.kilo[104] = 1489031131;
        ox.kilo[105] = 2061502604;
        ox.kilo[106] = -574245497;
        ox.kilo[107] = 590527586;
        ox.kilo[108] = 2140018381;
        ox.kilo[109] = -509578501;
        ox.kilo[110] = 1046872462;
        ox.kilo[111] = -1292205526;
        ox.kilo[112] = -1428405096;
        ox.kilo[113] = 522146148;
        ox.kilo[114] = 2074552334;
        ox.kilo[115] = 458123210;
        ox.kilo[116] = -1704024917;
        ox.kilo[117] = -1070062125;
        ox.kilo[118] = -1585605656;
        ox.kilo[119] = -914993955;
        ox.kilo[120] = -1506004610;
        ox.kilo[121] = 39258466;
        ox.kilo[122] = 2025967138;
        ox.kilo[123] = 1351592030;
        ox.kilo[124] = -781301417;
        ox.kilo[125] = -634493190;
        ox.kilo[126] = -1758665053;
        ox.kilo[127] = 1288932321;
        ox.kilo[128] = 1011188894;
        ox.kilo[129] = -1681566207;
        ox.kilo[130] = -287099790;
        ox.kilo[131] = -170451591;
        ox.kilo[132] = -1953144527;
        ox.kilo[133] = 547161071;
        ox.kilo[134] = -515969563;
        ox.kilo[135] = -1953416592;
        ox.kilo[136] = -1013537974;
        ox.kilo[137] = 1225209969;
        ox.kilo[138] = -686864653;
        ox.kilo[139] = -739656786;
        ox.kilo[140] = 262374672;
        ox.kilo[141] = -1883588522;
        ox.kilo[142] = -1951892984;
        ox.kilo[143] = -1008233485;
        ox.kilo[144] = 406279813;
        ox.kilo[145] = -1158194298;
        ox.kilo[146] = 749830664;
        ox.kilo[147] = 1637451343;
        ox.kilo[148] = 214964679;
        ox.kilo[149] = 1691712248;
        ox.kilo[150] = -39431297;
        ox.kilo[151] = -653281388;
        ox.kilo[152] = -65076899;
        ox.kilo[153] = 1060260968;
        ox.kilo[154] = -958161067;
        ox.kilo[155] = 801265862;
        ox.kilo[156] = 972913771;
        ox.kilo[157] = -1597556724;
        ox.kilo[158] = -587833270;
        ox.kilo[159] = 243607546;
        ox.kilo[160] = -1800877085;
        ox.kilo[161] = -663133911;
        ox.kilo[162] = 710609846;
        ox.kilo[163] = -1462412812;
        ox.kilo[164] = 207778858;
        ox.kilo[165] = -830078477;
        ox.kilo[166] = 1215018729;
        ox.kilo[167] = -739107910;
        ox.kilo[168] = 1165437972;
        ox.kilo[169] = 1763462447;
        ox.kilo[170] = -479737484;
        ox.kilo[171] = -1426678549;
        ox.kilo[172] = 689661116;
        ox.kilo[173] = -1408534960;
        ox.kilo[174] = -910953195;
        ox.kilo[175] = 611008295;
        ox.kilo[176] = 643185557;
        ox.kilo[177] = 1826367428;
        ox.kilo[178] = 432048936;
        ox.kilo[179] = -443189131;
        ox.kilo[180] = -1409790583;
        ox.kilo[181] = -1540524442;
        ox.kilo[182] = 846944647;
        ox.kilo[183] = -22041011;
        ox.kilo[184] = -210704860;
        ox.kilo[185] = -1453964152;
        ox.kilo[186] = 1162619222;
        ox.kilo[187] = 1954087111;
        ox.kilo[188] = -532074686;
        ox.kilo[189] = -786673544;
        ox.kilo[190] = -112756801;
        ox.kilo[191] = -1030376053;
        ox.kilo[192] = -779376081;
        ox.kilo[193] = 2058706285;
        ox.kilo[194] = 1486849592;
        ox.kilo[195] = -1510583446;
        ox.kilo[196] = 1078668871;
        ox.kilo[197] = 2094093288;
        ox.kilo[198] = 782183600;
        ox.kilo[199] = -438082224;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_243 lambda$hasValidPoint$6(class_238 var0, Double var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjck", kilx(int ), (int)203)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ox.kilq("kjcl", kiln(int ), (int)201)) break;
            v0 /* !! */  = (long)ox.kilq("kjcm", kiln(int ), (int)202);
        }
        var4_2 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjcn", kilx(int ), (int)204)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ox.kilq("kjco", kiln(int ), (int)203)) break;
            v1 /* !! */  = (long)ox.kilq("kjcp", kiln(int ), (int)204);
        }
        var3_3 /* !! */  = ox.b;
        v2 /* !! */  = ox.sj;
        if (true) ** GOTO lbl17
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - ox.kilq("kjcq", kilx(int ), (int)205));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1234255973: {
                    v3 = ox.kilq("kjcr", kilx(int ), (int)206);
                    continue block35;
                }
                case 1251136524: {
                    break block35;
                }
                case 2048973703: {
                    v3 = ox.kilq("kjcs", kilx(int ), (int)207);
                    continue block35;
                }
            }
            break;
        }
        var2_4 = ox.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ox.sj;
                if (true) ** GOTO lbl39
                block37: while (true) {
                    v4 /* !! */  = (long)(ox.kilq("kjcu", kilx(int ), (int)209) - ox.kilq("kjct", kilx(int ), (int)208));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 388405594: {
                            continue block37;
                        }
                        case 1251136524: {
                            break block37;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ox.sj;
                if (true) ** GOTO lbl48
                block38: while (true) {
                    v5 /* !! */  = (long)(ox.kilq("kjcw", kilx(int ), (int)211) - ox.kilq("kjcv", kilx(int ), (int)210));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1053148855: {
                            continue block38;
                        }
                        case 1251136524: {
                            break block38;
                        }
                    }
                    break;
                }
                v6 = var0.method_1005();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjcx", kilx(int ), (int)212)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ox.kilq("kjcy", kiln(int ), (int)205)) break;
                    v7 /* !! */  = (long)ox.kilq("kjcz", kiln(int ), (int)206);
                }
                v8 = v6.field_1352;
                v9 /* !! */  = ox.sj;
                if (true) ** GOTO lbl64
                block40: while (true) {
                    v9 /* !! */  = (long)(ox.kilq("kjdb", kilx(int ), (int)214) - ox.kilq("kjda", kilx(int ), (int)213));
lbl64:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -640491967: {
                            continue block40;
                        }
                        case 1251136524: {
                            break block40;
                        }
                    }
                    break;
                }
                v10 = var1_1;
                v11 /* !! */  = ox.sj;
                if (true) ** GOTO lbl74
                block41: while (true) {
                    v11 /* !! */  = (long)(v12 - ox.kilq("kjdc", kilx(int ), (int)215));
lbl74:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1965297050: {
                            v12 = ox.kilq("kjdd", kilx(int ), (int)216);
                            continue block41;
                        }
                        case -607375016: {
                            v12 = ox.kilq("kjde", kilx(int ), (int)217);
                            continue block41;
                        }
                        case 1183400191: {
                            v12 = ox.kilq("kjdf", kilx(int ), (int)218);
                            continue block41;
                        }
                        case 1251136524: {
                            break block41;
                        }
                    }
                    break;
                }
                v13 = var0.method_1005();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kjdg", kilx(int ), (int)219)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ox.kilq("kjdh", kiln(int ), (int)207)) break;
                    v14 /* !! */  = (long)ox.kilq("kjdi", kiln(int ), (int)208);
                }
                v15 = v13.field_1350;
                v16 /* !! */  = ox.sj;
                if (true) ** GOTO lbl97
                block43: while (true) {
                    v16 /* !! */  = (long)(ox.kilq("kjdk", kilx(int ), (int)221) - ox.kilq("kjdj", kilx(int ), (int)220));
lbl97:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 1193654598: {
                            continue block43;
                        }
                        case 1251136524: {
                            break block43;
                        }
                    }
                    break;
                }
                return new class_243(v8, v10, v15);
            }
            case 0: {
                var3_3 /* !! */  = (int)ox.kilq("kjdl", kiln(int ), (int)209);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl108:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ox.kilq("kjdm", kiln(int ), (int)210);
                if (var4_2) {
                    throw null;
                }
            }
lbl112:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ox.kilq("kjdn", kiln(int ), (int)211);
                    if (!var4_2) ** GOTO lbl108
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ox.kilq("kjdo", kiln(int ), (int)212);
        ** while (!var4_2)
lbl120:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjjo() {
        ox.kilz[0] = 1979833476814545188L;
        ox.kilz[1] = 5027386880388816074L;
        ox.kilz[2] = 475454738033499178L;
        ox.kilz[3] = 4613128255082181622L;
        ox.kilz[4] = -5472708172791175410L;
        ox.kilz[5] = 6698522877206603621L;
        ox.kilz[6] = 2782857449005701175L;
        ox.kilz[7] = -3696596645495122663L;
        ox.kilz[8] = 2675314119951189262L;
        ox.kilz[9] = -5274376444459592117L;
        ox.kilz[10] = -1637179952581851568L;
        ox.kilz[11] = -1521083695220099896L;
        ox.kilz[12] = 7238935388269190336L;
        ox.kilz[13] = -7711254537672879524L;
        ox.kilz[14] = 151482840289891872L;
        ox.kilz[15] = -4547208733856169373L;
        ox.kilz[16] = 333470277066525987L;
        ox.kilz[17] = 6326882101604747907L;
        ox.kilz[18] = -6227643194527279748L;
        ox.kilz[19] = -3762498822475598676L;
        ox.kilz[20] = 7433013598435054014L;
        ox.kilz[21] = 8933519290151573331L;
        ox.kilz[22] = -1991409132556107500L;
        ox.kilz[23] = 6692180137194510992L;
        ox.kilz[24] = -2910150704194646605L;
        ox.kilz[25] = -3609997486541571127L;
        ox.kilz[26] = 1530076194388311043L;
        ox.kilz[27] = 6305231858702507643L;
        ox.kilz[28] = -5809441328392258610L;
        ox.kilz[29] = 8278658694470346952L;
        ox.kilz[30] = 6239126714610521129L;
        ox.kilz[31] = 8787250990543737724L;
        ox.kilz[32] = -1134816196960621947L;
        ox.kilz[33] = 101061572144621751L;
        ox.kilz[34] = -3770297619836600961L;
        ox.kilz[35] = -7731787558635796488L;
        ox.kilz[36] = 2468615647141571377L;
        ox.kilz[37] = -7535828231256952785L;
        ox.kilz[38] = 2345780356596659446L;
        ox.kilz[39] = 7977295713977727223L;
        ox.kilz[40] = 4743321190347236006L;
        ox.kilz[41] = -8675946832839263034L;
        ox.kilz[42] = 325545787722328335L;
        ox.kilz[43] = -7988641380459712389L;
        ox.kilz[44] = 7400586379424886986L;
        ox.kilz[45] = 5215731062518472186L;
        ox.kilz[46] = -3875295728074494768L;
        ox.kilz[47] = 4538254894128648736L;
        ox.kilz[48] = 6250337629479318417L;
        ox.kilz[49] = -619650347771839949L;
        ox.kilz[50] = 4625767466889806908L;
        ox.kilz[51] = -6239676793831537058L;
        ox.kilz[52] = -2035988573253293136L;
        ox.kilz[53] = 3772469901027805259L;
        ox.kilz[54] = 2507626854843721081L;
        ox.kilz[55] = 8462418751224705520L;
        ox.kilz[56] = 1873721208708724754L;
        ox.kilz[57] = 56984878032561131L;
        ox.kilz[58] = 3365167649063753804L;
        ox.kilz[59] = 1366622096110820965L;
        ox.kilz[60] = -8413787385344619735L;
        ox.kilz[61] = -1429044856202941646L;
        ox.kilz[62] = -5708701383346053900L;
        ox.kilz[63] = -4541283658685361111L;
        ox.kilz[64] = 2428410017889779617L;
        ox.kilz[65] = 3634253957736288979L;
        ox.kilz[66] = -289880328658020628L;
        ox.kilz[67] = 5918892738557768491L;
        ox.kilz[68] = -2202560803610860862L;
        ox.kilz[69] = 4610351475055419045L;
        ox.kilz[70] = -4016817509049308192L;
        ox.kilz[71] = 8277372872463520625L;
        ox.kilz[72] = -932719617402939718L;
        ox.kilz[73] = -5308170149890257920L;
        ox.kilz[74] = -712950620920561507L;
        ox.kilz[75] = 7318066434050775750L;
        ox.kilz[76] = -5332211622322222313L;
        ox.kilz[77] = 212921779019202114L;
        ox.kilz[78] = -8631233156213111391L;
        ox.kilz[79] = 258170257053743105L;
        ox.kilz[80] = -4303502812787318257L;
        ox.kilz[81] = -8919035523752201841L;
        ox.kilz[82] = -6513629478911314739L;
        ox.kilz[83] = 3361004139344828631L;
        ox.kilz[84] = -1149815975875170948L;
        ox.kilz[85] = -7160951964464101794L;
        ox.kilz[86] = -8842379472655062540L;
        ox.kilz[87] = 3644098116209650676L;
        ox.kilz[88] = 6762723151849619541L;
        ox.kilz[89] = 997819305987395217L;
        ox.kilz[90] = 2682186470399467259L;
        ox.kilz[91] = 3437427362317851709L;
        ox.kilz[92] = 8408682201466480164L;
        ox.kilz[93] = -704888070440289932L;
        ox.kilz[94] = -3549448545745179752L;
        ox.kilz[95] = 590594345932776623L;
        ox.kilz[96] = 5619959930688801955L;
        ox.kilz[97] = 2101673109675325733L;
        ox.kilz[98] = -6661239251632316438L;
        ox.kilz[99] = 1911060352080880700L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Double lambda$hasValidPoint$5(double var0, Double var2_1) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(ox.kilq("kjdq", kilx(int ), (int)223) - ox.kilq("kjdp", kilx(int ), (int)222));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1085547429: {
                    continue block24;
                }
                case 1251136524: {
                    break block24;
                }
            }
            break;
        }
        var5_2 = ox.c;
        v1 /* !! */  = ox.sj;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(ox.kilq("kjds", kilx(int ), (int)225) - ox.kilq("kjdr", kilx(int ), (int)224));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1692495149: {
                    continue block25;
                }
                case 1251136524: {
                    break block25;
                }
            }
            break;
        }
        var4_3 /* !! */  = ox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjdt", kilx(int ), (int)226)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ox.kilq("kjdu", kiln(int ), (int)213)) break;
            v2 /* !! */  = (long)ox.kilq("kjdv", kiln(int ), (int)214);
        }
        var3_4 = ox.a;
        if (var5_2) {
            throw null;
            return null;
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** continue;
                v3 /* !! */  = ox.sj;
                if (true) ** GOTO lbl40
                block28: while (true) {
                    v3 /* !! */  = (long)(v4 - ox.kilq("kjdw", kilx(int ), (int)227));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1771662763: {
                            v4 = ox.kilq("kjdx", kilx(int ), (int)228);
                            continue block28;
                        }
                        case 491731127: {
                            v4 = ox.kilq("kjdy", kilx(int ), (int)229);
                            continue block28;
                        }
                        case 1251136524: {
                            break block28;
                        }
                    }
                    break;
                }
                v5 = var2_1 + var0;
                v6 /* !! */  = ox.sj;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - ox.kilq("kjdz", kilx(int ), (int)230));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -483394714: {
                            v7 = ox.kilq("kjea", kilx(int ), (int)231);
                            continue block29;
                        }
                        case 1149760265: {
                            v7 = ox.kilq("kjeb", kilx(int ), (int)232);
                            continue block29;
                        }
                        case 1251136524: {
                            break block29;
                        }
                    }
                    break;
                }
                return v5;
            }
            case 0: {
                do {
                    var4_3 /* !! */  = (int)ox.kilq("kjec", kiln(int ), (int)215);
                } while (!var5_2);
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)ox.kilq("kjed", kiln(int ), (int)216);
                if (var5_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_3 /* !! */  = (int)ox.kilq("kjee", kiln(int ), (int)217);
                    if (!var5_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var4_3 /* !! */  = (int)ox.kilq("kjef", kiln(int ), (int)218);
        ** while (!var5_2)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Random getRandom() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kizd", kilx(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ox.kilq("kize", kiln(int ), (int)162)) break;
            v0 /* !! */  = (long)ox.kilq("kizf", kiln(int ), (int)163);
        }
        var3_1 = ox.c;
        v1 /* !! */  = ox.sj;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(ox.kilq("kizh", kilx(int ), (int)159) - ox.kilq("kizg", kilx(int ), (int)158));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1279535782: {
                    continue block22;
                }
                case 1251136524: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ox.b;
        v2 /* !! */  = ox.sj;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ox.kilq("kizi", kilx(int ), (int)160));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1028817421: {
                    v3 = ox.kilq("kizj", kilx(int ), (int)161);
                    continue block23;
                }
                case 1251136524: {
                    break block23;
                }
                case 1449973135: {
                    v3 = ox.kilq("kizk", kilx(int ), (int)162);
                    continue block23;
                }
                case 1524403083: {
                    v3 = ox.kilq("kizl", kilx(int ), (int)163);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ox.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ox.sj;
                if (true) ** GOTO lbl47
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ox.kilq("kizm", kilx(int ), (int)164));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1034672390: {
                            v5 = ox.kilq("kizn", kilx(int ), (int)165);
                            continue block25;
                        }
                        case 1251136524: {
                            break block25;
                        }
                        case 1714751087: {
                            v5 = ox.kilq("kizo", kilx(int ), (int)166);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.random;
            }
            case 0: {
                var2_2 /* !! */  = (int)ox.kilq("kizp", kiln(int ), (int)164);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl62:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ox.kilq("kizq", kiln(int ), (int)165);
                if (var3_1) {
                    throw null;
                }
            }
lbl66:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ox.kilq("kizr", kiln(int ), (int)166);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ox.kilq("kizs", kiln(int ), (int)167);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$hasValidPoint$4(class_238 class_2383, Double d2) {
        CallSite callSite;
        boolean bl2;
        block18: {
            Object object = sj;
            block4: while (true) {
                switch ((int)object) {
                    case -44469101: {
                        object = ox.kilq("kjeh", kilx(int ), (int)234) - ox.kilq("kjeg", kilx(int ), (int)233);
                        continue block4;
                    }
                    case 1251136524: {
                        break block4;
                    }
                }
                break;
            }
            boolean bl3 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = sj - ox.kilq("kjei", kilx(int ), (int)235)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == ox.kilq("kjej", kiln(int ), (int)219)) break;
                object2 = ox.kilq("kjek", kiln(int ), (int)220);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = sj - ox.kilq("kjel", kilx(int ), (int)236)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == ox.kilq("kjem", kiln(int ), (int)221)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object3 = ox.kilq("kjen", kiln(int ), (int)222);
            }
            if (bl2 || bl2) return (boolean)ox.kilq("kjeo", kiln(int ), (int)223);
            while (true) {
                long l4;
                Object object4;
                if ((object4 = (l4 = sj - ox.kilq("kjep", kilx(int ), (int)237)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object4 == ox.kilq("kjeq", kiln(int ), (int)224)) break;
                object4 = ox.kilq("kjer", kiln(int ), (int)225);
            }
            double d3 = d2;
            while (true) {
                long l5;
                Object object5;
                if ((object5 = (l5 = sj - ox.kilq("kjes", kilx(int ), (int)238)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object5 == ox.kilq("kjet", kiln(int ), (int)226)) {
                    if (d3 < class_2383.field_1325) {
                        break;
                    }
                    break block18;
                }
                object5 = ox.kilq("kjeu", kiln(int ), (int)227);
            }
            if (bl2) return (boolean)ox.kilq("kjeo", kiln(int ), (int)223);
            callSite = ox.kilq("kjev", kiln(int ), (int)228);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)ox.kilq("kjeo", kiln(int ), (int)223);
        }
        callSite = ox.kilq("kjew", kiln(int ), (int)229);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateOffset(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kixh", kilx(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ox.kilq("kixi", kiln(int ), (int)146)) break;
            v0 /* !! */  = (long)ox.kilq("kixj", kiln(int ), (int)147);
        }
        var4_2 = ox.c;
        v1 /* !! */  = ox.sj;
        if (true) ** GOTO lbl11
        block44: while (true) {
            v1 /* !! */  = (long)(v2 - ox.kilq("kixk", kilx(int ), (int)126));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2053327085: {
                    v2 = ox.kilq("kixl", kilx(int ), (int)127);
                    continue block44;
                }
                case 503522734: {
                    v2 = ox.kilq("kixm", kilx(int ), (int)128);
                    continue block44;
                }
                case 1251136524: {
                    break block44;
                }
                case 1666569686: {
                    v2 = ox.kilq("kixn", kilx(int ), (int)129);
                    continue block44;
                }
            }
            break;
        }
        var3_3 = ox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kixo", kilx(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ox.kilq("kixp", kiln(int ), (int)148)) break;
            v3 /* !! */  = (long)ox.kilq("kixq", kiln(int ), (int)149);
        }
        var2_4 = ox.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 /* !! */  = ox.sj;
        if (true) ** GOTO lbl39
        block47: while (true) {
            v4 /* !! */  = (long)(v5 - ox.kilq("kixr", kilx(int ), (int)131));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -321056171: {
                    v5 = ox.kilq("kixs", kilx(int ), (int)132);
                    continue block47;
                }
                case 242096485: {
                    v5 = ox.kilq("kixt", kilx(int ), (int)133);
                    continue block47;
                }
                case 1251136524: {
                    break block47;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kixu", kilx(int ), (int)134)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ox.kilq("kixv", kiln(int ), (int)150)) break;
            v6 /* !! */  = (long)ox.kilq("kixw", kiln(int ), (int)151);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kixx", kilx(int ), (int)135)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ox.kilq("kixy", kiln(int ), (int)152)) break;
            v7 /* !! */  = (long)ox.kilq("kixz", kiln(int ), (int)153);
        }
        v8 = this.random.nextGaussian();
        v9 /* !! */  = ox.sj;
        if (true) ** GOTO lbl63
        block50: while (true) {
            v9 /* !! */  = (long)(v10 - ox.kilq("kiya", kilx(int ), (int)136));
lbl63:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -368041170: {
                    v10 = ox.kilq("kiyb", kilx(int ), (int)137);
                    continue block50;
                }
                case -10064739: {
                    v10 = ox.kilq("kiyc", kilx(int ), (int)138);
                    continue block50;
                }
                case 1193065206: {
                    v10 = ox.kilq("kiyd", kilx(int ), (int)139);
                    continue block50;
                }
                case 1251136524: {
                    break block50;
                }
            }
            break;
        }
        v11 /* !! */  = ox.sj;
        if (true) ** GOTO lbl79
        block51: while (true) {
            v11 /* !! */  = (long)(v12 - ox.kilq("kiye", kilx(int ), (int)140));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -635934152: {
                    v12 = ox.kilq("kiyf", kilx(int ), (int)141);
                    continue block51;
                }
                case 518495854: {
                    v12 = ox.kilq("kiyg", kilx(int ), (int)142);
                    continue block51;
                }
                case 1251136524: {
                    break block51;
                }
            }
            break;
        }
        v13 = this.random.nextGaussian();
        v14 /* !! */  = ox.sj;
        if (true) ** GOTO lbl93
        block52: while (true) {
            v14 /* !! */  = (long)(v15 - ox.kilq("kiyh", kilx(int ), (int)143));
lbl93:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -639414915: {
                    v15 = ox.kilq("kiyi", kilx(int ), (int)144);
                    continue block52;
                }
                case 264038264: {
                    v15 = ox.kilq("kiyj", kilx(int ), (int)145);
                    continue block52;
                }
                case 1251136524: {
                    break block52;
                }
            }
            break;
        }
        v16 /* !! */  = ox.sj;
        if (true) ** GOTO lbl106
        block53: while (true) {
            v16 /* !! */  = (long)(ox.kilq("kiyl", kilx(int ), (int)147) - ox.kilq("kiyk", kilx(int ), (int)146));
lbl106:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case 1072753929: {
                    continue block53;
                }
                case 1251136524: {
                    break block53;
                }
            }
            break;
        }
        v17 = this.random.nextGaussian();
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kiym", kilx(int ), (int)148)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ox.kilq("kiyn", kiln(int ), (int)154)) break;
            v18 /* !! */  = (long)ox.kilq("kiyo", kiln(int ), (int)155);
        }
        v19 = this.offset.method_1031(v8, v13, v17);
        v20 /* !! */  = ox.sj;
        if (true) ** GOTO lbl122
        block55: while (true) {
            v20 /* !! */  = (long)(v21 - ox.kilq("kiyp", kilx(int ), (int)149));
lbl122:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1889577652: {
                    v21 = ox.kilq("kiyq", kilx(int ), (int)150);
                    continue block55;
                }
                case 547674465: {
                    v21 = ox.kilq("kiyr", kilx(int ), (int)151);
                    continue block55;
                }
                case 547856933: {
                    v21 = ox.kilq("kiys", kilx(int ), (int)152);
                    continue block55;
                }
                case 1251136524: {
                    break block55;
                }
            }
            break;
        }
        v22 = v19.method_18806(var1_1);
        v23 /* !! */  = ox.sj;
        if (true) ** GOTO lbl139
        block56: while (true) {
            v23 /* !! */  = (long)(v24 - ox.kilq("kiyt", kilx(int ), (int)153));
lbl139:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -2143371986: {
                    v24 = ox.kilq("kiyu", kilx(int ), (int)154);
                    continue block56;
                }
                case -1558151426: {
                    v24 = ox.kilq("kiyv", kilx(int ), (int)155);
                    continue block56;
                }
                case 1251136524: {
                    break block56;
                }
                case 1282114415: {
                    v24 = ox.kilq("kiyw", kilx(int ), (int)156);
                    continue block56;
                }
            }
            break;
        }
        this.offset = v22;
        ** while (var2_4 || var2_4)
lbl153:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ox() {
        var2_1 /* !! */  = ox.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.random = new SecureRandom();
                this.offset = class_243.field_1353;
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ox.kilq("kilr", kiln(int ), (int)0);
                ** GOTO lbl14
            }
lbl12:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ox.kilq("kils", kiln(int ), (int)1);
            }
lbl14:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ox.kilq("kilt", kiln(int ), (int)2);
                ** GOTO lbl12
            }
            case 3: 
        }
        while (true) {
            var2_1 /* !! */  = (int)ox.kilq("kilu", kiln(int ), (int)3);
        }
    }

    private static /* synthetic */ void kjjh() {
        ox.kilo[200] = -1628893499;
        ox.kilo[201] = 59838112;
        ox.kilo[202] = 603216544;
        ox.kilo[203] = -1952565908;
        ox.kilo[204] = -845536170;
        ox.kilo[205] = -1988109091;
        ox.kilo[206] = 1379772934;
        ox.kilo[207] = 653419690;
        ox.kilo[208] = -420853425;
        ox.kilo[209] = -839377891;
        ox.kilo[210] = -426437865;
        ox.kilo[211] = -654021146;
        ox.kilo[212] = 1927610171;
        ox.kilo[213] = -74473025;
        ox.kilo[214] = 1557930007;
        ox.kilo[215] = 598013302;
        ox.kilo[216] = 1569147258;
        ox.kilo[217] = -473276782;
        ox.kilo[218] = 1613514242;
        ox.kilo[219] = 395940475;
        ox.kilo[220] = 1370225202;
        ox.kilo[221] = -158669618;
        ox.kilo[222] = 2124151383;
        ox.kilo[223] = -1371529851;
        ox.kilo[224] = 2109926948;
        ox.kilo[225] = -614272985;
        ox.kilo[226] = 171147676;
        ox.kilo[227] = 1808490834;
        ox.kilo[228] = -364419785;
        ox.kilo[229] = -1237339817;
        ox.kilo[230] = -8683438;
        ox.kilo[231] = -1149828536;
        ox.kilo[232] = 634192101;
        ox.kilo[233] = -1101392475;
        ox.kilo[234] = -315929077;
        ox.kilo[235] = -599348119;
        ox.kilo[236] = 935343458;
        ox.kilo[237] = -1905136637;
        ox.kilo[238] = 1715382209;
        ox.kilo[239] = 1741704763;
        ox.kilo[240] = -25926049;
        ox.kilo[241] = 378099273;
        ox.kilo[242] = 833509924;
        ox.kilo[243] = 1261246126;
        ox.kilo[244] = 1598553079;
        ox.kilo[245] = 514210224;
        ox.kilo[246] = -1458206279;
        ox.kilo[247] = -644468042;
        ox.kilo[248] = -1614333371;
        ox.kilo[249] = -661644603;
        ox.kilo[250] = -1504144006;
        ox.kilo[251] = 322160728;
        ox.kilo[252] = 322135551;
        ox.kilo[253] = -735301569;
        ox.kilo[254] = 816306958;
        ox.kilo[255] = -1837579819;
        ox.kilo[256] = -505146044;
        ox.kilo[257] = 1621494939;
        ox.kilo[258] = 314980740;
        ox.kilo[259] = -2668941;
        ox.kilo[260] = -505174194;
        ox.kilo[261] = -1677464769;
        ox.kilo[262] = 434625012;
        ox.kilo[263] = 1262191918;
        ox.kilo[264] = -258059827;
        ox.kilo[265] = -963807564;
        ox.kilo[266] = 620059430;
        ox.kilo[267] = -785380966;
        ox.kilo[268] = -425253980;
        ox.kilo[269] = -2106176101;
        ox.kilo[270] = 1066728846;
        ox.kilo[271] = -1120304144;
        ox.kilo[272] = -1664854750;
        ox.kilo[273] = -1128616389;
        ox.kilo[274] = 2072167311;
        ox.kilo[275] = 1583755478;
        ox.kilo[276] = -1216128009;
        ox.kilo[277] = 76025701;
        ox.kilo[278] = -2073951915;
        ox.kilo[279] = 617252976;
        ox.kilo[280] = 1114802213;
        ox.kilo[281] = -368102274;
        ox.kilo[282] = -361280359;
        ox.kilo[283] = 1314052789;
        ox.kilo[284] = 752051612;
        ox.kilo[285] = 332794492;
        ox.kilo[286] = -380481149;
        ox.kilo[287] = 920142079;
        ox.kilo[288] = 1733330268;
        ox.kilo[289] = 247930923;
        ox.kilo[290] = -1049643894;
        ox.kilo[291] = -1369917098;
        ox.kilo[292] = 1934871157;
        ox.kilo[293] = -1732797003;
        ox.kilo[294] = -496011852;
        ox.kilo[295] = 284625610;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getOffset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kizt", kilx(int ), (int)167)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ox.kilq("kizu", kiln(int ), (int)168)) break;
            v0 /* !! */  = (long)ox.kilq("kizv", kiln(int ), (int)169);
        }
        var3_1 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kizw", kilx(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ox.kilq("kizx", kiln(int ), (int)170)) break;
            v1 /* !! */  = (long)ox.kilq("kizy", kiln(int ), (int)171);
        }
        var2_2 /* !! */  = ox.b;
        v2 /* !! */  = ox.sj;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - ox.kilq("kizz", kilx(int ), (int)169));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -683862845: {
                    v3 = ox.kilq("kjaa", kilx(int ), (int)170);
                    continue block13;
                }
                case 1251136524: {
                    break block13;
                }
                case 1443273022: {
                    v3 = ox.kilq("kjab", kilx(int ), (int)171);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = ox.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjac", kilx(int ), (int)172)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ox.kilq("kjad", kiln(int ), (int)172)) break;
                    v4 /* !! */  = (long)ox.kilq("kjae", kiln(int ), (int)173);
                }
                return this.offset;
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ox.kilq("kjaf", kiln(int ), (int)174);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl53
            }
            case 1: {
                var2_2 /* !! */  = (int)ox.kilq("kjag", kiln(int ), (int)175);
                if (!var3_1) break;
                throw null;
            }
lbl53:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ox.kilq("kjah", kiln(int ), (int)176);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ox.kilq("kjai", kiln(int ), (int)177);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kjjm() {
        ox.kily[100] = 9100798791145118542L;
        ox.kily[101] = 3404212795735962660L;
        ox.kily[102] = 2222639361191910653L;
        ox.kily[103] = -713486146075025690L;
        ox.kily[104] = -5923342186398682599L;
        ox.kily[105] = -6484193802297070171L;
        ox.kily[106] = -8804745494586544168L;
        ox.kily[107] = -521577799001014594L;
        ox.kily[108] = -6457501171202409368L;
        ox.kily[109] = 4075755167458603501L;
        ox.kily[110] = -5768682126330305283L;
        ox.kily[111] = 7851870941405568751L;
        ox.kily[112] = 3284204032339871009L;
        ox.kily[113] = -41596621285580756L;
        ox.kily[114] = -689112925406594135L;
        ox.kily[115] = 1416518575532030383L;
        ox.kily[116] = 778978675286643042L;
        ox.kily[117] = -4691193303984066429L;
        ox.kily[118] = -5841855842064018934L;
        ox.kily[119] = 593150217540651104L;
        ox.kily[120] = 4748587149225210965L;
        ox.kily[121] = 8042282992571226498L;
        ox.kily[122] = -5678750629881059828L;
        ox.kily[123] = 414461853797642837L;
        ox.kily[124] = -4689090583952851672L;
        ox.kily[125] = -388243654743283703L;
        ox.kily[126] = -206986822219502440L;
        ox.kily[127] = 1192643831089859946L;
        ox.kily[128] = 4352264711532204048L;
        ox.kily[129] = -8229488779283974940L;
        ox.kily[130] = 7780612135737224589L;
        ox.kily[131] = 8684861789121063997L;
        ox.kily[132] = 3058436842872576786L;
        ox.kily[133] = 2325551841190411375L;
        ox.kily[134] = -7949506917508155593L;
        ox.kily[135] = -3005023748691992221L;
        ox.kily[136] = -4247027292262484393L;
        ox.kily[137] = -2128125119699016025L;
        ox.kily[138] = 4551647850944314362L;
        ox.kily[139] = -4585888758716836723L;
        ox.kily[140] = -2874261898976925171L;
        ox.kily[141] = 2442685400800654129L;
        ox.kily[142] = 6865822720955645502L;
        ox.kily[143] = -2338990633021374173L;
        ox.kily[144] = -5557308709612029625L;
        ox.kily[145] = 3855196641592301951L;
        ox.kily[146] = -9129075903983425305L;
        ox.kily[147] = 4264293867444483953L;
        ox.kily[148] = 5513195294942385392L;
        ox.kily[149] = 2352161344915860921L;
        ox.kily[150] = 106786263849049133L;
        ox.kily[151] = -2825863477353303291L;
        ox.kily[152] = 1883445655035238439L;
        ox.kily[153] = -3376937871058969036L;
        ox.kily[154] = 1790555032185281923L;
        ox.kily[155] = -3244821777621005322L;
        ox.kily[156] = -3703444021526830388L;
        ox.kily[157] = 249818833123901185L;
        ox.kily[158] = 1478738079897111687L;
        ox.kily[159] = -3686101686746516261L;
        ox.kily[160] = 4733096619180428487L;
        ox.kily[161] = 529836537198735663L;
        ox.kily[162] = -3459088437196693484L;
        ox.kily[163] = -4475694475616134188L;
        ox.kily[164] = 3500805982554709552L;
        ox.kily[165] = -5397747582925051008L;
        ox.kily[166] = -3686922781471082529L;
        ox.kily[167] = -7047811359893760244L;
        ox.kily[168] = 2522208052991840220L;
        ox.kily[169] = 4094441703034063507L;
        ox.kily[170] = 8599115881958768858L;
        ox.kily[171] = -4024472447241765288L;
        ox.kily[172] = 4968967369736029032L;
        ox.kily[173] = -5940831445654843501L;
        ox.kily[174] = 1820325430488462817L;
        ox.kily[175] = 1707280228612630736L;
        ox.kily[176] = -634637845864620757L;
        ox.kily[177] = 6099295508063591759L;
        ox.kily[178] = -2644064161400783352L;
        ox.kily[179] = -141670067806731425L;
        ox.kily[180] = -4699666199622313090L;
        ox.kily[181] = -8418746118356216173L;
        ox.kily[182] = 3548461174575278873L;
        ox.kily[183] = 5771345944742027547L;
        ox.kily[184] = -6417468138257585528L;
        ox.kily[185] = 5014763068856396580L;
        ox.kily[186] = 5170528490518145702L;
        ox.kily[187] = -193448321027717369L;
        ox.kily[188] = 9168595159445556057L;
        ox.kily[189] = 2911020752202453202L;
        ox.kily[190] = -646113493493623850L;
        ox.kily[191] = -3945286609268844387L;
        ox.kily[192] = 1730957531981069809L;
        ox.kily[193] = -2116306398806646230L;
        ox.kily[194] = -2871513921909079467L;
        ox.kily[195] = 718628707851967213L;
        ox.kily[196] = 7979277216589200602L;
        ox.kily[197] = -8393946971469677189L;
        ox.kily[198] = -1587446461534121186L;
        ox.kily[199] = 3212065230275105691L;
    }

    private static /* synthetic */ void kjjf() {
        ox.kilo[0] = -1982710331;
        ox.kilo[1] = -757387458;
        ox.kilo[2] = 1551646239;
        ox.kilo[3] = -810190524;
        ox.kilo[4] = -1646530271;
        ox.kilo[5] = -1274188859;
        ox.kilo[6] = 1956283481;
        ox.kilo[7] = -1147348689;
        ox.kilo[8] = 12167711;
        ox.kilo[9] = 320247381;
        ox.kilo[10] = -480556567;
        ox.kilo[11] = -1591171134;
        ox.kilo[12] = 1198037299;
        ox.kilo[13] = -275672389;
        ox.kilo[14] = 1923975411;
        ox.kilo[15] = 480867592;
        ox.kilo[16] = -1805816400;
        ox.kilo[17] = 2110377784;
        ox.kilo[18] = -948281099;
        ox.kilo[19] = -1529405158;
        ox.kilo[20] = 2065277827;
        ox.kilo[21] = 1292455888;
        ox.kilo[22] = -94670096;
        ox.kilo[23] = -170329802;
        ox.kilo[24] = 2064199842;
        ox.kilo[25] = 823215517;
        ox.kilo[26] = 604238652;
        ox.kilo[27] = 925300371;
        ox.kilo[28] = 1942816695;
        ox.kilo[29] = -534403574;
        ox.kilo[30] = -1400772406;
        ox.kilo[31] = 646946597;
        ox.kilo[32] = 1859401491;
        ox.kilo[33] = -1466329675;
        ox.kilo[34] = 282833979;
        ox.kilo[35] = -1073343570;
        ox.kilo[36] = -387078710;
        ox.kilo[37] = -1342283393;
        ox.kilo[38] = -1063853517;
        ox.kilo[39] = 2095240284;
        ox.kilo[40] = -498173685;
        ox.kilo[41] = 2045784623;
        ox.kilo[42] = -463683720;
        ox.kilo[43] = -680633071;
        ox.kilo[44] = 619092914;
        ox.kilo[45] = 87306946;
        ox.kilo[46] = 1826600415;
        ox.kilo[47] = 544476339;
        ox.kilo[48] = -929380656;
        ox.kilo[49] = 276500777;
        ox.kilo[50] = -548610851;
        ox.kilo[51] = -678846137;
        ox.kilo[52] = 1800366770;
        ox.kilo[53] = 790832330;
        ox.kilo[54] = 776262784;
        ox.kilo[55] = -204829142;
        ox.kilo[56] = 1087255739;
        ox.kilo[57] = -1468882262;
        ox.kilo[58] = 49382358;
        ox.kilo[59] = 2100379360;
        ox.kilo[60] = 590909904;
        ox.kilo[61] = -1464574491;
        ox.kilo[62] = -192864418;
        ox.kilo[63] = -597611573;
        ox.kilo[64] = -1514991484;
        ox.kilo[65] = -1813949391;
        ox.kilo[66] = 1454712540;
        ox.kilo[67] = -609948420;
        ox.kilo[68] = 2030625316;
        ox.kilo[69] = 282030754;
        ox.kilo[70] = 103350515;
        ox.kilo[71] = -407654746;
        ox.kilo[72] = -983864424;
        ox.kilo[73] = 518234579;
        ox.kilo[74] = 1060040247;
        ox.kilo[75] = 966053616;
        ox.kilo[76] = 1423397938;
        ox.kilo[77] = 1584333463;
        ox.kilo[78] = 1788965177;
        ox.kilo[79] = -2064077875;
        ox.kilo[80] = -1340291762;
        ox.kilo[81] = -2048197369;
        ox.kilo[82] = 1090796367;
        ox.kilo[83] = -139413761;
        ox.kilo[84] = -2106586272;
        ox.kilo[85] = 2018449110;
        ox.kilo[86] = 601765729;
        ox.kilo[87] = 1975432894;
        ox.kilo[88] = -1503872807;
        ox.kilo[89] = -1200322714;
        ox.kilo[90] = 1364717469;
        ox.kilo[91] = -1654415271;
        ox.kilo[92] = 1853052386;
        ox.kilo[93] = -1601405815;
        ox.kilo[94] = -2046694389;
        ox.kilo[95] = 1965105770;
        ox.kilo[96] = -465859342;
        ox.kilo[97] = -1041937295;
        ox.kilo[98] = -1779819583;
        ox.kilo[99] = -1360573177;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 findBestVector(List<class_243> var1_1, ov var2_2) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(ox.kilq("kiuv", kilx(int ), (int)93) - ox.kilq("kiuu", kilx(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2113482582: {
                    continue block19;
                }
                case 1251136524: {
                    break block19;
                }
            }
            break;
        }
        var5_3 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kiuw", kilx(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ox.kilq("kiux", kiln(int ), (int)114)) break;
            v1 /* !! */  = (long)ox.kilq("kiuy", kiln(int ), (int)115);
        }
        var4_4 = ox.b;
        v2 /* !! */  = ox.sj;
        if (true) ** GOTO lbl21
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ox.kilq("kiuz", kilx(int ), (int)95));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1620145662: {
                    v3 = ox.kilq("kiva", kilx(int ), (int)96);
                    continue block21;
                }
                case -421286639: {
                    v3 = ox.kilq("kivb", kilx(int ), (int)97);
                    continue block21;
                }
                case 1251136524: {
                    break block21;
                }
            }
            break;
        }
        var3_5 = ox.a;
        if (var5_3) {
            throw null;
lbl33:
            // 1 sources

            return null;
        }
        ** while (var3_5 || var3_5)
lbl36:
        // 1 sources

        v4 /* !! */  = ox.sj;
        if (true) ** GOTO lbl40
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - ox.kilq("kivc", kilx(int ), (int)98));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2075063968: {
                    v5 = ox.kilq("kivd", kilx(int ), (int)99);
                    continue block23;
                }
                case 404018139: {
                    v5 = ox.kilq("kive", kilx(int ), (int)100);
                    continue block23;
                }
                case 1251136524: {
                    break block23;
                }
                case 1479895198: {
                    v5 = ox.kilq("kivf", kilx(int ), (int)101);
                    continue block23;
                }
            }
            break;
        }
        v6 = var1_1.stream();
        v7 /* !! */  = ox.sj;
        if (true) ** GOTO lbl57
        block24: while (true) {
            v7 /* !! */  = (long)(ox.kilq("kivh", kilx(int ), (int)103) - ox.kilq("kivg", kilx(int ), (int)102));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 433079699: {
                    continue block24;
                }
                case 1251136524: {
                    break block24;
                }
            }
            break;
        }
        v8 = (Function<class_243, Double>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$findBestVector$8(ruhack.phobia.ov net.minecraft.class_243 ), (Lnet/minecraft/class_243;)Ljava/lang/Double;)((ox)this, (ov)var2_2);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kivi", kilx(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ox.kilq("kivj", kiln(int ), (int)116)) break;
            v9 /* !! */  = (long)ox.kilq("kivk", kiln(int ), (int)117);
        }
        v10 = Comparator.comparing(v8);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kivl", kilx(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ox.kilq("kivm", kiln(int ), (int)118)) break;
            v11 /* !! */  = (long)ox.kilq("kivn", kiln(int ), (int)119);
        }
        v12 = v6.min(v10);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kivo", kilx(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ox.kilq("kivp", kiln(int ), (int)120)) break;
            v13 /* !! */  = (long)ox.kilq("kivq", kiln(int ), (int)121);
        }
        return v12.orElse(null);
    }

    private static /* synthetic */ void kjjq() {
        ox.kilz[200] = -7961333504236562948L;
        ox.kilz[201] = -4687063736946992893L;
        ox.kilz[202] = 4641445863616070626L;
        ox.kilz[203] = 1361019124355448996L;
        ox.kilz[204] = -1383098796703801218L;
        ox.kilz[205] = -4012951834543078586L;
        ox.kilz[206] = -5005884404801856152L;
        ox.kilz[207] = -3575263575443949750L;
        ox.kilz[208] = 744853861426093365L;
        ox.kilz[209] = 6150531007204501568L;
        ox.kilz[210] = -8371282739794858691L;
        ox.kilz[211] = 4175696171377828782L;
        ox.kilz[212] = 5147260853532774173L;
        ox.kilz[213] = 421882337344614865L;
        ox.kilz[214] = -1102012151506532570L;
        ox.kilz[215] = 8709387222282584882L;
        ox.kilz[216] = 7682936601457316423L;
        ox.kilz[217] = -8218079332447611457L;
        ox.kilz[218] = -7318613003108095341L;
        ox.kilz[219] = 2868944691705618079L;
        ox.kilz[220] = 2177668549675487206L;
        ox.kilz[221] = -4536892087697422663L;
        ox.kilz[222] = -6731285661498775575L;
        ox.kilz[223] = -3608748565859263297L;
        ox.kilz[224] = 6457940557851339598L;
        ox.kilz[225] = 6133629671456464353L;
        ox.kilz[226] = -6801949487911826768L;
        ox.kilz[227] = -8224542977436063875L;
        ox.kilz[228] = -1094282583467191847L;
        ox.kilz[229] = -2155920445506736411L;
        ox.kilz[230] = -3167607069362657279L;
        ox.kilz[231] = -4215496085024740894L;
        ox.kilz[232] = -6270610506610898572L;
        ox.kilz[233] = 1769972950176412478L;
        ox.kilz[234] = -6624420991535505625L;
        ox.kilz[235] = -3616321135714987492L;
        ox.kilz[236] = 5006961552586927957L;
        ox.kilz[237] = 5891438142115903735L;
        ox.kilz[238] = 8908772559788027597L;
        ox.kilz[239] = -1951459767726176955L;
        ox.kilz[240] = 7126547773483046517L;
        ox.kilz[241] = 5269168752011781710L;
        ox.kilz[242] = -6417145563210199593L;
        ox.kilz[243] = -5574994565766427957L;
        ox.kilz[244] = 1019359524618183875L;
        ox.kilz[245] = 4722241448415486764L;
        ox.kilz[246] = 7727263621954517741L;
        ox.kilz[247] = -163301148945514745L;
        ox.kilz[248] = 905016622542597729L;
        ox.kilz[249] = 3342357523474115848L;
        ox.kilz[250] = -6026598274491375108L;
        ox.kilz[251] = -1780358461328348621L;
        ox.kilz[252] = 4408080586657673660L;
        ox.kilz[253] = -1427320788718299639L;
        ox.kilz[254] = 7208677645572147134L;
        ox.kilz[255] = 2098617275510350197L;
        ox.kilz[256] = -3448867234981179778L;
        ox.kilz[257] = 8496493997895165557L;
        ox.kilz[258] = 9152209660703347631L;
        ox.kilz[259] = -8672916238195521940L;
        ox.kilz[260] = -7109470209548966537L;
        ox.kilz[261] = -8818338033844290482L;
        ox.kilz[262] = 3739139335814517536L;
        ox.kilz[263] = -6361241206726001496L;
        ox.kilz[264] = 9201637393996201584L;
        ox.kilz[265] = 1530446664344147525L;
        ox.kilz[266] = 5244502152900188641L;
        ox.kilz[267] = -1459932622368091859L;
        ox.kilz[268] = -6492194898868593056L;
        ox.kilz[269] = -7269891185163253995L;
        ox.kilz[270] = 4602241446406065164L;
        ox.kilz[271] = -2708558449808223190L;
        ox.kilz[272] = -4234877749175389653L;
        ox.kilz[273] = -8976623009092597822L;
        ox.kilz[274] = -8497544143366162055L;
        ox.kilz[275] = 6768003353613267325L;
        ox.kilz[276] = 8973963880807431101L;
        ox.kilz[277] = 141331299645108464L;
        ox.kilz[278] = 121303477607556550L;
        ox.kilz[279] = -553140544682500974L;
        ox.kilz[280] = -1868432166204689972L;
        ox.kilz[281] = 3691549985178012200L;
        ox.kilz[282] = 5337020419527048038L;
        ox.kilz[283] = -7060118561786002257L;
        ox.kilz[284] = -111718719405275819L;
    }

    public static /* synthetic */ CallSite kilq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasValidPoint(class_1309 var1_1, float var2_2, boolean var3_3) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block52: while (true) {
            v0 /* !! */  = (long)(ox.kilq("kiqx", kilx(int ), (int)46) - ox.kilq("kiqw", kilx(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 593452667: {
                    continue block52;
                }
                case 1251136524: {
                    break block52;
                }
            }
            break;
        }
        var9_4 = ox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kiqz", kilx(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ox.kilq("kira", kiln(int ), (int)64)) break;
            v1 /* !! */  = (long)ox.kilq("kirb", kiln(int ), (int)65);
        }
        var8_5 /* !! */  = ox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kirc", kilx(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kird", kiln(int ), (int)66)) break;
            v2 /* !! */  = (long)ox.kilq("kirf", kiln(int ), (int)67);
        }
        var7_6 = ox.a;
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_4) {
                    throw null;
lbl28:
                    // 3 sources

                    return (boolean)ox.kilq("kirg", kiln(int ), (int)68);
                }
                if (var7_6 || var7_6) ** GOTO lbl28
                v3 /* !! */  = ox.sj;
                if (true) ** GOTO lbl35
                block56: while (true) {
                    v3 /* !! */  = (long)(v4 - ox.kilq("kirh", kilx(int ), (int)49));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1357016733: {
                            v4 = ox.kilq("kiri", kilx(int ), (int)50);
                            continue block56;
                        }
                        case 1251136524: {
                            break block56;
                        }
                        case 1529198873: {
                            v4 = ox.kilq("kirk", kilx(int ), (int)51);
                            continue block56;
                        }
                    }
                    break;
                }
                var4_7 = var1_1.method_5829();
                if (var7_6 || var7_6) ** GOTO lbl28
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kirl", kilx(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ox.kilq("kirm", kiln(int ), (int)69)) break;
                    v5 /* !! */  = (long)ox.kilq("kirn", kiln(int ), (int)70);
                }
                var5_8 = var4_7.method_17940() / ox.kilq("kiro", kiov(int ), (int)53);
                if (var7_6 || var7_6) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kirp", kilx(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ox.kilq("kirq", kiln(int ), (int)71)) break;
                    v6 /* !! */  = (long)ox.kilq("kirr", kiln(int ), (int)72);
                }
                v7 = var4_7.field_1322;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = ox.sj - ox.kilq("kirs", kilx(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ox.kilq("kirt", kiln(int ), (int)73)) break;
                    v8 /* !! */  = (long)ox.kilq("kiru", kiln(int ), (int)74);
                }
                v9 = v7;
                v10 /* !! */  = ox.sj;
                if (true) ** GOTO lbl69
                block60: while (true) {
                    v10 /* !! */  = (long)(v11 - ox.kilq("kirw", kilx(int ), (int)56));
lbl69:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 297039584: {
                            v11 = ox.kilq("kirx", kilx(int ), (int)57);
                            continue block60;
                        }
                        case 458590453: {
                            v11 = ox.kilq("kiry", kilx(int ), (int)58);
                            continue block60;
                        }
                        case 1251136524: {
                            break block60;
                        }
                    }
                    break;
                }
                v12 = (Predicate<Double>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasValidPoint$4(net.minecraft.class_238 java.lang.Double ), (Ljava/lang/Double;)Z)((class_238)var4_7);
                v13 /* !! */  = ox.sj;
                if (true) ** GOTO lbl83
                block61: while (true) {
                    v13 /* !! */  = (long)(v14 - ox.kilq("kirz", kilx(int ), (int)59));
lbl83:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1641931090: {
                            v14 = ox.kilq("kisa", kilx(int ), (int)60);
                            continue block61;
                        }
                        case -886632128: {
                            v14 = ox.kilq("kisb", kilx(int ), (int)61);
                            continue block61;
                        }
                        case 1251136524: {
                            break block61;
                        }
                        case 1788376796: {
                            v14 = ox.kilq("kisc", kilx(int ), (int)62);
                            continue block61;
                        }
                    }
                    break;
                }
                v15 = (UnaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$hasValidPoint$5(double java.lang.Double ), (Ljava/lang/Double;)Ljava/lang/Double;)((double)var5_8);
                v16 /* !! */  = ox.sj;
                if (true) ** GOTO lbl100
                block62: while (true) {
                    v16 /* !! */  = (long)(v17 - ox.kilq("kisd", kilx(int ), (int)63));
lbl100:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -433718096: {
                            v17 = ox.kilq("kisf", kilx(int ), (int)64);
                            continue block62;
                        }
                        case 17358701: {
                            v17 = ox.kilq("kisg", kilx(int ), (int)65);
                            continue block62;
                        }
                        case 301099631: {
                            v17 = ox.kilq("kish", kilx(int ), (int)66);
                            continue block62;
                        }
                        case 1251136524: {
                            break block62;
                        }
                    }
                    break;
                }
                v18 = Stream.iterate(v9, v12, v15);
                v19 /* !! */  = ox.sj;
                if (true) ** GOTO lbl117
                block63: while (true) {
                    v19 /* !! */  = (long)(v20 - ox.kilq("kisi", kilx(int ), (int)67));
lbl117:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -200611659: {
                            v20 = ox.kilq("kisj", kilx(int ), (int)68);
                            continue block63;
                        }
                        case 1251136524: {
                            break block63;
                        }
                        case 2031683863: {
                            v20 = ox.kilq("kisk", kilx(int ), (int)69);
                            continue block63;
                        }
                    }
                    break;
                }
                v21 = (Function<Double, class_243>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$hasValidPoint$6(net.minecraft.class_238 java.lang.Double ), (Ljava/lang/Double;)Lnet/minecraft/class_243;)((class_238)var4_7);
                v22 /* !! */  = ox.sj;
                if (true) ** GOTO lbl131
                block64: while (true) {
                    v22 /* !! */  = (long)(v23 - ox.kilq("kisl", kilx(int ), (int)70));
lbl131:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1999991594: {
                            v23 = ox.kilq("kism", kilx(int ), (int)71);
                            continue block64;
                        }
                        case -306382344: {
                            v23 = ox.kilq("kisn", kilx(int ), (int)72);
                            continue block64;
                        }
                        case -178095861: {
                            v23 = ox.kilq("kiso", kilx(int ), (int)73);
                            continue block64;
                        }
                        case 1251136524: {
                            break block64;
                        }
                    }
                    break;
                }
                v24 = v18.map(v21);
                v25 /* !! */  = ox.sj;
                if (true) ** GOTO lbl148
                block65: while (true) {
                    v25 /* !! */  = (long)(v26 - ox.kilq("kisp", kilx(int ), (int)74));
lbl148:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 1012972313: {
                            v26 = ox.kilq("kisq", kilx(int ), (int)75);
                            continue block65;
                        }
                        case 1251136524: {
                            break block65;
                        }
                        case 2116704170: {
                            v26 = ox.kilq("kisr", kilx(int ), (int)76);
                            continue block65;
                        }
                    }
                    break;
                }
                v27 = (Predicate<class_243>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasValidPoint$7(float boolean net.minecraft.class_243 ), (Lnet/minecraft/class_243;)Z)((ox)this, (float)var2_2, (boolean)var3_3);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_5 = ox.sj - ox.kilq("kiss", kilx(int ), (int)77)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ox.kilq("kist", kiln(int ), (int)75)) break;
                    v28 /* !! */  = (long)ox.kilq("kisu", kiln(int ), (int)76);
                }
                return v24.anyMatch(v27);
            }
            case 0: {
                var8_5 /* !! */  = (int)ox.kilq("kisv", kiln(int ), (int)77);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 1: {
                var8_5 /* !! */  = (int)ox.kilq("kisw", kiln(int ), (int)78);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl174:
            // 3 sources

            case 2: {
                var8_5 /* !! */  = (int)ox.kilq("kisx", kiln(int ), (int)79);
                if (!var9_4) break;
                throw null;
            }
            case 3: {
                var8_5 /* !! */  = (int)ox.kilq("kisy", kiln(int ), (int)80);
                if (!var9_4) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)ox.kilq("kisz", kiln(int ), (int)81);
                    if (!var9_4) ** GOTO lbl174
                    throw null;
                }
            }
lbl187:
            // 2 sources

            case 5: {
                var8_5 /* !! */  = (int)ox.kilq("kita", kiln(int ), (int)82);
                if (!var9_4) break;
                throw null;
            }
lbl191:
            // 2 sources

            case 6: {
                var8_5 /* !! */  = (int)ox.kilq("kitb", kiln(int ), (int)83);
                if (!var9_4) ** GOTO lbl174
                throw null;
            }
            case 7: 
        }
        var8_5 /* !! */  = (int)ox.kilq("kitc", kiln(int ), (int)84);
        ** while (!var9_4)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kjjk() {
        ox.kilp[200] = -1628893497;
        ox.kilp[201] = -59838113;
        ox.kilp[202] = 8892282;
        ox.kilp[203] = -1952565907;
        ox.kilp[204] = 1412192335;
        ox.kilp[205] = 1988109090;
        ox.kilp[206] = 623263627;
        ox.kilp[207] = -653419691;
        ox.kilp[208] = 1095574324;
        ox.kilp[209] = -839377891;
        ox.kilp[210] = -426437865;
        ox.kilp[211] = -654021147;
        ox.kilp[212] = 1927610170;
        ox.kilp[213] = 74473024;
        ox.kilp[214] = -103014735;
        ox.kilp[215] = 598013303;
        ox.kilp[216] = 1569147256;
        ox.kilp[217] = -473276783;
        ox.kilp[218] = 1613514242;
        ox.kilp[219] = -395940476;
        ox.kilp[220] = 1228705900;
        ox.kilp[221] = 158669617;
        ox.kilp[222] = 624720397;
        ox.kilp[223] = -1371529852;
        ox.kilp[224] = -2109926949;
        ox.kilp[225] = 139189716;
        ox.kilp[226] = -171147677;
        ox.kilp[227] = 2083590132;
        ox.kilp[228] = -364419786;
        ox.kilp[229] = -1237339817;
        ox.kilp[230] = -8683440;
        ox.kilp[231] = -1149828534;
        ox.kilp[232] = 634192096;
        ox.kilp[233] = -1101392480;
        ox.kilp[234] = -315929075;
        ox.kilp[235] = -599348114;
        ox.kilp[236] = 935343462;
        ox.kilp[237] = -1905136634;
        ox.kilp[238] = -1715382210;
        ox.kilp[239] = -445853637;
        ox.kilp[240] = -25926049;
        ox.kilp[241] = -378099274;
        ox.kilp[242] = 1461803735;
        ox.kilp[243] = -1261246127;
        ox.kilp[244] = 1979901688;
        ox.kilp[245] = -514210225;
        ox.kilp[246] = 1853915897;
        ox.kilp[247] = -644468042;
        ox.kilp[248] = -1614333371;
        ox.kilp[249] = -661644604;
        ox.kilp[250] = -1504144006;
        ox.kilp[251] = -322160729;
        ox.kilp[252] = -461375483;
        ox.kilp[253] = 735301568;
        ox.kilp[254] = 1598912810;
        ox.kilp[255] = 1837579818;
        ox.kilp[256] = 303448365;
        ox.kilp[257] = -1621494940;
        ox.kilp[258] = 1170477812;
        ox.kilp[259] = 2668940;
        ox.kilp[260] = -1036557281;
        ox.kilp[261] = -1677464772;
        ox.kilp[262] = 434625012;
        ox.kilp[263] = 1262191917;
        ox.kilp[264] = -258059825;
        ox.kilp[265] = 963807563;
        ox.kilp[266] = -102277566;
        ox.kilp[267] = 785380965;
        ox.kilp[268] = 474433618;
        ox.kilp[269] = 2106176100;
        ox.kilp[270] = -145463040;
        ox.kilp[271] = 1120304143;
        ox.kilp[272] = -1118239777;
        ox.kilp[273] = 1128616388;
        ox.kilp[274] = 1389345203;
        ox.kilp[275] = 1583755478;
        ox.kilp[276] = -1216128011;
        ox.kilp[277] = 76025700;
        ox.kilp[278] = -2073951916;
        ox.kilp[279] = -617252977;
        ox.kilp[280] = -824522024;
        ox.kilp[281] = 368102273;
        ox.kilp[282] = -845378984;
        ox.kilp[283] = 1314052789;
        ox.kilp[284] = -752051613;
        ox.kilp[285] = -1157474829;
        ox.kilp[286] = -380481150;
        ox.kilp[287] = 920142079;
        ox.kilp[288] = 1733330269;
        ox.kilp[289] = 247930925;
        ox.kilp[290] = -1049643889;
        ox.kilp[291] = -1369917104;
        ox.kilp[292] = 1934871159;
        ox.kilp[293] = -1732797003;
        ox.kilp[294] = -496011856;
        ox.kilp[295] = 284625608;
    }

    private static /* synthetic */ void kjjp() {
        ox.kilz[100] = 8483631500320769531L;
        ox.kilz[101] = -1913234126981603852L;
        ox.kilz[102] = -6163333469093649376L;
        ox.kilz[103] = 2188191314123285370L;
        ox.kilz[104] = -4321012917881661304L;
        ox.kilz[105] = 160404544745594643L;
        ox.kilz[106] = -2336723731438801044L;
        ox.kilz[107] = -8579613529591636899L;
        ox.kilz[108] = 2930547381991279577L;
        ox.kilz[109] = 6110278482006283118L;
        ox.kilz[110] = -1069696810994531496L;
        ox.kilz[111] = 2768174975377692197L;
        ox.kilz[112] = 505816562012984842L;
        ox.kilz[113] = -4571601650726828255L;
        ox.kilz[114] = 84673665919142877L;
        ox.kilz[115] = -7130352110218296507L;
        ox.kilz[116] = 457012131569687668L;
        ox.kilz[117] = 3887484925389192085L;
        ox.kilz[118] = -4109555601574438617L;
        ox.kilz[119] = 4529927890762531089L;
        ox.kilz[120] = -8629825818582126545L;
        ox.kilz[121] = 2948433859338697762L;
        ox.kilz[122] = 7664815784233861923L;
        ox.kilz[123] = -6344587956137033966L;
        ox.kilz[124] = 8594034404181138603L;
        ox.kilz[125] = -3815073860802682782L;
        ox.kilz[126] = 2322506584908563002L;
        ox.kilz[127] = 2311056410464329187L;
        ox.kilz[128] = -623637805069745755L;
        ox.kilz[129] = 7024502374074473615L;
        ox.kilz[130] = 387287497521480599L;
        ox.kilz[131] = -2039678667222152996L;
        ox.kilz[132] = -6344245858021134469L;
        ox.kilz[133] = -6372723523438589331L;
        ox.kilz[134] = -8651504309063865406L;
        ox.kilz[135] = 8250478660125300583L;
        ox.kilz[136] = -37925075444572047L;
        ox.kilz[137] = 4796652315832439600L;
        ox.kilz[138] = -2451904516878140721L;
        ox.kilz[139] = 8050633619942553779L;
        ox.kilz[140] = -6903671391471596589L;
        ox.kilz[141] = 1670270731410635011L;
        ox.kilz[142] = 852507301767567585L;
        ox.kilz[143] = -358350306117849330L;
        ox.kilz[144] = -7909599202219627165L;
        ox.kilz[145] = -8303749149664446663L;
        ox.kilz[146] = -982923211947004929L;
        ox.kilz[147] = -97931964876847689L;
        ox.kilz[148] = 7888964638489788172L;
        ox.kilz[149] = -7044705523768714175L;
        ox.kilz[150] = 4237061852964212791L;
        ox.kilz[151] = 7260779266482048943L;
        ox.kilz[152] = -8930412295088153067L;
        ox.kilz[153] = 8806122218626777585L;
        ox.kilz[154] = -4341189063442796696L;
        ox.kilz[155] = -2438423348479922783L;
        ox.kilz[156] = 571411716118533650L;
        ox.kilz[157] = -8215147219682037216L;
        ox.kilz[158] = -3638129137751750414L;
        ox.kilz[159] = -894930322925930746L;
        ox.kilz[160] = 8784428290528020957L;
        ox.kilz[161] = -7271214504468566519L;
        ox.kilz[162] = -6154153372005440986L;
        ox.kilz[163] = 4068725839734184680L;
        ox.kilz[164] = 5545401699035213561L;
        ox.kilz[165] = -4935420994391902230L;
        ox.kilz[166] = 1096975311461321410L;
        ox.kilz[167] = -2110841171100730566L;
        ox.kilz[168] = -5630806969518889665L;
        ox.kilz[169] = 6256611484017681916L;
        ox.kilz[170] = 1752679842322621061L;
        ox.kilz[171] = -7435158032922162086L;
        ox.kilz[172] = 14574025583380265L;
        ox.kilz[173] = -9064797395970848827L;
        ox.kilz[174] = -1221311821690981149L;
        ox.kilz[175] = 6773777466790232872L;
        ox.kilz[176] = -4464162843847066767L;
        ox.kilz[177] = -4497110553733179503L;
        ox.kilz[178] = -8191960608712442921L;
        ox.kilz[179] = -4075520495698683573L;
        ox.kilz[180] = -2137475979784617678L;
        ox.kilz[181] = 8665874614598825176L;
        ox.kilz[182] = 2475286804453091050L;
        ox.kilz[183] = 5178527592365496577L;
        ox.kilz[184] = -8720259437285380446L;
        ox.kilz[185] = -3209179190145167382L;
        ox.kilz[186] = -8734198073919355644L;
        ox.kilz[187] = -913873352866683646L;
        ox.kilz[188] = -3282913976651303366L;
        ox.kilz[189] = 8625303248022081782L;
        ox.kilz[190] = 7947679936167559468L;
        ox.kilz[191] = 6344296948934995527L;
        ox.kilz[192] = -7607140625039133101L;
        ox.kilz[193] = -5381979635318369237L;
        ox.kilz[194] = -7926119279419476575L;
        ox.kilz[195] = -1558443383210161482L;
        ox.kilz[196] = 6540248122388196141L;
        ox.kilz[197] = -3457853353864675888L;
        ox.kilz[198] = 3346570846630866225L;
        ox.kilz[199] = 3943482805479184846L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Double lambda$findBestVector$8(ov var1_1, class_243 var2_2) {
        v0 /* !! */  = ox.sj;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ox.kilq("kjaj", kilx(int ), (int)173));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1046289767: {
                    v1 = ox.kilq("kjak", kilx(int ), (int)174);
                    continue block25;
                }
                case 1251136524: {
                    break block25;
                }
                case 1482907461: {
                    v1 = ox.kilq("kjal", kilx(int ), (int)175);
                    continue block25;
                }
            }
            break;
        }
        var5_3 = ox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ox.sj - ox.kilq("kjam", kilx(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ox.kilq("kjan", kiln(int ), (int)178)) break;
            v2 /* !! */  = (long)ox.kilq("kjao", kiln(int ), (int)179);
        }
        var4_4 /* !! */  = ox.b;
        v3 /* !! */  = ox.sj;
        if (true) ** GOTO lbl25
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - ox.kilq("kjap", kilx(int ), (int)177));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1951311364: {
                    v4 = ox.kilq("kjaq", kilx(int ), (int)178);
                    continue block27;
                }
                case -1015542918: {
                    v4 = ox.kilq("kjar", kilx(int ), (int)179);
                    continue block27;
                }
                case 1251136524: {
                    break block27;
                }
            }
            break;
        }
        var3_5 = ox.a;
        if (var5_3) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var3_5) ** GOTO lbl37
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ox.sj - ox.kilq("kjas", kilx(int ), (int)180)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ox.kilq("kjat", kiln(int ), (int)180)) break;
                    v5 /* !! */  = (long)ox.kilq("kjau", kiln(int ), (int)181);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ox.sj - ox.kilq("kjav", kilx(int ), (int)181)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ox.kilq("kjaw", kiln(int ), (int)182)) break;
                    v6 /* !! */  = (long)ox.kilq("kjax", kiln(int ), (int)183);
                }
                v7 = ox.mc.field_1724;
                v8 /* !! */  = ox.sj;
                if (true) ** GOTO lbl59
                block31: while (true) {
                    v8 /* !! */  = (long)(v9 - ox.kilq("kjay", kilx(int ), (int)182));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2023480927: {
                            v9 = ox.kilq("kjaz", kilx(int ), (int)183);
                            continue block31;
                        }
                        case -208527097: {
                            v9 = ox.kilq("kjba", kilx(int ), (int)184);
                            continue block31;
                        }
                        case 1251136524: {
                            break block31;
                        }
                    }
                    break;
                }
                v10 = v7.method_33571();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ox.sj - ox.kilq("kjbb", kilx(int ), (int)185)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ox.kilq("kjbc", kiln(int ), (int)184)) break;
                    v11 /* !! */  = (long)ox.kilq("kjbd", kiln(int ), (int)185);
                }
                v12 = this.calculateRotationDifference(v10, var2_2, var1_1);
                v13 /* !! */  = ox.sj;
                if (true) ** GOTO lbl79
                block33: while (true) {
                    v13 /* !! */  = (long)(ox.kilq("kjbf", kilx(int ), (int)187) - ox.kilq("kjbe", kilx(int ), (int)186));
lbl79:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1251136524: {
                            break block33;
                        }
                        case 2145048085: {
                            continue block33;
                        }
                    }
                    break;
                }
                return v12;
            }
            case 0: {
                var4_4 /* !! */  = (int)ox.kilq("kjbg", kiln(int ), (int)186);
                if (var5_3) {
                    throw null;
                }
            }
            case 1: {
                var4_4 /* !! */  = (int)ox.kilq("kjbh", kiln(int ), (int)187);
                if (var5_3) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ox.kilq("kjbi", kiln(int ), (int)188);
                    if (!var5_3) break block10;
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)ox.kilq("kjbj", kiln(int ), (int)189);
        ** while (!var5_3)
lbl101:
        // 1 sources

        throw null;
    }
}

