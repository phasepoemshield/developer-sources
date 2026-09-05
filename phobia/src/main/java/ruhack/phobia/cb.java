/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_4587;
import ruhack.phobia.bc;
import ruhack.phobia.cb$Phase;

public class cb
extends bc {
    static final long io = 5385483391023502975L;
    public static final boolean c;
    public static final int b;
    private static int[] dpns;
    public static final boolean a;
    private static long[] dpnz;
    private class_4587 matrices;
    private cb$Phase phase;
    private static int[] dpnr;
    private float tickDelta;
    private static long[] dpoa;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getTickDelta() {
        v0 /* !! */  = cb.io;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(cb.dpnt("dpph", dpny(int ), (int)14) - cb.dpnt("dppg", dpny(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 776855740: {
                    continue block14;
                }
                case 1371068031: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = cb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = cb.io - cb.dpnt("dppi", dpny(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cb.dpnt("dppj", dpnq(int ), (int)22)) break;
            v1 /* !! */  = (long)cb.dpnt("dppk", dpnq(int ), (int)23);
        }
        var2_2 = cb.b;
        v2 /* !! */  = cb.io;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - cb.dpnt("dppl", dpny(int ), (int)16));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 672388297: {
                    v3 = cb.dpnt("dppm", dpny(int ), (int)17);
                    continue block16;
                }
                case 1371068031: {
                    break block16;
                }
                case 1468286007: {
                    v3 = cb.dpnt("dppn", dpny(int ), (int)18);
                    continue block16;
                }
                case 1866180883: {
                    v3 = cb.dpnt("dppo", dpny(int ), (int)19);
                    continue block16;
                }
            }
            break;
        }
        var1_3 = cb.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (float)cb.dpnt("dppq", dppp(int ), (int)24);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = cb.io;
        if (true) ** GOTO lbl44
        block18: while (true) {
            v4 /* !! */  = (long)(cb.dpnt("dpps", dpny(int ), (int)21) - cb.dpnt("dppr", dpny(int ), (int)20));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 289204127: {
                    continue block18;
                }
                case 1371068031: {
                    break block18;
                }
            }
            break;
        }
        return this.tickDelta;
    }

    static {
        dpnr = new int[54];
        dpns = new int[54];
        cb.dprw();
        cb.dprx();
        dpnz = new long[48];
        dpoa = new long[48];
        cb.dpry();
        cb.dprz();
    }

    public static /* synthetic */ CallSite dpnt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dprw() {
        cb.dpnr[0] = -1734162539;
        cb.dpnr[1] = 123885975;
        cb.dpnr[2] = -706132152;
        cb.dpnr[3] = 1306800956;
        cb.dpnr[4] = -1328231646;
        cb.dpnr[5] = -2057479627;
        cb.dpnr[6] = -503398839;
        cb.dpnr[7] = 749061812;
        cb.dpnr[8] = -452336644;
        cb.dpnr[9] = 928588668;
        cb.dpnr[10] = -1956479426;
        cb.dpnr[11] = 217660767;
        cb.dpnr[12] = 593168860;
        cb.dpnr[13] = 529316730;
        cb.dpnr[14] = 552268882;
        cb.dpnr[15] = 2143996859;
        cb.dpnr[16] = -18375416;
        cb.dpnr[17] = -1024800935;
        cb.dpnr[18] = 1750854631;
        cb.dpnr[19] = -1075580957;
        cb.dpnr[20] = -1378135086;
        cb.dpnr[21] = 1379998981;
        cb.dpnr[22] = -2014392051;
        cb.dpnr[23] = 120674820;
        cb.dpnr[24] = 1222797403;
        cb.dpnr[25] = 1119047356;
        cb.dpnr[26] = -1729909402;
        cb.dpnr[27] = 1861082880;
        cb.dpnr[28] = -1467964879;
        cb.dpnr[29] = 1086824295;
        cb.dpnr[30] = 1199410460;
        cb.dpnr[31] = 449492025;
        cb.dpnr[32] = 1320082158;
        cb.dpnr[33] = -1307871408;
        cb.dpnr[34] = 422476401;
        cb.dpnr[35] = -1191844259;
        cb.dpnr[36] = -2069626742;
        cb.dpnr[37] = 1847434887;
        cb.dpnr[38] = 329229242;
        cb.dpnr[39] = 1083443747;
        cb.dpnr[40] = 1967307699;
        cb.dpnr[41] = -565910172;
        cb.dpnr[42] = 1704709635;
        cb.dpnr[43] = 1137622464;
        cb.dpnr[44] = 200854045;
        cb.dpnr[45] = 817677350;
        cb.dpnr[46] = -40002343;
        cb.dpnr[47] = -555720764;
        cb.dpnr[48] = 2100215570;
        cb.dpnr[49] = 163816375;
        cb.dpnr[50] = -2050294519;
        cb.dpnr[51] = -1016812012;
        cb.dpnr[52] = 420835461;
        cb.dpnr[53] = 513941739;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_4587 getMatrices() {
        v0 /* !! */  = cb.io;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(cb.dpnt("dpos", dpny(int ), (int)9) - cb.dpnt("dpor", dpny(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1378866487: {
                    continue block10;
                }
                case 1371068031: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = cb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = cb.io - cb.dpnt("dpot", dpny(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cb.dpnt("dpou", dpnq(int ), (int)12)) break;
            v1 /* !! */  = (long)cb.dpnt("dpov", dpnq(int ), (int)13);
        }
        var2_2 /* !! */  = cb.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = cb.io - cb.dpnt("dpow", dpny(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cb.dpnt("dpox", dpnq(int ), (int)14)) break;
            v2 /* !! */  = (long)cb.dpnt("dpoy", dpnq(int ), (int)15);
        }
        var1_3 = cb.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = cb.io - cb.dpnt("dpoz", dpny(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == cb.dpnt("dppa", dpnq(int ), (int)16)) break;
                    v3 /* !! */  = (long)cb.dpnt("dppb", dpnq(int ), (int)17);
                }
                return this.matrices;
            }
            case 0: {
                var2_2 /* !! */  = (int)cb.dpnt("dppc", dpnq(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)cb.dpnt("dppd", dpnq(int ), (int)19);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)cb.dpnt("dppe", dpnq(int ), (int)20);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cb.dpnt("dppf", dpnq(int ), (int)21);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cb$Phase getPhase() {
        v0 /* !! */  = cb.io;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(cb.dpnt("dpoc", dpny(int ), (int)1) - cb.dpnt("dpob", dpny(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 401763157: {
                    continue block16;
                }
                case 1371068031: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = cb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = cb.io - cb.dpnt("dpod", dpny(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cb.dpnt("dpoe", dpnq(int ), (int)4)) break;
            v1 /* !! */  = (long)cb.dpnt("dpof", dpnq(int ), (int)5);
        }
        var2_2 /* !! */  = cb.b;
        v2 /* !! */  = cb.io;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - cb.dpnt("dpog", dpny(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1340098923: {
                    v3 = cb.dpnt("dpoh", dpny(int ), (int)4);
                    continue block18;
                }
                case 143331957: {
                    v3 = cb.dpnt("dpoi", dpny(int ), (int)5);
                    continue block18;
                }
                case 253750717: {
                    v3 = cb.dpnt("dpoj", dpny(int ), (int)6);
                    continue block18;
                }
                case 1371068031: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = cb.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = cb.io - cb.dpnt("dpok", dpny(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == cb.dpnt("dpol", dpnq(int ), (int)6)) break;
                    v4 /* !! */  = (long)cb.dpnt("dpom", dpnq(int ), (int)7);
                }
                return this.phase;
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)cb.dpnt("dpon", dpnq(int ), (int)8);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cb.dpnt("dpoo", dpnq(int ), (int)9);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cb.dpnt("dpop", dpnq(int ), (int)10);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cb.dpnt("dpoq", dpnq(int ), (int)11);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dpny(int n2) {
        return dpnz[n2] ^ dpoa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMatrices(class_4587 var1_1) {
        v0 /* !! */  = cb.io;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - cb.dpnt("dpqm", dpny(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -4074001: {
                    v1 = cb.dpnt("dpqn", dpny(int ), (int)29);
                    continue block25;
                }
                case 140457558: {
                    v1 = cb.dpnt("dpqo", dpny(int ), (int)30);
                    continue block25;
                }
                case 1371068031: {
                    break block25;
                }
                case 1559180059: {
                    v1 = cb.dpnt("dpqp", dpny(int ), (int)31);
                    continue block25;
                }
            }
            break;
        }
        var4_2 = cb.c;
        v2 /* !! */  = cb.io;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - cb.dpnt("dpqq", dpny(int ), (int)32));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -647718316: {
                    v3 = cb.dpnt("dpqr", dpny(int ), (int)33);
                    continue block26;
                }
                case 1021043289: {
                    v3 = cb.dpnt("dpqs", dpny(int ), (int)34);
                    continue block26;
                }
                case 1371068031: {
                    break block26;
                }
                case 1460959622: {
                    v3 = cb.dpnt("dpqt", dpny(int ), (int)35);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = cb.b;
        v4 /* !! */  = cb.io;
        if (true) ** GOTO lbl39
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - cb.dpnt("dpqu", dpny(int ), (int)36));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1172447108: {
                    v5 = cb.dpnt("dpqv", dpny(int ), (int)37);
                    continue block27;
                }
                case 391855229: {
                    v5 = cb.dpnt("dpqw", dpny(int ), (int)38);
                    continue block27;
                }
                case 1371068031: {
                    break block27;
                }
                case 2056429451: {
                    v5 = cb.dpnt("dpqx", dpny(int ), (int)39);
                    continue block27;
                }
            }
            break;
        }
        var2_4 = cb.a;
        if (!var4_2) ** GOTO lbl58
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl58:
                // 1 sources

                if (var2_4 || var2_4) continue block28;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = cb.io - cb.dpnt("dpqy", dpny(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == cb.dpnt("dpqz", dpnq(int ), (int)38)) break;
                    v6 /* !! */  = (long)cb.dpnt("dpra", dpnq(int ), (int)39);
                }
                this.matrices = var1_1;
                if (!var2_4) ** break;
                continue block28;
                return;
                case 0: {
                    var3_3 /* !! */  = (int)cb.dpnt("dprb", dpnq(int ), (int)40);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl81
                }
lbl73:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)cb.dpnt("dprc", dpnq(int ), (int)41);
                    if (!var4_2) break block28;
                    throw null;
                }
                case 2: {
                    var3_3 /* !! */  = (int)cb.dpnt("dprd", dpnq(int ), (int)42);
                    if (!var4_2) break block28;
                    throw null;
                }
lbl81:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)cb.dpnt("dpre", dpnq(int ), (int)43);
                    if (!var4_2) ** GOTO lbl73
                    throw null;
                }
                case 4: 
            }
        }
        do {
            var3_3 /* !! */  = (int)cb.dpnt("dprf", dpnq(int ), (int)44);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void dprz() {
        cb.dpoa[0] = -5622702035619371774L;
        cb.dpoa[1] = -1482559234329905734L;
        cb.dpoa[2] = -2403392757070650320L;
        cb.dpoa[3] = -8688697314195075818L;
        cb.dpoa[4] = -7395186225323611526L;
        cb.dpoa[5] = -4292261006886986757L;
        cb.dpoa[6] = -5735588117070458631L;
        cb.dpoa[7] = 7540523438902697327L;
        cb.dpoa[8] = 1452659392210246171L;
        cb.dpoa[9] = 8067812015053936464L;
        cb.dpoa[10] = -1395156708330328343L;
        cb.dpoa[11] = -607290339283746790L;
        cb.dpoa[12] = 8539806107025098413L;
        cb.dpoa[13] = 2092516955065047527L;
        cb.dpoa[14] = 7328635915237844979L;
        cb.dpoa[15] = 1280569222847326168L;
        cb.dpoa[16] = 3675153750320111848L;
        cb.dpoa[17] = 4835120297715672872L;
        cb.dpoa[18] = -984944021290922276L;
        cb.dpoa[19] = 8533388594009439634L;
        cb.dpoa[20] = -2984672996413228575L;
        cb.dpoa[21] = 8645905825721458231L;
        cb.dpoa[22] = -4825931825080343805L;
        cb.dpoa[23] = -1223291618631493107L;
        cb.dpoa[24] = 3925588993237281544L;
        cb.dpoa[25] = 4254849254986019857L;
        cb.dpoa[26] = 5216890335436669070L;
        cb.dpoa[27] = -9100471178499661437L;
        cb.dpoa[28] = -3478011304379382415L;
        cb.dpoa[29] = -2869727601803567314L;
        cb.dpoa[30] = 1684978886883006257L;
        cb.dpoa[31] = -4192831167749030253L;
        cb.dpoa[32] = -6091558331790289500L;
        cb.dpoa[33] = -6466948984744789496L;
        cb.dpoa[34] = -3321969772143269899L;
        cb.dpoa[35] = -195652294021909410L;
        cb.dpoa[36] = 52496800640454396L;
        cb.dpoa[37] = -6459438159035218276L;
        cb.dpoa[38] = -4197441137631164647L;
        cb.dpoa[39] = 7249545079098107886L;
        cb.dpoa[40] = -6185730004650052797L;
        cb.dpoa[41] = -7008630343644871601L;
        cb.dpoa[42] = 6904216627944891998L;
        cb.dpoa[43] = 3055107821708481556L;
        cb.dpoa[44] = -2966058768210231144L;
        cb.dpoa[45] = 8188528414598001489L;
        cb.dpoa[46] = 6117653049281117987L;
        cb.dpoa[47] = 7528047563816605662L;
    }

    private static /* synthetic */ int dpnq(int n2) {
        return dpnr[n2] ^ dpns[n2];
    }

    private static /* synthetic */ void dpry() {
        cb.dpnz[0] = 335535991816686219L;
        cb.dpnz[1] = 3164925088157958781L;
        cb.dpnz[2] = -2951022849701039424L;
        cb.dpnz[3] = 1090462238644646266L;
        cb.dpnz[4] = -1415363076485284895L;
        cb.dpnz[5] = -7816526021866890052L;
        cb.dpnz[6] = -3411918204240432886L;
        cb.dpnz[7] = 3339746488937818286L;
        cb.dpnz[8] = 6164087933448160244L;
        cb.dpnz[9] = 5730277921431073776L;
        cb.dpnz[10] = 7134516230857110408L;
        cb.dpnz[11] = 2602623752988346288L;
        cb.dpnz[12] = -6510084532862115549L;
        cb.dpnz[13] = 2881279375953293266L;
        cb.dpnz[14] = -1829896582191687443L;
        cb.dpnz[15] = 3623711393918113935L;
        cb.dpnz[16] = 6416070076321032311L;
        cb.dpnz[17] = 9078125985820568085L;
        cb.dpnz[18] = -8817227824766904588L;
        cb.dpnz[19] = -3342611468112512562L;
        cb.dpnz[20] = 2889165871713237835L;
        cb.dpnz[21] = -6338710216147363561L;
        cb.dpnz[22] = 4621774143730036762L;
        cb.dpnz[23] = 3982882607283448093L;
        cb.dpnz[24] = 3252001326949417303L;
        cb.dpnz[25] = -1375692813330710435L;
        cb.dpnz[26] = 5382429636640661898L;
        cb.dpnz[27] = 6031828999668761013L;
        cb.dpnz[28] = 2591635285147148240L;
        cb.dpnz[29] = 1445104830132911897L;
        cb.dpnz[30] = 2912362360127325802L;
        cb.dpnz[31] = -7115245974779210333L;
        cb.dpnz[32] = 8204664526666030143L;
        cb.dpnz[33] = 6777290007130461770L;
        cb.dpnz[34] = -6028337471038420416L;
        cb.dpnz[35] = -3971678765068002023L;
        cb.dpnz[36] = -7556346340815688582L;
        cb.dpnz[37] = -2970165954925191209L;
        cb.dpnz[38] = 9071812835027365762L;
        cb.dpnz[39] = 6684099810609700834L;
        cb.dpnz[40] = 2267931411333940613L;
        cb.dpnz[41] = -7225729315379941064L;
        cb.dpnz[42] = -1354750421983796701L;
        cb.dpnz[43] = -4818850512737616130L;
        cb.dpnz[44] = -2708343911847464746L;
        cb.dpnz[45] = -7035887770417086642L;
        cb.dpnz[46] = 3525692765280566527L;
        cb.dpnz[47] = 1153337325295306140L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setTickDelta(float f2) {
        Object object = io;
        boolean bl2 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - cb.dpnt("dprg", dpny(int ), (int)41);
            }
            switch ((int)object) {
                case -1522249211: {
                    callSite = cb.dpnt("dprh", dpny(int ), (int)42);
                    continue block9;
                }
                case 434913919: {
                    callSite = cb.dpnt("dpri", dpny(int ), (int)43);
                    continue block9;
                }
                case 1371068031: {
                    break block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = io - cb.dpnt("dprj", dpny(int ), (int)44)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == cb.dpnt("dprk", dpnq(int ), (int)45)) break;
            object2 = cb.dpnt("dprl", dpnq(int ), (int)46);
        }
        int n2 = b;
        Object object3 = io;
        block11: while (true) {
            switch ((int)object3) {
                case 1138822833: {
                    object3 = cb.dpnt("dprn", dpny(int ), (int)46) - cb.dpnt("dprm", dpny(int ), (int)45);
                    continue block11;
                }
                case 1371068031: {
                    break block11;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) return;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = io - cb.dpnt("dpro", dpny(int ), (int)47)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == cb.dpnt("dprp", dpnq(int ), (int)47)) {
                this.tickDelta = f2;
                if (bl4) return;
                return;
            }
            object4 = cb.dpnt("dprq", dpnq(int ), (int)48);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public cb(cb$Phase cb$Phase, class_4587 class_45872, float f2) {
        int n2 = b;
        this.phase = cb$Phase;
        this.matrices = class_45872;
        this.tickDelta = f2;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 1: {
                CallSite callSite = cb.dpnt("dpnv", dpnq(int ), (int)1);
            }
            case 0: {
                while (true) {
                    CallSite callSite = cb.dpnt("dpnu", dpnq(int ), (int)0);
                }
            }
            case 2: {
                CallSite callSite = cb.dpnt("dpnw", dpnq(int ), (int)2);
                break;
            }
            case 3: 
        }
        while (true) {
            CallSite callSite = cb.dpnt("dpnx", dpnq(int ), (int)3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPhase(cb$Phase var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cb.io - cb.dpnt("dppx", dpny(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cb.dpnt("dppy", dpnq(int ), (int)29)) break;
            v0 /* !! */  = (long)cb.dpnt("dppz", dpnq(int ), (int)30);
        }
        var4_2 = cb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cb.io - cb.dpnt("dpqa", dpny(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cb.dpnt("dpqb", dpnq(int ), (int)31)) break;
            v1 /* !! */  = (long)cb.dpnt("dpqc", dpnq(int ), (int)32);
        }
        var3_3 /* !! */  = cb.b;
        v2 /* !! */  = cb.io;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(cb.dpnt("dpqe", dpny(int ), (int)25) - cb.dpnt("dpqd", dpny(int ), (int)24));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -301024227: {
                    continue block17;
                }
                case 1371068031: {
                    break block17;
                }
            }
            break;
        }
        var2_4 = cb.a;
        if (var4_2) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                v3 /* !! */  = cb.io;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(cb.dpnt("dpqg", dpny(int ), (int)27) - cb.dpnt("dpqf", dpny(int ), (int)26));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1371068031: {
                            break block19;
                        }
                        case 2071234874: {
                            continue block19;
                        }
                    }
                    break;
                }
                this.phase = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl46:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cb.dpnt("dpqh", dpnq(int ), (int)33);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
lbl51:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)cb.dpnt("dpqi", dpnq(int ), (int)34);
                if (!var4_2) ** GOTO lbl46
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)cb.dpnt("dpqj", dpnq(int ), (int)35);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)cb.dpnt("dpqk", dpnq(int ), (int)36);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)cb.dpnt("dpql", dpnq(int ), (int)37);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dppp(int n2) {
        return Float.intBitsToFloat(dpnr[n2] ^ dpns[n2]);
    }

    private static /* synthetic */ void dprx() {
        cb.dpns[0] = -1734162540;
        cb.dpns[1] = 123885975;
        cb.dpns[2] = -706132149;
        cb.dpns[3] = 1306800957;
        cb.dpns[4] = -1328231645;
        cb.dpns[5] = 1598705205;
        cb.dpns[6] = -503398840;
        cb.dpns[7] = 858013148;
        cb.dpns[8] = -452336641;
        cb.dpns[9] = 928588668;
        cb.dpns[10] = -1956479428;
        cb.dpns[11] = 217660764;
        cb.dpns[12] = 593168861;
        cb.dpns[13] = -46079994;
        cb.dpns[14] = 552268883;
        cb.dpns[15] = 573063766;
        cb.dpns[16] = -18375415;
        cb.dpns[17] = -464333069;
        cb.dpns[18] = 1750854630;
        cb.dpns[19] = -1075580959;
        cb.dpns[20] = -1378135088;
        cb.dpns[21] = 1379998980;
        cb.dpns[22] = -2014392052;
        cb.dpns[23] = -1305061757;
        cb.dpns[24] = 1976768571;
        cb.dpns[25] = 1119047357;
        cb.dpns[26] = -1729909404;
        cb.dpns[27] = 1861082882;
        cb.dpns[28] = -1467964878;
        cb.dpns[29] = 1086824294;
        cb.dpns[30] = -348574817;
        cb.dpns[31] = 449492024;
        cb.dpns[32] = 1868144839;
        cb.dpns[33] = -1307871407;
        cb.dpns[34] = 422476401;
        cb.dpns[35] = -1191844260;
        cb.dpns[36] = -2069626744;
        cb.dpns[37] = 1847434885;
        cb.dpns[38] = 329229243;
        cb.dpns[39] = -448257827;
        cb.dpns[40] = 1967307703;
        cb.dpns[41] = -565910176;
        cb.dpns[42] = 1704709633;
        cb.dpns[43] = 1137622464;
        cb.dpns[44] = 200854045;
        cb.dpns[45] = 817677351;
        cb.dpns[46] = -1516283372;
        cb.dpns[47] = 555720763;
        cb.dpns[48] = -953041616;
        cb.dpns[49] = 163816373;
        cb.dpns[50] = -2050294519;
        cb.dpns[51] = -1016812010;
        cb.dpns[52] = 420835461;
        cb.dpns[53] = 513941739;
    }
}

