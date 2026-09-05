/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2767
 *  net.minecraft.class_5321
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2767;
import net.minecraft.class_5321;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ex;
import ruhack.phobia.ey$ActionPhase;
import ruhack.phobia.ey$StunArea;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.ls;
import ruhack.phobia.lv;
import ruhack.phobia.nd;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.pp;

public class ey
extends ds {
    private int previousSlot;
    private boolean fromHotbar;
    private static int[] bhcb;
    private static final int MAX_STUN_AREAS = 8;
    private final kb displayStun;
    private final ka backpack;
    public static final boolean a;
    private final ka snowball;
    private static long[] bhbq;
    private final nx movement;
    public static final int b;
    private long restoreAt;
    private static final long STUN_LIFETIME_MS = 15000L;
    private int temporaryHotbarSlot;
    private final List<ex> itemBinds;
    private final ka explosiveTrap;
    private final ka chorusTrap;
    private static int[] bhca;
    private static long[] bhbr;
    private final ka stun;
    private final kf mode;
    private final List<ey$StunArea> stunAreas;
    private int stopTicks;
    public static final boolean c;
    private long actionAt;
    private final kb fullStop;
    private int targetSlot;
    private static final long dh = -2042171307298681842L;
    private ey$ActionPhase phase;
    private static final float STUN_RADIUS = 15.01f;
    private final ka thing;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<ex> getItemBinds() {
        v0 /* !! */  = ey.dh;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ey.bhbs("bhbu", bhbp(int ), (int)1) - ey.bhbs("bhbt", bhbp(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 301435918: {
                    break block21;
                }
                case 1199690521: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ey.c;
        v1 /* !! */  = ey.dh;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ey.bhbs("bhbv", bhbp(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -304675869: {
                    v2 = ey.bhbs("bhbw", bhbp(int ), (int)3);
                    continue block22;
                }
                case 301435918: {
                    break block22;
                }
                case 1857577702: {
                    v2 = ey.bhbs("bhbx", bhbp(int ), (int)4);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ey.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bhby", bhbp(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ey.bhbs("bhcc", bhbz(int ), (int)0)) break;
                    v3 /* !! */  = (long)ey.bhbs("bhcd", bhbz(int ), (int)1);
                }
                var1_3 = ey.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ey.dh;
                if (true) ** GOTO lbl44
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ey.bhbs("bhce", bhbp(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -236451928: {
                            v5 = ey.bhbs("bhcf", bhbp(int ), (int)7);
                            continue block25;
                        }
                        case -160211965: {
                            v5 = ey.bhbs("bhcg", bhbp(int ), (int)8);
                            continue block25;
                        }
                        case -9226224: {
                            v5 = ey.bhbs("bhch", bhbp(int ), (int)9);
                            continue block25;
                        }
                        case 301435918: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.itemBinds;
            }
            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("bhci", bhbz(int ), (int)2);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("bhcj", bhbz(int ), (int)3);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey.bhbs("bhck", bhbz(int ), (int)4);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ey.bhbs("bhcl", bhbz(int ), (int)5);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bhbp(int n2) {
        return bhbq[n2] ^ bhbr[n2];
    }

    private static /* synthetic */ void biqi() {
        ey.bhca[500] = -1295829572;
        ey.bhca[501] = -1110929970;
        ey.bhca[502] = 2052360125;
        ey.bhca[503] = 1015398128;
        ey.bhca[504] = 1202421625;
        ey.bhca[505] = 1451588808;
        ey.bhca[506] = 675672654;
        ey.bhca[507] = -1482009096;
        ey.bhca[508] = -1742308999;
        ey.bhca[509] = 330187650;
        ey.bhca[510] = 1991330372;
        ey.bhca[511] = -1417653857;
        ey.bhca[512] = 816777366;
        ey.bhca[513] = -1898773547;
        ey.bhca[514] = -144212196;
        ey.bhca[515] = 284800429;
        ey.bhca[516] = -562494732;
        ey.bhca[517] = -1858395948;
        ey.bhca[518] = -1368360636;
        ey.bhca[519] = -1233349175;
        ey.bhca[520] = -380521203;
        ey.bhca[521] = -1872584906;
        ey.bhca[522] = 1157471712;
        ey.bhca[523] = -1796660962;
        ey.bhca[524] = -2108931032;
        ey.bhca[525] = -1489013586;
        ey.bhca[526] = 1460335402;
        ey.bhca[527] = 1405105930;
        ey.bhca[528] = 677301496;
        ey.bhca[529] = -1867966826;
        ey.bhca[530] = -1349765220;
        ey.bhca[531] = -673881842;
        ey.bhca[532] = -936851106;
        ey.bhca[533] = -1400072239;
        ey.bhca[534] = -1679781997;
        ey.bhca[535] = -1762095147;
        ey.bhca[536] = -1315673576;
        ey.bhca[537] = -169584730;
        ey.bhca[538] = 1605427141;
        ey.bhca[539] = 1266929786;
        ey.bhca[540] = 1097980637;
        ey.bhca[541] = 719170086;
        ey.bhca[542] = 201172781;
        ey.bhca[543] = -393426391;
        ey.bhca[544] = 1345537036;
        ey.bhca[545] = 1684617380;
        ey.bhca[546] = -934078523;
        ey.bhca[547] = -1788076300;
        ey.bhca[548] = -737529255;
        ey.bhca[549] = 826362322;
        ey.bhca[550] = 1752120225;
        ey.bhca[551] = 1549095945;
        ey.bhca[552] = 600933387;
        ey.bhca[553] = 504190857;
        ey.bhca[554] = -1986524517;
        ey.bhca[555] = 1948575875;
        ey.bhca[556] = -1626844505;
        ey.bhca[557] = 891558255;
        ey.bhca[558] = -1844028759;
        ey.bhca[559] = -9813925;
        ey.bhca[560] = -1860222170;
        ey.bhca[561] = 515790945;
        ey.bhca[562] = 978657621;
        ey.bhca[563] = 75429172;
        ey.bhca[564] = -142590674;
        ey.bhca[565] = -1799074309;
        ey.bhca[566] = -1014220787;
        ey.bhca[567] = 1477416023;
        ey.bhca[568] = 2146855836;
        ey.bhca[569] = 1761461610;
        ey.bhca[570] = -1886621771;
        ey.bhca[571] = -1121386103;
        ey.bhca[572] = -1434872590;
        ey.bhca[573] = -1780390517;
        ey.bhca[574] = -294596482;
        ey.bhca[575] = -1756000379;
        ey.bhca[576] = 1804920305;
        ey.bhca[577] = -1842272629;
        ey.bhca[578] = 1345312389;
        ey.bhca[579] = -139795085;
        ey.bhca[580] = -1698419091;
        ey.bhca[581] = -392898709;
        ey.bhca[582] = -1630124076;
        ey.bhca[583] = -1247350097;
        ey.bhca[584] = 1093626672;
        ey.bhca[585] = -609878290;
        ey.bhca[586] = -143622582;
        ey.bhca[587] = -951729799;
        ey.bhca[588] = 1325199038;
        ey.bhca[589] = 473234619;
        ey.bhca[590] = -1880914921;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block67: {
            block66: {
                block65: {
                    block64: {
                        var6_2 = ey.c;
                        var5_3 /* !! */  = ey.b;
                        var4_4 = ey.a;
                        if (var6_2) {
                            throw null;
lbl6:
                            // 17 sources

                            return;
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (!this.displayStun.isValue()) break block64;
                        if (var4_4) ** GOTO lbl6
                        if (var1_1.getType() != cr$Type.RECEIVE) break block64;
                        if (var4_4 || var4_4) ** GOTO lbl6
                        var3_5 = var1_1.getPacket();
                        if (var4_4) ** GOTO lbl6
                        if (!(var3_5 instanceof class_2767)) break block64;
                        if (var4_4) ** GOTO lbl6
                        var2_6 = (class_2767)var3_5;
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (var2_6.method_11894().method_40230().isEmpty()) break block64;
                        if (var4_4) ** GOTO lbl6
                        if ("block.beacon.deactivate".equals(((class_5321)var2_6.method_11894().method_40230().get()).method_29177().method_12832())) break block65;
                        if (var4_4) ** GOTO lbl6
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_5 = new class_243(var2_6.method_11890(), var2_6.method_11889(), var2_6.method_11893());
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.stunAreas.stream().anyMatch((Predicate<ey$StunArea>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onPacket$1(net.minecraft.class_243 ruhack.phobia.ey$StunArea ), (Lruhack/phobia/ey$StunArea;)Z)((class_243)var3_5))) break block66;
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (this.stunAreas.size() < ey.bhbs("bhia", bhbz(int ), (int)149)) break block67;
            if (var4_4 || var4_4) ** GOTO lbl6
            this.stunAreas.removeFirst();
            if (var4_4) ** GOTO lbl6
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                this.stunAreas.add(new ey$StunArea(var3_5, System.currentTimeMillis() + ey.bhbs("bhib", bhbp(int ), (int)11)));
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ey.bhbs("bhic", bhbz(int ), (int)150);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl119
                    break;
                }
            }
            case 1: {
                var5_3 /* !! */  = (int)ey.bhbs("bhid", bhbz(int ), (int)151);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 2: {
                var5_3 /* !! */  = (int)ey.bhbs("bhie", bhbz(int ), (int)152);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 3: {
                var5_3 /* !! */  = (int)ey.bhbs("bhif", bhbz(int ), (int)153);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 4: {
                var5_3 /* !! */  = (int)ey.bhbs("bhig", bhbz(int ), (int)154);
                if (!var6_2) break;
                throw null;
            }
            case 5: {
                do {
                    var5_3 /* !! */  = (int)ey.bhbs("bhih", bhbz(int ), (int)155);
                } while (!var6_2);
                throw null;
            }
lbl80:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)ey.bhbs("bhii", bhbz(int ), (int)156);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 7: {
                var5_3 /* !! */  = (int)ey.bhbs("bhij", bhbz(int ), (int)157);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 8: {
                var5_3 /* !! */  = (int)ey.bhbs("bhik", bhbz(int ), (int)158);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl95:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ey.bhbs("bhil", bhbz(int ), (int)159);
                if (var6_2) {
                    throw null;
                }
            }
            case 10: {
                var5_3 /* !! */  = (int)ey.bhbs("bhim", bhbz(int ), (int)160);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 11: {
                var5_3 /* !! */  = (int)ey.bhbs("bhin", bhbz(int ), (int)161);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl109:
            // 4 sources

            case 12: {
                var5_3 /* !! */  = (int)ey.bhbs("bhio", bhbz(int ), (int)162);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl114:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ey.bhbs("bhip", bhbz(int ), (int)163);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl119:
            // 4 sources

            case 14: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiq", bhbz(int ), (int)164);
                if (!var6_2) ** GOTO lbl109
                throw null;
            }
lbl123:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ey.bhbs("bhir", bhbz(int ), (int)165);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl128:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)ey.bhbs("bhis", bhbz(int ), (int)166);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl133:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)ey.bhbs("bhit", bhbz(int ), (int)167);
                if (!var6_2) ** GOTO lbl109
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiu", bhbz(int ), (int)168);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 19: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiv", bhbz(int ), (int)169);
                if (!var6_2) ** GOTO lbl80
                throw null;
            }
lbl146:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiw", bhbz(int ), (int)170);
                if (!var6_2) ** GOTO lbl50
                throw null;
            }
lbl150:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)ey.bhbs("bhix", bhbz(int ), (int)171);
                if (!var6_2) ** GOTO lbl119
                throw null;
            }
lbl154:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiy", bhbz(int ), (int)172);
                if (!var6_2) ** GOTO lbl95
                throw null;
            }
lbl158:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)ey.bhbs("bhiz", bhbz(int ), (int)173);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl163:
            // 2 sources

            case 24: {
                do {
                    var5_3 /* !! */  = (int)ey.bhbs("bhja", bhbz(int ), (int)174);
                } while (!var6_2);
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)ey.bhbs("bhjb", bhbz(int ), (int)175);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 26: {
                var5_3 /* !! */  = (int)ey.bhbs("bhjc", bhbz(int ), (int)176);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
lbl177:
            // 5 sources

            case 27: {
                var5_3 /* !! */  = (int)ey.bhbs("bhjd", bhbz(int ), (int)177);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
lbl181:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)ey.bhbs("bhje", bhbz(int ), (int)178);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
lbl185:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)ey.bhbs("bhjf", bhbz(int ), (int)179);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
            case 30: 
        }
        var5_3 /* !! */  = (int)ey.bhbs("bhjg", bhbz(int ), (int)180);
        ** while (!var6_2)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bipc() {
        ey.bhca[200] = -1117928237;
        ey.bhca[201] = 980603067;
        ey.bhca[202] = 826210027;
        ey.bhca[203] = 1057037067;
        ey.bhca[204] = -970330443;
        ey.bhca[205] = 897053722;
        ey.bhca[206] = -408136500;
        ey.bhca[207] = -1899673173;
        ey.bhca[208] = 994271496;
        ey.bhca[209] = -2065832506;
        ey.bhca[210] = 1779966005;
        ey.bhca[211] = 2099940178;
        ey.bhca[212] = 1927168375;
        ey.bhca[213] = -287002989;
        ey.bhca[214] = -2096179898;
        ey.bhca[215] = 1832390976;
        ey.bhca[216] = -1223311186;
        ey.bhca[217] = -1353477903;
        ey.bhca[218] = 84754572;
        ey.bhca[219] = 134534860;
        ey.bhca[220] = -1053890891;
        ey.bhca[221] = 1634354585;
        ey.bhca[222] = -1202331778;
        ey.bhca[223] = -628286136;
        ey.bhca[224] = -882877283;
        ey.bhca[225] = 1288071266;
        ey.bhca[226] = -280268697;
        ey.bhca[227] = 1803378681;
        ey.bhca[228] = -1691882868;
        ey.bhca[229] = -1800817647;
        ey.bhca[230] = -840266860;
        ey.bhca[231] = -890633076;
        ey.bhca[232] = -1606069807;
        ey.bhca[233] = -1852567499;
        ey.bhca[234] = -243370442;
        ey.bhca[235] = 353187415;
        ey.bhca[236] = 200622228;
        ey.bhca[237] = -1810204151;
        ey.bhca[238] = -517415726;
        ey.bhca[239] = -855089002;
        ey.bhca[240] = -941275131;
        ey.bhca[241] = 1794246774;
        ey.bhca[242] = 2102075433;
        ey.bhca[243] = 1529658755;
        ey.bhca[244] = -973465334;
        ey.bhca[245] = 274946093;
        ey.bhca[246] = -1192498263;
        ey.bhca[247] = -779550529;
        ey.bhca[248] = -145474361;
        ey.bhca[249] = 1918779928;
        ey.bhca[250] = 1351364705;
        ey.bhca[251] = -186266368;
        ey.bhca[252] = -756867123;
        ey.bhca[253] = -1345130697;
        ey.bhca[254] = 1930167190;
        ey.bhca[255] = 719676734;
        ey.bhca[256] = 1691384619;
        ey.bhca[257] = 1600618655;
        ey.bhca[258] = -1305280437;
        ey.bhca[259] = -1251991054;
        ey.bhca[260] = 1019046528;
        ey.bhca[261] = -2105676031;
        ey.bhca[262] = 2068980989;
        ey.bhca[263] = -1803749838;
        ey.bhca[264] = -1615262678;
        ey.bhca[265] = 322909267;
        ey.bhca[266] = 146194895;
        ey.bhca[267] = -2079231442;
        ey.bhca[268] = -1402493143;
        ey.bhca[269] = 1713155435;
        ey.bhca[270] = -2004910583;
        ey.bhca[271] = 6332018;
        ey.bhca[272] = -2051573727;
        ey.bhca[273] = -738096150;
        ey.bhca[274] = 2049248226;
        ey.bhca[275] = 1364939537;
        ey.bhca[276] = -1327549314;
        ey.bhca[277] = -715911081;
        ey.bhca[278] = 1959878614;
        ey.bhca[279] = -981626282;
        ey.bhca[280] = 452412135;
        ey.bhca[281] = 1246154867;
        ey.bhca[282] = 729025951;
        ey.bhca[283] = 608082301;
        ey.bhca[284] = -615029182;
        ey.bhca[285] = 1157736618;
        ey.bhca[286] = -1992235153;
        ey.bhca[287] = 130665332;
        ey.bhca[288] = -1119750172;
        ey.bhca[289] = -1591877679;
        ey.bhca[290] = -859798529;
        ey.bhca[291] = -2050115960;
        ey.bhca[292] = -564483217;
        ey.bhca[293] = -2142347054;
        ey.bhca[294] = -710690044;
        ey.bhca[295] = -398541871;
        ey.bhca[296] = 886180738;
        ey.bhca[297] = 683612301;
        ey.bhca[298] = 546136877;
        ey.bhca[299] = 1271506299;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = ey.dh;
        if (true) ** GOTO lbl5
        block56: while (true) {
            v0 /* !! */  = (long)(v1 - ey.bhbs("bihz", bhbp(int ), (int)226));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 301435918: {
                    break block56;
                }
                case 488144049: {
                    v1 = ey.bhbs("biib", bhbp(int ), (int)227);
                    continue block56;
                }
                case 1524317862: {
                    v1 = ey.bhbs("biic", bhbp(int ), (int)228);
                    continue block56;
                }
            }
            break;
        }
        var3_1 = ey.c;
        v2 /* !! */  = ey.dh;
        if (true) ** GOTO lbl19
        block57: while (true) {
            v2 /* !! */  = (long)(v3 - ey.bhbs("biie", bhbp(int ), (int)229));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 301435918: {
                    break block57;
                }
                case 1008690861: {
                    v3 = ey.bhbs("biif", bhbp(int ), (int)230);
                    continue block57;
                }
                case 1177951657: {
                    v3 = ey.bhbs("biig", bhbp(int ), (int)231);
                    continue block57;
                }
            }
            break;
        }
        var2_2 /* !! */  = ey.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("biij", bhbp(int ), (int)232)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ey.bhbs("biik", bhbz(int ), (int)532)) break;
            v4 /* !! */  = (long)ey.bhbs("biil", bhbz(int ), (int)533);
        }
        var1_3 = ey.a;
        if (var3_1) {
            throw null;
lbl37:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v5 /* !! */  = ey.dh;
        if (true) ** GOTO lbl44
        block60: while (true) {
            v5 /* !! */  = (long)(v6 - ey.bhbs("biim", bhbp(int ), (int)233));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -567024956: {
                    v6 = ey.bhbs("biin", bhbp(int ), (int)234);
                    continue block60;
                }
                case 301435918: {
                    break block60;
                }
                case 1385222352: {
                    v6 = ey.bhbs("biio", bhbp(int ), (int)235);
                    continue block60;
                }
            }
            break;
        }
        v7 /* !! */  = ey.dh;
        if (true) ** GOTO lbl57
        block61: while (true) {
            v7 /* !! */  = (long)(v8 - ey.bhbs("biip", bhbp(int ), (int)236));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1553656873: {
                    v8 = ey.bhbs("biit", bhbp(int ), (int)237);
                    continue block61;
                }
                case 301435918: {
                    break block61;
                }
                case 1830065521: {
                    v8 = ey.bhbs("biiu", bhbp(int ), (int)238);
                    continue block61;
                }
            }
            break;
        }
        if (this.phase == ey$ActionPhase.WAIT_RESTORE) ** GOTO lbl83
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("biiw", bhbp(int ), (int)239)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ey.bhbs("biix", bhbz(int ), (int)534)) break;
                    v9 /* !! */  = (long)ey.bhbs("biiz", bhbz(int ), (int)535);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bijb", bhbp(int ), (int)240)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ey.bhbs("bijc", bhbz(int ), (int)536)) break;
                    v10 /* !! */  = (long)ey.bhbs("bijd", bhbz(int ), (int)537);
                }
                if (this.phase != ey$ActionPhase.WAIT_RESTORE_STOP) ** GOTO lbl125
                if (var1_3) ** GOTO lbl37
lbl83:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bije", bhbp(int ), (int)241)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ey.bhbs("bijf", bhbz(int ), (int)538)) break;
                    v11 /* !! */  = (long)ey.bhbs("bijg", bhbz(int ), (int)539);
                }
                v12 /* !! */  = ey.dh;
                if (true) ** GOTO lbl93
                block65: while (true) {
                    v12 /* !! */  = (long)(v13 - ey.bhbs("biji", bhbp(int ), (int)242));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1370605295: {
                            v13 = ey.bhbs("bijj", bhbp(int ), (int)243);
                            continue block65;
                        }
                        case 64051210: {
                            v13 = ey.bhbs("bijl", bhbp(int ), (int)244);
                            continue block65;
                        }
                        case 301435918: {
                            break block65;
                        }
                        case 1963004766: {
                            v13 = ey.bhbs("bijp", bhbp(int ), (int)245);
                            continue block65;
                        }
                    }
                    break;
                }
                if (ey.mc.field_1724 == null) ** GOTO lbl125
                if (var1_3 || var1_3) ** GOTO lbl37
                v14 /* !! */  = ey.dh;
                if (true) ** GOTO lbl111
                block66: while (true) {
                    v14 /* !! */  = (long)(v15 - ey.bhbs("bijr", bhbp(int ), (int)246));
lbl111:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -330667313: {
                            v15 = ey.bhbs("bijs", bhbp(int ), (int)247);
                            continue block66;
                        }
                        case 301435918: {
                            break block66;
                        }
                        case 443216807: {
                            v15 = ey.bhbs("bijt", bhbp(int ), (int)248);
                            continue block66;
                        }
                        case 1222198341: {
                            v15 = ey.bhbs("biju", bhbp(int ), (int)249);
                            continue block66;
                        }
                    }
                    break;
                }
                this.restoreItem();
                if (var1_3) ** GOTO lbl37
lbl125:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bijy", bhbp(int ), (int)250)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ey.bhbs("bikc", bhbz(int ), (int)540)) break;
                    v16 /* !! */  = (long)ey.bhbs("bikd", bhbz(int ), (int)541);
                }
                v17 /* !! */  = ey.dh;
                if (true) ** GOTO lbl135
                block68: while (true) {
                    v17 /* !! */  = (long)(v18 - ey.bhbs("bike", bhbp(int ), (int)251));
lbl135:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 301435918: {
                            break block68;
                        }
                        case 845368150: {
                            v18 = ey.bhbs("bikf", bhbp(int ), (int)252);
                            continue block68;
                        }
                        case 1856077992: {
                            v18 = ey.bhbs("bikg", bhbp(int ), (int)253);
                            continue block68;
                        }
                    }
                    break;
                }
                this.stunAreas.clear();
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("biki", bhbp(int ), (int)254)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ey.bhbs("bikj", bhbz(int ), (int)542)) break;
                    v19 /* !! */  = (long)ey.bhbs("bikm", bhbz(int ), (int)543);
                }
                this.cleanup();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("biko", bhbz(int ), (int)544);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("bikq", bhbz(int ), (int)545);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl165:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ey.bhbs("bikt", bhbz(int ), (int)546);
                if (!var3_1) break;
                throw null;
            }
lbl169:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ey.bhbs("biku", bhbz(int ), (int)547);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl174:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ey.bhbs("bikw", bhbz(int ), (int)548);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl179:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("biky", bhbz(int ), (int)549);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
lbl183:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ey.bhbs("bikz", bhbz(int ), (int)550);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ey.bhbs("bila", bhbz(int ), (int)551);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
lbl191:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ey.bhbs("bilb", bhbz(int ), (int)552);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
lbl195:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ey.bhbs("bile", bhbz(int ), (int)553);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 10: {
                var2_2 /* !! */  = (int)ey.bhbs("bilf", bhbz(int ), (int)554);
                if (var3_1) {
                    throw null;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)ey.bhbs("bilg", bhbz(int ), (int)555);
                if (!var3_1) break;
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ey.bhbs("bilh", bhbz(int ), (int)556);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl212:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ey.bhbs("bilj", bhbz(int ), (int)557);
                if (!var3_1) ** GOTO lbl191
                throw null;
            }
lbl216:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ey.bhbs("bilk", bhbz(int ), (int)558);
                if (!var3_1) ** GOTO lbl212
                throw null;
            }
lbl220:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)ey.bhbs("bilm", bhbz(int ), (int)559);
                if (!var3_1) ** GOTO lbl195
                throw null;
            }
            case 16: 
        }
        do {
            var2_2 /* !! */  = (int)ey.bhbs("bilq", bhbz(int ), (int)560);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bira() {
        ey.bhbr[200] = -7451304164227204116L;
        ey.bhbr[201] = 971653061656326557L;
        ey.bhbr[202] = -2514669253147036862L;
        ey.bhbr[203] = -2976635291332347811L;
        ey.bhbr[204] = -4364676196621804111L;
        ey.bhbr[205] = -2705434375705395773L;
        ey.bhbr[206] = 2293922000295564659L;
        ey.bhbr[207] = 2539854192853287276L;
        ey.bhbr[208] = 3635882327208273802L;
        ey.bhbr[209] = -715454070252671126L;
        ey.bhbr[210] = -1593890692788641495L;
        ey.bhbr[211] = 318392921145065471L;
        ey.bhbr[212] = -6576821289774060139L;
        ey.bhbr[213] = -5342560681877107125L;
        ey.bhbr[214] = -2043985047484470352L;
        ey.bhbr[215] = -4487287422452915066L;
        ey.bhbr[216] = 5157025997375786828L;
        ey.bhbr[217] = -3408384750399476696L;
        ey.bhbr[218] = -3414626113770692776L;
        ey.bhbr[219] = 3135073871264853251L;
        ey.bhbr[220] = -3709061586427908393L;
        ey.bhbr[221] = 2801326300353748911L;
        ey.bhbr[222] = 8961669870595567729L;
        ey.bhbr[223] = -138248816613892153L;
        ey.bhbr[224] = -2732280472383587195L;
        ey.bhbr[225] = -3798225092443028288L;
        ey.bhbr[226] = -8556887822523853909L;
        ey.bhbr[227] = -1935272024792357795L;
        ey.bhbr[228] = -2538402307488587966L;
        ey.bhbr[229] = -9009328482529710018L;
        ey.bhbr[230] = -5256104195531230374L;
        ey.bhbr[231] = 8202014808839957722L;
        ey.bhbr[232] = -603394319370965821L;
        ey.bhbr[233] = 1230566927544386935L;
        ey.bhbr[234] = -6810405579564839700L;
        ey.bhbr[235] = 2948888538438930756L;
        ey.bhbr[236] = 1374197838164242982L;
        ey.bhbr[237] = 4127697728370172078L;
        ey.bhbr[238] = -4080377847457936789L;
        ey.bhbr[239] = 6435454814463307282L;
        ey.bhbr[240] = -219351299533702898L;
        ey.bhbr[241] = 7784481458256213024L;
        ey.bhbr[242] = -1522111541418514291L;
        ey.bhbr[243] = 2970042279937097643L;
        ey.bhbr[244] = 5728700056660833411L;
        ey.bhbr[245] = -8228222984934135916L;
        ey.bhbr[246] = -5472775438399289471L;
        ey.bhbr[247] = -6036864550295301327L;
        ey.bhbr[248] = 441972880551100662L;
        ey.bhbr[249] = 6380022054642779061L;
        ey.bhbr[250] = -5674321550828268248L;
        ey.bhbr[251] = 2043604618974846039L;
        ey.bhbr[252] = 679522328999930334L;
        ey.bhbr[253] = 2806195344187732001L;
        ey.bhbr[254] = -4683658934190537447L;
        ey.bhbr[255] = -6112568782319921671L;
        ey.bhbr[256] = 8219558162188397737L;
        ey.bhbr[257] = -5248936879458612821L;
        ey.bhbr[258] = -2655174984563614440L;
        ey.bhbr[259] = 2777412257900704880L;
        ey.bhbr[260] = 659263243325902485L;
        ey.bhbr[261] = -8616649635730028483L;
        ey.bhbr[262] = -4508135840036962256L;
        ey.bhbr[263] = 6194370609741918993L;
        ey.bhbr[264] = -8978501186812342485L;
        ey.bhbr[265] = -6024756291391625106L;
        ey.bhbr[266] = 7103949513348823368L;
        ey.bhbr[267] = 8556535156916592036L;
        ey.bhbr[268] = -7856635392001161862L;
        ey.bhbr[269] = 5618468699651133729L;
        ey.bhbr[270] = -8613999678344552534L;
    }

    private static /* synthetic */ void biqr() {
        ey.bhcb[300] = -30659487;
        ey.bhcb[301] = -756785760;
        ey.bhcb[302] = -1711493521;
        ey.bhcb[303] = -695904993;
        ey.bhcb[304] = -509250321;
        ey.bhcb[305] = 349734244;
        ey.bhcb[306] = -1422022994;
        ey.bhcb[307] = -1554149418;
        ey.bhcb[308] = -259359903;
        ey.bhcb[309] = 1420277191;
        ey.bhcb[310] = -1978045418;
        ey.bhcb[311] = 1395877786;
        ey.bhcb[312] = -1985280849;
        ey.bhcb[313] = -1325524491;
        ey.bhcb[314] = 1220313144;
        ey.bhcb[315] = 557553953;
        ey.bhcb[316] = -1545870023;
        ey.bhcb[317] = -1287545018;
        ey.bhcb[318] = 786299466;
        ey.bhcb[319] = 1546099286;
        ey.bhcb[320] = -2104586526;
        ey.bhcb[321] = 34369996;
        ey.bhcb[322] = -1735282947;
        ey.bhcb[323] = 1714014007;
        ey.bhcb[324] = -409251029;
        ey.bhcb[325] = 589164016;
        ey.bhcb[326] = 1540405705;
        ey.bhcb[327] = 214665225;
        ey.bhcb[328] = 215895938;
        ey.bhcb[329] = 2020483477;
        ey.bhcb[330] = 244649247;
        ey.bhcb[331] = 1824189380;
        ey.bhcb[332] = -1903430685;
        ey.bhcb[333] = -1214751896;
        ey.bhcb[334] = -310122735;
        ey.bhcb[335] = -772048172;
        ey.bhcb[336] = 34003017;
        ey.bhcb[337] = -1617083069;
        ey.bhcb[338] = -1351031329;
        ey.bhcb[339] = 252375582;
        ey.bhcb[340] = -264702624;
        ey.bhcb[341] = 398573782;
        ey.bhcb[342] = 368120800;
        ey.bhcb[343] = -977380250;
        ey.bhcb[344] = 1781677726;
        ey.bhcb[345] = -669759420;
        ey.bhcb[346] = -427929784;
        ey.bhcb[347] = -1590899442;
        ey.bhcb[348] = 1658626487;
        ey.bhcb[349] = 609675221;
        ey.bhcb[350] = 1165943173;
        ey.bhcb[351] = 588219680;
        ey.bhcb[352] = -1750157834;
        ey.bhcb[353] = 1529582321;
        ey.bhcb[354] = -199691892;
        ey.bhcb[355] = -428535629;
        ey.bhcb[356] = 78024955;
        ey.bhcb[357] = 1590863632;
        ey.bhcb[358] = -1898656837;
        ey.bhcb[359] = -160504020;
        ey.bhcb[360] = -1040525386;
        ey.bhcb[361] = 1450434482;
        ey.bhcb[362] = 1107635439;
        ey.bhcb[363] = 1533267938;
        ey.bhcb[364] = 1392887860;
        ey.bhcb[365] = 1269084260;
        ey.bhcb[366] = 472126436;
        ey.bhcb[367] = -1472939257;
        ey.bhcb[368] = 1625838541;
        ey.bhcb[369] = 1089024548;
        ey.bhcb[370] = -1619718638;
        ey.bhcb[371] = -269175209;
        ey.bhcb[372] = -625939826;
        ey.bhcb[373] = -1189763722;
        ey.bhcb[374] = -1321670443;
        ey.bhcb[375] = -2056466633;
        ey.bhcb[376] = -356457160;
        ey.bhcb[377] = -1491605985;
        ey.bhcb[378] = -945286594;
        ey.bhcb[379] = -2083563595;
        ey.bhcb[380] = -1840669853;
        ey.bhcb[381] = 726775049;
        ey.bhcb[382] = 2113333032;
        ey.bhcb[383] = 86187280;
        ey.bhcb[384] = -509791821;
        ey.bhcb[385] = 1462975593;
        ey.bhcb[386] = -1190637939;
        ey.bhcb[387] = 1129120381;
        ey.bhcb[388] = 1325504330;
        ey.bhcb[389] = 265421864;
        ey.bhcb[390] = 1118922365;
        ey.bhcb[391] = 663217784;
        ey.bhcb[392] = 20815049;
        ey.bhcb[393] = 235607447;
        ey.bhcb[394] = -1992401401;
        ey.bhcb[395] = 1116924534;
        ey.bhcb[396] = -929867909;
        ey.bhcb[397] = 2049634344;
        ey.bhcb[398] = 519903284;
        ey.bhcb[399] = 1675753068;
    }

    private static /* synthetic */ void biqm() {
        ey.bhcb[100] = -227292800;
        ey.bhcb[101] = -1765244625;
        ey.bhcb[102] = 1217008983;
        ey.bhcb[103] = 639813372;
        ey.bhcb[104] = -133709323;
        ey.bhcb[105] = -783596853;
        ey.bhcb[106] = 170652439;
        ey.bhcb[107] = -1831472502;
        ey.bhcb[108] = 714302488;
        ey.bhcb[109] = 1967729560;
        ey.bhcb[110] = 1060742433;
        ey.bhcb[111] = -359321114;
        ey.bhcb[112] = -22337030;
        ey.bhcb[113] = -1654383396;
        ey.bhcb[114] = -1353878465;
        ey.bhcb[115] = 1955341397;
        ey.bhcb[116] = -408261633;
        ey.bhcb[117] = 856596468;
        ey.bhcb[118] = -440793837;
        ey.bhcb[119] = -2010886767;
        ey.bhcb[120] = -883397455;
        ey.bhcb[121] = 870475676;
        ey.bhcb[122] = -1842185725;
        ey.bhcb[123] = -1475558747;
        ey.bhcb[124] = -2085499440;
        ey.bhcb[125] = 973545836;
        ey.bhcb[126] = -1703001999;
        ey.bhcb[127] = -636141284;
        ey.bhcb[128] = -1423195475;
        ey.bhcb[129] = 292969381;
        ey.bhcb[130] = 1904213295;
        ey.bhcb[131] = -2139024294;
        ey.bhcb[132] = -817392713;
        ey.bhcb[133] = 1836155693;
        ey.bhcb[134] = 5917746;
        ey.bhcb[135] = 1960340808;
        ey.bhcb[136] = -207468714;
        ey.bhcb[137] = 1129004504;
        ey.bhcb[138] = 1676953476;
        ey.bhcb[139] = -880472009;
        ey.bhcb[140] = -1508539401;
        ey.bhcb[141] = -1443519256;
        ey.bhcb[142] = 1321929087;
        ey.bhcb[143] = -722371331;
        ey.bhcb[144] = -1338245273;
        ey.bhcb[145] = -455400489;
        ey.bhcb[146] = -736321993;
        ey.bhcb[147] = 1655698788;
        ey.bhcb[148] = 888999780;
        ey.bhcb[149] = -56623277;
        ey.bhcb[150] = 384315249;
        ey.bhcb[151] = -976828279;
        ey.bhcb[152] = -333071247;
        ey.bhcb[153] = 1332179951;
        ey.bhcb[154] = 1197641706;
        ey.bhcb[155] = -1005436763;
        ey.bhcb[156] = 732264814;
        ey.bhcb[157] = -437143476;
        ey.bhcb[158] = -734657961;
        ey.bhcb[159] = 237203609;
        ey.bhcb[160] = 743513549;
        ey.bhcb[161] = -373332666;
        ey.bhcb[162] = -2110662908;
        ey.bhcb[163] = 1199241502;
        ey.bhcb[164] = -866450966;
        ey.bhcb[165] = 1292574950;
        ey.bhcb[166] = -1518108720;
        ey.bhcb[167] = 1408294648;
        ey.bhcb[168] = -304539428;
        ey.bhcb[169] = -244837186;
        ey.bhcb[170] = -327807931;
        ey.bhcb[171] = 1864783741;
        ey.bhcb[172] = -1314415451;
        ey.bhcb[173] = 954988553;
        ey.bhcb[174] = -2069572887;
        ey.bhcb[175] = 2024364375;
        ey.bhcb[176] = 1129171364;
        ey.bhcb[177] = -1108535280;
        ey.bhcb[178] = -2036409389;
        ey.bhcb[179] = 851047816;
        ey.bhcb[180] = 1756257614;
        ey.bhcb[181] = -118619442;
        ey.bhcb[182] = -574758784;
        ey.bhcb[183] = -769803090;
        ey.bhcb[184] = -21705699;
        ey.bhcb[185] = 1237759958;
        ey.bhcb[186] = -87231258;
        ey.bhcb[187] = 23966856;
        ey.bhcb[188] = 969630407;
        ey.bhcb[189] = 1068860276;
        ey.bhcb[190] = -448254518;
        ey.bhcb[191] = -1777360456;
        ey.bhcb[192] = -1527396685;
        ey.bhcb[193] = 167766035;
        ey.bhcb[194] = -1581262770;
        ey.bhcb[195] = -522999350;
        ey.bhcb[196] = -399603288;
        ey.bhcb[197] = 1114520029;
        ey.bhcb[198] = 696194765;
        ey.bhcb[199] = 1010536820;
    }

    private static /* synthetic */ void bipo() {
        ey.bhca[300] = 1525679942;
        ey.bhca[301] = -756785759;
        ey.bhca[302] = 292156598;
        ey.bhca[303] = -695904994;
        ey.bhca[304] = -93063591;
        ey.bhca[305] = -349734245;
        ey.bhca[306] = -908465234;
        ey.bhca[307] = 1554149417;
        ey.bhca[308] = -738036758;
        ey.bhca[309] = -1420277192;
        ey.bhca[310] = -1754034468;
        ey.bhca[311] = -1395877787;
        ey.bhca[312] = -34705651;
        ey.bhca[313] = -1325524492;
        ey.bhca[314] = 1207766605;
        ey.bhca[315] = 557553952;
        ey.bhca[316] = -358035882;
        ey.bhca[317] = -1287545012;
        ey.bhca[318] = 786299470;
        ey.bhca[319] = 1546099294;
        ey.bhca[320] = -2104586521;
        ey.bhca[321] = 34369993;
        ey.bhca[322] = -1735282955;
        ey.bhca[323] = 1714014009;
        ey.bhca[324] = -409251037;
        ey.bhca[325] = 589164029;
        ey.bhca[326] = 1540405727;
        ey.bhca[327] = 214665247;
        ey.bhca[328] = 215895955;
        ey.bhca[329] = 2020483456;
        ey.bhca[330] = 244649246;
        ey.bhca[331] = 1824189386;
        ey.bhca[332] = -1903430661;
        ey.bhca[333] = -1214751875;
        ey.bhca[334] = -310122752;
        ey.bhca[335] = -772048169;
        ey.bhca[336] = 34003034;
        ey.bhca[337] = -1617083057;
        ey.bhca[338] = -1351031335;
        ey.bhca[339] = 252375568;
        ey.bhca[340] = -264702617;
        ey.bhca[341] = 398573790;
        ey.bhca[342] = 368120801;
        ey.bhca[343] = 1217776036;
        ey.bhca[344] = 1781677727;
        ey.bhca[345] = 669759419;
        ey.bhca[346] = 427929783;
        ey.bhca[347] = 1590899441;
        ey.bhca[348] = -1658626488;
        ey.bhca[349] = 609675221;
        ey.bhca[350] = 1165943172;
        ey.bhca[351] = 1745067245;
        ey.bhca[352] = 1750157833;
        ey.bhca[353] = 1529582320;
        ey.bhca[354] = -199691892;
        ey.bhca[355] = -428535630;
        ey.bhca[356] = -529669473;
        ey.bhca[357] = 1590863633;
        ey.bhca[358] = -1060421367;
        ey.bhca[359] = -160504019;
        ey.bhca[360] = -1694530028;
        ey.bhca[361] = -1450434483;
        ey.bhca[362] = 420207726;
        ey.bhca[363] = 1533267939;
        ey.bhca[364] = 1392887840;
        ey.bhca[365] = 1269084260;
        ey.bhca[366] = 472126454;
        ey.bhca[367] = -1472939247;
        ey.bhca[368] = 1625838557;
        ey.bhca[369] = 1089024561;
        ey.bhca[370] = -1619718640;
        ey.bhca[371] = -269175217;
        ey.bhca[372] = -625939818;
        ey.bhca[373] = -1189763738;
        ey.bhca[374] = -1321670443;
        ey.bhca[375] = -2056466638;
        ey.bhca[376] = -356457153;
        ey.bhca[377] = -1491605987;
        ey.bhca[378] = -945286615;
        ey.bhca[379] = -2083563587;
        ey.bhca[380] = -1840669844;
        ey.bhca[381] = 726775055;
        ey.bhca[382] = 2113333050;
        ey.bhca[383] = 86187287;
        ey.bhca[384] = -509791824;
        ey.bhca[385] = 1462975596;
        ey.bhca[386] = -1190637928;
        ey.bhca[387] = 1129120377;
        ey.bhca[388] = 1325504335;
        ey.bhca[389] = 265421865;
        ey.bhca[390] = 233486231;
        ey.bhca[391] = 663217785;
        ey.bhca[392] = 28823550;
        ey.bhca[393] = 235607446;
        ey.bhca[394] = -187756549;
        ey.bhca[395] = -1116924535;
        ey.bhca[396] = 439056155;
        ey.bhca[397] = -2049634345;
        ey.bhca[398] = -174536102;
        ey.bhca[399] = 1675753069;
    }

    private static /* synthetic */ void bior() {
        ey.bhca[0] = -387891412;
        ey.bhca[1] = 2009811695;
        ey.bhca[2] = -2135661131;
        ey.bhca[3] = -1920184359;
        ey.bhca[4] = -166474637;
        ey.bhca[5] = 1972078797;
        ey.bhca[6] = -1913994314;
        ey.bhca[7] = 660624614;
        ey.bhca[8] = 2037533077;
        ey.bhca[9] = -1283829835;
        ey.bhca[10] = -818602393;
        ey.bhca[11] = 864944463;
        ey.bhca[12] = 763463366;
        ey.bhca[13] = 1503869278;
        ey.bhca[14] = 958652416;
        ey.bhca[15] = 1752262004;
        ey.bhca[16] = -1788019925;
        ey.bhca[17] = -929603064;
        ey.bhca[18] = 1495311895;
        ey.bhca[19] = -374923187;
        ey.bhca[20] = -2125029240;
        ey.bhca[21] = -450234493;
        ey.bhca[22] = 1901596407;
        ey.bhca[23] = 195817223;
        ey.bhca[24] = -538820661;
        ey.bhca[25] = -541312602;
        ey.bhca[26] = 1342427195;
        ey.bhca[27] = 1221504848;
        ey.bhca[28] = -17636941;
        ey.bhca[29] = 424409543;
        ey.bhca[30] = 852794887;
        ey.bhca[31] = 1835897112;
        ey.bhca[32] = -1926861244;
        ey.bhca[33] = -1568050452;
        ey.bhca[34] = 1020766818;
        ey.bhca[35] = 974468520;
        ey.bhca[36] = -2034405210;
        ey.bhca[37] = 776983011;
        ey.bhca[38] = 233397170;
        ey.bhca[39] = 1046246936;
        ey.bhca[40] = -1694152982;
        ey.bhca[41] = -615586356;
        ey.bhca[42] = 1901006427;
        ey.bhca[43] = 557751720;
        ey.bhca[44] = -2015503843;
        ey.bhca[45] = -1423500928;
        ey.bhca[46] = 896674823;
        ey.bhca[47] = -141059246;
        ey.bhca[48] = -828089429;
        ey.bhca[49] = 468204864;
        ey.bhca[50] = 2079047168;
        ey.bhca[51] = 1182532833;
        ey.bhca[52] = -667596622;
        ey.bhca[53] = 61707928;
        ey.bhca[54] = -1712241654;
        ey.bhca[55] = 1617311622;
        ey.bhca[56] = 1433632879;
        ey.bhca[57] = -654606756;
        ey.bhca[58] = -164904347;
        ey.bhca[59] = -2059370043;
        ey.bhca[60] = 1854441141;
        ey.bhca[61] = -503116344;
        ey.bhca[62] = 1679637198;
        ey.bhca[63] = -881953130;
        ey.bhca[64] = 968835331;
        ey.bhca[65] = -1540054734;
        ey.bhca[66] = -557316560;
        ey.bhca[67] = 360042010;
        ey.bhca[68] = -1894004879;
        ey.bhca[69] = 349319253;
        ey.bhca[70] = 663666235;
        ey.bhca[71] = 1191803363;
        ey.bhca[72] = -454551482;
        ey.bhca[73] = 1992214154;
        ey.bhca[74] = -1703235126;
        ey.bhca[75] = -2092970179;
        ey.bhca[76] = -862533903;
        ey.bhca[77] = 30971890;
        ey.bhca[78] = -1719528665;
        ey.bhca[79] = -1763251798;
        ey.bhca[80] = -1814432252;
        ey.bhca[81] = -1459651571;
        ey.bhca[82] = -733588168;
        ey.bhca[83] = 1266200446;
        ey.bhca[84] = -1126287742;
        ey.bhca[85] = -574500173;
        ey.bhca[86] = -1403622737;
        ey.bhca[87] = 1533154326;
        ey.bhca[88] = -2021779731;
        ey.bhca[89] = -1748627268;
        ey.bhca[90] = 1049092395;
        ey.bhca[91] = 627541352;
        ey.bhca[92] = -851673416;
        ey.bhca[93] = 984056110;
        ey.bhca[94] = -1682636310;
        ey.bhca[95] = 891985646;
        ey.bhca[96] = 2015438960;
        ey.bhca[97] = 190904456;
        ey.bhca[98] = 1432188019;
        ey.bhca[99] = -797733498;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block150: {
            block149: {
                var6_2 = ey.c;
                var5_3 /* !! */  = ey.b;
                var4_4 = ey.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 38 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (ey.mc.field_1724 != null) break block149;
                if (var4_4 || var4_4) ** GOTO lbl6
                this.stunAreas.clear();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.cleanup();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            this.tryHalfTickUse();
            if (var4_4 || var4_4) ** GOTO lbl6
            if (this.displayStun.isValue()) break block150;
            if (var4_4 || var4_4) ** GOTO lbl6
            this.stunAreas.clear();
            if (var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl39
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (this.stunAreas.isEmpty()) ** GOTO lbl39
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_5 = System.currentTimeMillis();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.stunAreas.removeIf((Predicate<ey$StunArea>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onTick$0(long ruhack.phobia.ey$StunArea ), (Lruhack/phobia/ey$StunArea;)Z)((long)var2_5));
                if (var4_4) ** GOTO lbl6
lbl39:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.phase != ey$ActionPhase.WAIT_USE_STOP) ** GOTO lbl55
                if (var4_4 || var4_4) ** GOTO lbl6
                this.movement.block();
                if (var4_4 || var4_4) ** GOTO lbl6
                v0 = this.stopTicks;
                this.stopTicks = v0 - ey.bhbs("bhfb", bhbz(int ), (int)72);
                if (v0 <= 0) ** GOTO lbl49
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl49:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.usePreparedItem();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.restoreMovement();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl55:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.phase != ey$ActionPhase.WAIT_RESTORE) ** GOTO lbl76
                if (var4_4) ** GOTO lbl6
                if (System.currentTimeMillis() < this.restoreAt) ** GOTO lbl76
                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.fromHotbar) ** GOTO lbl70
                if (var4_4) ** GOTO lbl6
                if (this.mode.isSelected("New")) ** GOTO lbl66
                if (var4_4) ** GOTO lbl6
                if (!this.fullStop.isValue()) ** GOTO lbl70
                if (var4_4) ** GOTO lbl6
lbl66:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.beginStop(ey$ActionPhase.WAIT_RESTORE_STOP);
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl70:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.restoreItem();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.cleanup();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl76:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.phase != ey$ActionPhase.WAIT_RESTORE_STOP) ** GOTO lbl91
                if (var4_4 || var4_4) ** GOTO lbl6
                this.movement.block();
                if (var4_4 || var4_4) ** GOTO lbl6
                v1 = this.stopTicks;
                this.stopTicks = v1 - ey.bhbs("bhfc", bhbz(int ), (int)73);
                if (v1 <= 0) ** GOTO lbl86
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl86:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.restoreItem();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.cleanup();
                if (var4_4) ** GOTO lbl6
lbl91:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl94:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfd", bhbz(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl99:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfe", bhbz(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 2: {
                var5_3 /* !! */  = (int)ey.bhbs("bhff", bhbz(int ), (int)76);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 3: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfg", bhbz(int ), (int)77);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl114:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfh", bhbz(int ), (int)78);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl119:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfi", bhbz(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl124:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfj", bhbz(int ), (int)80);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl129:
            // 4 sources

            case 7: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfk", bhbz(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl134:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfl", bhbz(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl139:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfm", bhbz(int ), (int)83);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 10: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfn", bhbz(int ), (int)84);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 11: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfo", bhbz(int ), (int)85);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 12: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfp", bhbz(int ), (int)86);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl159:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfq", bhbz(int ), (int)87);
                if (!var6_2) ** GOTO lbl114
                throw null;
            }
lbl163:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfr", bhbz(int ), (int)88);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl168:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfs", bhbz(int ), (int)89);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 16: {
                var5_3 /* !! */  = (int)ey.bhbs("bhft", bhbz(int ), (int)90);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl178:
            // 4 sources

            case 17: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfu", bhbz(int ), (int)91);
                if (!var6_2) ** GOTO lbl119
                throw null;
            }
lbl182:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfv", bhbz(int ), (int)92);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 19: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfw", bhbz(int ), (int)93);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 20: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfx", bhbz(int ), (int)94);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 21: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfy", bhbz(int ), (int)95);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
lbl201:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)ey.bhbs("bhfz", bhbz(int ), (int)96);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl206:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)ey.bhbs("bhga", bhbz(int ), (int)97);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 24: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgb", bhbz(int ), (int)98);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl215:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ey.bhbs("bhgc", bhbz(int ), (int)99);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl381
                    break;
                }
            }
            case 26: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgd", bhbz(int ), (int)100);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl226:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)ey.bhbs("bhge", bhbz(int ), (int)101);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl231:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgf", bhbz(int ), (int)102);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl236:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgg", bhbz(int ), (int)103);
                if (!var6_2) ** GOTO lbl99
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgh", bhbz(int ), (int)104);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl406
            }
            case 31: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgi", bhbz(int ), (int)105);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl250:
            // 3 sources

            case 32: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgj", bhbz(int ), (int)106);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
lbl254:
            // 2 sources

            case 33: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgk", bhbz(int ), (int)107);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl259:
            // 2 sources

            case 34: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgl", bhbz(int ), (int)108);
                if (var6_2) {
                    throw null;
                }
            }
lbl263:
            // 5 sources

            case 35: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgm", bhbz(int ), (int)109);
                if (!var6_2) ** GOTO lbl134
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgn", bhbz(int ), (int)110);
                if (!var6_2) ** GOTO lbl139
                throw null;
            }
            case 37: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgo", bhbz(int ), (int)111);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 38: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgp", bhbz(int ), (int)112);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl281:
            // 2 sources

            case 39: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgq", bhbz(int ), (int)113);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl286:
            // 2 sources

            case 40: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgr", bhbz(int ), (int)114);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
lbl290:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgs", bhbz(int ), (int)115);
                if (!var6_2) ** GOTO lbl182
                throw null;
            }
lbl294:
            // 2 sources

            case 42: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgt", bhbz(int ), (int)116);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl299:
            // 4 sources

            case 43: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgu", bhbz(int ), (int)117);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl304:
            // 2 sources

            case 44: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgv", bhbz(int ), (int)118);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl309:
            // 2 sources

            case 45: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgw", bhbz(int ), (int)119);
                if (!var6_2) ** GOTO lbl139
                throw null;
            }
lbl313:
            // 3 sources

            case 46: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgx", bhbz(int ), (int)120);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 47: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgy", bhbz(int ), (int)121);
                if (var6_2) {
                    throw null;
                }
            }
            case 48: {
                var5_3 /* !! */  = (int)ey.bhbs("bhgz", bhbz(int ), (int)122);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl326:
            // 4 sources

            case 49: {
                var5_3 /* !! */  = (int)ey.bhbs("bhha", bhbz(int ), (int)123);
                if (!var6_2) ** GOTO lbl226
                throw null;
            }
lbl330:
            // 3 sources

            case 50: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhb", bhbz(int ), (int)124);
                if (!var6_2) ** GOTO lbl178
                throw null;
            }
            case 51: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhc", bhbz(int ), (int)125);
                if (!var6_2) ** GOTO lbl215
                throw null;
            }
            case 52: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhd", bhbz(int ), (int)126);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
lbl342:
            // 2 sources

            case 53: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhe", bhbz(int ), (int)127);
                if (!var6_2) ** GOTO lbl299
                throw null;
            }
            case 54: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhf", bhbz(int ), (int)128);
                if (!var6_2) ** GOTO lbl124
                throw null;
            }
lbl350:
            // 3 sources

            case 55: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhg", bhbz(int ), (int)129);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl355:
            // 3 sources

            case 56: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhh", bhbz(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 57: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhi", bhbz(int ), (int)131);
                if (!var6_2) ** GOTO lbl290
                throw null;
            }
lbl364:
            // 2 sources

            case 58: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhj", bhbz(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl369:
            // 2 sources

            case 59: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhk", bhbz(int ), (int)133);
                if (!var6_2) ** GOTO lbl254
                throw null;
            }
lbl373:
            // 3 sources

            case 60: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhl", bhbz(int ), (int)134);
                if (!var6_2) ** GOTO lbl326
                throw null;
            }
lbl377:
            // 2 sources

            case 61: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhm", bhbz(int ), (int)135);
                if (!var6_2) ** GOTO lbl178
                throw null;
            }
lbl381:
            // 3 sources

            case 62: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhn", bhbz(int ), (int)136);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 63: {
                var5_3 /* !! */  = (int)ey.bhbs("bhho", bhbz(int ), (int)137);
                if (!var6_2) ** GOTO lbl369
                throw null;
            }
            case 64: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhp", bhbz(int ), (int)138);
                if (!var6_2) ** GOTO lbl231
                throw null;
            }
lbl394:
            // 3 sources

            case 65: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhq", bhbz(int ), (int)139);
                if (!var6_2) ** GOTO lbl364
                throw null;
            }
lbl398:
            // 5 sources

            case 66: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhr", bhbz(int ), (int)140);
                if (!var6_2) ** GOTO lbl326
                throw null;
            }
lbl402:
            // 2 sources

            case 67: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhs", bhbz(int ), (int)141);
                if (!var6_2) ** GOTO lbl342
                throw null;
            }
lbl406:
            // 3 sources

            case 68: {
                var5_3 /* !! */  = (int)ey.bhbs("bhht", bhbz(int ), (int)142);
                if (!var6_2) ** GOTO lbl377
                throw null;
            }
lbl410:
            // 2 sources

            case 69: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhu", bhbz(int ), (int)143);
                if (!var6_2) ** GOTO lbl94
                throw null;
            }
lbl414:
            // 2 sources

            case 70: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhv", bhbz(int ), (int)144);
                if (!var6_2) ** GOTO lbl178
                throw null;
            }
lbl418:
            // 2 sources

            case 71: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhw", bhbz(int ), (int)145);
                if (!var6_2) ** GOTO lbl350
                throw null;
            }
lbl422:
            // 2 sources

            case 72: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhx", bhbz(int ), (int)146);
                if (!var6_2) ** GOTO lbl414
                throw null;
            }
            case 73: {
                var5_3 /* !! */  = (int)ey.bhbs("bhhy", bhbz(int ), (int)147);
                if (!var6_2) ** GOTO lbl418
                throw null;
            }
            case 74: 
        }
        var5_3 /* !! */  = (int)ey.bhbs("bhhz", bhbz(int ), (int)148);
        ** while (!var6_2)
lbl433:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usePreparedItem() {
        block92: {
            v0 /* !! */  = ey.dh;
            if (true) ** GOTO lbl5
            block57: while (true) {
                v0 /* !! */  = (long)(ey.bhbs("bhwz", bhbp(int ), (int)132) - ey.bhbs("bhwx", bhbp(int ), (int)131));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1026586257: {
                        continue block57;
                    }
                    case 301435918: {
                        break block57;
                    }
                }
                break;
            }
            var3_1 = ey.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bhxa", bhbp(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ey.bhbs("bhxd", bhbz(int ), (int)414)) break;
                v1 /* !! */  = (long)ey.bhbs("bhxf", bhbz(int ), (int)415);
            }
            var2_2 /* !! */  = ey.b;
            v2 /* !! */  = ey.dh;
            if (true) ** GOTO lbl21
            block59: while (true) {
                v2 /* !! */  = (long)(v3 - ey.bhbs("bhxg", bhbp(int ), (int)134));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1216484104: {
                        v3 = ey.bhbs("bhxh", bhbp(int ), (int)135);
                        continue block59;
                    }
                    case 15995581: {
                        v3 = ey.bhbs("bhxi", bhbp(int ), (int)136);
                        continue block59;
                    }
                    case 301435918: {
                        break block59;
                    }
                }
                break;
            }
            var1_3 = ey.a;
            if (var3_1) {
                throw null;
lbl33:
                // 10 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bhxj", bhbp(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ey.bhbs("bhxk", bhbz(int ), (int)416)) break;
                v4 /* !! */  = (long)ey.bhbs("bhxp", bhbz(int ), (int)417);
            }
            if (this.fromHotbar) break block92;
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bhxq", bhbp(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ey.bhbs("bhxr", bhbz(int ), (int)418)) break;
                v5 /* !! */  = (long)ey.bhbs("bhxs", bhbz(int ), (int)419);
            }
            v6 /* !! */  = ey.dh;
            if (true) ** GOTO lbl52
            block63: while (true) {
                v6 /* !! */  = (long)(ey.bhbs("bhxu", bhbp(int ), (int)140) - ey.bhbs("bhxt", bhbp(int ), (int)139));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1656337235: {
                        continue block63;
                    }
                    case 301435918: {
                        break block63;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bhxv", bhbp(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ey.bhbs("bhxw", bhbz(int ), (int)420)) break;
                v7 /* !! */  = (long)ey.bhbs("bhxx", bhbz(int ), (int)421);
            }
            nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
            if (var1_3) ** GOTO lbl33
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v8 /* !! */  = ey.dh;
        if (true) ** GOTO lbl70
        block65: while (true) {
            v8 /* !! */  = (long)(ey.bhbs("bhxz", bhbp(int ), (int)143) - ey.bhbs("bhxy", bhbp(int ), (int)142));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 20528361: {
                    continue block65;
                }
                case 301435918: {
                    break block65;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bhya", bhbp(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ey.bhbs("bhyb", bhbz(int ), (int)422)) break;
            v9 /* !! */  = (long)ey.bhbs("bhyc", bhbz(int ), (int)423);
        }
        nv.selectSlotSilent(this.temporaryHotbarSlot);
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bhyd", bhbp(int ), (int)145)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ey.bhbs("bhye", bhbz(int ), (int)424)) break;
            v10 /* !! */  = (long)ey.bhbs("bhyf", bhbz(int ), (int)425);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_6 = ey.dh - ey.bhbs("bhyh", bhbp(int ), (int)146)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ey.bhbs("bhyi", bhbz(int ), (int)426)) break;
            v11 /* !! */  = (long)ey.bhbs("bhyk", bhbz(int ), (int)427);
        }
        nv.sendUsePacket(class_1268.field_5808);
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = ey.dh - ey.bhbs("bhyn", bhbp(int ), (int)147)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ey.bhbs("bhyr", bhbz(int ), (int)428)) break;
                    v12 /* !! */  = (long)ey.bhbs("bhys", bhbz(int ), (int)429);
                }
                v13 /* !! */  = ey.dh;
                if (true) ** GOTO lbl107
                block70: while (true) {
                    v13 /* !! */  = (long)(ey.bhbs("bhyu", bhbp(int ), (int)149) - ey.bhbs("bhyt", bhbp(int ), (int)148));
lbl107:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -640036788: {
                            continue block70;
                        }
                        case 301435918: {
                            break block70;
                        }
                    }
                    break;
                }
                v14 = ey.mc.field_1724;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_8 = ey.dh - ey.bhbs("bhyw", bhbp(int ), (int)150)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ey.bhbs("bhyy", bhbz(int ), (int)430)) break;
                    v15 /* !! */  = (long)ey.bhbs("bhzd", bhbz(int ), (int)431);
                }
                v16 /* !! */  = ey.dh;
                if (true) ** GOTO lbl122
                block72: while (true) {
                    v16 /* !! */  = (long)(ey.bhbs("bhzg", bhbp(int ), (int)152) - ey.bhbs("bhzf", bhbp(int ), (int)151));
lbl122:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -643307222: {
                            continue block72;
                        }
                        case 301435918: {
                            break block72;
                        }
                    }
                    break;
                }
                v14.method_6104(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_9 = ey.dh - ey.bhbs("bhzh", bhbp(int ), (int)153)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ey.bhbs("bhzj", bhbz(int ), (int)432)) break;
                    v17 /* !! */  = (long)ey.bhbs("bhzk", bhbz(int ), (int)433);
                }
                v18 = System.currentTimeMillis() + ey.bhbs("bhzm", bhbp(int ), (int)154);
                v19 /* !! */  = ey.dh;
                if (true) ** GOTO lbl139
                block74: while (true) {
                    v19 /* !! */  = (long)(v20 - ey.bhbs("bhzq", bhbp(int ), (int)155));
lbl139:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 301435918: {
                            break block74;
                        }
                        case 346635099: {
                            v20 = ey.bhbs("bhzs", bhbp(int ), (int)156);
                            continue block74;
                        }
                        case 1026449313: {
                            v20 = ey.bhbs("bhzu", bhbp(int ), (int)157);
                            continue block74;
                        }
                    }
                    break;
                }
                this.restoreAt = v18;
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_10 = ey.dh - ey.bhbs("bhzv", bhbp(int ), (int)158)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ey.bhbs("bhzw", bhbz(int ), (int)434)) break;
                    v21 /* !! */  = (long)ey.bhbs("bhzx", bhbz(int ), (int)435);
                }
                v22 /* !! */  = ey.dh;
                if (true) ** GOTO lbl159
                block76: while (true) {
                    v22 /* !! */  = (long)(v23 - ey.bhbs("bhzz", bhbp(int ), (int)159));
lbl159:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 301435918: {
                            break block76;
                        }
                        case 676337405: {
                            v23 = ey.bhbs("biae", bhbp(int ), (int)160);
                            continue block76;
                        }
                        case 793611028: {
                            v23 = ey.bhbs("biaf", bhbp(int ), (int)161);
                            continue block76;
                        }
                        case 1844571086: {
                            v23 = ey.bhbs("biah", bhbp(int ), (int)162);
                            continue block76;
                        }
                    }
                    break;
                }
                this.phase = ey$ActionPhase.WAIT_RESTORE;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("biaj", bhbz(int ), (int)436);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl180:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("biak", bhbz(int ), (int)437);
                if (!var3_1) break;
                throw null;
            }
lbl184:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ey.bhbs("bial", bhbz(int ), (int)438);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 3: {
                var2_2 /* !! */  = (int)ey.bhbs("bian", bhbz(int ), (int)439);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl194:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ey.bhbs("biar", bhbz(int ), (int)440);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("bias", bhbz(int ), (int)441);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl203:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ey.bhbs("biau", bhbz(int ), (int)442);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
lbl207:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ey.bhbs("biav", bhbz(int ), (int)443);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
lbl211:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)ey.bhbs("biaw", bhbz(int ), (int)444);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 9: {
                do {
                    var2_2 /* !! */  = (int)ey.bhbs("biax", bhbz(int ), (int)445);
                } while (!var3_1);
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ey.bhbs("bibb", bhbz(int ), (int)446);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl224:
            // 2 sources

            case 11: {
                do {
                    var2_2 /* !! */  = (int)ey.bhbs("bibg", bhbz(int ), (int)447);
                } while (!var3_1);
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ey.bhbs("bibi", bhbz(int ), (int)448);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey.bhbs("bibl", bhbz(int ), (int)449);
                    if (!var3_1) ** GOTO lbl203
                    throw null;
                }
            }
            case 14: {
                var2_2 /* !! */  = (int)ey.bhbs("bibn", bhbz(int ), (int)450);
                if (!var3_1) break;
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)ey.bhbs("bibo", bhbz(int ), (int)451);
                if (!var3_1) ** GOTO lbl224
                throw null;
            }
lbl247:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)ey.bhbs("bibr", bhbz(int ), (int)452);
                if (!var3_1) ** GOTO lbl203
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)ey.bhbs("bibw", bhbz(int ), (int)453);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
            case 18: 
        }
        var2_2 /* !! */  = (int)ey.bhbs("bicd", bhbz(int ), (int)454);
        ** while (!var3_1)
lbl258:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block90: {
            block89: {
                var12_2 = ey.c;
                var11_3 /* !! */  = ey.b;
                var10_4 = ey.a;
                if (var12_2) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var10_4 || var10_4) ** GOTO lbl6
                this.tryHalfTickUse();
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!this.displayStun.isValue()) break block89;
                if (var10_4) ** GOTO lbl6
                if (this.stunAreas.isEmpty()) break block89;
                if (var10_4) ** GOTO lbl6
                if (ey.mc.field_1687 != null) break block90;
                if (var10_4) ** GOTO lbl6
            }
            if (var10_4 || var10_4) ** GOTO lbl6
            return;
        }
        if (var10_4 || var10_4) ** GOTO lbl6
        var2_5 = System.currentTimeMillis();
        if (var10_4 || var10_4) ** GOTO lbl6
        var4_6 = lv.getCameraPos();
        if (var10_4 || var10_4) ** GOTO lbl6
        ls.begin((boolean)ey.bhbs("bhjh", bhbz(int ), (int)181));
        if (var10_4 || var10_4) ** GOTO lbl6
        lv.begin((boolean)ey.bhbs("bhji", bhbz(int ), (int)182));
        if (var10_4 || var10_4) ** GOTO lbl6
        var5_7 = ey.bhbs("bhjj", bhbz(int ), (int)183);
        if (var10_4) ** GOTO lbl6
        block47: while (true) {
            if (var10_4 || var10_4) ** GOTO lbl6
            if (var5_7 >= this.stunAreas.size()) ** GOTO lbl53
            if (var10_4 || var10_4) ** GOTO lbl6
            var6_8 = this.stunAreas.get((int)var5_7);
            if (var10_4 || var10_4) ** GOTO lbl6
            var7_9 = Math.max(0.0f, (float)(var6_8.expiresAt - var2_5) / ey.bhbs("bhjl", bhjk(int ), (int)184));
            if (var10_4 || var10_4) ** GOTO lbl6
            var8_10 = nd.getClientColor((int)ey.bhbs("bhjm", bhbz(int ), (int)185));
            if (var10_4 || var10_4) ** GOTO lbl6
            var9_11 = ey.bhbs("bhjn", bhjk(int ), (int)186) + var7_9 * ey.bhbs("bhjo", bhjk(int ), (int)187);
            if (var10_4 || var10_4) ** GOTO lbl6
            this.drawStunSquare(var6_8.position, var4_6, var8_10, (float)var9_11);
            if (var10_4 || var10_4) ** GOTO lbl6
            ++var5_7;
            if (var10_4) ** GOTO lbl6
            if (var11_3 /* !! */  == 0) continue;
            switch (var11_3 /* !! */ ) {
                default: {
                    if (!var12_2) continue block47;
                    throw null;
                }
lbl53:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                ls.end();
                if (var10_4 || var10_4) ** GOTO lbl6
                lv.end();
                if (!var10_4 && !var10_4) ** break;
                ** continue;
                return;
lbl60:
                // 2 sources

                case 0: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjp", bhbz(int ), (int)188);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
lbl65:
                // 2 sources

                case 1: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjq", bhbz(int ), (int)189);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl100
                }
                case 2: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjr", bhbz(int ), (int)190);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 3: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjs", bhbz(int ), (int)191);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
lbl80:
                // 2 sources

                case 4: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjt", bhbz(int ), (int)192);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
lbl85:
                // 2 sources

                case 5: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhju", bhbz(int ), (int)193);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl90:
                // 2 sources

                case 6: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjv", bhbz(int ), (int)194);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl205
                }
lbl95:
                // 2 sources

                case 7: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjw", bhbz(int ), (int)195);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl105
                }
lbl100:
                // 3 sources

                case 8: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjx", bhbz(int ), (int)196);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl110
                }
lbl105:
                // 3 sources

                case 9: {
                    do {
                        var11_3 /* !! */  = (int)ey.bhbs("bhjy", bhbz(int ), (int)197);
                    } while (!var12_2);
                    throw null;
                }
lbl110:
                // 2 sources

                case 10: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhjz", bhbz(int ), (int)198);
                    if (!var12_2) break block47;
                    throw null;
                }
lbl114:
                // 4 sources

                case 11: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhka", bhbz(int ), (int)199);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl181
                }
                case 12: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkb", bhbz(int ), (int)200);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 13: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkc", bhbz(int ), (int)201);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                }
                case 14: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkd", bhbz(int ), (int)202);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 15: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhke", bhbz(int ), (int)203);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
                case 16: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkf", bhbz(int ), (int)204);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl144:
                // 2 sources

                case 17: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkg", bhbz(int ), (int)205);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl218
                }
lbl149:
                // 4 sources

                case 18: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkh", bhbz(int ), (int)206);
                    if (!var12_2) ** GOTO lbl114
                    throw null;
                }
lbl153:
                // 4 sources

                case 19: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhki", bhbz(int ), (int)207);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
                case 20: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkj", bhbz(int ), (int)208);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
                case 21: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkk", bhbz(int ), (int)209);
                    if (!var12_2) ** GOTO lbl90
                    throw null;
                }
                case 22: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkl", bhbz(int ), (int)210);
                    if (!var12_2) ** GOTO lbl80
                    throw null;
                }
lbl171:
                // 2 sources

                case 23: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkm", bhbz(int ), (int)211);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl176:
                // 3 sources

                case 24: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkn", bhbz(int ), (int)212);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
lbl181:
                // 2 sources

                case 25: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhko", bhbz(int ), (int)213);
                    if (!var12_2) ** GOTO lbl149
                    throw null;
                }
lbl185:
                // 4 sources

                case 26: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkp", bhbz(int ), (int)214);
                    if (var12_2) {
                        throw null;
                    }
                }
lbl189:
                // 5 sources

                case 27: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkq", bhbz(int ), (int)215);
                    if (!var12_2) ** GOTO lbl60
                    throw null;
                }
                case 28: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkr", bhbz(int ), (int)216);
                    if (!var12_2) ** GOTO lbl185
                    throw null;
                }
lbl197:
                // 2 sources

                case 29: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhks", bhbz(int ), (int)217);
                    if (!var12_2) ** GOTO lbl85
                    throw null;
                }
lbl201:
                // 2 sources

                case 30: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkt", bhbz(int ), (int)218);
                    if (!var12_2) ** GOTO lbl105
                    throw null;
                }
lbl205:
                // 2 sources

                case 31: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhku", bhbz(int ), (int)219);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
lbl210:
                // 3 sources

                case 32: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkv", bhbz(int ), (int)220);
                    if (!var12_2) ** GOTO lbl185
                    throw null;
                }
                case 33: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkw", bhbz(int ), (int)221);
                    if (!var12_2) ** GOTO lbl65
                    throw null;
                }
lbl218:
                // 2 sources

                case 34: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkx", bhbz(int ), (int)222);
                    if (!var12_2) ** GOTO lbl185
                    throw null;
                }
lbl222:
                // 3 sources

                case 35: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhky", bhbz(int ), (int)223);
                    if (!var12_2) ** GOTO lbl95
                    throw null;
                }
                case 36: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhkz", bhbz(int ), (int)224);
                    if (!var12_2) ** GOTO lbl153
                    throw null;
                }
                case 37: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhla", bhbz(int ), (int)225);
                    if (!var12_2) ** GOTO lbl210
                    throw null;
                }
                case 38: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhlb", bhbz(int ), (int)226);
                    if (!var12_2) ** GOTO lbl100
                    throw null;
                }
lbl238:
                // 2 sources

                case 39: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhlc", bhbz(int ), (int)227);
                    if (!var12_2) ** GOTO lbl201
                    throw null;
                }
lbl242:
                // 2 sources

                case 40: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhld", bhbz(int ), (int)228);
                    if (!var12_2) ** GOTO lbl176
                    throw null;
                }
                case 41: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhle", bhbz(int ), (int)229);
                    if (!var12_2) ** GOTO lbl176
                    throw null;
                }
                case 42: {
                    var11_3 /* !! */  = (int)ey.bhbs("bhlf", bhbz(int ), (int)230);
                    if (!var12_2) ** GOTO lbl189
                    throw null;
                }
                case 43: 
            }
            break;
        }
        do {
            var11_3 /* !! */  = (int)ey.bhbs("bhlg", bhbz(int ), (int)231);
        } while (!var12_2);
        throw null;
    }

    private static /* synthetic */ void biqo() {
        ey.bhcb[200] = -1117928249;
        ey.bhcb[201] = 980603048;
        ey.bhcb[202] = 826210027;
        ey.bhcb[203] = 1057037087;
        ey.bhcb[204] = -970330437;
        ey.bhcb[205] = 897053712;
        ey.bhcb[206] = -408136473;
        ey.bhcb[207] = -1899673178;
        ey.bhcb[208] = 994271534;
        ey.bhcb[209] = -2065832480;
        ey.bhcb[210] = 1779966002;
        ey.bhcb[211] = 2099940188;
        ey.bhcb[212] = 1927168382;
        ey.bhcb[213] = -287002955;
        ey.bhcb[214] = -2096179899;
        ey.bhcb[215] = 1832390995;
        ey.bhcb[216] = -1223311184;
        ey.bhcb[217] = -1353477915;
        ey.bhcb[218] = 84754607;
        ey.bhcb[219] = 134534875;
        ey.bhcb[220] = -1053890908;
        ey.bhcb[221] = 1634354588;
        ey.bhcb[222] = -1202331795;
        ey.bhcb[223] = -628286135;
        ey.bhcb[224] = -882877302;
        ey.bhcb[225] = 1288071240;
        ey.bhcb[226] = -280268675;
        ey.bhcb[227] = 1803378681;
        ey.bhcb[228] = -1691882860;
        ey.bhcb[229] = -1800817610;
        ey.bhcb[230] = -840266827;
        ey.bhcb[231] = -890633067;
        ey.bhcb[232] = -1606069808;
        ey.bhcb[233] = 798706582;
        ey.bhcb[234] = 243370441;
        ey.bhcb[235] = 1242121482;
        ey.bhcb[236] = -200622229;
        ey.bhcb[237] = 1956367768;
        ey.bhcb[238] = 517415725;
        ey.bhcb[239] = -921713205;
        ey.bhcb[240] = 941275130;
        ey.bhcb[241] = -397732498;
        ey.bhcb[242] = -2102075434;
        ey.bhcb[243] = 444346361;
        ey.bhcb[244] = 973465333;
        ey.bhcb[245] = 1033315524;
        ey.bhcb[246] = 1192498262;
        ey.bhcb[247] = -210933968;
        ey.bhcb[248] = 145474360;
        ey.bhcb[249] = -1121526515;
        ey.bhcb[250] = 1351364710;
        ey.bhcb[251] = -186266366;
        ey.bhcb[252] = -756867124;
        ey.bhcb[253] = -1345130692;
        ey.bhcb[254] = 1930167186;
        ey.bhcb[255] = 719676734;
        ey.bhcb[256] = 1691384619;
        ey.bhcb[257] = 1600618645;
        ey.bhcb[258] = -1305280447;
        ey.bhcb[259] = -1251991051;
        ey.bhcb[260] = 1019046537;
        ey.bhcb[261] = -2105676022;
        ey.bhcb[262] = 1165095927;
        ey.bhcb[263] = -1803749853;
        ey.bhcb[264] = -1615262677;
        ey.bhcb[265] = 322909274;
        ey.bhcb[266] = 146194906;
        ey.bhcb[267] = -2079231434;
        ey.bhcb[268] = -1402493176;
        ey.bhcb[269] = 1713155451;
        ey.bhcb[270] = -2004910583;
        ey.bhcb[271] = 6332004;
        ey.bhcb[272] = -2051573703;
        ey.bhcb[273] = -738096148;
        ey.bhcb[274] = 2049248235;
        ey.bhcb[275] = 1364939540;
        ey.bhcb[276] = -1327549342;
        ey.bhcb[277] = -715911097;
        ey.bhcb[278] = 1959878619;
        ey.bhcb[279] = -981626292;
        ey.bhcb[280] = 452412130;
        ey.bhcb[281] = 1246154849;
        ey.bhcb[282] = 729025927;
        ey.bhcb[283] = 608082295;
        ey.bhcb[284] = -615029180;
        ey.bhcb[285] = 1157736619;
        ey.bhcb[286] = -1992235141;
        ey.bhcb[287] = 130665320;
        ey.bhcb[288] = -1119750149;
        ey.bhcb[289] = -1591877670;
        ey.bhcb[290] = -859798536;
        ey.bhcb[291] = -2050115938;
        ey.bhcb[292] = -564483250;
        ey.bhcb[293] = -2142347062;
        ey.bhcb[294] = -710690038;
        ey.bhcb[295] = -398541879;
        ey.bhcb[296] = 886180753;
        ey.bhcb[297] = 683612300;
        ey.bhcb[298] = 2030971285;
        ey.bhcb[299] = -1271506300;
    }

    private static /* synthetic */ void biqt() {
        ey.bhcb[400] = -1821821256;
        ey.bhcb[401] = 2051247140;
        ey.bhcb[402] = -279787352;
        ey.bhcb[403] = 844213727;
        ey.bhcb[404] = 1327203008;
        ey.bhcb[405] = 106983273;
        ey.bhcb[406] = -11570703;
        ey.bhcb[407] = -1757386080;
        ey.bhcb[408] = 1158676374;
        ey.bhcb[409] = 562319491;
        ey.bhcb[410] = -298507947;
        ey.bhcb[411] = -888985502;
        ey.bhcb[412] = 1163181385;
        ey.bhcb[413] = 1230504405;
        ey.bhcb[414] = -1081435416;
        ey.bhcb[415] = -451241289;
        ey.bhcb[416] = -251648952;
        ey.bhcb[417] = 2137359386;
        ey.bhcb[418] = -1470014317;
        ey.bhcb[419] = 575489172;
        ey.bhcb[420] = -440163686;
        ey.bhcb[421] = -894369069;
        ey.bhcb[422] = 761777665;
        ey.bhcb[423] = -1041805454;
        ey.bhcb[424] = 236238505;
        ey.bhcb[425] = -1707037093;
        ey.bhcb[426] = 1071302593;
        ey.bhcb[427] = 489831439;
        ey.bhcb[428] = 1992267934;
        ey.bhcb[429] = 1067764475;
        ey.bhcb[430] = 887945250;
        ey.bhcb[431] = -1302771097;
        ey.bhcb[432] = 1233080064;
        ey.bhcb[433] = -373058653;
        ey.bhcb[434] = -219653119;
        ey.bhcb[435] = -1892646969;
        ey.bhcb[436] = 1899057349;
        ey.bhcb[437] = 216178184;
        ey.bhcb[438] = -360351445;
        ey.bhcb[439] = -638877927;
        ey.bhcb[440] = -1427920348;
        ey.bhcb[441] = 1184879427;
        ey.bhcb[442] = -946260476;
        ey.bhcb[443] = 1423133667;
        ey.bhcb[444] = -1480211135;
        ey.bhcb[445] = 1133461941;
        ey.bhcb[446] = -2042934550;
        ey.bhcb[447] = 33673767;
        ey.bhcb[448] = 1597095094;
        ey.bhcb[449] = 1209160845;
        ey.bhcb[450] = 475670643;
        ey.bhcb[451] = -1701490351;
        ey.bhcb[452] = 429197806;
        ey.bhcb[453] = -1553934961;
        ey.bhcb[454] = 839012229;
        ey.bhcb[455] = -1309387169;
        ey.bhcb[456] = -1403176112;
        ey.bhcb[457] = -1875619285;
        ey.bhcb[458] = 1224138046;
        ey.bhcb[459] = 1667064606;
        ey.bhcb[460] = -1097685674;
        ey.bhcb[461] = 50801854;
        ey.bhcb[462] = 1196306771;
        ey.bhcb[463] = -928636700;
        ey.bhcb[464] = 2063435815;
        ey.bhcb[465] = 1240730329;
        ey.bhcb[466] = -2086325423;
        ey.bhcb[467] = -1107091846;
        ey.bhcb[468] = -586639720;
        ey.bhcb[469] = -1798716926;
        ey.bhcb[470] = 2065245622;
        ey.bhcb[471] = -1692660419;
        ey.bhcb[472] = -1115055230;
        ey.bhcb[473] = 1033161674;
        ey.bhcb[474] = 1555141399;
        ey.bhcb[475] = -1700382257;
        ey.bhcb[476] = 2030050075;
        ey.bhcb[477] = -201241701;
        ey.bhcb[478] = -1636410283;
        ey.bhcb[479] = -431109646;
        ey.bhcb[480] = -221062107;
        ey.bhcb[481] = -1505126970;
        ey.bhcb[482] = -532100420;
        ey.bhcb[483] = -918515394;
        ey.bhcb[484] = -2072037211;
        ey.bhcb[485] = -840563077;
        ey.bhcb[486] = 1374632298;
        ey.bhcb[487] = -499524794;
        ey.bhcb[488] = 1729977731;
        ey.bhcb[489] = 843929670;
        ey.bhcb[490] = -1013392071;
        ey.bhcb[491] = 870224593;
        ey.bhcb[492] = 800385722;
        ey.bhcb[493] = -1148627257;
        ey.bhcb[494] = 1129423267;
        ey.bhcb[495] = 1987035018;
        ey.bhcb[496] = -1721963456;
        ey.bhcb[497] = 1042953169;
        ey.bhcb[498] = 644002483;
        ey.bhcb[499] = 1785095128;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$onPacket$1(class_243 var0, ey$StunArea var1_1) {
        v0 /* !! */  = ey.dh;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(ey.bhbs("bilu", bhbp(int ), (int)256) - ey.bhbs("bilt", bhbp(int ), (int)255));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1048002610: {
                    continue block28;
                }
                case 301435918: {
                    break block28;
                }
            }
            break;
        }
        var4_2 = ey.c;
        v1 /* !! */  = ey.dh;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - ey.bhbs("bilv", bhbp(int ), (int)257));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1026120069: {
                    v2 = ey.bhbs("bilw", bhbp(int ), (int)258);
                    continue block29;
                }
                case 158415056: {
                    v2 = ey.bhbs("bilz", bhbp(int ), (int)259);
                    continue block29;
                }
                case 301435918: {
                    break block29;
                }
            }
            break;
        }
        var3_3 /* !! */  = ey.b;
        v3 /* !! */  = ey.dh;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(ey.bhbs("bimd", bhbp(int ), (int)261) - ey.bhbs("bimb", bhbp(int ), (int)260));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 301435918: {
                    break block30;
                }
                case 864282248: {
                    continue block30;
                }
            }
            break;
        }
        var2_4 = ey.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return (boolean)ey.bhbs("bime", bhbz(int ), (int)561);
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ey.dh;
                if (true) ** GOTO lbl47
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - ey.bhbs("bimg", bhbp(int ), (int)262));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2114378487: {
                            v5 = ey.bhbs("bimi", bhbp(int ), (int)263);
                            continue block32;
                        }
                        case 24557673: {
                            v5 = ey.bhbs("bimj", bhbp(int ), (int)264);
                            continue block32;
                        }
                        case 301435918: {
                            break block32;
                        }
                    }
                    break;
                }
                v6 = var1_1.position;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("biml", bhbp(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ey.bhbs("bimm", bhbz(int ), (int)562)) break;
                    v7 /* !! */  = (long)ey.bhbs("bimn", bhbz(int ), (int)563);
                }
                if (!(v6.method_1025(var0) < 1.0)) ** GOTO lbl69
                if (var2_4) ** GOTO lbl37
                v8 = ey.bhbs("bimo", bhbz(int ), (int)564);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl72
lbl69:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v8 = ey.bhbs("bimp", bhbz(int ), (int)565);
lbl72:
                // 2 sources

                return (boolean)v8;
            }
lbl73:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ey.bhbs("bimq", bhbz(int ), (int)566);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ey.bhbs("bimr", bhbz(int ), (int)567);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 2: {
                var3_3 /* !! */  = (int)ey.bhbs("bimt", bhbz(int ), (int)568);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ey.bhbs("bimv", bhbz(int ), (int)569);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)ey.bhbs("bimw", bhbz(int ), (int)570);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
lbl95:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ey.bhbs("bimy", bhbz(int ), (int)571);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
lbl99:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ey.bhbs("bina", bhbz(int ), (int)572);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
            case 7: 
        }
        do {
            var3_3 /* !! */  = (int)ey.bhbs("binb", bhbz(int ), (int)573);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreItem() {
        block70: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bick", bhbp(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ey.bhbs("bicl", bhbz(int ), (int)455)) break;
                v0 /* !! */  = (long)ey.bhbs("bicm", bhbz(int ), (int)456);
            }
            var3_1 = ey.c;
            v1 /* !! */  = ey.dh;
            if (true) ** GOTO lbl12
            block46: while (true) {
                v1 /* !! */  = (long)(v2 - ey.bhbs("bicn", bhbp(int ), (int)164));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1277564650: {
                        v2 = ey.bhbs("bico", bhbp(int ), (int)165);
                        continue block46;
                    }
                    case -271045823: {
                        v2 = ey.bhbs("bicp", bhbp(int ), (int)166);
                        continue block46;
                    }
                    case 301435918: {
                        break block46;
                    }
                    case 1233365694: {
                        v2 = ey.bhbs("bicq", bhbp(int ), (int)167);
                        continue block46;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ey.b;
            v3 /* !! */  = ey.dh;
            if (true) ** GOTO lbl29
            block47: while (true) {
                v3 /* !! */  = (long)(ey.bhbs("bics", bhbp(int ), (int)169) - ey.bhbs("bicr", bhbp(int ), (int)168));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 301435918: {
                        break block47;
                    }
                    case 1747760082: {
                        continue block47;
                    }
                }
                break;
            }
            var1_3 = ey.a;
            if (var3_1) {
                throw null;
lbl37:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl37
            v4 /* !! */  = ey.dh;
            if (true) ** GOTO lbl44
            block49: while (true) {
                v4 /* !! */  = (long)(v5 - ey.bhbs("bict", bhbp(int ), (int)170));
lbl44:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1839786401: {
                        v5 = ey.bhbs("bicu", bhbp(int ), (int)171);
                        continue block49;
                    }
                    case 301435918: {
                        break block49;
                    }
                    case 1205340139: {
                        v5 = ey.bhbs("bicv", bhbp(int ), (int)172);
                        continue block49;
                    }
                }
                break;
            }
            v6 /* !! */  = ey.dh;
            if (true) ** GOTO lbl57
            block50: while (true) {
                v6 /* !! */  = (long)(v7 - ey.bhbs("bicw", bhbp(int ), (int)173));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -409786655: {
                        v7 = ey.bhbs("bicx", bhbp(int ), (int)174);
                        continue block50;
                    }
                    case 301435918: {
                        break block50;
                    }
                    case 1155977372: {
                        v7 = ey.bhbs("bicy", bhbp(int ), (int)175);
                        continue block50;
                    }
                }
                break;
            }
            nv.selectSlotSilent(this.previousSlot);
            if (var1_3 || var1_3) ** GOTO lbl37
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bicz", bhbp(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == ey.bhbs("bida", bhbz(int ), (int)457)) break;
                v8 /* !! */  = (long)ey.bhbs("bidb", bhbz(int ), (int)458);
            }
            if (this.fromHotbar) break block70;
            if (var1_3 || var1_3) ** GOTO lbl37
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bidc", bhbp(int ), (int)177)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == ey.bhbs("bidd", bhbz(int ), (int)459)) break;
                v9 /* !! */  = (long)ey.bhbs("bide", bhbz(int ), (int)460);
            }
            v10 /* !! */  = ey.dh;
            if (true) ** GOTO lbl86
            block53: while (true) {
                v10 /* !! */  = (long)(v11 - ey.bhbs("bidf", bhbp(int ), (int)178));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1575690746: {
                        v11 = ey.bhbs("bidg", bhbp(int ), (int)179);
                        continue block53;
                    }
                    case -812069755: {
                        v11 = ey.bhbs("bidh", bhbp(int ), (int)180);
                        continue block53;
                    }
                    case 301435918: {
                        break block53;
                    }
                    case 870812920: {
                        v11 = ey.bhbs("bidi", bhbp(int ), (int)181);
                        continue block53;
                    }
                }
                break;
            }
            v12 /* !! */  = ey.dh;
            if (true) ** GOTO lbl102
            block54: while (true) {
                v12 /* !! */  = (long)(v13 - ey.bhbs("bidj", bhbp(int ), (int)182));
lbl102:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -11050789: {
                        v13 = ey.bhbs("bidk", bhbp(int ), (int)183);
                        continue block54;
                    }
                    case 301435918: {
                        break block54;
                    }
                    case 615132823: {
                        v13 = ey.bhbs("bidl", bhbp(int ), (int)184);
                        continue block54;
                    }
                    case 2055573976: {
                        v13 = ey.bhbs("bidm", bhbp(int ), (int)185);
                        continue block54;
                    }
                }
                break;
            }
            nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
            if (var1_3) ** GOTO lbl37
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("bidn", bhbz(int ), (int)461);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl128:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("bido", bhbz(int ), (int)462);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl133:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey.bhbs("bidp", bhbz(int ), (int)463);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
lbl139:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ey.bhbs("bidq", bhbz(int ), (int)464);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl144:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ey.bhbs("bidr", bhbz(int ), (int)465);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl148:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("bids", bhbz(int ), (int)466);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
lbl152:
            // 3 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ey.bhbs("bidt", bhbz(int ), (int)467);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ey.bhbs("bidu", bhbz(int ), (int)468);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ey.bhbs("bidv", bhbz(int ), (int)469);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl165:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ey.bhbs("bidw", bhbz(int ), (int)470);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ey.bhbs("bidx", bhbz(int ), (int)471);
        ** while (!var3_1)
lbl172:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float bhjk(int n2) {
        return Float.intBitsToFloat(bhca[n2] ^ bhcb[n2]);
    }

    private static /* synthetic */ void biqz() {
        ey.bhbr[100] = 878812287794344378L;
        ey.bhbr[101] = -8058703176104580939L;
        ey.bhbr[102] = 6829678368743629366L;
        ey.bhbr[103] = 7924490931427701036L;
        ey.bhbr[104] = -5510351620232114275L;
        ey.bhbr[105] = -530013462748300216L;
        ey.bhbr[106] = 2972412381208353550L;
        ey.bhbr[107] = -4147502075244429564L;
        ey.bhbr[108] = 2954372923366728565L;
        ey.bhbr[109] = 990357576364799847L;
        ey.bhbr[110] = -7289606095910858705L;
        ey.bhbr[111] = 4589542023633399563L;
        ey.bhbr[112] = -7056891480534450378L;
        ey.bhbr[113] = -2084157347444237593L;
        ey.bhbr[114] = -885183675357055467L;
        ey.bhbr[115] = 2707855711982633968L;
        ey.bhbr[116] = 3534618380527882724L;
        ey.bhbr[117] = -5078260791641930327L;
        ey.bhbr[118] = 2680900927899055839L;
        ey.bhbr[119] = 3790968768571382388L;
        ey.bhbr[120] = 8588998330539741818L;
        ey.bhbr[121] = 1714160047484448721L;
        ey.bhbr[122] = -6863172144844820043L;
        ey.bhbr[123] = 7404496626998239278L;
        ey.bhbr[124] = 3885919342691266003L;
        ey.bhbr[125] = -5086067168743079422L;
        ey.bhbr[126] = -2574299606157055442L;
        ey.bhbr[127] = -6588114316551915978L;
        ey.bhbr[128] = -8792920051297875188L;
        ey.bhbr[129] = -3322243138610816576L;
        ey.bhbr[130] = -3321859038716059215L;
        ey.bhbr[131] = -4746649102329998049L;
        ey.bhbr[132] = 8769024442125457910L;
        ey.bhbr[133] = -7579063363792280898L;
        ey.bhbr[134] = -5300959731146592327L;
        ey.bhbr[135] = 6217431852924044388L;
        ey.bhbr[136] = 7670249082867340799L;
        ey.bhbr[137] = 4896409527451834698L;
        ey.bhbr[138] = -9141652316316969607L;
        ey.bhbr[139] = 1196570613127667403L;
        ey.bhbr[140] = 1687269617450768279L;
        ey.bhbr[141] = -4403789304122707676L;
        ey.bhbr[142] = -4319603175352595718L;
        ey.bhbr[143] = -3943261372676981853L;
        ey.bhbr[144] = -4647889311953363433L;
        ey.bhbr[145] = -8993122022419248995L;
        ey.bhbr[146] = -8075562677814535605L;
        ey.bhbr[147] = -672917643929720322L;
        ey.bhbr[148] = -6738402232559730823L;
        ey.bhbr[149] = -8410433519914408534L;
        ey.bhbr[150] = -6102009154865457816L;
        ey.bhbr[151] = 5553755657233463201L;
        ey.bhbr[152] = 1869408294911393062L;
        ey.bhbr[153] = 8845424977842323885L;
        ey.bhbr[154] = -1597860534184951417L;
        ey.bhbr[155] = 380150198145982411L;
        ey.bhbr[156] = -6783421729848343901L;
        ey.bhbr[157] = -1227712800387408805L;
        ey.bhbr[158] = 3158190961242441009L;
        ey.bhbr[159] = 1500785776045090210L;
        ey.bhbr[160] = -8100029627621025444L;
        ey.bhbr[161] = -7570481948869035925L;
        ey.bhbr[162] = -4602466158857691992L;
        ey.bhbr[163] = 3414511099285674235L;
        ey.bhbr[164] = -6728158295634688602L;
        ey.bhbr[165] = -7608152075957930371L;
        ey.bhbr[166] = -5444792281964210745L;
        ey.bhbr[167] = -5579270997703635033L;
        ey.bhbr[168] = 3246911810778219735L;
        ey.bhbr[169] = 5360417647779176714L;
        ey.bhbr[170] = 7306480938462180547L;
        ey.bhbr[171] = 3091500486298656633L;
        ey.bhbr[172] = 8673519000517777410L;
        ey.bhbr[173] = -1159629789384350571L;
        ey.bhbr[174] = -6958536183498315543L;
        ey.bhbr[175] = -7429836094859171781L;
        ey.bhbr[176] = -2236805175853809091L;
        ey.bhbr[177] = 3033704950214618378L;
        ey.bhbr[178] = -750941937932978254L;
        ey.bhbr[179] = 53648324045623383L;
        ey.bhbr[180] = -6352172536547153336L;
        ey.bhbr[181] = -1004614684689737051L;
        ey.bhbr[182] = 2121739123872361502L;
        ey.bhbr[183] = 6067022084377206502L;
        ey.bhbr[184] = 8960424109288107676L;
        ey.bhbr[185] = 1757840995640438521L;
        ey.bhbr[186] = -8913824293134712099L;
        ey.bhbr[187] = 491652703285642420L;
        ey.bhbr[188] = 2306632156092002852L;
        ey.bhbr[189] = -1631302790273820666L;
        ey.bhbr[190] = 5348233104102239180L;
        ey.bhbr[191] = -5004886010082392132L;
        ey.bhbr[192] = -3796003373121219482L;
        ey.bhbr[193] = -4103388488880907064L;
        ey.bhbr[194] = -2801570833706329108L;
        ey.bhbr[195] = -7575100987150884073L;
        ey.bhbr[196] = 2202803590549794877L;
        ey.bhbr[197] = -4268054276989624433L;
        ey.bhbr[198] = -7630108166155722077L;
        ey.bhbr[199] = -6807663789957654421L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreMovement() {
        v0 /* !! */  = ey.dh;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - ey.bhbs("bidy", bhbp(int ), (int)186));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1433954998: {
                    v1 = ey.bhbs("bidz", bhbp(int ), (int)187);
                    continue block27;
                }
                case -1823599: {
                    v1 = ey.bhbs("biea", bhbp(int ), (int)188);
                    continue block27;
                }
                case 301435918: {
                    break block27;
                }
                case 674350403: {
                    v1 = ey.bhbs("bieb", bhbp(int ), (int)189);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = ey.c;
        v2 /* !! */  = ey.dh;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(ey.bhbs("bied", bhbp(int ), (int)191) - ey.bhbs("biec", bhbp(int ), (int)190));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -96446734: {
                    continue block28;
                }
                case 301435918: {
                    break block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = ey.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("biee", bhbp(int ), (int)192)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ey.bhbs("bief", bhbz(int ), (int)472)) break;
            v3 /* !! */  = (long)ey.bhbs("bieg", bhbz(int ), (int)473);
        }
        var1_3 = ey.a;
        if (var3_1) {
            throw null;
lbl37:
            // 5 sources

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
                    if ((v4 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bieh", bhbp(int ), (int)193)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ey.bhbs("biei", bhbz(int ), (int)474)) break;
                    v4 /* !! */  = (long)ey.bhbs("biej", bhbz(int ), (int)475);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("biek", bhbp(int ), (int)194)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ey.bhbs("biel", bhbz(int ), (int)476)) break;
                    v5 /* !! */  = (long)ey.bhbs("biem", bhbz(int ), (int)477);
                }
                if (!this.movement.isBlocked()) ** GOTO lbl82
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bien", bhbp(int ), (int)195)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ey.bhbs("bieo", bhbz(int ), (int)478)) break;
                    v6 /* !! */  = (long)ey.bhbs("biep", bhbz(int ), (int)479);
                }
                v7 /* !! */  = ey.dh;
                if (true) ** GOTO lbl68
                block34: while (true) {
                    v7 /* !! */  = (long)(v8 - ey.bhbs("bieq", bhbp(int ), (int)196));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -951852802: {
                            v8 = ey.bhbs("bier", bhbp(int ), (int)197);
                            continue block34;
                        }
                        case -7669440: {
                            v8 = ey.bhbs("bies", bhbp(int ), (int)198);
                            continue block34;
                        }
                        case 301435918: {
                            break block34;
                        }
                        case 1750084506: {
                            v8 = ey.bhbs("biet", bhbp(int ), (int)199);
                            continue block34;
                        }
                    }
                    break;
                }
                this.movement.restoreFromCurrent();
                if (var1_3) ** GOTO lbl37
lbl82:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("bieu", bhbz(int ), (int)480);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl90:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("biev", bhbz(int ), (int)481);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ey.bhbs("biew", bhbz(int ), (int)482);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
lbl98:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)ey.bhbs("biex", bhbz(int ), (int)483);
                } while (!var3_1);
                throw null;
            }
lbl103:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ey.bhbs("biey", bhbz(int ), (int)484);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("biez", bhbz(int ), (int)485);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ey.bhbs("bifa", bhbz(int ), (int)486);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ey.bhbs("bifb", bhbz(int ), (int)487);
                if (!var3_1) break;
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)ey.bhbs("bifc", bhbz(int ), (int)488);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1792 getBoundItem(cn var1_1) {
        block140: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bhon", bhbp(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ey.bhbs("bhoo", bhbz(int ), (int)297)) break;
                v0 /* !! */  = (long)ey.bhbs("bhop", bhbz(int ), (int)298);
            }
            var4_2 = ey.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bhoq", bhbp(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ey.bhbs("bhor", bhbz(int ), (int)299)) break;
                v1 /* !! */  = (long)ey.bhbs("bhos", bhbz(int ), (int)300);
            }
            var3_3 /* !! */  = ey.b;
            v2 /* !! */  = ey.dh;
            if (true) ** GOTO lbl19
            block87: while (true) {
                v2 /* !! */  = (long)(v3 - ey.bhbs("bhot", bhbp(int ), (int)32));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -384290241: {
                        v3 = ey.bhbs("bhou", bhbp(int ), (int)33);
                        continue block87;
                    }
                    case 301435918: {
                        break block87;
                    }
                    case 382449037: {
                        v3 = ey.bhbs("bhov", bhbp(int ), (int)34);
                        continue block87;
                    }
                    case 1155894012: {
                        v3 = ey.bhbs("bhow", bhbp(int ), (int)35);
                        continue block87;
                    }
                }
                break;
            }
            var2_4 = ey.a;
            if (var4_2) {
                throw null;
lbl34:
                // 13 sources

                return null;
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bhox", bhbp(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ey.bhbs("bhoy", bhbz(int ), (int)301)) break;
                v4 /* !! */  = (long)ey.bhbs("bhoz", bhbz(int ), (int)302);
            }
            v5 /* !! */  = ey.dh;
            if (true) ** GOTO lbl47
            block90: while (true) {
                v5 /* !! */  = (long)(ey.bhbs("bhpb", bhbp(int ), (int)38) - ey.bhbs("bhpa", bhbp(int ), (int)37));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1924286200: {
                        continue block90;
                    }
                    case 301435918: {
                        break block90;
                    }
                }
                break;
            }
            if (!var1_1.isBindReleased(this.thing)) break block140;
            if (var2_4) ** GOTO lbl34
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bhpc", bhbp(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ey.bhbs("bhpd", bhbz(int ), (int)303)) break;
                v6 /* !! */  = (long)ey.bhbs("bhpe", bhbz(int ), (int)304);
            }
            return class_1802.field_8814;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl34
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bhpf", bhbp(int ), (int)40)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ey.bhbs("bhpg", bhbz(int ), (int)305)) break;
                    v7 /* !! */  = (long)ey.bhbs("bhph", bhbz(int ), (int)306);
                }
                v8 /* !! */  = ey.dh;
                if (true) ** GOTO lbl76
                block93: while (true) {
                    v8 /* !! */  = (long)(v9 - ey.bhbs("bhpi", bhbp(int ), (int)41));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1598668110: {
                            v9 = ey.bhbs("bhpj", bhbp(int ), (int)42);
                            continue block93;
                        }
                        case -638462667: {
                            v9 = ey.bhbs("bhpk", bhbp(int ), (int)43);
                            continue block93;
                        }
                        case 38389227: {
                            v9 = ey.bhbs("bhpl", bhbp(int ), (int)44);
                            continue block93;
                        }
                        case 301435918: {
                            break block93;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.stun)) ** GOTO lbl104
                if (var2_4) ** GOTO lbl34
                v10 /* !! */  = ey.dh;
                if (true) ** GOTO lbl94
                block94: while (true) {
                    v10 /* !! */  = (long)(v11 - ey.bhbs("bhpm", bhbp(int ), (int)45));
lbl94:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1619074597: {
                            v11 = ey.bhbs("bhpn", bhbp(int ), (int)46);
                            continue block94;
                        }
                        case 126917274: {
                            v11 = ey.bhbs("bhpo", bhbp(int ), (int)47);
                            continue block94;
                        }
                        case 301435918: {
                            break block94;
                        }
                    }
                    break;
                }
                return class_1802.field_8137;
lbl104:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                v12 /* !! */  = ey.dh;
                if (true) ** GOTO lbl109
                block95: while (true) {
                    v12 /* !! */  = (long)(ey.bhbs("bhpq", bhbp(int ), (int)49) - ey.bhbs("bhpp", bhbp(int ), (int)48));
lbl109:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1808068912: {
                            continue block95;
                        }
                        case 301435918: {
                            break block95;
                        }
                    }
                    break;
                }
                v13 /* !! */  = ey.dh;
                if (true) ** GOTO lbl118
                block96: while (true) {
                    v13 /* !! */  = (long)(v14 - ey.bhbs("bhpr", bhbp(int ), (int)50));
lbl118:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -768564848: {
                            v14 = ey.bhbs("bhps", bhbp(int ), (int)51);
                            continue block96;
                        }
                        case 301435918: {
                            break block96;
                        }
                        case 1857273876: {
                            v14 = ey.bhbs("bhpt", bhbp(int ), (int)52);
                            continue block96;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.explosiveTrap)) ** GOTO lbl146
                if (var2_4) ** GOTO lbl34
                v15 /* !! */  = ey.dh;
                if (true) ** GOTO lbl133
                block97: while (true) {
                    v15 /* !! */  = (long)(v16 - ey.bhbs("bhpu", bhbp(int ), (int)53));
lbl133:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -649461446: {
                            v16 = ey.bhbs("bhpv", bhbp(int ), (int)54);
                            continue block97;
                        }
                        case 301435918: {
                            break block97;
                        }
                        case 571646433: {
                            v16 = ey.bhbs("bhpw", bhbp(int ), (int)55);
                            continue block97;
                        }
                        case 1449314662: {
                            v16 = ey.bhbs("bhpx", bhbp(int ), (int)56);
                            continue block97;
                        }
                    }
                    break;
                }
                return class_1802.field_8662;
lbl146:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                v17 /* !! */  = ey.dh;
                if (true) ** GOTO lbl151
                block98: while (true) {
                    v17 /* !! */  = (long)(ey.bhbs("bhpz", bhbp(int ), (int)58) - ey.bhbs("bhpy", bhbp(int ), (int)57));
lbl151:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1629491692: {
                            continue block98;
                        }
                        case 301435918: {
                            break block98;
                        }
                    }
                    break;
                }
                v18 /* !! */  = ey.dh;
                if (true) ** GOTO lbl160
                block99: while (true) {
                    v18 /* !! */  = (long)(v19 - ey.bhbs("bhqa", bhbp(int ), (int)59));
lbl160:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1971583082: {
                            v19 = ey.bhbs("bhqb", bhbp(int ), (int)60);
                            continue block99;
                        }
                        case 301435918: {
                            break block99;
                        }
                        case 352782999: {
                            v19 = ey.bhbs("bhqc", bhbp(int ), (int)61);
                            continue block99;
                        }
                        case 359371036: {
                            v19 = ey.bhbs("bhqd", bhbp(int ), (int)62);
                            continue block99;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.chorusTrap)) ** GOTO lbl181
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bhqe", bhbp(int ), (int)63)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == ey.bhbs("bhqf", bhbz(int ), (int)307)) break;
                    v20 /* !! */  = (long)ey.bhbs("bhqg", bhbz(int ), (int)308);
                }
                return class_1802.field_8882;
lbl181:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = ey.dh - ey.bhbs("bhqh", bhbp(int ), (int)64)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == ey.bhbs("bhqi", bhbz(int ), (int)309)) break;
                    v21 /* !! */  = (long)ey.bhbs("bhqj", bhbz(int ), (int)310);
                }
                v22 /* !! */  = ey.dh;
                if (true) ** GOTO lbl192
                block102: while (true) {
                    v22 /* !! */  = (long)(v23 - ey.bhbs("bhqk", bhbp(int ), (int)65));
lbl192:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1463265935: {
                            v23 = ey.bhbs("bhql", bhbp(int ), (int)66);
                            continue block102;
                        }
                        case 301435918: {
                            break block102;
                        }
                        case 458619923: {
                            v23 = ey.bhbs("bhqm", bhbp(int ), (int)67);
                            continue block102;
                        }
                        case 1000182653: {
                            v23 = ey.bhbs("bhqn", bhbp(int ), (int)68);
                            continue block102;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.snowball)) ** GOTO lbl213
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = ey.dh - ey.bhbs("bhqo", bhbp(int ), (int)69)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v24 /* !! */  == ey.bhbs("bhqp", bhbz(int ), (int)311)) break;
                    v24 /* !! */  = (long)ey.bhbs("bhqq", bhbz(int ), (int)312);
                }
                return class_1802.field_8543;
lbl213:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = ey.dh - ey.bhbs("bhqr", bhbp(int ), (int)70)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v25 /* !! */  == ey.bhbs("bhqs", bhbz(int ), (int)313)) break;
                    v25 /* !! */  = (long)ey.bhbs("bhqt", bhbz(int ), (int)314);
                }
                v26 /* !! */  = ey.dh;
                if (true) ** GOTO lbl224
                block105: while (true) {
                    v26 /* !! */  = (long)(v27 - ey.bhbs("bhqu", bhbp(int ), (int)71));
lbl224:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1895875288: {
                            v27 = ey.bhbs("bhqv", bhbp(int ), (int)72);
                            continue block105;
                        }
                        case -930283872: {
                            v27 = ey.bhbs("bhqw", bhbp(int ), (int)73);
                            continue block105;
                        }
                        case -287789651: {
                            v27 = ey.bhbs("bhqx", bhbp(int ), (int)74);
                            continue block105;
                        }
                        case 301435918: {
                            break block105;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.backpack)) ** GOTO lbl245
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_9 = ey.dh - ey.bhbs("bhqy", bhbp(int ), (int)75)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v28 /* !! */  == ey.bhbs("bhqz", bhbz(int ), (int)315)) break;
                    v28 /* !! */  = (long)ey.bhbs("bhra", bhbz(int ), (int)316);
                }
                return class_1802.field_8545;
lbl245:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return null;
            }
lbl248:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrb", bhbz(int ), (int)317);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 1: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrc", bhbz(int ), (int)318);
                if (!var4_2) ** GOTO lbl248
                throw null;
            }
lbl257:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrd", bhbz(int ), (int)319);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl262:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)ey.bhbs("bhre", bhbz(int ), (int)320);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl267:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrf", bhbz(int ), (int)321);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 5: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrg", bhbz(int ), (int)322);
                if (!var4_2) ** GOTO lbl262
                throw null;
            }
lbl276:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrh", bhbz(int ), (int)323);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
            case 7: {
                var3_3 /* !! */  = (int)ey.bhbs("bhri", bhbz(int ), (int)324);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 8: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrj", bhbz(int ), (int)325);
                if (!var4_2) ** GOTO lbl267
                throw null;
            }
            case 9: {
                do {
                    var3_3 /* !! */  = (int)ey.bhbs("bhrk", bhbz(int ), (int)326);
                } while (!var4_2);
                throw null;
            }
lbl295:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrl", bhbz(int ), (int)327);
                if (!var4_2) ** GOTO lbl267
                throw null;
            }
lbl299:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrm", bhbz(int ), (int)328);
                if (!var4_2) ** GOTO lbl248
                throw null;
            }
lbl303:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrn", bhbz(int ), (int)329);
                if (var4_2) {
                    throw null;
                }
            }
lbl307:
            // 4 sources

            case 13: {
                var3_3 /* !! */  = (int)ey.bhbs("bhro", bhbz(int ), (int)330);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl312:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrp", bhbz(int ), (int)331);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl317:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrq", bhbz(int ), (int)332);
                if (!var4_2) ** GOTO lbl307
                throw null;
            }
lbl321:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrr", bhbz(int ), (int)333);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl326:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrs", bhbz(int ), (int)334);
                if (!var4_2) ** GOTO lbl276
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrt", bhbz(int ), (int)335);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 19: {
                var3_3 /* !! */  = (int)ey.bhbs("bhru", bhbz(int ), (int)336);
                if (!var4_2) ** GOTO lbl299
                throw null;
            }
lbl339:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrv", bhbz(int ), (int)337);
                if (!var4_2) ** GOTO lbl262
                throw null;
            }
lbl343:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrw", bhbz(int ), (int)338);
                if (!var4_2) ** GOTO lbl321
                throw null;
            }
lbl347:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ey.bhbs("bhrx", bhbz(int ), (int)339);
                if (!var4_2) ** GOTO lbl295
                throw null;
            }
lbl351:
            // 2 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ey.bhbs("bhry", bhbz(int ), (int)340);
                    if (!var4_2) ** GOTO lbl257
                    throw null;
                }
            }
            case 24: 
        }
        var3_3 /* !! */  = (int)ey.bhbs("bhrz", bhbz(int ), (int)341);
        ** while (!var4_2)
lbl359:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void tryHalfTickUse() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bhlh", bhbp(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ey.bhbs("bhli", bhbz(int ), (int)232)) break;
            v0 /* !! */  = (long)ey.bhbs("bhlj", bhbz(int ), (int)233);
        }
        var3_1 = ey.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bhlk", bhbp(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ey.bhbs("bhll", bhbz(int ), (int)234)) break;
            v1 /* !! */  = (long)ey.bhbs("bhlm", bhbz(int ), (int)235);
        }
        var2_2 /* !! */  = ey.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bhln", bhbp(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ey.bhbs("bhlo", bhbz(int ), (int)236)) break;
            v2 /* !! */  = (long)ey.bhbs("bhlp", bhbz(int ), (int)237);
        }
        var1_3 = ey.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl24:
                    // 6 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                v3 /* !! */  = ey.dh;
                if (true) ** GOTO lbl31
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - ey.bhbs("bhlq", bhbp(int ), (int)15));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1579976535: {
                            v4 = ey.bhbs("bhlr", bhbp(int ), (int)16);
                            continue block23;
                        }
                        case -284041846: {
                            v4 = ey.bhbs("bhls", bhbp(int ), (int)17);
                            continue block23;
                        }
                        case 301435918: {
                            break block23;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bhlt", bhbp(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ey.bhbs("bhlu", bhbz(int ), (int)238)) break;
                    v5 /* !! */  = (long)ey.bhbs("bhlv", bhbz(int ), (int)239);
                }
                if (this.phase != ey$ActionPhase.WAIT_USE_HALF) ** GOTO lbl79
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bhlw", bhbp(int ), (int)19)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ey.bhbs("bhlx", bhbz(int ), (int)240)) break;
                    v6 /* !! */  = (long)ey.bhbs("bhly", bhbz(int ), (int)241);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bhlz", bhbp(int ), (int)20)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ey.bhbs("bhma", bhbz(int ), (int)242)) break;
                    v7 /* !! */  = (long)ey.bhbs("bhmb", bhbz(int ), (int)243);
                }
                if (ey.mc.field_1724 == null) ** GOTO lbl79
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_6 = ey.dh - ey.bhbs("bhmc", bhbp(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ey.bhbs("bhmd", bhbz(int ), (int)244)) break;
                    v8 /* !! */  = (long)ey.bhbs("bhme", bhbz(int ), (int)245);
                }
                v9 = System.currentTimeMillis();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_7 = ey.dh - ey.bhbs("bhmf", bhbp(int ), (int)22)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ey.bhbs("bhmg", bhbz(int ), (int)246)) break;
                    v10 /* !! */  = (long)ey.bhbs("bhmh", bhbz(int ), (int)247);
                }
                if (v9 < this.actionAt) ** GOTO lbl79
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_8 = ey.dh - ey.bhbs("bhmi", bhbp(int ), (int)23)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ey.bhbs("bhmj", bhbz(int ), (int)248)) break;
                    v11 /* !! */  = (long)ey.bhbs("bhmk", bhbz(int ), (int)249);
                }
                this.usePreparedItem();
                if (var1_3) ** GOTO lbl24
lbl79:
                // 4 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl82:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ey.bhbs("bhml", bhbz(int ), (int)250);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmm", bhbz(int ), (int)251);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl92:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmn", bhbz(int ), (int)252);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl97:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmo", bhbz(int ), (int)253);
                if (!var3_1) break;
                throw null;
            }
lbl101:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmp", bhbz(int ), (int)254);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmq", bhbz(int ), (int)255);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl109:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmr", bhbz(int ), (int)256);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl113:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey.bhbs("bhms", bhbz(int ), (int)257);
                    if (!var3_1) ** GOTO lbl92
                    throw null;
                }
            }
lbl118:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmt", bhbz(int ), (int)258);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
lbl122:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmu", bhbz(int ), (int)259);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ey.bhbs("bhmv", bhbz(int ), (int)260);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ey.bhbs("bhmw", bhbz(int ), (int)261);
        ** while (!var3_1)
lbl133:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanup() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bifd", bhbp(int ), (int)200)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ey.bhbs("bife", bhbz(int ), (int)489)) break;
            v0 /* !! */  = (long)ey.bhbs("biff", bhbz(int ), (int)490);
        }
        var3_1 = ey.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bifg", bhbp(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ey.bhbs("bifh", bhbz(int ), (int)491)) break;
            v1 /* !! */  = (long)ey.bhbs("bifi", bhbz(int ), (int)492);
        }
        var2_2 /* !! */  = ey.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bifj", bhbp(int ), (int)202)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ey.bhbs("bifk", bhbz(int ), (int)493)) break;
            v2 /* !! */  = (long)ey.bhbs("bifl", bhbz(int ), (int)494);
        }
        var1_3 = ey.a;
        if (var3_1) {
            throw null;
lbl21:
            // 10 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v3 /* !! */  = ey.dh;
        if (true) ** GOTO lbl28
        block54: while (true) {
            v3 /* !! */  = (long)(v4 - ey.bhbs("bifm", bhbp(int ), (int)203));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 301435918: {
                    break block54;
                }
                case 575896363: {
                    v4 = ey.bhbs("bifn", bhbp(int ), (int)204);
                    continue block54;
                }
                case 1043350595: {
                    v4 = ey.bhbs("bifo", bhbp(int ), (int)205);
                    continue block54;
                }
                case 1908048408: {
                    v4 = ey.bhbs("bifp", bhbp(int ), (int)206);
                    continue block54;
                }
            }
            break;
        }
        this.restoreMovement();
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bifq", bhbp(int ), (int)207)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ey.bhbs("bifr", bhbz(int ), (int)495)) break;
            v5 /* !! */  = (long)ey.bhbs("bifs", bhbz(int ), (int)496);
        }
        v6 /* !! */  = ey.dh;
        if (true) ** GOTO lbl51
        block56: while (true) {
            v6 /* !! */  = (long)(ey.bhbs("bifu", bhbp(int ), (int)209) - ey.bhbs("bift", bhbp(int ), (int)208));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 301435918: {
                    break block56;
                }
                case 1712309997: {
                    continue block56;
                }
            }
            break;
        }
        this.phase = ey$ActionPhase.IDLE;
        if (var1_3 || var1_3) ** GOTO lbl21
        v7 = ey.bhbs("bifv", bhbz(int ), (int)497);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bifw", bhbp(int ), (int)210)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ey.bhbs("bifx", bhbz(int ), (int)498)) break;
            v8 /* !! */  = (long)ey.bhbs("bify", bhbz(int ), (int)499);
        }
        this.previousSlot = (int)v7;
        if (var1_3 || var1_3) ** GOTO lbl21
        v9 = ey.bhbs("bifz", bhbz(int ), (int)500);
        v10 /* !! */  = ey.dh;
        if (true) ** GOTO lbl71
        block58: while (true) {
            v10 /* !! */  = (long)(v11 - ey.bhbs("biga", bhbp(int ), (int)211));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1981858505: {
                    v11 = ey.bhbs("bigb", bhbp(int ), (int)212);
                    continue block58;
                }
                case -1238896586: {
                    v11 = ey.bhbs("bigc", bhbp(int ), (int)213);
                    continue block58;
                }
                case 296389879: {
                    v11 = ey.bhbs("bigd", bhbp(int ), (int)214);
                    continue block58;
                }
                case 301435918: {
                    break block58;
                }
            }
            break;
        }
        this.targetSlot = (int)v9;
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v12 = ey.bhbs("bige", bhbz(int ), (int)501);
                v13 /* !! */  = ey.dh;
                if (true) ** GOTO lbl93
                block59: while (true) {
                    v13 /* !! */  = (long)(ey.bhbs("bigg", bhbp(int ), (int)216) - ey.bhbs("bigf", bhbp(int ), (int)215));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 301435918: {
                            break block59;
                        }
                        case 684847882: {
                            continue block59;
                        }
                    }
                    break;
                }
                this.temporaryHotbarSlot = (int)v12;
                if (var1_3 || var1_3) ** GOTO lbl21
                v14 = ey.bhbs("bigh", bhbz(int ), (int)502);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bigi", bhbp(int ), (int)217)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ey.bhbs("bigj", bhbz(int ), (int)503)) break;
                    v15 /* !! */  = (long)ey.bhbs("bigk", bhbz(int ), (int)504);
                }
                this.fromHotbar = v14;
                if (var1_3 || var1_3) ** GOTO lbl21
                v16 = ey.bhbs("bigl", bhbz(int ), (int)505);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = ey.dh - ey.bhbs("bigm", bhbp(int ), (int)218)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ey.bhbs("bign", bhbz(int ), (int)506)) break;
                    v17 /* !! */  = (long)ey.bhbs("bigo", bhbz(int ), (int)507);
                }
                this.stopTicks = (int)v16;
                if (var1_3 || var1_3) ** GOTO lbl21
                v18 = ey.bhbs("bigp", bhbp(int ), (int)219);
                v19 /* !! */  = ey.dh;
                if (true) ** GOTO lbl121
                block62: while (true) {
                    v19 /* !! */  = (long)(v20 - ey.bhbs("bigq", bhbp(int ), (int)220));
lbl121:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -449730579: {
                            v20 = ey.bhbs("bigr", bhbp(int ), (int)221);
                            continue block62;
                        }
                        case 161356675: {
                            v20 = ey.bhbs("bigs", bhbp(int ), (int)222);
                            continue block62;
                        }
                        case 301435918: {
                            break block62;
                        }
                        case 396365416: {
                            v20 = ey.bhbs("bigt", bhbp(int ), (int)223);
                            continue block62;
                        }
                    }
                    break;
                }
                this.restoreAt = (long)v18;
                if (var1_3 || var1_3) ** GOTO lbl21
                v21 = ey.bhbs("bigu", bhbp(int ), (int)224);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = ey.dh - ey.bhbs("bigv", bhbp(int ), (int)225)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ey.bhbs("bigw", bhbz(int ), (int)508)) break;
                    v22 /* !! */  = (long)ey.bhbs("bigx", bhbz(int ), (int)509);
                }
                this.actionAt = (long)v21;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl144:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ey.bhbs("bigy", bhbz(int ), (int)510);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl149:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ey.bhbs("bigz", bhbz(int ), (int)511);
                if (!var3_1) break;
                throw null;
            }
lbl153:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ey.bhbs("biha", bhbz(int ), (int)512);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl158:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ey.bhbs("bihb", bhbz(int ), (int)513);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl163:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey.bhbs("bihc", bhbz(int ), (int)514);
                    if (!var3_1) ** GOTO lbl149
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ey.bhbs("bihd", bhbz(int ), (int)515);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl173:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ey.bhbs("bihe", bhbz(int ), (int)516);
                if (!var3_1) ** GOTO lbl158
                throw null;
            }
lbl177:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ey.bhbs("bihf", bhbz(int ), (int)517);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ey.bhbs("bihg", bhbz(int ), (int)518);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 9: {
                var2_2 /* !! */  = (int)ey.bhbs("bihh", bhbz(int ), (int)519);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl191:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ey.bhbs("bihi", bhbz(int ), (int)520);
                if (!var3_1) ** GOTO lbl177
                throw null;
            }
lbl195:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ey.bhbs("bihj", bhbz(int ), (int)521);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl200:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)ey.bhbs("bihl", bhbz(int ), (int)522);
                if (!var3_1) ** GOTO lbl163
                throw null;
            }
lbl204:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ey.bhbs("bihm", bhbz(int ), (int)523);
                if (!var3_1) ** GOTO lbl200
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ey.bhbs("bihn", bhbz(int ), (int)524);
                if (!var3_1) ** GOTO lbl191
                throw null;
            }
lbl212:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)ey.bhbs("biho", bhbz(int ), (int)525);
                if (!var3_1) ** GOTO lbl200
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)ey.bhbs("bihp", bhbz(int ), (int)526);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
lbl220:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)ey.bhbs("bihq", bhbz(int ), (int)527);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)ey.bhbs("bihr", bhbz(int ), (int)528);
                if (!var3_1) ** GOTO lbl200
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)ey.bhbs("biht", bhbz(int ), (int)529);
                if (!var3_1) ** GOTO lbl177
                throw null;
            }
lbl232:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)ey.bhbs("bihu", bhbz(int ), (int)530);
                if (!var3_1) ** GOTO lbl153
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)ey.bhbs("bihv", bhbz(int ), (int)531);
        ** while (!var3_1)
lbl239:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void biqv() {
        ey.bhbq[0] = -408886345905367409L;
        ey.bhbq[1] = -8562049769853708084L;
        ey.bhbq[2] = 9039357797545011403L;
        ey.bhbq[3] = 4709794513006552859L;
        ey.bhbq[4] = 8647943619497591772L;
        ey.bhbq[5] = 7767755389986339269L;
        ey.bhbq[6] = 8290083448956388923L;
        ey.bhbq[7] = 4420077223051287216L;
        ey.bhbq[8] = 5996439554341989813L;
        ey.bhbq[9] = -6873823336869626217L;
        ey.bhbq[10] = -236895067904287254L;
        ey.bhbq[11] = 4705162341365399389L;
        ey.bhbq[12] = -1571540911186852664L;
        ey.bhbq[13] = 1418881473214535398L;
        ey.bhbq[14] = 5029973230077112400L;
        ey.bhbq[15] = -3637346244678109387L;
        ey.bhbq[16] = 4080928115203785584L;
        ey.bhbq[17] = -8001147445548683159L;
        ey.bhbq[18] = 1517848623591812460L;
        ey.bhbq[19] = 5548739136482943051L;
        ey.bhbq[20] = 5401428825005886843L;
        ey.bhbq[21] = -8629189280145650521L;
        ey.bhbq[22] = -1421790303678262823L;
        ey.bhbq[23] = -2948655519496092890L;
        ey.bhbq[24] = -6770906975820152608L;
        ey.bhbq[25] = -1063376503951293684L;
        ey.bhbq[26] = 572986513916566528L;
        ey.bhbq[27] = 1867267099489792301L;
        ey.bhbq[28] = -3139612129251988467L;
        ey.bhbq[29] = -3069690154143757412L;
        ey.bhbq[30] = 3156800646542396947L;
        ey.bhbq[31] = -7864297062062526329L;
        ey.bhbq[32] = 8296509116199020949L;
        ey.bhbq[33] = -7003631193408982395L;
        ey.bhbq[34] = -5244464828876377921L;
        ey.bhbq[35] = -8252928498692717741L;
        ey.bhbq[36] = 1653750899565986098L;
        ey.bhbq[37] = -9019516774256046437L;
        ey.bhbq[38] = -2992845025156387336L;
        ey.bhbq[39] = 7994626730222866518L;
        ey.bhbq[40] = 2334784898057532349L;
        ey.bhbq[41] = -6598472439674817402L;
        ey.bhbq[42] = -899501683683498269L;
        ey.bhbq[43] = -1290687001419563077L;
        ey.bhbq[44] = 3542242804000319845L;
        ey.bhbq[45] = 9152608264719270722L;
        ey.bhbq[46] = 3304906662835691677L;
        ey.bhbq[47] = 3769420094745999711L;
        ey.bhbq[48] = -4645472514541782288L;
        ey.bhbq[49] = 3316203107676683861L;
        ey.bhbq[50] = -7158972290581903383L;
        ey.bhbq[51] = 2860353339496549481L;
        ey.bhbq[52] = -5450286884523068948L;
        ey.bhbq[53] = -5896626425041294385L;
        ey.bhbq[54] = -5638935485538086496L;
        ey.bhbq[55] = -1390150489531590848L;
        ey.bhbq[56] = -639695617650209484L;
        ey.bhbq[57] = -8322416982153088823L;
        ey.bhbq[58] = 3296785170365461024L;
        ey.bhbq[59] = 3865315602271023851L;
        ey.bhbq[60] = -8414010626628517848L;
        ey.bhbq[61] = 3104987479439772517L;
        ey.bhbq[62] = -113391317055971066L;
        ey.bhbq[63] = 5452056779456716343L;
        ey.bhbq[64] = 1742081964679155381L;
        ey.bhbq[65] = 2375307360877134903L;
        ey.bhbq[66] = 1938392864784783709L;
        ey.bhbq[67] = -8497106667101252507L;
        ey.bhbq[68] = 34685395600295030L;
        ey.bhbq[69] = 5377008650898160048L;
        ey.bhbq[70] = 4484756419608565599L;
        ey.bhbq[71] = 5249501672201796L;
        ey.bhbq[72] = 8992809437701084909L;
        ey.bhbq[73] = -4158357701778993100L;
        ey.bhbq[74] = -8353746172401354194L;
        ey.bhbq[75] = -2722807447749892976L;
        ey.bhbq[76] = -2092081272893062673L;
        ey.bhbq[77] = -6893597743411067881L;
        ey.bhbq[78] = -539747292790345847L;
        ey.bhbq[79] = 6495484398575579716L;
        ey.bhbq[80] = 1973694104527751471L;
        ey.bhbq[81] = 2386607412088716848L;
        ey.bhbq[82] = -2704985382489694697L;
        ey.bhbq[83] = -7301228600053993099L;
        ey.bhbq[84] = 9111719595138417211L;
        ey.bhbq[85] = 8592504843173622866L;
        ey.bhbq[86] = 4910655735131055945L;
        ey.bhbq[87] = -8690037088529502294L;
        ey.bhbq[88] = 746016925809676725L;
        ey.bhbq[89] = 3187841396866977560L;
        ey.bhbq[90] = 50069155638754980L;
        ey.bhbq[91] = 4516723158745300483L;
        ey.bhbq[92] = 379496708088075498L;
        ey.bhbq[93] = -2222301925421399754L;
        ey.bhbq[94] = -3789186323294388989L;
        ey.bhbq[95] = 4156899183714642431L;
        ey.bhbq[96] = -3340168426958199722L;
        ey.bhbq[97] = 3118808541115202980L;
        ey.bhbq[98] = 2792908920320996145L;
        ey.bhbq[99] = 7482760691431872899L;
    }

    private static /* synthetic */ void biqu() {
        ey.bhcb[500] = 1295829571;
        ey.bhcb[501] = 1110929969;
        ey.bhcb[502] = 2052360125;
        ey.bhcb[503] = -1015398129;
        ey.bhcb[504] = -1437751709;
        ey.bhcb[505] = 1451588808;
        ey.bhcb[506] = -675672655;
        ey.bhcb[507] = 1501235837;
        ey.bhcb[508] = 1742308998;
        ey.bhcb[509] = 1728562899;
        ey.bhcb[510] = 1991330382;
        ey.bhcb[511] = -1417653857;
        ey.bhcb[512] = 816777375;
        ey.bhcb[513] = -1898773561;
        ey.bhcb[514] = -144212197;
        ey.bhcb[515] = 284800446;
        ey.bhcb[516] = -562494723;
        ey.bhcb[517] = -1858395942;
        ey.bhcb[518] = -1368360618;
        ey.bhcb[519] = -1233349170;
        ey.bhcb[520] = -380521211;
        ey.bhcb[521] = -1872584905;
        ey.bhcb[522] = 1157471722;
        ey.bhcb[523] = -1796660961;
        ey.bhcb[524] = -2108931039;
        ey.bhcb[525] = -1489013598;
        ey.bhcb[526] = 1460335423;
        ey.bhcb[527] = 1405105951;
        ey.bhcb[528] = 677301495;
        ey.bhcb[529] = -1867966827;
        ey.bhcb[530] = -1349765240;
        ey.bhcb[531] = -673881825;
        ey.bhcb[532] = 936851105;
        ey.bhcb[533] = 1719020990;
        ey.bhcb[534] = -1679781998;
        ey.bhcb[535] = 22197186;
        ey.bhcb[536] = 1315673575;
        ey.bhcb[537] = 477667637;
        ey.bhcb[538] = -1605427142;
        ey.bhcb[539] = 1950776096;
        ey.bhcb[540] = -1097980638;
        ey.bhcb[541] = 1156703409;
        ey.bhcb[542] = -201172782;
        ey.bhcb[543] = 237353768;
        ey.bhcb[544] = 1345537035;
        ey.bhcb[545] = 1684617390;
        ey.bhcb[546] = -934078519;
        ey.bhcb[547] = -1788076303;
        ey.bhcb[548] = -737529261;
        ey.bhcb[549] = 826362328;
        ey.bhcb[550] = 1752120226;
        ey.bhcb[551] = 1549095951;
        ey.bhcb[552] = 600933376;
        ey.bhcb[553] = 504190856;
        ey.bhcb[554] = -1986524533;
        ey.bhcb[555] = 1948575872;
        ey.bhcb[556] = -1626844505;
        ey.bhcb[557] = 891558245;
        ey.bhcb[558] = -1844028763;
        ey.bhcb[559] = -9813930;
        ey.bhcb[560] = -1860222173;
        ey.bhcb[561] = 515790945;
        ey.bhcb[562] = -978657622;
        ey.bhcb[563] = -196823582;
        ey.bhcb[564] = -142590673;
        ey.bhcb[565] = -1799074309;
        ey.bhcb[566] = -1014220790;
        ey.bhcb[567] = 1477416016;
        ey.bhcb[568] = 2146855838;
        ey.bhcb[569] = 1761461611;
        ey.bhcb[570] = -1886621773;
        ey.bhcb[571] = -1121386101;
        ey.bhcb[572] = -1434872588;
        ey.bhcb[573] = -1780390519;
        ey.bhcb[574] = -294596481;
        ey.bhcb[575] = -495694505;
        ey.bhcb[576] = -1804920306;
        ey.bhcb[577] = 544019412;
        ey.bhcb[578] = 1345312389;
        ey.bhcb[579] = -139795086;
        ey.bhcb[580] = 1265575649;
        ey.bhcb[581] = -392898710;
        ey.bhcb[582] = -1630124076;
        ey.bhcb[583] = -1247350103;
        ey.bhcb[584] = 1093626673;
        ey.bhcb[585] = -609878293;
        ey.bhcb[586] = -143622577;
        ey.bhcb[587] = -951729797;
        ey.bhcb[588] = 1325199039;
        ey.bhcb[589] = 473234618;
        ey.bhcb[590] = -1880914927;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean prepare(class_1792 var1_1) {
        block131: {
            block130: {
                v0 /* !! */  = ey.dh;
                if (true) ** GOTO lbl5
                block79: while (true) {
                    v0 /* !! */  = (long)(v1 - ey.bhbs("bhsa", bhbp(int ), (int)76));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1903073982: {
                            v1 = ey.bhbs("bhsb", bhbp(int ), (int)77);
                            continue block79;
                        }
                        case -716566782: {
                            v1 = ey.bhbs("bhsc", bhbp(int ), (int)78);
                            continue block79;
                        }
                        case 301435918: {
                            break block79;
                        }
                        case 992935872: {
                            v1 = ey.bhbs("bhsd", bhbp(int ), (int)79);
                            continue block79;
                        }
                    }
                    break;
                }
                var6_2 = ey.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bhse", bhbp(int ), (int)80)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ey.bhbs("bhsf", bhbz(int ), (int)342)) break;
                    v2 /* !! */  = (long)ey.bhbs("bhsg", bhbz(int ), (int)343);
                }
                var5_3 /* !! */  = ey.b;
                v3 /* !! */  = ey.dh;
                if (true) ** GOTO lbl28
                block81: while (true) {
                    v3 /* !! */  = (long)(v4 - ey.bhbs("bhsh", bhbp(int ), (int)81));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -796145926: {
                            v4 = ey.bhbs("bhsi", bhbp(int ), (int)82);
                            continue block81;
                        }
                        case 188012554: {
                            v4 = ey.bhbs("bhsj", bhbp(int ), (int)83);
                            continue block81;
                        }
                        case 301435918: {
                            break block81;
                        }
                        case 2126977652: {
                            v4 = ey.bhbs("bhsk", bhbp(int ), (int)84);
                            continue block81;
                        }
                    }
                    break;
                }
                var4_4 = ey.a;
                if (var6_2) {
                    throw null;
lbl43:
                    // 12 sources

                    return (boolean)ey.bhbs("bhsl", bhbz(int ), (int)344);
                }
                if (var4_4 || var4_4) ** GOTO lbl43
                v5 /* !! */  = ey.dh;
                if (true) ** GOTO lbl50
                block83: while (true) {
                    v5 /* !! */  = (long)(v6 - ey.bhbs("bhsm", bhbp(int ), (int)85));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 301435918: {
                            break block83;
                        }
                        case 302203743: {
                            v6 = ey.bhbs("bhsn", bhbp(int ), (int)86);
                            continue block83;
                        }
                        case 1676028799: {
                            v6 = ey.bhbs("bhso", bhbp(int ), (int)87);
                            continue block83;
                        }
                    }
                    break;
                }
                var2_5 = nv.findItemInHotbar(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl43
                if (var2_5 != ey.bhbs("bhsp", bhbz(int ), (int)345)) break block130;
                if (var4_4) ** GOTO lbl43
                v7 /* !! */  = ey.dh;
                if (true) ** GOTO lbl67
                block84: while (true) {
                    v7 /* !! */  = (long)(ey.bhbs("bhsr", bhbp(int ), (int)89) - ey.bhbs("bhsq", bhbp(int ), (int)88));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 32908469: {
                            continue block84;
                        }
                        case 301435918: {
                            break block84;
                        }
                    }
                    break;
                }
                v8 /* !! */  = (CallSite)nv.findItemInInventory(var1_1);
                if (var6_2) {
                    throw null;
                }
                break block131;
            }
            if (var4_4 || var4_4) ** GOTO lbl43
            v8 /* !! */  = var3_6 = ey.bhbs("bhss", bhbz(int ), (int)346);
        }
        if (var4_4 || var4_4) ** GOTO lbl43
        if (var2_5 != ey.bhbs("bhst", bhbz(int ), (int)347)) ** GOTO lbl89
        if (var4_4) ** GOTO lbl43
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_6 != ey.bhbs("bhsu", bhbz(int ), (int)348)) ** GOTO lbl89
                if (var4_4 || var4_4) ** GOTO lbl43
                return (boolean)ey.bhbs("bhsv", bhbz(int ), (int)349);
lbl89:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl43
                v9 /* !! */  = ey.dh;
                if (true) ** GOTO lbl94
                block85: while (true) {
                    v9 /* !! */  = (long)(v10 - ey.bhbs("bhsw", bhbp(int ), (int)90));
lbl94:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1696955750: {
                            v10 = ey.bhbs("bhsx", bhbp(int ), (int)91);
                            continue block85;
                        }
                        case 227614166: {
                            v10 = ey.bhbs("bhsy", bhbp(int ), (int)92);
                            continue block85;
                        }
                        case 301435918: {
                            break block85;
                        }
                    }
                    break;
                }
                v11 /* !! */  = ey.dh;
                if (true) ** GOTO lbl107
                block86: while (true) {
                    v11 /* !! */  = (long)(v12 - ey.bhbs("bhsz", bhbp(int ), (int)93));
lbl107:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -682444874: {
                            v12 = ey.bhbs("bhta", bhbp(int ), (int)94);
                            continue block86;
                        }
                        case 54455450: {
                            v12 = ey.bhbs("bhtb", bhbp(int ), (int)95);
                            continue block86;
                        }
                        case 301435918: {
                            break block86;
                        }
                        case 354680458: {
                            v12 = ey.bhbs("bhtc", bhbp(int ), (int)96);
                            continue block86;
                        }
                    }
                    break;
                }
                v13 = ey.mc.field_1724;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bhtd", bhbp(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ey.bhbs("bhte", bhbz(int ), (int)350)) break;
                    v14 /* !! */  = (long)ey.bhbs("bhtf", bhbz(int ), (int)351);
                }
                v15 = v13.method_31548();
                v16 /* !! */  = ey.dh;
                if (true) ** GOTO lbl130
                block88: while (true) {
                    v16 /* !! */  = (long)(v17 - ey.bhbs("bhtg", bhbp(int ), (int)98));
lbl130:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1602423894: {
                            v17 = ey.bhbs("bhth", bhbp(int ), (int)99);
                            continue block88;
                        }
                        case -253196222: {
                            v17 = ey.bhbs("bhti", bhbp(int ), (int)100);
                            continue block88;
                        }
                        case 301435918: {
                            break block88;
                        }
                        case 1096046672: {
                            v17 = ey.bhbs("bhtj", bhbp(int ), (int)101);
                            continue block88;
                        }
                    }
                    break;
                }
                v18 = v15.method_67532();
                v19 /* !! */  = ey.dh;
                if (true) ** GOTO lbl147
                block89: while (true) {
                    v19 /* !! */  = (long)(v20 - ey.bhbs("bhtk", bhbp(int ), (int)102));
lbl147:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -187831172: {
                            v20 = ey.bhbs("bhtl", bhbp(int ), (int)103);
                            continue block89;
                        }
                        case 301435918: {
                            break block89;
                        }
                        case 835847659: {
                            v20 = ey.bhbs("bhtm", bhbp(int ), (int)104);
                            continue block89;
                        }
                        case 1853054588: {
                            v20 = ey.bhbs("bhtn", bhbp(int ), (int)105);
                            continue block89;
                        }
                    }
                    break;
                }
                this.previousSlot = v18;
                if (var4_4 || var4_4) ** GOTO lbl43
                if (var2_5 != ey.bhbs("bhto", bhbz(int ), (int)352)) {
                    v21 = ey.bhbs("bhtp", bhbz(int ), (int)353);
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    v21 = ey.bhbs("bhtq", bhbz(int ), (int)354);
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bhtr", bhbp(int ), (int)106)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ey.bhbs("bhts", bhbz(int ), (int)355)) break;
                    v22 /* !! */  = (long)ey.bhbs("bhtt", bhbz(int ), (int)356);
                }
                this.fromHotbar = v21;
                if (var4_4 || var4_4) ** GOTO lbl43
                v23 /* !! */  = ey.dh;
                if (true) ** GOTO lbl178
                block91: while (true) {
                    v23 /* !! */  = (long)(ey.bhbs("bhtv", bhbp(int ), (int)108) - ey.bhbs("bhtu", bhbp(int ), (int)107));
lbl178:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 155655413: {
                            continue block91;
                        }
                        case 301435918: {
                            break block91;
                        }
                    }
                    break;
                }
                if (this.fromHotbar) {
                    v24 /* !! */  = var2_5;
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    v24 /* !! */  = (int)var3_6;
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bhtw", bhbp(int ), (int)109)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ey.bhbs("bhtx", bhbz(int ), (int)357)) break;
                    v25 /* !! */  = (long)ey.bhbs("bhty", bhbz(int ), (int)358);
                }
                this.targetSlot = v24 /* !! */ ;
                if (var4_4 || var4_4) ** GOTO lbl43
                v26 /* !! */  = ey.dh;
                if (true) ** GOTO lbl200
                block93: while (true) {
                    v26 /* !! */  = (long)(ey.bhbs("bhua", bhbp(int ), (int)111) - ey.bhbs("bhtz", bhbp(int ), (int)110));
lbl200:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1610554212: {
                            continue block93;
                        }
                        case 301435918: {
                            break block93;
                        }
                    }
                    break;
                }
                if (this.fromHotbar) {
                    v27 = var2_5;
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bhub", bhbp(int ), (int)112)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == ey.bhbs("bhuc", bhbz(int ), (int)359)) {
                            v27 = this.previousSlot;
                            break;
                        }
                        v28 /* !! */  = (long)ey.bhbs("bhud", bhbz(int ), (int)360);
                    }
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bhue", bhbp(int ), (int)113)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ey.bhbs("bhuf", bhbz(int ), (int)361)) break;
                    v29 /* !! */  = (long)ey.bhbs("bhug", bhbz(int ), (int)362);
                }
                this.temporaryHotbarSlot = v27;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return (boolean)ey.bhbs("bhuh", bhbz(int ), (int)363);
            }
            case 0: {
                var5_3 /* !! */  = (int)ey.bhbs("bhui", bhbz(int ), (int)364);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 1: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuj", bhbz(int ), (int)365);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 2: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuk", bhbz(int ), (int)366);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl241:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ey.bhbs("bhul", bhbz(int ), (int)367);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl246:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ey.bhbs("bhum", bhbz(int ), (int)368);
                if (!var6_2) ** GOTO lbl241
                throw null;
            }
lbl250:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)ey.bhbs("bhun", bhbz(int ), (int)369);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl255:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuo", bhbz(int ), (int)370);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 7: {
                var5_3 /* !! */  = (int)ey.bhbs("bhup", bhbz(int ), (int)371);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl265:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuq", bhbz(int ), (int)372);
                if (!var6_2) ** GOTO lbl255
                throw null;
            }
lbl269:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ey.bhbs("bhur", bhbz(int ), (int)373);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl274:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ey.bhbs("bhus", bhbz(int ), (int)374);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl297
                    break;
                }
            }
lbl280:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)ey.bhbs("bhut", bhbz(int ), (int)375);
                if (!var6_2) ** GOTO lbl265
                throw null;
            }
lbl284:
            // 5 sources

            case 12: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuu", bhbz(int ), (int)376);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl289:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuv", bhbz(int ), (int)377);
                if (!var6_2) ** GOTO lbl255
                throw null;
            }
lbl293:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuw", bhbz(int ), (int)378);
                if (!var6_2) ** GOTO lbl284
                throw null;
            }
lbl297:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ey.bhbs("bhux", bhbz(int ), (int)379);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 16: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuy", bhbz(int ), (int)380);
                if (!var6_2) ** GOTO lbl274
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ey.bhbs("bhuz", bhbz(int ), (int)381);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl311:
            // 2 sources

            case 18: {
                do {
                    var5_3 /* !! */  = (int)ey.bhbs("bhva", bhbz(int ), (int)382);
                } while (!var6_2);
                throw null;
            }
lbl316:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)ey.bhbs("bhvb", bhbz(int ), (int)383);
                if (!var6_2) ** GOTO lbl289
                throw null;
            }
lbl320:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ey.bhbs("bhvc", bhbz(int ), (int)384);
                if (!var6_2) ** GOTO lbl284
                throw null;
            }
            case 21: {
                var5_3 /* !! */  = (int)ey.bhbs("bhvd", bhbz(int ), (int)385);
                if (!var6_2) ** GOTO lbl284
                throw null;
            }
lbl328:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)ey.bhbs("bhve", bhbz(int ), (int)386);
                if (!var6_2) ** GOTO lbl250
                throw null;
            }
lbl332:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)ey.bhbs("bhvf", bhbz(int ), (int)387);
                if (!var6_2) ** GOTO lbl293
                throw null;
            }
            case 24: 
        }
        var5_3 /* !! */  = (int)ey.bhbs("bhvg", bhbz(int ), (int)388);
        ** while (!var6_2)
lbl339:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void biqk() {
        ey.bhcb[0] = 387891411;
        ey.bhcb[1] = -540196744;
        ey.bhcb[2] = -2135661130;
        ey.bhcb[3] = -1920184360;
        ey.bhcb[4] = -166474639;
        ey.bhcb[5] = 1972078799;
        ey.bhcb[6] = 1913994313;
        ey.bhcb[7] = -660624615;
        ey.bhcb[8] = -2037533078;
        ey.bhcb[9] = -1283829839;
        ey.bhcb[10] = -818602398;
        ey.bhcb[11] = 864944463;
        ey.bhcb[12] = 763463361;
        ey.bhcb[13] = 1503869266;
        ey.bhcb[14] = 958652423;
        ey.bhcb[15] = 1752262008;
        ey.bhcb[16] = -1788019931;
        ey.bhcb[17] = -929603068;
        ey.bhcb[18] = 1495311900;
        ey.bhcb[19] = -374923199;
        ey.bhcb[20] = -2125029244;
        ey.bhcb[21] = -450234492;
        ey.bhcb[22] = 1901596408;
        ey.bhcb[23] = 195817236;
        ey.bhcb[24] = -538820671;
        ey.bhcb[25] = -541312602;
        ey.bhcb[26] = 1342427189;
        ey.bhcb[27] = 1221504852;
        ey.bhcb[28] = -17636957;
        ey.bhcb[29] = 424409575;
        ey.bhcb[30] = 852794897;
        ey.bhcb[31] = 1835897095;
        ey.bhcb[32] = -1926861233;
        ey.bhcb[33] = -1568050444;
        ey.bhcb[34] = 1020766844;
        ey.bhcb[35] = 974468489;
        ey.bhcb[36] = -2034405199;
        ey.bhcb[37] = 776983021;
        ey.bhcb[38] = 233397147;
        ey.bhcb[39] = 1046246969;
        ey.bhcb[40] = -1694152989;
        ey.bhcb[41] = -615586353;
        ey.bhcb[42] = 1901006430;
        ey.bhcb[43] = 557751712;
        ey.bhcb[44] = -2015503864;
        ey.bhcb[45] = -1423500888;
        ey.bhcb[46] = 896674843;
        ey.bhcb[47] = -141059215;
        ey.bhcb[48] = -828089412;
        ey.bhcb[49] = 468204889;
        ey.bhcb[50] = 2079047182;
        ey.bhcb[51] = 1182532845;
        ey.bhcb[52] = -667596623;
        ey.bhcb[53] = 61707933;
        ey.bhcb[54] = -1712241664;
        ey.bhcb[55] = 1617311625;
        ey.bhcb[56] = 1433632890;
        ey.bhcb[57] = -654606775;
        ey.bhcb[58] = -164904380;
        ey.bhcb[59] = -2059370033;
        ey.bhcb[60] = 1854441127;
        ey.bhcb[61] = -503116331;
        ey.bhcb[62] = 1679637226;
        ey.bhcb[63] = -881953151;
        ey.bhcb[64] = 968835345;
        ey.bhcb[65] = -1540054758;
        ey.bhcb[66] = -557316561;
        ey.bhcb[67] = 360041987;
        ey.bhcb[68] = -1894004874;
        ey.bhcb[69] = 349319261;
        ey.bhcb[70] = 663666226;
        ey.bhcb[71] = 1191803386;
        ey.bhcb[72] = -454551481;
        ey.bhcb[73] = 1992214155;
        ey.bhcb[74] = -1703235091;
        ey.bhcb[75] = -2092970193;
        ey.bhcb[76] = -862533952;
        ey.bhcb[77] = 30971846;
        ey.bhcb[78] = -1719528606;
        ey.bhcb[79] = -1763251783;
        ey.bhcb[80] = -1814432199;
        ey.bhcb[81] = -1459651552;
        ey.bhcb[82] = -733588204;
        ey.bhcb[83] = 1266200411;
        ey.bhcb[84] = -1126287684;
        ey.bhcb[85] = -574500187;
        ey.bhcb[86] = -1403622728;
        ey.bhcb[87] = 1533154346;
        ey.bhcb[88] = -2021779754;
        ey.bhcb[89] = -1748627298;
        ey.bhcb[90] = 1049092396;
        ey.bhcb[91] = 627541363;
        ey.bhcb[92] = -851673422;
        ey.bhcb[93] = 984056084;
        ey.bhcb[94] = -1682636376;
        ey.bhcb[95] = 891985627;
        ey.bhcb[96] = 2015438947;
        ey.bhcb[97] = 190904467;
        ey.bhcb[98] = 1432187955;
        ey.bhcb[99] = -797733434;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$onTick$0(long var0, ey$StunArea var2_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey.dh - ey.bhbs("bind", bhbp(int ), (int)266)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey.bhbs("binf", bhbz(int ), (int)574)) break;
            v0 /* !! */  = (long)ey.bhbs("bing", bhbz(int ), (int)575);
        }
        var5_2 = ey.c;
        v1 /* !! */  = ey.dh;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(ey.bhbs("binj", bhbp(int ), (int)268) - ey.bhbs("bini", bhbp(int ), (int)267));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 301435918: {
                    break block15;
                }
                case 658405192: {
                    continue block15;
                }
            }
            break;
        }
        var4_3 /* !! */  = ey.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bink", bhbp(int ), (int)269)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ey.bhbs("binm", bhbz(int ), (int)576)) break;
            v2 /* !! */  = (long)ey.bhbs("bino", bhbz(int ), (int)577);
        }
        var3_4 = ey.a;
        if (var5_2) {
            throw null;
lbl27:
            // 3 sources

            return (boolean)ey.bhbs("binp", bhbz(int ), (int)578);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("binr", bhbp(int ), (int)270)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ey.bhbs("bint", bhbz(int ), (int)579)) break;
                    v3 /* !! */  = (long)ey.bhbs("binu", bhbz(int ), (int)580);
                }
                if (var2_1.expiresAt > var0) ** GOTO lbl45
                if (var3_4) ** GOTO lbl27
                v4 = ey.bhbs("binv", bhbz(int ), (int)581);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl48
lbl45:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v4 = ey.bhbs("binx", bhbz(int ), (int)582);
lbl48:
                // 2 sources

                return (boolean)v4;
            }
lbl49:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)ey.bhbs("binz", bhbz(int ), (int)583);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("bioa", bhbz(int ), (int)584);
                } while (!var5_2);
                throw null;
            }
            case 2: {
                var4_3 /* !! */  = (int)ey.bhbs("biob", bhbz(int ), (int)585);
                if (!var5_2) ** GOTO lbl49
                throw null;
            }
lbl63:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)ey.bhbs("biod", bhbz(int ), (int)586);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ey.bhbs("bioe", bhbz(int ), (int)587);
                    if (!var5_2) ** GOTO lbl49
                    throw null;
                }
            }
lbl73:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)ey.bhbs("biof", bhbz(int ), (int)588);
                if (!var5_2) ** GOTO lbl63
                throw null;
            }
lbl77:
            // 2 sources

            case 6: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("biog", bhbz(int ), (int)589);
                } while (!var5_2);
                throw null;
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)ey.bhbs("bioi", bhbz(int ), (int)590);
        ** while (!var5_2)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void biqx() {
        ey.bhbq[200] = 8281511648755752334L;
        ey.bhbq[201] = 6083433332763758566L;
        ey.bhbq[202] = -2056191969930417961L;
        ey.bhbq[203] = 1484977133260026181L;
        ey.bhbq[204] = 8804279668355286511L;
        ey.bhbq[205] = -2580858883104011613L;
        ey.bhbq[206] = 7116102336894841288L;
        ey.bhbq[207] = 2727200705278433520L;
        ey.bhbq[208] = 6215274124255383409L;
        ey.bhbq[209] = -5916237255460955494L;
        ey.bhbq[210] = 1831988432728079386L;
        ey.bhbq[211] = -7075238681024000771L;
        ey.bhbq[212] = -4159816358986603207L;
        ey.bhbq[213] = -8951603570736945640L;
        ey.bhbq[214] = 8154715025846661105L;
        ey.bhbq[215] = 3011989762209012360L;
        ey.bhbq[216] = 7344131045463396914L;
        ey.bhbq[217] = -3708500804045606739L;
        ey.bhbq[218] = -8154762662671323016L;
        ey.bhbq[219] = 3135073871264853251L;
        ey.bhbq[220] = -8596105075500561032L;
        ey.bhbq[221] = -1650990682478012481L;
        ey.bhbq[222] = 747293489793097681L;
        ey.bhbq[223] = -9096913112893598195L;
        ey.bhbq[224] = -2732280472383587195L;
        ey.bhbq[225] = -7340795130004556943L;
        ey.bhbq[226] = -3378383509673095504L;
        ey.bhbq[227] = -6071247887076292113L;
        ey.bhbq[228] = 4409956603980722436L;
        ey.bhbq[229] = 5099358289466554257L;
        ey.bhbq[230] = 1130129290553136131L;
        ey.bhbq[231] = -375100796552636034L;
        ey.bhbq[232] = 522975789539848656L;
        ey.bhbq[233] = -8829080839216102716L;
        ey.bhbq[234] = 3298804013142091323L;
        ey.bhbq[235] = -6978814204698322854L;
        ey.bhbq[236] = 6771856744270006377L;
        ey.bhbq[237] = 2014037449058313198L;
        ey.bhbq[238] = 6299268230787721268L;
        ey.bhbq[239] = -8862965715007612857L;
        ey.bhbq[240] = -4937081326561528546L;
        ey.bhbq[241] = 1756762889765341103L;
        ey.bhbq[242] = 7920805323145984394L;
        ey.bhbq[243] = 5731819622968964095L;
        ey.bhbq[244] = -696670080904158489L;
        ey.bhbq[245] = 6590408049813466461L;
        ey.bhbq[246] = 7014093683239487265L;
        ey.bhbq[247] = 238680760890750666L;
        ey.bhbq[248] = 4876273492638395569L;
        ey.bhbq[249] = 8622061548869035828L;
        ey.bhbq[250] = -8618316242504942718L;
        ey.bhbq[251] = -2169240469701932025L;
        ey.bhbq[252] = 1279658709133154584L;
        ey.bhbq[253] = 6538080144547487237L;
        ey.bhbq[254] = -6302458446134382160L;
        ey.bhbq[255] = -2565295662598001368L;
        ey.bhbq[256] = -2106591793824941270L;
        ey.bhbq[257] = 8253505417240890184L;
        ey.bhbq[258] = 2589728530109466353L;
        ey.bhbq[259] = -4885435396785375692L;
        ey.bhbq[260] = -936842384299714567L;
        ey.bhbq[261] = -3417566366916135785L;
        ey.bhbq[262] = 2162289734105061474L;
        ey.bhbq[263] = -7853688761719724539L;
        ey.bhbq[264] = 8082274458045019466L;
        ey.bhbq[265] = -8012063153703318723L;
        ey.bhbq[266] = -722374316975043720L;
        ey.bhbq[267] = 505865078402953400L;
        ey.bhbq[268] = 7962770252383631379L;
        ey.bhbq[269] = 2137154583254978113L;
        ey.bhbq[270] = 7579058392850935774L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void beginStop(ey$ActionPhase var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ey.dh - ey.bhbs("bhvh", bhbp(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ey.bhbs("bhvi", bhbz(int ), (int)389)) break;
            v0 /* !! */  = (long)ey.bhbs("bhvj", bhbz(int ), (int)390);
        }
        var4_2 = ey.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ey.dh - ey.bhbs("bhvk", bhbp(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ey.bhbs("bhvl", bhbz(int ), (int)391)) break;
            v1 /* !! */  = (long)ey.bhbs("bhvm", bhbz(int ), (int)392);
        }
        var3_3 /* !! */  = ey.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = ey.dh - ey.bhbs("bhvn", bhbp(int ), (int)116)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ey.bhbs("bhvo", bhbz(int ), (int)393)) {
                var2_4 = ey.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ey.bhbs("bhvp", bhbz(int ), (int)394);
        }
        if (var2_4 || var2_4) return;
        v3 /* !! */  = ey.dh;
        if (true) ** GOTO lbl27
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - ey.bhbs("bhvq", bhbp(int ), (int)117));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1585754728: {
                    v4 = ey.bhbs("bhvr", bhbp(int ), (int)118);
                    continue block34;
                }
                case -361281009: {
                    v4 = ey.bhbs("bhvs", bhbp(int ), (int)119);
                    continue block34;
                }
                case 301435918: {
                    break block34;
                }
                case 1132869384: {
                    v4 = ey.bhbs("bhvt", bhbp(int ), (int)120);
                    continue block34;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_4 = ey.dh - ey.bhbs("bhvu", bhbp(int ), (int)121)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ey.bhbs("bhvv", bhbz(int ), (int)395)) {
                this.movement.saveState();
                if (var2_4) return;
                break;
            }
            v5 /* !! */  = (long)ey.bhbs("bhvw", bhbz(int ), (int)396);
        }
        if (var2_4) return;
        v6 /* !! */  = ey.dh;
        if (true) ** GOTO lbl52
        block36: while (true) {
            v6 /* !! */  = (long)(v7 - ey.bhbs("bhvx", bhbp(int ), (int)122));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1968336312: {
                    v7 = ey.bhbs("bhvy", bhbp(int ), (int)123);
                    continue block36;
                }
                case 235950460: {
                    v7 = ey.bhbs("bhvz", bhbp(int ), (int)124);
                    continue block36;
                }
                case 301435918: {
                    break block36;
                }
                case 1886573089: {
                    v7 = ey.bhbs("bhwa", bhbp(int ), (int)125);
                    continue block36;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_5 = ey.dh - ey.bhbs("bhwb", bhbp(int ), (int)126)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ey.bhbs("bhwc", bhbz(int ), (int)397)) {
                this.movement.block();
                if (var2_4) return;
                break;
            }
            v8 /* !! */  = (long)ey.bhbs("bhwd", bhbz(int ), (int)398);
        }
        if (var2_4) return;
        v9 = ey.bhbs("bhwe", bhbz(int ), (int)399);
        v10 /* !! */  = ey.dh;
        if (true) ** GOTO lbl78
        block38: while (true) {
            v10 /* !! */  = (long)(v11 - ey.bhbs("bhwf", bhbp(int ), (int)127));
lbl78:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1565952871: {
                    v11 = ey.bhbs("bhwg", bhbp(int ), (int)128);
                    continue block38;
                }
                case -665177468: {
                    v11 = ey.bhbs("bhwh", bhbp(int ), (int)129);
                    continue block38;
                }
                case 301435918: {
                    break block38;
                }
            }
            break;
        }
        this.stopTicks = (int)v9;
        if (var2_4 || var2_4) return;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = ey.dh - ey.bhbs("bhwi", bhbp(int ), (int)130)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ey.bhbs("bhwj", bhbz(int ), (int)400)) {
                this.phase = var1_1;
                if (var2_4) return;
                break;
            }
            v12 /* !! */  = (long)ey.bhbs("bhwk", bhbz(int ), (int)401);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block40: while (true) {
            block64: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var2_4) return;
                        return;
                    }
                    case 1: {
                        do {
                            var3_3 /* !! */  = (int)ey.bhbs("bhwm", bhbz(int ), (int)403);
                        } while (!var4_2);
                        throw null;
                    }
                    case 2: {
                        ** GOTO lbl140
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwr", bhbz(int ), (int)408);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block64;
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwt", bhbz(int ), (int)410);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwl", bhbz(int ), (int)402);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhws", bhbz(int ), (int)409);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block64;
                    }
                    case 10: {
                        do {
                            var3_3 /* !! */  = (int)ey.bhbs("bhwv", bhbz(int ), (int)412);
                        } while (!var4_2);
                        throw null;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhww", bhbz(int ), (int)413);
                        if (var4_2) {
                            throw null;
                        }
lbl140:
                        // 3 sources

                        var3_3 /* !! */  = (int)ey.bhbs("bhwn", bhbz(int ), (int)404);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block64;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwo", bhbz(int ), (int)405);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwq", bhbz(int ), (int)407);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block64;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ey.bhbs("bhwp", bhbz(int ), (int)406);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl164
            }
            do {
                if (true) continue block40;
lbl164:
                // 2 sources

                var3_3 /* !! */  = (int)ey.bhbs("bhwu", bhbz(int ), (int)411);
                cfr_temp_0 = 4;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void bioy() {
        ey.bhca[100] = -227292751;
        ey.bhca[101] = -1765244639;
        ey.bhca[102] = 1217008988;
        ey.bhca[103] = 639813331;
        ey.bhca[104] = -133709337;
        ey.bhca[105] = -783596849;
        ey.bhca[106] = 170652452;
        ey.bhca[107] = -1831472493;
        ey.bhca[108] = 714302520;
        ey.bhca[109] = 1967729567;
        ey.bhca[110] = 1060742425;
        ey.bhca[111] = -359321095;
        ey.bhca[112] = -22337069;
        ey.bhca[113] = -1654383468;
        ey.bhca[114] = -1353878475;
        ey.bhca[115] = 1955341333;
        ey.bhca[116] = -408261651;
        ey.bhca[117] = 856596418;
        ey.bhca[118] = -440793804;
        ey.bhca[119] = -2010886778;
        ey.bhca[120] = -883397453;
        ey.bhca[121] = 870475692;
        ey.bhca[122] = -1842185687;
        ey.bhca[123] = -1475558783;
        ey.bhca[124] = -2085499395;
        ey.bhca[125] = 973545849;
        ey.bhca[126] = -1703001987;
        ey.bhca[127] = -636141281;
        ey.bhca[128] = -1423195485;
        ey.bhca[129] = 292969444;
        ey.bhca[130] = 1904213268;
        ey.bhca[131] = -2139024262;
        ey.bhca[132] = -817392641;
        ey.bhca[133] = 1836155685;
        ey.bhca[134] = 5917750;
        ey.bhca[135] = 1960340811;
        ey.bhca[136] = -207468674;
        ey.bhca[137] = 1129004434;
        ey.bhca[138] = 1676953511;
        ey.bhca[139] = -880472038;
        ey.bhca[140] = -1508539410;
        ey.bhca[141] = -1443519240;
        ey.bhca[142] = 1321929035;
        ey.bhca[143] = -722371393;
        ey.bhca[144] = -1338245268;
        ey.bhca[145] = -455400459;
        ey.bhca[146] = -736322026;
        ey.bhca[147] = 1655698784;
        ey.bhca[148] = 888999786;
        ey.bhca[149] = -56623269;
        ey.bhca[150] = 384315263;
        ey.bhca[151] = -976828287;
        ey.bhca[152] = -333071251;
        ey.bhca[153] = 1332179966;
        ey.bhca[154] = 1197641715;
        ey.bhca[155] = -1005436756;
        ey.bhca[156] = 732264827;
        ey.bhca[157] = -437143459;
        ey.bhca[158] = -734657962;
        ey.bhca[159] = 237203613;
        ey.bhca[160] = 743513538;
        ey.bhca[161] = -373332650;
        ey.bhca[162] = -2110662909;
        ey.bhca[163] = 1199241480;
        ey.bhca[164] = -866450954;
        ey.bhca[165] = 1292574968;
        ey.bhca[166] = -1518108722;
        ey.bhca[167] = 1408294645;
        ey.bhca[168] = -304539439;
        ey.bhca[169] = -244837203;
        ey.bhca[170] = -327807915;
        ey.bhca[171] = 1864783713;
        ey.bhca[172] = -1314415440;
        ey.bhca[173] = 954988547;
        ey.bhca[174] = -2069572886;
        ey.bhca[175] = 2024364356;
        ey.bhca[176] = 1129171390;
        ey.bhca[177] = -1108535271;
        ey.bhca[178] = -2036409386;
        ey.bhca[179] = 851047833;
        ey.bhca[180] = 1756257620;
        ey.bhca[181] = -118619441;
        ey.bhca[182] = -574758783;
        ey.bhca[183] = -769803090;
        ey.bhca[184] = -1193366499;
        ey.bhca[185] = 1237759884;
        ey.bhca[186] = -995249336;
        ey.bhca[187] = 1072966930;
        ey.bhca[188] = 969630436;
        ey.bhca[189] = 1068860279;
        ey.bhca[190] = -448254517;
        ey.bhca[191] = -1777360467;
        ey.bhca[192] = -1527396698;
        ey.bhca[193] = 167766022;
        ey.bhca[194] = -1581262768;
        ey.bhca[195] = -522999341;
        ey.bhca[196] = -399603316;
        ey.bhca[197] = 1114520010;
        ey.bhca[198] = 696194788;
        ey.bhca[199] = 1010536785;
    }

    private static /* synthetic */ void biqw() {
        ey.bhbq[100] = -500713467024177663L;
        ey.bhbq[101] = 3526504679380941303L;
        ey.bhbq[102] = 6697514797665799722L;
        ey.bhbq[103] = -7585910661182976941L;
        ey.bhbq[104] = 6064588172980886336L;
        ey.bhbq[105] = 5465652621958122678L;
        ey.bhbq[106] = -5309751025402362546L;
        ey.bhbq[107] = -8318908784174648445L;
        ey.bhbq[108] = -7580562909126574242L;
        ey.bhbq[109] = -5908385528310718315L;
        ey.bhbq[110] = 4991650337471305220L;
        ey.bhbq[111] = -775599482121917181L;
        ey.bhbq[112] = 5250730425182305487L;
        ey.bhbq[113] = -9128217669726793576L;
        ey.bhbq[114] = 8583808311518467238L;
        ey.bhbq[115] = -5745086799627463182L;
        ey.bhbq[116] = -1305762655277429413L;
        ey.bhbq[117] = -3580666783931457071L;
        ey.bhbq[118] = 2676369513177376329L;
        ey.bhbq[119] = -8822643159191006299L;
        ey.bhbq[120] = -886724917641288405L;
        ey.bhbq[121] = 3258954432854656890L;
        ey.bhbq[122] = 4917482674677066909L;
        ey.bhbq[123] = 6704198937546778115L;
        ey.bhbq[124] = -3180987505202116669L;
        ey.bhbq[125] = 4323718788044162583L;
        ey.bhbq[126] = -8498847756206438972L;
        ey.bhbq[127] = 7270833720405972565L;
        ey.bhbq[128] = 8307571341779598765L;
        ey.bhbq[129] = 557722094566922495L;
        ey.bhbq[130] = 3255950541093806508L;
        ey.bhbq[131] = -7865150659394611237L;
        ey.bhbq[132] = 5930714727559611508L;
        ey.bhbq[133] = -1875025415909188470L;
        ey.bhbq[134] = 1747961548174081366L;
        ey.bhbq[135] = 8288154742275592305L;
        ey.bhbq[136] = -3188048574633270081L;
        ey.bhbq[137] = 380887742596335460L;
        ey.bhbq[138] = -7849145937657707253L;
        ey.bhbq[139] = -7367400753782504606L;
        ey.bhbq[140] = 4542122077058621559L;
        ey.bhbq[141] = -3743724306998118062L;
        ey.bhbq[142] = 144270200715220190L;
        ey.bhbq[143] = 8135945742214153162L;
        ey.bhbq[144] = 3218386039197159912L;
        ey.bhbq[145] = 7567980780461107426L;
        ey.bhbq[146] = 5472393726581354600L;
        ey.bhbq[147] = 5968223239412901381L;
        ey.bhbq[148] = -8182192024298040307L;
        ey.bhbq[149] = 1087017458055834146L;
        ey.bhbq[150] = -8695435345075835111L;
        ey.bhbq[151] = -8711058405240389604L;
        ey.bhbq[152] = -4567511685825042357L;
        ey.bhbq[153] = -5314232795706183979L;
        ey.bhbq[154] = -1597860534184951325L;
        ey.bhbq[155] = 3759146827812566010L;
        ey.bhbq[156] = -5099948757131233804L;
        ey.bhbq[157] = -4519821328953003921L;
        ey.bhbq[158] = -360807910210621299L;
        ey.bhbq[159] = 8972436407568165384L;
        ey.bhbq[160] = -5957443801036198250L;
        ey.bhbq[161] = 457260830898198056L;
        ey.bhbq[162] = 3456373213348377797L;
        ey.bhbq[163] = -5419256545475018198L;
        ey.bhbq[164] = -2571505542118653493L;
        ey.bhbq[165] = -8318483025469904477L;
        ey.bhbq[166] = 8181404316023248102L;
        ey.bhbq[167] = 1736839243945502612L;
        ey.bhbq[168] = -597676083377090692L;
        ey.bhbq[169] = -6781712093741181003L;
        ey.bhbq[170] = -3240646712992757606L;
        ey.bhbq[171] = -6705824026295764192L;
        ey.bhbq[172] = -6603389082347028755L;
        ey.bhbq[173] = 2950670891284277669L;
        ey.bhbq[174] = -5484744226082878533L;
        ey.bhbq[175] = -3107995955671552006L;
        ey.bhbq[176] = 2805098518549816802L;
        ey.bhbq[177] = 2191416159118389250L;
        ey.bhbq[178] = -1235369225813770475L;
        ey.bhbq[179] = 811092763260617842L;
        ey.bhbq[180] = 4447500434996156463L;
        ey.bhbq[181] = 328401802278742588L;
        ey.bhbq[182] = -2728528164700830784L;
        ey.bhbq[183] = 5807348933296829847L;
        ey.bhbq[184] = 1176821691923441211L;
        ey.bhbq[185] = 3094333369024890147L;
        ey.bhbq[186] = 5947025271917804963L;
        ey.bhbq[187] = 9081956095779331418L;
        ey.bhbq[188] = 5509604301502737873L;
        ey.bhbq[189] = 2415189910454970641L;
        ey.bhbq[190] = -2930411355823712982L;
        ey.bhbq[191] = 3739474980604019806L;
        ey.bhbq[192] = 5043019268290501743L;
        ey.bhbq[193] = -5207563483388354659L;
        ey.bhbq[194] = -7682265356234790496L;
        ey.bhbq[195] = -4667824677881592669L;
        ey.bhbq[196] = -150099802417275775L;
        ey.bhbq[197] = 1822621962513039005L;
        ey.bhbq[198] = -6619418370603812837L;
        ey.bhbq[199] = -9119868579065781745L;
    }

    static {
        bhca = new int[591];
        bhcb = new int[591];
        ey.bior();
        ey.bioy();
        ey.bipc();
        ey.bipo();
        ey.bipw();
        ey.biqi();
        ey.biqk();
        ey.biqm();
        ey.biqo();
        ey.biqr();
        ey.biqt();
        ey.biqu();
        bhbq = new long[271];
        bhbr = new long[271];
        ey.biqv();
        ey.biqw();
        ey.biqx();
        ey.biqy();
        ey.biqz();
        ey.bira();
    }

    private static /* synthetic */ int bhbz(int n2) {
        return bhca[n2] ^ bhcb[n2];
    }

    private static /* synthetic */ void biqy() {
        ey.bhbr[0] = -7112717151813672512L;
        ey.bhbr[1] = 7712184377892647788L;
        ey.bhbr[2] = -1386897208108680086L;
        ey.bhbr[3] = 2154256571845093519L;
        ey.bhbr[4] = -5221253277200302696L;
        ey.bhbr[5] = 1702513111932265282L;
        ey.bhbr[6] = -4994209832084183433L;
        ey.bhbr[7] = -723118420148899566L;
        ey.bhbr[8] = -8578072880971711614L;
        ey.bhbr[9] = -7414876676663616667L;
        ey.bhbr[10] = -236895067904287289L;
        ey.bhbr[11] = 4705162341365384645L;
        ey.bhbr[12] = 3570682622381389949L;
        ey.bhbr[13] = 3476712841672517146L;
        ey.bhbr[14] = 2986523703915846748L;
        ey.bhbr[15] = 6926226095876609922L;
        ey.bhbr[16] = 5813926293183322049L;
        ey.bhbr[17] = 5614763679809725858L;
        ey.bhbr[18] = 9112975753139160424L;
        ey.bhbr[19] = 3132259759047759251L;
        ey.bhbr[20] = -4839948507330712973L;
        ey.bhbr[21] = -4821329977109894239L;
        ey.bhbr[22] = -1962655898710325078L;
        ey.bhbr[23] = -7604950331249303603L;
        ey.bhbr[24] = -2150782301212606240L;
        ey.bhbr[25] = -5688004913477680372L;
        ey.bhbr[26] = 5178485551423429632L;
        ey.bhbr[27] = 6469377530206679341L;
        ey.bhbr[28] = -1455734832296018463L;
        ey.bhbr[29] = -1513248472862109178L;
        ey.bhbr[30] = -1281504309551795751L;
        ey.bhbr[31] = 7495528189917087550L;
        ey.bhbr[32] = -1041484245034928743L;
        ey.bhbr[33] = 4341046216402778401L;
        ey.bhbr[34] = -4054040934538838559L;
        ey.bhbr[35] = 1850205610610550366L;
        ey.bhbr[36] = -3920211030319009796L;
        ey.bhbr[37] = -1496354159210863536L;
        ey.bhbr[38] = -7927510226346109650L;
        ey.bhbr[39] = -6553432309292008807L;
        ey.bhbr[40] = 7573952421200523772L;
        ey.bhbr[41] = -786340995993227684L;
        ey.bhbr[42] = -6499904717068306041L;
        ey.bhbr[43] = 8498441669944262381L;
        ey.bhbr[44] = -3623957150876881558L;
        ey.bhbr[45] = 2709935849361193478L;
        ey.bhbr[46] = 7263471562125665550L;
        ey.bhbr[47] = 8749152699758019130L;
        ey.bhbr[48] = -159568324558798043L;
        ey.bhbr[49] = 7719076802996095144L;
        ey.bhbr[50] = 4471458302320682706L;
        ey.bhbr[51] = -8266095390170390382L;
        ey.bhbr[52] = 7879912763006761815L;
        ey.bhbr[53] = -4028160068581181396L;
        ey.bhbr[54] = 5594909634741227283L;
        ey.bhbr[55] = 289102261130562230L;
        ey.bhbr[56] = -3523148907397798486L;
        ey.bhbr[57] = 426965223886921676L;
        ey.bhbr[58] = -5444176693656143483L;
        ey.bhbr[59] = 1408096706935958524L;
        ey.bhbr[60] = 4657014635818786941L;
        ey.bhbr[61] = -6201191860787559L;
        ey.bhbr[62] = 6743955128995579858L;
        ey.bhbr[63] = 5083624055096977614L;
        ey.bhbr[64] = 5253580084412885493L;
        ey.bhbr[65] = 7279207721651318057L;
        ey.bhbr[66] = -2191726267838682722L;
        ey.bhbr[67] = -1842419698389568487L;
        ey.bhbr[68] = 2828635003384185697L;
        ey.bhbr[69] = 1953849160773700383L;
        ey.bhbr[70] = -7603181850670218608L;
        ey.bhbr[71] = -4350574892894688939L;
        ey.bhbr[72] = 6811205366313410241L;
        ey.bhbr[73] = -2926824210357363526L;
        ey.bhbr[74] = -2525935024823769835L;
        ey.bhbr[75] = 7023272502479765893L;
        ey.bhbr[76] = -8947155122712466880L;
        ey.bhbr[77] = -253551237836019068L;
        ey.bhbr[78] = -7018384722538877155L;
        ey.bhbr[79] = -7903383228715768182L;
        ey.bhbr[80] = -7557897723597436008L;
        ey.bhbr[81] = 546588080408759710L;
        ey.bhbr[82] = 6406615823736947830L;
        ey.bhbr[83] = -5629384489202055574L;
        ey.bhbr[84] = 332533127557868510L;
        ey.bhbr[85] = -1167757202068220049L;
        ey.bhbr[86] = 8181724059488137653L;
        ey.bhbr[87] = -2275732843147968418L;
        ey.bhbr[88] = 7060417721657279410L;
        ey.bhbr[89] = -3764827319169062417L;
        ey.bhbr[90] = -8791047370598330478L;
        ey.bhbr[91] = -2802318298497797098L;
        ey.bhbr[92] = 1344225181400783827L;
        ey.bhbr[93] = -7931274670240825296L;
        ey.bhbr[94] = 7942179301952925329L;
        ey.bhbr[95] = 696132381635423396L;
        ey.bhbr[96] = -588366199030652169L;
        ey.bhbr[97] = -1097354537027072294L;
        ey.bhbr[98] = -2631993909429554879L;
        ey.bhbr[99] = -8338666610160908067L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block91: {
            block90: {
                block89: {
                    block88: {
                        block87: {
                            block86: {
                                var5_2 = ey.c;
                                var4_3 /* !! */  = ey.b;
                                var3_4 = ey.a;
                                if (var5_2) {
                                    throw null;
lbl6:
                                    // 23 sources

                                    return;
                                }
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (ey.mc.field_1724 == null) break block86;
                                if (var3_4) ** GOTO lbl6
                                if (ey.mc.field_1755 != null) break block86;
                                if (var3_4) ** GOTO lbl6
                                if (this.phase == ey$ActionPhase.IDLE) break block87;
                                if (var3_4) ** GOTO lbl6
                            }
                            if (var3_4 || var3_4) ** GOTO lbl6
                            return;
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        var2_5 = this.getBoundItem(var1_1);
                        if (var3_4 || var3_4) ** GOTO lbl6
                        if (var2_5 != null) break block88;
                        if (var3_4 || var3_4) ** GOTO lbl6
                        return;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl6
                    if (this.prepare(var2_5)) break block89;
                    if (var3_4 || var3_4) ** GOTO lbl6
                    pp.brandmessage("\u041f\u0440\u0435\u0434\u043c\u0435\u0442 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
                    if (var3_4 || var3_4) ** GOTO lbl6
                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                if (this.fullStop.isValue()) break block90;
                if (var3_4) ** GOTO lbl6
                if (!this.mode.isSelected("New")) break block91;
                if (var3_4) ** GOTO lbl6
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            this.beginStop(ey$ActionPhase.WAIT_USE_STOP);
            if (var3_4) ** GOTO lbl6
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl62
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        if (!this.mode.isSelected("ReallyWorld")) ** GOTO lbl59
        if (var3_4 || var3_4) ** GOTO lbl6
        this.actionAt = System.currentTimeMillis() + ey.bhbs("bhdj", bhbp(int ), (int)10);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.phase = ey$ActionPhase.WAIT_USE_HALF;
        if (var3_4) ** GOTO lbl6
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl59:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            this.usePreparedItem();
            if (var3_4) ** GOTO lbl6
lbl62:
            // 3 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
lbl65:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdk", bhbz(int ), (int)29);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl70:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdl", bhbz(int ), (int)30);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl75:
            // 4 sources

            case 2: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdm", bhbz(int ), (int)31);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl80:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdn", bhbz(int ), (int)32);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl85:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdo", bhbz(int ), (int)33);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl90:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdp", bhbz(int ), (int)34);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 6: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdq", bhbz(int ), (int)35);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
            case 7: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("bhdr", bhbz(int ), (int)36);
                } while (!var5_2);
                throw null;
            }
lbl104:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ey.bhbs("bhds", bhbz(int ), (int)37);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl176
                    break;
                }
            }
            case 9: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdt", bhbz(int ), (int)38);
                if (!var5_2) ** GOTO lbl65
                throw null;
            }
lbl114:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdu", bhbz(int ), (int)39);
                if (!var5_2) ** GOTO lbl70
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdv", bhbz(int ), (int)40);
                if (!var5_2) ** GOTO lbl75
                throw null;
            }
lbl122:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdw", bhbz(int ), (int)41);
                if (!var5_2) ** GOTO lbl114
                throw null;
            }
lbl126:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdx", bhbz(int ), (int)42);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 14: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdy", bhbz(int ), (int)43);
                if (!var5_2) ** GOTO lbl65
                throw null;
            }
lbl135:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)ey.bhbs("bhdz", bhbz(int ), (int)44);
                if (!var5_2) ** GOTO lbl122
                throw null;
            }
            case 16: {
                var4_3 /* !! */  = (int)ey.bhbs("bhea", bhbz(int ), (int)45);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 17: {
                var4_3 /* !! */  = (int)ey.bhbs("bheb", bhbz(int ), (int)46);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 18: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("bhec", bhbz(int ), (int)47);
                } while (!var5_2);
                throw null;
            }
lbl154:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)ey.bhbs("bhed", bhbz(int ), (int)48);
                if (!var5_2) ** GOTO lbl75
                throw null;
            }
lbl158:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)ey.bhbs("bhee", bhbz(int ), (int)49);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl163:
            // 2 sources

            case 21: {
                var4_3 /* !! */  = (int)ey.bhbs("bhef", bhbz(int ), (int)50);
                if (!var5_2) ** GOTO lbl126
                throw null;
            }
lbl167:
            // 2 sources

            case 22: {
                var4_3 /* !! */  = (int)ey.bhbs("bheg", bhbz(int ), (int)51);
                if (!var5_2) ** GOTO lbl85
                throw null;
            }
            case 23: {
                var4_3 /* !! */  = (int)ey.bhbs("bheh", bhbz(int ), (int)52);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl176:
            // 3 sources

            case 24: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("bhei", bhbz(int ), (int)53);
                } while (!var5_2);
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)ey.bhbs("bhej", bhbz(int ), (int)54);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl186:
            // 4 sources

            case 26: {
                var4_3 /* !! */  = (int)ey.bhbs("bhek", bhbz(int ), (int)55);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 27: {
                var4_3 /* !! */  = (int)ey.bhbs("bhel", bhbz(int ), (int)56);
                if (!var5_2) ** GOTO lbl104
                throw null;
            }
lbl194:
            // 3 sources

            case 28: {
                var4_3 /* !! */  = (int)ey.bhbs("bhem", bhbz(int ), (int)57);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
lbl198:
            // 3 sources

            case 29: {
                var4_3 /* !! */  = (int)ey.bhbs("bhen", bhbz(int ), (int)58);
                if (var5_2) {
                    throw null;
                }
            }
            case 30: {
                var4_3 /* !! */  = (int)ey.bhbs("bheo", bhbz(int ), (int)59);
                if (!var5_2) ** GOTO lbl135
                throw null;
            }
lbl206:
            // 2 sources

            case 31: {
                var4_3 /* !! */  = (int)ey.bhbs("bhep", bhbz(int ), (int)60);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl211:
            // 2 sources

            case 32: {
                var4_3 /* !! */  = (int)ey.bhbs("bheq", bhbz(int ), (int)61);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 33: {
                var4_3 /* !! */  = (int)ey.bhbs("bher", bhbz(int ), (int)62);
                if (!var5_2) ** GOTO lbl75
                throw null;
            }
            case 34: {
                var4_3 /* !! */  = (int)ey.bhbs("bhes", bhbz(int ), (int)63);
                if (!var5_2) ** GOTO lbl122
                throw null;
            }
            case 35: {
                var4_3 /* !! */  = (int)ey.bhbs("bhet", bhbz(int ), (int)64);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl228:
            // 2 sources

            case 36: {
                var4_3 /* !! */  = (int)ey.bhbs("bheu", bhbz(int ), (int)65);
                if (!var5_2) ** GOTO lbl198
                throw null;
            }
lbl232:
            // 3 sources

            case 37: {
                var4_3 /* !! */  = (int)ey.bhbs("bhev", bhbz(int ), (int)66);
                if (!var5_2) ** GOTO lbl206
                throw null;
            }
lbl236:
            // 2 sources

            case 38: {
                var4_3 /* !! */  = (int)ey.bhbs("bhew", bhbz(int ), (int)67);
                if (!var5_2) ** GOTO lbl211
                throw null;
            }
            case 39: {
                var4_3 /* !! */  = (int)ey.bhbs("bhex", bhbz(int ), (int)68);
                if (!var5_2) ** GOTO lbl232
                throw null;
            }
            case 40: {
                do {
                    var4_3 /* !! */  = (int)ey.bhbs("bhey", bhbz(int ), (int)69);
                } while (!var5_2);
                throw null;
            }
            case 41: {
                var4_3 /* !! */  = (int)ey.bhbs("bhez", bhbz(int ), (int)70);
                if (!var5_2) ** GOTO lbl154
                throw null;
            }
            case 42: 
        }
        var4_3 /* !! */  = (int)ey.bhbs("bhfa", bhbz(int ), (int)71);
        ** while (!var5_2)
lbl256:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ey() {
        var2_1 /* !! */  = ey.b;
        var1_2 = ey.a;
        super("HolyWorldHelper", "\u041f\u043e\u043c\u043e\u0449\u043d\u0438\u043a \u0434\u043b\u044f \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u044c\u043d\u044b\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 HolyWorld", du.MISC);
        this.thing = new ka("\u0428\u0442\u0443\u0447\u043a\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0437\u0430\u0440\u044f\u0434");
        this.stun = new ka("\u0421\u0442\u0430\u043d", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0437\u0432\u0435\u0437\u0434\u0443 \u041d\u0435\u0437\u0435\u0440\u0430");
        this.displayStun = new kb("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0441\u0442\u0430\u043d\u0430", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u043e\u0431\u043b\u0430\u0441\u0442\u044c \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u043e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u0433\u043e \u0441\u0442\u0430\u043d\u0430");
        this.explosiveTrap = new ka("\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0422\u0440\u0430\u043f\u043a\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043f\u0440\u0438\u0437\u043c\u0430\u0440\u0438\u043d\u043e\u0432\u044b\u0439 \u043e\u0441\u043a\u043e\u043b\u043e\u043a");
        this.chorusTrap = new ka("\u0422\u0440\u0430\u043f\u043a\u0430 (\u0425\u043e\u0440\u0443\u0441)", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043b\u043e\u043f\u043d\u0443\u0432\u0448\u0438\u0439 \u043f\u043b\u043e\u0434 \u0445\u043e\u0440\u0443\u0441\u0430");
        this.snowball = new ka("\u0421\u043d\u0435\u0436\u043e\u043a", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0441\u043d\u0435\u0436\u043e\u043a");
        this.backpack = new ka("\u0420\u044e\u043a\u0437\u0430\u043a (\u0428\u0430\u043b\u043a\u0435\u0440)", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0448\u0430\u043b\u043a\u0435\u0440\u043e\u0432\u044b\u0439 \u044f\u0449\u0438\u043a");
        this.fullStop = new kb("\u041f\u043e\u043b\u043d\u0430\u044f \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430", "\u041f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u043f\u0435\u0440\u0435\u0434 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c");
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c \u0441\u0432\u0430\u043f\u0430", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u043e, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"});
        this.movement = new nx();
        this.stunAreas = new ArrayList<ey$StunArea>();
        this.phase = ey$ActionPhase.IDLE;
        this.previousSlot = (int)ey.bhbs("bhcm", bhbz(int ), (int)6);
        this.targetSlot = (int)ey.bhbs("bhcn", bhbz(int ), (int)7);
        this.temporaryHotbarSlot = (int)ey.bhbs("bhco", bhbz(int ), (int)8);
        this.itemBinds = List.of(new ex("HW", class_1802.field_8814, this.thing), new ex("HW", class_1802.field_8137, this.stun), new ex("HW", class_1802.field_8662, this.explosiveTrap), new ex("HW", class_1802.field_8882, this.chorusTrap), new ex("HW", class_1802.field_8543, this.snowball), new ex("HW", class_1802.field_8545, this.backpack));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode, this.thing, this.stun, this.explosiveTrap, this.chorusTrap, this.snowball, this.backpack, this.displayStun, this.fullStop});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcp", bhbz(int ), (int)9);
                ** GOTO lbl77
            }
lbl28:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcq", bhbz(int ), (int)10);
                ** GOTO lbl59
            }
lbl31:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcr", bhbz(int ), (int)11);
                ** GOTO lbl59
            }
lbl34:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcs", bhbz(int ), (int)12);
                ** GOTO lbl74
            }
            case 4: {
                var2_1 /* !! */  = (int)ey.bhbs("bhct", bhbz(int ), (int)13);
                ** GOTO lbl44
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ey.bhbs("bhcu", bhbz(int ), (int)14);
                    ** GOTO lbl62
                    break;
                }
            }
lbl44:
            // 4 sources

            case 6: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcv", bhbz(int ), (int)15);
                ** GOTO lbl77
            }
            case 7: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcw", bhbz(int ), (int)16);
                ** GOTO lbl59
            }
            case 8: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcx", bhbz(int ), (int)17);
                ** GOTO lbl34
            }
            case 9: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcy", bhbz(int ), (int)18);
                ** GOTO lbl44
            }
            case 10: {
                var2_1 /* !! */  = (int)ey.bhbs("bhcz", bhbz(int ), (int)19);
                ** GOTO lbl31
            }
lbl59:
            // 4 sources

            case 11: {
                var2_1 /* !! */  = (int)ey.bhbs("bhda", bhbz(int ), (int)20);
                ** GOTO lbl28
            }
lbl62:
            // 2 sources

            case 12: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdb", bhbz(int ), (int)21);
                ** GOTO lbl34
            }
            case 13: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdc", bhbz(int ), (int)22);
                ** GOTO lbl28
            }
lbl68:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdd", bhbz(int ), (int)23);
                ** GOTO lbl31
            }
            case 15: {
                var2_1 /* !! */  = (int)ey.bhbs("bhde", bhbz(int ), (int)24);
                ** GOTO lbl68
            }
lbl74:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdf", bhbz(int ), (int)25);
                ** GOTO lbl34
            }
lbl77:
            // 3 sources

            case 17: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdg", bhbz(int ), (int)26);
            }
            case 18: {
                var2_1 /* !! */  = (int)ey.bhbs("bhdh", bhbz(int ), (int)27);
                ** GOTO lbl44
            }
            case 19: 
        }
        var2_1 /* !! */  = (int)ey.bhbs("bhdi", bhbz(int ), (int)28);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void drawStunSquare(class_243 var1_1, class_243 var2_2, int var3_3, float var4_4) {
        var22_5 = ey.c;
        var21_6 /* !! */  = ey.b;
        var20_7 = ey.a;
        if (var22_5) {
            throw null;
        }
        if (var20_7 || var20_7) ** GOTO lbl42
        var5_8 = var1_1.field_1352 - ey.bhbs("bhmy", bhmx(int ), (int)24);
        if (var20_7 || var20_7) ** GOTO lbl42
        var7_9 = var1_1.field_1352 + ey.bhbs("bhmz", bhmx(int ), (int)25);
        if (var20_7 || var20_7) ** GOTO lbl42
        var9_10 = var1_1.field_1350 - ey.bhbs("bhna", bhmx(int ), (int)26);
        if (var20_7 || var20_7) ** GOTO lbl42
        var11_11 = var1_1.field_1350 + ey.bhbs("bhnb", bhmx(int ), (int)27);
        if (var20_7 || var20_7) ** GOTO lbl42
        var13_12 = var1_1.field_1351 + ey.bhbs("bhnc", bhmx(int ), (int)28);
        if (var20_7 || var20_7) ** GOTO lbl42
        ls.box(new class_238(var5_8, var13_12, var9_10, var7_9, var13_12 + ey.bhbs("bhnd", bhmx(int ), (int)29), var11_11), var3_3, var4_4 * ey.bhbs("bhne", bhjk(int ), (int)262));
        if (var20_7 || var20_7) ** GOTO lbl42
        var15_13 = (float)(var5_8 - var2_2.field_1352);
        if (var20_7 || var20_7) ** GOTO lbl42
        var16_14 = (float)(var7_9 - var2_2.field_1352);
        if (var20_7 || var20_7) ** GOTO lbl42
        var17_15 = (float)(var9_10 - var2_2.field_1350);
        if (var20_7 || var20_7) ** GOTO lbl42
        var18_16 = (float)(var11_11 - var2_2.field_1350);
        if (var20_7 || var20_7) ** GOTO lbl42
        var19_17 = (float)(var13_12 - var2_2.field_1351);
        if (var20_7 || var20_7) ** GOTO lbl42
        lv.line(var15_13, var19_17, var17_15, var16_14, var19_17, var17_15, var3_3, var4_4);
        if (var20_7 || var20_7) ** GOTO lbl42
        lv.line(var16_14, var19_17, var17_15, var16_14, var19_17, var18_16, var3_3, var4_4);
        if (var20_7 || var20_7) ** GOTO lbl42
        lv.line(var16_14, var19_17, var18_16, var15_13, var19_17, var18_16, var3_3, var4_4);
        if (var20_7 || var20_7) ** GOTO lbl42
        if (var21_6 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block36: while (true) {
            block74: {
                switch (cfr_temp_0 == -2147483648 ? var21_6 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        lv.line(var15_13, var19_17, var18_16, var15_13, var19_17, var17_15, var3_3, var4_4);
                        if (!var20_7 && !var20_7) ** GOTO lbl43
lbl42:
                        // 16 sources

                        return;
lbl43:
                        // 1 sources

                        return;
                    }
                    case 0: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnf", bhbz(int ), (int)263);
                        cfr_temp_0 = 29;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 1: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhng", bhbz(int ), (int)264);
                        cfr_temp_0 = 15;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 4: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnj", bhbz(int ), (int)267);
                        cfr_temp_0 = 28;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 9: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhno", bhbz(int ), (int)272);
                        if (!var22_5) ** break;
                        throw null;
                    }
                    case 10: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnp", bhbz(int ), (int)273);
                        cfr_temp_0 = 16;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 12: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnr", bhbz(int ), (int)275);
                        cfr_temp_0 = 28;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 13: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhns", bhbz(int ), (int)276);
                        cfr_temp_0 = 3;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 15: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnu", bhbz(int ), (int)278);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 7: {
                        ** GOTO lbl169
                    }
                    case 16: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnv", bhbz(int ), (int)279);
                        cfr_temp_0 = 11;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 18: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnx", bhbz(int ), (int)281);
                        if (!var22_5) ** break;
                        throw null;
                    }
                    case 20: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnz", bhbz(int ), (int)283);
                        cfr_temp_0 = 6;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 24: {
                        do {
                            var21_6 /* !! */  = (int)ey.bhbs("bhod", bhbz(int ), (int)287);
                        } while (!var22_5);
                        throw null;
                    }
                    case 26: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhof", bhbz(int ), (int)289);
                        cfr_temp_0 = 8;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 28: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoh", bhbz(int ), (int)291);
                        cfr_temp_0 = 25;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 29: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoi", bhbz(int ), (int)292);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 25: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoe", bhbz(int ), (int)288);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 23: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoc", bhbz(int ), (int)286);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 19: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhny", bhbz(int ), (int)282);
                        cfr_temp_0 = 2;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 31: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhok", bhbz(int ), (int)294);
                        cfr_temp_0 = 17;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 32: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhol", bhbz(int ), (int)295);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 5: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnk", bhbz(int ), (int)268);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 3: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhni", bhbz(int ), (int)266);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 30: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoj", bhbz(int ), (int)293);
                        cfr_temp_0 = 17;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 33: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhom", bhbz(int ), (int)296);
                        if (var22_5) {
                            throw null;
                        }
lbl169:
                        // 3 sources

                        var21_6 /* !! */  = (int)ey.bhbs("bhnm", bhbz(int ), (int)270);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 8: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnn", bhbz(int ), (int)271);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 11: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnq", bhbz(int ), (int)274);
                        cfr_temp_0 = 22;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 2: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnh", bhbz(int ), (int)265);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 14: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnt", bhbz(int ), (int)277);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 21: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhoa", bhbz(int ), (int)284);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 6: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnl", bhbz(int ), (int)269);
                        cfr_temp_0 = 2;
                        if (var22_5) {
                            throw null;
                        }
                        break block74;
                    }
                    case 17: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhnw", bhbz(int ), (int)280);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 27: {
                        var21_6 /* !! */  = (int)ey.bhbs("bhog", bhbz(int ), (int)290);
                        if (var22_5) {
                            throw null;
                        }
                    }
                    case 22: 
                }
                ** GOTO lbl213
            }
            do {
                if (true) continue block36;
lbl213:
                // 2 sources

                var21_6 /* !! */  = (int)ey.bhbs("bhob", bhbz(int ), (int)285);
                cfr_temp_0 = 17;
            } while (!var22_5);
            break;
        }
        throw null;
    }

    public static /* synthetic */ CallSite bhbs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ double bhmx(int n2) {
        return Double.longBitsToDouble(bhbq[n2] ^ bhbr[n2]);
    }

    private static /* synthetic */ void bipw() {
        ey.bhca[400] = 1821821255;
        ey.bhca[401] = -158671037;
        ey.bhca[402] = -279787348;
        ey.bhca[403] = 844213726;
        ey.bhca[404] = 1327203013;
        ey.bhca[405] = 106983266;
        ey.bhca[406] = -11570693;
        ey.bhca[407] = -1757386078;
        ey.bhca[408] = 1158676368;
        ey.bhca[409] = 562319496;
        ey.bhca[410] = -298507945;
        ey.bhca[411] = -888985504;
        ey.bhca[412] = 1163181391;
        ey.bhca[413] = 1230504401;
        ey.bhca[414] = 1081435415;
        ey.bhca[415] = -584746389;
        ey.bhca[416] = 251648951;
        ey.bhca[417] = -560791540;
        ey.bhca[418] = 1470014316;
        ey.bhca[419] = 1311402219;
        ey.bhca[420] = 440163685;
        ey.bhca[421] = 33421248;
        ey.bhca[422] = 761777664;
        ey.bhca[423] = 234039838;
        ey.bhca[424] = -236238506;
        ey.bhca[425] = -253836801;
        ey.bhca[426] = 1071302592;
        ey.bhca[427] = -1514860881;
        ey.bhca[428] = 1992267935;
        ey.bhca[429] = 431249807;
        ey.bhca[430] = -887945251;
        ey.bhca[431] = 1798776574;
        ey.bhca[432] = 1233080065;
        ey.bhca[433] = -353673577;
        ey.bhca[434] = -219653120;
        ey.bhca[435] = 1027965411;
        ey.bhca[436] = 1899057357;
        ey.bhca[437] = 216178177;
        ey.bhca[438] = -360351429;
        ey.bhca[439] = -638877941;
        ey.bhca[440] = -1427920331;
        ey.bhca[441] = 1184879438;
        ey.bhca[442] = -946260475;
        ey.bhca[443] = 1423133676;
        ey.bhca[444] = -1480211130;
        ey.bhca[445] = 1133461939;
        ey.bhca[446] = -2042934560;
        ey.bhca[447] = 33673770;
        ey.bhca[448] = 1597095098;
        ey.bhca[449] = 1209160861;
        ey.bhca[450] = 475670651;
        ey.bhca[451] = -1701490339;
        ey.bhca[452] = 429197822;
        ey.bhca[453] = -1553934975;
        ey.bhca[454] = 839012224;
        ey.bhca[455] = -1309387170;
        ey.bhca[456] = 1934463282;
        ey.bhca[457] = -1875619286;
        ey.bhca[458] = 791688300;
        ey.bhca[459] = -1667064607;
        ey.bhca[460] = 1473970198;
        ey.bhca[461] = 50801850;
        ey.bhca[462] = 1196306773;
        ey.bhca[463] = -928636692;
        ey.bhca[464] = 2063435822;
        ey.bhca[465] = 1240730321;
        ey.bhca[466] = -2086325417;
        ey.bhca[467] = -1107091853;
        ey.bhca[468] = -586639717;
        ey.bhca[469] = -1798716926;
        ey.bhca[470] = 2065245616;
        ey.bhca[471] = -1692660427;
        ey.bhca[472] = -1115055229;
        ey.bhca[473] = 1969652695;
        ey.bhca[474] = -1555141400;
        ey.bhca[475] = -578232142;
        ey.bhca[476] = -2030050076;
        ey.bhca[477] = 1721226916;
        ey.bhca[478] = 1636410282;
        ey.bhca[479] = 1379406678;
        ey.bhca[480] = -221062112;
        ey.bhca[481] = -1505126972;
        ey.bhca[482] = -532100417;
        ey.bhca[483] = -918515398;
        ey.bhca[484] = -2072037214;
        ey.bhca[485] = -840563073;
        ey.bhca[486] = 1374632290;
        ey.bhca[487] = -499524794;
        ey.bhca[488] = 1729977733;
        ey.bhca[489] = -843929671;
        ey.bhca[490] = 1119279247;
        ey.bhca[491] = -870224594;
        ey.bhca[492] = 1147619379;
        ey.bhca[493] = 1148627256;
        ey.bhca[494] = 295995366;
        ey.bhca[495] = -1987035019;
        ey.bhca[496] = 785950972;
        ey.bhca[497] = -1042953170;
        ey.bhca[498] = -644002484;
        ey.bhca[499] = -649355087;
    }
}

