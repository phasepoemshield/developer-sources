/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Structure
 */
package ruhack.phobia;

import com.sun.jna.Structure;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;
import ruhack.phobia.pa;
import ruhack.phobia.pb;
import ruhack.phobia.pc;
import ruhack.phobia.pd;
import ruhack.phobia.pe;
import ruhack.phobia.pf;

public class pg
extends Structure {
    public pe ready;
    public static final boolean a;
    private static long[] kytk;
    private static int[] kytp;
    public static final boolean c;
    public pb errored;
    public pa disconnected;
    public pc joinGame;
    private static int[] kytq;
    private static final long tm = 4354703977907935226L;
    public pd joinRequest;
    private static long[] kytl;
    public pf spectateGame;
    public static final int b;

    static {
        kytp = new int[8];
        kytq = new int[8];
        pg.kyuh();
        pg.kyui();
        kytk = new long[9];
        kytl = new long[9];
        pg.kyuj();
        pg.kyuk();
    }

    private static /* synthetic */ void kyui() {
        pg.kytq[0] = -53046091;
        pg.kytq[1] = -1735000654;
        pg.kytq[2] = 1377029434;
        pg.kytq[3] = -1409183527;
        pg.kytq[4] = 219884433;
        pg.kytq[5] = 1467536562;
        pg.kytq[6] = 371444471;
        pg.kytq[7] = -1050661209;
    }

    private static /* synthetic */ int kyto(int n2) {
        return kytp[n2] ^ kytq[n2];
    }

    private static /* synthetic */ long kytj(int n2) {
        return kytk[n2] ^ kytl[n2];
    }

    public pg() {
    }

    private static /* synthetic */ void kyuh() {
        pg.kytp[0] = -53046092;
        pg.kytp[1] = -1926123859;
        pg.kytp[2] = -1377029435;
        pg.kytp[3] = -591897935;
        pg.kytp[4] = 219884432;
        pg.kytp[5] = 1467536563;
        pg.kytp[6] = 371444470;
        pg.kytp[7] = -1050661211;
    }

    private static /* synthetic */ void kyuj() {
        pg.kytk[0] = -6024744568058926140L;
        pg.kytk[1] = 7846311305262030718L;
        pg.kytk[2] = -9143101926641895558L;
        pg.kytk[3] = 6431685478610569215L;
        pg.kytk[4] = -6397520137838022245L;
        pg.kytk[5] = 1901740059388789608L;
        pg.kytk[6] = -194788857221486250L;
        pg.kytk[7] = -3318877032089207763L;
        pg.kytk[8] = 7921475789715158079L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected List<String> getFieldOrder() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = pg.tm - pg.kytm("kytn", kytj(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == pg.kytm("kytr", kyto(int ), (int)0)) break;
            v0 /* !! */  = (long)pg.kytm("kyts", kyto(int ), (int)1);
        }
        var3_1 = pg.c;
        while (true) {
            block27: {
                if ((v1 /* !! */  = (cfr_temp_2 = pg.tm - pg.kytm("kytt", kytj(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != pg.kytm("kytu", kyto(int ), (int)2)) break block27;
                var2_2 /* !! */  = pg.b;
                v2 /* !! */  = pg.tm;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)pg.kytm("kytv", kyto(int ), (int)3);
        }
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - pg.kytm("kytw", kytj(int ), (int)2));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2000669568: {
                    v3 = pg.kytm("kytx", kytj(int ), (int)3);
                    continue block19;
                }
                case -265197934: {
                    v3 = pg.kytm("kyty", kytj(int ), (int)4);
                    continue block19;
                }
                case 422500346: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = pg.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return null;
                    if (var1_3 != false) return null;
                    v4 = new String[]{"ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest"};
                    v5 /* !! */  = pg.tm;
                    block21: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -2004552245: {
                                v6 = pg.kytm("kyua", kytj(int ), (int)6);
                                ** GOTO lbl49
                            }
                            case -765328496: {
                                v6 = pg.kytm("kyub", kytj(int ), (int)7);
                                ** GOTO lbl49
                            }
                            case 129377308: {
                                v6 = pg.kytm("kyuc", kytj(int ), (int)8);
lbl49:
                                // 3 sources

                                v5 /* !! */  = (long)(v6 - pg.kytm("kytz", kytj(int ), (int)5));
                                continue block21;
                            }
                            case 422500346: {
                                return Arrays.asList(v4);
                            }
                        }
                        break;
                    }
                    return Arrays.asList(v4);
                }
                case 3: {
                    var2_2 /* !! */  = (int)pg.kytm("kyug", kyto(int ), (int)7);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)pg.kytm("kyud", kyto(int ), (int)4);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)pg.kytm("kyuf", kyto(int ), (int)6);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl71
            break;
        }
        do {
            if (true) ** continue;
lbl71:
            // 2 sources

            var2_2 /* !! */  = (int)pg.kytm("kyue", kyto(int ), (int)5);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void kyuk() {
        pg.kytl[0] = -8492541247630275458L;
        pg.kytl[1] = 2271957948714067755L;
        pg.kytl[2] = -2899353584778998152L;
        pg.kytl[3] = -686593363933167117L;
        pg.kytl[4] = 2782865502877185357L;
        pg.kytl[5] = 3213114221174410260L;
        pg.kytl[6] = -4590465782587547730L;
        pg.kytl[7] = 1023895887799385854L;
        pg.kytl[8] = -6418681870784556753L;
    }

    public static /* synthetic */ CallSite kytm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

