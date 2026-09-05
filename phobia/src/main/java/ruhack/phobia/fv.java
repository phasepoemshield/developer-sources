/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_2596
 *  net.minecraft.class_2813
 *  net.minecraft.class_2815
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  net.minecraft.class_490
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
import java.util.function.Supplier;
import net.minecraft.class_1041;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.mo;

public final class fv
extends ds {
    public static final boolean a;
    public static final boolean c;
    static final long rr = -4031166294916451147L;
    private static long[] jluj;
    private long resumeAt;
    private static int[] jltw;
    private boolean flushing;
    private static final String REALLY_WORLD = "ReallyWorld";
    private long flushAt;
    private static final long SWAP_STEP_MS = 25L;
    private static int[] jltx;
    private class_2815 queuedClosePacket;
    private final kb fullStop;
    private static final long INITIAL_SWAP_STOP_MS = 100L;
    public static final int b;
    private static final long AFTER_SWAP_STOP_MS = 100L;
    private static final int PACKETS_PER_STEP = 3;
    private static final String NORMAL = "\u041e\u0431\u044b\u0447\u043d\u044b\u0439";
    private static long[] jlui;
    private final kf mode;
    private final List<class_2596<?>> queuedPackets;

    private static /* synthetic */ void jnkj() {
        fv.jltx[300] = -1379616414;
        fv.jltx[301] = 1286856907;
        fv.jltx[302] = 141948046;
        fv.jltx[303] = -1634744932;
        fv.jltx[304] = -1937510654;
        fv.jltx[305] = 433757745;
        fv.jltx[306] = -1835228401;
        fv.jltx[307] = 1934577430;
        fv.jltx[308] = -232562502;
        fv.jltx[309] = 106490056;
        fv.jltx[310] = 178551056;
        fv.jltx[311] = 1876510089;
        fv.jltx[312] = -1724479276;
        fv.jltx[313] = 2137794930;
        fv.jltx[314] = -1320281464;
        fv.jltx[315] = -496634790;
        fv.jltx[316] = -1042132951;
        fv.jltx[317] = 226608683;
        fv.jltx[318] = 650155575;
        fv.jltx[319] = 538301206;
        fv.jltx[320] = -787764178;
        fv.jltx[321] = -493891136;
        fv.jltx[322] = 733390183;
        fv.jltx[323] = 988290531;
        fv.jltx[324] = 1055723691;
        fv.jltx[325] = 565244914;
        fv.jltx[326] = -1373433334;
        fv.jltx[327] = -897147197;
        fv.jltx[328] = -1352779345;
        fv.jltx[329] = 2048302677;
        fv.jltx[330] = -670690359;
        fv.jltx[331] = 355354394;
        fv.jltx[332] = 1417289923;
        fv.jltx[333] = 1710173050;
        fv.jltx[334] = -2070746532;
        fv.jltx[335] = -691446419;
        fv.jltx[336] = 1653772642;
        fv.jltx[337] = -747877296;
        fv.jltx[338] = -1906030308;
        fv.jltx[339] = 710427500;
        fv.jltx[340] = -1755049816;
        fv.jltx[341] = 167274439;
        fv.jltx[342] = -1101830186;
        fv.jltx[343] = -804120527;
        fv.jltx[344] = -160166840;
        fv.jltx[345] = 1567609013;
        fv.jltx[346] = -412168991;
        fv.jltx[347] = 1903606474;
        fv.jltx[348] = -1129413437;
        fv.jltx[349] = -1893927427;
        fv.jltx[350] = 1590371442;
        fv.jltx[351] = -1608519436;
        fv.jltx[352] = 2096604886;
        fv.jltx[353] = -695930643;
        fv.jltx[354] = 2126100782;
        fv.jltx[355] = 616019497;
        fv.jltx[356] = 1505298483;
        fv.jltx[357] = 1426331112;
        fv.jltx[358] = 429220352;
        fv.jltx[359] = 357955293;
        fv.jltx[360] = 1538882420;
        fv.jltx[361] = -183473340;
        fv.jltx[362] = -1844446932;
        fv.jltx[363] = -437765117;
        fv.jltx[364] = -1040849578;
        fv.jltx[365] = -1034169330;
        fv.jltx[366] = -1114374243;
        fv.jltx[367] = -400441753;
        fv.jltx[368] = 1296054868;
        fv.jltx[369] = 824075144;
        fv.jltx[370] = 74896821;
        fv.jltx[371] = -261402087;
        fv.jltx[372] = 1376884135;
        fv.jltx[373] = 1498733217;
        fv.jltx[374] = 1534157344;
        fv.jltx[375] = -2135028547;
        fv.jltx[376] = 1734247490;
        fv.jltx[377] = -897220633;
        fv.jltx[378] = -2032833450;
        fv.jltx[379] = -1888739840;
        fv.jltx[380] = -1463242263;
        fv.jltx[381] = -1221267879;
        fv.jltx[382] = -2002841957;
        fv.jltx[383] = -599011158;
        fv.jltx[384] = 183209993;
        fv.jltx[385] = -766938986;
        fv.jltx[386] = -1298988692;
        fv.jltx[387] = 642235411;
        fv.jltx[388] = -1318480499;
        fv.jltx[389] = 1728566252;
        fv.jltx[390] = -1377559574;
        fv.jltx[391] = 1676447453;
        fv.jltx[392] = -638953372;
        fv.jltx[393] = -118145198;
        fv.jltx[394] = 1349882585;
        fv.jltx[395] = -2050069888;
        fv.jltx[396] = -596781546;
        fv.jltx[397] = -551060260;
        fv.jltx[398] = 1846993607;
        fv.jltx[399] = 1478867033;
    }

    private static /* synthetic */ void jnke() {
        fv.jltw[300] = -1379616414;
        fv.jltw[301] = 1286856905;
        fv.jltw[302] = 141948044;
        fv.jltw[303] = -1634744931;
        fv.jltw[304] = -1937510655;
        fv.jltw[305] = 433757745;
        fv.jltw[306] = -1835228401;
        fv.jltw[307] = 1934577430;
        fv.jltw[308] = -232562502;
        fv.jltw[309] = 106490063;
        fv.jltw[310] = 178551049;
        fv.jltw[311] = 1876510110;
        fv.jltw[312] = -1724479288;
        fv.jltw[313] = 2137794914;
        fv.jltw[314] = -1320281411;
        fv.jltw[315] = -496634813;
        fv.jltw[316] = -1042132977;
        fv.jltw[317] = 226608695;
        fv.jltw[318] = 650155576;
        fv.jltw[319] = 538301242;
        fv.jltw[320] = -787764189;
        fv.jltw[321] = -493891130;
        fv.jltw[322] = 733390144;
        fv.jltw[323] = 988290550;
        fv.jltw[324] = 1055723704;
        fv.jltw[325] = 565244906;
        fv.jltw[326] = -1373433318;
        fv.jltw[327] = -897147167;
        fv.jltw[328] = -1352779330;
        fv.jltw[329] = 2048302658;
        fv.jltw[330] = -670690349;
        fv.jltw[331] = 355354393;
        fv.jltw[332] = 1417289927;
        fv.jltw[333] = 1710173011;
        fv.jltw[334] = -2070746503;
        fv.jltw[335] = -691446406;
        fv.jltw[336] = 1653772626;
        fv.jltw[337] = -747877258;
        fv.jltw[338] = -1906030281;
        fv.jltw[339] = 710427469;
        fv.jltw[340] = -1755049803;
        fv.jltw[341] = 167274479;
        fv.jltw[342] = -1101830197;
        fv.jltw[343] = -804120556;
        fv.jltw[344] = -160166836;
        fv.jltw[345] = 1567608978;
        fv.jltw[346] = -412168989;
        fv.jltw[347] = 1903606485;
        fv.jltw[348] = -1129413408;
        fv.jltw[349] = -1893927456;
        fv.jltw[350] = 1590371444;
        fv.jltw[351] = -1608519455;
        fv.jltw[352] = 2096604874;
        fv.jltw[353] = -695930637;
        fv.jltw[354] = 2126100770;
        fv.jltw[355] = 616019457;
        fv.jltw[356] = 1505298458;
        fv.jltw[357] = 1426331118;
        fv.jltw[358] = 429220381;
        fv.jltw[359] = 357955287;
        fv.jltw[360] = 1538882386;
        fv.jltw[361] = -183473320;
        fv.jltw[362] = -1844446970;
        fv.jltw[363] = -437765102;
        fv.jltw[364] = 1040849577;
        fv.jltw[365] = 1184979908;
        fv.jltw[366] = 1114374242;
        fv.jltw[367] = 655023488;
        fv.jltw[368] = -1296054869;
        fv.jltw[369] = 252331696;
        fv.jltw[370] = -74896822;
        fv.jltw[371] = -651170991;
        fv.jltw[372] = -1376884136;
        fv.jltw[373] = 2058714228;
        fv.jltw[374] = 1534157345;
        fv.jltw[375] = -645037644;
        fv.jltw[376] = -1734247491;
        fv.jltw[377] = -1040673969;
        fv.jltw[378] = 2032833449;
        fv.jltw[379] = 911566241;
        fv.jltw[380] = -1463242263;
        fv.jltw[381] = -1221267873;
        fv.jltw[382] = -2002841966;
        fv.jltw[383] = -599011157;
        fv.jltw[384] = 183209984;
        fv.jltw[385] = -766938986;
        fv.jltw[386] = -1298988692;
        fv.jltw[387] = 642235409;
        fv.jltw[388] = -1318480501;
        fv.jltw[389] = 1728566240;
        fv.jltw[390] = -1377559575;
        fv.jltw[391] = 1676447445;
        fv.jltw[392] = -638953364;
        fv.jltw[393] = -118145193;
        fv.jltw[394] = 1349882578;
        fv.jltw[395] = -2050069883;
        fv.jltw[396] = 596781545;
        fv.jltw[397] = 1658028833;
        fv.jltw[398] = -1846993608;
        fv.jltw[399] = 951013577;
    }

    private static /* synthetic */ void jnkq() {
        fv.jluj[200] = 266582771885363043L;
        fv.jluj[201] = -5495379877630042272L;
        fv.jluj[202] = -3200061093415934727L;
        fv.jluj[203] = -4879848693780304455L;
        fv.jluj[204] = 5711815384744502733L;
        fv.jluj[205] = -355534115131210967L;
        fv.jluj[206] = 732989444075986315L;
        fv.jluj[207] = -5825601675009247101L;
        fv.jluj[208] = -4283439440578132354L;
        fv.jluj[209] = -5084190263140186216L;
        fv.jluj[210] = -7911443979956041207L;
        fv.jluj[211] = -5869537239126326891L;
        fv.jluj[212] = -1210541411988524008L;
        fv.jluj[213] = -7156917006088670507L;
        fv.jluj[214] = 1875883024117622551L;
        fv.jluj[215] = -5259733486588157012L;
        fv.jluj[216] = 350587988092388940L;
        fv.jluj[217] = 4683126200149766076L;
        fv.jluj[218] = -3227668253679982001L;
        fv.jluj[219] = 8923913397824619194L;
        fv.jluj[220] = 3856131949224285096L;
        fv.jluj[221] = -4553220813244913724L;
        fv.jluj[222] = -1825577528379918508L;
        fv.jluj[223] = 657552842957362588L;
        fv.jluj[224] = 1575195431790294061L;
        fv.jluj[225] = -8227927971708059863L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block89: {
            block88: {
                block87: {
                    var6_2 = fv.c;
                    var5_3 /* !! */  = fv.b;
                    var4_4 = fv.a;
                    if (var6_2) {
                        throw null;
lbl6:
                        // 26 sources

                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (!var1_1.isSend()) break block87;
                    if (var4_4) ** GOTO lbl6
                    if (this.flushing) break block87;
                    if (var4_4) ** GOTO lbl6
                    if (!this.mode.isSelected("ReallyWorld")) break block87;
                    if (var4_4) ** GOTO lbl6
                    if (fv.mc.field_1724 != null) break block88;
                    if (var4_4) ** GOTO lbl6
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2813)) break block89;
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_2813)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!(fv.mc.field_1755 instanceof class_490)) break block89;
            if (var4_4) ** GOTO lbl6
            if (!this.isMovingPhysically()) break block89;
            if (var4_4 || var4_4) ** GOTO lbl6
            this.queuedPackets.add((class_2596<?>)var2_6);
            if (var4_4 || var4_4) ** GOTO lbl6
            var1_1.setCancelled((boolean)fv.jlty("jlww", jltv(int ), (int)67));
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                var3_5 = var1_1.getPacket();
                if (var4_4) ** GOTO lbl6
                if (!(var3_5 instanceof class_2815)) ** GOTO lbl63
                if (var4_4) ** GOTO lbl6
                var2_6 = (class_2815)var3_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.queuedPackets.isEmpty()) ** GOTO lbl63
                if (var4_4 || var4_4) ** GOTO lbl6
                this.queuedClosePacket = var2_6;
                if (var4_4 || var4_4) ** GOTO lbl6
                this.flushAt = System.currentTimeMillis() + fv.jlty("jlwx", jluh(int ), (int)5);
                if (var4_4 || var4_4) ** GOTO lbl6
                this.resumeAt = (long)fv.jlty("jlwy", jluh(int ), (int)6);
                if (var4_4 || var4_4) ** GOTO lbl6
                var1_1.setCancelled((boolean)fv.jlty("jlwz", jltv(int ), (int)68));
                if (var4_4 || var4_4) ** GOTO lbl6
                this.releaseMovementKeys();
                if (var4_4 || var4_4) ** GOTO lbl6
                this.applyFullStop();
                if (var4_4) ** GOTO lbl6
lbl63:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl66:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)fv.jlty("jlxa", jltv(int ), (int)69);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl71:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)fv.jlty("jlxb", jltv(int ), (int)70);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 2: {
                var5_3 /* !! */  = (int)fv.jlty("jlxc", jltv(int ), (int)71);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 3: {
                var5_3 /* !! */  = (int)fv.jlty("jlxd", jltv(int ), (int)72);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 4: {
                do {
                    var5_3 /* !! */  = (int)fv.jlty("jlxe", jltv(int ), (int)73);
                } while (!var6_2);
                throw null;
            }
lbl91:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)fv.jlty("jlxf", jltv(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
            }
            case 6: {
                var5_3 /* !! */  = (int)fv.jlty("jlxg", jltv(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl100:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)fv.jlty("jlxh", jltv(int ), (int)76);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl105:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)fv.jlty("jlxi", jltv(int ), (int)77);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl110:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)fv.jlty("jlxj", jltv(int ), (int)78);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)fv.jlty("jlxk", jltv(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl119:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)fv.jlty("jlxl", jltv(int ), (int)80);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 12: {
                var5_3 /* !! */  = (int)fv.jlty("jlxm", jltv(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl129:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)fv.jlty("jlxn", jltv(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl134:
            // 4 sources

            case 14: {
                var5_3 /* !! */  = (int)fv.jlty("jlxo", jltv(int ), (int)83);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl139:
            // 4 sources

            case 15: {
                var5_3 /* !! */  = (int)fv.jlty("jlxp", jltv(int ), (int)84);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 16: {
                var5_3 /* !! */  = (int)fv.jlty("jlxq", jltv(int ), (int)85);
                if (!var6_2) ** GOTO lbl71
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)fv.jlty("jlxr", jltv(int ), (int)86);
                if (!var6_2) ** GOTO lbl119
                throw null;
            }
lbl152:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)fv.jlty("jlxs", jltv(int ), (int)87);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl157:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)fv.jlty("jlxt", jltv(int ), (int)88);
                if (var6_2) {
                    throw null;
                }
            }
            case 20: {
                var5_3 /* !! */  = (int)fv.jlty("jlxu", jltv(int ), (int)89);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl166:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)fv.jlty("jlxv", jltv(int ), (int)90);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl171:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)fv.jlty("jlxw", jltv(int ), (int)91);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 23: {
                var5_3 /* !! */  = (int)fv.jlty("jlxx", jltv(int ), (int)92);
                if (!var6_2) ** GOTO lbl166
                throw null;
            }
lbl180:
            // 3 sources

            case 24: {
                var5_3 /* !! */  = (int)fv.jlty("jlxy", jltv(int ), (int)93);
                if (!var6_2) ** GOTO lbl157
                throw null;
            }
lbl184:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)fv.jlty("jlxz", jltv(int ), (int)94);
                if (!var6_2) ** GOTO lbl134
                throw null;
            }
lbl188:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)fv.jlty("jlya", jltv(int ), (int)95);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
lbl192:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)fv.jlty("jlyb", jltv(int ), (int)96);
                if (!var6_2) ** GOTO lbl66
                throw null;
            }
lbl196:
            // 2 sources

            case 28: {
                var5_3 /* !! */  = (int)fv.jlty("jlyc", jltv(int ), (int)97);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl201:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)fv.jlty("jlyd", jltv(int ), (int)98);
                if (!var6_2) ** GOTO lbl157
                throw null;
            }
lbl205:
            // 3 sources

            case 30: {
                var5_3 /* !! */  = (int)fv.jlty("jlye", jltv(int ), (int)99);
                if (!var6_2) ** GOTO lbl188
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)fv.jlty("jlyf", jltv(int ), (int)100);
                if (!var6_2) ** GOTO lbl129
                throw null;
            }
lbl213:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)fv.jlty("jlyg", jltv(int ), (int)101);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fv.jlty("jlyh", jltv(int ), (int)102);
                    if (!var6_2) ** GOTO lbl134
                    throw null;
                }
            }
lbl223:
            // 2 sources

            case 34: {
                var5_3 /* !! */  = (int)fv.jlty("jlyi", jltv(int ), (int)103);
                if (!var6_2) ** GOTO lbl152
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)fv.jlty("jlyj", jltv(int ), (int)104);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)fv.jlty("jlyk", jltv(int ), (int)105);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
lbl235:
            // 3 sources

            case 37: {
                var5_3 /* !! */  = (int)fv.jlty("jlyl", jltv(int ), (int)106);
                if (!var6_2) ** GOTO lbl139
                throw null;
            }
lbl239:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)fv.jlty("jlym", jltv(int ), (int)107);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
            case 39: {
                var5_3 /* !! */  = (int)fv.jlty("jlyn", jltv(int ), (int)108);
                if (!var6_2) ** GOTO lbl134
                throw null;
            }
            case 40: {
                var5_3 /* !! */  = (int)fv.jlty("jlyo", jltv(int ), (int)109);
                if (!var6_2) ** GOTO lbl119
                throw null;
            }
            case 41: {
                var5_3 /* !! */  = (int)fv.jlty("jlyp", jltv(int ), (int)110);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 42: {
                var5_3 /* !! */  = (int)fv.jlty("jlyq", jltv(int ), (int)111);
                if (!var6_2) ** GOTO lbl139
                throw null;
            }
lbl260:
            // 5 sources

            case 43: {
                var5_3 /* !! */  = (int)fv.jlty("jlyr", jltv(int ), (int)112);
                if (!var6_2) ** GOTO lbl139
                throw null;
            }
            case 44: 
        }
        var5_3 /* !! */  = (int)fv.jlty("jlys", jltv(int ), (int)113);
        ** while (!var6_2)
lbl267:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jnko() {
        fv.jluj[0] = 1528363372719659260L;
        fv.jluj[1] = -1227456908746244853L;
        fv.jluj[2] = 5326506432809057740L;
        fv.jluj[3] = -2487603196261187631L;
        fv.jluj[4] = 7716359562169638802L;
        fv.jluj[5] = 6726970022265767919L;
        fv.jluj[6] = -2684334801985744695L;
        fv.jluj[7] = -8382569333321630815L;
        fv.jluj[8] = 1143966465821789956L;
        fv.jluj[9] = -4824292422275627604L;
        fv.jluj[10] = 6810818559741719315L;
        fv.jluj[11] = -2532281394034506196L;
        fv.jluj[12] = -7699947136530008694L;
        fv.jluj[13] = 3701696705433080506L;
        fv.jluj[14] = -5477106350049113185L;
        fv.jluj[15] = 8874353278976192052L;
        fv.jluj[16] = 6665735600105884702L;
        fv.jluj[17] = -351925520313831849L;
        fv.jluj[18] = 4600617455619851190L;
        fv.jluj[19] = -4830721723453105877L;
        fv.jluj[20] = -8685636308231059236L;
        fv.jluj[21] = -6513285164730354294L;
        fv.jluj[22] = -7927884720300498973L;
        fv.jluj[23] = -6035750079566292580L;
        fv.jluj[24] = -5203515580834972285L;
        fv.jluj[25] = 603814162170869364L;
        fv.jluj[26] = -5309950391464148198L;
        fv.jluj[27] = -6910386750610813486L;
        fv.jluj[28] = 768671676894738893L;
        fv.jluj[29] = 7606748500694735183L;
        fv.jluj[30] = 1611914540451738244L;
        fv.jluj[31] = 3025732695097190033L;
        fv.jluj[32] = 7823762807001536468L;
        fv.jluj[33] = -1539025227503206838L;
        fv.jluj[34] = -9118883348311004780L;
        fv.jluj[35] = -1384640528270841584L;
        fv.jluj[36] = 6315992403204470754L;
        fv.jluj[37] = 3381052328656362214L;
        fv.jluj[38] = 2609180868684621784L;
        fv.jluj[39] = 4170901174170843665L;
        fv.jluj[40] = 8657077040139667928L;
        fv.jluj[41] = 3910006270969437648L;
        fv.jluj[42] = 248088014006458444L;
        fv.jluj[43] = -2185236386172565524L;
        fv.jluj[44] = 4891864372049548691L;
        fv.jluj[45] = 8184560926597311898L;
        fv.jluj[46] = -1877514793133693177L;
        fv.jluj[47] = 6963485621656578307L;
        fv.jluj[48] = -4864046576102487163L;
        fv.jluj[49] = -2148530746705757086L;
        fv.jluj[50] = 8466011003319155231L;
        fv.jluj[51] = -564479184221874116L;
        fv.jluj[52] = -6320639905421882154L;
        fv.jluj[53] = 7971978863130157790L;
        fv.jluj[54] = 4430305967101563319L;
        fv.jluj[55] = -6336747390777348228L;
        fv.jluj[56] = 6420419875305296857L;
        fv.jluj[57] = 6780799539699396103L;
        fv.jluj[58] = 6154388215319294923L;
        fv.jluj[59] = 4336211391896576778L;
        fv.jluj[60] = -3828615796531529850L;
        fv.jluj[61] = 5201306724764480181L;
        fv.jluj[62] = 5286876423113558495L;
        fv.jluj[63] = -9202376578731061538L;
        fv.jluj[64] = 6751548132816880176L;
        fv.jluj[65] = 9048508149084148608L;
        fv.jluj[66] = 4646111997934518785L;
        fv.jluj[67] = 524716513587694764L;
        fv.jluj[68] = 4042177416533135639L;
        fv.jluj[69] = 7745099837895453371L;
        fv.jluj[70] = -5082294830029885184L;
        fv.jluj[71] = 7965539326590950680L;
        fv.jluj[72] = 9043064543086287948L;
        fv.jluj[73] = 8112897383008133054L;
        fv.jluj[74] = -9071347691812278702L;
        fv.jluj[75] = -9188624125713925438L;
        fv.jluj[76] = -6534955824361357015L;
        fv.jluj[77] = 8092676103128637357L;
        fv.jluj[78] = -4385051761981875287L;
        fv.jluj[79] = 6440768615174745023L;
        fv.jluj[80] = 6054681006724684098L;
        fv.jluj[81] = 3979625098888716967L;
        fv.jluj[82] = -3370539969379847716L;
        fv.jluj[83] = 3693648044614170739L;
        fv.jluj[84] = 1714814435397640742L;
        fv.jluj[85] = -3089125905789774460L;
        fv.jluj[86] = -1959105610960555059L;
        fv.jluj[87] = -1242496259010309875L;
        fv.jluj[88] = -604883171263630635L;
        fv.jluj[89] = 6067196655362104987L;
        fv.jluj[90] = 7652824273066129180L;
        fv.jluj[91] = 4185940015313626285L;
        fv.jluj[92] = 5566684635200537352L;
        fv.jluj[93] = -6000387761451102054L;
        fv.jluj[94] = -320459131291545115L;
        fv.jluj[95] = -2823635569315270060L;
        fv.jluj[96] = 8675812123289029428L;
        fv.jluj[97] = 1656368132909924049L;
        fv.jluj[98] = 3725359296016088370L;
        fv.jluj[99] = -4620488861671033441L;
    }

    private static /* synthetic */ void jnkp() {
        fv.jluj[100] = -5053892103704520448L;
        fv.jluj[101] = -5225854846541949597L;
        fv.jluj[102] = 6131354233826902768L;
        fv.jluj[103] = 1807764476992053385L;
        fv.jluj[104] = 2819205820285394820L;
        fv.jluj[105] = 7815402077930231410L;
        fv.jluj[106] = 3938673035233899539L;
        fv.jluj[107] = 3690320066012562432L;
        fv.jluj[108] = 837477608728471186L;
        fv.jluj[109] = -349913321408580599L;
        fv.jluj[110] = 898831447437196807L;
        fv.jluj[111] = -7156056257964688414L;
        fv.jluj[112] = -3522747600281141918L;
        fv.jluj[113] = 3770901533233772316L;
        fv.jluj[114] = 1272078441190685565L;
        fv.jluj[115] = 7782347007527226233L;
        fv.jluj[116] = 6949476196428111229L;
        fv.jluj[117] = 1492154155146603023L;
        fv.jluj[118] = 8847965768809381712L;
        fv.jluj[119] = 6811078908768954620L;
        fv.jluj[120] = 7111518472458585318L;
        fv.jluj[121] = 5128913279166822584L;
        fv.jluj[122] = 2312118165651947261L;
        fv.jluj[123] = -5368620894479252281L;
        fv.jluj[124] = -7220903950116723093L;
        fv.jluj[125] = -9065433106832633558L;
        fv.jluj[126] = -1411605002424850268L;
        fv.jluj[127] = 4297836024571858798L;
        fv.jluj[128] = -4966333513162865515L;
        fv.jluj[129] = -5590918853417601478L;
        fv.jluj[130] = -3620999841465693446L;
        fv.jluj[131] = -2469673118372451875L;
        fv.jluj[132] = 6235068598620919776L;
        fv.jluj[133] = -5269772319239476420L;
        fv.jluj[134] = -6692090496037292836L;
        fv.jluj[135] = -4832823316207043938L;
        fv.jluj[136] = 1940111497593602384L;
        fv.jluj[137] = 1651400086048824044L;
        fv.jluj[138] = -6489725885498596602L;
        fv.jluj[139] = -4707217945558644104L;
        fv.jluj[140] = 7748422547223849930L;
        fv.jluj[141] = 4470142358584342735L;
        fv.jluj[142] = -1871257606664876784L;
        fv.jluj[143] = 4615680816636374446L;
        fv.jluj[144] = 6604985361611179790L;
        fv.jluj[145] = 8079305073939441846L;
        fv.jluj[146] = -2869795752390005976L;
        fv.jluj[147] = -297055501445690053L;
        fv.jluj[148] = 2107153073962482213L;
        fv.jluj[149] = -6498913020280918545L;
        fv.jluj[150] = -631111426064661586L;
        fv.jluj[151] = 2958622748668522250L;
        fv.jluj[152] = -5084094840061080668L;
        fv.jluj[153] = -6666685059642636927L;
        fv.jluj[154] = 7986554252720992231L;
        fv.jluj[155] = -7685280481858932367L;
        fv.jluj[156] = 6520173995162881602L;
        fv.jluj[157] = -3202278139104428524L;
        fv.jluj[158] = -1868191499059524506L;
        fv.jluj[159] = -3464775948648372929L;
        fv.jluj[160] = -2978327978642276809L;
        fv.jluj[161] = 2976796639989651017L;
        fv.jluj[162] = 7307205260392429858L;
        fv.jluj[163] = 7379735754557103853L;
        fv.jluj[164] = 9073600594525790822L;
        fv.jluj[165] = 5201058717325309507L;
        fv.jluj[166] = -1460153655369417896L;
        fv.jluj[167] = -4882661711698851038L;
        fv.jluj[168] = 5179061724183982493L;
        fv.jluj[169] = 6377295675273154648L;
        fv.jluj[170] = -2994796416186245937L;
        fv.jluj[171] = -3757352961458697911L;
        fv.jluj[172] = 8005309505511568628L;
        fv.jluj[173] = 8902506956892070555L;
        fv.jluj[174] = 1757964862684761633L;
        fv.jluj[175] = 4503427616120590613L;
        fv.jluj[176] = 4595607885187091974L;
        fv.jluj[177] = -5581622754194582189L;
        fv.jluj[178] = 2885029778651490933L;
        fv.jluj[179] = -362627027390821675L;
        fv.jluj[180] = 7835996164244680554L;
        fv.jluj[181] = -572845995858264875L;
        fv.jluj[182] = -7360700301408175561L;
        fv.jluj[183] = 2902676916811409139L;
        fv.jluj[184] = 7055132117358088095L;
        fv.jluj[185] = 5173763802681081827L;
        fv.jluj[186] = 251744594606539897L;
        fv.jluj[187] = 4375787525983571415L;
        fv.jluj[188] = -6664935693720696108L;
        fv.jluj[189] = -2060216630245708466L;
        fv.jluj[190] = -3393102678926107918L;
        fv.jluj[191] = 6230482770867151542L;
        fv.jluj[192] = 7339694007288164231L;
        fv.jluj[193] = 3194953759849265285L;
        fv.jluj[194] = 7151698776256546848L;
        fv.jluj[195] = 2023784157388600422L;
        fv.jluj[196] = -6332705970354484045L;
        fv.jluj[197] = -3811217000808889116L;
        fv.jluj[198] = -8227713219833107988L;
        fv.jluj[199] = -7303232160544714235L;
    }

    private static /* synthetic */ void jnkf() {
        fv.jltw[400] = -2055253815;
        fv.jltw[401] = 569072768;
        fv.jltw[402] = -824186170;
        fv.jltw[403] = -1147505650;
        fv.jltw[404] = 513841613;
        fv.jltw[405] = 1810776838;
        fv.jltw[406] = -1957003588;
        fv.jltw[407] = 976911657;
    }

    private static /* synthetic */ void jnki() {
        fv.jltx[200] = 1008945442;
        fv.jltx[201] = -607254058;
        fv.jltx[202] = 1090411005;
        fv.jltx[203] = -1111825771;
        fv.jltx[204] = -1490047492;
        fv.jltx[205] = 1290573923;
        fv.jltx[206] = 606073105;
        fv.jltx[207] = 347358558;
        fv.jltx[208] = -2020745729;
        fv.jltx[209] = -962873184;
        fv.jltx[210] = -265056600;
        fv.jltx[211] = -1544396747;
        fv.jltx[212] = -1471421629;
        fv.jltx[213] = -1489718064;
        fv.jltx[214] = 1304538750;
        fv.jltx[215] = -1638992419;
        fv.jltx[216] = 1965707673;
        fv.jltx[217] = 408046175;
        fv.jltx[218] = 1156756200;
        fv.jltx[219] = -1680262521;
        fv.jltx[220] = 214558620;
        fv.jltx[221] = -166483582;
        fv.jltx[222] = 1577058227;
        fv.jltx[223] = -1833899099;
        fv.jltx[224] = -534115115;
        fv.jltx[225] = 1041687132;
        fv.jltx[226] = -1768743461;
        fv.jltx[227] = -833638791;
        fv.jltx[228] = 737306519;
        fv.jltx[229] = 656071238;
        fv.jltx[230] = -1524235205;
        fv.jltx[231] = 1100513041;
        fv.jltx[232] = -1097775149;
        fv.jltx[233] = -627712684;
        fv.jltx[234] = 1757054038;
        fv.jltx[235] = 861886936;
        fv.jltx[236] = -901323474;
        fv.jltx[237] = -674805424;
        fv.jltx[238] = 24684799;
        fv.jltx[239] = -2082744902;
        fv.jltx[240] = 1497206394;
        fv.jltx[241] = -1897100335;
        fv.jltx[242] = 757967788;
        fv.jltx[243] = 81417400;
        fv.jltx[244] = -1928205984;
        fv.jltx[245] = 1897027931;
        fv.jltx[246] = -1370768302;
        fv.jltx[247] = -137651947;
        fv.jltx[248] = 279756733;
        fv.jltx[249] = -1678200147;
        fv.jltx[250] = -289255175;
        fv.jltx[251] = 1990279236;
        fv.jltx[252] = 1207786836;
        fv.jltx[253] = 1460701465;
        fv.jltx[254] = 432062947;
        fv.jltx[255] = -1100001603;
        fv.jltx[256] = -1429200072;
        fv.jltx[257] = -1405286038;
        fv.jltx[258] = -2004915227;
        fv.jltx[259] = 1341802432;
        fv.jltx[260] = 1963637427;
        fv.jltx[261] = -1371325295;
        fv.jltx[262] = -71224300;
        fv.jltx[263] = -1155933276;
        fv.jltx[264] = 1617914266;
        fv.jltx[265] = 558202451;
        fv.jltx[266] = 1966568782;
        fv.jltx[267] = -950795377;
        fv.jltx[268] = 568939874;
        fv.jltx[269] = 1181872174;
        fv.jltx[270] = -1323706320;
        fv.jltx[271] = 328105833;
        fv.jltx[272] = -1313448616;
        fv.jltx[273] = -1152066598;
        fv.jltx[274] = 2134743783;
        fv.jltx[275] = 947306828;
        fv.jltx[276] = -29018541;
        fv.jltx[277] = -1862243290;
        fv.jltx[278] = -1315266803;
        fv.jltx[279] = 1214571576;
        fv.jltx[280] = -2121563956;
        fv.jltx[281] = -1732729638;
        fv.jltx[282] = -1193155150;
        fv.jltx[283] = -1507056812;
        fv.jltx[284] = 1143345404;
        fv.jltx[285] = 1322544771;
        fv.jltx[286] = -317762376;
        fv.jltx[287] = -938163532;
        fv.jltx[288] = 1502282731;
        fv.jltx[289] = 1597507465;
        fv.jltx[290] = 1366487694;
        fv.jltx[291] = 1954618154;
        fv.jltx[292] = -1085149570;
        fv.jltx[293] = -1038356965;
        fv.jltx[294] = -314188111;
        fv.jltx[295] = 1270341506;
        fv.jltx[296] = -1182997498;
        fv.jltx[297] = -330881843;
        fv.jltx[298] = -28598974;
        fv.jltx[299] = -2113066296;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void applyFullStop() {
        v0 /* !! */  = fv.rr;
        if (true) ** GOTO lbl5
        block64: while (true) {
            v0 /* !! */  = (long)(v1 - fv.jlty("jngn", jluh(int ), (int)178));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -520473419: {
                    break block64;
                }
                case -514451136: {
                    v1 = fv.jlty("jngo", jluh(int ), (int)179);
                    continue block64;
                }
                case 1788684375: {
                    v1 = fv.jlty("jngp", jluh(int ), (int)180);
                    continue block64;
                }
                case 1984057452: {
                    v1 = fv.jlty("jngq", jluh(int ), (int)181);
                    continue block64;
                }
            }
            break;
        }
        var3_1 = fv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jngr", jluh(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fv.jlty("jngs", jltv(int ), (int)364)) break;
            v2 /* !! */  = (long)fv.jlty("jngt", jltv(int ), (int)365);
        }
        var2_2 /* !! */  = fv.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = fv.rr;
                if (true) ** GOTO lbl31
                block66: while (true) {
                    v3 /* !! */  = (long)(v4 - fv.jlty("jngu", jluh(int ), (int)183));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1595285833: {
                            v4 = fv.jlty("jngv", jluh(int ), (int)184);
                            continue block66;
                        }
                        case -520473419: {
                            break block66;
                        }
                        case -421419492: {
                            v4 = fv.jlty("jngw", jluh(int ), (int)185);
                            continue block66;
                        }
                        case -150571046: {
                            v4 = fv.jlty("jngx", jluh(int ), (int)186);
                            continue block66;
                        }
                    }
                    break;
                }
                var1_3 = fv.a;
                if (var3_1) {
                    throw null;
lbl46:
                    // 7 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jngy", jluh(int ), (int)187)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fv.jlty("jngz", jltv(int ), (int)366)) break;
                    v5 /* !! */  = (long)fv.jlty("jnha", jltv(int ), (int)367);
                }
                v6 /* !! */  = fv.rr;
                if (true) ** GOTO lbl58
                block69: while (true) {
                    v6 /* !! */  = (long)(v7 - fv.jlty("jnhb", jluh(int ), (int)188));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1277555808: {
                            v7 = fv.jlty("jnhc", jluh(int ), (int)189);
                            continue block69;
                        }
                        case -593611584: {
                            v7 = fv.jlty("jnhd", jluh(int ), (int)190);
                            continue block69;
                        }
                        case -520473419: {
                            break block69;
                        }
                        case 378865549: {
                            v7 = fv.jlty("jnhe", jluh(int ), (int)191);
                            continue block69;
                        }
                    }
                    break;
                }
                if (!this.fullStop.isValue()) ** GOTO lbl84
                if (var1_3) ** GOTO lbl46
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jnhf", jluh(int ), (int)192)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fv.jlty("jnhg", jltv(int ), (int)368)) break;
                    v8 /* !! */  = (long)fv.jlty("jnhh", jltv(int ), (int)369);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = fv.rr - fv.jlty("jnhi", jluh(int ), (int)193)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == fv.jlty("jnhj", jltv(int ), (int)370)) break;
                    v9 /* !! */  = (long)fv.jlty("jnhk", jltv(int ), (int)371);
                }
                if (fv.mc.field_1724 != null) ** GOTO lbl86
                if (var1_3) ** GOTO lbl46
lbl84:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl46
                return;
lbl86:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl46
                v10 /* !! */  = fv.rr;
                if (true) ** GOTO lbl91
                block72: while (true) {
                    v10 /* !! */  = (long)(fv.jlty("jnhm", jluh(int ), (int)195) - fv.jlty("jnhl", jluh(int ), (int)194));
lbl91:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -699763357: {
                            continue block72;
                        }
                        case -520473419: {
                            break block72;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = fv.rr - fv.jlty("jnhn", jluh(int ), (int)196)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fv.jlty("jnho", jltv(int ), (int)372)) break;
                    v11 /* !! */  = (long)fv.jlty("jnhp", jltv(int ), (int)373);
                }
                v12 = fv.mc.field_1724;
                v13 /* !! */  = fv.rr;
                if (true) ** GOTO lbl106
                block74: while (true) {
                    v13 /* !! */  = (long)(v14 - fv.jlty("jnhq", jluh(int ), (int)197));
lbl106:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1556712298: {
                            v14 = fv.jlty("jnhr", jluh(int ), (int)198);
                            continue block74;
                        }
                        case -811376684: {
                            v14 = fv.jlty("jnhs", jluh(int ), (int)199);
                            continue block74;
                        }
                        case -520473419: {
                            break block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = fv.rr - fv.jlty("jnht", jluh(int ), (int)200)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == fv.jlty("jnhu", jltv(int ), (int)374)) break;
                    v15 /* !! */  = (long)fv.jlty("jnhv", jltv(int ), (int)375);
                }
                v16 = fv.mc.field_1724;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = fv.rr - fv.jlty("jnhw", jluh(int ), (int)201)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fv.jlty("jnhx", jltv(int ), (int)376)) break;
                    v17 /* !! */  = (long)fv.jlty("jnhy", jltv(int ), (int)377);
                }
                v18 = v16.method_18798();
                v19 /* !! */  = fv.rr;
                if (true) ** GOTO lbl131
                block77: while (true) {
                    v19 /* !! */  = (long)(v20 - fv.jlty("jnhz", jluh(int ), (int)202));
lbl131:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -520473419: {
                            break block77;
                        }
                        case 970294807: {
                            v20 = fv.jlty("jnia", jluh(int ), (int)203);
                            continue block77;
                        }
                        case 1715919299: {
                            v20 = fv.jlty("jnib", jluh(int ), (int)204);
                            continue block77;
                        }
                    }
                    break;
                }
                v21 = v18.field_1351;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = fv.rr - fv.jlty("jnic", jluh(int ), (int)205)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == fv.jlty("jnid", jltv(int ), (int)378)) break;
                    v22 /* !! */  = (long)fv.jlty("jnie", jltv(int ), (int)379);
                }
                v12.method_18800(0.0, v21, 0.0);
                if (var1_3 || var1_3) ** GOTO lbl46
                v23 /* !! */  = fv.rr;
                if (true) ** GOTO lbl152
                block79: while (true) {
                    v23 /* !! */  = (long)(v24 - fv.jlty("jnif", jluh(int ), (int)206));
lbl152:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -520473419: {
                            break block79;
                        }
                        case 1367483449: {
                            v24 = fv.jlty("jnig", jluh(int ), (int)207);
                            continue block79;
                        }
                        case 1916300093: {
                            v24 = fv.jlty("jnih", jluh(int ), (int)208);
                            continue block79;
                        }
                    }
                    break;
                }
                v25 /* !! */  = fv.rr;
                if (true) ** GOTO lbl165
                block80: while (true) {
                    v25 /* !! */  = (long)(v26 - fv.jlty("jnii", jluh(int ), (int)209));
lbl165:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -520473419: {
                            break block80;
                        }
                        case -391664468: {
                            v26 = fv.jlty("jnij", jluh(int ), (int)210);
                            continue block80;
                        }
                        case 1366845701: {
                            v26 = fv.jlty("jnik", jluh(int ), (int)211);
                            continue block80;
                        }
                    }
                    break;
                }
                v27 = fv.mc.field_1724;
                v28 = fv.jlty("jnil", jltv(int ), (int)380);
                v29 /* !! */  = fv.rr;
                if (true) ** GOTO lbl180
                block81: while (true) {
                    v29 /* !! */  = (long)(v30 - fv.jlty("jnim", jluh(int ), (int)212));
lbl180:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1336139761: {
                            v30 = fv.jlty("jnin", jluh(int ), (int)213);
                            continue block81;
                        }
                        case -962941189: {
                            v30 = fv.jlty("jnio", jluh(int ), (int)214);
                            continue block81;
                        }
                        case -520473419: {
                            break block81;
                        }
                    }
                    break;
                }
                v27.method_5728((boolean)v28);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fv.jlty("jnip", jltv(int ), (int)381);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl233
                    break;
                }
            }
lbl199:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fv.jlty("jniq", jltv(int ), (int)382);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)fv.jlty("jnir", jltv(int ), (int)383);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl208:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fv.jlty("jnis", jltv(int ), (int)384);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 4: {
                var2_2 /* !! */  = (int)fv.jlty("jnit", jltv(int ), (int)385);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 5: {
                var2_2 /* !! */  = (int)fv.jlty("jniu", jltv(int ), (int)386);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl223:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fv.jlty("jniv", jltv(int ), (int)387);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 7: {
                var2_2 /* !! */  = (int)fv.jlty("jniw", jltv(int ), (int)388);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl233:
            // 4 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)fv.jlty("jnix", jltv(int ), (int)389);
                } while (!var3_1);
                throw null;
            }
lbl238:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)fv.jlty("jniy", jltv(int ), (int)390);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fv.jlty("jniz", jltv(int ), (int)391);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl246:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)fv.jlty("jnja", jltv(int ), (int)392);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
lbl250:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)fv.jlty("jnjb", jltv(int ), (int)393);
                if (!var3_1) ** GOTO lbl246
                throw null;
            }
lbl254:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fv.jlty("jnjc", jltv(int ), (int)394);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)fv.jlty("jnjd", jltv(int ), (int)395);
        ** while (!var3_1)
lbl261:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canMoveIn(class_437 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jmbc", jluh(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fv.jlty("jmbd", jltv(int ), (int)145)) break;
            v0 /* !! */  = (long)fv.jlty("jmbe", jltv(int ), (int)146);
        }
        var5_2 = fv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jmbf", jluh(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fv.jlty("jmbg", jltv(int ), (int)147)) break;
            v1 /* !! */  = (long)fv.jlty("jmbh", jltv(int ), (int)148);
        }
        var4_3 /* !! */  = fv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jmbi", jluh(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fv.jlty("jmbj", jltv(int ), (int)149)) break;
            v2 /* !! */  = (long)fv.jlty("jmbk", jltv(int ), (int)150);
        }
        var3_4 = fv.a;
        if (var5_2) {
            throw null;
lbl24:
            // 15 sources

            return (boolean)fv.jlty("jmbl", jltv(int ), (int)151);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl24
                if (var1_1 == null) ** GOTO lbl34
                if (var3_4) ** GOTO lbl24
                if (!(var1_1 instanceof class_408)) ** GOTO lbl36
                if (var3_4) ** GOTO lbl24
lbl34:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                return (boolean)fv.jlty("jmbm", jltv(int ), (int)152);
lbl36:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                if (!(var1_1 instanceof mo)) ** GOTO lbl53
                if (var3_4) ** GOTO lbl24
                var2_5 = (mo)var1_1;
                if (var3_4 || var3_4) ** GOTO lbl24
                v3 /* !! */  = fv.rr;
                if (true) ** GOTO lbl45
                block54: while (true) {
                    v3 /* !! */  = (long)(fv.jlty("jmbo", jluh(int ), (int)41) - fv.jlty("jmbn", jluh(int ), (int)40));
lbl45:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1521494281: {
                            continue block54;
                        }
                        case -520473419: {
                            break block54;
                        }
                    }
                    break;
                }
                if (!var2_5.isTextInputFocused()) ** GOTO lbl53
                if (var3_4) ** GOTO lbl24
                return (boolean)fv.jlty("jmbp", jltv(int ), (int)153);
lbl53:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                v4 /* !! */  = fv.rr;
                if (true) ** GOTO lbl58
                block55: while (true) {
                    v4 /* !! */  = (long)(v5 - fv.jlty("jmbq", jluh(int ), (int)42));
lbl58:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -520473419: {
                            break block55;
                        }
                        case -64784799: {
                            v5 = fv.jlty("jmbr", jluh(int ), (int)43);
                            continue block55;
                        }
                        case 820353935: {
                            v5 = fv.jlty("jmbs", jluh(int ), (int)44);
                            continue block55;
                        }
                        case 1386043281: {
                            v5 = fv.jlty("jmbt", jluh(int ), (int)45);
                            continue block55;
                        }
                    }
                    break;
                }
                v6 = var1_1.getClass();
                v7 /* !! */  = fv.rr;
                if (true) ** GOTO lbl75
                block56: while (true) {
                    v7 /* !! */  = (long)(v8 - fv.jlty("jmbu", jluh(int ), (int)46));
lbl75:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2103414677: {
                            v8 = fv.jlty("jmbv", jluh(int ), (int)47);
                            continue block56;
                        }
                        case -520473419: {
                            break block56;
                        }
                        case 236352418: {
                            v8 = fv.jlty("jmbw", jluh(int ), (int)48);
                            continue block56;
                        }
                        case 858522706: {
                            v8 = fv.jlty("jmbx", jluh(int ), (int)49);
                            continue block56;
                        }
                    }
                    break;
                }
                v9 = v6.getSimpleName();
                v10 /* !! */  = fv.rr;
                if (true) ** GOTO lbl92
                block57: while (true) {
                    v10 /* !! */  = (long)(v11 - fv.jlty("jmby", jluh(int ), (int)50));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1292845955: {
                            v11 = fv.jlty("jmbz", jluh(int ), (int)51);
                            continue block57;
                        }
                        case -520473419: {
                            break block57;
                        }
                        case 1517776423: {
                            v11 = fv.jlty("jmca", jluh(int ), (int)52);
                            continue block57;
                        }
                    }
                    break;
                }
                if (!v9.contains("SignEdit")) ** GOTO lbl104
                if (var3_4) ** GOTO lbl24
                return (boolean)fv.jlty("jmcb", jltv(int ), (int)154);
lbl104:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                if (!(var1_1 instanceof class_465)) ** GOTO lbl109
                if (var3_4) ** GOTO lbl24
                if (!(var1_1 instanceof class_490)) ** GOTO lbl114
                if (var3_4) ** GOTO lbl24
lbl109:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                v12 = fv.jlty("jmcc", jltv(int ), (int)155);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl117
lbl114:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v12 = fv.jlty("jmcd", jltv(int ), (int)156);
lbl117:
                // 2 sources

                return (boolean)v12;
            }
lbl118:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)fv.jlty("jmce", jltv(int ), (int)157);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 1: {
                var4_3 /* !! */  = (int)fv.jlty("jmcf", jltv(int ), (int)158);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl128:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)fv.jlty("jmcg", jltv(int ), (int)159);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 3: {
                var4_3 /* !! */  = (int)fv.jlty("jmch", jltv(int ), (int)160);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl138:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)fv.jlty("jmci", jltv(int ), (int)161);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl143:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)fv.jlty("jmcj", jltv(int ), (int)162);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl148:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)fv.jlty("jmck", jltv(int ), (int)163);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl153:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)fv.jlty("jmcl", jltv(int ), (int)164);
                if (!var5_2) ** GOTO lbl128
                throw null;
            }
lbl157:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)fv.jlty("jmcm", jltv(int ), (int)165);
                if (!var5_2) ** GOTO lbl118
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)fv.jlty("jmcn", jltv(int ), (int)166);
                if (!var5_2) ** GOTO lbl157
                throw null;
            }
lbl165:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)fv.jlty("jmco", jltv(int ), (int)167);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl170:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fv.jlty("jmcp", jltv(int ), (int)168);
                    if (!var5_2) ** GOTO lbl138
                    throw null;
                }
            }
lbl175:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)fv.jlty("jmcq", jltv(int ), (int)169);
                if (!var5_2) ** GOTO lbl138
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)fv.jlty("jmcr", jltv(int ), (int)170);
                if (!var5_2) ** GOTO lbl165
                throw null;
            }
lbl183:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)fv.jlty("jmcs", jltv(int ), (int)171);
                if (!var5_2) ** GOTO lbl148
                throw null;
            }
lbl187:
            // 3 sources

            case 15: {
                var4_3 /* !! */  = (int)fv.jlty("jmct", jltv(int ), (int)172);
                if (!var5_2) ** GOTO lbl118
                throw null;
            }
lbl191:
            // 3 sources

            case 16: {
                var4_3 /* !! */  = (int)fv.jlty("jmcu", jltv(int ), (int)173);
                if (!var5_2) ** GOTO lbl170
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)fv.jlty("jmcv", jltv(int ), (int)174);
                if (!var5_2) ** GOTO lbl191
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)fv.jlty("jmcw", jltv(int ), (int)175);
                if (!var5_2) ** GOTO lbl187
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)fv.jlty("jmcx", jltv(int ), (int)176);
                if (!var5_2) ** GOTO lbl175
                throw null;
            }
lbl207:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)fv.jlty("jmcy", jltv(int ), (int)177);
                if (!var5_2) ** GOTO lbl143
                throw null;
            }
            case 21: {
                var4_3 /* !! */  = (int)fv.jlty("jmcz", jltv(int ), (int)178);
                if (!var5_2) ** GOTO lbl170
                throw null;
            }
            case 22: {
                var4_3 /* !! */  = (int)fv.jlty("jmda", jltv(int ), (int)179);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl220:
            // 2 sources

            case 23: {
                var4_3 /* !! */  = (int)fv.jlty("jmdb", jltv(int ), (int)180);
                if (!var5_2) ** GOTO lbl187
                throw null;
            }
lbl224:
            // 3 sources

            case 24: {
                var4_3 /* !! */  = (int)fv.jlty("jmdc", jltv(int ), (int)181);
                if (!var5_2) ** GOTO lbl175
                throw null;
            }
lbl228:
            // 3 sources

            case 25: {
                var4_3 /* !! */  = (int)fv.jlty("jmdd", jltv(int ), (int)182);
                if (!var5_2) ** GOTO lbl153
                throw null;
            }
            case 26: 
        }
        var4_3 /* !! */  = (int)fv.jlty("jmde", jltv(int ), (int)183);
        ** while (!var5_2)
lbl235:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jnkg() {
        fv.jltx[0] = -1666831482;
        fv.jltx[1] = -222451906;
        fv.jltx[2] = 710050215;
        fv.jltx[3] = 484092562;
        fv.jltx[4] = -458943227;
        fv.jltx[5] = -1222021028;
        fv.jltx[6] = 88577522;
        fv.jltx[7] = 1676623986;
        fv.jltx[8] = 2018339634;
        fv.jltx[9] = 1067014599;
        fv.jltx[10] = 86796643;
        fv.jltx[11] = -1773402160;
        fv.jltx[12] = -1614316862;
        fv.jltx[13] = -1240780063;
        fv.jltx[14] = 386505402;
        fv.jltx[15] = 199023600;
        fv.jltx[16] = -100887339;
        fv.jltx[17] = 52927478;
        fv.jltx[18] = 1992715515;
        fv.jltx[19] = -1966838884;
        fv.jltx[20] = 1626835091;
        fv.jltx[21] = -976236703;
        fv.jltx[22] = -1163874637;
        fv.jltx[23] = 1948939694;
        fv.jltx[24] = 463933935;
        fv.jltx[25] = -1161626935;
        fv.jltx[26] = -1412797041;
        fv.jltx[27] = -700797751;
        fv.jltx[28] = -2041116371;
        fv.jltx[29] = 792549868;
        fv.jltx[30] = 960069902;
        fv.jltx[31] = 990936581;
        fv.jltx[32] = 1488670388;
        fv.jltx[33] = -487647261;
        fv.jltx[34] = 517508214;
        fv.jltx[35] = 1162223058;
        fv.jltx[36] = 1855791143;
        fv.jltx[37] = -89554774;
        fv.jltx[38] = -244208629;
        fv.jltx[39] = 1584201493;
        fv.jltx[40] = 1499474613;
        fv.jltx[41] = 1106200288;
        fv.jltx[42] = -260423298;
        fv.jltx[43] = 930355351;
        fv.jltx[44] = -1642729808;
        fv.jltx[45] = 689758666;
        fv.jltx[46] = -1519742044;
        fv.jltx[47] = -1402823521;
        fv.jltx[48] = -265598884;
        fv.jltx[49] = -1515567203;
        fv.jltx[50] = 465778023;
        fv.jltx[51] = -99350820;
        fv.jltx[52] = -1926942199;
        fv.jltx[53] = 441944060;
        fv.jltx[54] = -1198692351;
        fv.jltx[55] = 2014094473;
        fv.jltx[56] = 127865700;
        fv.jltx[57] = 975833791;
        fv.jltx[58] = 994241638;
        fv.jltx[59] = -263456053;
        fv.jltx[60] = -804376055;
        fv.jltx[61] = -80185611;
        fv.jltx[62] = -1076037631;
        fv.jltx[63] = -1653297316;
        fv.jltx[64] = -168618149;
        fv.jltx[65] = -241203668;
        fv.jltx[66] = 697385123;
        fv.jltx[67] = 318232430;
        fv.jltx[68] = -1205819865;
        fv.jltx[69] = -2074306161;
        fv.jltx[70] = 671067323;
        fv.jltx[71] = 1628768566;
        fv.jltx[72] = 1232929588;
        fv.jltx[73] = -2064198106;
        fv.jltx[74] = 1567178475;
        fv.jltx[75] = -1943447520;
        fv.jltx[76] = -93467010;
        fv.jltx[77] = 729154264;
        fv.jltx[78] = 1027171902;
        fv.jltx[79] = 1874644599;
        fv.jltx[80] = -947856529;
        fv.jltx[81] = -731645092;
        fv.jltx[82] = -1856670826;
        fv.jltx[83] = -405724969;
        fv.jltx[84] = -1578065300;
        fv.jltx[85] = 486499002;
        fv.jltx[86] = 752633906;
        fv.jltx[87] = 1726943209;
        fv.jltx[88] = -1611691154;
        fv.jltx[89] = 817585237;
        fv.jltx[90] = -1284393882;
        fv.jltx[91] = -297569527;
        fv.jltx[92] = -1077621295;
        fv.jltx[93] = -49065684;
        fv.jltx[94] = -1068200562;
        fv.jltx[95] = 1588578601;
        fv.jltx[96] = -1741227669;
        fv.jltx[97] = -1132509860;
        fv.jltx[98] = -487870656;
        fv.jltx[99] = -472353804;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isPhysicallyPressed(class_304 var1_1) {
        v0 /* !! */  = fv.rr;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(v1 - fv.jlty("jnag", jluh(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1783564359: {
                    v1 = fv.jlty("jnah", jluh(int ), (int)115);
                    continue block50;
                }
                case -639807246: {
                    v1 = fv.jlty("jnai", jluh(int ), (int)116);
                    continue block50;
                }
                case -520473419: {
                    break block50;
                }
                case 354121280: {
                    v1 = fv.jlty("jnaj", jluh(int ), (int)117);
                    continue block50;
                }
            }
            break;
        }
        var4_2 = fv.c;
        v2 /* !! */  = fv.rr;
        if (true) ** GOTO lbl22
        block51: while (true) {
            v2 /* !! */  = (long)(v3 - fv.jlty("jnak", jluh(int ), (int)118));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1393663045: {
                    v3 = fv.jlty("jnal", jluh(int ), (int)119);
                    continue block51;
                }
                case -1342591691: {
                    v3 = fv.jlty("jnam", jluh(int ), (int)120);
                    continue block51;
                }
                case -520473419: {
                    break block51;
                }
                case 2037177621: {
                    v3 = fv.jlty("jnan", jluh(int ), (int)121);
                    continue block51;
                }
            }
            break;
        }
        var3_3 /* !! */  = fv.b;
        v4 /* !! */  = fv.rr;
        if (true) ** GOTO lbl39
        block52: while (true) {
            v4 /* !! */  = (long)(v5 - fv.jlty("jnao", jluh(int ), (int)122));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -520473419: {
                    break block52;
                }
                case -25412556: {
                    v5 = fv.jlty("jnap", jluh(int ), (int)123);
                    continue block52;
                }
                case 33291104: {
                    v5 = fv.jlty("jnaq", jluh(int ), (int)124);
                    continue block52;
                }
                case 972289046: {
                    v5 = fv.jlty("jnar", jluh(int ), (int)125);
                    continue block52;
                }
            }
            break;
        }
        var2_4 = fv.a;
        if (var4_2) {
            throw null;
lbl54:
            // 2 sources

            return (boolean)fv.jlty("jnas", jltv(int ), (int)265);
        }
        if (var2_4) ** GOTO lbl54
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v6 /* !! */  = fv.rr;
                if (true) ** GOTO lbl65
                block54: while (true) {
                    v6 /* !! */  = (long)(v7 - fv.jlty("jnat", jluh(int ), (int)126));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2107187812: {
                            v7 = fv.jlty("jnau", jluh(int ), (int)127);
                            continue block54;
                        }
                        case -520473419: {
                            break block54;
                        }
                        case -407105595: {
                            v7 = fv.jlty("jnav", jluh(int ), (int)128);
                            continue block54;
                        }
                        case 970286290: {
                            v7 = fv.jlty("jnaw", jluh(int ), (int)129);
                            continue block54;
                        }
                    }
                    break;
                }
                v8 /* !! */  = fv.rr;
                if (true) ** GOTO lbl81
                block55: while (true) {
                    v8 /* !! */  = (long)(fv.jlty("jnay", jluh(int ), (int)131) - fv.jlty("jnax", jluh(int ), (int)130));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -520473419: {
                            break block55;
                        }
                        case 707735297: {
                            continue block55;
                        }
                    }
                    break;
                }
                v9 = fv.mc.method_22683();
                v10 /* !! */  = fv.rr;
                if (true) ** GOTO lbl91
                block56: while (true) {
                    v10 /* !! */  = (long)(v11 - fv.jlty("jnaz", jluh(int ), (int)132));
lbl91:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1233780526: {
                            v11 = fv.jlty("jnba", jluh(int ), (int)133);
                            continue block56;
                        }
                        case -520473419: {
                            break block56;
                        }
                        case -504861215: {
                            v11 = fv.jlty("jnbb", jluh(int ), (int)134);
                            continue block56;
                        }
                        case 1062699548: {
                            v11 = fv.jlty("jnbc", jluh(int ), (int)135);
                            continue block56;
                        }
                    }
                    break;
                }
                v12 = var1_1.method_1428();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jnbd", jluh(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fv.jlty("jnbe", jltv(int ), (int)266)) break;
                    v13 /* !! */  = (long)fv.jlty("jnbf", jltv(int ), (int)267);
                }
                v14 = class_3675.method_15981((String)v12);
                v15 /* !! */  = fv.rr;
                if (true) ** GOTO lbl114
                block58: while (true) {
                    v15 /* !! */  = (long)(v16 - fv.jlty("jnbg", jluh(int ), (int)137));
lbl114:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -520473419: {
                            break block58;
                        }
                        case -384489284: {
                            v16 = fv.jlty("jnbh", jluh(int ), (int)138);
                            continue block58;
                        }
                        case 346815925: {
                            v16 = fv.jlty("jnbi", jluh(int ), (int)139);
                            continue block58;
                        }
                        case 384857407: {
                            v16 = fv.jlty("jnbj", jluh(int ), (int)140);
                            continue block58;
                        }
                    }
                    break;
                }
                v17 = v14.method_1444();
                v18 /* !! */  = fv.rr;
                if (true) ** GOTO lbl131
                block59: while (true) {
                    v18 /* !! */  = (long)(fv.jlty("jnbl", jluh(int ), (int)142) - fv.jlty("jnbk", jluh(int ), (int)141));
lbl131:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -960481800: {
                            continue block59;
                        }
                        case -520473419: {
                            break block59;
                        }
                    }
                    break;
                }
                return class_3675.method_15987((class_1041)v9, (int)v17);
            }
lbl137:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fv.jlty("jnbm", jltv(int ), (int)268);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 1: {
                var3_3 /* !! */  = (int)fv.jlty("jnbn", jltv(int ), (int)269);
                if (!var4_2) break;
                throw null;
            }
lbl146:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fv.jlty("jnbo", jltv(int ), (int)270);
                    if (!var4_2) ** GOTO lbl137
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)fv.jlty("jnbp", jltv(int ), (int)271);
        ** while (!var4_2)
lbl154:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fv() {
        var2_1 /* !! */  = fv.b;
        super("GuiMove", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0434\u0432\u0438\u0433\u0430\u0442\u044c\u0441\u044f \u0441 \u043e\u0442\u043a\u0440\u044b\u0442\u044b\u043c \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0451\u043c", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u043f\u043e\u0441\u043e\u0431 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0441 \u043e\u0442\u043a\u0440\u044b\u0442\u044b\u043c \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0451\u043c", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", new String[]{"\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "ReallyWorld"});
        this.fullStop = new kb("\u041f\u043e\u043b\u043d\u0430\u044f \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430", "\u041e\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c\u0441\u044f \u043f\u0435\u0440\u0435\u0434 \u043e\u0442\u043f\u0440\u0430\u0432\u043a\u043e\u0439 \u043e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u0445 \u043a\u043b\u0438\u043a\u043e\u0432").setValue((boolean)fv.jlty("jltz", jltv(int ), (int)0)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((fv)this));
        this.queuedPackets = new ArrayList<class_2596<?>>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode, this.fullStop});
                return;
            }
lbl11:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fv.jlty("jlua", jltv(int ), (int)1);
                    ** GOTO lbl18
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)fv.jlty("jlub", jltv(int ), (int)2);
                ** GOTO lbl11
            }
lbl18:
            // 4 sources

            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)fv.jlty("jluc", jltv(int ), (int)3);
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)fv.jlty("jlud", jltv(int ), (int)4);
                ** GOTO lbl18
            }
            case 4: {
                var2_1 /* !! */  = (int)fv.jlty("jlue", jltv(int ), (int)5);
                ** GOTO lbl18
            }
            case 5: {
                var2_1 /* !! */  = (int)fv.jlty("jluf", jltv(int ), (int)6);
                ** GOTO lbl11
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)fv.jlty("jlug", jltv(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void jnkn() {
        fv.jlui[200] = -7626163701368892377L;
        fv.jlui[201] = -2082280783115145625L;
        fv.jlui[202] = -2367046188287350395L;
        fv.jlui[203] = 9090666557131785098L;
        fv.jlui[204] = 3192910800306013546L;
        fv.jlui[205] = 589336461627841403L;
        fv.jlui[206] = -6109356586602137866L;
        fv.jlui[207] = 6289255782511162572L;
        fv.jlui[208] = -5230588312668771347L;
        fv.jlui[209] = 7866721320794216936L;
        fv.jlui[210] = -4445900885792888632L;
        fv.jlui[211] = 2873278614291450099L;
        fv.jlui[212] = -7195167374049332894L;
        fv.jlui[213] = 9028331297889502566L;
        fv.jlui[214] = 1248193199442214995L;
        fv.jlui[215] = -9116958660079035044L;
        fv.jlui[216] = 2158937833184504323L;
        fv.jlui[217] = -9072535262669416092L;
        fv.jlui[218] = 678701728520163434L;
        fv.jlui[219] = -2042036627014932472L;
        fv.jlui[220] = 2692531502612252700L;
        fv.jlui[221] = -3912134393562738500L;
        fv.jlui[222] = 8205587795336696246L;
        fv.jlui[223] = -3662696673190289859L;
        fv.jlui[224] = -4508220420675544568L;
        fv.jlui[225] = 4061979788575047225L;
    }

    private static /* synthetic */ int jltv(int n2) {
        return jltw[n2] ^ jltx[n2];
    }

    private static /* synthetic */ long jluh(int n2) {
        return jlui[n2] ^ jluj[n2];
    }

    private static /* synthetic */ void jnkc() {
        fv.jltw[100] = 1944943868;
        fv.jltw[101] = -350649911;
        fv.jltw[102] = 411392982;
        fv.jltw[103] = 1043923216;
        fv.jltw[104] = 1983102253;
        fv.jltw[105] = 1229887167;
        fv.jltw[106] = 1724362644;
        fv.jltw[107] = 1323902576;
        fv.jltw[108] = 1260229287;
        fv.jltw[109] = -1896023862;
        fv.jltw[110] = 1728584973;
        fv.jltw[111] = -180137250;
        fv.jltw[112] = 1689665153;
        fv.jltw[113] = -604389043;
        fv.jltw[114] = 2132616260;
        fv.jltw[115] = 679543277;
        fv.jltw[116] = 88869320;
        fv.jltw[117] = -1513044784;
        fv.jltw[118] = -229810038;
        fv.jltw[119] = 649710771;
        fv.jltw[120] = -1750901117;
        fv.jltw[121] = 781020997;
        fv.jltw[122] = -1947383744;
        fv.jltw[123] = 1222316735;
        fv.jltw[124] = 233390184;
        fv.jltw[125] = -1197430178;
        fv.jltw[126] = 184668638;
        fv.jltw[127] = 557515890;
        fv.jltw[128] = -34046438;
        fv.jltw[129] = -1622034611;
        fv.jltw[130] = -1678034603;
        fv.jltw[131] = 1137441900;
        fv.jltw[132] = -1638002611;
        fv.jltw[133] = 1570314339;
        fv.jltw[134] = -1822514549;
        fv.jltw[135] = 1176623235;
        fv.jltw[136] = 482365645;
        fv.jltw[137] = 1964040138;
        fv.jltw[138] = -1999326693;
        fv.jltw[139] = 138181848;
        fv.jltw[140] = 1855236394;
        fv.jltw[141] = 956899770;
        fv.jltw[142] = -424874288;
        fv.jltw[143] = 837914361;
        fv.jltw[144] = -1764626141;
        fv.jltw[145] = -217468683;
        fv.jltw[146] = -258081371;
        fv.jltw[147] = 1110144715;
        fv.jltw[148] = 1581739790;
        fv.jltw[149] = -1278871073;
        fv.jltw[150] = -69852497;
        fv.jltw[151] = -588992292;
        fv.jltw[152] = 1592422286;
        fv.jltw[153] = 2103398373;
        fv.jltw[154] = 1512552061;
        fv.jltw[155] = -1945743932;
        fv.jltw[156] = 1777887277;
        fv.jltw[157] = -317418592;
        fv.jltw[158] = 404962455;
        fv.jltw[159] = -1203043452;
        fv.jltw[160] = -484493705;
        fv.jltw[161] = -639609911;
        fv.jltw[162] = 1390139735;
        fv.jltw[163] = -697003994;
        fv.jltw[164] = -713184491;
        fv.jltw[165] = 23918386;
        fv.jltw[166] = 1211130435;
        fv.jltw[167] = -1891147795;
        fv.jltw[168] = 561176547;
        fv.jltw[169] = -501141378;
        fv.jltw[170] = -1624007038;
        fv.jltw[171] = -428537985;
        fv.jltw[172] = 1003894087;
        fv.jltw[173] = -1785145736;
        fv.jltw[174] = -393851643;
        fv.jltw[175] = 469789205;
        fv.jltw[176] = 178041012;
        fv.jltw[177] = -1716470482;
        fv.jltw[178] = 861884634;
        fv.jltw[179] = -2113137344;
        fv.jltw[180] = -1032522458;
        fv.jltw[181] = 1463897489;
        fv.jltw[182] = 565524898;
        fv.jltw[183] = 181925608;
        fv.jltw[184] = -133437548;
        fv.jltw[185] = 1683608928;
        fv.jltw[186] = 1946680045;
        fv.jltw[187] = -490711511;
        fv.jltw[188] = 1503187401;
        fv.jltw[189] = -215874699;
        fv.jltw[190] = -637138858;
        fv.jltw[191] = -1432263406;
        fv.jltw[192] = -1628185416;
        fv.jltw[193] = 1799049394;
        fv.jltw[194] = -1259197512;
        fv.jltw[195] = 869520873;
        fv.jltw[196] = -180668424;
        fv.jltw[197] = 59741488;
        fv.jltw[198] = -968568518;
        fv.jltw[199] = -512389770;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block121: {
            block122: {
                block119: {
                    block120: {
                        block118: {
                            block117: {
                                block116: {
                                    block115: {
                                        block114: {
                                            block113: {
                                                var8_2 = fv.c;
                                                var7_3 /* !! */  = fv.b;
                                                var6_4 = fv.a;
                                                if (var8_2) {
                                                    throw null;
lbl6:
                                                    // 32 sources

                                                    return;
                                                }
                                                if (var6_4 || var6_4) ** GOTO lbl6
                                                if (fv.mc.field_1724 == null) break block113;
                                                if (var6_4) ** GOTO lbl6
                                                if (fv.mc.field_1687 != null) break block114;
                                                if (var6_4) ** GOTO lbl6
                                            }
                                            if (var6_4 || var6_4) ** GOTO lbl6
                                            return;
                                        }
                                        if (var6_4 || var6_4) ** GOTO lbl6
                                        var2_5 = System.currentTimeMillis();
                                        if (var6_4 || var6_4) ** GOTO lbl6
                                        if (this.flushAt == fv.jlty("jluk", jluh(int ), (int)0)) break block115;
                                        if (var6_4) ** GOTO lbl6
                                        if (var2_5 < this.flushAt) break block115;
                                        if (var6_4 || var6_4) ** GOTO lbl6
                                        this.flushPacketStep(var2_5);
                                        if (var6_4) ** GOTO lbl6
                                    }
                                    if (var6_4 || var6_4) ** GOTO lbl6
                                    if (this.flushAt != fv.jlty("jlul", jluh(int ), (int)1)) break block116;
                                    if (var6_4) ** GOTO lbl6
                                    if (this.resumeAt == fv.jlty("jlum", jluh(int ), (int)2)) break block117;
                                    if (var6_4) ** GOTO lbl6
                                }
                                if (var6_4 || var6_4) ** GOTO lbl6
                                v0 = fv.jlty("jlun", jltv(int ), (int)8);
                                if (var8_2) {
                                    throw null;
                                }
                                break block118;
                            }
                            if (var6_4 || var6_4) ** GOTO lbl6
                            v0 = var4_6 = fv.jlty("jluo", jltv(int ), (int)9);
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (var4_6 == false) break block119;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (this.resumeAt == fv.jlty("jlup", jluh(int ), (int)3)) break block120;
                        if (var6_4) ** GOTO lbl6
                        if (var2_5 < this.resumeAt) break block120;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        this.resumeAt = (long)fv.jlty("jluq", jluh(int ), (int)4);
                        if (var6_4 || var6_4) ** GOTO lbl6
                        this.updateMovementKeys();
                        if (var6_4) ** GOTO lbl6
                        if (var8_2) {
                            throw null;
                        }
                        break block119;
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.releaseMovementKeys();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.applyFullStop();
                    if (var6_4 || var6_4) ** GOTO lbl6
                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                var5_7 = fv.mc.field_1755;
                if (var6_4 || var6_4) ** GOTO lbl6
                if (this.canMoveIn(var5_7)) break block121;
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var5_7 == null) break block122;
                if (var6_4) ** GOTO lbl6
                this.releaseMovementKeys();
                if (var6_4) ** GOTO lbl6
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        this.updateMovementKeys();
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_4) ** break;
                ** continue;
                return;
            }
lbl86:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)fv.jlty("jlur", jltv(int ), (int)10);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 1: {
                var7_3 /* !! */  = (int)fv.jlty("jlus", jltv(int ), (int)11);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl96:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)fv.jlty("jlut", jltv(int ), (int)12);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl101:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)fv.jlty("jluu", jltv(int ), (int)13);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 4: {
                var7_3 /* !! */  = (int)fv.jlty("jluv", jltv(int ), (int)14);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl111:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)fv.jlty("jluw", jltv(int ), (int)15);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 6: {
                var7_3 /* !! */  = (int)fv.jlty("jlux", jltv(int ), (int)16);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl121:
            // 3 sources

            case 7: {
                var7_3 /* !! */  = (int)fv.jlty("jluy", jltv(int ), (int)17);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl126:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)fv.jlty("jluz", jltv(int ), (int)18);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl130:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)fv.jlty("jlva", jltv(int ), (int)19);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)fv.jlty("jlvb", jltv(int ), (int)20);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
lbl140:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)fv.jlty("jlvc", jltv(int ), (int)21);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl145:
            // 4 sources

            case 12: {
                var7_3 /* !! */  = (int)fv.jlty("jlvd", jltv(int ), (int)22);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl150:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)fv.jlty("jlve", jltv(int ), (int)23);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 14: {
                var7_3 /* !! */  = (int)fv.jlty("jlvf", jltv(int ), (int)24);
                if (!var8_2) ** GOTO lbl130
                throw null;
            }
            case 15: {
                var7_3 /* !! */  = (int)fv.jlty("jlvg", jltv(int ), (int)25);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl164:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)fv.jlty("jlvh", jltv(int ), (int)26);
                if (!var8_2) ** GOTO lbl126
                throw null;
            }
lbl168:
            // 4 sources

            case 17: {
                var7_3 /* !! */  = (int)fv.jlty("jlvi", jltv(int ), (int)27);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 18: {
                do {
                    var7_3 /* !! */  = (int)fv.jlty("jlvj", jltv(int ), (int)28);
                } while (!var8_2);
                throw null;
            }
lbl178:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)fv.jlty("jlvk", jltv(int ), (int)29);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl183:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)fv.jlty("jlvl", jltv(int ), (int)30);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl187:
            // 3 sources

            case 21: {
                var7_3 /* !! */  = (int)fv.jlty("jlvm", jltv(int ), (int)31);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl192:
            // 3 sources

            case 22: {
                var7_3 /* !! */  = (int)fv.jlty("jlvn", jltv(int ), (int)32);
                if (!var8_2) ** GOTO lbl183
                throw null;
            }
lbl196:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)fv.jlty("jlvo", jltv(int ), (int)33);
                if (!var8_2) ** GOTO lbl192
                throw null;
            }
lbl200:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)fv.jlty("jlvp", jltv(int ), (int)34);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl205:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)fv.jlty("jlvq", jltv(int ), (int)35);
                if (!var8_2) ** GOTO lbl168
                throw null;
            }
lbl209:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)fv.jlty("jlvr", jltv(int ), (int)36);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)fv.jlty("jlvs", jltv(int ), (int)37);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl218:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)fv.jlty("jlvt", jltv(int ), (int)38);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
            case 29: {
                var7_3 /* !! */  = (int)fv.jlty("jlvu", jltv(int ), (int)39);
                if (!var8_2) ** GOTO lbl178
                throw null;
            }
            case 30: {
                var7_3 /* !! */  = (int)fv.jlty("jlvv", jltv(int ), (int)40);
                if (var8_2) {
                    throw null;
                }
            }
lbl230:
            // 5 sources

            case 31: {
                var7_3 /* !! */  = (int)fv.jlty("jlvw", jltv(int ), (int)41);
                if (!var8_2) ** GOTO lbl200
                throw null;
            }
lbl234:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)fv.jlty("jlvx", jltv(int ), (int)42);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 33: {
                var7_3 /* !! */  = (int)fv.jlty("jlvy", jltv(int ), (int)43);
                if (!var8_2) ** GOTO lbl126
                throw null;
            }
            case 34: {
                var7_3 /* !! */  = (int)fv.jlty("jlvz", jltv(int ), (int)44);
                if (var8_2) {
                    throw null;
                }
            }
lbl247:
            // 5 sources

            case 35: {
                var7_3 /* !! */  = (int)fv.jlty("jlwa", jltv(int ), (int)45);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl252:
            // 3 sources

            case 36: {
                var7_3 /* !! */  = (int)fv.jlty("jlwb", jltv(int ), (int)46);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 37: {
                var7_3 /* !! */  = (int)fv.jlty("jlwc", jltv(int ), (int)47);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
            case 38: {
                var7_3 /* !! */  = (int)fv.jlty("jlwd", jltv(int ), (int)48);
                if (!var8_2) ** GOTO lbl101
                throw null;
            }
            case 39: {
                var7_3 /* !! */  = (int)fv.jlty("jlwe", jltv(int ), (int)49);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl270:
            // 3 sources

            case 40: {
                var7_3 /* !! */  = (int)fv.jlty("jlwf", jltv(int ), (int)50);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
            case 41: {
                var7_3 /* !! */  = (int)fv.jlty("jlwg", jltv(int ), (int)51);
                if (!var8_2) ** GOTO lbl164
                throw null;
            }
lbl278:
            // 2 sources

            case 42: {
                var7_3 /* !! */  = (int)fv.jlty("jlwh", jltv(int ), (int)52);
                if (!var8_2) ** GOTO lbl270
                throw null;
            }
lbl282:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)fv.jlty("jlwi", jltv(int ), (int)53);
                if (!var8_2) ** GOTO lbl140
                throw null;
            }
lbl286:
            // 3 sources

            case 44: {
                var7_3 /* !! */  = (int)fv.jlty("jlwj", jltv(int ), (int)54);
                if (!var8_2) ** GOTO lbl168
                throw null;
            }
lbl290:
            // 2 sources

            case 45: {
                var7_3 /* !! */  = (int)fv.jlty("jlwk", jltv(int ), (int)55);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
            case 46: {
                var7_3 /* !! */  = (int)fv.jlty("jlwl", jltv(int ), (int)56);
                if (!var8_2) ** GOTO lbl286
                throw null;
            }
lbl298:
            // 3 sources

            case 47: {
                var7_3 /* !! */  = (int)fv.jlty("jlwm", jltv(int ), (int)57);
                if (!var8_2) ** GOTO lbl234
                throw null;
            }
lbl302:
            // 4 sources

            case 48: {
                var7_3 /* !! */  = (int)fv.jlty("jlwn", jltv(int ), (int)58);
                if (!var8_2) ** GOTO lbl247
                throw null;
            }
            case 49: {
                var7_3 /* !! */  = (int)fv.jlty("jlwo", jltv(int ), (int)59);
                if (!var8_2) ** GOTO lbl286
                throw null;
            }
            case 50: {
                var7_3 /* !! */  = (int)fv.jlty("jlwp", jltv(int ), (int)60);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
            case 51: {
                var7_3 /* !! */  = (int)fv.jlty("jlwq", jltv(int ), (int)61);
                if (!var8_2) ** GOTO lbl230
                throw null;
            }
lbl318:
            // 2 sources

            case 52: {
                var7_3 /* !! */  = (int)fv.jlty("jlwr", jltv(int ), (int)62);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
            case 53: {
                var7_3 /* !! */  = (int)fv.jlty("jlws", jltv(int ), (int)63);
                if (!var8_2) ** GOTO lbl247
                throw null;
            }
            case 54: {
                var7_3 /* !! */  = (int)fv.jlty("jlwt", jltv(int ), (int)64);
                if (!var8_2) ** GOTO lbl145
                throw null;
            }
lbl330:
            // 3 sources

            case 55: {
                var7_3 /* !! */  = (int)fv.jlty("jlwu", jltv(int ), (int)65);
                if (!var8_2) ** GOTO lbl252
                throw null;
            }
            case 56: 
        }
        var7_3 /* !! */  = (int)fv.jlty("jlwv", jltv(int ), (int)66);
        ** while (!var8_2)
lbl337:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jnkd() {
        fv.jltw[200] = 1008945450;
        fv.jltw[201] = -607254055;
        fv.jltw[202] = 1090410992;
        fv.jltw[203] = -1111825771;
        fv.jltw[204] = -1490047497;
        fv.jltw[205] = 1290573929;
        fv.jltw[206] = 606073109;
        fv.jltw[207] = -347358559;
        fv.jltw[208] = -1803318478;
        fv.jltw[209] = -962873183;
        fv.jltw[210] = -1422131818;
        fv.jltw[211] = -1544396748;
        fv.jltw[212] = 345907510;
        fv.jltw[213] = -1489718064;
        fv.jltw[214] = 1304538750;
        fv.jltw[215] = -1638992417;
        fv.jltw[216] = 1965707672;
        fv.jltw[217] = 408046164;
        fv.jltw[218] = 1156756205;
        fv.jltw[219] = -1680262527;
        fv.jltw[220] = 214558605;
        fv.jltw[221] = -166483575;
        fv.jltw[222] = 1577058234;
        fv.jltw[223] = -1833899102;
        fv.jltw[224] = -534115118;
        fv.jltw[225] = 1041687128;
        fv.jltw[226] = -1768743458;
        fv.jltw[227] = -833638808;
        fv.jltw[228] = 737306512;
        fv.jltw[229] = 656071232;
        fv.jltw[230] = -1524235201;
        fv.jltw[231] = 1100513047;
        fv.jltw[232] = -1097775139;
        fv.jltw[233] = -627712683;
        fv.jltw[234] = -1757054039;
        fv.jltw[235] = 411206984;
        fv.jltw[236] = -901323473;
        fv.jltw[237] = 759415090;
        fv.jltw[238] = -24684800;
        fv.jltw[239] = 695228635;
        fv.jltw[240] = -1497206395;
        fv.jltw[241] = -2086139366;
        fv.jltw[242] = -757967789;
        fv.jltw[243] = -578479440;
        fv.jltw[244] = 1928205983;
        fv.jltw[245] = -272444694;
        fv.jltw[246] = -1370768301;
        fv.jltw[247] = -1994149115;
        fv.jltw[248] = -279756734;
        fv.jltw[249] = 255307568;
        fv.jltw[250] = -289255176;
        fv.jltw[251] = 1990279236;
        fv.jltw[252] = 1207786836;
        fv.jltw[253] = 1460701466;
        fv.jltw[254] = 432062951;
        fv.jltw[255] = -1100001612;
        fv.jltw[256] = -1429200067;
        fv.jltw[257] = -1405286048;
        fv.jltw[258] = -2004915232;
        fv.jltw[259] = 1341802441;
        fv.jltw[260] = 1963637432;
        fv.jltw[261] = -1371325283;
        fv.jltw[262] = -71224297;
        fv.jltw[263] = -1155933280;
        fv.jltw[264] = 1617914264;
        fv.jltw[265] = 558202451;
        fv.jltw[266] = 1966568783;
        fv.jltw[267] = 1603292961;
        fv.jltw[268] = 568939873;
        fv.jltw[269] = 1181872173;
        fv.jltw[270] = -1323706318;
        fv.jltw[271] = 328105834;
        fv.jltw[272] = 1313448615;
        fv.jltw[273] = -748410917;
        fv.jltw[274] = 2134743782;
        fv.jltw[275] = -1079335974;
        fv.jltw[276] = 29018540;
        fv.jltw[277] = 844750978;
        fv.jltw[278] = -1315266803;
        fv.jltw[279] = -1214571577;
        fv.jltw[280] = 1631117518;
        fv.jltw[281] = 1732729637;
        fv.jltw[282] = 1237186308;
        fv.jltw[283] = -1507056811;
        fv.jltw[284] = 1143345405;
        fv.jltw[285] = -1322544772;
        fv.jltw[286] = -317762374;
        fv.jltw[287] = 938163531;
        fv.jltw[288] = 1948681856;
        fv.jltw[289] = 1597507464;
        fv.jltw[290] = -1197118911;
        fv.jltw[291] = 1954618155;
        fv.jltw[292] = -1085149571;
        fv.jltw[293] = 1038356964;
        fv.jltw[294] = -1622772112;
        fv.jltw[295] = -1270341507;
        fv.jltw[296] = -1182997502;
        fv.jltw[297] = 330881842;
        fv.jltw[298] = -936492673;
        fv.jltw[299] = -2113066294;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jnje", jluh(int ), (int)215)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fv.jlty("jnjf", jltv(int ), (int)396)) break;
            v0 /* !! */  = (long)fv.jlty("jnjg", jltv(int ), (int)397);
        }
        var3_1 = fv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jnjh", jluh(int ), (int)216)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fv.jlty("jnji", jltv(int ), (int)398)) break;
            v1 /* !! */  = (long)fv.jlty("jnjj", jltv(int ), (int)399);
        }
        var2_2 /* !! */  = fv.b;
        v2 /* !! */  = fv.rr;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - fv.jlty("jnjk", jluh(int ), (int)217));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2023346767: {
                    v3 = fv.jlty("jnjl", jluh(int ), (int)218);
                    continue block19;
                }
                case -812096000: {
                    v3 = fv.jlty("jnjm", jluh(int ), (int)219);
                    continue block19;
                }
                case -520473419: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = fv.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jnjn", jluh(int ), (int)220)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == fv.jlty("jnjo", jltv(int ), (int)400)) break;
                    v4 /* !! */  = (long)fv.jlty("jnjp", jltv(int ), (int)401);
                }
                v5 /* !! */  = fv.rr;
                if (true) ** GOTO lbl48
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - fv.jlty("jnjq", jluh(int ), (int)221));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1352568962: {
                            v6 = fv.jlty("jnjr", jluh(int ), (int)222);
                            continue block22;
                        }
                        case -1260004057: {
                            v6 = fv.jlty("jnjs", jluh(int ), (int)223);
                            continue block22;
                        }
                        case -520473419: {
                            break block22;
                        }
                        case -467381905: {
                            v6 = fv.jlty("jnjt", jluh(int ), (int)224);
                            continue block22;
                        }
                    }
                    break;
                }
                v7 = this.mode.isSelected("ReallyWorld");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fv.rr - fv.jlty("jnju", jluh(int ), (int)225)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fv.jlty("jnjv", jltv(int ), (int)402)) break;
                    v8 /* !! */  = (long)fv.jlty("jnjw", jltv(int ), (int)403);
                }
                return v7;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fv.jlty("jnjx", jltv(int ), (int)404);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl78
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)fv.jlty("jnjy", jltv(int ), (int)405);
                if (!var3_1) break;
                throw null;
            }
lbl78:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)fv.jlty("jnjz", jltv(int ), (int)406);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fv.jlty("jnka", jltv(int ), (int)407);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fv.rr;
        if (true) ** GOTO lbl5
        block61: while (true) {
            v0 /* !! */  = (long)(fv.jlty("jlyu", jluh(int ), (int)8) - fv.jlty("jlyt", jluh(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -520473419: {
                    break block61;
                }
                case 1557068380: {
                    continue block61;
                }
            }
            break;
        }
        var3_1 = fv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jlyv", jluh(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fv.jlty("jlyw", jltv(int ), (int)114)) break;
            v1 /* !! */  = (long)fv.jlty("jlyx", jltv(int ), (int)115);
        }
        var2_2 /* !! */  = fv.b;
        v2 /* !! */  = fv.rr;
        if (true) ** GOTO lbl21
        block63: while (true) {
            v2 /* !! */  = (long)(v3 - fv.jlty("jlyy", jluh(int ), (int)10));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -520473419: {
                    break block63;
                }
                case -70859867: {
                    v3 = fv.jlty("jlyz", jluh(int ), (int)11);
                    continue block63;
                }
                case 1651302432: {
                    v3 = fv.jlty("jlza", jluh(int ), (int)12);
                    continue block63;
                }
            }
            break;
        }
        var1_3 = fv.a;
        if (var3_1) {
            throw null;
lbl33:
            // 10 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v4 /* !! */  = fv.rr;
        if (true) ** GOTO lbl40
        block65: while (true) {
            v4 /* !! */  = (long)(v5 - fv.jlty("jlzb", jluh(int ), (int)13));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2048443939: {
                    v5 = fv.jlty("jlzc", jluh(int ), (int)14);
                    continue block65;
                }
                case -520473419: {
                    break block65;
                }
                case -127678375: {
                    v5 = fv.jlty("jlzd", jluh(int ), (int)15);
                    continue block65;
                }
                case 1607350466: {
                    v5 = fv.jlty("jlze", jluh(int ), (int)16);
                    continue block65;
                }
            }
            break;
        }
        v6 /* !! */  = fv.rr;
        if (true) ** GOTO lbl56
        block66: while (true) {
            v6 /* !! */  = (long)(v7 - fv.jlty("jlzf", jluh(int ), (int)17));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1704393534: {
                    v7 = fv.jlty("jlzg", jluh(int ), (int)18);
                    continue block66;
                }
                case -632046218: {
                    v7 = fv.jlty("jlzh", jluh(int ), (int)19);
                    continue block66;
                }
                case -520473419: {
                    break block66;
                }
                case 1762543346: {
                    v7 = fv.jlty("jlzi", jluh(int ), (int)20);
                    continue block66;
                }
            }
            break;
        }
        this.queuedPackets.clear();
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jlzj", jluh(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == fv.jlty("jlzk", jltv(int ), (int)116)) break;
            v8 /* !! */  = (long)fv.jlty("jlzl", jltv(int ), (int)117);
        }
        this.queuedClosePacket = null;
        if (var1_3 || var1_3) ** GOTO lbl33
        v9 = fv.jlty("jlzm", jluh(int ), (int)22);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jlzn", jluh(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == fv.jlty("jlzo", jltv(int ), (int)118)) break;
            v10 /* !! */  = (long)fv.jlty("jlzp", jltv(int ), (int)119);
        }
        this.flushAt = (long)v9;
        if (var1_3 || var1_3) ** GOTO lbl33
        v11 = fv.jlty("jlzq", jluh(int ), (int)24);
        v12 /* !! */  = fv.rr;
        if (true) ** GOTO lbl90
        block69: while (true) {
            v12 /* !! */  = (long)(v13 - fv.jlty("jlzr", jluh(int ), (int)25));
lbl90:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -556446496: {
                    v13 = fv.jlty("jlzs", jluh(int ), (int)26);
                    continue block69;
                }
                case -520473419: {
                    break block69;
                }
                case 1631206366: {
                    v13 = fv.jlty("jlzt", jluh(int ), (int)27);
                    continue block69;
                }
            }
            break;
        }
        this.resumeAt = (long)v11;
        if (var1_3 || var1_3) ** GOTO lbl33
        v14 = fv.jlty("jlzu", jltv(int ), (int)120);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = fv.rr - fv.jlty("jlzv", jluh(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == fv.jlty("jlzw", jltv(int ), (int)121)) break;
            v15 /* !! */  = (long)fv.jlty("jlzx", jltv(int ), (int)122);
        }
        this.flushing = v14;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl33
                v16 /* !! */  = fv.rr;
                if (true) ** GOTO lbl116
                block71: while (true) {
                    v16 /* !! */  = (long)(fv.jlty("jlzz", jluh(int ), (int)30) - fv.jlty("jlzy", jluh(int ), (int)29));
lbl116:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1993667559: {
                            continue block71;
                        }
                        case -520473419: {
                            break block71;
                        }
                    }
                    break;
                }
                v17 /* !! */  = fv.rr;
                if (true) ** GOTO lbl125
                block72: while (true) {
                    v17 /* !! */  = (long)(fv.jlty("jmab", jluh(int ), (int)32) - fv.jlty("jmaa", jluh(int ), (int)31));
lbl125:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -520473419: {
                            break block72;
                        }
                        case 1291519918: {
                            continue block72;
                        }
                    }
                    break;
                }
                if (fv.mc.field_1755 == null) ** GOTO lbl147
                if (var1_3) ** GOTO lbl33
                v18 /* !! */  = fv.rr;
                if (true) ** GOTO lbl136
                block73: while (true) {
                    v18 /* !! */  = (long)(v19 - fv.jlty("jmac", jluh(int ), (int)33));
lbl136:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -520473419: {
                            break block73;
                        }
                        case -507833641: {
                            v19 = fv.jlty("jmad", jluh(int ), (int)34);
                            continue block73;
                        }
                        case -99169024: {
                            v19 = fv.jlty("jmae", jluh(int ), (int)35);
                            continue block73;
                        }
                    }
                    break;
                }
                this.releaseMovementKeys();
                if (var1_3) ** GOTO lbl33
lbl147:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = fv.rr - fv.jlty("jmaf", jluh(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fv.jlty("jmag", jltv(int ), (int)123)) break;
                    v20 /* !! */  = (long)fv.jlty("jmah", jltv(int ), (int)124);
                }
                super.deactivate();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)fv.jlty("jmai", jltv(int ), (int)125);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl162:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fv.jlty("jmaj", jltv(int ), (int)126);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 2: {
                var2_2 /* !! */  = (int)fv.jlty("jmak", jltv(int ), (int)127);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl172:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)fv.jlty("jmal", jltv(int ), (int)128);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl177:
            // 3 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)fv.jlty("jmam", jltv(int ), (int)129);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fv.jlty("jman", jltv(int ), (int)130);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
lbl186:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)fv.jlty("jmao", jltv(int ), (int)131);
                if (!var3_1) ** GOTO lbl177
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fv.jlty("jmap", jltv(int ), (int)132);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fv.jlty("jmaq", jltv(int ), (int)133);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 9: {
                var2_2 /* !! */  = (int)fv.jlty("jmar", jltv(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
            }
lbl203:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)fv.jlty("jmas", jltv(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl208:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fv.jlty("jmat", jltv(int ), (int)136);
                    if (!var3_1) ** GOTO lbl172
                    throw null;
                }
            }
lbl213:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)fv.jlty("jmau", jltv(int ), (int)137);
                if (!var3_1) ** GOTO lbl186
                throw null;
            }
lbl217:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fv.jlty("jmav", jltv(int ), (int)138);
                if (!var3_1) ** GOTO lbl213
                throw null;
            }
lbl221:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)fv.jlty("jmaw", jltv(int ), (int)139);
                if (!var3_1) ** GOTO lbl186
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)fv.jlty("jmax", jltv(int ), (int)140);
                if (!var3_1) ** GOTO lbl221
                throw null;
            }
lbl229:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)fv.jlty("jmay", jltv(int ), (int)141);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)fv.jlty("jmaz", jltv(int ), (int)142);
                if (!var3_1) ** GOTO lbl217
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)fv.jlty("jmba", jltv(int ), (int)143);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 19: 
        }
        var2_2 /* !! */  = (int)fv.jlty("jmbb", jltv(int ), (int)144);
        ** while (!var3_1)
lbl244:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void updateMovementKeys() {
        class_304[] class_304Array;
        Object object = rr;
        boolean bl2 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - fv.jlty("jmdf", jluh(int ), (int)53);
            }
            switch ((int)object) {
                case -1950161404: {
                    callSite = fv.jlty("jmdg", jluh(int ), (int)54);
                    continue block21;
                }
                case -520473419: {
                    break block21;
                }
                case 1428033375: {
                    callSite = fv.jlty("jmdh", jluh(int ), (int)55);
                    continue block21;
                }
                case 1805347657: {
                    callSite = fv.jlty("jmdi", jluh(int ), (int)56);
                    continue block21;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = rr;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - fv.jlty("jmdj", jluh(int ), (int)57);
            }
            switch ((int)object2) {
                case -1517053167: {
                    callSite = fv.jlty("jmdk", jluh(int ), (int)58);
                    continue block22;
                }
                case -1208941905: {
                    callSite = fv.jlty("jmdl", jluh(int ), (int)59);
                    continue block22;
                }
                case -520473419: {
                    break block22;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = rr;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - fv.jlty("jmdm", jluh(int ), (int)60);
            }
            switch ((int)object3) {
                case -1966567367: {
                    callSite = fv.jlty("jmdn", jluh(int ), (int)61);
                    continue block23;
                }
                case -1221367004: {
                    callSite = fv.jlty("jmdo", jluh(int ), (int)62);
                    continue block23;
                }
                case -520473419: {
                    break block23;
                }
                case 1656653042: {
                    callSite = fv.jlty("jmdp", jluh(int ), (int)63);
                    continue block23;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = rr - fv.jlty("jmdq", jluh(int ), (int)64)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object4 == fv.jlty("jmdr", jltv(int ), (int)184)) {
                class_304Array = this.movementKeys();
                if (bl6) return;
                break;
            }
            object4 = fv.jlty("jmds", jltv(int ), (int)185);
        }
        int n3 = class_304Array.length;
        if (bl6) return;
        CallSite callSite = fv.jlty("jmdt", jltv(int ), (int)186);
        if (bl6) return;
        while (!bl6 && !bl6) {
            class_304 class_3042;
            void var3_7;
            if (var3_7 < n3) {
                if (bl6) return;
                class_3042 = class_304Array[var3_7];
                if (bl6 || bl6) return;
            } else {
                if (bl6 || bl6) return;
                return;
            }
            while (true) {
                long l3;
                Object object5;
                if ((object5 = (l3 = rr - fv.jlty("jmdu", jluh(int ), (int)65)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object5 == fv.jlty("jmdv", jltv(int ), (int)187)) break;
                object5 = fv.jlty("jmdw", jltv(int ), (int)188);
            }
            boolean bl7 = this.isPhysicallyPressed(class_3042);
            Object object6 = rr;
            block27: while (true) {
                switch ((int)object6) {
                    case -520473419: {
                        break block27;
                    }
                    case 1772126918: {
                        object6 = fv.jlty("jmdy", jluh(int ), (int)67) - fv.jlty("jmdx", jluh(int ), (int)66);
                        continue block27;
                    }
                }
                break;
            }
            class_3042.method_23481(bl7);
            if (bl6 || bl6) return;
            ++var3_7;
            if (bl6) return;
            if (!bl3) continue;
            throw null;
        }
    }

    private static /* synthetic */ void jnkh() {
        fv.jltx[100] = 1944943840;
        fv.jltx[101] = -350649879;
        fv.jltx[102] = 411392960;
        fv.jltx[103] = 1043923253;
        fv.jltx[104] = 1983102261;
        fv.jltx[105] = 1229887165;
        fv.jltx[106] = 1724362680;
        fv.jltx[107] = 1323902586;
        fv.jltx[108] = 1260229282;
        fv.jltx[109] = -1896023825;
        fv.jltx[110] = 1728585000;
        fv.jltx[111] = -180137228;
        fv.jltx[112] = 1689665195;
        fv.jltx[113] = -604389047;
        fv.jltx[114] = 2132616261;
        fv.jltx[115] = -1165307179;
        fv.jltx[116] = -88869321;
        fv.jltx[117] = 1409706478;
        fv.jltx[118] = 229810037;
        fv.jltx[119] = -156784837;
        fv.jltx[120] = -1750901117;
        fv.jltx[121] = -781020998;
        fv.jltx[122] = -2082370619;
        fv.jltx[123] = -1222316736;
        fv.jltx[124] = 52376550;
        fv.jltx[125] = -1197430191;
        fv.jltx[126] = 184668625;
        fv.jltx[127] = 557515872;
        fv.jltx[128] = -34046439;
        fv.jltx[129] = -1622034611;
        fv.jltx[130] = -1678034599;
        fv.jltx[131] = 1137441888;
        fv.jltx[132] = -1638002613;
        fv.jltx[133] = 1570314346;
        fv.jltx[134] = -1822514546;
        fv.jltx[135] = 1176623251;
        fv.jltx[136] = 482365647;
        fv.jltx[137] = 1964040130;
        fv.jltx[138] = -1999326699;
        fv.jltx[139] = 138181832;
        fv.jltx[140] = 1855236408;
        fv.jltx[141] = 956899764;
        fv.jltx[142] = -424874285;
        fv.jltx[143] = 837914354;
        fv.jltx[144] = -1764626132;
        fv.jltx[145] = 217468682;
        fv.jltx[146] = 306721405;
        fv.jltx[147] = -1110144716;
        fv.jltx[148] = -1700259207;
        fv.jltx[149] = 1278871072;
        fv.jltx[150] = 1669311617;
        fv.jltx[151] = -588992291;
        fv.jltx[152] = 1592422286;
        fv.jltx[153] = 2103398373;
        fv.jltx[154] = 1512552061;
        fv.jltx[155] = -1945743931;
        fv.jltx[156] = 1777887277;
        fv.jltx[157] = -317418583;
        fv.jltx[158] = 404962436;
        fv.jltx[159] = -1203043453;
        fv.jltx[160] = -484493715;
        fv.jltx[161] = -639609906;
        fv.jltx[162] = 1390139725;
        fv.jltx[163] = -697003983;
        fv.jltx[164] = -713184487;
        fv.jltx[165] = 23918399;
        fv.jltx[166] = 1211130433;
        fv.jltx[167] = -1891147803;
        fv.jltx[168] = 561176566;
        fv.jltx[169] = -501141385;
        fv.jltx[170] = -1624007017;
        fv.jltx[171] = -428537996;
        fv.jltx[172] = 1003894090;
        fv.jltx[173] = -1785145731;
        fv.jltx[174] = -393851639;
        fv.jltx[175] = 469789205;
        fv.jltx[176] = 178041009;
        fv.jltx[177] = -1716470495;
        fv.jltx[178] = 861884619;
        fv.jltx[179] = -2113137340;
        fv.jltx[180] = -1032522448;
        fv.jltx[181] = 1463897477;
        fv.jltx[182] = 565524920;
        fv.jltx[183] = 181925608;
        fv.jltx[184] = 133437547;
        fv.jltx[185] = 1140556105;
        fv.jltx[186] = 1946680045;
        fv.jltx[187] = -490711512;
        fv.jltx[188] = 1605151140;
        fv.jltx[189] = -215874690;
        fv.jltx[190] = -637138856;
        fv.jltx[191] = -1432263395;
        fv.jltx[192] = -1628185410;
        fv.jltx[193] = 1799049404;
        fv.jltx[194] = -1259197509;
        fv.jltx[195] = 869520879;
        fv.jltx[196] = -180668420;
        fv.jltx[197] = 59741500;
        fv.jltx[198] = -968568524;
        fv.jltx[199] = -512389769;
    }

    private static /* synthetic */ void jnkk() {
        fv.jltx[400] = 2055253814;
        fv.jltx[401] = -1886912637;
        fv.jltx[402] = -824186169;
        fv.jltx[403] = 110860503;
        fv.jltx[404] = 513841612;
        fv.jltx[405] = 1810776838;
        fv.jltx[406] = -1957003588;
        fv.jltx[407] = 976911656;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isMovingPhysically() {
        block98: {
            v0 /* !! */  = fv.rr;
            if (true) ** GOTO lbl5
            block66: while (true) {
                v0 /* !! */  = (long)(v1 - fv.jlty("jmga", jluh(int ), (int)77));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1881084082: {
                        v1 = fv.jlty("jmgb", jluh(int ), (int)78);
                        continue block66;
                    }
                    case -520473419: {
                        break block66;
                    }
                    case 885704222: {
                        v1 = fv.jlty("jmgc", jluh(int ), (int)79);
                        continue block66;
                    }
                }
                break;
            }
            var3_1 = fv.c;
            v2 /* !! */  = fv.rr;
            if (true) ** GOTO lbl19
            block67: while (true) {
                v2 /* !! */  = (long)(v3 - fv.jlty("jmgd", jluh(int ), (int)80));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -742359861: {
                        v3 = fv.jlty("jmge", jluh(int ), (int)81);
                        continue block67;
                    }
                    case -520473419: {
                        break block67;
                    }
                    case 860633516: {
                        v3 = fv.jlty("jmgf", jluh(int ), (int)82);
                        continue block67;
                    }
                    case 1624039763: {
                        v3 = fv.jlty("jmgg", jluh(int ), (int)83);
                        continue block67;
                    }
                }
                break;
            }
            var2_2 /* !! */  = fv.b;
            v4 /* !! */  = fv.rr;
            if (true) ** GOTO lbl36
            block68: while (true) {
                v4 /* !! */  = (long)(v5 - fv.jlty("jmgh", jluh(int ), (int)84));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -520473419: {
                        break block68;
                    }
                    case -132019539: {
                        v5 = fv.jlty("jmgi", jluh(int ), (int)85);
                        continue block68;
                    }
                    case 2092097398: {
                        v5 = fv.jlty("jmgj", jluh(int ), (int)86);
                        continue block68;
                    }
                }
                break;
            }
            var1_3 = fv.a;
            if (var3_1) {
                throw null;
lbl48:
                // 8 sources

                return (boolean)fv.jlty("jmgk", jltv(int ), (int)233);
            }
            if (var1_3 || var1_3) ** GOTO lbl48
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jmgl", jluh(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == fv.jlty("jmgm", jltv(int ), (int)234)) break;
                v6 /* !! */  = (long)fv.jlty("jmgn", jltv(int ), (int)235);
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jmgo", jluh(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == fv.jlty("jmgp", jltv(int ), (int)236)) break;
                v7 /* !! */  = (long)fv.jlty("jmgq", jltv(int ), (int)237);
            }
            v8 = fv.mc.field_1690;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jmgr", jluh(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == fv.jlty("jmgs", jltv(int ), (int)238)) break;
                v9 /* !! */  = (long)fv.jlty("jmgt", jltv(int ), (int)239);
            }
            v10 = v8.field_1894;
            v11 /* !! */  = fv.rr;
            if (true) ** GOTO lbl72
            block73: while (true) {
                v11 /* !! */  = (long)(fv.jlty("jmgv", jluh(int ), (int)91) - fv.jlty("jmgu", jluh(int ), (int)90));
lbl72:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1452887642: {
                        continue block73;
                    }
                    case -520473419: {
                        break block73;
                    }
                }
                break;
            }
            if (this.isPhysicallyPressed(v10)) break block98;
            if (var1_3) ** GOTO lbl48
            v12 /* !! */  = fv.rr;
            if (true) ** GOTO lbl83
            block74: while (true) {
                v12 /* !! */  = (long)(v13 - fv.jlty("jmgw", jluh(int ), (int)92));
lbl83:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -520473419: {
                        break block74;
                    }
                    case 765169680: {
                        v13 = fv.jlty("jmgx", jluh(int ), (int)93);
                        continue block74;
                    }
                    case 1954027204: {
                        v13 = fv.jlty("jmgy", jluh(int ), (int)94);
                        continue block74;
                    }
                }
                break;
            }
            v14 /* !! */  = fv.rr;
            if (true) ** GOTO lbl96
            block75: while (true) {
                v14 /* !! */  = (long)(fv.jlty("jmha", jluh(int ), (int)96) - fv.jlty("jmgz", jluh(int ), (int)95));
lbl96:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -709436312: {
                        continue block75;
                    }
                    case -520473419: {
                        break block75;
                    }
                }
                break;
            }
            v15 = fv.mc.field_1690;
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_3 = fv.rr - fv.jlty("jmhb", jluh(int ), (int)97)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == fv.jlty("jmhc", jltv(int ), (int)240)) break;
                v16 /* !! */  = (long)fv.jlty("jmhd", jltv(int ), (int)241);
            }
            v17 = v15.field_1881;
            v18 /* !! */  = fv.rr;
            if (true) ** GOTO lbl112
            block77: while (true) {
                v18 /* !! */  = (long)(v19 - fv.jlty("jmhe", jluh(int ), (int)98));
lbl112:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -1789345507: {
                        v19 = fv.jlty("jmhf", jluh(int ), (int)99);
                        continue block77;
                    }
                    case -520473419: {
                        break block77;
                    }
                    case 1517085643: {
                        v19 = fv.jlty("jmhg", jluh(int ), (int)100);
                        continue block77;
                    }
                }
                break;
            }
            if (this.isPhysicallyPressed(v17)) break block98;
            if (var1_3) ** GOTO lbl48
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_4 = fv.rr - fv.jlty("jmhh", jluh(int ), (int)101)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == fv.jlty("jmhi", jltv(int ), (int)242)) break;
                v20 /* !! */  = (long)fv.jlty("jmhj", jltv(int ), (int)243);
            }
            v21 /* !! */  = fv.rr;
            if (true) ** GOTO lbl132
            block79: while (true) {
                v21 /* !! */  = (long)(fv.jlty("jmhl", jluh(int ), (int)103) - fv.jlty("jmhk", jluh(int ), (int)102));
lbl132:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1500955527: {
                        continue block79;
                    }
                    case -520473419: {
                        break block79;
                    }
                }
                break;
            }
            v22 = fv.mc.field_1690;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_5 = fv.rr - fv.jlty("jmhm", jluh(int ), (int)104)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == fv.jlty("jmhn", jltv(int ), (int)244)) break;
                v23 /* !! */  = (long)fv.jlty("jmho", jltv(int ), (int)245);
            }
            v24 = v22.field_1913;
            v25 /* !! */  = fv.rr;
            if (true) ** GOTO lbl148
            block81: while (true) {
                v25 /* !! */  = (long)(fv.jlty("jmhq", jluh(int ), (int)106) - fv.jlty("jmhp", jluh(int ), (int)105));
lbl148:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -520473419: {
                        break block81;
                    }
                    case 1284704551: {
                        continue block81;
                    }
                }
                break;
            }
            if (this.isPhysicallyPressed(v24)) break block98;
            if (var1_3) ** GOTO lbl48
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_6 = fv.rr - fv.jlty("jmhr", jluh(int ), (int)107)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == fv.jlty("jmhs", jltv(int ), (int)246)) break;
                v26 /* !! */  = (long)fv.jlty("jmht", jltv(int ), (int)247);
            }
            v27 /* !! */  = fv.rr;
            if (true) ** GOTO lbl164
            block83: while (true) {
                v27 /* !! */  = (long)(v28 - fv.jlty("jmhu", jluh(int ), (int)108));
lbl164:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -520473419: {
                        break block83;
                    }
                    case 1356222601: {
                        v28 = fv.jlty("jmhv", jluh(int ), (int)109);
                        continue block83;
                    }
                    case 1915570271: {
                        v28 = fv.jlty("jmhw", jluh(int ), (int)110);
                        continue block83;
                    }
                }
                break;
            }
            v29 = fv.mc.field_1690;
            v30 /* !! */  = fv.rr;
            if (true) ** GOTO lbl178
            block84: while (true) {
                v30 /* !! */  = (long)(fv.jlty("jmhy", jluh(int ), (int)112) - fv.jlty("jmhx", jluh(int ), (int)111));
lbl178:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -520473419: {
                        break block84;
                    }
                    case -295841253: {
                        continue block84;
                    }
                }
                break;
            }
            v31 = v29.field_1849;
            while (true) {
                if ((v32 /* !! */  = (cfr_temp_7 = fv.rr - fv.jlty("jmhz", jluh(int ), (int)113)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v32 /* !! */  == fv.jlty("jmia", jltv(int ), (int)248)) break;
                v32 /* !! */  = (long)fv.jlty("jmib", jltv(int ), (int)249);
            }
            if (!this.isPhysicallyPressed(v31)) ** GOTO lbl201
            if (var1_3) ** GOTO lbl48
        }
        if (var1_3) ** GOTO lbl48
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl48
                v33 = fv.jlty("jmic", jltv(int ), (int)250);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl201:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v33 = fv.jlty("jmid", jltv(int ), (int)251);
lbl204:
            // 2 sources

            return (boolean)v33;
            case 0: {
                var2_2 /* !! */  = (int)fv.jlty("jmzt", jltv(int ), (int)252);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl210:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)fv.jlty("jmzu", jltv(int ), (int)253);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl215:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)fv.jlty("jmzv", jltv(int ), (int)254);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl220:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)fv.jlty("jmzw", jltv(int ), (int)255);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
lbl224:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)fv.jlty("jmzx", jltv(int ), (int)256);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)fv.jlty("jmzy", jltv(int ), (int)257);
                if (!var3_1) ** GOTO lbl210
                throw null;
            }
lbl232:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fv.jlty("jmzz", jltv(int ), (int)258);
                    if (!var3_1) ** GOTO lbl220
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)fv.jlty("jnaa", jltv(int ), (int)259);
                if (!var3_1) ** GOTO lbl210
                throw null;
            }
lbl241:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)fv.jlty("jnab", jltv(int ), (int)260);
                if (!var3_1) ** GOTO lbl224
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)fv.jlty("jnac", jltv(int ), (int)261);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fv.jlty("jnad", jltv(int ), (int)262);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)fv.jlty("jnae", jltv(int ), (int)263);
                if (!var3_1) ** GOTO lbl224
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)fv.jlty("jnaf", jltv(int ), (int)264);
        ** while (!var3_1)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jnkm() {
        fv.jlui[100] = -1139103138284642515L;
        fv.jlui[101] = -1885940026583896665L;
        fv.jlui[102] = -8805343674220344213L;
        fv.jlui[103] = -3065179533801166185L;
        fv.jlui[104] = -1667889748375788218L;
        fv.jlui[105] = -6271992084264158921L;
        fv.jlui[106] = 1027779189724344792L;
        fv.jlui[107] = -5938082207705536039L;
        fv.jlui[108] = 1566705413067541443L;
        fv.jlui[109] = -1364025952548652472L;
        fv.jlui[110] = -2939588612210638294L;
        fv.jlui[111] = -5589799391801682291L;
        fv.jlui[112] = 5543301000014650814L;
        fv.jlui[113] = 3935576948543776516L;
        fv.jlui[114] = -8429414437323817095L;
        fv.jlui[115] = -1256822018175550413L;
        fv.jlui[116] = 7969801329877293645L;
        fv.jlui[117] = -2753441385578059927L;
        fv.jlui[118] = 5446904900002635264L;
        fv.jlui[119] = 8898296555969996687L;
        fv.jlui[120] = 8625080681277905378L;
        fv.jlui[121] = 449056825280375233L;
        fv.jlui[122] = 803687110685096735L;
        fv.jlui[123] = 4915650160061072172L;
        fv.jlui[124] = 4444628896338380943L;
        fv.jlui[125] = 7746836991218973308L;
        fv.jlui[126] = -7259966946641545194L;
        fv.jlui[127] = 5315154954773409887L;
        fv.jlui[128] = -5422133647324154497L;
        fv.jlui[129] = -7317789443550034579L;
        fv.jlui[130] = -8131679252609023592L;
        fv.jlui[131] = -7913176754084115000L;
        fv.jlui[132] = -7543388607441741501L;
        fv.jlui[133] = -6387805935290566397L;
        fv.jlui[134] = -8706491143309292717L;
        fv.jlui[135] = 6022254587396506612L;
        fv.jlui[136] = -7162179570288087860L;
        fv.jlui[137] = 8981627783074792796L;
        fv.jlui[138] = 578933147783272338L;
        fv.jlui[139] = 1107628218131375272L;
        fv.jlui[140] = 4744657236326770906L;
        fv.jlui[141] = -3205088380580392472L;
        fv.jlui[142] = -2761607728252260833L;
        fv.jlui[143] = 3299525434347190977L;
        fv.jlui[144] = -2323989072499564196L;
        fv.jlui[145] = 2551126114918494883L;
        fv.jlui[146] = -6392123287654901266L;
        fv.jlui[147] = -6149081257071073854L;
        fv.jlui[148] = -5970624838579069036L;
        fv.jlui[149] = 2818344538707186318L;
        fv.jlui[150] = 7028241744375914978L;
        fv.jlui[151] = 6556452055112108519L;
        fv.jlui[152] = -4155235579044526857L;
        fv.jlui[153] = -6864463465333640691L;
        fv.jlui[154] = -5716988751325837046L;
        fv.jlui[155] = -7026938413419721629L;
        fv.jlui[156] = 3910230317874189271L;
        fv.jlui[157] = 2287841617913865697L;
        fv.jlui[158] = 4726279615730139303L;
        fv.jlui[159] = 9168368854183136178L;
        fv.jlui[160] = 2521811713421190818L;
        fv.jlui[161] = 5673049237271118608L;
        fv.jlui[162] = 2729440288401678817L;
        fv.jlui[163] = 7182183538122588659L;
        fv.jlui[164] = -538911547170267486L;
        fv.jlui[165] = -6161248943501829142L;
        fv.jlui[166] = 2567570272261027862L;
        fv.jlui[167] = -6078138411052983302L;
        fv.jlui[168] = 6984349489405460000L;
        fv.jlui[169] = 6590608714995143836L;
        fv.jlui[170] = 435371712719252961L;
        fv.jlui[171] = -9130100252427027843L;
        fv.jlui[172] = -3042104493968259711L;
        fv.jlui[173] = 8902506956892070555L;
        fv.jlui[174] = 1757964862684761633L;
        fv.jlui[175] = 4503427616120590613L;
        fv.jlui[176] = 4595607885187092066L;
        fv.jlui[177] = -5581622754194582198L;
        fv.jlui[178] = 4753273762667928057L;
        fv.jlui[179] = 7969876893557426422L;
        fv.jlui[180] = -9058773620701030643L;
        fv.jlui[181] = 3711341461736255969L;
        fv.jlui[182] = 7653167310186799375L;
        fv.jlui[183] = 3301878499772330899L;
        fv.jlui[184] = 2379071157826254823L;
        fv.jlui[185] = 8126291994418470991L;
        fv.jlui[186] = -4601385097364178646L;
        fv.jlui[187] = 2728392280316947324L;
        fv.jlui[188] = -7340381745429716558L;
        fv.jlui[189] = -8853652111024677824L;
        fv.jlui[190] = 5862358811649079468L;
        fv.jlui[191] = -3805780251115736625L;
        fv.jlui[192] = 5357409704819338836L;
        fv.jlui[193] = -2254105201941095383L;
        fv.jlui[194] = 159456400490435652L;
        fv.jlui[195] = -3561735091988338879L;
        fv.jlui[196] = 8508420380712285907L;
        fv.jlui[197] = 3474129701706038899L;
        fv.jlui[198] = -6907894976664970211L;
        fv.jlui[199] = -5133169639255619668L;
    }

    private static /* synthetic */ void jnkb() {
        fv.jltw[0] = -1666831482;
        fv.jltw[1] = -222451909;
        fv.jltw[2] = 710050211;
        fv.jltw[3] = 484092561;
        fv.jltw[4] = -458943232;
        fv.jltw[5] = -1222021025;
        fv.jltw[6] = 88577522;
        fv.jltw[7] = 1676623990;
        fv.jltw[8] = 2018339635;
        fv.jltw[9] = 1067014599;
        fv.jltw[10] = 86796671;
        fv.jltw[11] = -1773402119;
        fv.jltw[12] = -1614316858;
        fv.jltw[13] = -1240780046;
        fv.jltw[14] = 386505405;
        fv.jltw[15] = 199023605;
        fv.jltw[16] = -100887344;
        fv.jltw[17] = 52927476;
        fv.jltw[18] = 1992715485;
        fv.jltw[19] = -1966838885;
        fv.jltw[20] = 1626835115;
        fv.jltw[21] = -976236693;
        fv.jltw[22] = -1163874638;
        fv.jltw[23] = 1948939704;
        fv.jltw[24] = 463933891;
        fv.jltw[25] = -1161626902;
        fv.jltw[26] = -1412797029;
        fv.jltw[27] = -700797718;
        fv.jltw[28] = -2041116412;
        fv.jltw[29] = 792549833;
        fv.jltw[30] = 960069911;
        fv.jltw[31] = 990936621;
        fv.jltw[32] = 1488670375;
        fv.jltw[33] = -487647277;
        fv.jltw[34] = 517508163;
        fv.jltw[35] = 1162223095;
        fv.jltw[36] = 1855791144;
        fv.jltw[37] = -89554802;
        fv.jltw[38] = -244208620;
        fv.jltw[39] = 1584201486;
        fv.jltw[40] = 1499474585;
        fv.jltw[41] = 1106200295;
        fv.jltw[42] = -260423317;
        fv.jltw[43] = 930355333;
        fv.jltw[44] = -1642729832;
        fv.jltw[45] = 689758671;
        fv.jltw[46] = -1519742038;
        fv.jltw[47] = -1402823531;
        fv.jltw[48] = -265598903;
        fv.jltw[49] = -1515567191;
        fv.jltw[50] = 465778047;
        fv.jltw[51] = -99350804;
        fv.jltw[52] = -1926942146;
        fv.jltw[53] = 441944031;
        fv.jltw[54] = -1198692316;
        fv.jltw[55] = 2014094470;
        fv.jltw[56] = 127865717;
        fv.jltw[57] = 975833775;
        fv.jltw[58] = 994241645;
        fv.jltw[59] = -263456052;
        fv.jltw[60] = -804376024;
        fv.jltw[61] = -80185626;
        fv.jltw[62] = -1076037579;
        fv.jltw[63] = -1653297341;
        fv.jltw[64] = -168618122;
        fv.jltw[65] = -241203683;
        fv.jltw[66] = 697385142;
        fv.jltw[67] = 318232431;
        fv.jltw[68] = -1205819866;
        fv.jltw[69] = -2074306170;
        fv.jltw[70] = 671067327;
        fv.jltw[71] = 1628768553;
        fv.jltw[72] = 1232929594;
        fv.jltw[73] = -2064198091;
        fv.jltw[74] = 1567178477;
        fv.jltw[75] = -1943447500;
        fv.jltw[76] = -93467052;
        fv.jltw[77] = 729154291;
        fv.jltw[78] = 1027171863;
        fv.jltw[79] = 1874644567;
        fv.jltw[80] = -947856527;
        fv.jltw[81] = -731645104;
        fv.jltw[82] = -1856670825;
        fv.jltw[83] = -405724969;
        fv.jltw[84] = -1578065297;
        fv.jltw[85] = 486498982;
        fv.jltw[86] = 752633906;
        fv.jltw[87] = 1726943221;
        fv.jltw[88] = -1611691159;
        fv.jltw[89] = 817585273;
        fv.jltw[90] = -1284393917;
        fv.jltw[91] = -297569509;
        fv.jltw[92] = -1077621308;
        fv.jltw[93] = -49065692;
        fv.jltw[94] = -1068200550;
        fv.jltw[95] = 1588578615;
        fv.jltw[96] = -1741227679;
        fv.jltw[97] = -1132509857;
        fv.jltw[98] = -487870618;
        fv.jltw[99] = -472353818;
    }

    public static /* synthetic */ CallSite jlty(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void releaseMovementKeys() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jmer", jluh(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fv.jlty("jmes", jltv(int ), (int)207)) break;
            v0 /* !! */  = (long)fv.jlty("jmet", jltv(int ), (int)208);
        }
        var7_1 = fv.c;
        v1 /* !! */  = fv.rr;
        if (true) ** GOTO lbl12
        block31: while (true) {
            v1 /* !! */  = (long)(v2 - fv.jlty("jmeu", jluh(int ), (int)69));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -651025134: {
                    v2 = fv.jlty("jmev", jluh(int ), (int)70);
                    continue block31;
                }
                case -520473419: {
                    break block31;
                }
                case 800250408: {
                    v2 = fv.jlty("jmew", jluh(int ), (int)71);
                    continue block31;
                }
                case 2053206782: {
                    v2 = fv.jlty("jmex", jluh(int ), (int)72);
                    continue block31;
                }
            }
            break;
        }
        var6_2 /* !! */  = fv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jmey", jluh(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fv.jlty("jmez", jltv(int ), (int)209)) break;
            v3 /* !! */  = (long)fv.jlty("jmfa", jltv(int ), (int)210);
        }
        var5_3 = fv.a;
        if (var7_1) {
            throw null;
lbl34:
            // 11 sources

            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jmfb", jluh(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fv.jlty("jmfc", jltv(int ), (int)211)) break;
            v4 /* !! */  = (long)fv.jlty("jmfd", jltv(int ), (int)212);
        }
        var1_4 = this.movementKeys();
        if (var5_3) ** GOTO lbl34
        var2_5 = var1_4.length;
        if (var5_3) ** GOTO lbl34
        var3_6 = fv.jlty("jmfe", jltv(int ), (int)213);
        if (var5_3) ** GOTO lbl34
        block35: while (true) {
            if (var5_3 || var5_3) ** GOTO lbl34
            if (var3_6 >= var2_5) ** GOTO lbl75
            if (var5_3) ** GOTO lbl34
            var4_7 = var1_4[var3_6];
            if (var5_3 || var5_3) ** GOTO lbl34
            v5 = fv.jlty("jmff", jltv(int ), (int)214);
            v6 /* !! */  = fv.rr;
            if (true) ** GOTO lbl60
            block36: while (true) {
                v6 /* !! */  = (long)(fv.jlty("jmfh", jluh(int ), (int)76) - fv.jlty("jmfg", jluh(int ), (int)75));
lbl60:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -520473419: {
                        break block36;
                    }
                    case 256784095: {
                        continue block36;
                    }
                }
                break;
            }
            var4_7.method_23481((boolean)v5);
            if (var5_3) ** GOTO lbl34
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3) ** GOTO lbl34
                    ++var3_6;
                    if (var5_3) ** GOTO lbl34
                    if (!var7_1) continue block35;
                    throw null;
                }
lbl75:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
                case 0: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfi", jltv(int ), (int)215);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl114
                }
lbl83:
                // 2 sources

                case 1: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfj", jltv(int ), (int)216);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl102
                }
lbl88:
                // 3 sources

                case 2: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfk", jltv(int ), (int)217);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
                case 3: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfl", jltv(int ), (int)218);
                    if (var7_1) {
                        throw null;
                    }
                }
lbl97:
                // 4 sources

                case 4: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfm", jltv(int ), (int)219);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
lbl102:
                // 2 sources

                case 5: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfn", jltv(int ), (int)220);
                    if (!var7_1) break block35;
                    throw null;
                }
lbl106:
                // 2 sources

                case 6: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfo", jltv(int ), (int)221);
                    if (!var7_1) ** GOTO lbl88
                    throw null;
                }
lbl110:
                // 2 sources

                case 7: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfp", jltv(int ), (int)222);
                    if (var7_1) {
                        throw null;
                    }
                }
lbl114:
                // 4 sources

                case 8: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfq", jltv(int ), (int)223);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl119:
                // 2 sources

                case 9: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfr", jltv(int ), (int)224);
                    if (var7_1) {
                        throw null;
                    }
                }
                case 10: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfs", jltv(int ), (int)225);
                    if (!var7_1) ** GOTO lbl83
                    throw null;
                }
                case 11: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)fv.jlty("jmft", jltv(int ), (int)226);
                        if (!var7_1) ** GOTO lbl110
                        throw null;
                    }
                }
lbl132:
                // 3 sources

                case 12: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfu", jltv(int ), (int)227);
                    if (!var7_1) ** GOTO lbl106
                    throw null;
                }
                case 13: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfv", jltv(int ), (int)228);
                    if (!var7_1) ** GOTO lbl97
                    throw null;
                }
                case 14: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfw", jltv(int ), (int)229);
                    if (!var7_1) ** GOTO lbl119
                    throw null;
                }
                case 15: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfx", jltv(int ), (int)230);
                    if (!var7_1) ** GOTO lbl88
                    throw null;
                }
lbl148:
                // 3 sources

                case 16: {
                    var6_2 /* !! */  = (int)fv.jlty("jmfy", jltv(int ), (int)231);
                    if (!var7_1) ** GOTO lbl132
                    throw null;
                }
                case 17: 
            }
            break;
        }
        var6_2 /* !! */  = (int)fv.jlty("jmfz", jltv(int ), (int)232);
        ** while (!var7_1)
lbl155:
        // 1 sources

        throw null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void flushPacketStep(long var1_1) {
        var8_2 = fv.c;
        var7_3 /* !! */  = fv.b;
        var6_4 = fv.a;
        if (var8_2) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (fv.mc.method_1562() != null) ** GOTO lbl23
        if (var6_4 || var6_4) ** GOTO lbl6
        this.queuedPackets.clear();
        if (var6_4 || var6_4) ** GOTO lbl6
        this.queuedClosePacket = null;
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.flushAt = (long)fv.jlty("jndz", jluh(int ), (int)173);
                if (var6_4 || var6_4) ** GOTO lbl6
                this.resumeAt = (long)fv.jlty("jnea", jluh(int ), (int)174);
                if (var6_4 || var6_4) ** GOTO lbl6
                return;
            }
lbl23:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.flushing = fv.jlty("jneb", jltv(int ), (int)303);
            if (var6_4) ** GOTO lbl6
            try {
                if (var6_4) ** GOTO lbl6
                var3_5 = Math.min((int)fv.jlty("jnec", jltv(int ), (int)304), this.queuedPackets.size());
                if (var6_4 || var6_4) ** GOTO lbl6
                var4_6 = fv.jlty("jned", jltv(int ), (int)305);
                if (var6_4) ** GOTO lbl6
                do {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (var4_6 >= var3_5) ** GOTO lbl48
                    if (var6_4 || var6_4) ** GOTO lbl6
                    fv.mc.method_1562().method_52787(this.queuedPackets.remove((int)fv.jlty("jnee", jltv(int ), (int)306)));
                    if (var6_4 || var6_4) ** GOTO lbl6
                    ++var4_6;
                    if (var6_4) ** GOTO lbl6
                } while (!var8_2);
                throw null;
            }
            catch (Throwable var5_7) {
                if (var6_4 || var6_4) ** GOTO lbl6
                this.flushing = fv.jlty("jnej", jltv(int ), (int)308);
                if (var6_4 || var6_4) ** GOTO lbl6
                throw var5_7;
            }
lbl48:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!this.queuedPackets.isEmpty()) ** GOTO lbl65
            if (var6_4) ** GOTO lbl6
            if (this.queuedClosePacket == null) ** GOTO lbl65
            if (var6_4 || var6_4) ** GOTO lbl6
            fv.mc.method_1562().method_52787((class_2596)this.queuedClosePacket);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.queuedClosePacket = null;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.flushAt = (long)fv.jlty("jnef", jluh(int ), (int)175);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.resumeAt = var1_1 + fv.jlty("jneg", jluh(int ), (int)176);
            if (var6_4) ** GOTO lbl6
            if (var8_2) {
                throw null;
            }
            ** GOTO lbl68
lbl65:
            // 3 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.flushAt = var1_1 + fv.jlty("jneh", jluh(int ), (int)177);
            if (var6_4) ** GOTO lbl6
lbl68:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.flushing = fv.jlty("jnei", jltv(int ), (int)307);
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var8_2) {
                throw null;
            }
            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
            case 0: {
                var7_3 /* !! */  = (int)fv.jlty("jnek", jltv(int ), (int)309);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 1: {
                var7_3 /* !! */  = (int)fv.jlty("jnel", jltv(int ), (int)310);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl87:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)fv.jlty("jnem", jltv(int ), (int)311);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 3: {
                var7_3 /* !! */  = (int)fv.jlty("jnen", jltv(int ), (int)312);
                if (!var8_2) ** GOTO lbl87
                throw null;
            }
            case 4: {
                var7_3 /* !! */  = (int)fv.jlty("jneo", jltv(int ), (int)313);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 5: {
                var7_3 /* !! */  = (int)fv.jlty("jnep", jltv(int ), (int)314);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl106:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)fv.jlty("jneq", jltv(int ), (int)315);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 7: {
                var7_3 /* !! */  = (int)fv.jlty("jner", jltv(int ), (int)316);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl116:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)fv.jlty("jnes", jltv(int ), (int)317);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl121:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)fv.jlty("jnet", jltv(int ), (int)318);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 10: {
                var7_3 /* !! */  = (int)fv.jlty("jneu", jltv(int ), (int)319);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl131:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)fv.jlty("jnev", jltv(int ), (int)320);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl135:
            // 4 sources

            case 12: {
                var7_3 /* !! */  = (int)fv.jlty("jnew", jltv(int ), (int)321);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl140:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)fv.jlty("jnex", jltv(int ), (int)322);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl145:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)fv.jlty("jney", jltv(int ), (int)323);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl150:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)fv.jlty("jnez", jltv(int ), (int)324);
                if (!var8_2) break;
                throw null;
            }
            case 16: {
                var7_3 /* !! */  = (int)fv.jlty("jnfa", jltv(int ), (int)325);
                if (!var8_2) ** GOTO lbl145
                throw null;
            }
lbl158:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)fv.jlty("jnfb", jltv(int ), (int)326);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 18: {
                var7_3 /* !! */  = (int)fv.jlty("jnfc", jltv(int ), (int)327);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
lbl167:
            // 4 sources

            case 19: {
                var7_3 /* !! */  = (int)fv.jlty("jnfd", jltv(int ), (int)328);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 20: {
                var7_3 /* !! */  = (int)fv.jlty("jnfe", jltv(int ), (int)329);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 21: {
                var7_3 /* !! */  = (int)fv.jlty("jnff", jltv(int ), (int)330);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 22: {
                var7_3 /* !! */  = (int)fv.jlty("jnfg", jltv(int ), (int)331);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl187:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)fv.jlty("jnfh", jltv(int ), (int)332);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl192:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)fv.jlty("jnfi", jltv(int ), (int)333);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 25: {
                var7_3 /* !! */  = (int)fv.jlty("jnfj", jltv(int ), (int)334);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl202:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)fv.jlty("jnfk", jltv(int ), (int)335);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl207:
            // 4 sources

            case 27: {
                var7_3 /* !! */  = (int)fv.jlty("jnfl", jltv(int ), (int)336);
                if (!var8_2) ** GOTO lbl158
                throw null;
            }
            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)fv.jlty("jnfm", jltv(int ), (int)337);
                    if (!var8_2) ** GOTO lbl207
                    throw null;
                }
            }
lbl216:
            // 3 sources

            case 29: {
                var7_3 /* !! */  = (int)fv.jlty("jnfn", jltv(int ), (int)338);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl221:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)fv.jlty("jnfo", jltv(int ), (int)339);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
            case 31: {
                var7_3 /* !! */  = (int)fv.jlty("jnfp", jltv(int ), (int)340);
                if (!var8_2) ** GOTO lbl116
                throw null;
            }
            case 32: {
                var7_3 /* !! */  = (int)fv.jlty("jnfq", jltv(int ), (int)341);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
lbl233:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)fv.jlty("jnfr", jltv(int ), (int)342);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl238:
            // 2 sources

            case 34: {
                var7_3 /* !! */  = (int)fv.jlty("jnfs", jltv(int ), (int)343);
                if (!var8_2) ** GOTO lbl140
                throw null;
            }
lbl242:
            // 3 sources

            case 35: {
                var7_3 /* !! */  = (int)fv.jlty("jnft", jltv(int ), (int)344);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
lbl246:
            // 2 sources

            case 36: {
                var7_3 /* !! */  = (int)fv.jlty("jnfu", jltv(int ), (int)345);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 37: {
                var7_3 /* !! */  = (int)fv.jlty("jnfv", jltv(int ), (int)346);
                if (!var8_2) ** GOTO lbl135
                throw null;
            }
lbl255:
            // 3 sources

            case 38: {
                var7_3 /* !! */  = (int)fv.jlty("jnfw", jltv(int ), (int)347);
                if (!var8_2) ** GOTO lbl238
                throw null;
            }
lbl259:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)fv.jlty("jnfx", jltv(int ), (int)348);
                if (!var8_2) ** GOTO lbl216
                throw null;
            }
lbl263:
            // 2 sources

            case 40: {
                var7_3 /* !! */  = (int)fv.jlty("jnfy", jltv(int ), (int)349);
                if (!var8_2) ** GOTO lbl167
                throw null;
            }
lbl267:
            // 3 sources

            case 41: {
                var7_3 /* !! */  = (int)fv.jlty("jnfz", jltv(int ), (int)350);
                if (!var8_2) ** GOTO lbl216
                throw null;
            }
            case 42: {
                var7_3 /* !! */  = (int)fv.jlty("jnga", jltv(int ), (int)351);
                if (!var8_2) ** GOTO lbl255
                throw null;
            }
lbl275:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)fv.jlty("jngb", jltv(int ), (int)352);
                if (!var8_2) ** GOTO lbl145
                throw null;
            }
            case 44: {
                var7_3 /* !! */  = (int)fv.jlty("jngc", jltv(int ), (int)353);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 45: {
                var7_3 /* !! */  = (int)fv.jlty("jngd", jltv(int ), (int)354);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
lbl288:
            // 3 sources

            case 46: {
                var7_3 /* !! */  = (int)fv.jlty("jnge", jltv(int ), (int)355);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl293:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)fv.jlty("jngf", jltv(int ), (int)356);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl298:
            // 3 sources

            case 48: {
                var7_3 /* !! */  = (int)fv.jlty("jngg", jltv(int ), (int)357);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl303:
            // 3 sources

            case 49: {
                var7_3 /* !! */  = (int)fv.jlty("jngh", jltv(int ), (int)358);
                if (!var8_2) ** GOTO lbl259
                throw null;
            }
lbl307:
            // 4 sources

            case 50: {
                var7_3 /* !! */  = (int)fv.jlty("jngi", jltv(int ), (int)359);
                if (!var8_2) ** GOTO lbl207
                throw null;
            }
lbl311:
            // 4 sources

            case 51: {
                var7_3 /* !! */  = (int)fv.jlty("jngj", jltv(int ), (int)360);
                if (!var8_2) ** GOTO lbl116
                throw null;
            }
lbl315:
            // 2 sources

            case 52: {
                var7_3 /* !! */  = (int)fv.jlty("jngk", jltv(int ), (int)361);
                if (!var8_2) ** GOTO lbl167
                throw null;
            }
            case 53: {
                var7_3 /* !! */  = (int)fv.jlty("jngl", jltv(int ), (int)362);
                if (!var8_2) ** GOTO lbl242
                throw null;
            }
            case 54: 
        }
        var7_3 /* !! */  = (int)fv.jlty("jngm", jltv(int ), (int)363);
        ** while (!var8_2)
lbl326:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jnkl() {
        fv.jlui[0] = 1528363372719659260L;
        fv.jlui[1] = -1227456908746244853L;
        fv.jlui[2] = 5326506432809057740L;
        fv.jlui[3] = -2487603196261187631L;
        fv.jlui[4] = 7716359562169638802L;
        fv.jlui[5] = 6726970022265767819L;
        fv.jlui[6] = -2684334801985744695L;
        fv.jlui[7] = -1088816301508233528L;
        fv.jlui[8] = -264329600473969987L;
        fv.jlui[9] = 4255106802017379989L;
        fv.jlui[10] = -5574992238928160952L;
        fv.jlui[11] = -6336059888161228766L;
        fv.jlui[12] = 3122296771535791844L;
        fv.jlui[13] = -7578817364494472461L;
        fv.jlui[14] = 6118741943057396777L;
        fv.jlui[15] = 4441712002425136944L;
        fv.jlui[16] = -4959403740142273300L;
        fv.jlui[17] = 838009486099372918L;
        fv.jlui[18] = -8800934438325199363L;
        fv.jlui[19] = -1958134144587327572L;
        fv.jlui[20] = -8446362629851906092L;
        fv.jlui[21] = -5161764326090518920L;
        fv.jlui[22] = -7927884720300498973L;
        fv.jlui[23] = -3176746561009483146L;
        fv.jlui[24] = -5203515580834972285L;
        fv.jlui[25] = -1223357689051585933L;
        fv.jlui[26] = -1146720690308621616L;
        fv.jlui[27] = 7457886172317919877L;
        fv.jlui[28] = 9055484880476044175L;
        fv.jlui[29] = 7286835200548112961L;
        fv.jlui[30] = 4180943234622700240L;
        fv.jlui[31] = 1039230957299734860L;
        fv.jlui[32] = -8469509844073285193L;
        fv.jlui[33] = 3585359784156734555L;
        fv.jlui[34] = 7466716539134043522L;
        fv.jlui[35] = 2483199890881765681L;
        fv.jlui[36] = -8957719281975892933L;
        fv.jlui[37] = 3601098834529339314L;
        fv.jlui[38] = -769747080960597980L;
        fv.jlui[39] = -4414622912659509057L;
        fv.jlui[40] = 5479692095621806646L;
        fv.jlui[41] = 6191666806760265441L;
        fv.jlui[42] = 957064350732749087L;
        fv.jlui[43] = 4438088584586396823L;
        fv.jlui[44] = -3457580280752076200L;
        fv.jlui[45] = -8226126292187447137L;
        fv.jlui[46] = 5677019261653202183L;
        fv.jlui[47] = -7337301375678277503L;
        fv.jlui[48] = 2178638435617385531L;
        fv.jlui[49] = 1153171101984333658L;
        fv.jlui[50] = 8402039209061329361L;
        fv.jlui[51] = -5740216243199591660L;
        fv.jlui[52] = -3712623596357672837L;
        fv.jlui[53] = -545211795369334463L;
        fv.jlui[54] = 6157305729519574010L;
        fv.jlui[55] = -137337764758248252L;
        fv.jlui[56] = -7394967186443360277L;
        fv.jlui[57] = 5962024338281468608L;
        fv.jlui[58] = 4452496063687894950L;
        fv.jlui[59] = -7910226658457231185L;
        fv.jlui[60] = -592709251171427949L;
        fv.jlui[61] = -8800282762605972266L;
        fv.jlui[62] = -2423840281842148924L;
        fv.jlui[63] = 5784434232816404611L;
        fv.jlui[64] = -6299028819361072264L;
        fv.jlui[65] = -3144429320627508822L;
        fv.jlui[66] = -8699229537663862457L;
        fv.jlui[67] = -6696082623405515707L;
        fv.jlui[68] = 2543653065923604784L;
        fv.jlui[69] = 1315737769885230668L;
        fv.jlui[70] = -1524470715668959187L;
        fv.jlui[71] = -6630628715071639247L;
        fv.jlui[72] = -4080259577544809981L;
        fv.jlui[73] = -3904842294344653164L;
        fv.jlui[74] = 567811422306066507L;
        fv.jlui[75] = 4717213879117611749L;
        fv.jlui[76] = -2757096770626494167L;
        fv.jlui[77] = 3323511159838155842L;
        fv.jlui[78] = 1992566083792658413L;
        fv.jlui[79] = -5056262515464980186L;
        fv.jlui[80] = 2021725003608580639L;
        fv.jlui[81] = 5658765639584857916L;
        fv.jlui[82] = 2865791732914473114L;
        fv.jlui[83] = 5715510321609218887L;
        fv.jlui[84] = -3206416255748379679L;
        fv.jlui[85] = -359552744556400922L;
        fv.jlui[86] = 3303402468649453512L;
        fv.jlui[87] = -2277674982314160823L;
        fv.jlui[88] = 6007594512071228192L;
        fv.jlui[89] = 5464767465790345599L;
        fv.jlui[90] = 1091510535859900198L;
        fv.jlui[91] = -6848626771277968775L;
        fv.jlui[92] = -8023829551597830494L;
        fv.jlui[93] = -2849939054998934017L;
        fv.jlui[94] = -5455704106759875557L;
        fv.jlui[95] = 6695662954730702239L;
        fv.jlui[96] = -7500833783346636656L;
        fv.jlui[97] = 8372850127704595723L;
        fv.jlui[98] = 4929811715721871384L;
        fv.jlui[99] = -7807153373304563250L;
    }

    static {
        jltw = new int[408];
        jltx = new int[408];
        fv.jnkb();
        fv.jnkc();
        fv.jnkd();
        fv.jnke();
        fv.jnkf();
        fv.jnkg();
        fv.jnkh();
        fv.jnki();
        fv.jnkj();
        fv.jnkk();
        jlui = new long[226];
        jluj = new long[226];
        fv.jnkl();
        fv.jnkm();
        fv.jnkn();
        fv.jnko();
        fv.jnkp();
        fv.jnkq();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_304[] movementKeys() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fv.rr - fv.jlty("jnbq", jluh(int ), (int)143)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fv.jlty("jnbr", jltv(int ), (int)272)) break;
            v0 /* !! */  = (long)fv.jlty("jnbs", jltv(int ), (int)273);
        }
        var3_1 = fv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fv.rr - fv.jlty("jnbt", jluh(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fv.jlty("jnbu", jltv(int ), (int)274)) break;
            v1 /* !! */  = (long)fv.jlty("jnbv", jltv(int ), (int)275);
        }
        var2_2 = fv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fv.rr - fv.jlty("jnbw", jluh(int ), (int)145)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fv.jlty("jnbx", jltv(int ), (int)276)) break;
            v2 /* !! */  = (long)fv.jlty("jnby", jltv(int ), (int)277);
        }
        var1_3 = fv.a;
        if (var3_1) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl24:
        // 1 sources

        v3 = new class_304[5];
        v4 = fv.jlty("jnbz", jltv(int ), (int)278);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fv.rr - fv.jlty("jnca", jluh(int ), (int)146)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == fv.jlty("jncb", jltv(int ), (int)279)) break;
            v5 /* !! */  = (long)fv.jlty("jncc", jltv(int ), (int)280);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = fv.rr - fv.jlty("jncd", jluh(int ), (int)147)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == fv.jlty("jnce", jltv(int ), (int)281)) break;
            v6 /* !! */  = (long)fv.jlty("jncf", jltv(int ), (int)282);
        }
        v7 = fv.mc.field_1690;
        while (true) {
            if ((v8 = (cfr_temp_5 = fv.rr - fv.jlty("jncg", jluh(int ), (int)148)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 == fv.jlty("jnch", jltv(int ), (int)283)) break;
            v8 = -2079426683;
        }
        v3[v4] = v7.field_1894;
        v9 = fv.jlty("jnci", jltv(int ), (int)284);
        v10 /* !! */  = fv.rr;
        if (true) ** GOTO lbl48
        block34: while (true) {
            v10 /* !! */  = (long)(v11 - fv.jlty("jncj", jluh(int ), (int)149));
lbl48:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2024939071: {
                    v11 = fv.jlty("jnck", jluh(int ), (int)150);
                    continue block34;
                }
                case -599898055: {
                    v11 = fv.jlty("jncl", jluh(int ), (int)151);
                    continue block34;
                }
                case -520473419: {
                    break block34;
                }
                case 531320846: {
                    v11 = fv.jlty("jncm", jluh(int ), (int)152);
                    continue block34;
                }
            }
            break;
        }
        v12 /* !! */  = fv.rr;
        if (true) ** GOTO lbl64
        block35: while (true) {
            v12 /* !! */  = (long)(v13 - fv.jlty("jncn", jluh(int ), (int)153));
lbl64:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -520473419: {
                    break block35;
                }
                case -270992282: {
                    v13 = fv.jlty("jnco", jluh(int ), (int)154);
                    continue block35;
                }
                case 1752720590: {
                    v13 = fv.jlty("jncp", jluh(int ), (int)155);
                    continue block35;
                }
            }
            break;
        }
        v14 = fv.mc.field_1690;
        while (true) {
            if ((v15 = (cfr_temp_6 = fv.rr - fv.jlty("jncq", jluh(int ), (int)156)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 == fv.jlty("jncr", jltv(int ), (int)285)) break;
            v15 = 2048506439;
        }
        v3[v9] = v14.field_1881;
        v16 = fv.jlty("jncs", jltv(int ), (int)286);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = fv.rr - fv.jlty("jnct", jluh(int ), (int)157)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == fv.jlty("jncu", jltv(int ), (int)287)) break;
            v17 /* !! */  = (long)fv.jlty("jncv", jltv(int ), (int)288);
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_8 = fv.rr - fv.jlty("jncw", jluh(int ), (int)158)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == fv.jlty("jncx", jltv(int ), (int)289)) break;
            v18 /* !! */  = (long)fv.jlty("jncy", jltv(int ), (int)290);
        }
        v19 = fv.mc.field_1690;
        while (true) {
            if ((v20 = (cfr_temp_9 = fv.rr - fv.jlty("jncz", jluh(int ), (int)159)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v20 == fv.jlty("jnda", jltv(int ), (int)291)) break;
            v20 = 1935584087;
        }
        v3[v16] = v19.field_1913;
        v21 = fv.jlty("jndb", jltv(int ), (int)292);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_10 = fv.rr - fv.jlty("jndc", jluh(int ), (int)160)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == fv.jlty("jndd", jltv(int ), (int)293)) break;
            v22 /* !! */  = (long)fv.jlty("jnde", jltv(int ), (int)294);
        }
        v23 /* !! */  = fv.rr;
        if (true) ** GOTO lbl108
        block41: while (true) {
            v23 /* !! */  = (long)(fv.jlty("jndg", jluh(int ), (int)162) - fv.jlty("jndf", jluh(int ), (int)161));
lbl108:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -753344555: {
                    continue block41;
                }
                case -520473419: {
                    break block41;
                }
            }
            break;
        }
        v24 = fv.mc.field_1690;
        while (true) {
            if ((v25 = (cfr_temp_11 = fv.rr - fv.jlty("jndh", jluh(int ), (int)163)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v25 == fv.jlty("jndi", jltv(int ), (int)295)) break;
            v25 = -289144489;
        }
        v3[v21] = v24.field_1849;
        v26 = fv.jlty("jndj", jltv(int ), (int)296);
        v27 /* !! */  = fv.rr;
        if (true) ** GOTO lbl125
        block43: while (true) {
            v27 /* !! */  = (long)(v28 - fv.jlty("jndk", jluh(int ), (int)164));
lbl125:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -2114845168: {
                    v28 = fv.jlty("jndl", jluh(int ), (int)165);
                    continue block43;
                }
                case -1289700464: {
                    v28 = fv.jlty("jndm", jluh(int ), (int)166);
                    continue block43;
                }
                case -520473419: {
                    break block43;
                }
                case 60126285: {
                    v28 = fv.jlty("jndn", jluh(int ), (int)167);
                    continue block43;
                }
            }
            break;
        }
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_12 = fv.rr - fv.jlty("jndo", jluh(int ), (int)168)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == fv.jlty("jndp", jltv(int ), (int)297)) break;
            v29 /* !! */  = (long)fv.jlty("jndq", jltv(int ), (int)298);
        }
        v30 = fv.mc.field_1690;
        v31 /* !! */  = fv.rr;
        if (true) ** GOTO lbl147
        block45: while (true) {
            v31 /* !! */  = (long)(v32 - fv.jlty("jndr", jluh(int ), (int)169));
lbl147:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -1341562222: {
                    v32 = fv.jlty("jnds", jluh(int ), (int)170);
                    continue block45;
                }
                case -1275807034: {
                    v32 = fv.jlty("jndt", jluh(int ), (int)171);
                    continue block45;
                }
                case -704841467: {
                    v32 = fv.jlty("jndu", jluh(int ), (int)172);
                    continue block45;
                }
                case -520473419: {
                    break block45;
                }
            }
            break;
        }
        v3[v26] = v30.field_1903;
        return v3;
    }
}

