/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import ruhack.phobia.bc;

public class cw
extends bc {
    public static final boolean c;
    private final boolean pre;
    protected static final long iu = 3171266641029717545L;
    public static final int b;
    private static long[] drhj;
    private static long[] drhi;
    private static int[] drgl;
    public static final boolean a;
    private static int[] drgm;
    private class_243 motion;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getMotion() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cw.iu - cw.drgu("drhk", drhh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cw.drgu("drhl", drgk(int ), (int)5)) break;
            v0 /* !! */  = (long)cw.drgu("drhm", drgk(int ), (int)6);
        }
        var3_1 = cw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cw.iu - cw.drgu("drhn", drhh(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cw.drgu("drhv", drgk(int ), (int)7)) break;
            v1 /* !! */  = (long)cw.drgu("drhw", drgk(int ), (int)8);
        }
        var2_2 /* !! */  = cw.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cw.iu - cw.drgu("drhx", drhh(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cw.drgu("drhy", drgk(int ), (int)9)) break;
            v2 /* !! */  = (long)cw.drgu("drhz", drgk(int ), (int)10);
        }
        var1_3 = cw.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = cw.iu;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - cw.drgu("dria", drhh(int ), (int)3));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 983522857: {
                            break block15;
                        }
                        case 1106645710: {
                            v4 = cw.drgu("drib", drhh(int ), (int)4);
                            continue block15;
                        }
                        case 1615415927: {
                            v4 = cw.drgu("drih", drhh(int ), (int)5);
                            continue block15;
                        }
                    }
                    break;
                }
                return this.motion;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)cw.drgu("drij", drgk(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl49:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)cw.drgu("drik", drgk(int ), (int)12);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cw.drgu("dril", drgk(int ), (int)13);
                    if (!var3_1) ** GOTO lbl49
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cw.drgu("drim", drgk(int ), (int)14);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long drhh(int n2) {
        return drhi[n2] ^ drhj[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public cw(class_243 var1_1, boolean var2_2) {
        block9: {
            var4_3 /* !! */  = cw.b;
            super();
            this.motion = var1_1;
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.pre = var2_2;
                        return;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)cw.drgu("drgv", drgk(int ), (int)0);
                        break block9;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)cw.drgu("drgy", drgk(int ), (int)3);
                        break block9;
                    }
                    case 4: {
                        break block9;
                    }
lbl22:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 2;
                        var4_3 /* !! */  = (int)cw.drgu("drgw", drgk(int ), (int)1);
                        break;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)cw.drgu("drgx", drgk(int ), (int)2);
        }
        var4_3 /* !! */  = (int)cw.drgu("drha", drgk(int ), (int)4);
        ** while (true)
    }

    static {
        drgl = new int[36];
        drgm = new int[36];
        cw.drky();
        cw.drlf();
        drhi = new long[20];
        drhj = new long[20];
        cw.drln();
        cw.drlp();
    }

    public static /* synthetic */ CallSite drgu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void drlp() {
        cw.drhj[0] = -483568322101225660L;
        cw.drhj[1] = 3632849559726768147L;
        cw.drhj[2] = -3498482180537572203L;
        cw.drhj[3] = 4972159225122986277L;
        cw.drhj[4] = -8360384266383055300L;
        cw.drhj[5] = 2868645299417239921L;
        cw.drhj[6] = -8174884166073635691L;
        cw.drhj[7] = 8628792894450375458L;
        cw.drhj[8] = 2194888541280948104L;
        cw.drhj[9] = -4504654285256296085L;
        cw.drhj[10] = 3785464249399794447L;
        cw.drhj[11] = -2025563811257932757L;
        cw.drhj[12] = -4450108710673908040L;
        cw.drhj[13] = -8243180332480827162L;
        cw.drhj[14] = -3485507650281524631L;
        cw.drhj[15] = 1699980443477778120L;
        cw.drhj[16] = -2893146477852201277L;
        cw.drhj[17] = 4784378618409369129L;
        cw.drhj[18] = 487337960210316998L;
        cw.drhj[19] = -9086846193796690470L;
    }

    private static /* synthetic */ void drln() {
        cw.drhi[0] = 366640134134096709L;
        cw.drhi[1] = -4990264401947834635L;
        cw.drhi[2] = 4565340947283279628L;
        cw.drhi[3] = 8227008570193009822L;
        cw.drhi[4] = 5525031140385382782L;
        cw.drhi[5] = -1886029855904450679L;
        cw.drhi[6] = -4827653142761410251L;
        cw.drhi[7] = -1990957155646414519L;
        cw.drhi[8] = 5502996840069092929L;
        cw.drhi[9] = 6245769776772962951L;
        cw.drhi[10] = 215054964697250020L;
        cw.drhi[11] = -1432768384428992291L;
        cw.drhi[12] = 1394928917998561881L;
        cw.drhi[13] = 6566473672407520657L;
        cw.drhi[14] = -374347029353027309L;
        cw.drhi[15] = -7104688429245219526L;
        cw.drhi[16] = 8560282587035033580L;
        cw.drhi[17] = -6621162996238415560L;
        cw.drhi[18] = -37738819661613842L;
        cw.drhi[19] = -7998766860340060564L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setMotion(class_243 class_2432) {
        boolean bl2;
        Object object = iu;
        block4: while (true) {
            switch ((int)object) {
                case -1991028446: {
                    object = cw.drgu("driu", drhh(int ), (int)7) - cw.drgu("drin", drhh(int ), (int)6);
                    continue block4;
                }
                case 983522857: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = iu - cw.drgu("driv", drhh(int ), (int)8)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == cw.drgu("drix", drgk(int ), (int)15)) break;
            object2 = cw.drgu("driy", drgk(int ), (int)16);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = iu - cw.drgu("driz", drhh(int ), (int)9)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == cw.drgu("drja", drgk(int ), (int)17)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = cw.drgu("drjb", drgk(int ), (int)18);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = iu - cw.drgu("drjf", drhh(int ), (int)10)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == cw.drgu("drjg", drgk(int ), (int)19)) {
                this.motion = class_2432;
                if (bl2) return;
                break;
            }
            object4 = cw.drgu("drjh", drgk(int ), (int)20);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void drlf() {
        cw.drgm[0] = -1729930302;
        cw.drgm[1] = 298457528;
        cw.drgm[2] = -126261567;
        cw.drgm[3] = 2114081317;
        cw.drgm[4] = 1812137221;
        cw.drgm[5] = 1097419864;
        cw.drgm[6] = -870182014;
        cw.drgm[7] = 2030090406;
        cw.drgm[8] = 710013523;
        cw.drgm[9] = -283930762;
        cw.drgm[10] = 82376220;
        cw.drgm[11] = 2125021209;
        cw.drgm[12] = 1171121470;
        cw.drgm[13] = -368945891;
        cw.drgm[14] = 982564869;
        cw.drgm[15] = -352753284;
        cw.drgm[16] = 1247697620;
        cw.drgm[17] = -1201352591;
        cw.drgm[18] = 561054787;
        cw.drgm[19] = 842146847;
        cw.drgm[20] = 2137937480;
        cw.drgm[21] = 1644871110;
        cw.drgm[22] = -1885357189;
        cw.drgm[23] = 709439915;
        cw.drgm[24] = -45896893;
        cw.drgm[25] = 1434883051;
        cw.drgm[26] = -344137765;
        cw.drgm[27] = -1214927036;
        cw.drgm[28] = -336082470;
        cw.drgm[29] = 303477606;
        cw.drgm[30] = -1279050298;
        cw.drgm[31] = 1616346939;
        cw.drgm[32] = -1148817407;
        cw.drgm[33] = -469723746;
        cw.drgm[34] = 299703031;
        cw.drgm[35] = -174699922;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isPre() {
        v0 /* !! */  = cw.iu;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - cw.drgu("drjr", drhh(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 410611284: {
                    v1 = cw.drgu("drjt", drhh(int ), (int)12);
                    continue block17;
                }
                case 983522857: {
                    break block17;
                }
                case 2145425010: {
                    v1 = cw.drgu("drjv", drhh(int ), (int)13);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = cw.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = cw.iu - cw.drgu("drjw", drhh(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cw.drgu("drjx", drgk(int ), (int)27)) break;
            v2 /* !! */  = (long)cw.drgu("drjz", drgk(int ), (int)28);
        }
        var2_2 /* !! */  = cw.b;
        v3 /* !! */  = cw.iu;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - cw.drgu("drka", drhh(int ), (int)15));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 275681889: {
                    v4 = cw.drgu("drkc", drhh(int ), (int)16);
                    continue block19;
                }
                case 656376412: {
                    v4 = cw.drgu("drke", drhh(int ), (int)17);
                    continue block19;
                }
                case 983522857: {
                    break block19;
                }
                case 1782974146: {
                    v4 = cw.drgu("drkf", drhh(int ), (int)18);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = cw.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)cw.drgu("drkk", drgk(int ), (int)29);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = cw.iu - cw.drgu("drkl", drhh(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == cw.drgu("drkm", drgk(int ), (int)30)) break;
                    v5 /* !! */  = (long)cw.drgu("drkn", drgk(int ), (int)31);
                }
                return this.pre;
            }
lbl55:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cw.drgu("drko", drgk(int ), (int)32);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)cw.drgu("drkp", drgk(int ), (int)33);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)cw.drgu("drkt", drgk(int ), (int)34);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cw.drgu("drkv", drgk(int ), (int)35);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int drgk(int n2) {
        return drgl[n2] ^ drgm[n2];
    }

    private static /* synthetic */ void drky() {
        cw.drgl[0] = -1729930302;
        cw.drgl[1] = 298457529;
        cw.drgl[2] = -126261566;
        cw.drgl[3] = 2114081313;
        cw.drgl[4] = 1812137222;
        cw.drgl[5] = 1097419865;
        cw.drgl[6] = 1532861540;
        cw.drgl[7] = 2030090407;
        cw.drgl[8] = -1419559891;
        cw.drgl[9] = -283930761;
        cw.drgl[10] = -669033496;
        cw.drgl[11] = 2125021209;
        cw.drgl[12] = 1171121469;
        cw.drgl[13] = -368945890;
        cw.drgl[14] = 982564870;
        cw.drgl[15] = 352753283;
        cw.drgl[16] = 1357857101;
        cw.drgl[17] = -1201352592;
        cw.drgl[18] = -787327432;
        cw.drgl[19] = -842146848;
        cw.drgl[20] = 1250773097;
        cw.drgl[21] = 1644871107;
        cw.drgl[22] = -1885357185;
        cw.drgl[23] = 709439913;
        cw.drgl[24] = -45896889;
        cw.drgl[25] = 1434883054;
        cw.drgl[26] = -344137761;
        cw.drgl[27] = 1214927035;
        cw.drgl[28] = -1887744292;
        cw.drgl[29] = 303477607;
        cw.drgl[30] = -1279050297;
        cw.drgl[31] = 666425793;
        cw.drgl[32] = -1148817408;
        cw.drgl[33] = -469723748;
        cw.drgl[34] = 299703029;
        cw.drgl[35] = -174699923;
    }
}

