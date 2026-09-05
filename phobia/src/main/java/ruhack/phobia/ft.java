/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1802
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1802;
import ruhack.phobia.aw;
import ruhack.phobia.cw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.nv;
import ruhack.phobia.nx;

public final class ft
extends ds {
    public static final boolean c;
    private static long[] gyvq;
    public static final int b;
    private final kb autoFirework;
    public final kg attackDistance;
    private long lastFireworkAt;
    public static final boolean a;
    private final nx movementController;
    protected static final long nu = 5742614253424325841L;
    private static long[] gyvr;
    private static int[] gyuw;
    private boolean frozen;
    private static int[] gyux;

    private static /* synthetic */ void gzfj() {
        ft.gyux[0] = -1676834954;
        ft.gyux[1] = -244624003;
        ft.gyux[2] = -1831907697;
        ft.gyux[3] = -252669936;
        ft.gyux[4] = -1198824537;
        ft.gyux[5] = -1622289695;
        ft.gyux[6] = 1545778328;
        ft.gyux[7] = 2056197791;
        ft.gyux[8] = -1252717623;
        ft.gyux[9] = -143248788;
        ft.gyux[10] = 1841801646;
        ft.gyux[11] = 1194788678;
        ft.gyux[12] = 1418012351;
        ft.gyux[13] = 1664341694;
        ft.gyux[14] = 1290859195;
        ft.gyux[15] = -1100933465;
        ft.gyux[16] = 1331275441;
        ft.gyux[17] = -1659903729;
        ft.gyux[18] = 850138863;
        ft.gyux[19] = 918251499;
        ft.gyux[20] = 1324055555;
        ft.gyux[21] = 1230795626;
        ft.gyux[22] = -327146645;
        ft.gyux[23] = 1313665605;
        ft.gyux[24] = -1971848874;
        ft.gyux[25] = 1942645077;
        ft.gyux[26] = 1133338534;
        ft.gyux[27] = 1387122350;
        ft.gyux[28] = 1443331448;
        ft.gyux[29] = 1302278989;
        ft.gyux[30] = 727854905;
        ft.gyux[31] = -92047650;
        ft.gyux[32] = -302230895;
        ft.gyux[33] = 427586343;
        ft.gyux[34] = -757592408;
        ft.gyux[35] = -1408685806;
        ft.gyux[36] = -109625193;
        ft.gyux[37] = -1497985160;
        ft.gyux[38] = -2004079365;
        ft.gyux[39] = 181683216;
        ft.gyux[40] = -1655811321;
        ft.gyux[41] = 1945540918;
        ft.gyux[42] = -649098611;
        ft.gyux[43] = -323756184;
        ft.gyux[44] = -121780783;
        ft.gyux[45] = -1000183905;
        ft.gyux[46] = 158970147;
        ft.gyux[47] = 1572545531;
        ft.gyux[48] = 990268819;
        ft.gyux[49] = -1328542119;
        ft.gyux[50] = -987342528;
        ft.gyux[51] = 1316628673;
        ft.gyux[52] = 1688940298;
        ft.gyux[53] = 1865945562;
        ft.gyux[54] = 722964662;
        ft.gyux[55] = 1298225094;
        ft.gyux[56] = 456513988;
        ft.gyux[57] = -269746679;
        ft.gyux[58] = -545573248;
        ft.gyux[59] = -242770060;
        ft.gyux[60] = -1836320230;
        ft.gyux[61] = -1337113819;
        ft.gyux[62] = 1751900111;
        ft.gyux[63] = -1848904680;
        ft.gyux[64] = 2118137437;
        ft.gyux[65] = -2011530010;
        ft.gyux[66] = -755860894;
        ft.gyux[67] = 2077156766;
        ft.gyux[68] = -1089139889;
        ft.gyux[69] = 1945259089;
        ft.gyux[70] = -745439399;
        ft.gyux[71] = 1895144683;
        ft.gyux[72] = -1099142125;
        ft.gyux[73] = 1026477223;
        ft.gyux[74] = 1587118765;
        ft.gyux[75] = -1793527105;
        ft.gyux[76] = -1992516135;
        ft.gyux[77] = -387407364;
        ft.gyux[78] = 2027933030;
        ft.gyux[79] = 1050372130;
        ft.gyux[80] = 1896836494;
        ft.gyux[81] = 1512747098;
        ft.gyux[82] = -2139302133;
        ft.gyux[83] = 789151713;
        ft.gyux[84] = -2081792236;
        ft.gyux[85] = -1509077706;
        ft.gyux[86] = -1990305285;
        ft.gyux[87] = -1209110812;
        ft.gyux[88] = -468106358;
        ft.gyux[89] = 909657157;
        ft.gyux[90] = 1831536512;
        ft.gyux[91] = -2086513598;
        ft.gyux[92] = -2023700758;
        ft.gyux[93] = 1983589782;
        ft.gyux[94] = -1144560493;
        ft.gyux[95] = -1850734839;
        ft.gyux[96] = -1811664214;
        ft.gyux[97] = 1480437288;
        ft.gyux[98] = -1840323911;
        ft.gyux[99] = -1976088145;
    }

    private static /* synthetic */ float gyuv(int n2) {
        return Float.intBitsToFloat(gyuw[n2] ^ gyux[n2]);
    }

    private static /* synthetic */ void gzfk() {
        ft.gyux[100] = -1737150353;
        ft.gyux[101] = 558826673;
        ft.gyux[102] = -2042243961;
        ft.gyux[103] = -87613671;
        ft.gyux[104] = 145963687;
        ft.gyux[105] = -1656561909;
        ft.gyux[106] = 1183190171;
        ft.gyux[107] = -1403399950;
        ft.gyux[108] = 1715974792;
        ft.gyux[109] = -814479413;
        ft.gyux[110] = 841547259;
        ft.gyux[111] = -42920277;
        ft.gyux[112] = -628976441;
        ft.gyux[113] = -1377615987;
        ft.gyux[114] = 1362883464;
        ft.gyux[115] = -1842641081;
        ft.gyux[116] = -1533552556;
        ft.gyux[117] = -1864019575;
        ft.gyux[118] = -1992789680;
        ft.gyux[119] = 683978063;
        ft.gyux[120] = -655118419;
        ft.gyux[121] = 1825359134;
        ft.gyux[122] = 1833411703;
        ft.gyux[123] = 1373986662;
        ft.gyux[124] = 135312907;
        ft.gyux[125] = 1510510851;
        ft.gyux[126] = 469410970;
        ft.gyux[127] = 608558128;
        ft.gyux[128] = -987617435;
        ft.gyux[129] = -485486065;
        ft.gyux[130] = 1495589566;
        ft.gyux[131] = -622391329;
        ft.gyux[132] = 1093324604;
        ft.gyux[133] = -267326617;
        ft.gyux[134] = 485980206;
        ft.gyux[135] = 69824042;
        ft.gyux[136] = 169396686;
        ft.gyux[137] = 702409534;
        ft.gyux[138] = 616510256;
        ft.gyux[139] = -882242329;
        ft.gyux[140] = 1273950614;
        ft.gyux[141] = -1703563754;
        ft.gyux[142] = 943034015;
        ft.gyux[143] = -733326147;
        ft.gyux[144] = 830923732;
        ft.gyux[145] = 2039343169;
        ft.gyux[146] = 1951414229;
        ft.gyux[147] = 720775277;
        ft.gyux[148] = 283048220;
        ft.gyux[149] = -1232725287;
        ft.gyux[150] = 387640541;
        ft.gyux[151] = 1331820206;
        ft.gyux[152] = 1105469383;
        ft.gyux[153] = -1817420571;
        ft.gyux[154] = 470699959;
        ft.gyux[155] = -711918734;
        ft.gyux[156] = 713830557;
        ft.gyux[157] = -1552079873;
        ft.gyux[158] = -1918129116;
        ft.gyux[159] = 1343550243;
        ft.gyux[160] = 217340625;
        ft.gyux[161] = -41651402;
        ft.gyux[162] = 1269745344;
        ft.gyux[163] = -1312866769;
        ft.gyux[164] = -77210835;
        ft.gyux[165] = 1558746165;
        ft.gyux[166] = -1817900714;
        ft.gyux[167] = -45991738;
        ft.gyux[168] = 1972531853;
    }

    static {
        gyuw = new int[169];
        gyux = new int[169];
        ft.gzfh();
        ft.gzfi();
        ft.gzfj();
        ft.gzfk();
        gyvq = new long[95];
        gyvr = new long[95];
        ft.gzfl();
        ft.gzfm();
    }

    public static /* synthetic */ CallSite gyuy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block110: {
            block109: {
                block108: {
                    block107: {
                        var7_2 = ft.c;
                        var6_3 /* !! */  = ft.b;
                        var5_4 = ft.a;
                        if (var7_2) {
                            throw null;
lbl6:
                            // 32 sources

                            return;
                        }
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (ft.mc.field_1724 == null) break block107;
                        if (var5_4) ** GOTO lbl6
                        if (ft.mc.field_1687 == null) break block107;
                        if (var5_4) ** GOTO lbl6
                        if (ft.mc.field_1724.method_6128()) break block108;
                        if (var5_4) ** GOTO lbl6
                    }
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.releaseMovement();
                    if (var5_4 || var5_4) ** GOTO lbl6
                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                var2_5 = hn.getInstance();
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var2_5 != null) break block109;
                if (var5_4) ** GOTO lbl6
                v0 = null;
                if (var7_2) {
                    throw null;
                }
                break block110;
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            v0 = var3_6 = var2_5.getTarget();
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (var3_6 == null) ** GOTO lbl50
        if (var5_4) ** GOTO lbl6
        if (!var3_6.method_5805()) ** GOTO lbl50
        if (var5_4) ** GOTO lbl6
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_6.method_6128()) ** GOTO lbl50
                if (var5_4) ** GOTO lbl6
                if (!(ft.mc.field_1724.method_5739((class_1297)var3_6) < this.attackDistance.getValue())) ** GOTO lbl50
                if (var5_4) ** GOTO lbl6
                v1 = ft.gyuy("gyvl", gyvd(int ), (int)11);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl52
lbl50:
                // 4 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                v1 = var4_7 = ft.gyuy("gyvm", gyvd(int ), (int)12);
lbl52:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                if (var4_7 == false) ** GOTO lbl67
                if (var5_4 || var5_4) ** GOTO lbl6
                if (this.frozen) ** GOTO lbl59
                if (var5_4 || var5_4) ** GOTO lbl6
                this.movementController.saveState();
                if (var5_4) ** GOTO lbl6
lbl59:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                ft.mc.field_1690.field_1894.method_23481((boolean)ft.gyuy("gyvn", gyvd(int ), (int)13));
                if (var5_4 || var5_4) ** GOTO lbl6
                this.frozen = ft.gyuy("gyvo", gyvd(int ), (int)14);
                if (var5_4) ** GOTO lbl6
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl70
lbl67:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                this.releaseMovement();
                if (var5_4) ** GOTO lbl6
lbl70:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                if (!this.autoFirework.isValue()) ** GOTO lbl81
                if (var5_4) ** GOTO lbl6
                if (var3_6 == null) ** GOTO lbl81
                if (var5_4) ** GOTO lbl6
                if (System.nanoTime() - this.lastFireworkAt < ft.gyuy("gyvs", gyvp(int ), (int)0)) ** GOTO lbl81
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!this.useFirework()) ** GOTO lbl81
                if (var5_4 || var5_4) ** GOTO lbl6
                this.lastFireworkAt = System.nanoTime();
                if (var5_4) ** GOTO lbl6
lbl81:
                // 5 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvt", gyvd(int ), (int)15);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl89:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvu", gyvd(int ), (int)16);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl94:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvv", gyvd(int ), (int)17);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl99:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvw", gyvd(int ), (int)18);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 4: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvx", gyvd(int ), (int)19);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl109:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvy", gyvd(int ), (int)20);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 6: {
                var6_3 /* !! */  = (int)ft.gyuy("gyvz", gyvd(int ), (int)21);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl119:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)ft.gyuy("gywa", gyvd(int ), (int)22);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl124:
            // 3 sources

            case 8: {
                var6_3 /* !! */  = (int)ft.gyuy("gywb", gyvd(int ), (int)23);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl129:
            // 3 sources

            case 9: {
                var6_3 /* !! */  = (int)ft.gyuy("gywc", gyvd(int ), (int)24);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 10: {
                var6_3 /* !! */  = (int)ft.gyuy("gywd", gyvd(int ), (int)25);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 11: {
                var6_3 /* !! */  = (int)ft.gyuy("gywe", gyvd(int ), (int)26);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl144:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)ft.gyuy("gywf", gyvd(int ), (int)27);
                if (!var7_2) ** GOTO lbl89
                throw null;
            }
lbl148:
            // 5 sources

            case 13: {
                var6_3 /* !! */  = (int)ft.gyuy("gywg", gyvd(int ), (int)28);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl153:
            // 3 sources

            case 14: {
                var6_3 /* !! */  = (int)ft.gyuy("gywh", gyvd(int ), (int)29);
                if (!var7_2) ** GOTO lbl94
                throw null;
            }
lbl157:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)ft.gyuy("gywi", gyvd(int ), (int)30);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 16: {
                var6_3 /* !! */  = (int)ft.gyuy("gywj", gyvd(int ), (int)31);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 17: {
                var6_3 /* !! */  = (int)ft.gyuy("gywk", gyvd(int ), (int)32);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl172:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)ft.gyuy("gywl", gyvd(int ), (int)33);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 19: {
                var6_3 /* !! */  = (int)ft.gyuy("gywm", gyvd(int ), (int)34);
                if (!var7_2) ** GOTO lbl119
                throw null;
            }
lbl181:
            // 3 sources

            case 20: {
                var6_3 /* !! */  = (int)ft.gyuy("gywn", gyvd(int ), (int)35);
                if (!var7_2) ** GOTO lbl124
                throw null;
            }
lbl185:
            // 2 sources

            case 21: {
                var6_3 /* !! */  = (int)ft.gyuy("gywo", gyvd(int ), (int)36);
                if (!var7_2) ** GOTO lbl89
                throw null;
            }
lbl189:
            // 5 sources

            case 22: {
                do {
                    var6_3 /* !! */  = (int)ft.gyuy("gywp", gyvd(int ), (int)37);
                } while (!var7_2);
                throw null;
            }
lbl194:
            // 3 sources

            case 23: {
                var6_3 /* !! */  = (int)ft.gyuy("gywq", gyvd(int ), (int)38);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl199:
            // 2 sources

            case 24: {
                var6_3 /* !! */  = (int)ft.gyuy("gywr", gyvd(int ), (int)39);
                if (!var7_2) break;
                throw null;
            }
            case 25: {
                var6_3 /* !! */  = (int)ft.gyuy("gyws", gyvd(int ), (int)40);
                if (!var7_2) ** GOTO lbl153
                throw null;
            }
lbl207:
            // 2 sources

            case 26: {
                var6_3 /* !! */  = (int)ft.gyuy("gywt", gyvd(int ), (int)41);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 27: {
                var6_3 /* !! */  = (int)ft.gyuy("gywu", gyvd(int ), (int)42);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 28: {
                var6_3 /* !! */  = (int)ft.gyuy("gywv", gyvd(int ), (int)43);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 29: {
                var6_3 /* !! */  = (int)ft.gyuy("gyww", gyvd(int ), (int)44);
                if (!var7_2) ** GOTO lbl157
                throw null;
            }
            case 30: {
                var6_3 /* !! */  = (int)ft.gyuy("gywx", gyvd(int ), (int)45);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl231:
            // 2 sources

            case 31: {
                var6_3 /* !! */  = (int)ft.gyuy("gywy", gyvd(int ), (int)46);
                if (!var7_2) ** GOTO lbl148
                throw null;
            }
lbl235:
            // 2 sources

            case 32: {
                var6_3 /* !! */  = (int)ft.gyuy("gywz", gyvd(int ), (int)47);
                if (!var7_2) ** GOTO lbl109
                throw null;
            }
            case 33: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxa", gyvd(int ), (int)48);
                if (!var7_2) ** GOTO lbl148
                throw null;
            }
            case 34: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxb", gyvd(int ), (int)49);
                if (!var7_2) ** GOTO lbl181
                throw null;
            }
            case 35: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxc", gyvd(int ), (int)50);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl252:
            // 2 sources

            case 36: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxd", gyvd(int ), (int)51);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl257:
            // 3 sources

            case 37: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxe", gyvd(int ), (int)52);
                if (!var7_2) ** GOTO lbl124
                throw null;
            }
lbl261:
            // 2 sources

            case 38: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxf", gyvd(int ), (int)53);
                if (!var7_2) ** GOTO lbl189
                throw null;
            }
lbl265:
            // 3 sources

            case 39: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxg", gyvd(int ), (int)54);
                if (!var7_2) ** GOTO lbl172
                throw null;
            }
lbl269:
            // 3 sources

            case 40: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxh", gyvd(int ), (int)55);
                if (!var7_2) ** GOTO lbl194
                throw null;
            }
lbl273:
            // 2 sources

            case 41: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxi", gyvd(int ), (int)56);
                if (!var7_2) ** GOTO lbl189
                throw null;
            }
            case 42: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxj", gyvd(int ), (int)57);
                if (!var7_2) ** GOTO lbl269
                throw null;
            }
            case 43: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxk", gyvd(int ), (int)58);
                if (!var7_2) ** GOTO lbl129
                throw null;
            }
lbl285:
            // 2 sources

            case 44: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxl", gyvd(int ), (int)59);
                if (!var7_2) ** GOTO lbl207
                throw null;
            }
lbl289:
            // 2 sources

            case 45: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxm", gyvd(int ), (int)60);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl294:
            // 2 sources

            case 46: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxn", gyvd(int ), (int)61);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl299:
            // 2 sources

            case 47: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxo", gyvd(int ), (int)62);
                if (!var7_2) ** GOTO lbl181
                throw null;
            }
lbl303:
            // 3 sources

            case 48: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxp", gyvd(int ), (int)63);
                if (!var7_2) ** GOTO lbl299
                throw null;
            }
            case 49: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxq", gyvd(int ), (int)64);
                if (!var7_2) ** GOTO lbl252
                throw null;
            }
lbl311:
            // 2 sources

            case 50: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxr", gyvd(int ), (int)65);
                if (!var7_2) ** GOTO lbl189
                throw null;
            }
lbl315:
            // 2 sources

            case 51: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)ft.gyuy("gyxs", gyvd(int ), (int)66);
                    if (!var7_2) ** GOTO lbl148
                    throw null;
                }
            }
lbl320:
            // 3 sources

            case 52: {
                var6_3 /* !! */  = (int)ft.gyuy("gyxt", gyvd(int ), (int)67);
                if (!var7_2) ** GOTO lbl99
                throw null;
            }
            case 53: 
        }
        var6_3 /* !! */  = (int)ft.gyuy("gyxu", gyvd(int ), (int)68);
        ** while (!var7_2)
lbl327:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gzfm() {
        ft.gyvr[0] = 1863238995629770548L;
        ft.gyvr[1] = -1213852173212893158L;
        ft.gyvr[2] = 1353698509511752661L;
        ft.gyvr[3] = 1708844683706617805L;
        ft.gyvr[4] = 5409203156914964457L;
        ft.gyvr[5] = -7174386436054212907L;
        ft.gyvr[6] = 3271472940216236796L;
        ft.gyvr[7] = 5150106501498503325L;
        ft.gyvr[8] = 8808325218388116963L;
        ft.gyvr[9] = 3548209874058625724L;
        ft.gyvr[10] = -623952734986670080L;
        ft.gyvr[11] = -8735145082180561632L;
        ft.gyvr[12] = 4986468792328936478L;
        ft.gyvr[13] = 1270974231656233276L;
        ft.gyvr[14] = -7651036546275315352L;
        ft.gyvr[15] = -4535578498738104818L;
        ft.gyvr[16] = -8832278083440958655L;
        ft.gyvr[17] = 4520043075489869287L;
        ft.gyvr[18] = -6359776887278979137L;
        ft.gyvr[19] = -1144830047047002466L;
        ft.gyvr[20] = -8146707198411540339L;
        ft.gyvr[21] = -5451425182997067930L;
        ft.gyvr[22] = 6652402108806279582L;
        ft.gyvr[23] = 898443407530529728L;
        ft.gyvr[24] = -3834296529053549454L;
        ft.gyvr[25] = 1965108064796586051L;
        ft.gyvr[26] = -5518031263177182269L;
        ft.gyvr[27] = -8070647282687495108L;
        ft.gyvr[28] = 4895193467937514776L;
        ft.gyvr[29] = -8088416158669987237L;
        ft.gyvr[30] = 3034430366138617355L;
        ft.gyvr[31] = 6637898847483945364L;
        ft.gyvr[32] = 694425889945287195L;
        ft.gyvr[33] = -8095919212748530192L;
        ft.gyvr[34] = -3577384030085003683L;
        ft.gyvr[35] = -3435325335818685929L;
        ft.gyvr[36] = -4779821555916968302L;
        ft.gyvr[37] = 1135339926491117130L;
        ft.gyvr[38] = 5447119516964687060L;
        ft.gyvr[39] = 122333308434116201L;
        ft.gyvr[40] = -7729946607140234036L;
        ft.gyvr[41] = -8621300546874059979L;
        ft.gyvr[42] = -5743066753315863104L;
        ft.gyvr[43] = 2181534929128985152L;
        ft.gyvr[44] = -7933536494833502153L;
        ft.gyvr[45] = 8205173786530116451L;
        ft.gyvr[46] = -5004725736446638820L;
        ft.gyvr[47] = 856860219595180730L;
        ft.gyvr[48] = -956262344836538294L;
        ft.gyvr[49] = 4787517106584455564L;
        ft.gyvr[50] = 3155964634242117506L;
        ft.gyvr[51] = 7589114077719478046L;
        ft.gyvr[52] = 7288793937726617759L;
        ft.gyvr[53] = -4188806718960047728L;
        ft.gyvr[54] = -1127584539642289592L;
        ft.gyvr[55] = -4202335886759202936L;
        ft.gyvr[56] = -1440553720563745927L;
        ft.gyvr[57] = -8262358518958120193L;
        ft.gyvr[58] = -174586806254869320L;
        ft.gyvr[59] = -4348384906811724105L;
        ft.gyvr[60] = -5655463919942431620L;
        ft.gyvr[61] = -127079137801589954L;
        ft.gyvr[62] = -3729621244049244045L;
        ft.gyvr[63] = 1174198938106153856L;
        ft.gyvr[64] = -2992399925311122442L;
        ft.gyvr[65] = -7991670528427659160L;
        ft.gyvr[66] = 8771973479036184576L;
        ft.gyvr[67] = 6074117447344628956L;
        ft.gyvr[68] = 4029822928123768329L;
        ft.gyvr[69] = -3373216424362905869L;
        ft.gyvr[70] = 4692731103053158803L;
        ft.gyvr[71] = -6775379298302118115L;
        ft.gyvr[72] = 4505434130056390342L;
        ft.gyvr[73] = -3087480077149379658L;
        ft.gyvr[74] = -3813738564506192927L;
        ft.gyvr[75] = 296050151042855459L;
        ft.gyvr[76] = 5406879626851974120L;
        ft.gyvr[77] = -428188131246458704L;
        ft.gyvr[78] = -6099325367414571832L;
        ft.gyvr[79] = -7775043342867289308L;
        ft.gyvr[80] = 6609237000079128674L;
        ft.gyvr[81] = 55387808694399407L;
        ft.gyvr[82] = -7186013067097169913L;
        ft.gyvr[83] = -6806105094777885521L;
        ft.gyvr[84] = -2241416932195567609L;
        ft.gyvr[85] = 3300080814615435226L;
        ft.gyvr[86] = 6952681255117987027L;
        ft.gyvr[87] = -4409022807388077366L;
        ft.gyvr[88] = 1378833952745978844L;
        ft.gyvr[89] = -144182394530248055L;
        ft.gyvr[90] = 2884812533518374449L;
        ft.gyvr[91] = -8329378026769714676L;
        ft.gyvr[92] = 535834353187220659L;
        ft.gyvr[93] = 6795121451946763820L;
        ft.gyvr[94] = -4033401340565198744L;
    }

    public ft() {
        int n2 = b;
        super("ElytraMotion", "\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445 \u0432\u043e\u0437\u043b\u0435 \u043b\u0435\u0442\u044f\u0449\u0435\u0439 \u0446\u0435\u043b\u0438", du.MOVEMENT);
        this.attackDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0440\u0430\u0431\u043e\u0442\u044b", "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0438 \u0432\u043e\u0437\u043b\u0435 \u0446\u0435\u043b\u0438", (float)ft.gyuy("gyuz", gyuv(int ), (int)0)).range((float)ft.gyuy("gyva", gyuv(int ), (int)1), (float)ft.gyuy("gyvb", gyuv(int ), (int)2)).step((float)ft.gyuy("gyvc", gyuv(int ), (int)3));
        this.autoFirework = new kb("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a \u043f\u0440\u0438 \u043f\u0440\u0435\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u0438\u0438 \u0446\u0435\u043b\u0438");
        this.movementController = new nx();
        this.settings(this.attackDistance, this.autoFirework);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean useFirework() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ft.nu - ft.gyuy("gzbf", gyvp(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ft.gyuy("gzbg", gyvd(int ), (int)113)) break;
            v0 /* !! */  = (long)ft.gyuy("gzbh", gyvd(int ), (int)114);
        }
        var6_1 = ft.c;
        v1 /* !! */  = ft.nu;
        if (true) ** GOTO lbl11
        block98: while (true) {
            v1 /* !! */  = (long)(v2 - ft.gyuy("gzbi", gyvp(int ), (int)46));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1996506723: {
                    v2 = ft.gyuy("gzbj", gyvp(int ), (int)47);
                    continue block98;
                }
                case -512510767: {
                    break block98;
                }
                case -350488896: {
                    v2 = ft.gyuy("gzbk", gyvp(int ), (int)48);
                    continue block98;
                }
                case 74428571: {
                    v2 = ft.gyuy("gzbl", gyvp(int ), (int)49);
                    continue block98;
                }
            }
            break;
        }
        var5_2 /* !! */  = ft.b;
        v3 /* !! */  = ft.nu;
        if (true) ** GOTO lbl28
        block99: while (true) {
            v3 /* !! */  = (long)(v4 - ft.gyuy("gzbm", gyvp(int ), (int)50));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -577061498: {
                    v4 = ft.gyuy("gzbn", gyvp(int ), (int)51);
                    continue block99;
                }
                case -512510767: {
                    break block99;
                }
                case 719497029: {
                    v4 = ft.gyuy("gzbo", gyvp(int ), (int)52);
                    continue block99;
                }
            }
            break;
        }
        var4_3 = ft.a;
        if (var6_1) {
            throw null;
lbl40:
            // 15 sources

            return (boolean)ft.gyuy("gzbp", gyvd(int ), (int)115);
        }
        if (var4_3 || var4_3) ** GOTO lbl40
        v5 /* !! */  = ft.nu;
        if (true) ** GOTO lbl47
        block101: while (true) {
            v5 /* !! */  = (long)(v6 - ft.gyuy("gzbq", gyvp(int ), (int)53));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -573930528: {
                    v6 = ft.gyuy("gzbr", gyvp(int ), (int)54);
                    continue block101;
                }
                case -512510767: {
                    break block101;
                }
                case -153962159: {
                    v6 = ft.gyuy("gzbs", gyvp(int ), (int)55);
                    continue block101;
                }
                case 50087272: {
                    v6 = ft.gyuy("gzbt", gyvp(int ), (int)56);
                    continue block101;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = ft.nu - ft.gyuy("gzbu", gyvp(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ft.gyuy("gzbv", gyvd(int ), (int)116)) break;
            v7 /* !! */  = (long)ft.gyuy("gzbw", gyvd(int ), (int)117);
        }
        var1_4 = nv.findHotbar(class_1802.field_8639);
        if (var4_3 || var4_3) ** GOTO lbl40
        v8 /* !! */  = ft.nu;
        if (true) ** GOTO lbl70
        block103: while (true) {
            v8 /* !! */  = (long)(ft.gyuy("gzby", gyvp(int ), (int)59) - ft.gyuy("gzbx", gyvp(int ), (int)58));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -512510767: {
                    break block103;
                }
                case 234781974: {
                    continue block103;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = ft.nu - ft.gyuy("gzbz", gyvp(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ft.gyuy("gzca", gyvd(int ), (int)118)) break;
            v9 /* !! */  = (long)ft.gyuy("gzcb", gyvd(int ), (int)119);
        }
        v10 = ft.mc.field_1724;
        v11 /* !! */  = ft.nu;
        if (true) ** GOTO lbl85
        block105: while (true) {
            v11 /* !! */  = (long)(ft.gyuy("gzcd", gyvp(int ), (int)62) - ft.gyuy("gzcc", gyvp(int ), (int)61));
lbl85:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -512510767: {
                    break block105;
                }
                case 1341932198: {
                    continue block105;
                }
            }
            break;
        }
        v12 = v10.method_31548();
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = ft.nu - ft.gyuy("gzce", gyvp(int ), (int)63)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ft.gyuy("gzcf", gyvd(int ), (int)120)) break;
            v13 /* !! */  = (long)ft.gyuy("gzcg", gyvd(int ), (int)121);
        }
        var2_5 = v12.method_67532();
        if (var4_3 || var4_3) ** GOTO lbl40
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = ft.nu - ft.gyuy("gzch", gyvp(int ), (int)64)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ft.gyuy("gzci", gyvd(int ), (int)122)) break;
            v14 /* !! */  = (long)ft.gyuy("gzcj", gyvd(int ), (int)123);
        }
        if (!var1_4.found()) ** GOTO lbl172
        if (var4_3 || var4_3) ** GOTO lbl40
        v15 /* !! */  = ft.nu;
        if (true) ** GOTO lbl109
        block108: while (true) {
            v15 /* !! */  = (long)(v16 - ft.gyuy("gzck", gyvp(int ), (int)65));
lbl109:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1167840144: {
                    v16 = ft.gyuy("gzcl", gyvp(int ), (int)66);
                    continue block108;
                }
                case -1115101112: {
                    v16 = ft.gyuy("gzcm", gyvp(int ), (int)67);
                    continue block108;
                }
                case -512510767: {
                    break block108;
                }
                case 1430926671: {
                    v16 = ft.gyuy("gzcn", gyvp(int ), (int)68);
                    continue block108;
                }
            }
            break;
        }
        v17 = var1_4.slot();
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = ft.nu - ft.gyuy("gzco", gyvp(int ), (int)69)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ft.gyuy("gzcp", gyvd(int ), (int)124)) break;
            v18 /* !! */  = (long)ft.gyuy("gzcq", gyvd(int ), (int)125);
        }
        nv.selectSlotSilent(v17);
        if (var4_3 || var4_3) ** GOTO lbl40
        v19 /* !! */  = ft.nu;
        if (true) ** GOTO lbl133
        block110: while (true) {
            v19 /* !! */  = (long)(v20 - ft.gyuy("gzcr", gyvp(int ), (int)70));
lbl133:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -512510767: {
                    break block110;
                }
                case -460699534: {
                    v20 = ft.gyuy("gzcs", gyvp(int ), (int)71);
                    continue block110;
                }
                case 196713119: {
                    v20 = ft.gyuy("gzct", gyvp(int ), (int)72);
                    continue block110;
                }
            }
            break;
        }
        v21 /* !! */  = ft.nu;
        if (true) ** GOTO lbl146
        block111: while (true) {
            v21 /* !! */  = (long)(v22 - ft.gyuy("gzcu", gyvp(int ), (int)73));
lbl146:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -512510767: {
                    break block111;
                }
                case -467202684: {
                    v22 = ft.gyuy("gzcv", gyvp(int ), (int)74);
                    continue block111;
                }
                case 965802545: {
                    v22 = ft.gyuy("gzcw", gyvp(int ), (int)75);
                    continue block111;
                }
                case 1798512074: {
                    v22 = ft.gyuy("gzcx", gyvp(int ), (int)76);
                    continue block111;
                }
            }
            break;
        }
        nv.sendUsePacket(class_1268.field_5808);
        if (var4_3 || var4_3) ** GOTO lbl40
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_6 = ft.nu - ft.gyuy("gzcy", gyvp(int ), (int)77)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == ft.gyuy("gzcz", gyvd(int ), (int)126)) break;
            v23 /* !! */  = (long)ft.gyuy("gzda", gyvd(int ), (int)127);
        }
        nv.selectSlotSilent(var2_5);
        if (var4_3) ** GOTO lbl40
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        block42 : switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl40
                return (boolean)ft.gyuy("gzdb", gyvd(int ), (int)128);
            }
lbl172:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl40
            v24 /* !! */  = ft.nu;
            if (true) ** GOTO lbl177
            block113: while (true) {
                v24 /* !! */  = (long)(ft.gyuy("gzdd", gyvp(int ), (int)79) - ft.gyuy("gzdc", gyvp(int ), (int)78));
lbl177:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -512510767: {
                        break block113;
                    }
                    case 1268553170: {
                        continue block113;
                    }
                }
                break;
            }
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_7 = ft.nu - ft.gyuy("gzde", gyvp(int ), (int)80)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == ft.gyuy("gzdf", gyvd(int ), (int)129)) break;
                v25 /* !! */  = (long)ft.gyuy("gzdg", gyvd(int ), (int)130);
            }
            var3_6 = nv.find(class_1802.field_8639);
            if (var4_3 || var4_3) ** GOTO lbl40
            v26 /* !! */  = ft.nu;
            if (true) ** GOTO lbl193
            block115: while (true) {
                v26 /* !! */  = (long)(ft.gyuy("gzdi", gyvp(int ), (int)82) - ft.gyuy("gzdh", gyvp(int ), (int)81));
lbl193:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -638887077: {
                        continue block115;
                    }
                    case -512510767: {
                        break block115;
                    }
                }
                break;
            }
            if (var3_6.found()) ** GOTO lbl201
            if (var4_3) ** GOTO lbl40
            return (boolean)ft.gyuy("gzdj", gyvd(int ), (int)131);
lbl201:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl40
            v27 /* !! */  = ft.nu;
            if (true) ** GOTO lbl206
            block116: while (true) {
                v27 /* !! */  = (long)(v28 - ft.gyuy("gzdk", gyvp(int ), (int)83));
lbl206:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -1655233123: {
                        v28 = ft.gyuy("gzdl", gyvp(int ), (int)84);
                        continue block116;
                    }
                    case -512510767: {
                        break block116;
                    }
                    case 1793327059: {
                        v28 = ft.gyuy("gzdm", gyvp(int ), (int)85);
                        continue block116;
                    }
                }
                break;
            }
            v29 = var3_6.slot();
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_8 = ft.nu - ft.gyuy("gzdn", gyvp(int ), (int)86)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == ft.gyuy("gzdo", gyvd(int ), (int)132)) break;
                v30 /* !! */  = (long)ft.gyuy("gzdp", gyvd(int ), (int)133);
            }
            nv.swapHotbar(v29, var2_5);
            if (var4_3 || var4_3) ** GOTO lbl40
            v31 /* !! */  = ft.nu;
            if (true) ** GOTO lbl227
            block118: while (true) {
                v31 /* !! */  = (long)(v32 - ft.gyuy("gzdq", gyvp(int ), (int)87));
lbl227:
                // 2 sources

                switch ((int)v31 /* !! */ ) {
                    case -1492749792: {
                        v32 = ft.gyuy("gzdr", gyvp(int ), (int)88);
                        continue block118;
                    }
                    case -512510767: {
                        break block118;
                    }
                    case 1423689621: {
                        v32 = ft.gyuy("gzds", gyvp(int ), (int)89);
                        continue block118;
                    }
                }
                break;
            }
            v33 /* !! */  = ft.nu;
            if (true) ** GOTO lbl240
            block119: while (true) {
                v33 /* !! */  = (long)(v34 - ft.gyuy("gzdt", gyvp(int ), (int)90));
lbl240:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case -2052643296: {
                        v34 = ft.gyuy("gzdu", gyvp(int ), (int)91);
                        continue block119;
                    }
                    case -512510767: {
                        break block119;
                    }
                    case 132594373: {
                        v34 = ft.gyuy("gzdv", gyvp(int ), (int)92);
                        continue block119;
                    }
                }
                break;
            }
            nv.sendUsePacket(class_1268.field_5808);
            if (var4_3 || var4_3) ** GOTO lbl40
            while (true) {
                if ((v35 /* !! */  = (cfr_temp_9 = ft.nu - ft.gyuy("gzdw", gyvp(int ), (int)93)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v35 /* !! */  == ft.gyuy("gzdx", gyvd(int ), (int)134)) break;
                v35 /* !! */  = (long)ft.gyuy("gzdy", gyvd(int ), (int)135);
            }
            v36 = var3_6.slot();
            while (true) {
                if ((v37 /* !! */  = (cfr_temp_10 = ft.nu - ft.gyuy("gzdz", gyvp(int ), (int)94)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v37 /* !! */  == ft.gyuy("gzea", gyvd(int ), (int)136)) break;
                v37 /* !! */  = (long)ft.gyuy("gzeb", gyvd(int ), (int)137);
            }
            nv.swapHotbar(v36, var2_5);
            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return (boolean)ft.gyuy("gzec", gyvd(int ), (int)138);
            case 0: {
                var5_2 /* !! */  = (int)ft.gyuy("gzed", gyvd(int ), (int)139);
                if (var6_1) {
                    throw null;
                }
            }
lbl270:
            // 4 sources

            case 1: {
                do {
                    var5_2 /* !! */  = (int)ft.gyuy("gzee", gyvd(int ), (int)140);
                } while (!var6_1);
                throw null;
            }
            case 2: {
                var5_2 /* !! */  = (int)ft.gyuy("gzef", gyvd(int ), (int)141);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl280:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)ft.gyuy("gzeg", gyvd(int ), (int)142);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl285:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)ft.gyuy("gzeh", gyvd(int ), (int)143);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 5: {
                var5_2 /* !! */  = (int)ft.gyuy("gzei", gyvd(int ), (int)144);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl295:
            // 4 sources

            case 6: {
                var5_2 /* !! */  = (int)ft.gyuy("gzej", gyvd(int ), (int)145);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl300:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)ft.gyuy("gzek", gyvd(int ), (int)146);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl305:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)ft.gyuy("gzel", gyvd(int ), (int)147);
                if (!var6_1) ** GOTO lbl300
                throw null;
            }
lbl309:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)ft.gyuy("gzem", gyvd(int ), (int)148);
                if (!var6_1) ** GOTO lbl280
                throw null;
            }
lbl313:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)ft.gyuy("gzen", gyvd(int ), (int)149);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl318:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)ft.gyuy("gzeo", gyvd(int ), (int)150);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl323:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)ft.gyuy("gzep", gyvd(int ), (int)151);
                if (!var6_1) ** GOTO lbl270
                throw null;
            }
lbl327:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)ft.gyuy("gzeq", gyvd(int ), (int)152);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 14: {
                var5_2 /* !! */  = (int)ft.gyuy("gzer", gyvd(int ), (int)153);
                if (!var6_1) ** GOTO lbl313
                throw null;
            }
lbl336:
            // 2 sources

            case 15: {
                do {
                    var5_2 /* !! */  = (int)ft.gyuy("gzes", gyvd(int ), (int)154);
                } while (!var6_1);
                throw null;
            }
            case 16: {
                var5_2 /* !! */  = (int)ft.gyuy("gzet", gyvd(int ), (int)155);
                if (!var6_1) ** GOTO lbl285
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ft.gyuy("gzeu", gyvd(int ), (int)156);
                    if (!var6_1) break block42;
                    throw null;
                }
            }
lbl350:
            // 4 sources

            case 18: {
                var5_2 /* !! */  = (int)ft.gyuy("gzev", gyvd(int ), (int)157);
                if (!var6_1) ** GOTO lbl309
                throw null;
            }
lbl354:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)ft.gyuy("gzew", gyvd(int ), (int)158);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 20: {
                var5_2 /* !! */  = (int)ft.gyuy("gzex", gyvd(int ), (int)159);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 21: {
                var5_2 /* !! */  = (int)ft.gyuy("gzey", gyvd(int ), (int)160);
                if (!var6_1) break;
                throw null;
            }
            case 22: {
                var5_2 /* !! */  = (int)ft.gyuy("gzez", gyvd(int ), (int)161);
                if (!var6_1) ** GOTO lbl350
                throw null;
            }
            case 23: {
                var5_2 /* !! */  = (int)ft.gyuy("gzfa", gyvd(int ), (int)162);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl377:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)ft.gyuy("gzfb", gyvd(int ), (int)163);
                if (!var6_1) ** GOTO lbl295
                throw null;
            }
lbl381:
            // 2 sources

            case 25: {
                var5_2 /* !! */  = (int)ft.gyuy("gzfc", gyvd(int ), (int)164);
                if (!var6_1) ** GOTO lbl350
                throw null;
            }
lbl385:
            // 3 sources

            case 26: {
                var5_2 /* !! */  = (int)ft.gyuy("gzfd", gyvd(int ), (int)165);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 27: {
                var5_2 /* !! */  = (int)ft.gyuy("gzfe", gyvd(int ), (int)166);
                if (!var6_1) ** GOTO lbl295
                throw null;
            }
lbl394:
            // 3 sources

            case 28: {
                var5_2 /* !! */  = (int)ft.gyuy("gzff", gyvd(int ), (int)167);
                if (!var6_1) ** GOTO lbl327
                throw null;
            }
            case 29: 
        }
        var5_2 /* !! */  = (int)ft.gyuy("gzfg", gyvd(int ), (int)168);
        ** while (!var6_1)
lbl401:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void releaseMovement() {
        v0 /* !! */  = ft.nu;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - ft.gyuy("gzab", gyvp(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1659472309: {
                    v1 = ft.gyuy("gzac", gyvp(int ), (int)32);
                    continue block35;
                }
                case -512510767: {
                    break block35;
                }
                case 770902591: {
                    v1 = ft.gyuy("gzad", gyvp(int ), (int)33);
                    continue block35;
                }
            }
            break;
        }
        var3_1 = ft.c;
        v2 /* !! */  = ft.nu;
        if (true) ** GOTO lbl19
        block36: while (true) {
            v2 /* !! */  = (long)(ft.gyuy("gzaf", gyvp(int ), (int)35) - ft.gyuy("gzae", gyvp(int ), (int)34));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2046890202: {
                    continue block36;
                }
                case -512510767: {
                    break block36;
                }
            }
            break;
        }
        var2_2 /* !! */  = ft.b;
        v3 /* !! */  = ft.nu;
        if (true) ** GOTO lbl29
        block37: while (true) {
            v3 /* !! */  = (long)(ft.gyuy("gzah", gyvp(int ), (int)37) - ft.gyuy("gzag", gyvp(int ), (int)36));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -882623772: {
                    continue block37;
                }
                case -512510767: {
                    break block37;
                }
            }
            break;
        }
        var1_3 = ft.a;
        if (var3_1) {
            throw null;
lbl37:
            // 6 sources

            return;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ft.nu - ft.gyuy("gzai", gyvp(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ft.gyuy("gzaj", gyvd(int ), (int)97)) break;
                    v4 /* !! */  = (long)ft.gyuy("gzak", gyvd(int ), (int)98);
                }
                if (!this.frozen) ** GOTO lbl71
                if (var1_3 || var1_3) ** GOTO lbl37
                v5 /* !! */  = ft.nu;
                if (true) ** GOTO lbl55
                block40: while (true) {
                    v5 /* !! */  = (long)(v6 - ft.gyuy("gzal", gyvp(int ), (int)39));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -543549422: {
                            v6 = ft.gyuy("gzam", gyvp(int ), (int)40);
                            continue block40;
                        }
                        case -512510767: {
                            break block40;
                        }
                        case 2003187566: {
                            v6 = ft.gyuy("gzan", gyvp(int ), (int)41);
                            continue block40;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ft.nu - ft.gyuy("gzao", gyvp(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ft.gyuy("gzap", gyvd(int ), (int)99)) break;
                    v7 /* !! */  = (long)ft.gyuy("gzaq", gyvd(int ), (int)100);
                }
                this.movementController.restoreFromCurrent();
                if (var1_3) ** GOTO lbl37
lbl71:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                v8 = ft.gyuy("gzar", gyvd(int ), (int)101);
                v9 /* !! */  = ft.nu;
                if (true) ** GOTO lbl77
                block42: while (true) {
                    v9 /* !! */  = (long)(ft.gyuy("gzat", gyvp(int ), (int)44) - ft.gyuy("gzas", gyvp(int ), (int)43));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -512510767: {
                            break block42;
                        }
                        case 441554639: {
                            continue block42;
                        }
                    }
                    break;
                }
                this.frozen = v8;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl86:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ft.gyuy("gzau", gyvd(int ), (int)102);
                if (var3_1) {
                    throw null;
                }
            }
lbl90:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ft.gyuy("gzav", gyvd(int ), (int)103);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 2: {
                var2_2 /* !! */  = (int)ft.gyuy("gzaw", gyvd(int ), (int)104);
                if (!var3_1) break;
                throw null;
            }
lbl99:
            // 3 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)ft.gyuy("gzax", gyvd(int ), (int)105);
                } while (!var3_1);
                throw null;
            }
lbl104:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ft.gyuy("gzay", gyvd(int ), (int)106);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ft.gyuy("gzaz", gyvd(int ), (int)107);
                    if (!var3_1) ** GOTO lbl104
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ft.gyuy("gzba", gyvd(int ), (int)108);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ft.gyuy("gzbb", gyvd(int ), (int)109);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
lbl121:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ft.gyuy("gzbc", gyvd(int ), (int)110);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ft.gyuy("gzbd", gyvd(int ), (int)111);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ft.gyuy("gzbe", gyvd(int ), (int)112);
        ** while (!var3_1)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long gyvp(int n2) {
        return gyvq[n2] ^ gyvr[n2];
    }

    private static /* synthetic */ void gzfi() {
        ft.gyuw[100] = 1207412395;
        ft.gyuw[101] = 558826673;
        ft.gyuw[102] = -2042243966;
        ft.gyuw[103] = -87613668;
        ft.gyuw[104] = 145963682;
        ft.gyuw[105] = -1656561911;
        ft.gyuw[106] = 1183190162;
        ft.gyuw[107] = -1403399949;
        ft.gyuw[108] = 1715974795;
        ft.gyuw[109] = -814479415;
        ft.gyuw[110] = 841547261;
        ft.gyuw[111] = -42920279;
        ft.gyuw[112] = -628976442;
        ft.gyuw[113] = -1377615988;
        ft.gyuw[114] = -1203847973;
        ft.gyuw[115] = -1842641082;
        ft.gyuw[116] = -1533552555;
        ft.gyuw[117] = 776814406;
        ft.gyuw[118] = -1992789679;
        ft.gyuw[119] = 1161796527;
        ft.gyuw[120] = -655118420;
        ft.gyuw[121] = -490071836;
        ft.gyuw[122] = -1833411704;
        ft.gyuw[123] = -1342986131;
        ft.gyuw[124] = 135312906;
        ft.gyuw[125] = -150480349;
        ft.gyuw[126] = 469410971;
        ft.gyuw[127] = 1250474601;
        ft.gyuw[128] = -987617436;
        ft.gyuw[129] = 485486064;
        ft.gyuw[130] = -859003226;
        ft.gyuw[131] = -622391329;
        ft.gyuw[132] = 1093324605;
        ft.gyuw[133] = -93414537;
        ft.gyuw[134] = 485980207;
        ft.gyuw[135] = 1739402522;
        ft.gyuw[136] = 169396687;
        ft.gyuw[137] = 1007497718;
        ft.gyuw[138] = 616510257;
        ft.gyuw[139] = -882242323;
        ft.gyuw[140] = 1273950616;
        ft.gyuw[141] = -1703563771;
        ft.gyuw[142] = 943034007;
        ft.gyuw[143] = -733326157;
        ft.gyuw[144] = 830923726;
        ft.gyuw[145] = 2039343192;
        ft.gyuw[146] = 1951414228;
        ft.gyuw[147] = 720775272;
        ft.gyuw[148] = 283048206;
        ft.gyuw[149] = -1232725300;
        ft.gyuw[150] = 387640535;
        ft.gyuw[151] = 1331820217;
        ft.gyuw[152] = 1105469404;
        ft.gyuw[153] = -1817420551;
        ft.gyuw[154] = 470699953;
        ft.gyuw[155] = -711918723;
        ft.gyuw[156] = 713830555;
        ft.gyuw[157] = -1552079891;
        ft.gyuw[158] = -1918129106;
        ft.gyuw[159] = 1343550261;
        ft.gyuw[160] = 217340634;
        ft.gyuw[161] = -41651396;
        ft.gyuw[162] = 1269745355;
        ft.gyuw[163] = -1312866771;
        ft.gyuw[164] = -77210840;
        ft.gyuw[165] = 1558746169;
        ft.gyuw[166] = -1817900709;
        ft.gyuw[167] = -45991741;
        ft.gyuw[168] = 1972531866;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTravel(cw var1_1) {
        v0 /* !! */  = ft.nu;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - ft.gyuy("gyxv", gyvp(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -512510767: {
                    break block44;
                }
                case 154632305: {
                    v1 = ft.gyuy("gyxw", gyvp(int ), (int)2);
                    continue block44;
                }
                case 158609933: {
                    v1 = ft.gyuy("gyxx", gyvp(int ), (int)3);
                    continue block44;
                }
            }
            break;
        }
        var4_2 = ft.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ft.nu - ft.gyuy("gyxy", gyvp(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ft.gyuy("gyxz", gyvd(int ), (int)69)) break;
            v2 /* !! */  = (long)ft.gyuy("gyya", gyvd(int ), (int)70);
        }
        var3_3 /* !! */  = ft.b;
        v3 /* !! */  = ft.nu;
        if (true) ** GOTO lbl25
        block46: while (true) {
            v3 /* !! */  = (long)(v4 - ft.gyuy("gyyb", gyvp(int ), (int)5));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2006035015: {
                    v4 = ft.gyuy("gyyc", gyvp(int ), (int)6);
                    continue block46;
                }
                case -512510767: {
                    break block46;
                }
                case 1817218694: {
                    v4 = ft.gyuy("gyyd", gyvp(int ), (int)7);
                    continue block46;
                }
            }
            break;
        }
        var2_4 = ft.a;
        if (var4_2) {
            throw null;
lbl37:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        v5 /* !! */  = ft.nu;
        if (true) ** GOTO lbl44
        block48: while (true) {
            v5 /* !! */  = (long)(ft.gyuy("gyyf", gyvp(int ), (int)9) - ft.gyuy("gyye", gyvp(int ), (int)8));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -512510767: {
                    break block48;
                }
                case 1234845688: {
                    continue block48;
                }
            }
            break;
        }
        if (!var1_1.isPre()) ** GOTO lbl113
        if (var2_4) ** GOTO lbl37
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ft.nu - ft.gyuy("gyyg", gyvp(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ft.gyuy("gyyh", gyvd(int ), (int)71)) break;
            v6 /* !! */  = (long)ft.gyuy("gyyi", gyvd(int ), (int)72);
        }
        if (!this.frozen) ** GOTO lbl113
        if (var2_4 || var2_4) ** GOTO lbl37
        v7 /* !! */  = ft.nu;
        if (true) ** GOTO lbl62
        block50: while (true) {
            v7 /* !! */  = (long)(v8 - ft.gyuy("gyyj", gyvp(int ), (int)11));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -977413528: {
                    v8 = ft.gyuy("gyyk", gyvp(int ), (int)12);
                    continue block50;
                }
                case -512510767: {
                    break block50;
                }
                case 93164785: {
                    v8 = ft.gyuy("gyyl", gyvp(int ), (int)13);
                    continue block50;
                }
            }
            break;
        }
        v9 /* !! */  = ft.nu;
        if (true) ** GOTO lbl75
        block51: while (true) {
            v9 /* !! */  = (long)(v10 - ft.gyuy("gyym", gyvp(int ), (int)14));
lbl75:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1183976360: {
                    v10 = ft.gyuy("gyyn", gyvp(int ), (int)15);
                    continue block51;
                }
                case -512510767: {
                    break block51;
                }
                case -432100390: {
                    v10 = ft.gyuy("gyyo", gyvp(int ), (int)16);
                    continue block51;
                }
            }
            break;
        }
        v11 = ft.mc.field_1724;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = ft.nu - ft.gyuy("gyyp", gyvp(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ft.gyuy("gyyq", gyvd(int ), (int)73)) break;
            v12 /* !! */  = (long)ft.gyuy("gyyr", gyvd(int ), (int)74);
        }
        v11.method_18800(0.0, 0.0, 0.0);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block24 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl37
                v13 /* !! */  = ft.nu;
                if (true) ** GOTO lbl99
                block53: while (true) {
                    v13 /* !! */  = (long)(v14 - ft.gyuy("gyys", gyvp(int ), (int)18));
lbl99:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1920635231: {
                            v14 = ft.gyuy("gyyt", gyvp(int ), (int)19);
                            continue block53;
                        }
                        case -938393108: {
                            v14 = ft.gyuy("gyyu", gyvp(int ), (int)20);
                            continue block53;
                        }
                        case -512510767: {
                            break block53;
                        }
                        case 1070486406: {
                            v14 = ft.gyuy("gyyv", gyvp(int ), (int)21);
                            continue block53;
                        }
                    }
                    break;
                }
                var1_1.cancel();
                if (var2_4) ** GOTO lbl37
lbl113:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ft.gyuy("gyyw", gyvd(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                var3_3 /* !! */  = (int)ft.gyuy("gyyx", gyvd(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl126:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ft.gyuy("gyyy", gyvd(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 3: {
                var3_3 /* !! */  = (int)ft.gyuy("gyyz", gyvd(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl136:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ft.gyuy("gyza", gyvd(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
            }
lbl140:
            // 4 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)ft.gyuy("gyzb", gyvd(int ), (int)80);
                } while (!var4_2);
                throw null;
            }
lbl145:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ft.gyuy("gyzc", gyvd(int ), (int)81);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
lbl149:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ft.gyuy("gyzd", gyvd(int ), (int)82);
                    if (!var4_2) break block24;
                    throw null;
                }
            }
lbl154:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ft.gyuy("gyze", gyvd(int ), (int)83);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)ft.gyuy("gyzf", gyvd(int ), (int)84);
                if (!var4_2) ** GOTO lbl140
                throw null;
            }
lbl162:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)ft.gyuy("gyzg", gyvd(int ), (int)85);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)ft.gyuy("gyzh", gyvd(int ), (int)86);
        ** while (!var4_2)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int gyvd(int n2) {
        return gyuw[n2] ^ gyux[n2];
    }

    private static /* synthetic */ void gzfh() {
        ft.gyuw[0] = -598898826;
        ft.gyuw[1] = -861431376;
        ft.gyuw[2] = -764457329;
        ft.gyuw[3] = -851682083;
        ft.gyuw[4] = -1198824537;
        ft.gyuw[5] = -1622289689;
        ft.gyuw[6] = 1545778330;
        ft.gyuw[7] = 2056197788;
        ft.gyuw[8] = -1252717617;
        ft.gyuw[9] = -143248788;
        ft.gyuw[10] = 1841801640;
        ft.gyuw[11] = 1194788679;
        ft.gyuw[12] = 1418012351;
        ft.gyuw[13] = 1664341694;
        ft.gyuw[14] = 1290859194;
        ft.gyuw[15] = -1100933497;
        ft.gyuw[16] = 1331275393;
        ft.gyuw[17] = -1659903738;
        ft.gyuw[18] = 850138847;
        ft.gyuw[19] = 918251504;
        ft.gyuw[20] = 1324055565;
        ft.gyuw[21] = 1230795597;
        ft.gyuw[22] = -327146675;
        ft.gyuw[23] = 1313665655;
        ft.gyuw[24] = -1971848866;
        ft.gyuw[25] = 1942645115;
        ft.gyuw[26] = 1133338556;
        ft.gyuw[27] = 1387122339;
        ft.gyuw[28] = 1443331454;
        ft.gyuw[29] = 1302278984;
        ft.gyuw[30] = 727854901;
        ft.gyuw[31] = -92047664;
        ft.gyuw[32] = -302230890;
        ft.gyuw[33] = 427586361;
        ft.gyuw[34] = -757592448;
        ft.gyuw[35] = -1408685766;
        ft.gyuw[36] = -109625194;
        ft.gyuw[37] = -1497985198;
        ft.gyuw[38] = -2004079399;
        ft.gyuw[39] = 181683252;
        ft.gyuw[40] = -1655811326;
        ft.gyuw[41] = 1945540924;
        ft.gyuw[42] = -649098598;
        ft.gyuw[43] = -323756209;
        ft.gyuw[44] = -121780737;
        ft.gyuw[45] = -1000183877;
        ft.gyuw[46] = 158970152;
        ft.gyuw[47] = 1572545515;
        ft.gyuw[48] = 990268824;
        ft.gyuw[49] = -1328542084;
        ft.gyuw[50] = -987342496;
        ft.gyuw[51] = 1316628699;
        ft.gyuw[52] = 1688940309;
        ft.gyuw[53] = 1865945582;
        ft.gyuw[54] = 722964632;
        ft.gyuw[55] = 1298225088;
        ft.gyuw[56] = 456514016;
        ft.gyuw[57] = -269746665;
        ft.gyuw[58] = -545573224;
        ft.gyuw[59] = -242770053;
        ft.gyuw[60] = -1836320225;
        ft.gyuw[61] = -1337113799;
        ft.gyuw[62] = 1751900109;
        ft.gyuw[63] = -1848904659;
        ft.gyuw[64] = 2118137419;
        ft.gyuw[65] = -2011529989;
        ft.gyuw[66] = -755860868;
        ft.gyuw[67] = 2077156787;
        ft.gyuw[68] = -1089139861;
        ft.gyuw[69] = 1945259088;
        ft.gyuw[70] = -1187107685;
        ft.gyuw[71] = 1895144682;
        ft.gyuw[72] = -2037104412;
        ft.gyuw[73] = 1026477222;
        ft.gyuw[74] = 184331422;
        ft.gyuw[75] = -1793527114;
        ft.gyuw[76] = -1992516135;
        ft.gyuw[77] = -387407365;
        ft.gyuw[78] = 2027933030;
        ft.gyuw[79] = 1050372139;
        ft.gyuw[80] = 1896836491;
        ft.gyuw[81] = 1512747088;
        ft.gyuw[82] = -2139302130;
        ft.gyuw[83] = 789151716;
        ft.gyuw[84] = -2081792226;
        ft.gyuw[85] = -1509077712;
        ft.gyuw[86] = -1990305287;
        ft.gyuw[87] = -1209110811;
        ft.gyuw[88] = -1346511529;
        ft.gyuw[89] = 909657156;
        ft.gyuw[90] = -1423124426;
        ft.gyuw[91] = -2086513597;
        ft.gyuw[92] = -2023700759;
        ft.gyuw[93] = 1983589780;
        ft.gyuw[94] = -1144560495;
        ft.gyuw[95] = -1850734840;
        ft.gyuw[96] = -1811664216;
        ft.gyuw[97] = -1480437289;
        ft.gyuw[98] = 1688303872;
        ft.gyuw[99] = -1976088146;
    }

    private static /* synthetic */ void gzfl() {
        ft.gyvq[0] = 1863238996128588340L;
        ft.gyvq[1] = -3507217486333465653L;
        ft.gyvq[2] = -4344601706001494653L;
        ft.gyvq[3] = -2277321668754113688L;
        ft.gyvq[4] = 7647018397417104505L;
        ft.gyvq[5] = -7572150283392465592L;
        ft.gyvq[6] = 2996153352079887978L;
        ft.gyvq[7] = -430688179476937643L;
        ft.gyvq[8] = -2033815778192635697L;
        ft.gyvq[9] = 7238969399376629670L;
        ft.gyvq[10] = 6287420096959870532L;
        ft.gyvq[11] = 659294504391180877L;
        ft.gyvq[12] = 71666095142225260L;
        ft.gyvq[13] = 1294177546295339153L;
        ft.gyvq[14] = -940443162391030050L;
        ft.gyvq[15] = 1939011575409997166L;
        ft.gyvq[16] = -1768374505241439541L;
        ft.gyvq[17] = 4126781304703086992L;
        ft.gyvq[18] = -290980426615839632L;
        ft.gyvq[19] = 6651181718183356167L;
        ft.gyvq[20] = -8055601509572519416L;
        ft.gyvq[21] = 3526949516225377795L;
        ft.gyvq[22] = 1700905794991581013L;
        ft.gyvq[23] = 3932906602276503800L;
        ft.gyvq[24] = -6302937459936127017L;
        ft.gyvq[25] = -3503802681009718116L;
        ft.gyvq[26] = -3904275513821679082L;
        ft.gyvq[27] = -2345678036024929726L;
        ft.gyvq[28] = 8639633212543057209L;
        ft.gyvq[29] = -2937725245632542192L;
        ft.gyvq[30] = -7551412178559912411L;
        ft.gyvq[31] = 5756071732902620970L;
        ft.gyvq[32] = 3330507681146327511L;
        ft.gyvq[33] = 6007089296406712430L;
        ft.gyvq[34] = 6865485093905942973L;
        ft.gyvq[35] = -3556365066122016472L;
        ft.gyvq[36] = -6424030059476219648L;
        ft.gyvq[37] = 2015956219479322101L;
        ft.gyvq[38] = 4234558647026283173L;
        ft.gyvq[39] = 5627323474572052808L;
        ft.gyvq[40] = 3833250607717890541L;
        ft.gyvq[41] = -3819070048407349720L;
        ft.gyvq[42] = -5740921603246952548L;
        ft.gyvq[43] = -3498680167182613835L;
        ft.gyvq[44] = -1646232726082528555L;
        ft.gyvq[45] = 8887476184061293941L;
        ft.gyvq[46] = -1498985700366133685L;
        ft.gyvq[47] = 5003673263295006072L;
        ft.gyvq[48] = 8900413023923879027L;
        ft.gyvq[49] = 2206053713184116432L;
        ft.gyvq[50] = 2174501071953349388L;
        ft.gyvq[51] = 918964778415553945L;
        ft.gyvq[52] = 5082149490111313289L;
        ft.gyvq[53] = 1003124200830479659L;
        ft.gyvq[54] = 5417092744956868314L;
        ft.gyvq[55] = -3858253171158683325L;
        ft.gyvq[56] = -7773432550943167700L;
        ft.gyvq[57] = -3557805887403242592L;
        ft.gyvq[58] = -5961229275770339714L;
        ft.gyvq[59] = 9073431762473400276L;
        ft.gyvq[60] = 1425770669825726810L;
        ft.gyvq[61] = -7862422006611894506L;
        ft.gyvq[62] = -3660844545502402923L;
        ft.gyvq[63] = 2047604737886352804L;
        ft.gyvq[64] = -5707055338298602744L;
        ft.gyvq[65] = -888370475830895324L;
        ft.gyvq[66] = 9048710211713202399L;
        ft.gyvq[67] = 6315354677182987864L;
        ft.gyvq[68] = 4418104394482611164L;
        ft.gyvq[69] = 594176130457592295L;
        ft.gyvq[70] = -3127525382883046002L;
        ft.gyvq[71] = -7620978844220437338L;
        ft.gyvq[72] = 9068317416276346653L;
        ft.gyvq[73] = 8555034875765396786L;
        ft.gyvq[74] = 7017569606278453065L;
        ft.gyvq[75] = 5421051189906580117L;
        ft.gyvq[76] = -6600796432129925733L;
        ft.gyvq[77] = 2753809060705675032L;
        ft.gyvq[78] = -5606163310235595978L;
        ft.gyvq[79] = -727524313601816207L;
        ft.gyvq[80] = 689969917577519773L;
        ft.gyvq[81] = 3913175563974737136L;
        ft.gyvq[82] = -1430875182475910959L;
        ft.gyvq[83] = -2950029351277465599L;
        ft.gyvq[84] = -474113059763442151L;
        ft.gyvq[85] = -1290676412402487399L;
        ft.gyvq[86] = -8651699429357736737L;
        ft.gyvq[87] = -2339546974861281308L;
        ft.gyvq[88] = 5474234667561664127L;
        ft.gyvq[89] = 3104715310426578308L;
        ft.gyvq[90] = -7657486897697042328L;
        ft.gyvq[91] = -7023987270102316478L;
        ft.gyvq[92] = -5165673053399290371L;
        ft.gyvq[93] = -5366867296393009168L;
        ft.gyvq[94] = 3078019904035560104L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ft.nu - ft.gyuy("gyzi", gyvp(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ft.gyuy("gyzj", gyvd(int ), (int)87)) break;
            v0 /* !! */  = (long)ft.gyuy("gyzk", gyvd(int ), (int)88);
        }
        var3_1 = ft.c;
        v1 /* !! */  = ft.nu;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - ft.gyuy("gyzl", gyvp(int ), (int)23));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1795988598: {
                    v2 = ft.gyuy("gyzm", gyvp(int ), (int)24);
                    continue block20;
                }
                case -1418880518: {
                    v2 = ft.gyuy("gyzn", gyvp(int ), (int)25);
                    continue block20;
                }
                case -512510767: {
                    break block20;
                }
                case 499871572: {
                    v2 = ft.gyuy("gyzo", gyvp(int ), (int)26);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = ft.b;
        v3 /* !! */  = ft.nu;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - ft.gyuy("gyzp", gyvp(int ), (int)27));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -512510767: {
                    break block21;
                }
                case 1545737896: {
                    v4 = ft.gyuy("gyzq", gyvp(int ), (int)28);
                    continue block21;
                }
                case 1593878406: {
                    v4 = ft.gyuy("gyzr", gyvp(int ), (int)29);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = ft.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl43:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ft.nu - ft.gyuy("gyzs", gyvp(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ft.gyuy("gyzt", gyvd(int ), (int)89)) break;
                    v5 /* !! */  = (long)ft.gyuy("gyzu", gyvd(int ), (int)90);
                }
                this.releaseMovement();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ft.gyuy("gyzv", gyvd(int ), (int)91);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ft.gyuy("gyzw", gyvd(int ), (int)92);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ft.gyuy("gyzx", gyvd(int ), (int)93);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ft.gyuy("gyzy", gyvd(int ), (int)94);
                if (!var3_1) break;
                throw null;
            }
lbl72:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ft.gyuy("gyzz", gyvd(int ), (int)95);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ft.gyuy("gzaa", gyvd(int ), (int)96);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }
}

