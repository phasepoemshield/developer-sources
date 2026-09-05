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

public class bm
extends bc {
    private static int[] duqo;
    public static final int b;
    private static int[] duqn;
    public static final boolean c;
    protected static final long jf = 4674465760341298240L;
    public static final boolean a;
    private static long[] dupv;
    private static long[] dupt;
    private boolean cameraClip;
    private float distance;

    private static /* synthetic */ void duvd() {
        bm.dupt[0] = -4336087953912313120L;
        bm.dupt[1] = -4599007914655281951L;
        bm.dupt[2] = 3086136369153635260L;
        bm.dupt[3] = -7490906422128947215L;
        bm.dupt[4] = -5970284947478086877L;
        bm.dupt[5] = -8400960387979158642L;
        bm.dupt[6] = 2960857703896648477L;
        bm.dupt[7] = -6630135773757199530L;
        bm.dupt[8] = 5964919728744364126L;
        bm.dupt[9] = -6371533604181769561L;
        bm.dupt[10] = 7267508952741958287L;
        bm.dupt[11] = 3631602810118914198L;
        bm.dupt[12] = -4284396922424182227L;
        bm.dupt[13] = 3940927171610490186L;
        bm.dupt[14] = -7480870198201358700L;
        bm.dupt[15] = 3991693486158528894L;
        bm.dupt[16] = 6948176097670976703L;
        bm.dupt[17] = 5553230461387429629L;
        bm.dupt[18] = 1565277753054904740L;
        bm.dupt[19] = -2344637002299371824L;
        bm.dupt[20] = 6357301262657895661L;
        bm.dupt[21] = 1526292923282848042L;
        bm.dupt[22] = -6183193660140078287L;
        bm.dupt[23] = -3619733010839344184L;
        bm.dupt[24] = -5925776822604894095L;
        bm.dupt[25] = 982595767988215004L;
        bm.dupt[26] = 4552449762288338858L;
        bm.dupt[27] = -7629046378110466435L;
        bm.dupt[28] = -8694373769210667047L;
        bm.dupt[29] = -2985904597822192169L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setDistance(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bm.jf - bm.dupw("dutf", dups(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == bm.dupw("dutg", duql(int ), (int)23)) break;
            v0 /* !! */  = (long)bm.dupw("duth", duql(int ), (int)24);
        }
        var4_2 = bm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bm.jf - bm.dupw("duti", dups(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == bm.dupw("dutj", duql(int ), (int)25)) break;
            v1 /* !! */  = (long)bm.dupw("dutk", duql(int ), (int)26);
        }
        var3_3 /* !! */  = bm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = bm.jf - bm.dupw("dutl", dups(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == bm.dupw("dutp", duql(int ), (int)27)) break;
            v2 /* !! */  = (long)bm.dupw("dutq", duql(int ), (int)28);
        }
        var2_4 = bm.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = bm.jf - bm.dupw("dutr", dups(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == bm.dupw("dutt", duql(int ), (int)29)) break;
            v3 /* !! */  = (long)bm.dupw("dutu", duql(int ), (int)30);
        }
        this.distance = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl36:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)bm.dupw("dutv", duql(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)bm.dupw("duty", duql(int ), (int)32);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl50
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)bm.dupw("dutz", duql(int ), (int)33);
                if (!var4_2) ** GOTO lbl36
                throw null;
            }
lbl50:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)bm.dupw("duua", duql(int ), (int)34);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)bm.dupw("duuc", duql(int ), (int)35);
        ** while (!var4_2)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void duuo() {
        bm.duqn[0] = -177501184;
        bm.duqn[1] = 411537202;
        bm.duqn[2] = 2141595364;
        bm.duqn[3] = -1087539404;
        bm.duqn[4] = -153049793;
        bm.duqn[5] = -1089772985;
        bm.duqn[6] = -2102921114;
        bm.duqn[7] = -259210360;
        bm.duqn[8] = -1916578950;
        bm.duqn[9] = 729721325;
        bm.duqn[10] = -1805228045;
        bm.duqn[11] = -1458724871;
        bm.duqn[12] = 1437263583;
        bm.duqn[13] = -28135176;
        bm.duqn[14] = -1603776314;
        bm.duqn[15] = -1592528732;
        bm.duqn[16] = 307210023;
        bm.duqn[17] = 679180701;
        bm.duqn[18] = -519714004;
        bm.duqn[19] = 1025656869;
        bm.duqn[20] = -1668599894;
        bm.duqn[21] = -325165356;
        bm.duqn[22] = -14074593;
        bm.duqn[23] = -643093937;
        bm.duqn[24] = 547967682;
        bm.duqn[25] = 451795013;
        bm.duqn[26] = -24470123;
        bm.duqn[27] = 1875546306;
        bm.duqn[28] = 1487881701;
        bm.duqn[29] = -2116788786;
        bm.duqn[30] = 455384843;
        bm.duqn[31] = -849588217;
        bm.duqn[32] = 1352126884;
        bm.duqn[33] = -481009107;
        bm.duqn[34] = -1684560376;
        bm.duqn[35] = -1391332861;
        bm.duqn[36] = -1785697082;
        bm.duqn[37] = 344447924;
        bm.duqn[38] = 903408537;
        bm.duqn[39] = 1167466917;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getDistance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bm.jf - bm.dupw("durj", dups(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == bm.dupw("durk", duql(int ), (int)7)) break;
            v0 /* !! */  = (long)bm.dupw("durl", duql(int ), (int)8);
        }
        var3_1 = bm.c;
        v1 /* !! */  = bm.jf;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - bm.dupw("durm", dups(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1210151872: {
                    break block23;
                }
                case -744617518: {
                    v2 = bm.dupw("duro", dups(int ), (int)10);
                    continue block23;
                }
                case 2048145933: {
                    v2 = bm.dupw("durp", dups(int ), (int)11);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = bm.b;
        v3 /* !! */  = bm.jf;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - bm.dupw("durq", dups(int ), (int)12));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1871246674: {
                    v4 = bm.dupw("durr", dups(int ), (int)13);
                    continue block24;
                }
                case -1250244951: {
                    v4 = bm.dupw("durs", dups(int ), (int)14);
                    continue block24;
                }
                case -1210151872: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = bm.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (float)bm.dupw("durv", durt(int ), (int)9);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = bm.jf;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - bm.dupw("durw", dups(int ), (int)15));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1210151872: {
                            break block26;
                        }
                        case -907854076: {
                            v6 = bm.dupw("durx", dups(int ), (int)16);
                            continue block26;
                        }
                        case -245681730: {
                            v6 = bm.dupw("dury", dups(int ), (int)17);
                            continue block26;
                        }
                        case 874845084: {
                            v6 = bm.dupw("durz", dups(int ), (int)18);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.distance;
            }
lbl62:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)bm.dupw("dusa", duql(int ), (int)10);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl73
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)bm.dupw("dusb", duql(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl73:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)bm.dupw("dusc", duql(int ), (int)12);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)bm.dupw("dusd", duql(int ), (int)13);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dups(int n2) {
        return dupt[n2] ^ dupv[n2];
    }

    private static /* synthetic */ int duql(int n2) {
        return duqn[n2] ^ duqo[n2];
    }

    private static /* synthetic */ float durt(int n2) {
        return Float.intBitsToFloat(duqn[n2] ^ duqo[n2]);
    }

    private static /* synthetic */ void duvk() {
        bm.dupv[0] = -7415121717905821416L;
        bm.dupv[1] = 8203320062636556980L;
        bm.dupv[2] = 5335615252071118531L;
        bm.dupv[3] = 5054952655323325610L;
        bm.dupv[4] = 8586947411468292255L;
        bm.dupv[5] = 4293871711574471333L;
        bm.dupv[6] = -3825540107671855569L;
        bm.dupv[7] = 5141541632947841722L;
        bm.dupv[8] = 6871337264024202261L;
        bm.dupv[9] = -3889462508431918325L;
        bm.dupv[10] = -5580978531397137591L;
        bm.dupv[11] = -1192625050663330273L;
        bm.dupv[12] = -3447119339183956717L;
        bm.dupv[13] = 8741414869962869631L;
        bm.dupv[14] = 4406542728906489817L;
        bm.dupv[15] = 6980982188730073608L;
        bm.dupv[16] = -6717880869568230378L;
        bm.dupv[17] = 4279221938691937803L;
        bm.dupv[18] = -2223462108003175116L;
        bm.dupv[19] = -574760699422032417L;
        bm.dupv[20] = 6198514432590719376L;
        bm.dupv[21] = -3226532624362623354L;
        bm.dupv[22] = 937399229191003751L;
        bm.dupv[23] = 3977048891656796018L;
        bm.dupv[24] = -8352974531299563977L;
        bm.dupv[25] = -3830916154658686927L;
        bm.dupv[26] = 8232406395153474785L;
        bm.dupv[27] = -6987616721074149734L;
        bm.dupv[28] = 9074998496689131644L;
        bm.dupv[29] = 5683759262494584792L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public bm(boolean var1_1, float var2_2) {
        var4_3 /* !! */  = bm.b;
        var3_4 = bm.a;
        super();
        this.cameraClip = var1_1;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block6: while (true) {
            block8: {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.distance = var2_2;
                        return;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)bm.dupw("duue", duql(int ), (int)36);
                        cfr_temp_0 = 1;
                        break block8;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)bm.dupw("duul", duql(int ), (int)39);
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var4_3 /* !! */  = (int)bm.dupw("duuf", duql(int ), (int)37);
                    }
                    case 2: 
                }
                ** GOTO lbl26
            }
            while (true) {
                if (true) continue block6;
lbl26:
                // 2 sources

                var4_3 /* !! */  = (int)bm.dupw("duuh", duql(int ), (int)38);
                cfr_temp_0 = 1;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCameraClip(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bm.jf - bm.dupw("duse", dups(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == bm.dupw("dusf", duql(int ), (int)14)) break;
            v0 /* !! */  = (long)bm.dupw("dusg", duql(int ), (int)15);
        }
        var4_2 = bm.c;
        v1 /* !! */  = bm.jf;
        if (true) ** GOTO lbl11
        block10: while (true) {
            v1 /* !! */  = (long)(v2 - bm.dupw("dush", dups(int ), (int)20));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1210151872: {
                    break block10;
                }
                case 575785986: {
                    v2 = bm.dupw("dusk", dups(int ), (int)21);
                    continue block10;
                }
                case 1396662603: {
                    v2 = bm.dupw("dusn", dups(int ), (int)22);
                    continue block10;
                }
            }
            break;
        }
        var3_3 = bm.b;
        v3 /* !! */  = bm.jf;
        if (true) ** GOTO lbl25
        block11: while (true) {
            v3 /* !! */  = (long)(bm.dupw("dusq", dups(int ), (int)24) - bm.dupw("duso", dups(int ), (int)23));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1904618116: {
                    continue block11;
                }
                case -1210151872: {
                    break block11;
                }
            }
            break;
        }
        var2_4 = bm.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = bm.jf - bm.dupw("duss", dups(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == bm.dupw("dust", duql(int ), (int)16)) break;
            v4 /* !! */  = (long)bm.dupw("dusv", duql(int ), (int)17);
        }
        this.cameraClip = var1_1;
        if (!var2_4) ** break;
        ** while (true)
    }

    public static /* synthetic */ CallSite dupw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        duqn = new int[40];
        duqo = new int[40];
        bm.duuo();
        bm.duux();
        dupt = new long[30];
        dupv = new long[30];
        bm.duvd();
        bm.duvk();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isCameraClip() {
        boolean bl2;
        Object object = jf;
        block13: while (true) {
            switch ((int)object) {
                case -1210151872: {
                    break block13;
                }
                case 1512710790: {
                    object = bm.dupw("duqa", dups(int ), (int)1) - bm.dupw("dupy", dups(int ), (int)0);
                    continue block13;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = jf;
        boolean bl4 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - bm.dupw("duqf", dups(int ), (int)2);
            }
            switch ((int)object2) {
                case -1210151872: {
                    break block14;
                }
                case -1126927454: {
                    callSite = bm.dupw("duqh", dups(int ), (int)3);
                    continue block14;
                }
                case -233291639: {
                    callSite = bm.dupw("duqi", dups(int ), (int)4);
                    continue block14;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = jf - bm.dupw("duqk", dups(int ), (int)5)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == bm.dupw("duqt", duql(int ), (int)0)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = bm.dupw("duqu", duql(int ), (int)1);
        }
        if (bl2) return (boolean)bm.dupw("duqv", duql(int ), (int)2);
        if (bl2) return (boolean)bm.dupw("duqv", duql(int ), (int)2);
        Object object4 = jf;
        block16: while (true) {
            switch ((int)object4) {
                case -1210151872: {
                    return this.cameraClip;
                }
                case 1293506521: {
                    object4 = bm.dupw("duqy", dups(int ), (int)7) - bm.dupw("duqx", dups(int ), (int)6);
                    continue block16;
                }
            }
            break;
        }
        return this.cameraClip;
    }

    private static /* synthetic */ void duux() {
        bm.duqo[0] = -177501183;
        bm.duqo[1] = -466149048;
        bm.duqo[2] = 2141595365;
        bm.duqo[3] = -1087539402;
        bm.duqo[4] = -153049796;
        bm.duqo[5] = -1089772985;
        bm.duqo[6] = -2102921115;
        bm.duqo[7] = -259210359;
        bm.duqo[8] = -517278248;
        bm.duqo[9] = 352721189;
        bm.duqo[10] = -1805228048;
        bm.duqo[11] = -1458724869;
        bm.duqo[12] = 1437263582;
        bm.duqo[13] = -28135176;
        bm.duqo[14] = -1603776313;
        bm.duqo[15] = 763617990;
        bm.duqo[16] = 307210022;
        bm.duqo[17] = -20659843;
        bm.duqo[18] = -519714002;
        bm.duqo[19] = 1025656869;
        bm.duqo[20] = -1668599895;
        bm.duqo[21] = -325165355;
        bm.duqo[22] = -14074597;
        bm.duqo[23] = 643093936;
        bm.duqo[24] = -460704227;
        bm.duqo[25] = 451795012;
        bm.duqo[26] = -1426856239;
        bm.duqo[27] = 1875546307;
        bm.duqo[28] = 2081313104;
        bm.duqo[29] = -2116788785;
        bm.duqo[30] = 363511440;
        bm.duqo[31] = -849588221;
        bm.duqo[32] = 1352126884;
        bm.duqo[33] = -481009108;
        bm.duqo[34] = -1684560375;
        bm.duqo[35] = -1391332863;
        bm.duqo[36] = -1785697084;
        bm.duqo[37] = 344447927;
        bm.duqo[38] = 903408539;
        bm.duqo[39] = 1167466919;
    }
}

