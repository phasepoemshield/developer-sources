/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  org.joml.Vector2f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Vector2f;
import ruhack.phobia.at;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.ca;
import ruhack.phobia.dh;
import ruhack.phobia.dz;
import ruhack.phobia.f;
import ruhack.phobia.i;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.nd;
import ruhack.phobia.op;

public final class n
extends f {
    private static final int TEXT_COLOR;
    private static final float INNER_BLUR = 8.104764f;
    private static double targetZ;
    private static final float DESIGN_SCALE = 1.9988245f;
    private final Vector2f projected;
    private static final float ICON_SIZE = 5.9334874f;
    private static final float PADDING_X = 2.2263083f;
    public static final boolean a;
    private static long[] akre;
    private static int[] akor;
    private static final float PANEL_BORDER = 0.500294f;
    private static final int SUFFIX_COLOR;
    private static final float CONTENT_RADIUS = 4.002352f;
    private static int[] akos;
    static final long cc = 698486757616547736L;
    private static final float CONTENT_HEIGHT = 14.293401f;
    private static final float ICON_WIDTH = 16.534718f;
    private static boolean enabled;
    private static final double MARKER_Y = 95.0;
    public static final int b;
    public static final boolean c;
    private static final float INNER_THICKNESS = 0.5753381f;
    private static final int CONTENT_BORDER_COLOR;
    private static final class_310 MC;
    private static final float PANEL_HEIGHT = 18.360792f;
    private static final float PADDING_Y = 2.0336957f;
    private static final int BORDER;
    private static long[] akrd;
    private static final float TEXT_PADDING = 4.002352f;
    private static double targetX;
    private static final float CONTENT_BORDER = 0.500294f;
    private static final float TEXT_SIZE = 6.0035286f;
    private static final float PANEL_RADIUS = 5.5032344f;
    private static final String MARKER_ICON = "c";
    private static final float GAP = 1.7810467f;

    private static /* synthetic */ long akrc(int n2) {
        return akrd[n2] ^ akre[n2];
    }

    private static /* synthetic */ void alpe() {
        n.akor[0] = 1691839658;
        n.akor[1] = -1847618035;
        n.akor[2] = -1289383088;
        n.akor[3] = -1987031758;
        n.akor[4] = 1629281472;
        n.akor[5] = -1135346481;
        n.akor[6] = -294599971;
        n.akor[7] = -910324616;
        n.akor[8] = 1706759014;
        n.akor[9] = -1660952836;
        n.akor[10] = -19431733;
        n.akor[11] = 1404582479;
        n.akor[12] = 712465791;
        n.akor[13] = 1694980275;
        n.akor[14] = 1538144860;
        n.akor[15] = 30050559;
        n.akor[16] = 725706136;
        n.akor[17] = 1093012469;
        n.akor[18] = -1409098066;
        n.akor[19] = 317852672;
        n.akor[20] = -1825256902;
        n.akor[21] = -912756744;
        n.akor[22] = -1380905696;
        n.akor[23] = 1546505299;
        n.akor[24] = 770702823;
        n.akor[25] = -245893611;
        n.akor[26] = -1036445759;
        n.akor[27] = 1193589182;
        n.akor[28] = 1761976541;
        n.akor[29] = -1168561305;
        n.akor[30] = 1464076910;
        n.akor[31] = -1973272390;
        n.akor[32] = 703384131;
        n.akor[33] = 2110338553;
        n.akor[34] = 613437854;
        n.akor[35] = -419492964;
        n.akor[36] = -1171786265;
        n.akor[37] = -1086695891;
        n.akor[38] = -525870653;
        n.akor[39] = 275262487;
        n.akor[40] = 1117882058;
        n.akor[41] = 243617142;
        n.akor[42] = -2105953019;
        n.akor[43] = 89601986;
        n.akor[44] = 1807226696;
        n.akor[45] = 1478479602;
        n.akor[46] = -1526816559;
        n.akor[47] = 556930860;
        n.akor[48] = 1482950558;
        n.akor[49] = 2097569694;
        n.akor[50] = -55510505;
        n.akor[51] = -1557033356;
        n.akor[52] = -1417478520;
        n.akor[53] = 341460886;
        n.akor[54] = -1441400336;
        n.akor[55] = 823771318;
        n.akor[56] = -571649059;
        n.akor[57] = -1480951373;
        n.akor[58] = 1243563854;
        n.akor[59] = 1447048677;
        n.akor[60] = -34159327;
        n.akor[61] = 240793360;
        n.akor[62] = 164323200;
        n.akor[63] = -61204016;
        n.akor[64] = -613020832;
        n.akor[65] = -356927406;
        n.akor[66] = 506116820;
        n.akor[67] = 1589240643;
        n.akor[68] = 1540588934;
        n.akor[69] = -1462590809;
        n.akor[70] = 1732516358;
        n.akor[71] = 1846751998;
        n.akor[72] = -934735282;
        n.akor[73] = 1307886582;
        n.akor[74] = 1347519616;
        n.akor[75] = -1142929052;
        n.akor[76] = -2051836128;
        n.akor[77] = 976145304;
        n.akor[78] = 647458600;
        n.akor[79] = -464377171;
        n.akor[80] = -1319291022;
        n.akor[81] = 294830201;
        n.akor[82] = 887985715;
        n.akor[83] = -1869638809;
        n.akor[84] = 2103421052;
        n.akor[85] = -731519529;
        n.akor[86] = 62862900;
        n.akor[87] = 1818374414;
        n.akor[88] = -1492773484;
        n.akor[89] = 348235543;
        n.akor[90] = -1519769085;
        n.akor[91] = -905670247;
        n.akor[92] = -984618062;
        n.akor[93] = -50406123;
        n.akor[94] = 638164910;
        n.akor[95] = 1603650877;
        n.akor[96] = -1432704961;
        n.akor[97] = 839881956;
        n.akor[98] = 825718567;
        n.akor[99] = 1842476525;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isEnabled() {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(n.akot("akzb", akrc(int ), (int)44) - n.akot("akza", akrc(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1707808240: {
                    continue block10;
                }
                case 1544320920: {
                    break block10;
                }
            }
            break;
        }
        var2 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akzc", akrc(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == n.akot("akzd", akoq(int ), (int)218)) break;
            v1 /* !! */  = (long)n.akot("akze", akoq(int ), (int)219);
        }
        var1_1 /* !! */  = n.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = n.cc - n.akot("akzf", akrc(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == n.akot("akzg", akoq(int ), (int)220)) break;
            v2 /* !! */  = (long)n.akot("akzh", akoq(int ), (int)221);
        }
        var0_2 = n.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)n.akot("akzi", akoq(int ), (int)222);
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = n.cc - n.akot("akzj", akrc(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == n.akot("akzk", akoq(int ), (int)223)) break;
                    v3 /* !! */  = (long)n.akot("akzl", akoq(int ), (int)224);
                }
                return n.enabled;
            }
            case 0: {
                var1_1 /* !! */  = (int)n.akot("akzm", akoq(int ), (int)225);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)n.akot("akzn", akoq(int ), (int)226);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)n.akot("akzo", akoq(int ), (int)227);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)n.akot("akzp", akoq(int ), (int)228);
        ** while (!var2)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawIcon(class_332 var0, ks var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("algs", akrc(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == n.akot("algt", akoq(int ), (int)336)) break;
            v0 /* !! */  = (long)n.akot("algu", akoq(int ), (int)337);
        }
        var12_4 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("algv", akrc(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == n.akot("algw", akoq(int ), (int)338)) break;
            v1 /* !! */  = (long)n.akot("algx", akoq(int ), (int)339);
        }
        var11_5 /* !! */  = n.b;
        v2 /* !! */  = n.cc;
        if (true) ** GOTO lbl19
        block70: while (true) {
            v2 /* !! */  = (long)(v3 - n.akot("algy", akrc(int ), (int)127));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 968410678: {
                    v3 = n.akot("algz", akrc(int ), (int)128);
                    continue block70;
                }
                case 1467706214: {
                    v3 = n.akot("alha", akrc(int ), (int)129);
                    continue block70;
                }
                case 1544320920: {
                    break block70;
                }
            }
            break;
        }
        var10_6 = n.a;
        if (var12_4) {
            throw null;
lbl31:
            // 12 sources

            return;
        }
        if (var10_6 || var10_6) ** GOTO lbl31
        v4 = n.akot("alhb", akoq(int ), (int)340);
        v5 /* !! */  = n.cc;
        if (true) ** GOTO lbl39
        block72: while (true) {
            v5 /* !! */  = (long)(n.akot("alhd", akrc(int ), (int)131) - n.akot("alhc", akrc(int ), (int)130));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1544320920: {
                    break block72;
                }
                case 1699097892: {
                    continue block72;
                }
            }
            break;
        }
        v6 = "c".charAt((int)v4);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = n.cc - n.akot("alhe", akrc(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == n.akot("alhf", akoq(int ), (int)341)) break;
            v7 /* !! */  = (long)n.akot("alhg", akoq(int ), (int)342);
        }
        var4_7 = var1_1.getGlyph(v6);
        if (var10_6 || var10_6) ** GOTO lbl31
        if (var4_7 == null) ** GOTO lbl76
        if (var11_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_6) ** GOTO lbl31
                v8 /* !! */  = n.cc;
                if (true) ** GOTO lbl62
                block74: while (true) {
                    v8 /* !! */  = (long)(v9 - n.akot("alhh", akrc(int ), (int)133));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 630586074: {
                            v9 = n.akot("alhi", akrc(int ), (int)134);
                            continue block74;
                        }
                        case 734469258: {
                            v9 = n.akot("alhj", akrc(int ), (int)135);
                            continue block74;
                        }
                        case 1254862348: {
                            v9 = n.akot("alhk", akrc(int ), (int)136);
                            continue block74;
                        }
                        case 1544320920: {
                            break block74;
                        }
                    }
                    break;
                }
                if (!(var4_7.width <= 0.0f)) ** GOTO lbl78
                if (var10_6) ** GOTO lbl31
lbl76:
                // 2 sources

                if (var10_6 || var10_6) ** GOTO lbl31
                return;
lbl78:
                // 1 sources

                if (var10_6 || var10_6) ** GOTO lbl31
                v10 = n.akot("alhl", akst(int ), (int)343);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = n.cc - n.akot("alhm", akrc(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == n.akot("alhn", akoq(int ), (int)344)) break;
                    v11 /* !! */  = (long)n.akot("alho", akoq(int ), (int)345);
                }
                v12 = v10 * var1_1.getEmSize();
                v13 /* !! */  = n.cc;
                if (true) ** GOTO lbl91
                block76: while (true) {
                    v13 /* !! */  = (long)(n.akot("alhq", akrc(int ), (int)139) - n.akot("alhp", akrc(int ), (int)138));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -385597180: {
                            continue block76;
                        }
                        case 1544320920: {
                            break block76;
                        }
                    }
                    break;
                }
                var5_8 = v12 / var4_7.width;
                if (var10_6 || var10_6) ** GOTO lbl31
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = n.cc - n.akot("alhr", akrc(int ), (int)140)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == n.akot("alhs", akoq(int ), (int)346)) break;
                    v14 /* !! */  = (long)n.akot("alht", akoq(int ), (int)347);
                }
                var6_9 = var5_8 / var1_1.getEmSize();
                if (var10_6 || var10_6) ** GOTO lbl31
                var7_10 = var2_2 + n.akot("alhu", akst(int ), (int)348);
                if (var10_6 || var10_6) ** GOTO lbl31
                var8_11 = var3_3 + n.akot("alhv", akst(int ), (int)349);
                if (var10_6 || var10_6) ** GOTO lbl31
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = n.cc - n.akot("alhw", akrc(int ), (int)141)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == n.akot("alhx", akoq(int ), (int)350)) break;
                    v15 /* !! */  = (long)n.akot("alhy", akoq(int ), (int)351);
                }
                var9_12 = var8_11 - var4_7.height * var6_9 * n.akot("alhz", akst(int ), (int)352);
                if (var10_6 || var10_6) ** GOTO lbl31
                v16 /* !! */  = n.cc;
                if (true) ** GOTO lbl122
                block79: while (true) {
                    v16 /* !! */  = (long)(n.akot("alib", akrc(int ), (int)143) - n.akot("alia", akrc(int ), (int)142));
lbl122:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 1344779432: {
                            continue block79;
                        }
                        case 1544320920: {
                            break block79;
                        }
                    }
                    break;
                }
                v17 = var7_10 - var4_7.bearingX * var6_9;
                v18 /* !! */  = n.cc;
                if (true) ** GOTO lbl132
                block80: while (true) {
                    v18 /* !! */  = (long)(n.akot("alid", akrc(int ), (int)145) - n.akot("alic", akrc(int ), (int)144));
lbl132:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 550224480: {
                            continue block80;
                        }
                        case 1544320920: {
                            break block80;
                        }
                    }
                    break;
                }
                v19 = var9_12 - var1_1.getAscender() * var6_9;
                v20 /* !! */  = n.cc;
                if (true) ** GOTO lbl142
                block81: while (true) {
                    v20 /* !! */  = (long)(n.akot("alif", akrc(int ), (int)147) - n.akot("alie", akrc(int ), (int)146));
lbl142:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 1544320920: {
                            break block81;
                        }
                        case 1837121039: {
                            continue block81;
                        }
                    }
                    break;
                }
                v21 = v19 + var4_7.bearingY * var6_9;
                v22 = n.akot("alig", akoq(int ), (int)353);
                v23 /* !! */  = n.cc;
                if (true) ** GOTO lbl153
                block82: while (true) {
                    v23 /* !! */  = (long)(n.akot("alii", akrc(int ), (int)149) - n.akot("alih", akrc(int ), (int)148));
lbl153:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 352136538: {
                            continue block82;
                        }
                        case 1544320920: {
                            break block82;
                        }
                    }
                    break;
                }
                v24 = dz.color((int)v22);
                v25 = n.akot("alij", akoq(int ), (int)354);
                v26 /* !! */  = n.cc;
                if (true) ** GOTO lbl164
                block83: while (true) {
                    v26 /* !! */  = (long)(v27 - n.akot("alik", akrc(int ), (int)150));
lbl164:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 492289663: {
                            v27 = n.akot("alil", akrc(int ), (int)151);
                            continue block83;
                        }
                        case 1210706289: {
                            v27 = n.akot("alim", akrc(int ), (int)152);
                            continue block83;
                        }
                        case 1523222042: {
                            v27 = n.akot("alin", akrc(int ), (int)153);
                            continue block83;
                        }
                        case 1544320920: {
                            break block83;
                        }
                    }
                    break;
                }
                kq.text(var0, var1_1, "c", v17, v21, (float)var5_8, v24, (boolean)v25);
                if (!var10_6 && !var10_6) ** break;
                ** continue;
                return;
            }
            case 0: {
                var11_5 /* !! */  = (int)n.akot("alio", akoq(int ), (int)355);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl185:
            // 4 sources

            case 1: {
                var11_5 /* !! */  = (int)n.akot("alip", akoq(int ), (int)356);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl190:
            // 3 sources

            case 2: {
                var11_5 /* !! */  = (int)n.akot("aliq", akoq(int ), (int)357);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl195:
            // 2 sources

            case 3: {
                var11_5 /* !! */  = (int)n.akot("alir", akoq(int ), (int)358);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl200:
            // 2 sources

            case 4: {
                var11_5 /* !! */  = (int)n.akot("alis", akoq(int ), (int)359);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 5: {
                var11_5 /* !! */  = (int)n.akot("alit", akoq(int ), (int)360);
                if (var12_4) {
                    throw null;
                }
            }
lbl209:
            // 4 sources

            case 6: {
                var11_5 /* !! */  = (int)n.akot("aliu", akoq(int ), (int)361);
                if (!var12_4) ** GOTO lbl190
                throw null;
            }
            case 7: {
                var11_5 /* !! */  = (int)n.akot("aliv", akoq(int ), (int)362);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl218:
            // 2 sources

            case 8: {
                var11_5 /* !! */  = (int)n.akot("aliw", akoq(int ), (int)363);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl223:
            // 2 sources

            case 9: {
                do {
                    var11_5 /* !! */  = (int)n.akot("alix", akoq(int ), (int)364);
                } while (!var12_4);
                throw null;
            }
lbl228:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_5 /* !! */  = (int)n.akot("aliy", akoq(int ), (int)365);
                    if (var12_4) {
                        throw null;
                    }
                    ** GOTO lbl252
                    break;
                }
            }
            case 11: {
                var11_5 /* !! */  = (int)n.akot("aliz", akoq(int ), (int)366);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 12: {
                var11_5 /* !! */  = (int)n.akot("alja", akoq(int ), (int)367);
                if (!var12_4) ** GOTO lbl195
                throw null;
            }
lbl243:
            // 2 sources

            case 13: {
                var11_5 /* !! */  = (int)n.akot("aljb", akoq(int ), (int)368);
                if (!var12_4) ** GOTO lbl185
                throw null;
            }
lbl247:
            // 3 sources

            case 14: {
                var11_5 /* !! */  = (int)n.akot("aljc", akoq(int ), (int)369);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl252:
            // 3 sources

            case 15: {
                var11_5 /* !! */  = (int)n.akot("aljd", akoq(int ), (int)370);
                if (!var12_4) ** GOTO lbl247
                throw null;
            }
            case 16: {
                var11_5 /* !! */  = (int)n.akot("alje", akoq(int ), (int)371);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 17: {
                var11_5 /* !! */  = (int)n.akot("aljf", akoq(int ), (int)372);
                if (!var12_4) ** GOTO lbl185
                throw null;
            }
            case 18: {
                var11_5 /* !! */  = (int)n.akot("aljg", akoq(int ), (int)373);
                if (!var12_4) ** GOTO lbl190
                throw null;
            }
lbl269:
            // 2 sources

            case 19: {
                var11_5 /* !! */  = (int)n.akot("aljh", akoq(int ), (int)374);
                if (!var12_4) ** GOTO lbl228
                throw null;
            }
            case 20: {
                do {
                    var11_5 /* !! */  = (int)n.akot("alji", akoq(int ), (int)375);
                } while (!var12_4);
                throw null;
            }
            case 21: {
                var11_5 /* !! */  = (int)n.akot("aljj", akoq(int ), (int)376);
                if (!var12_4) ** GOTO lbl218
                throw null;
            }
lbl282:
            // 3 sources

            case 22: {
                var11_5 /* !! */  = (int)n.akot("aljk", akoq(int ), (int)377);
                if (!var12_4) ** GOTO lbl185
                throw null;
            }
lbl286:
            // 3 sources

            case 23: {
                var11_5 /* !! */  = (int)n.akot("aljl", akoq(int ), (int)378);
                if (!var12_4) ** GOTO lbl209
                throw null;
            }
            case 24: 
        }
        var11_5 /* !! */  = (int)n.akot("aljm", akoq(int ), (int)379);
        ** while (!var12_4)
lbl293:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double getTargetX() {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - n.akot("akzq", akrc(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -983356465: {
                    v1 = n.akot("akzr", akrc(int ), (int)49);
                    continue block11;
                }
                case 361108628: {
                    v1 = n.akot("akzs", akrc(int ), (int)50);
                    continue block11;
                }
                case 1544320920: {
                    break block11;
                }
            }
            break;
        }
        var2 = n.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akzt", akrc(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == n.akot("akzu", akoq(int ), (int)229)) break;
            v2 /* !! */  = (long)n.akot("akzv", akoq(int ), (int)230);
        }
        var1_1 = n.b;
        v3 /* !! */  = n.cc;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - n.akot("akzw", akrc(int ), (int)52));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -416692760: {
                    v4 = n.akot("akzx", akrc(int ), (int)53);
                    continue block13;
                }
                case 1235038028: {
                    v4 = n.akot("akzy", akrc(int ), (int)54);
                    continue block13;
                }
                case 1544320920: {
                    break block13;
                }
                case 1945143403: {
                    v4 = n.akot("akzz", akrc(int ), (int)55);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = n.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return (double)n.akot("alaa", aksr(int ), (int)56);
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = n.cc - n.akot("alab", akrc(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == n.akot("alac", akoq(int ), (int)231)) break;
            v5 /* !! */  = (long)n.akot("alad", akoq(int ), (int)232);
        }
        return n.targetX;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public n() {
        var2_1 /* !! */  = n.b;
        super("gps", "\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0438 \u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0434\u043e \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442", new String[0]);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.projected = new Vector2f();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)n.akot("akou", akoq(int ), (int)0);
                break;
            }
lbl11:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)n.akot("akov", akoq(int ), (int)1);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)n.akot("akow", akoq(int ), (int)2);
                ** GOTO lbl11
            }
            case 3: 
        }
        while (true) {
            var2_1 /* !! */  = (int)n.akot("akox", akoq(int ), (int)3);
        }
    }

    private static /* synthetic */ int akoq(int n2) {
        return akor[n2] ^ akos[n2];
    }

    private static /* synthetic */ void ancw() {
        n.akrd[100] = 5174948851526912229L;
        n.akrd[101] = 688417302809322092L;
        n.akrd[102] = -9141300654353383788L;
        n.akrd[103] = -7319022276158249331L;
        n.akrd[104] = 6824154306755737469L;
        n.akrd[105] = -147968671172374287L;
        n.akrd[106] = -3084377311713614391L;
        n.akrd[107] = 8529894210195391756L;
        n.akrd[108] = -423306143316950215L;
        n.akrd[109] = -6491660721039371347L;
        n.akrd[110] = 2149586945732361940L;
        n.akrd[111] = 9062027958716911062L;
        n.akrd[112] = -4652196609382402552L;
        n.akrd[113] = 371990545116272462L;
        n.akrd[114] = -9083523279742047184L;
        n.akrd[115] = -3544466863847156395L;
        n.akrd[116] = 9093316721571097356L;
        n.akrd[117] = -772033296308171314L;
        n.akrd[118] = -7403683596285503714L;
        n.akrd[119] = -1007263981125382090L;
        n.akrd[120] = 5376697414992245298L;
        n.akrd[121] = 3072855053024457348L;
        n.akrd[122] = 8420455493682663446L;
        n.akrd[123] = 6542217245942618149L;
        n.akrd[124] = 8353771075435041970L;
        n.akrd[125] = 7984653315087625990L;
        n.akrd[126] = -4450520332003180232L;
        n.akrd[127] = -5354904065630233110L;
        n.akrd[128] = 5102575292414597025L;
        n.akrd[129] = -2467200494852130696L;
        n.akrd[130] = -6892841197319409226L;
        n.akrd[131] = 532872894507326284L;
        n.akrd[132] = 3977739147158216419L;
        n.akrd[133] = -3724766487246385965L;
        n.akrd[134] = 7743595122393053252L;
        n.akrd[135] = -3649522396456134267L;
        n.akrd[136] = -1964367718179836925L;
        n.akrd[137] = -4008379616408606756L;
        n.akrd[138] = 5007241962632467416L;
        n.akrd[139] = -4245039476123792500L;
        n.akrd[140] = -7612016836379007766L;
        n.akrd[141] = 8694262407301016825L;
        n.akrd[142] = -4848732749956803808L;
        n.akrd[143] = -6585118867308231038L;
        n.akrd[144] = -6018562893097552513L;
        n.akrd[145] = -1387808237222354260L;
        n.akrd[146] = -7498604651979255979L;
        n.akrd[147] = -4625532090145659913L;
        n.akrd[148] = -3282713425327083261L;
        n.akrd[149] = 716021939708909308L;
        n.akrd[150] = -4008887598770821268L;
        n.akrd[151] = 7952801149773805269L;
        n.akrd[152] = 4054259682754766542L;
        n.akrd[153] = -6476243500383394178L;
        n.akrd[154] = -2565342993796507081L;
        n.akrd[155] = -5696355350040190211L;
        n.akrd[156] = 1465085929968262620L;
        n.akrd[157] = 2207252096255875290L;
        n.akrd[158] = 5745221968812434612L;
        n.akrd[159] = 3313415624159222748L;
        n.akrd[160] = -1367062259857177435L;
        n.akrd[161] = 8015571852903892554L;
        n.akrd[162] = -5546336639995439174L;
        n.akrd[163] = -6186513111526144289L;
        n.akrd[164] = 1495166669627027272L;
        n.akrd[165] = -7111420247547399413L;
        n.akrd[166] = 8430507776206162828L;
        n.akrd[167] = 8605977856429363580L;
        n.akrd[168] = 311647419810629562L;
        n.akrd[169] = 5709407699749041661L;
        n.akrd[170] = 6916527121952908806L;
        n.akrd[171] = 2376463162781667554L;
        n.akrd[172] = 5485211138571718190L;
        n.akrd[173] = -1829390261706726242L;
        n.akrd[174] = -9212046287605936483L;
        n.akrd[175] = 4705079559061541336L;
        n.akrd[176] = 2462271985661267652L;
        n.akrd[177] = -7201857409007799657L;
        n.akrd[178] = 5166594063889316L;
        n.akrd[179] = 7522081960014852941L;
        n.akrd[180] = 7319491182364106367L;
        n.akrd[181] = 3204403754006061808L;
        n.akrd[182] = 8698085426754497818L;
        n.akrd[183] = -7299448170488761576L;
        n.akrd[184] = 3284957829513317718L;
    }

    private static /* synthetic */ void ancy() {
        n.akre[100] = 3194021499985191158L;
        n.akre[101] = 2664122112561532272L;
        n.akre[102] = -1082367949881573453L;
        n.akre[103] = 5609809461074290622L;
        n.akre[104] = -603014296805703369L;
        n.akre[105] = 1158078348989861783L;
        n.akre[106] = -9066361083046431091L;
        n.akre[107] = 6132049435298066171L;
        n.akre[108] = 2473624835711080582L;
        n.akre[109] = -8021207641220011130L;
        n.akre[110] = -2452060940636669674L;
        n.akre[111] = -8285189590083528101L;
        n.akre[112] = 8070910730170648961L;
        n.akre[113] = -6603481703883307837L;
        n.akre[114] = 4584484597612912002L;
        n.akre[115] = 1160684257272634965L;
        n.akre[116] = -5692708106734846618L;
        n.akre[117] = -3671122346495291151L;
        n.akre[118] = 7353518376212968481L;
        n.akre[119] = -5109385165058602537L;
        n.akre[120] = -1644660412643923023L;
        n.akre[121] = 2320721736397599805L;
        n.akre[122] = -7843712105751420330L;
        n.akre[123] = 5863486903920681673L;
        n.akre[124] = 7563456292001454975L;
        n.akre[125] = -5830851962386748883L;
        n.akre[126] = 1313192494911527971L;
        n.akre[127] = 9083009131938734447L;
        n.akre[128] = -2094555735443239728L;
        n.akre[129] = 150018251435483297L;
        n.akre[130] = 4126239273880628567L;
        n.akre[131] = 493007239355256832L;
        n.akre[132] = 3034393927139246018L;
        n.akre[133] = -444114164690817991L;
        n.akre[134] = 8433891771856978503L;
        n.akre[135] = 7796031600401026922L;
        n.akre[136] = 4679348891605064206L;
        n.akre[137] = 4242990757803231170L;
        n.akre[138] = -1924779732720595392L;
        n.akre[139] = 1344615929280804375L;
        n.akre[140] = 9119579661628961334L;
        n.akre[141] = -6343162601511189398L;
        n.akre[142] = 4660167317260676572L;
        n.akre[143] = 6580744543650227181L;
        n.akre[144] = -3581476139178358682L;
        n.akre[145] = 7675444822682659890L;
        n.akre[146] = 120455427982012861L;
        n.akre[147] = 8227090846130899589L;
        n.akre[148] = -7189456100410482449L;
        n.akre[149] = -8093292433329395791L;
        n.akre[150] = 1325679482356964558L;
        n.akre[151] = -2570369184163922238L;
        n.akre[152] = -605924740228062775L;
        n.akre[153] = -4886654529619013425L;
        n.akre[154] = 8656266668645653617L;
        n.akre[155] = -4552389550964055116L;
        n.akre[156] = 7835345536172816056L;
        n.akre[157] = 561521675688418321L;
        n.akre[158] = 5396156277966030819L;
        n.akre[159] = -964059428638450742L;
        n.akre[160] = 7902146084327330597L;
        n.akre[161] = 6472791286224884839L;
        n.akre[162] = 5329888336933511841L;
        n.akre[163] = -4620266314170802757L;
        n.akre[164] = 1683165745368439124L;
        n.akre[165] = -2352552007393393877L;
        n.akre[166] = 4846033384248885346L;
        n.akre[167] = 98159577839072268L;
        n.akre[168] = -7347488176326685786L;
        n.akre[169] = 3004257358397292573L;
        n.akre[170] = 7192669211180390252L;
        n.akre[171] = -2676096623234750461L;
        n.akre[172] = 3479877144550403231L;
        n.akre[173] = 2931108324109192793L;
        n.akre[174] = -2984352720596018285L;
        n.akre[175] = 1408030817156448084L;
        n.akre[176] = -1753140290682054212L;
        n.akre[177] = -7463261568059687921L;
        n.akre[178] = 2915730076458213935L;
        n.akre[179] = -4039684528213708936L;
        n.akre[180] = 937332671492785858L;
        n.akre[181] = -5430213225376581940L;
        n.akre[182] = 419953234175933416L;
        n.akre[183] = 7097508999597538891L;
        n.akre[184] = -6161027672978550883L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawContent(class_332 var0, float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("alfg", akrc(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == n.akot("alfh", akoq(int ), (int)312)) break;
            v0 /* !! */  = (long)n.akot("alfi", akoq(int ), (int)313);
        }
        var6_4 = n.c;
        v1 /* !! */  = n.cc;
        if (true) ** GOTO lbl11
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - n.akot("alfj", akrc(int ), (int)112));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1961800663: {
                    v2 = n.akot("alfk", akrc(int ), (int)113);
                    continue block27;
                }
                case 651274299: {
                    v2 = n.akot("alfl", akrc(int ), (int)114);
                    continue block27;
                }
                case 950330861: {
                    v2 = n.akot("alfm", akrc(int ), (int)115);
                    continue block27;
                }
                case 1544320920: {
                    break block27;
                }
            }
            break;
        }
        var5_5 /* !! */  = n.b;
        v3 /* !! */  = n.cc;
        if (true) ** GOTO lbl28
        block28: while (true) {
            v3 /* !! */  = (long)(n.akot("alfo", akrc(int ), (int)117) - n.akot("alfn", akrc(int ), (int)116));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1404741364: {
                    continue block28;
                }
                case 1544320920: {
                    break block28;
                }
            }
            break;
        }
        var4_6 = n.a;
        if (var6_4) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var4_6 || var4_6) ** GOTO lbl36
        v4 = n.akot("alfp", akst(int ), (int)314);
        v5 = n.akot("alfq", akst(int ), (int)315);
        v6 = n.akot("alfr", akoq(int ), (int)316);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = n.cc - n.akot("alfs", akrc(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == n.akot("alft", akoq(int ), (int)317)) break;
            v7 /* !! */  = (long)n.akot("alfu", akoq(int ), (int)318);
        }
        v8 = dz.color((int)v6);
        v9 = n.akot("alfv", akoq(int ), (int)319);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = n.cc - n.akot("alfw", akrc(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == n.akot("alfx", akoq(int ), (int)320)) break;
            v10 /* !! */  = (long)n.akot("alfy", akoq(int ), (int)321);
        }
        ki.rect(var0, var1_1, var2_2, var3_3, (float)v4, (float)v5, v8, (boolean)v9);
        if (var4_6 || var4_6) ** GOTO lbl36
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 = n.akot("alfz", akst(int ), (int)322);
                v12 = n.akot("alga", akst(int ), (int)323);
                v13 = n.akot("algb", akst(int ), (int)324);
                v14 /* !! */  = n.cc;
                if (true) ** GOTO lbl66
                block32: while (true) {
                    v14 /* !! */  = (long)(v15 - n.akot("algc", akrc(int ), (int)120));
lbl66:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1455173970: {
                            v15 = n.akot("algd", akrc(int ), (int)121);
                            continue block32;
                        }
                        case -810622865: {
                            v15 = n.akot("alge", akrc(int ), (int)122);
                            continue block32;
                        }
                        case 1013444641: {
                            v15 = n.akot("algf", akrc(int ), (int)123);
                            continue block32;
                        }
                        case 1544320920: {
                            break block32;
                        }
                    }
                    break;
                }
                v16 = n.akot("algg", akoq(int ), (int)325);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = n.cc - n.akot("algh", akrc(int ), (int)124)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == n.akot("algi", akoq(int ), (int)326)) break;
                    v17 /* !! */  = (long)n.akot("algj", akoq(int ), (int)327);
                }
                ki.outline(var0, var1_1, var2_2, var3_3, (float)v11, (float)v12, (float)v13, n.CONTENT_BORDER_COLOR, (boolean)v16);
                if (var4_6 || var4_6) ** continue;
                return;
            }
            case 0: {
                var5_5 /* !! */  = (int)n.akot("algk", akoq(int ), (int)328);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                var5_5 /* !! */  = (int)n.akot("algl", akoq(int ), (int)329);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl97:
            // 2 sources

            case 2: {
                var5_5 /* !! */  = (int)n.akot("algm", akoq(int ), (int)330);
                if (var6_4) {
                    throw null;
                }
            }
lbl101:
            // 4 sources

            case 3: {
                var5_5 /* !! */  = (int)n.akot("algn", akoq(int ), (int)331);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl106:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)n.akot("algo", akoq(int ), (int)332);
                    if (var6_4) {
                        throw null;
                    }
                    ** GOTO lbl116
                    break;
                }
            }
            case 5: {
                var5_5 /* !! */  = (int)n.akot("algp", akoq(int ), (int)333);
                if (!var6_4) ** GOTO lbl97
                throw null;
            }
lbl116:
            // 4 sources

            case 6: {
                var5_5 /* !! */  = (int)n.akot("algq", akoq(int ), (int)334);
                if (!var6_4) ** GOTO lbl101
                throw null;
            }
            case 7: 
        }
        var5_5 /* !! */  = (int)n.akot("algr", akoq(int ), (int)335);
        ** while (!var6_4)
lbl123:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ancq() {
        n.akos[0] = 1691839659;
        n.akos[1] = -1847618034;
        n.akos[2] = -1289383088;
        n.akos[3] = -1987031760;
        n.akos[4] = 1629281473;
        n.akos[5] = -1135346481;
        n.akos[6] = -294599972;
        n.akos[7] = -910324614;
        n.akos[8] = 1706758986;
        n.akos[9] = -1660952878;
        n.akos[10] = -19431705;
        n.akos[11] = 1404582497;
        n.akos[12] = 712465790;
        n.akos[13] = 1694980245;
        n.akos[14] = 1538144858;
        n.akos[15] = 30050523;
        n.akos[16] = 725706119;
        n.akos[17] = 1093012471;
        n.akos[18] = -1409098053;
        n.akos[19] = 317852680;
        n.akos[20] = -1825256910;
        n.akos[21] = -912756774;
        n.akos[22] = -1380905718;
        n.akos[23] = 1546505332;
        n.akos[24] = 770702819;
        n.akos[25] = -245893628;
        n.akos[26] = -1036445746;
        n.akos[27] = 1193589144;
        n.akos[28] = 1761976522;
        n.akos[29] = -1168561338;
        n.akos[30] = 1464076906;
        n.akos[31] = -1973272410;
        n.akos[32] = 703384148;
        n.akos[33] = 2110338527;
        n.akos[34] = 613437876;
        n.akos[35] = -419492986;
        n.akos[36] = -1171786269;
        n.akos[37] = -1086695903;
        n.akos[38] = -525870649;
        n.akos[39] = 275262491;
        n.akos[40] = 1117882048;
        n.akos[41] = 243617109;
        n.akos[42] = -2105953000;
        n.akos[43] = 89601994;
        n.akos[44] = 1807226704;
        n.akos[45] = 1478479579;
        n.akos[46] = -1526816569;
        n.akos[47] = 556930875;
        n.akos[48] = 1482950533;
        n.akos[49] = 2097569685;
        n.akos[50] = -55510473;
        n.akos[51] = -1557033375;
        n.akos[52] = -1417478505;
        n.akos[53] = 341460870;
        n.akos[54] = -1441400352;
        n.akos[55] = 823771320;
        n.akos[56] = -571649036;
        n.akos[57] = -1480951371;
        n.akos[58] = 1243563875;
        n.akos[59] = 1447048653;
        n.akos[60] = 34159326;
        n.akos[61] = 1364140547;
        n.akos[62] = 164323201;
        n.akos[63] = -739379309;
        n.akos[64] = -613020831;
        n.akos[65] = 326337492;
        n.akos[66] = 506116821;
        n.akos[67] = -1589240644;
        n.akos[68] = -650229027;
        n.akos[69] = -1462590810;
        n.akos[70] = 1749561644;
        n.akos[71] = 1846751999;
        n.akos[72] = -934735281;
        n.akos[73] = 1307886583;
        n.akos[74] = 1347519618;
        n.akos[75] = -1142929054;
        n.akos[76] = -2051836124;
        n.akos[77] = 976145307;
        n.akos[78] = 647458606;
        n.akos[79] = -464377173;
        n.akos[80] = -241357926;
        n.akos[81] = 1351799612;
        n.akos[82] = 1968944022;
        n.akos[83] = -1349545113;
        n.akos[84] = 1011698331;
        n.akos[85] = -1805136443;
        n.akos[86] = 1135693282;
        n.akos[87] = 770078228;
        n.akos[88] = -1729762109;
        n.akos[89] = 1430642701;
        n.akos[90] = -441829653;
        n.akos[91] = -1965023140;
        n.akos[92] = -2049967881;
        n.akos[93] = -1116979214;
        n.akos[94] = 1723434449;
        n.akos[95] = 1620432504;
        n.akos[96] = -1432704961;
        n.akos[97] = 839881902;
        n.akos[98] = 825718652;
        n.akos[99] = 1842476533;
    }

    private static /* synthetic */ void ancm() {
        n.akor[100] = -771523881;
        n.akor[101] = 895305821;
        n.akor[102] = -491275276;
        n.akor[103] = -870609785;
        n.akor[104] = -471864693;
        n.akor[105] = 44297641;
        n.akor[106] = -581246413;
        n.akor[107] = -1983791305;
        n.akor[108] = -381718933;
        n.akor[109] = -2072658422;
        n.akor[110] = -1251632913;
        n.akor[111] = 141401680;
        n.akor[112] = 1534174046;
        n.akor[113] = -26839980;
        n.akor[114] = 937407586;
        n.akor[115] = -1341696422;
        n.akor[116] = 1023782449;
        n.akor[117] = -430570206;
        n.akor[118] = 2091397573;
        n.akor[119] = -1155147542;
        n.akor[120] = -1349178555;
        n.akor[121] = 2018378081;
        n.akor[122] = 327854031;
        n.akor[123] = -603037847;
        n.akor[124] = 1669217865;
        n.akor[125] = 336566738;
        n.akor[126] = 1672862467;
        n.akor[127] = -1715767588;
        n.akor[128] = -1261069735;
        n.akor[129] = 952931437;
        n.akor[130] = 1052404594;
        n.akor[131] = -776376854;
        n.akor[132] = -200110680;
        n.akor[133] = 1248177797;
        n.akor[134] = 523487573;
        n.akor[135] = 807423162;
        n.akor[136] = -159092714;
        n.akor[137] = 1210922404;
        n.akor[138] = -1364398428;
        n.akor[139] = 2027011778;
        n.akor[140] = -339607409;
        n.akor[141] = 1473566598;
        n.akor[142] = -780827226;
        n.akor[143] = -1633449227;
        n.akor[144] = -1086814149;
        n.akor[145] = -602280754;
        n.akor[146] = 1630764115;
        n.akor[147] = 881164845;
        n.akor[148] = 956945340;
        n.akor[149] = -1640773707;
        n.akor[150] = -347590927;
        n.akor[151] = 1010568501;
        n.akor[152] = 751133008;
        n.akor[153] = -12860602;
        n.akor[154] = -1512070087;
        n.akor[155] = -1808354939;
        n.akor[156] = 1887061672;
        n.akor[157] = -604037958;
        n.akor[158] = -2131522504;
        n.akor[159] = -862175821;
        n.akor[160] = 140817593;
        n.akor[161] = -1238967969;
        n.akor[162] = -688720273;
        n.akor[163] = 1629256161;
        n.akor[164] = -195879624;
        n.akor[165] = 1101151033;
        n.akor[166] = 375058817;
        n.akor[167] = -1011776897;
        n.akor[168] = -1190372553;
        n.akor[169] = -654013361;
        n.akor[170] = -1986294315;
        n.akor[171] = 981021323;
        n.akor[172] = 180448007;
        n.akor[173] = -816890398;
        n.akor[174] = -1738019181;
        n.akor[175] = -495894905;
        n.akor[176] = -1423276731;
        n.akor[177] = -1783781097;
        n.akor[178] = -465082216;
        n.akor[179] = -1469650954;
        n.akor[180] = 2006496830;
        n.akor[181] = 943189374;
        n.akor[182] = 354997395;
        n.akor[183] = 1393911058;
        n.akor[184] = -163430343;
        n.akor[185] = -1842957833;
        n.akor[186] = 421041852;
        n.akor[187] = -881036903;
        n.akor[188] = 799105375;
        n.akor[189] = -1875259210;
        n.akor[190] = 887692826;
        n.akor[191] = -536342489;
        n.akor[192] = 962995021;
        n.akor[193] = 1037072516;
        n.akor[194] = 918315686;
        n.akor[195] = 688443857;
        n.akor[196] = 670361465;
        n.akor[197] = 1652774108;
        n.akor[198] = 566217696;
        n.akor[199] = 1787436360;
    }

    private static /* synthetic */ void anco() {
        n.akor[300] = 1354610375;
        n.akor[301] = -1471688019;
        n.akor[302] = 1625482823;
        n.akor[303] = -1397755478;
        n.akor[304] = 1588476390;
        n.akor[305] = 2046502892;
        n.akor[306] = -1185612786;
        n.akor[307] = -1408638567;
        n.akor[308] = -220688976;
        n.akor[309] = -1885489211;
        n.akor[310] = 736157631;
        n.akor[311] = -1301950709;
        n.akor[312] = -614238143;
        n.akor[313] = -810629334;
        n.akor[314] = -1417908077;
        n.akor[315] = 324729207;
        n.akor[316] = 1434048721;
        n.akor[317] = 709966443;
        n.akor[318] = 428452116;
        n.akor[319] = -1766069499;
        n.akor[320] = 2028763304;
        n.akor[321] = 1000341992;
        n.akor[322] = -1710036476;
        n.akor[323] = 1111110351;
        n.akor[324] = -1856424443;
        n.akor[325] = -65308339;
        n.akor[326] = -656748859;
        n.akor[327] = -1015885658;
        n.akor[328] = -721420351;
        n.akor[329] = -534917337;
        n.akor[330] = -2024413062;
        n.akor[331] = -894668651;
        n.akor[332] = -1362191083;
        n.akor[333] = 1635971499;
        n.akor[334] = -544389117;
        n.akor[335] = -331975893;
        n.akor[336] = 743120641;
        n.akor[337] = -159698839;
        n.akor[338] = 1913341130;
        n.akor[339] = -1306142288;
        n.akor[340] = -918761298;
        n.akor[341] = -960696747;
        n.akor[342] = 1074475538;
        n.akor[343] = 830275325;
        n.akor[344] = 701680111;
        n.akor[345] = -1388564444;
        n.akor[346] = -257567457;
        n.akor[347] = 934003887;
        n.akor[348] = -1212911599;
        n.akor[349] = -1570179357;
        n.akor[350] = -1938062983;
        n.akor[351] = 1528835694;
        n.akor[352] = 1410610224;
        n.akor[353] = -234515357;
        n.akor[354] = -778900501;
        n.akor[355] = -781421826;
        n.akor[356] = 1688380816;
        n.akor[357] = -1328753412;
        n.akor[358] = 1351151797;
        n.akor[359] = 771740233;
        n.akor[360] = -1136527509;
        n.akor[361] = 471169854;
        n.akor[362] = -939631061;
        n.akor[363] = 1635003307;
        n.akor[364] = -1313502475;
        n.akor[365] = 978336504;
        n.akor[366] = 1120910112;
        n.akor[367] = 95907190;
        n.akor[368] = -1130140803;
        n.akor[369] = -1707838711;
        n.akor[370] = -2101350028;
        n.akor[371] = 1923271789;
        n.akor[372] = -1925363444;
        n.akor[373] = -1403894304;
        n.akor[374] = 788291958;
        n.akor[375] = -1963833481;
        n.akor[376] = 1736183687;
        n.akor[377] = -1589988681;
        n.akor[378] = -688525660;
        n.akor[379] = 691166996;
        n.akor[380] = -657588807;
        n.akor[381] = -1187536751;
        n.akor[382] = 2112014717;
        n.akor[383] = 2099530213;
        n.akor[384] = -132325560;
        n.akor[385] = 1549634624;
        n.akor[386] = 1265206246;
        n.akor[387] = 2011396969;
        n.akor[388] = 411039787;
        n.akor[389] = 827455444;
        n.akor[390] = -751963539;
        n.akor[391] = 1247669847;
        n.akor[392] = 96063611;
        n.akor[393] = 96153858;
        n.akor[394] = -826643184;
        n.akor[395] = -2097144380;
        n.akor[396] = 729990490;
        n.akor[397] = -996812359;
        n.akor[398] = -677583780;
        n.akor[399] = -829947807;
    }

    private static /* synthetic */ void ancv() {
        n.akrd[0] = 3569292393139237757L;
        n.akrd[1] = 148655554174258346L;
        n.akrd[2] = 524473680259085567L;
        n.akrd[3] = 2371616957456166767L;
        n.akrd[4] = 3503946161335857529L;
        n.akrd[5] = -6289502611450754678L;
        n.akrd[6] = 3377469215792195224L;
        n.akrd[7] = 8174227695209129796L;
        n.akrd[8] = -598047413791270609L;
        n.akrd[9] = -6402176619355379860L;
        n.akrd[10] = -403399415269758772L;
        n.akrd[11] = -3254757924741139484L;
        n.akrd[12] = 8800940882925896408L;
        n.akrd[13] = -3276056016097615489L;
        n.akrd[14] = 3084053437229872792L;
        n.akrd[15] = 8704257384595799464L;
        n.akrd[16] = -1736824232310636363L;
        n.akrd[17] = -7236817795625338792L;
        n.akrd[18] = 4012448586053918865L;
        n.akrd[19] = -4593975375184352332L;
        n.akrd[20] = -2129920762353903836L;
        n.akrd[21] = 8149579456732290606L;
        n.akrd[22] = 5457334789669635302L;
        n.akrd[23] = -5469153862638319632L;
        n.akrd[24] = 3185584820362572850L;
        n.akrd[25] = -3427210856793910420L;
        n.akrd[26] = 3213882207816183297L;
        n.akrd[27] = 2304348589240695350L;
        n.akrd[28] = 4015191421098157693L;
        n.akrd[29] = 1666996751245615919L;
        n.akrd[30] = 8360959009256847651L;
        n.akrd[31] = -199451386351144924L;
        n.akrd[32] = 8177147418433662077L;
        n.akrd[33] = 6675446410771314224L;
        n.akrd[34] = -8008332419403279707L;
        n.akrd[35] = 2368239388437573817L;
        n.akrd[36] = 2476336006478296744L;
        n.akrd[37] = -774558343681052143L;
        n.akrd[38] = -5592200958892047688L;
        n.akrd[39] = 4296330787592818020L;
        n.akrd[40] = -2626052907566978744L;
        n.akrd[41] = 6772010820882983187L;
        n.akrd[42] = -7895639305655792118L;
        n.akrd[43] = 739762909551312066L;
        n.akrd[44] = -8976760840283304956L;
        n.akrd[45] = 7070575664476072482L;
        n.akrd[46] = 1965154545251096267L;
        n.akrd[47] = 6685620179261891322L;
        n.akrd[48] = 144372509891419175L;
        n.akrd[49] = -6118261562966797552L;
        n.akrd[50] = 8552235466411539331L;
        n.akrd[51] = 8080642155290553235L;
        n.akrd[52] = -3373095223191811109L;
        n.akrd[53] = -5853716588773451121L;
        n.akrd[54] = 8165545000577831818L;
        n.akrd[55] = -7878783496519936983L;
        n.akrd[56] = -1754413493705228599L;
        n.akrd[57] = 4045866613229459112L;
        n.akrd[58] = 3245715391200749482L;
        n.akrd[59] = 8144373662082250719L;
        n.akrd[60] = -4989995032444908552L;
        n.akrd[61] = 4396094004400105003L;
        n.akrd[62] = 466533455687553458L;
        n.akrd[63] = 1613506675170981536L;
        n.akrd[64] = 9223081302692264508L;
        n.akrd[65] = 539429353635232757L;
        n.akrd[66] = -3667664330664030661L;
        n.akrd[67] = -3668722003859013953L;
        n.akrd[68] = -4504819304816527725L;
        n.akrd[69] = 6662833561446063729L;
        n.akrd[70] = -6034545189404814912L;
        n.akrd[71] = 2689023398100764799L;
        n.akrd[72] = -372310201089308839L;
        n.akrd[73] = 9071530079811697121L;
        n.akrd[74] = 4256696160125468027L;
        n.akrd[75] = -1321354851078792374L;
        n.akrd[76] = -6409891267527074611L;
        n.akrd[77] = 8629560137496199027L;
        n.akrd[78] = 2451102084745372485L;
        n.akrd[79] = -8514662102318864056L;
        n.akrd[80] = 2236978695311843720L;
        n.akrd[81] = 780697535091256661L;
        n.akrd[82] = 8979329087870180196L;
        n.akrd[83] = -5372943550982387319L;
        n.akrd[84] = -6577346916024339699L;
        n.akrd[85] = -6000089302888831411L;
        n.akrd[86] = 2226854821926188353L;
        n.akrd[87] = 1306386312847827293L;
        n.akrd[88] = 8336494171228458485L;
        n.akrd[89] = 6165940098792420747L;
        n.akrd[90] = -1306405205966831400L;
        n.akrd[91] = -7353833458191781390L;
        n.akrd[92] = -6216006884648413508L;
        n.akrd[93] = 6159308628180630870L;
        n.akrd[94] = 7448606000184958075L;
        n.akrd[95] = 2194855757829300598L;
        n.akrd[96] = -2113106560808484826L;
        n.akrd[97] = -8906642157575531920L;
        n.akrd[98] = 2881615293866253143L;
        n.akrd[99] = 7965390795758755664L;
    }

    private static /* synthetic */ void ancs() {
        n.akos[200] = 201821191;
        n.akos[201] = 1133685731;
        n.akos[202] = 660985479;
        n.akos[203] = -1828604826;
        n.akos[204] = -182927476;
        n.akos[205] = -1262084222;
        n.akos[206] = -112261826;
        n.akos[207] = -1368485566;
        n.akos[208] = -1426744521;
        n.akos[209] = 614853861;
        n.akos[210] = 1377455271;
        n.akos[211] = 525374088;
        n.akos[212] = 1988333454;
        n.akos[213] = -1388849961;
        n.akos[214] = -138595992;
        n.akos[215] = -1870988802;
        n.akos[216] = 245574651;
        n.akos[217] = -1017084089;
        n.akos[218] = 858861183;
        n.akos[219] = -1710252310;
        n.akos[220] = 1081980402;
        n.akos[221] = -112993688;
        n.akos[222] = 911632677;
        n.akos[223] = -792297217;
        n.akos[224] = -1765398165;
        n.akos[225] = 17734361;
        n.akos[226] = 1373232505;
        n.akos[227] = 2079566714;
        n.akos[228] = 479853615;
        n.akos[229] = -35664391;
        n.akos[230] = -561643917;
        n.akos[231] = -2083894766;
        n.akos[232] = 26960958;
        n.akos[233] = -1242668471;
        n.akos[234] = -1608280978;
        n.akos[235] = 675999130;
        n.akos[236] = 1034956524;
        n.akos[237] = 1362861304;
        n.akos[238] = 594879173;
        n.akos[239] = 1550958279;
        n.akos[240] = -102823266;
        n.akos[241] = -418905841;
        n.akos[242] = -1617766861;
        n.akos[243] = -1545645378;
        n.akos[244] = 1213877981;
        n.akos[245] = -2061952618;
        n.akos[246] = -1453863649;
        n.akos[247] = 388633686;
        n.akos[248] = -1488941114;
        n.akos[249] = -1616731111;
        n.akos[250] = 64194087;
        n.akos[251] = -2137859466;
        n.akos[252] = 1467452404;
        n.akos[253] = 286679561;
        n.akos[254] = -190228080;
        n.akos[255] = 1166986139;
        n.akos[256] = 787253157;
        n.akos[257] = -774319524;
        n.akos[258] = 1560392639;
        n.akos[259] = 199541646;
        n.akos[260] = 1746125416;
        n.akos[261] = 1256613948;
        n.akos[262] = 572541548;
        n.akos[263] = 1981155358;
        n.akos[264] = -1583719147;
        n.akos[265] = 23996722;
        n.akos[266] = 1988447878;
        n.akos[267] = 1728558866;
        n.akos[268] = -891196080;
        n.akos[269] = -1376613523;
        n.akos[270] = 41824903;
        n.akos[271] = 1616744287;
        n.akos[272] = -510154293;
        n.akos[273] = -810052591;
        n.akos[274] = -673086711;
        n.akos[275] = 867027902;
        n.akos[276] = -2050281218;
        n.akos[277] = 717730759;
        n.akos[278] = 25842778;
        n.akos[279] = -670510775;
        n.akos[280] = -1464322061;
        n.akos[281] = -524512737;
        n.akos[282] = -1328812053;
        n.akos[283] = -812212394;
        n.akos[284] = 1663582786;
        n.akos[285] = -207636246;
        n.akos[286] = -372853355;
        n.akos[287] = 328805706;
        n.akos[288] = -1985343238;
        n.akos[289] = -376932421;
        n.akos[290] = 415179319;
        n.akos[291] = -1214988278;
        n.akos[292] = -637645043;
        n.akos[293] = -230305428;
        n.akos[294] = 1068794897;
        n.akos[295] = 365295968;
        n.akos[296] = -820850065;
        n.akos[297] = 498031467;
        n.akos[298] = 2023521899;
        n.akos[299] = 1149126111;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String displayCoordinate(double var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("albs", akrc(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == n.akot("albt", akoq(int ), (int)256)) break;
            v0 /* !! */  = (long)n.akot("albu", akoq(int ), (int)257);
        }
        var4_1 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("albv", akrc(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == n.akot("albw", akoq(int ), (int)258)) break;
            v1 /* !! */  = (long)n.akot("albx", akoq(int ), (int)259);
        }
        var3_2 /* !! */  = n.b;
        v2 /* !! */  = n.cc;
        if (true) ** GOTO lbl17
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - n.akot("alby", akrc(int ), (int)77));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1058788206: {
                    v3 = n.akot("albz", akrc(int ), (int)78);
                    continue block40;
                }
                case 1285938033: {
                    v3 = n.akot("alca", akrc(int ), (int)79);
                    continue block40;
                }
                case 1458872073: {
                    v3 = n.akot("alcb", akrc(int ), (int)80);
                    continue block40;
                }
                case 1544320920: {
                    break block40;
                }
            }
            break;
        }
        var2_3 = n.a;
        if (var4_1) {
            throw null;
lbl32:
            // 4 sources

            return null;
        }
        if (var2_3) ** GOTO lbl32
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl32
                v4 /* !! */  = n.cc;
                if (true) ** GOTO lbl43
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - n.akot("alcc", akrc(int ), (int)81));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1952931989: {
                            v5 = n.akot("alcd", akrc(int ), (int)82);
                            continue block42;
                        }
                        case 25240710: {
                            v5 = n.akot("alce", akrc(int ), (int)83);
                            continue block42;
                        }
                        case 1544320920: {
                            break block42;
                        }
                    }
                    break;
                }
                v6 = var0 - Math.rint(var0);
                v7 /* !! */  = n.cc;
                if (true) ** GOTO lbl57
                block43: while (true) {
                    v7 /* !! */  = (long)(v8 - n.akot("alcf", akrc(int ), (int)84));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 510347574: {
                            v8 = n.akot("alcg", akrc(int ), (int)85);
                            continue block43;
                        }
                        case 842832014: {
                            v8 = n.akot("alch", akrc(int ), (int)86);
                            continue block43;
                        }
                        case 1544320920: {
                            break block43;
                        }
                        case 1905837535: {
                            v8 = n.akot("alci", akrc(int ), (int)87);
                            continue block43;
                        }
                    }
                    break;
                }
                if (!(Math.abs(v6) < n.akot("alcj", aksr(int ), (int)88))) ** GOTO lbl87
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = n.cc - n.akot("alck", akrc(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == n.akot("alcl", akoq(int ), (int)260)) break;
                    v9 /* !! */  = (long)n.akot("alcm", akoq(int ), (int)261);
                }
                v10 = Math.round(var0);
                v11 /* !! */  = n.cc;
                if (true) ** GOTO lbl81
                block45: while (true) {
                    v11 /* !! */  = (long)(n.akot("alco", akrc(int ), (int)91) - n.akot("alcn", akrc(int ), (int)90));
lbl81:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1544320920: {
                            break block45;
                        }
                        case 1839458381: {
                            continue block45;
                        }
                    }
                    break;
                }
                return Long.toString(v10);
lbl87:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = n.cc - n.akot("alcp", akrc(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == n.akot("alcq", akoq(int ), (int)262)) break;
                    v12 /* !! */  = (long)n.akot("alcr", akoq(int ), (int)263);
                }
                v13 = new Object[1];
                v14 = n.akot("alcs", akoq(int ), (int)264);
                while (true) {
                    if ((v15 = (cfr_temp_4 = n.cc - n.akot("alct", akrc(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 == n.akot("alcu", akoq(int ), (int)265)) break;
                    v15 = 1810390370;
                }
                v13[v14] = var0;
                v16 /* !! */  = n.cc;
                if (true) ** GOTO lbl106
                block48: while (true) {
                    v16 /* !! */  = (long)(v17 - n.akot("alcv", akrc(int ), (int)94));
lbl106:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2004333649: {
                            v17 = n.akot("alcw", akrc(int ), (int)95);
                            continue block48;
                        }
                        case -1228011407: {
                            v17 = n.akot("alcx", akrc(int ), (int)96);
                            continue block48;
                        }
                        case -1227686452: {
                            v17 = n.akot("alcy", akrc(int ), (int)97);
                            continue block48;
                        }
                        case 1544320920: {
                            break block48;
                        }
                    }
                    break;
                }
                return String.format(Locale.ROOT, "%.1f", v13);
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)n.akot("alcz", akoq(int ), (int)266);
                } while (!var4_1);
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)n.akot("alda", akoq(int ), (int)267);
                if (!var4_1) break;
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)n.akot("aldb", akoq(int ), (int)268);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl133:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)n.akot("aldc", akoq(int ), (int)269);
                if (var4_1) {
                    throw null;
                }
            }
lbl137:
            // 4 sources

            case 4: {
                var3_2 /* !! */  = (int)n.akot("aldd", akoq(int ), (int)270);
                if (!var4_1) ** GOTO lbl133
                throw null;
            }
lbl141:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)n.akot("alde", akoq(int ), (int)271);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 6: {
                var3_2 /* !! */  = (int)n.akot("aldf", akoq(int ), (int)272);
                if (!var4_1) ** GOTO lbl141
                throw null;
            }
lbl150:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)n.akot("aldg", akoq(int ), (int)273);
                if (!var4_1) break;
                throw null;
            }
            case 8: 
        }
        do {
            var3_2 /* !! */  = (int)n.akot("aldh", akoq(int ), (int)274);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onGameLeft(ca var1_1) {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(n.akot("akxu", akrc(int ), (int)29) - n.akot("akxt", akrc(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 943179456: {
                    continue block17;
                }
                case 1544320920: {
                    break block17;
                }
            }
            break;
        }
        var4_2 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akxv", akrc(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == n.akot("akxw", akoq(int ), (int)200)) break;
            v1 /* !! */  = (long)n.akot("akxx", akoq(int ), (int)201);
        }
        var3_3 /* !! */  = n.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = n.cc - n.akot("akxy", akrc(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == n.akot("akxz", akoq(int ), (int)202)) break;
            v2 /* !! */  = (long)n.akot("akya", akoq(int ), (int)203);
        }
        var2_4 = n.a;
        if (var4_2) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                v3 /* !! */  = n.cc;
                if (true) ** GOTO lbl38
                block21: while (true) {
                    v3 /* !! */  = (long)(v4 - n.akot("akyb", akrc(int ), (int)32));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 142243815: {
                            v4 = n.akot("akyc", akrc(int ), (int)33);
                            continue block21;
                        }
                        case 1544320920: {
                            break block21;
                        }
                        case 1796874033: {
                            v4 = n.akot("akyd", akrc(int ), (int)34);
                            continue block21;
                        }
                    }
                    break;
                }
                n.disable();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)n.akot("akye", akoq(int ), (int)204);
                if (var4_2) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)n.akot("akyf", akoq(int ), (int)205);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl64
            }
            case 2: {
                var3_3 /* !! */  = (int)n.akot("akyg", akoq(int ), (int)206);
                if (!var4_2) break;
                throw null;
            }
lbl64:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)n.akot("akyh", akoq(int ), (int)207);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)n.akot("akyi", akoq(int ), (int)208);
                    if (!var4_2) ** GOTO lbl64
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)n.akot("akyj", akoq(int ), (int)209);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ancx() {
        n.akre[0] = 6756687469710186071L;
        n.akre[1] = -6149224588997203156L;
        n.akre[2] = -8467965395693562328L;
        n.akre[3] = 9164031762466152587L;
        n.akre[4] = -5210780249763263652L;
        n.akre[5] = -6255815491922013680L;
        n.akre[6] = 2327052950862994018L;
        n.akre[7] = -5986868940577814120L;
        n.akre[8] = 3236930586596937720L;
        n.akre[9] = -2154325182132337745L;
        n.akre[10] = -896271373063346577L;
        n.akre[11] = -2372068507004548562L;
        n.akre[12] = -8125172072091002164L;
        n.akre[13] = 1700671251188661151L;
        n.akre[14] = 4116301187156792131L;
        n.akre[15] = -1045795068419613423L;
        n.akre[16] = 6666542325170829105L;
        n.akre[17] = 7921256002554606890L;
        n.akre[18] = 8644893384013717649L;
        n.akre[19] = -4085601760877832696L;
        n.akre[20] = -2440303592051035982L;
        n.akre[21] = -449180716823143072L;
        n.akre[22] = -6568942644958902058L;
        n.akre[23] = 770193447572021032L;
        n.akre[24] = -275697613828277372L;
        n.akre[25] = 8407335157271869019L;
        n.akre[26] = -683954880231942123L;
        n.akre[27] = 4040796743932263146L;
        n.akre[28] = 2537600233195854835L;
        n.akre[29] = -474442896479960154L;
        n.akre[30] = 6584943793311485177L;
        n.akre[31] = -3675459448484577663L;
        n.akre[32] = 5395995529391505435L;
        n.akre[33] = -3076485301401100105L;
        n.akre[34] = -2566057071062153290L;
        n.akre[35] = -2404102274477517674L;
        n.akre[36] = 8242708008196265195L;
        n.akre[37] = -6407391249516563054L;
        n.akre[38] = -3200831295387657646L;
        n.akre[39] = -3729002747737209452L;
        n.akre[40] = 4694562554117267492L;
        n.akre[41] = -439149451640264743L;
        n.akre[42] = -5828568096579198984L;
        n.akre[43] = -6283636022550713288L;
        n.akre[44] = 4943852132062805139L;
        n.akre[45] = -1630904284234771558L;
        n.akre[46] = 4114880206263415099L;
        n.akre[47] = 2605477932326625179L;
        n.akre[48] = 8835996132168681841L;
        n.akre[49] = 1130586839695569043L;
        n.akre[50] = 6202309835283936864L;
        n.akre[51] = -5480685774530940811L;
        n.akre[52] = -4140623205783869214L;
        n.akre[53] = -7917527451202805067L;
        n.akre[54] = 3970179808504546763L;
        n.akre[55] = 2398489419357147113L;
        n.akre[56] = -2862062396010646279L;
        n.akre[57] = -3916951469230596967L;
        n.akre[58] = -1563489662216444734L;
        n.akre[59] = 8309086466019094155L;
        n.akre[60] = -3761821270527623565L;
        n.akre[61] = 4231678628471324922L;
        n.akre[62] = 230688801803429029L;
        n.akre[63] = 2994804775144424123L;
        n.akre[64] = -2156044929155802880L;
        n.akre[65] = -2738316464730230514L;
        n.akre[66] = 3781352091113415951L;
        n.akre[67] = -4610911503417603118L;
        n.akre[68] = -9068795193077320571L;
        n.akre[69] = 2575648089428285384L;
        n.akre[70] = 5295426477046057012L;
        n.akre[71] = -7660046928118517629L;
        n.akre[72] = -767727257372330924L;
        n.akre[73] = -4311643329416170538L;
        n.akre[74] = -7240940105825630237L;
        n.akre[75] = -596921823377979136L;
        n.akre[76] = 6114192214289881869L;
        n.akre[77] = -8219849928675287622L;
        n.akre[78] = 8791557283219485066L;
        n.akre[79] = -405161618323472187L;
        n.akre[80] = -1229521117567815112L;
        n.akre[81] = 8961939072947265899L;
        n.akre[82] = 1975719448378940920L;
        n.akre[83] = -7237052539349713431L;
        n.akre[84] = -8141847248976340795L;
        n.akre[85] = -9069987566886773441L;
        n.akre[86] = -3961473809586452073L;
        n.akre[87] = -2013962670912114890L;
        n.akre[88] = 5539795922736538633L;
        n.akre[89] = -22721380986378076L;
        n.akre[90] = 9189005056965926894L;
        n.akre[91] = 2896883802713931002L;
        n.akre[92] = -7092730014045770289L;
        n.akre[93] = 4751392534024607624L;
        n.akre[94] = -6742693962390258123L;
        n.akre[95] = -1807118736937715112L;
        n.akre[96] = 6916797138629980215L;
        n.akre[97] = 4344937472247577454L;
        n.akre[98] = 6796202203089755901L;
        n.akre[99] = -5066454899313713312L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String format(double var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("alax", akrc(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == n.akot("alay", akoq(int ), (int)245)) break;
            v0 /* !! */  = (long)n.akot("alaz", akoq(int ), (int)246);
        }
        var4_1 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("alba", akrc(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == n.akot("albb", akoq(int ), (int)247)) break;
            v1 /* !! */  = (long)n.akot("albc", akoq(int ), (int)248);
        }
        var3_2 /* !! */  = n.b;
        v2 /* !! */  = n.cc;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - n.akot("albd", akrc(int ), (int)67));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 549785982: {
                    v3 = n.akot("albe", akrc(int ), (int)68);
                    continue block21;
                }
                case 942202659: {
                    v3 = n.akot("albf", akrc(int ), (int)69);
                    continue block21;
                }
                case 1544320920: {
                    break block21;
                }
            }
            break;
        }
        var2_3 = n.a;
        if (var4_1) {
            throw null;
            return null;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = n.cc - n.akot("albg", akrc(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == n.akot("albh", akoq(int ), (int)249)) break;
                    v4 /* !! */  = (long)n.akot("albi", akoq(int ), (int)250);
                }
                v5 = new Object[1];
                v6 = n.akot("albj", akoq(int ), (int)251);
                v7 /* !! */  = n.cc;
                if (true) ** GOTO lbl49
                block24: while (true) {
                    v7 /* !! */  = (long)(n.akot("albl", akrc(int ), (int)72) - n.akot("albk", akrc(int ), (int)71));
lbl49:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 337186376: {
                            continue block24;
                        }
                        case 1544320920: {
                            break block24;
                        }
                    }
                    break;
                }
                v5[v6] = var0;
                v8 /* !! */  = n.cc;
                if (true) ** GOTO lbl59
                block25: while (true) {
                    v8 /* !! */  = (long)(n.akot("albn", akrc(int ), (int)74) - n.akot("albm", akrc(int ), (int)73));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 12862396: {
                            continue block25;
                        }
                        case 1544320920: {
                            break block25;
                        }
                    }
                    break;
                }
                return String.format(Locale.ROOT, "%.1f", v5);
            }
lbl65:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)n.akot("albo", akoq(int ), (int)252);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl70:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)n.akot("albp", akoq(int ), (int)253);
                if (!var4_1) ** GOTO lbl65
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)n.akot("albq", akoq(int ), (int)254);
                if (!var4_1) ** GOTO lbl70
                throw null;
            }
            case 3: 
        }
        do {
            var3_2 /* !! */  = (int)n.akot("albr", akoq(int ), (int)255);
        } while (!var4_1);
        throw null;
    }

    static {
        akor = new int[437];
        akos = new int[437];
        n.alpe();
        n.ancm();
        n.ancn();
        n.anco();
        n.ancp();
        n.ancq();
        n.ancr();
        n.ancs();
        n.anct();
        n.ancu();
        akrd = new long[185];
        akre = new long[185];
        n.ancv();
        n.ancw();
        n.ancx();
        n.ancy();
        MC = class_310.method_1551();
        BORDER = nd.rgba((int)n.akot("aloc", akoq(int ), (int)421), (int)n.akot("aloe", akoq(int ), (int)422), (int)n.akot("alof", akoq(int ), (int)423), (int)n.akot("alog", akoq(int ), (int)424));
        CONTENT_BORDER_COLOR = nd.rgba((int)n.akot("aloh", akoq(int ), (int)425), (int)n.akot("aloi", akoq(int ), (int)426), (int)n.akot("aloj", akoq(int ), (int)427), (int)n.akot("alok", akoq(int ), (int)428));
        TEXT_COLOR = nd.rgba((int)n.akot("alon", akoq(int ), (int)429), (int)n.akot("alop", akoq(int ), (int)430), (int)n.akot("aloq", akoq(int ), (int)431), (int)n.akot("alos", akoq(int ), (int)432));
        SUFFIX_COLOR = nd.rgba((int)n.akot("alou", akoq(int ), (int)433), (int)n.akot("alov", akoq(int ), (int)434), (int)n.akot("alox", akoq(int ), (int)435), (int)n.akot("alpa", akoq(int ), (int)436));
    }

    private static /* synthetic */ void ancu() {
        n.akos[400] = -369835440;
        n.akos[401] = -1707731474;
        n.akos[402] = -1395088707;
        n.akos[403] = -645701425;
        n.akos[404] = 665219861;
        n.akos[405] = 1167573634;
        n.akos[406] = 1368466111;
        n.akos[407] = -200730659;
        n.akos[408] = 1684798639;
        n.akos[409] = 445955912;
        n.akos[410] = 31396727;
        n.akos[411] = 656269095;
        n.akos[412] = 316509302;
        n.akos[413] = -1526701091;
        n.akos[414] = 507546179;
        n.akos[415] = -1257461345;
        n.akos[416] = -1820845783;
        n.akos[417] = 692217026;
        n.akos[418] = -115562062;
        n.akos[419] = -1798686403;
        n.akos[420] = -576564405;
        n.akos[421] = 872047828;
        n.akos[422] = 1094252924;
        n.akos[423] = 87973285;
        n.akos[424] = -332276311;
        n.akos[425] = 273065819;
        n.akos[426] = -989332710;
        n.akos[427] = -738760488;
        n.akos[428] = 1823594775;
        n.akos[429] = -1434953162;
        n.akos[430] = 1016197355;
        n.akos[431] = 600140101;
        n.akos[432] = -99045671;
        n.akos[433] = -1500822787;
        n.akos[434] = -1121173440;
        n.akos[435] = -2005542289;
        n.akos[436] = -1684693380;
    }

    private static /* synthetic */ double aksr(int n2) {
        return Double.longBitsToDouble(akrd[n2] ^ akre[n2]);
    }

    private static /* synthetic */ float akst(int n2) {
        return Float.intBitsToFloat(akor[n2] ^ akos[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawPanel(class_332 var0, float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("alel", akrc(int ), (int)106)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == n.akot("alem", akoq(int ), (int)296)) break;
            v0 /* !! */  = (long)n.akot("alen", akoq(int ), (int)297);
        }
        var6_4 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("aleo", akrc(int ), (int)107)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == n.akot("alep", akoq(int ), (int)298)) break;
            v1 /* !! */  = (long)n.akot("aleq", akoq(int ), (int)299);
        }
        var5_5 /* !! */  = n.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = n.cc - n.akot("aler", akrc(int ), (int)108)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == n.akot("ales", akoq(int ), (int)300)) break;
            v2 /* !! */  = (long)n.akot("alet", akoq(int ), (int)301);
        }
        var4_6 = n.a;
        if (var6_4) {
            throw null;
lbl24:
            // 3 sources

            return;
        }
        if (var4_6 || var4_6) ** GOTO lbl24
        v3 = n.akot("aleu", akst(int ), (int)302);
        v4 = n.akot("alev", akst(int ), (int)303);
        v5 = n.akot("alew", akst(int ), (int)304);
        v6 = n.akot("alex", akst(int ), (int)305);
        v7 /* !! */  = n.cc;
        if (true) ** GOTO lbl35
        block16: while (true) {
            v7 /* !! */  = (long)(n.akot("alez", akrc(int ), (int)110) - n.akot("aley", akrc(int ), (int)109));
lbl35:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2093712385: {
                    continue block16;
                }
                case 1544320920: {
                    break block16;
                }
            }
            break;
        }
        at.panelWithInnerShadow(var0, var1_1, var2_2, var3_3, (float)v3, (float)v4, 1.0f, (float)v5, (float)v6);
        if (var4_6) ** GOTO lbl24
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_6) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_5 /* !! */  = (int)n.akot("alfa", akoq(int ), (int)306);
                if (var6_4) {
                    throw null;
                }
            }
lbl52:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = (int)n.akot("alfb", akoq(int ), (int)307);
                    if (!var6_4) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var5_5 /* !! */  = (int)n.akot("alfc", akoq(int ), (int)308);
                if (!var6_4) ** GOTO lbl52
                throw null;
            }
            case 3: {
                var5_5 /* !! */  = (int)n.akot("alfd", akoq(int ), (int)309);
                if (!var6_4) break;
                throw null;
            }
            case 4: {
                var5_5 /* !! */  = (int)n.akot("alfe", akoq(int ), (int)310);
                if (!var6_4) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        var5_5 /* !! */  = (int)n.akot("alff", akoq(int ), (int)311);
        ** while (!var6_4)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akrf", akrc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == n.akot("akrg", akoq(int ), (int)60)) break;
            v0 /* !! */  = (long)n.akot("akrh", akoq(int ), (int)61);
        }
        var5_3 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("akri", akrc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == n.akot("akrj", akoq(int ), (int)62)) break;
            v1 /* !! */  = (long)n.akot("akrk", akoq(int ), (int)63);
        }
        var4_4 /* !! */  = n.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = n.cc - n.akot("akrl", akrc(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == n.akot("akrm", akoq(int ), (int)64)) break;
            v2 /* !! */  = (long)n.akot("akrn", akoq(int ), (int)65);
        }
        var3_5 = n.a;
        if (var5_3) {
            throw null;
lbl21:
            // 4 sources

            return null;
        }
        if (var3_5) ** GOTO lbl21
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl21
                if (var2_2.length != n.akot("akro", akoq(int ), (int)66)) ** GOTO lbl84
                if (var3_5 || var3_5) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = n.cc - n.akot("akrp", akrc(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == n.akot("akrq", akoq(int ), (int)67)) break;
                    v3 /* !! */  = (long)n.akot("akrr", akoq(int ), (int)68);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = n.cc - n.akot("akrs", akrc(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == n.akot("akrt", akoq(int ), (int)69)) break;
                    v4 /* !! */  = (long)n.akot("akru", akoq(int ), (int)70);
                }
                v5 = new i();
                v6 = var2_2[0];
                v7 /* !! */  = n.cc;
                if (true) ** GOTO lbl46
                block38: while (true) {
                    v7 /* !! */  = (long)(v8 - n.akot("akrv", akrc(int ), (int)5));
lbl46:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1404189754: {
                            v8 = n.akot("akrw", akrc(int ), (int)6);
                            continue block38;
                        }
                        case 1544320920: {
                            break block38;
                        }
                        case 1577949214: {
                            v8 = n.akot("akrx", akrc(int ), (int)7);
                            continue block38;
                        }
                        case 1771877734: {
                            v8 = n.akot("akry", akrc(int ), (int)8);
                            continue block38;
                        }
                    }
                    break;
                }
                v9 = v5.filterPrefix(v6);
                v10 = new String[]{"off", "info"};
                v11 /* !! */  = n.cc;
                if (true) ** GOTO lbl64
                block39: while (true) {
                    v11 /* !! */  = (long)(v12 - n.akot("akrz", akrc(int ), (int)9));
lbl64:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2097127999: {
                            v12 = n.akot("aksa", akrc(int ), (int)10);
                            continue block39;
                        }
                        case -198285839: {
                            v12 = n.akot("aksb", akrc(int ), (int)11);
                            continue block39;
                        }
                        case 1544320920: {
                            break block39;
                        }
                    }
                    break;
                }
                v13 = v9.append(v10);
                v14 /* !! */  = n.cc;
                if (true) ** GOTO lbl78
                block40: while (true) {
                    v14 /* !! */  = (long)(n.akot("aksd", akrc(int ), (int)13) - n.akot("aksc", akrc(int ), (int)12));
lbl78:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 899850005: {
                            continue block40;
                        }
                        case 1544320920: {
                            break block40;
                        }
                    }
                    break;
                }
                return v13.stream();
lbl84:
                // 1 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v15 /* !! */  = n.cc;
                if (true) ** GOTO lbl90
                block41: while (true) {
                    v15 /* !! */  = (long)(v16 - n.akot("akse", akrc(int ), (int)14));
lbl90:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1703045956: {
                            v16 = n.akot("aksf", akrc(int ), (int)15);
                            continue block41;
                        }
                        case 3319081: {
                            v16 = n.akot("aksg", akrc(int ), (int)16);
                            continue block41;
                        }
                        case 539951466: {
                            v16 = n.akot("aksh", akrc(int ), (int)17);
                            continue block41;
                        }
                        case 1544320920: {
                            break block41;
                        }
                    }
                    break;
                }
                return Stream.empty();
            }
            case 0: {
                var4_4 /* !! */  = (int)n.akot("aksi", akoq(int ), (int)71);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl108:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)n.akot("aksj", akoq(int ), (int)72);
                if (!var5_3) break;
                throw null;
            }
lbl112:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)n.akot("aksk", akoq(int ), (int)73);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl117:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)n.akot("aksl", akoq(int ), (int)74);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl122:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)n.akot("aksm", akoq(int ), (int)75);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl127:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)n.akot("aksn", akoq(int ), (int)76);
                    if (!var5_3) ** GOTO lbl108
                    throw null;
                }
            }
            case 6: {
                var4_4 /* !! */  = (int)n.akot("akso", akoq(int ), (int)77);
                if (!var5_3) ** GOTO lbl122
                throw null;
            }
lbl136:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)n.akot("aksp", akoq(int ), (int)78);
                if (!var5_3) ** GOTO lbl112
                throw null;
            }
            case 8: 
        }
        var4_4 /* !! */  = (int)n.akot("aksq", akoq(int ), (int)79);
        ** while (!var5_3)
lbl143:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float drawText(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, int var5_5) {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - n.akot("almn", akrc(int ), (int)170));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -671481637: {
                    v1 = n.akot("almo", akrc(int ), (int)171);
                    continue block33;
                }
                case 162635405: {
                    v1 = n.akot("almq", akrc(int ), (int)172);
                    continue block33;
                }
                case 1544320920: {
                    break block33;
                }
            }
            break;
        }
        var8_6 = n.c;
        v2 /* !! */  = n.cc;
        if (true) ** GOTO lbl19
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - n.akot("almr", akrc(int ), (int)173));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1868717135: {
                    v3 = n.akot("alms", akrc(int ), (int)174);
                    continue block34;
                }
                case -1353843575: {
                    v3 = n.akot("almt", akrc(int ), (int)175);
                    continue block34;
                }
                case -1184730741: {
                    v3 = n.akot("almu", akrc(int ), (int)176);
                    continue block34;
                }
                case 1544320920: {
                    break block34;
                }
            }
            break;
        }
        var7_7 /* !! */  = n.b;
        v4 /* !! */  = n.cc;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(n.akot("almw", akrc(int ), (int)178) - n.akot("almv", akrc(int ), (int)177));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 773502879: {
                    continue block35;
                }
                case 1544320920: {
                    break block35;
                }
            }
            break;
        }
        var6_8 = n.a;
        if (var8_6) {
            throw null;
lbl44:
            // 2 sources

            return (float)n.akot("almz", akst(int ), (int)411);
        }
        if (var6_8 || var6_8) ** GOTO lbl44
        v5 = n.akot("alna", akst(int ), (int)412);
        v6 = n.akot("alnb", akoq(int ), (int)413);
        v7 /* !! */  = n.cc;
        if (true) ** GOTO lbl53
        block37: while (true) {
            v7 /* !! */  = (long)(v8 - n.akot("alnc", akrc(int ), (int)179));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1929154201: {
                    v8 = n.akot("alnd", akrc(int ), (int)180);
                    continue block37;
                }
                case -967685945: {
                    v8 = n.akot("alng", akrc(int ), (int)181);
                    continue block37;
                }
                case 1544320920: {
                    break block37;
                }
            }
            break;
        }
        kq.text(var0, var1_1, var2_2, var3_3, var4_4, (float)v5, var5_5, (boolean)v6);
        ** while (var6_8 || var6_8)
lbl64:
        // 1 sources

        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = n.akot("alni", akst(int ), (int)414);
                v10 /* !! */  = n.cc;
                if (true) ** GOTO lbl72
                block38: while (true) {
                    v10 /* !! */  = (long)(v11 - n.akot("alnk", akrc(int ), (int)182));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -466521364: {
                            v11 = n.akot("alnm", akrc(int ), (int)183);
                            continue block38;
                        }
                        case 601567778: {
                            v11 = n.akot("alno", akrc(int ), (int)184);
                            continue block38;
                        }
                        case 1544320920: {
                            break block38;
                        }
                    }
                    break;
                }
                return var3_3 + kq.width(var1_1, var2_2, (float)v9);
            }
lbl82:
            // 2 sources

            case 0: {
                var7_7 /* !! */  = (int)n.akot("alns", akoq(int ), (int)415);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 1: {
                var7_7 /* !! */  = (int)n.akot("alnt", akoq(int ), (int)416);
                if (!var8_6) ** GOTO lbl82
                throw null;
            }
            case 2: {
                var7_7 /* !! */  = (int)n.akot("alnu", akoq(int ), (int)417);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl96:
            // 3 sources

            case 3: {
                var7_7 /* !! */  = (int)n.akot("alnx", akoq(int ), (int)418);
                if (var8_6) {
                    throw null;
                }
            }
lbl100:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)n.akot("alnz", akoq(int ), (int)419);
                    if (!var8_6) ** GOTO lbl96
                    throw null;
                }
            }
            case 5: 
        }
        var7_7 /* !! */  = (int)n.akot("aloa", akoq(int ), (int)420);
        ** while (!var8_6)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double getTargetZ() {
        Object object = cc;
        block8: while (true) {
            switch ((int)object) {
                case 664623273: {
                    object = n.akot("alaj", akrc(int ), (int)59) - n.akot("alai", akrc(int ), (int)58);
                    continue block8;
                }
                case 1544320920: {
                    break block8;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = cc - n.akot("alak", akrc(int ), (int)60)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == n.akot("alal", akoq(int ), (int)237)) break;
            object2 = n.akot("alam", akoq(int ), (int)238);
        }
        int n2 = b;
        Object object3 = cc;
        block10: while (true) {
            switch ((int)object3) {
                case -1642959098: {
                    object3 = n.akot("alao", akrc(int ), (int)62) - n.akot("alan", akrc(int ), (int)61);
                    continue block10;
                }
                case 1544320920: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (double)n.akot("alap", aksr(int ), (int)63);
        if (bl3) return (double)n.akot("alap", aksr(int ), (int)63);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = cc - n.akot("alaq", akrc(int ), (int)64)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == n.akot("alar", akoq(int ), (int)239)) {
                return targetZ;
            }
            object4 = n.akot("alas", akoq(int ), (int)240);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void disable() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("aldi", akrc(int ), (int)98)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == n.akot("aldj", akoq(int ), (int)275)) break;
            v0 /* !! */  = (long)n.akot("aldk", akoq(int ), (int)276);
        }
        var2 = n.c;
        v1 /* !! */  = n.cc;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - n.akot("aldl", akrc(int ), (int)99));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -995559618: {
                    v2 = n.akot("aldm", akrc(int ), (int)100);
                    continue block18;
                }
                case 932852472: {
                    v2 = n.akot("aldn", akrc(int ), (int)101);
                    continue block18;
                }
                case 1544320920: {
                    break block18;
                }
            }
            break;
        }
        var1_1 /* !! */  = n.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = n.cc - n.akot("aldo", akrc(int ), (int)102)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == n.akot("aldp", akoq(int ), (int)277)) break;
            v3 /* !! */  = (long)n.akot("aldq", akoq(int ), (int)278);
        }
        var0_2 = n.a;
        if (var2) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        v4 = n.akot("aldr", akoq(int ), (int)279);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = n.cc - n.akot("alds", akrc(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == n.akot("aldt", akoq(int ), (int)280)) break;
            v5 /* !! */  = (long)n.akot("aldu", akoq(int ), (int)281);
        }
        n.enabled = v4;
        if (var0_2 || var0_2) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = n.cc - n.akot("aldv", akrc(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == n.akot("aldw", akoq(int ), (int)282)) break;
            v6 /* !! */  = (long)n.akot("aldx", akoq(int ), (int)283);
        }
        n.targetX = 0.0;
        if (var0_2 || var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = n.cc - n.akot("aldy", akrc(int ), (int)105)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == n.akot("aldz", akoq(int ), (int)284)) break;
                    v7 /* !! */  = (long)n.akot("alea", akoq(int ), (int)285);
                }
                n.targetZ = 0.0;
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl58:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)n.akot("aleb", akoq(int ), (int)286);
                if (!var2) break;
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)n.akot("alec", akoq(int ), (int)287);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)n.akot("aled", akoq(int ), (int)288);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl72:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)n.akot("alee", akoq(int ), (int)289);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl77:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)n.akot("alef", akoq(int ), (int)290);
                if (!var2) break;
                throw null;
            }
lbl81:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)n.akot("aleg", akoq(int ), (int)291);
                    if (!var2) ** GOTO lbl72
                    throw null;
                }
            }
            case 6: {
                var1_1 /* !! */  = (int)n.akot("aleh", akoq(int ), (int)292);
                if (!var2) ** GOTO lbl77
                throw null;
            }
lbl90:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)n.akot("alei", akoq(int ), (int)293);
                if (!var2) ** GOTO lbl58
                throw null;
            }
lbl94:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)n.akot("alej", akoq(int ), (int)294);
                if (!var2) ** GOTO lbl81
                throw null;
            }
            case 9: 
        }
        var1_1 /* !! */  = (int)n.akot("alek", akoq(int ), (int)295);
        ** while (!var2)
lbl101:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void anct() {
        n.akos[300] = 1354610374;
        n.akos[301] = -471904432;
        n.akos[302] = 560989344;
        n.akos[303] = -333452331;
        n.akos[304] = 531600635;
        n.akos[305] = 1189637808;
        n.akos[306] = -1185612788;
        n.akos[307] = -1408638567;
        n.akos[308] = -220688976;
        n.akos[309] = -1885489216;
        n.akos[310] = 736157630;
        n.akos[311] = -1301950706;
        n.akos[312] = -614238144;
        n.akos[313] = -760073781;
        n.akos[314] = -367476394;
        n.akos[315] = 1406855730;
        n.akos[316] = 1434048707;
        n.akos[317] = 709966442;
        n.akos[318] = -991606155;
        n.akos[319] = -1766069499;
        n.akos[320] = -2028763305;
        n.akos[321] = 920893696;
        n.akos[322] = -613000255;
        n.akos[323] = 45752714;
        n.akos[324] = -1369889472;
        n.akos[325] = -65308339;
        n.akos[326] = 656748858;
        n.akos[327] = 1166400427;
        n.akos[328] = -721420346;
        n.akos[329] = -534917340;
        n.akos[330] = -2024413059;
        n.akos[331] = -894668655;
        n.akos[332] = -1362191083;
        n.akos[333] = 1635971500;
        n.akos[334] = -544389115;
        n.akos[335] = -331975893;
        n.akos[336] = 743120640;
        n.akos[337] = 342002908;
        n.akos[338] = 1913341131;
        n.akos[339] = 1210603175;
        n.akos[340] = -918761298;
        n.akos[341] = 960696746;
        n.akos[342] = -996729791;
        n.akos[343] = 1908482524;
        n.akos[344] = 701680110;
        n.akos[345] = 661840915;
        n.akos[346] = -257567458;
        n.akos[347] = -140138672;
        n.akos[348] = -149033291;
        n.akos[349] = -494123226;
        n.akos[350] = -1938062984;
        n.akos[351] = -2021981983;
        n.akos[352] = 1796486192;
        n.akos[353] = -234515300;
        n.akos[354] = -778900501;
        n.akos[355] = -781421833;
        n.akos[356] = 1688380807;
        n.akos[357] = -1328753436;
        n.akos[358] = 1351151776;
        n.akos[359] = 771740229;
        n.akos[360] = -1136527489;
        n.akos[361] = 471169841;
        n.akos[362] = -939631069;
        n.akos[363] = 1635003307;
        n.akos[364] = -1313502489;
        n.akos[365] = 978336488;
        n.akos[366] = 1120910132;
        n.akos[367] = 95907193;
        n.akos[368] = -1130140824;
        n.akos[369] = -1707838716;
        n.akos[370] = -2101350025;
        n.akos[371] = 1923271803;
        n.akos[372] = -1925363436;
        n.akos[373] = -1403894286;
        n.akos[374] = 788291943;
        n.akos[375] = -1963833475;
        n.akos[376] = 1736183703;
        n.akos[377] = -1589988674;
        n.akos[378] = -688525649;
        n.akos[379] = 691166993;
        n.akos[380] = -657588808;
        n.akos[381] = 1147864463;
        n.akos[382] = -2112014718;
        n.akos[383] = -348452004;
        n.akos[384] = 132325559;
        n.akos[385] = 1434946415;
        n.akos[386] = 1970419222;
        n.akos[387] = 2011396953;
        n.akos[388] = -411039788;
        n.akos[389] = -453314687;
        n.akos[390] = -332533139;
        n.akos[391] = -1247669848;
        n.akos[392] = 1391954744;
        n.akos[393] = -96153859;
        n.akos[394] = -31733036;
        n.akos[395] = -1140843068;
        n.akos[396] = 729990495;
        n.akos[397] = -996812354;
        n.akos[398] = -677583788;
        n.akos[399] = -829947795;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldChange(dh var1_1) {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - n.akot("akxa", akrc(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1010147757: {
                    v1 = n.akot("akxb", akrc(int ), (int)20);
                    continue block19;
                }
                case 1544320920: {
                    break block19;
                }
                case 1880339683: {
                    v1 = n.akot("akxc", akrc(int ), (int)21);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = n.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akxd", akrc(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == n.akot("akxe", akoq(int ), (int)190)) break;
            v2 /* !! */  = (long)n.akot("akxf", akoq(int ), (int)191);
        }
        var3_3 /* !! */  = n.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = n.cc - n.akot("akxg", akrc(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == n.akot("akxh", akoq(int ), (int)192)) break;
            v3 /* !! */  = (long)n.akot("akxi", akoq(int ), (int)193);
        }
        var2_4 = n.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = n.cc;
        if (true) ** GOTO lbl38
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - n.akot("akxj", akrc(int ), (int)24));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -608760116: {
                    v5 = n.akot("akxk", akrc(int ), (int)25);
                    continue block23;
                }
                case 161177925: {
                    v5 = n.akot("akxl", akrc(int ), (int)26);
                    continue block23;
                }
                case 1372025391: {
                    v5 = n.akot("akxm", akrc(int ), (int)27);
                    continue block23;
                }
                case 1544320920: {
                    break block23;
                }
            }
            break;
        }
        n.disable();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)n.akot("akxn", akoq(int ), (int)194);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                var3_3 /* !! */  = (int)n.akot("akxo", akoq(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)n.akot("akxp", akoq(int ), (int)196);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
            }
lbl70:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)n.akot("akxq", akoq(int ), (int)197);
                } while (!var4_2);
                throw null;
            }
lbl75:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)n.akot("akxr", akoq(int ), (int)198);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)n.akot("akxs", akoq(int ), (int)199);
        ** while (!var4_2)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        block179: {
            block178: {
                block177: {
                    block176: {
                        block175: {
                            var22_2 = n.c;
                            var21_3 /* !! */  = n.b;
                            var20_4 = n.a;
                            if (var22_2) {
                                throw null;
lbl6:
                                // 47 sources

                                return;
                            }
                            if (var20_4 || var20_4) ** GOTO lbl6
                            if (!n.enabled) break block175;
                            if (var20_4) ** GOTO lbl6
                            if (n.MC.field_1724 == null) break block175;
                            if (var20_4) ** GOTO lbl6
                            if (n.MC.field_1687 != null) break block176;
                            if (var20_4) ** GOTO lbl6
                        }
                        if (var20_4 || var20_4) ** GOTO lbl6
                        return;
                    }
                    if (var20_4 || var20_4) ** GOTO lbl6
                    if (op.project(n.targetX, (double)n.akot("akss", aksr(int ), (int)18), n.targetZ, this.projected)) break block177;
                    if (var20_4) ** GOTO lbl6
                    return;
                }
                if (var20_4 || var20_4) ** GOTO lbl6
                kq.hasFonts();
                if (var20_4 || var20_4) ** GOTO lbl6
                if (kv.INTER_SEMIBOLD == null) break block178;
                if (var20_4 || var20_4) ** GOTO lbl6
                v0 = kv.INTER_SEMIBOLD;
                if (var22_2) {
                    throw null;
                }
                break block179;
            }
            if (var20_4 || var20_4) ** GOTO lbl6
            v0 = var2_5 = kv.getDefault();
        }
        if (var20_4 || var20_4) ** GOTO lbl6
        if (kv.PHOBIA_NEW == null) ** GOTO lbl48
        if (var20_4 || var20_4) ** GOTO lbl6
        if (var21_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var21_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v1 = kv.PHOBIA_NEW;
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl50
            }
lbl48:
            // 1 sources

            if (var20_4 || var20_4) ** GOTO lbl6
            v1 = var3_6 = kv.getDefault();
lbl50:
            // 2 sources

            if (var20_4 || var20_4) ** GOTO lbl6
            if (var2_5 == null) ** GOTO lbl55
            if (var20_4) ** GOTO lbl6
            if (var3_6 != null) ** GOTO lbl57
            if (var20_4) ** GOTO lbl6
lbl55:
            // 2 sources

            if (var20_4 || var20_4) ** GOTO lbl6
            return;
lbl57:
            // 1 sources

            if (var20_4 || var20_4) ** GOTO lbl6
            var4_7 = Math.round(Math.hypot(n.MC.field_1724.method_23317() - n.targetX, n.MC.field_1724.method_23321() - n.targetZ));
            if (var20_4 || var20_4) ** GOTO lbl6
            var6_8 = n.displayCoordinate(n.targetX);
            if (var20_4 || var20_4) ** GOTO lbl6
            var7_9 = n.displayCoordinate(n.targetZ);
            if (var20_4 || var20_4) ** GOTO lbl6
            var8_10 = Long.toString(var4_7);
            if (var20_4 || var20_4) ** GOTO lbl6
            var9_11 = "\u041c\u0435\u0442\u043a\u0430 \u043d\u0430 x" + var6_8 + " z" + var7_9 + " / " + var8_10 + "m";
            if (var20_4 || var20_4) ** GOTO lbl6
            var10_12 = kq.width(var2_5, var9_11, (float)n.akot("aksu", akst(int ), (int)80));
            if (var20_4 || var20_4) ** GOTO lbl6
            var11_13 = var10_12 + n.akot("aksv", akst(int ), (int)81);
            if (var20_4 || var20_4) ** GOTO lbl6
            var12_14 = n.akot("aksw", akst(int ), (int)82) + var11_13;
            if (var20_4 || var20_4) ** GOTO lbl6
            var13_15 = this.projected.x - var12_14 * n.akot("aksx", akst(int ), (int)83);
            if (var20_4 || var20_4) ** GOTO lbl6
            var14_16 = this.projected.y - n.akot("aksy", akst(int ), (int)84);
            if (var20_4 || var20_4) ** GOTO lbl6
            n.drawPanel(var1_1.getDrawContext(), var13_15, var14_16, (float)var12_14);
            if (var20_4 || var20_4) ** GOTO lbl6
            var15_17 = var14_16 + n.akot("aksz", akst(int ), (int)85);
            if (var20_4 || var20_4) ** GOTO lbl6
            var16_18 = var13_15 + n.akot("akta", akst(int ), (int)86);
            if (var20_4 || var20_4) ** GOTO lbl6
            var17_19 = var16_18 + n.akot("aktb", akst(int ), (int)87) + n.akot("aktc", akst(int ), (int)88);
            if (var20_4 || var20_4) ** GOTO lbl6
            n.drawContent(var1_1.getDrawContext(), var16_18, var15_17, (float)n.akot("aktd", akst(int ), (int)89));
            if (var20_4 || var20_4) ** GOTO lbl6
            n.drawContent(var1_1.getDrawContext(), var17_19, var15_17, var11_13);
            if (var20_4 || var20_4) ** GOTO lbl6
            n.drawIcon(var1_1.getDrawContext(), var3_6, var16_18, var15_17);
            if (var20_4 || var20_4) ** GOTO lbl6
            var18_20 = n.centeredTextY(var2_5, (float)n.akot("akte", akst(int ), (int)90), var15_17 + n.akot("aktf", akst(int ), (int)91));
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = var17_19 + n.akot("aktg", akst(int ), (int)92);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, "\u041c\u0435\u0442\u043a\u0430 \u043d\u0430 ", var19_21, var18_20, n.TEXT_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, "x", var19_21, var18_20, n.SUFFIX_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, var6_8, var19_21, var18_20, n.TEXT_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, " z", var19_21, var18_20, n.SUFFIX_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, var7_9, var19_21, var18_20, n.TEXT_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, " / ", var19_21, var18_20, n.SUFFIX_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            var19_21 = n.drawText(var1_1.getDrawContext(), var2_5, var8_10, var19_21, var18_20, n.TEXT_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            n.drawText(var1_1.getDrawContext(), var2_5, "m", var19_21, var18_20, n.SUFFIX_COLOR);
            if (var20_4 || var20_4) ** GOTO lbl6
            ki.outline(var1_1.getDrawContext(), var13_15, var14_16, (float)var12_14, (float)n.akot("akth", akst(int ), (int)93), (float)n.akot("akti", akst(int ), (int)94), (float)n.akot("aktj", akst(int ), (int)95), n.BORDER, (boolean)n.akot("aktk", akoq(int ), (int)96));
            if (!var20_4 && !var20_4) ** break;
            ** continue;
            return;
lbl117:
            // 5 sources

            case 0: {
                var21_3 /* !! */  = (int)n.akot("aktl", akoq(int ), (int)97);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl459
            }
            case 1: {
                var21_3 /* !! */  = (int)n.akot("aktm", akoq(int ), (int)98);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl127:
            // 3 sources

            case 2: {
                var21_3 /* !! */  = (int)n.akot("aktn", akoq(int ), (int)99);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 3: {
                var21_3 /* !! */  = (int)n.akot("akto", akoq(int ), (int)100);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 4: {
                var21_3 /* !! */  = (int)n.akot("aktp", akoq(int ), (int)101);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl142:
            // 4 sources

            case 5: {
                var21_3 /* !! */  = (int)n.akot("aktq", akoq(int ), (int)102);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl147:
            // 2 sources

            case 6: {
                var21_3 /* !! */  = (int)n.akot("aktr", akoq(int ), (int)103);
                if (!var22_2) ** GOTO lbl117
                throw null;
            }
lbl151:
            // 2 sources

            case 7: {
                var21_3 /* !! */  = (int)n.akot("akts", akoq(int ), (int)104);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl156:
            // 2 sources

            case 8: {
                var21_3 /* !! */  = (int)n.akot("aktt", akoq(int ), (int)105);
                if (!var22_2) ** GOTO lbl142
                throw null;
            }
lbl160:
            // 2 sources

            case 9: {
                var21_3 /* !! */  = (int)n.akot("aktu", akoq(int ), (int)106);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl165:
            // 2 sources

            case 10: {
                var21_3 /* !! */  = (int)n.akot("aktv", akoq(int ), (int)107);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl472
            }
            case 11: {
                var21_3 /* !! */  = (int)n.akot("aktw", akoq(int ), (int)108);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl175:
            // 2 sources

            case 12: {
                var21_3 /* !! */  = (int)n.akot("aktx", akoq(int ), (int)109);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl180:
            // 2 sources

            case 13: {
                var21_3 /* !! */  = (int)n.akot("akty", akoq(int ), (int)110);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl185:
            // 2 sources

            case 14: {
                var21_3 /* !! */  = (int)n.akot("aktz", akoq(int ), (int)111);
                if (var22_2) {
                    throw null;
                }
            }
lbl189:
            // 4 sources

            case 15: {
                var21_3 /* !! */  = (int)n.akot("akua", akoq(int ), (int)112);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl194:
            // 2 sources

            case 16: {
                var21_3 /* !! */  = (int)n.akot("akub", akoq(int ), (int)113);
                if (!var22_2) ** GOTO lbl142
                throw null;
            }
lbl198:
            // 4 sources

            case 17: {
                var21_3 /* !! */  = (int)n.akot("akuc", akoq(int ), (int)114);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl203:
            // 2 sources

            case 18: {
                var21_3 /* !! */  = (int)n.akot("akud", akoq(int ), (int)115);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl208:
            // 2 sources

            case 19: {
                var21_3 /* !! */  = (int)n.akot("akue", akoq(int ), (int)116);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 20: {
                var21_3 /* !! */  = (int)n.akot("akuf", akoq(int ), (int)117);
                if (!var22_2) ** GOTO lbl165
                throw null;
            }
lbl217:
            // 3 sources

            case 21: {
                var21_3 /* !! */  = (int)n.akot("akug", akoq(int ), (int)118);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl496
            }
lbl222:
            // 2 sources

            case 22: {
                var21_3 /* !! */  = (int)n.akot("akuh", akoq(int ), (int)119);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl227:
            // 3 sources

            case 23: {
                var21_3 /* !! */  = (int)n.akot("akui", akoq(int ), (int)120);
                if (!var22_2) ** GOTO lbl194
                throw null;
            }
            case 24: {
                var21_3 /* !! */  = (int)n.akot("akuj", akoq(int ), (int)121);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 25: {
                var21_3 /* !! */  = (int)n.akot("akuk", akoq(int ), (int)122);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl241:
            // 3 sources

            case 26: {
                var21_3 /* !! */  = (int)n.akot("akul", akoq(int ), (int)123);
                if (!var22_2) ** GOTO lbl222
                throw null;
            }
lbl245:
            // 3 sources

            case 27: {
                var21_3 /* !! */  = (int)n.akot("akum", akoq(int ), (int)124);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl250:
            // 2 sources

            case 28: {
                var21_3 /* !! */  = (int)n.akot("akun", akoq(int ), (int)125);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl484
            }
            case 29: {
                var21_3 /* !! */  = (int)n.akot("akuo", akoq(int ), (int)126);
                if (!var22_2) ** GOTO lbl147
                throw null;
            }
            case 30: {
                var21_3 /* !! */  = (int)n.akot("akup", akoq(int ), (int)127);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl264:
            // 2 sources

            case 31: {
                var21_3 /* !! */  = (int)n.akot("akuq", akoq(int ), (int)128);
                if (!var22_2) ** GOTO lbl175
                throw null;
            }
lbl268:
            // 2 sources

            case 32: {
                var21_3 /* !! */  = (int)n.akot("akur", akoq(int ), (int)129);
                if (!var22_2) ** GOTO lbl180
                throw null;
            }
            case 33: {
                var21_3 /* !! */  = (int)n.akot("akus", akoq(int ), (int)130);
                if (var22_2) {
                    throw null;
                }
            }
lbl276:
            // 4 sources

            case 34: {
                var21_3 /* !! */  = (int)n.akot("akut", akoq(int ), (int)131);
                if (!var22_2) ** GOTO lbl117
                throw null;
            }
lbl280:
            // 2 sources

            case 35: {
                var21_3 /* !! */  = (int)n.akot("akuu", akoq(int ), (int)132);
                if (!var22_2) ** GOTO lbl198
                throw null;
            }
            case 36: {
                var21_3 /* !! */  = (int)n.akot("akuv", akoq(int ), (int)133);
                if (!var22_2) ** GOTO lbl217
                throw null;
            }
            case 37: {
                var21_3 /* !! */  = (int)n.akot("akuw", akoq(int ), (int)134);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 38: {
                var21_3 /* !! */  = (int)n.akot("akux", akoq(int ), (int)135);
                if (!var22_2) break;
                throw null;
            }
            case 39: {
                var21_3 /* !! */  = (int)n.akot("akuy", akoq(int ), (int)136);
                if (!var22_2) ** GOTO lbl189
                throw null;
            }
lbl301:
            // 2 sources

            case 40: {
                var21_3 /* !! */  = (int)n.akot("akuz", akoq(int ), (int)137);
                if (!var22_2) break;
                throw null;
            }
lbl305:
            // 4 sources

            case 41: {
                var21_3 /* !! */  = (int)n.akot("akva", akoq(int ), (int)138);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl310:
            // 3 sources

            case 42: {
                var21_3 /* !! */  = (int)n.akot("akvb", akoq(int ), (int)139);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl315:
            // 2 sources

            case 43: {
                var21_3 /* !! */  = (int)n.akot("akvc", akoq(int ), (int)140);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl484
            }
            case 44: {
                var21_3 /* !! */  = (int)n.akot("akvd", akoq(int ), (int)141);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl325:
            // 3 sources

            case 45: {
                var21_3 /* !! */  = (int)n.akot("akve", akoq(int ), (int)142);
                if (!var22_2) ** GOTO lbl127
                throw null;
            }
            case 46: {
                var21_3 /* !! */  = (int)n.akot("akvf", akoq(int ), (int)143);
                if (!var22_2) ** GOTO lbl117
                throw null;
            }
            case 47: {
                var21_3 /* !! */  = (int)n.akot("akvg", akoq(int ), (int)144);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl338:
            // 3 sources

            case 48: {
                var21_3 /* !! */  = (int)n.akot("akvh", akoq(int ), (int)145);
                if (!var22_2) ** GOTO lbl217
                throw null;
            }
            case 49: {
                var21_3 /* !! */  = (int)n.akot("akvi", akoq(int ), (int)146);
                if (!var22_2) ** GOTO lbl241
                throw null;
            }
lbl346:
            // 3 sources

            case 50: {
                var21_3 /* !! */  = (int)n.akot("akvj", akoq(int ), (int)147);
                if (!var22_2) ** GOTO lbl315
                throw null;
            }
            case 51: {
                var21_3 /* !! */  = (int)n.akot("akvk", akoq(int ), (int)148);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl355:
            // 2 sources

            case 52: {
                var21_3 /* !! */  = (int)n.akot("akvl", akoq(int ), (int)149);
                if (!var22_2) ** GOTO lbl151
                throw null;
            }
lbl359:
            // 2 sources

            case 53: {
                var21_3 /* !! */  = (int)n.akot("akvm", akoq(int ), (int)150);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl364:
            // 3 sources

            case 54: {
                var21_3 /* !! */  = (int)n.akot("akvn", akoq(int ), (int)151);
                if (!var22_2) ** GOTO lbl160
                throw null;
            }
lbl368:
            // 5 sources

            case 55: {
                var21_3 /* !! */  = (int)n.akot("akvo", akoq(int ), (int)152);
                if (!var22_2) ** GOTO lbl355
                throw null;
            }
lbl372:
            // 2 sources

            case 56: {
                var21_3 /* !! */  = (int)n.akot("akvp", akoq(int ), (int)153);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 57: {
                var21_3 /* !! */  = (int)n.akot("akvq", akoq(int ), (int)154);
                if (!var22_2) ** GOTO lbl280
                throw null;
            }
            case 58: {
                var21_3 /* !! */  = (int)n.akot("akvr", akoq(int ), (int)155);
                if (!var22_2) ** GOTO lbl276
                throw null;
            }
lbl385:
            // 3 sources

            case 59: {
                var21_3 /* !! */  = (int)n.akot("akvs", akoq(int ), (int)156);
                if (!var22_2) break;
                throw null;
            }
lbl389:
            // 4 sources

            case 60: {
                var21_3 /* !! */  = (int)n.akot("akvt", akoq(int ), (int)157);
                if (!var22_2) ** GOTO lbl305
                throw null;
            }
lbl393:
            // 2 sources

            case 61: {
                var21_3 /* !! */  = (int)n.akot("akvu", akoq(int ), (int)158);
                if (!var22_2) ** GOTO lbl338
                throw null;
            }
lbl397:
            // 2 sources

            case 62: {
                var21_3 /* !! */  = (int)n.akot("akvv", akoq(int ), (int)159);
                if (!var22_2) ** GOTO lbl245
                throw null;
            }
lbl401:
            // 2 sources

            case 63: {
                var21_3 /* !! */  = (int)n.akot("akvw", akoq(int ), (int)160);
                if (!var22_2) ** GOTO lbl185
                throw null;
            }
            case 64: {
                var21_3 /* !! */  = (int)n.akot("akvx", akoq(int ), (int)161);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl455
            }
            case 65: {
                var21_3 /* !! */  = (int)n.akot("akvy", akoq(int ), (int)162);
                if (!var22_2) ** GOTO lbl325
                throw null;
            }
            case 66: {
                var21_3 /* !! */  = (int)n.akot("akvz", akoq(int ), (int)163);
                if (!var22_2) ** GOTO lbl325
                throw null;
            }
            case 67: {
                var21_3 /* !! */  = (int)n.akot("akwa", akoq(int ), (int)164);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl472
            }
lbl423:
            // 4 sources

            case 68: {
                var21_3 /* !! */  = (int)n.akot("akwb", akoq(int ), (int)165);
                if (!var22_2) ** GOTO lbl385
                throw null;
            }
            case 69: {
                var21_3 /* !! */  = (int)n.akot("akwc", akoq(int ), (int)166);
                if (!var22_2) ** GOTO lbl423
                throw null;
            }
            case 70: {
                var21_3 /* !! */  = (int)n.akot("akwd", akoq(int ), (int)167);
                if (!var22_2) ** GOTO lbl397
                throw null;
            }
            case 71: {
                var21_3 /* !! */  = (int)n.akot("akwe", akoq(int ), (int)168);
                if (!var22_2) ** GOTO lbl245
                throw null;
            }
            case 72: {
                var21_3 /* !! */  = (int)n.akot("akwf", akoq(int ), (int)169);
                if (!var22_2) ** GOTO lbl156
                throw null;
            }
lbl443:
            // 2 sources

            case 73: {
                var21_3 /* !! */  = (int)n.akot("akwg", akoq(int ), (int)170);
                if (!var22_2) ** GOTO lbl305
                throw null;
            }
lbl447:
            // 2 sources

            case 74: {
                var21_3 /* !! */  = (int)n.akot("akwh", akoq(int ), (int)171);
                if (!var22_2) ** GOTO lbl227
                throw null;
            }
            case 75: {
                var21_3 /* !! */  = (int)n.akot("akwi", akoq(int ), (int)172);
                if (!var22_2) ** GOTO lbl142
                throw null;
            }
lbl455:
            // 4 sources

            case 76: {
                var21_3 /* !! */  = (int)n.akot("akwj", akoq(int ), (int)173);
                if (!var22_2) ** GOTO lbl368
                throw null;
            }
lbl459:
            // 2 sources

            case 77: {
                var21_3 /* !! */  = (int)n.akot("akwk", akoq(int ), (int)174);
                if (!var22_2) ** GOTO lbl423
                throw null;
            }
            case 78: {
                var21_3 /* !! */  = (int)n.akot("akwl", akoq(int ), (int)175);
                if (var22_2) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 79: {
                var21_3 /* !! */  = (int)n.akot("akwm", akoq(int ), (int)176);
                if (!var22_2) ** GOTO lbl127
                throw null;
            }
lbl472:
            // 3 sources

            case 80: {
                var21_3 /* !! */  = (int)n.akot("akwn", akoq(int ), (int)177);
                if (!var22_2) ** GOTO lbl310
                throw null;
            }
            case 81: {
                var21_3 /* !! */  = (int)n.akot("akwo", akoq(int ), (int)178);
                if (!var22_2) ** GOTO lbl443
                throw null;
            }
            case 82: {
                var21_3 /* !! */  = (int)n.akot("akwp", akoq(int ), (int)179);
                if (!var22_2) ** GOTO lbl117
                throw null;
            }
lbl484:
            // 4 sources

            case 83: {
                var21_3 /* !! */  = (int)n.akot("akwq", akoq(int ), (int)180);
                if (!var22_2) ** GOTO lbl305
                throw null;
            }
            case 84: {
                var21_3 /* !! */  = (int)n.akot("akwr", akoq(int ), (int)181);
                if (!var22_2) ** GOTO lbl310
                throw null;
            }
lbl492:
            // 2 sources

            case 85: {
                var21_3 /* !! */  = (int)n.akot("akws", akoq(int ), (int)182);
                if (!var22_2) ** GOTO lbl372
                throw null;
            }
lbl496:
            // 2 sources

            case 86: {
                var21_3 /* !! */  = (int)n.akot("akwt", akoq(int ), (int)183);
                if (!var22_2) ** GOTO lbl492
                throw null;
            }
            case 87: {
                var21_3 /* !! */  = (int)n.akot("akwu", akoq(int ), (int)184);
                if (!var22_2) ** GOTO lbl250
                throw null;
            }
            case 88: {
                var21_3 /* !! */  = (int)n.akot("akwv", akoq(int ), (int)185);
                if (!var22_2) ** GOTO lbl301
                throw null;
            }
lbl508:
            // 2 sources

            case 89: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var21_3 /* !! */  = (int)n.akot("akww", akoq(int ), (int)186);
                    if (!var22_2) ** GOTO lbl203
                    throw null;
                }
            }
            case 90: {
                var21_3 /* !! */  = (int)n.akot("akwx", akoq(int ), (int)187);
                if (!var22_2) ** GOTO lbl198
                throw null;
            }
lbl517:
            // 3 sources

            case 91: {
                var21_3 /* !! */  = (int)n.akot("akwy", akoq(int ), (int)188);
                if (!var22_2) ** GOTO lbl455
                throw null;
            }
            case 92: 
        }
        var21_3 /* !! */  = (int)n.akot("akwz", akoq(int ), (int)189);
        ** while (!var22_2)
lbl524:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        block90: {
            var6_3 = n.c;
            var5_4 /* !! */  = n.b;
            var4_5 = n.a;
            if (var6_3) {
                throw null;
lbl6:
                // 25 sources

                return;
            }
            if (var4_5 || var4_5) ** GOTO lbl6
            if (var2_2.length != n.akot("akoy", akoq(int ), (int)4)) break block90;
            if (var4_5) ** GOTO lbl6
            if (!var2_2[0].equalsIgnoreCase("off")) break block90;
            if (var4_5 || var4_5) ** GOTO lbl6
            n.enabled = n.akot("akoz", akoq(int ), (int)5);
            if (var4_5 || var4_5) ** GOTO lbl6
            n.targetX = 0.0;
            if (var4_5 || var4_5) ** GOTO lbl6
            n.targetZ = 0.0;
            if (var4_5 || var4_5) ** GOTO lbl6
            this.logDirect(class_2561.method_43470((String)"GPS \u043e\u0442\u043a\u043b\u044e\u0447\u0451\u043d!").method_27692(class_124.field_1080));
            if (var4_5 || var4_5) ** GOTO lbl6
            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl6
        if (var2_2.length != n.akot("akpa", akoq(int ), (int)6)) ** GOTO lbl43
        if (var4_5) ** GOTO lbl6
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_2[0].equalsIgnoreCase("info")) ** GOTO lbl43
                if (var4_5 || var4_5) ** GOTO lbl6
                if (n.enabled) ** GOTO lbl38
                if (var4_5 || var4_5) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)"\u0421\u0435\u0439\u0447\u0430\u0441 GPS \u043e\u0442\u043a\u043b\u044e\u0447\u0451\u043d!").method_27692(class_124.field_1080));
                if (var4_5) ** GOTO lbl6
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl41
lbl38:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)"\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e \u0442\u0435\u043a\u0443\u0449\u0435\u043c GPS: x: ").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)n.format(n.targetX)).method_27692(class_124.field_1068)).method_10852((class_2561)class_2561.method_43470((String)" z: ").method_27692(class_124.field_1080)).method_10852((class_2561)class_2561.method_43470((String)n.format(n.targetZ)).method_27692(class_124.field_1068)));
                if (var4_5) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                return;
lbl43:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                if (var2_2.length != n.akot("akpb", akoq(int ), (int)7)) ** GOTO lbl59
                if (var4_5) ** GOTO lbl6
                try {
                    if (var4_5) ** GOTO lbl6
                    n.targetX = Double.parseDouble(var2_2[0].replace((char)n.akot("akpc", akoq(int ), (int)8), (char)n.akot("akpd", akoq(int ), (int)9)));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    n.targetZ = Double.parseDouble(var2_2[1].replace((char)n.akot("akpe", akoq(int ), (int)10), (char)n.akot("akpf", akoq(int ), (int)11)));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    n.enabled = n.akot("akpg", akoq(int ), (int)12);
                    if (var4_5 || var4_5) ** GOTO lbl6
                    this.logDirect(class_2561.method_43470((String)"GPS \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d \u043d\u0430 x: ").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)n.format(n.targetX)).method_27692(class_124.field_1068)).method_10852((class_2561)class_2561.method_43470((String)" z: ").method_27692(class_124.field_1080)).method_10852((class_2561)class_2561.method_43470((String)n.format(n.targetZ)).method_27692(class_124.field_1068)));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    return;
                }
                catch (NumberFormatException var3_6) {
                    if (var4_5) ** GOTO lbl6
                }
lbl59:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)"\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .gps <x> <z> | .gps info | .gps off").method_27692(class_124.field_1080));
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl64:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)n.akot("akph", akoq(int ), (int)13);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl69:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)n.akot("akpi", akoq(int ), (int)14);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl84
            }
            case 2: {
                var5_4 /* !! */  = (int)n.akot("akpj", akoq(int ), (int)15);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl84
            }
            case 3: {
                var5_4 /* !! */  = (int)n.akot("akpk", akoq(int ), (int)16);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl84:
            // 5 sources

            case 4: {
                var5_4 /* !! */  = (int)n.akot("akpl", akoq(int ), (int)17);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)n.akot("akpm", akoq(int ), (int)18);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl126
                    break;
                }
            }
lbl95:
            // 4 sources

            case 6: {
                var5_4 /* !! */  = (int)n.akot("akpn", akoq(int ), (int)19);
                if (!var6_3) break;
                throw null;
            }
lbl99:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)n.akot("akpo", akoq(int ), (int)20);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl103:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)n.akot("akpp", akoq(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl108:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)n.akot("akpq", akoq(int ), (int)22);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl113:
            // 3 sources

            case 10: {
                var5_4 /* !! */  = (int)n.akot("akpr", akoq(int ), (int)23);
                if (!var6_3) ** GOTO lbl64
                throw null;
            }
lbl117:
            // 3 sources

            case 11: {
                var5_4 /* !! */  = (int)n.akot("akps", akoq(int ), (int)24);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 12: {
                var5_4 /* !! */  = (int)n.akot("akpt", akoq(int ), (int)25);
                if (!var6_3) ** GOTO lbl69
                throw null;
            }
lbl126:
            // 3 sources

            case 13: {
                var5_4 /* !! */  = (int)n.akot("akpu", akoq(int ), (int)26);
                if (!var6_3) ** GOTO lbl103
                throw null;
            }
lbl130:
            // 4 sources

            case 14: {
                var5_4 /* !! */  = (int)n.akot("akpv", akoq(int ), (int)27);
                if (!var6_3) ** GOTO lbl84
                throw null;
            }
            case 15: {
                do {
                    var5_4 /* !! */  = (int)n.akot("akpw", akoq(int ), (int)28);
                } while (!var6_3);
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)n.akot("akpx", akoq(int ), (int)29);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl144:
            // 3 sources

            case 17: {
                var5_4 /* !! */  = (int)n.akot("akpy", akoq(int ), (int)30);
                if (!var6_3) ** GOTO lbl130
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)n.akot("akpz", akoq(int ), (int)31);
                if (!var6_3) ** GOTO lbl84
                throw null;
            }
lbl152:
            // 2 sources

            case 19: {
                var5_4 /* !! */  = (int)n.akot("akqa", akoq(int ), (int)32);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl157:
            // 2 sources

            case 20: {
                var5_4 /* !! */  = (int)n.akot("akqb", akoq(int ), (int)33);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl161:
            // 2 sources

            case 21: {
                var5_4 /* !! */  = (int)n.akot("akqc", akoq(int ), (int)34);
                if (!var6_3) break;
                throw null;
            }
            case 22: {
                var5_4 /* !! */  = (int)n.akot("akqd", akoq(int ), (int)35);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl170:
            // 2 sources

            case 23: {
                var5_4 /* !! */  = (int)n.akot("akqe", akoq(int ), (int)36);
                if (!var6_3) ** GOTO lbl130
                throw null;
            }
            case 24: {
                var5_4 /* !! */  = (int)n.akot("akqf", akoq(int ), (int)37);
                if (!var6_3) ** GOTO lbl113
                throw null;
            }
lbl178:
            // 2 sources

            case 25: {
                var5_4 /* !! */  = (int)n.akot("akqg", akoq(int ), (int)38);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 26: {
                var5_4 /* !! */  = (int)n.akot("akqh", akoq(int ), (int)39);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl188:
            // 3 sources

            case 27: {
                var5_4 /* !! */  = (int)n.akot("akqi", akoq(int ), (int)40);
                if (!var6_3) ** GOTO lbl144
                throw null;
            }
            case 28: {
                var5_4 /* !! */  = (int)n.akot("akqj", akoq(int ), (int)41);
                if (!var6_3) ** GOTO lbl108
                throw null;
            }
            case 29: {
                var5_4 /* !! */  = (int)n.akot("akqk", akoq(int ), (int)42);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl201:
            // 2 sources

            case 30: {
                var5_4 /* !! */  = (int)n.akot("akql", akoq(int ), (int)43);
                if (!var6_3) ** GOTO lbl113
                throw null;
            }
lbl205:
            // 2 sources

            case 31: {
                var5_4 /* !! */  = (int)n.akot("akqm", akoq(int ), (int)44);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 32: {
                var5_4 /* !! */  = (int)n.akot("akqn", akoq(int ), (int)45);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl215:
            // 3 sources

            case 33: {
                var5_4 /* !! */  = (int)n.akot("akqo", akoq(int ), (int)46);
                if (!var6_3) ** GOTO lbl99
                throw null;
            }
lbl219:
            // 2 sources

            case 34: {
                var5_4 /* !! */  = (int)n.akot("akqp", akoq(int ), (int)47);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl224:
            // 3 sources

            case 35: {
                var5_4 /* !! */  = (int)n.akot("akqq", akoq(int ), (int)48);
                if (!var6_3) ** GOTO lbl117
                throw null;
            }
            case 36: {
                var5_4 /* !! */  = (int)n.akot("akqr", akoq(int ), (int)49);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl233:
            // 3 sources

            case 37: {
                var5_4 /* !! */  = (int)n.akot("akqs", akoq(int ), (int)50);
                if (!var6_3) ** GOTO lbl144
                throw null;
            }
            case 38: {
                var5_4 /* !! */  = (int)n.akot("akqt", akoq(int ), (int)51);
                if (!var6_3) ** GOTO lbl161
                throw null;
            }
            case 39: {
                var5_4 /* !! */  = (int)n.akot("akqu", akoq(int ), (int)52);
                if (!var6_3) ** GOTO lbl117
                throw null;
            }
lbl245:
            // 3 sources

            case 40: {
                var5_4 /* !! */  = (int)n.akot("akqv", akoq(int ), (int)53);
                if (!var6_3) ** GOTO lbl205
                throw null;
            }
            case 41: {
                var5_4 /* !! */  = (int)n.akot("akqw", akoq(int ), (int)54);
                if (!var6_3) ** GOTO lbl130
                throw null;
            }
            case 42: {
                var5_4 /* !! */  = (int)n.akot("akqx", akoq(int ), (int)55);
                if (!var6_3) ** GOTO lbl126
                throw null;
            }
            case 43: {
                var5_4 /* !! */  = (int)n.akot("akqy", akoq(int ), (int)56);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl261:
            // 2 sources

            case 44: {
                var5_4 /* !! */  = (int)n.akot("akqz", akoq(int ), (int)57);
                if (!var6_3) ** GOTO lbl188
                throw null;
            }
lbl265:
            // 2 sources

            case 45: {
                var5_4 /* !! */  = (int)n.akot("akra", akoq(int ), (int)58);
                if (!var6_3) ** GOTO lbl188
                throw null;
            }
            case 46: 
        }
        var5_4 /* !! */  = (int)n.akot("akrb", akoq(int ), (int)59);
        ** while (!var6_3)
lbl272:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> getLongDesc() {
        v0 /* !! */  = n.cc;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - n.akot("akyk", akrc(int ), (int)35));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -844914312: {
                    v1 = n.akot("akyl", akrc(int ), (int)36);
                    continue block16;
                }
                case 1544320920: {
                    break block16;
                }
                case 2130225685: {
                    v1 = n.akot("akym", akrc(int ), (int)37);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = n.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = n.cc - n.akot("akyn", akrc(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == n.akot("akyo", akoq(int ), (int)210)) break;
            v2 /* !! */  = (long)n.akot("akyp", akoq(int ), (int)211);
        }
        var2_2 /* !! */  = n.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = n.cc - n.akot("akyq", akrc(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == n.akot("akyr", akoq(int ), (int)212)) {
                var1_3 = n.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)n.akot("akys", akoq(int ), (int)213);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                v4 /* !! */  = n.cc;
                block19: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -1865269184: {
                            v5 = n.akot("akyu", akrc(int ), (int)41);
                            ** GOTO lbl43
                        }
                        case -568121535: {
                            v5 = n.akot("akyv", akrc(int ), (int)42);
lbl43:
                            // 2 sources

                            v4 /* !! */  = (long)(v5 - n.akot("akyt", akrc(int ), (int)40));
                            continue block19;
                        }
                        case 1544320920: {
                            return List.of("\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0438 \u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0434\u043e \u0437\u0430\u0434\u0430\u043d\u043d\u044b\u0445 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442.", "> gps <x> <z> - \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0442\u043e\u0447\u043a\u0443", "> gps info - \u043f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0442\u0435\u043a\u0443\u0449\u0443\u044e \u0442\u043e\u0447\u043a\u0443", "> gps off - \u043e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c GPS");
                        }
                    }
                    break;
                }
                return List.of("\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0438 \u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u0434\u043e \u0437\u0430\u0434\u0430\u043d\u043d\u044b\u0445 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442.", "> gps <x> <z> - \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0442\u043e\u0447\u043a\u0443", "> gps info - \u043f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0442\u0435\u043a\u0443\u0449\u0443\u044e \u0442\u043e\u0447\u043a\u0443", "> gps off - \u043e\u0442\u043a\u043b\u044e\u0447\u0438\u0442\u044c GPS");
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)n.akot("akyw", akoq(int ), (int)214);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                ** GOTO lbl59
            }
            case 3: {
                var2_2 /* !! */  = (int)n.akot("akyz", akoq(int ), (int)217);
                if (var3_1) {
                    throw null;
                }
lbl59:
                // 3 sources

                var2_2 /* !! */  = (int)n.akot("akyx", akoq(int ), (int)215);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)n.akot("akyy", akoq(int ), (int)216);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite akot(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ancn() {
        n.akor[200] = -201821192;
        n.akor[201] = 1676179741;
        n.akor[202] = -660985480;
        n.akor[203] = -1656406195;
        n.akor[204] = -182927479;
        n.akor[205] = -1262084221;
        n.akor[206] = -112261826;
        n.akor[207] = -1368485565;
        n.akor[208] = -1426744523;
        n.akor[209] = 614853862;
        n.akor[210] = -1377455272;
        n.akor[211] = 1300618113;
        n.akor[212] = 1988333455;
        n.akor[213] = -1482997508;
        n.akor[214] = -138595989;
        n.akor[215] = -1870988802;
        n.akor[216] = 245574649;
        n.akor[217] = -1017084092;
        n.akor[218] = 858861182;
        n.akor[219] = -54286162;
        n.akor[220] = -1081980403;
        n.akor[221] = -2145511295;
        n.akor[222] = 911632677;
        n.akor[223] = 792297216;
        n.akor[224] = -384835402;
        n.akor[225] = 17734362;
        n.akor[226] = 1373232507;
        n.akor[227] = 2079566713;
        n.akor[228] = 479853615;
        n.akor[229] = -35664392;
        n.akor[230] = -211664040;
        n.akor[231] = -2083894765;
        n.akor[232] = 306515337;
        n.akor[233] = -1242668470;
        n.akor[234] = -1608280979;
        n.akor[235] = 675999129;
        n.akor[236] = 1034956524;
        n.akor[237] = -1362861305;
        n.akor[238] = -1829877207;
        n.akor[239] = 1550958278;
        n.akor[240] = -731035881;
        n.akor[241] = -418905843;
        n.akor[242] = -1617766862;
        n.akor[243] = -1545645380;
        n.akor[244] = 1213877982;
        n.akor[245] = -2061952617;
        n.akor[246] = -2008417199;
        n.akor[247] = 388633687;
        n.akor[248] = -136594493;
        n.akor[249] = -1616731112;
        n.akor[250] = -2079537307;
        n.akor[251] = -2137859466;
        n.akor[252] = 1467452406;
        n.akor[253] = 286679561;
        n.akor[254] = -190228078;
        n.akor[255] = 1166986139;
        n.akor[256] = -787253158;
        n.akor[257] = -479924426;
        n.akor[258] = 1560392638;
        n.akor[259] = -814020108;
        n.akor[260] = 1746125417;
        n.akor[261] = 1309746610;
        n.akor[262] = -572541549;
        n.akor[263] = 696972593;
        n.akor[264] = -1583719147;
        n.akor[265] = -23996723;
        n.akor[266] = 1988447873;
        n.akor[267] = 1728558871;
        n.akor[268] = -891196077;
        n.akor[269] = -1376613528;
        n.akor[270] = 41824898;
        n.akor[271] = 1616744283;
        n.akor[272] = -510154292;
        n.akor[273] = -810052588;
        n.akor[274] = -673086711;
        n.akor[275] = -867027903;
        n.akor[276] = 512027935;
        n.akor[277] = -717730760;
        n.akor[278] = -365390905;
        n.akor[279] = -670510775;
        n.akor[280] = -1464322062;
        n.akor[281] = 1736671946;
        n.akor[282] = -1328812054;
        n.akor[283] = -1276362267;
        n.akor[284] = 1663582787;
        n.akor[285] = 616370338;
        n.akor[286] = -372853353;
        n.akor[287] = 328805710;
        n.akor[288] = -1985343233;
        n.akor[289] = -376932422;
        n.akor[290] = 415179318;
        n.akor[291] = -1214988278;
        n.akor[292] = -637645044;
        n.akor[293] = -230305432;
        n.akor[294] = 1068794899;
        n.akor[295] = 365295972;
        n.akor[296] = 820850064;
        n.akor[297] = 1404567166;
        n.akor[298] = -2023521900;
        n.akor[299] = -60723843;
    }

    private static /* synthetic */ void ancr() {
        n.akos[100] = -771523875;
        n.akos[101] = 895305819;
        n.akos[102] = -491275316;
        n.akos[103] = -870609700;
        n.akos[104] = -471864672;
        n.akos[105] = 44297656;
        n.akos[106] = -581246443;
        n.akos[107] = -1983791342;
        n.akos[108] = -381718919;
        n.akos[109] = -2072658387;
        n.akos[110] = -1251632950;
        n.akos[111] = 141401601;
        n.akos[112] = 1534174030;
        n.akos[113] = -26840052;
        n.akos[114] = 937407607;
        n.akos[115] = -1341696392;
        n.akos[116] = 1023782414;
        n.akos[117] = -430570215;
        n.akos[118] = 2091397620;
        n.akos[119] = -1155147569;
        n.akos[120] = -1349178619;
        n.akos[121] = 2018378060;
        n.akos[122] = 327854039;
        n.akos[123] = -603037873;
        n.akos[124] = 1669217904;
        n.akos[125] = 336566740;
        n.akos[126] = 1672862506;
        n.akos[127] = -1715767600;
        n.akos[128] = -1261069740;
        n.akos[129] = 952931423;
        n.akos[130] = 1052404573;
        n.akos[131] = -776376926;
        n.akos[132] = -200110710;
        n.akos[133] = 1248177816;
        n.akos[134] = 523487614;
        n.akos[135] = 807423152;
        n.akos[136] = -159092706;
        n.akos[137] = 1210922481;
        n.akos[138] = -1364398426;
        n.akos[139] = 2027011810;
        n.akos[140] = -339607334;
        n.akos[141] = 1473566626;
        n.akos[142] = -780827210;
        n.akos[143] = -1633449277;
        n.akos[144] = -1086814179;
        n.akos[145] = -602280720;
        n.akos[146] = 1630764099;
        n.akos[147] = 881164900;
        n.akos[148] = 956945392;
        n.akos[149] = -1640773710;
        n.akos[150] = -347590962;
        n.akos[151] = 1010568575;
        n.akos[152] = 751133018;
        n.akos[153] = -12860656;
        n.akos[154] = -1512070088;
        n.akos[155] = -1808354850;
        n.akos[156] = 1887061747;
        n.akos[157] = -604038002;
        n.akos[158] = -2131522444;
        n.akos[159] = -862175747;
        n.akos[160] = 140817590;
        n.akos[161] = -1238967992;
        n.akos[162] = -688720258;
        n.akos[163] = 1629256174;
        n.akos[164] = -195879653;
        n.akos[165] = 1101151103;
        n.akos[166] = 375058827;
        n.akos[167] = -1011776900;
        n.akos[168] = -1190372507;
        n.akos[169] = -654013357;
        n.akos[170] = -1986294399;
        n.akos[171] = 981021331;
        n.akos[172] = 180448056;
        n.akos[173] = -816890414;
        n.akos[174] = -1738019160;
        n.akos[175] = -495894817;
        n.akos[176] = -1423276690;
        n.akos[177] = -1783781072;
        n.akos[178] = -465082206;
        n.akos[179] = -1469651022;
        n.akos[180] = 2006496810;
        n.akos[181] = 943189336;
        n.akos[182] = 354997400;
        n.akos[183] = 1393911082;
        n.akos[184] = -163430356;
        n.akos[185] = -1842957917;
        n.akos[186] = 421041846;
        n.akos[187] = -881036910;
        n.akos[188] = 799105382;
        n.akos[189] = -1875259162;
        n.akos[190] = 887692827;
        n.akos[191] = 873582920;
        n.akos[192] = 962995020;
        n.akos[193] = -939203156;
        n.akos[194] = 918315683;
        n.akos[195] = 688443859;
        n.akos[196] = 670361466;
        n.akos[197] = 1652774104;
        n.akos[198] = 566217698;
        n.akos[199] = 1787436363;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float centeredTextY(ks var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = n.cc - n.akot("aljn", akrc(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == n.akot("aljo", akoq(int ), (int)380)) break;
            v0 /* !! */  = (long)n.akot("aljp", akoq(int ), (int)381);
        }
        var7_3 = n.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = n.cc - n.akot("aljq", akrc(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == n.akot("aljr", akoq(int ), (int)382)) break;
            v1 /* !! */  = (long)n.akot("aljs", akoq(int ), (int)383);
        }
        var6_4 /* !! */  = n.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = n.cc - n.akot("aljt", akrc(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == n.akot("aljy", akoq(int ), (int)384)) break;
            v2 /* !! */  = (long)n.akot("aljz", akoq(int ), (int)385);
        }
        var5_5 = n.a;
        if (var7_3) {
            throw null;
lbl21:
            // 7 sources

            return (float)n.akot("alkc", akst(int ), (int)386);
        }
        if (var5_5 || var5_5) ** GOTO lbl21
        v3 = n.akot("alke", akoq(int ), (int)387);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = n.cc - n.akot("alkf", akrc(int ), (int)157)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == n.akot("alkg", akoq(int ), (int)388)) break;
            v4 /* !! */  = (long)n.akot("alki", akoq(int ), (int)389);
        }
        var3_6 = var0.getGlyph((int)v3);
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5 || var5_5) ** GOTO lbl21
                if (var3_6 == null) ** GOTO lbl55
                if (var5_5) ** GOTO lbl21
                v5 /* !! */  = n.cc;
                if (true) ** GOTO lbl41
                block38: while (true) {
                    v5 /* !! */  = (long)(v6 - n.akot("alkl", akrc(int ), (int)158));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2006217829: {
                            v6 = n.akot("alkn", akrc(int ), (int)159);
                            continue block38;
                        }
                        case 74236643: {
                            v6 = n.akot("alkp", akrc(int ), (int)160);
                            continue block38;
                        }
                        case 724692600: {
                            v6 = n.akot("alkq", akrc(int ), (int)161);
                            continue block38;
                        }
                        case 1544320920: {
                            break block38;
                        }
                    }
                    break;
                }
                if (!(var3_6.height <= 0.0f)) ** GOTO lbl57
                if (var5_5) ** GOTO lbl21
lbl55:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl21
                return var2_2 - var1_1 * n.akot("alku", akst(int ), (int)390);
lbl57:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl21
                v7 /* !! */  = n.cc;
                if (true) ** GOTO lbl62
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - n.akot("alkv", akrc(int ), (int)162));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -405619939: {
                            v8 = n.akot("alkw", akrc(int ), (int)163);
                            continue block39;
                        }
                        case 1544320920: {
                            break block39;
                        }
                        case 1725462652: {
                            v8 = n.akot("alky", akrc(int ), (int)164);
                            continue block39;
                        }
                        case 2140014199: {
                            v8 = n.akot("alla", akrc(int ), (int)165);
                            continue block39;
                        }
                    }
                    break;
                }
                var4_7 = var1_1 / var0.getEmSize();
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = n.cc - n.akot("allb", akrc(int ), (int)166)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == n.akot("allc", akoq(int ), (int)391)) break;
                    v9 /* !! */  = (long)n.akot("alle", akoq(int ), (int)392);
                }
                v10 = var0.getAscender();
                v11 /* !! */  = n.cc;
                if (true) ** GOTO lbl87
                block41: while (true) {
                    v11 /* !! */  = (long)(n.akot("allh", akrc(int ), (int)168) - n.akot("allf", akrc(int ), (int)167));
lbl87:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1870081296: {
                            continue block41;
                        }
                        case 1544320920: {
                            break block41;
                        }
                    }
                    break;
                }
                v12 = v10 - var3_6.bearingY;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = n.cc - n.akot("allk", akrc(int ), (int)169)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == n.akot("allm", akoq(int ), (int)393)) break;
                    v13 /* !! */  = (long)n.akot("allp", akoq(int ), (int)394);
                }
                return var2_2 - (v12 + var3_6.height * n.akot("allq", akst(int ), (int)395)) * var4_7;
            }
lbl99:
            // 3 sources

            case 0: {
                var6_4 /* !! */  = (int)n.akot("allr", akoq(int ), (int)396);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl104:
            // 2 sources

            case 1: {
                var6_4 /* !! */  = (int)n.akot("alls", akoq(int ), (int)397);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl109:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)n.akot("allt", akoq(int ), (int)398);
                if (!var7_3) ** GOTO lbl99
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)n.akot("allv", akoq(int ), (int)399);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 4: {
                var6_4 /* !! */  = (int)n.akot("allx", akoq(int ), (int)400);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 5: {
                var6_4 /* !! */  = (int)n.akot("almb", akoq(int ), (int)401);
                if (!var7_3) ** GOTO lbl109
                throw null;
            }
            case 6: {
                var6_4 /* !! */  = (int)n.akot("almc", akoq(int ), (int)402);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl132:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)n.akot("almd", akoq(int ), (int)403);
                    if (!var7_3) ** GOTO lbl104
                    throw null;
                }
            }
lbl137:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)n.akot("alme", akoq(int ), (int)404);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl142:
            // 3 sources

            case 9: {
                var6_4 /* !! */  = (int)n.akot("almf", akoq(int ), (int)405);
                if (var7_3) {
                    throw null;
                }
            }
lbl146:
            // 4 sources

            case 10: {
                var6_4 /* !! */  = (int)n.akot("almg", akoq(int ), (int)406);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl151:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)n.akot("almh", akoq(int ), (int)407);
                if (!var7_3) ** GOTO lbl132
                throw null;
            }
lbl155:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)n.akot("almk", akoq(int ), (int)408);
                if (!var7_3) ** GOTO lbl142
                throw null;
            }
lbl159:
            // 2 sources

            case 13: {
                var6_4 /* !! */  = (int)n.akot("alml", akoq(int ), (int)409);
                if (!var7_3) ** GOTO lbl99
                throw null;
            }
            case 14: 
        }
        var6_4 /* !! */  = (int)n.akot("almm", akoq(int ), (int)410);
        ** while (!var7_3)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ancp() {
        n.akor[400] = -369835435;
        n.akor[401] = -1707731474;
        n.akor[402] = -1395088719;
        n.akor[403] = -645701426;
        n.akor[404] = 665219860;
        n.akor[405] = 1167573639;
        n.akor[406] = 1368466105;
        n.akor[407] = -200730666;
        n.akor[408] = 1684798638;
        n.akor[409] = 445955915;
        n.akor[410] = 31396727;
        n.akor[411] = 438903415;
        n.akor[412] = 1377669278;
        n.akor[413] = -1526701091;
        n.akor[414] = 1585485483;
        n.akor[415] = -1257461347;
        n.akor[416] = -1820845784;
        n.akor[417] = 692217024;
        n.akor[418] = -115562058;
        n.akor[419] = -1798686402;
        n.akor[420] = -576564407;
        n.akor[421] = 872047659;
        n.akor[422] = 1094252931;
        n.akor[423] = 87973210;
        n.akor[424] = -332276316;
        n.akor[425] = 273065892;
        n.akor[426] = -989332507;
        n.akor[427] = -738760665;
        n.akor[428] = 1823594770;
        n.akor[429] = -1434953015;
        n.akor[430] = 1016197140;
        n.akor[431] = 600140218;
        n.akor[432] = -99045850;
        n.akor[433] = -1500823038;
        n.akor[434] = -1121173313;
        n.akor[435] = -2005542256;
        n.akor[436] = -1684693275;
    }
}

