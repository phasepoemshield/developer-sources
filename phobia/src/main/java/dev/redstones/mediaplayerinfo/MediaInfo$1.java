/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Lambda
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mv={1, 9, 0}, k=3, xi=48, d1={"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "Ljava/awt/image/BufferedImage;", "invoke"})
final class MediaInfo$1
extends Lambda
implements Function0<BufferedImage> {
    public static final long mg = -7229205550860581089L;
    final /* synthetic */ MediaInfo this$0;
    private static int[] fjvw = new int[33];
    public static final boolean a;
    public static final boolean c;
    private static long[] fjwt;
    public static final int b;
    private static long[] fjws;
    private static int[] fjvx;

    private static /* synthetic */ int fjvv(int n2) {
        return fjvw[n2] ^ fjvx[n2];
    }

    /*
     * Exception decompiling
     */
    public final BufferedImage invoke() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 35[SWITCH]
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

    static {
        fjvx = new int[33];
        MediaInfo$1.fkaw();
        MediaInfo$1.fkbm();
        fjws = new long[24];
        fjwt = new long[24];
        MediaInfo$1.fkbs();
        MediaInfo$1.fkbu();
    }

    private static /* synthetic */ long fjwl(int n2) {
        return fjws[n2] ^ fjwt[n2];
    }

    private static /* synthetic */ void fkbm() {
        MediaInfo$1.fjvx[0] = 2039739154;
        MediaInfo$1.fjvx[1] = 64382773;
        MediaInfo$1.fjvx[2] = 717619874;
        MediaInfo$1.fjvx[3] = 353318515;
        MediaInfo$1.fjvx[4] = -514657350;
        MediaInfo$1.fjvx[5] = 1239305928;
        MediaInfo$1.fjvx[6] = 1667187861;
        MediaInfo$1.fjvx[7] = -97525461;
        MediaInfo$1.fjvx[8] = 1781239045;
        MediaInfo$1.fjvx[9] = -1478799225;
        MediaInfo$1.fjvx[10] = -1620743629;
        MediaInfo$1.fjvx[11] = -1984759276;
        MediaInfo$1.fjvx[12] = -754348666;
        MediaInfo$1.fjvx[13] = 1783679125;
        MediaInfo$1.fjvx[14] = 1337598293;
        MediaInfo$1.fjvx[15] = -1974654280;
        MediaInfo$1.fjvx[16] = 774770512;
        MediaInfo$1.fjvx[17] = 1315467387;
        MediaInfo$1.fjvx[18] = -704756921;
        MediaInfo$1.fjvx[19] = -949892643;
        MediaInfo$1.fjvx[20] = 433012702;
        MediaInfo$1.fjvx[21] = -738209089;
        MediaInfo$1.fjvx[22] = -2103824362;
        MediaInfo$1.fjvx[23] = 1745134446;
        MediaInfo$1.fjvx[24] = -1113555399;
        MediaInfo$1.fjvx[25] = 1277973844;
        MediaInfo$1.fjvx[26] = 343277611;
        MediaInfo$1.fjvx[27] = -834680553;
        MediaInfo$1.fjvx[28] = -872745707;
        MediaInfo$1.fjvx[29] = -257063173;
        MediaInfo$1.fjvx[30] = 1226014080;
        MediaInfo$1.fjvx[31] = -574510746;
        MediaInfo$1.fjvx[32] = 1001812695;
    }

    private static /* synthetic */ void fkbs() {
        MediaInfo$1.fjws[0] = 497126660701535755L;
        MediaInfo$1.fjws[1] = 8350888537889489866L;
        MediaInfo$1.fjws[2] = -4740871724647939191L;
        MediaInfo$1.fjws[3] = 8001941223814849142L;
        MediaInfo$1.fjws[4] = 3228302320674389544L;
        MediaInfo$1.fjws[5] = 3365094373198804581L;
        MediaInfo$1.fjws[6] = 2013788213802981535L;
        MediaInfo$1.fjws[7] = -8195944023240458010L;
        MediaInfo$1.fjws[8] = -4282707363366462899L;
        MediaInfo$1.fjws[9] = -7979004390628141427L;
        MediaInfo$1.fjws[10] = 8130215064266489682L;
        MediaInfo$1.fjws[11] = 7915866983022641153L;
        MediaInfo$1.fjws[12] = 800331033238669271L;
        MediaInfo$1.fjws[13] = 8231985277723890805L;
        MediaInfo$1.fjws[14] = 3143692554009800077L;
        MediaInfo$1.fjws[15] = 1496362171235361560L;
        MediaInfo$1.fjws[16] = -7033909175291774445L;
        MediaInfo$1.fjws[17] = -8424641097766483455L;
        MediaInfo$1.fjws[18] = 587498941033189150L;
        MediaInfo$1.fjws[19] = -3084424923128884489L;
        MediaInfo$1.fjws[20] = -7972629039828761822L;
        MediaInfo$1.fjws[21] = 6366749571980572276L;
        MediaInfo$1.fjws[22] = 5574617502406871911L;
        MediaInfo$1.fjws[23] = 7049483087956627698L;
    }

    public static /* synthetic */ CallSite fjvz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fkaw() {
        MediaInfo$1.fjvw[0] = 2039739154;
        MediaInfo$1.fjvw[1] = 64382775;
        MediaInfo$1.fjvw[2] = 717619872;
        MediaInfo$1.fjvw[3] = 353318515;
        MediaInfo$1.fjvw[4] = 514657349;
        MediaInfo$1.fjvw[5] = -1021121726;
        MediaInfo$1.fjvw[6] = -1667187862;
        MediaInfo$1.fjvw[7] = -17829611;
        MediaInfo$1.fjvw[8] = -1781239046;
        MediaInfo$1.fjvw[9] = -1446888115;
        MediaInfo$1.fjvw[10] = 1620743628;
        MediaInfo$1.fjvw[11] = -458705284;
        MediaInfo$1.fjvw[12] = -754348660;
        MediaInfo$1.fjvw[13] = 1783679126;
        MediaInfo$1.fjvw[14] = 1337598288;
        MediaInfo$1.fjvw[15] = -1974654273;
        MediaInfo$1.fjvw[16] = 774770523;
        MediaInfo$1.fjvw[17] = 1315467388;
        MediaInfo$1.fjvw[18] = -704756925;
        MediaInfo$1.fjvw[19] = -949892646;
        MediaInfo$1.fjvw[20] = 433012692;
        MediaInfo$1.fjvw[21] = -738209098;
        MediaInfo$1.fjvw[22] = -2103824355;
        MediaInfo$1.fjvw[23] = 1745134444;
        MediaInfo$1.fjvw[24] = -1113555408;
        MediaInfo$1.fjvw[25] = -1277973845;
        MediaInfo$1.fjvw[26] = 402904742;
        MediaInfo$1.fjvw[27] = -834680554;
        MediaInfo$1.fjvw[28] = 1640258201;
        MediaInfo$1.fjvw[29] = -257063175;
        MediaInfo$1.fjvw[30] = 1226014081;
        MediaInfo$1.fjvw[31] = -574510745;
        MediaInfo$1.fjvw[32] = 1001812694;
    }

    private static /* synthetic */ void fkbu() {
        MediaInfo$1.fjwt[0] = 1255442633792582174L;
        MediaInfo$1.fjwt[1] = -5608980282837468402L;
        MediaInfo$1.fjwt[2] = 2774237618417348747L;
        MediaInfo$1.fjwt[3] = 2631835624857963721L;
        MediaInfo$1.fjwt[4] = -4057606286806156133L;
        MediaInfo$1.fjwt[5] = 4520954060012899976L;
        MediaInfo$1.fjwt[6] = -470043130966117070L;
        MediaInfo$1.fjwt[7] = 2695439209867489496L;
        MediaInfo$1.fjwt[8] = 1154164743232933738L;
        MediaInfo$1.fjwt[9] = -7529263018217339710L;
        MediaInfo$1.fjwt[10] = 7330038035422222594L;
        MediaInfo$1.fjwt[11] = -1036157409453099422L;
        MediaInfo$1.fjwt[12] = -951704996912989570L;
        MediaInfo$1.fjwt[13] = -5403660611911238436L;
        MediaInfo$1.fjwt[14] = -2985592273472967372L;
        MediaInfo$1.fjwt[15] = 8936126208738940578L;
        MediaInfo$1.fjwt[16] = -1970091041784540575L;
        MediaInfo$1.fjwt[17] = 7010477146420658142L;
        MediaInfo$1.fjwt[18] = -7922122094860800899L;
        MediaInfo$1.fjwt[19] = 1076579490657591945L;
        MediaInfo$1.fjwt[20] = 4742048288489243135L;
        MediaInfo$1.fjwt[21] = 443326265192230275L;
        MediaInfo$1.fjwt[22] = 3895983290229451505L;
        MediaInfo$1.fjwt[23] = 8494000820852355916L;
    }

    MediaInfo$1(MediaInfo mediaInfo) {
        int n2 = b;
        this.this$0 = mediaInfo;
        super((int)MediaInfo$1.fjvz("fjwg", fjvv(int ), (int)0));
    }
}

