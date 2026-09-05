/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Native
 */
package ruhack.phobia;

import com.sun.jna.Native;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.pi;

public final class ph {
    private static int[] kyof;
    public static final boolean c;
    public static final int b;
    private static final long tl = 6072745250575765392L;
    public static final pi INSTANCE;
    private static long[] kyom;
    private static int[] kyoe;
    private static long[] kyol;
    public static final boolean a;

    private static /* synthetic */ void kyth() {
        ph.kyol[0] = -3232321959213542766L;
        ph.kyol[1] = -8308836944690625860L;
        ph.kyol[2] = 1299189280843420565L;
        ph.kyol[3] = -8147432803081450713L;
        ph.kyol[4] = 2895546034033325395L;
        ph.kyol[5] = -8647899352740577255L;
        ph.kyol[6] = -30792912673793791L;
        ph.kyol[7] = -8185556222875065558L;
        ph.kyol[8] = 6915474934264789518L;
        ph.kyol[9] = 563117977908475948L;
        ph.kyol[10] = -8187988780958451116L;
        ph.kyol[11] = 2935141052658997986L;
        ph.kyol[12] = 2792463935027133691L;
        ph.kyol[13] = 2812566575712051847L;
        ph.kyol[14] = -4608312713887815543L;
        ph.kyol[15] = 6681053988947536101L;
        ph.kyol[16] = -5333262093149878664L;
        ph.kyol[17] = 8103973429351128793L;
        ph.kyol[18] = 3141047534828341471L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ph() {
        int n2 = b;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                CallSite callSite = ph.kyog("kyoh", kyod(int ), (int)0);
            }
            case 1: {
                CallSite callSite = ph.kyog("kyoi", kyod(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = ph.kyog("kyoj", kyod(int ), (int)2);
        }
    }

    private static /* synthetic */ long kyok(int n2) {
        return kyol[n2] ^ kyom[n2];
    }

    private static /* synthetic */ int kyod(int n2) {
        return kyoe[n2] ^ kyof[n2];
    }

    /*
     * Exception decompiling
     */
    private static File extract(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 0[TRYBLOCK]], but top level block is 12[CASE]
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

    private static /* synthetic */ void kytd() {
        ph.kyoe[0] = -1977708594;
        ph.kyoe[1] = 1401182236;
        ph.kyoe[2] = 675141545;
        ph.kyoe[3] = 1206054880;
        ph.kyoe[4] = 188298154;
        ph.kyoe[5] = -1696698509;
        ph.kyoe[6] = 1526471285;
        ph.kyoe[7] = -929486980;
        ph.kyoe[8] = 1339316313;
        ph.kyoe[9] = -244579236;
        ph.kyoe[10] = 1908199855;
        ph.kyoe[11] = 1623432712;
        ph.kyoe[12] = -1507158975;
        ph.kyoe[13] = 1293931957;
        ph.kyoe[14] = -1540892993;
        ph.kyoe[15] = 651209501;
        ph.kyoe[16] = 1438695669;
        ph.kyoe[17] = -233797592;
        ph.kyoe[18] = 827583167;
        ph.kyoe[19] = 1963448835;
        ph.kyoe[20] = 1020036960;
        ph.kyoe[21] = -370656840;
        ph.kyoe[22] = 1230573610;
        ph.kyoe[23] = -1189910424;
        ph.kyoe[24] = 935370712;
        ph.kyoe[25] = 1236054416;
        ph.kyoe[26] = 1123427837;
        ph.kyoe[27] = 1345282726;
        ph.kyoe[28] = -1260318944;
        ph.kyoe[29] = -1421086755;
        ph.kyoe[30] = 1202883982;
        ph.kyoe[31] = 1760162871;
        ph.kyoe[32] = -1706381902;
        ph.kyoe[33] = -1271888616;
        ph.kyoe[34] = -192743000;
        ph.kyoe[35] = -421531045;
        ph.kyoe[36] = -1203559217;
        ph.kyoe[37] = -58068470;
        ph.kyoe[38] = 1691757068;
        ph.kyoe[39] = -793240046;
        ph.kyoe[40] = 422391860;
        ph.kyoe[41] = -1252558497;
        ph.kyoe[42] = 558927657;
        ph.kyoe[43] = -332654303;
        ph.kyoe[44] = -1679963179;
        ph.kyoe[45] = -750387666;
        ph.kyoe[46] = 1849845296;
        ph.kyoe[47] = -346399673;
        ph.kyoe[48] = 128340012;
        ph.kyoe[49] = 1113054940;
        ph.kyoe[50] = -733643079;
        ph.kyoe[51] = 1888267270;
        ph.kyoe[52] = -701324034;
        ph.kyoe[53] = -1269307973;
        ph.kyoe[54] = -1108693915;
        ph.kyoe[55] = 1448267783;
        ph.kyoe[56] = 899286066;
        ph.kyoe[57] = 1485224185;
        ph.kyoe[58] = -742623154;
        ph.kyoe[59] = 1099535638;
        ph.kyoe[60] = -403439052;
        ph.kyoe[61] = 939814539;
        ph.kyoe[62] = -1776162247;
        ph.kyoe[63] = -169715316;
        ph.kyoe[64] = 1017825808;
        ph.kyoe[65] = -160553665;
        ph.kyoe[66] = -1576700009;
        ph.kyoe[67] = 603958394;
        ph.kyoe[68] = 903792821;
        ph.kyoe[69] = 1531036973;
        ph.kyoe[70] = -288262965;
        ph.kyoe[71] = 645905655;
        ph.kyoe[72] = 1086272306;
        ph.kyoe[73] = -1122478957;
        ph.kyoe[74] = -1684762152;
        ph.kyoe[75] = 429237865;
        ph.kyoe[76] = -1375853714;
        ph.kyoe[77] = 1038711182;
        ph.kyoe[78] = -751419190;
        ph.kyoe[79] = -480324224;
        ph.kyoe[80] = 918436910;
        ph.kyoe[81] = -1248783186;
        ph.kyoe[82] = 1171002324;
        ph.kyoe[83] = -1573777381;
        ph.kyoe[84] = 1841497420;
        ph.kyoe[85] = 1207571507;
        ph.kyoe[86] = 1553885164;
        ph.kyoe[87] = -839262900;
        ph.kyoe[88] = -1819510044;
        ph.kyoe[89] = -825311632;
        ph.kyoe[90] = 551460302;
        ph.kyoe[91] = 465729687;
        ph.kyoe[92] = 313169567;
        ph.kyoe[93] = -757550911;
        ph.kyoe[94] = -838203116;
        ph.kyoe[95] = -604059962;
        ph.kyoe[96] = -719664975;
        ph.kyoe[97] = 1323625285;
        ph.kyoe[98] = -710935259;
        ph.kyoe[99] = 971541039;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static pi load() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ph.tl - ph.kyog("kyon", kyok(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ph.kyog("kyoo", kyod(int ), (int)3)) break;
            v0 /* !! */  = (long)ph.kyog("kyop", kyod(int ), (int)4);
        }
        var4 = ph.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ph.tl - ph.kyog("kyoq", kyok(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ph.kyog("kyor", kyod(int ), (int)5)) break;
            v1 /* !! */  = (long)ph.kyog("kyos", kyod(int ), (int)6);
        }
        var3_1 /* !! */  = ph.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ph.tl - ph.kyog("kyot", kyok(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ph.kyog("kyou", kyod(int ), (int)7)) break;
            v2 /* !! */  = (long)ph.kyog("kyov", kyod(int ), (int)8);
        }
        var2_2 = ph.a;
        if (var4) {
            throw null;
lbl21:
            // 6 sources

            return null;
        }
        if (var2_2) ** GOTO lbl21
        if (var3_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_2) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ph.tl - ph.kyog("kyow", kyok(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ph.kyog("kyox", kyod(int ), (int)9)) break;
                    v3 /* !! */  = (long)ph.kyog("kyoy", kyod(int ), (int)10);
                }
                if (!ph.is64Bit()) ** GOTO lbl39
                if (var2_2 || var2_2) ** GOTO lbl21
                v4 = "/win32-x86-64/discord-rpc.dll";
                if (var4) {
                    throw null;
                }
                ** GOTO lbl41
lbl39:
                // 1 sources

                if (var2_2 || var2_2) ** GOTO lbl21
                v4 = var0_3 = "/win32-x86/discord-rpc.dll";
lbl41:
                // 2 sources

                if (var2_2 || var2_2) ** GOTO lbl21
                v5 /* !! */  = ph.tl;
                if (true) ** GOTO lbl46
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - ph.kyog("kyoz", kyok(int ), (int)4));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -339732098: {
                            v6 = ph.kyog("kypa", kyok(int ), (int)5);
                            continue block29;
                        }
                        case 519481966: {
                            v6 = ph.kyog("kypb", kyok(int ), (int)6);
                            continue block29;
                        }
                        case 1879199632: {
                            break block29;
                        }
                    }
                    break;
                }
                var1_4 = ph.extract(var0_3);
                if (!var2_2 && !var2_2) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ph.tl - ph.kyog("kypc", kyok(int ), (int)7)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ph.kyog("kypd", kyod(int ), (int)11)) break;
                    v7 /* !! */  = (long)ph.kyog("kype", kyod(int ), (int)12);
                }
                v8 = var1_4.getAbsolutePath();
                v9 /* !! */  = ph.tl;
                if (true) ** GOTO lbl68
                block31: while (true) {
                    v9 /* !! */  = (long)(ph.kyog("kypg", kyok(int ), (int)9) - ph.kyog("kypf", kyok(int ), (int)8));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -342374958: {
                            continue block31;
                        }
                        case 1879199632: {
                            break block31;
                        }
                    }
                    break;
                }
                return (pi)Native.loadLibrary((String)v8, pi.class);
            }
lbl74:
            // 2 sources

            case 0: {
                var3_1 /* !! */  = (int)ph.kyog("kyph", kyod(int ), (int)13);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 1: {
                var3_1 /* !! */  = (int)ph.kyog("kypi", kyod(int ), (int)14);
                if (var4) {
                    throw null;
                }
            }
            case 2: {
                var3_1 /* !! */  = (int)ph.kyog("kypj", kyod(int ), (int)15);
                if (!var4) ** GOTO lbl74
                throw null;
            }
lbl87:
            // 2 sources

            case 3: {
                var3_1 /* !! */  = (int)ph.kyog("kypk", kyod(int ), (int)16);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 4: {
                var3_1 /* !! */  = (int)ph.kyog("kypl", kyod(int ), (int)17);
                if (!var4) break;
                throw null;
            }
            case 5: {
                do {
                    var3_1 /* !! */  = (int)ph.kyog("kypm", kyod(int ), (int)18);
                } while (!var4);
                throw null;
            }
            case 6: {
                do {
                    var3_1 /* !! */  = (int)ph.kyog("kypn", kyod(int ), (int)19);
                } while (!var4);
                throw null;
            }
lbl106:
            // 3 sources

            case 7: {
                var3_1 /* !! */  = (int)ph.kyog("kypo", kyod(int ), (int)20);
                if (!var4) break;
                throw null;
            }
            case 8: {
                var3_1 /* !! */  = (int)ph.kyog("kypp", kyod(int ), (int)21);
                if (!var4) break;
                throw null;
            }
            case 9: {
                var3_1 /* !! */  = (int)ph.kyog("kypq", kyod(int ), (int)22);
                if (!var4) ** GOTO lbl106
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_1 /* !! */  = (int)ph.kyog("kypr", kyod(int ), (int)23);
                    if (!var4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 11: {
                var3_1 /* !! */  = (int)ph.kyog("kyps", kyod(int ), (int)24);
                if (!var4) break;
                throw null;
            }
            case 12: 
        }
        var3_1 /* !! */  = (int)ph.kyog("kypt", kyod(int ), (int)25);
        ** while (!var4)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kytg() {
        ph.kyof[100] = 1540511664;
        ph.kyof[101] = -867389323;
        ph.kyof[102] = 301625931;
        ph.kyof[103] = -1427355303;
    }

    private static /* synthetic */ void kyte() {
        ph.kyoe[100] = 1540511668;
        ph.kyoe[101] = -867389324;
        ph.kyoe[102] = 301625931;
        ph.kyoe[103] = -1427355300;
    }

    static {
        kyoe = new int[104];
        kyof = new int[104];
        ph.kytd();
        ph.kyte();
        ph.kytf();
        ph.kytg();
        kyol = new long[19];
        kyom = new long[19];
        ph.kyth();
        ph.kyti();
        INSTANCE = ph.load();
    }

    private static /* synthetic */ void kytf() {
        ph.kyof[0] = -1977708594;
        ph.kyof[1] = 1401182238;
        ph.kyof[2] = 675141547;
        ph.kyof[3] = 1206054881;
        ph.kyof[4] = 441929320;
        ph.kyof[5] = -1696698510;
        ph.kyof[6] = -1564748992;
        ph.kyof[7] = -929486979;
        ph.kyof[8] = 554940385;
        ph.kyof[9] = 244579235;
        ph.kyof[10] = 220497050;
        ph.kyof[11] = 1623432713;
        ph.kyof[12] = 1716491162;
        ph.kyof[13] = 1293931955;
        ph.kyof[14] = -1540892997;
        ph.kyof[15] = 651209501;
        ph.kyof[16] = 1438695669;
        ph.kyof[17] = -233797588;
        ph.kyof[18] = 827583163;
        ph.kyof[19] = 1963448834;
        ph.kyof[20] = 1020036971;
        ph.kyof[21] = -370656837;
        ph.kyof[22] = 1230573606;
        ph.kyof[23] = -1189910424;
        ph.kyof[24] = 935370704;
        ph.kyof[25] = 1236054417;
        ph.kyof[26] = -1123427838;
        ph.kyof[27] = 1345282726;
        ph.kyof[28] = -1260318924;
        ph.kyof[29] = -1421086736;
        ph.kyof[30] = 1202883995;
        ph.kyof[31] = 1760162832;
        ph.kyof[32] = -1706381934;
        ph.kyof[33] = -1271888626;
        ph.kyof[34] = -192743020;
        ph.kyof[35] = -421531013;
        ph.kyof[36] = -1203559170;
        ph.kyof[37] = -58068417;
        ph.kyof[38] = 1691757118;
        ph.kyof[39] = -793240064;
        ph.kyof[40] = 422391834;
        ph.kyof[41] = -1252558510;
        ph.kyof[42] = 558927660;
        ph.kyof[43] = -332654336;
        ph.kyof[44] = -1679963186;
        ph.kyof[45] = -750387654;
        ph.kyof[46] = 1849845254;
        ph.kyof[47] = -346399639;
        ph.kyof[48] = 128340023;
        ph.kyof[49] = 1113054960;
        ph.kyof[50] = -733643107;
        ph.kyof[51] = 1888267318;
        ph.kyof[52] = -701324065;
        ph.kyof[53] = -1269308008;
        ph.kyof[54] = -1108693952;
        ph.kyof[55] = 1448267836;
        ph.kyof[56] = 899286063;
        ph.kyof[57] = 1485224162;
        ph.kyof[58] = -742623155;
        ph.kyof[59] = 1099535650;
        ph.kyof[60] = -403439071;
        ph.kyof[61] = 939814579;
        ph.kyof[62] = -1776162294;
        ph.kyof[63] = -169715280;
        ph.kyof[64] = 1017825849;
        ph.kyof[65] = -160553725;
        ph.kyof[66] = -1576699979;
        ph.kyof[67] = 603958349;
        ph.kyof[68] = 903792821;
        ph.kyof[69] = 1531036936;
        ph.kyof[70] = -288262951;
        ph.kyof[71] = 645905602;
        ph.kyof[72] = 1086272259;
        ph.kyof[73] = -1122478956;
        ph.kyof[74] = -1684762142;
        ph.kyof[75] = 429237828;
        ph.kyof[76] = -1375853710;
        ph.kyof[77] = 1038711227;
        ph.kyof[78] = -751419149;
        ph.kyof[79] = -480324176;
        ph.kyof[80] = 918436908;
        ph.kyof[81] = -1248783176;
        ph.kyof[82] = 1171002359;
        ph.kyof[83] = -1573777385;
        ph.kyof[84] = 1841497444;
        ph.kyof[85] = 1207571472;
        ph.kyof[86] = 1553885174;
        ph.kyof[87] = -839262851;
        ph.kyof[88] = -1819510069;
        ph.kyof[89] = -825311631;
        ph.kyof[90] = -1131145754;
        ph.kyof[91] = 465729686;
        ph.kyof[92] = 313169566;
        ph.kyof[93] = -1568631382;
        ph.kyof[94] = 838203115;
        ph.kyof[95] = -857958852;
        ph.kyof[96] = -719664976;
        ph.kyof[97] = 1903833454;
        ph.kyof[98] = -710935264;
        ph.kyof[99] = 971541036;
    }

    private static /* synthetic */ void kyti() {
        ph.kyom[0] = 7325815652638695614L;
        ph.kyom[1] = 3943167225779293407L;
        ph.kyom[2] = 865616615435686661L;
        ph.kyom[3] = -3307634854653024678L;
        ph.kyom[4] = -1807931063625443253L;
        ph.kyom[5] = 3999890640058103158L;
        ph.kyom[6] = 2454362786040606146L;
        ph.kyom[7] = 7732906017798337675L;
        ph.kyom[8] = -3501509610331134573L;
        ph.kyom[9] = 4782632693956142671L;
        ph.kyom[10] = 8421703776342897065L;
        ph.kyom[11] = 8251821426854165575L;
        ph.kyom[12] = 1317920759294787407L;
        ph.kyom[13] = 2232846152895595457L;
        ph.kyom[14] = 7562385100498129680L;
        ph.kyom[15] = -2787947586327527740L;
        ph.kyom[16] = -5593029851964452642L;
        ph.kyom[17] = 2635595774974071869L;
        ph.kyom[18] = 3827890888988110346L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean is64Bit() {
        v0 /* !! */  = ph.tl;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(ph.kyog("kysg", kyok(int ), (int)11) - ph.kyog("kysf", kyok(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1164645717: {
                    continue block17;
                }
                case 1879199632: {
                    break block17;
                }
            }
            break;
        }
        var3 = ph.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ph.tl - ph.kyog("kysh", kyok(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ph.kyog("kysi", kyod(int ), (int)89)) break;
            v1 /* !! */  = (long)ph.kyog("kysj", kyod(int ), (int)90);
        }
        var2_1 /* !! */  = ph.b;
        v2 /* !! */  = ph.tl;
        if (true) ** GOTO lbl21
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - ph.kyog("kysk", kyok(int ), (int)13));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1728984143: {
                    v3 = ph.kyog("kysl", kyok(int ), (int)14);
                    continue block19;
                }
                case 707861129: {
                    v3 = ph.kyog("kysm", kyok(int ), (int)15);
                    continue block19;
                }
                case 1879199632: {
                    break block19;
                }
            }
            break;
        }
        var1_2 = ph.a;
        if (var3) {
            throw null;
lbl33:
            // 3 sources

            return (boolean)ph.kyog("kysn", kyod(int ), (int)91);
        }
        if (var1_2 || var1_2) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ph.tl - ph.kyog("kyso", kyok(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ph.kyog("kysp", kyod(int ), (int)92)) break;
            v4 /* !! */  = (long)ph.kyog("kysq", kyod(int ), (int)93);
        }
        v5 = System.getProperty("os.arch", "");
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ph.tl - ph.kyog("kysr", kyok(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ph.kyog("kyss", kyod(int ), (int)94)) break;
            v6 /* !! */  = (long)ph.kyog("kyst", kyod(int ), (int)95);
        }
        var0_3 = v5.toLowerCase();
        if (var1_2) ** GOTO lbl33
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_2) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ph.tl - ph.kyog("kysu", kyok(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ph.kyog("kysv", kyod(int ), (int)96)) break;
                    v7 /* !! */  = (long)ph.kyog("kysw", kyod(int ), (int)97);
                }
                return var0_3.contains("64");
            }
lbl60:
            // 2 sources

            case 0: {
                do {
                    var2_1 /* !! */  = (int)ph.kyog("kysx", kyod(int ), (int)98);
                } while (!var3);
                throw null;
            }
lbl65:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ph.kyog("kysy", kyod(int ), (int)99);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ph.kyog("kysz", kyod(int ), (int)100);
                    if (!var3) break block9;
                    throw null;
                }
            }
lbl75:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)ph.kyog("kyta", kyod(int ), (int)101);
                if (!var3) ** GOTO lbl60
                throw null;
            }
            case 4: {
                var2_1 /* !! */  = (int)ph.kyog("kytb", kyod(int ), (int)102);
                if (!var3) ** GOTO lbl65
                throw null;
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)ph.kyog("kytc", kyod(int ), (int)103);
        ** while (!var3)
lbl86:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite kyog(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

