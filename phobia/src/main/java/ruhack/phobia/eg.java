/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.IntPredicate;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import ruhack.phobia.ar;
import ruhack.phobia.at;
import ruhack.phobia.dz;
import ruhack.phobia.eg$RollingText;
import ruhack.phobia.eg$TextParts;
import ruhack.phobia.jk;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kr;
import ruhack.phobia.ks;
import ruhack.phobia.ku;
import ruhack.phobia.kv;
import ruhack.phobia.nd;
import ruhack.phobia.oq;

public final class eg
extends ar {
    private static final float AVATAR_GLOW_SIZE = 14.008234f;
    private static final float LOWER_ICON_X_OFFSET = 5.4231877f;
    private static final float LOWER_PANEL_HEIGHT = 24.481056f;
    static final long bn = -4441616877366659688L;
    private static final float TIME_TEXT_X_OFFSET = 16.563068f;
    private static final float LOWER_TEXT_X_OFFSET = 16.989986f;
    private static final float TIME_TEXT_Y_OFFSET = 4.3558936f;
    private static final int BORDER_COLOR;
    private static final String PING_ICON = "P";
    private static final float LOGO_X_OFFSET = 8.611729f;
    private static final float RADIUS = 7.3376465f;
    private static final float LOWER_TEXT_SIZE = 8.004705f;
    private String cachedTime;
    private static final float PANEL_WIDTH = 143.25754f;
    private static final long NUMBER_ANIMATION_MS = 280L;
    private static final float LOGIN_TIME_GAP = 2.3747292f;
    private static final DateTimeFormatter TIME_FORMAT;
    private static final float NUMBER_SHIFT = 8.671763f;
    private static final float LOWER_PANEL_RADIUS = 7.3376465f;
    private static final float LOGIN_RIGHT_PADDING = 6.7506347f;
    private static final float LOWER_PANEL_RIGHT_PADDING = 2.9684112f;
    private static final float LOGIN_BACKGROUND_RADIUS = 5.33647f;
    private static final float TIME_ICON_SIZE = 6.570529f;
    private static final float LOGO_BACKGROUND_HEIGHT = 19.057869f;
    private final eg$RollingText fpsRolling;
    private static final float USERNAME_FONT_SIZE = 8.004705f;
    private static final float LOWER_TEXT_Y_OFFSET = 4.3558936f;
    private static final float BORDER = 0.66705877f;
    private long cachedTimeMinute;
    private static final class_2960 LOGO_TEXTURE;
    private static final int LOGO_BACKGROUND_BORDER_COLOR;
    private static final float TIME_ICON_Y_OFFSET = 6.2436695f;
    private static final float AVATAR_UV_INSET = 0.04f;
    private static final float LOGO_WIDTH = 9.618987f;
    private static final float PING_ICON_WIDTH = 6.6772585f;
    private static final class_2960 AVATAR_TEXTURE;
    private static int[] abss;
    private static final float PANEL_RIGHT_PADDING = 2.9684112f;
    private static final float TIME_TEXT_SIZE = 8.004705f;
    public static final int b;
    private static final int TIME_BACKGROUND_BORDER_COLOR;
    private static final float TIME_BACKGROUND_BORDER = 0.66705877f;
    private static final float LOGIN_BACKGROUND_HEIGHT = 19.057869f;
    private static final float AVATAR_BORDER = 0.66705877f;
    private static final float LOWER_PANEL_BORDER = 0.66705877f;
    private static final int MAX_BOSS_BARS = 3;
    private static final float LOGIN_Y_OFFSET = 2.7149293f;
    private static final float LOWER_CONTENT_RADIUS = 5.33647f;
    private static final float USERNAME_X_OFFSET = 47.44122f;
    private static final String SERVER_ICON = "O";
    private static final float LOGIN_X_OFFSET = 27.476149f;
    private final eg$RollingText pingRolling;
    private static final float LOGO_BACKGROUND_Y_OFFSET = 2.7149293f;
    private static final float AVATAR_RADIUS = 4.9395704f;
    private static final float LOGO_BACKGROUND_BORDER = 0.66705877f;
    private static final float INNER_SHADOW_BLUR = 9.672352f;
    private static final float TIME_BACKGROUND_Y_OFFSET = 2.7149293f;
    private static final String TIME_ICON = "K";
    private static final float AVATAR_SIZE = 9.879141f;
    public static final boolean a;
    private static final float AVATAR_X_OFFSET = 32.899338f;
    private static final float USERNAME_Y_OFFSET = 7.070823f;
    private static final int TIME_TEXT_COLOR;
    private static final float LOGO_BACKGROUND_X_OFFSET = 3.0617998f;
    private static final float LOWER_RIGHT_PADDING = 5.556599f;
    private static final float TIME_BACKGROUND_HEIGHT = 19.057869f;
    private static final int LOGIN_BACKGROUND_BORDER_COLOR;
    private static final String FPS_ICON = "Q";
    private static int[] abst;
    private static final float LOGO_BACKGROUND_RADIUS = 5.33647f;
    private static final float AVATAR_Y_OFFSET = 7.304293f;
    private static final float LOGIN_BACKGROUND_BORDER = 0.66705877f;
    private static final float TIME_BACKGROUND_RADIUS = 5.33647f;
    private static final int USERNAME_COLOR;
    private static final float LOGO_Y_OFFSET = 8.2114935f;
    private static final float SERVER_ICON_WIDTH = 6.6772585f;
    private static final float TIME_ICON_X_OFFSET = 5.5232463f;
    private static final float LOWER_CONTENT_Y = 2.7149293f;
    private static final float INNER_SHADOW_THICKNESS = 0.76711756f;
    private static long[] absy;
    private static final int LOWER_SUFFIX_COLOR;
    private static final float TIME_RIGHT_PADDING = 5.5165763f;
    private static final float LOWER_PANEL_GAP = 2.0078468f;
    private static final float LOWER_CONTENT_HEIGHT = 19.057869f;
    private static final float PANEL_HEIGHT = 24.481056f;
    private static final float LOGO_BACKGROUND_WIDTH = 22.046291f;
    private static final float BOSS_BAR_STEP_PIXELS = 19.0f;
    private final eg$RollingText timeRolling;
    private static long[] absz;
    private static final float LOGO_HEIGHT = 7.971352f;
    private static final float TOP_MARGIN_PIXELS = 6.0f;
    private static final float LOWER_CONTENT_GAP = 2.3747292f;
    public static final boolean c;
    private static final float LOWER_CONTENT_X = 2.9684112f;
    private static final int LOWER_TEXT_COLOR;
    private static final float LOWER_CONTENT_BORDER = 0.66705877f;
    private static final float FPS_ICON_WIDTH = 6.050223f;
    private static final int BLACK_FILL;
    private static final float DESIGN_SCALE = 1.4991183f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawTime(class_332 var0, float var1_1, float var2_2, float var3_3, ks var4_4, eg$RollingText var5_5, long var6_6, float var8_7) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("aduc", abtd(int ), (int)189)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("adud", absr(int ), (int)680)) break;
            v0 /* !! */  = (long)eg.absu("adue", absr(int ), (int)681);
        }
        var14_8 = eg.c;
        v1 /* !! */  = eg.bn;
        if (true) ** GOTO lbl11
        block48: while (true) {
            v1 /* !! */  = (long)(eg.absu("adug", abtd(int ), (int)191) - eg.absu("aduf", abtd(int ), (int)190));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1808910952: {
                    break block48;
                }
                case 1114294257: {
                    continue block48;
                }
            }
            break;
        }
        var13_9 /* !! */  = eg.b;
        v2 /* !! */  = eg.bn;
        if (true) ** GOTO lbl21
        block49: while (true) {
            v2 /* !! */  = (long)(v3 - eg.absu("aduh", abtd(int ), (int)192));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1808910952: {
                    break block49;
                }
                case -1582122846: {
                    v3 = eg.absu("adui", abtd(int ), (int)193);
                    continue block49;
                }
                case -463855250: {
                    v3 = eg.absu("aduj", abtd(int ), (int)194);
                    continue block49;
                }
                case -217644487: {
                    v3 = eg.absu("aduk", abtd(int ), (int)195);
                    continue block49;
                }
            }
            break;
        }
        var12_10 = eg.a;
        if (var14_8) {
            throw null;
lbl36:
            // 9 sources

            return;
        }
        if (var12_10 || var12_10) ** GOTO lbl36
        var9_11 = var1_1 + var3_3;
        if (var12_10) ** GOTO lbl36
        if (var13_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_10) ** GOTO lbl36
                var10_12 = var2_2 + eg.absu("adul", abtn(int ), (int)682);
                if (var12_10 || var12_10) ** GOTO lbl36
                v4 /* !! */  = eg.bn;
                if (true) ** GOTO lbl51
                block51: while (true) {
                    v4 /* !! */  = (long)(v5 - eg.absu("adum", abtd(int ), (int)196));
lbl51:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1808910952: {
                            break block51;
                        }
                        case -1674785906: {
                            v5 = eg.absu("adun", abtd(int ), (int)197);
                            continue block51;
                        }
                        case -1443338955: {
                            v5 = eg.absu("aduo", abtd(int ), (int)198);
                            continue block51;
                        }
                        case 694283170: {
                            v5 = eg.absu("adup", abtd(int ), (int)199);
                            continue block51;
                        }
                    }
                    break;
                }
                if (kv.PHOBIA_NEW == null) ** GOTO lbl78
                if (var12_10 || var12_10) ** GOTO lbl36
                v6 /* !! */  = eg.bn;
                if (true) ** GOTO lbl69
                block52: while (true) {
                    v6 /* !! */  = (long)(eg.absu("adur", abtd(int ), (int)201) - eg.absu("aduq", abtd(int ), (int)200));
lbl69:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1808910952: {
                            break block52;
                        }
                        case -1289132432: {
                            continue block52;
                        }
                    }
                    break;
                }
                v7 = kv.PHOBIA_NEW;
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl86
lbl78:
                // 1 sources

                if (var12_10 || var12_10) ** GOTO lbl36
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adus", abtd(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == eg.absu("adut", absr(int ), (int)683)) {
                        v7 = kv.getDefault();
                        break;
                    }
                    v8 /* !! */  = (long)eg.absu("aduu", absr(int ), (int)684);
                }
lbl86:
                // 2 sources

                var11_13 = v7;
                if (var12_10 || var12_10) ** GOTO lbl36
                v9 = var9_11 + eg.absu("aduv", abtn(int ), (int)685);
                v10 = var10_12 + eg.absu("aduw", abtn(int ), (int)686);
                v11 = eg.absu("adux", abtn(int ), (int)687);
                v12 = eg.absu("aduy", absr(int ), (int)688);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("aduz", abtd(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == eg.absu("adva", absr(int ), (int)689)) break;
                    v13 /* !! */  = (long)eg.absu("advb", absr(int ), (int)690);
                }
                v14 = dz.color((int)v12);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("advc", abtd(int ), (int)204)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eg.absu("advd", absr(int ), (int)691)) break;
                    v15 /* !! */  = (long)eg.absu("adve", absr(int ), (int)692);
                }
                v16 = nd.multAlpha(v14, var8_7);
                v17 = eg.absu("advf", absr(int ), (int)693);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("advg", abtd(int ), (int)205)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == eg.absu("advh", absr(int ), (int)694)) break;
                    v18 /* !! */  = (long)eg.absu("advi", absr(int ), (int)695);
                }
                kq.text(var0, var11_13, "K", v9, v10, (float)v11, v16, (boolean)v17);
                if (var12_10 || var12_10) ** GOTO lbl36
                v19 = var9_11 + eg.absu("advj", abtn(int ), (int)696);
                v20 = var10_12 + eg.absu("advk", abtn(int ), (int)697);
                v21 = eg.absu("advl", abtn(int ), (int)698);
                v22 /* !! */  = eg.bn;
                if (true) ** GOTO lbl119
                block57: while (true) {
                    v22 /* !! */  = (long)(v23 - eg.absu("advm", abtd(int ), (int)206));
lbl119:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1808910952: {
                            break block57;
                        }
                        case -1648621934: {
                            v23 = eg.absu("advn", abtd(int ), (int)207);
                            continue block57;
                        }
                        case -1511063481: {
                            v23 = eg.absu("advo", abtd(int ), (int)208);
                            continue block57;
                        }
                        case 1731781913: {
                            v23 = eg.absu("advp", abtd(int ), (int)209);
                            continue block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("advq", abtd(int ), (int)210)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == eg.absu("advr", absr(int ), (int)699)) break;
                    v24 /* !! */  = (long)eg.absu("advs", absr(int ), (int)700);
                }
                v25 = nd.multAlpha(eg.TIME_TEXT_COLOR, var8_7);
                v26 = eg.absu("advt", abtn(int ), (int)701);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("advu", abtd(int ), (int)211)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == eg.absu("advv", absr(int ), (int)702)) break;
                    v27 /* !! */  = (long)eg.absu("advw", absr(int ), (int)703);
                }
                eg.drawRollingText(var0, var4_4, var5_5, v19, v20, (float)v21, v25, var10_12, (float)v26, var6_6);
                if (!var12_10 && !var12_10) ** break;
                ** continue;
                return;
            }
lbl147:
            // 2 sources

            case 0: {
                var13_9 /* !! */  = (int)eg.absu("advx", absr(int ), (int)704);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 1: {
                var13_9 /* !! */  = (int)eg.absu("advy", absr(int ), (int)705);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl157:
            // 4 sources

            case 2: {
                var13_9 /* !! */  = (int)eg.absu("advz", absr(int ), (int)706);
                if (!var14_8) ** GOTO lbl147
                throw null;
            }
lbl161:
            // 2 sources

            case 3: {
                var13_9 /* !! */  = (int)eg.absu("adwa", absr(int ), (int)707);
                if (!var14_8) ** GOTO lbl157
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_9 /* !! */  = (int)eg.absu("adwb", absr(int ), (int)708);
                    if (var14_8) {
                        throw null;
                    }
                    ** GOTO lbl214
                    break;
                }
            }
lbl171:
            // 2 sources

            case 5: {
                var13_9 /* !! */  = (int)eg.absu("adwc", absr(int ), (int)709);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl176:
            // 2 sources

            case 6: {
                var13_9 /* !! */  = (int)eg.absu("adwd", absr(int ), (int)710);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl181:
            // 2 sources

            case 7: {
                var13_9 /* !! */  = (int)eg.absu("adwe", absr(int ), (int)711);
                if (!var14_8) ** GOTO lbl161
                throw null;
            }
lbl185:
            // 2 sources

            case 8: {
                var13_9 /* !! */  = (int)eg.absu("adwf", absr(int ), (int)712);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 9: {
                var13_9 /* !! */  = (int)eg.absu("adwg", absr(int ), (int)713);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl195:
            // 3 sources

            case 10: {
                do {
                    var13_9 /* !! */  = (int)eg.absu("adwh", absr(int ), (int)714);
                } while (!var14_8);
                throw null;
            }
            case 11: {
                var13_9 /* !! */  = (int)eg.absu("adwi", absr(int ), (int)715);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl205:
            // 2 sources

            case 12: {
                var13_9 /* !! */  = (int)eg.absu("adwj", absr(int ), (int)716);
                if (!var14_8) ** GOTO lbl176
                throw null;
            }
            case 13: {
                var13_9 /* !! */  = (int)eg.absu("adwk", absr(int ), (int)717);
                if (var14_8) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl214:
            // 2 sources

            case 14: {
                var13_9 /* !! */  = (int)eg.absu("adwl", absr(int ), (int)718);
                if (!var14_8) ** GOTO lbl205
                throw null;
            }
            case 15: {
                var13_9 /* !! */  = (int)eg.absu("adwm", absr(int ), (int)719);
                if (!var14_8) ** GOTO lbl171
                throw null;
            }
lbl222:
            // 3 sources

            case 16: {
                var13_9 /* !! */  = (int)eg.absu("adwn", absr(int ), (int)720);
                if (!var14_8) ** GOTO lbl157
                throw null;
            }
lbl226:
            // 3 sources

            case 17: {
                var13_9 /* !! */  = (int)eg.absu("adwo", absr(int ), (int)721);
                if (!var14_8) ** GOTO lbl157
                throw null;
            }
            case 18: 
        }
        var13_9 /* !! */  = (int)eg.absu("adwp", absr(int ), (int)722);
        ** while (!var14_8)
lbl233:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aegv() {
        eg.abst[200] = 1384794276;
        eg.abst[201] = 2059580329;
        eg.abst[202] = 490398619;
        eg.abst[203] = 1371659594;
        eg.abst[204] = 1670650941;
        eg.abst[205] = -564339634;
        eg.abst[206] = 827772328;
        eg.abst[207] = -1418235951;
        eg.abst[208] = -857997304;
        eg.abst[209] = 913629117;
        eg.abst[210] = 2016190954;
        eg.abst[211] = -1705011280;
        eg.abst[212] = -1466439560;
        eg.abst[213] = 1681379884;
        eg.abst[214] = 1996088239;
        eg.abst[215] = -1440343866;
        eg.abst[216] = 446781994;
        eg.abst[217] = 1262949639;
        eg.abst[218] = 1743105767;
        eg.abst[219] = 1269902819;
        eg.abst[220] = -1048433930;
        eg.abst[221] = 458081933;
        eg.abst[222] = 960336768;
        eg.abst[223] = -502354548;
        eg.abst[224] = -1967265849;
        eg.abst[225] = 1664403321;
        eg.abst[226] = -869530789;
        eg.abst[227] = -1630785298;
        eg.abst[228] = 1942816054;
        eg.abst[229] = -1373504266;
        eg.abst[230] = -562460356;
        eg.abst[231] = 694464787;
        eg.abst[232] = 1347613351;
        eg.abst[233] = 1777162015;
        eg.abst[234] = 1649354471;
        eg.abst[235] = -1028126106;
        eg.abst[236] = -1468456963;
        eg.abst[237] = 1262018804;
        eg.abst[238] = 1912247718;
        eg.abst[239] = -1113667805;
        eg.abst[240] = -1845623994;
        eg.abst[241] = -1892734522;
        eg.abst[242] = 1372199667;
        eg.abst[243] = -499099886;
        eg.abst[244] = 2072932013;
        eg.abst[245] = 701521583;
        eg.abst[246] = 1725764622;
        eg.abst[247] = 1185133470;
        eg.abst[248] = -1497394190;
        eg.abst[249] = 1829009107;
        eg.abst[250] = 1951786731;
        eg.abst[251] = -195153993;
        eg.abst[252] = 544497788;
        eg.abst[253] = 384655337;
        eg.abst[254] = 168136300;
        eg.abst[255] = -963580167;
        eg.abst[256] = -876137006;
        eg.abst[257] = 1227528550;
        eg.abst[258] = -785016975;
        eg.abst[259] = -1192150481;
        eg.abst[260] = 1103827619;
        eg.abst[261] = -1418036559;
        eg.abst[262] = -1153278687;
        eg.abst[263] = 1880975217;
        eg.abst[264] = 1161397758;
        eg.abst[265] = -1278625194;
        eg.abst[266] = -1709512021;
        eg.abst[267] = -7231237;
        eg.abst[268] = 2088931493;
        eg.abst[269] = -942934332;
        eg.abst[270] = -340886775;
        eg.abst[271] = 1358369510;
        eg.abst[272] = -365268983;
        eg.abst[273] = -985560749;
        eg.abst[274] = -1830410391;
        eg.abst[275] = 1028512395;
        eg.abst[276] = -2065704177;
        eg.abst[277] = -353443046;
        eg.abst[278] = 2074133429;
        eg.abst[279] = 1696871680;
        eg.abst[280] = 1648522742;
        eg.abst[281] = 289643092;
        eg.abst[282] = 497862212;
        eg.abst[283] = -1425355450;
        eg.abst[284] = -338658791;
        eg.abst[285] = 876312380;
        eg.abst[286] = -1873345195;
        eg.abst[287] = -752223176;
        eg.abst[288] = 59300014;
        eg.abst[289] = 507308592;
        eg.abst[290] = -685767742;
        eg.abst[291] = 1793527874;
        eg.abst[292] = 858604681;
        eg.abst[293] = -639703072;
        eg.abst[294] = -189667530;
        eg.abst[295] = -619664788;
        eg.abst[296] = 2087150801;
        eg.abst[297] = -1824704535;
        eg.abst[298] = 1369263107;
        eg.abst[299] = -335190120;
    }

    private static /* synthetic */ void aehb() {
        eg.abst[800] = -205212040;
        eg.abst[801] = -1294742829;
        eg.abst[802] = 1609018798;
        eg.abst[803] = 217145806;
        eg.abst[804] = 1268440033;
        eg.abst[805] = 1554984061;
        eg.abst[806] = -331045888;
        eg.abst[807] = 1066498043;
        eg.abst[808] = -1274948156;
        eg.abst[809] = -628208501;
        eg.abst[810] = 1858075071;
        eg.abst[811] = -128445838;
        eg.abst[812] = 1789580025;
        eg.abst[813] = -640361544;
        eg.abst[814] = -1942108287;
        eg.abst[815] = -513511347;
        eg.abst[816] = -1814402677;
        eg.abst[817] = 52762531;
        eg.abst[818] = -362610139;
        eg.abst[819] = 1897667456;
        eg.abst[820] = -1670073436;
        eg.abst[821] = 97214912;
        eg.abst[822] = -2008802786;
        eg.abst[823] = -1110758345;
        eg.abst[824] = -375605132;
        eg.abst[825] = -1232301805;
        eg.abst[826] = -962094293;
        eg.abst[827] = -2133676958;
        eg.abst[828] = -224269506;
        eg.abst[829] = -1278152448;
        eg.abst[830] = -782818419;
        eg.abst[831] = -1352116702;
        eg.abst[832] = -1661341488;
        eg.abst[833] = -1907077964;
        eg.abst[834] = 803444321;
        eg.abst[835] = 1063878741;
        eg.abst[836] = -1275379197;
        eg.abst[837] = 1866241525;
        eg.abst[838] = 568859571;
        eg.abst[839] = -1487901103;
        eg.abst[840] = -1602973646;
        eg.abst[841] = -1155656390;
        eg.abst[842] = 1761440400;
        eg.abst[843] = 361400469;
        eg.abst[844] = 922889598;
        eg.abst[845] = -1309186059;
        eg.abst[846] = 2059540406;
        eg.abst[847] = -259743147;
        eg.abst[848] = -2142093371;
        eg.abst[849] = 741547956;
        eg.abst[850] = 287790186;
        eg.abst[851] = 276950993;
        eg.abst[852] = 1374953820;
        eg.abst[853] = 1705917292;
        eg.abst[854] = 1014563887;
        eg.abst[855] = 756057592;
        eg.abst[856] = -1010897732;
        eg.abst[857] = 1415394743;
        eg.abst[858] = 1700522643;
        eg.abst[859] = -1932640006;
        eg.abst[860] = 994089676;
        eg.abst[861] = -530859659;
        eg.abst[862] = -1032807287;
        eg.abst[863] = -1390777891;
        eg.abst[864] = -2042416868;
        eg.abst[865] = -1890682325;
        eg.abst[866] = -569210843;
        eg.abst[867] = -1896388308;
        eg.abst[868] = 1290216753;
        eg.abst[869] = -1445646770;
        eg.abst[870] = -1654088812;
        eg.abst[871] = 806425811;
        eg.abst[872] = -914530660;
        eg.abst[873] = -1549047358;
        eg.abst[874] = 73721677;
        eg.abst[875] = 1245673550;
        eg.abst[876] = -1942567353;
        eg.abst[877] = 564010141;
        eg.abst[878] = 601862022;
        eg.abst[879] = -1247053054;
        eg.abst[880] = 1315763985;
        eg.abst[881] = 1586739759;
        eg.abst[882] = -523394840;
        eg.abst[883] = -1674770198;
        eg.abst[884] = 426566557;
        eg.abst[885] = 2017545286;
        eg.abst[886] = 123214981;
        eg.abst[887] = 198222198;
        eg.abst[888] = 434472295;
        eg.abst[889] = -1526270291;
        eg.abst[890] = 228183817;
        eg.abst[891] = -856919889;
        eg.abst[892] = 548006167;
    }

    private static /* synthetic */ void aehf() {
        eg.absz[0] = 2094117101775686576L;
        eg.absz[1] = -6866055856248892535L;
        eg.absz[2] = -6698417150362149445L;
        eg.absz[3] = 9099988470909528163L;
        eg.absz[4] = -8946477803299588092L;
        eg.absz[5] = 2330777071911000354L;
        eg.absz[6] = 908785076868111651L;
        eg.absz[7] = -180254037788587471L;
        eg.absz[8] = 4909136274486813539L;
        eg.absz[9] = -6784602203929067332L;
        eg.absz[10] = 1263781195616883738L;
        eg.absz[11] = 5415248351432429276L;
        eg.absz[12] = -7378614506025019123L;
        eg.absz[13] = 4212892521707923532L;
        eg.absz[14] = -5361097405229238205L;
        eg.absz[15] = 8537375916454122928L;
        eg.absz[16] = -7758645167066037180L;
        eg.absz[17] = -7089396866920350405L;
        eg.absz[18] = -1873409913330450767L;
        eg.absz[19] = 5070238259331601844L;
        eg.absz[20] = 3814593360526018386L;
        eg.absz[21] = 6687725372823920457L;
        eg.absz[22] = -4987231737887567985L;
        eg.absz[23] = -5660100875426500919L;
        eg.absz[24] = -7615246894253500270L;
        eg.absz[25] = -4868941078682257931L;
        eg.absz[26] = -484613158667454647L;
        eg.absz[27] = 3710338559829664804L;
        eg.absz[28] = -21840522033009153L;
        eg.absz[29] = 7578898672459092748L;
        eg.absz[30] = 5219225167082636200L;
        eg.absz[31] = -9107296702809435371L;
        eg.absz[32] = -7988368506930923056L;
        eg.absz[33] = -209846940805858672L;
        eg.absz[34] = 5065306630914877726L;
        eg.absz[35] = -7242265877459655651L;
        eg.absz[36] = 7918959018316230482L;
        eg.absz[37] = -7908937623464857517L;
        eg.absz[38] = 8102513518020539870L;
        eg.absz[39] = -6332979207999178580L;
        eg.absz[40] = -1520670781538931572L;
        eg.absz[41] = -8301445825376767538L;
        eg.absz[42] = -1258204593172643096L;
        eg.absz[43] = 4835275621936281805L;
        eg.absz[44] = -6479875373301108515L;
        eg.absz[45] = -4381584712527095238L;
        eg.absz[46] = 2066559853006837919L;
        eg.absz[47] = -1070407697012635771L;
        eg.absz[48] = 7144930960344848195L;
        eg.absz[49] = 8902991425395714884L;
        eg.absz[50] = 3379207180106502683L;
        eg.absz[51] = 33631171865118170L;
        eg.absz[52] = 9188717599242061492L;
        eg.absz[53] = -7113421261806548848L;
        eg.absz[54] = 4409633504887265133L;
        eg.absz[55] = -3667991687970078242L;
        eg.absz[56] = 8234552984491596848L;
        eg.absz[57] = 8128842061067194274L;
        eg.absz[58] = -3550319162162529690L;
        eg.absz[59] = 1257502930102818899L;
        eg.absz[60] = -6344703213132380320L;
        eg.absz[61] = -971877339338600714L;
        eg.absz[62] = -68327774631073815L;
        eg.absz[63] = 966390728368002757L;
        eg.absz[64] = 2747034840796471440L;
        eg.absz[65] = 6897832235885808218L;
        eg.absz[66] = -3358848486273966326L;
        eg.absz[67] = 2861276344975680434L;
        eg.absz[68] = -7973759384199259286L;
        eg.absz[69] = -7159792921478559672L;
        eg.absz[70] = 3399943804921554810L;
        eg.absz[71] = 3400275239684911213L;
        eg.absz[72] = 3150744473014909554L;
        eg.absz[73] = -7389647030167906985L;
        eg.absz[74] = -2377250353455913938L;
        eg.absz[75] = -3899640388478252066L;
        eg.absz[76] = 1156728912679071L;
        eg.absz[77] = 5100817616026484633L;
        eg.absz[78] = -7636425604653678940L;
        eg.absz[79] = 2426986167084964767L;
        eg.absz[80] = -2871811170555644658L;
        eg.absz[81] = -7540331476830003469L;
        eg.absz[82] = 8139258797870455988L;
        eg.absz[83] = -3757572081374310660L;
        eg.absz[84] = -1645844039510745936L;
        eg.absz[85] = 7007699550922449740L;
        eg.absz[86] = -8171285968512824641L;
        eg.absz[87] = -5937629577180998158L;
        eg.absz[88] = -4501255748603600409L;
        eg.absz[89] = -4669558234770419570L;
        eg.absz[90] = 5610909942365197934L;
        eg.absz[91] = 8112927878270436115L;
        eg.absz[92] = -610314417808656822L;
        eg.absz[93] = 7732649758734843743L;
        eg.absz[94] = -3710545721835861485L;
        eg.absz[95] = 6597449062005978850L;
        eg.absz[96] = -5149094971722719160L;
        eg.absz[97] = 4137604681422886182L;
        eg.absz[98] = 8882007648567805339L;
        eg.absz[99] = -6473811107079023897L;
    }

    private static /* synthetic */ void aegz() {
        eg.abst[600] = 1121007725;
        eg.abst[601] = 2145863359;
        eg.abst[602] = 1896040060;
        eg.abst[603] = -364504986;
        eg.abst[604] = -722513884;
        eg.abst[605] = 969538212;
        eg.abst[606] = -232029152;
        eg.abst[607] = -1226473262;
        eg.abst[608] = -589944010;
        eg.abst[609] = -1155494905;
        eg.abst[610] = 1123282848;
        eg.abst[611] = -681394323;
        eg.abst[612] = -63856609;
        eg.abst[613] = -1369136011;
        eg.abst[614] = 1512556655;
        eg.abst[615] = -1153603324;
        eg.abst[616] = -1978351063;
        eg.abst[617] = -2112892396;
        eg.abst[618] = -1916638122;
        eg.abst[619] = -84949160;
        eg.abst[620] = -1313450682;
        eg.abst[621] = 1744271748;
        eg.abst[622] = 827243884;
        eg.abst[623] = -1987265316;
        eg.abst[624] = 608147845;
        eg.abst[625] = -585636315;
        eg.abst[626] = 194522170;
        eg.abst[627] = 114909429;
        eg.abst[628] = -532516551;
        eg.abst[629] = 836770141;
        eg.abst[630] = -910636443;
        eg.abst[631] = 579043427;
        eg.abst[632] = -1402269722;
        eg.abst[633] = 0x21211CC1;
        eg.abst[634] = -1432192520;
        eg.abst[635] = -1477217924;
        eg.abst[636] = 555830650;
        eg.abst[637] = -69605361;
        eg.abst[638] = 735142916;
        eg.abst[639] = -1782115682;
        eg.abst[640] = 859898742;
        eg.abst[641] = -365083403;
        eg.abst[642] = -1784641271;
        eg.abst[643] = -9541303;
        eg.abst[644] = 1401326132;
        eg.abst[645] = 728017779;
        eg.abst[646] = 522776027;
        eg.abst[647] = -222472123;
        eg.abst[648] = -2122306840;
        eg.abst[649] = -1272555016;
        eg.abst[650] = 1287342451;
        eg.abst[651] = -1416210885;
        eg.abst[652] = -2138421505;
        eg.abst[653] = -928235174;
        eg.abst[654] = -1066918976;
        eg.abst[655] = -196673606;
        eg.abst[656] = 1644696840;
        eg.abst[657] = -644003317;
        eg.abst[658] = -1200754857;
        eg.abst[659] = 749120622;
        eg.abst[660] = 593990395;
        eg.abst[661] = 107976918;
        eg.abst[662] = 1952059715;
        eg.abst[663] = -1334194821;
        eg.abst[664] = -747460506;
        eg.abst[665] = 471157567;
        eg.abst[666] = 1065310889;
        eg.abst[667] = 752680286;
        eg.abst[668] = 2142423367;
        eg.abst[669] = -1030102413;
        eg.abst[670] = 524361172;
        eg.abst[671] = 1674775396;
        eg.abst[672] = 1690790835;
        eg.abst[673] = 344184165;
        eg.abst[674] = 1572877487;
        eg.abst[675] = -1933348375;
        eg.abst[676] = -2107128057;
        eg.abst[677] = -1035525271;
        eg.abst[678] = 232742520;
        eg.abst[679] = -1157050914;
        eg.abst[680] = -545721901;
        eg.abst[681] = 1677247365;
        eg.abst[682] = -1379909232;
        eg.abst[683] = 1084466455;
        eg.abst[684] = -1625673870;
        eg.abst[685] = 1861632268;
        eg.abst[686] = 1011339048;
        eg.abst[687] = 1690853193;
        eg.abst[688] = -1694650034;
        eg.abst[689] = 1760675691;
        eg.abst[690] = 1756377380;
        eg.abst[691] = -1829121477;
        eg.abst[692] = -799074225;
        eg.abst[693] = 940440286;
        eg.abst[694] = 20815760;
        eg.abst[695] = -1384785860;
        eg.abst[696] = -1994600754;
        eg.abst[697] = 125422041;
        eg.abst[698] = -1906829758;
        eg.abst[699] = 1035481764;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public float getRoundingRadius() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("aeel", abtd(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eg.absu("aeem", absr(int ), (int)845)) break;
            v0 /* !! */  = (long)eg.absu("aeen", absr(int ), (int)846);
        }
        var3_1 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("aeeo", abtd(int ), (int)236)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eg.absu("aeep", absr(int ), (int)847)) break;
            v1 /* !! */  = (long)eg.absu("aeeq", absr(int ), (int)848);
        }
        var2_2 /* !! */  = eg.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("aeer", abtd(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == eg.absu("aees", absr(int ), (int)849)) break;
                    v2 /* !! */  = (long)eg.absu("aeet", absr(int ), (int)850);
                }
                var1_3 = eg.a;
                if (var3_1) {
                    throw null;
                    return (float)eg.absu("aeeu", abtn(int ), (int)851);
                }
                if (var1_3 || var1_3) ** continue;
                return (float)eg.absu("aeev", abtn(int ), (int)852);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)eg.absu("aeew", absr(int ), (int)853);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)eg.absu("aeex", absr(int ), (int)854);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)eg.absu("aeey", absr(int ), (int)855);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eg.absu("aeez", absr(int ), (int)856);
        ** while (!var3_1)
lbl49:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int absr(int n2) {
        return abss[n2] ^ abst[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawLoginBackground(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adgm", abtd(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("adgn", absr(int ), (int)494)) break;
            v0 /* !! */  = (long)eg.absu("adgo", absr(int ), (int)495);
        }
        var9_5 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adgp", abtd(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("adgq", absr(int ), (int)496)) break;
            v1 /* !! */  = (long)eg.absu("adgr", absr(int ), (int)497);
        }
        var8_6 /* !! */  = eg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("adgs", abtd(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("adgt", absr(int ), (int)498)) break;
            v2 /* !! */  = (long)eg.absu("adgu", absr(int ), (int)499);
        }
        var7_7 = eg.a;
        if (var9_5) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var7_7 || var7_7) ** GOTO lbl21
        var5_8 = var1_1 + eg.absu("adgv", abtn(int ), (int)500);
        if (var7_7 || var7_7) ** GOTO lbl21
        var6_9 = var2_2 + eg.absu("adgw", abtn(int ), (int)501);
        if (var7_7 || var7_7) ** GOTO lbl21
        v3 = eg.absu("adgx", abtn(int ), (int)502);
        v4 = eg.absu("adgy", abtn(int ), (int)503);
        v5 = eg.absu("adgz", absr(int ), (int)504);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("adha", abtd(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == eg.absu("adhb", absr(int ), (int)505)) break;
            v6 /* !! */  = (long)eg.absu("adhc", absr(int ), (int)506);
        }
        v7 = dz.color((int)v5);
        v8 /* !! */  = eg.bn;
        if (true) ** GOTO lbl41
        block38: while (true) {
            v8 /* !! */  = (long)(eg.absu("adhe", abtd(int ), (int)136) - eg.absu("adhd", abtd(int ), (int)135));
lbl41:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2107958386: {
                    continue block38;
                }
                case -1808910952: {
                    break block38;
                }
            }
            break;
        }
        v9 = nd.multAlpha(v7, var4_4);
        v10 = eg.absu("adhf", absr(int ), (int)507);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("adhg", abtd(int ), (int)137)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == eg.absu("adhh", absr(int ), (int)508)) break;
            v11 /* !! */  = (long)eg.absu("adhi", absr(int ), (int)509);
        }
        ki.rect(var0, var5_8, var6_9, var3_3, (float)v3, (float)v4, v9, (boolean)v10);
        if (var7_7 || var7_7) ** GOTO lbl21
        if (var8_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v12 = eg.absu("adhj", abtn(int ), (int)510);
                v13 = eg.absu("adhk", abtn(int ), (int)511);
                v14 = eg.absu("adhl", abtn(int ), (int)512);
                v15 /* !! */  = eg.bn;
                if (true) ** GOTO lbl65
                block40: while (true) {
                    v15 /* !! */  = (long)(v16 - eg.absu("adhm", abtd(int ), (int)138));
lbl65:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2099351632: {
                            v16 = eg.absu("adhn", abtd(int ), (int)139);
                            continue block40;
                        }
                        case -1808910952: {
                            break block40;
                        }
                        case -1103450773: {
                            v16 = eg.absu("adho", abtd(int ), (int)140);
                            continue block40;
                        }
                        case 1942655334: {
                            v16 = eg.absu("adhp", abtd(int ), (int)141);
                            continue block40;
                        }
                    }
                    break;
                }
                v17 /* !! */  = eg.bn;
                if (true) ** GOTO lbl81
                block41: while (true) {
                    v17 /* !! */  = (long)(v18 - eg.absu("adhq", abtd(int ), (int)142));
lbl81:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1808910952: {
                            break block41;
                        }
                        case -1364233688: {
                            v18 = eg.absu("adhr", abtd(int ), (int)143);
                            continue block41;
                        }
                        case -645428539: {
                            v18 = eg.absu("adhs", abtd(int ), (int)144);
                            continue block41;
                        }
                    }
                    break;
                }
                v19 = nd.multAlpha(eg.LOGIN_BACKGROUND_BORDER_COLOR, var4_4);
                v20 = eg.absu("adht", absr(int ), (int)513);
                v21 /* !! */  = eg.bn;
                if (true) ** GOTO lbl96
                block42: while (true) {
                    v21 /* !! */  = (long)(eg.absu("adhv", abtd(int ), (int)146) - eg.absu("adhu", abtd(int ), (int)145));
lbl96:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1808910952: {
                            break block42;
                        }
                        case 17412108: {
                            continue block42;
                        }
                    }
                    break;
                }
                ki.outline(var0, var5_8, var6_9, var3_3, (float)v12, (float)v13, (float)v14, v19, (boolean)v20);
                if (var7_7 || var7_7) ** continue;
                return;
            }
            case 0: {
                var8_6 /* !! */  = (int)eg.absu("adiw", absr(int ), (int)514);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl109:
            // 2 sources

            case 1: {
                var8_6 /* !! */  = (int)eg.absu("adix", absr(int ), (int)515);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: {
                var8_6 /* !! */  = (int)eg.absu("adiy", absr(int ), (int)516);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl119:
            // 2 sources

            case 3: {
                do {
                    var8_6 /* !! */  = (int)eg.absu("adiz", absr(int ), (int)517);
                } while (!var9_5);
                throw null;
            }
            case 4: {
                var8_6 /* !! */  = (int)eg.absu("adja", absr(int ), (int)518);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl129:
            // 2 sources

            case 5: {
                var8_6 /* !! */  = (int)eg.absu("adjb", absr(int ), (int)519);
                if (var9_5) {
                    throw null;
                }
            }
lbl133:
            // 5 sources

            case 6: {
                var8_6 /* !! */  = (int)eg.absu("adjc", absr(int ), (int)520);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 7: {
                do {
                    var8_6 /* !! */  = (int)eg.absu("adjd", absr(int ), (int)521);
                } while (!var9_5);
                throw null;
            }
lbl143:
            // 2 sources

            case 8: {
                var8_6 /* !! */  = (int)eg.absu("adje", absr(int ), (int)522);
                if (!var9_5) ** GOTO lbl109
                throw null;
            }
lbl147:
            // 3 sources

            case 9: {
                var8_6 /* !! */  = (int)eg.absu("adjf", absr(int ), (int)523);
                if (!var9_5) ** GOTO lbl133
                throw null;
            }
            case 10: {
                var8_6 /* !! */  = (int)eg.absu("adjg", absr(int ), (int)524);
                if (!var9_5) ** GOTO lbl119
                throw null;
            }
            case 11: 
        }
        do {
            var8_6 /* !! */  = (int)eg.absu("adjh", absr(int ), (int)525);
        } while (!var9_5);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawRollingText(class_332 var0, ks var1_1, eg$RollingText var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, float var8_8, long var9_9) {
        block146: {
            block145: {
                var26_10 = eg.c;
                var25_11 /* !! */  = eg.b;
                var24_12 = eg.a;
                if (var26_10) {
                    throw null;
lbl6:
                    // 37 sources

                    return;
                }
                if (var24_12 || var24_12) ** GOTO lbl6
                if (var2_2.animating(var9_9)) break block145;
                if (var24_12 || var24_12) ** GOTO lbl6
                var2_2.finishIfNeeded(var9_9);
                if (var24_12 || var24_12) ** GOTO lbl6
                kq.text(var0, var1_1, var2_2.value(), var3_3, var4_4, var5_5, var6_6, (boolean)eg.absu("adwq", absr(int ), (int)723));
                if (var24_12 || var24_12) ** GOTO lbl6
                return;
            }
            if (var24_12 || var24_12) ** GOTO lbl6
            var11_13 = Math.min(1.0f, (float)(var9_9 - var2_2.switchAt()) / eg.absu("adwr", abtn(int ), (int)724));
            if (var24_12 || var24_12) ** GOTO lbl6
            var12_14 = eg.easeOutBack(var11_13);
            if (var24_12 || var24_12) ** GOTO lbl6
            var13_15 = var4_4 + var12_14 * eg.absu("adws", abtn(int ), (int)725);
            if (var24_12 || var24_12) ** GOTO lbl6
            var14_16 = var4_4 + (var12_14 - 1.0f) * eg.absu("adwt", abtn(int ), (int)726);
            if (var24_12 || var24_12) ** GOTO lbl6
            var15_17 = nd.multAlpha(var6_6, 1.0f - var11_13);
            if (var24_12 || var24_12) ** GOTO lbl6
            var16_18 = nd.multAlpha(var6_6, var11_13);
            if (var24_12 || var24_12) ** GOTO lbl6
            var17_19 = var2_2.previous();
            if (var24_12 || var24_12) ** GOTO lbl6
            var18_20 = var2_2.value();
            if (var24_12 || var24_12) ** GOTO lbl6
            var19_21 = Math.max(kq.width(var1_1, var17_19, var5_5), kq.width(var1_1, var18_20, var5_5)) + 1.0f;
            if (var24_12 || var24_12) ** GOTO lbl6
            kr.flush();
            if (var24_12 || var24_12) ** GOTO lbl6
            oq.push(var3_3, var7_7, var19_21, var8_8);
            if (var24_12 || var24_12) ** GOTO lbl6
            if (var17_19.length() == var18_20.length()) break block146;
            if (var24_12 || var24_12) ** GOTO lbl6
            kq.text(var0, var1_1, var17_19, var3_3, var13_15, var5_5, var15_17, (boolean)eg.absu("adwu", absr(int ), (int)727));
            if (var24_12 || var24_12) ** GOTO lbl6
            kq.text(var0, var1_1, var18_20, var3_3, var14_16, var5_5, var16_18, (boolean)eg.absu("adwv", absr(int ), (int)728));
            if (var24_12) ** GOTO lbl6
            if (var26_10) {
                throw null;
            }
            ** GOTO lbl86
        }
        if (var24_12 || var24_12) ** GOTO lbl6
        var20_22 = var3_3;
        if (var24_12 || var24_12) ** GOTO lbl6
        var21_23 = eg.absu("adww", absr(int ), (int)729);
        if (var24_12) ** GOTO lbl6
        block76: while (true) {
            block147: {
                if (var24_12 || var24_12) ** GOTO lbl6
                if (var21_23 >= var18_20.length()) ** GOTO lbl86
                if (var24_12 || var24_12) ** GOTO lbl6
                var22_24 = String.valueOf(var17_19.charAt((int)var21_23));
                if (var24_12 || var24_12) ** GOTO lbl6
                var23_25 = String.valueOf(var18_20.charAt((int)var21_23));
                if (var24_12 || var24_12) ** GOTO lbl6
                if (!var22_24.equals(var23_25)) break block147;
                if (var24_12 || var24_12) ** GOTO lbl6
                kq.text(var0, var1_1, var23_25, var20_22, var4_4, var5_5, var6_6, (boolean)eg.absu("adwx", absr(int ), (int)730));
                if (var24_12) ** GOTO lbl6
                if (var26_10) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            if (var24_12 || var24_12) ** GOTO lbl6
            kq.text(var0, var1_1, var22_24, var20_22, var13_15, var5_5, var15_17, (boolean)eg.absu("adwy", absr(int ), (int)731));
            if (var24_12 || var24_12) ** GOTO lbl6
            kq.text(var0, var1_1, var23_25, var20_22, var14_16, var5_5, var16_18, (boolean)eg.absu("adwz", absr(int ), (int)732));
            if (var24_12) ** GOTO lbl6
            if (var25_11 /* !! */  == 0) ** GOTO lbl-1000
            switch (var25_11 /* !! */ ) {
                default: lbl-1000:
                // 3 sources

                {
                    if (var24_12 || var24_12) ** GOTO lbl6
                    var20_22 += kq.width(var1_1, var23_25, var5_5);
                    if (var24_12 || var24_12) ** GOTO lbl6
                    ++var21_23;
                    if (var24_12) ** GOTO lbl6
                    if (!var26_10) continue block76;
                    throw null;
                }
lbl86:
                // 2 sources

                if (var24_12 || var24_12) ** GOTO lbl6
                kr.flush();
                if (var24_12 || var24_12) ** GOTO lbl6
                oq.pop();
                if (!var24_12 && !var24_12) ** break;
                ** continue;
                return;
lbl93:
                // 2 sources

                case 0: {
                    do {
                        var25_11 /* !! */  = (int)eg.absu("adxa", absr(int ), (int)733);
                    } while (!var26_10);
                    throw null;
                }
lbl98:
                // 2 sources

                case 1: {
                    var25_11 /* !! */  = (int)eg.absu("adxb", absr(int ), (int)734);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
lbl103:
                // 2 sources

                case 2: {
                    var25_11 /* !! */  = (int)eg.absu("adxc", absr(int ), (int)735);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl108:
                // 3 sources

                case 3: {
                    var25_11 /* !! */  = (int)eg.absu("adxd", absr(int ), (int)736);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl113:
                // 2 sources

                case 4: {
                    var25_11 /* !! */  = (int)eg.absu("adxe", absr(int ), (int)737);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl374
                }
lbl118:
                // 2 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var25_11 /* !! */  = (int)eg.absu("adxf", absr(int ), (int)738);
                        if (!var26_10) ** GOTO lbl113
                        throw null;
                    }
                }
                case 6: {
                    var25_11 /* !! */  = (int)eg.absu("adxg", absr(int ), (int)739);
                    if (!var26_10) ** GOTO lbl93
                    throw null;
                }
lbl127:
                // 2 sources

                case 7: {
                    var25_11 /* !! */  = (int)eg.absu("adxh", absr(int ), (int)740);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl201
                }
lbl132:
                // 2 sources

                case 8: {
                    var25_11 /* !! */  = (int)eg.absu("adxi", absr(int ), (int)741);
                    if (!var26_10) ** GOTO lbl103
                    throw null;
                }
                case 9: {
                    var25_11 /* !! */  = (int)eg.absu("adxj", absr(int ), (int)742);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl358
                }
lbl141:
                // 2 sources

                case 10: {
                    var25_11 /* !! */  = (int)eg.absu("adxk", absr(int ), (int)743);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl146:
                // 5 sources

                case 11: {
                    var25_11 /* !! */  = (int)eg.absu("adxl", absr(int ), (int)744);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
lbl151:
                // 2 sources

                case 12: {
                    var25_11 /* !! */  = (int)eg.absu("adxm", absr(int ), (int)745);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
                case 13: {
                    var25_11 /* !! */  = (int)eg.absu("adxn", absr(int ), (int)746);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl394
                }
                case 14: {
                    var25_11 /* !! */  = (int)eg.absu("adxo", absr(int ), (int)747);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl166:
                // 4 sources

                case 15: {
                    var25_11 /* !! */  = (int)eg.absu("adxp", absr(int ), (int)748);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl406
                }
                case 16: {
                    var25_11 /* !! */  = (int)eg.absu("adxq", absr(int ), (int)749);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl346
                }
                case 17: {
                    var25_11 /* !! */  = (int)eg.absu("adxr", absr(int ), (int)750);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
lbl181:
                // 4 sources

                case 18: {
                    do {
                        var25_11 /* !! */  = (int)eg.absu("adxs", absr(int ), (int)751);
                    } while (!var26_10);
                    throw null;
                }
                case 19: {
                    var25_11 /* !! */  = (int)eg.absu("adxt", absr(int ), (int)752);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl402
                }
                case 20: {
                    var25_11 /* !! */  = (int)eg.absu("adxu", absr(int ), (int)753);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl386
                }
                case 21: {
                    var25_11 /* !! */  = (int)eg.absu("adxv", absr(int ), (int)754);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
lbl201:
                // 2 sources

                case 22: {
                    var25_11 /* !! */  = (int)eg.absu("adxw", absr(int ), (int)755);
                    if (!var26_10) ** GOTO lbl108
                    throw null;
                }
                case 23: {
                    var25_11 /* !! */  = (int)eg.absu("adxx", absr(int ), (int)756);
                    if (!var26_10) ** GOTO lbl181
                    throw null;
                }
lbl209:
                // 2 sources

                case 24: {
                    var25_11 /* !! */  = (int)eg.absu("adxy", absr(int ), (int)757);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
lbl214:
                // 2 sources

                case 25: {
                    var25_11 /* !! */  = (int)eg.absu("adxz", absr(int ), (int)758);
                    if (!var26_10) ** GOTO lbl146
                    throw null;
                }
lbl218:
                // 2 sources

                case 26: {
                    var25_11 /* !! */  = (int)eg.absu("adya", absr(int ), (int)759);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
                case 27: {
                    var25_11 /* !! */  = (int)eg.absu("adyb", absr(int ), (int)760);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
lbl228:
                // 2 sources

                case 28: {
                    var25_11 /* !! */  = (int)eg.absu("adyc", absr(int ), (int)761);
                    if (!var26_10) ** GOTO lbl181
                    throw null;
                }
lbl232:
                // 2 sources

                case 29: {
                    var25_11 /* !! */  = (int)eg.absu("adyd", absr(int ), (int)762);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl310
                }
lbl237:
                // 4 sources

                case 30: {
                    var25_11 /* !! */  = (int)eg.absu("adye", absr(int ), (int)763);
                    if (!var26_10) ** GOTO lbl228
                    throw null;
                }
                case 31: {
                    var25_11 /* !! */  = (int)eg.absu("adyf", absr(int ), (int)764);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl246:
                // 2 sources

                case 32: {
                    var25_11 /* !! */  = (int)eg.absu("adyg", absr(int ), (int)765);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl320
                }
                case 33: {
                    var25_11 /* !! */  = (int)eg.absu("adyh", absr(int ), (int)766);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl406
                }
lbl256:
                // 3 sources

                case 34: {
                    var25_11 /* !! */  = (int)eg.absu("adyi", absr(int ), (int)767);
                    if (!var26_10) ** GOTO lbl141
                    throw null;
                }
lbl260:
                // 4 sources

                case 35: {
                    var25_11 /* !! */  = (int)eg.absu("adyj", absr(int ), (int)768);
                    if (!var26_10) ** GOTO lbl237
                    throw null;
                }
                case 36: {
                    var25_11 /* !! */  = (int)eg.absu("adyk", absr(int ), (int)769);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl378
                }
                case 37: {
                    var25_11 /* !! */  = (int)eg.absu("adyl", absr(int ), (int)770);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl354
                }
lbl274:
                // 2 sources

                case 38: {
                    var25_11 /* !! */  = (int)eg.absu("adym", absr(int ), (int)771);
                    if (!var26_10) ** GOTO lbl127
                    throw null;
                }
                case 39: {
                    var25_11 /* !! */  = (int)eg.absu("adyn", absr(int ), (int)772);
                    if (!var26_10) ** GOTO lbl260
                    throw null;
                }
lbl282:
                // 3 sources

                case 40: {
                    var25_11 /* !! */  = (int)eg.absu("adyo", absr(int ), (int)773);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
                case 41: {
                    var25_11 /* !! */  = (int)eg.absu("adyp", absr(int ), (int)774);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl398
                }
lbl292:
                // 2 sources

                case 42: {
                    var25_11 /* !! */  = (int)eg.absu("adyq", absr(int ), (int)775);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl414
                }
lbl297:
                // 3 sources

                case 43: {
                    var25_11 /* !! */  = (int)eg.absu("adyr", absr(int ), (int)776);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl378
                }
                case 44: {
                    var25_11 /* !! */  = (int)eg.absu("adys", absr(int ), (int)777);
                    if (!var26_10) ** GOTO lbl151
                    throw null;
                }
lbl306:
                // 2 sources

                case 45: {
                    var25_11 /* !! */  = (int)eg.absu("adyt", absr(int ), (int)778);
                    if (!var26_10) ** GOTO lbl218
                    throw null;
                }
lbl310:
                // 2 sources

                case 46: {
                    var25_11 /* !! */  = (int)eg.absu("adyu", absr(int ), (int)779);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
lbl315:
                // 3 sources

                case 47: {
                    var25_11 /* !! */  = (int)eg.absu("adyv", absr(int ), (int)780);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl320:
                // 3 sources

                case 48: {
                    var25_11 /* !! */  = (int)eg.absu("adyw", absr(int ), (int)781);
                    if (!var26_10) ** GOTO lbl306
                    throw null;
                }
lbl324:
                // 3 sources

                case 49: {
                    var25_11 /* !! */  = (int)eg.absu("adyx", absr(int ), (int)782);
                    if (!var26_10) ** GOTO lbl98
                    throw null;
                }
lbl328:
                // 2 sources

                case 50: {
                    var25_11 /* !! */  = (int)eg.absu("adyy", absr(int ), (int)783);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl341
                }
lbl333:
                // 2 sources

                case 51: {
                    var25_11 /* !! */  = (int)eg.absu("adyz", absr(int ), (int)784);
                    if (!var26_10) ** GOTO lbl232
                    throw null;
                }
                case 52: {
                    var25_11 /* !! */  = (int)eg.absu("adza", absr(int ), (int)785);
                    if (!var26_10) ** GOTO lbl209
                    throw null;
                }
lbl341:
                // 2 sources

                case 53: {
                    var25_11 /* !! */  = (int)eg.absu("adzb", absr(int ), (int)786);
                    if (var26_10) {
                        throw null;
                    }
                    ** GOTO lbl406
                }
lbl346:
                // 2 sources

                case 54: {
                    var25_11 /* !! */  = (int)eg.absu("adzc", absr(int ), (int)787);
                    if (!var26_10) ** GOTO lbl260
                    throw null;
                }
lbl350:
                // 2 sources

                case 55: {
                    var25_11 /* !! */  = (int)eg.absu("adzd", absr(int ), (int)788);
                    if (!var26_10) ** GOTO lbl237
                    throw null;
                }
lbl354:
                // 2 sources

                case 56: {
                    var25_11 /* !! */  = (int)eg.absu("adze", absr(int ), (int)789);
                    if (!var26_10) ** GOTO lbl282
                    throw null;
                }
lbl358:
                // 2 sources

                case 57: {
                    var25_11 /* !! */  = (int)eg.absu("adzf", absr(int ), (int)790);
                    if (!var26_10) ** GOTO lbl292
                    throw null;
                }
                case 58: {
                    var25_11 /* !! */  = (int)eg.absu("adzg", absr(int ), (int)791);
                    if (!var26_10) ** GOTO lbl246
                    throw null;
                }
                case 59: {
                    var25_11 /* !! */  = (int)eg.absu("adzh", absr(int ), (int)792);
                    if (!var26_10) ** GOTO lbl108
                    throw null;
                }
lbl370:
                // 2 sources

                case 60: {
                    var25_11 /* !! */  = (int)eg.absu("adzi", absr(int ), (int)793);
                    if (!var26_10) ** GOTO lbl320
                    throw null;
                }
lbl374:
                // 2 sources

                case 61: {
                    var25_11 /* !! */  = (int)eg.absu("adzj", absr(int ), (int)794);
                    if (!var26_10) ** GOTO lbl166
                    throw null;
                }
lbl378:
                // 3 sources

                case 62: {
                    var25_11 /* !! */  = (int)eg.absu("adzk", absr(int ), (int)795);
                    if (!var26_10) ** GOTO lbl370
                    throw null;
                }
                case 63: {
                    var25_11 /* !! */  = (int)eg.absu("adzl", absr(int ), (int)796);
                    if (!var26_10) ** GOTO lbl214
                    throw null;
                }
lbl386:
                // 2 sources

                case 64: {
                    var25_11 /* !! */  = (int)eg.absu("adzm", absr(int ), (int)797);
                    if (!var26_10) ** GOTO lbl256
                    throw null;
                }
                case 65: {
                    var25_11 /* !! */  = (int)eg.absu("adzn", absr(int ), (int)798);
                    if (!var26_10) ** GOTO lbl328
                    throw null;
                }
lbl394:
                // 2 sources

                case 66: {
                    var25_11 /* !! */  = (int)eg.absu("adzo", absr(int ), (int)799);
                    if (!var26_10) ** GOTO lbl181
                    throw null;
                }
lbl398:
                // 2 sources

                case 67: {
                    var25_11 /* !! */  = (int)eg.absu("adzp", absr(int ), (int)800);
                    if (!var26_10) ** GOTO lbl146
                    throw null;
                }
lbl402:
                // 2 sources

                case 68: {
                    var25_11 /* !! */  = (int)eg.absu("adzq", absr(int ), (int)801);
                    if (!var26_10) ** GOTO lbl146
                    throw null;
                }
lbl406:
                // 4 sources

                case 69: {
                    var25_11 /* !! */  = (int)eg.absu("adzr", absr(int ), (int)802);
                    if (!var26_10) ** GOTO lbl274
                    throw null;
                }
                case 70: {
                    var25_11 /* !! */  = (int)eg.absu("adzs", absr(int ), (int)803);
                    if (!var26_10) ** GOTO lbl146
                    throw null;
                }
lbl414:
                // 3 sources

                case 71: {
                    var25_11 /* !! */  = (int)eg.absu("adzt", absr(int ), (int)804);
                    if (!var26_10) ** GOTO lbl118
                    throw null;
                }
                case 72: 
            }
            break;
        }
        var25_11 /* !! */  = (int)eg.absu("adzu", absr(int ), (int)805);
        ** while (!var26_10)
lbl421:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aegx() {
        eg.abst[400] = -143667858;
        eg.abst[401] = -2070952781;
        eg.abst[402] = 864440542;
        eg.abst[403] = 708060031;
        eg.abst[404] = -990465322;
        eg.abst[405] = 1121811152;
        eg.abst[406] = 386383929;
        eg.abst[407] = 593342812;
        eg.abst[408] = 1421121025;
        eg.abst[409] = -1472986197;
        eg.abst[410] = -2004772884;
        eg.abst[411] = -964723497;
        eg.abst[412] = 1717843732;
        eg.abst[413] = -1717167969;
        eg.abst[414] = -748579314;
        eg.abst[415] = 403866036;
        eg.abst[416] = 1421141834;
        eg.abst[417] = -609084056;
        eg.abst[418] = 549970878;
        eg.abst[419] = -1078419931;
        eg.abst[420] = 86653739;
        eg.abst[421] = -1903445935;
        eg.abst[422] = -88263560;
        eg.abst[423] = 1071473043;
        eg.abst[424] = -1509413892;
        eg.abst[425] = -1599846254;
        eg.abst[426] = -2032466262;
        eg.abst[427] = -103906402;
        eg.abst[428] = -1059137146;
        eg.abst[429] = -667531422;
        eg.abst[430] = -919754998;
        eg.abst[431] = 726463483;
        eg.abst[432] = -1519930182;
        eg.abst[433] = 728607215;
        eg.abst[434] = 187077599;
        eg.abst[435] = -821743897;
        eg.abst[436] = -1616887844;
        eg.abst[437] = -1870317293;
        eg.abst[438] = -936267664;
        eg.abst[439] = 1780968819;
        eg.abst[440] = 1797261606;
        eg.abst[441] = 775777587;
        eg.abst[442] = -887714462;
        eg.abst[443] = -1835591613;
        eg.abst[444] = -1357968466;
        eg.abst[445] = -934354556;
        eg.abst[446] = 1786657634;
        eg.abst[447] = 1374983417;
        eg.abst[448] = -1236890521;
        eg.abst[449] = -59466627;
        eg.abst[450] = -33449089;
        eg.abst[451] = 2024821803;
        eg.abst[452] = -1177655062;
        eg.abst[453] = 1963708019;
        eg.abst[454] = -2087875901;
        eg.abst[455] = 1596855733;
        eg.abst[456] = 1462459227;
        eg.abst[457] = -1173743491;
        eg.abst[458] = 1881228333;
        eg.abst[459] = 1177983837;
        eg.abst[460] = -1984499610;
        eg.abst[461] = 1255069338;
        eg.abst[462] = 1575330018;
        eg.abst[463] = -1837626912;
        eg.abst[464] = -214411870;
        eg.abst[465] = 1641371613;
        eg.abst[466] = 1729259637;
        eg.abst[467] = 1614620523;
        eg.abst[468] = 114001646;
        eg.abst[469] = -778665395;
        eg.abst[470] = -2139238066;
        eg.abst[471] = 1709307320;
        eg.abst[472] = -828713865;
        eg.abst[473] = -862310694;
        eg.abst[474] = -442650334;
        eg.abst[475] = -828651604;
        eg.abst[476] = -30217073;
        eg.abst[477] = 556475043;
        eg.abst[478] = -1028509704;
        eg.abst[479] = -2126701664;
        eg.abst[480] = -1437458390;
        eg.abst[481] = 448383959;
        eg.abst[482] = -1110881814;
        eg.abst[483] = 1678742460;
        eg.abst[484] = -1493419368;
        eg.abst[485] = 534203726;
        eg.abst[486] = 1681574087;
        eg.abst[487] = -1661793903;
        eg.abst[488] = 1604363134;
        eg.abst[489] = -1329011049;
        eg.abst[490] = -758015633;
        eg.abst[491] = 224187751;
        eg.abst[492] = -1459974034;
        eg.abst[493] = 1217225954;
        eg.abst[494] = -1106376968;
        eg.abst[495] = 420010098;
        eg.abst[496] = -758375721;
        eg.abst[497] = -1730425046;
        eg.abst[498] = -1039771218;
        eg.abst[499] = -1464080339;
    }

    public static /* synthetic */ CallSite absu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawLogo(class_332 var0, float var1_1, float var2_2, float var3_3) {
        var15_4 = eg.c;
        var14_5 /* !! */  = eg.b;
        var13_6 = eg.a;
        if (var15_4) {
            throw null;
lbl6:
            // 20 sources

            return;
        }
        if (var13_6 || var13_6) ** GOTO lbl6
        var4_7 = var1_1 + eg.absu("adlt", abtn(int ), (int)561);
        if (var13_6 || var13_6) ** GOTO lbl6
        var5_8 = var2_2 + eg.absu("adlu", abtn(int ), (int)562);
        if (var13_6 || var13_6) ** GOTO lbl6
        ki.glow(var0, var4_7 + eg.absu("adlv", abtn(int ), (int)563), var5_8 + eg.absu("adly", abtn(int ), (int)564), (float)eg.absu("adma", abtn(int ), (int)565), nd.multAlpha(dz.color((int)eg.absu("admc", absr(int ), (int)566)), var3_3), (boolean)eg.absu("admd", absr(int ), (int)567));
        if (var13_6 || var13_6) ** GOTO lbl6
        var6_9 = kv.LOGO;
        if (var13_6 || var13_6) ** GOTO lbl6
        if (var6_9 == null) ** GOTO lbl26
        if (var14_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_6) ** GOTO lbl6
                v0 = var6_9.getGlyph((int)eg.absu("admf", absr(int ), (int)568));
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl28
            }
lbl26:
            // 1 sources

            if (var13_6 || var13_6) ** GOTO lbl6
            v0 = var7_10 = null;
lbl28:
            // 2 sources

            if (var13_6 || var13_6) ** GOTO lbl6
            if (var7_10 == null) ** GOTO lbl50
            if (var13_6) ** GOTO lbl6
            if (!(var7_10.width > 0.0f)) ** GOTO lbl50
            if (var13_6) ** GOTO lbl6
            if (!(var7_10.height > 0.0f)) ** GOTO lbl50
            if (var13_6 || var13_6) ** GOTO lbl6
            var8_11 = Math.min((float)(eg.absu("admg", abtn(int ), (int)569) / var7_10.width), (float)(eg.absu("admi", abtn(int ), (int)570) / var7_10.height));
            if (var13_6 || var13_6) ** GOTO lbl6
            var9_12 = var8_11 * var6_9.getEmSize();
            if (var13_6 || var13_6) ** GOTO lbl6
            var10_13 = var9_12 / var6_9.getEmSize();
            if (var13_6 || var13_6) ** GOTO lbl6
            var11_14 = var4_7 + (eg.absu("adml", abtn(int ), (int)571) - var7_10.width * var10_13) * eg.absu("admn", abtn(int ), (int)572);
            if (var13_6 || var13_6) ** GOTO lbl6
            var12_15 = var5_8 + (eg.absu("admp", abtn(int ), (int)573) - var7_10.height * var10_13) * eg.absu("adms", abtn(int ), (int)574);
            if (var13_6 || var13_6) ** GOTO lbl6
            kq.text(var0, var6_9, "A", var11_14 - var7_10.bearingX * var10_13, var12_15 - var6_9.getAscender() * var10_13 + var7_10.bearingY * var10_13, var9_12, nd.multAlpha(dz.color((int)eg.absu("admv", absr(int ), (int)575)), var3_3), (boolean)eg.absu("admx", absr(int ), (int)576));
            if (var13_6 || var13_6) ** GOTO lbl6
            if (var15_4) {
                throw null;
            }
            ** GOTO lbl53
lbl50:
            // 3 sources

            if (var13_6 || var13_6) ** GOTO lbl6
            ki.imageRegion(var0, var4_7, var5_8, (float)eg.absu("admz", abtn(int ), (int)577), (float)eg.absu("adna", abtn(int ), (int)578), eg.LOGO_TEXTURE, nd.multAlpha(dz.color((int)eg.absu("adnc", absr(int ), (int)579)), var3_3), 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, (boolean)eg.absu("adne", absr(int ), (int)580), (boolean)eg.absu("adng", absr(int ), (int)581));
            if (var13_6) ** GOTO lbl6
lbl53:
            // 2 sources

            if (!var13_6 && !var13_6) ** break;
            ** continue;
            return;
lbl56:
            // 2 sources

            case 0: {
                var14_5 /* !! */  = (int)eg.absu("adni", absr(int ), (int)582);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 1: {
                var14_5 /* !! */  = (int)eg.absu("adnk", absr(int ), (int)583);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl66:
            // 4 sources

            case 2: {
                var14_5 /* !! */  = (int)eg.absu("adnm", absr(int ), (int)584);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl71:
            // 2 sources

            case 3: {
                var14_5 /* !! */  = (int)eg.absu("adno", absr(int ), (int)585);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 4: {
                var14_5 /* !! */  = (int)eg.absu("adnq", absr(int ), (int)586);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl81:
            // 4 sources

            case 5: {
                var14_5 /* !! */  = (int)eg.absu("adns", absr(int ), (int)587);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: {
                var14_5 /* !! */  = (int)eg.absu("adnu", absr(int ), (int)588);
                if (!var15_4) ** GOTO lbl66
                throw null;
            }
            case 7: {
                var14_5 /* !! */  = (int)eg.absu("adnw", absr(int ), (int)589);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl95:
            // 3 sources

            case 8: {
                var14_5 /* !! */  = (int)eg.absu("adny", absr(int ), (int)590);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 9: {
                var14_5 /* !! */  = (int)eg.absu("adoa", absr(int ), (int)591);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl105:
            // 3 sources

            case 10: {
                var14_5 /* !! */  = (int)eg.absu("adoc", absr(int ), (int)592);
                if (!var15_4) break;
                throw null;
            }
            case 11: {
                var14_5 /* !! */  = (int)eg.absu("adoe", absr(int ), (int)593);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl114:
            // 4 sources

            case 12: {
                var14_5 /* !! */  = (int)eg.absu("adog", absr(int ), (int)594);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl119:
            // 2 sources

            case 13: {
                var14_5 /* !! */  = (int)eg.absu("adoh", absr(int ), (int)595);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl124:
            // 2 sources

            case 14: {
                var14_5 /* !! */  = (int)eg.absu("adok", absr(int ), (int)596);
                if (!var15_4) ** GOTO lbl71
                throw null;
            }
            case 15: {
                var14_5 /* !! */  = (int)eg.absu("adol", absr(int ), (int)597);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 16: {
                var14_5 /* !! */  = (int)eg.absu("adon", absr(int ), (int)598);
                if (!var15_4) ** GOTO lbl81
                throw null;
            }
            case 17: {
                var14_5 /* !! */  = (int)eg.absu("adop", absr(int ), (int)599);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl142:
            // 2 sources

            case 18: {
                var14_5 /* !! */  = (int)eg.absu("ador", absr(int ), (int)600);
                if (!var15_4) ** GOTO lbl81
                throw null;
            }
lbl146:
            // 2 sources

            case 19: {
                var14_5 /* !! */  = (int)eg.absu("adot", absr(int ), (int)601);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl151:
            // 2 sources

            case 20: {
                var14_5 /* !! */  = (int)eg.absu("adov", absr(int ), (int)602);
                if (!var15_4) ** GOTO lbl66
                throw null;
            }
lbl155:
            // 2 sources

            case 21: {
                var14_5 /* !! */  = (int)eg.absu("adox", absr(int ), (int)603);
                if (!var15_4) ** GOTO lbl66
                throw null;
            }
            case 22: {
                var14_5 /* !! */  = (int)eg.absu("adoz", absr(int ), (int)604);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl164:
            // 2 sources

            case 23: {
                var14_5 /* !! */  = (int)eg.absu("adpb", absr(int ), (int)605);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 24: {
                var14_5 /* !! */  = (int)eg.absu("adpd", absr(int ), (int)606);
                if (!var15_4) ** GOTO lbl56
                throw null;
            }
            case 25: {
                var14_5 /* !! */  = (int)eg.absu("adpe", absr(int ), (int)607);
                if (!var15_4) break;
                throw null;
            }
            case 26: {
                var14_5 /* !! */  = (int)eg.absu("adpg", absr(int ), (int)608);
                if (!var15_4) ** GOTO lbl105
                throw null;
            }
lbl181:
            // 2 sources

            case 27: {
                var14_5 /* !! */  = (int)eg.absu("adpi", absr(int ), (int)609);
                if (!var15_4) ** GOTO lbl164
                throw null;
            }
lbl185:
            // 4 sources

            case 28: {
                var14_5 /* !! */  = (int)eg.absu("adpk", absr(int ), (int)610);
                if (!var15_4) ** GOTO lbl81
                throw null;
            }
            case 29: {
                var14_5 /* !! */  = (int)eg.absu("adpm", absr(int ), (int)611);
                if (var15_4) {
                    throw null;
                }
            }
lbl193:
            // 4 sources

            case 30: {
                var14_5 /* !! */  = (int)eg.absu("adpn", absr(int ), (int)612);
                if (!var15_4) ** GOTO lbl95
                throw null;
            }
lbl197:
            // 5 sources

            case 31: {
                var14_5 /* !! */  = (int)eg.absu("adpp", absr(int ), (int)613);
                if (!var15_4) ** GOTO lbl105
                throw null;
            }
lbl201:
            // 3 sources

            case 32: {
                var14_5 /* !! */  = (int)eg.absu("adps", absr(int ), (int)614);
                if (!var15_4) ** GOTO lbl151
                throw null;
            }
lbl205:
            // 2 sources

            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_5 /* !! */  = (int)eg.absu("adpu", absr(int ), (int)615);
                    if (!var15_4) ** GOTO lbl142
                    throw null;
                }
            }
            case 34: {
                var14_5 /* !! */  = (int)eg.absu("adpw", absr(int ), (int)616);
                if (!var15_4) ** GOTO lbl185
                throw null;
            }
            case 35: {
                var14_5 /* !! */  = (int)eg.absu("adpz", absr(int ), (int)617);
                if (!var15_4) ** GOTO lbl201
                throw null;
            }
            case 36: {
                var14_5 /* !! */  = (int)eg.absu("adqb", absr(int ), (int)618);
                if (!var15_4) ** GOTO lbl114
                throw null;
            }
lbl222:
            // 2 sources

            case 37: {
                var14_5 /* !! */  = (int)eg.absu("adqd", absr(int ), (int)619);
                if (!var15_4) ** GOTO lbl124
                throw null;
            }
            case 38: 
        }
        var14_5 /* !! */  = (int)eg.absu("adqg", absr(int ), (int)620);
        ** while (!var15_4)
lbl229:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aehd() {
        eg.absy[100] = 5360763258077101582L;
        eg.absy[101] = -2774905312261291623L;
        eg.absy[102] = -118205908062237515L;
        eg.absy[103] = 3661785478648412256L;
        eg.absy[104] = 4398800927158759306L;
        eg.absy[105] = -8885882431386818979L;
        eg.absy[106] = 6375937035908558551L;
        eg.absy[107] = -3491763352406738941L;
        eg.absy[108] = -7945135215422800353L;
        eg.absy[109] = -8047839685552334711L;
        eg.absy[110] = -3893204670873686211L;
        eg.absy[111] = -5871127096875356885L;
        eg.absy[112] = -1705796871678822024L;
        eg.absy[113] = -8669258463330404664L;
        eg.absy[114] = -9171912065566621271L;
        eg.absy[115] = 6666688254585569762L;
        eg.absy[116] = 2094287420705069306L;
        eg.absy[117] = 6871969118596047043L;
        eg.absy[118] = -8003289878829378511L;
        eg.absy[119] = 8524615536423496888L;
        eg.absy[120] = 4914527468511921455L;
        eg.absy[121] = 246458301902441109L;
        eg.absy[122] = 1758745130481086314L;
        eg.absy[123] = 9035224050866179202L;
        eg.absy[124] = -5782865326711119759L;
        eg.absy[125] = -200047729776920602L;
        eg.absy[126] = -5002079694753709687L;
        eg.absy[127] = -2806722301689663994L;
        eg.absy[128] = -7308707526392860598L;
        eg.absy[129] = 9204128340592073735L;
        eg.absy[130] = -259088605569313147L;
        eg.absy[131] = -757298731975529494L;
        eg.absy[132] = 8073281462553213652L;
        eg.absy[133] = -2360610121457702584L;
        eg.absy[134] = -283922999430297376L;
        eg.absy[135] = 1748198610015174208L;
        eg.absy[136] = -7937837986286156722L;
        eg.absy[137] = 7852701974594560407L;
        eg.absy[138] = -8162234564545737457L;
        eg.absy[139] = -6874653185222631900L;
        eg.absy[140] = -6847360860450013575L;
        eg.absy[141] = 7987789160618417118L;
        eg.absy[142] = 5924024651988355597L;
        eg.absy[143] = 5213684550775891517L;
        eg.absy[144] = 8359910361897385753L;
        eg.absy[145] = 4785038486346367208L;
        eg.absy[146] = -7930462528911416501L;
        eg.absy[147] = 4761796635084620839L;
        eg.absy[148] = -3240442407057136554L;
        eg.absy[149] = -9048447695395101131L;
        eg.absy[150] = -3172808573764411967L;
        eg.absy[151] = -6541101904363170160L;
        eg.absy[152] = 3930803780644915803L;
        eg.absy[153] = -1544410839352077757L;
        eg.absy[154] = 4086729023922880116L;
        eg.absy[155] = 5841925250393279589L;
        eg.absy[156] = -8393500760588909438L;
        eg.absy[157] = 4064456388998567628L;
        eg.absy[158] = 7644677340907785640L;
        eg.absy[159] = 8281594103122309591L;
        eg.absy[160] = -7036052718717064280L;
        eg.absy[161] = -3081582599876252388L;
        eg.absy[162] = 3053785306178246406L;
        eg.absy[163] = -5372942635900430383L;
        eg.absy[164] = 8862630242112174221L;
        eg.absy[165] = -3446867604509633577L;
        eg.absy[166] = -267855329890553089L;
        eg.absy[167] = -4611680195012149546L;
        eg.absy[168] = -2139090893762244791L;
        eg.absy[169] = -7451271776197372693L;
        eg.absy[170] = -6552900724197689523L;
        eg.absy[171] = -4812662925389113045L;
        eg.absy[172] = -4158725827906366842L;
        eg.absy[173] = 7424045499381009069L;
        eg.absy[174] = 9033312895177075587L;
        eg.absy[175] = -7100870359151142173L;
        eg.absy[176] = 587922042024171048L;
        eg.absy[177] = 2604005606284230822L;
        eg.absy[178] = 276955723504778874L;
        eg.absy[179] = -2657199515629771735L;
        eg.absy[180] = -4135171856558006422L;
        eg.absy[181] = -3792095995592206053L;
        eg.absy[182] = 1108570765581989925L;
        eg.absy[183] = -8258273904858916594L;
        eg.absy[184] = -1315127853644433503L;
        eg.absy[185] = 2368778901097737770L;
        eg.absy[186] = -3329571657962711492L;
        eg.absy[187] = -2029358936032664875L;
        eg.absy[188] = 6521495017469472672L;
        eg.absy[189] = 1791047181595573077L;
        eg.absy[190] = 7037910593178229389L;
        eg.absy[191] = 7648843840318203802L;
        eg.absy[192] = 4516570637026219534L;
        eg.absy[193] = 6276364934554755675L;
        eg.absy[194] = 6813901242708552717L;
        eg.absy[195] = -7641007182079826662L;
        eg.absy[196] = -6395653724775346323L;
        eg.absy[197] = 7903654850598200386L;
        eg.absy[198] = -7221365669574593847L;
        eg.absy[199] = 1972157897081303689L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawLogoBackground(class_332 var0, float var1_1, float var2_2, float var3_3) {
        v0 /* !! */  = eg.bn;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(eg.absu("adeo", abtd(int ), (int)111) - eg.absu("aden", abtd(int ), (int)110));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808910952: {
                    break block44;
                }
                case -685065689: {
                    continue block44;
                }
            }
            break;
        }
        var8_4 = eg.c;
        v1 /* !! */  = eg.bn;
        if (true) ** GOTO lbl15
        block45: while (true) {
            v1 /* !! */  = (long)(v2 - eg.absu("adep", abtd(int ), (int)112));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1808910952: {
                    break block45;
                }
                case -1488916380: {
                    v2 = eg.absu("adeq", abtd(int ), (int)113);
                    continue block45;
                }
                case 1994151984: {
                    v2 = eg.absu("ader", abtd(int ), (int)114);
                    continue block45;
                }
            }
            break;
        }
        var7_5 /* !! */  = eg.b;
        v3 /* !! */  = eg.bn;
        if (true) ** GOTO lbl29
        block46: while (true) {
            v3 /* !! */  = (long)(eg.absu("adet", abtd(int ), (int)116) - eg.absu("ades", abtd(int ), (int)115));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1808910952: {
                    break block46;
                }
                case 2008663603: {
                    continue block46;
                }
            }
            break;
        }
        var6_6 = eg.a;
        if (var8_4) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var6_6 || var6_6) ** GOTO lbl37
        var4_7 = var1_1 + eg.absu("adeu", abtn(int ), (int)464);
        if (var6_6 || var6_6) ** GOTO lbl37
        var5_8 = var2_2 + eg.absu("adev", abtn(int ), (int)465);
        if (var6_6 || var6_6) ** GOTO lbl37
        v4 = eg.absu("adew", abtn(int ), (int)466);
        v5 = eg.absu("adex", abtn(int ), (int)467);
        v6 = eg.absu("adey", abtn(int ), (int)468);
        v7 = eg.absu("adez", absr(int ), (int)469);
        v8 /* !! */  = eg.bn;
        if (true) ** GOTO lbl52
        block48: while (true) {
            v8 /* !! */  = (long)(v9 - eg.absu("adfa", abtd(int ), (int)117));
lbl52:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1808910952: {
                    break block48;
                }
                case -1227381590: {
                    v9 = eg.absu("adfb", abtd(int ), (int)118);
                    continue block48;
                }
                case -793133863: {
                    v9 = eg.absu("adfc", abtd(int ), (int)119);
                    continue block48;
                }
                case -621608262: {
                    v9 = eg.absu("adfd", abtd(int ), (int)120);
                    continue block48;
                }
            }
            break;
        }
        v10 = dz.color((int)v7);
        v11 /* !! */  = eg.bn;
        if (true) ** GOTO lbl69
        block49: while (true) {
            v11 /* !! */  = (long)(v12 - eg.absu("adfe", abtd(int ), (int)121));
lbl69:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1808910952: {
                    break block49;
                }
                case -1723197857: {
                    v12 = eg.absu("adff", abtd(int ), (int)122);
                    continue block49;
                }
                case -1566420632: {
                    v12 = eg.absu("adfg", abtd(int ), (int)123);
                    continue block49;
                }
                case 13964783: {
                    v12 = eg.absu("adfh", abtd(int ), (int)124);
                    continue block49;
                }
            }
            break;
        }
        v13 = nd.multAlpha(v10, var3_3);
        v14 = eg.absu("adfi", absr(int ), (int)470);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adfj", abtd(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == eg.absu("adfk", absr(int ), (int)471)) break;
            v15 /* !! */  = (long)eg.absu("adfl", absr(int ), (int)472);
        }
        ki.rect(var0, var4_7, var5_8, (float)v4, (float)v5, (float)v6, v13, (boolean)v14);
        if (var6_6 || var6_6) ** GOTO lbl37
        v16 = eg.absu("adfm", abtn(int ), (int)473);
        v17 = eg.absu("adfn", abtn(int ), (int)474);
        v18 = eg.absu("adfo", abtn(int ), (int)475);
        v19 = eg.absu("adfp", abtn(int ), (int)476);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adfq", abtd(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == eg.absu("adfr", absr(int ), (int)477)) break;
            v20 /* !! */  = (long)eg.absu("adfs", absr(int ), (int)478);
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("adft", abtd(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == eg.absu("adfu", absr(int ), (int)479)) break;
            v21 /* !! */  = (long)eg.absu("adfv", absr(int ), (int)480);
        }
        v22 = nd.multAlpha(eg.LOGO_BACKGROUND_BORDER_COLOR, var3_3);
        v23 = eg.absu("adfw", absr(int ), (int)481);
        v24 /* !! */  = eg.bn;
        if (true) ** GOTO lbl110
        block53: while (true) {
            v24 /* !! */  = (long)(v25 - eg.absu("adfx", abtd(int ), (int)128));
lbl110:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1808910952: {
                    break block53;
                }
                case 794139368: {
                    v25 = eg.absu("adfy", abtd(int ), (int)129);
                    continue block53;
                }
                case 1302045732: {
                    v25 = eg.absu("adfz", abtd(int ), (int)130);
                    continue block53;
                }
            }
            break;
        }
        ki.outline(var0, var4_7, var5_8, (float)v16, (float)v17, (float)v18, (float)v19, v22, (boolean)v23);
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_6 || var6_6) ** continue;
                return;
            }
lbl125:
            // 2 sources

            case 0: {
                var7_5 /* !! */  = (int)eg.absu("adga", absr(int ), (int)482);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl130:
            // 2 sources

            case 1: {
                var7_5 /* !! */  = (int)eg.absu("adgb", absr(int ), (int)483);
                if (var8_4) {
                    throw null;
                }
            }
            case 2: {
                var7_5 /* !! */  = (int)eg.absu("adgc", absr(int ), (int)484);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl139:
            // 3 sources

            case 3: {
                var7_5 /* !! */  = (int)eg.absu("adgd", absr(int ), (int)485);
                if (!var8_4) break;
                throw null;
            }
lbl143:
            // 2 sources

            case 4: {
                var7_5 /* !! */  = (int)eg.absu("adge", absr(int ), (int)486);
                if (!var8_4) ** GOTO lbl125
                throw null;
            }
lbl147:
            // 2 sources

            case 5: {
                var7_5 /* !! */  = (int)eg.absu("adgf", absr(int ), (int)487);
                if (!var8_4) ** GOTO lbl143
                throw null;
            }
lbl151:
            // 4 sources

            case 6: {
                var7_5 /* !! */  = (int)eg.absu("adgg", absr(int ), (int)488);
                if (!var8_4) ** GOTO lbl139
                throw null;
            }
            case 7: {
                var7_5 /* !! */  = (int)eg.absu("adgh", absr(int ), (int)489);
                if (!var8_4) ** GOTO lbl151
                throw null;
            }
            case 8: {
                var7_5 /* !! */  = (int)eg.absu("adgi", absr(int ), (int)490);
                if (!var8_4) ** GOTO lbl147
                throw null;
            }
            case 9: {
                var7_5 /* !! */  = (int)eg.absu("adgj", absr(int ), (int)491);
                if (!var8_4) ** GOTO lbl130
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_5 /* !! */  = (int)eg.absu("adgk", absr(int ), (int)492);
                    if (!var8_4) ** GOTO lbl151
                    throw null;
                }
            }
            case 11: 
        }
        var7_5 /* !! */  = (int)eg.absu("adgl", absr(int ), (int)493);
        ** while (!var8_4)
lbl175:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aegp() {
        eg.abss[500] = -802850995;
        eg.abss[501] = 144752984;
        eg.abss[502] = 1595460465;
        eg.abss[503] = -907691628;
        eg.abss[504] = 533660425;
        eg.abss[505] = -503346799;
        eg.abss[506] = -260463601;
        eg.abss[507] = 497420677;
        eg.abss[508] = -1146447272;
        eg.abss[509] = 774647278;
        eg.abss[510] = -651155434;
        eg.abss[511] = 1569794383;
        eg.abss[512] = -1412422969;
        eg.abss[513] = -1916313425;
        eg.abss[514] = -1044315419;
        eg.abss[515] = -2019511401;
        eg.abss[516] = -1772526007;
        eg.abss[517] = -1641922361;
        eg.abss[518] = -848704953;
        eg.abss[519] = 1774059723;
        eg.abss[520] = 1884535171;
        eg.abss[521] = -1656489410;
        eg.abss[522] = 1898254170;
        eg.abss[523] = 1957671447;
        eg.abss[524] = 817427629;
        eg.abss[525] = -601758503;
        eg.abss[526] = -826411127;
        eg.abss[527] = 2003489566;
        eg.abss[528] = -1369953617;
        eg.abss[529] = -1866843464;
        eg.abss[530] = 279221593;
        eg.abss[531] = -1877855737;
        eg.abss[532] = 1762692694;
        eg.abss[533] = 433096295;
        eg.abss[534] = 402442841;
        eg.abss[535] = -1681198086;
        eg.abss[536] = -627981635;
        eg.abss[537] = 13895034;
        eg.abss[538] = -2054339590;
        eg.abss[539] = -441026215;
        eg.abss[540] = 235722074;
        eg.abss[541] = -5217843;
        eg.abss[542] = 1247297581;
        eg.abss[543] = 1115219068;
        eg.abss[544] = -1958866090;
        eg.abss[545] = 314058454;
        eg.abss[546] = -1406482828;
        eg.abss[547] = 156770619;
        eg.abss[548] = 11934065;
        eg.abss[549] = -2018555795;
        eg.abss[550] = 2056481045;
        eg.abss[551] = -594812759;
        eg.abss[552] = 30216272;
        eg.abss[553] = -1448027100;
        eg.abss[554] = 1193025214;
        eg.abss[555] = 1201538315;
        eg.abss[556] = 1795523814;
        eg.abss[557] = 1266029174;
        eg.abss[558] = 1639983933;
        eg.abss[559] = 1045754128;
        eg.abss[560] = -885852251;
        eg.abss[561] = -265741517;
        eg.abss[562] = 2076818562;
        eg.abss[563] = 1903921610;
        eg.abss[564] = -1824392825;
        eg.abss[565] = -1365490103;
        eg.abss[566] = -243426692;
        eg.abss[567] = -1068903063;
        eg.abss[568] = 241080672;
        eg.abss[569] = 2142603003;
        eg.abss[570] = -394267067;
        eg.abss[571] = -1020215266;
        eg.abss[572] = -575078816;
        eg.abss[573] = -1501380471;
        eg.abss[574] = 430341567;
        eg.abss[575] = 1384497549;
        eg.abss[576] = -1047428683;
        eg.abss[577] = -124298117;
        eg.abss[578] = -649932505;
        eg.abss[579] = -1734882840;
        eg.abss[580] = 1060982497;
        eg.abss[581] = 664202724;
        eg.abss[582] = 1335536750;
        eg.abss[583] = -39996051;
        eg.abss[584] = -658826026;
        eg.abss[585] = 1249103343;
        eg.abss[586] = 1988308558;
        eg.abss[587] = 1165204651;
        eg.abss[588] = -97900638;
        eg.abss[589] = -1296755257;
        eg.abss[590] = 691930901;
        eg.abss[591] = 1044391589;
        eg.abss[592] = 265712409;
        eg.abss[593] = -594976162;
        eg.abss[594] = 523829640;
        eg.abss[595] = -1807529468;
        eg.abss[596] = 140356571;
        eg.abss[597] = 1617768005;
        eg.abss[598] = -1377025325;
        eg.abss[599] = -655280244;
    }

    static {
        abss = new int[893];
        abst = new int[893];
        eg.aegk();
        eg.aegl();
        eg.aegm();
        eg.aegn();
        eg.aego();
        eg.aegp();
        eg.aegq();
        eg.aegr();
        eg.aegs();
        eg.aegt();
        eg.aegu();
        eg.aegv();
        eg.aegw();
        eg.aegx();
        eg.aegy();
        eg.aegz();
        eg.aeha();
        eg.aehb();
        absy = new long[238];
        absz = new long[238];
        eg.aehc();
        eg.aehd();
        eg.aehe();
        eg.aehf();
        eg.aehg();
        eg.aehh();
        TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
        LOGO_TEXTURE = class_2960.method_60655((String)"phobia", (String)"phobia.png");
        AVATAR_TEXTURE = class_2960.method_60655((String)"phobia", (String)"textures/newhud/avatar.png");
        BLACK_FILL = nd.rgba((int)eg.absu("aefa", absr(int ), (int)857), (int)eg.absu("aefb", absr(int ), (int)858), (int)eg.absu("aefc", absr(int ), (int)859), (int)eg.absu("aefd", absr(int ), (int)860));
        BORDER_COLOR = nd.rgba((int)eg.absu("aefe", absr(int ), (int)861), (int)eg.absu("aeff", absr(int ), (int)862), (int)eg.absu("aefg", absr(int ), (int)863), (int)eg.absu("aefh", absr(int ), (int)864));
        LOGO_BACKGROUND_BORDER_COLOR = nd.rgba((int)eg.absu("aefi", absr(int ), (int)865), (int)eg.absu("aefj", absr(int ), (int)866), (int)eg.absu("aefk", absr(int ), (int)867), (int)eg.absu("aefl", absr(int ), (int)868));
        LOGIN_BACKGROUND_BORDER_COLOR = nd.rgba((int)eg.absu("aefm", absr(int ), (int)869), (int)eg.absu("aefn", absr(int ), (int)870), (int)eg.absu("aefo", absr(int ), (int)871), (int)eg.absu("aefp", absr(int ), (int)872));
        TIME_BACKGROUND_BORDER_COLOR = nd.rgba((int)eg.absu("aefq", absr(int ), (int)873), (int)eg.absu("aefr", absr(int ), (int)874), (int)eg.absu("aefs", absr(int ), (int)875), (int)eg.absu("aeft", absr(int ), (int)876));
        USERNAME_COLOR = nd.rgba((int)eg.absu("aefu", absr(int ), (int)877), (int)eg.absu("aefv", absr(int ), (int)878), (int)eg.absu("aefw", absr(int ), (int)879), (int)eg.absu("aefx", absr(int ), (int)880));
        TIME_TEXT_COLOR = nd.rgba((int)eg.absu("aefy", absr(int ), (int)881), (int)eg.absu("aefz", absr(int ), (int)882), (int)eg.absu("aega", absr(int ), (int)883), (int)eg.absu("aegb", absr(int ), (int)884));
        LOWER_TEXT_COLOR = nd.rgba((int)eg.absu("aegc", absr(int ), (int)885), (int)eg.absu("aegd", absr(int ), (int)886), (int)eg.absu("aege", absr(int ), (int)887), (int)eg.absu("aegf", absr(int ), (int)888));
        LOWER_SUFFIX_COLOR = nd.rgba((int)eg.absu("aegg", absr(int ), (int)889), (int)eg.absu("aegh", absr(int ), (int)890), (int)eg.absu("aegi", absr(int ), (int)891), (int)eg.absu("aegj", absr(int ), (int)892));
    }

    private static /* synthetic */ void aehh() {
        eg.absz[200] = 107402123059752461L;
        eg.absz[201] = -2983812553811290708L;
        eg.absz[202] = -8471594234209399065L;
        eg.absz[203] = 1644969909378467310L;
        eg.absz[204] = 3670214218811207494L;
        eg.absz[205] = -8172623739452018186L;
        eg.absz[206] = 6974212656248224901L;
        eg.absz[207] = -1963897212107233070L;
        eg.absz[208] = -8405059935283169856L;
        eg.absz[209] = 6889182386959751791L;
        eg.absz[210] = 1706481645595237296L;
        eg.absz[211] = -1092806614320609133L;
        eg.absz[212] = -479591522615017416L;
        eg.absz[213] = -5914632186126740898L;
        eg.absz[214] = 9001672094266350820L;
        eg.absz[215] = -74053450864079274L;
        eg.absz[216] = 7014626399967407645L;
        eg.absz[217] = -5355836890247360883L;
        eg.absz[218] = 6604935680051790548L;
        eg.absz[219] = 8085523382785915516L;
        eg.absz[220] = 3213148730238250739L;
        eg.absz[221] = 2372892179502975290L;
        eg.absz[222] = 7992708398736262694L;
        eg.absz[223] = -6114446170994116395L;
        eg.absz[224] = 3075863359109078352L;
        eg.absz[225] = 3218168238045632349L;
        eg.absz[226] = -3757414994761939423L;
        eg.absz[227] = 8360668967033371688L;
        eg.absz[228] = -232043945971741147L;
        eg.absz[229] = 6542842777422198988L;
        eg.absz[230] = 3756621458148248143L;
        eg.absz[231] = -7369164392368133688L;
        eg.absz[232] = 7814274452975741958L;
        eg.absz[233] = -1031499684336406782L;
        eg.absz[234] = 4943402007218543888L;
        eg.absz[235] = 6284549192237063788L;
        eg.absz[236] = 8761559495805549689L;
        eg.absz[237] = 4216879284795857467L;
    }

    private static /* synthetic */ void aegy() {
        eg.abst[500] = -1845577622;
        eg.abst[501] = 1217200191;
        eg.abst[502] = 511753717;
        eg.abst[503] = -1991279159;
        eg.abst[504] = 533660443;
        eg.abst[505] = -503346800;
        eg.abst[506] = -1907348797;
        eg.abst[507] = 497420677;
        eg.abst[508] = 1146447271;
        eg.abst[509] = 670498408;
        eg.abst[510] = -1733796206;
        eg.abst[511] = 490466578;
        eg.abst[512] = -1795496294;
        eg.abst[513] = -1916313425;
        eg.abst[514] = -1044315424;
        eg.abst[515] = -2019511401;
        eg.abst[516] = -1772526014;
        eg.abst[517] = -1641922354;
        eg.abst[518] = -848704947;
        eg.abst[519] = 1774059712;
        eg.abst[520] = 1884535177;
        eg.abst[521] = -1656489417;
        eg.abst[522] = 1898254174;
        eg.abst[523] = 1957671441;
        eg.abst[524] = 817427621;
        eg.abst[525] = -601758511;
        eg.abst[526] = 826411126;
        eg.abst[527] = -192562268;
        eg.abst[528] = 1369953616;
        eg.abst[529] = -211869800;
        eg.abst[530] = -279221594;
        eg.abst[531] = 761425684;
        eg.abst[532] = 691883825;
        eg.abst[533] = 1481175267;
        eg.abst[534] = 1465257476;
        eg.abst[535] = -1681198104;
        eg.abst[536] = 627981634;
        eg.abst[537] = -210269332;
        eg.abst[538] = -2054339590;
        eg.abst[539] = 441026214;
        eg.abst[540] = -1110810358;
        eg.abst[541] = -1104668855;
        eg.abst[542] = 183665776;
        eg.abst[543] = 2102534177;
        eg.abst[544] = 1958866089;
        eg.abst[545] = -827627888;
        eg.abst[546] = -1406482828;
        eg.abst[547] = -156770620;
        eg.abst[548] = 310447751;
        eg.abst[549] = -2018555798;
        eg.abst[550] = 2056481055;
        eg.abst[551] = -594812768;
        eg.abst[552] = 30216280;
        eg.abst[553] = -1448027092;
        eg.abst[554] = 1193025212;
        eg.abst[555] = 1201538316;
        eg.abst[556] = 1795523813;
        eg.abst[557] = 1266029180;
        eg.abst[558] = 1639983927;
        eg.abst[559] = 1045754138;
        eg.abst[560] = -885852253;
        eg.abst[561] = -1323249001;
        eg.abst[562] = 986373829;
        eg.abst[563] = 836923029;
        eg.abst[564] = -750850858;
        eg.abst[565] = -270771551;
        eg.abst[566] = -243426740;
        eg.abst[567] = -1068903063;
        eg.abst[568] = 241080609;
        eg.abst[569] = 1051484580;
        eg.abst[570] = -1467948268;
        eg.abst[571] = -2111232191;
        eg.abst[572] = -491192736;
        eg.abst[573] = -427960872;
        eg.abst[574] = 648445375;
        eg.abst[575] = 1384497522;
        eg.abst[576] = -1047428683;
        eg.abst[577] = -1181828316;
        eg.abst[578] = -1715616650;
        eg.abst[579] = -1734883049;
        eg.abst[580] = 1060982497;
        eg.abst[581] = 664202724;
        eg.abst[582] = 1335536741;
        eg.abst[583] = -39996036;
        eg.abst[584] = -658826028;
        eg.abst[585] = 1249103340;
        eg.abst[586] = 1988308584;
        eg.abst[587] = 1165204671;
        eg.abst[588] = -97900666;
        eg.abst[589] = -1296755251;
        eg.abst[590] = 691930886;
        eg.abst[591] = 1044391604;
        eg.abst[592] = 265712391;
        eg.abst[593] = -594976170;
        eg.abst[594] = 523829661;
        eg.abst[595] = -1807529463;
        eg.abst[596] = 140356565;
        eg.abst[597] = 1617768029;
        eg.abst[598] = -1377025313;
        eg.abst[599] = -655280214;
    }

    private static /* synthetic */ void aegu() {
        eg.abst[100] = -80882311;
        eg.abst[101] = -1221801977;
        eg.abst[102] = -1340523249;
        eg.abst[103] = -1605978609;
        eg.abst[104] = -159664921;
        eg.abst[105] = 2041292274;
        eg.abst[106] = -627985378;
        eg.abst[107] = 332682308;
        eg.abst[108] = -1370727031;
        eg.abst[109] = -971947176;
        eg.abst[110] = 2619179;
        eg.abst[111] = 1187127229;
        eg.abst[112] = -923168427;
        eg.abst[113] = 28748788;
        eg.abst[114] = -1361335701;
        eg.abst[115] = 960540629;
        eg.abst[116] = -1936771164;
        eg.abst[117] = 1734672961;
        eg.abst[118] = -1200904122;
        eg.abst[119] = -181041134;
        eg.abst[120] = 1167886373;
        eg.abst[121] = -336854685;
        eg.abst[122] = 894314353;
        eg.abst[123] = 914966188;
        eg.abst[124] = -2013761259;
        eg.abst[125] = -1786496697;
        eg.abst[126] = -1531138501;
        eg.abst[127] = -162810032;
        eg.abst[128] = 447327404;
        eg.abst[129] = -808031992;
        eg.abst[130] = 1530619686;
        eg.abst[131] = 1623182881;
        eg.abst[132] = 1580612058;
        eg.abst[133] = -1070359660;
        eg.abst[134] = 1734912696;
        eg.abst[135] = -1627533570;
        eg.abst[136] = 10824755;
        eg.abst[137] = -668996977;
        eg.abst[138] = 73061011;
        eg.abst[139] = -1023793910;
        eg.abst[140] = -944175322;
        eg.abst[141] = -1978922121;
        eg.abst[142] = -1767921213;
        eg.abst[143] = 1688448616;
        eg.abst[144] = 2140674165;
        eg.abst[145] = 590875400;
        eg.abst[146] = -1638789545;
        eg.abst[147] = 1890877510;
        eg.abst[148] = -981760544;
        eg.abst[149] = 410770145;
        eg.abst[150] = 1659869234;
        eg.abst[151] = -369334499;
        eg.abst[152] = 2052391459;
        eg.abst[153] = 2814723;
        eg.abst[154] = -657638853;
        eg.abst[155] = -998997689;
        eg.abst[156] = 1614827968;
        eg.abst[157] = 613535990;
        eg.abst[158] = 954171387;
        eg.abst[159] = -568840887;
        eg.abst[160] = 1602411187;
        eg.abst[161] = 1633966636;
        eg.abst[162] = -1934846521;
        eg.abst[163] = 1522708798;
        eg.abst[164] = -190587170;
        eg.abst[165] = -817066724;
        eg.abst[166] = -1931195586;
        eg.abst[167] = -1660122478;
        eg.abst[168] = -1897715072;
        eg.abst[169] = -2006307105;
        eg.abst[170] = -1633698137;
        eg.abst[171] = 1460105022;
        eg.abst[172] = -929050075;
        eg.abst[173] = 1505859487;
        eg.abst[174] = 1545393211;
        eg.abst[175] = 1387568998;
        eg.abst[176] = 1869630344;
        eg.abst[177] = -184922234;
        eg.abst[178] = 1187969546;
        eg.abst[179] = 1809493501;
        eg.abst[180] = -1983674183;
        eg.abst[181] = -1364754216;
        eg.abst[182] = -1966757117;
        eg.abst[183] = -516388762;
        eg.abst[184] = 1816558478;
        eg.abst[185] = -228517441;
        eg.abst[186] = -1393686462;
        eg.abst[187] = -1143862495;
        eg.abst[188] = -742504724;
        eg.abst[189] = 1912276401;
        eg.abst[190] = 591642879;
        eg.abst[191] = 1543691425;
        eg.abst[192] = -915571659;
        eg.abst[193] = -1731817520;
        eg.abst[194] = -611632130;
        eg.abst[195] = -610465902;
        eg.abst[196] = 1564421637;
        eg.abst[197] = -2065855580;
        eg.abst[198] = 827360354;
        eg.abst[199] = 1237458699;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private eg$TextParts serverAddress() {
        var9_1 = eg.c;
        var8_2 /* !! */  = eg.b;
        var7_3 = eg.a;
        if (var9_1) {
            throw null;
lbl6:
            // 21 sources

            return null;
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var1_4 = this.mc.method_1562();
        if (var7_3 || var7_3) ** GOTO lbl6
        if (var1_4 != null) ** GOTO lbl20
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3) ** GOTO lbl6
                v0 = null;
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl22
            }
lbl20:
            // 1 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            v0 = var2_5 = var1_4.method_45734();
lbl22:
            // 2 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            if (var2_5 == null) ** GOTO lbl29
            if (var7_3) ** GOTO lbl6
            if (var2_5.field_3761 == null) ** GOTO lbl29
            if (var7_3) ** GOTO lbl6
            if (!var2_5.field_3761.isBlank()) ** GOTO lbl34
            if (var7_3) ** GOTO lbl6
lbl29:
            // 3 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            v1 = "singleplayer";
            if (var9_1) {
                throw null;
            }
            ** GOTO lbl36
lbl34:
            // 1 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            v1 = var3_6 = var2_5.field_3761.toLowerCase();
lbl36:
            // 2 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            var4_7 = var3_6.lastIndexOf((int)eg.absu("adai", absr(int ), (int)384));
            if (var7_3 || var7_3) ** GOTO lbl6
            var5_8 = var3_6.lastIndexOf((int)eg.absu("adaj", absr(int ), (int)385));
            if (var7_3 || var7_3) ** GOTO lbl6
            if (var5_8 <= var4_7) ** GOTO lbl47
            if (var7_3) ** GOTO lbl6
            v2 = var5_8;
            if (var9_1) {
                throw null;
            }
            ** GOTO lbl49
lbl47:
            // 1 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            v2 = var6_9 = var3_6.length();
lbl49:
            // 2 sources

            if (var7_3 || var7_3) ** GOTO lbl6
            if (var4_7 <= 0) ** GOTO lbl59
            if (var7_3) ** GOTO lbl6
            if (var6_9 - var4_7 <= eg.absu("adak", absr(int ), (int)386)) ** GOTO lbl59
            if (var7_3) ** GOTO lbl6
            if (var6_9 - var4_7 > eg.absu("adal", absr(int ), (int)387)) ** GOTO lbl59
            if (var7_3) ** GOTO lbl6
            if (!var3_6.substring(var4_7 + eg.absu("adam", absr(int ), (int)388), var6_9).chars().allMatch((IntPredicate)LambdaMetafactory.metafactory(null, null, null, (I)Z, isLetter(int ), (I)Z)())) ** GOTO lbl59
            if (var7_3 || var7_3) ** GOTO lbl6
            return new eg$TextParts(var3_6.substring((int)eg.absu("adan", absr(int ), (int)389), var4_7), var3_6.substring(var4_7));
lbl59:
            // 4 sources

            if (!var7_3 && !var7_3) ** break;
            ** continue;
            return new eg$TextParts(var3_6, "");
lbl62:
            // 3 sources

            case 0: {
                var8_2 /* !! */  = (int)eg.absu("adao", absr(int ), (int)390);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 1: {
                var8_2 /* !! */  = (int)eg.absu("adap", absr(int ), (int)391);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl72:
            // 3 sources

            case 2: {
                var8_2 /* !! */  = (int)eg.absu("adaq", absr(int ), (int)392);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl77:
            // 3 sources

            case 3: {
                var8_2 /* !! */  = (int)eg.absu("adar", absr(int ), (int)393);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl82:
            // 3 sources

            case 4: {
                var8_2 /* !! */  = (int)eg.absu("adas", absr(int ), (int)394);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 5: {
                var8_2 /* !! */  = (int)eg.absu("adat", absr(int ), (int)395);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl92:
            // 2 sources

            case 6: {
                var8_2 /* !! */  = (int)eg.absu("adau", absr(int ), (int)396);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 7: {
                var8_2 /* !! */  = (int)eg.absu("adav", absr(int ), (int)397);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 8: {
                var8_2 /* !! */  = (int)eg.absu("adaw", absr(int ), (int)398);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl107:
            // 3 sources

            case 9: {
                var8_2 /* !! */  = (int)eg.absu("adax", absr(int ), (int)399);
                if (!var9_1) ** GOTO lbl82
                throw null;
            }
lbl111:
            // 2 sources

            case 10: {
                var8_2 /* !! */  = (int)eg.absu("aday", absr(int ), (int)400);
                if (!var9_1) ** GOTO lbl62
                throw null;
            }
lbl115:
            // 4 sources

            case 11: {
                var8_2 /* !! */  = (int)eg.absu("adaz", absr(int ), (int)401);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl120:
            // 2 sources

            case 12: {
                var8_2 /* !! */  = (int)eg.absu("adba", absr(int ), (int)402);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl125:
            // 2 sources

            case 13: {
                var8_2 /* !! */  = (int)eg.absu("adbb", absr(int ), (int)403);
                if (!var9_1) ** GOTO lbl72
                throw null;
            }
lbl129:
            // 3 sources

            case 14: {
                var8_2 /* !! */  = (int)eg.absu("adbc", absr(int ), (int)404);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl134:
            // 2 sources

            case 15: {
                var8_2 /* !! */  = (int)eg.absu("adbd", absr(int ), (int)405);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 16: {
                var8_2 /* !! */  = (int)eg.absu("adbe", absr(int ), (int)406);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl144:
            // 2 sources

            case 17: {
                var8_2 /* !! */  = (int)eg.absu("adbf", absr(int ), (int)407);
                if (!var9_1) ** GOTO lbl120
                throw null;
            }
lbl148:
            // 2 sources

            case 18: {
                var8_2 /* !! */  = (int)eg.absu("adbg", absr(int ), (int)408);
                if (!var9_1) ** GOTO lbl115
                throw null;
            }
lbl152:
            // 3 sources

            case 19: {
                var8_2 /* !! */  = (int)eg.absu("adbh", absr(int ), (int)409);
                if (!var9_1) ** GOTO lbl77
                throw null;
            }
            case 20: {
                var8_2 /* !! */  = (int)eg.absu("adbi", absr(int ), (int)410);
                if (!var9_1) ** GOTO lbl115
                throw null;
            }
            case 21: {
                var8_2 /* !! */  = (int)eg.absu("adbj", absr(int ), (int)411);
                if (!var9_1) break;
                throw null;
            }
            case 22: {
                var8_2 /* !! */  = (int)eg.absu("adbk", absr(int ), (int)412);
                if (!var9_1) ** GOTO lbl62
                throw null;
            }
lbl168:
            // 2 sources

            case 23: {
                var8_2 /* !! */  = (int)eg.absu("adbl", absr(int ), (int)413);
                if (!var9_1) ** GOTO lbl111
                throw null;
            }
lbl172:
            // 2 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)eg.absu("adbm", absr(int ), (int)414);
                    if (!var9_1) ** GOTO lbl72
                    throw null;
                }
            }
            case 25: {
                var8_2 /* !! */  = (int)eg.absu("adbn", absr(int ), (int)415);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 26: {
                var8_2 /* !! */  = (int)eg.absu("adbo", absr(int ), (int)416);
                if (!var9_1) ** GOTO lbl144
                throw null;
            }
lbl186:
            // 2 sources

            case 27: {
                var8_2 /* !! */  = (int)eg.absu("adbp", absr(int ), (int)417);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl191:
            // 2 sources

            case 28: {
                var8_2 /* !! */  = (int)eg.absu("adbq", absr(int ), (int)418);
                if (!var9_1) ** GOTO lbl152
                throw null;
            }
lbl195:
            // 2 sources

            case 29: {
                var8_2 /* !! */  = (int)eg.absu("adbr", absr(int ), (int)419);
                if (!var9_1) ** GOTO lbl77
                throw null;
            }
lbl199:
            // 2 sources

            case 30: {
                var8_2 /* !! */  = (int)eg.absu("adbs", absr(int ), (int)420);
                if (!var9_1) ** GOTO lbl82
                throw null;
            }
lbl203:
            // 2 sources

            case 31: {
                var8_2 /* !! */  = (int)eg.absu("adbt", absr(int ), (int)421);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 32: {
                var8_2 /* !! */  = (int)eg.absu("adbu", absr(int ), (int)422);
                if (!var9_1) ** GOTO lbl92
                throw null;
            }
lbl212:
            // 2 sources

            case 33: {
                var8_2 /* !! */  = (int)eg.absu("adbv", absr(int ), (int)423);
                if (var9_1) {
                    throw null;
                }
            }
lbl216:
            // 4 sources

            case 34: {
                var8_2 /* !! */  = (int)eg.absu("adbw", absr(int ), (int)424);
                if (!var9_1) ** GOTO lbl134
                throw null;
            }
lbl220:
            // 2 sources

            case 35: {
                var8_2 /* !! */  = (int)eg.absu("adbx", absr(int ), (int)425);
                if (!var9_1) ** GOTO lbl172
                throw null;
            }
lbl224:
            // 2 sources

            case 36: {
                var8_2 /* !! */  = (int)eg.absu("adby", absr(int ), (int)426);
                if (!var9_1) ** GOTO lbl216
                throw null;
            }
            case 37: 
        }
        var8_2 /* !! */  = (int)eg.absu("adbz", absr(int ), (int)427);
        ** while (!var9_1)
lbl231:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aegq() {
        eg.abss[600] = 1121007736;
        eg.abss[601] = 2145863325;
        eg.abss[602] = 1896040060;
        eg.abss[603] = -364504981;
        eg.abss[604] = -722513867;
        eg.abss[605] = 969538224;
        eg.abss[606] = -232029125;
        eg.abss[607] = -1226473260;
        eg.abss[608] = -589944044;
        eg.abss[609] = -1155494891;
        eg.abss[610] = 1123282852;
        eg.abss[611] = -681394316;
        eg.abss[612] = -63856611;
        eg.abss[613] = -1369136003;
        eg.abss[614] = 1512556619;
        eg.abss[615] = -1153603316;
        eg.abss[616] = -1978351052;
        eg.abss[617] = -2112892407;
        eg.abss[618] = -1916638134;
        eg.abss[619] = -84949184;
        eg.abss[620] = -1313450688;
        eg.abss[621] = -1744271749;
        eg.abss[622] = 1404033918;
        eg.abss[623] = -1987265315;
        eg.abss[624] = 1558937959;
        eg.abss[625] = -1626046775;
        eg.abss[626] = 1265733887;
        eg.abss[627] = 1179086851;
        eg.abss[628] = -1596169777;
        eg.abss[629] = 1887451367;
        eg.abss[630] = -910636451;
        eg.abss[631] = -579043428;
        eg.abss[632] = -1184386858;
        eg.abss[633] = 0x21211CC1;
        eg.abss[634] = -339973874;
        eg.abss[635] = -420650614;
        eg.abss[636] = -555830651;
        eg.abss[637] = 1596294269;
        eg.abss[638] = -735142917;
        eg.abss[639] = -715586968;
        eg.abss[640] = 241357948;
        eg.abss[641] = -685861889;
        eg.abss[642] = -1428862074;
        eg.abss[643] = -1071928378;
        eg.abss[644] = 1401326132;
        eg.abss[645] = 728017779;
        eg.abss[646] = -522776028;
        eg.abss[647] = 230225545;
        eg.abss[648] = -1063372258;
        eg.abss[649] = -180860658;
        eg.abss[650] = 203774341;
        eg.abss[651] = -1799581082;
        eg.abss[652] = -2138421760;
        eg.abss[653] = 928235173;
        eg.abss[654] = 1648299332;
        eg.abss[655] = -196673605;
        eg.abss[656] = -788835422;
        eg.abss[657] = -644003317;
        eg.abss[658] = -95409000;
        eg.abss[659] = 1816455233;
        eg.abss[660] = 1650950589;
        eg.abss[661] = 107976919;
        eg.abss[662] = 96825774;
        eg.abss[663] = -1334194821;
        eg.abss[664] = -747460503;
        eg.abss[665] = 471157554;
        eg.abss[666] = 1065310883;
        eg.abss[667] = 752680281;
        eg.abss[668] = 2142423375;
        eg.abss[669] = -1030102405;
        eg.abss[670] = 524361175;
        eg.abss[671] = 1674775397;
        eg.abss[672] = 1690790839;
        eg.abss[673] = 344184163;
        eg.abss[674] = 1572877486;
        eg.abss[675] = -1933348374;
        eg.abss[676] = -2107128061;
        eg.abss[677] = -1035525275;
        eg.abss[678] = 232742526;
        eg.abss[679] = -1157050923;
        eg.abss[680] = -545721902;
        eg.abss[681] = -456618682;
        eg.abss[682] = -303202057;
        eg.abss[683] = -1084466456;
        eg.abss[684] = -908234928;
        eg.abss[685] = 776404835;
        eg.abss[686] = 2088764172;
        eg.abss[687] = 605691535;
        eg.abss[688] = -1694649935;
        eg.abss[689] = 1760675690;
        eg.abss[690] = -1510759430;
        eg.abss[691] = 1829121476;
        eg.abss[692] = -959671690;
        eg.abss[693] = 940440286;
        eg.abss[694] = 20815761;
        eg.abss[695] = 1859593558;
        eg.abss[696] = -929542172;
        eg.abss[697] = 1207085730;
        eg.abss[698] = -816315132;
        eg.abss[699] = -1035481765;
    }

    private static /* synthetic */ float abtn(int n2) {
        return Float.intBitsToFloat(abss[n2] ^ abst[n2]);
    }

    /*
     * Exception decompiling
     */
    private static String username() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 31[SWITCH]
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

    private static /* synthetic */ void aego() {
        eg.abss[400] = -143667867;
        eg.abss[401] = -2070952798;
        eg.abss[402] = 864440515;
        eg.abss[403] = 708060004;
        eg.abss[404] = -990465342;
        eg.abss[405] = 1121811159;
        eg.abss[406] = 386383915;
        eg.abss[407] = 593342786;
        eg.abss[408] = 1421121032;
        eg.abss[409] = -1472986178;
        eg.abss[410] = -2004772870;
        eg.abss[411] = -964723504;
        eg.abss[412] = 1717843761;
        eg.abss[413] = -1717167973;
        eg.abss[414] = -748579320;
        eg.abss[415] = 403866037;
        eg.abss[416] = 1421141826;
        eg.abss[417] = -609084047;
        eg.abss[418] = 549970866;
        eg.abss[419] = -1078419916;
        eg.abss[420] = 86653728;
        eg.abss[421] = -1903445933;
        eg.abss[422] = -88263574;
        eg.abss[423] = 1071473046;
        eg.abss[424] = -1509413891;
        eg.abss[425] = -1599846246;
        eg.abss[426] = -2032466268;
        eg.abss[427] = -103906417;
        eg.abss[428] = 1059137145;
        eg.abss[429] = 1055609168;
        eg.abss[430] = 919754997;
        eg.abss[431] = -1713981921;
        eg.abss[432] = 1120462232;
        eg.abss[433] = -728607216;
        eg.abss[434] = 76169164;
        eg.abss[435] = -821743898;
        eg.abss[436] = 1111028542;
        eg.abss[437] = -1870317293;
        eg.abss[438] = 936267663;
        eg.abss[439] = 1827295939;
        eg.abss[440] = -1797261607;
        eg.abss[441] = -1844562381;
        eg.abss[442] = 887714461;
        eg.abss[443] = -258095132;
        eg.abss[444] = -1357968466;
        eg.abss[445] = -934354556;
        eg.abss[446] = 1786657635;
        eg.abss[447] = -455250202;
        eg.abss[448] = -1236890522;
        eg.abss[449] = -59466640;
        eg.abss[450] = -33449090;
        eg.abss[451] = 2024821796;
        eg.abss[452] = -1177655058;
        eg.abss[453] = 1963708023;
        eg.abss[454] = -2087875889;
        eg.abss[455] = 1596855740;
        eg.abss[456] = 1462459229;
        eg.abss[457] = -1173743500;
        eg.abss[458] = 1881228323;
        eg.abss[459] = 1177983832;
        eg.abss[460] = -1984499615;
        eg.abss[461] = 1255069333;
        eg.abss[462] = 1575330031;
        eg.abss[463] = -1837626898;
        eg.abss[464] = -1283743451;
        eg.abss[465] = 569939642;
        eg.abss[466] = 648165051;
        eg.abss[467] = 564482543;
        eg.abss[468] = 1180779187;
        eg.abss[469] = -778665377;
        eg.abss[470] = -2139238066;
        eg.abss[471] = -1709307321;
        eg.abss[472] = 493352332;
        eg.abss[473] = -1926598636;
        eg.abss[474] = -1543125082;
        eg.abss[475] = -1909390351;
        eg.abss[476] = -1055381294;
        eg.abss[477] = -556475044;
        eg.abss[478] = 211379045;
        eg.abss[479] = -2126701663;
        eg.abss[480] = -1637152017;
        eg.abss[481] = 448383959;
        eg.abss[482] = -1110881815;
        eg.abss[483] = 1678742453;
        eg.abss[484] = -1493419374;
        eg.abss[485] = 534203726;
        eg.abss[486] = 1681574092;
        eg.abss[487] = -1661793902;
        eg.abss[488] = 1604363125;
        eg.abss[489] = -1329011051;
        eg.abss[490] = -758015640;
        eg.abss[491] = 224187744;
        eg.abss[492] = -1459974036;
        eg.abss[493] = 1217225961;
        eg.abss[494] = -1106376967;
        eg.abss[495] = -1590103194;
        eg.abss[496] = 758375720;
        eg.abss[497] = 1046479593;
        eg.abss[498] = 1039771217;
        eg.abss[499] = 288445821;
    }

    private static /* synthetic */ void aegn() {
        eg.abss[300] = 1543634663;
        eg.abss[301] = -1745843766;
        eg.abss[302] = -1779498454;
        eg.abss[303] = -1731896821;
        eg.abss[304] = -650753050;
        eg.abss[305] = -109546559;
        eg.abss[306] = 2025588678;
        eg.abss[307] = -840755410;
        eg.abss[308] = 224193648;
        eg.abss[309] = 1109639446;
        eg.abss[310] = -1933421399;
        eg.abss[311] = 89218431;
        eg.abss[312] = -1051381487;
        eg.abss[313] = 1986375681;
        eg.abss[314] = 1276267251;
        eg.abss[315] = 1414960864;
        eg.abss[316] = 871147749;
        eg.abss[317] = -95614559;
        eg.abss[318] = -1348607675;
        eg.abss[319] = -1245725766;
        eg.abss[320] = -1296290859;
        eg.abss[321] = -1094963065;
        eg.abss[322] = -406332838;
        eg.abss[323] = 604002319;
        eg.abss[324] = -1265708040;
        eg.abss[325] = -1840279538;
        eg.abss[326] = 1373543678;
        eg.abss[327] = 2105916557;
        eg.abss[328] = -1665492394;
        eg.abss[329] = 2027031638;
        eg.abss[330] = 1578336932;
        eg.abss[331] = 2103416960;
        eg.abss[332] = 823757514;
        eg.abss[333] = 1207261574;
        eg.abss[334] = -919032339;
        eg.abss[335] = 465601955;
        eg.abss[336] = 1137558439;
        eg.abss[337] = 1660837177;
        eg.abss[338] = 194821926;
        eg.abss[339] = 16599092;
        eg.abss[340] = -1108757603;
        eg.abss[341] = -1754006283;
        eg.abss[342] = 1677523431;
        eg.abss[343] = -220608900;
        eg.abss[344] = 1807305510;
        eg.abss[345] = -991887182;
        eg.abss[346] = -1577340976;
        eg.abss[347] = 593427839;
        eg.abss[348] = -301984042;
        eg.abss[349] = -140514681;
        eg.abss[350] = 1947337937;
        eg.abss[351] = 1785033982;
        eg.abss[352] = -2142539280;
        eg.abss[353] = -323884904;
        eg.abss[354] = 416374796;
        eg.abss[355] = -608962268;
        eg.abss[356] = -893957383;
        eg.abss[357] = -250591860;
        eg.abss[358] = -205906177;
        eg.abss[359] = 55220777;
        eg.abss[360] = 1484204485;
        eg.abss[361] = -1141245146;
        eg.abss[362] = -1724752706;
        eg.abss[363] = -999408816;
        eg.abss[364] = 593260092;
        eg.abss[365] = 1451830944;
        eg.abss[366] = 1671277681;
        eg.abss[367] = 650532837;
        eg.abss[368] = 1577940922;
        eg.abss[369] = 69453840;
        eg.abss[370] = 851147205;
        eg.abss[371] = 25810525;
        eg.abss[372] = 853923925;
        eg.abss[373] = 168432350;
        eg.abss[374] = 314733803;
        eg.abss[375] = 1710858703;
        eg.abss[376] = -1555680559;
        eg.abss[377] = 675159833;
        eg.abss[378] = -113809242;
        eg.abss[379] = -1149388444;
        eg.abss[380] = -1484661491;
        eg.abss[381] = -1716873487;
        eg.abss[382] = 216456192;
        eg.abss[383] = -871771784;
        eg.abss[384] = 358111865;
        eg.abss[385] = 1477246430;
        eg.abss[386] = -1590338017;
        eg.abss[387] = -113051531;
        eg.abss[388] = 1884654446;
        eg.abss[389] = 1637897578;
        eg.abss[390] = -24064368;
        eg.abss[391] = 1089960825;
        eg.abss[392] = -1003008417;
        eg.abss[393] = 553640482;
        eg.abss[394] = -1597991206;
        eg.abss[395] = 1004216057;
        eg.abss[396] = 1263140808;
        eg.abss[397] = 899920988;
        eg.abss[398] = -987077479;
        eg.abss[399] = 1895534449;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int ping() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adca", abtd(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("adcb", absr(int ), (int)428)) break;
            v0 /* !! */  = (long)eg.absu("adcc", absr(int ), (int)429);
        }
        var4_1 = eg.c;
        v1 /* !! */  = eg.bn;
        if (true) ** GOTO lbl11
        block54: while (true) {
            v1 /* !! */  = (long)(v2 - eg.absu("adcd", abtd(int ), (int)82));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1808910952: {
                    break block54;
                }
                case 473975521: {
                    v2 = eg.absu("adce", abtd(int ), (int)83);
                    continue block54;
                }
                case 822440095: {
                    v2 = eg.absu("adcf", abtd(int ), (int)84);
                    continue block54;
                }
                case 1493813147: {
                    v2 = eg.absu("adcg", abtd(int ), (int)85);
                    continue block54;
                }
            }
            break;
        }
        var3_2 /* !! */  = eg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adch", abtd(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eg.absu("adci", absr(int ), (int)430)) break;
            v3 /* !! */  = (long)eg.absu("adcj", absr(int ), (int)431);
        }
        var2_3 = eg.a;
        if (var4_1) {
            throw null;
lbl32:
            // 9 sources

            return (int)eg.absu("adck", absr(int ), (int)432);
        }
        if (var2_3) ** GOTO lbl32
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl32
                v4 /* !! */  = eg.bn;
                if (true) ** GOTO lbl43
                block57: while (true) {
                    v4 /* !! */  = (long)(v5 - eg.absu("adcl", abtd(int ), (int)87));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1808910952: {
                            break block57;
                        }
                        case -850462723: {
                            v5 = eg.absu("adcm", abtd(int ), (int)88);
                            continue block57;
                        }
                        case 783061258: {
                            v5 = eg.absu("adcn", abtd(int ), (int)89);
                            continue block57;
                        }
                        case 1465641823: {
                            v5 = eg.absu("adco", abtd(int ), (int)90);
                            continue block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("adcp", abtd(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == eg.absu("adcq", absr(int ), (int)433)) break;
                    v6 /* !! */  = (long)eg.absu("adcr", absr(int ), (int)434);
                }
                if (this.mc.method_1562() == null) ** GOTO lbl78
                if (var2_3) ** GOTO lbl32
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("adcs", abtd(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == eg.absu("adct", absr(int ), (int)435)) break;
                    v7 /* !! */  = (long)eg.absu("adcu", absr(int ), (int)436);
                }
                v8 /* !! */  = eg.bn;
                if (true) ** GOTO lbl71
                block60: while (true) {
                    v8 /* !! */  = (long)(eg.absu("adcw", abtd(int ), (int)94) - eg.absu("adcv", abtd(int ), (int)93));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2030442884: {
                            continue block60;
                        }
                        case -1808910952: {
                            break block60;
                        }
                    }
                    break;
                }
                if (this.mc.field_1724 != null) ** GOTO lbl80
                if (var2_3) ** GOTO lbl32
lbl78:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl32
                return (int)eg.absu("adcx", absr(int ), (int)437);
lbl80:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl32
                v9 /* !! */  = eg.bn;
                if (true) ** GOTO lbl85
                block61: while (true) {
                    v9 /* !! */  = (long)(eg.absu("adcz", abtd(int ), (int)96) - eg.absu("adcy", abtd(int ), (int)95));
lbl85:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1808910952: {
                            break block61;
                        }
                        case -1281226261: {
                            continue block61;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("adda", abtd(int ), (int)97)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == eg.absu("addb", absr(int ), (int)438)) break;
                    v10 /* !! */  = (long)eg.absu("addc", absr(int ), (int)439);
                }
                v11 = this.mc.method_1562();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("addd", abtd(int ), (int)98)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == eg.absu("adde", absr(int ), (int)440)) break;
                    v12 /* !! */  = (long)eg.absu("addf", absr(int ), (int)441);
                }
                v13 /* !! */  = eg.bn;
                if (true) ** GOTO lbl105
                block64: while (true) {
                    v13 /* !! */  = (long)(eg.absu("addh", abtd(int ), (int)100) - eg.absu("addg", abtd(int ), (int)99));
lbl105:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1808910952: {
                            break block64;
                        }
                        case -636098620: {
                            continue block64;
                        }
                    }
                    break;
                }
                v14 = this.mc.field_1724;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("addi", abtd(int ), (int)101)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eg.absu("addj", absr(int ), (int)442)) break;
                    v15 /* !! */  = (long)eg.absu("addk", absr(int ), (int)443);
                }
                v16 = v14.method_5667();
                v17 /* !! */  = eg.bn;
                if (true) ** GOTO lbl121
                block66: while (true) {
                    v17 /* !! */  = (long)(v18 - eg.absu("addl", abtd(int ), (int)102));
lbl121:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1808910952: {
                            break block66;
                        }
                        case -1547843021: {
                            v18 = eg.absu("addm", abtd(int ), (int)103);
                            continue block66;
                        }
                        case -1339307917: {
                            v18 = eg.absu("addn", abtd(int ), (int)104);
                            continue block66;
                        }
                        case 590959908: {
                            v18 = eg.absu("addo", abtd(int ), (int)105);
                            continue block66;
                        }
                    }
                    break;
                }
                var1_4 = v11.method_2871(v16);
                if (var2_3 || var2_3) ** GOTO lbl32
                if (var1_4 != null) ** GOTO lbl141
                if (var2_3) ** GOTO lbl32
                v19 /* !! */  = eg.absu("addp", absr(int ), (int)444);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl164
lbl141:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v20 = eg.absu("addq", absr(int ), (int)445);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = eg.bn - eg.absu("addr", abtd(int ), (int)106)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == eg.absu("adds", absr(int ), (int)446)) break;
                    v21 /* !! */  = (long)eg.absu("addt", absr(int ), (int)447);
                }
                v22 = var1_4.method_2959();
                v23 /* !! */  = eg.bn;
                if (true) ** GOTO lbl154
                block68: while (true) {
                    v23 /* !! */  = (long)(v24 - eg.absu("addu", abtd(int ), (int)107));
lbl154:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1808910952: {
                            break block68;
                        }
                        case -1269736893: {
                            v24 = eg.absu("addv", abtd(int ), (int)108);
                            continue block68;
                        }
                        case 506655476: {
                            v24 = eg.absu("addw", abtd(int ), (int)109);
                            continue block68;
                        }
                    }
                    break;
                }
                v19 /* !! */  = (CallSite)Math.max((int)v20, v22);
lbl164:
                // 2 sources

                return (int)v19 /* !! */ ;
            }
            case 0: {
                var3_2 /* !! */  = (int)eg.absu("addx", absr(int ), (int)448);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl170:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)eg.absu("addy", absr(int ), (int)449);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl175:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)eg.absu("addz", absr(int ), (int)450);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl180:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)eg.absu("adea", absr(int ), (int)451);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl185:
            // 3 sources

            case 4: {
                do {
                    var3_2 /* !! */  = (int)eg.absu("adeb", absr(int ), (int)452);
                } while (!var4_1);
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)eg.absu("adec", absr(int ), (int)453);
                if (!var4_1) ** GOTO lbl175
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)eg.absu("aded", absr(int ), (int)454);
                if (!var4_1) ** GOTO lbl185
                throw null;
            }
lbl198:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)eg.absu("adee", absr(int ), (int)455);
                if (!var4_1) ** GOTO lbl180
                throw null;
            }
lbl202:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)eg.absu("adef", absr(int ), (int)456);
                if (!var4_1) ** GOTO lbl198
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)eg.absu("adeg", absr(int ), (int)457);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl211:
            // 2 sources

            case 10: {
                do {
                    var3_2 /* !! */  = (int)eg.absu("adeh", absr(int ), (int)458);
                } while (!var4_1);
                throw null;
            }
lbl216:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)eg.absu("adei", absr(int ), (int)459);
                if (!var4_1) ** GOTO lbl211
                throw null;
            }
            case 12: {
                do {
                    var3_2 /* !! */  = (int)eg.absu("adej", absr(int ), (int)460);
                } while (!var4_1);
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)eg.absu("adek", absr(int ), (int)461);
                if (!var4_1) break;
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)eg.absu("adel", absr(int ), (int)462);
                    if (!var4_1) ** GOTO lbl170
                    throw null;
                }
            }
            case 15: 
        }
        var3_2 /* !! */  = (int)eg.absu("adem", absr(int ), (int)463);
        ** while (!var4_1)
lbl237:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aeha() {
        eg.abst[700] = 128525821;
        eg.abst[701] = -700155116;
        eg.abst[702] = 1226996302;
        eg.abst[703] = 157143935;
        eg.abst[704] = 633813262;
        eg.abst[705] = -351118744;
        eg.abst[706] = -155777645;
        eg.abst[707] = 508268575;
        eg.abst[708] = 1554163387;
        eg.abst[709] = -1641860811;
        eg.abst[710] = 60261392;
        eg.abst[711] = 846503296;
        eg.abst[712] = -273467393;
        eg.abst[713] = 713918120;
        eg.abst[714] = -1137932786;
        eg.abst[715] = -2001554748;
        eg.abst[716] = -1691711198;
        eg.abst[717] = 2110409360;
        eg.abst[718] = -1589550826;
        eg.abst[719] = -482362169;
        eg.abst[720] = 313093174;
        eg.abst[721] = -1598440289;
        eg.abst[722] = -2041544613;
        eg.abst[723] = -1116973182;
        eg.abst[724] = 623997105;
        eg.abst[725] = 1505304177;
        eg.abst[726] = -1503672201;
        eg.abst[727] = 821688756;
        eg.abst[728] = -621883332;
        eg.abst[729] = 1909653964;
        eg.abst[730] = -1634532774;
        eg.abst[731] = 1668921022;
        eg.abst[732] = -1628187447;
        eg.abst[733] = 1236252457;
        eg.abst[734] = 897941887;
        eg.abst[735] = 1119533774;
        eg.abst[736] = 1727794155;
        eg.abst[737] = 1363124339;
        eg.abst[738] = -1713669793;
        eg.abst[739] = 442623296;
        eg.abst[740] = -1512121503;
        eg.abst[741] = -2072941554;
        eg.abst[742] = 344897066;
        eg.abst[743] = -898226880;
        eg.abst[744] = 1069435635;
        eg.abst[745] = 1407351834;
        eg.abst[746] = -1014911820;
        eg.abst[747] = -1522303821;
        eg.abst[748] = 1517819777;
        eg.abst[749] = -359137800;
        eg.abst[750] = -1172367955;
        eg.abst[751] = -458175145;
        eg.abst[752] = -1095998632;
        eg.abst[753] = -441223668;
        eg.abst[754] = 1065060373;
        eg.abst[755] = 1245893672;
        eg.abst[756] = 521050055;
        eg.abst[757] = -1459764284;
        eg.abst[758] = -556677394;
        eg.abst[759] = -1949763835;
        eg.abst[760] = 1776962545;
        eg.abst[761] = 525328857;
        eg.abst[762] = -1484147150;
        eg.abst[763] = 1062652051;
        eg.abst[764] = -1123072795;
        eg.abst[765] = 143714005;
        eg.abst[766] = -2004538617;
        eg.abst[767] = -973642143;
        eg.abst[768] = 2079646443;
        eg.abst[769] = -596309548;
        eg.abst[770] = -697496784;
        eg.abst[771] = 1538659661;
        eg.abst[772] = -1005154272;
        eg.abst[773] = -1449021554;
        eg.abst[774] = 694972359;
        eg.abst[775] = -1217806299;
        eg.abst[776] = 1099957317;
        eg.abst[777] = 1620493204;
        eg.abst[778] = 728678185;
        eg.abst[779] = 728186000;
        eg.abst[780] = 2132373971;
        eg.abst[781] = 1493033433;
        eg.abst[782] = 936440368;
        eg.abst[783] = -870811089;
        eg.abst[784] = -705630126;
        eg.abst[785] = 184816755;
        eg.abst[786] = -809142105;
        eg.abst[787] = -256573441;
        eg.abst[788] = 1296021482;
        eg.abst[789] = 1701521827;
        eg.abst[790] = -1767018246;
        eg.abst[791] = 1060789248;
        eg.abst[792] = 173998650;
        eg.abst[793] = -1739856366;
        eg.abst[794] = 1856055085;
        eg.abst[795] = 361326875;
        eg.abst[796] = -2058771352;
        eg.abst[797] = -598567075;
        eg.abst[798] = 1116540687;
        eg.abst[799] = 1618448192;
    }

    private static /* synthetic */ void aegm() {
        eg.abss[200] = 328239440;
        eg.abss[201] = 1166463608;
        eg.abss[202] = -490398620;
        eg.abss[203] = 1453757806;
        eg.abss[204] = 1670650942;
        eg.abss[205] = -564339636;
        eg.abss[206] = 827772333;
        eg.abss[207] = -1418235948;
        eg.abss[208] = -857997304;
        eg.abss[209] = 913629119;
        eg.abss[210] = -2016190955;
        eg.abss[211] = 498886425;
        eg.abss[212] = 1466439559;
        eg.abss[213] = -846408327;
        eg.abss[214] = 918821340;
        eg.abss[215] = -368322143;
        eg.abss[216] = 1517614640;
        eg.abss[217] = -1262949640;
        eg.abss[218] = -1843394323;
        eg.abss[219] = 195483251;
        eg.abss[220] = -1048433929;
        eg.abss[221] = 1564272465;
        eg.abss[222] = 2045263770;
        eg.abss[223] = 502354547;
        eg.abss[224] = 2043616792;
        eg.abss[225] = 589511913;
        eg.abss[226] = -869530790;
        eg.abss[227] = -1023911506;
        eg.abss[228] = 856464987;
        eg.abss[229] = -1373504265;
        eg.abss[230] = 1783202043;
        eg.abss[231] = 694464793;
        eg.abss[232] = 1347613351;
        eg.abss[233] = 1777161997;
        eg.abss[234] = 1649354469;
        eg.abss[235] = -1028126098;
        eg.abss[236] = -1468456977;
        eg.abss[237] = 1262018808;
        eg.abss[238] = 1912247725;
        eg.abss[239] = -1113667786;
        eg.abss[240] = -1845623982;
        eg.abss[241] = -1892734523;
        eg.abss[242] = 1372199655;
        eg.abss[243] = -499099885;
        eg.abss[244] = 2072932001;
        eg.abss[245] = 701521596;
        eg.abss[246] = 1725764616;
        eg.abss[247] = 1185133457;
        eg.abss[248] = -1497394177;
        eg.abss[249] = 1829009091;
        eg.abss[250] = 1951786744;
        eg.abss[251] = -195153990;
        eg.abss[252] = 544497788;
        eg.abss[253] = 384655337;
        eg.abss[254] = 168136314;
        eg.abss[255] = 963580166;
        eg.abss[256] = -874100132;
        eg.abss[257] = -1227528551;
        eg.abss[258] = -390575343;
        eg.abss[259] = 1192150480;
        eg.abss[260] = -1061685757;
        eg.abss[261] = -354284491;
        eg.abss[262] = -68642436;
        eg.abss[263] = 1880975203;
        eg.abss[264] = -1161397759;
        eg.abss[265] = 1551876537;
        eg.abss[266] = -1709512021;
        eg.abss[267] = 7231236;
        eg.abss[268] = 263855002;
        eg.abss[269] = -2041348032;
        eg.abss[270] = -1425752236;
        eg.abss[271] = 1876809403;
        eg.abss[272] = 365268982;
        eg.abss[273] = -84125052;
        eg.abss[274] = -1830410391;
        eg.abss[275] = 1028512393;
        eg.abss[276] = -2065704177;
        eg.abss[277] = -353443048;
        eg.abss[278] = 2074133424;
        eg.abss[279] = 1696871685;
        eg.abss[280] = 1648522736;
        eg.abss[281] = 289643094;
        eg.abss[282] = 497862209;
        eg.abss[283] = -341358713;
        eg.abss[284] = -1429730147;
        eg.abss[285] = 876312515;
        eg.abss[286] = -774836693;
        eg.abss[287] = -1818058941;
        eg.abss[288] = 1116261352;
        eg.abss[289] = 507308592;
        eg.abss[290] = -1776283516;
        eg.abss[291] = 729769670;
        eg.abss[292] = 1915574223;
        eg.abss[293] = -1730218842;
        eg.abss[294] = -189667530;
        eg.abss[295] = -619664770;
        eg.abss[296] = 2087150802;
        eg.abss[297] = -1824704522;
        eg.abss[298] = 1369263105;
        eg.abss[299] = -335190133;
    }

    private static /* synthetic */ void aegl() {
        eg.abss[100] = -80882330;
        eg.abss[101] = -1221801948;
        eg.abss[102] = -1340523174;
        eg.abss[103] = -1605978605;
        eg.abss[104] = -159664958;
        eg.abss[105] = 2041292215;
        eg.abss[106] = -627985316;
        eg.abss[107] = 332682280;
        eg.abss[108] = -1370727022;
        eg.abss[109] = -971947172;
        eg.abss[110] = 2619199;
        eg.abss[111] = 1187127224;
        eg.abss[112] = -923168404;
        eg.abss[113] = 28748774;
        eg.abss[114] = -1361335749;
        eg.abss[115] = 960540667;
        eg.abss[116] = -1936771086;
        eg.abss[117] = 1734673001;
        eg.abss[118] = -1200904121;
        eg.abss[119] = -181041122;
        eg.abss[120] = 1167886356;
        eg.abss[121] = -336854660;
        eg.abss[122] = 894314361;
        eg.abss[123] = 914966209;
        eg.abss[124] = -2013761257;
        eg.abss[125] = -1786496755;
        eg.abss[126] = -1531138521;
        eg.abss[127] = -162810099;
        eg.abss[128] = 447327458;
        eg.abss[129] = -808031909;
        eg.abss[130] = 1530619756;
        eg.abss[131] = 1623182965;
        eg.abss[132] = 1580612070;
        eg.abss[133] = -1070359609;
        eg.abss[134] = 1734912762;
        eg.abss[135] = -1627533608;
        eg.abss[136] = 10824725;
        eg.abss[137] = -668996987;
        eg.abss[138] = 73061062;
        eg.abss[139] = -1023793886;
        eg.abss[140] = -944175343;
        eg.abss[141] = -1978922200;
        eg.abss[142] = -1767921212;
        eg.abss[143] = 1688448592;
        eg.abss[144] = 2140674122;
        eg.abss[145] = 590875421;
        eg.abss[146] = -1638789561;
        eg.abss[147] = 1890877505;
        eg.abss[148] = -981760573;
        eg.abss[149] = 410770110;
        eg.abss[150] = 1659869229;
        eg.abss[151] = -369334440;
        eg.abss[152] = 2052391467;
        eg.abss[153] = 2814722;
        eg.abss[154] = 2126997078;
        eg.abss[155] = -998997690;
        eg.abss[156] = 1525383266;
        eg.abss[157] = 41451323;
        eg.abss[158] = -954171388;
        eg.abss[159] = 1810601148;
        eg.abss[160] = 1602411187;
        eg.abss[161] = -1633966637;
        eg.abss[162] = 592620510;
        eg.abss[163] = -1522708799;
        eg.abss[164] = -285508995;
        eg.abss[165] = -817066724;
        eg.abss[166] = 1931195585;
        eg.abss[167] = -742163866;
        eg.abss[168] = -1897715072;
        eg.abss[169] = -2006307108;
        eg.abss[170] = 1633698136;
        eg.abss[171] = 1343269171;
        eg.abss[172] = -929050057;
        eg.abss[173] = 1505859479;
        eg.abss[174] = 1545393200;
        eg.abss[175] = 1387569003;
        eg.abss[176] = 1869630362;
        eg.abss[177] = -184922239;
        eg.abss[178] = 1187969546;
        eg.abss[179] = 1809493481;
        eg.abss[180] = -1983674196;
        eg.abss[181] = -1364754221;
        eg.abss[182] = -1966757105;
        eg.abss[183] = -516388749;
        eg.abss[184] = 1816558474;
        eg.abss[185] = -228517446;
        eg.abss[186] = -1393686461;
        eg.abss[187] = -1143862480;
        eg.abss[188] = -742504732;
        eg.abss[189] = 1912276410;
        eg.abss[190] = 591642871;
        eg.abss[191] = 1543691432;
        eg.abss[192] = -915571676;
        eg.abss[193] = -1731817533;
        eg.abss[194] = 611632129;
        eg.abss[195] = -103531540;
        eg.abss[196] = -1564421638;
        eg.abss[197] = -1253995004;
        eg.abss[198] = -827360355;
        eg.abss[199] = -2053672804;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float easeOutBack(float var0) {
        v0 /* !! */  = eg.bn;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(eg.absu("adzw", abtd(int ), (int)213) - eg.absu("adzv", abtd(int ), (int)212));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808910952: {
                    break block28;
                }
                case 410994073: {
                    continue block28;
                }
            }
            break;
        }
        var7_1 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adzx", abtd(int ), (int)214)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eg.absu("adzy", absr(int ), (int)806)) break;
            v1 /* !! */  = (long)eg.absu("aecf", absr(int ), (int)807);
        }
        var6_2 /* !! */  = eg.b;
        v2 /* !! */  = eg.bn;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - eg.absu("aecg", abtd(int ), (int)215));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1808910952: {
                    break block30;
                }
                case 381422607: {
                    v3 = eg.absu("aech", abtd(int ), (int)216);
                    continue block30;
                }
                case 828820591: {
                    v3 = eg.absu("aeci", abtd(int ), (int)217);
                    continue block30;
                }
                case 880073559: {
                    v3 = eg.absu("aecj", abtd(int ), (int)218);
                    continue block30;
                }
            }
            break;
        }
        var5_3 = eg.a;
        if (var7_1) {
            throw null;
lbl37:
            // 6 sources

            return (float)eg.absu("aeck", abtn(int ), (int)808);
        }
        if (var5_3) ** GOTO lbl37
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) ** GOTO lbl37
                v4 /* !! */  = eg.bn;
                if (true) ** GOTO lbl48
                block32: while (true) {
                    v4 /* !! */  = (long)(eg.absu("aecm", abtd(int ), (int)220) - eg.absu("aecl", abtd(int ), (int)219));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1808910952: {
                            break block32;
                        }
                        case 35179684: {
                            continue block32;
                        }
                    }
                    break;
                }
                v5 = Math.min(1.0f, var0);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("aecn", abtd(int ), (int)221)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == eg.absu("aeco", absr(int ), (int)809)) break;
                    v6 /* !! */  = (long)eg.absu("aecp", absr(int ), (int)810);
                }
                var1_4 = Math.max(0.0f, v5);
                if (var5_3 || var5_3) ** GOTO lbl37
                var2_5 = eg.absu("aecq", abtn(int ), (int)811);
                if (var5_3 || var5_3) ** GOTO lbl37
                var3_6 = var2_5 + 1.0f;
                if (var5_3 || var5_3) ** GOTO lbl37
                var4_7 = var1_4 - 1.0f;
                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return 1.0f + var3_6 * var4_7 * var4_7 * var4_7 + var2_5 * var4_7 * var4_7;
            }
            case 0: {
                var6_2 /* !! */  = (int)eg.absu("aecr", absr(int ), (int)812);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl75:
            // 2 sources

            case 1: {
                var6_2 /* !! */  = (int)eg.absu("aecs", absr(int ), (int)813);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl80:
            // 2 sources

            case 2: {
                var6_2 /* !! */  = (int)eg.absu("aect", absr(int ), (int)814);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl85:
            // 2 sources

            case 3: {
                var6_2 /* !! */  = (int)eg.absu("aecu", absr(int ), (int)815);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 4: {
                var6_2 /* !! */  = (int)eg.absu("aecv", absr(int ), (int)816);
                if (!var7_1) break;
                throw null;
            }
lbl94:
            // 2 sources

            case 5: {
                var6_2 /* !! */  = (int)eg.absu("aecw", absr(int ), (int)817);
                if (!var7_1) ** GOTO lbl80
                throw null;
            }
lbl98:
            // 2 sources

            case 6: {
                var6_2 /* !! */  = (int)eg.absu("aecx", absr(int ), (int)818);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl103:
            // 2 sources

            case 7: {
                var6_2 /* !! */  = (int)eg.absu("aecy", absr(int ), (int)819);
                if (!var7_1) ** GOTO lbl75
                throw null;
            }
lbl107:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)eg.absu("aecz", absr(int ), (int)820);
                if (var7_1) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 9: {
                var6_2 /* !! */  = (int)eg.absu("aeda", absr(int ), (int)821);
                if (var7_1) {
                    throw null;
                }
            }
            case 10: {
                var6_2 /* !! */  = (int)eg.absu("aedb", absr(int ), (int)822);
                if (!var7_1) ** GOTO lbl85
                throw null;
            }
            case 11: 
        }
        do {
            var6_2 /* !! */  = (int)eg.absu("aedc", absr(int ), (int)823);
        } while (!var7_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawLowerContentBackground(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("acug", abtd(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("acuh", absr(int ), (int)255)) break;
            v0 /* !! */  = (long)eg.absu("acui", absr(int ), (int)256);
        }
        var7_5 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("acuj", abtd(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("acuk", absr(int ), (int)257)) break;
            v1 /* !! */  = (long)eg.absu("acul", absr(int ), (int)258);
        }
        var6_6 /* !! */  = eg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("acum", abtd(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("acun", absr(int ), (int)259)) break;
            v2 /* !! */  = (long)eg.absu("acuo", absr(int ), (int)260);
        }
        var5_7 = eg.a;
        if (var7_5) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var5_7) ** GOTO lbl21
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** GOTO lbl21
                v3 = eg.absu("acup", abtn(int ), (int)261);
                v4 = eg.absu("acuq", abtn(int ), (int)262);
                v5 = eg.absu("acur", absr(int ), (int)263);
                v6 /* !! */  = eg.bn;
                if (true) ** GOTO lbl35
                block29: while (true) {
                    v6 /* !! */  = (long)(eg.absu("acut", abtd(int ), (int)56) - eg.absu("acus", abtd(int ), (int)55));
lbl35:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1808910952: {
                            break block29;
                        }
                        case 1037890038: {
                            continue block29;
                        }
                    }
                    break;
                }
                v7 = dz.color((int)v5);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("acuu", abtd(int ), (int)57)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == eg.absu("acuv", absr(int ), (int)264)) break;
                    v8 /* !! */  = (long)eg.absu("acuw", absr(int ), (int)265);
                }
                v9 = nd.multAlpha(v7, var4_4);
                v10 = eg.absu("acux", absr(int ), (int)266);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("acuy", abtd(int ), (int)58)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == eg.absu("acuz", absr(int ), (int)267)) break;
                    v11 /* !! */  = (long)eg.absu("acva", absr(int ), (int)268);
                }
                ki.rect(var0, var1_1, var2_2, var3_3, (float)v3, (float)v4, v9, (boolean)v10);
                if (var5_7 || var5_7) ** GOTO lbl21
                v12 = eg.absu("acvb", abtn(int ), (int)269);
                v13 = eg.absu("acvc", abtn(int ), (int)270);
                v14 = eg.absu("acvd", abtn(int ), (int)271);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("acve", abtd(int ), (int)59)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eg.absu("acvf", absr(int ), (int)272)) break;
                    v15 /* !! */  = (long)eg.absu("acvg", absr(int ), (int)273);
                }
                v16 /* !! */  = eg.bn;
                if (true) ** GOTO lbl67
                block33: while (true) {
                    v16 /* !! */  = (long)(v17 - eg.absu("acvh", abtd(int ), (int)60));
lbl67:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1808910952: {
                            break block33;
                        }
                        case 814267401: {
                            v17 = eg.absu("acvi", abtd(int ), (int)61);
                            continue block33;
                        }
                        case 2130444742: {
                            v17 = eg.absu("acvj", abtd(int ), (int)62);
                            continue block33;
                        }
                    }
                    break;
                }
                v18 = nd.multAlpha(eg.LOGIN_BACKGROUND_BORDER_COLOR, var4_4);
                v19 = eg.absu("acvk", absr(int ), (int)274);
                v20 /* !! */  = eg.bn;
                if (true) ** GOTO lbl82
                block34: while (true) {
                    v20 /* !! */  = (long)(v21 - eg.absu("acvl", abtd(int ), (int)63));
lbl82:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1808910952: {
                            break block34;
                        }
                        case -732207218: {
                            v21 = eg.absu("acvm", abtd(int ), (int)64);
                            continue block34;
                        }
                        case -314690619: {
                            v21 = eg.absu("acvn", abtd(int ), (int)65);
                            continue block34;
                        }
                        case 1406598097: {
                            v21 = eg.absu("acvo", abtd(int ), (int)66);
                            continue block34;
                        }
                    }
                    break;
                }
                ki.outline(var0, var1_1, var2_2, var3_3, (float)v12, (float)v13, (float)v14, v18, (boolean)v19);
                if (!var5_7 && !var5_7) ** break;
                ** continue;
                return;
            }
lbl98:
            // 2 sources

            case 0: {
                var6_6 /* !! */  = (int)eg.absu("acvp", absr(int ), (int)275);
                if (var7_5) {
                    throw null;
                }
            }
lbl102:
            // 5 sources

            case 1: {
                do {
                    var6_6 /* !! */  = (int)eg.absu("acvq", absr(int ), (int)276);
                } while (!var7_5);
                throw null;
            }
            case 2: {
                var6_6 /* !! */  = (int)eg.absu("acvr", absr(int ), (int)277);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl112:
            // 2 sources

            case 3: {
                var6_6 /* !! */  = (int)eg.absu("acvs", absr(int ), (int)278);
                if (!var7_5) ** GOTO lbl102
                throw null;
            }
            case 4: {
                var6_6 /* !! */  = (int)eg.absu("acvt", absr(int ), (int)279);
                if (!var7_5) ** GOTO lbl112
                throw null;
            }
lbl120:
            // 2 sources

            case 5: {
                var6_6 /* !! */  = (int)eg.absu("acvu", absr(int ), (int)280);
                if (!var7_5) ** GOTO lbl102
                throw null;
            }
            case 6: {
                var6_6 /* !! */  = (int)eg.absu("acvv", absr(int ), (int)281);
                if (!var7_5) ** GOTO lbl98
                throw null;
            }
            case 7: 
        }
        do {
            var6_6 /* !! */  = (int)eg.absu("acvw", absr(int ), (int)282);
        } while (!var7_5);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int visibleBossBarCount() {
        v0 /* !! */  = eg.bn;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(v1 - eg.absu("acon", abtd(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808910952: {
                    break block65;
                }
                case 417546941: {
                    v1 = eg.absu("acoo", abtd(int ), (int)6);
                    continue block65;
                }
                case 789418207: {
                    v1 = eg.absu("acop", abtd(int ), (int)7);
                    continue block65;
                }
            }
            break;
        }
        var5_1 = eg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("acoq", abtd(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("acor", absr(int ), (int)153)) break;
            v2 /* !! */  = (long)eg.absu("acos", absr(int ), (int)154);
        }
        var4_2 /* !! */  = eg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("acot", abtd(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eg.absu("acou", absr(int ), (int)155)) break;
            v3 /* !! */  = (long)eg.absu("acov", absr(int ), (int)156);
        }
        var3_3 = eg.a;
        if (var5_1) {
            throw null;
lbl29:
            // 11 sources

            return (int)eg.absu("acow", absr(int ), (int)157);
        }
        if (var3_3 || var3_3) ** GOTO lbl29
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("acox", abtd(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eg.absu("acoy", absr(int ), (int)158)) break;
                    v4 /* !! */  = (long)eg.absu("acoz", absr(int ), (int)159);
                }
                v5 /* !! */  = eg.bn;
                if (true) ** GOTO lbl44
                block70: while (true) {
                    v5 /* !! */  = (long)(v6 - eg.absu("acpa", abtd(int ), (int)11));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1808910952: {
                            break block70;
                        }
                        case 286213085: {
                            v6 = eg.absu("acpb", abtd(int ), (int)12);
                            continue block70;
                        }
                        case 448157456: {
                            v6 = eg.absu("acpc", abtd(int ), (int)13);
                            continue block70;
                        }
                        case 2118061989: {
                            v6 = eg.absu("acpd", abtd(int ), (int)14);
                            continue block70;
                        }
                    }
                    break;
                }
                if (this.mc.field_1705 != null) ** GOTO lbl59
                if (var3_3) ** GOTO lbl29
                return (int)eg.absu("acpe", absr(int ), (int)160);
lbl59:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl29
                v7 /* !! */  = eg.bn;
                if (true) ** GOTO lbl64
                block71: while (true) {
                    v7 /* !! */  = (long)(v8 - eg.absu("acpf", abtd(int ), (int)15));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2035497540: {
                            v8 = eg.absu("acpg", abtd(int ), (int)16);
                            continue block71;
                        }
                        case -1808910952: {
                            break block71;
                        }
                        case -397472879: {
                            v8 = eg.absu("acph", abtd(int ), (int)17);
                            continue block71;
                        }
                        case 1817453599: {
                            v8 = eg.absu("acpi", abtd(int ), (int)18);
                            continue block71;
                        }
                    }
                    break;
                }
                var1_4 = jk.getInstance();
                if (var3_3 || var3_3) ** GOTO lbl29
                if (var1_4 == null) ** GOTO lbl105
                if (var3_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("acpj", abtd(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == eg.absu("acpk", absr(int ), (int)161)) break;
                    v9 /* !! */  = (long)eg.absu("acpl", absr(int ), (int)162);
                }
                if (!var1_4.isState()) ** GOTO lbl105
                if (var3_3) ** GOTO lbl29
                v10 /* !! */  = eg.bn;
                if (true) ** GOTO lbl91
                block73: while (true) {
                    v10 /* !! */  = (long)(eg.absu("acpn", abtd(int ), (int)21) - eg.absu("acpm", abtd(int ), (int)20));
lbl91:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1808910952: {
                            break block73;
                        }
                        case 944147075: {
                            continue block73;
                        }
                    }
                    break;
                }
                v11 = var1_4.modeSetting;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("acpo", abtd(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == eg.absu("acpp", absr(int ), (int)163)) break;
                    v12 /* !! */  = (long)eg.absu("acpq", absr(int ), (int)164);
                }
                if (!v11.isSelected("BossBar")) ** GOTO lbl105
                if (var3_3 || var3_3) ** GOTO lbl29
                return (int)eg.absu("acpr", absr(int ), (int)165);
lbl105:
                // 3 sources

                if (var3_3 || var3_3) ** GOTO lbl29
                v13 /* !! */  = eg.bn;
                if (true) ** GOTO lbl110
                block75: while (true) {
                    v13 /* !! */  = (long)(v14 - eg.absu("acps", abtd(int ), (int)23));
lbl110:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1808910952: {
                            break block75;
                        }
                        case -68614982: {
                            v14 = eg.absu("acpt", abtd(int ), (int)24);
                            continue block75;
                        }
                        case 499002374: {
                            v14 = eg.absu("acpu", abtd(int ), (int)25);
                            continue block75;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("acpv", abtd(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eg.absu("acpw", absr(int ), (int)166)) break;
                    v15 /* !! */  = (long)eg.absu("acpx", absr(int ), (int)167);
                }
                v16 = this.mc.field_1705;
                v17 /* !! */  = eg.bn;
                if (true) ** GOTO lbl129
                block77: while (true) {
                    v17 /* !! */  = (long)(eg.absu("acpz", abtd(int ), (int)28) - eg.absu("acpy", abtd(int ), (int)27));
lbl129:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1808910952: {
                            break block77;
                        }
                        case 2072692602: {
                            continue block77;
                        }
                    }
                    break;
                }
                v18 = v16.method_1740();
                v19 /* !! */  = eg.bn;
                if (true) ** GOTO lbl139
                block78: while (true) {
                    v19 /* !! */  = (long)(v20 - eg.absu("acqa", abtd(int ), (int)29));
lbl139:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1808910952: {
                            break block78;
                        }
                        case 310560275: {
                            v20 = eg.absu("acqb", abtd(int ), (int)30);
                            continue block78;
                        }
                        case 440861901: {
                            v20 = eg.absu("acqc", abtd(int ), (int)31);
                            continue block78;
                        }
                        case 614125548: {
                            v20 = eg.absu("acqd", abtd(int ), (int)32);
                            continue block78;
                        }
                    }
                    break;
                }
                var2_5 = v18.field_2060;
                if (var3_3 || var3_3) ** GOTO lbl29
                if (var2_5 != null) ** GOTO lbl159
                if (var3_3) ** GOTO lbl29
                v21 /* !! */  = eg.absu("acqe", absr(int ), (int)168);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl182
lbl159:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v22 = eg.absu("acqf", absr(int ), (int)169);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("acqg", abtd(int ), (int)33)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == eg.absu("acqh", absr(int ), (int)170)) break;
                    v23 /* !! */  = (long)eg.absu("acqi", absr(int ), (int)171);
                }
                v24 = var2_5.size();
                v25 /* !! */  = eg.bn;
                if (true) ** GOTO lbl172
                block80: while (true) {
                    v25 /* !! */  = (long)(v26 - eg.absu("acqj", abtd(int ), (int)34));
lbl172:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1808910952: {
                            break block80;
                        }
                        case 622248310: {
                            v26 = eg.absu("acqk", abtd(int ), (int)35);
                            continue block80;
                        }
                        case 1932961371: {
                            v26 = eg.absu("acql", abtd(int ), (int)36);
                            continue block80;
                        }
                    }
                    break;
                }
                v21 /* !! */  = (CallSite)Math.min((int)v22, v24);
lbl182:
                // 2 sources

                return (int)v21 /* !! */ ;
            }
lbl183:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)eg.absu("acqm", absr(int ), (int)172);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl188:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)eg.absu("acqn", absr(int ), (int)173);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl193:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)eg.absu("acqo", absr(int ), (int)174);
                if (!var5_1) ** GOTO lbl188
                throw null;
            }
lbl197:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)eg.absu("acqp", absr(int ), (int)175);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)eg.absu("acqq", absr(int ), (int)176);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                    break;
                }
            }
lbl208:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)eg.absu("acqr", absr(int ), (int)177);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 6: {
                do {
                    var4_2 /* !! */  = (int)eg.absu("acqs", absr(int ), (int)178);
                } while (!var5_1);
                throw null;
            }
            case 7: {
                do {
                    var4_2 /* !! */  = (int)eg.absu("acqt", absr(int ), (int)179);
                } while (!var5_1);
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)eg.absu("acqu", absr(int ), (int)180);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl228:
            // 4 sources

            case 9: {
                var4_2 /* !! */  = (int)eg.absu("acqv", absr(int ), (int)181);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl233:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)eg.absu("acqw", absr(int ), (int)182);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 11: {
                var4_2 /* !! */  = (int)eg.absu("acqx", absr(int ), (int)183);
                if (!var5_1) ** GOTO lbl228
                throw null;
            }
lbl242:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)eg.absu("acqy", absr(int ), (int)184);
                if (!var5_1) ** GOTO lbl193
                throw null;
            }
lbl246:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)eg.absu("acqz", absr(int ), (int)185);
                if (!var5_1) ** GOTO lbl242
                throw null;
            }
lbl250:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)eg.absu("acra", absr(int ), (int)186);
                if (!var5_1) ** GOTO lbl197
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)eg.absu("acrb", absr(int ), (int)187);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl259:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)eg.absu("acrc", absr(int ), (int)188);
                if (!var5_1) ** GOTO lbl183
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)eg.absu("acrd", absr(int ), (int)189);
                if (!var5_1) ** GOTO lbl233
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)eg.absu("acre", absr(int ), (int)190);
                if (!var5_1) ** GOTO lbl208
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)eg.absu("acrf", absr(int ), (int)191);
                if (!var5_1) ** GOTO lbl246
                throw null;
            }
lbl275:
            // 5 sources

            case 20: {
                var4_2 /* !! */  = (int)eg.absu("acrg", absr(int ), (int)192);
                if (!var5_1) ** GOTO lbl228
                throw null;
            }
            case 21: 
        }
        var4_2 /* !! */  = (int)eg.absu("acrh", absr(int ), (int)193);
        ** while (!var5_1)
lbl282:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawTimeBackground(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adji", abtd(int ), (int)147)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("adjj", absr(int ), (int)526)) break;
            v0 /* !! */  = (long)eg.absu("adjk", absr(int ), (int)527);
        }
        var10_6 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adjl", abtd(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("adjm", absr(int ), (int)528)) break;
            v1 /* !! */  = (long)eg.absu("adjn", absr(int ), (int)529);
        }
        var9_7 /* !! */  = eg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("adjo", abtd(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("adjp", absr(int ), (int)530)) break;
            v2 /* !! */  = (long)eg.absu("adjq", absr(int ), (int)531);
        }
        var8_8 = eg.a;
        if (var10_6) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var8_8 || var8_8) ** GOTO lbl21
        var6_9 = var1_1 + var3_3;
        if (var8_8 || var8_8) ** GOTO lbl21
        var7_10 = var2_2 + eg.absu("adjr", abtn(int ), (int)532);
        if (var8_8 || var8_8) ** GOTO lbl21
        v3 = eg.absu("adjs", abtn(int ), (int)533);
        v4 = eg.absu("adjt", abtn(int ), (int)534);
        v5 = eg.absu("adju", absr(int ), (int)535);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("adjv", abtd(int ), (int)150)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == eg.absu("adjw", absr(int ), (int)536)) break;
            v6 /* !! */  = (long)eg.absu("adjx", absr(int ), (int)537);
        }
        v7 = dz.color((int)v5);
        v8 /* !! */  = eg.bn;
        if (true) ** GOTO lbl41
        block31: while (true) {
            v8 /* !! */  = (long)(v9 - eg.absu("adjy", abtd(int ), (int)151));
lbl41:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2024311000: {
                    v9 = eg.absu("adjz", abtd(int ), (int)152);
                    continue block31;
                }
                case -1808910952: {
                    break block31;
                }
                case 1103837342: {
                    v9 = eg.absu("adka", abtd(int ), (int)153);
                    continue block31;
                }
                case 1957073329: {
                    v9 = eg.absu("adkb", abtd(int ), (int)154);
                    continue block31;
                }
            }
            break;
        }
        v10 = nd.multAlpha(v7, var5_5);
        v11 = eg.absu("adkc", absr(int ), (int)538);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("adkd", abtd(int ), (int)155)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == eg.absu("adke", absr(int ), (int)539)) break;
            v12 /* !! */  = (long)eg.absu("adkf", absr(int ), (int)540);
        }
        ki.rect(var0, var6_9, var7_10, var4_4, (float)v3, (float)v4, v10, (boolean)v11);
        if (var8_8 || var8_8) ** GOTO lbl21
        v13 = eg.absu("adkg", abtn(int ), (int)541);
        v14 = eg.absu("adkh", abtn(int ), (int)542);
        v15 = eg.absu("adki", abtn(int ), (int)543);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("adkj", abtd(int ), (int)156)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == eg.absu("adkk", absr(int ), (int)544)) break;
            v16 /* !! */  = (long)eg.absu("adkl", absr(int ), (int)545);
        }
        v17 /* !! */  = eg.bn;
        if (true) ** GOTO lbl74
        block34: while (true) {
            v17 /* !! */  = (long)(v18 - eg.absu("adkm", abtd(int ), (int)157));
lbl74:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1916944120: {
                    v18 = eg.absu("adko", abtd(int ), (int)158);
                    continue block34;
                }
                case -1808910952: {
                    break block34;
                }
                case -754184266: {
                    v18 = eg.absu("adkp", abtd(int ), (int)159);
                    continue block34;
                }
                case 525924098: {
                    v18 = eg.absu("adkr", abtd(int ), (int)160);
                    continue block34;
                }
            }
            break;
        }
        v19 = nd.multAlpha(eg.TIME_BACKGROUND_BORDER_COLOR, var5_5);
        v20 = eg.absu("adku", absr(int ), (int)546);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("adkv", abtd(int ), (int)161)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == eg.absu("adkw", absr(int ), (int)547)) break;
            v21 /* !! */  = (long)eg.absu("adky", absr(int ), (int)548);
        }
        ki.outline(var0, var6_9, var7_10, var4_4, (float)v13, (float)v14, (float)v15, v19, (boolean)v20);
        if (var8_8) ** GOTO lbl21
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_8) ** break;
                ** continue;
                return;
            }
lbl101:
            // 2 sources

            case 0: {
                var9_7 /* !! */  = (int)eg.absu("adla", absr(int ), (int)549);
                if (!var10_6) break;
                throw null;
            }
lbl105:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_7 /* !! */  = (int)eg.absu("adlc", absr(int ), (int)550);
                    if (var10_6) {
                        throw null;
                    }
                    ** GOTO lbl137
                    break;
                }
            }
lbl111:
            // 2 sources

            case 2: {
                var9_7 /* !! */  = (int)eg.absu("adld", absr(int ), (int)551);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl116:
            // 2 sources

            case 3: {
                var9_7 /* !! */  = (int)eg.absu("adle", absr(int ), (int)552);
                if (!var10_6) ** GOTO lbl105
                throw null;
            }
            case 4: {
                var9_7 /* !! */  = (int)eg.absu("adlg", absr(int ), (int)553);
                if (!var10_6) ** GOTO lbl116
                throw null;
            }
            case 5: {
                var9_7 /* !! */  = (int)eg.absu("adlh", absr(int ), (int)554);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 6: {
                var9_7 /* !! */  = (int)eg.absu("adli", absr(int ), (int)555);
                if (!var10_6) ** GOTO lbl105
                throw null;
            }
lbl133:
            // 3 sources

            case 7: {
                var9_7 /* !! */  = (int)eg.absu("adlj", absr(int ), (int)556);
                if (!var10_6) ** GOTO lbl101
                throw null;
            }
lbl137:
            // 2 sources

            case 8: {
                var9_7 /* !! */  = (int)eg.absu("adll", absr(int ), (int)557);
                if (!var10_6) ** GOTO lbl133
                throw null;
            }
lbl141:
            // 2 sources

            case 9: {
                var9_7 /* !! */  = (int)eg.absu("adln", absr(int ), (int)558);
                if (!var10_6) ** GOTO lbl111
                throw null;
            }
            case 10: {
                var9_7 /* !! */  = (int)eg.absu("adlp", absr(int ), (int)559);
                if (!var10_6) ** GOTO lbl105
                throw null;
            }
            case 11: 
        }
        var9_7 /* !! */  = (int)eg.absu("adlq", absr(int ), (int)560);
        ** while (!var10_6)
lbl152:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawLowerContent(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, ks var6_6, eg$TextParts var7_7, eg$TextParts var8_8, eg$TextParts var9_9, eg$RollingText var10_10, eg$RollingText var11_11, long var12_12, float var14_13) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("acsc", abtd(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("acsd", absr(int ), (int)210)) break;
            v0 /* !! */  = (long)eg.absu("acse", absr(int ), (int)211);
        }
        var19_14 = eg.c;
        v1 /* !! */  = eg.bn;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(eg.absu("acsg", abtd(int ), (int)43) - eg.absu("acsf", abtd(int ), (int)42));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1808910952: {
                    break block35;
                }
                case -1036372480: {
                    continue block35;
                }
            }
            break;
        }
        var18_15 /* !! */  = eg.b;
        if (var18_15 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_15 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("acsh", abtd(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == eg.absu("acsi", absr(int ), (int)212)) break;
                    v2 /* !! */  = (long)eg.absu("acsj", absr(int ), (int)213);
                }
                var17_16 = eg.a;
                if (var19_14) {
                    throw null;
lbl28:
                    // 11 sources

                    return;
                }
                if (var17_16 || var17_16) ** GOTO lbl28
                var15_17 = var1_1 + eg.absu("acsk", abtn(int ), (int)214);
                if (var17_16 || var17_16) ** GOTO lbl28
                var16_18 = var2_2 + eg.absu("acsl", abtn(int ), (int)215);
                if (var17_16 || var17_16) ** GOTO lbl28
                v3 /* !! */  = eg.bn;
                if (true) ** GOTO lbl39
                block38: while (true) {
                    v3 /* !! */  = (long)(eg.absu("acsn", abtd(int ), (int)46) - eg.absu("acsm", abtd(int ), (int)45));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1808910952: {
                            break block38;
                        }
                        case -1484598706: {
                            continue block38;
                        }
                    }
                    break;
                }
                eg.drawLowerContentBackground(var0, var15_17, var16_18, var3_3, var14_13);
                if (var17_16 || var17_16) ** GOTO lbl28
                v4 = eg.absu("acso", abtn(int ), (int)216);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("acsp", abtd(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == eg.absu("acsq", absr(int ), (int)217)) break;
                    v5 /* !! */  = (long)eg.absu("acsr", absr(int ), (int)218);
                }
                eg.drawLowerEntry(var0, var15_17, var16_18, var6_6, "O", (float)v4, var7_7, null, var12_12, var14_13);
                if (var17_16 || var17_16) ** GOTO lbl28
                var15_17 += var3_3 + eg.absu("acss", abtn(int ), (int)219);
                if (var17_16 || var17_16) ** GOTO lbl28
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("acst", abtd(int ), (int)48)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == eg.absu("acsu", absr(int ), (int)220)) break;
                    v6 /* !! */  = (long)eg.absu("acsv", absr(int ), (int)221);
                }
                eg.drawLowerContentBackground(var0, var15_17, var16_18, var4_4, var14_13);
                if (var17_16 || var17_16) ** GOTO lbl28
                v7 = eg.absu("acsw", abtn(int ), (int)222);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("acsx", abtd(int ), (int)49)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == eg.absu("acsy", absr(int ), (int)223)) break;
                    v8 /* !! */  = (long)eg.absu("acsz", absr(int ), (int)224);
                }
                eg.drawLowerEntry(var0, var15_17, var16_18, var6_6, "P", (float)v7, var8_8, var10_10, var12_12, var14_13);
                if (var17_16 || var17_16) ** GOTO lbl28
                var15_17 += var4_4 + eg.absu("acta", abtn(int ), (int)225);
                if (var17_16 || var17_16) ** GOTO lbl28
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("actb", abtd(int ), (int)50)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == eg.absu("actc", absr(int ), (int)226)) break;
                    v9 /* !! */  = (long)eg.absu("actd", absr(int ), (int)227);
                }
                eg.drawLowerContentBackground(var0, var15_17, var16_18, var5_5, var14_13);
                if (var17_16 || var17_16) ** GOTO lbl28
                v10 = eg.absu("acte", abtn(int ), (int)228);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("actf", abtd(int ), (int)51)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == eg.absu("actg", absr(int ), (int)229)) break;
                    v11 /* !! */  = (long)eg.absu("acth", absr(int ), (int)230);
                }
                eg.drawLowerEntry(var0, var15_17, var16_18, var6_6, "Q", (float)v10, var9_9, var11_11, var12_12, var14_13);
                if (var17_16 || var17_16) ** continue;
                return;
            }
lbl89:
            // 3 sources

            case 0: {
                var18_15 /* !! */  = (int)eg.absu("acti", absr(int ), (int)231);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 1: {
                do {
                    var18_15 /* !! */  = (int)eg.absu("actj", absr(int ), (int)232);
                } while (!var19_14);
                throw null;
            }
            case 2: {
                var18_15 /* !! */  = (int)eg.absu("actk", absr(int ), (int)233);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_15 /* !! */  = (int)eg.absu("actl", absr(int ), (int)234);
                    if (var19_14) {
                        throw null;
                    }
                    ** GOTO lbl175
                    break;
                }
            }
            case 4: {
                var18_15 /* !! */  = (int)eg.absu("actm", absr(int ), (int)235);
                if (var19_14) {
                    throw null;
                }
            }
lbl114:
            // 4 sources

            case 5: {
                var18_15 /* !! */  = (int)eg.absu("actn", absr(int ), (int)236);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 6: {
                var18_15 /* !! */  = (int)eg.absu("acto", absr(int ), (int)237);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl124:
            // 4 sources

            case 7: {
                var18_15 /* !! */  = (int)eg.absu("actp", absr(int ), (int)238);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl129:
            // 2 sources

            case 8: {
                var18_15 /* !! */  = (int)eg.absu("actq", absr(int ), (int)239);
                if (!var19_14) break;
                throw null;
            }
            case 9: {
                var18_15 /* !! */  = (int)eg.absu("actr", absr(int ), (int)240);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 10: {
                var18_15 /* !! */  = (int)eg.absu("acts", absr(int ), (int)241);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 11: {
                var18_15 /* !! */  = (int)eg.absu("actt", absr(int ), (int)242);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 12: {
                var18_15 /* !! */  = (int)eg.absu("actu", absr(int ), (int)243);
                if (!var19_14) ** GOTO lbl129
                throw null;
            }
lbl152:
            // 2 sources

            case 13: {
                var18_15 /* !! */  = (int)eg.absu("actv", absr(int ), (int)244);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 14: {
                var18_15 /* !! */  = (int)eg.absu("actw", absr(int ), (int)245);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl162:
            // 2 sources

            case 15: {
                var18_15 /* !! */  = (int)eg.absu("actx", absr(int ), (int)246);
                if (!var19_14) break;
                throw null;
            }
lbl166:
            // 4 sources

            case 16: {
                var18_15 /* !! */  = (int)eg.absu("acty", absr(int ), (int)247);
                if (!var19_14) ** GOTO lbl124
                throw null;
            }
lbl170:
            // 2 sources

            case 17: {
                var18_15 /* !! */  = (int)eg.absu("actz", absr(int ), (int)248);
                if (var19_14) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl175:
            // 4 sources

            case 18: {
                var18_15 /* !! */  = (int)eg.absu("acua", absr(int ), (int)249);
                if (!var19_14) ** GOTO lbl89
                throw null;
            }
lbl179:
            // 2 sources

            case 19: {
                var18_15 /* !! */  = (int)eg.absu("acub", absr(int ), (int)250);
                if (!var19_14) ** GOTO lbl166
                throw null;
            }
lbl183:
            // 3 sources

            case 20: {
                var18_15 /* !! */  = (int)eg.absu("acuc", absr(int ), (int)251);
                if (!var19_14) ** GOTO lbl124
                throw null;
            }
            case 21: {
                var18_15 /* !! */  = (int)eg.absu("acud", absr(int ), (int)252);
                if (!var19_14) ** GOTO lbl114
                throw null;
            }
            case 22: {
                var18_15 /* !! */  = (int)eg.absu("acue", absr(int ), (int)253);
                if (!var19_14) ** GOTO lbl89
                throw null;
            }
            case 23: 
        }
        var18_15 /* !! */  = (int)eg.absu("acuf", absr(int ), (int)254);
        ** while (!var19_14)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aehg() {
        eg.absz[100] = 2398386532034905801L;
        eg.absz[101] = -8622987606068579229L;
        eg.absz[102] = 5373087836138619097L;
        eg.absz[103] = 2893651398516568284L;
        eg.absz[104] = 7363337675998235023L;
        eg.absz[105] = 7286673676401708450L;
        eg.absz[106] = -1411239619002598311L;
        eg.absz[107] = 950497574708185247L;
        eg.absz[108] = -3764487686824864462L;
        eg.absz[109] = 6573606038934361936L;
        eg.absz[110] = -5482810914718875554L;
        eg.absz[111] = 8238635514726337006L;
        eg.absz[112] = -7388990982423289283L;
        eg.absz[113] = -7934408701872886515L;
        eg.absz[114] = 5794808079377082121L;
        eg.absz[115] = -7482843994675381058L;
        eg.absz[116] = -6750884183843867208L;
        eg.absz[117] = -312491318365791829L;
        eg.absz[118] = 6250732748906662612L;
        eg.absz[119] = 3316313064688247029L;
        eg.absz[120] = -8950038977950848190L;
        eg.absz[121] = 4412309296935853944L;
        eg.absz[122] = -1170030647037294887L;
        eg.absz[123] = -2257714151091338212L;
        eg.absz[124] = 7790833467338009320L;
        eg.absz[125] = 851802402381450897L;
        eg.absz[126] = -5597608193371737496L;
        eg.absz[127] = 4706852233834240668L;
        eg.absz[128] = 1823379681706787501L;
        eg.absz[129] = 1014503737308434833L;
        eg.absz[130] = -5371802685010696965L;
        eg.absz[131] = 9110138774935564852L;
        eg.absz[132] = 6183572771944740179L;
        eg.absz[133] = 3331493677887727751L;
        eg.absz[134] = 7384269631314943277L;
        eg.absz[135] = 7838637944065508699L;
        eg.absz[136] = 774943247263172333L;
        eg.absz[137] = 5563420752067843844L;
        eg.absz[138] = 1329471046141195441L;
        eg.absz[139] = 2739527879402582874L;
        eg.absz[140] = 6407158781895730071L;
        eg.absz[141] = 6980747618102667519L;
        eg.absz[142] = -5858320802861745329L;
        eg.absz[143] = 5771173787634550516L;
        eg.absz[144] = 6335463147939165531L;
        eg.absz[145] = -7993336222485459366L;
        eg.absz[146] = -6652224670465491448L;
        eg.absz[147] = 8910771344978269859L;
        eg.absz[148] = -3126059985502276042L;
        eg.absz[149] = 6608329123351072559L;
        eg.absz[150] = -8631734137580554731L;
        eg.absz[151] = -4195425583467306051L;
        eg.absz[152] = -5639034540079502103L;
        eg.absz[153] = 3184530707929231371L;
        eg.absz[154] = -4288803252083035594L;
        eg.absz[155] = -4622886014268636594L;
        eg.absz[156] = 7571274480185333590L;
        eg.absz[157] = 7255385565398657036L;
        eg.absz[158] = -8641203884429087362L;
        eg.absz[159] = -6726362957339379793L;
        eg.absz[160] = 1228763171612271611L;
        eg.absz[161] = -5384619509059761564L;
        eg.absz[162] = 7951475566044062052L;
        eg.absz[163] = 7359741595800840991L;
        eg.absz[164] = 8660602743631842082L;
        eg.absz[165] = 7028365107028999947L;
        eg.absz[166] = 5306923321047770334L;
        eg.absz[167] = 134351005702112265L;
        eg.absz[168] = -8328463238887482711L;
        eg.absz[169] = -8221752955397211798L;
        eg.absz[170] = -172353198944930082L;
        eg.absz[171] = 8250044261067725072L;
        eg.absz[172] = -4914117884620309944L;
        eg.absz[173] = -7265761619628041353L;
        eg.absz[174] = 7583490602640194899L;
        eg.absz[175] = 4989113821864552812L;
        eg.absz[176] = -4188531582704125033L;
        eg.absz[177] = -7239809557441280916L;
        eg.absz[178] = -4717433958487317327L;
        eg.absz[179] = 3512304144575223567L;
        eg.absz[180] = 4986567588019364401L;
        eg.absz[181] = -6500320717798202638L;
        eg.absz[182] = -4307581229895323338L;
        eg.absz[183] = -5539440996941007803L;
        eg.absz[184] = 6868765127181290812L;
        eg.absz[185] = -5917818167731421447L;
        eg.absz[186] = 6701866760547272901L;
        eg.absz[187] = 3967129467039441107L;
        eg.absz[188] = 605781745779079603L;
        eg.absz[189] = -5004588719278581730L;
        eg.absz[190] = -4243527377910095477L;
        eg.absz[191] = -9016380030974543052L;
        eg.absz[192] = 1466468588845819012L;
        eg.absz[193] = -1418556803794065832L;
        eg.absz[194] = -8875638565092936878L;
        eg.absz[195] = 7744137004026237116L;
        eg.absz[196] = -4937692789400730466L;
        eg.absz[197] = 1545862817626434315L;
        eg.absz[198] = 4816591404494182876L;
        eg.absz[199] = 8851670669470776530L;
    }

    private static /* synthetic */ double absx(int n2) {
        return Double.longBitsToDouble(absy[n2] ^ absz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float lowerContentWidth(ks var0, eg$TextParts var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("aczb", abtd(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("aczc", absr(int ), (int)365)) break;
            v0 /* !! */  = (long)eg.absu("aczd", absr(int ), (int)366);
        }
        var5_2 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("acze", abtd(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("aczf", absr(int ), (int)367)) break;
            v1 /* !! */  = (long)eg.absu("aczg", absr(int ), (int)368);
        }
        var4_3 /* !! */  = eg.b;
        v2 /* !! */  = eg.bn;
        if (true) ** GOTO lbl17
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - eg.absu("aczh", abtd(int ), (int)69));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1808910952: {
                    break block26;
                }
                case 468198903: {
                    v3 = eg.absu("aczi", abtd(int ), (int)70);
                    continue block26;
                }
                case 1774332679: {
                    v3 = eg.absu("aczj", abtd(int ), (int)71);
                    continue block26;
                }
            }
            break;
        }
        var3_4 = eg.a;
        if (var5_2) {
            throw null;
lbl29:
            // 2 sources

            return (float)eg.absu("aczk", abtn(int ), (int)369);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("aczl", abtd(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eg.absu("aczm", absr(int ), (int)370)) break;
                    v4 /* !! */  = (long)eg.absu("aczn", absr(int ), (int)371);
                }
                v5 = var1_1.primary();
                v6 = eg.absu("aczo", abtn(int ), (int)372);
                v7 /* !! */  = eg.bn;
                if (true) ** GOTO lbl46
                block29: while (true) {
                    v7 /* !! */  = (long)(v8 - eg.absu("aczp", abtd(int ), (int)73));
lbl46:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1808910952: {
                            break block29;
                        }
                        case -1296807126: {
                            v8 = eg.absu("aczq", abtd(int ), (int)74);
                            continue block29;
                        }
                        case -187516100: {
                            v8 = eg.absu("aczr", abtd(int ), (int)75);
                            continue block29;
                        }
                        case 2090777955: {
                            v8 = eg.absu("aczs", abtd(int ), (int)76);
                            continue block29;
                        }
                    }
                    break;
                }
                v9 = kq.width(var0, v5, (float)v6);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("aczt", abtd(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == eg.absu("aczu", absr(int ), (int)373)) break;
                    v10 /* !! */  = (long)eg.absu("aczv", absr(int ), (int)374);
                }
                v11 = var1_1.suffix();
                v12 = eg.absu("aczw", abtn(int ), (int)375);
                v13 /* !! */  = eg.bn;
                if (true) ** GOTO lbl70
                block31: while (true) {
                    v13 /* !! */  = (long)(v14 - eg.absu("aczx", abtd(int ), (int)78));
lbl70:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1808910952: {
                            break block31;
                        }
                        case 438457330: {
                            v14 = eg.absu("aczy", abtd(int ), (int)79);
                            continue block31;
                        }
                        case 1823306306: {
                            v14 = eg.absu("aczz", abtd(int ), (int)80);
                            continue block31;
                        }
                    }
                    break;
                }
                var2_5 = v9 + kq.width(var0, v11, (float)v12);
                if (var3_4 || var3_4) ** continue;
                return (float)(eg.absu("adaa", abtn(int ), (int)376) + var2_5 + eg.absu("adab", abtn(int ), (int)377));
            }
lbl82:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)eg.absu("adac", absr(int ), (int)378);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 1: {
                var4_3 /* !! */  = (int)eg.absu("adad", absr(int ), (int)379);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl92:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)eg.absu("adae", absr(int ), (int)380);
                if (!var5_2) ** GOTO lbl82
                throw null;
            }
lbl96:
            // 2 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)eg.absu("adaf", absr(int ), (int)381);
                } while (!var5_2);
                throw null;
            }
lbl101:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)eg.absu("adag", absr(int ), (int)382);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
            case 5: 
        }
        do {
            var4_3 /* !! */  = (int)eg.absu("adah", absr(int ), (int)383);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void aegs() {
        eg.abss[800] = -205212083;
        eg.abss[801] = -1294742807;
        eg.abss[802] = 1609018788;
        eg.abss[803] = 217145846;
        eg.abss[804] = 1268440060;
        eg.abss[805] = 1554984058;
        eg.abss[806] = -331045887;
        eg.abss[807] = -1023699499;
        eg.abss[808] = -1958004273;
        eg.abss[809] = 628208500;
        eg.abss[810] = -759202795;
        eg.abss[811] = -939625452;
        eg.abss[812] = 1789580029;
        eg.abss[813] = -640361544;
        eg.abss[814] = -1942108285;
        eg.abss[815] = -513511352;
        eg.abss[816] = -1814402680;
        eg.abss[817] = 52762535;
        eg.abss[818] = -362610144;
        eg.abss[819] = 1897667462;
        eg.abss[820] = -1670073436;
        eg.abss[821] = 97214922;
        eg.abss[822] = -2008802789;
        eg.abss[823] = -1110758337;
        eg.abss[824] = 375605131;
        eg.abss[825] = -1338797614;
        eg.abss[826] = 962094292;
        eg.abss[827] = -354245778;
        eg.abss[828] = 224269505;
        eg.abss[829] = 1473744621;
        eg.abss[830] = -782818424;
        eg.abss[831] = -1352116704;
        eg.abss[832] = -1661341485;
        eg.abss[833] = -1907077960;
        eg.abss[834] = 803444328;
        eg.abss[835] = 1063878745;
        eg.abss[836] = -1275379193;
        eg.abss[837] = 1866241521;
        eg.abss[838] = 568859568;
        eg.abss[839] = -1487901104;
        eg.abss[840] = -1602973648;
        eg.abss[841] = -1155656397;
        eg.abss[842] = 1761440409;
        eg.abss[843] = 361400476;
        eg.abss[844] = 922889584;
        eg.abss[845] = -1309186060;
        eg.abss[846] = -1163501357;
        eg.abss[847] = 259743146;
        eg.abss[848] = -1675123984;
        eg.abss[849] = -741547957;
        eg.abss[850] = 109748365;
        eg.abss[851] = 804065692;
        eg.abss[852] = 287240028;
        eg.abss[853] = 1705917295;
        eg.abss[854] = 1014563886;
        eg.abss[855] = 756057592;
        eg.abss[856] = -1010897732;
        eg.abss[857] = 1415394743;
        eg.abss[858] = 1700522643;
        eg.abss[859] = -1932640006;
        eg.abss[860] = 994089523;
        eg.abss[861] = -530859638;
        eg.abss[862] = -1032807306;
        eg.abss[863] = -1390778078;
        eg.abss[864] = -2042416879;
        eg.abss[865] = -1890682156;
        eg.abss[866] = -569210662;
        eg.abss[867] = -1896388141;
        eg.abss[868] = 1290216756;
        eg.abss[869] = -1445646671;
        eg.abss[870] = -1654088853;
        eg.abss[871] = 806425644;
        eg.abss[872] = -914530663;
        eg.abss[873] = -1549047491;
        eg.abss[874] = 73721778;
        eg.abss[875] = 1245673649;
        eg.abss[876] = -1942567358;
        eg.abss[877] = 564010082;
        eg.abss[878] = 601862009;
        eg.abss[879] = -1247052803;
        eg.abss[880] = 1315764206;
        eg.abss[881] = 1586739920;
        eg.abss[882] = -523395049;
        eg.abss[883] = -1674770411;
        eg.abss[884] = 426566498;
        eg.abss[885] = 2017545401;
        eg.abss[886] = 123214970;
        eg.abss[887] = 198222217;
        eg.abss[888] = 434472344;
        eg.abss[889] = -1526270382;
        eg.abss[890] = 228184054;
        eg.abss[891] = -856919984;
        eg.abss[892] = 548006286;
    }

    private static /* synthetic */ void aegw() {
        eg.abst[300] = 1543634678;
        eg.abst[301] = -1745843774;
        eg.abst[302] = -1779498445;
        eg.abst[303] = -1731896825;
        eg.abst[304] = -650753054;
        eg.abst[305] = -109546533;
        eg.abst[306] = 2025588700;
        eg.abst[307] = -840755423;
        eg.abst[308] = 224193646;
        eg.abst[309] = 1109639427;
        eg.abst[310] = -1933421384;
        eg.abst[311] = 89218421;
        eg.abst[312] = -1051381481;
        eg.abst[313] = 1986375689;
        eg.abst[314] = 1276267252;
        eg.abst[315] = 1414960893;
        eg.abst[316] = 871147760;
        eg.abst[317] = -95614554;
        eg.abst[318] = -1348607672;
        eg.abst[319] = -1245725785;
        eg.abst[320] = -1296290854;
        eg.abst[321] = -1094963046;
        eg.abst[322] = -406332857;
        eg.abst[323] = 604002320;
        eg.abst[324] = -1265708045;
        eg.abst[325] = -1840279532;
        eg.abst[326] = 1373543672;
        eg.abst[327] = 2105916562;
        eg.abst[328] = -1665492404;
        eg.abst[329] = 2027031638;
        eg.abst[330] = 1628668580;
        eg.abst[331] = 2103416960;
        eg.abst[332] = 823757534;
        eg.abst[333] = 1207261592;
        eg.abst[334] = -919032335;
        eg.abst[335] = 465601967;
        eg.abst[336] = 1137558461;
        eg.abst[337] = 1660837165;
        eg.abst[338] = 194821935;
        eg.abst[339] = 16599097;
        eg.abst[340] = -1108757619;
        eg.abst[341] = -1754006300;
        eg.abst[342] = 1677523441;
        eg.abst[343] = -220608899;
        eg.abst[344] = 1807305525;
        eg.abst[345] = -991887184;
        eg.abst[346] = -1577340961;
        eg.abst[347] = 593427817;
        eg.abst[348] = -301984045;
        eg.abst[349] = -140514677;
        eg.abst[350] = 1947337931;
        eg.abst[351] = 1785033979;
        eg.abst[352] = -2142539281;
        eg.abst[353] = -323884906;
        eg.abst[354] = 416374785;
        eg.abst[355] = -608962300;
        eg.abst[356] = -893957390;
        eg.abst[357] = -250591868;
        eg.abst[358] = -205906206;
        eg.abst[359] = 55220782;
        eg.abst[360] = 1484204504;
        eg.abst[361] = -1141245127;
        eg.abst[362] = -1724752717;
        eg.abst[363] = -999408831;
        eg.abst[364] = 593260068;
        eg.abst[365] = 1451830945;
        eg.abst[366] = -1163003884;
        eg.abst[367] = -650532838;
        eg.abst[368] = 540324118;
        eg.abst[369] = 973290448;
        eg.abst[370] = 851147204;
        eg.abst[371] = -1337077764;
        eg.abst[372] = 1944439571;
        eg.abst[373] = -168432351;
        eg.abst[374] = -1104129934;
        eg.abst[375] = 620343945;
        eg.abst[376] = -490612305;
        eg.abst[377] = 1754255536;
        eg.abst[378] = -113809245;
        eg.abst[379] = -1149388442;
        eg.abst[380] = -1484661492;
        eg.abst[381] = -1716873485;
        eg.abst[382] = 216456196;
        eg.abst[383] = -871771780;
        eg.abst[384] = 358111831;
        eg.abst[385] = 1477246436;
        eg.abst[386] = -1590338018;
        eg.abst[387] = -113051534;
        eg.abst[388] = 1884654447;
        eg.abst[389] = 1637897578;
        eg.abst[390] = -24064335;
        eg.abst[391] = 1089960829;
        eg.abst[392] = -1003008433;
        eg.abst[393] = 553640507;
        eg.abst[394] = -1597991213;
        eg.abst[395] = 1004216045;
        eg.abst[396] = 1263140807;
        eg.abst[397] = 899921023;
        eg.abst[398] = -987077444;
        eg.abst[399] = 1895534442;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void drawIcon(class_332 class_3322, ks ks2, String string, float f2, float f3, float f4, int n2) {
        ku ku2;
        boolean bl2;
        block15: {
            block14: {
                block13: {
                    block12: {
                        boolean bl3 = c;
                        int n3 = b;
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        if (bl2 || bl2) return;
                        if (ks2 == null) break block12;
                        if (bl2) return;
                        if (!string.isEmpty()) break block13;
                        if (bl2) return;
                    }
                    if (bl2 || bl2) return;
                    return;
                }
                if (bl2 || bl2) return;
                ku2 = ks2.getGlyph(string.charAt((int)eg.absu("acxr", absr(int ), (int)329)));
                if (bl2 || bl2) return;
                if (ku2 == null) break block14;
                if (bl2) return;
                if (!(ku2.width <= 0.0f)) break block15;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        float f5 = f4 * ks2.getEmSize() / ku2.width;
        if (bl2 || bl2) return;
        float f6 = f5 / ks2.getEmSize();
        if (bl2 || bl2) return;
        float f7 = ku2.height * f6;
        if (bl2 || bl2) return;
        float f8 = f3 - f7 * eg.absu("acxs", abtn(int ), (int)330);
        if (bl2 || bl2) return;
        float f9 = f2 - ku2.bearingX * f6;
        if (bl2 || bl2) return;
        float f10 = f8 - ks2.getAscender() * f6 + ku2.bearingY * f6;
        if (bl2 || bl2) return;
        kq.text(class_3322, ks2, string, f9, f10, f5, n2, (boolean)eg.absu("acxt", absr(int ), (int)331));
        if (!bl2 && !bl2) return;
    }

    private static /* synthetic */ void aegr() {
        eg.abss[700] = -1331377439;
        eg.abss[701] = -1747186288;
        eg.abss[702] = -1226996303;
        eg.abss[703] = 1977651355;
        eg.abss[704] = 633813278;
        eg.abss[705] = -351118738;
        eg.abss[706] = -155777640;
        eg.abss[707] = 508268571;
        eg.abss[708] = 1554163388;
        eg.abss[709] = -1641860804;
        eg.abss[710] = 60261404;
        eg.abss[711] = 846503308;
        eg.abss[712] = -273467403;
        eg.abss[713] = 713918136;
        eg.abss[714] = -1137932787;
        eg.abss[715] = -2001554740;
        eg.abss[716] = -1691711199;
        eg.abss[717] = 2110409364;
        eg.abss[718] = -1589550817;
        eg.abss[719] = -482362163;
        eg.abss[720] = 313093174;
        eg.abss[721] = -1598440297;
        eg.abss[722] = -2041544614;
        eg.abss[723] = -1116973182;
        eg.abss[724] = 1723691185;
        eg.abss[725] = 414425594;
        eg.abss[726] = -413829124;
        eg.abss[727] = 821688756;
        eg.abss[728] = -621883332;
        eg.abss[729] = 1909653964;
        eg.abss[730] = -1634532774;
        eg.abss[731] = 1668921022;
        eg.abss[732] = -1628187447;
        eg.abss[733] = 1236252436;
        eg.abss[734] = 897941832;
        eg.abss[735] = 1119533818;
        eg.abss[736] = 1727794165;
        eg.abss[737] = 1363124341;
        eg.abss[738] = -1713669822;
        eg.abss[739] = 442623314;
        eg.abss[740] = -1512121562;
        eg.abss[741] = -2072941527;
        eg.abss[742] = 344897044;
        eg.abss[743] = -898226820;
        eg.abss[744] = 1069435598;
        eg.abss[745] = 1407351835;
        eg.abss[746] = -1014911836;
        eg.abss[747] = -1522303815;
        eg.abss[748] = 1517819831;
        eg.abss[749] = -359137839;
        eg.abss[750] = -1172367996;
        eg.abss[751] = -458175131;
        eg.abss[752] = -1095998613;
        eg.abss[753] = -441223619;
        eg.abss[754] = 1065060380;
        eg.abss[755] = 1245893738;
        eg.abss[756] = 521050096;
        eg.abss[757] = -1459764234;
        eg.abss[758] = -556677412;
        eg.abss[759] = -1949763835;
        eg.abss[760] = 1776962552;
        eg.abss[761] = 525328871;
        eg.abss[762] = -1484147191;
        eg.abss[763] = 1062652116;
        eg.abss[764] = -1123072772;
        eg.abss[765] = 143713988;
        eg.abss[766] = -2004538618;
        eg.abss[767] = -973642166;
        eg.abss[768] = 2079646405;
        eg.abss[769] = -596309532;
        eg.abss[770] = -697496813;
        eg.abss[771] = 1538659693;
        eg.abss[772] = -1005154276;
        eg.abss[773] = -1449021549;
        eg.abss[774] = 694972415;
        eg.abss[775] = -1217806293;
        eg.abss[776] = 1099957324;
        eg.abss[777] = 1620493205;
        eg.abss[778] = 728678252;
        eg.abss[779] = 728186023;
        eg.abss[780] = 2132373956;
        eg.abss[781] = 1493033410;
        eg.abss[782] = 936440328;
        eg.abss[783] = -870811117;
        eg.abss[784] = -705630125;
        eg.abss[785] = 184816693;
        eg.abss[786] = -809142123;
        eg.abss[787] = -256573462;
        eg.abss[788] = 1296021486;
        eg.abss[789] = 1701521814;
        eg.abss[790] = -1767018251;
        eg.abss[791] = 1060789306;
        eg.abss[792] = 173998604;
        eg.abss[793] = -1739856355;
        eg.abss[794] = 1856055081;
        eg.abss[795] = 361326854;
        eg.abss[796] = -2058771353;
        eg.abss[797] = -598567070;
        eg.abss[798] = 1116540687;
        eg.abss[799] = 1618448214;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public eg() {
        var2_1 /* !! */  = eg.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Watermark", (int)eg.absu("absv", absr(int ), (int)0), (int)eg.absu("absw", absr(int ), (int)1), (int)Math.ceil((double)eg.absu("abta", absx(int ), (int)0)), (int)Math.ceil((double)eg.absu("abtb", absx(int ), (int)1)), (boolean)eg.absu("abtc", absr(int ), (int)2));
                this.timeRolling = new eg$RollingText();
                this.pingRolling = new eg$RollingText();
                this.fpsRolling = new eg$RollingText();
                this.cachedTimeMinute = (long)eg.absu("abte", abtd(int ), (int)2);
                this.cachedTime = "00:00";
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)eg.absu("abtf", absr(int ), (int)3);
                ** GOTO lbl31
            }
lbl15:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)eg.absu("abtg", absr(int ), (int)4);
                ** GOTO lbl22
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)eg.absu("abth", absr(int ), (int)5);
                    ** GOTO lbl15
                    break;
                }
            }
lbl22:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)eg.absu("abti", absr(int ), (int)6);
                ** GOTO lbl15
            }
lbl25:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)eg.absu("abtj", absr(int ), (int)7);
                ** GOTO lbl22
            }
            case 5: {
                var2_1 /* !! */  = (int)eg.absu("abtk", absr(int ), (int)8);
                ** GOTO lbl22
            }
lbl31:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)eg.absu("abtl", absr(int ), (int)9);
                ** GOTO lbl25
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)eg.absu("abtm", absr(int ), (int)10);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void drawPanelBase(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("acri", abtd(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eg.absu("acrj", absr(int ), (int)194)) break;
            v0 /* !! */  = (long)eg.absu("acrk", absr(int ), (int)195);
        }
        var9_7 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("acrl", abtd(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("acrm", absr(int ), (int)196)) break;
            v1 /* !! */  = (long)eg.absu("acrn", absr(int ), (int)197);
        }
        var8_8 /* !! */  = eg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("acro", abtd(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("acrp", absr(int ), (int)198)) {
                var7_9 = eg.a;
                if (var9_7) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)eg.absu("acrq", absr(int ), (int)199);
        }
        if (var7_9 || var7_9) return;
        v3 = eg.absu("acrr", abtn(int ), (int)200);
        v4 = eg.absu("acrs", abtn(int ), (int)201);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("acrt", abtd(int ), (int)40)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == eg.absu("acru", absr(int ), (int)202)) {
                at.panelWithInnerShadow(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, (float)v3, (float)v4);
                if (var7_9) return;
                break;
            }
            v5 /* !! */  = (long)eg.absu("acrv", absr(int ), (int)203);
        }
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block12: while (true) {
            block25: {
                switch (cfr_temp_0 == -2147483648 ? var8_8 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var7_9) return;
                        return;
                    }
                    case 0: {
                        var8_8 /* !! */  = (int)eg.absu("acrw", absr(int ), (int)204);
                        cfr_temp_0 = 4;
                        if (var9_7) {
                            throw null;
                        }
                        break block25;
                    }
                    case 2: {
                        do {
                            var8_8 /* !! */  = (int)eg.absu("acry", absr(int ), (int)206);
                        } while (!var9_7);
                        throw null;
                    }
                    case 3: {
                        ** GOTO lbl62
                    }
                    case 5: {
                        ** GOTO lbl59
                    }
                    case 1: {
                        var8_8 /* !! */  = (int)eg.absu("acrx", absr(int ), (int)205);
                        if (!var9_7) ** break;
                        throw null;
lbl59:
                        // 2 sources

                        var8_8 /* !! */  = (int)eg.absu("acsb", absr(int ), (int)209);
                        if (var9_7) {
                            throw null;
                        }
lbl62:
                        // 3 sources

                        var8_8 /* !! */  = (int)eg.absu("acrz", absr(int ), (int)207);
                        if (var9_7) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl70
            }
            do {
                if (true) continue block12;
lbl70:
                // 2 sources

                var8_8 /* !! */  = (int)eg.absu("acsa", absr(int ), (int)208);
                cfr_temp_0 = 1;
            } while (!var9_7);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void aehe() {
        eg.absy[200] = -4281051623781757534L;
        eg.absy[201] = 8226629623882539772L;
        eg.absy[202] = -8125169256555373033L;
        eg.absy[203] = -8737317460972881525L;
        eg.absy[204] = 7526769539872741190L;
        eg.absy[205] = 3034183794626890507L;
        eg.absy[206] = 2232949747000006197L;
        eg.absy[207] = 7606623053878775033L;
        eg.absy[208] = 8961878354937556916L;
        eg.absy[209] = 2768895399926530985L;
        eg.absy[210] = 2884345983955735185L;
        eg.absy[211] = -3256417192584093750L;
        eg.absy[212] = 2822477557439985000L;
        eg.absy[213] = 7913619631649513338L;
        eg.absy[214] = -4063700453190179970L;
        eg.absy[215] = 5226501871443307821L;
        eg.absy[216] = 9191706649402240685L;
        eg.absy[217] = -2255307649160117406L;
        eg.absy[218] = -3680166373850026087L;
        eg.absy[219] = 2692724116229910051L;
        eg.absy[220] = 3118236993355621487L;
        eg.absy[221] = 3032813012297365118L;
        eg.absy[222] = -4913152415574574908L;
        eg.absy[223] = -8805418726089195653L;
        eg.absy[224] = 7458651248875194129L;
        eg.absy[225] = 535253881517085050L;
        eg.absy[226] = -5706031203793380607L;
        eg.absy[227] = 5666976063337783196L;
        eg.absy[228] = -3072533390498193684L;
        eg.absy[229] = 7283217823093852970L;
        eg.absy[230] = -5490331384485057053L;
        eg.absy[231] = -231041508336675042L;
        eg.absy[232] = -260231426663248911L;
        eg.absy[233] = 4810946388237561591L;
        eg.absy[234] = -1833506376023977938L;
        eg.absy[235] = -4163506702466817232L;
        eg.absy[236] = 2349637603784538105L;
        eg.absy[237] = 5861925019792662400L;
    }

    private static /* synthetic */ void aegt() {
        eg.abst[0] = -1659906002;
        eg.abst[1] = 453662207;
        eg.abst[2] = -259489606;
        eg.abst[3] = 350586720;
        eg.abst[4] = -767591056;
        eg.abst[5] = -1374637814;
        eg.abst[6] = -534855491;
        eg.abst[7] = 1458779743;
        eg.abst[8] = 1200451538;
        eg.abst[9] = -146529809;
        eg.abst[10] = -1542221257;
        eg.abst[11] = -1385346913;
        eg.abst[12] = -772053148;
        eg.abst[13] = -993797895;
        eg.abst[14] = -1335899992;
        eg.abst[15] = 2003860571;
        eg.abst[16] = 1871718503;
        eg.abst[17] = 418494664;
        eg.abst[18] = 1194393723;
        eg.abst[19] = 2048482444;
        eg.abst[20] = 935758311;
        eg.abst[21] = 6155251;
        eg.abst[22] = -558798623;
        eg.abst[23] = 1741296653;
        eg.abst[24] = -1152005151;
        eg.abst[25] = 1049256234;
        eg.abst[26] = -1979083156;
        eg.abst[27] = 711587385;
        eg.abst[28] = 1107038648;
        eg.abst[29] = -541103505;
        eg.abst[30] = -74481575;
        eg.abst[31] = -264751911;
        eg.abst[32] = -1943558256;
        eg.abst[33] = 1792423043;
        eg.abst[34] = 1985923293;
        eg.abst[35] = -1773607279;
        eg.abst[36] = 912204702;
        eg.abst[37] = -780647620;
        eg.abst[38] = 1128578102;
        eg.abst[39] = -390021593;
        eg.abst[40] = -460672996;
        eg.abst[41] = -1172794012;
        eg.abst[42] = -1078699921;
        eg.abst[43] = -328210940;
        eg.abst[44] = 15314546;
        eg.abst[45] = -454906669;
        eg.abst[46] = -1420474651;
        eg.abst[47] = 1352569141;
        eg.abst[48] = -1095905280;
        eg.abst[49] = 264998462;
        eg.abst[50] = -2137876709;
        eg.abst[51] = 330321523;
        eg.abst[52] = 983758412;
        eg.abst[53] = 682453215;
        eg.abst[54] = 1714321285;
        eg.abst[55] = 1384657504;
        eg.abst[56] = -1250014734;
        eg.abst[57] = -259812267;
        eg.abst[58] = 1545086884;
        eg.abst[59] = 428794385;
        eg.abst[60] = 714296536;
        eg.abst[61] = -1261565752;
        eg.abst[62] = -2115602606;
        eg.abst[63] = -1364180532;
        eg.abst[64] = -796173403;
        eg.abst[65] = -353258160;
        eg.abst[66] = 682256222;
        eg.abst[67] = -994128878;
        eg.abst[68] = -359705997;
        eg.abst[69] = -1763878761;
        eg.abst[70] = -1863139493;
        eg.abst[71] = -1828268833;
        eg.abst[72] = 454707394;
        eg.abst[73] = -1064255556;
        eg.abst[74] = 705866933;
        eg.abst[75] = 935083311;
        eg.abst[76] = -777545552;
        eg.abst[77] = 1033801594;
        eg.abst[78] = -1639268604;
        eg.abst[79] = 764500676;
        eg.abst[80] = -1864522394;
        eg.abst[81] = -1969292407;
        eg.abst[82] = 1100273060;
        eg.abst[83] = 208541734;
        eg.abst[84] = 2130318549;
        eg.abst[85] = -821292989;
        eg.abst[86] = -1144466811;
        eg.abst[87] = -1490382613;
        eg.abst[88] = -1118080862;
        eg.abst[89] = -1033473397;
        eg.abst[90] = 1004086847;
        eg.abst[91] = -1130320328;
        eg.abst[92] = 1632592478;
        eg.abst[93] = 2114697706;
        eg.abst[94] = -1237087896;
        eg.abst[95] = -2053339257;
        eg.abst[96] = 118226682;
        eg.abst[97] = 840288506;
        eg.abst[98] = -977045719;
        eg.abst[99] = 325815210;
    }

    private static /* synthetic */ void aehc() {
        eg.absy[0] = 6732358442358999984L;
        eg.absy[1] = -2265691365171309687L;
        eg.absy[2] = 2524954886492626363L;
        eg.absy[3] = 9099988470909534723L;
        eg.absy[4] = -4350822550051670012L;
        eg.absy[5] = -3466377178108020464L;
        eg.absy[6] = 4988282519515272107L;
        eg.absy[7] = 567983292414802194L;
        eg.absy[8] = -8914597880216932248L;
        eg.absy[9] = 225866166662833229L;
        eg.absy[10] = 1430174957113344998L;
        eg.absy[11] = 5303861476577878450L;
        eg.absy[12] = -1307076957099853060L;
        eg.absy[13] = 5254284810411981737L;
        eg.absy[14] = -7927112676678252542L;
        eg.absy[15] = 1876060364174965812L;
        eg.absy[16] = 3585440820468504336L;
        eg.absy[17] = 5929783198501386572L;
        eg.absy[18] = -5069971806224492693L;
        eg.absy[19] = -8986948218135263296L;
        eg.absy[20] = -509346865392991367L;
        eg.absy[21] = -8530728165281321005L;
        eg.absy[22] = -3324870045804991416L;
        eg.absy[23] = 1197249354938290529L;
        eg.absy[24] = -7909559869597867152L;
        eg.absy[25] = 1585156752853082801L;
        eg.absy[26] = -578245192150787283L;
        eg.absy[27] = 1406868557336496022L;
        eg.absy[28] = 1020283378992023591L;
        eg.absy[29] = 5531744253185144584L;
        eg.absy[30] = 6944493691427559853L;
        eg.absy[31] = -6333588805651999194L;
        eg.absy[32] = 8838143675701731666L;
        eg.absy[33] = 1171898121949729583L;
        eg.absy[34] = 5973969164470073153L;
        eg.absy[35] = 5983057146649256059L;
        eg.absy[36] = -3124197899639360439L;
        eg.absy[37] = -1509262583775082583L;
        eg.absy[38] = 7605453839436900532L;
        eg.absy[39] = -7181476273980039263L;
        eg.absy[40] = 3329180854979894925L;
        eg.absy[41] = -9005156000516018191L;
        eg.absy[42] = -5703105476235351947L;
        eg.absy[43] = -6151592497615359686L;
        eg.absy[44] = 6646400810096749477L;
        eg.absy[45] = 582518333229194076L;
        eg.absy[46] = 8666239274594562189L;
        eg.absy[47] = -675366354266675399L;
        eg.absy[48] = -2585850752077059332L;
        eg.absy[49] = 6060009450115293931L;
        eg.absy[50] = -6734131359935269466L;
        eg.absy[51] = -6732077569089819219L;
        eg.absy[52] = 468075301870580432L;
        eg.absy[53] = 6435673804053790596L;
        eg.absy[54] = 1041722617572064851L;
        eg.absy[55] = -4767033090893258562L;
        eg.absy[56] = 4695452625033175335L;
        eg.absy[57] = 2486130964500458001L;
        eg.absy[58] = -8649844400025316784L;
        eg.absy[59] = 4207700264714248105L;
        eg.absy[60] = -1624074529389824304L;
        eg.absy[61] = -7339869384300312847L;
        eg.absy[62] = 2423625611067177655L;
        eg.absy[63] = 7011624137621868598L;
        eg.absy[64] = -3831083897599683569L;
        eg.absy[65] = -6966257592286585808L;
        eg.absy[66] = 3833607913542821194L;
        eg.absy[67] = -5478323857575210629L;
        eg.absy[68] = 7704317675573860172L;
        eg.absy[69] = 1504240705007934223L;
        eg.absy[70] = 7527856564239517164L;
        eg.absy[71] = -1565995919179434480L;
        eg.absy[72] = -5434422316050422521L;
        eg.absy[73] = 6203417290984596410L;
        eg.absy[74] = -7616407220597597507L;
        eg.absy[75] = 5572541328412109361L;
        eg.absy[76] = 5425843141962775511L;
        eg.absy[77] = -7357474176123451854L;
        eg.absy[78] = -1982692877646534127L;
        eg.absy[79] = 1466139121841216969L;
        eg.absy[80] = -8437804335336675544L;
        eg.absy[81] = 5034075070232802352L;
        eg.absy[82] = 8470518101997616172L;
        eg.absy[83] = 6406691451161265797L;
        eg.absy[84] = 901970655059548575L;
        eg.absy[85] = 5809659561369972160L;
        eg.absy[86] = -4267394166571703451L;
        eg.absy[87] = 8355026477465285494L;
        eg.absy[88] = 276928999240782029L;
        eg.absy[89] = 775936205122036568L;
        eg.absy[90] = -1326647163056281849L;
        eg.absy[91] = -8627097193827470519L;
        eg.absy[92] = 4708435027270225008L;
        eg.absy[93] = 5331643050529949976L;
        eg.absy[94] = -96565537299358349L;
        eg.absy[95] = 8364473114431728242L;
        eg.absy[96] = 7591152517025268385L;
        eg.absy[97] = -2364142504844056871L;
        eg.absy[98] = -8545543435886397327L;
        eg.absy[99] = -4818694580953974956L;
    }

    private static /* synthetic */ void aegk() {
        eg.abss[0] = -1659906002;
        eg.abss[1] = 453662207;
        eg.abss[2] = -259489606;
        eg.abss[3] = 350586724;
        eg.abss[4] = -767591056;
        eg.abss[5] = -1374637809;
        eg.abss[6] = -534855489;
        eg.abss[7] = 1458779743;
        eg.abss[8] = 1200451540;
        eg.abss[9] = -146529814;
        eg.abss[10] = -1542221260;
        eg.abss[11] = -300791649;
        eg.abss[12] = -1862568926;
        eg.abss[13] = -2050765889;
        eg.abss[14] = -239046433;
        eg.abss[15] = 933788008;
        eg.abss[16] = 773105997;
        eg.abss[17] = 1480670979;
        eg.abss[18] = 116051804;
        eg.abss[19] = 974038812;
        eg.abss[20] = 2012967828;
        eg.abss[21] = 1080037760;
        eg.abss[22] = -1633250447;
        eg.abss[23] = 668856221;
        eg.abss[24] = -77057646;
        eg.abss[25] = 44676640;
        eg.abss[26] = -1257662868;
        eg.abss[27] = 1789523513;
        eg.abss[28] = 6558136;
        eg.abss[29] = -524326289;
        eg.abss[30] = -997228455;
        eg.abss[31] = -1308889619;
        eg.abss[32] = -869849344;
        eg.abss[33] = 722857399;
        eg.abss[34] = 917767901;
        eg.abss[35] = -678740059;
        eg.abss[36] = 1991634334;
        eg.abss[37] = -296581279;
        eg.abss[38] = 42427650;
        eg.abss[39] = -1473613785;
        eg.abss[40] = -1521915608;
        eg.abss[41] = -84780188;
        eg.abss[42] = -2137088974;
        eg.abss[43] = -328210853;
        eg.abss[44] = 15314540;
        eg.abss[45] = -454906646;
        eg.abss[46] = -1420474671;
        eg.abss[47] = 1352569097;
        eg.abss[48] = -1095905264;
        eg.abss[49] = 264998448;
        eg.abss[50] = -2137876653;
        eg.abss[51] = 330321486;
        eg.abss[52] = 983758404;
        eg.abss[53] = 682453174;
        eg.abss[54] = 1714321374;
        eg.abss[55] = 1384657485;
        eg.abss[56] = -1250014808;
        eg.abss[57] = -259812281;
        eg.abss[58] = 1545086902;
        eg.abss[59] = 428794444;
        eg.abss[60] = 714296523;
        eg.abss[61] = -1261565734;
        eg.abss[62] = -2115602581;
        eg.abss[63] = -1364180541;
        eg.abss[64] = -796173319;
        eg.abss[65] = -353258170;
        eg.abss[66] = 682256205;
        eg.abss[67] = -994128833;
        eg.abss[68] = -359706059;
        eg.abss[69] = -1763878762;
        eg.abss[70] = -1863139477;
        eg.abss[71] = -1828268844;
        eg.abss[72] = 454707436;
        eg.abss[73] = -1064255608;
        eg.abss[74] = 705867002;
        eg.abss[75] = 935083281;
        eg.abss[76] = -777545573;
        eg.abss[77] = 1033801578;
        eg.abss[78] = -1639268562;
        eg.abss[79] = 764500721;
        eg.abss[80] = -1864522381;
        eg.abss[81] = -1969292365;
        eg.abss[82] = 1100273046;
        eg.abss[83] = 208541816;
        eg.abss[84] = 2130318547;
        eg.abss[85] = -821293010;
        eg.abss[86] = -1144466749;
        eg.abss[87] = -1490382661;
        eg.abss[88] = -1118080784;
        eg.abss[89] = -1033473369;
        eg.abss[90] = 1004086902;
        eg.abss[91] = -1130320364;
        eg.abss[92] = 1632592466;
        eg.abss[93] = 2114697657;
        eg.abss[94] = -1237087894;
        eg.abss[95] = -2053339205;
        eg.abss[96] = 118226660;
        eg.abss[97] = 840288423;
        eg.abss[98] = -977045633;
        eg.abss[99] = 325815277;
    }

    private static /* synthetic */ long abtd(int n2) {
        return absy[n2] ^ absz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawProfile(class_332 var0, float var1_1, float var2_2, ks var3_3, String var4_4, float var5_5) {
        v0 /* !! */  = eg.bn;
        if (true) ** GOTO lbl5
        block51: while (true) {
            v0 /* !! */  = (long)(eg.absu("adqq", abtd(int ), (int)163) - eg.absu("adqo", abtd(int ), (int)162));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1808910952: {
                    break block51;
                }
                case 139362018: {
                    continue block51;
                }
            }
            break;
        }
        var10_6 = eg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = eg.bn - eg.absu("adqs", abtd(int ), (int)164)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eg.absu("adqt", absr(int ), (int)621)) break;
            v1 /* !! */  = (long)eg.absu("adqu", absr(int ), (int)622);
        }
        var9_7 /* !! */  = eg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = eg.bn - eg.absu("adqv", abtd(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eg.absu("adqw", absr(int ), (int)623)) break;
            v2 /* !! */  = (long)eg.absu("adqy", absr(int ), (int)624);
        }
        var8_8 = eg.a;
        if (var10_6) {
            throw null;
lbl25:
            // 8 sources

            return;
        }
        if (var8_8 || var8_8) ** GOTO lbl25
        var6_9 = var1_1 + eg.absu("adqz", abtn(int ), (int)625);
        if (var8_8 || var8_8) ** GOTO lbl25
        var7_10 = var2_2 + eg.absu("adra", abtn(int ), (int)626);
        if (var8_8) ** GOTO lbl25
        if (var9_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_8) ** GOTO lbl25
                v3 = var6_9 + eg.absu("adrb", abtn(int ), (int)627);
                v4 = var7_10 + eg.absu("adrc", abtn(int ), (int)628);
                v5 = eg.absu("adrd", abtn(int ), (int)629);
                v6 = eg.absu("adre", absr(int ), (int)630);
                v7 /* !! */  = eg.bn;
                if (true) ** GOTO lbl44
                block55: while (true) {
                    v7 /* !! */  = (long)(eg.absu("adrg", abtd(int ), (int)167) - eg.absu("adrf", abtd(int ), (int)166));
lbl44:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1808910952: {
                            break block55;
                        }
                        case 1734878951: {
                            continue block55;
                        }
                    }
                    break;
                }
                v8 = dz.color((int)v6);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = eg.bn - eg.absu("adri", abtd(int ), (int)168)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == eg.absu("adrj", absr(int ), (int)631)) break;
                    v9 /* !! */  = (long)eg.absu("adrk", absr(int ), (int)632);
                }
                v10 = nd.multAlpha(v8, var5_5);
                v11 = eg.absu("adrl", absr(int ), (int)633);
                v12 /* !! */  = eg.bn;
                if (true) ** GOTO lbl61
                block57: while (true) {
                    v12 /* !! */  = (long)(v13 - eg.absu("adrm", abtd(int ), (int)169));
lbl61:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1808910952: {
                            break block57;
                        }
                        case -1047874207: {
                            v13 = eg.absu("adrn", abtd(int ), (int)170);
                            continue block57;
                        }
                        case -66448974: {
                            v13 = eg.absu("adro", abtd(int ), (int)171);
                            continue block57;
                        }
                    }
                    break;
                }
                ki.glow(var0, v3, v4, (float)v5, v10, (boolean)v11);
                if (var8_8 || var8_8) ** GOTO lbl25
                v14 = eg.absu("adrp", abtn(int ), (int)634);
                v15 = eg.absu("adrq", abtn(int ), (int)635);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = eg.bn - eg.absu("adrr", abtd(int ), (int)172)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == eg.absu("adrs", absr(int ), (int)636)) break;
                    v16 /* !! */  = (long)eg.absu("adru", absr(int ), (int)637);
                }
                v17 = eg.absu("adrv", absr(int ), (int)638);
                v18 /* !! */  = eg.bn;
                if (true) ** GOTO lbl84
                block59: while (true) {
                    v18 /* !! */  = (long)(eg.absu("adry", abtd(int ), (int)174) - eg.absu("adrw", abtd(int ), (int)173));
lbl84:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1808910952: {
                            break block59;
                        }
                        case -1444552444: {
                            continue block59;
                        }
                    }
                    break;
                }
                v19 = nd.multAlpha((int)v17, var5_5);
                v20 = eg.absu("adrz", abtn(int ), (int)639);
                v21 = eg.absu("adsa", abtn(int ), (int)640);
                v22 = eg.absu("adsb", abtn(int ), (int)641);
                v23 = eg.absu("adsc", abtn(int ), (int)642);
                v24 = eg.absu("adsd", abtn(int ), (int)643);
                v25 = eg.absu("adse", absr(int ), (int)644);
                v26 = eg.absu("adsf", absr(int ), (int)645);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_4 = eg.bn - eg.absu("adsg", abtd(int ), (int)175)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == eg.absu("adsh", absr(int ), (int)646)) break;
                    v27 /* !! */  = (long)eg.absu("adsi", absr(int ), (int)647);
                }
                ki.imageRegion(var0, var6_9, var7_10, (float)v14, (float)v15, eg.AVATAR_TEXTURE, v19, (float)v20, (float)v21, (float)v22, (float)v23, (float)v24, (boolean)v25, (boolean)v26);
                if (var8_8 || var8_8) ** GOTO lbl25
                v28 = eg.absu("adsj", abtn(int ), (int)648);
                v29 = eg.absu("adsk", abtn(int ), (int)649);
                v30 = eg.absu("adsl", abtn(int ), (int)650);
                v31 = eg.absu("adsm", abtn(int ), (int)651);
                v32 = eg.absu("adsn", absr(int ), (int)652);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_5 = eg.bn - eg.absu("adso", abtd(int ), (int)176)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == eg.absu("adsp", absr(int ), (int)653)) break;
                    v33 /* !! */  = (long)eg.absu("adsq", absr(int ), (int)654);
                }
                v34 = dz.color((int)v32);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_6 = eg.bn - eg.absu("adsr", abtd(int ), (int)177)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == eg.absu("adss", absr(int ), (int)655)) break;
                    v35 /* !! */  = (long)eg.absu("adst", absr(int ), (int)656);
                }
                v36 = nd.multAlpha(v34, var5_5);
                v37 = eg.absu("adsu", absr(int ), (int)657);
                v38 /* !! */  = eg.bn;
                if (true) ** GOTO lbl126
                block63: while (true) {
                    v38 /* !! */  = (long)(v39 - eg.absu("adsv", abtd(int ), (int)178));
lbl126:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -1808910952: {
                            break block63;
                        }
                        case -1165579744: {
                            v39 = eg.absu("adsw", abtd(int ), (int)179);
                            continue block63;
                        }
                        case 1723179294: {
                            v39 = eg.absu("adsx", abtd(int ), (int)180);
                            continue block63;
                        }
                        case 1817406433: {
                            v39 = eg.absu("adsy", abtd(int ), (int)181);
                            continue block63;
                        }
                    }
                    break;
                }
                ki.outline(var0, var6_9, var7_10, (float)v28, (float)v29, (float)v30, (float)v31, v36, (boolean)v37);
                if (var8_8 || var8_8) ** GOTO lbl25
                v40 = var1_1 + eg.absu("adsz", abtn(int ), (int)658);
                v41 = var2_2 + eg.absu("adta", abtn(int ), (int)659);
                v42 = eg.absu("adtb", abtn(int ), (int)660);
                v43 /* !! */  = eg.bn;
                if (true) ** GOTO lbl147
                block64: while (true) {
                    v43 /* !! */  = (long)(eg.absu("adtd", abtd(int ), (int)183) - eg.absu("adtc", abtd(int ), (int)182));
lbl147:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1808910952: {
                            break block64;
                        }
                        case -1762088925: {
                            continue block64;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_7 = eg.bn - eg.absu("adte", abtd(int ), (int)184)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == eg.absu("adtf", absr(int ), (int)661)) break;
                    v44 /* !! */  = (long)eg.absu("adtg", absr(int ), (int)662);
                }
                v45 = nd.multAlpha(eg.USERNAME_COLOR, var5_5);
                v46 = eg.absu("adth", absr(int ), (int)663);
                v47 /* !! */  = eg.bn;
                if (true) ** GOTO lbl163
                block66: while (true) {
                    v47 /* !! */  = (long)(v48 - eg.absu("adti", abtd(int ), (int)185));
lbl163:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1808910952: {
                            break block66;
                        }
                        case -912810122: {
                            v48 = eg.absu("adtj", abtd(int ), (int)186);
                            continue block66;
                        }
                        case -782502328: {
                            v48 = eg.absu("adtk", abtd(int ), (int)187);
                            continue block66;
                        }
                        case 1524740987: {
                            v48 = eg.absu("adtl", abtd(int ), (int)188);
                            continue block66;
                        }
                    }
                    break;
                }
                kq.text(var0, var3_3, var4_4, v40, v41, (float)v42, v45, (boolean)v46);
                if (!var8_8 && !var8_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_7 /* !! */  = (int)eg.absu("adtm", absr(int ), (int)664);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl184:
            // 2 sources

            case 1: {
                var9_7 /* !! */  = (int)eg.absu("adtn", absr(int ), (int)665);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 2: {
                var9_7 /* !! */  = (int)eg.absu("adto", absr(int ), (int)666);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 3: {
                var9_7 /* !! */  = (int)eg.absu("adtp", absr(int ), (int)667);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl199:
            // 3 sources

            case 4: {
                var9_7 /* !! */  = (int)eg.absu("adtq", absr(int ), (int)668);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl204:
            // 2 sources

            case 5: {
                var9_7 /* !! */  = (int)eg.absu("adtr", absr(int ), (int)669);
                if (var10_6) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl209:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_7 /* !! */  = (int)eg.absu("adts", absr(int ), (int)670);
                    if (!var10_6) ** GOTO lbl184
                    throw null;
                }
            }
lbl214:
            // 2 sources

            case 7: {
                var9_7 /* !! */  = (int)eg.absu("adtt", absr(int ), (int)671);
                if (!var10_6) ** GOTO lbl209
                throw null;
            }
lbl218:
            // 4 sources

            case 8: {
                var9_7 /* !! */  = (int)eg.absu("adtu", absr(int ), (int)672);
                if (!var10_6) ** GOTO lbl214
                throw null;
            }
            case 9: {
                var9_7 /* !! */  = (int)eg.absu("adtv", absr(int ), (int)673);
                if (!var10_6) break;
                throw null;
            }
lbl226:
            // 2 sources

            case 10: {
                var9_7 /* !! */  = (int)eg.absu("adtw", absr(int ), (int)674);
                if (!var10_6) break;
                throw null;
            }
            case 11: {
                var9_7 /* !! */  = (int)eg.absu("adtx", absr(int ), (int)675);
                if (!var10_6) ** GOTO lbl226
                throw null;
            }
lbl234:
            // 2 sources

            case 12: {
                var9_7 /* !! */  = (int)eg.absu("adty", absr(int ), (int)676);
                if (!var10_6) ** GOTO lbl199
                throw null;
            }
            case 13: {
                var9_7 /* !! */  = (int)eg.absu("adtz", absr(int ), (int)677);
                if (!var10_6) break;
                throw null;
            }
            case 14: {
                var9_7 /* !! */  = (int)eg.absu("adua", absr(int ), (int)678);
                if (!var10_6) ** GOTO lbl199
                throw null;
            }
            case 15: 
        }
        var9_7 /* !! */  = (int)eg.absu("adub", absr(int ), (int)679);
        ** while (!var10_6)
lbl249:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void drawDraggable(class_332 var1_1, int var2_2) {
        block212: {
            block211: {
                block210: {
                    var35_3 = eg.c;
                    var34_4 /* !! */  = eg.b;
                    var33_5 = eg.a;
                    if (var35_3) {
                        throw null;
lbl6:
                        // 55 sources

                        return;
                    }
                    if (var33_5 || var33_5) ** GOTO lbl6
                    var3_6 = (float)var2_2 / eg.absu("abto", abtn(int ), (int)11);
                    if (var33_5 || var33_5) ** GOTO lbl6
                    kq.hasFonts();
                    if (var33_5 || var33_5) ** GOTO lbl6
                    if (kv.INTER_SEMIBOLD == null) break block210;
                    if (var33_5 || var33_5) ** GOTO lbl6
                    v0 = kv.INTER_SEMIBOLD;
                    if (var35_3) {
                        throw null;
                    }
                    break block211;
                }
                if (var33_5 || var33_5) ** GOTO lbl6
                v0 = var4_7 = kv.getDefault();
            }
            if (var33_5 || var33_5) ** GOTO lbl6
            var5_8 = eg.username();
            if (var33_5 || var33_5) ** GOTO lbl6
            var6_9 = System.currentTimeMillis();
            if (var33_5 || var33_5) ** GOTO lbl6
            var8_10 = var6_9 / eg.absu("abtp", abtd(int ), (int)3);
            if (var33_5 || var33_5) ** GOTO lbl6
            if (var8_10 == this.cachedTimeMinute) break block212;
            if (var33_5 || var33_5) ** GOTO lbl6
            this.cachedTimeMinute = var8_10;
            if (var33_5 || var33_5) ** GOTO lbl6
            this.cachedTime = LocalTime.now().format(eg.TIME_FORMAT);
            if (var33_5) ** GOTO lbl6
        }
        if (var33_5 || var33_5) ** GOTO lbl6
        this.timeRolling.update(this.cachedTime, var6_9);
        if (var33_5 || var33_5) ** GOTO lbl6
        var10_11 = this.timeRolling.value();
        if (var33_5 || var33_5) ** GOTO lbl6
        var11_12 = kq.width(var4_7, var5_8, (float)eg.absu("abtq", abtn(int ), (int)12));
        if (var33_5 || var33_5) ** GOTO lbl6
        var12_13 = kq.width(var4_7, var10_11, (float)eg.absu("abtr", abtn(int ), (int)13));
        if (var33_5 || var33_5) ** GOTO lbl6
        var13_14 = eg.absu("abts", abtn(int ), (int)14) + var11_12 + eg.absu("abtt", abtn(int ), (int)15);
        if (var33_5 || var33_5) ** GOTO lbl6
        var14_15 = eg.absu("abtu", abtn(int ), (int)16) + var12_13 + eg.absu("abtv", abtn(int ), (int)17);
        if (var33_5 || var33_5) ** GOTO lbl6
        var15_16 = eg.absu("abtw", abtn(int ), (int)18) + var13_14 + eg.absu("abtx", abtn(int ), (int)19);
        if (var33_5 || var33_5) ** GOTO lbl6
        var16_17 = var15_16 + var14_15 + eg.absu("abty", abtn(int ), (int)20);
        if (var33_5 || var33_5) ** GOTO lbl6
        var17_18 = this.serverAddress();
        if (var33_5 || var33_5) ** GOTO lbl6
        this.pingRolling.update(String.valueOf(this.ping()), var6_9);
        if (var33_5 || var33_5) ** GOTO lbl6
        this.fpsRolling.update(String.valueOf(this.mc.method_47599()), var6_9);
        if (var33_5 || var33_5) ** GOTO lbl6
        var18_19 = new eg$TextParts(this.pingRolling.value(), "ms");
        if (var33_5 || var33_5) ** GOTO lbl6
        var19_20 = new eg$TextParts(this.fpsRolling.value(), "fps");
        if (var33_5 || var33_5) ** GOTO lbl6
        var20_21 = eg.lowerContentWidth(var4_7, var17_18);
        if (var33_5 || var33_5) ** GOTO lbl6
        var21_22 = eg.lowerContentWidth(var4_7, var18_19);
        if (var33_5 || var33_5) ** GOTO lbl6
        var22_23 = eg.lowerContentWidth(var4_7, var19_20);
        if (var33_5 || var33_5) ** GOTO lbl6
        var23_24 = eg.absu("abtz", abtn(int ), (int)21) + var20_21 + eg.absu("abua", abtn(int ), (int)22) + var21_22 + eg.absu("abub", abtn(int ), (int)23) + var22_23 + eg.absu("abuc", abtn(int ), (int)24);
        if (var33_5 || var33_5) ** GOTO lbl6
        var24_25 = Math.max((float)var16_17, (float)var23_24);
        if (var33_5 || var33_5) ** GOTO lbl6
        var25_26 = Math.max((float)eg.absu("abud", abtn(int ), (int)25), ki.getContextScale());
        if (var33_5 || var33_5) ** GOTO lbl6
        var26_27 = (float)ki.getFixedScaledWidth() / var25_26;
        if (var33_5 || var33_5) ** GOTO lbl6
        var27_28 = this.visibleBossBarCount();
        if (var33_5 || var33_5) ** GOTO lbl6
        this.setX(Math.round(Math.max(0.0f, (var26_27 - var24_25) * eg.absu("abue", abtn(int ), (int)26))));
        if (var33_5) ** GOTO lbl6
        if (var34_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var34_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var33_5) ** GOTO lbl6
                this.setY(Math.round((float)((eg.absu("abuf", abtn(int ), (int)27) + (float)var27_28 * eg.absu("abug", abtn(int ), (int)28)) / var25_26)));
                if (var33_5 || var33_5) ** GOTO lbl6
                var28_29 = this.getX();
                if (var33_5 || var33_5) ** GOTO lbl6
                var29_30 = this.getY();
                if (var33_5 || var33_5) ** GOTO lbl6
                var30_31 = var28_29 + (var24_25 - var16_17) * eg.absu("abuh", abtn(int ), (int)29);
                if (var33_5 || var33_5) ** GOTO lbl6
                var31_32 = var28_29 + (var24_25 - var23_24) * eg.absu("abui", abtn(int ), (int)30);
                if (var33_5 || var33_5) ** GOTO lbl6
                var32_33 = var29_30 + eg.absu("abuj", abtn(int ), (int)31) + eg.absu("abuk", abtn(int ), (int)32);
                if (var33_5 || var33_5) ** GOTO lbl6
                this.setWidth((int)Math.ceil(var24_25));
                if (var33_5 || var33_5) ** GOTO lbl6
                this.setHeight((int)Math.ceil((double)eg.absu("abul", absx(int ), (int)4)));
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawPanelBase(var1_1, var30_31, var29_30, (float)var16_17, (float)eg.absu("abum", abtn(int ), (int)33), (float)eg.absu("abun", abtn(int ), (int)34), var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawLogoBackground(var1_1, var30_31, var29_30, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawLoginBackground(var1_1, var30_31, var29_30, (float)var13_14, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawTimeBackground(var1_1, var30_31, var29_30, (float)var15_16, (float)var14_15, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawLogo(var1_1, var30_31, var29_30, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawProfile(var1_1, var30_31, var29_30, var4_7, var5_8, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawTime(var1_1, var30_31, var29_30, (float)var15_16, var4_7, this.timeRolling, var6_9, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var30_31, var29_30, (float)var16_17, (float)eg.absu("abuo", abtn(int ), (int)35), (float)eg.absu("abup", abtn(int ), (int)36), (float)eg.absu("abuq", abtn(int ), (int)37), eg.BORDER_COLOR, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawPanelBase(var1_1, var31_32, var32_33, (float)var23_24, (float)eg.absu("abur", abtn(int ), (int)38), (float)eg.absu("abus", abtn(int ), (int)39), var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                eg.drawLowerContent(var1_1, var31_32, var32_33, var20_21, var21_22, var22_23, var4_7, var17_18, var18_19, var19_20, this.pingRolling, this.fpsRolling, var6_9, var3_6);
                if (var33_5 || var33_5) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var31_32, var32_33, (float)var23_24, (float)eg.absu("abut", abtn(int ), (int)40), (float)eg.absu("abuu", abtn(int ), (int)41), (float)eg.absu("abuv", abtn(int ), (int)42), eg.BORDER_COLOR, var3_6);
                if (!var33_5 && !var33_5) ** break;
                ** continue;
                return;
            }
lbl127:
            // 3 sources

            case 0: {
                var34_4 /* !! */  = (int)eg.absu("abuw", absr(int ), (int)43);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl565
            }
lbl132:
            // 3 sources

            case 1: {
                var34_4 /* !! */  = (int)eg.absu("abux", absr(int ), (int)44);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl137:
            // 2 sources

            case 2: {
                var34_4 /* !! */  = (int)eg.absu("abuy", absr(int ), (int)45);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl142:
            // 3 sources

            case 3: {
                var34_4 /* !! */  = (int)eg.absu("abuz", absr(int ), (int)46);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl147:
            // 3 sources

            case 4: {
                var34_4 /* !! */  = (int)eg.absu("abva", absr(int ), (int)47);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl565
            }
            case 5: {
                var34_4 /* !! */  = (int)eg.absu("abvb", absr(int ), (int)48);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl466
            }
lbl157:
            // 3 sources

            case 6: {
                var34_4 /* !! */  = (int)eg.absu("abvc", absr(int ), (int)49);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl162:
            // 2 sources

            case 7: {
                var34_4 /* !! */  = (int)eg.absu("abvd", absr(int ), (int)50);
                if (var35_3) {
                    throw null;
                }
            }
lbl166:
            // 5 sources

            case 8: {
                var34_4 /* !! */  = (int)eg.absu("abve", absr(int ), (int)51);
                if (!var35_3) ** GOTO lbl132
                throw null;
            }
            case 9: {
                var34_4 /* !! */  = (int)eg.absu("abvf", absr(int ), (int)52);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl175:
            // 2 sources

            case 10: {
                var34_4 /* !! */  = (int)eg.absu("abvg", absr(int ), (int)53);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl561
            }
            case 11: {
                var34_4 /* !! */  = (int)eg.absu("abvh", absr(int ), (int)54);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var34_4 /* !! */  = (int)eg.absu("abvi", absr(int ), (int)55);
                    if (var35_3) {
                        throw null;
                    }
                    ** GOTO lbl226
                    break;
                }
            }
lbl191:
            // 2 sources

            case 13: {
                var34_4 /* !! */  = (int)eg.absu("abvj", absr(int ), (int)56);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl585
            }
lbl196:
            // 2 sources

            case 14: {
                var34_4 /* !! */  = (int)eg.absu("abvk", absr(int ), (int)57);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl525
            }
lbl201:
            // 2 sources

            case 15: {
                var34_4 /* !! */  = (int)eg.absu("abvl", absr(int ), (int)58);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl397
            }
lbl206:
            // 3 sources

            case 16: {
                var34_4 /* !! */  = (int)eg.absu("abvm", absr(int ), (int)59);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 17: {
                var34_4 /* !! */  = (int)eg.absu("abvn", absr(int ), (int)60);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl216:
            // 3 sources

            case 18: {
                var34_4 /* !! */  = (int)eg.absu("abvo", absr(int ), (int)61);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl221:
            // 2 sources

            case 19: {
                var34_4 /* !! */  = (int)eg.absu("abvp", absr(int ), (int)62);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl226:
            // 3 sources

            case 20: {
                var34_4 /* !! */  = (int)eg.absu("abvq", absr(int ), (int)63);
                if (!var35_3) ** GOTO lbl206
                throw null;
            }
lbl230:
            // 2 sources

            case 21: {
                var34_4 /* !! */  = (int)eg.absu("aclc", absr(int ), (int)64);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl431
            }
            case 22: {
                var34_4 /* !! */  = (int)eg.absu("acld", absr(int ), (int)65);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl557
            }
            case 23: {
                var34_4 /* !! */  = (int)eg.absu("acle", absr(int ), (int)66);
                if (!var35_3) ** GOTO lbl226
                throw null;
            }
lbl244:
            // 2 sources

            case 24: {
                var34_4 /* !! */  = (int)eg.absu("aclf", absr(int ), (int)67);
                if (!var35_3) ** GOTO lbl221
                throw null;
            }
            case 25: {
                var34_4 /* !! */  = (int)eg.absu("aclg", absr(int ), (int)68);
                if (!var35_3) ** GOTO lbl175
                throw null;
            }
lbl252:
            // 2 sources

            case 26: {
                var34_4 /* !! */  = (int)eg.absu("aclh", absr(int ), (int)69);
                if (!var35_3) ** GOTO lbl191
                throw null;
            }
lbl256:
            // 2 sources

            case 27: {
                var34_4 /* !! */  = (int)eg.absu("acli", absr(int ), (int)70);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 28: {
                var34_4 /* !! */  = (int)eg.absu("aclj", absr(int ), (int)71);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl266:
            // 2 sources

            case 29: {
                var34_4 /* !! */  = (int)eg.absu("aclk", absr(int ), (int)72);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl271:
            // 2 sources

            case 30: {
                var34_4 /* !! */  = (int)eg.absu("acll", absr(int ), (int)73);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl276:
            // 2 sources

            case 31: {
                var34_4 /* !! */  = (int)eg.absu("aclm", absr(int ), (int)74);
                if (!var35_3) ** GOTO lbl216
                throw null;
            }
lbl280:
            // 3 sources

            case 32: {
                var34_4 /* !! */  = (int)eg.absu("acln", absr(int ), (int)75);
                if (!var35_3) ** GOTO lbl196
                throw null;
            }
lbl284:
            // 2 sources

            case 33: {
                var34_4 /* !! */  = (int)eg.absu("aclo", absr(int ), (int)76);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl289:
            // 3 sources

            case 34: {
                var34_4 /* !! */  = (int)eg.absu("aclp", absr(int ), (int)77);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl512
            }
lbl294:
            // 2 sources

            case 35: {
                var34_4 /* !! */  = (int)eg.absu("aclq", absr(int ), (int)78);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl299:
            // 2 sources

            case 36: {
                var34_4 /* !! */  = (int)eg.absu("aclr", absr(int ), (int)79);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl474
            }
            case 37: {
                var34_4 /* !! */  = (int)eg.absu("acls", absr(int ), (int)80);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl309:
            // 2 sources

            case 38: {
                var34_4 /* !! */  = (int)eg.absu("aclt", absr(int ), (int)81);
                if (!var35_3) ** GOTO lbl157
                throw null;
            }
lbl313:
            // 3 sources

            case 39: {
                var34_4 /* !! */  = (int)eg.absu("aclu", absr(int ), (int)82);
                if (!var35_3) ** GOTO lbl280
                throw null;
            }
lbl317:
            // 2 sources

            case 40: {
                var34_4 /* !! */  = (int)eg.absu("aclv", absr(int ), (int)83);
                if (!var35_3) ** GOTO lbl216
                throw null;
            }
lbl321:
            // 4 sources

            case 41: {
                var34_4 /* !! */  = (int)eg.absu("aclw", absr(int ), (int)84);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 42: {
                var34_4 /* !! */  = (int)eg.absu("aclx", absr(int ), (int)85);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl581
            }
lbl331:
            // 2 sources

            case 43: {
                var34_4 /* !! */  = (int)eg.absu("acly", absr(int ), (int)86);
                if (!var35_3) ** GOTO lbl266
                throw null;
            }
lbl335:
            // 2 sources

            case 44: {
                var34_4 /* !! */  = (int)eg.absu("aclz", absr(int ), (int)87);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl340:
            // 4 sources

            case 45: {
                var34_4 /* !! */  = (int)eg.absu("acma", absr(int ), (int)88);
                if (!var35_3) ** GOTO lbl147
                throw null;
            }
            case 46: {
                var34_4 /* !! */  = (int)eg.absu("acmb", absr(int ), (int)89);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl557
            }
lbl349:
            // 2 sources

            case 47: {
                var34_4 /* !! */  = (int)eg.absu("acmc", absr(int ), (int)90);
                if (!var35_3) ** GOTO lbl317
                throw null;
            }
            case 48: {
                var34_4 /* !! */  = (int)eg.absu("acmd", absr(int ), (int)91);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl581
            }
            case 49: {
                var34_4 /* !! */  = (int)eg.absu("acme", absr(int ), (int)92);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl595
            }
            case 50: {
                var34_4 /* !! */  = (int)eg.absu("acmf", absr(int ), (int)93);
                if (!var35_3) ** GOTO lbl340
                throw null;
            }
            case 51: {
                var34_4 /* !! */  = (int)eg.absu("acmg", absr(int ), (int)94);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl402
            }
            case 52: {
                var34_4 /* !! */  = (int)eg.absu("acmh", absr(int ), (int)95);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl479
            }
            case 53: {
                var34_4 /* !! */  = (int)eg.absu("acmi", absr(int ), (int)96);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 54: {
                var34_4 /* !! */  = (int)eg.absu("acmj", absr(int ), (int)97);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl392
            }
            case 55: {
                var34_4 /* !! */  = (int)eg.absu("acmk", absr(int ), (int)98);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl512
            }
lbl392:
            // 4 sources

            case 56: {
                var34_4 /* !! */  = (int)eg.absu("acml", absr(int ), (int)99);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl577
            }
lbl397:
            // 2 sources

            case 57: {
                var34_4 /* !! */  = (int)eg.absu("acmm", absr(int ), (int)100);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl427
            }
lbl402:
            // 2 sources

            case 58: {
                var34_4 /* !! */  = (int)eg.absu("acmn", absr(int ), (int)101);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl545
            }
lbl407:
            // 3 sources

            case 59: {
                var34_4 /* !! */  = (int)eg.absu("acmo", absr(int ), (int)102);
                if (!var35_3) ** GOTO lbl340
                throw null;
            }
            case 60: {
                var34_4 /* !! */  = (int)eg.absu("acmp", absr(int ), (int)103);
                if (!var35_3) ** GOTO lbl147
                throw null;
            }
lbl415:
            // 2 sources

            case 61: {
                var34_4 /* !! */  = (int)eg.absu("acmq", absr(int ), (int)104);
                if (!var35_3) ** GOTO lbl289
                throw null;
            }
lbl419:
            // 2 sources

            case 62: {
                var34_4 /* !! */  = (int)eg.absu("acmr", absr(int ), (int)105);
                if (!var35_3) ** GOTO lbl321
                throw null;
            }
lbl423:
            // 2 sources

            case 63: {
                var34_4 /* !! */  = (int)eg.absu("acms", absr(int ), (int)106);
                if (!var35_3) ** GOTO lbl166
                throw null;
            }
lbl427:
            // 2 sources

            case 64: {
                var34_4 /* !! */  = (int)eg.absu("acmt", absr(int ), (int)107);
                if (!var35_3) ** GOTO lbl321
                throw null;
            }
lbl431:
            // 2 sources

            case 65: {
                var34_4 /* !! */  = (int)eg.absu("acmu", absr(int ), (int)108);
                if (!var35_3) ** GOTO lbl137
                throw null;
            }
            case 66: {
                var34_4 /* !! */  = (int)eg.absu("acmv", absr(int ), (int)109);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl561
            }
lbl440:
            // 2 sources

            case 67: {
                var34_4 /* !! */  = (int)eg.absu("acmw", absr(int ), (int)110);
                if (!var35_3) break;
                throw null;
            }
lbl444:
            // 2 sources

            case 68: {
                var34_4 /* !! */  = (int)eg.absu("acmx", absr(int ), (int)111);
                if (!var35_3) ** GOTO lbl299
                throw null;
            }
            case 69: {
                var34_4 /* !! */  = (int)eg.absu("acmy", absr(int ), (int)112);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl590
            }
            case 70: {
                var34_4 /* !! */  = (int)eg.absu("acmz", absr(int ), (int)113);
                if (!var35_3) break;
                throw null;
            }
            case 71: {
                var34_4 /* !! */  = (int)eg.absu("acna", absr(int ), (int)114);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl525
            }
lbl462:
            // 2 sources

            case 72: {
                var34_4 /* !! */  = (int)eg.absu("acnb", absr(int ), (int)115);
                if (!var35_3) ** GOTO lbl132
                throw null;
            }
lbl466:
            // 3 sources

            case 73: {
                var34_4 /* !! */  = (int)eg.absu("acnc", absr(int ), (int)116);
                if (!var35_3) ** GOTO lbl392
                throw null;
            }
lbl470:
            // 2 sources

            case 74: {
                var34_4 /* !! */  = (int)eg.absu("acnd", absr(int ), (int)117);
                if (!var35_3) ** GOTO lbl127
                throw null;
            }
lbl474:
            // 3 sources

            case 75: {
                var34_4 /* !! */  = (int)eg.absu("acne", absr(int ), (int)118);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl573
            }
lbl479:
            // 2 sources

            case 76: {
                var34_4 /* !! */  = (int)eg.absu("acnf", absr(int ), (int)119);
                if (!var35_3) ** GOTO lbl466
                throw null;
            }
lbl483:
            // 2 sources

            case 77: {
                var34_4 /* !! */  = (int)eg.absu("acng", absr(int ), (int)120);
                if (!var35_3) break;
                throw null;
            }
lbl487:
            // 2 sources

            case 78: {
                var34_4 /* !! */  = (int)eg.absu("acnh", absr(int ), (int)121);
                if (!var35_3) ** GOTO lbl294
                throw null;
            }
lbl491:
            // 2 sources

            case 79: {
                var34_4 /* !! */  = (int)eg.absu("acni", absr(int ), (int)122);
                if (!var35_3) ** GOTO lbl206
                throw null;
            }
            case 80: {
                var34_4 /* !! */  = (int)eg.absu("acnj", absr(int ), (int)123);
                if (!var35_3) ** GOTO lbl162
                throw null;
            }
lbl499:
            // 2 sources

            case 81: {
                var34_4 /* !! */  = (int)eg.absu("acnk", absr(int ), (int)124);
                if (!var35_3) ** GOTO lbl142
                throw null;
            }
lbl503:
            // 2 sources

            case 82: {
                var34_4 /* !! */  = (int)eg.absu("acnl", absr(int ), (int)125);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl565
            }
            case 83: {
                var34_4 /* !! */  = (int)eg.absu("acnm", absr(int ), (int)126);
                if (!var35_3) ** GOTO lbl444
                throw null;
            }
lbl512:
            // 4 sources

            case 84: {
                var34_4 /* !! */  = (int)eg.absu("acnn", absr(int ), (int)127);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl599
            }
lbl517:
            // 2 sources

            case 85: {
                var34_4 /* !! */  = (int)eg.absu("acno", absr(int ), (int)128);
                if (!var35_3) ** GOTO lbl440
                throw null;
            }
            case 86: {
                var34_4 /* !! */  = (int)eg.absu("acnp", absr(int ), (int)129);
                if (!var35_3) ** GOTO lbl407
                throw null;
            }
lbl525:
            // 3 sources

            case 87: {
                var34_4 /* !! */  = (int)eg.absu("acnq", absr(int ), (int)130);
                if (!var35_3) ** GOTO lbl331
                throw null;
            }
            case 88: {
                var34_4 /* !! */  = (int)eg.absu("acnr", absr(int ), (int)131);
                if (!var35_3) ** GOTO lbl142
                throw null;
            }
            case 89: {
                var34_4 /* !! */  = (int)eg.absu("acns", absr(int ), (int)132);
                if (!var35_3) ** GOTO lbl244
                throw null;
            }
lbl537:
            // 3 sources

            case 90: {
                var34_4 /* !! */  = (int)eg.absu("acnt", absr(int ), (int)133);
                if (!var35_3) ** GOTO lbl487
                throw null;
            }
            case 91: {
                var34_4 /* !! */  = (int)eg.absu("acnu", absr(int ), (int)134);
                if (!var35_3) ** GOTO lbl483
                throw null;
            }
lbl545:
            // 2 sources

            case 92: {
                var34_4 /* !! */  = (int)eg.absu("acnv", absr(int ), (int)135);
                if (!var35_3) ** GOTO lbl474
                throw null;
            }
            case 93: {
                var34_4 /* !! */  = (int)eg.absu("acnw", absr(int ), (int)136);
                if (!var35_3) ** GOTO lbl127
                throw null;
            }
            case 94: {
                var34_4 /* !! */  = (int)eg.absu("acnx", absr(int ), (int)137);
                if (!var35_3) ** GOTO lbl491
                throw null;
            }
lbl557:
            // 3 sources

            case 95: {
                var34_4 /* !! */  = (int)eg.absu("acny", absr(int ), (int)138);
                if (!var35_3) ** GOTO lbl157
                throw null;
            }
lbl561:
            // 3 sources

            case 96: {
                var34_4 /* !! */  = (int)eg.absu("acnz", absr(int ), (int)139);
                if (!var35_3) ** GOTO lbl462
                throw null;
            }
lbl565:
            // 4 sources

            case 97: {
                var34_4 /* !! */  = (int)eg.absu("acoa", absr(int ), (int)140);
                if (!var35_3) ** GOTO lbl537
                throw null;
            }
            case 98: {
                var34_4 /* !! */  = (int)eg.absu("acob", absr(int ), (int)141);
                if (!var35_3) break;
                throw null;
            }
lbl573:
            // 2 sources

            case 99: {
                var34_4 /* !! */  = (int)eg.absu("acoc", absr(int ), (int)142);
                if (!var35_3) ** GOTO lbl166
                throw null;
            }
lbl577:
            // 2 sources

            case 100: {
                var34_4 /* !! */  = (int)eg.absu("acod", absr(int ), (int)143);
                if (!var35_3) ** GOTO lbl470
                throw null;
            }
lbl581:
            // 3 sources

            case 101: {
                var34_4 /* !! */  = (int)eg.absu("acoe", absr(int ), (int)144);
                if (!var35_3) ** GOTO lbl252
                throw null;
            }
lbl585:
            // 2 sources

            case 102: {
                var34_4 /* !! */  = (int)eg.absu("acof", absr(int ), (int)145);
                if (var35_3) {
                    throw null;
                }
                ** GOTO lbl607
            }
lbl590:
            // 2 sources

            case 103: {
                do {
                    var34_4 /* !! */  = (int)eg.absu("acog", absr(int ), (int)146);
                } while (!var35_3);
                throw null;
            }
lbl595:
            // 2 sources

            case 104: {
                var34_4 /* !! */  = (int)eg.absu("acoh", absr(int ), (int)147);
                if (!var35_3) ** GOTO lbl284
                throw null;
            }
lbl599:
            // 2 sources

            case 105: {
                var34_4 /* !! */  = (int)eg.absu("acoi", absr(int ), (int)148);
                if (!var35_3) ** GOTO lbl503
                throw null;
            }
            case 106: {
                var34_4 /* !! */  = (int)eg.absu("acoj", absr(int ), (int)149);
                if (!var35_3) ** GOTO lbl280
                throw null;
            }
lbl607:
            // 2 sources

            case 107: {
                var34_4 /* !! */  = (int)eg.absu("acok", absr(int ), (int)150);
                if (!var35_3) ** GOTO lbl271
                throw null;
            }
            case 108: {
                var34_4 /* !! */  = (int)eg.absu("acol", absr(int ), (int)151);
                if (!var35_3) ** GOTO lbl256
                throw null;
            }
            case 109: 
        }
        var34_4 /* !! */  = (int)eg.absu("acom", absr(int ), (int)152);
        ** while (!var35_3)
lbl618:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void drawLowerEntry(class_332 class_3322, float f2, float f3, ks ks2, String string, float f4, eg$TextParts eg$TextParts, eg$RollingText eg$RollingText, long l2, float f5) {
        block13: {
            block7: {
                boolean bl2;
                block12: {
                    float f6;
                    float f7;
                    block11: {
                        int n2;
                        block10: {
                            ks ks3;
                            boolean bl3;
                            block9: {
                                ks ks4;
                                block8: {
                                    bl3 = c;
                                    int n3 = b;
                                    bl2 = a;
                                    if (bl3) {
                                        throw null;
                                    }
                                    if (bl2 || bl2) break block7;
                                    if (kv.PHOBIA_NEW == null) break block8;
                                    if (bl2 || bl2) break block7;
                                    ks4 = kv.PHOBIA_NEW;
                                    if (bl3) {
                                        throw null;
                                    }
                                    break block9;
                                }
                                if (bl2 || bl2) break block7;
                                ks4 = ks3 = kv.getDefault();
                            }
                            if (bl2 || bl2) break block7;
                            eg.drawIcon(class_3322, ks3, string, f2 + eg.absu("acvx", abtn(int ), (int)283), f3 + eg.absu("acvy", abtn(int ), (int)284), f4, nd.multAlpha(dz.color((int)eg.absu("acvz", absr(int ), (int)285)), f5));
                            if (bl2 || bl2) break block7;
                            f7 = f2 + eg.absu("acwa", abtn(int ), (int)286);
                            if (bl2 || bl2) break block7;
                            f6 = f3 + eg.absu("acwb", abtn(int ), (int)287);
                            if (bl2 || bl2) break block7;
                            n2 = nd.multAlpha(LOWER_TEXT_COLOR, f5);
                            if (bl2 || bl2) break block7;
                            if (eg$RollingText != null) break block10;
                            if (bl2 || bl2) break block7;
                            kq.text(class_3322, ks2, eg$TextParts.primary(), f7, f6, (float)eg.absu("acwc", abtn(int ), (int)288), n2, (boolean)eg.absu("acwd", absr(int ), (int)289));
                            if (bl2) break block7;
                            if (bl3) {
                                throw null;
                            }
                            break block11;
                        }
                        if (bl2 || bl2) break block7;
                        eg.drawRollingText(class_3322, ks2, eg$RollingText, f7, f6, (float)eg.absu("acwe", abtn(int ), (int)290), n2, f3, (float)eg.absu("acwf", abtn(int ), (int)291), l2);
                        if (bl2) break block7;
                    }
                    if (bl2 || bl2) break block7;
                    f7 += kq.width(ks2, eg$TextParts.primary(), (float)eg.absu("acwg", abtn(int ), (int)292));
                    if (bl2 || bl2) break block7;
                    if (eg$TextParts.suffix().isEmpty()) break block12;
                    if (bl2 || bl2) break block7;
                    kq.text(class_3322, ks2, eg$TextParts.suffix(), f7, f6, (float)eg.absu("acwh", abtn(int ), (int)293), nd.multAlpha(LOWER_SUFFIX_COLOR, f5), (boolean)eg.absu("acwi", absr(int ), (int)294));
                    if (bl2) break block7;
                }
                if (!bl2 && !bl2) break block13;
            }
            return;
        }
    }
}

