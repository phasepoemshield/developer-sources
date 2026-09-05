/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.d;
import ruhack.phobia.da;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.el;
import ruhack.phobia.hv$AttackPerpetratorConfigurable;
import ruhack.phobia.hx;
import ruhack.phobia.ik;
import ruhack.phobia.ik$EntityFilter;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov$VecRotation;
import ruhack.phobia.ow;
import ruhack.phobia.ox;

public class eh
extends ds {
    ik targetSelector;
    private static int[] xmz;
    public final ke targetType;
    class_1309 lastTarget;
    ox pointFinder;
    public final kg attackRange;
    public final ke options;
    private static int[] xmy;
    private static long[] xmt;
    public static final int b;
    private static long[] xmu;
    protected static final long bj = -8466469863461243655L;
    public static final boolean c;
    public final kb onlyCriticals;
    public static final boolean a;
    public final kb pitchCorrecting;
    public final kg speed;
    class_1309 target;

    private static /* synthetic */ void zkn() {
        eh.xmz[100] = 754925826;
        eh.xmz[101] = 1730767686;
        eh.xmz[102] = 799471702;
        eh.xmz[103] = 14747810;
        eh.xmz[104] = 956402;
        eh.xmz[105] = 1646229084;
        eh.xmz[106] = -1935269226;
        eh.xmz[107] = 808745055;
        eh.xmz[108] = -1920231310;
        eh.xmz[109] = 148343105;
        eh.xmz[110] = 4216213;
        eh.xmz[111] = 1795367437;
        eh.xmz[112] = -603049595;
        eh.xmz[113] = -170480929;
        eh.xmz[114] = -1280103140;
        eh.xmz[115] = -184946099;
        eh.xmz[116] = 1242359901;
        eh.xmz[117] = 1034682418;
        eh.xmz[118] = 2073306771;
        eh.xmz[119] = 831210407;
        eh.xmz[120] = 2059066628;
        eh.xmz[121] = 1952520175;
        eh.xmz[122] = -34383741;
        eh.xmz[123] = 1130351806;
        eh.xmz[124] = -318583937;
        eh.xmz[125] = -1514294275;
        eh.xmz[126] = -563336127;
        eh.xmz[127] = 1770240350;
        eh.xmz[128] = -1406158331;
        eh.xmz[129] = 314650041;
        eh.xmz[130] = -1322795418;
        eh.xmz[131] = -1155017860;
        eh.xmz[132] = 1117643444;
        eh.xmz[133] = -891982147;
        eh.xmz[134] = 20749601;
        eh.xmz[135] = 1254912683;
        eh.xmz[136] = -1659576327;
        eh.xmz[137] = 558215028;
        eh.xmz[138] = 199681334;
        eh.xmz[139] = 2129096404;
        eh.xmz[140] = -1217545421;
        eh.xmz[141] = 407505648;
        eh.xmz[142] = -625562806;
        eh.xmz[143] = -320206298;
        eh.xmz[144] = 1933099418;
        eh.xmz[145] = 453873108;
        eh.xmz[146] = -1257874650;
        eh.xmz[147] = 699976498;
        eh.xmz[148] = 1936082915;
        eh.xmz[149] = -1374672861;
        eh.xmz[150] = -1074680292;
        eh.xmz[151] = 348313513;
        eh.xmz[152] = -1026003051;
        eh.xmz[153] = -252500287;
        eh.xmz[154] = -208357415;
        eh.xmz[155] = 1164021832;
        eh.xmz[156] = 437051519;
        eh.xmz[157] = -735006591;
        eh.xmz[158] = -659388094;
        eh.xmz[159] = 1187121348;
        eh.xmz[160] = -802957483;
        eh.xmz[161] = 7713647;
        eh.xmz[162] = -795494955;
        eh.xmz[163] = 806950843;
        eh.xmz[164] = -1574056620;
        eh.xmz[165] = -625495357;
        eh.xmz[166] = 1940755435;
        eh.xmz[167] = 552320260;
        eh.xmz[168] = 1821007886;
        eh.xmz[169] = 2027383635;
        eh.xmz[170] = 1572182956;
        eh.xmz[171] = 1024616942;
        eh.xmz[172] = -422245058;
        eh.xmz[173] = -1010040380;
        eh.xmz[174] = -911263906;
        eh.xmz[175] = 2047680375;
        eh.xmz[176] = 1737355470;
        eh.xmz[177] = -1703992417;
        eh.xmz[178] = 1385730081;
        eh.xmz[179] = -1719741780;
        eh.xmz[180] = 1282832919;
        eh.xmz[181] = 1660374517;
        eh.xmz[182] = -1400628699;
        eh.xmz[183] = 1437083669;
        eh.xmz[184] = -502970651;
        eh.xmz[185] = 1178995524;
        eh.xmz[186] = 2041042452;
        eh.xmz[187] = -168390591;
        eh.xmz[188] = -1229021228;
        eh.xmz[189] = -495365386;
        eh.xmz[190] = -316398588;
        eh.xmz[191] = 1647438014;
        eh.xmz[192] = -1717903603;
        eh.xmz[193] = -804736783;
        eh.xmz[194] = 452433176;
        eh.xmz[195] = -114713590;
        eh.xmz[196] = 1650246579;
        eh.xmz[197] = -1711858767;
        eh.xmz[198] = -138403718;
        eh.xmz[199] = 1921195775;
    }

    private static /* synthetic */ void zko() {
        eh.xmz[200] = -1044582376;
        eh.xmz[201] = -1791019520;
        eh.xmz[202] = 1844388067;
        eh.xmz[203] = -189632763;
        eh.xmz[204] = -1213926127;
        eh.xmz[205] = -4439260;
        eh.xmz[206] = 1334616378;
        eh.xmz[207] = 1687461575;
        eh.xmz[208] = 403625504;
        eh.xmz[209] = -1635839262;
        eh.xmz[210] = -1688427217;
        eh.xmz[211] = -722104949;
        eh.xmz[212] = 235054928;
        eh.xmz[213] = 1810665436;
        eh.xmz[214] = -45469788;
        eh.xmz[215] = 1917241475;
        eh.xmz[216] = 797948511;
        eh.xmz[217] = 121363492;
        eh.xmz[218] = -1853777672;
        eh.xmz[219] = -951523882;
        eh.xmz[220] = -2113223997;
        eh.xmz[221] = -345860781;
        eh.xmz[222] = -994634128;
        eh.xmz[223] = -2111610888;
        eh.xmz[224] = 1724223260;
        eh.xmz[225] = 367178411;
        eh.xmz[226] = 351465192;
        eh.xmz[227] = -1057174091;
        eh.xmz[228] = 1576344;
        eh.xmz[229] = -1785673971;
        eh.xmz[230] = 942944095;
        eh.xmz[231] = -2082307789;
        eh.xmz[232] = 164180687;
        eh.xmz[233] = -1631644895;
        eh.xmz[234] = -106109739;
        eh.xmz[235] = 1977112303;
        eh.xmz[236] = 2154170;
        eh.xmz[237] = -123088800;
        eh.xmz[238] = 524771742;
        eh.xmz[239] = 246240358;
        eh.xmz[240] = -1897501876;
        eh.xmz[241] = 1398065889;
        eh.xmz[242] = 110945510;
        eh.xmz[243] = -2138200586;
        eh.xmz[244] = 1240866838;
        eh.xmz[245] = -1231049787;
        eh.xmz[246] = 933777716;
        eh.xmz[247] = 2017370284;
        eh.xmz[248] = -910441444;
        eh.xmz[249] = -1078417087;
        eh.xmz[250] = -1986737180;
        eh.xmz[251] = -1999732595;
        eh.xmz[252] = -1587481539;
        eh.xmz[253] = -1837109856;
        eh.xmz[254] = -226331705;
        eh.xmz[255] = 1625838384;
        eh.xmz[256] = 1754548650;
        eh.xmz[257] = -497155283;
        eh.xmz[258] = -262228695;
        eh.xmz[259] = -1015336824;
        eh.xmz[260] = -1690064967;
        eh.xmz[261] = 956749494;
        eh.xmz[262] = -1710578028;
        eh.xmz[263] = -315437644;
        eh.xmz[264] = 697048820;
        eh.xmz[265] = -194620765;
        eh.xmz[266] = -1629681585;
        eh.xmz[267] = -464316598;
        eh.xmz[268] = -1027196889;
        eh.xmz[269] = -800856958;
        eh.xmz[270] = 1977163121;
        eh.xmz[271] = -1678145418;
        eh.xmz[272] = 547901774;
        eh.xmz[273] = 1591240634;
        eh.xmz[274] = 1343686448;
        eh.xmz[275] = -1798854041;
        eh.xmz[276] = -1873708333;
        eh.xmz[277] = 1789008326;
        eh.xmz[278] = 1304960680;
        eh.xmz[279] = 1098169644;
        eh.xmz[280] = 1979499828;
        eh.xmz[281] = 1859684071;
        eh.xmz[282] = 226599943;
        eh.xmz[283] = -591987814;
        eh.xmz[284] = 172018153;
        eh.xmz[285] = -1024099028;
        eh.xmz[286] = -2087860053;
        eh.xmz[287] = 937498902;
        eh.xmz[288] = -547750819;
        eh.xmz[289] = 90004842;
        eh.xmz[290] = 1985135163;
        eh.xmz[291] = -1909341723;
        eh.xmz[292] = -1202553062;
        eh.xmz[293] = -703162515;
        eh.xmz[294] = 787089941;
        eh.xmz[295] = -81904138;
        eh.xmz[296] = -141348167;
        eh.xmz[297] = 406605063;
        eh.xmz[298] = 858144079;
        eh.xmz[299] = -836801452;
    }

    private static /* synthetic */ long xms(int n2) {
        return xmt[n2] ^ xmu[n2];
    }

    private static /* synthetic */ float xnp(int n2) {
        return Float.intBitsToFloat(xmy[n2] ^ xmz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1309 updateTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("yxl", xms(int ), (int)241)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eh.xmv("yxm", xmx(int ), (int)267)) break;
            v0 /* !! */  = (long)eh.xmv("yxn", xmx(int ), (int)268);
        }
        var5_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("yxo", xms(int ), (int)242)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eh.xmv("yxp", xmx(int ), (int)269)) break;
            v1 /* !! */  = (long)eh.xmv("yxq", xmx(int ), (int)270);
        }
        var4_2 /* !! */  = eh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("yxr", xms(int ), (int)243)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eh.xmv("yxs", xmx(int ), (int)271)) break;
            v2 /* !! */  = (long)eh.xmv("yxt", xmx(int ), (int)272);
        }
        var3_3 = eh.a;
        if (var5_1) {
            throw null;
lbl21:
            // 5 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("yxu", xms(int ), (int)244)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eh.xmv("yxv", xmx(int ), (int)273)) break;
            v3 /* !! */  = (long)eh.xmv("yxw", xmx(int ), (int)274);
        }
        v4 /* !! */  = eh.bj;
        if (true) ** GOTO lbl33
        block62: while (true) {
            v4 /* !! */  = (long)(eh.xmv("yxy", xms(int ), (int)246) - eh.xmv("yxx", xms(int ), (int)245));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 461798043: {
                    continue block62;
                }
                case 920106233: {
                    break block62;
                }
            }
            break;
        }
        v5 /* !! */  = eh.bj;
        if (true) ** GOTO lbl42
        block63: while (true) {
            v5 /* !! */  = (long)(v6 - eh.xmv("yxz", xms(int ), (int)247));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -385356261: {
                    v6 = eh.xmv("yya", xms(int ), (int)248);
                    continue block63;
                }
                case 165308795: {
                    v6 = eh.xmv("yyb", xms(int ), (int)249);
                    continue block63;
                }
                case 920106233: {
                    break block63;
                }
            }
            break;
        }
        v7 = this.targetType.getSelected();
        v8 /* !! */  = eh.bj;
        if (true) ** GOTO lbl56
        block64: while (true) {
            v8 /* !! */  = (long)(v9 - eh.xmv("yyc", xms(int ), (int)250));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -737402471: {
                    v9 = eh.xmv("yyd", xms(int ), (int)251);
                    continue block64;
                }
                case 920106233: {
                    break block64;
                }
                case 1564541868: {
                    v9 = eh.xmv("yye", xms(int ), (int)252);
                    continue block64;
                }
            }
            break;
        }
        var1_4 = new ik$EntityFilter(v7);
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl21
                var2_5 = eh.xmv("yyf", xnp(int ), (int)275);
                if (var3_3 || var3_3) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("yyg", xms(int ), (int)253)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == eh.xmv("yyh", xmx(int ), (int)276)) break;
                    v10 /* !! */  = (long)eh.xmv("yyi", xmx(int ), (int)277);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = eh.bj - eh.xmv("yyj", xms(int ), (int)254)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == eh.xmv("yyk", xmx(int ), (int)278)) break;
                    v11 /* !! */  = (long)eh.xmv("yyl", xmx(int ), (int)279);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = eh.bj - eh.xmv("yym", xms(int ), (int)255)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == eh.xmv("yyn", xmx(int ), (int)280)) break;
                    v12 /* !! */  = (long)eh.xmv("yyo", xmx(int ), (int)281);
                }
                v13 = eh.mc.field_1687;
                v14 /* !! */  = eh.bj;
                if (true) ** GOTO lbl92
                block68: while (true) {
                    v14 /* !! */  = (long)(v15 - eh.xmv("yyp", xms(int ), (int)256));
lbl92:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 413762772: {
                            v15 = eh.xmv("yyq", xms(int ), (int)257);
                            continue block68;
                        }
                        case 920106233: {
                            break block68;
                        }
                        case 1923403094: {
                            v15 = eh.xmv("yyr", xms(int ), (int)258);
                            continue block68;
                        }
                    }
                    break;
                }
                v16 = v13.method_18112();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = eh.bj - eh.xmv("yys", xms(int ), (int)259)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == eh.xmv("yyt", xmx(int ), (int)282)) break;
                    v17 /* !! */  = (long)eh.xmv("yyu", xmx(int ), (int)283);
                }
                v18 = this.finalDistance();
                v19 /* !! */  = eh.bj;
                if (true) ** GOTO lbl112
                block70: while (true) {
                    v19 /* !! */  = (long)(eh.xmv("yyw", xms(int ), (int)261) - eh.xmv("yyv", xms(int ), (int)260));
lbl112:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 327142888: {
                            continue block70;
                        }
                        case 920106233: {
                            break block70;
                        }
                    }
                    break;
                }
                v20 /* !! */  = eh.bj;
                if (true) ** GOTO lbl121
                block71: while (true) {
                    v20 /* !! */  = (long)(v21 - eh.xmv("yyx", xms(int ), (int)262));
lbl121:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -442607637: {
                            v21 = eh.xmv("yyy", xms(int ), (int)263);
                            continue block71;
                        }
                        case 273816154: {
                            v21 = eh.xmv("yyz", xms(int ), (int)264);
                            continue block71;
                        }
                        case 920106233: {
                            break block71;
                        }
                        case 1230894912: {
                            v21 = eh.xmv("yza", xms(int ), (int)265);
                            continue block71;
                        }
                    }
                    break;
                }
                v22 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
                v23 /* !! */  = eh.bj;
                if (true) ** GOTO lbl138
                block72: while (true) {
                    v23 /* !! */  = (long)(v24 - eh.xmv("yzb", xms(int ), (int)266));
lbl138:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2044979515: {
                            v24 = eh.xmv("yzc", xms(int ), (int)267);
                            continue block72;
                        }
                        case -524992564: {
                            v24 = eh.xmv("yzd", xms(int ), (int)268);
                            continue block72;
                        }
                        case 739867383: {
                            v24 = eh.xmv("yze", xms(int ), (int)269);
                            continue block72;
                        }
                        case 920106233: {
                            break block72;
                        }
                    }
                    break;
                }
                this.targetSelector.searchTargets(v16, v18, (float)var2_5, v22);
                if (var3_3 || var3_3) ** GOTO lbl21
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = eh.bj - eh.xmv("yzf", xms(int ), (int)270)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == eh.xmv("yzg", xmx(int ), (int)284)) break;
                    v25 /* !! */  = (long)eh.xmv("yzh", xmx(int ), (int)285);
                }
                v26 = var1_4;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = eh.bj - eh.xmv("yzi", xms(int ), (int)271)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == eh.xmv("yzj", xmx(int ), (int)286)) break;
                    v27 /* !! */  = (long)eh.xmv("yzk", xmx(int ), (int)287);
                }
                Objects.requireNonNull(v26);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = eh.bj - eh.xmv("yzl", xms(int ), (int)272)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == eh.xmv("yzm", xmx(int ), (int)288)) break;
                    v28 /* !! */  = (long)eh.xmv("yzn", xmx(int ), (int)289);
                }
                v29 = (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isValid(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)((ik$EntityFilter)v26);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_11 = eh.bj - eh.xmv("yzo", xms(int ), (int)273)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == eh.xmv("yzp", xmx(int ), (int)290)) break;
                    v30 /* !! */  = (long)eh.xmv("yzq", xmx(int ), (int)291);
                }
                this.targetSelector.validateTarget(v29);
                if (var3_3 || var3_3) ** continue;
                v31 /* !! */  = eh.bj;
                if (true) ** GOTO lbl181
                block77: while (true) {
                    v31 /* !! */  = (long)(eh.xmv("yzs", xms(int ), (int)275) - eh.xmv("yzr", xms(int ), (int)274));
lbl181:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -164498980: {
                            continue block77;
                        }
                        case 920106233: {
                            break block77;
                        }
                    }
                    break;
                }
                v32 /* !! */  = eh.bj;
                if (true) ** GOTO lbl190
                block78: while (true) {
                    v32 /* !! */  = (long)(eh.xmv("yzu", xms(int ), (int)277) - eh.xmv("yzt", xms(int ), (int)276));
lbl190:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case 149536817: {
                            continue block78;
                        }
                        case 920106233: {
                            break block78;
                        }
                    }
                    break;
                }
                return this.targetSelector.getCurrentTarget();
            }
            case 0: {
                var4_2 /* !! */  = (int)eh.xmv("yzv", xmx(int ), (int)292);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl201:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)eh.xmv("yzw", xmx(int ), (int)293);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 2: {
                var4_2 /* !! */  = (int)eh.xmv("yzx", xmx(int ), (int)294);
                if (!var5_1) ** GOTO lbl201
                throw null;
            }
lbl210:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)eh.xmv("yzy", xmx(int ), (int)295);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl215:
            // 2 sources

            case 4: {
                do {
                    var4_2 /* !! */  = (int)eh.xmv("yzz", xmx(int ), (int)296);
                } while (!var5_1);
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)eh.xmv("zaa", xmx(int ), (int)297);
                if (var5_1) {
                    throw null;
                }
            }
            case 6: {
                var4_2 /* !! */  = (int)eh.xmv("zab", xmx(int ), (int)298);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 7: {
                var4_2 /* !! */  = (int)eh.xmv("zac", xmx(int ), (int)299);
                if (!var5_1) ** GOTO lbl215
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)eh.xmv("zad", xmx(int ), (int)300);
                    if (!var5_1) break block14;
                    throw null;
                }
            }
lbl238:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)eh.xmv("zae", xmx(int ), (int)301);
                if (!var5_1) break;
                throw null;
            }
lbl242:
            // 2 sources

            case 10: {
                do {
                    var4_2 /* !! */  = (int)eh.xmv("zaf", xmx(int ), (int)302);
                } while (!var5_1);
                throw null;
            }
            case 11: 
        }
        var4_2 /* !! */  = (int)eh.xmv("zag", xmx(int ), (int)303);
        ** while (!var5_1)
lbl250:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void zkk() {
        eh.xmy[300] = -1208817280;
        eh.xmy[301] = -1758619446;
        eh.xmy[302] = 1348343097;
        eh.xmy[303] = -1758022670;
        eh.xmy[304] = 2138242707;
        eh.xmy[305] = -1814883069;
        eh.xmy[306] = -1434104847;
        eh.xmy[307] = 709231544;
        eh.xmy[308] = 1279166697;
        eh.xmy[309] = 305178116;
        eh.xmy[310] = 2135854657;
        eh.xmy[311] = 264806982;
        eh.xmy[312] = 126130311;
        eh.xmy[313] = -315633441;
        eh.xmy[314] = -1544528005;
        eh.xmy[315] = 1530722932;
        eh.xmy[316] = 1176185857;
        eh.xmy[317] = 588365042;
        eh.xmy[318] = 565969106;
        eh.xmy[319] = -1099064511;
        eh.xmy[320] = -899658481;
        eh.xmy[321] = 367109916;
        eh.xmy[322] = -1779869841;
        eh.xmy[323] = -1601874426;
        eh.xmy[324] = -1252193906;
        eh.xmy[325] = 62044321;
        eh.xmy[326] = 1028960051;
        eh.xmy[327] = -2144802647;
        eh.xmy[328] = 1149064942;
        eh.xmy[329] = -1999190768;
        eh.xmy[330] = 1068182699;
        eh.xmy[331] = -1716026302;
        eh.xmy[332] = 1708166903;
        eh.xmy[333] = -1326805549;
        eh.xmy[334] = -1528531141;
        eh.xmy[335] = 1341679609;
        eh.xmy[336] = 972109436;
        eh.xmy[337] = 1686204785;
        eh.xmy[338] = 1363990588;
        eh.xmy[339] = -890565626;
        eh.xmy[340] = 1504712008;
        eh.xmy[341] = -1755164445;
        eh.xmy[342] = 1160439055;
        eh.xmy[343] = 2049167581;
        eh.xmy[344] = 459857626;
        eh.xmy[345] = 2070378757;
        eh.xmy[346] = -1213531381;
        eh.xmy[347] = 1166491016;
        eh.xmy[348] = -461506693;
        eh.xmy[349] = -1522530891;
        eh.xmy[350] = -22186228;
        eh.xmy[351] = 1035675507;
        eh.xmy[352] = 484319840;
        eh.xmy[353] = 274774733;
        eh.xmy[354] = -384729625;
        eh.xmy[355] = 386628537;
        eh.xmy[356] = 1977701228;
        eh.xmy[357] = -1508404268;
        eh.xmy[358] = -327033078;
        eh.xmy[359] = 920816854;
        eh.xmy[360] = -2052646242;
        eh.xmy[361] = -1474572755;
        eh.xmy[362] = 877693518;
        eh.xmy[363] = 1393067043;
        eh.xmy[364] = 1631358693;
        eh.xmy[365] = -1396981873;
        eh.xmy[366] = 2136819574;
        eh.xmy[367] = -1199883167;
        eh.xmy[368] = -1450364407;
        eh.xmy[369] = -1066176818;
        eh.xmy[370] = -1343515370;
        eh.xmy[371] = -360263731;
        eh.xmy[372] = 1719104891;
        eh.xmy[373] = -119853255;
        eh.xmy[374] = 807977882;
        eh.xmy[375] = -13474203;
        eh.xmy[376] = 1448371788;
        eh.xmy[377] = -1655321639;
        eh.xmy[378] = -433403739;
        eh.xmy[379] = -1700085078;
        eh.xmy[380] = -1221095525;
        eh.xmy[381] = 1718912439;
        eh.xmy[382] = -1549570847;
        eh.xmy[383] = 981822097;
        eh.xmy[384] = -1946801516;
        eh.xmy[385] = -742742329;
        eh.xmy[386] = -1361668389;
        eh.xmy[387] = -1234044725;
        eh.xmy[388] = -1692498179;
        eh.xmy[389] = -188684428;
        eh.xmy[390] = 2118606423;
        eh.xmy[391] = 1759954467;
        eh.xmy[392] = -95513789;
        eh.xmy[393] = 242720450;
        eh.xmy[394] = 542827415;
        eh.xmy[395] = 755923050;
        eh.xmy[396] = -1846034161;
        eh.xmy[397] = -1684564079;
        eh.xmy[398] = -203645356;
        eh.xmy[399] = 20945655;
    }

    private static /* synthetic */ void zkz() {
        eh.xmu[300] = 7999506561686370713L;
        eh.xmu[301] = 8744627521555829664L;
        eh.xmu[302] = -9057595765647625683L;
        eh.xmu[303] = 7532113214878634175L;
        eh.xmu[304] = 577604624253224995L;
        eh.xmu[305] = -1557041632490946617L;
        eh.xmu[306] = 4658181646914107262L;
        eh.xmu[307] = -4818802878686857057L;
        eh.xmu[308] = 2878176825003932927L;
        eh.xmu[309] = 8788862685683186874L;
        eh.xmu[310] = -1417161984772588713L;
        eh.xmu[311] = 2212526426451112987L;
        eh.xmu[312] = 8764197890366619258L;
        eh.xmu[313] = 7659741834135174922L;
        eh.xmu[314] = -4252408515266771345L;
        eh.xmu[315] = -8374728830451388667L;
        eh.xmu[316] = -8122326760935855258L;
        eh.xmu[317] = -3939269136987170059L;
        eh.xmu[318] = -6071059952715469041L;
        eh.xmu[319] = 2051080199739294369L;
        eh.xmu[320] = 8303664027020087081L;
        eh.xmu[321] = 7320410969038026087L;
        eh.xmu[322] = 3994453724794989912L;
        eh.xmu[323] = 4221287370058084392L;
        eh.xmu[324] = 3127850197933318203L;
        eh.xmu[325] = 6931277722037167748L;
        eh.xmu[326] = 6479190643318309309L;
        eh.xmu[327] = 7680589276503468871L;
        eh.xmu[328] = 6083867583282220715L;
        eh.xmu[329] = -8825670713422418910L;
        eh.xmu[330] = 6479510481862929287L;
        eh.xmu[331] = -208805954971274083L;
        eh.xmu[332] = -4573188786856598885L;
        eh.xmu[333] = 5579880459642104908L;
        eh.xmu[334] = -8402224372997492912L;
        eh.xmu[335] = -8869411741156522944L;
        eh.xmu[336] = -4296404582522426689L;
        eh.xmu[337] = -1438004144372463680L;
        eh.xmu[338] = -7867285557999506040L;
        eh.xmu[339] = -5064769131494423495L;
        eh.xmu[340] = 2475471339499551459L;
        eh.xmu[341] = 3195624161617591410L;
        eh.xmu[342] = -8937422028668790013L;
        eh.xmu[343] = 5992667843554425442L;
        eh.xmu[344] = -1845220735600617465L;
        eh.xmu[345] = -3468846566979789527L;
        eh.xmu[346] = 4654463893372011183L;
        eh.xmu[347] = 6089064636137181304L;
        eh.xmu[348] = -8614930371016708948L;
        eh.xmu[349] = -5477538638477054984L;
        eh.xmu[350] = 6765789862573833862L;
        eh.xmu[351] = -3381961204869132830L;
        eh.xmu[352] = 1341829275108658506L;
        eh.xmu[353] = 3505350612341957973L;
        eh.xmu[354] = 3300320979000295233L;
        eh.xmu[355] = 1944935925524626240L;
        eh.xmu[356] = -7655785667762157940L;
        eh.xmu[357] = -35169057465506674L;
        eh.xmu[358] = 5693324850854136340L;
        eh.xmu[359] = -7391185625409316519L;
        eh.xmu[360] = -3842436885538231297L;
        eh.xmu[361] = -7791524207099230290L;
        eh.xmu[362] = 8060972678632610069L;
        eh.xmu[363] = -873927756407871795L;
        eh.xmu[364] = 6346113632821100058L;
        eh.xmu[365] = 3239298472488278524L;
        eh.xmu[366] = 304508315868977847L;
        eh.xmu[367] = -4953346401378563475L;
        eh.xmu[368] = -1096507087875180664L;
        eh.xmu[369] = -3417870250384480330L;
        eh.xmu[370] = 1883819323212579679L;
        eh.xmu[371] = -913179160144543857L;
        eh.xmu[372] = -1889781715558445848L;
        eh.xmu[373] = 5556318089508404681L;
        eh.xmu[374] = -4831634051075365154L;
        eh.xmu[375] = -3849433104303859246L;
        eh.xmu[376] = -4394888648773569360L;
        eh.xmu[377] = -4062793963248354800L;
        eh.xmu[378] = -1362932620709523141L;
        eh.xmu[379] = 2749082727057403353L;
        eh.xmu[380] = -9133574565886050075L;
        eh.xmu[381] = 9102835551549884278L;
        eh.xmu[382] = 7864974029151378158L;
        eh.xmu[383] = 7063598290887340074L;
        eh.xmu[384] = -7106664277266912343L;
        eh.xmu[385] = 8390702539918458224L;
        eh.xmu[386] = 5691103217831265573L;
        eh.xmu[387] = -5045959208974876293L;
        eh.xmu[388] = 8324348398303233033L;
        eh.xmu[389] = -2339379237510503255L;
        eh.xmu[390] = 630005365433704728L;
        eh.xmu[391] = -1564639604478191902L;
        eh.xmu[392] = -2940172252238116637L;
        eh.xmu[393] = 966727256640517865L;
        eh.xmu[394] = -4195911401155752321L;
        eh.xmu[395] = -1416600976372377251L;
        eh.xmu[396] = -9174088739183451120L;
        eh.xmu[397] = -5066925050835890855L;
        eh.xmu[398] = 4302860983340068617L;
        eh.xmu[399] = -8945146510294203119L;
    }

    private static /* synthetic */ void zku() {
        eh.xmt[300] = 2160731746643072715L;
        eh.xmt[301] = -2743459457001288609L;
        eh.xmt[302] = 3228384925455114024L;
        eh.xmt[303] = -8293798187030887175L;
        eh.xmt[304] = -7618445161861946018L;
        eh.xmt[305] = 5940892112107761473L;
        eh.xmt[306] = 6272870539367829132L;
        eh.xmt[307] = 4320059755439482639L;
        eh.xmt[308] = -5659606688133335774L;
        eh.xmt[309] = 1178488323269248922L;
        eh.xmt[310] = 3773623948314386709L;
        eh.xmt[311] = 3406870976262425178L;
        eh.xmt[312] = -4811842207199784219L;
        eh.xmt[313] = 2880619490180842067L;
        eh.xmt[314] = 4545858260031474244L;
        eh.xmt[315] = 3741035600397292134L;
        eh.xmt[316] = 6603132326886424513L;
        eh.xmt[317] = -7762308366535554690L;
        eh.xmt[318] = 3436356370457191902L;
        eh.xmt[319] = -2387332836216437093L;
        eh.xmt[320] = 7737859319756054881L;
        eh.xmt[321] = 5918593348460817654L;
        eh.xmt[322] = 7945430145949011292L;
        eh.xmt[323] = -9185436396154217670L;
        eh.xmt[324] = -8193538286443959200L;
        eh.xmt[325] = 5942840458902407519L;
        eh.xmt[326] = -3397696021614158681L;
        eh.xmt[327] = 2475974611922734717L;
        eh.xmt[328] = 8860282821925095992L;
        eh.xmt[329] = -7916408389826677360L;
        eh.xmt[330] = 1914098091358009571L;
        eh.xmt[331] = 4388490588675459334L;
        eh.xmt[332] = 1073077027281172473L;
        eh.xmt[333] = 7522738768490032541L;
        eh.xmt[334] = -7140954954308684850L;
        eh.xmt[335] = 2120171787000090421L;
        eh.xmt[336] = 7076646920264157538L;
        eh.xmt[337] = 8846671108380163472L;
        eh.xmt[338] = 1612912355187926459L;
        eh.xmt[339] = 4656786382767003420L;
        eh.xmt[340] = -6473485384007208256L;
        eh.xmt[341] = -3430813775993783673L;
        eh.xmt[342] = 6302162341806491098L;
        eh.xmt[343] = -3264469973912222701L;
        eh.xmt[344] = 8414431266869764628L;
        eh.xmt[345] = -6930590616362974564L;
        eh.xmt[346] = -5636218435498469561L;
        eh.xmt[347] = -3837449567643973655L;
        eh.xmt[348] = 3883499846972166343L;
        eh.xmt[349] = 2645000166697138170L;
        eh.xmt[350] = -2521155755180712358L;
        eh.xmt[351] = -7092758836643441066L;
        eh.xmt[352] = -8727795725351116102L;
        eh.xmt[353] = 8738118704634131536L;
        eh.xmt[354] = 1067517648859144561L;
        eh.xmt[355] = -5602427200546442803L;
        eh.xmt[356] = -3792168773418256268L;
        eh.xmt[357] = -218157553585155285L;
        eh.xmt[358] = 6817109767681369947L;
        eh.xmt[359] = -1547501647883305353L;
        eh.xmt[360] = 2785107304368092650L;
        eh.xmt[361] = -6757083929314931496L;
        eh.xmt[362] = -8325604418770355213L;
        eh.xmt[363] = -312842436713640278L;
        eh.xmt[364] = -8041144190280072416L;
        eh.xmt[365] = 6562757359540356459L;
        eh.xmt[366] = 4376705299902332622L;
        eh.xmt[367] = 5020052437659058804L;
        eh.xmt[368] = 2739356521444862816L;
        eh.xmt[369] = -212331568842107519L;
        eh.xmt[370] = -6550936576307254809L;
        eh.xmt[371] = 805389480772618003L;
        eh.xmt[372] = 2081305026383313926L;
        eh.xmt[373] = -4704576306728995314L;
        eh.xmt[374] = -8585368726823955914L;
        eh.xmt[375] = -7991388786082238512L;
        eh.xmt[376] = 5218839403815830893L;
        eh.xmt[377] = -7615596188326981396L;
        eh.xmt[378] = 2284483768150879517L;
        eh.xmt[379] = -8267991262087274004L;
        eh.xmt[380] = -76558543612981268L;
        eh.xmt[381] = 3813666287338979251L;
        eh.xmt[382] = 4074558192188446381L;
        eh.xmt[383] = 1139596265375857430L;
        eh.xmt[384] = -1714673042501773865L;
        eh.xmt[385] = 7079475056362895081L;
        eh.xmt[386] = -581662082456891610L;
        eh.xmt[387] = -1326162698364819467L;
        eh.xmt[388] = -2946020603288669301L;
        eh.xmt[389] = 6746525882999351316L;
        eh.xmt[390] = 7900101176316355090L;
        eh.xmt[391] = -8614422608500173601L;
        eh.xmt[392] = 3117640682874228011L;
        eh.xmt[393] = -5585825657900895233L;
        eh.xmt[394] = 3404278034871518181L;
        eh.xmt[395] = -7978560826835895819L;
        eh.xmt[396] = 2991961146878276774L;
        eh.xmt[397] = -894151189640505740L;
        eh.xmt[398] = 6772758730461144526L;
        eh.xmt[399] = -532176125356956200L;
    }

    private static /* synthetic */ void zky() {
        eh.xmu[200] = -4354420281789128003L;
        eh.xmu[201] = -5315671796782235867L;
        eh.xmu[202] = 2069973757560244945L;
        eh.xmu[203] = 8511338508008895443L;
        eh.xmu[204] = -8689278911537716552L;
        eh.xmu[205] = -1034566300340190224L;
        eh.xmu[206] = 680876765846089361L;
        eh.xmu[207] = -5703928874578525453L;
        eh.xmu[208] = -3374747353579958281L;
        eh.xmu[209] = 6733483793618907446L;
        eh.xmu[210] = -4222676398683547304L;
        eh.xmu[211] = 4871186835398249664L;
        eh.xmu[212] = -1745446509567400020L;
        eh.xmu[213] = -8558371335660328601L;
        eh.xmu[214] = -1340587404540943548L;
        eh.xmu[215] = 3246084725014099051L;
        eh.xmu[216] = -4692421771830093407L;
        eh.xmu[217] = 3390847046435629427L;
        eh.xmu[218] = 2613871185822944436L;
        eh.xmu[219] = 5336802371180294527L;
        eh.xmu[220] = -1578195400287795420L;
        eh.xmu[221] = 8067734927159393185L;
        eh.xmu[222] = 6882727352223762326L;
        eh.xmu[223] = -7730340218874420257L;
        eh.xmu[224] = 7576956127907552302L;
        eh.xmu[225] = 2460171219356083292L;
        eh.xmu[226] = -187131711380360620L;
        eh.xmu[227] = -1109248508808186695L;
        eh.xmu[228] = -5364428720634709064L;
        eh.xmu[229] = -3738042344637270238L;
        eh.xmu[230] = -8493631301302092309L;
        eh.xmu[231] = -1529459057820712813L;
        eh.xmu[232] = -5945161899226857113L;
        eh.xmu[233] = -2553695343838434354L;
        eh.xmu[234] = 2245802904481274597L;
        eh.xmu[235] = -8677830128559206042L;
        eh.xmu[236] = 4079609238483565408L;
        eh.xmu[237] = 5017312585214547476L;
        eh.xmu[238] = -8997573438733071011L;
        eh.xmu[239] = 3284808124808589924L;
        eh.xmu[240] = -7848401096586405821L;
        eh.xmu[241] = 3463796067899204163L;
        eh.xmu[242] = -3714625029497034166L;
        eh.xmu[243] = -8786313277226554608L;
        eh.xmu[244] = -1113266898283692064L;
        eh.xmu[245] = -7351566472674037388L;
        eh.xmu[246] = -2753402913267025507L;
        eh.xmu[247] = 4785596240104405583L;
        eh.xmu[248] = 3183934787494141747L;
        eh.xmu[249] = 1780718545320029545L;
        eh.xmu[250] = 3383931828792142827L;
        eh.xmu[251] = 6188507589326136081L;
        eh.xmu[252] = 4499464795720721057L;
        eh.xmu[253] = -970156221152274602L;
        eh.xmu[254] = -5841121401718395237L;
        eh.xmu[255] = 6899659927334021592L;
        eh.xmu[256] = -2276935787996061253L;
        eh.xmu[257] = 1274638516941860238L;
        eh.xmu[258] = -4891544073586908590L;
        eh.xmu[259] = 6997884299981806967L;
        eh.xmu[260] = -344947262892962453L;
        eh.xmu[261] = 3788968637139175253L;
        eh.xmu[262] = 4421391558259403421L;
        eh.xmu[263] = -3834577297661675489L;
        eh.xmu[264] = -8096556425644339241L;
        eh.xmu[265] = -8283210665515596349L;
        eh.xmu[266] = -3860072644183491595L;
        eh.xmu[267] = -6211146554924627254L;
        eh.xmu[268] = 5816883608934218647L;
        eh.xmu[269] = 7950075511588333397L;
        eh.xmu[270] = -7820971145672033775L;
        eh.xmu[271] = -8237135358326510170L;
        eh.xmu[272] = 250441585335587574L;
        eh.xmu[273] = -8155423839398990924L;
        eh.xmu[274] = -5033339166186818405L;
        eh.xmu[275] = -3670260976914219842L;
        eh.xmu[276] = 10336171606427298L;
        eh.xmu[277] = -6679031231914858248L;
        eh.xmu[278] = 3711400557831146926L;
        eh.xmu[279] = 2145297525383251797L;
        eh.xmu[280] = 534613015551387025L;
        eh.xmu[281] = 6707017455837614124L;
        eh.xmu[282] = 3949725907728755222L;
        eh.xmu[283] = -8324729426517396352L;
        eh.xmu[284] = -5213651050043819792L;
        eh.xmu[285] = -7356905775810700451L;
        eh.xmu[286] = 2818929305513119959L;
        eh.xmu[287] = -6738551126286720761L;
        eh.xmu[288] = 7965978382523316389L;
        eh.xmu[289] = -5820707415834314691L;
        eh.xmu[290] = -8552418709338147642L;
        eh.xmu[291] = -5093631118997449734L;
        eh.xmu[292] = 2037944594469908858L;
        eh.xmu[293] = -4883300354018528270L;
        eh.xmu[294] = -7012030967065610553L;
        eh.xmu[295] = -3639635817213925742L;
        eh.xmu[296] = -76979330533442234L;
        eh.xmu[297] = 8114788227723135834L;
        eh.xmu[298] = 3067168128050200792L;
        eh.xmu[299] = -95219062525189914L;
    }

    private static /* synthetic */ void zkm() {
        eh.xmz[0] = -166454477;
        eh.xmz[1] = -1295009837;
        eh.xmz[2] = -996228943;
        eh.xmz[3] = 310784339;
        eh.xmz[4] = 1852609180;
        eh.xmz[5] = -971745341;
        eh.xmz[6] = -936019423;
        eh.xmz[7] = 1818399389;
        eh.xmz[8] = 743331425;
        eh.xmz[9] = 1789186245;
        eh.xmz[10] = -1312890220;
        eh.xmz[11] = -891931322;
        eh.xmz[12] = 274920358;
        eh.xmz[13] = -1496335852;
        eh.xmz[14] = -428896735;
        eh.xmz[15] = -2115494549;
        eh.xmz[16] = -2109739408;
        eh.xmz[17] = 821949718;
        eh.xmz[18] = 847016351;
        eh.xmz[19] = -1956233574;
        eh.xmz[20] = 407084290;
        eh.xmz[21] = -346853724;
        eh.xmz[22] = -859378313;
        eh.xmz[23] = 1937817382;
        eh.xmz[24] = 294660887;
        eh.xmz[25] = 1395563264;
        eh.xmz[26] = 913427594;
        eh.xmz[27] = 443242298;
        eh.xmz[28] = -1046672021;
        eh.xmz[29] = -242270969;
        eh.xmz[30] = -1176029989;
        eh.xmz[31] = 2119842448;
        eh.xmz[32] = -1972253183;
        eh.xmz[33] = -152365482;
        eh.xmz[34] = -1256375441;
        eh.xmz[35] = -171031107;
        eh.xmz[36] = -564773401;
        eh.xmz[37] = -1712718233;
        eh.xmz[38] = -1928501862;
        eh.xmz[39] = -303882106;
        eh.xmz[40] = 2114722671;
        eh.xmz[41] = -1180753627;
        eh.xmz[42] = -828907171;
        eh.xmz[43] = -283089091;
        eh.xmz[44] = 1275269916;
        eh.xmz[45] = 1547682852;
        eh.xmz[46] = 1383726434;
        eh.xmz[47] = -277854359;
        eh.xmz[48] = -1257917237;
        eh.xmz[49] = 32073913;
        eh.xmz[50] = -1271106240;
        eh.xmz[51] = 1120904257;
        eh.xmz[52] = 1456665211;
        eh.xmz[53] = 1454701424;
        eh.xmz[54] = -675259693;
        eh.xmz[55] = 1856145861;
        eh.xmz[56] = -1368906458;
        eh.xmz[57] = 2033717904;
        eh.xmz[58] = 1685373242;
        eh.xmz[59] = -1468908462;
        eh.xmz[60] = -1111782399;
        eh.xmz[61] = 886646645;
        eh.xmz[62] = -1045852829;
        eh.xmz[63] = -1158423173;
        eh.xmz[64] = -683505310;
        eh.xmz[65] = 305520611;
        eh.xmz[66] = -1439116157;
        eh.xmz[67] = -1289749701;
        eh.xmz[68] = -1884065087;
        eh.xmz[69] = 790614629;
        eh.xmz[70] = 547492167;
        eh.xmz[71] = 1665183218;
        eh.xmz[72] = 1905218522;
        eh.xmz[73] = 909900135;
        eh.xmz[74] = 1833384698;
        eh.xmz[75] = 1797416051;
        eh.xmz[76] = -287983346;
        eh.xmz[77] = -1079536641;
        eh.xmz[78] = 1210723963;
        eh.xmz[79] = -1774101274;
        eh.xmz[80] = 621382195;
        eh.xmz[81] = 332291592;
        eh.xmz[82] = -549508087;
        eh.xmz[83] = 90656515;
        eh.xmz[84] = 160474903;
        eh.xmz[85] = 1410136013;
        eh.xmz[86] = -1139557590;
        eh.xmz[87] = 0xE0A00A0;
        eh.xmz[88] = 1110611260;
        eh.xmz[89] = -873521612;
        eh.xmz[90] = 233209849;
        eh.xmz[91] = 1467165408;
        eh.xmz[92] = -407894213;
        eh.xmz[93] = -1392603454;
        eh.xmz[94] = 1824491996;
        eh.xmz[95] = 159237063;
        eh.xmz[96] = 1606553849;
        eh.xmz[97] = -731501159;
        eh.xmz[98] = 1786635646;
        eh.xmz[99] = 953496740;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getAttackRange() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zhh", xms(int ), (int)378)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zhi", xmx(int ), (int)386)) break;
            v0 /* !! */  = (long)eh.xmv("zhj", xmx(int ), (int)387);
        }
        var3_1 = eh.c;
        v1 /* !! */  = eh.bj;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(eh.xmv("zhl", xms(int ), (int)380) - eh.xmv("zhk", xms(int ), (int)379));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 920106233: {
                    break block11;
                }
                case 1396625870: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = eh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zhm", xms(int ), (int)381)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == eh.xmv("zhn", xmx(int ), (int)388)) break;
            v2 /* !! */  = (long)eh.xmv("zho", xmx(int ), (int)389);
        }
        var1_3 = eh.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zhp", xms(int ), (int)382)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == eh.xmv("zhq", xmx(int ), (int)390)) break;
                    v3 /* !! */  = (long)eh.xmv("zhr", xmx(int ), (int)391);
                }
                return this.attackRange;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eh.xmv("zhs", xmx(int ), (int)392);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl46:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("zht", xmx(int ), (int)393);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("zhu", xmx(int ), (int)394);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eh.xmv("zhv", xmx(int ), (int)395);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void zkj() {
        eh.xmy[200] = -1166393300;
        eh.xmy[201] = 1791019519;
        eh.xmy[202] = -906362997;
        eh.xmy[203] = 189632762;
        eh.xmy[204] = -1706623335;
        eh.xmy[205] = 4439259;
        eh.xmy[206] = 149582926;
        eh.xmy[207] = -1687461576;
        eh.xmy[208] = -464674288;
        eh.xmy[209] = 1635839261;
        eh.xmy[210] = 1078989516;
        eh.xmy[211] = -722104950;
        eh.xmy[212] = -235054929;
        eh.xmy[213] = 1814271691;
        eh.xmy[214] = 45469787;
        eh.xmy[215] = -1491566632;
        eh.xmy[216] = -797948512;
        eh.xmy[217] = 2090808034;
        eh.xmy[218] = -1853777672;
        eh.xmy[219] = -951523882;
        eh.xmy[220] = -2113223997;
        eh.xmy[221] = -345860781;
        eh.xmy[222] = -994634127;
        eh.xmy[223] = 182457086;
        eh.xmy[224] = -1724223261;
        eh.xmy[225] = 777900583;
        eh.xmy[226] = -351465193;
        eh.xmy[227] = 244517840;
        eh.xmy[228] = -1576345;
        eh.xmy[229] = -1145093265;
        eh.xmy[230] = -942944096;
        eh.xmy[231] = -1205608607;
        eh.xmy[232] = -164180688;
        eh.xmy[233] = -379595857;
        eh.xmy[234] = -106109737;
        eh.xmy[235] = -1977112304;
        eh.xmy[236] = 255721264;
        eh.xmy[237] = 123088799;
        eh.xmy[238] = -1037316546;
        eh.xmy[239] = -246240359;
        eh.xmy[240] = 811193554;
        eh.xmy[241] = -1398065890;
        eh.xmy[242] = -789024076;
        eh.xmy[243] = 2138200585;
        eh.xmy[244] = -1374303770;
        eh.xmy[245] = 1231049786;
        eh.xmy[246] = -1454431803;
        eh.xmy[247] = 2017370287;
        eh.xmy[248] = -910441443;
        eh.xmy[249] = -1078417084;
        eh.xmy[250] = -1986737176;
        eh.xmy[251] = -1999732604;
        eh.xmy[252] = -1587481542;
        eh.xmy[253] = -1837109854;
        eh.xmy[254] = -226331710;
        eh.xmy[255] = 1625838386;
        eh.xmy[256] = 1754548667;
        eh.xmy[257] = -497155266;
        eh.xmy[258] = -262228694;
        eh.xmy[259] = -1015336825;
        eh.xmy[260] = -1690064972;
        eh.xmy[261] = 956749476;
        eh.xmy[262] = -1710578027;
        eh.xmy[263] = -315437640;
        eh.xmy[264] = 697048830;
        eh.xmy[265] = -194620758;
        eh.xmy[266] = -1629681571;
        eh.xmy[267] = 464316597;
        eh.xmy[268] = -13950389;
        eh.xmy[269] = 800856957;
        eh.xmy[270] = 517160544;
        eh.xmy[271] = 1678145417;
        eh.xmy[272] = -1854739186;
        eh.xmy[273] = -1591240635;
        eh.xmy[274] = -282780227;
        eh.xmy[275] = -680285593;
        eh.xmy[276] = 1873708332;
        eh.xmy[277] = 997138823;
        eh.xmy[278] = -1304960681;
        eh.xmy[279] = -905524696;
        eh.xmy[280] = -1979499829;
        eh.xmy[281] = 1516122541;
        eh.xmy[282] = -226599944;
        eh.xmy[283] = -783709461;
        eh.xmy[284] = -172018154;
        eh.xmy[285] = -1159313474;
        eh.xmy[286] = 2087860052;
        eh.xmy[287] = -813953985;
        eh.xmy[288] = 547750818;
        eh.xmy[289] = 485558914;
        eh.xmy[290] = -1985135164;
        eh.xmy[291] = 1093637701;
        eh.xmy[292] = -1202553060;
        eh.xmy[293] = -703162514;
        eh.xmy[294] = 787089943;
        eh.xmy[295] = -81904130;
        eh.xmy[296] = -141348176;
        eh.xmy[297] = 406605058;
        eh.xmy[298] = 858144074;
        eh.xmy[299] = -836801455;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ik getTargetSelector() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zeg", xms(int ), (int)347)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zeh", xmx(int ), (int)338)) break;
            v0 /* !! */  = (long)eh.xmv("zei", xmx(int ), (int)339);
        }
        var3_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zej", xms(int ), (int)348)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eh.xmv("zek", xmx(int ), (int)340)) break;
            v1 /* !! */  = (long)eh.xmv("zel", xmx(int ), (int)341);
        }
        var2_2 /* !! */  = eh.b;
        v2 /* !! */  = eh.bj;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(eh.xmv("zen", xms(int ), (int)350) - eh.xmv("zem", xms(int ), (int)349));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -413796396: {
                    continue block12;
                }
                case 920106233: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = eh.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block13;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zeo", xms(int ), (int)351)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == eh.xmv("zep", xmx(int ), (int)342)) break;
                    v3 /* !! */  = (long)eh.xmv("zeq", xmx(int ), (int)343);
                }
                return this.targetSelector;
                case 0: {
                    var2_2 /* !! */  = (int)eh.xmv("zer", xmx(int ), (int)344);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl43:
                // 4 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)eh.xmv("zes", xmx(int ), (int)345);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)eh.xmv("zet", xmx(int ), (int)346);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)eh.xmv("zeu", xmx(int ), (int)347);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ke getOptions() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = bj - eh.xmv("zin", xms(int ), (int)394)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == eh.xmv("zio", xmx(int ), (int)402)) break;
            object = eh.xmv("zip", xmx(int ), (int)403);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = bj - eh.xmv("ziq", xms(int ), (int)395)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == eh.xmv("zir", xmx(int ), (int)404)) break;
            object = eh.xmv("zis", xmx(int ), (int)405);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = bj - eh.xmv("zit", xms(int ), (int)396)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == eh.xmv("ziu", xmx(int ), (int)406)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = eh.xmv("ziv", xmx(int ), (int)407);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = bj;
        boolean bl4 = true;
        block8: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - eh.xmv("ziw", xms(int ), (int)397);
            }
            switch ((int)object) {
                case -965549787: {
                    callSite = eh.xmv("zix", xms(int ), (int)398);
                    continue block8;
                }
                case -612461351: {
                    callSite = eh.xmv("ziy", xms(int ), (int)399);
                    continue block8;
                }
                case 920106233: {
                    return this.options;
                }
            }
            break;
        }
        return this.options;
    }

    private static /* synthetic */ void zks() {
        eh.xmt[100] = -1760588787141358195L;
        eh.xmt[101] = -5490993073795811544L;
        eh.xmt[102] = 2333608639803574023L;
        eh.xmt[103] = -6837307352029593717L;
        eh.xmt[104] = -2626608159927392459L;
        eh.xmt[105] = 2739792555495629910L;
        eh.xmt[106] = 7473945986897925126L;
        eh.xmt[107] = 6355575609624749786L;
        eh.xmt[108] = -5243729147333798095L;
        eh.xmt[109] = -7535529375798835358L;
        eh.xmt[110] = -7961449467949136180L;
        eh.xmt[111] = -3918664428955802956L;
        eh.xmt[112] = 7892789637760477775L;
        eh.xmt[113] = -1506727646312373117L;
        eh.xmt[114] = -6836829476946790875L;
        eh.xmt[115] = 1906955337557432178L;
        eh.xmt[116] = 9048680493794686978L;
        eh.xmt[117] = -27520559193814259L;
        eh.xmt[118] = 6108603531661801238L;
        eh.xmt[119] = 5878335135411389521L;
        eh.xmt[120] = 3290659787233312149L;
        eh.xmt[121] = -598667797458581520L;
        eh.xmt[122] = 2830737825256300029L;
        eh.xmt[123] = 5266175411185567103L;
        eh.xmt[124] = -8336230480881610616L;
        eh.xmt[125] = -6195363384151873999L;
        eh.xmt[126] = 6690824351089591782L;
        eh.xmt[127] = -4012633501033298332L;
        eh.xmt[128] = -7290312990946919816L;
        eh.xmt[129] = 4295062450020955744L;
        eh.xmt[130] = 8954878109856051608L;
        eh.xmt[131] = -909127390255381270L;
        eh.xmt[132] = 7975295011488752221L;
        eh.xmt[133] = -3586207155769166880L;
        eh.xmt[134] = -9061862796127129803L;
        eh.xmt[135] = 17314931641578305L;
        eh.xmt[136] = 6598581568133772827L;
        eh.xmt[137] = 5399736970204398988L;
        eh.xmt[138] = 2442585110305530615L;
        eh.xmt[139] = 4296254279768055497L;
        eh.xmt[140] = -4032403961601825421L;
        eh.xmt[141] = -2457894710614000475L;
        eh.xmt[142] = -1754743871715023511L;
        eh.xmt[143] = 7545997894435630438L;
        eh.xmt[144] = 5803220584661970546L;
        eh.xmt[145] = 7172815441913743523L;
        eh.xmt[146] = 1344218499151818663L;
        eh.xmt[147] = -6467887985961580709L;
        eh.xmt[148] = 7108573955179682487L;
        eh.xmt[149] = -2768994610988951305L;
        eh.xmt[150] = 1028227084806510202L;
        eh.xmt[151] = 1931847007810499257L;
        eh.xmt[152] = 6086849148340812768L;
        eh.xmt[153] = 3178609801376916048L;
        eh.xmt[154] = 7382993881206636344L;
        eh.xmt[155] = -5878990906448917360L;
        eh.xmt[156] = 3436567349433414339L;
        eh.xmt[157] = -3652529460675037400L;
        eh.xmt[158] = 7419693868414115998L;
        eh.xmt[159] = -4913783675528734544L;
        eh.xmt[160] = 1176658273694283403L;
        eh.xmt[161] = 7410632118283644717L;
        eh.xmt[162] = -4810019393489517920L;
        eh.xmt[163] = -5497280094756586293L;
        eh.xmt[164] = 3942521483601300029L;
        eh.xmt[165] = 162451372921244479L;
        eh.xmt[166] = 2072348628387390438L;
        eh.xmt[167] = 3367937043792325332L;
        eh.xmt[168] = 2244393733377833161L;
        eh.xmt[169] = 3335913887933134200L;
        eh.xmt[170] = 4687551550396151492L;
        eh.xmt[171] = 4564654803976698663L;
        eh.xmt[172] = -4587190537623262837L;
        eh.xmt[173] = 7701805412931201845L;
        eh.xmt[174] = -2017352454495971957L;
        eh.xmt[175] = 5477034444016402634L;
        eh.xmt[176] = -9172765799712067395L;
        eh.xmt[177] = 3894758597524393588L;
        eh.xmt[178] = -4337411438681822393L;
        eh.xmt[179] = 446729286442717081L;
        eh.xmt[180] = -5051920426826086848L;
        eh.xmt[181] = 6106133155557169598L;
        eh.xmt[182] = 8467761925569511630L;
        eh.xmt[183] = 7944313441127442481L;
        eh.xmt[184] = 6298604584642107506L;
        eh.xmt[185] = 3012138790868113289L;
        eh.xmt[186] = -819371934026420252L;
        eh.xmt[187] = -4061507268341188154L;
        eh.xmt[188] = -6220080982906582164L;
        eh.xmt[189] = -2683322708744300141L;
        eh.xmt[190] = -2835061389404607569L;
        eh.xmt[191] = -7022872775995205896L;
        eh.xmt[192] = 8233288476403319895L;
        eh.xmt[193] = -4528905994215054606L;
        eh.xmt[194] = 6177636480897092782L;
        eh.xmt[195] = 1537489221077813948L;
        eh.xmt[196] = -5122677150805409035L;
        eh.xmt[197] = 612361019965860147L;
        eh.xmt[198] = 6710143632662811297L;
        eh.xmt[199] = 691813118232365931L;
    }

    private static /* synthetic */ void zla() {
        eh.xmu[400] = 3843803749183031945L;
        eh.xmu[401] = 6601238295258110544L;
        eh.xmu[402] = 2921819946919817056L;
        eh.xmu[403] = 4114642378658838501L;
        eh.xmu[404] = 7945005433702901156L;
        eh.xmu[405] = -1513314378231415188L;
        eh.xmu[406] = 3853491517877688970L;
        eh.xmu[407] = -2688307463978928812L;
        eh.xmu[408] = -3384045108002887937L;
        eh.xmu[409] = 681746541302377199L;
        eh.xmu[410] = 3682809784780422978L;
        eh.xmu[411] = -5527666521822358583L;
        eh.xmu[412] = 4465918051629254142L;
        eh.xmu[413] = 5918895133337521797L;
    }

    private static /* synthetic */ void zkx() {
        eh.xmu[100] = -3493275025745593920L;
        eh.xmu[101] = -3092128608964143667L;
        eh.xmu[102] = 9163802715076800452L;
        eh.xmu[103] = -1873859371548022021L;
        eh.xmu[104] = 6278838449833060352L;
        eh.xmu[105] = -6338241553880027396L;
        eh.xmu[106] = -5602123580627343638L;
        eh.xmu[107] = 806022320827967390L;
        eh.xmu[108] = -4961855565736982323L;
        eh.xmu[109] = -9186523157375349589L;
        eh.xmu[110] = 1959687590536005604L;
        eh.xmu[111] = 1542869978314494409L;
        eh.xmu[112] = -5460057603250976147L;
        eh.xmu[113] = -4515625589767795061L;
        eh.xmu[114] = 5454397070133549494L;
        eh.xmu[115] = 742775051913351624L;
        eh.xmu[116] = -5456697726084402001L;
        eh.xmu[117] = -3496028168249890298L;
        eh.xmu[118] = -1285322387555132392L;
        eh.xmu[119] = -6408989384041691069L;
        eh.xmu[120] = 7160584698390838491L;
        eh.xmu[121] = -401407860006352142L;
        eh.xmu[122] = -6104496745003869002L;
        eh.xmu[123] = -6131713913831099069L;
        eh.xmu[124] = -7939592905115511129L;
        eh.xmu[125] = -4821107825228565155L;
        eh.xmu[126] = -5159147929106037923L;
        eh.xmu[127] = 3374629239281535126L;
        eh.xmu[128] = -2924990261621972726L;
        eh.xmu[129] = 4200336423474106182L;
        eh.xmu[130] = 6487209952330664755L;
        eh.xmu[131] = -7687555725197010867L;
        eh.xmu[132] = -5500651486725761829L;
        eh.xmu[133] = 8291928631709434332L;
        eh.xmu[134] = -103961660754021941L;
        eh.xmu[135] = 7407173970658768170L;
        eh.xmu[136] = 4163728508237935903L;
        eh.xmu[137] = -3232972969330677536L;
        eh.xmu[138] = -7596077080948010801L;
        eh.xmu[139] = 2773609058574781075L;
        eh.xmu[140] = 5234312637501735917L;
        eh.xmu[141] = 4522114102313298442L;
        eh.xmu[142] = 1313369630431069596L;
        eh.xmu[143] = 4662293695395126488L;
        eh.xmu[144] = 5467601830497048000L;
        eh.xmu[145] = 167242607785937936L;
        eh.xmu[146] = 8244660707142462021L;
        eh.xmu[147] = 2159438396104232638L;
        eh.xmu[148] = 5609755244253106069L;
        eh.xmu[149] = 5015668495733327695L;
        eh.xmu[150] = 3185230780160916499L;
        eh.xmu[151] = 5807304210815285524L;
        eh.xmu[152] = -1889100150449402320L;
        eh.xmu[153] = -6765339533592348204L;
        eh.xmu[154] = -2601090138666698524L;
        eh.xmu[155] = -3583272702025548136L;
        eh.xmu[156] = -6613918831121313052L;
        eh.xmu[157] = 6365413090067148600L;
        eh.xmu[158] = -758096074713921830L;
        eh.xmu[159] = 4812120230673441717L;
        eh.xmu[160] = 7331241245245348342L;
        eh.xmu[161] = -5916498088786927825L;
        eh.xmu[162] = 2402651272800541913L;
        eh.xmu[163] = -4110832317562524980L;
        eh.xmu[164] = -128156701111072017L;
        eh.xmu[165] = 5741824137556481986L;
        eh.xmu[166] = -295208875711631030L;
        eh.xmu[167] = 1844284930105413258L;
        eh.xmu[168] = -2394384727021157845L;
        eh.xmu[169] = 1119465586078440928L;
        eh.xmu[170] = 8513531636358431168L;
        eh.xmu[171] = 581135353826554005L;
        eh.xmu[172] = 5435087721935053192L;
        eh.xmu[173] = 3110054128089204890L;
        eh.xmu[174] = 6573355257191461259L;
        eh.xmu[175] = 5198124621811226305L;
        eh.xmu[176] = -969476487036835473L;
        eh.xmu[177] = -7902198457463597214L;
        eh.xmu[178] = -7766566098841745816L;
        eh.xmu[179] = -5210992248078208792L;
        eh.xmu[180] = -1643585919492214179L;
        eh.xmu[181] = -7098683564829303213L;
        eh.xmu[182] = -7946483043585911941L;
        eh.xmu[183] = -3482364911687249202L;
        eh.xmu[184] = 4742855217240578181L;
        eh.xmu[185] = -7415890276451597216L;
        eh.xmu[186] = 6888794879366186338L;
        eh.xmu[187] = 8944180936230096261L;
        eh.xmu[188] = 488960720490860313L;
        eh.xmu[189] = -41480301808968564L;
        eh.xmu[190] = -3784196231282658242L;
        eh.xmu[191] = -6443271748895153616L;
        eh.xmu[192] = -9127819801544172184L;
        eh.xmu[193] = -6590999207911513545L;
        eh.xmu[194] = -5159990526670832918L;
        eh.xmu[195] = -7762088131435804625L;
        eh.xmu[196] = -2502783984125893861L;
        eh.xmu[197] = -795237972047164989L;
        eh.xmu[198] = -219304213623910120L;
        eh.xmu[199] = 5078404724068034597L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public eh() {
        var2_1 /* !! */  = eh.b;
        var1_2 = eh.a;
        super("LegitAura", "\u0422\u043e\u0447\u043d\u043e \u0442\u0430\u043a\u0430\u044f-\u0436\u0435 killaura \u043d\u043e \u0441 \u0437\u0430\u043a\u043e\u0441\u043e\u043c \u043d\u0430 \u043b\u0435\u0433\u0438\u0442", du.LEGIT);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.targetSelector = new ik();
                this.pointFinder = new ox();
                this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043d\u0430\u0432\u043e\u0434\u043a\u0438", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043d\u0430\u0432\u043e\u0434\u043a\u0438 \u043d\u0430 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c", (float)eh.xmv("xnq", xnp(int ), (int)8)).range((float)eh.xmv("xnr", xnp(int ), (int)9), (float)eh.xmv("xns", xnp(int ), (int)10)).step((float)eh.xmv("xnt", xnp(int ), (int)11));
                this.attackRange = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u043e\u0432", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u043e\u0432", (float)eh.xmv("xnu", xnp(int ), (int)12)).range((float)eh.xmv("xnv", xnp(int ), (int)13), (float)eh.xmv("xnw", xnp(int ), (int)14)).step((float)eh.xmv("xnx", xnp(int ), (int)15));
                this.targetType = new ke("\u0412\u044b\u0431\u043e\u0440 \u0442\u0430\u0440\u0433\u0435\u0442\u043e\u0432", "\u0412\u044b\u0431\u043e\u0440 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439 \u0434\u043b\u044f \u0442\u0430\u0440\u0433\u0435\u0442\u0430").value(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438", "\u041c\u043e\u0431\u044b"}).selected(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438"});
                this.options = new ke("\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u043c\u043e\u0434\u0443\u043b\u044f").value(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438", "\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", "\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442"}).selected(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438"});
                this.onlyCriticals = new kb("\u0423\u043c\u043d\u044b\u0435 \u043a\u0440\u0438\u0442\u044b", "\u041f\u0440\u0435\u0434\u0441\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0438\u0439 \u043f\u043e\u0434\u0445\u043e\u0434\u044f\u0449\u0438\u0439 \u0442\u0438\u043a \u0434\u043b\u044f \u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u0443\u0434\u0430\u0440\u0430").setValue((boolean)eh.xmv("xny", xmx(int ), (int)16));
                this.pitchCorrecting = new kb("\u041d\u0430\u0432\u043e\u0434\u0438\u0442\u044c \u043f\u0438\u0442\u0447", "\u0412\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u043d\u0430\u0432\u043e\u0434\u043a\u0443 \u043f\u0438\u0442\u0447\u0430 (\u043f\u043e \u0432\u044b\u0441\u043e\u0442\u0435)").setValue((boolean)eh.xmv("xnz", xmx(int ), (int)17));
                this.settings(new jx[]{this.attackRange, this.speed, this.targetType, this.options, this.onlyCriticals, this.pitchCorrecting});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)eh.xmv("xoa", xmx(int ), (int)18);
                ** GOTO lbl46
            }
lbl20:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)eh.xmv("xob", xmx(int ), (int)19);
                ** GOTO lbl26
            }
            case 2: {
                var2_1 /* !! */  = (int)eh.xmv("xoc", xmx(int ), (int)20);
                ** GOTO lbl40
            }
lbl26:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)eh.xmv("xod", xmx(int ), (int)21);
                break;
            }
lbl29:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)eh.xmv("xoe", xmx(int ), (int)22);
                ** GOTO lbl20
            }
            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)eh.xmv("xof", xmx(int ), (int)23);
                }
            }
lbl36:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)eh.xmv("xog", xmx(int ), (int)24);
                    ** GOTO lbl29
                    break;
                }
            }
lbl40:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)eh.xmv("xoh", xmx(int ), (int)25);
                ** GOTO lbl36
            }
            case 8: {
                var2_1 /* !! */  = (int)eh.xmv("xoi", xmx(int ), (int)26);
                ** GOTO lbl26
            }
lbl46:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)eh.xmv("xoj", xmx(int ), (int)27);
            }
            case 10: {
                var2_1 /* !! */  = (int)eh.xmv("xok", xmx(int ), (int)28);
                ** GOTO lbl26
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)eh.xmv("xol", xmx(int ), (int)29);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getSpeed() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zgq", xms(int ), (int)371)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zgr", xmx(int ), (int)376)) break;
            v0 /* !! */  = (long)eh.xmv("zgs", xmx(int ), (int)377);
        }
        var3_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zgt", xms(int ), (int)372)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eh.xmv("zgu", xmx(int ), (int)378)) break;
            v1 /* !! */  = (long)eh.xmv("zgv", xmx(int ), (int)379);
        }
        var2_2 /* !! */  = eh.b;
        v2 /* !! */  = eh.bj;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - eh.xmv("zgw", xms(int ), (int)373));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1275685720: {
                    v3 = eh.xmv("zgx", xms(int ), (int)374);
                    continue block14;
                }
                case 180470935: {
                    v3 = eh.xmv("zgy", xms(int ), (int)375);
                    continue block14;
                }
                case 920106233: {
                    break block14;
                }
                case 1388380748: {
                    v3 = eh.xmv("zgz", xms(int ), (int)376);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = eh.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zha", xms(int ), (int)377)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == eh.xmv("zhb", xmx(int ), (int)380)) break;
                    v4 /* !! */  = (long)eh.xmv("zhc", xmx(int ), (int)381);
                }
                return this.speed;
            }
            case 0: {
                var2_2 /* !! */  = (int)eh.xmv("zhd", xmx(int ), (int)382);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("zhe", xmx(int ), (int)383);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("zhf", xmx(int ), (int)384);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)eh.xmv("zhg", xmx(int ), (int)385);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zfj", xms(int ), (int)360)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zfk", xmx(int ), (int)354)) break;
            v0 /* !! */  = (long)eh.xmv("zfl", xmx(int ), (int)355);
        }
        var3_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zfm", xms(int ), (int)361)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eh.xmv("zfn", xmx(int ), (int)356)) break;
            v1 /* !! */  = (long)eh.xmv("zfo", xmx(int ), (int)357);
        }
        var2_2 /* !! */  = eh.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zfp", xms(int ), (int)362)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == eh.xmv("zfq", xmx(int ), (int)358)) break;
                    v2 /* !! */  = (long)eh.xmv("zfr", xmx(int ), (int)359);
                }
                var1_3 = eh.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = eh.bj;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - eh.xmv("zfs", xms(int ), (int)363));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -257159856: {
                            v4 = eh.xmv("zft", xms(int ), (int)364);
                            continue block16;
                        }
                        case 133128925: {
                            v4 = eh.xmv("zfu", xms(int ), (int)365);
                            continue block16;
                        }
                        case 920106233: {
                            break block16;
                        }
                        case 1693190549: {
                            v4 = eh.xmv("zfv", xms(int ), (int)366);
                            continue block16;
                        }
                    }
                    break;
                }
                return this.target;
            }
            case 0: {
                var2_2 /* !! */  = (int)eh.xmv("zfw", xmx(int ), (int)360);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("zfx", xmx(int ), (int)361);
                if (var3_1) {
                    throw null;
                }
            }
lbl56:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)eh.xmv("zfy", xmx(int ), (int)362);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eh.xmv("zfz", xmx(int ), (int)363);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public os getRotationConfig() {
        v0 /* !! */  = eh.bj;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - eh.xmv("xzu", xms(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1789951371: {
                    v1 = eh.xmv("xzv", xms(int ), (int)157);
                    continue block18;
                }
                case -823142902: {
                    v1 = eh.xmv("xzw", xms(int ), (int)158);
                    continue block18;
                }
                case 920106233: {
                    break block18;
                }
            }
            break;
        }
        var4_1 = eh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("xzx", xms(int ), (int)159)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eh.xmv("xzy", xmx(int ), (int)176)) break;
            v2 /* !! */  = (long)eh.xmv("xzz", xmx(int ), (int)177);
        }
        var3_2 /* !! */  = eh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("yaa", xms(int ), (int)160)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eh.xmv("yab", xmx(int ), (int)178)) {
                var2_3 = eh.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)eh.xmv("yac", xmx(int ), (int)179);
        }
        if (var2_3 != false) return null;
        if (var2_3 != false) return null;
        var1_4 = eh.xmv("yad", xmx(int ), (int)180);
        if (var2_3 != false) return null;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: while (true) {
            block34: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3 != false) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("yae", xms(int ), (int)161)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != eh.xmv("yaf", xmx(int ), (int)181)) {
                                v4 /* !! */  = (long)eh.xmv("yag", xmx(int ), (int)182);
                                continue;
                            }
                            ** GOTO lbl63
                            break;
                        }
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)eh.xmv("yqp", xmx(int ), (int)187);
                        cfr_temp_0 = 4;
                        if (var4_1) {
                            throw null;
                        }
                        break block34;
                    }
                    case 2: {
                        ** GOTO lbl58
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)eh.xmv("yqv", xmx(int ), (int)192);
                        if (var4_1) {
                            throw null;
                        }
lbl58:
                        // 3 sources

                        var3_2 /* !! */  = (int)eh.xmv("yqr", xmx(int ), (int)189);
                        cfr_temp_0 = 3;
                        if (var4_1) {
                            throw null;
                        }
                        break block34;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("yah", xms(int ), (int)162)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  != eh.xmv("yqh", xmx(int ), (int)183)) ** GOTO lbl71
                        v6 = this.getSmoothMode();
                        v7 = eh.xmv("yqk", xmx(int ), (int)185);
                        v8 = eh.xmv("yql", xmx(int ), (int)186);
                        v9 /* !! */  = eh.bj;
                        if (true) ** GOTO lbl75
lbl71:
                        // 1 sources

                        v5 /* !! */  = (long)eh.xmv("yqj", xmx(int ), (int)184);
                    }
                    block24: while (true) {
                        v9 /* !! */  = (long)(v10 - eh.xmv("yqm", xms(int ), (int)163));
lbl75:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1372673699: {
                                v10 = eh.xmv("yqn", xms(int ), (int)164);
                                continue block24;
                            }
                            case 792812283: {
                                v10 = eh.xmv("yqo", xms(int ), (int)165);
                                continue block24;
                            }
                            case 920106233: {
                                return new os(v6, (boolean)v7, (boolean)var1_4, (boolean)v8);
                            }
                        }
                        break;
                    }
                    return new os(v6, (boolean)v7, (boolean)var1_4, (boolean)v8);
                    case 1: {
                        var3_2 /* !! */  = (int)eh.xmv("yqq", xmx(int ), (int)188);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)eh.xmv("yqs", xmx(int ), (int)190);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl98
            }
            do {
                if (true) continue block21;
lbl98:
                // 2 sources

                var3_2 /* !! */  = (int)eh.xmv("yqt", xmx(int ), (int)191);
                cfr_temp_0 = 1;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void zki() {
        eh.xmy[100] = -1227152483;
        eh.xmy[101] = -1730767687;
        eh.xmy[102] = 762259505;
        eh.xmy[103] = -14747811;
        eh.xmy[104] = 977930253;
        eh.xmy[105] = -1646229085;
        eh.xmy[106] = 784989621;
        eh.xmy[107] = -808745056;
        eh.xmy[108] = -1926660605;
        eh.xmy[109] = -148343106;
        eh.xmy[110] = 425277609;
        eh.xmy[111] = -1795367438;
        eh.xmy[112] = -796889605;
        eh.xmy[113] = 170480928;
        eh.xmy[114] = -478065875;
        eh.xmy[115] = 184946098;
        eh.xmy[116] = 1708290467;
        eh.xmy[117] = 1034682407;
        eh.xmy[118] = 2073306781;
        eh.xmy[119] = 831210415;
        eh.xmy[120] = 2059066644;
        eh.xmy[121] = 1952520184;
        eh.xmy[122] = -34383719;
        eh.xmy[123] = 1130351793;
        eh.xmy[124] = -318583948;
        eh.xmy[125] = -1514294279;
        eh.xmy[126] = -563336122;
        eh.xmy[127] = 1770240342;
        eh.xmy[128] = -1406158313;
        eh.xmy[129] = 314650034;
        eh.xmy[130] = -1322795417;
        eh.xmy[131] = -1155017863;
        eh.xmy[132] = 1117643424;
        eh.xmy[133] = -891982163;
        eh.xmy[134] = 20749616;
        eh.xmy[135] = 1254912676;
        eh.xmy[136] = -1659576325;
        eh.xmy[137] = 558215024;
        eh.xmy[138] = 199681334;
        eh.xmy[139] = 2129096407;
        eh.xmy[140] = -1217545424;
        eh.xmy[141] = 407505640;
        eh.xmy[142] = -625562797;
        eh.xmy[143] = -320206294;
        eh.xmy[144] = 1933099420;
        eh.xmy[145] = -453873109;
        eh.xmy[146] = -2116105242;
        eh.xmy[147] = -699976499;
        eh.xmy[148] = 473106261;
        eh.xmy[149] = -1374672862;
        eh.xmy[150] = -745750781;
        eh.xmy[151] = -348313514;
        eh.xmy[152] = -2099799423;
        eh.xmy[153] = 252500286;
        eh.xmy[154] = 1941105095;
        eh.xmy[155] = -1164021833;
        eh.xmy[156] = 40493531;
        eh.xmy[157] = 735006590;
        eh.xmy[158] = 1488583147;
        eh.xmy[159] = 1187121349;
        eh.xmy[160] = 802957482;
        eh.xmy[161] = 1635360624;
        eh.xmy[162] = -795494955;
        eh.xmy[163] = 806950844;
        eh.xmy[164] = -1574056609;
        eh.xmy[165] = -625495355;
        eh.xmy[166] = 1940755433;
        eh.xmy[167] = 552320259;
        eh.xmy[168] = 1821007878;
        eh.xmy[169] = 2027383643;
        eh.xmy[170] = 1572182958;
        eh.xmy[171] = 1024616940;
        eh.xmy[172] = -422245058;
        eh.xmy[173] = -1010040370;
        eh.xmy[174] = -911263910;
        eh.xmy[175] = 2047680368;
        eh.xmy[176] = -1737355471;
        eh.xmy[177] = 1831044136;
        eh.xmy[178] = -1385730082;
        eh.xmy[179] = 1154274237;
        eh.xmy[180] = 1282832919;
        eh.xmy[181] = -1660374518;
        eh.xmy[182] = 1514690031;
        eh.xmy[183] = -1437083670;
        eh.xmy[184] = -1985493823;
        eh.xmy[185] = 1178995525;
        eh.xmy[186] = 2041042452;
        eh.xmy[187] = -168390589;
        eh.xmy[188] = -1229021227;
        eh.xmy[189] = -495365390;
        eh.xmy[190] = -316398588;
        eh.xmy[191] = 1647438015;
        eh.xmy[192] = -1717903604;
        eh.xmy[193] = 804736782;
        eh.xmy[194] = -2081953993;
        eh.xmy[195] = -114713592;
        eh.xmy[196] = 1650246576;
        eh.xmy[197] = -1711858765;
        eh.xmy[198] = -138403719;
        eh.xmy[199] = -1921195776;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = eh.bj;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(v1 - eh.xmv("xqc", xms(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1930775693: {
                    v1 = eh.xmv("xqd", xms(int ), (int)32);
                    continue block62;
                }
                case -1426387520: {
                    v1 = eh.xmv("xqe", xms(int ), (int)33);
                    continue block62;
                }
                case 774467706: {
                    v1 = eh.xmv("xqf", xms(int ), (int)34);
                    continue block62;
                }
                case 920106233: {
                    break block62;
                }
            }
            break;
        }
        var3_1 = eh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("xqg", xms(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eh.xmv("xqh", xmx(int ), (int)49)) break;
            v2 /* !! */  = (long)eh.xmv("xqi", xmx(int ), (int)50);
        }
        var2_2 /* !! */  = eh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("xqj", xms(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eh.xmv("xqk", xmx(int ), (int)51)) break;
            v3 /* !! */  = (long)eh.xmv("xql", xmx(int ), (int)52);
        }
        var1_3 = eh.a;
        if (var3_1) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = eh.bj;
        if (true) ** GOTO lbl39
        block66: while (true) {
            v4 /* !! */  = (long)(v5 - eh.xmv("xqm", xms(int ), (int)37));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2123430308: {
                    v5 = eh.xmv("xqn", xms(int ), (int)38);
                    continue block66;
                }
                case -1362989202: {
                    v5 = eh.xmv("xqo", xms(int ), (int)39);
                    continue block66;
                }
                case 607911482: {
                    v5 = eh.xmv("xqp", xms(int ), (int)40);
                    continue block66;
                }
                case 920106233: {
                    break block66;
                }
            }
            break;
        }
        v6 /* !! */  = eh.bj;
        if (true) ** GOTO lbl55
        block67: while (true) {
            v6 /* !! */  = (long)(v7 - eh.xmv("xqq", xms(int ), (int)41));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 773093378: {
                    v7 = eh.xmv("xqr", xms(int ), (int)42);
                    continue block67;
                }
                case 895678657: {
                    v7 = eh.xmv("xqs", xms(int ), (int)43);
                    continue block67;
                }
                case 920106233: {
                    break block67;
                }
                case 990103236: {
                    v7 = eh.xmv("xqt", xms(int ), (int)44);
                    continue block67;
                }
            }
            break;
        }
        this.targetSelector.releaseTarget();
        if (var1_3 || var1_3) ** GOTO lbl32
        v8 /* !! */  = eh.bj;
        if (true) ** GOTO lbl73
        block68: while (true) {
            v8 /* !! */  = (long)(v9 - eh.xmv("xqu", xms(int ), (int)45));
lbl73:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -856347310: {
                    v9 = eh.xmv("xqv", xms(int ), (int)46);
                    continue block68;
                }
                case 920106233: {
                    break block68;
                }
                case 993720341: {
                    v9 = eh.xmv("xqw", xms(int ), (int)47);
                    continue block68;
                }
                case 1415607085: {
                    v9 = eh.xmv("xqx", xms(int ), (int)48);
                    continue block68;
                }
            }
            break;
        }
        this.target = null;
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("xqy", xms(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == eh.xmv("xqz", xmx(int ), (int)53)) break;
            v10 /* !! */  = (long)eh.xmv("xra", xmx(int ), (int)54);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("xrb", xms(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == eh.xmv("xrc", xmx(int ), (int)55)) break;
            v11 /* !! */  = (long)eh.xmv("xrd", xmx(int ), (int)56);
        }
        v12 = eh.mc.field_1724;
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("xre", xms(int ), (int)51)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == eh.xmv("xrf", xmx(int ), (int)57)) break;
            v13 /* !! */  = (long)eh.xmv("xrg", xmx(int ), (int)58);
        }
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_5 = eh.bj - eh.xmv("xrh", xms(int ), (int)52)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == eh.xmv("xri", xmx(int ), (int)59)) break;
            v14 /* !! */  = (long)eh.xmv("xrj", xmx(int ), (int)60);
        }
        v15 = ot.INSTANCE.getRotation();
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_6 = eh.bj - eh.xmv("xrk", xms(int ), (int)53)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == eh.xmv("xrl", xmx(int ), (int)61)) break;
            v16 /* !! */  = (long)eh.xmv("xrm", xmx(int ), (int)62);
        }
        v17 = v15.getYaw();
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_7 = eh.bj - eh.xmv("xrn", xms(int ), (int)54)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == eh.xmv("xro", xmx(int ), (int)63)) break;
            v18 /* !! */  = (long)eh.xmv("xrp", xmx(int ), (int)64);
        }
        v12.method_36456(v17);
        if (var1_3 || var1_3) ** GOTO lbl32
        v19 /* !! */  = eh.bj;
        if (true) ** GOTO lbl126
        block75: while (true) {
            v19 /* !! */  = (long)(eh.xmv("xrr", xms(int ), (int)56) - eh.xmv("xrq", xms(int ), (int)55));
lbl126:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 920106233: {
                    break block75;
                }
                case 1451603833: {
                    continue block75;
                }
            }
            break;
        }
        v20 /* !! */  = eh.bj;
        if (true) ** GOTO lbl135
        block76: while (true) {
            v20 /* !! */  = (long)(v21 - eh.xmv("xrs", xms(int ), (int)57));
lbl135:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -908299777: {
                    v21 = eh.xmv("xrt", xms(int ), (int)58);
                    continue block76;
                }
                case -881914004: {
                    v21 = eh.xmv("xru", xms(int ), (int)59);
                    continue block76;
                }
                case 920106233: {
                    break block76;
                }
            }
            break;
        }
        v22 = eh.mc.field_1724;
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_8 = eh.bj - eh.xmv("xrv", xms(int ), (int)60)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == eh.xmv("xrw", xmx(int ), (int)65)) break;
            v23 /* !! */  = (long)eh.xmv("xrx", xmx(int ), (int)66);
        }
        v24 /* !! */  = eh.bj;
        if (true) ** GOTO lbl154
        block78: while (true) {
            v24 /* !! */  = (long)(eh.xmv("xrz", xms(int ), (int)62) - eh.xmv("xry", xms(int ), (int)61));
lbl154:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -126273947: {
                    continue block78;
                }
                case 920106233: {
                    break block78;
                }
            }
            break;
        }
        v25 = ot.INSTANCE.getRotation();
        v26 /* !! */  = eh.bj;
        if (true) ** GOTO lbl164
        block79: while (true) {
            v26 /* !! */  = (long)(v27 - eh.xmv("xsa", xms(int ), (int)63));
lbl164:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case 905460109: {
                    v27 = eh.xmv("xsb", xms(int ), (int)64);
                    continue block79;
                }
                case 920106233: {
                    break block79;
                }
                case 1820843335: {
                    v27 = eh.xmv("xsc", xms(int ), (int)65);
                    continue block79;
                }
            }
            break;
        }
        v28 = v25.getPitch();
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_9 = eh.bj - eh.xmv("xsd", xms(int ), (int)66)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == eh.xmv("xse", xmx(int ), (int)67)) break;
            v29 /* !! */  = (long)eh.xmv("xsf", xmx(int ), (int)68);
        }
        v22.method_36457(v28);
        if (var1_3 || var1_3) ** GOTO lbl32
        v30 /* !! */  = eh.bj;
        if (true) ** GOTO lbl185
        block81: while (true) {
            v30 /* !! */  = (long)(eh.xmv("xsh", xms(int ), (int)68) - eh.xmv("xsg", xms(int ), (int)67));
lbl185:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case 920106233: {
                    break block81;
                }
                case 976036854: {
                    continue block81;
                }
            }
            break;
        }
        super.deactivate();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl196:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)eh.xmv("xsi", xmx(int ), (int)69);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("xsj", xmx(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("xsk", xmx(int ), (int)71);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 3: {
                var2_2 /* !! */  = (int)eh.xmv("xsl", xmx(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)eh.xmv("xsm", xmx(int ), (int)73);
                if (!var3_1) break;
                throw null;
            }
lbl219:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)eh.xmv("xsn", xmx(int ), (int)74);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl224:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eh.xmv("xso", xmx(int ), (int)75);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl253
                    break;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)eh.xmv("xsp", xmx(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)eh.xmv("xsq", xmx(int ), (int)77);
                } while (!var3_1);
                throw null;
            }
lbl240:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)eh.xmv("xsr", xmx(int ), (int)78);
                if (!var3_1) ** GOTO lbl196
                throw null;
            }
lbl244:
            // 2 sources

            case 10: {
                do {
                    var2_2 /* !! */  = (int)eh.xmv("xss", xmx(int ), (int)79);
                } while (!var3_1);
                throw null;
            }
lbl249:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)eh.xmv("xst", xmx(int ), (int)80);
                if (!var3_1) ** GOTO lbl196
                throw null;
            }
lbl253:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)eh.xmv("xsu", xmx(int ), (int)81);
                if (!var3_1) ** GOTO lbl249
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)eh.xmv("xsv", xmx(int ), (int)82);
        ** while (!var3_1)
lbl260:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateToTarget(hv$AttackPerpetratorConfigurable var1_1) {
        v0 /* !! */  = eh.bj;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(eh.xmv("xxl", xms(int ), (int)126) - eh.xmv("xxk", xms(int ), (int)125));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -650899678: {
                    continue block57;
                }
                case 920106233: {
                    break block57;
                }
            }
            break;
        }
        var8_2 = eh.c;
        v1 /* !! */  = eh.bj;
        if (true) ** GOTO lbl15
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - eh.xmv("xxm", xms(int ), (int)127));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 807989174: {
                    v2 = eh.xmv("xxn", xms(int ), (int)128);
                    continue block58;
                }
                case 920106233: {
                    break block58;
                }
                case 1771900152: {
                    v2 = eh.xmv("xxo", xms(int ), (int)129);
                    continue block58;
                }
            }
            break;
        }
        var7_3 /* !! */  = eh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("xxp", xms(int ), (int)130)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eh.xmv("xxq", xmx(int ), (int)145)) break;
            v3 /* !! */  = (long)eh.xmv("xxr", xmx(int ), (int)146);
        }
        var6_4 = eh.a;
        if (var8_2) {
            throw null;
lbl33:
            // 7 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("xxs", xms(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == eh.xmv("xxt", xmx(int ), (int)147)) break;
            v4 /* !! */  = (long)eh.xmv("xxu", xmx(int ), (int)148);
        }
        v5 = d.getInstance();
        v6 /* !! */  = eh.bj;
        if (true) ** GOTO lbl46
        block62: while (true) {
            v6 /* !! */  = (long)(eh.xmv("xxw", xms(int ), (int)133) - eh.xmv("xxv", xms(int ), (int)132));
lbl46:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -387303528: {
                    continue block62;
                }
                case 920106233: {
                    break block62;
                }
            }
            break;
        }
        v7 = v5.getManager();
        v8 /* !! */  = eh.bj;
        if (true) ** GOTO lbl56
        block63: while (true) {
            v8 /* !! */  = (long)(eh.xmv("xxy", xms(int ), (int)135) - eh.xmv("xxx", xms(int ), (int)134));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1914144409: {
                    continue block63;
                }
                case 920106233: {
                    break block63;
                }
            }
            break;
        }
        v9 = v7.getAttackPerpetrator();
        v10 /* !! */  = eh.bj;
        if (true) ** GOTO lbl66
        block64: while (true) {
            v10 /* !! */  = (long)(v11 - eh.xmv("xxz", xms(int ), (int)136));
lbl66:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1709365795: {
                    v11 = eh.xmv("xya", xms(int ), (int)137);
                    continue block64;
                }
                case -516720264: {
                    v11 = eh.xmv("xyb", xms(int ), (int)138);
                    continue block64;
                }
                case 20797782: {
                    v11 = eh.xmv("xyc", xms(int ), (int)139);
                    continue block64;
                }
                case 920106233: {
                    break block64;
                }
            }
            break;
        }
        var2_5 = v9.getAttackHandler();
        if (var6_4) ** GOTO lbl33
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl33
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("xyd", xms(int ), (int)140)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == eh.xmv("xye", xmx(int ), (int)149)) break;
                    v12 /* !! */  = (long)eh.xmv("xyf", xmx(int ), (int)150);
                }
                var3_6 = ot.INSTANCE;
                if (var6_4 || var6_4) ** GOTO lbl33
                v13 /* !! */  = eh.bj;
                if (true) ** GOTO lbl95
                block66: while (true) {
                    v13 /* !! */  = (long)(eh.xmv("xyh", xms(int ), (int)142) - eh.xmv("xyg", xms(int ), (int)141));
lbl95:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 321269831: {
                            continue block66;
                        }
                        case 920106233: {
                            break block66;
                        }
                    }
                    break;
                }
                v14 /* !! */  = eh.bj;
                if (true) ** GOTO lbl104
                block67: while (true) {
                    v14 /* !! */  = (long)(v15 - eh.xmv("xyi", xms(int ), (int)143));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1180463914: {
                            v15 = eh.xmv("xyj", xms(int ), (int)144);
                            continue block67;
                        }
                        case 920106233: {
                            break block67;
                        }
                        case 1177723172: {
                            v15 = eh.xmv("xyk", xms(int ), (int)145);
                            continue block67;
                        }
                    }
                    break;
                }
                v16 = var1_1.getAngle();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("xyl", xms(int ), (int)146)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == eh.xmv("xym", xmx(int ), (int)151)) break;
                    v17 /* !! */  = (long)eh.xmv("xyn", xmx(int ), (int)152);
                }
                v18 = var1_1.getAngle();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("xyo", xms(int ), (int)147)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == eh.xmv("xyp", xmx(int ), (int)153)) break;
                    v19 /* !! */  = (long)eh.xmv("xyq", xmx(int ), (int)154);
                }
                v20 = v18.toVector();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = eh.bj - eh.xmv("xyr", xms(int ), (int)148)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == eh.xmv("xys", xmx(int ), (int)155)) break;
                    v21 /* !! */  = (long)eh.xmv("xyt", xmx(int ), (int)156);
                }
                var4_7 = new ov$VecRotation(v16, v20);
                if (var6_4 || var6_4) ** GOTO lbl33
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = eh.bj - eh.xmv("xyu", xms(int ), (int)149)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == eh.xmv("xyv", xmx(int ), (int)157)) break;
                    v22 /* !! */  = (long)eh.xmv("xyw", xmx(int ), (int)158);
                }
                var5_8 = this.getRotationConfig();
                if (var6_4 || var6_4) ** GOTO lbl33
                v23 /* !! */  = eh.bj;
                if (true) ** GOTO lbl144
                block72: while (true) {
                    v23 /* !! */  = (long)(eh.xmv("xyy", xms(int ), (int)151) - eh.xmv("xyx", xms(int ), (int)150));
lbl144:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -481911035: {
                            continue block72;
                        }
                        case 920106233: {
                            break block72;
                        }
                    }
                    break;
                }
                v24 = eh.xmv("xyz", xmx(int ), (int)159);
                v25 /* !! */  = eh.bj;
                if (true) ** GOTO lbl154
                block73: while (true) {
                    v25 /* !! */  = (long)(v26 - eh.xmv("xza", xms(int ), (int)152));
lbl154:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -731335329: {
                            v26 = eh.xmv("xzb", xms(int ), (int)153);
                            continue block73;
                        }
                        case 920106233: {
                            break block73;
                        }
                        case 1760422281: {
                            v26 = eh.xmv("xzc", xms(int ), (int)154);
                            continue block73;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = eh.bj - eh.xmv("xzd", xms(int ), (int)155)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == eh.xmv("xze", xmx(int ), (int)160)) break;
                    v27 /* !! */  = (long)eh.xmv("xzf", xmx(int ), (int)161);
                }
                var3_6.rotateTo(var4_7, this.target, (int)v24, var5_8, nn.HIGH_IMPORTANCE_1, this);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
lbl172:
            // 3 sources

            case 0: {
                var7_3 /* !! */  = (int)eh.xmv("xzg", xmx(int ), (int)162);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl177:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)eh.xmv("xzh", xmx(int ), (int)163);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl182:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)eh.xmv("xzi", xmx(int ), (int)164);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl187:
            // 3 sources

            case 3: {
                var7_3 /* !! */  = (int)eh.xmv("xzj", xmx(int ), (int)165);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 4: {
                var7_3 /* !! */  = (int)eh.xmv("xzk", xmx(int ), (int)166);
                if (!var8_2) break;
                throw null;
            }
lbl196:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)eh.xmv("xzl", xmx(int ), (int)167);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl201:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)eh.xmv("xzm", xmx(int ), (int)168);
                if (!var8_2) ** GOTO lbl182
                throw null;
            }
            case 7: {
                var7_3 /* !! */  = (int)eh.xmv("xzn", xmx(int ), (int)169);
                if (!var8_2) ** GOTO lbl177
                throw null;
            }
lbl209:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)eh.xmv("xzo", xmx(int ), (int)170);
                    if (!var8_2) ** GOTO lbl172
                    throw null;
                }
            }
            case 9: {
                var7_3 /* !! */  = (int)eh.xmv("xzp", xmx(int ), (int)171);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
lbl218:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)eh.xmv("xzq", xmx(int ), (int)172);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
            case 11: {
                var7_3 /* !! */  = (int)eh.xmv("xzr", xmx(int ), (int)173);
                if (!var8_2) ** GOTO lbl218
                throw null;
            }
lbl226:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)eh.xmv("xzs", xmx(int ), (int)174);
                if (!var8_2) ** GOTO lbl196
                throw null;
            }
            case 13: 
        }
        var7_3 /* !! */  = (int)eh.xmv("xzt", xmx(int ), (int)175);
        ** while (!var8_2)
lbl233:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void inputEvent(cj var1_1) {
        block147: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("yrp", xms(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == eh.xmv("yrq", xmx(int ), (int)199)) break;
                v0 /* !! */  = (long)eh.xmv("yrr", xmx(int ), (int)200);
            }
            var4_2 = eh.c;
            v1 /* !! */  = eh.bj;
            if (true) ** GOTO lbl11
            block94: while (true) {
                v1 /* !! */  = (long)(v2 - eh.xmv("yrs", xms(int ), (int)178));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -868471997: {
                        v2 = eh.xmv("yru", xms(int ), (int)179);
                        continue block94;
                    }
                    case 920106233: {
                        break block94;
                    }
                    case 1396007021: {
                        v2 = eh.xmv("yrv", xms(int ), (int)180);
                        continue block94;
                    }
                    case 2001430222: {
                        v2 = eh.xmv("yrw", xms(int ), (int)181);
                        continue block94;
                    }
                }
                break;
            }
            var3_3 /* !! */  = eh.b;
            v3 /* !! */  = eh.bj;
            if (true) ** GOTO lbl28
            block95: while (true) {
                v3 /* !! */  = (long)(v4 - eh.xmv("yrx", xms(int ), (int)182));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 312591218: {
                        v4 = eh.xmv("yry", xms(int ), (int)183);
                        continue block95;
                    }
                    case 920106233: {
                        break block95;
                    }
                    case 1733128873: {
                        v4 = eh.xmv("yrz", xms(int ), (int)184);
                        continue block95;
                    }
                }
                break;
            }
            var2_4 = eh.a;
            if (var4_2) {
                throw null;
lbl40:
                // 14 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("ysa", xms(int ), (int)185)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == eh.xmv("ysb", xmx(int ), (int)201)) break;
                v5 /* !! */  = (long)eh.xmv("ysc", xmx(int ), (int)202);
            }
            if (this.target == null) break block147;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("ysd", xms(int ), (int)186)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == eh.xmv("yse", xmx(int ), (int)203)) break;
                v6 /* !! */  = (long)eh.xmv("ysf", xmx(int ), (int)204);
            }
            v7 = d.getInstance();
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("ysg", xms(int ), (int)187)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == eh.xmv("ysh", xmx(int ), (int)205)) break;
                v8 /* !! */  = (long)eh.xmv("ysj", xmx(int ), (int)206);
            }
            v9 = v7.getManager();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("ysk", xms(int ), (int)188)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == eh.xmv("ysl", xmx(int ), (int)207)) break;
                v10 /* !! */  = (long)eh.xmv("ysm", xmx(int ), (int)208);
            }
            v11 = v9.getAttackPerpetrator();
            v12 /* !! */  = eh.bj;
            if (true) ** GOTO lbl72
            block101: while (true) {
                v12 /* !! */  = (long)(eh.xmv("yso", xms(int ), (int)190) - eh.xmv("ysn", xms(int ), (int)189));
lbl72:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1682385506: {
                        continue block101;
                    }
                    case 920106233: {
                        break block101;
                    }
                }
                break;
            }
            v13 = v11.getAttackHandler();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_5 = eh.bj - eh.xmv("ysp", xms(int ), (int)191)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == eh.xmv("ysq", xmx(int ), (int)209)) break;
                v14 /* !! */  = (long)eh.xmv("ysr", xmx(int ), (int)210);
            }
            v15 = this.getConfig();
            v16 = eh.xmv("yss", xmx(int ), (int)211);
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_6 = eh.bj - eh.xmv("ysu", xms(int ), (int)192)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == eh.xmv("ysv", xmx(int ), (int)212)) break;
                v17 /* !! */  = (long)eh.xmv("ysw", xmx(int ), (int)213);
            }
            if (!v13.canAttack(v15, (int)v16)) break block147;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_7 = eh.bj - eh.xmv("ysx", xms(int ), (int)193)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == eh.xmv("ysy", xmx(int ), (int)214)) break;
                v18 /* !! */  = (long)eh.xmv("ysz", xmx(int ), (int)215);
            }
            v19 /* !! */  = eh.bj;
            if (true) ** GOTO lbl101
            block105: while (true) {
                v19 /* !! */  = (long)(v20 - eh.xmv("yta", xms(int ), (int)194));
lbl101:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case 13575003: {
                        v20 = eh.xmv("ytb", xms(int ), (int)195);
                        continue block105;
                    }
                    case 816911517: {
                        v20 = eh.xmv("ytc", xms(int ), (int)196);
                        continue block105;
                    }
                    case 920106233: {
                        break block105;
                    }
                    case 1690391578: {
                        v20 = eh.xmv("ytd", xms(int ), (int)197);
                        continue block105;
                    }
                }
                break;
            }
            v21 = eh.mc.field_1724;
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_8 = eh.bj - eh.xmv("ytf", xms(int ), (int)198)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == eh.xmv("ytg", xmx(int ), (int)216)) break;
                v22 /* !! */  = (long)eh.xmv("yth", xmx(int ), (int)217);
            }
            if (v21.method_5869()) break block147;
            if (var2_4 || var2_4) ** GOTO lbl40
            v23 = eh.xmv("yti", xmx(int ), (int)218);
            v24 = eh.xmv("ytj", xmx(int ), (int)219);
            v25 = eh.xmv("ytk", xmx(int ), (int)220);
            v26 = eh.xmv("ytl", xmx(int ), (int)221);
            v27 /* !! */  = eh.bj;
            if (true) ** GOTO lbl129
            block107: while (true) {
                v27 /* !! */  = (long)(v28 - eh.xmv("ytm", xms(int ), (int)199));
lbl129:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case 733565026: {
                        v28 = eh.xmv("ytn", xms(int ), (int)200);
                        continue block107;
                    }
                    case 920106233: {
                        break block107;
                    }
                    case 1453139643: {
                        v28 = eh.xmv("yto", xms(int ), (int)201);
                        continue block107;
                    }
                }
                break;
            }
            var1_1.setDirectionalLow((boolean)v23, (boolean)v24, (boolean)v25, (boolean)v26);
            if (var2_4) ** GOTO lbl40
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = eh.bj - eh.xmv("ytp", xms(int ), (int)202)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == eh.xmv("ytq", xmx(int ), (int)222)) break;
                    v29 /* !! */  = (long)eh.xmv("yts", xmx(int ), (int)223);
                }
                v30 /* !! */  = eh.bj;
                if (true) ** GOTO lbl155
                block109: while (true) {
                    v30 /* !! */  = (long)(eh.xmv("ytu", xms(int ), (int)204) - eh.xmv("ytt", xms(int ), (int)203));
lbl155:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 920106233: {
                            break block109;
                        }
                        case 1921014654: {
                            continue block109;
                        }
                    }
                    break;
                }
                if (!this.options.isSelected("\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442")) ** GOTO lbl342
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_10 = eh.bj - eh.xmv("ytv", xms(int ), (int)205)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == eh.xmv("ytw", xmx(int ), (int)224)) break;
                    v31 /* !! */  = (long)eh.xmv("ytx", xmx(int ), (int)225);
                }
                if (this.target == null) ** GOTO lbl342
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_11 = eh.bj - eh.xmv("yty", xms(int ), (int)206)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == eh.xmv("ytz", xmx(int ), (int)226)) break;
                    v32 /* !! */  = (long)eh.xmv("yua", xmx(int ), (int)227);
                }
                v33 = d.getInstance();
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_12 = eh.bj - eh.xmv("yub", xms(int ), (int)207)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == eh.xmv("yuc", xmx(int ), (int)228)) break;
                    v34 /* !! */  = (long)eh.xmv("yud", xmx(int ), (int)229);
                }
                v35 = v33.getManager();
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_13 = eh.bj - eh.xmv("yuf", xms(int ), (int)208)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == eh.xmv("yug", xmx(int ), (int)230)) break;
                    v36 /* !! */  = (long)eh.xmv("yuh", xmx(int ), (int)231);
                }
                v37 = v35.getAttackPerpetrator();
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_14 = eh.bj - eh.xmv("yui", xms(int ), (int)209)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == eh.xmv("yuj", xmx(int ), (int)232)) break;
                    v38 /* !! */  = (long)eh.xmv("yuk", xmx(int ), (int)233);
                }
                v39 = v37.getAttackHandler();
                v40 /* !! */  = eh.bj;
                if (true) ** GOTO lbl197
                block115: while (true) {
                    v40 /* !! */  = (long)(eh.xmv("yum", xms(int ), (int)211) - eh.xmv("yul", xms(int ), (int)210));
lbl197:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -875625671: {
                            continue block115;
                        }
                        case 920106233: {
                            break block115;
                        }
                    }
                    break;
                }
                v41 = this.getConfig();
                v42 = eh.xmv("yun", xmx(int ), (int)234);
                v43 /* !! */  = eh.bj;
                if (true) ** GOTO lbl208
                block116: while (true) {
                    v43 /* !! */  = (long)(v44 - eh.xmv("yuo", xms(int ), (int)212));
lbl208:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -221353838: {
                            v44 = eh.xmv("yup", xms(int ), (int)213);
                            continue block116;
                        }
                        case 836516215: {
                            v44 = eh.xmv("yuq", xms(int ), (int)214);
                            continue block116;
                        }
                        case 920106233: {
                            break block116;
                        }
                        case 1392172098: {
                            v44 = eh.xmv("yus", xms(int ), (int)215);
                            continue block116;
                        }
                    }
                    break;
                }
                if (!v39.canAttack(v41, (int)v42)) ** GOTO lbl342
                if (var2_4) ** GOTO lbl40
                v45 /* !! */  = eh.bj;
                if (true) ** GOTO lbl226
                block117: while (true) {
                    v45 /* !! */  = (long)(v46 - eh.xmv("yut", xms(int ), (int)216));
lbl226:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1319529993: {
                            v46 = eh.xmv("yuu", xms(int ), (int)217);
                            continue block117;
                        }
                        case 422412678: {
                            v46 = eh.xmv("yuv", xms(int ), (int)218);
                            continue block117;
                        }
                        case 920106233: {
                            break block117;
                        }
                        case 1618882474: {
                            v46 = eh.xmv("yuw", xms(int ), (int)219);
                            continue block117;
                        }
                    }
                    break;
                }
                v47 /* !! */  = eh.bj;
                if (true) ** GOTO lbl242
                block118: while (true) {
                    v47 /* !! */  = (long)(v48 - eh.xmv("yux", xms(int ), (int)220));
lbl242:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case 855017736: {
                            v48 = eh.xmv("yuy", xms(int ), (int)221);
                            continue block118;
                        }
                        case 920106233: {
                            break block118;
                        }
                        case 1294540102: {
                            v48 = eh.xmv("yuz", xms(int ), (int)222);
                            continue block118;
                        }
                    }
                    break;
                }
                v49 = eh.mc.field_1724;
                v50 /* !! */  = eh.bj;
                if (true) ** GOTO lbl256
                block119: while (true) {
                    v50 /* !! */  = (long)(eh.xmv("yvb", xms(int ), (int)224) - eh.xmv("yva", xms(int ), (int)223));
lbl256:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case 452791881: {
                            continue block119;
                        }
                        case 920106233: {
                            break block119;
                        }
                    }
                    break;
                }
                if (!v49.method_6115()) ** GOTO lbl342
                if (var2_4) ** GOTO lbl40
                v51 /* !! */  = eh.bj;
                if (true) ** GOTO lbl267
                block120: while (true) {
                    v51 /* !! */  = (long)(eh.xmv("yve", xms(int ), (int)226) - eh.xmv("yvd", xms(int ), (int)225));
lbl267:
                    // 2 sources

                    switch ((int)v51 /* !! */ ) {
                        case 451643976: {
                            continue block120;
                        }
                        case 920106233: {
                            break block120;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_15 = eh.bj - eh.xmv("yvf", xms(int ), (int)227)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == eh.xmv("yvg", xmx(int ), (int)235)) break;
                    v52 /* !! */  = (long)eh.xmv("yvh", xmx(int ), (int)236);
                }
                v53 = eh.mc.field_1724;
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_16 = eh.bj - eh.xmv("yvi", xms(int ), (int)228)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == eh.xmv("yvj", xmx(int ), (int)237)) break;
                    v54 /* !! */  = (long)eh.xmv("yvk", xmx(int ), (int)238);
                }
                v55 = v53.method_6030();
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_17 = eh.bj - eh.xmv("yvl", xms(int ), (int)229)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == eh.xmv("yvm", xmx(int ), (int)239)) break;
                    v56 /* !! */  = (long)eh.xmv("yvn", xmx(int ), (int)240);
                }
                v57 = v55.method_7909();
                while (true) {
                    if ((v58 /* !! */  = (cfr_temp_18 = eh.bj - eh.xmv("yvo", xms(int ), (int)230)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v58 /* !! */  == eh.xmv("yvq", xmx(int ), (int)241)) break;
                    v58 /* !! */  = (long)eh.xmv("yvr", xmx(int ), (int)242);
                }
                v59 /* !! */  = eh.bj;
                if (true) ** GOTO lbl299
                block125: while (true) {
                    v59 /* !! */  = (long)(v60 - eh.xmv("yvs", xms(int ), (int)231));
lbl299:
                    // 2 sources

                    switch ((int)v59 /* !! */ ) {
                        case -2099300842: {
                            v60 = eh.xmv("yvt", xms(int ), (int)232);
                            continue block125;
                        }
                        case 920106233: {
                            break block125;
                        }
                        case 1292283761: {
                            v60 = eh.xmv("yvu", xms(int ), (int)233);
                            continue block125;
                        }
                        case 1919354218: {
                            v60 = eh.xmv("yvv", xms(int ), (int)234);
                            continue block125;
                        }
                    }
                    break;
                }
                if (!v57.equals(class_1802.field_8255)) ** GOTO lbl342
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v61 /* !! */  = (cfr_temp_19 = eh.bj - eh.xmv("yvw", xms(int ), (int)235)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v61 /* !! */  == eh.xmv("yvx", xmx(int ), (int)243)) break;
                    v61 /* !! */  = (long)eh.xmv("yvy", xmx(int ), (int)244);
                }
                v62 /* !! */  = eh.bj;
                if (true) ** GOTO lbl322
                block127: while (true) {
                    v62 /* !! */  = (long)(v63 - eh.xmv("yvz", xms(int ), (int)236));
lbl322:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -2065769126: {
                            v63 = eh.xmv("ywa", xms(int ), (int)237);
                            continue block127;
                        }
                        case -842035837: {
                            v63 = eh.xmv("ywb", xms(int ), (int)238);
                            continue block127;
                        }
                        case 875109013: {
                            v63 = eh.xmv("ywd", xms(int ), (int)239);
                            continue block127;
                        }
                        case 920106233: {
                            break block127;
                        }
                    }
                    break;
                }
                v64 = eh.mc.field_1724;
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_20 = eh.bj - eh.xmv("ywe", xms(int ), (int)240)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == eh.xmv("ywf", xmx(int ), (int)245)) break;
                    v65 /* !! */  = (long)eh.xmv("ywg", xmx(int ), (int)246);
                }
                v64.method_6075();
                if (var2_4) ** GOTO lbl40
lbl342:
                // 6 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)eh.xmv("ywh", xmx(int ), (int)247);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 1: {
                var3_3 /* !! */  = (int)eh.xmv("ywi", xmx(int ), (int)248);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl355:
            // 5 sources

            case 2: {
                var3_3 /* !! */  = (int)eh.xmv("ywj", xmx(int ), (int)249);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl360:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)eh.xmv("ywk", xmx(int ), (int)250);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl365:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)eh.xmv("ywl", xmx(int ), (int)251);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl410
                    break;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)eh.xmv("ywn", xmx(int ), (int)252);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 6: {
                var3_3 /* !! */  = (int)eh.xmv("ywo", xmx(int ), (int)253);
                if (!var4_2) ** GOTO lbl355
                throw null;
            }
lbl380:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)eh.xmv("ywp", xmx(int ), (int)254);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl385:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)eh.xmv("ywq", xmx(int ), (int)255);
                if (var4_2) {
                    throw null;
                }
            }
lbl389:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)eh.xmv("ywr", xmx(int ), (int)256);
                if (!var4_2) ** GOTO lbl380
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)eh.xmv("yws", xmx(int ), (int)257);
                if (!var4_2) ** GOTO lbl365
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)eh.xmv("ywt", xmx(int ), (int)258);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
lbl401:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)eh.xmv("ywu", xmx(int ), (int)259);
                if (!var4_2) ** GOTO lbl385
                throw null;
            }
lbl405:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)eh.xmv("yxe", xmx(int ), (int)260);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl410:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)eh.xmv("yxf", xmx(int ), (int)261);
                if (!var4_2) ** GOTO lbl405
                throw null;
            }
lbl414:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)eh.xmv("yxg", xmx(int ), (int)262);
                if (var4_2) {
                    throw null;
                }
            }
            case 16: {
                var3_3 /* !! */  = (int)eh.xmv("yxh", xmx(int ), (int)263);
                if (!var4_2) break;
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)eh.xmv("yxi", xmx(int ), (int)264);
                if (!var4_2) ** GOTO lbl355
                throw null;
            }
lbl426:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)eh.xmv("yxj", xmx(int ), (int)265);
                if (!var4_2) ** GOTO lbl355
                throw null;
            }
            case 19: 
        }
        var3_3 /* !! */  = (int)eh.xmv("yxk", xmx(int ), (int)266);
        ** while (!var4_2)
lbl433:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ox getPointFinder() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = bj - eh.xmv("zev", xms(int ), (int)352)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == eh.xmv("zew", xmx(int ), (int)348)) break;
            object = eh.xmv("zex", xmx(int ), (int)349);
        }
        boolean bl2 = c;
        Object object = bj;
        block14: while (true) {
            switch ((int)object) {
                case 920106233: {
                    break block14;
                }
                case 1804250488: {
                    object = eh.xmv("zez", xms(int ), (int)354) - eh.xmv("zey", xms(int ), (int)353);
                    continue block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = bj;
        block15: while (true) {
            switch ((int)object2) {
                case -586536408: {
                    object2 = eh.xmv("zfb", xms(int ), (int)356) - eh.xmv("zfa", xms(int ), (int)355);
                    continue block15;
                }
                case 920106233: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object3 = bj;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - eh.xmv("zfc", xms(int ), (int)357);
            }
            switch ((int)object3) {
                case 93429913: {
                    callSite = eh.xmv("zfd", xms(int ), (int)358);
                    continue block16;
                }
                case 129723594: {
                    callSite = eh.xmv("zfe", xms(int ), (int)359);
                    continue block16;
                }
                case 920106233: {
                    return this.pointFinder;
                }
            }
            break;
        }
        return this.pointFinder;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getLastTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zga", xms(int ), (int)367)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zgb", xmx(int ), (int)364)) break;
            v0 /* !! */  = (long)eh.xmv("zgc", xmx(int ), (int)365);
        }
        var3_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zgd", xms(int ), (int)368)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eh.xmv("zge", xmx(int ), (int)366)) break;
            v1 /* !! */  = (long)eh.xmv("zgf", xmx(int ), (int)367);
        }
        var2_2 /* !! */  = eh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zgg", xms(int ), (int)369)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == eh.xmv("zgh", xmx(int ), (int)368)) break;
            v2 /* !! */  = (long)eh.xmv("zgi", xmx(int ), (int)369);
        }
        var1_3 = eh.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("zgj", xms(int ), (int)370)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == eh.xmv("zgk", xmx(int ), (int)370)) break;
                    v3 /* !! */  = (long)eh.xmv("zgl", xmx(int ), (int)371);
                }
                return this.lastTarget;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eh.xmv("zgm", xmx(int ), (int)372);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("zgn", xmx(int ), (int)373);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("zgo", xmx(int ), (int)374);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eh.xmv("zgp", xmx(int ), (int)375);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    static {
        xmy = new int[428];
        xmz = new int[428];
        eh.zkh();
        eh.zki();
        eh.zkj();
        eh.zkk();
        eh.zkl();
        eh.zkm();
        eh.zkn();
        eh.zko();
        eh.zkp();
        eh.zkq();
        xmt = new long[414];
        xmu = new long[414];
        eh.zkr();
        eh.zks();
        eh.zkt();
        eh.zku();
        eh.zkv();
        eh.zkw();
        eh.zkx();
        eh.zky();
        eh.zkz();
        eh.zla();
    }

    private static /* synthetic */ void zkr() {
        eh.xmt[0] = -6429186713762005038L;
        eh.xmt[1] = -2967027702190661316L;
        eh.xmt[2] = 963168578564001533L;
        eh.xmt[3] = -3410005513785733856L;
        eh.xmt[4] = 6255187205893478767L;
        eh.xmt[5] = -4692065511985457841L;
        eh.xmt[6] = 4523414479305680414L;
        eh.xmt[7] = 6999712764249063267L;
        eh.xmt[8] = -4909792055768076222L;
        eh.xmt[9] = 760754233202020890L;
        eh.xmt[10] = -2885246516015930613L;
        eh.xmt[11] = 3592055690011377987L;
        eh.xmt[12] = 2049116115497803907L;
        eh.xmt[13] = -4924763535223981139L;
        eh.xmt[14] = -6586611837238331431L;
        eh.xmt[15] = 7333981517538283935L;
        eh.xmt[16] = 8278677574057405836L;
        eh.xmt[17] = -4626352915145122721L;
        eh.xmt[18] = 5381607292539446547L;
        eh.xmt[19] = 2688841102787367783L;
        eh.xmt[20] = 3623012774289605599L;
        eh.xmt[21] = -5732070880734609787L;
        eh.xmt[22] = -1507742639785656313L;
        eh.xmt[23] = -7915873392788345688L;
        eh.xmt[24] = -4374159577390988775L;
        eh.xmt[25] = -2935771810939179639L;
        eh.xmt[26] = -7000526733008794549L;
        eh.xmt[27] = -7507377863735289643L;
        eh.xmt[28] = -442259402028671726L;
        eh.xmt[29] = 5835518747417704690L;
        eh.xmt[30] = 6445237903139498086L;
        eh.xmt[31] = 3040471017259446093L;
        eh.xmt[32] = 2477021835562636676L;
        eh.xmt[33] = 2489247463416055141L;
        eh.xmt[34] = 8663572184093877800L;
        eh.xmt[35] = 8558254214089028839L;
        eh.xmt[36] = 605107919701271276L;
        eh.xmt[37] = 4099714343689990065L;
        eh.xmt[38] = 208840454251684130L;
        eh.xmt[39] = -5827851927493488839L;
        eh.xmt[40] = -2730598334605826374L;
        eh.xmt[41] = -6303708923891825397L;
        eh.xmt[42] = -3893173455253765701L;
        eh.xmt[43] = 9172872803891303708L;
        eh.xmt[44] = -4980291463973532354L;
        eh.xmt[45] = -6697023887750628902L;
        eh.xmt[46] = -7989993224960113589L;
        eh.xmt[47] = -784833198735889538L;
        eh.xmt[48] = 3818430707518681479L;
        eh.xmt[49] = 4853227879360223447L;
        eh.xmt[50] = 2141212451935193476L;
        eh.xmt[51] = -7681394352280712879L;
        eh.xmt[52] = -8113639195106084406L;
        eh.xmt[53] = 7924750701824153828L;
        eh.xmt[54] = 1423499314942894696L;
        eh.xmt[55] = -7236685461794406042L;
        eh.xmt[56] = -1616973901561592510L;
        eh.xmt[57] = 6431733251342016306L;
        eh.xmt[58] = -4827664367988105369L;
        eh.xmt[59] = 8671838510236115624L;
        eh.xmt[60] = -2630367546758304606L;
        eh.xmt[61] = 182817497864338367L;
        eh.xmt[62] = -2592892683509759073L;
        eh.xmt[63] = -1100893727580404075L;
        eh.xmt[64] = 3130922987805613259L;
        eh.xmt[65] = 5072517877142202371L;
        eh.xmt[66] = -4068213761408800025L;
        eh.xmt[67] = -7464278073687437455L;
        eh.xmt[68] = 6116141367393639548L;
        eh.xmt[69] = 2411511365765401643L;
        eh.xmt[70] = -1218736703094241577L;
        eh.xmt[71] = 168911658704106982L;
        eh.xmt[72] = 4212493418959637840L;
        eh.xmt[73] = -8938160691084382532L;
        eh.xmt[74] = 8710075650719856660L;
        eh.xmt[75] = -8321231944802002891L;
        eh.xmt[76] = 3293400890741802809L;
        eh.xmt[77] = 6075761475381869294L;
        eh.xmt[78] = -4259412222726129104L;
        eh.xmt[79] = -6126172244682099351L;
        eh.xmt[80] = 2562123444895676240L;
        eh.xmt[81] = 6810043923341957981L;
        eh.xmt[82] = 5585313019547679998L;
        eh.xmt[83] = 4316228854139430084L;
        eh.xmt[84] = 4352392602682639055L;
        eh.xmt[85] = -6580471129768794506L;
        eh.xmt[86] = 2463098376055020608L;
        eh.xmt[87] = 5169542557085635209L;
        eh.xmt[88] = 6419483689469866822L;
        eh.xmt[89] = 1618858557514042569L;
        eh.xmt[90] = -5959542850418048666L;
        eh.xmt[91] = 7000486759056626871L;
        eh.xmt[92] = 1790471880024144320L;
        eh.xmt[93] = -578104454980878125L;
        eh.xmt[94] = -805587836201777179L;
        eh.xmt[95] = -968132870719118505L;
        eh.xmt[96] = 8377102990162276987L;
        eh.xmt[97] = -3176287741656481538L;
        eh.xmt[98] = -576648903020080058L;
        eh.xmt[99] = -3785103162758473863L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public hx getSmoothMode() {
        v0 /* !! */  = eh.bj;
        block24: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 920106233: {
                    break block24;
                }
                case 1611121533: {
                    v0 /* !! */  = (long)(eh.xmv("yqx", xms(int ), (int)167) - eh.xmv("yqw", xms(int ), (int)166));
                    continue block24;
                }
            }
            break;
        }
        var3_1 = eh.c;
        v1 /* !! */  = eh.bj;
        if (true) ** GOTO lbl14
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - eh.xmv("yqy", xms(int ), (int)168));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1067226789: {
                    v2 = eh.xmv("yqz", xms(int ), (int)169);
                    continue block25;
                }
                case -540703971: {
                    v2 = eh.xmv("yra", xms(int ), (int)170);
                    continue block25;
                }
                case 920106233: {
                    break block25;
                }
                case 1215525359: {
                    v2 = eh.xmv("yrb", xms(int ), (int)171);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = eh.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = eh.bj;
                    block27: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1384889790: {
                                v3 /* !! */  = (long)(eh.xmv("yre", xms(int ), (int)173) - eh.xmv("yrd", xms(int ), (int)172));
                                continue block27;
                            }
                            case 920106233: {
                                break block27;
                            }
                        }
                        break;
                    }
                    var1_3 = eh.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("yrf", xms(int ), (int)174)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == eh.xmv("yrg", xmx(int ), (int)193)) {
                            v5 /* !! */  = eh.bj;
                            ** break;
                        }
                        v4 /* !! */  = (long)eh.xmv("yrh", xmx(int ), (int)194);
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)eh.xmv("yrn", xmx(int ), (int)198);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl58:
                // 1 sources

                block29: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -22692890: {
                            v5 /* !! */  = (long)(eh.xmv("yrj", xms(int ), (int)176) - eh.xmv("yri", xms(int ), (int)175));
                            continue block29;
                        }
                        case 920106233: {
                            return new el();
                        }
                    }
                    break;
                }
                return new el();
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)eh.xmv("yrk", xmx(int ), (int)195);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)eh.xmv("yrl", xmx(int ), (int)196);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl78
            break;
        }
        do {
            if (true) ** continue;
lbl78:
            // 2 sources

            var2_2 /* !! */  = (int)eh.xmv("yrm", xmx(int ), (int)197);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int xmx(int n2) {
        return xmy[n2] ^ xmz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getTargetType() {
        v0 /* !! */  = eh.bj;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - eh.xmv("zhw", xms(int ), (int)383));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -484260031: {
                    v1 = eh.xmv("zhx", xms(int ), (int)384);
                    continue block22;
                }
                case -270172734: {
                    v1 = eh.xmv("zhy", xms(int ), (int)385);
                    continue block22;
                }
                case 665100733: {
                    v1 = eh.xmv("zhz", xms(int ), (int)386);
                    continue block22;
                }
                case 920106233: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = eh.c;
        v2 /* !! */  = eh.bj;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - eh.xmv("zia", xms(int ), (int)387));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2022108193: {
                    v3 = eh.xmv("zib", xms(int ), (int)388);
                    continue block23;
                }
                case -518888592: {
                    v3 = eh.xmv("zic", xms(int ), (int)389);
                    continue block23;
                }
                case 920106233: {
                    break block23;
                }
                case 2047644320: {
                    v3 = eh.xmv("zid", xms(int ), (int)390);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = eh.b;
        v4 /* !! */  = eh.bj;
        if (true) ** GOTO lbl39
        block24: while (true) {
            v4 /* !! */  = (long)(eh.xmv("zif", xms(int ), (int)392) - eh.xmv("zie", xms(int ), (int)391));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 920106233: {
                    break block24;
                }
                case 1493499833: {
                    continue block24;
                }
            }
            break;
        }
        var1_3 = eh.a;
        if (var3_1) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zig", xms(int ), (int)393)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == eh.xmv("zih", xmx(int ), (int)396)) break;
                    v5 /* !! */  = (long)eh.xmv("zii", xmx(int ), (int)397);
                }
                return this.targetType;
            }
            case 0: {
                var2_2 /* !! */  = (int)eh.xmv("zij", xmx(int ), (int)398);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)eh.xmv("zik", xmx(int ), (int)399);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("zil", xmx(int ), (int)400);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)eh.xmv("zim", xmx(int ), (int)401);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite xmv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[CASE]], but top level block is 34[SWITCH]
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

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kb getOnlyCriticals() {
        Object object = bj;
        boolean bl2 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - eh.xmv("zjd", xms(int ), (int)400);
            }
            switch ((int)object) {
                case -2006369803: {
                    callSite = eh.xmv("zje", xms(int ), (int)401);
                    continue block14;
                }
                case -976270147: {
                    callSite = eh.xmv("zjf", xms(int ), (int)402);
                    continue block14;
                }
                case 232534624: {
                    callSite = eh.xmv("zjg", xms(int ), (int)403);
                    continue block14;
                }
                case 920106233: {
                    break block14;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = bj;
        block15: while (true) {
            switch ((int)object2) {
                case 906905069: {
                    object2 = eh.xmv("zji", xms(int ), (int)405) - eh.xmv("zjh", xms(int ), (int)404);
                    continue block15;
                }
                case 920106233: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = bj;
        block16: while (true) {
            switch ((int)object3) {
                case -606179062: {
                    object3 = eh.xmv("zjk", xms(int ), (int)407) - eh.xmv("zjj", xms(int ), (int)406);
                    continue block16;
                }
                case 920106233: {
                    break block16;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = bj - eh.xmv("zjl", xms(int ), (int)408)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == eh.xmv("zjm", xmx(int ), (int)412)) {
                return this.onlyCriticals;
            }
            object4 = eh.xmv("zjn", xmx(int ), (int)413);
        }
    }

    private static /* synthetic */ void zkv() {
        eh.xmt[400] = 5888366165282021064L;
        eh.xmt[401] = -7973798805998149727L;
        eh.xmt[402] = -108885678827766753L;
        eh.xmt[403] = -4580557429980484915L;
        eh.xmt[404] = -8545520177068378040L;
        eh.xmt[405] = -899616628430529524L;
        eh.xmt[406] = -2890150639063657669L;
        eh.xmt[407] = -5366963038268784368L;
        eh.xmt[408] = 6414865548162536955L;
        eh.xmt[409] = -9069149335445885640L;
        eh.xmt[410] = 4012789763992036584L;
        eh.xmt[411] = 774981093960560783L;
        eh.xmt[412] = -190640392395358337L;
        eh.xmt[413] = 894327357636690047L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hv$AttackPerpetratorConfigurable getConfig() {
        v0 /* !! */  = eh.bj;
        if (true) ** GOTO lbl5
        block103: while (true) {
            v0 /* !! */  = (long)(v1 - eh.xmv("zah", xms(int ), (int)278));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2002448119: {
                    v1 = eh.xmv("zai", xms(int ), (int)279);
                    continue block103;
                }
                case -1200768399: {
                    v1 = eh.xmv("zaj", xms(int ), (int)280);
                    continue block103;
                }
                case 920106233: {
                    break block103;
                }
                case 1316509673: {
                    v1 = eh.xmv("zak", xms(int ), (int)281);
                    continue block103;
                }
            }
            break;
        }
        var6_1 = eh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zal", xms(int ), (int)282)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eh.xmv("zam", xmx(int ), (int)304)) break;
            v2 /* !! */  = (long)eh.xmv("zan", xmx(int ), (int)305);
        }
        var5_2 /* !! */  = eh.b;
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zao", xms(int ), (int)283)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == eh.xmv("zap", xmx(int ), (int)306)) break;
                    v3 /* !! */  = (long)eh.xmv("zaq", xmx(int ), (int)307);
                }
                var4_3 = eh.a;
                if (var6_1) {
                    throw null;
lbl35:
                    // 4 sources

                    return null;
                }
                if (var4_3 || var4_3) ** GOTO lbl35
                v4 /* !! */  = eh.bj;
                if (true) ** GOTO lbl42
                block107: while (true) {
                    v4 /* !! */  = (long)(v5 - eh.xmv("zar", xms(int ), (int)284));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 128777510: {
                            v5 = eh.xmv("zas", xms(int ), (int)285);
                            continue block107;
                        }
                        case 565451482: {
                            v5 = eh.xmv("zat", xms(int ), (int)286);
                            continue block107;
                        }
                        case 920106233: {
                            break block107;
                        }
                        case 1340428465: {
                            v5 = eh.xmv("zau", xms(int ), (int)287);
                            continue block107;
                        }
                    }
                    break;
                }
                v6 /* !! */  = eh.bj;
                if (true) ** GOTO lbl58
                block108: while (true) {
                    v6 /* !! */  = (long)(v7 - eh.xmv("zav", xms(int ), (int)288));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1784915546: {
                            v7 = eh.xmv("zaw", xms(int ), (int)289);
                            continue block108;
                        }
                        case -258745115: {
                            v7 = eh.xmv("zax", xms(int ), (int)290);
                            continue block108;
                        }
                        case 920106233: {
                            break block108;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zay", xms(int ), (int)291)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == eh.xmv("zaz", xmx(int ), (int)308)) break;
                    v8 /* !! */  = (long)eh.xmv("zba", xmx(int ), (int)309);
                }
                v9 = this.attackDistance();
                v10 /* !! */  = eh.bj;
                if (true) ** GOTO lbl77
                block110: while (true) {
                    v10 /* !! */  = (long)(eh.xmv("zbc", xms(int ), (int)293) - eh.xmv("zbb", xms(int ), (int)292));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 920106233: {
                            break block110;
                        }
                        case 2032964862: {
                            continue block110;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = eh.bj - eh.xmv("zbd", xms(int ), (int)294)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == eh.xmv("zbe", xmx(int ), (int)310)) break;
                    v11 /* !! */  = (long)eh.xmv("zbf", xmx(int ), (int)311);
                }
                v12 = ot.INSTANCE.getRotation();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = eh.bj - eh.xmv("zbg", xms(int ), (int)295)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == eh.xmv("zbh", xmx(int ), (int)312)) break;
                    v13 /* !! */  = (long)eh.xmv("zbi", xmx(int ), (int)313);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = eh.bj - eh.xmv("zbj", xms(int ), (int)296)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == eh.xmv("zbk", xmx(int ), (int)314)) break;
                    v14 /* !! */  = (long)eh.xmv("zbl", xmx(int ), (int)315);
                }
                v15 = new class_243(0.0, 0.0, 0.0);
                v16 /* !! */  = eh.bj;
                if (true) ** GOTO lbl103
                block114: while (true) {
                    v16 /* !! */  = (long)(v17 - eh.xmv("zbm", xms(int ), (int)297));
lbl103:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -327532052: {
                            v17 = eh.xmv("zbn", xms(int ), (int)298);
                            continue block114;
                        }
                        case 920106233: {
                            break block114;
                        }
                        case 1614890942: {
                            v17 = eh.xmv("zbo", xms(int ), (int)299);
                            continue block114;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = eh.bj - eh.xmv("zbp", xms(int ), (int)300)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == eh.xmv("zbq", xmx(int ), (int)316)) break;
                    v18 /* !! */  = (long)eh.xmv("zbr", xmx(int ), (int)317);
                }
                v19 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = eh.bj - eh.xmv("zbs", xms(int ), (int)301)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == eh.xmv("zbt", xmx(int ), (int)318)) break;
                    v20 /* !! */  = (long)eh.xmv("zbu", xmx(int ), (int)319);
                }
                var1_4 = this.pointFinder.computeVector(this.target, v9, v12, v15, v19);
                if (var4_3 || var4_3) ** GOTO lbl35
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = eh.bj - eh.xmv("zbv", xms(int ), (int)302)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == eh.xmv("zbw", xmx(int ), (int)320)) break;
                    v21 /* !! */  = (long)eh.xmv("zbx", xmx(int ), (int)321);
                }
                v22 = (class_243)var1_4.method_15442();
                v23 /* !! */  = eh.bj;
                if (true) ** GOTO lbl135
                block118: while (true) {
                    v23 /* !! */  = (long)(eh.xmv("zbz", xms(int ), (int)304) - eh.xmv("zby", xms(int ), (int)303));
lbl135:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 920106233: {
                            break block118;
                        }
                        case 1791252784: {
                            continue block118;
                        }
                    }
                    break;
                }
                v24 /* !! */  = eh.bj;
                if (true) ** GOTO lbl144
                block119: while (true) {
                    v24 /* !! */  = (long)(eh.xmv("zcb", xms(int ), (int)306) - eh.xmv("zca", xms(int ), (int)305));
lbl144:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 515766644: {
                            continue block119;
                        }
                        case 920106233: {
                            break block119;
                        }
                    }
                    break;
                }
                v25 = eh.mc.field_1724;
                v26 /* !! */  = eh.bj;
                if (true) ** GOTO lbl154
                block120: while (true) {
                    v26 /* !! */  = (long)(v27 - eh.xmv("zcc", xms(int ), (int)307));
lbl154:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1921810423: {
                            v27 = eh.xmv("zcd", xms(int ), (int)308);
                            continue block120;
                        }
                        case 239425504: {
                            v27 = eh.xmv("zce", xms(int ), (int)309);
                            continue block120;
                        }
                        case 599858194: {
                            v27 = eh.xmv("zcf", xms(int ), (int)310);
                            continue block120;
                        }
                        case 920106233: {
                            break block120;
                        }
                    }
                    break;
                }
                v28 /* !! */  = eh.bj;
                if (true) ** GOTO lbl170
                block121: while (true) {
                    v28 /* !! */  = (long)(v29 - eh.xmv("zcg", xms(int ), (int)311));
lbl170:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 278213658: {
                            v29 = eh.xmv("zch", xms(int ), (int)312);
                            continue block121;
                        }
                        case 675582560: {
                            v29 = eh.xmv("zci", xms(int ), (int)313);
                            continue block121;
                        }
                        case 920106233: {
                            break block121;
                        }
                        case 1946770091: {
                            v29 = eh.xmv("zcj", xms(int ), (int)314);
                            continue block121;
                        }
                    }
                    break;
                }
                v30 = Objects.requireNonNull(v25).method_33571();
                v31 /* !! */  = eh.bj;
                if (true) ** GOTO lbl187
                block122: while (true) {
                    v31 /* !! */  = (long)(v32 - eh.xmv("zck", xms(int ), (int)315));
lbl187:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -988988332: {
                            v32 = eh.xmv("zcl", xms(int ), (int)316);
                            continue block122;
                        }
                        case 368328225: {
                            v32 = eh.xmv("zcm", xms(int ), (int)317);
                            continue block122;
                        }
                        case 920106233: {
                            break block122;
                        }
                    }
                    break;
                }
                v33 = v22.method_1020(v30);
                v34 /* !! */  = eh.bj;
                if (true) ** GOTO lbl201
                block123: while (true) {
                    v34 /* !! */  = (long)(v35 - eh.xmv("zcn", xms(int ), (int)318));
lbl201:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1295943819: {
                            v35 = eh.xmv("zco", xms(int ), (int)319);
                            continue block123;
                        }
                        case 473219170: {
                            v35 = eh.xmv("zcp", xms(int ), (int)320);
                            continue block123;
                        }
                        case 920106233: {
                            break block123;
                        }
                        case 1295744469: {
                            v35 = eh.xmv("zcq", xms(int ), (int)321);
                            continue block123;
                        }
                    }
                    break;
                }
                var2_5 = ow.fromVec3d(v33);
                if (var4_3 || var4_3) ** GOTO lbl35
                v36 /* !! */  = eh.bj;
                if (true) ** GOTO lbl219
                block124: while (true) {
                    v36 /* !! */  = (long)(v37 - eh.xmv("zcr", xms(int ), (int)322));
lbl219:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -857287827: {
                            v37 = eh.xmv("zcs", xms(int ), (int)323);
                            continue block124;
                        }
                        case 920106233: {
                            break block124;
                        }
                        case 1267388860: {
                            v37 = eh.xmv("zct", xms(int ), (int)324);
                            continue block124;
                        }
                        case 1769742167: {
                            v37 = eh.xmv("zcu", xms(int ), (int)325);
                            continue block124;
                        }
                    }
                    break;
                }
                var3_6 = (class_238)var1_4.method_15441();
                if (var4_3 || var4_3) ** continue;
                v38 /* !! */  = eh.bj;
                if (true) ** GOTO lbl237
                block125: while (true) {
                    v38 /* !! */  = (long)(v39 - eh.xmv("zcv", xms(int ), (int)326));
lbl237:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case 80345276: {
                            v39 = eh.xmv("zcw", xms(int ), (int)327);
                            continue block125;
                        }
                        case 360797843: {
                            v39 = eh.xmv("zcx", xms(int ), (int)328);
                            continue block125;
                        }
                        case 920106233: {
                            break block125;
                        }
                    }
                    break;
                }
                v40 /* !! */  = eh.bj;
                if (true) ** GOTO lbl250
                block126: while (true) {
                    v40 /* !! */  = (long)(v41 - eh.xmv("zcy", xms(int ), (int)329));
lbl250:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -487797580: {
                            v41 = eh.xmv("zcz", xms(int ), (int)330);
                            continue block126;
                        }
                        case 920106233: {
                            break block126;
                        }
                        case 954927430: {
                            v41 = eh.xmv("zda", xms(int ), (int)331);
                            continue block126;
                        }
                        case 1579167031: {
                            v41 = eh.xmv("zdb", xms(int ), (int)332);
                            continue block126;
                        }
                    }
                    break;
                }
                v42 /* !! */  = eh.bj;
                if (true) ** GOTO lbl266
                block127: while (true) {
                    v42 /* !! */  = (long)(v43 - eh.xmv("zdc", xms(int ), (int)333));
lbl266:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1294393377: {
                            v43 = eh.xmv("zdd", xms(int ), (int)334);
                            continue block127;
                        }
                        case -270901354: {
                            v43 = eh.xmv("zde", xms(int ), (int)335);
                            continue block127;
                        }
                        case 857136034: {
                            v43 = eh.xmv("zdf", xms(int ), (int)336);
                            continue block127;
                        }
                        case 920106233: {
                            break block127;
                        }
                    }
                    break;
                }
                v44 = this.attackDistance();
                v45 /* !! */  = eh.bj;
                if (true) ** GOTO lbl283
                block128: while (true) {
                    v45 /* !! */  = (long)(v46 - eh.xmv("zdg", xms(int ), (int)337));
lbl283:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1279150024: {
                            v46 = eh.xmv("zdh", xms(int ), (int)338);
                            continue block128;
                        }
                        case 442661061: {
                            v46 = eh.xmv("zdi", xms(int ), (int)339);
                            continue block128;
                        }
                        case 920106233: {
                            break block128;
                        }
                        case 1294513329: {
                            v46 = eh.xmv("zdj", xms(int ), (int)340);
                            continue block128;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_9 = eh.bj - eh.xmv("zdk", xms(int ), (int)341)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == eh.xmv("zdl", xmx(int ), (int)322)) break;
                    v47 /* !! */  = (long)eh.xmv("zdm", xmx(int ), (int)323);
                }
                v48 = this.options.getSelected();
                v49 /* !! */  = eh.bj;
                if (true) ** GOTO lbl305
                block130: while (true) {
                    v49 /* !! */  = (long)(v50 - eh.xmv("zdn", xms(int ), (int)342));
lbl305:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1768546346: {
                            v50 = eh.xmv("zdo", xms(int ), (int)343);
                            continue block130;
                        }
                        case 920106233: {
                            break block130;
                        }
                        case 1337216718: {
                            v50 = eh.xmv("zdp", xms(int ), (int)344);
                            continue block130;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_10 = eh.bj - eh.xmv("zdq", xms(int ), (int)345)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == eh.xmv("zdr", xmx(int ), (int)324)) break;
                    v51 /* !! */  = (long)eh.xmv("zds", xmx(int ), (int)325);
                }
                v52 = this.onlyCriticals.isValue();
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_11 = eh.bj - eh.xmv("zdt", xms(int ), (int)346)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == eh.xmv("zdu", xmx(int ), (int)326)) break;
                    v53 /* !! */  = (long)eh.xmv("zdv", xmx(int ), (int)327);
                }
                return new hv$AttackPerpetratorConfigurable(this.target, var2_5, v44, v48, var3_6, v52);
            }
lbl326:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)eh.xmv("zdw", xmx(int ), (int)328);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl331:
            // 3 sources

            case 1: {
                var5_2 /* !! */  = (int)eh.xmv("zdx", xmx(int ), (int)329);
                if (var6_1) {
                    throw null;
                }
            }
            case 2: {
                var5_2 /* !! */  = (int)eh.xmv("zdy", xmx(int ), (int)330);
                if (!var6_1) ** GOTO lbl331
                throw null;
            }
            case 3: {
                var5_2 /* !! */  = (int)eh.xmv("zdz", xmx(int ), (int)331);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 4: {
                var5_2 /* !! */  = (int)eh.xmv("zea", xmx(int ), (int)332);
                if (!var6_1) ** GOTO lbl326
                throw null;
            }
lbl348:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)eh.xmv("zeb", xmx(int ), (int)333);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl359
                    break;
                }
            }
lbl354:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)eh.xmv("zec", xmx(int ), (int)334);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl359:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)eh.xmv("zed", xmx(int ), (int)335);
                if (!var6_1) ** GOTO lbl331
                throw null;
            }
lbl363:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)eh.xmv("zee", xmx(int ), (int)336);
                if (!var6_1) ** GOTO lbl359
                throw null;
            }
            case 9: 
        }
        var5_2 /* !! */  = (int)eh.xmv("zef", xmx(int ), (int)337);
        ** while (!var6_1)
lbl370:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float attackDistance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("xpi", xms(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("xpj", xmx(int ), (int)38)) break;
            v0 /* !! */  = (long)eh.xmv("xpk", xmx(int ), (int)39);
        }
        var3_1 = eh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("xpl", xms(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == eh.xmv("xpm", xmx(int ), (int)40)) break;
            v1 /* !! */  = (long)eh.xmv("xpn", xmx(int ), (int)41);
        }
        var2_2 /* !! */  = eh.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("xpo", xms(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == eh.xmv("xpp", xmx(int ), (int)42)) break;
                    v2 /* !! */  = (long)eh.xmv("xpq", xmx(int ), (int)43);
                }
                var1_3 = eh.a;
                if (var3_1) {
                    throw null;
                    return (float)eh.xmv("xpr", xnp(int ), (int)44);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = eh.bj;
                if (true) ** GOTO lbl34
                block20: while (true) {
                    v3 /* !! */  = (long)(eh.xmv("xpt", xms(int ), (int)26) - eh.xmv("xps", xms(int ), (int)25));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1940374149: {
                            continue block20;
                        }
                        case 920106233: {
                            break block20;
                        }
                    }
                    break;
                }
                v4 /* !! */  = eh.bj;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - eh.xmv("xpu", xms(int ), (int)27));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -225978061: {
                            v5 = eh.xmv("xpv", xms(int ), (int)28);
                            continue block21;
                        }
                        case 192971451: {
                            v5 = eh.xmv("xpw", xms(int ), (int)29);
                            continue block21;
                        }
                        case 920106233: {
                            break block21;
                        }
                        case 1635694101: {
                            v5 = eh.xmv("xpx", xms(int ), (int)30);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.attackRange.getValue();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eh.xmv("xpy", xmx(int ), (int)45);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)eh.xmv("xpz", xmx(int ), (int)46);
                if (!var3_1) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("xqa", xmx(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eh.xmv("xqb", xmx(int ), (int)48);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void zkw() {
        eh.xmu[0] = -7137504412948836321L;
        eh.xmu[1] = 8841108897685520153L;
        eh.xmu[2] = -2748877341099862693L;
        eh.xmu[3] = 4982735667957558340L;
        eh.xmu[4] = 3426947761935980526L;
        eh.xmu[5] = 1007583027476840363L;
        eh.xmu[6] = -350753541722860442L;
        eh.xmu[7] = 8715647109995372244L;
        eh.xmu[8] = 2993993604731309360L;
        eh.xmu[9] = -1914687897751655262L;
        eh.xmu[10] = 7533705544570168099L;
        eh.xmu[11] = -8780834422154784638L;
        eh.xmu[12] = 4236566199121430978L;
        eh.xmu[13] = -2120046321629708533L;
        eh.xmu[14] = 6531907929451883623L;
        eh.xmu[15] = -3504739051169240039L;
        eh.xmu[16] = 7722825366025175527L;
        eh.xmu[17] = -7840254944183900824L;
        eh.xmu[18] = 3065409147375371621L;
        eh.xmu[19] = 90334221857706997L;
        eh.xmu[20] = -2104764068035926753L;
        eh.xmu[21] = -2408365143705061106L;
        eh.xmu[22] = -1052951915889452881L;
        eh.xmu[23] = 2133514898403198634L;
        eh.xmu[24] = -7944749555725803233L;
        eh.xmu[25] = 8877356963679167184L;
        eh.xmu[26] = -5107097605922503277L;
        eh.xmu[27] = -6724613196863983699L;
        eh.xmu[28] = 5727893140921784433L;
        eh.xmu[29] = -1688330003206233198L;
        eh.xmu[30] = 2499061962124747545L;
        eh.xmu[31] = -4116250773738624256L;
        eh.xmu[32] = 6752670846371450882L;
        eh.xmu[33] = -7409063085303919271L;
        eh.xmu[34] = 227764904371812380L;
        eh.xmu[35] = -6671686219169187672L;
        eh.xmu[36] = 3976046620646339829L;
        eh.xmu[37] = 3634934844826026718L;
        eh.xmu[38] = 2766708624412711468L;
        eh.xmu[39] = -6395836836344207207L;
        eh.xmu[40] = -2557111035116972894L;
        eh.xmu[41] = -7956656041080108232L;
        eh.xmu[42] = -5247959321938408189L;
        eh.xmu[43] = -7045233377238312913L;
        eh.xmu[44] = 5552250493610565743L;
        eh.xmu[45] = 458300160347456275L;
        eh.xmu[46] = 1906805134321441636L;
        eh.xmu[47] = 2822718064125615012L;
        eh.xmu[48] = 3993732999416883555L;
        eh.xmu[49] = -4154883606202843123L;
        eh.xmu[50] = -136428549844373655L;
        eh.xmu[51] = 221847794920276105L;
        eh.xmu[52] = 6596099609333629172L;
        eh.xmu[53] = -8515787989750792146L;
        eh.xmu[54] = -9083640755644413123L;
        eh.xmu[55] = -4338270845906609048L;
        eh.xmu[56] = -8131531177877209217L;
        eh.xmu[57] = 8056655873599898433L;
        eh.xmu[58] = -2725971047082935204L;
        eh.xmu[59] = -3933966849519236890L;
        eh.xmu[60] = -441156017093746270L;
        eh.xmu[61] = 435410939236485156L;
        eh.xmu[62] = -8664969931316980710L;
        eh.xmu[63] = 7334560178779217988L;
        eh.xmu[64] = 3808056183132466566L;
        eh.xmu[65] = -4860937170555571051L;
        eh.xmu[66] = -5965304043475682372L;
        eh.xmu[67] = 3894278767089818708L;
        eh.xmu[68] = 1062949334698368685L;
        eh.xmu[69] = -3865299129685173122L;
        eh.xmu[70] = 8683377118666340825L;
        eh.xmu[71] = 3353981783776755923L;
        eh.xmu[72] = 8025391945764595815L;
        eh.xmu[73] = 7765195075944492966L;
        eh.xmu[74] = 1632098003553104727L;
        eh.xmu[75] = 7890646549224936446L;
        eh.xmu[76] = -2909876496929571434L;
        eh.xmu[77] = 4879373311806851969L;
        eh.xmu[78] = 1827288036341911572L;
        eh.xmu[79] = -3050138760386529010L;
        eh.xmu[80] = -5064078646971301435L;
        eh.xmu[81] = 2343629898337333775L;
        eh.xmu[82] = 3565391139215708270L;
        eh.xmu[83] = -3187421726086190481L;
        eh.xmu[84] = 4378657326687364478L;
        eh.xmu[85] = 428939292776890304L;
        eh.xmu[86] = -1770973744372720998L;
        eh.xmu[87] = 3088326864474555325L;
        eh.xmu[88] = -4280252827685011863L;
        eh.xmu[89] = -3914719362921723196L;
        eh.xmu[90] = 2861437218246025075L;
        eh.xmu[91] = 4422941778810553279L;
        eh.xmu[92] = -4323874800986638660L;
        eh.xmu[93] = 7882623102835921252L;
        eh.xmu[94] = -2132571696552976226L;
        eh.xmu[95] = -2688553195859866141L;
        eh.xmu[96] = 3592944108441243335L;
        eh.xmu[97] = 3977124693313416740L;
        eh.xmu[98] = 8681372940608649631L;
        eh.xmu[99] = 3924730587102698219L;
    }

    private static /* synthetic */ void zkq() {
        eh.xmz[400] = 1221248101;
        eh.xmz[401] = -441333290;
        eh.xmz[402] = 802514702;
        eh.xmz[403] = -849340310;
        eh.xmz[404] = -464652754;
        eh.xmz[405] = 1565945782;
        eh.xmz[406] = -423341488;
        eh.xmz[407] = 43973134;
        eh.xmz[408] = 1470543462;
        eh.xmz[409] = 818732148;
        eh.xmz[410] = -1960095949;
        eh.xmz[411] = -1279688646;
        eh.xmz[412] = -1731479645;
        eh.xmz[413] = 2071520344;
        eh.xmz[414] = -1472205583;
        eh.xmz[415] = 1026033696;
        eh.xmz[416] = -1880584335;
        eh.xmz[417] = 1459438357;
        eh.xmz[418] = 1897543944;
        eh.xmz[419] = 116526556;
        eh.xmz[420] = 1841868685;
        eh.xmz[421] = -1294364140;
        eh.xmz[422] = 1710759698;
        eh.xmz[423] = -142741338;
        eh.xmz[424] = -521652;
        eh.xmz[425] = 2059147116;
        eh.xmz[426] = 2048502939;
        eh.xmz[427] = 784479215;
    }

    private static /* synthetic */ void zkh() {
        eh.xmy[0] = 166454476;
        eh.xmy[1] = -871157477;
        eh.xmy[2] = 996228942;
        eh.xmy[3] = -2021907653;
        eh.xmy[4] = 1852609181;
        eh.xmy[5] = -971745343;
        eh.xmy[6] = -936019424;
        eh.xmy[7] = 1818399388;
        eh.xmy[8] = 1832801889;
        eh.xmy[9] = 704958661;
        eh.xmy[10] = -210312556;
        eh.xmy[11] = -1971964602;
        eh.xmy[12] = 1344467878;
        eh.xmy[13] = -420496876;
        eh.xmy[14] = -1498444255;
        eh.xmy[15] = -1138437722;
        eh.xmy[16] = -2109739407;
        eh.xmy[17] = 821949718;
        eh.xmy[18] = 847016345;
        eh.xmy[19] = -1956233583;
        eh.xmy[20] = 407084296;
        eh.xmy[21] = -346853724;
        eh.xmy[22] = -859378318;
        eh.xmy[23] = 1937817389;
        eh.xmy[24] = 294660881;
        eh.xmy[25] = 1395563267;
        eh.xmy[26] = 913427592;
        eh.xmy[27] = 443242302;
        eh.xmy[28] = -1046672029;
        eh.xmy[29] = -242270961;
        eh.xmy[30] = 1176029988;
        eh.xmy[31] = 1768541135;
        eh.xmy[32] = -1264808545;
        eh.xmy[33] = -936912229;
        eh.xmy[34] = -1256375442;
        eh.xmy[35] = -171031105;
        eh.xmy[36] = -564773401;
        eh.xmy[37] = -1712718234;
        eh.xmy[38] = 1928501861;
        eh.xmy[39] = -2124764651;
        eh.xmy[40] = -2114722672;
        eh.xmy[41] = -1970276125;
        eh.xmy[42] = 828907170;
        eh.xmy[43] = 224065077;
        eh.xmy[44] = 1937578876;
        eh.xmy[45] = 1547682854;
        eh.xmy[46] = 1383726433;
        eh.xmy[47] = -277854358;
        eh.xmy[48] = -1257917237;
        eh.xmy[49] = -32073914;
        eh.xmy[50] = -356271551;
        eh.xmy[51] = -1120904258;
        eh.xmy[52] = 1331098069;
        eh.xmy[53] = 1454701425;
        eh.xmy[54] = 1712657826;
        eh.xmy[55] = -1856145862;
        eh.xmy[56] = -914240491;
        eh.xmy[57] = -2033717905;
        eh.xmy[58] = 2016937681;
        eh.xmy[59] = 1468908461;
        eh.xmy[60] = -603920144;
        eh.xmy[61] = -886646646;
        eh.xmy[62] = -863027402;
        eh.xmy[63] = 1158423172;
        eh.xmy[64] = -1750878702;
        eh.xmy[65] = -305520612;
        eh.xmy[66] = -1750912874;
        eh.xmy[67] = 1289749700;
        eh.xmy[68] = -1892354979;
        eh.xmy[69] = 790614626;
        eh.xmy[70] = 547492161;
        eh.xmy[71] = 1665183216;
        eh.xmy[72] = 1905218513;
        eh.xmy[73] = 909900134;
        eh.xmy[74] = 1833384702;
        eh.xmy[75] = 1797416054;
        eh.xmy[76] = -287983345;
        eh.xmy[77] = -1079536642;
        eh.xmy[78] = 1210723952;
        eh.xmy[79] = -1774101278;
        eh.xmy[80] = 621382193;
        eh.xmy[81] = 332291587;
        eh.xmy[82] = -549508091;
        eh.xmy[83] = -90656516;
        eh.xmy[84] = 1905856706;
        eh.xmy[85] = -1410136014;
        eh.xmy[86] = 998576993;
        eh.xmy[87] = -235536545;
        eh.xmy[88] = 125450962;
        eh.xmy[89] = 873521611;
        eh.xmy[90] = 470078796;
        eh.xmy[91] = -1467165409;
        eh.xmy[92] = 1684478233;
        eh.xmy[93] = 1392603453;
        eh.xmy[94] = -925737476;
        eh.xmy[95] = -159237064;
        eh.xmy[96] = -449593353;
        eh.xmy[97] = 731501158;
        eh.xmy[98] = 2889445;
        eh.xmy[99] = -953496741;
    }

    private static /* synthetic */ void zkl() {
        eh.xmy[400] = 1221248102;
        eh.xmy[401] = -441333289;
        eh.xmy[402] = -802514703;
        eh.xmy[403] = -174446712;
        eh.xmy[404] = 464652753;
        eh.xmy[405] = -2064550688;
        eh.xmy[406] = 423341487;
        eh.xmy[407] = -568143031;
        eh.xmy[408] = 1470543460;
        eh.xmy[409] = 818732151;
        eh.xmy[410] = -1960095951;
        eh.xmy[411] = -1279688645;
        eh.xmy[412] = -1731479646;
        eh.xmy[413] = -212115631;
        eh.xmy[414] = -1472205582;
        eh.xmy[415] = 1026033696;
        eh.xmy[416] = -1880584333;
        eh.xmy[417] = 1459438358;
        eh.xmy[418] = -1897543945;
        eh.xmy[419] = -61804318;
        eh.xmy[420] = -1841868686;
        eh.xmy[421] = 1322755144;
        eh.xmy[422] = -1710759699;
        eh.xmy[423] = 235434776;
        eh.xmy[424] = -521650;
        eh.xmy[425] = 2059147119;
        eh.xmy[426] = 2048502936;
        eh.xmy[427] = 784479214;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float finalDistance() {
        boolean bl2;
        Object object = bj;
        boolean bl3 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - eh.xmv("xom", xms(int ), (int)8);
            }
            switch ((int)object) {
                case 920106233: {
                    break block21;
                }
                case 1887258580: {
                    callSite = eh.xmv("xon", xms(int ), (int)9);
                    continue block21;
                }
                case 2022511495: {
                    callSite = eh.xmv("xoo", xms(int ), (int)10);
                    continue block21;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = bj;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - eh.xmv("xop", xms(int ), (int)11);
            }
            switch ((int)object2) {
                case -1290253805: {
                    callSite = eh.xmv("xoq", xms(int ), (int)12);
                    continue block22;
                }
                case 56714785: {
                    callSite = eh.xmv("xor", xms(int ), (int)13);
                    continue block22;
                }
                case 920106233: {
                    break block22;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = bj - eh.xmv("xos", xms(int ), (int)14)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == eh.xmv("xot", xmx(int ), (int)30)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = eh.xmv("xou", xmx(int ), (int)31);
        }
        if (bl2) return (float)eh.xmv("xov", xnp(int ), (int)32);
        if (bl2) return (float)eh.xmv("xov", xnp(int ), (int)32);
        Object object4 = bj;
        boolean bl6 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - eh.xmv("xow", xms(int ), (int)15);
            }
            switch ((int)object4) {
                case -521567711: {
                    callSite = eh.xmv("xox", xms(int ), (int)16);
                    continue block24;
                }
                case 220953384: {
                    callSite = eh.xmv("xoy", xms(int ), (int)17);
                    continue block24;
                }
                case 920106233: {
                    break block24;
                }
                case 1740250945: {
                    callSite = eh.xmv("xoz", xms(int ), (int)18);
                    continue block24;
                }
            }
            break;
        }
        Object object5 = bj;
        boolean bl7 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object5 = callSite - eh.xmv("xpa", xms(int ), (int)19);
            }
            switch ((int)object5) {
                case 330359087: {
                    callSite = eh.xmv("xpb", xms(int ), (int)20);
                    continue block25;
                }
                case 489784815: {
                    callSite = eh.xmv("xpc", xms(int ), (int)21);
                    continue block25;
                }
                case 920106233: {
                    return this.attackRange.getValue() + eh.xmv("xpd", xnp(int ), (int)33);
                }
            }
            break;
        }
        return this.attackRange.getValue() + eh.xmv("xpd", xnp(int ), (int)33);
    }

    private static /* synthetic */ void zkt() {
        eh.xmt[200] = -8245591231317092278L;
        eh.xmt[201] = -4745127801495598963L;
        eh.xmt[202] = -7007395325430742725L;
        eh.xmt[203] = -7832278049386287941L;
        eh.xmt[204] = -1986172654244378194L;
        eh.xmt[205] = -1221209206402905797L;
        eh.xmt[206] = 5744923151068008899L;
        eh.xmt[207] = -3599509402023271172L;
        eh.xmt[208] = -4381307589034155809L;
        eh.xmt[209] = 2044764861108136225L;
        eh.xmt[210] = 6831989733881753426L;
        eh.xmt[211] = -1779649902610665635L;
        eh.xmt[212] = -3229918321239005383L;
        eh.xmt[213] = -6943189670941087007L;
        eh.xmt[214] = -3549152850334884198L;
        eh.xmt[215] = -4386420195632620295L;
        eh.xmt[216] = -1709624616229052446L;
        eh.xmt[217] = -4487455432525622882L;
        eh.xmt[218] = 962570413836354633L;
        eh.xmt[219] = -8588099128716523802L;
        eh.xmt[220] = -8109597726696562062L;
        eh.xmt[221] = 5918984399904708565L;
        eh.xmt[222] = -4687632192302564548L;
        eh.xmt[223] = -6648734101972137735L;
        eh.xmt[224] = -7147976855022055019L;
        eh.xmt[225] = -8203014596646159789L;
        eh.xmt[226] = 7431022028735713163L;
        eh.xmt[227] = 1497964378244689739L;
        eh.xmt[228] = -6338945713452015888L;
        eh.xmt[229] = 7457337044453083852L;
        eh.xmt[230] = -1918475790079728592L;
        eh.xmt[231] = 2526831790458784083L;
        eh.xmt[232] = 8956658289358999215L;
        eh.xmt[233] = -5292626302975178453L;
        eh.xmt[234] = 1459073835140563041L;
        eh.xmt[235] = 3704858366310323157L;
        eh.xmt[236] = -4014117978109734807L;
        eh.xmt[237] = -3281880458181862449L;
        eh.xmt[238] = -1943013970309267693L;
        eh.xmt[239] = 4648403549323944583L;
        eh.xmt[240] = -3218879711653637130L;
        eh.xmt[241] = -675951795063562468L;
        eh.xmt[242] = 6182836845622669690L;
        eh.xmt[243] = -2472703165199522303L;
        eh.xmt[244] = -6810484388058069004L;
        eh.xmt[245] = -411838851532639093L;
        eh.xmt[246] = -7998276842348302014L;
        eh.xmt[247] = -4685434221622986027L;
        eh.xmt[248] = -8040763101206214311L;
        eh.xmt[249] = 1251529456618716602L;
        eh.xmt[250] = 3119972998557636369L;
        eh.xmt[251] = 9143356482263411608L;
        eh.xmt[252] = -6974899560126843669L;
        eh.xmt[253] = -8761148882498629976L;
        eh.xmt[254] = 8697236913591216570L;
        eh.xmt[255] = 5117803356110164318L;
        eh.xmt[256] = -6155595705695004573L;
        eh.xmt[257] = -3389324006707238318L;
        eh.xmt[258] = 8711937931012283713L;
        eh.xmt[259] = 1970554851839177867L;
        eh.xmt[260] = -4723698972998743667L;
        eh.xmt[261] = 8624494375648486941L;
        eh.xmt[262] = 4770954308729020668L;
        eh.xmt[263] = -2077285926844970792L;
        eh.xmt[264] = 7575825250450414711L;
        eh.xmt[265] = 3975992492578532195L;
        eh.xmt[266] = 4697605768590396089L;
        eh.xmt[267] = 3952004223059908910L;
        eh.xmt[268] = 1212431528017409834L;
        eh.xmt[269] = -4538638612567734775L;
        eh.xmt[270] = 2080408439588263480L;
        eh.xmt[271] = 1273968179472153610L;
        eh.xmt[272] = -2705455451243869166L;
        eh.xmt[273] = -9136740005265089399L;
        eh.xmt[274] = 159998040532859989L;
        eh.xmt[275] = -3195716974325532505L;
        eh.xmt[276] = 5241837024319678793L;
        eh.xmt[277] = -2234531290678765662L;
        eh.xmt[278] = -6769500435666808778L;
        eh.xmt[279] = -3513037665227165778L;
        eh.xmt[280] = 6270969398688897977L;
        eh.xmt[281] = -426784051734830648L;
        eh.xmt[282] = 1144999560993512065L;
        eh.xmt[283] = -6635847257312772797L;
        eh.xmt[284] = 8495260241788946238L;
        eh.xmt[285] = -3383481536034517229L;
        eh.xmt[286] = -5469210263771709897L;
        eh.xmt[287] = 5149014905487583052L;
        eh.xmt[288] = -7584730566575864109L;
        eh.xmt[289] = 3769495976090564756L;
        eh.xmt[290] = 8582792560644742661L;
        eh.xmt[291] = -3721272243146262220L;
        eh.xmt[292] = -4478564229313912808L;
        eh.xmt[293] = -9212806055827762201L;
        eh.xmt[294] = -7227520563446779477L;
        eh.xmt[295] = 457282338382158984L;
        eh.xmt[296] = 3918733340746143730L;
        eh.xmt[297] = -8143325865040780533L;
        eh.xmt[298] = -3502668993629124912L;
        eh.xmt[299] = 1969121039501713952L;
    }

    private static /* synthetic */ void zkp() {
        eh.xmz[300] = -1208817275;
        eh.xmz[301] = -1758619442;
        eh.xmz[302] = 1348343101;
        eh.xmz[303] = -1758022669;
        eh.xmz[304] = -2138242708;
        eh.xmz[305] = 2127882541;
        eh.xmz[306] = 1434104846;
        eh.xmz[307] = 98083112;
        eh.xmz[308] = -1279166698;
        eh.xmz[309] = -683372082;
        eh.xmz[310] = -2135854658;
        eh.xmz[311] = 721267130;
        eh.xmz[312] = -126130312;
        eh.xmz[313] = -836225548;
        eh.xmz[314] = 1544528004;
        eh.xmz[315] = 1577977067;
        eh.xmz[316] = -1176185858;
        eh.xmz[317] = -744432007;
        eh.xmz[318] = -565969107;
        eh.xmz[319] = 1127497513;
        eh.xmz[320] = 899658480;
        eh.xmz[321] = 75198442;
        eh.xmz[322] = 1779869840;
        eh.xmz[323] = 395348212;
        eh.xmz[324] = 1252193905;
        eh.xmz[325] = 699123216;
        eh.xmz[326] = -1028960052;
        eh.xmz[327] = -1035142565;
        eh.xmz[328] = 1149064934;
        eh.xmz[329] = -1999190763;
        eh.xmz[330] = 1068182698;
        eh.xmz[331] = -1716026300;
        eh.xmz[332] = 1708166901;
        eh.xmz[333] = -1326805552;
        eh.xmz[334] = -1528531142;
        eh.xmz[335] = 1341679611;
        eh.xmz[336] = 972109429;
        eh.xmz[337] = 1686204791;
        eh.xmz[338] = -1363990589;
        eh.xmz[339] = 1799746781;
        eh.xmz[340] = -1504712009;
        eh.xmz[341] = 641486690;
        eh.xmz[342] = -1160439056;
        eh.xmz[343] = -2056749378;
        eh.xmz[344] = 459857624;
        eh.xmz[345] = 2070378758;
        eh.xmz[346] = -1213531381;
        eh.xmz[347] = 1166491019;
        eh.xmz[348] = 461506692;
        eh.xmz[349] = -248112953;
        eh.xmz[350] = -22186226;
        eh.xmz[351] = 1035675505;
        eh.xmz[352] = 484319840;
        eh.xmz[353] = 274774734;
        eh.xmz[354] = 384729624;
        eh.xmz[355] = 848989403;
        eh.xmz[356] = -1977701229;
        eh.xmz[357] = 867178278;
        eh.xmz[358] = 327033077;
        eh.xmz[359] = 847503680;
        eh.xmz[360] = -2052646241;
        eh.xmz[361] = -1474572753;
        eh.xmz[362] = 877693518;
        eh.xmz[363] = 1393067043;
        eh.xmz[364] = -1631358694;
        eh.xmz[365] = 670554275;
        eh.xmz[366] = -2136819575;
        eh.xmz[367] = 1335744557;
        eh.xmz[368] = 1450364406;
        eh.xmz[369] = -1711503334;
        eh.xmz[370] = 1343515369;
        eh.xmz[371] = -98755047;
        eh.xmz[372] = 1719104890;
        eh.xmz[373] = -119853256;
        eh.xmz[374] = 807977882;
        eh.xmz[375] = -13474201;
        eh.xmz[376] = -1448371789;
        eh.xmz[377] = 1623120188;
        eh.xmz[378] = 433403738;
        eh.xmz[379] = 184685448;
        eh.xmz[380] = 1221095524;
        eh.xmz[381] = 1518536893;
        eh.xmz[382] = -1549570846;
        eh.xmz[383] = 981822097;
        eh.xmz[384] = -1946801513;
        eh.xmz[385] = -742742330;
        eh.xmz[386] = 1361668388;
        eh.xmz[387] = -60948601;
        eh.xmz[388] = 1692498178;
        eh.xmz[389] = -1830914717;
        eh.xmz[390] = -2118606424;
        eh.xmz[391] = -454269222;
        eh.xmz[392] = -95513792;
        eh.xmz[393] = 242720449;
        eh.xmz[394] = 542827414;
        eh.xmz[395] = 755923049;
        eh.xmz[396] = 1846034160;
        eh.xmz[397] = 1599669559;
        eh.xmz[398] = -203645355;
        eh.xmz[399] = 20945653;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static eh getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("xmw", xms(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("xna", xmx(int ), (int)0)) break;
            v0 /* !! */  = (long)eh.xmv("xnb", xmx(int ), (int)1);
        }
        var2 = eh.c;
        v1 /* !! */  = eh.bj;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - eh.xmv("xnc", xms(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1961028419: {
                    v2 = eh.xmv("xnd", xms(int ), (int)2);
                    continue block17;
                }
                case -604585729: {
                    v2 = eh.xmv("xne", xms(int ), (int)3);
                    continue block17;
                }
                case 920106233: {
                    break block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = eh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("xnf", xms(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == eh.xmv("xng", xmx(int ), (int)2)) break;
            v3 /* !! */  = (long)eh.xmv("xnh", xmx(int ), (int)3);
        }
        var0_2 = eh.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = eh.bj;
                if (true) ** GOTO lbl42
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - eh.xmv("xni", xms(int ), (int)5));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2042628486: {
                            v5 = eh.xmv("xnj", xms(int ), (int)6);
                            continue block20;
                        }
                        case -1717071017: {
                            v5 = eh.xmv("xnk", xms(int ), (int)7);
                            continue block20;
                        }
                        case 920106233: {
                            break block20;
                        }
                    }
                    break;
                }
                return nj.get(eh.class);
            }
lbl52:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)eh.xmv("xnl", xmx(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)eh.xmv("xnm", xmx(int ), (int)5);
                    if (!var2) ** GOTO lbl52
                    throw null;
                }
            }
lbl62:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)eh.xmv("xnn", xmx(int ), (int)6);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)eh.xmv("xno", xmx(int ), (int)7);
        ** while (!var2)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getPitchCorrecting() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eh.bj - eh.xmv("zjs", xms(int ), (int)409)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == eh.xmv("zjt", xmx(int ), (int)418)) break;
            v0 /* !! */  = (long)eh.xmv("zju", xmx(int ), (int)419);
        }
        var3_1 = eh.c;
        v1 /* !! */  = eh.bj;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(eh.xmv("zjw", xms(int ), (int)411) - eh.xmv("zjv", xms(int ), (int)410));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 904818804: {
                    continue block11;
                }
                case 920106233: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = eh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = eh.bj - eh.xmv("zjx", xms(int ), (int)412)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == eh.xmv("zjy", xmx(int ), (int)420)) break;
            v2 /* !! */  = (long)eh.xmv("zjz", xmx(int ), (int)421);
        }
        var1_3 = eh.a;
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
                    if ((v3 /* !! */  = (cfr_temp_2 = eh.bj - eh.xmv("zka", xms(int ), (int)413)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == eh.xmv("zkb", xmx(int ), (int)422)) break;
                    v3 /* !! */  = (long)eh.xmv("zkc", xmx(int ), (int)423);
                }
                return this.pitchCorrecting;
            }
lbl40:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)eh.xmv("zkd", xmx(int ), (int)424);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)eh.xmv("zke", xmx(int ), (int)425);
                    if (!var3_1) ** GOTO lbl40
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)eh.xmv("zkf", xmx(int ), (int)426);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)eh.xmv("zkg", xmx(int ), (int)427);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }
}

