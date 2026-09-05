/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.g;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.mk;
import ruhack.phobia.mk$CoordinateEvent;
import ruhack.phobia.pp;

public final class fh
extends ds {
    private static int[] iizt = new int[136];
    public static final int b;
    private final mk client;
    static final long pt = 2121252299397338257L;
    public static final boolean c;
    private final ka coordinateBind;
    private static int[] iizv;
    private static long[] ijam;
    private final kb throwCoordinates;
    private static long[] ijal;
    public static final boolean a;

    private static /* synthetic */ void ijpm() {
        fh.iizt[0] = -1672217968;
        fh.iizt[1] = -1225537030;
        fh.iizt[2] = -1980224747;
        fh.iizt[3] = 1408902694;
        fh.iizt[4] = -526958753;
        fh.iizt[5] = -446404009;
        fh.iizt[6] = -117922186;
        fh.iizt[7] = -101282717;
        fh.iizt[8] = 1930908955;
        fh.iizt[9] = 1892310335;
        fh.iizt[10] = 1661846858;
        fh.iizt[11] = -1946918519;
        fh.iizt[12] = 355135826;
        fh.iizt[13] = 256396805;
        fh.iizt[14] = -1748152024;
        fh.iizt[15] = 1447095647;
        fh.iizt[16] = 1330451253;
        fh.iizt[17] = 477584476;
        fh.iizt[18] = -1500664095;
        fh.iizt[19] = -328820432;
        fh.iizt[20] = -642512846;
        fh.iizt[21] = 514358666;
        fh.iizt[22] = 364128682;
        fh.iizt[23] = -1754824180;
        fh.iizt[24] = 377494834;
        fh.iizt[25] = 919071767;
        fh.iizt[26] = 271112177;
        fh.iizt[27] = -2093574715;
        fh.iizt[28] = 996997017;
        fh.iizt[29] = -1698570056;
        fh.iizt[30] = 1783126168;
        fh.iizt[31] = 1226714576;
        fh.iizt[32] = 1822997729;
        fh.iizt[33] = -1839875767;
        fh.iizt[34] = 1375657193;
        fh.iizt[35] = -659040338;
        fh.iizt[36] = 1313745681;
        fh.iizt[37] = 1460706875;
        fh.iizt[38] = 1563364737;
        fh.iizt[39] = -1928933257;
        fh.iizt[40] = 1835151235;
        fh.iizt[41] = 1749849158;
        fh.iizt[42] = -878629191;
        fh.iizt[43] = -668813113;
        fh.iizt[44] = 805278971;
        fh.iizt[45] = 727714308;
        fh.iizt[46] = 1633461451;
        fh.iizt[47] = 444352847;
        fh.iizt[48] = 1572207844;
        fh.iizt[49] = 1243391269;
        fh.iizt[50] = 565939800;
        fh.iizt[51] = 2132796839;
        fh.iizt[52] = -751926589;
        fh.iizt[53] = -1183785832;
        fh.iizt[54] = -1296826985;
        fh.iizt[55] = 406086770;
        fh.iizt[56] = 436537482;
        fh.iizt[57] = -160317295;
        fh.iizt[58] = 1034132378;
        fh.iizt[59] = 82236936;
        fh.iizt[60] = 291175834;
        fh.iizt[61] = 510312693;
        fh.iizt[62] = 1586931633;
        fh.iizt[63] = -2047665860;
        fh.iizt[64] = -1795587755;
        fh.iizt[65] = -249458644;
        fh.iizt[66] = -359191559;
        fh.iizt[67] = -996368267;
        fh.iizt[68] = -1012749960;
        fh.iizt[69] = 1127783368;
        fh.iizt[70] = 1995954250;
        fh.iizt[71] = 708428666;
        fh.iizt[72] = -481397052;
        fh.iizt[73] = 437794029;
        fh.iizt[74] = -909596952;
        fh.iizt[75] = -1478835815;
        fh.iizt[76] = -54548561;
        fh.iizt[77] = -254809119;
        fh.iizt[78] = 743060566;
        fh.iizt[79] = -993548172;
        fh.iizt[80] = 397662046;
        fh.iizt[81] = 1348042128;
        fh.iizt[82] = -626429457;
        fh.iizt[83] = -106815839;
        fh.iizt[84] = 1746606830;
        fh.iizt[85] = 1152088675;
        fh.iizt[86] = 219125156;
        fh.iizt[87] = 1904331089;
        fh.iizt[88] = -1159976658;
        fh.iizt[89] = 634935563;
        fh.iizt[90] = 1282302622;
        fh.iizt[91] = -1982113665;
        fh.iizt[92] = 342297837;
        fh.iizt[93] = -1201670086;
        fh.iizt[94] = 1741031526;
        fh.iizt[95] = -157493878;
        fh.iizt[96] = -754784223;
        fh.iizt[97] = -1732968868;
        fh.iizt[98] = 544596692;
        fh.iizt[99] = 1219244567;
    }

    private static /* synthetic */ void ijpn() {
        fh.iizt[100] = -2033640175;
        fh.iizt[101] = -524771168;
        fh.iizt[102] = 436435666;
        fh.iizt[103] = -534650318;
        fh.iizt[104] = 864298707;
        fh.iizt[105] = -87181390;
        fh.iizt[106] = 1073633194;
        fh.iizt[107] = 1623525880;
        fh.iizt[108] = 724443696;
        fh.iizt[109] = -1703252014;
        fh.iizt[110] = -313162531;
        fh.iizt[111] = 707410287;
        fh.iizt[112] = -1801248070;
        fh.iizt[113] = -1590882156;
        fh.iizt[114] = 2139266521;
        fh.iizt[115] = 1886202424;
        fh.iizt[116] = -1707605684;
        fh.iizt[117] = 2125683538;
        fh.iizt[118] = 423416563;
        fh.iizt[119] = 1544190828;
        fh.iizt[120] = -462344210;
        fh.iizt[121] = 962948976;
        fh.iizt[122] = 2048901076;
        fh.iizt[123] = -1103765594;
        fh.iizt[124] = 916656815;
        fh.iizt[125] = 1935701583;
        fh.iizt[126] = 228005902;
        fh.iizt[127] = 837719578;
        fh.iizt[128] = 139271889;
        fh.iizt[129] = 1866965220;
        fh.iizt[130] = -624664385;
        fh.iizt[131] = 1353316356;
        fh.iizt[132] = 119807309;
        fh.iizt[133] = -578498754;
        fh.iizt[134] = 1726773305;
        fh.iizt[135] = 888433546;
    }

    private static /* synthetic */ int iizs(int n2) {
        return iizt[n2] ^ iizv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void showCoordinates(mk$CoordinateEvent var1_1) {
        v0 /* !! */  = fh.pt;
        if (true) ** GOTO lbl5
        block91: while (true) {
            v0 /* !! */  = (long)(v1 - fh.iizw("ijko", ijak(int ), (int)85));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -65332132: {
                    v1 = fh.iizw("ijkp", ijak(int ), (int)86);
                    continue block91;
                }
                case 648543728: {
                    v1 = fh.iizw("ijkq", ijak(int ), (int)87);
                    continue block91;
                }
                case 948901009: {
                    break block91;
                }
                case 1560103418: {
                    v1 = fh.iizw("ijkr", ijak(int ), (int)88);
                    continue block91;
                }
            }
            break;
        }
        var7_2 = fh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fh.pt - fh.iizw("ijks", ijak(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fh.iizw("ijkt", iizs(int ), (int)78)) break;
            v2 /* !! */  = (long)fh.iizw("ijku", iizs(int ), (int)79);
        }
        var6_3 /* !! */  = fh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fh.pt - fh.iizw("ijkv", ijak(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fh.iizw("ijkw", iizs(int ), (int)80)) break;
            v3 /* !! */  = (long)fh.iizw("ijkx", iizs(int ), (int)81);
        }
        var5_4 = fh.a;
        if (var7_2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fh.pt - fh.iizw("ijky", ijak(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fh.iizw("ijkz", iizs(int ), (int)82)) break;
            v4 /* !! */  = (long)fh.iizw("ijla", iizs(int ), (int)83);
        }
        v5 = g.getInstance();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = fh.pt - fh.iizw("ijlb", ijak(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == fh.iizw("ijlc", iizs(int ), (int)84)) break;
            v6 /* !! */  = (long)fh.iizw("ijld", iizs(int ), (int)85);
        }
        var2_5 = v5.getPrefix();
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = fh.pt - fh.iizw("ijle", ijak(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == fh.iizw("ijlf", iizs(int ), (int)86)) break;
            v7 /* !! */  = (long)fh.iizw("ijlg", iizs(int ), (int)87);
        }
        v8 = var1_1.x();
        v9 /* !! */  = fh.pt;
        if (true) ** GOTO lbl58
        block98: while (true) {
            v9 /* !! */  = (long)(v10 - fh.iizw("ijlh", ijak(int ), (int)94));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -635132096: {
                    v10 = fh.iizw("ijli", ijak(int ), (int)95);
                    continue block98;
                }
                case 657144631: {
                    v10 = fh.iizw("ijlj", ijak(int ), (int)96);
                    continue block98;
                }
                case 768306515: {
                    v10 = fh.iizw("ijlk", ijak(int ), (int)97);
                    continue block98;
                }
                case 948901009: {
                    break block98;
                }
            }
            break;
        }
        v11 = var1_1.z();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = fh.pt - fh.iizw("ijll", ijak(int ), (int)98)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == fh.iizw("ijlm", iizs(int ), (int)88)) break;
            v12 /* !! */  = (long)fh.iizw("ijln", iizs(int ), (int)89);
        }
        var3_6 = var2_5 + "gps " + v8 + " " + v11;
        if (var5_4) ** GOTO lbl32
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl32
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = fh.pt - fh.iizw("ijlo", ijak(int ), (int)99)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fh.iizw("ijlp", iizs(int ), (int)90)) break;
                    v13 /* !! */  = (long)fh.iizw("ijlq", iizs(int ), (int)91);
                }
                v14 = class_2561.method_43470((String)"Party:");
                v15 /* !! */  = fh.pt;
                if (true) ** GOTO lbl92
                block101: while (true) {
                    v15 /* !! */  = (long)(v16 - fh.iizw("ijlr", ijak(int ), (int)100));
lbl92:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -534110312: {
                            v16 = fh.iizw("ijls", ijak(int ), (int)101);
                            continue block101;
                        }
                        case 501865922: {
                            v16 = fh.iizw("ijlt", ijak(int ), (int)102);
                            continue block101;
                        }
                        case 948901009: {
                            break block101;
                        }
                    }
                    break;
                }
                v17 /* !! */  = fh.pt;
                if (true) ** GOTO lbl105
                block102: while (true) {
                    v17 /* !! */  = (long)(v18 - fh.iizw("ijlu", ijak(int ), (int)103));
lbl105:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -122825156: {
                            v18 = fh.iizw("ijlv", ijak(int ), (int)104);
                            continue block102;
                        }
                        case 948901009: {
                            break block102;
                        }
                        case 2007543754: {
                            v18 = fh.iizw("ijlw", ijak(int ), (int)105);
                            continue block102;
                        }
                    }
                    break;
                }
                v19 = v14.method_27692(class_124.field_1080);
                v20 /* !! */  = fh.pt;
                if (true) ** GOTO lbl119
                block103: while (true) {
                    v20 /* !! */  = (long)(v21 - fh.iizw("ijlx", ijak(int ), (int)106));
lbl119:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -732664501: {
                            v21 = fh.iizw("ijly", ijak(int ), (int)107);
                            continue block103;
                        }
                        case -469778687: {
                            v21 = fh.iizw("ijlz", ijak(int ), (int)108);
                            continue block103;
                        }
                        case 948901009: {
                            break block103;
                        }
                        case 1778050285: {
                            v21 = fh.iizw("ijma", ijak(int ), (int)109);
                            continue block103;
                        }
                    }
                    break;
                }
                v22 = var1_1.login();
                v23 /* !! */  = fh.pt;
                if (true) ** GOTO lbl136
                block104: while (true) {
                    v23 /* !! */  = (long)(fh.iizw("ijmc", ijak(int ), (int)111) - fh.iizw("ijmb", ijak(int ), (int)110));
lbl136:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 610667635: {
                            continue block104;
                        }
                        case 948901009: {
                            break block104;
                        }
                    }
                    break;
                }
                v24 = class_2561.method_43470((String)v22);
                v25 /* !! */  = fh.pt;
                if (true) ** GOTO lbl146
                block105: while (true) {
                    v25 /* !! */  = (long)(v26 - fh.iizw("ijmd", ijak(int ), (int)112));
lbl146:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1535714781: {
                            v26 = fh.iizw("ijme", ijak(int ), (int)113);
                            continue block105;
                        }
                        case -544735907: {
                            v26 = fh.iizw("ijmf", ijak(int ), (int)114);
                            continue block105;
                        }
                        case 948901009: {
                            break block105;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = fh.pt - fh.iizw("ijmg", ijak(int ), (int)115)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fh.iizw("ijmh", iizs(int ), (int)92)) break;
                    v27 /* !! */  = (long)fh.iizw("ijmi", iizs(int ), (int)93);
                }
                v28 = v24.method_27692(class_124.field_1068);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_8 = fh.pt - fh.iizw("ijmj", ijak(int ), (int)116)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == fh.iizw("ijmk", iizs(int ), (int)94)) break;
                    v29 /* !! */  = (long)fh.iizw("ijml", iizs(int ), (int)95);
                }
                v30 = v19.method_10852((class_2561)v28);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_9 = fh.pt - fh.iizw("ijmm", ijak(int ), (int)117)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == fh.iizw("ijmn", iizs(int ), (int)96)) break;
                    v31 /* !! */  = (long)fh.iizw("ijmo", iizs(int ), (int)97);
                }
                v32 = class_2561.method_43470((String)" \u043f\u0440\u043e\u0441\u0438\u0442 \u043f\u043e\u043c\u043e\u0449\u044c \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ");
                v33 /* !! */  = fh.pt;
                if (true) ** GOTO lbl177
                block109: while (true) {
                    v33 /* !! */  = (long)(v34 - fh.iizw("ijmp", ijak(int ), (int)118));
lbl177:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1110506084: {
                            v34 = fh.iizw("ijmq", ijak(int ), (int)119);
                            continue block109;
                        }
                        case -338085143: {
                            v34 = fh.iizw("ijmr", ijak(int ), (int)120);
                            continue block109;
                        }
                        case 948901009: {
                            break block109;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_10 = fh.pt - fh.iizw("ijms", ijak(int ), (int)121)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == fh.iizw("ijmt", iizs(int ), (int)98)) break;
                    v35 /* !! */  = (long)fh.iizw("ijmu", iizs(int ), (int)99);
                }
                v36 = v32.method_27692(class_124.field_1080);
                v37 /* !! */  = fh.pt;
                if (true) ** GOTO lbl196
                block111: while (true) {
                    v37 /* !! */  = (long)(fh.iizw("ijmw", ijak(int ), (int)123) - fh.iizw("ijmv", ijak(int ), (int)122));
lbl196:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -498726051: {
                            continue block111;
                        }
                        case 948901009: {
                            break block111;
                        }
                    }
                    break;
                }
                v38 = v30.method_10852((class_2561)v36);
                v39 /* !! */  = fh.pt;
                if (true) ** GOTO lbl206
                block112: while (true) {
                    v39 /* !! */  = (long)(v40 - fh.iizw("ijmx", ijak(int ), (int)124));
lbl206:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -898048420: {
                            v40 = fh.iizw("ijmy", ijak(int ), (int)125);
                            continue block112;
                        }
                        case -424117014: {
                            v40 = fh.iizw("ijmz", ijak(int ), (int)126);
                            continue block112;
                        }
                        case 948901009: {
                            break block112;
                        }
                        case 1917833711: {
                            v40 = fh.iizw("ijna", ijak(int ), (int)127);
                            continue block112;
                        }
                    }
                    break;
                }
                v41 = var1_1.x();
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_11 = fh.pt - fh.iizw("ijnb", ijak(int ), (int)128)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == fh.iizw("ijnc", iizs(int ), (int)100)) break;
                    v42 /* !! */  = (long)fh.iizw("ijnd", iizs(int ), (int)101);
                }
                v43 = var1_1.y();
                v44 /* !! */  = fh.pt;
                if (true) ** GOTO lbl229
                block114: while (true) {
                    v44 /* !! */  = (long)(v45 - fh.iizw("ijne", ijak(int ), (int)129));
lbl229:
                    // 2 sources

                    switch ((int)v44 /* !! */ ) {
                        case -919121269: {
                            v45 = fh.iizw("ijnf", ijak(int ), (int)130);
                            continue block114;
                        }
                        case 948901009: {
                            break block114;
                        }
                        case 1125097113: {
                            v45 = fh.iizw("ijng", ijak(int ), (int)131);
                            continue block114;
                        }
                    }
                    break;
                }
                v46 = var1_1.z();
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_12 = fh.pt - fh.iizw("ijnh", ijak(int ), (int)132)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == fh.iizw("ijni", iizs(int ), (int)102)) break;
                    v47 /* !! */  = (long)fh.iizw("ijnj", iizs(int ), (int)103);
                }
                v48 = v41 + " " + v43 + " " + v46;
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_13 = fh.pt - fh.iizw("ijnk", ijak(int ), (int)133)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == fh.iizw("ijnl", iizs(int ), (int)104)) break;
                    v49 /* !! */  = (long)fh.iizw("ijnm", iizs(int ), (int)105);
                }
                v50 = class_2561.method_43470((String)v48);
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_14 = fh.pt - fh.iizw("ijnn", ijak(int ), (int)134)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == fh.iizw("ijno", iizs(int ), (int)106)) break;
                    v51 /* !! */  = (long)fh.iizw("ijnp", iizs(int ), (int)107);
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_15 = fh.pt - fh.iizw("ijnq", ijak(int ), (int)135)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == fh.iizw("ijnr", iizs(int ), (int)108)) break;
                    v52 /* !! */  = (long)fh.iizw("ijns", iizs(int ), (int)109);
                }
                v53 = v50.method_27692(class_124.field_1068);
                v54 /* !! */  = fh.pt;
                if (true) ** GOTO lbl266
                block119: while (true) {
                    v54 /* !! */  = (long)(fh.iizw("ijnu", ijak(int ), (int)137) - fh.iizw("ijnt", ijak(int ), (int)136));
lbl266:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -888716544: {
                            continue block119;
                        }
                        case 948901009: {
                            break block119;
                        }
                    }
                    break;
                }
                v55 = v38.method_10852((class_2561)v53);
                v56 /* !! */  = fh.pt;
                if (true) ** GOTO lbl276
                block120: while (true) {
                    v56 /* !! */  = (long)(fh.iizw("ijnw", ijak(int ), (int)139) - fh.iizw("ijnv", ijak(int ), (int)138));
lbl276:
                    // 2 sources

                    switch ((int)v56 /* !! */ ) {
                        case 148726302: {
                            continue block120;
                        }
                        case 948901009: {
                            break block120;
                        }
                    }
                    break;
                }
                v57 = class_2561.method_43470((String)" [\u041f\u043e\u0441\u0442\u0430\u0432\u0438\u0442\u044c GPS]");
                while (true) {
                    if ((v58 /* !! */  = (cfr_temp_16 = fh.pt - fh.iizw("ijnx", ijak(int ), (int)140)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v58 /* !! */  == fh.iizw("ijny", iizs(int ), (int)110)) break;
                    v58 /* !! */  = (long)fh.iizw("ijnz", iizs(int ), (int)111);
                }
                while (true) {
                    if ((v59 /* !! */  = (cfr_temp_17 = fh.pt - fh.iizw("ijoa", ijak(int ), (int)141)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v59 /* !! */  == fh.iizw("ijob", iizs(int ), (int)112)) break;
                    v59 /* !! */  = (long)fh.iizw("ijoc", iizs(int ), (int)113);
                }
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_18 = fh.pt - fh.iizw("ijod", ijak(int ), (int)142)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == fh.iizw("ijoe", iizs(int ), (int)114)) break;
                    v60 /* !! */  = (long)fh.iizw("ijof", iizs(int ), (int)115);
                }
                v61 = class_2583.field_24360.method_10977(class_124.field_1060);
                while (true) {
                    if ((v62 /* !! */  = (cfr_temp_19 = fh.pt - fh.iizw("ijog", ijak(int ), (int)143)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v62 /* !! */  == fh.iizw("ijoh", iizs(int ), (int)116)) break;
                    v62 /* !! */  = (long)fh.iizw("ijoi", iizs(int ), (int)117);
                }
                while (true) {
                    if ((v63 /* !! */  = (cfr_temp_20 = fh.pt - fh.iizw("ijoj", ijak(int ), (int)144)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v63 /* !! */  == fh.iizw("ijok", iizs(int ), (int)118)) break;
                    v63 /* !! */  = (long)fh.iizw("ijol", iizs(int ), (int)119);
                }
                v64 = new class_2558.class_10609(var3_6);
                v65 /* !! */  = fh.pt;
                if (true) ** GOTO lbl313
                block126: while (true) {
                    v65 /* !! */  = (long)(v66 - fh.iizw("ijom", ijak(int ), (int)145));
lbl313:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -427310479: {
                            v66 = fh.iizw("ijon", ijak(int ), (int)146);
                            continue block126;
                        }
                        case 74698172: {
                            v66 = fh.iizw("ijoo", ijak(int ), (int)147);
                            continue block126;
                        }
                        case 181402340: {
                            v66 = fh.iizw("ijop", ijak(int ), (int)148);
                            continue block126;
                        }
                        case 948901009: {
                            break block126;
                        }
                    }
                    break;
                }
                v67 = v61.method_10958((class_2558)v64);
                v68 /* !! */  = fh.pt;
                if (true) ** GOTO lbl330
                block127: while (true) {
                    v68 /* !! */  = (long)(v69 - fh.iizw("ijoq", ijak(int ), (int)149));
lbl330:
                    // 2 sources

                    switch ((int)v68 /* !! */ ) {
                        case -1768899367: {
                            v69 = fh.iizw("ijor", ijak(int ), (int)150);
                            continue block127;
                        }
                        case -195307478: {
                            v69 = fh.iizw("ijos", ijak(int ), (int)151);
                            continue block127;
                        }
                        case 948901009: {
                            break block127;
                        }
                        case 1429169939: {
                            v69 = fh.iizw("ijot", ijak(int ), (int)152);
                            continue block127;
                        }
                    }
                    break;
                }
                v70 = v57.method_10862(v67);
                while (true) {
                    if ((v71 /* !! */  = (cfr_temp_21 = fh.pt - fh.iizw("ijou", ijak(int ), (int)153)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v71 /* !! */  == fh.iizw("ijov", iizs(int ), (int)120)) break;
                    v71 /* !! */  = (long)fh.iizw("ijow", iizs(int ), (int)121);
                }
                var4_7 = v55.method_10852((class_2561)v70);
                if (var5_4 || var5_4) ** GOTO lbl32
                while (true) {
                    if ((v72 /* !! */  = (cfr_temp_22 = fh.pt - fh.iizw("ijox", ijak(int ), (int)154)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v72 /* !! */  == fh.iizw("ijoy", iizs(int ), (int)122)) break;
                    v72 /* !! */  = (long)fh.iizw("ijoz", iizs(int ), (int)123);
                }
                pp.brandmessage((class_2561)var4_7);
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
lbl359:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)fh.iizw("ijpa", iizs(int ), (int)124);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 1: {
                var6_3 /* !! */  = (int)fh.iizw("ijpb", iizs(int ), (int)125);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 2: {
                var6_3 /* !! */  = (int)fh.iizw("ijpc", iizs(int ), (int)126);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl374:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)fh.iizw("ijpd", iizs(int ), (int)127);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 4: {
                var6_3 /* !! */  = (int)fh.iizw("ijpe", iizs(int ), (int)128);
                if (!var7_2) ** GOTO lbl359
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)fh.iizw("ijpf", iizs(int ), (int)129);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl398
                    break;
                }
            }
lbl389:
            // 4 sources

            case 6: {
                var6_3 /* !! */  = (int)fh.iizw("ijpg", iizs(int ), (int)130);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 7: {
                var6_3 /* !! */  = (int)fh.iizw("ijph", iizs(int ), (int)131);
                if (!var7_2) break;
                throw null;
            }
lbl398:
            // 4 sources

            case 8: {
                do {
                    var6_3 /* !! */  = (int)fh.iizw("ijpi", iizs(int ), (int)132);
                } while (!var7_2);
                throw null;
            }
lbl403:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)fh.iizw("ijpj", iizs(int ), (int)133);
                if (!var7_2) ** GOTO lbl374
                throw null;
            }
            case 10: {
                var6_3 /* !! */  = (int)fh.iizw("ijpk", iizs(int ), (int)134);
                if (!var7_2) ** GOTO lbl398
                throw null;
            }
            case 11: 
        }
        var6_3 /* !! */  = (int)fh.iizw("ijpl", iizs(int ), (int)135);
        ** while (!var7_2)
lbl414:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fh() {
        var2_1 /* !! */  = fh.b;
        super("PartyHelper", "\u041f\u043e\u043c\u043e\u0449\u043d\u0438\u043a \u0443\u0447\u0430\u0441\u0442\u043d\u0438\u043a\u043e\u0432 IRC Party", du.MISC);
        this.throwCoordinates = new kb("\u0412\u044b\u0431\u0440\u043e\u0441 \u043a\u043e\u0440\u0434", "\u041e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u0443\u0447\u0430\u0441\u0442\u043d\u0438\u043a\u0430\u043c Party \u0442\u0435\u043a\u0443\u0449\u0438\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b").setValue((boolean)fh.iizw("iizx", iizs(int ), (int)0));
        this.coordinateBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0432\u044b\u0431\u0440\u043e\u0441\u0430 \u043a\u043e\u0440\u0434", "\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u0442\u044c \u0443\u0447\u0430\u0441\u0442\u043d\u0438\u043a\u0430\u043c Party \u0442\u0435\u043a\u0443\u0449\u0438\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
        this.client = mk.INSTANCE;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.throwCoordinates, this.coordinateBind});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fh.iizw("ijaa", iizs(int ), (int)1);
                ** GOTO lbl17
            }
            case 1: {
                var2_1 /* !! */  = (int)fh.iizw("ijab", iizs(int ), (int)2);
                ** GOTO lbl19
            }
lbl17:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fh.iizw("ijac", iizs(int ), (int)3);
            }
lbl19:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fh.iizw("ijae", iizs(int ), (int)4);
                    break block0;
                    break;
                }
            }
lbl23:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)fh.iizw("ijaf", iizs(int ), (int)5);
            }
            case 5: {
                var2_1 /* !! */  = (int)fh.iizw("ijag", iizs(int ), (int)6);
                ** GOTO lbl23
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)fh.iizw("ijai", iizs(int ), (int)7);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(df var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = fh.pt - fh.iizw("ijit", ijak(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fh.iizw("ijiu", iizs(int ), (int)56)) break;
            v0 /* !! */  = (long)fh.iizw("ijiv", iizs(int ), (int)57);
        }
        var5_2 = fh.c;
        while (true) {
            block60: {
                if ((v1 /* !! */  = (cfr_temp_2 = fh.pt - fh.iizw("ijiw", ijak(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != fh.iizw("ijix", iizs(int ), (int)58)) break block60;
                var4_3 /* !! */  = fh.b;
                if (var4_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)fh.iizw("ijiy", iizs(int ), (int)59);
        }
        cfr_temp_0 = -2147483648;
        block34: while (true) {
            block61: {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v2 /* !! */  = fh.pt;
                        block35: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case -287689408: {
                                    v3 = fh.iizw("ijjb", ijak(int ), (int)71);
                                    ** GOTO lbl32
                                }
                                case 251261117: {
                                    v3 = fh.iizw("ijjc", ijak(int ), (int)72);
                                    ** GOTO lbl32
                                }
                                case 586145290: {
                                    v3 = fh.iizw("ijjd", ijak(int ), (int)73);
lbl32:
                                    // 3 sources

                                    v2 /* !! */  = (long)(v3 - fh.iizw("ijja", ijak(int ), (int)70));
                                    continue block35;
                                }
                                case 948901009: {
                                    break block35;
                                }
                            }
                            break;
                        }
                        var3_4 = fh.a;
                        if (var5_2) {
                            throw null;
                        }
                        if (var3_4) return;
lbl40:
                        // 3 sources

                        while (!var3_4 && !var3_4) {
                            v4 /* !! */  = fh.pt;
                            block37: while (true) {
                                switch ((int)v4 /* !! */ ) {
                                    case -1954700092: {
                                        v5 = fh.iizw("ijjf", ijak(int ), (int)75);
                                        ** GOTO lbl52
                                    }
                                    case -1100266360: {
                                        v5 = fh.iizw("ijjg", ijak(int ), (int)76);
                                        ** GOTO lbl52
                                    }
                                    case 31437434: {
                                        v5 = fh.iizw("ijji", ijak(int ), (int)77);
lbl52:
                                        // 3 sources

                                        v4 /* !! */  = (long)(v5 - fh.iizw("ijje", ijak(int ), (int)74));
                                        continue block37;
                                    }
                                    case 948901009: {
                                        break block37;
                                    }
                                }
                                break;
                            }
                            while (true) {
                                if ((v6 /* !! */  = (cfr_temp_3 = fh.pt - fh.iizw("ijjj", ijak(int ), (int)78)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                if (v6 /* !! */  != fh.iizw("ijjk", iizs(int ), (int)60)) ** GOTO lbl63
                                var2_5 = this.client.pollCoordinateEvent();
                                if (var2_5 != null) {
                                    break;
                                }
                                ** GOTO lbl68
lbl63:
                                // 1 sources

                                v6 /* !! */  = (long)fh.iizw("ijjl", iizs(int ), (int)61);
                            }
                            if (var3_4 || var3_4) return;
                            v7 /* !! */  = fh.pt;
                            if (true) ** GOTO lbl95
lbl68:
                            // 1 sources

                            if (var3_4 || var3_4) return;
                            return;
                        }
                        return;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)fh.iizw("ijjy", iizs(int ), (int)66);
                        cfr_temp_0 = 8;
                        if (var5_2) {
                            throw null;
                        }
                        break block61;
                    }
                    case 4: {
                        do {
                            var4_3 /* !! */  = (int)fh.iizw("ijkc", iizs(int ), (int)70);
                        } while (!var5_2);
                        throw null;
                    }
                    case 10: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkj", iizs(int ), (int)76);
                        cfr_temp_0 = 5;
                        if (var5_2) {
                            throw null;
                        }
                        break block61;
                    }
                    case 11: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkk", iizs(int ), (int)77);
                        if (var5_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    block40: while (true) {
                        v7 /* !! */  = (long)(v8 - fh.iizw("ijjm", ijak(int ), (int)79));
lbl95:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case 182613219: {
                                v8 = fh.iizw("ijjo", ijak(int ), (int)80);
                                continue block40;
                            }
                            case 948901009: {
                                break block40;
                            }
                            case 967686644: {
                                v8 = fh.iizw("ijjp", ijak(int ), (int)81);
                                continue block40;
                            }
                            case 1803660129: {
                                v8 = fh.iizw("ijjq", ijak(int ), (int)82);
                                continue block40;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = fh.pt - fh.iizw("ijjr", ijak(int ), (int)83)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  != fh.iizw("ijjs", iizs(int ), (int)62)) ** GOTO lbl112
                        if (!this.throwCoordinates.isValue()) ** GOTO lbl40
                        break;
lbl112:
                        // 1 sources

                        v9 /* !! */  = (long)fh.iizw("ijjt", iizs(int ), (int)63);
                    }
                    if (var3_4) return;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = fh.pt - fh.iizw("ijju", ijak(int ), (int)84)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == fh.iizw("ijjv", iizs(int ), (int)64)) {
                            this.showCoordinates(var2_5);
                            if (var3_4) return;
                            break;
                        }
                        v10 /* !! */  = (long)fh.iizw("ijjw", iizs(int ), (int)65);
                    }
                    if (!var5_2) ** GOTO lbl40
                    throw null;
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var4_3 /* !! */  = (int)fh.iizw("ijjz", iizs(int ), (int)67);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkg", iizs(int ), (int)73);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)fh.iizw("ijka", iizs(int ), (int)68);
                        cfr_temp_0 = 1;
                        if (var5_2) {
                            throw null;
                        }
                        break block61;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkb", iizs(int ), (int)69);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkd", iizs(int ), (int)71);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)fh.iizw("ijke", iizs(int ), (int)72);
                        cfr_temp_0 = 3;
                        if (var5_2) {
                            throw null;
                        }
                        break block61;
                    }
                    case 8: {
                        var4_3 /* !! */  = (int)fh.iizw("ijkh", iizs(int ), (int)74);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl162
            }
            do {
                if (true) continue block34;
lbl162:
                // 2 sources

                var4_3 /* !! */  = (int)fh.iizw("ijki", iizs(int ), (int)75);
                cfr_temp_0 = 8;
            } while (!var5_2);
            break;
        }
        throw null;
    }

    static {
        iizv = new int[136];
        fh.ijpm();
        fh.ijpn();
        fh.ijpo();
        fh.ijpp();
        ijal = new long[155];
        ijam = new long[155];
        fh.ijpq();
        fh.ijpr();
        fh.ijps();
        fh.ijpt();
    }

    private static /* synthetic */ void ijps() {
        fh.ijam[0] = 4903171695532156590L;
        fh.ijam[1] = 6530930124211726832L;
        fh.ijam[2] = 7156769180719086710L;
        fh.ijam[3] = -2946585075691023505L;
        fh.ijam[4] = -3369845582169848015L;
        fh.ijam[5] = 6640203749033021850L;
        fh.ijam[6] = -4956750584404206074L;
        fh.ijam[7] = -5813859842358860698L;
        fh.ijam[8] = 2847543656347698560L;
        fh.ijam[9] = -4760233225795955612L;
        fh.ijam[10] = 7990168883131152786L;
        fh.ijam[11] = -6208003539647547798L;
        fh.ijam[12] = -9137730339556420645L;
        fh.ijam[13] = 3961239972065595948L;
        fh.ijam[14] = -1872440514529399150L;
        fh.ijam[15] = -3562157868229348655L;
        fh.ijam[16] = 8650024996219504672L;
        fh.ijam[17] = 6023258102578614591L;
        fh.ijam[18] = 7316467209430250546L;
        fh.ijam[19] = 6336510997313169308L;
        fh.ijam[20] = -5054207486061669166L;
        fh.ijam[21] = 2554570119917318161L;
        fh.ijam[22] = 120334169949293707L;
        fh.ijam[23] = -1394380338385183441L;
        fh.ijam[24] = 7701317830172841211L;
        fh.ijam[25] = -3967384765101637968L;
        fh.ijam[26] = 7800418586996948774L;
        fh.ijam[27] = -4374775616792617871L;
        fh.ijam[28] = 2702573492853585383L;
        fh.ijam[29] = 6163562482661123491L;
        fh.ijam[30] = 3163869518021518405L;
        fh.ijam[31] = -767880591583880375L;
        fh.ijam[32] = 5152994482854482434L;
        fh.ijam[33] = -8928816491478041342L;
        fh.ijam[34] = 1880756053744652354L;
        fh.ijam[35] = 3067734423845298842L;
        fh.ijam[36] = -3534442794716604920L;
        fh.ijam[37] = -821541412510669809L;
        fh.ijam[38] = 4587150277961324892L;
        fh.ijam[39] = 917626494251147001L;
        fh.ijam[40] = 6941915815987079862L;
        fh.ijam[41] = 5682381347853538889L;
        fh.ijam[42] = -4390751022624670728L;
        fh.ijam[43] = 4851083040936265932L;
        fh.ijam[44] = 4809899802634291102L;
        fh.ijam[45] = -1709848531176731269L;
        fh.ijam[46] = -8204447101787932877L;
        fh.ijam[47] = -8424206514473459440L;
        fh.ijam[48] = -2534514010413499130L;
        fh.ijam[49] = -2210985360959555364L;
        fh.ijam[50] = 3459046177818187038L;
        fh.ijam[51] = -4382020513886232214L;
        fh.ijam[52] = 7082572811133523260L;
        fh.ijam[53] = -2111790719984049160L;
        fh.ijam[54] = -5446355762414428112L;
        fh.ijam[55] = -1700231888823441656L;
        fh.ijam[56] = -3312163777746367335L;
        fh.ijam[57] = -2346320846301778158L;
        fh.ijam[58] = -2862711135603461011L;
        fh.ijam[59] = 180183747013147546L;
        fh.ijam[60] = -212136865793762608L;
        fh.ijam[61] = -8107093527741870703L;
        fh.ijam[62] = 1749392035081419852L;
        fh.ijam[63] = -3575298036723250388L;
        fh.ijam[64] = 2677046841663418235L;
        fh.ijam[65] = 9191258517688797726L;
        fh.ijam[66] = -2137378509309133575L;
        fh.ijam[67] = 828998803214359110L;
        fh.ijam[68] = -963926522136552244L;
        fh.ijam[69] = 8846870124725102555L;
        fh.ijam[70] = 7988213551428926088L;
        fh.ijam[71] = 4153813345429723183L;
        fh.ijam[72] = 3864553983489800489L;
        fh.ijam[73] = -95094352764287416L;
        fh.ijam[74] = 6751896151195085041L;
        fh.ijam[75] = -5928427315902909090L;
        fh.ijam[76] = 3483914446114388338L;
        fh.ijam[77] = 3691516758931661233L;
        fh.ijam[78] = 542827661297869410L;
        fh.ijam[79] = 7549022007425915297L;
        fh.ijam[80] = -8742401304922244726L;
        fh.ijam[81] = 4204912214878283130L;
        fh.ijam[82] = 5718635022954690872L;
        fh.ijam[83] = 2052726347966123816L;
        fh.ijam[84] = 8123920596364376476L;
        fh.ijam[85] = 3117820966368897376L;
        fh.ijam[86] = -6694197468446293684L;
        fh.ijam[87] = 410494650580795511L;
        fh.ijam[88] = 5280103737361134820L;
        fh.ijam[89] = -2632060087523506148L;
        fh.ijam[90] = 8006186035926172059L;
        fh.ijam[91] = 1115688778625218327L;
        fh.ijam[92] = -3730578100072952696L;
        fh.ijam[93] = 4995266558646394119L;
        fh.ijam[94] = 6873016722990278729L;
        fh.ijam[95] = 4901408545594922738L;
        fh.ijam[96] = 4664629224342754408L;
        fh.ijam[97] = -5656377321408846216L;
        fh.ijam[98] = 843449960573962217L;
        fh.ijam[99] = 1552865674248347642L;
    }

    private static /* synthetic */ void ijpq() {
        fh.ijal[0] = 7148180022077514711L;
        fh.ijal[1] = -1675543789750088400L;
        fh.ijal[2] = 5995384998691718662L;
        fh.ijal[3] = -641722952434239832L;
        fh.ijal[4] = -6403380176459408662L;
        fh.ijal[5] = -7183240787751073304L;
        fh.ijal[6] = 3281772642042519509L;
        fh.ijal[7] = -3889520540630951885L;
        fh.ijal[8] = 7374458232585144014L;
        fh.ijal[9] = 6171317852334237597L;
        fh.ijal[10] = 1411203988269692924L;
        fh.ijal[11] = 467443447592536102L;
        fh.ijal[12] = -3517062589156364288L;
        fh.ijal[13] = 6839862209465559196L;
        fh.ijal[14] = -6714182232462908260L;
        fh.ijal[15] = -8473184902135452041L;
        fh.ijal[16] = -1997644726454420074L;
        fh.ijal[17] = -4366903676543108512L;
        fh.ijal[18] = 804416644269888643L;
        fh.ijal[19] = -651361342313609221L;
        fh.ijal[20] = -8067612210773945495L;
        fh.ijal[21] = -8142024978047910341L;
        fh.ijal[22] = 5366784873435457320L;
        fh.ijal[23] = -1605550417715580246L;
        fh.ijal[24] = -6551162438034109228L;
        fh.ijal[25] = -1362930680964647908L;
        fh.ijal[26] = -4222111543211171664L;
        fh.ijal[27] = 5372430520422097661L;
        fh.ijal[28] = -2137681036373335399L;
        fh.ijal[29] = -3877006900648228539L;
        fh.ijal[30] = -7812501856305310219L;
        fh.ijal[31] = 6390349079066759397L;
        fh.ijal[32] = 6846637315484959130L;
        fh.ijal[33] = -9105397024054963849L;
        fh.ijal[34] = 5867862513253203622L;
        fh.ijal[35] = -2132346286926918205L;
        fh.ijal[36] = -6382802039987401983L;
        fh.ijal[37] = 4097686486171613301L;
        fh.ijal[38] = 2400792333022295357L;
        fh.ijal[39] = 3506983871243999955L;
        fh.ijal[40] = 5024806727769355063L;
        fh.ijal[41] = 6500853088312730254L;
        fh.ijal[42] = 7527456169992446857L;
        fh.ijal[43] = 1381330888955369096L;
        fh.ijal[44] = 3382231465797795244L;
        fh.ijal[45] = -6102600545741560807L;
        fh.ijal[46] = 7004823886249043410L;
        fh.ijal[47] = 1281725869941795035L;
        fh.ijal[48] = 1244390163734454459L;
        fh.ijal[49] = 8279881261952109099L;
        fh.ijal[50] = -504434955340698225L;
        fh.ijal[51] = 8192074160856485500L;
        fh.ijal[52] = -3464538488730167342L;
        fh.ijal[53] = -1660604323198234330L;
        fh.ijal[54] = -7684199577973019716L;
        fh.ijal[55] = -8168714702872439709L;
        fh.ijal[56] = -5422756744739218106L;
        fh.ijal[57] = 587445855112080526L;
        fh.ijal[58] = -696295093133744675L;
        fh.ijal[59] = 3865934978948190153L;
        fh.ijal[60] = 8745257068280751781L;
        fh.ijal[61] = -2666686083309880027L;
        fh.ijal[62] = -576375267001035505L;
        fh.ijal[63] = 1126373955565157073L;
        fh.ijal[64] = -9088547845100827155L;
        fh.ijal[65] = 9163950618169557988L;
        fh.ijal[66] = -4322853402765921330L;
        fh.ijal[67] = 4614717721048371092L;
        fh.ijal[68] = -6277703498920911727L;
        fh.ijal[69] = 117745791080841851L;
        fh.ijal[70] = 6763074504732078362L;
        fh.ijal[71] = -6033008896949522982L;
        fh.ijal[72] = 9083301455965676278L;
        fh.ijal[73] = 2567739632325056891L;
        fh.ijal[74] = 1761181076596835314L;
        fh.ijal[75] = 2413644491619413557L;
        fh.ijal[76] = 5401196957847433979L;
        fh.ijal[77] = -6020642069622083312L;
        fh.ijal[78] = -2098127671530653826L;
        fh.ijal[79] = 6875800901517891148L;
        fh.ijal[80] = -5561214869115843852L;
        fh.ijal[81] = -875738630074529729L;
        fh.ijal[82] = 4434663266617266101L;
        fh.ijal[83] = 6693111669003632713L;
        fh.ijal[84] = 2892626053946408177L;
        fh.ijal[85] = 4975038641352513894L;
        fh.ijal[86] = -8570911883874057624L;
        fh.ijal[87] = -9121833129120478020L;
        fh.ijal[88] = 3565522307475707999L;
        fh.ijal[89] = 2430617317879623576L;
        fh.ijal[90] = 7707809409358701038L;
        fh.ijal[91] = -1786284584861375777L;
        fh.ijal[92] = -6059137245041307588L;
        fh.ijal[93] = 1964587139563857608L;
        fh.ijal[94] = -5696995814952758909L;
        fh.ijal[95] = -1449378713447401765L;
        fh.ijal[96] = -2104926410090350668L;
        fh.ijal[97] = -646218056991725690L;
        fh.ijal[98] = 7785460828021028645L;
        fh.ijal[99] = 4478130589512058424L;
    }

    private static /* synthetic */ void ijpo() {
        fh.iizv[0] = -1672217967;
        fh.iizv[1] = -1225537026;
        fh.iizv[2] = -1980224751;
        fh.iizv[3] = 1408902693;
        fh.iizv[4] = -526958756;
        fh.iizv[5] = -446404012;
        fh.iizv[6] = -117922189;
        fh.iizv[7] = -101282717;
        fh.iizv[8] = -1930908956;
        fh.iizv[9] = 1676395890;
        fh.iizv[10] = -1661846859;
        fh.iizv[11] = -771197247;
        fh.iizv[12] = 355135826;
        fh.iizv[13] = 256396807;
        fh.iizv[14] = -1748152019;
        fh.iizv[15] = 1447095644;
        fh.iizv[16] = 1330451253;
        fh.iizv[17] = 477584478;
        fh.iizv[18] = -1500664096;
        fh.iizv[19] = -328820427;
        fh.iizv[20] = -642512841;
        fh.iizv[21] = -514358667;
        fh.iizv[22] = 581968461;
        fh.iizv[23] = 1754824179;
        fh.iizv[24] = -245285132;
        fh.iizv[25] = 919071766;
        fh.iizv[26] = -938558908;
        fh.iizv[27] = -2093574716;
        fh.iizv[28] = -1933388694;
        fh.iizv[29] = -1698570055;
        fh.iizv[30] = 2079731415;
        fh.iizv[31] = 1226714577;
        fh.iizv[32] = -1239377160;
        fh.iizv[33] = -1839875768;
        fh.iizv[34] = 1826188743;
        fh.iizv[35] = -659040337;
        fh.iizv[36] = -1492843211;
        fh.iizv[37] = -1460706876;
        fh.iizv[38] = 1689384979;
        fh.iizv[39] = -1928933258;
        fh.iizv[40] = 1835151244;
        fh.iizv[41] = 1749849154;
        fh.iizv[42] = -878629186;
        fh.iizv[43] = -668813116;
        fh.iizv[44] = 805278960;
        fh.iizv[45] = 727714316;
        fh.iizv[46] = 1633461451;
        fh.iizv[47] = 444352845;
        fh.iizv[48] = 1572207840;
        fh.iizv[49] = 1243391270;
        fh.iizv[50] = 565939799;
        fh.iizv[51] = 2132796844;
        fh.iizv[52] = -751926583;
        fh.iizv[53] = -1183785827;
        fh.iizv[54] = -1296827001;
        fh.iizv[55] = 406086754;
        fh.iizv[56] = -436537483;
        fh.iizv[57] = -874040653;
        fh.iizv[58] = -1034132379;
        fh.iizv[59] = -660843827;
        fh.iizv[60] = 291175835;
        fh.iizv[61] = -705165088;
        fh.iizv[62] = -1586931634;
        fh.iizv[63] = -2081135495;
        fh.iizv[64] = 1795587754;
        fh.iizv[65] = 315583822;
        fh.iizv[66] = -359191560;
        fh.iizv[67] = -996368259;
        fh.iizv[68] = -1012749960;
        fh.iizv[69] = 1127783368;
        fh.iizv[70] = 1995954249;
        fh.iizv[71] = 708428656;
        fh.iizv[72] = -481397056;
        fh.iizv[73] = 437794031;
        fh.iizv[74] = -909596958;
        fh.iizv[75] = -1478835815;
        fh.iizv[76] = -54548569;
        fh.iizv[77] = -254809114;
        fh.iizv[78] = 743060567;
        fh.iizv[79] = 779332983;
        fh.iizv[80] = 397662047;
        fh.iizv[81] = -1097188616;
        fh.iizv[82] = -626429458;
        fh.iizv[83] = 209884905;
        fh.iizv[84] = -1746606831;
        fh.iizv[85] = 40109821;
        fh.iizv[86] = -219125157;
        fh.iizv[87] = -1193015809;
        fh.iizv[88] = 1159976657;
        fh.iizv[89] = -299114889;
        fh.iizv[90] = -1282302623;
        fh.iizv[91] = 1848348665;
        fh.iizv[92] = 342297836;
        fh.iizv[93] = 1662216975;
        fh.iizv[94] = -1741031527;
        fh.iizv[95] = -305487267;
        fh.iizv[96] = 754784222;
        fh.iizv[97] = -1688823324;
        fh.iizv[98] = 544596693;
        fh.iizv[99] = 1107673008;
    }

    private static /* synthetic */ void ijpp() {
        fh.iizv[100] = -2033640176;
        fh.iizv[101] = 785029563;
        fh.iizv[102] = -436435667;
        fh.iizv[103] = -1986536148;
        fh.iizv[104] = -864298708;
        fh.iizv[105] = -2064021153;
        fh.iizv[106] = -1073633195;
        fh.iizv[107] = -429166450;
        fh.iizv[108] = 724443697;
        fh.iizv[109] = -487538256;
        fh.iizv[110] = -313162532;
        fh.iizv[111] = -1022259556;
        fh.iizv[112] = 1801248069;
        fh.iizv[113] = 654858107;
        fh.iizv[114] = -2139266522;
        fh.iizv[115] = -419643404;
        fh.iizv[116] = 1707605683;
        fh.iizv[117] = -1582828540;
        fh.iizv[118] = 423416562;
        fh.iizv[119] = -1547435378;
        fh.iizv[120] = -462344209;
        fh.iizv[121] = -879984942;
        fh.iizv[122] = 2048901077;
        fh.iizv[123] = 817560635;
        fh.iizv[124] = 916656809;
        fh.iizv[125] = 1935701583;
        fh.iizv[126] = 228005894;
        fh.iizv[127] = 837719577;
        fh.iizv[128] = 139271894;
        fh.iizv[129] = 1866965223;
        fh.iizv[130] = -624664385;
        fh.iizv[131] = 1353316353;
        fh.iizv[132] = 119807305;
        fh.iizv[133] = -578498761;
        fh.iizv[134] = 1726773311;
        fh.iizv[135] = 888433551;
    }

    private static /* synthetic */ long ijak(int n2) {
        return ijal[n2] ^ ijam[n2];
    }

    private static /* synthetic */ void ijpt() {
        fh.ijam[100] = 4084588432844392187L;
        fh.ijam[101] = -5702645924836337837L;
        fh.ijam[102] = 94853967360667455L;
        fh.ijam[103] = -1954206348716777847L;
        fh.ijam[104] = 1633570059295520275L;
        fh.ijam[105] = 2359314611201401328L;
        fh.ijam[106] = 9071599566330737406L;
        fh.ijam[107] = -7841715567802721515L;
        fh.ijam[108] = 5741928863112132426L;
        fh.ijam[109] = -3504801674193062435L;
        fh.ijam[110] = -5475419415597907517L;
        fh.ijam[111] = 7493794111341605869L;
        fh.ijam[112] = -9140042142076523842L;
        fh.ijam[113] = 4192539884381397579L;
        fh.ijam[114] = -7349012360647668644L;
        fh.ijam[115] = -3413472308777597627L;
        fh.ijam[116] = 4804685047836270225L;
        fh.ijam[117] = -3806805488691220043L;
        fh.ijam[118] = -1417310239576642903L;
        fh.ijam[119] = -9095772055146920291L;
        fh.ijam[120] = 2816112120965991098L;
        fh.ijam[121] = 7875638552250252388L;
        fh.ijam[122] = 985380677930030007L;
        fh.ijam[123] = 483109194087876914L;
        fh.ijam[124] = 4821530128744261565L;
        fh.ijam[125] = 6054323905842778217L;
        fh.ijam[126] = -4495694156012195702L;
        fh.ijam[127] = -2985872346457123356L;
        fh.ijam[128] = 5021242920826437025L;
        fh.ijam[129] = 7830968858497832122L;
        fh.ijam[130] = -109721063651024394L;
        fh.ijam[131] = -753104387237005116L;
        fh.ijam[132] = -2983743231762136273L;
        fh.ijam[133] = 5172871758593970037L;
        fh.ijam[134] = -3707408710999781517L;
        fh.ijam[135] = 5996438551508838865L;
        fh.ijam[136] = -7106365651548791591L;
        fh.ijam[137] = 497168237232305101L;
        fh.ijam[138] = -9211283191618720163L;
        fh.ijam[139] = 2326879057509913208L;
        fh.ijam[140] = -3364661369337186856L;
        fh.ijam[141] = 6232355632616121555L;
        fh.ijam[142] = 3109434029997109642L;
        fh.ijam[143] = -2664738876336289841L;
        fh.ijam[144] = 3571329622297142317L;
        fh.ijam[145] = 3919422743356996943L;
        fh.ijam[146] = -5954414819652681890L;
        fh.ijam[147] = 8107389377486282659L;
        fh.ijam[148] = 5023727211332518251L;
        fh.ijam[149] = -4829134084272021703L;
        fh.ijam[150] = -8831948245037121188L;
        fh.ijam[151] = 7243577657018926065L;
        fh.ijam[152] = 6038241349363031117L;
        fh.ijam[153] = -5336997897410440235L;
        fh.ijam[154] = 305842706648244163L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = fh.pt;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - fh.iizw("ijan", ijak(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 706250489: {
                    v1 = fh.iizw("ijao", ijak(int ), (int)1);
                    continue block26;
                }
                case 948901009: {
                    break block26;
                }
                case 1063905342: {
                    v1 = fh.iizw("ijap", ijak(int ), (int)2);
                    continue block26;
                }
            }
            break;
        }
        var3_1 = fh.c;
        v2 /* !! */  = fh.pt;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - fh.iizw("ijar", ijak(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -686808102: {
                    v3 = fh.iizw("ijat", ijak(int ), (int)4);
                    continue block27;
                }
                case -321485956: {
                    v3 = fh.iizw("ijav", ijak(int ), (int)5);
                    continue block27;
                }
                case 948901009: {
                    break block27;
                }
                case 1064748705: {
                    v3 = fh.iizw("ijax", ijak(int ), (int)6);
                    continue block27;
                }
            }
            break;
        }
        var2_2 = fh.b;
        v4 /* !! */  = fh.pt;
        if (true) ** GOTO lbl36
        block28: while (true) {
            v4 /* !! */  = (long)(fh.iizw("ijbb", ijak(int ), (int)8) - fh.iizw("ijaz", ijak(int ), (int)7));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -673888090: {
                    continue block28;
                }
                case 948901009: {
                    break block28;
                }
            }
            break;
        }
        var1_3 = fh.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        v5 /* !! */  = fh.pt;
        if (true) ** GOTO lbl51
        block30: while (true) {
            v5 /* !! */  = (long)(v6 - fh.iizw("ijbe", ijak(int ), (int)9));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 847633831: {
                    v6 = fh.iizw("ijbg", ijak(int ), (int)10);
                    continue block30;
                }
                case 918157518: {
                    v6 = fh.iizw("ijbi", ijak(int ), (int)11);
                    continue block30;
                }
                case 948901009: {
                    break block30;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = fh.pt - fh.iizw("ijbk", ijak(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == fh.iizw("ijbm", iizs(int ), (int)8)) break;
            v7 /* !! */  = (long)fh.iizw("ijbo", iizs(int ), (int)9);
        }
        this.client.startFromProfile();
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = fh.pt - fh.iizw("ijbq", ijak(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == fh.iizw("ijbs", iizs(int ), (int)10)) break;
            v8 /* !! */  = (long)fh.iizw("ijbu", iizs(int ), (int)11);
        }
        v9 = fh.iizw("ijbw", iizs(int ), (int)12);
        v10 /* !! */  = fh.pt;
        if (true) ** GOTO lbl77
        block33: while (true) {
            v10 /* !! */  = (long)(v11 - fh.iizw("ijby", ijak(int ), (int)14));
lbl77:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -549244885: {
                    v11 = fh.iizw("ijbz", ijak(int ), (int)15);
                    continue block33;
                }
                case 255461567: {
                    v11 = fh.iizw("ijca", ijak(int ), (int)16);
                    continue block33;
                }
                case 521445189: {
                    v11 = fh.iizw("ijcb", ijak(int ), (int)17);
                    continue block33;
                }
                case 948901009: {
                    break block33;
                }
            }
            break;
        }
        this.client.requestPartyInfo((boolean)v9);
        ** while (var1_3 || var1_3)
lbl92:
        // 1 sources

    }

    public static /* synthetic */ CallSite iizw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block126: {
            block125: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fh.pt - fh.iizw("ijdf", ijak(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fh.iizw("ijdg", iizs(int ), (int)21)) break;
                    v0 /* !! */  = (long)fh.iizw("ijdi", iizs(int ), (int)22);
                }
                var4_2 = fh.c;
                v1 /* !! */  = fh.pt;
                if (true) ** GOTO lbl11
                block87: while (true) {
                    v1 /* !! */  = (long)(fh.iizw("ijdl", ijak(int ), (int)20) - fh.iizw("ijdk", ijak(int ), (int)19));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 948901009: {
                            break block87;
                        }
                        case 1050605410: {
                            continue block87;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = fh.b;
                v2 /* !! */  = fh.pt;
                if (true) ** GOTO lbl21
                block88: while (true) {
                    v2 /* !! */  = (long)(v3 - fh.iizw("ijdn", ijak(int ), (int)21));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 861341336: {
                            v3 = fh.iizw("ijdp", ijak(int ), (int)22);
                            continue block88;
                        }
                        case 948901009: {
                            break block88;
                        }
                        case 1027897794: {
                            v3 = fh.iizw("ijdq", ijak(int ), (int)23);
                            continue block88;
                        }
                        case 1800380344: {
                            v3 = fh.iizw("ijds", ijak(int ), (int)24);
                            continue block88;
                        }
                    }
                    break;
                }
                var2_4 = fh.a;
                if (var4_2) {
                    throw null;
lbl36:
                    // 9 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = fh.pt - fh.iizw("ijdv", ijak(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fh.iizw("ijdx", iizs(int ), (int)23)) break;
                    v4 /* !! */  = (long)fh.iizw("ijdz", iizs(int ), (int)24);
                }
                v5 /* !! */  = fh.pt;
                if (true) ** GOTO lbl48
                block91: while (true) {
                    v5 /* !! */  = (long)(fh.iizw("ijeb", ijak(int ), (int)27) - fh.iizw("ijea", ijak(int ), (int)26));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1442114632: {
                            continue block91;
                        }
                        case 948901009: {
                            break block91;
                        }
                    }
                    break;
                }
                if (!this.throwCoordinates.isValue()) break block125;
                if (var2_4) ** GOTO lbl36
                v6 /* !! */  = fh.pt;
                if (true) ** GOTO lbl59
                block92: while (true) {
                    v6 /* !! */  = (long)(v7 - fh.iizw("ijed", ijak(int ), (int)28));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 499411835: {
                            v7 = fh.iizw("ijef", ijak(int ), (int)29);
                            continue block92;
                        }
                        case 609677202: {
                            v7 = fh.iizw("ijeg", ijak(int ), (int)30);
                            continue block92;
                        }
                        case 948901009: {
                            break block92;
                        }
                        case 2096764081: {
                            v7 = fh.iizw("ijei", ijak(int ), (int)31);
                            continue block92;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fh.pt - fh.iizw("ijej", ijak(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fh.iizw("ijek", iizs(int ), (int)25)) break;
                    v8 /* !! */  = (long)fh.iizw("ijel", iizs(int ), (int)26);
                }
                if (fh.mc.field_1724 == null) break block125;
                if (var2_4) ** GOTO lbl36
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = fh.pt - fh.iizw("ijen", ijak(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fh.iizw("ijep", iizs(int ), (int)27)) break;
                    v9 /* !! */  = (long)fh.iizw("ijer", iizs(int ), (int)28);
                }
                v10 /* !! */  = fh.pt;
                if (true) ** GOTO lbl87
                block95: while (true) {
                    v10 /* !! */  = (long)(v11 - fh.iizw("ijet", ijak(int ), (int)34));
lbl87:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1428085766: {
                            v11 = fh.iizw("ijev", ijak(int ), (int)35);
                            continue block95;
                        }
                        case -1081813761: {
                            v11 = fh.iizw("ijey", ijak(int ), (int)36);
                            continue block95;
                        }
                        case -299716536: {
                            v11 = fh.iizw("ijfa", ijak(int ), (int)37);
                            continue block95;
                        }
                        case 948901009: {
                            break block95;
                        }
                    }
                    break;
                }
                if (fh.mc.field_1755 == null) break block126;
                if (var2_4) ** GOTO lbl36
            }
            if (var2_4 || var2_4) ** GOTO lbl36
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        v12 /* !! */  = fh.pt;
        if (true) ** GOTO lbl110
        block96: while (true) {
            v12 /* !! */  = (long)(v13 - fh.iizw("ijfc", ijak(int ), (int)38));
lbl110:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -987082170: {
                    v13 = fh.iizw("ijfe", ijak(int ), (int)39);
                    continue block96;
                }
                case 948901009: {
                    break block96;
                }
                case 2114360713: {
                    v13 = fh.iizw("ijfg", ijak(int ), (int)40);
                    continue block96;
                }
            }
            break;
        }
        v14 /* !! */  = fh.pt;
        if (true) ** GOTO lbl123
        block97: while (true) {
            v14 /* !! */  = (long)(fh.iizw("ijfk", ijak(int ), (int)42) - fh.iizw("ijfi", ijak(int ), (int)41));
lbl123:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1693168377: {
                    continue block97;
                }
                case 948901009: {
                    break block97;
                }
            }
            break;
        }
        if (!var1_1.isBindDown(this.coordinateBind)) ** GOTO lbl250
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl36
                v15 /* !! */  = fh.pt;
                if (true) ** GOTO lbl137
                block98: while (true) {
                    v15 /* !! */  = (long)(v16 - fh.iizw("ijfn", ijak(int ), (int)43));
lbl137:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1273913621: {
                            v16 = fh.iizw("ijfp", ijak(int ), (int)44);
                            continue block98;
                        }
                        case 948901009: {
                            break block98;
                        }
                        case 1606126992: {
                            v16 = fh.iizw("ijfs", ijak(int ), (int)45);
                            continue block98;
                        }
                    }
                    break;
                }
                v17 /* !! */  = fh.pt;
                if (true) ** GOTO lbl150
                block99: while (true) {
                    v17 /* !! */  = (long)(v18 - fh.iizw("ijft", ijak(int ), (int)46));
lbl150:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1932942785: {
                            v18 = fh.iizw("ijfv", ijak(int ), (int)47);
                            continue block99;
                        }
                        case 203734688: {
                            v18 = fh.iizw("ijfy", ijak(int ), (int)48);
                            continue block99;
                        }
                        case 948901009: {
                            break block99;
                        }
                        case 1269953428: {
                            v18 = fh.iizw("ijga", ijak(int ), (int)49);
                            continue block99;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = fh.pt - fh.iizw("ijgc", ijak(int ), (int)50)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fh.iizw("ijge", iizs(int ), (int)29)) break;
                    v19 /* !! */  = (long)fh.iizw("ijgg", iizs(int ), (int)30);
                }
                v20 = fh.mc.field_1724;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = fh.pt - fh.iizw("ijgi", ijak(int ), (int)51)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == fh.iizw("ijgk", iizs(int ), (int)31)) break;
                    v21 /* !! */  = (long)fh.iizw("ijgn", iizs(int ), (int)32);
                }
                v22 = v20.method_31477();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = fh.pt - fh.iizw("ijgp", ijak(int ), (int)52)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == fh.iizw("ijgr", iizs(int ), (int)33)) break;
                    v23 /* !! */  = (long)fh.iizw("ijgu", iizs(int ), (int)34);
                }
                v24 /* !! */  = fh.pt;
                if (true) ** GOTO lbl183
                block103: while (true) {
                    v24 /* !! */  = (long)(v25 - fh.iizw("ijgw", ijak(int ), (int)53));
lbl183:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1131610733: {
                            v25 = fh.iizw("ijgx", ijak(int ), (int)54);
                            continue block103;
                        }
                        case 157523603: {
                            v25 = fh.iizw("ijgz", ijak(int ), (int)55);
                            continue block103;
                        }
                        case 948901009: {
                            break block103;
                        }
                        case 1792981858: {
                            v25 = fh.iizw("ijhb", ijak(int ), (int)56);
                            continue block103;
                        }
                    }
                    break;
                }
                v26 = fh.mc.field_1724;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = fh.pt - fh.iizw("ijhe", ijak(int ), (int)57)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == fh.iizw("ijhf", iizs(int ), (int)35)) break;
                    v27 /* !! */  = (long)fh.iizw("ijhg", iizs(int ), (int)36);
                }
                v28 = v26.method_31478();
                v29 /* !! */  = fh.pt;
                if (true) ** GOTO lbl206
                block105: while (true) {
                    v29 /* !! */  = (long)(v30 - fh.iizw("ijhh", ijak(int ), (int)58));
lbl206:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1539032808: {
                            v30 = fh.iizw("ijhi", ijak(int ), (int)59);
                            continue block105;
                        }
                        case 948901009: {
                            break block105;
                        }
                        case 1056168494: {
                            v30 = fh.iizw("ijhj", ijak(int ), (int)60);
                            continue block105;
                        }
                    }
                    break;
                }
                v31 /* !! */  = fh.pt;
                if (true) ** GOTO lbl219
                block106: while (true) {
                    v31 /* !! */  = (long)(v32 - fh.iizw("ijhl", ijak(int ), (int)61));
lbl219:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case 948901009: {
                            break block106;
                        }
                        case 1460992423: {
                            v32 = fh.iizw("ijhn", ijak(int ), (int)62);
                            continue block106;
                        }
                        case 1510455634: {
                            v32 = fh.iizw("ijho", ijak(int ), (int)63);
                            continue block106;
                        }
                    }
                    break;
                }
                v33 = fh.mc.field_1724;
                v34 /* !! */  = fh.pt;
                if (true) ** GOTO lbl233
                block107: while (true) {
                    v34 /* !! */  = (long)(v35 - fh.iizw("ijhp", ijak(int ), (int)64));
lbl233:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -641756677: {
                            v35 = fh.iizw("ijhq", ijak(int ), (int)65);
                            continue block107;
                        }
                        case 655799427: {
                            v35 = fh.iizw("ijhr", ijak(int ), (int)66);
                            continue block107;
                        }
                        case 948901009: {
                            break block107;
                        }
                    }
                    break;
                }
                v36 = v33.method_31479();
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_8 = fh.pt - fh.iizw("ijhs", ijak(int ), (int)67)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == fh.iizw("ijht", iizs(int ), (int)37)) break;
                    v37 /* !! */  = (long)fh.iizw("ijhv", iizs(int ), (int)38);
                }
                this.client.sendCoordinates(v22, v28, v36);
                if (var2_4) ** GOTO lbl36
lbl250:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl253:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fh.iizw("ijhw", iizs(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 1: {
                var3_3 /* !! */  = (int)fh.iizw("ijhx", iizs(int ), (int)40);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl263:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fh.iizw("ijhy", iizs(int ), (int)41);
                if (!var4_2) ** GOTO lbl253
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)fh.iizw("ijia", iizs(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 4: {
                var3_3 /* !! */  = (int)fh.iizw("ijib", iizs(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)fh.iizw("ijic", iizs(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl281:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)fh.iizw("ijie", iizs(int ), (int)45);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 7: {
                var3_3 /* !! */  = (int)fh.iizw("ijif", iizs(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fh.iizw("ijig", iizs(int ), (int)47);
                    if (!var4_2) ** GOTO lbl281
                    throw null;
                }
            }
lbl296:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)fh.iizw("ijih", iizs(int ), (int)48);
                if (!var4_2) ** GOTO lbl281
                throw null;
            }
lbl300:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)fh.iizw("ijij", iizs(int ), (int)49);
                if (!var4_2) ** GOTO lbl296
                throw null;
            }
lbl304:
            // 4 sources

            case 11: {
                var3_3 /* !! */  = (int)fh.iizw("ijik", iizs(int ), (int)50);
                if (!var4_2) ** GOTO lbl263
                throw null;
            }
lbl308:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)fh.iizw("ijim", iizs(int ), (int)51);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl312:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)fh.iizw("ijin", iizs(int ), (int)52);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)fh.iizw("ijio", iizs(int ), (int)53);
                if (!var4_2) ** GOTO lbl312
                throw null;
            }
lbl320:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)fh.iizw("ijip", iizs(int ), (int)54);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
            case 16: 
        }
        var3_3 /* !! */  = (int)fh.iizw("ijir", iizs(int ), (int)55);
        ** while (!var4_2)
lbl327:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ijpr() {
        fh.ijal[100] = -5669642901885628875L;
        fh.ijal[101] = -272748546331893808L;
        fh.ijal[102] = -5682237419098598769L;
        fh.ijal[103] = 8186222896477040346L;
        fh.ijal[104] = -4642581552375744420L;
        fh.ijal[105] = 3285616148604408316L;
        fh.ijal[106] = 5904316965285535190L;
        fh.ijal[107] = -7302099102675503967L;
        fh.ijal[108] = -8683959613579320649L;
        fh.ijal[109] = -3493301110279713096L;
        fh.ijal[110] = -4134790732025481186L;
        fh.ijal[111] = -6417199608311808343L;
        fh.ijal[112] = -6312681850162244823L;
        fh.ijal[113] = 7540063994744821176L;
        fh.ijal[114] = 3463754103174177639L;
        fh.ijal[115] = 6729950783271320321L;
        fh.ijal[116] = 1747869515796592212L;
        fh.ijal[117] = -6370484505469261382L;
        fh.ijal[118] = -4137508098327966892L;
        fh.ijal[119] = 2865363183518059569L;
        fh.ijal[120] = -7890638882775592655L;
        fh.ijal[121] = -7707090517042895875L;
        fh.ijal[122] = 1378074700071873112L;
        fh.ijal[123] = -272094365834154873L;
        fh.ijal[124] = -2612233095599930223L;
        fh.ijal[125] = 3727381450723905433L;
        fh.ijal[126] = 6965903158873287734L;
        fh.ijal[127] = 7395365942222635349L;
        fh.ijal[128] = 5947233083351751715L;
        fh.ijal[129] = -7530584915103611632L;
        fh.ijal[130] = -3715102842640631709L;
        fh.ijal[131] = 8838329592814853424L;
        fh.ijal[132] = -1052918612129338014L;
        fh.ijal[133] = 3543824109994444391L;
        fh.ijal[134] = -7624296113858091200L;
        fh.ijal[135] = -3593320989998397398L;
        fh.ijal[136] = -1655728324416995826L;
        fh.ijal[137] = -5274083332488364413L;
        fh.ijal[138] = -7997958253276056349L;
        fh.ijal[139] = -8589482861695474050L;
        fh.ijal[140] = 7698709142575042891L;
        fh.ijal[141] = 7225969569277359356L;
        fh.ijal[142] = 5870445085133075843L;
        fh.ijal[143] = -5035777517384980098L;
        fh.ijal[144] = -4299830371200298065L;
        fh.ijal[145] = -518558497094921818L;
        fh.ijal[146] = 6206406448937277033L;
        fh.ijal[147] = 8497293241683760279L;
        fh.ijal[148] = -7586072683905169716L;
        fh.ijal[149] = -7771120683036857558L;
        fh.ijal[150] = 333025299319613718L;
        fh.ijal[151] = 8102612675754900754L;
        fh.ijal[152] = -6855585961226258076L;
        fh.ijal[153] = 2801766575413484392L;
        fh.ijal[154] = -6972189711503038246L;
    }
}

