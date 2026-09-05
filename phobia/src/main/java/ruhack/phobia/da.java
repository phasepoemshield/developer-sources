/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.az;

public class da
implements az {
    byte type;
    private static long[] dqht;
    public static final int b;
    public static final boolean c;
    private static long[] dqhu;
    private static int[] dqid;
    public static final boolean a;
    private static int[] dqic;
    public static final long iq = -8293060856660425631L;

    private static /* synthetic */ void dqjk() {
        da.dqid[0] = -780290676;
        da.dqid[1] = 2137587271;
        da.dqid[2] = 970448169;
        da.dqid[3] = -151113572;
        da.dqid[4] = 248640072;
        da.dqid[5] = -1250331584;
        da.dqid[6] = -1228036937;
        da.dqid[7] = 439527742;
        da.dqid[8] = -1393929868;
        da.dqid[9] = 689961085;
        da.dqid[10] = -1842248982;
        da.dqid[11] = 1939560026;
    }

    public static /* synthetic */ CallSite dqhv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dqjl() {
        da.dqht[0] = -7717116000906239256L;
        da.dqht[1] = 253318946677918558L;
        da.dqht[2] = 27939469181992444L;
        da.dqht[3] = -6879232260903095098L;
        da.dqht[4] = -1094032641702060888L;
        da.dqht[5] = -4878211381315941235L;
    }

    private static /* synthetic */ void dqjj() {
        da.dqic[0] = 780290675;
        da.dqic[1] = -1256845077;
        da.dqic[2] = -970448170;
        da.dqic[3] = 922099003;
        da.dqic[4] = 248640031;
        da.dqic[5] = -1250331583;
        da.dqic[6] = -1228036939;
        da.dqic[7] = 439527740;
        da.dqic[8] = -1393929868;
        da.dqic[9] = 689961085;
        da.dqic[10] = -1842248984;
        da.dqic[11] = 1939560027;
    }

    private static /* synthetic */ int dqib(int n2) {
        return dqic[n2] ^ dqid[n2];
    }

    private static /* synthetic */ long dqhr(int n2) {
        return dqht[n2] ^ dqhu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public byte getType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = da.iq - da.dqhv("dqia", dqhr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == da.dqhv("dqie", dqib(int ), (int)0)) break;
            v0 /* !! */  = (long)da.dqhv("dqif", dqib(int ), (int)1);
        }
        var3_1 = da.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = da.iq - da.dqhv("dqig", dqhr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == da.dqhv("dqim", dqib(int ), (int)2)) break;
            v1 /* !! */  = (long)da.dqhv("dqin", dqib(int ), (int)3);
        }
        var2_2 /* !! */  = da.b;
        v2 /* !! */  = da.iq;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(da.dqhv("dqiq", dqhr(int ), (int)3) - da.dqhv("dqio", dqhr(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -502332319: {
                    break block16;
                }
                case 2021682730: {
                    continue block16;
                }
            }
            break;
        }
        var1_3 = da.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (byte)da.dqhv("dqir", dqib(int ), (int)4);
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                v3 /* !! */  = da.iq;
                if (true) ** GOTO lbl36
                block18: while (true) {
                    v3 /* !! */  = (long)(da.dqhv("dqit", dqhr(int ), (int)5) - da.dqhv("dqis", dqhr(int ), (int)4));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -502332319: {
                            break block18;
                        }
                        case 1590985809: {
                            continue block18;
                        }
                    }
                    break;
                }
                return this.type;
lbl42:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)da.dqhv("dqiz", dqib(int ), (int)5);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl52
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)da.dqhv("dqja", dqib(int ), (int)6);
                    if (!var3_1) ** GOTO lbl42
                    throw null;
                }
lbl52:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)da.dqhv("dqjb", dqib(int ), (int)7);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)da.dqhv("dqjd", dqib(int ), (int)8);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public da(byte var1_1) {
        var3_2 /* !! */  = da.b;
        var2_3 = da.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.type = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)da.dqhv("dqjf", dqib(int ), (int)9);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)da.dqhv("dqjg", dqib(int ), (int)10);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)da.dqhv("dqjh", dqib(int ), (int)11);
        ** while (true)
    }

    static {
        dqic = new int[12];
        dqid = new int[12];
        da.dqjj();
        da.dqjk();
        dqht = new long[6];
        dqhu = new long[6];
        da.dqjl();
        da.dqjn();
    }

    private static /* synthetic */ void dqjn() {
        da.dqhu[0] = -7438256487234366504L;
        da.dqhu[1] = 5043490780171595964L;
        da.dqhu[2] = -6484988335133794735L;
        da.dqhu[3] = -6394485333472075894L;
        da.dqhu[4] = -8429084901936702417L;
        da.dqhu[5] = -3870934922898750616L;
    }
}

