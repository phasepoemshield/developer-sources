/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1799;
import ruhack.phobia.az;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ci
implements az {
    private static long[] dmvj;
    private class_1799 stack;
    private static int[] dmva;
    public static final int b;
    public static final long if = -3426934331005444734L;
    private static int[] dmuz;
    public static final boolean c;
    public static final boolean a;
    private final int hotbarIndex;
    private static long[] dmvi;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setStack(class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ci.if - ci.dmvb("dmws", dmvh(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ci.dmvb("dmwt", dmuy(int ), (int)18)) break;
            v0 /* !! */  = (long)ci.dmvb("dmwu", dmuy(int ), (int)19);
        }
        var4_2 = ci.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ci.if - ci.dmvb("dmwv", dmvh(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ci.dmvb("dmww", dmuy(int ), (int)20)) break;
            v1 /* !! */  = (long)ci.dmvb("dmwx", dmuy(int ), (int)21);
        }
        var3_3 /* !! */  = ci.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ci.if - ci.dmvb("dmwy", dmvh(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ci.dmvb("dmwz", dmuy(int ), (int)22)) break;
            v2 /* !! */  = (long)ci.dmvb("dmxa", dmuy(int ), (int)23);
        }
        var2_4 = ci.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl24:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ci.if - ci.dmvb("dmxb", dmvh(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ci.dmvb("dmxc", dmuy(int ), (int)24)) break;
                    v3 /* !! */  = (long)ci.dmvb("dmxd", dmuy(int ), (int)25);
                }
                this.stack = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl36:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ci.dmvb("dmxe", dmuy(int ), (int)26);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl45
            }
            case 1: {
                var3_3 /* !! */  = (int)ci.dmvb("dmxf", dmuy(int ), (int)27);
                if (!var4_2) break;
                throw null;
            }
lbl45:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ci.dmvb("dmxg", dmuy(int ), (int)28);
                if (!var4_2) ** GOTO lbl36
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)ci.dmvb("dmxh", dmuy(int ), (int)29);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)ci.dmvb("dmxi", dmuy(int ), (int)30);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void dmxk() {
        ci.dmva[0] = -1735316786;
        ci.dmva[1] = -704627593;
        ci.dmva[2] = 1478430763;
        ci.dmva[3] = -1256075848;
        ci.dmva[4] = 1744121693;
        ci.dmva[5] = -680486839;
        ci.dmva[6] = -84423220;
        ci.dmva[7] = 892010157;
        ci.dmva[8] = -24875957;
        ci.dmva[9] = -1546587496;
        ci.dmva[10] = -917272610;
        ci.dmva[11] = 1737930377;
        ci.dmva[12] = -1758469247;
        ci.dmva[13] = -1799418012;
        ci.dmva[14] = -2024167684;
        ci.dmva[15] = 1891394255;
        ci.dmva[16] = -1599162961;
        ci.dmva[17] = 1397016077;
        ci.dmva[18] = -645766058;
        ci.dmva[19] = -504768489;
        ci.dmva[20] = 868670324;
        ci.dmva[21] = -644338703;
        ci.dmva[22] = 880290029;
        ci.dmva[23] = -805331959;
        ci.dmva[24] = -1598291380;
        ci.dmva[25] = 1821327925;
        ci.dmva[26] = 369774549;
        ci.dmva[27] = -1497748656;
        ci.dmva[28] = 568577086;
        ci.dmva[29] = -2030773220;
        ci.dmva[30] = -788809343;
    }

    static {
        dmuz = new int[31];
        dmva = new int[31];
        ci.dmxj();
        ci.dmxk();
        dmvi = new long[25];
        dmvj = new long[25];
        ci.dmxl();
        ci.dmxm();
    }

    private static /* synthetic */ int dmuy(int n2) {
        return dmuz[n2] ^ dmva[n2];
    }

    private static /* synthetic */ void dmxl() {
        ci.dmvi[0] = -8052969110809712211L;
        ci.dmvi[1] = -945756560938006012L;
        ci.dmvi[2] = 4140152736976393905L;
        ci.dmvi[3] = -4245785521573212450L;
        ci.dmvi[4] = -4625814856832272166L;
        ci.dmvi[5] = -3430799226046384153L;
        ci.dmvi[6] = -4781954316745083046L;
        ci.dmvi[7] = 761109622776052316L;
        ci.dmvi[8] = 3923162000985488928L;
        ci.dmvi[9] = 6640348502294749088L;
        ci.dmvi[10] = 7825820660714305450L;
        ci.dmvi[11] = 6566879415840668926L;
        ci.dmvi[12] = -15322444548886419L;
        ci.dmvi[13] = 4206291727449310757L;
        ci.dmvi[14] = 3799699565347711968L;
        ci.dmvi[15] = -3068675187559191149L;
        ci.dmvi[16] = 2187889566793375844L;
        ci.dmvi[17] = -342401127041652884L;
        ci.dmvi[18] = -6506644848402423273L;
        ci.dmvi[19] = -6596489045598147389L;
        ci.dmvi[20] = 4471881627884831723L;
        ci.dmvi[21] = -5778167830229331422L;
        ci.dmvi[22] = -1967321908161550263L;
        ci.dmvi[23] = 2863637828654986378L;
        ci.dmvi[24] = 9019533496092044888L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getHotbarIndex() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ci.if - ci.dmvb("dmvz", dmvh(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ci.dmvb("dmwa", dmuy(int ), (int)11)) break;
            v0 /* !! */  = (long)ci.dmvb("dmwb", dmuy(int ), (int)12);
        }
        var3_1 = ci.c;
        v1 /* !! */  = ci.if;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - ci.dmvb("dmwc", dmvh(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1509748727: {
                    v2 = ci.dmvb("dmwd", dmvh(int ), (int)11);
                    continue block24;
                }
                case -536953950: {
                    v2 = ci.dmvb("dmwe", dmvh(int ), (int)12);
                    continue block24;
                }
                case -204186238: {
                    break block24;
                }
                case -90456405: {
                    v2 = ci.dmvb("dmwf", dmvh(int ), (int)13);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ci.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ci.if;
                if (true) ** GOTO lbl32
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - ci.dmvb("dmwg", dmvh(int ), (int)14));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1314758820: {
                            v4 = ci.dmvb("dmwh", dmvh(int ), (int)15);
                            continue block25;
                        }
                        case -653374460: {
                            v4 = ci.dmvb("dmwi", dmvh(int ), (int)16);
                            continue block25;
                        }
                        case -204186238: {
                            break block25;
                        }
                        case 923930267: {
                            v4 = ci.dmvb("dmwj", dmvh(int ), (int)17);
                            continue block25;
                        }
                    }
                    break;
                }
                var1_3 = ci.a;
                if (var3_1) {
                    throw null;
                    return (int)ci.dmvb("dmwk", dmuy(int ), (int)13);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = ci.if;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ci.dmvb("dmwl", dmvh(int ), (int)18));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1992039939: {
                            v6 = ci.dmvb("dmwm", dmvh(int ), (int)19);
                            continue block27;
                        }
                        case -204186238: {
                            break block27;
                        }
                        case 661132064: {
                            v6 = ci.dmvb("dmwn", dmvh(int ), (int)20);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.hotbarIndex;
            }
            case 0: {
                var2_2 /* !! */  = (int)ci.dmvb("dmwo", dmuy(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 1: {
                var2_2 /* !! */  = (int)ci.dmvb("dmwp", dmuy(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
            }
lbl73:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ci.dmvb("dmwq", dmuy(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ci.dmvb("dmwr", dmuy(int ), (int)17);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dmxj() {
        ci.dmuz[0] = -1735316787;
        ci.dmuz[1] = -704627594;
        ci.dmuz[2] = 1478430760;
        ci.dmuz[3] = -1256075848;
        ci.dmuz[4] = 1744121689;
        ci.dmuz[5] = -680486840;
        ci.dmuz[6] = -199342372;
        ci.dmuz[7] = 892010157;
        ci.dmuz[8] = -24875958;
        ci.dmuz[9] = -1546587495;
        ci.dmuz[10] = -917272612;
        ci.dmuz[11] = 1737930376;
        ci.dmuz[12] = -825928098;
        ci.dmuz[13] = 343180349;
        ci.dmuz[14] = -2024167683;
        ci.dmuz[15] = 1891394255;
        ci.dmuz[16] = -1599162961;
        ci.dmuz[17] = 1397016076;
        ci.dmuz[18] = 645766057;
        ci.dmuz[19] = 125479888;
        ci.dmuz[20] = 868670325;
        ci.dmuz[21] = 2027532559;
        ci.dmuz[22] = 880290028;
        ci.dmuz[23] = -1410041478;
        ci.dmuz[24] = 1598291379;
        ci.dmuz[25] = -304316429;
        ci.dmuz[26] = 369774551;
        ci.dmuz[27] = -1497748654;
        ci.dmuz[28] = 568577082;
        ci.dmuz[29] = -2030773218;
        ci.dmuz[30] = -788809343;
    }

    private static /* synthetic */ void dmxm() {
        ci.dmvj[0] = 2847681399928350661L;
        ci.dmvj[1] = 3796471945606599673L;
        ci.dmvj[2] = 1330151278218074266L;
        ci.dmvj[3] = 8521271913905150431L;
        ci.dmvj[4] = -1264868152262878379L;
        ci.dmvj[5] = -5539515671488769246L;
        ci.dmvj[6] = -1801680825347812749L;
        ci.dmvj[7] = -7934199156394599433L;
        ci.dmvj[8] = -7860837860259607454L;
        ci.dmvj[9] = -2061329894607794117L;
        ci.dmvj[10] = -559282353145383991L;
        ci.dmvj[11] = 7684560931460362912L;
        ci.dmvj[12] = 4554957627465676235L;
        ci.dmvj[13] = -2930778465049523372L;
        ci.dmvj[14] = -2511487555390671322L;
        ci.dmvj[15] = 5596938795226948053L;
        ci.dmvj[16] = 6705336207247692604L;
        ci.dmvj[17] = -5876075368070494961L;
        ci.dmvj[18] = 5657306878369050674L;
        ci.dmvj[19] = -1208142902230934800L;
        ci.dmvj[20] = 8608121706494211245L;
        ci.dmvj[21] = -2195632712978185491L;
        ci.dmvj[22] = 6404939978231145151L;
        ci.dmvj[23] = -8877323099155104377L;
        ci.dmvj[24] = 6737117835710753493L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ci(class_1799 var1_1, int var2_2) {
        var4_3 /* !! */  = ci.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.stack = var1_1;
                this.hotbarIndex = var2_2;
                return;
            }
            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)ci.dmvb("dmvc", dmuy(int ), (int)0);
                }
            }
lbl13:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ci.dmvb("dmvd", dmuy(int ), (int)1);
                    ** GOTO lbl20
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)ci.dmvb("dmve", dmuy(int ), (int)2);
                ** GOTO lbl13
            }
lbl20:
            // 2 sources

            case 3: {
                while (true) {
                    var4_3 /* !! */  = (int)ci.dmvb("dmvf", dmuy(int ), (int)3);
                }
            }
            case 4: 
        }
        var4_3 /* !! */  = (int)ci.dmvb("dmvg", dmuy(int ), (int)4);
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_1799 getStack() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = if - ci.dmvb("dmvk", dmvh(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ci.dmvb("dmvl", dmuy(int ), (int)5)) break;
            object = ci.dmvb("dmvm", dmuy(int ), (int)6);
        }
        boolean bl2 = c;
        Object object = if;
        block15: while (true) {
            switch ((int)object) {
                case -1407766419: {
                    object = ci.dmvb("dmvo", dmvh(int ), (int)2) - ci.dmvb("dmvn", dmvh(int ), (int)1);
                    continue block15;
                }
                case -204186238: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = if;
        block16: while (true) {
            switch ((int)object2) {
                case -204186238: {
                    break block16;
                }
                case 2005053813: {
                    object2 = ci.dmvb("dmvq", dmvh(int ), (int)4) - ci.dmvb("dmvp", dmvh(int ), (int)3);
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
        Object object3 = if;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - ci.dmvb("dmvr", dmvh(int ), (int)5);
            }
            switch ((int)object3) {
                case -608107125: {
                    callSite = ci.dmvb("dmvs", dmvh(int ), (int)6);
                    continue block17;
                }
                case -204186238: {
                    return this.stack;
                }
                case 677226402: {
                    callSite = ci.dmvb("dmvt", dmvh(int ), (int)7);
                    continue block17;
                }
                case 1872769207: {
                    callSite = ci.dmvb("dmvu", dmvh(int ), (int)8);
                    continue block17;
                }
            }
            break;
        }
        return this.stack;
    }

    public static /* synthetic */ CallSite dmvb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long dmvh(int n2) {
        return dmvi[n2] ^ dmvj[n2];
    }
}

