/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1802
 *  net.minecraft.class_2828
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_2828;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.cn;
import ruhack.phobia.cs;
import ruhack.phobia.da;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ho$Phase;
import ruhack.phobia.ho$WindChargeSmooth;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.pn;
import ruhack.phobia.pp;

public final class ho
extends ds {
    private ho$Phase phase;
    private int temporaryHotbarSlot;
    private final nx movement;
    public static final boolean c;
    public static final int b;
    private int chargeSlot;
    private static long[] cfak;
    private static long[] cfaj;
    private boolean fromHotbar;
    private int waitTicks;
    private final ka windChargeBind;
    public static final boolean a;
    private static int[] cfas;
    private final os silentRotation;
    public static final long fp = -6944954508551043235L;
    private int previousSlot;
    private static int[] cfar;
    private boolean inventorySwapApplied;

    public static /* synthetic */ CallSite cfal(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ho.fp - ho.cfal("cfrh", cfai(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ho.cfal("cfri", cfaq(int ), (int)230)) break;
            v0 /* !! */  = (long)ho.cfal("cfrj", cfaq(int ), (int)231);
        }
        var4_2 = ho.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ho.fp - ho.cfal("cfrk", cfai(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ho.cfal("cfrl", cfaq(int ), (int)232)) break;
            v1 /* !! */  = (long)ho.cfal("cfrm", cfaq(int ), (int)233);
        }
        var3_3 /* !! */  = ho.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ho.fp - ho.cfal("cfrn", cfai(int ), (int)51)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ho.cfal("cfro", cfaq(int ), (int)234)) break;
            v2 /* !! */  = (long)ho.cfal("cfrp", cfaq(int ), (int)235);
        }
        var2_4 = ho.a;
        if (var4_2) {
            throw null;
lbl21:
            // 7 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ho.fp - ho.cfal("cfrq", cfai(int ), (int)52)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ho.cfal("cfrr", cfaq(int ), (int)236)) break;
            v3 /* !! */  = (long)ho.cfal("cfrs", cfaq(int ), (int)237);
        }
        v4 /* !! */  = ho.fp;
        if (true) ** GOTO lbl33
        block36: while (true) {
            v4 /* !! */  = (long)(v5 - ho.cfal("cfrt", cfai(int ), (int)53));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1601091747: {
                    break block36;
                }
                case 705739080: {
                    v5 = ho.cfal("cfru", cfai(int ), (int)54);
                    continue block36;
                }
                case 2114724174: {
                    v5 = ho.cfal("cfrv", cfai(int ), (int)55);
                    continue block36;
                }
            }
            break;
        }
        if (this.phase != ho$Phase.REQUEST_JUMP) ** GOTO lbl102
        if (var2_4) ** GOTO lbl21
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = ho.fp - ho.cfal("cfrw", cfai(int ), (int)56)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ho.cfal("cfrx", cfaq(int ), (int)238)) break;
            v6 /* !! */  = (long)ho.cfal("cfry", cfaq(int ), (int)239);
        }
        v7 /* !! */  = ho.fp;
        if (true) ** GOTO lbl53
        block38: while (true) {
            v7 /* !! */  = (long)(v8 - ho.cfal("cfrz", cfai(int ), (int)57));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2082681048: {
                    v8 = ho.cfal("cfsa", cfai(int ), (int)58);
                    continue block38;
                }
                case -1601091747: {
                    break block38;
                }
                case -846050983: {
                    v8 = ho.cfal("cfsb", cfai(int ), (int)59);
                    continue block38;
                }
                case 40472430: {
                    v8 = ho.cfal("cfsc", cfai(int ), (int)60);
                    continue block38;
                }
            }
            break;
        }
        if (ho.mc.field_1724 == null) ** GOTO lbl102
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                v9 = ho.cfal("cfsd", cfaq(int ), (int)240);
                v10 /* !! */  = ho.fp;
                if (true) ** GOTO lbl76
                block39: while (true) {
                    v10 /* !! */  = (long)(v11 - ho.cfal("cfse", cfai(int ), (int)61));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2120579923: {
                            v11 = ho.cfal("cfsf", cfai(int ), (int)62);
                            continue block39;
                        }
                        case -1601091747: {
                            break block39;
                        }
                        case -446315719: {
                            v11 = ho.cfal("cfsg", cfai(int ), (int)63);
                            continue block39;
                        }
                        case 813638082: {
                            v11 = ho.cfal("cfsh", cfai(int ), (int)64);
                            continue block39;
                        }
                    }
                    break;
                }
                var1_1.setJumping((boolean)v9);
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ho.fp - ho.cfal("cfsi", cfai(int ), (int)65)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ho.cfal("cfsj", cfaq(int ), (int)241)) break;
                    v12 /* !! */  = (long)ho.cfal("cfsk", cfaq(int ), (int)242);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = ho.fp - ho.cfal("cfsl", cfai(int ), (int)66)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ho.cfal("cfsm", cfaq(int ), (int)243)) break;
                    v13 /* !! */  = (long)ho.cfal("cfsn", cfaq(int ), (int)244);
                }
                this.phase = ho$Phase.WAIT_AIRBORNE_PACKET;
                if (var2_4) ** GOTO lbl21
lbl102:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ho.cfal("cfso", cfaq(int ), (int)245);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl125
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ho.cfal("cfsp", cfaq(int ), (int)246);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl116:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)ho.cfal("cfsq", cfaq(int ), (int)247);
                if (!var4_2) break;
                throw null;
            }
lbl120:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)ho.cfal("cfsr", cfaq(int ), (int)248);
                } while (!var4_2);
                throw null;
            }
lbl125:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)ho.cfal("cfss", cfaq(int ), (int)249);
                if (var4_2) {
                    throw null;
                }
            }
lbl129:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)ho.cfal("cfst", cfaq(int ), (int)250);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)ho.cfal("cfsu", cfaq(int ), (int)251);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ho.cfal("cfsv", cfaq(int ), (int)252);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)ho.cfal("cfsw", cfaq(int ), (int)253);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 9: {
                var3_3 /* !! */  = (int)ho.cfal("cfsx", cfaq(int ), (int)254);
                if (!var4_2) ** GOTO lbl129
                throw null;
            }
lbl150:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)ho.cfal("cfsy", cfaq(int ), (int)255);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)ho.cfal("cfsz", cfaq(int ), (int)256);
        ** while (!var4_2)
lbl157:
        // 1 sources

        throw null;
    }

    static {
        cfar = new int[354];
        cfas = new int[354];
        ho.cgat();
        ho.cgau();
        ho.cgav();
        ho.cgaw();
        ho.cgax();
        ho.cgay();
        ho.cgaz();
        ho.cgba();
        cfaj = new long[74];
        cfak = new long[74];
        ho.cgbb();
        ho.cgbc();
    }

    private static /* synthetic */ void cgay() {
        ho.cfas[100] = -1066199334;
        ho.cfas[101] = -1580536997;
        ho.cfas[102] = -1234170052;
        ho.cfas[103] = -76633021;
        ho.cfas[104] = -2075388860;
        ho.cfas[105] = 2133420044;
        ho.cfas[106] = 597911600;
        ho.cfas[107] = -1250698762;
        ho.cfas[108] = 1341137001;
        ho.cfas[109] = -1875838791;
        ho.cfas[110] = -1935590445;
        ho.cfas[111] = -696325954;
        ho.cfas[112] = -1037518349;
        ho.cfas[113] = 91237641;
        ho.cfas[114] = 576500545;
        ho.cfas[115] = -1181771531;
        ho.cfas[116] = 59644213;
        ho.cfas[117] = 2078151540;
        ho.cfas[118] = 1029179984;
        ho.cfas[119] = 1820627450;
        ho.cfas[120] = -767914735;
        ho.cfas[121] = -2000811229;
        ho.cfas[122] = -347733371;
        ho.cfas[123] = 1356219231;
        ho.cfas[124] = -388532541;
        ho.cfas[125] = -1882535444;
        ho.cfas[126] = -1208633111;
        ho.cfas[127] = 392238489;
        ho.cfas[128] = 1222659864;
        ho.cfas[129] = 1721995862;
        ho.cfas[130] = 26576530;
        ho.cfas[131] = 819993459;
        ho.cfas[132] = 1294730255;
        ho.cfas[133] = -908429430;
        ho.cfas[134] = 223246529;
        ho.cfas[135] = -515619239;
        ho.cfas[136] = -1266222424;
        ho.cfas[137] = 2013543972;
        ho.cfas[138] = -327843041;
        ho.cfas[139] = 1467999567;
        ho.cfas[140] = 945247434;
        ho.cfas[141] = 312800845;
        ho.cfas[142] = 908530249;
        ho.cfas[143] = 68591396;
        ho.cfas[144] = -2103103131;
        ho.cfas[145] = -1568431351;
        ho.cfas[146] = -1599421810;
        ho.cfas[147] = -210347034;
        ho.cfas[148] = 1453607643;
        ho.cfas[149] = 985694925;
        ho.cfas[150] = -1214955785;
        ho.cfas[151] = -663694952;
        ho.cfas[152] = 147756955;
        ho.cfas[153] = 1471073620;
        ho.cfas[154] = -1233482617;
        ho.cfas[155] = -1267423198;
        ho.cfas[156] = 846582031;
        ho.cfas[157] = 623639218;
        ho.cfas[158] = -1000127037;
        ho.cfas[159] = -778016632;
        ho.cfas[160] = -894696264;
        ho.cfas[161] = 289138600;
        ho.cfas[162] = -27555213;
        ho.cfas[163] = -1380406433;
        ho.cfas[164] = -910060650;
        ho.cfas[165] = -1001231558;
        ho.cfas[166] = -2019907670;
        ho.cfas[167] = -676447621;
        ho.cfas[168] = 664355788;
        ho.cfas[169] = 1848127871;
        ho.cfas[170] = 271498244;
        ho.cfas[171] = -487056915;
        ho.cfas[172] = 905529476;
        ho.cfas[173] = 92401591;
        ho.cfas[174] = 1342692399;
        ho.cfas[175] = -271537108;
        ho.cfas[176] = 151675920;
        ho.cfas[177] = -1339144798;
        ho.cfas[178] = -135103573;
        ho.cfas[179] = -861641327;
        ho.cfas[180] = 799311953;
        ho.cfas[181] = -1477451761;
        ho.cfas[182] = -1127670315;
        ho.cfas[183] = 116638472;
        ho.cfas[184] = 1830459740;
        ho.cfas[185] = 240038066;
        ho.cfas[186] = -819883231;
        ho.cfas[187] = -137267196;
        ho.cfas[188] = 1563244121;
        ho.cfas[189] = -979087557;
        ho.cfas[190] = 993674918;
        ho.cfas[191] = -1119811661;
        ho.cfas[192] = -219763538;
        ho.cfas[193] = 1852102563;
        ho.cfas[194] = 103833567;
        ho.cfas[195] = 1699298675;
        ho.cfas[196] = 178288989;
        ho.cfas[197] = -2048468536;
        ho.cfas[198] = 516930735;
        ho.cfas[199] = 1154562179;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ka getWindChargeBind() {
        v0 /* !! */  = ho.fp;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ho.cfal("cfam", cfai(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1601091747: {
                    break block11;
                }
                case -883318842: {
                    v1 = ho.cfal("cfan", cfai(int ), (int)1);
                    continue block11;
                }
                case 1873744095: {
                    v1 = ho.cfal("cfao", cfai(int ), (int)2);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = ho.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ho.fp - ho.cfal("cfap", cfai(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ho.cfal("cfat", cfaq(int ), (int)0)) break;
            v2 /* !! */  = (long)ho.cfal("cfau", cfaq(int ), (int)1);
        }
        var2_2 /* !! */  = ho.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ho.fp - ho.cfal("cfav", cfai(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ho.cfal("cfaw", cfaq(int ), (int)2)) break;
            v3 /* !! */  = (long)ho.cfal("cfax", cfaq(int ), (int)3);
        }
        var1_3 = ho.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = ho.fp - ho.cfal("cfay", cfai(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ho.cfal("cfaz", cfaq(int ), (int)4)) break;
                    v4 /* !! */  = (long)ho.cfal("cfba", cfaq(int ), (int)5);
                }
                return this.windChargeBind;
            }
            case 0: {
                var2_2 /* !! */  = (int)ho.cfal("cfbb", cfaq(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl53
            }
            case 1: {
                var2_2 /* !! */  = (int)ho.cfal("cfbc", cfaq(int ), (int)7);
                if (!var3_1) break;
                throw null;
            }
lbl53:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ho.cfal("cfbd", cfaq(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ho.cfal("cfbe", cfaq(int ), (int)9);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onKey(cn var1_1) {
        block143: {
            block145: {
                block144: {
                    var6_2 = ho.c;
                    var5_3 /* !! */  = ho.b;
                    var4_4 = ho.a;
                    if (var6_2) {
                        throw null;
                    }
                    if (var4_4 || var4_4) return;
                    if (ho.mc.field_1724 == null) break block144;
                    if (var4_4) return;
                    if (ho.mc.field_1687 == null) break block144;
                    if (var4_4) return;
                    if (ho.mc.field_1755 != null) break block144;
                    if (var4_4) return;
                    if (this.phase != ho$Phase.IDLE) break block144;
                    if (var4_4) return;
                    if (var1_1.isBindReleased(this.windChargeBind)) break block145;
                    if (var4_4) return;
                }
                if (var4_4 || var4_4) return;
                return;
            }
            if (var4_4 || var4_4) return;
            var2_5 = nv.findItemInHotbar(class_1802.field_49098);
            if (var4_4 || var4_4) return;
            if (var2_5 == ho.cfal("cfbw", cfaq(int ), (int)27)) {
                if (var4_4 || var4_4) return;
                v0 /* !! */  = nv.findItemInInventory(class_1802.field_49098);
                if (var6_2) {
                    throw null;
                }
            } else {
                if (var4_4 || var4_4) return;
                v0 /* !! */  = var3_6 /* !! */  = (int)ho.cfal("cfbx", cfaq(int ), (int)28);
            }
            if (var4_4 || var4_4) return;
            if (var2_5 == ho.cfal("cfby", cfaq(int ), (int)29)) {
                if (var4_4) return;
                if (var3_6 /* !! */  == ho.cfal("cfbz", cfaq(int ), (int)30)) {
                    if (var4_4 || var4_4) return;
                    pp.brandmessage("\u0417\u0430\u0440\u044f\u0434 \u0432\u0435\u0442\u0440\u0430 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
                    if (var4_4 || var4_4) return;
                    return;
                }
            }
            if (var4_4 || var4_4) return;
            this.previousSlot = ho.mc.field_1724.method_31548().method_67532();
            if (var4_4 || var4_4) return;
            if (var2_5 != ho.cfal("cfca", cfaq(int ), (int)31)) {
                v1 /* !! */  = ho.cfal("cfcb", cfaq(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
            } else {
                this.fromHotbar = ho.cfal("cfcc", cfaq(int ), (int)33);
                v1 /* !! */  = (CallSite)this.fromHotbar;
            }
            if (var4_4 || var4_4) return;
            if (this.fromHotbar) {
                v2 = var2_5;
                if (var6_2) {
                    throw null;
                }
            } else {
                v2 = this.chargeSlot = nv.wrapSlot(var3_6 /* !! */ );
            }
            if (var4_4 || var4_4) return;
            this.temporaryHotbarSlot = this.previousSlot;
            if (var4_4 || var4_4) return;
            this.inventorySwapApplied = ho.cfal("cfcd", cfaq(int ), (int)34);
            if (var4_4 || var4_4) return;
            if (!this.fromHotbar) ** GOTO lbl78
            if (var4_4 || var4_4) return;
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        nv.selectSlot(this.chargeSlot);
                        if (var4_4 || var4_4) return;
                        this.phase = ho$Phase.WAIT_ROTATE;
                        if (var4_4 || var4_4) return;
                        this.waitTicks = (int)ho.cfal("cfce", cfaq(int ), (int)35);
                        if (var4_4) return;
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl87
                    }
lbl78:
                    // 1 sources

                    if (var4_4 || var4_4) return;
                    this.movement.saveState();
                    if (var4_4 || var4_4) return;
                    this.movement.block();
                    if (var4_4 || var4_4) return;
                    this.phase = ho$Phase.WAIT_NEW_STOP;
                    if (var4_4 || var4_4) return;
                    this.waitTicks = (int)ho.cfal("cfcf", cfaq(int ), (int)36);
                    if (var4_4) return;
lbl87:
                    // 2 sources

                    if (!var4_4 && !var4_4) return;
                    return;
                    case 0: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcg", cfaq(int ), (int)37);
                        cfr_temp_0 = 5;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)ho.cfal("cfch", cfaq(int ), (int)38);
                        cfr_temp_0 = 6;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)ho.cfal("cfck", cfaq(int ), (int)41);
                        cfr_temp_0 = 10;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)ho.cfal("cfco", cfaq(int ), (int)45);
                        cfr_temp_0 = 22;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcp", cfaq(int ), (int)46);
                        cfr_temp_0 = 47;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcu", cfaq(int ), (int)51);
                        cfr_temp_0 = 43;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcv", cfaq(int ), (int)52);
                        cfr_temp_0 = 42;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcy", cfaq(int ), (int)55);
                        cfr_temp_0 = 35;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcz", cfaq(int ), (int)56);
                        cfr_temp_0 = 17;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)ho.cfal("cfda", cfaq(int ), (int)57);
                        cfr_temp_0 = 13;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdb", cfaq(int ), (int)58);
                        cfr_temp_0 = 43;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdc", cfaq(int ), (int)59);
                        cfr_temp_0 = 34;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 24: {
                        var5_3 /* !! */  = (int)ho.cfal("cfde", cfaq(int ), (int)61);
                        cfr_temp_0 = 25;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 26: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdg", cfaq(int ), (int)63);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)ho.cfal("cfct", cfaq(int ), (int)50);
                        cfr_temp_0 = 31;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 29: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdj", cfaq(int ), (int)66);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 28: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdi", cfaq(int ), (int)65);
                        cfr_temp_0 = 12;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 30: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdk", cfaq(int ), (int)67);
                        cfr_temp_0 = 39;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 32: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdm", cfaq(int ), (int)69);
                        cfr_temp_0 = 2;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 36: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdq", cfaq(int ), (int)73);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcn", cfaq(int ), (int)44);
                        cfr_temp_0 = 44;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 38: {
                        var5_3 /* !! */  = (int)ho.cfal("cfds", cfaq(int ), (int)75);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 35: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdp", cfaq(int ), (int)72);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 34: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdo", cfaq(int ), (int)71);
                        cfr_temp_0 = 55;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 39: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdt", cfaq(int ), (int)76);
                        cfr_temp_0 = 54;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 40: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdu", cfaq(int ), (int)77);
                        cfr_temp_0 = 10;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 45: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdz", cfaq(int ), (int)82);
                        cfr_temp_0 = 6;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 49: {
                        var5_3 /* !! */  = (int)ho.cfal("cfed", cfaq(int ), (int)86);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcm", cfaq(int ), (int)43);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 42: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdw", cfaq(int ), (int)79);
                        cfr_temp_0 = 56;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 50: {
                        var5_3 /* !! */  = (int)ho.cfal("cfee", cfaq(int ), (int)87);
                        if (!var6_2) ** break;
                        throw null;
                    }
                    case 51: {
                        var5_3 /* !! */  = (int)ho.cfal("cfef", cfaq(int ), (int)88);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcl", cfaq(int ), (int)42);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcx", cfaq(int ), (int)54);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcs", cfaq(int ), (int)49);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 37: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdr", cfaq(int ), (int)74);
                        cfr_temp_0 = 11;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 52: {
                        var5_3 /* !! */  = (int)ho.cfal("cfeh", cfaq(int ), (int)89);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 46: {
                        var5_3 /* !! */  = (int)ho.cfal("cfea", cfaq(int ), (int)83);
                        cfr_temp_0 = 47;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 53: {
                        var5_3 /* !! */  = (int)ho.cfal("cfel", cfaq(int ), (int)90);
                        cfr_temp_0 = 56;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 54: {
                        var5_3 /* !! */  = (int)ho.cfal("cfem", cfaq(int ), (int)91);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdn", cfaq(int ), (int)70);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 43: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdx", cfaq(int ), (int)80);
                        cfr_temp_0 = 31;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 55: {
                        var5_3 /* !! */  = (int)ho.cfal("cfen", cfaq(int ), (int)92);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcw", cfaq(int ), (int)53);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 48: {
                        var5_3 /* !! */  = (int)ho.cfal("cfec", cfaq(int ), (int)85);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 27: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdh", cfaq(int ), (int)64);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)ho.cfal("cfcj", cfaq(int ), (int)40);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 23: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdd", cfaq(int ), (int)60);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 47: {
                        var5_3 /* !! */  = (int)ho.cfal("cfeb", cfaq(int ), (int)84);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        ** GOTO lbl351
                    }
                    case 56: {
                        var5_3 /* !! */  = (int)ho.cfal("cfeu", cfaq(int ), (int)93);
                        cfr_temp_0 = 44;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 57: {
                        var5_3 /* !! */  = (int)ho.cfal("cfev", cfaq(int ), (int)94);
                        if (var6_2) {
                            throw null;
                        }
lbl351:
                        // 3 sources

                        var5_3 /* !! */  = (int)ho.cfal("cfcq", cfaq(int ), (int)47);
                        cfr_temp_0 = 11;
                        if (var6_2) {
                            throw null;
                        }
                        break block143;
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)ho.cfal("cfci", cfaq(int ), (int)39);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 44: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdy", cfaq(int ), (int)81);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdf", cfaq(int ), (int)62);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 41: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdv", cfaq(int ), (int)78);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 31: {
                        var5_3 /* !! */  = (int)ho.cfal("cfdl", cfaq(int ), (int)68);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 11: 
                }
                break;
            }
            ** GOTO lbl381
        }
        do {
            if (true) ** continue;
lbl381:
            // 2 sources

            var5_3 /* !! */  = (int)ho.cfal("cfcr", cfaq(int ), (int)48);
            cfr_temp_0 = 2;
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        block117: {
            block116: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ho.fp - ho.cfal("cffd", cfai(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ho.cfal("cffj", cfaq(int ), (int)95)) break;
                    v0 /* !! */  = (long)ho.cfal("cffk", cfaq(int ), (int)96);
                }
                var4_2 = ho.c;
                v1 /* !! */  = ho.fp;
                if (true) ** GOTO lbl11
                block77: while (true) {
                    v1 /* !! */  = (long)(v2 - ho.cfal("cffl", cfai(int ), (int)7));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1601091747: {
                            break block77;
                        }
                        case 375747427: {
                            v2 = ho.cfal("cffm", cfai(int ), (int)8);
                            continue block77;
                        }
                        case 1268871910: {
                            v2 = ho.cfal("cffn", cfai(int ), (int)9);
                            continue block77;
                        }
                        case 1800498372: {
                            v2 = ho.cfal("cffp", cfai(int ), (int)10);
                            continue block77;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = ho.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ho.fp - ho.cfal("cffq", cfai(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ho.cfal("cffr", cfaq(int ), (int)97)) break;
                    v3 /* !! */  = (long)ho.cfal("cfft", cfaq(int ), (int)98);
                }
                var2_4 = ho.a;
                if (var4_2) {
                    throw null;
lbl32:
                    // 10 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                v4 /* !! */  = ho.fp;
                if (true) ** GOTO lbl39
                block80: while (true) {
                    v4 /* !! */  = (long)(v5 - ho.cfal("cffw", cfai(int ), (int)12));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1638268429: {
                            v5 = ho.cfal("cffy", cfai(int ), (int)13);
                            continue block80;
                        }
                        case -1601091747: {
                            break block80;
                        }
                        case -1257349294: {
                            v5 = ho.cfal("cffz", cfai(int ), (int)14);
                            continue block80;
                        }
                        case -814002104: {
                            v5 = ho.cfal("cfgd", cfai(int ), (int)15);
                            continue block80;
                        }
                    }
                    break;
                }
                if (var1_1.getType() != 0) break block116;
                if (var2_4) ** GOTO lbl32
                v6 /* !! */  = ho.fp;
                if (true) ** GOTO lbl57
                block81: while (true) {
                    v6 /* !! */  = (long)(v7 - ho.cfal("cfgf", cfai(int ), (int)16));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1601091747: {
                            break block81;
                        }
                        case -80593683: {
                            v7 = ho.cfal("cfgh", cfai(int ), (int)17);
                            continue block81;
                        }
                        case 1663849477: {
                            v7 = ho.cfal("cfgj", cfai(int ), (int)18);
                            continue block81;
                        }
                        case 1827952382: {
                            v7 = ho.cfal("cfgl", cfai(int ), (int)19);
                            continue block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ho.fp - ho.cfal("cfgo", cfai(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ho.cfal("cfgr", cfaq(int ), (int)99)) break;
                    v8 /* !! */  = (long)ho.cfal("cfgt", cfaq(int ), (int)100);
                }
                if (ho.mc.field_1724 != null) break block117;
                if (var2_4) ** GOTO lbl32
            }
            if (var2_4 || var2_4) ** GOTO lbl32
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = ho.fp - ho.cfal("cfgx", cfai(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ho.cfal("cfgy", cfaq(int ), (int)101)) break;
            v9 /* !! */  = (long)ho.cfal("cfgz", cfaq(int ), (int)102);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = ho.fp - ho.cfal("cfha", cfai(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ho.cfal("cfhb", cfaq(int ), (int)103)) break;
            v10 /* !! */  = (long)ho.cfal("cfhh", cfaq(int ), (int)104);
        }
        if (this.phase == ho$Phase.WAIT_ROTATE) ** GOTO lbl140
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                v11 /* !! */  = ho.fp;
                if (true) ** GOTO lbl100
                block85: while (true) {
                    v11 /* !! */  = (long)(v12 - ho.cfal("cfhi", cfai(int ), (int)23));
lbl100:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1601091747: {
                            break block85;
                        }
                        case -1164684734: {
                            v12 = ho.cfal("cfhl", cfai(int ), (int)24);
                            continue block85;
                        }
                        case -526812319: {
                            v12 = ho.cfal("cfhm", cfai(int ), (int)25);
                            continue block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = ho.fp - ho.cfal("cfhn", cfai(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ho.cfal("cfho", cfaq(int ), (int)105)) break;
                    v13 /* !! */  = (long)ho.cfal("cfhu", cfaq(int ), (int)106);
                }
                if (this.phase == ho$Phase.REQUEST_JUMP) ** GOTO lbl140
                if (var2_4) ** GOTO lbl32
                v14 /* !! */  = ho.fp;
                if (true) ** GOTO lbl120
                block87: while (true) {
                    v14 /* !! */  = (long)(v15 - ho.cfal("cfhw", cfai(int ), (int)27));
lbl120:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1601091747: {
                            break block87;
                        }
                        case -1293977926: {
                            v15 = ho.cfal("cfhx", cfai(int ), (int)28);
                            continue block87;
                        }
                        case 743924334: {
                            v15 = ho.cfal("cfhy", cfai(int ), (int)29);
                            continue block87;
                        }
                        case 1241334403: {
                            v15 = ho.cfal("cfhz", cfai(int ), (int)30);
                            continue block87;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = ho.fp - ho.cfal("cfia", cfai(int ), (int)31)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ho.cfal("cfic", cfaq(int ), (int)107)) break;
                    v16 /* !! */  = (long)ho.cfal("cfii", cfaq(int ), (int)108);
                }
                if (this.phase == ho$Phase.WAIT_AIRBORNE_PACKET) ** GOTO lbl140
                if (var2_4 || var2_4) ** GOTO lbl32
                return;
lbl140:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                v17 /* !! */  = ho.fp;
                if (true) ** GOTO lbl145
                block89: while (true) {
                    v17 /* !! */  = (long)(ho.cfal("cfil", cfai(int ), (int)33) - ho.cfal("cfik", cfai(int ), (int)32));
lbl145:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1901210852: {
                            continue block89;
                        }
                        case -1601091747: {
                            break block89;
                        }
                    }
                    break;
                }
                v18 /* !! */  = ho.fp;
                if (true) ** GOTO lbl154
                block90: while (true) {
                    v18 /* !! */  = (long)(ho.cfal("cfiq", cfai(int ), (int)35) - ho.cfal("cfin", cfai(int ), (int)34));
lbl154:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1601091747: {
                            break block90;
                        }
                        case 1429518633: {
                            continue block90;
                        }
                    }
                    break;
                }
                v19 /* !! */  = ho.fp;
                if (true) ** GOTO lbl163
                block91: while (true) {
                    v19 /* !! */  = (long)(ho.cfal("cfiw", cfai(int ), (int)37) - ho.cfal("cfiu", cfai(int ), (int)36));
lbl163:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1601091747: {
                            break block91;
                        }
                        case 1343601805: {
                            continue block91;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ho.fp - ho.cfal("cfiy", cfai(int ), (int)38)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ho.cfal("cfiz", cfaq(int ), (int)109)) break;
                    v20 /* !! */  = (long)ho.cfal("cfjb", cfaq(int ), (int)110);
                }
                v21 = ho.mc.field_1724;
                v22 /* !! */  = ho.fp;
                if (true) ** GOTO lbl178
                block93: while (true) {
                    v22 /* !! */  = (long)(ho.cfal("cfjh", cfai(int ), (int)40) - ho.cfal("cfje", cfai(int ), (int)39));
lbl178:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1601091747: {
                            break block93;
                        }
                        case 41742660: {
                            continue block93;
                        }
                    }
                    break;
                }
                v23 = v21.method_36454();
                v24 = ho.cfal("cfjo", cfjk(int ), (int)111);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = ho.fp - ho.cfal("cfjp", cfai(int ), (int)41)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ho.cfal("cfjq", cfaq(int ), (int)112)) break;
                    v25 /* !! */  = (long)ho.cfal("cfjr", cfaq(int ), (int)113);
                }
                v26 = new ov(v23, (float)v24);
                v27 = ho.cfal("cfjy", cfaq(int ), (int)114);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_9 = ho.fp - ho.cfal("cfjz", cfai(int ), (int)42)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ho.cfal("cfka", cfaq(int ), (int)115)) break;
                    v28 /* !! */  = (long)ho.cfal("cfkb", cfaq(int ), (int)116);
                }
                v29 /* !! */  = ho.fp;
                if (true) ** GOTO lbl201
                block96: while (true) {
                    v29 /* !! */  = (long)(v30 - ho.cfal("cfkc", cfai(int ), (int)43));
lbl201:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1601091747: {
                            break block96;
                        }
                        case -1219056672: {
                            v30 = ho.cfal("cfke", cfai(int ), (int)44);
                            continue block96;
                        }
                        case -702882775: {
                            v30 = ho.cfal("cfkf", cfai(int ), (int)45);
                            continue block96;
                        }
                    }
                    break;
                }
                v31 /* !! */  = ho.fp;
                if (true) ** GOTO lbl214
                block97: while (true) {
                    v31 /* !! */  = (long)(v32 - ho.cfal("cfkl", cfai(int ), (int)46));
lbl214:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1761416492: {
                            v32 = ho.cfal("cfkm", cfai(int ), (int)47);
                            continue block97;
                        }
                        case -1601091747: {
                            break block97;
                        }
                        case -769083370: {
                            v32 = ho.cfal("cfko", cfai(int ), (int)48);
                            continue block97;
                        }
                    }
                    break;
                }
                ot.INSTANCE.rotateTo(v26, (int)v27, this.silentRotation, nn.CRITICAL_FOR_USER_PROTECTION, this);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl227:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ho.cfal("cfks", cfaq(int ), (int)117);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 1: {
                var3_3 /* !! */  = (int)ho.cfal("cfkv", cfaq(int ), (int)118);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ho.cfal("cfkw", cfaq(int ), (int)119);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl241:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ho.cfal("cfkz", cfaq(int ), (int)120);
                if (!var4_2) break;
                throw null;
            }
lbl245:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ho.cfal("cflb", cfaq(int ), (int)121);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl250:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ho.cfal("cfld", cfaq(int ), (int)122);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
lbl254:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)ho.cfal("cflg", cfaq(int ), (int)123);
                if (!var4_2) ** GOTO lbl245
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ho.cfal("cflh", cfaq(int ), (int)124);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl263:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ho.cfal("cfli", cfaq(int ), (int)125);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 9: {
                var3_3 /* !! */  = (int)ho.cfal("cflj", cfaq(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl273:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ho.cfal("cflm", cfaq(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl278:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)ho.cfal("cflq", cfaq(int ), (int)128);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl283:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ho.cfal("cflt", cfaq(int ), (int)129);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
lbl287:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ho.cfal("cflw", cfaq(int ), (int)130);
                    if (!var4_2) ** GOTO lbl254
                    throw null;
                }
            }
lbl292:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)ho.cfal("cfly", cfaq(int ), (int)131);
                if (!var4_2) ** GOTO lbl283
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)ho.cfal("cfmb", cfaq(int ), (int)132);
                if (!var4_2) ** GOTO lbl263
                throw null;
            }
lbl300:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)ho.cfal("cfmc", cfaq(int ), (int)133);
                if (!var4_2) ** GOTO lbl250
                throw null;
            }
lbl304:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)ho.cfal("cfmd", cfaq(int ), (int)134);
                if (!var4_2) ** GOTO lbl241
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)ho.cfal("cfmk", cfaq(int ), (int)135);
        ** while (!var4_2)
lbl311:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block172: {
            block174: {
                block173: {
                    block170: {
                        block171: {
                            block169: {
                                block168: {
                                    block167: {
                                        block166: {
                                            var5_2 = ho.c;
                                            var4_3 /* !! */  = ho.b;
                                            var3_4 = ho.a;
                                            if (var5_2) {
                                                throw null;
lbl6:
                                                // 43 sources

                                                return;
                                            }
                                            if (var3_4 || var3_4) ** GOTO lbl6
                                            if (this.phase != ho$Phase.IDLE) break block166;
                                            if (var3_4 || var3_4) ** GOTO lbl6
                                            return;
                                        }
                                        if (var3_4 || var3_4) ** GOTO lbl6
                                        if (ho.mc.field_1724 == null) break block167;
                                        if (var3_4) ** GOTO lbl6
                                        if (ho.mc.field_1687 == null) break block167;
                                        if (var3_4) ** GOTO lbl6
                                        if (ho.mc.field_1724.field_3944 != null) break block168;
                                        if (var3_4) ** GOTO lbl6
                                    }
                                    if (var3_4 || var3_4) ** GOTO lbl6
                                    this.restoreAndCleanup();
                                    if (var3_4 || var3_4) ** GOTO lbl6
                                    return;
                                }
                                if (var3_4 || var3_4) ** GOTO lbl6
                                if (this.fromHotbar) break block169;
                                if (var3_4 || var3_4) ** GOTO lbl6
                                this.movement.block();
                                if (var3_4) ** GOTO lbl6
                            }
                            if (var3_4 || var3_4) ** GOTO lbl6
                            if (this.phase != ho$Phase.WAIT_NEW_STOP) break block170;
                            if (var3_4 || var3_4) ** GOTO lbl6
                            v0 = this.waitTicks;
                            this.waitTicks = v0 - ho.cfal("cfmw", cfaq(int ), (int)136);
                            if (v0 <= 0) break block171;
                            if (var3_4 || var3_4) ** GOTO lbl6
                            return;
                        }
                        if (var3_4 || var3_4) ** GOTO lbl6
                        nv.swapHotbar(this.chargeSlot, this.temporaryHotbarSlot);
                        if (var3_4 || var3_4) ** GOTO lbl6
                        this.inventorySwapApplied = ho.cfal("cfmz", cfaq(int ), (int)137);
                        if (var3_4 || var3_4) ** GOTO lbl6
                        this.phase = ho$Phase.WAIT_ROTATE;
                        if (var3_4 || var3_4) ** GOTO lbl6
                        this.waitTicks = (int)ho.cfal("cfna", cfaq(int ), (int)138);
                        if (var3_4 || var3_4) ** GOTO lbl6
                        return;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl6
                    if (this.phase != ho$Phase.WAIT_ROTATE) break block172;
                    if (var3_4 || var3_4) ** GOTO lbl6
                    v1 = this.waitTicks;
                    this.waitTicks = v1 - ho.cfal("cfnd", cfaq(int ), (int)139);
                    if (v1 <= 0) break block173;
                    if (var3_4 || var3_4) ** GOTO lbl6
                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                var2_5 = ot.INSTANCE.getRotation();
                if (var3_4 || var3_4) ** GOTO lbl6
                if (!(Math.abs(var2_5.getPitch() - ho.cfal("cfng", cfjk(int ), (int)140)) > 2.0f)) break block174;
                if (var3_4 || var3_4) ** GOTO lbl6
                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            this.phase = ho$Phase.REQUEST_JUMP;
            if (var3_4 || var3_4) ** GOTO lbl6
            this.waitTicks = (int)ho.cfal("cfnk", cfaq(int ), (int)141);
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        if (this.phase != ho$Phase.REQUEST_JUMP) ** GOTO lbl89
        if (var3_4 || var3_4) ** GOTO lbl6
        v2 = this.waitTicks;
        this.waitTicks = v2 - ho.cfal("cfnr", cfaq(int ), (int)142);
        if (v2 > 0) ** GOTO lbl87
        if (var3_4 || var3_4) ** GOTO lbl6
        this.restoreAndCleanup();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl6
lbl87:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                return;
            }
lbl89:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.phase != ho$Phase.WAIT_AIRBORNE_PACKET) ** GOTO lbl100
            if (var3_4 || var3_4) ** GOTO lbl6
            v3 = this.waitTicks;
            this.waitTicks = v3 - ho.cfal("cfnu", cfaq(int ), (int)143);
            if (v3 > 0) ** GOTO lbl98
            if (var3_4 || var3_4) ** GOTO lbl6
            this.restoreAndCleanup();
            if (var3_4) ** GOTO lbl6
lbl98:
            // 2 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            return;
lbl100:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.phase != ho$Phase.WAIT_RESTORE) ** GOTO lbl109
            if (var3_4) ** GOTO lbl6
            v4 = this.waitTicks;
            this.waitTicks = v4 - ho.cfal("cfnw", cfaq(int ), (int)144);
            if (v4 > 0) ** GOTO lbl109
            if (var3_4 || var3_4) ** GOTO lbl6
            this.restoreAndCleanup();
            if (var3_4) ** GOTO lbl6
lbl109:
            // 3 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
lbl112:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ho.cfal("cfnx", cfaq(int ), (int)145);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl117:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ho.cfal("cfny", cfaq(int ), (int)146);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 2: {
                var4_3 /* !! */  = (int)ho.cfal("cfnz", cfaq(int ), (int)147);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl458
            }
            case 3: {
                var4_3 /* !! */  = (int)ho.cfal("cfoa", cfaq(int ), (int)148);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl132:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ho.cfal("cfob", cfaq(int ), (int)149);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 5: {
                var4_3 /* !! */  = (int)ho.cfal("cfoc", cfaq(int ), (int)150);
                if (!var5_2) ** GOTO lbl117
                throw null;
            }
lbl141:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)ho.cfal("cfod", cfaq(int ), (int)151);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl146:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)ho.cfal("cfoe", cfaq(int ), (int)152);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl151:
            // 4 sources

            case 8: {
                var4_3 /* !! */  = (int)ho.cfal("cfof", cfaq(int ), (int)153);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl156:
            // 4 sources

            case 9: {
                var4_3 /* !! */  = (int)ho.cfal("cfog", cfaq(int ), (int)154);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl161:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)ho.cfal("cfoh", cfaq(int ), (int)155);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 11: {
                var4_3 /* !! */  = (int)ho.cfal("cfoj", cfaq(int ), (int)156);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 12: {
                var4_3 /* !! */  = (int)ho.cfal("cfok", cfaq(int ), (int)157);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 13: {
                var4_3 /* !! */  = (int)ho.cfal("cfol", cfaq(int ), (int)158);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 14: {
                var4_3 /* !! */  = (int)ho.cfal("cfom", cfaq(int ), (int)159);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 15: {
                var4_3 /* !! */  = (int)ho.cfal("cfon", cfaq(int ), (int)160);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl191:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)ho.cfal("cfoo", cfaq(int ), (int)161);
                if (!var5_2) ** GOTO lbl156
                throw null;
            }
lbl195:
            // 3 sources

            case 17: {
                var4_3 /* !! */  = (int)ho.cfal("cfop", cfaq(int ), (int)162);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 18: {
                var4_3 /* !! */  = (int)ho.cfal("cfor", cfaq(int ), (int)163);
                if (!var5_2) ** GOTO lbl151
                throw null;
            }
lbl204:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)ho.cfal("cfos", cfaq(int ), (int)164);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl209:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)ho.cfal("cfot", cfaq(int ), (int)165);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl214:
            // 2 sources

            case 21: {
                var4_3 /* !! */  = (int)ho.cfal("cfou", cfaq(int ), (int)166);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl219:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)ho.cfal("cfow", cfaq(int ), (int)167);
                if (!var5_2) ** GOTO lbl146
                throw null;
            }
lbl223:
            // 4 sources

            case 23: {
                var4_3 /* !! */  = (int)ho.cfal("cfox", cfaq(int ), (int)168);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 24: {
                var4_3 /* !! */  = (int)ho.cfal("cfoy", cfaq(int ), (int)169);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 25: {
                var4_3 /* !! */  = (int)ho.cfal("cfoz", cfaq(int ), (int)170);
                if (!var5_2) ** GOTO lbl141
                throw null;
            }
lbl237:
            // 2 sources

            case 26: {
                var4_3 /* !! */  = (int)ho.cfal("cfpa", cfaq(int ), (int)171);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 27: {
                var4_3 /* !! */  = (int)ho.cfal("cfpb", cfaq(int ), (int)172);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
            case 28: {
                var4_3 /* !! */  = (int)ho.cfal("cfpc", cfaq(int ), (int)173);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl251:
            // 3 sources

            case 29: {
                var4_3 /* !! */  = (int)ho.cfal("cfpd", cfaq(int ), (int)174);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl256:
            // 2 sources

            case 30: {
                var4_3 /* !! */  = (int)ho.cfal("cfpe", cfaq(int ), (int)175);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl261:
            // 2 sources

            case 31: {
                var4_3 /* !! */  = (int)ho.cfal("cfpf", cfaq(int ), (int)176);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl266:
            // 2 sources

            case 32: {
                var4_3 /* !! */  = (int)ho.cfal("cfpg", cfaq(int ), (int)177);
                if (!var5_2) ** GOTO lbl237
                throw null;
            }
            case 33: {
                var4_3 /* !! */  = (int)ho.cfal("cfph", cfaq(int ), (int)178);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl275:
            // 2 sources

            case 34: {
                var4_3 /* !! */  = (int)ho.cfal("cfpi", cfaq(int ), (int)179);
                if (!var5_2) ** GOTO lbl251
                throw null;
            }
lbl279:
            // 3 sources

            case 35: {
                var4_3 /* !! */  = (int)ho.cfal("cfpj", cfaq(int ), (int)180);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl421
            }
lbl284:
            // 3 sources

            case 36: {
                var4_3 /* !! */  = (int)ho.cfal("cfpk", cfaq(int ), (int)181);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl289:
            // 2 sources

            case 37: {
                var4_3 /* !! */  = (int)ho.cfal("cfpl", cfaq(int ), (int)182);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl294:
            // 2 sources

            case 38: {
                var4_3 /* !! */  = (int)ho.cfal("cfpm", cfaq(int ), (int)183);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 39: {
                var4_3 /* !! */  = (int)ho.cfal("cfpn", cfaq(int ), (int)184);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl304:
            // 4 sources

            case 40: {
                var4_3 /* !! */  = (int)ho.cfal("cfpo", cfaq(int ), (int)185);
                if (!var5_2) ** GOTO lbl256
                throw null;
            }
lbl308:
            // 4 sources

            case 41: {
                var4_3 /* !! */  = (int)ho.cfal("cfpp", cfaq(int ), (int)186);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
lbl313:
            // 2 sources

            case 42: {
                var4_3 /* !! */  = (int)ho.cfal("cfpq", cfaq(int ), (int)187);
                if (!var5_2) ** GOTO lbl151
                throw null;
            }
lbl317:
            // 2 sources

            case 43: {
                var4_3 /* !! */  = (int)ho.cfal("cfpr", cfaq(int ), (int)188);
                if (!var5_2) ** GOTO lbl156
                throw null;
            }
lbl321:
            // 3 sources

            case 44: {
                var4_3 /* !! */  = (int)ho.cfal("cfps", cfaq(int ), (int)189);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 45: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ho.cfal("cfpt", cfaq(int ), (int)190);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl336
                    break;
                }
            }
lbl332:
            // 2 sources

            case 46: {
                var4_3 /* !! */  = (int)ho.cfal("cfpu", cfaq(int ), (int)191);
                if (!var5_2) ** GOTO lbl284
                throw null;
            }
lbl336:
            // 2 sources

            case 47: {
                var4_3 /* !! */  = (int)ho.cfal("cfpv", cfaq(int ), (int)192);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl341:
            // 3 sources

            case 48: {
                var4_3 /* !! */  = (int)ho.cfal("cfpw", cfaq(int ), (int)193);
                if (!var5_2) ** GOTO lbl223
                throw null;
            }
lbl345:
            // 4 sources

            case 49: {
                do {
                    var4_3 /* !! */  = (int)ho.cfal("cfpx", cfaq(int ), (int)194);
                } while (!var5_2);
                throw null;
            }
            case 50: {
                var4_3 /* !! */  = (int)ho.cfal("cfpy", cfaq(int ), (int)195);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl355:
            // 3 sources

            case 51: {
                var4_3 /* !! */  = (int)ho.cfal("cfpz", cfaq(int ), (int)196);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl360:
            // 2 sources

            case 52: {
                var4_3 /* !! */  = (int)ho.cfal("cfqa", cfaq(int ), (int)197);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
            case 53: {
                var4_3 /* !! */  = (int)ho.cfal("cfqb", cfaq(int ), (int)198);
                if (!var5_2) ** GOTO lbl308
                throw null;
            }
lbl369:
            // 2 sources

            case 54: {
                var4_3 /* !! */  = (int)ho.cfal("cfqc", cfaq(int ), (int)199);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl374:
            // 2 sources

            case 55: {
                var4_3 /* !! */  = (int)ho.cfal("cfqd", cfaq(int ), (int)200);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl466
            }
            case 56: {
                var4_3 /* !! */  = (int)ho.cfal("cfqe", cfaq(int ), (int)201);
                if (!var5_2) ** GOTO lbl209
                throw null;
            }
lbl383:
            // 2 sources

            case 57: {
                var4_3 /* !! */  = (int)ho.cfal("cfqf", cfaq(int ), (int)202);
                if (!var5_2) ** GOTO lbl191
                throw null;
            }
lbl387:
            // 2 sources

            case 58: {
                var4_3 /* !! */  = (int)ho.cfal("cfqg", cfaq(int ), (int)203);
                if (!var5_2) ** GOTO lbl313
                throw null;
            }
lbl391:
            // 3 sources

            case 59: {
                var4_3 /* !! */  = (int)ho.cfal("cfqh", cfaq(int ), (int)204);
                if (!var5_2) ** GOTO lbl156
                throw null;
            }
            case 60: {
                var4_3 /* !! */  = (int)ho.cfal("cfqi", cfaq(int ), (int)205);
                if (!var5_2) ** GOTO lbl132
                throw null;
            }
lbl399:
            // 4 sources

            case 61: {
                var4_3 /* !! */  = (int)ho.cfal("cfqj", cfaq(int ), (int)206);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl404:
            // 2 sources

            case 62: {
                var4_3 /* !! */  = (int)ho.cfal("cfqk", cfaq(int ), (int)207);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl438
            }
lbl409:
            // 2 sources

            case 63: {
                var4_3 /* !! */  = (int)ho.cfal("cfql", cfaq(int ), (int)208);
                if (!var5_2) ** GOTO lbl112
                throw null;
            }
lbl413:
            // 3 sources

            case 64: {
                var4_3 /* !! */  = (int)ho.cfal("cfqm", cfaq(int ), (int)209);
                if (!var5_2) ** GOTO lbl279
                throw null;
            }
            case 65: {
                var4_3 /* !! */  = (int)ho.cfal("cfqn", cfaq(int ), (int)210);
                if (!var5_2) ** GOTO lbl355
                throw null;
            }
lbl421:
            // 2 sources

            case 66: {
                var4_3 /* !! */  = (int)ho.cfal("cfqo", cfaq(int ), (int)211);
                if (!var5_2) ** GOTO lbl151
                throw null;
            }
            case 67: {
                var4_3 /* !! */  = (int)ho.cfal("cfqp", cfaq(int ), (int)212);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl430:
            // 2 sources

            case 68: {
                var4_3 /* !! */  = (int)ho.cfal("cfqq", cfaq(int ), (int)213);
                if (!var5_2) ** GOTO lbl332
                throw null;
            }
lbl434:
            // 2 sources

            case 69: {
                var4_3 /* !! */  = (int)ho.cfal("cfqr", cfaq(int ), (int)214);
                if (!var5_2) ** GOTO lbl219
                throw null;
            }
lbl438:
            // 3 sources

            case 70: {
                var4_3 /* !! */  = (int)ho.cfal("cfqs", cfaq(int ), (int)215);
                if (!var5_2) ** GOTO lbl383
                throw null;
            }
            case 71: {
                var4_3 /* !! */  = (int)ho.cfal("cfqt", cfaq(int ), (int)216);
                if (!var5_2) ** GOTO lbl387
                throw null;
            }
            case 72: {
                var4_3 /* !! */  = (int)ho.cfal("cfqu", cfaq(int ), (int)217);
                if (!var5_2) ** GOTO lbl404
                throw null;
            }
            case 73: {
                var4_3 /* !! */  = (int)ho.cfal("cfqv", cfaq(int ), (int)218);
                if (!var5_2) ** GOTO lbl409
                throw null;
            }
            case 74: {
                var4_3 /* !! */  = (int)ho.cfal("cfqw", cfaq(int ), (int)219);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
lbl458:
            // 2 sources

            case 75: {
                var4_3 /* !! */  = (int)ho.cfal("cfqx", cfaq(int ), (int)220);
                if (!var5_2) ** GOTO lbl399
                throw null;
            }
lbl462:
            // 3 sources

            case 76: {
                var4_3 /* !! */  = (int)ho.cfal("cfqy", cfaq(int ), (int)221);
                if (!var5_2) ** GOTO lbl223
                throw null;
            }
lbl466:
            // 3 sources

            case 77: {
                var4_3 /* !! */  = (int)ho.cfal("cfqz", cfaq(int ), (int)222);
                if (!var5_2) ** GOTO lbl317
                throw null;
            }
            case 78: {
                var4_3 /* !! */  = (int)ho.cfal("cfra", cfaq(int ), (int)223);
                if (!var5_2) ** GOTO lbl399
                throw null;
            }
            case 79: {
                var4_3 /* !! */  = (int)ho.cfal("cfrb", cfaq(int ), (int)224);
                if (!var5_2) ** GOTO lbl214
                throw null;
            }
            case 80: {
                var4_3 /* !! */  = (int)ho.cfal("cfrc", cfaq(int ), (int)225);
                if (!var5_2) ** GOTO lbl341
                throw null;
            }
            case 81: {
                var4_3 /* !! */  = (int)ho.cfal("cfrd", cfaq(int ), (int)226);
                if (!var5_2) ** GOTO lbl341
                throw null;
            }
lbl486:
            // 3 sources

            case 82: {
                var4_3 /* !! */  = (int)ho.cfal("cfre", cfaq(int ), (int)227);
                if (!var5_2) ** GOTO lbl369
                throw null;
            }
lbl490:
            // 2 sources

            case 83: {
                var4_3 /* !! */  = (int)ho.cfal("cfrf", cfaq(int ), (int)228);
                if (!var5_2) ** GOTO lbl161
                throw null;
            }
            case 84: 
        }
        var4_3 /* !! */  = (int)ho.cfal("cfrg", cfaq(int ), (int)229);
        ** while (!var5_2)
lbl497:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cgaw() {
        ho.cfar[300] = -931372933;
        ho.cfar[301] = 846591799;
        ho.cfar[302] = 374379931;
        ho.cfar[303] = -1154332479;
        ho.cfar[304] = 2111633187;
        ho.cfar[305] = -948668254;
        ho.cfar[306] = -214974310;
        ho.cfar[307] = 1571077613;
        ho.cfar[308] = -1147201188;
        ho.cfar[309] = -921465760;
        ho.cfar[310] = -1534071323;
        ho.cfar[311] = -1058425294;
        ho.cfar[312] = 802712176;
        ho.cfar[313] = -209788132;
        ho.cfar[314] = -2123105801;
        ho.cfar[315] = 1475021469;
        ho.cfar[316] = 509111721;
        ho.cfar[317] = -1883373639;
        ho.cfar[318] = 1404862962;
        ho.cfar[319] = -1410586838;
        ho.cfar[320] = -1879403590;
        ho.cfar[321] = -2012288734;
        ho.cfar[322] = -1967098219;
        ho.cfar[323] = -399726200;
        ho.cfar[324] = 1518540278;
        ho.cfar[325] = -1153310224;
        ho.cfar[326] = -2096337497;
        ho.cfar[327] = 1059759382;
        ho.cfar[328] = -256275347;
        ho.cfar[329] = -2028390815;
        ho.cfar[330] = -1332727609;
        ho.cfar[331] = -2121284923;
        ho.cfar[332] = 2017352363;
        ho.cfar[333] = -1773306851;
        ho.cfar[334] = -2030677027;
        ho.cfar[335] = -673992126;
        ho.cfar[336] = 449207428;
        ho.cfar[337] = -1207447946;
        ho.cfar[338] = 358207848;
        ho.cfar[339] = 1901173428;
        ho.cfar[340] = -1388677862;
        ho.cfar[341] = 430498900;
        ho.cfar[342] = -1055843003;
        ho.cfar[343] = 50937240;
        ho.cfar[344] = 1793591848;
        ho.cfar[345] = -879040245;
        ho.cfar[346] = 1045945948;
        ho.cfar[347] = -436364891;
        ho.cfar[348] = -1113065182;
        ho.cfar[349] = 1393342175;
        ho.cfar[350] = 908838527;
        ho.cfar[351] = -1909424978;
        ho.cfar[352] = 796072003;
        ho.cfar[353] = 887020960;
    }

    private static /* synthetic */ void cgat() {
        ho.cfar[0] = 1662428747;
        ho.cfar[1] = -1244683181;
        ho.cfar[2] = 345274929;
        ho.cfar[3] = 404376847;
        ho.cfar[4] = -67625809;
        ho.cfar[5] = -174258477;
        ho.cfar[6] = -620675550;
        ho.cfar[7] = -2043593517;
        ho.cfar[8] = -2067511255;
        ho.cfar[9] = 1997584578;
        ho.cfar[10] = 1954216319;
        ho.cfar[11] = -1405096132;
        ho.cfar[12] = -705843499;
        ho.cfar[13] = -1635917381;
        ho.cfar[14] = 650287988;
        ho.cfar[15] = -246652914;
        ho.cfar[16] = 658575153;
        ho.cfar[17] = -1194779754;
        ho.cfar[18] = -1929745890;
        ho.cfar[19] = 937431444;
        ho.cfar[20] = -1727675198;
        ho.cfar[21] = 1734231086;
        ho.cfar[22] = -1604354866;
        ho.cfar[23] = -2092477569;
        ho.cfar[24] = -845908001;
        ho.cfar[25] = -1843823479;
        ho.cfar[26] = 1180494964;
        ho.cfar[27] = 525223217;
        ho.cfar[28] = -1443453889;
        ho.cfar[29] = 1172773720;
        ho.cfar[30] = -997622855;
        ho.cfar[31] = -730679383;
        ho.cfar[32] = 1634752367;
        ho.cfar[33] = 1027726920;
        ho.cfar[34] = -568493150;
        ho.cfar[35] = -1622382949;
        ho.cfar[36] = 1120414747;
        ho.cfar[37] = 870517615;
        ho.cfar[38] = -2030278140;
        ho.cfar[39] = -163236542;
        ho.cfar[40] = 2100494328;
        ho.cfar[41] = 582712013;
        ho.cfar[42] = 1204541973;
        ho.cfar[43] = 1374270911;
        ho.cfar[44] = -1939975968;
        ho.cfar[45] = 860011181;
        ho.cfar[46] = 519249216;
        ho.cfar[47] = -193090411;
        ho.cfar[48] = 1732809912;
        ho.cfar[49] = 966049358;
        ho.cfar[50] = -598784121;
        ho.cfar[51] = 1902661106;
        ho.cfar[52] = -2127886606;
        ho.cfar[53] = -299904277;
        ho.cfar[54] = 1152676881;
        ho.cfar[55] = -460520603;
        ho.cfar[56] = -1548587442;
        ho.cfar[57] = 1214386506;
        ho.cfar[58] = 73119901;
        ho.cfar[59] = 200796243;
        ho.cfar[60] = 1058658373;
        ho.cfar[61] = 1793524638;
        ho.cfar[62] = -424514654;
        ho.cfar[63] = -1361066249;
        ho.cfar[64] = -731475767;
        ho.cfar[65] = -1769114891;
        ho.cfar[66] = -1440374796;
        ho.cfar[67] = -1966559003;
        ho.cfar[68] = -1942693125;
        ho.cfar[69] = -550990208;
        ho.cfar[70] = -623969704;
        ho.cfar[71] = 1487897634;
        ho.cfar[72] = 1165569511;
        ho.cfar[73] = 219079805;
        ho.cfar[74] = 93734558;
        ho.cfar[75] = 1104671522;
        ho.cfar[76] = -745407953;
        ho.cfar[77] = 425515678;
        ho.cfar[78] = -1867682217;
        ho.cfar[79] = 56352262;
        ho.cfar[80] = 1849834212;
        ho.cfar[81] = -589847956;
        ho.cfar[82] = -1132284725;
        ho.cfar[83] = -768337319;
        ho.cfar[84] = -1326623180;
        ho.cfar[85] = -424094425;
        ho.cfar[86] = 194993986;
        ho.cfar[87] = -329256026;
        ho.cfar[88] = -453962509;
        ho.cfar[89] = -2139475923;
        ho.cfar[90] = 1051142653;
        ho.cfar[91] = 1481768787;
        ho.cfar[92] = -1383944555;
        ho.cfar[93] = -650369646;
        ho.cfar[94] = -2045825381;
        ho.cfar[95] = -1440297525;
        ho.cfar[96] = 553689686;
        ho.cfar[97] = 1378281083;
        ho.cfar[98] = -1377903333;
        ho.cfar[99] = 238606952;
    }

    private static /* synthetic */ void cgax() {
        ho.cfas[0] = -1662428748;
        ho.cfas[1] = 1192246637;
        ho.cfas[2] = -345274930;
        ho.cfas[3] = 2023251566;
        ho.cfas[4] = 67625808;
        ho.cfas[5] = -915808888;
        ho.cfas[6] = -620675550;
        ho.cfas[7] = -2043593519;
        ho.cfas[8] = -2067511253;
        ho.cfas[9] = 1997584579;
        ho.cfas[10] = -1954216320;
        ho.cfas[11] = 1405096131;
        ho.cfas[12] = 705843498;
        ho.cfas[13] = -1635917381;
        ho.cfas[14] = 650287989;
        ho.cfas[15] = -246652914;
        ho.cfas[16] = 658575154;
        ho.cfas[17] = -1194779758;
        ho.cfas[18] = -1929745891;
        ho.cfas[19] = 937431442;
        ho.cfas[20] = -1727675189;
        ho.cfas[21] = 1734231080;
        ho.cfas[22] = -1604354869;
        ho.cfas[23] = -2092477576;
        ho.cfas[24] = -845908002;
        ho.cfas[25] = -1843823479;
        ho.cfas[26] = 1180494962;
        ho.cfas[27] = -525223218;
        ho.cfas[28] = 1443453888;
        ho.cfas[29] = -1172773721;
        ho.cfas[30] = 997622854;
        ho.cfas[31] = 730679382;
        ho.cfas[32] = 1634752366;
        ho.cfas[33] = 1027726920;
        ho.cfas[34] = -568493150;
        ho.cfas[35] = -1622382950;
        ho.cfas[36] = 1120414746;
        ho.cfas[37] = 870517569;
        ho.cfas[38] = -2030278101;
        ho.cfas[39] = -163236540;
        ho.cfas[40] = 2100494310;
        ho.cfas[41] = 582712036;
        ho.cfas[42] = 1204542006;
        ho.cfas[43] = 1374270892;
        ho.cfas[44] = -1939975954;
        ho.cfas[45] = 860011190;
        ho.cfas[46] = 519249254;
        ho.cfas[47] = -193090383;
        ho.cfas[48] = 1732809868;
        ho.cfas[49] = 966049381;
        ho.cfas[50] = -598784103;
        ho.cfas[51] = 1902661067;
        ho.cfas[52] = -2127886634;
        ho.cfas[53] = -299904264;
        ho.cfas[54] = 1152676869;
        ho.cfas[55] = -460520608;
        ho.cfas[56] = -1548587413;
        ho.cfas[57] = 1214386503;
        ho.cfas[58] = 73119901;
        ho.cfas[59] = 200796247;
        ho.cfas[60] = 1058658415;
        ho.cfas[61] = 1793524654;
        ho.cfas[62] = -424514631;
        ho.cfas[63] = -1361066261;
        ho.cfas[64] = -731475757;
        ho.cfas[65] = -1769114883;
        ho.cfas[66] = -1440374795;
        ho.cfas[67] = -1966559039;
        ho.cfas[68] = -1942693159;
        ho.cfas[69] = -550990158;
        ho.cfas[70] = -623969704;
        ho.cfas[71] = 1487897659;
        ho.cfas[72] = 1165569495;
        ho.cfas[73] = 219079785;
        ho.cfas[74] = 93734585;
        ho.cfas[75] = 1104671502;
        ho.cfas[76] = -745407942;
        ho.cfas[77] = 425515667;
        ho.cfas[78] = -1867682211;
        ho.cfas[79] = 56352273;
        ho.cfas[80] = 1849834189;
        ho.cfas[81] = -589847962;
        ho.cfas[82] = -1132284699;
        ho.cfas[83] = -768337320;
        ho.cfas[84] = -1326623173;
        ho.cfas[85] = -424094444;
        ho.cfas[86] = 194994022;
        ho.cfas[87] = -329256063;
        ho.cfas[88] = -453962542;
        ho.cfas[89] = -2139475905;
        ho.cfas[90] = 1051142617;
        ho.cfas[91] = 1481768781;
        ho.cfas[92] = -1383944567;
        ho.cfas[93] = -650369621;
        ho.cfas[94] = -2045825355;
        ho.cfas[95] = 1440297524;
        ho.cfas[96] = -1150737190;
        ho.cfas[97] = 1378281082;
        ho.cfas[98] = 1892405346;
        ho.cfas[99] = -238606953;
    }

    private static /* synthetic */ float cfjk(int n2) {
        return Float.intBitsToFloat(cfar[n2] ^ cfas[n2]);
    }

    private static /* synthetic */ long cfai(int n2) {
        return cfaj[n2] ^ cfak[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ho.fp - ho.cfal("cgaa", cfai(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ho.cfal("cgab", cfaq(int ), (int)342)) break;
            v0 /* !! */  = (long)ho.cfal("cgac", cfaq(int ), (int)343);
        }
        var3_1 = ho.c;
        v1 /* !! */  = ho.fp;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - ho.cfal("cgad", cfai(int ), (int)68));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1663882263: {
                    v2 = ho.cfal("cgae", cfai(int ), (int)69);
                    continue block15;
                }
                case -1601091747: {
                    break block15;
                }
                case -392614634: {
                    v2 = ho.cfal("cgaf", cfai(int ), (int)70);
                    continue block15;
                }
                case 1156290966: {
                    v2 = ho.cfal("cgag", cfai(int ), (int)71);
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ho.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ho.fp - ho.cfal("cgah", cfai(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ho.cfal("cgai", cfaq(int ), (int)344)) break;
            v3 /* !! */  = (long)ho.cfal("cgaj", cfaq(int ), (int)345);
        }
        var1_3 = ho.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl35:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl35
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ho.fp - ho.cfal("cgak", cfai(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ho.cfal("cgal", cfaq(int ), (int)346)) break;
                    v4 /* !! */  = (long)ho.cfal("cgam", cfaq(int ), (int)347);
                }
                this.restoreAndCleanup();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl46:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ho.cfal("cgan", cfaq(int ), (int)348);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ho.cfal("cgao", cfaq(int ), (int)349);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
lbl54:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ho.cfal("cgap", cfaq(int ), (int)350);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
            }
lbl59:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ho.cfal("cgaq", cfaq(int ), (int)351);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ho.cfal("cgar", cfaq(int ), (int)352);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ho.cfal("cgas", cfaq(int ), (int)353);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cgbc() {
        ho.cfak[0] = -8571860476390851972L;
        ho.cfak[1] = 2320236372544169312L;
        ho.cfak[2] = 9176135799524018524L;
        ho.cfak[3] = -2397034516420773429L;
        ho.cfak[4] = 4831597502334826316L;
        ho.cfak[5] = 282758491908159060L;
        ho.cfak[6] = 2818715094559503684L;
        ho.cfak[7] = 4129104514461982549L;
        ho.cfak[8] = 7882196561106180017L;
        ho.cfak[9] = -649694690249345466L;
        ho.cfak[10] = 2010602129972133264L;
        ho.cfak[11] = 2535403244946615765L;
        ho.cfak[12] = 5010326704716474175L;
        ho.cfak[13] = 6323220171518643334L;
        ho.cfak[14] = 9048632289888707777L;
        ho.cfak[15] = -9136558294151874056L;
        ho.cfak[16] = -5933855064750411429L;
        ho.cfak[17] = 264575583293039534L;
        ho.cfak[18] = 1820668762444710102L;
        ho.cfak[19] = -1691513126985686716L;
        ho.cfak[20] = -434687166105613304L;
        ho.cfak[21] = 7399816932919520599L;
        ho.cfak[22] = -4469229618801655429L;
        ho.cfak[23] = -2572990397442895737L;
        ho.cfak[24] = 1674555739338320252L;
        ho.cfak[25] = 477092037992497961L;
        ho.cfak[26] = 7901390265312251143L;
        ho.cfak[27] = 63595541915706048L;
        ho.cfak[28] = 5496979842843823694L;
        ho.cfak[29] = 2455855389503712675L;
        ho.cfak[30] = -5650397811292113377L;
        ho.cfak[31] = -2861154490624951445L;
        ho.cfak[32] = 6577308022781470333L;
        ho.cfak[33] = -8913747915914855259L;
        ho.cfak[34] = 4346238503770018308L;
        ho.cfak[35] = 1042777151763561406L;
        ho.cfak[36] = -3861647666457672612L;
        ho.cfak[37] = -3993594337241314536L;
        ho.cfak[38] = -4510395685258394701L;
        ho.cfak[39] = 1987976475249694957L;
        ho.cfak[40] = 759029167848266320L;
        ho.cfak[41] = 8977746397800079685L;
        ho.cfak[42] = 7793982521678182698L;
        ho.cfak[43] = 6659619626471309742L;
        ho.cfak[44] = 2279265047619627082L;
        ho.cfak[45] = 1373578310444058888L;
        ho.cfak[46] = -988077483422681841L;
        ho.cfak[47] = 3962663425735644503L;
        ho.cfak[48] = -5513930345653163167L;
        ho.cfak[49] = 4253846206873712537L;
        ho.cfak[50] = -3120355408264997336L;
        ho.cfak[51] = -194968659620318509L;
        ho.cfak[52] = 7642334478366744965L;
        ho.cfak[53] = 2897434509771727870L;
        ho.cfak[54] = 99235996261139610L;
        ho.cfak[55] = 8807720619146046405L;
        ho.cfak[56] = 8416612019289147190L;
        ho.cfak[57] = -6046007992848480975L;
        ho.cfak[58] = 5196235275934969525L;
        ho.cfak[59] = 2719217387167211291L;
        ho.cfak[60] = 7538331061894701797L;
        ho.cfak[61] = -99688887366215621L;
        ho.cfak[62] = 4898743315464177762L;
        ho.cfak[63] = -670742908045844594L;
        ho.cfak[64] = 3257026955682676819L;
        ho.cfak[65] = 5358530630838295863L;
        ho.cfak[66] = -1695635648296057975L;
        ho.cfak[67] = -7257002184054307432L;
        ho.cfak[68] = -7688475286051883940L;
        ho.cfak[69] = -5188006689803442672L;
        ho.cfak[70] = 5987193165440685060L;
        ho.cfak[71] = -8204347865420009470L;
        ho.cfak[72] = -7949118585533086387L;
        ho.cfak[73] = -8353395997382284405L;
    }

    private static /* synthetic */ void cgaz() {
        ho.cfas[200] = -527106902;
        ho.cfas[201] = -1660801477;
        ho.cfas[202] = 1574569893;
        ho.cfas[203] = 1922432765;
        ho.cfas[204] = 510018561;
        ho.cfas[205] = 168215641;
        ho.cfas[206] = 1538420353;
        ho.cfas[207] = -1057895421;
        ho.cfas[208] = 1965886997;
        ho.cfas[209] = 134856088;
        ho.cfas[210] = 338672887;
        ho.cfas[211] = -418542280;
        ho.cfas[212] = -583963316;
        ho.cfas[213] = 647522850;
        ho.cfas[214] = 1966006194;
        ho.cfas[215] = 380126066;
        ho.cfas[216] = -1163875239;
        ho.cfas[217] = 1439038119;
        ho.cfas[218] = -1784933477;
        ho.cfas[219] = 908540589;
        ho.cfas[220] = 1437227306;
        ho.cfas[221] = -461243537;
        ho.cfas[222] = -2125904550;
        ho.cfas[223] = -899855038;
        ho.cfas[224] = 1990760965;
        ho.cfas[225] = -277680978;
        ho.cfas[226] = 374105372;
        ho.cfas[227] = 665232983;
        ho.cfas[228] = 446050541;
        ho.cfas[229] = 376540187;
        ho.cfas[230] = 1263980874;
        ho.cfas[231] = -1149852733;
        ho.cfas[232] = 1216129992;
        ho.cfas[233] = -2003406311;
        ho.cfas[234] = -1837083521;
        ho.cfas[235] = -792592558;
        ho.cfas[236] = -1307678893;
        ho.cfas[237] = 1907880943;
        ho.cfas[238] = -477147225;
        ho.cfas[239] = 206554972;
        ho.cfas[240] = -1830153805;
        ho.cfas[241] = -1187846882;
        ho.cfas[242] = 1579960303;
        ho.cfas[243] = -1330648621;
        ho.cfas[244] = -1988517330;
        ho.cfas[245] = -368575500;
        ho.cfas[246] = -1364014257;
        ho.cfas[247] = -1171621133;
        ho.cfas[248] = -1150413440;
        ho.cfas[249] = -1930391943;
        ho.cfas[250] = -1379010731;
        ho.cfas[251] = -2116208598;
        ho.cfas[252] = -2142485263;
        ho.cfas[253] = 882725780;
        ho.cfas[254] = 2130005037;
        ho.cfas[255] = 1924305716;
        ho.cfas[256] = -1417939065;
        ho.cfas[257] = -679230543;
        ho.cfas[258] = -285917137;
        ho.cfas[259] = -778790514;
        ho.cfas[260] = -1314213394;
        ho.cfas[261] = -2076321072;
        ho.cfas[262] = -613062719;
        ho.cfas[263] = -2138888848;
        ho.cfas[264] = 1646904918;
        ho.cfas[265] = 789427353;
        ho.cfas[266] = 749461975;
        ho.cfas[267] = 86485497;
        ho.cfas[268] = -717029732;
        ho.cfas[269] = 1307989426;
        ho.cfas[270] = 37521597;
        ho.cfas[271] = 375197356;
        ho.cfas[272] = -1523891033;
        ho.cfas[273] = 260519509;
        ho.cfas[274] = -19666156;
        ho.cfas[275] = 278220314;
        ho.cfas[276] = 801959188;
        ho.cfas[277] = 608002588;
        ho.cfas[278] = 2022330649;
        ho.cfas[279] = 1500367841;
        ho.cfas[280] = 387549205;
        ho.cfas[281] = 758530335;
        ho.cfas[282] = -233090515;
        ho.cfas[283] = 979277268;
        ho.cfas[284] = 103636118;
        ho.cfas[285] = 1243438656;
        ho.cfas[286] = -691880304;
        ho.cfas[287] = -796916613;
        ho.cfas[288] = -645074527;
        ho.cfas[289] = -453001532;
        ho.cfas[290] = 945283440;
        ho.cfas[291] = -819630403;
        ho.cfas[292] = 979847682;
        ho.cfas[293] = -2109432026;
        ho.cfas[294] = -1051959518;
        ho.cfas[295] = 1673716955;
        ho.cfas[296] = -28461523;
        ho.cfas[297] = -558585561;
        ho.cfas[298] = 717501358;
        ho.cfas[299] = 645867168;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreAndCleanup() {
        block83: {
            block84: {
                var3_1 = ho.c;
                var2_2 /* !! */  = ho.b;
                var1_3 = ho.a;
                if (var3_1) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl6
                if (ho.mc.field_1724 == null) break block83;
                if (var1_3 || var1_3) ** GOTO lbl6
                if (!this.fromHotbar) break block84;
                if (var1_3) ** GOTO lbl6
                if (this.previousSlot < 0) break block84;
                if (var1_3 || var1_3) ** GOTO lbl6
                nv.selectSlot(this.previousSlot);
                if (var1_3) ** GOTO lbl6
                if (var3_1) {
                    throw null;
                }
                break block83;
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            if (!this.inventorySwapApplied) break block83;
            if (var1_3) ** GOTO lbl6
            if (this.chargeSlot < 0) break block83;
            if (var1_3) ** GOTO lbl6
            if (this.temporaryHotbarSlot < 0) break block83;
            if (var1_3 || var1_3) ** GOTO lbl6
            nv.swapHotbar(this.chargeSlot, this.temporaryHotbarSlot);
            if (var1_3) ** GOTO lbl6
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl6
                ot.INSTANCE.releaseProvider(this);
                if (var1_3 || var1_3) ** GOTO lbl6
                if (!this.movement.isBlocked()) ** GOTO lbl41
                if (var1_3 || var1_3) ** GOTO lbl6
                this.movement.restoreFromCurrent();
                if (var1_3) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl6
                this.movement.reset();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.phase = ho$Phase.IDLE;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.previousSlot = (int)ho.cfal("cfuk", cfaq(int ), (int)293);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.chargeSlot = (int)ho.cfal("cful", cfaq(int ), (int)294);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.temporaryHotbarSlot = (int)ho.cfal("cfum", cfaq(int ), (int)295);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.waitTicks = (int)ho.cfal("cfun", cfaq(int ), (int)296);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.fromHotbar = ho.cfal("cfuo", cfaq(int ), (int)297);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.inventorySwapApplied = ho.cfal("cfup", cfaq(int ), (int)298);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ho.cfal("cfuq", cfaq(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl65:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ho.cfal("cfur", cfaq(int ), (int)300);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 2: {
                var2_2 /* !! */  = (int)ho.cfal("cfus", cfaq(int ), (int)301);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 3: {
                var2_2 /* !! */  = (int)ho.cfal("cfut", cfaq(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 4: {
                var2_2 /* !! */  = (int)ho.cfal("cfuu", cfaq(int ), (int)303);
                if (!var3_1) break;
                throw null;
            }
lbl84:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ho.cfal("cfuv", cfaq(int ), (int)304);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl89:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ho.cfal("cfuw", cfaq(int ), (int)305);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 7: {
                var2_2 /* !! */  = (int)ho.cfal("cfux", cfaq(int ), (int)306);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ho.cfal("cfuy", cfaq(int ), (int)307);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl103:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ho.cfal("cfuz", cfaq(int ), (int)308);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 10: {
                var2_2 /* !! */  = (int)ho.cfal("cfva", cfaq(int ), (int)309);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl113:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ho.cfal("cfvb", cfaq(int ), (int)310);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl118:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)ho.cfal("cfvc", cfaq(int ), (int)311);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 13: {
                var2_2 /* !! */  = (int)ho.cfal("cfvd", cfaq(int ), (int)312);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl127:
            // 6 sources

            case 14: {
                var2_2 /* !! */  = (int)ho.cfal("cfve", cfaq(int ), (int)313);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 15: {
                do {
                    var2_2 /* !! */  = (int)ho.cfal("cfvf", cfaq(int ), (int)314);
                } while (!var3_1);
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)ho.cfal("cfvg", cfaq(int ), (int)315);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl142:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)ho.cfal("cfvh", cfaq(int ), (int)316);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
lbl146:
            // 4 sources

            case 18: {
                var2_2 /* !! */  = (int)ho.cfal("cfvi", cfaq(int ), (int)317);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 19: {
                var2_2 /* !! */  = (int)ho.cfal("cfvj", cfaq(int ), (int)318);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
lbl155:
            // 3 sources

            case 20: {
                var2_2 /* !! */  = (int)ho.cfal("cfvk", cfaq(int ), (int)319);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 21: {
                var2_2 /* !! */  = (int)ho.cfal("cfvl", cfaq(int ), (int)320);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl164:
            // 3 sources

            case 22: {
                var2_2 /* !! */  = (int)ho.cfal("cfvm", cfaq(int ), (int)321);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl169:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)ho.cfal("cfvn", cfaq(int ), (int)322);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
lbl173:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)ho.cfal("cfvo", cfaq(int ), (int)323);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)ho.cfal("cfvp", cfaq(int ), (int)324);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
lbl181:
            // 2 sources

            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ho.cfal("cfvq", cfaq(int ), (int)325);
                    if (!var3_1) ** GOTO lbl113
                    throw null;
                }
            }
            case 27: {
                var2_2 /* !! */  = (int)ho.cfal("cfvr", cfaq(int ), (int)326);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 28: {
                var2_2 /* !! */  = (int)ho.cfal("cfvs", cfaq(int ), (int)327);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl195:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)ho.cfal("cfvt", cfaq(int ), (int)328);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl200:
            // 3 sources

            case 30: {
                var2_2 /* !! */  = (int)ho.cfal("cfvu", cfaq(int ), (int)329);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 31: {
                var2_2 /* !! */  = (int)ho.cfal("cfvv", cfaq(int ), (int)330);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl209:
            // 4 sources

            case 32: {
                var2_2 /* !! */  = (int)ho.cfal("cfvw", cfaq(int ), (int)331);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
lbl213:
            // 3 sources

            case 33: {
                var2_2 /* !! */  = (int)ho.cfal("cfvx", cfaq(int ), (int)332);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 34: {
                var2_2 /* !! */  = (int)ho.cfal("cfvy", cfaq(int ), (int)333);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 35: {
                var2_2 /* !! */  = (int)ho.cfal("cfvz", cfaq(int ), (int)334);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 36: {
                var2_2 /* !! */  = (int)ho.cfal("cfwa", cfaq(int ), (int)335);
                if (!var3_1) break;
                throw null;
            }
lbl229:
            // 3 sources

            case 37: {
                var2_2 /* !! */  = (int)ho.cfal("cfwb", cfaq(int ), (int)336);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
            case 38: {
                var2_2 /* !! */  = (int)ho.cfal("cfwc", cfaq(int ), (int)337);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl237:
            // 2 sources

            case 39: {
                var2_2 /* !! */  = (int)ho.cfal("cfwd", cfaq(int ), (int)338);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
lbl241:
            // 3 sources

            case 40: {
                var2_2 /* !! */  = (int)ho.cfal("cfwe", cfaq(int ), (int)339);
                if (!var3_1) ** GOTO lbl213
                throw null;
            }
            case 41: {
                do {
                    var2_2 /* !! */  = (int)ho.cfal("cfzy", cfaq(int ), (int)340);
                } while (!var3_1);
                throw null;
            }
            case 42: 
        }
        var2_2 /* !! */  = (int)ho.cfal("cfzz", cfaq(int ), (int)341);
        ** while (!var3_1)
lbl253:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ho() {
        var2_1 /* !! */  = ho.b;
        var1_2 = ho.a;
        super("MaceHelper", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0437\u0430\u0440\u044f\u0434 \u0432\u0435\u0442\u0440\u0430 \u043f\u043e\u0434 \u0441\u043e\u0431\u043e\u0439 \u0434\u043b\u044f \u0432\u044b\u0441\u043e\u043a\u043e\u0433\u043e \u043f\u043e\u0434\u043b\u0451\u0442\u0430", du.RAGE);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.windChargeBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0437\u0430\u0440\u044f\u0434\u0430 \u0432\u0435\u0442\u0440\u0430", "\u041f\u0440\u044b\u0433\u0430\u0435\u0442 \u0438 \u0431\u0440\u043e\u0441\u0430\u0435\u0442 \u0437\u0430\u0440\u044f\u0434 \u0432\u0435\u0442\u0440\u0430 \u0441\u0442\u0440\u043e\u0433\u043e \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u0430");
                this.movement = new nx();
                this.phase = ho$Phase.IDLE;
                this.previousSlot = (int)ho.cfal("cfbf", cfaq(int ), (int)10);
                this.chargeSlot = (int)ho.cfal("cfbg", cfaq(int ), (int)11);
                this.temporaryHotbarSlot = (int)ho.cfal("cfbh", cfaq(int ), (int)12);
                this.silentRotation = new os(new ho$WindChargeSmooth(), (boolean)ho.cfal("cfbi", cfaq(int ), (int)13), (boolean)ho.cfal("cfbj", cfaq(int ), (int)14), (boolean)ho.cfal("cfbk", cfaq(int ), (int)15));
                this.settings(new jx[]{this.windChargeBind});
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ho.cfal("cfbl", cfaq(int ), (int)16);
                }
            }
lbl20:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ho.cfal("cfbm", cfaq(int ), (int)17);
                ** GOTO lbl38
            }
lbl23:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ho.cfal("cfbn", cfaq(int ), (int)18);
                ** GOTO lbl44
            }
lbl26:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ho.cfal("cfbo", cfaq(int ), (int)19);
                    ** GOTO lbl23
                    break;
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)ho.cfal("cfbp", cfaq(int ), (int)20);
                ** GOTO lbl26
            }
            case 5: {
                var2_1 /* !! */  = (int)ho.cfal("cfbq", cfaq(int ), (int)21);
                ** GOTO lbl23
            }
            case 6: {
                var2_1 /* !! */  = (int)ho.cfal("cfbr", cfaq(int ), (int)22);
            }
lbl38:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)ho.cfal("cfbs", cfaq(int ), (int)23);
                break;
            }
lbl41:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)ho.cfal("cfbt", cfaq(int ), (int)24);
                ** GOTO lbl20
            }
lbl44:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)ho.cfal("cfbu", cfaq(int ), (int)25);
                ** GOTO lbl41
            }
            case 10: 
        }
        var2_1 /* !! */  = (int)ho.cfal("cfbv", cfaq(int ), (int)26);
        ** while (true)
    }

    private static /* synthetic */ void cgbb() {
        ho.cfaj[0] = -8481295429890768161L;
        ho.cfaj[1] = -4381622713130608413L;
        ho.cfaj[2] = 5786569027308297654L;
        ho.cfaj[3] = 917005547862751977L;
        ho.cfaj[4] = 8848205387763634210L;
        ho.cfaj[5] = 2271134753157324999L;
        ho.cfaj[6] = 3393725304421564294L;
        ho.cfaj[7] = 1598145876883590929L;
        ho.cfaj[8] = 7804808265132628379L;
        ho.cfaj[9] = -3429268422653285722L;
        ho.cfaj[10] = 2786126550537354736L;
        ho.cfaj[11] = -5619455336442044654L;
        ho.cfaj[12] = -8364119667867357918L;
        ho.cfaj[13] = 5793280170448784916L;
        ho.cfaj[14] = -5486880291754394354L;
        ho.cfaj[15] = 4948196159437825820L;
        ho.cfaj[16] = 5621157666155537656L;
        ho.cfaj[17] = 6195130443165163799L;
        ho.cfaj[18] = 1060074631592598666L;
        ho.cfaj[19] = 8270566742444860048L;
        ho.cfaj[20] = -2375133849873300672L;
        ho.cfaj[21] = -7556324077417367555L;
        ho.cfaj[22] = 8785897455312961622L;
        ho.cfaj[23] = 9067214459373738150L;
        ho.cfaj[24] = -2639471339593387948L;
        ho.cfaj[25] = -6368363829771358697L;
        ho.cfaj[26] = -2733706540531625563L;
        ho.cfaj[27] = -5160831843777195080L;
        ho.cfaj[28] = -5764123516519422057L;
        ho.cfaj[29] = 8207723039583459009L;
        ho.cfaj[30] = 1685041034416000103L;
        ho.cfaj[31] = -8349187890973214582L;
        ho.cfaj[32] = 1169589620656963842L;
        ho.cfaj[33] = -6685063370906247959L;
        ho.cfaj[34] = 7537375765681118202L;
        ho.cfaj[35] = 4252508284404423947L;
        ho.cfaj[36] = -6040635187645811205L;
        ho.cfaj[37] = 3804968539015445577L;
        ho.cfaj[38] = 3289648324696482589L;
        ho.cfaj[39] = -7007604036336562140L;
        ho.cfaj[40] = 8929423347410830364L;
        ho.cfaj[41] = 4359056092417239446L;
        ho.cfaj[42] = -7424200427352353394L;
        ho.cfaj[43] = -1159890073412368032L;
        ho.cfaj[44] = 1933032270446355037L;
        ho.cfaj[45] = 5887236499673662561L;
        ho.cfaj[46] = -8097715286858460800L;
        ho.cfaj[47] = -6302535416718945019L;
        ho.cfaj[48] = -7823749733752869650L;
        ho.cfaj[49] = 6114096606129470719L;
        ho.cfaj[50] = 6170985318488292136L;
        ho.cfaj[51] = -2212254415956779693L;
        ho.cfaj[52] = -7145526399137208681L;
        ho.cfaj[53] = -7930507966353256876L;
        ho.cfaj[54] = -7834872369884687633L;
        ho.cfaj[55] = 8735801502733428945L;
        ho.cfaj[56] = -1515017964594760553L;
        ho.cfaj[57] = -6429058054763417917L;
        ho.cfaj[58] = -7895856590911405348L;
        ho.cfaj[59] = -817319843638677737L;
        ho.cfaj[60] = -7639382601718132570L;
        ho.cfaj[61] = 3146731444055064402L;
        ho.cfaj[62] = -3704604029784335471L;
        ho.cfaj[63] = 4506358143172752057L;
        ho.cfaj[64] = 5501652132851470555L;
        ho.cfaj[65] = -707364831567748540L;
        ho.cfaj[66] = -7420586636524866741L;
        ho.cfaj[67] = 6796980054111513029L;
        ho.cfaj[68] = -3444854636897539888L;
        ho.cfaj[69] = 7551970748478701659L;
        ho.cfaj[70] = -7984399188909641443L;
        ho.cfaj[71] = -5267657553681473174L;
        ho.cfaj[72] = 5095249651835535274L;
        ho.cfaj[73] = -2933667491175977618L;
    }

    private static /* synthetic */ void cgba() {
        ho.cfas[300] = -931372960;
        ho.cfas[301] = 846591785;
        ho.cfas[302] = 374379921;
        ho.cfas[303] = -1154332458;
        ho.cfas[304] = 2111633156;
        ho.cfas[305] = -948668227;
        ho.cfas[306] = -214974275;
        ho.cfas[307] = 1571077628;
        ho.cfas[308] = -1147201192;
        ho.cfas[309] = -921465734;
        ho.cfas[310] = -1534071324;
        ho.cfas[311] = -1058425291;
        ho.cfas[312] = 802712144;
        ho.cfas[313] = -209788144;
        ho.cfas[314] = -2123105803;
        ho.cfas[315] = 1475021442;
        ho.cfas[316] = 509111738;
        ho.cfas[317] = -1883373668;
        ho.cfas[318] = 1404862950;
        ho.cfas[319] = -1410586829;
        ho.cfas[320] = -1879403613;
        ho.cfas[321] = -2012288707;
        ho.cfas[322] = -1967098188;
        ho.cfas[323] = -399726182;
        ho.cfas[324] = 1518540280;
        ho.cfas[325] = -1153310234;
        ho.cfas[326] = -2096337497;
        ho.cfas[327] = 1059759362;
        ho.cfas[328] = -256275345;
        ho.cfas[329] = -2028390795;
        ho.cfas[330] = -1332727590;
        ho.cfas[331] = -2121284897;
        ho.cfas[332] = 2017352359;
        ho.cfas[333] = -1773306876;
        ho.cfas[334] = -2030676998;
        ho.cfas[335] = -673992122;
        ho.cfas[336] = 449207438;
        ho.cfas[337] = -1207447937;
        ho.cfas[338] = 358207821;
        ho.cfas[339] = 1901173406;
        ho.cfas[340] = -1388677886;
        ho.cfas[341] = 430498935;
        ho.cfas[342] = 1055843002;
        ho.cfas[343] = -238220236;
        ho.cfas[344] = -1793591849;
        ho.cfas[345] = -1209977223;
        ho.cfas[346] = -1045945949;
        ho.cfas[347] = -1791771030;
        ho.cfas[348] = -1113065181;
        ho.cfas[349] = 1393342173;
        ho.cfas[350] = 908838522;
        ho.cfas[351] = -1909424980;
        ho.cfas[352] = 796072002;
        ho.cfas[353] = 887020962;
    }

    private static /* synthetic */ void cgav() {
        ho.cfar[200] = -527106916;
        ho.cfar[201] = -1660801412;
        ho.cfar[202] = 1574569963;
        ho.cfar[203] = 1922432767;
        ho.cfar[204] = 510018574;
        ho.cfar[205] = 168215642;
        ho.cfar[206] = 1538420377;
        ho.cfar[207] = -1057895362;
        ho.cfar[208] = 1965886988;
        ho.cfar[209] = 134856103;
        ho.cfar[210] = 338672822;
        ho.cfar[211] = -418542332;
        ho.cfar[212] = -583963297;
        ho.cfar[213] = 647522852;
        ho.cfar[214] = 1966006189;
        ho.cfar[215] = 380126003;
        ho.cfar[216] = -1163875226;
        ho.cfar[217] = 1439038094;
        ho.cfar[218] = -1784933488;
        ho.cfar[219] = 908540554;
        ho.cfar[220] = 1437227304;
        ho.cfar[221] = -461243573;
        ho.cfar[222] = -2125904622;
        ho.cfar[223] = -899854987;
        ho.cfar[224] = 1990760975;
        ho.cfar[225] = -277680897;
        ho.cfar[226] = 374105403;
        ho.cfar[227] = 665232985;
        ho.cfar[228] = 446050508;
        ho.cfar[229] = 376540195;
        ho.cfar[230] = -1263980875;
        ho.cfar[231] = -1895887974;
        ho.cfar[232] = 1216129993;
        ho.cfar[233] = -899486494;
        ho.cfar[234] = 1837083520;
        ho.cfar[235] = 813612177;
        ho.cfar[236] = 1307678892;
        ho.cfar[237] = -999102687;
        ho.cfar[238] = -477147226;
        ho.cfar[239] = -759308670;
        ho.cfar[240] = -1830153806;
        ho.cfar[241] = 1187846881;
        ho.cfar[242] = -365043109;
        ho.cfar[243] = 1330648620;
        ho.cfar[244] = -110788974;
        ho.cfar[245] = -368575498;
        ho.cfar[246] = -1364014265;
        ho.cfar[247] = -1171621128;
        ho.cfar[248] = -1150413434;
        ho.cfar[249] = -1930391937;
        ho.cfar[250] = -1379010734;
        ho.cfar[251] = -2116208597;
        ho.cfar[252] = -2142485263;
        ho.cfar[253] = 882725788;
        ho.cfar[254] = 2130005036;
        ho.cfar[255] = 1924305714;
        ho.cfar[256] = -1417939069;
        ho.cfar[257] = -1791507535;
        ho.cfar[258] = -285917138;
        ho.cfar[259] = -778790517;
        ho.cfar[260] = -1314213387;
        ho.cfar[261] = -2076321076;
        ho.cfar[262] = -613062712;
        ho.cfar[263] = -2138888854;
        ho.cfar[264] = 1646904899;
        ho.cfar[265] = 789427331;
        ho.cfar[266] = 749461972;
        ho.cfar[267] = 86485503;
        ho.cfar[268] = -717029758;
        ho.cfar[269] = 1307989431;
        ho.cfar[270] = 37521597;
        ho.cfar[271] = 375197366;
        ho.cfar[272] = -1523891017;
        ho.cfar[273] = 260519497;
        ho.cfar[274] = -19666167;
        ho.cfar[275] = 278220309;
        ho.cfar[276] = 801959192;
        ho.cfar[277] = 608002574;
        ho.cfar[278] = 2022330652;
        ho.cfar[279] = 1500367846;
        ho.cfar[280] = 387549210;
        ho.cfar[281] = 758530366;
        ho.cfar[282] = -233090498;
        ho.cfar[283] = 979277257;
        ho.cfar[284] = 103636114;
        ho.cfar[285] = 1243438680;
        ho.cfar[286] = -691880309;
        ho.cfar[287] = -796916621;
        ho.cfar[288] = -645074506;
        ho.cfar[289] = -453001529;
        ho.cfar[290] = 945283409;
        ho.cfar[291] = -819630430;
        ho.cfar[292] = 979847690;
        ho.cfar[293] = 2109432025;
        ho.cfar[294] = 1051959517;
        ho.cfar[295] = -1673716956;
        ho.cfar[296] = -28461523;
        ho.cfar[297] = -558585561;
        ho.cfar[298] = 717501358;
        ho.cfar[299] = 645867146;
    }

    private static /* synthetic */ int cfaq(int n2) {
        return cfar[n2] ^ cfas[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacketSent(cs var1_1) {
        var6_2 = ho.c;
        var5_3 /* !! */  = ho.b;
        var4_4 = ho.a;
        if (var6_2) {
            throw null;
lbl6:
            // 19 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (this.phase != ho$Phase.WAIT_AIRBORNE_PACKET) ** GOTO lbl49
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_5 = var1_1.getPacket();
        if (var4_4) ** GOTO lbl6
        if (!(var3_5 instanceof class_2828)) ** GOTO lbl49
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                var2_7 = (class_2828)var3_5;
                if (var4_4 || var4_4) ** GOTO lbl6
                if (var2_7.method_12273()) ** GOTO lbl49
                if (var4_4) ** GOTO lbl6
                if (ho.mc.field_1724 == null) ** GOTO lbl49
                if (var4_4) ** GOTO lbl6
                if (ho.mc.field_1724.method_24828()) ** GOTO lbl49
                if (var4_4) ** GOTO lbl6
                if (!(ho.mc.field_1724.method_18798().field_1351 > 0.0)) ** GOTO lbl49
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.fromHotbar) ** GOTO lbl34
                if (var4_4) ** GOTO lbl6
                v0 = this.chargeSlot;
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl36
lbl34:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                v0 = var3_6 = this.temporaryHotbarSlot;
lbl36:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (ho.mc.field_1724.method_31548().method_5438(var3_6).method_31574(class_1802.field_49098)) ** GOTO lbl42
                if (var4_4 || var4_4) ** GOTO lbl6
                this.restoreAndCleanup();
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl42:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                pn.interactItem(class_1268.field_5808, new ov(ho.mc.field_1724.method_36454(), (float)ho.cfal("cfta", cfjk(int ), (int)257)));
                if (var4_4 || var4_4) ** GOTO lbl6
                this.phase = ho$Phase.WAIT_RESTORE;
                if (var4_4 || var4_4) ** GOTO lbl6
                this.waitTicks = (int)ho.cfal("cftb", cfaq(int ), (int)258);
                if (var4_4) ** GOTO lbl6
lbl49:
                // 7 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)ho.cfal("cftc", cfaq(int ), (int)259);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl57:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ho.cfal("cftd", cfaq(int ), (int)260);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 2: {
                var5_3 /* !! */  = (int)ho.cfal("cfte", cfaq(int ), (int)261);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl67:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)ho.cfal("cftf", cfaq(int ), (int)262);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 4: {
                var5_3 /* !! */  = (int)ho.cfal("cftg", cfaq(int ), (int)263);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl77:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ho.cfal("cfth", cfaq(int ), (int)264);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                    break;
                }
            }
lbl83:
            // 4 sources

            case 6: {
                var5_3 /* !! */  = (int)ho.cfal("cfti", cfaq(int ), (int)265);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl88:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)ho.cfal("cftj", cfaq(int ), (int)266);
                if (!var6_2) ** GOTO lbl77
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)ho.cfal("cftk", cfaq(int ), (int)267);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 9: {
                var5_3 /* !! */  = (int)ho.cfal("cftl", cfaq(int ), (int)268);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 10: {
                var5_3 /* !! */  = (int)ho.cfal("cftm", cfaq(int ), (int)269);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)ho.cfal("cftn", cfaq(int ), (int)270);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl111:
            // 3 sources

            case 12: {
                do {
                    var5_3 /* !! */  = (int)ho.cfal("cfto", cfaq(int ), (int)271);
                } while (!var6_2);
                throw null;
            }
lbl116:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ho.cfal("cftp", cfaq(int ), (int)272);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 14: {
                var5_3 /* !! */  = (int)ho.cfal("cftq", cfaq(int ), (int)273);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl126:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)ho.cfal("cftr", cfaq(int ), (int)274);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl131:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)ho.cfal("cfts", cfaq(int ), (int)275);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl136:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)ho.cfal("cftt", cfaq(int ), (int)276);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 18: {
                var5_3 /* !! */  = (int)ho.cfal("cftu", cfaq(int ), (int)277);
                if (var6_2) {
                    throw null;
                }
            }
lbl145:
            // 4 sources

            case 19: {
                var5_3 /* !! */  = (int)ho.cfal("cftv", cfaq(int ), (int)278);
                if (!var6_2) ** GOTO lbl83
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)ho.cfal("cftw", cfaq(int ), (int)279);
                if (!var6_2) ** GOTO lbl57
                throw null;
            }
lbl153:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)ho.cfal("cftx", cfaq(int ), (int)280);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
lbl157:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)ho.cfal("cfty", cfaq(int ), (int)281);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl161:
            // 3 sources

            case 23: {
                var5_3 /* !! */  = (int)ho.cfal("cftz", cfaq(int ), (int)282);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
lbl165:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)ho.cfal("cfua", cfaq(int ), (int)283);
                if (!var6_2) ** GOTO lbl157
                throw null;
            }
lbl169:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)ho.cfal("cfub", cfaq(int ), (int)284);
                if (!var6_2) ** GOTO lbl111
                throw null;
            }
lbl173:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)ho.cfal("cfuc", cfaq(int ), (int)285);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)ho.cfal("cfud", cfaq(int ), (int)286);
                if (!var6_2) ** GOTO lbl126
                throw null;
            }
lbl181:
            // 3 sources

            case 28: {
                var5_3 /* !! */  = (int)ho.cfal("cfue", cfaq(int ), (int)287);
                if (!var6_2) ** GOTO lbl52
                throw null;
            }
lbl185:
            // 3 sources

            case 29: {
                var5_3 /* !! */  = (int)ho.cfal("cfuf", cfaq(int ), (int)288);
                if (!var6_2) ** GOTO lbl52
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)ho.cfal("cfug", cfaq(int ), (int)289);
                if (!var6_2) ** GOTO lbl67
                throw null;
            }
lbl193:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)ho.cfal("cfuh", cfaq(int ), (int)290);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl197:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)ho.cfal("cfui", cfaq(int ), (int)291);
                if (!var6_2) ** GOTO lbl83
                throw null;
            }
            case 33: 
        }
        var5_3 /* !! */  = (int)ho.cfal("cfuj", cfaq(int ), (int)292);
        ** while (!var6_2)
lbl204:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cgau() {
        ho.cfar[100] = 1383382683;
        ho.cfar[101] = 1580536996;
        ho.cfar[102] = -29148712;
        ho.cfar[103] = 76633020;
        ho.cfar[104] = -86602892;
        ho.cfar[105] = -2133420045;
        ho.cfar[106] = -1197374261;
        ho.cfar[107] = 1250698761;
        ho.cfar[108] = 1184159081;
        ho.cfar[109] = 1875838790;
        ho.cfar[110] = -1369052238;
        ho.cfar[111] = -1798641474;
        ho.cfar[112] = 1037518348;
        ho.cfar[113] = 2117441950;
        ho.cfar[114] = 576500547;
        ho.cfar[115] = 1181771530;
        ho.cfar[116] = -631321969;
        ho.cfar[117] = 2078151525;
        ho.cfar[118] = 1029179985;
        ho.cfar[119] = 1820627452;
        ho.cfar[120] = -767914751;
        ho.cfar[121] = -2000811224;
        ho.cfar[122] = -347733376;
        ho.cfar[123] = 1356219219;
        ho.cfar[124] = -388532537;
        ho.cfar[125] = -1882535449;
        ho.cfar[126] = -1208633119;
        ho.cfar[127] = 392238482;
        ho.cfar[128] = 1222659865;
        ho.cfar[129] = 1721995860;
        ho.cfar[130] = 26576543;
        ho.cfar[131] = 819993459;
        ho.cfar[132] = 1294730269;
        ho.cfar[133] = -908429430;
        ho.cfar[134] = 223246541;
        ho.cfar[135] = -515619239;
        ho.cfar[136] = -1266222423;
        ho.cfar[137] = 2013543973;
        ho.cfar[138] = -327843041;
        ho.cfar[139] = 1467999566;
        ho.cfar[140] = 2061718730;
        ho.cfar[141] = 312800843;
        ho.cfar[142] = 908530248;
        ho.cfar[143] = 68591397;
        ho.cfar[144] = -2103103132;
        ho.cfar[145] = -1568431346;
        ho.cfar[146] = -1599421751;
        ho.cfar[147] = -210347034;
        ho.cfar[148] = 1453607563;
        ho.cfar[149] = 985694930;
        ho.cfar[150] = -1214955819;
        ho.cfar[151] = -663694962;
        ho.cfar[152] = 147757010;
        ho.cfar[153] = 1471073635;
        ho.cfar[154] = -1233482563;
        ho.cfar[155] = -1267423180;
        ho.cfar[156] = 846582107;
        ho.cfar[157] = 623639230;
        ho.cfar[158] = -1000127081;
        ho.cfar[159] = -778016625;
        ho.cfar[160] = -894696311;
        ho.cfar[161] = 289138604;
        ho.cfar[162] = -27555294;
        ho.cfar[163] = -1380406446;
        ho.cfar[164] = -910060579;
        ho.cfar[165] = -1001231610;
        ho.cfar[166] = -2019907655;
        ho.cfar[167] = -676447668;
        ho.cfar[168] = 664355821;
        ho.cfar[169] = 1848127792;
        ho.cfar[170] = 271498301;
        ho.cfar[171] = -487056967;
        ho.cfar[172] = 905529495;
        ho.cfar[173] = 92401578;
        ho.cfar[174] = 1342692452;
        ho.cfar[175] = -271537097;
        ho.cfar[176] = 151675904;
        ho.cfar[177] = -1339144802;
        ho.cfar[178] = -135103510;
        ho.cfar[179] = -861641249;
        ho.cfar[180] = 799311958;
        ho.cfar[181] = -1477451733;
        ho.cfar[182] = -1127670305;
        ho.cfar[183] = 116638487;
        ho.cfar[184] = 1830459666;
        ho.cfar[185] = 240038072;
        ho.cfar[186] = -819883207;
        ho.cfar[187] = -137267137;
        ho.cfar[188] = 1563244112;
        ho.cfar[189] = -979087597;
        ho.cfar[190] = 993674891;
        ho.cfar[191] = -1119811652;
        ho.cfar[192] = -219763475;
        ho.cfar[193] = 1852102538;
        ho.cfar[194] = 103833486;
        ho.cfar[195] = 1699298608;
        ho.cfar[196] = 178289002;
        ho.cfar[197] = -2048468502;
        ho.cfar[198] = 516930749;
        ho.cfar[199] = 1154562218;
    }
}

