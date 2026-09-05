/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.mu;

public class mw
extends mu {
    public static final boolean c;
    protected static final long mt = -8839550299420099747L;
    private static int[] fowr;
    private static int[] fowq;
    public static final int b;
    public static final boolean a;
    private static long[] fowl;
    private static long[] fowk;

    private static /* synthetic */ double foxe(int n2) {
        return Double.longBitsToDouble(fowk[n2] ^ fowl[n2]);
    }

    static {
        fowq = new int[10];
        fowr = new int[10];
        mw.foya();
        mw.foyc();
        fowk = new long[9];
        fowl = new long[9];
        mw.foyd();
        mw.foyf();
    }

    private static /* synthetic */ int fowo(int n2) {
        return fowq[n2] ^ fowr[n2];
    }

    private static /* synthetic */ long fowj(int n2) {
        return fowk[n2] ^ fowl[n2];
    }

    public static /* synthetic */ CallSite fowm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    public mw() {
    }

    private static /* synthetic */ void foya() {
        mw.fowq[0] = 1374501946;
        mw.fowq[1] = -645199123;
        mw.fowq[2] = -1623559130;
        mw.fowq[3] = -2140329944;
        mw.fowq[4] = 1455015609;
        mw.fowq[5] = -1868904607;
        mw.fowq[6] = -596270595;
        mw.fowq[7] = 978443564;
        mw.fowq[8] = 1187962769;
        mw.fowq[9] = 962799298;
    }

    private static /* synthetic */ void foyf() {
        mw.fowl[0] = -8411569531358047520L;
        mw.fowl[1] = 3294393593919945796L;
        mw.fowl[2] = -204892380704798964L;
        mw.fowl[3] = -5487810679915446648L;
        mw.fowl[4] = -170831847246904109L;
        mw.fowl[5] = -3623054127692817925L;
        mw.fowl[6] = 7720754611389990368L;
        mw.fowl[7] = 4790441244514963425L;
        mw.fowl[8] = -6212038295889804429L;
    }

    private static /* synthetic */ void foyd() {
        mw.fowk[0] = 3100893218031793015L;
        mw.fowk[1] = 1830812744858027947L;
        mw.fowk[2] = -4822129087090020519L;
        mw.fowk[3] = -3622104811000585159L;
        mw.fowk[4] = 5573032100914124456L;
        mw.fowk[5] = 7598680498653232399L;
        mw.fowk[6] = 6110532133429395449L;
        mw.fowk[7] = 3036724707710739643L;
        mw.fowk[8] = 5589534388117673654L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public double calculation(double var1_1) {
        while (true) {
            block34: {
                if ((v0 /* !! */  = (cfr_temp_0 = mw.mt - mw.fowm("fown", fowj(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != mw.fowm("fows", fowo(int ), (int)0)) break block34;
                var7_2 = mw.c;
                v1 /* !! */  = mw.mt;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)mw.fowm("fowt", fowo(int ), (int)1);
        }
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - mw.fowm("fowu", fowj(int ), (int)1));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -864992087: {
                    v2 = mw.fowm("fowv", fowj(int ), (int)2);
                    continue block19;
                }
                case -737566139: {
                    v2 = mw.fowm("fowx", fowj(int ), (int)3);
                    continue block19;
                }
                case 256142876: {
                    v2 = mw.fowm("foxa", fowj(int ), (int)4);
                    continue block19;
                }
                case 752745309: {
                    break block19;
                }
            }
            break;
        }
        var6_3 /* !! */  = mw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mw.mt - mw.fowm("foxb", fowj(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mw.fowm("foxc", fowo(int ), (int)2)) {
                var5_4 = mw.a;
                if (var7_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)mw.fowm("foxd", fowo(int ), (int)3);
        }
        if (var5_4 || var5_4) return (double)mw.fowm("foxg", foxe(int ), (int)6);
        v4 /* !! */  = mw.mt;
        block21: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -1785201277: {
                    v4 /* !! */  = (long)(mw.fowm("foxn", fowj(int ), (int)8) - mw.fowm("foxm", fowj(int ), (int)7));
                    continue block21;
                }
                case 752745309: {
                    break block21;
                }
            }
            break;
        }
        var3_5 = var1_1 / (double)this.ms;
        if (var5_4) return (double)mw.fowm("foxg", foxe(int ), (int)6);
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_4) return 1.0 - (var3_5 - 1.0) * (var3_5 - 1.0);
                return (double)mw.fowm("foxg", foxe(int ), (int)6);
            }
            case 1: {
                var6_3 /* !! */  = (int)mw.fowm("foxp", fowo(int ), (int)5);
                if (!var7_2) ** break;
                throw null;
            }
            case 4: {
                var6_3 /* !! */  = (int)mw.fowm("foxs", fowo(int ), (int)8);
                if (var7_2) {
                    throw null;
                }
            }
            case 2: {
                ** GOTO lbl66
            }
            case 5: {
                var6_3 /* !! */  = (int)mw.fowm("foxy", fowo(int ), (int)9);
                if (var7_2) {
                    throw null;
                }
lbl66:
                // 3 sources

                var6_3 /* !! */  = (int)mw.fowm("foxq", fowo(int ), (int)6);
                if (var7_2) {
                    throw null;
                }
            }
            case 3: {
                var6_3 /* !! */  = (int)mw.fowm("foxr", fowo(int ), (int)7);
                if (var7_2) {
                    throw null;
                }
            }
            case 0: 
        }
        do {
            var6_3 /* !! */  = (int)mw.fowm("foxo", fowo(int ), (int)4);
        } while (!var7_2);
        throw null;
    }

    private static /* synthetic */ void foyc() {
        mw.fowr[0] = -1374501947;
        mw.fowr[1] = 1470614832;
        mw.fowr[2] = 1623559129;
        mw.fowr[3] = 1108329032;
        mw.fowr[4] = 1455015613;
        mw.fowr[5] = -1868904606;
        mw.fowr[6] = -596270600;
        mw.fowr[7] = 978443566;
        mw.fowr[8] = 1187962770;
        mw.fowr[9] = 962799303;
    }
}

