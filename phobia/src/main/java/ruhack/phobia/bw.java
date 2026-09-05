/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import ruhack.phobia.bc;

public class bw
extends bc {
    public static final boolean c;
    private static int[] dzqh;
    private class_1297 entity;
    private static long[] dzqp;
    private static long[] dzqq;
    private static final long jv = 1293851609846607928L;
    private static int[] dzqi;
    public static final boolean a;
    public static final int b;

    static {
        dzqh = new int[20];
        dzqi = new int[20];
        bw.dzrz();
        bw.dzsa();
        dzqp = new long[15];
        dzqq = new long[15];
        bw.dzsc();
        bw.dzsd();
    }

    private static /* synthetic */ void dzsa() {
        bw.dzqi[0] = -1716464090;
        bw.dzqi[1] = -1488796967;
        bw.dzqi[2] = 156974906;
        bw.dzqi[3] = -1373852364;
        bw.dzqi[4] = 1353683287;
        bw.dzqi[5] = 1499663637;
        bw.dzqi[6] = -454014880;
        bw.dzqi[7] = 1738771946;
        bw.dzqi[8] = 1614372249;
        bw.dzqi[9] = 446055973;
        bw.dzqi[10] = 0x7766AA66;
        bw.dzqi[11] = -1651711079;
        bw.dzqi[12] = 294568547;
        bw.dzqi[13] = -1795765565;
        bw.dzqi[14] = -2132026473;
        bw.dzqi[15] = -1419979659;
        bw.dzqi[16] = 1459881812;
        bw.dzqi[17] = 1999965760;
        bw.dzqi[18] = 2086560473;
        bw.dzqi[19] = -1447068907;
    }

    public static /* synthetic */ CallSite dzqj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bw(class_1297 var1_1) {
        var3_2 /* !! */  = bw.b;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.entity = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)bw.dzqj("dzqk", dzqg(int ), (int)0);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)bw.dzqj("dzqm", dzqg(int ), (int)1);
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)bw.dzqj("dzqn", dzqg(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ int dzqg(int n2) {
        return dzqh[n2] ^ dzqi[n2];
    }

    private static /* synthetic */ void dzsd() {
        bw.dzqq[0] = 8373208989447854891L;
        bw.dzqq[1] = -8811692627175166462L;
        bw.dzqq[2] = 5356766206832132552L;
        bw.dzqq[3] = -5999578454712488361L;
        bw.dzqq[4] = -478392656287632733L;
        bw.dzqq[5] = -5877751299637600420L;
        bw.dzqq[6] = -1105986301116229362L;
        bw.dzqq[7] = 3581230360383014957L;
        bw.dzqq[8] = -6310398803851544656L;
        bw.dzqq[9] = 2205640304760190755L;
        bw.dzqq[10] = -3743999489105812636L;
        bw.dzqq[11] = -1539388269585885595L;
        bw.dzqq[12] = 5318854555612109937L;
        bw.dzqq[13] = 7446898776724015215L;
        bw.dzqq[14] = -8731921136869030242L;
    }

    private static /* synthetic */ void dzrz() {
        bw.dzqh[0] = -1716464090;
        bw.dzqh[1] = -1488796968;
        bw.dzqh[2] = 156974906;
        bw.dzqh[3] = -1373852363;
        bw.dzqh[4] = 1353683285;
        bw.dzqh[5] = 1499663636;
        bw.dzqh[6] = -454014878;
        bw.dzqh[7] = 1738771947;
        bw.dzqh[8] = 441471630;
        bw.dzqh[9] = -446055974;
        bw.dzqh[10] = 1648292777;
        bw.dzqh[11] = -1651711080;
        bw.dzqh[12] = 206731239;
        bw.dzqh[13] = -1795765566;
        bw.dzqh[14] = -1719596360;
        bw.dzqh[15] = -1419979658;
        bw.dzqh[16] = 1459881813;
        bw.dzqh[17] = 1999965761;
        bw.dzqh[18] = 2086560475;
        bw.dzqh[19] = -1447068907;
    }

    private static /* synthetic */ long dzqo(int n2) {
        return dzqp[n2] ^ dzqq[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_1297 getEntity() {
        Object object = jv;
        block19: while (true) {
            switch ((int)object) {
                case 486109240: {
                    break block19;
                }
                case 2138037021: {
                    object = bw.dzqj("dzqs", dzqo(int ), (int)1) - bw.dzqj("dzqr", dzqo(int ), (int)0);
                    continue block19;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = jv;
        block20: while (true) {
            switch ((int)object2) {
                case -1281556999: {
                    object2 = bw.dzqj("dzqu", dzqo(int ), (int)3) - bw.dzqj("dzqt", dzqo(int ), (int)2);
                    continue block20;
                }
                case 486109240: {
                    break block20;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = jv;
        boolean bl3 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object3 = callSite - bw.dzqj("dzqv", dzqo(int ), (int)4);
            }
            switch ((int)object3) {
                case -2100473569: {
                    callSite = bw.dzqj("dzqw", dzqo(int ), (int)5);
                    continue block21;
                }
                case 133294350: {
                    callSite = bw.dzqj("dzqx", dzqo(int ), (int)6);
                    continue block21;
                }
                case 486109240: {
                    break block21;
                }
                case 2008720121: {
                    callSite = bw.dzqj("dzqy", dzqo(int ), (int)7);
                    continue block21;
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
        Object object4 = jv;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - bw.dzqj("dzra", dzqo(int ), (int)8);
            }
            switch ((int)object4) {
                case -2063036486: {
                    callSite = bw.dzqj("dzrb", dzqo(int ), (int)9);
                    continue block22;
                }
                case -791360857: {
                    callSite = bw.dzqj("dzrc", dzqo(int ), (int)10);
                    continue block22;
                }
                case 486109240: {
                    return this.entity;
                }
            }
            break;
        }
        return this.entity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setEntity(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bw.jv - bw.dzqj("dzrh", dzqo(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == bw.dzqj("dzri", dzqg(int ), (int)7)) break;
            v0 /* !! */  = (long)bw.dzqj("dzrj", dzqg(int ), (int)8);
        }
        var4_2 = bw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bw.jv - bw.dzqj("dzrk", dzqo(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == bw.dzqj("dzrl", dzqg(int ), (int)9)) break;
            v1 /* !! */  = (long)bw.dzqj("dzrm", dzqg(int ), (int)10);
        }
        var3_3 /* !! */  = bw.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = bw.jv - bw.dzqj("dzrn", dzqo(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == bw.dzqj("dzro", dzqg(int ), (int)11)) break;
            v2 /* !! */  = (long)bw.dzqj("dzrp", dzqg(int ), (int)12);
        }
        var2_4 = bw.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = bw.jv - bw.dzqj("dzrq", dzqo(int ), (int)14)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == bw.dzqj("dzrr", dzqg(int ), (int)13)) break;
            v3 /* !! */  = (long)bw.dzqj("dzrs", dzqg(int ), (int)14);
        }
        this.entity = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl36:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)bw.dzqj("dzrt", dzqg(int ), (int)15);
                if (!var4_2) break;
                throw null;
            }
lbl40:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)bw.dzqj("dzrv", dzqg(int ), (int)16);
                if (!var4_2) ** GOTO lbl36
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)bw.dzqj("dzrw", dzqg(int ), (int)17);
                if (!var4_2) ** GOTO lbl40
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)bw.dzqj("dzrx", dzqg(int ), (int)18);
                    if (!var4_2) ** GOTO lbl36
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)bw.dzqj("dzry", dzqg(int ), (int)19);
        ** while (!var4_2)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dzsc() {
        bw.dzqp[0] = -1231785960779396188L;
        bw.dzqp[1] = 1023674117728810544L;
        bw.dzqp[2] = 2955016002720423794L;
        bw.dzqp[3] = -2649472341487029825L;
        bw.dzqp[4] = -833641698193840468L;
        bw.dzqp[5] = -1578307253162510519L;
        bw.dzqp[6] = -1404844102633816394L;
        bw.dzqp[7] = 4253097826964405827L;
        bw.dzqp[8] = 6996587399945355715L;
        bw.dzqp[9] = 7918082349262331265L;
        bw.dzqp[10] = 5574596566660084399L;
        bw.dzqp[11] = 7149336332807467403L;
        bw.dzqp[12] = 1263434620407851192L;
        bw.dzqp[13] = -8427917760663105403L;
        bw.dzqp[14] = 8737823507018413527L;
    }
}

