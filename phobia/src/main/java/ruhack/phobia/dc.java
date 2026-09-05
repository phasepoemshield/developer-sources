/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import ruhack.phobia.bc;

public class dc
extends bc {
    private static long[] bzcq;
    private static long[] bzcp;
    public static final boolean c;
    private static int[] bzcv;
    private static int[] bzcu;
    public static final boolean a;
    public static final int b;
    class_243 vector;
    static final long fd = 1119030954285651491L;

    static {
        bzcu = new int[20];
        bzcv = new int[20];
        dc.bzef();
        dc.bzeg();
        bzcp = new long[16];
        bzcq = new long[16];
        dc.bzeh();
        dc.bzei();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_243 getVector() {
        block27: {
            while (true) {
                block28: {
                    if ((v0 /* !! */  = (cfr_temp_1 = dc.fd - dc.bzcr("bzdn", bzco(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != dc.bzcr("bzdo", bzct(int ), (int)9)) break block28;
                    var3_1 = dc.c;
                    v1 /* !! */  = dc.fd;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)dc.bzcr("bzdp", bzct(int ), (int)10);
            }
            block16: while (true) {
                v1 /* !! */  = (long)(v2 - dc.bzcr("bzdq", bzco(int ), (int)10));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1299738260: {
                        v2 = dc.bzcr("bzdr", bzco(int ), (int)11);
                        continue block16;
                    }
                    case -80657857: {
                        v2 = dc.bzcr("bzds", bzco(int ), (int)12);
                        continue block16;
                    }
                    case 1524422179: {
                        break block16;
                    }
                }
                break;
            }
            var2_2 /* !! */  = dc.b;
            v3 /* !! */  = dc.fd;
            block17: while (true) {
                switch ((int)v3 /* !! */ ) {
                    case -2081795115: {
                        v3 /* !! */  = (long)(dc.bzcr("bzdu", bzco(int ), (int)14) - dc.bzcr("bzdt", bzco(int ), (int)13));
                        continue block17;
                    }
                    case 1524422179: {
                        break block17;
                    }
                }
                break;
            }
            var1_3 = dc.a;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block18: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = dc.fd - dc.bzcr("bzdv", bzco(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == dc.bzcr("bzdw", bzct(int ), (int)11)) {
                                return this.vector;
                            }
                            v4 /* !! */  = (long)dc.bzcr("bzdx", bzct(int ), (int)12);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)dc.bzcr("bzdy", bzct(int ), (int)13);
                        if (var3_1) {
                            throw null;
                        }
                        break block27;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block27;
                    }
lbl57:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)dc.bzcr("bzdz", bzct(int ), (int)14);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block18;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)dc.bzcr("bzea", bzct(int ), (int)15);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)dc.bzcr("bzeb", bzct(int ), (int)16);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bzeg() {
        dc.bzcv[0] = -611405641;
        dc.bzcv[1] = -605259248;
        dc.bzcv[2] = 134909599;
        dc.bzcv[3] = 587463188;
        dc.bzcv[4] = -379185682;
        dc.bzcv[5] = -282253935;
        dc.bzcv[6] = -581209669;
        dc.bzcv[7] = -2066838922;
        dc.bzcv[8] = 1277671905;
        dc.bzcv[9] = -1845314879;
        dc.bzcv[10] = -505196867;
        dc.bzcv[11] = 708415608;
        dc.bzcv[12] = 1890158136;
        dc.bzcv[13] = -1818964346;
        dc.bzcv[14] = -1190079425;
        dc.bzcv[15] = -1016425900;
        dc.bzcv[16] = -1995191851;
        dc.bzcv[17] = 1936550598;
        dc.bzcv[18] = 2128749588;
        dc.bzcv[19] = -86933460;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setVector(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dc.fd - dc.bzcr("bzcs", bzco(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dc.bzcr("bzcw", bzct(int ), (int)0)) break;
            v0 /* !! */  = (long)dc.bzcr("bzcx", bzct(int ), (int)1);
        }
        var4_2 = dc.c;
        v1 /* !! */  = dc.fd;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - dc.bzcr("bzcy", bzco(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1804742900: {
                    v2 = dc.bzcr("bzcz", bzco(int ), (int)2);
                    continue block19;
                }
                case -1456040409: {
                    v2 = dc.bzcr("bzda", bzco(int ), (int)3);
                    continue block19;
                }
                case 485305046: {
                    v2 = dc.bzcr("bzdb", bzco(int ), (int)4);
                    continue block19;
                }
                case 1524422179: {
                    break block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = dc.b;
        v3 /* !! */  = dc.fd;
        if (true) ** GOTO lbl28
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - dc.bzcr("bzdc", bzco(int ), (int)5));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1813214866: {
                    v4 = dc.bzcr("bzdd", bzco(int ), (int)6);
                    continue block20;
                }
                case -30600242: {
                    v4 = dc.bzcr("bzde", bzco(int ), (int)7);
                    continue block20;
                }
                case 1524422179: {
                    break block20;
                }
            }
            break;
        }
        var2_4 = dc.a;
        if (var4_2) {
            throw null;
lbl40:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dc.fd - dc.bzcr("bzdf", bzco(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dc.bzcr("bzdg", bzct(int ), (int)2)) break;
                    v5 /* !! */  = (long)dc.bzcr("bzdh", bzct(int ), (int)3);
                }
                this.vector = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl55:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dc.bzcr("bzdi", bzct(int ), (int)4);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)dc.bzcr("bzdj", bzct(int ), (int)5);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)dc.bzcr("bzdk", bzct(int ), (int)6);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)dc.bzcr("bzdl", bzct(int ), (int)7);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)dc.bzcr("bzdm", bzct(int ), (int)8);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bzcr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bzef() {
        dc.bzcu[0] = 611405640;
        dc.bzcu[1] = 1936743667;
        dc.bzcu[2] = 134909598;
        dc.bzcu[3] = -1674113790;
        dc.bzcu[4] = -379185683;
        dc.bzcu[5] = -282253931;
        dc.bzcu[6] = -581209671;
        dc.bzcu[7] = -2066838923;
        dc.bzcu[8] = 1277671907;
        dc.bzcu[9] = 1845314878;
        dc.bzcu[10] = -1209405768;
        dc.bzcu[11] = 708415609;
        dc.bzcu[12] = 1582098562;
        dc.bzcu[13] = -1818964347;
        dc.bzcu[14] = -1190079426;
        dc.bzcu[15] = -1016425897;
        dc.bzcu[16] = -1995191852;
        dc.bzcu[17] = 1936550599;
        dc.bzcu[18] = 2128749590;
        dc.bzcu[19] = -86933458;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dc(class_243 var1_1) {
        var3_2 /* !! */  = dc.b;
        var2_3 = dc.a;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.vector = var1_1;
                return;
            }
            case 0: {
                while (true) {
                    var3_2 /* !! */  = (int)dc.bzcr("bzec", bzct(int ), (int)17);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dc.bzcr("bzed", bzct(int ), (int)18);
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)dc.bzcr("bzee", bzct(int ), (int)19);
        ** while (true)
    }

    private static /* synthetic */ void bzeh() {
        dc.bzcp[0] = -2782075285276962077L;
        dc.bzcp[1] = -6240284333932120906L;
        dc.bzcp[2] = -2051840725008338068L;
        dc.bzcp[3] = -1611854653882808300L;
        dc.bzcp[4] = 1186463368465060446L;
        dc.bzcp[5] = 4330823534766688851L;
        dc.bzcp[6] = 6259288097426544115L;
        dc.bzcp[7] = 2719251802310254596L;
        dc.bzcp[8] = 8391470542399509731L;
        dc.bzcp[9] = -7429393266977713623L;
        dc.bzcp[10] = -1052984065642052527L;
        dc.bzcp[11] = -2920849964002666088L;
        dc.bzcp[12] = 7554739440777349937L;
        dc.bzcp[13] = 1331912032487991808L;
        dc.bzcp[14] = -1286424964068638428L;
        dc.bzcp[15] = 8926717211491749470L;
    }

    private static /* synthetic */ int bzct(int n2) {
        return bzcu[n2] ^ bzcv[n2];
    }

    private static /* synthetic */ long bzco(int n2) {
        return bzcp[n2] ^ bzcq[n2];
    }

    private static /* synthetic */ void bzei() {
        dc.bzcq[0] = -7078014991378403936L;
        dc.bzcq[1] = -948710506701847179L;
        dc.bzcq[2] = -5738751206422628699L;
        dc.bzcq[3] = -1060093722416789236L;
        dc.bzcq[4] = -711695392059981845L;
        dc.bzcq[5] = -1079413202055912838L;
        dc.bzcq[6] = -6018022210280763396L;
        dc.bzcq[7] = -8623126871698233853L;
        dc.bzcq[8] = -6963839154824335243L;
        dc.bzcq[9] = -5135873296840839811L;
        dc.bzcq[10] = -4189290203293538101L;
        dc.bzcq[11] = -4197974916881876328L;
        dc.bzcq[12] = 7688829263082349909L;
        dc.bzcq[13] = -117962274438128688L;
        dc.bzcq[14] = -759290841227560931L;
        dc.bzcq[15] = -1964393372184633557L;
    }
}

