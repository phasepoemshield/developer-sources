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
import ruhack.phobia.bh;
import ruhack.phobia.cr;
import ruhack.phobia.d;
import ruhack.phobia.df;
import ruhack.phobia.dg;

public class bf
implements bh {
    private static int[] dwdc = new int[64];
    public static final int b;
    private static int[] dwdd;
    public static int selectedSlot;
    private static long[] dwcw;
    public static final boolean a;
    public static final boolean c;
    private static long[] dwcv;
    static final long jl = -7022174967741948281L;
    public static boolean serverSprint;

    private static /* synthetic */ void dwgy() {
        bf.dwdd[0] = -867285912;
        bf.dwdd[1] = -1779220814;
        bf.dwdd[2] = -852193861;
        bf.dwdd[3] = -1851072974;
        bf.dwdd[4] = 913593251;
        bf.dwdd[5] = -198582854;
        bf.dwdd[6] = -1987323601;
        bf.dwdd[7] = -1246119362;
        bf.dwdd[8] = 2051321731;
        bf.dwdd[9] = 508404861;
        bf.dwdd[10] = 282818324;
        bf.dwdd[11] = -2137544282;
        bf.dwdd[12] = 548099483;
        bf.dwdd[13] = 89012670;
        bf.dwdd[14] = 1267654956;
        bf.dwdd[15] = -689949638;
        bf.dwdd[16] = -1212561039;
        bf.dwdd[17] = -1228741091;
        bf.dwdd[18] = 1776215481;
        bf.dwdd[19] = 2041605559;
        bf.dwdd[20] = 1653626454;
        bf.dwdd[21] = 1297042740;
        bf.dwdd[22] = 10928701;
        bf.dwdd[23] = -1427962747;
        bf.dwdd[24] = 411950833;
        bf.dwdd[25] = -1789232098;
        bf.dwdd[26] = 862155784;
        bf.dwdd[27] = 174124054;
        bf.dwdd[28] = 2015289544;
        bf.dwdd[29] = -1766836308;
        bf.dwdd[30] = -701816407;
        bf.dwdd[31] = 606567240;
        bf.dwdd[32] = 2060860622;
        bf.dwdd[33] = -944546971;
        bf.dwdd[34] = -1959975007;
        bf.dwdd[35] = -651719411;
        bf.dwdd[36] = -487492289;
        bf.dwdd[37] = 1437115597;
        bf.dwdd[38] = 400145498;
        bf.dwdd[39] = -77363379;
        bf.dwdd[40] = -1065192272;
        bf.dwdd[41] = 1053585130;
        bf.dwdd[42] = 1548443479;
        bf.dwdd[43] = -72586230;
        bf.dwdd[44] = 1300640353;
        bf.dwdd[45] = -1257627133;
        bf.dwdd[46] = 712738731;
        bf.dwdd[47] = 1253857477;
        bf.dwdd[48] = 1020315605;
        bf.dwdd[49] = 273963946;
        bf.dwdd[50] = 91178415;
        bf.dwdd[51] = 40835104;
        bf.dwdd[52] = 355257252;
        bf.dwdd[53] = 1510544125;
        bf.dwdd[54] = -635450385;
        bf.dwdd[55] = 1690282436;
        bf.dwdd[56] = 160761231;
        bf.dwdd[57] = -1883423448;
        bf.dwdd[58] = -28520491;
        bf.dwdd[59] = 1199552045;
        bf.dwdd[60] = -1009398314;
        bf.dwdd[61] = -265694523;
        bf.dwdd[62] = 1865315280;
        bf.dwdd[63] = 2033376722;
    }

    public static /* synthetic */ CallSite dwcx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dwdd = new int[64];
        bf.dwgx();
        bf.dwgy();
        dwcv = new long[36];
        dwcw = new long[36];
        bf.dwgz();
        bf.dwha();
    }

    private static /* synthetic */ long dwcu(int n2) {
        return dwcv[n2] ^ dwcw[n2];
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onPacket(cr var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 8[SWITCH]
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

    private static /* synthetic */ int dwdb(int n2) {
        return dwdc[n2] ^ dwdd[n2];
    }

    private static /* synthetic */ void dwha() {
        bf.dwcw[0] = -7403554326799097928L;
        bf.dwcw[1] = 4757269525575615723L;
        bf.dwcw[2] = 5481677485873396166L;
        bf.dwcw[3] = -2323828784645248570L;
        bf.dwcw[4] = -8808693837464323021L;
        bf.dwcw[5] = -1677493150407474701L;
        bf.dwcw[6] = -3441018122155747658L;
        bf.dwcw[7] = -1273168966439999183L;
        bf.dwcw[8] = 2007425793289951020L;
        bf.dwcw[9] = -368394524109820909L;
        bf.dwcw[10] = -1597730573043339583L;
        bf.dwcw[11] = 9165141582136204862L;
        bf.dwcw[12] = -5356735545802630499L;
        bf.dwcw[13] = -6013025971309740463L;
        bf.dwcw[14] = -1318688128394358749L;
        bf.dwcw[15] = -3968004865501996753L;
        bf.dwcw[16] = -2820116599430816621L;
        bf.dwcw[17] = 5818552951209233083L;
        bf.dwcw[18] = 8280068223624028263L;
        bf.dwcw[19] = 7560553123776659938L;
        bf.dwcw[20] = 7756683449748430080L;
        bf.dwcw[21] = 6448689581909295327L;
        bf.dwcw[22] = 1713256088438044802L;
        bf.dwcw[23] = 5232234249072319483L;
        bf.dwcw[24] = 2030121428084262672L;
        bf.dwcw[25] = 4314679062046986186L;
        bf.dwcw[26] = -514087928627883750L;
        bf.dwcw[27] = -384681619303280921L;
        bf.dwcw[28] = -6132341699340223508L;
        bf.dwcw[29] = -8669970913644780412L;
        bf.dwcw[30] = 8768524865579620034L;
        bf.dwcw[31] = -5616910385746841113L;
        bf.dwcw[32] = 5861753660279277841L;
        bf.dwcw[33] = -4053732718559807157L;
        bf.dwcw[34] = 4046148159677990683L;
        bf.dwcw[35] = 4150818492135864305L;
    }

    public bf() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block78: {
            v0 /* !! */  = bf.jl;
            if (true) ** GOTO lbl5
            block52: while (true) {
                v0 /* !! */  = (long)(bf.dwcx("dwcz", dwcu(int ), (int)1) - bf.dwcx("dwcy", dwcu(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 700324281: {
                        continue block52;
                    }
                    case 1763303047: {
                        break block52;
                    }
                }
                break;
            }
            var4_2 = bf.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = bf.jl - bf.dwcx("dwda", dwcu(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == bf.dwcx("dwde", dwdb(int ), (int)0)) break;
                v1 /* !! */  = (long)bf.dwcx("dwdf", dwdb(int ), (int)1);
            }
            var3_3 /* !! */  = bf.b;
            v2 /* !! */  = bf.jl;
            if (true) ** GOTO lbl21
            block54: while (true) {
                v2 /* !! */  = (long)(v3 - bf.dwcx("dwdg", dwcu(int ), (int)3));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1459331574: {
                        v3 = bf.dwcx("dwdh", dwcu(int ), (int)4);
                        continue block54;
                    }
                    case -513584951: {
                        v3 = bf.dwcx("dwdi", dwcu(int ), (int)5);
                        continue block54;
                    }
                    case -24479337: {
                        v3 = bf.dwcx("dwdj", dwcu(int ), (int)6);
                        continue block54;
                    }
                    case 1763303047: {
                        break block54;
                    }
                }
                break;
            }
            var2_4 = bf.a;
            if (var4_2) {
                throw null;
lbl36:
                // 6 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = bf.jl - bf.dwcx("dwdk", dwcu(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == bf.dwcx("dwdl", dwdb(int ), (int)2)) break;
                v4 /* !! */  = (long)bf.dwcx("dwdm", dwdb(int ), (int)3);
            }
            v5 = d.getInstance();
            v6 /* !! */  = bf.jl;
            if (true) ** GOTO lbl49
            block57: while (true) {
                v6 /* !! */  = (long)(bf.dwcx("dwdo", dwcu(int ), (int)9) - bf.dwcx("dwdn", dwcu(int ), (int)8));
lbl49:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 344910235: {
                        continue block57;
                    }
                    case 1763303047: {
                        break block57;
                    }
                }
                break;
            }
            v7 = v5.getManager();
            v8 /* !! */  = bf.jl;
            if (true) ** GOTO lbl59
            block58: while (true) {
                v8 /* !! */  = (long)(v9 - bf.dwcx("dwdp", dwcu(int ), (int)10));
lbl59:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1975338536: {
                        v9 = bf.dwcx("dwdq", dwcu(int ), (int)11);
                        continue block58;
                    }
                    case 233768061: {
                        v9 = bf.dwcx("dwdr", dwcu(int ), (int)12);
                        continue block58;
                    }
                    case 714147630: {
                        v9 = bf.dwcx("dwds", dwcu(int ), (int)13);
                        continue block58;
                    }
                    case 1763303047: {
                        break block58;
                    }
                }
                break;
            }
            if (v7.getHudManager() == null) break block78;
            if (var2_4 || var2_4) ** GOTO lbl36
            v10 /* !! */  = bf.jl;
            if (true) ** GOTO lbl77
            block59: while (true) {
                v10 /* !! */  = (long)(v11 - bf.dwcx("dwdt", dwcu(int ), (int)14));
lbl77:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1812305013: {
                        v11 = bf.dwcx("dwdu", dwcu(int ), (int)15);
                        continue block59;
                    }
                    case 410214796: {
                        v11 = bf.dwcx("dwdv", dwcu(int ), (int)16);
                        continue block59;
                    }
                    case 1763303047: {
                        break block59;
                    }
                }
                break;
            }
            v12 = d.getInstance();
            v13 /* !! */  = bf.jl;
            if (true) ** GOTO lbl91
            block60: while (true) {
                v13 /* !! */  = (long)(bf.dwcx("dwdx", dwcu(int ), (int)18) - bf.dwcx("dwdw", dwcu(int ), (int)17));
lbl91:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1824904738: {
                        continue block60;
                    }
                    case 1763303047: {
                        break block60;
                    }
                }
                break;
            }
            v14 = v12.getManager();
            v15 /* !! */  = bf.jl;
            if (true) ** GOTO lbl101
            block61: while (true) {
                v15 /* !! */  = (long)(v16 - bf.dwcx("dwdy", dwcu(int ), (int)19));
lbl101:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1288644254: {
                        v16 = bf.dwcx("dwdz", dwcu(int ), (int)20);
                        continue block61;
                    }
                    case 681625475: {
                        v16 = bf.dwcx("dwea", dwcu(int ), (int)21);
                        continue block61;
                    }
                    case 1763303047: {
                        break block61;
                    }
                }
                break;
            }
            v17 = v14.getHudManager();
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_2 = bf.jl - bf.dwcx("dweb", dwcu(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == bf.dwcx("dwec", dwdb(int ), (int)4)) break;
                v18 /* !! */  = (long)bf.dwcx("dwed", dwdb(int ), (int)5);
            }
            v17.tick();
            if (var2_4) ** GOTO lbl36
        }
        if (var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl36
                v19 /* !! */  = bf.jl;
                if (true) ** GOTO lbl128
                block63: while (true) {
                    v19 /* !! */  = (long)(v20 - bf.dwcx("dwee", dwcu(int ), (int)23));
lbl128:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -113402302: {
                            v20 = bf.dwcx("dwef", dwcu(int ), (int)24);
                            continue block63;
                        }
                        case -24489859: {
                            v20 = bf.dwcx("dweg", dwcu(int ), (int)25);
                            continue block63;
                        }
                        case 1763303047: {
                            break block63;
                        }
                    }
                    break;
                }
                v21 = d.getInstance();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_3 = bf.jl - bf.dwcx("dweh", dwcu(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == bf.dwcx("dwei", dwdb(int ), (int)6)) break;
                    v22 /* !! */  = (long)bf.dwcx("dwej", dwdb(int ), (int)7);
                }
                v23 = v21.getManager();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_4 = bf.jl - bf.dwcx("dwek", dwcu(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == bf.dwcx("dwel", dwdb(int ), (int)8)) break;
                    v24 /* !! */  = (long)bf.dwcx("dwem", dwdb(int ), (int)9);
                }
                v25 = v23.getAttackPerpetrator();
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = bf.jl - bf.dwcx("dwen", dwcu(int ), (int)28)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == bf.dwcx("dweo", dwdb(int ), (int)10)) break;
                    v26 /* !! */  = (long)bf.dwcx("dwep", dwdb(int ), (int)11);
                }
                v25.tick();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)bf.dwcx("dweq", dwdb(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl164:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)bf.dwcx("dwer", dwdb(int ), (int)13);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl169:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)bf.dwcx("dwes", dwdb(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl174:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)bf.dwcx("dwet", dwdb(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl179:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)bf.dwcx("dweu", dwdb(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
            }
lbl183:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)bf.dwcx("dwev", dwdb(int ), (int)17);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)bf.dwcx("dwew", dwdb(int ), (int)18);
                    if (!var4_2) ** GOTO lbl169
                    throw null;
                }
            }
lbl193:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)bf.dwcx("dwex", dwdb(int ), (int)19);
                if (!var4_2) break;
                throw null;
            }
lbl197:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)bf.dwcx("dwey", dwdb(int ), (int)20);
                if (!var4_2) ** GOTO lbl164
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)bf.dwcx("dwez", dwdb(int ), (int)21);
                if (!var4_2) ** GOTO lbl197
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)bf.dwcx("dwfa", dwdb(int ), (int)22);
        ** while (!var4_2)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dwgz() {
        bf.dwcv[0] = -9213965128599626891L;
        bf.dwcv[1] = 8111594334638428532L;
        bf.dwcv[2] = 2271955661882065658L;
        bf.dwcv[3] = -3786975102158489213L;
        bf.dwcv[4] = 674438544747033619L;
        bf.dwcv[5] = -1949621759975926799L;
        bf.dwcv[6] = 2147445632094818083L;
        bf.dwcv[7] = -3689818349022954805L;
        bf.dwcv[8] = -1441766476332122620L;
        bf.dwcv[9] = -8096080377489169407L;
        bf.dwcv[10] = 8801526737500085011L;
        bf.dwcv[11] = 8075708804100657108L;
        bf.dwcv[12] = 9022041819971189266L;
        bf.dwcv[13] = -7606476174945853672L;
        bf.dwcv[14] = -1341781930232750341L;
        bf.dwcv[15] = -3059902995391200828L;
        bf.dwcv[16] = 6834823001501199335L;
        bf.dwcv[17] = -692291612644123178L;
        bf.dwcv[18] = -7132776717717382547L;
        bf.dwcv[19] = -2098323886712897731L;
        bf.dwcv[20] = 8478939042024426183L;
        bf.dwcv[21] = 3523450697947811280L;
        bf.dwcv[22] = -7978333492706435222L;
        bf.dwcv[23] = 9130156534324050072L;
        bf.dwcv[24] = -5267532316835227720L;
        bf.dwcv[25] = -3771685072302265817L;
        bf.dwcv[26] = -2065083455147801782L;
        bf.dwcv[27] = -4933185592675464884L;
        bf.dwcv[28] = 1138843317513735229L;
        bf.dwcv[29] = -507085218480237978L;
        bf.dwcv[30] = -4784434159636170335L;
        bf.dwcv[31] = 6071015427959589392L;
        bf.dwcv[32] = -7368973058770977121L;
        bf.dwcv[33] = 3491762133222617186L;
        bf.dwcv[34] = 6795357015003379144L;
        bf.dwcv[35] = -543526625422395167L;
    }

    private static /* synthetic */ void dwgx() {
        bf.dwdc[0] = 867285911;
        bf.dwdc[1] = -630581726;
        bf.dwdc[2] = 852193860;
        bf.dwdc[3] = -863283021;
        bf.dwdc[4] = 913593250;
        bf.dwdc[5] = 1758688330;
        bf.dwdc[6] = 1987323600;
        bf.dwdc[7] = 1639476928;
        bf.dwdc[8] = -2051321732;
        bf.dwdc[9] = -1723898596;
        bf.dwdc[10] = -282818325;
        bf.dwdc[11] = -835638941;
        bf.dwdc[12] = 548099483;
        bf.dwdc[13] = 89012667;
        bf.dwdc[14] = 1267654956;
        bf.dwdc[15] = -689949645;
        bf.dwdc[16] = -1212561034;
        bf.dwdc[17] = -1228741092;
        bf.dwdc[18] = 1776215483;
        bf.dwdc[19] = 2041605552;
        bf.dwdc[20] = 1653626452;
        bf.dwdc[21] = 1297042743;
        bf.dwdc[22] = 10928692;
        bf.dwdc[23] = -1427962747;
        bf.dwdc[24] = 411950832;
        bf.dwdc[25] = -1789232098;
        bf.dwdc[26] = 862155804;
        bf.dwdc[27] = 174124051;
        bf.dwdc[28] = 2015289548;
        bf.dwdc[29] = -1766836304;
        bf.dwdc[30] = -701816409;
        bf.dwdc[31] = 606567250;
        bf.dwdc[32] = 2060860636;
        bf.dwdc[33] = -944546949;
        bf.dwdc[34] = -1959974980;
        bf.dwdc[35] = -651719404;
        bf.dwdc[36] = -487492290;
        bf.dwdc[37] = 1437115612;
        bf.dwdc[38] = 400145495;
        bf.dwdc[39] = -77363384;
        bf.dwdc[40] = -1065192264;
        bf.dwdc[41] = 1053585124;
        bf.dwdc[42] = 1548443476;
        bf.dwdc[43] = -72586231;
        bf.dwdc[44] = 1300640372;
        bf.dwdc[45] = -1257627115;
        bf.dwdc[46] = 712738738;
        bf.dwdc[47] = 1253857483;
        bf.dwdc[48] = 1020315614;
        bf.dwdc[49] = 273963952;
        bf.dwdc[50] = 91178431;
        bf.dwdc[51] = 40835106;
        bf.dwdc[52] = 355257276;
        bf.dwdc[53] = 1510544102;
        bf.dwdc[54] = -635450400;
        bf.dwdc[55] = 1690282437;
        bf.dwdc[56] = 160761243;
        bf.dwdc[57] = -1883423440;
        bf.dwdc[58] = 28520490;
        bf.dwdc[59] = 446236608;
        bf.dwdc[60] = -1009398315;
        bf.dwdc[61] = -265694522;
        bf.dwdc[62] = 1865315281;
        bf.dwdc[63] = 2033376721;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onUsingItemEvent(dg var1_1) {
        while (true) {
            block27: {
                if ((v0 /* !! */  = (cfr_temp_1 = bf.jl - bf.dwcx("dwgk", dwcu(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != bf.dwcx("dwgl", dwdb(int ), (int)58)) break block27;
                var4_2 = bf.c;
                v1 /* !! */  = bf.jl;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)bf.dwcx("dwgm", dwdb(int ), (int)59);
        }
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - bf.dwcx("dwgn", dwcu(int ), (int)30));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1610131747: {
                    v2 = bf.dwcx("dwgo", dwcu(int ), (int)31);
                    continue block17;
                }
                case 1128860499: {
                    v2 = bf.dwcx("dwgp", dwcu(int ), (int)32);
                    continue block17;
                }
                case 1763303047: {
                    break block17;
                }
                case 1969152690: {
                    v2 = bf.dwcx("dwgq", dwcu(int ), (int)33);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = bf.b;
        v3 /* !! */  = bf.jl;
        block18: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -406395904: {
                    v3 /* !! */  = (long)(bf.dwcx("dwgs", dwcu(int ), (int)35) - bf.dwcx("dwgr", dwcu(int ), (int)34));
                    continue block18;
                }
                case 1763303047: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = bf.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4 || var2_4) {
            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block19: while (true) {
            block28: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)bf.dwcx("dwgv", dwdb(int ), (int)62);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block28;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)bf.dwcx("dwgw", dwdb(int ), (int)63);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)bf.dwcx("dwgt", dwdb(int ), (int)60);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl65
            }
            do {
                if (true) continue block19;
lbl65:
                // 2 sources

                var3_3 /* !! */  = (int)bf.dwcx("dwgu", dwdb(int ), (int)61);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }
}

