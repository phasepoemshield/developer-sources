/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;
import ruhack.phobia.cz$Type;

public class cz
extends bc {
    public static final boolean c;
    public static final int b;
    protected static final long ir = -4455358233129222350L;
    private cz$Type type;
    private static long[] dqoi;
    private static int[] dqou;
    private static int[] dqos;
    public static final boolean a;
    private static long[] dqoh;

    private static /* synthetic */ void dqqr() {
        cz.dqoh[0] = -7263969388380681046L;
        cz.dqoh[1] = 5279735845542864995L;
        cz.dqoh[2] = 5984670483920975053L;
        cz.dqoh[3] = -7938310148899249240L;
        cz.dqoh[4] = 1614036494718942602L;
        cz.dqoh[5] = -8387996789330305854L;
        cz.dqoh[6] = 1616127448014097431L;
        cz.dqoh[7] = -3768725142753397740L;
        cz.dqoh[8] = -6042442011015185321L;
        cz.dqoh[9] = -5399608880092227941L;
        cz.dqoh[10] = 3741818014494388901L;
    }

    static {
        dqos = new int[9];
        dqou = new int[9];
        cz.dqqi();
        cz.dqqp();
        dqoh = new long[11];
        dqoi = new long[11];
        cz.dqqr();
        cz.dqqt();
    }

    public static /* synthetic */ CallSite dqok(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dqqt() {
        cz.dqoi[0] = -7434951525095965544L;
        cz.dqoi[1] = 2449973694198734671L;
        cz.dqoi[2] = -6246252109670420761L;
        cz.dqoi[3] = -1696605501820003236L;
        cz.dqoi[4] = 5673419428141469691L;
        cz.dqoi[5] = -1828814282638132336L;
        cz.dqoi[6] = -757878918269342182L;
        cz.dqoi[7] = 4117624960734903383L;
        cz.dqoi[8] = -5120641938748815701L;
        cz.dqoi[9] = 7950725333691804716L;
        cz.dqoi[10] = 2468657728418853850L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cz(cz$Type var1_1) {
        var3_2 /* !! */  = cz.b;
        var2_3 = cz.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.type = var1_1;
                return;
            }
            case 0: {
                while (true) {
                    var3_2 /* !! */  = (int)cz.dqok("dqqf", dqor(int ), (int)6);
                }
            }
            case 1: {
                while (true) {
                    var3_2 /* !! */  = (int)cz.dqok("dqqg", dqor(int ), (int)7);
                }
            }
            case 2: 
        }
        while (true) {
            var3_2 /* !! */  = (int)cz.dqok("dqqh", dqor(int ), (int)8);
        }
    }

    private static /* synthetic */ void dqqp() {
        cz.dqou[0] = 2058301345;
        cz.dqou[1] = -448795488;
        cz.dqou[2] = -1223897695;
        cz.dqou[3] = -405524402;
        cz.dqou[4] = -1380798956;
        cz.dqou[5] = 627355494;
        cz.dqou[6] = -2040409490;
        cz.dqou[7] = 248559283;
        cz.dqou[8] = -47396075;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public cz$Type getType() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ir - cz.dqok("dqoq", dqof(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == cz.dqok("dqov", dqor(int ), (int)0)) break;
            object = cz.dqok("dqox", dqor(int ), (int)1);
        }
        boolean bl2 = c;
        Object object = ir;
        block17: while (true) {
            switch ((int)object) {
                case -1003089243: {
                    object = cz.dqok("dqpe", dqof(int ), (int)2) - cz.dqok("dqpd", dqof(int ), (int)1);
                    continue block17;
                }
                case -549945550: {
                    break block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = ir;
        boolean bl3 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - cz.dqok("dqpg", dqof(int ), (int)3);
            }
            switch ((int)object2) {
                case -2031295492: {
                    callSite = cz.dqok("dqpi", dqof(int ), (int)4);
                    continue block18;
                }
                case -802149266: {
                    callSite = cz.dqok("dqpj", dqof(int ), (int)5);
                    continue block18;
                }
                case -549945550: {
                    break block18;
                }
                case 755602819: {
                    callSite = cz.dqok("dqpk", dqof(int ), (int)6);
                    continue block18;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        Object object3 = ir;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - cz.dqok("dqpn", dqof(int ), (int)7);
            }
            switch ((int)object3) {
                case -1049722499: {
                    callSite = cz.dqok("dqpr", dqof(int ), (int)8);
                    continue block19;
                }
                case -549945550: {
                    return this.type;
                }
                case -403283160: {
                    callSite = cz.dqok("dqps", dqof(int ), (int)9);
                    continue block19;
                }
                case 1398981359: {
                    callSite = cz.dqok("dqpt", dqof(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        return this.type;
    }

    private static /* synthetic */ void dqqi() {
        cz.dqos[0] = -2058301346;
        cz.dqos[1] = 1049102254;
        cz.dqos[2] = -1223897695;
        cz.dqos[3] = -405524403;
        cz.dqos[4] = -1380798955;
        cz.dqos[5] = 627355495;
        cz.dqos[6] = -2040409492;
        cz.dqos[7] = 248559281;
        cz.dqos[8] = -47396075;
    }

    private static /* synthetic */ long dqof(int n2) {
        return dqoh[n2] ^ dqoi[n2];
    }

    private static /* synthetic */ int dqor(int n2) {
        return dqos[n2] ^ dqou[n2];
    }
}

