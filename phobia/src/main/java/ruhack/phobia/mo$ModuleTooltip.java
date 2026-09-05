/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

record mo$ModuleTooltip(String description, float anchorY, float anchorX) {
    public static final boolean c;
    private final String description;
    public static final int b;
    private static int[] bvlg;
    public static final boolean a;
    private final float anchorY;
    private static long[] bvlo;
    private static int[] bvlf;
    private static long[] bvln;
    protected static final long en = -5139242276154275511L;
    private final float anchorX;

    public static /* synthetic */ CallSite bvlh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float bvop(int n2) {
        return Float.intBitsToFloat(bvlf[n2] ^ bvlg[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvlp", bvlm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ModuleTooltip.bvlh("bvlq", bvle(int ), (int)4)) break;
            v0 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvlr", bvle(int ), (int)5);
        }
        var3_1 = mo$ModuleTooltip.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvls", bvlm(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ModuleTooltip.bvlh("bvlt", bvle(int ), (int)6)) break;
            v1 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvlu", bvle(int ), (int)7);
        }
        var2_2 /* !! */  = mo$ModuleTooltip.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvlv", bvlm(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ModuleTooltip.bvlh("bvlw", bvle(int ), (int)8)) break;
            v2 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvlx", bvle(int ), (int)9);
        }
        var1_3 = mo$ModuleTooltip.a;
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
                    if ((v3 /* !! */  = (cfr_temp_3 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvly", bvlm(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$ModuleTooltip.bvlh("bvlz", bvle(int ), (int)10)) break;
                    v3 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvma", bvle(int ), (int)11);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$ModuleTooltip.class, "description;anchorX;anchorY", "description", "anchorX", "anchorY"}, this);
            }
lbl37:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvmb", bvle(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl47
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvmc", bvle(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
            }
lbl47:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvmd", bvle(int ), (int)14);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvme", bvle(int ), (int)15);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float anchorY() {
        v0 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(mo$ModuleTooltip.bvlh("bwtw", bvlm(int ), (int)43) - mo$ModuleTooltip.bvlh("bwtv", bvlm(int ), (int)42));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -215512759: {
                    break block25;
                }
                case 13280720: {
                    continue block25;
                }
            }
            break;
        }
        var3_1 = mo$ModuleTooltip.c;
        v1 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - mo$ModuleTooltip.bvlh("bwtx", bvlm(int ), (int)44));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1210599647: {
                    v2 = mo$ModuleTooltip.bvlh("bwty", bvlm(int ), (int)45);
                    continue block26;
                }
                case -215512759: {
                    break block26;
                }
                case 977559468: {
                    v2 = mo$ModuleTooltip.bvlh("bwtz", bvlm(int ), (int)46);
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$ModuleTooltip.b;
        v3 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - mo$ModuleTooltip.bvlh("bwua", bvlm(int ), (int)47));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -215512759: {
                    break block27;
                }
                case 649480131: {
                    v4 = mo$ModuleTooltip.bvlh("bwub", bvlm(int ), (int)48);
                    continue block27;
                }
                case 1444873282: {
                    v4 = mo$ModuleTooltip.bvlh("bwuc", bvlm(int ), (int)49);
                    continue block27;
                }
            }
            break;
        }
        var1_3 = mo$ModuleTooltip.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (float)mo$ModuleTooltip.bvlh("bwud", bvop(int ), (int)49);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = mo$ModuleTooltip.en;
                if (true) ** GOTO lbl52
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - mo$ModuleTooltip.bvlh("bwue", bvlm(int ), (int)50));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1991564742: {
                            v6 = mo$ModuleTooltip.bvlh("bwuf", bvlm(int ), (int)51);
                            continue block29;
                        }
                        case -215512759: {
                            break block29;
                        }
                        case 1668304945: {
                            v6 = mo$ModuleTooltip.bvlh("bwug", bvlm(int ), (int)52);
                            continue block29;
                        }
                    }
                    break;
                }
                return this.anchorY;
            }
lbl62:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bwuh", bvle(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bwui", bvle(int ), (int)51);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bwuj", bvle(int ), (int)52);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bwuk", bvle(int ), (int)53);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bwun() {
        mo$ModuleTooltip.bvln[0] = -8957608769194741037L;
        mo$ModuleTooltip.bvln[1] = 6253005621226934069L;
        mo$ModuleTooltip.bvln[2] = -1680314924932570071L;
        mo$ModuleTooltip.bvln[3] = -1764246386211415867L;
        mo$ModuleTooltip.bvln[4] = -873435291274418427L;
        mo$ModuleTooltip.bvln[5] = -8458504398828228704L;
        mo$ModuleTooltip.bvln[6] = 7091455988558590135L;
        mo$ModuleTooltip.bvln[7] = 3196334242480939695L;
        mo$ModuleTooltip.bvln[8] = -7510014039082904764L;
        mo$ModuleTooltip.bvln[9] = 1845478727227516794L;
        mo$ModuleTooltip.bvln[10] = 8003151038542901450L;
        mo$ModuleTooltip.bvln[11] = -2291843019135421118L;
        mo$ModuleTooltip.bvln[12] = 1158007971360481631L;
        mo$ModuleTooltip.bvln[13] = 7282403133075598632L;
        mo$ModuleTooltip.bvln[14] = 6886147926286256568L;
        mo$ModuleTooltip.bvln[15] = -2066555859359540414L;
        mo$ModuleTooltip.bvln[16] = 1016646588864470448L;
        mo$ModuleTooltip.bvln[17] = 4120686978008474083L;
        mo$ModuleTooltip.bvln[18] = -6753909942470037345L;
        mo$ModuleTooltip.bvln[19] = -147826489920333663L;
        mo$ModuleTooltip.bvln[20] = 1862800352694637272L;
        mo$ModuleTooltip.bvln[21] = 6921578521745311663L;
        mo$ModuleTooltip.bvln[22] = 1750571230514154538L;
        mo$ModuleTooltip.bvln[23] = -4919363354133957596L;
        mo$ModuleTooltip.bvln[24] = 8085589842922732425L;
        mo$ModuleTooltip.bvln[25] = -6530758466310641761L;
        mo$ModuleTooltip.bvln[26] = 1498792653488985053L;
        mo$ModuleTooltip.bvln[27] = -9056532721776436001L;
        mo$ModuleTooltip.bvln[28] = -2692285679518620830L;
        mo$ModuleTooltip.bvln[29] = 8497421380341333221L;
        mo$ModuleTooltip.bvln[30] = -4734630851322693573L;
        mo$ModuleTooltip.bvln[31] = 2606363415240812493L;
        mo$ModuleTooltip.bvln[32] = -9133196357016846503L;
        mo$ModuleTooltip.bvln[33] = -3180034418269069342L;
        mo$ModuleTooltip.bvln[34] = -7882864424016115869L;
        mo$ModuleTooltip.bvln[35] = -5756462360804013203L;
        mo$ModuleTooltip.bvln[36] = -8385784487464083578L;
        mo$ModuleTooltip.bvln[37] = -8163036585774499465L;
        mo$ModuleTooltip.bvln[38] = 2455958891212963519L;
        mo$ModuleTooltip.bvln[39] = 69981615514359099L;
        mo$ModuleTooltip.bvln[40] = 1622490312272987558L;
        mo$ModuleTooltip.bvln[41] = 6196891741012653818L;
        mo$ModuleTooltip.bvln[42] = 7703884516877623484L;
        mo$ModuleTooltip.bvln[43] = 8966888001142215763L;
        mo$ModuleTooltip.bvln[44] = 3826357097676699653L;
        mo$ModuleTooltip.bvln[45] = 1126516938335380523L;
        mo$ModuleTooltip.bvln[46] = -3503392881117149075L;
        mo$ModuleTooltip.bvln[47] = -6160422766796869066L;
        mo$ModuleTooltip.bvln[48] = 7465920831918367218L;
        mo$ModuleTooltip.bvln[49] = 3291000998846002257L;
        mo$ModuleTooltip.bvln[50] = 3193443922841022099L;
        mo$ModuleTooltip.bvln[51] = 2398724410089390275L;
        mo$ModuleTooltip.bvln[52] = 7480643182760991349L;
    }

    private static /* synthetic */ int bvle(int n2) {
        return bvlf[n2] ^ bvlg[n2];
    }

    private static /* synthetic */ void bwuo() {
        mo$ModuleTooltip.bvlo[0] = -2117896066293939028L;
        mo$ModuleTooltip.bvlo[1] = -7025088157255194525L;
        mo$ModuleTooltip.bvlo[2] = -4769799710697276064L;
        mo$ModuleTooltip.bvlo[3] = 6355806931809106504L;
        mo$ModuleTooltip.bvlo[4] = -27343710380475681L;
        mo$ModuleTooltip.bvlo[5] = -4622437459588047587L;
        mo$ModuleTooltip.bvlo[6] = 4908634244891566787L;
        mo$ModuleTooltip.bvlo[7] = -7385197032224239844L;
        mo$ModuleTooltip.bvlo[8] = 7259145263176422629L;
        mo$ModuleTooltip.bvlo[9] = -8517842843711327092L;
        mo$ModuleTooltip.bvlo[10] = -6856183790463598677L;
        mo$ModuleTooltip.bvlo[11] = 5406330664125332523L;
        mo$ModuleTooltip.bvlo[12] = -4373085074870310002L;
        mo$ModuleTooltip.bvlo[13] = -3270582292375707496L;
        mo$ModuleTooltip.bvlo[14] = -4714159244960223951L;
        mo$ModuleTooltip.bvlo[15] = 3452776576350671305L;
        mo$ModuleTooltip.bvlo[16] = -317465482371841536L;
        mo$ModuleTooltip.bvlo[17] = 7782801800238277923L;
        mo$ModuleTooltip.bvlo[18] = 6385347121792780364L;
        mo$ModuleTooltip.bvlo[19] = 1643957543801997530L;
        mo$ModuleTooltip.bvlo[20] = 5743710300530094030L;
        mo$ModuleTooltip.bvlo[21] = 3846856146791305706L;
        mo$ModuleTooltip.bvlo[22] = 7057234986860731704L;
        mo$ModuleTooltip.bvlo[23] = -2904432999216295559L;
        mo$ModuleTooltip.bvlo[24] = -3351106901122045863L;
        mo$ModuleTooltip.bvlo[25] = 9205620863076434405L;
        mo$ModuleTooltip.bvlo[26] = 556678884948720967L;
        mo$ModuleTooltip.bvlo[27] = 3006179504039286793L;
        mo$ModuleTooltip.bvlo[28] = -8322208068526784333L;
        mo$ModuleTooltip.bvlo[29] = -6618924600491806601L;
        mo$ModuleTooltip.bvlo[30] = 66306760843842144L;
        mo$ModuleTooltip.bvlo[31] = 5604229543860789229L;
        mo$ModuleTooltip.bvlo[32] = -5715492180158770661L;
        mo$ModuleTooltip.bvlo[33] = 4724567807137888735L;
        mo$ModuleTooltip.bvlo[34] = -8249472615227117707L;
        mo$ModuleTooltip.bvlo[35] = 8068256378340454995L;
        mo$ModuleTooltip.bvlo[36] = -3262983914974837650L;
        mo$ModuleTooltip.bvlo[37] = 2078609373654226494L;
        mo$ModuleTooltip.bvlo[38] = 7740723328545586386L;
        mo$ModuleTooltip.bvlo[39] = -8097079205539113451L;
        mo$ModuleTooltip.bvlo[40] = -5944757231779033052L;
        mo$ModuleTooltip.bvlo[41] = 689075099973300026L;
        mo$ModuleTooltip.bvlo[42] = -5037150175449250021L;
        mo$ModuleTooltip.bvlo[43] = 7209298913340138289L;
        mo$ModuleTooltip.bvlo[44] = 6279116215584758008L;
        mo$ModuleTooltip.bvlo[45] = -4855684793922808245L;
        mo$ModuleTooltip.bvlo[46] = 6334032384659515747L;
        mo$ModuleTooltip.bvlo[47] = 2115292973211737501L;
        mo$ModuleTooltip.bvlo[48] = -1057063268737329378L;
        mo$ModuleTooltip.bvlo[49] = 797357641206814226L;
        mo$ModuleTooltip.bvlo[50] = -5645228720697450096L;
        mo$ModuleTooltip.bvlo[51] = -9085854975031975396L;
        mo$ModuleTooltip.bvlo[52] = -4087354832353950684L;
    }

    static {
        bvlf = new int[54];
        bvlg = new int[54];
        mo$ModuleTooltip.bwul();
        mo$ModuleTooltip.bwum();
        bvln = new long[53];
        bvlo = new long[53];
        mo$ModuleTooltip.bwun();
        mo$ModuleTooltip.bwuo();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String description() {
        v0 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - mo$ModuleTooltip.bvlh("bvnp", bvlm(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1572516977: {
                    v1 = mo$ModuleTooltip.bvlh("bvnq", bvlm(int ), (int)23);
                    continue block22;
                }
                case -215512759: {
                    break block22;
                }
                case 1140016552: {
                    v1 = mo$ModuleTooltip.bvlh("bvnr", bvlm(int ), (int)24);
                    continue block22;
                }
                case 1904071690: {
                    v1 = mo$ModuleTooltip.bvlh("bvns", bvlm(int ), (int)25);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = mo$ModuleTooltip.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvnt", bvlm(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ModuleTooltip.bvlh("bvnu", bvle(int ), (int)34)) break;
            v2 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvnv", bvle(int ), (int)35);
        }
        var2_2 /* !! */  = mo$ModuleTooltip.b;
        v3 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(mo$ModuleTooltip.bvlh("bvnx", bvlm(int ), (int)28) - mo$ModuleTooltip.bvlh("bvnw", bvlm(int ), (int)27));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -215512759: {
                    break block24;
                }
                case 64621886: {
                    continue block24;
                }
            }
            break;
        }
        var1_3 = mo$ModuleTooltip.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mo$ModuleTooltip.en;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$ModuleTooltip.bvlh("bvny", bvlm(int ), (int)29));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -533637538: {
                            v5 = mo$ModuleTooltip.bvlh("bvnz", bvlm(int ), (int)30);
                            continue block26;
                        }
                        case -215512759: {
                            break block26;
                        }
                        case 267141318: {
                            v5 = mo$ModuleTooltip.bvlh("bvoa", bvlm(int ), (int)31);
                            continue block26;
                        }
                        case 1824672029: {
                            v5 = mo$ModuleTooltip.bvlh("bvob", bvlm(int ), (int)32);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.description;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvoc", bvle(int ), (int)36);
                if (!var3_1) break;
                throw null;
            }
lbl65:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvod", bvle(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvoe", bvle(int ), (int)38);
                    if (!var3_1) ** GOTO lbl65
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvof", bvle(int ), (int)39);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            block32: {
                if ((v0 /* !! */  = (cfr_temp_0 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvmx", bvlm(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != mo$ModuleTooltip.bvlh("bvmy", bvle(int ), (int)27)) break block32;
                var4_2 = mo$ModuleTooltip.c;
                v1 /* !! */  = mo$ModuleTooltip.en;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvmz", bvle(int ), (int)28);
        }
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - mo$ModuleTooltip.bvlh("bvna", bvlm(int ), (int)12));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -486931828: {
                    v2 = mo$ModuleTooltip.bvlh("bvnb", bvlm(int ), (int)13);
                    continue block23;
                }
                case -215512759: {
                    break block23;
                }
                case -118317087: {
                    v2 = mo$ModuleTooltip.bvlh("bvnc", bvlm(int ), (int)14);
                    continue block23;
                }
                case 659584888: {
                    v2 = mo$ModuleTooltip.bvlh("bvnd", bvlm(int ), (int)15);
                    continue block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = mo$ModuleTooltip.b;
        v3 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl30
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - mo$ModuleTooltip.bvlh("bvne", bvlm(int ), (int)16));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1709743373: {
                    v4 = mo$ModuleTooltip.bvlh("bvnf", bvlm(int ), (int)17);
                    continue block24;
                }
                case -917448154: {
                    v4 = mo$ModuleTooltip.bvlh("bvng", bvlm(int ), (int)18);
                    continue block24;
                }
                case -215512759: {
                    break block24;
                }
                case 1741815149: {
                    v4 = mo$ModuleTooltip.bvlh("bvnh", bvlm(int ), (int)19);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = mo$ModuleTooltip.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                }
                if (var2_4 != false) return (boolean)mo$ModuleTooltip.bvlh("bvni", bvle(int ), (int)29);
                if (var2_4 != false) return (boolean)mo$ModuleTooltip.bvlh("bvni", bvle(int ), (int)29);
                v5 /* !! */  = mo$ModuleTooltip.en;
                block25: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1810161990: {
                            v5 /* !! */  = (long)(mo$ModuleTooltip.bvlh("bvnk", bvlm(int ), (int)21) - mo$ModuleTooltip.bvlh("bvnj", bvlm(int ), (int)20));
                            continue block25;
                        }
                        case -215512759: {
                            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$ModuleTooltip.class, "description;anchorX;anchorY", "description", "anchorX", "anchorY"}, this, var1_1);
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$ModuleTooltip.class, "description;anchorX;anchorY", "description", "anchorX", "anchorY"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvnl", bvle(int ), (int)30);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl69
            }
            case 3: {
                var3_3 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvno", bvle(int ), (int)33);
                if (var4_2) {
                    throw null;
                }
lbl69:
                // 3 sources

                var3_3 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvnm", bvle(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var3_3 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvnn", bvle(int ), (int)32);
        } while (!var4_2);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        boolean bl2;
        Object object = en;
        boolean bl3 = true;
        block6: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - mo$ModuleTooltip.bvlh("bvmf", bvlm(int ), (int)4);
            }
            switch ((int)object) {
                case -1027863408: {
                    callSite = mo$ModuleTooltip.bvlh("bvmg", bvlm(int ), (int)5);
                    continue block6;
                }
                case -215512759: {
                    break block6;
                }
                case 443802835: {
                    callSite = mo$ModuleTooltip.bvlh("bvmh", bvlm(int ), (int)6);
                    continue block6;
                }
                case 1626320026: {
                    callSite = mo$ModuleTooltip.bvlh("bvmi", bvlm(int ), (int)7);
                    continue block6;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = en - mo$ModuleTooltip.bvlh("bvmj", bvlm(int ), (int)8)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$ModuleTooltip.bvlh("bvmk", bvle(int ), (int)16)) break;
            object2 = mo$ModuleTooltip.bvlh("bvml", bvle(int ), (int)17);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = en - mo$ModuleTooltip.bvlh("bvmm", bvlm(int ), (int)9)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mo$ModuleTooltip.bvlh("bvmn", bvle(int ), (int)18)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = mo$ModuleTooltip.bvlh("bvmo", bvle(int ), (int)19);
        }
        if (bl2) return (int)mo$ModuleTooltip.bvlh("bvmp", bvle(int ), (int)20);
        if (bl2) return (int)mo$ModuleTooltip.bvlh("bvmp", bvle(int ), (int)20);
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = en - mo$ModuleTooltip.bvlh("bvmq", bvlm(int ), (int)10)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == mo$ModuleTooltip.bvlh("bvmr", bvle(int ), (int)21)) {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$ModuleTooltip.class, "description;anchorX;anchorY", "description", "anchorX", "anchorY"}, this);
            }
            object4 = mo$ModuleTooltip.bvlh("bvms", bvle(int ), (int)22);
        }
    }

    private static /* synthetic */ long bvlm(int n2) {
        return bvln[n2] ^ bvlo[n2];
    }

    private static /* synthetic */ void bwul() {
        mo$ModuleTooltip.bvlf[0] = -695155410;
        mo$ModuleTooltip.bvlf[1] = 577763845;
        mo$ModuleTooltip.bvlf[2] = 523141084;
        mo$ModuleTooltip.bvlf[3] = 740346993;
        mo$ModuleTooltip.bvlf[4] = -81793058;
        mo$ModuleTooltip.bvlf[5] = 363027149;
        mo$ModuleTooltip.bvlf[6] = 1315231242;
        mo$ModuleTooltip.bvlf[7] = 1188327936;
        mo$ModuleTooltip.bvlf[8] = -428969757;
        mo$ModuleTooltip.bvlf[9] = 1137198112;
        mo$ModuleTooltip.bvlf[10] = -1208547086;
        mo$ModuleTooltip.bvlf[11] = -347071569;
        mo$ModuleTooltip.bvlf[12] = 1984469202;
        mo$ModuleTooltip.bvlf[13] = -178511354;
        mo$ModuleTooltip.bvlf[14] = -634074564;
        mo$ModuleTooltip.bvlf[15] = 88506811;
        mo$ModuleTooltip.bvlf[16] = 80527831;
        mo$ModuleTooltip.bvlf[17] = 1218035711;
        mo$ModuleTooltip.bvlf[18] = -1409728801;
        mo$ModuleTooltip.bvlf[19] = -224536392;
        mo$ModuleTooltip.bvlf[20] = 54902185;
        mo$ModuleTooltip.bvlf[21] = -1736239686;
        mo$ModuleTooltip.bvlf[22] = 279602110;
        mo$ModuleTooltip.bvlf[23] = -1172645971;
        mo$ModuleTooltip.bvlf[24] = 1519276417;
        mo$ModuleTooltip.bvlf[25] = 1545072222;
        mo$ModuleTooltip.bvlf[26] = -543018105;
        mo$ModuleTooltip.bvlf[27] = -2076537052;
        mo$ModuleTooltip.bvlf[28] = -700763824;
        mo$ModuleTooltip.bvlf[29] = -2107416945;
        mo$ModuleTooltip.bvlf[30] = -1348813940;
        mo$ModuleTooltip.bvlf[31] = -658151114;
        mo$ModuleTooltip.bvlf[32] = -776619242;
        mo$ModuleTooltip.bvlf[33] = -480030696;
        mo$ModuleTooltip.bvlf[34] = 381645970;
        mo$ModuleTooltip.bvlf[35] = -1663032522;
        mo$ModuleTooltip.bvlf[36] = 2144622865;
        mo$ModuleTooltip.bvlf[37] = 2072718907;
        mo$ModuleTooltip.bvlf[38] = 597769972;
        mo$ModuleTooltip.bvlf[39] = 606398603;
        mo$ModuleTooltip.bvlf[40] = -818840549;
        mo$ModuleTooltip.bvlf[41] = 1224574064;
        mo$ModuleTooltip.bvlf[42] = -812756392;
        mo$ModuleTooltip.bvlf[43] = -946326256;
        mo$ModuleTooltip.bvlf[44] = -1765125025;
        mo$ModuleTooltip.bvlf[45] = -1191028020;
        mo$ModuleTooltip.bvlf[46] = 356724549;
        mo$ModuleTooltip.bvlf[47] = -1200702430;
        mo$ModuleTooltip.bvlf[48] = -1953670407;
        mo$ModuleTooltip.bvlf[49] = 1712726613;
        mo$ModuleTooltip.bvlf[50] = -285912194;
        mo$ModuleTooltip.bvlf[51] = -1683627132;
        mo$ModuleTooltip.bvlf[52] = 194340677;
        mo$ModuleTooltip.bvlf[53] = 1220812468;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float anchorX() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvog", bvlm(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ModuleTooltip.bvlh("bvoh", bvle(int ), (int)40)) break;
            v0 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvoi", bvle(int ), (int)41);
        }
        var3_1 = mo$ModuleTooltip.c;
        v1 /* !! */  = mo$ModuleTooltip.en;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - mo$ModuleTooltip.bvlh("bvoj", bvlm(int ), (int)34));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1660004546: {
                    v2 = mo$ModuleTooltip.bvlh("bvok", bvlm(int ), (int)35);
                    continue block18;
                }
                case -215512759: {
                    break block18;
                }
                case 204562519: {
                    v2 = mo$ModuleTooltip.bvlh("bvol", bvlm(int ), (int)36);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$ModuleTooltip.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$ModuleTooltip.en - mo$ModuleTooltip.bvlh("bvom", bvlm(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$ModuleTooltip.bvlh("bvon", bvle(int ), (int)42)) break;
            v3 /* !! */  = (long)mo$ModuleTooltip.bvlh("bvoo", bvle(int ), (int)43);
        }
        var1_3 = mo$ModuleTooltip.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (float)mo$ModuleTooltip.bvlh("bvoq", bvop(int ), (int)44);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mo$ModuleTooltip.en;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$ModuleTooltip.bvlh("bvor", bvlm(int ), (int)38));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1645660046: {
                            v5 = mo$ModuleTooltip.bvlh("bvos", bvlm(int ), (int)39);
                            continue block21;
                        }
                        case -1075035034: {
                            v5 = mo$ModuleTooltip.bvlh("bvot", bvlm(int ), (int)40);
                            continue block21;
                        }
                        case -215512759: {
                            break block21;
                        }
                        case 1203801881: {
                            v5 = mo$ModuleTooltip.bvlh("bvou", bvlm(int ), (int)41);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.anchorX;
            }
lbl55:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvov", bvle(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvow", bvle(int ), (int)46);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvox", bvle(int ), (int)47);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvoy", bvle(int ), (int)48);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bwum() {
        mo$ModuleTooltip.bvlg[0] = -695155410;
        mo$ModuleTooltip.bvlg[1] = 577763847;
        mo$ModuleTooltip.bvlg[2] = 523141087;
        mo$ModuleTooltip.bvlg[3] = 740346992;
        mo$ModuleTooltip.bvlg[4] = 81793057;
        mo$ModuleTooltip.bvlg[5] = -1200815139;
        mo$ModuleTooltip.bvlg[6] = -1315231243;
        mo$ModuleTooltip.bvlg[7] = -186111773;
        mo$ModuleTooltip.bvlg[8] = 428969756;
        mo$ModuleTooltip.bvlg[9] = 1268036675;
        mo$ModuleTooltip.bvlg[10] = 1208547085;
        mo$ModuleTooltip.bvlg[11] = 1980975020;
        mo$ModuleTooltip.bvlg[12] = 1984469202;
        mo$ModuleTooltip.bvlg[13] = -178511353;
        mo$ModuleTooltip.bvlg[14] = -634074564;
        mo$ModuleTooltip.bvlg[15] = 88506809;
        mo$ModuleTooltip.bvlg[16] = -80527832;
        mo$ModuleTooltip.bvlg[17] = 200907068;
        mo$ModuleTooltip.bvlg[18] = -1409728802;
        mo$ModuleTooltip.bvlg[19] = 1850376764;
        mo$ModuleTooltip.bvlg[20] = -185986135;
        mo$ModuleTooltip.bvlg[21] = 1736239685;
        mo$ModuleTooltip.bvlg[22] = -1931695564;
        mo$ModuleTooltip.bvlg[23] = -1172645969;
        mo$ModuleTooltip.bvlg[24] = 1519276417;
        mo$ModuleTooltip.bvlg[25] = 1545072223;
        mo$ModuleTooltip.bvlg[26] = -543018107;
        mo$ModuleTooltip.bvlg[27] = -2076537051;
        mo$ModuleTooltip.bvlg[28] = -962869859;
        mo$ModuleTooltip.bvlg[29] = -2107416945;
        mo$ModuleTooltip.bvlg[30] = -1348813939;
        mo$ModuleTooltip.bvlg[31] = -658151114;
        mo$ModuleTooltip.bvlg[32] = -776619242;
        mo$ModuleTooltip.bvlg[33] = -480030694;
        mo$ModuleTooltip.bvlg[34] = -381645971;
        mo$ModuleTooltip.bvlg[35] = 1365388247;
        mo$ModuleTooltip.bvlg[36] = 2144622867;
        mo$ModuleTooltip.bvlg[37] = 2072718907;
        mo$ModuleTooltip.bvlg[38] = 597769972;
        mo$ModuleTooltip.bvlg[39] = 606398600;
        mo$ModuleTooltip.bvlg[40] = -818840550;
        mo$ModuleTooltip.bvlg[41] = -606504182;
        mo$ModuleTooltip.bvlg[42] = -812756391;
        mo$ModuleTooltip.bvlg[43] = -288659200;
        mo$ModuleTooltip.bvlg[44] = -1446653424;
        mo$ModuleTooltip.bvlg[45] = -1191028018;
        mo$ModuleTooltip.bvlg[46] = 356724550;
        mo$ModuleTooltip.bvlg[47] = -1200702430;
        mo$ModuleTooltip.bvlg[48] = -1953670406;
        mo$ModuleTooltip.bvlg[49] = 1478801597;
        mo$ModuleTooltip.bvlg[50] = -285912194;
        mo$ModuleTooltip.bvlg[51] = -1683627132;
        mo$ModuleTooltip.bvlg[52] = 194340677;
        mo$ModuleTooltip.bvlg[53] = 1220812471;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$ModuleTooltip(String var1_1, float var2_2, float var3_3) {
        var5_4 /* !! */  = mo$ModuleTooltip.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.description = var1_1;
                this.anchorX = var2_2;
                this.anchorY = var3_3;
                return;
            }
            case 0: {
                while (true) {
                    var5_4 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvli", bvle(int ), (int)0);
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvlj", bvle(int ), (int)1);
            }
            case 2: {
                var5_4 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvlk", bvle(int ), (int)2);
            }
            case 3: 
        }
        while (true) {
            var5_4 /* !! */  = (int)mo$ModuleTooltip.bvlh("bvll", bvle(int ), (int)3);
        }
    }
}

