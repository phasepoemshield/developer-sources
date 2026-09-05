/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class gx$State
extends Enum<gx$State> {
    private static long[] jkf;
    public static final /* enum */ gx$State LOOTING;
    public static final /* enum */ gx$State WAITING_SPAWN;
    public static final boolean a;
    private static int[] jko;
    public static final /* enum */ gx$State WATCHING;
    static final long ao = -3758024162985944902L;
    private static int[] jkp;
    public static final /* enum */ gx$State ARMED;
    public static final /* enum */ gx$State APPROACHING;
    public static final int b;
    private static long[] jke;
    public static final boolean c;
    private static final /* synthetic */ gx$State[] $VALUES;

    static {
        jko = new int[42];
        jkp = new int[42];
        gx$State.joc();
        gx$State.jof();
        jke = new long[30];
        jkf = new long[30];
        gx$State.joh();
        gx$State.joj();
        WATCHING = new gx$State();
        ARMED = new gx$State();
        APPROACHING = new gx$State();
        LOOTING = new gx$State();
        WAITING_SPAWN = new gx$State();
        $VALUES = gx$State.$values();
    }

    private static /* synthetic */ void joj() {
        gx$State.jkf[0] = -7388052932399961083L;
        gx$State.jkf[1] = -9116418830081569795L;
        gx$State.jkf[2] = 3482660015203003123L;
        gx$State.jkf[3] = 2349141212818489697L;
        gx$State.jkf[4] = 6913548711506626356L;
        gx$State.jkf[5] = 2234368547094190634L;
        gx$State.jkf[6] = 4073591577280836085L;
        gx$State.jkf[7] = 8222153116666443841L;
        gx$State.jkf[8] = -5301669254059109173L;
        gx$State.jkf[9] = 7206843132989309758L;
        gx$State.jkf[10] = -8584941095831504832L;
        gx$State.jkf[11] = 8414260312760171819L;
        gx$State.jkf[12] = 959774737634661136L;
        gx$State.jkf[13] = 12651033488910162L;
        gx$State.jkf[14] = 8353591955942059357L;
        gx$State.jkf[15] = 9094660353398255765L;
        gx$State.jkf[16] = -5844891124388098436L;
        gx$State.jkf[17] = 8181332381754662547L;
        gx$State.jkf[18] = -7943160778908620885L;
        gx$State.jkf[19] = 8854207614995979993L;
        gx$State.jkf[20] = 8441141691229997847L;
        gx$State.jkf[21] = -225486560118393094L;
        gx$State.jkf[22] = 8270826042606529976L;
        gx$State.jkf[23] = 4563545855945730088L;
        gx$State.jkf[24] = 7046080959319621258L;
        gx$State.jkf[25] = -1818778842411227604L;
        gx$State.jkf[26] = 6698919607292521706L;
        gx$State.jkf[27] = 1528144366230216384L;
        gx$State.jkf[28] = 4970593935874237252L;
        gx$State.jkf[29] = -1581164131154029379L;
    }

    private static /* synthetic */ void jof() {
        gx$State.jkp[0] = -1294231562;
        gx$State.jkp[1] = 1759998708;
        gx$State.jkp[2] = 544518899;
        gx$State.jkp[3] = -1317200853;
        gx$State.jkp[4] = 1962306071;
        gx$State.jkp[5] = 1412687897;
        gx$State.jkp[6] = -1358355528;
        gx$State.jkp[7] = -1039446169;
        gx$State.jkp[8] = -77237805;
        gx$State.jkp[9] = -1786179935;
        gx$State.jkp[10] = -2132507695;
        gx$State.jkp[11] = 2005264354;
        gx$State.jkp[12] = -40297267;
        gx$State.jkp[13] = -715643194;
        gx$State.jkp[14] = -1956015447;
        gx$State.jkp[15] = 1657818148;
        gx$State.jkp[16] = -358888279;
        gx$State.jkp[17] = 1682842299;
        gx$State.jkp[18] = -779203674;
        gx$State.jkp[19] = -467912003;
        gx$State.jkp[20] = 280071077;
        gx$State.jkp[21] = 690866363;
        gx$State.jkp[22] = 1050035975;
        gx$State.jkp[23] = -1126397310;
        gx$State.jkp[24] = -722826166;
        gx$State.jkp[25] = -265666212;
        gx$State.jkp[26] = 669189560;
        gx$State.jkp[27] = -1354127992;
        gx$State.jkp[28] = -1162495354;
        gx$State.jkp[29] = 767245770;
        gx$State.jkp[30] = 74395386;
        gx$State.jkp[31] = 1564105057;
        gx$State.jkp[32] = 777209961;
        gx$State.jkp[33] = -1745387283;
        gx$State.jkp[34] = -773167838;
        gx$State.jkp[35] = -149213941;
        gx$State.jkp[36] = 181925509;
        gx$State.jkp[37] = 1278266919;
        gx$State.jkp[38] = 109968843;
        gx$State.jkp[39] = -984210039;
        gx$State.jkp[40] = 2076169952;
        gx$State.jkp[41] = -741654444;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static gx$State[] values() {
        boolean bl2;
        Object object = ao;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gx$State.jkg("jkh", jkc(int ), (int)0);
            }
            switch ((int)object) {
                case -1540458233: {
                    callSite = gx$State.jkg("jkj", jkc(int ), (int)1);
                    continue block5;
                }
                case 1043688888: {
                    callSite = gx$State.jkg("jkk", jkc(int ), (int)2);
                    continue block5;
                }
                case 1138972858: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ao - gx$State.jkg("jkl", jkc(int ), (int)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == gx$State.jkg("jkq", jkm(int ), (int)0)) break;
            object2 = gx$State.jkg("jkr", jkm(int ), (int)1);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ao - gx$State.jkg("jks", jkc(int ), (int)4)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == gx$State.jkg("jku", jkm(int ), (int)2)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gx$State.jkg("jkv", jkm(int ), (int)3);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = ao - gx$State.jkg("jkw", jkc(int ), (int)5)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == gx$State.jkg("jkx", jkm(int ), (int)4)) break;
            object4 = gx$State.jkg("jkz", jkm(int ), (int)5);
        }
        while (true) {
            long l5;
            Object object5;
            if ((object5 = (l5 = ao - gx$State.jkg("jla", jkc(int ), (int)6)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object5 == gx$State.jkg("jlb", jkm(int ), (int)6)) {
                return (gx$State[])$VALUES.clone();
            }
            object5 = gx$State.jkg("jlc", jkm(int ), (int)7);
        }
    }

    private static /* synthetic */ void joh() {
        gx$State.jke[0] = 2815953181396597977L;
        gx$State.jke[1] = 5908718810240220981L;
        gx$State.jke[2] = 3361749448550906896L;
        gx$State.jke[3] = 5951274869788373344L;
        gx$State.jke[4] = -7862728234576351135L;
        gx$State.jke[5] = 8844394321967331175L;
        gx$State.jke[6] = -6358609879185403585L;
        gx$State.jke[7] = 5627682207889080911L;
        gx$State.jke[8] = 9066761195020045490L;
        gx$State.jke[9] = -6582322379097923279L;
        gx$State.jke[10] = 204328395123597124L;
        gx$State.jke[11] = 97445413316790426L;
        gx$State.jke[12] = 8060222775751757957L;
        gx$State.jke[13] = 3133825737633900597L;
        gx$State.jke[14] = 2953234732555143557L;
        gx$State.jke[15] = -1489955178686406738L;
        gx$State.jke[16] = -6221463971381295477L;
        gx$State.jke[17] = -1089203159856018085L;
        gx$State.jke[18] = 8268732119314602287L;
        gx$State.jke[19] = -544519469903886307L;
        gx$State.jke[20] = 4813652372187811165L;
        gx$State.jke[21] = -5421656492073121202L;
        gx$State.jke[22] = 812579356812699056L;
        gx$State.jke[23] = -312049920469464568L;
        gx$State.jke[24] = -2724421148889212139L;
        gx$State.jke[25] = 4109485519541610001L;
        gx$State.jke[26] = 4527704349108818879L;
        gx$State.jke[27] = -8245323878445558971L;
        gx$State.jke[28] = -8474657765509927614L;
        gx$State.jke[29] = 5740310384675894894L;
    }

    private static /* synthetic */ void joc() {
        gx$State.jko[0] = 1294231561;
        gx$State.jko[1] = 1211704242;
        gx$State.jko[2] = -544518900;
        gx$State.jko[3] = -1901611520;
        gx$State.jko[4] = -1962306072;
        gx$State.jko[5] = -713690591;
        gx$State.jko[6] = -1358355527;
        gx$State.jko[7] = 1090258252;
        gx$State.jko[8] = -77237807;
        gx$State.jko[9] = -1786179935;
        gx$State.jko[10] = -2132507693;
        gx$State.jko[11] = 2005264355;
        gx$State.jko[12] = 40297266;
        gx$State.jko[13] = -136494339;
        gx$State.jko[14] = 1956015446;
        gx$State.jko[15] = -1929155775;
        gx$State.jko[16] = -358888280;
        gx$State.jko[17] = 1682842299;
        gx$State.jko[18] = -779203674;
        gx$State.jko[19] = -467912002;
        gx$State.jko[20] = 280071076;
        gx$State.jko[21] = 690866362;
        gx$State.jko[22] = 1050035973;
        gx$State.jko[23] = -1126397309;
        gx$State.jko[24] = -980527119;
        gx$State.jko[25] = -265666212;
        gx$State.jko[26] = -669189561;
        gx$State.jko[27] = -1354127991;
        gx$State.jko[28] = 1162495353;
        gx$State.jko[29] = 767245768;
        gx$State.jko[30] = 74395385;
        gx$State.jko[31] = 1564105061;
        gx$State.jko[32] = 777209960;
        gx$State.jko[33] = -1745387282;
        gx$State.jko[34] = -773167837;
        gx$State.jko[35] = -149213941;
        gx$State.jko[36] = 181925508;
        gx$State.jko[37] = 1278266919;
        gx$State.jko[38] = 109968842;
        gx$State.jko[39] = -984210037;
        gx$State.jko[40] = 2076169955;
        gx$State.jko[41] = -741654448;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gx$State valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx$State.ao - gx$State.jkg("jlj", jkc(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gx$State.jkg("jlk", jkm(int ), (int)12)) break;
            v0 /* !! */  = (long)gx$State.jkg("jll", jkm(int ), (int)13);
        }
        var3_1 = gx$State.c;
        v1 /* !! */  = gx$State.ao;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(gx$State.jkg("jlo", jkc(int ), (int)9) - gx$State.jkg("jlm", jkc(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 397024596: {
                    continue block15;
                }
                case 1138972858: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx$State.b;
        v2 /* !! */  = gx$State.ao;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(gx$State.jkg("jlq", jkc(int ), (int)11) - gx$State.jkg("jlp", jkc(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -878814173: {
                    continue block16;
                }
                case 1138972858: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = gx$State.a;
        if (!var3_1) ** GOTO lbl34
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl34:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = gx$State.ao - gx$State.jkg("jls", jkc(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gx$State.jkg("jlt", jkm(int ), (int)14)) break;
                    v3 /* !! */  = (long)gx$State.jkg("jlu", jkm(int ), (int)15);
                }
                return Enum.valueOf(gx$State.class, var0);
                case 0: {
                    var2_2 /* !! */  = (int)gx$State.jkg("jlw", jkm(int ), (int)16);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl52
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gx$State.jkg("jlx", jkm(int ), (int)17);
                        if (!var3_1) break block17;
                        throw null;
                    }
                }
lbl52:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)gx$State.jkg("jly", jkm(int ), (int)18);
                    if (!var3_1) break block17;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)gx$State.jkg("jma", jkm(int ), (int)19);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jkm(int n2) {
        return jko[n2] ^ jkp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gx$State() {
        var4_3 /* !! */  = gx$State.b;
        var3_4 = gx$State.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)gx$State.jkg("jmb", jkm(int ), (int)20);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gx$State.jkg("jmd", jkm(int ), (int)21);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)gx$State.jkg("jme", jkm(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ long jkc(int n2) {
        return jke[n2] ^ jkf[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ gx$State[] $values() {
        v0 /* !! */  = gx$State.ao;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - gx$State.jkg("jmf", jkc(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1594725268: {
                    v1 = gx$State.jkg("jmh", jkc(int ), (int)14);
                    continue block27;
                }
                case -1219847678: {
                    v1 = gx$State.jkg("jmi", jkc(int ), (int)15);
                    continue block27;
                }
                case 1138972858: {
                    break block27;
                }
                case 1194816066: {
                    v1 = gx$State.jkg("jmj", jkc(int ), (int)16);
                    continue block27;
                }
            }
            break;
        }
        var2 = gx$State.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gx$State.ao - gx$State.jkg("jmk", jkc(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gx$State.jkg("jml", jkm(int ), (int)23)) break;
            v2 /* !! */  = (long)gx$State.jkg("jmn", jkm(int ), (int)24);
        }
        var1_1 /* !! */  = gx$State.b;
        v3 /* !! */  = gx$State.ao;
        block29: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -15849100: {
                    v3 /* !! */  = (long)(gx$State.jkg("jmp", jkc(int ), (int)19) - gx$State.jkg("jmo", jkc(int ), (int)18));
                    continue block29;
                }
                case 1138972858: {
                    break block29;
                }
            }
            break;
        }
        var0_2 = gx$State.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block30: while (true) {
            block43: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2) {
                            throw null;
                        }
                        if (var0_2 || var0_2) {
                            return null;
                        }
                        v4 = new gx$State[5];
                        v5 = gx$State.jkg("jms", jkm(int ), (int)25);
                        while (true) {
                            if ((v6 = (cfr_temp_2 = gx$State.ao - gx$State.jkg("jmt", jkc(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v6 != gx$State.jkg("jmu", jkm(int ), (int)26)) ** GOTO lbl50
                            v4[v5] = gx$State.WATCHING;
                            v7 = gx$State.jkg("jmw", jkm(int ), (int)27);
                            ** GOTO lbl63
lbl50:
                            // 1 sources

                            v6 = 621601632;
                        }
                    }
                    case 0: {
                        ** GOTO lbl58
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)gx$State.jkg("jnu", jkm(int ), (int)36);
                        if (var2) {
                            throw null;
                        }
lbl58:
                        // 3 sources

                        var1_1 /* !! */  = (int)gx$State.jkg("jnq", jkm(int ), (int)33);
                        cfr_temp_0 = 2;
                        if (var2) {
                            throw null;
                        }
                        break block43;
                    }
lbl63:
                    // 1 sources

                    while (true) {
                        if ((v8 = (cfr_temp_3 = gx$State.ao - gx$State.jkg("jmy", jkc(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 != gx$State.jkg("jmz", jkm(int ), (int)28)) ** GOTO lbl70
                        v4[v7] = gx$State.ARMED;
                        v9 = gx$State.jkg("jnb", jkm(int ), (int)29);
                        v10 /* !! */  = gx$State.ao;
                        if (true) ** GOTO lbl74
lbl70:
                        // 1 sources

                        v8 = 1150267046;
                    }
                    block33: while (true) {
                        v10 /* !! */  = (long)(v11 - gx$State.jkg("jnc", jkc(int ), (int)22));
lbl74:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 1137670861: {
                                v11 = gx$State.jkg("jne", jkc(int ), (int)23);
                                continue block33;
                            }
                            case 1138972858: {
                                break block33;
                            }
                            case 1602228700: {
                                v11 = gx$State.jkg("jnf", jkc(int ), (int)24);
                                continue block33;
                            }
                        }
                        break;
                    }
                    v4[v9] = gx$State.APPROACHING;
                    v12 = gx$State.jkg("jnh", jkm(int ), (int)30);
                    v13 /* !! */  = gx$State.ao;
                    if (true) ** GOTO lbl89
                    block34: while (true) {
                        v13 /* !! */  = (long)(v14 - gx$State.jkg("jni", jkc(int ), (int)25));
lbl89:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -1260660056: {
                                v14 = gx$State.jkg("jnj", jkc(int ), (int)26);
                                continue block34;
                            }
                            case 312670816: {
                                v14 = gx$State.jkg("jnk", jkc(int ), (int)27);
                                continue block34;
                            }
                            case 795981831: {
                                v14 = gx$State.jkg("jnl", jkc(int ), (int)28);
                                continue block34;
                            }
                            case 1138972858: {
                                break block34;
                            }
                        }
                        break;
                    }
                    v4[v12] = gx$State.LOOTING;
                    v15 = gx$State.jkg("jnn", jkm(int ), (int)31);
                    while (true) {
                        if ((v16 = (cfr_temp_4 = gx$State.ao - gx$State.jkg("jno", jkc(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v16 == gx$State.jkg("jnp", jkm(int ), (int)32)) {
                            v4[v15] = gx$State.WAITING_SPAWN;
                            return v4;
                        }
                        v16 = -400719672;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)gx$State.jkg("jns", jkm(int ), (int)34);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl119
            }
            do {
                if (true) continue block30;
lbl119:
                // 2 sources

                var1_1 /* !! */  = (int)gx$State.jkg("jnt", jkm(int ), (int)35);
                cfr_temp_0 = 1;
            } while (!var2);
            break;
        }
        throw null;
    }

    public static /* synthetic */ CallSite jkg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

