/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.dr;
import ruhack.phobia.ds;

public class dp {
    public static final boolean c;
    public static final int b;
    private static long[] bssa;
    private final dr repository;
    private static int[] bssk;
    public static final boolean a;
    private static int[] bssl;
    private static long[] bssb;
    private static final long ed = 1083919685654990539L;

    private static /* synthetic */ void bsua() {
        dp.bssl[0] = 1985082393;
        dp.bssl[1] = -2139377933;
        dp.bssl[2] = -1630902939;
        dp.bssl[3] = 953533909;
        dp.bssl[4] = -938035692;
        dp.bssl[5] = 637965729;
        dp.bssl[6] = -1805292510;
        dp.bssl[7] = -250929885;
        dp.bssl[8] = -121198893;
        dp.bssl[9] = 1979149385;
        dp.bssl[10] = 1550534959;
        dp.bssl[11] = 1930722617;
        dp.bssl[12] = 1874146691;
        dp.bssl[13] = 843178985;
        dp.bssl[14] = 1673358900;
        dp.bssl[15] = -1599572005;
        dp.bssl[16] = -1321207257;
        dp.bssl[17] = -187005492;
        dp.bssl[18] = -1926211675;
        dp.bssl[19] = 2045564127;
        dp.bssl[20] = -446564145;
        dp.bssl[21] = 759993866;
        dp.bssl[22] = -400508273;
        dp.bssl[23] = 922962371;
        dp.bssl[24] = 332367626;
    }

    static {
        bssk = new int[25];
        bssl = new int[25];
        dp.bstz();
        dp.bsua();
        bssa = new long[20];
        bssb = new long[20];
        dp.bsub();
        dp.bsuc();
    }

    public static /* synthetic */ CallSite bssc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dp(dr var1_1) {
        var3_2 /* !! */  = dp.b;
        var2_3 = dp.a;
        super();
        this.repository = var1_1;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)dp.bssc("bstw", bssj(int ), (int)22);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dp.bssc("bstx", bssj(int ), (int)23);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)dp.bssc("bsty", bssj(int ), (int)24);
        ** while (true)
    }

    private static /* synthetic */ long bsrz(int n2) {
        return bssa[n2] ^ bssb[n2];
    }

    private static /* synthetic */ void bsub() {
        dp.bssa[0] = -2543999005266878623L;
        dp.bssa[1] = 5446312532852683918L;
        dp.bssa[2] = 380078157748356121L;
        dp.bssa[3] = 2814568228739944356L;
        dp.bssa[4] = 417840701718189764L;
        dp.bssa[5] = -6769485886904007199L;
        dp.bssa[6] = 635112562829408925L;
        dp.bssa[7] = 3974423481875065326L;
        dp.bssa[8] = 1591639780920536524L;
        dp.bssa[9] = 2854712303374125988L;
        dp.bssa[10] = -741924890236771463L;
        dp.bssa[11] = -5637113096223575787L;
        dp.bssa[12] = 3524432608389927265L;
        dp.bssa[13] = -1252113858628387705L;
        dp.bssa[14] = -7212038609052235659L;
        dp.bssa[15] = 5717611193510347725L;
        dp.bssa[16] = 2075709648303112583L;
        dp.bssa[17] = -3357364985627707862L;
        dp.bssa[18] = -4953724063036042073L;
        dp.bssa[19] = 4113258256862595908L;
    }

    private static /* synthetic */ void bstz() {
        dp.bssk[0] = -1985082394;
        dp.bssk[1] = 1570126178;
        dp.bssk[2] = -1630902939;
        dp.bssk[3] = 953533908;
        dp.bssk[4] = 1780185809;
        dp.bssk[5] = 637965733;
        dp.bssk[6] = -1805292506;
        dp.bssk[7] = -250929888;
        dp.bssk[8] = -121198895;
        dp.bssk[9] = 1979149385;
        dp.bssk[10] = 1550534954;
        dp.bssk[11] = -1930722618;
        dp.bssk[12] = 1667539305;
        dp.bssk[13] = 843178984;
        dp.bssk[14] = 1673358901;
        dp.bssk[15] = -2137991578;
        dp.bssk[16] = -1321207260;
        dp.bssk[17] = -187005491;
        dp.bssk[18] = -1926211673;
        dp.bssk[19] = 2045564124;
        dp.bssk[20] = -446564148;
        dp.bssk[21] = 759993864;
        dp.bssk[22] = -400508273;
        dp.bssk[23] = 922962371;
        dp.bssk[24] = 332367626;
    }

    private static /* synthetic */ void bsuc() {
        dp.bssb[0] = -7099497281785232192L;
        dp.bssb[1] = 1138591755419479247L;
        dp.bssb[2] = 6685778517414459063L;
        dp.bssb[3] = -2609436303495421508L;
        dp.bssb[4] = -4514466021949655612L;
        dp.bssb[5] = -5366100054152272632L;
        dp.bssb[6] = 1643097474970085911L;
        dp.bssb[7] = 7686767547472990574L;
        dp.bssb[8] = -7963126698355101388L;
        dp.bssb[9] = -919954636919007602L;
        dp.bssb[10] = 703784987933731086L;
        dp.bssb[11] = 642410172574866153L;
        dp.bssb[12] = -7345105284757604894L;
        dp.bssb[13] = -1638140296199407739L;
        dp.bssb[14] = -5678177358363374061L;
        dp.bssb[15] = -3702251742183349931L;
        dp.bssb[16] = -955518340302568125L;
        dp.bssb[17] = -1780136465299069164L;
        dp.bssb[18] = -6321077171463402399L;
        dp.bssb[19] = -8147452223640849552L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dp add(ds var1_1) {
        v0 /* !! */  = dp.ed;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - dp.bssc("bssd", bsrz(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -431248012: {
                    v1 = dp.bssc("bsse", bsrz(int ), (int)1);
                    continue block22;
                }
                case 344248011: {
                    break block22;
                }
                case 447880067: {
                    v1 = dp.bssc("bssf", bsrz(int ), (int)2);
                    continue block22;
                }
            }
            break;
        }
        var4_2 = dp.c;
        v2 /* !! */  = dp.ed;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(dp.bssc("bssh", bsrz(int ), (int)4) - dp.bssc("bssg", bsrz(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 344248011: {
                    break block23;
                }
                case 1391374380: {
                    continue block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = dp.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = dp.ed - dp.bssc("bssi", bsrz(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dp.bssc("bssm", bssj(int ), (int)0)) break;
                    v3 /* !! */  = (long)dp.bssc("bssn", bssj(int ), (int)1);
                }
                var2_4 = dp.a;
                if (var4_2) {
                    throw null;
lbl36:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl36
                v4 /* !! */  = dp.ed;
                if (true) ** GOTO lbl43
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - dp.bssc("bsso", bsrz(int ), (int)6));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2049503065: {
                            v5 = dp.bssc("bssp", bsrz(int ), (int)7);
                            continue block26;
                        }
                        case -242712999: {
                            v5 = dp.bssc("bssq", bsrz(int ), (int)8);
                            continue block26;
                        }
                        case 344248011: {
                            break block26;
                        }
                    }
                    break;
                }
                v6 = dp.bssc("bssr", bssj(int ), (int)2);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = dp.ed - dp.bssc("bsss", bsrz(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dp.bssc("bsst", bssj(int ), (int)3)) break;
                    v7 /* !! */  = (long)dp.bssc("bssu", bssj(int ), (int)4);
                }
                this.repository.registerModule(var1_1, (boolean)v6);
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl61:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)dp.bssc("bssv", bssj(int ), (int)5);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: {
                var3_3 /* !! */  = (int)dp.bssc("bssw", bssj(int ), (int)6);
                if (var4_2) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)dp.bssc("bssx", bssj(int ), (int)7);
                } while (!var4_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)dp.bssc("bssy", bssj(int ), (int)8);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)dp.bssc("bssz", bssj(int ), (int)9);
                if (!var4_2) ** GOTO lbl61
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)dp.bssc("bsta", bssj(int ), (int)10);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dp hidden(ds var1_1) {
        v0 /* !! */  = dp.ed;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(dp.bssc("bstc", bsrz(int ), (int)11) - dp.bssc("bstb", bsrz(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -373231837: {
                    continue block22;
                }
                case 344248011: {
                    break block22;
                }
            }
            break;
        }
        var4_2 = dp.c;
        v1 /* !! */  = dp.ed;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - dp.bssc("bstd", bsrz(int ), (int)12));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -462882983: {
                    v2 = dp.bssc("bste", bsrz(int ), (int)13);
                    continue block23;
                }
                case 102876736: {
                    v2 = dp.bssc("bstf", bsrz(int ), (int)14);
                    continue block23;
                }
                case 344248011: {
                    break block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = dp.b;
        v3 /* !! */  = dp.ed;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - dp.bssc("bstg", bsrz(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1201075639: {
                    v4 = dp.bssc("bsth", bsrz(int ), (int)16);
                    continue block24;
                }
                case 344248011: {
                    break block24;
                }
                case 756560908: {
                    v4 = dp.bssc("bsti", bsrz(int ), (int)17);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = dp.a;
        if (var4_2) {
            throw null;
lbl41:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = dp.ed - dp.bssc("bstj", bsrz(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == dp.bssc("bstk", bssj(int ), (int)11)) break;
            v5 /* !! */  = (long)dp.bssc("bstl", bssj(int ), (int)12);
        }
        v6 = dp.bssc("bstm", bssj(int ), (int)13);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = dp.ed - dp.bssc("bstn", bsrz(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dp.bssc("bsto", bssj(int ), (int)14)) break;
            v7 /* !! */  = (long)dp.bssc("bstp", bssj(int ), (int)15);
        }
        this.repository.registerModule(var1_1, (boolean)v6);
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
lbl63:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)dp.bssc("bstq", bssj(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dp.bssc("bstr", bssj(int ), (int)17);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl78
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)dp.bssc("bsts", bssj(int ), (int)18);
                if (var4_2) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)dp.bssc("bstt", bssj(int ), (int)19);
                if (var4_2) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)dp.bssc("bstu", bssj(int ), (int)20);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)dp.bssc("bstv", bssj(int ), (int)21);
        ** while (!var4_2)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bssj(int n2) {
        return bssk[n2] ^ bssl[n2];
    }
}

