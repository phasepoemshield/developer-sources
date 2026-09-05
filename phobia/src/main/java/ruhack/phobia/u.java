/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 *  net.minecraft.class_640
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import ruhack.phobia.f;
import ruhack.phobia.g;
import ruhack.phobia.i;
import ruhack.phobia.o;
import ruhack.phobia.y;
import ruhack.phobia.z;

public class u
extends f {
    private static int[] mgr = new int[314];
    public static final int b;
    private static long[] nmi;
    public static final boolean a;
    private static int[] mgs;
    private static long[] nmj;
    private static final long av = -1552453987936399046L;
    private static final DateTimeFormatter DATE_FORMAT;
    public static final boolean c;

    private static /* synthetic */ void ofx() {
        u.mgs[300] = -1245773095;
        u.mgs[301] = -750950140;
        u.mgs[302] = 1093840412;
        u.mgs[303] = -1920819540;
        u.mgs[304] = 704602065;
        u.mgs[305] = 984292394;
        u.mgs[306] = 1016742999;
        u.mgs[307] = -1479459484;
        u.mgs[308] = 1569602647;
        u.mgs[309] = -1137427516;
        u.mgs[310] = -1114834641;
        u.mgs[311] = 250278548;
        u.mgs[312] = -1304666663;
        u.mgs[313] = 1339289220;
    }

    private static /* synthetic */ void ofl() {
        u.mgs[100] = -886692837;
        u.mgs[101] = 321661872;
        u.mgs[102] = 358141620;
        u.mgs[103] = 1206236788;
        u.mgs[104] = -823069602;
        u.mgs[105] = 1553225713;
        u.mgs[106] = -440385394;
        u.mgs[107] = -1690219733;
        u.mgs[108] = 146305845;
        u.mgs[109] = 31267128;
        u.mgs[110] = -1357240342;
        u.mgs[111] = 1834974941;
        u.mgs[112] = 1774719342;
        u.mgs[113] = -2029989355;
        u.mgs[114] = 1064921000;
        u.mgs[115] = 1187499648;
        u.mgs[116] = -623831405;
        u.mgs[117] = 1050336009;
        u.mgs[118] = -365877575;
        u.mgs[119] = -36038579;
        u.mgs[120] = -899584984;
        u.mgs[121] = 130754174;
        u.mgs[122] = -1543579899;
        u.mgs[123] = -1995152678;
        u.mgs[124] = 1139104048;
        u.mgs[125] = -31739913;
        u.mgs[126] = -1517074801;
        u.mgs[127] = 1577419111;
        u.mgs[128] = -1307905546;
        u.mgs[129] = -1796134265;
        u.mgs[130] = -1036443947;
        u.mgs[131] = 349514103;
        u.mgs[132] = -7978999;
        u.mgs[133] = 582197895;
        u.mgs[134] = 1398371964;
        u.mgs[135] = 1170165154;
        u.mgs[136] = 1268868743;
        u.mgs[137] = -1452079486;
        u.mgs[138] = 1384470828;
        u.mgs[139] = 761909673;
        u.mgs[140] = 1022641822;
        u.mgs[141] = 781634420;
        u.mgs[142] = -189437511;
        u.mgs[143] = -1546064949;
        u.mgs[144] = 1213425744;
        u.mgs[145] = 543629364;
        u.mgs[146] = 819921538;
        u.mgs[147] = -113785002;
        u.mgs[148] = 750660469;
        u.mgs[149] = -1036950483;
        u.mgs[150] = 336623646;
        u.mgs[151] = -789562240;
        u.mgs[152] = -619674362;
        u.mgs[153] = -172960428;
        u.mgs[154] = -2076417484;
        u.mgs[155] = -1612336778;
        u.mgs[156] = -239285097;
        u.mgs[157] = -981489323;
        u.mgs[158] = 586550953;
        u.mgs[159] = -481003339;
        u.mgs[160] = -1776919003;
        u.mgs[161] = 266601999;
        u.mgs[162] = -790658303;
        u.mgs[163] = -333954919;
        u.mgs[164] = 2113803282;
        u.mgs[165] = -1903194814;
        u.mgs[166] = -206852098;
        u.mgs[167] = 2066835507;
        u.mgs[168] = 1783487852;
        u.mgs[169] = 505376647;
        u.mgs[170] = 161332109;
        u.mgs[171] = -1047900833;
        u.mgs[172] = -1536101259;
        u.mgs[173] = -1298777472;
        u.mgs[174] = 1620608226;
        u.mgs[175] = 1266346004;
        u.mgs[176] = -1939179169;
        u.mgs[177] = 1676138063;
        u.mgs[178] = 1918879457;
        u.mgs[179] = 966412029;
        u.mgs[180] = 811890007;
        u.mgs[181] = -1304205749;
        u.mgs[182] = 606851024;
        u.mgs[183] = 1564242712;
        u.mgs[184] = 485469222;
        u.mgs[185] = 2095678056;
        u.mgs[186] = 315603701;
        u.mgs[187] = -405441152;
        u.mgs[188] = 1484364541;
        u.mgs[189] = -1679203572;
        u.mgs[190] = 1194069;
        u.mgs[191] = -932031322;
        u.mgs[192] = 2036494497;
        u.mgs[193] = 1888066406;
        u.mgs[194] = 1564838918;
        u.mgs[195] = -2096667925;
        u.mgs[196] = -582341553;
        u.mgs[197] = 3717403;
        u.mgs[198] = 1222300598;
        u.mgs[199] = 1026568207;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_5250 lambda$execute$1(g var0, y var1_1) {
        v0 /* !! */  = u.av;
        if (true) ** GOTO lbl5
        block163: while (true) {
            v0 /* !! */  = (long)(v1 - u.mgt("nsh", nmg(int ), (int)47));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1091989190: {
                    break block163;
                }
                case -895997890: {
                    v1 = u.mgt("nsi", nmg(int ), (int)48);
                    continue block163;
                }
                case 980270914: {
                    v1 = u.mgt("nsk", nmg(int ), (int)49);
                    continue block163;
                }
            }
            break;
        }
        var8_2 = u.c;
        v2 /* !! */  = u.av;
        if (true) ** GOTO lbl19
        block164: while (true) {
            v2 /* !! */  = (long)(u.mgt("nsn", nmg(int ), (int)51) - u.mgt("nsl", nmg(int ), (int)50));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1091989190: {
                    break block164;
                }
                case 896268579: {
                    continue block164;
                }
            }
            break;
        }
        var7_3 /* !! */  = u.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = u.av - u.mgt("nso", nmg(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == u.mgt("nsq", mgq(int ), (int)238)) break;
            v3 /* !! */  = (long)u.mgt("nsr", mgq(int ), (int)239);
        }
        var6_4 = u.a;
        if (var8_2) {
            throw null;
lbl33:
            // 6 sources

            return null;
        }
        if (var6_4 || var6_4) ** GOTO lbl33
        v4 /* !! */  = u.av;
        if (true) ** GOTO lbl40
        block167: while (true) {
            v4 /* !! */  = (long)(v5 - u.mgt("nst", nmg(int ), (int)53));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1325042635: {
                    v5 = u.mgt("nsu", nmg(int ), (int)54);
                    continue block167;
                }
                case -1091989190: {
                    break block167;
                }
                case -1055192845: {
                    v5 = u.mgt("nsw", nmg(int ), (int)55);
                    continue block167;
                }
                case 1932746880: {
                    v5 = u.mgt("nsx", nmg(int ), (int)56);
                    continue block167;
                }
            }
            break;
        }
        var2_5 = var1_1.name();
        if (var6_4 || var6_4) ** GOTO lbl33
        v6 /* !! */  = u.av;
        if (true) ** GOTO lbl58
        block168: while (true) {
            v6 /* !! */  = (long)(v7 - u.mgt("nsz", nmg(int ), (int)57));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2000566755: {
                    v7 = u.mgt("nta", nmg(int ), (int)58);
                    continue block168;
                }
                case -1091989190: {
                    break block168;
                }
                case 1517447361: {
                    v7 = u.mgt("ntc", nmg(int ), (int)59);
                    continue block168;
                }
                case 1792065643: {
                    v7 = u.mgt("ntd", nmg(int ), (int)60);
                    continue block168;
                }
            }
            break;
        }
        v8 /* !! */  = u.av;
        if (true) ** GOTO lbl74
        block169: while (true) {
            v8 /* !! */  = (long)(v9 - u.mgt("ntf", nmg(int ), (int)61));
lbl74:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1782774690: {
                    v9 = u.mgt("ntg", nmg(int ), (int)62);
                    continue block169;
                }
                case -1091989190: {
                    break block169;
                }
                case -865270443: {
                    v9 = u.mgt("nti", nmg(int ), (int)63);
                    continue block169;
                }
                case 543441866: {
                    v9 = u.mgt("ntj", nmg(int ), (int)64);
                    continue block169;
                }
            }
            break;
        }
        v10 = var1_1.addedAt();
        v11 /* !! */  = u.av;
        if (true) ** GOTO lbl91
        block170: while (true) {
            v11 /* !! */  = (long)(v12 - u.mgt("ntl", nmg(int ), (int)65));
lbl91:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1091989190: {
                    break block170;
                }
                case -623603030: {
                    v12 = u.mgt("ntm", nmg(int ), (int)66);
                    continue block170;
                }
                case -560422181: {
                    v12 = u.mgt("nto", nmg(int ), (int)67);
                    continue block170;
                }
                case 1175051634: {
                    v12 = u.mgt("ntp", nmg(int ), (int)68);
                    continue block170;
                }
            }
            break;
        }
        v13 = Instant.ofEpochMilli(v10);
        v14 /* !! */  = u.av;
        if (true) ** GOTO lbl108
        block171: while (true) {
            v14 /* !! */  = (long)(v15 - u.mgt("ntq", nmg(int ), (int)69));
lbl108:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1519337551: {
                    v15 = u.mgt("ntr", nmg(int ), (int)70);
                    continue block171;
                }
                case -1176976138: {
                    v15 = u.mgt("nts", nmg(int ), (int)71);
                    continue block171;
                }
                case -1091989190: {
                    break block171;
                }
                case 479199850: {
                    v15 = u.mgt("ntt", nmg(int ), (int)72);
                    continue block171;
                }
            }
            break;
        }
        var3_6 = u.DATE_FORMAT.format(v13);
        if (var6_4 || var6_4) ** GOTO lbl33
        v16 /* !! */  = u.av;
        if (true) ** GOTO lbl126
        block172: while (true) {
            v16 /* !! */  = (long)(v17 - u.mgt("ntv", nmg(int ), (int)73));
lbl126:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1091989190: {
                    break block172;
                }
                case -573743449: {
                    v17 = u.mgt("ntx", nmg(int ), (int)74);
                    continue block172;
                }
                case 539145312: {
                    v17 = u.mgt("nty", nmg(int ), (int)75);
                    continue block172;
                }
                case 1776267586: {
                    v17 = u.mgt("nua", nmg(int ), (int)76);
                    continue block172;
                }
            }
            break;
        }
        v18 = var0.getPrefix();
        v19 /* !! */  = u.av;
        if (true) ** GOTO lbl143
        block173: while (true) {
            v19 /* !! */  = (long)(v20 - u.mgt("nuc", nmg(int ), (int)77));
lbl143:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1634949726: {
                    v20 = u.mgt("nud", nmg(int ), (int)78);
                    continue block173;
                }
                case -1091989190: {
                    break block173;
                }
                case 226245582: {
                    v20 = u.mgt("nuf", nmg(int ), (int)79);
                    continue block173;
                }
            }
            break;
        }
        var4_7 = v18 + "staff remove " + var2_5;
        if (var6_4 || var6_4) ** GOTO lbl33
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_1 = u.av - u.mgt("nuh", nmg(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == u.mgt("nuj", mgq(int ), (int)240)) break;
            v21 /* !! */  = (long)u.mgt("nuk", mgq(int ), (int)241);
        }
        v22 = class_2561.method_43470((String)"[");
        v23 /* !! */  = u.av;
        if (true) ** GOTO lbl164
        block175: while (true) {
            v23 /* !! */  = (long)(v24 - u.mgt("num", nmg(int ), (int)81));
lbl164:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -2009163497: {
                    v24 = u.mgt("nun", nmg(int ), (int)82);
                    continue block175;
                }
                case -1504921125: {
                    v24 = u.mgt("nuo", nmg(int ), (int)83);
                    continue block175;
                }
                case -1091989190: {
                    break block175;
                }
                case 1098193414: {
                    v24 = u.mgt("nup", nmg(int ), (int)84);
                    continue block175;
                }
            }
            break;
        }
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_2 = u.av - u.mgt("nuq", nmg(int ), (int)85)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == u.mgt("nur", mgq(int ), (int)242)) break;
            v25 /* !! */  = (long)u.mgt("nus", mgq(int ), (int)243);
        }
        v26 = v22.method_27692(class_124.field_1080);
        v27 /* !! */  = u.av;
        if (true) ** GOTO lbl186
        block177: while (true) {
            v27 /* !! */  = (long)(v28 - u.mgt("nut", nmg(int ), (int)86));
lbl186:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1116344989: {
                    v28 = u.mgt("nuu", nmg(int ), (int)87);
                    continue block177;
                }
                case -1091989190: {
                    break block177;
                }
                case 798850783: {
                    v28 = u.mgt("nuv", nmg(int ), (int)88);
                    continue block177;
                }
                case 1356129075: {
                    v28 = u.mgt("nuw", nmg(int ), (int)89);
                    continue block177;
                }
            }
            break;
        }
        v29 = class_2561.method_43470((String)"\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0437 \u0441\u0442\u0430\u0444\u0444\u0430");
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_3 = u.av - u.mgt("nux", nmg(int ), (int)90)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == u.mgt("nuy", mgq(int ), (int)244)) break;
            v30 /* !! */  = (long)u.mgt("nuz", mgq(int ), (int)245);
        }
        v31 /* !! */  = u.av;
        if (true) ** GOTO lbl208
        block179: while (true) {
            v31 /* !! */  = (long)(u.mgt("nvb", nmg(int ), (int)92) - u.mgt("nva", nmg(int ), (int)91));
lbl208:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -1091989190: {
                    break block179;
                }
                case 1559851056: {
                    continue block179;
                }
            }
            break;
        }
        v32 = v29.method_27692(class_124.field_1061);
        while (true) {
            if ((v33 /* !! */  = (cfr_temp_4 = u.av - u.mgt("nvc", nmg(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v33 /* !! */  == u.mgt("nvd", mgq(int ), (int)246)) break;
            v33 /* !! */  = (long)u.mgt("nve", mgq(int ), (int)247);
        }
        v34 = v26.method_10852((class_2561)v32);
        v35 /* !! */  = u.av;
        if (true) ** GOTO lbl224
        block181: while (true) {
            v35 /* !! */  = (long)(v36 - u.mgt("nvf", nmg(int ), (int)94));
lbl224:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1091989190: {
                    break block181;
                }
                case -685380831: {
                    v36 = u.mgt("nvh", nmg(int ), (int)95);
                    continue block181;
                }
                case 704169038: {
                    v36 = u.mgt("nvi", nmg(int ), (int)96);
                    continue block181;
                }
                case 1343489398: {
                    v36 = u.mgt("nvk", nmg(int ), (int)97);
                    continue block181;
                }
            }
            break;
        }
        v37 = class_2561.method_43470((String)"]");
        v38 /* !! */  = u.av;
        if (true) ** GOTO lbl241
        block182: while (true) {
            v38 /* !! */  = (long)(u.mgt("nvn", nmg(int ), (int)99) - u.mgt("nvl", nmg(int ), (int)98));
lbl241:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case -1091989190: {
                    break block182;
                }
                case -443135977: {
                    continue block182;
                }
            }
            break;
        }
        v39 /* !! */  = u.av;
        if (true) ** GOTO lbl250
        block183: while (true) {
            v39 /* !! */  = (long)(u.mgt("nvq", nmg(int ), (int)101) - u.mgt("nvo", nmg(int ), (int)100));
lbl250:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case -1091989190: {
                    break block183;
                }
                case 2115462845: {
                    continue block183;
                }
            }
            break;
        }
        v40 = v37.method_27692(class_124.field_1080);
        while (true) {
            if ((v41 /* !! */  = (cfr_temp_5 = u.av - u.mgt("nvr", nmg(int ), (int)102)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v41 /* !! */  == u.mgt("nvt", mgq(int ), (int)248)) break;
            v41 /* !! */  = (long)u.mgt("nvv", mgq(int ), (int)249);
        }
        var5_8 = v34.method_10852((class_2561)v40);
        if (var6_4 || var6_4) ** GOTO lbl33
        v42 /* !! */  = u.av;
        if (true) ** GOTO lbl267
        block185: while (true) {
            v42 /* !! */  = (long)(u.mgt("nvy", nmg(int ), (int)104) - u.mgt("nvx", nmg(int ), (int)103));
lbl267:
            // 2 sources

            switch ((int)v42 /* !! */ ) {
                case -1967977453: {
                    continue block185;
                }
                case -1091989190: {
                    break block185;
                }
            }
            break;
        }
        v43 = var5_8.method_10866();
        v44 /* !! */  = u.av;
        if (true) ** GOTO lbl277
        block186: while (true) {
            v44 /* !! */  = (long)(v45 - u.mgt("nwa", nmg(int ), (int)105));
lbl277:
            // 2 sources

            switch ((int)v44 /* !! */ ) {
                case -1091989190: {
                    break block186;
                }
                case 916632466: {
                    v45 = u.mgt("nwb", nmg(int ), (int)106);
                    continue block186;
                }
                case 1084107875: {
                    v45 = u.mgt("nwd", nmg(int ), (int)107);
                    continue block186;
                }
                case 1920177217: {
                    v45 = u.mgt("nwe", nmg(int ), (int)108);
                    continue block186;
                }
            }
            break;
        }
        while (true) {
            if ((v46 /* !! */  = (cfr_temp_6 = u.av - u.mgt("nwg", nmg(int ), (int)109)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v46 /* !! */  == u.mgt("nwh", mgq(int ), (int)250)) break;
            v46 /* !! */  = (long)u.mgt("nwj", mgq(int ), (int)251);
        }
        v47 = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c " + var2_5 + " \u0438\u0437 \u0441\u0442\u0430\u0444\u0444\u0430";
        while (true) {
            if ((v48 /* !! */  = (cfr_temp_7 = u.av - u.mgt("nwk", nmg(int ), (int)110)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v48 /* !! */  == u.mgt("nwm", mgq(int ), (int)252)) break;
            v48 /* !! */  = (long)u.mgt("nwn", mgq(int ), (int)253);
        }
        v49 = class_2561.method_43470((String)v47);
        v50 /* !! */  = u.av;
        if (true) ** GOTO lbl305
        block189: while (true) {
            v50 /* !! */  = (long)(u.mgt("nwr", nmg(int ), (int)112) - u.mgt("nwp", nmg(int ), (int)111));
lbl305:
            // 2 sources

            switch ((int)v50 /* !! */ ) {
                case -1486257880: {
                    continue block189;
                }
                case -1091989190: {
                    break block189;
                }
            }
            break;
        }
        v51 /* !! */  = u.av;
        if (true) ** GOTO lbl314
        block190: while (true) {
            v51 /* !! */  = (long)(v52 - u.mgt("nws", nmg(int ), (int)113));
lbl314:
            // 2 sources

            switch ((int)v51 /* !! */ ) {
                case -1091989190: {
                    break block190;
                }
                case -1078515725: {
                    v52 = u.mgt("nwu", nmg(int ), (int)114);
                    continue block190;
                }
                case -940180680: {
                    v52 = u.mgt("nww", nmg(int ), (int)115);
                    continue block190;
                }
            }
            break;
        }
        v53 = v49.method_27692(class_124.field_1061);
        while (true) {
            if ((v54 /* !! */  = (cfr_temp_8 = u.av - u.mgt("nwy", nmg(int ), (int)116)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v54 /* !! */  == u.mgt("nwz", mgq(int ), (int)254)) break;
            v54 /* !! */  = (long)u.mgt("nxa", mgq(int ), (int)255);
        }
        v55 = new class_2568.class_10613((class_2561)v53);
        v56 /* !! */  = u.av;
        if (true) ** GOTO lbl334
        block192: while (true) {
            v56 /* !! */  = (long)(v57 - u.mgt("nxb", nmg(int ), (int)117));
lbl334:
            // 2 sources

            switch ((int)v56 /* !! */ ) {
                case -1406695474: {
                    v57 = u.mgt("nxd", nmg(int ), (int)118);
                    continue block192;
                }
                case -1091989190: {
                    break block192;
                }
                case -781057279: {
                    v57 = u.mgt("nxf", nmg(int ), (int)119);
                    continue block192;
                }
            }
            break;
        }
        v58 = v43.method_10949((class_2568)v55);
        while (true) {
            if ((v59 /* !! */  = (cfr_temp_9 = u.av - u.mgt("nxh", nmg(int ), (int)120)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v59 /* !! */  == u.mgt("nxi", mgq(int ), (int)256)) break;
            v59 /* !! */  = (long)u.mgt("nxk", mgq(int ), (int)257);
        }
        v60 /* !! */  = u.av;
        if (true) ** GOTO lbl353
        block194: while (true) {
            v60 /* !! */  = (long)(u.mgt("nxn", nmg(int ), (int)122) - u.mgt("nxl", nmg(int ), (int)121));
lbl353:
            // 2 sources

            switch ((int)v60 /* !! */ ) {
                case -1756744649: {
                    continue block194;
                }
                case -1091989190: {
                    break block194;
                }
            }
            break;
        }
        v61 = new class_2558.class_10609(var4_7);
        v62 /* !! */  = u.av;
        if (true) ** GOTO lbl363
        block195: while (true) {
            v62 /* !! */  = (long)(v63 - u.mgt("nxp", nmg(int ), (int)123));
lbl363:
            // 2 sources

            switch ((int)v62 /* !! */ ) {
                case -1091989190: {
                    break block195;
                }
                case 1096700022: {
                    v63 = u.mgt("nxr", nmg(int ), (int)124);
                    continue block195;
                }
                case 1218300322: {
                    v63 = u.mgt("nxs", nmg(int ), (int)125);
                    continue block195;
                }
                case 1267345047: {
                    v63 = u.mgt("nxu", nmg(int ), (int)126);
                    continue block195;
                }
            }
            break;
        }
        v64 = v58.method_10958((class_2558)v61);
        while (true) {
            if ((v65 /* !! */  = (cfr_temp_10 = u.av - u.mgt("nxv", nmg(int ), (int)127)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v65 /* !! */  == u.mgt("nxx", mgq(int ), (int)258)) break;
            v65 /* !! */  = (long)u.mgt("nxy", mgq(int ), (int)259);
        }
        var5_8.method_10862(v64);
        ** while (var6_4 || var6_4)
lbl383:
        // 1 sources

        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v66 /* !! */  = u.av;
                if (true) ** GOTO lbl390
                block197: while (true) {
                    v66 /* !! */  = (long)(v67 - u.mgt("nya", nmg(int ), (int)128));
lbl390:
                    // 2 sources

                    switch ((int)v66 /* !! */ ) {
                        case -1383807355: {
                            v67 = u.mgt("nyc", nmg(int ), (int)129);
                            continue block197;
                        }
                        case -1091989190: {
                            break block197;
                        }
                        case 137018617: {
                            v67 = u.mgt("nyd", nmg(int ), (int)130);
                            continue block197;
                        }
                    }
                    break;
                }
                v68 = class_2561.method_43470((String)var2_5);
                while (true) {
                    if ((v69 /* !! */  = (cfr_temp_11 = u.av - u.mgt("nyf", nmg(int ), (int)131)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v69 /* !! */  == u.mgt("nyh", mgq(int ), (int)260)) break;
                    v69 /* !! */  = (long)u.mgt("nyi", mgq(int ), (int)261);
                }
                v70 /* !! */  = u.av;
                if (true) ** GOTO lbl409
                block199: while (true) {
                    v70 /* !! */  = (long)(v71 - u.mgt("nyk", nmg(int ), (int)132));
lbl409:
                    // 2 sources

                    switch ((int)v70 /* !! */ ) {
                        case -1091989190: {
                            break block199;
                        }
                        case -906579484: {
                            v71 = u.mgt("nym", nmg(int ), (int)133);
                            continue block199;
                        }
                        case 1977855033: {
                            v71 = u.mgt("nyn", nmg(int ), (int)134);
                            continue block199;
                        }
                    }
                    break;
                }
                v72 = v68.method_27692(class_124.field_1068);
                while (true) {
                    if ((v73 /* !! */  = (cfr_temp_12 = u.av - u.mgt("nyp", nmg(int ), (int)135)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v73 /* !! */  == u.mgt("nyq", mgq(int ), (int)262)) break;
                    v73 /* !! */  = (long)u.mgt("nys", mgq(int ), (int)263);
                }
                v74 = class_2561.method_43470((String)" (");
                while (true) {
                    if ((v75 /* !! */  = (cfr_temp_13 = u.av - u.mgt("nyu", nmg(int ), (int)136)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v75 /* !! */  == u.mgt("nyv", mgq(int ), (int)264)) break;
                    v75 /* !! */  = (long)u.mgt("nyx", mgq(int ), (int)265);
                }
                while (true) {
                    if ((v76 /* !! */  = (cfr_temp_14 = u.av - u.mgt("nyy", nmg(int ), (int)137)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v76 /* !! */  == u.mgt("nza", mgq(int ), (int)266)) break;
                    v76 /* !! */  = (long)u.mgt("nzb", mgq(int ), (int)267);
                }
                v77 = v74.method_27692(class_124.field_1080);
                v78 /* !! */  = u.av;
                if (true) ** GOTO lbl440
                block203: while (true) {
                    v78 /* !! */  = (long)(u.mgt("nzf", nmg(int ), (int)139) - u.mgt("nzd", nmg(int ), (int)138));
lbl440:
                    // 2 sources

                    switch ((int)v78 /* !! */ ) {
                        case -1927911527: {
                            continue block203;
                        }
                        case -1091989190: {
                            break block203;
                        }
                    }
                    break;
                }
                v79 = v72.method_10852((class_2561)v77);
                while (true) {
                    if ((v80 /* !! */  = (cfr_temp_15 = u.av - u.mgt("nzg", nmg(int ), (int)140)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v80 /* !! */  == u.mgt("nzh", mgq(int ), (int)268)) break;
                    v80 /* !! */  = (long)u.mgt("nzj", mgq(int ), (int)269);
                }
                v81 = class_2561.method_43470((String)var3_6);
                v82 /* !! */  = u.av;
                if (true) ** GOTO lbl456
                block205: while (true) {
                    v82 /* !! */  = (long)(v83 - u.mgt("nzl", nmg(int ), (int)141));
lbl456:
                    // 2 sources

                    switch ((int)v82 /* !! */ ) {
                        case -1091989190: {
                            break block205;
                        }
                        case -429814813: {
                            v83 = u.mgt("nzn", nmg(int ), (int)142);
                            continue block205;
                        }
                        case 1648092229: {
                            v83 = u.mgt("nzo", nmg(int ), (int)143);
                            continue block205;
                        }
                    }
                    break;
                }
                v84 /* !! */  = u.av;
                if (true) ** GOTO lbl469
                block206: while (true) {
                    v84 /* !! */  = (long)(v85 - u.mgt("nzq", nmg(int ), (int)144));
lbl469:
                    // 2 sources

                    switch ((int)v84 /* !! */ ) {
                        case -1091989190: {
                            break block206;
                        }
                        case 60433965: {
                            v85 = u.mgt("nzs", nmg(int ), (int)145);
                            continue block206;
                        }
                        case 1297160518: {
                            v85 = u.mgt("nzu", nmg(int ), (int)146);
                            continue block206;
                        }
                    }
                    break;
                }
                v86 = v81.method_27692(class_124.field_1068);
                while (true) {
                    if ((v87 /* !! */  = (cfr_temp_16 = u.av - u.mgt("nzw", nmg(int ), (int)147)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v87 /* !! */  == u.mgt("nzy", mgq(int ), (int)270)) break;
                    v87 /* !! */  = (long)u.mgt("nzz", mgq(int ), (int)271);
                }
                v88 = v79.method_10852((class_2561)v86);
                v89 /* !! */  = u.av;
                if (true) ** GOTO lbl489
                block208: while (true) {
                    v89 /* !! */  = (long)(v90 - u.mgt("oaa", nmg(int ), (int)148));
lbl489:
                    // 2 sources

                    switch ((int)v89 /* !! */ ) {
                        case -1091989190: {
                            break block208;
                        }
                        case -818496645: {
                            v90 = u.mgt("oac", nmg(int ), (int)149);
                            continue block208;
                        }
                        case -231982505: {
                            v90 = u.mgt("oae", nmg(int ), (int)150);
                            continue block208;
                        }
                    }
                    break;
                }
                v91 = class_2561.method_43470((String)") ");
                v92 /* !! */  = u.av;
                if (true) ** GOTO lbl503
                block209: while (true) {
                    v92 /* !! */  = (long)(u.mgt("oah", nmg(int ), (int)152) - u.mgt("oag", nmg(int ), (int)151));
lbl503:
                    // 2 sources

                    switch ((int)v92 /* !! */ ) {
                        case -1091989190: {
                            break block209;
                        }
                        case 1387835215: {
                            continue block209;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v93 /* !! */  = (cfr_temp_17 = u.av - u.mgt("oak", nmg(int ), (int)153)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v93 /* !! */  == u.mgt("oam", mgq(int ), (int)272)) break;
                    v93 /* !! */  = (long)u.mgt("oan", mgq(int ), (int)273);
                }
                v94 = v91.method_27692(class_124.field_1080);
                while (true) {
                    if ((v95 /* !! */  = (cfr_temp_18 = u.av - u.mgt("oap", nmg(int ), (int)154)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v95 /* !! */  == u.mgt("oaq", mgq(int ), (int)274)) break;
                    v95 /* !! */  = (long)u.mgt("oas", mgq(int ), (int)275);
                }
                v96 = v88.method_10852((class_2561)v94);
                while (true) {
                    if ((v97 /* !! */  = (cfr_temp_19 = u.av - u.mgt("oau", nmg(int ), (int)155)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v97 /* !! */  == u.mgt("oav", mgq(int ), (int)276)) break;
                    v97 /* !! */  = (long)u.mgt("oax", mgq(int ), (int)277);
                }
                return v96.method_10852((class_2561)var5_8);
            }
lbl526:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)u.mgt("oaz", mgq(int ), (int)278);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl570
            }
            case 1: {
                var7_3 /* !! */  = (int)u.mgt("obb", mgq(int ), (int)279);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl579
            }
            case 2: {
                var7_3 /* !! */  = (int)u.mgt("obc", mgq(int ), (int)280);
                if (!var8_2) ** GOTO lbl526
                throw null;
            }
            case 3: {
                var7_3 /* !! */  = (int)u.mgt("obe", mgq(int ), (int)281);
                if (!var8_2) break;
                throw null;
            }
lbl544:
            // 3 sources

            case 4: {
                var7_3 /* !! */  = (int)u.mgt("obg", mgq(int ), (int)282);
                if (var8_2) {
                    throw null;
                }
            }
lbl548:
            // 4 sources

            case 5: {
                var7_3 /* !! */  = (int)u.mgt("obi", mgq(int ), (int)283);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl579
            }
lbl553:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)u.mgt("obk", mgq(int ), (int)284);
                if (var8_2) {
                    throw null;
                }
            }
            case 7: {
                var7_3 /* !! */  = (int)u.mgt("obm", mgq(int ), (int)285);
                if (!var8_2) ** GOTO lbl548
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)u.mgt("obo", mgq(int ), (int)286);
                if (!var8_2) ** GOTO lbl553
                throw null;
            }
lbl565:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)u.mgt("obp", mgq(int ), (int)287);
                    if (!var8_2) ** GOTO lbl544
                    throw null;
                }
            }
lbl570:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)u.mgt("obr", mgq(int ), (int)288);
                if (!var8_2) ** GOTO lbl565
                throw null;
            }
            case 11: {
                do {
                    var7_3 /* !! */  = (int)u.mgt("obt", mgq(int ), (int)289);
                } while (!var8_2);
                throw null;
            }
lbl579:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)u.mgt("obu", mgq(int ), (int)290);
                if (!var8_2) ** GOTO lbl544
                throw null;
            }
            case 13: 
        }
        var7_3 /* !! */  = (int)u.mgt("obw", mgq(int ), (int)291);
        ** while (!var8_2)
lbl586:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void oet() {
        u.mgr[100] = -886692759;
        u.mgr[101] = 321661940;
        u.mgr[102] = 358141585;
        u.mgr[103] = 1206236686;
        u.mgr[104] = -823069671;
        u.mgr[105] = 1553225656;
        u.mgr[106] = -440385395;
        u.mgr[107] = -1690219650;
        u.mgr[108] = 146305881;
        u.mgr[109] = 31267171;
        u.mgr[110] = -1357240444;
        u.mgr[111] = 1834974804;
        u.mgr[112] = 1774719347;
        u.mgr[113] = -2029989217;
        u.mgr[114] = 1064921075;
        u.mgr[115] = 1187499707;
        u.mgr[116] = -623831383;
        u.mgr[117] = 1050336044;
        u.mgr[118] = -365877570;
        u.mgr[119] = -36038610;
        u.mgr[120] = -899584943;
        u.mgr[121] = 130754107;
        u.mgr[122] = -1543579771;
        u.mgr[123] = -1995152662;
        u.mgr[124] = 1139104007;
        u.mgr[125] = -31740026;
        u.mgr[126] = -1517074720;
        u.mgr[127] = 1577419083;
        u.mgr[128] = -1307905595;
        u.mgr[129] = -1796134248;
        u.mgr[130] = -1036443937;
        u.mgr[131] = 349514089;
        u.mgr[132] = -7978883;
        u.mgr[133] = 582197988;
        u.mgr[134] = 1398371936;
        u.mgr[135] = 1170165230;
        u.mgr[136] = 1268868792;
        u.mgr[137] = -1452079391;
        u.mgr[138] = 1384470901;
        u.mgr[139] = 761909648;
        u.mgr[140] = 1022641685;
        u.mgr[141] = 781634313;
        u.mgr[142] = -189437647;
        u.mgr[143] = -1546064996;
        u.mgr[144] = 1213425716;
        u.mgr[145] = 543629418;
        u.mgr[146] = 819921536;
        u.mgr[147] = -113785010;
        u.mgr[148] = 750660382;
        u.mgr[149] = -1036950362;
        u.mgr[150] = 336623692;
        u.mgr[151] = -789562205;
        u.mgr[152] = -619674273;
        u.mgr[153] = -172960461;
        u.mgr[154] = -2076417481;
        u.mgr[155] = -1612336777;
        u.mgr[156] = -239285099;
        u.mgr[157] = -981489322;
        u.mgr[158] = 586550945;
        u.mgr[159] = -481003332;
        u.mgr[160] = -1776919008;
        u.mgr[161] = 266601990;
        u.mgr[162] = -790658294;
        u.mgr[163] = -333954933;
        u.mgr[164] = 2113803280;
        u.mgr[165] = -1903194807;
        u.mgr[166] = -206852112;
        u.mgr[167] = 2066835515;
        u.mgr[168] = 1783487865;
        u.mgr[169] = 505376649;
        u.mgr[170] = 0x99DBB9D;
        u.mgr[171] = -1047900833;
        u.mgr[172] = -1536101273;
        u.mgr[173] = -1298777454;
        u.mgr[174] = 1620608227;
        u.mgr[175] = 1266345991;
        u.mgr[176] = -1939179190;
        u.mgr[177] = 1676138077;
        u.mgr[178] = 1918879468;
        u.mgr[179] = 966412014;
        u.mgr[180] = 811889999;
        u.mgr[181] = -1304205752;
        u.mgr[182] = 606851025;
        u.mgr[183] = -2063488147;
        u.mgr[184] = -485469223;
        u.mgr[185] = -2053452448;
        u.mgr[186] = 315603700;
        u.mgr[187] = -405441151;
        u.mgr[188] = 1484364543;
        u.mgr[189] = -1679203570;
        u.mgr[190] = -1194070;
        u.mgr[191] = 1420901307;
        u.mgr[192] = 2036494496;
        u.mgr[193] = 1888066404;
        u.mgr[194] = 1564838917;
        u.mgr[195] = -2096667927;
        u.mgr[196] = -582341554;
        u.mgr[197] = -1172608264;
        u.mgr[198] = -1222300599;
        u.mgr[199] = -1125551139;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public u() {
        var2_1 /* !! */  = u.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("staff", "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430", new String[0]);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)u.mgt("mgu", mgq(int ), (int)0);
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)u.mgt("mgv", mgq(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)u.mgt("mgw", mgq(int ), (int)2);
        }
    }

    private static /* synthetic */ long nmg(int n2) {
        return nmi[n2] ^ nmj[n2];
    }

    private static /* synthetic */ int mgq(int n2) {
        return mgr[n2] ^ mgs[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$execute$0(List var1_1) {
        v0 /* !! */  = u.av;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(u.mgt("ocb", nmg(int ), (int)157) - u.mgt("oca", nmg(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2071718822: {
                    continue block39;
                }
                case -1091989190: {
                    break block39;
                }
            }
            break;
        }
        var4_2 = u.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = u.av - u.mgt("ocd", nmg(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == u.mgt("oce", mgq(int ), (int)292)) break;
            v1 /* !! */  = (long)u.mgt("ocg", mgq(int ), (int)293);
        }
        var3_3 /* !! */  = u.b;
        v2 /* !! */  = u.av;
        if (true) ** GOTO lbl21
        block41: while (true) {
            v2 /* !! */  = (long)(u.mgt("ocj", nmg(int ), (int)160) - u.mgt("och", nmg(int ), (int)159));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1091989190: {
                    break block41;
                }
                case -751088453: {
                    continue block41;
                }
            }
            break;
        }
        var2_4 = u.a;
        if (var4_2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = u.av - u.mgt("ocl", nmg(int ), (int)161)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == u.mgt("ocn", mgq(int ), (int)294)) break;
            v3 /* !! */  = (long)u.mgt("oco", mgq(int ), (int)295);
        }
        v4 = o.getLine();
        v5 /* !! */  = u.av;
        if (true) ** GOTO lbl42
        block44: while (true) {
            v5 /* !! */  = (long)(u.mgt("ocs", nmg(int ), (int)163) - u.mgt("ocq", nmg(int ), (int)162));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1091989190: {
                    break block44;
                }
                case -511055495: {
                    continue block44;
                }
            }
            break;
        }
        v6 = class_2561.method_43470((String)v4);
        v7 /* !! */  = u.av;
        if (true) ** GOTO lbl52
        block45: while (true) {
            v7 /* !! */  = (long)(v8 - u.mgt("oct", nmg(int ), (int)164));
lbl52:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1955462071: {
                    v8 = u.mgt("ocu", nmg(int ), (int)165);
                    continue block45;
                }
                case -1091989190: {
                    break block45;
                }
                case 1928125912: {
                    v8 = u.mgt("ocv", nmg(int ), (int)166);
                    continue block45;
                }
            }
            break;
        }
        this.logDirectRaw(v6);
        if (var2_4 || var2_4) ** GOTO lbl29
        v9 /* !! */  = u.av;
        if (true) ** GOTO lbl67
        block46: while (true) {
            v9 /* !! */  = (long)(v10 - u.mgt("ocx", nmg(int ), (int)167));
lbl67:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1091989190: {
                    break block46;
                }
                case 527773524: {
                    v10 = u.mgt("ocz", nmg(int ), (int)168);
                    continue block46;
                }
                case 589866872: {
                    v10 = u.mgt("oda", nmg(int ), (int)169);
                    continue block46;
                }
            }
            break;
        }
        v11 = var1_1.size();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = u.av - u.mgt("odc", nmg(int ), (int)170)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == u.mgt("odd", mgq(int ), (int)296)) break;
            v12 /* !! */  = (long)u.mgt("ode", mgq(int ), (int)297);
        }
        v13 = "\u00a77\u0421\u043f\u0438\u0441\u043e\u043a \u0441\u0442\u0430\u0444\u0444\u0430: \u00a7f" + v11;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = u.av - u.mgt("odf", nmg(int ), (int)171)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == u.mgt("odg", mgq(int ), (int)298)) break;
            v14 /* !! */  = (long)u.mgt("odh", mgq(int ), (int)299);
        }
        this.logDirect(v13);
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = u.av - u.mgt("odi", nmg(int ), (int)172)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == u.mgt("odk", mgq(int ), (int)300)) break;
            v15 /* !! */  = (long)u.mgt("odl", mgq(int ), (int)301);
        }
        v16 = o.getLine();
        v17 /* !! */  = u.av;
        if (true) ** GOTO lbl100
        block50: while (true) {
            v17 /* !! */  = (long)(v18 - u.mgt("odn", nmg(int ), (int)173));
lbl100:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1091989190: {
                    break block50;
                }
                case -967193578: {
                    v18 = u.mgt("odo", nmg(int ), (int)174);
                    continue block50;
                }
                case -936185856: {
                    v18 = u.mgt("odq", nmg(int ), (int)175);
                    continue block50;
                }
            }
            break;
        }
        v19 = class_2561.method_43470((String)v16);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_5 = u.av - u.mgt("odr", nmg(int ), (int)176)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == u.mgt("odt", mgq(int ), (int)302)) break;
            v20 /* !! */  = (long)u.mgt("odu", mgq(int ), (int)303);
        }
        this.logDirectRaw(v19);
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl123:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)u.mgt("odv", mgq(int ), (int)304);
                } while (!var4_2);
                throw null;
            }
lbl128:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)u.mgt("odx", mgq(int ), (int)305);
                if (!var4_2) ** GOTO lbl123
                throw null;
            }
lbl132:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)u.mgt("odz", mgq(int ), (int)306);
                if (!var4_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)u.mgt("oea", mgq(int ), (int)307);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl159
                    break;
                }
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)u.mgt("oeb", mgq(int ), (int)308);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)u.mgt("oed", mgq(int ), (int)309);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)u.mgt("oee", mgq(int ), (int)310);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)u.mgt("oeg", mgq(int ), (int)311);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
lbl159:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)u.mgt("oei", mgq(int ), (int)312);
                if (!var4_2) ** GOTO lbl128
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)u.mgt("oek", mgq(int ), (int)313);
        ** while (!var4_2)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ogr() {
        u.nmj[100] = 2581327277074102604L;
        u.nmj[101] = -2066568900997267144L;
        u.nmj[102] = 1448945258691101196L;
        u.nmj[103] = 6435487671915528230L;
        u.nmj[104] = -6103824659386257408L;
        u.nmj[105] = 3313723623612610616L;
        u.nmj[106] = 633306166517549293L;
        u.nmj[107] = 3699746031658778367L;
        u.nmj[108] = -3643839621742383565L;
        u.nmj[109] = -8921714427750099959L;
        u.nmj[110] = -9060989299690589265L;
        u.nmj[111] = -8580977486475701182L;
        u.nmj[112] = -8660855946655617201L;
        u.nmj[113] = 5239054740085572228L;
        u.nmj[114] = 6953249350705952471L;
        u.nmj[115] = -4342831132681170598L;
        u.nmj[116] = -2384883804164762278L;
        u.nmj[117] = 3712563693806727350L;
        u.nmj[118] = -6338526045494280198L;
        u.nmj[119] = 8970526207605998889L;
        u.nmj[120] = 6583802770612760338L;
        u.nmj[121] = 5274756184715051905L;
        u.nmj[122] = 4599468434883113677L;
        u.nmj[123] = -437134812439800792L;
        u.nmj[124] = -9068148734088521795L;
        u.nmj[125] = 4011275474859315331L;
        u.nmj[126] = -3158512813408638807L;
        u.nmj[127] = 4373749731581667101L;
        u.nmj[128] = 3065824181653233478L;
        u.nmj[129] = 1955678638075280884L;
        u.nmj[130] = -8911902177404069374L;
        u.nmj[131] = -2131304543553102948L;
        u.nmj[132] = 5069263415130021178L;
        u.nmj[133] = 8085071112561251419L;
        u.nmj[134] = 7376778610521178198L;
        u.nmj[135] = 6023669181373781163L;
        u.nmj[136] = -6063419449259020896L;
        u.nmj[137] = 5582238742339708128L;
        u.nmj[138] = -3906882790207031361L;
        u.nmj[139] = -6242057157230227587L;
        u.nmj[140] = 6825017322452098807L;
        u.nmj[141] = 8614611849766607256L;
        u.nmj[142] = 2691260036650437273L;
        u.nmj[143] = 2303463798606754621L;
        u.nmj[144] = 1138971024785695112L;
        u.nmj[145] = 6556056333099563392L;
        u.nmj[146] = 6808144205796011133L;
        u.nmj[147] = 2935821368536044719L;
        u.nmj[148] = 3795504595579434943L;
        u.nmj[149] = -9214833480323036879L;
        u.nmj[150] = 4160064383048539008L;
        u.nmj[151] = 4845937382390596189L;
        u.nmj[152] = 8668097322974329106L;
        u.nmj[153] = -1851055451698376620L;
        u.nmj[154] = 4243128376611560279L;
        u.nmj[155] = 8427172067662801814L;
        u.nmj[156] = 3559932167286403724L;
        u.nmj[157] = 9033562847691025288L;
        u.nmj[158] = 5161100822688146365L;
        u.nmj[159] = -1773515399459617716L;
        u.nmj[160] = 6682739002450617072L;
        u.nmj[161] = -8353565334342928803L;
        u.nmj[162] = 2559243524169565663L;
        u.nmj[163] = 3571663706831803511L;
        u.nmj[164] = -1944760531219172863L;
        u.nmj[165] = 5949559593860602239L;
        u.nmj[166] = -2099625461667243549L;
        u.nmj[167] = 4844715793415693676L;
        u.nmj[168] = 2451023142163169424L;
        u.nmj[169] = -4810536541781356429L;
        u.nmj[170] = -3348268952778335188L;
        u.nmj[171] = -6347827101034486679L;
        u.nmj[172] = 1030515634104341567L;
        u.nmj[173] = 8525406727840715484L;
        u.nmj[174] = -7941873997917659347L;
        u.nmj[175] = 6750898487496292312L;
        u.nmj[176] = -1138834015436797974L;
    }

    static {
        mgs = new int[314];
        u.oen();
        u.oet();
        u.oex();
        u.ofe();
        u.ofg();
        u.ofl();
        u.ofr();
        u.ofx();
        nmi = new long[177];
        nmj = new long[177];
        u.oga();
        u.ogg();
        u.ogm();
        u.ogr();
        DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm").withZone(ZoneId.systemDefault());
    }

    private static /* synthetic */ void ofg() {
        u.mgs[0] = 1701458381;
        u.mgs[1] = -669961361;
        u.mgs[2] = 1980762461;
        u.mgs[3] = -2104561531;
        u.mgs[4] = 523604261;
        u.mgs[5] = -1906810111;
        u.mgs[6] = 1608066404;
        u.mgs[7] = 1037375270;
        u.mgs[8] = 610401660;
        u.mgs[9] = 1645635165;
        u.mgs[10] = 743055347;
        u.mgs[11] = -738609171;
        u.mgs[12] = -1275634250;
        u.mgs[13] = -1154977325;
        u.mgs[14] = 2072454229;
        u.mgs[15] = -1178209233;
        u.mgs[16] = 2012865295;
        u.mgs[17] = 248123670;
        u.mgs[18] = -961665819;
        u.mgs[19] = 1272347605;
        u.mgs[20] = -2063666664;
        u.mgs[21] = -1023019544;
        u.mgs[22] = 914658734;
        u.mgs[23] = -1821156053;
        u.mgs[24] = 2117670910;
        u.mgs[25] = 1490583060;
        u.mgs[26] = -1384927919;
        u.mgs[27] = -1284211209;
        u.mgs[28] = 771198994;
        u.mgs[29] = 2048926881;
        u.mgs[30] = 814567467;
        u.mgs[31] = 130814413;
        u.mgs[32] = 1197088132;
        u.mgs[33] = -1048096188;
        u.mgs[34] = -632157770;
        u.mgs[35] = 0x211A1A2;
        u.mgs[36] = -1966981774;
        u.mgs[37] = -2057944810;
        u.mgs[38] = -896354256;
        u.mgs[39] = 2147317918;
        u.mgs[40] = -1483279071;
        u.mgs[41] = 30599046;
        u.mgs[42] = -1890660743;
        u.mgs[43] = -1754428875;
        u.mgs[44] = -209665911;
        u.mgs[45] = -1883234672;
        u.mgs[46] = -451260351;
        u.mgs[47] = -880138888;
        u.mgs[48] = 764896534;
        u.mgs[49] = 787248942;
        u.mgs[50] = 1755638882;
        u.mgs[51] = 288491943;
        u.mgs[52] = -883708756;
        u.mgs[53] = 1456763663;
        u.mgs[54] = -2001872503;
        u.mgs[55] = -1959088117;
        u.mgs[56] = -910996244;
        u.mgs[57] = 1868764294;
        u.mgs[58] = 1044797724;
        u.mgs[59] = 579526402;
        u.mgs[60] = 1058897589;
        u.mgs[61] = 1964440004;
        u.mgs[62] = 1929315415;
        u.mgs[63] = 266525275;
        u.mgs[64] = 1182468589;
        u.mgs[65] = 2105636682;
        u.mgs[66] = -1749399624;
        u.mgs[67] = -1501117213;
        u.mgs[68] = -1445148287;
        u.mgs[69] = 645424536;
        u.mgs[70] = 1973465245;
        u.mgs[71] = -1791686848;
        u.mgs[72] = -1892160599;
        u.mgs[73] = 2057999914;
        u.mgs[74] = 1264185642;
        u.mgs[75] = -551825412;
        u.mgs[76] = 1953460848;
        u.mgs[77] = -1127079004;
        u.mgs[78] = -1921532304;
        u.mgs[79] = -836894492;
        u.mgs[80] = -447301517;
        u.mgs[81] = -2034298549;
        u.mgs[82] = 1076751563;
        u.mgs[83] = 1944657299;
        u.mgs[84] = 1859190248;
        u.mgs[85] = 505933239;
        u.mgs[86] = -1673171317;
        u.mgs[87] = 761466697;
        u.mgs[88] = -1846656542;
        u.mgs[89] = 634744006;
        u.mgs[90] = 804133077;
        u.mgs[91] = 1292882432;
        u.mgs[92] = -1859785774;
        u.mgs[93] = 1905863892;
        u.mgs[94] = -1209183541;
        u.mgs[95] = 847011521;
        u.mgs[96] = 1423182161;
        u.mgs[97] = -1110500568;
        u.mgs[98] = -1259990294;
        u.mgs[99] = -675453133;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = u.av - u.mgt("nnc", nmg(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == u.mgt("nnd", mgq(int ), (int)190)) break;
            v0 /* !! */  = (long)u.mgt("nnf", mgq(int ), (int)191);
        }
        var3_1 = u.c;
        v1 /* !! */  = u.av;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(u.mgt("nnh", nmg(int ), (int)6) - u.mgt("nng", nmg(int ), (int)5));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1091989190: {
                    break block22;
                }
                case -361583994: {
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = u.b;
        v2 /* !! */  = u.av;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - u.mgt("nnj", nmg(int ), (int)7));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1671762838: {
                    v3 = u.mgt("nnk", nmg(int ), (int)8);
                    continue block23;
                }
                case -1091989190: {
                    break block23;
                }
                case 225522536: {
                    v3 = u.mgt("nnl", nmg(int ), (int)9);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = u.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v4 = new String[]{"\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:", "> staff add <name> - \u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b", "> staff remove <name> - \u0423\u0434\u0430\u043b\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430", "> staff list - \u041f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430", "> staff clear - \u041e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"};
                v5 /* !! */  = u.av;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - u.mgt("nnn", nmg(int ), (int)10));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1091989190: {
                            break block25;
                        }
                        case -465481840: {
                            v6 = u.mgt("nnp", nmg(int ), (int)11);
                            continue block25;
                        }
                        case -80623543: {
                            v6 = u.mgt("nnq", nmg(int ), (int)12);
                            continue block25;
                        }
                        case 1131248406: {
                            v6 = u.mgt("nnr", nmg(int ), (int)13);
                            continue block25;
                        }
                    }
                    break;
                }
                return Arrays.asList(v4);
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)u.mgt("nnt", mgq(int ), (int)192);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)u.mgt("nnv", mgq(int ), (int)193);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)u.mgt("nnw", mgq(int ), (int)194);
                    if (!var3_1) break block24;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)u.mgt("nnx", mgq(int ), (int)195);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ogm() {
        u.nmj[0] = -7647537957559942839L;
        u.nmj[1] = -3459457464845598479L;
        u.nmj[2] = 7808235600353882558L;
        u.nmj[3] = -2610119504903876844L;
        u.nmj[4] = 3667380634707654030L;
        u.nmj[5] = -1931819693948355533L;
        u.nmj[6] = -7618955318218876285L;
        u.nmj[7] = -8282226987660580830L;
        u.nmj[8] = -307717140721220849L;
        u.nmj[9] = -7338577883849154466L;
        u.nmj[10] = -1349900116808011125L;
        u.nmj[11] = -1111277884040429552L;
        u.nmj[12] = 2997914842554115324L;
        u.nmj[13] = -7149308636195755110L;
        u.nmj[14] = -917328865203656646L;
        u.nmj[15] = -6643752586799602412L;
        u.nmj[16] = 117607699004083980L;
        u.nmj[17] = 2527533739459636104L;
        u.nmj[18] = -2640074163244215386L;
        u.nmj[19] = -4195666656315919268L;
        u.nmj[20] = 6007677827934988572L;
        u.nmj[21] = 4963986269749628436L;
        u.nmj[22] = -3585815280547286753L;
        u.nmj[23] = 8529886994901269232L;
        u.nmj[24] = -372883070089894808L;
        u.nmj[25] = 5485757459361457826L;
        u.nmj[26] = 4912084410864170028L;
        u.nmj[27] = -331146146214035394L;
        u.nmj[28] = 2571204223413006441L;
        u.nmj[29] = -6994174684527441341L;
        u.nmj[30] = 6661504808054840789L;
        u.nmj[31] = 1292250032037613275L;
        u.nmj[32] = -3632955369413606895L;
        u.nmj[33] = 8802308378618194219L;
        u.nmj[34] = 437940363823136542L;
        u.nmj[35] = 5198922435321204715L;
        u.nmj[36] = -7180885811951585991L;
        u.nmj[37] = -55486306283188310L;
        u.nmj[38] = 2649618710027846726L;
        u.nmj[39] = 3700854024100995234L;
        u.nmj[40] = 7480492068039546600L;
        u.nmj[41] = -8646338627516478491L;
        u.nmj[42] = 926989346430588013L;
        u.nmj[43] = -4954990961850922699L;
        u.nmj[44] = -3406589072281709955L;
        u.nmj[45] = 7477624312528336364L;
        u.nmj[46] = -8591337857873709322L;
        u.nmj[47] = -4119018626964606113L;
        u.nmj[48] = -2039350904943926747L;
        u.nmj[49] = -3467194237028656736L;
        u.nmj[50] = 1291601906531482942L;
        u.nmj[51] = 6526521828371594236L;
        u.nmj[52] = -7061508304281307332L;
        u.nmj[53] = -3694680208836530968L;
        u.nmj[54] = -6495251142166960842L;
        u.nmj[55] = -6999671092043057894L;
        u.nmj[56] = -3984584697861232807L;
        u.nmj[57] = -8297188447152427957L;
        u.nmj[58] = -4468386406422292412L;
        u.nmj[59] = 1457045336241284456L;
        u.nmj[60] = 6599596411331626445L;
        u.nmj[61] = 5046684189832205288L;
        u.nmj[62] = -7219377753781243246L;
        u.nmj[63] = 1003157158389547808L;
        u.nmj[64] = 1608573700300312433L;
        u.nmj[65] = -2508480008712425771L;
        u.nmj[66] = 5917146385430566972L;
        u.nmj[67] = -6284854268137221869L;
        u.nmj[68] = -2275198132523628627L;
        u.nmj[69] = -9190042605163480772L;
        u.nmj[70] = 2726871330091931287L;
        u.nmj[71] = 6679321593673236579L;
        u.nmj[72] = 5335672824432376414L;
        u.nmj[73] = 7277720105052401370L;
        u.nmj[74] = -2616797110761466199L;
        u.nmj[75] = -3124269470602402039L;
        u.nmj[76] = 5865478784476010069L;
        u.nmj[77] = -7109580607347775103L;
        u.nmj[78] = 1075919271743692716L;
        u.nmj[79] = -1029662223495461296L;
        u.nmj[80] = 1865859634018326486L;
        u.nmj[81] = 6744193237370333583L;
        u.nmj[82] = -2555429364664917672L;
        u.nmj[83] = -6037819566350105830L;
        u.nmj[84] = 732476179998806675L;
        u.nmj[85] = -8780296521132736652L;
        u.nmj[86] = -3838974765658771763L;
        u.nmj[87] = -8721505247326601850L;
        u.nmj[88] = -8685915476830801357L;
        u.nmj[89] = -5721500176636651700L;
        u.nmj[90] = 2451278465908727440L;
        u.nmj[91] = -7803356891250861354L;
        u.nmj[92] = -8070218739970053092L;
        u.nmj[93] = -6818421160575226504L;
        u.nmj[94] = 3415415160317553947L;
        u.nmj[95] = 4243923798534278515L;
        u.nmj[96] = -7819026345337616243L;
        u.nmj[97] = -6025172820792374058L;
        u.nmj[98] = 2720984201789790710L;
        u.nmj[99] = -7637727662471771883L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String getShortDesc() {
        boolean bl2;
        Object object = av;
        block4: while (true) {
            switch ((int)object) {
                case -1091989190: {
                    break block4;
                }
                case 2080353910: {
                    object = u.mgt("nmm", nmg(int ), (int)1) - u.mgt("nml", nmg(int ), (int)0);
                    continue block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = av - u.mgt("nmo", nmg(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == u.mgt("nmp", mgq(int ), (int)182)) break;
            object2 = u.mgt("nmq", mgq(int ), (int)183);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = av - u.mgt("nmr", nmg(int ), (int)3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == u.mgt("nmt", mgq(int ), (int)184)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = u.mgt("nmu", mgq(int ), (int)185);
        }
        if (!bl2 && !bl2) return "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043f\u0438\u0441\u043a\u043e\u043c \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430";
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block51: {
            var6_3 = u.c;
            var5_4 /* !! */  = u.b;
            var4_5 = u.a;
            if (var6_3) {
                throw null;
lbl6:
                // 13 sources

                return null;
            }
            if (var4_5 || var4_5) ** GOTO lbl6
            if (var2_2.length != u.mgt("mym", mgq(int ), (int)155)) break block51;
            if (var4_5 || var4_5) ** GOTO lbl6
            return new i().append(new String[]{"add", "remove", "list", "clear"}).sortAlphabetically().filterPrefix(var2_2[0]).stream();
        }
        if (var4_5 || var4_5) ** GOTO lbl6
        if (var2_2.length != u.mgt("nkt", mgq(int ), (int)156)) ** GOTO lbl34
        if (var4_5) ** GOTO lbl6
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl6
                var3_6 = var2_2[0].toLowerCase();
                if (var4_5 || var4_5) ** GOTO lbl6
                if (!var3_6.equals("add")) ** GOTO lbl25
                if (var4_5 || var4_5) ** GOTO lbl6
                return new i().append(this.getOnlinePlayers().toArray(new String[0])).filterPrefix(var2_2[1]).stream();
lbl25:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                if (var3_6.equals("remove")) ** GOTO lbl32
                if (var4_5) ** GOTO lbl6
                if (var3_6.equals("del")) ** GOTO lbl32
                if (var4_5) ** GOTO lbl6
                if (!var3_6.equals("delete")) ** GOTO lbl34
                if (var4_5) ** GOTO lbl6
lbl32:
                // 3 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                return new i().append(z.getStaffNames().toArray(new String[0])).filterPrefix(var2_2[1]).stream();
lbl34:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return Stream.empty();
            }
lbl37:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)u.mgt("nky", mgq(int ), (int)157);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl47
            }
lbl42:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)u.mgt("nkz", mgq(int ), (int)158);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl47:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)u.mgt("nlb", mgq(int ), (int)159);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl52:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)u.mgt("nlc", mgq(int ), (int)160);
                if (!var6_3) ** GOTO lbl42
                throw null;
            }
lbl56:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)u.mgt("nld", mgq(int ), (int)161);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl61:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)u.mgt("nlf", mgq(int ), (int)162);
                if (!var6_3) ** GOTO lbl52
                throw null;
            }
            case 6: {
                var5_4 /* !! */  = (int)u.mgt("nlg", mgq(int ), (int)163);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                var5_4 /* !! */  = (int)u.mgt("nlh", mgq(int ), (int)164);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl75:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)u.mgt("nlj", mgq(int ), (int)165);
                if (!var6_3) ** GOTO lbl56
                throw null;
            }
            case 9: {
                var5_4 /* !! */  = (int)u.mgt("nlk", mgq(int ), (int)166);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 10: {
                var5_4 /* !! */  = (int)u.mgt("nll", mgq(int ), (int)167);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl89:
            // 2 sources

            case 11: {
                var5_4 /* !! */  = (int)u.mgt("nln", mgq(int ), (int)168);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl94:
            // 3 sources

            case 12: {
                var5_4 /* !! */  = (int)u.mgt("nlo", mgq(int ), (int)169);
                if (!var6_3) ** GOTO lbl42
                throw null;
            }
lbl98:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)u.mgt("nlp", mgq(int ), (int)170);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 14: {
                var5_4 /* !! */  = (int)u.mgt("nlr", mgq(int ), (int)171);
                if (!var6_3) ** GOTO lbl89
                throw null;
            }
lbl107:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)u.mgt("nls", mgq(int ), (int)172);
                if (!var6_3) break;
                throw null;
            }
lbl111:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)u.mgt("nlt", mgq(int ), (int)173);
                if (!var6_3) ** GOTO lbl98
                throw null;
            }
lbl115:
            // 3 sources

            case 17: {
                var5_4 /* !! */  = (int)u.mgt("nlv", mgq(int ), (int)174);
                if (!var6_3) ** GOTO lbl94
                throw null;
            }
lbl119:
            // 2 sources

            case 18: {
                var5_4 /* !! */  = (int)u.mgt("nlw", mgq(int ), (int)175);
                if (!var6_3) ** GOTO lbl75
                throw null;
            }
lbl123:
            // 2 sources

            case 19: {
                var5_4 /* !! */  = (int)u.mgt("nlx", mgq(int ), (int)176);
                if (!var6_3) ** GOTO lbl61
                throw null;
            }
            case 20: {
                var5_4 /* !! */  = (int)u.mgt("nlz", mgq(int ), (int)177);
                if (!var6_3) ** GOTO lbl47
                throw null;
            }
            case 21: {
                var5_4 /* !! */  = (int)u.mgt("nma", mgq(int ), (int)178);
                if (!var6_3) ** GOTO lbl37
                throw null;
            }
lbl135:
            // 2 sources

            case 22: {
                do {
                    var5_4 /* !! */  = (int)u.mgt("nmb", mgq(int ), (int)179);
                } while (!var6_3);
                throw null;
            }
            case 23: {
                var5_4 /* !! */  = (int)u.mgt("nmc", mgq(int ), (int)180);
                if (!var6_3) break;
                throw null;
            }
            case 24: 
        }
        do {
            var5_4 /* !! */  = (int)u.mgt("nmd", mgq(int ), (int)181);
        } while (!var6_3);
        throw null;
    }

    private static /* synthetic */ void ogg() {
        u.nmi[100] = -1181655095201486040L;
        u.nmi[101] = 5814191504280454048L;
        u.nmi[102] = 4235598617197507416L;
        u.nmi[103] = -3387140931795569711L;
        u.nmi[104] = -5655357083031875116L;
        u.nmi[105] = -8093386545102960751L;
        u.nmi[106] = 4729151579366064436L;
        u.nmi[107] = 1306350795908710604L;
        u.nmi[108] = -3592541073970092984L;
        u.nmi[109] = 8132810976932414554L;
        u.nmi[110] = -1365528895306963408L;
        u.nmi[111] = 3974899212539775748L;
        u.nmi[112] = -8239554949994133908L;
        u.nmi[113] = 1472828889015330461L;
        u.nmi[114] = -7047988045127940674L;
        u.nmi[115] = 7916226860762726064L;
        u.nmi[116] = 3833018525289575832L;
        u.nmi[117] = 3254388179097692251L;
        u.nmi[118] = 5388988936362770053L;
        u.nmi[119] = 5947405323057118574L;
        u.nmi[120] = -5149284421075756060L;
        u.nmi[121] = -1786677974341328586L;
        u.nmi[122] = 5095801210855307917L;
        u.nmi[123] = 5870526476836265018L;
        u.nmi[124] = -669751209716635722L;
        u.nmi[125] = 1893569002778608106L;
        u.nmi[126] = 2280903025123664756L;
        u.nmi[127] = -6522382349327972318L;
        u.nmi[128] = 8299119944837714398L;
        u.nmi[129] = -8503712109612148765L;
        u.nmi[130] = -2270732292793607397L;
        u.nmi[131] = 4134565241312355259L;
        u.nmi[132] = -7492735948173156134L;
        u.nmi[133] = 2301851373979424865L;
        u.nmi[134] = 2321940329979359532L;
        u.nmi[135] = 1142629161220434114L;
        u.nmi[136] = -9140370102459472345L;
        u.nmi[137] = -7436109086818431596L;
        u.nmi[138] = 9210644977603186321L;
        u.nmi[139] = -3532987131840027168L;
        u.nmi[140] = 4561505521536424212L;
        u.nmi[141] = -6028623463274099291L;
        u.nmi[142] = -4181083779832025024L;
        u.nmi[143] = -6332878296666868569L;
        u.nmi[144] = -290762637915241634L;
        u.nmi[145] = 8727734079236860754L;
        u.nmi[146] = -5205658897686531750L;
        u.nmi[147] = -2469750154769294984L;
        u.nmi[148] = -8288813349470990804L;
        u.nmi[149] = 3329286766280042202L;
        u.nmi[150] = 8710156742520927339L;
        u.nmi[151] = -7299647311204628728L;
        u.nmi[152] = -4431568963005004059L;
        u.nmi[153] = 3031318641156855415L;
        u.nmi[154] = 5920469401562328380L;
        u.nmi[155] = 8455737586435626085L;
        u.nmi[156] = -6786200503003617463L;
        u.nmi[157] = 3651991184545088224L;
        u.nmi[158] = -3077370044979635458L;
        u.nmi[159] = -3063569688160558103L;
        u.nmi[160] = -6613549908877567978L;
        u.nmi[161] = -7671966750640748166L;
        u.nmi[162] = -753617416827508839L;
        u.nmi[163] = -7039973835537979819L;
        u.nmi[164] = 693999438644832758L;
        u.nmi[165] = 8873837914539686617L;
        u.nmi[166] = -3596546674526635702L;
        u.nmi[167] = -3010377066289932657L;
        u.nmi[168] = 1623811349815432931L;
        u.nmi[169] = 4641042511394076395L;
        u.nmi[170] = 8536861125389320032L;
        u.nmi[171] = -931759920394553487L;
        u.nmi[172] = -4250810757885933993L;
        u.nmi[173] = 368476645159827897L;
        u.nmi[174] = 9168692612223675810L;
        u.nmi[175] = -7063513974835940082L;
        u.nmi[176] = -9153168907816748530L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<String> getOnlinePlayers() {
        v0 /* !! */  = u.av;
        if (true) ** GOTO lbl5
        block69: while (true) {
            v0 /* !! */  = (long)(u.mgt("nob", nmg(int ), (int)15) - u.mgt("noa", nmg(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1091989190: {
                    break block69;
                }
                case 1326744992: {
                    continue block69;
                }
            }
            break;
        }
        var8_1 = u.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = u.av - u.mgt("nod", nmg(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == u.mgt("noe", mgq(int ), (int)196)) break;
            v1 /* !! */  = (long)u.mgt("nof", mgq(int ), (int)197);
        }
        var7_2 /* !! */  = u.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = u.av - u.mgt("nog", nmg(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == u.mgt("noi", mgq(int ), (int)198)) break;
            v2 /* !! */  = (long)u.mgt("noj", mgq(int ), (int)199);
        }
        var6_3 = u.a;
        if (var8_1) {
            throw null;
lbl25:
            // 14 sources

            return null;
        }
        if (var6_3 || var6_3) ** GOTO lbl25
        v3 /* !! */  = u.av;
        if (true) ** GOTO lbl32
        block73: while (true) {
            v3 /* !! */  = (long)(u.mgt("nom", nmg(int ), (int)19) - u.mgt("nok", nmg(int ), (int)18));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1091989190: {
                    break block73;
                }
                case 1830257933: {
                    continue block73;
                }
            }
            break;
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = u.av - u.mgt("non", nmg(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == u.mgt("noo", mgq(int ), (int)200)) break;
            v4 /* !! */  = (long)u.mgt("noq", mgq(int ), (int)201);
        }
        var1_4 = new ArrayList<String>();
        if (var6_3 || var6_3) ** GOTO lbl25
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = u.av - u.mgt("nor", nmg(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == u.mgt("nos", mgq(int ), (int)202)) break;
            v5 /* !! */  = (long)u.mgt("nou", mgq(int ), (int)203);
        }
        var2_5 = class_310.method_1551();
        if (var6_3) ** GOTO lbl25
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3) ** GOTO lbl25
                v6 /* !! */  = u.av;
                if (true) ** GOTO lbl59
                block76: while (true) {
                    v6 /* !! */  = (long)(v7 - u.mgt("nov", nmg(int ), (int)22));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1123552452: {
                            v7 = u.mgt("now", nmg(int ), (int)23);
                            continue block76;
                        }
                        case -1091989190: {
                            break block76;
                        }
                        case -1007643345: {
                            v7 = u.mgt("noy", nmg(int ), (int)24);
                            continue block76;
                        }
                        case 1832842814: {
                            v7 = u.mgt("noz", nmg(int ), (int)25);
                            continue block76;
                        }
                    }
                    break;
                }
                if (var2_5.method_1562() == null) ** GOTO lbl183
                if (var6_3 || var6_3) ** GOTO lbl25
                v8 /* !! */  = u.av;
                if (true) ** GOTO lbl77
                block77: while (true) {
                    v8 /* !! */  = (long)(v9 - u.mgt("npa", nmg(int ), (int)26));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1976440853: {
                            v9 = u.mgt("npc", nmg(int ), (int)27);
                            continue block77;
                        }
                        case -1091989190: {
                            break block77;
                        }
                        case 874281276: {
                            v9 = u.mgt("npd", nmg(int ), (int)28);
                            continue block77;
                        }
                    }
                    break;
                }
                v10 = var2_5.method_1562();
                v11 /* !! */  = u.av;
                if (true) ** GOTO lbl91
                block78: while (true) {
                    v11 /* !! */  = (long)(v12 - u.mgt("npe", nmg(int ), (int)29));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1631103837: {
                            v12 = u.mgt("npf", nmg(int ), (int)30);
                            continue block78;
                        }
                        case -1091989190: {
                            break block78;
                        }
                        case -122727727: {
                            v12 = u.mgt("nph", nmg(int ), (int)31);
                            continue block78;
                        }
                        case 1461087290: {
                            v12 = u.mgt("npi", nmg(int ), (int)32);
                            continue block78;
                        }
                    }
                    break;
                }
                v13 = v10.method_2880();
                v14 /* !! */  = u.av;
                if (true) ** GOTO lbl108
                block79: while (true) {
                    v14 /* !! */  = (long)(u.mgt("npl", nmg(int ), (int)34) - u.mgt("npj", nmg(int ), (int)33));
lbl108:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1091989190: {
                            break block79;
                        }
                        case 166475277: {
                            continue block79;
                        }
                    }
                    break;
                }
                var3_6 = v13.iterator();
                if (var6_3) ** GOTO lbl25
                do {
                    if (var6_3 || var6_3) ** GOTO lbl25
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = u.av - u.mgt("npm", nmg(int ), (int)35)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == u.mgt("npn", mgq(int ), (int)204)) break;
                        v15 /* !! */  = (long)u.mgt("npp", mgq(int ), (int)205);
                    }
                    if (!var3_6.hasNext()) ** GOTO lbl183
                    if (var6_3) ** GOTO lbl25
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_5 = u.av - u.mgt("npq", nmg(int ), (int)36)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == u.mgt("npr", mgq(int ), (int)206)) break;
                        v16 /* !! */  = (long)u.mgt("npt", mgq(int ), (int)207);
                    }
                    var4_7 = (class_640)var3_6.next();
                    if (var6_3 || var6_3) ** GOTO lbl25
                    v17 /* !! */  = u.av;
                    if (true) ** GOTO lbl135
                    block83: while (true) {
                        v17 /* !! */  = (long)(v18 - u.mgt("npu", nmg(int ), (int)37));
lbl135:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1098835088: {
                                v18 = u.mgt("npv", nmg(int ), (int)38);
                                continue block83;
                            }
                            case -1091989190: {
                                break block83;
                            }
                            case -936440539: {
                                v18 = u.mgt("npx", nmg(int ), (int)39);
                                continue block83;
                            }
                            case 615435839: {
                                v18 = u.mgt("npy", nmg(int ), (int)40);
                                continue block83;
                            }
                        }
                        break;
                    }
                    v19 = var4_7.method_2966();
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_6 = u.av - u.mgt("npz", nmg(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == u.mgt("nqa", mgq(int ), (int)208)) break;
                        v20 /* !! */  = (long)u.mgt("nqc", mgq(int ), (int)209);
                    }
                    var5_8 = v19.name();
                    if (var6_3 || var6_3) ** GOTO lbl25
                    v21 /* !! */  = u.av;
                    if (true) ** GOTO lbl159
                    block85: while (true) {
                        v21 /* !! */  = (long)(v22 - u.mgt("nqd", nmg(int ), (int)42));
lbl159:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1091989190: {
                                break block85;
                            }
                            case -388439899: {
                                v22 = u.mgt("nqf", nmg(int ), (int)43);
                                continue block85;
                            }
                            case -154249202: {
                                v22 = u.mgt("nqg", nmg(int ), (int)44);
                                continue block85;
                            }
                            case 1272297626: {
                                v22 = u.mgt("nqh", nmg(int ), (int)45);
                                continue block85;
                            }
                        }
                        break;
                    }
                    if (z.isStaff(var5_8)) ** GOTO lbl180
                    if (var6_3 || var6_3) ** GOTO lbl25
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_7 = u.av - u.mgt("nqj", nmg(int ), (int)46)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == u.mgt("nqk", mgq(int ), (int)210)) break;
                        v23 /* !! */  = (long)u.mgt("nql", mgq(int ), (int)211);
                    }
                    var1_4.add(var5_8);
                    if (var6_3) ** GOTO lbl25
lbl180:
                    // 2 sources

                    if (var6_3 || var6_3) ** GOTO lbl25
                } while (!var8_1);
                throw null;
lbl183:
                // 2 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return var1_4;
            }
            case 0: {
                var7_2 /* !! */  = (int)u.mgt("nqn", mgq(int ), (int)212);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 1: {
                do {
                    var7_2 /* !! */  = (int)u.mgt("nqo", mgq(int ), (int)213);
                } while (!var8_1);
                throw null;
            }
            case 2: {
                var7_2 /* !! */  = (int)u.mgt("nqp", mgq(int ), (int)214);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 3: {
                var7_2 /* !! */  = (int)u.mgt("nqq", mgq(int ), (int)215);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl206:
            // 2 sources

            case 4: {
                var7_2 /* !! */  = (int)u.mgt("nqr", mgq(int ), (int)216);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl211:
            // 2 sources

            case 5: {
                var7_2 /* !! */  = (int)u.mgt("nqt", mgq(int ), (int)217);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl216:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)u.mgt("nqv", mgq(int ), (int)218);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 7: {
                var7_2 /* !! */  = (int)u.mgt("nqx", mgq(int ), (int)219);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 8: {
                var7_2 /* !! */  = (int)u.mgt("nqz", mgq(int ), (int)220);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 9: {
                do {
                    var7_2 /* !! */  = (int)u.mgt("nra", mgq(int ), (int)221);
                } while (!var8_1);
                throw null;
            }
lbl236:
            // 2 sources

            case 10: {
                var7_2 /* !! */  = (int)u.mgt("nrc", mgq(int ), (int)222);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl241:
            // 3 sources

            case 11: {
                var7_2 /* !! */  = (int)u.mgt("nre", mgq(int ), (int)223);
                if (!var8_1) ** GOTO lbl216
                throw null;
            }
lbl245:
            // 3 sources

            case 12: {
                var7_2 /* !! */  = (int)u.mgt("nrf", mgq(int ), (int)224);
                if (!var8_1) ** GOTO lbl206
                throw null;
            }
lbl249:
            // 4 sources

            case 13: {
                var7_2 /* !! */  = (int)u.mgt("nrh", mgq(int ), (int)225);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl254:
            // 4 sources

            case 14: {
                var7_2 /* !! */  = (int)u.mgt("nrj", mgq(int ), (int)226);
                if (!var8_1) ** GOTO lbl241
                throw null;
            }
lbl258:
            // 2 sources

            case 15: {
                var7_2 /* !! */  = (int)u.mgt("nrk", mgq(int ), (int)227);
                if (!var8_1) ** GOTO lbl211
                throw null;
            }
lbl262:
            // 2 sources

            case 16: {
                var7_2 /* !! */  = (int)u.mgt("nrl", mgq(int ), (int)228);
                if (!var8_1) ** GOTO lbl249
                throw null;
            }
lbl266:
            // 3 sources

            case 17: {
                var7_2 /* !! */  = (int)u.mgt("nrm", mgq(int ), (int)229);
                if (!var8_1) ** GOTO lbl249
                throw null;
            }
            case 18: {
                var7_2 /* !! */  = (int)u.mgt("nro", mgq(int ), (int)230);
                if (!var8_1) ** GOTO lbl254
                throw null;
            }
lbl274:
            // 2 sources

            case 19: {
                var7_2 /* !! */  = (int)u.mgt("nrp", mgq(int ), (int)231);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl279:
            // 2 sources

            case 20: {
                var7_2 /* !! */  = (int)u.mgt("nrq", mgq(int ), (int)232);
                if (var8_1) {
                    throw null;
                }
            }
lbl283:
            // 5 sources

            case 21: {
                var7_2 /* !! */  = (int)u.mgt("nrs", mgq(int ), (int)233);
                if (!var8_1) ** GOTO lbl266
                throw null;
            }
            case 22: {
                var7_2 /* !! */  = (int)u.mgt("nrt", mgq(int ), (int)234);
                if (!var8_1) ** GOTO lbl254
                throw null;
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)u.mgt("nrv", mgq(int ), (int)235);
                    if (!var8_1) ** GOTO lbl245
                    throw null;
                }
            }
            case 24: {
                var7_2 /* !! */  = (int)u.mgt("nrx", mgq(int ), (int)236);
                if (!var8_1) ** GOTO lbl254
                throw null;
            }
            case 25: 
        }
        var7_2 /* !! */  = (int)u.mgt("nrz", mgq(int ), (int)237);
        ** while (!var8_1)
lbl303:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ofr() {
        u.mgs[200] = -2079201716;
        u.mgs[201] = 430815840;
        u.mgs[202] = -842449956;
        u.mgs[203] = 1130243645;
        u.mgs[204] = 572589252;
        u.mgs[205] = 1105621520;
        u.mgs[206] = -1668546545;
        u.mgs[207] = -1746663168;
        u.mgs[208] = 1211721955;
        u.mgs[209] = -2128766388;
        u.mgs[210] = -77298423;
        u.mgs[211] = -1490571331;
        u.mgs[212] = -1709186518;
        u.mgs[213] = -373313560;
        u.mgs[214] = -1182487950;
        u.mgs[215] = 970787749;
        u.mgs[216] = 637469774;
        u.mgs[217] = 1589838443;
        u.mgs[218] = 519563549;
        u.mgs[219] = -131890104;
        u.mgs[220] = -261508705;
        u.mgs[221] = -171954768;
        u.mgs[222] = 518408827;
        u.mgs[223] = 1018422568;
        u.mgs[224] = 1814802026;
        u.mgs[225] = 286862162;
        u.mgs[226] = -752099328;
        u.mgs[227] = -275958508;
        u.mgs[228] = -221236422;
        u.mgs[229] = -1173921551;
        u.mgs[230] = -787622101;
        u.mgs[231] = 851039197;
        u.mgs[232] = -416331136;
        u.mgs[233] = -467806463;
        u.mgs[234] = 1214138819;
        u.mgs[235] = -933478577;
        u.mgs[236] = -893328272;
        u.mgs[237] = 867666143;
        u.mgs[238] = -534270861;
        u.mgs[239] = 271740575;
        u.mgs[240] = 1506072728;
        u.mgs[241] = -1405186154;
        u.mgs[242] = 1389010833;
        u.mgs[243] = 1966990228;
        u.mgs[244] = -1654041168;
        u.mgs[245] = -1675750511;
        u.mgs[246] = 423567419;
        u.mgs[247] = -1510769048;
        u.mgs[248] = -1646683049;
        u.mgs[249] = 607356314;
        u.mgs[250] = 596249450;
        u.mgs[251] = 1295519437;
        u.mgs[252] = 678372758;
        u.mgs[253] = -1099509780;
        u.mgs[254] = -272767834;
        u.mgs[255] = -897331010;
        u.mgs[256] = -1646273809;
        u.mgs[257] = 1248765408;
        u.mgs[258] = -1798709388;
        u.mgs[259] = -2117603509;
        u.mgs[260] = 966300220;
        u.mgs[261] = 402599491;
        u.mgs[262] = -411812221;
        u.mgs[263] = -446047525;
        u.mgs[264] = -861291694;
        u.mgs[265] = 1622619185;
        u.mgs[266] = 141620730;
        u.mgs[267] = -1625220213;
        u.mgs[268] = 804562945;
        u.mgs[269] = 975768272;
        u.mgs[270] = 2114701431;
        u.mgs[271] = 1613462624;
        u.mgs[272] = 2032752536;
        u.mgs[273] = -1969604713;
        u.mgs[274] = 1734148832;
        u.mgs[275] = 883048745;
        u.mgs[276] = -1492012648;
        u.mgs[277] = -67112178;
        u.mgs[278] = 1021439685;
        u.mgs[279] = 37877369;
        u.mgs[280] = -546530946;
        u.mgs[281] = 1757175082;
        u.mgs[282] = -1442553208;
        u.mgs[283] = 910142781;
        u.mgs[284] = 1469147112;
        u.mgs[285] = 1233601716;
        u.mgs[286] = 1238606866;
        u.mgs[287] = -1856282429;
        u.mgs[288] = 2027305737;
        u.mgs[289] = -1736745428;
        u.mgs[290] = -663122776;
        u.mgs[291] = 650219172;
        u.mgs[292] = 1737316700;
        u.mgs[293] = -1545273672;
        u.mgs[294] = -395495642;
        u.mgs[295] = 1692024953;
        u.mgs[296] = -342454647;
        u.mgs[297] = 237582707;
        u.mgs[298] = 2062717200;
        u.mgs[299] = 1968962449;
    }

    private static /* synthetic */ void oex() {
        u.mgr[200] = -2079201715;
        u.mgr[201] = -1675217474;
        u.mgr[202] = -842449955;
        u.mgr[203] = -989219632;
        u.mgr[204] = 572589253;
        u.mgr[205] = 86062485;
        u.mgr[206] = -1668546546;
        u.mgr[207] = -375129426;
        u.mgr[208] = 1211721954;
        u.mgr[209] = -529828345;
        u.mgr[210] = 77298422;
        u.mgr[211] = 759259670;
        u.mgr[212] = -1709186515;
        u.mgr[213] = -373313564;
        u.mgr[214] = -1182487944;
        u.mgr[215] = 970787758;
        u.mgr[216] = 637469760;
        u.mgr[217] = 1589838460;
        u.mgr[218] = 519563548;
        u.mgr[219] = -131890096;
        u.mgr[220] = -261508716;
        u.mgr[221] = -171954766;
        u.mgr[222] = 518408828;
        u.mgr[223] = 1018422590;
        u.mgr[224] = 1814802046;
        u.mgr[225] = 286862174;
        u.mgr[226] = -752099328;
        u.mgr[227] = -275958508;
        u.mgr[228] = -221236434;
        u.mgr[229] = -1173921541;
        u.mgr[230] = -787622112;
        u.mgr[231] = 851039184;
        u.mgr[232] = -416331125;
        u.mgr[233] = -467806454;
        u.mgr[234] = 1214138843;
        u.mgr[235] = -933478561;
        u.mgr[236] = -893328272;
        u.mgr[237] = 867666137;
        u.mgr[238] = 534270860;
        u.mgr[239] = -1494407220;
        u.mgr[240] = 1506072729;
        u.mgr[241] = -1949505545;
        u.mgr[242] = -1389010834;
        u.mgr[243] = 1646335923;
        u.mgr[244] = -1654041167;
        u.mgr[245] = -752585435;
        u.mgr[246] = -423567420;
        u.mgr[247] = -2616805;
        u.mgr[248] = 1646683048;
        u.mgr[249] = 208440256;
        u.mgr[250] = -596249451;
        u.mgr[251] = 1556308718;
        u.mgr[252] = -678372759;
        u.mgr[253] = 1977314820;
        u.mgr[254] = 272767833;
        u.mgr[255] = -127980704;
        u.mgr[256] = -1646273810;
        u.mgr[257] = 1276038901;
        u.mgr[258] = -1798709387;
        u.mgr[259] = -157051208;
        u.mgr[260] = 966300221;
        u.mgr[261] = -1596498880;
        u.mgr[262] = 411812220;
        u.mgr[263] = 364717124;
        u.mgr[264] = 861291693;
        u.mgr[265] = -1730525536;
        u.mgr[266] = 141620731;
        u.mgr[267] = -767118200;
        u.mgr[268] = -804562946;
        u.mgr[269] = 1128171487;
        u.mgr[270] = -2114701432;
        u.mgr[271] = -178548344;
        u.mgr[272] = 2032752537;
        u.mgr[273] = 2002776544;
        u.mgr[274] = -1734148833;
        u.mgr[275] = 1115760672;
        u.mgr[276] = 1492012647;
        u.mgr[277] = 535863391;
        u.mgr[278] = 1021439695;
        u.mgr[279] = 37877375;
        u.mgr[280] = -546530951;
        u.mgr[281] = 1757175075;
        u.mgr[282] = -1442553212;
        u.mgr[283] = 910142768;
        u.mgr[284] = 1469147119;
        u.mgr[285] = 1233601727;
        u.mgr[286] = 1238606875;
        u.mgr[287] = -1856282422;
        u.mgr[288] = 2027305740;
        u.mgr[289] = -1736745433;
        u.mgr[290] = -663122784;
        u.mgr[291] = 650219182;
        u.mgr[292] = 1737316701;
        u.mgr[293] = -315560113;
        u.mgr[294] = 395495641;
        u.mgr[295] = -1328264268;
        u.mgr[296] = -342454648;
        u.mgr[297] = -762127834;
        u.mgr[298] = -2062717201;
        u.mgr[299] = 1320474154;
    }

    private static /* synthetic */ void ofe() {
        u.mgr[300] = -1245773096;
        u.mgr[301] = 1041394399;
        u.mgr[302] = -1093840413;
        u.mgr[303] = 505832054;
        u.mgr[304] = 704602071;
        u.mgr[305] = 984292397;
        u.mgr[306] = 1016743006;
        u.mgr[307] = -1479459485;
        u.mgr[308] = 1569602654;
        u.mgr[309] = -1137427507;
        u.mgr[310] = -1114834650;
        u.mgr[311] = 250278548;
        u.mgr[312] = -1304666672;
        u.mgr[313] = 1339289229;
    }

    private static /* synthetic */ void oen() {
        u.mgr[0] = 1701458380;
        u.mgr[1] = -669961363;
        u.mgr[2] = 1980762463;
        u.mgr[3] = 2104561530;
        u.mgr[4] = 523604261;
        u.mgr[5] = -1906810112;
        u.mgr[6] = 1608066406;
        u.mgr[7] = 1037375269;
        u.mgr[8] = 610401656;
        u.mgr[9] = 1645635160;
        u.mgr[10] = 743055345;
        u.mgr[11] = -738609169;
        u.mgr[12] = -1275634250;
        u.mgr[13] = -1154977326;
        u.mgr[14] = 2072454228;
        u.mgr[15] = -1178209156;
        u.mgr[16] = 2012865303;
        u.mgr[17] = 248123690;
        u.mgr[18] = -961665872;
        u.mgr[19] = 1272347643;
        u.mgr[20] = -2063666671;
        u.mgr[21] = -1023019575;
        u.mgr[22] = 914658790;
        u.mgr[23] = -1821156054;
        u.mgr[24] = 2117670870;
        u.mgr[25] = 1490583163;
        u.mgr[26] = -1384927908;
        u.mgr[27] = -1284211298;
        u.mgr[28] = 771199024;
        u.mgr[29] = 2048926890;
        u.mgr[30] = 814567508;
        u.mgr[31] = 130814418;
        u.mgr[32] = 1197088156;
        u.mgr[33] = -1048096242;
        u.mgr[34] = -632157902;
        u.mgr[35] = 34710010;
        u.mgr[36] = -1966981802;
        u.mgr[37] = -2057944675;
        u.mgr[38] = -896354279;
        u.mgr[39] = 2147317904;
        u.mgr[40] = -1483279084;
        u.mgr[41] = 30599071;
        u.mgr[42] = -1890660762;
        u.mgr[43] = -1754428826;
        u.mgr[44] = -209665894;
        u.mgr[45] = -1883234621;
        u.mgr[46] = -451260382;
        u.mgr[47] = -880138757;
        u.mgr[48] = 764896660;
        u.mgr[49] = 787248922;
        u.mgr[50] = 1755638796;
        u.mgr[51] = 288491965;
        u.mgr[52] = -883708881;
        u.mgr[53] = 1456763678;
        u.mgr[54] = -2001872506;
        u.mgr[55] = -1959088124;
        u.mgr[56] = -910996303;
        u.mgr[57] = 1868764391;
        u.mgr[58] = 1044797731;
        u.mgr[59] = 579526476;
        u.mgr[60] = 1058897654;
        u.mgr[61] = 1964439997;
        u.mgr[62] = 1929315355;
        u.mgr[63] = 266525226;
        u.mgr[64] = 1182468581;
        u.mgr[65] = 2105636690;
        u.mgr[66] = -1749399592;
        u.mgr[67] = -1501117196;
        u.mgr[68] = -1445148225;
        u.mgr[69] = 645424605;
        u.mgr[70] = 1973465228;
        u.mgr[71] = -1791686799;
        u.mgr[72] = -1892160637;
        u.mgr[73] = 2057999957;
        u.mgr[74] = 1264185651;
        u.mgr[75] = -551825545;
        u.mgr[76] = 1953460770;
        u.mgr[77] = -1127079015;
        u.mgr[78] = -1921532168;
        u.mgr[79] = -836894520;
        u.mgr[80] = -447301588;
        u.mgr[81] = -2034298566;
        u.mgr[82] = 1076751526;
        u.mgr[83] = 1944657315;
        u.mgr[84] = 1859190271;
        u.mgr[85] = 505933303;
        u.mgr[86] = -1673171246;
        u.mgr[87] = 761466747;
        u.mgr[88] = -1846656595;
        u.mgr[89] = 634744055;
        u.mgr[90] = 804132993;
        u.mgr[91] = 1292882535;
        u.mgr[92] = -1859785731;
        u.mgr[93] = 1905863905;
        u.mgr[94] = -1209183604;
        u.mgr[95] = 847011581;
        u.mgr[96] = 1423182124;
        u.mgr[97] = -1110500591;
        u.mgr[98] = -1259990393;
        u.mgr[99] = -675453066;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 15[SWITCH]
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

    private static /* synthetic */ void oga() {
        u.nmi[0] = -5142338008654313099L;
        u.nmi[1] = -149072671684618640L;
        u.nmi[2] = -401324839543805770L;
        u.nmi[3] = -6654177340471017014L;
        u.nmi[4] = 791826189728921623L;
        u.nmi[5] = 6538711944051989532L;
        u.nmi[6] = 5930300625228822295L;
        u.nmi[7] = 3174083639491285086L;
        u.nmi[8] = -1048271985625416372L;
        u.nmi[9] = 5467614215793818375L;
        u.nmi[10] = -2998469010742481073L;
        u.nmi[11] = 3618133373853117829L;
        u.nmi[12] = -4634034860530829718L;
        u.nmi[13] = -776757817659146291L;
        u.nmi[14] = 6694139804544410007L;
        u.nmi[15] = 5216391005772258287L;
        u.nmi[16] = -4753024549436171322L;
        u.nmi[17] = -3585252499516005709L;
        u.nmi[18] = -5973700830608555403L;
        u.nmi[19] = -4809409314110639564L;
        u.nmi[20] = -2319400339504000283L;
        u.nmi[21] = -3549260585489594261L;
        u.nmi[22] = -5400615127323985341L;
        u.nmi[23] = 5307390164863530692L;
        u.nmi[24] = 2130824830917119457L;
        u.nmi[25] = 5758640241319625240L;
        u.nmi[26] = -3421154988041350847L;
        u.nmi[27] = -1272606649727322241L;
        u.nmi[28] = 4551242473554404986L;
        u.nmi[29] = -7954418806311970922L;
        u.nmi[30] = -8867149285403388547L;
        u.nmi[31] = 7112389031825053290L;
        u.nmi[32] = 7819608161029689299L;
        u.nmi[33] = -3134184702412722395L;
        u.nmi[34] = 2943632475895370391L;
        u.nmi[35] = -4332590435436669732L;
        u.nmi[36] = 4186043821048483359L;
        u.nmi[37] = 2799072784618231477L;
        u.nmi[38] = -4862517544755011600L;
        u.nmi[39] = 5422937874054440715L;
        u.nmi[40] = 8815904213658027935L;
        u.nmi[41] = 5814880199258805361L;
        u.nmi[42] = -7892772186120750349L;
        u.nmi[43] = -6426245640789005022L;
        u.nmi[44] = -420293152179992778L;
        u.nmi[45] = -7926159108421739817L;
        u.nmi[46] = 9101491567577284870L;
        u.nmi[47] = -8629853285622552941L;
        u.nmi[48] = -2517169547681532530L;
        u.nmi[49] = 3403226437688621426L;
        u.nmi[50] = 6236926840886029438L;
        u.nmi[51] = 3428982532531578538L;
        u.nmi[52] = 7834005167014800688L;
        u.nmi[53] = 1210366758643718178L;
        u.nmi[54] = 1922701923023917808L;
        u.nmi[55] = 4772875372382741079L;
        u.nmi[56] = 6922939487489601180L;
        u.nmi[57] = -2368921361100486138L;
        u.nmi[58] = 1943198135455710315L;
        u.nmi[59] = 5753631746872712292L;
        u.nmi[60] = -602221321460801867L;
        u.nmi[61] = 6314605484252359769L;
        u.nmi[62] = -502321839973906212L;
        u.nmi[63] = -2646325750715541108L;
        u.nmi[64] = 7868049542358812027L;
        u.nmi[65] = -8347508499788727247L;
        u.nmi[66] = -3462093217088239168L;
        u.nmi[67] = -4778527644348141300L;
        u.nmi[68] = 5595125471462440818L;
        u.nmi[69] = 5342868209994000240L;
        u.nmi[70] = 987017931310964336L;
        u.nmi[71] = 1942284568571639762L;
        u.nmi[72] = -1589958575712349321L;
        u.nmi[73] = -5949767980477397818L;
        u.nmi[74] = -7112293420539418440L;
        u.nmi[75] = 3663320103398873598L;
        u.nmi[76] = 677140161426323563L;
        u.nmi[77] = 6000066060528334454L;
        u.nmi[78] = -3873380352747203922L;
        u.nmi[79] = -4866670024481083246L;
        u.nmi[80] = -8216386540603027540L;
        u.nmi[81] = -758535716869664738L;
        u.nmi[82] = -7720943449159678827L;
        u.nmi[83] = -4158482678169993360L;
        u.nmi[84] = 9063446753707119422L;
        u.nmi[85] = -6174820625291832773L;
        u.nmi[86] = 3538859257864766167L;
        u.nmi[87] = 8798066873231742309L;
        u.nmi[88] = 8629810981986970271L;
        u.nmi[89] = -1692976764265665915L;
        u.nmi[90] = -7125933975722936046L;
        u.nmi[91] = 2963616092659490905L;
        u.nmi[92] = -8983591550818782733L;
        u.nmi[93] = -7523647857247468143L;
        u.nmi[94] = 8496337289777563083L;
        u.nmi[95] = -2225411852178956327L;
        u.nmi[96] = 8262182598575175231L;
        u.nmi[97] = 6759052939288884769L;
        u.nmi[98] = -9158120947628835617L;
        u.nmi[99] = 4200113477044585797L;
    }

    public static /* synthetic */ CallSite mgt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

