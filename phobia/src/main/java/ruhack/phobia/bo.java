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

public class bo
extends bc {
    protected static final long jd = 6884465539841681165L;
    public static final boolean a;
    private static int[] dtsp;
    private static int[] dtsq;
    private static long[] dtsy;
    public static final int b;
    private static long[] dtsx;
    private final char chr;
    public static final boolean c;

    private static /* synthetic */ void dttp() {
        bo.dtsq[0] = -1725698064;
        bo.dtsq[1] = 473029080;
        bo.dtsq[2] = 453609016;
        bo.dtsq[3] = -1373605619;
        bo.dtsq[4] = -941680308;
        bo.dtsq[5] = -1957587466;
        bo.dtsq[6] = 314107035;
        bo.dtsq[7] = -902938027;
        bo.dtsq[8] = -1500387715;
        bo.dtsq[9] = -1666480450;
        bo.dtsq[10] = -373358130;
    }

    static {
        dtsp = new int[11];
        dtsq = new int[11];
        bo.dtto();
        bo.dttp();
        dtsx = new long[8];
        dtsy = new long[8];
        bo.dttq();
        bo.dttr();
    }

    public static /* synthetic */ CallSite dtsr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dttr() {
        bo.dtsy[0] = 2742098166098257238L;
        bo.dtsy[1] = -5359342598219095307L;
        bo.dtsy[2] = -5071413828927467862L;
        bo.dtsy[3] = -2084967600521534697L;
        bo.dtsy[4] = -3659077039138095898L;
        bo.dtsy[5] = -7589335194970246030L;
        bo.dtsy[6] = 4999867346643563767L;
        bo.dtsy[7] = 2297843661486750297L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bo(char var1_1) {
        var3_2 /* !! */  = bo.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.chr = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)bo.dtsr("dtss", dtso(int ), (int)0);
                break;
            }
            case 1: {
                var3_2 /* !! */  = (int)bo.dtsr("dtst", dtso(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)bo.dtsr("dtsu", dtso(int ), (int)2);
                    break;
                }
            }
            case 3: 
        }
        var3_2 /* !! */  = (int)bo.dtsr("dtsv", dtso(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public char getChr() {
        v0 /* !! */  = bo.jd;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(bo.dtsr("dtta", dtsw(int ), (int)1) - bo.dtsr("dtsz", dtsw(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -626104563: {
                    break block19;
                }
                case 1588107137: {
                    continue block19;
                }
            }
            break;
        }
        var3_1 = bo.c;
        v1 /* !! */  = bo.jd;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(bo.dtsr("dttc", dtsw(int ), (int)3) - bo.dtsr("dttb", dtsw(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -626104563: {
                    break block20;
                }
                case 838697550: {
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = bo.b;
        v2 /* !! */  = bo.jd;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - bo.dtsr("dttd", dtsw(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -626104563: {
                    break block21;
                }
                case 822326820: {
                    v3 = bo.dtsr("dtte", dtsw(int ), (int)5);
                    continue block21;
                }
                case 860891765: {
                    v3 = bo.dtsr("dttf", dtsw(int ), (int)6);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = bo.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (char)bo.dtsr("dttg", dtso(int ), (int)4);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block22;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = bo.jd - bo.dtsr("dtth", dtsw(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == bo.dtsr("dtti", dtso(int ), (int)5)) break;
                    v4 /* !! */  = (long)bo.dtsr("dttj", dtso(int ), (int)6);
                }
                return this.chr;
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)bo.dtsr("dttk", dtso(int ), (int)7);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)bo.dtsr("dttl", dtso(int ), (int)8);
                    if (!var3_1) break block22;
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)bo.dtsr("dttm", dtso(int ), (int)9);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)bo.dtsr("dttn", dtso(int ), (int)10);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long dtsw(int n2) {
        return dtsx[n2] ^ dtsy[n2];
    }

    private static /* synthetic */ void dttq() {
        bo.dtsx[0] = 3858311887633073978L;
        bo.dtsx[1] = -7995092035210429290L;
        bo.dtsx[2] = -4602207659953196641L;
        bo.dtsx[3] = -6381695922631635775L;
        bo.dtsx[4] = 5905245261430008741L;
        bo.dtsx[5] = -1139132107132893384L;
        bo.dtsx[6] = -2395685878650245370L;
        bo.dtsx[7] = -3653345901108437658L;
    }

    private static /* synthetic */ int dtso(int n2) {
        return dtsp[n2] ^ dtsq[n2];
    }

    private static /* synthetic */ void dtto() {
        bo.dtsp[0] = -1725698061;
        bo.dtsp[1] = 473029081;
        bo.dtsp[2] = 453609017;
        bo.dtsp[3] = -1373605618;
        bo.dtsp[4] = -941685473;
        bo.dtsp[5] = -1957587465;
        bo.dtsp[6] = 1615537339;
        bo.dtsp[7] = -902938025;
        bo.dtsp[8] = -1500387716;
        bo.dtsp[9] = -1666480450;
        bo.dtsp[10] = -373358132;
    }
}

