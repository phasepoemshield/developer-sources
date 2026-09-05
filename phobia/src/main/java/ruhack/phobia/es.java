/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2350
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hy;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.pp;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class es
extends ds {
    public static final boolean c;
    public static final boolean a;
    public static final int b;
    private final os rotation;
    private static int[] l;
    private int previousSlot;
    private static int[] m;
    private static long[] z;
    private static long[] y;
    private static final long a = -6672325610815883681L;

    private static /* synthetic */ void ff() {
        es.m[100] = -372643755;
        es.m[101] = 229009858;
        es.m[102] = -369351137;
        es.m[103] = -410224628;
        es.m[104] = 1556458510;
        es.m[105] = 268461895;
        es.m[106] = 1395387122;
        es.m[107] = -1762454412;
        es.m[108] = -1894451376;
        es.m[109] = 89534634;
        es.m[110] = 1525063098;
        es.m[111] = -451111086;
        es.m[112] = -937612235;
        es.m[113] = -614962946;
        es.m[114] = -546439181;
    }

    private static /* synthetic */ void fd() {
        es.l[100] = -372643736;
        es.l[101] = 229009869;
        es.l[102] = -369351133;
        es.l[103] = -410224622;
        es.l[104] = 1556458539;
        es.l[105] = 268461921;
        es.l[106] = 1395387122;
        es.l[107] = -1762454432;
        es.l[108] = -1894451336;
        es.l[109] = 89534611;
        es.l[110] = 1525063059;
        es.l[111] = -451111053;
        es.l[112] = -937612241;
        es.l[113] = -614962976;
        es.l[114] = -546439246;
    }

    private static /* synthetic */ void fe() {
        es.m[0] = -1664522989;
        es.m[1] = 1434575231;
        es.m[2] = 635891688;
        es.m[3] = 1314878876;
        es.m[4] = 2024473311;
        es.m[5] = 1513405462;
        es.m[6] = 1404210911;
        es.m[7] = 597883731;
        es.m[8] = -594470698;
        es.m[9] = 2059275872;
        es.m[10] = -783158315;
        es.m[11] = -1468942376;
        es.m[12] = 1232169144;
        es.m[13] = -159233185;
        es.m[14] = 881576436;
        es.m[15] = -713543299;
        es.m[16] = 208740682;
        es.m[17] = -1502048016;
        es.m[18] = 1703393389;
        es.m[19] = 510833254;
        es.m[20] = -54997148;
        es.m[21] = 947296465;
        es.m[22] = -253799046;
        es.m[23] = -1464361673;
        es.m[24] = -1729807624;
        es.m[25] = 957676774;
        es.m[26] = 1440752241;
        es.m[27] = -125269289;
        es.m[28] = -1809458999;
        es.m[29] = -1710210931;
        es.m[30] = -739313609;
        es.m[31] = -1550877105;
        es.m[32] = 924261174;
        es.m[33] = 1199962151;
        es.m[34] = 393945667;
        es.m[35] = 167039525;
        es.m[36] = -2083966544;
        es.m[37] = -1737622626;
        es.m[38] = 2114322958;
        es.m[39] = 1397540148;
        es.m[40] = 562771208;
        es.m[41] = 390857644;
        es.m[42] = 747836961;
        es.m[43] = 1261327806;
        es.m[44] = -1811772576;
        es.m[45] = -112378788;
        es.m[46] = 78201830;
        es.m[47] = -761527724;
        es.m[48] = 1244042043;
        es.m[49] = -767277517;
        es.m[50] = -1424737154;
        es.m[51] = -1451814230;
        es.m[52] = 836451553;
        es.m[53] = -2088789501;
        es.m[54] = -1961919042;
        es.m[55] = 1249956060;
        es.m[56] = 1594686311;
        es.m[57] = -882826104;
        es.m[58] = 752650463;
        es.m[59] = 1679041478;
        es.m[60] = 393840151;
        es.m[61] = -263998295;
        es.m[62] = -1187779216;
        es.m[63] = 269381866;
        es.m[64] = -772088187;
        es.m[65] = -850228739;
        es.m[66] = -188248179;
        es.m[67] = -984991594;
        es.m[68] = 1496589279;
        es.m[69] = -2056468592;
        es.m[70] = -1998152367;
        es.m[71] = 1927598150;
        es.m[72] = -1712863351;
        es.m[73] = -1585000730;
        es.m[74] = -899225720;
        es.m[75] = -1254432954;
        es.m[76] = 698611433;
        es.m[77] = -1231567041;
        es.m[78] = 1912508841;
        es.m[79] = -1256357477;
        es.m[80] = -269791618;
        es.m[81] = 1799476508;
        es.m[82] = -864793342;
        es.m[83] = -1384368861;
        es.m[84] = -1882379721;
        es.m[85] = 726124033;
        es.m[86] = 750490421;
        es.m[87] = 1490941179;
        es.m[88] = -884857086;
        es.m[89] = 1590375549;
        es.m[90] = -243952670;
        es.m[91] = 1489381152;
        es.m[92] = -2116638302;
        es.m[93] = 830105703;
        es.m[94] = 1101449637;
        es.m[95] = -1681375144;
        es.m[96] = -1703510331;
        es.m[97] = -91916439;
        es.m[98] = -50566589;
        es.m[99] = -1781054894;
    }

    private static /* synthetic */ void fh() {
        es.z[0] = 4281255410597667015L;
        es.z[1] = -1878686419432324590L;
        es.z[2] = -3303499730415078881L;
        es.z[3] = 6121966490640748509L;
        es.z[4] = -351664645180080284L;
        es.z[5] = 1169006866130843831L;
        es.z[6] = 6674969128431790253L;
        es.z[7] = -5215234150564544999L;
        es.z[8] = -2307351617049265763L;
        es.z[9] = 3367638456172054075L;
        es.z[10] = -4258631116769402055L;
        es.z[11] = -6293713815178929031L;
        es.z[12] = 1169846757683273881L;
        es.z[13] = 788611592575197518L;
        es.z[14] = 4774872812857678874L;
        es.z[15] = 3977685737566088322L;
        es.z[16] = 1488358730495794809L;
        es.z[17] = -4681722042633673352L;
        es.z[18] = 3819463233717144019L;
        es.z[19] = 4421878759255711417L;
        es.z[20] = -4109032414567804174L;
        es.z[21] = -977911681527021957L;
        es.z[22] = -1423471465500340751L;
        es.z[23] = -4430394228594153058L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block138: {
            block137: {
                block136: {
                    block135: {
                        block134: {
                            var11_2 = es.c;
                            var10_3 /* !! */  = es.b;
                            var9_4 = es.a;
                            if (var11_2) {
                                throw null;
lbl6:
                                // 37 sources

                                return;
                            }
                            if (var9_4 || var9_4) ** GOTO lbl6
                            if (es.mc.field_1724 == null) break block134;
                            if (var9_4) ** GOTO lbl6
                            if (es.mc.field_1687 == null) break block134;
                            if (var9_4) ** GOTO lbl6
                            if (es.mc.field_1761 != null) break block135;
                            if (var9_4) ** GOTO lbl6
                        }
                        if (var9_4 || var9_4) ** GOTO lbl6
                        return;
                    }
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var2_5 = nv.findHotbarItem(class_1802.field_8725);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var3_6 = nv.findHotbarItem(class_1802.field_8810);
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var2_5 < 0) break block136;
                    if (var9_4) ** GOTO lbl6
                    v0 = var2_5;
                    if (var11_2) {
                        throw null;
                    }
                    break block137;
                }
                if (var9_4 || var9_4) ** GOTO lbl6
                v0 = var4_7 = var3_6;
            }
            if (var9_4 || var9_4) ** GOTO lbl6
            if (var4_7 >= 0) break block138;
            if (var9_4 || var9_4) ** GOTO lbl6
            pp.brandmessage("\u0412\u0430\u043c \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0438\u043c\u0435\u0442\u044c \u0444\u0430\u043a\u0435\u043b \u0438\u043b\u0438 \u0440\u0435\u0434\u0441\u0442\u043e\u0443\u043d \u0432 \u0445\u043e\u0442\u0431\u0430\u0440\u0435");
            if (var9_4 || var9_4) ** GOTO lbl6
            this.setState((boolean)es.n("cc", k(int ), (int)40));
            if (var9_4 || var9_4) ** GOTO lbl6
            return;
        }
        if (var9_4 || var9_4) ** GOTO lbl6
        var5_8 = (float)Math.sin((double)System.currentTimeMillis() / es.n("ce", cd(int ), (int)23)) * (Math.abs((float)(es.n("cg", cf(int ), (int)41) - es.mc.field_1724.method_36455())) / es.n("ch", cf(int ), (int)42));
        if (var9_4 || var9_4) ** GOTO lbl6
        var6_9 = new ov(es.mc.field_1724.method_36454(), Math.max((float)es.n("ci", cf(int ), (int)43), Math.min((float)es.n("cj", cf(int ), (int)44), (float)(es.n("ck", cf(int ), (int)45) + var5_8))));
        if (var9_4 || var9_4) ** GOTO lbl6
        ot.INSTANCE.rotateTo(var6_9, (int)es.n("cl", k(int ), (int)46), this.rotation, nn.HIGH_IMPORTANCE_2, this);
        if (var9_4 || var9_4) ** GOTO lbl6
        if (this.previousSlot >= 0) ** GOTO lbl57
        if (var9_4) ** GOTO lbl6
        this.previousSlot = es.mc.field_1724.method_31548().method_67532();
        if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_4) ** GOTO lbl6
lbl57:
                // 2 sources

                if (var9_4 || var9_4) ** GOTO lbl6
                if (es.mc.field_1724.method_31548().method_67532() == var4_7) ** GOTO lbl64
                if (var9_4 || var9_4) ** GOTO lbl6
                nv.selectSlot(var4_7);
                if (var9_4 || var9_4) ** GOTO lbl6
                nv.updateSlots();
                if (var9_4) ** GOTO lbl6
lbl64:
                // 2 sources

                if (var9_4 || var9_4) ** GOTO lbl6
                if (!(ot.computeRotationDifference(ot.INSTANCE.getServerAngle(), var6_9) > 1.0)) ** GOTO lbl68
                if (var9_4 || var9_4) ** GOTO lbl6
                return;
lbl68:
                // 1 sources

                if (var9_4 || var9_4) ** GOTO lbl6
                var7_10 = es.mc.field_1724.method_24515();
                if (var9_4 || var9_4) ** GOTO lbl6
                var8_11 = es.mc.field_1687.method_8320(var7_10);
                if (var9_4 || var9_4) ** GOTO lbl6
                if (var8_11.method_27852(class_2246.field_10091)) ** GOTO lbl77
                if (var9_4) ** GOTO lbl6
                if (!var8_11.method_27852(class_2246.field_10336)) ** GOTO lbl86
                if (var9_4) ** GOTO lbl6
lbl77:
                // 2 sources

                if (var9_4 || var9_4) ** GOTO lbl6
                es.mc.field_1761.method_2910(var7_10, class_2350.field_11036);
                if (var9_4 || var9_4) ** GOTO lbl6
                es.mc.field_1724.method_6104(class_1268.field_5808);
                if (var9_4) ** GOTO lbl6
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl89
lbl86:
                // 1 sources

                if (var9_4 || var9_4) ** GOTO lbl6
                es.mc.method_1583();
                if (var9_4) ** GOTO lbl6
lbl89:
                // 2 sources

                if (!var9_4 && !var9_4) ** break;
                ** continue;
                return;
            }
lbl92:
            // 2 sources

            case 0: {
                var10_3 /* !! */  = (int)es.n("cm", k(int ), (int)47);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl97:
            // 3 sources

            case 1: {
                var10_3 /* !! */  = (int)es.n("cn", k(int ), (int)48);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 2: {
                var10_3 /* !! */  = (int)es.n("co", k(int ), (int)49);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl107:
            // 3 sources

            case 3: {
                var10_3 /* !! */  = (int)es.n("cp", k(int ), (int)50);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 4: {
                var10_3 /* !! */  = (int)es.n("cq", k(int ), (int)51);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 5: {
                var10_3 /* !! */  = (int)es.n("cr", k(int ), (int)52);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl122:
            // 3 sources

            case 6: {
                var10_3 /* !! */  = (int)es.n("cs", k(int ), (int)53);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl127:
            // 2 sources

            case 7: {
                var10_3 /* !! */  = (int)es.n("ct", k(int ), (int)54);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl132:
            // 2 sources

            case 8: {
                var10_3 /* !! */  = (int)es.n("cu", k(int ), (int)55);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 9: {
                var10_3 /* !! */  = (int)es.n("cv", k(int ), (int)56);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl142:
            // 2 sources

            case 10: {
                var10_3 /* !! */  = (int)es.n("cw", k(int ), (int)57);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 11: {
                var10_3 /* !! */  = (int)es.n("cx", k(int ), (int)58);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl152:
            // 4 sources

            case 12: {
                var10_3 /* !! */  = (int)es.n("cy", k(int ), (int)59);
                if (!var11_2) ** GOTO lbl107
                throw null;
            }
lbl156:
            // 4 sources

            case 13: {
                var10_3 /* !! */  = (int)es.n("cz", k(int ), (int)60);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 14: {
                var10_3 /* !! */  = (int)es.n("da", k(int ), (int)61);
                if (!var11_2) ** GOTO lbl122
                throw null;
            }
lbl165:
            // 3 sources

            case 15: {
                var10_3 /* !! */  = (int)es.n("db", k(int ), (int)62);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl170:
            // 3 sources

            case 16: {
                var10_3 /* !! */  = (int)es.n("dc", k(int ), (int)63);
                if (!var11_2) ** GOTO lbl107
                throw null;
            }
lbl174:
            // 2 sources

            case 17: {
                var10_3 /* !! */  = (int)es.n("dd", k(int ), (int)64);
                if (!var11_2) ** GOTO lbl165
                throw null;
            }
lbl178:
            // 2 sources

            case 18: {
                var10_3 /* !! */  = (int)es.n("de", k(int ), (int)65);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 19: {
                var10_3 /* !! */  = (int)es.n("df", k(int ), (int)66);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl188:
            // 3 sources

            case 20: {
                var10_3 /* !! */  = (int)es.n("dg", k(int ), (int)67);
                if (!var11_2) ** GOTO lbl178
                throw null;
            }
            case 21: {
                var10_3 /* !! */  = (int)es.n("dh", k(int ), (int)68);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 22: {
                var10_3 /* !! */  = (int)es.n("di", k(int ), (int)69);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 23: {
                var10_3 /* !! */  = (int)es.n("dj", k(int ), (int)70);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 24: {
                var10_3 /* !! */  = (int)es.n("dk", k(int ), (int)71);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 25: {
                var10_3 /* !! */  = (int)es.n("dl", k(int ), (int)72);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl217:
            // 3 sources

            case 26: {
                var10_3 /* !! */  = (int)es.n("dm", k(int ), (int)73);
                if (!var11_2) ** GOTO lbl142
                throw null;
            }
            case 27: {
                var10_3 /* !! */  = (int)es.n("dn", k(int ), (int)74);
                if (var11_2) {
                    throw null;
                }
            }
lbl225:
            // 5 sources

            case 28: {
                var10_3 /* !! */  = (int)es.n("do", k(int ), (int)75);
                if (!var11_2) ** GOTO lbl97
                throw null;
            }
            case 29: {
                var10_3 /* !! */  = (int)es.n("dp", k(int ), (int)76);
                if (!var11_2) ** GOTO lbl156
                throw null;
            }
lbl233:
            // 3 sources

            case 30: {
                var10_3 /* !! */  = (int)es.n("dq", k(int ), (int)77);
                if (!var11_2) ** GOTO lbl170
                throw null;
            }
lbl237:
            // 2 sources

            case 31: {
                var10_3 /* !! */  = (int)es.n("dr", k(int ), (int)78);
                if (!var11_2) ** GOTO lbl127
                throw null;
            }
lbl241:
            // 3 sources

            case 32: {
                var10_3 /* !! */  = (int)es.n("ds", k(int ), (int)79);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 33: {
                var10_3 /* !! */  = (int)es.n("dt", k(int ), (int)80);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 34: {
                var10_3 /* !! */  = (int)es.n("du", k(int ), (int)81);
                if (!var11_2) ** GOTO lbl156
                throw null;
            }
lbl255:
            // 2 sources

            case 35: {
                var10_3 /* !! */  = (int)es.n("dv", k(int ), (int)82);
                if (!var11_2) ** GOTO lbl156
                throw null;
            }
lbl259:
            // 5 sources

            case 36: {
                var10_3 /* !! */  = (int)es.n("dw", k(int ), (int)83);
                if (!var11_2) ** GOTO lbl225
                throw null;
            }
lbl263:
            // 2 sources

            case 37: {
                var10_3 /* !! */  = (int)es.n("dx", k(int ), (int)84);
                if (!var11_2) ** GOTO lbl152
                throw null;
            }
            case 38: {
                var10_3 /* !! */  = (int)es.n("dy", k(int ), (int)85);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 39: {
                var10_3 /* !! */  = (int)es.n("dz", k(int ), (int)86);
                if (!var11_2) ** GOTO lbl233
                throw null;
            }
lbl276:
            // 2 sources

            case 40: {
                var10_3 /* !! */  = (int)es.n("ea", k(int ), (int)87);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl281:
            // 2 sources

            case 41: {
                var10_3 /* !! */  = (int)es.n("eb", k(int ), (int)88);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl286:
            // 2 sources

            case 42: {
                var10_3 /* !! */  = (int)es.n("ec", k(int ), (int)89);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 43: {
                var10_3 /* !! */  = (int)es.n("ed", k(int ), (int)90);
                if (!var11_2) ** GOTO lbl188
                throw null;
            }
            case 44: {
                var10_3 /* !! */  = (int)es.n("ee", k(int ), (int)91);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl300:
            // 2 sources

            case 45: {
                var10_3 /* !! */  = (int)es.n("ef", k(int ), (int)92);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 46: {
                var10_3 /* !! */  = (int)es.n("eg", k(int ), (int)93);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl310:
            // 3 sources

            case 47: {
                var10_3 /* !! */  = (int)es.n("eh", k(int ), (int)94);
                if (!var11_2) ** GOTO lbl152
                throw null;
            }
lbl314:
            // 2 sources

            case 48: {
                var10_3 /* !! */  = (int)es.n("ei", k(int ), (int)95);
                if (!var11_2) ** GOTO lbl165
                throw null;
            }
lbl318:
            // 3 sources

            case 49: {
                var10_3 /* !! */  = (int)es.n("ej", k(int ), (int)96);
                if (!var11_2) ** GOTO lbl300
                throw null;
            }
lbl322:
            // 3 sources

            case 50: {
                var10_3 /* !! */  = (int)es.n("ek", k(int ), (int)97);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl327:
            // 2 sources

            case 51: {
                var10_3 /* !! */  = (int)es.n("el", k(int ), (int)98);
                if (!var11_2) ** GOTO lbl310
                throw null;
            }
lbl331:
            // 2 sources

            case 52: {
                var10_3 /* !! */  = (int)es.n("em", k(int ), (int)99);
                if (!var11_2) ** GOTO lbl259
                throw null;
            }
            case 53: {
                var10_3 /* !! */  = (int)es.n("en", k(int ), (int)100);
                if (!var11_2) ** GOTO lbl318
                throw null;
            }
            case 54: {
                var10_3 /* !! */  = (int)es.n("eo", k(int ), (int)101);
                if (!var11_2) ** GOTO lbl286
                throw null;
            }
lbl343:
            // 4 sources

            case 55: {
                var10_3 /* !! */  = (int)es.n("ep", k(int ), (int)102);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 56: {
                var10_3 /* !! */  = (int)es.n("eq", k(int ), (int)103);
                if (!var11_2) ** GOTO lbl152
                throw null;
            }
            case 57: {
                var10_3 /* !! */  = (int)es.n("er", k(int ), (int)104);
                if (!var11_2) ** GOTO lbl322
                throw null;
            }
lbl356:
            // 2 sources

            case 58: {
                var10_3 /* !! */  = (int)es.n("es", k(int ), (int)105);
                if (!var11_2) ** GOTO lbl217
                throw null;
            }
lbl360:
            // 4 sources

            case 59: {
                var10_3 /* !! */  = (int)es.n("et", k(int ), (int)106);
                if (!var11_2) ** GOTO lbl241
                throw null;
            }
lbl364:
            // 3 sources

            case 60: {
                var10_3 /* !! */  = (int)es.n("eu", k(int ), (int)107);
                if (!var11_2) ** GOTO lbl92
                throw null;
            }
lbl368:
            // 3 sources

            case 61: {
                var10_3 /* !! */  = (int)es.n("ev", k(int ), (int)108);
                if (!var11_2) ** GOTO lbl343
                throw null;
            }
lbl372:
            // 2 sources

            case 62: {
                var10_3 /* !! */  = (int)es.n("ew", k(int ), (int)109);
                if (!var11_2) ** GOTO lbl322
                throw null;
            }
            case 63: {
                var10_3 /* !! */  = (int)es.n("ex", k(int ), (int)110);
                if (!var11_2) ** GOTO lbl97
                throw null;
            }
lbl380:
            // 2 sources

            case 64: {
                var10_3 /* !! */  = (int)es.n("ey", k(int ), (int)111);
                if (!var11_2) ** GOTO lbl281
                throw null;
            }
lbl384:
            // 2 sources

            case 65: {
                var10_3 /* !! */  = (int)es.n("ez", k(int ), (int)112);
                if (!var11_2) ** GOTO lbl174
                throw null;
            }
            case 66: {
                var10_3 /* !! */  = (int)es.n("fa", k(int ), (int)113);
                if (!var11_2) ** GOTO lbl237
                throw null;
            }
            case 67: 
        }
        do {
            var10_3 /* !! */  = (int)es.n("fb", k(int ), (int)114);
        } while (!var11_2);
        throw null;
    }

    private static /* synthetic */ double cd(int n2) {
        return Double.longBitsToDouble(y[n2] ^ z[n2]);
    }

    private static /* synthetic */ void fg() {
        es.y[0] = -6788630798305470246L;
        es.y[1] = -4970370242196637240L;
        es.y[2] = -6126136963300522275L;
        es.y[3] = -130303393994974371L;
        es.y[4] = -4793593247984485123L;
        es.y[5] = -5659276437111451740L;
        es.y[6] = -7027817551485941021L;
        es.y[7] = -8564982899758618637L;
        es.y[8] = -829418266426009921L;
        es.y[9] = 1975666635500856896L;
        es.y[10] = 5744287073199782049L;
        es.y[11] = -4885938287151707714L;
        es.y[12] = 653668867283873126L;
        es.y[13] = -7849533112211738863L;
        es.y[14] = -2812146497225932548L;
        es.y[15] = -4342879750510440254L;
        es.y[16] = -9140132145555781661L;
        es.y[17] = 3298714043968810248L;
        es.y[18] = 3501315297352872504L;
        es.y[19] = 1707359862168828867L;
        es.y[20] = -5988264070921150999L;
        es.y[21] = 935849460081708983L;
        es.y[22] = -8696879469565455536L;
        es.y[23] = -9072778611669046882L;
    }

    private static /* synthetic */ long x(int n2) {
        return y[n2] ^ z[n2];
    }

    private static /* synthetic */ float cf(int n2) {
        return Float.intBitsToFloat(l[n2] ^ m[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public es() {
        var2_1 /* !! */  = es.b;
        super("ClanUpgrader", "\u0411\u044b\u0441\u0442\u0440\u043e \u043f\u0440\u043e\u043a\u0430\u0447\u0438\u0432\u0430\u0435\u0442 \u043a\u043b\u0430\u043d \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u0440\u0435\u0434\u0441\u0442\u043e\u0443\u043d\u0430 \u0438 \u0444\u0430\u043a\u0435\u043b\u0430", du.MISC);
        this.rotation = new os(new hy(), (boolean)es.n("o", k(int ), (int)0), (boolean)es.n("p", k(int ), (int)1), (boolean)es.n("q", k(int ), (int)2));
        this.previousSlot = (int)es.n("r", k(int ), (int)3);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)es.n("s", k(int ), (int)4);
                    break block0;
                    break;
                }
            }
lbl13:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)es.n("t", k(int ), (int)5);
                ** GOTO lbl20
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)es.n("u", k(int ), (int)6);
                }
            }
lbl20:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)es.n("v", k(int ), (int)7);
                ** GOTO lbl13
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)es.n("w", k(int ), (int)8);
        ** while (true)
    }

    private static /* synthetic */ void fc() {
        es.l[0] = -1664522990;
        es.l[1] = 1434575230;
        es.l[2] = 635891688;
        es.l[3] = -1314878877;
        es.l[4] = 2024473311;
        es.l[5] = 1513405463;
        es.l[6] = 1404210910;
        es.l[7] = 597883729;
        es.l[8] = -594470699;
        es.l[9] = 2059275873;
        es.l[10] = 757124132;
        es.l[11] = 1468942375;
        es.l[12] = -778758871;
        es.l[13] = 159233184;
        es.l[14] = 1114992661;
        es.l[15] = -713543300;
        es.l[16] = -509550009;
        es.l[17] = 1502048015;
        es.l[18] = -695287292;
        es.l[19] = -510833255;
        es.l[20] = -54997147;
        es.l[21] = -1260864608;
        es.l[22] = 253799045;
        es.l[23] = 642879848;
        es.l[24] = -1729807618;
        es.l[25] = 957676775;
        es.l[26] = 1440752249;
        es.l[27] = -125269286;
        es.l[28] = -1809459002;
        es.l[29] = -1710210940;
        es.l[30] = -739313609;
        es.l[31] = -1550877105;
        es.l[32] = 924261173;
        es.l[33] = 1199962159;
        es.l[34] = 393945666;
        es.l[35] = 167039520;
        es.l[36] = -2083966544;
        es.l[37] = -1737622631;
        es.l[38] = 2114322946;
        es.l[39] = 1397540150;
        es.l[40] = 562771208;
        es.l[41] = 1442317228;
        es.l[42] = 1838356001;
        es.l[43] = -1986374210;
        es.l[44] = -692679840;
        es.l[45] = -1141031844;
        es.l[46] = 78201831;
        es.l[47] = -761527696;
        es.l[48] = 1244042011;
        es.l[49] = -767277529;
        es.l[50] = -1424737212;
        es.l[51] = -1451814221;
        es.l[52] = 836451561;
        es.l[53] = -2088789443;
        es.l[54] = -1961918978;
        es.l[55] = 1249956043;
        es.l[56] = 1594686324;
        es.l[57] = -882826065;
        es.l[58] = 752650399;
        es.l[59] = 1679041479;
        es.l[60] = 393840165;
        es.l[61] = -263998294;
        es.l[62] = -1187779216;
        es.l[63] = 269381846;
        es.l[64] = -772088152;
        es.l[65] = -850228773;
        es.l[66] = -188248185;
        es.l[67] = -984991553;
        es.l[68] = 1496589274;
        es.l[69] = -2056468591;
        es.l[70] = -1998152322;
        es.l[71] = 1927598194;
        es.l[72] = -1712863341;
        es.l[73] = -1585000741;
        es.l[74] = -899225709;
        es.l[75] = -1254432928;
        es.l[76] = 698611445;
        es.l[77] = -1231567070;
        es.l[78] = 1912508827;
        es.l[79] = -1256357491;
        es.l[80] = -269791663;
        es.l[81] = 1799476501;
        es.l[82] = -864793280;
        es.l[83] = -1384368839;
        es.l[84] = -1882379761;
        es.l[85] = 726124034;
        es.l[86] = 750490385;
        es.l[87] = 1490941158;
        es.l[88] = -884857085;
        es.l[89] = 1590375493;
        es.l[90] = -243952657;
        es.l[91] = 1489381160;
        es.l[92] = -2116638312;
        es.l[93] = 830105699;
        es.l[94] = 1101449633;
        es.l[95] = -1681375154;
        es.l[96] = -1703510313;
        es.l[97] = -91916480;
        es.l[98] = -50566550;
        es.l[99] = -1781054894;
    }

    private static /* synthetic */ int k(int n2) {
        return l[n2] ^ m[n2];
    }

    public static /* synthetic */ CallSite n(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = es.a - es.n("aa", x(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == es.n("ab", k(int ), (int)9)) break;
            v0 /* !! */  = (long)es.n("ac", k(int ), (int)10);
        }
        var3_1 = es.c;
        v1 /* !! */  = es.a;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(es.n("ae", x(int ), (int)2) - es.n("ad", x(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -477669994: {
                    continue block45;
                }
                case 1569977951: {
                    break block45;
                }
            }
            break;
        }
        var2_2 /* !! */  = es.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = es.a - es.n("af", x(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == es.n("ag", k(int ), (int)11)) break;
                    v2 /* !! */  = (long)es.n("ah", k(int ), (int)12);
                }
                var1_3 = es.a;
                if (var3_1) {
                    throw null;
lbl28:
                    // 8 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = es.a - es.n("ai", x(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == es.n("aj", k(int ), (int)13)) break;
                    v3 /* !! */  = (long)es.n("ak", k(int ), (int)14);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = es.a - es.n("al", x(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == es.n("am", k(int ), (int)15)) break;
                    v4 /* !! */  = (long)es.n("an", k(int ), (int)16);
                }
                if (es.mc.field_1724 == null) ** GOTO lbl96
                if (var1_3) ** GOTO lbl28
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = es.a - es.n("ao", x(int ), (int)6)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == es.n("ap", k(int ), (int)17)) break;
                    v5 /* !! */  = (long)es.n("aq", k(int ), (int)18);
                }
                if (this.previousSlot < 0) ** GOTO lbl96
                if (var1_3 || var1_3) ** GOTO lbl28
                v6 /* !! */  = es.a;
                if (true) ** GOTO lbl54
                block51: while (true) {
                    v6 /* !! */  = (long)(v7 - es.n("ar", x(int ), (int)7));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1692301487: {
                            v7 = es.n("as", x(int ), (int)8);
                            continue block51;
                        }
                        case -1322457810: {
                            v7 = es.n("at", x(int ), (int)9);
                            continue block51;
                        }
                        case 1569977951: {
                            break block51;
                        }
                        case 1960573947: {
                            v7 = es.n("au", x(int ), (int)10);
                            continue block51;
                        }
                    }
                    break;
                }
                v8 /* !! */  = es.a;
                if (true) ** GOTO lbl70
                block52: while (true) {
                    v8 /* !! */  = (long)(v9 - es.n("av", x(int ), (int)11));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1150432991: {
                            v9 = es.n("aw", x(int ), (int)12);
                            continue block52;
                        }
                        case 224267813: {
                            v9 = es.n("ax", x(int ), (int)13);
                            continue block52;
                        }
                        case 1569977951: {
                            break block52;
                        }
                    }
                    break;
                }
                nv.selectSlot(this.previousSlot);
                if (var1_3 || var1_3) ** GOTO lbl28
                v10 /* !! */  = es.a;
                if (true) ** GOTO lbl85
                block53: while (true) {
                    v10 /* !! */  = (long)(v11 - es.n("ay", x(int ), (int)14));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1484269966: {
                            v11 = es.n("az", x(int ), (int)15);
                            continue block53;
                        }
                        case 1242837417: {
                            v11 = es.n("ba", x(int ), (int)16);
                            continue block53;
                        }
                        case 1569977951: {
                            break block53;
                        }
                    }
                    break;
                }
                nv.updateSlots();
                if (var1_3) ** GOTO lbl28
lbl96:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl28
                v12 = es.n("bb", k(int ), (int)19);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = es.a - es.n("bc", x(int ), (int)17)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == es.n("bd", k(int ), (int)20)) break;
                    v13 /* !! */  = (long)es.n("be", k(int ), (int)21);
                }
                this.previousSlot = (int)v12;
                if (var1_3 || var1_3) ** GOTO lbl28
                v14 /* !! */  = es.a;
                if (true) ** GOTO lbl109
                block55: while (true) {
                    v14 /* !! */  = (long)(v15 - es.n("bf", x(int ), (int)18));
lbl109:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -776940042: {
                            v15 = es.n("bg", x(int ), (int)19);
                            continue block55;
                        }
                        case 1045283922: {
                            v15 = es.n("bh", x(int ), (int)20);
                            continue block55;
                        }
                        case 1333993796: {
                            v15 = es.n("bi", x(int ), (int)21);
                            continue block55;
                        }
                        case 1569977951: {
                            break block55;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = es.a - es.n("bj", x(int ), (int)22)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == es.n("bk", k(int ), (int)22)) break;
                    v16 /* !! */  = (long)es.n("bl", k(int ), (int)23);
                }
                ot.INSTANCE.releaseProvider(this);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl130:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)es.n("bm", k(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 1: {
                var2_2 /* !! */  = (int)es.n("bn", k(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl140:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)es.n("bo", k(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)es.n("bp", k(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl149:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)es.n("bq", k(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl154:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)es.n("br", k(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl159:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)es.n("bs", k(int ), (int)30);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
lbl163:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)es.n("bt", k(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)es.n("bu", k(int ), (int)32);
                    if (!var3_1) ** GOTO lbl149
                    throw null;
                }
            }
lbl173:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)es.n("bv", k(int ), (int)33);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl177:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)es.n("bw", k(int ), (int)34);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
lbl181:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)es.n("bx", k(int ), (int)35);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
lbl185:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)es.n("by", k(int ), (int)36);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl189:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)es.n("bz", k(int ), (int)37);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)es.n("ca", k(int ), (int)38);
                if (!var3_1) ** GOTO lbl185
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)es.n("cb", k(int ), (int)39);
        ** while (!var3_1)
lbl200:
        // 1 sources

        throw null;
    }

    static {
        l = new int[115];
        m = new int[115];
        es.fc();
        es.fd();
        es.fe();
        es.ff();
        y = new long[24];
        z = new long[24];
        es.fg();
        es.fh();
    }
}

