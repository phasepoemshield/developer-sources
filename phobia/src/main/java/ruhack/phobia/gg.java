/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.aw;
import ruhack.phobia.by;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kc;
import ruhack.phobia.kf;
import ruhack.phobia.kg;

public class gg
extends ds {
    private final kc bravoPreset;
    private final kg[] xzByAngle;
    public static final long kr = -2796595808166094256L;
    private static int[] ehnq = new int[255];
    private static long[] ehpf;
    public static final int b;
    public static final boolean c;
    private final kf mode;
    private static long[] ehpg;
    private final kg[] yByAngle;
    public static final boolean a;
    private final kg xzSpeed;
    private static int[] ehnr;
    private final kg ySpeed;
    private final kc reallyWorldPreset;

    private static /* synthetic */ int ehob(int n2) {
        return ehnq[n2] ^ ehnr[n2];
    }

    private static /* synthetic */ void eirk() {
        gg.ehnr[0] = -1685299429;
        gg.ehnr[1] = -593767108;
        gg.ehnr[2] = 1303318435;
        gg.ehnr[3] = -1867230656;
        gg.ehnr[4] = 1148560945;
        gg.ehnr[5] = -1630596468;
        gg.ehnr[6] = -1846555001;
        gg.ehnr[7] = 1716611428;
        gg.ehnr[8] = -631520559;
        gg.ehnr[9] = 1757317105;
        gg.ehnr[10] = 999014349;
        gg.ehnr[11] = 332018276;
        gg.ehnr[12] = 246962625;
        gg.ehnr[13] = 1767122669;
        gg.ehnr[14] = 1336063023;
        gg.ehnr[15] = -1423490041;
        gg.ehnr[16] = 557236658;
        gg.ehnr[17] = 1188756907;
        gg.ehnr[18] = 937535075;
        gg.ehnr[19] = 1966906725;
        gg.ehnr[20] = -486248779;
        gg.ehnr[21] = 1874276196;
        gg.ehnr[22] = 506549680;
        gg.ehnr[23] = -1303220494;
        gg.ehnr[24] = 720904429;
        gg.ehnr[25] = -386232573;
        gg.ehnr[26] = 739997124;
        gg.ehnr[27] = 1889726394;
        gg.ehnr[28] = -915355002;
        gg.ehnr[29] = -69877749;
        gg.ehnr[30] = 296912835;
        gg.ehnr[31] = -1064713491;
        gg.ehnr[32] = 1667784933;
        gg.ehnr[33] = 1484784056;
        gg.ehnr[34] = -1611288413;
        gg.ehnr[35] = -1861897826;
        gg.ehnr[36] = -127197002;
        gg.ehnr[37] = -2114601785;
        gg.ehnr[38] = -941663832;
        gg.ehnr[39] = -8435169;
        gg.ehnr[40] = -1990858101;
        gg.ehnr[41] = 206849901;
        gg.ehnr[42] = 1527769426;
        gg.ehnr[43] = 856947646;
        gg.ehnr[44] = -2031076050;
        gg.ehnr[45] = 590962509;
        gg.ehnr[46] = 1190131949;
        gg.ehnr[47] = 1653585951;
        gg.ehnr[48] = 1460073828;
        gg.ehnr[49] = -989021092;
        gg.ehnr[50] = 1356000111;
        gg.ehnr[51] = 1561183801;
        gg.ehnr[52] = -2144028418;
        gg.ehnr[53] = -1771573942;
        gg.ehnr[54] = -763495686;
        gg.ehnr[55] = 968694467;
        gg.ehnr[56] = -1832096652;
        gg.ehnr[57] = -1811972538;
        gg.ehnr[58] = 406221342;
        gg.ehnr[59] = -881363734;
        gg.ehnr[60] = -2123525049;
        gg.ehnr[61] = 274063080;
        gg.ehnr[62] = -816158356;
        gg.ehnr[63] = 1449989613;
        gg.ehnr[64] = -392872536;
        gg.ehnr[65] = -1167290085;
        gg.ehnr[66] = -1081373;
        gg.ehnr[67] = 1685384223;
        gg.ehnr[68] = 845250728;
        gg.ehnr[69] = -2072921052;
        gg.ehnr[70] = -953299888;
        gg.ehnr[71] = 1610566853;
        gg.ehnr[72] = 1509110699;
        gg.ehnr[73] = -1105031325;
        gg.ehnr[74] = 1465164114;
        gg.ehnr[75] = -1081093738;
        gg.ehnr[76] = 988870458;
        gg.ehnr[77] = 1806156688;
        gg.ehnr[78] = 845197136;
        gg.ehnr[79] = -1310561209;
        gg.ehnr[80] = -391261780;
        gg.ehnr[81] = -191070874;
        gg.ehnr[82] = -1259599849;
        gg.ehnr[83] = 98238372;
        gg.ehnr[84] = 653257161;
        gg.ehnr[85] = -1775138614;
        gg.ehnr[86] = 716103474;
        gg.ehnr[87] = -1508331673;
        gg.ehnr[88] = 2070523960;
        gg.ehnr[89] = -1749292796;
        gg.ehnr[90] = -1979898773;
        gg.ehnr[91] = -991250406;
        gg.ehnr[92] = -1799221599;
        gg.ehnr[93] = 660006960;
        gg.ehnr[94] = 1899471257;
        gg.ehnr[95] = 1581738602;
        gg.ehnr[96] = 2104242630;
        gg.ehnr[97] = 1642528637;
        gg.ehnr[98] = -92852079;
        gg.ehnr[99] = 1493920564;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$createAngleSettings$4() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eihp", ehpe(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gg.ehns("eihq", ehob(int ), (int)209)) break;
            v0 /* !! */  = (long)gg.ehns("eihv", ehob(int ), (int)210);
        }
        var3_1 = gg.c;
        v1 /* !! */  = gg.kr;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(gg.ehns("eihx", ehpe(int ), (int)147) - gg.ehns("eihw", ehpe(int ), (int)146));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -236332464: {
                    break block15;
                }
                case 496500057: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 = gg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("eihy", ehpe(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gg.ehns("eihz", ehob(int ), (int)211)) break;
            v2 /* !! */  = (long)gg.ehns("eiia", ehob(int ), (int)212);
        }
        var1_3 = gg.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("eiib", ehpe(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gg.ehns("eiii", ehob(int ), (int)213)) break;
            v3 /* !! */  = (long)gg.ehns("eiij", ehob(int ), (int)214);
        }
        v4 /* !! */  = gg.kr;
        if (true) ** GOTO lbl40
        block19: while (true) {
            v4 /* !! */  = (long)(v5 - gg.ehns("eiik", ehpe(int ), (int)150));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -236332464: {
                    break block19;
                }
                case 660776411: {
                    v5 = gg.ehns("eiil", ehpe(int ), (int)151);
                    continue block19;
                }
                case 1978515690: {
                    v5 = gg.ehns("eiin", ehpe(int ), (int)152);
                    continue block19;
                }
            }
            break;
        }
        v6 = this.mode.isSelected("\u0423\u0433\u043b\u043e\u0432\u043e\u0439");
        v7 /* !! */  = gg.kr;
        if (true) ** GOTO lbl54
        block20: while (true) {
            v7 /* !! */  = (long)(v8 - gg.ehns("eiip", ehpe(int ), (int)153));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1740599048: {
                    v8 = gg.ehns("eiiq", ehpe(int ), (int)154);
                    continue block20;
                }
                case -1287656325: {
                    v8 = gg.ehns("eiiw", ehpe(int ), (int)155);
                    continue block20;
                }
                case -236332464: {
                    break block20;
                }
            }
            break;
        }
        return v6;
    }

    private static /* synthetic */ long ehpe(int n2) {
        return ehpf[n2] ^ ehpg[n2];
    }

    static {
        ehnr = new int[255];
        gg.eiqm();
        gg.eiqt();
        gg.eird();
        gg.eirk();
        gg.eirw();
        gg.eisk();
        ehpf = new long[210];
        ehpg = new long[210];
        gg.eisy();
        gg.eity();
        gg.eiuv();
        gg.eivb();
        gg.eivq();
        gg.eiwf();
    }

    private static /* synthetic */ float ehnp(int n2) {
        return Float.intBitsToFloat(ehnq[n2] ^ ehnr[n2]);
    }

    private static /* synthetic */ void eiuv() {
        gg.ehpf[200] = 6220073193512950513L;
        gg.ehpf[201] = 5553839561924767977L;
        gg.ehpf[202] = 2691120020488474866L;
        gg.ehpf[203] = -5780609217862705657L;
        gg.ehpf[204] = 794436044875176178L;
        gg.ehpf[205] = 9027929479056700172L;
        gg.ehpf[206] = -6843624372222994097L;
        gg.ehpf[207] = 6023601302448983733L;
        gg.ehpf[208] = -8052493275223581058L;
        gg.ehpf[209] = -4579638138449597029L;
    }

    private static /* synthetic */ void eirw() {
        gg.ehnr[100] = -2114143625;
        gg.ehnr[101] = 808118271;
        gg.ehnr[102] = 840650133;
        gg.ehnr[103] = -196661537;
        gg.ehnr[104] = 1474650719;
        gg.ehnr[105] = 1607821910;
        gg.ehnr[106] = -841940115;
        gg.ehnr[107] = 1956969268;
        gg.ehnr[108] = -1266337814;
        gg.ehnr[109] = 593597442;
        gg.ehnr[110] = 420858186;
        gg.ehnr[111] = 1478972722;
        gg.ehnr[112] = 348949774;
        gg.ehnr[113] = -285749054;
        gg.ehnr[114] = -133801502;
        gg.ehnr[115] = -1277599962;
        gg.ehnr[116] = -927820657;
        gg.ehnr[117] = -1185043656;
        gg.ehnr[118] = -1085167460;
        gg.ehnr[119] = 1694814586;
        gg.ehnr[120] = 2098633106;
        gg.ehnr[121] = -1657180432;
        gg.ehnr[122] = 1355062383;
        gg.ehnr[123] = 1549756065;
        gg.ehnr[124] = 1885759691;
        gg.ehnr[125] = 297679537;
        gg.ehnr[126] = 367070991;
        gg.ehnr[127] = -238585889;
        gg.ehnr[128] = -1889322450;
        gg.ehnr[129] = -157515834;
        gg.ehnr[130] = 1893000367;
        gg.ehnr[131] = 1302050173;
        gg.ehnr[132] = 686522018;
        gg.ehnr[133] = 564298712;
        gg.ehnr[134] = 105831019;
        gg.ehnr[135] = 192581908;
        gg.ehnr[136] = -400104905;
        gg.ehnr[137] = -1335024877;
        gg.ehnr[138] = 1315689293;
        gg.ehnr[139] = 2125670342;
        gg.ehnr[140] = -518621713;
        gg.ehnr[141] = 2025972807;
        gg.ehnr[142] = 384646003;
        gg.ehnr[143] = -2078569867;
        gg.ehnr[144] = -1766176033;
        gg.ehnr[145] = -482919075;
        gg.ehnr[146] = 1610612274;
        gg.ehnr[147] = -655043838;
        gg.ehnr[148] = -1641652184;
        gg.ehnr[149] = 1411162589;
        gg.ehnr[150] = -1091709618;
        gg.ehnr[151] = 288212596;
        gg.ehnr[152] = -851616317;
        gg.ehnr[153] = -261315275;
        gg.ehnr[154] = -1420237666;
        gg.ehnr[155] = -1996182279;
        gg.ehnr[156] = -1003623091;
        gg.ehnr[157] = -1661585194;
        gg.ehnr[158] = -195535760;
        gg.ehnr[159] = 1817605165;
        gg.ehnr[160] = -1315084038;
        gg.ehnr[161] = -1096261097;
        gg.ehnr[162] = 206554012;
        gg.ehnr[163] = 1464396378;
        gg.ehnr[164] = -30912811;
        gg.ehnr[165] = -1155306131;
        gg.ehnr[166] = 200792386;
        gg.ehnr[167] = -1926206927;
        gg.ehnr[168] = -1278848436;
        gg.ehnr[169] = 352991616;
        gg.ehnr[170] = -1327778631;
        gg.ehnr[171] = -792816582;
        gg.ehnr[172] = -269409836;
        gg.ehnr[173] = -1178425403;
        gg.ehnr[174] = -1930555250;
        gg.ehnr[175] = -567711821;
        gg.ehnr[176] = -1875547352;
        gg.ehnr[177] = -47841378;
        gg.ehnr[178] = 1890329273;
        gg.ehnr[179] = 1203028234;
        gg.ehnr[180] = 1967071829;
        gg.ehnr[181] = 1957324268;
        gg.ehnr[182] = 2052415226;
        gg.ehnr[183] = -838677128;
        gg.ehnr[184] = 2083561714;
        gg.ehnr[185] = 2086444432;
        gg.ehnr[186] = 276454919;
        gg.ehnr[187] = 498171690;
        gg.ehnr[188] = -750001468;
        gg.ehnr[189] = 1285735945;
        gg.ehnr[190] = -834274955;
        gg.ehnr[191] = 1826940791;
        gg.ehnr[192] = -1852219285;
        gg.ehnr[193] = 10463643;
        gg.ehnr[194] = 878887448;
        gg.ehnr[195] = -1270142846;
        gg.ehnr[196] = 1225393782;
        gg.ehnr[197] = 57012272;
        gg.ehnr[198] = 363048078;
        gg.ehnr[199] = 890674016;
    }

    private static /* synthetic */ void eivq() {
        gg.ehpg[100] = -1774839779074141920L;
        gg.ehpg[101] = 5870021596879054039L;
        gg.ehpg[102] = 1172960772668130761L;
        gg.ehpg[103] = 4220375900480924921L;
        gg.ehpg[104] = 3631235972870961338L;
        gg.ehpg[105] = 4651771615791679528L;
        gg.ehpg[106] = 7501638258735980148L;
        gg.ehpg[107] = 5116105994779089657L;
        gg.ehpg[108] = 3579316548301537636L;
        gg.ehpg[109] = 5257224702973625536L;
        gg.ehpg[110] = -362960649675715843L;
        gg.ehpg[111] = 3838091758282220157L;
        gg.ehpg[112] = 4652531263612270119L;
        gg.ehpg[113] = -7077338704507776488L;
        gg.ehpg[114] = 6963001604974943508L;
        gg.ehpg[115] = -825494465526996657L;
        gg.ehpg[116] = 4498394959688764867L;
        gg.ehpg[117] = -1646504070170303044L;
        gg.ehpg[118] = 3216710130925643277L;
        gg.ehpg[119] = 206270268368728045L;
        gg.ehpg[120] = 2142938068482766463L;
        gg.ehpg[121] = 4529472568482269010L;
        gg.ehpg[122] = -2400430593191103654L;
        gg.ehpg[123] = -7345139500430103245L;
        gg.ehpg[124] = 1950076768322007722L;
        gg.ehpg[125] = -769888920028947741L;
        gg.ehpg[126] = -3910274388033914985L;
        gg.ehpg[127] = 5514483630249455414L;
        gg.ehpg[128] = 7814801721412894511L;
        gg.ehpg[129] = 1989824603492958515L;
        gg.ehpg[130] = -964915674239910402L;
        gg.ehpg[131] = 4004169056110878009L;
        gg.ehpg[132] = -9170441694154805208L;
        gg.ehpg[133] = -1722135674068309308L;
        gg.ehpg[134] = -486526766230006004L;
        gg.ehpg[135] = 5360708960962312432L;
        gg.ehpg[136] = 3858871028826704010L;
        gg.ehpg[137] = 8844876024183275799L;
        gg.ehpg[138] = -8061052889633181399L;
        gg.ehpg[139] = -7811152906483648496L;
        gg.ehpg[140] = 4839841669950044635L;
        gg.ehpg[141] = -6808023157130008114L;
        gg.ehpg[142] = -5956243743054714810L;
        gg.ehpg[143] = -2034912288247533757L;
        gg.ehpg[144] = -7917200210617701742L;
        gg.ehpg[145] = -8307753053754033402L;
        gg.ehpg[146] = -2954003186092847828L;
        gg.ehpg[147] = 2781706976352227091L;
        gg.ehpg[148] = 1005308329173771407L;
        gg.ehpg[149] = -4156685152539297012L;
        gg.ehpg[150] = 9018683756056874895L;
        gg.ehpg[151] = 5657827978192712317L;
        gg.ehpg[152] = -558643679145664571L;
        gg.ehpg[153] = 918423001003880139L;
        gg.ehpg[154] = -2909851442652526314L;
        gg.ehpg[155] = 7157177180930601743L;
        gg.ehpg[156] = 8097232565568762793L;
        gg.ehpg[157] = -32871556599796895L;
        gg.ehpg[158] = 1372346090016992352L;
        gg.ehpg[159] = 1141766717294520228L;
        gg.ehpg[160] = -6595635665266654782L;
        gg.ehpg[161] = -7958014492160785107L;
        gg.ehpg[162] = -7312514447004847149L;
        gg.ehpg[163] = -74946600173222768L;
        gg.ehpg[164] = 2030984165600444491L;
        gg.ehpg[165] = -579780505534723135L;
        gg.ehpg[166] = 1592517096650769986L;
        gg.ehpg[167] = 6122479542031167783L;
        gg.ehpg[168] = 3744359002482128298L;
        gg.ehpg[169] = 5931912632837151727L;
        gg.ehpg[170] = -5378132570327566548L;
        gg.ehpg[171] = -5949940357320193765L;
        gg.ehpg[172] = -6716940110065810080L;
        gg.ehpg[173] = 131199803039129695L;
        gg.ehpg[174] = 2404388148092963641L;
        gg.ehpg[175] = 915785971766676267L;
        gg.ehpg[176] = -8177627675898329300L;
        gg.ehpg[177] = -8437005018945333196L;
        gg.ehpg[178] = -1572857130626491725L;
        gg.ehpg[179] = 7144043272345602414L;
        gg.ehpg[180] = -396694150585653902L;
        gg.ehpg[181] = -6112968918679122525L;
        gg.ehpg[182] = 7973843272213055250L;
        gg.ehpg[183] = 3276343506987469702L;
        gg.ehpg[184] = -8199750159960817962L;
        gg.ehpg[185] = -6849744519555852076L;
        gg.ehpg[186] = 6340410986810370303L;
        gg.ehpg[187] = 4861611024383688098L;
        gg.ehpg[188] = -7242167985192862291L;
        gg.ehpg[189] = -3578911438585712112L;
        gg.ehpg[190] = -8472897064173884574L;
        gg.ehpg[191] = -422821952377687611L;
        gg.ehpg[192] = -614790198432239506L;
        gg.ehpg[193] = 122254608091177796L;
        gg.ehpg[194] = -8699564608133659552L;
        gg.ehpg[195] = -3163431735382089597L;
        gg.ehpg[196] = 597974979842860218L;
        gg.ehpg[197] = 4923400497158485182L;
        gg.ehpg[198] = 4729566934491529569L;
        gg.ehpg[199] = -6776220480830192057L;
    }

    public static /* synthetic */ CallSite ehns(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private kg[] createAngleSettings(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("ehtr", ehpe(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gg.ehns("ehts", ehob(int ), (int)79)) break;
            v0 /* !! */  = (long)gg.ehns("ehtt", ehob(int ), (int)80);
        }
        var8_2 = gg.c;
        v1 /* !! */  = gg.kr;
        if (true) ** GOTO lbl11
        block38: while (true) {
            v1 /* !! */  = (long)(v2 - gg.ehns("ehtu", ehpe(int ), (int)72));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -236332464: {
                    break block38;
                }
                case 1938376215: {
                    v2 = gg.ehns("ehtv", ehpe(int ), (int)73);
                    continue block38;
                }
                case 2054303957: {
                    v2 = gg.ehns("ehtw", ehpe(int ), (int)74);
                    continue block38;
                }
            }
            break;
        }
        var7_3 /* !! */  = gg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("ehtx", ehpe(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gg.ehns("ehty", ehob(int ), (int)81)) break;
            v3 /* !! */  = (long)gg.ehns("ehtz", ehob(int ), (int)82);
        }
        var6_4 = gg.a;
        if (!var8_2) ** GOTO lbl33
        throw null;
        {
            if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var6_4 || var6_4) continue block40;
                var2_5 = new kg[9];
                if (var6_4 || var6_4) continue block40;
                var3_6 = gg.ehns("ehua", ehob(int ), (int)83);
                if (var6_4) continue block40;
                do {
                    if (var6_4 || var6_4) continue block40;
                    if (var3_6 >= var2_5.length) ** GOTO lbl114
                    if (var6_4 || var6_4) continue block40;
                    var4_7 = var3_6 * gg.ehns("ehub", ehob(int ), (int)84);
                    if (var6_4 || var6_4) continue block40;
                    var5_8 = var4_7 + gg.ehns("ehuc", ehob(int ), (int)85);
                    if (var6_4 || var6_4) continue block40;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("ehud", ehpe(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == gg.ehns("ehue", ehob(int ), (int)86)) break;
                        v4 /* !! */  = (long)gg.ehns("ehuf", ehob(int ), (int)87);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = gg.kr - gg.ehns("ehug", ehpe(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == gg.ehns("ehuh", ehob(int ), (int)88)) break;
                        v5 /* !! */  = (long)gg.ehns("ehui", ehob(int ), (int)89);
                    }
                    v6 = var1_1 + " " + (int)var4_7 + "-" + (int)var5_8;
                    v7 /* !! */  = gg.kr;
                    if (true) ** GOTO lbl61
                    block44: while (true) {
                        v7 /* !! */  = (long)(gg.ehns("ehuk", ehpe(int ), (int)79) - gg.ehns("ehuj", ehpe(int ), (int)78));
lbl61:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -236332464: {
                                break block44;
                            }
                            case 1644912399: {
                                continue block44;
                            }
                        }
                        break;
                    }
                    v8 = "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e " + var1_1 + " \u043f\u0440\u0438 \u0443\u0433\u043b\u0435 " + (int)var4_7 + "-" + (int)var5_8 + " \u0433\u0440\u0430\u0434\u0443\u0441\u043e\u0432";
                    v9 = gg.ehns("ehul", ehnp(int ), (int)90);
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = gg.kr - gg.ehns("ehum", ehpe(int ), (int)80)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == gg.ehns("ehun", ehob(int ), (int)91)) break;
                        v10 /* !! */  = (long)gg.ehns("ehuo", ehob(int ), (int)92);
                    }
                    v11 = new kg(v6, v8, (float)v9);
                    v12 = gg.ehns("ehup", ehnp(int ), (int)93);
                    v13 = gg.ehns("ehuq", ehnp(int ), (int)94);
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = gg.kr - gg.ehns("ehur", ehpe(int ), (int)81)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == gg.ehns("ehus", ehob(int ), (int)95)) break;
                        v14 /* !! */  = (long)gg.ehns("ehut", ehob(int ), (int)96);
                    }
                    v15 = v11.range((float)v12, (float)v13);
                    v16 = gg.ehns("ehuu", ehnp(int ), (int)97);
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = gg.kr - gg.ehns("ehuv", ehpe(int ), (int)82)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gg.ehns("ehuw", ehob(int ), (int)98)) break;
                        v17 /* !! */  = (long)gg.ehns("ehux", ehob(int ), (int)99);
                    }
                    v18 = v15.step((float)v16);
                    v19 /* !! */  = gg.kr;
                    if (true) ** GOTO lbl93
                    block48: while (true) {
                        v19 /* !! */  = (long)(v20 - gg.ehns("ehuy", ehpe(int ), (int)83));
lbl93:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -1660997735: {
                                v20 = gg.ehns("ehuz", ehpe(int ), (int)84);
                                continue block48;
                            }
                            case -236332464: {
                                break block48;
                            }
                            case 749882647: {
                                v20 = gg.ehns("ehva", ehpe(int ), (int)85);
                                continue block48;
                            }
                        }
                        break;
                    }
                    v21 = (Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$createAngleSettings$4(), ()Ljava/lang/Boolean;)((gg)this);
                    while (true) {
                        if ((v22 = (cfr_temp_7 = gg.kr - gg.ehns("ehvb", ehpe(int ), (int)86)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 == gg.ehns("ehvc", ehob(int ), (int)100)) break;
                        v22 = 811669545;
                    }
                    var2_5[var3_6] = v18.visible(v21);
                    if (var6_4 || var6_4) continue block40;
                    ++var3_6;
                    if (var6_4) continue block40;
                } while (!var8_2);
                throw null;
lbl114:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                continue block40;
                return var2_5;
lbl117:
                // 4 sources

                case 0: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvd", ehob(int ), (int)101);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl122:
                // 2 sources

                case 1: {
                    var7_3 /* !! */  = (int)gg.ehns("ehve", ehob(int ), (int)102);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
                case 2: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvf", ehob(int ), (int)103);
                    if (!var8_2) ** GOTO lbl117
                    throw null;
                }
lbl131:
                // 3 sources

                case 3: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvg", ehob(int ), (int)104);
                    if (!var8_2) ** GOTO lbl117
                    throw null;
                }
lbl135:
                // 3 sources

                case 4: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvh", ehob(int ), (int)105);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl150
                }
lbl140:
                // 3 sources

                case 5: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvi", ehob(int ), (int)106);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl145:
                // 3 sources

                case 6: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvj", ehob(int ), (int)107);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl150:
                // 2 sources

                case 7: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvk", ehob(int ), (int)108);
                    if (!var8_2) ** GOTO lbl117
                    throw null;
                }
lbl154:
                // 2 sources

                case 8: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvl", ehob(int ), (int)109);
                    if (!var8_2) ** GOTO lbl140
                    throw null;
                }
                case 9: {
                    do {
                        var7_3 /* !! */  = (int)gg.ehns("ehvm", ehob(int ), (int)110);
                    } while (!var8_2);
                    throw null;
                }
                case 10: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvn", ehob(int ), (int)111);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
                case 11: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvo", ehob(int ), (int)112);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl198
                }
lbl173:
                // 2 sources

                case 12: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvp", ehob(int ), (int)113);
                    if (!var8_2) ** GOTO lbl135
                    throw null;
                }
                case 13: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvq", ehob(int ), (int)114);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
                case 14: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvr", ehob(int ), (int)115);
                    if (!var8_2) ** GOTO lbl131
                    throw null;
                }
lbl186:
                // 2 sources

                case 15: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvs", ehob(int ), (int)116);
                    if (!var8_2) ** GOTO lbl145
                    throw null;
                }
lbl190:
                // 2 sources

                case 16: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvt", ehob(int ), (int)117);
                    if (var8_2) {
                        throw null;
                    }
                }
                case 17: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvu", ehob(int ), (int)118);
                    if (!var8_2) ** GOTO lbl131
                    throw null;
                }
lbl198:
                // 2 sources

                case 18: {
                    var7_3 /* !! */  = (int)gg.ehns("ehvv", ehob(int ), (int)119);
                    if (!var8_2) ** GOTO lbl140
                    throw null;
                }
                case 19: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_3 /* !! */  = (int)gg.ehns("ehvw", ehob(int ), (int)120);
                        if (!var8_2) ** GOTO lbl122
                        throw null;
                    }
                }
                case 20: 
            }
        }
        var7_3 /* !! */  = (int)gg.ehns("ehvx", ehob(int ), (int)121);
        ** while (!var8_2)
lbl210:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void setValues(kg[] var1_1, float ... var2_2) {
        v0 /* !! */  = gg.kr;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - gg.ehns("eifg", ehpe(int ), (int)133));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1919843835: {
                    v1 = gg.ehns("eifi", ehpe(int ), (int)134);
                    continue block32;
                }
                case -1445770500: {
                    v1 = gg.ehns("eifj", ehpe(int ), (int)135);
                    continue block32;
                }
                case -236332464: {
                    break block32;
                }
                case 435084380: {
                    v1 = gg.ehns("eifl", ehpe(int ), (int)136);
                    continue block32;
                }
            }
            break;
        }
        var6_3 = gg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eifs", ehpe(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gg.ehns("eifu", ehob(int ), (int)193)) break;
            v2 /* !! */  = (long)gg.ehns("eifv", ehob(int ), (int)194);
        }
        var5_4 /* !! */  = gg.b;
        v3 /* !! */  = gg.kr;
        if (true) ** GOTO lbl29
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - gg.ehns("eifw", ehpe(int ), (int)138));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -258970272: {
                    v4 = gg.ehns("eifx", ehpe(int ), (int)139);
                    continue block34;
                }
                case -236332464: {
                    break block34;
                }
                case 916696528: {
                    v4 = gg.ehns("eify", ehpe(int ), (int)140);
                    continue block34;
                }
            }
            break;
        }
        var4_5 = gg.a;
        if (var6_3) {
            throw null;
lbl41:
            // 7 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl41
        var3_6 = gg.ehns("eigf", ehob(int ), (int)195);
        if (var4_5) ** GOTO lbl41
        block36: while (true) {
            if (var4_5 || var4_5) ** GOTO lbl41
            if (var3_6 >= var1_1.length) ** GOTO lbl77
            if (var4_5) ** GOTO lbl41
            if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    v5 = var1_1[var3_6];
                    v6 = var2_2[var3_6];
                    v7 /* !! */  = gg.kr;
                    if (true) ** GOTO lbl59
                    block37: while (true) {
                        v7 /* !! */  = (long)(v8 - gg.ehns("eigh", ehpe(int ), (int)141));
lbl59:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1462579934: {
                                v8 = gg.ehns("eigi", ehpe(int ), (int)142);
                                continue block37;
                            }
                            case -1108405880: {
                                v8 = gg.ehns("eigj", ehpe(int ), (int)143);
                                continue block37;
                            }
                            case -428778489: {
                                v8 = gg.ehns("eigk", ehpe(int ), (int)144);
                                continue block37;
                            }
                            case -236332464: {
                                break block37;
                            }
                        }
                        break;
                    }
                    v5.setValue(v6);
                    if (var4_5) ** GOTO lbl41
                    ++var3_6;
                    if (var4_5) ** GOTO lbl41
                    if (!var6_3) continue block36;
                    throw null;
                }
lbl77:
                // 1 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
                case 0: {
                    var5_4 /* !! */  = (int)gg.ehns("eign", ehob(int ), (int)196);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 1: {
                    var5_4 /* !! */  = (int)gg.ehns("eigp", ehob(int ), (int)197);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl126
                }
lbl90:
                // 3 sources

                case 2: {
                    var5_4 /* !! */  = (int)gg.ehns("eigr", ehob(int ), (int)198);
                    if (var6_3) {
                        throw null;
                    }
                }
lbl94:
                // 4 sources

                case 3: {
                    var5_4 /* !! */  = (int)gg.ehns("eigs", ehob(int ), (int)199);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl99:
                // 3 sources

                case 4: {
                    var5_4 /* !! */  = (int)gg.ehns("eigt", ehob(int ), (int)200);
                    if (!var6_3) ** GOTO lbl90
                    throw null;
                }
                case 5: {
                    var5_4 /* !! */  = (int)gg.ehns("eigv", ehob(int ), (int)201);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 6: {
                    var5_4 /* !! */  = (int)gg.ehns("eigy", ehob(int ), (int)202);
                    if (!var6_3) ** GOTO lbl94
                    throw null;
                }
lbl112:
                // 3 sources

                case 7: {
                    var5_4 /* !! */  = (int)gg.ehns("eiha", ehob(int ), (int)203);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl126
                }
                case 8: {
                    do {
                        var5_4 /* !! */  = (int)gg.ehns("eihb", ehob(int ), (int)204);
                    } while (!var6_3);
                    throw null;
                }
lbl122:
                // 2 sources

                case 9: {
                    var5_4 /* !! */  = (int)gg.ehns("eihh", ehob(int ), (int)205);
                    if (!var6_3) ** GOTO lbl99
                    throw null;
                }
lbl126:
                // 3 sources

                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_4 /* !! */  = (int)gg.ehns("eihj", ehob(int ), (int)206);
                        if (!var6_3) ** GOTO lbl90
                        throw null;
                    }
                }
                case 11: {
                    var5_4 /* !! */  = (int)gg.ehns("eihl", ehob(int ), (int)207);
                    if (!var6_3) ** GOTO lbl99
                    throw null;
                }
                case 12: 
            }
            break;
        }
        var5_4 /* !! */  = (int)gg.ehns("eihm", ehob(int ), (int)208);
        ** while (!var6_3)
lbl138:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eity() {
        gg.ehpf[100] = 8602058458974110547L;
        gg.ehpf[101] = 7192876942125231016L;
        gg.ehpf[102] = 5868845360771316951L;
        gg.ehpf[103] = 1877201946313241925L;
        gg.ehpf[104] = -2657275836093128971L;
        gg.ehpf[105] = 9192793427585237619L;
        gg.ehpf[106] = 2632556689000614167L;
        gg.ehpf[107] = -1474649705702865551L;
        gg.ehpf[108] = 4375534487644945614L;
        gg.ehpf[109] = -3310482623839048316L;
        gg.ehpf[110] = -7629589283831969403L;
        gg.ehpf[111] = 7880198995519759228L;
        gg.ehpf[112] = 1789110348833701317L;
        gg.ehpf[113] = 3889378859866573734L;
        gg.ehpf[114] = 5128439245999238658L;
        gg.ehpf[115] = -7960022838246790111L;
        gg.ehpf[116] = -2348706315830195530L;
        gg.ehpf[117] = -601671686518018431L;
        gg.ehpf[118] = 4860867159614226846L;
        gg.ehpf[119] = 1095591819461741841L;
        gg.ehpf[120] = -4597893827424453207L;
        gg.ehpf[121] = -2314248057292658405L;
        gg.ehpf[122] = 833584353586527250L;
        gg.ehpf[123] = -2547169212651942518L;
        gg.ehpf[124] = 6762840040116239346L;
        gg.ehpf[125] = -6184865408256750725L;
        gg.ehpf[126] = -1465457361083503878L;
        gg.ehpf[127] = -9134751553153852324L;
        gg.ehpf[128] = 8097743930982460487L;
        gg.ehpf[129] = 8001613708522587552L;
        gg.ehpf[130] = -936760493824734957L;
        gg.ehpf[131] = 5769257815059131689L;
        gg.ehpf[132] = 6834181139718512461L;
        gg.ehpf[133] = 6829956576791353077L;
        gg.ehpf[134] = -3626229021958263113L;
        gg.ehpf[135] = 8257154430640379865L;
        gg.ehpf[136] = 2994809046554731392L;
        gg.ehpf[137] = 3378412179066569263L;
        gg.ehpf[138] = -5733789404597680004L;
        gg.ehpf[139] = -3306851421377680596L;
        gg.ehpf[140] = 6024277698338542423L;
        gg.ehpf[141] = 5778981580411664429L;
        gg.ehpf[142] = -5466552645135223429L;
        gg.ehpf[143] = -182045897450355865L;
        gg.ehpf[144] = -6648958844754384035L;
        gg.ehpf[145] = 4673622790042352913L;
        gg.ehpf[146] = 454290367396789407L;
        gg.ehpf[147] = -3437223927002726195L;
        gg.ehpf[148] = -6158950899676045745L;
        gg.ehpf[149] = -4800182881952906271L;
        gg.ehpf[150] = -2626151349324174437L;
        gg.ehpf[151] = -5756506612687404649L;
        gg.ehpf[152] = -5482890319883856999L;
        gg.ehpf[153] = -4273099588780439133L;
        gg.ehpf[154] = -849406690385495960L;
        gg.ehpf[155] = 4163533783629163867L;
        gg.ehpf[156] = -4861783928710917214L;
        gg.ehpf[157] = -8051407910035510645L;
        gg.ehpf[158] = -2048537063631364220L;
        gg.ehpf[159] = 3228306761691788020L;
        gg.ehpf[160] = -273198469439490723L;
        gg.ehpf[161] = 6394595954125933089L;
        gg.ehpf[162] = 2611978087657746100L;
        gg.ehpf[163] = -2800157548251009954L;
        gg.ehpf[164] = -8417151788253966873L;
        gg.ehpf[165] = 6902606320621120548L;
        gg.ehpf[166] = -2967425823393227309L;
        gg.ehpf[167] = -6783096884947845149L;
        gg.ehpf[168] = -4081462328032881600L;
        gg.ehpf[169] = 5814622799792988562L;
        gg.ehpf[170] = -4368680214548729570L;
        gg.ehpf[171] = -735900172680984822L;
        gg.ehpf[172] = 5755124336485863715L;
        gg.ehpf[173] = -1062916720567158370L;
        gg.ehpf[174] = 2760809960476373747L;
        gg.ehpf[175] = -790556877074902136L;
        gg.ehpf[176] = -8866467647257342641L;
        gg.ehpf[177] = 1140846051262279032L;
        gg.ehpf[178] = -5657512225461905032L;
        gg.ehpf[179] = 5830726966325678865L;
        gg.ehpf[180] = -6660733645267062994L;
        gg.ehpf[181] = 1527123369666173819L;
        gg.ehpf[182] = -2120707101136217819L;
        gg.ehpf[183] = 6475319705035395339L;
        gg.ehpf[184] = 4884526036691778500L;
        gg.ehpf[185] = -5626314190885941883L;
        gg.ehpf[186] = -4787881137273301458L;
        gg.ehpf[187] = -5238880684015580059L;
        gg.ehpf[188] = 3898194648418110825L;
        gg.ehpf[189] = 7373144052510565226L;
        gg.ehpf[190] = 5359116976436891187L;
        gg.ehpf[191] = -2775223391950619319L;
        gg.ehpf[192] = 7810348522912989434L;
        gg.ehpf[193] = -7089744326006625821L;
        gg.ehpf[194] = 7486193369293732675L;
        gg.ehpf[195] = 5692672062367835371L;
        gg.ehpf[196] = -1786559372078230384L;
        gg.ehpf[197] = -7544821425185411479L;
        gg.ehpf[198] = 2363177707987788470L;
        gg.ehpf[199] = -3433649036397959762L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyBravoPreset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("ehzr", ehpe(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gg.ehns("ehzt", ehob(int ), (int)163)) break;
            v0 /* !! */  = (long)gg.ehns("ehzv", ehob(int ), (int)164);
        }
        var3_1 = gg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("ehzx", ehpe(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gg.ehns("ehzy", ehob(int ), (int)165)) break;
            v1 /* !! */  = (long)gg.ehns("ehzz", ehob(int ), (int)166);
        }
        var2_2 /* !! */  = gg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("eiae", ehpe(int ), (int)104)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gg.ehns("eiaf", ehob(int ), (int)167)) break;
            v2 /* !! */  = (long)gg.ehns("eiag", ehob(int ), (int)168);
        }
        var1_3 = gg.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = gg.kr - gg.ehns("eiaj", ehpe(int ), (int)105)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gg.ehns("eial", ehob(int ), (int)169)) break;
                    v3 /* !! */  = (long)gg.ehns("eiam", ehob(int ), (int)170);
                }
                v4 = new float[]{1.64f, 1.65f, 1.66f, 1.67f, 1.68f, 1.69f, 1.93f, 1.96f, 1.96f};
                v5 /* !! */  = gg.kr;
                if (true) ** GOTO lbl40
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - gg.ehns("eiar", ehpe(int ), (int)106));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1074027863: {
                            v6 = gg.ehns("eiax", ehpe(int ), (int)107);
                            continue block25;
                        }
                        case -236332464: {
                            break block25;
                        }
                        case 1417016253: {
                            v6 = gg.ehns("eiay", ehpe(int ), (int)108);
                            continue block25;
                        }
                        case 1578215295: {
                            v6 = gg.ehns("eiaz", ehpe(int ), (int)109);
                            continue block25;
                        }
                    }
                    break;
                }
                this.setValues(this.xzByAngle, v4);
                if (var1_3 || var1_3) ** GOTO lbl-1000
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = gg.kr - gg.ehns("eibc", ehpe(int ), (int)110)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == gg.ehns("eibd", ehob(int ), (int)171)) break;
                    v7 /* !! */  = (long)gg.ehns("eibe", ehob(int ), (int)172);
                }
                v8 = new float[]{1.55f, 1.56f, 1.57f, 1.61f, 1.62f, 1.63f, 1.93f, 1.96f, 1.96f};
                v9 /* !! */  = gg.kr;
                if (true) ** GOTO lbl65
                block27: while (true) {
                    v9 /* !! */  = (long)(gg.ehns("eibn", ehpe(int ), (int)112) - gg.ehns("eibi", ehpe(int ), (int)111));
lbl65:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2014384896: {
                            continue block27;
                        }
                        case -236332464: {
                            break block27;
                        }
                    }
                    break;
                }
                this.setValues(this.yByAngle, v8);
                if (var1_3 || var1_3) continue block23;
                return;
                case 0: {
                    var2_2 /* !! */  = (int)gg.ehns("eibq", ehob(int ), (int)173);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl103
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)gg.ehns("eibs", ehob(int ), (int)174);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)gg.ehns("eibu", ehob(int ), (int)175);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl93
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gg.ehns("eibw", ehob(int ), (int)176);
                        if (!var3_1) break block23;
                        throw null;
                    }
                }
lbl93:
                // 2 sources

                case 4: {
                    var2_2 /* !! */  = (int)gg.ehns("eibx", ehob(int ), (int)177);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl103
                }
                case 5: {
                    do {
                        var2_2 /* !! */  = (int)gg.ehns("eiby", ehob(int ), (int)178);
                    } while (!var3_1);
                    throw null;
                }
lbl103:
                // 3 sources

                case 6: {
                    do {
                        var2_2 /* !! */  = (int)gg.ehns("eice", ehob(int ), (int)179);
                    } while (!var3_1);
                    throw null;
                }
                case 7: 
            }
        }
        var2_2 /* !! */  = (int)gg.ehns("eicg", ehob(int ), (int)180);
        ** while (!var3_1)
lbl111:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eiml", ehpe(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gg.ehns("eimm", ehob(int ), (int)237)) break;
            v0 /* !! */  = (long)gg.ehns("eimo", ehob(int ), (int)238);
        }
        var3_1 = gg.c;
        v1 /* !! */  = gg.kr;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - gg.ehns("eimq", ehpe(int ), (int)183));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2112161213: {
                    v2 = gg.ehns("eims", ehpe(int ), (int)184);
                    continue block26;
                }
                case -1367670752: {
                    v2 = gg.ehns("eina", ehpe(int ), (int)185);
                    continue block26;
                }
                case -236332464: {
                    break block26;
                }
                case 2138942774: {
                    v2 = gg.ehns("einc", ehpe(int ), (int)186);
                    continue block26;
                }
            }
            break;
        }
        var2_2 = gg.b;
        v3 /* !! */  = gg.kr;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(gg.ehns("eine", ehpe(int ), (int)188) - gg.ehns("eind", ehpe(int ), (int)187));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -236332464: {
                    break block27;
                }
                case 153213830: {
                    continue block27;
                }
            }
            break;
        }
        var1_3 = gg.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = gg.kr;
        if (true) ** GOTO lbl44
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - gg.ehns("eing", ehpe(int ), (int)189));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -236332464: {
                    break block29;
                }
                case 418678682: {
                    v5 = gg.ehns("einh", ehpe(int ), (int)190);
                    continue block29;
                }
                case 1021750229: {
                    v5 = gg.ehns("einl", ehpe(int ), (int)191);
                    continue block29;
                }
            }
            break;
        }
        v6 /* !! */  = gg.kr;
        if (true) ** GOTO lbl57
        block30: while (true) {
            v6 /* !! */  = (long)(v7 - gg.ehns("einp", ehpe(int ), (int)192));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1994385051: {
                    v7 = gg.ehns("einr", ehpe(int ), (int)193);
                    continue block30;
                }
                case -236332464: {
                    break block30;
                }
                case 662127152: {
                    v7 = gg.ehns("einw", ehpe(int ), (int)194);
                    continue block30;
                }
            }
            break;
        }
        v8 = this.mode.isSelected("\u0423\u0433\u043b\u043e\u0432\u043e\u0439");
        v9 /* !! */  = gg.kr;
        if (true) ** GOTO lbl71
        block31: while (true) {
            v9 /* !! */  = (long)(v10 - gg.ehns("einy", ehpe(int ), (int)195));
lbl71:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -236332464: {
                    break block31;
                }
                case 1081894630: {
                    v10 = gg.ehns("eioa", ehpe(int ), (int)196);
                    continue block31;
                }
                case 1589108952: {
                    v10 = gg.ehns("eioc", ehpe(int ), (int)197);
                    continue block31;
                }
            }
            break;
        }
        return v8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eiop", ehpe(int ), (int)198)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gg.ehns("eios", ehob(int ), (int)243)) break;
            v0 /* !! */  = (long)gg.ehns("eiou", ehob(int ), (int)244);
        }
        var3_1 = gg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("eiow", ehpe(int ), (int)199)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gg.ehns("eioy", ehob(int ), (int)245)) break;
            v1 /* !! */  = (long)gg.ehns("eioz", ehob(int ), (int)246);
        }
        var2_2 /* !! */  = gg.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("eipa", ehpe(int ), (int)200)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == gg.ehns("eipg", ehob(int ), (int)247)) break;
                    v2 /* !! */  = (long)gg.ehns("eipi", ehob(int ), (int)248);
                }
                var1_3 = gg.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = gg.kr;
                if (true) ** GOTO lbl31
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - gg.ehns("eipk", ehpe(int ), (int)201));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1395063444: {
                            v4 = gg.ehns("eipl", ehpe(int ), (int)202);
                            continue block22;
                        }
                        case -578677457: {
                            v4 = gg.ehns("eipm", ehpe(int ), (int)203);
                            continue block22;
                        }
                        case -236332464: {
                            break block22;
                        }
                        case 747046693: {
                            v4 = gg.ehns("eipn", ehpe(int ), (int)204);
                            continue block22;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gg.kr - gg.ehns("eipp", ehpe(int ), (int)205)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gg.ehns("eipu", ehob(int ), (int)249)) break;
                    v5 /* !! */  = (long)gg.ehns("eipw", ehob(int ), (int)250);
                }
                v6 = this.mode.isSelected("\u0423\u0433\u043b\u043e\u0432\u043e\u0439");
                v7 /* !! */  = gg.kr;
                if (true) ** GOTO lbl53
                block24: while (true) {
                    v7 /* !! */  = (long)(v8 - gg.ehns("eipx", ehpe(int ), (int)206));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -656600745: {
                            v8 = gg.ehns("eipz", ehpe(int ), (int)207);
                            continue block24;
                        }
                        case -425272739: {
                            v8 = gg.ehns("eiqa", ehpe(int ), (int)208);
                            continue block24;
                        }
                        case -236332464: {
                            break block24;
                        }
                        case 1877159733: {
                            v8 = gg.ehns("eiqb", ehpe(int ), (int)209);
                            continue block24;
                        }
                    }
                    break;
                }
                return v6;
            }
lbl66:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gg.ehns("eiqf", ehob(int ), (int)251);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gg.ehns("eiqh", ehob(int ), (int)252);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
            }
lbl76:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gg.ehns("eiqi", ehob(int ), (int)253);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gg.ehns("eiqj", ehob(int ), (int)254);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eisy() {
        gg.ehpf[0] = -4168732527918256706L;
        gg.ehpf[1] = 3378974479686629562L;
        gg.ehpf[2] = -8102103280833483044L;
        gg.ehpf[3] = -2756920271587220656L;
        gg.ehpf[4] = -4970107194055982733L;
        gg.ehpf[5] = 4141174173992611310L;
        gg.ehpf[6] = -7981410937109365339L;
        gg.ehpf[7] = 7156987572844558621L;
        gg.ehpf[8] = -8911367304696127056L;
        gg.ehpf[9] = -8525256274031493057L;
        gg.ehpf[10] = 1041535752213077747L;
        gg.ehpf[11] = -8915758587415994758L;
        gg.ehpf[12] = -5285075727925631900L;
        gg.ehpf[13] = -8956041169980717637L;
        gg.ehpf[14] = 4260161846054538561L;
        gg.ehpf[15] = -1149340504508417124L;
        gg.ehpf[16] = 5277020390640530481L;
        gg.ehpf[17] = -3385863142591826404L;
        gg.ehpf[18] = 5103883282471363758L;
        gg.ehpf[19] = 3027396998612427886L;
        gg.ehpf[20] = -1332802418453988808L;
        gg.ehpf[21] = -4362814087514337123L;
        gg.ehpf[22] = -2581148988409679319L;
        gg.ehpf[23] = -7499787847089071167L;
        gg.ehpf[24] = 4413177598298576313L;
        gg.ehpf[25] = 7247407751660408136L;
        gg.ehpf[26] = -2441824541440709764L;
        gg.ehpf[27] = -3678762530522274123L;
        gg.ehpf[28] = 2170413932111194241L;
        gg.ehpf[29] = -7475191594422654578L;
        gg.ehpf[30] = -3223335467095965521L;
        gg.ehpf[31] = -8663950501192993125L;
        gg.ehpf[32] = 4149348940638982449L;
        gg.ehpf[33] = -7867222390456918454L;
        gg.ehpf[34] = -7528599834745784710L;
        gg.ehpf[35] = 8002338828812122507L;
        gg.ehpf[36] = 3470626558276968602L;
        gg.ehpf[37] = 7074703321263030174L;
        gg.ehpf[38] = 8943949212845395778L;
        gg.ehpf[39] = -7604482702424306058L;
        gg.ehpf[40] = 1736054692640611454L;
        gg.ehpf[41] = -5826934227439490978L;
        gg.ehpf[42] = -1543067616007926252L;
        gg.ehpf[43] = -1854999682892899897L;
        gg.ehpf[44] = 340787824097025582L;
        gg.ehpf[45] = -2674152708394425593L;
        gg.ehpf[46] = -2348040664610935334L;
        gg.ehpf[47] = -5983904812567695716L;
        gg.ehpf[48] = -7621663266287394667L;
        gg.ehpf[49] = -804985127602764655L;
        gg.ehpf[50] = 7194417310868058706L;
        gg.ehpf[51] = 5531178910174035875L;
        gg.ehpf[52] = 7274228032505537041L;
        gg.ehpf[53] = -2848939826643247453L;
        gg.ehpf[54] = -1057520810859383164L;
        gg.ehpf[55] = 2631970418910856606L;
        gg.ehpf[56] = -2283881687175946823L;
        gg.ehpf[57] = -6758063531711575302L;
        gg.ehpf[58] = 7881595784723771992L;
        gg.ehpf[59] = 2272833305721975627L;
        gg.ehpf[60] = -5267065896955730809L;
        gg.ehpf[61] = -4392166541270120455L;
        gg.ehpf[62] = 3187973357101345738L;
        gg.ehpf[63] = 8801556460292569726L;
        gg.ehpf[64] = 213939281615056781L;
        gg.ehpf[65] = -333297058032474753L;
        gg.ehpf[66] = 7093521995378147118L;
        gg.ehpf[67] = -5418372821066625011L;
        gg.ehpf[68] = 3646317052229587799L;
        gg.ehpf[69] = -6614608968237025947L;
        gg.ehpf[70] = 5455542140852286455L;
        gg.ehpf[71] = -7829176232355707752L;
        gg.ehpf[72] = -1146404506282634245L;
        gg.ehpf[73] = 5151251426780466911L;
        gg.ehpf[74] = 3607125987519438301L;
        gg.ehpf[75] = -327631308537873077L;
        gg.ehpf[76] = 6227409770060077446L;
        gg.ehpf[77] = -6843614908469376959L;
        gg.ehpf[78] = 16251444023592449L;
        gg.ehpf[79] = 4347760266504882506L;
        gg.ehpf[80] = -5727723992751133125L;
        gg.ehpf[81] = 1377323059142400507L;
        gg.ehpf[82] = -5277595993161684704L;
        gg.ehpf[83] = 7486373840498262746L;
        gg.ehpf[84] = -6600579273986290020L;
        gg.ehpf[85] = -8011478550172060855L;
        gg.ehpf[86] = -7596495048162854742L;
        gg.ehpf[87] = 4978554076703738555L;
        gg.ehpf[88] = -358878728055961354L;
        gg.ehpf[89] = -7295908478304295936L;
        gg.ehpf[90] = -7689993704085481311L;
        gg.ehpf[91] = -2817249972920955905L;
        gg.ehpf[92] = -2992977008790227842L;
        gg.ehpf[93] = 3052133232495309196L;
        gg.ehpf[94] = 1135304400494875173L;
        gg.ehpf[95] = 2346926421045681045L;
        gg.ehpf[96] = -8679767275424755586L;
        gg.ehpf[97] = -4482562771015656115L;
        gg.ehpf[98] = 6614940007969967258L;
        gg.ehpf[99] = 440119450890936528L;
    }

    private static /* synthetic */ void eivb() {
        gg.ehpg[0] = 1965272718788921444L;
        gg.ehpg[1] = 485948610674067756L;
        gg.ehpg[2] = -7187498128541037680L;
        gg.ehpg[3] = -8446523756684682285L;
        gg.ehpg[4] = 6479860632024218064L;
        gg.ehpg[5] = 7823926387038246629L;
        gg.ehpg[6] = -1854326026643191085L;
        gg.ehpg[7] = -7598716792732466083L;
        gg.ehpg[8] = -1515261578834691314L;
        gg.ehpg[9] = -3928864395895228945L;
        gg.ehpg[10] = 1076226386889492469L;
        gg.ehpg[11] = -4719636065946881976L;
        gg.ehpg[12] = -1618318443370654477L;
        gg.ehpg[13] = -2116361338608029394L;
        gg.ehpg[14] = -8187645547458402459L;
        gg.ehpg[15] = 1135932391107711881L;
        gg.ehpg[16] = 314420660146909984L;
        gg.ehpg[17] = -2980393377583161245L;
        gg.ehpg[18] = -8108130087557347794L;
        gg.ehpg[19] = -801395164065839645L;
        gg.ehpg[20] = 6547189175648618775L;
        gg.ehpg[21] = 8632558396384946503L;
        gg.ehpg[22] = -8571629288501221392L;
        gg.ehpg[23] = 7585066069756439468L;
        gg.ehpg[24] = -2432621433442810980L;
        gg.ehpg[25] = -3833558974083893770L;
        gg.ehpg[26] = 6400690237059752760L;
        gg.ehpg[27] = 352585588482424598L;
        gg.ehpg[28] = 6239592564888299278L;
        gg.ehpg[29] = 517009358954982694L;
        gg.ehpg[30] = -8048115847072978710L;
        gg.ehpg[31] = 7670251486521574317L;
        gg.ehpg[32] = 7862413561083186298L;
        gg.ehpg[33] = 1373345844859424356L;
        gg.ehpg[34] = -2261725843940390286L;
        gg.ehpg[35] = -3618940067554532580L;
        gg.ehpg[36] = 5920350183654142108L;
        gg.ehpg[37] = -399792602320486735L;
        gg.ehpg[38] = 7613821684612149193L;
        gg.ehpg[39] = 3116283016675401220L;
        gg.ehpg[40] = 2812698855674544896L;
        gg.ehpg[41] = 1308767127895916963L;
        gg.ehpg[42] = -532895345499641914L;
        gg.ehpg[43] = 4038361439448923788L;
        gg.ehpg[44] = 3427614053881749155L;
        gg.ehpg[45] = -4530250999089781301L;
        gg.ehpg[46] = 7819658019872984386L;
        gg.ehpg[47] = -991413973743198467L;
        gg.ehpg[48] = -8923265298534080341L;
        gg.ehpg[49] = 6372793987893405487L;
        gg.ehpg[50] = 812088446162878174L;
        gg.ehpg[51] = 5368870959236106858L;
        gg.ehpg[52] = -339871078678534321L;
        gg.ehpg[53] = -8112594516160646798L;
        gg.ehpg[54] = 2764777061457066971L;
        gg.ehpg[55] = 2871889563980761771L;
        gg.ehpg[56] = -6067186485219582537L;
        gg.ehpg[57] = -7541853543636085512L;
        gg.ehpg[58] = 6509025626282259811L;
        gg.ehpg[59] = -3139656689492278120L;
        gg.ehpg[60] = 3122730900144718787L;
        gg.ehpg[61] = -2208460953273595976L;
        gg.ehpg[62] = -679573825213668198L;
        gg.ehpg[63] = 2951497090949161828L;
        gg.ehpg[64] = -7056060864894852608L;
        gg.ehpg[65] = -4074580154715729181L;
        gg.ehpg[66] = 5952851098455580478L;
        gg.ehpg[67] = 3105287506863163198L;
        gg.ehpg[68] = -1563817851062530564L;
        gg.ehpg[69] = 2139128285682309891L;
        gg.ehpg[70] = -4895390484483632738L;
        gg.ehpg[71] = -8306038898454254824L;
        gg.ehpg[72] = 3555447240370593938L;
        gg.ehpg[73] = -1732234642439013576L;
        gg.ehpg[74] = 398207244630695451L;
        gg.ehpg[75] = -8690914894464027160L;
        gg.ehpg[76] = -4974855845668136165L;
        gg.ehpg[77] = -5792857802679849265L;
        gg.ehpg[78] = 3756418252789458289L;
        gg.ehpg[79] = 1684097111627978746L;
        gg.ehpg[80] = -9194637208839784019L;
        gg.ehpg[81] = 7712933117825001645L;
        gg.ehpg[82] = 5758064157001999252L;
        gg.ehpg[83] = 9005271817425411700L;
        gg.ehpg[84] = -6208600142163199358L;
        gg.ehpg[85] = 8071621188861261407L;
        gg.ehpg[86] = -8682476879029306718L;
        gg.ehpg[87] = 8450007716105262683L;
        gg.ehpg[88] = 9101184323064495004L;
        gg.ehpg[89] = 6142455028032052953L;
        gg.ehpg[90] = 11110446146008062L;
        gg.ehpg[91] = -7498661765817581427L;
        gg.ehpg[92] = -4244179432142895329L;
        gg.ehpg[93] = -2731703277496814131L;
        gg.ehpg[94] = -9104625400966387129L;
        gg.ehpg[95] = 1528636144347694179L;
        gg.ehpg[96] = 8282111876279730481L;
        gg.ehpg[97] = 6517720000261311259L;
        gg.ehpg[98] = -2181718163509483578L;
        gg.ehpg[99] = 7454802571922576130L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$2() {
        while (true) {
            block39: {
                if ((v0 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("eikv", ehpe(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != gg.ehns("eikx", ehob(int ), (int)227)) break block39;
                var3_1 = gg.c;
                v1 /* !! */  = gg.kr;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)gg.ehns("eiky", ehob(int ), (int)228);
        }
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - gg.ehns("eila", ehpe(int ), (int)169));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -236332464: {
                    break block24;
                }
                case 1047630933: {
                    v2 = gg.ehns("eilb", ehpe(int ), (int)170);
                    continue block24;
                }
                case 1135688164: {
                    v2 = gg.ehns("eilc", ehpe(int ), (int)171);
                    continue block24;
                }
                case 1657518663: {
                    v2 = gg.ehns("eilh", ehpe(int ), (int)172);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = gg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("eilj", ehpe(int ), (int)173)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gg.ehns("eilk", ehob(int ), (int)229)) {
                var1_3 = gg.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)gg.ehns("eill", ehob(int ), (int)230);
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v4 /* !! */  = gg.kr;
                    block27: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1916510734: {
                                v5 = gg.ehns("eiln", ehpe(int ), (int)175);
                                ** GOTO lbl53
                            }
                            case -236332464: {
                                break block27;
                            }
                            case 261204045: {
                                v5 = gg.ehns("eilp", ehpe(int ), (int)176);
lbl53:
                                // 2 sources

                                v4 /* !! */  = (long)(v5 - gg.ehns("eilm", ehpe(int ), (int)174));
                                continue block27;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = gg.kr;
                    block28: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -236332464: {
                                break block28;
                            }
                            case -151124521: {
                                v7 = gg.ehns("eilw", ehpe(int ), (int)178);
                                ** GOTO lbl68
                            }
                            case 79771177: {
                                v7 = gg.ehns("eilx", ehpe(int ), (int)179);
                                ** GOTO lbl68
                            }
                            case 1025998431: {
                                v7 = gg.ehns("eily", ehpe(int ), (int)180);
lbl68:
                                // 3 sources

                                v6 /* !! */  = (long)(v7 - gg.ehns("eilu", ehpe(int ), (int)177));
                                continue block28;
                            }
                        }
                        break;
                    }
                    v8 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_3 = gg.kr - gg.ehns("eimb", ehpe(int ), (int)181)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == gg.ehns("eimd", ehob(int ), (int)231)) {
                            return v8;
                        }
                        v9 /* !! */  = (long)gg.ehns("eimf", ehob(int ), (int)232);
                    }
                }
                case 0: {
                    ** GOTO lbl89
                }
                case 2: {
                    var2_2 /* !! */  = (int)gg.ehns("eimj", ehob(int ), (int)235);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block26;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)gg.ehns("eimk", ehob(int ), (int)236);
                    if (var3_1) {
                        throw null;
                    }
lbl89:
                    // 3 sources

                    var2_2 /* !! */  = (int)gg.ehns("eimg", ehob(int ), (int)233);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)gg.ehns("eimi", ehob(int ), (int)234);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$3() {
        v0 /* !! */  = gg.kr;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(gg.ehns("eijk", ehpe(int ), (int)157) - gg.ehns("eiji", ehpe(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1545380349: {
                    continue block24;
                }
                case -236332464: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = gg.c;
        v1 /* !! */  = gg.kr;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - gg.ehns("eijm", ehpe(int ), (int)158));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -236332464: {
                    break block25;
                }
                case 262219235: {
                    v2 = gg.ehns("eijn", ehpe(int ), (int)159);
                    continue block25;
                }
                case 1366844169: {
                    v2 = gg.ehns("eijo", ehpe(int ), (int)160);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = gg.b;
        v3 /* !! */  = gg.kr;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - gg.ehns("eijq", ehpe(int ), (int)161));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -236332464: {
                    break block26;
                }
                case 848838255: {
                    v4 = gg.ehns("eijr", ehpe(int ), (int)162);
                    continue block26;
                }
                case 1923822428: {
                    v4 = gg.ehns("eijv", ehpe(int ), (int)163);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = gg.a;
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

                if (var1_3 || var1_3) continue block27;
                v5 /* !! */  = gg.kr;
                if (true) ** GOTO lbl50
                block28: while (true) {
                    v5 /* !! */  = (long)(gg.ehns("eijy", ehpe(int ), (int)165) - gg.ehns("eijx", ehpe(int ), (int)164));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -236332464: {
                            break block28;
                        }
                        case 394700895: {
                            continue block28;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eika", ehpe(int ), (int)166)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gg.ehns("eikc", ehob(int ), (int)219)) break;
                    v6 /* !! */  = (long)gg.ehns("eike", ehob(int ), (int)220);
                }
                v7 = this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("eikf", ehpe(int ), (int)167)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gg.ehns("eikj", ehob(int ), (int)221)) break;
                    v8 /* !! */  = (long)gg.ehns("eikk", ehob(int ), (int)222);
                }
                return v7;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gg.ehns("eikm", ehob(int ), (int)223);
                        if (!var3_1) break block27;
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)gg.ehns("eiko", ehob(int ), (int)224);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)gg.ehns("eikp", ehob(int ), (int)225);
                    if (!var3_1) break block27;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)gg.ehns("eikr", ehob(int ), (int)226);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onFirework(by var1_1) {
        block178: {
            block177: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("ehph", ehpe(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gg.ehns("ehpi", ehob(int ), (int)36)) break;
                    v0 /* !! */  = (long)gg.ehns("ehpj", ehob(int ), (int)37);
                }
                var4_2 = gg.c;
                v1 /* !! */  = gg.kr;
                if (true) ** GOTO lbl11
                block127: while (true) {
                    v1 /* !! */  = (long)(v2 - gg.ehns("ehpk", ehpe(int ), (int)1));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -878975371: {
                            v2 = gg.ehns("ehpl", ehpe(int ), (int)2);
                            continue block127;
                        }
                        case -236332464: {
                            break block127;
                        }
                        case 1550069832: {
                            v2 = gg.ehns("ehpm", ehpe(int ), (int)3);
                            continue block127;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = gg.b;
                v3 /* !! */  = gg.kr;
                if (true) ** GOTO lbl25
                block128: while (true) {
                    v3 /* !! */  = (long)(gg.ehns("ehpo", ehpe(int ), (int)5) - gg.ehns("ehpn", ehpe(int ), (int)4));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -343922912: {
                            continue block128;
                        }
                        case -236332464: {
                            break block128;
                        }
                    }
                    break;
                }
                var2_4 = gg.a;
                if (var4_2) {
                    throw null;
lbl33:
                    // 12 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("ehpp", ehpe(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gg.ehns("ehpq", ehob(int ), (int)38)) break;
                    v4 /* !! */  = (long)gg.ehns("ehpr", ehob(int ), (int)39);
                }
                v5 /* !! */  = gg.kr;
                if (true) ** GOTO lbl45
                block131: while (true) {
                    v5 /* !! */  = (long)(v6 - gg.ehns("ehps", ehpe(int ), (int)7));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2124201459: {
                            v6 = gg.ehns("ehpt", ehpe(int ), (int)8);
                            continue block131;
                        }
                        case -1725571787: {
                            v6 = gg.ehns("ehpu", ehpe(int ), (int)9);
                            continue block131;
                        }
                        case -236332464: {
                            break block131;
                        }
                        case 1621053828: {
                            v6 = gg.ehns("ehpv", ehpe(int ), (int)10);
                            continue block131;
                        }
                    }
                    break;
                }
                if (gg.mc.field_1724 == null) break block177;
                if (var2_4) ** GOTO lbl33
                v7 /* !! */  = gg.kr;
                if (true) ** GOTO lbl63
                block132: while (true) {
                    v7 /* !! */  = (long)(v8 - gg.ehns("ehpw", ehpe(int ), (int)11));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -236332464: {
                            break block132;
                        }
                        case -13652814: {
                            v8 = gg.ehns("ehpx", ehpe(int ), (int)12);
                            continue block132;
                        }
                        case 149616508: {
                            v8 = gg.ehns("ehpy", ehpe(int ), (int)13);
                            continue block132;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = gg.kr - gg.ehns("ehpz", ehpe(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gg.ehns("ehqa", ehob(int ), (int)40)) break;
                    v9 /* !! */  = (long)gg.ehns("ehqb", ehob(int ), (int)41);
                }
                v10 = gg.mc.field_1724;
                v11 /* !! */  = gg.kr;
                if (true) ** GOTO lbl82
                block134: while (true) {
                    v11 /* !! */  = (long)(v12 - gg.ehns("ehqc", ehpe(int ), (int)15));
lbl82:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1234609670: {
                            v12 = gg.ehns("ehqd", ehpe(int ), (int)16);
                            continue block134;
                        }
                        case -236332464: {
                            break block134;
                        }
                        case 1639627: {
                            v12 = gg.ehns("ehqe", ehpe(int ), (int)17);
                            continue block134;
                        }
                    }
                    break;
                }
                if (v10.method_6128()) break block178;
                if (var2_4) ** GOTO lbl33
            }
            if (var2_4 || var2_4) ** GOTO lbl33
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        v13 /* !! */  = gg.kr;
        if (true) ** GOTO lbl102
        block135: while (true) {
            v13 /* !! */  = (long)(v14 - gg.ehns("ehqf", ehpe(int ), (int)18));
lbl102:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -236332464: {
                    break block135;
                }
                case 778239529: {
                    v14 = gg.ehns("ehqg", ehpe(int ), (int)19);
                    continue block135;
                }
                case 1033212932: {
                    v14 = gg.ehns("ehqh", ehpe(int ), (int)20);
                    continue block135;
                }
                case 1412287229: {
                    v14 = gg.ehns("ehqi", ehpe(int ), (int)21);
                    continue block135;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = gg.kr - gg.ehns("ehqj", ehpe(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == gg.ehns("ehqk", ehob(int ), (int)42)) break;
            v15 /* !! */  = (long)gg.ehns("ehql", ehob(int ), (int)43);
        }
        if (!this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")) ** GOTO lbl185
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl33
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = gg.kr - gg.ehns("ehqm", ehpe(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == gg.ehns("ehqn", ehob(int ), (int)44)) break;
                    v16 /* !! */  = (long)gg.ehns("ehqo", ehob(int ), (int)45);
                }
                v17 /* !! */  = gg.kr;
                if (true) ** GOTO lbl134
                block138: while (true) {
                    v17 /* !! */  = (long)(v18 - gg.ehns("ehqp", ehpe(int ), (int)24));
lbl134:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1456128806: {
                            v18 = gg.ehns("ehqq", ehpe(int ), (int)25);
                            continue block138;
                        }
                        case -236332464: {
                            break block138;
                        }
                        case 274271836: {
                            v18 = gg.ehns("ehqr", ehpe(int ), (int)26);
                            continue block138;
                        }
                    }
                    break;
                }
                v19 = this.xzSpeed.getValue();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = gg.kr - gg.ehns("ehqs", ehpe(int ), (int)27)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == gg.ehns("ehqt", ehob(int ), (int)46)) break;
                    v20 /* !! */  = (long)gg.ehns("ehqu", ehob(int ), (int)47);
                }
                var1_1.setBoostMultiplier(v19);
                if (var2_4 || var2_4) ** GOTO lbl33
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = gg.kr - gg.ehns("ehqv", ehpe(int ), (int)28)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gg.ehns("ehqw", ehob(int ), (int)48)) break;
                    v21 /* !! */  = (long)gg.ehns("ehqx", ehob(int ), (int)49);
                }
                v22 /* !! */  = gg.kr;
                if (true) ** GOTO lbl160
                block141: while (true) {
                    v22 /* !! */  = (long)(v23 - gg.ehns("ehqy", ehpe(int ), (int)29));
lbl160:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1208202314: {
                            v23 = gg.ehns("ehqz", ehpe(int ), (int)30);
                            continue block141;
                        }
                        case -1107551150: {
                            v23 = gg.ehns("ehra", ehpe(int ), (int)31);
                            continue block141;
                        }
                        case -584810296: {
                            v23 = gg.ehns("ehrb", ehpe(int ), (int)32);
                            continue block141;
                        }
                        case -236332464: {
                            break block141;
                        }
                    }
                    break;
                }
                v24 = this.ySpeed.getValue();
                v25 /* !! */  = gg.kr;
                if (true) ** GOTO lbl177
                block142: while (true) {
                    v25 /* !! */  = (long)(gg.ehns("ehrd", ehpe(int ), (int)34) - gg.ehns("ehrc", ehpe(int ), (int)33));
lbl177:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -568585712: {
                            continue block142;
                        }
                        case -236332464: {
                            break block142;
                        }
                    }
                    break;
                }
                var1_1.setYSpeed(v24);
                if (var2_4 || var2_4) ** GOTO lbl33
                return;
            }
lbl185:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl33
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_7 = gg.kr - gg.ehns("ehre", ehpe(int ), (int)35)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == gg.ehns("ehrf", ehob(int ), (int)50)) break;
                v26 /* !! */  = (long)gg.ehns("ehrg", ehob(int ), (int)51);
            }
            v27 /* !! */  = gg.kr;
            if (true) ** GOTO lbl195
            block144: while (true) {
                v27 /* !! */  = (long)(v28 - gg.ehns("ehrh", ehpe(int ), (int)36));
lbl195:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -236332464: {
                        break block144;
                    }
                    case 1674960174: {
                        v28 = gg.ehns("ehri", ehpe(int ), (int)37);
                        continue block144;
                    }
                    case 2079886639: {
                        v28 = gg.ehns("ehrj", ehpe(int ), (int)38);
                        continue block144;
                    }
                }
                break;
            }
            v29 /* !! */  = gg.kr;
            if (true) ** GOTO lbl208
            block145: while (true) {
                v29 /* !! */  = (long)(v30 - gg.ehns("ehrk", ehpe(int ), (int)39));
lbl208:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -2067219091: {
                        v30 = gg.ehns("ehrl", ehpe(int ), (int)40);
                        continue block145;
                    }
                    case -236332464: {
                        break block145;
                    }
                    case 1045927445: {
                        v30 = gg.ehns("ehrm", ehpe(int ), (int)41);
                        continue block145;
                    }
                }
                break;
            }
            v31 = gg.mc.field_1724;
            v32 /* !! */  = gg.kr;
            if (true) ** GOTO lbl222
            block146: while (true) {
                v32 /* !! */  = (long)(v33 - gg.ehns("ehrn", ehpe(int ), (int)42));
lbl222:
                // 2 sources

                switch ((int)v32 /* !! */ ) {
                    case -1386043872: {
                        v33 = gg.ehns("ehro", ehpe(int ), (int)43);
                        continue block146;
                    }
                    case -236332464: {
                        break block146;
                    }
                    case 956496904: {
                        v33 = gg.ehns("ehrp", ehpe(int ), (int)44);
                        continue block146;
                    }
                }
                break;
            }
            v34 = v31.method_36454();
            while (true) {
                if ((v35 /* !! */  = (cfr_temp_8 = gg.kr - gg.ehns("ehrq", ehpe(int ), (int)45)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v35 /* !! */  == gg.ehns("ehrr", ehob(int ), (int)52)) break;
                v35 /* !! */  = (long)gg.ehns("ehrs", ehob(int ), (int)53);
            }
            v36 = this.foldedAngle(v34);
            v37 /* !! */  = gg.kr;
            if (true) ** GOTO lbl242
            block148: while (true) {
                v37 /* !! */  = (long)(v38 - gg.ehns("ehrt", ehpe(int ), (int)46));
lbl242:
                // 2 sources

                switch ((int)v37 /* !! */ ) {
                    case -236332464: {
                        break block148;
                    }
                    case 778330143: {
                        v38 = gg.ehns("ehru", ehpe(int ), (int)47);
                        continue block148;
                    }
                    case 1171451760: {
                        v38 = gg.ehns("ehrv", ehpe(int ), (int)48);
                        continue block148;
                    }
                }
                break;
            }
            v39 = this.valueForAngle(this.xzByAngle, v36);
            v40 /* !! */  = gg.kr;
            if (true) ** GOTO lbl256
            block149: while (true) {
                v40 /* !! */  = (long)(v41 - gg.ehns("ehrw", ehpe(int ), (int)49));
lbl256:
                // 2 sources

                switch ((int)v40 /* !! */ ) {
                    case -236332464: {
                        break block149;
                    }
                    case 166583324: {
                        v41 = gg.ehns("ehrx", ehpe(int ), (int)50);
                        continue block149;
                    }
                    case 1644623938: {
                        v41 = gg.ehns("ehry", ehpe(int ), (int)51);
                        continue block149;
                    }
                    case 1900962035: {
                        v41 = gg.ehns("ehrz", ehpe(int ), (int)52);
                        continue block149;
                    }
                }
                break;
            }
            var1_1.setBoostMultiplier(v39);
            if (var2_4 || var2_4) ** GOTO lbl33
            v42 /* !! */  = gg.kr;
            if (true) ** GOTO lbl274
            block150: while (true) {
                v42 /* !! */  = (long)(gg.ehns("ehsb", ehpe(int ), (int)54) - gg.ehns("ehsa", ehpe(int ), (int)53));
lbl274:
                // 2 sources

                switch ((int)v42 /* !! */ ) {
                    case -1371681975: {
                        continue block150;
                    }
                    case -236332464: {
                        break block150;
                    }
                }
                break;
            }
            while (true) {
                if ((v43 /* !! */  = (cfr_temp_9 = gg.kr - gg.ehns("ehsc", ehpe(int ), (int)55)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v43 /* !! */  == gg.ehns("ehsd", ehob(int ), (int)54)) break;
                v43 /* !! */  = (long)gg.ehns("ehse", ehob(int ), (int)55);
            }
            v44 /* !! */  = gg.kr;
            if (true) ** GOTO lbl288
            block152: while (true) {
                v44 /* !! */  = (long)(v45 - gg.ehns("ehsf", ehpe(int ), (int)56));
lbl288:
                // 2 sources

                switch ((int)v44 /* !! */ ) {
                    case -785405189: {
                        v45 = gg.ehns("ehsg", ehpe(int ), (int)57);
                        continue block152;
                    }
                    case -236332464: {
                        break block152;
                    }
                    case 128080818: {
                        v45 = gg.ehns("ehsh", ehpe(int ), (int)58);
                        continue block152;
                    }
                    case 460312798: {
                        v45 = gg.ehns("ehsi", ehpe(int ), (int)59);
                        continue block152;
                    }
                }
                break;
            }
            v46 = gg.mc.field_1724;
            v47 /* !! */  = gg.kr;
            if (true) ** GOTO lbl305
            block153: while (true) {
                v47 /* !! */  = (long)(v48 - gg.ehns("ehsj", ehpe(int ), (int)60));
lbl305:
                // 2 sources

                switch ((int)v47 /* !! */ ) {
                    case -1784115650: {
                        v48 = gg.ehns("ehsk", ehpe(int ), (int)61);
                        continue block153;
                    }
                    case -236332464: {
                        break block153;
                    }
                    case 854680214: {
                        v48 = gg.ehns("ehsl", ehpe(int ), (int)62);
                        continue block153;
                    }
                    case 2099511466: {
                        v48 = gg.ehns("ehsm", ehpe(int ), (int)63);
                        continue block153;
                    }
                }
                break;
            }
            v49 = v46.method_36455();
            v50 /* !! */  = gg.kr;
            if (true) ** GOTO lbl322
            block154: while (true) {
                v50 /* !! */  = (long)(gg.ehns("ehso", ehpe(int ), (int)65) - gg.ehns("ehsn", ehpe(int ), (int)64));
lbl322:
                // 2 sources

                switch ((int)v50 /* !! */ ) {
                    case -1503950827: {
                        continue block154;
                    }
                    case -236332464: {
                        break block154;
                    }
                }
                break;
            }
            v51 = this.foldedAngle(v49);
            v52 /* !! */  = gg.kr;
            if (true) ** GOTO lbl332
            block155: while (true) {
                v52 /* !! */  = (long)(gg.ehns("ehsq", ehpe(int ), (int)67) - gg.ehns("ehsp", ehpe(int ), (int)66));
lbl332:
                // 2 sources

                switch ((int)v52 /* !! */ ) {
                    case -236332464: {
                        break block155;
                    }
                    case 1891976604: {
                        continue block155;
                    }
                }
                break;
            }
            v53 = this.valueForAngle(this.yByAngle, v51);
            v54 /* !! */  = gg.kr;
            if (true) ** GOTO lbl342
            block156: while (true) {
                v54 /* !! */  = (long)(v55 - gg.ehns("ehsr", ehpe(int ), (int)68));
lbl342:
                // 2 sources

                switch ((int)v54 /* !! */ ) {
                    case -2001963399: {
                        v55 = gg.ehns("ehss", ehpe(int ), (int)69);
                        continue block156;
                    }
                    case -930629884: {
                        v55 = gg.ehns("ehst", ehpe(int ), (int)70);
                        continue block156;
                    }
                    case -236332464: {
                        break block156;
                    }
                }
                break;
            }
            var1_1.setYSpeed(v53);
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl355:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)gg.ehns("ehsu", ehob(int ), (int)56);
                } while (!var4_2);
                throw null;
            }
lbl360:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)gg.ehns("ehsv", ehob(int ), (int)57);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl365:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gg.ehns("ehsw", ehob(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl379
            }
            case 3: {
                var3_3 /* !! */  = (int)gg.ehns("ehsx", ehob(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 4: {
                var3_3 /* !! */  = (int)gg.ehns("ehsy", ehob(int ), (int)60);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
lbl379:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)gg.ehns("ehsz", ehob(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl384:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gg.ehns("ehta", ehob(int ), (int)62);
                    if (!var4_2) ** GOTO lbl355
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)gg.ehns("ehtb", ehob(int ), (int)63);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl394:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gg.ehns("ehtc", ehob(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl448
            }
            case 9: {
                var3_3 /* !! */  = (int)gg.ehns("ehtd", ehob(int ), (int)65);
                if (!var4_2) break;
                throw null;
            }
lbl403:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)gg.ehns("ehte", ehob(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl408:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)gg.ehns("ehtf", ehob(int ), (int)67);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
lbl412:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)gg.ehns("ehtg", ehob(int ), (int)68);
                if (!var4_2) ** GOTO lbl365
                throw null;
            }
lbl416:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)gg.ehns("ehth", ehob(int ), (int)69);
                if (!var4_2) ** GOTO lbl394
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)gg.ehns("ehti", ehob(int ), (int)70);
                if (!var4_2) ** GOTO lbl408
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)gg.ehns("ehtj", ehob(int ), (int)71);
                if (!var4_2) ** GOTO lbl403
                throw null;
            }
lbl428:
            // 3 sources

            case 16: {
                var3_3 /* !! */  = (int)gg.ehns("ehtk", ehob(int ), (int)72);
                if (!var4_2) ** GOTO lbl355
                throw null;
            }
lbl432:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)gg.ehns("ehtl", ehob(int ), (int)73);
                if (!var4_2) ** GOTO lbl412
                throw null;
            }
lbl436:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)gg.ehns("ehtm", ehob(int ), (int)74);
                if (!var4_2) ** GOTO lbl432
                throw null;
            }
lbl440:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)gg.ehns("ehtn", ehob(int ), (int)75);
                if (!var4_2) ** GOTO lbl428
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)gg.ehns("ehto", ehob(int ), (int)76);
                if (!var4_2) ** GOTO lbl432
                throw null;
            }
lbl448:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)gg.ehns("ehtp", ehob(int ), (int)77);
                if (!var4_2) ** GOTO lbl416
                throw null;
            }
            case 22: 
        }
        var3_3 /* !! */  = (int)gg.ehns("ehtq", ehob(int ), (int)78);
        ** while (!var4_2)
lbl455:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eird() {
        gg.ehnq[200] = 2122730594;
        gg.ehnq[201] = 724790265;
        gg.ehnq[202] = -676843307;
        gg.ehnq[203] = -492922101;
        gg.ehnq[204] = -1599908559;
        gg.ehnq[205] = -1766039963;
        gg.ehnq[206] = 166408920;
        gg.ehnq[207] = 8009347;
        gg.ehnq[208] = 690914918;
        gg.ehnq[209] = 818757023;
        gg.ehnq[210] = -217650605;
        gg.ehnq[211] = -137079087;
        gg.ehnq[212] = -1219823376;
        gg.ehnq[213] = -1261574212;
        gg.ehnq[214] = -645842206;
        gg.ehnq[215] = 628042750;
        gg.ehnq[216] = -109148975;
        gg.ehnq[217] = -149981571;
        gg.ehnq[218] = -1754288737;
        gg.ehnq[219] = -1506133009;
        gg.ehnq[220] = -188653247;
        gg.ehnq[221] = 43198967;
        gg.ehnq[222] = 639338667;
        gg.ehnq[223] = -1224511273;
        gg.ehnq[224] = -752115977;
        gg.ehnq[225] = -689068109;
        gg.ehnq[226] = -1136406900;
        gg.ehnq[227] = 1278013244;
        gg.ehnq[228] = 409443065;
        gg.ehnq[229] = -1159616493;
        gg.ehnq[230] = 1543171644;
        gg.ehnq[231] = -1104685933;
        gg.ehnq[232] = 2084730564;
        gg.ehnq[233] = 1640081143;
        gg.ehnq[234] = 46859629;
        gg.ehnq[235] = -1470893214;
        gg.ehnq[236] = 210541820;
        gg.ehnq[237] = -248206013;
        gg.ehnq[238] = 584874609;
        gg.ehnq[239] = 1195795218;
        gg.ehnq[240] = 107084003;
        gg.ehnq[241] = -335334902;
        gg.ehnq[242] = -77159542;
        gg.ehnq[243] = 862309196;
        gg.ehnq[244] = 1559378946;
        gg.ehnq[245] = -1303449899;
        gg.ehnq[246] = 1675526136;
        gg.ehnq[247] = -95625453;
        gg.ehnq[248] = 1919339408;
        gg.ehnq[249] = 1589867581;
        gg.ehnq[250] = -1589073960;
        gg.ehnq[251] = 1369415555;
        gg.ehnq[252] = 750915113;
        gg.ehnq[253] = -1542344683;
        gg.ehnq[254] = -2070017510;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gg() {
        var6_1 /* !! */  = gg.b;
        super("SuperFirework", "\u0423\u0441\u0438\u043b\u0438\u0432\u0430\u0435\u0442 \u0443\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435 \u043e\u0442 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430 \u0432 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0438 \u043e\u0442 \u0443\u0433\u043b\u0430 \u043f\u043e\u043b\u0435\u0442\u0430", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u043f\u043e\u0441\u043e\u0431 \u0440\u0430\u0441\u0447\u0435\u0442\u0430 \u0443\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u044f \u043e\u0442 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", "\u0423\u0433\u043b\u043e\u0432\u043e\u0439", new String[]{"\u0423\u0433\u043b\u043e\u0432\u043e\u0439", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439"});
        this.xzByAngle = this.createAngleSettings("XZ");
        this.yByAngle = this.createAngleSettings("Y");
        this.bravoPreset = new kc("\u041f\u0440\u0435\u0441\u0435\u0442 BravoHvH", "\u041d\u0430\u0441\u0442\u0440\u043e\u0438\u0442\u044c \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438 \u0434\u043b\u044f BravoHvH").setButtonName("\u041f\u0440\u0438\u043c\u0435\u043d\u0438\u0442\u044c").setRunnable((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, applyBravoPreset(), ()V)((gg)this)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((gg)this));
        this.reallyWorldPreset = new kc("\u041f\u0440\u0435\u0441\u0435\u0442 ReallyWorld", "\u041d\u0430\u0441\u0442\u0440\u043e\u0438\u0442\u044c \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u0438 \u0434\u043b\u044f ReallyWorld").setButtonName("\u041f\u0440\u0438\u043c\u0435\u043d\u0438\u0442\u044c").setRunnable((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, applyReallyWorldPreset(), ()V)((gg)this)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((gg)this));
        this.xzSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c XZ", "\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u043e\u0435 \u0443\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435", (float)gg.ehns("ehnt", ehnp(int ), (int)0)).range((float)gg.ehns("ehnu", ehnp(int ), (int)1), (float)gg.ehns("ehnv", ehnp(int ), (int)2)).step((float)gg.ehns("ehnw", ehnp(int ), (int)3)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((gg)this));
        this.ySpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c Y", "\u0412\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u0435 \u0443\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435", (float)gg.ehns("ehnx", ehnp(int ), (int)4)).range((float)gg.ehns("ehny", ehnp(int ), (int)5), (float)gg.ehns("ehnz", ehnp(int ), (int)6)).step((float)gg.ehns("ehoa", ehnp(int ), (int)7)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((gg)this));
        this.settings(new jx[]{this.mode});
        var1_2 = this.xzByAngle;
        var2_3 = var1_2.length;
        var3_4 = gg.ehns("ehoc", ehob(int ), (int)8);
        if (var6_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_1 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                while (var3_4 < var2_3) {
                    var4_5 = var1_2[var3_4];
                    this.settings(new jx[]{var4_5});
                    ++var3_4;
                }
                var1_2 = this.yByAngle;
                var2_3 = var1_2.length;
                for (var3_4 = gg.ehns("ehod", ehob(int ), (int)9); var3_4 < var2_3; ++var3_4) {
                    var4_5 = var1_2[var3_4];
                    this.settings(new jx[]{var4_5});
                }
                this.settings(new jx[]{this.bravoPreset, this.reallyWorldPreset, this.xzSpeed, this.ySpeed});
                return;
            }
            case 0: {
                var6_1 /* !! */  = (int)gg.ehns("ehoe", ehob(int ), (int)10);
                ** GOTO lbl66
            }
            case 1: {
                var6_1 /* !! */  = (int)gg.ehns("ehof", ehob(int ), (int)11);
                ** GOTO lbl54
            }
lbl36:
            // 2 sources

            case 2: {
                var6_1 /* !! */  = (int)gg.ehns("ehog", ehob(int ), (int)12);
                ** GOTO lbl51
            }
lbl39:
            // 2 sources

            case 3: {
                var6_1 /* !! */  = (int)gg.ehns("ehoh", ehob(int ), (int)13);
                ** GOTO lbl88
            }
lbl42:
            // 4 sources

            case 4: {
                var6_1 /* !! */  = (int)gg.ehns("ehoi", ehob(int ), (int)14);
                ** GOTO lbl72
            }
            case 5: {
                var6_1 /* !! */  = (int)gg.ehns("ehoj", ehob(int ), (int)15);
                ** GOTO lbl63
            }
lbl48:
            // 2 sources

            case 6: {
                var6_1 /* !! */  = (int)gg.ehns("ehok", ehob(int ), (int)16);
                ** GOTO lbl36
            }
lbl51:
            // 2 sources

            case 7: {
                var6_1 /* !! */  = (int)gg.ehns("ehol", ehob(int ), (int)17);
                break;
            }
lbl54:
            // 2 sources

            case 8: {
                var6_1 /* !! */  = (int)gg.ehns("ehom", ehob(int ), (int)18);
                ** GOTO lbl60
            }
            case 9: {
                var6_1 /* !! */  = (int)gg.ehns("ehon", ehob(int ), (int)19);
                break;
            }
lbl60:
            // 5 sources

            case 10: {
                var6_1 /* !! */  = (int)gg.ehns("ehoo", ehob(int ), (int)20);
                ** GOTO lbl94
            }
lbl63:
            // 2 sources

            case 11: {
                var6_1 /* !! */  = (int)gg.ehns("ehop", ehob(int ), (int)21);
                ** GOTO lbl78
            }
lbl66:
            // 2 sources

            case 12: {
                var6_1 /* !! */  = (int)gg.ehns("ehoq", ehob(int ), (int)22);
                ** GOTO lbl100
            }
            case 13: {
                var6_1 /* !! */  = (int)gg.ehns("ehor", ehob(int ), (int)23);
                ** GOTO lbl48
            }
lbl72:
            // 3 sources

            case 14: {
                var6_1 /* !! */  = (int)gg.ehns("ehos", ehob(int ), (int)24);
                ** GOTO lbl42
            }
            case 15: {
                var6_1 /* !! */  = (int)gg.ehns("ehot", ehob(int ), (int)25);
                ** GOTO lbl60
            }
lbl78:
            // 2 sources

            case 16: {
                var6_1 /* !! */  = (int)gg.ehns("ehou", ehob(int ), (int)26);
                break;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_1 /* !! */  = (int)gg.ehns("ehov", ehob(int ), (int)27);
                    ** GOTO lbl42
                    break;
                }
            }
            case 18: {
                var6_1 /* !! */  = (int)gg.ehns("ehow", ehob(int ), (int)28);
                ** GOTO lbl97
            }
lbl88:
            // 2 sources

            case 19: {
                var6_1 /* !! */  = (int)gg.ehns("ehox", ehob(int ), (int)29);
                ** GOTO lbl39
            }
            case 20: {
                var6_1 /* !! */  = (int)gg.ehns("ehoy", ehob(int ), (int)30);
                break;
            }
lbl94:
            // 2 sources

            case 21: {
                var6_1 /* !! */  = (int)gg.ehns("ehoz", ehob(int ), (int)31);
                ** GOTO lbl72
            }
lbl97:
            // 2 sources

            case 22: {
                var6_1 /* !! */  = (int)gg.ehns("ehpa", ehob(int ), (int)32);
                ** GOTO lbl60
            }
lbl100:
            // 2 sources

            case 23: {
                var6_1 /* !! */  = (int)gg.ehns("ehpb", ehob(int ), (int)33);
                ** GOTO lbl60
            }
            case 24: {
                var6_1 /* !! */  = (int)gg.ehns("ehpc", ehob(int ), (int)34);
                ** GOTO lbl42
            }
            case 25: 
        }
        var6_1 /* !! */  = (int)gg.ehns("ehpd", ehob(int ), (int)35);
        ** while (true)
    }

    private static /* synthetic */ void eisk() {
        gg.ehnr[200] = 2122730606;
        gg.ehnr[201] = 724790264;
        gg.ehnr[202] = -676843305;
        gg.ehnr[203] = -492922098;
        gg.ehnr[204] = -1599908554;
        gg.ehnr[205] = -1766039953;
        gg.ehnr[206] = 166408925;
        gg.ehnr[207] = 8009350;
        gg.ehnr[208] = 690914922;
        gg.ehnr[209] = 818757022;
        gg.ehnr[210] = -1519709544;
        gg.ehnr[211] = -137079088;
        gg.ehnr[212] = 1350112006;
        gg.ehnr[213] = 1261574211;
        gg.ehnr[214] = 688157643;
        gg.ehnr[215] = 628042748;
        gg.ehnr[216] = -109148974;
        gg.ehnr[217] = -149981570;
        gg.ehnr[218] = -1754288738;
        gg.ehnr[219] = -1506133010;
        gg.ehnr[220] = 465834731;
        gg.ehnr[221] = -43198968;
        gg.ehnr[222] = -859567489;
        gg.ehnr[223] = -1224511274;
        gg.ehnr[224] = -752115978;
        gg.ehnr[225] = -689068111;
        gg.ehnr[226] = -1136406898;
        gg.ehnr[227] = -1278013245;
        gg.ehnr[228] = -1914602661;
        gg.ehnr[229] = 1159616492;
        gg.ehnr[230] = 1856976582;
        gg.ehnr[231] = -1104685934;
        gg.ehnr[232] = -199737425;
        gg.ehnr[233] = 1640081140;
        gg.ehnr[234] = 46859631;
        gg.ehnr[235] = -1470893216;
        gg.ehnr[236] = 210541823;
        gg.ehnr[237] = -248206014;
        gg.ehnr[238] = -2060540348;
        gg.ehnr[239] = 1195795216;
        gg.ehnr[240] = 107084003;
        gg.ehnr[241] = -335334904;
        gg.ehnr[242] = -77159544;
        gg.ehnr[243] = -862309197;
        gg.ehnr[244] = 1426853154;
        gg.ehnr[245] = 1303449898;
        gg.ehnr[246] = -1259699185;
        gg.ehnr[247] = -95625454;
        gg.ehnr[248] = -409966617;
        gg.ehnr[249] = 1589867580;
        gg.ehnr[250] = 1680029570;
        gg.ehnr[251] = 1369415553;
        gg.ehnr[252] = 750915112;
        gg.ehnr[253] = -1542344682;
        gg.ehnr[254] = -2070017512;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyReallyWorldPreset() {
        v0 /* !! */  = gg.kr;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - gg.ehns("eici", ehpe(int ), (int)113));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -668796633: {
                    v1 = gg.ehns("eick", ehpe(int ), (int)114);
                    continue block38;
                }
                case -236332464: {
                    break block38;
                }
                case 567273892: {
                    v1 = gg.ehns("eicp", ehpe(int ), (int)115);
                    continue block38;
                }
            }
            break;
        }
        var3_1 = gg.c;
        v2 /* !! */  = gg.kr;
        if (true) ** GOTO lbl19
        block39: while (true) {
            v2 /* !! */  = (long)(v3 - gg.ehns("eicr", ehpe(int ), (int)116));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1717396765: {
                    v3 = gg.ehns("eics", ehpe(int ), (int)117);
                    continue block39;
                }
                case -1262496159: {
                    v3 = gg.ehns("eicu", ehpe(int ), (int)118);
                    continue block39;
                }
                case -236332464: {
                    break block39;
                }
            }
            break;
        }
        var2_2 /* !! */  = gg.b;
        v4 /* !! */  = gg.kr;
        if (true) ** GOTO lbl33
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - gg.ehns("eicv", ehpe(int ), (int)119));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -236332464: {
                    break block40;
                }
                case -107230568: {
                    v5 = gg.ehns("eicw", ehpe(int ), (int)120);
                    continue block40;
                }
                case 257945843: {
                    v5 = gg.ehns("eicz", ehpe(int ), (int)121);
                    continue block40;
                }
                case 846767493: {
                    v5 = gg.ehns("eidb", ehpe(int ), (int)122);
                    continue block40;
                }
            }
            break;
        }
        var1_3 = gg.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl51:
                    // 3 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl51
                v6 /* !! */  = gg.kr;
                if (true) ** GOTO lbl58
                block42: while (true) {
                    v6 /* !! */  = (long)(v7 - gg.ehns("eidd", ehpe(int ), (int)123));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1949476383: {
                            v7 = gg.ehns("eidf", ehpe(int ), (int)124);
                            continue block42;
                        }
                        case -343048257: {
                            v7 = gg.ehns("eidg", ehpe(int ), (int)125);
                            continue block42;
                        }
                        case -236332464: {
                            break block42;
                        }
                        case 245802868: {
                            v7 = gg.ehns("eidj", ehpe(int ), (int)126);
                            continue block42;
                        }
                    }
                    break;
                }
                v8 = new float[]{1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f};
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("eidn", ehpe(int ), (int)127)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gg.ehns("eidp", ehob(int ), (int)181)) break;
                    v9 /* !! */  = (long)gg.ehns("eidq", ehob(int ), (int)182);
                }
                this.setValues(this.xzByAngle, v8);
                if (var1_3 || var1_3) ** GOTO lbl51
                v10 /* !! */  = gg.kr;
                if (true) ** GOTO lbl82
                block44: while (true) {
                    v10 /* !! */  = (long)(v11 - gg.ehns("eidr", ehpe(int ), (int)128));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -236332464: {
                            break block44;
                        }
                        case -111634529: {
                            v11 = gg.ehns("eidt", ehpe(int ), (int)129);
                            continue block44;
                        }
                        case 182977424: {
                            v11 = gg.ehns("eidu", ehpe(int ), (int)130);
                            continue block44;
                        }
                        case 1877325018: {
                            v11 = gg.ehns("eieb", ehpe(int ), (int)131);
                            continue block44;
                        }
                    }
                    break;
                }
                v12 = new float[]{1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f};
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("eiee", ehpe(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gg.ehns("eieg", ehob(int ), (int)183)) break;
                    v13 /* !! */  = (long)gg.ehns("eiei", ehob(int ), (int)184);
                }
                this.setValues(this.yByAngle, v12);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl103:
            // 4 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)gg.ehns("eiej", ehob(int ), (int)185);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gg.ehns("eiek", ehob(int ), (int)186);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gg.ehns("eiem", ehob(int ), (int)187);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
lbl116:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gg.ehns("eier", ehob(int ), (int)188);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)gg.ehns("eies", ehob(int ), (int)189);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)gg.ehns("eiet", ehob(int ), (int)190);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)gg.ehns("eiev", ehob(int ), (int)191);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)gg.ehns("eifc", ehob(int ), (int)192);
        ** while (!var3_1)
lbl137:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float foldedAngle(float f2) {
        Object object;
        float f3;
        Object object2 = kr;
        block12: while (true) {
            switch ((int)object2) {
                case -236332464: {
                    break block12;
                }
                case -60189136: {
                    object2 = gg.ehns("ehwx", ehpe(int ), (int)96) - gg.ehns("ehwr", ehpe(int ), (int)95);
                    continue block12;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object3 = kr;
        block13: while (true) {
            switch ((int)object3) {
                case -236332464: {
                    break block13;
                }
                case 980736687: {
                    object3 = gg.ehns("ehxa", ehpe(int ), (int)98) - gg.ehns("ehwz", ehpe(int ), (int)97);
                    continue block13;
                }
            }
            break;
        }
        int n2 = b;
        Object object4 = kr;
        block14: while (true) {
            switch ((int)object4) {
                case -1548967665: {
                    object4 = gg.ehns("ehxc", ehpe(int ), (int)100) - gg.ehns("ehxb", ehpe(int ), (int)99);
                    continue block14;
                }
                case -236332464: {
                    break block14;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
        float f4 = f2 % gg.ehns("ehxi", ehnp(int ), (int)134);
        if (bl3 || bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
        if (f4 > gg.ehns("ehxk", ehnp(int ), (int)135)) {
            if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
            f4 -= gg.ehns("ehxm", ehnp(int ), (int)136);
            if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
            if (bl2) {
                throw null;
            }
        } else {
            if (bl3 || bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
            if (f4 < gg.ehns("ehxo", ehnp(int ), (int)137)) {
                if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
                f4 += gg.ehns("ehxp", ehnp(int ), (int)138);
                if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
            }
        }
        if (bl3 || bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
        while (true) {
            long l2;
            Object object5;
            if ((object5 = (l2 = kr - gg.ehns("ehxq", ehpe(int ), (int)101)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == gg.ehns("ehxx", ehob(int ), (int)139)) {
                f3 = Math.abs(f4);
                if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
                break;
            }
            object5 = gg.ehns("ehxy", ehob(int ), (int)140);
        }
        if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
        if (f3 > gg.ehns("ehxz", ehnp(int ), (int)141)) {
            if (bl3) return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
            object = gg.ehns("ehya", ehnp(int ), (int)142) - f3;
            if (!bl2) return object;
            throw null;
        }
        if (bl3 || bl3) {
            return (float)gg.ehns("ehxf", ehnp(int ), (int)133);
        }
        object = f3;
        return object;
    }

    private static /* synthetic */ void eiqt() {
        gg.ehnq[100] = 2114143624;
        gg.ehnq[101] = 808118257;
        gg.ehnq[102] = 840650119;
        gg.ehnq[103] = -196661538;
        gg.ehnq[104] = 1474650715;
        gg.ehnq[105] = 1607821908;
        gg.ehnq[106] = -841940127;
        gg.ehnq[107] = 1956969268;
        gg.ehnq[108] = -1266337823;
        gg.ehnq[109] = 593597457;
        gg.ehnq[110] = 420858176;
        gg.ehnq[111] = 1478972723;
        gg.ehnq[112] = 348949788;
        gg.ehnq[113] = -285749048;
        gg.ehnq[114] = -133801497;
        gg.ehnq[115] = -1277599957;
        gg.ehnq[116] = -927820662;
        gg.ehnq[117] = -1185043656;
        gg.ehnq[118] = -1085167461;
        gg.ehnq[119] = 1694814578;
        gg.ehnq[120] = 2098633111;
        gg.ehnq[121] = -1657180427;
        gg.ehnq[122] = -1355062384;
        gg.ehnq[123] = 1339981528;
        gg.ehnq[124] = 1885759690;
        gg.ehnq[125] = 2049650580;
        gg.ehnq[126] = 720484027;
        gg.ehnq[127] = -238585897;
        gg.ehnq[128] = -809289170;
        gg.ehnq[129] = -157515834;
        gg.ehnq[130] = 1893000366;
        gg.ehnq[131] = 1302050175;
        gg.ehnq[132] = 686522018;
        gg.ehnq[133] = 480612056;
        gg.ehnq[134] = 1165679211;
        gg.ehnq[135] = 1238274324;
        gg.ehnq[136] = -1424825801;
        gg.ehnq[137] = 1926832915;
        gg.ehnq[138] = 224383821;
        gg.ehnq[139] = -2125670343;
        gg.ehnq[140] = -763789819;
        gg.ehnq[141] = 989193287;
        gg.ehnq[142] = 1415134067;
        gg.ehnq[143] = -2078569860;
        gg.ehnq[144] = -1766176033;
        gg.ehnq[145] = -482919081;
        gg.ehnq[146] = 1610612284;
        gg.ehnq[147] = -655043839;
        gg.ehnq[148] = -1641652178;
        gg.ehnq[149] = 1411162578;
        gg.ehnq[150] = -1091709604;
        gg.ehnq[151] = 288212605;
        gg.ehnq[152] = -851616320;
        gg.ehnq[153] = -261315291;
        gg.ehnq[154] = -1420237672;
        gg.ehnq[155] = -1996182296;
        gg.ehnq[156] = -1003623074;
        gg.ehnq[157] = -1661585190;
        gg.ehnq[158] = -195535776;
        gg.ehnq[159] = 1817605155;
        gg.ehnq[160] = -1315084042;
        gg.ehnq[161] = -1096261101;
        gg.ehnq[162] = 206553999;
        gg.ehnq[163] = -1464396379;
        gg.ehnq[164] = -588586518;
        gg.ehnq[165] = 1155306130;
        gg.ehnq[166] = -878295877;
        gg.ehnq[167] = 1926206926;
        gg.ehnq[168] = -1342396465;
        gg.ehnq[169] = -352991617;
        gg.ehnq[170] = 945190143;
        gg.ehnq[171] = 792816581;
        gg.ehnq[172] = -419029000;
        gg.ehnq[173] = -1178425404;
        gg.ehnq[174] = -1930555251;
        gg.ehnq[175] = -567711817;
        gg.ehnq[176] = -1875547347;
        gg.ehnq[177] = -47841379;
        gg.ehnq[178] = 1890329278;
        gg.ehnq[179] = 1203028236;
        gg.ehnq[180] = 1967071831;
        gg.ehnq[181] = 1957324269;
        gg.ehnq[182] = -1417468934;
        gg.ehnq[183] = 838677127;
        gg.ehnq[184] = 1064728011;
        gg.ehnq[185] = 2086444432;
        gg.ehnq[186] = 276454918;
        gg.ehnq[187] = 498171692;
        gg.ehnq[188] = -750001465;
        gg.ehnq[189] = 1285735947;
        gg.ehnq[190] = -834274960;
        gg.ehnq[191] = 1826940787;
        gg.ehnq[192] = -1852219287;
        gg.ehnq[193] = -10463644;
        gg.ehnq[194] = 679010070;
        gg.ehnq[195] = -1270142846;
        gg.ehnq[196] = 1225393779;
        gg.ehnq[197] = 57012275;
        gg.ehnq[198] = 363048078;
        gg.ehnq[199] = 890674019;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float valueForAngle(kg[] var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gg.kr - gg.ehns("ehvy", ehpe(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gg.ehns("ehvz", ehob(int ), (int)122)) break;
            v0 /* !! */  = (long)gg.ehns("ehwa", ehob(int ), (int)123);
        }
        var5_3 = gg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gg.kr - gg.ehns("ehwb", ehpe(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gg.ehns("ehwc", ehob(int ), (int)124)) break;
            v1 /* !! */  = (long)gg.ehns("ehwd", ehob(int ), (int)125);
        }
        var4_4 /* !! */  = gg.b;
        v2 /* !! */  = gg.kr;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(gg.ehns("ehwf", ehpe(int ), (int)90) - gg.ehns("ehwe", ehpe(int ), (int)89));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -469547303: {
                    continue block20;
                }
                case -236332464: {
                    break block20;
                }
            }
            break;
        }
        var3_5 = gg.a;
        if (var5_3) {
            throw null;
            return (float)gg.ehns("ehwg", ehnp(int ), (int)126);
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** continue;
                v3 = gg.ehns("ehwh", ehob(int ), (int)127);
                v4 = (int)(var2_2 / gg.ehns("ehwi", ehnp(int ), (int)128));
                v5 /* !! */  = gg.kr;
                if (true) ** GOTO lbl39
                block22: while (true) {
                    v5 /* !! */  = (long)(gg.ehns("ehwk", ehpe(int ), (int)92) - gg.ehns("ehwj", ehpe(int ), (int)91));
lbl39:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -236332464: {
                            break block22;
                        }
                        case 734612161: {
                            continue block22;
                        }
                    }
                    break;
                }
                v6 = var1_1[Math.min((int)v3, v4)];
                v7 /* !! */  = gg.kr;
                if (true) ** GOTO lbl49
                block23: while (true) {
                    v7 /* !! */  = (long)(gg.ehns("ehwm", ehpe(int ), (int)94) - gg.ehns("ehwl", ehpe(int ), (int)93));
lbl49:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -236332464: {
                            break block23;
                        }
                        case 653988418: {
                            continue block23;
                        }
                    }
                    break;
                }
                return v6.getValue();
            }
lbl55:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)gg.ehns("ehwn", ehob(int ), (int)129);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)gg.ehns("ehwo", ehob(int ), (int)130);
                if (var5_3) {
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)gg.ehns("ehwp", ehob(int ), (int)131);
                if (!var5_3) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var4_4 /* !! */  = (int)gg.ehns("ehwq", ehob(int ), (int)132);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ void eiqm() {
        gg.ehnq[0] = -1539271722;
        gg.ehnq[1] = -480520900;
        gg.ehnq[2] = 233770915;
        gg.ehnq[3] = -1399356086;
        gg.ehnq[4] = 2075749116;
        gg.ehnq[5] = -1592847732;
        gg.ehnq[6] = -777007481;
        gg.ehnq[7] = 1517469294;
        gg.ehnq[8] = -631520559;
        gg.ehnq[9] = 1757317105;
        gg.ehnq[10] = 999014360;
        gg.ehnq[11] = 332018294;
        gg.ehnq[12] = 246962645;
        gg.ehnq[13] = 1767122663;
        gg.ehnq[14] = 1336063022;
        gg.ehnq[15] = -1423490035;
        gg.ehnq[16] = 557236641;
        gg.ehnq[17] = 1188756896;
        gg.ehnq[18] = 937535090;
        gg.ehnq[19] = 1966906734;
        gg.ehnq[20] = -486248788;
        gg.ehnq[21] = 1874276196;
        gg.ehnq[22] = 506549671;
        gg.ehnq[23] = -1303220483;
        gg.ehnq[24] = 720904417;
        gg.ehnq[25] = -386232570;
        gg.ehnq[26] = 739997130;
        gg.ehnq[27] = 1889726371;
        gg.ehnq[28] = -915354987;
        gg.ehnq[29] = -69877750;
        gg.ehnq[30] = 296912854;
        gg.ehnq[31] = -1064713503;
        gg.ehnq[32] = 1667784935;
        gg.ehnq[33] = 1484784043;
        gg.ehnq[34] = -1611288415;
        gg.ehnq[35] = -1861897826;
        gg.ehnq[36] = 127197001;
        gg.ehnq[37] = -723066005;
        gg.ehnq[38] = 941663831;
        gg.ehnq[39] = -1702735250;
        gg.ehnq[40] = -1990858102;
        gg.ehnq[41] = -449697554;
        gg.ehnq[42] = -1527769427;
        gg.ehnq[43] = -814920878;
        gg.ehnq[44] = 2031076049;
        gg.ehnq[45] = -19898271;
        gg.ehnq[46] = 1190131948;
        gg.ehnq[47] = 388393484;
        gg.ehnq[48] = -1460073829;
        gg.ehnq[49] = -2104580786;
        gg.ehnq[50] = 1356000110;
        gg.ehnq[51] = -135841349;
        gg.ehnq[52] = 2144028417;
        gg.ehnq[53] = 1738015123;
        gg.ehnq[54] = 763495685;
        gg.ehnq[55] = -790791772;
        gg.ehnq[56] = -1832096668;
        gg.ehnq[57] = -1811972538;
        gg.ehnq[58] = 406221332;
        gg.ehnq[59] = -881363718;
        gg.ehnq[60] = -2123525052;
        gg.ehnq[61] = 274063077;
        gg.ehnq[62] = -816158363;
        gg.ehnq[63] = 1449989604;
        gg.ehnq[64] = -392872542;
        gg.ehnq[65] = -1167290101;
        gg.ehnq[66] = -1081368;
        gg.ehnq[67] = 1685384223;
        gg.ehnq[68] = 845250733;
        gg.ehnq[69] = -2072921049;
        gg.ehnq[70] = -953299902;
        gg.ehnq[71] = 1610566851;
        gg.ehnq[72] = 1509110712;
        gg.ehnq[73] = -1105031321;
        gg.ehnq[74] = 1465164098;
        gg.ehnq[75] = -1081093740;
        gg.ehnq[76] = 988870461;
        gg.ehnq[77] = 1806156678;
        gg.ehnq[78] = 845197136;
        gg.ehnq[79] = 1310561208;
        gg.ehnq[80] = -283783342;
        gg.ehnq[81] = 191070873;
        gg.ehnq[82] = -1600437562;
        gg.ehnq[83] = 98238372;
        gg.ehnq[84] = 653257164;
        gg.ehnq[85] = -1775138609;
        gg.ehnq[86] = -716103475;
        gg.ehnq[87] = -1284067502;
        gg.ehnq[88] = -2070523961;
        gg.ehnq[89] = 137830232;
        gg.ehnq[90] = -1238243162;
        gg.ehnq[91] = 991250405;
        gg.ehnq[92] = 1846724606;
        gg.ehnq[93] = 412543024;
        gg.ehnq[94] = 829923737;
        gg.ehnq[95] = -1581738603;
        gg.ehnq[96] = -1372537771;
        gg.ehnq[97] = 1573202039;
        gg.ehnq[98] = 92852078;
        gg.ehnq[99] = -1790357917;
    }

    private static /* synthetic */ void eiwf() {
        gg.ehpg[200] = -7902137784709826325L;
        gg.ehpg[201] = 221565562097728732L;
        gg.ehpg[202] = 2862524728274311531L;
        gg.ehpg[203] = -1645655529031496686L;
        gg.ehpg[204] = 8767216554371718105L;
        gg.ehpg[205] = -3208835083412149657L;
        gg.ehpg[206] = -5726314845837321146L;
        gg.ehpg[207] = 2931406129184027033L;
        gg.ehpg[208] = 2641479334410048673L;
        gg.ehpg[209] = 3602963258596617548L;
    }
}

