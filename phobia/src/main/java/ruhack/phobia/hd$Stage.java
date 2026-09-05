/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class hd$Stage
extends Enum<hd$Stage> {
    public static final boolean a;
    public static final /* enum */ hd$Stage WAIT_CRYSTAL_ROTATION;
    public static final /* enum */ hd$Stage SEARCH;
    public static final /* enum */ hd$Stage WAIT_OBSIDIAN_ROTATION;
    public static final /* enum */ hd$Stage WAIT_EXPLOSION;
    private static int[] dud;
    private static long[] dtt;
    public static final /* enum */ hd$Stage WAIT_CRYSTAL;
    private static final /* synthetic */ hd$Stage[] $VALUES;
    public static final /* enum */ hd$Stage PLACE_OBSIDIAN;
    public static final int b;
    static final long v = 8445440891865517796L;
    public static final /* enum */ hd$Stage WAIT_OBSIDIAN;
    public static final boolean c;
    public static final /* enum */ hd$Stage MINING;
    private static int[] duc;
    public static final /* enum */ hd$Stage WAIT_RESULT;
    public static final /* enum */ hd$Stage PLACE_CRYSTAL;
    private static long[] dtu;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hd$Stage() {
        var4_3 /* !! */  = hd$Stage.b;
        var3_4 = hd$Stage.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)hd$Stage.dtv("dvj", dub(int ), (int)18);
            }
            case 1: {
                var4_3 /* !! */  = (int)hd$Stage.dtv("dvk", dub(int ), (int)19);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)hd$Stage.dtv("dvl", dub(int ), (int)20);
        }
    }

    private static /* synthetic */ void dyz() {
        hd$Stage.duc[0] = 1962771284;
        hd$Stage.duc[1] = 638801725;
        hd$Stage.duc[2] = -1146072890;
        hd$Stage.duc[3] = 1148954891;
        hd$Stage.duc[4] = -453743125;
        hd$Stage.duc[5] = 1034878642;
        hd$Stage.duc[6] = -1861385983;
        hd$Stage.duc[7] = 15833603;
        hd$Stage.duc[8] = -1678134487;
        hd$Stage.duc[9] = 1253505140;
        hd$Stage.duc[10] = 372276703;
        hd$Stage.duc[11] = 1350796377;
        hd$Stage.duc[12] = 1781696746;
        hd$Stage.duc[13] = 535542666;
        hd$Stage.duc[14] = -732526364;
        hd$Stage.duc[15] = -552693291;
        hd$Stage.duc[16] = 1986752354;
        hd$Stage.duc[17] = 1970518518;
        hd$Stage.duc[18] = -1706621284;
        hd$Stage.duc[19] = 158484168;
        hd$Stage.duc[20] = -217948280;
        hd$Stage.duc[21] = 794230635;
        hd$Stage.duc[22] = -1841646166;
        hd$Stage.duc[23] = 445745343;
        hd$Stage.duc[24] = -587474169;
        hd$Stage.duc[25] = -1191678465;
        hd$Stage.duc[26] = -1492752625;
        hd$Stage.duc[27] = -1578858052;
        hd$Stage.duc[28] = -1165289533;
        hd$Stage.duc[29] = 915611302;
        hd$Stage.duc[30] = -304768671;
        hd$Stage.duc[31] = -1305708154;
        hd$Stage.duc[32] = 1411557405;
        hd$Stage.duc[33] = 318751671;
        hd$Stage.duc[34] = 1089979768;
        hd$Stage.duc[35] = 2106533460;
        hd$Stage.duc[36] = -1703783689;
        hd$Stage.duc[37] = 782641846;
        hd$Stage.duc[38] = 869943531;
        hd$Stage.duc[39] = 69951299;
        hd$Stage.duc[40] = -958167819;
        hd$Stage.duc[41] = -1038595286;
        hd$Stage.duc[42] = -683274344;
        hd$Stage.duc[43] = -781285165;
        hd$Stage.duc[44] = -1363610828;
        hd$Stage.duc[45] = 1200438578;
        hd$Stage.duc[46] = 1203750803;
        hd$Stage.duc[47] = -239070330;
        hd$Stage.duc[48] = -1481276367;
        hd$Stage.duc[49] = -631704490;
        hd$Stage.duc[50] = -786650077;
        hd$Stage.duc[51] = -336877199;
        hd$Stage.duc[52] = 2065877885;
        hd$Stage.duc[53] = -274208211;
        hd$Stage.duc[54] = -1807644185;
    }

    private static /* synthetic */ long dts(int n2) {
        return dtt[n2] ^ dtu[n2];
    }

    static {
        duc = new int[55];
        dud = new int[55];
        hd$Stage.dyz();
        hd$Stage.dzd();
        dtt = new long[39];
        dtu = new long[39];
        hd$Stage.dzh();
        hd$Stage.dzn();
        SEARCH = new hd$Stage();
        MINING = new hd$Stage();
        WAIT_OBSIDIAN_ROTATION = new hd$Stage();
        PLACE_OBSIDIAN = new hd$Stage();
        WAIT_OBSIDIAN = new hd$Stage();
        WAIT_CRYSTAL_ROTATION = new hd$Stage();
        PLACE_CRYSTAL = new hd$Stage();
        WAIT_CRYSTAL = new hd$Stage();
        WAIT_EXPLOSION = new hd$Stage();
        WAIT_RESULT = new hd$Stage();
        $VALUES = hd$Stage.$values();
    }

    private static /* synthetic */ void dzd() {
        hd$Stage.dud[0] = 1962771285;
        hd$Stage.dud[1] = 1762342873;
        hd$Stage.dud[2] = -1146072889;
        hd$Stage.dud[3] = -1299725105;
        hd$Stage.dud[4] = -453743126;
        hd$Stage.dud[5] = -549926886;
        hd$Stage.dud[6] = -1861385984;
        hd$Stage.dud[7] = 15833603;
        hd$Stage.dud[8] = -1678134487;
        hd$Stage.dud[9] = 1253505140;
        hd$Stage.dud[10] = 372276702;
        hd$Stage.dud[11] = -375499208;
        hd$Stage.dud[12] = 1781696747;
        hd$Stage.dud[13] = -214034281;
        hd$Stage.dud[14] = -732526363;
        hd$Stage.dud[15] = -552693290;
        hd$Stage.dud[16] = 1986752353;
        hd$Stage.dud[17] = 1970518519;
        hd$Stage.dud[18] = -1706621283;
        hd$Stage.dud[19] = 158484169;
        hd$Stage.dud[20] = -217948280;
        hd$Stage.dud[21] = 794230634;
        hd$Stage.dud[22] = 980934477;
        hd$Stage.dud[23] = 445745342;
        hd$Stage.dud[24] = 1687511677;
        hd$Stage.dud[25] = -1191678465;
        hd$Stage.dud[26] = -1492752626;
        hd$Stage.dud[27] = -1578858051;
        hd$Stage.dud[28] = -1165289535;
        hd$Stage.dud[29] = 915611303;
        hd$Stage.dud[30] = -304768670;
        hd$Stage.dud[31] = -1305708158;
        hd$Stage.dud[32] = 1411557404;
        hd$Stage.dud[33] = 318751666;
        hd$Stage.dud[34] = 1089979774;
        hd$Stage.dud[35] = 2106533459;
        hd$Stage.dud[36] = -1703783690;
        hd$Stage.dud[37] = 782641854;
        hd$Stage.dud[38] = 869943530;
        hd$Stage.dud[39] = 69951306;
        hd$Stage.dud[40] = -958167820;
        hd$Stage.dud[41] = -1038595288;
        hd$Stage.dud[42] = -683274344;
        hd$Stage.dud[43] = -781285167;
        hd$Stage.dud[44] = -1363610825;
        hd$Stage.dud[45] = 1200438578;
        hd$Stage.dud[46] = 1203750802;
        hd$Stage.dud[47] = -239070332;
        hd$Stage.dud[48] = -1481276366;
        hd$Stage.dud[49] = -631704494;
        hd$Stage.dud[50] = -786650074;
        hd$Stage.dud[51] = -336877193;
        hd$Stage.dud[52] = 2065877882;
        hd$Stage.dud[53] = -274208219;
        hd$Stage.dud[54] = -1807644178;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ hd$Stage[] $values() {
        v0 /* !! */  = hd$Stage.v;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - hd$Stage.dtv("dvm", dts(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -885797148: {
                    break block23;
                }
                case 256770931: {
                    v1 = hd$Stage.dtv("dvn", dts(int ), (int)19);
                    continue block23;
                }
                case 661539843: {
                    v1 = hd$Stage.dtv("dvo", dts(int ), (int)20);
                    continue block23;
                }
            }
            break;
        }
        var2 = hd$Stage.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hd$Stage.v - hd$Stage.dtv("dvp", dts(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hd$Stage.dtv("dvq", dub(int ), (int)21)) break;
            v2 /* !! */  = (long)hd$Stage.dtv("dvr", dub(int ), (int)22);
        }
        var1_1 = hd$Stage.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hd$Stage.v - hd$Stage.dtv("dvs", dts(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hd$Stage.dtv("dvt", dub(int ), (int)23)) break;
            v3 /* !! */  = (long)hd$Stage.dtv("dvu", dub(int ), (int)24);
        }
        var0_2 = hd$Stage.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        v4 = new hd$Stage[10];
        v5 = hd$Stage.dtv("dvv", dub(int ), (int)25);
        while (true) {
            if ((v6 = (cfr_temp_2 = hd$Stage.v - hd$Stage.dtv("dvw", dts(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 == hd$Stage.dtv("dvx", dub(int ), (int)26)) break;
            v6 = -1923139929;
        }
        v4[v5] = hd$Stage.SEARCH;
        v7 = hd$Stage.dtv("dvy", dub(int ), (int)27);
        v8 /* !! */  = hd$Stage.v;
        if (true) ** GOTO lbl48
        block28: while (true) {
            v8 /* !! */  = (long)(hd$Stage.dtv("dwa", dts(int ), (int)25) - hd$Stage.dtv("dvz", dts(int ), (int)24));
lbl48:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -885797148: {
                    break block28;
                }
                case 224589181: {
                    continue block28;
                }
            }
            break;
        }
        v4[v7] = hd$Stage.MINING;
        v9 = hd$Stage.dtv("dwb", dub(int ), (int)28);
        while (true) {
            if ((v10 = (cfr_temp_3 = hd$Stage.v - hd$Stage.dtv("dwc", dts(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 == hd$Stage.dtv("dwd", dub(int ), (int)29)) break;
            v10 = 1826058098;
        }
        v4[v9] = hd$Stage.WAIT_OBSIDIAN_ROTATION;
        v11 = hd$Stage.dtv("dwe", dub(int ), (int)30);
        v12 /* !! */  = hd$Stage.v;
        if (true) ** GOTO lbl67
        block30: while (true) {
            v12 /* !! */  = (long)(v13 - hd$Stage.dtv("dwf", dts(int ), (int)27));
lbl67:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1309337097: {
                    v13 = hd$Stage.dtv("dwg", dts(int ), (int)28);
                    continue block30;
                }
                case -885797148: {
                    break block30;
                }
                case 487358644: {
                    v13 = hd$Stage.dtv("dwh", dts(int ), (int)29);
                    continue block30;
                }
            }
            break;
        }
        v4[v11] = hd$Stage.PLACE_OBSIDIAN;
        v14 = hd$Stage.dtv("dwi", dub(int ), (int)31);
        while (true) {
            if ((v15 = (cfr_temp_4 = hd$Stage.v - hd$Stage.dtv("dwj", dts(int ), (int)30)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v15 == hd$Stage.dtv("dwk", dub(int ), (int)32)) break;
            v15 = 511049053;
        }
        v4[v14] = hd$Stage.WAIT_OBSIDIAN;
        v16 = hd$Stage.dtv("dwm", dub(int ), (int)33);
        v17 /* !! */  = hd$Stage.v;
        if (true) ** GOTO lbl90
        block32: while (true) {
            v17 /* !! */  = (long)(hd$Stage.dtv("dwr", dts(int ), (int)32) - hd$Stage.dtv("dwo", dts(int ), (int)31));
lbl90:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -885797148: {
                    break block32;
                }
                case -839792537: {
                    continue block32;
                }
            }
            break;
        }
        v4[v16] = hd$Stage.WAIT_CRYSTAL_ROTATION;
        v18 = hd$Stage.dtv("dwt", dub(int ), (int)34);
        v19 /* !! */  = hd$Stage.v;
        if (true) ** GOTO lbl101
        block33: while (true) {
            v19 /* !! */  = (long)(v20 - hd$Stage.dtv("dwv", dts(int ), (int)33));
lbl101:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -935867466: {
                    v20 = hd$Stage.dtv("dwx", dts(int ), (int)34);
                    continue block33;
                }
                case -885797148: {
                    break block33;
                }
                case -709932001: {
                    v20 = hd$Stage.dtv("dwz", dts(int ), (int)35);
                    continue block33;
                }
            }
            break;
        }
        v4[v18] = hd$Stage.PLACE_CRYSTAL;
        v21 = hd$Stage.dtv("dxa", dub(int ), (int)35);
        while (true) {
            if ((v22 = (cfr_temp_5 = hd$Stage.v - hd$Stage.dtv("dxd", dts(int ), (int)36)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v22 == hd$Stage.dtv("dxf", dub(int ), (int)36)) break;
            v22 = -517415025;
        }
        v4[v21] = hd$Stage.WAIT_CRYSTAL;
        v23 = hd$Stage.dtv("dxj", dub(int ), (int)37);
        while (true) {
            if ((v24 = (cfr_temp_6 = hd$Stage.v - hd$Stage.dtv("dxm", dts(int ), (int)37)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v24 == hd$Stage.dtv("dxp", dub(int ), (int)38)) break;
            v24 = 1952488307;
        }
        v4[v23] = hd$Stage.WAIT_EXPLOSION;
        v25 = hd$Stage.dtv("dxr", dub(int ), (int)39);
        while (true) {
            if ((v26 = (cfr_temp_7 = hd$Stage.v - hd$Stage.dtv("dxs", dts(int ), (int)38)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v26 == hd$Stage.dtv("dxt", dub(int ), (int)40)) break;
            v26 = 2070218672;
        }
        v4[v25] = hd$Stage.WAIT_RESULT;
        return v4;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static hd$Stage valueOf(String string) {
        boolean bl2;
        Object object = v;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hd$Stage.dtv("dus", dts(int ), (int)9);
            }
            switch ((int)object) {
                case -885797148: {
                    break block11;
                }
                case -821327463: {
                    callSite = hd$Stage.dtv("dut", dts(int ), (int)10);
                    continue block11;
                }
                case -99653771: {
                    callSite = hd$Stage.dtv("duu", dts(int ), (int)11);
                    continue block11;
                }
                case 1902607561: {
                    callSite = hd$Stage.dtv("duv", dts(int ), (int)12);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = v - hd$Stage.dtv("duw", dts(int ), (int)13)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hd$Stage.dtv("dux", dub(int ), (int)10)) break;
            object2 = hd$Stage.dtv("duy", dub(int ), (int)11);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = v - hd$Stage.dtv("duz", dts(int ), (int)14)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hd$Stage.dtv("dva", dub(int ), (int)12)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hd$Stage.dtv("dvb", dub(int ), (int)13);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = v;
        boolean bl5 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - hd$Stage.dtv("dvc", dts(int ), (int)15);
            }
            switch ((int)object4) {
                case -1478346522: {
                    callSite = hd$Stage.dtv("dvd", dts(int ), (int)16);
                    continue block14;
                }
                case -885797148: {
                    return Enum.valueOf(hd$Stage.class, string);
                }
                case 75526698: {
                    callSite = hd$Stage.dtv("dve", dts(int ), (int)17);
                    continue block14;
                }
            }
            break;
        }
        return Enum.valueOf(hd$Stage.class, string);
    }

    public static /* synthetic */ CallSite dtv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dub(int n2) {
        return duc[n2] ^ dud[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static hd$Stage[] values() {
        Object object = v;
        boolean bl2 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - hd$Stage.dtv("dtw", dts(int ), (int)0);
            }
            switch ((int)object) {
                case -1989128987: {
                    callSite = hd$Stage.dtv("dtx", dts(int ), (int)1);
                    continue block10;
                }
                case -1290835678: {
                    callSite = hd$Stage.dtv("dty", dts(int ), (int)2);
                    continue block10;
                }
                case -885797148: {
                    break block10;
                }
                case 566698699: {
                    callSite = hd$Stage.dtv("dtz", dts(int ), (int)3);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = v - hd$Stage.dtv("dua", dts(int ), (int)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hd$Stage.dtv("due", dub(int ), (int)0)) break;
            object2 = hd$Stage.dtv("duf", dub(int ), (int)1);
        }
        int n2 = b;
        Object object3 = v;
        block12: while (true) {
            switch ((int)object3) {
                case -885797148: {
                    break block12;
                }
                case -820157847: {
                    object3 = hd$Stage.dtv("duh", dts(int ), (int)6) - hd$Stage.dtv("dug", dts(int ), (int)5);
                    continue block12;
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
            if ((object4 = (l3 = v - hd$Stage.dtv("dui", dts(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == hd$Stage.dtv("duj", dub(int ), (int)2)) break;
            object4 = hd$Stage.dtv("duk", dub(int ), (int)3);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = v - hd$Stage.dtv("dul", dts(int ), (int)8)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == hd$Stage.dtv("dum", dub(int ), (int)4)) {
                return (hd$Stage[])$VALUES.clone();
            }
            object5 = hd$Stage.dtv("dun", dub(int ), (int)5);
        }
    }

    private static /* synthetic */ void dzh() {
        hd$Stage.dtt[0] = 8035659208153144394L;
        hd$Stage.dtt[1] = 4863525589230924989L;
        hd$Stage.dtt[2] = 5256191745376696987L;
        hd$Stage.dtt[3] = 2654189044386255786L;
        hd$Stage.dtt[4] = -6678801865397254346L;
        hd$Stage.dtt[5] = 1728573986112687559L;
        hd$Stage.dtt[6] = 8000361540561295421L;
        hd$Stage.dtt[7] = 3779262464867562783L;
        hd$Stage.dtt[8] = -6065226104725885976L;
        hd$Stage.dtt[9] = -4228446891386722487L;
        hd$Stage.dtt[10] = -7993330355908916600L;
        hd$Stage.dtt[11] = -1621344420747054345L;
        hd$Stage.dtt[12] = 6228809569461831413L;
        hd$Stage.dtt[13] = -1532024340080099500L;
        hd$Stage.dtt[14] = 9048311860201482861L;
        hd$Stage.dtt[15] = -7428903562286358337L;
        hd$Stage.dtt[16] = -5231100288147723176L;
        hd$Stage.dtt[17] = -291387680890686711L;
        hd$Stage.dtt[18] = 7621545227350936656L;
        hd$Stage.dtt[19] = 2536406869497701472L;
        hd$Stage.dtt[20] = 4147725995296989033L;
        hd$Stage.dtt[21] = 7721080487731923924L;
        hd$Stage.dtt[22] = 7915591812481449758L;
        hd$Stage.dtt[23] = -3634064080644847167L;
        hd$Stage.dtt[24] = -7134234977732097598L;
        hd$Stage.dtt[25] = 2660616528381909804L;
        hd$Stage.dtt[26] = -1688848591099639446L;
        hd$Stage.dtt[27] = 3143775923403273786L;
        hd$Stage.dtt[28] = -7553229927494940927L;
        hd$Stage.dtt[29] = -895906341779793442L;
        hd$Stage.dtt[30] = -5453411722033944844L;
        hd$Stage.dtt[31] = 3993296780387041305L;
        hd$Stage.dtt[32] = -4368237934972525377L;
        hd$Stage.dtt[33] = -1065781298372373629L;
        hd$Stage.dtt[34] = 827291952890862962L;
        hd$Stage.dtt[35] = 7971627718978946574L;
        hd$Stage.dtt[36] = -4770030984739811932L;
        hd$Stage.dtt[37] = 7297553797313262908L;
        hd$Stage.dtt[38] = 6809134180532214295L;
    }

    private static /* synthetic */ void dzn() {
        hd$Stage.dtu[0] = 6938435966275464088L;
        hd$Stage.dtu[1] = 3292355938146542796L;
        hd$Stage.dtu[2] = 9028018935696025425L;
        hd$Stage.dtu[3] = 264141918655161983L;
        hd$Stage.dtu[4] = -28476259481601261L;
        hd$Stage.dtu[5] = 2116089871653870426L;
        hd$Stage.dtu[6] = 1469061460748937949L;
        hd$Stage.dtu[7] = 1721376561709744903L;
        hd$Stage.dtu[8] = -5761294069378741846L;
        hd$Stage.dtu[9] = 4946363752548568261L;
        hd$Stage.dtu[10] = -4485700511005622977L;
        hd$Stage.dtu[11] = 4951653482182224798L;
        hd$Stage.dtu[12] = 8654567982297122354L;
        hd$Stage.dtu[13] = 3991125646606753907L;
        hd$Stage.dtu[14] = 8963412277797360880L;
        hd$Stage.dtu[15] = 7715515922536793663L;
        hd$Stage.dtu[16] = 2956693462915851349L;
        hd$Stage.dtu[17] = 580472834345341206L;
        hd$Stage.dtu[18] = -4119679082894988288L;
        hd$Stage.dtu[19] = 4016890106816215714L;
        hd$Stage.dtu[20] = -243064437626497541L;
        hd$Stage.dtu[21] = -3108113565511919056L;
        hd$Stage.dtu[22] = 8078836356797821917L;
        hd$Stage.dtu[23] = 1123840011460128357L;
        hd$Stage.dtu[24] = -3453569710849837250L;
        hd$Stage.dtu[25] = 1679119114049348381L;
        hd$Stage.dtu[26] = -6231659371720699592L;
        hd$Stage.dtu[27] = -8128588791036761325L;
        hd$Stage.dtu[28] = 1244698061629959448L;
        hd$Stage.dtu[29] = -3167040581385422856L;
        hd$Stage.dtu[30] = 8604628258602328150L;
        hd$Stage.dtu[31] = -1215179813906257979L;
        hd$Stage.dtu[32] = -240638932214868778L;
        hd$Stage.dtu[33] = -647280878629058252L;
        hd$Stage.dtu[34] = 1619581030632647828L;
        hd$Stage.dtu[35] = 3108074434290769892L;
        hd$Stage.dtu[36] = -5145540353145727840L;
        hd$Stage.dtu[37] = 6403278774137416447L;
        hd$Stage.dtu[38] = -5817987723186659907L;
    }
}

