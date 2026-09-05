/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.oz;

final class oz$DiscordDaemonThread
extends Thread {
    public static final int b;
    private static final long q = -3688620240555791041L;
    final /* synthetic */ oz this$0;
    private static long[] cxp;
    public static final boolean a;
    private static int[] cvi;
    public static final boolean c;
    private static long[] cxq;
    private static int[] cvj;

    private static /* synthetic */ int cvh(int n2) {
        return cvi[n2] ^ cvj[n2];
    }

    private static /* synthetic */ void dhg() {
        oz$DiscordDaemonThread.cvi[0] = 402990532;
        oz$DiscordDaemonThread.cvi[1] = 1927238533;
        oz$DiscordDaemonThread.cvi[2] = -1491017555;
        oz$DiscordDaemonThread.cvi[3] = 2143347316;
        oz$DiscordDaemonThread.cvi[4] = -1634361289;
        oz$DiscordDaemonThread.cvi[5] = -1288751245;
        oz$DiscordDaemonThread.cvi[6] = -1755664961;
        oz$DiscordDaemonThread.cvi[7] = -690948169;
        oz$DiscordDaemonThread.cvi[8] = -1927115853;
        oz$DiscordDaemonThread.cvi[9] = 129467191;
        oz$DiscordDaemonThread.cvi[10] = -1392370622;
        oz$DiscordDaemonThread.cvi[11] = 605868912;
        oz$DiscordDaemonThread.cvi[12] = -1398649939;
        oz$DiscordDaemonThread.cvi[13] = 1322659952;
        oz$DiscordDaemonThread.cvi[14] = -1351500324;
        oz$DiscordDaemonThread.cvi[15] = -1237584420;
        oz$DiscordDaemonThread.cvi[16] = -574633087;
        oz$DiscordDaemonThread.cvi[17] = -1436258672;
        oz$DiscordDaemonThread.cvi[18] = 2124238343;
        oz$DiscordDaemonThread.cvi[19] = 636894387;
        oz$DiscordDaemonThread.cvi[20] = 371056632;
        oz$DiscordDaemonThread.cvi[21] = -969065799;
        oz$DiscordDaemonThread.cvi[22] = -446001499;
        oz$DiscordDaemonThread.cvi[23] = -829481517;
        oz$DiscordDaemonThread.cvi[24] = 1057168546;
        oz$DiscordDaemonThread.cvi[25] = 1749702356;
        oz$DiscordDaemonThread.cvi[26] = -1606921598;
        oz$DiscordDaemonThread.cvi[27] = 823658438;
        oz$DiscordDaemonThread.cvi[28] = 1023405613;
        oz$DiscordDaemonThread.cvi[29] = 1096333830;
        oz$DiscordDaemonThread.cvi[30] = -451985113;
        oz$DiscordDaemonThread.cvi[31] = -1702276224;
        oz$DiscordDaemonThread.cvi[32] = 1932939477;
        oz$DiscordDaemonThread.cvi[33] = -892844110;
        oz$DiscordDaemonThread.cvi[34] = 782094726;
        oz$DiscordDaemonThread.cvi[35] = 1573815853;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oz$DiscordDaemonThread(oz var1_1) {
        var3_2 /* !! */  = oz$DiscordDaemonThread.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.this$0 = var1_1;
                super();
                this.setName("Discord-RPC");
                this.setDaemon((boolean)oz$DiscordDaemonThread.cvk("cvl", cvh(int ), (int)0));
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)oz$DiscordDaemonThread.cvk("cvn", cvh(int ), (int)1);
                ** GOTO lbl20
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)oz$DiscordDaemonThread.cvk("cvo", cvh(int ), (int)2);
                    ** GOTO lbl10
                    break;
                }
            }
            case 2: {
                var3_2 /* !! */  = (int)oz$DiscordDaemonThread.cvk("cvp", cvh(int ), (int)3);
                break;
            }
lbl20:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)oz$DiscordDaemonThread.cvk("cvq", cvh(int ), (int)4);
                ** GOTO lbl10
            }
            case 4: 
        }
        var3_2 /* !! */  = (int)oz$DiscordDaemonThread.cvk("cxm", cvh(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ void dhp() {
        oz$DiscordDaemonThread.cxp[0] = -1052177649828758331L;
        oz$DiscordDaemonThread.cxp[1] = -5540348932812738665L;
        oz$DiscordDaemonThread.cxp[2] = 740942384563589736L;
        oz$DiscordDaemonThread.cxp[3] = -5177643303754924054L;
        oz$DiscordDaemonThread.cxp[4] = 7985733669776121259L;
        oz$DiscordDaemonThread.cxp[5] = -6412351657392418024L;
        oz$DiscordDaemonThread.cxp[6] = -7727360044050450767L;
        oz$DiscordDaemonThread.cxp[7] = 8886388832896228513L;
        oz$DiscordDaemonThread.cxp[8] = -1487742942111881855L;
        oz$DiscordDaemonThread.cxp[9] = -2657005769767191438L;
        oz$DiscordDaemonThread.cxp[10] = -1473090022208196028L;
        oz$DiscordDaemonThread.cxp[11] = -4941959824370185596L;
        oz$DiscordDaemonThread.cxp[12] = -1684698103190418639L;
        oz$DiscordDaemonThread.cxp[13] = 7158330058965677097L;
        oz$DiscordDaemonThread.cxp[14] = -6541391978089119594L;
        oz$DiscordDaemonThread.cxp[15] = -2525700318675540732L;
        oz$DiscordDaemonThread.cxp[16] = 1264015950580020650L;
        oz$DiscordDaemonThread.cxp[17] = -5425065965150041637L;
        oz$DiscordDaemonThread.cxp[18] = 8742196660075443133L;
        oz$DiscordDaemonThread.cxp[19] = -1790456241375396213L;
        oz$DiscordDaemonThread.cxp[20] = -6501764947660251971L;
        oz$DiscordDaemonThread.cxp[21] = 1576544616194417680L;
        oz$DiscordDaemonThread.cxp[22] = -5526416763926432166L;
        oz$DiscordDaemonThread.cxp[23] = -5413029708960694588L;
        oz$DiscordDaemonThread.cxp[24] = 5288161251467987284L;
        oz$DiscordDaemonThread.cxp[25] = -57977215802235387L;
        oz$DiscordDaemonThread.cxp[26] = 4575546481524623724L;
        oz$DiscordDaemonThread.cxp[27] = -2807382111852467784L;
        oz$DiscordDaemonThread.cxp[28] = 8757866225472849075L;
        oz$DiscordDaemonThread.cxp[29] = -785869259921058597L;
        oz$DiscordDaemonThread.cxp[30] = 1027497434656229476L;
        oz$DiscordDaemonThread.cxp[31] = 6655555091492177897L;
        oz$DiscordDaemonThread.cxp[32] = -6855760482749981962L;
        oz$DiscordDaemonThread.cxp[33] = -7907251483195496765L;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 52[SWITCH]
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
        cvi = new int[36];
        cvj = new int[36];
        oz$DiscordDaemonThread.dhg();
        oz$DiscordDaemonThread.dhl();
        cxp = new long[34];
        cxq = new long[34];
        oz$DiscordDaemonThread.dhp();
        oz$DiscordDaemonThread.dhs();
    }

    private static /* synthetic */ long cxo(int n2) {
        return cxp[n2] ^ cxq[n2];
    }

    private static /* synthetic */ void dhl() {
        oz$DiscordDaemonThread.cvj[0] = 402990533;
        oz$DiscordDaemonThread.cvj[1] = 1927238529;
        oz$DiscordDaemonThread.cvj[2] = -1491017556;
        oz$DiscordDaemonThread.cvj[3] = 2143347316;
        oz$DiscordDaemonThread.cvj[4] = -1634361293;
        oz$DiscordDaemonThread.cvj[5] = -1288751246;
        oz$DiscordDaemonThread.cvj[6] = 1755664960;
        oz$DiscordDaemonThread.cvj[7] = 442859055;
        oz$DiscordDaemonThread.cvj[8] = -1927115854;
        oz$DiscordDaemonThread.cvj[9] = 304810866;
        oz$DiscordDaemonThread.cvj[10] = 1392370621;
        oz$DiscordDaemonThread.cvj[11] = 1292628361;
        oz$DiscordDaemonThread.cvj[12] = -1398649940;
        oz$DiscordDaemonThread.cvj[13] = 922233859;
        oz$DiscordDaemonThread.cvj[14] = -1351500333;
        oz$DiscordDaemonThread.cvj[15] = -1237584424;
        oz$DiscordDaemonThread.cvj[16] = -574633076;
        oz$DiscordDaemonThread.cvj[17] = -1436258671;
        oz$DiscordDaemonThread.cvj[18] = 2124238338;
        oz$DiscordDaemonThread.cvj[19] = 636894385;
        oz$DiscordDaemonThread.cvj[20] = 371056630;
        oz$DiscordDaemonThread.cvj[21] = -969065801;
        oz$DiscordDaemonThread.cvj[22] = -446001484;
        oz$DiscordDaemonThread.cvj[23] = -829481530;
        oz$DiscordDaemonThread.cvj[24] = 1057168548;
        oz$DiscordDaemonThread.cvj[25] = 1749702358;
        oz$DiscordDaemonThread.cvj[26] = -1606921582;
        oz$DiscordDaemonThread.cvj[27] = 823658443;
        oz$DiscordDaemonThread.cvj[28] = 1023405631;
        oz$DiscordDaemonThread.cvj[29] = 1096333845;
        oz$DiscordDaemonThread.cvj[30] = -451985106;
        oz$DiscordDaemonThread.cvj[31] = -1702276211;
        oz$DiscordDaemonThread.cvj[32] = 1932939477;
        oz$DiscordDaemonThread.cvj[33] = -892844125;
        oz$DiscordDaemonThread.cvj[34] = 782094733;
        oz$DiscordDaemonThread.cvj[35] = 1573815842;
    }

    public static /* synthetic */ CallSite cvk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dhs() {
        oz$DiscordDaemonThread.cxq[0] = -99237300608425043L;
        oz$DiscordDaemonThread.cxq[1] = 2587038469927670272L;
        oz$DiscordDaemonThread.cxq[2] = -896457475381551611L;
        oz$DiscordDaemonThread.cxq[3] = -6758584155610000231L;
        oz$DiscordDaemonThread.cxq[4] = -3092854092296047606L;
        oz$DiscordDaemonThread.cxq[5] = -8096044290753601645L;
        oz$DiscordDaemonThread.cxq[6] = -2614170787725985586L;
        oz$DiscordDaemonThread.cxq[7] = -6346837026945989828L;
        oz$DiscordDaemonThread.cxq[8] = -3067008872861128418L;
        oz$DiscordDaemonThread.cxq[9] = 5188346525583852538L;
        oz$DiscordDaemonThread.cxq[10] = -2030422554894529304L;
        oz$DiscordDaemonThread.cxq[11] = 5786832527381771840L;
        oz$DiscordDaemonThread.cxq[12] = -5265710358339297637L;
        oz$DiscordDaemonThread.cxq[13] = -8323822101938942551L;
        oz$DiscordDaemonThread.cxq[14] = -8636787595138596032L;
        oz$DiscordDaemonThread.cxq[15] = -1518224701006747911L;
        oz$DiscordDaemonThread.cxq[16] = -9189205129756727566L;
        oz$DiscordDaemonThread.cxq[17] = 5688124811238518393L;
        oz$DiscordDaemonThread.cxq[18] = 8742196660075432229L;
        oz$DiscordDaemonThread.cxq[19] = -6451162544958679844L;
        oz$DiscordDaemonThread.cxq[20] = 2309346243365817309L;
        oz$DiscordDaemonThread.cxq[21] = -3451355134593607326L;
        oz$DiscordDaemonThread.cxq[22] = 1073629842306853239L;
        oz$DiscordDaemonThread.cxq[23] = 5700361836854734307L;
        oz$DiscordDaemonThread.cxq[24] = -8503532618208732087L;
        oz$DiscordDaemonThread.cxq[25] = 4357997857441898923L;
        oz$DiscordDaemonThread.cxq[26] = -1179517431833864961L;
        oz$DiscordDaemonThread.cxq[27] = -4402689043415686790L;
        oz$DiscordDaemonThread.cxq[28] = 1937022252614075054L;
        oz$DiscordDaemonThread.cxq[29] = -3555158841662779458L;
        oz$DiscordDaemonThread.cxq[30] = -6206773541918521303L;
        oz$DiscordDaemonThread.cxq[31] = -8891239495475268973L;
        oz$DiscordDaemonThread.cxq[32] = -4154634249437020758L;
        oz$DiscordDaemonThread.cxq[33] = 9188913616527050037L;
    }
}

