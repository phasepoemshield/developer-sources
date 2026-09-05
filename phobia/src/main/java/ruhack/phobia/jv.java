/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1531
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2586
 *  net.minecraft.class_2591
 *  org.joml.Vector2f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import net.minecraft.class_1531;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2591;
import org.joml.Vector2f;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.df;
import ruhack.phobia.di;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jv$ChestTimer;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.lv;
import ruhack.phobia.mq;
import ruhack.phobia.nj;
import ruhack.phobia.op;

public final class jv
extends ds {
    public static final boolean a;
    public static final long qz = 8227256130856118626L;
    private final Vector2f projected;
    private static long[] jatu;
    private final List<jv$ChestTimer> timers;
    private static int[] jasy;
    private static int[] jata;
    private int lastScanAge;
    private static long[] jatv;
    private static final class_1799 CHEST_ICON;
    public static final boolean c;
    public static final int b;
    private final List<class_2338> chests;
    private static final Pattern TIMER;

    private static /* synthetic */ void jcip() {
        jv.jasy[200] = -1166705585;
        jv.jasy[201] = -1538563931;
        jv.jasy[202] = 843597266;
        jv.jasy[203] = -952763419;
        jv.jasy[204] = -85551523;
        jv.jasy[205] = -625313694;
        jv.jasy[206] = 1333372134;
        jv.jasy[207] = 1165553316;
        jv.jasy[208] = -401099423;
        jv.jasy[209] = -585613991;
        jv.jasy[210] = 1072014775;
        jv.jasy[211] = -1416527159;
        jv.jasy[212] = -532938757;
        jv.jasy[213] = -100771708;
        jv.jasy[214] = -1878559672;
        jv.jasy[215] = -312709973;
        jv.jasy[216] = -1079302891;
        jv.jasy[217] = 813011595;
        jv.jasy[218] = -1669871042;
        jv.jasy[219] = 1192925225;
        jv.jasy[220] = -1035756471;
        jv.jasy[221] = -342320644;
        jv.jasy[222] = 911118497;
        jv.jasy[223] = -1238528426;
        jv.jasy[224] = 2097042244;
        jv.jasy[225] = 2133619128;
        jv.jasy[226] = -1569883759;
        jv.jasy[227] = 684142516;
        jv.jasy[228] = -1985329640;
        jv.jasy[229] = 1838403199;
        jv.jasy[230] = -427148270;
        jv.jasy[231] = 534160080;
        jv.jasy[232] = 1786606698;
        jv.jasy[233] = -1973353393;
        jv.jasy[234] = -658998010;
        jv.jasy[235] = 698488673;
        jv.jasy[236] = -1473292177;
        jv.jasy[237] = 982743904;
        jv.jasy[238] = 140916906;
        jv.jasy[239] = 1393421891;
        jv.jasy[240] = -785665396;
        jv.jasy[241] = 2143875414;
        jv.jasy[242] = -441998070;
        jv.jasy[243] = -186833684;
        jv.jasy[244] = -938819708;
        jv.jasy[245] = -1003361557;
        jv.jasy[246] = 1425668223;
        jv.jasy[247] = -1060425506;
        jv.jasy[248] = 2050536376;
        jv.jasy[249] = -1986694630;
        jv.jasy[250] = -495218946;
        jv.jasy[251] = -1985620781;
        jv.jasy[252] = -1737278513;
        jv.jasy[253] = -2018682812;
        jv.jasy[254] = 1496453210;
        jv.jasy[255] = -793851782;
        jv.jasy[256] = -1866307428;
        jv.jasy[257] = 1487248257;
        jv.jasy[258] = -716149814;
        jv.jasy[259] = -661736356;
        jv.jasy[260] = 47513590;
        jv.jasy[261] = -155367772;
        jv.jasy[262] = -207184145;
        jv.jasy[263] = -690625025;
        jv.jasy[264] = 104911860;
        jv.jasy[265] = 1303517446;
        jv.jasy[266] = 188067919;
        jv.jasy[267] = -1356884270;
        jv.jasy[268] = 367166135;
        jv.jasy[269] = -44476214;
        jv.jasy[270] = -1072149851;
        jv.jasy[271] = -1671382307;
        jv.jasy[272] = 665648360;
        jv.jasy[273] = -1787612571;
        jv.jasy[274] = 57028094;
        jv.jasy[275] = 91959765;
        jv.jasy[276] = -1366179764;
        jv.jasy[277] = -1751018802;
        jv.jasy[278] = -1506501964;
        jv.jasy[279] = 807195412;
        jv.jasy[280] = -218445240;
        jv.jasy[281] = 799100044;
        jv.jasy[282] = 2011927953;
        jv.jasy[283] = -1785505204;
        jv.jasy[284] = -827294961;
        jv.jasy[285] = 1656880526;
        jv.jasy[286] = 214829161;
        jv.jasy[287] = -578259128;
        jv.jasy[288] = 1932437257;
        jv.jasy[289] = 1779159219;
        jv.jasy[290] = 1424878139;
        jv.jasy[291] = 867075399;
        jv.jasy[292] = 123443032;
        jv.jasy[293] = 878800425;
        jv.jasy[294] = 1295821003;
        jv.jasy[295] = -1600831170;
        jv.jasy[296] = 1658709925;
        jv.jasy[297] = 106272449;
        jv.jasy[298] = 873500359;
        jv.jasy[299] = 1842729429;
    }

    private static /* synthetic */ long jats(int n2) {
        return jatu[n2] ^ jatv[n2];
    }

    static {
        jasy = new int[490];
        jata = new int[490];
        jv.jcih();
        jv.jcim();
        jv.jcip();
        jv.jcit();
        jv.jciw();
        jv.jciz();
        jv.jcjc();
        jv.jcjf();
        jv.jcji();
        jv.jcjl();
        jatu = new long[195];
        jatv = new long[195];
        jv.jcjo();
        jv.jcjs();
        jv.jcjw();
        jv.jcka();
        TIMER = Pattern.compile("(\\d{2}):(\\d{2})");
        CHEST_ICON = new class_1799((class_1935)class_1802.field_8106);
    }

    private static /* synthetic */ void jcjl() {
        jv.jata[400] = 1362570682;
        jv.jata[401] = -1692985809;
        jv.jata[402] = -1496950243;
        jv.jata[403] = -631320715;
        jv.jata[404] = 624889164;
        jv.jata[405] = 1288376436;
        jv.jata[406] = 271681716;
        jv.jata[407] = 1270459148;
        jv.jata[408] = 2086968162;
        jv.jata[409] = -959681279;
        jv.jata[410] = -663326644;
        jv.jata[411] = 1050039497;
        jv.jata[412] = 293441857;
        jv.jata[413] = 266917695;
        jv.jata[414] = 152481452;
        jv.jata[415] = 2061522780;
        jv.jata[416] = -1825027143;
        jv.jata[417] = 1526309530;
        jv.jata[418] = 596512631;
        jv.jata[419] = -578597473;
        jv.jata[420] = -553848444;
        jv.jata[421] = 1575116278;
        jv.jata[422] = 894268643;
        jv.jata[423] = 10852604;
        jv.jata[424] = 1012753208;
        jv.jata[425] = 528196883;
        jv.jata[426] = 2104480115;
        jv.jata[427] = 1123010257;
        jv.jata[428] = -915185490;
        jv.jata[429] = -1632610979;
        jv.jata[430] = -1746558018;
        jv.jata[431] = 1140190350;
        jv.jata[432] = -1021733716;
        jv.jata[433] = 366899340;
        jv.jata[434] = 707461404;
        jv.jata[435] = -632255585;
        jv.jata[436] = -139943026;
        jv.jata[437] = -622145400;
        jv.jata[438] = -76867757;
        jv.jata[439] = -13508386;
        jv.jata[440] = -1118604194;
        jv.jata[441] = -1701029086;
        jv.jata[442] = 1026798854;
        jv.jata[443] = -1521471579;
        jv.jata[444] = 348268977;
        jv.jata[445] = 932683530;
        jv.jata[446] = 331638064;
        jv.jata[447] = 430599991;
        jv.jata[448] = 1385304240;
        jv.jata[449] = 1971466730;
        jv.jata[450] = -1819220186;
        jv.jata[451] = -1102507943;
        jv.jata[452] = -1118999649;
        jv.jata[453] = 515321109;
        jv.jata[454] = 647946323;
        jv.jata[455] = -105224520;
        jv.jata[456] = 1594192144;
        jv.jata[457] = -1194014138;
        jv.jata[458] = 1455010608;
        jv.jata[459] = -1683326268;
        jv.jata[460] = -6303978;
        jv.jata[461] = 1291868382;
        jv.jata[462] = -1850224574;
        jv.jata[463] = -1628934413;
        jv.jata[464] = -1654423540;
        jv.jata[465] = 292698751;
        jv.jata[466] = -1915557916;
        jv.jata[467] = 1896196492;
        jv.jata[468] = 367445793;
        jv.jata[469] = -2064373745;
        jv.jata[470] = 1147240003;
        jv.jata[471] = -1566491084;
        jv.jata[472] = 1842333079;
        jv.jata[473] = -1912484503;
        jv.jata[474] = -607770462;
        jv.jata[475] = -1524791897;
        jv.jata[476] = 323471676;
        jv.jata[477] = -879338917;
        jv.jata[478] = -8836447;
        jv.jata[479] = 1726270812;
        jv.jata[480] = -1255897025;
        jv.jata[481] = -1807076244;
        jv.jata[482] = -1578817745;
        jv.jata[483] = -1718869782;
        jv.jata[484] = -94073097;
        jv.jata[485] = 238758773;
        jv.jata[486] = 144351117;
        jv.jata[487] = 1799522292;
        jv.jata[488] = 34085953;
        jv.jata[489] = -1889806463;
    }

    private static /* synthetic */ double jazr(int n2) {
        return Double.longBitsToDouble(jatu[n2] ^ jatv[n2]);
    }

    private static /* synthetic */ int jasw(int n2) {
        return jasy[n2] ^ jata[n2];
    }

    private static /* synthetic */ void jcjc() {
        jv.jata[100] = -1294646555;
        jv.jata[101] = 777758207;
        jv.jata[102] = -1483169768;
        jv.jata[103] = -1965235367;
        jv.jata[104] = -476059409;
        jv.jata[105] = 884992785;
        jv.jata[106] = -1133876489;
        jv.jata[107] = 996305526;
        jv.jata[108] = -797357048;
        jv.jata[109] = 1598074636;
        jv.jata[110] = 79581496;
        jv.jata[111] = 1413445114;
        jv.jata[112] = 70967081;
        jv.jata[113] = 1345962050;
        jv.jata[114] = -709444918;
        jv.jata[115] = -58947248;
        jv.jata[116] = 1357231244;
        jv.jata[117] = -142468481;
        jv.jata[118] = -919150695;
        jv.jata[119] = -297370949;
        jv.jata[120] = 1619421464;
        jv.jata[121] = -1629376077;
        jv.jata[122] = 954439370;
        jv.jata[123] = -362207177;
        jv.jata[124] = 1929656703;
        jv.jata[125] = 1484778416;
        jv.jata[126] = -1119664333;
        jv.jata[127] = -840888099;
        jv.jata[128] = 2099194326;
        jv.jata[129] = 1561948722;
        jv.jata[130] = -1190663412;
        jv.jata[131] = -509435764;
        jv.jata[132] = 561025639;
        jv.jata[133] = 993173792;
        jv.jata[134] = 1598626535;
        jv.jata[135] = 1477972421;
        jv.jata[136] = 774317510;
        jv.jata[137] = 1074533649;
        jv.jata[138] = -178301987;
        jv.jata[139] = 679545303;
        jv.jata[140] = 339002401;
        jv.jata[141] = 192093713;
        jv.jata[142] = -831460087;
        jv.jata[143] = -1385344197;
        jv.jata[144] = 825602012;
        jv.jata[145] = -1864361309;
        jv.jata[146] = 1792307258;
        jv.jata[147] = 993942081;
        jv.jata[148] = 1505621853;
        jv.jata[149] = -286195958;
        jv.jata[150] = -143439389;
        jv.jata[151] = -734965781;
        jv.jata[152] = 2134059043;
        jv.jata[153] = 309234884;
        jv.jata[154] = 210961494;
        jv.jata[155] = -617736424;
        jv.jata[156] = -1876582627;
        jv.jata[157] = 1609498198;
        jv.jata[158] = 1595572785;
        jv.jata[159] = 1001742308;
        jv.jata[160] = 1568541241;
        jv.jata[161] = -149869745;
        jv.jata[162] = 785116184;
        jv.jata[163] = -1643473586;
        jv.jata[164] = -1056048213;
        jv.jata[165] = -1590973737;
        jv.jata[166] = -588032387;
        jv.jata[167] = -1899835511;
        jv.jata[168] = -1262318173;
        jv.jata[169] = -966765660;
        jv.jata[170] = 291036094;
        jv.jata[171] = -610753558;
        jv.jata[172] = 1938497705;
        jv.jata[173] = -2144137844;
        jv.jata[174] = 878594039;
        jv.jata[175] = 763015065;
        jv.jata[176] = 681796826;
        jv.jata[177] = -1854190453;
        jv.jata[178] = -1650289010;
        jv.jata[179] = 227381165;
        jv.jata[180] = -699635652;
        jv.jata[181] = -519145663;
        jv.jata[182] = 1777539642;
        jv.jata[183] = -746981421;
        jv.jata[184] = -1625219788;
        jv.jata[185] = -815876332;
        jv.jata[186] = -717349211;
        jv.jata[187] = -1557154565;
        jv.jata[188] = -486094532;
        jv.jata[189] = 338582578;
        jv.jata[190] = 1874497435;
        jv.jata[191] = -710017299;
        jv.jata[192] = 1429663778;
        jv.jata[193] = 618580105;
        jv.jata[194] = -1772273749;
        jv.jata[195] = 1960252485;
        jv.jata[196] = 803861986;
        jv.jata[197] = -1316539076;
        jv.jata[198] = -1832216495;
        jv.jata[199] = -1113441274;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean validWorld() {
        block69: {
            v0 /* !! */  = jv.qz;
            if (true) ** GOTO lbl5
            block45: while (true) {
                v0 /* !! */  = (long)(v1 - jv.jatb("jbvs", jats(int ), (int)82));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -270685346: {
                        v1 = jv.jatb("jbvt", jats(int ), (int)83);
                        continue block45;
                    }
                    case 275038961: {
                        v1 = jv.jatb("jbvu", jats(int ), (int)84);
                        continue block45;
                    }
                    case 1943365986: {
                        break block45;
                    }
                }
                break;
            }
            var3_1 = jv.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jbvv", jats(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == jv.jatb("jbvw", jasw(int ), (int)333)) break;
                v2 /* !! */  = (long)jv.jatb("jbvx", jasw(int ), (int)334);
            }
            var2_2 /* !! */  = jv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jbvy", jats(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == jv.jatb("jbvz", jasw(int ), (int)335)) break;
                v3 /* !! */  = (long)jv.jatb("jbwa", jasw(int ), (int)336);
            }
            var1_3 = jv.a;
            if (var3_1) {
                throw null;
lbl31:
                // 6 sources

                return (boolean)jv.jatb("jbwc", jasw(int ), (int)337);
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jbwe", jats(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jv.jatb("jbwf", jasw(int ), (int)338)) break;
                v4 /* !! */  = (long)jv.jatb("jbwg", jasw(int ), (int)339);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jbwh", jats(int ), (int)88)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == jv.jatb("jbwi", jasw(int ), (int)340)) break;
                v5 /* !! */  = (long)jv.jatb("jbwj", jasw(int ), (int)341);
            }
            if (jv.mc.field_1724 == null) break block69;
            if (var1_3) ** GOTO lbl31
            v6 /* !! */  = jv.qz;
            if (true) ** GOTO lbl52
            block51: while (true) {
                v6 /* !! */  = (long)(v7 - jv.jatb("jbwk", jats(int ), (int)89));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1950260236: {
                        v7 = jv.jatb("jbwl", jats(int ), (int)90);
                        continue block51;
                    }
                    case -1081607392: {
                        v7 = jv.jatb("jbwm", jats(int ), (int)91);
                        continue block51;
                    }
                    case 553796858: {
                        v7 = jv.jatb("jbwn", jats(int ), (int)92);
                        continue block51;
                    }
                    case 1943365986: {
                        break block51;
                    }
                }
                break;
            }
            v8 /* !! */  = jv.qz;
            if (true) ** GOTO lbl68
            block52: while (true) {
                v8 /* !! */  = (long)(v9 - jv.jatb("jbwp", jats(int ), (int)93));
lbl68:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1559688425: {
                        v9 = jv.jatb("jbwq", jats(int ), (int)94);
                        continue block52;
                    }
                    case -1267145495: {
                        v9 = jv.jatb("jbws", jats(int ), (int)95);
                        continue block52;
                    }
                    case 512890141: {
                        v9 = jv.jatb("jbwt", jats(int ), (int)96);
                        continue block52;
                    }
                    case 1943365986: {
                        break block52;
                    }
                }
                break;
            }
            if (jv.mc.field_1687 == null) break block69;
            if (var1_3) ** GOTO lbl31
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = jv.qz - jv.jatb("jbwu", jats(int ), (int)97)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == jv.jatb("jbwv", jasw(int ), (int)342)) break;
                v10 /* !! */  = (long)jv.jatb("jbwx", jasw(int ), (int)343);
            }
            v11 /* !! */  = jv.qz;
            if (true) ** GOTO lbl92
            block54: while (true) {
                v11 /* !! */  = (long)(v12 - jv.jatb("jbwy", jats(int ), (int)98));
lbl92:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -70236105: {
                        v12 = jv.jatb("jbxa", jats(int ), (int)99);
                        continue block54;
                    }
                    case 1562136890: {
                        v12 = jv.jatb("jbxb", jats(int ), (int)100);
                        continue block54;
                    }
                    case 1943365986: {
                        break block54;
                    }
                }
                break;
            }
            v13 = jv.mc.field_1687;
            v14 /* !! */  = jv.qz;
            if (true) ** GOTO lbl106
            block55: while (true) {
                v14 /* !! */  = (long)(v15 - jv.jatb("jbxc", jats(int ), (int)101));
lbl106:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -534180067: {
                        v15 = jv.jatb("jbxd", jats(int ), (int)102);
                        continue block55;
                    }
                    case -501688661: {
                        v15 = jv.jatb("jbxe", jats(int ), (int)103);
                        continue block55;
                    }
                    case -95509398: {
                        v15 = jv.jatb("jbxf", jats(int ), (int)104);
                        continue block55;
                    }
                    case 1943365986: {
                        break block55;
                    }
                }
                break;
            }
            v16 = v13.method_27983();
            v17 /* !! */  = jv.qz;
            if (true) ** GOTO lbl123
            block56: while (true) {
                v17 /* !! */  = (long)(v18 - jv.jatb("jbxg", jats(int ), (int)105));
lbl123:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -102118061: {
                        v18 = jv.jatb("jbxh", jats(int ), (int)106);
                        continue block56;
                    }
                    case 1943365986: {
                        break block56;
                    }
                    case 1952892525: {
                        v18 = jv.jatb("jbxi", jats(int ), (int)107);
                        continue block56;
                    }
                }
                break;
            }
            if (v16 != class_1937.field_25179) break block69;
            if (var1_3) ** GOTO lbl31
            v19 = jv.jatb("jbxj", jasw(int ), (int)344);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl146
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v19 = jv.jatb("jbxk", jasw(int ), (int)345);
lbl146:
                // 2 sources

                return (boolean)v19;
            }
lbl147:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jv.jatb("jbxl", jasw(int ), (int)346);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jv.jatb("jbxm", jasw(int ), (int)347);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jv.jatb("jbxn", jasw(int ), (int)348);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 3: {
                var2_2 /* !! */  = (int)jv.jatb("jbxo", jasw(int ), (int)349);
                if (!var3_1) break;
                throw null;
            }
lbl165:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)jv.jatb("jbxp", jasw(int ), (int)350);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 5: {
                var2_2 /* !! */  = (int)jv.jatb("jbxq", jasw(int ), (int)351);
                if (!var3_1) break;
                throw null;
            }
lbl174:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jv.jatb("jbxr", jasw(int ), (int)352);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jv.jatb("jbxs", jasw(int ), (int)353);
                if (!var3_1) break;
                throw null;
            }
lbl182:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)jv.jatb("jbxt", jasw(int ), (int)354);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)jv.jatb("jbxu", jasw(int ), (int)355);
        ** while (!var3_1)
lbl189:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jcit() {
        jv.jasy[300] = 1045612942;
        jv.jasy[301] = -1038299624;
        jv.jasy[302] = 694795017;
        jv.jasy[303] = -296801270;
        jv.jasy[304] = -2000464250;
        jv.jasy[305] = -173689607;
        jv.jasy[306] = -992576080;
        jv.jasy[307] = -415756596;
        jv.jasy[308] = -1385239726;
        jv.jasy[309] = -798426190;
        jv.jasy[310] = 1216359969;
        jv.jasy[311] = -2024004703;
        jv.jasy[312] = 0x5BEBBEB5;
        jv.jasy[313] = 808193747;
        jv.jasy[314] = -538522060;
        jv.jasy[315] = 455999424;
        jv.jasy[316] = -419551879;
        jv.jasy[317] = 167764240;
        jv.jasy[318] = -1973219583;
        jv.jasy[319] = 1185943795;
        jv.jasy[320] = 1335508234;
        jv.jasy[321] = 897021839;
        jv.jasy[322] = -2098492554;
        jv.jasy[323] = -1915571703;
        jv.jasy[324] = 1217063523;
        jv.jasy[325] = -1851253376;
        jv.jasy[326] = -787265344;
        jv.jasy[327] = -385485351;
        jv.jasy[328] = -680237803;
        jv.jasy[329] = 1212113118;
        jv.jasy[330] = 805624453;
        jv.jasy[331] = 1654775906;
        jv.jasy[332] = 278381028;
        jv.jasy[333] = -1644264568;
        jv.jasy[334] = 2104441675;
        jv.jasy[335] = 421571162;
        jv.jasy[336] = 925233528;
        jv.jasy[337] = -113063017;
        jv.jasy[338] = 1646954461;
        jv.jasy[339] = -1483751274;
        jv.jasy[340] = 1812734086;
        jv.jasy[341] = 554879305;
        jv.jasy[342] = 1580002434;
        jv.jasy[343] = 1313806776;
        jv.jasy[344] = 1976011905;
        jv.jasy[345] = 1318203326;
        jv.jasy[346] = 524398335;
        jv.jasy[347] = -1457689929;
        jv.jasy[348] = 1487478273;
        jv.jasy[349] = -1087915265;
        jv.jasy[350] = 0x6CF66C6C;
        jv.jasy[351] = 2089852136;
        jv.jasy[352] = 1553480265;
        jv.jasy[353] = -1929955843;
        jv.jasy[354] = -49254567;
        jv.jasy[355] = 559032144;
        jv.jasy[356] = -1540054256;
        jv.jasy[357] = 113500861;
        jv.jasy[358] = -1975026430;
        jv.jasy[359] = 179087804;
        jv.jasy[360] = -313721626;
        jv.jasy[361] = -1879542100;
        jv.jasy[362] = -1087629833;
        jv.jasy[363] = 1689632769;
        jv.jasy[364] = 160605929;
        jv.jasy[365] = 878746659;
        jv.jasy[366] = 90073031;
        jv.jasy[367] = -1013768586;
        jv.jasy[368] = -491999781;
        jv.jasy[369] = 66622314;
        jv.jasy[370] = -1711668966;
        jv.jasy[371] = -1341087062;
        jv.jasy[372] = -1138294343;
        jv.jasy[373] = -436500299;
        jv.jasy[374] = -1784968002;
        jv.jasy[375] = 1513622663;
        jv.jasy[376] = 1630262107;
        jv.jasy[377] = -2109760811;
        jv.jasy[378] = 300032620;
        jv.jasy[379] = 2113116553;
        jv.jasy[380] = 764991763;
        jv.jasy[381] = 1887978888;
        jv.jasy[382] = -1158984653;
        jv.jasy[383] = 141352866;
        jv.jasy[384] = 535107866;
        jv.jasy[385] = -829567878;
        jv.jasy[386] = -1126272521;
        jv.jasy[387] = 1272291177;
        jv.jasy[388] = 2086167328;
        jv.jasy[389] = -2015862667;
        jv.jasy[390] = -1793541354;
        jv.jasy[391] = -418909882;
        jv.jasy[392] = 588669816;
        jv.jasy[393] = -1785332107;
        jv.jasy[394] = -1229789704;
        jv.jasy[395] = -845648478;
        jv.jasy[396] = -1652457945;
        jv.jasy[397] = -2140358348;
        jv.jasy[398] = 1895148575;
        jv.jasy[399] = -519614849;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("javd", jats(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jv.jatb("javf", jasw(int ), (int)18)) break;
            v0 /* !! */  = (long)jv.jatb("javi", jasw(int ), (int)19);
        }
        var3_1 = jv.c;
        v1 /* !! */  = jv.qz;
        if (true) ** GOTO lbl11
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - jv.jatb("javk", jats(int ), (int)6));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1301276181: {
                    v2 = jv.jatb("javl", jats(int ), (int)7);
                    continue block37;
                }
                case 1141892494: {
                    v2 = jv.jatb("javn", jats(int ), (int)8);
                    continue block37;
                }
                case 1565662863: {
                    v2 = jv.jatb("javo", jats(int ), (int)9);
                    continue block37;
                }
                case 1943365986: {
                    break block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = jv.b;
        v3 /* !! */  = jv.qz;
        if (true) ** GOTO lbl28
        block38: while (true) {
            v3 /* !! */  = (long)(jv.jatb("javs", jats(int ), (int)11) - jv.jatb("javq", jats(int ), (int)10));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1586197571: {
                    continue block38;
                }
                case 1943365986: {
                    break block38;
                }
            }
            break;
        }
        var1_3 = jv.a;
        if (var3_1) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = jv.qz;
        if (true) ** GOTO lbl43
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - jv.jatb("javw", jats(int ), (int)12));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1572150666: {
                    v5 = jv.jatb("javx", jats(int ), (int)13);
                    continue block40;
                }
                case -941813856: {
                    v5 = jv.jatb("javy", jats(int ), (int)14);
                    continue block40;
                }
                case 1943365986: {
                    break block40;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jawa", jats(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jv.jatb("jawb", jasw(int ), (int)20)) break;
            v6 /* !! */  = (long)jv.jatb("jawd", jasw(int ), (int)21);
        }
        this.chests.clear();
        if (var1_3 || var1_3) ** GOTO lbl36
        v7 /* !! */  = jv.qz;
        if (true) ** GOTO lbl63
        block42: while (true) {
            v7 /* !! */  = (long)(v8 - jv.jatb("jawf", jats(int ), (int)16));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -251844756: {
                    v8 = jv.jatb("jawg", jats(int ), (int)17);
                    continue block42;
                }
                case 408138511: {
                    v8 = jv.jatb("jawi", jats(int ), (int)18);
                    continue block42;
                }
                case 1943365986: {
                    break block42;
                }
            }
            break;
        }
        v9 /* !! */  = jv.qz;
        if (true) ** GOTO lbl76
        block43: while (true) {
            v9 /* !! */  = (long)(v10 - jv.jatb("jawk", jats(int ), (int)19));
lbl76:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2141416888: {
                    v10 = jv.jatb("jawm", jats(int ), (int)20);
                    continue block43;
                }
                case -338169425: {
                    v10 = jv.jatb("jawn", jats(int ), (int)21);
                    continue block43;
                }
                case 1697821493: {
                    v10 = jv.jatb("jawp", jats(int ), (int)22);
                    continue block43;
                }
                case 1943365986: {
                    break block43;
                }
            }
            break;
        }
        this.timers.clear();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl94:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jv.jatb("jawr", jasw(int ), (int)22);
                if (!var3_1) break;
                throw null;
            }
lbl98:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)jv.jatb("jawt", jasw(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
            }
lbl102:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)jv.jatb("jawu", jasw(int ), (int)24);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jv.jatb("jawv", jasw(int ), (int)25);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)jv.jatb("jaww", jasw(int ), (int)26);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jv.jatb("jawx", jasw(int ), (int)27);
                    if (!var3_1) ** GOTO lbl94
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)jv.jatb("jawy", jasw(int ), (int)28);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jv.jatb("jaxa", jasw(int ), (int)29);
        ** while (!var3_1)
lbl126:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jcjs() {
        jv.jatu[100] = -5830427276325231381L;
        jv.jatu[101] = 5972448955574437570L;
        jv.jatu[102] = 3971948545078983176L;
        jv.jatu[103] = 4378929974032647378L;
        jv.jatu[104] = -7055464568676549699L;
        jv.jatu[105] = -2330957246266664906L;
        jv.jatu[106] = -2105904167915851996L;
        jv.jatu[107] = -6408506773079331097L;
        jv.jatu[108] = -6118630562143493982L;
        jv.jatu[109] = 4619178799340958518L;
        jv.jatu[110] = 4088526610194701005L;
        jv.jatu[111] = 4833218995507643750L;
        jv.jatu[112] = 6454542916852717374L;
        jv.jatu[113] = -3203017437583166403L;
        jv.jatu[114] = -208081611557338696L;
        jv.jatu[115] = 8466474599888287007L;
        jv.jatu[116] = -7724934014043522315L;
        jv.jatu[117] = -8705498115267546458L;
        jv.jatu[118] = 8148143359795537344L;
        jv.jatu[119] = -4617365540220747503L;
        jv.jatu[120] = 6093877951667865990L;
        jv.jatu[121] = 2789784223479380842L;
        jv.jatu[122] = -3678789567392902794L;
        jv.jatu[123] = 6884224077710233948L;
        jv.jatu[124] = 7960482051599466150L;
        jv.jatu[125] = -3581158521466041071L;
        jv.jatu[126] = -957418437403085441L;
        jv.jatu[127] = -3939324009883059764L;
        jv.jatu[128] = 4499227660975683106L;
        jv.jatu[129] = -2441457163505548118L;
        jv.jatu[130] = -867165977054157442L;
        jv.jatu[131] = 6456634465267502584L;
        jv.jatu[132] = 949225043099446648L;
        jv.jatu[133] = -8838673001201256912L;
        jv.jatu[134] = 531778178445368672L;
        jv.jatu[135] = 4274789936059348847L;
        jv.jatu[136] = -2662586472778356489L;
        jv.jatu[137] = -2457085673714172200L;
        jv.jatu[138] = -4732944007932591656L;
        jv.jatu[139] = 4755767454643048927L;
        jv.jatu[140] = 5478220943085721203L;
        jv.jatu[141] = 5660584318630771198L;
        jv.jatu[142] = 8397386395777315430L;
        jv.jatu[143] = 907060918910255333L;
        jv.jatu[144] = 6424866370401575684L;
        jv.jatu[145] = -3144570685612777881L;
        jv.jatu[146] = -7135506624999252697L;
        jv.jatu[147] = -2445107483533804099L;
        jv.jatu[148] = 3050635282033468665L;
        jv.jatu[149] = 8039983379185289914L;
        jv.jatu[150] = -5717097277375087892L;
        jv.jatu[151] = -2039478479286250501L;
        jv.jatu[152] = 2576171708087682983L;
        jv.jatu[153] = -543815533366585147L;
        jv.jatu[154] = 1151858194965469742L;
        jv.jatu[155] = -1985485516152269282L;
        jv.jatu[156] = 474414169973988578L;
        jv.jatu[157] = 429438451124572396L;
        jv.jatu[158] = 4204923085085506728L;
        jv.jatu[159] = 5197034142081522560L;
        jv.jatu[160] = 3687012939156294445L;
        jv.jatu[161] = 5820930658474851684L;
        jv.jatu[162] = -4036472416364142259L;
        jv.jatu[163] = -3153242840738329209L;
        jv.jatu[164] = 5386786866957336920L;
        jv.jatu[165] = -4721559181469309195L;
        jv.jatu[166] = -1281656032767388732L;
        jv.jatu[167] = -6646836231606882168L;
        jv.jatu[168] = -6587710678356737265L;
        jv.jatu[169] = 4487382492755096670L;
        jv.jatu[170] = 8733222646507115331L;
        jv.jatu[171] = -509108910620756354L;
        jv.jatu[172] = -640155730377442326L;
        jv.jatu[173] = -7012924312842198008L;
        jv.jatu[174] = -7440904375798611121L;
        jv.jatu[175] = 162981675585000941L;
        jv.jatu[176] = 3538062105165833811L;
        jv.jatu[177] = -3866925641683070716L;
        jv.jatu[178] = -1119379660929717615L;
        jv.jatu[179] = 6456778569880222505L;
        jv.jatu[180] = -2648591965580814350L;
        jv.jatu[181] = -1988617781326316435L;
        jv.jatu[182] = 4406704600453698037L;
        jv.jatu[183] = -6278756880324570312L;
        jv.jatu[184] = 162678498342964634L;
        jv.jatu[185] = 7979974845547679413L;
        jv.jatu[186] = 7139773047703933617L;
        jv.jatu[187] = -5921021109028571388L;
        jv.jatu[188] = 8867637983127311936L;
        jv.jatu[189] = -448474325181791542L;
        jv.jatu[190] = -3290827789725412032L;
        jv.jatu[191] = 6153356168560895294L;
        jv.jatu[192] = 3004209384983953959L;
        jv.jatu[193] = -2333287277031476313L;
        jv.jatu[194] = -6127990808275748147L;
    }

    private static /* synthetic */ void jcjw() {
        jv.jatv[0] = 2904783896909078766L;
        jv.jatv[1] = -5682747201114484740L;
        jv.jatv[2] = -3003360437628050034L;
        jv.jatv[3] = -5375368569658169743L;
        jv.jatv[4] = -888669480172207705L;
        jv.jatv[5] = 7932516430439908593L;
        jv.jatv[6] = -1466813443312370313L;
        jv.jatv[7] = 5661166488464603722L;
        jv.jatv[8] = -8226337922479599559L;
        jv.jatv[9] = 6510461545638185194L;
        jv.jatv[10] = -1335191076301450066L;
        jv.jatv[11] = 3208399010164857502L;
        jv.jatv[12] = 4366362869618214762L;
        jv.jatv[13] = 6944671962121534657L;
        jv.jatv[14] = 3731728677675161980L;
        jv.jatv[15] = 8179686426187412210L;
        jv.jatv[16] = -3677898128241054881L;
        jv.jatv[17] = 2331353639234102901L;
        jv.jatv[18] = -8695301405330410682L;
        jv.jatv[19] = -1956734116590408712L;
        jv.jatv[20] = -4376793027667791943L;
        jv.jatv[21] = -1758948108867499886L;
        jv.jatv[22] = 9189445749430754977L;
        jv.jatv[23] = -5967038956318133283L;
        jv.jatv[24] = 7075826095765997116L;
        jv.jatv[25] = 5892137196864995080L;
        jv.jatv[26] = 7507597987268129410L;
        jv.jatv[27] = -5750657817798367801L;
        jv.jatv[28] = 592522167692472986L;
        jv.jatv[29] = 7172099302151202673L;
        jv.jatv[30] = 2487662197396704310L;
        jv.jatv[31] = 3133686162476760080L;
        jv.jatv[32] = 3366378322831557439L;
        jv.jatv[33] = 474180359577602844L;
        jv.jatv[34] = -3768354072645849435L;
        jv.jatv[35] = -8232465003689074924L;
        jv.jatv[36] = 7436659191692398439L;
        jv.jatv[37] = 2880939940265747951L;
        jv.jatv[38] = 6992858676628754239L;
        jv.jatv[39] = 2738552641554800164L;
        jv.jatv[40] = 8214861599050262461L;
        jv.jatv[41] = -4104768027282151290L;
        jv.jatv[42] = -7042708823725014756L;
        jv.jatv[43] = 3473203083827849381L;
        jv.jatv[44] = 726449094288591355L;
        jv.jatv[45] = 1110316385448927467L;
        jv.jatv[46] = -7897610195968413719L;
        jv.jatv[47] = -5713929754713524692L;
        jv.jatv[48] = 3768126455243453981L;
        jv.jatv[49] = -1750316075197188018L;
        jv.jatv[50] = -6614628138622477036L;
        jv.jatv[51] = 4692476438657150089L;
        jv.jatv[52] = 7226908076762238505L;
        jv.jatv[53] = 4637649294023690041L;
        jv.jatv[54] = -5727876987012622049L;
        jv.jatv[55] = -3844116299745295356L;
        jv.jatv[56] = 8375821843593420887L;
        jv.jatv[57] = 4592171761491961058L;
        jv.jatv[58] = 1046739072566170183L;
        jv.jatv[59] = 6477175831576372481L;
        jv.jatv[60] = 9024920078131193101L;
        jv.jatv[61] = -2550123577237445251L;
        jv.jatv[62] = 4924556695666447819L;
        jv.jatv[63] = -2136647578880773407L;
        jv.jatv[64] = -1190679348451275880L;
        jv.jatv[65] = -7624031941227653249L;
        jv.jatv[66] = 2768548961183199150L;
        jv.jatv[67] = 1586505014956256125L;
        jv.jatv[68] = -8357919302487193113L;
        jv.jatv[69] = -4810599032389218002L;
        jv.jatv[70] = 2030137180465856333L;
        jv.jatv[71] = -181612871949367857L;
        jv.jatv[72] = 284020904615426458L;
        jv.jatv[73] = -4412888410426363050L;
        jv.jatv[74] = 802426551046793804L;
        jv.jatv[75] = -2736572017252038064L;
        jv.jatv[76] = -5674213915544389796L;
        jv.jatv[77] = 6054878105682392099L;
        jv.jatv[78] = -2615320850435432136L;
        jv.jatv[79] = 7967748061909515935L;
        jv.jatv[80] = -3185834491445088708L;
        jv.jatv[81] = -6497231449481082224L;
        jv.jatv[82] = -6261906125971607217L;
        jv.jatv[83] = -7300304897522519899L;
        jv.jatv[84] = 7675008812298433156L;
        jv.jatv[85] = 3300689404600377745L;
        jv.jatv[86] = 8759866307387442333L;
        jv.jatv[87] = -595432290510028706L;
        jv.jatv[88] = -6852505869414490480L;
        jv.jatv[89] = -8919505375186928695L;
        jv.jatv[90] = 3979245359382487524L;
        jv.jatv[91] = 7935036845578554327L;
        jv.jatv[92] = -7121596227891952030L;
        jv.jatv[93] = -5457871810870006550L;
        jv.jatv[94] = 4034805571223448064L;
        jv.jatv[95] = 5537965283228485426L;
        jv.jatv[96] = 4810653211199778585L;
        jv.jatv[97] = 5182350865215996614L;
        jv.jatv[98] = 5949067063288674247L;
        jv.jatv[99] = 1776711233193071007L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jv$ChestTimer timerAt(class_2338 var1_1) {
        v0 /* !! */  = jv.qz;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(jv.jatb("jbzz", jats(int ), (int)134) - jv.jatb("jbzy", jats(int ), (int)133));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1222334166: {
                    continue block45;
                }
                case 1943365986: {
                    break block45;
                }
            }
            break;
        }
        var7_2 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jcaa", jats(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jv.jatb("jcab", jasw(int ), (int)379)) break;
            v1 /* !! */  = (long)jv.jatb("jcac", jasw(int ), (int)380);
        }
        var6_3 /* !! */  = jv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jcad", jats(int ), (int)136)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jv.jatb("jcae", jasw(int ), (int)381)) break;
            v2 /* !! */  = (long)jv.jatb("jcaf", jasw(int ), (int)382);
        }
        var5_4 = jv.a;
        if (var7_2) {
            throw null;
lbl27:
            // 11 sources

            return null;
        }
        if (var5_4 || var5_4) ** GOTO lbl27
        v3 /* !! */  = jv.qz;
        if (true) ** GOTO lbl34
        block49: while (true) {
            v3 /* !! */  = (long)(v4 - jv.jatb("jcag", jats(int ), (int)137));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1163740482: {
                    v4 = jv.jatb("jcah", jats(int ), (int)138);
                    continue block49;
                }
                case -936187891: {
                    v4 = jv.jatb("jcai", jats(int ), (int)139);
                    continue block49;
                }
                case 678743816: {
                    v4 = jv.jatb("jcaj", jats(int ), (int)140);
                    continue block49;
                }
                case 1943365986: {
                    break block49;
                }
            }
            break;
        }
        var2_5 = mq.getAnarchy();
        if (var5_4) ** GOTO lbl27
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl27
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jcak", jats(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jv.jatb("jcal", jasw(int ), (int)383)) break;
                    v5 /* !! */  = (long)jv.jatb("jcam", jasw(int ), (int)384);
                }
                v6 /* !! */  = jv.qz;
                if (true) ** GOTO lbl62
                block51: while (true) {
                    v6 /* !! */  = (long)(jv.jatb("jcao", jats(int ), (int)143) - jv.jatb("jcan", jats(int ), (int)142));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -758772833: {
                            continue block51;
                        }
                        case 1943365986: {
                            break block51;
                        }
                    }
                    break;
                }
                var3_6 = this.timers.iterator();
                if (var5_4) ** GOTO lbl27
                do {
                    if (var5_4 || var5_4) ** GOTO lbl27
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jcap", jats(int ), (int)144)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == jv.jatb("jcaq", jasw(int ), (int)385)) break;
                        v7 /* !! */  = (long)jv.jatb("jcar", jasw(int ), (int)386);
                    }
                    if (!var3_6.hasNext()) ** GOTO lbl127
                    if (var5_4) ** GOTO lbl27
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = jv.qz - jv.jatb("jcas", jats(int ), (int)145)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  == jv.jatb("jcat", jasw(int ), (int)387)) break;
                        v8 /* !! */  = (long)jv.jatb("jcau", jasw(int ), (int)388);
                    }
                    var4_7 = var3_6.next();
                    if (var5_4 || var5_4) ** GOTO lbl27
                    v9 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl91
                    block55: while (true) {
                        v9 /* !! */  = (long)(jv.jatb("jcax", jats(int ), (int)147) - jv.jatb("jcav", jats(int ), (int)146));
lbl91:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case 219667274: {
                                continue block55;
                            }
                            case 1943365986: {
                                break block55;
                            }
                        }
                        break;
                    }
                    v10 = var4_7.pos;
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = jv.qz - jv.jatb("jcay", jats(int ), (int)148)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == jv.jatb("jcba", jasw(int ), (int)389)) break;
                        v11 /* !! */  = (long)jv.jatb("jcbb", jasw(int ), (int)390);
                    }
                    if (!v10.equals((Object)var1_1)) ** GOTO lbl124
                    if (var5_4) ** GOTO lbl27
                    v12 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl109
                    block57: while (true) {
                        v12 /* !! */  = (long)(v13 - jv.jatb("jcbc", jats(int ), (int)149));
lbl109:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -2104512111: {
                                v13 = jv.jatb("jcbd", jats(int ), (int)150);
                                continue block57;
                            }
                            case -1681083650: {
                                v13 = jv.jatb("jcbe", jats(int ), (int)151);
                                continue block57;
                            }
                            case -667243672: {
                                v13 = jv.jatb("jcbf", jats(int ), (int)152);
                                continue block57;
                            }
                            case 1943365986: {
                                break block57;
                            }
                        }
                        break;
                    }
                    if (var4_7.anarchy != var2_5) ** GOTO lbl124
                    if (var5_4) ** GOTO lbl27
                    return var4_7;
lbl124:
                    // 2 sources

                    if (var5_4 || var5_4) ** GOTO lbl27
                } while (!var7_2);
                throw null;
lbl127:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var6_3 /* !! */  = (int)jv.jatb("jcbg", jasw(int ), (int)391);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl135:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)jv.jatb("jcbh", jasw(int ), (int)392);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl140:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)jv.jatb("jcbi", jasw(int ), (int)393);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 3: {
                var6_3 /* !! */  = (int)jv.jatb("jcbj", jasw(int ), (int)394);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 4: {
                var6_3 /* !! */  = (int)jv.jatb("jcbk", jasw(int ), (int)395);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var6_3 /* !! */  = (int)jv.jatb("jcbl", jasw(int ), (int)396);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 6: {
                var6_3 /* !! */  = (int)jv.jatb("jcbm", jasw(int ), (int)397);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 7: {
                var6_3 /* !! */  = (int)jv.jatb("jcbn", jasw(int ), (int)398);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 8: {
                var6_3 /* !! */  = (int)jv.jatb("jcbo", jasw(int ), (int)399);
                if (!var7_2) break;
                throw null;
            }
lbl174:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)jv.jatb("jcbp", jasw(int ), (int)400);
                if (!var7_2) ** GOTO lbl135
                throw null;
            }
lbl178:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)jv.jatb("jcbq", jasw(int ), (int)401);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl183:
            // 2 sources

            case 11: {
                var6_3 /* !! */  = (int)jv.jatb("jcbr", jasw(int ), (int)402);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 12: {
                var6_3 /* !! */  = (int)jv.jatb("jcbs", jasw(int ), (int)403);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl193:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)jv.jatb("jcbt", jasw(int ), (int)404);
                if (!var7_2) ** GOTO lbl135
                throw null;
            }
lbl197:
            // 5 sources

            case 14: {
                var6_3 /* !! */  = (int)jv.jatb("jcbu", jasw(int ), (int)405);
                if (!var7_2) ** GOTO lbl140
                throw null;
            }
            case 15: {
                var6_3 /* !! */  = (int)jv.jatb("jcbv", jasw(int ), (int)406);
                if (!var7_2) ** GOTO lbl183
                throw null;
            }
lbl205:
            // 3 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)jv.jatb("jcbw", jasw(int ), (int)407);
                    if (!var7_2) ** GOTO lbl197
                    throw null;
                }
            }
lbl210:
            // 4 sources

            case 17: {
                do {
                    var6_3 /* !! */  = (int)jv.jatb("jcbx", jasw(int ), (int)408);
                } while (!var7_2);
                throw null;
            }
            case 18: 
        }
        var6_3 /* !! */  = (int)jv.jatb("jcby", jasw(int ), (int)409);
        ** while (!var7_2)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jcih() {
        jv.jasy[0] = 125144182;
        jv.jasy[1] = -2001560424;
        jv.jasy[2] = -754438454;
        jv.jasy[3] = 1392019051;
        jv.jasy[4] = -653000810;
        jv.jasy[5] = -1570905471;
        jv.jasy[6] = -655501530;
        jv.jasy[7] = 298898598;
        jv.jasy[8] = -378066873;
        jv.jasy[9] = -1411919928;
        jv.jasy[10] = -1855588515;
        jv.jasy[11] = -1206090248;
        jv.jasy[12] = -1589825226;
        jv.jasy[13] = -773410101;
        jv.jasy[14] = 1454977553;
        jv.jasy[15] = 1817744165;
        jv.jasy[16] = 2127494861;
        jv.jasy[17] = 2125310074;
        jv.jasy[18] = 721893619;
        jv.jasy[19] = 1824946567;
        jv.jasy[20] = 1658081955;
        jv.jasy[21] = -1705364808;
        jv.jasy[22] = -81021444;
        jv.jasy[23] = -7584409;
        jv.jasy[24] = -21835304;
        jv.jasy[25] = -997202937;
        jv.jasy[26] = -2114621342;
        jv.jasy[27] = -746412116;
        jv.jasy[28] = -882197687;
        jv.jasy[29] = -1647351927;
        jv.jasy[30] = 884782513;
        jv.jasy[31] = -2043887903;
        jv.jasy[32] = 1358105010;
        jv.jasy[33] = 661501386;
        jv.jasy[34] = -805259636;
        jv.jasy[35] = 346343611;
        jv.jasy[36] = -47053945;
        jv.jasy[37] = -496266845;
        jv.jasy[38] = 2013855235;
        jv.jasy[39] = 672897020;
        jv.jasy[40] = -1619114088;
        jv.jasy[41] = 2019496386;
        jv.jasy[42] = 331956155;
        jv.jasy[43] = 1885811358;
        jv.jasy[44] = -255966993;
        jv.jasy[45] = -1446273720;
        jv.jasy[46] = 794884309;
        jv.jasy[47] = 1762897645;
        jv.jasy[48] = 915991627;
        jv.jasy[49] = 1156577824;
        jv.jasy[50] = -1518773256;
        jv.jasy[51] = 470930850;
        jv.jasy[52] = -1191149540;
        jv.jasy[53] = -1468703263;
        jv.jasy[54] = 1024467078;
        jv.jasy[55] = -962338825;
        jv.jasy[56] = -180321925;
        jv.jasy[57] = -1024241073;
        jv.jasy[58] = 231630827;
        jv.jasy[59] = 2089306065;
        jv.jasy[60] = -190171272;
        jv.jasy[61] = -2124179056;
        jv.jasy[62] = 2016416421;
        jv.jasy[63] = 1297757013;
        jv.jasy[64] = 836192891;
        jv.jasy[65] = -503833415;
        jv.jasy[66] = -1673899603;
        jv.jasy[67] = -1790434892;
        jv.jasy[68] = 254161081;
        jv.jasy[69] = -1340673044;
        jv.jasy[70] = 1634055226;
        jv.jasy[71] = 81286133;
        jv.jasy[72] = 1592458900;
        jv.jasy[73] = -1462945926;
        jv.jasy[74] = 1229850189;
        jv.jasy[75] = -1242736880;
        jv.jasy[76] = -649634415;
        jv.jasy[77] = -258842977;
        jv.jasy[78] = 1617699834;
        jv.jasy[79] = -1609404706;
        jv.jasy[80] = -233406737;
        jv.jasy[81] = -2075584813;
        jv.jasy[82] = -1764600285;
        jv.jasy[83] = 1472570258;
        jv.jasy[84] = 1768520565;
        jv.jasy[85] = -323814722;
        jv.jasy[86] = -92350939;
        jv.jasy[87] = -477267424;
        jv.jasy[88] = -1209804242;
        jv.jasy[89] = -285292083;
        jv.jasy[90] = 436027687;
        jv.jasy[91] = 1107597117;
        jv.jasy[92] = 286206953;
        jv.jasy[93] = 91163001;
        jv.jasy[94] = 1212749977;
        jv.jasy[95] = 1306907100;
        jv.jasy[96] = -877137521;
        jv.jasy[97] = -2104415463;
        jv.jasy[98] = 1332780497;
        jv.jasy[99] = 348617761;
    }

    private static /* synthetic */ void jcim() {
        jv.jasy[100] = -1294646579;
        jv.jasy[101] = 777758182;
        jv.jasy[102] = -1483169781;
        jv.jasy[103] = -1965235389;
        jv.jasy[104] = -476059407;
        jv.jasy[105] = 884992785;
        jv.jasy[106] = -1133876533;
        jv.jasy[107] = 996305527;
        jv.jasy[108] = -797357004;
        jv.jasy[109] = 535867148;
        jv.jasy[110] = 1161449784;
        jv.jasy[111] = 352286202;
        jv.jasy[112] = 1165680425;
        jv.jasy[113] = 274317378;
        jv.jasy[114] = 96317895;
        jv.jasy[115] = -58947248;
        jv.jasy[116] = 1864742028;
        jv.jasy[117] = -1232987521;
        jv.jasy[118] = -2005475431;
        jv.jasy[119] = -1369015621;
        jv.jasy[120] = -1619421465;
        jv.jasy[121] = -1629376077;
        jv.jasy[122] = 954439395;
        jv.jasy[123] = -362207187;
        jv.jasy[124] = 1929656678;
        jv.jasy[125] = 1484778431;
        jv.jasy[126] = -1119664332;
        jv.jasy[127] = -840888124;
        jv.jasy[128] = 2099194329;
        jv.jasy[129] = 1561948718;
        jv.jasy[130] = -1190663403;
        jv.jasy[131] = -509435731;
        jv.jasy[132] = 561025634;
        jv.jasy[133] = 993173768;
        jv.jasy[134] = 1598626558;
        jv.jasy[135] = 1477972418;
        jv.jasy[136] = 774317509;
        jv.jasy[137] = 1074533648;
        jv.jasy[138] = -178302000;
        jv.jasy[139] = 679545309;
        jv.jasy[140] = 339002423;
        jv.jasy[141] = 192093750;
        jv.jasy[142] = -831460053;
        jv.jasy[143] = -1385344205;
        jv.jasy[144] = 825601992;
        jv.jasy[145] = -1864361284;
        jv.jasy[146] = 1792307257;
        jv.jasy[147] = 993942093;
        jv.jasy[148] = 1505621840;
        jv.jasy[149] = -286195963;
        jv.jasy[150] = -143439417;
        jv.jasy[151] = -734965770;
        jv.jasy[152] = 2134059071;
        jv.jasy[153] = 309234899;
        jv.jasy[154] = 210961498;
        jv.jasy[155] = -617736425;
        jv.jasy[156] = -1876582633;
        jv.jasy[157] = 1609498202;
        jv.jasy[158] = 1595572772;
        jv.jasy[159] = 1001742273;
        jv.jasy[160] = 1568541241;
        jv.jasy[161] = -149869750;
        jv.jasy[162] = 785116170;
        jv.jasy[163] = -1643473592;
        jv.jasy[164] = -1056048214;
        jv.jasy[165] = 1754692927;
        jv.jasy[166] = -588032388;
        jv.jasy[167] = 1018502148;
        jv.jasy[168] = -1262318174;
        jv.jasy[169] = -966765659;
        jv.jasy[170] = -1047369816;
        jv.jasy[171] = -610753557;
        jv.jasy[172] = -949983105;
        jv.jasy[173] = -2144137843;
        jv.jasy[174] = 983857791;
        jv.jasy[175] = 763015064;
        jv.jasy[176] = 340760695;
        jv.jasy[177] = -1854190454;
        jv.jasy[178] = -1143662532;
        jv.jasy[179] = 839716031;
        jv.jasy[180] = 699599960;
        jv.jasy[181] = -519145664;
        jv.jasy[182] = -1781684807;
        jv.jasy[183] = -746981422;
        jv.jasy[184] = -1150793016;
        jv.jasy[185] = -815876324;
        jv.jasy[186] = -717349207;
        jv.jasy[187] = -1557154577;
        jv.jasy[188] = -486094539;
        jv.jasy[189] = 338582591;
        jv.jasy[190] = 1874497439;
        jv.jasy[191] = -710017301;
        jv.jasy[192] = 1429663780;
        jv.jasy[193] = 618580111;
        jv.jasy[194] = -1772273729;
        jv.jasy[195] = 1960252480;
        jv.jasy[196] = 803862004;
        jv.jasy[197] = -1316539090;
        jv.jasy[198] = -1832216505;
        jv.jasy[199] = -1113441280;
    }

    public static /* synthetic */ CallSite jatb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jcji() {
        jv.jata[300] = 1045612958;
        jv.jata[301] = -1038299613;
        jv.jata[302] = 694795042;
        jv.jata[303] = -296801269;
        jv.jata[304] = -2000464245;
        jv.jata[305] = -173689621;
        jv.jata[306] = -992576065;
        jv.jata[307] = -415756576;
        jv.jata[308] = -1385239714;
        jv.jata[309] = -798426178;
        jv.jata[310] = 1216359958;
        jv.jata[311] = -2024004702;
        jv.jata[312] = 1542176385;
        jv.jata[313] = 808193787;
        jv.jata[314] = -538522073;
        jv.jata[315] = 455999467;
        jv.jata[316] = -419551904;
        jv.jata[317] = 167764267;
        jv.jata[318] = -1973219547;
        jv.jata[319] = 1185943761;
        jv.jata[320] = 1335508248;
        jv.jata[321] = 897021870;
        jv.jata[322] = -2098492602;
        jv.jata[323] = -1915571677;
        jv.jata[324] = 1217063534;
        jv.jata[325] = -1851253354;
        jv.jata[326] = -787265319;
        jv.jata[327] = -385485327;
        jv.jata[328] = -680237822;
        jv.jata[329] = 1212113106;
        jv.jata[330] = 805624476;
        jv.jata[331] = 1654775889;
        jv.jata[332] = 278380995;
        jv.jata[333] = -1644264567;
        jv.jata[334] = 796027065;
        jv.jata[335] = 421571163;
        jv.jata[336] = 1276469416;
        jv.jata[337] = -113063018;
        jv.jata[338] = 1646954460;
        jv.jata[339] = 1632706994;
        jv.jata[340] = 1812734087;
        jv.jata[341] = -495072362;
        jv.jata[342] = 1580002435;
        jv.jata[343] = 90483705;
        jv.jata[344] = 1976011904;
        jv.jata[345] = 1318203326;
        jv.jata[346] = 524398330;
        jv.jata[347] = -1457689933;
        jv.jata[348] = 1487478275;
        jv.jata[349] = -1087915268;
        jv.jata[350] = 1828088942;
        jv.jata[351] = 2089852128;
        jv.jata[352] = 1553480265;
        jv.jata[353] = -1929955842;
        jv.jata[354] = -49254563;
        jv.jata[355] = 559032152;
        jv.jata[356] = -1540054255;
        jv.jata[357] = 449334640;
        jv.jata[358] = -1975026429;
        jv.jata[359] = 1842042593;
        jv.jata[360] = 313721625;
        jv.jata[361] = -961945230;
        jv.jata[362] = -1087629833;
        jv.jata[363] = 1689632773;
        jv.jata[364] = 160605920;
        jv.jata[365] = 878746665;
        jv.jata[366] = 90073036;
        jv.jata[367] = -1013768579;
        jv.jata[368] = -491999778;
        jv.jata[369] = 66622309;
        jv.jata[370] = -1711668966;
        jv.jata[371] = -1341087071;
        jv.jata[372] = -1138294349;
        jv.jata[373] = -436500291;
        jv.jata[374] = -1784968001;
        jv.jata[375] = 1513622661;
        jv.jata[376] = 1630262101;
        jv.jata[377] = -2109760801;
        jv.jata[378] = 300032618;
        jv.jata[379] = 2113116552;
        jv.jata[380] = -9125463;
        jv.jata[381] = 1887978889;
        jv.jata[382] = 866887825;
        jv.jata[383] = 141352867;
        jv.jata[384] = 1879079941;
        jv.jata[385] = -829567877;
        jv.jata[386] = 1096540459;
        jv.jata[387] = 1272291176;
        jv.jata[388] = -361614364;
        jv.jata[389] = -2015862668;
        jv.jata[390] = 2139081251;
        jv.jata[391] = -418909882;
        jv.jata[392] = 588669820;
        jv.jata[393] = -1785332121;
        jv.jata[394] = -1229789705;
        jv.jata[395] = -845648471;
        jv.jata[396] = -1652457949;
        jv.jata[397] = -2140358363;
        jv.jata[398] = 1895148557;
        jv.jata[399] = -519614859;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        v0 /* !! */  = jv.qz;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(jv.jatb("jaxg", jats(int ), (int)24) - jv.jatb("jaxe", jats(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1376252690: {
                    continue block25;
                }
                case 1943365986: {
                    break block25;
                }
            }
            break;
        }
        var4_2 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jaxi", jats(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jv.jatb("jaxj", jasw(int ), (int)30)) break;
            v1 /* !! */  = (long)jv.jatb("jaxl", jasw(int ), (int)31);
        }
        var3_3 /* !! */  = jv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jaxm", jats(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jv.jatb("jaxn", jasw(int ), (int)32)) break;
            v2 /* !! */  = (long)jv.jatb("jaxo", jasw(int ), (int)33);
        }
        var2_4 = jv.a;
        if (var4_2) {
            throw null;
lbl25:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jaxq", jats(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == jv.jatb("jaxs", jasw(int ), (int)34)) break;
            v3 /* !! */  = (long)jv.jatb("jaxt", jasw(int ), (int)35);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jaxu", jats(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == jv.jatb("jaxv", jasw(int ), (int)36)) break;
            v4 /* !! */  = (long)jv.jatb("jaxw", jasw(int ), (int)37);
        }
        this.chests.clear();
        if (var2_4 || var2_4) ** GOTO lbl25
        v5 /* !! */  = jv.qz;
        if (true) ** GOTO lbl44
        block31: while (true) {
            v5 /* !! */  = (long)(v6 - jv.jatb("jaxy", jats(int ), (int)29));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1166856588: {
                    v6 = jv.jatb("jaya", jats(int ), (int)30);
                    continue block31;
                }
                case 1286083708: {
                    v6 = jv.jatb("jayc", jats(int ), (int)31);
                    continue block31;
                }
                case 1943365986: {
                    break block31;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = jv.qz - jv.jatb("jaye", jats(int ), (int)32)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jv.jatb("jayg", jasw(int ), (int)38)) break;
            v7 /* !! */  = (long)jv.jatb("jayi", jasw(int ), (int)39);
        }
        this.timers.clear();
        if (var2_4 || var2_4) ** GOTO lbl25
        v8 = jv.jatb("jayk", jasw(int ), (int)40);
        v9 /* !! */  = jv.qz;
        if (true) ** GOTO lbl65
        block33: while (true) {
            v9 /* !! */  = (long)(jv.jatb("jayn", jats(int ), (int)34) - jv.jatb("jaym", jats(int ), (int)33));
lbl65:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1111327276: {
                    continue block33;
                }
                case 1943365986: {
                    break block33;
                }
            }
            break;
        }
        this.lastScanAge = (int)v8;
        if (var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jv.jatb("jayp", jasw(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl83:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)jv.jatb("jays", jasw(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl88:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)jv.jatb("jayt", jasw(int ), (int)43);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)jv.jatb("jayv", jasw(int ), (int)44);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
lbl96:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jv.jatb("jayx", jasw(int ), (int)45);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
lbl100:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)jv.jatb("jayz", jasw(int ), (int)46);
                if (!var4_2) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jv.jatb("jazb", jasw(int ), (int)47);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jv.jatb("jazd", jasw(int ), (int)48);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
            }
            case 8: {
                var3_3 /* !! */  = (int)jv.jatb("jazg", jasw(int ), (int)49);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)jv.jatb("jazj", jasw(int ), (int)50);
        ** while (!var4_2)
lbl120:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$onTick$0(class_1531 var0) {
        v0 /* !! */  = jv.qz;
        block10: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 865172638: {
                    v0 /* !! */  = (long)(jv.jatb("jchp", jats(int ), (int)192) - jv.jatb("jchl", jats(int ), (int)191));
                    continue block10;
                }
                case 1943365986: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jchq", jats(int ), (int)193)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jv.jatb("jchs", jasw(int ), (int)480)) break;
            v1 /* !! */  = (long)jv.jatb("jcht", jasw(int ), (int)481);
        }
        var2_2 /* !! */  = jv.b;
        while (true) {
            block21: {
                if ((v2 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jchu", jats(int ), (int)194)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != jv.jatb("jchv", jasw(int ), (int)482)) break block21;
                var1_3 = jv.a;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)jv.jatb("jchx", jasw(int ), (int)483);
        }
        cfr_temp_0 = -2147483648;
        block13: while (true) {
            block22: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) {
                            return (boolean)jv.jatb("jchy", jasw(int ), (int)484);
                        }
                        return (boolean)jv.jatb("jchz", jasw(int ), (int)485);
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)jv.jatb("jcib", jasw(int ), (int)486);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block22;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)jv.jatb("jcif", jasw(int ), (int)489);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)jv.jatb("jcic", jasw(int ), (int)487);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl55
            }
            do {
                if (true) continue block13;
lbl55:
                // 2 sources

                var2_2 /* !! */  = (int)jv.jatb("jcid", jasw(int ), (int)488);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void jcka() {
        jv.jatv[100] = 29460339151715525L;
        jv.jatv[101] = 6742285925113739971L;
        jv.jatv[102] = -185971663436187808L;
        jv.jatv[103] = 2885724683397539609L;
        jv.jatv[104] = -389843927070108878L;
        jv.jatv[105] = -1469275296044980521L;
        jv.jatv[106] = 5596365487866282732L;
        jv.jatv[107] = 6105411384880560757L;
        jv.jatv[108] = -133388643277147065L;
        jv.jatv[109] = -906269209275078067L;
        jv.jatv[110] = 1505782978383338472L;
        jv.jatv[111] = 2635237408167555274L;
        jv.jatv[112] = 5428846207797614630L;
        jv.jatv[113] = -8071874379851997707L;
        jv.jatv[114] = -927825317749665190L;
        jv.jatv[115] = 6725614496472918676L;
        jv.jatv[116] = 2503868942404605208L;
        jv.jatv[117] = 3550315422228035281L;
        jv.jatv[118] = 3209778348937919891L;
        jv.jatv[119] = 8303314206467388481L;
        jv.jatv[120] = -941318749587038400L;
        jv.jatv[121] = 7947609114067807266L;
        jv.jatv[122] = 5420931100098379192L;
        jv.jatv[123] = 7698546416590464484L;
        jv.jatv[124] = -6802413394249105182L;
        jv.jatv[125] = -6591779390630743574L;
        jv.jatv[126] = -736568341172222127L;
        jv.jatv[127] = -7489725698570003311L;
        jv.jatv[128] = 6025328883922254570L;
        jv.jatv[129] = 6058206909255158729L;
        jv.jatv[130] = 7353780550051247460L;
        jv.jatv[131] = 8786199221274868160L;
        jv.jatv[132] = 8765433004749730289L;
        jv.jatv[133] = 5917797747080836828L;
        jv.jatv[134] = 5270362562763389074L;
        jv.jatv[135] = 255497942368004250L;
        jv.jatv[136] = 3384308715047440238L;
        jv.jatv[137] = -1040669754269953959L;
        jv.jatv[138] = -7289338715042865074L;
        jv.jatv[139] = 7339263562759522129L;
        jv.jatv[140] = -8227108694244525315L;
        jv.jatv[141] = 6577367429747063125L;
        jv.jatv[142] = 7858713775519536065L;
        jv.jatv[143] = -4648819764314678901L;
        jv.jatv[144] = -6929881975454462749L;
        jv.jatv[145] = 195240868663622093L;
        jv.jatv[146] = -2087370484985729684L;
        jv.jatv[147] = 6733765792894930259L;
        jv.jatv[148] = 6572898629456868569L;
        jv.jatv[149] = 3771254951961838831L;
        jv.jatv[150] = -3114127138061377085L;
        jv.jatv[151] = -6319646265816322788L;
        jv.jatv[152] = 4922838610991728474L;
        jv.jatv[153] = 6770838335210898774L;
        jv.jatv[154] = 1591327844299957645L;
        jv.jatv[155] = -8569780815446260056L;
        jv.jatv[156] = 2498668202508755373L;
        jv.jatv[157] = -23675055644498523L;
        jv.jatv[158] = 8833751882832601179L;
        jv.jatv[159] = -5968036714493548681L;
        jv.jatv[160] = -8714202382878337790L;
        jv.jatv[161] = 145143550098935531L;
        jv.jatv[162] = -8231284625098464062L;
        jv.jatv[163] = -8988304415462516118L;
        jv.jatv[164] = -8198857555885398334L;
        jv.jatv[165] = 2131846279116559970L;
        jv.jatv[166] = -4532752753226944351L;
        jv.jatv[167] = 5248994224534797360L;
        jv.jatv[168] = 4070111465330075529L;
        jv.jatv[169] = 2944261475299068583L;
        jv.jatv[170] = -4101656894801687966L;
        jv.jatv[171] = 8514725301203564083L;
        jv.jatv[172] = -5479729986917270636L;
        jv.jatv[173] = -4419493837262389042L;
        jv.jatv[174] = 3139657300896108438L;
        jv.jatv[175] = 3170030198734345814L;
        jv.jatv[176] = -2190821735115173737L;
        jv.jatv[177] = -3891324681359120660L;
        jv.jatv[178] = 5961177446417888357L;
        jv.jatv[179] = 539084638372835328L;
        jv.jatv[180] = -3117755915772063000L;
        jv.jatv[181] = 7885542459898277561L;
        jv.jatv[182] = -7604204026285467167L;
        jv.jatv[183] = -6737150827941262864L;
        jv.jatv[184] = -2547071297028566632L;
        jv.jatv[185] = 5842777621928153106L;
        jv.jatv[186] = -1791137954432018693L;
        jv.jatv[187] = 5182157307746195705L;
        jv.jatv[188] = 7251105631574780088L;
        jv.jatv[189] = -4507198826965615134L;
        jv.jatv[190] = -3290827789725412032L;
        jv.jatv[191] = 1772510833331892747L;
        jv.jatv[192] = 7250495387706522614L;
        jv.jatv[193] = 314201871527350116L;
        jv.jatv[194] = 6212065154665226639L;
    }

    private static /* synthetic */ void jciw() {
        jv.jasy[400] = 1362570680;
        jv.jasy[401] = -1692985809;
        jv.jasy[402] = -1496950244;
        jv.jasy[403] = -631320729;
        jv.jasy[404] = 624889166;
        jv.jasy[405] = 1288376445;
        jv.jasy[406] = 271681713;
        jv.jasy[407] = 1270459142;
        jv.jasy[408] = 2086968163;
        jv.jasy[409] = -959681274;
        jv.jasy[410] = -663326643;
        jv.jasy[411] = -1768260592;
        jv.jasy[412] = 293441856;
        jv.jasy[413] = 266917694;
        jv.jasy[414] = -862099478;
        jv.jasy[415] = 2061522781;
        jv.jasy[416] = -1271852048;
        jv.jasy[417] = 1526309531;
        jv.jasy[418] = 1566398601;
        jv.jasy[419] = -578597474;
        jv.jasy[420] = -933583028;
        jv.jasy[421] = 1575116279;
        jv.jasy[422] = -406478187;
        jv.jasy[423] = 1092983036;
        jv.jasy[424] = 2111660856;
        jv.jasy[425] = 528196882;
        jv.jasy[426] = -1541422208;
        jv.jasy[427] = 1123010256;
        jv.jasy[428] = 1789515358;
        jv.jasy[429] = -1632610979;
        jv.jasy[430] = -1746558018;
        jv.jasy[431] = 1140190351;
        jv.jasy[432] = -1483095246;
        jv.jasy[433] = 366899341;
        jv.jasy[434] = 2063912034;
        jv.jasy[435] = -632255599;
        jv.jasy[436] = -139943009;
        jv.jasy[437] = -622145404;
        jv.jasy[438] = -76867758;
        jv.jasy[439] = -13508394;
        jv.jasy[440] = -1118604201;
        jv.jasy[441] = -1701029076;
        jv.jasy[442] = 1026798871;
        jv.jasy[443] = -1521471570;
        jv.jasy[444] = 348268984;
        jv.jasy[445] = 932683532;
        jv.jasy[446] = 331638078;
        jv.jasy[447] = 430599984;
        jv.jasy[448] = 1385304251;
        jv.jasy[449] = 1971466729;
        jv.jasy[450] = -1819220192;
        jv.jasy[451] = -1102507937;
        jv.jasy[452] = -1118999652;
        jv.jasy[453] = 515321108;
        jv.jasy[454] = 1595201627;
        jv.jasy[455] = -105224519;
        jv.jasy[456] = 1335998234;
        jv.jasy[457] = -1194014138;
        jv.jasy[458] = 1455010609;
        jv.jasy[459] = -1683326266;
        jv.jasy[460] = -6303978;
        jv.jasy[461] = 1291868380;
        jv.jasy[462] = -1850224574;
        jv.jasy[463] = -1628934414;
        jv.jasy[464] = 1907647425;
        jv.jasy[465] = 292698750;
        jv.jasy[466] = -387496416;
        jv.jasy[467] = 1896196493;
        jv.jasy[468] = 367445792;
        jv.jasy[469] = 1395655927;
        jv.jasy[470] = 1147240002;
        jv.jasy[471] = -1566491084;
        jv.jasy[472] = 1842333074;
        jv.jasy[473] = -1912484500;
        jv.jasy[474] = -607770457;
        jv.jasy[475] = -1524791899;
        jv.jasy[476] = 323471677;
        jv.jasy[477] = -879338917;
        jv.jasy[478] = -8836444;
        jv.jasy[479] = 1726270814;
        jv.jasy[480] = -1255897026;
        jv.jasy[481] = -1465596795;
        jv.jasy[482] = -1578817746;
        jv.jasy[483] = -1995805788;
        jv.jasy[484] = -94073097;
        jv.jasy[485] = 238758772;
        jv.jasy[486] = 144351119;
        jv.jasy[487] = 1799522292;
        jv.jasy[488] = 34085952;
        jv.jasy[489] = -1889806461;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scanLoadedChests() {
        var12_1 = jv.c;
        var11_2 /* !! */  = jv.b;
        var10_3 = jv.a;
        if (var12_1) {
            throw null;
lbl6:
            // 37 sources

            return;
        }
        if (var10_3 || var10_3) ** GOTO lbl6
        var1_4 = new HashSet<class_2338>();
        if (var10_3) ** GOTO lbl6
        if (var11_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_3) ** GOTO lbl6
                var2_5 = Math.floorDiv((int)jv.jatb("jbrf", jasw(int ), (int)256), (int)jv.jatb("jbrh", jasw(int ), (int)257));
                if (var10_3) ** GOTO lbl6
                do {
                    if (var10_3 || var10_3) ** GOTO lbl6
                    if (var2_5 > Math.floorDiv((int)jv.jatb("jbrj", jasw(int ), (int)258), (int)jv.jatb("jbrl", jasw(int ), (int)259))) ** GOTO lbl82
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var3_6 = Math.floorDiv((int)jv.jatb("jbrm", jasw(int ), (int)260), (int)jv.jatb("jbrn", jasw(int ), (int)261));
                    if (var10_3) ** GOTO lbl6
                    do {
                        if (var10_3 || var10_3) ** GOTO lbl6
                        if (var3_6 > Math.floorDiv((int)jv.jatb("jbrp", jasw(int ), (int)262), (int)jv.jatb("jbrr", jasw(int ), (int)263))) ** GOTO lbl77
                        if (var10_3 || var10_3) ** GOTO lbl6
                        var4_7 = new class_2338(var2_5 << jv.jatb("jbrt", jasw(int ), (int)264), (int)jv.jatb("jbru", jasw(int ), (int)265), var3_6 << jv.jatb("jbrv", jasw(int ), (int)266));
                        if (var10_3 || var10_3) ** GOTO lbl6
                        if (jv.mc.field_1687.method_22340(var4_7)) ** GOTO lbl34
                        if (var10_3) ** GOTO lbl6
                        if (var12_1) {
                            throw null;
                        }
                        ** GOTO lbl72
lbl34:
                        // 1 sources

                        if (var10_3 || var10_3) ** GOTO lbl6
                        var5_8 = jv.mc.field_1687.method_8497(var2_5, var3_6);
                        if (var10_3 || var10_3) ** GOTO lbl6
                        var6_9 = var5_8.method_12214().values().iterator();
                        if (var10_3) ** GOTO lbl6
                        do {
                            if (var10_3 || var10_3) ** GOTO lbl6
                            if (!var6_9.hasNext()) ** GOTO lbl72
                            if (var10_3) ** GOTO lbl6
                            var7_10 = (class_2586)var6_9.next();
                            if (var10_3 || var10_3) ** GOTO lbl6
                            var8_11 = var7_10.method_11016();
                            if (var10_3 || var10_3) ** GOTO lbl6
                            var9_12 = var7_10.method_11017();
                            if (var10_3 || var10_3) ** GOTO lbl6
                            if (var8_11.method_10264() < jv.jatb("jbsd", jasw(int ), (int)267)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var8_11.method_10264() > jv.jatb("jbsf", jasw(int ), (int)268)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var8_11.method_10263() < jv.jatb("jbsh", jasw(int ), (int)269)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var8_11.method_10263() > jv.jatb("jbsi", jasw(int ), (int)270)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var8_11.method_10260() < jv.jatb("jbsj", jasw(int ), (int)271)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var8_11.method_10260() > jv.jatb("jbsk", jasw(int ), (int)272)) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
                            if (var9_12 == class_2591.field_11914) ** GOTO lbl65
                            if (var10_3) ** GOTO lbl6
                            if (var9_12 != class_2591.field_11891) ** GOTO lbl69
                            if (var10_3) ** GOTO lbl6
lbl65:
                            // 2 sources

                            if (var10_3 || var10_3) ** GOTO lbl6
                            var1_4.add(var8_11.method_10062());
                            if (var10_3) ** GOTO lbl6
lbl69:
                            // 8 sources

                            if (var10_3 || var10_3) ** GOTO lbl6
                        } while (!var12_1);
                        throw null;
lbl72:
                        // 2 sources

                        if (var10_3 || var10_3) ** GOTO lbl6
                        ++var3_6;
                        if (var10_3) ** GOTO lbl6
                    } while (!var12_1);
                    throw null;
lbl77:
                    // 1 sources

                    if (var10_3 || var10_3) ** GOTO lbl6
                    ++var2_5;
                    if (var10_3) ** GOTO lbl6
                } while (!var12_1);
                throw null;
lbl82:
                // 1 sources

                if (var10_3 || var10_3) ** GOTO lbl6
                this.chests.clear();
                if (var10_3 || var10_3) ** GOTO lbl6
                this.chests.addAll(var1_4);
                if (!var10_3 && !var10_3) ** break;
                ** continue;
                return;
            }
lbl90:
            // 4 sources

            case 0: {
                var11_2 /* !! */  = (int)jv.jatb("jbsm", jasw(int ), (int)273);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 1: {
                var11_2 /* !! */  = (int)jv.jatb("jbsn", jasw(int ), (int)274);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl100:
            // 2 sources

            case 2: {
                var11_2 /* !! */  = (int)jv.jatb("jbso", jasw(int ), (int)275);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl105:
            // 3 sources

            case 3: {
                var11_2 /* !! */  = (int)jv.jatb("jbsp", jasw(int ), (int)276);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl110:
            // 2 sources

            case 4: {
                var11_2 /* !! */  = (int)jv.jatb("jbsq", jasw(int ), (int)277);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl115:
            // 3 sources

            case 5: {
                var11_2 /* !! */  = (int)jv.jatb("jbsr", jasw(int ), (int)278);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl120:
            // 3 sources

            case 6: {
                var11_2 /* !! */  = (int)jv.jatb("jbst", jasw(int ), (int)279);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl125:
            // 3 sources

            case 7: {
                var11_2 /* !! */  = (int)jv.jatb("jbsu", jasw(int ), (int)280);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 8: {
                var11_2 /* !! */  = (int)jv.jatb("jbsw", jasw(int ), (int)281);
                if (!var12_1) ** GOTO lbl110
                throw null;
            }
            case 9: {
                var11_2 /* !! */  = (int)jv.jatb("jbsx", jasw(int ), (int)282);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 10: {
                var11_2 /* !! */  = (int)jv.jatb("jbsy", jasw(int ), (int)283);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 11: {
                var11_2 /* !! */  = (int)jv.jatb("jbta", jasw(int ), (int)284);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 12: {
                var11_2 /* !! */  = (int)jv.jatb("jbtb", jasw(int ), (int)285);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 13: {
                var11_2 /* !! */  = (int)jv.jatb("jbtd", jasw(int ), (int)286);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl159:
            // 2 sources

            case 14: {
                var11_2 /* !! */  = (int)jv.jatb("jbte", jasw(int ), (int)287);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl164:
            // 5 sources

            case 15: {
                var11_2 /* !! */  = (int)jv.jatb("jbtg", jasw(int ), (int)288);
                if (!var12_1) ** GOTO lbl90
                throw null;
            }
lbl168:
            // 2 sources

            case 16: {
                var11_2 /* !! */  = (int)jv.jatb("jbti", jasw(int ), (int)289);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 17: {
                var11_2 /* !! */  = (int)jv.jatb("jbtj", jasw(int ), (int)290);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 18: {
                var11_2 /* !! */  = (int)jv.jatb("jbtl", jasw(int ), (int)291);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl183:
            // 2 sources

            case 19: {
                var11_2 /* !! */  = (int)jv.jatb("jbtm", jasw(int ), (int)292);
                if (var12_1) {
                    throw null;
                }
            }
lbl187:
            // 5 sources

            case 20: {
                var11_2 /* !! */  = (int)jv.jatb("jbto", jasw(int ), (int)293);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl192:
            // 3 sources

            case 21: {
                var11_2 /* !! */  = (int)jv.jatb("jbtp", jasw(int ), (int)294);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl197:
            // 2 sources

            case 22: {
                var11_2 /* !! */  = (int)jv.jatb("jbtr", jasw(int ), (int)295);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl202:
            // 2 sources

            case 23: {
                var11_2 /* !! */  = (int)jv.jatb("jbts", jasw(int ), (int)296);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl207:
            // 2 sources

            case 24: {
                var11_2 /* !! */  = (int)jv.jatb("jbtu", jasw(int ), (int)297);
                if (!var12_1) ** GOTO lbl164
                throw null;
            }
            case 25: {
                var11_2 /* !! */  = (int)jv.jatb("jbtv", jasw(int ), (int)298);
                if (!var12_1) ** GOTO lbl192
                throw null;
            }
            case 26: {
                var11_2 /* !! */  = (int)jv.jatb("jbtx", jasw(int ), (int)299);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl220:
            // 3 sources

            case 27: {
                var11_2 /* !! */  = (int)jv.jatb("jbty", jasw(int ), (int)300);
                if (!var12_1) ** GOTO lbl125
                throw null;
            }
            case 28: {
                var11_2 /* !! */  = (int)jv.jatb("jbua", jasw(int ), (int)301);
                if (!var12_1) ** GOTO lbl164
                throw null;
            }
            case 29: {
                var11_2 /* !! */  = (int)jv.jatb("jbub", jasw(int ), (int)302);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl233:
            // 3 sources

            case 30: {
                var11_2 /* !! */  = (int)jv.jatb("jbuc", jasw(int ), (int)303);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
            case 31: {
                var11_2 /* !! */  = (int)jv.jatb("jbud", jasw(int ), (int)304);
                if (!var12_1) ** GOTO lbl90
                throw null;
            }
            case 32: {
                var11_2 /* !! */  = (int)jv.jatb("jbuf", jasw(int ), (int)305);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl247:
            // 3 sources

            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_2 /* !! */  = (int)jv.jatb("jbug", jasw(int ), (int)306);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl287
                    break;
                }
            }
lbl253:
            // 2 sources

            case 34: {
                var11_2 /* !! */  = (int)jv.jatb("jbui", jasw(int ), (int)307);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl258:
            // 2 sources

            case 35: {
                var11_2 /* !! */  = (int)jv.jatb("jbuk", jasw(int ), (int)308);
                if (!var12_1) ** GOTO lbl90
                throw null;
            }
            case 36: {
                var11_2 /* !! */  = (int)jv.jatb("jbul", jasw(int ), (int)309);
                if (!var12_1) ** GOTO lbl164
                throw null;
            }
lbl266:
            // 2 sources

            case 37: {
                var11_2 /* !! */  = (int)jv.jatb("jbun", jasw(int ), (int)310);
                if (!var12_1) ** GOTO lbl120
                throw null;
            }
lbl270:
            // 2 sources

            case 38: {
                var11_2 /* !! */  = (int)jv.jatb("jbuo", jasw(int ), (int)311);
                if (!var12_1) ** GOTO lbl187
                throw null;
            }
lbl274:
            // 2 sources

            case 39: {
                var11_2 /* !! */  = (int)jv.jatb("jbuq", jasw(int ), (int)312);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl279:
            // 2 sources

            case 40: {
                var11_2 /* !! */  = (int)jv.jatb("jbur", jasw(int ), (int)313);
                if (!var12_1) ** GOTO lbl247
                throw null;
            }
            case 41: {
                var11_2 /* !! */  = (int)jv.jatb("jbut", jasw(int ), (int)314);
                if (!var12_1) ** GOTO lbl253
                throw null;
            }
lbl287:
            // 2 sources

            case 42: {
                var11_2 /* !! */  = (int)jv.jatb("jbuv", jasw(int ), (int)315);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl292:
            // 2 sources

            case 43: {
                var11_2 /* !! */  = (int)jv.jatb("jbuw", jasw(int ), (int)316);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl297:
            // 2 sources

            case 44: {
                var11_2 /* !! */  = (int)jv.jatb("jbuy", jasw(int ), (int)317);
                if (!var12_1) ** GOTO lbl159
                throw null;
            }
            case 45: {
                var11_2 /* !! */  = (int)jv.jatb("jbuz", jasw(int ), (int)318);
                if (!var12_1) ** GOTO lbl183
                throw null;
            }
lbl305:
            // 3 sources

            case 46: {
                var11_2 /* !! */  = (int)jv.jatb("jbvb", jasw(int ), (int)319);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl310:
            // 2 sources

            case 47: {
                var11_2 /* !! */  = (int)jv.jatb("jbvc", jasw(int ), (int)320);
                if (!var12_1) ** GOTO lbl247
                throw null;
            }
lbl314:
            // 2 sources

            case 48: {
                var11_2 /* !! */  = (int)jv.jatb("jbvd", jasw(int ), (int)321);
                if (!var12_1) ** GOTO lbl125
                throw null;
            }
lbl318:
            // 2 sources

            case 49: {
                var11_2 /* !! */  = (int)jv.jatb("jbve", jasw(int ), (int)322);
                if (!var12_1) ** GOTO lbl100
                throw null;
            }
lbl322:
            // 3 sources

            case 50: {
                var11_2 /* !! */  = (int)jv.jatb("jbvf", jasw(int ), (int)323);
                if (!var12_1) ** GOTO lbl192
                throw null;
            }
lbl326:
            // 2 sources

            case 51: {
                var11_2 /* !! */  = (int)jv.jatb("jbvg", jasw(int ), (int)324);
                if (!var12_1) ** GOTO lbl305
                throw null;
            }
lbl330:
            // 4 sources

            case 52: {
                var11_2 /* !! */  = (int)jv.jatb("jbvh", jasw(int ), (int)325);
                if (!var12_1) ** GOTO lbl270
                throw null;
            }
            case 53: {
                var11_2 /* !! */  = (int)jv.jatb("jbvi", jasw(int ), (int)326);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 54: {
                var11_2 /* !! */  = (int)jv.jatb("jbvj", jasw(int ), (int)327);
                if (!var12_1) ** GOTO lbl120
                throw null;
            }
lbl343:
            // 2 sources

            case 55: {
                var11_2 /* !! */  = (int)jv.jatb("jbvk", jasw(int ), (int)328);
                if (!var12_1) ** GOTO lbl105
                throw null;
            }
            case 56: {
                var11_2 /* !! */  = (int)jv.jatb("jbvl", jasw(int ), (int)329);
                if (!var12_1) ** GOTO lbl115
                throw null;
            }
lbl351:
            // 3 sources

            case 57: {
                var11_2 /* !! */  = (int)jv.jatb("jbvm", jasw(int ), (int)330);
                if (!var12_1) ** GOTO lbl258
                throw null;
            }
lbl355:
            // 3 sources

            case 58: {
                var11_2 /* !! */  = (int)jv.jatb("jbvo", jasw(int ), (int)331);
                if (!var12_1) ** GOTO lbl187
                throw null;
            }
            case 59: 
        }
        var11_2 /* !! */  = (int)jv.jatb("jbvp", jasw(int ), (int)332);
        ** while (!var12_1)
lbl362:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jcjf() {
        jv.jata[200] = -1166705571;
        jv.jata[201] = -1538563921;
        jv.jata[202] = 843597248;
        jv.jata[203] = -952763424;
        jv.jata[204] = -85551540;
        jv.jata[205] = -625313683;
        jv.jata[206] = 1333372147;
        jv.jata[207] = 1165553329;
        jv.jata[208] = -401099407;
        jv.jata[209] = -585614004;
        jv.jata[210] = 1072014774;
        jv.jata[211] = -1416527157;
        jv.jata[212] = -532938780;
        jv.jata[213] = -100771694;
        jv.jata[214] = -1878559667;
        jv.jata[215] = -312709960;
        jv.jata[216] = -1079302886;
        jv.jata[217] = 813011587;
        jv.jata[218] = -1669871052;
        jv.jata[219] = 1192925237;
        jv.jata[220] = -1035756455;
        jv.jata[221] = -342320641;
        jv.jata[222] = 911118512;
        jv.jata[223] = -1238528440;
        jv.jata[224] = 2097042253;
        jv.jata[225] = 2133619110;
        jv.jata[226] = -1569883772;
        jv.jata[227] = 684142526;
        jv.jata[228] = -1985329655;
        jv.jata[229] = 1838403177;
        jv.jata[230] = -427148259;
        jv.jata[231] = 534160078;
        jv.jata[232] = 1786606689;
        jv.jata[233] = -1973353392;
        jv.jata[234] = -658998009;
        jv.jata[235] = 698488703;
        jv.jata[236] = -1473292168;
        jv.jata[237] = 982743927;
        jv.jata[238] = 140916899;
        jv.jata[239] = 1393421895;
        jv.jata[240] = -785665385;
        jv.jata[241] = 2143875417;
        jv.jata[242] = -441998057;
        jv.jata[243] = -186833676;
        jv.jata[244] = -938819707;
        jv.jata[245] = -258921009;
        jv.jata[246] = 1425668222;
        jv.jata[247] = -2108844802;
        jv.jata[248] = 2050536377;
        jv.jata[249] = -1803151318;
        jv.jata[250] = -495218945;
        jv.jata[251] = 897848417;
        jv.jata[252] = -1737278514;
        jv.jata[253] = -2018682812;
        jv.jata[254] = 1496453211;
        jv.jata[255] = -793851781;
        jv.jata[256] = 1866309494;
        jv.jata[257] = 1487248273;
        jv.jata[258] = 716149685;
        jv.jata[259] = -661736372;
        jv.jata[260] = -47511534;
        jv.jata[261] = -155367756;
        jv.jata[262] = 207185560;
        jv.jata[263] = -690625041;
        jv.jata[264] = 104911856;
        jv.jata[265] = -1303517482;
        jv.jata[266] = 188067915;
        jv.jata[267] = 1356884246;
        jv.jata[268] = -367166102;
        jv.jata[269] = 44478240;
        jv.jata[270] = 1072149210;
        jv.jata[271] = 1671384377;
        jv.jata[272] = -665647969;
        jv.jata[273] = -1787612579;
        jv.jata[274] = 57028068;
        jv.jata[275] = 91959774;
        jv.jata[276] = -1366179739;
        jv.jata[277] = -1751018786;
        jv.jata[278] = -1506501966;
        jv.jata[279] = 807195418;
        jv.jata[280] = -218445187;
        jv.jata[281] = 799100062;
        jv.jata[282] = 2011927948;
        jv.jata[283] = -1785505193;
        jv.jata[284] = -827294968;
        jv.jata[285] = 1656880549;
        jv.jata[286] = 214829127;
        jv.jata[287] = -578259114;
        jv.jata[288] = 1932437306;
        jv.jata[289] = 1779159216;
        jv.jata[290] = 1424878114;
        jv.jata[291] = 867075447;
        jv.jata[292] = 123443021;
        jv.jata[293] = 878800401;
        jv.jata[294] = 1295821011;
        jv.jata[295] = -1600831176;
        jv.jata[296] = 1658709943;
        jv.jata[297] = 106272468;
        jv.jata[298] = 873500379;
        jv.jata[299] = 1842729467;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$getRemaining$2(class_1531 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jcfp", jats(int ), (int)180)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jv.jatb("jcfq", jasw(int ), (int)453)) break;
            v0 /* !! */  = (long)jv.jatb("jcfr", jasw(int ), (int)454);
        }
        var3_1 = jv.c;
        v1 /* !! */  = jv.qz;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - jv.jatb("jcfs", jats(int ), (int)181));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -937180640: {
                    v2 = jv.jatb("jcfu", jats(int ), (int)182);
                    continue block6;
                }
                case 1057003590: {
                    v2 = jv.jatb("jcfv", jats(int ), (int)183);
                    continue block6;
                }
                case 1943365986: {
                    break block6;
                }
            }
            break;
        }
        var2_2 = jv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jcfw", jats(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == jv.jatb("jcfy", jasw(int ), (int)455)) break;
            v3 /* !! */  = (long)jv.jatb("jcfz", jasw(int ), (int)456);
        }
        var1_3 = jv.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (boolean)jv.jatb("jcga", jasw(int ), (int)457);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        return (boolean)jv.jatb("jcgc", jasw(int ), (int)458);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$onTick$1(jv$ChestTimer var0) {
        v0 /* !! */  = jv.qz;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(jv.jatb("jcgk", jats(int ), (int)186) - jv.jatb("jcgj", jats(int ), (int)185));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1906504757: {
                    continue block14;
                }
                case 1943365986: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jcgl", jats(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jv.jatb("jcgm", jasw(int ), (int)463)) break;
            v1 /* !! */  = (long)jv.jatb("jcgn", jasw(int ), (int)464);
        }
        var2_2 /* !! */  = jv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jcgo", jats(int ), (int)188)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jv.jatb("jcgp", jasw(int ), (int)465)) break;
            v2 /* !! */  = (long)jv.jatb("jcgq", jasw(int ), (int)466);
        }
        var1_3 = jv.a;
        if (var3_1) {
            throw null;
lbl27:
            // 4 sources

            return (boolean)jv.jatb("jcgs", jasw(int ), (int)467);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jcgt", jats(int ), (int)189)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jv.jatb("jcgu", jasw(int ), (int)468)) break;
                    v3 /* !! */  = (long)jv.jatb("jcgv", jasw(int ), (int)469);
                }
                if (var0.remaining() > jv.jatb("jcgw", jats(int ), (int)190)) ** GOTO lbl46
                if (var1_3) ** GOTO lbl27
                v4 = jv.jatb("jcgx", jasw(int ), (int)470);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl49
lbl46:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v4 = jv.jatb("jcgz", jasw(int ), (int)471);
lbl49:
                // 2 sources

                return (boolean)v4;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jv.jatb("jcha", jasw(int ), (int)472);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jv.jatb("jchb", jasw(int ), (int)473);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl69
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jv.jatb("jchc", jasw(int ), (int)474);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl64:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)jv.jatb("jchd", jasw(int ), (int)475);
                } while (!var3_1);
                throw null;
            }
lbl69:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)jv.jatb("jche", jasw(int ), (int)476);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)jv.jatb("jchg", jasw(int ), (int)477);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)jv.jatb("jchh", jasw(int ), (int)478);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)jv.jatb("jchi", jasw(int ), (int)479);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getRemaining(class_2338 var1_1) {
        var7_2 = jv.c;
        var6_3 /* !! */  = jv.b;
        var5_4 = jv.a;
        if (var7_2) {
            throw null;
lbl6:
            // 18 sources

            return (long)jv.jatb("jbmw", jats(int ), (int)70);
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (jv.mc.field_1687 == null) ** GOTO lbl42
        if (var5_4) ** GOTO lbl6
        if (jv.mc.field_1724 == null) ** GOTO lbl42
        if (var5_4 || var5_4) ** GOTO lbl6
        var2_5 = jv.mc.field_1687.method_8390(class_1531.class, jv.mc.field_1724.method_5829().method_1014((double)jv.jatb("jbmz", jazr(int ), (int)71)), (Predicate<class_1531>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getRemaining$2(net.minecraft.class_1531 ), (Lnet/minecraft/class_1531;)Z)()).iterator();
        if (var5_4) ** GOTO lbl6
        block35: while (true) {
            block64: {
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl42
                if (var5_4) ** GOTO lbl6
                var3_6 = (class_1531)var2_5.next();
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var3_6.method_31477() != var1_1.method_10263()) continue;
                if (var5_4) ** GOTO lbl6
                if (var3_6.method_31479() == var1_1.method_10260()) break block64;
                if (var5_4) ** GOTO lbl6
                if (!var7_2) continue;
                throw null;
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            var4_7 = jv.TIMER.matcher(var3_6.method_5477().getString());
            if (var5_4) ** GOTO lbl6
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl6
                    if (!var4_7.find()) ** GOTO lbl38
                    if (var5_4 || var5_4) ** GOTO lbl6
                    return (Long.parseLong(var4_7.group((int)jv.jatb("jbng", jasw(int ), (int)210))) * jv.jatb("jbnh", jats(int ), (int)72) + Long.parseLong(var4_7.group((int)jv.jatb("jbni", jasw(int ), (int)211)))) * jv.jatb("jbnj", jats(int ), (int)73);
lbl38:
                    // 1 sources

                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (var7_2) ** break;
                    continue block35;
                    throw null;
                }
lbl42:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                var2_5 = this.timerAt(var1_1);
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl51
                if (var5_4) ** GOTO lbl6
                v0 /* !! */  = jv.jatb("jbnn", jats(int ), (int)74);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl54
lbl51:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v0 /* !! */  = (CallSite)var2_5.remaining();
lbl54:
                // 2 sources

                return (long)v0 /* !! */ ;
                case 0: {
                    var6_3 /* !! */  = (int)jv.jatb("jbnp", jasw(int ), (int)212);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
                case 1: {
                    var6_3 /* !! */  = (int)jv.jatb("jbnq", jasw(int ), (int)213);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl65:
                // 2 sources

                case 2: {
                    do {
                        var6_3 /* !! */  = (int)jv.jatb("jbns", jasw(int ), (int)214);
                    } while (!var7_2);
                    throw null;
                }
lbl70:
                // 5 sources

                case 3: {
                    var6_3 /* !! */  = (int)jv.jatb("jbnu", jasw(int ), (int)215);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
                case 4: {
                    var6_3 /* !! */  = (int)jv.jatb("jbnv", jasw(int ), (int)216);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl100
                }
                case 5: {
                    var6_3 /* !! */  = (int)jv.jatb("jbnw", jasw(int ), (int)217);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
                case 6: {
                    var6_3 /* !! */  = (int)jv.jatb("jbny", jasw(int ), (int)218);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
                case 7: {
                    var6_3 /* !! */  = (int)jv.jatb("jboa", jasw(int ), (int)219);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
                case 8: {
                    var6_3 /* !! */  = (int)jv.jatb("jbob", jasw(int ), (int)220);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl100:
                // 3 sources

                case 9: {
                    var6_3 /* !! */  = (int)jv.jatb("jbod", jasw(int ), (int)221);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl123
                }
                case 10: {
                    var6_3 /* !! */  = (int)jv.jatb("jbof", jasw(int ), (int)222);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl110:
                // 3 sources

                case 11: {
                    var6_3 /* !! */  = (int)jv.jatb("jboh", jasw(int ), (int)223);
                    if (!var7_2) ** GOTO lbl70
                    throw null;
                }
lbl114:
                // 5 sources

                case 12: {
                    var6_3 /* !! */  = (int)jv.jatb("jboi", jasw(int ), (int)224);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
                case 13: {
                    var6_3 /* !! */  = (int)jv.jatb("jbok", jasw(int ), (int)225);
                    if (var7_2) {
                        throw null;
                    }
                }
lbl123:
                // 4 sources

                case 14: {
                    var6_3 /* !! */  = (int)jv.jatb("jbom", jasw(int ), (int)226);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
lbl128:
                // 2 sources

                case 15: {
                    var6_3 /* !! */  = (int)jv.jatb("jboo", jasw(int ), (int)227);
                    if (!var7_2) ** GOTO lbl65
                    throw null;
                }
lbl132:
                // 3 sources

                case 16: {
                    var6_3 /* !! */  = (int)jv.jatb("jbop", jasw(int ), (int)228);
                    if (!var7_2) ** GOTO lbl70
                    throw null;
                }
lbl136:
                // 3 sources

                case 17: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)jv.jatb("jbor", jasw(int ), (int)229);
                        if (!var7_2) ** GOTO lbl110
                        throw null;
                    }
                }
lbl141:
                // 2 sources

                case 18: {
                    var6_3 /* !! */  = (int)jv.jatb("jbot", jasw(int ), (int)230);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 19: {
                    var6_3 /* !! */  = (int)jv.jatb("jbov", jasw(int ), (int)231);
                    if (!var7_2) ** GOTO lbl110
                    throw null;
                }
                case 20: {
                    var6_3 /* !! */  = (int)jv.jatb("jbow", jasw(int ), (int)232);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
                case 21: {
                    var6_3 /* !! */  = (int)jv.jatb("jbox", jasw(int ), (int)233);
                    if (!var7_2) ** GOTO lbl70
                    throw null;
                }
lbl159:
                // 3 sources

                case 22: {
                    var6_3 /* !! */  = (int)jv.jatb("jboz", jasw(int ), (int)234);
                    if (!var7_2) ** GOTO lbl132
                    throw null;
                }
lbl163:
                // 2 sources

                case 23: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpb", jasw(int ), (int)235);
                    if (!var7_2) ** GOTO lbl100
                    throw null;
                }
lbl167:
                // 2 sources

                case 24: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpd", jasw(int ), (int)236);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
                case 25: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpe", jasw(int ), (int)237);
                    if (!var7_2) ** GOTO lbl114
                    throw null;
                }
lbl176:
                // 2 sources

                case 26: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpg", jasw(int ), (int)238);
                    if (!var7_2) ** GOTO lbl70
                    throw null;
                }
lbl180:
                // 3 sources

                case 27: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpi", jasw(int ), (int)239);
                    if (!var7_2) ** GOTO lbl132
                    throw null;
                }
                case 28: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpk", jasw(int ), (int)240);
                    if (!var7_2) ** GOTO lbl128
                    throw null;
                }
lbl188:
                // 3 sources

                case 29: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpl", jasw(int ), (int)241);
                    if (!var7_2) ** GOTO lbl141
                    throw null;
                }
                case 30: {
                    var6_3 /* !! */  = (int)jv.jatb("jbpn", jasw(int ), (int)242);
                    if (!var7_2) ** GOTO lbl114
                    throw null;
                }
                case 31: 
            }
            break;
        }
        var6_3 /* !! */  = (int)jv.jatb("jbpp", jasw(int ), (int)243);
        ** while (!var7_2)
lbl199:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block102: {
            block101: {
                block100: {
                    var11_2 = jv.c;
                    var10_3 /* !! */  = jv.b;
                    var9_4 = jv.a;
                    if (var11_2) {
                        throw null;
lbl6:
                        // 29 sources

                        return;
                    }
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (this.validWorld()) break block100;
                    if (var9_4) ** GOTO lbl6
                    return;
                }
                if (var9_4 || var9_4) ** GOTO lbl6
                if (this.lastScanAge == jv.jatb("jazp", jasw(int ), (int)51)) break block101;
                if (var9_4) ** GOTO lbl6
                if (jv.mc.field_1724.field_6012 - this.lastScanAge < jv.jatb("jazq", jasw(int ), (int)52)) break block102;
                if (var9_4) ** GOTO lbl6
            }
            if (var9_4 || var9_4) ** GOTO lbl6
            this.scanLoadedChests();
            if (var9_4 || var9_4) ** GOTO lbl6
            this.lastScanAge = jv.mc.field_1724.field_6012;
            if (var9_4) ** GOTO lbl6
        }
        if (var9_4 || var9_4) ** GOTO lbl6
        var2_5 = jv.mc.field_1687.method_8390(class_1531.class, jv.mc.field_1724.method_5829().method_1014((double)jv.jatb("jazs", jazr(int ), (int)35)), (Predicate<class_1531>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(net.minecraft.class_1531 ), (Lnet/minecraft/class_1531;)Z)()).iterator();
        if (var9_4) ** GOTO lbl6
        block53: while (true) lbl-1000:
        // 4 sources

        {
            if (var9_4) ** GOTO lbl6
            if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var9_4) ** GOTO lbl6
                    if (!var2_5.hasNext()) ** GOTO lbl70
                    if (var9_4) ** GOTO lbl6
                    var3_6 = (class_1531)var2_5.next();
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var4_7 = jv.TIMER.matcher(var3_6.method_5477().getString());
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var4_7.find()) ** GOTO lbl44
                    if (var9_4) ** GOTO lbl6
                    if (!var11_2) ** GOTO lbl-1000
                    throw null;
lbl44:
                    // 1 sources

                    if (var9_4 || var9_4) ** GOTO lbl6
                    var5_8 = this.sameColumnChest(var3_6.method_24515());
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var5_8 != null) ** GOTO lbl51
                    if (var9_4) ** GOTO lbl6
                    if (!var11_2) ** GOTO lbl-1000
                    throw null;
lbl51:
                    // 1 sources

                    if (var9_4 || var9_4) ** GOTO lbl6
                    var6_9 = (Long.parseLong(var4_7.group((int)jv.jatb("jazz", jasw(int ), (int)53))) * jv.jatb("jbab", jats(int ), (int)36) + Long.parseLong(var4_7.group((int)jv.jatb("jbac", jasw(int ), (int)54)))) * jv.jatb("jbae", jats(int ), (int)37);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var8_10 = this.timerAt(var5_8);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var8_10 != null) ** GOTO lbl64
                    if (var9_4) ** GOTO lbl6
                    this.timers.add(new jv$ChestTimer(var5_8, var6_9, mq.getAnarchy()));
                    if (var9_4) ** GOTO lbl6
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl67
lbl64:
                    // 1 sources

                    if (var9_4 || var9_4) ** GOTO lbl6
                    var8_10.update(var6_9, mq.getAnarchy());
                    if (var9_4) ** GOTO lbl6
lbl67:
                    // 2 sources

                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (!var11_2) continue block53;
                    throw null;
lbl70:
                    // 1 sources

                    if (var9_4 || var9_4) ** GOTO lbl6
                    this.timers.removeIf((Predicate<jv$ChestTimer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$1(ruhack.phobia.jv$ChestTimer ), (Lruhack/phobia/jv$ChestTimer;)Z)());
                    if (!var9_4 && !var9_4) ** break;
                    ** continue;
                    return;
                }
                case 0: {
                    var10_3 /* !! */  = (int)jv.jatb("jbag", jasw(int ), (int)55);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
lbl81:
                // 2 sources

                case 1: {
                    var10_3 /* !! */  = (int)jv.jatb("jbah", jasw(int ), (int)56);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
                case 2: {
                    var10_3 /* !! */  = (int)jv.jatb("jbai", jasw(int ), (int)57);
                    if (!var11_2) break block53;
                    throw null;
                }
                case 3: {
                    var10_3 /* !! */  = (int)jv.jatb("jbak", jasw(int ), (int)58);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var10_3 /* !! */  = (int)jv.jatb("jbam", jasw(int ), (int)59);
                        if (var11_2) {
                            throw null;
                        }
                        ** GOTO lbl275
                        break;
                    }
                }
lbl101:
                // 2 sources

                case 5: {
                    var10_3 /* !! */  = (int)jv.jatb("jbao", jasw(int ), (int)60);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 6: {
                    var10_3 /* !! */  = (int)jv.jatb("jbar", jasw(int ), (int)61);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl111:
                // 3 sources

                case 7: {
                    var10_3 /* !! */  = (int)jv.jatb("jbas", jasw(int ), (int)62);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl216
                }
                case 8: {
                    var10_3 /* !! */  = (int)jv.jatb("jbat", jasw(int ), (int)63);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
lbl121:
                // 3 sources

                case 9: {
                    var10_3 /* !! */  = (int)jv.jatb("jbau", jasw(int ), (int)64);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl126:
                // 3 sources

                case 10: {
                    var10_3 /* !! */  = (int)jv.jatb("jbav", jasw(int ), (int)65);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl131:
                // 3 sources

                case 11: {
                    var10_3 /* !! */  = (int)jv.jatb("jbaw", jasw(int ), (int)66);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
                case 12: {
                    var10_3 /* !! */  = (int)jv.jatb("jbax", jasw(int ), (int)67);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
                case 13: {
                    var10_3 /* !! */  = (int)jv.jatb("jbay", jasw(int ), (int)68);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
                case 14: {
                    var10_3 /* !! */  = (int)jv.jatb("jbaz", jasw(int ), (int)69);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl151:
                // 3 sources

                case 15: {
                    var10_3 /* !! */  = (int)jv.jatb("jbba", jasw(int ), (int)70);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl156:
                // 3 sources

                case 16: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbb", jasw(int ), (int)71);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 17: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbc", jasw(int ), (int)72);
                    if (!var11_2) ** GOTO lbl131
                    throw null;
                }
                case 18: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbd", jasw(int ), (int)73);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 19: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbe", jasw(int ), (int)74);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
                case 20: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbf", jasw(int ), (int)75);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
lbl180:
                // 2 sources

                case 21: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbg", jasw(int ), (int)76);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl185:
                // 2 sources

                case 22: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbh", jasw(int ), (int)77);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl190:
                // 2 sources

                case 23: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbj", jasw(int ), (int)78);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl195:
                // 2 sources

                case 24: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbk", jasw(int ), (int)79);
                    if (!var11_2) ** GOTO lbl156
                    throw null;
                }
lbl199:
                // 2 sources

                case 25: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbl", jasw(int ), (int)80);
                    if (!var11_2) ** GOTO lbl111
                    throw null;
                }
lbl203:
                // 2 sources

                case 26: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbm", jasw(int ), (int)81);
                    if (!var11_2) break block53;
                    throw null;
                }
lbl207:
                // 4 sources

                case 27: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbn", jasw(int ), (int)82);
                    if (!var11_2) ** GOTO lbl121
                    throw null;
                }
                case 28: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbo", jasw(int ), (int)83);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl216:
                // 2 sources

                case 29: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbp", jasw(int ), (int)84);
                    if (!var11_2) ** GOTO lbl199
                    throw null;
                }
lbl220:
                // 2 sources

                case 30: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbq", jasw(int ), (int)85);
                    if (!var11_2) ** GOTO lbl126
                    throw null;
                }
                case 31: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbr", jasw(int ), (int)86);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl229:
                // 3 sources

                case 32: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbs", jasw(int ), (int)87);
                    if (!var11_2) ** GOTO lbl190
                    throw null;
                }
lbl233:
                // 2 sources

                case 33: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbt", jasw(int ), (int)88);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
lbl238:
                // 2 sources

                case 34: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbv", jasw(int ), (int)89);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl243:
                // 2 sources

                case 35: {
                    var10_3 /* !! */  = (int)jv.jatb("jbbw", jasw(int ), (int)90);
                    if (!var11_2) ** GOTO lbl220
                    throw null;
                }
lbl247:
                // 2 sources

                case 36: {
                    var10_3 /* !! */  = (int)jv.jatb("jbby", jasw(int ), (int)91);
                    if (!var11_2) ** GOTO lbl111
                    throw null;
                }
                case 37: {
                    var10_3 /* !! */  = (int)jv.jatb("jbca", jasw(int ), (int)92);
                    if (!var11_2) ** GOTO lbl207
                    throw null;
                }
lbl255:
                // 2 sources

                case 38: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcc", jasw(int ), (int)93);
                    if (!var11_2) ** GOTO lbl131
                    throw null;
                }
                case 39: {
                    var10_3 /* !! */  = (int)jv.jatb("jbce", jasw(int ), (int)94);
                    if (!var11_2) ** GOTO lbl229
                    throw null;
                }
lbl263:
                // 4 sources

                case 40: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcg", jasw(int ), (int)95);
                    if (!var11_2) ** GOTO lbl151
                    throw null;
                }
lbl267:
                // 4 sources

                case 41: {
                    var10_3 /* !! */  = (int)jv.jatb("jbck", jasw(int ), (int)96);
                    if (!var11_2) ** GOTO lbl233
                    throw null;
                }
lbl271:
                // 3 sources

                case 42: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcn", jasw(int ), (int)97);
                    if (!var11_2) ** GOTO lbl126
                    throw null;
                }
lbl275:
                // 3 sources

                case 43: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcp", jasw(int ), (int)98);
                    if (!var11_2) ** GOTO lbl243
                    throw null;
                }
                case 44: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcr", jasw(int ), (int)99);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl284:
                // 2 sources

                case 45: {
                    var10_3 /* !! */  = (int)jv.jatb("jbct", jasw(int ), (int)100);
                    if (!var11_2) ** GOTO lbl121
                    throw null;
                }
lbl288:
                // 5 sources

                case 46: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcv", jasw(int ), (int)101);
                    if (!var11_2) ** GOTO lbl101
                    throw null;
                }
                case 47: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcx", jasw(int ), (int)102);
                    if (!var11_2) ** GOTO lbl203
                    throw null;
                }
                case 48: {
                    var10_3 /* !! */  = (int)jv.jatb("jbcz", jasw(int ), (int)103);
                    if (!var11_2) ** GOTO lbl81
                    throw null;
                }
                case 49: 
            }
            break;
        }
        var10_3 /* !! */  = (int)jv.jatb("jbdb", jasw(int ), (int)104);
        ** while (!var11_2)
lbl303:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List<class_2338> getChests() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jbpq", jats(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jv.jatb("jbpr", jasw(int ), (int)244)) break;
            v0 /* !! */  = (long)jv.jatb("jbps", jasw(int ), (int)245);
        }
        var3_1 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jbpt", jats(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jv.jatb("jbpv", jasw(int ), (int)246)) break;
            v1 /* !! */  = (long)jv.jatb("jbpx", jasw(int ), (int)247);
        }
        var2_2 /* !! */  = jv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jbpz", jats(int ), (int)77)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jv.jatb("jbqb", jasw(int ), (int)248)) {
                var1_3 = jv.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)jv.jatb("jbqd", jasw(int ), (int)249);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jbqh", jats(int ), (int)78)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  != jv.jatb("jbqj", jasw(int ), (int)250)) ** GOTO lbl32
                    v4 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl55
lbl32:
                    // 1 sources

                    v3 /* !! */  = (long)jv.jatb("jbqk", jasw(int ), (int)251);
                }
            }
            case 0: {
                ** GOTO lbl45
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jv.jatb("jbqw", jasw(int ), (int)254);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)jv.jatb("jbqy", jasw(int ), (int)255);
                if (var3_1) {
                    throw null;
                }
lbl45:
                // 3 sources

                var2_2 /* !! */  = (int)jv.jatb("jbqs", jasw(int ), (int)252);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)jv.jatb("jbqu", jasw(int ), (int)253);
        } while (!var3_1);
        throw null;
        block17: while (true) {
            v4 /* !! */  = (long)(v5 - jv.jatb("jbql", jats(int ), (int)79));
lbl55:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1176371088: {
                    v5 = jv.jatb("jbqn", jats(int ), (int)80);
                    continue block17;
                }
                case 1814007306: {
                    v5 = jv.jatb("jbqp", jats(int ), (int)81);
                    continue block17;
                }
                case 1943365986: {
                    return List.copyOf(this.chests);
                }
            }
            break;
        }
        return List.copyOf(this.chests);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        block85: {
            var13_2 = jv.c;
            var12_3 /* !! */  = jv.b;
            var11_4 = jv.a;
            if (var13_2) {
                throw null;
lbl6:
                // 22 sources

                return;
            }
            if (var11_4 || var11_4) ** GOTO lbl6
            if (this.validWorld()) break block85;
            if (var11_4) ** GOTO lbl6
            return;
        }
        if (var11_4 || var11_4) ** GOTO lbl6
        var2_5 = this.chests.iterator();
        if (var11_4) ** GOTO lbl6
        block45: while (true) {
            if (var11_4 || var11_4) ** GOTO lbl6
            if (!var2_5.hasNext()) ** GOTO lbl59
            if (var11_4) ** GOTO lbl6
            var3_6 = var2_5.next();
            if (var11_4) ** GOTO lbl6
            if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var12_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var11_4) ** GOTO lbl6
                    var4_7 = this.timerAt(var3_6);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var4_7 == null) continue block45;
                    if (var11_4) ** GOTO lbl6
                    if (op.project((double)var3_6.method_10263() + jv.jatb("jbdi", jazr(int ), (int)38), (double)var3_6.method_10264() + 1.0, (double)var3_6.method_10260() + jv.jatb("jbdk", jazr(int ), (int)39), this.projected)) ** GOTO lbl34
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (!var13_2) continue block45;
                    throw null;
lbl34:
                    // 1 sources

                    if (var11_4 || var11_4) ** GOTO lbl6
                    var5_8 = (int)(var4_7.remaining() / jv.jatb("jbdm", jats(int ), (int)40));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    v0 = new Object[2];
                    v0[jv.jatb("jbdo", jasw(int ), (int)105)] = var5_8 / jv.jatb("jbdp", jasw(int ), (int)106);
                    v0[jv.jatb("jbdr", jasw(int ), (int)107)] = var5_8 % jv.jatb("jbds", jasw(int ), (int)108);
                    var6_9 = String.format(Locale.ROOT, "%02d:%02d", v0);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var7_10 = jv.jatb("jbdw", jbdt(int ), (int)109);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var8_11 = jv.jatb("jbdx", jbdt(int ), (int)110) + kq.width(kv.BOLD, var6_9, (float)var7_10);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var9_12 = this.projected.x - var8_11 / 2.0f;
                    if (var11_4 || var11_4) ** GOTO lbl6
                    var10_13 = this.projected.y - jv.jatb("jbea", jbdt(int ), (int)111);
                    if (var11_4 || var11_4) ** GOTO lbl6
                    ki.rect(var1_1.getDrawContext(), var9_12, var10_13, (float)var8_11, (float)jv.jatb("jbec", jbdt(int ), (int)112), (float)jv.jatb("jbee", jbdt(int ), (int)113), (int)jv.jatb("jbef", jasw(int ), (int)114), (boolean)jv.jatb("jbeg", jasw(int ), (int)115));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    this.drawItem(var1_1, var9_12 + jv.jatb("jbei", jbdt(int ), (int)116), var10_13 + 2.0f, (float)jv.jatb("jbek", jbdt(int ), (int)117));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    kq.text(var1_1.getDrawContext(), kv.BOLD, var6_9, var9_12 + jv.jatb("jbem", jbdt(int ), (int)118), var10_13 + jv.jatb("jben", jbdt(int ), (int)119), (float)var7_10, (int)jv.jatb("jbep", jasw(int ), (int)120), (boolean)jv.jatb("jbeq", jasw(int ), (int)121));
                    if (var11_4 || var11_4) ** GOTO lbl6
                    if (var13_2) ** break;
                    continue block45;
                    throw null;
                }
lbl59:
                // 1 sources

                if (!var11_4 && !var11_4) ** break;
                ** continue;
                return;
lbl62:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var12_3 /* !! */  = (int)jv.jatb("jbes", jasw(int ), (int)122);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl158
                        break;
                    }
                }
lbl68:
                // 2 sources

                case 1: {
                    var12_3 /* !! */  = (int)jv.jatb("jbeu", jasw(int ), (int)123);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
                case 2: {
                    var12_3 /* !! */  = (int)jv.jatb("jbew", jasw(int ), (int)124);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
                case 3: {
                    var12_3 /* !! */  = (int)jv.jatb("jbex", jasw(int ), (int)125);
                    if (!var13_2) break block45;
                    throw null;
                }
lbl82:
                // 4 sources

                case 4: {
                    var12_3 /* !! */  = (int)jv.jatb("jbez", jasw(int ), (int)126);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
                case 5: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfb", jasw(int ), (int)127);
                    if (!var13_2) ** GOTO lbl82
                    throw null;
                }
lbl91:
                // 2 sources

                case 6: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfc", jasw(int ), (int)128);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
                case 7: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfe", jasw(int ), (int)129);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 8: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfg", jasw(int ), (int)130);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl106:
                // 2 sources

                case 9: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfh", jasw(int ), (int)131);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl116
                }
lbl111:
                // 2 sources

                case 10: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfj", jasw(int ), (int)132);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl116:
                // 2 sources

                case 11: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfl", jasw(int ), (int)133);
                    if (!var13_2) ** GOTO lbl106
                    throw null;
                }
lbl120:
                // 2 sources

                case 12: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfm", jasw(int ), (int)134);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
                case 13: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfo", jasw(int ), (int)135);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
lbl130:
                // 2 sources

                case 14: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfq", jasw(int ), (int)136);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
                case 15: {
                    do {
                        var12_3 /* !! */  = (int)jv.jatb("jbfr", jasw(int ), (int)137);
                    } while (!var13_2);
                    throw null;
                }
lbl140:
                // 3 sources

                case 16: {
                    var12_3 /* !! */  = (int)jv.jatb("jbft", jasw(int ), (int)138);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
lbl145:
                // 3 sources

                case 17: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfv", jasw(int ), (int)139);
                    if (!var13_2) ** GOTO lbl140
                    throw null;
                }
lbl149:
                // 3 sources

                case 18: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfx", jasw(int ), (int)140);
                    if (!var13_2) ** GOTO lbl68
                    throw null;
                }
                case 19: {
                    var12_3 /* !! */  = (int)jv.jatb("jbfz", jasw(int ), (int)141);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl216
                }
lbl158:
                // 4 sources

                case 20: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgb", jasw(int ), (int)142);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
                case 21: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgc", jasw(int ), (int)143);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl168:
                // 2 sources

                case 22: {
                    var12_3 /* !! */  = (int)jv.jatb("jbge", jasw(int ), (int)144);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl173:
                // 2 sources

                case 23: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgg", jasw(int ), (int)145);
                    if (!var13_2) ** GOTO lbl82
                    throw null;
                }
lbl177:
                // 3 sources

                case 24: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgh", jasw(int ), (int)146);
                    if (!var13_2) ** GOTO lbl62
                    throw null;
                }
lbl181:
                // 2 sources

                case 25: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgj", jasw(int ), (int)147);
                    if (!var13_2) ** GOTO lbl130
                    throw null;
                }
lbl185:
                // 2 sources

                case 26: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgl", jasw(int ), (int)148);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl203
                }
lbl190:
                // 2 sources

                case 27: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgn", jasw(int ), (int)149);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
                case 28: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgo", jasw(int ), (int)150);
                    if (!var13_2) ** GOTO lbl120
                    throw null;
                }
lbl199:
                // 2 sources

                case 29: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgq", jasw(int ), (int)151);
                    if (!var13_2) ** GOTO lbl168
                    throw null;
                }
lbl203:
                // 2 sources

                case 30: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgs", jasw(int ), (int)152);
                    if (!var13_2) ** GOTO lbl140
                    throw null;
                }
lbl207:
                // 2 sources

                case 31: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgt", jasw(int ), (int)153);
                    if (!var13_2) ** GOTO lbl149
                    throw null;
                }
                case 32: {
                    do {
                        var12_3 /* !! */  = (int)jv.jatb("jbgu", jasw(int ), (int)154);
                    } while (!var13_2);
                    throw null;
                }
lbl216:
                // 2 sources

                case 33: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgw", jasw(int ), (int)155);
                    if (var13_2) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
lbl221:
                // 2 sources

                case 34: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgy", jasw(int ), (int)156);
                    if (!var13_2) ** GOTO lbl111
                    throw null;
                }
lbl225:
                // 4 sources

                case 35: {
                    var12_3 /* !! */  = (int)jv.jatb("jbgz", jasw(int ), (int)157);
                    if (!var13_2) ** GOTO lbl91
                    throw null;
                }
lbl229:
                // 2 sources

                case 36: {
                    var12_3 /* !! */  = (int)jv.jatb("jbhb", jasw(int ), (int)158);
                    if (!var13_2) ** GOTO lbl82
                    throw null;
                }
                case 37: {
                    var12_3 /* !! */  = (int)jv.jatb("jbhd", jasw(int ), (int)159);
                    if (!var13_2) ** GOTO lbl145
                    throw null;
                }
lbl237:
                // 2 sources

                case 38: {
                    var12_3 /* !! */  = (int)jv.jatb("jbhf", jasw(int ), (int)160);
                    if (!var13_2) ** GOTO lbl190
                    throw null;
                }
lbl241:
                // 2 sources

                case 39: {
                    var12_3 /* !! */  = (int)jv.jatb("jbhg", jasw(int ), (int)161);
                    if (!var13_2) ** GOTO lbl221
                    throw null;
                }
                case 40: {
                    var12_3 /* !! */  = (int)jv.jatb("jbhh", jasw(int ), (int)162);
                    if (!var13_2) ** GOTO lbl229
                    throw null;
                }
                case 41: 
            }
            break;
        }
        var12_3 /* !! */  = (int)jv.jatb("jbhj", jasw(int ), (int)163);
        ** while (!var13_2)
lbl252:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jciz() {
        jv.jata[0] = -2022339466;
        jv.jata[1] = -2001560423;
        jv.jata[2] = -754438455;
        jv.jata[3] = 1392019051;
        jv.jata[4] = -653000813;
        jv.jata[5] = -1570905471;
        jv.jata[6] = -655501531;
        jv.jata[7] = 298898599;
        jv.jata[8] = -378066874;
        jv.jata[9] = 369440527;
        jv.jata[10] = -1855588516;
        jv.jata[11] = -39434832;
        jv.jata[12] = -1589825225;
        jv.jata[13] = -295274726;
        jv.jata[14] = 1454977555;
        jv.jata[15] = 1817744167;
        jv.jata[16] = 2127494861;
        jv.jata[17] = 2125310072;
        jv.jata[18] = 721893618;
        jv.jata[19] = -1605673045;
        jv.jata[20] = 1658081954;
        jv.jata[21] = 1112248856;
        jv.jata[22] = -81021442;
        jv.jata[23] = -7584411;
        jv.jata[24] = -21835303;
        jv.jata[25] = -997202940;
        jv.jata[26] = -2114621342;
        jv.jata[27] = -746412115;
        jv.jata[28] = -882197686;
        jv.jata[29] = -1647351926;
        jv.jata[30] = 884782512;
        jv.jata[31] = 1911004303;
        jv.jata[32] = 1358105011;
        jv.jata[33] = 2113907873;
        jv.jata[34] = -805259635;
        jv.jata[35] = 378807490;
        jv.jata[36] = -47053946;
        jv.jata[37] = -424687051;
        jv.jata[38] = 2013855234;
        jv.jata[39] = -362369933;
        jv.jata[40] = 528369560;
        jv.jata[41] = 2019496394;
        jv.jata[42] = 331956156;
        jv.jata[43] = 1885811357;
        jv.jata[44] = -255966995;
        jv.jata[45] = -1446273713;
        jv.jata[46] = 794884317;
        jv.jata[47] = 1762897646;
        jv.jata[48] = 915991629;
        jv.jata[49] = 1156577831;
        jv.jata[50] = -1518773264;
        jv.jata[51] = -1676552798;
        jv.jata[52] = -1191149560;
        jv.jata[53] = -1468703264;
        jv.jata[54] = 1024467076;
        jv.jata[55] = -962338861;
        jv.jata[56] = -180321968;
        jv.jata[57] = -1024241088;
        jv.jata[58] = 231630822;
        jv.jata[59] = 2089306081;
        jv.jata[60] = -190171312;
        jv.jata[61] = -2124179065;
        jv.jata[62] = 2016416442;
        jv.jata[63] = 1297757020;
        jv.jata[64] = 836192853;
        jv.jata[65] = -503833429;
        jv.jata[66] = -1673899605;
        jv.jata[67] = -1790434894;
        jv.jata[68] = 254161056;
        jv.jata[69] = -1340673086;
        jv.jata[70] = 1634055192;
        jv.jata[71] = 81286138;
        jv.jata[72] = 1592458903;
        jv.jata[73] = -1462945948;
        jv.jata[74] = 1229850201;
        jv.jata[75] = -1242736840;
        jv.jata[76] = -649634379;
        jv.jata[77] = -258842991;
        jv.jata[78] = 1617699787;
        jv.jata[79] = -1609404705;
        jv.jata[80] = -233406782;
        jv.jata[81] = -2075584815;
        jv.jata[82] = -1764600277;
        jv.jata[83] = 1472570262;
        jv.jata[84] = 1768520516;
        jv.jata[85] = -323814755;
        jv.jata[86] = -92350937;
        jv.jata[87] = -477267393;
        jv.jata[88] = -1209804236;
        jv.jata[89] = -285292035;
        jv.jata[90] = 436027698;
        jv.jata[91] = 1107597108;
        jv.jata[92] = 286206965;
        jv.jata[93] = 91162994;
        jv.jata[94] = 1212749975;
        jv.jata[95] = 1306907091;
        jv.jata[96] = -877137535;
        jv.jata[97] = -2104415467;
        jv.jata[98] = 1332780497;
        jv.jata[99] = 348617788;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItem(bu var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jccb", jats(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jv.jatb("jccd", jasw(int ), (int)410)) break;
            v0 /* !! */  = (long)jv.jatb("jcce", jasw(int ), (int)411);
        }
        var9_5 = jv.c;
        v1 /* !! */  = jv.qz;
        if (true) ** GOTO lbl11
        block50: while (true) {
            v1 /* !! */  = (long)(v2 - jv.jatb("jccf", jats(int ), (int)154));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -122122424: {
                    v2 = jv.jatb("jcch", jats(int ), (int)155);
                    continue block50;
                }
                case 332790328: {
                    v2 = jv.jatb("jcci", jats(int ), (int)156);
                    continue block50;
                }
                case 1943365986: {
                    break block50;
                }
            }
            break;
        }
        var8_6 /* !! */  = jv.b;
        if (var8_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jv.qz;
                if (true) ** GOTO lbl28
                block51: while (true) {
                    v3 /* !! */  = (long)(v4 - jv.jatb("jccj", jats(int ), (int)157));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1709811426: {
                            v4 = jv.jatb("jccl", jats(int ), (int)158);
                            continue block51;
                        }
                        case -1272126284: {
                            v4 = jv.jatb("jccm", jats(int ), (int)159);
                            continue block51;
                        }
                        case 1943365986: {
                            break block51;
                        }
                        case 2056306040: {
                            v4 = jv.jatb("jccn", jats(int ), (int)160);
                            continue block51;
                        }
                    }
                    break;
                }
                var7_7 = jv.a;
                if (var9_5) {
                    throw null;
lbl43:
                    // 8 sources

                    return;
                }
                if (var7_7 || var7_7) ** GOTO lbl43
                v5 = jv.jatb("jccp", jasw(int ), (int)412);
                v6 /* !! */  = jv.qz;
                if (true) ** GOTO lbl51
                block53: while (true) {
                    v6 /* !! */  = (long)(v7 - jv.jatb("jccq", jats(int ), (int)161));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1460418241: {
                            v7 = jv.jatb("jccr", jats(int ), (int)162);
                            continue block53;
                        }
                        case -1137626683: {
                            v7 = jv.jatb("jcct", jats(int ), (int)163);
                            continue block53;
                        }
                        case 1943365986: {
                            break block53;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jccu", jats(int ), (int)164)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jv.jatb("jccv", jasw(int ), (int)413)) break;
                    v8 /* !! */  = (long)jv.jatb("jccx", jasw(int ), (int)414);
                }
                v9 = jv.mc.method_22683();
                v10 /* !! */  = jv.qz;
                if (true) ** GOTO lbl70
                block55: while (true) {
                    v10 /* !! */  = (long)(v11 - jv.jatb("jccy", jats(int ), (int)165));
lbl70:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1245488036: {
                            v11 = jv.jatb("jccz", jats(int ), (int)166);
                            continue block55;
                        }
                        case 265890036: {
                            v11 = jv.jatb("jcda", jats(int ), (int)167);
                            continue block55;
                        }
                        case 1943365986: {
                            break block55;
                        }
                    }
                    break;
                }
                v12 = v9.method_4495();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jcdb", jats(int ), (int)168)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == jv.jatb("jcdc", jasw(int ), (int)415)) break;
                    v13 /* !! */  = (long)jv.jatb("jcdd", jasw(int ), (int)416);
                }
                var5_8 = 2.0f / (float)Math.max((int)v5, v12);
                if (var7_7 || var7_7) ** GOTO lbl43
                v14 /* !! */  = jv.qz;
                if (true) ** GOTO lbl91
                block57: while (true) {
                    v14 /* !! */  = (long)(jv.jatb("jcdf", jats(int ), (int)170) - jv.jatb("jcde", jats(int ), (int)169));
lbl91:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1993350826: {
                            continue block57;
                        }
                        case 1943365986: {
                            break block57;
                        }
                    }
                    break;
                }
                v15 = var1_1.getDrawContext();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jcdg", jats(int ), (int)171)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == jv.jatb("jcdi", jasw(int ), (int)417)) break;
                    v16 /* !! */  = (long)jv.jatb("jcdj", jasw(int ), (int)418);
                }
                var6_9 = v15.method_51448();
                if (var7_7 || var7_7) ** GOTO lbl43
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = jv.qz - jv.jatb("jcdl", jats(int ), (int)172)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == jv.jatb("jcdm", jasw(int ), (int)419)) break;
                    v17 /* !! */  = (long)jv.jatb("jcdn", jasw(int ), (int)420);
                }
                var6_9.pushMatrix();
                if (var7_7 || var7_7) ** GOTO lbl43
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = jv.qz - jv.jatb("jcdp", jats(int ), (int)173)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == jv.jatb("jcdq", jasw(int ), (int)421)) break;
                    v18 /* !! */  = (long)jv.jatb("jcdr", jasw(int ), (int)422);
                }
                var6_9.translate(var2_2 * var5_8, var3_3 * var5_8);
                if (var7_7 || var7_7) ** GOTO lbl43
                v19 = var4_4 * var5_8 / jv.jatb("jcds", jbdt(int ), (int)423);
                v20 = var4_4 * var5_8 / jv.jatb("jcdt", jbdt(int ), (int)424);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = jv.qz - jv.jatb("jcdv", jats(int ), (int)174)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == jv.jatb("jcdw", jasw(int ), (int)425)) break;
                    v21 /* !! */  = (long)jv.jatb("jcdx", jasw(int ), (int)426);
                }
                var6_9.scale(v19, v20);
                if (var7_7 || var7_7) ** GOTO lbl43
                v22 /* !! */  = jv.qz;
                if (true) ** GOTO lbl131
                block62: while (true) {
                    v22 /* !! */  = (long)(jv.jatb("jcdz", jats(int ), (int)176) - jv.jatb("jcdy", jats(int ), (int)175));
lbl131:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1341187134: {
                            continue block62;
                        }
                        case 1943365986: {
                            break block62;
                        }
                    }
                    break;
                }
                v23 = var1_1.getDrawContext();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = jv.qz - jv.jatb("jceb", jats(int ), (int)177)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == jv.jatb("jcec", jasw(int ), (int)427)) break;
                    v24 /* !! */  = (long)jv.jatb("jced", jasw(int ), (int)428);
                }
                v25 = jv.jatb("jcee", jasw(int ), (int)429);
                v26 = jv.jatb("jceg", jasw(int ), (int)430);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = jv.qz - jv.jatb("jceh", jats(int ), (int)178)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == jv.jatb("jcei", jasw(int ), (int)431)) break;
                    v27 /* !! */  = (long)jv.jatb("jcek", jasw(int ), (int)432);
                }
                v23.method_51427(jv.CHEST_ICON, (int)v25, (int)v26);
                if (var7_7 || var7_7) ** GOTO lbl43
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_9 = jv.qz - jv.jatb("jcem", jats(int ), (int)179)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == jv.jatb("jcen", jasw(int ), (int)433)) break;
                    v28 /* !! */  = (long)jv.jatb("jceo", jasw(int ), (int)434);
                }
                var6_9.popMatrix();
                if (var7_7 || var7_7) ** continue;
                return;
            }
lbl159:
            // 3 sources

            case 0: {
                var8_6 /* !! */  = (int)jv.jatb("jceq", jasw(int ), (int)435);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl164:
            // 3 sources

            case 1: {
                var8_6 /* !! */  = (int)jv.jatb("jces", jasw(int ), (int)436);
                if (var9_5) {
                    throw null;
                }
            }
lbl168:
            // 5 sources

            case 2: {
                var8_6 /* !! */  = (int)jv.jatb("jcet", jasw(int ), (int)437);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl173:
            // 2 sources

            case 3: {
                var8_6 /* !! */  = (int)jv.jatb("jceu", jasw(int ), (int)438);
                if (!var9_5) ** GOTO lbl168
                throw null;
            }
            case 4: {
                var8_6 /* !! */  = (int)jv.jatb("jcev", jasw(int ), (int)439);
                if (!var9_5) ** GOTO lbl168
                throw null;
            }
            case 5: {
                var8_6 /* !! */  = (int)jv.jatb("jcex", jasw(int ), (int)440);
                if (!var9_5) ** GOTO lbl173
                throw null;
            }
lbl185:
            // 3 sources

            case 6: {
                var8_6 /* !! */  = (int)jv.jatb("jcey", jasw(int ), (int)441);
                if (!var9_5) ** GOTO lbl159
                throw null;
            }
lbl189:
            // 2 sources

            case 7: {
                var8_6 /* !! */  = (int)jv.jatb("jcez", jasw(int ), (int)442);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 8: {
                var8_6 /* !! */  = (int)jv.jatb("jcfa", jasw(int ), (int)443);
                if (!var9_5) ** GOTO lbl159
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_6 /* !! */  = (int)jv.jatb("jcfc", jasw(int ), (int)444);
                    if (!var9_5) ** GOTO lbl185
                    throw null;
                }
            }
            case 10: {
                var8_6 /* !! */  = (int)jv.jatb("jcfd", jasw(int ), (int)445);
                if (!var9_5) ** GOTO lbl164
                throw null;
            }
lbl207:
            // 2 sources

            case 11: {
                var8_6 /* !! */  = (int)jv.jatb("jcfe", jasw(int ), (int)446);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 12: {
                var8_6 /* !! */  = (int)jv.jatb("jcff", jasw(int ), (int)447);
                if (!var9_5) ** GOTO lbl164
                throw null;
            }
lbl216:
            // 3 sources

            case 13: {
                var8_6 /* !! */  = (int)jv.jatb("jcfh", jasw(int ), (int)448);
                if (!var9_5) ** GOTO lbl207
                throw null;
            }
            case 14: {
                do {
                    var8_6 /* !! */  = (int)jv.jatb("jcfi", jasw(int ), (int)449);
                } while (!var9_5);
                throw null;
            }
lbl225:
            // 2 sources

            case 15: {
                var8_6 /* !! */  = (int)jv.jatb("jcfj", jasw(int ), (int)450);
                if (!var9_5) ** GOTO lbl189
                throw null;
            }
lbl229:
            // 2 sources

            case 16: {
                var8_6 /* !! */  = (int)jv.jatb("jcfl", jasw(int ), (int)451);
                if (!var9_5) ** GOTO lbl185
                throw null;
            }
            case 17: 
        }
        var8_6 /* !! */  = (int)jv.jatb("jcfm", jasw(int ), (int)452);
        ** while (!var9_5)
lbl236:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block98: {
            v0 /* !! */  = jv.qz;
            if (true) ** GOTO lbl5
            block56: while (true) {
                v0 /* !! */  = (long)(v1 - jv.jatb("jbho", jats(int ), (int)41));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -937457090: {
                        v1 = jv.jatb("jbhq", jats(int ), (int)42);
                        continue block56;
                    }
                    case 165753479: {
                        v1 = jv.jatb("jbhr", jats(int ), (int)43);
                        continue block56;
                    }
                    case 1786006540: {
                        v1 = jv.jatb("jbhs", jats(int ), (int)44);
                        continue block56;
                    }
                    case 1943365986: {
                        break block56;
                    }
                }
                break;
            }
            var6_2 = jv.c;
            v2 /* !! */  = jv.qz;
            if (true) ** GOTO lbl22
            block57: while (true) {
                v2 /* !! */  = (long)(jv.jatb("jbhv", jats(int ), (int)46) - jv.jatb("jbhu", jats(int ), (int)45));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 395889004: {
                        continue block57;
                    }
                    case 1943365986: {
                        break block57;
                    }
                }
                break;
            }
            var5_3 /* !! */  = jv.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jbhx", jats(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == jv.jatb("jbhy", jasw(int ), (int)164)) break;
                v3 /* !! */  = (long)jv.jatb("jbia", jasw(int ), (int)165);
            }
            var4_4 = jv.a;
            if (var6_2) {
                throw null;
lbl36:
                // 14 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jbid", jats(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == jv.jatb("jbie", jasw(int ), (int)166)) break;
                v4 /* !! */  = (long)jv.jatb("jbig", jasw(int ), (int)167);
            }
            if (this.validWorld()) break block98;
            if (var4_4) ** GOTO lbl36
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl36
        v5 = jv.jatb("jbih", jasw(int ), (int)168);
        v6 /* !! */  = jv.qz;
        if (true) ** GOTO lbl54
        block61: while (true) {
            v6 /* !! */  = (long)(v7 - jv.jatb("jbij", jats(int ), (int)49));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -703366618: {
                    v7 = jv.jatb("jbik", jats(int ), (int)50);
                    continue block61;
                }
                case -408264961: {
                    v7 = jv.jatb("jbil", jats(int ), (int)51);
                    continue block61;
                }
                case -171703397: {
                    v7 = jv.jatb("jbin", jats(int ), (int)52);
                    continue block61;
                }
                case 1943365986: {
                    break block61;
                }
            }
            break;
        }
        lv.begin((boolean)v5);
        if (var4_4 || var4_4) ** GOTO lbl36
        v8 /* !! */  = jv.qz;
        if (true) ** GOTO lbl72
        block62: while (true) {
            v8 /* !! */  = (long)(jv.jatb("jbiq", jats(int ), (int)54) - jv.jatb("jbio", jats(int ), (int)53));
lbl72:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1771200239: {
                    continue block62;
                }
                case 1943365986: {
                    break block62;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jbir", jats(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == jv.jatb("jbit", jasw(int ), (int)169)) break;
            v9 /* !! */  = (long)jv.jatb("jbiu", jasw(int ), (int)170);
        }
        var2_5 = this.chests.iterator();
        if (var4_4) ** GOTO lbl36
        block64: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = jv.qz - jv.jatb("jbiw", jats(int ), (int)56)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == jv.jatb("jbix", jasw(int ), (int)171)) break;
                v10 /* !! */  = (long)jv.jatb("jbiz", jasw(int ), (int)172);
            }
            if (!var2_5.hasNext()) ** GOTO lbl153
            if (var4_4) ** GOTO lbl36
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = jv.qz - jv.jatb("jbja", jats(int ), (int)57)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == jv.jatb("jbjc", jasw(int ), (int)173)) break;
                v11 /* !! */  = (long)jv.jatb("jbjd", jasw(int ), (int)174);
            }
            var3_6 = var2_5.next();
            if (var4_4 || var4_4) ** GOTO lbl36
            v12 /* !! */  = jv.qz;
            if (true) ** GOTO lbl104
            block67: while (true) {
                v12 /* !! */  = (long)(v13 - jv.jatb("jbje", jats(int ), (int)58));
lbl104:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1374125984: {
                        v13 = jv.jatb("jbjf", jats(int ), (int)59);
                        continue block67;
                    }
                    case -42752995: {
                        v13 = jv.jatb("jbjg", jats(int ), (int)60);
                        continue block67;
                    }
                    case 1943365986: {
                        break block67;
                    }
                }
                break;
            }
            if (this.timerAt(var3_6) != null) ** GOTO lbl150
            if (var4_4) ** GOTO lbl36
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl36
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = jv.qz - jv.jatb("jbjh", jats(int ), (int)61)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == jv.jatb("jbji", jasw(int ), (int)175)) break;
                        v14 /* !! */  = (long)jv.jatb("jbjj", jasw(int ), (int)176);
                    }
                    v15 = (double)var3_6.method_10263() + jv.jatb("jbjk", jazr(int ), (int)62);
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_6 = jv.qz - jv.jatb("jbjl", jats(int ), (int)63)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == jv.jatb("jbjm", jasw(int ), (int)177)) break;
                        v16 /* !! */  = (long)jv.jatb("jbjn", jasw(int ), (int)178);
                    }
                    v17 = (double)var3_6.method_10264() + jv.jatb("jbjo", jazr(int ), (int)64);
                    v18 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl135
                    block70: while (true) {
                        v18 /* !! */  = (long)(jv.jatb("jbjq", jats(int ), (int)66) - jv.jatb("jbjp", jats(int ), (int)65));
lbl135:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case 889742078: {
                                continue block70;
                            }
                            case 1943365986: {
                                break block70;
                            }
                        }
                        break;
                    }
                    v19 = (double)var3_6.method_10260() + jv.jatb("jbjs", jazr(int ), (int)67);
                    v20 = jv.jatb("jbjt", jbdt(int ), (int)179);
                    v21 = jv.jatb("jbju", jasw(int ), (int)180);
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_7 = jv.qz - jv.jatb("jbjv", jats(int ), (int)68)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == jv.jatb("jbjw", jasw(int ), (int)181)) break;
                        v22 /* !! */  = (long)jv.jatb("jbjx", jasw(int ), (int)182);
                    }
                    lv.box(v15, v17, v19, (float)v20, (int)v21, 1.0f);
                    if (var4_4) ** GOTO lbl36
lbl150:
                    // 2 sources

                    if (var4_4 || var4_4) ** GOTO lbl36
                    if (!var6_2) continue block64;
                    throw null;
                }
lbl153:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl36
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = jv.qz - jv.jatb("jbkb", jats(int ), (int)69)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == jv.jatb("jbkd", jasw(int ), (int)183)) break;
                    v23 /* !! */  = (long)jv.jatb("jbkf", jasw(int ), (int)184);
                }
                lv.end();
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
                case 0: {
                    var5_3 /* !! */  = (int)jv.jatb("jbki", jasw(int ), (int)185);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl245
                }
                case 1: {
                    var5_3 /* !! */  = (int)jv.jatb("jbkj", jasw(int ), (int)186);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl192
                }
lbl173:
                // 2 sources

                case 2: {
                    do {
                        var5_3 /* !! */  = (int)jv.jatb("jbkl", jasw(int ), (int)187);
                    } while (!var6_2);
                    throw null;
                }
                case 3: {
                    var5_3 /* !! */  = (int)jv.jatb("jbko", jasw(int ), (int)188);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl182:
                // 4 sources

                case 4: {
                    var5_3 /* !! */  = (int)jv.jatb("jbkq", jasw(int ), (int)189);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
lbl187:
                // 2 sources

                case 5: {
                    var5_3 /* !! */  = (int)jv.jatb("jbks", jasw(int ), (int)190);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl192:
                // 4 sources

                case 6: {
                    var5_3 /* !! */  = (int)jv.jatb("jbkv", jasw(int ), (int)191);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
lbl197:
                // 2 sources

                case 7: {
                    var5_3 /* !! */  = (int)jv.jatb("jblf", jasw(int ), (int)192);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl202:
                // 2 sources

                case 8: {
                    var5_3 /* !! */  = (int)jv.jatb("jblh", jasw(int ), (int)193);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
lbl207:
                // 2 sources

                case 9: {
                    var5_3 /* !! */  = (int)jv.jatb("jblj", jasw(int ), (int)194);
                    if (!var6_2) ** GOTO lbl192
                    throw null;
                }
lbl211:
                // 2 sources

                case 10: {
                    var5_3 /* !! */  = (int)jv.jatb("jblm", jasw(int ), (int)195);
                    if (!var6_2) ** GOTO lbl192
                    throw null;
                }
lbl215:
                // 2 sources

                case 11: {
                    do {
                        var5_3 /* !! */  = (int)jv.jatb("jblo", jasw(int ), (int)196);
                    } while (!var6_2);
                    throw null;
                }
lbl220:
                // 2 sources

                case 12: {
                    var5_3 /* !! */  = (int)jv.jatb("jblr", jasw(int ), (int)197);
                    if (!var6_2) ** GOTO lbl215
                    throw null;
                }
lbl224:
                // 3 sources

                case 13: {
                    var5_3 /* !! */  = (int)jv.jatb("jblt", jasw(int ), (int)198);
                    if (!var6_2) ** GOTO lbl220
                    throw null;
                }
                case 14: {
                    var5_3 /* !! */  = (int)jv.jatb("jblw", jasw(int ), (int)199);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
                case 15: {
                    var5_3 /* !! */  = (int)jv.jatb("jblx", jasw(int ), (int)200);
                    if (!var6_2) ** GOTO lbl187
                    throw null;
                }
                case 16: {
                    var5_3 /* !! */  = (int)jv.jatb("jblz", jasw(int ), (int)201);
                    if (!var6_2) ** GOTO lbl202
                    throw null;
                }
                case 17: {
                    var5_3 /* !! */  = (int)jv.jatb("jbmc", jasw(int ), (int)202);
                    if (!var6_2) ** GOTO lbl207
                    throw null;
                }
lbl245:
                // 3 sources

                case 18: {
                    var5_3 /* !! */  = (int)jv.jatb("jbme", jasw(int ), (int)203);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl249:
                // 4 sources

                case 19: {
                    var5_3 /* !! */  = (int)jv.jatb("jbmg", jasw(int ), (int)204);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
lbl254:
                // 2 sources

                case 20: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)jv.jatb("jbmi", jasw(int ), (int)205);
                        if (!var6_2) ** GOTO lbl173
                        throw null;
                    }
                }
lbl259:
                // 2 sources

                case 21: {
                    var5_3 /* !! */  = (int)jv.jatb("jbml", jasw(int ), (int)206);
                    if (!var6_2) ** GOTO lbl224
                    throw null;
                }
                case 22: {
                    var5_3 /* !! */  = (int)jv.jatb("jbmn", jasw(int ), (int)207);
                    if (!var6_2) ** GOTO lbl182
                    throw null;
                }
lbl267:
                // 2 sources

                case 23: {
                    var5_3 /* !! */  = (int)jv.jatb("jbmp", jasw(int ), (int)208);
                    if (!var6_2) ** GOTO lbl245
                    throw null;
                }
                case 24: 
            }
            break;
        }
        var5_3 /* !! */  = (int)jv.jatb("jbms", jasw(int ), (int)209);
        ** while (!var6_2)
lbl274:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float jbdt(int n2) {
        return Float.intBitsToFloat(jasy[n2] ^ jata[n2]);
    }

    private static /* synthetic */ void jcjo() {
        jv.jatu[0] = 4623514126368496591L;
        jv.jatu[1] = 6646838319707648370L;
        jv.jatu[2] = 6701526672860264745L;
        jv.jatu[3] = -7045993609100627590L;
        jv.jatu[4] = -6454405889414726265L;
        jv.jatu[5] = -886201011092811956L;
        jv.jatu[6] = 2258021750898506443L;
        jv.jatu[7] = -1293236582373549896L;
        jv.jatu[8] = -5706246195279622299L;
        jv.jatu[9] = 8081546657079745668L;
        jv.jatu[10] = -8962582972010400263L;
        jv.jatu[11] = -875315045454608462L;
        jv.jatu[12] = -6041020279234890088L;
        jv.jatu[13] = 8666083003016266059L;
        jv.jatu[14] = 1740909083586897486L;
        jv.jatu[15] = -1927629161270551943L;
        jv.jatu[16] = -6971696973094016900L;
        jv.jatu[17] = -8309810635512209139L;
        jv.jatu[18] = 7118770166497642860L;
        jv.jatu[19] = -7481462743660116760L;
        jv.jatu[20] = 817807474314570996L;
        jv.jatu[21] = 239801781421993135L;
        jv.jatu[22] = -415712302794578591L;
        jv.jatu[23] = -6052715826254910978L;
        jv.jatu[24] = 386468505187788282L;
        jv.jatu[25] = 537960709086426722L;
        jv.jatu[26] = 4849252756013233770L;
        jv.jatu[27] = -1068589445160218687L;
        jv.jatu[28] = -3050286112155018444L;
        jv.jatu[29] = -7247708070975116085L;
        jv.jatu[30] = 9144461242543558681L;
        jv.jatu[31] = 4565986433345240928L;
        jv.jatu[32] = -8543726438976126519L;
        jv.jatu[33] = 1336877762841681021L;
        jv.jatu[34] = -377022597858558899L;
        jv.jatu[35] = -3625282584889057516L;
        jv.jatu[36] = 7436659191692398427L;
        jv.jatu[37] = 2880939940265747975L;
        jv.jatu[38] = 6839736289298157375L;
        jv.jatu[39] = 1864854313844923940L;
        jv.jatu[40] = 8214861599050261589L;
        jv.jatu[41] = -2239747463672419401L;
        jv.jatu[42] = -8981114681458280281L;
        jv.jatu[43] = -3021919113830594008L;
        jv.jatu[44] = -7394523636930019324L;
        jv.jatu[45] = -2950587556569157257L;
        jv.jatu[46] = 5370871444019918604L;
        jv.jatu[47] = 4032442639415501453L;
        jv.jatu[48] = 8065297228754681147L;
        jv.jatu[49] = 6960697083793546439L;
        jv.jatu[50] = 5915744166283098885L;
        jv.jatu[51] = 7520493930305101905L;
        jv.jatu[52] = -1771485293735227050L;
        jv.jatu[53] = -7191311363826210924L;
        jv.jatu[54] = -1923802666032064959L;
        jv.jatu[55] = 1123349306146192893L;
        jv.jatu[56] = -2677868223021483811L;
        jv.jatu[57] = 4262022698145160438L;
        jv.jatu[58] = -7234611596904835911L;
        jv.jatu[59] = -283862725475504305L;
        jv.jatu[60] = -2223579192623242348L;
        jv.jatu[61] = -2970898644508362551L;
        jv.jatu[62] = 8914745965516707275L;
        jv.jatu[63] = 3739674025303435491L;
        jv.jatu[64] = -3415457564372300904L;
        jv.jatu[65] = -1788469307842376998L;
        jv.jatu[66] = -1010067843947055286L;
        jv.jatu[67] = 3018649696460073853L;
        jv.jatu[68] = -8084671131325807788L;
        jv.jatu[69] = 8304743523775636745L;
        jv.jatu[70] = 6291072450272460576L;
        jv.jatu[71] = -4824824087768349233L;
        jv.jatu[72] = 284020904615426470L;
        jv.jatu[73] = -4412888410426363714L;
        jv.jatu[74] = -802426551046793805L;
        jv.jatu[75] = -3083843937042758807L;
        jv.jatu[76] = 67608993732885044L;
        jv.jatu[77] = 6250089062682777032L;
        jv.jatu[78] = 3267623674426162638L;
        jv.jatu[79] = 6588505128677537646L;
        jv.jatu[80] = 1178559095321711718L;
        jv.jatu[81] = -2529295903758322940L;
        jv.jatu[82] = -6011370073695240378L;
        jv.jatu[83] = 586262943286801443L;
        jv.jatu[84] = 6403100066527891742L;
        jv.jatu[85] = 6969850593698020200L;
        jv.jatu[86] = -4378132039799570364L;
        jv.jatu[87] = -7279076896441245599L;
        jv.jatu[88] = 8331119417292337725L;
        jv.jatu[89] = -8295621272597197720L;
        jv.jatu[90] = -7157118574861547792L;
        jv.jatu[91] = 1571222540425238397L;
        jv.jatu[92] = -3156490338925295514L;
        jv.jatu[93] = 8737540043719402250L;
        jv.jatu[94] = 8318300495655880987L;
        jv.jatu[95] = 9152075743606141091L;
        jv.jatu[96] = 4599569125047904309L;
        jv.jatu[97] = -3378412516167312708L;
        jv.jatu[98] = 3083603863547163650L;
        jv.jatu[99] = -2731236688506867180L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static jv getInstance() {
        v0 /* !! */  = jv.qz;
        block10: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1731538087: {
                    v0 /* !! */  = (long)(jv.jatb("jatz", jats(int ), (int)1) - jv.jatb("jatx", jats(int ), (int)0));
                    continue block10;
                }
                case 1943365986: {
                    break block10;
                }
            }
            break;
        }
        var2 = jv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jaub", jats(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jv.jatb("jaud", jasw(int ), (int)8)) break;
            v1 /* !! */  = (long)jv.jatb("jaue", jasw(int ), (int)9);
        }
        var1_1 /* !! */  = jv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jaug", jats(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jv.jatb("jaui", jasw(int ), (int)10)) {
                var0_2 = jv.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)jv.jatb("jauk", jasw(int ), (int)11);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 != false) return null;
                if (var0_2 != false) return null;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jaun", jats(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == jv.jatb("jaup", jasw(int ), (int)12)) {
                        return nj.get(jv.class);
                    }
                    v3 /* !! */  = (long)jv.jatb("jauq", jasw(int ), (int)13);
                }
            }
            case 0: {
                var1_1 /* !! */  = (int)jv.jatb("jaus", jasw(int ), (int)14);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 1: {
                ** GOTO lbl47
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var1_1 /* !! */  = (int)jv.jatb("jauy", jasw(int ), (int)17);
                if (var2) {
                    throw null;
                }
lbl47:
                // 3 sources

                var1_1 /* !! */  = (int)jv.jatb("jauu", jasw(int ), (int)15);
                if (var2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var1_1 /* !! */  = (int)jv.jatb("jauw", jasw(int ), (int)16);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jv() {
        var2_1 /* !! */  = jv.b;
        super("WardenESP", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0441\u0443\u043d\u0434\u0443\u043a\u0438 \u0432 \u0433\u043e\u0440\u043e\u0434\u0435 \u0432\u0430\u0440\u0434\u0435\u043d\u043e\u0432 \u0441 \u0442\u0430\u0439\u043c\u0435\u0440\u043e\u043c \u0432\u043e\u0437\u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f", du.RENDER);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.timers = new ArrayList<jv$ChestTimer>();
                this.chests = new ArrayList<class_2338>();
                this.projected = new Vector2f();
                this.lastScanAge = (int)jv.jatb("jate", jasw(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)jv.jatb("jatg", jasw(int ), (int)1);
                ** GOTO lbl21
            }
lbl14:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jv.jatb("jati", jasw(int ), (int)2);
                    ** GOTO lbl24
                    break;
                }
            }
lbl18:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)jv.jatb("jatk", jasw(int ), (int)3);
                break;
            }
lbl21:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)jv.jatb("jatl", jasw(int ), (int)4);
                break;
            }
lbl24:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)jv.jatb("jatn", jasw(int ), (int)5);
                ** GOTO lbl14
            }
            case 5: {
                var2_1 /* !! */  = (int)jv.jatb("jato", jasw(int ), (int)6);
                ** GOTO lbl18
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)jv.jatb("jatp", jasw(int ), (int)7);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 sameColumnChest(class_2338 var1_1) {
        block81: {
            v0 /* !! */  = jv.qz;
            if (true) ** GOTO lbl5
            block57: while (true) {
                v0 /* !! */  = (long)(v1 - jv.jatb("jbxx", jats(int ), (int)108));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2045373759: {
                        v1 = jv.jatb("jbxy", jats(int ), (int)109);
                        continue block57;
                    }
                    case -1477085913: {
                        v1 = jv.jatb("jbxz", jats(int ), (int)110);
                        continue block57;
                    }
                    case 1943365986: {
                        break block57;
                    }
                }
                break;
            }
            var6_2 = jv.c;
            v2 /* !! */  = jv.qz;
            if (true) ** GOTO lbl19
            block58: while (true) {
                v2 /* !! */  = (long)(jv.jatb("jbyb", jats(int ), (int)112) - jv.jatb("jbya", jats(int ), (int)111));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -335872018: {
                        continue block58;
                    }
                    case 1943365986: {
                        break block58;
                    }
                }
                break;
            }
            var5_3 /* !! */  = jv.b;
            v3 /* !! */  = jv.qz;
            if (true) ** GOTO lbl29
            block59: while (true) {
                v3 /* !! */  = (long)(v4 - jv.jatb("jbyc", jats(int ), (int)113));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 27388954: {
                        v4 = jv.jatb("jbyd", jats(int ), (int)114);
                        continue block59;
                    }
                    case 214786458: {
                        v4 = jv.jatb("jbye", jats(int ), (int)115);
                        continue block59;
                    }
                    case 1943365986: {
                        break block59;
                    }
                }
                break;
            }
            var4_4 = jv.a;
            if (var6_2) {
                throw null;
lbl41:
                // 10 sources

                return null;
            }
            if (var4_4 || var4_4) ** GOTO lbl41
            v5 /* !! */  = jv.qz;
            if (true) ** GOTO lbl48
            block61: while (true) {
                v5 /* !! */  = (long)(jv.jatb("jbyg", jats(int ), (int)117) - jv.jatb("jbyf", jats(int ), (int)116));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 866884360: {
                        continue block61;
                    }
                    case 1943365986: {
                        break block61;
                    }
                }
                break;
            }
            v6 /* !! */  = jv.qz;
            if (true) ** GOTO lbl57
            block62: while (true) {
                v6 /* !! */  = (long)(v7 - jv.jatb("jbyh", jats(int ), (int)118));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1733735991: {
                        v7 = jv.jatb("jbyi", jats(int ), (int)119);
                        continue block62;
                    }
                    case 327932398: {
                        v7 = jv.jatb("jbyk", jats(int ), (int)120);
                        continue block62;
                    }
                    case 1943365986: {
                        break block62;
                    }
                }
                break;
            }
            var2_5 = this.chests.iterator();
            if (var4_4) ** GOTO lbl41
            do {
                block82: {
                    if (var4_4 || var4_4) ** GOTO lbl41
                    v8 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl74
                    block64: while (true) {
                        v8 /* !! */  = (long)(v9 - jv.jatb("jbym", jats(int ), (int)121));
lbl74:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1000119820: {
                                v9 = jv.jatb("jbyn", jats(int ), (int)122);
                                continue block64;
                            }
                            case -178711615: {
                                v9 = jv.jatb("jbyo", jats(int ), (int)123);
                                continue block64;
                            }
                            case 1943365986: {
                                break block64;
                            }
                        }
                        break;
                    }
                    if (!var2_5.hasNext()) break block81;
                    if (var4_4) ** GOTO lbl41
                    v10 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl89
                    block65: while (true) {
                        v10 /* !! */  = (long)(v11 - jv.jatb("jbyp", jats(int ), (int)124));
lbl89:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 1537091227: {
                                v11 = jv.jatb("jbyq", jats(int ), (int)125);
                                continue block65;
                            }
                            case 1594592294: {
                                v11 = jv.jatb("jbyr", jats(int ), (int)126);
                                continue block65;
                            }
                            case 1727993259: {
                                v11 = jv.jatb("jbys", jats(int ), (int)127);
                                continue block65;
                            }
                            case 1943365986: {
                                break block65;
                            }
                        }
                        break;
                    }
                    var3_6 = var2_5.next();
                    if (var4_4 || var4_4) ** GOTO lbl41
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_0 = jv.qz - jv.jatb("jbyt", jats(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == jv.jatb("jbyu", jasw(int ), (int)356)) break;
                        v12 /* !! */  = (long)jv.jatb("jbyv", jasw(int ), (int)357);
                    }
                    v13 = var3_6.method_10263();
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_1 = jv.qz - jv.jatb("jbyw", jats(int ), (int)129)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == jv.jatb("jbyx", jasw(int ), (int)358)) break;
                        v14 /* !! */  = (long)jv.jatb("jbyy", jasw(int ), (int)359);
                    }
                    if (v13 != var1_1.method_10263()) break block82;
                    if (var4_4) ** GOTO lbl41
                    v15 /* !! */  = jv.qz;
                    if (true) ** GOTO lbl120
                    block68: while (true) {
                        v15 /* !! */  = (long)(jv.jatb("jbza", jats(int ), (int)131) - jv.jatb("jbyz", jats(int ), (int)130));
lbl120:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case 544492862: {
                                continue block68;
                            }
                            case 1943365986: {
                                break block68;
                            }
                        }
                        break;
                    }
                    v16 = var3_6.method_10260();
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_2 = jv.qz - jv.jatb("jbzb", jats(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == jv.jatb("jbzc", jasw(int ), (int)360)) break;
                        v17 /* !! */  = (long)jv.jatb("jbzd", jasw(int ), (int)361);
                    }
                    if (v16 != var1_1.method_10260()) break block82;
                    if (var4_4) ** GOTO lbl41
                    return var3_6;
                }
                if (var4_4 || var4_4) ** GOTO lbl41
            } while (!var6_2);
            throw null;
        }
        if (var4_4) ** GOTO lbl41
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4) ** break;
                ** continue;
                return null;
            }
lbl146:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)jv.jatb("jbze", jasw(int ), (int)362);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 1: {
                var5_3 /* !! */  = (int)jv.jatb("jbzf", jasw(int ), (int)363);
                if (!var6_2) break;
                throw null;
            }
            case 2: {
                var5_3 /* !! */  = (int)jv.jatb("jbzg", jasw(int ), (int)364);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl160:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)jv.jatb("jbzh", jasw(int ), (int)365);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl165:
            // 4 sources

            case 4: {
                var5_3 /* !! */  = (int)jv.jatb("jbzi", jasw(int ), (int)366);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
lbl169:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)jv.jatb("jbzj", jasw(int ), (int)367);
                if (var6_2) {
                    throw null;
                }
            }
            case 6: {
                var5_3 /* !! */  = (int)jv.jatb("jbzk", jasw(int ), (int)368);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 7: {
                var5_3 /* !! */  = (int)jv.jatb("jbzl", jasw(int ), (int)369);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)jv.jatb("jbzm", jasw(int ), (int)370);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
lbl186:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)jv.jatb("jbzo", jasw(int ), (int)371);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
lbl190:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)jv.jatb("jbzp", jasw(int ), (int)372);
                if (!var6_2) break;
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)jv.jatb("jbzr", jasw(int ), (int)373);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)jv.jatb("jbzs", jasw(int ), (int)374);
                    if (!var6_2) ** GOTO lbl165
                    throw null;
                }
            }
lbl203:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)jv.jatb("jbzt", jasw(int ), (int)375);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)jv.jatb("jbzu", jasw(int ), (int)376);
                if (var6_2) {
                    throw null;
                }
            }
            case 15: {
                var5_3 /* !! */  = (int)jv.jatb("jbzv", jasw(int ), (int)377);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 16: 
        }
        var5_3 /* !! */  = (int)jv.jatb("jbzw", jasw(int ), (int)378);
        ** while (!var6_2)
lbl218:
        // 1 sources

        throw null;
    }
}

