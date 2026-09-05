/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3545
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3545;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.cu;
import ruhack.phobia.cv;
import ruhack.phobia.d;
import ruhack.phobia.da;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.fr;
import ruhack.phobia.hk;
import ruhack.phobia.hl;
import ruhack.phobia.hv$AttackPerpetratorConfigurable;
import ruhack.phobia.hx;
import ruhack.phobia.ia;
import ruhack.phobia.ib;
import ruhack.phobia.ic;
import ruhack.phobia.id;
import ruhack.phobia.ie;
import ruhack.phobia.if;
import ruhack.phobia.ii;
import ruhack.phobia.ij;
import ruhack.phobia.ik;
import ruhack.phobia.ik$EntityFilter;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.ov$VecRotation;
import ruhack.phobia.ow;
import ruhack.phobia.ox;

public class hn
extends ds {
    public static final boolean c;
    public final kg legitAimSpeed;
    private boolean skyCoreCanCrit;
    class_1309 lastTarget;
    public final kf clickType;
    public final kg cpsValue;
    public final ke targetType;
    public final kb rwWallBypass;
    public static final boolean a;
    public final kf movementCorrection;
    public final kb legitPitch;
    id funtimeTestSmooth;
    public static final int b;
    public final kb legitMiss;
    public final kf aimType;
    static final long fz = -5240892405941211079L;
    private final kg lookrange;
    public final kf damageSphere;
    public final kb maximumDamage;
    ie holyworldSmooth;
    ii spookyTimeSmooth;
    ik targetSelector;
    ib funTimeRotation;
    private static long[] cjzh;
    private boolean legitDirectActive;
    public final kf sprintMode;
    private static long[] cjzg;
    public final kg maceMinFall;
    public final kb maceReturnSlot;
    public final ke options;
    ox pointFinder;
    ij testSmooth;
    private static int[] cjzo;
    ic funtime222Smooth;
    public final kb tpsSync;
    public final kb autoMace;
    public final kg attackRange;
    private static int[] cjzn;
    class_1309 target;
    if legitSmooth;
    ia divineSmooth;
    public final kb smartCriticals;

    static {
        cjzn = new int[1477];
        cjzo = new int[1477];
        hn.cqro();
        hn.cqru();
        hn.cqry();
        hn.cqsb();
        hn.cqsg();
        hn.cqsl();
        hn.cqsm();
        hn.cqsq();
        hn.cqsu();
        hn.cqsy();
        hn.cqtd();
        hn.cqtg();
        hn.cqtl();
        hn.cqto();
        hn.cqts();
        hn.cqtz();
        hn.cque();
        hn.cquk();
        hn.cqup();
        hn.cquu();
        hn.cquy();
        hn.cqvd();
        hn.cqvh();
        hn.cqvm();
        hn.cqvr();
        hn.cqvw();
        hn.cqwb();
        hn.cqwd();
        hn.cqwe();
        hn.cqwf();
        cjzg = new long[840];
        cjzh = new long[840];
        hn.cqwm();
        hn.cqwx();
        hn.cqxb();
        hn.cqxc();
        hn.cqxj();
        hn.cqxr();
        hn.cqxz();
        hn.cqyg();
        hn.cqyp();
        hn.cqyt();
        hn.cqyz();
        hn.cqzb();
        hn.cqzc();
        hn.cqzd();
        hn.cqze();
        hn.cqzf();
        hn.cqzg();
        hn.cqzi();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDamageSphereEquipped() {
        block54: {
            block53: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("ckgw", cjzf(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hn.cjzi("ckgx", cjzm(int ), (int)67)) break;
                    v0 /* !! */  = (long)hn.cjzi("ckgy", cjzm(int ), (int)68);
                }
                var3_1 = hn.c;
                v1 /* !! */  = hn.fz;
                if (true) ** GOTO lbl11
                block34: while (true) {
                    v1 /* !! */  = (long)(hn.cjzi("ckhb", cjzf(int ), (int)13) - hn.cjzi("ckgz", cjzf(int ), (int)12));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -841682887: {
                            break block34;
                        }
                        case -829813137: {
                            continue block34;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = hn.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckhd", cjzf(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hn.cjzi("ckhe", cjzm(int ), (int)69)) break;
                    v2 /* !! */  = (long)hn.cjzi("ckhf", cjzm(int ), (int)70);
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
lbl25:
                    // 6 sources

                    return (boolean)hn.cjzi("ckhg", cjzm(int ), (int)71);
                }
                if (var1_3 || var1_3) ** GOTO lbl25
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl32
                block37: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("ckhh", cjzf(int ), (int)15));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block37;
                        }
                        case -13356399: {
                            v4 = hn.cjzi("ckhi", cjzf(int ), (int)16);
                            continue block37;
                        }
                        case 250292316: {
                            v4 = hn.cjzi("ckhj", cjzf(int ), (int)17);
                            continue block37;
                        }
                        case 1719375521: {
                            v4 = hn.cjzi("ckhk", cjzf(int ), (int)18);
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("ckhl", cjzf(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("ckhn", cjzm(int ), (int)72)) break;
                    v5 /* !! */  = (long)hn.cjzi("ckhp", cjzm(int ), (int)73);
                }
                if (!this.maximumDamage.isValue()) break block53;
                if (var1_3) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("ckhr", cjzf(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hn.cjzi("ckhs", cjzm(int ), (int)74)) break;
                    v6 /* !! */  = (long)hn.cjzi("ckhu", cjzm(int ), (int)75);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("ckhw", cjzf(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("ckhy", cjzm(int ), (int)76)) break;
                    v7 /* !! */  = (long)hn.cjzi("ckia", cjzm(int ), (int)77);
                }
                if (hn.mc.field_1724 != null) break block54;
                if (var1_3) ** GOTO lbl25
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            return (boolean)hn.cjzi("ckib", cjzm(int ), (int)78);
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v8 /* !! */  = hn.fz;
                if (true) ** GOTO lbl77
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - hn.cjzi("ckid", cjzf(int ), (int)22));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -841682887: {
                            break block41;
                        }
                        case 984317131: {
                            v9 = hn.cjzi("ckie", cjzf(int ), (int)23);
                            continue block41;
                        }
                        case 2065452482: {
                            v9 = hn.cjzi("ckif", cjzf(int ), (int)24);
                            continue block41;
                        }
                    }
                    break;
                }
                v10 /* !! */  = hn.fz;
                if (true) ** GOTO lbl90
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - hn.cjzi("ckih", cjzf(int ), (int)25));
lbl90:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -841682887: {
                            break block42;
                        }
                        case 551600247: {
                            v11 = hn.cjzi("ckii", cjzf(int ), (int)26);
                            continue block42;
                        }
                        case 1248455538: {
                            v11 = hn.cjzi("ckij", cjzf(int ), (int)27);
                            continue block42;
                        }
                    }
                    break;
                }
                v12 = hn.mc.field_1724;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("ckik", cjzf(int ), (int)28)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hn.cjzi("ckil", cjzm(int ), (int)79)) break;
                    v13 /* !! */  = (long)hn.cjzi("ckim", cjzm(int ), (int)80);
                }
                v14 = v12.method_6079();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("ckin", cjzf(int ), (int)29)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hn.cjzi("ckio", cjzm(int ), (int)81)) break;
                    v15 /* !! */  = (long)hn.cjzi("ckip", cjzm(int ), (int)82);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("ckir", cjzf(int ), (int)30)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hn.cjzi("ckis", cjzm(int ), (int)83)) break;
                    v16 /* !! */  = (long)hn.cjzi("ckiu", cjzm(int ), (int)84);
                }
                v17 = this.damageSphere.getValue();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_8 = hn.fz - hn.cjzi("ckiw", cjzf(int ), (int)31)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hn.cjzi("ckix", cjzm(int ), (int)85)) break;
                    v18 /* !! */  = (long)hn.cjzi("ckiz", cjzm(int ), (int)86);
                }
                return this.matchesArtifact(v14, v17);
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("ckja", cjzm(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjb", cjzm(int ), (int)88);
                if (!var3_1) break;
                throw null;
            }
lbl132:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjc", cjzm(int ), (int)89);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 3: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjd", cjzm(int ), (int)90);
                if (!var3_1) break;
                throw null;
            }
lbl141:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("ckjf", cjzm(int ), (int)91);
                    if (!var3_1) ** GOTO lbl132
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjg", cjzm(int ), (int)92);
                if (!var3_1) break;
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjh", cjzm(int ), (int)93);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hn.cjzi("ckji", cjzm(int ), (int)94);
                if (var3_1) {
                    throw null;
                }
            }
            case 8: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjj", cjzm(int ), (int)95);
                if (!var3_1) break;
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hn.cjzi("ckjl", cjzm(int ), (int)96);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("ckjm", cjzm(int ), (int)97);
        ** while (!var3_1)
lbl169:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqro() {
        hn.cjzn[0] = 177569813;
        hn.cjzn[1] = -456842256;
        hn.cjzn[2] = 1834230572;
        hn.cjzn[3] = 1288358333;
        hn.cjzn[4] = -1137395363;
        hn.cjzn[5] = -1601206443;
        hn.cjzn[6] = 212378996;
        hn.cjzn[7] = 1391938929;
        hn.cjzn[8] = -940292899;
        hn.cjzn[9] = 1566705715;
        hn.cjzn[10] = -769940934;
        hn.cjzn[11] = 1961537596;
        hn.cjzn[12] = -1213423208;
        hn.cjzn[13] = 1651182359;
        hn.cjzn[14] = -1215501164;
        hn.cjzn[15] = -1152797543;
        hn.cjzn[16] = 886406995;
        hn.cjzn[17] = 499724418;
        hn.cjzn[18] = -1831806919;
        hn.cjzn[19] = -1436417155;
        hn.cjzn[20] = -1683099712;
        hn.cjzn[21] = 1157113247;
        hn.cjzn[22] = 1460802272;
        hn.cjzn[23] = -503609389;
        hn.cjzn[24] = -353381907;
        hn.cjzn[25] = 1526176935;
        hn.cjzn[26] = -1600176431;
        hn.cjzn[27] = -2111972154;
        hn.cjzn[28] = 1039794433;
        hn.cjzn[29] = -453056635;
        hn.cjzn[30] = -1983700297;
        hn.cjzn[31] = 1664766052;
        hn.cjzn[32] = 233454117;
        hn.cjzn[33] = 817698976;
        hn.cjzn[34] = 1428128444;
        hn.cjzn[35] = 670960869;
        hn.cjzn[36] = -2097484378;
        hn.cjzn[37] = -2084581742;
        hn.cjzn[38] = 770963166;
        hn.cjzn[39] = -823471547;
        hn.cjzn[40] = -1937739785;
        hn.cjzn[41] = -893842343;
        hn.cjzn[42] = 112939596;
        hn.cjzn[43] = -713357184;
        hn.cjzn[44] = 769932314;
        hn.cjzn[45] = 1105118762;
        hn.cjzn[46] = 274690183;
        hn.cjzn[47] = 929459705;
        hn.cjzn[48] = 1449410573;
        hn.cjzn[49] = -1081802053;
        hn.cjzn[50] = -1138983971;
        hn.cjzn[51] = 919397690;
        hn.cjzn[52] = 1787257381;
        hn.cjzn[53] = -1153583209;
        hn.cjzn[54] = -1928724701;
        hn.cjzn[55] = 1684089011;
        hn.cjzn[56] = -543705357;
        hn.cjzn[57] = 735560635;
        hn.cjzn[58] = 1053908057;
        hn.cjzn[59] = -666540767;
        hn.cjzn[60] = 75897179;
        hn.cjzn[61] = 1768467282;
        hn.cjzn[62] = -495029003;
        hn.cjzn[63] = 1458045192;
        hn.cjzn[64] = -1180558619;
        hn.cjzn[65] = 1965226974;
        hn.cjzn[66] = -204431932;
        hn.cjzn[67] = -1215658108;
        hn.cjzn[68] = 1132649790;
        hn.cjzn[69] = -202966559;
        hn.cjzn[70] = 1354336791;
        hn.cjzn[71] = -308457985;
        hn.cjzn[72] = 1741737627;
        hn.cjzn[73] = -526002948;
        hn.cjzn[74] = -137585398;
        hn.cjzn[75] = -1720287504;
        hn.cjzn[76] = 470101081;
        hn.cjzn[77] = -1511199200;
        hn.cjzn[78] = -2054624137;
        hn.cjzn[79] = 665239625;
        hn.cjzn[80] = 1334845664;
        hn.cjzn[81] = -91841872;
        hn.cjzn[82] = 2008766075;
        hn.cjzn[83] = -642934064;
        hn.cjzn[84] = -1666129107;
        hn.cjzn[85] = 2030290355;
        hn.cjzn[86] = 1346695086;
        hn.cjzn[87] = -1610608905;
        hn.cjzn[88] = -1822623170;
        hn.cjzn[89] = 623635085;
        hn.cjzn[90] = 1202841367;
        hn.cjzn[91] = 733721794;
        hn.cjzn[92] = -88481252;
        hn.cjzn[93] = 1874417424;
        hn.cjzn[94] = 1388178880;
        hn.cjzn[95] = -1802430079;
        hn.cjzn[96] = -1541029936;
        hn.cjzn[97] = 1906721887;
        hn.cjzn[98] = 782575229;
        hn.cjzn[99] = 354897021;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isLegitDirectActive() {
        boolean bl2;
        Object object = fz;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hn.cjzi("cpfb", cjzf(int ), (int)530);
            }
            switch ((int)object) {
                case -841682887: {
                    break block11;
                }
                case -833801694: {
                    callSite = hn.cjzi("cpfc", cjzf(int ), (int)531);
                    continue block11;
                }
                case 874560785: {
                    callSite = hn.cjzi("cpfd", cjzf(int ), (int)532);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = fz - hn.cjzi("cpfe", cjzf(int ), (int)533)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hn.cjzi("cpff", cjzm(int ), (int)1202)) break;
            object2 = hn.cjzi("cpfg", cjzm(int ), (int)1203);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = fz - hn.cjzi("cpfh", cjzf(int ), (int)534)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hn.cjzi("cpfi", cjzm(int ), (int)1204)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hn.cjzi("cpfj", cjzm(int ), (int)1205);
        }
        if (bl2) return (boolean)hn.cjzi("cpfk", cjzm(int ), (int)1206);
        if (bl2) return (boolean)hn.cjzi("cpfk", cjzm(int ), (int)1206);
        Object object4 = fz;
        boolean bl5 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - hn.cjzi("cpfl", cjzf(int ), (int)535);
            }
            switch ((int)object4) {
                case -841682887: {
                    return this.legitDirectActive;
                }
                case -406040069: {
                    callSite = hn.cjzi("cpfm", cjzf(int ), (int)536);
                    continue block14;
                }
                case 674994414: {
                    callSite = hn.cjzi("cpfn", cjzf(int ), (int)537);
                    continue block14;
                }
                case 1833192587: {
                    callSite = hn.cjzi("cpfo", cjzf(int ), (int)538);
                    continue block14;
                }
            }
            break;
        }
        return this.legitDirectActive;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getLegitMiss() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(hn.cjzi("cpht", cjzf(int ), (int)565) - hn.cjzi("cphs", cjzf(int ), (int)564));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block15;
                }
                case 1484130347: {
                    continue block15;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cphu", cjzf(int ), (int)566)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cphv", cjzm(int ), (int)1237)) break;
            v1 /* !! */  = (long)hn.cjzi("cphw", cjzm(int ), (int)1238);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cphx", cjzf(int ), (int)567)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cphy", cjzm(int ), (int)1239)) break;
            v2 /* !! */  = (long)hn.cjzi("cphz", cjzm(int ), (int)1240);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("cpia", cjzf(int ), (int)568));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block19;
                        }
                        case -725033651: {
                            v4 = hn.cjzi("cpib", cjzf(int ), (int)569);
                            continue block19;
                        }
                        case 235577019: {
                            v4 = hn.cjzi("cpic", cjzf(int ), (int)570);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.legitMiss;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpid", cjzm(int ), (int)1241);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpie", cjzm(int ), (int)1242);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpif", cjzm(int ), (int)1243);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpig", cjzm(int ), (int)1244);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cqsq() {
        hn.cjzn[700] = 2115667792;
        hn.cjzn[701] = -1623935809;
        hn.cjzn[702] = 1838362045;
        hn.cjzn[703] = -117073026;
        hn.cjzn[704] = 2074549929;
        hn.cjzn[705] = -1593231702;
        hn.cjzn[706] = 1304502110;
        hn.cjzn[707] = -631069285;
        hn.cjzn[708] = 1787246520;
        hn.cjzn[709] = 120792524;
        hn.cjzn[710] = -1678356418;
        hn.cjzn[711] = -1395715018;
        hn.cjzn[712] = -2020365792;
        hn.cjzn[713] = -558446641;
        hn.cjzn[714] = -1109293468;
        hn.cjzn[715] = 2128991244;
        hn.cjzn[716] = 463225737;
        hn.cjzn[717] = -2116824811;
        hn.cjzn[718] = 784912529;
        hn.cjzn[719] = -1528677506;
        hn.cjzn[720] = -2050304589;
        hn.cjzn[721] = -987451246;
        hn.cjzn[722] = -1624231719;
        hn.cjzn[723] = 946192077;
        hn.cjzn[724] = 261727403;
        hn.cjzn[725] = 572903437;
        hn.cjzn[726] = 2111106092;
        hn.cjzn[727] = 1381080453;
        hn.cjzn[728] = 1643861158;
        hn.cjzn[729] = 984320395;
        hn.cjzn[730] = -1795929383;
        hn.cjzn[731] = -1678709081;
        hn.cjzn[732] = 519749873;
        hn.cjzn[733] = -1664690157;
        hn.cjzn[734] = 1067408331;
        hn.cjzn[735] = -1858635074;
        hn.cjzn[736] = -929417211;
        hn.cjzn[737] = -1701163468;
        hn.cjzn[738] = -1248451753;
        hn.cjzn[739] = 1239562794;
        hn.cjzn[740] = 1907256768;
        hn.cjzn[741] = 1441518347;
        hn.cjzn[742] = 1024383743;
        hn.cjzn[743] = -2133665623;
        hn.cjzn[744] = -258608931;
        hn.cjzn[745] = -2127883385;
        hn.cjzn[746] = -300885194;
        hn.cjzn[747] = -1516442778;
        hn.cjzn[748] = 69045236;
        hn.cjzn[749] = -135029426;
        hn.cjzn[750] = -1016299281;
        hn.cjzn[751] = -59606480;
        hn.cjzn[752] = 1739392772;
        hn.cjzn[753] = -1913452556;
        hn.cjzn[754] = 1545250188;
        hn.cjzn[755] = 1302913501;
        hn.cjzn[756] = -979699145;
        hn.cjzn[757] = -826421097;
        hn.cjzn[758] = -1721533508;
        hn.cjzn[759] = -1843703242;
        hn.cjzn[760] = -113399699;
        hn.cjzn[761] = -1264333673;
        hn.cjzn[762] = 198567217;
        hn.cjzn[763] = 1111518488;
        hn.cjzn[764] = -1053157615;
        hn.cjzn[765] = 843011324;
        hn.cjzn[766] = 269850247;
        hn.cjzn[767] = 924633204;
        hn.cjzn[768] = -319696448;
        hn.cjzn[769] = -930574176;
        hn.cjzn[770] = 1444387732;
        hn.cjzn[771] = 781474307;
        hn.cjzn[772] = -117238721;
        hn.cjzn[773] = -337084119;
        hn.cjzn[774] = 1315335057;
        hn.cjzn[775] = -1871051073;
        hn.cjzn[776] = -1314271697;
        hn.cjzn[777] = -1660724056;
        hn.cjzn[778] = 1836292653;
        hn.cjzn[779] = 438787901;
        hn.cjzn[780] = 1468488939;
        hn.cjzn[781] = 1916453662;
        hn.cjzn[782] = -636968262;
        hn.cjzn[783] = 1095179844;
        hn.cjzn[784] = -1373081805;
        hn.cjzn[785] = 1419640954;
        hn.cjzn[786] = -800763970;
        hn.cjzn[787] = -1357450418;
        hn.cjzn[788] = -1072643097;
        hn.cjzn[789] = -1928658681;
        hn.cjzn[790] = -1397447474;
        hn.cjzn[791] = -1012182505;
        hn.cjzn[792] = 1875864634;
        hn.cjzn[793] = -1487128095;
        hn.cjzn[794] = -1230916893;
        hn.cjzn[795] = -735499289;
        hn.cjzn[796] = 722685834;
        hn.cjzn[797] = 708234373;
        hn.cjzn[798] = 14847921;
        hn.cjzn[799] = 2098749981;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getMaceMinFall() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpys", cjzf(int ), (int)666)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpyu", cjzm(int ), (int)1345)) break;
            v0 /* !! */  = (long)hn.cjzi("cpyx", cjzm(int ), (int)1346);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cpyy", cjzf(int ), (int)667));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1240672252: {
                    v2 = hn.cjzi("cpza", cjzf(int ), (int)668);
                    continue block13;
                }
                case -841682887: {
                    break block13;
                }
                case -537663216: {
                    v2 = hn.cjzi("cpzb", cjzf(int ), (int)669);
                    continue block13;
                }
                case 1195848498: {
                    v2 = hn.cjzi("cpzd", cjzf(int ), (int)670);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpzf", cjzf(int ), (int)671)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("cpzg", cjzm(int ), (int)1347)) break;
            v3 /* !! */  = (long)hn.cjzi("cpzi", cjzm(int ), (int)1348);
        }
        var1_3 = hn.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block15;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpzq", cjzf(int ), (int)672)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpzt", cjzm(int ), (int)1349)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpzw", cjzm(int ), (int)1350);
                }
                return this.maceMinFall;
lbl46:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hn.cjzi("cpzy", cjzm(int ), (int)1351);
                    if (!var3_1) break block15;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("cqaa", cjzm(int ), (int)1352);
                        if (!var3_1) ** GOTO lbl46
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)hn.cjzi("cqab", cjzm(int ), (int)1353);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqad", cjzm(int ), (int)1354);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqwx() {
        hn.cjzg[100] = 7957433648877514632L;
        hn.cjzg[101] = 527417311401885052L;
        hn.cjzg[102] = -3262782328643128631L;
        hn.cjzg[103] = -1486921953265025477L;
        hn.cjzg[104] = 1104408523338206120L;
        hn.cjzg[105] = -5396923908017813572L;
        hn.cjzg[106] = -7402671300347443200L;
        hn.cjzg[107] = -1678964747805322396L;
        hn.cjzg[108] = 1114200512413863066L;
        hn.cjzg[109] = 2171363392758795439L;
        hn.cjzg[110] = 7305341562533074922L;
        hn.cjzg[111] = -4881904607341906629L;
        hn.cjzg[112] = 8664154593549093199L;
        hn.cjzg[113] = 7251729304534422291L;
        hn.cjzg[114] = -6899547340895985658L;
        hn.cjzg[115] = -5398029141393989077L;
        hn.cjzg[116] = 1003940458093690343L;
        hn.cjzg[117] = -1993097999957250249L;
        hn.cjzg[118] = 9103636786937190421L;
        hn.cjzg[119] = -5625914474489468417L;
        hn.cjzg[120] = -343502588487930285L;
        hn.cjzg[121] = -3746897441505451524L;
        hn.cjzg[122] = 3635865450483216841L;
        hn.cjzg[123] = -1215914238108044649L;
        hn.cjzg[124] = -6155822113793085769L;
        hn.cjzg[125] = -8528089727226767547L;
        hn.cjzg[126] = 2842411368934702431L;
        hn.cjzg[127] = -6652189107125156666L;
        hn.cjzg[128] = 5538818186234642472L;
        hn.cjzg[129] = -6138074171697793545L;
        hn.cjzg[130] = -709625729038473907L;
        hn.cjzg[131] = 3548926219205937878L;
        hn.cjzg[132] = 8507193866289311876L;
        hn.cjzg[133] = 6959237091719283923L;
        hn.cjzg[134] = 8516667069522742629L;
        hn.cjzg[135] = -2996732163064854927L;
        hn.cjzg[136] = -864032105489696353L;
        hn.cjzg[137] = 8878915861019910438L;
        hn.cjzg[138] = -2135039655223279002L;
        hn.cjzg[139] = 8962309091572909525L;
        hn.cjzg[140] = 5857590453452152638L;
        hn.cjzg[141] = 4583543219480264643L;
        hn.cjzg[142] = -5108054419977914420L;
        hn.cjzg[143] = -9087499902076385620L;
        hn.cjzg[144] = 5864422472436999330L;
        hn.cjzg[145] = 5886444325969738738L;
        hn.cjzg[146] = -4530619047844389595L;
        hn.cjzg[147] = -859612734241837170L;
        hn.cjzg[148] = 2113969798576300457L;
        hn.cjzg[149] = -8964075366670937230L;
        hn.cjzg[150] = -6055062749488985748L;
        hn.cjzg[151] = 1053995058126993144L;
        hn.cjzg[152] = 1179492169505393904L;
        hn.cjzg[153] = -4645866022952410122L;
        hn.cjzg[154] = -6763008834081653485L;
        hn.cjzg[155] = 2769841304968789543L;
        hn.cjzg[156] = -7445933177391692508L;
        hn.cjzg[157] = 3724830452397557294L;
        hn.cjzg[158] = -2938549661320110789L;
        hn.cjzg[159] = 5459035492707561920L;
        hn.cjzg[160] = 2507362780322614072L;
        hn.cjzg[161] = -4592606781343559875L;
        hn.cjzg[162] = 5186923215719665430L;
        hn.cjzg[163] = -1961759374903809626L;
        hn.cjzg[164] = -4373536290314842388L;
        hn.cjzg[165] = 3597707089188348011L;
        hn.cjzg[166] = 2075653947777138791L;
        hn.cjzg[167] = 7078601949936387997L;
        hn.cjzg[168] = 8345626906120930936L;
        hn.cjzg[169] = -8827566127904468454L;
        hn.cjzg[170] = -1743156318342281960L;
        hn.cjzg[171] = -2182796609359142529L;
        hn.cjzg[172] = 797380416975578187L;
        hn.cjzg[173] = 4379364410525175602L;
        hn.cjzg[174] = -279731396445373123L;
        hn.cjzg[175] = -8764463444962277785L;
        hn.cjzg[176] = 3606200773552573324L;
        hn.cjzg[177] = 8366479030384905482L;
        hn.cjzg[178] = -5816422429776984708L;
        hn.cjzg[179] = 3610703527801455522L;
        hn.cjzg[180] = 2851183313484477568L;
        hn.cjzg[181] = -3146462859708389493L;
        hn.cjzg[182] = -7222312189021340051L;
        hn.cjzg[183] = -5245967939252355488L;
        hn.cjzg[184] = -1467194178349633759L;
        hn.cjzg[185] = -1892626286532889486L;
        hn.cjzg[186] = -4341455400580066103L;
        hn.cjzg[187] = 1960092383866588577L;
        hn.cjzg[188] = 185994395413855488L;
        hn.cjzg[189] = -6371725766311835803L;
        hn.cjzg[190] = 7272348062270860399L;
        hn.cjzg[191] = 1407208328749307439L;
        hn.cjzg[192] = -5380105253605854195L;
        hn.cjzg[193] = -3040419470391391333L;
        hn.cjzg[194] = 8878493953624849100L;
        hn.cjzg[195] = -8036121662765561502L;
        hn.cjzg[196] = 3499274206218743562L;
        hn.cjzg[197] = 5051105915148090706L;
        hn.cjzg[198] = -7763942021460798382L;
        hn.cjzg[199] = 769109364459599239L;
    }

    private static /* synthetic */ void cqwd() {
        hn.cjzo[1200] = -1162346784;
        hn.cjzo[1201] = -735612499;
        hn.cjzo[1202] = -1622540008;
        hn.cjzo[1203] = -2112385306;
        hn.cjzo[1204] = -510898208;
        hn.cjzo[1205] = 1505532857;
        hn.cjzo[1206] = 1058021485;
        hn.cjzo[1207] = 680521148;
        hn.cjzo[1208] = -1165072893;
        hn.cjzo[1209] = -899249157;
        hn.cjzo[1210] = 1434729078;
        hn.cjzo[1211] = -1133597900;
        hn.cjzo[1212] = -1601062633;
        hn.cjzo[1213] = -870217570;
        hn.cjzo[1214] = 531126173;
        hn.cjzo[1215] = -1545657099;
        hn.cjzo[1216] = -1696826350;
        hn.cjzo[1217] = -1996974486;
        hn.cjzo[1218] = -725295245;
        hn.cjzo[1219] = -818899870;
        hn.cjzo[1220] = 605754423;
        hn.cjzo[1221] = 79062528;
        hn.cjzo[1222] = 225932155;
        hn.cjzo[1223] = 560416065;
        hn.cjzo[1224] = -108456853;
        hn.cjzo[1225] = 603503163;
        hn.cjzo[1226] = -973659392;
        hn.cjzo[1227] = -1479827251;
        hn.cjzo[1228] = 35017089;
        hn.cjzo[1229] = 1642494729;
        hn.cjzo[1230] = -518189154;
        hn.cjzo[1231] = -1016485401;
        hn.cjzo[1232] = 906613996;
        hn.cjzo[1233] = -2034720596;
        hn.cjzo[1234] = -1057981514;
        hn.cjzo[1235] = -955070670;
        hn.cjzo[1236] = -1624394321;
        hn.cjzo[1237] = 371136126;
        hn.cjzo[1238] = 1235003737;
        hn.cjzo[1239] = -484554881;
        hn.cjzo[1240] = 0x34EE433E;
        hn.cjzo[1241] = -815132631;
        hn.cjzo[1242] = 1672554109;
        hn.cjzo[1243] = -139476767;
        hn.cjzo[1244] = -2060599623;
        hn.cjzo[1245] = 401941266;
        hn.cjzo[1246] = -485774489;
        hn.cjzo[1247] = 1297967651;
        hn.cjzo[1248] = 965274525;
        hn.cjzo[1249] = 1382802217;
        hn.cjzo[1250] = -1767963967;
        hn.cjzo[1251] = -633138849;
        hn.cjzo[1252] = -2088278721;
        hn.cjzo[1253] = 1283042250;
        hn.cjzo[1254] = -83111496;
        hn.cjzo[1255] = 2078923722;
        hn.cjzo[1256] = 1105721704;
        hn.cjzo[1257] = 1254504225;
        hn.cjzo[1258] = 1953269573;
        hn.cjzo[1259] = -90330055;
        hn.cjzo[1260] = -1431239924;
        hn.cjzo[1261] = -476014775;
        hn.cjzo[1262] = 929925102;
        hn.cjzo[1263] = 2141181362;
        hn.cjzo[1264] = 1433786215;
        hn.cjzo[1265] = -1953973844;
        hn.cjzo[1266] = -1917956926;
        hn.cjzo[1267] = 21261422;
        hn.cjzo[1268] = 805360104;
        hn.cjzo[1269] = 1124100447;
        hn.cjzo[1270] = 1431664383;
        hn.cjzo[1271] = -626936741;
        hn.cjzo[1272] = 569296836;
        hn.cjzo[1273] = -1825010317;
        hn.cjzo[1274] = -103017412;
        hn.cjzo[1275] = 9202082;
        hn.cjzo[1276] = 335551873;
        hn.cjzo[1277] = 1537350429;
        hn.cjzo[1278] = -267402188;
        hn.cjzo[1279] = -1530658712;
        hn.cjzo[1280] = -2024003032;
        hn.cjzo[1281] = -1824773260;
        hn.cjzo[1282] = 1712358862;
        hn.cjzo[1283] = -1388772937;
        hn.cjzo[1284] = -1828856489;
        hn.cjzo[1285] = 1347953616;
        hn.cjzo[1286] = 825006030;
        hn.cjzo[1287] = -1640260429;
        hn.cjzo[1288] = -1754512292;
        hn.cjzo[1289] = 1640527433;
        hn.cjzo[1290] = 627813684;
        hn.cjzo[1291] = -298213550;
        hn.cjzo[1292] = 269360280;
        hn.cjzo[1293] = 1326876190;
        hn.cjzo[1294] = 2060124056;
        hn.cjzo[1295] = -1826041757;
        hn.cjzo[1296] = 722252212;
        hn.cjzo[1297] = -521909926;
        hn.cjzo[1298] = -1510125562;
        hn.cjzo[1299] = -1413469863;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getTarget() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(hn.cjzi("cpdg", cjzf(int ), (int)510) - hn.cjzi("cpdf", cjzf(int ), (int)509));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block10;
                }
                case -402365594: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpdh", cjzf(int ), (int)511)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpdi", cjzm(int ), (int)1175)) break;
            v1 /* !! */  = (long)hn.cjzi("cpdj", cjzm(int ), (int)1176);
        }
        var2_2 = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpdk", cjzf(int ), (int)512));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1416601412: {
                    v3 = hn.cjzi("cpdl", cjzf(int ), (int)513);
                    continue block12;
                }
                case -841682887: {
                    break block12;
                }
                case 399651958: {
                    v3 = hn.cjzi("cpdm", cjzf(int ), (int)514);
                    continue block12;
                }
                case 1837982832: {
                    v3 = hn.cjzi("cpdn", cjzf(int ), (int)515);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpdo", cjzf(int ), (int)516)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hn.cjzi("cpdp", cjzm(int ), (int)1177)) break;
            v4 /* !! */  = (long)hn.cjzi("cpdq", cjzm(int ), (int)1178);
        }
        return this.target;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$6() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cqht", cjzf(int ), (int)743));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block33;
                }
                case -131484620: {
                    v1 = hn.cjzi("cqhv", cjzf(int ), (int)744);
                    continue block33;
                }
                case 71380583: {
                    v1 = hn.cjzi("cqhw", cjzf(int ), (int)745);
                    continue block33;
                }
                case 328112080: {
                    v1 = hn.cjzi("cqhx", cjzf(int ), (int)746);
                    continue block33;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("cqia", cjzf(int ), (int)748) - hn.cjzi("cqhz", cjzf(int ), (int)747));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1712194813: {
                    continue block34;
                }
                case -841682887: {
                    break block34;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl32
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cqic", cjzf(int ), (int)749));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -841682887: {
                    break block35;
                }
                case -668197191: {
                    v4 = hn.cjzi("cqid", cjzf(int ), (int)750);
                    continue block35;
                }
                case 754514681: {
                    v4 = hn.cjzi("cqie", cjzf(int ), (int)751);
                    continue block35;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl54
                block37: while (true) {
                    v5 /* !! */  = (long)(v6 - hn.cjzi("cqig", cjzf(int ), (int)752));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1139141542: {
                            v6 = hn.cjzi("cqii", cjzf(int ), (int)753);
                            continue block37;
                        }
                        case -841682887: {
                            break block37;
                        }
                        case -450140584: {
                            v6 = hn.cjzi("cqij", cjzf(int ), (int)754);
                            continue block37;
                        }
                        case 511615223: {
                            v6 = hn.cjzi("cqil", cjzf(int ), (int)755);
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqim", cjzf(int ), (int)756)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("cqio", cjzm(int ), (int)1413)) break;
                    v7 /* !! */  = (long)hn.cjzi("cqip", cjzm(int ), (int)1414);
                }
                v8 = this.clickType.isSelected("1.9+");
                v9 /* !! */  = hn.fz;
                if (true) ** GOTO lbl76
                block39: while (true) {
                    v9 /* !! */  = (long)(v10 - hn.cjzi("cqiq", cjzf(int ), (int)757));
lbl76:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1470314926: {
                            v10 = hn.cjzi("cqis", cjzf(int ), (int)758);
                            continue block39;
                        }
                        case -841682887: {
                            break block39;
                        }
                        case -52683179: {
                            v10 = hn.cjzi("cqit", cjzf(int ), (int)759);
                            continue block39;
                        }
                        case 713474248: {
                            v10 = hn.cjzi("cqiv", cjzf(int ), (int)760);
                            continue block39;
                        }
                    }
                    break;
                }
                return v8;
            }
lbl89:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqiw", cjzm(int ), (int)1415);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cqiy", cjzm(int ), (int)1416);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqiz", cjzm(int ), (int)1417);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqjb", cjzm(int ), (int)1418);
        ** while (!var3_1)
lbl106:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqwb() {
        hn.cjzo[1100] = 1457350612;
        hn.cjzo[1101] = -800803376;
        hn.cjzo[1102] = -285906272;
        hn.cjzo[1103] = 859721398;
        hn.cjzo[1104] = 939228933;
        hn.cjzo[1105] = -813812587;
        hn.cjzo[1106] = -96027765;
        hn.cjzo[1107] = 1867711886;
        hn.cjzo[1108] = 151360870;
        hn.cjzo[1109] = 2061836043;
        hn.cjzo[1110] = -1135391889;
        hn.cjzo[1111] = -394387201;
        hn.cjzo[1112] = -1808446736;
        hn.cjzo[1113] = 1795370086;
        hn.cjzo[1114] = -1521991981;
        hn.cjzo[1115] = -373205034;
        hn.cjzo[1116] = -427391192;
        hn.cjzo[1117] = -467448519;
        hn.cjzo[1118] = 1801926272;
        hn.cjzo[1119] = 100808691;
        hn.cjzo[1120] = 1022022448;
        hn.cjzo[1121] = 1435473479;
        hn.cjzo[1122] = -920773344;
        hn.cjzo[1123] = -197394014;
        hn.cjzo[1124] = 1761978896;
        hn.cjzo[1125] = -1489479320;
        hn.cjzo[1126] = 1700381436;
        hn.cjzo[1127] = -762592670;
        hn.cjzo[1128] = 1295431320;
        hn.cjzo[1129] = 2054870319;
        hn.cjzo[1130] = -2098495409;
        hn.cjzo[1131] = -1754799980;
        hn.cjzo[1132] = 1161499335;
        hn.cjzo[1133] = -47004999;
        hn.cjzo[1134] = 611783787;
        hn.cjzo[1135] = -27854219;
        hn.cjzo[1136] = 227520583;
        hn.cjzo[1137] = -1312742996;
        hn.cjzo[1138] = -1625319437;
        hn.cjzo[1139] = -963781328;
        hn.cjzo[1140] = 74227275;
        hn.cjzo[1141] = -1674246631;
        hn.cjzo[1142] = 2026474603;
        hn.cjzo[1143] = -1259102752;
        hn.cjzo[1144] = -1071910335;
        hn.cjzo[1145] = -1851867424;
        hn.cjzo[1146] = 313840719;
        hn.cjzo[1147] = -953258672;
        hn.cjzo[1148] = 1410731831;
        hn.cjzo[1149] = -1420938721;
        hn.cjzo[1150] = 117433063;
        hn.cjzo[1151] = 934169510;
        hn.cjzo[1152] = 505851179;
        hn.cjzo[1153] = 1513332110;
        hn.cjzo[1154] = 1360616947;
        hn.cjzo[1155] = -261464132;
        hn.cjzo[1156] = 968294334;
        hn.cjzo[1157] = -982441155;
        hn.cjzo[1158] = -961147312;
        hn.cjzo[1159] = -1894280728;
        hn.cjzo[1160] = -713588637;
        hn.cjzo[1161] = -1749259507;
        hn.cjzo[1162] = -53415249;
        hn.cjzo[1163] = -1690067501;
        hn.cjzo[1164] = -1965642709;
        hn.cjzo[1165] = 293892331;
        hn.cjzo[1166] = -194580589;
        hn.cjzo[1167] = 314943194;
        hn.cjzo[1168] = -230337144;
        hn.cjzo[1169] = 110667355;
        hn.cjzo[1170] = -14167949;
        hn.cjzo[1171] = 2112337437;
        hn.cjzo[1172] = 867817876;
        hn.cjzo[1173] = -759496058;
        hn.cjzo[1174] = -276163686;
        hn.cjzo[1175] = -552052219;
        hn.cjzo[1176] = -2049132736;
        hn.cjzo[1177] = -1359159715;
        hn.cjzo[1178] = -634791773;
        hn.cjzo[1179] = 1188826460;
        hn.cjzo[1180] = 1734170058;
        hn.cjzo[1181] = 1900565562;
        hn.cjzo[1182] = 1017668815;
        hn.cjzo[1183] = -865131944;
        hn.cjzo[1184] = -1264043901;
        hn.cjzo[1185] = 383156780;
        hn.cjzo[1186] = 513678927;
        hn.cjzo[1187] = -1325279816;
        hn.cjzo[1188] = -763026472;
        hn.cjzo[1189] = -475559273;
        hn.cjzo[1190] = 1608160066;
        hn.cjzo[1191] = 478989674;
        hn.cjzo[1192] = -903798429;
        hn.cjzo[1193] = -2135139882;
        hn.cjzo[1194] = 1759011492;
        hn.cjzo[1195] = -1826686611;
        hn.cjzo[1196] = -51422756;
        hn.cjzo[1197] = -1544817837;
        hn.cjzo[1198] = -1964745724;
        hn.cjzo[1199] = 1753417089;
    }

    private static /* synthetic */ void cqts() {
        hn.cjzn[1400] = -1323517819;
        hn.cjzn[1401] = 1644953130;
        hn.cjzn[1402] = -820032292;
        hn.cjzn[1403] = 409978490;
        hn.cjzn[1404] = 345180994;
        hn.cjzn[1405] = 1250365727;
        hn.cjzn[1406] = 671185462;
        hn.cjzn[1407] = 1711404087;
        hn.cjzn[1408] = 1800800130;
        hn.cjzn[1409] = -1579150635;
        hn.cjzn[1410] = 954823146;
        hn.cjzn[1411] = -352170263;
        hn.cjzn[1412] = -979847501;
        hn.cjzn[1413] = -809040871;
        hn.cjzn[1414] = 582925469;
        hn.cjzn[1415] = 842154687;
        hn.cjzn[1416] = 1718017058;
        hn.cjzn[1417] = -280464295;
        hn.cjzn[1418] = 688473381;
        hn.cjzn[1419] = -1872671667;
        hn.cjzn[1420] = 1199898980;
        hn.cjzn[1421] = 1809473618;
        hn.cjzn[1422] = -425206189;
        hn.cjzn[1423] = 445358675;
        hn.cjzn[1424] = -2133319763;
        hn.cjzn[1425] = 1819060284;
        hn.cjzn[1426] = 776281036;
        hn.cjzn[1427] = -1099712124;
        hn.cjzn[1428] = -1429938821;
        hn.cjzn[1429] = -1975480233;
        hn.cjzn[1430] = 1261688180;
        hn.cjzn[1431] = 2097544622;
        hn.cjzn[1432] = 1913900524;
        hn.cjzn[1433] = 169507547;
        hn.cjzn[1434] = -746887040;
        hn.cjzn[1435] = -2046761317;
        hn.cjzn[1436] = -346038199;
        hn.cjzn[1437] = 120532858;
        hn.cjzn[1438] = -1784187962;
        hn.cjzn[1439] = -2117809690;
        hn.cjzn[1440] = 875503645;
        hn.cjzn[1441] = 536557734;
        hn.cjzn[1442] = -1687794802;
        hn.cjzn[1443] = 923402853;
        hn.cjzn[1444] = 1986360740;
        hn.cjzn[1445] = -516525121;
        hn.cjzn[1446] = 208033665;
        hn.cjzn[1447] = 1031925239;
        hn.cjzn[1448] = 787177560;
        hn.cjzn[1449] = 969379502;
        hn.cjzn[1450] = -322191349;
        hn.cjzn[1451] = 580604539;
        hn.cjzn[1452] = -616441933;
        hn.cjzn[1453] = -210064305;
        hn.cjzn[1454] = -80132499;
        hn.cjzn[1455] = -1092509230;
        hn.cjzn[1456] = -1355154061;
        hn.cjzn[1457] = 1631354110;
        hn.cjzn[1458] = -397985925;
        hn.cjzn[1459] = 1053227336;
        hn.cjzn[1460] = -384294072;
        hn.cjzn[1461] = 628851460;
        hn.cjzn[1462] = -529522204;
        hn.cjzn[1463] = 645867155;
        hn.cjzn[1464] = -1748107862;
        hn.cjzn[1465] = -77314093;
        hn.cjzn[1466] = 1970802012;
        hn.cjzn[1467] = -1607955570;
        hn.cjzn[1468] = -1556905781;
        hn.cjzn[1469] = 601286968;
        hn.cjzn[1470] = -2035183019;
        hn.cjzn[1471] = -1457593570;
        hn.cjzn[1472] = -2103309535;
        hn.cjzn[1473] = 1903969426;
        hn.cjzn[1474] = 1285141336;
        hn.cjzn[1475] = 1683805928;
        hn.cjzn[1476] = 1847316416;
    }

    private static /* synthetic */ void cqsm() {
        hn.cjzn[600] = -1082777250;
        hn.cjzn[601] = -623252676;
        hn.cjzn[602] = 1628508032;
        hn.cjzn[603] = 741213980;
        hn.cjzn[604] = 1086812101;
        hn.cjzn[605] = -175239080;
        hn.cjzn[606] = -940415241;
        hn.cjzn[607] = -266816459;
        hn.cjzn[608] = -604232638;
        hn.cjzn[609] = 1101306578;
        hn.cjzn[610] = -714528358;
        hn.cjzn[611] = 113242222;
        hn.cjzn[612] = 789237222;
        hn.cjzn[613] = -1576314243;
        hn.cjzn[614] = 1476849791;
        hn.cjzn[615] = 1059807725;
        hn.cjzn[616] = -233369747;
        hn.cjzn[617] = 2097790114;
        hn.cjzn[618] = 2134130882;
        hn.cjzn[619] = 1375583533;
        hn.cjzn[620] = 1269250471;
        hn.cjzn[621] = -1852465274;
        hn.cjzn[622] = 1277535399;
        hn.cjzn[623] = 1534767886;
        hn.cjzn[624] = 626265558;
        hn.cjzn[625] = -897738168;
        hn.cjzn[626] = -2131928241;
        hn.cjzn[627] = 181795711;
        hn.cjzn[628] = -1448340012;
        hn.cjzn[629] = 22329983;
        hn.cjzn[630] = 1475028055;
        hn.cjzn[631] = 1830492952;
        hn.cjzn[632] = 1279215453;
        hn.cjzn[633] = -1853409463;
        hn.cjzn[634] = 1603424794;
        hn.cjzn[635] = 1191251287;
        hn.cjzn[636] = 1177895851;
        hn.cjzn[637] = 1433447727;
        hn.cjzn[638] = -1755813412;
        hn.cjzn[639] = -1039097127;
        hn.cjzn[640] = 2013067443;
        hn.cjzn[641] = 983203173;
        hn.cjzn[642] = -1694087502;
        hn.cjzn[643] = -1947686345;
        hn.cjzn[644] = -1668341414;
        hn.cjzn[645] = 611047678;
        hn.cjzn[646] = -452871435;
        hn.cjzn[647] = -1777254996;
        hn.cjzn[648] = 2011473080;
        hn.cjzn[649] = -544774263;
        hn.cjzn[650] = 271901657;
        hn.cjzn[651] = -713783402;
        hn.cjzn[652] = 2141248084;
        hn.cjzn[653] = -478082536;
        hn.cjzn[654] = -804377775;
        hn.cjzn[655] = -318715126;
        hn.cjzn[656] = 580869584;
        hn.cjzn[657] = -1121248506;
        hn.cjzn[658] = -1351710141;
        hn.cjzn[659] = 1096529180;
        hn.cjzn[660] = 1858545023;
        hn.cjzn[661] = 1439486277;
        hn.cjzn[662] = 1721819289;
        hn.cjzn[663] = -1685374543;
        hn.cjzn[664] = -60043400;
        hn.cjzn[665] = 210348179;
        hn.cjzn[666] = -20023780;
        hn.cjzn[667] = 1140359584;
        hn.cjzn[668] = 2107726874;
        hn.cjzn[669] = -916720431;
        hn.cjzn[670] = -468584247;
        hn.cjzn[671] = 309701601;
        hn.cjzn[672] = 1433781834;
        hn.cjzn[673] = 1115882443;
        hn.cjzn[674] = -410284822;
        hn.cjzn[675] = 188180523;
        hn.cjzn[676] = 575090109;
        hn.cjzn[677] = -1335398332;
        hn.cjzn[678] = 1307427060;
        hn.cjzn[679] = -1069568838;
        hn.cjzn[680] = 379882548;
        hn.cjzn[681] = 385780841;
        hn.cjzn[682] = -1239122829;
        hn.cjzn[683] = 1388776578;
        hn.cjzn[684] = 1888625082;
        hn.cjzn[685] = 954205486;
        hn.cjzn[686] = -1808516467;
        hn.cjzn[687] = -586779811;
        hn.cjzn[688] = -420867302;
        hn.cjzn[689] = -1244715500;
        hn.cjzn[690] = 1870735475;
        hn.cjzn[691] = -1969535215;
        hn.cjzn[692] = -1020990893;
        hn.cjzn[693] = -424977395;
        hn.cjzn[694] = 512947243;
        hn.cjzn[695] = 1088174260;
        hn.cjzn[696] = -899879292;
        hn.cjzn[697] = -1043209676;
        hn.cjzn[698] = 107178601;
        hn.cjzn[699] = -2129313277;
    }

    private static /* synthetic */ void cqsy() {
        hn.cjzn[900] = 645026651;
        hn.cjzn[901] = -2141538230;
        hn.cjzn[902] = -2139235880;
        hn.cjzn[903] = 1687438750;
        hn.cjzn[904] = 966506708;
        hn.cjzn[905] = -1555407069;
        hn.cjzn[906] = -218642139;
        hn.cjzn[907] = 1761061936;
        hn.cjzn[908] = 567443557;
        hn.cjzn[909] = -1309936203;
        hn.cjzn[910] = 935403912;
        hn.cjzn[911] = 1904246855;
        hn.cjzn[912] = 1286549880;
        hn.cjzn[913] = 424888506;
        hn.cjzn[914] = 1495324463;
        hn.cjzn[915] = -1770527259;
        hn.cjzn[916] = -2079456698;
        hn.cjzn[917] = 322911324;
        hn.cjzn[918] = 1964028088;
        hn.cjzn[919] = -931466018;
        hn.cjzn[920] = 1243091413;
        hn.cjzn[921] = -383217083;
        hn.cjzn[922] = 1676891566;
        hn.cjzn[923] = 1638315079;
        hn.cjzn[924] = 805190508;
        hn.cjzn[925] = -1207876058;
        hn.cjzn[926] = 945398742;
        hn.cjzn[927] = 1754090986;
        hn.cjzn[928] = 2082662112;
        hn.cjzn[929] = 2013314479;
        hn.cjzn[930] = 1456012236;
        hn.cjzn[931] = -1732327215;
        hn.cjzn[932] = 1941041179;
        hn.cjzn[933] = -214303744;
        hn.cjzn[934] = -338684423;
        hn.cjzn[935] = 1346119374;
        hn.cjzn[936] = 814644363;
        hn.cjzn[937] = -1879438194;
        hn.cjzn[938] = 1346797520;
        hn.cjzn[939] = 553414564;
        hn.cjzn[940] = 2043142194;
        hn.cjzn[941] = 1011501386;
        hn.cjzn[942] = 1839571749;
        hn.cjzn[943] = 1705028682;
        hn.cjzn[944] = 501500857;
        hn.cjzn[945] = -1793741654;
        hn.cjzn[946] = -184374759;
        hn.cjzn[947] = -2106746929;
        hn.cjzn[948] = -238372022;
        hn.cjzn[949] = 116363296;
        hn.cjzn[950] = 198301243;
        hn.cjzn[951] = 801768938;
        hn.cjzn[952] = 1975048408;
        hn.cjzn[953] = 494698181;
        hn.cjzn[954] = -1022289756;
        hn.cjzn[955] = 300763020;
        hn.cjzn[956] = 2135475188;
        hn.cjzn[957] = -211551074;
        hn.cjzn[958] = -117372749;
        hn.cjzn[959] = 1515786324;
        hn.cjzn[960] = -1621756276;
        hn.cjzn[961] = -1313052582;
        hn.cjzn[962] = 946897863;
        hn.cjzn[963] = 1601085138;
        hn.cjzn[964] = 1003469125;
        hn.cjzn[965] = -218556339;
        hn.cjzn[966] = -1978964967;
        hn.cjzn[967] = 1810644500;
        hn.cjzn[968] = -1615001572;
        hn.cjzn[969] = 1639267655;
        hn.cjzn[970] = 1622276199;
        hn.cjzn[971] = -839066383;
        hn.cjzn[972] = -1501984575;
        hn.cjzn[973] = -1725197498;
        hn.cjzn[974] = -457837605;
        hn.cjzn[975] = -2009196497;
        hn.cjzn[976] = 467625976;
        hn.cjzn[977] = -1036582261;
        hn.cjzn[978] = 661181308;
        hn.cjzn[979] = -1716012419;
        hn.cjzn[980] = -724566132;
        hn.cjzn[981] = 1125179829;
        hn.cjzn[982] = -88841886;
        hn.cjzn[983] = -821039630;
        hn.cjzn[984] = 2088743703;
        hn.cjzn[985] = -748346363;
        hn.cjzn[986] = -922446039;
        hn.cjzn[987] = -79144152;
        hn.cjzn[988] = 1644316509;
        hn.cjzn[989] = 1628638851;
        hn.cjzn[990] = -1863418266;
        hn.cjzn[991] = 520993388;
        hn.cjzn[992] = 456055017;
        hn.cjzn[993] = 1561605784;
        hn.cjzn[994] = -1469777989;
        hn.cjzn[995] = -1449036524;
        hn.cjzn[996] = 1748206257;
        hn.cjzn[997] = 1471983461;
        hn.cjzn[998] = 1105027676;
        hn.cjzn[999] = 68546738;
    }

    private static /* synthetic */ void cqsu() {
        hn.cjzn[800] = -1276909482;
        hn.cjzn[801] = 1787966239;
        hn.cjzn[802] = -495449996;
        hn.cjzn[803] = 1359016037;
        hn.cjzn[804] = -306139243;
        hn.cjzn[805] = -776059615;
        hn.cjzn[806] = -788794769;
        hn.cjzn[807] = -1076109285;
        hn.cjzn[808] = -597885652;
        hn.cjzn[809] = -1873198991;
        hn.cjzn[810] = -1906975847;
        hn.cjzn[811] = -1022943285;
        hn.cjzn[812] = 1716239317;
        hn.cjzn[813] = -1481394118;
        hn.cjzn[814] = 619502055;
        hn.cjzn[815] = -594175000;
        hn.cjzn[816] = 1023941366;
        hn.cjzn[817] = -1158595269;
        hn.cjzn[818] = 967964863;
        hn.cjzn[819] = -860177646;
        hn.cjzn[820] = 1637041769;
        hn.cjzn[821] = 2076632187;
        hn.cjzn[822] = 1597244086;
        hn.cjzn[823] = 1564836497;
        hn.cjzn[824] = 1035949575;
        hn.cjzn[825] = 1335001770;
        hn.cjzn[826] = 1113495428;
        hn.cjzn[827] = -1320603945;
        hn.cjzn[828] = -1431094436;
        hn.cjzn[829] = -413919480;
        hn.cjzn[830] = -638749344;
        hn.cjzn[831] = 1116998516;
        hn.cjzn[832] = -165662928;
        hn.cjzn[833] = -1044788869;
        hn.cjzn[834] = 1372744753;
        hn.cjzn[835] = 264054342;
        hn.cjzn[836] = 1107739402;
        hn.cjzn[837] = -531406432;
        hn.cjzn[838] = 1765792630;
        hn.cjzn[839] = 1958368889;
        hn.cjzn[840] = 1333683170;
        hn.cjzn[841] = 1271045854;
        hn.cjzn[842] = -2062855158;
        hn.cjzn[843] = -395352570;
        hn.cjzn[844] = 720305620;
        hn.cjzn[845] = 540020743;
        hn.cjzn[846] = -415158857;
        hn.cjzn[847] = -738264775;
        hn.cjzn[848] = -84690896;
        hn.cjzn[849] = 899830318;
        hn.cjzn[850] = 1895507316;
        hn.cjzn[851] = -326614831;
        hn.cjzn[852] = -1692861134;
        hn.cjzn[853] = 2035276214;
        hn.cjzn[854] = -904307873;
        hn.cjzn[855] = -988945732;
        hn.cjzn[856] = -803782675;
        hn.cjzn[857] = -2082362763;
        hn.cjzn[858] = 345915030;
        hn.cjzn[859] = 545069433;
        hn.cjzn[860] = -1756416415;
        hn.cjzn[861] = 1461690649;
        hn.cjzn[862] = -1805434664;
        hn.cjzn[863] = 1706578024;
        hn.cjzn[864] = 509835850;
        hn.cjzn[865] = -907726307;
        hn.cjzn[866] = 686121794;
        hn.cjzn[867] = -1141325567;
        hn.cjzn[868] = 1293337898;
        hn.cjzn[869] = 1762579126;
        hn.cjzn[870] = -363512926;
        hn.cjzn[871] = 616959282;
        hn.cjzn[872] = 1468853333;
        hn.cjzn[873] = -1254013924;
        hn.cjzn[874] = 1757576519;
        hn.cjzn[875] = -521534966;
        hn.cjzn[876] = 1392524236;
        hn.cjzn[877] = -972595008;
        hn.cjzn[878] = 1720543431;
        hn.cjzn[879] = 171795118;
        hn.cjzn[880] = 725304674;
        hn.cjzn[881] = 31114824;
        hn.cjzn[882] = 853921378;
        hn.cjzn[883] = 856350689;
        hn.cjzn[884] = 803255306;
        hn.cjzn[885] = -668893645;
        hn.cjzn[886] = -125861813;
        hn.cjzn[887] = -983280279;
        hn.cjzn[888] = -1132414008;
        hn.cjzn[889] = 1895395227;
        hn.cjzn[890] = -212765279;
        hn.cjzn[891] = -1584876191;
        hn.cjzn[892] = -1360804050;
        hn.cjzn[893] = 1304063509;
        hn.cjzn[894] = -1082722743;
        hn.cjzn[895] = 826968942;
        hn.cjzn[896] = 949132543;
        hn.cjzn[897] = 1150576647;
        hn.cjzn[898] = -217841583;
        hn.cjzn[899] = 188888894;
    }

    private static /* synthetic */ void cqyt() {
        hn.cjzh[0] = -8563598056012464036L;
        hn.cjzh[1] = 5129270010602649918L;
        hn.cjzh[2] = -6531028958705361460L;
        hn.cjzh[3] = -4392492063410726775L;
        hn.cjzh[4] = -1892128738902929304L;
        hn.cjzh[5] = 498639349685248891L;
        hn.cjzh[6] = 4431075560427690136L;
        hn.cjzh[7] = -5982585680273796671L;
        hn.cjzh[8] = -2281439825511283104L;
        hn.cjzh[9] = -1705988001865123335L;
        hn.cjzh[10] = 8335974925429766785L;
        hn.cjzh[11] = -8264364583808106651L;
        hn.cjzh[12] = -421839391598987618L;
        hn.cjzh[13] = 2741976921968887279L;
        hn.cjzh[14] = -3115518743757911435L;
        hn.cjzh[15] = -2887805962821050264L;
        hn.cjzh[16] = -4862739298389444203L;
        hn.cjzh[17] = 6987416829919763271L;
        hn.cjzh[18] = 3569576643491296885L;
        hn.cjzh[19] = 112947921071778554L;
        hn.cjzh[20] = 2732133106960678832L;
        hn.cjzh[21] = 8254081057001269870L;
        hn.cjzh[22] = 1157755191263403189L;
        hn.cjzh[23] = 5634463630397297071L;
        hn.cjzh[24] = -5582682993097291223L;
        hn.cjzh[25] = 5765911402257131505L;
        hn.cjzh[26] = -984798083091271629L;
        hn.cjzh[27] = 6751436470802038816L;
        hn.cjzh[28] = 2104379918261625817L;
        hn.cjzh[29] = 3140075228606618367L;
        hn.cjzh[30] = 2344357043944264956L;
        hn.cjzh[31] = 8281476244927543402L;
        hn.cjzh[32] = 796965241150224844L;
        hn.cjzh[33] = -5385250975461964520L;
        hn.cjzh[34] = -1282329479530496735L;
        hn.cjzh[35] = 3162953469718847518L;
        hn.cjzh[36] = 301617378006642063L;
        hn.cjzh[37] = -3333857379799094062L;
        hn.cjzh[38] = -3082214144286017417L;
        hn.cjzh[39] = -3578829632996467792L;
        hn.cjzh[40] = 3806236556093810533L;
        hn.cjzh[41] = 1251087148737975679L;
        hn.cjzh[42] = -628250904222370400L;
        hn.cjzh[43] = -8604467505318614148L;
        hn.cjzh[44] = -485369058090181658L;
        hn.cjzh[45] = 362841534463557833L;
        hn.cjzh[46] = 3379389942060809565L;
        hn.cjzh[47] = 38065347488685903L;
        hn.cjzh[48] = -6987848652732445826L;
        hn.cjzh[49] = 8498055988547020533L;
        hn.cjzh[50] = 1232860478792714522L;
        hn.cjzh[51] = 4869484778802094054L;
        hn.cjzh[52] = 3932811941731768327L;
        hn.cjzh[53] = -5648666531973207287L;
        hn.cjzh[54] = -6451598039783758748L;
        hn.cjzh[55] = -7427806077073810684L;
        hn.cjzh[56] = 7194535074344083604L;
        hn.cjzh[57] = 1642519979781310190L;
        hn.cjzh[58] = 3236107320976397920L;
        hn.cjzh[59] = -9208738021568769326L;
        hn.cjzh[60] = -980539647889676491L;
        hn.cjzh[61] = -798826661795667943L;
        hn.cjzh[62] = 7965785661467923207L;
        hn.cjzh[63] = 3993754943243369576L;
        hn.cjzh[64] = -3868785327714023669L;
        hn.cjzh[65] = 5656329264969434530L;
        hn.cjzh[66] = 8013877490747029001L;
        hn.cjzh[67] = -5795757238316960790L;
        hn.cjzh[68] = 6202125857288810405L;
        hn.cjzh[69] = -9088667303114006181L;
        hn.cjzh[70] = 715721813089056484L;
        hn.cjzh[71] = 4580674617341960749L;
        hn.cjzh[72] = 9140702064994700314L;
        hn.cjzh[73] = 7157555202392692772L;
        hn.cjzh[74] = -7366466892641747498L;
        hn.cjzh[75] = -6061665333544114794L;
        hn.cjzh[76] = 8377304111102852653L;
        hn.cjzh[77] = -3270252976340303893L;
        hn.cjzh[78] = -1392227737322348171L;
        hn.cjzh[79] = -6613677216364144530L;
        hn.cjzh[80] = 4680420509958608803L;
        hn.cjzh[81] = -3000788487931495819L;
        hn.cjzh[82] = -6152854442980380234L;
        hn.cjzh[83] = -8004007623411112030L;
        hn.cjzh[84] = 7696471586475718425L;
        hn.cjzh[85] = 6497121812821430913L;
        hn.cjzh[86] = -6860680640800760632L;
        hn.cjzh[87] = 6802859090138609501L;
        hn.cjzh[88] = 2512506025493295592L;
        hn.cjzh[89] = -5975206596108497393L;
        hn.cjzh[90] = 202971023054328231L;
        hn.cjzh[91] = -7773950317533533154L;
        hn.cjzh[92] = 8106220043592608844L;
        hn.cjzh[93] = 946460315684735067L;
        hn.cjzh[94] = -39776912538910775L;
        hn.cjzh[95] = -213142865856429343L;
        hn.cjzh[96] = -4476094190756093056L;
        hn.cjzh[97] = 1367811233558843128L;
        hn.cjzh[98] = -660762331793824817L;
        hn.cjzh[99] = 7668183617869728241L;
    }

    private static /* synthetic */ void cqsl() {
        hn.cjzn[500] = 1210021174;
        hn.cjzn[501] = -37104275;
        hn.cjzn[502] = 1513706768;
        hn.cjzn[503] = -1720025085;
        hn.cjzn[504] = 1558107671;
        hn.cjzn[505] = -30665849;
        hn.cjzn[506] = -1072079852;
        hn.cjzn[507] = -1863356565;
        hn.cjzn[508] = 1005777099;
        hn.cjzn[509] = 977465235;
        hn.cjzn[510] = -2126991610;
        hn.cjzn[511] = -1359990161;
        hn.cjzn[512] = 2140844885;
        hn.cjzn[513] = -2019967823;
        hn.cjzn[514] = 1628270775;
        hn.cjzn[515] = 1723588865;
        hn.cjzn[516] = 1036443568;
        hn.cjzn[517] = -456476179;
        hn.cjzn[518] = -1537708692;
        hn.cjzn[519] = 1341879171;
        hn.cjzn[520] = 1578397720;
        hn.cjzn[521] = -1966156568;
        hn.cjzn[522] = -1624455954;
        hn.cjzn[523] = -138365794;
        hn.cjzn[524] = -1322439429;
        hn.cjzn[525] = 1017636654;
        hn.cjzn[526] = -1518226160;
        hn.cjzn[527] = 463033414;
        hn.cjzn[528] = -80817761;
        hn.cjzn[529] = 108709768;
        hn.cjzn[530] = -2049820191;
        hn.cjzn[531] = 291821263;
        hn.cjzn[532] = 518375826;
        hn.cjzn[533] = -853844420;
        hn.cjzn[534] = 1600515947;
        hn.cjzn[535] = 923986466;
        hn.cjzn[536] = 479414123;
        hn.cjzn[537] = -1628553687;
        hn.cjzn[538] = -657299773;
        hn.cjzn[539] = 498409244;
        hn.cjzn[540] = -1019616937;
        hn.cjzn[541] = -657947275;
        hn.cjzn[542] = -1320316520;
        hn.cjzn[543] = 69972929;
        hn.cjzn[544] = 1944296400;
        hn.cjzn[545] = -1033322025;
        hn.cjzn[546] = -232557289;
        hn.cjzn[547] = -406788304;
        hn.cjzn[548] = -475218128;
        hn.cjzn[549] = -422525576;
        hn.cjzn[550] = 347338233;
        hn.cjzn[551] = -1399580715;
        hn.cjzn[552] = 688141237;
        hn.cjzn[553] = -900737188;
        hn.cjzn[554] = 2598565;
        hn.cjzn[555] = -580821521;
        hn.cjzn[556] = 1443559593;
        hn.cjzn[557] = -605291750;
        hn.cjzn[558] = -608850684;
        hn.cjzn[559] = 34360357;
        hn.cjzn[560] = 2098760199;
        hn.cjzn[561] = -1478026036;
        hn.cjzn[562] = 1927735578;
        hn.cjzn[563] = -1204725876;
        hn.cjzn[564] = 440114869;
        hn.cjzn[565] = -1838410334;
        hn.cjzn[566] = -1116273345;
        hn.cjzn[567] = -388937216;
        hn.cjzn[568] = 660954932;
        hn.cjzn[569] = -1661691832;
        hn.cjzn[570] = 912665915;
        hn.cjzn[571] = 1649111446;
        hn.cjzn[572] = -683177127;
        hn.cjzn[573] = -335445564;
        hn.cjzn[574] = -1621338752;
        hn.cjzn[575] = 370035062;
        hn.cjzn[576] = 735889816;
        hn.cjzn[577] = 2146749152;
        hn.cjzn[578] = 1072392294;
        hn.cjzn[579] = 622723468;
        hn.cjzn[580] = 1111284404;
        hn.cjzn[581] = 40877171;
        hn.cjzn[582] = 1909735696;
        hn.cjzn[583] = -1131022178;
        hn.cjzn[584] = -922837702;
        hn.cjzn[585] = -1842779322;
        hn.cjzn[586] = -1057688853;
        hn.cjzn[587] = 2073240590;
        hn.cjzn[588] = -2035209511;
        hn.cjzn[589] = -61713455;
        hn.cjzn[590] = 2064091084;
        hn.cjzn[591] = -1141514375;
        hn.cjzn[592] = 1222186841;
        hn.cjzn[593] = 898584713;
        hn.cjzn[594] = 1654044156;
        hn.cjzn[595] = -358884310;
        hn.cjzn[596] = 1136268955;
        hn.cjzn[597] = -1009264174;
        hn.cjzn[598] = -258595617;
        hn.cjzn[599] = 840142483;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cnyj", cjzf(int ), (int)260));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1676799557: {
                    v1 = hn.cjzi("cnyk", cjzf(int ), (int)261);
                    continue block37;
                }
                case -841682887: {
                    break block37;
                }
                case -294380974: {
                    v1 = hn.cjzi("cnyl", cjzf(int ), (int)262);
                    continue block37;
                }
            }
            break;
        }
        var5_2 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block38: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("cnyn", cjzf(int ), (int)264) - hn.cjzi("cnym", cjzf(int ), (int)263));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block38;
                }
                case -469021289: {
                    continue block38;
                }
            }
            break;
        }
        var4_3 /* !! */  = hn.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cnyo", cjzf(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hn.cjzi("cnyp", cjzm(int ), (int)622)) break;
                    v3 /* !! */  = (long)hn.cjzi("cnyq", cjzm(int ), (int)623);
                }
                var3_4 = hn.a;
                if (var5_2) {
                    throw null;
lbl36:
                    // 10 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl36
                if (var1_1 != null) ** GOTO lbl42
                if (var3_4 || var3_4) ** GOTO lbl36
                return;
lbl42:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cnyr", cjzf(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hn.cjzi("cnys", cjzm(int ), (int)624)) break;
                    v4 /* !! */  = (long)hn.cjzi("cnyt", cjzm(int ), (int)625);
                }
                var2_5 = var1_1.getType();
                if (var3_4 || var3_4) ** GOTO lbl36
                if (var2_5 != 0) ** GOTO lbl70
                if (var3_4 || var3_4) ** GOTO lbl36
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl56
                block42: while (true) {
                    v5 /* !! */  = (long)(v6 - hn.cjzi("cnyu", cjzf(int ), (int)267));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1944445626: {
                            v6 = hn.cjzi("cnyv", cjzf(int ), (int)268);
                            continue block42;
                        }
                        case -841682887: {
                            break block42;
                        }
                        case 223732504: {
                            v6 = hn.cjzi("cnyw", cjzf(int ), (int)269);
                            continue block42;
                        }
                    }
                    break;
                }
                this.handlePreRotationUpdate();
                if (var3_4) ** GOTO lbl36
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl80
lbl70:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl36
                if (var2_5 != hn.cjzi("cnyx", cjzm(int ), (int)626)) ** GOTO lbl80
                if (var3_4 || var3_4) ** GOTO lbl36
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cnyy", cjzf(int ), (int)270)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("cnyz", cjzm(int ), (int)627)) break;
                    v7 /* !! */  = (long)hn.cjzi("cnza", cjzm(int ), (int)628);
                }
                this.handlePostRotationUpdate();
                if (var3_4) ** GOTO lbl36
lbl80:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl83:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzb", cjzm(int ), (int)629);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl88:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzc", cjzm(int ), (int)630);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzd", cjzm(int ), (int)631);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 3: {
                var4_3 /* !! */  = (int)hn.cjzi("cnze", cjzm(int ), (int)632);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 4: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzf", cjzm(int ), (int)633);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 5: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzg", cjzm(int ), (int)634);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl113:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzh", cjzm(int ), (int)635);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl118:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzi", cjzm(int ), (int)636);
                if (!var5_2) ** GOTO lbl83
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzj", cjzm(int ), (int)637);
                if (var5_2) {
                    throw null;
                }
            }
            case 9: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzk", cjzm(int ), (int)638);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 10: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzl", cjzm(int ), (int)639);
                if (!var5_2) ** GOTO lbl113
                throw null;
            }
lbl135:
            // 3 sources

            case 11: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzm", cjzm(int ), (int)640);
                if (!var5_2) ** GOTO lbl113
                throw null;
            }
lbl139:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzn", cjzm(int ), (int)641);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 13: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzo", cjzm(int ), (int)642);
                if (var5_2) {
                    throw null;
                }
            }
lbl148:
            // 4 sources

            case 14: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzp", cjzm(int ), (int)643);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzq", cjzm(int ), (int)644);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl157:
            // 5 sources

            case 16: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzr", cjzm(int ), (int)645);
                if (!var5_2) ** GOTO lbl118
                throw null;
            }
lbl161:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hn.cjzi("cnzs", cjzm(int ), (int)646);
                    if (!var5_2) ** GOTO lbl157
                    throw null;
                }
            }
lbl166:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzt", cjzm(int ), (int)647);
                if (!var5_2) ** GOTO lbl148
                throw null;
            }
lbl170:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)hn.cjzi("cnzu", cjzm(int ), (int)648);
                if (!var5_2) ** GOTO lbl161
                throw null;
            }
            case 20: 
        }
        var4_3 /* !! */  = (int)hn.cjzi("cnzv", cjzm(int ), (int)649);
        ** while (!var5_2)
lbl177:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isLegitMissInProgress() {
        block57: {
            block58: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("comu", cjzf(int ), (int)356)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hn.cjzi("comv", cjzm(int ), (int)901)) break;
                    v0 /* !! */  = (long)hn.cjzi("comw", cjzm(int ), (int)902);
                }
                var3_1 = hn.c;
                v1 /* !! */  = hn.fz;
                block37: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case -841682887: {
                            break block37;
                        }
                        case -385274038: {
                            v1 /* !! */  = (long)(hn.cjzi("comy", cjzf(int ), (int)358) - hn.cjzi("comx", cjzf(int ), (int)357));
                            continue block37;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = hn.b;
                v2 /* !! */  = hn.fz;
                block38: while (true) {
                    switch ((int)v2 /* !! */ ) {
                        case -841682887: {
                            break block38;
                        }
                        case 1441354536: {
                            v2 /* !! */  = (long)(hn.cjzi("conna", cjzf(int ), (int)360) - hn.cjzi("comz", cjzf(int ), (int)359));
                            continue block38;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 || var1_3) return (boolean)hn.cjzi("connb", cjzm(int ), (int)903);
                v3 /* !! */  = hn.fz;
                block39: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block39;
                        }
                        case 315385392: {
                            v3 /* !! */  = (long)(hn.cjzi("connd", cjzf(int ), (int)362) - hn.cjzi("connc", cjzf(int ), (int)361));
                            continue block39;
                        }
                    }
                    break;
                }
                if (!this.isState()) ** GOTO lbl79
                if (var1_3) return (boolean)hn.cjzi("connb", cjzm(int ), (int)903);
                v4 /* !! */  = hn.fz;
                block40: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -1511926830: {
                            v4 /* !! */  = (long)(hn.cjzi("connf", cjzf(int ), (int)364) - hn.cjzi("conne", cjzf(int ), (int)363));
                            continue block40;
                        }
                        case -841682887: {
                            break block40;
                        }
                    }
                    break;
                }
                v5 /* !! */  = hn.fz;
                block41: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -841682887: {
                            break block41;
                        }
                        case 1035030926: {
                            v5 /* !! */  = (long)(hn.cjzi("connh", cjzf(int ), (int)366) - hn.cjzi("conng", cjzf(int ), (int)365));
                            continue block41;
                        }
                    }
                    break;
                }
                if (!this.aimType.isSelected("Legit")) ** GOTO lbl79
                if (var1_3) return (boolean)hn.cjzi("connb", cjzm(int ), (int)903);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("conni", cjzf(int ), (int)367)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hn.cjzi("connj", cjzm(int ), (int)904)) break;
                    v6 /* !! */  = (long)hn.cjzi("connk", cjzm(int ), (int)905);
                }
                v7 /* !! */  = hn.fz;
                block43: while (true) {
                    switch ((int)v7 /* !! */ ) {
                        case -841682887: {
                            break block43;
                        }
                        case 417419572: {
                            v7 /* !! */  = (long)(hn.cjzi("connm", cjzf(int ), (int)369) - hn.cjzi("connl", cjzf(int ), (int)368));
                            continue block43;
                        }
                    }
                    break;
                }
                if (!this.legitSmooth.isMissActive()) ** GOTO lbl79
                if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl72:
                // 2 sources

                block44: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var1_3) return (boolean)hn.cjzi("connb", cjzm(int ), (int)903);
                            v8 = hn.cjzi("connn", cjzm(int ), (int)906);
                            if (!var3_1) return (boolean)v8;
                            throw null;
                        }
lbl79:
                        // 3 sources

                        if (var1_3 || var1_3) {
                            return (boolean)hn.cjzi("connb", cjzm(int ), (int)903);
                        }
                        v8 = hn.cjzi("conno", cjzm(int ), (int)907);
                        return (boolean)v8;
                        case 0: {
                            var2_2 /* !! */  = (int)hn.cjzi("connp", cjzm(int ), (int)908);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 1: {
                            ** break;
                        }
                        case 4: {
                            var2_2 /* !! */  = (int)hn.cjzi("connt", cjzm(int ), (int)912);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 3: {
                            var2_2 /* !! */  = (int)hn.cjzi("conns", cjzm(int ), (int)911);
                            cfr_temp_0 = 5;
                            if (!var3_1) continue block44;
                            throw null;
                        }
                        case 8: {
                            var2_2 /* !! */  = (int)hn.cjzi("connx", cjzm(int ), (int)916);
                            cfr_temp_0 = 5;
                            if (!var3_1) continue block44;
                            throw null;
                        }
                        case 9: {
                            break block57;
                        }
lbl105:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)hn.cjzi("connq", cjzm(int ), (int)909);
                            cfr_temp_0 = 2;
                            if (!var3_1) continue block44;
                            throw null;
                        }
                        case 2: {
                            var2_2 /* !! */  = (int)hn.cjzi("connr", cjzm(int ), (int)910);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 6: {
                            var2_2 /* !! */  = (int)hn.cjzi("connv", cjzm(int ), (int)914);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 5: {
                            var2_2 /* !! */  = (int)hn.cjzi("connu", cjzm(int ), (int)913);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 7: 
                    }
                    break;
                }
                break block58;
                ** while (true)
            }
            var2_2 /* !! */  = (int)hn.cjzi("connw", cjzm(int ), (int)915);
            if (!var3_1) ** break;
            throw null;
        }
        var2_2 /* !! */  = (int)hn.cjzi("conny", cjzm(int ), (int)917);
        ** while (!var3_1)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long cjzf(int n2) {
        return cjzg[n2] ^ cjzh[n2];
    }

    private static /* synthetic */ void cqsg() {
        hn.cjzn[400] = 2069994337;
        hn.cjzn[401] = -1147575035;
        hn.cjzn[402] = 920082092;
        hn.cjzn[403] = -1235904188;
        hn.cjzn[404] = 1355509011;
        hn.cjzn[405] = 1462115807;
        hn.cjzn[406] = -1912965325;
        hn.cjzn[407] = 1728175789;
        hn.cjzn[408] = -246985405;
        hn.cjzn[409] = 1153868779;
        hn.cjzn[410] = 587482252;
        hn.cjzn[411] = 2107577914;
        hn.cjzn[412] = -795525908;
        hn.cjzn[413] = 1317834748;
        hn.cjzn[414] = -210108850;
        hn.cjzn[415] = 143267080;
        hn.cjzn[416] = -1697639482;
        hn.cjzn[417] = 742868021;
        hn.cjzn[418] = -858018337;
        hn.cjzn[419] = 34151045;
        hn.cjzn[420] = 58022174;
        hn.cjzn[421] = 830224357;
        hn.cjzn[422] = -1942343772;
        hn.cjzn[423] = 1981090293;
        hn.cjzn[424] = -330313807;
        hn.cjzn[425] = 544409935;
        hn.cjzn[426] = 634106637;
        hn.cjzn[427] = 29007987;
        hn.cjzn[428] = 1201590657;
        hn.cjzn[429] = 50062427;
        hn.cjzn[430] = -1371485290;
        hn.cjzn[431] = 280133684;
        hn.cjzn[432] = -1641293010;
        hn.cjzn[433] = -1911548912;
        hn.cjzn[434] = 574809181;
        hn.cjzn[435] = 1811279839;
        hn.cjzn[436] = -1735791567;
        hn.cjzn[437] = 1687869518;
        hn.cjzn[438] = 1109119925;
        hn.cjzn[439] = 611481029;
        hn.cjzn[440] = -1043439767;
        hn.cjzn[441] = -2079454708;
        hn.cjzn[442] = 674309805;
        hn.cjzn[443] = 207042784;
        hn.cjzn[444] = 985918379;
        hn.cjzn[445] = 1424084490;
        hn.cjzn[446] = -1243979120;
        hn.cjzn[447] = 1760789329;
        hn.cjzn[448] = 937716915;
        hn.cjzn[449] = -444964686;
        hn.cjzn[450] = -1472955386;
        hn.cjzn[451] = 1718589784;
        hn.cjzn[452] = -2110966941;
        hn.cjzn[453] = 114302421;
        hn.cjzn[454] = 1506439762;
        hn.cjzn[455] = 1384825868;
        hn.cjzn[456] = -420942652;
        hn.cjzn[457] = -1772533339;
        hn.cjzn[458] = -1762244308;
        hn.cjzn[459] = 282310703;
        hn.cjzn[460] = -1062766675;
        hn.cjzn[461] = -89563673;
        hn.cjzn[462] = -1990406587;
        hn.cjzn[463] = 176077239;
        hn.cjzn[464] = -1102234993;
        hn.cjzn[465] = -718152292;
        hn.cjzn[466] = 2115626641;
        hn.cjzn[467] = 1347363777;
        hn.cjzn[468] = 2041106645;
        hn.cjzn[469] = -674432984;
        hn.cjzn[470] = 22695368;
        hn.cjzn[471] = -465554271;
        hn.cjzn[472] = 379002717;
        hn.cjzn[473] = -1199933200;
        hn.cjzn[474] = -2072312579;
        hn.cjzn[475] = 1962099855;
        hn.cjzn[476] = 598418777;
        hn.cjzn[477] = 1564200468;
        hn.cjzn[478] = 9821867;
        hn.cjzn[479] = -324547450;
        hn.cjzn[480] = -19914151;
        hn.cjzn[481] = -2054936709;
        hn.cjzn[482] = -102375914;
        hn.cjzn[483] = 1659100285;
        hn.cjzn[484] = -1733173981;
        hn.cjzn[485] = -1434587619;
        hn.cjzn[486] = 400908099;
        hn.cjzn[487] = 2033838523;
        hn.cjzn[488] = 840967855;
        hn.cjzn[489] = -1258493701;
        hn.cjzn[490] = 2066668757;
        hn.cjzn[491] = -1494403709;
        hn.cjzn[492] = -258601554;
        hn.cjzn[493] = 335475533;
        hn.cjzn[494] = -195626596;
        hn.cjzn[495] = 353345867;
        hn.cjzn[496] = 1619048852;
        hn.cjzn[497] = -1271254422;
        hn.cjzn[498] = -1558043951;
        hn.cjzn[499] = -1463102066;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopRotation() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("clbf", cjzf(int ), (int)127));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1717646767: {
                    v1 = hn.cjzi("clbg", cjzf(int ), (int)128);
                    continue block33;
                }
                case -841682887: {
                    break block33;
                }
                case 811473546: {
                    v1 = hn.cjzi("clbi", cjzf(int ), (int)129);
                    continue block33;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("clbk", cjzf(int ), (int)130)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hn.cjzi("clbm", cjzm(int ), (int)411)) break;
            v2 /* !! */  = (long)hn.cjzi("clbo", cjzm(int ), (int)412);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("clbr", cjzf(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hn.cjzi("clbt", cjzm(int ), (int)413)) break;
            v3 /* !! */  = (long)hn.cjzi("clbw", cjzm(int ), (int)414);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl29:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = hn.cjzi("clbz", cjzm(int ), (int)415);
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl40
                block37: while (true) {
                    v5 /* !! */  = (long)(v6 - hn.cjzi("clcc", cjzf(int ), (int)132));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1575841585: {
                            v6 = hn.cjzi("clcf", cjzf(int ), (int)133);
                            continue block37;
                        }
                        case -841682887: {
                            break block37;
                        }
                        case -718109321: {
                            v6 = hn.cjzi("clci", cjzf(int ), (int)134);
                            continue block37;
                        }
                        case -267414834: {
                            v6 = hn.cjzi("clcj", cjzf(int ), (int)135);
                            continue block37;
                        }
                    }
                    break;
                }
                this.legitDirectActive = v4;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("clcm", cjzf(int ), (int)136)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("clco", cjzm(int ), (int)416)) break;
                    v7 /* !! */  = (long)hn.cjzi("clcp", cjzm(int ), (int)417);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("clcr", cjzf(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("clcu", cjzm(int ), (int)418)) break;
                    v8 /* !! */  = (long)hn.cjzi("clcw", cjzm(int ), (int)419);
                }
                if (!this.aimType.isSelected("Holyworld")) ** GOTO lbl81
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("clcy", cjzf(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hn.cjzi("clda", cjzm(int ), (int)420)) break;
                    v9 /* !! */  = (long)hn.cjzi("cldc", cjzm(int ), (int)421);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("cldf", cjzf(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hn.cjzi("cldh", cjzm(int ), (int)422)) break;
                    v10 /* !! */  = (long)hn.cjzi("cldi", cjzm(int ), (int)423);
                }
                ot.INSTANCE.releaseProvider(this);
                if (var1_3) ** GOTO lbl29
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
lbl81:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("cldn", cjzf(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hn.cjzi("cldp", cjzm(int ), (int)424)) break;
                    v11 /* !! */  = (long)hn.cjzi("cldr", cjzm(int ), (int)425);
                }
                v12 /* !! */  = hn.fz;
                if (true) ** GOTO lbl91
                block43: while (true) {
                    v12 /* !! */  = (long)(v13 - hn.cjzi("clds", cjzf(int ), (int)141));
lbl91:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -841682887: {
                            break block43;
                        }
                        case 1121462781: {
                            v13 = hn.cjzi("cldu", cjzf(int ), (int)142);
                            continue block43;
                        }
                        case 2116163631: {
                            v13 = hn.cjzi("cldw", cjzf(int ), (int)143);
                            continue block43;
                        }
                    }
                    break;
                }
                ot.INSTANCE.forceStop();
                if (var1_3) ** GOTO lbl29
lbl102:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cldz", cjzm(int ), (int)426);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cleb", cjzm(int ), (int)427);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("clee", cjzm(int ), (int)428);
                if (var3_1) {
                    throw null;
                }
            }
lbl119:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)hn.cjzi("cleh", cjzm(int ), (int)429);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("clek", cjzm(int ), (int)430);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
lbl130:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("clen", cjzm(int ), (int)431);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hn.cjzi("cleq", cjzm(int ), (int)432);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl140:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hn.cjzi("cles", cjzm(int ), (int)433);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl145:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)hn.cjzi("clev", cjzm(int ), (int)434);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl150:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hn.cjzi("cley", cjzm(int ), (int)435);
                if (!var3_1) break;
                throw null;
            }
lbl154:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hn.cjzi("clfa", cjzm(int ), (int)436);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl158:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hn.cjzi("clfd", cjzm(int ), (int)437);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hn.cjzi("clff", cjzm(int ), (int)438);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
lbl166:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)hn.cjzi("clfh", cjzm(int ), (int)439);
                if (!var3_1) break;
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("clfi", cjzm(int ), (int)440);
        ** while (!var3_1)
lbl173:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void resetSkyCoreCrit() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cntz", cjzf(int ), (int)198));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1216299876: {
                    v1 = hn.cjzi("cnua", cjzf(int ), (int)199);
                    continue block22;
                }
                case -976450175: {
                    v1 = hn.cjzi("cnub", cjzf(int ), (int)200);
                    continue block22;
                }
                case -841682887: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            block37: {
                if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cnuc", cjzf(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != hn.cjzi("cnud", cjzm(int ), (int)570)) break block37;
                var2_2 /* !! */  = hn.b;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)hn.cjzi("cnue", cjzm(int ), (int)571);
        }
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cnuf", cjzf(int ), (int)202));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1761408131: {
                    v4 = hn.cjzi("cnug", cjzf(int ), (int)203);
                    continue block24;
                }
                case -1251329981: {
                    v4 = hn.cjzi("cnuh", cjzf(int ), (int)204);
                    continue block24;
                }
                case -841682887: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3) ** GOTO lbl57
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3) ** GOTO lbl57
                    v5 = hn.cjzi("cnui", cjzm(int ), (int)572);
                    v6 /* !! */  = hn.fz;
                    block26: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -841682887: {
                                break block26;
                            }
                            case 491939093: {
                                v6 /* !! */  = (long)(hn.cjzi("cnuk", cjzf(int ), (int)206) - hn.cjzi("cnuj", cjzf(int ), (int)205));
                                continue block26;
                            }
                        }
                        break;
                    }
                    this.skyCoreCanCrit = v5;
                    if (!var1_3 && !var1_3) ** GOTO lbl58
lbl57:
                    // 3 sources

                    return;
lbl58:
                    // 1 sources

                    return;
                }
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)hn.cjzi("cnul", cjzm(int ), (int)573);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    ** GOTO lbl75
                }
                case 4: {
                    var2_2 /* !! */  = (int)hn.cjzi("cnup", cjzm(int ), (int)577);
                    cfr_temp_0 = 2;
                    if (!var3_1) continue block25;
                    throw null;
                }
                case 5: {
                    var2_2 /* !! */  = (int)hn.cjzi("cnuq", cjzm(int ), (int)578);
                    if (var3_1) {
                        throw null;
                    }
lbl75:
                    // 3 sources

                    var2_2 /* !! */  = (int)hn.cjzi("cnum", cjzm(int ), (int)574);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)hn.cjzi("cnuo", cjzm(int ), (int)576);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cnun", cjzm(int ), (int)575);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int swapDamageSphereForAttack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("ckjs", cjzf(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hn.cjzi("ckjt", cjzm(int ), (int)98)) break;
            v0 /* !! */  = (long)hn.cjzi("ckju", cjzm(int ), (int)99);
        }
        var5_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl11
        block74: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("ckjv", cjzf(int ), (int)33));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -841682887: {
                    break block74;
                }
                case 1636874183: {
                    v2 = hn.cjzi("ckjw", cjzf(int ), (int)34);
                    continue block74;
                }
                case 1777752547: {
                    v2 = hn.cjzi("ckjx", cjzf(int ), (int)35);
                    continue block74;
                }
            }
            break;
        }
        var4_2 /* !! */  = hn.b;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckjy", cjzf(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hn.cjzi("ckjz", cjzm(int ), (int)100)) break;
                    v3 /* !! */  = (long)hn.cjzi("ckka", cjzm(int ), (int)101);
                }
                var3_3 = hn.a;
                if (var5_1) {
                    throw null;
lbl32:
                    // 13 sources

                    return (int)hn.cjzi("ckkb", cjzm(int ), (int)102);
                }
                if (var3_3 || var3_3) ** GOTO lbl32
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl39
                block77: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("ckkc", cjzf(int ), (int)37));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1714167660: {
                            v5 = hn.cjzi("ckkd", cjzf(int ), (int)38);
                            continue block77;
                        }
                        case -841682887: {
                            break block77;
                        }
                        case 272088166: {
                            v5 = hn.cjzi("ckke", cjzf(int ), (int)39);
                            continue block77;
                        }
                        case 1951235774: {
                            v5 = hn.cjzi("ckkf", cjzf(int ), (int)40);
                            continue block77;
                        }
                    }
                    break;
                }
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl55
                block78: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("ckkg", cjzf(int ), (int)41));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1709427277: {
                            v7 = hn.cjzi("ckkh", cjzf(int ), (int)42);
                            continue block78;
                        }
                        case -841682887: {
                            break block78;
                        }
                        case -740241355: {
                            v7 = hn.cjzi("ckki", cjzf(int ), (int)43);
                            continue block78;
                        }
                        case 519879999: {
                            v7 = hn.cjzi("ckkj", cjzf(int ), (int)44);
                            continue block78;
                        }
                    }
                    break;
                }
                if (!this.maximumDamage.isValue()) ** GOTO lbl81
                if (var3_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("ckkk", cjzf(int ), (int)45)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("ckkl", cjzm(int ), (int)103)) break;
                    v8 /* !! */  = (long)hn.cjzi("ckkm", cjzm(int ), (int)104);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("ckkn", cjzf(int ), (int)46)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hn.cjzi("ckko", cjzm(int ), (int)105)) break;
                    v9 /* !! */  = (long)hn.cjzi("ckkp", cjzm(int ), (int)106);
                }
                if (hn.mc.field_1724 != null) ** GOTO lbl83
                if (var3_3) ** GOTO lbl32
lbl81:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                return (int)hn.cjzi("ckkq", cjzm(int ), (int)107);
lbl83:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v10 /* !! */  = hn.fz;
                if (true) ** GOTO lbl88
                block81: while (true) {
                    v10 /* !! */  = (long)(hn.cjzi("ckks", cjzf(int ), (int)48) - hn.cjzi("ckkr", cjzf(int ), (int)47));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -841682887: {
                            break block81;
                        }
                        case 1282542906: {
                            continue block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("ckkt", cjzf(int ), (int)49)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hn.cjzi("ckku", cjzm(int ), (int)108)) break;
                    v11 /* !! */  = (long)hn.cjzi("ckkv", cjzm(int ), (int)109);
                }
                var1_4 = this.damageSphere.getValue();
                if (var3_3 || var3_3) ** GOTO lbl32
                v12 /* !! */  = hn.fz;
                if (true) ** GOTO lbl104
                block83: while (true) {
                    v12 /* !! */  = (long)(v13 - hn.cjzi("ckkw", cjzf(int ), (int)50));
lbl104:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -841682887: {
                            break block83;
                        }
                        case -422330039: {
                            v13 = hn.cjzi("ckkx", cjzf(int ), (int)51);
                            continue block83;
                        }
                        case 298917291: {
                            v13 = hn.cjzi("ckky", cjzf(int ), (int)52);
                            continue block83;
                        }
                        case 763663607: {
                            v13 = hn.cjzi("ckkz", cjzf(int ), (int)53);
                            continue block83;
                        }
                    }
                    break;
                }
                v14 /* !! */  = hn.fz;
                if (true) ** GOTO lbl120
                block84: while (true) {
                    v14 /* !! */  = (long)(v15 - hn.cjzi("ckla", cjzf(int ), (int)54));
lbl120:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1714917840: {
                            v15 = hn.cjzi("cklb", cjzf(int ), (int)55);
                            continue block84;
                        }
                        case -1032634689: {
                            v15 = hn.cjzi("cklc", cjzf(int ), (int)56);
                            continue block84;
                        }
                        case -841682887: {
                            break block84;
                        }
                        case 254936605: {
                            v15 = hn.cjzi("ckld", cjzf(int ), (int)57);
                            continue block84;
                        }
                    }
                    break;
                }
                v16 = hn.mc.field_1724;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("ckle", cjzf(int ), (int)58)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hn.cjzi("cklf", cjzm(int ), (int)110)) break;
                    v17 /* !! */  = (long)hn.cjzi("cklg", cjzm(int ), (int)111);
                }
                v18 = v16.method_6079();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("cklh", cjzf(int ), (int)59)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hn.cjzi("ckli", cjzm(int ), (int)112)) break;
                    v19 /* !! */  = (long)hn.cjzi("cklj", cjzm(int ), (int)113);
                }
                if (!this.matchesArtifact(v18, var1_4)) ** GOTO lbl147
                if (var3_3 || var3_3) ** GOTO lbl32
                return (int)hn.cjzi("cklk", cjzm(int ), (int)114);
lbl147:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v20 /* !! */  = hn.fz;
                if (true) ** GOTO lbl152
                block87: while (true) {
                    v20 /* !! */  = (long)(hn.cjzi("cklm", cjzf(int ), (int)61) - hn.cjzi("ckll", cjzf(int ), (int)60));
lbl152:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1049881713: {
                            continue block87;
                        }
                        case -841682887: {
                            break block87;
                        }
                    }
                    break;
                }
                var2_5 = this.findArtifactScreenSlot(var1_4);
                if (var3_3 || var3_3) ** GOTO lbl32
                if (var2_5 >= 0) ** GOTO lbl162
                if (var3_3 || var3_3) ** GOTO lbl32
                return (int)hn.cjzi("ckln", cjzm(int ), (int)115);
lbl162:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v21 /* !! */  = hn.fz;
                if (true) ** GOTO lbl167
                block88: while (true) {
                    v21 /* !! */  = (long)(v22 - hn.cjzi("cklo", cjzf(int ), (int)62));
lbl167:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1898564738: {
                            v22 = hn.cjzi("cklp", cjzf(int ), (int)63);
                            continue block88;
                        }
                        case -1414262628: {
                            v22 = hn.cjzi("cklq", cjzf(int ), (int)64);
                            continue block88;
                        }
                        case -1283721810: {
                            v22 = hn.cjzi("cklr", cjzf(int ), (int)65);
                            continue block88;
                        }
                        case -841682887: {
                            break block88;
                        }
                    }
                    break;
                }
                nv.dropCursorStack();
                if (var3_3 || var3_3) ** GOTO lbl32
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("ckls", cjzf(int ), (int)66)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hn.cjzi("cklt", cjzm(int ), (int)116)) break;
                    v23 /* !! */  = (long)hn.cjzi("cklu", cjzm(int ), (int)117);
                }
                nv.swapToOffhand(var2_5);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return var2_5;
            }
lbl191:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)hn.cjzi("cklv", cjzm(int ), (int)118);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 1: {
                var4_2 /* !! */  = (int)hn.cjzi("cklw", cjzm(int ), (int)119);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl201:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)hn.cjzi("cklx", cjzm(int ), (int)120);
                if (!var5_1) ** GOTO lbl191
                throw null;
            }
lbl205:
            // 4 sources

            case 3: {
                var4_2 /* !! */  = (int)hn.cjzi("ckly", cjzm(int ), (int)121);
                if (!var5_1) break;
                throw null;
            }
lbl209:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)hn.cjzi("cklz", cjzm(int ), (int)122);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 5: {
                var4_2 /* !! */  = (int)hn.cjzi("ckma", cjzm(int ), (int)123);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl219:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmb", cjzm(int ), (int)124);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 7: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmc", cjzm(int ), (int)125);
                if (!var5_1) ** GOTO lbl201
                throw null;
            }
lbl228:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmd", cjzm(int ), (int)126);
                if (var5_1) {
                    throw null;
                }
            }
lbl232:
            // 4 sources

            case 9: {
                var4_2 /* !! */  = (int)hn.cjzi("ckme", cjzm(int ), (int)127);
                if (!var5_1) ** GOTO lbl219
                throw null;
            }
lbl236:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmf", cjzm(int ), (int)128);
                if (!var5_1) ** GOTO lbl209
                throw null;
            }
lbl240:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmg", cjzm(int ), (int)129);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 12: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmh", cjzm(int ), (int)130);
                if (!var5_1) ** GOTO lbl209
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmi", cjzm(int ), (int)131);
                if (!var5_1) ** GOTO lbl191
                throw null;
            }
lbl253:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmj", cjzm(int ), (int)132);
                if (!var5_1) ** GOTO lbl236
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmk", cjzm(int ), (int)133);
                if (!var5_1) ** GOTO lbl205
                throw null;
            }
lbl261:
            // 4 sources

            case 16: {
                var4_2 /* !! */  = (int)hn.cjzi("ckml", cjzm(int ), (int)134);
                if (!var5_1) ** GOTO lbl228
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmm", cjzm(int ), (int)135);
                if (!var5_1) ** GOTO lbl261
                throw null;
            }
lbl269:
            // 4 sources

            case 18: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmn", cjzm(int ), (int)136);
                if (!var5_1) ** GOTO lbl205
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmo", cjzm(int ), (int)137);
                if (!var5_1) ** GOTO lbl201
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmp", cjzm(int ), (int)138);
                if (!var5_1) ** GOTO lbl228
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmq", cjzm(int ), (int)139);
                if (!var5_1) ** GOTO lbl253
                throw null;
            }
lbl285:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmr", cjzm(int ), (int)140);
                if (!var5_1) ** GOTO lbl236
                throw null;
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hn.cjzi("ckms", cjzm(int ), (int)141);
                    if (!var5_1) ** GOTO lbl285
                    throw null;
                }
            }
lbl294:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmt", cjzm(int ), (int)142);
                if (!var5_1) ** GOTO lbl232
                throw null;
            }
            case 25: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmu", cjzm(int ), (int)143);
                if (!var5_1) ** GOTO lbl205
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)hn.cjzi("ckmv", cjzm(int ), (int)144);
                if (!var5_1) ** GOTO lbl269
                throw null;
            }
            case 27: 
        }
        var4_2 /* !! */  = (int)hn.cjzi("ckmw", cjzm(int ), (int)145);
        ** while (!var5_1)
lbl309:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqxb() {
        hn.cjzg[200] = 1659599610621036413L;
        hn.cjzg[201] = 50858255633757241L;
        hn.cjzg[202] = -9019115194971918643L;
        hn.cjzg[203] = -5111598582589234134L;
        hn.cjzg[204] = -5857636259646478047L;
        hn.cjzg[205] = 8273008999530640358L;
        hn.cjzg[206] = -4466802770891816517L;
        hn.cjzg[207] = 7710341629663975547L;
        hn.cjzg[208] = 3595295634063087627L;
        hn.cjzg[209] = -2865000771538182234L;
        hn.cjzg[210] = 2477296246946853471L;
        hn.cjzg[211] = -5872190805938156536L;
        hn.cjzg[212] = 2941441778118667264L;
        hn.cjzg[213] = 2545182841178308013L;
        hn.cjzg[214] = -7378969665243323242L;
        hn.cjzg[215] = 2048909657814053980L;
        hn.cjzg[216] = 5912685065134415702L;
        hn.cjzg[217] = -594891939625754010L;
        hn.cjzg[218] = 1192798327881093783L;
        hn.cjzg[219] = -6694731926048316570L;
        hn.cjzg[220] = 6325235501866863165L;
        hn.cjzg[221] = -2321723159486866863L;
        hn.cjzg[222] = -2358771113774955703L;
        hn.cjzg[223] = -5055654574769559124L;
        hn.cjzg[224] = 2501390428048893868L;
        hn.cjzg[225] = -3385380940205078824L;
        hn.cjzg[226] = 7873937469578992212L;
        hn.cjzg[227] = 6158477107593117070L;
        hn.cjzg[228] = 1323512287903690465L;
        hn.cjzg[229] = -1289921811736353895L;
        hn.cjzg[230] = 822050354636223223L;
        hn.cjzg[231] = -2869027970289294087L;
        hn.cjzg[232] = -1078556662339823012L;
        hn.cjzg[233] = 905210780202281852L;
        hn.cjzg[234] = 2188631739144683358L;
        hn.cjzg[235] = 1619067958968924314L;
        hn.cjzg[236] = 8504162427028690495L;
        hn.cjzg[237] = -4299318206577478909L;
        hn.cjzg[238] = -1902828360685208321L;
        hn.cjzg[239] = 1199376838757929878L;
        hn.cjzg[240] = 8547929434771843322L;
        hn.cjzg[241] = 3747506817655751292L;
        hn.cjzg[242] = -6524184711044253607L;
        hn.cjzg[243] = 2661923593395631546L;
        hn.cjzg[244] = 1303276072999491024L;
        hn.cjzg[245] = -2590225307357756057L;
        hn.cjzg[246] = -7149159658368965113L;
        hn.cjzg[247] = 5060746776927324862L;
        hn.cjzg[248] = -1991881263643655619L;
        hn.cjzg[249] = -2957433429292181299L;
        hn.cjzg[250] = 7361279602245814597L;
        hn.cjzg[251] = -5543117640448861304L;
        hn.cjzg[252] = 3003527506435127346L;
        hn.cjzg[253] = -3411204275727451492L;
        hn.cjzg[254] = -7504223605062573606L;
        hn.cjzg[255] = -4109578342180775975L;
        hn.cjzg[256] = -23401856241467411L;
        hn.cjzg[257] = -6107890623324416955L;
        hn.cjzg[258] = 636760584140575378L;
        hn.cjzg[259] = 2583469739348090213L;
        hn.cjzg[260] = -7346152327186579066L;
        hn.cjzg[261] = -1054797493155755688L;
        hn.cjzg[262] = -1878085399929801880L;
        hn.cjzg[263] = 3503944167143689868L;
        hn.cjzg[264] = 6637301670021547825L;
        hn.cjzg[265] = 7314881449049407007L;
        hn.cjzg[266] = 4067026189520304260L;
        hn.cjzg[267] = 5127779715581470885L;
        hn.cjzg[268] = 8663125800659651707L;
        hn.cjzg[269] = -3509194081588869997L;
        hn.cjzg[270] = 7503692355873859389L;
        hn.cjzg[271] = 7970894729908093422L;
        hn.cjzg[272] = 3676718947131028200L;
        hn.cjzg[273] = 5758415989435775818L;
        hn.cjzg[274] = -6334008604393189550L;
        hn.cjzg[275] = -7559491593863340539L;
        hn.cjzg[276] = -5536528339956032748L;
        hn.cjzg[277] = -7603637023452004081L;
        hn.cjzg[278] = -5510071085736813873L;
        hn.cjzg[279] = 8533548471426608595L;
        hn.cjzg[280] = -8086501815028390259L;
        hn.cjzg[281] = -2398729425681250282L;
        hn.cjzg[282] = 8818616583541360404L;
        hn.cjzg[283] = 5234225579273363468L;
        hn.cjzg[284] = -3772924079735431528L;
        hn.cjzg[285] = 3554562064645898373L;
        hn.cjzg[286] = -7154873526928386306L;
        hn.cjzg[287] = 4126141175538440510L;
        hn.cjzg[288] = 6318718930210802329L;
        hn.cjzg[289] = -2903847233258743899L;
        hn.cjzg[290] = -8270276578684035241L;
        hn.cjzg[291] = 4473339621543440239L;
        hn.cjzg[292] = -1860953796872753672L;
        hn.cjzg[293] = -1670370444487732689L;
        hn.cjzg[294] = 7042971004460247810L;
        hn.cjzg[295] = -4876953078188918304L;
        hn.cjzg[296] = 5541132301983461778L;
        hn.cjzg[297] = -1705701705783800814L;
        hn.cjzg[298] = 3917358134913378448L;
        hn.cjzg[299] = 2581705291845328836L;
    }

    private static /* synthetic */ void cqvd() {
        hn.cjzo[600] = -1082777250;
        hn.cjzo[601] = -623252676;
        hn.cjzo[602] = 1628508032;
        hn.cjzo[603] = -741213981;
        hn.cjzo[604] = -1963040445;
        hn.cjzo[605] = -175239076;
        hn.cjzo[606] = -940415243;
        hn.cjzo[607] = -266816459;
        hn.cjzo[608] = -604232638;
        hn.cjzo[609] = 1101306580;
        hn.cjzo[610] = -714528358;
        hn.cjzo[611] = 113242209;
        hn.cjzo[612] = 789237221;
        hn.cjzo[613] = -1576314246;
        hn.cjzo[614] = 1476849782;
        hn.cjzo[615] = 1059807716;
        hn.cjzo[616] = -233369751;
        hn.cjzo[617] = 2097790116;
        hn.cjzo[618] = 2134130880;
        hn.cjzo[619] = 1375583534;
        hn.cjzo[620] = 1269250479;
        hn.cjzo[621] = -1852465275;
        hn.cjzo[622] = -1277535400;
        hn.cjzo[623] = -1538231341;
        hn.cjzo[624] = -626265559;
        hn.cjzo[625] = 946582786;
        hn.cjzo[626] = -2131928243;
        hn.cjzo[627] = -181795712;
        hn.cjzo[628] = -1293071377;
        hn.cjzo[629] = 22329973;
        hn.cjzo[630] = 1475028056;
        hn.cjzo[631] = 1830492940;
        hn.cjzo[632] = 1279215452;
        hn.cjzo[633] = -1853409443;
        hn.cjzo[634] = 1603424799;
        hn.cjzo[635] = 1191251293;
        hn.cjzo[636] = 1177895864;
        hn.cjzo[637] = 1433447717;
        hn.cjzo[638] = -1755813409;
        hn.cjzo[639] = -1039097122;
        hn.cjzo[640] = 2013067445;
        hn.cjzo[641] = 983203180;
        hn.cjzo[642] = -1694087491;
        hn.cjzo[643] = -1947686338;
        hn.cjzo[644] = -1668341429;
        hn.cjzo[645] = 611047669;
        hn.cjzo[646] = -452871440;
        hn.cjzo[647] = -1777254980;
        hn.cjzo[648] = 2011473064;
        hn.cjzo[649] = -544774263;
        hn.cjzo[650] = 271901657;
        hn.cjzo[651] = -713783388;
        hn.cjzo[652] = 2141248100;
        hn.cjzo[653] = -478082533;
        hn.cjzo[654] = -804377770;
        hn.cjzo[655] = -318715112;
        hn.cjzo[656] = 580869624;
        hn.cjzo[657] = -1121248467;
        hn.cjzo[658] = -1351710122;
        hn.cjzo[659] = 1096529171;
        hn.cjzo[660] = 1858545008;
        hn.cjzo[661] = 1439486323;
        hn.cjzo[662] = 1721819312;
        hn.cjzo[663] = -1685374549;
        hn.cjzo[664] = -60043424;
        hn.cjzo[665] = 210348213;
        hn.cjzo[666] = -20023760;
        hn.cjzo[667] = 1140359573;
        hn.cjzo[668] = 2107726868;
        hn.cjzo[669] = -916720391;
        hn.cjzo[670] = -468584205;
        hn.cjzo[671] = 309701614;
        hn.cjzo[672] = 1433781770;
        hn.cjzo[673] = 1115882464;
        hn.cjzo[674] = -410284812;
        hn.cjzo[675] = 188180536;
        hn.cjzo[676] = 575090084;
        hn.cjzo[677] = -1335398320;
        hn.cjzo[678] = 1307427046;
        hn.cjzo[679] = -1069568862;
        hn.cjzo[680] = 379882521;
        hn.cjzo[681] = 385780819;
        hn.cjzo[682] = -1239122877;
        hn.cjzo[683] = 1388776587;
        hn.cjzo[684] = 1888625068;
        hn.cjzo[685] = 954205502;
        hn.cjzo[686] = -1808516444;
        hn.cjzo[687] = -586779832;
        hn.cjzo[688] = -420867295;
        hn.cjzo[689] = -1244715499;
        hn.cjzo[690] = 1870735443;
        hn.cjzo[691] = -1969535195;
        hn.cjzo[692] = -1020990869;
        hn.cjzo[693] = -424977363;
        hn.cjzo[694] = 512947230;
        hn.cjzo[695] = 1088174250;
        hn.cjzo[696] = -899879255;
        hn.cjzo[697] = -1043209709;
        hn.cjzo[698] = 107178605;
        hn.cjzo[699] = -2129313250;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getDamageSphere() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cqby", cjzf(int ), (int)690));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2079554596: {
                    v1 = hn.cjzi("cqbz", cjzf(int ), (int)691);
                    continue block28;
                }
                case -841682887: {
                    break block28;
                }
                case 795551019: {
                    v1 = hn.cjzi("cqcb", cjzf(int ), (int)692);
                    continue block28;
                }
                case 1073069880: {
                    v1 = hn.cjzi("cqcd", cjzf(int ), (int)693);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cqce", cjzf(int ), (int)694));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1377708234: {
                    v3 = hn.cjzi("cqcg", cjzf(int ), (int)695);
                    continue block29;
                }
                case -841682887: {
                    break block29;
                }
                case 1415606955: {
                    v3 = hn.cjzi("cqch", cjzf(int ), (int)696);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v4 /* !! */  = hn.fz;
        if (true) ** GOTO lbl36
        block30: while (true) {
            v4 /* !! */  = (long)(v5 - hn.cjzi("cqcj", cjzf(int ), (int)697));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -841682887: {
                    break block30;
                }
                case 528258307: {
                    v5 = hn.cjzi("cqcl", cjzf(int ), (int)698);
                    continue block30;
                }
                case 1579680732: {
                    v5 = hn.cjzi("cqcm", cjzf(int ), (int)699);
                    continue block30;
                }
                case 2046913481: {
                    v5 = hn.cjzi("cqco", cjzf(int ), (int)700);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (!var3_1) ** GOTO lbl55
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl55:
                // 1 sources

                if (var1_3 || var1_3) continue block31;
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl60
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("cqcr", cjzf(int ), (int)701));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2142863425: {
                            v7 = hn.cjzi("cqcs", cjzf(int ), (int)702);
                            continue block32;
                        }
                        case -841682887: {
                            break block32;
                        }
                        case 318018783: {
                            v7 = hn.cjzi("cqcu", cjzf(int ), (int)703);
                            continue block32;
                        }
                    }
                    break;
                }
                return this.damageSphere;
lbl70:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hn.cjzi("cqcv", cjzm(int ), (int)1373);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl80
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("cqcx", cjzm(int ), (int)1374);
                        if (!var3_1) ** GOTO lbl70
                        throw null;
                    }
                }
lbl80:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)hn.cjzi("cqcz", cjzm(int ), (int)1375);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqda", cjzm(int ), (int)1376);
        ** while (!var3_1)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqyg() {
        hn.cjzg[700] = 494761969982682816L;
        hn.cjzg[701] = 2099859332575904824L;
        hn.cjzg[702] = -8001800131555378900L;
        hn.cjzg[703] = -2137720253715210444L;
        hn.cjzg[704] = -7198153358503854633L;
        hn.cjzg[705] = -7632178857460549856L;
        hn.cjzg[706] = -1891413708345840459L;
        hn.cjzg[707] = -2932413413501300839L;
        hn.cjzg[708] = -2053401059951091805L;
        hn.cjzg[709] = 5245819012471638221L;
        hn.cjzg[710] = 2462676882856198511L;
        hn.cjzg[711] = -6424145801552925484L;
        hn.cjzg[712] = 5262972387234508328L;
        hn.cjzg[713] = 5423939538690060087L;
        hn.cjzg[714] = -4585810580997384926L;
        hn.cjzg[715] = -1720169046417152903L;
        hn.cjzg[716] = -954071540573509225L;
        hn.cjzg[717] = 8028809356728248772L;
        hn.cjzg[718] = -7685510663228043780L;
        hn.cjzg[719] = -5621982911010952476L;
        hn.cjzg[720] = 2103540167229205032L;
        hn.cjzg[721] = -7760107721303506817L;
        hn.cjzg[722] = 7217825063092466242L;
        hn.cjzg[723] = -1286527731839816802L;
        hn.cjzg[724] = 790193844734112706L;
        hn.cjzg[725] = -978329957360690409L;
        hn.cjzg[726] = 8405988711618644422L;
        hn.cjzg[727] = -2239707892550543254L;
        hn.cjzg[728] = -5812953944919979080L;
        hn.cjzg[729] = 2895831717814000401L;
        hn.cjzg[730] = -1598797622677388304L;
        hn.cjzg[731] = -7310098135568698113L;
        hn.cjzg[732] = 1633723149655500726L;
        hn.cjzg[733] = -1453272863840628867L;
        hn.cjzg[734] = 7444273047713121855L;
        hn.cjzg[735] = -4732456833176424288L;
        hn.cjzg[736] = -7902607187070130481L;
        hn.cjzg[737] = 7343308214665218071L;
        hn.cjzg[738] = 7523136341322310549L;
        hn.cjzg[739] = -2908914167496846585L;
        hn.cjzg[740] = 7725898066252806894L;
        hn.cjzg[741] = 1954155135767028362L;
        hn.cjzg[742] = -4157159260291037848L;
        hn.cjzg[743] = -4516194781015327825L;
        hn.cjzg[744] = 2663918870490366217L;
        hn.cjzg[745] = 4742326837055279663L;
        hn.cjzg[746] = 9045040213092964475L;
        hn.cjzg[747] = 8532180845697147867L;
        hn.cjzg[748] = -6043620437765713468L;
        hn.cjzg[749] = -2745475451786878153L;
        hn.cjzg[750] = -5915839962996736127L;
        hn.cjzg[751] = -7590381752871737855L;
        hn.cjzg[752] = -2286324721563544528L;
        hn.cjzg[753] = -2023954931470748110L;
        hn.cjzg[754] = 3979266269803955203L;
        hn.cjzg[755] = -5195331913902812175L;
        hn.cjzg[756] = -5069429775609051154L;
        hn.cjzg[757] = -3075340711185724997L;
        hn.cjzg[758] = 7191161886044509742L;
        hn.cjzg[759] = -4467129351831360637L;
        hn.cjzg[760] = 8568946321969447786L;
        hn.cjzg[761] = -2372179191869107398L;
        hn.cjzg[762] = 4216747845859340586L;
        hn.cjzg[763] = 5591737778218899234L;
        hn.cjzg[764] = -2956754109939935384L;
        hn.cjzg[765] = -5760011646035703347L;
        hn.cjzg[766] = -8200338024103528189L;
        hn.cjzg[767] = 2207582836039087877L;
        hn.cjzg[768] = -5224963646527877319L;
        hn.cjzg[769] = 2090665799342813482L;
        hn.cjzg[770] = -2498919630787517918L;
        hn.cjzg[771] = 6091947530113174264L;
        hn.cjzg[772] = 1901571017303253632L;
        hn.cjzg[773] = 6209149204454288783L;
        hn.cjzg[774] = 5832202698162854273L;
        hn.cjzg[775] = -7723314516621463070L;
        hn.cjzg[776] = -4597377319366080573L;
        hn.cjzg[777] = -8359608794921080728L;
        hn.cjzg[778] = -5585079229402056056L;
        hn.cjzg[779] = 3387357812717675694L;
        hn.cjzg[780] = -910338541832237478L;
        hn.cjzg[781] = -7448736771057894129L;
        hn.cjzg[782] = -2319231616129164615L;
        hn.cjzg[783] = 1933558288197010108L;
        hn.cjzg[784] = 4274026523619227815L;
        hn.cjzg[785] = -8932737136245746205L;
        hn.cjzg[786] = -5049999633782815305L;
        hn.cjzg[787] = -136086122724685074L;
        hn.cjzg[788] = -3022256167725328426L;
        hn.cjzg[789] = -6459556260943849558L;
        hn.cjzg[790] = -1774709332733139031L;
        hn.cjzg[791] = 7745416020459875113L;
        hn.cjzg[792] = -1981783380333270137L;
        hn.cjzg[793] = -8297244517116833355L;
        hn.cjzg[794] = 5497801388366773066L;
        hn.cjzg[795] = 7979999187188144693L;
        hn.cjzg[796] = -6165902112739901537L;
        hn.cjzg[797] = 4381373351849171812L;
        hn.cjzg[798] = -1519846832350962965L;
        hn.cjzg[799] = -7869464176831247295L;
    }

    private static /* synthetic */ void cqup() {
        hn.cjzo[300] = -1701940550;
        hn.cjzo[301] = -2130458208;
        hn.cjzo[302] = 1561927571;
        hn.cjzo[303] = -1789421231;
        hn.cjzo[304] = 922393092;
        hn.cjzo[305] = -1782427679;
        hn.cjzo[306] = -893494200;
        hn.cjzo[307] = 420054642;
        hn.cjzo[308] = 1212873357;
        hn.cjzo[309] = -596121939;
        hn.cjzo[310] = -531382270;
        hn.cjzo[311] = 173442874;
        hn.cjzo[312] = 1153468327;
        hn.cjzo[313] = 780974369;
        hn.cjzo[314] = 105499367;
        hn.cjzo[315] = -1580405907;
        hn.cjzo[316] = 125354830;
        hn.cjzo[317] = -958493499;
        hn.cjzo[318] = -1974324776;
        hn.cjzo[319] = 1175944927;
        hn.cjzo[320] = -682150496;
        hn.cjzo[321] = -1419061778;
        hn.cjzo[322] = -280206071;
        hn.cjzo[323] = 2097925759;
        hn.cjzo[324] = -204839028;
        hn.cjzo[325] = -866439581;
        hn.cjzo[326] = -279221293;
        hn.cjzo[327] = -236373609;
        hn.cjzo[328] = -908503863;
        hn.cjzo[329] = 1410339395;
        hn.cjzo[330] = 274541000;
        hn.cjzo[331] = -626961583;
        hn.cjzo[332] = 2034338058;
        hn.cjzo[333] = 1730152229;
        hn.cjzo[334] = -303537913;
        hn.cjzo[335] = -1400481668;
        hn.cjzo[336] = 155016303;
        hn.cjzo[337] = 167743873;
        hn.cjzo[338] = -663222830;
        hn.cjzo[339] = 860142992;
        hn.cjzo[340] = -905116866;
        hn.cjzo[341] = -136767249;
        hn.cjzo[342] = 181691602;
        hn.cjzo[343] = 948170093;
        hn.cjzo[344] = -569709101;
        hn.cjzo[345] = 986529321;
        hn.cjzo[346] = -23564505;
        hn.cjzo[347] = -834702324;
        hn.cjzo[348] = -1604465515;
        hn.cjzo[349] = 558851017;
        hn.cjzo[350] = -862363954;
        hn.cjzo[351] = -125332005;
        hn.cjzo[352] = 1796509627;
        hn.cjzo[353] = 293248441;
        hn.cjzo[354] = 1601455257;
        hn.cjzo[355] = 135777010;
        hn.cjzo[356] = -1733484645;
        hn.cjzo[357] = -1057331189;
        hn.cjzo[358] = -1931644415;
        hn.cjzo[359] = -1900983596;
        hn.cjzo[360] = 1178749485;
        hn.cjzo[361] = -840756025;
        hn.cjzo[362] = 1816857634;
        hn.cjzo[363] = -1505102772;
        hn.cjzo[364] = 1590900874;
        hn.cjzo[365] = 681030813;
        hn.cjzo[366] = -1451370670;
        hn.cjzo[367] = 2123903061;
        hn.cjzo[368] = 1718082785;
        hn.cjzo[369] = 1491893189;
        hn.cjzo[370] = 740736796;
        hn.cjzo[371] = 437941213;
        hn.cjzo[372] = -1738049820;
        hn.cjzo[373] = -158722030;
        hn.cjzo[374] = 1398871162;
        hn.cjzo[375] = -1649529410;
        hn.cjzo[376] = -5536301;
        hn.cjzo[377] = -1962981645;
        hn.cjzo[378] = 866606791;
        hn.cjzo[379] = 999566009;
        hn.cjzo[380] = 1248156662;
        hn.cjzo[381] = -878350074;
        hn.cjzo[382] = -84875096;
        hn.cjzo[383] = -1461355604;
        hn.cjzo[384] = -1431307728;
        hn.cjzo[385] = 1421729804;
        hn.cjzo[386] = -1725414249;
        hn.cjzo[387] = -853603289;
        hn.cjzo[388] = -2042787389;
        hn.cjzo[389] = -1698977881;
        hn.cjzo[390] = -1236505172;
        hn.cjzo[391] = -1750133913;
        hn.cjzo[392] = 1658292525;
        hn.cjzo[393] = -1756225203;
        hn.cjzo[394] = 1629047903;
        hn.cjzo[395] = 1136410583;
        hn.cjzo[396] = 1258628548;
        hn.cjzo[397] = -914536570;
        hn.cjzo[398] = 600448073;
        hn.cjzo[399] = -1507057558;
    }

    private static /* synthetic */ void cqsb() {
        hn.cjzn[300] = -1701940577;
        hn.cjzn[301] = -2130458186;
        hn.cjzn[302] = 1561927610;
        hn.cjzn[303] = -1789421237;
        hn.cjzn[304] = 922393132;
        hn.cjzn[305] = -1782427660;
        hn.cjzn[306] = -893494193;
        hn.cjzn[307] = 420054614;
        hn.cjzn[308] = 1212873360;
        hn.cjzn[309] = -596121936;
        hn.cjzn[310] = -531382254;
        hn.cjzn[311] = 173442875;
        hn.cjzn[312] = 1153468302;
        hn.cjzn[313] = 780974371;
        hn.cjzn[314] = 105499371;
        hn.cjzn[315] = -1580405941;
        hn.cjzn[316] = 125354837;
        hn.cjzn[317] = -958493477;
        hn.cjzn[318] = -1974324780;
        hn.cjzn[319] = 1175944904;
        hn.cjzn[320] = -682150517;
        hn.cjzn[321] = -1419061771;
        hn.cjzn[322] = -280206064;
        hn.cjzn[323] = 2097925746;
        hn.cjzn[324] = -204839018;
        hn.cjzn[325] = -866439559;
        hn.cjzn[326] = -279221253;
        hn.cjzn[327] = -236373617;
        hn.cjzn[328] = -908503829;
        hn.cjzn[329] = 1410339416;
        hn.cjzn[330] = 274540997;
        hn.cjzn[331] = -626961547;
        hn.cjzn[332] = 2034338057;
        hn.cjzn[333] = 1730152244;
        hn.cjzn[334] = -303537896;
        hn.cjzn[335] = -1400481678;
        hn.cjzn[336] = 155016300;
        hn.cjzn[337] = 167743884;
        hn.cjzn[338] = -663222847;
        hn.cjzn[339] = 860142993;
        hn.cjzn[340] = -905116903;
        hn.cjzn[341] = 136767248;
        hn.cjzn[342] = -1651361778;
        hn.cjzn[343] = -948170094;
        hn.cjzn[344] = -1666722786;
        hn.cjzn[345] = 79053845;
        hn.cjzn[346] = 23564504;
        hn.cjzn[347] = 1528730479;
        hn.cjzn[348] = 1604465514;
        hn.cjzn[349] = 71460278;
        hn.cjzn[350] = -862363953;
        hn.cjzn[351] = -1052702320;
        hn.cjzn[352] = -1796509628;
        hn.cjzn[353] = -281054806;
        hn.cjzn[354] = -1601455258;
        hn.cjzn[355] = 1079233778;
        hn.cjzn[356] = 1733484644;
        hn.cjzn[357] = 1601377662;
        hn.cjzn[358] = 1931644414;
        hn.cjzn[359] = -1412597813;
        hn.cjzn[360] = -1178749486;
        hn.cjzn[361] = 1640783201;
        hn.cjzn[362] = -1816857635;
        hn.cjzn[363] = -77796258;
        hn.cjzn[364] = 1590900866;
        hn.cjzn[365] = 681030801;
        hn.cjzn[366] = -1451370672;
        hn.cjzn[367] = 2123903062;
        hn.cjzn[368] = 1718082792;
        hn.cjzn[369] = 1491893189;
        hn.cjzn[370] = 740736794;
        hn.cjzn[371] = 437941213;
        hn.cjzn[372] = -1738049820;
        hn.cjzn[373] = -158722018;
        hn.cjzn[374] = 1398871164;
        hn.cjzn[375] = -1649529412;
        hn.cjzn[376] = -5536304;
        hn.cjzn[377] = 1962981644;
        hn.cjzn[378] = -931520122;
        hn.cjzn[379] = 83223336;
        hn.cjzn[380] = -1248156663;
        hn.cjzn[381] = -968128715;
        hn.cjzn[382] = -84875096;
        hn.cjzn[383] = -1461355602;
        hn.cjzn[384] = -1431307726;
        hn.cjzn[385] = 1421729806;
        hn.cjzn[386] = 1725414248;
        hn.cjzn[387] = 1789604186;
        hn.cjzn[388] = 2042787388;
        hn.cjzn[389] = -448901898;
        hn.cjzn[390] = -1992004761;
        hn.cjzn[391] = -1750133914;
        hn.cjzn[392] = -167559235;
        hn.cjzn[393] = 684859725;
        hn.cjzn[394] = -1629047904;
        hn.cjzn[395] = 341656484;
        hn.cjzn[396] = 1258628558;
        hn.cjzn[397] = -914536572;
        hn.cjzn[398] = 600448076;
        hn.cjzn[399] = -1507057559;
    }

    private static /* synthetic */ void cqtg() {
        hn.cjzn[1100] = 1457350612;
        hn.cjzn[1101] = -800803373;
        hn.cjzn[1102] = -285906270;
        hn.cjzn[1103] = -859721399;
        hn.cjzn[1104] = 1145123817;
        hn.cjzn[1105] = -813812587;
        hn.cjzn[1106] = -96027767;
        hn.cjzn[1107] = 1867711885;
        hn.cjzn[1108] = 151360871;
        hn.cjzn[1109] = -2061836044;
        hn.cjzn[1110] = -457257429;
        hn.cjzn[1111] = 394387200;
        hn.cjzn[1112] = 1642396089;
        hn.cjzn[1113] = 1795370087;
        hn.cjzn[1114] = 1426316323;
        hn.cjzn[1115] = -373205035;
        hn.cjzn[1116] = -427391192;
        hn.cjzn[1117] = -467448518;
        hn.cjzn[1118] = 1801926275;
        hn.cjzn[1119] = -100808692;
        hn.cjzn[1120] = 224648340;
        hn.cjzn[1121] = -1435473480;
        hn.cjzn[1122] = 1565104243;
        hn.cjzn[1123] = -197394013;
        hn.cjzn[1124] = 261798286;
        hn.cjzn[1125] = -1489479320;
        hn.cjzn[1126] = 1700381437;
        hn.cjzn[1127] = -762592669;
        hn.cjzn[1128] = 1295431322;
        hn.cjzn[1129] = -2054870320;
        hn.cjzn[1130] = 1608618496;
        hn.cjzn[1131] = -1754799979;
        hn.cjzn[1132] = -1487989769;
        hn.cjzn[1133] = -47005000;
        hn.cjzn[1134] = 611783786;
        hn.cjzn[1135] = -27854219;
        hn.cjzn[1136] = 227520580;
        hn.cjzn[1137] = 1312742995;
        hn.cjzn[1138] = 1110372075;
        hn.cjzn[1139] = -963781328;
        hn.cjzn[1140] = 74227275;
        hn.cjzn[1141] = -1674246632;
        hn.cjzn[1142] = 2026474601;
        hn.cjzn[1143] = 1259102751;
        hn.cjzn[1144] = -1053053151;
        hn.cjzn[1145] = -1851867424;
        hn.cjzn[1146] = 313840716;
        hn.cjzn[1147] = -953258670;
        hn.cjzn[1148] = 1410731830;
        hn.cjzn[1149] = 1420938720;
        hn.cjzn[1150] = 2035039122;
        hn.cjzn[1151] = -934169511;
        hn.cjzn[1152] = 1181982910;
        hn.cjzn[1153] = 1513332110;
        hn.cjzn[1154] = 1360616945;
        hn.cjzn[1155] = -261464130;
        hn.cjzn[1156] = 968294332;
        hn.cjzn[1157] = 982441154;
        hn.cjzn[1158] = -2007276483;
        hn.cjzn[1159] = -1894280727;
        hn.cjzn[1160] = 1530555772;
        hn.cjzn[1161] = 1749259506;
        hn.cjzn[1162] = 1325769621;
        hn.cjzn[1163] = -1690067501;
        hn.cjzn[1164] = -1965642711;
        hn.cjzn[1165] = 293892328;
        hn.cjzn[1166] = -194580591;
        hn.cjzn[1167] = -314943195;
        hn.cjzn[1168] = -575077956;
        hn.cjzn[1169] = -110667356;
        hn.cjzn[1170] = 470627546;
        hn.cjzn[1171] = 2112337437;
        hn.cjzn[1172] = 867817876;
        hn.cjzn[1173] = -759496057;
        hn.cjzn[1174] = -276163687;
        hn.cjzn[1175] = 552052218;
        hn.cjzn[1176] = 1330908609;
        hn.cjzn[1177] = 1359159714;
        hn.cjzn[1178] = 643063040;
        hn.cjzn[1179] = 1188826461;
        hn.cjzn[1180] = 1734170058;
        hn.cjzn[1181] = 1900565560;
        hn.cjzn[1182] = 1017668812;
        hn.cjzn[1183] = 865131943;
        hn.cjzn[1184] = 1149841461;
        hn.cjzn[1185] = -383156781;
        hn.cjzn[1186] = -435431950;
        hn.cjzn[1187] = -1325279815;
        hn.cjzn[1188] = -763026469;
        hn.cjzn[1189] = -475559276;
        hn.cjzn[1190] = 1608160065;
        hn.cjzn[1191] = -478989675;
        hn.cjzn[1192] = -1814055830;
        hn.cjzn[1193] = 2135139881;
        hn.cjzn[1194] = 432475596;
        hn.cjzn[1195] = 1826686610;
        hn.cjzn[1196] = -1936330689;
        hn.cjzn[1197] = -1544817838;
        hn.cjzn[1198] = -1964745721;
        hn.cjzn[1199] = 1753417089;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getAutoMace() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpwv", cjzf(int ), (int)656));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1799182838: {
                    v1 = hn.cjzi("cpww", cjzf(int ), (int)657);
                    continue block18;
                }
                case -841682887: {
                    break block18;
                }
                case -280343743: {
                    v1 = hn.cjzi("cpwy", cjzf(int ), (int)658);
                    continue block18;
                }
                case 1442540914: {
                    v1 = hn.cjzi("cpxb", cjzf(int ), (int)659);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpxe", cjzf(int ), (int)660)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cpxh", cjzm(int ), (int)1337)) break;
            v2 /* !! */  = (long)hn.cjzi("cpxi", cjzm(int ), (int)1338);
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cpxk", cjzf(int ), (int)661));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1349076764: {
                    v4 = hn.cjzi("cpxl", cjzf(int ), (int)662);
                    continue block20;
                }
                case -852573808: {
                    v4 = hn.cjzi("cpxn", cjzf(int ), (int)663);
                    continue block20;
                }
                case -841682887: {
                    break block20;
                }
                case 2023959304: {
                    v4 = hn.cjzi("cpxr", cjzf(int ), (int)664);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpxx", cjzf(int ), (int)665)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cpxz", cjzm(int ), (int)1339)) break;
                    v5 /* !! */  = (long)hn.cjzi("cpya", cjzm(int ), (int)1340);
                }
                return this.autoMace;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpyc", cjzm(int ), (int)1341);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hn.cjzi("cpyf", cjzm(int ), (int)1342);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpyj", cjzm(int ), (int)1343);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpyl", cjzm(int ), (int)1344);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public hx getSmoothMode() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 10[SWITCH]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getLastTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpdv", cjzf(int ), (int)517)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpdw", cjzm(int ), (int)1183)) break;
            v0 /* !! */  = (long)hn.cjzi("cpdx", cjzm(int ), (int)1184);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cpdy", cjzf(int ), (int)518));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1168349846: {
                    v2 = hn.cjzi("cpdz", cjzf(int ), (int)519);
                    continue block17;
                }
                case -841682887: {
                    break block17;
                }
                case 914489608: {
                    v2 = hn.cjzi("cpea", cjzf(int ), (int)520);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpeb", cjzf(int ), (int)521)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hn.cjzi("cpec", cjzm(int ), (int)1185)) break;
                    v3 /* !! */  = (long)hn.cjzi("cped", cjzm(int ), (int)1186);
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cpee", cjzf(int ), (int)522));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block20;
                        }
                        case -638890230: {
                            v5 = hn.cjzi("cpef", cjzf(int ), (int)523);
                            continue block20;
                        }
                        case 2053829359: {
                            v5 = hn.cjzi("cpeg", cjzf(int ), (int)524);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.lastTarget;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpeh", cjzm(int ), (int)1187);
                } while (!var3_1);
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpei", cjzm(int ), (int)1188);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpej", cjzm(int ), (int)1189);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpek", cjzm(int ), (int)1190);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isDeferredCriticalsActive() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cofo", cjzf(int ), (int)295));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -851428993: {
                    v1 = hn.cjzi("cofp", cjzf(int ), (int)296);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case -673127637: {
                    v1 = hn.cjzi("cofq", cjzf(int ), (int)297);
                    continue block19;
                }
                case 1855781229: {
                    v1 = hn.cjzi("cofr", cjzf(int ), (int)298);
                    continue block19;
                }
            }
            break;
        }
        var4_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cofs", cjzf(int ), (int)299)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hn.cjzi("coft", cjzm(int ), (int)774)) break;
            v2 /* !! */  = (long)hn.cjzi("cofu", cjzm(int ), (int)775);
        }
        var3_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cofv", cjzf(int ), (int)300)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hn.cjzi("cofw", cjzm(int ), (int)776)) {
                var2_3 = hn.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hn.cjzi("cofx", cjzm(int ), (int)777);
        }
        if (var2_3 || var2_3) return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cofz", cjzf(int ), (int)301)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hn.cjzi("coga", cjzm(int ), (int)779)) {
                var1_4 = hk.getInstance();
                if (var2_3) return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
                break;
            }
            v4 /* !! */  = (long)hn.cjzi("cogb", cjzm(int ), (int)780);
        }
        if (var2_3) return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block23: while (true) {
            block46: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_4 == null) ** GOTO lbl62
                        if (var2_3) return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("cogc", cjzf(int ), (int)302)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != hn.cjzi("cogd", cjzm(int ), (int)781)) ** GOTO lbl56
                            if (var1_4.isActiveForCurrentState()) {
                                break;
                            }
                            ** GOTO lbl62
lbl56:
                            // 1 sources

                            v5 /* !! */  = (long)hn.cjzi("coge", cjzm(int ), (int)782);
                        }
                        if (var2_3) return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
                        v6 = hn.cjzi("cogf", cjzm(int ), (int)783);
                        if (!var4_1) return (boolean)v6;
                        throw null;
lbl62:
                        // 2 sources

                        if (var2_3 || var2_3) {
                            return (boolean)hn.cjzi("cofy", cjzm(int ), (int)778);
                        }
                        v6 = hn.cjzi("cogg", cjzm(int ), (int)784);
                        return (boolean)v6;
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogh", cjzm(int ), (int)785);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** GOTO lbl82
                    }
                    case 8: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogp", cjzm(int ), (int)793);
                        cfr_temp_0 = 4;
                        if (var4_1) {
                            throw null;
                        }
                        break block46;
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogr", cjzm(int ), (int)795);
                        if (var4_1) {
                            throw null;
                        }
lbl82:
                        // 3 sources

                        var3_2 /* !! */  = (int)hn.cjzi("cogj", cjzm(int ), (int)787);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogn", cjzm(int ), (int)791);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogq", cjzm(int ), (int)794);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogk", cjzm(int ), (int)788);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogo", cjzm(int ), (int)792);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogm", cjzm(int ), (int)790);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)hn.cjzi("cogi", cjzm(int ), (int)786);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl114
            }
            do {
                if (true) continue block23;
lbl114:
                // 2 sources

                var3_2 /* !! */  = (int)hn.cjzi("cogl", cjzm(int ), (int)789);
                cfr_temp_0 = 1;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSprintResetInProgress() {
        block63: {
            block62: {
                v0 /* !! */  = hn.fz;
                if (true) ** GOTO lbl5
                block37: while (true) {
                    v0 /* !! */  = (long)(hn.cjzi("cnsh", cjzf(int ), (int)181) - hn.cjzi("cnsg", cjzf(int ), (int)180));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -841682887: {
                            break block37;
                        }
                        case 1637471767: {
                            continue block37;
                        }
                    }
                    break;
                }
                var4_1 = hn.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cnsi", cjzf(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hn.cjzi("cnsj", cjzm(int ), (int)543)) break;
                    v1 /* !! */  = (long)hn.cjzi("cnsk", cjzm(int ), (int)544);
                }
                var3_2 /* !! */  = hn.b;
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl21
                block39: while (true) {
                    v2 /* !! */  = (long)(v3 - hn.cjzi("cnsl", cjzf(int ), (int)183));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1274707943: {
                            v3 = hn.cjzi("cnsm", cjzf(int ), (int)184);
                            continue block39;
                        }
                        case -841682887: {
                            break block39;
                        }
                        case -168969111: {
                            v3 = hn.cjzi("cnsn", cjzf(int ), (int)185);
                            continue block39;
                        }
                    }
                    break;
                }
                var2_3 = hn.a;
                if (var4_1) {
                    throw null;
lbl33:
                    // 7 sources

                    return (boolean)hn.cjzi("cnso", cjzm(int ), (int)545);
                }
                if (var2_3 || var2_3) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cnsp", cjzf(int ), (int)186)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hn.cjzi("cnsq", cjzm(int ), (int)546)) break;
                    v4 /* !! */  = (long)hn.cjzi("cnsr", cjzm(int ), (int)547);
                }
                if (d.getInstance() == null) break block62;
                if (var2_3) ** GOTO lbl33
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cnss", cjzf(int ), (int)187)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("cnst", cjzm(int ), (int)548)) break;
                    v5 /* !! */  = (long)hn.cjzi("cnsu", cjzm(int ), (int)549);
                }
                v6 = d.getInstance();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cnsv", cjzf(int ), (int)188)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("cnsw", cjzm(int ), (int)550)) break;
                    v7 /* !! */  = (long)hn.cjzi("cnsx", cjzm(int ), (int)551);
                }
                if (v6.getManager() != null) break block63;
                if (var2_3) ** GOTO lbl33
            }
            if (var2_3 || var2_3) ** GOTO lbl33
            return (boolean)hn.cjzi("cnsy", cjzm(int ), (int)552);
        }
        if (var2_3 || var2_3) ** GOTO lbl33
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("cnsz", cjzf(int ), (int)189)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hn.cjzi("cnta", cjzm(int ), (int)553)) break;
            v8 /* !! */  = (long)hn.cjzi("cntb", cjzm(int ), (int)554);
        }
        v9 = d.getInstance();
        v10 /* !! */  = hn.fz;
        if (true) ** GOTO lbl71
        block45: while (true) {
            v10 /* !! */  = (long)(hn.cjzi("cntd", cjzf(int ), (int)191) - hn.cjzi("cntc", cjzf(int ), (int)190));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -841682887: {
                    break block45;
                }
                case 1515091388: {
                    continue block45;
                }
            }
            break;
        }
        v11 = v9.getManager();
        v12 /* !! */  = hn.fz;
        if (true) ** GOTO lbl81
        block46: while (true) {
            v12 /* !! */  = (long)(v13 - hn.cjzi("cnte", cjzf(int ), (int)192));
lbl81:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -841682887: {
                    break block46;
                }
                case 992042754: {
                    v13 = hn.cjzi("cntf", cjzf(int ), (int)193);
                    continue block46;
                }
                case 1580972329: {
                    v13 = hn.cjzi("cntg", cjzf(int ), (int)194);
                    continue block46;
                }
            }
            break;
        }
        v14 = v11.getAttackPerpetrator();
        v15 /* !! */  = hn.fz;
        if (true) ** GOTO lbl95
        block47: while (true) {
            v15 /* !! */  = (long)(hn.cjzi("cnti", cjzf(int ), (int)196) - hn.cjzi("cnth", cjzf(int ), (int)195));
lbl95:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -841682887: {
                    break block47;
                }
                case 1891947088: {
                    continue block47;
                }
            }
            break;
        }
        var1_4 = v14.getAttackHandler();
        if (var2_3) ** GOTO lbl33
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("cntj", cjzf(int ), (int)197)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hn.cjzi("cntk", cjzm(int ), (int)555)) break;
                    v16 /* !! */  = (long)hn.cjzi("cntl", cjzm(int ), (int)556);
                }
                return var1_4.isSprintResetPending();
            }
            case 0: {
                var3_2 /* !! */  = (int)hn.cjzi("cntm", cjzm(int ), (int)557);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 1: {
                var3_2 /* !! */  = (int)hn.cjzi("cntn", cjzm(int ), (int)558);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 2: {
                var3_2 /* !! */  = (int)hn.cjzi("cnto", cjzm(int ), (int)559);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl128:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hn.cjzi("cntp", cjzm(int ), (int)560);
                if (!var4_1) break;
                throw null;
            }
lbl132:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)hn.cjzi("cntq", cjzm(int ), (int)561);
                if (!var4_1) ** GOTO lbl128
                throw null;
            }
lbl136:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)hn.cjzi("cntr", cjzm(int ), (int)562);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl141:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)hn.cjzi("cnts", cjzm(int ), (int)563);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl146:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)hn.cjzi("cntt", cjzm(int ), (int)564);
                if (!var4_1) ** GOTO lbl141
                throw null;
            }
lbl150:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)hn.cjzi("cntu", cjzm(int ), (int)565);
                if (!var4_1) ** GOTO lbl146
                throw null;
            }
lbl154:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)hn.cjzi("cntv", cjzm(int ), (int)566);
                if (!var4_1) ** GOTO lbl136
                throw null;
            }
lbl158:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hn.cjzi("cntw", cjzm(int ), (int)567);
                if (!var4_1) ** GOTO lbl154
                throw null;
            }
lbl162:
            // 2 sources

            case 11: {
                do {
                    var3_2 /* !! */  = (int)hn.cjzi("cntx", cjzm(int ), (int)568);
                } while (!var4_1);
                throw null;
            }
            case 12: 
        }
        do {
            var3_2 /* !! */  = (int)hn.cjzi("cnty", cjzm(int ), (int)569);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean canSkyCoreCrit() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cnrp", cjzf(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cnrq", cjzm(int ), (int)534)) break;
            v0 /* !! */  = (long)hn.cjzi("cnrr", cjzm(int ), (int)535);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(hn.cjzi("cnrt", cjzf(int ), (int)174) - hn.cjzi("cnrs", cjzf(int ), (int)173));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1406371643: {
                    continue block17;
                }
                case -841682887: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cnru", cjzf(int ), (int)175)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == hn.cjzi("cnrv", cjzm(int ), (int)536)) break;
                    v2 /* !! */  = (long)hn.cjzi("cnrw", cjzm(int ), (int)537);
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return (boolean)hn.cjzi("cnrx", cjzm(int ), (int)538);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("cnry", cjzf(int ), (int)176));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block20;
                        }
                        case 4144203: {
                            v4 = hn.cjzi("cnrz", cjzf(int ), (int)177);
                            continue block20;
                        }
                        case 422040541: {
                            v4 = hn.cjzi("cnsa", cjzf(int ), (int)178);
                            continue block20;
                        }
                        case 1132876260: {
                            v4 = hn.cjzi("cnsb", cjzf(int ), (int)179);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.skyCoreCanCrit;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hn.cjzi("cnsc", cjzm(int ), (int)539);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl55:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cnsd", cjzm(int ), (int)540);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cnse", cjzm(int ), (int)541);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cnsf", cjzm(int ), (int)542);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean matchesArtifact(class_1799 var1_1, String var2_2) {
        block87: {
            block86: {
                var8_3 = hn.c;
                var7_4 /* !! */  = hn.b;
                var6_5 = hn.a;
                if (var8_3) {
                    throw null;
lbl6:
                    // 24 sources

                    return (boolean)hn.cjzi("cksy", cjzm(int ), (int)283);
                }
                if (var6_5 || var6_5) ** GOTO lbl6
                if (var1_1 == null) break block86;
                if (var6_5) ** GOTO lbl6
                if (!var1_1.method_7960()) break block87;
                if (var6_5) ** GOTO lbl6
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            return (boolean)hn.cjzi("cksz", cjzm(int ), (int)284);
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        var3_6 = var2_2.toLowerCase(Locale.ROOT);
        if (var6_5 || var6_5) ** GOTO lbl6
        var4_7 = var1_1.method_7964().getString().toLowerCase(Locale.ROOT);
        if (var6_5 || var6_5) ** GOTO lbl6
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = var3_6.replace("\u0441\u0444\u0435\u0440\u0430 ", "").replace("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d ", "").trim();
                if (var6_5 || var6_5) ** GOTO lbl6
                if (!var3_6.contains("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d")) ** GOTO lbl47
                if (var6_5 || var6_5) ** GOTO lbl6
                if (!var1_1.method_31574(class_1802.field_8288)) ** GOTO lbl44
                if (var6_5) ** GOTO lbl6
                if (!var4_7.contains("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d")) ** GOTO lbl44
                if (var6_5) ** GOTO lbl6
                if (var4_7.contains(var5_8)) ** GOTO lbl39
                if (var6_5) ** GOTO lbl6
                if (var5_8.length() < hn.cjzi("ckta", cjzm(int ), (int)285)) ** GOTO lbl44
                if (var6_5) ** GOTO lbl6
                if (!var4_7.contains(var5_8.substring((int)hn.cjzi("cktb", cjzm(int ), (int)286), var5_8.length() - hn.cjzi("cktc", cjzm(int ), (int)287)))) ** GOTO lbl44
                if (var6_5) ** GOTO lbl6
lbl39:
                // 2 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                v0 = hn.cjzi("cktd", cjzm(int ), (int)288);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl46
lbl44:
                // 4 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                v0 = hn.cjzi("ckte", cjzm(int ), (int)289);
lbl46:
                // 2 sources

                return (boolean)v0;
lbl47:
                // 1 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                if (var1_1.method_31574(class_1802.field_8575)) ** GOTO lbl51
                if (var6_5 || var6_5) ** GOTO lbl6
                return (boolean)hn.cjzi("cktf", cjzm(int ), (int)290);
lbl51:
                // 1 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                if (!var4_7.contains(var5_8)) ** GOTO lbl55
                if (var6_5 || var6_5) ** GOTO lbl6
                return (boolean)hn.cjzi("cktg", cjzm(int ), (int)291);
lbl55:
                // 1 sources

                if (var6_5 || var6_5) ** GOTO lbl6
                if (var5_8.length() < hn.cjzi("ckth", cjzm(int ), (int)292)) ** GOTO lbl64
                if (var6_5) ** GOTO lbl6
                if (!var4_7.contains(var5_8.substring((int)hn.cjzi("ckti", cjzm(int ), (int)293), var5_8.length() - hn.cjzi("cktj", cjzm(int ), (int)294)))) ** GOTO lbl64
                if (var6_5) ** GOTO lbl6
                v1 = hn.cjzi("cktk", cjzm(int ), (int)295);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl67
lbl64:
                // 2 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                v1 = hn.cjzi("cktl", cjzm(int ), (int)296);
lbl67:
                // 2 sources

                return (boolean)v1;
            }
            case 0: {
                var7_4 /* !! */  = (int)hn.cjzi("cktm", cjzm(int ), (int)297);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 1: {
                do {
                    var7_4 /* !! */  = (int)hn.cjzi("cktn", cjzm(int ), (int)298);
                } while (!var8_3);
                throw null;
            }
lbl78:
            // 4 sources

            case 2: {
                var7_4 /* !! */  = (int)hn.cjzi("ckto", cjzm(int ), (int)299);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl83:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)hn.cjzi("cktp", cjzm(int ), (int)300);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl88:
            // 2 sources

            case 4: {
                var7_4 /* !! */  = (int)hn.cjzi("cktq", cjzm(int ), (int)301);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl93:
            // 3 sources

            case 5: {
                var7_4 /* !! */  = (int)hn.cjzi("cktr", cjzm(int ), (int)302);
                if (!var8_3) ** GOTO lbl88
                throw null;
            }
            case 6: {
                var7_4 /* !! */  = (int)hn.cjzi("ckts", cjzm(int ), (int)303);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl102:
            // 4 sources

            case 7: {
                var7_4 /* !! */  = (int)hn.cjzi("cktt", cjzm(int ), (int)304);
                if (!var8_3) ** GOTO lbl78
                throw null;
            }
lbl106:
            // 2 sources

            case 8: {
                var7_4 /* !! */  = (int)hn.cjzi("cktu", cjzm(int ), (int)305);
                if (!var8_3) ** GOTO lbl83
                throw null;
            }
lbl110:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)hn.cjzi("cktv", cjzm(int ), (int)306);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 10: {
                var7_4 /* !! */  = (int)hn.cjzi("cktw", cjzm(int ), (int)307);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 11: {
                var7_4 /* !! */  = (int)hn.cjzi("cktx", cjzm(int ), (int)308);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl125:
            // 4 sources

            case 12: {
                var7_4 /* !! */  = (int)hn.cjzi("ckty", cjzm(int ), (int)309);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 13: {
                var7_4 /* !! */  = (int)hn.cjzi("cktz", cjzm(int ), (int)310);
                if (!var8_3) ** GOTO lbl110
                throw null;
            }
            case 14: {
                var7_4 /* !! */  = (int)hn.cjzi("ckua", cjzm(int ), (int)311);
                if (!var8_3) ** GOTO lbl93
                throw null;
            }
lbl138:
            // 2 sources

            case 15: {
                var7_4 /* !! */  = (int)hn.cjzi("ckub", cjzm(int ), (int)312);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 16: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuc", cjzm(int ), (int)313);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl148:
            // 3 sources

            case 17: {
                var7_4 /* !! */  = (int)hn.cjzi("ckud", cjzm(int ), (int)314);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl153:
            // 3 sources

            case 18: {
                var7_4 /* !! */  = (int)hn.cjzi("ckue", cjzm(int ), (int)315);
                if (!var8_3) ** GOTO lbl125
                throw null;
            }
lbl157:
            // 3 sources

            case 19: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuf", cjzm(int ), (int)316);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 20: {
                var7_4 /* !! */  = (int)hn.cjzi("ckug", cjzm(int ), (int)317);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 21: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuh", cjzm(int ), (int)318);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl172:
            // 3 sources

            case 22: {
                var7_4 /* !! */  = (int)hn.cjzi("ckui", cjzm(int ), (int)319);
                if (!var8_3) ** GOTO lbl148
                throw null;
            }
lbl176:
            // 2 sources

            case 23: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuj", cjzm(int ), (int)320);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl181:
            // 3 sources

            case 24: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuk", cjzm(int ), (int)321);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl186:
            // 2 sources

            case 25: {
                var7_4 /* !! */  = (int)hn.cjzi("ckul", cjzm(int ), (int)322);
                if (!var8_3) ** GOTO lbl106
                throw null;
            }
            case 26: {
                var7_4 /* !! */  = (int)hn.cjzi("ckum", cjzm(int ), (int)323);
                if (!var8_3) ** GOTO lbl172
                throw null;
            }
lbl194:
            // 2 sources

            case 27: {
                var7_4 /* !! */  = (int)hn.cjzi("ckun", cjzm(int ), (int)324);
                if (!var8_3) ** GOTO lbl176
                throw null;
            }
            case 28: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuo", cjzm(int ), (int)325);
                if (!var8_3) ** GOTO lbl157
                throw null;
            }
lbl202:
            // 2 sources

            case 29: {
                var7_4 /* !! */  = (int)hn.cjzi("ckup", cjzm(int ), (int)326);
                if (!var8_3) ** GOTO lbl157
                throw null;
            }
lbl206:
            // 2 sources

            case 30: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuq", cjzm(int ), (int)327);
                if (!var8_3) ** GOTO lbl102
                throw null;
            }
lbl210:
            // 4 sources

            case 31: {
                var7_4 /* !! */  = (int)hn.cjzi("ckur", cjzm(int ), (int)328);
                if (!var8_3) ** GOTO lbl202
                throw null;
            }
lbl214:
            // 3 sources

            case 32: {
                var7_4 /* !! */  = (int)hn.cjzi("ckus", cjzm(int ), (int)329);
                if (!var8_3) ** GOTO lbl102
                throw null;
            }
            case 33: {
                var7_4 /* !! */  = (int)hn.cjzi("ckut", cjzm(int ), (int)330);
                if (!var8_3) ** GOTO lbl93
                throw null;
            }
            case 34: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuu", cjzm(int ), (int)331);
                if (!var8_3) ** GOTO lbl214
                throw null;
            }
            case 35: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuv", cjzm(int ), (int)332);
                if (!var8_3) ** GOTO lbl102
                throw null;
            }
            case 36: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuw", cjzm(int ), (int)333);
                if (!var8_3) ** GOTO lbl78
                throw null;
            }
            case 37: {
                var7_4 /* !! */  = (int)hn.cjzi("ckux", cjzm(int ), (int)334);
                if (!var8_3) ** GOTO lbl138
                throw null;
            }
lbl238:
            // 2 sources

            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)hn.cjzi("ckuy", cjzm(int ), (int)335);
                    if (!var8_3) ** GOTO lbl78
                    throw null;
                }
            }
lbl243:
            // 2 sources

            case 39: {
                var7_4 /* !! */  = (int)hn.cjzi("ckuz", cjzm(int ), (int)336);
                if (!var8_3) ** GOTO lbl181
                throw null;
            }
            case 40: {
                var7_4 /* !! */  = (int)hn.cjzi("ckva", cjzm(int ), (int)337);
                if (!var8_3) ** GOTO lbl125
                throw null;
            }
lbl251:
            // 3 sources

            case 41: {
                var7_4 /* !! */  = (int)hn.cjzi("ckvb", cjzm(int ), (int)338);
                if (!var8_3) ** GOTO lbl153
                throw null;
            }
lbl255:
            // 3 sources

            case 42: {
                var7_4 /* !! */  = (int)hn.cjzi("ckvc", cjzm(int ), (int)339);
                if (!var8_3) ** GOTO lbl148
                throw null;
            }
            case 43: 
        }
        var7_4 /* !! */  = (int)hn.cjzi("ckvd", cjzm(int ), (int)340);
        ** while (!var8_3)
lbl262:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqze() {
        hn.cjzh[500] = -7983300914127787271L;
        hn.cjzh[501] = 3736625521351652771L;
        hn.cjzh[502] = 2979234823347770078L;
        hn.cjzh[503] = 6925142184137885183L;
        hn.cjzh[504] = 8532177840353384134L;
        hn.cjzh[505] = -206826175850131598L;
        hn.cjzh[506] = -712112032953198670L;
        hn.cjzh[507] = -5869660043370265815L;
        hn.cjzh[508] = -1262215028335666681L;
        hn.cjzh[509] = 4105171868969959188L;
        hn.cjzh[510] = -4209013641380165241L;
        hn.cjzh[511] = 5645926286799640562L;
        hn.cjzh[512] = 7256517735350243219L;
        hn.cjzh[513] = 1345736025582310120L;
        hn.cjzh[514] = 4079160541713180393L;
        hn.cjzh[515] = -2622533625709051167L;
        hn.cjzh[516] = 1410044910419867181L;
        hn.cjzh[517] = -2304147126057311588L;
        hn.cjzh[518] = 7954659728647131481L;
        hn.cjzh[519] = -6837269649619458064L;
        hn.cjzh[520] = 5896799632062514511L;
        hn.cjzh[521] = -1467378997102091736L;
        hn.cjzh[522] = 4185237884706337340L;
        hn.cjzh[523] = -3775839163522420247L;
        hn.cjzh[524] = 5135061315321871750L;
        hn.cjzh[525] = -1605733118783565377L;
        hn.cjzh[526] = -3670600530317048298L;
        hn.cjzh[527] = -3775998427671894434L;
        hn.cjzh[528] = -5229364590783588492L;
        hn.cjzh[529] = 3498714814760878714L;
        hn.cjzh[530] = -8469739333619030433L;
        hn.cjzh[531] = -2508722268946989708L;
        hn.cjzh[532] = -3709299087598427340L;
        hn.cjzh[533] = -8921882980046437412L;
        hn.cjzh[534] = -2486113539870609286L;
        hn.cjzh[535] = -8330563439937691140L;
        hn.cjzh[536] = -5270259142415167721L;
        hn.cjzh[537] = -6633274284569820519L;
        hn.cjzh[538] = -1874024775638404487L;
        hn.cjzh[539] = 1265678849479103578L;
        hn.cjzh[540] = 3097398840174300038L;
        hn.cjzh[541] = -5671993767340815257L;
        hn.cjzh[542] = 3784342280031619290L;
        hn.cjzh[543] = 7892843787013080913L;
        hn.cjzh[544] = -6219312732875764548L;
        hn.cjzh[545] = 495657522758507447L;
        hn.cjzh[546] = 9169145572202633514L;
        hn.cjzh[547] = 5182347841367990053L;
        hn.cjzh[548] = 8376308593842277058L;
        hn.cjzh[549] = 3556034553765982839L;
        hn.cjzh[550] = -2982256296216609229L;
        hn.cjzh[551] = -4375821056469213777L;
        hn.cjzh[552] = 7615610002271249875L;
        hn.cjzh[553] = -3339569902357179167L;
        hn.cjzh[554] = 1309463641336134240L;
        hn.cjzh[555] = -4542166942165208278L;
        hn.cjzh[556] = 2406771016386642852L;
        hn.cjzh[557] = -1507840337555232967L;
        hn.cjzh[558] = 8508108421235036029L;
        hn.cjzh[559] = -2963249898544473835L;
        hn.cjzh[560] = 1960092922005061408L;
        hn.cjzh[561] = 2426788802009534944L;
        hn.cjzh[562] = 4123169293587411597L;
        hn.cjzh[563] = 768524821426555672L;
        hn.cjzh[564] = -6699433174731688627L;
        hn.cjzh[565] = -3504369139704760694L;
        hn.cjzh[566] = -1997912302356476635L;
        hn.cjzh[567] = -3704958509862529056L;
        hn.cjzh[568] = 7366262234767982503L;
        hn.cjzh[569] = -2183257408673677318L;
        hn.cjzh[570] = 5771586710238677414L;
        hn.cjzh[571] = 749802315483087551L;
        hn.cjzh[572] = -4329566722970703664L;
        hn.cjzh[573] = -5362979104850384114L;
        hn.cjzh[574] = 8351139519713957166L;
        hn.cjzh[575] = -295619908798270880L;
        hn.cjzh[576] = -5985961653971124650L;
        hn.cjzh[577] = -1510428860286071539L;
        hn.cjzh[578] = 4397298687056353105L;
        hn.cjzh[579] = -6852446075740612048L;
        hn.cjzh[580] = -2416851691383696302L;
        hn.cjzh[581] = -4967079474857739993L;
        hn.cjzh[582] = 4333309831676018943L;
        hn.cjzh[583] = 3425661154109000261L;
        hn.cjzh[584] = 8909544360951251219L;
        hn.cjzh[585] = 2496329936715845451L;
        hn.cjzh[586] = -7641107519614206670L;
        hn.cjzh[587] = 8557305905620528518L;
        hn.cjzh[588] = 3514683320476047418L;
        hn.cjzh[589] = -2151582591269841369L;
        hn.cjzh[590] = 7554915182491330393L;
        hn.cjzh[591] = 8214048713919640219L;
        hn.cjzh[592] = 8739397655313158123L;
        hn.cjzh[593] = -2796532867709137315L;
        hn.cjzh[594] = 3947213972968616952L;
        hn.cjzh[595] = 1459001157198529287L;
        hn.cjzh[596] = 8422043228077606274L;
        hn.cjzh[597] = -5916359035352247851L;
        hn.cjzh[598] = -1120814665141989473L;
        hn.cjzh[599] = -463709954757120372L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ox getPointFinder() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(hn.cjzi("coxl", cjzf(int ), (int)431) - hn.cjzi("coxk", cjzf(int ), (int)430));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block21;
                }
                case 1676326141: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("coxm", cjzf(int ), (int)432));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -841682887: {
                    break block22;
                }
                case -827453643: {
                    v2 = hn.cjzi("coxn", cjzf(int ), (int)433);
                    continue block22;
                }
                case 1062509880: {
                    v2 = hn.cjzi("coxo", cjzf(int ), (int)434);
                    continue block22;
                }
                case 1337531182: {
                    v2 = hn.cjzi("coxp", cjzf(int ), (int)435);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("coxq", cjzf(int ), (int)436)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("coxr", cjzm(int ), (int)1103)) break;
            v3 /* !! */  = (long)hn.cjzi("coxs", cjzm(int ), (int)1104);
        }
        var1_3 = hn.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl46
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("coxt", cjzf(int ), (int)437));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block25;
                        }
                        case 1628108988: {
                            v5 = hn.cjzi("coxu", cjzf(int ), (int)438);
                            continue block25;
                        }
                        case 1650112380: {
                            v5 = hn.cjzi("coxv", cjzf(int ), (int)439);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.pointFinder;
                case 0: {
                    var2_2 /* !! */  = (int)hn.cjzi("coxw", cjzm(int ), (int)1105);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("coxx", cjzm(int ), (int)1106);
                        if (!var3_1) break block24;
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)hn.cjzi("coxy", cjzm(int ), (int)1107);
                    if (!var3_1) break block24;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("coxz", cjzm(int ), (int)1108);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int cjzm(int n2) {
        return cjzn[n2] ^ cjzo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ik getTargetSelector() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cowt", cjzf(int ), (int)421));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1686368055: {
                    v1 = hn.cjzi("cowu", cjzf(int ), (int)422);
                    continue block17;
                }
                case -1507443154: {
                    v1 = hn.cjzi("cowv", cjzf(int ), (int)423);
                    continue block17;
                }
                case -841682887: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("coww", cjzf(int ), (int)424)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cowx", cjzm(int ), (int)1095)) break;
            v2 /* !! */  = (long)hn.cjzi("cowy", cjzm(int ), (int)1096);
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cowz", cjzf(int ), (int)425));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2072577853: {
                    v4 = hn.cjzi("coxa", cjzf(int ), (int)426);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case 1562021538: {
                    v4 = hn.cjzi("coxb", cjzf(int ), (int)427);
                    continue block19;
                }
                case 2114603216: {
                    v4 = hn.cjzi("coxc", cjzf(int ), (int)428);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = hn.a;
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

                if (var1_3 || var1_3) continue block20;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("coxd", cjzf(int ), (int)429)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("coxe", cjzm(int ), (int)1097)) break;
                    v5 /* !! */  = (long)hn.cjzi("coxf", cjzm(int ), (int)1098);
                }
                return this.targetSelector;
lbl53:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hn.cjzi("coxg", cjzm(int ), (int)1099);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl62
                }
                case 1: {
                    var2_2 /* !! */  = (int)hn.cjzi("coxh", cjzm(int ), (int)1100);
                    if (!var3_1) break block20;
                    throw null;
                }
lbl62:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("coxi", cjzm(int ), (int)1101);
                        if (!var3_1) ** GOTO lbl53
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("coxj", cjzm(int ), (int)1102);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        var4_1 = hn.c;
        var3_2 /* !! */  = hn.b;
        var2_3 = hn.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl9:
                    // 25 sources

                    return;
                }
                if (var2_3 || var2_3) ** GOTO lbl9
                if (d.getInstance() == null) ** GOTO lbl22
                if (var2_3) ** GOTO lbl9
                if (d.getInstance().getManager() == null) ** GOTO lbl22
                if (var2_3 || var2_3) ** GOTO lbl9
                var1_4 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
                if (var2_3 || var2_3) ** GOTO lbl9
                var1_4.resetMace();
                if (var2_3 || var2_3) ** GOTO lbl9
                var1_4.resetDamageSphere();
                if (var2_3) ** GOTO lbl9
lbl22:
                // 3 sources

                if (var2_3 || var2_3) ** GOTO lbl9
                this.hideArtifactFromMainHand();
                if (var2_3 || var2_3) ** GOTO lbl9
                if (!this.aimType.isSelected("Funtime")) ** GOTO lbl29
                if (var2_3 || var2_3) ** GOTO lbl9
                this.funTimeRotation.reset();
                if (var2_3) ** GOTO lbl9
lbl29:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl9
                if (!this.aimType.isSelected("FuntimeTest")) ** GOTO lbl34
                if (var2_3 || var2_3) ** GOTO lbl9
                this.funtimeTestSmooth.reset();
                if (var2_3) ** GOTO lbl9
lbl34:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl9
                if (!this.aimType.isSelected("Holyworld")) ** GOTO lbl39
                if (var2_3 || var2_3) ** GOTO lbl9
                this.holyworldSmooth.onTargetLost();
                if (var2_3) ** GOTO lbl9
lbl39:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl9
                this.stopRotation();
                if (var2_3 || var2_3) ** GOTO lbl9
                this.divineSmooth.reset();
                if (var2_3 || var2_3) ** GOTO lbl9
                this.testSmooth.reset();
                if (var2_3 || var2_3) ** GOTO lbl9
                this.legitSmooth.reset();
                if (var2_3 || var2_3) ** GOTO lbl9
                this.targetSelector.releaseTarget();
                if (var2_3 || var2_3) ** GOTO lbl9
                this.target = null;
                if (var2_3 || var2_3) ** GOTO lbl9
                this.skyCoreCanCrit = hn.cjzi("clgl", cjzm(int ), (int)441);
                if (var2_3 || var2_3) ** GOTO lbl9
                super.deactivate();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hn.cjzi("clgo", cjzm(int ), (int)442);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                    break;
                }
            }
lbl64:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)hn.cjzi("clgp", cjzm(int ), (int)443);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl69:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)hn.cjzi("clgr", cjzm(int ), (int)444);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl74:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hn.cjzi("clgs", cjzm(int ), (int)445);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 4: {
                var3_2 /* !! */  = (int)hn.cjzi("clgv", cjzm(int ), (int)446);
                if (!var4_1) ** GOTO lbl69
                throw null;
            }
lbl83:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)hn.cjzi("clgw", cjzm(int ), (int)447);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 6: {
                var3_2 /* !! */  = (int)hn.cjzi("clgz", cjzm(int ), (int)448);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl93:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)hn.cjzi("clhb", cjzm(int ), (int)449);
                if (!var4_1) ** GOTO lbl69
                throw null;
            }
lbl97:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)hn.cjzi("clhc", cjzm(int ), (int)450);
                if (!var4_1) ** GOTO lbl93
                throw null;
            }
lbl101:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)hn.cjzi("clhf", cjzm(int ), (int)451);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl106:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hn.cjzi("clhh", cjzm(int ), (int)452);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 11: {
                var3_2 /* !! */  = (int)hn.cjzi("clhk", cjzm(int ), (int)453);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 12: {
                var3_2 /* !! */  = (int)hn.cjzi("clhl", cjzm(int ), (int)454);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl121:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)hn.cjzi("clho", cjzm(int ), (int)455);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl126:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)hn.cjzi("clhq", cjzm(int ), (int)456);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl131:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)hn.cjzi("clht", cjzm(int ), (int)457);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 16: {
                var3_2 /* !! */  = (int)hn.cjzi("clhv", cjzm(int ), (int)458);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl141:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)hn.cjzi("clhy", cjzm(int ), (int)459);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)hn.cjzi("clia", cjzm(int ), (int)460);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
            case 19: {
                var3_2 /* !! */  = (int)hn.cjzi("clid", cjzm(int ), (int)461);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl154:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)hn.cjzi("clif", cjzm(int ), (int)462);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl159:
            // 3 sources

            case 21: {
                var3_2 /* !! */  = (int)hn.cjzi("clii", cjzm(int ), (int)463);
                if (!var4_1) ** GOTO lbl93
                throw null;
            }
lbl163:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)hn.cjzi("clil", cjzm(int ), (int)464);
                if (!var4_1) ** GOTO lbl74
                throw null;
            }
lbl167:
            // 3 sources

            case 23: {
                var3_2 /* !! */  = (int)hn.cjzi("clin", cjzm(int ), (int)465);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 24: {
                var3_2 /* !! */  = (int)hn.cjzi("clip", cjzm(int ), (int)466);
                if (!var4_1) ** GOTO lbl126
                throw null;
            }
lbl176:
            // 2 sources

            case 25: {
                var3_2 /* !! */  = (int)hn.cjzi("cliq", cjzm(int ), (int)467);
                if (!var4_1) ** GOTO lbl154
                throw null;
            }
lbl180:
            // 2 sources

            case 26: {
                var3_2 /* !! */  = (int)hn.cjzi("clis", cjzm(int ), (int)468);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 27: {
                var3_2 /* !! */  = (int)hn.cjzi("cliu", cjzm(int ), (int)469);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl190:
            // 3 sources

            case 28: {
                var3_2 /* !! */  = (int)hn.cjzi("clix", cjzm(int ), (int)470);
                if (!var4_1) ** GOTO lbl83
                throw null;
            }
lbl194:
            // 5 sources

            case 29: {
                var3_2 /* !! */  = (int)hn.cjzi("cliz", cjzm(int ), (int)471);
                if (!var4_1) break;
                throw null;
            }
            case 30: {
                var3_2 /* !! */  = (int)hn.cjzi("cljb", cjzm(int ), (int)472);
                if (!var4_1) ** GOTO lbl190
                throw null;
            }
            case 31: {
                var3_2 /* !! */  = (int)hn.cjzi("cljc", cjzm(int ), (int)473);
                if (!var4_1) ** GOTO lbl101
                throw null;
            }
            case 32: {
                var3_2 /* !! */  = (int)hn.cjzi("clje", cjzm(int ), (int)474);
                if (!var4_1) ** GOTO lbl141
                throw null;
            }
            case 33: {
                var3_2 /* !! */  = (int)hn.cjzi("cljf", cjzm(int ), (int)475);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl215:
            // 2 sources

            case 34: {
                var3_2 /* !! */  = (int)hn.cjzi("cljh", cjzm(int ), (int)476);
                if (!var4_1) ** GOTO lbl163
                throw null;
            }
lbl219:
            // 3 sources

            case 35: {
                var3_2 /* !! */  = (int)hn.cjzi("cljk", cjzm(int ), (int)477);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 36: {
                var3_2 /* !! */  = (int)hn.cjzi("cljo", cjzm(int ), (int)478);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 37: {
                do {
                    var3_2 /* !! */  = (int)hn.cjzi("cljq", cjzm(int ), (int)479);
                } while (!var4_1);
                throw null;
            }
            case 38: {
                var3_2 /* !! */  = (int)hn.cjzi("cljt", cjzm(int ), (int)480);
                if (!var4_1) ** GOTO lbl194
                throw null;
            }
lbl238:
            // 2 sources

            case 39: {
                var3_2 /* !! */  = (int)hn.cjzi("cljw", cjzm(int ), (int)481);
                if (!var4_1) ** GOTO lbl194
                throw null;
            }
lbl242:
            // 2 sources

            case 40: {
                var3_2 /* !! */  = (int)hn.cjzi("clka", cjzm(int ), (int)482);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 41: {
                var3_2 /* !! */  = (int)hn.cjzi("clkd", cjzm(int ), (int)483);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl252:
            // 4 sources

            case 42: {
                do {
                    var3_2 /* !! */  = (int)hn.cjzi("clkf", cjzm(int ), (int)484);
                } while (!var4_1);
                throw null;
            }
lbl257:
            // 2 sources

            case 43: {
                var3_2 /* !! */  = (int)hn.cjzi("clki", cjzm(int ), (int)485);
                if (!var4_1) ** GOTO lbl242
                throw null;
            }
lbl261:
            // 3 sources

            case 44: {
                var3_2 /* !! */  = (int)hn.cjzi("clkl", cjzm(int ), (int)486);
                if (!var4_1) ** GOTO lbl126
                throw null;
            }
lbl265:
            // 3 sources

            case 45: {
                var3_2 /* !! */  = (int)hn.cjzi("clkp", cjzm(int ), (int)487);
                if (!var4_1) ** GOTO lbl180
                throw null;
            }
            case 46: 
        }
        var3_2 /* !! */  = (int)hn.cjzi("clks", cjzm(int ), (int)488);
        ** while (!var4_1)
lbl272:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public os getRotationConfig() {
        block72: {
            v0 /* !! */  = hn.fz;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(hn.cjzi("corf", cjzf(int ), (int)391) - hn.cjzi("core", cjzf(int ), (int)390));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -841682887: {
                        break block46;
                    }
                    case 443420633: {
                        continue block46;
                    }
                }
                break;
            }
            var3_1 = hn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("corg", cjzf(int ), (int)392)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hn.cjzi("corh", cjzm(int ), (int)981)) break;
                v1 /* !! */  = (long)hn.cjzi("cori", cjzm(int ), (int)982);
            }
            var2_2 /* !! */  = hn.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("corj", cjzf(int ), (int)393)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hn.cjzi("cork", cjzm(int ), (int)983)) break;
                v2 /* !! */  = (long)hn.cjzi("corl", cjzm(int ), (int)984);
            }
            var1_3 = hn.a;
            if (var3_1) {
                throw null;
lbl25:
                // 4 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("corm", cjzf(int ), (int)394)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hn.cjzi("corn", cjzm(int ), (int)985)) break;
                v3 /* !! */  = (long)hn.cjzi("coro", cjzm(int ), (int)986);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("corp", cjzf(int ), (int)395)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hn.cjzi("corq", cjzm(int ), (int)987)) break;
                v4 /* !! */  = (long)hn.cjzi("corr", cjzm(int ), (int)988);
            }
            if (!this.aimType.isSelected("Legit")) break block72;
            if (var1_3 || var1_3) ** GOTO lbl25
            v5 /* !! */  = hn.fz;
            if (true) ** GOTO lbl44
            block52: while (true) {
                v5 /* !! */  = (long)(hn.cjzi("cort", cjzf(int ), (int)397) - hn.cjzi("cors", cjzf(int ), (int)396));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -841682887: {
                        break block52;
                    }
                    case -312230178: {
                        continue block52;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("coru", cjzf(int ), (int)398)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hn.cjzi("corv", cjzm(int ), (int)989)) break;
                v6 /* !! */  = (long)hn.cjzi("corw", cjzm(int ), (int)990);
            }
            v7 = this.getSmoothMode();
            v8 = hn.cjzi("corx", cjzm(int ), (int)991);
            v9 = hn.cjzi("cory", cjzm(int ), (int)992);
            v10 /* !! */  = hn.fz;
            if (true) ** GOTO lbl61
            block54: while (true) {
                v10 /* !! */  = (long)(v11 - hn.cjzi("corz", cjzf(int ), (int)399));
lbl61:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1799978525: {
                        v11 = hn.cjzi("cosa", cjzf(int ), (int)400);
                        continue block54;
                    }
                    case -841682887: {
                        break block54;
                    }
                    case 1456514924: {
                        v11 = hn.cjzi("cosb", cjzf(int ), (int)401);
                        continue block54;
                    }
                }
                break;
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("cosc", cjzf(int ), (int)402)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == hn.cjzi("cosd", cjzm(int ), (int)993)) break;
                v12 /* !! */  = (long)hn.cjzi("cose", cjzm(int ), (int)994);
            }
            v13 = this.clickType.isSelected("1.8");
            v14 /* !! */  = hn.fz;
            if (true) ** GOTO lbl80
            block56: while (true) {
                v14 /* !! */  = (long)(v15 - hn.cjzi("cosf", cjzf(int ), (int)403));
lbl80:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1964523073: {
                        v15 = hn.cjzi("cosg", cjzf(int ), (int)404);
                        continue block56;
                    }
                    case -841682887: {
                        break block56;
                    }
                    case 143425580: {
                        v15 = hn.cjzi("cosh", cjzf(int ), (int)405);
                        continue block56;
                    }
                }
                break;
            }
            return new os(v7, (boolean)v8, (boolean)v9, v13);
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("cosi", cjzf(int ), (int)406)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hn.cjzi("cosj", cjzm(int ), (int)995)) break;
                    v16 /* !! */  = (long)hn.cjzi("cosk", cjzm(int ), (int)996);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("cosl", cjzf(int ), (int)407)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hn.cjzi("cosm", cjzm(int ), (int)997)) break;
                    v17 /* !! */  = (long)hn.cjzi("cosn", cjzm(int ), (int)998);
                }
                v18 = this.getSmoothMode();
                v19 = hn.cjzi("coso", cjzm(int ), (int)999);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_8 = hn.fz - hn.cjzi("cosp", cjzf(int ), (int)408)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hn.cjzi("cosq", cjzm(int ), (int)1000)) break;
                    v20 /* !! */  = (long)hn.cjzi("cosr", cjzm(int ), (int)1001);
                }
                v21 /* !! */  = hn.fz;
                if (true) ** GOTO lbl118
                block60: while (true) {
                    v21 /* !! */  = (long)(v22 - hn.cjzi("coss", cjzf(int ), (int)409));
lbl118:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1461998262: {
                            v22 = hn.cjzi("cost", cjzf(int ), (int)410);
                            continue block60;
                        }
                        case -841682887: {
                            break block60;
                        }
                        case 1805171786: {
                            v22 = hn.cjzi("cosu", cjzf(int ), (int)411);
                            continue block60;
                        }
                        case 2034885786: {
                            v22 = hn.cjzi("cosv", cjzf(int ), (int)412);
                            continue block60;
                        }
                    }
                    break;
                }
                v23 = this.movementCorrection.isSelected("\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f");
                v24 /* !! */  = hn.fz;
                if (true) ** GOTO lbl135
                block61: while (true) {
                    v24 /* !! */  = (long)(v25 - hn.cjzi("cosw", cjzf(int ), (int)413));
lbl135:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -841682887: {
                            break block61;
                        }
                        case 26278493: {
                            v25 = hn.cjzi("cosx", cjzf(int ), (int)414);
                            continue block61;
                        }
                        case 111129113: {
                            v25 = hn.cjzi("cosy", cjzf(int ), (int)415);
                            continue block61;
                        }
                    }
                    break;
                }
                v26 /* !! */  = hn.fz;
                if (true) ** GOTO lbl148
                block62: while (true) {
                    v26 /* !! */  = (long)(v27 - hn.cjzi("cosz", cjzf(int ), (int)416));
lbl148:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1502991539: {
                            v27 = hn.cjzi("cota", cjzf(int ), (int)417);
                            continue block62;
                        }
                        case -841682887: {
                            break block62;
                        }
                        case -136680402: {
                            v27 = hn.cjzi("cotb", cjzf(int ), (int)418);
                            continue block62;
                        }
                        case 233397353: {
                            v27 = hn.cjzi("cotc", cjzf(int ), (int)419);
                            continue block62;
                        }
                    }
                    break;
                }
                v28 = this.clickType.isSelected("1.8");
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = hn.fz - hn.cjzi("cotd", cjzf(int ), (int)420)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hn.cjzi("cote", cjzm(int ), (int)1002)) break;
                    v29 /* !! */  = (long)hn.cjzi("cotf", cjzm(int ), (int)1003);
                }
                return new os(v18, (boolean)v19, v23, v28);
            }
lbl167:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cotg", cjzm(int ), (int)1004);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl198
                    break;
                }
            }
lbl173:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("coth", cjzm(int ), (int)1005);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("coti", cjzm(int ), (int)1006);
                } while (!var3_1);
                throw null;
            }
lbl182:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hn.cjzi("cotj", cjzm(int ), (int)1007);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hn.cjzi("cotk", cjzm(int ), (int)1008);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)hn.cjzi("cotl", cjzm(int ), (int)1009);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hn.cjzi("cotm", cjzm(int ), (int)1010);
                if (!var3_1) ** GOTO lbl182
                throw null;
            }
lbl198:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hn.cjzi("cotn", cjzm(int ), (int)1011);
                if (!var3_1) break;
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("coto", cjzm(int ), (int)1012);
        ** while (!var3_1)
lbl205:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ii getSpookyTimeSmooth() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("coya", cjzf(int ), (int)440));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block11;
                }
                case -725500710: {
                    v1 = hn.cjzi("coyb", cjzf(int ), (int)441);
                    continue block11;
                }
                case 522386168: {
                    v1 = hn.cjzi("coyc", cjzf(int ), (int)442);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("coyd", cjzf(int ), (int)443)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("coye", cjzm(int ), (int)1109)) break;
            v2 /* !! */  = (long)hn.cjzi("coyf", cjzm(int ), (int)1110);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("coyg", cjzf(int ), (int)444)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("coyh", cjzm(int ), (int)1111)) break;
            v3 /* !! */  = (long)hn.cjzi("coyi", cjzm(int ), (int)1112);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("coyj", cjzf(int ), (int)445)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("coyk", cjzm(int ), (int)1113)) break;
                    v4 /* !! */  = (long)hn.cjzi("coyl", cjzm(int ), (int)1114);
                }
                return this.spookyTimeSmooth;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("coym", cjzm(int ), (int)1115);
                if (!var3_1) break;
                throw null;
            }
lbl48:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("coyn", cjzm(int ), (int)1116);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("coyo", cjzm(int ), (int)1117);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("coyp", cjzm(int ), (int)1118);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isRwWallBypassActive() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("copx", cjzf(int ), (int)373));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block36;
                }
                case 114619195: {
                    v1 = hn.cjzi("copy", cjzf(int ), (int)374);
                    continue block36;
                }
                case 403836616: {
                    v1 = hn.cjzi("copz", cjzf(int ), (int)375);
                    continue block36;
                }
                case 599577253: {
                    v1 = hn.cjzi("coqa", cjzf(int ), (int)376);
                    continue block36;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("coqb", cjzf(int ), (int)377));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block37;
                }
                case -781952490: {
                    v3 = hn.cjzi("coqc", cjzf(int ), (int)378);
                    continue block37;
                }
                case 460199010: {
                    v3 = hn.cjzi("coqd", cjzf(int ), (int)379);
                    continue block37;
                }
                case 1098487924: {
                    v3 = hn.cjzi("coqe", cjzf(int ), (int)380);
                    continue block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("coqf", cjzf(int ), (int)381)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hn.cjzi("coqg", cjzm(int ), (int)965)) break;
            v4 /* !! */  = (long)hn.cjzi("coqh", cjzm(int ), (int)966);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl44:
            // 5 sources

            return (boolean)hn.cjzi("coqi", cjzm(int ), (int)967);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl55
                block40: while (true) {
                    v5 /* !! */  = (long)(hn.cjzi("coqk", cjzf(int ), (int)383) - hn.cjzi("coqj", cjzf(int ), (int)382));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -841682887: {
                            break block40;
                        }
                        case 838361797: {
                            continue block40;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("coql", cjzf(int ), (int)384)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hn.cjzi("coqm", cjzm(int ), (int)968)) break;
                    v6 /* !! */  = (long)hn.cjzi("coqn", cjzm(int ), (int)969);
                }
                if (!this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b")) ** GOTO lbl96
                if (var1_3) ** GOTO lbl44
                v7 /* !! */  = hn.fz;
                if (true) ** GOTO lbl72
                block42: while (true) {
                    v7 /* !! */  = (long)(v8 - hn.cjzi("coqo", cjzf(int ), (int)385));
lbl72:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2008326564: {
                            v8 = hn.cjzi("coqp", cjzf(int ), (int)386);
                            continue block42;
                        }
                        case -841682887: {
                            break block42;
                        }
                        case 1389817848: {
                            v8 = hn.cjzi("coqq", cjzf(int ), (int)387);
                            continue block42;
                        }
                    }
                    break;
                }
                v9 /* !! */  = hn.fz;
                if (true) ** GOTO lbl85
                block43: while (true) {
                    v9 /* !! */  = (long)(hn.cjzi("coqs", cjzf(int ), (int)389) - hn.cjzi("coqr", cjzf(int ), (int)388));
lbl85:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1844600696: {
                            continue block43;
                        }
                        case -841682887: {
                            break block43;
                        }
                    }
                    break;
                }
                if (!this.rwWallBypass.isValue()) ** GOTO lbl96
                if (var1_3) ** GOTO lbl44
                v10 = hn.cjzi("coqt", cjzm(int ), (int)970);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
lbl96:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v10 = hn.cjzi("coqu", cjzm(int ), (int)971);
lbl99:
                // 2 sources

                return (boolean)v10;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("coqv", cjzm(int ), (int)972);
                if (!var3_1) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("coqw", cjzm(int ), (int)973);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl109:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("coqx", cjzm(int ), (int)974);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl113:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hn.cjzi("coqy", cjzm(int ), (int)975);
                if (var3_1) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("coqz", cjzm(int ), (int)976);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl131
                    break;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)hn.cjzi("cora", cjzm(int ), (int)977);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hn.cjzi("corb", cjzm(int ), (int)978);
                if (var3_1) {
                    throw null;
                }
            }
lbl131:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)hn.cjzi("corc", cjzm(int ), (int)979);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cord", cjzm(int ), (int)980);
        ** while (!var3_1)
lbl138:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqyz() {
        hn.cjzh[100] = -4914244810084808639L;
        hn.cjzh[101] = -793014018613554486L;
        hn.cjzh[102] = 4455197025114177658L;
        hn.cjzh[103] = -3908945392973471699L;
        hn.cjzh[104] = 5808391874741650510L;
        hn.cjzh[105] = -7222383776608429696L;
        hn.cjzh[106] = -8950125184815596526L;
        hn.cjzh[107] = -7011406644228899538L;
        hn.cjzh[108] = 1958242752084973851L;
        hn.cjzh[109] = 9033188021350974199L;
        hn.cjzh[110] = -3417419133550489774L;
        hn.cjzh[111] = 7663976440562398382L;
        hn.cjzh[112] = 3323235348558304592L;
        hn.cjzh[113] = -3769385441685930090L;
        hn.cjzh[114] = 4559498884061570063L;
        hn.cjzh[115] = -5760852428399597916L;
        hn.cjzh[116] = 8603332329044842789L;
        hn.cjzh[117] = -1370087903095776913L;
        hn.cjzh[118] = -3922600369780133212L;
        hn.cjzh[119] = -6136004732534733218L;
        hn.cjzh[120] = 8808264142571521969L;
        hn.cjzh[121] = 9106485216100859488L;
        hn.cjzh[122] = -334469839071624890L;
        hn.cjzh[123] = -2211018119982381360L;
        hn.cjzh[124] = 6384769875428216794L;
        hn.cjzh[125] = -5259654894965170582L;
        hn.cjzh[126] = -2968952052736603535L;
        hn.cjzh[127] = -8765984631166077053L;
        hn.cjzh[128] = -1032022318370369069L;
        hn.cjzh[129] = 1855685296914882259L;
        hn.cjzh[130] = -3169642221745531741L;
        hn.cjzh[131] = 6929470375170752398L;
        hn.cjzh[132] = -1944017555777917990L;
        hn.cjzh[133] = 4781712299042572117L;
        hn.cjzh[134] = -2820749564775586484L;
        hn.cjzh[135] = 2901021299372776926L;
        hn.cjzh[136] = -1122850404820403151L;
        hn.cjzh[137] = 1235817449247991170L;
        hn.cjzh[138] = -7808158587604682541L;
        hn.cjzh[139] = 7583480273354019361L;
        hn.cjzh[140] = 151769734599953358L;
        hn.cjzh[141] = -1120622118930852632L;
        hn.cjzh[142] = -6063050907768482455L;
        hn.cjzh[143] = -7272829564038944847L;
        hn.cjzh[144] = 5455866601657284658L;
        hn.cjzh[145] = -1812041189098304920L;
        hn.cjzh[146] = -7227332199053436276L;
        hn.cjzh[147] = -634345701136779232L;
        hn.cjzh[148] = 4170099023322553641L;
        hn.cjzh[149] = -1990446025791540068L;
        hn.cjzh[150] = -7052611663806462988L;
        hn.cjzh[151] = -3637912392301424882L;
        hn.cjzh[152] = 6203067175249576056L;
        hn.cjzh[153] = 2617051366094091637L;
        hn.cjzh[154] = 673337416586831777L;
        hn.cjzh[155] = 8139134355365239965L;
        hn.cjzh[156] = 2116540547724843973L;
        hn.cjzh[157] = -202602509302248064L;
        hn.cjzh[158] = 1808989219100560258L;
        hn.cjzh[159] = 3078089559999060107L;
        hn.cjzh[160] = 7499300196869390940L;
        hn.cjzh[161] = 872800396559907434L;
        hn.cjzh[162] = 5518063831970596797L;
        hn.cjzh[163] = 911819556477810659L;
        hn.cjzh[164] = 7948845868610808624L;
        hn.cjzh[165] = -6414295068666358440L;
        hn.cjzh[166] = -4184823215310739199L;
        hn.cjzh[167] = 1393775189530006825L;
        hn.cjzh[168] = 5505658162109728376L;
        hn.cjzh[169] = 826836422729988194L;
        hn.cjzh[170] = -6159613651451577079L;
        hn.cjzh[171] = 7994594323739861425L;
        hn.cjzh[172] = -6982271657891544973L;
        hn.cjzh[173] = 5146849146378953912L;
        hn.cjzh[174] = -623713190772760337L;
        hn.cjzh[175] = 7066411059061324489L;
        hn.cjzh[176] = 1722025242539347846L;
        hn.cjzh[177] = -5110616562991139419L;
        hn.cjzh[178] = 997852349403840887L;
        hn.cjzh[179] = -5828882803183304880L;
        hn.cjzh[180] = 1333903747336397460L;
        hn.cjzh[181] = 1996613521783697182L;
        hn.cjzh[182] = 7166068938009923724L;
        hn.cjzh[183] = -2539181274952194303L;
        hn.cjzh[184] = -7699220197008762296L;
        hn.cjzh[185] = -5229069000065359873L;
        hn.cjzh[186] = 3843503943919281613L;
        hn.cjzh[187] = 1139848460414740022L;
        hn.cjzh[188] = 6794135967941305404L;
        hn.cjzh[189] = 1406041810120902901L;
        hn.cjzh[190] = 1321628329449979437L;
        hn.cjzh[191] = 4599446378259845688L;
        hn.cjzh[192] = 2551558868244167100L;
        hn.cjzh[193] = 4998303377181058850L;
        hn.cjzh[194] = -899132283920200254L;
        hn.cjzh[195] = -1721165883261902437L;
        hn.cjzh[196] = 6169350551390459460L;
        hn.cjzh[197] = -4710717297136324634L;
        hn.cjzh[198] = -3567741112424980596L;
        hn.cjzh[199] = -3760595585978446980L;
    }

    private static /* synthetic */ void cqxj() {
        hn.cjzg[400] = 7860195929472819363L;
        hn.cjzg[401] = 114582381880536009L;
        hn.cjzg[402] = 7339096243559997922L;
        hn.cjzg[403] = -447131634831191679L;
        hn.cjzg[404] = 2632606760830726568L;
        hn.cjzg[405] = 266601916154787188L;
        hn.cjzg[406] = 4094944399179160434L;
        hn.cjzg[407] = -8840790882605789189L;
        hn.cjzg[408] = 8070959195698345257L;
        hn.cjzg[409] = -2785156175959151080L;
        hn.cjzg[410] = 7474177799455278432L;
        hn.cjzg[411] = 3190794422539617725L;
        hn.cjzg[412] = -8434137100741953748L;
        hn.cjzg[413] = -8181407701850931733L;
        hn.cjzg[414] = -2893003710814602293L;
        hn.cjzg[415] = -3865820526054359762L;
        hn.cjzg[416] = 6217487104291815915L;
        hn.cjzg[417] = -1803129739373471564L;
        hn.cjzg[418] = -8595941594717057870L;
        hn.cjzg[419] = -4411839603851105217L;
        hn.cjzg[420] = 446133682013430969L;
        hn.cjzg[421] = 4091402652242128762L;
        hn.cjzg[422] = 1788046894538078871L;
        hn.cjzg[423] = -377388574433874494L;
        hn.cjzg[424] = 6434802541093866979L;
        hn.cjzg[425] = -8529114334316275611L;
        hn.cjzg[426] = 8029291871455328002L;
        hn.cjzg[427] = -7367888338301899553L;
        hn.cjzg[428] = 847260233116295612L;
        hn.cjzg[429] = 2910212327158524367L;
        hn.cjzg[430] = -7055549226218346645L;
        hn.cjzg[431] = -5643286919318996945L;
        hn.cjzg[432] = -1267736474206635150L;
        hn.cjzg[433] = 4522303559667686551L;
        hn.cjzg[434] = -7143678560311978149L;
        hn.cjzg[435] = 871439072575525014L;
        hn.cjzg[436] = 8739022750668422420L;
        hn.cjzg[437] = -9211038915040706456L;
        hn.cjzg[438] = -4921226217937319294L;
        hn.cjzg[439] = 1343789700291294517L;
        hn.cjzg[440] = -8223836399674998693L;
        hn.cjzg[441] = 4155682747837627575L;
        hn.cjzg[442] = 5114704508687481312L;
        hn.cjzg[443] = -527801792846528282L;
        hn.cjzg[444] = 7349017661591601457L;
        hn.cjzg[445] = 2381272214764350055L;
        hn.cjzg[446] = -1505210738563005770L;
        hn.cjzg[447] = 3158033889702917821L;
        hn.cjzg[448] = -1417786562480423370L;
        hn.cjzg[449] = -7037262935574884027L;
        hn.cjzg[450] = -5374562541923322772L;
        hn.cjzg[451] = -4054801497702406540L;
        hn.cjzg[452] = -4923187841638565573L;
        hn.cjzg[453] = 8291097539876184941L;
        hn.cjzg[454] = -8326678262782771747L;
        hn.cjzg[455] = 3852044809226530607L;
        hn.cjzg[456] = -4186643818649124600L;
        hn.cjzg[457] = 5806328342275130529L;
        hn.cjzg[458] = -3082069744195249453L;
        hn.cjzg[459] = 4726391139920869720L;
        hn.cjzg[460] = 8251954085832875616L;
        hn.cjzg[461] = -783688902964737737L;
        hn.cjzg[462] = -2816963441774620436L;
        hn.cjzg[463] = 7042844297861677700L;
        hn.cjzg[464] = -477315252819543591L;
        hn.cjzg[465] = -4967195909466544777L;
        hn.cjzg[466] = 2084554628831777401L;
        hn.cjzg[467] = 4109337995151936303L;
        hn.cjzg[468] = 1562287405818260040L;
        hn.cjzg[469] = -2743110454884297352L;
        hn.cjzg[470] = -7184032069146408240L;
        hn.cjzg[471] = 3115402512679048127L;
        hn.cjzg[472] = -5090478154075881575L;
        hn.cjzg[473] = -6983856346882200040L;
        hn.cjzg[474] = 2009722176687781257L;
        hn.cjzg[475] = -7456737050107187227L;
        hn.cjzg[476] = 6144755303737149914L;
        hn.cjzg[477] = 2293098960978031344L;
        hn.cjzg[478] = 6698328137087678895L;
        hn.cjzg[479] = 5044688647097467976L;
        hn.cjzg[480] = -4007931757655198317L;
        hn.cjzg[481] = -5603969563544363576L;
        hn.cjzg[482] = 444860156245584422L;
        hn.cjzg[483] = 5925855694336174684L;
        hn.cjzg[484] = -680682256841859851L;
        hn.cjzg[485] = -2081443263763042151L;
        hn.cjzg[486] = 6577964848664322629L;
        hn.cjzg[487] = -6244698984454347893L;
        hn.cjzg[488] = 9000576890481702250L;
        hn.cjzg[489] = 5593878666364423580L;
        hn.cjzg[490] = -1815885191287192387L;
        hn.cjzg[491] = 2259158181367368001L;
        hn.cjzg[492] = 7254320132516226638L;
        hn.cjzg[493] = 6538536145205203355L;
        hn.cjzg[494] = 320774412444857793L;
        hn.cjzg[495] = 6833056967382370850L;
        hn.cjzg[496] = 7479325739036730280L;
        hn.cjzg[497] = 3993676009001297702L;
        hn.cjzg[498] = 5740069651613355382L;
        hn.cjzg[499] = -7299344985025695230L;
    }

    private static /* synthetic */ void cqru() {
        hn.cjzn[100] = 1989239336;
        hn.cjzn[101] = -1031343403;
        hn.cjzn[102] = -828015993;
        hn.cjzn[103] = 986769034;
        hn.cjzn[104] = -1065480700;
        hn.cjzn[105] = -89123089;
        hn.cjzn[106] = -207235124;
        hn.cjzn[107] = -1741944807;
        hn.cjzn[108] = -1798915921;
        hn.cjzn[109] = -2108334590;
        hn.cjzn[110] = 1081297183;
        hn.cjzn[111] = 1134068849;
        hn.cjzn[112] = -497132861;
        hn.cjzn[113] = 619904933;
        hn.cjzn[114] = 1574865534;
        hn.cjzn[115] = 1648539814;
        hn.cjzn[116] = 1220291095;
        hn.cjzn[117] = -477013800;
        hn.cjzn[118] = -525925180;
        hn.cjzn[119] = -925095114;
        hn.cjzn[120] = -729197930;
        hn.cjzn[121] = -1286783855;
        hn.cjzn[122] = -1748549968;
        hn.cjzn[123] = -2124537698;
        hn.cjzn[124] = 1688956882;
        hn.cjzn[125] = 802750593;
        hn.cjzn[126] = -1073452962;
        hn.cjzn[127] = 751212762;
        hn.cjzn[128] = -417123052;
        hn.cjzn[129] = 811174641;
        hn.cjzn[130] = 179431679;
        hn.cjzn[131] = 1279580745;
        hn.cjzn[132] = -1125653132;
        hn.cjzn[133] = -602746773;
        hn.cjzn[134] = -148945043;
        hn.cjzn[135] = -1593422461;
        hn.cjzn[136] = -259308024;
        hn.cjzn[137] = 393402306;
        hn.cjzn[138] = -1094403444;
        hn.cjzn[139] = 1703216131;
        hn.cjzn[140] = 430355107;
        hn.cjzn[141] = -2012396898;
        hn.cjzn[142] = 860860104;
        hn.cjzn[143] = 1351167021;
        hn.cjzn[144] = 750274801;
        hn.cjzn[145] = -399230116;
        hn.cjzn[146] = 414324714;
        hn.cjzn[147] = -47883639;
        hn.cjzn[148] = 60838287;
        hn.cjzn[149] = 1670535318;
        hn.cjzn[150] = 1764106656;
        hn.cjzn[151] = 206936638;
        hn.cjzn[152] = 2021727144;
        hn.cjzn[153] = 275964558;
        hn.cjzn[154] = 723944557;
        hn.cjzn[155] = 1031927275;
        hn.cjzn[156] = -709882436;
        hn.cjzn[157] = 996881737;
        hn.cjzn[158] = -447037836;
        hn.cjzn[159] = 1884626347;
        hn.cjzn[160] = 374500626;
        hn.cjzn[161] = -1668168932;
        hn.cjzn[162] = 764507639;
        hn.cjzn[163] = 850562927;
        hn.cjzn[164] = 465662196;
        hn.cjzn[165] = -769342651;
        hn.cjzn[166] = -1555163078;
        hn.cjzn[167] = -1655957185;
        hn.cjzn[168] = -1899289787;
        hn.cjzn[169] = 621272349;
        hn.cjzn[170] = 1289908955;
        hn.cjzn[171] = -469134063;
        hn.cjzn[172] = 488371397;
        hn.cjzn[173] = -187138356;
        hn.cjzn[174] = -1693117504;
        hn.cjzn[175] = 482094170;
        hn.cjzn[176] = -1480620023;
        hn.cjzn[177] = 1972914322;
        hn.cjzn[178] = -10691755;
        hn.cjzn[179] = 368360542;
        hn.cjzn[180] = -591450633;
        hn.cjzn[181] = -1997032251;
        hn.cjzn[182] = -766799398;
        hn.cjzn[183] = 1260000780;
        hn.cjzn[184] = -2109862989;
        hn.cjzn[185] = 1372060239;
        hn.cjzn[186] = -1492477523;
        hn.cjzn[187] = 138487547;
        hn.cjzn[188] = -1426187654;
        hn.cjzn[189] = 169147403;
        hn.cjzn[190] = -1419113923;
        hn.cjzn[191] = -1741915082;
        hn.cjzn[192] = -1019709582;
        hn.cjzn[193] = -164154135;
        hn.cjzn[194] = -1154232215;
        hn.cjzn[195] = -1265025177;
        hn.cjzn[196] = 1147581924;
        hn.cjzn[197] = -2122926598;
        hn.cjzn[198] = -1904631342;
        hn.cjzn[199] = -437223480;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static hn getInstance() {
        block31: {
            v0 /* !! */  = hn.fz;
            block22: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -2023712282: {
                        v0 /* !! */  = (long)(hn.cjzi("cjzk", cjzf(int ), (int)1) - hn.cjzi("cjzj", cjzf(int ), (int)0));
                        continue block22;
                    }
                    case -841682887: {
                        break block22;
                    }
                }
                break;
            }
            var2 = hn.c;
            while (true) {
                block32: {
                    if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cjzl", cjzf(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != hn.cjzi("cjzq", cjzm(int ), (int)0)) break block32;
                    var1_1 /* !! */  = hn.b;
                    v2 /* !! */  = hn.fz;
                    if (true) ** GOTO lbl22
                }
                v1 /* !! */  = (long)hn.cjzi("cjzr", cjzm(int ), (int)1);
            }
            block24: while (true) {
                v2 /* !! */  = (long)(v3 - hn.cjzi("cjzt", cjzf(int ), (int)3));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2121711460: {
                        v3 = hn.cjzi("cjzu", cjzf(int ), (int)4);
                        continue block24;
                    }
                    case -841682887: {
                        break block24;
                    }
                    case 188112950: {
                        v3 = hn.cjzi("cjzv", cjzf(int ), (int)5);
                        continue block24;
                    }
                    case 1243124927: {
                        v3 = hn.cjzi("cjzw", cjzf(int ), (int)6);
                        continue block24;
                    }
                }
                break;
            }
            var0_2 = hn.a;
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block25: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2) {
                            throw null;
                        }
                        if (var0_2 != false) return null;
                        if (var0_2 != false) return null;
                        v4 /* !! */  = hn.fz;
                        block26: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -2088258351: {
                                    v5 = hn.cjzi("ckaa", cjzf(int ), (int)8);
                                    ** GOTO lbl57
                                }
                                case -970703359: {
                                    v5 = hn.cjzi("ckac", cjzf(int ), (int)9);
                                    ** GOTO lbl57
                                }
                                case -841682887: {
                                    return nj.get(hn.class);
                                }
                                case 1497942443: {
                                    v5 = hn.cjzi("ckae", cjzf(int ), (int)10);
lbl57:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - hn.cjzi("cjzy", cjzf(int ), (int)7));
                                    continue block26;
                                }
                            }
                            break;
                        }
                        return nj.get(hn.class);
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)hn.cjzi("ckah", cjzm(int ), (int)2);
                        cfr_temp_0 = 2;
                        if (!var2) continue block25;
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block31;
                    }
lbl69:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)hn.cjzi("ckai", cjzm(int ), (int)3);
                        cfr_temp_0 = 2;
                        if (!var2) continue block25;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)hn.cjzi("ckaj", cjzm(int ), (int)4);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)hn.cjzi("ckak", cjzm(int ), (int)5);
        ** while (!var2)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqzi() {
        hn.cjzh[800] = -6247768562375418500L;
        hn.cjzh[801] = 3361883380322176277L;
        hn.cjzh[802] = 3646792589322654426L;
        hn.cjzh[803] = 6947066621037780058L;
        hn.cjzh[804] = -8513583741037748622L;
        hn.cjzh[805] = 6605047704383836002L;
        hn.cjzh[806] = 5842794680199752695L;
        hn.cjzh[807] = -7912386130592069888L;
        hn.cjzh[808] = 3029890206464567209L;
        hn.cjzh[809] = 4658271497904726644L;
        hn.cjzh[810] = 8515362016387543527L;
        hn.cjzh[811] = 8055623659136022537L;
        hn.cjzh[812] = -8081377962161905780L;
        hn.cjzh[813] = -3967527297960237107L;
        hn.cjzh[814] = 5694872057672944476L;
        hn.cjzh[815] = -6363895846636247590L;
        hn.cjzh[816] = -2858226806233364154L;
        hn.cjzh[817] = -641943443066634490L;
        hn.cjzh[818] = -4906406953557651313L;
        hn.cjzh[819] = -6204134403986201188L;
        hn.cjzh[820] = -2062110575323399371L;
        hn.cjzh[821] = -247662895225152489L;
        hn.cjzh[822] = 3154826999733029441L;
        hn.cjzh[823] = 1932732298503520944L;
        hn.cjzh[824] = 2542939545344753540L;
        hn.cjzh[825] = 3843994881591306807L;
        hn.cjzh[826] = 3536914627254410883L;
        hn.cjzh[827] = -5572102015662538714L;
        hn.cjzh[828] = 6411775862392965295L;
        hn.cjzh[829] = 3875800566634440921L;
        hn.cjzh[830] = -1884983140630530885L;
        hn.cjzh[831] = 8582657349887758725L;
        hn.cjzh[832] = 6823284883920282637L;
        hn.cjzh[833] = 4115283513758730263L;
        hn.cjzh[834] = 1581803660130552746L;
        hn.cjzh[835] = 5878133205524322983L;
        hn.cjzh[836] = -6304350330972209715L;
        hn.cjzh[837] = 3806548087974803447L;
        hn.cjzh[838] = -6592803300785933156L;
        hn.cjzh[839] = 2179689172147449906L;
    }

    private static /* synthetic */ void cqvw() {
        hn.cjzo[1000] = 1706253847;
        hn.cjzo[1001] = 1301128512;
        hn.cjzo[1002] = -1657546202;
        hn.cjzo[1003] = -348972812;
        hn.cjzo[1004] = 160950916;
        hn.cjzo[1005] = -384660610;
        hn.cjzo[1006] = -686443926;
        hn.cjzo[1007] = 352603526;
        hn.cjzo[1008] = -948207121;
        hn.cjzo[1009] = 319189627;
        hn.cjzo[1010] = 1333904169;
        hn.cjzo[1011] = -2045497707;
        hn.cjzo[1012] = 1590756810;
        hn.cjzo[1013] = 1624542479;
        hn.cjzo[1014] = -939730073;
        hn.cjzo[1015] = -1434620405;
        hn.cjzo[1016] = -1192293188;
        hn.cjzo[1017] = -1420524859;
        hn.cjzo[1018] = -188687009;
        hn.cjzo[1019] = 390906624;
        hn.cjzo[1020] = 53027526;
        hn.cjzo[1021] = 409851089;
        hn.cjzo[1022] = -1474972526;
        hn.cjzo[1023] = 518498363;
        hn.cjzo[1024] = 1198096242;
        hn.cjzo[1025] = 1043147312;
        hn.cjzo[1026] = 1308301602;
        hn.cjzo[1027] = -415105288;
        hn.cjzo[1028] = 368274252;
        hn.cjzo[1029] = 815774221;
        hn.cjzo[1030] = -1067797409;
        hn.cjzo[1031] = -528180757;
        hn.cjzo[1032] = 1256327313;
        hn.cjzo[1033] = -1626310554;
        hn.cjzo[1034] = 257915554;
        hn.cjzo[1035] = 878900356;
        hn.cjzo[1036] = 1660842790;
        hn.cjzo[1037] = 1624828143;
        hn.cjzo[1038] = 906514009;
        hn.cjzo[1039] = 360618612;
        hn.cjzo[1040] = 2109959115;
        hn.cjzo[1041] = -2001617866;
        hn.cjzo[1042] = -707182493;
        hn.cjzo[1043] = 253428592;
        hn.cjzo[1044] = 1964245648;
        hn.cjzo[1045] = 1435343623;
        hn.cjzo[1046] = -1896873570;
        hn.cjzo[1047] = -263395531;
        hn.cjzo[1048] = 1905128583;
        hn.cjzo[1049] = -741686255;
        hn.cjzo[1050] = -1057662531;
        hn.cjzo[1051] = 1190940107;
        hn.cjzo[1052] = 465023162;
        hn.cjzo[1053] = 1328439241;
        hn.cjzo[1054] = -290539682;
        hn.cjzo[1055] = -1228873715;
        hn.cjzo[1056] = 970274911;
        hn.cjzo[1057] = -1880707443;
        hn.cjzo[1058] = 1854942555;
        hn.cjzo[1059] = -1307296665;
        hn.cjzo[1060] = -550613430;
        hn.cjzo[1061] = 1627354381;
        hn.cjzo[1062] = -404721313;
        hn.cjzo[1063] = 567170017;
        hn.cjzo[1064] = -1354520158;
        hn.cjzo[1065] = -813282586;
        hn.cjzo[1066] = -1962561604;
        hn.cjzo[1067] = -2086923427;
        hn.cjzo[1068] = 1964515287;
        hn.cjzo[1069] = -1789743217;
        hn.cjzo[1070] = 1168853116;
        hn.cjzo[1071] = -1402938084;
        hn.cjzo[1072] = -141690413;
        hn.cjzo[1073] = 54528376;
        hn.cjzo[1074] = 98421173;
        hn.cjzo[1075] = 460822150;
        hn.cjzo[1076] = -2027427729;
        hn.cjzo[1077] = -1427770512;
        hn.cjzo[1078] = -1556366559;
        hn.cjzo[1079] = 533745194;
        hn.cjzo[1080] = -226472920;
        hn.cjzo[1081] = -776111034;
        hn.cjzo[1082] = 1076825837;
        hn.cjzo[1083] = -1271677438;
        hn.cjzo[1084] = 79741969;
        hn.cjzo[1085] = 359152819;
        hn.cjzo[1086] = 805841;
        hn.cjzo[1087] = 751185404;
        hn.cjzo[1088] = 1200568331;
        hn.cjzo[1089] = 1958242167;
        hn.cjzo[1090] = 926008416;
        hn.cjzo[1091] = -1720223051;
        hn.cjzo[1092] = -947596748;
        hn.cjzo[1093] = 1768372161;
        hn.cjzo[1094] = -1055756383;
        hn.cjzo[1095] = 265041732;
        hn.cjzo[1096] = -1716502994;
        hn.cjzo[1097] = -897774866;
        hn.cjzo[1098] = -494053772;
        hn.cjzo[1099] = 1163569176;
    }

    private static /* synthetic */ void cqry() {
        hn.cjzn[200] = 1044523371;
        hn.cjzn[201] = -1573948867;
        hn.cjzn[202] = 783145390;
        hn.cjzn[203] = -605205326;
        hn.cjzn[204] = 1310284483;
        hn.cjzn[205] = 342941160;
        hn.cjzn[206] = 1120178923;
        hn.cjzn[207] = -1295228468;
        hn.cjzn[208] = 317398357;
        hn.cjzn[209] = -1865032896;
        hn.cjzn[210] = -124021604;
        hn.cjzn[211] = 916614740;
        hn.cjzn[212] = 1606022553;
        hn.cjzn[213] = -618423601;
        hn.cjzn[214] = 1589436905;
        hn.cjzn[215] = 1153578848;
        hn.cjzn[216] = 92391565;
        hn.cjzn[217] = 1543786769;
        hn.cjzn[218] = -25623308;
        hn.cjzn[219] = -1444145014;
        hn.cjzn[220] = -429586819;
        hn.cjzn[221] = -551754207;
        hn.cjzn[222] = -527211223;
        hn.cjzn[223] = 1335143937;
        hn.cjzn[224] = 1799734067;
        hn.cjzn[225] = 1091241233;
        hn.cjzn[226] = -544456514;
        hn.cjzn[227] = 992518216;
        hn.cjzn[228] = 1867674709;
        hn.cjzn[229] = 969616266;
        hn.cjzn[230] = 389618213;
        hn.cjzn[231] = 470802753;
        hn.cjzn[232] = 961889233;
        hn.cjzn[233] = -975396475;
        hn.cjzn[234] = 1259712254;
        hn.cjzn[235] = -1198336057;
        hn.cjzn[236] = 1410346996;
        hn.cjzn[237] = -445416909;
        hn.cjzn[238] = -2134586133;
        hn.cjzn[239] = 182992459;
        hn.cjzn[240] = -1528862401;
        hn.cjzn[241] = -882441642;
        hn.cjzn[242] = -1680238967;
        hn.cjzn[243] = -421872715;
        hn.cjzn[244] = 1434363131;
        hn.cjzn[245] = 395133976;
        hn.cjzn[246] = 678891162;
        hn.cjzn[247] = 1776383914;
        hn.cjzn[248] = 1248154939;
        hn.cjzn[249] = 807042230;
        hn.cjzn[250] = 1826421876;
        hn.cjzn[251] = -1552470318;
        hn.cjzn[252] = 1845034419;
        hn.cjzn[253] = 900051026;
        hn.cjzn[254] = 1540783067;
        hn.cjzn[255] = -164656201;
        hn.cjzn[256] = 18093848;
        hn.cjzn[257] = -1008617217;
        hn.cjzn[258] = -1133522559;
        hn.cjzn[259] = -742209671;
        hn.cjzn[260] = 106116439;
        hn.cjzn[261] = -1205044695;
        hn.cjzn[262] = 1134449186;
        hn.cjzn[263] = 323213167;
        hn.cjzn[264] = 1451320833;
        hn.cjzn[265] = 1963727278;
        hn.cjzn[266] = -69307681;
        hn.cjzn[267] = 691383003;
        hn.cjzn[268] = -996673115;
        hn.cjzn[269] = -1731435940;
        hn.cjzn[270] = 175724663;
        hn.cjzn[271] = -1317520354;
        hn.cjzn[272] = 777333709;
        hn.cjzn[273] = 1273804145;
        hn.cjzn[274] = 459568643;
        hn.cjzn[275] = -1152484699;
        hn.cjzn[276] = 1588616912;
        hn.cjzn[277] = 1009856143;
        hn.cjzn[278] = -1060957310;
        hn.cjzn[279] = 474632845;
        hn.cjzn[280] = 682221290;
        hn.cjzn[281] = 19914212;
        hn.cjzn[282] = 993708460;
        hn.cjzn[283] = 939282730;
        hn.cjzn[284] = 912220329;
        hn.cjzn[285] = 559758192;
        hn.cjzn[286] = 432623244;
        hn.cjzn[287] = 1813557547;
        hn.cjzn[288] = 1093512615;
        hn.cjzn[289] = -1188480505;
        hn.cjzn[290] = 735781394;
        hn.cjzn[291] = -207893202;
        hn.cjzn[292] = 121320959;
        hn.cjzn[293] = 49322953;
        hn.cjzn[294] = 1950871455;
        hn.cjzn[295] = 596918032;
        hn.cjzn[296] = -1873905708;
        hn.cjzn[297] = -1264816843;
        hn.cjzn[298] = 1355987255;
        hn.cjzn[299] = 1910058852;
    }

    private static /* synthetic */ void cqyp() {
        hn.cjzg[800] = 2376097018362796090L;
        hn.cjzg[801] = -7788719368320651597L;
        hn.cjzg[802] = 2577011557190622448L;
        hn.cjzg[803] = 6254227336437781166L;
        hn.cjzg[804] = -2927838315467531821L;
        hn.cjzg[805] = -7294820921576162416L;
        hn.cjzg[806] = 2690525912675146908L;
        hn.cjzg[807] = -4538873023987837362L;
        hn.cjzg[808] = 4493347083341909020L;
        hn.cjzg[809] = -3545222061696009205L;
        hn.cjzg[810] = -5202789741472764223L;
        hn.cjzg[811] = 6237678627776184006L;
        hn.cjzg[812] = 212253292410237896L;
        hn.cjzg[813] = -8870178867318059815L;
        hn.cjzg[814] = 3216593308240371972L;
        hn.cjzg[815] = -4711101211851173622L;
        hn.cjzg[816] = 7030513526299551767L;
        hn.cjzg[817] = 792413939620854859L;
        hn.cjzg[818] = -7635154349423830929L;
        hn.cjzg[819] = -2840188091429603141L;
        hn.cjzg[820] = -2693614856062771708L;
        hn.cjzg[821] = -7087747155583767357L;
        hn.cjzg[822] = 5735233219532289738L;
        hn.cjzg[823] = 7296233845894012479L;
        hn.cjzg[824] = 442837114012248276L;
        hn.cjzg[825] = -7467007076240846066L;
        hn.cjzg[826] = 7288539725415783009L;
        hn.cjzg[827] = -8371177607883750635L;
        hn.cjzg[828] = -1428355761928508080L;
        hn.cjzg[829] = 1654550548498972218L;
        hn.cjzg[830] = 6005726433993107228L;
        hn.cjzg[831] = 4525197893289330894L;
        hn.cjzg[832] = 4834239634972150724L;
        hn.cjzg[833] = -6203736898151153351L;
        hn.cjzg[834] = -1415731064409900740L;
        hn.cjzg[835] = 190725470197083817L;
        hn.cjzg[836] = 5099153163159432217L;
        hn.cjzg[837] = 3822525040260153946L;
        hn.cjzg[838] = -1669740950711228987L;
        hn.cjzg[839] = -180142292956630804L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float attackDistance() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("ckxj", cjzf(int ), (int)108));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -892996143: {
                    v1 = hn.cjzi("ckxk", cjzf(int ), (int)109);
                    continue block17;
                }
                case -841682887: {
                    break block17;
                }
                case -306539227: {
                    v1 = hn.cjzi("ckxl", cjzf(int ), (int)110);
                    continue block17;
                }
                case 1787819041: {
                    v1 = hn.cjzi("ckxm", cjzf(int ), (int)111);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("ckxn", cjzf(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("ckxo", cjzm(int ), (int)377)) break;
            v2 /* !! */  = (long)hn.cjzi("ckxp", cjzm(int ), (int)378);
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("ckxq", cjzf(int ), (int)113));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1071344291: {
                    v4 = hn.cjzi("ckxr", cjzf(int ), (int)114);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case -264727011: {
                    v4 = hn.cjzi("ckxs", cjzf(int ), (int)115);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (float)hn.cjzi("ckxt", ckbd(int ), (int)379);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckxu", cjzf(int ), (int)116)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("ckxv", cjzm(int ), (int)380)) break;
                    v5 /* !! */  = (long)hn.cjzi("ckxw", cjzm(int ), (int)381);
                }
                return this.effectiveAttackDistance();
            }
lbl55:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("ckxx", cjzm(int ), (int)382);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("ckxy", cjzm(int ), (int)383);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("ckxz", cjzm(int ), (int)384);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("ckya", cjzm(int ), (int)385);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getTargetType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cplj", cjzf(int ), (int)609)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cplk", cjzm(int ), (int)1287)) break;
            v0 /* !! */  = (long)hn.cjzi("cpll", cjzm(int ), (int)1288);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cplm", cjzf(int ), (int)610));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1562045751: {
                    v2 = hn.cjzi("cpln", cjzf(int ), (int)611);
                    continue block18;
                }
                case -841682887: {
                    break block18;
                }
                case 641908307: {
                    v2 = hn.cjzi("cplo", cjzf(int ), (int)612);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cplp", cjzf(int ), (int)613));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -996128123: {
                    v4 = hn.cjzi("cplq", cjzf(int ), (int)614);
                    continue block19;
                }
                case -845837035: {
                    v4 = hn.cjzi("cplr", cjzf(int ), (int)615);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case -45763224: {
                    v4 = hn.cjzi("cpls", cjzf(int ), (int)616);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = hn.a;
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

                if (var1_3 || var1_3) continue block20;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cplt", cjzf(int ), (int)617)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cplu", cjzm(int ), (int)1289)) break;
                    v5 /* !! */  = (long)hn.cjzi("cplv", cjzm(int ), (int)1290);
                }
                return this.targetType;
lbl53:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hn.cjzi("cplw", cjzm(int ), (int)1291);
                    if (!var3_1) break block20;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)hn.cjzi("cplx", cjzm(int ), (int)1292);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)hn.cjzi("cply", cjzm(int ), (int)1293);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cplz", cjzm(int ), (int)1294);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void applyLegitAimFrame() {
        var7_1 = hn.c;
        var6_2 /* !! */  = hn.b;
        var5_3 = hn.a;
        if (var7_1) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!this.isState()) ** GOTO lbl24
                if (var5_3) ** GOTO lbl6
                if (!this.aimType.isSelected("Legit")) ** GOTO lbl24
                if (var5_3) ** GOTO lbl6
                if (this.target == null) ** GOTO lbl24
                if (var5_3) ** GOTO lbl6
                if (hn.mc.field_1724 == null) ** GOTO lbl24
                if (var5_3) ** GOTO lbl6
                if (hn.mc.field_1687 == null) ** GOTO lbl24
                if (var5_3) ** GOTO lbl6
                if (hn.mc.field_1755 == null) ** GOTO lbl28
                if (var5_3) ** GOTO lbl6
lbl24:
                // 6 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                this.legitSmooth.pauseFrameClock();
                if (var5_3 || var5_3) ** GOTO lbl6
                return;
lbl28:
                // 1 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var1_4 = ow.cameraAngle();
                if (var5_3 || var5_3) ** GOTO lbl6
                var2_5 = this.target.method_73189().method_1031(0.0, (double)this.target.method_17682() * hn.cjzi("coln", clov(int ), (int)355), 0.0);
                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = ow.fromVec3d(var2_5.method_1020(hn.mc.field_1724.method_33571()));
                if (var5_3 || var5_3) ** GOTO lbl6
                var4_7 = this.legitSmooth.limitAngleChange(var1_4, var3_6, var3_6.toVector(), (class_1297)this.target);
                if (var5_3 || var5_3) ** GOTO lbl6
                this.legitSmooth.applyAsMouseInput(var1_4, var4_7, this.legitPitch.isValue());
                if (var5_3 || var5_3) ** GOTO lbl6
                if (!this.legitSmooth.consumeMissSwing()) ** GOTO lbl43
                if (var5_3 || var5_3) ** GOTO lbl6
                d.getInstance().getManager().getAttackPerpetrator().getAttackHandler().performLegitAirSwing(this);
                if (var5_3) ** GOTO lbl6
lbl43:
                // 2 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_2 /* !! */  = (int)hn.cjzi("colo", cjzm(int ), (int)869);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                var6_2 /* !! */  = (int)hn.cjzi("colp", cjzm(int ), (int)870);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl56:
            // 3 sources

            case 2: {
                var6_2 /* !! */  = (int)hn.cjzi("colq", cjzm(int ), (int)871);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl61:
            // 2 sources

            case 3: {
                var6_2 /* !! */  = (int)hn.cjzi("colr", cjzm(int ), (int)872);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl66:
            // 4 sources

            case 4: {
                var6_2 /* !! */  = (int)hn.cjzi("cols", cjzm(int ), (int)873);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 5: {
                var6_2 /* !! */  = (int)hn.cjzi("colt", cjzm(int ), (int)874);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var6_2 /* !! */  = (int)hn.cjzi("colu", cjzm(int ), (int)875);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl81:
            // 2 sources

            case 7: {
                var6_2 /* !! */  = (int)hn.cjzi("colv", cjzm(int ), (int)876);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl86:
            // 4 sources

            case 8: {
                do {
                    var6_2 /* !! */  = (int)hn.cjzi("colw", cjzm(int ), (int)877);
                } while (!var7_1);
                throw null;
            }
lbl91:
            // 2 sources

            case 9: {
                var6_2 /* !! */  = (int)hn.cjzi("colx", cjzm(int ), (int)878);
                if (!var7_1) ** GOTO lbl66
                throw null;
            }
lbl95:
            // 3 sources

            case 10: {
                var6_2 /* !! */  = (int)hn.cjzi("coly", cjzm(int ), (int)879);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl100:
            // 3 sources

            case 11: {
                var6_2 /* !! */  = (int)hn.cjzi("colz", cjzm(int ), (int)880);
                if (!var7_1) ** GOTO lbl95
                throw null;
            }
            case 12: {
                var6_2 /* !! */  = (int)hn.cjzi("coma", cjzm(int ), (int)881);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)hn.cjzi("comb", cjzm(int ), (int)882);
                    if (!var7_1) ** GOTO lbl66
                    throw null;
                }
            }
            case 14: {
                var6_2 /* !! */  = (int)hn.cjzi("comc", cjzm(int ), (int)883);
                if (!var7_1) ** GOTO lbl56
                throw null;
            }
            case 15: {
                var6_2 /* !! */  = (int)hn.cjzi("comd", cjzm(int ), (int)884);
                if (!var7_1) ** GOTO lbl81
                throw null;
            }
            case 16: {
                var6_2 /* !! */  = (int)hn.cjzi("come", cjzm(int ), (int)885);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl127:
            // 3 sources

            case 17: {
                var6_2 /* !! */  = (int)hn.cjzi("comf", cjzm(int ), (int)886);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl132:
            // 3 sources

            case 18: {
                var6_2 /* !! */  = (int)hn.cjzi("comg", cjzm(int ), (int)887);
                if (!var7_1) ** GOTO lbl127
                throw null;
            }
lbl136:
            // 3 sources

            case 19: {
                var6_2 /* !! */  = (int)hn.cjzi("comh", cjzm(int ), (int)888);
                if (var7_1) {
                    throw null;
                }
            }
lbl140:
            // 4 sources

            case 20: {
                var6_2 /* !! */  = (int)hn.cjzi("comi", cjzm(int ), (int)889);
                if (!var7_1) ** GOTO lbl86
                throw null;
            }
lbl144:
            // 2 sources

            case 21: {
                var6_2 /* !! */  = (int)hn.cjzi("comj", cjzm(int ), (int)890);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 22: {
                var6_2 /* !! */  = (int)hn.cjzi("comk", cjzm(int ), (int)891);
                if (!var7_1) ** GOTO lbl56
                throw null;
            }
lbl153:
            // 2 sources

            case 23: {
                var6_2 /* !! */  = (int)hn.cjzi("coml", cjzm(int ), (int)892);
                if (!var7_1) ** GOTO lbl86
                throw null;
            }
            case 24: {
                var6_2 /* !! */  = (int)hn.cjzi("comm", cjzm(int ), (int)893);
                if (!var7_1) ** GOTO lbl91
                throw null;
            }
lbl161:
            // 2 sources

            case 25: {
                var6_2 /* !! */  = (int)hn.cjzi("comn", cjzm(int ), (int)894);
                if (!var7_1) ** GOTO lbl132
                throw null;
            }
lbl165:
            // 2 sources

            case 26: {
                var6_2 /* !! */  = (int)hn.cjzi("como", cjzm(int ), (int)895);
                if (!var7_1) ** GOTO lbl61
                throw null;
            }
            case 27: {
                do {
                    var6_2 /* !! */  = (int)hn.cjzi("comp", cjzm(int ), (int)896);
                } while (!var7_1);
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var6_2 /* !! */  = (int)hn.cjzi("comq", cjzm(int ), (int)897);
                if (!var7_1) ** GOTO lbl132
                throw null;
            }
lbl178:
            // 2 sources

            case 29: {
                var6_2 /* !! */  = (int)hn.cjzi("comr", cjzm(int ), (int)898);
                if (!var7_1) ** GOTO lbl100
                throw null;
            }
            case 30: {
                var6_2 /* !! */  = (int)hn.cjzi("coms", cjzm(int ), (int)899);
                if (!var7_1) ** GOTO lbl66
                throw null;
            }
            case 31: 
        }
        var6_2 /* !! */  = (int)hn.cjzi("comt", cjzm(int ), (int)900);
        ** while (!var7_1)
lbl189:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getMovementCorrection() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpng", cjzf(int ), (int)628)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpnh", cjzm(int ), (int)1317)) break;
            v0 /* !! */  = (long)hn.cjzi("cpni", cjzm(int ), (int)1318);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpnj", cjzf(int ), (int)629)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpnk", cjzm(int ), (int)1319)) break;
            v1 /* !! */  = (long)hn.cjzi("cpnl", cjzm(int ), (int)1320);
        }
        var2_2 = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpnm", cjzf(int ), (int)630));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1065199007: {
                    v3 = hn.cjzi("cpnn", cjzf(int ), (int)631);
                    continue block13;
                }
                case -841682887: {
                    break block13;
                }
                case 133423659: {
                    v3 = hn.cjzi("cpno", cjzf(int ), (int)632);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = hn.fz;
        if (true) ** GOTO lbl38
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - hn.cjzi("cpnp", cjzf(int ), (int)633));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1381163796: {
                    v5 = hn.cjzi("cpnq", cjzf(int ), (int)634);
                    continue block15;
                }
                case -841682887: {
                    break block15;
                }
                case 1428116418: {
                    v5 = hn.cjzi("cpnr", cjzf(int ), (int)635);
                    continue block15;
                }
                case 1930205377: {
                    v5 = hn.cjzi("cpns", cjzf(int ), (int)636);
                    continue block15;
                }
            }
            break;
        }
        return this.movementCorrection;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$8() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqfc", cjzf(int ), (int)719)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cqfd", cjzm(int ), (int)1393)) break;
            v0 /* !! */  = (long)hn.cjzi("cqff", cjzm(int ), (int)1394);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqfg", cjzf(int ), (int)720)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cqfi", cjzm(int ), (int)1395)) break;
            v1 /* !! */  = (long)hn.cjzi("cqfj", cjzm(int ), (int)1396);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqfk", cjzf(int ), (int)721)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cqfm", cjzm(int ), (int)1397)) break;
            v2 /* !! */  = (long)hn.cjzi("cqfn", cjzm(int ), (int)1398);
        }
        var1_3 = hn.a;
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
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl34
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("cqfp", cjzf(int ), (int)722));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1712646046: {
                            v4 = hn.cjzi("cqfr", cjzf(int ), (int)723);
                            continue block19;
                        }
                        case -841682887: {
                            break block19;
                        }
                        case 1517297064: {
                            v4 = hn.cjzi("cqfs", cjzf(int ), (int)724);
                            continue block19;
                        }
                    }
                    break;
                }
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl47
                block20: while (true) {
                    v5 /* !! */  = (long)(hn.cjzi("cqfv", cjzf(int ), (int)726) - hn.cjzi("cqfu", cjzf(int ), (int)725));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -841682887: {
                            break block20;
                        }
                        case 2129559638: {
                            continue block20;
                        }
                    }
                    break;
                }
                v6 = this.autoMace.isValue();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cqfx", cjzf(int ), (int)727)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hn.cjzi("cqfy", cjzm(int ), (int)1399)) break;
                    v7 /* !! */  = (long)hn.cjzi("cqgb", cjzm(int ), (int)1400);
                }
                return v6;
            }
lbl60:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqgc", cjzm(int ), (int)1401);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqge", cjzm(int ), (int)1402);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqgf", cjzm(int ), (int)1403);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cqgh", cjzm(int ), (int)1404);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$4() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqke", cjzf(int ), (int)771)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cqkf", cjzm(int ), (int)1429)) break;
            v0 /* !! */  = (long)hn.cjzi("cqkg", cjzm(int ), (int)1430);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cqkh", cjzf(int ), (int)772));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2126108253: {
                    v2 = hn.cjzi("cqki", cjzf(int ), (int)773);
                    continue block22;
                }
                case -1650585912: {
                    v2 = hn.cjzi("cqkj", cjzf(int ), (int)774);
                    continue block22;
                }
                case -841682887: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cqkk", cjzf(int ), (int)775));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1644142210: {
                    v4 = hn.cjzi("cqkm", cjzf(int ), (int)776);
                    continue block23;
                }
                case -1496995970: {
                    v4 = hn.cjzi("cqko", cjzf(int ), (int)777);
                    continue block23;
                }
                case -841682887: {
                    break block23;
                }
                case 1458040249: {
                    v4 = hn.cjzi("cqkp", cjzf(int ), (int)778);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = hn.a;
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
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqkt", cjzf(int ), (int)779)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cqku", cjzm(int ), (int)1431)) break;
                    v5 /* !! */  = (long)hn.cjzi("cqkw", cjzm(int ), (int)1432);
                }
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl57
                block26: while (true) {
                    v6 /* !! */  = (long)(hn.cjzi("cqla", cjzf(int ), (int)781) - hn.cjzi("cqky", cjzf(int ), (int)780));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1478718514: {
                            continue block26;
                        }
                        case -841682887: {
                            break block26;
                        }
                    }
                    break;
                }
                v7 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqlc", cjzf(int ), (int)782)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hn.cjzi("cqld", cjzm(int ), (int)1433)) break;
                    v8 /* !! */  = (long)hn.cjzi("cqlf", cjzm(int ), (int)1434);
                }
                return v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cqlg", cjzm(int ), (int)1435);
                if (var3_1) {
                    throw null;
                }
            }
lbl74:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cqli", cjzm(int ), (int)1436);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqlk", cjzm(int ), (int)1437);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cqlm", cjzm(int ), (int)1438);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cqzd() {
        hn.cjzh[400] = -8937096624604163065L;
        hn.cjzh[401] = -8487446048596880007L;
        hn.cjzh[402] = -3784197358683065243L;
        hn.cjzh[403] = -7443183759882504904L;
        hn.cjzh[404] = -7266418393586308236L;
        hn.cjzh[405] = -4374409678480166537L;
        hn.cjzh[406] = 3327659898025195139L;
        hn.cjzh[407] = 551264962524538080L;
        hn.cjzh[408] = -1199825819059660663L;
        hn.cjzh[409] = 6844525435308828075L;
        hn.cjzh[410] = 999053045981895167L;
        hn.cjzh[411] = -8915971033151810588L;
        hn.cjzh[412] = -4791238881576789925L;
        hn.cjzh[413] = -5978943659882681768L;
        hn.cjzh[414] = -3582590914127314108L;
        hn.cjzh[415] = -3823167385886464322L;
        hn.cjzh[416] = -8019409976574639786L;
        hn.cjzh[417] = 1040172415530954270L;
        hn.cjzh[418] = 7321470439976871226L;
        hn.cjzh[419] = 7160162349642827227L;
        hn.cjzh[420] = 61681787968452684L;
        hn.cjzh[421] = 2857046360536292253L;
        hn.cjzh[422] = -4226239217472293155L;
        hn.cjzh[423] = 2096578203276455999L;
        hn.cjzh[424] = 7072738170871925946L;
        hn.cjzh[425] = 5519730110773158280L;
        hn.cjzh[426] = 6144702224800924686L;
        hn.cjzh[427] = 4479086912679626970L;
        hn.cjzh[428] = -2220215577517210938L;
        hn.cjzh[429] = -2410358818747784104L;
        hn.cjzh[430] = -9102951380886271334L;
        hn.cjzh[431] = -6903364941739819597L;
        hn.cjzh[432] = -1567736792969283061L;
        hn.cjzh[433] = 8655708077895133097L;
        hn.cjzh[434] = -6515913482430340756L;
        hn.cjzh[435] = 8029553121542592517L;
        hn.cjzh[436] = 2125283934840232699L;
        hn.cjzh[437] = -665830488861090237L;
        hn.cjzh[438] = -88782817582246377L;
        hn.cjzh[439] = 1853853241126846385L;
        hn.cjzh[440] = 4564239709624882569L;
        hn.cjzh[441] = 2559665814622573901L;
        hn.cjzh[442] = -8210309161228505020L;
        hn.cjzh[443] = -7010539966517313424L;
        hn.cjzh[444] = 8639397665018605447L;
        hn.cjzh[445] = -8870022991938628398L;
        hn.cjzh[446] = -4055376307589584306L;
        hn.cjzh[447] = 9013939934559783052L;
        hn.cjzh[448] = -3060506444177781347L;
        hn.cjzh[449] = 8865277250213097853L;
        hn.cjzh[450] = 3038078176635691768L;
        hn.cjzh[451] = -6562711743690345945L;
        hn.cjzh[452] = 3393290552020925002L;
        hn.cjzh[453] = 8816167339927374453L;
        hn.cjzh[454] = 1179121215392938279L;
        hn.cjzh[455] = -4730791247718743022L;
        hn.cjzh[456] = -2768576048000572414L;
        hn.cjzh[457] = 998849242448666709L;
        hn.cjzh[458] = 6603376066929116197L;
        hn.cjzh[459] = 8764267503320144903L;
        hn.cjzh[460] = 7987638039326914908L;
        hn.cjzh[461] = 1351705706544537745L;
        hn.cjzh[462] = 5917974242680142909L;
        hn.cjzh[463] = -9002455691877516461L;
        hn.cjzh[464] = 6550210312881622986L;
        hn.cjzh[465] = -6135382153568694337L;
        hn.cjzh[466] = -7193141792608343006L;
        hn.cjzh[467] = -1908163944812221213L;
        hn.cjzh[468] = 7497150398583076354L;
        hn.cjzh[469] = 3477076661172633078L;
        hn.cjzh[470] = 9098840461112943925L;
        hn.cjzh[471] = -2342299222130789496L;
        hn.cjzh[472] = -246628068792199785L;
        hn.cjzh[473] = 4736924457934438687L;
        hn.cjzh[474] = 51822495618084780L;
        hn.cjzh[475] = 4318209958342891680L;
        hn.cjzh[476] = -1529070539826842765L;
        hn.cjzh[477] = 5212581612761821101L;
        hn.cjzh[478] = -3607587839056247272L;
        hn.cjzh[479] = 2059430460365784564L;
        hn.cjzh[480] = -4129500729058068904L;
        hn.cjzh[481] = -9173721508211032478L;
        hn.cjzh[482] = 7334986699866302321L;
        hn.cjzh[483] = -4747558786142728686L;
        hn.cjzh[484] = -1741519852343165447L;
        hn.cjzh[485] = -6504683482530251778L;
        hn.cjzh[486] = 996911490772952211L;
        hn.cjzh[487] = -5013001027605186556L;
        hn.cjzh[488] = -6801303511693440545L;
        hn.cjzh[489] = 6464626481322433092L;
        hn.cjzh[490] = -1433261220137852053L;
        hn.cjzh[491] = 8197601120000591212L;
        hn.cjzh[492] = -8758461040102215842L;
        hn.cjzh[493] = -328126492146860528L;
        hn.cjzh[494] = -5139307596616637084L;
        hn.cjzh[495] = -6670303553780199068L;
        hn.cjzh[496] = 1414253781933754334L;
        hn.cjzh[497] = -7480773952242704897L;
        hn.cjzh[498] = 2593711365034430115L;
        hn.cjzh[499] = -5200459092081469900L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getLookrange() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpku", cjzf(int ), (int)600));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1371299777: {
                    v1 = hn.cjzi("cpkv", cjzf(int ), (int)601);
                    continue block20;
                }
                case -841682887: {
                    break block20;
                }
                case 1627036841: {
                    v1 = hn.cjzi("cpkw", cjzf(int ), (int)602);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("cpky", cjzf(int ), (int)604) - hn.cjzi("cpkx", cjzf(int ), (int)603));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block21;
                }
                case -521326381: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpkz", cjzf(int ), (int)605)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("cpla", cjzm(int ), (int)1281)) break;
            v3 /* !! */  = (long)hn.cjzi("cplb", cjzm(int ), (int)1282);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl45
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cplc", cjzf(int ), (int)606));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block24;
                        }
                        case 432822629: {
                            v5 = hn.cjzi("cpld", cjzf(int ), (int)607);
                            continue block24;
                        }
                        case 1728093003: {
                            v5 = hn.cjzi("cple", cjzf(int ), (int)608);
                            continue block24;
                        }
                    }
                    break;
                }
                return this.lookrange;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cplf", cjzm(int ), (int)1283);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cplg", cjzm(int ), (int)1284);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cplh", cjzm(int ), (int)1285);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpli", cjzm(int ), (int)1286);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cqwe() {
        hn.cjzo[1300] = 1426429226;
        hn.cjzo[1301] = 1432924621;
        hn.cjzo[1302] = 1579803793;
        hn.cjzo[1303] = 1934653519;
        hn.cjzo[1304] = 1934025036;
        hn.cjzo[1305] = 1432010369;
        hn.cjzo[1306] = 679099505;
        hn.cjzo[1307] = 684762912;
        hn.cjzo[1308] = -1271213316;
        hn.cjzo[1309] = -1895966677;
        hn.cjzo[1310] = 1547476192;
        hn.cjzo[1311] = -632699367;
        hn.cjzo[1312] = -430103631;
        hn.cjzo[1313] = -1239649378;
        hn.cjzo[1314] = 980072319;
        hn.cjzo[1315] = 519816264;
        hn.cjzo[1316] = 923482631;
        hn.cjzo[1317] = 909603344;
        hn.cjzo[1318] = 1692560367;
        hn.cjzo[1319] = -1845689765;
        hn.cjzo[1320] = -414089157;
        hn.cjzo[1321] = 269649089;
        hn.cjzo[1322] = -2145773015;
        hn.cjzo[1323] = 810992169;
        hn.cjzo[1324] = 1857666974;
        hn.cjzo[1325] = 675135377;
        hn.cjzo[1326] = 165358187;
        hn.cjzo[1327] = 1295158437;
        hn.cjzo[1328] = -1117756921;
        hn.cjzo[1329] = -1820874396;
        hn.cjzo[1330] = -1614137073;
        hn.cjzo[1331] = -2014639957;
        hn.cjzo[1332] = -1338130172;
        hn.cjzo[1333] = -297943713;
        hn.cjzo[1334] = 2057073941;
        hn.cjzo[1335] = -2095188992;
        hn.cjzo[1336] = -660074166;
        hn.cjzo[1337] = 1952472258;
        hn.cjzo[1338] = 671378282;
        hn.cjzo[1339] = 2092047994;
        hn.cjzo[1340] = -1155471799;
        hn.cjzo[1341] = 507327747;
        hn.cjzo[1342] = 124215448;
        hn.cjzo[1343] = -297136350;
        hn.cjzo[1344] = 1564799998;
        hn.cjzo[1345] = 1008229981;
        hn.cjzo[1346] = -1377893348;
        hn.cjzo[1347] = -1720687555;
        hn.cjzo[1348] = 2097369651;
        hn.cjzo[1349] = -441804760;
        hn.cjzo[1350] = -1716757775;
        hn.cjzo[1351] = 1319462322;
        hn.cjzo[1352] = 1099646784;
        hn.cjzo[1353] = -1537375715;
        hn.cjzo[1354] = -23352175;
        hn.cjzo[1355] = 1565689211;
        hn.cjzo[1356] = -1266648438;
        hn.cjzo[1357] = 145412533;
        hn.cjzo[1358] = -1357430378;
        hn.cjzo[1359] = -134616783;
        hn.cjzo[1360] = -187298103;
        hn.cjzo[1361] = 1413952115;
        hn.cjzo[1362] = -1288854555;
        hn.cjzo[1363] = -2040487934;
        hn.cjzo[1364] = -1978188997;
        hn.cjzo[1365] = -1087047814;
        hn.cjzo[1366] = 231214315;
        hn.cjzo[1367] = 1590278095;
        hn.cjzo[1368] = 995871122;
        hn.cjzo[1369] = 1670653365;
        hn.cjzo[1370] = 532253687;
        hn.cjzo[1371] = -238224694;
        hn.cjzo[1372] = 890650209;
        hn.cjzo[1373] = 1624547130;
        hn.cjzo[1374] = 1031088004;
        hn.cjzo[1375] = -314493982;
        hn.cjzo[1376] = 205408156;
        hn.cjzo[1377] = 2049360575;
        hn.cjzo[1378] = 1255177845;
        hn.cjzo[1379] = 582567034;
        hn.cjzo[1380] = 896148240;
        hn.cjzo[1381] = 1659163077;
        hn.cjzo[1382] = 305750277;
        hn.cjzo[1383] = 1145458380;
        hn.cjzo[1384] = -674069115;
        hn.cjzo[1385] = -302530336;
        hn.cjzo[1386] = 952809258;
        hn.cjzo[1387] = 241961811;
        hn.cjzo[1388] = 315831477;
        hn.cjzo[1389] = -1533561557;
        hn.cjzo[1390] = 204684896;
        hn.cjzo[1391] = -653281982;
        hn.cjzo[1392] = 478014407;
        hn.cjzo[1393] = -1541400540;
        hn.cjzo[1394] = -1378369479;
        hn.cjzo[1395] = 915240075;
        hn.cjzo[1396] = 1871658982;
        hn.cjzo[1397] = -1981596094;
        hn.cjzo[1398] = -1693440134;
        hn.cjzo[1399] = -614867363;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public id getFuntimeTestSmooth() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cozw", cjzf(int ), (int)460));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1979988398: {
                    v1 = hn.cjzi("cozx", cjzf(int ), (int)461);
                    continue block22;
                }
                case -841682887: {
                    break block22;
                }
                case 1349244992: {
                    v1 = hn.cjzi("cozy", cjzf(int ), (int)462);
                    continue block22;
                }
                case 1588039743: {
                    v1 = hn.cjzi("cozz", cjzf(int ), (int)463);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("cpab", cjzf(int ), (int)465) - hn.cjzi("cpaa", cjzf(int ), (int)464));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block23;
                }
                case -515874652: {
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl32
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cpac", cjzf(int ), (int)466));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1264744879: {
                    v4 = hn.cjzi("cpad", cjzf(int ), (int)467);
                    continue block24;
                }
                case -841682887: {
                    break block24;
                }
                case 13350044: {
                    v4 = hn.cjzi("cpae", cjzf(int ), (int)468);
                    continue block24;
                }
                case 1618475910: {
                    v4 = hn.cjzi("cpaf", cjzf(int ), (int)469);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpag", cjzf(int ), (int)470)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cpah", cjzm(int ), (int)1137)) break;
                    v5 /* !! */  = (long)hn.cjzi("cpai", cjzm(int ), (int)1138);
                }
                return this.funtimeTestSmooth;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpaj", cjzm(int ), (int)1139);
                    if (!var3_1) break block16;
                    throw null;
                }
            }
lbl66:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpak", cjzm(int ), (int)1140);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpal", cjzm(int ), (int)1141);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpam", cjzm(int ), (int)1142);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getSprintMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpiw", cjzf(int ), (int)578)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpix", cjzm(int ), (int)1253)) break;
            v0 /* !! */  = (long)hn.cjzi("cpiy", cjzm(int ), (int)1254);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cpiz", cjzf(int ), (int)579));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1041299513: {
                    v2 = hn.cjzi("cpja", cjzf(int ), (int)580);
                    continue block13;
                }
                case -841682887: {
                    break block13;
                }
                case 1152552870: {
                    v2 = hn.cjzi("cpjb", cjzf(int ), (int)581);
                    continue block13;
                }
                case 1855081263: {
                    v2 = hn.cjzi("cpjc", cjzf(int ), (int)582);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpjd", cjzf(int ), (int)583)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("cpje", cjzm(int ), (int)1255)) break;
            v3 /* !! */  = (long)hn.cjzi("cpjf", cjzm(int ), (int)1256);
        }
        var1_3 = hn.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block15;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpjg", cjzf(int ), (int)584)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpjh", cjzm(int ), (int)1257)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpji", cjzm(int ), (int)1258);
                }
                return this.sprintMode;
lbl46:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hn.cjzi("cpjj", cjzm(int ), (int)1259);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)hn.cjzi("cpjk", cjzm(int ), (int)1260);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)hn.cjzi("cpjl", cjzm(int ), (int)1261);
                    if (!var3_1) break block15;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpjm", cjzm(int ), (int)1262);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handlePostRotationUpdate() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cock", cjzf(int ), (int)271));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1403989848: {
                    v1 = hn.cjzi("cocl", cjzf(int ), (int)272);
                    continue block44;
                }
                case -841682887: {
                    break block44;
                }
                case 1847133189: {
                    v1 = hn.cjzi("cocm", cjzf(int ), (int)273);
                    continue block44;
                }
                case 2087749946: {
                    v1 = hn.cjzi("cocn", cjzf(int ), (int)274);
                    continue block44;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("coco", cjzf(int ), (int)275));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2033783710: {
                    v3 = hn.cjzi("cocp", cjzf(int ), (int)276);
                    continue block45;
                }
                case -841682887: {
                    break block45;
                }
                case 149876223: {
                    v3 = hn.cjzi("cocq", cjzf(int ), (int)277);
                    continue block45;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl39
                block46: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cocr", cjzf(int ), (int)278));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block46;
                        }
                        case -120609570: {
                            v5 = hn.cjzi("cocs", cjzf(int ), (int)279);
                            continue block46;
                        }
                        case 1315327680: {
                            v5 = hn.cjzi("coct", cjzf(int ), (int)280);
                            continue block46;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
lbl51:
                    // 5 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl51
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl58
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("cocu", cjzf(int ), (int)281));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -841682887: {
                            break block48;
                        }
                        case -731545154: {
                            v7 = hn.cjzi("cocv", cjzf(int ), (int)282);
                            continue block48;
                        }
                        case -485600115: {
                            v7 = hn.cjzi("cocw", cjzf(int ), (int)283);
                            continue block48;
                        }
                        case 25748951: {
                            v7 = hn.cjzi("cocx", cjzf(int ), (int)284);
                            continue block48;
                        }
                    }
                    break;
                }
                if (this.target == null) ** GOTO lbl126
                if (var1_3) ** GOTO lbl51
                v8 /* !! */  = hn.fz;
                if (true) ** GOTO lbl76
                block49: while (true) {
                    v8 /* !! */  = (long)(v9 - hn.cjzi("cocy", cjzf(int ), (int)285));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -841682887: {
                            break block49;
                        }
                        case 332949729: {
                            v9 = hn.cjzi("cocz", cjzf(int ), (int)286);
                            continue block49;
                        }
                        case 1853396421: {
                            v9 = hn.cjzi("coda", cjzf(int ), (int)287);
                            continue block49;
                        }
                    }
                    break;
                }
                if (this.isDeferredCriticalsActive()) ** GOTO lbl126
                if (var1_3 || var1_3) ** GOTO lbl51
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("codb", cjzf(int ), (int)288)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hn.cjzi("codc", cjzm(int ), (int)716)) break;
                    v10 /* !! */  = (long)hn.cjzi("codd", cjzm(int ), (int)717);
                }
                v11 = d.getInstance();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("code", cjzf(int ), (int)289)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hn.cjzi("codf", cjzm(int ), (int)718)) break;
                    v12 /* !! */  = (long)hn.cjzi("codg", cjzm(int ), (int)719);
                }
                v13 = v11.getManager();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("codh", cjzf(int ), (int)290)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hn.cjzi("codi", cjzm(int ), (int)720)) break;
                    v14 /* !! */  = (long)hn.cjzi("codj", cjzm(int ), (int)721);
                }
                v15 = v13.getAttackPerpetrator();
                v16 /* !! */  = hn.fz;
                if (true) ** GOTO lbl109
                block53: while (true) {
                    v16 /* !! */  = (long)(v17 - hn.cjzi("codk", cjzf(int ), (int)291));
lbl109:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -841682887: {
                            break block53;
                        }
                        case -24247215: {
                            v17 = hn.cjzi("codl", cjzf(int ), (int)292);
                            continue block53;
                        }
                        case 1712986905: {
                            v17 = hn.cjzi("codm", cjzf(int ), (int)293);
                            continue block53;
                        }
                    }
                    break;
                }
                v18 = this.getConfig();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("codn", cjzf(int ), (int)294)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == hn.cjzi("codo", cjzm(int ), (int)722)) break;
                    v19 /* !! */  = (long)hn.cjzi("codp", cjzm(int ), (int)723);
                }
                v15.performAttack(v18);
                if (var1_3) ** GOTO lbl51
lbl126:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("codq", cjzm(int ), (int)724);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl134:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("codr", cjzm(int ), (int)725);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cods", cjzm(int ), (int)726);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl157
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)hn.cjzi("codt", cjzm(int ), (int)727);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)hn.cjzi("codu", cjzm(int ), (int)728);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
lbl153:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)hn.cjzi("codv", cjzm(int ), (int)729);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
lbl157:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)hn.cjzi("codw", cjzm(int ), (int)730);
                if (var3_1) {
                    throw null;
                }
            }
lbl161:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)hn.cjzi("codx", cjzm(int ), (int)731);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hn.cjzi("cody", cjzm(int ), (int)732);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("codz", cjzm(int ), (int)733);
        ** while (!var3_1)
lbl172:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float effectiveAttackDistance() {
        block57: {
            block56: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("ckyb", cjzf(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == hn.cjzi("ckyc", cjzm(int ), (int)386)) break;
                    v0 /* !! */  = (long)hn.cjzi("ckyd", cjzm(int ), (int)387);
                }
                var5_1 = hn.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckye", cjzf(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == hn.cjzi("ckyf", cjzm(int ), (int)388)) break;
                    v1 /* !! */  = (long)hn.cjzi("ckyg", cjzm(int ), (int)389);
                }
                var4_2 /* !! */  = hn.b;
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl19
                block31: while (true) {
                    v2 /* !! */  = (long)(hn.cjzi("ckyi", cjzf(int ), (int)120) - hn.cjzi("ckyh", cjzf(int ), (int)119));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -841682887: {
                            break block31;
                        }
                        case 1895657714: {
                            continue block31;
                        }
                    }
                    break;
                }
                var3_3 = hn.a;
                if (var5_1) {
                    throw null;
lbl27:
                    // 7 sources

                    return (float)hn.cjzi("ckyj", ckbd(int ), (int)390);
                }
                if (var3_3 || var3_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("ckyk", cjzf(int ), (int)121)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hn.cjzi("ckyl", cjzm(int ), (int)391)) break;
                    v3 /* !! */  = (long)hn.cjzi("ckym", cjzm(int ), (int)392);
                }
                var1_4 = fr.getInstance();
                if (var3_3 || var3_3) ** GOTO lbl27
                if (var1_4 != null) break block56;
                if (var3_3) ** GOTO lbl27
                v4 /* !! */  = hn.cjzi("ckyn", ckbd(int ), (int)393);
                if (var5_1) {
                    throw null;
                }
                break block57;
            }
            if (var3_3 || var3_3) ** GOTO lbl27
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("ckyo", cjzf(int ), (int)122)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == hn.cjzi("ckyp", cjzm(int ), (int)394)) {
                    v4 /* !! */  = (CallSite)var1_4.getKillAuraDistance();
                    break;
                }
                v5 /* !! */  = (long)hn.cjzi("ckyq", cjzm(int ), (int)395);
            }
        }
        var2_5 = v4 /* !! */ ;
        if (var3_3 || var3_3) ** GOTO lbl27
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!(var2_5 > 0.0f)) ** GOTO lbl66
                if (var3_3) ** GOTO lbl27
                v6 /* !! */  = var2_5;
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl87
lbl66:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v7 /* !! */  = hn.fz;
                if (true) ** GOTO lbl72
                block35: while (true) {
                    v7 /* !! */  = (long)(hn.cjzi("ckyx", cjzf(int ), (int)124) - hn.cjzi("ckyu", cjzf(int ), (int)123));
lbl72:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -841682887: {
                            break block35;
                        }
                        case 1028104707: {
                            continue block35;
                        }
                    }
                    break;
                }
                v8 /* !! */  = hn.fz;
                if (true) ** GOTO lbl81
                block36: while (true) {
                    v8 /* !! */  = (long)(hn.cjzi("ckzd", cjzf(int ), (int)126) - hn.cjzi("ckzb", cjzf(int ), (int)125));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -841682887: {
                            break block36;
                        }
                        case 1329836767: {
                            continue block36;
                        }
                    }
                    break;
                }
                v6 /* !! */  = (CallSite)this.attackRange.getValue();
lbl87:
                // 2 sources

                return (float)v6 /* !! */ ;
            }
            case 0: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzg", cjzm(int ), (int)396);
                if (!var5_1) break;
                throw null;
            }
lbl92:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzk", cjzm(int ), (int)397);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl97:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzn", cjzm(int ), (int)398);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 3: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzt", cjzm(int ), (int)399);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl107:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzv", cjzm(int ), (int)400);
                if (!var5_1) ** GOTO lbl92
                throw null;
            }
lbl111:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)hn.cjzi("ckzy", cjzm(int ), (int)401);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 6: {
                var4_2 /* !! */  = (int)hn.cjzi("claa", cjzm(int ), (int)402);
                if (!var5_1) ** GOTO lbl97
                throw null;
            }
lbl120:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)hn.cjzi("clae", cjzm(int ), (int)403);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
lbl124:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)hn.cjzi("clah", cjzm(int ), (int)404);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
lbl128:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)hn.cjzi("clak", cjzm(int ), (int)405);
                if (!var5_1) ** GOTO lbl111
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)hn.cjzi("clan", cjzm(int ), (int)406);
                if (!var5_1) break;
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)hn.cjzi("claq", cjzm(int ), (int)407);
                if (!var5_1) ** GOTO lbl97
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)hn.cjzi("clat", cjzm(int ), (int)408);
                if (!var5_1) ** GOTO lbl92
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hn.cjzi("clau", cjzm(int ), (int)409);
                    if (!var5_1) ** GOTO lbl124
                    throw null;
                }
            }
            case 14: 
        }
        var4_2 /* !! */  = (int)hn.cjzi("claw", cjzm(int ), (int)410);
        ** while (!var5_1)
lbl152:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getLegitAimSpeed() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpgk", cjzf(int ), (int)548)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpgl", cjzm(int ), (int)1219)) break;
            v0 /* !! */  = (long)hn.cjzi("cpgm", cjzm(int ), (int)1220);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpgn", cjzf(int ), (int)549)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpgo", cjzm(int ), (int)1221)) break;
            v1 /* !! */  = (long)hn.cjzi("cpgp", cjzm(int ), (int)1222);
        }
        var2_2 /* !! */  = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpgq", cjzf(int ), (int)550));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block19;
                }
                case 888801543: {
                    v3 = hn.cjzi("cpgr", cjzf(int ), (int)551);
                    continue block19;
                }
                case 1192870955: {
                    v3 = hn.cjzi("cpgs", cjzf(int ), (int)552);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = hn.a;
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
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cpgt", cjzf(int ), (int)553));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block21;
                        }
                        case -808799632: {
                            v5 = hn.cjzi("cpgu", cjzf(int ), (int)554);
                            continue block21;
                        }
                        case -599422744: {
                            v5 = hn.cjzi("cpgv", cjzf(int ), (int)555);
                            continue block21;
                        }
                        case 111644236: {
                            v5 = hn.cjzi("cpgw", cjzf(int ), (int)556);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.legitAimSpeed;
            }
lbl54:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpgx", cjzm(int ), (int)1223);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpgy", cjzm(int ), (int)1224);
                if (!var3_1) break;
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpgz", cjzm(int ), (int)1225);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpha", cjzm(int ), (int)1226);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ckbd(int n2) {
        return Float.intBitsToFloat(cjzn[n2] ^ cjzo[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPlayerMovePost(cu var1_1) {
        block104: {
            block103: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cllg", cjzf(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hn.cjzi("clli", cjzm(int ), (int)489)) break;
                    v0 /* !! */  = (long)hn.cjzi("cllk", cjzm(int ), (int)490);
                }
                var5_2 = hn.c;
                v1 /* !! */  = hn.fz;
                if (true) ** GOTO lbl11
                block61: while (true) {
                    v1 /* !! */  = (long)(v2 - hn.cjzi("clln", cjzf(int ), (int)145));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -966535365: {
                            v2 = hn.cjzi("cllo", cjzf(int ), (int)146);
                            continue block61;
                        }
                        case -841682887: {
                            break block61;
                        }
                        case 1387843573: {
                            v2 = hn.cjzi("cllq", cjzf(int ), (int)147);
                            continue block61;
                        }
                    }
                    break;
                }
                var4_3 /* !! */  = hn.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cllt", cjzf(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hn.cjzi("cllv", cjzm(int ), (int)491)) break;
                    v3 /* !! */  = (long)hn.cjzi("cllx", cjzm(int ), (int)492);
                }
                var3_4 = hn.a;
                if (var5_2) {
                    throw null;
lbl29:
                    // 13 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl29
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl36
                block64: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("clma", cjzf(int ), (int)149));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block64;
                        }
                        case -572662163: {
                            v5 = hn.cjzi("clmd", cjzf(int ), (int)150);
                            continue block64;
                        }
                        case 1141351177: {
                            v5 = hn.cjzi("clmf", cjzf(int ), (int)151);
                            continue block64;
                        }
                    }
                    break;
                }
                if (this.target == null) break block103;
                if (var3_4) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("clmh", cjzf(int ), (int)152)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hn.cjzi("clmi", cjzm(int ), (int)493)) break;
                    v6 /* !! */  = (long)hn.cjzi("clmj", cjzm(int ), (int)494);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("clml", cjzf(int ), (int)153)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("clmm", cjzm(int ), (int)495)) break;
                    v7 /* !! */  = (long)hn.cjzi("clmn", cjzm(int ), (int)496);
                }
                if (hn.mc.field_1724 == null) break block103;
                if (var3_4) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("clmp", cjzf(int ), (int)154)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("clmr", cjzm(int ), (int)497)) break;
                    v8 /* !! */  = (long)hn.cjzi("clmv", cjzm(int ), (int)498);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("clmx", cjzf(int ), (int)155)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hn.cjzi("clmz", cjzm(int ), (int)499)) break;
                    v9 /* !! */  = (long)hn.cjzi("clnb", cjzm(int ), (int)500);
                }
                if (hn.mc.field_1687 != null) break block104;
                if (var3_4) ** GOTO lbl29
            }
            if (var3_4 || var3_4) ** GOTO lbl29
            v10 = hn.cjzi("clnf", cjzm(int ), (int)501);
            v11 /* !! */  = hn.fz;
            if (true) ** GOTO lbl78
            block69: while (true) {
                v11 /* !! */  = (long)(hn.cjzi("clnk", cjzf(int ), (int)157) - hn.cjzi("clnh", cjzf(int ), (int)156));
lbl78:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -841682887: {
                        break block69;
                    }
                    case 1651413110: {
                        continue block69;
                    }
                }
                break;
            }
            this.skyCoreCanCrit = v10;
            if (var3_4 || var3_4) ** GOTO lbl29
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        v12 /* !! */  = hn.fz;
        if (true) ** GOTO lbl92
        block70: while (true) {
            v12 /* !! */  = (long)(v13 - hn.cjzi("clnn", cjzf(int ), (int)158));
lbl92:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1376549095: {
                    v13 = hn.cjzi("clnp", cjzf(int ), (int)159);
                    continue block70;
                }
                case -841682887: {
                    break block70;
                }
                case 890567076: {
                    v13 = hn.cjzi("clnr", cjzf(int ), (int)160);
                    continue block70;
                }
            }
            break;
        }
        var2_5 = fr.getInstance();
        if (var3_4 || var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_5 == null) ** GOTO lbl135
                if (var3_4) ** GOTO lbl29
                v14 /* !! */  = hn.fz;
                if (true) ** GOTO lbl112
                block71: while (true) {
                    v14 /* !! */  = (long)(v15 - hn.cjzi("clnv", cjzf(int ), (int)161));
lbl112:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1874922803: {
                            v15 = hn.cjzi("clnx", cjzf(int ), (int)162);
                            continue block71;
                        }
                        case -841682887: {
                            break block71;
                        }
                        case 965070629: {
                            v15 = hn.cjzi("clny", cjzf(int ), (int)163);
                            continue block71;
                        }
                        case 1682333614: {
                            v15 = hn.cjzi("cloa", cjzf(int ), (int)164);
                            continue block71;
                        }
                    }
                    break;
                }
                if (!var2_5.isState()) ** GOTO lbl135
                if (var3_4 || var3_4) ** GOTO lbl29
                v16 = hn.cjzi("cloe", cjzm(int ), (int)502);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("clog", cjzf(int ), (int)165)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hn.cjzi("cloh", cjzm(int ), (int)503)) break;
                    v17 /* !! */  = (long)hn.cjzi("clok", cjzm(int ), (int)504);
                }
                this.skyCoreCanCrit = v16;
                if (var3_4 || var3_4) ** GOTO lbl29
                return;
lbl135:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v18 /* !! */  = hn.fz;
                if (true) ** GOTO lbl140
                block73: while (true) {
                    v18 /* !! */  = (long)(hn.cjzi("cloq", cjzf(int ), (int)167) - hn.cjzi("cloo", cjzf(int ), (int)166));
lbl140:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -841682887: {
                            break block73;
                        }
                        case -376099281: {
                            continue block73;
                        }
                    }
                    break;
                }
                if (!(var1_1.getFallDistance() > hn.cjzi("cloz", clov(int ), (int)168))) ** GOTO lbl-1000
                v19 /* !! */  = hn.fz;
                if (true) ** GOTO lbl150
                block74: while (true) {
                    v19 /* !! */  = (long)(hn.cjzi("clpe", cjzf(int ), (int)170) - hn.cjzi("clpc", cjzf(int ), (int)169));
lbl150:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -841682887: {
                            break block74;
                        }
                        case 726210246: {
                            continue block74;
                        }
                    }
                    break;
                }
                if (!var1_1.isToGround()) lbl-1000:
                // 2 sources

                {
                    v20 = hn.cjzi("clpf", cjzm(int ), (int)505);
                    if (var5_2) {
                        throw null;
                    }
                } else {
                    v20 = hn.cjzi("clpi", cjzm(int ), (int)506);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("clpj", cjzf(int ), (int)171)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hn.cjzi("clpl", cjzm(int ), (int)507)) break;
                    v21 /* !! */  = (long)hn.cjzi("clpo", cjzm(int ), (int)508);
                }
                this.skyCoreCanCrit = v20;
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)hn.cjzi("clpq", cjzm(int ), (int)509);
                if (var5_2) {
                    throw null;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqr", cjzm(int ), (int)510);
                if (var5_2) {
                    throw null;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqs", cjzm(int ), (int)511);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl183:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqt", cjzm(int ), (int)512);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl188:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqu", cjzm(int ), (int)513);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 5: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqv", cjzm(int ), (int)514);
                if (!var5_2) ** GOTO lbl183
                throw null;
            }
lbl197:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqw", cjzm(int ), (int)515);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl202:
            // 3 sources

            case 7: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqx", cjzm(int ), (int)516);
                if (!var5_2) ** GOTO lbl188
                throw null;
            }
lbl206:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqy", cjzm(int ), (int)517);
                if (!var5_2) ** GOTO lbl202
                throw null;
            }
lbl210:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)hn.cjzi("cnqz", cjzm(int ), (int)518);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl215:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)hn.cjzi("cnra", cjzm(int ), (int)519);
                if (!var5_2) ** GOTO lbl197
                throw null;
            }
lbl219:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrb", cjzm(int ), (int)520);
                if (!var5_2) ** GOTO lbl183
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrc", cjzm(int ), (int)521);
                if (!var5_2) ** GOTO lbl215
                throw null;
            }
lbl227:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrd", cjzm(int ), (int)522);
                if (var5_2) {
                    throw null;
                }
            }
lbl231:
            // 5 sources

            case 14: {
                var4_3 /* !! */  = (int)hn.cjzi("cnre", cjzm(int ), (int)523);
                if (!var5_2) ** GOTO lbl206
                throw null;
            }
lbl235:
            // 4 sources

            case 15: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrf", cjzm(int ), (int)524);
                if (!var5_2) ** GOTO lbl227
                throw null;
            }
lbl239:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hn.cjzi("cnrg", cjzm(int ), (int)525);
                    if (!var5_2) ** GOTO lbl235
                    throw null;
                }
            }
lbl244:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrh", cjzm(int ), (int)526);
                if (!var5_2) ** GOTO lbl219
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)hn.cjzi("cnri", cjzm(int ), (int)527);
                if (!var5_2) ** GOTO lbl239
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrj", cjzm(int ), (int)528);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrk", cjzm(int ), (int)529);
                if (!var5_2) ** GOTO lbl206
                throw null;
            }
            case 21: {
                do {
                    var4_3 /* !! */  = (int)hn.cjzi("cnrl", cjzm(int ), (int)530);
                } while (!var5_2);
                throw null;
            }
lbl265:
            // 2 sources

            case 22: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrm", cjzm(int ), (int)531);
                if (!var5_2) ** GOTO lbl210
                throw null;
            }
            case 23: {
                var4_3 /* !! */  = (int)hn.cjzi("cnrn", cjzm(int ), (int)532);
                if (!var5_2) ** GOTO lbl231
                throw null;
            }
            case 24: 
        }
        var4_3 /* !! */  = (int)hn.cjzi("cnro", cjzm(int ), (int)533);
        ** while (!var5_2)
lbl276:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void restoreDamageSphereAfterAttack(int var1_1) {
        block70: {
            block69: {
                v0 /* !! */  = hn.fz;
                if (true) ** GOTO lbl5
                block43: while (true) {
                    v0 /* !! */  = (long)(v1 - hn.cjzi("ckmx", cjzf(int ), (int)67));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1043441840: {
                            v1 = hn.cjzi("ckmy", cjzf(int ), (int)68);
                            continue block43;
                        }
                        case -841682887: {
                            break block43;
                        }
                        case 218276353: {
                            v1 = hn.cjzi("ckmz", cjzf(int ), (int)69);
                            continue block43;
                        }
                        case 2065591558: {
                            v1 = hn.cjzi("ckna", cjzf(int ), (int)70);
                            continue block43;
                        }
                    }
                    break;
                }
                var4_2 = hn.c;
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl22
                block44: while (true) {
                    v2 /* !! */  = (long)(v3 - hn.cjzi("cknb", cjzf(int ), (int)71));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -971691413: {
                            v3 = hn.cjzi("cknc", cjzf(int ), (int)72);
                            continue block44;
                        }
                        case -841682887: {
                            break block44;
                        }
                        case -24971340: {
                            v3 = hn.cjzi("cknd", cjzf(int ), (int)73);
                            continue block44;
                        }
                        case 2019125425: {
                            v3 = hn.cjzi("ckne", cjzf(int ), (int)74);
                            continue block44;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = hn.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cknf", cjzf(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hn.cjzi("ckng", cjzm(int ), (int)146)) break;
                    v4 /* !! */  = (long)hn.cjzi("cknh", cjzm(int ), (int)147);
                }
                var2_4 = hn.a;
                if (var4_2) {
                    throw null;
lbl43:
                    // 9 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                if (var1_1 < 0) break block69;
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckni", cjzf(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("cknj", cjzm(int ), (int)148)) break;
                    v5 /* !! */  = (long)hn.cjzi("cknk", cjzm(int ), (int)149);
                }
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl57
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("cknl", cjzf(int ), (int)77));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2134471108: {
                            v7 = hn.cjzi("cknm", cjzf(int ), (int)78);
                            continue block48;
                        }
                        case -2031506456: {
                            v7 = hn.cjzi("cknn", cjzf(int ), (int)79);
                            continue block48;
                        }
                        case -841682887: {
                            break block48;
                        }
                        case -208978474: {
                            v7 = hn.cjzi("ckno", cjzf(int ), (int)80);
                            continue block48;
                        }
                    }
                    break;
                }
                if (hn.mc.field_1724 != null) break block70;
                if (var2_4) ** GOTO lbl43
            }
            if (var2_4 || var2_4) ** GOTO lbl43
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        v8 /* !! */  = hn.fz;
        if (true) ** GOTO lbl80
        block49: while (true) {
            v8 /* !! */  = (long)(v9 - hn.cjzi("cknp", cjzf(int ), (int)81));
lbl80:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -863114130: {
                    v9 = hn.cjzi("cknq", cjzf(int ), (int)82);
                    continue block49;
                }
                case -841682887: {
                    break block49;
                }
                case -790733371: {
                    v9 = hn.cjzi("cknr", cjzf(int ), (int)83);
                    continue block49;
                }
                case 777826095: {
                    v9 = hn.cjzi("ckns", cjzf(int ), (int)84);
                    continue block49;
                }
            }
            break;
        }
        nv.dropCursorStack();
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cknt", cjzf(int ), (int)85)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hn.cjzi("cknu", cjzm(int ), (int)150)) break;
            v10 /* !! */  = (long)hn.cjzi("cknv", cjzm(int ), (int)151);
        }
        nv.swapToOffhand(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cknw", cjzf(int ), (int)86)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hn.cjzi("cknx", cjzm(int ), (int)152)) break;
            v11 /* !! */  = (long)hn.cjzi("ckny", cjzm(int ), (int)153);
        }
        this.hideArtifactFromMainHand();
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl115:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hn.cjzi("cknz", cjzm(int ), (int)154);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl120:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoa", cjzm(int ), (int)155);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl125:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hn.cjzi("ckob", cjzm(int ), (int)156);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl130:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hn.cjzi("ckoc", cjzm(int ), (int)157);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl181
                    break;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)hn.cjzi("ckod", cjzm(int ), (int)158);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl141:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoe", cjzm(int ), (int)159);
                if (!var4_2) ** GOTO lbl115
                throw null;
            }
lbl145:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hn.cjzi("ckof", cjzm(int ), (int)160);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl150:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hn.cjzi("ckog", cjzm(int ), (int)161);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 8: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoh", cjzm(int ), (int)162);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
lbl159:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoi", cjzm(int ), (int)163);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoj", cjzm(int ), (int)164);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
lbl167:
            // 2 sources

            case 11: {
                do {
                    var3_3 /* !! */  = (int)hn.cjzi("ckok", cjzm(int ), (int)165);
                } while (!var4_2);
                throw null;
            }
lbl172:
            // 2 sources

            case 12: {
                do {
                    var3_3 /* !! */  = (int)hn.cjzi("ckol", cjzm(int ), (int)166);
                } while (!var4_2);
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hn.cjzi("ckom", cjzm(int ), (int)167);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
lbl181:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)hn.cjzi("ckon", cjzm(int ), (int)168);
                if (!var4_2) ** GOTO lbl172
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hn.cjzi("ckoo", cjzm(int ), (int)169);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 16: 
        }
        var3_3 /* !! */  = (int)hn.cjzi("ckop", cjzm(int ), (int)170);
        ** while (!var4_2)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqto() {
        hn.cjzn[1300] = -958318503;
        hn.cjzn[1301] = -1432924622;
        hn.cjzn[1302] = 1382649261;
        hn.cjzn[1303] = 1934653516;
        hn.cjzn[1304] = 1934025039;
        hn.cjzn[1305] = 1432010369;
        hn.cjzn[1306] = 679099507;
        hn.cjzn[1307] = -684762913;
        hn.cjzn[1308] = -1247027395;
        hn.cjzn[1309] = -1895966678;
        hn.cjzn[1310] = -1506000163;
        hn.cjzn[1311] = 632699366;
        hn.cjzn[1312] = 1527253632;
        hn.cjzn[1313] = -1239649380;
        hn.cjzn[1314] = 980072319;
        hn.cjzn[1315] = 519816264;
        hn.cjzn[1316] = 923482629;
        hn.cjzn[1317] = -909603345;
        hn.cjzn[1318] = -954129596;
        hn.cjzn[1319] = 1845689764;
        hn.cjzn[1320] = -1418940126;
        hn.cjzn[1321] = 269649088;
        hn.cjzn[1322] = -2145773015;
        hn.cjzn[1323] = 810992170;
        hn.cjzn[1324] = 1857666973;
        hn.cjzn[1325] = 675135376;
        hn.cjzn[1326] = 1215168300;
        hn.cjzn[1327] = 1295158438;
        hn.cjzn[1328] = -1117756922;
        hn.cjzn[1329] = -1820874396;
        hn.cjzn[1330] = -1614137076;
        hn.cjzn[1331] = 2014639956;
        hn.cjzn[1332] = -1884112134;
        hn.cjzn[1333] = -297943716;
        hn.cjzn[1334] = 2057073941;
        hn.cjzn[1335] = -2095188989;
        hn.cjzn[1336] = -660074166;
        hn.cjzn[1337] = -1952472259;
        hn.cjzn[1338] = 360164963;
        hn.cjzn[1339] = -2092047995;
        hn.cjzn[1340] = 997605820;
        hn.cjzn[1341] = 507327747;
        hn.cjzn[1342] = 124215448;
        hn.cjzn[1343] = -297136351;
        hn.cjzn[1344] = 1564799998;
        hn.cjzn[1345] = 1008229980;
        hn.cjzn[1346] = 247399982;
        hn.cjzn[1347] = 1720687554;
        hn.cjzn[1348] = 1932776252;
        hn.cjzn[1349] = -441804759;
        hn.cjzn[1350] = -1058541916;
        hn.cjzn[1351] = 1319462321;
        hn.cjzn[1352] = 1099646785;
        hn.cjzn[1353] = -1537375713;
        hn.cjzn[1354] = -23352173;
        hn.cjzn[1355] = -1565689212;
        hn.cjzn[1356] = 399821729;
        hn.cjzn[1357] = 145412532;
        hn.cjzn[1358] = 375031123;
        hn.cjzn[1359] = 134616782;
        hn.cjzn[1360] = -259457807;
        hn.cjzn[1361] = -1413952116;
        hn.cjzn[1362] = 523736881;
        hn.cjzn[1363] = -2040487933;
        hn.cjzn[1364] = -1978188997;
        hn.cjzn[1365] = -1087047816;
        hn.cjzn[1366] = 231214314;
        hn.cjzn[1367] = 1590278094;
        hn.cjzn[1368] = -1623291816;
        hn.cjzn[1369] = 1670653367;
        hn.cjzn[1370] = 532253687;
        hn.cjzn[1371] = -238224695;
        hn.cjzn[1372] = 890650209;
        hn.cjzn[1373] = 1624547129;
        hn.cjzn[1374] = 1031088005;
        hn.cjzn[1375] = -314493983;
        hn.cjzn[1376] = 205408159;
        hn.cjzn[1377] = -2049360576;
        hn.cjzn[1378] = -76392703;
        hn.cjzn[1379] = 582567034;
        hn.cjzn[1380] = 896148243;
        hn.cjzn[1381] = 1659163079;
        hn.cjzn[1382] = 305750276;
        hn.cjzn[1383] = 1145458382;
        hn.cjzn[1384] = 674069114;
        hn.cjzn[1385] = 2142412658;
        hn.cjzn[1386] = 952809259;
        hn.cjzn[1387] = 1367848304;
        hn.cjzn[1388] = 315831477;
        hn.cjzn[1389] = -1533561560;
        hn.cjzn[1390] = 204684897;
        hn.cjzn[1391] = -653281983;
        hn.cjzn[1392] = 478014405;
        hn.cjzn[1393] = 1541400539;
        hn.cjzn[1394] = 948975181;
        hn.cjzn[1395] = -915240076;
        hn.cjzn[1396] = 1733845187;
        hn.cjzn[1397] = 1981596093;
        hn.cjzn[1398] = -2048911883;
        hn.cjzn[1399] = -614867364;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSkyCoreCanCrit() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpel", cjzf(int ), (int)525)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpem", cjzm(int ), (int)1191)) break;
            v0 /* !! */  = (long)hn.cjzi("cpen", cjzm(int ), (int)1192);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpeo", cjzf(int ), (int)526)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpep", cjzm(int ), (int)1193)) break;
            v1 /* !! */  = (long)hn.cjzi("cpeq", cjzm(int ), (int)1194);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cper", cjzf(int ), (int)527)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cpes", cjzm(int ), (int)1195)) break;
            v2 /* !! */  = (long)hn.cjzi("cpet", cjzm(int ), (int)1196);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
            return (boolean)hn.cjzi("cpeu", cjzm(int ), (int)1197);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl34
                block14: while (true) {
                    v3 /* !! */  = (long)(hn.cjzi("cpew", cjzf(int ), (int)529) - hn.cjzi("cpev", cjzf(int ), (int)528));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block14;
                        }
                        case 1017189321: {
                            continue block14;
                        }
                    }
                    break;
                }
                return this.skyCoreCanCrit;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpex", cjzm(int ), (int)1198);
                if (!var3_1) break;
                throw null;
            }
lbl44:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpey", cjzm(int ), (int)1199);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpez", cjzm(int ), (int)1200);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpfa", cjzm(int ), (int)1201);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getLegitPitch() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cphb", cjzf(int ), (int)557));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block12;
                }
                case 152095841: {
                    v1 = hn.cjzi("cphc", cjzf(int ), (int)558);
                    continue block12;
                }
                case 336052704: {
                    v1 = hn.cjzi("cphd", cjzf(int ), (int)559);
                    continue block12;
                }
                case 1715590257: {
                    v1 = hn.cjzi("cphe", cjzf(int ), (int)560);
                    continue block12;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cphf", cjzf(int ), (int)561)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cphg", cjzm(int ), (int)1227)) break;
            v2 /* !! */  = (long)hn.cjzi("cphh", cjzm(int ), (int)1228);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cphi", cjzf(int ), (int)562)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("cphj", cjzm(int ), (int)1229)) break;
            v3 /* !! */  = (long)hn.cjzi("cphk", cjzm(int ), (int)1230);
        }
        var1_3 = hn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cphl", cjzf(int ), (int)563)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cphm", cjzm(int ), (int)1231)) break;
                    v4 /* !! */  = (long)hn.cjzi("cphn", cjzm(int ), (int)1232);
                }
                return this.legitPitch;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpho", cjzm(int ), (int)1233);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cphp", cjzm(int ), (int)1234);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cphq", cjzm(int ), (int)1235);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cphr", cjzm(int ), (int)1236);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getAimType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpft", cjzf(int ), (int)539)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpfu", cjzm(int ), (int)1211)) break;
            v0 /* !! */  = (long)hn.cjzi("cpfv", cjzm(int ), (int)1212);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpfw", cjzf(int ), (int)540)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpfx", cjzm(int ), (int)1213)) break;
            v1 /* !! */  = (long)hn.cjzi("cpfy", cjzm(int ), (int)1214);
        }
        var2_2 /* !! */  = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpfz", cjzf(int ), (int)541));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1536534109: {
                    v3 = hn.cjzi("cpga", cjzf(int ), (int)542);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case 1929408747: {
                    v3 = hn.cjzi("cpgb", cjzf(int ), (int)543);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cpgc", cjzf(int ), (int)544));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block21;
                        }
                        case 161729839: {
                            v5 = hn.cjzi("cpgd", cjzf(int ), (int)545);
                            continue block21;
                        }
                        case 1082559797: {
                            v5 = hn.cjzi("cpge", cjzf(int ), (int)546);
                            continue block21;
                        }
                        case 1159825586: {
                            v5 = hn.cjzi("cpgf", cjzf(int ), (int)547);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.aimType;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpgg", cjzm(int ), (int)1215);
                } while (!var3_1);
                throw null;
            }
lbl59:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpgh", cjzm(int ), (int)1216);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpgi", cjzm(int ), (int)1217);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpgj", cjzm(int ), (int)1218);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cque() {
        hn.cjzo[100] = -1989239337;
        hn.cjzo[101] = -2064308960;
        hn.cjzo[102] = 611774973;
        hn.cjzo[103] = -986769035;
        hn.cjzo[104] = -314340952;
        hn.cjzo[105] = 89123088;
        hn.cjzo[106] = -1797582046;
        hn.cjzo[107] = 1741944807;
        hn.cjzo[108] = 1798915920;
        hn.cjzo[109] = -372529136;
        hn.cjzo[110] = 1081297182;
        hn.cjzo[111] = -935496793;
        hn.cjzo[112] = -497132862;
        hn.cjzo[113] = 1056423009;
        hn.cjzo[114] = -1574865535;
        hn.cjzo[115] = -1648539816;
        hn.cjzo[116] = 1220291094;
        hn.cjzo[117] = -1829743219;
        hn.cjzo[118] = -525925172;
        hn.cjzo[119] = -925095105;
        hn.cjzo[120] = -729197939;
        hn.cjzo[121] = -1286783856;
        hn.cjzo[122] = -1748549961;
        hn.cjzo[123] = -2124537708;
        hn.cjzo[124] = 1688956888;
        hn.cjzo[125] = 802750612;
        hn.cjzo[126] = -1073452985;
        hn.cjzo[127] = 751212763;
        hn.cjzo[128] = -417123068;
        hn.cjzo[129] = 811174631;
        hn.cjzo[130] = 179431657;
        hn.cjzo[131] = 1279580761;
        hn.cjzo[132] = -1125653145;
        hn.cjzo[133] = -602746781;
        hn.cjzo[134] = -148945046;
        hn.cjzo[135] = -1593422460;
        hn.cjzo[136] = -259308007;
        hn.cjzo[137] = 393402319;
        hn.cjzo[138] = -1094403448;
        hn.cjzo[139] = 1703216141;
        hn.cjzo[140] = 430355106;
        hn.cjzo[141] = -2012396924;
        hn.cjzo[142] = 860860102;
        hn.cjzo[143] = 1351167009;
        hn.cjzo[144] = 750274804;
        hn.cjzo[145] = -399230125;
        hn.cjzo[146] = -414324715;
        hn.cjzo[147] = 1898313814;
        hn.cjzo[148] = 60838286;
        hn.cjzo[149] = 1834847714;
        hn.cjzo[150] = -1764106657;
        hn.cjzo[151] = -928378631;
        hn.cjzo[152] = -2021727145;
        hn.cjzo[153] = 1948318761;
        hn.cjzo[154] = 723944557;
        hn.cjzo[155] = 1031927264;
        hn.cjzo[156] = -709882445;
        hn.cjzo[157] = 996881733;
        hn.cjzo[158] = -447037830;
        hn.cjzo[159] = 1884626339;
        hn.cjzo[160] = 374500639;
        hn.cjzo[161] = -1668168934;
        hn.cjzo[162] = 764507623;
        hn.cjzo[163] = 850562919;
        hn.cjzo[164] = 465662201;
        hn.cjzo[165] = -769342651;
        hn.cjzo[166] = -1555163094;
        hn.cjzo[167] = -1655957189;
        hn.cjzo[168] = -1899289788;
        hn.cjzo[169] = 621272345;
        hn.cjzo[170] = 1289908949;
        hn.cjzo[171] = -1244650640;
        hn.cjzo[172] = 488371425;
        hn.cjzo[173] = -187138363;
        hn.cjzo[174] = -1693117468;
        hn.cjzo[175] = 482094170;
        hn.cjzo[176] = -1480620032;
        hn.cjzo[177] = 1972914358;
        hn.cjzo[178] = -10691755;
        hn.cjzo[179] = 368360535;
        hn.cjzo[180] = -591450669;
        hn.cjzo[181] = 1997032250;
        hn.cjzo[182] = -766799362;
        hn.cjzo[183] = 1260000784;
        hn.cjzo[184] = -2109863036;
        hn.cjzo[185] = 1372060261;
        hn.cjzo[186] = -1492477542;
        hn.cjzo[187] = 138487551;
        hn.cjzo[188] = -1426187671;
        hn.cjzo[189] = 169147448;
        hn.cjzo[190] = -1419113948;
        hn.cjzo[191] = -1741915088;
        hn.cjzo[192] = -1019709578;
        hn.cjzo[193] = -164154114;
        hn.cjzo[194] = -1154232216;
        hn.cjzo[195] = -1265025205;
        hn.cjzo[196] = 1147581938;
        hn.cjzo[197] = -2122926599;
        hn.cjzo[198] = -1904631338;
        hn.cjzo[199] = -437223471;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Boolean lambda$new$9() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(hn.cjzi("cqee", cjzf(int ), (int)714) - hn.cjzi("cqed", cjzf(int ), (int)713));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block14;
                }
                case -385612386: {
                    continue block14;
                }
            }
            break;
        }
        var2 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqeg", cjzf(int ), (int)715)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cqeh", cjzm(int ), (int)1384)) break;
            v1 /* !! */  = (long)hn.cjzi("cqei", cjzm(int ), (int)1385);
        }
        var1_1 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqek", cjzf(int ), (int)716)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cqel", cjzm(int ), (int)1386)) break;
            v2 /* !! */  = (long)hn.cjzi("cqen", cjzm(int ), (int)1387);
        }
        var0_2 = hn.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v3 = hn.cjzi("cqep", cjzm(int ), (int)1388);
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v4 /* !! */  = (long)(hn.cjzi("cqes", cjzf(int ), (int)718) - hn.cjzi("cqeq", cjzf(int ), (int)717));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block18;
                        }
                        case 1842581036: {
                            continue block18;
                        }
                    }
                    break;
                }
                return (boolean)v3;
            }
lbl44:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)hn.cjzi("cqeu", cjzm(int ), (int)1389);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)hn.cjzi("cqev", cjzm(int ), (int)1390);
                    if (!var2) ** GOTO lbl44
                    throw null;
                }
            }
lbl54:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)hn.cjzi("cqex", cjzm(int ), (int)1391);
                if (!var2) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)hn.cjzi("cqey", cjzm(int ), (int)1392);
        ** while (!var2)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getOptions() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpma", cjzf(int ), (int)618)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpmb", cjzm(int ), (int)1295)) break;
            v0 /* !! */  = (long)hn.cjzi("cpmc", cjzm(int ), (int)1296);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpmd", cjzf(int ), (int)619)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpme", cjzm(int ), (int)1297)) break;
            v1 /* !! */  = (long)hn.cjzi("cpmf", cjzm(int ), (int)1298);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpmg", cjzf(int ), (int)620)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cpmh", cjzm(int ), (int)1299)) break;
            v2 /* !! */  = (long)hn.cjzi("cpmi", cjzm(int ), (int)1300);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cpmj", cjzf(int ), (int)621)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hn.cjzi("cpmk", cjzm(int ), (int)1301)) break;
                    v3 /* !! */  = (long)hn.cjzi("cpml", cjzm(int ), (int)1302);
                }
                return this.options;
            }
lbl38:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpmm", cjzm(int ), (int)1303);
                } while (!var3_1);
                throw null;
            }
lbl43:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpmn", cjzm(int ), (int)1304);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpmo", cjzm(int ), (int)1305);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpmp", cjzm(int ), (int)1306);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cquk() {
        hn.cjzo[200] = 1044523374;
        hn.cjzo[201] = -1573948866;
        hn.cjzo[202] = 783145368;
        hn.cjzo[203] = -605205340;
        hn.cjzo[204] = 1310284529;
        hn.cjzo[205] = 342941149;
        hn.cjzo[206] = 1120178919;
        hn.cjzo[207] = -1295228467;
        hn.cjzo[208] = 317398392;
        hn.cjzo[209] = -1865032892;
        hn.cjzo[210] = -124021606;
        hn.cjzo[211] = 916614777;
        hn.cjzo[212] = 1606022557;
        hn.cjzo[213] = -618423580;
        hn.cjzo[214] = 1589436927;
        hn.cjzo[215] = 1153578821;
        hn.cjzo[216] = 92391573;
        hn.cjzo[217] = 1543786772;
        hn.cjzo[218] = -25623314;
        hn.cjzo[219] = -1444144965;
        hn.cjzo[220] = -429586849;
        hn.cjzo[221] = -551754186;
        hn.cjzo[222] = -527211238;
        hn.cjzo[223] = 1335143963;
        hn.cjzo[224] = 1799734073;
        hn.cjzo[225] = 1091241239;
        hn.cjzo[226] = -544456534;
        hn.cjzo[227] = 992518237;
        hn.cjzo[228] = 1867674710;
        hn.cjzo[229] = 969616283;
        hn.cjzo[230] = 389618183;
        hn.cjzo[231] = 470802806;
        hn.cjzo[232] = 961889230;
        hn.cjzo[233] = -975396455;
        hn.cjzo[234] = 1259712247;
        hn.cjzo[235] = -1198336038;
        hn.cjzo[236] = 1410346966;
        hn.cjzo[237] = -445416956;
        hn.cjzo[238] = -2134586133;
        hn.cjzo[239] = 182992450;
        hn.cjzo[240] = -1528862416;
        hn.cjzo[241] = -882441654;
        hn.cjzo[242] = -1680238956;
        hn.cjzo[243] = -421872722;
        hn.cjzo[244] = 1434363108;
        hn.cjzo[245] = 395133952;
        hn.cjzo[246] = 678891195;
        hn.cjzo[247] = 1776383917;
        hn.cjzo[248] = 1248154928;
        hn.cjzo[249] = 807042238;
        hn.cjzo[250] = 1826421842;
        hn.cjzo[251] = -1552470308;
        hn.cjzo[252] = 1845034428;
        hn.cjzo[253] = 900051015;
        hn.cjzo[254] = 1540783045;
        hn.cjzo[255] = -164656213;
        hn.cjzo[256] = 0x1141711;
        hn.cjzo[257] = -1008617235;
        hn.cjzo[258] = -1133522539;
        hn.cjzo[259] = -742209689;
        hn.cjzo[260] = 106116428;
        hn.cjzo[261] = -1205044685;
        hn.cjzo[262] = 1134449192;
        hn.cjzo[263] = 323213171;
        hn.cjzo[264] = 1451320846;
        hn.cjzo[265] = 1963727283;
        hn.cjzo[266] = -69307686;
        hn.cjzo[267] = 691383001;
        hn.cjzo[268] = -996673098;
        hn.cjzo[269] = -1731435966;
        hn.cjzo[270] = 175724631;
        hn.cjzo[271] = -1317520383;
        hn.cjzo[272] = 777333714;
        hn.cjzo[273] = 1273804113;
        hn.cjzo[274] = 459568683;
        hn.cjzo[275] = -1152484673;
        hn.cjzo[276] = 1588616914;
        hn.cjzo[277] = 1009856150;
        hn.cjzo[278] = -1060957286;
        hn.cjzo[279] = 474632850;
        hn.cjzo[280] = 682221310;
        hn.cjzo[281] = 19914218;
        hn.cjzo[282] = 993708460;
        hn.cjzo[283] = 939282730;
        hn.cjzo[284] = 912220329;
        hn.cjzo[285] = 559758196;
        hn.cjzo[286] = 432623244;
        hn.cjzo[287] = 1813557546;
        hn.cjzo[288] = 1093512614;
        hn.cjzo[289] = -1188480505;
        hn.cjzo[290] = 735781394;
        hn.cjzo[291] = -207893201;
        hn.cjzo[292] = 121320955;
        hn.cjzo[293] = 49322953;
        hn.cjzo[294] = 1950871454;
        hn.cjzo[295] = 596918033;
        hn.cjzo[296] = -1873905708;
        hn.cjzo[297] = -1264816876;
        hn.cjzo[298] = 1355987239;
        hn.cjzo[299] = 1910058856;
    }

    private static /* synthetic */ void cqxc() {
        hn.cjzg[300] = 4237154150784490775L;
        hn.cjzg[301] = 2023092320252859835L;
        hn.cjzg[302] = -7928739846499629154L;
        hn.cjzg[303] = -6940442967553075276L;
        hn.cjzg[304] = -1829739612551927299L;
        hn.cjzg[305] = -3902886229769003698L;
        hn.cjzg[306] = 7724308939174488787L;
        hn.cjzg[307] = 4590663184990454146L;
        hn.cjzg[308] = -6684235206122563389L;
        hn.cjzg[309] = -2105693779493804788L;
        hn.cjzg[310] = 2588041613723127107L;
        hn.cjzg[311] = -1132230531062753770L;
        hn.cjzg[312] = -7279259238870463351L;
        hn.cjzg[313] = 4483490331033932344L;
        hn.cjzg[314] = -7084072878300327088L;
        hn.cjzg[315] = -2293048182612004552L;
        hn.cjzg[316] = 8545561932253271090L;
        hn.cjzg[317] = 6870950934357622126L;
        hn.cjzg[318] = 1338458544613677312L;
        hn.cjzg[319] = 8204281682114965721L;
        hn.cjzg[320] = -3841514313393439614L;
        hn.cjzg[321] = -1963199315810016976L;
        hn.cjzg[322] = 2031757346739742329L;
        hn.cjzg[323] = -3841588025572375105L;
        hn.cjzg[324] = 4060089321275427435L;
        hn.cjzg[325] = -9006663873448709967L;
        hn.cjzg[326] = -2055335380002954556L;
        hn.cjzg[327] = -8380790977190473395L;
        hn.cjzg[328] = -3077127094558110787L;
        hn.cjzg[329] = 5154745204207009950L;
        hn.cjzg[330] = 4651525523986207504L;
        hn.cjzg[331] = -5284147894800855868L;
        hn.cjzg[332] = -2983739645490077581L;
        hn.cjzg[333] = -2489412795490140393L;
        hn.cjzg[334] = 1366513799859606475L;
        hn.cjzg[335] = 6138728681134921031L;
        hn.cjzg[336] = -4887854326040498581L;
        hn.cjzg[337] = 3609516907492519019L;
        hn.cjzg[338] = 4850940836955691477L;
        hn.cjzg[339] = 2181898798937892464L;
        hn.cjzg[340] = 6045966839533518941L;
        hn.cjzg[341] = 3729089316620988146L;
        hn.cjzg[342] = -8776028363518296597L;
        hn.cjzg[343] = 4899714082319279967L;
        hn.cjzg[344] = 5109525634937907292L;
        hn.cjzg[345] = 5417121567955040707L;
        hn.cjzg[346] = -7185231413724358179L;
        hn.cjzg[347] = 8437686358217726210L;
        hn.cjzg[348] = -59294796943471159L;
        hn.cjzg[349] = 6722700275207028089L;
        hn.cjzg[350] = -6607229657567474583L;
        hn.cjzg[351] = -2665333506328623471L;
        hn.cjzg[352] = 7423154905828397578L;
        hn.cjzg[353] = -8314600174285190983L;
        hn.cjzg[354] = 5409295869293162246L;
        hn.cjzg[355] = 4766297258380504206L;
        hn.cjzg[356] = -7290980465332647374L;
        hn.cjzg[357] = -6440693617069856407L;
        hn.cjzg[358] = -5840915428083850254L;
        hn.cjzg[359] = 3561825298723301640L;
        hn.cjzg[360] = 6059585271492339639L;
        hn.cjzg[361] = -955976024289950451L;
        hn.cjzg[362] = -5954911472722467104L;
        hn.cjzg[363] = -4490924923744868131L;
        hn.cjzg[364] = -7439740000395203059L;
        hn.cjzg[365] = -6550156931461050586L;
        hn.cjzg[366] = 1657507591963876908L;
        hn.cjzg[367] = -6969205285085108466L;
        hn.cjzg[368] = -3473438504092530916L;
        hn.cjzg[369] = -4977403941282708273L;
        hn.cjzg[370] = 2185251614142993142L;
        hn.cjzg[371] = 1330148535460586610L;
        hn.cjzg[372] = -5160408916452030791L;
        hn.cjzg[373] = -8073273334289890487L;
        hn.cjzg[374] = -8434018018228926302L;
        hn.cjzg[375] = -2317008332096909497L;
        hn.cjzg[376] = 3498204538818508205L;
        hn.cjzg[377] = 8415658168991060063L;
        hn.cjzg[378] = 2718834426115669219L;
        hn.cjzg[379] = -8978997147420892866L;
        hn.cjzg[380] = -2859001434479278909L;
        hn.cjzg[381] = -389696852997776592L;
        hn.cjzg[382] = 495656656190161580L;
        hn.cjzg[383] = 2559889545146247688L;
        hn.cjzg[384] = -199791267426093473L;
        hn.cjzg[385] = 1912369747955006511L;
        hn.cjzg[386] = -5889704626304288237L;
        hn.cjzg[387] = 7794818391004775284L;
        hn.cjzg[388] = -4416699351803440743L;
        hn.cjzg[389] = 1636339946026867504L;
        hn.cjzg[390] = 7890257403291721808L;
        hn.cjzg[391] = 2445295692095016766L;
        hn.cjzg[392] = 3657779248302706696L;
        hn.cjzg[393] = -5259630455530822756L;
        hn.cjzg[394] = 4733289185658669139L;
        hn.cjzg[395] = 3439710349187379968L;
        hn.cjzg[396] = 7867466638617674098L;
        hn.cjzg[397] = 2302661860460408999L;
        hn.cjzg[398] = -2433625237362470505L;
        hn.cjzg[399] = -5240555232582798690L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getRwWallBypass() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpmq", cjzf(int ), (int)622)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpmr", cjzm(int ), (int)1307)) break;
            v0 /* !! */  = (long)hn.cjzi("cpms", cjzm(int ), (int)1308);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cpmt", cjzf(int ), (int)623));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1423326163: {
                    v2 = hn.cjzi("cpmu", cjzf(int ), (int)624);
                    continue block12;
                }
                case -841682887: {
                    break block12;
                }
                case 875034596: {
                    v2 = hn.cjzi("cpmv", cjzf(int ), (int)625);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpmw", cjzf(int ), (int)626)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("cpmx", cjzm(int ), (int)1309)) break;
            v3 /* !! */  = (long)hn.cjzi("cpmy", cjzm(int ), (int)1310);
        }
        var1_3 = hn.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpmz", cjzf(int ), (int)627)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpna", cjzm(int ), (int)1311)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpnb", cjzm(int ), (int)1312);
                }
                return this.rwWallBypass;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpnc", cjzm(int ), (int)1313);
                if (!var3_1) break;
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpnd", cjzm(int ), (int)1314);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpne", cjzm(int ), (int)1315);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpnf", cjzm(int ), (int)1316);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float finalDistance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("ckve", cjzf(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hn.cjzi("ckvf", cjzm(int ), (int)341)) break;
            v0 /* !! */  = (long)hn.cjzi("ckvg", cjzm(int ), (int)342);
        }
        var4_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("ckvh", cjzf(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hn.cjzi("ckvi", cjzm(int ), (int)343)) break;
            v1 /* !! */  = (long)hn.cjzi("ckvj", cjzm(int ), (int)344);
        }
        var3_2 /* !! */  = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl17
        block35: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("ckvl", cjzf(int ), (int)90) - hn.cjzi("ckvk", cjzf(int ), (int)89));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block35;
                }
                case -763607620: {
                    continue block35;
                }
            }
            break;
        }
        var2_3 = hn.a;
        if (!var4_1) ** GOTO lbl29
        throw null;
        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)hn.cjzi("ckvm", ckbd(int ), (int)345);
                }
lbl29:
                // 1 sources

                if (var2_3 || var2_3) continue block36;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("ckvn", cjzf(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hn.cjzi("ckvo", cjzm(int ), (int)346)) break;
                    v3 /* !! */  = (long)hn.cjzi("ckvp", cjzm(int ), (int)347);
                }
                var1_4 = hl.getInstance();
                if (var2_3 || var2_3) continue block36;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("ckvq", cjzf(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hn.cjzi("ckvr", cjzm(int ), (int)348)) break;
                    v4 /* !! */  = (long)hn.cjzi("ckvs", cjzm(int ), (int)349);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("ckvt", cjzf(int ), (int)93)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("ckvu", cjzm(int ), (int)350)) break;
                    v5 /* !! */  = (long)hn.cjzi("ckvv", cjzm(int ), (int)351);
                }
                v6 = hn.mc.field_1724;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("ckvw", cjzf(int ), (int)94)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("ckvx", cjzm(int ), (int)352)) break;
                    v7 /* !! */  = (long)hn.cjzi("ckvy", cjzm(int ), (int)353);
                }
                if (!v6.method_6128()) ** GOTO lbl104
                if (var2_3) continue block36;
                if (var1_4 == null) ** GOTO lbl104
                if (var2_3) continue block36;
                v8 /* !! */  = hn.fz;
                if (true) ** GOTO lbl61
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - hn.cjzi("ckvz", cjzf(int ), (int)95));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1758519747: {
                            v9 = hn.cjzi("ckwa", cjzf(int ), (int)96);
                            continue block41;
                        }
                        case -841682887: {
                            break block41;
                        }
                        case 181401929: {
                            v9 = hn.cjzi("ckwb", cjzf(int ), (int)97);
                            continue block41;
                        }
                    }
                    break;
                }
                if (!var1_4.isState()) ** GOTO lbl104
                if (var2_3 || var2_3) continue block36;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("ckwc", cjzf(int ), (int)98)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hn.cjzi("ckwd", cjzm(int ), (int)354)) break;
                    v10 /* !! */  = (long)hn.cjzi("ckwe", cjzm(int ), (int)355);
                }
                v11 = this.effectiveAttackDistance();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("ckwf", cjzf(int ), (int)99)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hn.cjzi("ckwg", cjzm(int ), (int)356)) break;
                    v12 /* !! */  = (long)hn.cjzi("ckwh", cjzm(int ), (int)357);
                }
                v13 = var1_4.elytraFindRange;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = hn.fz - hn.cjzi("ckwi", cjzf(int ), (int)100)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hn.cjzi("ckwj", cjzm(int ), (int)358)) break;
                    v14 /* !! */  = (long)hn.cjzi("ckwk", cjzm(int ), (int)359);
                }
                v15 = v13.getValue();
                v16 /* !! */  = hn.fz;
                if (true) ** GOTO lbl94
                block45: while (true) {
                    v16 /* !! */  = (long)(v17 - hn.cjzi("ckwl", cjzf(int ), (int)101));
lbl94:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1738445520: {
                            v17 = hn.cjzi("ckwm", cjzf(int ), (int)102);
                            continue block45;
                        }
                        case -841682887: {
                            break block45;
                        }
                        case 1408445475: {
                            v17 = hn.cjzi("ckwn", cjzf(int ), (int)103);
                            continue block45;
                        }
                    }
                    break;
                }
                return Math.max(v11, v15);
lbl104:
                // 3 sources

                if (!var2_3 && !var2_3) ** break;
                continue block36;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_9 = hn.fz - hn.cjzi("ckwo", cjzf(int ), (int)104)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hn.cjzi("ckwp", cjzm(int ), (int)360)) break;
                    v18 /* !! */  = (long)hn.cjzi("ckwq", cjzm(int ), (int)361);
                }
                v19 = this.effectiveAttackDistance();
                v20 /* !! */  = hn.fz;
                if (true) ** GOTO lbl116
                block47: while (true) {
                    v20 /* !! */  = (long)(hn.cjzi("ckws", cjzf(int ), (int)106) - hn.cjzi("ckwr", cjzf(int ), (int)105));
lbl116:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -841682887: {
                            break block47;
                        }
                        case 2132584334: {
                            continue block47;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_10 = hn.fz - hn.cjzi("ckwt", cjzf(int ), (int)107)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hn.cjzi("ckwu", cjzm(int ), (int)362)) break;
                    v21 /* !! */  = (long)hn.cjzi("ckwv", cjzm(int ), (int)363);
                }
                return v19 + this.lookrange.getValue();
lbl127:
                // 3 sources

                case 0: {
                    do {
                        var3_2 /* !! */  = (int)hn.cjzi("ckww", cjzm(int ), (int)364);
                    } while (!var4_1);
                    throw null;
                }
                case 1: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckwx", cjzm(int ), (int)365);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl158
                }
lbl137:
                // 2 sources

                case 2: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckwy", cjzm(int ), (int)366);
                    if (!var4_1) ** GOTO lbl127
                    throw null;
                }
                case 3: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckwz", cjzm(int ), (int)367);
                    if (var4_1) {
                        throw null;
                    }
                }
lbl145:
                // 4 sources

                case 4: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxa", cjzm(int ), (int)368);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 5: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxb", cjzm(int ), (int)369);
                    if (!var4_1) ** GOTO lbl127
                    throw null;
                }
lbl153:
                // 2 sources

                case 6: {
                    do {
                        var3_2 /* !! */  = (int)hn.cjzi("ckxc", cjzm(int ), (int)370);
                    } while (!var4_1);
                    throw null;
                }
lbl158:
                // 3 sources

                case 7: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxd", cjzm(int ), (int)371);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 8: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxe", cjzm(int ), (int)372);
                    if (!var4_1) ** GOTO lbl153
                    throw null;
                }
                case 9: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_2 /* !! */  = (int)hn.cjzi("ckxf", cjzm(int ), (int)373);
                        if (!var4_1) ** GOTO lbl158
                        throw null;
                    }
                }
                case 10: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxg", cjzm(int ), (int)374);
                    if (!var4_1) ** GOTO lbl137
                    throw null;
                }
                case 11: {
                    var3_2 /* !! */  = (int)hn.cjzi("ckxh", cjzm(int ), (int)375);
                    if (!var4_1) ** GOTO lbl145
                    throw null;
                }
                case 12: 
            }
        }
        var3_2 /* !! */  = (int)hn.cjzi("ckxi", cjzm(int ), (int)376);
        ** while (!var4_1)
lbl182:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqqg", cjzf(int ), (int)830)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hn.cjzi("cqqh", cjzm(int ), (int)1465)) break;
            v0 /* !! */  = (long)hn.cjzi("cqqj", cjzm(int ), (int)1466);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(hn.cjzi("cqqm", cjzf(int ), (int)832) - hn.cjzi("cqqk", cjzf(int ), (int)831));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -841682887: {
                    break block17;
                }
                case -163930359: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqqn", cjzf(int ), (int)833)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hn.cjzi("cqqp", cjzm(int ), (int)1467)) break;
            v2 /* !! */  = (long)hn.cjzi("cqqr", cjzm(int ), (int)1468);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl35
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("cqqt", cjzf(int ), (int)834));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -841682887: {
                            break block20;
                        }
                        case -7068868: {
                            v4 = hn.cjzi("cqqu", cjzf(int ), (int)835);
                            continue block20;
                        }
                        case 45968604: {
                            v4 = hn.cjzi("cqqv", cjzf(int ), (int)836);
                            continue block20;
                        }
                        case 955564214: {
                            v4 = hn.cjzi("cqqx", cjzf(int ), (int)837);
                            continue block20;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqqy", cjzf(int ), (int)838)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("cqra", cjzm(int ), (int)1469)) break;
                    v5 /* !! */  = (long)hn.cjzi("cqrb", cjzm(int ), (int)1470);
                }
                v6 = this.aimType.isSelected("Legit");
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cqrd", cjzf(int ), (int)839)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hn.cjzi("cqre", cjzm(int ), (int)1471)) break;
                    v7 /* !! */  = (long)hn.cjzi("cqrf", cjzm(int ), (int)1472);
                }
                return v6;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cqrg", cjzm(int ), (int)1473);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cqrh", cjzm(int ), (int)1474);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqri", cjzm(int ), (int)1475);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqrk", cjzm(int ), (int)1476);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqzg() {
        hn.cjzh[700] = 8618282504673155152L;
        hn.cjzh[701] = 8131106590031019862L;
        hn.cjzh[702] = -1551630023775162303L;
        hn.cjzh[703] = 1951912214349268410L;
        hn.cjzh[704] = 7079788933850311875L;
        hn.cjzh[705] = 2288819231188177929L;
        hn.cjzh[706] = -7015835151369706977L;
        hn.cjzh[707] = -384387296871852697L;
        hn.cjzh[708] = -4854288524916788206L;
        hn.cjzh[709] = -5006727877437075317L;
        hn.cjzh[710] = -8592073811674161367L;
        hn.cjzh[711] = -6680325631424149298L;
        hn.cjzh[712] = -6434567355543249615L;
        hn.cjzh[713] = 5584593848224734359L;
        hn.cjzh[714] = -3596851468843274534L;
        hn.cjzh[715] = -3370849171452100022L;
        hn.cjzh[716] = 7388226887929592681L;
        hn.cjzh[717] = -4867285227060234459L;
        hn.cjzh[718] = -7092903232376647298L;
        hn.cjzh[719] = -6550053898872277062L;
        hn.cjzh[720] = 2182878470435825110L;
        hn.cjzh[721] = -5728622966455610832L;
        hn.cjzh[722] = -2165775345099695760L;
        hn.cjzh[723] = 1504126251152627120L;
        hn.cjzh[724] = 3854001056616671490L;
        hn.cjzh[725] = -9082650292297591544L;
        hn.cjzh[726] = -3029104323402579482L;
        hn.cjzh[727] = 7242940631883533494L;
        hn.cjzh[728] = 8394497565073680892L;
        hn.cjzh[729] = 3435473490848617114L;
        hn.cjzh[730] = -9046259991835976792L;
        hn.cjzh[731] = -1840182970883703962L;
        hn.cjzh[732] = 8371375446289453691L;
        hn.cjzh[733] = -7316549621470267060L;
        hn.cjzh[734] = -763048455546939260L;
        hn.cjzh[735] = -2139511610319317600L;
        hn.cjzh[736] = -5807443201614809346L;
        hn.cjzh[737] = 2724413576488598367L;
        hn.cjzh[738] = 7856970223570438090L;
        hn.cjzh[739] = -7125357909514514117L;
        hn.cjzh[740] = 2311645985497520044L;
        hn.cjzh[741] = -917925876462073054L;
        hn.cjzh[742] = -3835468006368023345L;
        hn.cjzh[743] = 3598120612084164908L;
        hn.cjzh[744] = 6927690372191122040L;
        hn.cjzh[745] = -3379290014267296105L;
        hn.cjzh[746] = 364330263021229602L;
        hn.cjzh[747] = -96346190345403832L;
        hn.cjzh[748] = 1979390463772719872L;
        hn.cjzh[749] = -6089565200573478818L;
        hn.cjzh[750] = -3614660132720182428L;
        hn.cjzh[751] = -854424137026449460L;
        hn.cjzh[752] = -3856659532930926695L;
        hn.cjzh[753] = -1315273718236628368L;
        hn.cjzh[754] = -706101164018026989L;
        hn.cjzh[755] = 2030759041754055269L;
        hn.cjzh[756] = 5991074876394984167L;
        hn.cjzh[757] = 7065200313231323772L;
        hn.cjzh[758] = 6999059276612196497L;
        hn.cjzh[759] = -6563215759064814718L;
        hn.cjzh[760] = -4833982438466763356L;
        hn.cjzh[761] = -1458669315246301575L;
        hn.cjzh[762] = 7267475654937956415L;
        hn.cjzh[763] = -8456134125102554678L;
        hn.cjzh[764] = 7654827723924075086L;
        hn.cjzh[765] = -319040016380239815L;
        hn.cjzh[766] = 4879684770440251764L;
        hn.cjzh[767] = -6371677115750617365L;
        hn.cjzh[768] = -2474862927735036879L;
        hn.cjzh[769] = 1018372561183131388L;
        hn.cjzh[770] = -6979537137137353404L;
        hn.cjzh[771] = -409121000392285311L;
        hn.cjzh[772] = 6918428043639389423L;
        hn.cjzh[773] = 2812349551130765592L;
        hn.cjzh[774] = 7824443076060236028L;
        hn.cjzh[775] = 2062137074297536518L;
        hn.cjzh[776] = -5418397178296062278L;
        hn.cjzh[777] = 7138095193338184264L;
        hn.cjzh[778] = -419647439886086984L;
        hn.cjzh[779] = -8723241435182741628L;
        hn.cjzh[780] = 8720742143402972408L;
        hn.cjzh[781] = -3653073471914015275L;
        hn.cjzh[782] = -5472510476133655707L;
        hn.cjzh[783] = 3200463363532228181L;
        hn.cjzh[784] = -3626277546074593002L;
        hn.cjzh[785] = 2858474766700462069L;
        hn.cjzh[786] = 1311549912959547806L;
        hn.cjzh[787] = -8120615315319669658L;
        hn.cjzh[788] = -6987671361478095720L;
        hn.cjzh[789] = -2867067533279340710L;
        hn.cjzh[790] = -6441548837367414342L;
        hn.cjzh[791] = 4093298737460724216L;
        hn.cjzh[792] = -1806520581192746364L;
        hn.cjzh[793] = 295733244726718733L;
        hn.cjzh[794] = -7984498865074217484L;
        hn.cjzh[795] = 871606718805616482L;
        hn.cjzh[796] = 2818616942313519285L;
        hn.cjzh[797] = -4378553455128853697L;
        hn.cjzh[798] = -3464491364200189727L;
        hn.cjzh[799] = -7509829900799352132L;
    }

    private static /* synthetic */ void cqtd() {
        hn.cjzn[1000] = 1706253846;
        hn.cjzn[1001] = 328126694;
        hn.cjzn[1002] = 1657546201;
        hn.cjzn[1003] = -939828208;
        hn.cjzn[1004] = 160950919;
        hn.cjzn[1005] = -384660609;
        hn.cjzn[1006] = -686443927;
        hn.cjzn[1007] = 352603520;
        hn.cjzn[1008] = -948207125;
        hn.cjzn[1009] = 319189628;
        hn.cjzn[1010] = 1333904173;
        hn.cjzn[1011] = -2045497705;
        hn.cjzn[1012] = 1590756808;
        hn.cjzn[1013] = -1624542480;
        hn.cjzn[1014] = -939730073;
        hn.cjzn[1015] = -1434620406;
        hn.cjzn[1016] = -1192293186;
        hn.cjzn[1017] = -1420524858;
        hn.cjzn[1018] = -188687013;
        hn.cjzn[1019] = 390906629;
        hn.cjzn[1020] = 53027520;
        hn.cjzn[1021] = 409851094;
        hn.cjzn[1022] = -1474972459;
        hn.cjzn[1023] = 518498347;
        hn.cjzn[1024] = 1198096231;
        hn.cjzn[1025] = 1043147307;
        hn.cjzn[1026] = 1308301630;
        hn.cjzn[1027] = -415105288;
        hn.cjzn[1028] = 368274261;
        hn.cjzn[1029] = 815774237;
        hn.cjzn[1030] = -1067797410;
        hn.cjzn[1031] = -528180738;
        hn.cjzn[1032] = 1256327302;
        hn.cjzn[1033] = -1626310558;
        hn.cjzn[1034] = 257915539;
        hn.cjzn[1035] = 878900373;
        hn.cjzn[1036] = 1660842775;
        hn.cjzn[1037] = 1624828099;
        hn.cjzn[1038] = 906514043;
        hn.cjzn[1039] = 360618576;
        hn.cjzn[1040] = 2109959164;
        hn.cjzn[1041] = -2001617884;
        hn.cjzn[1042] = -707182488;
        hn.cjzn[1043] = 253428603;
        hn.cjzn[1044] = 1964245657;
        hn.cjzn[1045] = 1435343687;
        hn.cjzn[1046] = -1896873573;
        hn.cjzn[1047] = -263395546;
        hn.cjzn[1048] = 1905128598;
        hn.cjzn[1049] = -741686238;
        hn.cjzn[1050] = -1057662539;
        hn.cjzn[1051] = 1190940144;
        hn.cjzn[1052] = 465023150;
        hn.cjzn[1053] = 1328439244;
        hn.cjzn[1054] = -290539659;
        hn.cjzn[1055] = -1228873707;
        hn.cjzn[1056] = 970274892;
        hn.cjzn[1057] = -1880707435;
        hn.cjzn[1058] = 1854942585;
        hn.cjzn[1059] = -1307296647;
        hn.cjzn[1060] = -550613394;
        hn.cjzn[1061] = 1627354368;
        hn.cjzn[1062] = -404721339;
        hn.cjzn[1063] = 567170023;
        hn.cjzn[1064] = -1354520160;
        hn.cjzn[1065] = -813282582;
        hn.cjzn[1066] = -1962561627;
        hn.cjzn[1067] = -2086923402;
        hn.cjzn[1068] = 1964515265;
        hn.cjzn[1069] = -1789743229;
        hn.cjzn[1070] = 1168853096;
        hn.cjzn[1071] = -1402938099;
        hn.cjzn[1072] = -141690404;
        hn.cjzn[1073] = 54528321;
        hn.cjzn[1074] = 98421168;
        hn.cjzn[1075] = 460822163;
        hn.cjzn[1076] = -2027427713;
        hn.cjzn[1077] = -1427770519;
        hn.cjzn[1078] = -1556366579;
        hn.cjzn[1079] = 533745206;
        hn.cjzn[1080] = -226472934;
        hn.cjzn[1081] = -776111097;
        hn.cjzn[1082] = 1076825817;
        hn.cjzn[1083] = -1271677417;
        hn.cjzn[1084] = 79742000;
        hn.cjzn[1085] = 359152771;
        hn.cjzn[1086] = 805882;
        hn.cjzn[1087] = 751185339;
        hn.cjzn[1088] = 1200568358;
        hn.cjzn[1089] = 1958242170;
        hn.cjzn[1090] = 926008402;
        hn.cjzn[1091] = -1720223065;
        hn.cjzn[1092] = -947596737;
        hn.cjzn[1093] = 1768372180;
        hn.cjzn[1094] = -1055756311;
        hn.cjzn[1095] = -265041733;
        hn.cjzn[1096] = -233182071;
        hn.cjzn[1097] = 897774865;
        hn.cjzn[1098] = 2075981279;
        hn.cjzn[1099] = 1163569176;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getSmartCriticals() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpnx", cjzf(int ), (int)637));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1844507538: {
                    v1 = hn.cjzi("cpny", cjzf(int ), (int)638);
                    continue block19;
                }
                case -841682887: {
                    break block19;
                }
                case 1711859334: {
                    v1 = hn.cjzi("cpnz", cjzf(int ), (int)639);
                    continue block19;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(hn.cjzi("cpob", cjzf(int ), (int)641) - hn.cjzi("cpoa", cjzf(int ), (int)640));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1544939565: {
                    continue block20;
                }
                case -841682887: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(hn.cjzi("cpod", cjzf(int ), (int)643) - hn.cjzi("cpoc", cjzf(int ), (int)642));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1105583776: {
                    continue block21;
                }
                case -841682887: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpoe", cjzf(int ), (int)644)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpof", cjzm(int ), (int)1325)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpog", cjzm(int ), (int)1326);
                }
                return this.smartCriticals;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpoh", cjzm(int ), (int)1327);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpoi", cjzm(int ), (int)1328);
                if (!var3_1) break;
                throw null;
            }
lbl59:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpoj", cjzm(int ), (int)1329);
                    if (!var3_1) ** GOTO lbl50
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpok", cjzm(int ), (int)1330);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ie getHolyworldSmooth() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpan", cjzf(int ), (int)471));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1031256823: {
                    v1 = hn.cjzi("cpao", cjzf(int ), (int)472);
                    continue block23;
                }
                case -841682887: {
                    break block23;
                }
                case 1504897152: {
                    v1 = hn.cjzi("cpap", cjzf(int ), (int)473);
                    continue block23;
                }
                case 1818453275: {
                    v1 = hn.cjzi("cpaq", cjzf(int ), (int)474);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpar", cjzf(int ), (int)475));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1782917192: {
                    v3 = hn.cjzi("cpas", cjzf(int ), (int)476);
                    continue block24;
                }
                case -841682887: {
                    break block24;
                }
                case 624187219: {
                    v3 = hn.cjzi("cpat", cjzf(int ), (int)477);
                    continue block24;
                }
                case 1882791718: {
                    v3 = hn.cjzi("cpau", cjzf(int ), (int)478);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpav", cjzf(int ), (int)479)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpaw", cjzm(int ), (int)1143)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpax", cjzm(int ), (int)1144);
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - hn.cjzi("cpay", cjzf(int ), (int)480));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1268956072: {
                            v6 = hn.cjzi("cpaz", cjzf(int ), (int)481);
                            continue block27;
                        }
                        case -841682887: {
                            break block27;
                        }
                        case 496963513: {
                            v6 = hn.cjzi("cpba", cjzf(int ), (int)482);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.holyworldSmooth;
            }
lbl64:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpbb", cjzm(int ), (int)1145);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpbc", cjzm(int ), (int)1146);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpbd", cjzm(int ), (int)1147);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpbe", cjzm(int ), (int)1148);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getMaceReturnSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqah", cjzf(int ), (int)673)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cqaj", cjzm(int ), (int)1355)) break;
            v0 /* !! */  = (long)hn.cjzi("cqak", cjzm(int ), (int)1356);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqal", cjzf(int ), (int)674)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cqan", cjzm(int ), (int)1357)) break;
            v1 /* !! */  = (long)hn.cjzi("cqao", cjzm(int ), (int)1358);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqap", cjzf(int ), (int)675)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cqaq", cjzm(int ), (int)1359)) break;
            v2 /* !! */  = (long)hn.cjzi("cqar", cjzm(int ), (int)1360);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cqat", cjzf(int ), (int)676)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hn.cjzi("cqau", cjzm(int ), (int)1361)) break;
                    v3 /* !! */  = (long)hn.cjzi("cqaw", cjzm(int ), (int)1362);
                }
                return this.maceReturnSlot;
            }
lbl37:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cqax", cjzm(int ), (int)1363);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl47
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cqay", cjzm(int ), (int)1364);
                    if (!var3_1) ** GOTO lbl37
                    throw null;
                }
            }
lbl47:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqba", cjzm(int ), (int)1365);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqbb", cjzm(int ), (int)1366);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqtl() {
        hn.cjzn[1200] = -1162346784;
        hn.cjzn[1201] = -735612500;
        hn.cjzn[1202] = 1622540007;
        hn.cjzn[1203] = 501179986;
        hn.cjzn[1204] = 510898207;
        hn.cjzn[1205] = 711314217;
        hn.cjzn[1206] = 1058021485;
        hn.cjzn[1207] = 680521151;
        hn.cjzn[1208] = -1165072896;
        hn.cjzn[1209] = -899249159;
        hn.cjzn[1210] = 1434729076;
        hn.cjzn[1211] = 1133597899;
        hn.cjzn[1212] = -1299646662;
        hn.cjzn[1213] = 870217569;
        hn.cjzn[1214] = -771758029;
        hn.cjzn[1215] = -1545657100;
        hn.cjzn[1216] = -1696826351;
        hn.cjzn[1217] = -1996974485;
        hn.cjzn[1218] = -725295248;
        hn.cjzn[1219] = 818899869;
        hn.cjzn[1220] = 2047180882;
        hn.cjzn[1221] = -79062529;
        hn.cjzn[1222] = 2041615057;
        hn.cjzn[1223] = 560416067;
        hn.cjzn[1224] = -108456855;
        hn.cjzn[1225] = 603503160;
        hn.cjzn[1226] = -973659389;
        hn.cjzn[1227] = -1479827252;
        hn.cjzn[1228] = 479225278;
        hn.cjzn[1229] = 1642494728;
        hn.cjzn[1230] = -48339755;
        hn.cjzn[1231] = -1016485402;
        hn.cjzn[1232] = -302102915;
        hn.cjzn[1233] = -2034720594;
        hn.cjzn[1234] = -1057981514;
        hn.cjzn[1235] = -955070670;
        hn.cjzn[1236] = -1624394323;
        hn.cjzn[1237] = -371136127;
        hn.cjzn[1238] = -903898149;
        hn.cjzn[1239] = 484554880;
        hn.cjzn[1240] = 931735664;
        hn.cjzn[1241] = -815132632;
        hn.cjzn[1242] = 1672554111;
        hn.cjzn[1243] = -139476768;
        hn.cjzn[1244] = -2060599621;
        hn.cjzn[1245] = -401941267;
        hn.cjzn[1246] = -1129510200;
        hn.cjzn[1247] = -1297967652;
        hn.cjzn[1248] = 1103283438;
        hn.cjzn[1249] = 1382802217;
        hn.cjzn[1250] = -1767963965;
        hn.cjzn[1251] = -633138852;
        hn.cjzn[1252] = -2088278722;
        hn.cjzn[1253] = -1283042251;
        hn.cjzn[1254] = 9386369;
        hn.cjzn[1255] = 2078923723;
        hn.cjzn[1256] = -1085421096;
        hn.cjzn[1257] = -1254504226;
        hn.cjzn[1258] = -45359436;
        hn.cjzn[1259] = -90330056;
        hn.cjzn[1260] = -1431239922;
        hn.cjzn[1261] = -476014775;
        hn.cjzn[1262] = 929925101;
        hn.cjzn[1263] = -2141181363;
        hn.cjzn[1264] = -524267977;
        hn.cjzn[1265] = 1953973843;
        hn.cjzn[1266] = -1681708372;
        hn.cjzn[1267] = -21261423;
        hn.cjzn[1268] = 1663161520;
        hn.cjzn[1269] = 1124100445;
        hn.cjzn[1270] = 1431664383;
        hn.cjzn[1271] = -626936743;
        hn.cjzn[1272] = 569296836;
        hn.cjzn[1273] = 1825010316;
        hn.cjzn[1274] = 1971591581;
        hn.cjzn[1275] = 9202083;
        hn.cjzn[1276] = 214918789;
        hn.cjzn[1277] = 1537350430;
        hn.cjzn[1278] = -267402188;
        hn.cjzn[1279] = -1530658712;
        hn.cjzn[1280] = -2024003029;
        hn.cjzn[1281] = 1824773259;
        hn.cjzn[1282] = -463697367;
        hn.cjzn[1283] = -1388772938;
        hn.cjzn[1284] = -1828856490;
        hn.cjzn[1285] = 1347953618;
        hn.cjzn[1286] = 825006030;
        hn.cjzn[1287] = 1640260428;
        hn.cjzn[1288] = -914504632;
        hn.cjzn[1289] = -1640527434;
        hn.cjzn[1290] = 479670377;
        hn.cjzn[1291] = -298213552;
        hn.cjzn[1292] = 269360283;
        hn.cjzn[1293] = 1326876188;
        hn.cjzn[1294] = 2060124057;
        hn.cjzn[1295] = 1826041756;
        hn.cjzn[1296] = -1694770997;
        hn.cjzn[1297] = 521909925;
        hn.cjzn[1298] = 742384844;
        hn.cjzn[1299] = -1413469864;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateToTarget(hv$AttackPerpetratorConfigurable var1_1) {
        block80: {
            var9_2 = hn.c;
            var8_3 /* !! */  = hn.b;
            var7_4 = hn.a;
            if (var9_2) {
                throw null;
lbl6:
                // 22 sources

                return;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            var2_5 = ot.INSTANCE;
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!this.aimType.isSelected("Legit")) ** GOTO lbl28
            if (var7_4 || var7_4) ** GOTO lbl6
            if (this.legitDirectActive) break block80;
            if (var7_4 || var7_4) ** GOTO lbl6
            var2_5.forceStop();
            if (var7_4 || var7_4) ** GOTO lbl6
            this.legitSmooth.reset();
            if (var7_4 || var7_4) ** GOTO lbl6
            this.legitDirectActive = hn.cjzi("cojv", cjzm(int ), (int)825);
            if (var7_4) ** GOTO lbl6
        }
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl6
                return;
            }
lbl28:
            // 1 sources

            if (var7_4 || var7_4) ** GOTO lbl6
            if (!this.legitDirectActive) ** GOTO lbl37
            if (var7_4 || var7_4) ** GOTO lbl6
            var2_5.forceStop();
            if (var7_4 || var7_4) ** GOTO lbl6
            this.legitSmooth.reset();
            if (var7_4 || var7_4) ** GOTO lbl6
            this.legitDirectActive = hn.cjzi("cojw", cjzm(int ), (int)826);
            if (var7_4) ** GOTO lbl6
lbl37:
            // 2 sources

            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6 = new ov$VecRotation(var1_1.getAngle(), var1_1.getAngle().toVector());
            if (var7_4 || var7_4) ** GOTO lbl6
            var4_7 = this.getRotationConfig();
            if (var7_4 || var7_4) ** GOTO lbl6
            var5_8 = this.aimType.getValue();
            if (var7_4) ** GOTO lbl6
            var6_9 = hn.cjzi("cojx", cjzm(int ), (int)827);
            if (var7_4) ** GOTO lbl6
            var5_8.hashCode();
            if (var7_4) ** GOTO lbl6
            switch (var6_9) {
                default: 
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            var2_5.rotateTo(var3_6, this.target, (int)hn.cjzi("cojy", cjzm(int ), (int)828), var4_7, nn.HIGH_IMPORTANCE_1, this);
            if (!var7_4 && !var7_4) ** break;
            ** continue;
            return;
            case 0: {
                var8_3 /* !! */  = (int)hn.cjzi("cojz", cjzm(int ), (int)829);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl61:
            // 4 sources

            case 1: {
                var8_3 /* !! */  = (int)hn.cjzi("coka", cjzm(int ), (int)830);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl66:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)hn.cjzi("cokb", cjzm(int ), (int)831);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl71:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)hn.cjzi("cokc", cjzm(int ), (int)832);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl76:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)hn.cjzi("cokd", cjzm(int ), (int)833);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl81:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)hn.cjzi("coke", cjzm(int ), (int)834);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl86:
            // 3 sources

            case 6: {
                var8_3 /* !! */  = (int)hn.cjzi("cokf", cjzm(int ), (int)835);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl91:
            // 2 sources

            case 7: {
                do {
                    var8_3 /* !! */  = (int)hn.cjzi("cokg", cjzm(int ), (int)836);
                } while (!var9_2);
                throw null;
            }
lbl96:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)hn.cjzi("cokh", cjzm(int ), (int)837);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl101:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)hn.cjzi("coki", cjzm(int ), (int)838);
                if (!var9_2) ** GOTO lbl66
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)hn.cjzi("cokj", cjzm(int ), (int)839);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl110:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)hn.cjzi("cokk", cjzm(int ), (int)840);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl115:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)hn.cjzi("cokl", cjzm(int ), (int)841);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 13: {
                var8_3 /* !! */  = (int)hn.cjzi("cokm", cjzm(int ), (int)842);
                if (!var9_2) ** GOTO lbl71
                throw null;
            }
            case 14: {
                var8_3 /* !! */  = (int)hn.cjzi("cokn", cjzm(int ), (int)843);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl129:
            // 4 sources

            case 15: {
                var8_3 /* !! */  = (int)hn.cjzi("coko", cjzm(int ), (int)844);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 16: {
                var8_3 /* !! */  = (int)hn.cjzi("cokp", cjzm(int ), (int)845);
                if (!var9_2) ** GOTO lbl96
                throw null;
            }
lbl138:
            // 3 sources

            case 17: {
                var8_3 /* !! */  = (int)hn.cjzi("cokq", cjzm(int ), (int)846);
                if (var9_2) {
                    throw null;
                }
            }
lbl142:
            // 5 sources

            case 18: {
                var8_3 /* !! */  = (int)hn.cjzi("cokr", cjzm(int ), (int)847);
                if (!var9_2) ** GOTO lbl76
                throw null;
            }
lbl146:
            // 4 sources

            case 19: {
                var8_3 /* !! */  = (int)hn.cjzi("coks", cjzm(int ), (int)848);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
lbl150:
            // 3 sources

            case 20: {
                var8_3 /* !! */  = (int)hn.cjzi("cokt", cjzm(int ), (int)849);
                if (!var9_2) ** GOTO lbl86
                throw null;
            }
lbl154:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)hn.cjzi("coku", cjzm(int ), (int)850);
                if (!var9_2) ** GOTO lbl66
                throw null;
            }
            case 22: {
                var8_3 /* !! */  = (int)hn.cjzi("cokv", cjzm(int ), (int)851);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
lbl162:
            // 3 sources

            case 23: {
                var8_3 /* !! */  = (int)hn.cjzi("cokw", cjzm(int ), (int)852);
                if (!var9_2) ** GOTO lbl110
                throw null;
            }
            case 24: {
                var8_3 /* !! */  = (int)hn.cjzi("cokx", cjzm(int ), (int)853);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 25: {
                var8_3 /* !! */  = (int)hn.cjzi("coky", cjzm(int ), (int)854);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 26: {
                var8_3 /* !! */  = (int)hn.cjzi("cokz", cjzm(int ), (int)855);
                if (!var9_2) ** GOTO lbl81
                throw null;
            }
            case 27: {
                var8_3 /* !! */  = (int)hn.cjzi("cola", cjzm(int ), (int)856);
                if (!var9_2) ** GOTO lbl61
                throw null;
            }
lbl184:
            // 2 sources

            case 28: {
                var8_3 /* !! */  = (int)hn.cjzi("colb", cjzm(int ), (int)857);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 29: {
                var8_3 /* !! */  = (int)hn.cjzi("colc", cjzm(int ), (int)858);
                if (!var9_2) ** GOTO lbl61
                throw null;
            }
            case 30: {
                var8_3 /* !! */  = (int)hn.cjzi("cold", cjzm(int ), (int)859);
                if (!var9_2) ** GOTO lbl129
                throw null;
            }
lbl197:
            // 2 sources

            case 31: {
                var8_3 /* !! */  = (int)hn.cjzi("cole", cjzm(int ), (int)860);
                if (!var9_2) ** GOTO lbl184
                throw null;
            }
lbl201:
            // 2 sources

            case 32: {
                var8_3 /* !! */  = (int)hn.cjzi("colf", cjzm(int ), (int)861);
                if (!var9_2) ** GOTO lbl61
                throw null;
            }
lbl205:
            // 2 sources

            case 33: {
                var8_3 /* !! */  = (int)hn.cjzi("colg", cjzm(int ), (int)862);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
            case 34: {
                var8_3 /* !! */  = (int)hn.cjzi("colh", cjzm(int ), (int)863);
                if (!var9_2) ** GOTO lbl91
                throw null;
            }
            case 35: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)hn.cjzi("coli", cjzm(int ), (int)864);
                    if (!var9_2) ** GOTO lbl142
                    throw null;
                }
            }
lbl218:
            // 2 sources

            case 36: {
                var8_3 /* !! */  = (int)hn.cjzi("colj", cjzm(int ), (int)865);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
lbl222:
            // 2 sources

            case 37: {
                var8_3 /* !! */  = (int)hn.cjzi("colk", cjzm(int ), (int)866);
                if (!var9_2) ** GOTO lbl129
                throw null;
            }
lbl226:
            // 2 sources

            case 38: {
                var8_3 /* !! */  = (int)hn.cjzi("coll", cjzm(int ), (int)867);
                if (!var9_2) ** GOTO lbl201
                throw null;
            }
            case 39: 
        }
        var8_3 /* !! */  = (int)hn.cjzi("colm", cjzm(int ), (int)868);
        ** while (!var9_2)
lbl233:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getCpsValue() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpkc", cjzf(int ), (int)590));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1122166449: {
                    v1 = hn.cjzi("cpkd", cjzf(int ), (int)591);
                    continue block18;
                }
                case -841682887: {
                    break block18;
                }
                case 447867218: {
                    v1 = hn.cjzi("cpke", cjzf(int ), (int)592);
                    continue block18;
                }
                case 1338220876: {
                    v1 = hn.cjzi("cpkf", cjzf(int ), (int)593);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpkg", cjzf(int ), (int)594)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cpkh", cjzm(int ), (int)1273)) break;
            v2 /* !! */  = (long)hn.cjzi("cpki", cjzm(int ), (int)1274);
        }
        var2_2 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cpkj", cjzf(int ), (int)595));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -841682887: {
                    break block20;
                }
                case -44218506: {
                    v4 = hn.cjzi("cpkk", cjzf(int ), (int)596);
                    continue block20;
                }
                case 497925426: {
                    v4 = hn.cjzi("cpkl", cjzf(int ), (int)597);
                    continue block20;
                }
                case 770035866: {
                    v4 = hn.cjzi("cpkm", cjzf(int ), (int)598);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpkn", cjzf(int ), (int)599)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cpko", cjzm(int ), (int)1275)) break;
                    v5 /* !! */  = (long)hn.cjzi("cpkp", cjzm(int ), (int)1276);
                }
                return this.cpsValue;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpkq", cjzm(int ), (int)1277);
                if (!var3_1) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpkr", cjzm(int ), (int)1278);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cpks", cjzm(int ), (int)1279);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpkt", cjzm(int ), (int)1280);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqzf() {
        hn.cjzh[600] = 3972147575292707176L;
        hn.cjzh[601] = 8185082690520770681L;
        hn.cjzh[602] = -807859202301970867L;
        hn.cjzh[603] = -334143203234425775L;
        hn.cjzh[604] = -3651484576688595520L;
        hn.cjzh[605] = -1523967862401400612L;
        hn.cjzh[606] = -4562302972684453848L;
        hn.cjzh[607] = 75356846154894184L;
        hn.cjzh[608] = -4254312120814895116L;
        hn.cjzh[609] = 3899827913851222637L;
        hn.cjzh[610] = -4454617348510998788L;
        hn.cjzh[611] = 3025085954306702329L;
        hn.cjzh[612] = -2637713301911890548L;
        hn.cjzh[613] = 6810185149542189187L;
        hn.cjzh[614] = -8847425955010650425L;
        hn.cjzh[615] = 2134029527200264818L;
        hn.cjzh[616] = 4731510738953331896L;
        hn.cjzh[617] = -8821822076632807123L;
        hn.cjzh[618] = -8285357613384254479L;
        hn.cjzh[619] = -6948118903659000356L;
        hn.cjzh[620] = -6865078029586131525L;
        hn.cjzh[621] = -9039705554674779581L;
        hn.cjzh[622] = 8753804012126975207L;
        hn.cjzh[623] = 9091219511663273397L;
        hn.cjzh[624] = 5178353385108984531L;
        hn.cjzh[625] = -2573853272357044618L;
        hn.cjzh[626] = -4100051371105850691L;
        hn.cjzh[627] = -1146080221754252141L;
        hn.cjzh[628] = 337396208087976293L;
        hn.cjzh[629] = 196535712350884768L;
        hn.cjzh[630] = 5998414526789951217L;
        hn.cjzh[631] = -4712811914327730281L;
        hn.cjzh[632] = 7818140574200302259L;
        hn.cjzh[633] = 2760983179881097438L;
        hn.cjzh[634] = 7224387093331972947L;
        hn.cjzh[635] = -898123490896466263L;
        hn.cjzh[636] = 2544001721224514560L;
        hn.cjzh[637] = -2249395591169384650L;
        hn.cjzh[638] = 783322215120334079L;
        hn.cjzh[639] = -782448914454434393L;
        hn.cjzh[640] = 423186137415864916L;
        hn.cjzh[641] = 5862319247595744228L;
        hn.cjzh[642] = 6931243966550490081L;
        hn.cjzh[643] = -4524385356928235848L;
        hn.cjzh[644] = -1570910277266126353L;
        hn.cjzh[645] = 3875324407159521116L;
        hn.cjzh[646] = -2887562799642340838L;
        hn.cjzh[647] = 8015754391527724680L;
        hn.cjzh[648] = 6473358150589284149L;
        hn.cjzh[649] = -1796734142541594501L;
        hn.cjzh[650] = -6285458505249629614L;
        hn.cjzh[651] = -7696466502368976720L;
        hn.cjzh[652] = 3168900365198408352L;
        hn.cjzh[653] = -4866117490276816630L;
        hn.cjzh[654] = 161376434906737275L;
        hn.cjzh[655] = 4178621086709983788L;
        hn.cjzh[656] = 5961620822638355230L;
        hn.cjzh[657] = -93365629908053839L;
        hn.cjzh[658] = -4397278018219238506L;
        hn.cjzh[659] = -6582564918523944528L;
        hn.cjzh[660] = -5146116870470307457L;
        hn.cjzh[661] = 8809602023761336531L;
        hn.cjzh[662] = 4008675495050035950L;
        hn.cjzh[663] = -6551006094448740680L;
        hn.cjzh[664] = -2234657611727497084L;
        hn.cjzh[665] = -5793227841504411407L;
        hn.cjzh[666] = 2922004208291040266L;
        hn.cjzh[667] = -1308646511962174431L;
        hn.cjzh[668] = -4782035775839224277L;
        hn.cjzh[669] = -9020798188127297368L;
        hn.cjzh[670] = 5848397367952271955L;
        hn.cjzh[671] = -8000936828415100917L;
        hn.cjzh[672] = -5789472879971815858L;
        hn.cjzh[673] = -107794504726112273L;
        hn.cjzh[674] = 2651371626198258526L;
        hn.cjzh[675] = 353920298316525173L;
        hn.cjzh[676] = 5384200206166888248L;
        hn.cjzh[677] = -2248547420172682923L;
        hn.cjzh[678] = -2266023742014326027L;
        hn.cjzh[679] = -7299755259291968876L;
        hn.cjzh[680] = 7664262802972440643L;
        hn.cjzh[681] = 367018495203548784L;
        hn.cjzh[682] = -5348217121894242750L;
        hn.cjzh[683] = -9058446969396424524L;
        hn.cjzh[684] = -1363576836306392074L;
        hn.cjzh[685] = -1952258224152738723L;
        hn.cjzh[686] = -2294735170584055809L;
        hn.cjzh[687] = 3764836680500990266L;
        hn.cjzh[688] = -3124580895793163637L;
        hn.cjzh[689] = 2301250837275441223L;
        hn.cjzh[690] = -8424810113999734651L;
        hn.cjzh[691] = -6617584111747432166L;
        hn.cjzh[692] = 7743601101113830220L;
        hn.cjzh[693] = 3577600208658662604L;
        hn.cjzh[694] = 2800317000525167727L;
        hn.cjzh[695] = -5973592946402783248L;
        hn.cjzh[696] = -7129228510578817391L;
        hn.cjzh[697] = 7183913188803635120L;
        hn.cjzh[698] = -1071141215410927736L;
        hn.cjzh[699] = 118855570064212410L;
    }

    private static /* synthetic */ double clov(int n2) {
        return Double.longBitsToDouble(cjzg[n2] ^ cjzh[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ij getTestSmooth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpbw", cjzf(int ), (int)492)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpbx", cjzm(int ), (int)1157)) break;
            v0 /* !! */  = (long)hn.cjzi("cpby", cjzm(int ), (int)1158);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpbz", cjzf(int ), (int)493)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpca", cjzm(int ), (int)1159)) break;
            v1 /* !! */  = (long)hn.cjzi("cpcb", cjzm(int ), (int)1160);
        }
        var2_2 /* !! */  = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpcc", cjzf(int ), (int)494));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2057014728: {
                    v3 = hn.cjzi("cpcd", cjzf(int ), (int)495);
                    continue block14;
                }
                case -841682887: {
                    break block14;
                }
                case -72862549: {
                    v3 = hn.cjzi("cpce", cjzf(int ), (int)496);
                    continue block14;
                }
                case 1624563071: {
                    v3 = hn.cjzi("cpcf", cjzf(int ), (int)497);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpcg", cjzf(int ), (int)498)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpch", cjzm(int ), (int)1161)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpci", cjzm(int ), (int)1162);
                }
                return this.testSmooth;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpcj", cjzm(int ), (int)1163);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpck", cjzm(int ), (int)1164);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hn.cjzi("cpcl", cjzm(int ), (int)1165);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpcm", cjzm(int ), (int)1166);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getClickType() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(hn.cjzi("cpjo", cjzf(int ), (int)586) - hn.cjzi("cpjn", cjzf(int ), (int)585));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block10;
                }
                case 1125326640: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpjp", cjzf(int ), (int)587)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpjq", cjzm(int ), (int)1263)) break;
            v1 /* !! */  = (long)hn.cjzi("cpjr", cjzm(int ), (int)1264);
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpjs", cjzf(int ), (int)588)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hn.cjzi("cpjt", cjzm(int ), (int)1265)) break;
            v2 /* !! */  = (long)hn.cjzi("cpju", cjzm(int ), (int)1266);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cpjv", cjzf(int ), (int)589)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hn.cjzi("cpjw", cjzm(int ), (int)1267)) break;
                    v3 /* !! */  = (long)hn.cjzi("cpjx", cjzm(int ), (int)1268);
                }
                return this.clickType;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpjy", cjzm(int ), (int)1269);
                } while (!var3_1);
                throw null;
            }
lbl46:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpjz", cjzm(int ), (int)1270);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpka", cjzm(int ), (int)1271);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpkb", cjzm(int ), (int)1272);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handlePreRotationUpdate() {
        block128: {
            block127: {
                var6_1 = hn.c;
                var5_2 /* !! */  = hn.b;
                var4_3 = hn.a;
                if (var6_1) {
                    throw null;
lbl6:
                    // 35 sources

                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4.tickMace();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!var1_4.isSprintRotationLocked(this.target)) break block127;
                if (var4_3 || var4_3) ** GOTO lbl6
                v0 = this.target;
                if (var6_1) {
                    throw null;
                }
                break block128;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            v0 = var2_5 = this.updateTarget();
        }
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl68
                if (var4_3 || var4_3) ** GOTO lbl6
                if (this.target != null) ** GOTO lbl34
                if (var4_3) ** GOTO lbl6
                if (this.lastTarget == null) ** GOTO lbl60
                if (var4_3) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.targetSelector.releaseTarget();
                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.aimType.isSelected("Funtime")) ** GOTO lbl41
                if (var4_3 || var4_3) ** GOTO lbl6
                this.funTimeRotation.reset();
                if (var4_3) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.aimType.isSelected("FuntimeTest")) ** GOTO lbl46
                if (var4_3 || var4_3) ** GOTO lbl6
                this.funtimeTestSmooth.reset();
                if (var4_3) ** GOTO lbl6
lbl46:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                if (!this.aimType.isSelected("Holyworld")) ** GOTO lbl51
                if (var4_3 || var4_3) ** GOTO lbl6
                this.holyworldSmooth.onTargetLost();
                if (var4_3) ** GOTO lbl6
lbl51:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.stopRotation();
                if (var4_3 || var4_3) ** GOTO lbl6
                this.divineSmooth.reset();
                if (var4_3 || var4_3) ** GOTO lbl6
                this.testSmooth.reset();
                if (var4_3 || var4_3) ** GOTO lbl6
                this.legitSmooth.reset();
                if (var4_3) ** GOTO lbl6
lbl60:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.target = null;
                if (var4_3 || var4_3) ** GOTO lbl6
                this.lastTarget = null;
                if (var4_3 || var4_3) ** GOTO lbl6
                this.skyCoreCanCrit = hn.cjzi("cnzw", cjzm(int ), (int)650);
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
lbl68:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                this.target = var2_5;
                if (var4_3 || var4_3) ** GOTO lbl6
                var3_6 = this.getConfig();
                if (var4_3 || var4_3) ** GOTO lbl6
                var1_4.prepareDamageSphere(var3_6);
                if (var4_3 || var4_3) ** GOTO lbl6
                this.rotateToTarget(var3_6);
                if (var4_3 || var4_3) ** GOTO lbl6
                this.lastTarget = this.target;
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
lbl81:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)hn.cjzi("cnzx", cjzm(int ), (int)651);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl166
                    break;
                }
            }
lbl87:
            // 3 sources

            case 1: {
                var5_2 /* !! */  = (int)hn.cjzi("cnzy", cjzm(int ), (int)652);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl92:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)hn.cjzi("cnzz", cjzm(int ), (int)653);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 3: {
                do {
                    var5_2 /* !! */  = (int)hn.cjzi("coaa", cjzm(int ), (int)654);
                } while (!var6_1);
                throw null;
            }
lbl102:
            // 3 sources

            case 4: {
                var5_2 /* !! */  = (int)hn.cjzi("coab", cjzm(int ), (int)655);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl107:
            // 3 sources

            case 5: {
                var5_2 /* !! */  = (int)hn.cjzi("coac", cjzm(int ), (int)656);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 6: {
                var5_2 /* !! */  = (int)hn.cjzi("coad", cjzm(int ), (int)657);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl117:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)hn.cjzi("coae", cjzm(int ), (int)658);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl122:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)hn.cjzi("coaf", cjzm(int ), (int)659);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 9: {
                var5_2 /* !! */  = (int)hn.cjzi("coag", cjzm(int ), (int)660);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 10: {
                var5_2 /* !! */  = (int)hn.cjzi("coah", cjzm(int ), (int)661);
                if (var6_1) {
                    throw null;
                }
            }
lbl136:
            // 4 sources

            case 11: {
                var5_2 /* !! */  = (int)hn.cjzi("coai", cjzm(int ), (int)662);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl141:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)hn.cjzi("coaj", cjzm(int ), (int)663);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl146:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)hn.cjzi("coak", cjzm(int ), (int)664);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 14: {
                var5_2 /* !! */  = (int)hn.cjzi("coal", cjzm(int ), (int)665);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl156:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)hn.cjzi("coam", cjzm(int ), (int)666);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl161:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)hn.cjzi("coan", cjzm(int ), (int)667);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl166:
            // 4 sources

            case 17: {
                var5_2 /* !! */  = (int)hn.cjzi("coao", cjzm(int ), (int)668);
                if (!var6_1) ** GOTO lbl122
                throw null;
            }
            case 18: {
                var5_2 /* !! */  = (int)hn.cjzi("coap", cjzm(int ), (int)669);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 19: {
                var5_2 /* !! */  = (int)hn.cjzi("coaq", cjzm(int ), (int)670);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)hn.cjzi("coar", cjzm(int ), (int)671);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 21: {
                var5_2 /* !! */  = (int)hn.cjzi("coas", cjzm(int ), (int)672);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
lbl188:
            // 2 sources

            case 22: {
                var5_2 /* !! */  = (int)hn.cjzi("coat", cjzm(int ), (int)673);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
lbl193:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)hn.cjzi("coau", cjzm(int ), (int)674);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 24: {
                var5_2 /* !! */  = (int)hn.cjzi("coav", cjzm(int ), (int)675);
                if (!var6_1) ** GOTO lbl81
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)hn.cjzi("coaw", cjzm(int ), (int)676);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl207:
            // 4 sources

            case 26: {
                var5_2 /* !! */  = (int)hn.cjzi("coax", cjzm(int ), (int)677);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl212:
            // 3 sources

            case 27: {
                var5_2 /* !! */  = (int)hn.cjzi("coay", cjzm(int ), (int)678);
                if (!var6_1) ** GOTO lbl117
                throw null;
            }
            case 28: {
                var5_2 /* !! */  = (int)hn.cjzi("coaz", cjzm(int ), (int)679);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 29: {
                var5_2 /* !! */  = (int)hn.cjzi("coba", cjzm(int ), (int)680);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl226:
            // 4 sources

            case 30: {
                var5_2 /* !! */  = (int)hn.cjzi("cobb", cjzm(int ), (int)681);
                if (!var6_1) ** GOTO lbl207
                throw null;
            }
            case 31: {
                do {
                    var5_2 /* !! */  = (int)hn.cjzi("cobc", cjzm(int ), (int)682);
                } while (!var6_1);
                throw null;
            }
lbl235:
            // 2 sources

            case 32: {
                var5_2 /* !! */  = (int)hn.cjzi("cobd", cjzm(int ), (int)683);
                if (!var6_1) ** GOTO lbl212
                throw null;
            }
lbl239:
            // 3 sources

            case 33: {
                var5_2 /* !! */  = (int)hn.cjzi("cobe", cjzm(int ), (int)684);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl244:
            // 2 sources

            case 34: {
                var5_2 /* !! */  = (int)hn.cjzi("cobf", cjzm(int ), (int)685);
                if (!var6_1) ** GOTO lbl193
                throw null;
            }
lbl248:
            // 3 sources

            case 35: {
                var5_2 /* !! */  = (int)hn.cjzi("cobg", cjzm(int ), (int)686);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl253:
            // 3 sources

            case 36: {
                var5_2 /* !! */  = (int)hn.cjzi("cobh", cjzm(int ), (int)687);
                if (!var6_1) ** GOTO lbl226
                throw null;
            }
            case 37: {
                var5_2 /* !! */  = (int)hn.cjzi("cobi", cjzm(int ), (int)688);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl262:
            // 4 sources

            case 38: {
                var5_2 /* !! */  = (int)hn.cjzi("cobj", cjzm(int ), (int)689);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
lbl266:
            // 3 sources

            case 39: {
                var5_2 /* !! */  = (int)hn.cjzi("cobk", cjzm(int ), (int)690);
                if (!var6_1) ** GOTO lbl156
                throw null;
            }
lbl270:
            // 2 sources

            case 40: {
                var5_2 /* !! */  = (int)hn.cjzi("cobl", cjzm(int ), (int)691);
                if (!var6_1) ** GOTO lbl102
                throw null;
            }
lbl274:
            // 2 sources

            case 41: {
                var5_2 /* !! */  = (int)hn.cjzi("cobm", cjzm(int ), (int)692);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl279:
            // 3 sources

            case 42: {
                var5_2 /* !! */  = (int)hn.cjzi("cobn", cjzm(int ), (int)693);
                if (!var6_1) ** GOTO lbl117
                throw null;
            }
lbl283:
            // 3 sources

            case 43: {
                var5_2 /* !! */  = (int)hn.cjzi("cobo", cjzm(int ), (int)694);
                if (!var6_1) ** GOTO lbl253
                throw null;
            }
            case 44: {
                var5_2 /* !! */  = (int)hn.cjzi("cobp", cjzm(int ), (int)695);
                if (!var6_1) ** GOTO lbl226
                throw null;
            }
lbl291:
            // 2 sources

            case 45: {
                var5_2 /* !! */  = (int)hn.cjzi("cobq", cjzm(int ), (int)696);
                if (!var6_1) ** GOTO lbl262
                throw null;
            }
            case 46: {
                var5_2 /* !! */  = (int)hn.cjzi("cobr", cjzm(int ), (int)697);
                if (!var6_1) ** GOTO lbl226
                throw null;
            }
            case 47: {
                var5_2 /* !! */  = (int)hn.cjzi("cobs", cjzm(int ), (int)698);
                if (!var6_1) ** GOTO lbl266
                throw null;
            }
lbl303:
            // 2 sources

            case 48: {
                var5_2 /* !! */  = (int)hn.cjzi("cobt", cjzm(int ), (int)699);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl308:
            // 2 sources

            case 49: {
                var5_2 /* !! */  = (int)hn.cjzi("cobu", cjzm(int ), (int)700);
                if (!var6_1) ** GOTO lbl207
                throw null;
            }
lbl312:
            // 2 sources

            case 50: {
                var5_2 /* !! */  = (int)hn.cjzi("cobv", cjzm(int ), (int)701);
                if (!var6_1) ** GOTO lbl102
                throw null;
            }
            case 51: {
                var5_2 /* !! */  = (int)hn.cjzi("cobw", cjzm(int ), (int)702);
                if (!var6_1) ** GOTO lbl161
                throw null;
            }
lbl320:
            // 2 sources

            case 52: {
                var5_2 /* !! */  = (int)hn.cjzi("cobx", cjzm(int ), (int)703);
                if (!var6_1) ** GOTO lbl141
                throw null;
            }
lbl324:
            // 2 sources

            case 53: {
                var5_2 /* !! */  = (int)hn.cjzi("coby", cjzm(int ), (int)704);
                if (!var6_1) ** GOTO lbl166
                throw null;
            }
lbl328:
            // 2 sources

            case 54: {
                var5_2 /* !! */  = (int)hn.cjzi("cobz", cjzm(int ), (int)705);
                if (!var6_1) ** GOTO lbl244
                throw null;
            }
lbl332:
            // 2 sources

            case 55: {
                var5_2 /* !! */  = (int)hn.cjzi("coca", cjzm(int ), (int)706);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 56: {
                var5_2 /* !! */  = (int)hn.cjzi("cocb", cjzm(int ), (int)707);
                if (!var6_1) ** GOTO lbl291
                throw null;
            }
lbl341:
            // 4 sources

            case 57: {
                var5_2 /* !! */  = (int)hn.cjzi("cocc", cjzm(int ), (int)708);
                if (!var6_1) ** GOTO lbl324
                throw null;
            }
            case 58: {
                var5_2 /* !! */  = (int)hn.cjzi("cocd", cjzm(int ), (int)709);
                if (!var6_1) ** GOTO lbl87
                throw null;
            }
lbl349:
            // 3 sources

            case 59: {
                var5_2 /* !! */  = (int)hn.cjzi("coce", cjzm(int ), (int)710);
                if (!var6_1) ** GOTO lbl274
                throw null;
            }
            case 60: {
                var5_2 /* !! */  = (int)hn.cjzi("cocf", cjzm(int ), (int)711);
                if (!var6_1) ** GOTO lbl308
                throw null;
            }
            case 61: {
                var5_2 /* !! */  = (int)hn.cjzi("cocg", cjzm(int ), (int)712);
                if (!var6_1) ** GOTO lbl92
                throw null;
            }
            case 62: {
                var5_2 /* !! */  = (int)hn.cjzi("coch", cjzm(int ), (int)713);
                if (!var6_1) ** GOTO lbl166
                throw null;
            }
            case 63: {
                var5_2 /* !! */  = (int)hn.cjzi("coci", cjzm(int ), (int)714);
                if (!var6_1) ** GOTO lbl146
                throw null;
            }
            case 64: 
        }
        var5_2 /* !! */  = (int)hn.cjzi("cocj", cjzm(int ), (int)715);
        ** while (!var6_1)
lbl372:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqzb() {
        hn.cjzh[200] = -3906728218577150356L;
        hn.cjzh[201] = -782635091271682800L;
        hn.cjzh[202] = 5315728140323392698L;
        hn.cjzh[203] = 173770282855486802L;
        hn.cjzh[204] = -8808855744919766157L;
        hn.cjzh[205] = -3762403333859267966L;
        hn.cjzh[206] = 1096497811678018946L;
        hn.cjzh[207] = -9183712907336103144L;
        hn.cjzh[208] = 3464613284119907826L;
        hn.cjzh[209] = -5327261742314319700L;
        hn.cjzh[210] = 81178384708556484L;
        hn.cjzh[211] = -5919420726420567975L;
        hn.cjzh[212] = -3329237206056764853L;
        hn.cjzh[213] = -2170732242550097825L;
        hn.cjzh[214] = -3996433693274441707L;
        hn.cjzh[215] = -6332293598997491783L;
        hn.cjzh[216] = -3371345947367469957L;
        hn.cjzh[217] = 4291005397168352718L;
        hn.cjzh[218] = 7756357456607322555L;
        hn.cjzh[219] = -113403067942033200L;
        hn.cjzh[220] = 5337044619230536707L;
        hn.cjzh[221] = 6342737144507289702L;
        hn.cjzh[222] = 3726395459602590022L;
        hn.cjzh[223] = -8095316942719716214L;
        hn.cjzh[224] = 7676863704908355426L;
        hn.cjzh[225] = -1747751062296171883L;
        hn.cjzh[226] = -5632806544855894516L;
        hn.cjzh[227] = -5267279130634068595L;
        hn.cjzh[228] = 8393714958186158521L;
        hn.cjzh[229] = 8935307345075618548L;
        hn.cjzh[230] = -6203519780808294039L;
        hn.cjzh[231] = -7747827401443991537L;
        hn.cjzh[232] = 5176496556543533929L;
        hn.cjzh[233] = 5228486296223552594L;
        hn.cjzh[234] = 7075671200236615648L;
        hn.cjzh[235] = 3328091594376106958L;
        hn.cjzh[236] = -1111199800453871544L;
        hn.cjzh[237] = -6310395411888428588L;
        hn.cjzh[238] = 6449360992238164076L;
        hn.cjzh[239] = -1538024895999141903L;
        hn.cjzh[240] = -5660843624873206881L;
        hn.cjzh[241] = -53788351704665953L;
        hn.cjzh[242] = -6129906601406853586L;
        hn.cjzh[243] = -3289136409852302133L;
        hn.cjzh[244] = 3997624630716570262L;
        hn.cjzh[245] = -649545327249550647L;
        hn.cjzh[246] = 4070209573525754994L;
        hn.cjzh[247] = 8927480988520559828L;
        hn.cjzh[248] = -3256899968582230190L;
        hn.cjzh[249] = -896173053184085047L;
        hn.cjzh[250] = 3888422565007856372L;
        hn.cjzh[251] = -7203123342734297396L;
        hn.cjzh[252] = -2068695454952666967L;
        hn.cjzh[253] = -1477065544314348869L;
        hn.cjzh[254] = -5981304139206398132L;
        hn.cjzh[255] = -4025428832452095349L;
        hn.cjzh[256] = 4239513022240440029L;
        hn.cjzh[257] = -296843124585523444L;
        hn.cjzh[258] = 7358984029624100553L;
        hn.cjzh[259] = -127572674641864541L;
        hn.cjzh[260] = 4652375612343098244L;
        hn.cjzh[261] = -6351612249228502098L;
        hn.cjzh[262] = 2101954072833641000L;
        hn.cjzh[263] = 6802605821233521111L;
        hn.cjzh[264] = 1716894041593014200L;
        hn.cjzh[265] = 20622320918474976L;
        hn.cjzh[266] = -28271895566374894L;
        hn.cjzh[267] = -1722205586569791063L;
        hn.cjzh[268] = -4774956439192201004L;
        hn.cjzh[269] = -5772961737483370090L;
        hn.cjzh[270] = -8694495631889923669L;
        hn.cjzh[271] = 2681115590101790532L;
        hn.cjzh[272] = 1853992342901258863L;
        hn.cjzh[273] = -6790010493819567991L;
        hn.cjzh[274] = 4852609394933315454L;
        hn.cjzh[275] = 4487674335352543406L;
        hn.cjzh[276] = -1188184997432616623L;
        hn.cjzh[277] = -4549092049758471680L;
        hn.cjzh[278] = 6356187376139607233L;
        hn.cjzh[279] = -960511783923309753L;
        hn.cjzh[280] = 3915921877554090829L;
        hn.cjzh[281] = 5740272371869562155L;
        hn.cjzh[282] = -7418102481228160740L;
        hn.cjzh[283] = -2628226248286041645L;
        hn.cjzh[284] = 3820719445752993602L;
        hn.cjzh[285] = 2883416968657543886L;
        hn.cjzh[286] = -2260151851290186174L;
        hn.cjzh[287] = -8429380825033420490L;
        hn.cjzh[288] = -4503000986964826925L;
        hn.cjzh[289] = -5306784214372579609L;
        hn.cjzh[290] = 1883166401313448168L;
        hn.cjzh[291] = -8875478821495479484L;
        hn.cjzh[292] = 5686220169488473042L;
        hn.cjzh[293] = 7463684144192977451L;
        hn.cjzh[294] = -4535396891977743599L;
        hn.cjzh[295] = -1816620992471429625L;
        hn.cjzh[296] = -5920463617515473299L;
        hn.cjzh[297] = 4511805503517822734L;
        hn.cjzh[298] = -7823007261860640042L;
        hn.cjzh[299] = -4886190188426722898L;
    }

    private static /* synthetic */ void cqvm() {
        hn.cjzo[800] = -262674346;
        hn.cjzo[801] = 1787966238;
        hn.cjzo[802] = -1805627934;
        hn.cjzo[803] = -1359016038;
        hn.cjzo[804] = 1013954352;
        hn.cjzo[805] = 776059614;
        hn.cjzo[806] = -1146823189;
        hn.cjzo[807] = 1076109284;
        hn.cjzo[808] = -2061021778;
        hn.cjzo[809] = 1873198990;
        hn.cjzo[810] = 360829977;
        hn.cjzo[811] = -1022943286;
        hn.cjzo[812] = 622565722;
        hn.cjzo[813] = -1481394119;
        hn.cjzo[814] = 619502063;
        hn.cjzo[815] = -594174996;
        hn.cjzo[816] = 1023941373;
        hn.cjzo[817] = -1158595279;
        hn.cjzo[818] = 967964856;
        hn.cjzo[819] = -860177639;
        hn.cjzo[820] = 1637041763;
        hn.cjzo[821] = 2076632176;
        hn.cjzo[822] = 1597244094;
        hn.cjzo[823] = 1564836506;
        hn.cjzo[824] = 1035949569;
        hn.cjzo[825] = 1335001771;
        hn.cjzo[826] = 1113495428;
        hn.cjzo[827] = 1320603944;
        hn.cjzo[828] = -1431094435;
        hn.cjzo[829] = -413919460;
        hn.cjzo[830] = -638749314;
        hn.cjzo[831] = 1116998501;
        hn.cjzo[832] = -165662957;
        hn.cjzo[833] = -1044788894;
        hn.cjzo[834] = 1372744749;
        hn.cjzo[835] = 264054374;
        hn.cjzo[836] = 1107739401;
        hn.cjzo[837] = -531406427;
        hn.cjzo[838] = 1765792619;
        hn.cjzo[839] = 1958368881;
        hn.cjzo[840] = 1333683174;
        hn.cjzo[841] = 1271045885;
        hn.cjzo[842] = -2062855161;
        hn.cjzo[843] = -395352569;
        hn.cjzo[844] = 720305604;
        hn.cjzo[845] = 540020756;
        hn.cjzo[846] = -415158892;
        hn.cjzo[847] = -738264796;
        hn.cjzo[848] = -84690909;
        hn.cjzo[849] = 899830281;
        hn.cjzo[850] = 1895507326;
        hn.cjzo[851] = -326614844;
        hn.cjzo[852] = -1692861151;
        hn.cjzo[853] = 2035276183;
        hn.cjzo[854] = -904307875;
        hn.cjzo[855] = -988945751;
        hn.cjzo[856] = -803782681;
        hn.cjzo[857] = -2082362762;
        hn.cjzo[858] = 345915021;
        hn.cjzo[859] = 545069403;
        hn.cjzo[860] = -1756416410;
        hn.cjzo[861] = 1461690624;
        hn.cjzo[862] = -1805434626;
        hn.cjzo[863] = 1706578032;
        hn.cjzo[864] = 509835843;
        hn.cjzo[865] = -907726312;
        hn.cjzo[866] = 686121800;
        hn.cjzo[867] = -1141325555;
        hn.cjzo[868] = 1293337871;
        hn.cjzo[869] = 1762579116;
        hn.cjzo[870] = -363512901;
        hn.cjzo[871] = 616959271;
        hn.cjzo[872] = 1468853330;
        hn.cjzo[873] = -1254013921;
        hn.cjzo[874] = 1757576522;
        hn.cjzo[875] = -521534972;
        hn.cjzo[876] = 1392524232;
        hn.cjzo[877] = -972594988;
        hn.cjzo[878] = 1720543432;
        hn.cjzo[879] = 171795135;
        hn.cjzo[880] = 725304679;
        hn.cjzo[881] = 31114841;
        hn.cjzo[882] = 853921402;
        hn.cjzo[883] = 856350709;
        hn.cjzo[884] = 803255300;
        hn.cjzo[885] = -668893662;
        hn.cjzo[886] = -125861802;
        hn.cjzo[887] = -983280287;
        hn.cjzo[888] = -1132413996;
        hn.cjzo[889] = 1895395210;
        hn.cjzo[890] = -212765259;
        hn.cjzo[891] = -1584876162;
        hn.cjzo[892] = -1360804033;
        hn.cjzo[893] = 1304063511;
        hn.cjzo[894] = -1082722746;
        hn.cjzo[895] = 826968944;
        hn.cjzo[896] = 949132538;
        hn.cjzo[897] = 1150576641;
        hn.cjzo[898] = -217841594;
        hn.cjzo[899] = 188888868;
    }

    /*
     * Enabled aggressive block sorting
     */
    public hv$AttackPerpetratorConfigurable getConfig() {
        ov ov2;
        class_238 class_2383;
        block13: {
            block7: {
                class_243 class_2432;
                boolean bl2;
                block12: {
                    class_3545<class_243, class_238> class_35452;
                    block9: {
                        block11: {
                            boolean bl3;
                            block10: {
                                block8: {
                                    bl3 = c;
                                    int n2 = b;
                                    bl2 = a;
                                    if (bl3) {
                                        throw null;
                                    }
                                    if (bl2 || bl2) break block7;
                                    if (!this.aimType.isSelected("Legit")) break block8;
                                    if (bl2 || bl2) break block7;
                                    class_2432 = this.target.method_73189().method_1031(0.0, (double)this.target.method_17682() * hn.cjzi("connz", clov(int ), (int)370), 0.0);
                                    if (bl2 || bl2) break block7;
                                    class_2383 = this.target.method_5829();
                                    if (bl2 || bl2) break block7;
                                    if (bl3) {
                                        throw null;
                                    }
                                    break block9;
                                }
                                if (bl2 || bl2) break block7;
                                if (this.isRwWallBypassActive()) break block10;
                                if (bl2) break block7;
                                if (this.aimType.isSelected("Funtime")) break block10;
                                if (bl2) break block7;
                                if (this.aimType.isSelected("FuntimeTest")) break block10;
                                if (bl2) break block7;
                                if (!this.aimType.isSelected("Holyworld")) break block11;
                                if (bl2) break block7;
                            }
                            if (bl2 || bl2) break block7;
                            class_2432 = this.target.method_73189().method_1031(0.0, (double)this.target.method_17682() * hn.cjzi("cooa", clov(int ), (int)371), 0.0);
                            if (bl2 || bl2) break block7;
                            class_2383 = this.target.method_5829();
                            if (bl2 || bl2) break block7;
                            if (bl3) {
                                throw null;
                            }
                            break block9;
                        }
                        if (bl2 || bl2) break block7;
                        class_35452 = this.pointFinder.computeVector(this.target, this.attackDistance(), ot.INSTANCE.getRotation(), this.getSmoothMode().randomValue(), this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b"));
                        if (bl2 || bl2) break block7;
                        class_2432 = (class_243)class_35452.method_15442();
                        if (bl2 || bl2) break block7;
                        class_2383 = (class_238)class_35452.method_15441();
                        if (bl2) break block7;
                    }
                    if (bl2 || bl2) break block7;
                    class_35452 = hl.getInstance();
                    if (bl2 || bl2) break block7;
                    if (class_35452 == null) break block12;
                    if (bl2) break block7;
                    if (!class_35452.shouldUseFor(this.target)) break block12;
                    if (bl2 || bl2) break block7;
                    ov2 = class_35452.getAimPosition(this.target);
                    if (bl2 || bl2) break block7;
                    class_2432 = ov2.method_1031(0.0, (double)this.target.method_17682() * hn.cjzi("coob", clov(int ), (int)372), 0.0);
                    if (bl2 || bl2) break block7;
                    class_2383 = class_35452.getAimBox(this.target);
                    if (bl2) break block7;
                }
                if (bl2 || bl2) break block7;
                ov2 = ow.fromVec3d(class_2432.method_1020(Objects.requireNonNull(hn.mc.field_1724).method_33571()));
                if (!bl2 && !bl2) break block13;
            }
            return null;
        }
        return new hv$AttackPerpetratorConfigurable(this.target, ov2, this.attackDistance(), this.options.getSelected(), class_2383, (boolean)hn.cjzi("cooc", cjzm(int ), (int)918));
    }

    private static /* synthetic */ void cquy() {
        hn.cjzo[500] = -2100837225;
        hn.cjzo[501] = -37104275;
        hn.cjzo[502] = 1513706769;
        hn.cjzo[503] = -1720025086;
        hn.cjzo[504] = 921568345;
        hn.cjzo[505] = -30665850;
        hn.cjzo[506] = -1072079852;
        hn.cjzo[507] = -1863356566;
        hn.cjzo[508] = -315898537;
        hn.cjzo[509] = 977465241;
        hn.cjzo[510] = -2126991596;
        hn.cjzo[511] = -1359990149;
        hn.cjzo[512] = 2140844892;
        hn.cjzo[513] = -2019967817;
        hn.cjzo[514] = 1628270772;
        hn.cjzo[515] = 1723588870;
        hn.cjzo[516] = 1036443582;
        hn.cjzo[517] = -456476164;
        hn.cjzo[518] = -1537708704;
        hn.cjzo[519] = 1341879190;
        hn.cjzo[520] = 1578397725;
        hn.cjzo[521] = -1966156569;
        hn.cjzo[522] = -1624455959;
        hn.cjzo[523] = -138365796;
        hn.cjzo[524] = -1322439443;
        hn.cjzo[525] = 1017636671;
        hn.cjzo[526] = -1518226149;
        hn.cjzo[527] = 463033420;
        hn.cjzo[528] = -80817781;
        hn.cjzo[529] = 108709790;
        hn.cjzo[530] = -2049820181;
        hn.cjzo[531] = 291821252;
        hn.cjzo[532] = 518375825;
        hn.cjzo[533] = -853844430;
        hn.cjzo[534] = 1600515946;
        hn.cjzo[535] = 2143207874;
        hn.cjzo[536] = -479414124;
        hn.cjzo[537] = -2034140228;
        hn.cjzo[538] = -657299774;
        hn.cjzo[539] = 498409247;
        hn.cjzo[540] = -1019616940;
        hn.cjzo[541] = -657947276;
        hn.cjzo[542] = -1320316519;
        hn.cjzo[543] = -69972930;
        hn.cjzo[544] = -1443297091;
        hn.cjzo[545] = -1033322026;
        hn.cjzo[546] = 232557288;
        hn.cjzo[547] = 837671235;
        hn.cjzo[548] = 475218127;
        hn.cjzo[549] = -1659153370;
        hn.cjzo[550] = -347338234;
        hn.cjzo[551] = 1879727776;
        hn.cjzo[552] = 688141237;
        hn.cjzo[553] = -900737187;
        hn.cjzo[554] = 2133227553;
        hn.cjzo[555] = 580821520;
        hn.cjzo[556] = -247469505;
        hn.cjzo[557] = -605291758;
        hn.cjzo[558] = -608850688;
        hn.cjzo[559] = 34360365;
        hn.cjzo[560] = 2098760192;
        hn.cjzo[561] = -1478026042;
        hn.cjzo[562] = 1927735577;
        hn.cjzo[563] = -1204725876;
        hn.cjzo[564] = 440114866;
        hn.cjzo[565] = -1838410335;
        hn.cjzo[566] = -1116273345;
        hn.cjzo[567] = -388937213;
        hn.cjzo[568] = 660954936;
        hn.cjzo[569] = -1661691837;
        hn.cjzo[570] = -912665916;
        hn.cjzo[571] = 2138360215;
        hn.cjzo[572] = -683177127;
        hn.cjzo[573] = -335445564;
        hn.cjzo[574] = -1621338751;
        hn.cjzo[575] = 370035063;
        hn.cjzo[576] = 735889816;
        hn.cjzo[577] = 2146749157;
        hn.cjzo[578] = 1072392292;
        hn.cjzo[579] = -622723469;
        hn.cjzo[580] = 1656386438;
        hn.cjzo[581] = 40877170;
        hn.cjzo[582] = -217009256;
        hn.cjzo[583] = 1131022177;
        hn.cjzo[584] = -1548938106;
        hn.cjzo[585] = 1842779321;
        hn.cjzo[586] = -595525538;
        hn.cjzo[587] = -2073240591;
        hn.cjzo[588] = 82624789;
        hn.cjzo[589] = -61713456;
        hn.cjzo[590] = 1010573943;
        hn.cjzo[591] = -1141514376;
        hn.cjzo[592] = -1222186842;
        hn.cjzo[593] = -497068461;
        hn.cjzo[594] = -1654044157;
        hn.cjzo[595] = -885537763;
        hn.cjzo[596] = -1136268956;
        hn.cjzo[597] = 890013851;
        hn.cjzo[598] = -837829307;
        hn.cjzo[599] = 840142483;
    }

    private static /* synthetic */ void cqwf() {
        hn.cjzo[1400] = -1526033212;
        hn.cjzo[1401] = 1644953128;
        hn.cjzo[1402] = -820032291;
        hn.cjzo[1403] = 409978491;
        hn.cjzo[1404] = 345180995;
        hn.cjzo[1405] = -1250365728;
        hn.cjzo[1406] = -1916026178;
        hn.cjzo[1407] = -1711404088;
        hn.cjzo[1408] = 1821204388;
        hn.cjzo[1409] = -1579150635;
        hn.cjzo[1410] = 954823147;
        hn.cjzo[1411] = -352170264;
        hn.cjzo[1412] = -979847503;
        hn.cjzo[1413] = 809040870;
        hn.cjzo[1414] = 1468266645;
        hn.cjzo[1415] = 842154684;
        hn.cjzo[1416] = 1718017059;
        hn.cjzo[1417] = -280464294;
        hn.cjzo[1418] = 688473380;
        hn.cjzo[1419] = 1872671666;
        hn.cjzo[1420] = -496301556;
        hn.cjzo[1421] = -1809473619;
        hn.cjzo[1422] = 722019783;
        hn.cjzo[1423] = -445358676;
        hn.cjzo[1424] = 676519296;
        hn.cjzo[1425] = 1819060285;
        hn.cjzo[1426] = 776281036;
        hn.cjzo[1427] = -1099712122;
        hn.cjzo[1428] = -1429938823;
        hn.cjzo[1429] = -1975480234;
        hn.cjzo[1430] = -1632400206;
        hn.cjzo[1431] = 2097544623;
        hn.cjzo[1432] = -2005308524;
        hn.cjzo[1433] = -169507548;
        hn.cjzo[1434] = 1943664887;
        hn.cjzo[1435] = -2046761318;
        hn.cjzo[1436] = -346038198;
        hn.cjzo[1437] = 120532858;
        hn.cjzo[1438] = -1784187962;
        hn.cjzo[1439] = 2117809689;
        hn.cjzo[1440] = -380275217;
        hn.cjzo[1441] = -536557735;
        hn.cjzo[1442] = 162919635;
        hn.cjzo[1443] = -923402854;
        hn.cjzo[1444] = 767012236;
        hn.cjzo[1445] = -516525122;
        hn.cjzo[1446] = -57286977;
        hn.cjzo[1447] = 1031925237;
        hn.cjzo[1448] = 787177563;
        hn.cjzo[1449] = 969379503;
        hn.cjzo[1450] = -322191352;
        hn.cjzo[1451] = -580604540;
        hn.cjzo[1452] = -930435292;
        hn.cjzo[1453] = -210064308;
        hn.cjzo[1454] = -80132500;
        hn.cjzo[1455] = -1092509229;
        hn.cjzo[1456] = -1355154063;
        hn.cjzo[1457] = 1631354111;
        hn.cjzo[1458] = -1241290766;
        hn.cjzo[1459] = -1053227337;
        hn.cjzo[1460] = -865249884;
        hn.cjzo[1461] = 628851463;
        hn.cjzo[1462] = -529522204;
        hn.cjzo[1463] = 645867154;
        hn.cjzo[1464] = -1748107864;
        hn.cjzo[1465] = -77314094;
        hn.cjzo[1466] = -1789432347;
        hn.cjzo[1467] = -1607955569;
        hn.cjzo[1468] = -1398835915;
        hn.cjzo[1469] = -601286969;
        hn.cjzo[1470] = 1900801620;
        hn.cjzo[1471] = 1457593569;
        hn.cjzo[1472] = 779276575;
        hn.cjzo[1473] = 1903969425;
        hn.cjzo[1474] = 1285141339;
        hn.cjzo[1475] = 1683805931;
        hn.cjzo[1476] = 1847316417;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPlayerTickTail(cv var1_1) {
        block79: {
            block78: {
                block77: {
                    block76: {
                        block75: {
                            var8_2 = hn.c;
                            var7_3 /* !! */  = hn.b;
                            var6_4 = hn.a;
                            if (var8_2) {
                                throw null;
lbl6:
                                // 22 sources

                                return;
                            }
                            if (var6_4 || var6_4) ** GOTO lbl6
                            var2_5 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
                            if (var6_4 || var6_4) ** GOTO lbl6
                            if (this.target == null) break block75;
                            if (var6_4) ** GOTO lbl6
                            if (!var2_5.finishPendingLegitSprintAttack(this.getConfig())) break block75;
                            if (var6_4 || var6_4) ** GOTO lbl6
                            return;
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var3_6 = hk.getInstance();
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (this.target == null) break block76;
                        if (var6_4) ** GOTO lbl6
                        if (var3_6 == null) break block76;
                        if (var6_4) ** GOTO lbl6
                        if (var3_6.isActiveForCurrentState()) break block77;
                        if (var6_4) ** GOTO lbl6
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                var4_7 = var3_6.isWebModeActive();
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!var3_6.isSlowFallingModeActive()) break block78;
                if (var6_4) ** GOTO lbl6
                if (!(hn.mc.field_1724.field_6017 > 0.0)) break block78;
                if (var6_4) ** GOTO lbl6
                if (!(hn.mc.field_1724.field_6017 < 1.0)) break block78;
                if (var6_4) ** GOTO lbl6
                v0 = hn.cjzi("coea", cjzm(int ), (int)734);
                if (var8_2) {
                    throw null;
                }
                break block79;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            v0 = var5_8 = hn.cjzi("coeb", cjzm(int ), (int)735);
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (var4_7) ** GOTO lbl55
        if (var6_4) ** GOTO lbl6
        if (var5_8 == false) ** GOTO lbl58
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
lbl55:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                d.getInstance().getManager().getAttackPerpetrator().performAttack(this.getConfig());
                if (var6_4) ** GOTO lbl6
lbl58:
                // 2 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
lbl61:
            // 3 sources

            case 0: {
                var7_3 /* !! */  = (int)hn.cjzi("coec", cjzm(int ), (int)736);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl66:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)hn.cjzi("coed", cjzm(int ), (int)737);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 2: {
                var7_3 /* !! */  = (int)hn.cjzi("coee", cjzm(int ), (int)738);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl76:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)hn.cjzi("coef", cjzm(int ), (int)739);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl81:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)hn.cjzi("coeg", cjzm(int ), (int)740);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl86:
            // 3 sources

            case 5: {
                var7_3 /* !! */  = (int)hn.cjzi("coeh", cjzm(int ), (int)741);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 6: {
                var7_3 /* !! */  = (int)hn.cjzi("coei", cjzm(int ), (int)742);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl96:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)hn.cjzi("coej", cjzm(int ), (int)743);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 8: {
                var7_3 /* !! */  = (int)hn.cjzi("coek", cjzm(int ), (int)744);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl106:
            // 4 sources

            case 9: {
                var7_3 /* !! */  = (int)hn.cjzi("coel", cjzm(int ), (int)745);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl111:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)hn.cjzi("coem", cjzm(int ), (int)746);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 11: {
                var7_3 /* !! */  = (int)hn.cjzi("coen", cjzm(int ), (int)747);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)hn.cjzi("coeo", cjzm(int ), (int)748);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 13: {
                var7_3 /* !! */  = (int)hn.cjzi("coep", cjzm(int ), (int)749);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl129:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)hn.cjzi("coeq", cjzm(int ), (int)750);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl133:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)hn.cjzi("coer", cjzm(int ), (int)751);
                if (!var8_2) ** GOTO lbl61
                throw null;
            }
lbl137:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)hn.cjzi("coes", cjzm(int ), (int)752);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl142:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)hn.cjzi("coet", cjzm(int ), (int)753);
                if (!var8_2) ** GOTO lbl66
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)hn.cjzi("coeu", cjzm(int ), (int)754);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl151:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)hn.cjzi("coev", cjzm(int ), (int)755);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl156:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)hn.cjzi("coew", cjzm(int ), (int)756);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl161:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)hn.cjzi("coex", cjzm(int ), (int)757);
                if (!var8_2) ** GOTO lbl133
                throw null;
            }
            case 22: {
                var7_3 /* !! */  = (int)hn.cjzi("coey", cjzm(int ), (int)758);
                if (!var8_2) ** GOTO lbl129
                throw null;
            }
lbl169:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)hn.cjzi("coez", cjzm(int ), (int)759);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl174:
            // 3 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var7_3 /* !! */  = (int)hn.cjzi("cofa", cjzm(int ), (int)760);
                    if (!var8_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 25: {
                var7_3 /* !! */  = (int)hn.cjzi("cofb", cjzm(int ), (int)761);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl183:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)hn.cjzi("cofc", cjzm(int ), (int)762);
                if (!var8_2) ** GOTO lbl76
                throw null;
            }
lbl187:
            // 2 sources

            case 27: {
                var7_3 /* !! */  = (int)hn.cjzi("cofd", cjzm(int ), (int)763);
                if (var8_2) {
                    throw null;
                }
            }
lbl191:
            // 5 sources

            case 28: {
                var7_3 /* !! */  = (int)hn.cjzi("cofe", cjzm(int ), (int)764);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl196:
            // 3 sources

            case 29: {
                var7_3 /* !! */  = (int)hn.cjzi("coff", cjzm(int ), (int)765);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 30: {
                var7_3 /* !! */  = (int)hn.cjzi("cofg", cjzm(int ), (int)766);
                if (!var8_2) ** GOTO lbl61
                throw null;
            }
            case 31: {
                var7_3 /* !! */  = (int)hn.cjzi("cofh", cjzm(int ), (int)767);
                if (!var8_2) ** GOTO lbl81
                throw null;
            }
lbl209:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)hn.cjzi("cofi", cjzm(int ), (int)768);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
            case 33: {
                var7_3 /* !! */  = (int)hn.cjzi("cofj", cjzm(int ), (int)769);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl217:
            // 3 sources

            case 34: {
                var7_3 /* !! */  = (int)hn.cjzi("cofk", cjzm(int ), (int)770);
                if (!var8_2) ** GOTO lbl111
                throw null;
            }
lbl221:
            // 2 sources

            case 35: {
                var7_3 /* !! */  = (int)hn.cjzi("cofl", cjzm(int ), (int)771);
                if (!var8_2) ** GOTO lbl129
                throw null;
            }
            case 36: {
                var7_3 /* !! */  = (int)hn.cjzi("cofm", cjzm(int ), (int)772);
                if (!var8_2) ** GOTO lbl183
                throw null;
            }
            case 37: 
        }
        var7_3 /* !! */  = (int)hn.cjzi("cofn", cjzm(int ), (int)773);
        ** while (!var8_2)
lbl232:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$3() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqlq", cjzf(int ), (int)783)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hn.cjzi("cqlr", cjzm(int ), (int)1439)) break;
            v0 /* !! */  = (long)hn.cjzi("cqls", cjzm(int ), (int)1440);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqlu", cjzf(int ), (int)784)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hn.cjzi("cqlw", cjzm(int ), (int)1441)) break;
            v1 /* !! */  = (long)hn.cjzi("cqlx", cjzm(int ), (int)1442);
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl20
                block19: while (true) {
                    v2 /* !! */  = (long)(v3 - hn.cjzi("cqlz", cjzf(int ), (int)785));
lbl20:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2053415392: {
                            v3 = hn.cjzi("cqma", cjzf(int ), (int)786);
                            continue block19;
                        }
                        case -841682887: {
                            break block19;
                        }
                        case 471887107: {
                            v3 = hn.cjzi("cqmc", cjzf(int ), (int)787);
                            continue block19;
                        }
                        case 1366704794: {
                            v3 = hn.cjzi("cqmd", cjzf(int ), (int)788);
                            continue block19;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cqmg", cjzf(int ), (int)789));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1788381663: {
                            v5 = hn.cjzi("cqmh", cjzf(int ), (int)790);
                            continue block21;
                        }
                        case -1013240230: {
                            v5 = hn.cjzi("cqmj", cjzf(int ), (int)791);
                            continue block21;
                        }
                        case -841682887: {
                            break block21;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqml", cjzf(int ), (int)792)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hn.cjzi("cqmm", cjzm(int ), (int)1443)) break;
                    v6 /* !! */  = (long)hn.cjzi("cqmo", cjzm(int ), (int)1444);
                }
                v7 = this.clickType.isSelected("1.8");
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cqmq", cjzf(int ), (int)793)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("cqms", cjzm(int ), (int)1445)) break;
                    v8 /* !! */  = (long)hn.cjzi("cqmt", cjzm(int ), (int)1446);
                }
                return v7;
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cqmv", cjzm(int ), (int)1447);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cqmx", cjzm(int ), (int)1448);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqmy", cjzm(int ), (int)1449);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqna", cjzm(int ), (int)1450);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ic getFuntime222Smooth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cozh", cjzf(int ), (int)453)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cozi", cjzm(int ), (int)1129)) break;
            v0 /* !! */  = (long)hn.cjzi("cozj", cjzm(int ), (int)1130);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cozk", cjzf(int ), (int)454)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cozl", cjzm(int ), (int)1131)) break;
            v1 /* !! */  = (long)hn.cjzi("cozm", cjzm(int ), (int)1132);
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl22
                block17: while (true) {
                    v2 /* !! */  = (long)(hn.cjzi("cozo", cjzf(int ), (int)456) - hn.cjzi("cozn", cjzf(int ), (int)455));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -841682887: {
                            break block17;
                        }
                        case 499273744: {
                            continue block17;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = hn.fz;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - hn.cjzi("cozp", cjzf(int ), (int)457));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1953387765: {
                            v4 = hn.cjzi("cozq", cjzf(int ), (int)458);
                            continue block19;
                        }
                        case -945864911: {
                            v4 = hn.cjzi("cozr", cjzf(int ), (int)459);
                            continue block19;
                        }
                        case -841682887: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.funtime222Smooth;
            }
lbl47:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cozs", cjzm(int ), (int)1133);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cozt", cjzm(int ), (int)1134);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cozu", cjzm(int ), (int)1135);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cozv", cjzm(int ), (int)1136);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cqot", cjzf(int ), (int)813));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block29;
                }
                case -6454901: {
                    v1 = hn.cjzi("cqov", cjzf(int ), (int)814);
                    continue block29;
                }
                case 823349154: {
                    v1 = hn.cjzi("cqow", cjzf(int ), (int)815);
                    continue block29;
                }
                case 1073186000: {
                    v1 = hn.cjzi("cqoy", cjzf(int ), (int)816);
                    continue block29;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cqoz", cjzf(int ), (int)817));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block30;
                }
                case 723128925: {
                    v3 = hn.cjzi("cqpb", cjzf(int ), (int)818);
                    continue block30;
                }
                case 1321479358: {
                    v3 = hn.cjzi("cqpc", cjzf(int ), (int)819);
                    continue block30;
                }
                case 1420879894: {
                    v3 = hn.cjzi("cqpd", cjzf(int ), (int)820);
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v4 /* !! */  = hn.fz;
        if (true) ** GOTO lbl39
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - hn.cjzi("cqpf", cjzf(int ), (int)821));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1681300294: {
                    v5 = hn.cjzi("cqpg", cjzf(int ), (int)822);
                    continue block31;
                }
                case -841682887: {
                    break block31;
                }
                case -819897376: {
                    v5 = hn.cjzi("cqpi", cjzf(int ), (int)823);
                    continue block31;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl51:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl62
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("cqpj", cjzf(int ), (int)824));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -841682887: {
                            break block33;
                        }
                        case -751432833: {
                            v7 = hn.cjzi("cqpk", cjzf(int ), (int)825);
                            continue block33;
                        }
                        case 867437210: {
                            v7 = hn.cjzi("cqpl", cjzf(int ), (int)826);
                            continue block33;
                        }
                        case 2003415697: {
                            v7 = hn.cjzi("cqpm", cjzf(int ), (int)827);
                            continue block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqpn", cjzf(int ), (int)828)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("cqpo", cjzm(int ), (int)1457)) break;
                    v8 /* !! */  = (long)hn.cjzi("cqpp", cjzm(int ), (int)1458);
                }
                v9 = this.aimType.isSelected("Legit");
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqpq", cjzf(int ), (int)829)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hn.cjzi("cqpr", cjzm(int ), (int)1459)) break;
                    v10 /* !! */  = (long)hn.cjzi("cqps", cjzm(int ), (int)1460);
                }
                return v9;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqpt", cjzm(int ), (int)1461);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cqpw", cjzm(int ), (int)1462);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cqpz", cjzm(int ), (int)1463);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cqqb", cjzm(int ), (int)1464);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ib getFunTimeRotation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("coyq", cjzf(int ), (int)446)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("coyr", cjzm(int ), (int)1119)) break;
            v0 /* !! */  = (long)hn.cjzi("coys", cjzm(int ), (int)1120);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("coyt", cjzf(int ), (int)447));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -934124650: {
                    v2 = hn.cjzi("coyu", cjzf(int ), (int)448);
                    continue block13;
                }
                case -841682887: {
                    break block13;
                }
                case 401518410: {
                    v2 = hn.cjzi("coyv", cjzf(int ), (int)449);
                    continue block13;
                }
                case 545107964: {
                    v2 = hn.cjzi("coyw", cjzf(int ), (int)450);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("coyx", cjzf(int ), (int)451)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hn.cjzi("coyy", cjzm(int ), (int)1121)) break;
            v3 /* !! */  = (long)hn.cjzi("coyz", cjzm(int ), (int)1122);
        }
        var1_3 = hn.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("coza", cjzf(int ), (int)452)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cozb", cjzm(int ), (int)1123)) break;
                    v4 /* !! */  = (long)hn.cjzi("cozc", cjzm(int ), (int)1124);
                }
                return this.funTimeRotation;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hn.cjzi("cozd", cjzm(int ), (int)1125);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl52:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("coze", cjzm(int ), (int)1126);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cozf", cjzm(int ), (int)1127);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cozg", cjzm(int ), (int)1128);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqxr() {
        hn.cjzg[500] = -9169693121226608076L;
        hn.cjzg[501] = 1939303418795056316L;
        hn.cjzg[502] = 3395769417796953244L;
        hn.cjzg[503] = 7995712483246203409L;
        hn.cjzg[504] = 7475560114234690348L;
        hn.cjzg[505] = 2546266422773106053L;
        hn.cjzg[506] = -830150980537405754L;
        hn.cjzg[507] = -129548376180659644L;
        hn.cjzg[508] = -6605857077674145514L;
        hn.cjzg[509] = -7125262809270810996L;
        hn.cjzg[510] = -299298902881377216L;
        hn.cjzg[511] = -5765666360215025582L;
        hn.cjzg[512] = 3502738752401517476L;
        hn.cjzg[513] = -7966020232263959173L;
        hn.cjzg[514] = -2221190117940409674L;
        hn.cjzg[515] = -4421473144778165617L;
        hn.cjzg[516] = 6035980839687003914L;
        hn.cjzg[517] = -1548729580328176526L;
        hn.cjzg[518] = -9039133755403203541L;
        hn.cjzg[519] = 1774421490404012388L;
        hn.cjzg[520] = -7542183830703019390L;
        hn.cjzg[521] = -1586675332504394955L;
        hn.cjzg[522] = 7075536686241108671L;
        hn.cjzg[523] = -2807722130753014510L;
        hn.cjzg[524] = 663125292439139701L;
        hn.cjzg[525] = 1816256293067296815L;
        hn.cjzg[526] = -5986144896910375453L;
        hn.cjzg[527] = -1312311013367945243L;
        hn.cjzg[528] = 5068543356627264530L;
        hn.cjzg[529] = -368459299845161243L;
        hn.cjzg[530] = 6789230060494264553L;
        hn.cjzg[531] = 3103279752499699221L;
        hn.cjzg[532] = 4979860639982107545L;
        hn.cjzg[533] = -7285822826376497698L;
        hn.cjzg[534] = -6935670437882580617L;
        hn.cjzg[535] = -7017210027981594635L;
        hn.cjzg[536] = 276074499308246652L;
        hn.cjzg[537] = -8060743505824739311L;
        hn.cjzg[538] = 8844169177261392717L;
        hn.cjzg[539] = 2764201273512731001L;
        hn.cjzg[540] = -4529480430304204137L;
        hn.cjzg[541] = 5090131723275687373L;
        hn.cjzg[542] = 6156230184533988821L;
        hn.cjzg[543] = -4309820165497052725L;
        hn.cjzg[544] = -7012801366423725941L;
        hn.cjzg[545] = 7949066066361997273L;
        hn.cjzg[546] = 7346717328830058867L;
        hn.cjzg[547] = -9062622490714571734L;
        hn.cjzg[548] = 2138918588801585151L;
        hn.cjzg[549] = -8731793583962340372L;
        hn.cjzg[550] = -7158713850856436313L;
        hn.cjzg[551] = 5291199477569246274L;
        hn.cjzg[552] = 717143284711790208L;
        hn.cjzg[553] = 198479107001049452L;
        hn.cjzg[554] = -2422013708985447890L;
        hn.cjzg[555] = -4750961260851185394L;
        hn.cjzg[556] = -5367023341791032803L;
        hn.cjzg[557] = 6464710511523956303L;
        hn.cjzg[558] = 6096349180049256598L;
        hn.cjzg[559] = 2231421526354324394L;
        hn.cjzg[560] = -3980721800740291725L;
        hn.cjzg[561] = -8339853025159376032L;
        hn.cjzg[562] = -4756806112836536818L;
        hn.cjzg[563] = -6862224111265223923L;
        hn.cjzg[564] = -4205516234109750532L;
        hn.cjzg[565] = -328733499883648306L;
        hn.cjzg[566] = 209020540933053540L;
        hn.cjzg[567] = -4699465647625611265L;
        hn.cjzg[568] = 7616904832944134760L;
        hn.cjzg[569] = 4480911800306122154L;
        hn.cjzg[570] = 8861083304284009238L;
        hn.cjzg[571] = -4321346875444495983L;
        hn.cjzg[572] = 5233806384133083265L;
        hn.cjzg[573] = -31945841342414277L;
        hn.cjzg[574] = 6894604046738205492L;
        hn.cjzg[575] = -2923001052579664496L;
        hn.cjzg[576] = 2138667254178449314L;
        hn.cjzg[577] = -6687706433150384646L;
        hn.cjzg[578] = 4600267492765197065L;
        hn.cjzg[579] = 332010936722591921L;
        hn.cjzg[580] = 9082920299711707662L;
        hn.cjzg[581] = -6812001478542161928L;
        hn.cjzg[582] = -1133547175821457448L;
        hn.cjzg[583] = -4883079060849854355L;
        hn.cjzg[584] = 8221004816811236532L;
        hn.cjzg[585] = -8838826375853646296L;
        hn.cjzg[586] = -6587466548549427698L;
        hn.cjzg[587] = -8863844692535576942L;
        hn.cjzg[588] = 4517126235640976385L;
        hn.cjzg[589] = -1427762241674183388L;
        hn.cjzg[590] = 5409286737009565628L;
        hn.cjzg[591] = -2270124067602447810L;
        hn.cjzg[592] = 4752517507652612765L;
        hn.cjzg[593] = -419528880685407629L;
        hn.cjzg[594] = 1051736840225090229L;
        hn.cjzg[595] = 879262146769695654L;
        hn.cjzg[596] = 8510070538806037130L;
        hn.cjzg[597] = -6488859065046882683L;
        hn.cjzg[598] = -7668891577331480632L;
        hn.cjzg[599] = 6645883624591147415L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Boolean lambda$new$10() {
        Object object = fz;
        block14: while (true) {
            switch ((int)object) {
                case -1393484778: {
                    object = hn.cjzi("cqdf", cjzf(int ), (int)705) - hn.cjzi("cqde", cjzf(int ), (int)704);
                    continue block14;
                }
                case -841682887: {
                    break block14;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = fz - hn.cjzi("cqdh", cjzf(int ), (int)706)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hn.cjzi("cqdi", cjzm(int ), (int)1377)) break;
            object2 = hn.cjzi("cqdj", cjzm(int ), (int)1378);
        }
        int n2 = b;
        Object object3 = fz;
        block16: while (true) {
            switch ((int)object3) {
                case -841682887: {
                    break block16;
                }
                case -341094090: {
                    object3 = hn.cjzi("cqdm", cjzf(int ), (int)708) - hn.cjzi("cqdk", cjzf(int ), (int)707);
                    continue block16;
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
        CallSite callSite = hn.cjzi("cqdo", cjzm(int ), (int)1379);
        Object object4 = fz;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite2 - hn.cjzi("cqdq", cjzf(int ), (int)709);
            }
            switch ((int)object4) {
                case -1363652689: {
                    callSite2 = hn.cjzi("cqdr", cjzf(int ), (int)710);
                    continue block17;
                }
                case -841682887: {
                    return (boolean)callSite;
                }
                case 1290619057: {
                    callSite2 = hn.cjzi("cqds", cjzf(int ), (int)711);
                    continue block17;
                }
                case 1949364862: {
                    callSite2 = hn.cjzi("cqdu", cjzf(int ), (int)712);
                    continue block17;
                }
            }
            break;
        }
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$2() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cqnf", cjzf(int ), (int)794));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1387631984: {
                    v1 = hn.cjzi("cqng", cjzf(int ), (int)795);
                    continue block34;
                }
                case -841682887: {
                    break block34;
                }
                case -221238785: {
                    v1 = hn.cjzi("cqni", cjzf(int ), (int)796);
                    continue block34;
                }
                case 2028410857: {
                    v1 = hn.cjzi("cqnj", cjzf(int ), (int)797);
                    continue block34;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cqnl", cjzf(int ), (int)798));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block35;
                }
                case -108180829: {
                    v3 = hn.cjzi("cqnm", cjzf(int ), (int)799);
                    continue block35;
                }
                case 551637016: {
                    v3 = hn.cjzi("cqno", cjzf(int ), (int)800);
                    continue block35;
                }
                case 1263653651: {
                    v3 = hn.cjzi("cqnp", cjzf(int ), (int)801);
                    continue block35;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl42
                block36: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cqnr", cjzf(int ), (int)802));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1698446138: {
                            v5 = hn.cjzi("cqns", cjzf(int ), (int)803);
                            continue block36;
                        }
                        case -940478900: {
                            v5 = hn.cjzi("cqnt", cjzf(int ), (int)804);
                            continue block36;
                        }
                        case -841682887: {
                            break block36;
                        }
                        case -438011903: {
                            v5 = hn.cjzi("cqnv", cjzf(int ), (int)805);
                            continue block36;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl64
                block38: while (true) {
                    v6 /* !! */  = (long)(v7 - hn.cjzi("cqnx", cjzf(int ), (int)806));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -978070852: {
                            v7 = hn.cjzi("cqnz", cjzf(int ), (int)807);
                            continue block38;
                        }
                        case -872882925: {
                            v7 = hn.cjzi("cqoa", cjzf(int ), (int)808);
                            continue block38;
                        }
                        case -841682887: {
                            break block38;
                        }
                        case -792281205: {
                            v7 = hn.cjzi("cqoc", cjzf(int ), (int)809);
                            continue block38;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqoe", cjzf(int ), (int)810)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hn.cjzi("cqof", cjzm(int ), (int)1451)) break;
                    v8 /* !! */  = (long)hn.cjzi("cqog", cjzm(int ), (int)1452);
                }
                v9 = this.aimType.isSelected("Legit");
                v10 /* !! */  = hn.fz;
                if (true) ** GOTO lbl86
                block40: while (true) {
                    v10 /* !! */  = (long)(hn.cjzi("cqoi", cjzf(int ), (int)812) - hn.cjzi("cqoh", cjzf(int ), (int)811));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -841682887: {
                            break block40;
                        }
                        case -680662230: {
                            continue block40;
                        }
                    }
                    break;
                }
                return v9;
            }
lbl92:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cqoj", cjzm(int ), (int)1453);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cqol", cjzm(int ), (int)1454);
                    if (!var3_1) ** GOTO lbl92
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cqom", cjzm(int ), (int)1455);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqoo", cjzm(int ), (int)1456);
        ** while (!var3_1)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findArtifactScreenSlot(String var1_1) {
        block111: {
            block110: {
                var7_2 = hn.c;
                var6_3 /* !! */  = hn.b;
                var5_4 = hn.a;
                if (var7_2) {
                    throw null;
lbl6:
                    // 29 sources

                    return (int)hn.cjzi("ckoq", cjzm(int ), (int)171);
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                var2_5 = hn.cjzi("ckor", cjzm(int ), (int)172) + hn.mc.field_1724.method_31548().method_67532();
                if (var5_4 || var5_4) ** GOTO lbl6
                var3_6 = hn.cjzi("ckos", cjzm(int ), (int)173);
                if (var5_4) ** GOTO lbl6
                do {
                    block112: {
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var3_6 >= hn.cjzi("ckot", cjzm(int ), (int)174)) break block110;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (!this.matchesArtifact(hn.mc.field_1724.method_31548().method_5438((int)var3_6), var1_1)) break block112;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        return (int)var3_6;
                    }
                    if (var5_4 || var5_4) ** GOTO lbl6
                    ++var3_6;
                    if (var5_4) ** GOTO lbl6
                } while (!var7_2);
                throw null;
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            var3_6 = hn.cjzi("ckou", cjzm(int ), (int)175);
            if (var5_4) ** GOTO lbl6
            do {
                block114: {
                    block113: {
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var3_6 >= hn.cjzi("ckov", cjzm(int ), (int)176)) break block111;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        var4_7 = var3_6 + hn.cjzi("ckow", cjzm(int ), (int)177);
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var4_7 != var2_5) break block113;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var7_2) {
                            throw null;
                        }
                        break block114;
                    }
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!this.matchesArtifact(hn.mc.field_1724.method_31548().method_5438((int)var3_6), var1_1)) break block114;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    return (int)var4_7;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                ++var3_6;
                if (var5_4) ** GOTO lbl6
            } while (!var7_2);
            throw null;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (!this.matchesArtifact(hn.mc.field_1724.method_6047(), var1_1)) ** GOTO lbl61
        if (var5_4) ** GOTO lbl6
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl6
                return (int)var2_5;
            }
lbl61:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            var3_6 = hn.cjzi("ckox", cjzm(int ), (int)178);
            if (var5_4) ** GOTO lbl6
            do {
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var3_6 >= hn.cjzi("ckoy", cjzm(int ), (int)179)) ** GOTO lbl76
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!this.matchesArtifact(hn.mc.field_1724.method_31548().method_5438((int)var3_6), var1_1)) ** GOTO lbl71
                if (var5_4 || var5_4) ** GOTO lbl6
                return (int)(var3_6 + hn.cjzi("ckoz", cjzm(int ), (int)180));
lbl71:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                ++var3_6;
                if (var5_4) ** GOTO lbl6
            } while (!var7_2);
            throw null;
lbl76:
            // 1 sources

            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return (int)hn.cjzi("ckpa", cjzm(int ), (int)181);
lbl79:
            // 5 sources

            case 0: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpb", cjzm(int ), (int)182);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl84:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpc", cjzm(int ), (int)183);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 2: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpd", cjzm(int ), (int)184);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl94:
            // 3 sources

            case 3: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpe", cjzm(int ), (int)185);
                if (!var7_2) ** GOTO lbl84
                throw null;
            }
            case 4: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpf", cjzm(int ), (int)186);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 5: {
                do {
                    var6_3 /* !! */  = (int)hn.cjzi("ckpg", cjzm(int ), (int)187);
                } while (!var7_2);
                throw null;
            }
lbl108:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)hn.cjzi("ckph", cjzm(int ), (int)188);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl113:
            // 3 sources

            case 7: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpi", cjzm(int ), (int)189);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 8: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpj", cjzm(int ), (int)190);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 9: {
                do {
                    var6_3 /* !! */  = (int)hn.cjzi("ckpk", cjzm(int ), (int)191);
                } while (!var7_2);
                throw null;
            }
lbl128:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpl", cjzm(int ), (int)192);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl133:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpm", cjzm(int ), (int)193);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl138:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpn", cjzm(int ), (int)194);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl143:
            // 4 sources

            case 13: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpo", cjzm(int ), (int)195);
                if (!var7_2) ** GOTO lbl94
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpp", cjzm(int ), (int)196);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl152:
            // 3 sources

            case 15: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpq", cjzm(int ), (int)197);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 16: {
                do {
                    var6_3 /* !! */  = (int)hn.cjzi("ckpr", cjzm(int ), (int)198);
                } while (!var7_2);
                throw null;
            }
lbl162:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)hn.cjzi("ckps", cjzm(int ), (int)199);
                if (!var7_2) ** GOTO lbl79
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpt", cjzm(int ), (int)200);
                if (!var7_2) ** GOTO lbl133
                throw null;
            }
lbl170:
            // 3 sources

            case 19: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpu", cjzm(int ), (int)201);
                if (!var7_2) ** GOTO lbl79
                throw null;
            }
lbl174:
            // 3 sources

            case 20: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpv", cjzm(int ), (int)202);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl179:
            // 4 sources

            case 21: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpw", cjzm(int ), (int)203);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 22: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpx", cjzm(int ), (int)204);
                if (!var7_2) ** GOTO lbl113
                throw null;
            }
lbl188:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpy", cjzm(int ), (int)205);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl193:
            // 2 sources

            case 24: {
                var6_3 /* !! */  = (int)hn.cjzi("ckpz", cjzm(int ), (int)206);
                if (var7_2) {
                    throw null;
                }
            }
            case 25: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqa", cjzm(int ), (int)207);
                if (!var7_2) ** GOTO lbl193
                throw null;
            }
            case 26: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqb", cjzm(int ), (int)208);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl206:
            // 2 sources

            case 27: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqc", cjzm(int ), (int)209);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 28: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqd", cjzm(int ), (int)210);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 29: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqe", cjzm(int ), (int)211);
                if (!var7_2) ** GOTO lbl179
                throw null;
            }
            case 30: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqf", cjzm(int ), (int)212);
                if (!var7_2) ** GOTO lbl79
                throw null;
            }
lbl224:
            // 2 sources

            case 31: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqg", cjzm(int ), (int)213);
                if (!var7_2) ** GOTO lbl128
                throw null;
            }
lbl228:
            // 2 sources

            case 32: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqh", cjzm(int ), (int)214);
                if (!var7_2) ** GOTO lbl113
                throw null;
            }
lbl232:
            // 2 sources

            case 33: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)hn.cjzi("ckqi", cjzm(int ), (int)215);
                    if (!var7_2) ** GOTO lbl152
                    throw null;
                }
            }
            case 34: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqj", cjzm(int ), (int)216);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
lbl241:
            // 2 sources

            case 35: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqk", cjzm(int ), (int)217);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 36: {
                var6_3 /* !! */  = (int)hn.cjzi("ckql", cjzm(int ), (int)218);
                if (!var7_2) ** GOTO lbl228
                throw null;
            }
lbl250:
            // 3 sources

            case 37: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqm", cjzm(int ), (int)219);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
            case 38: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqn", cjzm(int ), (int)220);
                if (!var7_2) ** GOTO lbl174
                throw null;
            }
            case 39: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqo", cjzm(int ), (int)221);
                if (!var7_2) ** GOTO lbl188
                throw null;
            }
lbl262:
            // 2 sources

            case 40: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqp", cjzm(int ), (int)222);
                if (!var7_2) ** GOTO lbl179
                throw null;
            }
lbl266:
            // 3 sources

            case 41: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqq", cjzm(int ), (int)223);
                if (!var7_2) ** GOTO lbl174
                throw null;
            }
lbl270:
            // 2 sources

            case 42: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqr", cjzm(int ), (int)224);
                if (!var7_2) ** GOTO lbl162
                throw null;
            }
            case 43: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqs", cjzm(int ), (int)225);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl279:
            // 2 sources

            case 44: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqt", cjzm(int ), (int)226);
                if (!var7_2) ** GOTO lbl94
                throw null;
            }
lbl283:
            // 2 sources

            case 45: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqu", cjzm(int ), (int)227);
                if (!var7_2) ** GOTO lbl108
                throw null;
            }
            case 46: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqv", cjzm(int ), (int)228);
                if (!var7_2) ** GOTO lbl170
                throw null;
            }
lbl291:
            // 2 sources

            case 47: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqw", cjzm(int ), (int)229);
                if (!var7_2) ** GOTO lbl79
                throw null;
            }
lbl295:
            // 2 sources

            case 48: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqx", cjzm(int ), (int)230);
                if (!var7_2) ** GOTO lbl266
                throw null;
            }
lbl299:
            // 4 sources

            case 49: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqy", cjzm(int ), (int)231);
                if (!var7_2) ** GOTO lbl224
                throw null;
            }
lbl303:
            // 2 sources

            case 50: {
                var6_3 /* !! */  = (int)hn.cjzi("ckqz", cjzm(int ), (int)232);
                if (!var7_2) ** GOTO lbl262
                throw null;
            }
            case 51: {
                var6_3 /* !! */  = (int)hn.cjzi("ckra", cjzm(int ), (int)233);
                if (!var7_2) ** GOTO lbl299
                throw null;
            }
lbl311:
            // 2 sources

            case 52: {
                var6_3 /* !! */  = (int)hn.cjzi("ckrb", cjzm(int ), (int)234);
                if (!var7_2) ** GOTO lbl206
                throw null;
            }
            case 53: {
                var6_3 /* !! */  = (int)hn.cjzi("ckrc", cjzm(int ), (int)235);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
lbl319:
            // 2 sources

            case 54: {
                var6_3 /* !! */  = (int)hn.cjzi("ckrd", cjzm(int ), (int)236);
                if (!var7_2) ** GOTO lbl152
                throw null;
            }
            case 55: 
        }
        var6_3 /* !! */  = (int)hn.cjzi("ckre", cjzm(int ), (int)237);
        ** while (!var7_2)
lbl326:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqvr() {
        hn.cjzo[900] = 645026644;
        hn.cjzo[901] = 2141538229;
        hn.cjzo[902] = 1608230095;
        hn.cjzo[903] = 1687438751;
        hn.cjzo[904] = -966506709;
        hn.cjzo[905] = -326887669;
        hn.cjzo[906] = -218642140;
        hn.cjzo[907] = 1761061936;
        hn.cjzo[908] = 567443556;
        hn.cjzo[909] = -1309936205;
        hn.cjzo[910] = 935403917;
        hn.cjzo[911] = 1904246852;
        hn.cjzo[912] = 1286549881;
        hn.cjzo[913] = 424888507;
        hn.cjzo[914] = 1495324462;
        hn.cjzo[915] = -1770527257;
        hn.cjzo[916] = -2079456700;
        hn.cjzo[917] = 322911326;
        hn.cjzo[918] = 1964028089;
        hn.cjzo[919] = -931465992;
        hn.cjzo[920] = 1243091396;
        hn.cjzo[921] = -383217049;
        hn.cjzo[922] = 1676891561;
        hn.cjzo[923] = 1638315097;
        hn.cjzo[924] = 805190501;
        hn.cjzo[925] = -1207876055;
        hn.cjzo[926] = 945398724;
        hn.cjzo[927] = 1754090993;
        hn.cjzo[928] = 2082662114;
        hn.cjzo[929] = 2013314482;
        hn.cjzo[930] = 1456012237;
        hn.cjzo[931] = -1732327215;
        hn.cjzo[932] = 1941041160;
        hn.cjzo[933] = -214303712;
        hn.cjzo[934] = -338684421;
        hn.cjzo[935] = 1346119360;
        hn.cjzo[936] = 814644378;
        hn.cjzo[937] = -1879438171;
        hn.cjzo[938] = 1346797512;
        hn.cjzo[939] = 553414531;
        hn.cjzo[940] = 2043142207;
        hn.cjzo[941] = 1011501417;
        hn.cjzo[942] = 1839571719;
        hn.cjzo[943] = 1705028702;
        hn.cjzo[944] = 501500861;
        hn.cjzo[945] = -1793741649;
        hn.cjzo[946] = -184374724;
        hn.cjzo[947] = -2106746918;
        hn.cjzo[948] = -238371993;
        hn.cjzo[949] = 116363318;
        hn.cjzo[950] = 198301223;
        hn.cjzo[951] = 801768903;
        hn.cjzo[952] = 1975048404;
        hn.cjzo[953] = 494698209;
        hn.cjzo[954] = -1022289758;
        hn.cjzo[955] = 300763012;
        hn.cjzo[956] = 2135475153;
        hn.cjzo[957] = -211551079;
        hn.cjzo[958] = -117372756;
        hn.cjzo[959] = 1515786365;
        hn.cjzo[960] = -1621756264;
        hn.cjzo[961] = -1313052558;
        hn.cjzo[962] = 946897860;
        hn.cjzo[963] = 1601085173;
        hn.cjzo[964] = 1003469121;
        hn.cjzo[965] = 218556338;
        hn.cjzo[966] = 239909066;
        hn.cjzo[967] = 1810644501;
        hn.cjzo[968] = -1615001571;
        hn.cjzo[969] = -969847410;
        hn.cjzo[970] = 1622276198;
        hn.cjzo[971] = -839066383;
        hn.cjzo[972] = -1501984576;
        hn.cjzo[973] = -1725197503;
        hn.cjzo[974] = -457837613;
        hn.cjzo[975] = -2009196504;
        hn.cjzo[976] = 467625981;
        hn.cjzo[977] = -1036582258;
        hn.cjzo[978] = 661181308;
        hn.cjzo[979] = -1716012423;
        hn.cjzo[980] = -724566140;
        hn.cjzo[981] = -1125179830;
        hn.cjzo[982] = -1828280566;
        hn.cjzo[983] = 821039629;
        hn.cjzo[984] = 1270455600;
        hn.cjzo[985] = 748346362;
        hn.cjzo[986] = 1924842455;
        hn.cjzo[987] = -79144151;
        hn.cjzo[988] = 1397982568;
        hn.cjzo[989] = -1628638852;
        hn.cjzo[990] = 1215596382;
        hn.cjzo[991] = 520993388;
        hn.cjzo[992] = 456055016;
        hn.cjzo[993] = 1561605785;
        hn.cjzo[994] = -2093551536;
        hn.cjzo[995] = 1449036523;
        hn.cjzo[996] = 1000872077;
        hn.cjzo[997] = 1471983460;
        hn.cjzo[998] = 578927176;
        hn.cjzo[999] = 68546739;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void hideArtifactFromMainHand() {
        var7_1 = hn.c;
        var6_2 /* !! */  = hn.b;
        var5_3 = hn.a;
        if (var7_1) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        if (!this.maximumDamage.isValue()) ** GOTO lbl16
        if (var5_3) ** GOTO lbl6
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (hn.mc.field_1724 != null) ** GOTO lbl18
                if (var5_3) ** GOTO lbl6
lbl16:
                // 2 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                return;
lbl18:
                // 1 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var1_4 = this.damageSphere.getValue();
                if (var5_3 || var5_3) ** GOTO lbl6
                if (this.matchesArtifact(hn.mc.field_1724.method_6047(), var1_4)) ** GOTO lbl24
                if (var5_3 || var5_3) ** GOTO lbl6
                return;
lbl24:
                // 1 sources

                if (var5_3 || var5_3) ** GOTO lbl6
                var2_5 = hn.mc.field_1724.method_31548().method_67532();
                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = hn.cjzi("ckrf", cjzm(int ), (int)238);
                if (var5_3) ** GOTO lbl6
                do {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var3_6 >= hn.cjzi("ckrg", cjzm(int ), (int)239)) ** GOTO lbl54
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var3_6 != var2_5) ** GOTO lbl38
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl49
lbl38:
                    // 1 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    var4_7 = hn.mc.field_1724.method_31548().method_5438((int)var3_6);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var4_7.method_7960()) ** GOTO lbl45
                    if (var5_3) ** GOTO lbl6
                    if (this.matchesArtifact(var4_7, var1_4)) ** GOTO lbl49
                    if (var5_3) ** GOTO lbl6
lbl45:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    nv.selectSlot((int)var3_6);
                    if (var5_3 || var5_3) ** GOTO lbl6
                    return;
lbl49:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    ++var3_6;
                    if (var5_3) ** GOTO lbl6
                } while (!var7_1);
                throw null;
lbl54:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrh", cjzm(int ), (int)240);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl62:
            // 4 sources

            case 1: {
                var6_2 /* !! */  = (int)hn.cjzi("ckri", cjzm(int ), (int)241);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl67:
            // 2 sources

            case 2: {
                do {
                    var6_2 /* !! */  = (int)hn.cjzi("ckrj", cjzm(int ), (int)242);
                } while (!var7_1);
                throw null;
            }
lbl72:
            // 3 sources

            case 3: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrk", cjzm(int ), (int)243);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 4: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrl", cjzm(int ), (int)244);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl82:
            // 2 sources

            case 5: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrm", cjzm(int ), (int)245);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl87:
            // 2 sources

            case 6: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrn", cjzm(int ), (int)246);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl92:
            // 3 sources

            case 7: {
                var6_2 /* !! */  = (int)hn.cjzi("ckro", cjzm(int ), (int)247);
                if (!var7_1) ** GOTO lbl72
                throw null;
            }
lbl96:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrp", cjzm(int ), (int)248);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 9: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrq", cjzm(int ), (int)249);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl106:
            // 2 sources

            case 10: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrr", cjzm(int ), (int)250);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 11: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrs", cjzm(int ), (int)251);
                if (var7_1) {
                    throw null;
                }
            }
lbl115:
            // 4 sources

            case 12: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrt", cjzm(int ), (int)252);
                if (!var7_1) ** GOTO lbl96
                throw null;
            }
            case 13: {
                var6_2 /* !! */  = (int)hn.cjzi("ckru", cjzm(int ), (int)253);
                if (!var7_1) ** GOTO lbl62
                throw null;
            }
            case 14: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrv", cjzm(int ), (int)254);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl128:
            // 2 sources

            case 15: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrw", cjzm(int ), (int)255);
                if (!var7_1) ** GOTO lbl67
                throw null;
            }
            case 16: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrx", cjzm(int ), (int)256);
                if (!var7_1) ** GOTO lbl92
                throw null;
            }
lbl136:
            // 3 sources

            case 17: {
                var6_2 /* !! */  = (int)hn.cjzi("ckry", cjzm(int ), (int)257);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 18: {
                var6_2 /* !! */  = (int)hn.cjzi("ckrz", cjzm(int ), (int)258);
                if (!var7_1) ** GOTO lbl92
                throw null;
            }
            case 19: {
                var6_2 /* !! */  = (int)hn.cjzi("cksa", cjzm(int ), (int)259);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl150:
            // 2 sources

            case 20: {
                var6_2 /* !! */  = (int)hn.cjzi("cksb", cjzm(int ), (int)260);
                if (!var7_1) ** GOTO lbl72
                throw null;
            }
lbl154:
            // 2 sources

            case 21: {
                var6_2 /* !! */  = (int)hn.cjzi("cksc", cjzm(int ), (int)261);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl159:
            // 2 sources

            case 22: {
                var6_2 /* !! */  = (int)hn.cjzi("cksd", cjzm(int ), (int)262);
                if (!var7_1) ** GOTO lbl128
                throw null;
            }
lbl163:
            // 3 sources

            case 23: {
                var6_2 /* !! */  = (int)hn.cjzi("ckse", cjzm(int ), (int)263);
                if (!var7_1) ** GOTO lbl62
                throw null;
            }
lbl167:
            // 4 sources

            case 24: {
                var6_2 /* !! */  = (int)hn.cjzi("cksf", cjzm(int ), (int)264);
                if (!var7_1) ** GOTO lbl163
                throw null;
            }
            case 25: {
                var6_2 /* !! */  = (int)hn.cjzi("cksg", cjzm(int ), (int)265);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl176:
            // 2 sources

            case 26: {
                var6_2 /* !! */  = (int)hn.cjzi("cksh", cjzm(int ), (int)266);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 27: {
                var6_2 /* !! */  = (int)hn.cjzi("cksi", cjzm(int ), (int)267);
                if (!var7_1) ** GOTO lbl62
                throw null;
            }
            case 28: {
                var6_2 /* !! */  = (int)hn.cjzi("cksj", cjzm(int ), (int)268);
                if (!var7_1) ** GOTO lbl106
                throw null;
            }
lbl189:
            // 2 sources

            case 29: {
                var6_2 /* !! */  = (int)hn.cjzi("cksk", cjzm(int ), (int)269);
                if (!var7_1) ** GOTO lbl115
                throw null;
            }
lbl193:
            // 2 sources

            case 30: {
                var6_2 /* !! */  = (int)hn.cjzi("cksl", cjzm(int ), (int)270);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl198:
            // 2 sources

            case 31: {
                var6_2 /* !! */  = (int)hn.cjzi("cksm", cjzm(int ), (int)271);
                if (!var7_1) ** GOTO lbl167
                throw null;
            }
lbl202:
            // 2 sources

            case 32: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)hn.cjzi("cksn", cjzm(int ), (int)272);
                    if (!var7_1) ** GOTO lbl167
                    throw null;
                }
            }
            case 33: {
                var6_2 /* !! */  = (int)hn.cjzi("ckso", cjzm(int ), (int)273);
                if (!var7_1) ** GOTO lbl176
                throw null;
            }
lbl211:
            // 4 sources

            case 34: {
                var6_2 /* !! */  = (int)hn.cjzi("cksp", cjzm(int ), (int)274);
                if (!var7_1) ** GOTO lbl82
                throw null;
            }
lbl215:
            // 2 sources

            case 35: {
                var6_2 /* !! */  = (int)hn.cjzi("cksq", cjzm(int ), (int)275);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl220:
            // 4 sources

            case 36: {
                var6_2 /* !! */  = (int)hn.cjzi("cksr", cjzm(int ), (int)276);
                if (!var7_1) ** GOTO lbl163
                throw null;
            }
lbl224:
            // 4 sources

            case 37: {
                var6_2 /* !! */  = (int)hn.cjzi("ckss", cjzm(int ), (int)277);
                if (!var7_1) ** GOTO lbl211
                throw null;
            }
lbl228:
            // 2 sources

            case 38: {
                var6_2 /* !! */  = (int)hn.cjzi("ckst", cjzm(int ), (int)278);
                if (!var7_1) ** GOTO lbl154
                throw null;
            }
            case 39: {
                var6_2 /* !! */  = (int)hn.cjzi("cksu", cjzm(int ), (int)279);
                if (!var7_1) ** GOTO lbl136
                throw null;
            }
            case 40: {
                var6_2 /* !! */  = (int)hn.cjzi("cksv", cjzm(int ), (int)280);
                if (!var7_1) ** GOTO lbl211
                throw null;
            }
            case 41: {
                var6_2 /* !! */  = (int)hn.cjzi("cksw", cjzm(int ), (int)281);
                if (!var7_1) ** GOTO lbl211
                throw null;
            }
            case 42: 
        }
        var6_2 /* !! */  = (int)hn.cjzi("cksx", cjzm(int ), (int)282);
        ** while (!var7_1)
lbl247:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqvh() {
        hn.cjzo[700] = 2115667795;
        hn.cjzo[701] = -1623935828;
        hn.cjzo[702] = 1838362007;
        hn.cjzo[703] = -117073072;
        hn.cjzo[704] = 2074549936;
        hn.cjzo[705] = -1593231715;
        hn.cjzo[706] = 1304502128;
        hn.cjzo[707] = -631069292;
        hn.cjzo[708] = 1787246475;
        hn.cjzo[709] = 120792556;
        hn.cjzo[710] = -1678356442;
        hn.cjzo[711] = -1395715060;
        hn.cjzo[712] = -2020365787;
        hn.cjzo[713] = -558446617;
        hn.cjzo[714] = -1109293491;
        hn.cjzo[715] = 2128991272;
        hn.cjzo[716] = 463225736;
        hn.cjzo[717] = 186579986;
        hn.cjzo[718] = -784912530;
        hn.cjzo[719] = 1642555644;
        hn.cjzo[720] = -2050304590;
        hn.cjzo[721] = -2002195709;
        hn.cjzo[722] = -1624231720;
        hn.cjzo[723] = 1528995223;
        hn.cjzo[724] = 261727394;
        hn.cjzo[725] = 572903434;
        hn.cjzo[726] = 2111106085;
        hn.cjzo[727] = 1381080460;
        hn.cjzo[728] = 1643861166;
        hn.cjzo[729] = 984320399;
        hn.cjzo[730] = -1795929378;
        hn.cjzo[731] = -1678709088;
        hn.cjzo[732] = 519749877;
        hn.cjzo[733] = -1664690149;
        hn.cjzo[734] = 1067408330;
        hn.cjzo[735] = -1858635074;
        hn.cjzo[736] = -929417193;
        hn.cjzo[737] = -1701163465;
        hn.cjzo[738] = -1248451776;
        hn.cjzo[739] = 1239562790;
        hn.cjzo[740] = 1907256775;
        hn.cjzo[741] = 1441518367;
        hn.cjzo[742] = 1024383742;
        hn.cjzo[743] = -2133665609;
        hn.cjzo[744] = -258608960;
        hn.cjzo[745] = -2127883355;
        hn.cjzo[746] = -300885192;
        hn.cjzo[747] = -1516442768;
        hn.cjzo[748] = 69045241;
        hn.cjzo[749] = -135029420;
        hn.cjzo[750] = -1016299276;
        hn.cjzo[751] = -59606476;
        hn.cjzo[752] = 1739392791;
        hn.cjzo[753] = -1913452585;
        hn.cjzo[754] = 1545250196;
        hn.cjzo[755] = 1302913485;
        hn.cjzo[756] = -979699166;
        hn.cjzo[757] = -826421092;
        hn.cjzo[758] = -1721533516;
        hn.cjzo[759] = -1843703246;
        hn.cjzo[760] = -113399685;
        hn.cjzo[761] = -1264333644;
        hn.cjzo[762] = 198567221;
        hn.cjzo[763] = 1111518476;
        hn.cjzo[764] = -1053157619;
        hn.cjzo[765] = 843011324;
        hn.cjzo[766] = 269850266;
        hn.cjzo[767] = 924633206;
        hn.cjzo[768] = -319696445;
        hn.cjzo[769] = -930574207;
        hn.cjzo[770] = 1444387730;
        hn.cjzo[771] = 781474308;
        hn.cjzo[772] = -117238727;
        hn.cjzo[773] = -337084128;
        hn.cjzo[774] = 1315335056;
        hn.cjzo[775] = 2034568967;
        hn.cjzo[776] = 1314271696;
        hn.cjzo[777] = -2108946546;
        hn.cjzo[778] = 1836292653;
        hn.cjzo[779] = -438787902;
        hn.cjzo[780] = -1026510644;
        hn.cjzo[781] = -1916453663;
        hn.cjzo[782] = -795847346;
        hn.cjzo[783] = 1095179845;
        hn.cjzo[784] = -1373081805;
        hn.cjzo[785] = 1419640952;
        hn.cjzo[786] = -800763971;
        hn.cjzo[787] = -1357450422;
        hn.cjzo[788] = -1072643091;
        hn.cjzo[789] = -1928658681;
        hn.cjzo[790] = -1397447478;
        hn.cjzo[791] = -1012182498;
        hn.cjzo[792] = 1875864633;
        hn.cjzo[793] = -1487128092;
        hn.cjzo[794] = -1230916896;
        hn.cjzo[795] = -735499292;
        hn.cjzo[796] = 722685835;
        hn.cjzo[797] = 1999935275;
        hn.cjzo[798] = -14847922;
        hn.cjzo[799] = 2078871666;
    }

    private static /* synthetic */ void cqwm() {
        hn.cjzg[0] = -8685870243991428337L;
        hn.cjzg[1] = 8371779336802695993L;
        hn.cjzg[2] = -2031300127688293341L;
        hn.cjzg[3] = 2485243691030151603L;
        hn.cjzg[4] = -6386577151107319674L;
        hn.cjzg[5] = 255210138810366261L;
        hn.cjzg[6] = -7285997045374249901L;
        hn.cjzg[7] = 2644484482952366918L;
        hn.cjzg[8] = -1969414324460334620L;
        hn.cjzg[9] = 8967324940560191538L;
        hn.cjzg[10] = -7278023386931644179L;
        hn.cjzg[11] = -3873646885784483722L;
        hn.cjzg[12] = -7451923923033761833L;
        hn.cjzg[13] = 182149642590204191L;
        hn.cjzg[14] = 8047618965114966174L;
        hn.cjzg[15] = 339584890106143738L;
        hn.cjzg[16] = 78438999976603617L;
        hn.cjzg[17] = -788131041210108914L;
        hn.cjzg[18] = -1655654607587039003L;
        hn.cjzg[19] = -4706817598765133461L;
        hn.cjzg[20] = -9163765464091005420L;
        hn.cjzg[21] = -808980850155992939L;
        hn.cjzg[22] = -5064675084899822786L;
        hn.cjzg[23] = 4311288271745663146L;
        hn.cjzg[24] = 4951199076193450316L;
        hn.cjzg[25] = -5938064156147752033L;
        hn.cjzg[26] = -614621391498379024L;
        hn.cjzg[27] = -3495633939335694022L;
        hn.cjzg[28] = -5634016421701247668L;
        hn.cjzg[29] = 6822522639507993755L;
        hn.cjzg[30] = 461511394169471242L;
        hn.cjzg[31] = 4627019524730568315L;
        hn.cjzg[32] = -7312642737601885122L;
        hn.cjzg[33] = -5850544012859141069L;
        hn.cjzg[34] = 8326679540932884121L;
        hn.cjzg[35] = -1186861659065386107L;
        hn.cjzg[36] = 7094947760301572896L;
        hn.cjzg[37] = -5295906167211765694L;
        hn.cjzg[38] = -6836716642612747025L;
        hn.cjzg[39] = 1941742702674676005L;
        hn.cjzg[40] = 4493642127327473150L;
        hn.cjzg[41] = -7523656469237468972L;
        hn.cjzg[42] = -3329599860026889885L;
        hn.cjzg[43] = 6314647612795446264L;
        hn.cjzg[44] = -5958221997284368365L;
        hn.cjzg[45] = -1440019065736148399L;
        hn.cjzg[46] = 8944955404414507228L;
        hn.cjzg[47] = -2323788706011301192L;
        hn.cjzg[48] = 4964146683991597123L;
        hn.cjzg[49] = 8368076082754502745L;
        hn.cjzg[50] = 5225474771398550679L;
        hn.cjzg[51] = -1154602394737549917L;
        hn.cjzg[52] = -847454545313183383L;
        hn.cjzg[53] = -690120506415925426L;
        hn.cjzg[54] = -5096911722917792110L;
        hn.cjzg[55] = -3948682541954405046L;
        hn.cjzg[56] = -2907547904774299400L;
        hn.cjzg[57] = -1253652290022269877L;
        hn.cjzg[58] = -7215077073583134401L;
        hn.cjzg[59] = 316066315215320247L;
        hn.cjzg[60] = 2507803621284135576L;
        hn.cjzg[61] = -6845133831698213597L;
        hn.cjzg[62] = -2181323721925228829L;
        hn.cjzg[63] = 4495971527739785631L;
        hn.cjzg[64] = 8933041215022928199L;
        hn.cjzg[65] = 3553800761750549732L;
        hn.cjzg[66] = -471272323694813345L;
        hn.cjzg[67] = 3587021037236001378L;
        hn.cjzg[68] = 5171435599622180424L;
        hn.cjzg[69] = -6189779985221739792L;
        hn.cjzg[70] = 4472395818890147998L;
        hn.cjzg[71] = -7445667136845703024L;
        hn.cjzg[72] = 3727839246472305532L;
        hn.cjzg[73] = -6313209847525672266L;
        hn.cjzg[74] = 2633908164479883562L;
        hn.cjzg[75] = -4898866346615422728L;
        hn.cjzg[76] = -1889422781970023841L;
        hn.cjzg[77] = -2873170322143104398L;
        hn.cjzg[78] = 6635009209974764221L;
        hn.cjzg[79] = 8177364207455379697L;
        hn.cjzg[80] = -2849277805963987282L;
        hn.cjzg[81] = -1449429471948167258L;
        hn.cjzg[82] = -8012687234871578747L;
        hn.cjzg[83] = 7269561496803181461L;
        hn.cjzg[84] = -5064488728485690483L;
        hn.cjzg[85] = -7475412379545909277L;
        hn.cjzg[86] = -9193018121317037828L;
        hn.cjzg[87] = 4555670895884367140L;
        hn.cjzg[88] = 5915666560166789554L;
        hn.cjzg[89] = 2399604854587979614L;
        hn.cjzg[90] = 1848316509596220998L;
        hn.cjzg[91] = -5918815184608293200L;
        hn.cjzg[92] = 6195482957307152724L;
        hn.cjzg[93] = -5931547796616316817L;
        hn.cjzg[94] = 1975214699907394421L;
        hn.cjzg[95] = -839952282595198725L;
        hn.cjzg[96] = -93866748350101611L;
        hn.cjzg[97] = -1547570022087608214L;
        hn.cjzg[98] = -5487254171803768002L;
        hn.cjzg[99] = -6575786439129699041L;
    }

    private static /* synthetic */ void cqzc() {
        hn.cjzh[300] = 201344999467694214L;
        hn.cjzh[301] = 5248704008492073347L;
        hn.cjzh[302] = -5528584928306325187L;
        hn.cjzh[303] = -212295482353554593L;
        hn.cjzh[304] = -5722231838516509981L;
        hn.cjzh[305] = -1516148872515794906L;
        hn.cjzh[306] = -8996182542007570294L;
        hn.cjzh[307] = -652592227375278869L;
        hn.cjzh[308] = 7783094238302406579L;
        hn.cjzh[309] = 8693184698595941955L;
        hn.cjzh[310] = -2167568787609048879L;
        hn.cjzh[311] = -7971403156684521565L;
        hn.cjzh[312] = 3474868687308887742L;
        hn.cjzh[313] = 8656712372368999643L;
        hn.cjzh[314] = 5118363265410234949L;
        hn.cjzh[315] = 3169364204899526801L;
        hn.cjzh[316] = -3649769297716042820L;
        hn.cjzh[317] = 890419978585369080L;
        hn.cjzh[318] = -3678705305606605798L;
        hn.cjzh[319] = -4416275365245499713L;
        hn.cjzh[320] = 347791781671034017L;
        hn.cjzh[321] = 5762422486906283391L;
        hn.cjzh[322] = 3485576924758767448L;
        hn.cjzh[323] = -8750627743560157564L;
        hn.cjzh[324] = -4586118161364478973L;
        hn.cjzh[325] = -2973229782967225342L;
        hn.cjzh[326] = -4774849647462393025L;
        hn.cjzh[327] = 1465878977085065146L;
        hn.cjzh[328] = 7385871113044144304L;
        hn.cjzh[329] = 9081402841630179469L;
        hn.cjzh[330] = -4755254763591086859L;
        hn.cjzh[331] = -647009421232831461L;
        hn.cjzh[332] = -4568666904143393798L;
        hn.cjzh[333] = -7312998793625940855L;
        hn.cjzh[334] = -3659223543035266691L;
        hn.cjzh[335] = -6107893746909661913L;
        hn.cjzh[336] = -3318552576291886966L;
        hn.cjzh[337] = -3867488457664237027L;
        hn.cjzh[338] = 73224125340827860L;
        hn.cjzh[339] = 4050687718028663985L;
        hn.cjzh[340] = 4206544257520589926L;
        hn.cjzh[341] = 7506747774057832995L;
        hn.cjzh[342] = 7862040767473622896L;
        hn.cjzh[343] = 8934409041887915821L;
        hn.cjzh[344] = -6385293416190098496L;
        hn.cjzh[345] = -8489193294576832004L;
        hn.cjzh[346] = 8697531121997668816L;
        hn.cjzh[347] = -3216361610993659534L;
        hn.cjzh[348] = 6334756729755113229L;
        hn.cjzh[349] = -4589483828176052799L;
        hn.cjzh[350] = 7254490053282318858L;
        hn.cjzh[351] = -5570359870852281559L;
        hn.cjzh[352] = -3335240996209669179L;
        hn.cjzh[353] = 7234755380149316870L;
        hn.cjzh[354] = -1178357581486091665L;
        hn.cjzh[355] = 9063429682418281985L;
        hn.cjzh[356] = 4900893812701617645L;
        hn.cjzh[357] = -5319906650113958357L;
        hn.cjzh[358] = -2139605572746839567L;
        hn.cjzh[359] = 4380947193711518868L;
        hn.cjzh[360] = -6910472516570203044L;
        hn.cjzh[361] = 5691077231207070356L;
        hn.cjzh[362] = 2331957630925480781L;
        hn.cjzh[363] = -671427812848046347L;
        hn.cjzh[364] = 6634092798143905403L;
        hn.cjzh[365] = -7353498095789608802L;
        hn.cjzh[366] = 2190904095740375970L;
        hn.cjzh[367] = -1112929227884320269L;
        hn.cjzh[368] = 8522597010550475845L;
        hn.cjzh[369] = 8924779632278583700L;
        hn.cjzh[370] = 2427754246979080313L;
        hn.cjzh[371] = 3284710773739381874L;
        hn.cjzh[372] = -8682223825055758663L;
        hn.cjzh[373] = -6246390375363080069L;
        hn.cjzh[374] = 2677158003588388984L;
        hn.cjzh[375] = -3733709237746182588L;
        hn.cjzh[376] = 3167136523586605935L;
        hn.cjzh[377] = 1220628235980783246L;
        hn.cjzh[378] = 8091309807708665110L;
        hn.cjzh[379] = -7121037375823375596L;
        hn.cjzh[380] = 766693629536373897L;
        hn.cjzh[381] = -1716888561060336269L;
        hn.cjzh[382] = 4416637036739332203L;
        hn.cjzh[383] = 5486786974673489356L;
        hn.cjzh[384] = 8111510465710253686L;
        hn.cjzh[385] = -6292399388023785402L;
        hn.cjzh[386] = -2705115854604314499L;
        hn.cjzh[387] = -3816889968826400440L;
        hn.cjzh[388] = -4867104428958708209L;
        hn.cjzh[389] = 2298377700880171299L;
        hn.cjzh[390] = 4331923525946550478L;
        hn.cjzh[391] = -1134348507706745055L;
        hn.cjzh[392] = -4571480908379839319L;
        hn.cjzh[393] = -4631429250006593637L;
        hn.cjzh[394] = 7356582767164002640L;
        hn.cjzh[395] = -7244989626284786871L;
        hn.cjzh[396] = -8635605507422942516L;
        hn.cjzh[397] = 8788024835083159942L;
        hn.cjzh[398] = -2511423423745337829L;
        hn.cjzh[399] = -828391506968696509L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$5() {
        block30: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqje", cjzf(int ), (int)761)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hn.cjzi("cqjg", cjzm(int ), (int)1419)) break;
                v0 /* !! */  = (long)hn.cjzi("cqjh", cjzm(int ), (int)1420);
            }
            var3_1 = hn.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cqji", cjzf(int ), (int)762)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hn.cjzi("cqjk", cjzm(int ), (int)1421)) break;
                v1 /* !! */  = (long)hn.cjzi("cqjl", cjzm(int ), (int)1422);
            }
            var2_2 /* !! */  = hn.b;
            v2 /* !! */  = hn.fz;
            block21: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -841682887: {
                        break block21;
                    }
                    case 84677981: {
                        v2 /* !! */  = (long)(hn.cjzi("cqjo", cjzf(int ), (int)764) - hn.cjzi("cqjm", cjzf(int ), (int)763));
                        continue block21;
                    }
                }
                break;
            }
            var1_3 = hn.a;
            if (var3_1) {
                throw null;
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block22: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v3 /* !! */  = hn.fz;
                        block23: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -841682887: {
                                    break block23;
                                }
                                case 1447397378: {
                                    v3 /* !! */  = (long)(hn.cjzi("cqjr", cjzf(int ), (int)766) - hn.cjzi("cqjq", cjzf(int ), (int)765));
                                    continue block23;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cqjt", cjzf(int ), (int)767)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != hn.cjzi("cqju", cjzm(int ), (int)1423)) ** GOTO lbl45
                            v5 = this.clickType.isSelected("1.9+");
                            v6 /* !! */  = hn.fz;
                            if (true) ** GOTO lbl58
lbl45:
                            // 1 sources

                            v4 /* !! */  = (long)hn.cjzi("cqjv", cjzm(int ), (int)1424);
                        }
                    }
                    case 0: {
                        ** GOTO lbl68
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)hn.cjzi("cqkc", cjzm(int ), (int)1427);
                        if (var3_1) {
                            throw null;
                        }
                        break block30;
                    }
                    case 3: {
                        break block30;
                    }
                    block25: while (true) {
                        v6 /* !! */  = (long)(v7 - hn.cjzi("cqjx", cjzf(int ), (int)768));
lbl58:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1180603345: {
                                v7 = hn.cjzi("cqjy", cjzf(int ), (int)769);
                                continue block25;
                            }
                            case -841682887: {
                                return v5;
                            }
                            case -630588710: {
                                v7 = hn.cjzi("cqjz", cjzf(int ), (int)770);
                                continue block25;
                            }
                        }
                        break;
                    }
                    return v5;
lbl68:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("cqka", cjzm(int ), (int)1425);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block22;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)hn.cjzi("cqkb", cjzm(int ), (int)1426);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqkd", cjzm(int ), (int)1428);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kb getMaximumDamage() {
        block34: {
            v0 /* !! */  = hn.fz;
            if (true) ** GOTO lbl5
            block24: while (true) {
                v0 /* !! */  = (long)(v1 - hn.cjzi("cqbd", cjzf(int ), (int)677));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1181062072: {
                        v1 = hn.cjzi("cqbe", cjzf(int ), (int)678);
                        continue block24;
                    }
                    case -841682887: {
                        break block24;
                    }
                    case -375063673: {
                        v1 = hn.cjzi("cqbf", cjzf(int ), (int)679);
                        continue block24;
                    }
                    case 152664486: {
                        v1 = hn.cjzi("cqbg", cjzf(int ), (int)680);
                        continue block24;
                    }
                }
                break;
            }
            var3_1 = hn.c;
            while (true) {
                block35: {
                    if ((v2 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqbh", cjzf(int ), (int)681)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != hn.cjzi("cqbi", cjzm(int ), (int)1367)) break block35;
                    var2_2 /* !! */  = hn.b;
                    v3 /* !! */  = hn.fz;
                    if (true) ** GOTO lbl30
                }
                v2 /* !! */  = (long)hn.cjzi("cqbj", cjzm(int ), (int)1368);
            }
            block26: while (true) {
                v3 /* !! */  = (long)(v4 - hn.cjzi("cqbk", cjzf(int ), (int)682));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1869244372: {
                        v4 = hn.cjzi("cqbl", cjzf(int ), (int)683);
                        continue block26;
                    }
                    case -841682887: {
                        break block26;
                    }
                    case 441564292: {
                        v4 = hn.cjzi("cqbm", cjzf(int ), (int)684);
                        continue block26;
                    }
                    case 1995094798: {
                        v4 = hn.cjzi("cqbn", cjzf(int ), (int)685);
                        continue block26;
                    }
                }
                break;
            }
            var1_3 = hn.a;
            if (var3_1) {
                throw null;
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block27: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v5 /* !! */  = hn.fz;
                        block28: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -841682887: {
                                    return this.maximumDamage;
                                }
                                case -293779317: {
                                    v6 = hn.cjzi("cqbp", cjzf(int ), (int)687);
                                    ** GOTO lbl65
                                }
                                case 633378802: {
                                    v6 = hn.cjzi("cqbq", cjzf(int ), (int)688);
                                    ** GOTO lbl65
                                }
                                case 1406556842: {
                                    v6 = hn.cjzi("cqbr", cjzf(int ), (int)689);
lbl65:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - hn.cjzi("cqbo", cjzf(int ), (int)686));
                                    continue block28;
                                }
                            }
                            break;
                        }
                        return this.maximumDamage;
                    }
                    case 0: {
                        do {
                            var2_2 /* !! */  = (int)hn.cjzi("cqbs", cjzm(int ), (int)1369);
                        } while (!var3_1);
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block34;
                    }
lbl77:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)hn.cjzi("cqbt", cjzm(int ), (int)1370);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block27;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)hn.cjzi("cqbu", cjzm(int ), (int)1371);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)hn.cjzi("cqbv", cjzm(int ), (int)1372);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite cjzi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cqtz() {
        hn.cjzo[0] = -177569814;
        hn.cjzo[1] = -120662649;
        hn.cjzo[2] = 1834230575;
        hn.cjzo[3] = 1288358334;
        hn.cjzo[4] = -1137395364;
        hn.cjzo[5] = -1601206444;
        hn.cjzo[6] = 1319413108;
        hn.cjzo[7] = 307711345;
        hn.cjzo[8] = -2059647779;
        hn.cjzo[9] = 499255347;
        hn.cjzo[10] = -769940933;
        hn.cjzo[11] = 1961537596;
        hn.cjzo[12] = -135487080;
        hn.cjzo[13] = 575343383;
        hn.cjzo[14] = -145953644;
        hn.cjzo[15] = -2038073260;
        hn.cjzo[16] = 1965391699;
        hn.cjzo[17] = 1567174786;
        hn.cjzo[18] = -794765255;
        hn.cjzo[19] = -356383875;
        hn.cjzo[20] = -1536299072;
        hn.cjzo[21] = 2079860127;
        hn.cjzo[22] = 372380384;
        hn.cjzo[23] = -503609389;
        hn.cjzo[24] = -353381907;
        hn.cjzo[25] = 1526176935;
        hn.cjzo[26] = -1600176431;
        hn.cjzo[27] = -1109533498;
        hn.cjzo[28] = 49938689;
        hn.cjzo[29] = -1512118395;
        hn.cjzo[30] = -1228725577;
        hn.cjzo[31] = 1664766053;
        hn.cjzo[32] = 233454117;
        hn.cjzo[33] = 817699004;
        hn.cjzo[34] = 1428128442;
        hn.cjzo[35] = 670960864;
        hn.cjzo[36] = -2097484353;
        hn.cjzo[37] = -2084581752;
        hn.cjzo[38] = 770963148;
        hn.cjzo[39] = -823471545;
        hn.cjzo[40] = -1937739803;
        hn.cjzo[41] = -893842365;
        hn.cjzo[42] = 112939586;
        hn.cjzo[43] = -713357160;
        hn.cjzo[44] = 769932304;
        hn.cjzo[45] = 1105118730;
        hn.cjzo[46] = 274690215;
        hn.cjzo[47] = 929459703;
        hn.cjzo[48] = 1449410575;
        hn.cjzo[49] = -1081802080;
        hn.cjzo[50] = -1138983987;
        hn.cjzo[51] = 919397695;
        hn.cjzo[52] = 1787257407;
        hn.cjzo[53] = -1153583215;
        hn.cjzo[54] = -1928724700;
        hn.cjzo[55] = 1684089017;
        hn.cjzo[56] = -543705351;
        hn.cjzo[57] = 735560602;
        hn.cjzo[58] = 1053908046;
        hn.cjzo[59] = -666540758;
        hn.cjzo[60] = 75897162;
        hn.cjzo[61] = 1768467272;
        hn.cjzo[62] = -495029006;
        hn.cjzo[63] = 1458045202;
        hn.cjzo[64] = -1180558615;
        hn.cjzo[65] = 1965226974;
        hn.cjzo[66] = -204431921;
        hn.cjzo[67] = 1215658107;
        hn.cjzo[68] = -515952876;
        hn.cjzo[69] = 202966558;
        hn.cjzo[70] = 331713380;
        hn.cjzo[71] = -308457985;
        hn.cjzo[72] = -1741737628;
        hn.cjzo[73] = -1342990411;
        hn.cjzo[74] = -137585397;
        hn.cjzo[75] = 747781447;
        hn.cjzo[76] = 470101080;
        hn.cjzo[77] = -1761632897;
        hn.cjzo[78] = -2054624137;
        hn.cjzo[79] = 665239624;
        hn.cjzo[80] = -878968595;
        hn.cjzo[81] = 91841871;
        hn.cjzo[82] = -150720443;
        hn.cjzo[83] = 642934063;
        hn.cjzo[84] = -134848501;
        hn.cjzo[85] = -2030290356;
        hn.cjzo[86] = 1980068359;
        hn.cjzo[87] = -1610608907;
        hn.cjzo[88] = -1822623171;
        hn.cjzo[89] = 623635084;
        hn.cjzo[90] = 1202841373;
        hn.cjzo[91] = 733721792;
        hn.cjzo[92] = -88481258;
        hn.cjzo[93] = 1874417430;
        hn.cjzo[94] = 1388178881;
        hn.cjzo[95] = -1802430073;
        hn.cjzo[96] = -1541029927;
        hn.cjzo[97] = 1906721884;
        hn.cjzo[98] = 782575228;
        hn.cjzo[99] = -2042667429;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ia getDivineSmooth() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpbf", cjzf(int ), (int)483));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1383508358: {
                    v1 = hn.cjzi("cpbg", cjzf(int ), (int)484);
                    continue block17;
                }
                case -841682887: {
                    break block17;
                }
                case -612293436: {
                    v1 = hn.cjzi("cpbh", cjzf(int ), (int)485);
                    continue block17;
                }
                case 1940904053: {
                    v1 = hn.cjzi("cpbi", cjzf(int ), (int)486);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpbj", cjzf(int ), (int)487));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1299328651: {
                    v3 = hn.cjzi("cpbk", cjzf(int ), (int)488);
                    continue block18;
                }
                case -841682887: {
                    break block18;
                }
                case 1744414682: {
                    v3 = hn.cjzi("cpbl", cjzf(int ), (int)489);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpbm", cjzf(int ), (int)490)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hn.cjzi("cpbn", cjzm(int ), (int)1149)) break;
            v4 /* !! */  = (long)hn.cjzi("cpbo", cjzm(int ), (int)1150);
        }
        var1_3 = hn.a;
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

                if (var1_3 || var1_3) continue block20;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpbp", cjzf(int ), (int)491)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cpbq", cjzm(int ), (int)1151)) break;
                    v5 /* !! */  = (long)hn.cjzi("cpbr", cjzm(int ), (int)1152);
                }
                return this.divineSmooth;
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)hn.cjzi("cpbs", cjzm(int ), (int)1153);
                    } while (!var3_1);
                    throw null;
                }
lbl58:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)hn.cjzi("cpbt", cjzm(int ), (int)1154);
                    if (!var3_1) break block20;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)hn.cjzi("cpbu", cjzm(int ), (int)1155);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)hn.cjzi("cpbv", cjzm(int ), (int)1156);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void cquu() {
        hn.cjzo[400] = 2069994337;
        hn.cjzo[401] = -1147575036;
        hn.cjzo[402] = 920082092;
        hn.cjzo[403] = -1235904177;
        hn.cjzo[404] = 1355509013;
        hn.cjzo[405] = 1462115797;
        hn.cjzo[406] = -1912965319;
        hn.cjzo[407] = 1728175780;
        hn.cjzo[408] = -246985398;
        hn.cjzo[409] = 1153868769;
        hn.cjzo[410] = 587482246;
        hn.cjzo[411] = -2107577915;
        hn.cjzo[412] = -811806829;
        hn.cjzo[413] = -1317834749;
        hn.cjzo[414] = -21596082;
        hn.cjzo[415] = 143267080;
        hn.cjzo[416] = 1697639481;
        hn.cjzo[417] = -71619270;
        hn.cjzo[418] = 858018336;
        hn.cjzo[419] = 1687670032;
        hn.cjzo[420] = -58022175;
        hn.cjzo[421] = -1753232571;
        hn.cjzo[422] = 1942343771;
        hn.cjzo[423] = -1714229923;
        hn.cjzo[424] = 330313806;
        hn.cjzo[425] = -1407327206;
        hn.cjzo[426] = 634106636;
        hn.cjzo[427] = 29007998;
        hn.cjzo[428] = 1201590656;
        hn.cjzo[429] = 50062427;
        hn.cjzo[430] = -1371485285;
        hn.cjzo[431] = 280133693;
        hn.cjzo[432] = -1641293015;
        hn.cjzo[433] = -1911548909;
        hn.cjzo[434] = 574809175;
        hn.cjzo[435] = 1811279835;
        hn.cjzo[436] = -1735791563;
        hn.cjzo[437] = 1687869504;
        hn.cjzo[438] = 1109119933;
        hn.cjzo[439] = 611481029;
        hn.cjzo[440] = -1043439766;
        hn.cjzo[441] = -2079454708;
        hn.cjzo[442] = 674309796;
        hn.cjzo[443] = 207042752;
        hn.cjzo[444] = 985918336;
        hn.cjzo[445] = 1424084514;
        hn.cjzo[446] = -1243979084;
        hn.cjzo[447] = 1760789329;
        hn.cjzo[448] = 937716908;
        hn.cjzo[449] = -444964679;
        hn.cjzo[450] = -1472955368;
        hn.cjzo[451] = 1718589790;
        hn.cjzo[452] = -2110966918;
        hn.cjzo[453] = 114302417;
        hn.cjzo[454] = 1506439794;
        hn.cjzo[455] = 1384825877;
        hn.cjzo[456] = -420942625;
        hn.cjzo[457] = -1772533315;
        hn.cjzo[458] = -1762244337;
        hn.cjzo[459] = 282310668;
        hn.cjzo[460] = -1062766706;
        hn.cjzo[461] = -89563680;
        hn.cjzo[462] = -1990406565;
        hn.cjzo[463] = 176077224;
        hn.cjzo[464] = -1102234998;
        hn.cjzo[465] = -718152261;
        hn.cjzo[466] = 2115626647;
        hn.cjzo[467] = 1347363779;
        hn.cjzo[468] = 2041106684;
        hn.cjzo[469] = -674432986;
        hn.cjzo[470] = 22695368;
        hn.cjzo[471] = -465554295;
        hn.cjzo[472] = 379002694;
        hn.cjzo[473] = -1199933219;
        hn.cjzo[474] = -2072312590;
        hn.cjzo[475] = 1962099874;
        hn.cjzo[476] = 598418775;
        hn.cjzo[477] = 1564200510;
        hn.cjzo[478] = 9821830;
        hn.cjzo[479] = -324547435;
        hn.cjzo[480] = -19914176;
        hn.cjzo[481] = -2054936752;
        hn.cjzo[482] = -102375912;
        hn.cjzo[483] = 1659100267;
        hn.cjzo[484] = -1733174009;
        hn.cjzo[485] = -1434587641;
        hn.cjzo[486] = 400908116;
        hn.cjzo[487] = 2033838482;
        hn.cjzo[488] = 840967867;
        hn.cjzo[489] = 1258493700;
        hn.cjzo[490] = -2074089016;
        hn.cjzo[491] = 1494403708;
        hn.cjzo[492] = 1853566955;
        hn.cjzo[493] = -335475534;
        hn.cjzo[494] = -851164310;
        hn.cjzo[495] = 353345866;
        hn.cjzo[496] = 621532207;
        hn.cjzo[497] = -1271254421;
        hn.cjzo[498] = -100430969;
        hn.cjzo[499] = 1463102065;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getAttackRange() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpih", cjzf(int ), (int)571)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpii", cjzm(int ), (int)1245)) break;
            v0 /* !! */  = (long)hn.cjzi("cpij", cjzm(int ), (int)1246);
        }
        var3_1 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(hn.cjzi("cpil", cjzf(int ), (int)573) - hn.cjzi("cpik", cjzf(int ), (int)572));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -841682887: {
                    break block16;
                }
                case 1577412394: {
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpim", cjzf(int ), (int)574));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block17;
                }
                case -646126504: {
                    v3 = hn.cjzi("cpin", cjzf(int ), (int)575);
                    continue block17;
                }
                case 727312130: {
                    v3 = hn.cjzi("cpio", cjzf(int ), (int)576);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = hn.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpip", cjzf(int ), (int)577)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hn.cjzi("cpiq", cjzm(int ), (int)1247)) break;
                    v4 /* !! */  = (long)hn.cjzi("cpir", cjzm(int ), (int)1248);
                }
                return this.attackRange;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpis", cjzm(int ), (int)1249);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hn.cjzi("cpit", cjzm(int ), (int)1250);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpiu", cjzm(int ), (int)1251);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpiv", cjzm(int ), (int)1252);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void inputEvent(cj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cnur", cjzf(int ), (int)207)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hn.cjzi("cnus", cjzm(int ), (int)579)) break;
            v0 /* !! */  = (long)hn.cjzi("cnut", cjzm(int ), (int)580);
        }
        var4_2 = hn.c;
        v1 /* !! */  = hn.fz;
        if (true) ** GOTO lbl11
        block95: while (true) {
            v1 /* !! */  = (long)(v2 - hn.cjzi("cnuu", cjzf(int ), (int)208));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2089388449: {
                    v2 = hn.cjzi("cnuv", cjzf(int ), (int)209);
                    continue block95;
                }
                case -841682887: {
                    break block95;
                }
                case 251080653: {
                    v2 = hn.cjzi("cnuw", cjzf(int ), (int)210);
                    continue block95;
                }
                case 2117219341: {
                    v2 = hn.cjzi("cnux", cjzf(int ), (int)211);
                    continue block95;
                }
            }
            break;
        }
        var3_3 /* !! */  = hn.b;
        v3 /* !! */  = hn.fz;
        if (true) ** GOTO lbl28
        block96: while (true) {
            v3 /* !! */  = (long)(v4 - hn.cjzi("cnuy", cjzf(int ), (int)212));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2073419221: {
                    v4 = hn.cjzi("cnuz", cjzf(int ), (int)213);
                    continue block96;
                }
                case -841682887: {
                    break block96;
                }
                case 333080730: {
                    v4 = hn.cjzi("cnva", cjzf(int ), (int)214);
                    continue block96;
                }
                case 718551689: {
                    v4 = hn.cjzi("cnvb", cjzf(int ), (int)215);
                    continue block96;
                }
            }
            break;
        }
        var2_4 = hn.a;
        if (!var4_2) ** GOTO lbl47
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl47:
                // 1 sources

                if (var2_4 || var2_4) continue block97;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cnvc", cjzf(int ), (int)216)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hn.cjzi("cnvd", cjzm(int ), (int)581)) break;
                    v5 /* !! */  = (long)hn.cjzi("cnve", cjzm(int ), (int)582);
                }
                if (this.target == null) ** GOTO lbl276
                if (var2_4) continue block97;
                v6 /* !! */  = hn.fz;
                if (true) ** GOTO lbl59
                block99: while (true) {
                    v6 /* !! */  = (long)(hn.cjzi("cnvg", cjzf(int ), (int)218) - hn.cjzi("cnvf", cjzf(int ), (int)217));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -841682887: {
                            break block99;
                        }
                        case 353229321: {
                            continue block99;
                        }
                    }
                    break;
                }
                v7 /* !! */  = hn.fz;
                if (true) ** GOTO lbl68
                block100: while (true) {
                    v7 /* !! */  = (long)(v8 - hn.cjzi("cnvh", cjzf(int ), (int)219));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -854517388: {
                            v8 = hn.cjzi("cnvi", cjzf(int ), (int)220);
                            continue block100;
                        }
                        case -841682887: {
                            break block100;
                        }
                        case 848253907: {
                            v8 = hn.cjzi("cnvj", cjzf(int ), (int)221);
                            continue block100;
                        }
                    }
                    break;
                }
                if (this.aimType.isSelected("Funtime")) ** GOTO lbl276
                if (var2_4) continue block97;
                v9 /* !! */  = hn.fz;
                if (true) ** GOTO lbl83
                block101: while (true) {
                    v9 /* !! */  = (long)(hn.cjzi("cnvl", cjzf(int ), (int)223) - hn.cjzi("cnvk", cjzf(int ), (int)222));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1042027800: {
                            continue block101;
                        }
                        case -841682887: {
                            break block101;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cnvm", cjzf(int ), (int)224)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hn.cjzi("cnvn", cjzm(int ), (int)583)) break;
                    v10 /* !! */  = (long)hn.cjzi("cnvo", cjzm(int ), (int)584);
                }
                if (this.aimType.isSelected("FuntimeTest")) ** GOTO lbl276
                if (var2_4) continue block97;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("cnvp", cjzf(int ), (int)225)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hn.cjzi("cnvq", cjzm(int ), (int)585)) break;
                    v11 /* !! */  = (long)hn.cjzi("cnvr", cjzm(int ), (int)586);
                }
                v12 /* !! */  = hn.fz;
                if (true) ** GOTO lbl104
                block104: while (true) {
                    v12 /* !! */  = (long)(v13 - hn.cjzi("cnvs", cjzf(int ), (int)226));
lbl104:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -841682887: {
                            break block104;
                        }
                        case -623379238: {
                            v13 = hn.cjzi("cnvt", cjzf(int ), (int)227);
                            continue block104;
                        }
                        case -461324709: {
                            v13 = hn.cjzi("cnvu", cjzf(int ), (int)228);
                            continue block104;
                        }
                    }
                    break;
                }
                if (this.aimType.isSelected("Legit")) ** GOTO lbl276
                if (var2_4 || var2_4) continue block97;
                v14 /* !! */  = hn.fz;
                if (true) ** GOTO lbl119
                block105: while (true) {
                    v14 /* !! */  = (long)(hn.cjzi("cnvw", cjzf(int ), (int)230) - hn.cjzi("cnvv", cjzf(int ), (int)229));
lbl119:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1524389486: {
                            continue block105;
                        }
                        case -841682887: {
                            break block105;
                        }
                    }
                    break;
                }
                v15 = d.getInstance();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("cnvx", cjzf(int ), (int)231)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hn.cjzi("cnvy", cjzm(int ), (int)587)) break;
                    v16 /* !! */  = (long)hn.cjzi("cnvz", cjzm(int ), (int)588);
                }
                v17 = v15.getManager();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("cnwa", cjzf(int ), (int)232)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hn.cjzi("cnwb", cjzm(int ), (int)589)) break;
                    v18 /* !! */  = (long)hn.cjzi("cnwc", cjzm(int ), (int)590);
                }
                v19 = v17.getAttackPerpetrator();
                v20 /* !! */  = hn.fz;
                if (true) ** GOTO lbl141
                block108: while (true) {
                    v20 /* !! */  = (long)(hn.cjzi("cnwe", cjzf(int ), (int)234) - hn.cjzi("cnwd", cjzf(int ), (int)233));
lbl141:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -841682887: {
                            break block108;
                        }
                        case -321366837: {
                            continue block108;
                        }
                    }
                    break;
                }
                v21 = v19.getAttackHandler();
                v22 /* !! */  = hn.fz;
                if (true) ** GOTO lbl151
                block109: while (true) {
                    v22 /* !! */  = (long)(hn.cjzi("cnwg", cjzf(int ), (int)236) - hn.cjzi("cnwf", cjzf(int ), (int)235));
lbl151:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -841682887: {
                            break block109;
                        }
                        case 1808090803: {
                            continue block109;
                        }
                    }
                    break;
                }
                v23 = this.getConfig();
                v24 = hn.cjzi("cnwh", cjzm(int ), (int)591);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("cnwi", cjzf(int ), (int)237)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == hn.cjzi("cnwj", cjzm(int ), (int)592)) break;
                    v25 /* !! */  = (long)hn.cjzi("cnwk", cjzm(int ), (int)593);
                }
                if (!v21.canAttack(v23, (int)v24)) ** GOTO lbl276
                if (var2_4) continue block97;
                v26 /* !! */  = hn.fz;
                if (true) ** GOTO lbl169
                block111: while (true) {
                    v26 /* !! */  = (long)(v27 - hn.cjzi("cnwl", cjzf(int ), (int)238));
lbl169:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2005385783: {
                            v27 = hn.cjzi("cnwm", cjzf(int ), (int)239);
                            continue block111;
                        }
                        case -1980743557: {
                            v27 = hn.cjzi("cnwn", cjzf(int ), (int)240);
                            continue block111;
                        }
                        case -841682887: {
                            break block111;
                        }
                    }
                    break;
                }
                v28 /* !! */  = hn.fz;
                if (true) ** GOTO lbl182
                block112: while (true) {
                    v28 /* !! */  = (long)(hn.cjzi("cnwp", cjzf(int ), (int)242) - hn.cjzi("cnwo", cjzf(int ), (int)241));
lbl182:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -841682887: {
                            break block112;
                        }
                        case -532491834: {
                            continue block112;
                        }
                    }
                    break;
                }
                v29 = hn.mc.field_1724;
                v30 /* !! */  = hn.fz;
                if (true) ** GOTO lbl192
                block113: while (true) {
                    v30 /* !! */  = (long)(v31 - hn.cjzi("cnwq", cjzf(int ), (int)243));
lbl192:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1066035361: {
                            v31 = hn.cjzi("cnwr", cjzf(int ), (int)244);
                            continue block113;
                        }
                        case -841682887: {
                            break block113;
                        }
                        case 380294168: {
                            v31 = hn.cjzi("cnws", cjzf(int ), (int)245);
                            continue block113;
                        }
                        case 1380655640: {
                            v31 = hn.cjzi("cnwt", cjzf(int ), (int)246);
                            continue block113;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("cnwu", cjzf(int ), (int)247)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == hn.cjzi("cnwv", cjzm(int ), (int)594)) break;
                    v32 /* !! */  = (long)hn.cjzi("cnww", cjzm(int ), (int)595);
                }
                v33 = v29.method_5739((class_1297)this.target);
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_8 = hn.fz - hn.cjzi("cnwx", cjzf(int ), (int)248)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == hn.cjzi("cnwy", cjzm(int ), (int)596)) break;
                    v34 /* !! */  = (long)hn.cjzi("cnwz", cjzm(int ), (int)597);
                }
                if (!(v33 <= this.attackDistance() + hn.cjzi("cnxa", ckbd(int ), (int)598))) ** GOTO lbl276
                if (var2_4) continue block97;
                v35 /* !! */  = hn.fz;
                if (true) ** GOTO lbl221
                block116: while (true) {
                    v35 /* !! */  = (long)(hn.cjzi("cnxc", cjzf(int ), (int)250) - hn.cjzi("cnxb", cjzf(int ), (int)249));
lbl221:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -841682887: {
                            break block116;
                        }
                        case 1075469378: {
                            continue block116;
                        }
                    }
                    break;
                }
                v36 /* !! */  = hn.fz;
                if (true) ** GOTO lbl230
                block117: while (true) {
                    v36 /* !! */  = (long)(hn.cjzi("cnxe", cjzf(int ), (int)252) - hn.cjzi("cnxd", cjzf(int ), (int)251));
lbl230:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -2134376608: {
                            continue block117;
                        }
                        case -841682887: {
                            break block117;
                        }
                    }
                    break;
                }
                v37 = hn.mc.field_1724;
                v38 /* !! */  = hn.fz;
                if (true) ** GOTO lbl240
                block118: while (true) {
                    v38 /* !! */  = (long)(hn.cjzi("cnxg", cjzf(int ), (int)254) - hn.cjzi("cnxf", cjzf(int ), (int)253));
lbl240:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -841682887: {
                            break block118;
                        }
                        case -246078778: {
                            continue block118;
                        }
                    }
                    break;
                }
                if (v37.method_5869()) ** GOTO lbl276
                if (var2_4) continue block97;
                v39 /* !! */  = hn.fz;
                if (true) ** GOTO lbl251
                block119: while (true) {
                    v39 /* !! */  = (long)(v40 - hn.cjzi("cnxh", cjzf(int ), (int)255));
lbl251:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1571611067: {
                            v40 = hn.cjzi("cnxi", cjzf(int ), (int)256);
                            continue block119;
                        }
                        case -856508749: {
                            v40 = hn.cjzi("cnxj", cjzf(int ), (int)257);
                            continue block119;
                        }
                        case -841682887: {
                            break block119;
                        }
                        case 2063578910: {
                            v40 = hn.cjzi("cnxk", cjzf(int ), (int)258);
                            continue block119;
                        }
                    }
                    break;
                }
                if (!os.clickSpam) {
                    if (var2_4 || var2_4) continue block97;
                    v41 = hn.cjzi("cnxl", cjzm(int ), (int)599);
                    v42 = hn.cjzi("cnxm", cjzm(int ), (int)600);
                    v43 = hn.cjzi("cnxn", cjzm(int ), (int)601);
                    v44 = hn.cjzi("cnxo", cjzm(int ), (int)602);
                    while (true) {
                        if ((v45 /* !! */  = (cfr_temp_9 = hn.fz - hn.cjzi("cnxp", cjzf(int ), (int)259)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v45 /* !! */  == hn.cjzi("cnxq", cjzm(int ), (int)603)) break;
                        v45 /* !! */  = (long)hn.cjzi("cnxr", cjzm(int ), (int)604);
                    }
                    var1_1.setDirectionalLow((boolean)v41, (boolean)v42, (boolean)v43, (boolean)v44);
                    if (var2_4) continue block97;
                }
lbl276:
                // 10 sources

                if (!var2_4 && !var2_4) ** break;
                continue block97;
                return;
lbl279:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxs", cjzm(int ), (int)605);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl313
                }
                case 1: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxt", cjzm(int ), (int)606);
                    if (!var4_2) break block97;
                    throw null;
                }
lbl288:
                // 3 sources

                case 2: {
                    do {
                        var3_3 /* !! */  = (int)hn.cjzi("cnxu", cjzm(int ), (int)607);
                    } while (!var4_2);
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxv", cjzm(int ), (int)608);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl297:
                // 4 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)hn.cjzi("cnxw", cjzm(int ), (int)609);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl308
                        break;
                    }
                }
                case 5: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxx", cjzm(int ), (int)610);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl345
                }
lbl308:
                // 2 sources

                case 6: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxy", cjzm(int ), (int)611);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl327
                }
lbl313:
                // 2 sources

                case 7: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnxz", cjzm(int ), (int)612);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl341
                }
                case 8: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnya", cjzm(int ), (int)613);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl337
                }
                case 9: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyb", cjzm(int ), (int)614);
                    if (!var4_2) ** GOTO lbl288
                    throw null;
                }
lbl327:
                // 2 sources

                case 10: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyc", cjzm(int ), (int)615);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl337
                }
                case 11: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyd", cjzm(int ), (int)616);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl345
                }
lbl337:
                // 4 sources

                case 12: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnye", cjzm(int ), (int)617);
                    if (!var4_2) ** GOTO lbl297
                    throw null;
                }
lbl341:
                // 2 sources

                case 13: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyf", cjzm(int ), (int)618);
                    if (!var4_2) ** GOTO lbl288
                    throw null;
                }
lbl345:
                // 3 sources

                case 14: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyg", cjzm(int ), (int)619);
                    if (!var4_2) ** GOTO lbl337
                    throw null;
                }
                case 15: {
                    var3_3 /* !! */  = (int)hn.cjzi("cnyh", cjzm(int ), (int)620);
                    if (!var4_2) ** GOTO lbl279
                    throw null;
                }
                case 16: 
            }
        }
        var3_3 /* !! */  = (int)hn.cjzi("cnyi", cjzm(int ), (int)621);
        ** while (!var4_2)
lbl356:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ Boolean lambda$new$7() {
        block41: {
            v0 /* !! */  = hn.fz;
            if (true) ** GOTO lbl5
            block27: while (true) {
                v0 /* !! */  = (long)(v1 - hn.cjzi("cqgk", cjzf(int ), (int)728));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1118463056: {
                        v1 = hn.cjzi("cqgl", cjzf(int ), (int)729);
                        continue block27;
                    }
                    case -841682887: {
                        break block27;
                    }
                    case 303407651: {
                        v1 = hn.cjzi("cqgm", cjzf(int ), (int)730);
                        continue block27;
                    }
                    case 984150657: {
                        v1 = hn.cjzi("cqgn", cjzf(int ), (int)731);
                        continue block27;
                    }
                }
                break;
            }
            var3_1 = hn.c;
            while (true) {
                block42: {
                    if ((v2 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cqgo", cjzf(int ), (int)732)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != hn.cjzi("cqgp", cjzm(int ), (int)1405)) break block42;
                    var2_2 /* !! */  = hn.b;
                    v3 /* !! */  = hn.fz;
                    if (true) ** GOTO lbl30
                }
                v2 /* !! */  = (long)hn.cjzi("cqgq", cjzm(int ), (int)1406);
            }
            block29: while (true) {
                v3 /* !! */  = (long)(v4 - hn.cjzi("cqgr", cjzf(int ), (int)733));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1559141475: {
                        v4 = hn.cjzi("cqgt", cjzf(int ), (int)734);
                        continue block29;
                    }
                    case -841682887: {
                        break block29;
                    }
                    case -436994761: {
                        v4 = hn.cjzi("cqgu", cjzf(int ), (int)735);
                        continue block29;
                    }
                    case 635589750: {
                        v4 = hn.cjzi("cqgw", cjzf(int ), (int)736);
                        continue block29;
                    }
                }
                break;
            }
            var1_3 = hn.a;
            if (var3_1) {
                throw null;
            }
            if (!var1_3 && !var1_3) ** GOTO lbl50
            if (var2_2 /* !! */  == 0) return null;
            switch (var2_2 /* !! */ ) {
                default: {
                    return null;
                }
lbl50:
                // 1 sources

                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cqgy", cjzf(int ), (int)737)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hn.cjzi("cqgz", cjzm(int ), (int)1407)) {
                        v6 /* !! */  = hn.fz;
                        break block41;
                    }
                    v5 /* !! */  = (long)hn.cjzi("cqhb", cjzm(int ), (int)1408);
                }
                case 1: {
                    ** GOTO lbl64
                }
                case 3: {
                    var2_2 /* !! */  = (int)hn.cjzi("cqhp", cjzm(int ), (int)1412);
                    if (var3_1) {
                        throw null;
                    }
lbl64:
                    // 3 sources

                    var2_2 /* !! */  = (int)hn.cjzi("cqhm", cjzm(int ), (int)1410);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)hn.cjzi("cqhn", cjzm(int ), (int)1411);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: 
            }
            do {
                var2_2 /* !! */  = (int)hn.cjzi("cqhk", cjzm(int ), (int)1409);
            } while (!var3_1);
            throw null;
        }
        block32: while (true) {
            switch ((int)v6 /* !! */ ) {
                case -841682887: {
                    break block32;
                }
                case 2012193592: {
                    v6 /* !! */  = (long)(hn.cjzi("cqhe", cjzf(int ), (int)739) - hn.cjzi("cqhc", cjzf(int ), (int)738));
                    continue block32;
                }
            }
            break;
        }
        v7 = this.autoMace.isValue();
        v8 /* !! */  = hn.fz;
        if (true) ** GOTO lbl89
        block33: while (true) {
            v8 /* !! */  = (long)(v9 - hn.cjzi("cqhg", cjzf(int ), (int)740));
lbl89:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1772821844: {
                    v9 = hn.cjzi("cqhh", cjzf(int ), (int)741);
                    continue block33;
                }
                case -1077028810: {
                    v9 = hn.cjzi("cqhj", cjzf(int ), (int)742);
                    continue block33;
                }
                case -841682887: {
                    return v7;
                }
            }
            break;
        }
        return v7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1309 updateTarget() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block70: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cogs", cjzf(int ), (int)303));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block70;
                }
                case -595854198: {
                    v1 = hn.cjzi("cogt", cjzf(int ), (int)304);
                    continue block70;
                }
                case 156774301: {
                    v1 = hn.cjzi("cogu", cjzf(int ), (int)305);
                    continue block70;
                }
            }
            break;
        }
        var5_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block71: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cogv", cjzf(int ), (int)306));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841682887: {
                    break block71;
                }
                case -537637593: {
                    v3 = hn.cjzi("cogw", cjzf(int ), (int)307);
                    continue block71;
                }
                case 287130094: {
                    v3 = hn.cjzi("cogx", cjzf(int ), (int)308);
                    continue block71;
                }
            }
            break;
        }
        var4_2 = hn.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cogy", cjzf(int ), (int)309)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hn.cjzi("cogz", cjzm(int ), (int)796)) break;
            v4 /* !! */  = (long)hn.cjzi("coha", cjzm(int ), (int)797);
        }
        var3_3 = hn.a;
        if (var5_1) {
            throw null;
lbl37:
            // 5 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cohb", cjzf(int ), (int)310)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hn.cjzi("cohc", cjzm(int ), (int)798)) break;
            v5 /* !! */  = (long)hn.cjzi("cohd", cjzm(int ), (int)799);
        }
        v6 /* !! */  = hn.fz;
        if (true) ** GOTO lbl49
        block75: while (true) {
            v6 /* !! */  = (long)(v7 - hn.cjzi("cohe", cjzf(int ), (int)311));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1703338649: {
                    v7 = hn.cjzi("cohf", cjzf(int ), (int)312);
                    continue block75;
                }
                case -890772039: {
                    v7 = hn.cjzi("cohg", cjzf(int ), (int)313);
                    continue block75;
                }
                case -841682887: {
                    break block75;
                }
                case 1367424887: {
                    v7 = hn.cjzi("cohh", cjzf(int ), (int)314);
                    continue block75;
                }
            }
            break;
        }
        v8 /* !! */  = hn.fz;
        if (true) ** GOTO lbl65
        block76: while (true) {
            v8 /* !! */  = (long)(v9 - hn.cjzi("cohi", cjzf(int ), (int)315));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1282417717: {
                    v9 = hn.cjzi("cohj", cjzf(int ), (int)316);
                    continue block76;
                }
                case -841682887: {
                    break block76;
                }
                case -428819817: {
                    v9 = hn.cjzi("cohk", cjzf(int ), (int)317);
                    continue block76;
                }
            }
            break;
        }
        v10 = this.targetType.getSelected();
        v11 /* !! */  = hn.fz;
        if (true) ** GOTO lbl79
        block77: while (true) {
            v11 /* !! */  = (long)(v12 - hn.cjzi("cohl", cjzf(int ), (int)318));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -841682887: {
                    break block77;
                }
                case -641558661: {
                    v12 = hn.cjzi("cohm", cjzf(int ), (int)319);
                    continue block77;
                }
                case 676967410: {
                    v12 = hn.cjzi("cohn", cjzf(int ), (int)320);
                    continue block77;
                }
            }
            break;
        }
        var1_4 = new ik$EntityFilter(v10);
        if (var3_3 || var3_3) ** GOTO lbl37
        var2_5 = hn.cjzi("coho", ckbd(int ), (int)800);
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = hn.fz - hn.cjzi("cohp", cjzf(int ), (int)321)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hn.cjzi("cohq", cjzm(int ), (int)801)) break;
            v13 /* !! */  = (long)hn.cjzi("cohr", cjzm(int ), (int)802);
        }
        v14 /* !! */  = hn.fz;
        if (true) ** GOTO lbl101
        block79: while (true) {
            v14 /* !! */  = (long)(v15 - hn.cjzi("cohs", cjzf(int ), (int)322));
lbl101:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1948665688: {
                    v15 = hn.cjzi("coht", cjzf(int ), (int)323);
                    continue block79;
                }
                case -1146278792: {
                    v15 = hn.cjzi("cohu", cjzf(int ), (int)324);
                    continue block79;
                }
                case -841682887: {
                    break block79;
                }
            }
            break;
        }
        v16 /* !! */  = hn.fz;
        if (true) ** GOTO lbl114
        block80: while (true) {
            v16 /* !! */  = (long)(v17 - hn.cjzi("cohv", cjzf(int ), (int)325));
lbl114:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1148365566: {
                    v17 = hn.cjzi("cohw", cjzf(int ), (int)326);
                    continue block80;
                }
                case -841682887: {
                    break block80;
                }
                case -270877329: {
                    v17 = hn.cjzi("cohx", cjzf(int ), (int)327);
                    continue block80;
                }
                case 73144880: {
                    v17 = hn.cjzi("cohy", cjzf(int ), (int)328);
                    continue block80;
                }
            }
            break;
        }
        v18 = hn.mc.field_1687;
        v19 /* !! */  = hn.fz;
        if (true) ** GOTO lbl131
        block81: while (true) {
            v19 /* !! */  = (long)(v20 - hn.cjzi("cohz", cjzf(int ), (int)329));
lbl131:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -841682887: {
                    break block81;
                }
                case 203128749: {
                    v20 = hn.cjzi("coia", cjzf(int ), (int)330);
                    continue block81;
                }
                case 1616012556: {
                    v20 = hn.cjzi("coib", cjzf(int ), (int)331);
                    continue block81;
                }
            }
            break;
        }
        v21 = v18.method_18112();
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_3 = hn.fz - hn.cjzi("coic", cjzf(int ), (int)332)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hn.cjzi("coid", cjzm(int ), (int)803)) break;
            v22 /* !! */  = (long)hn.cjzi("coie", cjzm(int ), (int)804);
        }
        v23 = this.finalDistance();
        v24 /* !! */  = hn.fz;
        if (true) ** GOTO lbl151
        block83: while (true) {
            v24 /* !! */  = (long)(v25 - hn.cjzi("coif", cjzf(int ), (int)333));
lbl151:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -2019803520: {
                    v25 = hn.cjzi("coig", cjzf(int ), (int)334);
                    continue block83;
                }
                case -1276109725: {
                    v25 = hn.cjzi("coih", cjzf(int ), (int)335);
                    continue block83;
                }
                case -841682887: {
                    break block83;
                }
                case 885103962: {
                    v25 = hn.cjzi("coii", cjzf(int ), (int)336);
                    continue block83;
                }
            }
            break;
        }
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_4 = hn.fz - hn.cjzi("coij", cjzf(int ), (int)337)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == hn.cjzi("coik", cjzm(int ), (int)805)) break;
            v26 /* !! */  = (long)hn.cjzi("coil", cjzm(int ), (int)806);
        }
        v27 = this.options.isSelected("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b");
        v28 /* !! */  = hn.fz;
        if (true) ** GOTO lbl173
        block85: while (true) {
            v28 /* !! */  = (long)(v29 - hn.cjzi("coim", cjzf(int ), (int)338));
lbl173:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1888478707: {
                    v29 = hn.cjzi("coin", cjzf(int ), (int)339);
                    continue block85;
                }
                case -1041419282: {
                    v29 = hn.cjzi("coio", cjzf(int ), (int)340);
                    continue block85;
                }
                case -841682887: {
                    break block85;
                }
                case -241208512: {
                    v29 = hn.cjzi("coip", cjzf(int ), (int)341);
                    continue block85;
                }
            }
            break;
        }
        this.targetSelector.searchTargets(v21, v23, (float)var2_5, v27);
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_5 = hn.fz - hn.cjzi("coiq", cjzf(int ), (int)342)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == hn.cjzi("coir", cjzm(int ), (int)807)) break;
            v30 /* !! */  = (long)hn.cjzi("cois", cjzm(int ), (int)808);
        }
        v31 = var1_4;
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_6 = hn.fz - hn.cjzi("coit", cjzf(int ), (int)343)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == hn.cjzi("coiu", cjzm(int ), (int)809)) break;
            v32 /* !! */  = (long)hn.cjzi("coiv", cjzm(int ), (int)810);
        }
        Objects.requireNonNull(v31);
        v33 /* !! */  = hn.fz;
        if (true) ** GOTO lbl203
        block88: while (true) {
            v33 /* !! */  = (long)(v34 - hn.cjzi("coiw", cjzf(int ), (int)344));
lbl203:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -1900839236: {
                    v34 = hn.cjzi("coix", cjzf(int ), (int)345);
                    continue block88;
                }
                case -841682887: {
                    break block88;
                }
                case -774776315: {
                    v34 = hn.cjzi("coiy", cjzf(int ), (int)346);
                    continue block88;
                }
            }
            break;
        }
        v35 = (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isValid(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)((ik$EntityFilter)v31);
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_7 = hn.fz - hn.cjzi("coiz", cjzf(int ), (int)347)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == hn.cjzi("coja", cjzm(int ), (int)811)) break;
            v36 /* !! */  = (long)hn.cjzi("cojb", cjzm(int ), (int)812);
        }
        this.targetSelector.validateTarget(v35);
        ** while (var3_3 || var3_3)
lbl220:
        // 1 sources

        v37 /* !! */  = hn.fz;
        if (true) ** GOTO lbl224
        block90: while (true) {
            v37 /* !! */  = (long)(v38 - hn.cjzi("cojc", cjzf(int ), (int)348));
lbl224:
            // 2 sources

            switch ((int)v37 /* !! */ ) {
                case -1718775227: {
                    v38 = hn.cjzi("cojd", cjzf(int ), (int)349);
                    continue block90;
                }
                case -841682887: {
                    break block90;
                }
                case -609448191: {
                    v38 = hn.cjzi("coje", cjzf(int ), (int)350);
                    continue block90;
                }
                case -578765643: {
                    v38 = hn.cjzi("cojf", cjzf(int ), (int)351);
                    continue block90;
                }
            }
            break;
        }
        v39 /* !! */  = hn.fz;
        if (true) ** GOTO lbl240
        block91: while (true) {
            v39 /* !! */  = (long)(v40 - hn.cjzi("cojg", cjzf(int ), (int)352));
lbl240:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case -841682887: {
                    break block91;
                }
                case -785116340: {
                    v40 = hn.cjzi("cojh", cjzf(int ), (int)353);
                    continue block91;
                }
                case 1837092486: {
                    v40 = hn.cjzi("coji", cjzf(int ), (int)354);
                    continue block91;
                }
            }
            break;
        }
        return this.targetSelector.getCurrentTarget();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hn() {
        var2_1 /* !! */  = hn.b;
        var1_2 = hn.a;
        super("KillAura", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u044c\u0435\u0442 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439 \u0432\u043e\u043a\u0440\u0443\u0433", du.RAGE);
        this.targetSelector = new ik();
        this.pointFinder = new ox();
        this.spookyTimeSmooth = new ii();
        this.funTimeRotation = new ib();
        this.funtime222Smooth = new ic();
        this.funtimeTestSmooth = new id();
        this.holyworldSmooth = new ie();
        this.divineSmooth = new ia();
        this.testSmooth = new ij();
        this.legitSmooth = new if();
        this.aimType = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u043e\u0440 \u0442\u0438\u043f\u0430 \u0440\u043e\u0442\u0430\u0446\u0438\u0438", "ReallyWorld", new String[]{"ReallyWorld", "Snap", "SpookyTime", "Funtime", "Legit"});
        this.legitAimSpeed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043d\u0430\u0432\u043e\u0434\u043a\u0438", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043b\u0430\u0432\u043d\u043e\u0433\u043e \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u044f \u0432 \u0440\u0435\u0436\u0438\u043c\u0435 Legit", (float)hn.cjzi("ckbf", ckbd(int ), (int)6)).range((float)hn.cjzi("ckbg", ckbd(int ), (int)7), (float)hn.cjzi("ckbh", ckbd(int ), (int)8)).step((float)hn.cjzi("ckbi", ckbd(int ), (int)9)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((hn)this));
        this.legitPitch = new kb("\u041d\u0430\u0432\u043e\u0434\u043a\u0430 \u043f\u043e Pitch", "\u041f\u043b\u0430\u0432\u043d\u043e \u043d\u0430\u0432\u043e\u0434\u0438\u0442\u044c \u043a\u0430\u043c\u0435\u0440\u0443 \u043d\u0430 \u0446\u0435\u043b\u044c \u043f\u043e \u0432\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u0438").setValue((boolean)hn.cjzi("ckbj", cjzm(int ), (int)10)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((hn)this));
        this.legitMiss = new kb("\u041f\u0440\u043e\u043c\u0430\u0445\u0438\u0432\u0430\u0442\u044c\u0441\u044f", "\u0418\u043d\u043e\u0433\u0434\u0430 \u0434\u0435\u043b\u0430\u0442\u044c \u0432\u0437\u043c\u0430\u0445 \u0431\u0435\u0437 \u0443\u0434\u0430\u0440\u0430 \u043f\u043e \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u0443").setValue((boolean)hn.cjzi("ckbk", cjzm(int ), (int)11)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$2(), ()Ljava/lang/Boolean;)((hn)this));
        this.attackRange = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u043e\u0432", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043b\u044f \u0430\u0442\u0430\u043a\u0438", (float)hn.cjzi("ckbo", ckbd(int ), (int)12)).range((float)hn.cjzi("ckbp", ckbd(int ), (int)13), (float)hn.cjzi("ckbq", ckbd(int ), (int)14)).step((float)hn.cjzi("ckbs", ckbd(int ), (int)15));
        this.sprintMode = new kf("\u0421\u043f\u0440\u0438\u043d\u0442", "\u0421\u0431\u0440\u043e\u0441 \u0441\u043f\u0440\u0438\u043d\u0442\u0430 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435: HolyWorld \u2014 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e \u0437\u0430 1\u20133 \u0442\u0438\u043a\u0430, ReallyWorld \u2014 \u0441\u0438\u043d\u0445\u0440\u043e\u043d\u043d\u044b\u0439 W-tap", "\u041f\u0430\u043a\u0435\u0442", new String[]{"\u041f\u0430\u043a\u0435\u0442", "\u041b\u0435\u0433\u0438\u0442", "HolyWorld", "ReallyWorld", "\u041d\u0435 \u0441\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u0442\u044c"});
        this.clickType = new kf("\u0420\u0435\u0436\u0438\u043c \u043a\u043b\u0438\u043a\u043e\u0432", "\u0412\u044b\u0431\u043e\u0440 \u0442\u0438\u043f\u0430 \u043a\u043b\u0438\u043a\u043e\u0432", "1.9+", new String[]{"1.8", "1.9+"});
        this.cpsValue = new kg("\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043a\u043f\u0441", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0437\u0430\u043a\u043b\u0438\u043a\u0430", (float)hn.cjzi("ckby", ckbd(int ), (int)16)).range((float)hn.cjzi("ckca", ckbd(int ), (int)17), (float)hn.cjzi("ckcc", ckbd(int ), (int)18)).step((float)hn.cjzi("ckcd", ckbd(int ), (int)19)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$3(), ()Ljava/lang/Boolean;)((hn)this));
        this.lookrange = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043f\u043e\u0438\u0441\u043a\u0430", "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0434\u043b\u044f \u043f\u043e\u0438\u0441\u043a\u0430 \u0442\u0430\u0440\u0433\u0435\u0442\u0430", (float)hn.cjzi("ckcf", ckbd(int ), (int)20)).range((float)hn.cjzi("ckch", ckbd(int ), (int)21), (float)hn.cjzi("ckcj", ckbd(int ), (int)22));
        this.targetType = new ke("\u0412\u044b\u0431\u043e\u0440 \u0442\u0430\u0440\u0433\u0435\u0442\u043e\u0432", "\u0422\u0438\u043f\u044b \u0446\u0435\u043b\u0435\u0439 \u0434\u043b\u044f \u0430\u0442\u0430\u043a\u0438").value(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438", "\u0413\u043e\u043b\u044b\u0435", "\u041c\u043e\u0431\u044b", "\u0414\u0440\u0443\u0437\u044c\u044f"}).selected(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438"});
        this.options = new ke("\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438", "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u044b \u043c\u043e\u0434\u0443\u043b\u044f").value(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438", "\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", "\u041e\u0442\u0436\u0438\u043c\u0430\u0442\u044c \u0449\u0438\u0442", "\u041b\u043e\u043c\u0430\u0442\u044c \u0449\u0438\u0442"}).selected(new String[]{"\u041d\u0435 \u0431\u0438\u0442\u044c \u043f\u0440\u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438"});
        this.rwWallBypass = new kb("\u0423\u0434\u0430\u0440\u044b \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u0443 RW", "\u041e\u0431\u0445\u043e\u0434\u0438\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u043d\u0443\u044e \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0443 \u0443\u0434\u0430\u0440\u0430 \u0447\u0435\u0440\u0435\u0437 \u0431\u043b\u043e\u043a\u0438 \u043d\u0430 ReallyWorld").setValue((boolean)hn.cjzi("ckct", cjzm(int ), (int)23)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$4(), ()Ljava/lang/Boolean;)((hn)this));
        this.movementCorrection = new kf("\u041a\u043e\u0440\u0440\u0435\u043a\u0446\u0438\u044f \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f", "\u0421\u043f\u043e\u0441\u043e\u0431 \u043a\u043e\u0440\u0440\u0435\u043a\u0446\u0438\u0438 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u044f", "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f", new String[]{"\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f", "\u0421\u0444\u043e\u043a\u0443\u0441\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u0430\u044f"});
        this.smartCriticals = new kb("\u0423\u043c\u043d\u044b\u0435 \u043a\u0440\u0438\u0442\u044b", "\u0420\u0430\u0437\u0440\u0435\u0448\u0430\u0435\u0442 \u043e\u0431\u044b\u0447\u043d\u044b\u0439 \u0443\u0434\u0430\u0440, \u0435\u0441\u043b\u0438 \u043f\u0440\u044b\u0436\u043e\u043a \u043d\u0435 \u0431\u044b\u043b \u043d\u0430\u0436\u0430\u0442").setValue((boolean)hn.cjzi("ckcz", cjzm(int ), (int)24)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$5(), ()Ljava/lang/Boolean;)((hn)this));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.tpsSync = new kb("TPSSync", "\u0421\u0438\u043d\u0445\u0440\u043e\u043d\u0438\u0437\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0432\u043e\u0441\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u0443\u0434\u0430\u0440\u0430 \u0441 TPS \u0441\u0435\u0440\u0432\u0435\u0440\u0430").setValue((boolean)hn.cjzi("ckdd", cjzm(int ), (int)25)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$6(), ()Ljava/lang/Boolean;)((hn)this));
                this.autoMace = new kb("\u0410\u0432\u0442\u043e \u0431\u0443\u043b\u0430\u0432\u0430", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u044c\u0451\u0442 \u0431\u0443\u043b\u0430\u0432\u043e\u0439 \u043f\u0440\u0438 \u043f\u0430\u0434\u0435\u043d\u0438\u0438").setValue((boolean)hn.cjzi("ckdg", cjzm(int ), (int)26));
                this.maceMinFall = new kg("\u041c\u0438\u043d. \u043f\u0430\u0434\u0435\u043d\u0438\u0435", "\u041c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0432\u044b\u0441\u043e\u0442\u0430 \u043f\u0430\u0434\u0435\u043d\u0438\u044f \u0434\u043b\u044f \u0443\u0434\u0430\u0440\u0430 \u0431\u0443\u043b\u0430\u0432\u043e\u0439", (float)hn.cjzi("ckdi", ckbd(int ), (int)27)).range((float)hn.cjzi("ckdk", ckbd(int ), (int)28), (float)hn.cjzi("ckdl", ckbd(int ), (int)29)).step((float)hn.cjzi("ckdm", ckbd(int ), (int)30)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$7(), ()Ljava/lang/Boolean;)((hn)this));
                this.maceReturnSlot = new kb("\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0442\u044c \u0441\u043b\u043e\u0442", "\u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0442\u044c\u0441\u044f \u043d\u0430 \u043f\u0440\u043e\u0448\u043b\u044b\u0439 \u0441\u043b\u043e\u0442 \u043f\u043e\u0441\u043b\u0435 \u0443\u0434\u0430\u0440\u0430").setValue((boolean)hn.cjzi("ckdp", cjzm(int ), (int)31)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$8(), ()Ljava/lang/Boolean;)((hn)this));
                this.maximumDamage = new kb("\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u0439 \u0443\u0440\u043e\u043d", "\u041d\u0430 \u043c\u043e\u043c\u0435\u043d\u0442 \u0443\u0434\u0430\u0440\u0430 \u043c\u0435\u043d\u044f\u0435\u0442 \u043e\u0431\u044b\u0447\u043d\u0443\u044e \u0441\u0444\u0435\u0440\u0443 \u0432 \u043e\u0444\u0444\u0445\u0435\u043d\u0434\u0435 \u043d\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u0443\u044e").setValue((boolean)hn.cjzi("ckds", cjzm(int ), (int)32)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$9(), ()Ljava/lang/Boolean;)());
                this.damageSphere = new kf("\u0410\u0440\u0442\u0435\u0444\u0430\u043a\u0442 \u0434\u043b\u044f \u0443\u0434\u0430\u0440\u0430", "\u0421\u0444\u0435\u0440\u0430 \u0438\u043b\u0438 \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d, \u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u043c\u044b\u0435 \u0432 \u043e\u0444\u0444\u0445\u0435\u043d\u0434 \u043d\u0430 \u043c\u043e\u043c\u0435\u043d\u0442 \u0430\u0442\u0430\u043a\u0438", "\u0421\u0444\u0435\u0440\u0430 \u0410\u0440\u0435\u0441\u0430", new String[]{"\u0421\u0444\u0435\u0440\u0430 \u0410\u0440\u0435\u0441\u0430", "\u0421\u0444\u0435\u0440\u0430 \u0410\u0444\u0438\u043d\u044b", "\u0421\u0444\u0435\u0440\u0430 \u0422\u0438\u0442\u0430\u043d\u0430", "\u0421\u0444\u0435\u0440\u0430 \u0425\u0430\u043e\u0441\u0430", "\u0421\u0444\u0435\u0440\u0430 \u0421\u0430\u0442\u0438\u0440\u0430", "\u0421\u0444\u0435\u0440\u0430 \u0411\u0435\u0441\u0442\u0438\u0438", "\u0421\u0444\u0435\u0440\u0430 \u0413\u0438\u0434\u0440\u044b", "\u0421\u0444\u0435\u0440\u0430 \u0418\u043a\u0430\u0440\u0430", "\u0421\u0444\u0435\u0440\u0430 \u042d\u0440\u0438\u0434\u0430", "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u041a\u0430\u0440\u0430\u0442\u0435\u043b\u044f", "\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d \u042f\u0440\u043e\u0441\u0442\u0438"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$10(), ()Ljava/lang/Boolean;)());
                this.settings(new jx[]{this.aimType, this.legitAimSpeed, this.legitPitch, this.legitMiss, this.attackRange, this.lookrange, this.targetType, this.options, this.rwWallBypass, this.movementCorrection, this.smartCriticals, this.tpsSync, this.sprintMode, this.clickType, this.cpsValue, this.autoMace, this.maceMinFall, this.maceReturnSlot});
                return;
            }
lbl39:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)hn.cjzi("cken", cjzm(int ), (int)33);
                ** GOTO lbl76
            }
lbl42:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)hn.cjzi("ckep", cjzm(int ), (int)34);
                ** GOTO lbl133
            }
            case 2: {
                var2_1 /* !! */  = (int)hn.cjzi("cker", cjzm(int ), (int)35);
                ** GOTO lbl39
            }
            case 3: {
                var2_1 /* !! */  = (int)hn.cjzi("ckeu", cjzm(int ), (int)36);
                ** GOTO lbl66
            }
lbl51:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)hn.cjzi("ckew", cjzm(int ), (int)37);
                ** GOTO lbl106
            }
lbl54:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)hn.cjzi("ckey", cjzm(int ), (int)38);
                ** GOTO lbl76
            }
lbl57:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfa", cjzm(int ), (int)39);
                ** GOTO lbl66
            }
lbl60:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfc", cjzm(int ), (int)40);
                ** GOTO lbl85
            }
lbl63:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)hn.cjzi("ckff", cjzm(int ), (int)41);
                ** GOTO lbl127
            }
lbl66:
            // 3 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hn.cjzi("ckfh", cjzm(int ), (int)42);
                    ** GOTO lbl63
                    break;
                }
            }
            case 10: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfj", cjzm(int ), (int)43);
                ** GOTO lbl60
            }
lbl73:
            // 3 sources

            case 11: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfk", cjzm(int ), (int)44);
                ** GOTO lbl63
            }
lbl76:
            // 4 sources

            case 12: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfn", cjzm(int ), (int)45);
                ** GOTO lbl88
            }
            case 13: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfp", cjzm(int ), (int)46);
                ** GOTO lbl109
            }
            case 14: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfr", cjzm(int ), (int)47);
                ** GOTO lbl57
            }
lbl85:
            // 3 sources

            case 15: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfu", cjzm(int ), (int)48);
                ** GOTO lbl73
            }
lbl88:
            // 3 sources

            case 16: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfw", cjzm(int ), (int)49);
                ** GOTO lbl133
            }
lbl91:
            // 2 sources

            case 17: {
                var2_1 /* !! */  = (int)hn.cjzi("ckfy", cjzm(int ), (int)50);
                ** GOTO lbl73
            }
            case 18: {
                var2_1 /* !! */  = (int)hn.cjzi("ckga", cjzm(int ), (int)51);
                ** GOTO lbl136
            }
            case 19: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgc", cjzm(int ), (int)52);
                ** GOTO lbl109
            }
            case 20: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgd", cjzm(int ), (int)53);
                ** GOTO lbl54
            }
            case 21: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgf", cjzm(int ), (int)54);
                ** GOTO lbl121
            }
lbl106:
            // 3 sources

            case 22: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgh", cjzm(int ), (int)55);
                ** GOTO lbl57
            }
lbl109:
            // 3 sources

            case 23: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgi", cjzm(int ), (int)56);
                ** GOTO lbl76
            }
            case 24: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgj", cjzm(int ), (int)57);
                ** GOTO lbl106
            }
lbl115:
            // 2 sources

            case 25: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgk", cjzm(int ), (int)58);
                ** GOTO lbl85
            }
            case 26: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgl", cjzm(int ), (int)59);
                ** GOTO lbl39
            }
lbl121:
            // 2 sources

            case 27: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgm", cjzm(int ), (int)60);
                ** GOTO lbl60
            }
            case 28: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgn", cjzm(int ), (int)61);
                ** GOTO lbl51
            }
lbl127:
            // 2 sources

            case 29: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgo", cjzm(int ), (int)62);
                ** GOTO lbl42
            }
            case 30: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgp", cjzm(int ), (int)63);
                ** GOTO lbl88
            }
lbl133:
            // 3 sources

            case 31: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgq", cjzm(int ), (int)64);
                ** GOTO lbl115
            }
lbl136:
            // 2 sources

            case 32: {
                var2_1 /* !! */  = (int)hn.cjzi("ckgr", cjzm(int ), (int)65);
                ** GOTO lbl91
            }
            case 33: 
        }
        var2_1 /* !! */  = (int)hn.cjzi("ckgs", cjzm(int ), (int)66);
        ** while (true)
    }

    private static /* synthetic */ void cqxz() {
        hn.cjzg[600] = 6267495671298715065L;
        hn.cjzg[601] = -7640674292426323499L;
        hn.cjzg[602] = -5417455364157172763L;
        hn.cjzg[603] = -5752609878825673420L;
        hn.cjzg[604] = 669814921685694776L;
        hn.cjzg[605] = 2339650330592896801L;
        hn.cjzg[606] = 2206121037685179378L;
        hn.cjzg[607] = -528518736722088592L;
        hn.cjzg[608] = -2052531032619986041L;
        hn.cjzg[609] = 8653481841063651259L;
        hn.cjzg[610] = -2254632633906020810L;
        hn.cjzg[611] = 3276359050443549798L;
        hn.cjzg[612] = 295681459675656545L;
        hn.cjzg[613] = 745827469937129394L;
        hn.cjzg[614] = 8239832140857651314L;
        hn.cjzg[615] = 6432539933004908035L;
        hn.cjzg[616] = -2935694693331293436L;
        hn.cjzg[617] = 4042837854889371192L;
        hn.cjzg[618] = 5781724847303139191L;
        hn.cjzg[619] = -4004061974853964805L;
        hn.cjzg[620] = 2342256382962934733L;
        hn.cjzg[621] = 9115400102485289011L;
        hn.cjzg[622] = -6380786145810130584L;
        hn.cjzg[623] = -6487435074489715920L;
        hn.cjzg[624] = 8828222757842577097L;
        hn.cjzg[625] = 798601429928541824L;
        hn.cjzg[626] = 6924463102552816214L;
        hn.cjzg[627] = -4772171950898367346L;
        hn.cjzg[628] = 9165629506340091419L;
        hn.cjzg[629] = 7887474912594173143L;
        hn.cjzg[630] = 7420681499220153532L;
        hn.cjzg[631] = -6511783249730485257L;
        hn.cjzg[632] = -4657208203817810408L;
        hn.cjzg[633] = -5861426814575812900L;
        hn.cjzg[634] = 4549270956196606321L;
        hn.cjzg[635] = 3062112988817273059L;
        hn.cjzg[636] = -5477025937879154668L;
        hn.cjzg[637] = 2806364246172130669L;
        hn.cjzg[638] = -7950055893848824515L;
        hn.cjzg[639] = -9100726060162683331L;
        hn.cjzg[640] = -4444626312608455439L;
        hn.cjzg[641] = 9040175142044295710L;
        hn.cjzg[642] = 556834725342287844L;
        hn.cjzg[643] = -2633124116651063339L;
        hn.cjzg[644] = 6945932823207805610L;
        hn.cjzg[645] = -7396009409714889834L;
        hn.cjzg[646] = -6025760777229709783L;
        hn.cjzg[647] = 6471760418858208280L;
        hn.cjzg[648] = 2311920053234852149L;
        hn.cjzg[649] = 6203546510225453815L;
        hn.cjzg[650] = -3276399143119174140L;
        hn.cjzg[651] = -8219687504852832767L;
        hn.cjzg[652] = 8724538733130492048L;
        hn.cjzg[653] = -1314597916899621357L;
        hn.cjzg[654] = -5071738037594400543L;
        hn.cjzg[655] = -2367620803036616805L;
        hn.cjzg[656] = -3438223319909402862L;
        hn.cjzg[657] = -2343584751023015343L;
        hn.cjzg[658] = 4114820153163873447L;
        hn.cjzg[659] = -7993795241687940824L;
        hn.cjzg[660] = -4904493105120023010L;
        hn.cjzg[661] = 6721786921210349910L;
        hn.cjzg[662] = -2742613523977188273L;
        hn.cjzg[663] = 1767249865986029497L;
        hn.cjzg[664] = 6535877012797020403L;
        hn.cjzg[665] = -5748217706162909431L;
        hn.cjzg[666] = -7060786301646369604L;
        hn.cjzg[667] = 1278108654134234524L;
        hn.cjzg[668] = -7266585531773734216L;
        hn.cjzg[669] = -6778752022701471445L;
        hn.cjzg[670] = -3483482112694635855L;
        hn.cjzg[671] = -6266209087780440704L;
        hn.cjzg[672] = 295537240950200926L;
        hn.cjzg[673] = -8878176341861544796L;
        hn.cjzg[674] = -5643605511783934382L;
        hn.cjzg[675] = -649505155298441308L;
        hn.cjzg[676] = -5655435840900664053L;
        hn.cjzg[677] = -6483880928050000544L;
        hn.cjzg[678] = 1620074066891749353L;
        hn.cjzg[679] = 3541302047349336245L;
        hn.cjzg[680] = -924579161742526306L;
        hn.cjzg[681] = -6372249785768349836L;
        hn.cjzg[682] = 1980739229500123799L;
        hn.cjzg[683] = -7060664176445292079L;
        hn.cjzg[684] = 5518783193539675252L;
        hn.cjzg[685] = 6093284992488144435L;
        hn.cjzg[686] = -9138529831190821817L;
        hn.cjzg[687] = -1695029095457593521L;
        hn.cjzg[688] = -6373146366269774406L;
        hn.cjzg[689] = -6545871730757525263L;
        hn.cjzg[690] = -4434995205349773233L;
        hn.cjzg[691] = -6651039889451232276L;
        hn.cjzg[692] = 73272522316384359L;
        hn.cjzg[693] = 6113475410315411210L;
        hn.cjzg[694] = 2595384434998468140L;
        hn.cjzg[695] = 2666623274670182688L;
        hn.cjzg[696] = 3816975519337122169L;
        hn.cjzg[697] = 1354721200886096759L;
        hn.cjzg[698] = 7171307929499413989L;
        hn.cjzg[699] = -1360068692677163966L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public if getLegitSmooth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpcn", cjzf(int ), (int)499)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hn.cjzi("cpco", cjzm(int ), (int)1167)) break;
            v0 /* !! */  = (long)hn.cjzi("cpcp", cjzm(int ), (int)1168);
        }
        var3_1 = hn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hn.fz - hn.cjzi("cpcq", cjzf(int ), (int)500)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hn.cjzi("cpcr", cjzm(int ), (int)1169)) break;
            v1 /* !! */  = (long)hn.cjzi("cpcs", cjzm(int ), (int)1170);
        }
        var2_2 /* !! */  = hn.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = hn.fz;
                if (true) ** GOTO lbl22
                block20: while (true) {
                    v2 /* !! */  = (long)(v3 - hn.cjzi("cpct", cjzf(int ), (int)501));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1908116787: {
                            v3 = hn.cjzi("cpcu", cjzf(int ), (int)502);
                            continue block20;
                        }
                        case -1817579762: {
                            v3 = hn.cjzi("cpcv", cjzf(int ), (int)503);
                            continue block20;
                        }
                        case -841682887: {
                            break block20;
                        }
                        case 797827274: {
                            v3 = hn.cjzi("cpcw", cjzf(int ), (int)504);
                            continue block20;
                        }
                    }
                    break;
                }
                var1_3 = hn.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = hn.fz;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - hn.cjzi("cpcx", cjzf(int ), (int)505));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -841682887: {
                            break block22;
                        }
                        case -415187130: {
                            v5 = hn.cjzi("cpcy", cjzf(int ), (int)506);
                            continue block22;
                        }
                        case 62958898: {
                            v5 = hn.cjzi("cpcz", cjzf(int ), (int)507);
                            continue block22;
                        }
                        case 1021284755: {
                            v5 = hn.cjzi("cpda", cjzf(int ), (int)508);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.legitSmooth;
            }
            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpdb", cjzm(int ), (int)1171);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hn.cjzi("cpdc", cjzm(int ), (int)1172);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpdd", cjzm(int ), (int)1173);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpde", cjzm(int ), (int)1174);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getTpsSync() {
        v0 /* !! */  = hn.fz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - hn.cjzi("cpol", cjzf(int ), (int)645));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -841682887: {
                    break block22;
                }
                case 1294547638: {
                    v1 = hn.cjzi("cpom", cjzf(int ), (int)646);
                    continue block22;
                }
                case 1991399495: {
                    v1 = hn.cjzi("cpon", cjzf(int ), (int)647);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = hn.c;
        v2 /* !! */  = hn.fz;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - hn.cjzi("cpoo", cjzf(int ), (int)648));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1314650700: {
                    v3 = hn.cjzi("cpop", cjzf(int ), (int)649);
                    continue block23;
                }
                case -841682887: {
                    break block23;
                }
                case 1398630923: {
                    v3 = hn.cjzi("cpoq", cjzf(int ), (int)650);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = hn.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hn.fz - hn.cjzi("cpor", cjzf(int ), (int)651)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hn.cjzi("cpos", cjzm(int ), (int)1331)) break;
            v4 /* !! */  = (long)hn.cjzi("cpot", cjzm(int ), (int)1332);
        }
        var1_3 = hn.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = hn.fz;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - hn.cjzi("cpou", cjzf(int ), (int)652));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1320657861: {
                            v6 = hn.cjzi("cpov", cjzf(int ), (int)653);
                            continue block26;
                        }
                        case -841682887: {
                            break block26;
                        }
                        case 155893158: {
                            v6 = hn.cjzi("cpow", cjzf(int ), (int)654);
                            continue block26;
                        }
                        case 1564661301: {
                            v6 = hn.cjzi("cpox", cjzf(int ), (int)655);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.tpsSync;
            }
lbl62:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hn.cjzi("cpoy", cjzm(int ), (int)1333);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hn.cjzi("cpoz", cjzm(int ), (int)1334);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
            }
lbl72:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hn.cjzi("cppa", cjzm(int ), (int)1335);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hn.cjzi("cpwj", cjzm(int ), (int)1336);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }
}

