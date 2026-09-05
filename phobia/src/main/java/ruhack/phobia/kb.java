/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class kb
extends jx {
    private static long[] ljzg;
    public static final boolean c;
    private static long[] ljzh;
    private static int[] ljyw;
    private static final long ub = 3533409657175886797L;
    private int key;
    public static final boolean a;
    private static int[] ljyv;
    public static final int b;
    private boolean value;
    private int type;

    private static /* synthetic */ void lked() {
        kb.ljzh[0] = -5708907649600371168L;
        kb.ljzh[1] = -2224096099690228305L;
        kb.ljzh[2] = -8427804298083544530L;
        kb.ljzh[3] = -5439847458509039529L;
        kb.ljzh[4] = 7461087313910358113L;
        kb.ljzh[5] = 5799475605308105070L;
        kb.ljzh[6] = 5766662318033262429L;
        kb.ljzh[7] = 3646232475820979965L;
        kb.ljzh[8] = 6451980743014881136L;
        kb.ljzh[9] = -3599264349951032325L;
        kb.ljzh[10] = 3704806260043827810L;
        kb.ljzh[11] = 5574031154702194202L;
        kb.ljzh[12] = -4529218236262140323L;
        kb.ljzh[13] = 1145352779178275429L;
        kb.ljzh[14] = 7096089440005303208L;
        kb.ljzh[15] = 7903363321080863684L;
        kb.ljzh[16] = 6095648552288431212L;
        kb.ljzh[17] = 6518086720925466493L;
        kb.ljzh[18] = 984759521751463447L;
        kb.ljzh[19] = -5609177498504854685L;
        kb.ljzh[20] = 2285169119681112528L;
        kb.ljzh[21] = -662269089929691678L;
        kb.ljzh[22] = -4781853996596610865L;
        kb.ljzh[23] = -8142361978979473446L;
        kb.ljzh[24] = -784646362324405281L;
        kb.ljzh[25] = -9117304125509321742L;
        kb.ljzh[26] = -2574718672292860159L;
        kb.ljzh[27] = -4980836273568965104L;
        kb.ljzh[28] = -4591562546170613433L;
        kb.ljzh[29] = -8046750302163996376L;
        kb.ljzh[30] = -7845364890867691818L;
        kb.ljzh[31] = -1898382315677656297L;
        kb.ljzh[32] = -5511978557664646596L;
        kb.ljzh[33] = 6376645366914383804L;
        kb.ljzh[34] = -5496218615261291344L;
        kb.ljzh[35] = 1280347527308698922L;
        kb.ljzh[36] = 8650003862171534215L;
        kb.ljzh[37] = 8539151650640170722L;
        kb.ljzh[38] = 9108698709152822502L;
        kb.ljzh[39] = 1563158749180670089L;
        kb.ljzh[40] = 2013317538416795851L;
        kb.ljzh[41] = -8465502340314874340L;
        kb.ljzh[42] = 2141081955998340603L;
        kb.ljzh[43] = 3796972848727545351L;
        kb.ljzh[44] = 1146602639867053948L;
        kb.ljzh[45] = -5127495077376518013L;
        kb.ljzh[46] = 2747124450692993062L;
        kb.ljzh[47] = 5930283252563892658L;
        kb.ljzh[48] = -4273886308320316560L;
        kb.ljzh[49] = -5162892922343786669L;
        kb.ljzh[50] = -8533448293154861566L;
        kb.ljzh[51] = 8200660599536100486L;
        kb.ljzh[52] = -3178335001059314519L;
        kb.ljzh[53] = -1603842438282790790L;
        kb.ljzh[54] = -867628499976192747L;
        kb.ljzh[55] = -6301739299785705403L;
        kb.ljzh[56] = -993314925123660331L;
        kb.ljzh[57] = -1911407858573596854L;
        kb.ljzh[58] = -2201456276170049780L;
        kb.ljzh[59] = -2133652869225324860L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb(String var1_1, String var2_2) {
        var4_3 /* !! */  = kb.b;
        super(var1_1, var2_2);
        this.key = (int)kb.ljyx("ljyy", ljyu(int ), (int)0);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.type = (int)kb.ljyx("ljyz", ljyu(int ), (int)1);
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)kb.ljyx("ljza", ljyu(int ), (int)2);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)kb.ljyx("ljzb", ljyu(int ), (int)3);
                    ** GOTO lbl17
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)kb.ljyx("ljzc", ljyu(int ), (int)4);
            }
lbl17:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)kb.ljyx("ljzd", ljyu(int ), (int)5);
            }
            case 4: 
        }
        var4_3 /* !! */  = (int)kb.ljyx("ljze", ljyu(int ), (int)6);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kb setType(int var1_1) {
        v0 /* !! */  = kb.ub;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - kb.ljyx("lkdi", ljzf(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -974697523: {
                    break block23;
                }
                case -272967224: {
                    v1 = kb.ljyx("lkdj", ljzf(int ), (int)50);
                    continue block23;
                }
                case -19027101: {
                    v1 = kb.ljyx("lkdk", ljzf(int ), (int)51);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = kb.c;
        while (true) {
            block38: {
                if ((v2 /* !! */  = (cfr_temp_1 = kb.ub - kb.ljyx("lkdl", ljzf(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != kb.ljyx("lkdm", ljyu(int ), (int)62)) break block38;
                var3_3 /* !! */  = kb.b;
                v3 /* !! */  = kb.ub;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)kb.ljyx("lkdn", ljyu(int ), (int)63);
        }
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - kb.ljyx("lkdo", ljzf(int ), (int)53));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -974697523: {
                    break block25;
                }
                case 294379974: {
                    v4 = kb.ljyx("lkdp", ljzf(int ), (int)54);
                    continue block25;
                }
                case 1814056157: {
                    v4 = kb.ljyx("lkdq", ljzf(int ), (int)55);
                    continue block25;
                }
                case 2083315318: {
                    v4 = kb.ljyx("lkdr", ljzf(int ), (int)56);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = kb.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4) ** GOTO lbl63
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: while (true) {
            block39: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4) ** GOTO lbl63
                        v5 /* !! */  = kb.ub;
                        block27: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -974697523: {
                                    break block27;
                                }
                                case 4841037: {
                                    v6 = kb.ljyx("lkdt", ljzf(int ), (int)58);
                                    ** GOTO lbl59
                                }
                                case 2117308195: {
                                    v6 = kb.ljyx("lkdu", ljzf(int ), (int)59);
lbl59:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - kb.ljyx("lkds", ljzf(int ), (int)57));
                                    continue block27;
                                }
                            }
                            break;
                        }
                        this.type = var1_1;
                        if (!var2_4) ** GOTO lbl64
lbl63:
                        // 3 sources

                        return null;
lbl64:
                        // 1 sources

                        return this;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdv", ljyu(int ), (int)64);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdw", ljyu(int ), (int)65);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block39;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdz", ljyu(int ), (int)68);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdx", ljyu(int ), (int)66);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl89
            }
            do {
                if (true) continue block26;
lbl89:
                // 2 sources

                var3_3 /* !! */  = (int)kb.ljyx("lkdy", ljyu(int ), (int)67);
                cfr_temp_0 = 2;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    public static /* synthetic */ CallSite ljyx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lkec() {
        kb.ljzg[0] = -9022762122276797796L;
        kb.ljzg[1] = -5325442050365396804L;
        kb.ljzg[2] = 8786654838908154224L;
        kb.ljzg[3] = 6377957628822155961L;
        kb.ljzg[4] = -5738599328015961582L;
        kb.ljzg[5] = 8681487637961874255L;
        kb.ljzg[6] = 6257617771851470318L;
        kb.ljzg[7] = 8526261034693590654L;
        kb.ljzg[8] = -6552750057304599572L;
        kb.ljzg[9] = -1599576985034868837L;
        kb.ljzg[10] = -8283357945440162416L;
        kb.ljzg[11] = 1092274034051818198L;
        kb.ljzg[12] = 4421546422678796348L;
        kb.ljzg[13] = -3844907511813753858L;
        kb.ljzg[14] = -6723440895899169727L;
        kb.ljzg[15] = -7359707704085022393L;
        kb.ljzg[16] = -2486451994878542761L;
        kb.ljzg[17] = -5394984217999713190L;
        kb.ljzg[18] = 571793745198291909L;
        kb.ljzg[19] = 2001453616482461037L;
        kb.ljzg[20] = 3215423540113765702L;
        kb.ljzg[21] = -5600067018552608016L;
        kb.ljzg[22] = 7633361584840827930L;
        kb.ljzg[23] = -8159487415166731751L;
        kb.ljzg[24] = 2746401872166405436L;
        kb.ljzg[25] = 979444566702990062L;
        kb.ljzg[26] = -8379732556810236163L;
        kb.ljzg[27] = -458551006419038294L;
        kb.ljzg[28] = -3190965195410059273L;
        kb.ljzg[29] = -1183857891127421202L;
        kb.ljzg[30] = 1227624201487065203L;
        kb.ljzg[31] = -192178828334039704L;
        kb.ljzg[32] = -5562615400770979015L;
        kb.ljzg[33] = 9170848724116472224L;
        kb.ljzg[34] = 3237599013437017280L;
        kb.ljzg[35] = 4824455438936205732L;
        kb.ljzg[36] = 5066927442561786656L;
        kb.ljzg[37] = -2686157593548468506L;
        kb.ljzg[38] = -1590207426587102402L;
        kb.ljzg[39] = 1629033558139754772L;
        kb.ljzg[40] = 9144268774480991785L;
        kb.ljzg[41] = -1084630956049484724L;
        kb.ljzg[42] = 5326744089232055334L;
        kb.ljzg[43] = 6004355122763312380L;
        kb.ljzg[44] = -243549745671773181L;
        kb.ljzg[45] = 1910191163365060388L;
        kb.ljzg[46] = 4219417420828527642L;
        kb.ljzg[47] = -1237849485240231102L;
        kb.ljzg[48] = 5589499540835828798L;
        kb.ljzg[49] = -447307295408568002L;
        kb.ljzg[50] = -4019514815314099489L;
        kb.ljzg[51] = 4185896983627628974L;
        kb.ljzg[52] = 1043087300656797553L;
        kb.ljzg[53] = -7484985246315108422L;
        kb.ljzg[54] = 2219422181770327488L;
        kb.ljzg[55] = -2128789400047740261L;
        kb.ljzg[56] = -7587615792295310582L;
        kb.ljzg[57] = 5195484812319055931L;
        kb.ljzg[58] = 7977360562937894539L;
        kb.ljzg[59] = 7113674463580992216L;
    }

    private static /* synthetic */ void lkea() {
        kb.ljyv[0] = 2014259738;
        kb.ljyv[1] = -496932741;
        kb.ljyv[2] = 1133490349;
        kb.ljyv[3] = -2142679798;
        kb.ljyv[4] = -550977522;
        kb.ljyv[5] = 1560636303;
        kb.ljyv[6] = 1801731686;
        kb.ljyv[7] = 385294482;
        kb.ljyv[8] = -1476370725;
        kb.ljyv[9] = 1964931749;
        kb.ljyv[10] = 35170205;
        kb.ljyv[11] = 2073793740;
        kb.ljyv[12] = 1491172449;
        kb.ljyv[13] = 1590146006;
        kb.ljyv[14] = 2045471934;
        kb.ljyv[15] = 702181378;
        kb.ljyv[16] = 1035299145;
        kb.ljyv[17] = -1270075443;
        kb.ljyv[18] = 374047122;
        kb.ljyv[19] = 1619114295;
        kb.ljyv[20] = 1078057690;
        kb.ljyv[21] = 312166894;
        kb.ljyv[22] = -773033240;
        kb.ljyv[23] = -761079513;
        kb.ljyv[24] = -129911887;
        kb.ljyv[25] = 785357568;
        kb.ljyv[26] = 1989914877;
        kb.ljyv[27] = 1205570620;
        kb.ljyv[28] = 869870943;
        kb.ljyv[29] = 2068907128;
        kb.ljyv[30] = 1160034329;
        kb.ljyv[31] = 1433273562;
        kb.ljyv[32] = -784816992;
        kb.ljyv[33] = 93931236;
        kb.ljyv[34] = -218694583;
        kb.ljyv[35] = 529276263;
        kb.ljyv[36] = 349677104;
        kb.ljyv[37] = -2002619394;
        kb.ljyv[38] = 25854054;
        kb.ljyv[39] = 2031851537;
        kb.ljyv[40] = 1353217669;
        kb.ljyv[41] = -1586398355;
        kb.ljyv[42] = 491869771;
        kb.ljyv[43] = -283672159;
        kb.ljyv[44] = 85487867;
        kb.ljyv[45] = -918956493;
        kb.ljyv[46] = 664162483;
        kb.ljyv[47] = -1293009786;
        kb.ljyv[48] = 1295200915;
        kb.ljyv[49] = 968947565;
        kb.ljyv[50] = 1457667185;
        kb.ljyv[51] = -693767319;
        kb.ljyv[52] = -310842326;
        kb.ljyv[53] = 648757094;
        kb.ljyv[54] = 1900061687;
        kb.ljyv[55] = 721157796;
        kb.ljyv[56] = -2136716759;
        kb.ljyv[57] = -712303007;
        kb.ljyv[58] = 214001418;
        kb.ljyv[59] = -1070718430;
        kb.ljyv[60] = -1856574353;
        kb.ljyv[61] = -1314104880;
        kb.ljyv[62] = -1504864765;
        kb.ljyv[63] = 565530394;
        kb.ljyv[64] = -1646104929;
        kb.ljyv[65] = -1043174101;
        kb.ljyv[66] = 1386122259;
        kb.ljyv[67] = 418215112;
        kb.ljyv[68] = -1191138680;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int getKey() {
        Object object = ub;
        boolean bl2 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - kb.ljyx("lkas", ljzf(int ), (int)17);
            }
            switch ((int)object) {
                case -2140593215: {
                    callSite = kb.ljyx("lkat", ljzf(int ), (int)18);
                    continue block16;
                }
                case -1234744289: {
                    callSite = kb.ljyx("lkau", ljzf(int ), (int)19);
                    continue block16;
                }
                case -974697523: {
                    break block16;
                }
                case 1850342586: {
                    callSite = kb.ljyx("lkav", ljzf(int ), (int)20);
                    continue block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ub;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - kb.ljyx("lkaw", ljzf(int ), (int)21);
            }
            switch ((int)object2) {
                case -985236945: {
                    callSite = kb.ljyx("lkax", ljzf(int ), (int)22);
                    continue block17;
                }
                case -974697523: {
                    break block17;
                }
                case -878795770: {
                    callSite = kb.ljyx("lkay", ljzf(int ), (int)23);
                    continue block17;
                }
                case 1060009770: {
                    callSite = kb.ljyx("lkaz", ljzf(int ), (int)24);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ub;
        block18: while (true) {
            switch ((int)object3) {
                case -974697523: {
                    break block18;
                }
                case -785958786: {
                    object3 = kb.ljyx("lkbb", ljzf(int ), (int)26) - kb.ljyx("lkba", ljzf(int ), (int)25);
                    continue block18;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (int)kb.ljyx("lkbc", ljyu(int ), (int)26);
        if (bl5) return (int)kb.ljyx("lkbc", ljyu(int ), (int)26);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ub - kb.ljyx("lkbd", ljzf(int ), (int)27)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == kb.ljyx("lkbe", ljyu(int ), (int)27)) {
                return this.key;
            }
            object4 = kb.ljyx("lkbf", ljyu(int ), (int)28);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kb visible(Supplier<Boolean> var1_1) {
        v0 /* !! */  = kb.ub;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - kb.ljyx("ljzi", ljzf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -974697523: {
                    break block17;
                }
                case 506640941: {
                    v1 = kb.ljyx("ljzj", ljzf(int ), (int)1);
                    continue block17;
                }
                case 945392048: {
                    v1 = kb.ljyx("ljzk", ljzf(int ), (int)2);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = kb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kb.ub - kb.ljyx("ljzl", ljzf(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kb.ljyx("ljzm", ljyu(int ), (int)7)) break;
            v2 /* !! */  = (long)kb.ljyx("ljzn", ljyu(int ), (int)8);
        }
        var3_3 /* !! */  = kb.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kb.ub - kb.ljyx("ljzo", ljzf(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kb.ljyx("ljzp", ljyu(int ), (int)9)) {
                var2_4 = kb.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)kb.ljyx("ljzq", ljyu(int ), (int)10);
        }
        if (var2_4 || var2_4) return null;
        v4 /* !! */  = kb.ub;
        block20: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -1920330682: {
                    v4 /* !! */  = (long)(kb.ljyx("ljzs", ljzf(int ), (int)6) - kb.ljyx("ljzr", ljzf(int ), (int)5));
                    continue block20;
                }
                case -974697523: {
                    break block20;
                }
            }
            break;
        }
        this.setVisible(var1_1);
        if (var2_4) return null;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) return this;
                return null;
            }
            case 0: {
                var3_3 /* !! */  = (int)kb.ljyx("ljzt", ljyu(int ), (int)11);
                if (!var4_2) ** break;
                throw null;
            }
            case 1: {
                ** GOTO lbl61
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)kb.ljyx("ljzx", ljyu(int ), (int)15);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)kb.ljyx("ljzy", ljyu(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
lbl61:
                // 3 sources

                var3_3 /* !! */  = (int)kb.ljyx("ljzu", ljyu(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)kb.ljyx("ljzw", ljyu(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var3_3 /* !! */  = (int)kb.ljyx("ljzv", ljyu(int ), (int)13);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lkeb() {
        kb.ljyw[0] = -2014259739;
        kb.ljyw[1] = -496932742;
        kb.ljyw[2] = 1133490348;
        kb.ljyw[3] = -2142679794;
        kb.ljyw[4] = -550977521;
        kb.ljyw[5] = 1560636300;
        kb.ljyw[6] = 1801731684;
        kb.ljyw[7] = 385294483;
        kb.ljyw[8] = 1204052719;
        kb.ljyw[9] = 1964931748;
        kb.ljyw[10] = 1654410621;
        kb.ljyw[11] = 2073793742;
        kb.ljyw[12] = 1491172452;
        kb.ljyw[13] = 1590146002;
        kb.ljyw[14] = 2045471933;
        kb.ljyw[15] = 702181377;
        kb.ljyw[16] = 1035299149;
        kb.ljyw[17] = 1270075442;
        kb.ljyw[18] = 615390078;
        kb.ljyw[19] = 1619114295;
        kb.ljyw[20] = 1078057691;
        kb.ljyw[21] = 1563400255;
        kb.ljyw[22] = -773033238;
        kb.ljyw[23] = -761079515;
        kb.ljyw[24] = -129911887;
        kb.ljyw[25] = 785357571;
        kb.ljyw[26] = -1504287110;
        kb.ljyw[27] = -1205570621;
        kb.ljyw[28] = -1790540996;
        kb.ljyw[29] = 2068907131;
        kb.ljyw[30] = 1160034329;
        kb.ljyw[31] = 1433273560;
        kb.ljyw[32] = -784816991;
        kb.ljyw[33] = 93931237;
        kb.ljyw[34] = -1208413763;
        kb.ljyw[35] = -529276264;
        kb.ljyw[36] = -362522349;
        kb.ljyw[37] = -2002619393;
        kb.ljyw[38] = -1124503717;
        kb.ljyw[39] = -1678385300;
        kb.ljyw[40] = 1353217668;
        kb.ljyw[41] = -263284304;
        kb.ljyw[42] = 491869768;
        kb.ljyw[43] = -283672158;
        kb.ljyw[44] = 85487867;
        kb.ljyw[45] = -918956494;
        kb.ljyw[46] = -664162484;
        kb.ljyw[47] = -1120296164;
        kb.ljyw[48] = -1295200916;
        kb.ljyw[49] = -1276672701;
        kb.ljyw[50] = 1457667189;
        kb.ljyw[51] = -693767317;
        kb.ljyw[52] = -310842322;
        kb.ljyw[53] = 648757095;
        kb.ljyw[54] = 1900061683;
        kb.ljyw[55] = -721157797;
        kb.ljyw[56] = 902692234;
        kb.ljyw[57] = -712303007;
        kb.ljyw[58] = 214001422;
        kb.ljyw[59] = -1070718429;
        kb.ljyw[60] = -1856574354;
        kb.ljyw[61] = -1314104880;
        kb.ljyw[62] = -1504864766;
        kb.ljyw[63] = 1167835995;
        kb.ljyw[64] = -1646104933;
        kb.ljyw[65] = -1043174102;
        kb.ljyw[66] = 1386122259;
        kb.ljyw[67] = 418215114;
        kb.ljyw[68] = -1191138680;
    }

    private static /* synthetic */ int ljyu(int n2) {
        return ljyv[n2] ^ ljyw[n2];
    }

    static {
        ljyv = new int[69];
        ljyw = new int[69];
        kb.lkea();
        kb.lkeb();
        ljzg = new long[60];
        ljzh = new long[60];
        kb.lkec();
        kb.lked();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kb.ub - kb.ljyx("ljzz", ljzf(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kb.ljyx("lkaa", ljyu(int ), (int)17)) break;
            v0 /* !! */  = (long)kb.ljyx("lkab", ljyu(int ), (int)18);
        }
        var3_1 = kb.c;
        v1 /* !! */  = kb.ub;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - kb.ljyx("lkac", ljzf(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1820227909: {
                    v2 = kb.ljyx("lkad", ljzf(int ), (int)9);
                    continue block19;
                }
                case -974697523: {
                    break block19;
                }
                case 268096389: {
                    v2 = kb.ljyx("lkae", ljzf(int ), (int)10);
                    continue block19;
                }
                case 535587340: {
                    v2 = kb.ljyx("lkaf", ljzf(int ), (int)11);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = kb.b;
        v3 /* !! */  = kb.ub;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - kb.ljyx("lkag", ljzf(int ), (int)12));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2034783460: {
                    v4 = kb.ljyx("lkah", ljzf(int ), (int)13);
                    continue block20;
                }
                case -1454483880: {
                    v4 = kb.ljyx("lkai", ljzf(int ), (int)14);
                    continue block20;
                }
                case -974697523: {
                    break block20;
                }
                case 1476197686: {
                    v4 = kb.ljyx("lkaj", ljzf(int ), (int)15);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = kb.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)kb.ljyx("lkak", ljyu(int ), (int)19);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kb.ub - kb.ljyx("lkal", ljzf(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == kb.ljyx("lkam", ljyu(int ), (int)20)) break;
                    v5 /* !! */  = (long)kb.ljyx("lkan", ljyu(int ), (int)21);
                }
                return this.value;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kb.ljyx("lkao", ljyu(int ), (int)22);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl68
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)kb.ljyx("lkap", ljyu(int ), (int)23);
                } while (!var3_1);
                throw null;
            }
lbl68:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)kb.ljyx("lkaq", ljyu(int ), (int)24);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kb.ljyx("lkar", ljyu(int ), (int)25);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long ljzf(int n2) {
        return ljzg[n2] ^ ljzh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb setKey(int var1_1) {
        v0 /* !! */  = kb.ub;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(kb.ljyx("lkcu", ljzf(int ), (int)42) - kb.ljyx("lkct", ljzf(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -974697523: {
                    break block20;
                }
                case 227675361: {
                    continue block20;
                }
            }
            break;
        }
        var4_2 = kb.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kb.ub - kb.ljyx("lkcv", ljzf(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kb.ljyx("lkcw", ljyu(int ), (int)55)) break;
            v1 /* !! */  = (long)kb.ljyx("lkcx", ljyu(int ), (int)56);
        }
        var3_3 /* !! */  = kb.b;
        v2 /* !! */  = kb.ub;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - kb.ljyx("lkcy", ljzf(int ), (int)44));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2012381039: {
                    v3 = kb.ljyx("lkcz", ljzf(int ), (int)45);
                    continue block22;
                }
                case -974697523: {
                    break block22;
                }
                case 419050761: {
                    v3 = kb.ljyx("lkda", ljzf(int ), (int)46);
                    continue block22;
                }
            }
            break;
        }
        var2_4 = kb.a;
        if (!var4_2) ** GOTO lbl38
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var2_4 || var2_4) continue block23;
                v4 /* !! */  = kb.ub;
                if (true) ** GOTO lbl43
                block24: while (true) {
                    v4 /* !! */  = (long)(kb.ljyx("lkdc", ljzf(int ), (int)48) - kb.ljyx("lkdb", ljzf(int ), (int)47));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1529315123: {
                            continue block24;
                        }
                        case -974697523: {
                            break block24;
                        }
                    }
                    break;
                }
                this.key = var1_1;
                if (!var2_4) ** break;
                continue block23;
                return this;
lbl52:
                // 2 sources

                case 0: {
                    do {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdd", ljyu(int ), (int)57);
                    } while (!var4_2);
                    throw null;
                }
                case 1: {
                    var3_3 /* !! */  = (int)kb.ljyx("lkde", ljyu(int ), (int)58);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl66
                }
                case 2: {
                    var3_3 /* !! */  = (int)kb.ljyx("lkdf", ljyu(int ), (int)59);
                    if (!var4_2) ** GOTO lbl52
                    throw null;
                }
lbl66:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)kb.ljyx("lkdg", ljyu(int ), (int)60);
                        if (!var4_2) break block23;
                        throw null;
                    }
                }
                case 4: 
            }
        }
        var3_3 /* !! */  = (int)kb.ljyx("lkdh", ljyu(int ), (int)61);
        ** while (!var4_2)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getType() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ub - kb.ljyx("lkbk", ljzf(int ), (int)28)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == kb.ljyx("lkbl", ljyu(int ), (int)33)) break;
            object = kb.ljyx("lkbm", ljyu(int ), (int)34);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ub - kb.ljyx("lkbn", ljzf(int ), (int)29)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == kb.ljyx("lkbo", ljyu(int ), (int)35)) break;
            object = kb.ljyx("lkbp", ljyu(int ), (int)36);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ub - kb.ljyx("lkbq", ljzf(int ), (int)30)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == kb.ljyx("lkbr", ljyu(int ), (int)37)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = kb.ljyx("lkbs", ljyu(int ), (int)38);
        }
        if (bl2) return (int)kb.ljyx("lkbt", ljyu(int ), (int)39);
        if (bl2) return (int)kb.ljyx("lkbt", ljyu(int ), (int)39);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ub - kb.ljyx("lkbu", ljzf(int ), (int)31)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == kb.ljyx("lkbv", ljyu(int ), (int)40)) {
                return this.type;
            }
            object = kb.ljyx("lkbw", ljyu(int ), (int)41);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb setValue(boolean var1_1) {
        v0 /* !! */  = kb.ub;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - kb.ljyx("lkcb", ljzf(int ), (int)32));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1153155133: {
                    v1 = kb.ljyx("lkcc", ljzf(int ), (int)33);
                    continue block18;
                }
                case -974697523: {
                    break block18;
                }
                case 965005434: {
                    v1 = kb.ljyx("lkcd", ljzf(int ), (int)34);
                    continue block18;
                }
                case 1893774018: {
                    v1 = kb.ljyx("lkce", ljzf(int ), (int)35);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = kb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kb.ub - kb.ljyx("lkcf", ljzf(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kb.ljyx("lkcg", ljyu(int ), (int)46)) break;
            v2 /* !! */  = (long)kb.ljyx("lkch", ljyu(int ), (int)47);
        }
        var3_3 /* !! */  = kb.b;
        v3 /* !! */  = kb.ub;
        if (true) ** GOTO lbl28
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - kb.ljyx("lkci", ljzf(int ), (int)37));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -974697523: {
                    break block20;
                }
                case 620357909: {
                    v4 = kb.ljyx("lkcj", ljzf(int ), (int)38);
                    continue block20;
                }
                case 811232937: {
                    v4 = kb.ljyx("lkck", ljzf(int ), (int)39);
                    continue block20;
                }
            }
            break;
        }
        var2_4 = kb.a;
        if (var4_2) {
            throw null;
lbl40:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kb.ub - kb.ljyx("lkcl", ljzf(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kb.ljyx("lkcm", ljyu(int ), (int)48)) break;
                    v5 /* !! */  = (long)kb.ljyx("lkcn", ljyu(int ), (int)49);
                }
                this.value = var1_1;
                if (var2_4) ** continue;
                return this;
            }
lbl55:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kb.ljyx("lkco", ljyu(int ), (int)50);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: {
                var3_3 /* !! */  = (int)kb.ljyx("lkcp", ljyu(int ), (int)51);
                if (!var4_2) break;
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kb.ljyx("lkcq", ljyu(int ), (int)52);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
lbl68:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kb.ljyx("lkcr", ljyu(int ), (int)53);
                    if (!var4_2) ** GOTO lbl64
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kb.ljyx("lkcs", ljyu(int ), (int)54);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }
}

