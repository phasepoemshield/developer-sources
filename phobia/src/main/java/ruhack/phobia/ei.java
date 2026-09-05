/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.aw;
import ruhack.phobia.ck;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;

public class ei
extends ds {
    public static final boolean c;
    private static int[] vtg;
    public static final boolean a;
    static final long bi = -9066517783231056504L;
    private static int[] vth;
    private static long[] vto;
    private static long[] vtn;
    public static final int b;

    private static /* synthetic */ void vuq() {
        ei.vtn[0] = 2694790712090852623L;
        ei.vtn[1] = 8502865549379399029L;
        ei.vtn[2] = 8446332757097008570L;
        ei.vtn[3] = 7446628840256269105L;
        ei.vtn[4] = 4806627778801988156L;
        ei.vtn[5] = -3313820387087395139L;
        ei.vtn[6] = -7944940214337318412L;
        ei.vtn[7] = 1636198239982175024L;
        ei.vtn[8] = 3049036571753875141L;
        ei.vtn[9] = 3710886828202973856L;
        ei.vtn[10] = 2311846144455272584L;
    }

    private static /* synthetic */ int vtf(int n2) {
        return vtg[n2] ^ vth[n2];
    }

    public ei() {
        int n2 = b;
        super("NoFriendDamage", "No Friend Damage", du.LEGIT);
    }

    static {
        vtg = new int[17];
        vth = new int[17];
        ei.vuo();
        ei.vup();
        vtn = new long[11];
        vto = new long[11];
        ei.vuq();
        ei.vur();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onAttack(ck var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ei.bi - ei.vti("vtp", vtm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ei.vti("vtq", vtf(int ), (int)3)) break;
            v0 /* !! */  = (long)ei.vti("vtr", vtf(int ), (int)4);
        }
        var4_2 = ei.c;
        v1 /* !! */  = ei.bi;
        if (true) ** GOTO lbl11
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ei.vti("vts", vtm(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1516360675: {
                    v2 = ei.vti("vtt", vtm(int ), (int)2);
                    continue block12;
                }
                case -725600888: {
                    break block12;
                }
                case -266024739: {
                    v2 = ei.vti("vtu", vtm(int ), (int)3);
                    continue block12;
                }
                case -116321281: {
                    v2 = ei.vti("vtv", vtm(int ), (int)4);
                    continue block12;
                }
            }
            break;
        }
        var3_3 = ei.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ei.bi - ei.vti("vtw", vtm(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ei.vti("vtx", vtf(int ), (int)5)) break;
            v3 /* !! */  = (long)ei.vti("vty", vtf(int ), (int)6);
        }
        var2_4 = ei.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ei.bi - ei.vti("vtz", vtm(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ei.vti("vua", vtf(int ), (int)7)) break;
            v4 /* !! */  = (long)ei.vti("vub", vtf(int ), (int)8);
        }
        v5 = var1_1.getEntity();
        v6 /* !! */  = ei.bi;
        if (true) ** GOTO lbl45
        block16: while (true) {
            v6 /* !! */  = (long)(v7 - ei.vti("vuc", vtm(int ), (int)7));
lbl45:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1130303672: {
                    v7 = ei.vti("vud", vtm(int ), (int)8);
                    continue block16;
                }
                case -1126502039: {
                    v7 = ei.vti("vue", vtm(int ), (int)9);
                    continue block16;
                }
                case -725600888: {
                    break block16;
                }
            }
            break;
        }
        v8 = dl.isFriend(v5);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = ei.bi - ei.vti("vuf", vtm(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ei.vti("vug", vtf(int ), (int)9)) break;
            v9 /* !! */  = (long)ei.vti("vuh", vtf(int ), (int)10);
        }
        var1_1.setCancelled(v8);
        ** while (var2_4 || var2_4)
lbl62:
        // 1 sources

    }

    private static /* synthetic */ void vur() {
        ei.vto[0] = 9215561819428548794L;
        ei.vto[1] = -2065263041898063031L;
        ei.vto[2] = -6329865081386299620L;
        ei.vto[3] = 1470249035841952329L;
        ei.vto[4] = -7030009599697086222L;
        ei.vto[5] = 7256951802104062507L;
        ei.vto[6] = -3849434066672261106L;
        ei.vto[7] = 3961307149464631597L;
        ei.vto[8] = 1483213883525356697L;
        ei.vto[9] = -6356612051319925352L;
        ei.vto[10] = 3350702864808331463L;
    }

    public static /* synthetic */ CallSite vti(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long vtm(int n2) {
        return vtn[n2] ^ vto[n2];
    }

    private static /* synthetic */ void vup() {
        ei.vth[0] = -1662214495;
        ei.vth[1] = -1203364929;
        ei.vth[2] = 561733161;
        ei.vth[3] = -46135345;
        ei.vth[4] = -1575122995;
        ei.vth[5] = 20017243;
        ei.vth[6] = 2011372437;
        ei.vth[7] = 1609645547;
        ei.vth[8] = 2950150;
        ei.vth[9] = -2027859330;
        ei.vth[10] = 275694119;
        ei.vth[11] = -82505045;
        ei.vth[12] = -1164744125;
        ei.vth[13] = 87182612;
        ei.vth[14] = 267093418;
        ei.vth[15] = -2025990686;
        ei.vth[16] = 701629258;
    }

    private static /* synthetic */ void vuo() {
        ei.vtg[0] = -1662214495;
        ei.vtg[1] = -1203364931;
        ei.vtg[2] = 561733160;
        ei.vtg[3] = 46135344;
        ei.vtg[4] = 2011796343;
        ei.vtg[5] = -20017244;
        ei.vtg[6] = -1155998828;
        ei.vtg[7] = -1609645548;
        ei.vtg[8] = 334004798;
        ei.vtg[9] = 2027859329;
        ei.vtg[10] = 508143473;
        ei.vtg[11] = -82505046;
        ei.vtg[12] = -1164744121;
        ei.vtg[13] = 87182612;
        ei.vtg[14] = 267093419;
        ei.vtg[15] = -2025990686;
        ei.vtg[16] = 701629257;
    }
}

