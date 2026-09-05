/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

public final class mk$PartyPosition
extends Record {
    private static int[] bbgr = new int[90];
    public static final int b;
    private static int[] bbgu;
    private final String serverAddress;
    public static final boolean a;
    public static final boolean c;
    private final String login;
    private final double x;
    private static final long cu = 6712757381937794823L;
    private final String playerName;
    private static long[] bbhl;
    private final double z;
    private final long updatedAt;
    private final double y;
    private static long[] bbhm;

    private static /* synthetic */ void bbrc() {
        mk$PartyPosition.bbhm[0] = 8341278405538551152L;
        mk$PartyPosition.bbhm[1] = -3107325314237508260L;
        mk$PartyPosition.bbhm[2] = -2949195059957177787L;
        mk$PartyPosition.bbhm[3] = 2375514943868892156L;
        mk$PartyPosition.bbhm[4] = 8179116845921538920L;
        mk$PartyPosition.bbhm[5] = 3433812501896086246L;
        mk$PartyPosition.bbhm[6] = 7371505084898704431L;
        mk$PartyPosition.bbhm[7] = 5041613343434950099L;
        mk$PartyPosition.bbhm[8] = -7670437186045555952L;
        mk$PartyPosition.bbhm[9] = -5577865470561799159L;
        mk$PartyPosition.bbhm[10] = 2346200919371246601L;
        mk$PartyPosition.bbhm[11] = 5259658920138162599L;
        mk$PartyPosition.bbhm[12] = 2778401399423744121L;
        mk$PartyPosition.bbhm[13] = -3493785679407190218L;
        mk$PartyPosition.bbhm[14] = 4072651222376357355L;
        mk$PartyPosition.bbhm[15] = 121448630958113511L;
        mk$PartyPosition.bbhm[16] = 4250387192298409171L;
        mk$PartyPosition.bbhm[17] = -466289779413536270L;
        mk$PartyPosition.bbhm[18] = 3507605316287466941L;
        mk$PartyPosition.bbhm[19] = -5215448338091953349L;
        mk$PartyPosition.bbhm[20] = -7825379497312442204L;
        mk$PartyPosition.bbhm[21] = 8437997667192721735L;
        mk$PartyPosition.bbhm[22] = -7734141756998919493L;
        mk$PartyPosition.bbhm[23] = -8828066822457453949L;
        mk$PartyPosition.bbhm[24] = 2387514977319815275L;
        mk$PartyPosition.bbhm[25] = 6771564114777469861L;
        mk$PartyPosition.bbhm[26] = 5717544325334009364L;
        mk$PartyPosition.bbhm[27] = -1148779725957703508L;
        mk$PartyPosition.bbhm[28] = 3659750882359870664L;
        mk$PartyPosition.bbhm[29] = 4548862823469179075L;
        mk$PartyPosition.bbhm[30] = 6774635258774232832L;
        mk$PartyPosition.bbhm[31] = -1796008952145874741L;
        mk$PartyPosition.bbhm[32] = 8288810001625826116L;
        mk$PartyPosition.bbhm[33] = 8523541738342651444L;
        mk$PartyPosition.bbhm[34] = 3818480100306902581L;
        mk$PartyPosition.bbhm[35] = -8451467630918999110L;
        mk$PartyPosition.bbhm[36] = -832022711784893844L;
        mk$PartyPosition.bbhm[37] = 8810067791363849051L;
        mk$PartyPosition.bbhm[38] = -5893653318953775921L;
        mk$PartyPosition.bbhm[39] = -1959144633905846068L;
        mk$PartyPosition.bbhm[40] = 8183515903038732506L;
        mk$PartyPosition.bbhm[41] = -2459668612255910641L;
        mk$PartyPosition.bbhm[42] = 613238685217567654L;
        mk$PartyPosition.bbhm[43] = -8316936165774645980L;
        mk$PartyPosition.bbhm[44] = -7422479511296089667L;
        mk$PartyPosition.bbhm[45] = 6033641367174137808L;
        mk$PartyPosition.bbhm[46] = -3830828930003746547L;
        mk$PartyPosition.bbhm[47] = 1177869058761619916L;
        mk$PartyPosition.bbhm[48] = -7851364603619830743L;
        mk$PartyPosition.bbhm[49] = -3764488341731025337L;
        mk$PartyPosition.bbhm[50] = -6727178607387581761L;
        mk$PartyPosition.bbhm[51] = 202611620412925181L;
        mk$PartyPosition.bbhm[52] = 2637128643942123891L;
        mk$PartyPosition.bbhm[53] = -4399488586801026598L;
        mk$PartyPosition.bbhm[54] = 7581457065674930094L;
        mk$PartyPosition.bbhm[55] = 1149704548449154242L;
        mk$PartyPosition.bbhm[56] = -1567263189318337271L;
        mk$PartyPosition.bbhm[57] = -7674912409338461660L;
        mk$PartyPosition.bbhm[58] = 4361896252720063351L;
        mk$PartyPosition.bbhm[59] = 2228896237078727135L;
        mk$PartyPosition.bbhm[60] = 353445214800080132L;
        mk$PartyPosition.bbhm[61] = -5611761343930380719L;
        mk$PartyPosition.bbhm[62] = 1517511025054181437L;
        mk$PartyPosition.bbhm[63] = -2830140458873588773L;
        mk$PartyPosition.bbhm[64] = 1957173794645925279L;
        mk$PartyPosition.bbhm[65] = -1031900803050223478L;
        mk$PartyPosition.bbhm[66] = 2601024083909464829L;
        mk$PartyPosition.bbhm[67] = -125736692482545941L;
        mk$PartyPosition.bbhm[68] = -5712968344287762310L;
        mk$PartyPosition.bbhm[69] = 3428552038538404870L;
        mk$PartyPosition.bbhm[70] = -4001853926039338486L;
        mk$PartyPosition.bbhm[71] = -6243364397151968774L;
        mk$PartyPosition.bbhm[72] = 5523689983261316329L;
        mk$PartyPosition.bbhm[73] = 6062476069833948554L;
        mk$PartyPosition.bbhm[74] = 8227058989654095915L;
        mk$PartyPosition.bbhm[75] = -580929438001207161L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mk$PartyPosition(String var1_1, double var2_2, double var4_3, double var6_4, String var8_5, String var9_6, long var10_7) {
        var13_8 /* !! */  = mk$PartyPosition.b;
        super();
        this.login = var1_1;
        this.x = var2_2;
        this.y = var4_3;
        this.z = var6_4;
        this.serverAddress = var8_5;
        if (var13_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.playerName = var9_6;
                this.updatedAt = var10_7;
                return;
            }
            case 0: {
                var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbgz", bbgp(int ), (int)0);
                ** GOTO lbl22
            }
            case 1: {
                var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbhb", bbgp(int ), (int)1);
            }
lbl19:
            // 3 sources

            case 2: {
                var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbhc", bbgp(int ), (int)2);
                ** GOTO lbl25
            }
lbl22:
            // 2 sources

            case 3: {
                var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbhd", bbgp(int ), (int)3);
                ** GOTO lbl19
            }
lbl25:
            // 2 sources

            case 4: {
                var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbhf", bbgp(int ), (int)4);
            }
            case 5: 
        }
        while (true) {
            var13_8 /* !! */  = (int)mk$PartyPosition.bbgw("bbhg", bbgp(int ), (int)5);
        }
    }

    private static /* synthetic */ void bbrb() {
        mk$PartyPosition.bbhl[0] = 4402631674616716101L;
        mk$PartyPosition.bbhl[1] = -9018414613375572867L;
        mk$PartyPosition.bbhl[2] = 1124924496440540065L;
        mk$PartyPosition.bbhl[3] = 1227951716348382044L;
        mk$PartyPosition.bbhl[4] = -6639625001197317079L;
        mk$PartyPosition.bbhl[5] = 8442371705725754199L;
        mk$PartyPosition.bbhl[6] = -8818190372656057365L;
        mk$PartyPosition.bbhl[7] = -5794828874135316216L;
        mk$PartyPosition.bbhl[8] = -5666515357854529726L;
        mk$PartyPosition.bbhl[9] = 7706597123870269988L;
        mk$PartyPosition.bbhl[10] = 4985235088258248980L;
        mk$PartyPosition.bbhl[11] = -1354503102348811891L;
        mk$PartyPosition.bbhl[12] = 1288310777283996344L;
        mk$PartyPosition.bbhl[13] = 3852981503459924402L;
        mk$PartyPosition.bbhl[14] = -6099837180191036672L;
        mk$PartyPosition.bbhl[15] = -734661384534270288L;
        mk$PartyPosition.bbhl[16] = 8725293019740335585L;
        mk$PartyPosition.bbhl[17] = -1833119782921576454L;
        mk$PartyPosition.bbhl[18] = 5554123719105049442L;
        mk$PartyPosition.bbhl[19] = 906695378283950011L;
        mk$PartyPosition.bbhl[20] = 8429838911211510490L;
        mk$PartyPosition.bbhl[21] = 7392066899559895508L;
        mk$PartyPosition.bbhl[22] = 3297900492688709916L;
        mk$PartyPosition.bbhl[23] = -353422188944015348L;
        mk$PartyPosition.bbhl[24] = 7691947787581197291L;
        mk$PartyPosition.bbhl[25] = 1589836077903940635L;
        mk$PartyPosition.bbhl[26] = -4406260940156292351L;
        mk$PartyPosition.bbhl[27] = -5758802789735630953L;
        mk$PartyPosition.bbhl[28] = 1672003202138121124L;
        mk$PartyPosition.bbhl[29] = 8688581429991642873L;
        mk$PartyPosition.bbhl[30] = 6222652165851585166L;
        mk$PartyPosition.bbhl[31] = 4933868329750978076L;
        mk$PartyPosition.bbhl[32] = -226617994105539398L;
        mk$PartyPosition.bbhl[33] = 5326372589180364932L;
        mk$PartyPosition.bbhl[34] = -1805248999115786921L;
        mk$PartyPosition.bbhl[35] = -750656477606677048L;
        mk$PartyPosition.bbhl[36] = 905031559909383967L;
        mk$PartyPosition.bbhl[37] = 4914173747519509720L;
        mk$PartyPosition.bbhl[38] = -245177636715391240L;
        mk$PartyPosition.bbhl[39] = 2961473487925409704L;
        mk$PartyPosition.bbhl[40] = 5652860083599164506L;
        mk$PartyPosition.bbhl[41] = 1603078400420251054L;
        mk$PartyPosition.bbhl[42] = -6484429768546000010L;
        mk$PartyPosition.bbhl[43] = 8660147321099255269L;
        mk$PartyPosition.bbhl[44] = 7752180666738392119L;
        mk$PartyPosition.bbhl[45] = 4907935196528798315L;
        mk$PartyPosition.bbhl[46] = 5977689642564937121L;
        mk$PartyPosition.bbhl[47] = -4292476551153844599L;
        mk$PartyPosition.bbhl[48] = 1552195075255308523L;
        mk$PartyPosition.bbhl[49] = 5267759353185698517L;
        mk$PartyPosition.bbhl[50] = -7115604378335496997L;
        mk$PartyPosition.bbhl[51] = -2968577522500285478L;
        mk$PartyPosition.bbhl[52] = -3067538409613196843L;
        mk$PartyPosition.bbhl[53] = -6234208902809459987L;
        mk$PartyPosition.bbhl[54] = -1128259758021871246L;
        mk$PartyPosition.bbhl[55] = -3658046574016071668L;
        mk$PartyPosition.bbhl[56] = 2909379977473850059L;
        mk$PartyPosition.bbhl[57] = 1914072091746080915L;
        mk$PartyPosition.bbhl[58] = -8260145640609877279L;
        mk$PartyPosition.bbhl[59] = 8589665784105054482L;
        mk$PartyPosition.bbhl[60] = -2285584844407234480L;
        mk$PartyPosition.bbhl[61] = 6560604891274543099L;
        mk$PartyPosition.bbhl[62] = -5684767137341178877L;
        mk$PartyPosition.bbhl[63] = -5208980585035338224L;
        mk$PartyPosition.bbhl[64] = 6457530864405106861L;
        mk$PartyPosition.bbhl[65] = -2642884678221480819L;
        mk$PartyPosition.bbhl[66] = -310624958706772927L;
        mk$PartyPosition.bbhl[67] = 7304420682037430313L;
        mk$PartyPosition.bbhl[68] = -5785003558120580252L;
        mk$PartyPosition.bbhl[69] = 8004062708636610166L;
        mk$PartyPosition.bbhl[70] = 2085704260234079113L;
        mk$PartyPosition.bbhl[71] = 7825567153385092110L;
        mk$PartyPosition.bbhl[72] = 7771811906382846860L;
        mk$PartyPosition.bbhl[73] = 3583897266478885600L;
        mk$PartyPosition.bbhl[74] = 6152220659230886035L;
        mk$PartyPosition.bbhl[75] = -2946023464675351441L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mk$PartyPosition.bbgw("bbik", bbhk(int ), (int)4));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -305623289: {
                    break block17;
                }
                case -290253134: {
                    v1 = mk$PartyPosition.bbgw("bbin", bbhk(int ), (int)5);
                    continue block17;
                }
                case 2049553171: {
                    v1 = mk$PartyPosition.bbgw("bbio", bbhk(int ), (int)6);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbip", bbhk(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$PartyPosition.bbgw("bbir", bbgp(int ), (int)18)) break;
            v2 /* !! */  = (long)mk$PartyPosition.bbgw("bbis", bbgp(int ), (int)19);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbiu", bbhk(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mk$PartyPosition.bbgw("bbiv", bbgp(int ), (int)20)) break;
            v3 /* !! */  = (long)mk$PartyPosition.bbgw("bbiw", bbgp(int ), (int)21);
        }
        var1_3 = mk$PartyPosition.a;
        if (var3_1) {
            throw null;
            return (int)mk$PartyPosition.bbgw("bbix", bbgp(int ), (int)22);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - mk$PartyPosition.bbgw("bbiz", bbhk(int ), (int)9));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -305623289: {
                            break block21;
                        }
                        case 797075832: {
                            v5 = mk$PartyPosition.bbgw("bbja", bbhk(int ), (int)10);
                            continue block21;
                        }
                        case 1486323000: {
                            v5 = mk$PartyPosition.bbgw("bbjc", bbhk(int ), (int)11);
                            continue block21;
                        }
                        case 1948831261: {
                            v5 = mk$PartyPosition.bbgw("bbje", bbhk(int ), (int)12);
                            continue block21;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mk$PartyPosition.class, "login;x;y;z;serverAddress;playerName;updatedAt", "login", "x", "y", "z", "serverAddress", "playerName", "updatedAt"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbjf", bbgp(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbjj", bbgp(int ), (int)24);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbjl", bbgp(int ), (int)25);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbjm", bbgp(int ), (int)26);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String serverAddress() {
        v0 /* !! */  = mk$PartyPosition.cu;
        block15: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -305623289: {
                    break block15;
                }
                case 289955475: {
                    v0 /* !! */  = (long)(mk$PartyPosition.bbgw("bbom", bbhk(int ), (int)53) - mk$PartyPosition.bbgw("bbok", bbhk(int ), (int)52));
                    continue block15;
                }
            }
            break;
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            block27: {
                if ((v1 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbop", bbhk(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  != mk$PartyPosition.bbgw("bboq", bbgp(int ), (int)66)) break block27;
                var2_2 /* !! */  = mk$PartyPosition.b;
                v2 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl22
            }
            v1 /* !! */  = (long)mk$PartyPosition.bbgw("bbor", bbgp(int ), (int)67);
        }
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartyPosition.bbgw("bbos", bbhk(int ), (int)55));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -305623289: {
                    break block17;
                }
                case 169396217: {
                    v3 = mk$PartyPosition.bbgw("bbou", bbhk(int ), (int)56);
                    continue block17;
                }
                case 219017327: {
                    v3 = mk$PartyPosition.bbgw("bbov", bbhk(int ), (int)57);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = mk$PartyPosition.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bboz", bbhk(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$PartyPosition.bbgw("bbpa", bbgp(int ), (int)68)) {
                        return this.serverAddress;
                    }
                    v4 /* !! */  = (long)mk$PartyPosition.bbgw("bbpb", bbgp(int ), (int)69);
                }
            }
            case 0: {
                ** GOTO lbl57
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpe", bbgp(int ), (int)72);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpf", bbgp(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
lbl57:
                // 3 sources

                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpc", bbgp(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpd", bbgp(int ), (int)71);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double y() {
        v0 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - mk$PartyPosition.bbgw("bbmn", bbhk(int ), (int)35));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -305623289: {
                    break block15;
                }
                case -248673543: {
                    v1 = mk$PartyPosition.bbgw("bbmo", bbhk(int ), (int)36);
                    continue block15;
                }
                case 571194585: {
                    v1 = mk$PartyPosition.bbgw("bbmq", bbhk(int ), (int)37);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbmr", bbhk(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$PartyPosition.bbgw("bbms", bbgp(int ), (int)50)) break;
            v2 /* !! */  = (long)mk$PartyPosition.bbgw("bbmt", bbgp(int ), (int)51);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbmv", bbhk(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mk$PartyPosition.bbgw("bbmw", bbgp(int ), (int)52)) break;
            v3 /* !! */  = (long)mk$PartyPosition.bbgw("bbmx", bbgp(int ), (int)53);
        }
        var1_3 = mk$PartyPosition.a;
        if (var3_1) {
            throw null;
            return (double)mk$PartyPosition.bbgw("bbmy", bblv(int ), (int)40);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(mk$PartyPosition.bbgw("bbnd", bbhk(int ), (int)42) - mk$PartyPosition.bbgw("bbna", bbhk(int ), (int)41));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -305623289: {
                            break block19;
                        }
                        case 383016206: {
                            continue block19;
                        }
                    }
                    break;
                }
                return this.y;
            }
lbl47:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbnf", bbgp(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbng", bbgp(int ), (int)55);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbnh", bbgp(int ), (int)56);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbni", bbgp(int ), (int)57);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String login() {
        v0 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(mk$PartyPosition.bbgw("bbkp", bbhk(int ), (int)20) - mk$PartyPosition.bbgw("bbko", bbhk(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -305623289: {
                    break block23;
                }
                case 1543246208: {
                    continue block23;
                }
            }
            break;
        }
        var3_1 = mk$PartyPosition.c;
        v1 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl15
        block24: while (true) {
            v1 /* !! */  = (long)(mk$PartyPosition.bbgw("bbkr", bbhk(int ), (int)22) - mk$PartyPosition.bbgw("bbkq", bbhk(int ), (int)21));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -305623289: {
                    break block24;
                }
                case 1188747325: {
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        v2 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl25
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartyPosition.bbgw("bbkt", bbhk(int ), (int)23));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -305623289: {
                    break block25;
                }
                case 885146778: {
                    v3 = mk$PartyPosition.bbgw("bbkv", bbhk(int ), (int)24);
                    continue block25;
                }
                case 1824498303: {
                    v3 = mk$PartyPosition.bbgw("bbkw", bbhk(int ), (int)25);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = mk$PartyPosition.a;
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

                if (var1_3 || var1_3) continue block26;
                v4 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl46
                block27: while (true) {
                    v4 /* !! */  = (long)(mk$PartyPosition.bbgw("bbkz", bbhk(int ), (int)27) - mk$PartyPosition.bbgw("bbky", bbhk(int ), (int)26));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1968271489: {
                            continue block27;
                        }
                        case -305623289: {
                            break block27;
                        }
                    }
                    break;
                }
                return this.login;
lbl52:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bblb", bbgp(int ), (int)36);
                    } while (!var3_1);
                    throw null;
                }
lbl57:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bblc", bbgp(int ), (int)37);
                        if (!var3_1) ** GOTO lbl52
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbld", bbgp(int ), (int)38);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bblh", bbgp(int ), (int)39);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String playerName() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbph", bbhk(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartyPosition.bbgw("bbpi", bbgp(int ), (int)74)) break;
            v0 /* !! */  = (long)mk$PartyPosition.bbgw("bbpj", bbgp(int ), (int)75);
        }
        var3_1 = mk$PartyPosition.c;
        v1 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - mk$PartyPosition.bbgw("bbpl", bbhk(int ), (int)60));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -305623289: {
                    break block22;
                }
                case 1688344827: {
                    v2 = mk$PartyPosition.bbgw("bbpn", bbhk(int ), (int)61);
                    continue block22;
                }
                case 2128000869: {
                    v2 = mk$PartyPosition.bbgw("bbpo", bbhk(int ), (int)62);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl29
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - mk$PartyPosition.bbgw("bbpq", bbhk(int ), (int)63));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -305623289: {
                            break block23;
                        }
                        case -258708025: {
                            v4 = mk$PartyPosition.bbgw("bbpr", bbhk(int ), (int)64);
                            continue block23;
                        }
                        case 557609582: {
                            v4 = mk$PartyPosition.bbgw("bbps", bbhk(int ), (int)65);
                            continue block23;
                        }
                        case 1550917836: {
                            v4 = mk$PartyPosition.bbgw("bbpt", bbhk(int ), (int)66);
                            continue block23;
                        }
                    }
                    break;
                }
                var1_3 = mk$PartyPosition.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mk$PartyPosition.cu;
                if (true) ** GOTO lbl51
                block25: while (true) {
                    v5 /* !! */  = (long)(mk$PartyPosition.bbgw("bbpw", bbhk(int ), (int)68) - mk$PartyPosition.bbgw("bbpv", bbhk(int ), (int)67));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -305623289: {
                            break block25;
                        }
                        case 1416530051: {
                            continue block25;
                        }
                    }
                    break;
                }
                return this.playerName;
            }
            case 0: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpx", bbgp(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbpz", bbgp(int ), (int)77);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqb", bbgp(int ), (int)78);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqc", bbgp(int ), (int)79);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double x() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bblj", bbhk(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartyPosition.bbgw("bblk", bbgp(int ), (int)40)) break;
            v0 /* !! */  = (long)mk$PartyPosition.bbgw("bbll", bbgp(int ), (int)41);
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bblm", bbhk(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartyPosition.bbgw("bblo", bbgp(int ), (int)42)) break;
            v1 /* !! */  = (long)mk$PartyPosition.bbgw("bblp", bbgp(int ), (int)43);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        v2 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartyPosition.bbgw("bblq", bbhk(int ), (int)30));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -880195483: {
                    v3 = mk$PartyPosition.bbgw("bblr", bbhk(int ), (int)31);
                    continue block13;
                }
                case -305623289: {
                    break block13;
                }
                case 105637327: {
                    v3 = mk$PartyPosition.bbgw("bbls", bbhk(int ), (int)32);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = mk$PartyPosition.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (double)mk$PartyPosition.bbgw("bblw", bblv(int ), (int)33);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bblx", bbhk(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$PartyPosition.bbgw("bblz", bbgp(int ), (int)44)) break;
                    v4 /* !! */  = (long)mk$PartyPosition.bbgw("bbmc", bbgp(int ), (int)45);
                }
                return this.x;
            }
            case 0: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbmd", bbgp(int ), (int)46);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbme", bbgp(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbmf", bbgp(int ), (int)48);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbmj", bbgp(int ), (int)49);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbhn", bbhk(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartyPosition.bbgw("bbho", bbgp(int ), (int)6)) break;
            v0 /* !! */  = (long)mk$PartyPosition.bbgw("bbhp", bbgp(int ), (int)7);
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbhq", bbhk(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartyPosition.bbgw("bbhr", bbgp(int ), (int)8)) break;
            v1 /* !! */  = (long)mk$PartyPosition.bbgw("bbhs", bbgp(int ), (int)9);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbhu", bbhk(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mk$PartyPosition.bbgw("bbhv", bbgp(int ), (int)10)) break;
            v2 /* !! */  = (long)mk$PartyPosition.bbgw("bbhx", bbgp(int ), (int)11);
        }
        var1_3 = mk$PartyPosition.a;
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
                    if ((v3 /* !! */  = (cfr_temp_3 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbhz", bbhk(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mk$PartyPosition.bbgw("bbib", bbgp(int ), (int)12)) break;
                    v3 /* !! */  = (long)mk$PartyPosition.bbgw("bbie", bbgp(int ), (int)13);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mk$PartyPosition.class, "login;x;y;z;serverAddress;playerName;updatedAt", "login", "x", "y", "z", "serverAddress", "playerName", "updatedAt"}, this);
            }
lbl37:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbif", bbgp(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbig", bbgp(int ), (int)15);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbih", bbgp(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbii", bbgp(int ), (int)17);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ double bblv(int n2) {
        return Double.longBitsToDouble(bbhl[n2] ^ bbhm[n2]);
    }

    private static /* synthetic */ int bbgp(int n2) {
        return bbgr[n2] ^ bbgu[n2];
    }

    private static /* synthetic */ void bbqz() {
        mk$PartyPosition.bbgr[0] = -1241216753;
        mk$PartyPosition.bbgr[1] = -1869045647;
        mk$PartyPosition.bbgr[2] = -1611085192;
        mk$PartyPosition.bbgr[3] = -1921203182;
        mk$PartyPosition.bbgr[4] = 1459035573;
        mk$PartyPosition.bbgr[5] = -786674527;
        mk$PartyPosition.bbgr[6] = 1904627520;
        mk$PartyPosition.bbgr[7] = 1714822111;
        mk$PartyPosition.bbgr[8] = -1088811025;
        mk$PartyPosition.bbgr[9] = 219798844;
        mk$PartyPosition.bbgr[10] = 1000520361;
        mk$PartyPosition.bbgr[11] = 1558601982;
        mk$PartyPosition.bbgr[12] = -839267477;
        mk$PartyPosition.bbgr[13] = 145166383;
        mk$PartyPosition.bbgr[14] = 946940388;
        mk$PartyPosition.bbgr[15] = 2124253799;
        mk$PartyPosition.bbgr[16] = -2014627363;
        mk$PartyPosition.bbgr[17] = 1286658100;
        mk$PartyPosition.bbgr[18] = 227572188;
        mk$PartyPosition.bbgr[19] = -650157458;
        mk$PartyPosition.bbgr[20] = 1942751820;
        mk$PartyPosition.bbgr[21] = -1230614638;
        mk$PartyPosition.bbgr[22] = 2143456248;
        mk$PartyPosition.bbgr[23] = -761852338;
        mk$PartyPosition.bbgr[24] = 639177015;
        mk$PartyPosition.bbgr[25] = -1077209859;
        mk$PartyPosition.bbgr[26] = 844201497;
        mk$PartyPosition.bbgr[27] = 102295554;
        mk$PartyPosition.bbgr[28] = 1618773678;
        mk$PartyPosition.bbgr[29] = -1412805341;
        mk$PartyPosition.bbgr[30] = 479493507;
        mk$PartyPosition.bbgr[31] = -1652059178;
        mk$PartyPosition.bbgr[32] = -1600959910;
        mk$PartyPosition.bbgr[33] = -1352832776;
        mk$PartyPosition.bbgr[34] = -2093761148;
        mk$PartyPosition.bbgr[35] = 2107241834;
        mk$PartyPosition.bbgr[36] = 1361858039;
        mk$PartyPosition.bbgr[37] = -1158361901;
        mk$PartyPosition.bbgr[38] = 98480591;
        mk$PartyPosition.bbgr[39] = 1798238736;
        mk$PartyPosition.bbgr[40] = -2062140286;
        mk$PartyPosition.bbgr[41] = -1718422662;
        mk$PartyPosition.bbgr[42] = 1730943856;
        mk$PartyPosition.bbgr[43] = -2113425863;
        mk$PartyPosition.bbgr[44] = -2118058263;
        mk$PartyPosition.bbgr[45] = -876502406;
        mk$PartyPosition.bbgr[46] = 1667058511;
        mk$PartyPosition.bbgr[47] = -1846053400;
        mk$PartyPosition.bbgr[48] = -222849513;
        mk$PartyPosition.bbgr[49] = 114778739;
        mk$PartyPosition.bbgr[50] = 210911730;
        mk$PartyPosition.bbgr[51] = 1180048755;
        mk$PartyPosition.bbgr[52] = 1117911554;
        mk$PartyPosition.bbgr[53] = -272701390;
        mk$PartyPosition.bbgr[54] = 2016515707;
        mk$PartyPosition.bbgr[55] = -1773341264;
        mk$PartyPosition.bbgr[56] = 1190150933;
        mk$PartyPosition.bbgr[57] = -342378423;
        mk$PartyPosition.bbgr[58] = 1503550775;
        mk$PartyPosition.bbgr[59] = -2102253768;
        mk$PartyPosition.bbgr[60] = 1783389221;
        mk$PartyPosition.bbgr[61] = 1206946785;
        mk$PartyPosition.bbgr[62] = -629653533;
        mk$PartyPosition.bbgr[63] = 85083597;
        mk$PartyPosition.bbgr[64] = 734888501;
        mk$PartyPosition.bbgr[65] = 779703040;
        mk$PartyPosition.bbgr[66] = 640292271;
        mk$PartyPosition.bbgr[67] = -532633541;
        mk$PartyPosition.bbgr[68] = 733325815;
        mk$PartyPosition.bbgr[69] = -176155831;
        mk$PartyPosition.bbgr[70] = 404708105;
        mk$PartyPosition.bbgr[71] = -178795742;
        mk$PartyPosition.bbgr[72] = 1143893090;
        mk$PartyPosition.bbgr[73] = 1631731874;
        mk$PartyPosition.bbgr[74] = -649013345;
        mk$PartyPosition.bbgr[75] = -1628361382;
        mk$PartyPosition.bbgr[76] = -411586885;
        mk$PartyPosition.bbgr[77] = 1266983263;
        mk$PartyPosition.bbgr[78] = 1698402677;
        mk$PartyPosition.bbgr[79] = 633332830;
        mk$PartyPosition.bbgr[80] = 410353953;
        mk$PartyPosition.bbgr[81] = 1151774866;
        mk$PartyPosition.bbgr[82] = -1265756968;
        mk$PartyPosition.bbgr[83] = -726821205;
        mk$PartyPosition.bbgr[84] = 1741509444;
        mk$PartyPosition.bbgr[85] = 1783008068;
        mk$PartyPosition.bbgr[86] = 90190038;
        mk$PartyPosition.bbgr[87] = 654332677;
        mk$PartyPosition.bbgr[88] = -1447515265;
        mk$PartyPosition.bbgr[89] = 211351226;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbjn", bbhk(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartyPosition.bbgw("bbjo", bbgp(int ), (int)27)) break;
            v0 /* !! */  = (long)mk$PartyPosition.bbgw("bbjr", bbgp(int ), (int)28);
        }
        var4_2 = mk$PartyPosition.c;
        v1 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(mk$PartyPosition.bbgw("bbju", bbhk(int ), (int)15) - mk$PartyPosition.bbgw("bbjs", bbhk(int ), (int)14));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1189414604: {
                    continue block15;
                }
                case -305623289: {
                    break block15;
                }
            }
            break;
        }
        var3_3 /* !! */  = mk$PartyPosition.b;
        v2 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(mk$PartyPosition.bbgw("bbjx", bbhk(int ), (int)17) - mk$PartyPosition.bbgw("bbjv", bbhk(int ), (int)16));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1117220805: {
                    continue block16;
                }
                case -305623289: {
                    break block16;
                }
            }
            break;
        }
        var2_4 = mk$PartyPosition.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)mk$PartyPosition.bbgw("bbjz", bbgp(int ), (int)29);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbkb", bbhk(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mk$PartyPosition.bbgw("bbkd", bbgp(int ), (int)30)) break;
                    v3 /* !! */  = (long)mk$PartyPosition.bbgw("bbke", bbgp(int ), (int)31);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mk$PartyPosition.class, "login;x;y;z;serverAddress;playerName;updatedAt", "login", "x", "y", "z", "serverAddress", "playerName", "updatedAt"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)mk$PartyPosition.bbgw("bbkf", bbgp(int ), (int)32);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)mk$PartyPosition.bbgw("bbkg", bbgp(int ), (int)33);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mk$PartyPosition.bbgw("bbki", bbgp(int ), (int)34);
                    if (!var4_2) break block8;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mk$PartyPosition.bbgw("bbkj", bbgp(int ), (int)35);
        ** while (!var4_2)
lbl59:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bbhk(int n2) {
        return bbhl[n2] ^ bbhm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long updatedAt() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbqf", bbhk(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mk$PartyPosition.bbgw("bbqg", bbgp(int ), (int)80)) break;
            v0 /* !! */  = (long)mk$PartyPosition.bbgw("bbqh", bbgp(int ), (int)81);
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbqj", bbhk(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartyPosition.bbgw("bbql", bbgp(int ), (int)82)) break;
            v1 /* !! */  = (long)mk$PartyPosition.bbgw("bbqm", bbgp(int ), (int)83);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        v2 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartyPosition.bbgw("bbqn", bbhk(int ), (int)71));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -305623289: {
                    break block13;
                }
                case -128633880: {
                    v3 = mk$PartyPosition.bbgw("bbqo", bbhk(int ), (int)72);
                    continue block13;
                }
                case 1116467340: {
                    v3 = mk$PartyPosition.bbgw("bbqp", bbhk(int ), (int)73);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = mk$PartyPosition.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (long)mk$PartyPosition.bbgw("bbqr", bbhk(int ), (int)74);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbqs", bbhk(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$PartyPosition.bbgw("bbqt", bbgp(int ), (int)84)) break;
                    v4 /* !! */  = (long)mk$PartyPosition.bbgw("bbqu", bbgp(int ), (int)85);
                }
                return this.updatedAt;
lbl43:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqv", bbgp(int ), (int)86);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqw", bbgp(int ), (int)87);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqx", bbgp(int ), (int)88);
                        if (!var3_1) break block14;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbqy", bbgp(int ), (int)89);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    static {
        bbgu = new int[90];
        mk$PartyPosition.bbqz();
        mk$PartyPosition.bbra();
        bbhl = new long[76];
        bbhm = new long[76];
        mk$PartyPosition.bbrb();
        mk$PartyPosition.bbrc();
    }

    private static /* synthetic */ void bbra() {
        mk$PartyPosition.bbgu[0] = -1241216753;
        mk$PartyPosition.bbgu[1] = -1869045643;
        mk$PartyPosition.bbgu[2] = -1611085191;
        mk$PartyPosition.bbgu[3] = -1921203184;
        mk$PartyPosition.bbgu[4] = 1459035575;
        mk$PartyPosition.bbgu[5] = -786674525;
        mk$PartyPosition.bbgu[6] = 1904627521;
        mk$PartyPosition.bbgu[7] = 1646616079;
        mk$PartyPosition.bbgu[8] = -1088811026;
        mk$PartyPosition.bbgu[9] = -1507428557;
        mk$PartyPosition.bbgu[10] = 1000520360;
        mk$PartyPosition.bbgu[11] = 1109573764;
        mk$PartyPosition.bbgu[12] = -839267478;
        mk$PartyPosition.bbgu[13] = 1756775179;
        mk$PartyPosition.bbgu[14] = 946940388;
        mk$PartyPosition.bbgu[15] = 2124253796;
        mk$PartyPosition.bbgu[16] = -2014627362;
        mk$PartyPosition.bbgu[17] = 1286658101;
        mk$PartyPosition.bbgu[18] = 227572189;
        mk$PartyPosition.bbgu[19] = 279617934;
        mk$PartyPosition.bbgu[20] = 1942751821;
        mk$PartyPosition.bbgu[21] = -1094626370;
        mk$PartyPosition.bbgu[22] = 443027538;
        mk$PartyPosition.bbgu[23] = -761852338;
        mk$PartyPosition.bbgu[24] = 639177013;
        mk$PartyPosition.bbgu[25] = -1077209859;
        mk$PartyPosition.bbgu[26] = 844201499;
        mk$PartyPosition.bbgu[27] = 102295555;
        mk$PartyPosition.bbgu[28] = -907491522;
        mk$PartyPosition.bbgu[29] = -1412805342;
        mk$PartyPosition.bbgu[30] = -479493508;
        mk$PartyPosition.bbgu[31] = 1633794083;
        mk$PartyPosition.bbgu[32] = -1600959911;
        mk$PartyPosition.bbgu[33] = -1352832775;
        mk$PartyPosition.bbgu[34] = -2093761148;
        mk$PartyPosition.bbgu[35] = 2107241834;
        mk$PartyPosition.bbgu[36] = 1361858037;
        mk$PartyPosition.bbgu[37] = -1158361903;
        mk$PartyPosition.bbgu[38] = 98480589;
        mk$PartyPosition.bbgu[39] = 1798238739;
        mk$PartyPosition.bbgu[40] = -2062140285;
        mk$PartyPosition.bbgu[41] = -201539260;
        mk$PartyPosition.bbgu[42] = 1730943857;
        mk$PartyPosition.bbgu[43] = 77000779;
        mk$PartyPosition.bbgu[44] = -2118058264;
        mk$PartyPosition.bbgu[45] = -313188554;
        mk$PartyPosition.bbgu[46] = 1667058508;
        mk$PartyPosition.bbgu[47] = -1846053399;
        mk$PartyPosition.bbgu[48] = -222849513;
        mk$PartyPosition.bbgu[49] = 114778736;
        mk$PartyPosition.bbgu[50] = 210911731;
        mk$PartyPosition.bbgu[51] = 455348016;
        mk$PartyPosition.bbgu[52] = 1117911555;
        mk$PartyPosition.bbgu[53] = 162964953;
        mk$PartyPosition.bbgu[54] = 2016515707;
        mk$PartyPosition.bbgu[55] = -1773341261;
        mk$PartyPosition.bbgu[56] = 1190150932;
        mk$PartyPosition.bbgu[57] = -342378423;
        mk$PartyPosition.bbgu[58] = 1503550774;
        mk$PartyPosition.bbgu[59] = 85826957;
        mk$PartyPosition.bbgu[60] = 1783389220;
        mk$PartyPosition.bbgu[61] = -1313670068;
        mk$PartyPosition.bbgu[62] = -629653535;
        mk$PartyPosition.bbgu[63] = 85083599;
        mk$PartyPosition.bbgu[64] = 734888501;
        mk$PartyPosition.bbgu[65] = 779703041;
        mk$PartyPosition.bbgu[66] = 640292270;
        mk$PartyPosition.bbgu[67] = -72871954;
        mk$PartyPosition.bbgu[68] = 733325814;
        mk$PartyPosition.bbgu[69] = 1927566961;
        mk$PartyPosition.bbgu[70] = 404708104;
        mk$PartyPosition.bbgu[71] = -178795742;
        mk$PartyPosition.bbgu[72] = 1143893089;
        mk$PartyPosition.bbgu[73] = 1631731875;
        mk$PartyPosition.bbgu[74] = 649013344;
        mk$PartyPosition.bbgu[75] = 1098877567;
        mk$PartyPosition.bbgu[76] = -411586886;
        mk$PartyPosition.bbgu[77] = 1266983260;
        mk$PartyPosition.bbgu[78] = 1698402677;
        mk$PartyPosition.bbgu[79] = 633332831;
        mk$PartyPosition.bbgu[80] = 410353952;
        mk$PartyPosition.bbgu[81] = 1231480878;
        mk$PartyPosition.bbgu[82] = -1265756967;
        mk$PartyPosition.bbgu[83] = 1222435575;
        mk$PartyPosition.bbgu[84] = 1741509445;
        mk$PartyPosition.bbgu[85] = -1667882260;
        mk$PartyPosition.bbgu[86] = 90190038;
        mk$PartyPosition.bbgu[87] = 654332679;
        mk$PartyPosition.bbgu[88] = -1447515266;
        mk$PartyPosition.bbgu[89] = 211351224;
    }

    public static /* synthetic */ CallSite bbgw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double z() {
        v0 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(mk$PartyPosition.bbgw("bbnk", bbhk(int ), (int)44) - mk$PartyPosition.bbgw("bbnj", bbhk(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -305623289: {
                    break block16;
                }
                case 1447573402: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = mk$PartyPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bbnl", bbhk(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mk$PartyPosition.bbgw("bbnm", bbgp(int ), (int)58)) break;
            v1 /* !! */  = (long)mk$PartyPosition.bbgw("bbno", bbgp(int ), (int)59);
        }
        var2_2 /* !! */  = mk$PartyPosition.b;
        v2 /* !! */  = mk$PartyPosition.cu;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - mk$PartyPosition.bbgw("bbnp", bbhk(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -305623289: {
                    break block18;
                }
                case 585162414: {
                    v3 = mk$PartyPosition.bbgw("bbnr", bbhk(int ), (int)47);
                    continue block18;
                }
                case 1236381072: {
                    v3 = mk$PartyPosition.bbgw("bbnu", bbhk(int ), (int)48);
                    continue block18;
                }
                case 1718588912: {
                    v3 = mk$PartyPosition.bbgw("bbnw", bbhk(int ), (int)49);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = mk$PartyPosition.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (double)mk$PartyPosition.bbgw("bbny", bblv(int ), (int)50);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mk$PartyPosition.cu - mk$PartyPosition.bbgw("bboa", bbhk(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mk$PartyPosition.bbgw("bbob", bbgp(int ), (int)60)) break;
                    v4 /* !! */  = (long)mk$PartyPosition.bbgw("bboc", bbgp(int ), (int)61);
                }
                return this.z;
            }
            case 0: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbod", bbgp(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bboe", bbgp(int ), (int)63);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl61:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bbof", bbgp(int ), (int)64);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mk$PartyPosition.bbgw("bboh", bbgp(int ), (int)65);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }
}

