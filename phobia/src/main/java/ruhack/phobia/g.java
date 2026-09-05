/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import ruhack.phobia.am;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.bp;
import ruhack.phobia.de;
import ruhack.phobia.f;
import ruhack.phobia.fl;
import ruhack.phobia.j;
import ruhack.phobia.k;
import ruhack.phobia.l;
import ruhack.phobia.m;
import ruhack.phobia.n;
import ruhack.phobia.o;
import ruhack.phobia.p;
import ruhack.phobia.pp;
import ruhack.phobia.q;
import ruhack.phobia.r;
import ruhack.phobia.s;
import ruhack.phobia.t;
import ruhack.phobia.u;
import ruhack.phobia.v;
import ruhack.phobia.w;
import ruhack.phobia.x;

public class g {
    public static final boolean a;
    private static int[] bjol;
    private final List<f> commands;
    private static final long dm = 4359049171177608235L;
    public static final boolean c;
    public static final int b;
    private static long[] bjou;
    private static long[] bjov;
    private String prefix;
    private static g instance;
    private static int[] bjok;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String[] lambda$onTabComplete$2(int n2) {
        Object object = dm;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - g.bjom("blnd", bjot(int ), (int)159);
            }
            switch ((int)object) {
                case -1665112121: {
                    callSite = g.bjom("blne", bjot(int ), (int)160);
                    continue block15;
                }
                case -1181491709: {
                    callSite = g.bjom("blnf", bjot(int ), (int)161);
                    continue block15;
                }
                case 1048613931: {
                    break block15;
                }
                case 1737667415: {
                    callSite = g.bjom("blng", bjot(int ), (int)162);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = dm;
        block16: while (true) {
            switch ((int)object2) {
                case 280047515: {
                    object2 = g.bjom("blni", bjot(int ), (int)164) - g.bjom("blnh", bjot(int ), (int)163);
                    continue block16;
                }
                case 1048613931: {
                    break block16;
                }
            }
            break;
        }
        int n3 = b;
        Object object3 = dm;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - g.bjom("blnj", bjot(int ), (int)165);
            }
            switch ((int)object3) {
                case -114081900: {
                    callSite = g.bjom("blnk", bjot(int ), (int)166);
                    continue block17;
                }
                case 1048613931: {
                    break block17;
                }
                case 1640155649: {
                    callSite = g.bjom("blnl", bjot(int ), (int)167);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5 || bl5) {
            return null;
        }
        return new String[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getPrefix() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bkyn", bjot(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == g.bjom("bkyo", bjoj(int ), (int)104)) break;
            v0 /* !! */  = (long)g.bjom("bkyp", bjoj(int ), (int)105);
        }
        var3_1 = g.c;
        v1 /* !! */  = g.dm;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(g.bjom("bkyr", bjot(int ), (int)60) - g.bjom("bkyq", bjot(int ), (int)59));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1048613931: {
                    break block11;
                }
                case 2075112058: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = g.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bkys", bjot(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == g.bjom("bkyt", bjoj(int ), (int)106)) break;
            v2 /* !! */  = (long)g.bjom("bkyu", bjoj(int ), (int)107);
        }
        var1_3 = g.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("bkyv", bjot(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == g.bjom("bkyw", bjoj(int ), (int)108)) break;
                    v3 /* !! */  = (long)g.bjom("bkyx", bjoj(int ), (int)109);
                }
                return this.prefix;
            }
            case 0: {
                var2_2 /* !! */  = (int)g.bjom("bkyy", bjoj(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)g.bjom("bkza", bjoj(int ), (int)111);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)g.bjom("bkzb", bjoj(int ), (int)112);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)g.bjom("bkzc", bjoj(int ), (int)113);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void blpf() {
        g.bjol[100] = 1249267642;
        g.bjol[101] = -45614996;
        g.bjol[102] = 391223836;
        g.bjol[103] = 888638284;
        g.bjol[104] = -777381410;
        g.bjol[105] = 1996779592;
        g.bjol[106] = 456382492;
        g.bjol[107] = -1488425801;
        g.bjol[108] = 1227507849;
        g.bjol[109] = 431782752;
        g.bjol[110] = 54845618;
        g.bjol[111] = -1906203586;
        g.bjol[112] = -2047392220;
        g.bjol[113] = 564934617;
        g.bjol[114] = 1190371334;
        g.bjol[115] = -451330455;
        g.bjol[116] = 1016024781;
        g.bjol[117] = 1878161642;
        g.bjol[118] = 53886633;
        g.bjol[119] = 1303772224;
        g.bjol[120] = 430166734;
        g.bjol[121] = -1025251981;
        g.bjol[122] = -498122119;
        g.bjol[123] = -795274524;
        g.bjol[124] = -1534626249;
        g.bjol[125] = 1268954542;
        g.bjol[126] = -188626282;
        g.bjol[127] = 834581332;
        g.bjol[128] = -1507937893;
        g.bjol[129] = -2143258366;
        g.bjol[130] = -48591191;
        g.bjol[131] = 1698182892;
        g.bjol[132] = -1240795966;
        g.bjol[133] = 386396564;
        g.bjol[134] = 1537717576;
        g.bjol[135] = 1933590522;
        g.bjol[136] = -856588885;
        g.bjol[137] = -1551615745;
        g.bjol[138] = 1131228319;
        g.bjol[139] = 2065158032;
        g.bjol[140] = 363469780;
        g.bjol[141] = -1517749180;
        g.bjol[142] = 1668507979;
        g.bjol[143] = 993944731;
        g.bjol[144] = 1468031928;
        g.bjol[145] = 1357775615;
        g.bjol[146] = 688435081;
        g.bjol[147] = -1809549260;
        g.bjol[148] = 1834358424;
        g.bjol[149] = -786467364;
        g.bjol[150] = -1368700273;
        g.bjol[151] = -593958091;
        g.bjol[152] = -451034498;
        g.bjol[153] = -930165330;
        g.bjol[154] = 821510073;
        g.bjol[155] = -2001276112;
        g.bjol[156] = -874522049;
        g.bjol[157] = 1951774727;
        g.bjol[158] = 163751885;
        g.bjol[159] = -1725090561;
        g.bjol[160] = 1917240404;
        g.bjol[161] = 620471757;
        g.bjol[162] = -1395950506;
        g.bjol[163] = 368752714;
        g.bjol[164] = -767749818;
        g.bjol[165] = -323455296;
        g.bjol[166] = -1345355627;
        g.bjol[167] = 1823713045;
        g.bjol[168] = 1753903656;
        g.bjol[169] = -1324970858;
        g.bjol[170] = -209453772;
        g.bjol[171] = 116697551;
        g.bjol[172] = -836735463;
        g.bjol[173] = 1983737626;
        g.bjol[174] = 647582412;
        g.bjol[175] = 693328037;
        g.bjol[176] = 162684741;
        g.bjol[177] = 1237997155;
        g.bjol[178] = 869116287;
        g.bjol[179] = -451508378;
        g.bjol[180] = -1526652011;
        g.bjol[181] = 690273926;
        g.bjol[182] = -237566170;
        g.bjol[183] = 1570216229;
        g.bjol[184] = 1999841422;
        g.bjol[185] = 401252106;
        g.bjol[186] = -1133602508;
        g.bjol[187] = 518324671;
        g.bjol[188] = 1893761050;
        g.bjol[189] = 80717873;
        g.bjol[190] = -693081650;
        g.bjol[191] = 1990210715;
        g.bjol[192] = -673949417;
        g.bjol[193] = 1447409163;
        g.bjol[194] = 1005110310;
        g.bjol[195] = -1839690754;
        g.bjol[196] = -116984302;
        g.bjol[197] = -1169229338;
        g.bjol[198] = -1136782629;
        g.bjol[199] = 232575389;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void unregisterCommand(f f2) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = dm - g.bjom("bktd", bjot(int ), (int)16)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == g.bjom("bkth", bjoj(int ), (int)72)) break;
            object = g.bjom("bktj", bjoj(int ), (int)73);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = dm - g.bjom("bktm", bjot(int ), (int)17)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == g.bjom("bktn", bjoj(int ), (int)74)) break;
            object = g.bjom("bktp", bjoj(int ), (int)75);
        }
        int n2 = b;
        Object object = dm;
        block10: while (true) {
            switch ((int)object) {
                case -1367877035: {
                    object = g.bjom("bktt", bjot(int ), (int)19) - g.bjom("bkts", bjot(int ), (int)18);
                    continue block10;
                }
                case 1048613931: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return;
        Object object2 = dm;
        block11: while (true) {
            switch ((int)object2) {
                case 55468506: {
                    object2 = g.bjom("bktv", bjot(int ), (int)21) - g.bjom("bktu", bjot(int ), (int)20);
                    continue block11;
                }
                case 1048613931: {
                    break block11;
                }
            }
            break;
        }
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = dm - g.bjom("bktw", bjot(int ), (int)22)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == g.bjom("bktx", bjoj(int ), (int)76)) {
                this.commands.remove(f2);
                if (bl3) return;
                break;
            }
            object3 = g.bjom("bkty", bjoj(int ), (int)77);
        }
        if (!bl3) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void sendRaw(class_2561 var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("blmd", bjot(int ), (int)146));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1048613931: {
                    break block30;
                }
                case 1087593622: {
                    v1 = g.bjom("blme", bjot(int ), (int)147);
                    continue block30;
                }
                case 1569758352: {
                    v1 = g.bjom("blmf", bjot(int ), (int)148);
                    continue block30;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("blmg", bjot(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == g.bjom("blmh", bjoj(int ), (int)355)) break;
            v2 /* !! */  = (long)g.bjom("blmi", bjoj(int ), (int)356);
        }
        var3_3 /* !! */  = g.b;
        v3 /* !! */  = g.dm;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - g.bjom("blmj", bjot(int ), (int)150));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -119625439: {
                    v4 = g.bjom("blmk", bjot(int ), (int)151);
                    continue block32;
                }
                case 778097894: {
                    v4 = g.bjom("blml", bjot(int ), (int)152);
                    continue block32;
                }
                case 876378504: {
                    v4 = g.bjom("blmm", bjot(int ), (int)153);
                    continue block32;
                }
                case 1048613931: {
                    break block32;
                }
            }
            break;
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl40:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("blmn", bjot(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == g.bjom("blmo", bjoj(int ), (int)357)) break;
            v5 /* !! */  = (long)g.bjom("blmp", bjoj(int ), (int)358);
        }
        v6 = var1_1.getString();
        v7 /* !! */  = g.dm;
        if (true) ** GOTO lbl53
        block35: while (true) {
            v7 /* !! */  = (long)(g.bjom("blmr", bjot(int ), (int)156) - g.bjom("blmq", bjot(int ), (int)155));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2088337794: {
                    continue block35;
                }
                case 1048613931: {
                    break block35;
                }
            }
            break;
        }
        if (v6.isBlank()) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl40
        v8 /* !! */  = g.dm;
        if (true) ** GOTO lbl64
        block36: while (true) {
            v8 /* !! */  = (long)(g.bjom("blmt", bjot(int ), (int)158) - g.bjom("blms", bjot(int ), (int)157));
lbl64:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1048613931: {
                    break block36;
                }
                case 1323625989: {
                    continue block36;
                }
            }
            break;
        }
        pp.brandmessage(var1_1);
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl77:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)g.bjom("blmu", bjoj(int ), (int)359);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 1: {
                var3_3 /* !! */  = (int)g.bjom("blmv", bjoj(int ), (int)360);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)g.bjom("blmw", bjoj(int ), (int)361);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl111
                    break;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)g.bjom("blmx", bjoj(int ), (int)362);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl98:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)g.bjom("blmy", bjoj(int ), (int)363);
                if (!var4_2) ** GOTO lbl77
                throw null;
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("blmz", bjoj(int ), (int)364);
                } while (!var4_2);
                throw null;
            }
lbl107:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)g.bjom("blna", bjoj(int ), (int)365);
                if (!var4_2) break;
                throw null;
            }
lbl111:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)g.bjom("blnb", bjoj(int ), (int)366);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)g.bjom("blnc", bjoj(int ), (int)367);
        ** while (!var4_2)
lbl118:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blpg() {
        g.bjol[200] = 1115278421;
        g.bjol[201] = -54212859;
        g.bjol[202] = -1565540192;
        g.bjol[203] = -305906573;
        g.bjol[204] = -620228829;
        g.bjol[205] = 1660024465;
        g.bjol[206] = 680525596;
        g.bjol[207] = 1160312789;
        g.bjol[208] = -1499583679;
        g.bjol[209] = -1512368436;
        g.bjol[210] = 2090375185;
        g.bjol[211] = -224688190;
        g.bjol[212] = -1150355784;
        g.bjol[213] = -1552033396;
        g.bjol[214] = -1558631233;
        g.bjol[215] = -923296129;
        g.bjol[216] = 954570969;
        g.bjol[217] = -1779141146;
        g.bjol[218] = -473987190;
        g.bjol[219] = -1036503197;
        g.bjol[220] = 260009601;
        g.bjol[221] = 1426125096;
        g.bjol[222] = -1369381926;
        g.bjol[223] = 1039272687;
        g.bjol[224] = -106336610;
        g.bjol[225] = 1448051469;
        g.bjol[226] = -717926334;
        g.bjol[227] = -671567839;
        g.bjol[228] = -848243983;
        g.bjol[229] = -1174501077;
        g.bjol[230] = 241471203;
        g.bjol[231] = -1222377719;
        g.bjol[232] = -1785788139;
        g.bjol[233] = 1458421167;
        g.bjol[234] = -489285614;
        g.bjol[235] = -982480740;
        g.bjol[236] = -229298241;
        g.bjol[237] = 71148877;
        g.bjol[238] = 1798054712;
        g.bjol[239] = -1693501497;
        g.bjol[240] = 276538438;
        g.bjol[241] = 377710705;
        g.bjol[242] = -2014586374;
        g.bjol[243] = -492474425;
        g.bjol[244] = -1054972826;
        g.bjol[245] = 1858374586;
        g.bjol[246] = 223549849;
        g.bjol[247] = 255867831;
        g.bjol[248] = -1552463808;
        g.bjol[249] = -2104411224;
        g.bjol[250] = -1199675750;
        g.bjol[251] = -1450024086;
        g.bjol[252] = -629974876;
        g.bjol[253] = 1456152467;
        g.bjol[254] = -1467484503;
        g.bjol[255] = -1690404486;
        g.bjol[256] = -162478701;
        g.bjol[257] = -1659770914;
        g.bjol[258] = -1653410630;
        g.bjol[259] = 1634416289;
        g.bjol[260] = -783859457;
        g.bjol[261] = -1917973651;
        g.bjol[262] = -431725712;
        g.bjol[263] = 888256071;
        g.bjol[264] = 1712636372;
        g.bjol[265] = -127571885;
        g.bjol[266] = -774028862;
        g.bjol[267] = 324692059;
        g.bjol[268] = -1402670277;
        g.bjol[269] = -1792230448;
        g.bjol[270] = -1455434277;
        g.bjol[271] = 1373031525;
        g.bjol[272] = 1504302108;
        g.bjol[273] = 1164191098;
        g.bjol[274] = -534494654;
        g.bjol[275] = 2142456284;
        g.bjol[276] = -648000795;
        g.bjol[277] = -1770247751;
        g.bjol[278] = -799094469;
        g.bjol[279] = -375539276;
        g.bjol[280] = -1104957046;
        g.bjol[281] = 46393207;
        g.bjol[282] = 802972268;
        g.bjol[283] = -271420101;
        g.bjol[284] = 1906286028;
        g.bjol[285] = -1409780456;
        g.bjol[286] = -1776253246;
        g.bjol[287] = -1878327771;
        g.bjol[288] = -1533056580;
        g.bjol[289] = 1480104104;
        g.bjol[290] = 259610261;
        g.bjol[291] = 1311151077;
        g.bjol[292] = 1450131586;
        g.bjol[293] = -2072031405;
        g.bjol[294] = -2016575991;
        g.bjol[295] = -315209155;
        g.bjol[296] = -1548045478;
        g.bjol[297] = 1257953305;
        g.bjol[298] = 121207736;
        g.bjol[299] = -484739816;
    }

    static {
        bjok = new int[391];
        bjol = new int[391];
        g.blpa();
        g.blpb();
        g.blpc();
        g.blpd();
        g.blpe();
        g.blpf();
        g.blpg();
        g.blph();
        bjou = new long[185];
        bjov = new long[185];
        g.blpi();
        g.blpj();
        g.blpk();
        g.blpl();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Stream<String> tabComplete(String var1_1) {
        block65: {
            block67: {
                block66: {
                    block64: {
                        var8_2 = g.c;
                        var7_3 /* !! */  = g.b;
                        var6_4 = g.a;
                        if (var8_2) {
                            throw null;
lbl6:
                            // 15 sources

                            return null;
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (var1_1 != null) break block64;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var1_1 = "";
                        if (var6_4) ** GOTO lbl6
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    var2_5 = var1_1.split("\\s+", (int)g.bjom("blgi", bjoj(int ), (int)241));
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var2_5.length > g.bjom("blgj", bjoj(int ), (int)242)) break block65;
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var2_5.length != 0) break block66;
                    if (var6_4) ** GOTO lbl6
                    v0 = "";
                    if (var8_2) {
                        throw null;
                    }
                    break block67;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                v0 = var3_6 = var2_5[0].toLowerCase();
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            return this.getCommandSuggestions(var3_6);
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        var3_7 = var2_5[0];
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_8 = this.getCommand(var3_7);
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var4_8 == null) ** GOTO lbl45
                if (var6_4 || var6_4) ** GOTO lbl6
                var5_9 = Arrays.copyOfRange(var2_5, 1, var2_5.length);
                if (var6_4 || var6_4) ** GOTO lbl6
                return var4_8.tabComplete(var3_7, var5_9);
lbl45:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return Stream.empty();
            }
lbl48:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)g.bjom("blgk", bjoj(int ), (int)243);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl53:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)g.bjom("blgl", bjoj(int ), (int)244);
                if (var8_2) {
                    throw null;
                }
            }
            case 2: {
                var7_3 /* !! */  = (int)g.bjom("blgm", bjoj(int ), (int)245);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl62:
            // 3 sources

            case 3: {
                var7_3 /* !! */  = (int)g.bjom("blgn", bjoj(int ), (int)246);
                if (!var8_2) break;
                throw null;
            }
            case 4: {
                var7_3 /* !! */  = (int)g.bjom("blgo", bjoj(int ), (int)247);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 5: {
                var7_3 /* !! */  = (int)g.bjom("blgp", bjoj(int ), (int)248);
                if (!var8_2) ** GOTO lbl48
                throw null;
            }
lbl75:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)g.bjom("blgq", bjoj(int ), (int)249);
                if (!var8_2) break;
                throw null;
            }
lbl79:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)g.bjom("blgr", bjoj(int ), (int)250);
                if (!var8_2) ** GOTO lbl53
                throw null;
            }
lbl83:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)g.bjom("blgs", bjoj(int ), (int)251);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl88:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)g.bjom("blgt", bjoj(int ), (int)252);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl93:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)g.bjom("blgu", bjoj(int ), (int)253);
                if (!var8_2) ** GOTO lbl62
                throw null;
            }
lbl97:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)g.bjom("blgv", bjoj(int ), (int)254);
                if (!var8_2) ** GOTO lbl75
                throw null;
            }
lbl101:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)g.bjom("blgw", bjoj(int ), (int)255);
                if (var8_2) {
                    throw null;
                }
            }
            case 13: {
                var7_3 /* !! */  = (int)g.bjom("blgx", bjoj(int ), (int)256);
                if (!var8_2) ** GOTO lbl83
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)g.bjom("blgy", bjoj(int ), (int)257);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl141
                    break;
                }
            }
            case 15: {
                var7_3 /* !! */  = (int)g.bjom("blgz", bjoj(int ), (int)258);
                if (!var8_2) ** GOTO lbl101
                throw null;
            }
lbl119:
            // 4 sources

            case 16: {
                var7_3 /* !! */  = (int)g.bjom("blha", bjoj(int ), (int)259);
                if (!var8_2) ** GOTO lbl93
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)g.bjom("blhb", bjoj(int ), (int)260);
                if (!var8_2) ** GOTO lbl119
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)g.bjom("blhc", bjoj(int ), (int)261);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl132:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)g.bjom("blhd", bjoj(int ), (int)262);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 20: {
                var7_3 /* !! */  = (int)g.bjom("blhe", bjoj(int ), (int)263);
                if (!var8_2) ** GOTO lbl62
                throw null;
            }
lbl141:
            // 3 sources

            case 21: {
                var7_3 /* !! */  = (int)g.bjom("blhf", bjoj(int ), (int)264);
                if (!var8_2) ** GOTO lbl79
                throw null;
            }
            case 22: {
                var7_3 /* !! */  = (int)g.bjom("blhg", bjoj(int ), (int)265);
                if (!var8_2) ** GOTO lbl132
                throw null;
            }
lbl149:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)g.bjom("blhh", bjoj(int ), (int)266);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 24: {
                var7_3 /* !! */  = (int)g.bjom("blhi", bjoj(int ), (int)267);
                if (!var8_2) ** GOTO lbl141
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)g.bjom("blhj", bjoj(int ), (int)268);
                if (!var8_2) ** GOTO lbl88
                throw null;
            }
lbl162:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)g.bjom("blhk", bjoj(int ), (int)269);
                if (!var8_2) ** GOTO lbl97
                throw null;
            }
lbl166:
            // 4 sources

            case 27: {
                var7_3 /* !! */  = (int)g.bjom("blhl", bjoj(int ), (int)270);
                if (!var8_2) ** GOTO lbl93
                throw null;
            }
lbl170:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)g.bjom("blhm", bjoj(int ), (int)271);
                if (!var8_2) ** GOTO lbl119
                throw null;
            }
lbl174:
            // 2 sources

            case 29: {
                var7_3 /* !! */  = (int)g.bjom("blhn", bjoj(int ), (int)272);
                if (!var8_2) ** GOTO lbl149
                throw null;
            }
            case 30: {
                var7_3 /* !! */  = (int)g.bjom("blho", bjoj(int ), (int)273);
                if (!var8_2) ** GOTO lbl166
                throw null;
            }
            case 31: 
        }
        var7_3 /* !! */  = (int)g.bjom("blhp", bjoj(int ), (int)274);
        ** while (!var8_2)
lbl185:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blpc() {
        g.bjok[200] = 1115278424;
        g.bjok[201] = -54212833;
        g.bjok[202] = -1565540186;
        g.bjok[203] = -305906573;
        g.bjok[204] = -620228831;
        g.bjok[205] = 1660024464;
        g.bjok[206] = 680525597;
        g.bjok[207] = 1160312789;
        g.bjok[208] = -1499583658;
        g.bjok[209] = -1512368441;
        g.bjok[210] = 2090375181;
        g.bjok[211] = -224688181;
        g.bjok[212] = -1150355789;
        g.bjok[213] = -1552033392;
        g.bjok[214] = -1558631255;
        g.bjok[215] = -923296151;
        g.bjok[216] = 954571001;
        g.bjok[217] = -1779141134;
        g.bjok[218] = -473987199;
        g.bjok[219] = -1036503178;
        g.bjok[220] = 260009605;
        g.bjok[221] = 1426125100;
        g.bjok[222] = -1369381929;
        g.bjok[223] = 1039272678;
        g.bjok[224] = -106336614;
        g.bjok[225] = 1448051475;
        g.bjok[226] = -717926318;
        g.bjok[227] = -671567820;
        g.bjok[228] = -848243978;
        g.bjok[229] = -1174501078;
        g.bjok[230] = 241471204;
        g.bjok[231] = -1222377702;
        g.bjok[232] = -1785788131;
        g.bjok[233] = 1458421158;
        g.bjok[234] = -489285610;
        g.bjok[235] = -982480738;
        g.bjok[236] = -229298246;
        g.bjok[237] = 71148876;
        g.bjok[238] = 1798054698;
        g.bjok[239] = -1693501488;
        g.bjok[240] = 276538445;
        g.bjok[241] = -377710706;
        g.bjok[242] = -2014586373;
        g.bjok[243] = -492474416;
        g.bjok[244] = -1054972820;
        g.bjok[245] = 1858374590;
        g.bjok[246] = 223549849;
        g.bjok[247] = 255867813;
        g.bjok[248] = -1552463802;
        g.bjok[249] = -2104411221;
        g.bjok[250] = -1199675771;
        g.bjok[251] = -1450024096;
        g.bjok[252] = -629974878;
        g.bjok[253] = 1456152463;
        g.bjok[254] = -1467484488;
        g.bjok[255] = -1690404509;
        g.bjok[256] = -162478714;
        g.bjok[257] = -1659770933;
        g.bjok[258] = -1653410653;
        g.bjok[259] = 1634416303;
        g.bjok[260] = -783859467;
        g.bjok[261] = -1917973662;
        g.bjok[262] = -431725714;
        g.bjok[263] = 888256087;
        g.bjok[264] = 1712636371;
        g.bjok[265] = -127571902;
        g.bjok[266] = -774028855;
        g.bjok[267] = 324692041;
        g.bjok[268] = -1402670293;
        g.bjok[269] = -1792230437;
        g.bjok[270] = -1455434293;
        g.bjok[271] = 1373031523;
        g.bjok[272] = 1504302109;
        g.bjok[273] = 1164191090;
        g.bjok[274] = -534494654;
        g.bjok[275] = 2142456261;
        g.bjok[276] = -648000793;
        g.bjok[277] = -1770247771;
        g.bjok[278] = -799094472;
        g.bjok[279] = -375539285;
        g.bjok[280] = -1104957032;
        g.bjok[281] = 46393213;
        g.bjok[282] = 802972229;
        g.bjok[283] = -271420111;
        g.bjok[284] = 1906286057;
        g.bjok[285] = -1409780464;
        g.bjok[286] = -1776253226;
        g.bjok[287] = -1878327752;
        g.bjok[288] = -1533056595;
        g.bjok[289] = 1480104104;
        g.bjok[290] = 259610265;
        g.bjok[291] = 1311151075;
        g.bjok[292] = 1450131591;
        g.bjok[293] = -2072031417;
        g.bjok[294] = -2016575954;
        g.bjok[295] = -315209195;
        g.bjok[296] = -1548045500;
        g.bjok[297] = 1257953301;
        g.bjok[298] = 121207696;
        g.bjok[299] = -484739779;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$getCommand$0(String var0, f var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("bloj", bjot(int ), (int)179));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -996632535: {
                    v1 = g.bjom("blok", bjot(int ), (int)180);
                    continue block11;
                }
                case -447845463: {
                    v1 = g.bjom("blol", bjot(int ), (int)181);
                    continue block11;
                }
                case 1048613931: {
                    break block11;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("blom", bjot(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == g.bjom("blon", bjoj(int ), (int)380)) break;
            v2 /* !! */  = (long)g.bjom("bloo", bjoj(int ), (int)381);
        }
        var3_3 /* !! */  = g.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("blop", bjot(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == g.bjom("bloq", bjoj(int ), (int)382)) break;
            v3 /* !! */  = (long)g.bjom("blor", bjoj(int ), (int)383);
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
            return (boolean)g.bjom("blos", bjoj(int ), (int)384);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("blot", bjot(int ), (int)184)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == g.bjom("blou", bjoj(int ), (int)385)) break;
                    v4 /* !! */  = (long)g.bjom("blov", bjoj(int ), (int)386);
                }
                return var1_1.matches(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)g.bjom("blow", bjoj(int ), (int)387);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("blox", bjoj(int ), (int)388);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)g.bjom("bloy", bjoj(int ), (int)389);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)g.bjom("bloz", bjoj(int ), (int)390);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean execute(String var1_1) {
        block71: {
            block70: {
                block69: {
                    block68: {
                        block67: {
                            var9_2 = g.c;
                            var8_3 /* !! */  = g.b;
                            var7_4 = g.a;
                            if (var9_2) {
                                throw null;
lbl6:
                                // 19 sources

                                return (boolean)g.bjom("blew", bjoj(int ), (int)203);
                            }
                            if (var7_4 || var7_4) ** GOTO lbl6
                            if (var1_1 == null) break block67;
                            if (var7_4) ** GOTO lbl6
                            if (!var1_1.trim().isEmpty()) break block68;
                            if (var7_4) ** GOTO lbl6
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        return this.execute("help");
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var2_5 = var1_1.trim().split("\\s+", (int)g.bjom("blex", bjoj(int ), (int)204));
                    if (var7_4 || var7_4) ** GOTO lbl6
                    var3_6 = var2_5[0];
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var2_5.length <= g.bjom("bley", bjoj(int ), (int)205)) break block69;
                    if (var7_4) ** GOTO lbl6
                    v0 = var2_5[1].split("\\s+");
                    if (var9_2) {
                        throw null;
                    }
                    break block70;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                v0 = var4_7 = new String[]{};
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            var5_8 = this.getCommand(var3_6);
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var5_8 == null) break block71;
            if (var7_4) ** GOTO lbl6
            try {
                if (var7_4) ** GOTO lbl6
                var5_8.execute(var3_6, var4_7);
                if (var7_4 || var7_4) ** GOTO lbl6
                return (boolean)g.bjom("blez", bjoj(int ), (int)206);
            }
            catch (Exception var6_9) {
                if (var7_4 || var7_4) ** GOTO lbl6
                this.sendError("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u044b: " + var6_9.getMessage());
                if (var7_4 || var7_4) ** GOTO lbl6
                var6_9.printStackTrace();
                if (var7_4) ** GOTO lbl6
            }
        }
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var7_4) ** break;
                ** continue;
                return (boolean)g.bjom("blfa", bjoj(int ), (int)207);
            }
lbl56:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)g.bjom("blfb", bjoj(int ), (int)208);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)g.bjom("blfc", bjoj(int ), (int)209);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl175
                    break;
                }
            }
            case 2: {
                var8_3 /* !! */  = (int)g.bjom("blfd", bjoj(int ), (int)210);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl72:
            // 4 sources

            case 3: {
                var8_3 /* !! */  = (int)g.bjom("blfe", bjoj(int ), (int)211);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 4: {
                do {
                    var8_3 /* !! */  = (int)g.bjom("blff", bjoj(int ), (int)212);
                } while (!var9_2);
                throw null;
            }
lbl82:
            // 6 sources

            case 5: {
                var8_3 /* !! */  = (int)g.bjom("blfg", bjoj(int ), (int)213);
                if (!var9_2) ** GOTO lbl72
                throw null;
            }
lbl86:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)g.bjom("blfh", bjoj(int ), (int)214);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 7: {
                var8_3 /* !! */  = (int)g.bjom("blfi", bjoj(int ), (int)215);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 8: {
                var8_3 /* !! */  = (int)g.bjom("blfj", bjoj(int ), (int)216);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl101:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)g.bjom("blfk", bjoj(int ), (int)217);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)g.bjom("blfl", bjoj(int ), (int)218);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl110:
            // 3 sources

            case 11: {
                var8_3 /* !! */  = (int)g.bjom("blfm", bjoj(int ), (int)219);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl115:
            // 3 sources

            case 12: {
                var8_3 /* !! */  = (int)g.bjom("blfn", bjoj(int ), (int)220);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
            case 13: {
                var8_3 /* !! */  = (int)g.bjom("blfo", bjoj(int ), (int)221);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 14: {
                var8_3 /* !! */  = (int)g.bjom("blfp", bjoj(int ), (int)222);
                if (!var9_2) break;
                throw null;
            }
lbl128:
            // 3 sources

            case 15: {
                var8_3 /* !! */  = (int)g.bjom("blfq", bjoj(int ), (int)223);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 16: {
                var8_3 /* !! */  = (int)g.bjom("blfr", bjoj(int ), (int)224);
                if (var9_2) {
                    throw null;
                }
            }
lbl137:
            // 5 sources

            case 17: {
                var8_3 /* !! */  = (int)g.bjom("blfs", bjoj(int ), (int)225);
                if (!var9_2) ** GOTO lbl115
                throw null;
            }
            case 18: {
                var8_3 /* !! */  = (int)g.bjom("blft", bjoj(int ), (int)226);
                if (!var9_2) ** GOTO lbl56
                throw null;
            }
            case 19: {
                var8_3 /* !! */  = (int)g.bjom("blfu", bjoj(int ), (int)227);
                if (!var9_2) ** GOTO lbl128
                throw null;
            }
            case 20: {
                do {
                    var8_3 /* !! */  = (int)g.bjom("blfv", bjoj(int ), (int)228);
                } while (!var9_2);
                throw null;
            }
lbl154:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)g.bjom("blfw", bjoj(int ), (int)229);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)g.bjom("blfx", bjoj(int ), (int)230);
                if (!var9_2) ** GOTO lbl137
                throw null;
            }
            case 23: {
                var8_3 /* !! */  = (int)g.bjom("blfy", bjoj(int ), (int)231);
                if (!var9_2) ** GOTO lbl101
                throw null;
            }
lbl166:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)g.bjom("blfz", bjoj(int ), (int)232);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl171:
            // 3 sources

            case 25: {
                var8_3 /* !! */  = (int)g.bjom("blga", bjoj(int ), (int)233);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
lbl175:
            // 3 sources

            case 26: {
                var8_3 /* !! */  = (int)g.bjom("blgb", bjoj(int ), (int)234);
                if (!var9_2) ** GOTO lbl115
                throw null;
            }
            case 27: {
                var8_3 /* !! */  = (int)g.bjom("blgc", bjoj(int ), (int)235);
                if (!var9_2) ** GOTO lbl72
                throw null;
            }
lbl183:
            // 3 sources

            case 28: {
                var8_3 /* !! */  = (int)g.bjom("blgd", bjoj(int ), (int)236);
                if (!var9_2) ** GOTO lbl72
                throw null;
            }
lbl187:
            // 2 sources

            case 29: {
                var8_3 /* !! */  = (int)g.bjom("blge", bjoj(int ), (int)237);
                if (!var9_2) ** GOTO lbl183
                throw null;
            }
            case 30: {
                var8_3 /* !! */  = (int)g.bjom("blgf", bjoj(int ), (int)238);
                if (!var9_2) ** GOTO lbl166
                throw null;
            }
            case 31: {
                var8_3 /* !! */  = (int)g.bjom("blgg", bjoj(int ), (int)239);
                if (!var9_2) ** GOTO lbl171
                throw null;
            }
            case 32: 
        }
        var8_3 /* !! */  = (int)g.bjom("blgh", bjoj(int ), (int)240);
        ** while (!var9_2)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blpb() {
        g.bjok[100] = 1249267643;
        g.bjok[101] = -45614996;
        g.bjok[102] = 391223836;
        g.bjok[103] = 888638286;
        g.bjok[104] = -777381409;
        g.bjok[105] = -1486547417;
        g.bjok[106] = -456382493;
        g.bjok[107] = -1441729264;
        g.bjok[108] = 1227507848;
        g.bjok[109] = -2125293254;
        g.bjok[110] = 54845618;
        g.bjok[111] = -1906203586;
        g.bjok[112] = -2047392220;
        g.bjok[113] = 564934617;
        g.bjok[114] = 1190371331;
        g.bjok[115] = -451330451;
        g.bjok[116] = 1016024783;
        g.bjok[117] = 1878161640;
        g.bjok[118] = 53886634;
        g.bjok[119] = 1303772225;
        g.bjok[120] = 430166741;
        g.bjok[121] = -1025251996;
        g.bjok[122] = -498122131;
        g.bjok[123] = -795274515;
        g.bjok[124] = -1534626281;
        g.bjok[125] = 1268954534;
        g.bjok[126] = -188626275;
        g.bjok[127] = 834581335;
        g.bjok[128] = -1507937891;
        g.bjok[129] = -2143258353;
        g.bjok[130] = -48591193;
        g.bjok[131] = 1698182896;
        g.bjok[132] = -1240795938;
        g.bjok[133] = 386396563;
        g.bjok[134] = 1537717574;
        g.bjok[135] = 1933590514;
        g.bjok[136] = -856588894;
        g.bjok[137] = -1551615771;
        g.bjok[138] = 1131228294;
        g.bjok[139] = 2065158032;
        g.bjok[140] = 363469780;
        g.bjok[141] = -1517749170;
        g.bjok[142] = 1668507978;
        g.bjok[143] = 993944721;
        g.bjok[144] = 1468031905;
        g.bjok[145] = 1357775598;
        g.bjok[146] = 688435080;
        g.bjok[147] = -1809549253;
        g.bjok[148] = 1834358410;
        g.bjok[149] = -786467372;
        g.bjok[150] = -1368700285;
        g.bjok[151] = -593958102;
        g.bjok[152] = -451034511;
        g.bjok[153] = -930165329;
        g.bjok[154] = 1803474024;
        g.bjok[155] = -2001276111;
        g.bjok[156] = 1270263653;
        g.bjok[157] = 1951774726;
        g.bjok[158] = 756036639;
        g.bjok[159] = -1725090562;
        g.bjok[160] = 975416083;
        g.bjok[161] = 620471756;
        g.bjok[162] = -2131277669;
        g.bjok[163] = -368752715;
        g.bjok[164] = -767749817;
        g.bjok[165] = -1044499674;
        g.bjok[166] = -1345355628;
        g.bjok[167] = -1823713046;
        g.bjok[168] = -1612671051;
        g.bjok[169] = -1324970857;
        g.bjok[170] = 1059056175;
        g.bjok[171] = 116697550;
        g.bjok[172] = 349489682;
        g.bjok[173] = 1983737627;
        g.bjok[174] = 966418217;
        g.bjok[175] = 693328032;
        g.bjok[176] = 162684756;
        g.bjok[177] = 1237997158;
        g.bjok[178] = 869116279;
        g.bjok[179] = -451508367;
        g.bjok[180] = -1526652005;
        g.bjok[181] = 690273940;
        g.bjok[182] = -237566176;
        g.bjok[183] = 1570216229;
        g.bjok[184] = 1999841437;
        g.bjok[185] = 401252113;
        g.bjok[186] = -1133602501;
        g.bjok[187] = 518324666;
        g.bjok[188] = 1893761049;
        g.bjok[189] = 80717883;
        g.bjok[190] = -693081635;
        g.bjok[191] = 1990210704;
        g.bjok[192] = -673949425;
        g.bjok[193] = 1447409183;
        g.bjok[194] = 1005110317;
        g.bjok[195] = -1839690773;
        g.bjok[196] = -116984310;
        g.bjok[197] = -1169229321;
        g.bjok[198] = -1136782630;
        g.bjok[199] = 232575370;
    }

    private static /* synthetic */ void blph() {
        g.bjol[300] = -1789846817;
        g.bjol[301] = 2126329281;
        g.bjol[302] = 1978150285;
        g.bjol[303] = -461341289;
        g.bjol[304] = 251152524;
        g.bjol[305] = -996254706;
        g.bjol[306] = 753715186;
        g.bjol[307] = 1927378025;
        g.bjol[308] = -1174778754;
        g.bjol[309] = 435649584;
        g.bjol[310] = -1381852371;
        g.bjol[311] = -1411713697;
        g.bjol[312] = 1319326590;
        g.bjol[313] = 1482826877;
        g.bjol[314] = -1032238329;
        g.bjol[315] = 1028337726;
        g.bjol[316] = 800121151;
        g.bjol[317] = 69769094;
        g.bjol[318] = 610086967;
        g.bjol[319] = 1063572008;
        g.bjol[320] = -1497454597;
        g.bjol[321] = -1591500330;
        g.bjol[322] = 2027474810;
        g.bjol[323] = 1830993865;
        g.bjol[324] = -636267784;
        g.bjol[325] = -79994978;
        g.bjol[326] = -1879199514;
        g.bjol[327] = -1512721726;
        g.bjol[328] = 3971734;
        g.bjol[329] = -801203538;
        g.bjol[330] = -1321193598;
        g.bjol[331] = 2133577642;
        g.bjol[332] = -582857581;
        g.bjol[333] = 1448137596;
        g.bjol[334] = 2110735401;
        g.bjol[335] = -1060422439;
        g.bjol[336] = 33910814;
        g.bjol[337] = 632825841;
        g.bjol[338] = -617326776;
        g.bjol[339] = 1209370723;
        g.bjol[340] = 1758231244;
        g.bjol[341] = -1099005070;
        g.bjol[342] = 657757553;
        g.bjol[343] = -1893787457;
        g.bjol[344] = -617328567;
        g.bjol[345] = 262501026;
        g.bjol[346] = -1921856576;
        g.bjol[347] = 1492472060;
        g.bjol[348] = -1054706120;
        g.bjol[349] = -657789067;
        g.bjol[350] = 1075576025;
        g.bjol[351] = 2038906274;
        g.bjol[352] = 711936741;
        g.bjol[353] = -2007604708;
        g.bjol[354] = 757729440;
        g.bjol[355] = 495868903;
        g.bjol[356] = 1199856829;
        g.bjol[357] = -2070914668;
        g.bjol[358] = 1070317771;
        g.bjol[359] = -691648279;
        g.bjol[360] = 1940636741;
        g.bjol[361] = 130321136;
        g.bjol[362] = 34471032;
        g.bjol[363] = 1880976615;
        g.bjol[364] = -1704653304;
        g.bjol[365] = 1279177629;
        g.bjol[366] = -364725364;
        g.bjol[367] = 1126097007;
        g.bjol[368] = -1674179991;
        g.bjol[369] = -1134372871;
        g.bjol[370] = 696666260;
        g.bjol[371] = -496043199;
        g.bjol[372] = 314345210;
        g.bjol[373] = 1090008487;
        g.bjol[374] = -963610365;
        g.bjol[375] = 1488225480;
        g.bjol[376] = -782629469;
        g.bjol[377] = 799035333;
        g.bjol[378] = 1501485626;
        g.bjol[379] = -1010231711;
        g.bjol[380] = 1703396852;
        g.bjol[381] = -2033290617;
        g.bjol[382] = 363943466;
        g.bjol[383] = 631339469;
        g.bjol[384] = -1862370753;
        g.bjol[385] = 96043687;
        g.bjol[386] = -533440527;
        g.bjol[387] = -668805897;
        g.bjol[388] = 229696855;
        g.bjol[389] = -1232867384;
        g.bjol[390] = 130002377;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ String lambda$onTabComplete$1(String var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("blnq", bjot(int ), (int)168));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1564241841: {
                    v1 = g.bjom("blnr", bjot(int ), (int)169);
                    continue block21;
                }
                case -983488758: {
                    v1 = g.bjom("blns", bjot(int ), (int)170);
                    continue block21;
                }
                case 1048613931: {
                    break block21;
                }
                case 1451692351: {
                    v1 = g.bjom("blnt", bjot(int ), (int)171);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("blnu", bjot(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == g.bjom("blnv", bjoj(int ), (int)372)) break;
            v2 /* !! */  = (long)g.bjom("blnw", bjoj(int ), (int)373);
        }
        var3_3 /* !! */  = g.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("blnx", bjot(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == g.bjom("blny", bjoj(int ), (int)374)) break;
            v3 /* !! */  = (long)g.bjom("blnz", bjoj(int ), (int)375);
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl37:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = g.dm;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v4 /* !! */  = (long)(g.bjom("blob", bjot(int ), (int)175) - g.bjom("bloa", bjot(int ), (int)174));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -567552781: {
                            continue block25;
                        }
                        case 1048613931: {
                            break block25;
                        }
                    }
                    break;
                }
                v5 /* !! */  = g.dm;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - g.bjom("bloc", bjot(int ), (int)176));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1917372377: {
                            v6 = g.bjom("blod", bjot(int ), (int)177);
                            continue block26;
                        }
                        case -1156137635: {
                            v6 = g.bjom("bloe", bjot(int ), (int)178);
                            continue block26;
                        }
                        case 1048613931: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.prefix + var1_1;
            }
            case 0: {
                var3_3 /* !! */  = (int)g.bjom("blof", bjoj(int ), (int)376);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl68:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("blog", bjoj(int ), (int)377);
                } while (!var4_2);
                throw null;
            }
lbl73:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)g.bjom("bloh", bjoj(int ), (int)378);
                    if (!var4_2) ** GOTO lbl68
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)g.bjom("bloi", bjoj(int ), (int)379);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void init() {
        var6_1 = g.c;
        var5_2 /* !! */  = g.b;
        var4_3 = g.a;
        if (var6_1) {
            throw null;
lbl6:
            // 23 sources

            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        this.registerCommand(new o());
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = new n();
        if (var4_3 || var4_3) ** GOTO lbl6
        this.registerCommand(var1_4);
        if (var4_3 || var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                ax.register(var1_4);
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new x());
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = new v();
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(var2_5);
                if (var4_3 || var4_3) ** GOTO lbl6
                ax.register(var2_5);
                if (var4_3 || var4_3) ** GOTO lbl6
                var3_6 = new w();
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(var3_6);
                if (var4_3 || var4_3) ** GOTO lbl6
                ax.register(var3_6);
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new p());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new r());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new l());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new k());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new m());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new q());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new j());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new s());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new u());
                if (var4_3 || var4_3) ** GOTO lbl6
                this.registerCommand(new t());
                if (var4_3 || var4_3) ** GOTO lbl6
                ax.register(this);
                if (var4_3 || var4_3) ** continue;
                return;
            }
            case 0: {
                var5_2 /* !! */  = (int)g.bjom("bjpl", bjoj(int ), (int)12);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 1: {
                var5_2 /* !! */  = (int)g.bjom("bjpm", bjoj(int ), (int)13);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl67:
            // 3 sources

            case 2: {
                var5_2 /* !! */  = (int)g.bjom("bjpn", bjoj(int ), (int)14);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl72:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)g.bjom("bjpo", bjoj(int ), (int)15);
                if (!var6_1) ** GOTO lbl67
                throw null;
            }
lbl76:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)g.bjom("bjpp", bjoj(int ), (int)16);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl81:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)g.bjom("bjpq", bjoj(int ), (int)17);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl110
                    break;
                }
            }
lbl87:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)g.bjom("bjpr", bjoj(int ), (int)18);
                if (!var6_1) ** GOTO lbl72
                throw null;
            }
lbl91:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)g.bjom("bjps", bjoj(int ), (int)19);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl96:
            // 4 sources

            case 8: {
                var5_2 /* !! */  = (int)g.bjom("bjpt", bjoj(int ), (int)20);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 9: {
                var5_2 /* !! */  = (int)g.bjom("bjpu", bjoj(int ), (int)21);
                if (!var6_1) ** GOTO lbl96
                throw null;
            }
            case 10: {
                var5_2 /* !! */  = (int)g.bjom("bjpv", bjoj(int ), (int)22);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl110:
            // 4 sources

            case 11: {
                do {
                    var5_2 /* !! */  = (int)g.bjom("bjpw", bjoj(int ), (int)23);
                } while (!var6_1);
                throw null;
            }
            case 12: {
                var5_2 /* !! */  = (int)g.bjom("bjpx", bjoj(int ), (int)24);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
lbl119:
            // 4 sources

            case 13: {
                var5_2 /* !! */  = (int)g.bjom("bjpy", bjoj(int ), (int)25);
                if (!var6_1) ** GOTO lbl67
                throw null;
            }
lbl123:
            // 3 sources

            case 14: {
                var5_2 /* !! */  = (int)g.bjom("bjpz", bjoj(int ), (int)26);
                if (!var6_1) ** GOTO lbl76
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)g.bjom("bjqa", bjoj(int ), (int)27);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 16: {
                var5_2 /* !! */  = (int)g.bjom("bjqb", bjoj(int ), (int)28);
                if (!var6_1) ** GOTO lbl81
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)g.bjom("bjqc", bjoj(int ), (int)29);
                if (!var6_1) ** GOTO lbl119
                throw null;
            }
lbl140:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)g.bjom("bjqd", bjoj(int ), (int)30);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 19: {
                var5_2 /* !! */  = (int)g.bjom("bjqe", bjoj(int ), (int)31);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl150:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)g.bjom("bjqf", bjoj(int ), (int)32);
                if (!var6_1) ** GOTO lbl81
                throw null;
            }
            case 21: {
                var5_2 /* !! */  = (int)g.bjom("bjqg", bjoj(int ), (int)33);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl159:
            // 2 sources

            case 22: {
                var5_2 /* !! */  = (int)g.bjom("bjqh", bjoj(int ), (int)34);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl164:
            // 2 sources

            case 23: {
                do {
                    var5_2 /* !! */  = (int)g.bjom("bjqi", bjoj(int ), (int)35);
                } while (!var6_1);
                throw null;
            }
            case 24: {
                var5_2 /* !! */  = (int)g.bjom("bjqj", bjoj(int ), (int)36);
                if (!var6_1) ** GOTO lbl91
                throw null;
            }
lbl173:
            // 2 sources

            case 25: {
                var5_2 /* !! */  = (int)g.bjom("bjqk", bjoj(int ), (int)37);
                if (!var6_1) ** GOTO lbl119
                throw null;
            }
            case 26: {
                var5_2 /* !! */  = (int)g.bjom("bjql", bjoj(int ), (int)38);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl182:
            // 3 sources

            case 27: {
                var5_2 /* !! */  = (int)g.bjom("bjqm", bjoj(int ), (int)39);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl187:
            // 2 sources

            case 28: {
                var5_2 /* !! */  = (int)g.bjom("bjqn", bjoj(int ), (int)40);
                if (!var6_1) ** GOTO lbl96
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)g.bjom("bjqo", bjoj(int ), (int)41);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl196:
            // 3 sources

            case 30: {
                var5_2 /* !! */  = (int)g.bjom("bkpp", bjoj(int ), (int)42);
                if (!var6_1) ** GOTO lbl123
                throw null;
            }
            case 31: {
                var5_2 /* !! */  = (int)g.bjom("bkpr", bjoj(int ), (int)43);
                if (!var6_1) ** GOTO lbl119
                throw null;
            }
lbl204:
            // 3 sources

            case 32: {
                var5_2 /* !! */  = (int)g.bjom("bkpu", bjoj(int ), (int)44);
                if (!var6_1) ** GOTO lbl140
                throw null;
            }
lbl208:
            // 3 sources

            case 33: {
                var5_2 /* !! */  = (int)g.bjom("bkpy", bjoj(int ), (int)45);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl213:
            // 4 sources

            case 34: {
                var5_2 /* !! */  = (int)g.bjom("bkqa", bjoj(int ), (int)46);
                if (!var6_1) ** GOTO lbl123
                throw null;
            }
lbl217:
            // 2 sources

            case 35: {
                var5_2 /* !! */  = (int)g.bjom("bkqc", bjoj(int ), (int)47);
                if (!var6_1) ** GOTO lbl213
                throw null;
            }
            case 36: {
                var5_2 /* !! */  = (int)g.bjom("bkqf", bjoj(int ), (int)48);
                if (!var6_1) ** GOTO lbl150
                throw null;
            }
lbl225:
            // 3 sources

            case 37: {
                var5_2 /* !! */  = (int)g.bjom("bkqi", bjoj(int ), (int)49);
                if (!var6_1) ** GOTO lbl204
                throw null;
            }
lbl229:
            // 3 sources

            case 38: {
                var5_2 /* !! */  = (int)g.bjom("bkqk", bjoj(int ), (int)50);
                if (!var6_1) ** GOTO lbl196
                throw null;
            }
            case 39: {
                var5_2 /* !! */  = (int)g.bjom("bkqm", bjoj(int ), (int)51);
                if (!var6_1) ** GOTO lbl213
                throw null;
            }
lbl237:
            // 3 sources

            case 40: {
                var5_2 /* !! */  = (int)g.bjom("bkqq", bjoj(int ), (int)52);
                if (!var6_1) ** GOTO lbl229
                throw null;
            }
            case 41: {
                var5_2 /* !! */  = (int)g.bjom("bkqt", bjoj(int ), (int)53);
                if (!var6_1) ** GOTO lbl237
                throw null;
            }
            case 42: {
                var5_2 /* !! */  = (int)g.bjom("bkra", bjoj(int ), (int)54);
                if (!var6_1) ** GOTO lbl159
                throw null;
            }
            case 43: {
                var5_2 /* !! */  = (int)g.bjom("bkrd", bjoj(int ), (int)55);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
lbl253:
            // 2 sources

            case 44: {
                var5_2 /* !! */  = (int)g.bjom("bkrf", bjoj(int ), (int)56);
                if (!var6_1) ** GOTO lbl173
                throw null;
            }
lbl257:
            // 2 sources

            case 45: {
                var5_2 /* !! */  = (int)g.bjom("bkri", bjoj(int ), (int)57);
                if (!var6_1) ** GOTO lbl96
                throw null;
            }
            case 46: {
                var5_2 /* !! */  = (int)g.bjom("bkrj", bjoj(int ), (int)58);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
            case 47: 
        }
        var5_2 /* !! */  = (int)g.bjom("bkrk", bjoj(int ), (int)59);
        ** while (!var6_1)
lbl268:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blpj() {
        g.bjou[100] = 8849055393391571428L;
        g.bjou[101] = 8338728364555059186L;
        g.bjou[102] = -8920408091984896409L;
        g.bjou[103] = 2661774233485189462L;
        g.bjou[104] = -4859757850015053996L;
        g.bjou[105] = -1370635950672203416L;
        g.bjou[106] = 150787252581146889L;
        g.bjou[107] = -7921497056334384407L;
        g.bjou[108] = -2533983909560743837L;
        g.bjou[109] = 5892778688439162864L;
        g.bjou[110] = 3921953827015172439L;
        g.bjou[111] = -129180932731579776L;
        g.bjou[112] = 2647261060099512381L;
        g.bjou[113] = 8889894631396679391L;
        g.bjou[114] = -7994641356706642422L;
        g.bjou[115] = 8461286794167124476L;
        g.bjou[116] = -7862339557700031708L;
        g.bjou[117] = -5658077671537032665L;
        g.bjou[118] = 6279040740351426278L;
        g.bjou[119] = -5598257075227872262L;
        g.bjou[120] = 3132299812387820710L;
        g.bjou[121] = 6493262992733524705L;
        g.bjou[122] = -4736118218808221652L;
        g.bjou[123] = -4732938553765275282L;
        g.bjou[124] = -5398883422930352854L;
        g.bjou[125] = -4416436341058130811L;
        g.bjou[126] = -8604156902350058413L;
        g.bjou[127] = -3763845236187753031L;
        g.bjou[128] = -4203725578610700268L;
        g.bjou[129] = 8434798805618760214L;
        g.bjou[130] = -1966241585702315497L;
        g.bjou[131] = 8403217618671172520L;
        g.bjou[132] = -4012962371581822953L;
        g.bjou[133] = -8044599645865050860L;
        g.bjou[134] = -3623517040862434847L;
        g.bjou[135] = 5684604963061683041L;
        g.bjou[136] = -7082860160794884584L;
        g.bjou[137] = -6960438866868240965L;
        g.bjou[138] = 6118380526308868782L;
        g.bjou[139] = -751872220874662230L;
        g.bjou[140] = 6809284476718737007L;
        g.bjou[141] = 8128185861569015615L;
        g.bjou[142] = 2652593665061613832L;
        g.bjou[143] = -365275666233983000L;
        g.bjou[144] = 3416833974452845218L;
        g.bjou[145] = -3282902672628453961L;
        g.bjou[146] = -3707095978158854815L;
        g.bjou[147] = 3076346502795027260L;
        g.bjou[148] = 2486358880801715959L;
        g.bjou[149] = 6676012619047548079L;
        g.bjou[150] = -2956188723690790943L;
        g.bjou[151] = 4305703278133345556L;
        g.bjou[152] = 6511791056534219580L;
        g.bjou[153] = 2145041851580217590L;
        g.bjou[154] = 8858162102541755797L;
        g.bjou[155] = -4976682428142454805L;
        g.bjou[156] = -5676932729071700819L;
        g.bjou[157] = -355200784675070059L;
        g.bjou[158] = -5907585670999501940L;
        g.bjou[159] = -9210895470141062271L;
        g.bjou[160] = -7906000512655881241L;
        g.bjou[161] = 3022544805001359636L;
        g.bjou[162] = -5726828127334481818L;
        g.bjou[163] = -4474237418493483204L;
        g.bjou[164] = -4262303172824950666L;
        g.bjou[165] = 6720820817401346883L;
        g.bjou[166] = 4755704312878649705L;
        g.bjou[167] = -5923732382368942111L;
        g.bjou[168] = 8580322010654576607L;
        g.bjou[169] = 5399030689708273843L;
        g.bjou[170] = 7586966274824165334L;
        g.bjou[171] = 3834662777827188853L;
        g.bjou[172] = -7019564149281464225L;
        g.bjou[173] = -4235796501880102044L;
        g.bjou[174] = 6650261887299119879L;
        g.bjou[175] = -7426205416957870474L;
        g.bjou[176] = 4470980646888388980L;
        g.bjou[177] = -1050758273327687013L;
        g.bjou[178] = 8570489088896404706L;
        g.bjou[179] = 2537493180941371002L;
        g.bjou[180] = 2805098058065789475L;
        g.bjou[181] = 4801592163588353565L;
        g.bjou[182] = -193051417197195105L;
        g.bjou[183] = -8251629533632686150L;
        g.bjou[184] = -509341508745996356L;
    }

    private static /* synthetic */ void blpk() {
        g.bjov[0] = 6019683104562373399L;
        g.bjov[1] = -7496958631302224687L;
        g.bjov[2] = -3648544630062501763L;
        g.bjov[3] = -2714164662174962217L;
        g.bjov[4] = 7762948227617855606L;
        g.bjov[5] = -5206479058445292067L;
        g.bjov[6] = 4253823910947752990L;
        g.bjov[7] = 5048007638557839024L;
        g.bjov[8] = -8163901179542034523L;
        g.bjov[9] = -7968136583921703497L;
        g.bjov[10] = 7276124348083463024L;
        g.bjov[11] = 5819273939405977361L;
        g.bjov[12] = -6619078022542382641L;
        g.bjov[13] = -3369011105284279851L;
        g.bjov[14] = 7320350893669464894L;
        g.bjov[15] = 2970603748827527465L;
        g.bjov[16] = 4505468825826343368L;
        g.bjov[17] = -7874679600645409865L;
        g.bjov[18] = 4321758513433495894L;
        g.bjov[19] = 1356118673496002282L;
        g.bjov[20] = -7405813760928904137L;
        g.bjov[21] = 7582497311810447202L;
        g.bjov[22] = 5987124398237545176L;
        g.bjov[23] = -5413462532636361939L;
        g.bjov[24] = -4724342779743007638L;
        g.bjov[25] = 1410316772209502366L;
        g.bjov[26] = -6684153175052489247L;
        g.bjov[27] = 1488837171630604145L;
        g.bjov[28] = -2794237605124414288L;
        g.bjov[29] = -6009455294217867846L;
        g.bjov[30] = -8232645159961687634L;
        g.bjov[31] = 4326113802154894808L;
        g.bjov[32] = 4772932733284887810L;
        g.bjov[33] = 3840123958416832287L;
        g.bjov[34] = 8931482286950798479L;
        g.bjov[35] = 7022859483477226219L;
        g.bjov[36] = -4120230219594572266L;
        g.bjov[37] = -6001352212108018798L;
        g.bjov[38] = 2478950141434243557L;
        g.bjov[39] = 6639503648191083414L;
        g.bjov[40] = -914289278610044689L;
        g.bjov[41] = -2381688997313226454L;
        g.bjov[42] = 2679955241695898297L;
        g.bjov[43] = 7073266499251178432L;
        g.bjov[44] = 3875862187770451515L;
        g.bjov[45] = -3378549895680424192L;
        g.bjov[46] = -2293320253605414003L;
        g.bjov[47] = 8348675910842047085L;
        g.bjov[48] = 7348758975658442386L;
        g.bjov[49] = 5057129636707032488L;
        g.bjov[50] = 7200196340861192910L;
        g.bjov[51] = 2368221995153661206L;
        g.bjov[52] = 3452702384099989324L;
        g.bjov[53] = -1342153688397638144L;
        g.bjov[54] = -4174924692858023058L;
        g.bjov[55] = 3107994193414567419L;
        g.bjov[56] = -7725686958316720331L;
        g.bjov[57] = -5387940824774180850L;
        g.bjov[58] = -462717097604176387L;
        g.bjov[59] = 2084796958043784320L;
        g.bjov[60] = 6377440123971869127L;
        g.bjov[61] = 2191028976239925268L;
        g.bjov[62] = 3812052694016821106L;
        g.bjov[63] = -1681271635126328160L;
        g.bjov[64] = 2557191718610852284L;
        g.bjov[65] = -7127263845477604845L;
        g.bjov[66] = -1975064539721077988L;
        g.bjov[67] = -7431479935834967684L;
        g.bjov[68] = 6699736102557462711L;
        g.bjov[69] = 2186142331491625086L;
        g.bjov[70] = 2299850193403437416L;
        g.bjov[71] = 2844503507562537996L;
        g.bjov[72] = 9180914594199396574L;
        g.bjov[73] = 4081028617202590783L;
        g.bjov[74] = 5524547164438262162L;
        g.bjov[75] = 6037893164859642217L;
        g.bjov[76] = 682640658568647158L;
        g.bjov[77] = 6325191635593680441L;
        g.bjov[78] = -5032991320011907458L;
        g.bjov[79] = -6274102062413709592L;
        g.bjov[80] = -4853328045450926274L;
        g.bjov[81] = 879011529411156903L;
        g.bjov[82] = 112228754096539278L;
        g.bjov[83] = -906073094105868437L;
        g.bjov[84] = -6725216269280809537L;
        g.bjov[85] = 8603511865192244382L;
        g.bjov[86] = 5398567938279750472L;
        g.bjov[87] = -3643090332501397949L;
        g.bjov[88] = -972989355528022122L;
        g.bjov[89] = 2440131208903077416L;
        g.bjov[90] = 4189866504762626707L;
        g.bjov[91] = 2323540733783862625L;
        g.bjov[92] = 7116958422096159197L;
        g.bjov[93] = 8650215288201041711L;
        g.bjov[94] = 1403740823628289248L;
        g.bjov[95] = 7808464590108213950L;
        g.bjov[96] = -5002727654920265159L;
        g.bjov[97] = -7413298162538649678L;
        g.bjov[98] = 5923954540613076331L;
        g.bjov[99] = 7805787434544249482L;
    }

    private static /* synthetic */ void blpi() {
        g.bjou[0] = -7594681915952032817L;
        g.bjou[1] = 2617588573460143772L;
        g.bjou[2] = 4033682872708064103L;
        g.bjou[3] = -5171983287602518813L;
        g.bjou[4] = -7307072855443555405L;
        g.bjou[5] = -940451277537628429L;
        g.bjou[6] = 958739217872894530L;
        g.bjou[7] = 7262797435947996975L;
        g.bjou[8] = -8483874000073972159L;
        g.bjou[9] = 2813103841764791216L;
        g.bjou[10] = 8902460802177209535L;
        g.bjou[11] = 4360517452437830366L;
        g.bjou[12] = -5046712425310156310L;
        g.bjou[13] = -4954437265240121169L;
        g.bjou[14] = -8547545098529982589L;
        g.bjou[15] = -2857520451634527463L;
        g.bjou[16] = 5542431474046020240L;
        g.bjou[17] = 6933000646309024135L;
        g.bjou[18] = -7309634862771463762L;
        g.bjou[19] = -2341821407301948155L;
        g.bjou[20] = 8159529886606355573L;
        g.bjou[21] = 1690082065744851828L;
        g.bjou[22] = 4253200180867934320L;
        g.bjou[23] = -192276412140862036L;
        g.bjou[24] = 5215915593616249066L;
        g.bjou[25] = 8342395607665737813L;
        g.bjou[26] = -6648479236968371202L;
        g.bjou[27] = 3472479987775341724L;
        g.bjou[28] = -9055237417137532600L;
        g.bjou[29] = 675555199432601525L;
        g.bjou[30] = 8643619555903590654L;
        g.bjou[31] = 3712632708973578209L;
        g.bjou[32] = -5936143947733188342L;
        g.bjou[33] = -7432470961715557467L;
        g.bjou[34] = -2298069658216654018L;
        g.bjou[35] = 8555448416837702224L;
        g.bjou[36] = -6469068502960426009L;
        g.bjou[37] = -4625936095556969891L;
        g.bjou[38] = -2635465622071334985L;
        g.bjou[39] = -4011479568812898793L;
        g.bjou[40] = -5750830803941887922L;
        g.bjou[41] = 2453373282438392914L;
        g.bjou[42] = -9007428097310859626L;
        g.bjou[43] = 6489661990311768534L;
        g.bjou[44] = -6474093721114098025L;
        g.bjou[45] = -8117017912248360638L;
        g.bjou[46] = -3207475931902728173L;
        g.bjou[47] = 5068088494703866531L;
        g.bjou[48] = -4466053182397231634L;
        g.bjou[49] = -892144679977615822L;
        g.bjou[50] = 577876971962159029L;
        g.bjou[51] = 6566671345818609458L;
        g.bjou[52] = -6479833930464901477L;
        g.bjou[53] = 8219190631446472591L;
        g.bjou[54] = 7974772811009717916L;
        g.bjou[55] = 8041804478342113906L;
        g.bjou[56] = -8164109782454776817L;
        g.bjou[57] = 3541129897969836009L;
        g.bjou[58] = 180021587066838558L;
        g.bjou[59] = -5239894999539814537L;
        g.bjou[60] = 8747787830695436481L;
        g.bjou[61] = 5031492066250730319L;
        g.bjou[62] = -6152168135738625438L;
        g.bjou[63] = 4214243689581928322L;
        g.bjou[64] = 6311955076166701952L;
        g.bjou[65] = -6964434466716682734L;
        g.bjou[66] = 5751057916789242760L;
        g.bjou[67] = -3012885616114005756L;
        g.bjou[68] = -2222414746667362806L;
        g.bjou[69] = -185562541395378337L;
        g.bjou[70] = -7730623059350861500L;
        g.bjou[71] = -1373564745598859149L;
        g.bjou[72] = -2861181677447574203L;
        g.bjou[73] = 276555006576435263L;
        g.bjou[74] = 5732806176285082104L;
        g.bjou[75] = -479464535124921055L;
        g.bjou[76] = -5414467069375014140L;
        g.bjou[77] = 1396768830091335594L;
        g.bjou[78] = 8899796837191141472L;
        g.bjou[79] = 6074935150700021136L;
        g.bjou[80] = -2961285130989696423L;
        g.bjou[81] = -4275411116160684741L;
        g.bjou[82] = -5125007802948287594L;
        g.bjou[83] = -2582070729414950225L;
        g.bjou[84] = 4109365632652597930L;
        g.bjou[85] = -4319436706273071089L;
        g.bjou[86] = -2660704326514988111L;
        g.bjou[87] = 6237910152663184123L;
        g.bjou[88] = 8725806383943329136L;
        g.bjou[89] = 7205616696550793220L;
        g.bjou[90] = -185464810186143303L;
        g.bjou[91] = -1547168409845128602L;
        g.bjou[92] = 9124294985334839873L;
        g.bjou[93] = 2833755636302010354L;
        g.bjou[94] = 5772108756905350629L;
        g.bjou[95] = 4125147682735220060L;
        g.bjou[96] = 7750766139025296454L;
        g.bjou[97] = -5497130013633052980L;
        g.bjou[98] = 6203322143737092258L;
        g.bjou[99] = -8951540483994754010L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static g getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bjow", bjot(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == g.bjom("bjox", bjoj(int ), (int)6)) break;
            v0 /* !! */  = (long)g.bjom("bjoy", bjoj(int ), (int)7);
        }
        var2 = g.c;
        v1 /* !! */  = g.dm;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - g.bjom("bjoz", bjot(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1710000460: {
                    v2 = g.bjom("bjpa", bjot(int ), (int)2);
                    continue block15;
                }
                case 1048613931: {
                    break block15;
                }
                case 1583785105: {
                    v2 = g.bjom("bjpb", bjot(int ), (int)3);
                    continue block15;
                }
                case 1774556362: {
                    v2 = g.bjom("bjpc", bjot(int ), (int)4);
                    continue block15;
                }
            }
            break;
        }
        var1_1 = g.b;
        v3 /* !! */  = g.dm;
        if (true) ** GOTO lbl29
        block16: while (true) {
            v3 /* !! */  = (long)(g.bjom("bjpe", bjot(int ), (int)6) - g.bjom("bjpd", bjot(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 114772991: {
                    continue block16;
                }
                case 1048613931: {
                    break block16;
                }
            }
            break;
        }
        var0_2 = g.a;
        if (var2) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl40:
        // 1 sources

        v4 /* !! */  = g.dm;
        if (true) ** GOTO lbl44
        block18: while (true) {
            v4 /* !! */  = (long)(g.bjom("bjpg", bjot(int ), (int)8) - g.bjom("bjpf", bjot(int ), (int)7));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1141036487: {
                    continue block18;
                }
                case 1048613931: {
                    break block18;
                }
            }
            break;
        }
        return g.instance;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTabComplete(de var1_1) {
        block111: {
            block110: {
                v0 /* !! */  = g.dm;
                if (true) ** GOTO lbl5
                block66: while (true) {
                    v0 /* !! */  = (long)(v1 - g.bjom("blbk", bjot(int ), (int)77));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1745019759: {
                            v1 = g.bjom("blbl", bjot(int ), (int)78);
                            continue block66;
                        }
                        case 1048613931: {
                            break block66;
                        }
                        case 1108582329: {
                            v1 = g.bjom("blbm", bjot(int ), (int)79);
                            continue block66;
                        }
                        case 1910097848: {
                            v1 = g.bjom("blbn", bjot(int ), (int)80);
                            continue block66;
                        }
                    }
                    break;
                }
                var8_2 = g.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("blbo", bjot(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == g.bjom("blbp", bjoj(int ), (int)153)) break;
                    v2 /* !! */  = (long)g.bjom("blbq", bjoj(int ), (int)154);
                }
                var7_3 /* !! */  = g.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("blbr", bjot(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == g.bjom("blbs", bjoj(int ), (int)155)) break;
                    v3 /* !! */  = (long)g.bjom("blbt", bjoj(int ), (int)156);
                }
                var6_4 = g.a;
                if (var8_2) {
                    throw null;
lbl32:
                    // 13 sources

                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl32
                v4 /* !! */  = g.dm;
                if (true) ** GOTO lbl39
                block70: while (true) {
                    v4 /* !! */  = (long)(v5 - g.bjom("blbv", bjot(int ), (int)83));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1560194300: {
                            v5 = g.bjom("blbw", bjot(int ), (int)84);
                            continue block70;
                        }
                        case -85927809: {
                            v5 = g.bjom("blbx", bjot(int ), (int)85);
                            continue block70;
                        }
                        case 1048613931: {
                            break block70;
                        }
                        case 2024242551: {
                            v5 = g.bjom("blby", bjot(int ), (int)86);
                            continue block70;
                        }
                    }
                    break;
                }
                if (!fl.isUnhooked()) break block110;
                if (var6_4 || var6_4) ** GOTO lbl32
                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl32
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("blbz", bjot(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == g.bjom("blca", bjoj(int ), (int)157)) break;
                v6 /* !! */  = (long)g.bjom("blcb", bjoj(int ), (int)158);
            }
            var2_5 = var1_1.prefix;
            if (var6_4 || var6_4) ** GOTO lbl32
            v7 /* !! */  = g.dm;
            if (true) ** GOTO lbl67
            block72: while (true) {
                v7 /* !! */  = (long)(g.bjom("blcd", bjot(int ), (int)89) - g.bjom("blcc", bjot(int ), (int)88));
lbl67:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 1048613931: {
                        break block72;
                    }
                    case 2023656967: {
                        continue block72;
                    }
                }
                break;
            }
            v8 /* !! */  = g.dm;
            if (true) ** GOTO lbl76
            block73: while (true) {
                v8 /* !! */  = (long)(v9 - g.bjom("blce", bjot(int ), (int)90));
lbl76:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1779598727: {
                        v9 = g.bjom("blcg", bjot(int ), (int)91);
                        continue block73;
                    }
                    case -1396220268: {
                        v9 = g.bjom("blch", bjot(int ), (int)92);
                        continue block73;
                    }
                    case 1048613931: {
                        break block73;
                    }
                    case 1977437946: {
                        v9 = g.bjom("blci", bjot(int ), (int)93);
                        continue block73;
                    }
                }
                break;
            }
            if (var2_5.startsWith(this.prefix)) break block111;
            if (var6_4 || var6_4) ** GOTO lbl32
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl32
        v10 /* !! */  = g.dm;
        if (true) ** GOTO lbl97
        block74: while (true) {
            v10 /* !! */  = (long)(v11 - g.bjom("blcj", bjot(int ), (int)94));
lbl97:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1531065011: {
                    v11 = g.bjom("blcl", bjot(int ), (int)95);
                    continue block74;
                }
                case -619727043: {
                    v11 = g.bjom("blcm", bjot(int ), (int)96);
                    continue block74;
                }
                case 1048613931: {
                    break block74;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = g.dm - g.bjom("blcn", bjot(int ), (int)97)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == g.bjom("blco", bjoj(int ), (int)159)) break;
            v12 /* !! */  = (long)g.bjom("blcp", bjoj(int ), (int)160);
        }
        v13 = this.prefix.length();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = g.dm - g.bjom("blcq", bjot(int ), (int)98)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == g.bjom("blcr", bjoj(int ), (int)161)) break;
            v14 /* !! */  = (long)g.bjom("blcs", bjoj(int ), (int)162);
        }
        var3_6 = var2_5.substring(v13);
        if (var6_4 || var6_4) ** GOTO lbl32
        v15 /* !! */  = g.dm;
        if (true) ** GOTO lbl123
        block77: while (true) {
            v15 /* !! */  = (long)(g.bjom("blcu", bjot(int ), (int)100) - g.bjom("blct", bjot(int ), (int)99));
lbl123:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case 454268132: {
                    continue block77;
                }
                case 1048613931: {
                    break block77;
                }
            }
            break;
        }
        var4_7 = this.tabComplete(var3_6);
        if (var6_4 || var6_4) ** GOTO lbl32
        v16 = g.bjom("blcv", bjoj(int ), (int)163);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = g.dm - g.bjom("blcw", bjot(int ), (int)101)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == g.bjom("blcx", bjoj(int ), (int)164)) break;
            v17 /* !! */  = (long)g.bjom("blcz", bjoj(int ), (int)165);
        }
        var5_8 = var3_6.split(" ", (int)v16);
        if (var6_4 || var6_4) ** GOTO lbl32
        if (var5_8.length > g.bjom("blda", bjoj(int ), (int)166)) ** GOTO lbl156
        if (var6_4 || var6_4) ** GOTO lbl32
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = g.dm - g.bjom("bldb", bjot(int ), (int)102)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == g.bjom("bldc", bjoj(int ), (int)167)) break;
            v18 /* !! */  = (long)g.bjom("bldd", bjoj(int ), (int)168);
        }
        v19 = (Function<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$onTabComplete$1(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)((g)this);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_7 = g.dm - g.bjom("blde", bjot(int ), (int)103)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == g.bjom("bldf", bjoj(int ), (int)169)) break;
            v20 /* !! */  = (long)g.bjom("bldg", bjoj(int ), (int)170);
        }
        var4_7 = var4_7.map(v19);
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl32
lbl156:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl32
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = g.dm - g.bjom("bldh", bjot(int ), (int)104)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == g.bjom("bldi", bjoj(int ), (int)171)) break;
                    v21 /* !! */  = (long)g.bjom("bldj", bjoj(int ), (int)172);
                }
                v22 = (IntFunction<String[]>)LambdaMetafactory.metafactory(null, null, null, (I)Ljava/lang/Object;, lambda$onTabComplete$2(int ), (I)[Ljava/lang/String;)();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_9 = g.dm - g.bjom("bldk", bjot(int ), (int)105)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == g.bjom("bldl", bjoj(int ), (int)173)) break;
                    v23 /* !! */  = (long)g.bjom("bldm", bjoj(int ), (int)174);
                }
                v24 = (String[])var4_7.toArray(v22);
                v25 /* !! */  = g.dm;
                if (true) ** GOTO lbl173
                block83: while (true) {
                    v25 /* !! */  = (long)(v26 - g.bjom("bldo", bjot(int ), (int)106));
lbl173:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1453686748: {
                            v26 = g.bjom("bldp", bjot(int ), (int)107);
                            continue block83;
                        }
                        case -58356519: {
                            v26 = g.bjom("bldq", bjot(int ), (int)108);
                            continue block83;
                        }
                        case 1048613931: {
                            break block83;
                        }
                    }
                    break;
                }
                var1_1.completions = v24;
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)g.bjom("blds", bjoj(int ), (int)175);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl191:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)g.bjom("bldt", bjoj(int ), (int)176);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 2: {
                var7_3 /* !! */  = (int)g.bjom("bldu", bjoj(int ), (int)177);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl201:
            // 3 sources

            case 3: {
                var7_3 /* !! */  = (int)g.bjom("bldv", bjoj(int ), (int)178);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl206:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)g.bjom("bldw", bjoj(int ), (int)179);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 5: {
                var7_3 /* !! */  = (int)g.bjom("bldx", bjoj(int ), (int)180);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 6: {
                var7_3 /* !! */  = (int)g.bjom("bldy", bjoj(int ), (int)181);
                if (!var8_2) ** GOTO lbl201
                throw null;
            }
            case 7: {
                var7_3 /* !! */  = (int)g.bjom("bldz", bjoj(int ), (int)182);
                if (!var8_2) break;
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)g.bjom("blea", bjoj(int ), (int)183);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)g.bjom("bleb", bjoj(int ), (int)184);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl279
                    break;
                }
            }
            case 10: {
                var7_3 /* !! */  = (int)g.bjom("blec", bjoj(int ), (int)185);
                if (!var8_2) ** GOTO lbl206
                throw null;
            }
lbl239:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)g.bjom("bled", bjoj(int ), (int)186);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl244:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)g.bjom("blee", bjoj(int ), (int)187);
                if (var8_2) {
                    throw null;
                }
            }
lbl248:
            // 5 sources

            case 13: {
                var7_3 /* !! */  = (int)g.bjom("blef", bjoj(int ), (int)188);
                if (!var8_2) ** GOTO lbl201
                throw null;
            }
lbl252:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)g.bjom("bleh", bjoj(int ), (int)189);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl257:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)g.bjom("blei", bjoj(int ), (int)190);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl262:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)g.bjom("blej", bjoj(int ), (int)191);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl267:
            // 3 sources

            case 17: {
                var7_3 /* !! */  = (int)g.bjom("blek", bjoj(int ), (int)192);
                if (var8_2) {
                    throw null;
                }
            }
lbl271:
            // 4 sources

            case 18: {
                var7_3 /* !! */  = (int)g.bjom("blel", bjoj(int ), (int)193);
                if (!var8_2) ** GOTO lbl257
                throw null;
            }
lbl275:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)g.bjom("blem", bjoj(int ), (int)194);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
lbl279:
            // 3 sources

            case 20: {
                var7_3 /* !! */  = (int)g.bjom("blen", bjoj(int ), (int)195);
                if (!var8_2) ** GOTO lbl271
                throw null;
            }
lbl283:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)g.bjom("bleo", bjoj(int ), (int)196);
                if (!var8_2) ** GOTO lbl267
                throw null;
            }
lbl287:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)g.bjom("blep", bjoj(int ), (int)197);
                if (!var8_2) ** GOTO lbl267
                throw null;
            }
lbl291:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)g.bjom("bleq", bjoj(int ), (int)198);
                if (!var8_2) ** GOTO lbl239
                throw null;
            }
lbl295:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)g.bjom("bles", bjoj(int ), (int)199);
                if (!var8_2) ** GOTO lbl275
                throw null;
            }
lbl299:
            // 3 sources

            case 25: {
                var7_3 /* !! */  = (int)g.bjom("blet", bjoj(int ), (int)200);
                if (!var8_2) ** GOTO lbl248
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)g.bjom("bleu", bjoj(int ), (int)201);
                if (!var8_2) ** GOTO lbl287
                throw null;
            }
            case 27: 
        }
        var7_3 /* !! */  = (int)g.bjom("blev", bjoj(int ), (int)202);
        ** while (!var8_2)
lbl310:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public g() {
        var2_1 /* !! */  = g.b;
        super();
        g.instance = this;
        this.commands = new CopyOnWriteArrayList<f>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.prefix = am.getInstance().getPrefix();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)g.bjom("bjon", bjoj(int ), (int)0);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)g.bjom("bjoo", bjoj(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)g.bjom("bjop", bjoj(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)g.bjom("bjoq", bjoj(int ), (int)3);
                break;
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)g.bjom("bjor", bjoj(int ), (int)4);
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)g.bjom("bjos", bjoj(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ void blpl() {
        g.bjov[100] = -5330431210682687682L;
        g.bjov[101] = 6937461747862952450L;
        g.bjov[102] = -443195635808136305L;
        g.bjov[103] = 877347625096873980L;
        g.bjov[104] = 6815072895160733533L;
        g.bjov[105] = -303989716379998768L;
        g.bjov[106] = -7919255395481968285L;
        g.bjov[107] = 5391581130154841119L;
        g.bjov[108] = -8074769469978560770L;
        g.bjov[109] = 80263662729321646L;
        g.bjov[110] = -1280664042687173917L;
        g.bjov[111] = 5648777894407651036L;
        g.bjov[112] = -8197800003696355901L;
        g.bjov[113] = -3076625032513413521L;
        g.bjov[114] = 2476447884977220595L;
        g.bjov[115] = 800517902057350357L;
        g.bjov[116] = 9211874733375165276L;
        g.bjov[117] = 8574095398084314642L;
        g.bjov[118] = 7313372865741821044L;
        g.bjov[119] = -3297431127264916922L;
        g.bjov[120] = 2135093334108808436L;
        g.bjov[121] = 5775204033440013519L;
        g.bjov[122] = 148416861298411787L;
        g.bjov[123] = -7829164943288678436L;
        g.bjov[124] = 4456205370398011328L;
        g.bjov[125] = -8345444362821658052L;
        g.bjov[126] = 3821789526239660629L;
        g.bjov[127] = 6134028560549854121L;
        g.bjov[128] = -5945076361826599393L;
        g.bjov[129] = 2760043748488779812L;
        g.bjov[130] = -408423100068441975L;
        g.bjov[131] = 3229506209864505018L;
        g.bjov[132] = -66097856605509984L;
        g.bjov[133] = 6096215320988579943L;
        g.bjov[134] = -2624475133829606519L;
        g.bjov[135] = -4376914632654228596L;
        g.bjov[136] = -9131831448065374400L;
        g.bjov[137] = 2324828218022086327L;
        g.bjov[138] = 7632026308789648687L;
        g.bjov[139] = -3520268578487185950L;
        g.bjov[140] = -1364477961655943631L;
        g.bjov[141] = -3762529508428565839L;
        g.bjov[142] = 6235093124385797654L;
        g.bjov[143] = 7106823818492974213L;
        g.bjov[144] = -5077526283462721844L;
        g.bjov[145] = 6347806613741232012L;
        g.bjov[146] = -7142140577555550843L;
        g.bjov[147] = -6174793267268425757L;
        g.bjov[148] = 1031936693490040158L;
        g.bjov[149] = -5528415449996665975L;
        g.bjov[150] = 4522963042934424992L;
        g.bjov[151] = -8809392932736017933L;
        g.bjov[152] = 1108440086671322020L;
        g.bjov[153] = 4087611758531134775L;
        g.bjov[154] = -509311345691141887L;
        g.bjov[155] = 1380597313747117526L;
        g.bjov[156] = -1731928235701375140L;
        g.bjov[157] = 3637196160281060859L;
        g.bjov[158] = 4215127808684188846L;
        g.bjov[159] = 5887527269874717331L;
        g.bjov[160] = -604010965305005934L;
        g.bjov[161] = -5312492034932181448L;
        g.bjov[162] = 797135990140530810L;
        g.bjov[163] = 5706346379152662571L;
        g.bjov[164] = -907083659899089545L;
        g.bjov[165] = 2897542790164904309L;
        g.bjov[166] = 2149057750543315031L;
        g.bjov[167] = -1131894420781787651L;
        g.bjov[168] = 5807803955240392996L;
        g.bjov[169] = -2122884543761064381L;
        g.bjov[170] = -4005129809331712108L;
        g.bjov[171] = 2879101384794262720L;
        g.bjov[172] = 3442462402360708182L;
        g.bjov[173] = 3551780137998095701L;
        g.bjov[174] = -6543056313759659469L;
        g.bjov[175] = -3031905585580882484L;
        g.bjov[176] = -7465789253597478307L;
        g.bjov[177] = -2837128891769585051L;
        g.bjov[178] = -8331543762428970919L;
        g.bjov[179] = -8098671235578347693L;
        g.bjov[180] = -568091644978005963L;
        g.bjov[181] = 1848824809279596188L;
        g.bjov[182] = -6233811329682147795L;
        g.bjov[183] = -5748214124039942771L;
        g.bjov[184] = -3453634070606654075L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onChat(bp var1_1) {
        block67: {
            block66: {
                var6_2 = g.c;
                var5_3 /* !! */  = g.b;
                var4_4 = g.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 15 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!fl.isUnhooked()) break block66;
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!var1_1.isCancelled()) break block67;
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = var1_1.getMessage();
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!var2_5.startsWith(this.prefix)) ** GOTO lbl41
        if (var4_4 || var4_4) ** GOTO lbl6
        var1_1.cancel();
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = var2_5.substring(this.prefix.length());
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!var3_6.trim().isEmpty()) ** GOTO lbl36
                if (var4_4 || var4_4) ** GOTO lbl6
                this.execute("help");
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl36:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.execute(var3_6)) ** GOTO lbl41
                if (var4_4 || var4_4) ** GOTO lbl6
                this.sendError("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u0430\u044f \u043a\u043e\u043c\u0430\u043d\u0434\u0430. \u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 " + this.prefix + "help \u0434\u043b\u044f \u0441\u043f\u0438\u0441\u043a\u0430 \u043a\u043e\u043c\u0430\u043d\u0434.");
                if (var4_4) ** GOTO lbl6
lbl41:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)g.bjom("bkzz", bjoj(int ), (int)120);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 1: {
                var5_3 /* !! */  = (int)g.bjom("blaa", bjoj(int ), (int)121);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 2: {
                var5_3 /* !! */  = (int)g.bjom("blab", bjoj(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 3: {
                var5_3 /* !! */  = (int)g.bjom("blac", bjoj(int ), (int)123);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl64:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)g.bjom("blad", bjoj(int ), (int)124);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl69:
            // 2 sources

            case 5: {
                do {
                    var5_3 /* !! */  = (int)g.bjom("blae", bjoj(int ), (int)125);
                } while (!var6_2);
                throw null;
            }
lbl74:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)g.bjom("blaf", bjoj(int ), (int)126);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 7: {
                var5_3 /* !! */  = (int)g.bjom("blag", bjoj(int ), (int)127);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 8: {
                var5_3 /* !! */  = (int)g.bjom("blai", bjoj(int ), (int)128);
                if (!var6_2) ** GOTO lbl69
                throw null;
            }
lbl88:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)g.bjom("blaj", bjoj(int ), (int)129);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl93:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)g.bjom("blal", bjoj(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 11: {
                var5_3 /* !! */  = (int)g.bjom("blam", bjoj(int ), (int)131);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 12: {
                var5_3 /* !! */  = (int)g.bjom("blan", bjoj(int ), (int)132);
                if (!var6_2) break;
                throw null;
            }
lbl107:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)g.bjom("blao", bjoj(int ), (int)133);
                if (!var6_2) ** GOTO lbl88
                throw null;
            }
lbl111:
            // 4 sources

            case 14: {
                var5_3 /* !! */  = (int)g.bjom("blap", bjoj(int ), (int)134);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl116:
            // 3 sources

            case 15: {
                var5_3 /* !! */  = (int)g.bjom("blaq", bjoj(int ), (int)135);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
lbl120:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)g.bjom("blar", bjoj(int ), (int)136);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl125:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)g.bjom("blas", bjoj(int ), (int)137);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
lbl129:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)g.bjom("blat", bjoj(int ), (int)138);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl134:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)g.bjom("blau", bjoj(int ), (int)139);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)g.bjom("blav", bjoj(int ), (int)140);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
lbl142:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)g.bjom("blaw", bjoj(int ), (int)141);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl147:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)g.bjom("blay", bjoj(int ), (int)142);
                if (!var6_2) ** GOTO lbl93
                throw null;
            }
            case 23: {
                var5_3 /* !! */  = (int)g.bjom("blaz", bjoj(int ), (int)143);
                if (!var6_2) ** GOTO lbl147
                throw null;
            }
            case 24: {
                do {
                    var5_3 /* !! */  = (int)g.bjom("blba", bjoj(int ), (int)144);
                } while (!var6_2);
                throw null;
            }
lbl160:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)g.bjom("blbb", bjoj(int ), (int)145);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl170
                    break;
                }
            }
lbl166:
            // 3 sources

            case 26: {
                var5_3 /* !! */  = (int)g.bjom("blbc", bjoj(int ), (int)146);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
lbl170:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)g.bjom("blbd", bjoj(int ), (int)147);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)g.bjom("blbe", bjoj(int ), (int)148);
                if (!var6_2) ** GOTO lbl147
                throw null;
            }
lbl178:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)g.bjom("blbf", bjoj(int ), (int)149);
                if (!var6_2) ** GOTO lbl74
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)g.bjom("blbg", bjoj(int ), (int)150);
                if (!var6_2) ** GOTO lbl134
                throw null;
            }
lbl186:
            // 3 sources

            case 31: {
                var5_3 /* !! */  = (int)g.bjom("blbh", bjoj(int ), (int)151);
                if (!var6_2) ** GOTO lbl166
                throw null;
            }
            case 32: 
        }
        var5_3 /* !! */  = (int)g.bjom("blbi", bjoj(int ), (int)152);
        ** while (!var6_2)
lbl193:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void sendSuccess(String var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("bljz", bjot(int ), (int)118));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -580270356: {
                    v1 = g.bjom("blka", bjot(int ), (int)119);
                    continue block16;
                }
                case 1048613931: {
                    break block16;
                }
                case 1096174351: {
                    v1 = g.bjom("blkb", bjot(int ), (int)120);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("blkc", bjot(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == g.bjom("blkd", bjoj(int ), (int)327)) break;
            v2 /* !! */  = (long)g.bjom("blke", bjoj(int ), (int)328);
        }
        var3_3 = g.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("blkf", bjot(int ), (int)122)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == g.bjom("blkg", bjoj(int ), (int)329)) break;
            v3 /* !! */  = (long)g.bjom("blkh", bjoj(int ), (int)330);
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("blki", bjot(int ), (int)123)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == g.bjom("blkj", bjoj(int ), (int)331)) break;
            v4 /* !! */  = (long)g.bjom("blkk", bjoj(int ), (int)332);
        }
        v5 = class_2561.method_43470((String)var1_1);
        v6 /* !! */  = g.dm;
        if (true) ** GOTO lbl42
        block21: while (true) {
            v6 /* !! */  = (long)(v7 - g.bjom("blkl", bjot(int ), (int)124));
lbl42:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1313247837: {
                    v7 = g.bjom("blkm", bjot(int ), (int)125);
                    continue block21;
                }
                case -797776861: {
                    v7 = g.bjom("blkn", bjot(int ), (int)126);
                    continue block21;
                }
                case 1048613931: {
                    break block21;
                }
                case 1487713053: {
                    v7 = g.bjom("blko", bjot(int ), (int)127);
                    continue block21;
                }
            }
            break;
        }
        v8 /* !! */  = g.dm;
        if (true) ** GOTO lbl58
        block22: while (true) {
            v8 /* !! */  = (long)(v9 - g.bjom("blkp", bjot(int ), (int)128));
lbl58:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -170338730: {
                    v9 = g.bjom("blkq", bjot(int ), (int)129);
                    continue block22;
                }
                case 329342076: {
                    v9 = g.bjom("blkr", bjot(int ), (int)130);
                    continue block22;
                }
                case 1048613931: {
                    break block22;
                }
            }
            break;
        }
        v10 = v5.method_27692(class_124.field_1060);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = g.dm - g.bjom("blks", bjot(int ), (int)131)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == g.bjom("blkt", bjoj(int ), (int)333)) break;
            v11 /* !! */  = (long)g.bjom("blku", bjoj(int ), (int)334);
        }
        pp.brandmessage((class_2561)v10);
        ** while (var2_4 || var2_4)
lbl75:
        // 1 sources

    }

    private static /* synthetic */ void blpe() {
        g.bjol[0] = 1696071897;
        g.bjol[1] = -1673046481;
        g.bjol[2] = -709512505;
        g.bjol[3] = -1179751400;
        g.bjol[4] = 455588733;
        g.bjol[5] = -1131193094;
        g.bjol[6] = 1396160454;
        g.bjol[7] = 1683731471;
        g.bjol[8] = 1902598551;
        g.bjol[9] = -927435162;
        g.bjol[10] = 638839642;
        g.bjol[11] = -440061289;
        g.bjol[12] = 2037286212;
        g.bjol[13] = 1357707478;
        g.bjol[14] = 233419134;
        g.bjol[15] = -825560974;
        g.bjol[16] = 1267966635;
        g.bjol[17] = -1422234550;
        g.bjol[18] = 368113319;
        g.bjol[19] = 203941496;
        g.bjol[20] = -517084744;
        g.bjol[21] = 583570803;
        g.bjol[22] = -2088213147;
        g.bjol[23] = -1396299066;
        g.bjol[24] = 50359895;
        g.bjol[25] = -2096161123;
        g.bjol[26] = -1828985116;
        g.bjol[27] = -1031466842;
        g.bjol[28] = -194578374;
        g.bjol[29] = 611814947;
        g.bjol[30] = 651610698;
        g.bjol[31] = -540555744;
        g.bjol[32] = -1491987751;
        g.bjol[33] = 629387300;
        g.bjol[34] = 707165795;
        g.bjol[35] = 1003992790;
        g.bjol[36] = -1859806790;
        g.bjol[37] = 1317300086;
        g.bjol[38] = -33767040;
        g.bjol[39] = 680118289;
        g.bjol[40] = -218282766;
        g.bjol[41] = 1580734938;
        g.bjol[42] = 1175088027;
        g.bjol[43] = -755842538;
        g.bjol[44] = -334562838;
        g.bjol[45] = -1352193167;
        g.bjol[46] = 1780102847;
        g.bjol[47] = 686324414;
        g.bjol[48] = -677714842;
        g.bjol[49] = 1846033775;
        g.bjol[50] = -1396364890;
        g.bjol[51] = 584226117;
        g.bjol[52] = -162161725;
        g.bjol[53] = 81601549;
        g.bjol[54] = 825264291;
        g.bjol[55] = -1507398815;
        g.bjol[56] = -633808769;
        g.bjol[57] = 1444202436;
        g.bjol[58] = 1010790594;
        g.bjol[59] = 370865046;
        g.bjol[60] = 1470136621;
        g.bjol[61] = 1725216968;
        g.bjol[62] = 469450712;
        g.bjol[63] = -2047682798;
        g.bjol[64] = 1346464293;
        g.bjol[65] = -266877956;
        g.bjol[66] = -1617755968;
        g.bjol[67] = -447689555;
        g.bjol[68] = 349388419;
        g.bjol[69] = 2066759368;
        g.bjol[70] = -1687971506;
        g.bjol[71] = 197371534;
        g.bjol[72] = -416052199;
        g.bjol[73] = -1427502482;
        g.bjol[74] = -1216964299;
        g.bjol[75] = -4449988;
        g.bjol[76] = -799818858;
        g.bjol[77] = -2060542278;
        g.bjol[78] = -752591591;
        g.bjol[79] = -441715214;
        g.bjol[80] = -605387542;
        g.bjol[81] = 1667023013;
        g.bjol[82] = 1925876023;
        g.bjol[83] = 514469651;
        g.bjol[84] = -853678357;
        g.bjol[85] = -1568570171;
        g.bjol[86] = 683195430;
        g.bjol[87] = -827260582;
        g.bjol[88] = 2064876144;
        g.bjol[89] = -778748811;
        g.bjol[90] = -204866605;
        g.bjol[91] = 1078619911;
        g.bjol[92] = -595427710;
        g.bjol[93] = 1947391712;
        g.bjol[94] = 1872103483;
        g.bjol[95] = -42967334;
        g.bjol[96] = -1584769873;
        g.bjol[97] = -1271709543;
        g.bjol[98] = -232630335;
        g.bjol[99] = -740221429;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private Stream<String> getCommandSuggestions(String var1_1) {
        block93: {
            var10_2 = g.c;
            var9_3 /* !! */  = g.b;
            var8_4 = g.a;
            if (var10_2) {
                throw null;
            }
            if (var8_4 != false) return null;
            if (var8_4 != false) return null;
            if (var1_1.isEmpty()) {
                if (var8_4 != false) return null;
                if (var8_4 != false) return null;
                return this.commands.stream().map((Function<f, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getName(), (Lruhack/phobia/f;)Ljava/lang/String;)()).sorted();
            }
            if (var8_4 != false) return null;
            if (var8_4 != false) return null;
            var2_5 = new LinkedHashSet<String>();
            if (var8_4 != false) return null;
            if (var8_4 != false) return null;
            var3_6 = this.commands.iterator();
            if (var8_4 != false) return null;
            block44: while (true) {
                if (var8_4 != false) return null;
                if (var8_4 != false) return null;
                if (!var3_6.hasNext()) ** GOTO lbl74
                if (var8_4 != false) return null;
                if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var9_3 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            var4_7 = var3_6.next();
                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            var5_8 = var4_7.getName();
                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            if (!var5_8.toLowerCase().startsWith(var1_1)) ** GOTO lbl44
                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            var2_5.add(var5_8);
                            if (var8_4 != false) return null;
                            if (var10_2) {
                                throw null;
                            }
                            ** GOTO lbl70
lbl44:
                            // 1 sources

                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            var6_9 = var4_7.getAliases().iterator();
                            if (var8_4 != false) return null;
                            do {
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (!var6_9.hasNext()) ** GOTO lbl70
                                if (var8_4 != false) return null;
                                var7_10 = var6_9.next();
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (!var7_10.toLowerCase().startsWith(var1_1)) ** GOTO lbl66
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                var2_5.add(var7_10);
                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                                if (var10_2) {
                                    throw null;
                                }
                                ** GOTO lbl70
lbl66:
                                // 1 sources

                                if (var8_4 != false) return null;
                                if (var8_4 != false) return null;
                            } while (!var10_2);
                            throw null;
lbl70:
                            // 3 sources

                            if (var8_4 != false) return null;
                            if (var8_4 != false) return null;
                            if (!var10_2) continue block44;
                            throw null;
                        }
lbl74:
                        // 1 sources

                        if (var8_4 != false) return null;
                        if (var8_4 != false) return null;
                        return var2_5.stream().sorted();
                        case 2: {
                            var9_3 /* !! */  = (int)g.bjom("blhs", bjoj(int ), (int)277);
                            cfr_temp_0 = 26;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 9: {
                            var9_3 /* !! */  = (int)g.bjom("blhz", bjoj(int ), (int)284);
                            cfr_temp_0 = 15;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 10: {
                            var9_3 /* !! */  = (int)g.bjom("blia", bjoj(int ), (int)285);
                            cfr_temp_0 = 33;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 12: {
                            var9_3 /* !! */  = (int)g.bjom("blic", bjoj(int ), (int)287);
                            cfr_temp_0 = 30;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 13: {
                            var9_3 /* !! */  = (int)g.bjom("blid", bjoj(int ), (int)288);
                            cfr_temp_0 = 36;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 14: {
                            var9_3 /* !! */  = (int)g.bjom("blie", bjoj(int ), (int)289);
                            cfr_temp_0 = 28;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 17: {
                            var9_3 /* !! */  = (int)g.bjom("blih", bjoj(int ), (int)292);
                            cfr_temp_0 = 20;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 18: {
                            var9_3 /* !! */  = (int)g.bjom("blii", bjoj(int ), (int)293);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 11: {
                            var9_3 /* !! */  = (int)g.bjom("blib", bjoj(int ), (int)286);
                            cfr_temp_0 = 30;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 19: {
                            var9_3 /* !! */  = (int)g.bjom("blij", bjoj(int ), (int)294);
                            cfr_temp_0 = 32;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 21: {
                            var9_3 /* !! */  = (int)g.bjom("blil", bjoj(int ), (int)296);
                            cfr_temp_0 = 31;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 22: {
                            var9_3 /* !! */  = (int)g.bjom("blim", bjoj(int ), (int)297);
                            cfr_temp_0 = 1;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 23: {
                            var9_3 /* !! */  = (int)g.bjom("blin", bjoj(int ), (int)298);
                            cfr_temp_0 = 0;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 25: {
                            var9_3 /* !! */  = (int)g.bjom("blip", bjoj(int ), (int)300);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 0: {
                            var9_3 /* !! */  = (int)g.bjom("blhq", bjoj(int ), (int)275);
                            cfr_temp_0 = 15;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 26: {
                            var9_3 /* !! */  = (int)g.bjom("bliq", bjoj(int ), (int)301);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 1: {
                            var9_3 /* !! */  = (int)g.bjom("blhr", bjoj(int ), (int)276);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 20: {
                            var9_3 /* !! */  = (int)g.bjom("blik", bjoj(int ), (int)295);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 7: {
                            var9_3 /* !! */  = (int)g.bjom("blhx", bjoj(int ), (int)282);
                            cfr_temp_0 = 29;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 31: {
                            var9_3 /* !! */  = (int)g.bjom("bliv", bjoj(int ), (int)306);
                            cfr_temp_0 = 8;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 32: {
                            var9_3 /* !! */  = (int)g.bjom("bliw", bjoj(int ), (int)307);
                            cfr_temp_0 = 35;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 34: {
                            var9_3 /* !! */  = (int)g.bjom("bliy", bjoj(int ), (int)309);
                            cfr_temp_0 = 16;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 36: {
                            var9_3 /* !! */  = (int)g.bjom("blja", bjoj(int ), (int)311);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 35: {
                            var9_3 /* !! */  = (int)g.bjom("bliz", bjoj(int ), (int)310);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 16: {
                            var9_3 /* !! */  = (int)g.bjom("blig", bjoj(int ), (int)291);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 33: {
                            do {
                                var9_3 /* !! */  = (int)g.bjom("blix", bjoj(int ), (int)308);
                            } while (!var10_2);
                            throw null;
                        }
                        case 37: {
                            var9_3 /* !! */  = (int)g.bjom("bljb", bjoj(int ), (int)312);
                            cfr_temp_0 = 30;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 38: {
                            var9_3 /* !! */  = (int)g.bjom("bljc", bjoj(int ), (int)313);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 15: {
                            var9_3 /* !! */  = (int)g.bjom("blif", bjoj(int ), (int)290);
                            if (var10_2) {
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
                        case 40: {
                            var9_3 /* !! */  = (int)g.bjom("blje", bjoj(int ), (int)315);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 3: {
                            ** GOTO lbl241
                        }
                        case 41: lbl-1000:
                        // 2 sources

                        {
                            var9_3 /* !! */  = (int)g.bjom("bljf", bjoj(int ), (int)316);
                            if (var10_2) {
                                throw null;
                            }
lbl241:
                            // 3 sources

                            var9_3 /* !! */  = (int)g.bjom("blht", bjoj(int ), (int)278);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 6: {
                            var9_3 /* !! */  = (int)g.bjom("blhw", bjoj(int ), (int)281);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 8: {
                            var9_3 /* !! */  = (int)g.bjom("blhy", bjoj(int ), (int)283);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 27: {
                            var9_3 /* !! */  = (int)g.bjom("blir", bjoj(int ), (int)302);
                            cfr_temp_0 = 39;
                            if (var10_2) {
                                throw null;
                            }
                            break block93;
                        }
                        case 4: {
                            var9_3 /* !! */  = (int)g.bjom("blhu", bjoj(int ), (int)279);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 29: {
                            var9_3 /* !! */  = (int)g.bjom("blit", bjoj(int ), (int)304);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 24: {
                            var9_3 /* !! */  = (int)g.bjom("blio", bjoj(int ), (int)299);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 39: {
                            var9_3 /* !! */  = (int)g.bjom("bljd", bjoj(int ), (int)314);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 30: {
                            var9_3 /* !! */  = (int)g.bjom("bliu", bjoj(int ), (int)305);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 5: {
                            var9_3 /* !! */  = (int)g.bjom("blhv", bjoj(int ), (int)280);
                            if (var10_2) {
                                throw null;
                            }
                        }
                        case 28: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl287
        }
        do {
            if (true) ** continue;
lbl287:
            // 2 sources

            var9_3 /* !! */  = (int)g.bjom("blis", bjoj(int ), (int)303);
            cfr_temp_0 = 4;
        } while (!var10_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void sendError(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bllb", bjot(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == g.bjom("bllc", bjoj(int ), (int)341)) break;
            v0 /* !! */  = (long)g.bjom("blld", bjoj(int ), (int)342);
        }
        var4_2 = g.c;
        v1 /* !! */  = g.dm;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(g.bjom("bllf", bjot(int ), (int)134) - g.bjom("blle", bjot(int ), (int)133));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2041897634: {
                    continue block25;
                }
                case 1048613931: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = g.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bllg", bjot(int ), (int)135)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == g.bjom("bllh", bjoj(int ), (int)343)) break;
            v2 /* !! */  = (long)g.bjom("blli", bjoj(int ), (int)344);
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("bllj", bjot(int ), (int)136)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == g.bjom("bllk", bjoj(int ), (int)345)) break;
            v3 /* !! */  = (long)g.bjom("blll", bjoj(int ), (int)346);
        }
        v4 = class_2561.method_43470((String)var1_1);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = g.dm - g.bjom("bllm", bjot(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == g.bjom("blln", bjoj(int ), (int)347)) break;
            v5 /* !! */  = (long)g.bjom("bllo", bjoj(int ), (int)348);
        }
        v6 /* !! */  = g.dm;
        if (true) ** GOTO lbl43
        block30: while (true) {
            v6 /* !! */  = (long)(v7 - g.bjom("bllp", bjot(int ), (int)138));
lbl43:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1491601117: {
                    v7 = g.bjom("bllq", bjot(int ), (int)139);
                    continue block30;
                }
                case -476455827: {
                    v7 = g.bjom("bllr", bjot(int ), (int)140);
                    continue block30;
                }
                case 1048613931: {
                    break block30;
                }
                case 1842491286: {
                    v7 = g.bjom("blls", bjot(int ), (int)141);
                    continue block30;
                }
            }
            break;
        }
        v8 = v4.method_27692(class_124.field_1061);
        v9 /* !! */  = g.dm;
        if (true) ** GOTO lbl60
        block31: while (true) {
            v9 /* !! */  = (long)(v10 - g.bjom("bllt", bjot(int ), (int)142));
lbl60:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -721526607: {
                    v10 = g.bjom("bllu", bjot(int ), (int)143);
                    continue block31;
                }
                case 527255815: {
                    v10 = g.bjom("bllv", bjot(int ), (int)144);
                    continue block31;
                }
                case 1048613931: {
                    break block31;
                }
                case 1728282067: {
                    v10 = g.bjom("bllw", bjot(int ), (int)145);
                    continue block31;
                }
            }
            break;
        }
        pp.brandmessage((class_2561)v8);
        ** while (var2_4 || var2_4)
lbl74:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl78:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)g.bjom("bllx", bjoj(int ), (int)349);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("blly", bjoj(int ), (int)350);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)g.bjom("bllz", bjoj(int ), (int)351);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)g.bjom("blma", bjoj(int ), (int)352);
                if (!var4_2) break;
                throw null;
            }
lbl96:
            // 2 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("blmb", bjoj(int ), (int)353);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)g.bjom("blmc", bjoj(int ), (int)354);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void blpd() {
        g.bjok[300] = -1789846819;
        g.bjok[301] = 2126329280;
        g.bjok[302] = 1978150273;
        g.bjok[303] = -461341305;
        g.bjok[304] = 251152519;
        g.bjok[305] = -996254702;
        g.bjok[306] = 753715183;
        g.bjok[307] = 1927377996;
        g.bjok[308] = -1174778765;
        g.bjok[309] = 435649554;
        g.bjok[310] = -1381852354;
        g.bjok[311] = -1411713708;
        g.bjok[312] = 1319326560;
        g.bjok[313] = 1482826862;
        g.bjok[314] = -1032238333;
        g.bjok[315] = 1028337708;
        g.bjok[316] = 800121138;
        g.bjok[317] = 69769095;
        g.bjok[318] = -158609472;
        g.bjok[319] = 1063572009;
        g.bjok[320] = 1781636541;
        g.bjok[321] = -1591500332;
        g.bjok[322] = 2027474814;
        g.bjok[323] = 1830993869;
        g.bjok[324] = -636267780;
        g.bjok[325] = -79994978;
        g.bjok[326] = -1879199516;
        g.bjok[327] = -1512721725;
        g.bjok[328] = -834036447;
        g.bjok[329] = -801203537;
        g.bjok[330] = -1080170687;
        g.bjok[331] = 2133577643;
        g.bjok[332] = 1259968605;
        g.bjok[333] = -1448137597;
        g.bjok[334] = -16686742;
        g.bjok[335] = -1060422435;
        g.bjok[336] = 33910812;
        g.bjok[337] = 632825841;
        g.bjok[338] = -617326776;
        g.bjok[339] = 1209370722;
        g.bjok[340] = 1758231246;
        g.bjok[341] = -1099005069;
        g.bjok[342] = -626884439;
        g.bjok[343] = -1893787458;
        g.bjok[344] = 205546284;
        g.bjok[345] = 262501027;
        g.bjok[346] = -406148959;
        g.bjok[347] = 1492472061;
        g.bjok[348] = 721958818;
        g.bjok[349] = -657789066;
        g.bjok[350] = 1075576028;
        g.bjok[351] = 2038906278;
        g.bjok[352] = 711936741;
        g.bjok[353] = -2007604712;
        g.bjok[354] = 757729441;
        g.bjok[355] = 495868902;
        g.bjok[356] = -1675021487;
        g.bjok[357] = -2070914667;
        g.bjok[358] = -1383476140;
        g.bjok[359] = -691648279;
        g.bjok[360] = 1940636738;
        g.bjok[361] = 130321136;
        g.bjok[362] = 34471024;
        g.bjok[363] = 1880976609;
        g.bjok[364] = -1704653297;
        g.bjok[365] = 1279177621;
        g.bjok[366] = -364725363;
        g.bjok[367] = 1126097002;
        g.bjok[368] = -1674179989;
        g.bjok[369] = -1134372872;
        g.bjok[370] = 696666263;
        g.bjok[371] = -496043198;
        g.bjok[372] = 314345211;
        g.bjok[373] = 986856235;
        g.bjok[374] = -963610366;
        g.bjok[375] = -218584624;
        g.bjok[376] = -782629470;
        g.bjok[377] = 799035334;
        g.bjok[378] = 1501485626;
        g.bjok[379] = -1010231710;
        g.bjok[380] = -1703396853;
        g.bjok[381] = 566149868;
        g.bjok[382] = -363943467;
        g.bjok[383] = 356974186;
        g.bjok[384] = -1862370754;
        g.bjok[385] = 96043686;
        g.bjok[386] = -245209253;
        g.bjok[387] = -668805898;
        g.bjok[388] = 229696855;
        g.bjok[389] = -1232867384;
        g.bjok[390] = 130002378;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void sendMessage(String var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("bljg", bjot(int ), (int)109));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1903185456: {
                    v1 = g.bjom("bljh", bjot(int ), (int)110);
                    continue block19;
                }
                case 532775214: {
                    v1 = g.bjom("blji", bjot(int ), (int)111);
                    continue block19;
                }
                case 1048613931: {
                    break block19;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bljj", bjot(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == g.bjom("bljk", bjoj(int ), (int)317)) break;
            v2 /* !! */  = (long)g.bjom("bljl", bjoj(int ), (int)318);
        }
        var3_3 /* !! */  = g.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bljm", bjot(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == g.bjom("bljn", bjoj(int ), (int)319)) break;
            v3 /* !! */  = (long)g.bjom("bljo", bjoj(int ), (int)320);
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl31
                v4 /* !! */  = g.dm;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(v5 - g.bjom("bljp", bjot(int ), (int)114));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -116161581: {
                            v5 = g.bjom("bljq", bjot(int ), (int)115);
                            continue block23;
                        }
                        case 531113339: {
                            v5 = g.bjom("bljr", bjot(int ), (int)116);
                            continue block23;
                        }
                        case 908091141: {
                            v5 = g.bjom("bljs", bjot(int ), (int)117);
                            continue block23;
                        }
                        case 1048613931: {
                            break block23;
                        }
                    }
                    break;
                }
                pp.brandmessage(var1_1);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)g.bjom("bljt", bjoj(int ), (int)321);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl63:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)g.bjom("blju", bjoj(int ), (int)322);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)g.bjom("bljv", bjoj(int ), (int)323);
                    if (!var4_2) ** GOTO lbl63
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)g.bjom("bljw", bjoj(int ), (int)324);
                if (!var4_2) break;
                throw null;
            }
lbl76:
            // 2 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("bljx", bjoj(int ), (int)325);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)g.bjom("bljy", bjoj(int ), (int)326);
        ** while (!var4_2)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<f> getCommands() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bkxf", bjot(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == g.bjom("bkxh", bjoj(int ), (int)96)) break;
            v0 /* !! */  = (long)g.bjom("bkxi", bjoj(int ), (int)97);
        }
        var3_1 = g.c;
        v1 /* !! */  = g.dm;
        if (true) ** GOTO lbl12
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - g.bjom("bkxk", bjot(int ), (int)45));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -796749696: {
                    v2 = g.bjom("bkxo", bjot(int ), (int)46);
                    continue block27;
                }
                case -515855122: {
                    v2 = g.bjom("bkxp", bjot(int ), (int)47);
                    continue block27;
                }
                case -428491521: {
                    v2 = g.bjom("bkxr", bjot(int ), (int)48);
                    continue block27;
                }
                case 1048613931: {
                    break block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = g.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bkxu", bjot(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == g.bjom("bkxv", bjoj(int ), (int)98)) break;
                    v3 /* !! */  = (long)g.bjom("bkxw", bjoj(int ), (int)99);
                }
                var1_3 = g.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = g.dm;
                if (true) ** GOTO lbl44
                block30: while (true) {
                    v4 /* !! */  = (long)(g.bjom("bkyb", bjot(int ), (int)51) - g.bjom("bkxz", bjot(int ), (int)50));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1048613931: {
                            break block30;
                        }
                        case 1748173846: {
                            continue block30;
                        }
                    }
                    break;
                }
                v5 /* !! */  = g.dm;
                if (true) ** GOTO lbl53
                block31: while (true) {
                    v5 /* !! */  = (long)(g.bjom("bkyd", bjot(int ), (int)53) - g.bjom("bkyc", bjot(int ), (int)52));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -717042301: {
                            continue block31;
                        }
                        case 1048613931: {
                            break block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = g.dm;
                if (true) ** GOTO lbl62
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - g.bjom("bkye", bjot(int ), (int)54));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2024310292: {
                            v7 = g.bjom("bkyf", bjot(int ), (int)55);
                            continue block32;
                        }
                        case 135949437: {
                            v7 = g.bjom("bkyg", bjot(int ), (int)56);
                            continue block32;
                        }
                        case 1048613931: {
                            break block32;
                        }
                        case 1162194082: {
                            v7 = g.bjom("bkyi", bjot(int ), (int)57);
                            continue block32;
                        }
                    }
                    break;
                }
                return new ArrayList<f>(this.commands);
            }
            case 0: {
                var2_2 /* !! */  = (int)g.bjom("bkyj", bjoj(int ), (int)100);
                if (var3_1) {
                    throw null;
                }
            }
lbl79:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)g.bjom("bkyk", bjoj(int ), (int)101);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)g.bjom("bkyl", bjoj(int ), (int)102);
                    if (!var3_1) ** GOTO lbl79
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)g.bjom("bkym", bjoj(int ), (int)103);
        ** while (!var3_1)
lbl92:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void registerCommand(f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bkrl", bjot(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == g.bjom("bkrm", bjoj(int ), (int)60)) break;
            v0 /* !! */  = (long)g.bjom("bkrn", bjoj(int ), (int)61);
        }
        var4_2 = g.c;
        v1 /* !! */  = g.dm;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(g.bjom("bkrr", bjot(int ), (int)11) - g.bjom("bkrp", bjot(int ), (int)10));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1659269792: {
                    continue block17;
                }
                case 1048613931: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = g.b;
        v2 /* !! */  = g.dm;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(g.bjom("bkrx", bjot(int ), (int)13) - g.bjom("bkru", bjot(int ), (int)12));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 449674850: {
                    continue block18;
                }
                case 1048613931: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = g.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bksb", bjot(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == g.bjom("bkse", bjoj(int ), (int)62)) break;
                    v3 /* !! */  = (long)g.bjom("bksg", bjoj(int ), (int)63);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("bksi", bjot(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == g.bjom("bksj", bjoj(int ), (int)64)) break;
                    v4 /* !! */  = (long)g.bjom("bksk", bjoj(int ), (int)65);
                }
                this.commands.add(var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)g.bjom("bksl", bjoj(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("bkss", bjoj(int ), (int)67);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)g.bjom("bkst", bjoj(int ), (int)68);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)g.bjom("bksu", bjoj(int ), (int)69);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)g.bjom("bksw", bjoj(int ), (int)70);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)g.bjom("bksz", bjoj(int ), (int)71);
        ** while (!var4_2)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blpa() {
        g.bjok[0] = 1696071901;
        g.bjok[1] = -1673046483;
        g.bjok[2] = -709512510;
        g.bjok[3] = -1179751395;
        g.bjok[4] = 455588734;
        g.bjok[5] = -1131193090;
        g.bjok[6] = 1396160455;
        g.bjok[7] = -2100713539;
        g.bjok[8] = 1902598550;
        g.bjok[9] = -927435162;
        g.bjok[10] = 638839641;
        g.bjok[11] = -440061291;
        g.bjok[12] = 2037286213;
        g.bjok[13] = 1357707469;
        g.bjok[14] = 233419132;
        g.bjok[15] = -825560969;
        g.bjok[16] = 1267966646;
        g.bjok[17] = -1422234542;
        g.bjok[18] = 368113294;
        g.bjok[19] = 203941475;
        g.bjok[20] = -517084782;
        g.bjok[21] = 583570807;
        g.bjok[22] = -2088213177;
        g.bjok[23] = -1396299070;
        g.bjok[24] = 50359881;
        g.bjok[25] = -2096161128;
        g.bjok[26] = -1828985141;
        g.bjok[27] = -1031466818;
        g.bjok[28] = -194578372;
        g.bjok[29] = 611814945;
        g.bjok[30] = 651610728;
        g.bjok[31] = -540555728;
        g.bjok[32] = -1491987771;
        g.bjok[33] = 629387269;
        g.bjok[34] = 707165819;
        g.bjok[35] = 1003992820;
        g.bjok[36] = -1859806817;
        g.bjok[37] = 1317300069;
        g.bjok[38] = -33766996;
        g.bjok[39] = 680118275;
        g.bjok[40] = -218282769;
        g.bjok[41] = 1580734934;
        g.bjok[42] = 1175088018;
        g.bjok[43] = -755842552;
        g.bjok[44] = -334562832;
        g.bjok[45] = -1352193153;
        g.bjok[46] = 1780102826;
        g.bjok[47] = 686324369;
        g.bjok[48] = -677714848;
        g.bjok[49] = 1846033739;
        g.bjok[50] = -1396364866;
        g.bjok[51] = 584226112;
        g.bjok[52] = -162161681;
        g.bjok[53] = 81601576;
        g.bjok[54] = 825264315;
        g.bjok[55] = -1507398840;
        g.bjok[56] = -633808772;
        g.bjok[57] = 1444202446;
        g.bjok[58] = 1010790631;
        g.bjok[59] = 370865079;
        g.bjok[60] = 1470136620;
        g.bjok[61] = -638438846;
        g.bjok[62] = 469450713;
        g.bjok[63] = 194549719;
        g.bjok[64] = 1346464292;
        g.bjok[65] = 1488016457;
        g.bjok[66] = -1617755963;
        g.bjok[67] = -447689555;
        g.bjok[68] = 349388419;
        g.bjok[69] = 2066759373;
        g.bjok[70] = -1687971506;
        g.bjok[71] = 197371530;
        g.bjok[72] = 416052198;
        g.bjok[73] = -304114456;
        g.bjok[74] = -1216964300;
        g.bjok[75] = 784958537;
        g.bjok[76] = 799818857;
        g.bjok[77] = -893085094;
        g.bjok[78] = -752591588;
        g.bjok[79] = -441715214;
        g.bjok[80] = -605387537;
        g.bjok[81] = 1667023008;
        g.bjok[82] = 1925876023;
        g.bjok[83] = 514469654;
        g.bjok[84] = -853678358;
        g.bjok[85] = -1928197872;
        g.bjok[86] = 683195431;
        g.bjok[87] = -1262175069;
        g.bjok[88] = 2064876145;
        g.bjok[89] = 702198364;
        g.bjok[90] = -204866606;
        g.bjok[91] = 2085706414;
        g.bjok[92] = -595427711;
        g.bjok[93] = 1947391714;
        g.bjok[94] = 1872103480;
        g.bjok[95] = -42967335;
        g.bjok[96] = -1584769874;
        g.bjok[97] = 1723305769;
        g.bjok[98] = -232630336;
        g.bjok[99] = -684669936;
    }

    public static /* synthetic */ CallSite bjom(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setPrefix(String string) {
        block36: {
            block35: {
                Object object = dm;
                boolean bl2 = true;
                block22: while (true) {
                    CallSite callSite;
                    if (!bl2 || (bl2 = false) || !true) {
                        object = callSite - g.bjom("bkzd", bjot(int ), (int)63);
                    }
                    switch ((int)object) {
                        case -415554690: {
                            callSite = g.bjom("bkze", bjot(int ), (int)64);
                            continue block22;
                        }
                        case 659624794: {
                            callSite = g.bjom("bkzf", bjot(int ), (int)65);
                            continue block22;
                        }
                        case 1048613931: {
                            break block22;
                        }
                    }
                    break;
                }
                boolean bl3 = c;
                Object object2 = dm;
                boolean bl4 = true;
                block23: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object2 = callSite - g.bjom("bkzg", bjot(int ), (int)66);
                    }
                    switch ((int)object2) {
                        case -1747069130: {
                            callSite = g.bjom("bkzh", bjot(int ), (int)67);
                            continue block23;
                        }
                        case 867699963: {
                            callSite = g.bjom("bkzi", bjot(int ), (int)68);
                            continue block23;
                        }
                        case 1048613931: {
                            break block23;
                        }
                        case 1191314353: {
                            callSite = g.bjom("bkzj", bjot(int ), (int)69);
                            continue block23;
                        }
                    }
                    break;
                }
                int n2 = b;
                Object object3 = dm;
                boolean bl5 = true;
                block24: while (true) {
                    CallSite callSite;
                    if (!bl5 || (bl5 = false) || !true) {
                        object3 = callSite - g.bjom("bkzk", bjot(int ), (int)70);
                    }
                    switch ((int)object3) {
                        case -1784116095: {
                            callSite = g.bjom("bkzl", bjot(int ), (int)71);
                            continue block24;
                        }
                        case 1048613931: {
                            break block24;
                        }
                        case 2076564159: {
                            callSite = g.bjom("bkzn", bjot(int ), (int)72);
                            continue block24;
                        }
                    }
                    break;
                }
                boolean bl6 = a;
                if (bl3) {
                    throw null;
                }
                if (bl6 || bl6) break block35;
                Object object4 = dm;
                boolean bl7 = true;
                block25: while (true) {
                    CallSite callSite;
                    if (!bl7 || (bl7 = false) || !true) {
                        object4 = callSite - g.bjom("bkzo", bjot(int ), (int)73);
                    }
                    switch ((int)object4) {
                        case -2109831058: {
                            callSite = g.bjom("bkzp", bjot(int ), (int)74);
                            continue block25;
                        }
                        case 1048613931: {
                            break block25;
                        }
                        case 1465800941: {
                            callSite = g.bjom("bkzq", bjot(int ), (int)75);
                            continue block25;
                        }
                        case 1880621494: {
                            callSite = g.bjom("bkzr", bjot(int ), (int)76);
                            continue block25;
                        }
                    }
                    break;
                }
                this.prefix = string;
                if (!bl6 && !bl6) break block36;
            }
            return;
        }
    }

    private static /* synthetic */ long bjot(int n2) {
        return bjou[n2] ^ bjov[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public f getCommand(String var1_1) {
        v0 /* !! */  = g.dm;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - g.bjom("bkuo", bjot(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -5047027: {
                    v1 = g.bjom("bkup", bjot(int ), (int)24);
                    continue block33;
                }
                case 719967367: {
                    v1 = g.bjom("bkuq", bjot(int ), (int)25);
                    continue block33;
                }
                case 1048613931: {
                    break block33;
                }
            }
            break;
        }
        var4_2 = g.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = g.dm - g.bjom("bkur", bjot(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == g.bjom("bkut", bjoj(int ), (int)84)) break;
            v2 /* !! */  = (long)g.bjom("bkuv", bjoj(int ), (int)85);
        }
        var3_3 /* !! */  = g.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = g.dm - g.bjom("bkuz", bjot(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == g.bjom("bkvc", bjoj(int ), (int)86)) break;
            v3 /* !! */  = (long)g.bjom("bkvf", bjoj(int ), (int)87);
        }
        var2_4 = g.a;
        if (!var4_2) ** GOTO lbl33
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var2_4 || var2_4) continue block36;
                v4 /* !! */  = g.dm;
                if (true) ** GOTO lbl38
                block37: while (true) {
                    v4 /* !! */  = (long)(v5 - g.bjom("bkvh", bjot(int ), (int)28));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 48970893: {
                            v5 = g.bjom("bkvj", bjot(int ), (int)29);
                            continue block37;
                        }
                        case 168689183: {
                            v5 = g.bjom("bkvl", bjot(int ), (int)30);
                            continue block37;
                        }
                        case 841465916: {
                            v5 = g.bjom("bkvm", bjot(int ), (int)31);
                            continue block37;
                        }
                        case 1048613931: {
                            break block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = g.dm - g.bjom("bkvr", bjot(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == g.bjom("bkvs", bjoj(int ), (int)88)) break;
                    v6 /* !! */  = (long)g.bjom("bkvu", bjoj(int ), (int)89);
                }
                v7 = this.commands.stream();
                v8 /* !! */  = g.dm;
                if (true) ** GOTO lbl60
                block39: while (true) {
                    v8 /* !! */  = (long)(v9 - g.bjom("bkvw", bjot(int ), (int)33));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 322970953: {
                            v9 = g.bjom("bkvx", bjot(int ), (int)34);
                            continue block39;
                        }
                        case 1048613931: {
                            break block39;
                        }
                        case 1173525107: {
                            v9 = g.bjom("bkvy", bjot(int ), (int)35);
                            continue block39;
                        }
                    }
                    break;
                }
                v10 = (Predicate<f>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getCommand$0(java.lang.String ruhack.phobia.f ), (Lruhack/phobia/f;)Z)((String)var1_1);
                v11 /* !! */  = g.dm;
                if (true) ** GOTO lbl74
                block40: while (true) {
                    v11 /* !! */  = (long)(v12 - g.bjom("bkwc", bjot(int ), (int)36));
lbl74:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 829165511: {
                            v12 = g.bjom("bkwd", bjot(int ), (int)37);
                            continue block40;
                        }
                        case 1048613931: {
                            break block40;
                        }
                        case 1730985566: {
                            v12 = g.bjom("bkwe", bjot(int ), (int)38);
                            continue block40;
                        }
                    }
                    break;
                }
                v13 = v7.filter(v10);
                v14 /* !! */  = g.dm;
                if (true) ** GOTO lbl88
                block41: while (true) {
                    v14 /* !! */  = (long)(v15 - g.bjom("bkwg", bjot(int ), (int)39));
lbl88:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -246719449: {
                            v15 = g.bjom("bkwi", bjot(int ), (int)40);
                            continue block41;
                        }
                        case 1048613931: {
                            break block41;
                        }
                        case 1457595666: {
                            v15 = g.bjom("bkwj", bjot(int ), (int)41);
                            continue block41;
                        }
                        case 1724197323: {
                            v15 = g.bjom("bkwk", bjot(int ), (int)42);
                            continue block41;
                        }
                    }
                    break;
                }
                v16 = v13.findFirst();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = g.dm - g.bjom("bkwo", bjot(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == g.bjom("bkwq", bjoj(int ), (int)90)) break;
                    v17 /* !! */  = (long)g.bjom("bkws", bjoj(int ), (int)91);
                }
                return v16.orElse(null);
                case 0: {
                    var3_3 /* !! */  = (int)g.bjom("bkwt", bjoj(int ), (int)92);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl116
                }
                case 1: {
                    var3_3 /* !! */  = (int)g.bjom("bkwv", bjoj(int ), (int)93);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl116:
                // 4 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)g.bjom("bkww", bjoj(int ), (int)94);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)g.bjom("bkwy", bjoj(int ), (int)95);
        ** while (!var4_2)
lbl124:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bjoj(int n2) {
        return bjok[n2] ^ bjol[n2];
    }
}

