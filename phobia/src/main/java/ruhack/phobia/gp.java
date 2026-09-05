/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.aw;
import ruhack.phobia.bp;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.g;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.na;
import ruhack.phobia.nj;

public class gp
extends ds {
    static final long gz = 2512523749447563756L;
    public final kb clientCommands;
    private static int[] dabh = new int[73];
    public final kb baritoneCommands;
    private static long[] dabu;
    private static int[] dabi;
    public static final boolean c;
    private static long[] dabt;
    public static final int b;
    public static final boolean a;

    private static /* synthetic */ void dbeg() {
        gp.dabt[0] = 1884164329564589013L;
        gp.dabt[1] = 8768708962417206995L;
        gp.dabt[2] = -8521467954977002606L;
        gp.dabt[3] = -51176945867092563L;
        gp.dabt[4] = 1277903417112986294L;
        gp.dabt[5] = 4183537359254314383L;
        gp.dabt[6] = -974932019963896157L;
        gp.dabt[7] = 3605889223427733364L;
        gp.dabt[8] = 5715645033280345961L;
        gp.dabt[9] = -8919194258694415309L;
        gp.dabt[10] = -4343135682537440963L;
        gp.dabt[11] = -8117666756474465229L;
        gp.dabt[12] = -7433976827391870246L;
        gp.dabt[13] = 3664128125083035811L;
        gp.dabt[14] = 8338762681418888602L;
        gp.dabt[15] = 1418077447101024066L;
        gp.dabt[16] = -195994301163716623L;
        gp.dabt[17] = -1034964576808790609L;
        gp.dabt[18] = 3561156435679515286L;
        gp.dabt[19] = -989690918644286918L;
        gp.dabt[20] = -4620871461521727421L;
        gp.dabt[21] = -4430107447347235192L;
        gp.dabt[22] = -8110559065653344465L;
        gp.dabt[23] = 3494543006387166369L;
        gp.dabt[24] = 7405833955522819107L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gp() {
        var2_1 /* !! */  = gp.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("NoCommand", "\u0411\u043b\u043e\u043a\u0438\u0440\u0443\u0435\u0442 \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u043a\u043b\u0438\u0435\u043d\u0442\u0430 \u0438 Baritone", du.PLAYER);
                this.clientCommands = new kb("\u041a\u043e\u043c\u0430\u043d\u0434\u044b \u043a\u043b\u0438\u0435\u043d\u0442\u0430", "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u043a\u043b\u0438\u0435\u043d\u0442\u0430 (\u043f\u0440\u0435\u0444\u0438\u043a\u0441 .)").setValue((boolean)gp.dabj("dabk", dabg(int ), (int)0));
                this.baritoneCommands = new kb("Baritone", "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u044b Baritone (\u043f\u0440\u0435\u0444\u0438\u043a\u0441 #)").setValue((boolean)gp.dabj("dabl", dabg(int ), (int)1));
                this.settings(new jx[]{this.clientCommands, this.baritoneCommands});
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gp.dabj("dabm", dabg(int ), (int)2);
                ** GOTO lbl17
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gp.dabj("dabn", dabg(int ), (int)3);
                    continue;
                    break;
                }
            }
lbl17:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)gp.dabj("dabo", dabg(int ), (int)4);
                ** GOTO lbl10
            }
lbl20:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)gp.dabj("dabp", dabg(int ), (int)5);
                ** GOTO lbl17
            }
            case 4: {
                var2_1 /* !! */  = (int)gp.dabj("dabq", dabg(int ), (int)6);
                ** GOTO lbl20
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)gp.dabj("dabr", dabg(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void dbeh() {
        gp.dabu[0] = -5459945190181540650L;
        gp.dabu[1] = -7432283879245014712L;
        gp.dabu[2] = -920887489254186527L;
        gp.dabu[3] = 1590029919236874691L;
        gp.dabu[4] = 8666349536514656626L;
        gp.dabu[5] = 3642341122735690710L;
        gp.dabu[6] = 9184416260174622254L;
        gp.dabu[7] = -6769697199777935828L;
        gp.dabu[8] = 3049644437475136932L;
        gp.dabu[9] = 5217573915018263039L;
        gp.dabu[10] = -1041008357319504742L;
        gp.dabu[11] = -8347717443385726378L;
        gp.dabu[12] = 3695613672897113671L;
        gp.dabu[13] = -3024677377076645304L;
        gp.dabu[14] = 5555964879483716548L;
        gp.dabu[15] = 1026122939256702329L;
        gp.dabu[16] = -247108016115075369L;
        gp.dabu[17] = -4683615395604754585L;
        gp.dabu[18] = 7204150299833048916L;
        gp.dabu[19] = -472485950776922492L;
        gp.dabu[20] = 2428180742747622069L;
        gp.dabu[21] = -7872009436834827784L;
        gp.dabu[22] = -9185067913772809607L;
        gp.dabu[23] = 2161751678614170279L;
        gp.dabu[24] = 4714621563692146148L;
    }

    private static /* synthetic */ int dabg(int n2) {
        return dabh[n2] ^ dabi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gp getInstance() {
        v0 /* !! */  = gp.gz;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(gp.dabj("dabw", dabs(int ), (int)1) - gp.dabj("dabv", dabs(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -946996756: {
                    break block18;
                }
                case -379837612: {
                    continue block18;
                }
            }
            break;
        }
        var2 = gp.c;
        v1 /* !! */  = gp.gz;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(gp.dabj("daby", dabs(int ), (int)3) - gp.dabj("dabx", dabs(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -946996756: {
                    break block19;
                }
                case -785670568: {
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = gp.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = gp.gz;
                if (true) ** GOTO lbl28
                block20: while (true) {
                    v2 /* !! */  = (long)(gp.dabj("daca", dabs(int ), (int)5) - gp.dabj("dabz", dabs(int ), (int)4));
lbl28:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1770477670: {
                            continue block20;
                        }
                        case -946996756: {
                            break block20;
                        }
                    }
                    break;
                }
                var0_2 = gp.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = gp.gz - gp.dabj("dacb", dabs(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gp.dabj("dacc", dabg(int ), (int)8)) break;
                    v3 /* !! */  = (long)gp.dabj("dacd", dabg(int ), (int)9);
                }
                return nj.get(gp.class);
            }
lbl46:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)gp.dabj("dace", dabg(int ), (int)10);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)gp.dabj("dacf", dabg(int ), (int)11);
                if (!var2) ** GOTO lbl46
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)gp.dabj("dacg", dabg(int ), (int)12);
                    if (!var2) break block8;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gp.dabj("dach", dabg(int ), (int)13);
        ** while (!var2)
lbl62:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite dabj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dabi = new int[73];
        gp.dbam();
        gp.dbbe();
        dabt = new long[25];
        dabu = new long[25];
        gp.dbeg();
        gp.dbeh();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = gp.gz;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(gp.dabj("dadi", dabs(int ), (int)19) - gp.dabj("dadh", dabs(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -946996756: {
                    break block17;
                }
                case 1257745826: {
                    continue block17;
                }
            }
            break;
        }
        var3_1 = gp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = gp.gz - gp.dabj("dadj", dabs(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gp.dabj("dadk", dabg(int ), (int)28)) break;
            v1 /* !! */  = (long)gp.dabj("dadl", dabg(int ), (int)29);
        }
        var2_2 /* !! */  = gp.b;
        v2 /* !! */  = gp.gz;
        if (true) ** GOTO lbl21
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - gp.dabj("dadm", dabs(int ), (int)21));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2021459873: {
                    v3 = gp.dabj("dadn", dabs(int ), (int)22);
                    continue block19;
                }
                case -946996756: {
                    break block19;
                }
                case -284122535: {
                    v3 = gp.dabj("dado", dabs(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = gp.a;
        if (var3_1) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = gp.dabj("dadp", dabg(int ), (int)30);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gp.gz - gp.dabj("dadq", dabs(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gp.dabj("dadr", dabg(int ), (int)31)) break;
                    v5 /* !! */  = (long)gp.dabj("dads", dabg(int ), (int)32);
                }
                na.setCommandsEnabled((boolean)v4);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gp.dabj("dadt", dabg(int ), (int)33);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gp.dabj("dadu", dabg(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 2: {
                var2_2 /* !! */  = (int)gp.dabj("dadv", dabg(int ), (int)35);
                if (!var3_1) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)gp.dabj("dadw", dabg(int ), (int)36);
                } while (!var3_1);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gp.dabj("dadx", dabg(int ), (int)37);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)gp.dabj("dady", dabg(int ), (int)38);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbbe() {
        gp.dabi[0] = -1687223174;
        gp.dabi[1] = 888688476;
        gp.dabi[2] = 649289325;
        gp.dabi[3] = -1843724702;
        gp.dabi[4] = 510702928;
        gp.dabi[5] = 1100676636;
        gp.dabi[6] = 2067879020;
        gp.dabi[7] = 468077992;
        gp.dabi[8] = 906430249;
        gp.dabi[9] = -1488681677;
        gp.dabi[10] = -407482648;
        gp.dabi[11] = 984459008;
        gp.dabi[12] = -1767286819;
        gp.dabi[13] = -1050687372;
        gp.dabi[14] = 426814723;
        gp.dabi[15] = -626537396;
        gp.dabi[16] = -912093739;
        gp.dabi[17] = 87967507;
        gp.dabi[18] = 247273699;
        gp.dabi[19] = 1435459917;
        gp.dabi[20] = 574063572;
        gp.dabi[21] = 1460103396;
        gp.dabi[22] = 1701973582;
        gp.dabi[23] = 1354372119;
        gp.dabi[24] = 1212425202;
        gp.dabi[25] = -887278574;
        gp.dabi[26] = 240079798;
        gp.dabi[27] = -1697877552;
        gp.dabi[28] = 927818521;
        gp.dabi[29] = 1489448229;
        gp.dabi[30] = 1510476705;
        gp.dabi[31] = 671543147;
        gp.dabi[32] = 824519404;
        gp.dabi[33] = -753376757;
        gp.dabi[34] = -624444667;
        gp.dabi[35] = -2055336802;
        gp.dabi[36] = -721444765;
        gp.dabi[37] = 1698815776;
        gp.dabi[38] = 986793405;
        gp.dabi[39] = -1088306658;
        gp.dabi[40] = 1780777056;
        gp.dabi[41] = -392572606;
        gp.dabi[42] = 334711015;
        gp.dabi[43] = 99331684;
        gp.dabi[44] = -1421437447;
        gp.dabi[45] = -1899337608;
        gp.dabi[46] = -613185863;
        gp.dabi[47] = -1506978092;
        gp.dabi[48] = -784980275;
        gp.dabi[49] = -1719086949;
        gp.dabi[50] = -703583191;
        gp.dabi[51] = 357015894;
        gp.dabi[52] = -1381323008;
        gp.dabi[53] = -854206716;
        gp.dabi[54] = 1201018507;
        gp.dabi[55] = -1570254044;
        gp.dabi[56] = 2082331011;
        gp.dabi[57] = -281626746;
        gp.dabi[58] = -1813819522;
        gp.dabi[59] = -1374344987;
        gp.dabi[60] = 1244084376;
        gp.dabi[61] = 800670878;
        gp.dabi[62] = -1556421879;
        gp.dabi[63] = 1433885691;
        gp.dabi[64] = 29131413;
        gp.dabi[65] = 957734633;
        gp.dabi[66] = 847082496;
        gp.dabi[67] = -202397416;
        gp.dabi[68] = 2075285223;
        gp.dabi[69] = -638259243;
        gp.dabi[70] = 590099116;
        gp.dabi[71] = 1965239319;
        gp.dabi[72] = 1008062297;
    }

    private static /* synthetic */ long dabs(int n2) {
        return dabt[n2] ^ dabu[n2];
    }

    private static /* synthetic */ void dbam() {
        gp.dabh[0] = -1687223173;
        gp.dabh[1] = 888688477;
        gp.dabh[2] = 649289320;
        gp.dabh[3] = -1843724697;
        gp.dabh[4] = 510702933;
        gp.dabh[5] = 1100676632;
        gp.dabh[6] = 2067879016;
        gp.dabh[7] = 468077993;
        gp.dabh[8] = 906430248;
        gp.dabh[9] = 1407870460;
        gp.dabh[10] = -407482645;
        gp.dabh[11] = 984459010;
        gp.dabh[12] = -1767286820;
        gp.dabh[13] = -1050687372;
        gp.dabh[14] = 426814722;
        gp.dabh[15] = -175918793;
        gp.dabh[16] = 912093738;
        gp.dabh[17] = 916555612;
        gp.dabh[18] = 247273699;
        gp.dabh[19] = 1435459915;
        gp.dabh[20] = 574063572;
        gp.dabh[21] = 1460103393;
        gp.dabh[22] = 1701973579;
        gp.dabh[23] = 1354372115;
        gp.dabh[24] = 1212425201;
        gp.dabh[25] = -887278575;
        gp.dabh[26] = 240079799;
        gp.dabh[27] = -1697877552;
        gp.dabh[28] = 927818520;
        gp.dabh[29] = -627427701;
        gp.dabh[30] = 1510476704;
        gp.dabh[31] = -671543148;
        gp.dabh[32] = 563977382;
        gp.dabh[33] = -753376760;
        gp.dabh[34] = -624444667;
        gp.dabh[35] = -2055336801;
        gp.dabh[36] = -721444767;
        gp.dabh[37] = 1698815777;
        gp.dabh[38] = 986793407;
        gp.dabh[39] = -1088306658;
        gp.dabh[40] = 1780777068;
        gp.dabh[41] = -392572593;
        gp.dabh[42] = 334711032;
        gp.dabh[43] = 99331711;
        gp.dabh[44] = -1421437463;
        gp.dabh[45] = -1899337632;
        gp.dabh[46] = -613185868;
        gp.dabh[47] = -1506978103;
        gp.dabh[48] = -784980276;
        gp.dabh[49] = -1719086969;
        gp.dabh[50] = -703583183;
        gp.dabh[51] = 357015875;
        gp.dabh[52] = -1381322985;
        gp.dabh[53] = -854206711;
        gp.dabh[54] = 1201018526;
        gp.dabh[55] = -1570254041;
        gp.dabh[56] = 2082331018;
        gp.dabh[57] = -281626730;
        gp.dabh[58] = -1813819550;
        gp.dabh[59] = -1374344964;
        gp.dabh[60] = 1244084358;
        gp.dabh[61] = 800670866;
        gp.dabh[62] = -1556421861;
        gp.dabh[63] = 1433885666;
        gp.dabh[64] = 29131405;
        gp.dabh[65] = 957734646;
        gp.dabh[66] = 847082497;
        gp.dabh[67] = -202397430;
        gp.dabh[68] = 2075285245;
        gp.dabh[69] = -638259249;
        gp.dabh[70] = 590099112;
        gp.dabh[71] = 1965239313;
        gp.dabh[72] = 1008062295;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw(value=0)
    public void onChat(bp var1_1) {
        block66: {
            block65: {
                block64: {
                    var6_2 = gp.c;
                    var5_3 /* !! */  = gp.b;
                    var4_4 = gp.a;
                    if (var6_2) {
                        throw null;
lbl6:
                        // 18 sources

                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    var2_5 = var1_1.getMessage();
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 == null) break block64;
                    if (var4_4) ** GOTO lbl6
                    if (!var2_5.isEmpty()) break block65;
                    if (var4_4) ** GOTO lbl6
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!this.clientCommands.isValue()) break block66;
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_6 = g.getInstance().getPrefix();
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var3_6 == null) break block66;
            if (var4_4) ** GOTO lbl6
            if (var3_6.isEmpty()) break block66;
            if (var4_4) ** GOTO lbl6
            if (!var2_5.startsWith(var3_6)) break block66;
            if (var4_4 || var4_4) ** GOTO lbl6
            var1_1.cancel();
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.baritoneCommands.isValue()) ** GOTO lbl46
                if (var4_4) ** GOTO lbl6
                if (!var2_5.startsWith("#")) ** GOTO lbl46
                if (var4_4 || var4_4) ** GOTO lbl6
                na.setCommandsEnabled((boolean)gp.dabj("dadz", dabg(int ), (int)39));
                if (var4_4 || var4_4) ** GOTO lbl6
                var1_1.cancel();
                if (var4_4) ** GOTO lbl6
lbl46:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gp.dabj("daea", dabg(int ), (int)40);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl181
                    break;
                }
            }
lbl55:
            // 2 sources

            case 1: {
                do {
                    var5_3 /* !! */  = (int)gp.dabj("daeb", dabg(int ), (int)41);
                } while (!var6_2);
                throw null;
            }
            case 2: {
                var5_3 /* !! */  = (int)gp.dabj("daec", dabg(int ), (int)42);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 3: {
                var5_3 /* !! */  = (int)gp.dabj("daed", dabg(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 4: {
                var5_3 /* !! */  = (int)gp.dabj("daee", dabg(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl75:
            // 5 sources

            case 5: {
                var5_3 /* !! */  = (int)gp.dabj("daef", dabg(int ), (int)45);
                if (!var6_2) break;
                throw null;
            }
lbl79:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)gp.dabj("daeg", dabg(int ), (int)46);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 7: {
                var5_3 /* !! */  = (int)gp.dabj("daeh", dabg(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl89:
            // 4 sources

            case 8: {
                var5_3 /* !! */  = (int)gp.dabj("daei", dabg(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl94:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)gp.dabj("daej", dabg(int ), (int)49);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
lbl98:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)gp.dabj("daek", dabg(int ), (int)50);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl103:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)gp.dabj("dael", dabg(int ), (int)51);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl108:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)gp.dabj("daem", dabg(int ), (int)52);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl113:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)gp.dabj("daen", dabg(int ), (int)53);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl117:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)gp.dabj("daeo", dabg(int ), (int)54);
                if (!var6_2) ** GOTO lbl103
                throw null;
            }
lbl121:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)gp.dabj("daep", dabg(int ), (int)55);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 16: {
                var5_3 /* !! */  = (int)gp.dabj("daeq", dabg(int ), (int)56);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)gp.dabj("daer", dabg(int ), (int)57);
                if (!var6_2) ** GOTO lbl113
                throw null;
            }
lbl134:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)gp.dabj("daes", dabg(int ), (int)58);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
lbl138:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)gp.dabj("daet", dabg(int ), (int)59);
                if (!var6_2) ** GOTO lbl117
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)gp.dabj("daeu", dabg(int ), (int)60);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 21: {
                var5_3 /* !! */  = (int)gp.dabj("daev", dabg(int ), (int)61);
                if (!var6_2) ** GOTO lbl98
                throw null;
            }
lbl151:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)gp.dabj("dazo", dabg(int ), (int)62);
                if (!var6_2) ** GOTO lbl79
                throw null;
            }
            case 23: {
                var5_3 /* !! */  = (int)gp.dabj("dazr", dabg(int ), (int)63);
                if (!var6_2) ** GOTO lbl55
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)gp.dabj("dazs", dabg(int ), (int)64);
                if (!var6_2) ** GOTO lbl94
                throw null;
            }
lbl163:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)gp.dabj("dazt", dabg(int ), (int)65);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl168:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)gp.dabj("dazu", dabg(int ), (int)66);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl173:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)gp.dabj("dazv", dabg(int ), (int)67);
                if (!var6_2) break;
                throw null;
            }
lbl177:
            // 3 sources

            case 28: {
                var5_3 /* !! */  = (int)gp.dabj("dazx", dabg(int ), (int)68);
                if (!var6_2) ** GOTO lbl121
                throw null;
            }
lbl181:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)gp.dabj("dazz", dabg(int ), (int)69);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
lbl185:
            // 3 sources

            case 30: {
                var5_3 /* !! */  = (int)gp.dabj("dbaf", dabg(int ), (int)70);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
lbl189:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)gp.dabj("dbag", dabg(int ), (int)71);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
            case 32: 
        }
        var5_3 /* !! */  = (int)gp.dabj("dbah", dabg(int ), (int)72);
        ** while (!var6_2)
lbl196:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gp.gz - gp.dabj("daci", dabs(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gp.dabj("dacj", dabg(int ), (int)14)) break;
            v0 /* !! */  = (long)gp.dabj("dack", dabg(int ), (int)15);
        }
        var3_1 = gp.c;
        v1 /* !! */  = gp.gz;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(gp.dabj("dacm", dabs(int ), (int)9) - gp.dabj("dacl", dabs(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1306660659: {
                    continue block29;
                }
                case -946996756: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = gp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gp.gz - gp.dabj("dacn", dabs(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gp.dabj("daco", dabg(int ), (int)16)) break;
            v2 /* !! */  = (long)gp.dabj("dacp", dabg(int ), (int)17);
        }
        var1_3 = gp.a;
        if (var3_1) {
            throw null;
lbl27:
            // 4 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl27
                v3 /* !! */  = gp.gz;
                if (true) ** GOTO lbl37
                block32: while (true) {
                    v3 /* !! */  = (long)(gp.dabj("dacr", dabs(int ), (int)12) - gp.dabj("dacq", dabs(int ), (int)11));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -946996756: {
                            break block32;
                        }
                        case 1144523607: {
                            continue block32;
                        }
                    }
                    break;
                }
                v4 /* !! */  = gp.gz;
                if (true) ** GOTO lbl46
                block33: while (true) {
                    v4 /* !! */  = (long)(gp.dabj("dact", dabs(int ), (int)14) - gp.dabj("dacs", dabs(int ), (int)13));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -946996756: {
                            break block33;
                        }
                        case 274367733: {
                            continue block33;
                        }
                    }
                    break;
                }
                if (!this.baritoneCommands.isValue()) ** GOTO lbl69
                if (var1_3 || var1_3) ** GOTO lbl27
                v5 = gp.dabj("dacu", dabg(int ), (int)18);
                v6 /* !! */  = gp.gz;
                if (true) ** GOTO lbl58
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - gp.dabj("dacv", dabs(int ), (int)15));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -946996756: {
                            break block34;
                        }
                        case 1551391881: {
                            v7 = gp.dabj("dacw", dabs(int ), (int)16);
                            continue block34;
                        }
                        case 1826030492: {
                            v7 = gp.dabj("dacx", dabs(int ), (int)17);
                            continue block34;
                        }
                    }
                    break;
                }
                na.setCommandsEnabled((boolean)v5);
                if (var1_3) ** GOTO lbl27
lbl69:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gp.dabj("dacy", dabg(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gp.dabj("dacz", dabg(int ), (int)20);
                if (!var3_1) break;
                throw null;
            }
lbl80:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)gp.dabj("dada", dabg(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl85:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gp.dabj("dadb", dabg(int ), (int)22);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)gp.dabj("dadc", dabg(int ), (int)23);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)gp.dabj("dadd", dabg(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 6: {
                var2_2 /* !! */  = (int)gp.dabj("dade", dabg(int ), (int)25);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
lbl102:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)gp.dabj("dadf", dabg(int ), (int)26);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)gp.dabj("dadg", dabg(int ), (int)27);
        } while (!var3_1);
        throw null;
    }
}

