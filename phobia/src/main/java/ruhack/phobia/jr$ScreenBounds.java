/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class jr$ScreenBounds {
    private float maxX;
    private float anchorY;
    private double worldZ;
    private boolean tagValid;
    private float tagMaxY;
    private double worldX;
    private static long[] fnyp;
    private float tagMaxX;
    private float tagMinX;
    private static long[] fnyo;
    public static final int b;
    public static final long ms = -2729214176564278363L;
    private float maxY;
    public static final boolean c;
    private float anchorX;
    private static int[] fnyv;
    private static int[] fnyx;
    private float tagMinY;
    private float minY;
    public static final boolean a;
    private float minX;
    private double worldY;

    private static /* synthetic */ void fold() {
        jr$ScreenBounds.fnyx[0] = -992178166;
        jr$ScreenBounds.fnyx[1] = 427575232;
        jr$ScreenBounds.fnyx[2] = 951178279;
        jr$ScreenBounds.fnyx[3] = 120421051;
        jr$ScreenBounds.fnyx[4] = 21680454;
        jr$ScreenBounds.fnyx[5] = -207252203;
        jr$ScreenBounds.fnyx[6] = 187338528;
        jr$ScreenBounds.fnyx[7] = -669043835;
        jr$ScreenBounds.fnyx[8] = 1983219094;
        jr$ScreenBounds.fnyx[9] = 1157196025;
        jr$ScreenBounds.fnyx[10] = 143610395;
        jr$ScreenBounds.fnyx[11] = -1061119860;
        jr$ScreenBounds.fnyx[12] = -1405602631;
        jr$ScreenBounds.fnyx[13] = 1979662798;
        jr$ScreenBounds.fnyx[14] = 1810042744;
        jr$ScreenBounds.fnyx[15] = 1316890138;
        jr$ScreenBounds.fnyx[16] = -1481930845;
        jr$ScreenBounds.fnyx[17] = -606802641;
        jr$ScreenBounds.fnyx[18] = -1073741352;
        jr$ScreenBounds.fnyx[19] = 914884328;
        jr$ScreenBounds.fnyx[20] = 955531652;
        jr$ScreenBounds.fnyx[21] = 1174600325;
        jr$ScreenBounds.fnyx[22] = 279150394;
        jr$ScreenBounds.fnyx[23] = -535803008;
        jr$ScreenBounds.fnyx[24] = -1097395431;
        jr$ScreenBounds.fnyx[25] = -1734166326;
        jr$ScreenBounds.fnyx[26] = -821703818;
        jr$ScreenBounds.fnyx[27] = -2125345818;
        jr$ScreenBounds.fnyx[28] = 2100991893;
        jr$ScreenBounds.fnyx[29] = -1361040533;
        jr$ScreenBounds.fnyx[30] = 2126402350;
        jr$ScreenBounds.fnyx[31] = 2037163586;
        jr$ScreenBounds.fnyx[32] = -383113137;
        jr$ScreenBounds.fnyx[33] = 2050613397;
        jr$ScreenBounds.fnyx[34] = -383663477;
        jr$ScreenBounds.fnyx[35] = 197727709;
        jr$ScreenBounds.fnyx[36] = -481773262;
        jr$ScreenBounds.fnyx[37] = 1509162863;
        jr$ScreenBounds.fnyx[38] = 397227923;
        jr$ScreenBounds.fnyx[39] = 1375353583;
        jr$ScreenBounds.fnyx[40] = -216698651;
        jr$ScreenBounds.fnyx[41] = -1810467644;
        jr$ScreenBounds.fnyx[42] = 1078416789;
        jr$ScreenBounds.fnyx[43] = -1348567260;
        jr$ScreenBounds.fnyx[44] = -2018485252;
        jr$ScreenBounds.fnyx[45] = 882292675;
        jr$ScreenBounds.fnyx[46] = 1336843047;
        jr$ScreenBounds.fnyx[47] = -66738329;
        jr$ScreenBounds.fnyx[48] = 1798802646;
        jr$ScreenBounds.fnyx[49] = 724660757;
        jr$ScreenBounds.fnyx[50] = 1415594445;
        jr$ScreenBounds.fnyx[51] = -689950552;
        jr$ScreenBounds.fnyx[52] = -1836715168;
        jr$ScreenBounds.fnyx[53] = -1209827413;
        jr$ScreenBounds.fnyx[54] = -657521912;
        jr$ScreenBounds.fnyx[55] = -230373335;
        jr$ScreenBounds.fnyx[56] = 404148954;
        jr$ScreenBounds.fnyx[57] = -30156294;
        jr$ScreenBounds.fnyx[58] = 483158060;
        jr$ScreenBounds.fnyx[59] = 1135792817;
        jr$ScreenBounds.fnyx[60] = 670746137;
        jr$ScreenBounds.fnyx[61] = -1265763829;
        jr$ScreenBounds.fnyx[62] = -130513796;
        jr$ScreenBounds.fnyx[63] = 1106025728;
        jr$ScreenBounds.fnyx[64] = 1715658499;
        jr$ScreenBounds.fnyx[65] = 518786463;
        jr$ScreenBounds.fnyx[66] = 397762503;
        jr$ScreenBounds.fnyx[67] = 608199579;
        jr$ScreenBounds.fnyx[68] = -1438945280;
        jr$ScreenBounds.fnyx[69] = 1729262713;
        jr$ScreenBounds.fnyx[70] = 1685709562;
        jr$ScreenBounds.fnyx[71] = 1006287823;
        jr$ScreenBounds.fnyx[72] = -1583070504;
        jr$ScreenBounds.fnyx[73] = 1315504024;
        jr$ScreenBounds.fnyx[74] = 968167503;
        jr$ScreenBounds.fnyx[75] = 1791291999;
        jr$ScreenBounds.fnyx[76] = 54538257;
        jr$ScreenBounds.fnyx[77] = -1177517761;
        jr$ScreenBounds.fnyx[78] = -495617221;
        jr$ScreenBounds.fnyx[79] = 2026145311;
        jr$ScreenBounds.fnyx[80] = 1342465750;
        jr$ScreenBounds.fnyx[81] = 1824123600;
        jr$ScreenBounds.fnyx[82] = -1609756551;
        jr$ScreenBounds.fnyx[83] = 1505859522;
        jr$ScreenBounds.fnyx[84] = -1861235910;
        jr$ScreenBounds.fnyx[85] = 368799716;
        jr$ScreenBounds.fnyx[86] = -1652165984;
        jr$ScreenBounds.fnyx[87] = -192585408;
        jr$ScreenBounds.fnyx[88] = -1738280188;
        jr$ScreenBounds.fnyx[89] = 1493549133;
        jr$ScreenBounds.fnyx[90] = 1463046842;
        jr$ScreenBounds.fnyx[91] = -820942388;
        jr$ScreenBounds.fnyx[92] = 405588999;
        jr$ScreenBounds.fnyx[93] = 753349882;
        jr$ScreenBounds.fnyx[94] = -715626005;
        jr$ScreenBounds.fnyx[95] = 1978528952;
        jr$ScreenBounds.fnyx[96] = -507958099;
        jr$ScreenBounds.fnyx[97] = 595241961;
        jr$ScreenBounds.fnyx[98] = 614327950;
        jr$ScreenBounds.fnyx[99] = 135495994;
    }

    public static /* synthetic */ CallSite fnyq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private jr$ScreenBounds() {
    }

    private static /* synthetic */ void fokm() {
        jr$ScreenBounds.fnyv[0] = 992178165;
        jr$ScreenBounds.fnyv[1] = 1081512711;
        jr$ScreenBounds.fnyv[2] = -951178280;
        jr$ScreenBounds.fnyv[3] = -1641316438;
        jr$ScreenBounds.fnyv[4] = 1067395478;
        jr$ScreenBounds.fnyv[5] = 207252202;
        jr$ScreenBounds.fnyv[6] = 1146202386;
        jr$ScreenBounds.fnyv[7] = -669043835;
        jr$ScreenBounds.fnyv[8] = 1983219093;
        jr$ScreenBounds.fnyv[9] = 1157196027;
        jr$ScreenBounds.fnyv[10] = 143610394;
        jr$ScreenBounds.fnyv[11] = -49434412;
        jr$ScreenBounds.fnyv[12] = -1405602630;
        jr$ScreenBounds.fnyv[13] = 1979662797;
        jr$ScreenBounds.fnyv[14] = 1810042745;
        jr$ScreenBounds.fnyv[15] = 1316890137;
        jr$ScreenBounds.fnyv[16] = 1481930844;
        jr$ScreenBounds.fnyv[17] = -771210325;
        jr$ScreenBounds.fnyv[18] = -1073741351;
        jr$ScreenBounds.fnyv[19] = 2108817462;
        jr$ScreenBounds.fnyv[20] = 955531653;
        jr$ScreenBounds.fnyv[21] = -1335387861;
        jr$ScreenBounds.fnyv[22] = -279150395;
        jr$ScreenBounds.fnyv[23] = -1046432071;
        jr$ScreenBounds.fnyv[24] = -1097395432;
        jr$ScreenBounds.fnyv[25] = 1734166325;
        jr$ScreenBounds.fnyv[26] = -455240112;
        jr$ScreenBounds.fnyv[27] = -2125345821;
        jr$ScreenBounds.fnyv[28] = 2100991896;
        jr$ScreenBounds.fnyv[29] = -1361040542;
        jr$ScreenBounds.fnyv[30] = 2126402345;
        jr$ScreenBounds.fnyv[31] = 2037163588;
        jr$ScreenBounds.fnyv[32] = -383113142;
        jr$ScreenBounds.fnyv[33] = 2050613405;
        jr$ScreenBounds.fnyv[34] = -383663487;
        jr$ScreenBounds.fnyv[35] = 197727710;
        jr$ScreenBounds.fnyv[36] = -481773262;
        jr$ScreenBounds.fnyv[37] = 1509162857;
        jr$ScreenBounds.fnyv[38] = 397227930;
        jr$ScreenBounds.fnyv[39] = 1375353574;
        jr$ScreenBounds.fnyv[40] = -216698642;
        jr$ScreenBounds.fnyv[41] = 1810467643;
        jr$ScreenBounds.fnyv[42] = 1899809445;
        jr$ScreenBounds.fnyv[43] = 1348567259;
        jr$ScreenBounds.fnyv[44] = 196589791;
        jr$ScreenBounds.fnyv[45] = 882292675;
        jr$ScreenBounds.fnyv[46] = -1336843048;
        jr$ScreenBounds.fnyv[47] = 733315184;
        jr$ScreenBounds.fnyv[48] = 1798802645;
        jr$ScreenBounds.fnyv[49] = 724660757;
        jr$ScreenBounds.fnyv[50] = 1415594446;
        jr$ScreenBounds.fnyv[51] = -689950547;
        jr$ScreenBounds.fnyv[52] = -1836715168;
        jr$ScreenBounds.fnyv[53] = -1209827410;
        jr$ScreenBounds.fnyv[54] = 657521911;
        jr$ScreenBounds.fnyv[55] = 1440642325;
        jr$ScreenBounds.fnyv[56] = 404148954;
        jr$ScreenBounds.fnyv[57] = -30156293;
        jr$ScreenBounds.fnyv[58] = -2065287175;
        jr$ScreenBounds.fnyv[59] = 1135792816;
        jr$ScreenBounds.fnyv[60] = 453204764;
        jr$ScreenBounds.fnyv[61] = -1265763830;
        jr$ScreenBounds.fnyv[62] = -130513796;
        jr$ScreenBounds.fnyv[63] = 1106025736;
        jr$ScreenBounds.fnyv[64] = 1715658496;
        jr$ScreenBounds.fnyv[65] = 518786453;
        jr$ScreenBounds.fnyv[66] = 397762499;
        jr$ScreenBounds.fnyv[67] = 608199581;
        jr$ScreenBounds.fnyv[68] = -1438945270;
        jr$ScreenBounds.fnyv[69] = 1729262714;
        jr$ScreenBounds.fnyv[70] = 1685709562;
        jr$ScreenBounds.fnyv[71] = 1006287821;
        jr$ScreenBounds.fnyv[72] = -1583070509;
        jr$ScreenBounds.fnyv[73] = 1315504024;
        jr$ScreenBounds.fnyv[74] = 968167493;
        jr$ScreenBounds.fnyv[75] = -1791292000;
        jr$ScreenBounds.fnyv[76] = 561618582;
        jr$ScreenBounds.fnyv[77] = 1177517760;
        jr$ScreenBounds.fnyv[78] = 1868787479;
        jr$ScreenBounds.fnyv[79] = 2026145311;
        jr$ScreenBounds.fnyv[80] = -1342465751;
        jr$ScreenBounds.fnyv[81] = 1108333260;
        jr$ScreenBounds.fnyv[82] = 1609756550;
        jr$ScreenBounds.fnyv[83] = 1805251432;
        jr$ScreenBounds.fnyv[84] = 1861235909;
        jr$ScreenBounds.fnyv[85] = 1061276458;
        jr$ScreenBounds.fnyv[86] = -1652165983;
        jr$ScreenBounds.fnyv[87] = -192585408;
        jr$ScreenBounds.fnyv[88] = -1738280179;
        jr$ScreenBounds.fnyv[89] = 1493549129;
        jr$ScreenBounds.fnyv[90] = 1463046842;
        jr$ScreenBounds.fnyv[91] = -820942389;
        jr$ScreenBounds.fnyv[92] = 405588992;
        jr$ScreenBounds.fnyv[93] = 753349882;
        jr$ScreenBounds.fnyv[94] = -715626014;
        jr$ScreenBounds.fnyv[95] = 1978528947;
        jr$ScreenBounds.fnyv[96] = -507958104;
        jr$ScreenBounds.fnyv[97] = 595241953;
        jr$ScreenBounds.fnyv[98] = 614327950;
        jr$ScreenBounds.fnyv[99] = 0x8138133;
    }

    static {
        fnyv = new int[100];
        fnyx = new int[100];
        jr$ScreenBounds.fokm();
        jr$ScreenBounds.fold();
        fnyo = new long[69];
        fnyp = new long[69];
        jr$ScreenBounds.folr();
        jr$ScreenBounds.folz();
    }

    private static /* synthetic */ void folz() {
        jr$ScreenBounds.fnyp[0] = 6520881152791929193L;
        jr$ScreenBounds.fnyp[1] = 4420313792452835538L;
        jr$ScreenBounds.fnyp[2] = -1105085523805233960L;
        jr$ScreenBounds.fnyp[3] = 3792185971195623085L;
        jr$ScreenBounds.fnyp[4] = -1368583253663106022L;
        jr$ScreenBounds.fnyp[5] = 4527694050757562578L;
        jr$ScreenBounds.fnyp[6] = -5744967783308810777L;
        jr$ScreenBounds.fnyp[7] = -1734986029565458802L;
        jr$ScreenBounds.fnyp[8] = 2807055626661182189L;
        jr$ScreenBounds.fnyp[9] = -6347704541193809509L;
        jr$ScreenBounds.fnyp[10] = 3788681241067262353L;
        jr$ScreenBounds.fnyp[11] = 6870250455853696449L;
        jr$ScreenBounds.fnyp[12] = 3490367865804035510L;
        jr$ScreenBounds.fnyp[13] = 1157665246090170594L;
        jr$ScreenBounds.fnyp[14] = -7679360267316928806L;
        jr$ScreenBounds.fnyp[15] = -2162543254775522355L;
        jr$ScreenBounds.fnyp[16] = 3116216551768498545L;
        jr$ScreenBounds.fnyp[17] = 1762672700834575026L;
        jr$ScreenBounds.fnyp[18] = -7915490487413616875L;
        jr$ScreenBounds.fnyp[19] = -1514745976163552599L;
        jr$ScreenBounds.fnyp[20] = 4119868754428848657L;
        jr$ScreenBounds.fnyp[21] = -1081330560655766527L;
        jr$ScreenBounds.fnyp[22] = 658407756720701949L;
        jr$ScreenBounds.fnyp[23] = -8413401447577100884L;
        jr$ScreenBounds.fnyp[24] = 8093163127023151034L;
        jr$ScreenBounds.fnyp[25] = -1290306083431809914L;
        jr$ScreenBounds.fnyp[26] = 7342203782878420810L;
        jr$ScreenBounds.fnyp[27] = -3050776902838381718L;
        jr$ScreenBounds.fnyp[28] = 5421586335102406817L;
        jr$ScreenBounds.fnyp[29] = 5668482318535994146L;
        jr$ScreenBounds.fnyp[30] = -2469781368951095624L;
        jr$ScreenBounds.fnyp[31] = -6607782242332210731L;
        jr$ScreenBounds.fnyp[32] = -175916907497277492L;
        jr$ScreenBounds.fnyp[33] = 2491909013328885349L;
        jr$ScreenBounds.fnyp[34] = -1446493188109374035L;
        jr$ScreenBounds.fnyp[35] = -734586674495027164L;
        jr$ScreenBounds.fnyp[36] = -4306197491360251836L;
        jr$ScreenBounds.fnyp[37] = -2778928732880079606L;
        jr$ScreenBounds.fnyp[38] = 4028680961933685830L;
        jr$ScreenBounds.fnyp[39] = 8919791666116452913L;
        jr$ScreenBounds.fnyp[40] = -1686916653941320558L;
        jr$ScreenBounds.fnyp[41] = 7315299070832903542L;
        jr$ScreenBounds.fnyp[42] = 4770054139059190011L;
        jr$ScreenBounds.fnyp[43] = 3006481206229187695L;
        jr$ScreenBounds.fnyp[44] = -7675917098970269975L;
        jr$ScreenBounds.fnyp[45] = 471386786220400363L;
        jr$ScreenBounds.fnyp[46] = -5519068537956111139L;
        jr$ScreenBounds.fnyp[47] = 7329473128203429582L;
        jr$ScreenBounds.fnyp[48] = 4193780905599984780L;
        jr$ScreenBounds.fnyp[49] = 7394182297242303013L;
        jr$ScreenBounds.fnyp[50] = -8927701193172785442L;
        jr$ScreenBounds.fnyp[51] = -818502743167876651L;
        jr$ScreenBounds.fnyp[52] = 2941448305751985287L;
        jr$ScreenBounds.fnyp[53] = -5076021374547277940L;
        jr$ScreenBounds.fnyp[54] = -6638891742460833483L;
        jr$ScreenBounds.fnyp[55] = -4990031632864846055L;
        jr$ScreenBounds.fnyp[56] = -5228664979055157214L;
        jr$ScreenBounds.fnyp[57] = 5034751381755677790L;
        jr$ScreenBounds.fnyp[58] = 6439402874539535631L;
        jr$ScreenBounds.fnyp[59] = -8504439355677541689L;
        jr$ScreenBounds.fnyp[60] = -2320816700414274839L;
        jr$ScreenBounds.fnyp[61] = 3246184796320332546L;
        jr$ScreenBounds.fnyp[62] = -3561826104634749738L;
        jr$ScreenBounds.fnyp[63] = 7320524590036342620L;
        jr$ScreenBounds.fnyp[64] = -4563740183506886099L;
        jr$ScreenBounds.fnyp[65] = 9089183043009544230L;
        jr$ScreenBounds.fnyp[66] = -5691523611875333032L;
        jr$ScreenBounds.fnyp[67] = -4089061358892013600L;
        jr$ScreenBounds.fnyp[68] = -8894884943364756761L;
    }

    private static /* synthetic */ void folr() {
        jr$ScreenBounds.fnyo[0] = 8676010125902605600L;
        jr$ScreenBounds.fnyo[1] = -3339184111331970317L;
        jr$ScreenBounds.fnyo[2] = 3745531317887302616L;
        jr$ScreenBounds.fnyo[3] = -865300993746313779L;
        jr$ScreenBounds.fnyo[4] = -2676472800481534279L;
        jr$ScreenBounds.fnyo[5] = -8625455532898481838L;
        jr$ScreenBounds.fnyo[6] = 1761872152584844081L;
        jr$ScreenBounds.fnyo[7] = 4469571402253593432L;
        jr$ScreenBounds.fnyo[8] = -1814437428882733591L;
        jr$ScreenBounds.fnyo[9] = 9073686611256066279L;
        jr$ScreenBounds.fnyo[10] = 5590941557019361618L;
        jr$ScreenBounds.fnyo[11] = 167209710047788979L;
        jr$ScreenBounds.fnyo[12] = 5994477601415516692L;
        jr$ScreenBounds.fnyo[13] = 5185711997753560098L;
        jr$ScreenBounds.fnyo[14] = 3660320072525824331L;
        jr$ScreenBounds.fnyo[15] = 8779493285894548866L;
        jr$ScreenBounds.fnyo[16] = 7877646356270739036L;
        jr$ScreenBounds.fnyo[17] = 1730114249551741065L;
        jr$ScreenBounds.fnyo[18] = 1776617652879741135L;
        jr$ScreenBounds.fnyo[19] = 6806932484972675447L;
        jr$ScreenBounds.fnyo[20] = 397491997378685031L;
        jr$ScreenBounds.fnyo[21] = -517223058550563551L;
        jr$ScreenBounds.fnyo[22] = 6875867035418867547L;
        jr$ScreenBounds.fnyo[23] = -5352809905528770505L;
        jr$ScreenBounds.fnyo[24] = 8233259773200583678L;
        jr$ScreenBounds.fnyo[25] = 2395512882944612353L;
        jr$ScreenBounds.fnyo[26] = -8271428444726145100L;
        jr$ScreenBounds.fnyo[27] = 770152149837042937L;
        jr$ScreenBounds.fnyo[28] = -1120443600411990295L;
        jr$ScreenBounds.fnyo[29] = -794836767159643558L;
        jr$ScreenBounds.fnyo[30] = -3519135611101932148L;
        jr$ScreenBounds.fnyo[31] = 143992819743336426L;
        jr$ScreenBounds.fnyo[32] = -2893569305924724549L;
        jr$ScreenBounds.fnyo[33] = -2566070585938760318L;
        jr$ScreenBounds.fnyo[34] = 4906557875025015607L;
        jr$ScreenBounds.fnyo[35] = -589167802990811962L;
        jr$ScreenBounds.fnyo[36] = -1650305045612569087L;
        jr$ScreenBounds.fnyo[37] = -6904109027891706778L;
        jr$ScreenBounds.fnyo[38] = 8421866481151639166L;
        jr$ScreenBounds.fnyo[39] = -2538503437067321458L;
        jr$ScreenBounds.fnyo[40] = -3450335276865133949L;
        jr$ScreenBounds.fnyo[41] = -4762056348389786466L;
        jr$ScreenBounds.fnyo[42] = 6019390989374582505L;
        jr$ScreenBounds.fnyo[43] = 6813872876238515191L;
        jr$ScreenBounds.fnyo[44] = -7404111564734823243L;
        jr$ScreenBounds.fnyo[45] = -5308445405568384402L;
        jr$ScreenBounds.fnyo[46] = 6293140451030900751L;
        jr$ScreenBounds.fnyo[47] = -1465285475130858270L;
        jr$ScreenBounds.fnyo[48] = -8160330807522237299L;
        jr$ScreenBounds.fnyo[49] = 9110409573183757810L;
        jr$ScreenBounds.fnyo[50] = -4096871955479835031L;
        jr$ScreenBounds.fnyo[51] = 6703510682866940155L;
        jr$ScreenBounds.fnyo[52] = -3481832862172832115L;
        jr$ScreenBounds.fnyo[53] = 3633960855912299363L;
        jr$ScreenBounds.fnyo[54] = -8616288839819410280L;
        jr$ScreenBounds.fnyo[55] = -8481139418688261687L;
        jr$ScreenBounds.fnyo[56] = 5281211644911997279L;
        jr$ScreenBounds.fnyo[57] = -1272769123350094380L;
        jr$ScreenBounds.fnyo[58] = 6939516811274439632L;
        jr$ScreenBounds.fnyo[59] = -7712243441131794289L;
        jr$ScreenBounds.fnyo[60] = 3357547657562855534L;
        jr$ScreenBounds.fnyo[61] = -6361779213494085290L;
        jr$ScreenBounds.fnyo[62] = -4656229325770716263L;
        jr$ScreenBounds.fnyo[63] = 6244510098720667593L;
        jr$ScreenBounds.fnyo[64] = 8174481196011269263L;
        jr$ScreenBounds.fnyo[65] = 551629783340015182L;
        jr$ScreenBounds.fnyo[66] = -6277368889735159431L;
        jr$ScreenBounds.fnyo[67] = -8362360861297218179L;
        jr$ScreenBounds.fnyo[68] = 9067635614003224198L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean intersectsTag(float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fohm", fnyn(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$ScreenBounds.fnyq("fohn", fnyu(int ), (int)75)) break;
            v0 /* !! */  = (long)jr$ScreenBounds.fnyq("foho", fnyu(int ), (int)76);
        }
        var7_5 = jr$ScreenBounds.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fohs", fnyn(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jr$ScreenBounds.fnyq("fohu", fnyu(int ), (int)77)) break;
            v1 /* !! */  = (long)jr$ScreenBounds.fnyq("fohv", fnyu(int ), (int)78);
        }
        var6_6 /* !! */  = jr$ScreenBounds.b;
        v2 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - jr$ScreenBounds.fnyq("fohw", fnyn(int ), (int)56));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1722043968: {
                    v3 = jr$ScreenBounds.fnyq("fohy", fnyn(int ), (int)57);
                    continue block32;
                }
                case -1712518235: {
                    break block32;
                }
                case -1272832960: {
                    v3 = jr$ScreenBounds.fnyq("fohz", fnyn(int ), (int)58);
                    continue block32;
                }
                case 650019299: {
                    v3 = jr$ScreenBounds.fnyq("foib", fnyn(int ), (int)59);
                    continue block32;
                }
            }
            break;
        }
        var5_7 = jr$ScreenBounds.a;
        if (var7_5) {
            throw null;
lbl34:
            // 7 sources

            return (boolean)jr$ScreenBounds.fnyq("foid", fnyu(int ), (int)79);
        }
        if (var5_7 || var5_7) ** GOTO lbl34
        v4 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl41
        block34: while (true) {
            v4 /* !! */  = (long)(jr$ScreenBounds.fnyq("foig", fnyn(int ), (int)61) - jr$ScreenBounds.fnyq("foie", fnyn(int ), (int)60));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1712518235: {
                    break block34;
                }
                case -890090625: {
                    continue block34;
                }
            }
            break;
        }
        if (!this.tagValid) ** GOTO lbl97
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_7) ** GOTO lbl34
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("foij", fnyn(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jr$ScreenBounds.fnyq("foik", fnyu(int ), (int)80)) break;
                    v5 /* !! */  = (long)jr$ScreenBounds.fnyq("foim", fnyu(int ), (int)81);
                }
                if (!(var1_1 < this.tagMaxX)) ** GOTO lbl97
                if (var5_7) ** GOTO lbl34
                v6 /* !! */  = jr$ScreenBounds.ms;
                if (true) ** GOTO lbl63
                block36: while (true) {
                    v6 /* !! */  = (long)(v7 - jr$ScreenBounds.fnyq("foip", fnyn(int ), (int)63));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1712518235: {
                            break block36;
                        }
                        case 102452867: {
                            v7 = jr$ScreenBounds.fnyq("foiu", fnyn(int ), (int)64);
                            continue block36;
                        }
                        case 1746475857: {
                            v7 = jr$ScreenBounds.fnyq("foiv", fnyn(int ), (int)65);
                            continue block36;
                        }
                        case 1784272980: {
                            v7 = jr$ScreenBounds.fnyq("foiw", fnyn(int ), (int)66);
                            continue block36;
                        }
                    }
                    break;
                }
                if (!(var1_1 + var3_3 > this.tagMinX)) ** GOTO lbl97
                if (var5_7) ** GOTO lbl34
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("foix", fnyn(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jr$ScreenBounds.fnyq("foiy", fnyu(int ), (int)82)) break;
                    v8 /* !! */  = (long)jr$ScreenBounds.fnyq("foiz", fnyu(int ), (int)83);
                }
                if (!(var2_2 < this.tagMaxY)) ** GOTO lbl97
                if (var5_7) ** GOTO lbl34
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("foja", fnyn(int ), (int)68)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == jr$ScreenBounds.fnyq("fojd", fnyu(int ), (int)84)) break;
                    v9 /* !! */  = (long)jr$ScreenBounds.fnyq("fojf", fnyu(int ), (int)85);
                }
                if (!(var2_2 + var4_4 > this.tagMinY)) ** GOTO lbl97
                if (var5_7) ** GOTO lbl34
                v10 = jr$ScreenBounds.fnyq("fojg", fnyu(int ), (int)86);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl100
lbl97:
                // 5 sources

                if (!var5_7 && !var5_7) ** break;
                ** continue;
                v10 = jr$ScreenBounds.fnyq("foji", fnyu(int ), (int)87);
lbl100:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojj", fnyu(int ), (int)88);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojl", fnyu(int ), (int)89);
                if (!var7_5) break;
                throw null;
            }
lbl110:
            // 2 sources

            case 2: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojm", fnyu(int ), (int)90);
                if (var7_5) {
                    throw null;
                }
            }
lbl114:
            // 4 sources

            case 3: {
                do {
                    var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojr", fnyu(int ), (int)91);
                } while (!var7_5);
                throw null;
            }
            case 4: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojs", fnyu(int ), (int)92);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl124:
            // 2 sources

            case 5: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("foju", fnyu(int ), (int)93);
                if (!var7_5) ** GOTO lbl110
                throw null;
            }
lbl128:
            // 2 sources

            case 6: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojv", fnyu(int ), (int)94);
                if (!var7_5) ** GOTO lbl124
                throw null;
            }
lbl132:
            // 2 sources

            case 7: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojw", fnyu(int ), (int)95);
                if (var7_5) {
                    throw null;
                }
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fojy", fnyu(int ), (int)96);
                    if (!var7_5) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl141:
            // 2 sources

            case 9: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fokg", fnyu(int ), (int)97);
                if (!var7_5) ** GOTO lbl114
                throw null;
            }
            case 10: {
                var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fokh", fnyu(int ), (int)98);
                if (!var7_5) ** GOTO lbl132
                throw null;
            }
            case 11: 
        }
        var6_6 /* !! */  = (int)jr$ScreenBounds.fnyq("fokk", fnyu(int ), (int)99);
        ** while (!var7_5)
lbl152:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    void setTag(float f2, float f3, float f4, float f5) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ms - jr$ScreenBounds.fnyq("fobf", fnyn(int ), (int)17)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jr$ScreenBounds.fnyq("fobg", fnyu(int ), (int)16)) break;
            object = jr$ScreenBounds.fnyq("fobj", fnyu(int ), (int)17);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ms - jr$ScreenBounds.fnyq("fobk", fnyn(int ), (int)18)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == jr$ScreenBounds.fnyq("fobl", fnyu(int ), (int)18)) break;
            object = jr$ScreenBounds.fnyq("fobn", fnyu(int ), (int)19);
        }
        int n2 = b;
        Object object = ms;
        block17: while (true) {
            switch ((int)object) {
                case -1712518235: {
                    break block17;
                }
                case -213859347: {
                    object = jr$ScreenBounds.fnyq("fobr", fnyn(int ), (int)20) - jr$ScreenBounds.fnyq("fobo", fnyn(int ), (int)19);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return;
        Object object2 = ms;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - jr$ScreenBounds.fnyq("fobt", fnyn(int ), (int)21);
            }
            switch ((int)object2) {
                case -1712518235: {
                    break block18;
                }
                case -642547328: {
                    callSite = jr$ScreenBounds.fnyq("fobv", fnyn(int ), (int)22);
                    continue block18;
                }
                case 260949111: {
                    callSite = jr$ScreenBounds.fnyq("fobw", fnyn(int ), (int)23);
                    continue block18;
                }
                case 597835612: {
                    callSite = jr$ScreenBounds.fnyq("fobx", fnyn(int ), (int)24);
                    continue block18;
                }
            }
            break;
        }
        this.tagMinX = f2;
        if (bl3 || bl3) return;
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = ms - jr$ScreenBounds.fnyq("foca", fnyn(int ), (int)25)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == jr$ScreenBounds.fnyq("focc", fnyu(int ), (int)20)) {
                this.tagMinY = f3;
                if (bl3) return;
                break;
            }
            object3 = jr$ScreenBounds.fnyq("focd", fnyu(int ), (int)21);
        }
        if (bl3) return;
        while (true) {
            long l5;
            Object object4;
            if ((object4 = (l5 = ms - jr$ScreenBounds.fnyq("foce", fnyn(int ), (int)26)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object4 == jr$ScreenBounds.fnyq("focf", fnyu(int ), (int)22)) {
                this.tagMaxX = f2 + f4;
                if (bl3) return;
                break;
            }
            object4 = jr$ScreenBounds.fnyq("focg", fnyu(int ), (int)23);
        }
        if (bl3) return;
        Object object5 = ms;
        boolean bl5 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - jr$ScreenBounds.fnyq("foci", fnyn(int ), (int)27);
            }
            switch ((int)object5) {
                case -1712518235: {
                    break block21;
                }
                case -1618567752: {
                    callSite = jr$ScreenBounds.fnyq("fock", fnyn(int ), (int)28);
                    continue block21;
                }
                case -82620550: {
                    callSite = jr$ScreenBounds.fnyq("focn", fnyn(int ), (int)29);
                    continue block21;
                }
            }
            break;
        }
        this.tagMaxY = f3 + f5;
        if (bl3 || bl3) return;
        CallSite callSite = jr$ScreenBounds.fnyq("focp", fnyu(int ), (int)24);
        while (true) {
            long l6;
            Object object6;
            if ((object6 = (l6 = ms - jr$ScreenBounds.fnyq("focq", fnyn(int ), (int)30)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object6 == jr$ScreenBounds.fnyq("focr", fnyu(int ), (int)25)) {
                this.tagValid = callSite;
                if (bl3) return;
                break;
            }
            object6 = jr$ScreenBounds.fnyq("focs", fnyu(int ), (int)26);
        }
        if (!bl3) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    float centerX() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ms - jr$ScreenBounds.fnyq("fnyt", fnyn(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jr$ScreenBounds.fnyq("fnyy", fnyu(int ), (int)0)) break;
            object = jr$ScreenBounds.fnyq("fnyz", fnyu(int ), (int)1);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ms - jr$ScreenBounds.fnyq("fnzc", fnyn(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == jr$ScreenBounds.fnyq("fnzf", fnyu(int ), (int)2)) break;
            object = jr$ScreenBounds.fnyq("fnzh", fnyu(int ), (int)3);
        }
        int n2 = b;
        Object object = ms;
        block6: while (true) {
            switch ((int)object) {
                case -1712518235: {
                    break block6;
                }
                case 1825280637: {
                    object = jr$ScreenBounds.fnyq("fnzl", fnyn(int ), (int)3) - jr$ScreenBounds.fnyq("fnzj", fnyn(int ), (int)2);
                    continue block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (float)jr$ScreenBounds.fnyq("fnzn", fnzm(int ), (int)4);
        if (bl3) return (float)jr$ScreenBounds.fnyq("fnzn", fnzm(int ), (int)4);
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = ms - jr$ScreenBounds.fnyq("fnzr", fnyn(int ), (int)4)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == jr$ScreenBounds.fnyq("fnzs", fnyu(int ), (int)5)) {
                return this.anchorX;
            }
            object2 = jr$ScreenBounds.fnyq("fnzu", fnyu(int ), (int)6);
        }
    }

    private static /* synthetic */ float fnzm(int n2) {
        return Float.intBitsToFloat(fnyv[n2] ^ fnyx[n2]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    float topY() {
        Object object = ms;
        boolean bl2 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - jr$ScreenBounds.fnyq("foae", fnyn(int ), (int)5);
            }
            switch ((int)object) {
                case -1712518235: {
                    break block20;
                }
                case -823377841: {
                    callSite = jr$ScreenBounds.fnyq("foaf", fnyn(int ), (int)6);
                    continue block20;
                }
                case -786920945: {
                    callSite = jr$ScreenBounds.fnyq("foag", fnyn(int ), (int)7);
                    continue block20;
                }
                case 1165276497: {
                    callSite = jr$ScreenBounds.fnyq("foai", fnyn(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ms;
        boolean bl4 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - jr$ScreenBounds.fnyq("foak", fnyn(int ), (int)9);
            }
            switch ((int)object2) {
                case -1712518235: {
                    break block21;
                }
                case -1520294352: {
                    callSite = jr$ScreenBounds.fnyq("foal", fnyn(int ), (int)10);
                    continue block21;
                }
                case -784848672: {
                    callSite = jr$ScreenBounds.fnyq("foam", fnyn(int ), (int)11);
                    continue block21;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ms;
        block22: while (true) {
            switch ((int)object3) {
                case -1712518235: {
                    break block22;
                }
                case -333813086: {
                    object3 = jr$ScreenBounds.fnyq("foap", fnyn(int ), (int)13) - jr$ScreenBounds.fnyq("foao", fnyn(int ), (int)12);
                    continue block22;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (float)jr$ScreenBounds.fnyq("foar", fnzm(int ), (int)11);
        if (bl5) return (float)jr$ScreenBounds.fnyq("foar", fnzm(int ), (int)11);
        Object object4 = ms;
        boolean bl6 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - jr$ScreenBounds.fnyq("foas", fnyn(int ), (int)14);
            }
            switch ((int)object4) {
                case -2134467853: {
                    callSite = jr$ScreenBounds.fnyq("foat", fnyn(int ), (int)15);
                    continue block23;
                }
                case -1712518235: {
                    return this.anchorY;
                }
                case 464302717: {
                    callSite = jr$ScreenBounds.fnyq("foax", fnyn(int ), (int)16);
                    continue block23;
                }
            }
            break;
        }
        return this.anchorY;
    }

    private static /* synthetic */ int fnyu(int n2) {
        return fnyv[n2] ^ fnyx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void clearTag() {
        v0 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - jr$ScreenBounds.fnyq("fodt", fnyn(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1811042914: {
                    v1 = jr$ScreenBounds.fnyq("fodu", fnyn(int ), (int)32);
                    continue block14;
                }
                case -1712518235: {
                    break block14;
                }
                case -72214044: {
                    v1 = jr$ScreenBounds.fnyq("fodv", fnyn(int ), (int)33);
                    continue block14;
                }
                case 454461798: {
                    v1 = jr$ScreenBounds.fnyq("fodw", fnyn(int ), (int)34);
                    continue block14;
                }
            }
            break;
        }
        var3_1 = jr$ScreenBounds.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fodx", fnyn(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jr$ScreenBounds.fnyq("fody", fnyu(int ), (int)41)) break;
            v2 /* !! */  = (long)jr$ScreenBounds.fnyq("foea", fnyu(int ), (int)42);
        }
        var2_2 /* !! */  = jr$ScreenBounds.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("foed", fnyn(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jr$ScreenBounds.fnyq("foef", fnyu(int ), (int)43)) break;
                    v3 /* !! */  = (long)jr$ScreenBounds.fnyq("foeh", fnyu(int ), (int)44);
                }
                var1_3 = jr$ScreenBounds.a;
                if (var3_1) {
                    throw null;
lbl35:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl35
                v4 = jr$ScreenBounds.fnyq("foei", fnyu(int ), (int)45);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("foek", fnyn(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == jr$ScreenBounds.fnyq("foel", fnyu(int ), (int)46)) break;
                    v5 /* !! */  = (long)jr$ScreenBounds.fnyq("foem", fnyu(int ), (int)47);
                }
                this.tagValid = v4;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("foes", fnyu(int ), (int)48);
                } while (!var3_1);
                throw null;
            }
lbl52:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("foeu", fnyu(int ), (int)49);
                } while (!var3_1);
                throw null;
            }
lbl57:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("foev", fnyu(int ), (int)50);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("foew", fnyu(int ), (int)51);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("foex", fnyu(int ), (int)52);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)jr$ScreenBounds.fnyq("fofa", fnyu(int ), (int)53);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long fnyn(int n2) {
        return fnyo[n2] ^ fnyp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean containsTag(float var1_1, float var2_2) {
        v0 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - jr$ScreenBounds.fnyq("fofb", fnyn(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1712518235: {
                    break block37;
                }
                case -1387714801: {
                    v1 = jr$ScreenBounds.fnyq("fofc", fnyn(int ), (int)39);
                    continue block37;
                }
                case -309026089: {
                    v1 = jr$ScreenBounds.fnyq("fofd", fnyn(int ), (int)40);
                    continue block37;
                }
                case 125971399: {
                    v1 = jr$ScreenBounds.fnyq("fofe", fnyn(int ), (int)41);
                    continue block37;
                }
            }
            break;
        }
        var5_3 = jr$ScreenBounds.c;
        v2 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl22
        block38: while (true) {
            v2 /* !! */  = (long)(jr$ScreenBounds.fnyq("fofk", fnyn(int ), (int)43) - jr$ScreenBounds.fnyq("fofj", fnyn(int ), (int)42));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1712518235: {
                    break block38;
                }
                case 699422983: {
                    continue block38;
                }
            }
            break;
        }
        var4_4 /* !! */  = jr$ScreenBounds.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fofm", fnyn(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jr$ScreenBounds.fnyq("fofn", fnyu(int ), (int)54)) break;
            v3 /* !! */  = (long)jr$ScreenBounds.fnyq("fofo", fnyu(int ), (int)55);
        }
        var3_5 = jr$ScreenBounds.a;
        if (var5_3) {
            throw null;
lbl37:
            // 7 sources

            return (boolean)jr$ScreenBounds.fnyq("fofq", fnyu(int ), (int)56);
        }
        if (var3_5 || var3_5) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fofr", fnyn(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == jr$ScreenBounds.fnyq("fofu", fnyu(int ), (int)57)) break;
            v4 /* !! */  = (long)jr$ScreenBounds.fnyq("fofw", fnyu(int ), (int)58);
        }
        if (!this.tagValid) ** GOTO lbl100
        if (var3_5) ** GOTO lbl37
        v5 /* !! */  = jr$ScreenBounds.ms;
        if (true) ** GOTO lbl52
        block42: while (true) {
            v5 /* !! */  = (long)(jr$ScreenBounds.fnyq("fofy", fnyn(int ), (int)47) - jr$ScreenBounds.fnyq("fofx", fnyn(int ), (int)46));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1712518235: {
                    break block42;
                }
                case 1417865512: {
                    continue block42;
                }
            }
            break;
        }
        if (!(var1_1 >= this.tagMinX)) ** GOTO lbl100
        if (var3_5) ** GOTO lbl37
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jr$ScreenBounds.ms - jr$ScreenBounds.fnyq("fofz", fnyn(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == jr$ScreenBounds.fnyq("foga", fnyu(int ), (int)59)) break;
            v6 /* !! */  = (long)jr$ScreenBounds.fnyq("fogb", fnyu(int ), (int)60);
        }
        if (!(var1_1 <= this.tagMaxX)) ** GOTO lbl100
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl37
                v7 /* !! */  = jr$ScreenBounds.ms;
                if (true) ** GOTO lbl74
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - jr$ScreenBounds.fnyq("fogd", fnyn(int ), (int)49));
lbl74:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1712518235: {
                            break block44;
                        }
                        case 188688273: {
                            v8 = jr$ScreenBounds.fnyq("foge", fnyn(int ), (int)50);
                            continue block44;
                        }
                        case 568497385: {
                            v8 = jr$ScreenBounds.fnyq("fogg", fnyn(int ), (int)51);
                            continue block44;
                        }
                    }
                    break;
                }
                if (!(var2_2 >= this.tagMinY)) ** GOTO lbl100
                if (var3_5) ** GOTO lbl37
                v9 /* !! */  = jr$ScreenBounds.ms;
                if (true) ** GOTO lbl89
                block45: while (true) {
                    v9 /* !! */  = (long)(jr$ScreenBounds.fnyq("fogj", fnyn(int ), (int)53) - jr$ScreenBounds.fnyq("fogi", fnyn(int ), (int)52));
lbl89:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1712518235: {
                            break block45;
                        }
                        case -1384266176: {
                            continue block45;
                        }
                    }
                    break;
                }
                if (!(var2_2 <= this.tagMaxY)) ** GOTO lbl100
                if (var3_5) ** GOTO lbl37
                v10 = jr$ScreenBounds.fnyq("fogk", fnyu(int ), (int)61);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl103
lbl100:
                // 5 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v10 = jr$ScreenBounds.fnyq("fogn", fnyu(int ), (int)62);
lbl103:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogo", fnyu(int ), (int)63);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogp", fnyu(int ), (int)64);
                    if (!var5_3) break block14;
                    throw null;
                }
            }
lbl114:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogq", fnyu(int ), (int)65);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 3: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogr", fnyu(int ), (int)66);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 4: {
                do {
                    var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogs", fnyu(int ), (int)67);
                } while (!var5_3);
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fogu", fnyu(int ), (int)68);
                if (!var5_3) break;
                throw null;
            }
lbl133:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("foha", fnyu(int ), (int)69);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl138:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fohd", fnyu(int ), (int)70);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl143:
            // 3 sources

            case 8: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fohe", fnyu(int ), (int)71);
                if (!var5_3) ** GOTO lbl114
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fohh", fnyu(int ), (int)72);
                if (!var5_3) ** GOTO lbl138
                throw null;
            }
lbl151:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fohi", fnyu(int ), (int)73);
                if (!var5_3) ** GOTO lbl133
                throw null;
            }
            case 11: 
        }
        var4_4 /* !! */  = (int)jr$ScreenBounds.fnyq("fohj", fnyu(int ), (int)74);
        ** while (!var5_3)
lbl158:
        // 1 sources

        throw null;
    }
}

