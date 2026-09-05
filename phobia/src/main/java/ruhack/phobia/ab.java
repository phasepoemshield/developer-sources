/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ruhack.phobia.ac;
import ruhack.phobia.ai;

public class ab {
    private static int[] ctdf = new int[131];
    public static final boolean a;
    public static final boolean c;
    private static long[] ctdo;
    public static final int b;
    private static long[] ctdn;
    private final ReentrantReadWriteLock lock;
    private static int[] ctdg;
    static final long gi = 3283761238475533459L;

    /*
     * Exception decompiling
     */
    public String read(Path var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[SWITCH]
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
    public ab() {
        var2_1 /* !! */  = ab.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.lock = new ReentrantReadWriteLock();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ab.ctdh("ctdi", ctde(int ), (int)0);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)ab.ctdh("ctdj", ctde(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ab.ctdh("ctdk", ctde(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)ab.ctdh("ctdl", ctde(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void ctmx() {
        ab.ctdg[100] = 1210641655;
        ab.ctdg[101] = -120871623;
        ab.ctdg[102] = 1013402626;
        ab.ctdg[103] = -1179332523;
        ab.ctdg[104] = -397923596;
        ab.ctdg[105] = 856549904;
        ab.ctdg[106] = -1438023749;
        ab.ctdg[107] = -1241458429;
        ab.ctdg[108] = -415208974;
        ab.ctdg[109] = -374841963;
        ab.ctdg[110] = 926698468;
        ab.ctdg[111] = -1389806316;
        ab.ctdg[112] = -1877238425;
        ab.ctdg[113] = -2139542646;
        ab.ctdg[114] = -1134642686;
        ab.ctdg[115] = -523411090;
        ab.ctdg[116] = 774853579;
        ab.ctdg[117] = -164101031;
        ab.ctdg[118] = -477951123;
        ab.ctdg[119] = 89278234;
        ab.ctdg[120] = 1204353809;
        ab.ctdg[121] = 1652729813;
        ab.ctdg[122] = 956213376;
        ab.ctdg[123] = -472977767;
        ab.ctdg[124] = -214717066;
        ab.ctdg[125] = 1423717654;
        ab.ctdg[126] = -988762551;
        ab.ctdg[127] = -1130526009;
        ab.ctdg[128] = 1719604265;
        ab.ctdg[129] = -388086202;
        ab.ctdg[130] = 1356358722;
    }

    private static /* synthetic */ int ctde(int n2) {
        return ctdf[n2] ^ ctdg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean exists() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ab.gi - ab.ctdh("ctkb", ctdm(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ab.ctdh("ctkc", ctde(int ), (int)111)) break;
            v0 /* !! */  = (long)ab.ctdh("ctkd", ctde(int ), (int)112);
        }
        var3_1 = ab.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ab.gi - ab.ctdh("ctke", ctdm(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ab.ctdh("ctkg", ctde(int ), (int)113)) break;
            v1 /* !! */  = (long)ab.ctdh("ctki", ctde(int ), (int)114);
        }
        var2_2 /* !! */  = ab.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ab.gi;
                if (true) ** GOTO lbl22
                block18: while (true) {
                    v2 /* !! */  = (long)(ab.ctdh("ctkm", ctdm(int ), (int)32) - ab.ctdh("ctkk", ctdm(int ), (int)31));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1031279469: {
                            break block18;
                        }
                        case 1796091122: {
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = ab.a;
                if (var3_1) {
                    throw null;
                    return (boolean)ab.ctdh("ctko", ctde(int ), (int)115);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ab.gi;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - ab.ctdh("ctkq", ctdm(int ), (int)33));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1031279469: {
                            break block20;
                        }
                        case -239615032: {
                            v4 = ab.ctdh("ctkr", ctdm(int ), (int)34);
                            continue block20;
                        }
                        case 67728941: {
                            v4 = ab.ctdh("ctkt", ctdm(int ), (int)35);
                            continue block20;
                        }
                        case 1817970112: {
                            v4 = ab.ctdh("ctkv", ctdm(int ), (int)36);
                            continue block20;
                        }
                    }
                    break;
                }
                v5 = ac.getConfigFile();
                v6 = new LinkOption[]{};
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ab.gi - ab.ctdh("ctkx", ctdm(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ab.ctdh("ctkz", ctde(int ), (int)116)) break;
                    v7 /* !! */  = (long)ab.ctdh("ctla", ctde(int ), (int)117);
                }
                return Files.exists(v5, v6);
            }
lbl58:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ab.ctdh("ctlb", ctde(int ), (int)118);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ab.ctdh("ctlc", ctde(int ), (int)119);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ab.ctdh("ctld", ctde(int ), (int)120);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ab.ctdh("ctlf", ctde(int ), (int)121);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ctdm(int n2) {
        return ctdn[n2] ^ ctdo[n2];
    }

    private static /* synthetic */ void ctnb() {
        ab.ctdn[0] = 163305262206123899L;
        ab.ctdn[1] = 5539489706776113259L;
        ab.ctdn[2] = -6920447468029427317L;
        ab.ctdn[3] = -6169908277523407566L;
        ab.ctdn[4] = -3534648657954162357L;
        ab.ctdn[5] = 951721956862733412L;
        ab.ctdn[6] = 6816121936620696374L;
        ab.ctdn[7] = 8522965842884757854L;
        ab.ctdn[8] = 2733533483266830248L;
        ab.ctdn[9] = 4364958287341422138L;
        ab.ctdn[10] = -3414639645407512087L;
        ab.ctdn[11] = -1207574287791631055L;
        ab.ctdn[12] = 5389327324416614916L;
        ab.ctdn[13] = -3222848245031040556L;
        ab.ctdn[14] = 2059277782158893300L;
        ab.ctdn[15] = 7207440120708209224L;
        ab.ctdn[16] = -8192083681516532589L;
        ab.ctdn[17] = 225353198383233774L;
        ab.ctdn[18] = -9007391718583040825L;
        ab.ctdn[19] = -7682629921289585842L;
        ab.ctdn[20] = -3393144202597830872L;
        ab.ctdn[21] = -3703391580376294384L;
        ab.ctdn[22] = -2407286844199046906L;
        ab.ctdn[23] = 582477825410961502L;
        ab.ctdn[24] = -5110624083267576038L;
        ab.ctdn[25] = 3563784598946652397L;
        ab.ctdn[26] = -983855073021490937L;
        ab.ctdn[27] = -4009740488519366433L;
        ab.ctdn[28] = 2918605063829890448L;
        ab.ctdn[29] = -2497983744524381677L;
        ab.ctdn[30] = 5836142626346322507L;
        ab.ctdn[31] = -8116794754650845990L;
        ab.ctdn[32] = 9024036904886616909L;
        ab.ctdn[33] = -8434938642900809219L;
        ab.ctdn[34] = 4212592369728196384L;
        ab.ctdn[35] = 5159402710352627559L;
        ab.ctdn[36] = -5713972168285131311L;
        ab.ctdn[37] = -5711626342606075099L;
        ab.ctdn[38] = 4001696773313991558L;
        ab.ctdn[39] = -7730135144870552543L;
        ab.ctdn[40] = -8516445742975581471L;
        ab.ctdn[41] = -7343118975779220562L;
        ab.ctdn[42] = -4310323538144190087L;
        ab.ctdn[43] = -3630736535518560846L;
    }

    private static /* synthetic */ void ctms() {
        ab.ctdg[0] = -1708769112;
        ab.ctdg[1] = 1171315290;
        ab.ctdg[2] = -1521875950;
        ab.ctdg[3] = 1855515821;
        ab.ctdg[4] = 1241880175;
        ab.ctdg[5] = 1946385773;
        ab.ctdg[6] = 1196139489;
        ab.ctdg[7] = 1875896048;
        ab.ctdg[8] = -1502082829;
        ab.ctdg[9] = 376416814;
        ab.ctdg[10] = 1022722406;
        ab.ctdg[11] = -13932433;
        ab.ctdg[12] = 1150341978;
        ab.ctdg[13] = -2147348901;
        ab.ctdg[14] = 225374119;
        ab.ctdg[15] = -1767562078;
        ab.ctdg[16] = 508067135;
        ab.ctdg[17] = 956867108;
        ab.ctdg[18] = 604984309;
        ab.ctdg[19] = -1872053656;
        ab.ctdg[20] = -68373430;
        ab.ctdg[21] = 1232500568;
        ab.ctdg[22] = 34600069;
        ab.ctdg[23] = 1044609695;
        ab.ctdg[24] = -1974640509;
        ab.ctdg[25] = 1064238967;
        ab.ctdg[26] = -118237376;
        ab.ctdg[27] = 345641137;
        ab.ctdg[28] = 760488474;
        ab.ctdg[29] = 793987433;
        ab.ctdg[30] = 975245233;
        ab.ctdg[31] = 392667228;
        ab.ctdg[32] = 446919943;
        ab.ctdg[33] = -1495185706;
        ab.ctdg[34] = -1140608325;
        ab.ctdg[35] = 2107613590;
        ab.ctdg[36] = 1027608314;
        ab.ctdg[37] = 629811824;
        ab.ctdg[38] = 1775700443;
        ab.ctdg[39] = -819247456;
        ab.ctdg[40] = 191594698;
        ab.ctdg[41] = -1470263968;
        ab.ctdg[42] = -1001035284;
        ab.ctdg[43] = 399210879;
        ab.ctdg[44] = 1653382822;
        ab.ctdg[45] = -1328860664;
        ab.ctdg[46] = -193256279;
        ab.ctdg[47] = 650529079;
        ab.ctdg[48] = 940816181;
        ab.ctdg[49] = -1400318377;
        ab.ctdg[50] = 1086885488;
        ab.ctdg[51] = 367097401;
        ab.ctdg[52] = 1061722367;
        ab.ctdg[53] = 1465014110;
        ab.ctdg[54] = 1886919752;
        ab.ctdg[55] = 1242878489;
        ab.ctdg[56] = -920057333;
        ab.ctdg[57] = 1867512355;
        ab.ctdg[58] = 2078924325;
        ab.ctdg[59] = -808032637;
        ab.ctdg[60] = -54225464;
        ab.ctdg[61] = -1252528715;
        ab.ctdg[62] = -975840918;
        ab.ctdg[63] = -594700433;
        ab.ctdg[64] = 99407152;
        ab.ctdg[65] = -402826624;
        ab.ctdg[66] = -2115303506;
        ab.ctdg[67] = 769242259;
        ab.ctdg[68] = -1142975190;
        ab.ctdg[69] = -1263496478;
        ab.ctdg[70] = 740173872;
        ab.ctdg[71] = 101477838;
        ab.ctdg[72] = 1137177113;
        ab.ctdg[73] = -695399237;
        ab.ctdg[74] = -1648818992;
        ab.ctdg[75] = 348042480;
        ab.ctdg[76] = 1471431911;
        ab.ctdg[77] = -28361782;
        ab.ctdg[78] = 1371619788;
        ab.ctdg[79] = -1293529409;
        ab.ctdg[80] = 1005386664;
        ab.ctdg[81] = -473976955;
        ab.ctdg[82] = 1227264374;
        ab.ctdg[83] = 1819717341;
        ab.ctdg[84] = 1520271617;
        ab.ctdg[85] = -378661372;
        ab.ctdg[86] = -1369067798;
        ab.ctdg[87] = 307856745;
        ab.ctdg[88] = 434841521;
        ab.ctdg[89] = -1342944413;
        ab.ctdg[90] = 724728025;
        ab.ctdg[91] = -2081511688;
        ab.ctdg[92] = 844413335;
        ab.ctdg[93] = 1380310519;
        ab.ctdg[94] = 129100976;
        ab.ctdg[95] = -812756242;
        ab.ctdg[96] = 1053417845;
        ab.ctdg[97] = 1096691398;
        ab.ctdg[98] = -1481232391;
        ab.ctdg[99] = -709293297;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void createDirectories() {
        block53: {
            block55: {
                while (true) {
                    block54: {
                        if ((v0 /* !! */  = (cfr_temp_1 = ab.gi - ab.ctdh("ctdp", ctdm(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  != ab.ctdh("ctdq", ctde(int ), (int)4)) break block54;
                        var4_1 = ab.c;
                        v1 /* !! */  = ab.gi;
                        if (true) ** GOTO lbl13
                    }
                    v0 /* !! */  = (long)ab.ctdh("ctdr", ctde(int ), (int)5);
                }
                block29: while (true) {
                    v1 /* !! */  = (long)(v2 - ab.ctdh("ctds", ctdm(int ), (int)1));
lbl13:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1520683449: {
                            v2 = ab.ctdh("ctdt", ctdm(int ), (int)2);
                            continue block29;
                        }
                        case -1031279469: {
                            break block29;
                        }
                        case 304742044: {
                            v2 = ab.ctdh("ctdu", ctdm(int ), (int)3);
                            continue block29;
                        }
                    }
                    break;
                }
                var3_2 /* !! */  = ab.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ab.gi - ab.ctdh("ctdv", ctdm(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ab.ctdh("ctdw", ctde(int ), (int)6)) {
                        var2_3 = ab.a;
                        if (var4_1) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)ab.ctdh("ctdx", ctde(int ), (int)7);
                }
                if (var2_3) return;
                try {
                    if (var2_3) return;
                    v4 /* !! */  = ab.gi;
                    if (true) ** GOTO lbl40
                    block31: while (true) {
                        v4 /* !! */  = (long)(v5 - ab.ctdh("ctdy", ctdm(int ), (int)5));
lbl40:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -2101597524: {
                                v5 = ab.ctdh("ctdz", ctdm(int ), (int)6);
                                continue block31;
                            }
                            case -1031279469: {
                                ** break;
                            }
                            case 1908914010: {
                                v5 = ab.ctdh("ctea", ctdm(int ), (int)7);
                                continue block31;
                            }
                        }
                        break;
                    }
                }
                catch (IOException var1_4) {
                    if (var2_3 || var2_3) return;
                    ** GOTO lbl114
                }
lbl53:
                // 3 sources

                v6 = ac.getConfigDirectory();
                v7 = new FileAttribute[]{};
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ab.gi - ab.ctdh("cteb", ctdm(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ab.ctdh("ctec", ctde(int ), (int)8)) {
                        Files.createDirectories(v6, v7);
                        if (var2_3) return;
                        break;
                    }
                    v8 /* !! */  = (long)ab.ctdh("cted", ctde(int ), (int)9);
                }
                if (var2_3) return;
                if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl68:
                // 2 sources

                block33: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var4_1) {
                                throw null;
                            }
                            ** GOTO lbl123
                        }
                        case 0: {
                            var3_2 /* !! */  = (int)ab.ctdh("cteh", ctde(int ), (int)12);
                            cfr_temp_0 = 2;
                            if (!var4_1) continue block33;
                            throw null;
                        }
                        case 1: {
                            var3_2 /* !! */  = (int)ab.ctdh("ctei", ctde(int ), (int)13);
                            cfr_temp_0 = 4;
                            if (!var4_1) continue block33;
                            throw null;
                        }
                        case 3: {
                            ** GOTO lbl125
                        }
                        case 4: {
                            var3_2 /* !! */  = (int)ab.ctdh("ctel", ctde(int ), (int)16);
                            cfr_temp_0 = 7;
                            if (!var4_1) continue block33;
                            throw null;
                        }
                        case 6: {
                            var3_2 /* !! */  = (int)ab.ctdh("cten", ctde(int ), (int)18);
                            if (var4_1) {
                                throw null;
                            }
                        }
                        case 7: {
                            var3_2 /* !! */  = (int)ab.ctdh("cteo", ctde(int ), (int)19);
                            cfr_temp_0 = 9;
                            if (!var4_1) continue block33;
                            throw null;
                        }
                        case 8: {
                            var3_2 /* !! */  = (int)ab.ctdh("ctep", ctde(int ), (int)20);
                            if (var4_1) {
                                throw null;
                            }
                        }
                        case 5: {
                            var3_2 /* !! */  = (int)ab.ctdh("ctem", ctde(int ), (int)17);
                            if (var4_1) {
                                throw null;
                            }
                        }
                        case 2: {
                            var3_2 /* !! */  = (int)ab.ctdh("ctej", ctde(int ), (int)14);
                            if (!var4_1) ** break;
                            throw null;
                        }
                        case 10: {
                            break block53;
                        }
lbl114:
                        // 1 sources

                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_4 = ab.gi - ab.ctdh("ctee", ctdm(int ), (int)9)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v9 /* !! */  == ab.ctdh("ctef", ctde(int ), (int)10)) {
                                ai.error("AutoConfiguration: Failed to create directories!");
                                if (var2_3) return;
                                break;
                            }
                            v9 /* !! */  = (long)ab.ctdh("cteg", ctde(int ), (int)11);
                        }
lbl123:
                        // 2 sources

                        if (!var2_3 && !var2_3) return;
                        return;
lbl125:
                        // 2 sources

                        while (true) {
                            var3_2 /* !! */  = (int)ab.ctdh("ctek", ctde(int ), (int)15);
                            cfr_temp_0 = 9;
                            if (!var4_1) continue block33;
                            throw null;
                        }
                        case 9: 
                    }
                    break;
                }
                break block55;
                ** while (true)
            }
            var3_2 /* !! */  = (int)ab.ctdh("cteq", ctde(int ), (int)21);
            if (!var4_1) ** break;
            throw null;
        }
        var3_2 /* !! */  = (int)ab.ctdh("cter", ctde(int ), (int)22);
        ** while (!var4_1)
lbl140:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean exists(Path path) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = gi - ab.ctdh("ctli", ctdm(int ), (int)38)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ab.ctdh("ctlk", ctde(int ), (int)122)) break;
            object = ab.ctdh("ctll", ctde(int ), (int)123);
        }
        boolean bl2 = c;
        Object object = gi;
        block9: while (true) {
            switch ((int)object) {
                case -1031279469: {
                    break block9;
                }
                case 388416408: {
                    object = ab.ctdh("ctlq", ctdm(int ), (int)40) - ab.ctdh("ctln", ctdm(int ), (int)39);
                    continue block9;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = gi;
        block10: while (true) {
            switch ((int)object2) {
                case -1031279469: {
                    break block10;
                }
                case 1880989823: {
                    object2 = ab.ctdh("ctls", ctdm(int ), (int)42) - ab.ctdh("ctlr", ctdm(int ), (int)41);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (boolean)ab.ctdh("ctlt", ctde(int ), (int)124);
        if (bl3) return (boolean)ab.ctdh("ctlt", ctde(int ), (int)124);
        LinkOption[] linkOptionArray = new LinkOption[]{};
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = gi - ab.ctdh("ctlv", ctdm(int ), (int)43)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ab.ctdh("ctlw", ctde(int ), (int)125)) {
                return Files.exists(path, linkOptionArray);
            }
            object3 = ab.ctdh("ctly", ctde(int ), (int)126);
        }
    }

    private static /* synthetic */ void ctmi() {
        ab.ctdf[0] = -1708769112;
        ab.ctdf[1] = 1171315290;
        ab.ctdf[2] = -1521875949;
        ab.ctdf[3] = 1855515823;
        ab.ctdf[4] = 1241880174;
        ab.ctdf[5] = -455188606;
        ab.ctdf[6] = -1196139490;
        ab.ctdf[7] = 12339589;
        ab.ctdf[8] = -1502082830;
        ab.ctdf[9] = -1687301903;
        ab.ctdf[10] = 1022722407;
        ab.ctdf[11] = 3275606;
        ab.ctdf[12] = 1150341979;
        ab.ctdf[13] = -2147348909;
        ab.ctdf[14] = 225374118;
        ab.ctdf[15] = -1767562069;
        ab.ctdf[16] = 508067132;
        ab.ctdf[17] = 956867117;
        ab.ctdf[18] = 604984305;
        ab.ctdf[19] = -1872053653;
        ab.ctdf[20] = -68373426;
        ab.ctdf[21] = 1232500568;
        ab.ctdf[22] = 34600064;
        ab.ctdf[23] = 1044609694;
        ab.ctdf[24] = 2050917704;
        ab.ctdf[25] = 1064238966;
        ab.ctdf[26] = 118237375;
        ab.ctdf[27] = 656819269;
        ab.ctdf[28] = 760488472;
        ab.ctdf[29] = 793987432;
        ab.ctdf[30] = 975245233;
        ab.ctdf[31] = 392667229;
        ab.ctdf[32] = 446919942;
        ab.ctdf[33] = -1495185705;
        ab.ctdf[34] = -1140608325;
        ab.ctdf[35] = 2107613580;
        ab.ctdf[36] = 1027608280;
        ab.ctdf[37] = 629811813;
        ab.ctdf[38] = 1775700421;
        ab.ctdf[39] = -819247486;
        ab.ctdf[40] = 191594695;
        ab.ctdf[41] = -1470263968;
        ab.ctdf[42] = -1001035290;
        ab.ctdf[43] = 399210879;
        ab.ctdf[44] = 1653382834;
        ab.ctdf[45] = -1328860667;
        ab.ctdf[46] = -193256266;
        ab.ctdf[47] = 650529074;
        ab.ctdf[48] = 940816188;
        ab.ctdf[49] = -1400318399;
        ab.ctdf[50] = 1086885502;
        ab.ctdf[51] = 367097398;
        ab.ctdf[52] = 1061722357;
        ab.ctdf[53] = 1465014081;
        ab.ctdf[54] = 1886919755;
        ab.ctdf[55] = 1242878485;
        ab.ctdf[56] = -920057323;
        ab.ctdf[57] = 1867512353;
        ab.ctdf[58] = 2078924293;
        ab.ctdf[59] = -808032613;
        ab.ctdf[60] = -54225452;
        ab.ctdf[61] = -1252528709;
        ab.ctdf[62] = -975840923;
        ab.ctdf[63] = -594700418;
        ab.ctdf[64] = 99407141;
        ab.ctdf[65] = -402826621;
        ab.ctdf[66] = -2115303500;
        ab.ctdf[67] = 769242240;
        ab.ctdf[68] = -1142975178;
        ab.ctdf[69] = -1263496468;
        ab.ctdf[70] = 740173873;
        ab.ctdf[71] = 1607414731;
        ab.ctdf[72] = -1137177114;
        ab.ctdf[73] = 181785168;
        ab.ctdf[74] = -1648818991;
        ab.ctdf[75] = -369263408;
        ab.ctdf[76] = 1471431910;
        ab.ctdf[77] = -28361782;
        ab.ctdf[78] = 1371619790;
        ab.ctdf[79] = -1293529412;
        ab.ctdf[80] = 1005386681;
        ab.ctdf[81] = -473976956;
        ab.ctdf[82] = 1227264377;
        ab.ctdf[83] = 1819717322;
        ab.ctdf[84] = 1520271639;
        ab.ctdf[85] = -378661347;
        ab.ctdf[86] = -1369067795;
        ab.ctdf[87] = 307856761;
        ab.ctdf[88] = 434841504;
        ab.ctdf[89] = -1342944399;
        ab.ctdf[90] = 724728026;
        ab.ctdf[91] = -2081511682;
        ab.ctdf[92] = 844413338;
        ab.ctdf[93] = 1380310501;
        ab.ctdf[94] = 129100988;
        ab.ctdf[95] = -812756250;
        ab.ctdf[96] = 1053417831;
        ab.ctdf[97] = 1096691393;
        ab.ctdf[98] = -1481232404;
        ab.ctdf[99] = -709293309;
    }

    public static /* synthetic */ CallSite ctdh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ctnf() {
        ab.ctdo[0] = 1024954491528996351L;
        ab.ctdo[1] = 8039288105363415966L;
        ab.ctdo[2] = 5154520157402483931L;
        ab.ctdo[3] = 6400163519565798536L;
        ab.ctdo[4] = -7977633121378613150L;
        ab.ctdo[5] = -662282134105744393L;
        ab.ctdo[6] = 6313003022420674308L;
        ab.ctdo[7] = 8371401433169414982L;
        ab.ctdo[8] = 2999937733462347073L;
        ab.ctdo[9] = -9043613540898060797L;
        ab.ctdo[10] = -2980749744882398881L;
        ab.ctdo[11] = 7341402236095475123L;
        ab.ctdo[12] = -3338643790226579626L;
        ab.ctdo[13] = 5609429616056499634L;
        ab.ctdo[14] = 5984584323092484136L;
        ab.ctdo[15] = 7112941900434069027L;
        ab.ctdo[16] = 4297057537268497829L;
        ab.ctdo[17] = 7203463117824349530L;
        ab.ctdo[18] = -968509206365882839L;
        ab.ctdo[19] = -975315411531813594L;
        ab.ctdo[20] = 7753225770216697369L;
        ab.ctdo[21] = -1440449091730851587L;
        ab.ctdo[22] = 5701133758728102034L;
        ab.ctdo[23] = 8635512146434731049L;
        ab.ctdo[24] = 5044218188012608894L;
        ab.ctdo[25] = -1339432085031630053L;
        ab.ctdo[26] = -4445570377612018440L;
        ab.ctdo[27] = -7055914652248204442L;
        ab.ctdo[28] = -8980903757675180096L;
        ab.ctdo[29] = -4609975206570468625L;
        ab.ctdo[30] = -8792137761833821090L;
        ab.ctdo[31] = 5863414082326393199L;
        ab.ctdo[32] = 1715327866258248488L;
        ab.ctdo[33] = -3797544305399723831L;
        ab.ctdo[34] = -1447516775952445170L;
        ab.ctdo[35] = -554369094759332381L;
        ab.ctdo[36] = -360085043144598901L;
        ab.ctdo[37] = 1850377942590502586L;
        ab.ctdo[38] = 6056748116781564152L;
        ab.ctdo[39] = 8297800730167770087L;
        ab.ctdo[40] = -5334313077915922160L;
        ab.ctdo[41] = 881400004105293776L;
        ab.ctdo[42] = -2360749873715140020L;
        ab.ctdo[43] = -3267503494951314010L;
    }

    private static /* synthetic */ void ctmq() {
        ab.ctdf[100] = 1210641643;
        ab.ctdf[101] = -120871619;
        ab.ctdf[102] = 1013402634;
        ab.ctdf[103] = -1179332529;
        ab.ctdf[104] = -397923590;
        ab.ctdf[105] = 856549916;
        ab.ctdf[106] = -1438023759;
        ab.ctdf[107] = -1241458413;
        ab.ctdf[108] = -415208976;
        ab.ctdf[109] = -374841956;
        ab.ctdf[110] = 926698478;
        ab.ctdf[111] = -1389806315;
        ab.ctdf[112] = 204040732;
        ab.ctdf[113] = -2139542645;
        ab.ctdf[114] = -744979614;
        ab.ctdf[115] = -523411090;
        ab.ctdf[116] = 774853578;
        ab.ctdf[117] = -1082608857;
        ab.ctdf[118] = -477951121;
        ab.ctdf[119] = 89278232;
        ab.ctdf[120] = 1204353810;
        ab.ctdf[121] = 1652729814;
        ab.ctdf[122] = -956213377;
        ab.ctdf[123] = -1362228294;
        ab.ctdf[124] = -214717066;
        ab.ctdf[125] = 1423717655;
        ab.ctdf[126] = 1592400607;
        ab.ctdf[127] = -1130526009;
        ab.ctdf[128] = 1719604264;
        ab.ctdf[129] = -388086202;
        ab.ctdf[130] = 1356358720;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String read() {
        v0 /* !! */  = ab.gi;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(ab.ctdh("ctgy", ctdm(int ), (int)21) - ab.ctdh("ctgx", ctdm(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1031279469: {
                    break block16;
                }
                case -618905112: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = ab.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ab.gi - ab.ctdh("ctgz", ctdm(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ab.ctdh("ctha", ctde(int ), (int)70)) break;
            v1 /* !! */  = (long)ab.ctdh("cthb", ctde(int ), (int)71);
        }
        var2_2 /* !! */  = ab.b;
        v2 /* !! */  = ab.gi;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ab.ctdh("cthc", ctdm(int ), (int)23));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1155386823: {
                    v3 = ab.ctdh("cthd", ctdm(int ), (int)24);
                    continue block18;
                }
                case -1031279469: {
                    break block18;
                }
                case -883302322: {
                    v3 = ab.ctdh("cthe", ctdm(int ), (int)25);
                    continue block18;
                }
                case 1422709518: {
                    v3 = ab.ctdh("cthf", ctdm(int ), (int)26);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = ab.a;
        if (var3_1) {
            throw null;
lbl36:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl39:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ab.gi - ab.ctdh("cthg", ctdm(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ab.ctdh("cthh", ctde(int ), (int)72)) break;
                    v4 /* !! */  = (long)ab.ctdh("cthi", ctde(int ), (int)73);
                }
                v5 = ac.getConfigFile();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ab.gi - ab.ctdh("cthj", ctdm(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ab.ctdh("cthk", ctde(int ), (int)74)) break;
                    v6 /* !! */  = (long)ab.ctdh("cthl", ctde(int ), (int)75);
                }
                return this.read(v5);
            }
            case 0: {
                var2_2 /* !! */  = (int)ab.ctdh("cthm", ctde(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
            }
            case 1: {
                var2_2 /* !! */  = (int)ab.ctdh("cthn", ctde(int ), (int)77);
                if (var3_1) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ab.ctdh("ctho", ctde(int ), (int)78);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ab.ctdh("cthp", ctde(int ), (int)79);
        } while (!var3_1);
        throw null;
    }

    /*
     * Exception decompiling
     */
    public boolean write(Path var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[SWITCH]
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
    public boolean write(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ab.gi - ab.ctdh("ctes", ctdm(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ab.ctdh("ctet", ctde(int ), (int)23)) break;
            v0 /* !! */  = (long)ab.ctdh("cteu", ctde(int ), (int)24);
        }
        var4_2 = ab.c;
        v1 /* !! */  = ab.gi;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ab.ctdh("ctev", ctdm(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1922469587: {
                    v2 = ab.ctdh("ctew", ctdm(int ), (int)12);
                    continue block21;
                }
                case -1031279469: {
                    break block21;
                }
                case 2040294556: {
                    v2 = ab.ctdh("ctex", ctdm(int ), (int)13);
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = ab.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ab.gi;
                if (true) ** GOTO lbl29
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - ab.ctdh("ctey", ctdm(int ), (int)14));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2063116751: {
                            v4 = ab.ctdh("ctez", ctdm(int ), (int)15);
                            continue block22;
                        }
                        case -1511336517: {
                            v4 = ab.ctdh("ctfa", ctdm(int ), (int)16);
                            continue block22;
                        }
                        case -1031279469: {
                            break block22;
                        }
                    }
                    break;
                }
                var2_4 = ab.a;
                if (var4_2) {
                    throw null;
                    return (boolean)ab.ctdh("ctfb", ctde(int ), (int)25);
                }
                if (var2_4 || var2_4) ** continue;
                v5 /* !! */  = ab.gi;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(ab.ctdh("ctfd", ctdm(int ), (int)18) - ab.ctdh("ctfc", ctdm(int ), (int)17));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1031279469: {
                            break block24;
                        }
                        case 618608919: {
                            continue block24;
                        }
                    }
                    break;
                }
                v6 = ac.getConfigFile();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ab.gi - ab.ctdh("ctfe", ctdm(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ab.ctdh("ctff", ctde(int ), (int)26)) break;
                    v7 /* !! */  = (long)ab.ctdh("ctfg", ctde(int ), (int)27);
                }
                return this.write(v6, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)ab.ctdh("ctfh", ctde(int ), (int)28);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ab.ctdh("ctfi", ctde(int ), (int)29);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ab.ctdh("ctfj", ctde(int ), (int)30);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)ab.ctdh("ctfk", ctde(int ), (int)31);
        } while (!var4_2);
        throw null;
    }

    static {
        ctdg = new int[131];
        ab.ctmi();
        ab.ctmq();
        ab.ctms();
        ab.ctmx();
        ctdn = new long[44];
        ctdo = new long[44];
        ab.ctnb();
        ab.ctnf();
    }
}

