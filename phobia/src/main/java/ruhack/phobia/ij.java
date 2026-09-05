/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.security.SecureRandom;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.ms;
import ruhack.phobia.mt;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public final class ij
extends hx {
    private static long[] urv;
    public static final int b;
    private float lerpPitch;
    private int sideDirection;
    private static int[] uki;
    private float lastStepYaw;
    private int multipointOffset;
    private int lastEntityId;
    static final long bf = -83629152738185893L;
    private float lastStepPitch;
    private static long[] uru;
    private float lerpYaw;
    private static final double[][] HORIZONTAL_MULTIPOINTS;
    private final SecureRandom random;
    private int lastDirectionTick;
    private static final double[] VERTICAL_MULTIPOINTS;
    private static int[] ukh;
    private final mt model;
    public static final boolean a;
    private boolean initialized;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block98: {
            block97: {
                block96: {
                    var11_5 = ij.c;
                    var10_6 /* !! */  = ij.b;
                    var9_7 = ij.a;
                    if (var11_5) {
                        throw null;
lbl6:
                        // 26 sources

                        return null;
                    }
                    if (var9_7 || var9_7) ** GOTO lbl6
                    if (ij.mc.field_1724 == null) break block96;
                    if (var9_7) ** GOTO lbl6
                    if (var4_4 != null) break block97;
                    if (var9_7) ** GOTO lbl6
                }
                if (var9_7 || var9_7) ** GOTO lbl6
                this.reset();
                if (var9_7 || var9_7) ** GOTO lbl6
                return var2_2;
            }
            if (var9_7 || var9_7) ** GOTO lbl6
            if (!this.initialized) break block98;
            if (var9_7) ** GOTO lbl6
            if (var4_4.method_5628() == this.lastEntityId) ** GOTO lbl45
            if (var9_7) ** GOTO lbl6
        }
        if (var9_7 || var9_7) ** GOTO lbl6
        this.lerpYaw = var1_1.getYaw();
        if (var9_7 || var9_7) ** GOTO lbl6
        this.lerpPitch = var1_1.getPitch();
        if (var9_7 || var9_7) ** GOTO lbl6
        this.lastEntityId = var4_4.method_5628();
        if (var9_7 || var9_7) ** GOTO lbl6
        this.multipointOffset = this.random.nextInt(ij.VERTICAL_MULTIPOINTS.length * ij.HORIZONTAL_MULTIPOINTS.length);
        if (var9_7 || var9_7) ** GOTO lbl6
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.lastStepYaw = 0.0f;
                if (var9_7 || var9_7) ** GOTO lbl6
                this.lastStepPitch = 0.0f;
                if (var9_7 || var9_7) ** GOTO lbl6
                this.model.resetPlayback();
                if (var9_7 || var9_7) ** GOTO lbl6
                this.initialized = ij.ukj("ukv", ukg(int ), (int)11);
                if (var9_7) ** GOTO lbl6
lbl45:
                // 2 sources

                if (var9_7 || var9_7) ** GOTO lbl6
                var5_8 = this.isAttackReady();
                if (var9_7 || var9_7) ** GOTO lbl6
                var6_9 = this.rotationToMultipoint(var4_4, var2_2, var5_8);
                if (var9_7 || var9_7) ** GOTO lbl6
                if (!var5_8) ** GOTO lbl56
                if (var9_7) ** GOTO lbl6
                v0 = var6_9;
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl58
lbl56:
                // 1 sources

                if (var9_7 || var9_7) ** GOTO lbl6
                v0 = var7_10 = this.outsideHitboxRotation(var4_4, var6_9);
lbl58:
                // 2 sources

                if (var9_7 || var9_7) ** GOTO lbl6
                var8_11 = this.datasetStep(var1_1, var7_10, var4_4, var5_8);
                if (var9_7 || var9_7) ** GOTO lbl6
                this.lerpYaw = var8_11.getYaw();
                if (var9_7 || var9_7) ** GOTO lbl6
                this.lerpPitch = var8_11.getPitch();
                if (!var9_7 && !var9_7) ** break;
                ** continue;
                return var8_11;
            }
            case 0: {
                var10_6 /* !! */  = (int)ij.ukj("ukw", ukg(int ), (int)12);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl72:
            // 4 sources

            case 1: {
                var10_6 /* !! */  = (int)ij.ukj("ukx", ukg(int ), (int)13);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl77:
            // 2 sources

            case 2: {
                var10_6 /* !! */  = (int)ij.ukj("uky", ukg(int ), (int)14);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl82:
            // 2 sources

            case 3: {
                var10_6 /* !! */  = (int)ij.ukj("ukz", ukg(int ), (int)15);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 4: {
                var10_6 /* !! */  = (int)ij.ukj("ula", ukg(int ), (int)16);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl92:
            // 2 sources

            case 5: {
                var10_6 /* !! */  = (int)ij.ukj("ulb", ukg(int ), (int)17);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var10_6 /* !! */  = (int)ij.ukj("ulc", ukg(int ), (int)18);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl102:
            // 3 sources

            case 7: {
                var10_6 /* !! */  = (int)ij.ukj("uld", ukg(int ), (int)19);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 8: {
                var10_6 /* !! */  = (int)ij.ukj("ule", ukg(int ), (int)20);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 9: {
                var10_6 /* !! */  = (int)ij.ukj("ulf", ukg(int ), (int)21);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 10: {
                var10_6 /* !! */  = (int)ij.ukj("ulg", ukg(int ), (int)22);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl122:
            // 2 sources

            case 11: {
                var10_6 /* !! */  = (int)ij.ukj("ulh", ukg(int ), (int)23);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl127:
            // 4 sources

            case 12: {
                var10_6 /* !! */  = (int)ij.ukj("uli", ukg(int ), (int)24);
                if (!var11_5) ** GOTO lbl72
                throw null;
            }
lbl131:
            // 2 sources

            case 13: {
                var10_6 /* !! */  = (int)ij.ukj("ulj", ukg(int ), (int)25);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl136:
            // 2 sources

            case 14: {
                var10_6 /* !! */  = (int)ij.ukj("ulk", ukg(int ), (int)26);
                if (!var11_5) ** GOTO lbl102
                throw null;
            }
lbl140:
            // 3 sources

            case 15: {
                var10_6 /* !! */  = (int)ij.ukj("ull", ukg(int ), (int)27);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 16: {
                var10_6 /* !! */  = (int)ij.ukj("ulm", ukg(int ), (int)28);
                if (!var11_5) ** GOTO lbl82
                throw null;
            }
lbl149:
            // 3 sources

            case 17: {
                var10_6 /* !! */  = (int)ij.ukj("uln", ukg(int ), (int)29);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl154:
            // 4 sources

            case 18: {
                var10_6 /* !! */  = (int)ij.ukj("ulo", ukg(int ), (int)30);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl159:
            // 2 sources

            case 19: {
                var10_6 /* !! */  = (int)ij.ukj("ulp", ukg(int ), (int)31);
                if (!var11_5) ** GOTO lbl131
                throw null;
            }
lbl163:
            // 4 sources

            case 20: {
                var10_6 /* !! */  = (int)ij.ukj("ulq", ukg(int ), (int)32);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 21: {
                var10_6 /* !! */  = (int)ij.ukj("ulr", ukg(int ), (int)33);
                if (!var11_5) ** GOTO lbl72
                throw null;
            }
            case 22: {
                var10_6 /* !! */  = (int)ij.ukj("uls", ukg(int ), (int)34);
                if (!var11_5) ** GOTO lbl102
                throw null;
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_6 /* !! */  = (int)ij.ukj("ult", ukg(int ), (int)35);
                    if (var11_5) {
                        throw null;
                    }
                    ** GOTO lbl227
                    break;
                }
            }
            case 24: {
                var10_6 /* !! */  = (int)ij.ukj("ulu", ukg(int ), (int)36);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl187:
            // 2 sources

            case 25: {
                var10_6 /* !! */  = (int)ij.ukj("ulv", ukg(int ), (int)37);
                if (!var11_5) ** GOTO lbl154
                throw null;
            }
lbl191:
            // 2 sources

            case 26: {
                var10_6 /* !! */  = (int)ij.ukj("ulw", ukg(int ), (int)38);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl196:
            // 3 sources

            case 27: {
                var10_6 /* !! */  = (int)ij.ukj("ulx", ukg(int ), (int)39);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 28: {
                var10_6 /* !! */  = (int)ij.ukj("uly", ukg(int ), (int)40);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl206:
            // 4 sources

            case 29: {
                var10_6 /* !! */  = (int)ij.ukj("ulz", ukg(int ), (int)41);
                if (!var11_5) ** GOTO lbl163
                throw null;
            }
            case 30: {
                var10_6 /* !! */  = (int)ij.ukj("uma", ukg(int ), (int)42);
                if (!var11_5) ** GOTO lbl149
                throw null;
            }
lbl214:
            // 2 sources

            case 31: {
                var10_6 /* !! */  = (int)ij.ukj("umb", ukg(int ), (int)43);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl219:
            // 3 sources

            case 32: {
                var10_6 /* !! */  = (int)ij.ukj("umc", ukg(int ), (int)44);
                if (!var11_5) ** GOTO lbl92
                throw null;
            }
lbl223:
            // 3 sources

            case 33: {
                var10_6 /* !! */  = (int)ij.ukj("umd", ukg(int ), (int)45);
                if (!var11_5) ** GOTO lbl149
                throw null;
            }
lbl227:
            // 3 sources

            case 34: {
                var10_6 /* !! */  = (int)ij.ukj("ume", ukg(int ), (int)46);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 35: {
                var10_6 /* !! */  = (int)ij.ukj("umf", ukg(int ), (int)47);
                if (!var11_5) ** GOTO lbl163
                throw null;
            }
            case 36: {
                var10_6 /* !! */  = (int)ij.ukj("umg", ukg(int ), (int)48);
                if (!var11_5) ** GOTO lbl127
                throw null;
            }
lbl240:
            // 2 sources

            case 37: {
                var10_6 /* !! */  = (int)ij.ukj("umh", ukg(int ), (int)49);
                if (!var11_5) ** GOTO lbl154
                throw null;
            }
lbl244:
            // 3 sources

            case 38: {
                var10_6 /* !! */  = (int)ij.ukj("umi", ukg(int ), (int)50);
                if (!var11_5) ** GOTO lbl77
                throw null;
            }
            case 39: {
                var10_6 /* !! */  = (int)ij.ukj("umj", ukg(int ), (int)51);
                if (!var11_5) ** GOTO lbl196
                throw null;
            }
            case 40: {
                var10_6 /* !! */  = (int)ij.ukj("umk", ukg(int ), (int)52);
                if (!var11_5) ** GOTO lbl154
                throw null;
            }
lbl256:
            // 2 sources

            case 41: {
                var10_6 /* !! */  = (int)ij.ukj("uml", ukg(int ), (int)53);
                if (!var11_5) ** GOTO lbl219
                throw null;
            }
lbl260:
            // 4 sources

            case 42: {
                var10_6 /* !! */  = (int)ij.ukj("umm", ukg(int ), (int)54);
                if (!var11_5) ** GOTO lbl240
                throw null;
            }
lbl264:
            // 2 sources

            case 43: {
                var10_6 /* !! */  = (int)ij.ukj("umn", ukg(int ), (int)55);
                if (!var11_5) ** GOTO lbl244
                throw null;
            }
lbl268:
            // 2 sources

            case 44: {
                var10_6 /* !! */  = (int)ij.ukj("umo", ukg(int ), (int)56);
                if (!var11_5) ** GOTO lbl140
                throw null;
            }
            case 45: {
                var10_6 /* !! */  = (int)ij.ukj("ump", ukg(int ), (int)57);
                if (!var11_5) ** GOTO lbl72
                throw null;
            }
            case 46: {
                var10_6 /* !! */  = (int)ij.ukj("umq", ukg(int ), (int)58);
                if (!var11_5) ** GOTO lbl206
                throw null;
            }
            case 47: {
                var10_6 /* !! */  = (int)ij.ukj("umr", ukg(int ), (int)59);
                if (!var11_5) ** GOTO lbl264
                throw null;
            }
            case 48: 
        }
        var10_6 /* !! */  = (int)ij.ukj("ums", ukg(int ), (int)60);
        ** while (!var11_5)
lbl287:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vpa() {
        ij.uki[200] = -1740634465;
        ij.uki[201] = -913750015;
        ij.uki[202] = 1637425472;
        ij.uki[203] = -2032524920;
        ij.uki[204] = -79492252;
        ij.uki[205] = 1799553682;
        ij.uki[206] = 1627418311;
        ij.uki[207] = -293017808;
        ij.uki[208] = 1349774859;
        ij.uki[209] = -876065270;
        ij.uki[210] = 875149246;
        ij.uki[211] = 1808598574;
        ij.uki[212] = 1732299495;
        ij.uki[213] = -104119730;
        ij.uki[214] = -53289633;
        ij.uki[215] = -1801904589;
        ij.uki[216] = -1438896490;
        ij.uki[217] = -312825839;
        ij.uki[218] = 137357393;
        ij.uki[219] = 1191655596;
        ij.uki[220] = -234661612;
        ij.uki[221] = 816516529;
        ij.uki[222] = 1774730649;
        ij.uki[223] = -894892149;
        ij.uki[224] = -1587548888;
        ij.uki[225] = 1556004560;
        ij.uki[226] = -314710130;
        ij.uki[227] = -1028510959;
        ij.uki[228] = -2092306952;
        ij.uki[229] = -1317820670;
        ij.uki[230] = 906422542;
        ij.uki[231] = -761291996;
        ij.uki[232] = 1535314910;
        ij.uki[233] = -732737319;
        ij.uki[234] = -171630958;
        ij.uki[235] = 616197503;
        ij.uki[236] = 1560420991;
        ij.uki[237] = -2078470733;
        ij.uki[238] = 272848301;
        ij.uki[239] = -1716736101;
        ij.uki[240] = 1120929890;
        ij.uki[241] = 1879530216;
        ij.uki[242] = 526540721;
        ij.uki[243] = -1103757493;
        ij.uki[244] = -1602523740;
        ij.uki[245] = 1253902197;
        ij.uki[246] = -1781807769;
        ij.uki[247] = 1672520293;
        ij.uki[248] = -1294409221;
        ij.uki[249] = 1403582450;
        ij.uki[250] = 702033345;
        ij.uki[251] = -769905631;
        ij.uki[252] = -1162071987;
        ij.uki[253] = -1702226823;
        ij.uki[254] = 504248309;
        ij.uki[255] = 1828711775;
        ij.uki[256] = -434118367;
        ij.uki[257] = 2005760149;
        ij.uki[258] = -950531345;
        ij.uki[259] = 65422910;
        ij.uki[260] = 1250747984;
        ij.uki[261] = -777400345;
        ij.uki[262] = -803609679;
        ij.uki[263] = -1583633321;
        ij.uki[264] = -1460965114;
        ij.uki[265] = -707846997;
        ij.uki[266] = 913249723;
        ij.uki[267] = 1707290858;
        ij.uki[268] = 1946550481;
        ij.uki[269] = 602368095;
        ij.uki[270] = -265651386;
        ij.uki[271] = 212933388;
        ij.uki[272] = -2109745554;
        ij.uki[273] = 1439575741;
        ij.uki[274] = -108619232;
        ij.uki[275] = 758116723;
        ij.uki[276] = -338862869;
        ij.uki[277] = 320027728;
        ij.uki[278] = 1535598767;
        ij.uki[279] = -955024604;
        ij.uki[280] = 1980932598;
        ij.uki[281] = -1573896409;
        ij.uki[282] = -869315624;
        ij.uki[283] = 319159194;
        ij.uki[284] = -74964311;
        ij.uki[285] = 543338302;
        ij.uki[286] = 1136713847;
        ij.uki[287] = -426518533;
        ij.uki[288] = 166460197;
        ij.uki[289] = -2035352328;
        ij.uki[290] = -1301221978;
        ij.uki[291] = -317069855;
        ij.uki[292] = -787579240;
        ij.uki[293] = -1015461920;
        ij.uki[294] = -1868573966;
        ij.uki[295] = 1571016897;
        ij.uki[296] = -788029183;
        ij.uki[297] = 1978461684;
        ij.uki[298] = 761405930;
        ij.uki[299] = -610101632;
    }

    private static /* synthetic */ long urt(int n2) {
        return uru[n2] ^ urv[n2];
    }

    public static /* synthetic */ CallSite ukj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov datasetStep(ov var1_1, ov var2_2, class_1297 var3_3, boolean var4_4) {
        block145: {
            block144: {
                var19_5 = ij.c;
                var18_6 /* !! */  = ij.b;
                var17_7 = ij.a;
                if (var19_5) {
                    throw null;
lbl6:
                    // 36 sources

                    return null;
                }
                if (var17_7 || var17_7) ** GOTO lbl6
                var5_8 = ow.calculateDelta(var1_1, var2_2);
                if (var17_7 || var17_7) ** GOTO lbl6
                var6_9 = var5_8.getYaw();
                if (var17_7 || var17_7) ** GOTO lbl6
                var7_10 = var5_8.getPitch();
                if (var17_7 || var17_7) ** GOTO lbl6
                var8_11 = (float)Math.hypot(var6_9, var7_10);
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!(var8_11 < ij.ukj("umu", umt(int ), (int)61))) break block144;
                if (var17_7 || var17_7) ** GOTO lbl6
                return var1_1;
            }
            if (var17_7 || var17_7) ** GOTO lbl6
            var9_12 = this.hitRadius(var3_3);
            if (var17_7 || var17_7) ** GOTO lbl6
            if (!ms.isReady()) break block145;
            if (var17_7) ** GOTO lbl6
            v0 = this.model.next(var6_9, var7_10, var9_12);
            if (var19_5) {
                throw null;
            }
            ** GOTO lbl36
        }
        if (var18_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_7 || var17_7) ** GOTO lbl6
                v0 = var10_13 = null;
lbl36:
                // 2 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                if (var10_13 != null) ** GOTO lbl40
                if (var17_7 || var17_7) ** GOTO lbl6
                return this.fallbackDatasetStep(var1_1, var6_9, var7_10, var4_4);
lbl40:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl47
                if (var17_7 || var17_7) ** GOTO lbl6
                v1 = ij.ukj("umv", umt(int ), (int)62) + this.random.nextFloat(0.0f, (float)ij.ukj("umw", umt(int ), (int)63));
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl49
lbl47:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                v1 = var11_14 = ij.ukj("umx", umt(int ), (int)64) + this.random.nextFloat(0.0f, (float)ij.ukj("umy", umt(int ), (int)65));
lbl49:
                // 2 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl56
                if (var17_7 || var17_7) ** GOTO lbl6
                v2 = ij.ukj("umz", umt(int ), (int)66) + this.random.nextFloat(0.0f, (float)ij.ukj("una", umt(int ), (int)67));
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl58
lbl56:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                v2 = var12_15 = ij.ukj("unb", umt(int ), (int)68) + this.random.nextFloat(0.0f, (float)ij.ukj("unc", umt(int ), (int)69));
lbl58:
                // 2 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl65
                if (var17_7) ** GOTO lbl6
                v3 = ij.ukj("und", umt(int ), (int)70);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl67
lbl65:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                v3 = var13_16 = ij.ukj("une", umt(int ), (int)71);
lbl67:
                // 2 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl74
                if (var17_7) ** GOTO lbl6
                v4 = ij.ukj("unf", umt(int ), (int)72);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl76
lbl74:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                v4 = var14_17 = ij.ukj("ung", umt(int ), (int)73);
lbl76:
                // 2 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                var15_18 = this.lastStepYaw * var12_15 + var10_13[0] * var11_14 * (1.0f - var12_15);
                if (var17_7 || var17_7) ** GOTO lbl6
                var16_19 = this.lastStepPitch * var12_15 + var10_13[1] * var11_14 * (1.0f - var12_15);
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl89
                if (var17_7) ** GOTO lbl6
                if (!(var8_11 > var9_12)) ** GOTO lbl89
                if (var17_7 || var17_7) ** GOTO lbl6
                var15_18 = class_3532.method_16439((float)ij.ukj("unh", umt(int ), (int)74), (float)var15_18, (float)(var6_9 * ij.ukj("uni", umt(int ), (int)75)));
                if (var17_7 || var17_7) ** GOTO lbl6
                var16_19 = class_3532.method_16439((float)ij.ukj("unj", umt(int ), (int)76), (float)var16_19, (float)(var7_10 * ij.ukj("unk", umt(int ), (int)77)));
                if (var17_7) ** GOTO lbl6
lbl89:
                // 3 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                var15_18 = class_3532.method_15363((float)var15_18, (float)(-var13_16), (float)var13_16);
                if (var17_7 || var17_7) ** GOTO lbl6
                var16_19 = class_3532.method_15363((float)var16_19, (float)(-var14_17), (float)var14_17);
                if (var17_7 || var17_7) ** GOTO lbl6
                this.lastStepYaw = var15_18;
                if (var17_7 || var17_7) ** GOTO lbl6
                this.lastStepPitch = var16_19;
                if (!var17_7 && !var17_7) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + var15_18, class_3532.method_15363((float)(var1_1.getPitch() + var16_19), (float)ij.ukj("unl", umt(int ), (int)78), (float)ij.ukj("unm", umt(int ), (int)79)));
            }
lbl100:
            // 2 sources

            case 0: {
                var18_6 /* !! */  = (int)ij.ukj("unn", ukg(int ), (int)80);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl105:
            // 3 sources

            case 1: {
                var18_6 /* !! */  = (int)ij.ukj("uno", ukg(int ), (int)81);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl110:
            // 3 sources

            case 2: {
                var18_6 /* !! */  = (int)ij.ukj("unp", ukg(int ), (int)82);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl115:
            // 2 sources

            case 3: {
                var18_6 /* !! */  = (int)ij.ukj("unq", ukg(int ), (int)83);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl120:
            // 5 sources

            case 4: {
                var18_6 /* !! */  = (int)ij.ukj("unr", ukg(int ), (int)84);
                if (!var19_5) ** GOTO lbl115
                throw null;
            }
lbl124:
            // 2 sources

            case 5: {
                var18_6 /* !! */  = (int)ij.ukj("uns", ukg(int ), (int)85);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 6: {
                var18_6 /* !! */  = (int)ij.ukj("unt", ukg(int ), (int)86);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl134:
            // 3 sources

            case 7: {
                var18_6 /* !! */  = (int)ij.ukj("unu", ukg(int ), (int)87);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl414
            }
            case 8: {
                var18_6 /* !! */  = (int)ij.ukj("unv", ukg(int ), (int)88);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl144:
            // 2 sources

            case 9: {
                var18_6 /* !! */  = (int)ij.ukj("unw", ukg(int ), (int)89);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl149:
            // 2 sources

            case 10: {
                var18_6 /* !! */  = (int)ij.ukj("unx", ukg(int ), (int)90);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 11: {
                var18_6 /* !! */  = (int)ij.ukj("uny", ukg(int ), (int)91);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl159:
            // 2 sources

            case 12: {
                var18_6 /* !! */  = (int)ij.ukj("unz", ukg(int ), (int)92);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl164:
            // 3 sources

            case 13: {
                var18_6 /* !! */  = (int)ij.ukj("uoa", ukg(int ), (int)93);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl169:
            // 2 sources

            case 14: {
                var18_6 /* !! */  = (int)ij.ukj("uob", ukg(int ), (int)94);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 15: {
                var18_6 /* !! */  = (int)ij.ukj("uoc", ukg(int ), (int)95);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 16: {
                var18_6 /* !! */  = (int)ij.ukj("uod", ukg(int ), (int)96);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl184:
            // 2 sources

            case 17: {
                var18_6 /* !! */  = (int)ij.ukj("uoe", ukg(int ), (int)97);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl189:
            // 2 sources

            case 18: {
                var18_6 /* !! */  = (int)ij.ukj("uof", ukg(int ), (int)98);
                if (!var19_5) ** GOTO lbl144
                throw null;
            }
            case 19: {
                var18_6 /* !! */  = (int)ij.ukj("uog", ukg(int ), (int)99);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl198:
            // 2 sources

            case 20: {
                var18_6 /* !! */  = (int)ij.ukj("uoh", ukg(int ), (int)100);
                if (!var19_5) ** GOTO lbl110
                throw null;
            }
            case 21: {
                var18_6 /* !! */  = (int)ij.ukj("uoi", ukg(int ), (int)101);
                if (!var19_5) ** GOTO lbl120
                throw null;
            }
lbl206:
            // 2 sources

            case 22: {
                var18_6 /* !! */  = (int)ij.ukj("uoj", ukg(int ), (int)102);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl211:
            // 2 sources

            case 23: {
                var18_6 /* !! */  = (int)ij.ukj("uok", ukg(int ), (int)103);
                if (!var19_5) ** GOTO lbl134
                throw null;
            }
            case 24: {
                var18_6 /* !! */  = (int)ij.ukj("uol", ukg(int ), (int)104);
                if (!var19_5) ** GOTO lbl110
                throw null;
            }
lbl219:
            // 4 sources

            case 25: {
                var18_6 /* !! */  = (int)ij.ukj("uom", ukg(int ), (int)105);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl224:
            // 2 sources

            case 26: {
                var18_6 /* !! */  = (int)ij.ukj("uon", ukg(int ), (int)106);
                if (!var19_5) ** GOTO lbl120
                throw null;
            }
lbl228:
            // 3 sources

            case 27: {
                var18_6 /* !! */  = (int)ij.ukj("uoo", ukg(int ), (int)107);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl233:
            // 3 sources

            case 28: {
                var18_6 /* !! */  = (int)ij.ukj("uop", ukg(int ), (int)108);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl238:
            // 3 sources

            case 29: {
                var18_6 /* !! */  = (int)ij.ukj("uoq", ukg(int ), (int)109);
                if (!var19_5) ** GOTO lbl159
                throw null;
            }
lbl242:
            // 2 sources

            case 30: {
                var18_6 /* !! */  = (int)ij.ukj("uor", ukg(int ), (int)110);
                if (!var19_5) ** GOTO lbl105
                throw null;
            }
            case 31: {
                var18_6 /* !! */  = (int)ij.ukj("uos", ukg(int ), (int)111);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl401
            }
            case 32: {
                var18_6 /* !! */  = (int)ij.ukj("uot", ukg(int ), (int)112);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 33: {
                var18_6 /* !! */  = (int)ij.ukj("uou", ukg(int ), (int)113);
                if (!var19_5) ** GOTO lbl124
                throw null;
            }
lbl260:
            // 3 sources

            case 34: {
                var18_6 /* !! */  = (int)ij.ukj("uov", ukg(int ), (int)114);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl406
            }
            case 35: {
                var18_6 /* !! */  = (int)ij.ukj("uow", ukg(int ), (int)115);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl270:
            // 2 sources

            case 36: {
                var18_6 /* !! */  = (int)ij.ukj("uox", ukg(int ), (int)116);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 37: {
                var18_6 /* !! */  = (int)ij.ukj("uoy", ukg(int ), (int)117);
                if (!var19_5) ** GOTO lbl224
                throw null;
            }
lbl279:
            // 4 sources

            case 38: {
                var18_6 /* !! */  = (int)ij.ukj("uoz", ukg(int ), (int)118);
                if (!var19_5) ** GOTO lbl228
                throw null;
            }
lbl283:
            // 3 sources

            case 39: {
                var18_6 /* !! */  = (int)ij.ukj("upa", ukg(int ), (int)119);
                if (!var19_5) ** GOTO lbl279
                throw null;
            }
lbl287:
            // 3 sources

            case 40: {
                var18_6 /* !! */  = (int)ij.ukj("upb", ukg(int ), (int)120);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl292:
            // 2 sources

            case 41: {
                var18_6 /* !! */  = (int)ij.ukj("upc", ukg(int ), (int)121);
                if (!var19_5) ** GOTO lbl134
                throw null;
            }
lbl296:
            // 3 sources

            case 42: {
                var18_6 /* !! */  = (int)ij.ukj("upd", ukg(int ), (int)122);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl301:
            // 2 sources

            case 43: {
                var18_6 /* !! */  = (int)ij.ukj("upe", ukg(int ), (int)123);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl306:
            // 2 sources

            case 44: {
                var18_6 /* !! */  = (int)ij.ukj("upf", ukg(int ), (int)124);
                if (!var19_5) ** GOTO lbl233
                throw null;
            }
            case 45: {
                var18_6 /* !! */  = (int)ij.ukj("upg", ukg(int ), (int)125);
                if (!var19_5) ** GOTO lbl279
                throw null;
            }
lbl314:
            // 4 sources

            case 46: {
                var18_6 /* !! */  = (int)ij.ukj("uph", ukg(int ), (int)126);
                if (!var19_5) ** GOTO lbl283
                throw null;
            }
lbl318:
            // 2 sources

            case 47: {
                var18_6 /* !! */  = (int)ij.ukj("upi", ukg(int ), (int)127);
                if (!var19_5) ** GOTO lbl238
                throw null;
            }
lbl322:
            // 4 sources

            case 48: {
                var18_6 /* !! */  = (int)ij.ukj("upj", ukg(int ), (int)128);
                if (!var19_5) ** GOTO lbl283
                throw null;
            }
lbl326:
            // 2 sources

            case 49: {
                var18_6 /* !! */  = (int)ij.ukj("upk", ukg(int ), (int)129);
                if (!var19_5) ** GOTO lbl100
                throw null;
            }
lbl330:
            // 2 sources

            case 50: {
                var18_6 /* !! */  = (int)ij.ukj("upl", ukg(int ), (int)130);
                if (!var19_5) ** GOTO lbl260
                throw null;
            }
            case 51: {
                var18_6 /* !! */  = (int)ij.ukj("upm", ukg(int ), (int)131);
                if (!var19_5) ** GOTO lbl169
                throw null;
            }
lbl338:
            // 2 sources

            case 52: {
                var18_6 /* !! */  = (int)ij.ukj("upn", ukg(int ), (int)132);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl343:
            // 2 sources

            case 53: {
                var18_6 /* !! */  = (int)ij.ukj("upo", ukg(int ), (int)133);
                if (!var19_5) ** GOTO lbl164
                throw null;
            }
lbl347:
            // 2 sources

            case 54: {
                var18_6 /* !! */  = (int)ij.ukj("upp", ukg(int ), (int)134);
                if (!var19_5) ** GOTO lbl219
                throw null;
            }
            case 55: {
                var18_6 /* !! */  = (int)ij.ukj("upq", ukg(int ), (int)135);
                if (!var19_5) ** GOTO lbl206
                throw null;
            }
            case 56: {
                var18_6 /* !! */  = (int)ij.ukj("upr", ukg(int ), (int)136);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 57: {
                var18_6 /* !! */  = (int)ij.ukj("ups", ukg(int ), (int)137);
                if (!var19_5) ** GOTO lbl287
                throw null;
            }
            case 58: {
                var18_6 /* !! */  = (int)ij.ukj("upt", ukg(int ), (int)138);
                if (!var19_5) ** GOTO lbl292
                throw null;
            }
            case 59: {
                var18_6 /* !! */  = (int)ij.ukj("upu", ukg(int ), (int)139);
                if (!var19_5) ** GOTO lbl347
                throw null;
            }
lbl372:
            // 3 sources

            case 60: {
                var18_6 /* !! */  = (int)ij.ukj("upv", ukg(int ), (int)140);
                if (!var19_5) ** GOTO lbl238
                throw null;
            }
lbl376:
            // 2 sources

            case 61: {
                var18_6 /* !! */  = (int)ij.ukj("upw", ukg(int ), (int)141);
                if (!var19_5) ** GOTO lbl184
                throw null;
            }
            case 62: {
                var18_6 /* !! */  = (int)ij.ukj("upx", ukg(int ), (int)142);
                if (!var19_5) ** GOTO lbl338
                throw null;
            }
            case 63: {
                var18_6 /* !! */  = (int)ij.ukj("upy", ukg(int ), (int)143);
                if (!var19_5) ** GOTO lbl296
                throw null;
            }
lbl388:
            // 2 sources

            case 64: {
                var18_6 /* !! */  = (int)ij.ukj("upz", ukg(int ), (int)144);
                if (!var19_5) ** GOTO lbl314
                throw null;
            }
lbl392:
            // 2 sources

            case 65: {
                var18_6 /* !! */  = (int)ij.ukj("uqa", ukg(int ), (int)145);
                if (!var19_5) ** GOTO lbl105
                throw null;
            }
            case 66: {
                do {
                    var18_6 /* !! */  = (int)ij.ukj("uqb", ukg(int ), (int)146);
                } while (!var19_5);
                throw null;
            }
lbl401:
            // 2 sources

            case 67: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_6 /* !! */  = (int)ij.ukj("uqc", ukg(int ), (int)147);
                    if (!var19_5) ** GOTO lbl219
                    throw null;
                }
            }
lbl406:
            // 3 sources

            case 68: {
                var18_6 /* !! */  = (int)ij.ukj("uqd", ukg(int ), (int)148);
                if (!var19_5) ** GOTO lbl189
                throw null;
            }
            case 69: {
                var18_6 /* !! */  = (int)ij.ukj("uqe", ukg(int ), (int)149);
                if (!var19_5) ** GOTO lbl120
                throw null;
            }
lbl414:
            // 2 sources

            case 70: {
                var18_6 /* !! */  = (int)ij.ukj("uqf", ukg(int ), (int)150);
                if (!var19_5) ** GOTO lbl314
                throw null;
            }
            case 71: {
                var18_6 /* !! */  = (int)ij.ukj("uqg", ukg(int ), (int)151);
                if (!var19_5) ** GOTO lbl296
                throw null;
            }
            case 72: 
        }
        var18_6 /* !! */  = (int)ij.ukj("uqh", ukg(int ), (int)152);
        ** while (!var19_5)
lbl425:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vre() {
        ij.urv[100] = 225689645713829265L;
        ij.urv[101] = 6621824061964978621L;
        ij.urv[102] = 574094653234442601L;
        ij.urv[103] = 6967388198749781141L;
        ij.urv[104] = 7853428084247110455L;
        ij.urv[105] = 1715398479927378630L;
        ij.urv[106] = -5801222386516106116L;
        ij.urv[107] = -5945078769659960140L;
        ij.urv[108] = 7810839719886774655L;
        ij.urv[109] = 153468609143990809L;
        ij.urv[110] = -3912309382745231624L;
        ij.urv[111] = -3780143869935707628L;
        ij.urv[112] = -4184696400189631978L;
        ij.urv[113] = 8759190500646280340L;
        ij.urv[114] = -8358130127134518480L;
        ij.urv[115] = -6273031895340019544L;
        ij.urv[116] = -6825822887308910320L;
        ij.urv[117] = 5023928239829008754L;
        ij.urv[118] = 8332653597120806792L;
        ij.urv[119] = -3860514439298827650L;
        ij.urv[120] = -8346373256967725985L;
        ij.urv[121] = -4353728289900977485L;
        ij.urv[122] = 6671676047062799565L;
        ij.urv[123] = 1724728362810870400L;
        ij.urv[124] = 3290526549017889633L;
        ij.urv[125] = -6450951949371860105L;
        ij.urv[126] = 7486371823950617945L;
        ij.urv[127] = -4293794389798025047L;
        ij.urv[128] = 6374204029332620776L;
        ij.urv[129] = -7487645434784753455L;
        ij.urv[130] = -804272152876476450L;
        ij.urv[131] = 4231193129142871721L;
        ij.urv[132] = 5911624276863521342L;
        ij.urv[133] = -8578659243273950707L;
        ij.urv[134] = -3371135877286496823L;
        ij.urv[135] = 3197954445527342444L;
        ij.urv[136] = 234717383558063081L;
        ij.urv[137] = -5966352314978866236L;
        ij.urv[138] = 4634314919771033617L;
        ij.urv[139] = -6655683949764217271L;
        ij.urv[140] = 2288477873420664139L;
        ij.urv[141] = 7412182414293560541L;
        ij.urv[142] = -6610808558299986493L;
        ij.urv[143] = 5029890153766730073L;
        ij.urv[144] = 7243744294697388164L;
        ij.urv[145] = -9208577816166760681L;
        ij.urv[146] = 7433994623941515750L;
        ij.urv[147] = 1836809106225103641L;
        ij.urv[148] = -8808969404686231272L;
        ij.urv[149] = 6756117907636503938L;
        ij.urv[150] = 3118825961630649820L;
        ij.urv[151] = 3151836976766796512L;
        ij.urv[152] = -3232118375617502514L;
        ij.urv[153] = -9165591916665507506L;
        ij.urv[154] = -5014490086325316709L;
        ij.urv[155] = -6206869673019808401L;
        ij.urv[156] = 3254028561723842774L;
        ij.urv[157] = 4640644543010014181L;
        ij.urv[158] = -6389505047474055814L;
        ij.urv[159] = 5599862273220395043L;
        ij.urv[160] = 610937575145599431L;
        ij.urv[161] = 2113846844309551227L;
        ij.urv[162] = -752883707312091359L;
        ij.urv[163] = -145929076767543094L;
        ij.urv[164] = 5833260960463175142L;
        ij.urv[165] = 7613209118264495064L;
        ij.urv[166] = 3381512728238450119L;
        ij.urv[167] = 7649794657399739378L;
        ij.urv[168] = 7320657564756812012L;
        ij.urv[169] = -3712909299626715414L;
        ij.urv[170] = 234942109946466285L;
        ij.urv[171] = -6835369362402215613L;
        ij.urv[172] = 2465775053488458256L;
        ij.urv[173] = -4822664254493986778L;
        ij.urv[174] = -3990773699481933878L;
        ij.urv[175] = -799773306570555847L;
        ij.urv[176] = 3392604108733000883L;
        ij.urv[177] = 4631422103916195522L;
        ij.urv[178] = -8844163492947571372L;
        ij.urv[179] = -2353938753529848701L;
        ij.urv[180] = -2728122033130376661L;
        ij.urv[181] = 8507188666940697824L;
        ij.urv[182] = -1941238698610653216L;
        ij.urv[183] = 5035070679643269338L;
        ij.urv[184] = 6852774789279939482L;
        ij.urv[185] = -7864497538637710542L;
        ij.urv[186] = 393391358908731672L;
        ij.urv[187] = -6696727214349241419L;
        ij.urv[188] = 2818348017640171405L;
        ij.urv[189] = -8075025585487012289L;
        ij.urv[190] = 212315493595513578L;
    }

    private static /* synthetic */ void vny() {
        ij.ukh[400] = -1015701461;
        ij.ukh[401] = -622942623;
        ij.ukh[402] = 660872371;
        ij.ukh[403] = -95713328;
        ij.ukh[404] = 521897017;
        ij.ukh[405] = -1839586741;
        ij.ukh[406] = 499473649;
        ij.ukh[407] = -467160929;
        ij.ukh[408] = -2111781654;
        ij.ukh[409] = -1424222066;
        ij.ukh[410] = -185021887;
        ij.ukh[411] = 1483111512;
        ij.ukh[412] = 1791426750;
        ij.ukh[413] = -1033864873;
        ij.ukh[414] = 1233629379;
        ij.ukh[415] = -404001807;
        ij.ukh[416] = -838860581;
        ij.ukh[417] = -519881295;
        ij.ukh[418] = -1602492283;
        ij.ukh[419] = -1115755389;
        ij.ukh[420] = -1087068200;
        ij.ukh[421] = -949333719;
        ij.ukh[422] = -612325951;
        ij.ukh[423] = -238007710;
        ij.ukh[424] = 994395832;
        ij.ukh[425] = 1315380972;
        ij.ukh[426] = 1349617804;
        ij.ukh[427] = -75944303;
        ij.ukh[428] = 605853336;
        ij.ukh[429] = 759328453;
        ij.ukh[430] = -2021842581;
        ij.ukh[431] = 95804445;
        ij.ukh[432] = 1210431531;
        ij.ukh[433] = -1900791748;
        ij.ukh[434] = 1710958847;
        ij.ukh[435] = 1209100850;
        ij.ukh[436] = -1082321805;
        ij.ukh[437] = 1202789472;
        ij.ukh[438] = -241637618;
        ij.ukh[439] = -1076361215;
        ij.ukh[440] = 1672295691;
        ij.ukh[441] = 2072188914;
        ij.ukh[442] = -73496648;
        ij.ukh[443] = 1812233888;
        ij.ukh[444] = 1528362751;
        ij.ukh[445] = -1910765935;
        ij.ukh[446] = -439223865;
        ij.ukh[447] = -2110025576;
        ij.ukh[448] = -752637188;
        ij.ukh[449] = -417789526;
        ij.ukh[450] = 572310371;
        ij.ukh[451] = -1283664580;
        ij.ukh[452] = 0x5158558;
        ij.ukh[453] = 798402019;
        ij.ukh[454] = -839981030;
        ij.ukh[455] = 2094047844;
        ij.ukh[456] = 1684559091;
        ij.ukh[457] = 1477645779;
        ij.ukh[458] = 1687870523;
        ij.ukh[459] = 427986392;
        ij.ukh[460] = 1304162228;
        ij.ukh[461] = 596122722;
        ij.ukh[462] = -1902958582;
        ij.ukh[463] = -2081206779;
        ij.ukh[464] = -1048595842;
        ij.ukh[465] = 650576843;
        ij.ukh[466] = 1914025493;
        ij.ukh[467] = 1831516612;
        ij.ukh[468] = 661432907;
        ij.ukh[469] = 1794749390;
        ij.ukh[470] = -1254672631;
        ij.ukh[471] = 598450711;
        ij.ukh[472] = -1538546042;
        ij.ukh[473] = 1836445407;
        ij.ukh[474] = -865362607;
        ij.ukh[475] = 925548352;
        ij.ukh[476] = 624229998;
        ij.ukh[477] = 629457131;
        ij.ukh[478] = 16616540;
        ij.ukh[479] = -276105590;
        ij.ukh[480] = 857087881;
        ij.ukh[481] = 946257699;
        ij.ukh[482] = 399595845;
        ij.ukh[483] = 381357225;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = ij.bf;
        if (true) ** GOTO lbl5
        block61: while (true) {
            v0 /* !! */  = (long)(v1 - ij.ukj("vho", urt(int ), (int)154));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1976799909: {
                    break block61;
                }
                case -1935621433: {
                    v1 = ij.ukj("vhp", urt(int ), (int)155);
                    continue block61;
                }
                case 27381895: {
                    v1 = ij.ukj("vhq", urt(int ), (int)156);
                    continue block61;
                }
                case 2086605908: {
                    v1 = ij.ukj("vhr", urt(int ), (int)157);
                    continue block61;
                }
            }
            break;
        }
        var3_1 = ij.c;
        v2 /* !! */  = ij.bf;
        if (true) ** GOTO lbl22
        block62: while (true) {
            v2 /* !! */  = (long)(ij.ukj("vht", urt(int ), (int)159) - ij.ukj("vhs", urt(int ), (int)158));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1976799909: {
                    break block62;
                }
                case 1412618844: {
                    continue block62;
                }
            }
            break;
        }
        var2_2 /* !! */  = ij.b;
        v3 /* !! */  = ij.bf;
        if (true) ** GOTO lbl32
        block63: while (true) {
            v3 /* !! */  = (long)(v4 - ij.ukj("vhu", urt(int ), (int)160));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2100208958: {
                    v4 = ij.ukj("vhv", urt(int ), (int)161);
                    continue block63;
                }
                case -1976799909: {
                    break block63;
                }
                case -1050510206: {
                    v4 = ij.ukj("vhw", urt(int ), (int)162);
                    continue block63;
                }
                case 914533048: {
                    v4 = ij.ukj("vhx", urt(int ), (int)163);
                    continue block63;
                }
            }
            break;
        }
        var1_3 = ij.a;
        if (var3_1) {
            throw null;
lbl47:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl47
        v5 = ij.ukj("vhy", ukg(int ), (int)443);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = ij.bf - ij.ukj("vhz", urt(int ), (int)164)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ij.ukj("via", ukg(int ), (int)444)) break;
            v6 /* !! */  = (long)ij.ukj("vib", ukg(int ), (int)445);
        }
        this.initialized = v5;
        if (var1_3 || var1_3) ** GOTO lbl47
        v7 = ij.ukj("vic", ukg(int ), (int)446);
        v8 /* !! */  = ij.bf;
        if (true) ** GOTO lbl63
        block66: while (true) {
            v8 /* !! */  = (long)(v9 - ij.ukj("vid", urt(int ), (int)165));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1976799909: {
                    break block66;
                }
                case -878204784: {
                    v9 = ij.ukj("vie", urt(int ), (int)166);
                    continue block66;
                }
                case 882256069: {
                    v9 = ij.ukj("vif", urt(int ), (int)167);
                    continue block66;
                }
            }
            break;
        }
        this.lastEntityId = (int)v7;
        if (var1_3 || var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v10 = ij.ukj("vig", ukg(int ), (int)447);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = ij.bf - ij.ukj("vih", urt(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ij.ukj("vii", ukg(int ), (int)448)) break;
                    v11 /* !! */  = (long)ij.ukj("vij", ukg(int ), (int)449);
                }
                this.lastDirectionTick = (int)v10;
                if (var1_3 || var1_3) ** GOTO lbl47
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = ij.bf - ij.ukj("vik", urt(int ), (int)169)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ij.ukj("vil", ukg(int ), (int)450)) break;
                    v12 /* !! */  = (long)ij.ukj("vim", ukg(int ), (int)451);
                }
                v13 /* !! */  = ij.bf;
                if (true) ** GOTO lbl94
                block69: while (true) {
                    v13 /* !! */  = (long)(v14 - ij.ukj("vin", urt(int ), (int)170));
lbl94:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1976799909: {
                            break block69;
                        }
                        case 1869865168: {
                            v14 = ij.ukj("vio", urt(int ), (int)171);
                            continue block69;
                        }
                        case 2119653369: {
                            v14 = ij.ukj("vip", urt(int ), (int)172);
                            continue block69;
                        }
                    }
                    break;
                }
                if (this.random.nextBoolean()) {
                    v15 = ij.ukj("viq", ukg(int ), (int)452);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    v15 = ij.ukj("vir", ukg(int ), (int)453);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = ij.bf - ij.ukj("vis", urt(int ), (int)173)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ij.ukj("vit", ukg(int ), (int)454)) break;
                    v16 /* !! */  = (long)ij.ukj("viu", ukg(int ), (int)455);
                }
                this.sideDirection = (int)v15;
                if (var1_3 || var1_3) ** GOTO lbl47
                v17 /* !! */  = ij.bf;
                if (true) ** GOTO lbl120
                block71: while (true) {
                    v17 /* !! */  = (long)(v18 - ij.ukj("viv", urt(int ), (int)174));
lbl120:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1976799909: {
                            break block71;
                        }
                        case -1179131853: {
                            v18 = ij.ukj("viw", urt(int ), (int)175);
                            continue block71;
                        }
                        case 1381278120: {
                            v18 = ij.ukj("vix", urt(int ), (int)176);
                            continue block71;
                        }
                    }
                    break;
                }
                this.lastStepYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl47
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = ij.bf - ij.ukj("viy", urt(int ), (int)177)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ij.ukj("viz", ukg(int ), (int)456)) break;
                    v19 /* !! */  = (long)ij.ukj("vja", ukg(int ), (int)457);
                }
                this.lastStepPitch = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl47
                v20 /* !! */  = ij.bf;
                if (true) ** GOTO lbl142
                block73: while (true) {
                    v20 /* !! */  = (long)(v21 - ij.ukj("vjb", urt(int ), (int)178));
lbl142:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1976799909: {
                            break block73;
                        }
                        case 301651438: {
                            v21 = ij.ukj("vjc", urt(int ), (int)179);
                            continue block73;
                        }
                        case 1226650765: {
                            v21 = ij.ukj("vjd", urt(int ), (int)180);
                            continue block73;
                        }
                    }
                    break;
                }
                v22 /* !! */  = ij.bf;
                if (true) ** GOTO lbl155
                block74: while (true) {
                    v22 /* !! */  = (long)(v23 - ij.ukj("vje", urt(int ), (int)181));
lbl155:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1976799909: {
                            break block74;
                        }
                        case -1156903947: {
                            v23 = ij.ukj("vjf", urt(int ), (int)182);
                            continue block74;
                        }
                        case 1215862360: {
                            v23 = ij.ukj("vjg", urt(int ), (int)183);
                            continue block74;
                        }
                    }
                    break;
                }
                this.model.resetPlayback();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ij.ukj("vjh", ukg(int ), (int)458);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl172:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ij.ukj("vji", ukg(int ), (int)459);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl177:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ij.ukj("vjj", ukg(int ), (int)460);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl236
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ij.ukj("vjk", ukg(int ), (int)461);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl188:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ij.ukj("vjl", ukg(int ), (int)462);
                if (!var3_1) ** GOTO lbl177
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ij.ukj("vjm", ukg(int ), (int)463);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl197:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ij.ukj("vjn", ukg(int ), (int)464);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl202:
            // 3 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)ij.ukj("vjo", ukg(int ), (int)465);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ij.ukj("vjp", ukg(int ), (int)466);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
lbl211:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ij.ukj("vjr", ukg(int ), (int)467);
                if (!var3_1) ** GOTO lbl202
                throw null;
            }
lbl215:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ij.ukj("vjt", ukg(int ), (int)468);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl220:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ij.ukj("vjw", ukg(int ), (int)469);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
lbl224:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ij.ukj("vjy", ukg(int ), (int)470);
                if (!var3_1) ** GOTO lbl220
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)ij.ukj("vka", ukg(int ), (int)471);
                if (!var3_1) break;
                throw null;
            }
lbl232:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ij.ukj("vke", ukg(int ), (int)472);
                if (!var3_1) break;
                throw null;
            }
lbl236:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)ij.ukj("vkg", ukg(int ), (int)473);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
lbl240:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)ij.ukj("vkh", ukg(int ), (int)474);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)ij.ukj("vkj", ukg(int ), (int)475);
        ** while (!var3_1)
lbl247:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ij() {
        var2_1 /* !! */  = ij.b;
        super("Test");
        this.random = new SecureRandom();
        this.model = ms.get();
        this.lastEntityId = (int)ij.ukj("ukk", ukg(int ), (int)0);
        this.lastDirectionTick = (int)ij.ukj("ukl", ukg(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.sideDirection = (int)ij.ukj("ukm", ukg(int ), (int)2);
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ij.ukj("ukn", ukg(int ), (int)3);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ij.ukj("uko", ukg(int ), (int)4);
                ** GOTO lbl24
            }
            case 2: {
                var2_1 /* !! */  = (int)ij.ukj("ukp", ukg(int ), (int)5);
                ** GOTO lbl24
            }
lbl22:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)ij.ukj("ukq", ukg(int ), (int)6);
            }
lbl24:
            // 4 sources

            case 4: {
                var2_1 /* !! */  = (int)ij.ukj("ukr", ukg(int ), (int)7);
                ** GOTO lbl22
            }
            case 5: {
                var2_1 /* !! */  = (int)ij.ukj("uks", ukg(int ), (int)8);
                ** GOTO lbl22
            }
            case 6: {
                while (true) {
                    var2_1 /* !! */  = (int)ij.ukj("ukt", ukg(int ), (int)9);
                }
            }
            case 7: 
        }
        while (true) {
            var2_1 /* !! */  = (int)ij.ukj("uku", ukg(int ), (int)10);
        }
    }

    private static /* synthetic */ void vmj() {
        ij.ukh[0] = 143227380;
        ij.ukh[1] = 1672723003;
        ij.ukh[2] = -619519035;
        ij.ukh[3] = -1405917289;
        ij.ukh[4] = 188903785;
        ij.ukh[5] = 1960904964;
        ij.ukh[6] = 344530879;
        ij.ukh[7] = -1708782453;
        ij.ukh[8] = -1041231684;
        ij.ukh[9] = -1202154768;
        ij.ukh[10] = 282156658;
        ij.ukh[11] = 619192939;
        ij.ukh[12] = -1516324637;
        ij.ukh[13] = 2126032521;
        ij.ukh[14] = 111038702;
        ij.ukh[15] = 1018489980;
        ij.ukh[16] = -2095866411;
        ij.ukh[17] = 1373881478;
        ij.ukh[18] = -1014415876;
        ij.ukh[19] = 1583216905;
        ij.ukh[20] = 891068396;
        ij.ukh[21] = -1341358018;
        ij.ukh[22] = 1523245092;
        ij.ukh[23] = -1128919976;
        ij.ukh[24] = 1753894589;
        ij.ukh[25] = 959151701;
        ij.ukh[26] = -932833296;
        ij.ukh[27] = -299571586;
        ij.ukh[28] = -1390118396;
        ij.ukh[29] = 1643187415;
        ij.ukh[30] = 1218802815;
        ij.ukh[31] = -1429561072;
        ij.ukh[32] = -787745173;
        ij.ukh[33] = -983904509;
        ij.ukh[34] = 1381554888;
        ij.ukh[35] = -86994481;
        ij.ukh[36] = 369260099;
        ij.ukh[37] = -130130980;
        ij.ukh[38] = 1162923138;
        ij.ukh[39] = -1141839855;
        ij.ukh[40] = -734290311;
        ij.ukh[41] = 2107058652;
        ij.ukh[42] = 979964362;
        ij.ukh[43] = 807238316;
        ij.ukh[44] = 317241450;
        ij.ukh[45] = 1752652435;
        ij.ukh[46] = 1061997741;
        ij.ukh[47] = -1732151085;
        ij.ukh[48] = -1511872841;
        ij.ukh[49] = 1851801151;
        ij.ukh[50] = 842676466;
        ij.ukh[51] = -241110632;
        ij.ukh[52] = 2146173004;
        ij.ukh[53] = -742351769;
        ij.ukh[54] = 2041354904;
        ij.ukh[55] = 387213357;
        ij.ukh[56] = 1279227388;
        ij.ukh[57] = 832839152;
        ij.ukh[58] = -852024722;
        ij.ukh[59] = -460462966;
        ij.ukh[60] = -1766005715;
        ij.ukh[61] = -1845267318;
        ij.ukh[62] = 926116439;
        ij.ukh[63] = -2003046940;
        ij.ukh[64] = 1028432963;
        ij.ukh[65] = -1277008674;
        ij.ukh[66] = -1780438860;
        ij.ukh[67] = -1921277789;
        ij.ukh[68] = 1637849034;
        ij.ukh[69] = -998780543;
        ij.ukh[70] = -1945069607;
        ij.ukh[71] = 1756669924;
        ij.ukh[72] = 1530543315;
        ij.ukh[73] = 1570998679;
        ij.ukh[74] = -1645914683;
        ij.ukh[75] = 2050470484;
        ij.ukh[76] = 824437534;
        ij.ukh[77] = -423396532;
        ij.ukh[78] = 1232943792;
        ij.ukh[79] = -1142478178;
        ij.ukh[80] = -1383843111;
        ij.ukh[81] = 1675419433;
        ij.ukh[82] = -267410098;
        ij.ukh[83] = 253391402;
        ij.ukh[84] = 1600255163;
        ij.ukh[85] = -1796394220;
        ij.ukh[86] = -312329558;
        ij.ukh[87] = 1613194729;
        ij.ukh[88] = 310271363;
        ij.ukh[89] = 456331264;
        ij.ukh[90] = 774159675;
        ij.ukh[91] = 968360759;
        ij.ukh[92] = -625604647;
        ij.ukh[93] = -1894030135;
        ij.ukh[94] = -599531369;
        ij.ukh[95] = 772888121;
        ij.ukh[96] = 1620653963;
        ij.ukh[97] = 901598261;
        ij.ukh[98] = -367209207;
        ij.ukh[99] = -1812042131;
    }

    private static /* synthetic */ float umt(int n2) {
        return Float.intBitsToFloat(ukh[n2] ^ uki[n2]);
    }

    private static /* synthetic */ void vps() {
        ij.uki[400] = -1015701470;
        ij.uki[401] = -622942611;
        ij.uki[402] = 660872375;
        ij.uki[403] = -95713321;
        ij.uki[404] = 521897023;
        ij.uki[405] = -1839586747;
        ij.uki[406] = 499473648;
        ij.uki[407] = -467160941;
        ij.uki[408] = -2111781658;
        ij.uki[409] = -1424222078;
        ij.uki[410] = 185021886;
        ij.uki[411] = -6288585;
        ij.uki[412] = 1791426751;
        ij.uki[413] = -42012717;
        ij.uki[414] = -1233629380;
        ij.uki[415] = -1607090725;
        ij.uki[416] = 838860580;
        ij.uki[417] = -96881447;
        ij.uki[418] = -1602492284;
        ij.uki[419] = 1194757524;
        ij.uki[420] = 1087068199;
        ij.uki[421] = 1827985823;
        ij.uki[422] = 612325950;
        ij.uki[423] = 445380373;
        ij.uki[424] = -994395833;
        ij.uki[425] = -1985789416;
        ij.uki[426] = -1349617805;
        ij.uki[427] = 146935687;
        ij.uki[428] = 605853330;
        ij.uki[429] = 759328459;
        ij.uki[430] = -2021842581;
        ij.uki[431] = 95804432;
        ij.uki[432] = 1210431532;
        ij.uki[433] = -1900791750;
        ij.uki[434] = 1710958846;
        ij.uki[435] = 1209100853;
        ij.uki[436] = -1082321805;
        ij.uki[437] = 1202789472;
        ij.uki[438] = -241637632;
        ij.uki[439] = -1076361204;
        ij.uki[440] = 1672295687;
        ij.uki[441] = 2072188914;
        ij.uki[442] = -73496646;
        ij.uki[443] = 1812233888;
        ij.uki[444] = 1528362750;
        ij.uki[445] = -1301441969;
        ij.uki[446] = 1708259783;
        ij.uki[447] = 37458072;
        ij.uki[448] = 752637187;
        ij.uki[449] = 1065041936;
        ij.uki[450] = 572310370;
        ij.uki[451] = 41651648;
        ij.uki[452] = 85296473;
        ij.uki[453] = -798402020;
        ij.uki[454] = 839981029;
        ij.uki[455] = -1085230430;
        ij.uki[456] = -1684559092;
        ij.uki[457] = 698256716;
        ij.uki[458] = 1687870527;
        ij.uki[459] = 427986394;
        ij.uki[460] = 1304162227;
        ij.uki[461] = 596122725;
        ij.uki[462] = -1902958565;
        ij.uki[463] = -2081206780;
        ij.uki[464] = -1048595853;
        ij.uki[465] = 650576847;
        ij.uki[466] = 1914025476;
        ij.uki[467] = 1831516608;
        ij.uki[468] = 661432904;
        ij.uki[469] = 1794749388;
        ij.uki[470] = -1254672628;
        ij.uki[471] = 598450714;
        ij.uki[472] = -1538546038;
        ij.uki[473] = 1836445391;
        ij.uki[474] = -865362600;
        ij.uki[475] = 925548352;
        ij.uki[476] = 624229999;
        ij.uki[477] = -1169577110;
        ij.uki[478] = 16616541;
        ij.uki[479] = 2023094376;
        ij.uki[480] = 857087880;
        ij.uki[481] = 946257698;
        ij.uki[482] = 399595846;
        ij.uki[483] = 381357227;
    }

    static {
        ukh = new int[484];
        uki = new int[484];
        ij.vmj();
        ij.vmx();
        ij.vng();
        ij.vnp();
        ij.vny();
        ij.vog();
        ij.vor();
        ij.vpa();
        ij.vpi();
        ij.vps();
        uru = new long[191];
        urv = new long[191];
        ij.vqa();
        ij.vqk();
        ij.vqt();
        ij.vre();
        VERTICAL_MULTIPOINTS = new double[]{0.92, 0.85, 0.78, 0.71, 0.64, 0.57, 0.5};
        HORIZONTAL_MULTIPOINTS = new double[][]{{0.0, 0.0}, {-1.0, -1.0}, {0.0, -1.0}, {1.0, -1.0}, {-1.0, 0.0}, {1.0, 0.0}, {-1.0, 1.0}, {0.0, 1.0}, {1.0, 1.0}};
    }

    private static /* synthetic */ int ukg(int n2) {
        return ukh[n2] ^ uki[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov rotationToMultipoint(class_1297 var1_1, ov var2_2, boolean var3_3) {
        block176: {
            block178: {
                block177: {
                    var40_4 = ij.c;
                    var39_5 /* !! */  = ij.b;
                    var38_6 = ij.a;
                    if (var40_4) {
                        throw null;
lbl6:
                        // 49 sources

                        return null;
                    }
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var4_7 = ij.mc.field_1724.method_33571();
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var5_8 = var1_1.method_5829();
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var6_9 = (var5_8.field_1323 + var5_8.field_1320) * ij.ukj("uyw", usf(int ), (int)92);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var8_10 = (var5_8.field_1321 + var5_8.field_1324) * ij.ukj("uyx", usf(int ), (int)93);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var10_11 = (var5_8.field_1320 - var5_8.field_1323) * ij.ukj("uyy", usf(int ), (int)94);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var12_12 = (var5_8.field_1324 - var5_8.field_1321) * ij.ukj("uyz", usf(int ), (int)95);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var14_13 = var5_8.field_1325 - var5_8.field_1322;
                    if (var38_6 || var38_6) ** GOTO lbl6
                    if (var3_3) break block176;
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var16_14 = ij.VERTICAL_MULTIPOINTS.length * ij.ukj("uza", ukg(int ), (int)279) - ij.ukj("uzb", ukg(int ), (int)280);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var17_16 = Math.floorMod(ij.mc.field_1724.field_6012 / ij.ukj("uzc", ukg(int ), (int)281) + this.multipointOffset, var16_14);
                    if (var38_6 || var38_6) ** GOTO lbl6
                    if (var17_16 >= ij.VERTICAL_MULTIPOINTS.length) break block177;
                    if (var38_6) ** GOTO lbl6
                    v0 = var17_16;
                    if (var40_4) {
                        throw null;
                    }
                    break block178;
                }
                if (var38_6 || var38_6) ** GOTO lbl6
                v0 = var18_18 = var16_14 - var17_16;
            }
            if (var38_6 || var38_6) ** GOTO lbl6
            var19_19 = Math.floorMod(ij.mc.field_1724.field_6012 / ij.ukj("uzd", ukg(int ), (int)282) + this.multipointOffset, ij.HORIZONTAL_MULTIPOINTS.length);
            if (var38_6 || var38_6) ** GOTO lbl6
            var20_21 = ij.HORIZONTAL_MULTIPOINTS[var19_19];
            if (var38_6 || var38_6) ** GOTO lbl6
            var21_23 = new class_243(var6_9 + var20_21[0] * var10_11, var5_8.field_1322 + var14_13 * ij.VERTICAL_MULTIPOINTS[var18_18], var8_10 + var20_21[1] * var12_12);
            if (var38_6 || var38_6) ** GOTO lbl6
            return this.angleTo(var4_7, var21_23, var2_2);
        }
        if (var38_6 || var38_6) ** GOTO lbl6
        var16_15 = null;
        if (var38_6 || var38_6) ** GOTO lbl6
        var17_17 /* !! */  = ij.ukj("uze", usf(int ), (int)96);
        if (var38_6) ** GOTO lbl6
        if (var39_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var39_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var38_6) ** GOTO lbl6
                var19_20 = ij.VERTICAL_MULTIPOINTS;
                if (var38_6) ** GOTO lbl6
                var20_22 = var19_20.length;
                if (var38_6) ** GOTO lbl6
                var21_24 = ij.ukj("uzf", ukg(int ), (int)283);
                if (var38_6) ** GOTO lbl6
                do {
                    if (var38_6 || var38_6) ** GOTO lbl6
                    if (var21_24 >= var20_22) ** GOTO lbl109
                    if (var38_6) ** GOTO lbl6
                    var22_25 = var19_20[var21_24];
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var24_26 = var5_8.field_1322 + var14_13 * var22_25;
                    if (var38_6 || var38_6) ** GOTO lbl6
                    var26_27 = ij.HORIZONTAL_MULTIPOINTS;
                    if (var38_6) ** GOTO lbl6
                    var27_28 = var26_27.length;
                    if (var38_6) ** GOTO lbl6
                    var28_29 = ij.ukj("uzg", ukg(int ), (int)284);
                    if (var38_6) ** GOTO lbl6
                    do {
                        if (var38_6 || var38_6) ** GOTO lbl6
                        if (var28_29 >= var27_28) ** GOTO lbl104
                        if (var38_6) ** GOTO lbl6
                        var29_30 = var26_27[var28_29];
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var30_31 = new class_243(var6_9 + var29_30[0] * var10_11, var24_26, var8_10 + var29_30[1] * var12_12);
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var31_32 = this.angleTo(var4_7, var30_31, var2_2);
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var32_33 = Math.abs(class_3532.method_15393((float)(var31_32.getYaw() - this.lerpYaw)));
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var34_34 = Math.abs(class_3532.method_15393((float)(var31_32.getPitch() - this.lerpPitch)));
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var36_35 = Math.hypot(var32_33, var34_34);
                        if (var38_6 || var38_6) ** GOTO lbl6
                        if (!(var36_35 < var17_17 /* !! */ )) ** GOTO lbl99
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var17_17 /* !! */  = (CallSite)var36_35;
                        if (var38_6 || var38_6) ** GOTO lbl6
                        var16_15 = var30_31;
                        if (var38_6) ** GOTO lbl6
lbl99:
                        // 2 sources

                        if (var38_6 || var38_6) ** GOTO lbl6
                        ++var28_29;
                        if (var38_6) ** GOTO lbl6
                    } while (!var40_4);
                    throw null;
lbl104:
                    // 1 sources

                    if (var38_6 || var38_6) ** GOTO lbl6
                    ++var21_24;
                    if (var38_6) ** GOTO lbl6
                } while (!var40_4);
                throw null;
lbl109:
                // 1 sources

                if (var38_6 || var38_6) ** GOTO lbl6
                if (var16_15 != null) ** GOTO lbl116
                if (var38_6) ** GOTO lbl6
                v1 = var2_2;
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl119
lbl116:
                // 1 sources

                if (!var38_6 && !var38_6) ** break;
                ** continue;
                v1 = this.angleTo(var4_7, var16_15, var2_2);
lbl119:
                // 2 sources

                return v1;
            }
            case 0: {
                var39_5 /* !! */  = (int)ij.ukj("uzh", ukg(int ), (int)285);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl125:
            // 3 sources

            case 1: {
                var39_5 /* !! */  = (int)ij.ukj("uzi", ukg(int ), (int)286);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl130:
            // 3 sources

            case 2: {
                var39_5 /* !! */  = (int)ij.ukj("uzj", ukg(int ), (int)287);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl135:
            // 2 sources

            case 3: {
                var39_5 /* !! */  = (int)ij.ukj("uzk", ukg(int ), (int)288);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl327
            }
            case 4: {
                var39_5 /* !! */  = (int)ij.ukj("uzl", ukg(int ), (int)289);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl145:
            // 2 sources

            case 5: {
                var39_5 /* !! */  = (int)ij.ukj("uzm", ukg(int ), (int)290);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl150:
            // 2 sources

            case 6: {
                var39_5 /* !! */  = (int)ij.ukj("uzn", ukg(int ), (int)291);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl155:
            // 2 sources

            case 7: {
                var39_5 /* !! */  = (int)ij.ukj("uzo", ukg(int ), (int)292);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl160:
            // 2 sources

            case 8: {
                var39_5 /* !! */  = (int)ij.ukj("uzp", ukg(int ), (int)293);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 9: {
                var39_5 /* !! */  = (int)ij.ukj("uzq", ukg(int ), (int)294);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl170:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var39_5 /* !! */  = (int)ij.ukj("uzr", ukg(int ), (int)295);
                    if (var40_4) {
                        throw null;
                    }
                    ** GOTO lbl376
                    break;
                }
            }
            case 11: {
                var39_5 /* !! */  = (int)ij.ukj("uzs", ukg(int ), (int)296);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl497
            }
lbl181:
            // 2 sources

            case 12: {
                var39_5 /* !! */  = (int)ij.ukj("uzt", ukg(int ), (int)297);
                if (!var40_4) ** GOTO lbl155
                throw null;
            }
lbl185:
            // 2 sources

            case 13: {
                var39_5 /* !! */  = (int)ij.ukj("uzu", ukg(int ), (int)298);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl190:
            // 2 sources

            case 14: {
                var39_5 /* !! */  = (int)ij.ukj("uzv", ukg(int ), (int)299);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 15: {
                var39_5 /* !! */  = (int)ij.ukj("uzw", ukg(int ), (int)300);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 16: {
                var39_5 /* !! */  = (int)ij.ukj("uzx", ukg(int ), (int)301);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl205:
            // 4 sources

            case 17: {
                var39_5 /* !! */  = (int)ij.ukj("uzy", ukg(int ), (int)302);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 18: {
                var39_5 /* !! */  = (int)ij.ukj("uzz", ukg(int ), (int)303);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl215:
            // 2 sources

            case 19: {
                var39_5 /* !! */  = (int)ij.ukj("vaa", ukg(int ), (int)304);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl220:
            // 2 sources

            case 20: {
                var39_5 /* !! */  = (int)ij.ukj("vab", ukg(int ), (int)305);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl489
            }
lbl225:
            // 2 sources

            case 21: {
                var39_5 /* !! */  = (int)ij.ukj("vac", ukg(int ), (int)306);
                if (!var40_4) ** GOTO lbl205
                throw null;
            }
            case 22: {
                var39_5 /* !! */  = (int)ij.ukj("vad", ukg(int ), (int)307);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 23: {
                var39_5 /* !! */  = (int)ij.ukj("vae", ukg(int ), (int)308);
                if (!var40_4) ** GOTO lbl205
                throw null;
            }
            case 24: {
                do {
                    var39_5 /* !! */  = (int)ij.ukj("vaf", ukg(int ), (int)309);
                } while (!var40_4);
                throw null;
            }
lbl243:
            // 2 sources

            case 25: {
                var39_5 /* !! */  = (int)ij.ukj("vag", ukg(int ), (int)310);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl248:
            // 3 sources

            case 26: {
                var39_5 /* !! */  = (int)ij.ukj("vah", ukg(int ), (int)311);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 27: {
                var39_5 /* !! */  = (int)ij.ukj("vai", ukg(int ), (int)312);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl465
            }
lbl258:
            // 5 sources

            case 28: {
                var39_5 /* !! */  = (int)ij.ukj("vaj", ukg(int ), (int)313);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl469
            }
lbl263:
            // 3 sources

            case 29: {
                var39_5 /* !! */  = (int)ij.ukj("vak", ukg(int ), (int)314);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl268:
            // 2 sources

            case 30: {
                var39_5 /* !! */  = (int)ij.ukj("val", ukg(int ), (int)315);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl445
            }
            case 31: {
                var39_5 /* !! */  = (int)ij.ukj("vam", ukg(int ), (int)316);
                if (!var40_4) ** GOTO lbl268
                throw null;
            }
lbl277:
            // 2 sources

            case 32: {
                var39_5 /* !! */  = (int)ij.ukj("van", ukg(int ), (int)317);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl505
            }
            case 33: {
                var39_5 /* !! */  = (int)ij.ukj("vao", ukg(int ), (int)318);
                if (!var40_4) ** GOTO lbl248
                throw null;
            }
lbl286:
            // 3 sources

            case 34: {
                var39_5 /* !! */  = (int)ij.ukj("vap", ukg(int ), (int)319);
                if (!var40_4) ** GOTO lbl225
                throw null;
            }
            case 35: {
                var39_5 /* !! */  = (int)ij.ukj("vaq", ukg(int ), (int)320);
                if (!var40_4) ** GOTO lbl286
                throw null;
            }
            case 36: {
                var39_5 /* !! */  = (int)ij.ukj("var", ukg(int ), (int)321);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl299:
            // 2 sources

            case 37: {
                var39_5 /* !! */  = (int)ij.ukj("vas", ukg(int ), (int)322);
                if (!var40_4) ** GOTO lbl258
                throw null;
            }
lbl303:
            // 2 sources

            case 38: {
                var39_5 /* !! */  = (int)ij.ukj("vat", ukg(int ), (int)323);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 39: {
                var39_5 /* !! */  = (int)ij.ukj("vau", ukg(int ), (int)324);
                if (!var40_4) ** GOTO lbl150
                throw null;
            }
lbl312:
            // 2 sources

            case 40: {
                var39_5 /* !! */  = (int)ij.ukj("vav", ukg(int ), (int)325);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl317:
            // 2 sources

            case 41: {
                var39_5 /* !! */  = (int)ij.ukj("vaw", ukg(int ), (int)326);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 42: {
                var39_5 /* !! */  = (int)ij.ukj("vax", ukg(int ), (int)327);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl327:
            // 2 sources

            case 43: {
                var39_5 /* !! */  = (int)ij.ukj("vay", ukg(int ), (int)328);
                if (!var40_4) ** GOTO lbl125
                throw null;
            }
            case 44: {
                var39_5 /* !! */  = (int)ij.ukj("vaz", ukg(int ), (int)329);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl457
            }
lbl336:
            // 2 sources

            case 45: {
                var39_5 /* !! */  = (int)ij.ukj("vba", ukg(int ), (int)330);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl341:
            // 2 sources

            case 46: {
                var39_5 /* !! */  = (int)ij.ukj("vbb", ukg(int ), (int)331);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl346:
            // 3 sources

            case 47: {
                var39_5 /* !! */  = (int)ij.ukj("vbc", ukg(int ), (int)332);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl351:
            // 4 sources

            case 48: {
                var39_5 /* !! */  = (int)ij.ukj("vbd", ukg(int ), (int)333);
                if (!var40_4) ** GOTO lbl130
                throw null;
            }
lbl355:
            // 2 sources

            case 49: {
                var39_5 /* !! */  = (int)ij.ukj("vbe", ukg(int ), (int)334);
                if (!var40_4) ** GOTO lbl130
                throw null;
            }
lbl359:
            // 2 sources

            case 50: {
                var39_5 /* !! */  = (int)ij.ukj("vbf", ukg(int ), (int)335);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl469
            }
lbl364:
            // 3 sources

            case 51: {
                var39_5 /* !! */  = (int)ij.ukj("vbg", ukg(int ), (int)336);
                if (!var40_4) ** GOTO lbl145
                throw null;
            }
lbl368:
            // 3 sources

            case 52: {
                var39_5 /* !! */  = (int)ij.ukj("vbh", ukg(int ), (int)337);
                if (!var40_4) ** GOTO lbl215
                throw null;
            }
lbl372:
            // 2 sources

            case 53: {
                var39_5 /* !! */  = (int)ij.ukj("vbi", ukg(int ), (int)338);
                if (!var40_4) ** GOTO lbl312
                throw null;
            }
lbl376:
            // 3 sources

            case 54: {
                var39_5 /* !! */  = (int)ij.ukj("vbj", ukg(int ), (int)339);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl457
            }
            case 55: {
                var39_5 /* !! */  = (int)ij.ukj("vbk", ukg(int ), (int)340);
                if (!var40_4) ** GOTO lbl351
                throw null;
            }
lbl385:
            // 2 sources

            case 56: {
                var39_5 /* !! */  = (int)ij.ukj("vbl", ukg(int ), (int)341);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 57: {
                var39_5 /* !! */  = (int)ij.ukj("vbm", ukg(int ), (int)342);
                if (!var40_4) ** GOTO lbl125
                throw null;
            }
lbl394:
            // 4 sources

            case 58: {
                var39_5 /* !! */  = (int)ij.ukj("vbn", ukg(int ), (int)343);
                if (!var40_4) ** GOTO lbl170
                throw null;
            }
lbl398:
            // 2 sources

            case 59: {
                var39_5 /* !! */  = (int)ij.ukj("vbo", ukg(int ), (int)344);
                if (!var40_4) ** GOTO lbl258
                throw null;
            }
            case 60: {
                var39_5 /* !! */  = (int)ij.ukj("vbp", ukg(int ), (int)345);
                if (!var40_4) ** GOTO lbl364
                throw null;
            }
lbl406:
            // 2 sources

            case 61: {
                var39_5 /* !! */  = (int)ij.ukj("vbq", ukg(int ), (int)346);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl411:
            // 3 sources

            case 62: {
                var39_5 /* !! */  = (int)ij.ukj("vbr", ukg(int ), (int)347);
                if (!var40_4) ** GOTO lbl341
                throw null;
            }
lbl415:
            // 2 sources

            case 63: {
                var39_5 /* !! */  = (int)ij.ukj("vbs", ukg(int ), (int)348);
                if (!var40_4) break;
                throw null;
            }
lbl419:
            // 3 sources

            case 64: {
                var39_5 /* !! */  = (int)ij.ukj("vbt", ukg(int ), (int)349);
                if (!var40_4) ** GOTO lbl317
                throw null;
            }
            case 65: {
                var39_5 /* !! */  = (int)ij.ukj("vbu", ukg(int ), (int)350);
                if (!var40_4) ** GOTO lbl248
                throw null;
            }
            case 66: {
                var39_5 /* !! */  = (int)ij.ukj("vbv", ukg(int ), (int)351);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl432:
            // 2 sources

            case 67: {
                var39_5 /* !! */  = (int)ij.ukj("vbw", ukg(int ), (int)352);
                if (var40_4) {
                    throw null;
                }
                ** GOTO lbl469
            }
            case 68: {
                var39_5 /* !! */  = (int)ij.ukj("vbx", ukg(int ), (int)353);
                if (!var40_4) ** GOTO lbl220
                throw null;
            }
            case 69: {
                var39_5 /* !! */  = (int)ij.ukj("vby", ukg(int ), (int)354);
                if (!var40_4) ** GOTO lbl415
                throw null;
            }
lbl445:
            // 3 sources

            case 70: {
                var39_5 /* !! */  = (int)ij.ukj("vbz", ukg(int ), (int)355);
                if (!var40_4) ** GOTO lbl372
                throw null;
            }
lbl449:
            // 5 sources

            case 71: {
                var39_5 /* !! */  = (int)ij.ukj("vca", ukg(int ), (int)356);
                if (!var40_4) ** GOTO lbl190
                throw null;
            }
lbl453:
            // 2 sources

            case 72: {
                var39_5 /* !! */  = (int)ij.ukj("vcb", ukg(int ), (int)357);
                if (!var40_4) ** GOTO lbl160
                throw null;
            }
lbl457:
            // 3 sources

            case 73: {
                var39_5 /* !! */  = (int)ij.ukj("vcc", ukg(int ), (int)358);
                if (!var40_4) ** GOTO lbl368
                throw null;
            }
            case 74: {
                var39_5 /* !! */  = (int)ij.ukj("vcd", ukg(int ), (int)359);
                if (!var40_4) ** GOTO lbl135
                throw null;
            }
lbl465:
            // 3 sources

            case 75: {
                var39_5 /* !! */  = (int)ij.ukj("vce", ukg(int ), (int)360);
                if (!var40_4) ** GOTO lbl181
                throw null;
            }
lbl469:
            // 4 sources

            case 76: {
                var39_5 /* !! */  = (int)ij.ukj("vcf", ukg(int ), (int)361);
                if (!var40_4) ** GOTO lbl243
                throw null;
            }
            case 77: {
                var39_5 /* !! */  = (int)ij.ukj("vcg", ukg(int ), (int)362);
                if (!var40_4) ** GOTO lbl385
                throw null;
            }
            case 78: {
                var39_5 /* !! */  = (int)ij.ukj("vch", ukg(int ), (int)363);
                if (!var40_4) ** GOTO lbl258
                throw null;
            }
            case 79: {
                var39_5 /* !! */  = (int)ij.ukj("vci", ukg(int ), (int)364);
                if (!var40_4) ** GOTO lbl376
                throw null;
            }
lbl485:
            // 3 sources

            case 80: {
                var39_5 /* !! */  = (int)ij.ukj("vcj", ukg(int ), (int)365);
                if (!var40_4) ** GOTO lbl205
                throw null;
            }
lbl489:
            // 2 sources

            case 81: {
                var39_5 /* !! */  = (int)ij.ukj("vck", ukg(int ), (int)366);
                if (!var40_4) ** GOTO lbl465
                throw null;
            }
lbl493:
            // 2 sources

            case 82: {
                var39_5 /* !! */  = (int)ij.ukj("vcl", ukg(int ), (int)367);
                if (!var40_4) ** GOTO lbl432
                throw null;
            }
lbl497:
            // 2 sources

            case 83: {
                var39_5 /* !! */  = (int)ij.ukj("vcm", ukg(int ), (int)368);
                if (!var40_4) ** GOTO lbl453
                throw null;
            }
            case 84: {
                var39_5 /* !! */  = (int)ij.ukj("vcn", ukg(int ), (int)369);
                if (!var40_4) ** GOTO lbl449
                throw null;
            }
lbl505:
            // 2 sources

            case 85: {
                var39_5 /* !! */  = (int)ij.ukj("vco", ukg(int ), (int)370);
                if (!var40_4) ** GOTO lbl445
                throw null;
            }
            case 86: {
                var39_5 /* !! */  = (int)ij.ukj("vcp", ukg(int ), (int)371);
                if (!var40_4) ** GOTO lbl394
                throw null;
            }
            case 87: 
        }
        var39_5 /* !! */  = (int)ij.ukj("vcq", ukg(int ), (int)372);
        ** while (!var40_4)
lbl516:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov angleTo(class_243 var1_1, class_243 var2_2, ov var3_3) {
        block92: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ij.bf - ij.ukj("vew", urt(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ij.ukj("vex", ukg(int ), (int)410)) break;
                v0 /* !! */  = (long)ij.ukj("vey", ukg(int ), (int)411);
            }
            var9_4 = ij.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ij.bf - ij.ukj("vez", urt(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ij.ukj("vfa", ukg(int ), (int)412)) break;
                v1 /* !! */  = (long)ij.ukj("vfb", ukg(int ), (int)413);
            }
            var8_5 /* !! */  = ij.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ij.bf - ij.ukj("vfc", urt(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ij.ukj("vfd", ukg(int ), (int)414)) break;
                v2 /* !! */  = (long)ij.ukj("vfe", ukg(int ), (int)415);
            }
            var7_6 = ij.a;
            if (var9_4) {
                throw null;
lbl21:
                // 7 sources

                return null;
            }
            if (var7_6 || var7_6) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = ij.bf - ij.ukj("vff", urt(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ij.ukj("vfg", ukg(int ), (int)416)) break;
                v3 /* !! */  = (long)ij.ukj("vfh", ukg(int ), (int)417);
            }
            var4_7 = var2_2.method_1020(var1_1);
            if (var7_6 || var7_6) ** GOTO lbl21
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_4 = ij.bf - ij.ukj("vfi", urt(int ), (int)121)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ij.ukj("vfj", ukg(int ), (int)418)) break;
                v4 /* !! */  = (long)ij.ukj("vfk", ukg(int ), (int)419);
            }
            if (!(var4_7.method_1027() < ij.ukj("vfl", usf(int ), (int)122))) break block92;
            if (var7_6 || var7_6) ** GOTO lbl21
            return var3_3;
        }
        if (var7_6) ** GOTO lbl21
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_6) ** GOTO lbl21
                v5 /* !! */  = ij.bf;
                if (true) ** GOTO lbl49
                block66: while (true) {
                    v5 /* !! */  = (long)(v6 - ij.ukj("vfm", urt(int ), (int)123));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1976799909: {
                            break block66;
                        }
                        case -1857442174: {
                            v6 = ij.ukj("vfn", urt(int ), (int)124);
                            continue block66;
                        }
                        case -1737482634: {
                            v6 = ij.ukj("vfo", urt(int ), (int)125);
                            continue block66;
                        }
                        case 636686380: {
                            v6 = ij.ukj("vfp", urt(int ), (int)126);
                            continue block66;
                        }
                    }
                    break;
                }
                v7 = -var4_7.field_1352;
                v8 /* !! */  = ij.bf;
                if (true) ** GOTO lbl66
                block67: while (true) {
                    v8 /* !! */  = (long)(v9 - ij.ukj("vfq", urt(int ), (int)127));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1976799909: {
                            break block67;
                        }
                        case -1517694941: {
                            v9 = ij.ukj("vfr", urt(int ), (int)128);
                            continue block67;
                        }
                        case -1245117063: {
                            v9 = ij.ukj("vfs", urt(int ), (int)129);
                            continue block67;
                        }
                    }
                    break;
                }
                v10 = var4_7.field_1350;
                v11 /* !! */  = ij.bf;
                if (true) ** GOTO lbl80
                block68: while (true) {
                    v11 /* !! */  = (long)(ij.ukj("vfu", urt(int ), (int)131) - ij.ukj("vft", urt(int ), (int)130));
lbl80:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1976799909: {
                            break block68;
                        }
                        case 476567325: {
                            continue block68;
                        }
                    }
                    break;
                }
                v12 = Math.atan2(v7, v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = ij.bf - ij.ukj("vfv", urt(int ), (int)132)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ij.ukj("vfw", ukg(int ), (int)420)) break;
                    v13 /* !! */  = (long)ij.ukj("vfx", ukg(int ), (int)421);
                }
                var5_8 = (float)Math.toDegrees(v12);
                if (var7_6 || var7_6) ** GOTO lbl21
                v14 /* !! */  = ij.bf;
                if (true) ** GOTO lbl97
                block70: while (true) {
                    v14 /* !! */  = (long)(ij.ukj("vfz", urt(int ), (int)134) - ij.ukj("vfy", urt(int ), (int)133));
lbl97:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1976799909: {
                            break block70;
                        }
                        case 413299472: {
                            continue block70;
                        }
                    }
                    break;
                }
                v15 = var4_7.field_1351;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = ij.bf - ij.ukj("vga", urt(int ), (int)135)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ij.ukj("vgb", ukg(int ), (int)422)) break;
                    v16 /* !! */  = (long)ij.ukj("vgc", ukg(int ), (int)423);
                }
                v17 = var4_7.field_1352;
                v18 /* !! */  = ij.bf;
                if (true) ** GOTO lbl113
                block72: while (true) {
                    v18 /* !! */  = (long)(ij.ukj("vge", urt(int ), (int)137) - ij.ukj("vgd", urt(int ), (int)136));
lbl113:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1976799909: {
                            break block72;
                        }
                        case -14595474: {
                            continue block72;
                        }
                    }
                    break;
                }
                v19 = var4_7.field_1350;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ij.bf - ij.ukj("vgf", urt(int ), (int)138)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ij.ukj("vgg", ukg(int ), (int)424)) break;
                    v20 /* !! */  = (long)ij.ukj("vgh", ukg(int ), (int)425);
                }
                v21 = Math.hypot(v17, v19);
                v22 /* !! */  = ij.bf;
                if (true) ** GOTO lbl129
                block74: while (true) {
                    v22 /* !! */  = (long)(v23 - ij.ukj("vgi", urt(int ), (int)139));
lbl129:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1976799909: {
                            break block74;
                        }
                        case 1263087841: {
                            v23 = ij.ukj("vgj", urt(int ), (int)140);
                            continue block74;
                        }
                        case 1374317414: {
                            v23 = ij.ukj("vgk", urt(int ), (int)141);
                            continue block74;
                        }
                    }
                    break;
                }
                v24 = Math.atan2(v15, v21);
                v25 /* !! */  = ij.bf;
                if (true) ** GOTO lbl143
                block75: while (true) {
                    v25 /* !! */  = (long)(v26 - ij.ukj("vgl", urt(int ), (int)142));
lbl143:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1976799909: {
                            break block75;
                        }
                        case -1189425633: {
                            v26 = ij.ukj("vgm", urt(int ), (int)143);
                            continue block75;
                        }
                        case 1223648601: {
                            v26 = ij.ukj("vgn", urt(int ), (int)144);
                            continue block75;
                        }
                    }
                    break;
                }
                v27 = -Math.toDegrees(v24);
                v28 = ij.ukj("vgo", usf(int ), (int)145);
                v29 = ij.ukj("vgp", usf(int ), (int)146);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_8 = ij.bf - ij.ukj("vgq", urt(int ), (int)147)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == ij.ukj("vgr", ukg(int ), (int)426)) break;
                    v30 /* !! */  = (long)ij.ukj("vgs", ukg(int ), (int)427);
                }
                var6_9 = (float)class_3532.method_15350((double)v27, (double)v28, (double)v29);
                if (!var7_6 && !var7_6) ** break;
                ** continue;
                v31 /* !! */  = ij.bf;
                if (true) ** GOTO lbl167
                block77: while (true) {
                    v31 /* !! */  = (long)(v32 - ij.ukj("vgt", urt(int ), (int)148));
lbl167:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1976799909: {
                            break block77;
                        }
                        case -1700359934: {
                            v32 = ij.ukj("vgu", urt(int ), (int)149);
                            continue block77;
                        }
                        case -1475889545: {
                            v32 = ij.ukj("vgv", urt(int ), (int)150);
                            continue block77;
                        }
                        case -844209311: {
                            v32 = ij.ukj("vgw", urt(int ), (int)151);
                            continue block77;
                        }
                    }
                    break;
                }
                v33 /* !! */  = ij.bf;
                if (true) ** GOTO lbl183
                block78: while (true) {
                    v33 /* !! */  = (long)(ij.ukj("vgy", urt(int ), (int)153) - ij.ukj("vgx", urt(int ), (int)152));
lbl183:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1976799909: {
                            break block78;
                        }
                        case 278789284: {
                            continue block78;
                        }
                    }
                    break;
                }
                return new ov(var5_8, var6_9);
            }
lbl189:
            // 3 sources

            case 0: {
                var8_5 /* !! */  = (int)ij.ukj("vgz", ukg(int ), (int)428);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 1: {
                var8_5 /* !! */  = (int)ij.ukj("vha", ukg(int ), (int)429);
                if (!var9_4) break;
                throw null;
            }
lbl198:
            // 2 sources

            case 2: {
                var8_5 /* !! */  = (int)ij.ukj("vhb", ukg(int ), (int)430);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 3: {
                var8_5 /* !! */  = (int)ij.ukj("vhc", ukg(int ), (int)431);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 4: {
                var8_5 /* !! */  = (int)ij.ukj("vhd", ukg(int ), (int)432);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl213:
            // 3 sources

            case 5: {
                var8_5 /* !! */  = (int)ij.ukj("vhe", ukg(int ), (int)433);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 6: {
                var8_5 /* !! */  = (int)ij.ukj("vhf", ukg(int ), (int)434);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl223:
            // 2 sources

            case 7: {
                var8_5 /* !! */  = (int)ij.ukj("vhg", ukg(int ), (int)435);
                if (!var9_4) ** GOTO lbl198
                throw null;
            }
lbl227:
            // 2 sources

            case 8: {
                var8_5 /* !! */  = (int)ij.ukj("vhh", ukg(int ), (int)436);
                if (!var9_4) ** GOTO lbl189
                throw null;
            }
lbl231:
            // 3 sources

            case 9: {
                var8_5 /* !! */  = (int)ij.ukj("vhi", ukg(int ), (int)437);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 10: {
                var8_5 /* !! */  = (int)ij.ukj("vhj", ukg(int ), (int)438);
                if (!var9_4) ** GOTO lbl227
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)ij.ukj("vhk", ukg(int ), (int)439);
                    if (!var9_4) ** GOTO lbl189
                    throw null;
                }
            }
lbl245:
            // 4 sources

            case 12: {
                var8_5 /* !! */  = (int)ij.ukj("vhl", ukg(int ), (int)440);
                if (!var9_4) ** GOTO lbl213
                throw null;
            }
lbl249:
            // 2 sources

            case 13: {
                var8_5 /* !! */  = (int)ij.ukj("vhm", ukg(int ), (int)441);
                if (!var9_4) ** GOTO lbl213
                throw null;
            }
            case 14: 
        }
        var8_5 /* !! */  = (int)ij.ukj("vhn", ukg(int ), (int)442);
        ** while (!var9_4)
lbl256:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float hitRadius(class_1297 var1_1) {
        v0 /* !! */  = ij.bf;
        if (true) ** GOTO lbl5
        block78: while (true) {
            v0 /* !! */  = (long)(ij.ukj("urx", urt(int ), (int)1) - ij.ukj("urw", urt(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1976799909: {
                    break block78;
                }
                case -1644873450: {
                    continue block78;
                }
            }
            break;
        }
        var8_2 = ij.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ij.bf - ij.ukj("ury", urt(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ij.ukj("urz", ukg(int ), (int)190)) break;
            v1 /* !! */  = (long)ij.ukj("usa", ukg(int ), (int)191);
        }
        var7_3 /* !! */  = ij.b;
        v2 /* !! */  = ij.bf;
        if (true) ** GOTO lbl22
        block80: while (true) {
            v2 /* !! */  = (long)(v3 - ij.ukj("usb", urt(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1976799909: {
                    break block80;
                }
                case -370349930: {
                    v3 = ij.ukj("usc", urt(int ), (int)4);
                    continue block80;
                }
                case 1272555601: {
                    v3 = ij.ukj("usd", urt(int ), (int)5);
                    continue block80;
                }
            }
            break;
        }
        var6_4 = ij.a;
        if (var8_2) {
            throw null;
lbl34:
            // 4 sources

            return (float)ij.ukj("use", umt(int ), (int)192);
        }
        if (var6_4 || var6_4) ** GOTO lbl34
        v4 = ij.ukj("usg", usf(int ), (int)6);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ij.bf - ij.ukj("ush", urt(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ij.ukj("usi", ukg(int ), (int)193)) break;
            v5 /* !! */  = (long)ij.ukj("usj", ukg(int ), (int)194);
        }
        v6 /* !! */  = ij.bf;
        if (true) ** GOTO lbl48
        block83: while (true) {
            v6 /* !! */  = (long)(v7 - ij.ukj("usk", urt(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1976799909: {
                    break block83;
                }
                case -1767782147: {
                    v7 = ij.ukj("usl", urt(int ), (int)9);
                    continue block83;
                }
                case 335239283: {
                    v7 = ij.ukj("usm", urt(int ), (int)10);
                    continue block83;
                }
            }
            break;
        }
        v8 = ij.mc.field_1724;
        v9 /* !! */  = ij.bf;
        if (true) ** GOTO lbl62
        block84: while (true) {
            v9 /* !! */  = (long)(v10 - ij.ukj("usn", urt(int ), (int)11));
lbl62:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1976799909: {
                    break block84;
                }
                case -1359841791: {
                    v10 = ij.ukj("uso", urt(int ), (int)12);
                    continue block84;
                }
                case 238124132: {
                    v10 = ij.ukj("usp", urt(int ), (int)13);
                    continue block84;
                }
            }
            break;
        }
        v11 = v8.method_33571();
        v12 /* !! */  = ij.bf;
        if (true) ** GOTO lbl76
        block85: while (true) {
            v12 /* !! */  = (long)(v13 - ij.ukj("usq", urt(int ), (int)14));
lbl76:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1976799909: {
                    break block85;
                }
                case -1825044104: {
                    v13 = ij.ukj("usr", urt(int ), (int)15);
                    continue block85;
                }
                case 1063333788: {
                    v13 = ij.ukj("uss", urt(int ), (int)16);
                    continue block85;
                }
            }
            break;
        }
        v14 = var1_1.method_5829();
        v15 /* !! */  = ij.bf;
        if (true) ** GOTO lbl90
        block86: while (true) {
            v15 /* !! */  = (long)(v16 - ij.ukj("ust", urt(int ), (int)17));
lbl90:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1976799909: {
                    break block86;
                }
                case -1232547818: {
                    v16 = ij.ukj("usu", urt(int ), (int)18);
                    continue block86;
                }
                case -955079511: {
                    v16 = ij.ukj("usv", urt(int ), (int)19);
                    continue block86;
                }
                case 135540555: {
                    v16 = ij.ukj("usw", urt(int ), (int)20);
                    continue block86;
                }
            }
            break;
        }
        v17 = v14.method_1005();
        v18 /* !! */  = ij.bf;
        if (true) ** GOTO lbl107
        block87: while (true) {
            v18 /* !! */  = (long)(v19 - ij.ukj("usx", urt(int ), (int)21));
lbl107:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1976799909: {
                    break block87;
                }
                case -1523470254: {
                    v19 = ij.ukj("usy", urt(int ), (int)22);
                    continue block87;
                }
                case -988733905: {
                    v19 = ij.ukj("usz", urt(int ), (int)23);
                    continue block87;
                }
            }
            break;
        }
        v20 = v11.method_1022(v17);
        v21 /* !! */  = ij.bf;
        if (true) ** GOTO lbl121
        block88: while (true) {
            v21 /* !! */  = (long)(v22 - ij.ukj("uta", urt(int ), (int)24));
lbl121:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1976799909: {
                    break block88;
                }
                case -1656373093: {
                    v22 = ij.ukj("utb", urt(int ), (int)25);
                    continue block88;
                }
                case 517137052: {
                    v22 = ij.ukj("utc", urt(int ), (int)26);
                    continue block88;
                }
                case 2129824614: {
                    v22 = ij.ukj("utd", urt(int ), (int)27);
                    continue block88;
                }
            }
            break;
        }
        var2_5 = Math.max((double)v4, v20);
        if (var6_4 || var6_4) ** GOTO lbl34
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_2 = ij.bf - ij.ukj("ute", urt(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v23 /* !! */  == ij.ukj("utf", ukg(int ), (int)195)) break;
            v23 /* !! */  = (long)ij.ukj("utg", ukg(int ), (int)196);
        }
        v24 = (double)var1_1.method_17681() * ij.ukj("uth", usf(int ), (int)29) / var2_5;
        v25 /* !! */  = ij.bf;
        if (true) ** GOTO lbl146
        block90: while (true) {
            v25 /* !! */  = (long)(v26 - ij.ukj("uti", urt(int ), (int)30));
lbl146:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1976799909: {
                    break block90;
                }
                case -1410203106: {
                    v26 = ij.ukj("utj", urt(int ), (int)31);
                    continue block90;
                }
                case -1254699188: {
                    v26 = ij.ukj("utk", urt(int ), (int)32);
                    continue block90;
                }
            }
            break;
        }
        v27 = Math.atan(v24);
        v28 /* !! */  = ij.bf;
        if (true) ** GOTO lbl160
        block91: while (true) {
            v28 /* !! */  = (long)(v29 - ij.ukj("utl", urt(int ), (int)33));
lbl160:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1976799909: {
                    break block91;
                }
                case -1352406201: {
                    v29 = ij.ukj("utm", urt(int ), (int)34);
                    continue block91;
                }
                case 277178519: {
                    v29 = ij.ukj("utn", urt(int ), (int)35);
                    continue block91;
                }
                case 1402700198: {
                    v29 = ij.ukj("uto", urt(int ), (int)36);
                    continue block91;
                }
            }
            break;
        }
        var4_6 = (float)Math.toDegrees(v27);
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl34
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_3 = ij.bf - ij.ukj("utp", urt(int ), (int)37)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v30 /* !! */  == ij.ukj("utq", ukg(int ), (int)197)) break;
                    v30 /* !! */  = (long)ij.ukj("utr", ukg(int ), (int)198);
                }
                v31 = (double)var1_1.method_17682() * ij.ukj("uts", usf(int ), (int)38) / var2_5;
                v32 /* !! */  = ij.bf;
                if (true) ** GOTO lbl188
                block93: while (true) {
                    v32 /* !! */  = (long)(v33 - ij.ukj("utt", urt(int ), (int)39));
lbl188:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -2085151306: {
                            v33 = ij.ukj("utu", urt(int ), (int)40);
                            continue block93;
                        }
                        case -1976799909: {
                            break block93;
                        }
                        case 306966890: {
                            v33 = ij.ukj("utv", urt(int ), (int)41);
                            continue block93;
                        }
                    }
                    break;
                }
                v34 = Math.atan(v31);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_4 = ij.bf - ij.ukj("utw", urt(int ), (int)42)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v35 /* !! */  == ij.ukj("utx", ukg(int ), (int)199)) break;
                    v35 /* !! */  = (long)ij.ukj("uty", ukg(int ), (int)200);
                }
                var5_7 = (float)Math.toDegrees(v34);
                if (var6_4 || var6_4) ** continue;
                v36 /* !! */  = ij.bf;
                if (true) ** GOTO lbl210
                block95: while (true) {
                    v36 /* !! */  = (long)(v37 - ij.ukj("utz", urt(int ), (int)43));
lbl210:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1976799909: {
                            break block95;
                        }
                        case 365238244: {
                            v37 = ij.ukj("uua", urt(int ), (int)44);
                            continue block95;
                        }
                        case 1760910700: {
                            v37 = ij.ukj("uub", urt(int ), (int)45);
                            continue block95;
                        }
                    }
                    break;
                }
                v38 = Math.min(var4_6, var5_7) * ij.ukj("uuc", umt(int ), (int)201);
                v39 = ij.ukj("uud", umt(int ), (int)202);
                v40 = ij.ukj("uue", umt(int ), (int)203);
                v41 /* !! */  = ij.bf;
                if (true) ** GOTO lbl226
                block96: while (true) {
                    v41 /* !! */  = (long)(ij.ukj("uug", urt(int ), (int)47) - ij.ukj("uuf", urt(int ), (int)46));
lbl226:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1976799909: {
                            break block96;
                        }
                        case 1746962585: {
                            continue block96;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)v38, (float)v39, (float)v40);
            }
lbl232:
            // 2 sources

            case 0: {
                do {
                    var7_3 /* !! */  = (int)ij.ukj("uuh", ukg(int ), (int)204);
                } while (!var8_2);
                throw null;
            }
lbl237:
            // 4 sources

            case 1: {
                var7_3 /* !! */  = (int)ij.ukj("uui", ukg(int ), (int)205);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 2: {
                var7_3 /* !! */  = (int)ij.ukj("uuj", ukg(int ), (int)206);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 3: {
                var7_3 /* !! */  = (int)ij.ukj("uuk", ukg(int ), (int)207);
                if (!var8_2) ** GOTO lbl237
                throw null;
            }
lbl251:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ij.ukj("uul", ukg(int ), (int)208);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 5: {
                var7_3 /* !! */  = (int)ij.ukj("uum", ukg(int ), (int)209);
                if (!var8_2) ** GOTO lbl251
                throw null;
            }
lbl260:
            // 3 sources

            case 6: {
                var7_3 /* !! */  = (int)ij.ukj("uun", ukg(int ), (int)210);
                if (!var8_2) ** GOTO lbl237
                throw null;
            }
lbl264:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ij.ukj("uuo", ukg(int ), (int)211);
                    if (!var8_2) ** GOTO lbl237
                    throw null;
                }
            }
            case 8: {
                var7_3 /* !! */  = (int)ij.ukj("uup", ukg(int ), (int)212);
                if (!var8_2) ** GOTO lbl232
                throw null;
            }
            case 9: 
        }
        var7_3 /* !! */  = (int)ij.ukj("uuq", ukg(int ), (int)213);
        ** while (!var8_2)
lbl276:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vmx() {
        ij.ukh[100] = 2102017601;
        ij.ukh[101] = 1829953689;
        ij.ukh[102] = 903655783;
        ij.ukh[103] = -103590834;
        ij.ukh[104] = 944329967;
        ij.ukh[105] = 1495571143;
        ij.ukh[106] = -166887231;
        ij.ukh[107] = -1385142316;
        ij.ukh[108] = 694374579;
        ij.ukh[109] = -356855116;
        ij.ukh[110] = -316736714;
        ij.ukh[111] = -1315576142;
        ij.ukh[112] = 1684724864;
        ij.ukh[113] = 357446829;
        ij.ukh[114] = -501929845;
        ij.ukh[115] = -2120316520;
        ij.ukh[116] = -726001584;
        ij.ukh[117] = 1814642839;
        ij.ukh[118] = 510095980;
        ij.ukh[119] = -1967954038;
        ij.ukh[120] = -1242250963;
        ij.ukh[121] = 591013803;
        ij.ukh[122] = 1220472354;
        ij.ukh[123] = 1677369268;
        ij.ukh[124] = 1952532680;
        ij.ukh[125] = -399140947;
        ij.ukh[126] = -102048714;
        ij.ukh[127] = 1634038195;
        ij.ukh[128] = 598835212;
        ij.ukh[129] = 1503678208;
        ij.ukh[130] = 961454821;
        ij.ukh[131] = -438714379;
        ij.ukh[132] = 1031386710;
        ij.ukh[133] = 1147046453;
        ij.ukh[134] = -2005087007;
        ij.ukh[135] = -725735292;
        ij.ukh[136] = -216042562;
        ij.ukh[137] = -758801931;
        ij.ukh[138] = -286865041;
        ij.ukh[139] = 531576131;
        ij.ukh[140] = -269012822;
        ij.ukh[141] = -1692581819;
        ij.ukh[142] = 918647755;
        ij.ukh[143] = -828946615;
        ij.ukh[144] = 1910157876;
        ij.ukh[145] = -196894677;
        ij.ukh[146] = 800762798;
        ij.ukh[147] = 499792947;
        ij.ukh[148] = -2030573289;
        ij.ukh[149] = 788518100;
        ij.ukh[150] = -1021544461;
        ij.ukh[151] = -1302264964;
        ij.ukh[152] = -1858961537;
        ij.ukh[153] = -1714862065;
        ij.ukh[154] = 499860025;
        ij.ukh[155] = 1923910133;
        ij.ukh[156] = -1713344953;
        ij.ukh[157] = -1139727370;
        ij.ukh[158] = -474029205;
        ij.ukh[159] = -498155130;
        ij.ukh[160] = -981971743;
        ij.ukh[161] = 280316037;
        ij.ukh[162] = 780639917;
        ij.ukh[163] = -2081445481;
        ij.ukh[164] = 1680748735;
        ij.ukh[165] = 49539577;
        ij.ukh[166] = 871768640;
        ij.ukh[167] = 452957708;
        ij.ukh[168] = 2004240916;
        ij.ukh[169] = -1794107610;
        ij.ukh[170] = 1548665106;
        ij.ukh[171] = -1119935154;
        ij.ukh[172] = -797794714;
        ij.ukh[173] = 807875026;
        ij.ukh[174] = 383650955;
        ij.ukh[175] = 1311807482;
        ij.ukh[176] = -141851346;
        ij.ukh[177] = -1428072670;
        ij.ukh[178] = 1044798486;
        ij.ukh[179] = 1032683906;
        ij.ukh[180] = 1487456805;
        ij.ukh[181] = 529142712;
        ij.ukh[182] = -531102717;
        ij.ukh[183] = -2048457908;
        ij.ukh[184] = 1317772104;
        ij.ukh[185] = 1637397339;
        ij.ukh[186] = -1497955780;
        ij.ukh[187] = 1681000172;
        ij.ukh[188] = -1057512461;
        ij.ukh[189] = 1006420741;
        ij.ukh[190] = -934461860;
        ij.ukh[191] = -331265477;
        ij.ukh[192] = -715009565;
        ij.ukh[193] = -1255826192;
        ij.ukh[194] = -1412747412;
        ij.ukh[195] = 662307031;
        ij.ukh[196] = -128463901;
        ij.ukh[197] = -1347470105;
        ij.ukh[198] = 1188690796;
        ij.ukh[199] = 1533151918;
    }

    private static /* synthetic */ double usf(int n2) {
        return Double.longBitsToDouble(uru[n2] ^ urv[n2]);
    }

    private static /* synthetic */ void vqk() {
        ij.uru[100] = -4428563092515449970L;
        ij.uru[101] = 2620018583793804297L;
        ij.uru[102] = 1582699658901578627L;
        ij.uru[103] = -9173076398983764824L;
        ij.uru[104] = -5853065474084520200L;
        ij.uru[105] = -2433544055774262733L;
        ij.uru[106] = -3921565741032404423L;
        ij.uru[107] = -145804657760047584L;
        ij.uru[108] = 6653345772009878248L;
        ij.uru[109] = -2346148430356125973L;
        ij.uru[110] = 8580919586577961322L;
        ij.uru[111] = -3151575658602530512L;
        ij.uru[112] = -2900828917315059478L;
        ij.uru[113] = 6288090948178729578L;
        ij.uru[114] = 926156966302507837L;
        ij.uru[115] = 4739706820393526640L;
        ij.uru[116] = -9170493606871274580L;
        ij.uru[117] = 6934398373606794911L;
        ij.uru[118] = -3604307051952947758L;
        ij.uru[119] = -4153489306486457688L;
        ij.uru[120] = -2844182497098591284L;
        ij.uru[121] = 7864371737052964572L;
        ij.uru[122] = 7128171226858896261L;
        ij.uru[123] = -3672939079507630311L;
        ij.uru[124] = -5752465539487070083L;
        ij.uru[125] = 635778248626090883L;
        ij.uru[126] = 2595571186494374678L;
        ij.uru[127] = 4947015808033908460L;
        ij.uru[128] = -5626459224827830451L;
        ij.uru[129] = -4883309441638327433L;
        ij.uru[130] = -6818393655201032855L;
        ij.uru[131] = -7482601910991489552L;
        ij.uru[132] = 5584684582724126779L;
        ij.uru[133] = -8325325470213681815L;
        ij.uru[134] = -1945606318703453193L;
        ij.uru[135] = 4323185429059317553L;
        ij.uru[136] = 277113365792839422L;
        ij.uru[137] = -2908082876712990446L;
        ij.uru[138] = 3257167575264359239L;
        ij.uru[139] = 3234802315399385245L;
        ij.uru[140] = -3556585434062298821L;
        ij.uru[141] = -7328628278157137604L;
        ij.uru[142] = -3075839518914576787L;
        ij.uru[143] = 4093399127385331860L;
        ij.uru[144] = 8149239887128471941L;
        ij.uru[145] = 4639287350555737879L;
        ij.uru[146] = 2845248816116046310L;
        ij.uru[147] = 1020744073868788350L;
        ij.uru[148] = -4597274016245920636L;
        ij.uru[149] = 2889416992886139547L;
        ij.uru[150] = 431295879935934533L;
        ij.uru[151] = 8875548148425629959L;
        ij.uru[152] = -1319063638704755470L;
        ij.uru[153] = 7578236966273255726L;
        ij.uru[154] = -9128111544284190800L;
        ij.uru[155] = 7654917188611125889L;
        ij.uru[156] = 8540003244260913383L;
        ij.uru[157] = 1632529668440194952L;
        ij.uru[158] = -272556497392583064L;
        ij.uru[159] = -2054475667598224523L;
        ij.uru[160] = -2728862555485143100L;
        ij.uru[161] = -5259419611281546254L;
        ij.uru[162] = -6907149870044331847L;
        ij.uru[163] = -6245134613128512318L;
        ij.uru[164] = -6472932925804901437L;
        ij.uru[165] = -8996600324310995148L;
        ij.uru[166] = -5412808443122595333L;
        ij.uru[167] = -2465286044941386796L;
        ij.uru[168] = 6339771403729823171L;
        ij.uru[169] = 1832859828331538064L;
        ij.uru[170] = -5773205147322814814L;
        ij.uru[171] = -7751714059400961900L;
        ij.uru[172] = 1061163588498868656L;
        ij.uru[173] = -4105643081161829220L;
        ij.uru[174] = -3714595058362279124L;
        ij.uru[175] = 2462111290861915471L;
        ij.uru[176] = -4622992404667050525L;
        ij.uru[177] = 6140833007463685788L;
        ij.uru[178] = -2627939719948468774L;
        ij.uru[179] = 5859239257766762558L;
        ij.uru[180] = -7029352203446214222L;
        ij.uru[181] = 7122908460110975134L;
        ij.uru[182] = 1074786012407051542L;
        ij.uru[183] = -8714255492419131558L;
        ij.uru[184] = 3941315202912735395L;
        ij.uru[185] = -899102318339425832L;
        ij.uru[186] = -3497676858965476162L;
        ij.uru[187] = 4688724469257224722L;
        ij.uru[188] = 1686133776688393735L;
        ij.uru[189] = 7666075335461182968L;
        ij.uru[190] = -6567090504402010813L;
    }

    private static /* synthetic */ void vqa() {
        ij.uru[0] = -7967023209661713012L;
        ij.uru[1] = 4688819277181595881L;
        ij.uru[2] = -89928389839328311L;
        ij.uru[3] = -7871191027554782192L;
        ij.uru[4] = -6208272334138903443L;
        ij.uru[5] = 832796942979889335L;
        ij.uru[6] = -591262529507937686L;
        ij.uru[7] = 5475723379510212680L;
        ij.uru[8] = -7607631251409097377L;
        ij.uru[9] = 5964938526471684687L;
        ij.uru[10] = 8610383601513441938L;
        ij.uru[11] = 2994957210305220438L;
        ij.uru[12] = -6482227899077775183L;
        ij.uru[13] = -2770274273235131625L;
        ij.uru[14] = 2400975950887020284L;
        ij.uru[15] = -1371243188851017061L;
        ij.uru[16] = -7397304983881028046L;
        ij.uru[17] = 4507764207770922001L;
        ij.uru[18] = -5111668598955084280L;
        ij.uru[19] = -3142392739005439260L;
        ij.uru[20] = -543975785110064284L;
        ij.uru[21] = -8613352845708301180L;
        ij.uru[22] = 7574872652323646457L;
        ij.uru[23] = 3521766127312137860L;
        ij.uru[24] = -978551116999107298L;
        ij.uru[25] = -3007009163667773685L;
        ij.uru[26] = 4351558583860390582L;
        ij.uru[27] = 1332496066594584733L;
        ij.uru[28] = 6919400678842964920L;
        ij.uru[29] = 8252409234371549173L;
        ij.uru[30] = 1060866850769748190L;
        ij.uru[31] = -5190839294651543113L;
        ij.uru[32] = 6053062546808433844L;
        ij.uru[33] = 3750864170920148009L;
        ij.uru[34] = -2258985558918863707L;
        ij.uru[35] = 4434884632508218729L;
        ij.uru[36] = -5227214110363255068L;
        ij.uru[37] = 8592952180160496969L;
        ij.uru[38] = -6035226794221806308L;
        ij.uru[39] = -4009913759581630351L;
        ij.uru[40] = -8121245165364037702L;
        ij.uru[41] = 125430508825241007L;
        ij.uru[42] = 9147072279650006658L;
        ij.uru[43] = -1067012018903250039L;
        ij.uru[44] = 7522738363456766331L;
        ij.uru[45] = 1618869685532155243L;
        ij.uru[46] = -3420671269298804803L;
        ij.uru[47] = 4096010853137063879L;
        ij.uru[48] = -6633128046255410477L;
        ij.uru[49] = 102162229201337687L;
        ij.uru[50] = 8904756241758665055L;
        ij.uru[51] = -5859552498213610365L;
        ij.uru[52] = -2852150368450959786L;
        ij.uru[53] = 8911241011844666304L;
        ij.uru[54] = -2565798291202918331L;
        ij.uru[55] = -8990734444481047644L;
        ij.uru[56] = -4274921672156577746L;
        ij.uru[57] = 3761253046352899159L;
        ij.uru[58] = 5091063975605143829L;
        ij.uru[59] = 8681203434823037726L;
        ij.uru[60] = -8620913348153877228L;
        ij.uru[61] = -7976672041180840476L;
        ij.uru[62] = -4782131574573614649L;
        ij.uru[63] = 580078136075507375L;
        ij.uru[64] = 5495811272482866073L;
        ij.uru[65] = -6845713179910443195L;
        ij.uru[66] = 209262059820994025L;
        ij.uru[67] = 5232537015391994302L;
        ij.uru[68] = 9144523189594419971L;
        ij.uru[69] = -6041463758887988251L;
        ij.uru[70] = 6255955699807480164L;
        ij.uru[71] = -4704144534572389882L;
        ij.uru[72] = -5992004638052795603L;
        ij.uru[73] = -4146238010899098712L;
        ij.uru[74] = -3960990651661164928L;
        ij.uru[75] = -4625005485197019134L;
        ij.uru[76] = 1629072750395484870L;
        ij.uru[77] = -7608058692713515919L;
        ij.uru[78] = -2496127641535844102L;
        ij.uru[79] = 2535029045959348405L;
        ij.uru[80] = 3011930235516993196L;
        ij.uru[81] = 6512218524039883286L;
        ij.uru[82] = 7122294000490459854L;
        ij.uru[83] = 5331002447086767798L;
        ij.uru[84] = -673236373644577958L;
        ij.uru[85] = 5971926330878275068L;
        ij.uru[86] = 7704630207462572925L;
        ij.uru[87] = -7830028937885791308L;
        ij.uru[88] = 1554698314351200935L;
        ij.uru[89] = 2112839997768330126L;
        ij.uru[90] = 7861373496775696902L;
        ij.uru[91] = -6923612469039473598L;
        ij.uru[92] = 5224049283559118921L;
        ij.uru[93] = -9145576872404570314L;
        ij.uru[94] = 7943256834482098273L;
        ij.uru[95] = 2000775694307933034L;
        ij.uru[96] = 3245475802780743611L;
        ij.uru[97] = 560230647247198341L;
        ij.uru[98] = 4896422581502555336L;
        ij.uru[99] = 5395996982922261883L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isAttackReady() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ij.bf - ij.ukj("vcr", urt(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ij.ukj("vcs", ukg(int ), (int)373)) break;
            v0 /* !! */  = (long)ij.ukj("vct", ukg(int ), (int)374);
        }
        var4_1 = ij.c;
        v1 /* !! */  = ij.bf;
        if (true) ** GOTO lbl11
        block40: while (true) {
            v1 /* !! */  = (long)(v2 - ij.ukj("vcu", urt(int ), (int)98));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1976799909: {
                    break block40;
                }
                case -937271251: {
                    v2 = ij.ukj("vcv", urt(int ), (int)99);
                    continue block40;
                }
                case 1754828067: {
                    v2 = ij.ukj("vcw", urt(int ), (int)100);
                    continue block40;
                }
            }
            break;
        }
        var3_2 /* !! */  = ij.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ij.bf - ij.ukj("vcx", urt(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ij.ukj("vcy", ukg(int ), (int)375)) break;
            v3 /* !! */  = (long)ij.ukj("vcz", ukg(int ), (int)376);
        }
        var2_3 = ij.a;
        if (var4_1) {
            throw null;
lbl29:
            // 8 sources

            return (boolean)ij.ukj("vda", ukg(int ), (int)377);
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ij.bf - ij.ukj("vdb", urt(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ij.ukj("vdc", ukg(int ), (int)378)) break;
            v4 /* !! */  = (long)ij.ukj("vdd", ukg(int ), (int)379);
        }
        var1_4 = hn.getInstance();
        if (var2_3 || var2_3) ** GOTO lbl29
        if (var1_4 == null) ** GOTO lbl79
        if (var2_3) ** GOTO lbl29
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ij.bf - ij.ukj("vde", urt(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ij.ukj("vdf", ukg(int ), (int)380)) break;
            v5 /* !! */  = (long)ij.ukj("vdg", ukg(int ), (int)381);
        }
        if (var1_4.getTarget() == null) ** GOTO lbl79
        if (var2_3) ** GOTO lbl29
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ij.bf - ij.ukj("vdh", urt(int ), (int)104)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ij.ukj("vdi", ukg(int ), (int)382)) break;
                    v6 /* !! */  = (long)ij.ukj("vdj", ukg(int ), (int)383);
                }
                if (d.getInstance() == null) ** GOTO lbl79
                if (var2_3 || var2_3) ** GOTO lbl29
                v7 /* !! */  = ij.bf;
                if (true) ** GOTO lbl62
                block46: while (true) {
                    v7 /* !! */  = (long)(ij.ukj("vdl", urt(int ), (int)106) - ij.ukj("vdk", urt(int ), (int)105));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1976799909: {
                            break block46;
                        }
                        case -1665462350: {
                            continue block46;
                        }
                    }
                    break;
                }
                v8 = d.getInstance();
                v9 /* !! */  = ij.bf;
                if (true) ** GOTO lbl72
                block47: while (true) {
                    v9 /* !! */  = (long)(ij.ukj("vdn", urt(int ), (int)108) - ij.ukj("vdm", urt(int ), (int)107));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2023177378: {
                            continue block47;
                        }
                        case -1976799909: {
                            break block47;
                        }
                    }
                    break;
                }
                if (v8.getManager() != null) ** GOTO lbl81
                if (var2_3) ** GOTO lbl29
lbl79:
                // 4 sources

                if (var2_3 || var2_3) ** GOTO lbl29
                return (boolean)ij.ukj("vdo", ukg(int ), (int)384);
lbl81:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ij.bf - ij.ukj("vdp", urt(int ), (int)109)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ij.ukj("vdq", ukg(int ), (int)385)) break;
                    v10 /* !! */  = (long)ij.ukj("vdr", ukg(int ), (int)386);
                }
                v11 = d.getInstance();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = ij.bf - ij.ukj("vds", urt(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ij.ukj("vdt", ukg(int ), (int)387)) break;
                    v12 /* !! */  = (long)ij.ukj("vdu", ukg(int ), (int)388);
                }
                v13 = v11.getManager();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_7 = ij.bf - ij.ukj("vdv", urt(int ), (int)111)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ij.ukj("vdw", ukg(int ), (int)389)) break;
                    v14 /* !! */  = (long)ij.ukj("vdx", ukg(int ), (int)390);
                }
                v15 = v13.getAttackPerpetrator();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_8 = ij.bf - ij.ukj("vdy", urt(int ), (int)112)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ij.ukj("vdz", ukg(int ), (int)391)) break;
                    v16 /* !! */  = (long)ij.ukj("vea", ukg(int ), (int)392);
                }
                v17 = v15.getAttackHandler();
                v18 /* !! */  = ij.bf;
                if (true) ** GOTO lbl111
                block52: while (true) {
                    v18 /* !! */  = (long)(ij.ukj("vec", urt(int ), (int)114) - ij.ukj("veb", urt(int ), (int)113));
lbl111:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1976799909: {
                            break block52;
                        }
                        case -52071793: {
                            continue block52;
                        }
                    }
                    break;
                }
                v19 = var1_4.getConfig();
                v20 = ij.ukj("ved", ukg(int ), (int)393);
                v21 /* !! */  = ij.bf;
                if (true) ** GOTO lbl122
                block53: while (true) {
                    v21 /* !! */  = (long)(ij.ukj("vef", urt(int ), (int)116) - ij.ukj("vee", urt(int ), (int)115));
lbl122:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1976799909: {
                            break block53;
                        }
                        case -1600348035: {
                            continue block53;
                        }
                    }
                    break;
                }
                return v17.canAttack(v19, (int)v20);
            }
            case 0: {
                var3_2 /* !! */  = (int)ij.ukj("veg", ukg(int ), (int)394);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 1: {
                var3_2 /* !! */  = (int)ij.ukj("veh", ukg(int ), (int)395);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl138:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)ij.ukj("vei", ukg(int ), (int)396);
                if (var4_1) {
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)ij.ukj("vej", ukg(int ), (int)397);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 4: {
                var3_2 /* !! */  = (int)ij.ukj("vek", ukg(int ), (int)398);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 5: {
                var3_2 /* !! */  = (int)ij.ukj("vel", ukg(int ), (int)399);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl157:
            // 3 sources

            case 6: {
                var3_2 /* !! */  = (int)ij.ukj("vem", ukg(int ), (int)400);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl162:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)ij.ukj("ven", ukg(int ), (int)401);
                if (!var4_1) ** GOTO lbl138
                throw null;
            }
lbl166:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)ij.ukj("veo", ukg(int ), (int)402);
                if (var4_1) {
                    throw null;
                }
            }
            case 9: {
                var3_2 /* !! */  = (int)ij.ukj("vep", ukg(int ), (int)403);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
lbl174:
            // 5 sources

            case 10: {
                var3_2 /* !! */  = (int)ij.ukj("veq", ukg(int ), (int)404);
                if (!var4_1) ** GOTO lbl166
                throw null;
            }
            case 11: {
                var3_2 /* !! */  = (int)ij.ukj("ver", ukg(int ), (int)405);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ij.ukj("ves", ukg(int ), (int)406);
                    if (!var4_1) ** GOTO lbl174
                    throw null;
                }
            }
            case 13: {
                var3_2 /* !! */  = (int)ij.ukj("vet", ukg(int ), (int)407);
                if (var4_1) {
                    throw null;
                }
            }
lbl191:
            // 4 sources

            case 14: {
                var3_2 /* !! */  = (int)ij.ukj("veu", ukg(int ), (int)408);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
            case 15: 
        }
        var3_2 /* !! */  = (int)ij.ukj("vev", ukg(int ), (int)409);
        ** while (!var4_1)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vnp() {
        ij.ukh[300] = 789327876;
        ij.ukh[301] = 863275529;
        ij.ukh[302] = -482677961;
        ij.ukh[303] = 1729148242;
        ij.ukh[304] = -1921921317;
        ij.ukh[305] = -1344599948;
        ij.ukh[306] = -485591701;
        ij.ukh[307] = 675996299;
        ij.ukh[308] = -1444880471;
        ij.ukh[309] = -2016050135;
        ij.ukh[310] = 726597142;
        ij.ukh[311] = 685023152;
        ij.ukh[312] = 1002120933;
        ij.ukh[313] = 1726965980;
        ij.ukh[314] = 2077354467;
        ij.ukh[315] = 367083267;
        ij.ukh[316] = 1608916982;
        ij.ukh[317] = 1400209538;
        ij.ukh[318] = 1153303675;
        ij.ukh[319] = -974180549;
        ij.ukh[320] = -728477033;
        ij.ukh[321] = -1416368220;
        ij.ukh[322] = 1927920186;
        ij.ukh[323] = 558669389;
        ij.ukh[324] = -1080481468;
        ij.ukh[325] = 1235633929;
        ij.ukh[326] = -1878365510;
        ij.ukh[327] = 1262079315;
        ij.ukh[328] = -662239545;
        ij.ukh[329] = 1241000323;
        ij.ukh[330] = 1334064521;
        ij.ukh[331] = 533635086;
        ij.ukh[332] = -1114658717;
        ij.ukh[333] = -1389875041;
        ij.ukh[334] = 1404826152;
        ij.ukh[335] = -1089583302;
        ij.ukh[336] = 1662719326;
        ij.ukh[337] = 658902064;
        ij.ukh[338] = -1581046700;
        ij.ukh[339] = 2028801909;
        ij.ukh[340] = -494298964;
        ij.ukh[341] = -1612707447;
        ij.ukh[342] = -464510656;
        ij.ukh[343] = -575033189;
        ij.ukh[344] = 551130595;
        ij.ukh[345] = 2042855145;
        ij.ukh[346] = -1183661545;
        ij.ukh[347] = 1805430543;
        ij.ukh[348] = -1842204208;
        ij.ukh[349] = -1653161047;
        ij.ukh[350] = -493337423;
        ij.ukh[351] = -1846174426;
        ij.ukh[352] = -1075832890;
        ij.ukh[353] = 1588246037;
        ij.ukh[354] = 1115113374;
        ij.ukh[355] = -410559498;
        ij.ukh[356] = -1419648156;
        ij.ukh[357] = -968034110;
        ij.ukh[358] = 984022561;
        ij.ukh[359] = 635544950;
        ij.ukh[360] = -151656711;
        ij.ukh[361] = 532897425;
        ij.ukh[362] = -1322057305;
        ij.ukh[363] = 75987137;
        ij.ukh[364] = 720593601;
        ij.ukh[365] = 594296411;
        ij.ukh[366] = -273717567;
        ij.ukh[367] = 2117549408;
        ij.ukh[368] = 190144692;
        ij.ukh[369] = -234449336;
        ij.ukh[370] = -1352206060;
        ij.ukh[371] = -1951224560;
        ij.ukh[372] = -897726891;
        ij.ukh[373] = 1857150076;
        ij.ukh[374] = -649077973;
        ij.ukh[375] = -144438021;
        ij.ukh[376] = 947543232;
        ij.ukh[377] = -2109408156;
        ij.ukh[378] = 1773530348;
        ij.ukh[379] = 1672022937;
        ij.ukh[380] = 675894130;
        ij.ukh[381] = 1522196447;
        ij.ukh[382] = -1472043062;
        ij.ukh[383] = 1068007600;
        ij.ukh[384] = -201986465;
        ij.ukh[385] = 1675185288;
        ij.ukh[386] = -753988977;
        ij.ukh[387] = 1168167057;
        ij.ukh[388] = -2031313989;
        ij.ukh[389] = 1970441836;
        ij.ukh[390] = 969366031;
        ij.ukh[391] = -632851439;
        ij.ukh[392] = 2076938544;
        ij.ukh[393] = -1648687759;
        ij.ukh[394] = -491662298;
        ij.ukh[395] = -1411714816;
        ij.ukh[396] = 1187035761;
        ij.ukh[397] = -1533949225;
        ij.ukh[398] = -1042683878;
        ij.ukh[399] = 744608293;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov fallbackDatasetStep(ov var1_1, float var2_2, float var3_3, boolean var4_4) {
        block64: {
            block63: {
                block62: {
                    block61: {
                        block60: {
                            block59: {
                                var12_5 = ij.c;
                                var11_6 /* !! */  = ij.b;
                                var10_7 = ij.a;
                                if (var12_5) {
                                    throw null;
lbl6:
                                    // 15 sources

                                    return null;
                                }
                                if (var10_7 || var10_7) ** GOTO lbl6
                                if (!var4_4) break block59;
                                if (var10_7) ** GOTO lbl6
                                v0 = ij.ukj("uqi", umt(int ), (int)153);
                                if (var12_5) {
                                    throw null;
                                }
                                break block60;
                            }
                            if (var10_7 || var10_7) ** GOTO lbl6
                            v0 = var5_8 = ij.ukj("uqj", umt(int ), (int)154);
                        }
                        if (var10_7 || var10_7) ** GOTO lbl6
                        if (!var4_4) break block61;
                        if (var10_7) ** GOTO lbl6
                        v1 = ij.ukj("uqk", umt(int ), (int)155);
                        if (var12_5) {
                            throw null;
                        }
                        break block62;
                    }
                    if (var10_7 || var10_7) ** GOTO lbl6
                    v1 = var6_9 = ij.ukj("uql", umt(int ), (int)156);
                }
                if (var10_7 || var10_7) ** GOTO lbl6
                if (!var4_4) break block63;
                if (var10_7) ** GOTO lbl6
                v2 = ij.ukj("uqm", umt(int ), (int)157);
                if (var12_5) {
                    throw null;
                }
                break block64;
            }
            if (var10_7 || var10_7) ** GOTO lbl6
            v2 = var7_10 = ij.ukj("uqn", umt(int ), (int)158);
        }
        if (var10_7) ** GOTO lbl6
        if (var11_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_7) ** GOTO lbl6
                var8_11 = class_3532.method_15363((float)(var2_2 * var5_8), (float)(-var6_9), (float)var6_9);
                if (var10_7 || var10_7) ** GOTO lbl6
                var9_12 = class_3532.method_15363((float)(var3_3 * var5_8), (float)(-var7_10), (float)var7_10);
                if (var10_7 || var10_7) ** GOTO lbl6
                this.lastStepYaw = var8_11;
                if (var10_7 || var10_7) ** GOTO lbl6
                this.lastStepPitch = var9_12;
                if (!var10_7 && !var10_7) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + var8_11, class_3532.method_15363((float)(var1_1.getPitch() + var9_12), (float)ij.ukj("uqo", umt(int ), (int)159), (float)ij.ukj("uqp", umt(int ), (int)160)));
            }
lbl56:
            // 3 sources

            case 0: {
                var11_6 /* !! */  = (int)ij.ukj("uqq", ukg(int ), (int)161);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl61:
            // 2 sources

            case 1: {
                var11_6 /* !! */  = (int)ij.ukj("uqr", ukg(int ), (int)162);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl66:
            // 2 sources

            case 2: {
                var11_6 /* !! */  = (int)ij.ukj("uqs", ukg(int ), (int)163);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl71:
            // 2 sources

            case 3: {
                var11_6 /* !! */  = (int)ij.ukj("uqt", ukg(int ), (int)164);
                if (!var12_5) ** GOTO lbl56
                throw null;
            }
            case 4: {
                var11_6 /* !! */  = (int)ij.ukj("uqu", ukg(int ), (int)165);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                var11_6 /* !! */  = (int)ij.ukj("uqv", ukg(int ), (int)166);
                if (!var12_5) break;
                throw null;
            }
lbl84:
            // 2 sources

            case 6: {
                var11_6 /* !! */  = (int)ij.ukj("uqw", ukg(int ), (int)167);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 7: {
                var11_6 /* !! */  = (int)ij.ukj("uqx", ukg(int ), (int)168);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl94:
            // 2 sources

            case 8: {
                var11_6 /* !! */  = (int)ij.ukj("uqy", ukg(int ), (int)169);
                if (!var12_5) ** GOTO lbl71
                throw null;
            }
            case 9: {
                var11_6 /* !! */  = (int)ij.ukj("uqz", ukg(int ), (int)170);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl103:
            // 2 sources

            case 10: {
                var11_6 /* !! */  = (int)ij.ukj("ura", ukg(int ), (int)171);
                if (!var12_5) ** GOTO lbl84
                throw null;
            }
            case 11: {
                var11_6 /* !! */  = (int)ij.ukj("urb", ukg(int ), (int)172);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 12: {
                var11_6 /* !! */  = (int)ij.ukj("urc", ukg(int ), (int)173);
                if (!var12_5) break;
                throw null;
            }
lbl116:
            // 4 sources

            case 13: {
                var11_6 /* !! */  = (int)ij.ukj("urd", ukg(int ), (int)174);
                if (!var12_5) ** GOTO lbl61
                throw null;
            }
            case 14: {
                var11_6 /* !! */  = (int)ij.ukj("ure", ukg(int ), (int)175);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl125:
            // 4 sources

            case 15: {
                var11_6 /* !! */  = (int)ij.ukj("urf", ukg(int ), (int)176);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 16: {
                var11_6 /* !! */  = (int)ij.ukj("urg", ukg(int ), (int)177);
                if (var12_5) {
                    throw null;
                }
            }
lbl134:
            // 6 sources

            case 17: {
                var11_6 /* !! */  = (int)ij.ukj("urh", ukg(int ), (int)178);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 18: {
                var11_6 /* !! */  = (int)ij.ukj("uri", ukg(int ), (int)179);
                if (!var12_5) ** GOTO lbl103
                throw null;
            }
            case 19: {
                var11_6 /* !! */  = (int)ij.ukj("urj", ukg(int ), (int)180);
                if (!var12_5) ** GOTO lbl134
                throw null;
            }
            case 20: {
                var11_6 /* !! */  = (int)ij.ukj("urk", ukg(int ), (int)181);
                if (!var12_5) ** GOTO lbl134
                throw null;
            }
lbl151:
            // 2 sources

            case 21: {
                var11_6 /* !! */  = (int)ij.ukj("url", ukg(int ), (int)182);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl156:
            // 3 sources

            case 22: {
                var11_6 /* !! */  = (int)ij.ukj("urm", ukg(int ), (int)183);
                if (!var12_5) ** GOTO lbl66
                throw null;
            }
lbl160:
            // 2 sources

            case 23: {
                var11_6 /* !! */  = (int)ij.ukj("urn", ukg(int ), (int)184);
                if (!var12_5) ** GOTO lbl56
                throw null;
            }
            case 24: {
                var11_6 /* !! */  = (int)ij.ukj("uro", ukg(int ), (int)185);
                if (!var12_5) ** GOTO lbl134
                throw null;
            }
lbl168:
            // 2 sources

            case 25: {
                var11_6 /* !! */  = (int)ij.ukj("urp", ukg(int ), (int)186);
                if (!var12_5) ** GOTO lbl116
                throw null;
            }
lbl172:
            // 2 sources

            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_6 /* !! */  = (int)ij.ukj("urq", ukg(int ), (int)187);
                    if (!var12_5) ** GOTO lbl125
                    throw null;
                }
            }
lbl177:
            // 3 sources

            case 27: {
                var11_6 /* !! */  = (int)ij.ukj("urr", ukg(int ), (int)188);
                if (!var12_5) ** GOTO lbl125
                throw null;
            }
            case 28: 
        }
        var11_6 /* !! */  = (int)ij.ukj("urs", ukg(int ), (int)189);
        ** while (!var12_5)
lbl184:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vog() {
        ij.uki[0] = -2004256268;
        ij.uki[1] = -474760645;
        ij.uki[2] = -619519036;
        ij.uki[3] = -1405917296;
        ij.uki[4] = 188903789;
        ij.uki[5] = 1960904967;
        ij.uki[6] = 344530878;
        ij.uki[7] = -1708782449;
        ij.uki[8] = -1041231685;
        ij.uki[9] = -1202154765;
        ij.uki[10] = 282156659;
        ij.uki[11] = 619192938;
        ij.uki[12] = -1516324657;
        ij.uki[13] = 2126032541;
        ij.uki[14] = 111038670;
        ij.uki[15] = 1018489947;
        ij.uki[16] = -2095866418;
        ij.uki[17] = 1373881484;
        ij.uki[18] = -1014415916;
        ij.uki[19] = 1583216935;
        ij.uki[20] = 891068401;
        ij.uki[21] = -1341358020;
        ij.uki[22] = 1523245101;
        ij.uki[23] = -1128919990;
        ij.uki[24] = 1753894572;
        ij.uki[25] = 959151737;
        ij.uki[26] = -932833309;
        ij.uki[27] = -299571597;
        ij.uki[28] = -1390118382;
        ij.uki[29] = 1643187440;
        ij.uki[30] = 1218802792;
        ij.uki[31] = -1429561038;
        ij.uki[32] = -787745161;
        ij.uki[33] = -983904510;
        ij.uki[34] = 1381554909;
        ij.uki[35] = -86994449;
        ij.uki[36] = 369260118;
        ij.uki[37] = -130130981;
        ij.uki[38] = 1162923153;
        ij.uki[39] = -1141839842;
        ij.uki[40] = -734290315;
        ij.uki[41] = 2107058627;
        ij.uki[42] = 979964359;
        ij.uki[43] = 807238320;
        ij.uki[44] = 317241414;
        ij.uki[45] = 1752652467;
        ij.uki[46] = 1061997755;
        ij.uki[47] = -1732151092;
        ij.uki[48] = -1511872880;
        ij.uki[49] = 1851801131;
        ij.uki[50] = 842676455;
        ij.uki[51] = -241110594;
        ij.uki[52] = 2146173006;
        ij.uki[53] = -742351806;
        ij.uki[54] = 2041354882;
        ij.uki[55] = 387213359;
        ij.uki[56] = 1279227351;
        ij.uki[57] = 832839166;
        ij.uki[58] = -852024759;
        ij.uki[59] = -460462954;
        ij.uki[60] = -1766005698;
        ij.uki[61] = -1467980059;
        ij.uki[62] = 138660224;
        ij.uki[63] = -1254606098;
        ij.uki[64] = 38386427;
        ij.uki[65] = -1916685356;
        ij.uki[66] = -1458214341;
        ij.uki[67] = -1336379479;
        ij.uki[68] = 1595905994;
        ij.uki[69] = -108915954;
        ij.uki[70] = -828598311;
        ij.uki[71] = 690268132;
        ij.uki[72] = 420363475;
        ij.uki[73] = 485722519;
        ij.uki[74] = -1566377007;
        ij.uki[75] = 1161982171;
        ij.uki[76] = 241452298;
        ij.uki[77] = -642336317;
        ij.uki[78] = -1949746512;
        ij.uki[79] = -111990114;
        ij.uki[80] = -1383843112;
        ij.uki[81] = 1675419401;
        ij.uki[82] = -267410078;
        ij.uki[83] = 253391364;
        ij.uki[84] = 1600255227;
        ij.uki[85] = -1796394212;
        ij.uki[86] = -312329553;
        ij.uki[87] = 1613194720;
        ij.uki[88] = 310271401;
        ij.uki[89] = 456331324;
        ij.uki[90] = 774159624;
        ij.uki[91] = 968360818;
        ij.uki[92] = -625604613;
        ij.uki[93] = -1894030136;
        ij.uki[94] = -599531388;
        ij.uki[95] = 772888096;
        ij.uki[96] = 1620653961;
        ij.uki[97] = 901598232;
        ij.uki[98] = -367209180;
        ij.uki[99] = -1812042139;
    }

    private static /* synthetic */ void vng() {
        ij.ukh[200] = -1468784849;
        ij.ukh[201] = -153574524;
        ij.ukh[202] = 1591078285;
        ij.ukh[203] = -946200184;
        ij.ukh[204] = -79492243;
        ij.ukh[205] = 1799553687;
        ij.ukh[206] = 1627418307;
        ij.ukh[207] = -293017799;
        ij.ukh[208] = 1349774862;
        ij.ukh[209] = -876065272;
        ij.ukh[210] = 875149245;
        ij.ukh[211] = 1808598569;
        ij.ukh[212] = 1732299503;
        ij.ukh[213] = -104119729;
        ij.ukh[214] = -53289634;
        ij.ukh[215] = 1420935730;
        ij.ukh[216] = -1438896489;
        ij.ukh[217] = 2084724408;
        ij.ukh[218] = 137357392;
        ij.ukh[219] = -2030209894;
        ij.ukh[220] = 234661611;
        ij.ukh[221] = 1994303063;
        ij.ukh[222] = 1774730648;
        ij.ukh[223] = -604906321;
        ij.ukh[224] = -1587548886;
        ij.ukh[225] = 1556004561;
        ij.ukh[226] = -1220069856;
        ij.ukh[227] = 1028510958;
        ij.ukh[228] = -886352356;
        ij.ukh[229] = -1317820669;
        ij.ukh[230] = 1410653356;
        ij.ukh[231] = -761291995;
        ij.ukh[232] = 2096682843;
        ij.ukh[233] = -732737320;
        ij.ukh[234] = -950561715;
        ij.ukh[235] = -616197504;
        ij.ukh[236] = -600013985;
        ij.ukh[237] = 2078470732;
        ij.ukh[238] = 1466917727;
        ij.ukh[239] = -1716736102;
        ij.ukh[240] = -1540122311;
        ij.ukh[241] = 1879530217;
        ij.ukh[242] = -911487018;
        ij.ukh[243] = -1103757494;
        ij.ukh[244] = -1766898265;
        ij.ukh[245] = -1253902198;
        ij.ukh[246] = 1548858216;
        ij.ukh[247] = 1672520292;
        ij.ukh[248] = 40981146;
        ij.ukh[249] = 313063410;
        ij.ukh[250] = 702033344;
        ij.ukh[251] = 565132505;
        ij.ukh[252] = -96718771;
        ij.ukh[253] = 1702226822;
        ij.ukh[254] = 632677807;
        ij.ukh[255] = 1828711774;
        ij.ukh[256] = -30627554;
        ij.ukh[257] = 2005760147;
        ij.ukh[258] = -950531351;
        ij.ukh[259] = 65422901;
        ij.ukh[260] = 1250747996;
        ij.ukh[261] = -777400343;
        ij.ukh[262] = -803609665;
        ij.ukh[263] = -1583633317;
        ij.ukh[264] = -1460965102;
        ij.ukh[265] = -707847002;
        ij.ukh[266] = 913249710;
        ij.ukh[267] = 1707290856;
        ij.ukh[268] = 1946550469;
        ij.ukh[269] = 602368080;
        ij.ukh[270] = -265651382;
        ij.ukh[271] = 212933380;
        ij.ukh[272] = -2109745564;
        ij.ukh[273] = 1439575740;
        ij.ukh[274] = -108619220;
        ij.ukh[275] = 758116721;
        ij.ukh[276] = -338862877;
        ij.ukh[277] = 320027731;
        ij.ukh[278] = 1535598763;
        ij.ukh[279] = -955024602;
        ij.ukh[280] = 1980932596;
        ij.ukh[281] = -1573896412;
        ij.ukh[282] = -869315621;
        ij.ukh[283] = 319159194;
        ij.ukh[284] = -74964311;
        ij.ukh[285] = 543338349;
        ij.ukh[286] = 1136713781;
        ij.ukh[287] = -426518545;
        ij.ukh[288] = 166460180;
        ij.ukh[289] = -2035352340;
        ij.ukh[290] = -1301222015;
        ij.ukh[291] = -317069830;
        ij.ukh[292] = -787579189;
        ij.ukh[293] = -1015461933;
        ij.ukh[294] = -1868574012;
        ij.ukh[295] = 1571016846;
        ij.ukh[296] = -788029169;
        ij.ukh[297] = 1978461692;
        ij.ukh[298] = 761405921;
        ij.ukh[299] = -610101565;
    }

    private static /* synthetic */ void vor() {
        ij.uki[100] = 2102017617;
        ij.uki[101] = 1829953673;
        ij.uki[102] = 903655774;
        ij.uki[103] = -103590903;
        ij.uki[104] = 944329948;
        ij.uki[105] = 1495571160;
        ij.uki[106] = -166887207;
        ij.uki[107] = -1385142382;
        ij.uki[108] = 694374563;
        ij.uki[109] = -356855117;
        ij.uki[110] = -316736652;
        ij.uki[111] = -1315576070;
        ij.uki[112] = 1684724910;
        ij.uki[113] = 357446797;
        ij.uki[114] = -501929844;
        ij.uki[115] = -2120316511;
        ij.uki[116] = -726001539;
        ij.uki[117] = 1814642865;
        ij.uki[118] = 510095998;
        ij.uki[119] = -1967954043;
        ij.uki[120] = -1242250964;
        ij.uki[121] = 591013785;
        ij.uki[122] = 1220472426;
        ij.uki[123] = 1677369263;
        ij.uki[124] = 1952532689;
        ij.uki[125] = -399140992;
        ij.uki[126] = -102048710;
        ij.uki[127] = 1634038256;
        ij.uki[128] = 598835240;
        ij.uki[129] = 1503678262;
        ij.uki[130] = 961454818;
        ij.uki[131] = -438714419;
        ij.uki[132] = 1031386738;
        ij.uki[133] = 1147046450;
        ij.uki[134] = -2005087000;
        ij.uki[135] = -725735241;
        ij.uki[136] = -216042599;
        ij.uki[137] = -758801939;
        ij.uki[138] = -286865113;
        ij.uki[139] = 531576191;
        ij.uki[140] = -269012841;
        ij.uki[141] = -1692581779;
        ij.uki[142] = 918647759;
        ij.uki[143] = -828946680;
        ij.uki[144] = 1910157849;
        ij.uki[145] = -196894689;
        ij.uki[146] = 800762799;
        ij.uki[147] = 499792957;
        ij.uki[148] = -2030573217;
        ij.uki[149] = 788518122;
        ij.uki[150] = -1021544522;
        ij.uki[151] = -1302265019;
        ij.uki[152] = -1858961563;
        ij.uki[153] = -1497593216;
        ij.uki[154] = 599687350;
        ij.uki[155] = 807438837;
        ij.uki[156] = -663720377;
        ij.uki[157] = -31120394;
        ij.uki[158] = -1561402517;
        ij.uki[159] = 553304454;
        ij.uki[160] = -2016654111;
        ij.uki[161] = 280316054;
        ij.uki[162] = 780639932;
        ij.uki[163] = -2081445497;
        ij.uki[164] = 1680748725;
        ij.uki[165] = 49539572;
        ij.uki[166] = 871768640;
        ij.uki[167] = 452957716;
        ij.uki[168] = 2004240913;
        ij.uki[169] = -1794107586;
        ij.uki[170] = 1548665091;
        ij.uki[171] = -1119935160;
        ij.uki[172] = -797794703;
        ij.uki[173] = 807875032;
        ij.uki[174] = 383650953;
        ij.uki[175] = 1311807471;
        ij.uki[176] = -141851359;
        ij.uki[177] = -1428072664;
        ij.uki[178] = 1044798482;
        ij.uki[179] = 1032683904;
        ij.uki[180] = 1487456806;
        ij.uki[181] = 529142701;
        ij.uki[182] = -531102689;
        ij.uki[183] = -2048457911;
        ij.uki[184] = 1317772126;
        ij.uki[185] = 1637397334;
        ij.uki[186] = -1497955788;
        ij.uki[187] = 1681000172;
        ij.uki[188] = -1057512474;
        ij.uki[189] = 1006420753;
        ij.uki[190] = 934461859;
        ij.uki[191] = -392368716;
        ij.uki[192] = -336873545;
        ij.uki[193] = 1255826191;
        ij.uki[194] = 1296476925;
        ij.uki[195] = 662307030;
        ij.uki[196] = 908066226;
        ij.uki[197] = 1347470104;
        ij.uki[198] = -1074512501;
        ij.uki[199] = -1533151919;
    }

    private static /* synthetic */ void vqt() {
        ij.urv[0] = -1852913627225904119L;
        ij.urv[1] = 1713612764955056033L;
        ij.urv[2] = -7956778646344213188L;
        ij.urv[3] = 5683944241281450058L;
        ij.urv[4] = 885147870982174516L;
        ij.urv[5] = -6162867449497455210L;
        ij.urv[6] = -4023005445564255638L;
        ij.urv[7] = 1364831311164523471L;
        ij.urv[8] = -3984202355911032483L;
        ij.urv[9] = -3384115489071868543L;
        ij.urv[10] = 1023554866753715231L;
        ij.urv[11] = -4412840970169039571L;
        ij.urv[12] = -8124828824842045131L;
        ij.urv[13] = 5432961526644851551L;
        ij.urv[14] = -4175034067923138881L;
        ij.urv[15] = 7805423965872103908L;
        ij.urv[16] = -6070288710688087612L;
        ij.urv[17] = 3492707931664215414L;
        ij.urv[18] = 7109494405945923157L;
        ij.urv[19] = 4970692191797068933L;
        ij.urv[20] = -636739203920691726L;
        ij.urv[21] = -6710293749244012998L;
        ij.urv[22] = 1515114841870532651L;
        ij.urv[23] = -9121300815342711368L;
        ij.urv[24] = 5365307339737315722L;
        ij.urv[25] = 7025761067388775844L;
        ij.urv[26] = 5952171824174378160L;
        ij.urv[27] = -1910400956180013081L;
        ij.urv[28] = -8779750384794672707L;
        ij.urv[29] = 5577271055713474549L;
        ij.urv[30] = -31287334608661566L;
        ij.urv[31] = -8464325046769619553L;
        ij.urv[32] = -1939647555105560860L;
        ij.urv[33] = -1657360004111326672L;
        ij.urv[34] = -2976575148079809349L;
        ij.urv[35] = -4775655774757300567L;
        ij.urv[36] = -7009398367776740159L;
        ij.urv[37] = 5776639826709344316L;
        ij.urv[38] = -7785956566553722571L;
        ij.urv[39] = -8624566677524131248L;
        ij.urv[40] = 6482455010554371096L;
        ij.urv[41] = -5794859984082359125L;
        ij.urv[42] = 966699986757956869L;
        ij.urv[43] = 2342611464698688868L;
        ij.urv[44] = 1540702552352590044L;
        ij.urv[45] = 4950142963727279549L;
        ij.urv[46] = 5456271369172795135L;
        ij.urv[47] = -8084597261308794835L;
        ij.urv[48] = 6445228641232868641L;
        ij.urv[49] = -7299690951932907826L;
        ij.urv[50] = -531115864079888767L;
        ij.urv[51] = -7795437300631167853L;
        ij.urv[52] = -9035170306557195012L;
        ij.urv[53] = -5408631129457576241L;
        ij.urv[54] = -1778276983064975978L;
        ij.urv[55] = -5230993117373154018L;
        ij.urv[56] = -4712513790460460532L;
        ij.urv[57] = -8121688184850244742L;
        ij.urv[58] = -6928317014389609373L;
        ij.urv[59] = 9085955979547351410L;
        ij.urv[60] = 8374362137997964140L;
        ij.urv[61] = -5859980216316707356L;
        ij.urv[62] = 3557060232749584608L;
        ij.urv[63] = -3050399910933244665L;
        ij.urv[64] = -7424192936103533815L;
        ij.urv[65] = 7720791160050101360L;
        ij.urv[66] = -7898548507158761726L;
        ij.urv[67] = 911372887770109028L;
        ij.urv[68] = 2849156175089107291L;
        ij.urv[69] = 6401026654262608388L;
        ij.urv[70] = -7650461332360464718L;
        ij.urv[71] = -2696160834846041894L;
        ij.urv[72] = 1541930230313468762L;
        ij.urv[73] = 6334341250382084342L;
        ij.urv[74] = -655348525171220864L;
        ij.urv[75] = -9217851179429917903L;
        ij.urv[76] = -8213986211685266173L;
        ij.urv[77] = -6002419559418308039L;
        ij.urv[78] = 4633601146814073205L;
        ij.urv[79] = -5815230400837547620L;
        ij.urv[80] = 5514159670331576324L;
        ij.urv[81] = 8443273782942167551L;
        ij.urv[82] = 1169904211001535293L;
        ij.urv[83] = -8143121935375337618L;
        ij.urv[84] = -7780408143280129135L;
        ij.urv[85] = -739229137355630179L;
        ij.urv[86] = 8725731839516452214L;
        ij.urv[87] = 6105527103969420110L;
        ij.urv[88] = -4198484256792830485L;
        ij.urv[89] = 1824777852438193297L;
        ij.urv[90] = 323874496005842956L;
        ij.urv[91] = -7461646866303320615L;
        ij.urv[92] = 8619763402596472905L;
        ij.urv[93] = -4687013241307779274L;
        ij.urv[94] = 5901443333597223516L;
        ij.urv[95] = 2602539161405796695L;
        ij.urv[96] = 5973392634446661700L;
        ij.urv[97] = -5233106874203128117L;
        ij.urv[98] = 1573928052517252371L;
        ij.urv[99] = 6236909961184916260L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov outsideHitboxRotation(class_1297 var1_1, ov var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ij.bf - ij.ukj("uur", urt(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ij.ukj("uus", ukg(int ), (int)214)) break;
            v0 /* !! */  = (long)ij.ukj("uut", ukg(int ), (int)215);
        }
        var12_3 = ij.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ij.bf - ij.ukj("uuu", urt(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ij.ukj("uuv", ukg(int ), (int)216)) break;
            v1 /* !! */  = (long)ij.ukj("uuw", ukg(int ), (int)217);
        }
        var11_4 /* !! */  = ij.b;
        v2 /* !! */  = ij.bf;
        if (true) ** GOTO lbl17
        block63: while (true) {
            v2 /* !! */  = (long)(v3 - ij.ukj("uux", urt(int ), (int)50));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1976799909: {
                    break block63;
                }
                case 789293348: {
                    v3 = ij.ukj("uuy", urt(int ), (int)51);
                    continue block63;
                }
                case 1439691516: {
                    v3 = ij.ukj("uuz", urt(int ), (int)52);
                    continue block63;
                }
            }
            break;
        }
        var10_5 = ij.a;
        if (var12_3) {
            throw null;
lbl29:
            // 11 sources

            return null;
        }
        if (var10_5 || var10_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ij.bf - ij.ukj("uva", urt(int ), (int)53)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ij.ukj("uvb", ukg(int ), (int)218)) break;
            v4 /* !! */  = (long)ij.ukj("uvc", ukg(int ), (int)219);
        }
        v5 /* !! */  = ij.bf;
        if (true) ** GOTO lbl41
        block66: while (true) {
            v5 /* !! */  = (long)(ij.ukj("uve", urt(int ), (int)55) - ij.ukj("uvd", urt(int ), (int)54));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1976799909: {
                    break block66;
                }
                case 1249572203: {
                    continue block66;
                }
            }
            break;
        }
        v6 = ij.mc.field_1724;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = ij.bf - ij.ukj("uvf", urt(int ), (int)56)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ij.ukj("uvg", ukg(int ), (int)220)) break;
            v7 /* !! */  = (long)ij.ukj("uvh", ukg(int ), (int)221);
        }
        var3_6 = v6.field_6012;
        if (var10_5 || var10_5) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = ij.bf - ij.ukj("uvi", urt(int ), (int)57)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ij.ukj("uvj", ukg(int ), (int)222)) break;
            v8 /* !! */  = (long)ij.ukj("uvk", ukg(int ), (int)223);
        }
        if (var3_6 == this.lastDirectionTick) ** GOTO lbl86
        if (var10_5) ** GOTO lbl29
        if (var3_6 % ij.ukj("uvl", ukg(int ), (int)224) != 0) ** GOTO lbl86
        if (var10_5 || var10_5) ** GOTO lbl29
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = ij.bf - ij.ukj("uvm", urt(int ), (int)58)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ij.ukj("uvn", ukg(int ), (int)225)) break;
            v9 /* !! */  = (long)ij.ukj("uvo", ukg(int ), (int)226);
        }
        this.lastDirectionTick = var3_6;
        if (var10_5 || var10_5) ** GOTO lbl29
        if (var11_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = ij.bf - ij.ukj("uvp", urt(int ), (int)59)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ij.ukj("uvq", ukg(int ), (int)227)) break;
                    v10 /* !! */  = (long)ij.ukj("uvr", ukg(int ), (int)228);
                }
                v11 = -this.sideDirection;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = ij.bf - ij.ukj("uvs", urt(int ), (int)60)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ij.ukj("uvt", ukg(int ), (int)229)) break;
                    v12 /* !! */  = (long)ij.ukj("uvu", ukg(int ), (int)230);
                }
                this.sideDirection = v11;
                if (var10_5) ** GOTO lbl29
lbl86:
                // 3 sources

                if (var10_5 || var10_5) ** GOTO lbl29
                v13 = ij.ukj("uvv", usf(int ), (int)61);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = ij.bf - ij.ukj("uvw", urt(int ), (int)62)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ij.ukj("uvx", ukg(int ), (int)231)) break;
                    v14 /* !! */  = (long)ij.ukj("uvy", ukg(int ), (int)232);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_9 = ij.bf - ij.ukj("uvz", urt(int ), (int)63)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ij.ukj("uwa", ukg(int ), (int)233)) break;
                    v15 /* !! */  = (long)ij.ukj("uwb", ukg(int ), (int)234);
                }
                v16 = ij.mc.field_1724;
                v17 /* !! */  = ij.bf;
                if (true) ** GOTO lbl103
                block74: while (true) {
                    v17 /* !! */  = (long)(v18 - ij.ukj("uwc", urt(int ), (int)64));
lbl103:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1976799909: {
                            break block74;
                        }
                        case 1009418303: {
                            v18 = ij.ukj("uwd", urt(int ), (int)65);
                            continue block74;
                        }
                        case 2009839528: {
                            v18 = ij.ukj("uwe", urt(int ), (int)66);
                            continue block74;
                        }
                    }
                    break;
                }
                v19 = v16.method_33571();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_10 = ij.bf - ij.ukj("uwf", urt(int ), (int)67)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ij.ukj("uwg", ukg(int ), (int)235)) break;
                    v20 /* !! */  = (long)ij.ukj("uwh", ukg(int ), (int)236);
                }
                v21 = var1_1.method_5829();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_11 = ij.bf - ij.ukj("uwi", urt(int ), (int)68)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ij.ukj("uwj", ukg(int ), (int)237)) break;
                    v22 /* !! */  = (long)ij.ukj("uwk", ukg(int ), (int)238);
                }
                v23 = v21.method_1005();
                v24 /* !! */  = ij.bf;
                if (true) ** GOTO lbl129
                block77: while (true) {
                    v24 /* !! */  = (long)(v25 - ij.ukj("uwl", urt(int ), (int)69));
lbl129:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1976799909: {
                            break block77;
                        }
                        case -941278849: {
                            v25 = ij.ukj("uwm", urt(int ), (int)70);
                            continue block77;
                        }
                        case 727779312: {
                            v25 = ij.ukj("uwn", urt(int ), (int)71);
                            continue block77;
                        }
                    }
                    break;
                }
                v26 = v19.method_1022(v23);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_12 = ij.bf - ij.ukj("uwo", urt(int ), (int)72)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ij.ukj("uwp", ukg(int ), (int)239)) break;
                    v27 /* !! */  = (long)ij.ukj("uwq", ukg(int ), (int)240);
                }
                var4_7 = Math.max((double)v13, v26);
                if (var10_5 || var10_5) ** GOTO lbl29
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_13 = ij.bf - ij.ukj("uwr", urt(int ), (int)73)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ij.ukj("uws", ukg(int ), (int)241)) break;
                    v28 /* !! */  = (long)ij.ukj("uwt", ukg(int ), (int)242);
                }
                v29 = (double)var1_1.method_17681() * ij.ukj("uwu", usf(int ), (int)74);
                v30 = ij.ukj("uwv", usf(int ), (int)75);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_14 = ij.bf - ij.ukj("uww", urt(int ), (int)76)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == ij.ukj("uwx", ukg(int ), (int)243)) break;
                    v31 /* !! */  = (long)ij.ukj("uwy", ukg(int ), (int)244);
                }
                var6_8 = Math.max(v29, (double)v30);
                if (var10_5 || var10_5) ** GOTO lbl29
                v32 = var6_8 / var4_7;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_15 = ij.bf - ij.ukj("uwz", urt(int ), (int)77)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ij.ukj("uxa", ukg(int ), (int)245)) break;
                    v33 /* !! */  = (long)ij.ukj("uxb", ukg(int ), (int)246);
                }
                v34 = Math.atan(v32);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_16 = ij.bf - ij.ukj("uxc", urt(int ), (int)78)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == ij.ukj("uxd", ukg(int ), (int)247)) break;
                    v35 /* !! */  = (long)ij.ukj("uxe", ukg(int ), (int)248);
                }
                var8_9 = (float)Math.toDegrees(v34);
                if (var10_5 || var10_5) ** GOTO lbl29
                v36 = ij.ukj("uxf", umt(int ), (int)249);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_17 = ij.bf - ij.ukj("uxg", urt(int ), (int)79)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ij.ukj("uxh", ukg(int ), (int)250)) break;
                    v37 /* !! */  = (long)ij.ukj("uxi", ukg(int ), (int)251);
                }
                v38 = ij.ukj("uxj", umt(int ), (int)252);
                v39 /* !! */  = ij.bf;
                if (true) ** GOTO lbl185
                block84: while (true) {
                    v39 /* !! */  = (long)(ij.ukj("uxl", urt(int ), (int)81) - ij.ukj("uxk", urt(int ), (int)80));
lbl185:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1976799909: {
                            break block84;
                        }
                        case -1705708227: {
                            continue block84;
                        }
                    }
                    break;
                }
                var9_10 = v36 + this.random.nextFloat(0.0f, (float)v38);
                if (!var10_5 && !var10_5) ** break;
                ** continue;
                v40 /* !! */  = ij.bf;
                if (true) ** GOTO lbl197
                block85: while (true) {
                    v40 /* !! */  = (long)(ij.ukj("uxn", urt(int ), (int)83) - ij.ukj("uxm", urt(int ), (int)82));
lbl197:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1976799909: {
                            break block85;
                        }
                        case -1330174545: {
                            continue block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_18 = ij.bf - ij.ukj("uxo", urt(int ), (int)84)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == ij.ukj("uxp", ukg(int ), (int)253)) break;
                    v41 /* !! */  = (long)ij.ukj("uxq", ukg(int ), (int)254);
                }
                v42 = var2_2.getYaw();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_19 = ij.bf - ij.ukj("uxr", urt(int ), (int)85)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ij.ukj("uxs", ukg(int ), (int)255)) break;
                    v43 /* !! */  = (long)ij.ukj("uxt", ukg(int ), (int)256);
                }
                v44 = v42 + (float)this.sideDirection * (var8_9 + var9_10);
                v45 /* !! */  = ij.bf;
                if (true) ** GOTO lbl218
                block88: while (true) {
                    v45 /* !! */  = (long)(ij.ukj("uxv", urt(int ), (int)87) - ij.ukj("uxu", urt(int ), (int)86));
lbl218:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1976799909: {
                            break block88;
                        }
                        case 907494132: {
                            continue block88;
                        }
                    }
                    break;
                }
                v46 = var2_2.getPitch();
                v47 /* !! */  = ij.bf;
                if (true) ** GOTO lbl228
                block89: while (true) {
                    v47 /* !! */  = (long)(v48 - ij.ukj("uxw", urt(int ), (int)88));
lbl228:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1976799909: {
                            break block89;
                        }
                        case -1167819641: {
                            v48 = ij.ukj("uxx", urt(int ), (int)89);
                            continue block89;
                        }
                        case -686120778: {
                            v48 = ij.ukj("uxy", urt(int ), (int)90);
                            continue block89;
                        }
                        case -676828817: {
                            v48 = ij.ukj("uxz", urt(int ), (int)91);
                            continue block89;
                        }
                    }
                    break;
                }
                return new ov(v44, v46);
            }
            case 0: {
                var11_4 /* !! */  = (int)ij.ukj("uya", ukg(int ), (int)257);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl246:
            // 2 sources

            case 1: {
                var11_4 /* !! */  = (int)ij.ukj("uyb", ukg(int ), (int)258);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 2: {
                do {
                    var11_4 /* !! */  = (int)ij.ukj("uyc", ukg(int ), (int)259);
                } while (!var12_3);
                throw null;
            }
lbl256:
            // 3 sources

            case 3: {
                var11_4 /* !! */  = (int)ij.ukj("uyd", ukg(int ), (int)260);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 4: {
                var11_4 /* !! */  = (int)ij.ukj("uye", ukg(int ), (int)261);
                if (var12_3) {
                    throw null;
                }
            }
            case 5: {
                var11_4 /* !! */  = (int)ij.ukj("uyf", ukg(int ), (int)262);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_4 /* !! */  = (int)ij.ukj("uyg", ukg(int ), (int)263);
                    if (!var12_3) ** GOTO lbl256
                    throw null;
                }
            }
            case 7: {
                do {
                    var11_4 /* !! */  = (int)ij.ukj("uyh", ukg(int ), (int)264);
                } while (!var12_3);
                throw null;
            }
lbl280:
            // 2 sources

            case 8: {
                var11_4 /* !! */  = (int)ij.ukj("uyi", ukg(int ), (int)265);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl285:
            // 2 sources

            case 9: {
                do {
                    var11_4 /* !! */  = (int)ij.ukj("uyj", ukg(int ), (int)266);
                } while (!var12_3);
                throw null;
            }
            case 10: {
                var11_4 /* !! */  = (int)ij.ukj("uyk", ukg(int ), (int)267);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl295:
            // 3 sources

            case 11: {
                var11_4 /* !! */  = (int)ij.ukj("uyl", ukg(int ), (int)268);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl300:
            // 2 sources

            case 12: {
                var11_4 /* !! */  = (int)ij.ukj("uym", ukg(int ), (int)269);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl305:
            // 2 sources

            case 13: {
                var11_4 /* !! */  = (int)ij.ukj("uyn", ukg(int ), (int)270);
                if (!var12_3) break;
                throw null;
            }
lbl309:
            // 2 sources

            case 14: {
                var11_4 /* !! */  = (int)ij.ukj("uyo", ukg(int ), (int)271);
                if (!var12_3) ** GOTO lbl280
                throw null;
            }
lbl313:
            // 4 sources

            case 15: {
                var11_4 /* !! */  = (int)ij.ukj("uyp", ukg(int ), (int)272);
                if (!var12_3) ** GOTO lbl295
                throw null;
            }
lbl317:
            // 3 sources

            case 16: {
                var11_4 /* !! */  = (int)ij.ukj("uyq", ukg(int ), (int)273);
                if (!var12_3) ** GOTO lbl256
                throw null;
            }
lbl321:
            // 2 sources

            case 17: {
                var11_4 /* !! */  = (int)ij.ukj("uyr", ukg(int ), (int)274);
                if (!var12_3) ** GOTO lbl317
                throw null;
            }
            case 18: {
                var11_4 /* !! */  = (int)ij.ukj("uys", ukg(int ), (int)275);
                if (!var12_3) ** GOTO lbl246
                throw null;
            }
            case 19: {
                var11_4 /* !! */  = (int)ij.ukj("uyt", ukg(int ), (int)276);
                if (!var12_3) ** GOTO lbl305
                throw null;
            }
            case 20: {
                var11_4 /* !! */  = (int)ij.ukj("uyu", ukg(int ), (int)277);
                if (!var12_3) ** GOTO lbl321
                throw null;
            }
            case 21: 
        }
        var11_4 /* !! */  = (int)ij.ukj("uyv", ukg(int ), (int)278);
        ** while (!var12_3)
lbl340:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void vpi() {
        ij.uki[300] = 789327896;
        ij.uki[301] = 863275559;
        ij.uki[302] = -482677967;
        ij.uki[303] = 1729148234;
        ij.uki[304] = -1921921390;
        ij.uki[305] = -1344599983;
        ij.uki[306] = -485591714;
        ij.uki[307] = 675996321;
        ij.uki[308] = -1444880478;
        ij.uki[309] = -2016050074;
        ij.uki[310] = 726597155;
        ij.uki[311] = 685023160;
        ij.uki[312] = 1002120899;
        ij.uki[313] = 1726965994;
        ij.uki[314] = 2077354416;
        ij.uki[315] = 367083265;
        ij.uki[316] = 1608916916;
        ij.uki[317] = 1400209572;
        ij.uki[318] = 1153303641;
        ij.uki[319] = -974180604;
        ij.uki[320] = -728476988;
        ij.uki[321] = -1416368239;
        ij.uki[322] = 1927920245;
        ij.uki[323] = 558669426;
        ij.uki[324] = -1080481457;
        ij.uki[325] = 1235633947;
        ij.uki[326] = -1878365559;
        ij.uki[327] = 1262079354;
        ij.uki[328] = -662239609;
        ij.uki[329] = 1241000331;
        ij.uki[330] = 1334064550;
        ij.uki[331] = 533635162;
        ij.uki[332] = -1114658697;
        ij.uki[333] = -1389875013;
        ij.uki[334] = 1404826127;
        ij.uki[335] = -1089583304;
        ij.uki[336] = 1662719301;
        ij.uki[337] = 658902030;
        ij.uki[338] = -1581046754;
        ij.uki[339] = 2028801842;
        ij.uki[340] = -494298953;
        ij.uki[341] = -1612707420;
        ij.uki[342] = -464510617;
        ij.uki[343] = -575033166;
        ij.uki[344] = 551130616;
        ij.uki[345] = 2042855114;
        ij.uki[346] = -1183661539;
        ij.uki[347] = 1805430535;
        ij.uki[348] = -1842204262;
        ij.uki[349] = -1653161040;
        ij.uki[350] = -493337420;
        ij.uki[351] = -1846174415;
        ij.uki[352] = -1075832866;
        ij.uki[353] = 1588246109;
        ij.uki[354] = 1115113416;
        ij.uki[355] = -410559493;
        ij.uki[356] = -1419648205;
        ij.uki[357] = -968034074;
        ij.uki[358] = 984022589;
        ij.uki[359] = 635544911;
        ij.uki[360] = -151656708;
        ij.uki[361] = 532897501;
        ij.uki[362] = -1322057306;
        ij.uki[363] = 75987141;
        ij.uki[364] = 720593558;
        ij.uki[365] = 594296328;
        ij.uki[366] = -273717526;
        ij.uki[367] = 2117549436;
        ij.uki[368] = 190144665;
        ij.uki[369] = -234449325;
        ij.uki[370] = -1352206044;
        ij.uki[371] = -1951224531;
        ij.uki[372] = -897726884;
        ij.uki[373] = 1857150077;
        ij.uki[374] = -778348610;
        ij.uki[375] = 144438020;
        ij.uki[376] = -385656283;
        ij.uki[377] = -2109408156;
        ij.uki[378] = -1773530349;
        ij.uki[379] = -335729496;
        ij.uki[380] = 675894131;
        ij.uki[381] = -1778462039;
        ij.uki[382] = -1472043061;
        ij.uki[383] = 2099024255;
        ij.uki[384] = -201986465;
        ij.uki[385] = 1675185289;
        ij.uki[386] = -1410923752;
        ij.uki[387] = 1168167056;
        ij.uki[388] = -1986516056;
        ij.uki[389] = -1970441837;
        ij.uki[390] = 1391638434;
        ij.uki[391] = 632851438;
        ij.uki[392] = 749952464;
        ij.uki[393] = -1648687760;
        ij.uki[394] = -491662299;
        ij.uki[395] = -1411714810;
        ij.uki[396] = 1187035771;
        ij.uki[397] = -1533949226;
        ij.uki[398] = -1042683886;
        ij.uki[399] = 744608290;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public class_243 randomValue() {
        Object object = bf;
        boolean bl2 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ij.ukj("vkm", urt(int ), (int)184);
            }
            switch ((int)object) {
                case -1976799909: {
                    break block9;
                }
                case 680219468: {
                    callSite = ij.ukj("vkp", urt(int ), (int)185);
                    continue block9;
                }
                case 1903649236: {
                    callSite = ij.ukj("vkq", urt(int ), (int)186);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = bf - ij.ukj("vks", urt(int ), (int)187)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ij.ukj("vku", ukg(int ), (int)476)) break;
            object2 = ij.ukj("vkw", ukg(int ), (int)477);
        }
        int n2 = b;
        Object object3 = bf;
        block11: while (true) {
            switch ((int)object3) {
                case -1976799909: {
                    break block11;
                }
                case 297672480: {
                    object3 = ij.ukj("vld", urt(int ), (int)189) - ij.ukj("vkz", urt(int ), (int)188);
                    continue block11;
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
            long l3;
            Object object4;
            if ((object4 = (l3 = bf - ij.ukj("vlh", urt(int ), (int)190)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == ij.ukj("vlk", ukg(int ), (int)478)) {
                return class_243.field_1353;
            }
            object4 = ij.ukj("vln", ukg(int ), (int)479);
        }
    }
}

