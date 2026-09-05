/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

record av$HudPosition(int y, int x) {
    static final long cl = -4877318951054926576L;
    private final int y;
    private final int x;
    public static final boolean c;
    public static final int b;
    private static int[] asjf;
    public static final boolean a;
    private static long[] asjm;
    private static long[] asjl;
    private static int[] asje;

    private static /* synthetic */ void asmv() {
        av$HudPosition.asjl[0] = -500749902761536464L;
        av$HudPosition.asjl[1] = 5455127985845217187L;
        av$HudPosition.asjl[2] = -8375250130458014398L;
        av$HudPosition.asjl[3] = -7875853741932612672L;
        av$HudPosition.asjl[4] = 4273986113381395566L;
        av$HudPosition.asjl[5] = 5274141370424845252L;
        av$HudPosition.asjl[6] = 5206189925307102390L;
        av$HudPosition.asjl[7] = 4412841417855583527L;
        av$HudPosition.asjl[8] = -8106971710951860079L;
        av$HudPosition.asjl[9] = 1893551909911639616L;
        av$HudPosition.asjl[10] = 5285001029036560940L;
        av$HudPosition.asjl[11] = -7205861718722402903L;
        av$HudPosition.asjl[12] = -7093844770938205274L;
        av$HudPosition.asjl[13] = 4901645984902667765L;
        av$HudPosition.asjl[14] = -7078865824743835939L;
        av$HudPosition.asjl[15] = 9200856468763349422L;
        av$HudPosition.asjl[16] = -6097217760956805809L;
        av$HudPosition.asjl[17] = 2975810294046181761L;
        av$HudPosition.asjl[18] = -1119103121334110793L;
        av$HudPosition.asjl[19] = -1387003893196739129L;
        av$HudPosition.asjl[20] = -4174910809857722059L;
        av$HudPosition.asjl[21] = 3606258445417188271L;
        av$HudPosition.asjl[22] = -3700866211819025798L;
        av$HudPosition.asjl[23] = 5215735482529049680L;
        av$HudPosition.asjl[24] = -6621664883803012834L;
        av$HudPosition.asjl[25] = 5397482244991244783L;
        av$HudPosition.asjl[26] = -1811621918088412077L;
        av$HudPosition.asjl[27] = 9104958044685330144L;
        av$HudPosition.asjl[28] = -810152173566201460L;
        av$HudPosition.asjl[29] = 2792403413946579619L;
        av$HudPosition.asjl[30] = 911749618149271830L;
        av$HudPosition.asjl[31] = 6552378224127276196L;
        av$HudPosition.asjl[32] = -762851225836499980L;
        av$HudPosition.asjl[33] = -7140741051715259725L;
    }

    private static /* synthetic */ void asmu() {
        av$HudPosition.asjf[0] = 1064257753;
        av$HudPosition.asjf[1] = 952849317;
        av$HudPosition.asjf[2] = -933812220;
        av$HudPosition.asjf[3] = -1290354505;
        av$HudPosition.asjf[4] = 96707964;
        av$HudPosition.asjf[5] = -1934408673;
        av$HudPosition.asjf[6] = 25408641;
        av$HudPosition.asjf[7] = -403892513;
        av$HudPosition.asjf[8] = -1037922485;
        av$HudPosition.asjf[9] = 1105242347;
        av$HudPosition.asjf[10] = -1580585476;
        av$HudPosition.asjf[11] = 1649114969;
        av$HudPosition.asjf[12] = -2080581841;
        av$HudPosition.asjf[13] = -1765141694;
        av$HudPosition.asjf[14] = -1492856536;
        av$HudPosition.asjf[15] = 772872002;
        av$HudPosition.asjf[16] = 1722691734;
        av$HudPosition.asjf[17] = -1991950536;
        av$HudPosition.asjf[18] = -1425911224;
        av$HudPosition.asjf[19] = 946009142;
        av$HudPosition.asjf[20] = -569094728;
        av$HudPosition.asjf[21] = 154764687;
        av$HudPosition.asjf[22] = 814204489;
        av$HudPosition.asjf[23] = 1546132266;
        av$HudPosition.asjf[24] = 1502212236;
        av$HudPosition.asjf[25] = 1835724278;
        av$HudPosition.asjf[26] = -789297397;
        av$HudPosition.asjf[27] = 1510368615;
        av$HudPosition.asjf[28] = 1423554331;
        av$HudPosition.asjf[29] = 864695638;
        av$HudPosition.asjf[30] = 382364644;
        av$HudPosition.asjf[31] = 1628262656;
        av$HudPosition.asjf[32] = 1444974230;
        av$HudPosition.asjf[33] = 1100264127;
        av$HudPosition.asjf[34] = -1732565195;
        av$HudPosition.asjf[35] = 1978763237;
        av$HudPosition.asjf[36] = 2028536612;
        av$HudPosition.asjf[37] = 873413668;
        av$HudPosition.asjf[38] = -1497842955;
        av$HudPosition.asjf[39] = 752021351;
        av$HudPosition.asjf[40] = 941616334;
        av$HudPosition.asjf[41] = -211223263;
        av$HudPosition.asjf[42] = 2119694853;
        av$HudPosition.asjf[43] = -109278101;
        av$HudPosition.asjf[44] = 1544619474;
        av$HudPosition.asjf[45] = -96892498;
        av$HudPosition.asjf[46] = -1872030113;
        av$HudPosition.asjf[47] = 1636800110;
        av$HudPosition.asjf[48] = 164894548;
        av$HudPosition.asjf[49] = 983832645;
        av$HudPosition.asjf[50] = -1359659647;
        av$HudPosition.asjf[51] = 186063939;
        av$HudPosition.asjf[52] = -283563074;
    }

    private static /* synthetic */ void asmt() {
        av$HudPosition.asje[0] = 1064257752;
        av$HudPosition.asje[1] = 952849317;
        av$HudPosition.asje[2] = -933812219;
        av$HudPosition.asje[3] = 1290354504;
        av$HudPosition.asje[4] = 112189030;
        av$HudPosition.asje[5] = -1934408674;
        av$HudPosition.asje[6] = -1229197113;
        av$HudPosition.asje[7] = 403892512;
        av$HudPosition.asje[8] = 112724875;
        av$HudPosition.asje[9] = -1105242348;
        av$HudPosition.asje[10] = -429625028;
        av$HudPosition.asje[11] = 1649114971;
        av$HudPosition.asje[12] = -2080581843;
        av$HudPosition.asje[13] = -1765141694;
        av$HudPosition.asje[14] = -1492856535;
        av$HudPosition.asje[15] = -772872003;
        av$HudPosition.asje[16] = 1655580243;
        av$HudPosition.asje[17] = -1991950535;
        av$HudPosition.asje[18] = -196714823;
        av$HudPosition.asje[19] = -946009143;
        av$HudPosition.asje[20] = 1704357304;
        av$HudPosition.asje[21] = -1628811057;
        av$HudPosition.asje[22] = 814204490;
        av$HudPosition.asje[23] = 1546132266;
        av$HudPosition.asje[24] = 1502212236;
        av$HudPosition.asje[25] = 1835724278;
        av$HudPosition.asje[26] = 789297396;
        av$HudPosition.asje[27] = 1962345616;
        av$HudPosition.asje[28] = 1423554330;
        av$HudPosition.asje[29] = -864695639;
        av$HudPosition.asje[30] = -667681405;
        av$HudPosition.asje[31] = 1628262659;
        av$HudPosition.asje[32] = 1444974228;
        av$HudPosition.asje[33] = 1100264126;
        av$HudPosition.asje[34] = -1732565195;
        av$HudPosition.asje[35] = -1978763238;
        av$HudPosition.asje[36] = 290771818;
        av$HudPosition.asje[37] = 873413669;
        av$HudPosition.asje[38] = -1923771565;
        av$HudPosition.asje[39] = -228414138;
        av$HudPosition.asje[40] = 941616335;
        av$HudPosition.asje[41] = -211223261;
        av$HudPosition.asje[42] = 2119694854;
        av$HudPosition.asje[43] = -109278101;
        av$HudPosition.asje[44] = 1544619475;
        av$HudPosition.asje[45] = 752803967;
        av$HudPosition.asje[46] = -163306929;
        av$HudPosition.asje[47] = 1636800111;
        av$HudPosition.asje[48] = 323833887;
        av$HudPosition.asje[49] = 983832646;
        av$HudPosition.asje[50] = -1359659645;
        av$HudPosition.asje[51] = 186063939;
        av$HudPosition.asje[52] = -283563076;
    }

    private static /* synthetic */ void asmw() {
        av$HudPosition.asjm[0] = -4525515520262167216L;
        av$HudPosition.asjm[1] = -3282479641727865722L;
        av$HudPosition.asjm[2] = -6284788929159953743L;
        av$HudPosition.asjm[3] = -7496239972730048886L;
        av$HudPosition.asjm[4] = 1088220553747692617L;
        av$HudPosition.asjm[5] = -2076346280625206159L;
        av$HudPosition.asjm[6] = -8720839552579502641L;
        av$HudPosition.asjm[7] = 2063999945801964841L;
        av$HudPosition.asjm[8] = 6473783057595221618L;
        av$HudPosition.asjm[9] = 4315359764586313492L;
        av$HudPosition.asjm[10] = 8067907611773265803L;
        av$HudPosition.asjm[11] = 9199539617327928406L;
        av$HudPosition.asjm[12] = 8643905780247255637L;
        av$HudPosition.asjm[13] = 4410362967823744265L;
        av$HudPosition.asjm[14] = -8020168186706846908L;
        av$HudPosition.asjm[15] = 333125414344616752L;
        av$HudPosition.asjm[16] = -2182737329535781969L;
        av$HudPosition.asjm[17] = 1478341990144019163L;
        av$HudPosition.asjm[18] = 8327739923878653764L;
        av$HudPosition.asjm[19] = -1866011708615223807L;
        av$HudPosition.asjm[20] = -5516532749269116897L;
        av$HudPosition.asjm[21] = 2162347423707953956L;
        av$HudPosition.asjm[22] = 5999393400048041381L;
        av$HudPosition.asjm[23] = 927204113787590441L;
        av$HudPosition.asjm[24] = 6726221704777734147L;
        av$HudPosition.asjm[25] = -4367885729775525714L;
        av$HudPosition.asjm[26] = 5088176839396380247L;
        av$HudPosition.asjm[27] = -8780348220755231337L;
        av$HudPosition.asjm[28] = -6723156747174910624L;
        av$HudPosition.asjm[29] = 5606865773076495105L;
        av$HudPosition.asjm[30] = -2004829168115092031L;
        av$HudPosition.asjm[31] = -8271156307129225059L;
        av$HudPosition.asjm[32] = 8629952481225278750L;
        av$HudPosition.asjm[33] = 4604416986787331756L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private av$HudPosition(int var1_1, int var2_2) {
        var4_3 /* !! */  = av$HudPosition.b;
        super();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.x = var1_1;
                this.y = var2_2;
                return;
            }
            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)av$HudPosition.asjg("asjh", asjd(int ), (int)0);
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)av$HudPosition.asjg("asji", asjd(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)av$HudPosition.asjg("asjj", asjd(int ), (int)2);
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int y() {
        v0 /* !! */  = av$HudPosition.cl;
        block15: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 509483348: {
                    v0 /* !! */  = (long)(av$HudPosition.asjg("asme", asjk(int ), (int)28) - av$HudPosition.asjg("asmd", asjk(int ), (int)27));
                    continue block15;
                }
                case 1377246480: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = av$HudPosition.c;
        v1 /* !! */  = av$HudPosition.cl;
        if (true) ** GOTO lbl14
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - av$HudPosition.asjg("asmf", asjk(int ), (int)29));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -656743468: {
                    v2 = av$HudPosition.asjg("asmg", asjk(int ), (int)30);
                    continue block16;
                }
                case 1377246480: {
                    break block16;
                }
                case 1872025260: {
                    v2 = av$HudPosition.asjg("asmh", asjk(int ), (int)31);
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = av$HudPosition.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = av$HudPosition.cl - av$HudPosition.asjg("asmi", asjk(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == av$HudPosition.asjg("asmj", asjd(int ), (int)44)) {
                var1_3 = av$HudPosition.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)av$HudPosition.asjg("asmk", asjd(int ), (int)45);
        }
        if (var1_3 != false) return (int)av$HudPosition.asjg("asml", asjd(int ), (int)46);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block18: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (int)av$HudPosition.asjg("asml", asjd(int ), (int)46);
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = av$HudPosition.cl - av$HudPosition.asjg("asmm", asjk(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == av$HudPosition.asjg("asmn", asjd(int ), (int)47)) {
                            return this.y;
                        }
                        v4 /* !! */  = (long)av$HudPosition.asjg("asmo", asjd(int ), (int)48);
                    }
                }
                case 0: {
                    ** GOTO lbl59
                }
                case 2: {
                    var2_2 /* !! */  = (int)av$HudPosition.asjg("asmr", asjd(int ), (int)51);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block18;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)av$HudPosition.asjg("asms", asjd(int ), (int)52);
                    if (var3_1) {
                        throw null;
                    }
lbl59:
                    // 3 sources

                    var2_2 /* !! */  = (int)av$HudPosition.asjg("asmp", asjd(int ), (int)49);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)av$HudPosition.asjg("asmq", asjd(int ), (int)50);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int asjd(int n2) {
        return asje[n2] ^ asjf[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av$HudPosition.cl - av$HudPosition.asjg("askd", asjk(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == av$HudPosition.asjg("aske", asjd(int ), (int)15)) break;
            v0 /* !! */  = (long)av$HudPosition.asjg("askf", asjd(int ), (int)16);
        }
        var3_1 = av$HudPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = av$HudPosition.cl - av$HudPosition.asjg("askg", asjk(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == av$HudPosition.asjg("askh", asjd(int ), (int)17)) break;
            v1 /* !! */  = (long)av$HudPosition.asjg("aski", asjd(int ), (int)18);
        }
        var2_2 /* !! */  = av$HudPosition.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = av$HudPosition.cl - av$HudPosition.asjg("askj", asjk(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == av$HudPosition.asjg("askk", asjd(int ), (int)19)) break;
            v2 /* !! */  = (long)av$HudPosition.asjg("askl", asjd(int ), (int)20);
        }
        var1_3 = av$HudPosition.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)av$HudPosition.asjg("askm", asjd(int ), (int)21);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = av$HudPosition.cl;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(av$HudPosition.asjg("asko", asjk(int ), (int)8) - av$HudPosition.asjg("askn", asjk(int ), (int)7));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 751618923: {
                            continue block14;
                        }
                        case 1377246480: {
                            break block14;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{av$HudPosition.class, "x;y", "x", "y"}, this);
            }
lbl41:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)av$HudPosition.asjg("askp", asjd(int ), (int)22);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)av$HudPosition.asjg("askq", asjd(int ), (int)23);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)av$HudPosition.asjg("askr", asjd(int ), (int)24);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)av$HudPosition.asjg("asks", asjd(int ), (int)25);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int x() {
        boolean bl2;
        Object object = cl;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - av$HudPosition.asjg("asll", asjk(int ), (int)18);
            }
            switch ((int)object) {
                case -1785069436: {
                    callSite = av$HudPosition.asjg("aslm", asjk(int ), (int)19);
                    continue block11;
                }
                case -1542745966: {
                    callSite = av$HudPosition.asjg("asln", asjk(int ), (int)20);
                    continue block11;
                }
                case 1377246480: {
                    break block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = cl - av$HudPosition.asjg("aslo", asjk(int ), (int)21)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == av$HudPosition.asjg("aslp", asjd(int ), (int)35)) break;
            object2 = av$HudPosition.asjg("aslq", asjd(int ), (int)36);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = cl - av$HudPosition.asjg("aslr", asjk(int ), (int)22)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == av$HudPosition.asjg("asls", asjd(int ), (int)37)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = av$HudPosition.asjg("aslt", asjd(int ), (int)38);
        }
        if (bl2) return (int)av$HudPosition.asjg("aslu", asjd(int ), (int)39);
        if (bl2) return (int)av$HudPosition.asjg("aslu", asjd(int ), (int)39);
        Object object4 = cl;
        boolean bl5 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - av$HudPosition.asjg("aslv", asjk(int ), (int)23);
            }
            switch ((int)object4) {
                case -1798635708: {
                    callSite = av$HudPosition.asjg("aslw", asjk(int ), (int)24);
                    continue block14;
                }
                case -1638375168: {
                    callSite = av$HudPosition.asjg("aslx", asjk(int ), (int)25);
                    continue block14;
                }
                case 1221365249: {
                    callSite = av$HudPosition.asjg("asly", asjk(int ), (int)26);
                    continue block14;
                }
                case 1377246480: {
                    return this.x;
                }
            }
            break;
        }
        return this.x;
    }

    private static /* synthetic */ long asjk(int n2) {
        return asjl[n2] ^ asjm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av$HudPosition.cl - av$HudPosition.asjg("asjn", asjk(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == av$HudPosition.asjg("asjo", asjd(int ), (int)3)) break;
            v0 /* !! */  = (long)av$HudPosition.asjg("asjp", asjd(int ), (int)4);
        }
        var3_1 = av$HudPosition.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = av$HudPosition.cl - av$HudPosition.asjg("asjq", asjk(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == av$HudPosition.asjg("asjr", asjd(int ), (int)5)) break;
            v1 /* !! */  = (long)av$HudPosition.asjg("asjs", asjd(int ), (int)6);
        }
        var2_2 /* !! */  = av$HudPosition.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = av$HudPosition.cl - av$HudPosition.asjg("asjt", asjk(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == av$HudPosition.asjg("asju", asjd(int ), (int)7)) break;
            v2 /* !! */  = (long)av$HudPosition.asjg("asjv", asjd(int ), (int)8);
        }
        var1_3 = av$HudPosition.a;
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
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = av$HudPosition.cl - av$HudPosition.asjg("asjw", asjk(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == av$HudPosition.asjg("asjx", asjd(int ), (int)9)) break;
                    v3 /* !! */  = (long)av$HudPosition.asjg("asjy", asjd(int ), (int)10);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{av$HudPosition.class, "x;y", "x", "y"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)av$HudPosition.asjg("asjz", asjd(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)av$HudPosition.asjg("aska", asjd(int ), (int)12);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)av$HudPosition.asjg("askb", asjd(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)av$HudPosition.asjg("askc", asjd(int ), (int)14);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = av$HudPosition.cl;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - av$HudPosition.asjg("askt", asjk(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1133792689: {
                    v1 = av$HudPosition.asjg("asku", asjk(int ), (int)10);
                    continue block17;
                }
                case -948945752: {
                    v1 = av$HudPosition.asjg("askv", asjk(int ), (int)11);
                    continue block17;
                }
                case 180470583: {
                    v1 = av$HudPosition.asjg("askw", asjk(int ), (int)12);
                    continue block17;
                }
                case 1377246480: {
                    break block17;
                }
            }
            break;
        }
        var4_2 = av$HudPosition.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = av$HudPosition.cl - av$HudPosition.asjg("askx", asjk(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == av$HudPosition.asjg("asky", asjd(int ), (int)26)) break;
            v2 /* !! */  = (long)av$HudPosition.asjg("askz", asjd(int ), (int)27);
        }
        var3_3 /* !! */  = av$HudPosition.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = av$HudPosition.cl;
                if (true) ** GOTO lbl32
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - av$HudPosition.asjg("asla", asjk(int ), (int)14));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 887674107: {
                            v4 = av$HudPosition.asjg("aslb", asjk(int ), (int)15);
                            continue block19;
                        }
                        case 933557422: {
                            v4 = av$HudPosition.asjg("aslc", asjk(int ), (int)16);
                            continue block19;
                        }
                        case 1377246480: {
                            break block19;
                        }
                    }
                    break;
                }
                var2_4 = av$HudPosition.a;
                if (var4_2) {
                    throw null;
                    return (boolean)av$HudPosition.asjg("asld", asjd(int ), (int)28);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = av$HudPosition.cl - av$HudPosition.asjg("asle", asjk(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == av$HudPosition.asjg("aslf", asjd(int ), (int)29)) break;
                    v5 /* !! */  = (long)av$HudPosition.asjg("aslg", asjd(int ), (int)30);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{av$HudPosition.class, "x;y", "x", "y"}, this, var1_1);
            }
lbl54:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)av$HudPosition.asjg("aslh", asjd(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var3_3 /* !! */  = (int)av$HudPosition.asjg("asli", asjd(int ), (int)32);
                if (!var4_2) ** GOTO lbl54
                throw null;
            }
lbl63:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)av$HudPosition.asjg("aslj", asjd(int ), (int)33);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)av$HudPosition.asjg("aslk", asjd(int ), (int)34);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite asjg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        asje = new int[53];
        asjf = new int[53];
        av$HudPosition.asmt();
        av$HudPosition.asmu();
        asjl = new long[34];
        asjm = new long[34];
        av$HudPosition.asmv();
        av$HudPosition.asmw();
    }
}

