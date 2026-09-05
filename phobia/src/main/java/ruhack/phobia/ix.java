/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public class ix
extends ds {
    public final kf mode;
    public final kg custom;
    public static final boolean a;
    public static final long cm = 6029667938296132313L;
    public static final boolean c;
    private static int[] ateg;
    private static int[] atef;
    private static long[] atet;
    public static final int b;
    private static long[] ateu;

    private static /* synthetic */ void atid() {
        ix.ateg[0] = -1998869783;
        ix.ateg[1] = 528324475;
        ix.ateg[2] = 2070755930;
        ix.ateg[3] = 1964239869;
        ix.ateg[4] = 256919318;
        ix.ateg[5] = 1185287950;
        ix.ateg[6] = 551030589;
        ix.ateg[7] = 69124254;
        ix.ateg[8] = -1826990480;
        ix.ateg[9] = -1955383931;
        ix.ateg[10] = -1942465911;
        ix.ateg[11] = 1029059252;
        ix.ateg[12] = -1890453355;
        ix.ateg[13] = -656347644;
        ix.ateg[14] = -1257759031;
        ix.ateg[15] = -162791686;
        ix.ateg[16] = -3915952;
        ix.ateg[17] = 1638513193;
        ix.ateg[18] = 175923838;
        ix.ateg[19] = -1206439724;
        ix.ateg[20] = -518569495;
        ix.ateg[21] = 1369950022;
        ix.ateg[22] = -1965834975;
        ix.ateg[23] = 1902950008;
        ix.ateg[24] = 783653641;
        ix.ateg[25] = 421907272;
        ix.ateg[26] = -129356240;
        ix.ateg[27] = -761010558;
        ix.ateg[28] = -961056279;
        ix.ateg[29] = 1148970568;
        ix.ateg[30] = 1936560620;
        ix.ateg[31] = 900884638;
        ix.ateg[32] = 805315778;
        ix.ateg[33] = 1070862369;
        ix.ateg[34] = -1398587044;
        ix.ateg[35] = -1115361479;
        ix.ateg[36] = -204664208;
        ix.ateg[37] = -582005950;
        ix.ateg[38] = 555298456;
        ix.ateg[39] = -289580934;
        ix.ateg[40] = 1899289169;
        ix.ateg[41] = 1405792452;
        ix.ateg[42] = 401998147;
        ix.ateg[43] = 2021485171;
        ix.ateg[44] = 411055731;
        ix.ateg[45] = -1461671490;
        ix.ateg[46] = -1882196136;
        ix.ateg[47] = 1252302483;
        ix.ateg[48] = -1892428819;
        ix.ateg[49] = 364112344;
        ix.ateg[50] = -559247830;
        ix.ateg[51] = -497373089;
        ix.ateg[52] = 1765068173;
        ix.ateg[53] = -388563170;
        ix.ateg[54] = 1547122597;
        ix.ateg[55] = -47717535;
        ix.ateg[56] = 1307028659;
        ix.ateg[57] = -1183020266;
        ix.ateg[58] = 1997905881;
        ix.ateg[59] = -243846048;
        ix.ateg[60] = 331617404;
        ix.ateg[61] = -834045677;
        ix.ateg[62] = 1184122553;
        ix.ateg[63] = -2140280368;
        ix.ateg[64] = -2016052446;
        ix.ateg[65] = -2084096116;
        ix.ateg[66] = -884763231;
        ix.ateg[67] = 907394380;
        ix.ateg[68] = 247245173;
        ix.ateg[69] = 694520119;
        ix.ateg[70] = 374467441;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ix getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ix.cm - ix.ateh("atev", ates(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ix.ateh("atew", atel(int ), (int)9)) break;
            v0 /* !! */  = (long)ix.ateh("atex", atel(int ), (int)10);
        }
        var2 = ix.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ix.cm - ix.ateh("atey", ates(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ix.ateh("atez", atel(int ), (int)11)) break;
            v1 /* !! */  = (long)ix.ateh("atfa", atel(int ), (int)12);
        }
        var1_1 = ix.b;
        v2 /* !! */  = ix.cm;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - ix.ateh("atfb", ates(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1064988130: {
                    v3 = ix.ateh("atfc", ates(int ), (int)3);
                    continue block11;
                }
                case 397669081: {
                    break block11;
                }
                case 1170865231: {
                    v3 = ix.ateh("atfd", ates(int ), (int)4);
                    continue block11;
                }
            }
            break;
        }
        var0_2 = ix.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        v4 /* !! */  = ix.cm;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(ix.ateh("atff", ates(int ), (int)6) - ix.ateh("atfe", ates(int ), (int)5));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 397669081: {
                    break block13;
                }
                case 1799938236: {
                    continue block13;
                }
            }
            break;
        }
        return nj.get(ix.class);
    }

    private static /* synthetic */ int atel(int n2) {
        return atef[n2] ^ ateg[n2];
    }

    private static /* synthetic */ void atic() {
        ix.atef[0] = -1256757724;
        ix.atef[1] = 1608357755;
        ix.atef[2] = 1185019543;
        ix.atef[3] = 1964239868;
        ix.atef[4] = 256919318;
        ix.atef[5] = 1185287948;
        ix.atef[6] = 551030584;
        ix.atef[7] = 69124250;
        ix.atef[8] = -1826990476;
        ix.atef[9] = 1955383930;
        ix.atef[10] = -1589644417;
        ix.atef[11] = 1029059253;
        ix.atef[12] = 1926085327;
        ix.atef[13] = -656347641;
        ix.atef[14] = -1257759030;
        ix.atef[15] = -162791687;
        ix.atef[16] = -3915951;
        ix.atef[17] = 1566036873;
        ix.atef[18] = -175923839;
        ix.atef[19] = -1206439724;
        ix.atef[20] = -518569496;
        ix.atef[21] = 1369950020;
        ix.atef[22] = -1965834974;
        ix.atef[23] = 1321606355;
        ix.atef[24] = 290854192;
        ix.atef[25] = 652806021;
        ix.atef[26] = -129356271;
        ix.atef[27] = -761010552;
        ix.atef[28] = -961056277;
        ix.atef[29] = 1148970605;
        ix.atef[30] = 1936560628;
        ix.atef[31] = 900884636;
        ix.atef[32] = 805315803;
        ix.atef[33] = 1070862396;
        ix.atef[34] = -1398587041;
        ix.atef[35] = -1115361505;
        ix.atef[36] = -204664234;
        ix.atef[37] = -582005938;
        ix.atef[38] = 555298490;
        ix.atef[39] = -289580953;
        ix.atef[40] = 1899289155;
        ix.atef[41] = 1405792458;
        ix.atef[42] = 401998178;
        ix.atef[43] = 2021485183;
        ix.atef[44] = 411055717;
        ix.atef[45] = -1461671523;
        ix.atef[46] = -1882196149;
        ix.atef[47] = 1252302465;
        ix.atef[48] = -1892428849;
        ix.atef[49] = 364112331;
        ix.atef[50] = -559247813;
        ix.atef[51] = -497373090;
        ix.atef[52] = 1765068178;
        ix.atef[53] = -388563183;
        ix.atef[54] = 1547122596;
        ix.atef[55] = -47717512;
        ix.atef[56] = 1307028647;
        ix.atef[57] = -1183020269;
        ix.atef[58] = 1997905873;
        ix.atef[59] = -243846025;
        ix.atef[60] = 331617390;
        ix.atef[61] = -834045670;
        ix.atef[62] = 1184122523;
        ix.atef[63] = -2140280359;
        ix.atef[64] = -2016052444;
        ix.atef[65] = -2084096115;
        ix.atef[66] = 1536235672;
        ix.atef[67] = 907394383;
        ix.atef[68] = 247245173;
        ix.atef[69] = 694520116;
        ix.atef[70] = 374467440;
    }

    private static /* synthetic */ long ates(int n2) {
        return atet[n2] ^ ateu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ix.cm - ix.ateh("athg", ates(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ix.ateh("athh", atel(int ), (int)65)) break;
            v0 /* !! */  = (long)ix.ateh("athi", atel(int ), (int)66);
        }
        var3_1 = ix.c;
        v1 /* !! */  = ix.cm;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - ix.ateh("athj", ates(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2121547556: {
                    v2 = ix.ateh("athk", ates(int ), (int)9);
                    continue block26;
                }
                case -601431197: {
                    v2 = ix.ateh("athl", ates(int ), (int)10);
                    continue block26;
                }
                case 397669081: {
                    break block26;
                }
            }
            break;
        }
        var2_2 = ix.b;
        v3 /* !! */  = ix.cm;
        if (true) ** GOTO lbl26
        block27: while (true) {
            v3 /* !! */  = (long)(ix.ateh("athn", ates(int ), (int)12) - ix.ateh("athm", ates(int ), (int)11));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 397669081: {
                    break block27;
                }
                case 1008557726: {
                    continue block27;
                }
            }
            break;
        }
        var1_3 = ix.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = ix.cm;
        if (true) ** GOTO lbl41
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - ix.ateh("atho", ates(int ), (int)13));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -617873838: {
                    v5 = ix.ateh("athp", ates(int ), (int)14);
                    continue block29;
                }
                case 397669081: {
                    break block29;
                }
                case 937506742: {
                    v5 = ix.ateh("athq", ates(int ), (int)15);
                    continue block29;
                }
                case 1558141742: {
                    v5 = ix.ateh("athr", ates(int ), (int)16);
                    continue block29;
                }
            }
            break;
        }
        v6 /* !! */  = ix.cm;
        if (true) ** GOTO lbl57
        block30: while (true) {
            v6 /* !! */  = (long)(v7 - ix.ateh("aths", ates(int ), (int)17));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -368470941: {
                    v7 = ix.ateh("atht", ates(int ), (int)18);
                    continue block30;
                }
                case 397669081: {
                    break block30;
                }
                case 857602327: {
                    v7 = ix.ateh("athu", ates(int ), (int)19);
                    continue block30;
                }
            }
            break;
        }
        v8 = this.mode.isSelected("\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u043e\u0435");
        v9 /* !! */  = ix.cm;
        if (true) ** GOTO lbl71
        block31: while (true) {
            v9 /* !! */  = (long)(v10 - ix.ateh("athv", ates(int ), (int)20));
lbl71:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 397669081: {
                    break block31;
                }
                case 1155997550: {
                    v10 = ix.ateh("athw", ates(int ), (int)21);
                    continue block31;
                }
                case 1879924188: {
                    v10 = ix.ateh("athx", ates(int ), (int)22);
                    continue block31;
                }
            }
            break;
        }
        return v8;
    }

    public static /* synthetic */ CallSite ateh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void atif() {
        ix.ateu[0] = -5326837790298207602L;
        ix.ateu[1] = -2888513856209937532L;
        ix.ateu[2] = -2034293135752264745L;
        ix.ateu[3] = 241161513859216313L;
        ix.ateu[4] = 5041755620617835943L;
        ix.ateu[5] = -6307684055709161592L;
        ix.ateu[6] = -1296239649757172835L;
        ix.ateu[7] = 6189007789599912479L;
        ix.ateu[8] = 4462412091402271762L;
        ix.ateu[9] = -3883816184641791586L;
        ix.ateu[10] = -1169164204088901301L;
        ix.ateu[11] = 6906634160068868484L;
        ix.ateu[12] = 3343388589644887029L;
        ix.ateu[13] = 8845556246795222768L;
        ix.ateu[14] = 9168972292018656948L;
        ix.ateu[15] = 249003391855880014L;
        ix.ateu[16] = -8760898843842894871L;
        ix.ateu[17] = 364454503733388996L;
        ix.ateu[18] = 3888123726229906739L;
        ix.ateu[19] = 558227555083760974L;
        ix.ateu[20] = -7077503233754382536L;
        ix.ateu[21] = -1651703736549864919L;
        ix.ateu[22] = 2249913715610154404L;
    }

    /*
     * Exception decompiling
     */
    public float getRatio() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.IllegalStateException: Backjump on non jumping statement @NONE, blocks:[0, 6] lbl51 : CaseStatement: default:
         * 
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
         *     at org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:550)
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

    private static /* synthetic */ void atie() {
        ix.atet[0] = -1356285381560320013L;
        ix.atet[1] = -2670401944337410736L;
        ix.atet[2] = 2488769652754677025L;
        ix.atet[3] = 5408974337482132914L;
        ix.atet[4] = 1524058604152886412L;
        ix.atet[5] = -8924672460327994034L;
        ix.atet[6] = -2675882251271078178L;
        ix.atet[7] = -8452847677561479044L;
        ix.atet[8] = -8650333847615585549L;
        ix.atet[9] = -181495641165566916L;
        ix.atet[10] = 2482218704474709195L;
        ix.atet[11] = -2489126361365803335L;
        ix.atet[12] = 6101668391406920178L;
        ix.atet[13] = -5275421376855528172L;
        ix.atet[14] = -1540960798358499101L;
        ix.atet[15] = 3622448166139489530L;
        ix.atet[16] = 2086575880866427284L;
        ix.atet[17] = 6819028940092719135L;
        ix.atet[18] = -5155275832276591390L;
        ix.atet[19] = 5843050933509725632L;
        ix.atet[20] = -7281421231469651374L;
        ix.atet[21] = -1174282100715560349L;
        ix.atet[22] = 342137071214620798L;
    }

    static {
        atef = new int[71];
        ateg = new int[71];
        ix.atic();
        ix.atid();
        atet = new long[23];
        ateu = new long[23];
        ix.atie();
        ix.atif();
    }

    private static /* synthetic */ float atee(int n2) {
        return Float.intBitsToFloat(atef[n2] ^ ateg[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ix() {
        var2_1 /* !! */  = ix.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("AspectRatio", "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0441\u043e\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u0441\u0442\u043e\u0440\u043e\u043d \u043f\u0435\u0440\u0441\u043f\u0435\u043a\u0442\u0438\u0432\u044b", du.RENDER);
                this.mode = new kf("\u0421\u043e\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435", "\u0424\u043e\u0440\u043c\u0430\u0442 \u0438\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f", "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u043e\u0435", new String[]{"4:3", "16:9", "1:1", "16:10", "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u043e\u0435"});
                this.custom = new kg("\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435", "\u0421\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0435 \u0441\u043e\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u0441\u0442\u043e\u0440\u043e\u043d", 1.0f).range((float)ix.ateh("atei", atee(int ), (int)0), (float)ix.ateh("atej", atee(int ), (int)1)).step((float)ix.ateh("atek", atee(int ), (int)2)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((ix)this));
                this.settings(new jx[]{this.mode, this.custom});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ix.ateh("atem", atel(int ), (int)3);
                ** GOTO lbl22
            }
lbl13:
            // 2 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)ix.ateh("aten", atel(int ), (int)4);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)ix.ateh("ateo", atel(int ), (int)5);
            }
            case 3: {
                var2_1 /* !! */  = (int)ix.ateh("atep", atel(int ), (int)6);
                ** GOTO lbl13
            }
lbl22:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ix.ateh("ateq", atel(int ), (int)7);
                    continue;
                    break;
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)ix.ateh("ater", atel(int ), (int)8);
        ** while (true)
    }
}

