/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2248
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2248;
import ruhack.phobia.bc;

public class ct
extends bc {
    private static long[] dsgt;
    public static final int b;
    public static final boolean a;
    private static int[] dsgy;
    private static int[] dsgx;
    private class_2248 block;
    public static final long ix = -3651066769682669767L;
    public static final boolean c;
    private static long[] dsgs;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ct(class_2248 var1_1) {
        var3_2 /* !! */  = ct.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_3 = ct.a;
                super();
                this.block = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ct.dsgu("dsig", dsgw(int ), (int)17);
            }
            case 1: {
                var3_2 /* !! */  = (int)ct.dsgu("dsih", dsgw(int ), (int)18);
                ** GOTO lbl9
            }
            case 2: 
        }
        while (true) {
            var3_2 /* !! */  = (int)ct.dsgu("dsii", dsgw(int ), (int)19);
        }
    }

    private static /* synthetic */ void dsij() {
        ct.dsgx[0] = -928607732;
        ct.dsgx[1] = 162517212;
        ct.dsgx[2] = 693252347;
        ct.dsgx[3] = -1913091450;
        ct.dsgx[4] = -1013269466;
        ct.dsgx[5] = 1584880078;
        ct.dsgx[6] = 896815138;
        ct.dsgx[7] = -221958500;
        ct.dsgx[8] = -224981973;
        ct.dsgx[9] = 1148059732;
        ct.dsgx[10] = -428183212;
        ct.dsgx[11] = 1815737234;
        ct.dsgx[12] = 836897541;
        ct.dsgx[13] = 283556002;
        ct.dsgx[14] = 1973245765;
        ct.dsgx[15] = 688906134;
        ct.dsgx[16] = 1859988802;
        ct.dsgx[17] = 192289017;
        ct.dsgx[18] = -253816594;
        ct.dsgx[19] = -1206569353;
    }

    private static /* synthetic */ void dsik() {
        ct.dsgy[0] = -928607731;
        ct.dsgy[1] = -495807397;
        ct.dsgy[2] = -693252348;
        ct.dsgy[3] = 1986373215;
        ct.dsgy[4] = -1013269465;
        ct.dsgy[5] = 1584880074;
        ct.dsgy[6] = 896815136;
        ct.dsgy[7] = -221958504;
        ct.dsgy[8] = -224981969;
        ct.dsgy[9] = 1148059733;
        ct.dsgy[10] = -661198366;
        ct.dsgy[11] = 1815737235;
        ct.dsgy[12] = -1075697587;
        ct.dsgy[13] = 283556000;
        ct.dsgy[14] = 1973245766;
        ct.dsgy[15] = 688906134;
        ct.dsgy[16] = 1859988801;
        ct.dsgy[17] = 192289017;
        ct.dsgy[18] = -253816593;
        ct.dsgy[19] = -1206569353;
    }

    private static /* synthetic */ long dsgr(int n2) {
        return dsgs[n2] ^ dsgt[n2];
    }

    private static /* synthetic */ int dsgw(int n2) {
        return dsgx[n2] ^ dsgy[n2];
    }

    private static /* synthetic */ void dsil() {
        ct.dsgs[0] = 5816669836876291207L;
        ct.dsgs[1] = -4778559540249070427L;
        ct.dsgs[2] = -7101678870990929284L;
        ct.dsgs[3] = 5677053161529955686L;
        ct.dsgs[4] = -8096324851193654245L;
        ct.dsgs[5] = 556208361955936191L;
        ct.dsgs[6] = -4947892758601508398L;
        ct.dsgs[7] = 5621474625076722585L;
        ct.dsgs[8] = -8070847754673576456L;
        ct.dsgs[9] = -1228284794879799456L;
        ct.dsgs[10] = 7666244977247877278L;
        ct.dsgs[11] = 6916423659124227412L;
        ct.dsgs[12] = -2156728307379320940L;
        ct.dsgs[13] = -7489505279311788893L;
        ct.dsgs[14] = -3669078916128273755L;
        ct.dsgs[15] = 5610837721583817349L;
    }

    public static /* synthetic */ CallSite dsgu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setBlock(class_2248 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ct.ix - ct.dsgu("dsgv", dsgr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ct.dsgu("dsha", dsgw(int ), (int)0)) break;
            v0 /* !! */  = (long)ct.dsgu("dshb", dsgw(int ), (int)1);
        }
        var4_2 = ct.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ct.ix - ct.dsgu("dshc", dsgr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ct.dsgu("dshd", dsgw(int ), (int)2)) break;
            v1 /* !! */  = (long)ct.dsgu("dshe", dsgw(int ), (int)3);
        }
        var3_3 /* !! */  = ct.b;
        v2 /* !! */  = ct.ix;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ct.dsgu("dshf", dsgr(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -36380871: {
                    break block18;
                }
                case 61708167: {
                    v3 = ct.dsgu("dshg", dsgr(int ), (int)3);
                    continue block18;
                }
                case 879845930: {
                    v3 = ct.dsgu("dshh", dsgr(int ), (int)4);
                    continue block18;
                }
            }
            break;
        }
        var2_4 = ct.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ct.ix;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(ct.dsgu("dshj", dsgr(int ), (int)6) - ct.dsgu("dshi", dsgr(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -36380871: {
                            break block20;
                        }
                        case 49911167: {
                            continue block20;
                        }
                    }
                    break;
                }
                this.block = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ct.dsgu("dshk", dsgw(int ), (int)4);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ct.dsgu("dshl", dsgw(int ), (int)5);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ct.dsgu("dshm", dsgw(int ), (int)6);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ct.dsgu("dshn", dsgw(int ), (int)7);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)ct.dsgu("dsho", dsgw(int ), (int)8);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2248 getBlock() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ct.ix - ct.dsgu("dshp", dsgr(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ct.dsgu("dshq", dsgw(int ), (int)9)) break;
            v0 /* !! */  = (long)ct.dsgu("dshr", dsgw(int ), (int)10);
        }
        var3_1 = ct.c;
        v1 /* !! */  = ct.ix;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ct.dsgu("dshs", dsgr(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -36380871: {
                    break block12;
                }
                case 1345702642: {
                    v2 = ct.dsgu("dsht", dsgr(int ), (int)9);
                    continue block12;
                }
                case 1371289625: {
                    v2 = ct.dsgu("dshu", dsgr(int ), (int)10);
                    continue block12;
                }
            }
            break;
        }
        var2_2 = ct.b;
        v3 /* !! */  = ct.ix;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - ct.dsgu("dshv", dsgr(int ), (int)11));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2113910716: {
                    v4 = ct.dsgu("dshw", dsgr(int ), (int)12);
                    continue block13;
                }
                case -1905433133: {
                    v4 = ct.dsgu("dshx", dsgr(int ), (int)13);
                    continue block13;
                }
                case -36380871: {
                    break block13;
                }
                case 1776270312: {
                    v4 = ct.dsgu("dshy", dsgr(int ), (int)14);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = ct.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ct.ix - ct.dsgu("dshz", dsgr(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ct.dsgu("dsia", dsgw(int ), (int)11)) break;
            v5 /* !! */  = (long)ct.dsgu("dsib", dsgw(int ), (int)12);
        }
        return this.block;
    }

    static {
        dsgx = new int[20];
        dsgy = new int[20];
        ct.dsij();
        ct.dsik();
        dsgs = new long[16];
        dsgt = new long[16];
        ct.dsil();
        ct.dsim();
    }

    private static /* synthetic */ void dsim() {
        ct.dsgt[0] = -7418426684339189672L;
        ct.dsgt[1] = 7929132338043979824L;
        ct.dsgt[2] = 3798564582449468052L;
        ct.dsgt[3] = -7774033050039074252L;
        ct.dsgt[4] = 2134353486233175465L;
        ct.dsgt[5] = 7538755227359654562L;
        ct.dsgt[6] = -8428447669727189815L;
        ct.dsgt[7] = -825980252175961684L;
        ct.dsgt[8] = -8941054895085519119L;
        ct.dsgt[9] = -4472889778287640426L;
        ct.dsgt[10] = -439844251021834868L;
        ct.dsgt[11] = 7230417483499146842L;
        ct.dsgt[12] = 7847482177947442384L;
        ct.dsgt[13] = 8429610126853499775L;
        ct.dsgt[14] = -2079786425935355156L;
        ct.dsgt[15] = -2542138506510760359L;
    }
}

