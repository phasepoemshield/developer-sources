/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class iv$MathHelper {
    public static final boolean c;
    public static final int b;
    public static final boolean a;
    private static long[] jaa;
    private static int[] jaf;
    static final long an = -139851958131664900L;
    private static int[] jag;
    private static long[] jab;

    private iv$MathHelper() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float clamp(float var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iv$MathHelper.an - iv$MathHelper.jac("jad", izz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == iv$MathHelper.jac("jah", jae(int ), (int)0)) break;
            v0 /* !! */  = (long)iv$MathHelper.jac("jaj", jae(int ), (int)1);
        }
        var5_3 = iv$MathHelper.c;
        v1 /* !! */  = iv$MathHelper.an;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - iv$MathHelper.jac("jal", izz(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1838458884: {
                    break block17;
                }
                case -569790503: {
                    v2 = iv$MathHelper.jac("jam", izz(int ), (int)2);
                    continue block17;
                }
                case 720570173: {
                    v2 = iv$MathHelper.jac("jao", izz(int ), (int)3);
                    continue block17;
                }
                case 1707612587: {
                    v2 = iv$MathHelper.jac("jap", izz(int ), (int)4);
                    continue block17;
                }
            }
            break;
        }
        var4_4 /* !! */  = iv$MathHelper.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iv$MathHelper.an - iv$MathHelper.jac("jaq", izz(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == iv$MathHelper.jac("jas", jae(int ), (int)2)) break;
            v3 /* !! */  = (long)iv$MathHelper.jac("jat", jae(int ), (int)3);
        }
        var3_5 = iv$MathHelper.a;
        if (var5_3) {
            throw null;
lbl32:
            // 2 sources

            return (float)iv$MathHelper.jac("jaw", jav(int ), (int)4);
        }
        if (var3_5) ** GOTO lbl32
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = iv$MathHelper.an - iv$MathHelper.jac("jay", izz(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == iv$MathHelper.jac("jba", jae(int ), (int)5)) break;
                    v4 /* !! */  = (long)iv$MathHelper.jac("jbc", jae(int ), (int)6);
                }
                v5 = Math.min(var2_2, var0);
                v6 /* !! */  = iv$MathHelper.an;
                if (true) ** GOTO lbl49
                block21: while (true) {
                    v6 /* !! */  = (long)(iv$MathHelper.jac("jbg", izz(int ), (int)8) - iv$MathHelper.jac("jbe", izz(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1975928624: {
                            continue block21;
                        }
                        case -1838458884: {
                            break block21;
                        }
                    }
                    break;
                }
                return Math.max(var1_1, v5);
            }
            case 0: {
                var4_4 /* !! */  = (int)iv$MathHelper.jac("jbi", jae(int ), (int)7);
                if (var5_3) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)iv$MathHelper.jac("jbk", jae(int ), (int)8);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var4_4 /* !! */  = (int)iv$MathHelper.jac("jbm", jae(int ), (int)9);
                } while (!var5_3);
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)iv$MathHelper.jac("jbo", jae(int ), (int)10);
        ** while (!var5_3)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long izz(int n2) {
        return jaa[n2] ^ jab[n2];
    }

    private static /* synthetic */ float jav(int n2) {
        return Float.intBitsToFloat(jaf[n2] ^ jag[n2]);
    }

    private static /* synthetic */ void jbs() {
        iv$MathHelper.jaf[0] = -333851880;
        iv$MathHelper.jaf[1] = -1705386406;
        iv$MathHelper.jaf[2] = -813651725;
        iv$MathHelper.jaf[3] = 636101575;
        iv$MathHelper.jaf[4] = 285074740;
        iv$MathHelper.jaf[5] = 561627789;
        iv$MathHelper.jaf[6] = -1057950801;
        iv$MathHelper.jaf[7] = 1995216237;
        iv$MathHelper.jaf[8] = -640855648;
        iv$MathHelper.jaf[9] = -521748363;
        iv$MathHelper.jaf[10] = -265214130;
    }

    private static /* synthetic */ void jbv() {
        iv$MathHelper.jag[0] = -333851879;
        iv$MathHelper.jag[1] = -1219928955;
        iv$MathHelper.jag[2] = -813651726;
        iv$MathHelper.jag[3] = 1271008446;
        iv$MathHelper.jag[4] = 775599444;
        iv$MathHelper.jag[5] = -561627790;
        iv$MathHelper.jag[6] = -1309157943;
        iv$MathHelper.jag[7] = 1995216237;
        iv$MathHelper.jag[8] = -640855648;
        iv$MathHelper.jag[9] = -521748361;
        iv$MathHelper.jag[10] = -265214131;
    }

    private static /* synthetic */ void jcb() {
        iv$MathHelper.jab[0] = 5165578982353326952L;
        iv$MathHelper.jab[1] = -7566573820488859150L;
        iv$MathHelper.jab[2] = 6485704162472573435L;
        iv$MathHelper.jab[3] = 25379655385366062L;
        iv$MathHelper.jab[4] = -1875758952459017045L;
        iv$MathHelper.jab[5] = 8494141148298915242L;
        iv$MathHelper.jab[6] = -3035333124781998935L;
        iv$MathHelper.jab[7] = -392286979041542673L;
        iv$MathHelper.jab[8] = 4885822258649322242L;
    }

    private static /* synthetic */ void jbz() {
        iv$MathHelper.jaa[0] = -7359350191702254752L;
        iv$MathHelper.jaa[1] = -296492113179732535L;
        iv$MathHelper.jaa[2] = 7129320536802862125L;
        iv$MathHelper.jaa[3] = -1488084264407953657L;
        iv$MathHelper.jaa[4] = 3060168624541290070L;
        iv$MathHelper.jaa[5] = -5506947072502986205L;
        iv$MathHelper.jaa[6] = -5354006837417886946L;
        iv$MathHelper.jaa[7] = 7430876846868077619L;
        iv$MathHelper.jaa[8] = 8991403849243148114L;
    }

    public static /* synthetic */ CallSite jac(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        jaf = new int[11];
        jag = new int[11];
        iv$MathHelper.jbs();
        iv$MathHelper.jbv();
        jaa = new long[9];
        jab = new long[9];
        iv$MathHelper.jbz();
        iv$MathHelper.jcb();
    }

    private static /* synthetic */ int jae(int n2) {
        return jaf[n2] ^ jag[n2];
    }
}

