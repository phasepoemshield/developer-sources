/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class cb$Phase
extends Enum<cb$Phase> {
    public static final /* enum */ cb$Phase POST;
    private static long[] fjde;
    public static final int b;
    public static final long mf = -1450447406030349559L;
    private static final /* synthetic */ cb$Phase[] $VALUES;
    public static final boolean c;
    public static final boolean a;
    private static int[] fjeg;
    public static final /* enum */ cb$Phase PRE;
    private static long[] fjdg;
    private static int[] fjeh;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static cb$Phase[] values() {
        boolean bl2;
        Object object = mf;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - cb$Phase.fjdp("fjdq", fjdc(int ), (int)0);
            }
            switch ((int)object) {
                case -1527897043: {
                    callSite = cb$Phase.fjdp("fjds", fjdc(int ), (int)1);
                    continue block10;
                }
                case -567502071: {
                    break block10;
                }
                case 2089702191: {
                    callSite = cb$Phase.fjdp("fjdt", fjdc(int ), (int)2);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = mf;
        boolean bl5 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - cb$Phase.fjdp("fjdu", fjdc(int ), (int)3);
            }
            switch ((int)object2) {
                case -2146836698: {
                    callSite = cb$Phase.fjdp("fjdv", fjdc(int ), (int)4);
                    continue block11;
                }
                case -567502071: {
                    break block11;
                }
                case 69948605: {
                    callSite = cb$Phase.fjdp("fjdw", fjdc(int ), (int)5);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = mf - cb$Phase.fjdp("fjee", fjdc(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == cb$Phase.fjdp("fjei", fjef(int ), (int)0)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = cb$Phase.fjdp("fjej", fjef(int ), (int)1);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = mf - cb$Phase.fjdp("fjeo", fjdc(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == cb$Phase.fjdp("fjep", fjef(int ), (int)2)) break;
            object4 = cb$Phase.fjdp("fjer", fjef(int ), (int)3);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = mf - cb$Phase.fjdp("fjes", fjdc(int ), (int)8)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == cb$Phase.fjdp("fjeu", fjef(int ), (int)4)) {
                return (cb$Phase[])$VALUES.clone();
            }
            object5 = cb$Phase.fjdp("fjew", fjef(int ), (int)5);
        }
    }

    private static /* synthetic */ void fjix() {
        cb$Phase.fjeh[0] = -391878657;
        cb$Phase.fjeh[1] = 1967237008;
        cb$Phase.fjeh[2] = 39567749;
        cb$Phase.fjeh[3] = -45511346;
        cb$Phase.fjeh[4] = -525517033;
        cb$Phase.fjeh[5] = -1509366974;
        cb$Phase.fjeh[6] = 754206070;
        cb$Phase.fjeh[7] = 1930653272;
        cb$Phase.fjeh[8] = 2057254933;
        cb$Phase.fjeh[9] = 745022086;
        cb$Phase.fjeh[10] = -2115273664;
        cb$Phase.fjeh[11] = -617703355;
        cb$Phase.fjeh[12] = -462128301;
        cb$Phase.fjeh[13] = -1741979260;
        cb$Phase.fjeh[14] = -1506682969;
        cb$Phase.fjeh[15] = 1156855916;
        cb$Phase.fjeh[16] = 230572923;
        cb$Phase.fjeh[17] = -38417377;
        cb$Phase.fjeh[18] = 691543189;
        cb$Phase.fjeh[19] = 151112425;
        cb$Phase.fjeh[20] = -1087086098;
        cb$Phase.fjeh[21] = -359090788;
        cb$Phase.fjeh[22] = 1672922300;
        cb$Phase.fjeh[23] = 1079747662;
        cb$Phase.fjeh[24] = 1662573408;
        cb$Phase.fjeh[25] = 2016666732;
        cb$Phase.fjeh[26] = 379546186;
        cb$Phase.fjeh[27] = -821310465;
        cb$Phase.fjeh[28] = -331269982;
        cb$Phase.fjeh[29] = -844337793;
        cb$Phase.fjeh[30] = 1444079085;
        cb$Phase.fjeh[31] = 747172162;
        cb$Phase.fjeh[32] = 87798902;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ cb$Phase[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cb$Phase.mf - cb$Phase.fjdp("fjha", fjdc(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cb$Phase.fjdp("fjhb", fjef(int ), (int)19)) break;
            v0 /* !! */  = (long)cb$Phase.fjdp("fjhd", fjef(int ), (int)20);
        }
        var2 = cb$Phase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cb$Phase.mf - cb$Phase.fjdp("fjhf", fjdc(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cb$Phase.fjdp("fjhh", fjef(int ), (int)21)) break;
            v1 /* !! */  = (long)cb$Phase.fjdp("fjhm", fjef(int ), (int)22);
        }
        var1_1 /* !! */  = cb$Phase.b;
        v2 /* !! */  = cb$Phase.mf;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - cb$Phase.fjdp("fjhn", fjdc(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -567502071: {
                    break block13;
                }
                case 1982685494: {
                    v3 = cb$Phase.fjdp("fjho", fjdc(int ), (int)21);
                    continue block13;
                }
                case 2105519374: {
                    v3 = cb$Phase.fjdp("fjhp", fjdc(int ), (int)22);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = cb$Phase.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 = new cb$Phase[2];
                v5 = cb$Phase.fjdp("fjhq", fjef(int ), (int)23);
                while (true) {
                    if ((v6 = (cfr_temp_2 = cb$Phase.mf - cb$Phase.fjdp("fjhr", fjdc(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == cb$Phase.fjdp("fjhx", fjef(int ), (int)24)) break;
                    v6 = 876525024;
                }
                v4[v5] = cb$Phase.PRE;
                v7 = cb$Phase.fjdp("fjhy", fjef(int ), (int)25);
                while (true) {
                    if ((v8 = (cfr_temp_3 = cb$Phase.mf - cb$Phase.fjdp("fjhz", fjdc(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == cb$Phase.fjdp("fjia", fjef(int ), (int)26)) break;
                    v8 = 43977727;
                }
                v4[v7] = cb$Phase.POST;
                return v4;
            }
lbl56:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)cb$Phase.fjdp("fjib", fjef(int ), (int)27);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)cb$Phase.fjdp("fjid", fjef(int ), (int)28);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)cb$Phase.fjdp("fjik", fjef(int ), (int)29);
                    if (!var2) ** GOTO lbl56
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)cb$Phase.fjdp("fjil", fjef(int ), (int)30);
        ** while (!var2)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static cb$Phase valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cb$Phase.mf - cb$Phase.fjdp("fjfg", fjdc(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cb$Phase.fjdp("fjfh", fjef(int ), (int)10)) break;
            v0 /* !! */  = (long)cb$Phase.fjdp("fjfi", fjef(int ), (int)11);
        }
        var3_1 = cb$Phase.c;
        v1 /* !! */  = cb$Phase.mf;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - cb$Phase.fjdp("fjfj", fjdc(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2048481931: {
                    v2 = cb$Phase.fjdp("fjfr", fjdc(int ), (int)11);
                    continue block15;
                }
                case -567502071: {
                    break block15;
                }
                case 204245479: {
                    v2 = cb$Phase.fjdp("fjfs", fjdc(int ), (int)12);
                    continue block15;
                }
            }
            break;
        }
        var2_2 = cb$Phase.b;
        v3 /* !! */  = cb$Phase.mf;
        if (true) ** GOTO lbl26
        block16: while (true) {
            v3 /* !! */  = (long)(cb$Phase.fjdp("fjfv", fjdc(int ), (int)14) - cb$Phase.fjdp("fjft", fjdc(int ), (int)13));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -567502071: {
                    break block16;
                }
                case 1793138726: {
                    continue block16;
                }
            }
            break;
        }
        var1_3 = cb$Phase.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = cb$Phase.mf;
        if (true) ** GOTO lbl41
        block18: while (true) {
            v4 /* !! */  = (long)(v5 - cb$Phase.fjdp("fjfy", fjdc(int ), (int)15));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -567502071: {
                    break block18;
                }
                case 99068218: {
                    v5 = cb$Phase.fjdp("fjga", fjdc(int ), (int)16);
                    continue block18;
                }
                case 1172027678: {
                    v5 = cb$Phase.fjdp("fjgh", fjdc(int ), (int)17);
                    continue block18;
                }
            }
            break;
        }
        return Enum.valueOf(cb$Phase.class, var0);
    }

    private static /* synthetic */ int fjef(int n2) {
        return fjeg[n2] ^ fjeh[n2];
    }

    private static /* synthetic */ void fjjl() {
        cb$Phase.fjdg[0] = -3036266617036860090L;
        cb$Phase.fjdg[1] = 2886681679366899945L;
        cb$Phase.fjdg[2] = -2895145206159869051L;
        cb$Phase.fjdg[3] = 946749820502997111L;
        cb$Phase.fjdg[4] = -6639902320970945447L;
        cb$Phase.fjdg[5] = 2833951695030035606L;
        cb$Phase.fjdg[6] = -6970266834942460526L;
        cb$Phase.fjdg[7] = -5407282607635412279L;
        cb$Phase.fjdg[8] = -6483380387560382044L;
        cb$Phase.fjdg[9] = 8630643726640409711L;
        cb$Phase.fjdg[10] = 7461180567806599114L;
        cb$Phase.fjdg[11] = 6845808343384322137L;
        cb$Phase.fjdg[12] = 1392361808508410345L;
        cb$Phase.fjdg[13] = -7946198636863601099L;
        cb$Phase.fjdg[14] = 5446843770960416618L;
        cb$Phase.fjdg[15] = 5974784017732460549L;
        cb$Phase.fjdg[16] = -6463678202287455793L;
        cb$Phase.fjdg[17] = 7860697901708736531L;
        cb$Phase.fjdg[18] = 3802389124478354278L;
        cb$Phase.fjdg[19] = -8027896596163865673L;
        cb$Phase.fjdg[20] = 655853788694038077L;
        cb$Phase.fjdg[21] = -8095328711084080194L;
        cb$Phase.fjdg[22] = 3370669611660230608L;
        cb$Phase.fjdg[23] = -6364677716849074021L;
        cb$Phase.fjdg[24] = 1811155999617696244L;
    }

    private static /* synthetic */ void fjiq() {
        cb$Phase.fjeg[0] = -391878658;
        cb$Phase.fjeg[1] = 1167269684;
        cb$Phase.fjeg[2] = -39567750;
        cb$Phase.fjeg[3] = -1206629308;
        cb$Phase.fjeg[4] = -525517034;
        cb$Phase.fjeg[5] = -176649639;
        cb$Phase.fjeg[6] = 754206071;
        cb$Phase.fjeg[7] = 1930653275;
        cb$Phase.fjeg[8] = 2057254932;
        cb$Phase.fjeg[9] = 745022086;
        cb$Phase.fjeg[10] = -2115273663;
        cb$Phase.fjeg[11] = 815277092;
        cb$Phase.fjeg[12] = -462128302;
        cb$Phase.fjeg[13] = -1741979259;
        cb$Phase.fjeg[14] = -1506682972;
        cb$Phase.fjeg[15] = 1156855917;
        cb$Phase.fjeg[16] = 230572922;
        cb$Phase.fjeg[17] = -38417377;
        cb$Phase.fjeg[18] = 691543189;
        cb$Phase.fjeg[19] = 151112424;
        cb$Phase.fjeg[20] = -393344262;
        cb$Phase.fjeg[21] = -359090787;
        cb$Phase.fjeg[22] = -1974464690;
        cb$Phase.fjeg[23] = 1079747662;
        cb$Phase.fjeg[24] = 1662573409;
        cb$Phase.fjeg[25] = 2016666733;
        cb$Phase.fjeg[26] = -379546187;
        cb$Phase.fjeg[27] = -821310465;
        cb$Phase.fjeg[28] = -331269983;
        cb$Phase.fjeg[29] = -844337795;
        cb$Phase.fjeg[30] = 1444079084;
        cb$Phase.fjeg[31] = 747172162;
        cb$Phase.fjeg[32] = 87798903;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private cb$Phase() {
        var4_3 /* !! */  = cb$Phase.b;
        var3_4 = cb$Phase.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)cb$Phase.fjdp("fjgp", fjef(int ), (int)16);
            }
            case 1: {
                var4_3 /* !! */  = (int)cb$Phase.fjdp("fjgq", fjef(int ), (int)17);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)cb$Phase.fjdp("fjgy", fjef(int ), (int)18);
        }
    }

    private static /* synthetic */ long fjdc(int n2) {
        return fjde[n2] ^ fjdg[n2];
    }

    public static /* synthetic */ CallSite fjdp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fjjd() {
        cb$Phase.fjde[0] = -262493060847110380L;
        cb$Phase.fjde[1] = 7614864098270996001L;
        cb$Phase.fjde[2] = 1344910307432705122L;
        cb$Phase.fjde[3] = -4562863761249002494L;
        cb$Phase.fjde[4] = -6153707293895901476L;
        cb$Phase.fjde[5] = 8197816450897607015L;
        cb$Phase.fjde[6] = 1832649465554351482L;
        cb$Phase.fjde[7] = 5014185616263811049L;
        cb$Phase.fjde[8] = 1627602964281799011L;
        cb$Phase.fjde[9] = -3634675705834407481L;
        cb$Phase.fjde[10] = 8963201957648164283L;
        cb$Phase.fjde[11] = 5259215155761443535L;
        cb$Phase.fjde[12] = -8138434772618990224L;
        cb$Phase.fjde[13] = -6674725596988324589L;
        cb$Phase.fjde[14] = -4090550288079325354L;
        cb$Phase.fjde[15] = 7965922734329022837L;
        cb$Phase.fjde[16] = -8626348318353436383L;
        cb$Phase.fjde[17] = 6452855766554652720L;
        cb$Phase.fjde[18] = -5831383532063487926L;
        cb$Phase.fjde[19] = 1558423577564472163L;
        cb$Phase.fjde[20] = -9027709886081773503L;
        cb$Phase.fjde[21] = -7305309404441825044L;
        cb$Phase.fjde[22] = -3162800898708515032L;
        cb$Phase.fjde[23] = 4584696754724060256L;
        cb$Phase.fjde[24] = 6635913609146799526L;
    }

    static {
        fjeg = new int[33];
        fjeh = new int[33];
        cb$Phase.fjiq();
        cb$Phase.fjix();
        fjde = new long[25];
        fjdg = new long[25];
        cb$Phase.fjjd();
        cb$Phase.fjjl();
        PRE = new cb$Phase();
        POST = new cb$Phase();
        $VALUES = cb$Phase.$values();
    }
}

