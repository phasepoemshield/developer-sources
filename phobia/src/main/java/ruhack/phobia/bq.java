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

public class bq
extends bc {
    private static final long kc = -3081797875790680151L;
    private static int[] eamh = new int[9];
    public static final boolean a;
    private static long[] ealr;
    public static final boolean c;
    private static long[] eals;
    public static final int b;
    private static int[] eami;
    private static final bq INSTANCE;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static bq get() {
        v0 /* !! */  = bq.kc;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - bq.ealt("ealu", ealq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1387232019: {
                    v1 = bq.ealt("ealv", ealq(int ), (int)1);
                    continue block34;
                }
                case -491146026: {
                    v1 = bq.ealt("ealw", ealq(int ), (int)2);
                    continue block34;
                }
                case -135172183: {
                    break block34;
                }
                case 170980819: {
                    v1 = bq.ealt("ealx", ealq(int ), (int)3);
                    continue block34;
                }
            }
            break;
        }
        var2 = bq.c;
        v2 /* !! */  = bq.kc;
        if (true) ** GOTO lbl22
        block35: while (true) {
            v2 /* !! */  = (long)(bq.ealt("ealz", ealq(int ), (int)5) - bq.ealt("ealy", ealq(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -313426792: {
                    continue block35;
                }
                case -135172183: {
                    break block35;
                }
            }
            break;
        }
        var1_1 /* !! */  = bq.b;
        v3 /* !! */  = bq.kc;
        if (true) ** GOTO lbl32
        block36: while (true) {
            v3 /* !! */  = (long)(v4 - bq.ealt("eama", ealq(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1496278258: {
                    v4 = bq.ealt("eamb", ealq(int ), (int)7);
                    continue block36;
                }
                case -1231695958: {
                    v4 = bq.ealt("eamc", ealq(int ), (int)8);
                    continue block36;
                }
                case -135172183: {
                    break block36;
                }
                case 123839028: {
                    v4 = bq.ealt("eamd", ealq(int ), (int)9);
                    continue block36;
                }
            }
            break;
        }
        var0_2 = bq.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
lbl50:
                    // 2 sources

                    return null;
                }
                if (var0_2 || var0_2) ** GOTO lbl50
                v5 /* !! */  = bq.kc;
                if (true) ** GOTO lbl57
                block38: while (true) {
                    v5 /* !! */  = (long)(bq.ealt("eamf", ealq(int ), (int)11) - bq.ealt("eame", ealq(int ), (int)10));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -135172183: {
                            break block38;
                        }
                        case 16153938: {
                            continue block38;
                        }
                    }
                    break;
                }
                v6 = bq.ealt("eamj", eamg(int ), (int)0);
                v7 /* !! */  = bq.kc;
                if (true) ** GOTO lbl67
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - bq.ealt("eamk", ealq(int ), (int)12));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -581937835: {
                            v8 = bq.ealt("eaml", ealq(int ), (int)13);
                            continue block39;
                        }
                        case -135172183: {
                            break block39;
                        }
                        case 1188224254: {
                            v8 = bq.ealt("eamm", ealq(int ), (int)14);
                            continue block39;
                        }
                        case 1211641653: {
                            v8 = bq.ealt("eamn", ealq(int ), (int)15);
                            continue block39;
                        }
                    }
                    break;
                }
                bq.INSTANCE.setCancelled((boolean)v6);
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_0 = bq.kc - bq.ealt("eamo", ealq(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == bq.ealt("eamp", eamg(int ), (int)1)) break;
                    v9 /* !! */  = (long)bq.ealt("eamq", eamg(int ), (int)2);
                }
                return bq.INSTANCE;
            }
            case 0: {
                var1_1 /* !! */  = (int)bq.ealt("eamr", eamg(int ), (int)3);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                var1_1 /* !! */  = (int)bq.ealt("eams", eamg(int ), (int)4);
                if (var2) {
                    throw null;
                }
            }
lbl97:
            // 5 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)bq.ealt("eamt", eamg(int ), (int)5);
                } while (!var2);
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)bq.ealt("eamu", eamg(int ), (int)6);
                if (!var2) ** GOTO lbl97
                throw null;
            }
lbl106:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)bq.ealt("eamv", eamg(int ), (int)7);
                    if (!var2) ** GOTO lbl97
                    throw null;
                }
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)bq.ealt("eamw", eamg(int ), (int)8);
        ** while (!var2)
lbl114:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ealt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        eami = new int[9];
        bq.eamx();
        bq.eamy();
        ealr = new long[17];
        eals = new long[17];
        bq.eamz();
        bq.eana();
        INSTANCE = new bq();
    }

    public bq() {
    }

    private static /* synthetic */ void eamy() {
        bq.eami[0] = -786735668;
        bq.eami[1] = 654190898;
        bq.eami[2] = -2011768555;
        bq.eami[3] = 797172863;
        bq.eami[4] = -1361650487;
        bq.eami[5] = -814751877;
        bq.eami[6] = -1459712569;
        bq.eami[7] = 11484039;
        bq.eami[8] = -1151202507;
    }

    private static /* synthetic */ void eamx() {
        bq.eamh[0] = -786735668;
        bq.eamh[1] = -654190899;
        bq.eamh[2] = 365505961;
        bq.eamh[3] = 797172862;
        bq.eamh[4] = -1361650486;
        bq.eamh[5] = -814751879;
        bq.eamh[6] = -1459712574;
        bq.eamh[7] = 11484036;
        bq.eamh[8] = -1151202512;
    }

    private static /* synthetic */ int eamg(int n2) {
        return eamh[n2] ^ eami[n2];
    }

    private static /* synthetic */ long ealq(int n2) {
        return ealr[n2] ^ eals[n2];
    }

    private static /* synthetic */ void eamz() {
        bq.ealr[0] = 1957370370986342972L;
        bq.ealr[1] = 3238936932914876272L;
        bq.ealr[2] = 4027599055391335185L;
        bq.ealr[3] = 8792985046094702127L;
        bq.ealr[4] = -1590094168952422881L;
        bq.ealr[5] = -2262341904360591707L;
        bq.ealr[6] = -3410400182672576788L;
        bq.ealr[7] = 6866201189243854240L;
        bq.ealr[8] = 7078949693827194108L;
        bq.ealr[9] = -412060056348183904L;
        bq.ealr[10] = 7376810857495527241L;
        bq.ealr[11] = 4100689015301539605L;
        bq.ealr[12] = -8499281958226493814L;
        bq.ealr[13] = -3328193271463524630L;
        bq.ealr[14] = 5505655692415856233L;
        bq.ealr[15] = -3801305394297192473L;
        bq.ealr[16] = -8924066077376405564L;
    }

    private static /* synthetic */ void eana() {
        bq.eals[0] = -7368852166363829351L;
        bq.eals[1] = -5580882085607208049L;
        bq.eals[2] = 5919864191575196369L;
        bq.eals[3] = 6828771669636041928L;
        bq.eals[4] = 1837330765843297594L;
        bq.eals[5] = 7223841732252981468L;
        bq.eals[6] = -4422887280862452748L;
        bq.eals[7] = -4464830500352327622L;
        bq.eals[8] = -9173177417989333471L;
        bq.eals[9] = -2045911038550666458L;
        bq.eals[10] = -8445009287547046436L;
        bq.eals[11] = 7175610078620090828L;
        bq.eals[12] = 6501914080515956045L;
        bq.eals[13] = -6954145411594550150L;
        bq.eals[14] = -2647477026990350056L;
        bq.eals[15] = 6715187845245154860L;
        bq.eals[16] = -5358682267070993622L;
    }
}

