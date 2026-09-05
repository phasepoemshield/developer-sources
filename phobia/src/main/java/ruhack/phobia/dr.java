/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ruhack.phobia.do;
import ruhack.phobia.dp;
import ruhack.phobia.ds;
import ruhack.phobia.eb;
import ruhack.phobia.eh;
import ruhack.phobia.ei;
import ruhack.phobia.ej;
import ruhack.phobia.ek;
import ruhack.phobia.en;
import ruhack.phobia.eo;
import ruhack.phobia.ep;
import ruhack.phobia.eq;
import ruhack.phobia.er;
import ruhack.phobia.et;
import ruhack.phobia.eu;
import ruhack.phobia.ev;
import ruhack.phobia.ew;
import ruhack.phobia.ey;
import ruhack.phobia.ez;
import ruhack.phobia.fa;
import ruhack.phobia.fb;
import ruhack.phobia.fc;
import ruhack.phobia.fd;
import ruhack.phobia.fe;
import ruhack.phobia.ff;
import ruhack.phobia.fg;
import ruhack.phobia.fh;
import ruhack.phobia.fi;
import ruhack.phobia.fk;
import ruhack.phobia.fl;
import ruhack.phobia.fm;
import ruhack.phobia.fo;
import ruhack.phobia.fp;
import ruhack.phobia.fr;
import ruhack.phobia.fs;
import ruhack.phobia.ft;
import ruhack.phobia.fu;
import ruhack.phobia.fv;
import ruhack.phobia.fw;
import ruhack.phobia.fx;
import ruhack.phobia.fy;
import ruhack.phobia.fz;
import ruhack.phobia.ga;
import ruhack.phobia.gb;
import ruhack.phobia.gc;
import ruhack.phobia.gd;
import ruhack.phobia.ge;
import ruhack.phobia.gf;
import ruhack.phobia.gg;
import ruhack.phobia.gh;
import ruhack.phobia.gi;
import ruhack.phobia.gj;
import ruhack.phobia.gk;
import ruhack.phobia.gm;
import ruhack.phobia.gn;
import ruhack.phobia.go;
import ruhack.phobia.gp;
import ruhack.phobia.gq;
import ruhack.phobia.gr;
import ruhack.phobia.gs;
import ruhack.phobia.gt;
import ruhack.phobia.gu;
import ruhack.phobia.gv;
import ruhack.phobia.gy;
import ruhack.phobia.gz;
import ruhack.phobia.ha;
import ruhack.phobia.hb;
import ruhack.phobia.hc;
import ruhack.phobia.hd;
import ruhack.phobia.he;
import ruhack.phobia.hf;
import ruhack.phobia.hg;
import ruhack.phobia.hh;
import ruhack.phobia.hi;
import ruhack.phobia.hj;
import ruhack.phobia.hk;
import ruhack.phobia.hl;
import ruhack.phobia.hm;
import ruhack.phobia.hn;
import ruhack.phobia.ho;
import ruhack.phobia.hp;
import ruhack.phobia.hq;
import ruhack.phobia.hr;
import ruhack.phobia.hs;
import ruhack.phobia.ht;
import ruhack.phobia.iu;
import ruhack.phobia.iv;
import ruhack.phobia.iw;
import ruhack.phobia.ix;
import ruhack.phobia.iy;
import ruhack.phobia.iz;
import ruhack.phobia.ja;
import ruhack.phobia.jb;
import ruhack.phobia.jc;
import ruhack.phobia.jd;
import ruhack.phobia.je;
import ruhack.phobia.jf;
import ruhack.phobia.jg;
import ruhack.phobia.jh;
import ruhack.phobia.ji;
import ruhack.phobia.jj;
import ruhack.phobia.jk;
import ruhack.phobia.jl;
import ruhack.phobia.jm;
import ruhack.phobia.jn;
import ruhack.phobia.jo;
import ruhack.phobia.jp;
import ruhack.phobia.jq;
import ruhack.phobia.jr;
import ruhack.phobia.js;
import ruhack.phobia.ju;

public class dr {
    private static int[] bsdl = new int[95];
    public static final int b;
    public static final boolean c;
    private static int[] bsdm;
    private static long[] bseb;
    private final List<ds> moduleStructures;
    private final List<ds> hiddenModules;
    public static final boolean a;
    private static long[] bsea;
    private final Set<Class<? extends ds>> registeredClasses;
    protected static final long eb = 2423144603386845893L;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public List<ds> allModules() {
        block45: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = dr.eb - dr.bsdn("bsis", bsdz(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == dr.bsdn("bsit", bsdk(int ), (int)77)) break;
                v0 /* !! */  = (long)dr.bsdn("bsiu", bsdk(int ), (int)78);
            }
            var4_1 = dr.c;
            while (true) {
                block46: {
                    if ((v1 /* !! */  = (cfr_temp_2 = dr.eb - dr.bsdn("bsiv", bsdz(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != dr.bsdn("bsiw", bsdk(int ), (int)79)) break block46;
                    var3_2 /* !! */  = dr.b;
                    if (var3_2 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v1 /* !! */  = (long)dr.bsdn("bsix", bsdk(int ), (int)80);
            }
            cfr_temp_0 = -2147483648;
            block26: do {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v2 /* !! */  = dr.eb;
                        block27: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case -1404626235: {
                                    break block27;
                                }
                                case -197706826: {
                                    v2 /* !! */  = (long)(dr.bsdn("bsiz", bsdz(int ), (int)57) - dr.bsdn("bsiy", bsdz(int ), (int)56));
                                    continue block27;
                                }
                            }
                            break;
                        }
                        var2_3 = dr.a;
                        if (var4_1) {
                            throw null;
                        }
                        if (var2_3 || var2_3) return null;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = dr.eb - dr.bsdn("bsja", bsdz(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  != dr.bsdn("bsjb", bsdk(int ), (int)81)) {
                                v3 /* !! */  = (long)dr.bsdn("bsjc", bsdk(int ), (int)82);
                                continue;
                            }
                            ** GOTO lbl62
                            break;
                        }
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)dr.bsdn("bsjq", bsdk(int ), (int)88);
                        cfr_temp_0 = 0;
                        if (!var4_1) continue block26;
                        throw null;
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)dr.bsdn("bsjr", bsdk(int ), (int)89);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)dr.bsdn("bsjp", bsdk(int ), (int)87);
                        cfr_temp_0 = 4;
                        if (!var4_1) continue block26;
                        throw null;
                    }
                    case 3: {
                        ** GOTO lbl104
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)dr.bsdn("bsju", bsdk(int ), (int)92);
                        cfr_temp_0 = 6;
                        if (!var4_1) continue block26;
                        throw null;
                    }
                    case 7: {
                        break block45;
                    }
lbl62:
                    // 1 sources

                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_4 = dr.eb - dr.bsdn("bsjd", bsdz(int ), (int)59)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == dr.bsdn("bsje", bsdk(int ), (int)83)) break;
                        v4 /* !! */  = (long)dr.bsdn("bsjf", bsdk(int ), (int)84);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_5 = dr.eb - dr.bsdn("bsjg", bsdz(int ), (int)60)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == dr.bsdn("bsjh", bsdk(int ), (int)85)) {
                            var1_4 = new ArrayList<ds>(this.moduleStructures);
                            if (var2_3) return null;
                            break;
                        }
                        v5 /* !! */  = (long)dr.bsdn("bsji", bsdk(int ), (int)86);
                    }
                    if (var2_3) return null;
                    v6 /* !! */  = dr.eb;
                    block31: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -1626798777: {
                                v6 /* !! */  = (long)(dr.bsdn("bsjk", bsdz(int ), (int)62) - dr.bsdn("bsjj", bsdz(int ), (int)61));
                                continue block31;
                            }
                            case -1404626235: {
                                break block31;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = dr.eb;
                    if (true) ** GOTO lbl88
                    block32: while (true) {
                        v7 /* !! */  = (long)(v8 - dr.bsdn("bsjl", bsdz(int ), (int)63));
lbl88:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1404626235: {
                                break block32;
                            }
                            case -519917867: {
                                v8 = dr.bsdn("bsjm", bsdz(int ), (int)64);
                                continue block32;
                            }
                            case 418784569: {
                                v8 = dr.bsdn("bsjn", bsdz(int ), (int)65);
                                continue block32;
                            }
                            case 1889690746: {
                                v8 = dr.bsdn("bsjo", bsdz(int ), (int)66);
                                continue block32;
                            }
                        }
                        break;
                    }
                    var1_4.addAll(this.hiddenModules);
                    if (!var2_3 && !var2_3) return var1_4;
                    return null;
lbl104:
                    // 2 sources

                    while (true) {
                        var3_2 /* !! */  = (int)dr.bsdn("bsjs", bsdk(int ), (int)90);
                        cfr_temp_0 = 4;
                        if (!var4_1) continue block26;
                        throw null;
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)dr.bsdn("bsjt", bsdk(int ), (int)91);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                break;
            } while (true);
            var3_2 /* !! */  = (int)dr.bsdn("bsjv", bsdk(int ), (int)93);
            if (var4_1) {
                throw null;
            }
        }
        var3_2 /* !! */  = (int)dr.bsdn("bsjw", bsdk(int ), (int)94);
        ** while (!var4_1)
lbl122:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bska() {
        dr.bseb[0] = -5889277322676223766L;
        dr.bseb[1] = -8470238460754895605L;
        dr.bseb[2] = -1474337870807336696L;
        dr.bseb[3] = -5488886701374391679L;
        dr.bseb[4] = -4647189449392192828L;
        dr.bseb[5] = -6654029603665383300L;
        dr.bseb[6] = -3304137077121517544L;
        dr.bseb[7] = 3973856732573393645L;
        dr.bseb[8] = 7392293126619583459L;
        dr.bseb[9] = -48995811707764319L;
        dr.bseb[10] = 8411617423601314209L;
        dr.bseb[11] = -6451172588447210351L;
        dr.bseb[12] = 5078992969760433644L;
        dr.bseb[13] = 2967745416019868876L;
        dr.bseb[14] = -4601241294782527728L;
        dr.bseb[15] = 1201339851320920946L;
        dr.bseb[16] = 8682762410147505075L;
        dr.bseb[17] = -1266852851806425555L;
        dr.bseb[18] = 2561380353328353633L;
        dr.bseb[19] = 7568472887966275450L;
        dr.bseb[20] = -1156007973965960674L;
        dr.bseb[21] = 7334849748543484051L;
        dr.bseb[22] = -3053347288807806303L;
        dr.bseb[23] = -9006511048677587767L;
        dr.bseb[24] = -2429753507732048451L;
        dr.bseb[25] = 2047299352710881441L;
        dr.bseb[26] = -284391977832173950L;
        dr.bseb[27] = 1952772217702237486L;
        dr.bseb[28] = 249206430507714848L;
        dr.bseb[29] = 777630402428095833L;
        dr.bseb[30] = -190768284409665147L;
        dr.bseb[31] = -6988067985440594240L;
        dr.bseb[32] = 2193671741219049813L;
        dr.bseb[33] = 6869411593588972766L;
        dr.bseb[34] = -636414344918391493L;
        dr.bseb[35] = -988222633934530769L;
        dr.bseb[36] = 8264226797385538641L;
        dr.bseb[37] = -7860648012822307669L;
        dr.bseb[38] = 1427175110009116982L;
        dr.bseb[39] = -3677605494261263145L;
        dr.bseb[40] = -7618165460206836991L;
        dr.bseb[41] = -5798159115113291897L;
        dr.bseb[42] = -6372255223704172210L;
        dr.bseb[43] = -5684749666978205843L;
        dr.bseb[44] = -7210728882001826225L;
        dr.bseb[45] = -7430750461153488741L;
        dr.bseb[46] = -7179166292921348358L;
        dr.bseb[47] = -5212077287471412723L;
        dr.bseb[48] = 8717942257418307787L;
        dr.bseb[49] = 7933830506179262167L;
        dr.bseb[50] = -7113907555380649556L;
        dr.bseb[51] = -9133536057739658395L;
        dr.bseb[52] = 4425291632947404326L;
        dr.bseb[53] = 8808221629700851078L;
        dr.bseb[54] = -8527230003120932197L;
        dr.bseb[55] = 2813423248933659886L;
        dr.bseb[56] = 5655509757276050502L;
        dr.bseb[57] = 4661023158292003855L;
        dr.bseb[58] = -8370044958139521247L;
        dr.bseb[59] = 1906665254777070046L;
        dr.bseb[60] = -7706658622092975689L;
        dr.bseb[61] = 4092292591091321583L;
        dr.bseb[62] = 3715148578312912208L;
        dr.bseb[63] = 8653552473098626631L;
        dr.bseb[64] = 2666037372964929923L;
        dr.bseb[65] = 6280720687539249590L;
        dr.bseb[66] = 7602599861790754834L;
    }

    public static /* synthetic */ CallSite bsdn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<ds> hiddenModules() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dr.eb - dr.bsdn("bsic", bsdz(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dr.bsdn("bsid", bsdk(int ), (int)65)) break;
            v0 /* !! */  = (long)dr.bsdn("bsie", bsdk(int ), (int)66);
        }
        var3_1 = dr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dr.eb - dr.bsdn("bsif", bsdz(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dr.bsdn("bsig", bsdk(int ), (int)67)) break;
            v1 /* !! */  = (long)dr.bsdn("bsih", bsdk(int ), (int)68);
        }
        var2_2 /* !! */  = dr.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = dr.eb - dr.bsdn("bsii", bsdz(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dr.bsdn("bsij", bsdk(int ), (int)69)) break;
                    v2 /* !! */  = (long)dr.bsdn("bsik", bsdk(int ), (int)70);
                }
                var1_3 = dr.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = dr.eb - dr.bsdn("bsil", bsdz(int ), (int)53)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dr.bsdn("bsim", bsdk(int ), (int)71)) break;
                    v3 /* !! */  = (long)dr.bsdn("bsin", bsdk(int ), (int)72);
                }
                return this.hiddenModules;
            }
lbl37:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dr.bsdn("bsio", bsdk(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl46
            }
            case 1: {
                var2_2 /* !! */  = (int)dr.bsdn("bsip", bsdk(int ), (int)74);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
lbl46:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dr.bsdn("bsiq", bsdk(int ), (int)75);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dr.bsdn("bsir", bsdk(int ), (int)76);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bsdz(int n2) {
        return bsea[n2] ^ bseb[n2];
    }

    static {
        bsdm = new int[95];
        dr.bsjx();
        dr.bsjy();
        bsea = new long[67];
        bseb = new long[67];
        dr.bsjz();
        dr.bska();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dp builder() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dr.eb - dr.bsdn("bsec", bsdz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dr.bsdn("bsed", bsdk(int ), (int)11)) break;
            v0 /* !! */  = (long)dr.bsdn("bsee", bsdk(int ), (int)12);
        }
        var3_1 = dr.c;
        v1 /* !! */  = dr.eb;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - dr.bsdn("bsef", bsdz(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1404626235: {
                    break block26;
                }
                case 1151055256: {
                    v2 = dr.bsdn("bseg", bsdz(int ), (int)2);
                    continue block26;
                }
                case 1525582376: {
                    v2 = dr.bsdn("bseh", bsdz(int ), (int)3);
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = dr.b;
        v3 /* !! */  = dr.eb;
        if (true) ** GOTO lbl26
        block27: while (true) {
            v3 /* !! */  = (long)(dr.bsdn("bsej", bsdz(int ), (int)5) - dr.bsdn("bsei", bsdz(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1542928665: {
                    continue block27;
                }
                case -1404626235: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = dr.a;
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
                v4 /* !! */  = dr.eb;
                if (true) ** GOTO lbl44
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - dr.bsdn("bsek", bsdz(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1404626235: {
                            break block29;
                        }
                        case -1066471982: {
                            v5 = dr.bsdn("bsel", bsdz(int ), (int)7);
                            continue block29;
                        }
                        case -992497879: {
                            v5 = dr.bsdn("bsem", bsdz(int ), (int)8);
                            continue block29;
                        }
                        case 553056559: {
                            v5 = dr.bsdn("bsen", bsdz(int ), (int)9);
                            continue block29;
                        }
                    }
                    break;
                }
                v6 /* !! */  = dr.eb;
                if (true) ** GOTO lbl60
                block30: while (true) {
                    v6 /* !! */  = (long)(dr.bsdn("bsep", bsdz(int ), (int)11) - dr.bsdn("bseo", bsdz(int ), (int)10));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1404626235: {
                            break block30;
                        }
                        case -139277922: {
                            continue block30;
                        }
                    }
                    break;
                }
                return new dp(this);
            }
            case 0: {
                var2_2 /* !! */  = (int)dr.bsdn("bseq", bsdk(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)dr.bsdn("bser", bsdk(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dr.bsdn("bses", bsdk(int ), (int)15);
                    if (!var3_1) ** GOTO lbl70
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dr.bsdn("bset", bsdk(int ), (int)16);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void registerModule(ds var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dr.eb - dr.bsdn("bseu", bsdz(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dr.bsdn("bsev", bsdk(int ), (int)17)) break;
            v0 /* !! */  = (long)dr.bsdn("bsew", bsdk(int ), (int)18);
        }
        var6_3 = dr.c;
        v1 /* !! */  = dr.eb;
        if (true) ** GOTO lbl11
        block59: while (true) {
            v1 /* !! */  = (long)(v2 - dr.bsdn("bsex", bsdz(int ), (int)13));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1719718628: {
                    v2 = dr.bsdn("bsey", bsdz(int ), (int)14);
                    continue block59;
                }
                case -1404626235: {
                    break block59;
                }
                case 169610639: {
                    v2 = dr.bsdn("bsez", bsdz(int ), (int)15);
                    continue block59;
                }
                case 2115195680: {
                    v2 = dr.bsdn("bsfa", bsdz(int ), (int)16);
                    continue block59;
                }
            }
            break;
        }
        var5_4 /* !! */  = dr.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dr.eb - dr.bsdn("bsfb", bsdz(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dr.bsdn("bsfc", bsdk(int ), (int)19)) break;
                    v3 /* !! */  = (long)dr.bsdn("bsfd", bsdk(int ), (int)20);
                }
                var4_5 = dr.a;
                if (var6_3) {
                    throw null;
lbl35:
                    // 11 sources

                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dr.eb - dr.bsdn("bsfe", bsdz(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dr.bsdn("bsff", bsdk(int ), (int)21)) break;
                    v4 /* !! */  = (long)dr.bsdn("bsfg", bsdk(int ), (int)22);
                }
                var3_6 = var1_1.getClass();
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = dr.eb - dr.bsdn("bsfh", bsdz(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dr.bsdn("bsfi", bsdk(int ), (int)23)) break;
                    v5 /* !! */  = (long)dr.bsdn("bsfj", bsdk(int ), (int)24);
                }
                v6 /* !! */  = dr.eb;
                if (true) ** GOTO lbl54
                block64: while (true) {
                    v6 /* !! */  = (long)(dr.bsdn("bsfl", bsdz(int ), (int)21) - dr.bsdn("bsfk", bsdz(int ), (int)20));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1404626235: {
                            break block64;
                        }
                        case 428560833: {
                            continue block64;
                        }
                    }
                    break;
                }
                if (!this.registeredClasses.contains(var3_6)) ** GOTO lbl90
                if (var4_5 || var4_5) ** GOTO lbl35
                v7 /* !! */  = dr.eb;
                if (true) ** GOTO lbl65
                block65: while (true) {
                    v7 /* !! */  = (long)(v8 - dr.bsdn("bsfm", bsdz(int ), (int)22));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2097836989: {
                            v8 = dr.bsdn("bsfn", bsdz(int ), (int)23);
                            continue block65;
                        }
                        case -2084237389: {
                            v8 = dr.bsdn("bsfo", bsdz(int ), (int)24);
                            continue block65;
                        }
                        case -1404626235: {
                            break block65;
                        }
                    }
                    break;
                }
                v9 /* !! */  = dr.eb;
                if (true) ** GOTO lbl78
                block66: while (true) {
                    v9 /* !! */  = (long)(dr.bsdn("bsfq", bsdz(int ), (int)26) - dr.bsdn("bsfp", bsdz(int ), (int)25));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1404626235: {
                            break block66;
                        }
                        case 888924410: {
                            continue block66;
                        }
                    }
                    break;
                }
                v10 = var3_6.getSimpleName();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = dr.eb - dr.bsdn("bsfr", bsdz(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == dr.bsdn("bsfs", bsdk(int ), (int)25)) break;
                    v11 /* !! */  = (long)dr.bsdn("bsft", bsdk(int ), (int)26);
                }
                throw new do(v10);
lbl90:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = dr.eb - dr.bsdn("bsfu", bsdz(int ), (int)28)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dr.bsdn("bsfv", bsdk(int ), (int)27)) break;
                    v12 /* !! */  = (long)dr.bsdn("bsfw", bsdk(int ), (int)28);
                }
                v13 /* !! */  = dr.eb;
                if (true) ** GOTO lbl100
                block69: while (true) {
                    v13 /* !! */  = (long)(dr.bsdn("bsfy", bsdz(int ), (int)30) - dr.bsdn("bsfx", bsdz(int ), (int)29));
lbl100:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1844645974: {
                            continue block69;
                        }
                        case -1404626235: {
                            break block69;
                        }
                    }
                    break;
                }
                this.registeredClasses.add(var3_6);
                if (var4_5 || var4_5) ** GOTO lbl35
                if (!var2_2) ** GOTO lbl138
                if (var4_5 || var4_5) ** GOTO lbl35
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = dr.eb - dr.bsdn("bsfz", bsdz(int ), (int)31)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == dr.bsdn("bsga", bsdk(int ), (int)29)) break;
                    v14 /* !! */  = (long)dr.bsdn("bsgb", bsdk(int ), (int)30);
                }
                v15 /* !! */  = dr.eb;
                if (true) ** GOTO lbl119
                block71: while (true) {
                    v15 /* !! */  = (long)(dr.bsdn("bsgd", bsdz(int ), (int)33) - dr.bsdn("bsgc", bsdz(int ), (int)32));
lbl119:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1606973306: {
                            continue block71;
                        }
                        case -1404626235: {
                            break block71;
                        }
                    }
                    break;
                }
                this.hiddenModules.add(var1_1);
                if (var4_5 || var4_5) ** GOTO lbl35
                v16 = dr.bsdn("bsge", bsdk(int ), (int)31);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = dr.eb - dr.bsdn("bsgf", bsdz(int ), (int)34)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == dr.bsdn("bsgg", bsdk(int ), (int)32)) break;
                    v17 /* !! */  = (long)dr.bsdn("bsgh", bsdk(int ), (int)33);
                }
                var1_1.setState((boolean)v16);
                if (var4_5) ** GOTO lbl35
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl162
lbl138:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl35
                v18 /* !! */  = dr.eb;
                if (true) ** GOTO lbl143
                block73: while (true) {
                    v18 /* !! */  = (long)(v19 - dr.bsdn("bsgi", bsdz(int ), (int)35));
lbl143:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1404626235: {
                            break block73;
                        }
                        case -823174727: {
                            v19 = dr.bsdn("bsgj", bsdz(int ), (int)36);
                            continue block73;
                        }
                        case -753125708: {
                            v19 = dr.bsdn("bsgk", bsdz(int ), (int)37);
                            continue block73;
                        }
                        case 1385479878: {
                            v19 = dr.bsdn("bsgl", bsdz(int ), (int)38);
                            continue block73;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_8 = dr.eb - dr.bsdn("bsgm", bsdz(int ), (int)39)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == dr.bsdn("bsgn", bsdk(int ), (int)34)) break;
                    v20 /* !! */  = (long)dr.bsdn("bsgo", bsdk(int ), (int)35);
                }
                this.moduleStructures.add(var1_1);
                if (var4_5) ** GOTO lbl35
lbl162:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl165:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgp", bsdk(int ), (int)36);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgq", bsdk(int ), (int)37);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 2: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgr", bsdk(int ), (int)38);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)dr.bsdn("bsgs", bsdk(int ), (int)39);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl195
                    break;
                }
            }
            case 4: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgt", bsdk(int ), (int)40);
                if (!var6_3) break;
                throw null;
            }
lbl190:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgu", bsdk(int ), (int)41);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl195:
            // 5 sources

            case 6: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgv", bsdk(int ), (int)42);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl200:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgw", bsdk(int ), (int)43);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 8: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgx", bsdk(int ), (int)44);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl210:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgy", bsdk(int ), (int)45);
                if (!var6_3) ** GOTO lbl200
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)dr.bsdn("bsgz", bsdk(int ), (int)46);
                if (var6_3) {
                    throw null;
                }
            }
            case 11: {
                var5_4 /* !! */  = (int)dr.bsdn("bsha", bsdk(int ), (int)47);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl223:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)dr.bsdn("bshb", bsdk(int ), (int)48);
                if (!var6_3) ** GOTO lbl195
                throw null;
            }
lbl227:
            // 3 sources

            case 13: {
                var5_4 /* !! */  = (int)dr.bsdn("bshc", bsdk(int ), (int)49);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl232:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)dr.bsdn("bshd", bsdk(int ), (int)50);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl237:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)dr.bsdn("bshe", bsdk(int ), (int)51);
                if (!var6_3) ** GOTO lbl227
                throw null;
            }
lbl241:
            // 3 sources

            case 16: {
                var5_4 /* !! */  = (int)dr.bsdn("bshf", bsdk(int ), (int)52);
                if (!var6_3) ** GOTO lbl165
                throw null;
            }
            case 17: {
                var5_4 /* !! */  = (int)dr.bsdn("bshg", bsdk(int ), (int)53);
                if (!var6_3) ** GOTO lbl241
                throw null;
            }
            case 18: {
                do {
                    var5_4 /* !! */  = (int)dr.bsdn("bshh", bsdk(int ), (int)54);
                } while (!var6_3);
                throw null;
            }
lbl254:
            // 2 sources

            case 19: {
                var5_4 /* !! */  = (int)dr.bsdn("bshi", bsdk(int ), (int)55);
                if (!var6_3) ** GOTO lbl195
                throw null;
            }
lbl258:
            // 3 sources

            case 20: {
                var5_4 /* !! */  = (int)dr.bsdn("bshj", bsdk(int ), (int)56);
                if (!var6_3) ** GOTO lbl165
                throw null;
            }
            case 21: {
                var5_4 /* !! */  = (int)dr.bsdn("bshk", bsdk(int ), (int)57);
                if (!var6_3) ** GOTO lbl223
                throw null;
            }
            case 22: 
        }
        var5_4 /* !! */  = (int)dr.bsdn("bshl", bsdk(int ), (int)58);
        ** while (!var6_3)
lbl269:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bsjx() {
        dr.bsdl[0] = -1652211022;
        dr.bsdl[1] = -1181192828;
        dr.bsdl[2] = -1191276224;
        dr.bsdl[3] = -1412539607;
        dr.bsdl[4] = 952803861;
        dr.bsdl[5] = 354133322;
        dr.bsdl[6] = 1262643492;
        dr.bsdl[7] = -860430333;
        dr.bsdl[8] = 63776225;
        dr.bsdl[9] = 2136863695;
        dr.bsdl[10] = 1560385508;
        dr.bsdl[11] = -1755794066;
        dr.bsdl[12] = 1817995338;
        dr.bsdl[13] = -1318102629;
        dr.bsdl[14] = -1229861918;
        dr.bsdl[15] = -485094487;
        dr.bsdl[16] = 1988467062;
        dr.bsdl[17] = -1400788572;
        dr.bsdl[18] = 1918955524;
        dr.bsdl[19] = 1613773076;
        dr.bsdl[20] = 820910915;
        dr.bsdl[21] = 1288967581;
        dr.bsdl[22] = 802918262;
        dr.bsdl[23] = -1913625922;
        dr.bsdl[24] = 93900595;
        dr.bsdl[25] = -2004496063;
        dr.bsdl[26] = 45487765;
        dr.bsdl[27] = 1595977682;
        dr.bsdl[28] = 1344667059;
        dr.bsdl[29] = 2119902258;
        dr.bsdl[30] = -2034056728;
        dr.bsdl[31] = 1095417088;
        dr.bsdl[32] = 966489579;
        dr.bsdl[33] = 1426135779;
        dr.bsdl[34] = 1543681923;
        dr.bsdl[35] = -1276295233;
        dr.bsdl[36] = 1557679932;
        dr.bsdl[37] = 1451288955;
        dr.bsdl[38] = 1106637630;
        dr.bsdl[39] = 1353756127;
        dr.bsdl[40] = -1433210565;
        dr.bsdl[41] = 1512373186;
        dr.bsdl[42] = 468582831;
        dr.bsdl[43] = 735729254;
        dr.bsdl[44] = -499613632;
        dr.bsdl[45] = 319086132;
        dr.bsdl[46] = 1669352512;
        dr.bsdl[47] = 993100608;
        dr.bsdl[48] = 1542208998;
        dr.bsdl[49] = 813063424;
        dr.bsdl[50] = 260718619;
        dr.bsdl[51] = -22653475;
        dr.bsdl[52] = 1227170526;
        dr.bsdl[53] = -1633608433;
        dr.bsdl[54] = 1969087194;
        dr.bsdl[55] = -1522270107;
        dr.bsdl[56] = -1176618426;
        dr.bsdl[57] = -221474465;
        dr.bsdl[58] = -1263850669;
        dr.bsdl[59] = 248488658;
        dr.bsdl[60] = -233582859;
        dr.bsdl[61] = -1391609517;
        dr.bsdl[62] = -774502967;
        dr.bsdl[63] = 865252456;
        dr.bsdl[64] = -1078674978;
        dr.bsdl[65] = -868832316;
        dr.bsdl[66] = 786825830;
        dr.bsdl[67] = -116061277;
        dr.bsdl[68] = 1373702670;
        dr.bsdl[69] = 954658869;
        dr.bsdl[70] = 981762765;
        dr.bsdl[71] = 1368681777;
        dr.bsdl[72] = -911935391;
        dr.bsdl[73] = -305446068;
        dr.bsdl[74] = 1564815612;
        dr.bsdl[75] = -425684393;
        dr.bsdl[76] = -1089972634;
        dr.bsdl[77] = 363399665;
        dr.bsdl[78] = -1569924791;
        dr.bsdl[79] = 828826567;
        dr.bsdl[80] = 1401393752;
        dr.bsdl[81] = 1426745382;
        dr.bsdl[82] = 1604337381;
        dr.bsdl[83] = 813941404;
        dr.bsdl[84] = 1863237072;
        dr.bsdl[85] = -378425803;
        dr.bsdl[86] = 1211919174;
        dr.bsdl[87] = -405804754;
        dr.bsdl[88] = 528509022;
        dr.bsdl[89] = 1768046276;
        dr.bsdl[90] = 2064195936;
        dr.bsdl[91] = 1113731925;
        dr.bsdl[92] = -112179806;
        dr.bsdl[93] = 1701290802;
        dr.bsdl[94] = 1139110868;
    }

    private static /* synthetic */ void bsjz() {
        dr.bsea[0] = -4430094331955013671L;
        dr.bsea[1] = -6774530702212252547L;
        dr.bsea[2] = 8773564227197772613L;
        dr.bsea[3] = 403200050374204471L;
        dr.bsea[4] = -20026162545777191L;
        dr.bsea[5] = -6267468647211993727L;
        dr.bsea[6] = -6879857717416382995L;
        dr.bsea[7] = -7581383790904783466L;
        dr.bsea[8] = -2322861717701851536L;
        dr.bsea[9] = 5358207903081400318L;
        dr.bsea[10] = 6465219164745015062L;
        dr.bsea[11] = 2536314462128038380L;
        dr.bsea[12] = -6590729740261907959L;
        dr.bsea[13] = -6998948528225127860L;
        dr.bsea[14] = 4229642311365702953L;
        dr.bsea[15] = -6967392398756005130L;
        dr.bsea[16] = -2602999206675379249L;
        dr.bsea[17] = -1602072974954644041L;
        dr.bsea[18] = -4463595218816473148L;
        dr.bsea[19] = 7418582962015357816L;
        dr.bsea[20] = -7583146966544985614L;
        dr.bsea[21] = 8887124636408359259L;
        dr.bsea[22] = 7746113195459290698L;
        dr.bsea[23] = 4231236657103297649L;
        dr.bsea[24] = 2305329659051807088L;
        dr.bsea[25] = 974770835897373555L;
        dr.bsea[26] = 17351436524697801L;
        dr.bsea[27] = 6727156023150104052L;
        dr.bsea[28] = 1744290075723339690L;
        dr.bsea[29] = 2556831043670636719L;
        dr.bsea[30] = 1654143197326541564L;
        dr.bsea[31] = -2262822693534974972L;
        dr.bsea[32] = -3627731274947987535L;
        dr.bsea[33] = -4658740516368486970L;
        dr.bsea[34] = -3621059533339324936L;
        dr.bsea[35] = -5129109805959415606L;
        dr.bsea[36] = 1252826130046435892L;
        dr.bsea[37] = -5051267071279529922L;
        dr.bsea[38] = 6676631825441954146L;
        dr.bsea[39] = -1564334681069494133L;
        dr.bsea[40] = -776470691488183144L;
        dr.bsea[41] = 1686506262687231439L;
        dr.bsea[42] = -214146243581673064L;
        dr.bsea[43] = -2115612502176725096L;
        dr.bsea[44] = -5668178546760883969L;
        dr.bsea[45] = -3291490981037087485L;
        dr.bsea[46] = -1676350630798259463L;
        dr.bsea[47] = -1524075016145099209L;
        dr.bsea[48] = -3144269269348205008L;
        dr.bsea[49] = 6394326339116653673L;
        dr.bsea[50] = 1127519289464094795L;
        dr.bsea[51] = 8418292979920510649L;
        dr.bsea[52] = 7085080998816232217L;
        dr.bsea[53] = 8205706949246468030L;
        dr.bsea[54] = 1809050058189659323L;
        dr.bsea[55] = -1155707375177269387L;
        dr.bsea[56] = 6854224105232404438L;
        dr.bsea[57] = 5331479800457872392L;
        dr.bsea[58] = -984868804268647600L;
        dr.bsea[59] = -3919889132373303640L;
        dr.bsea[60] = 6526748740087714635L;
        dr.bsea[61] = -7989725931043509012L;
        dr.bsea[62] = -8737696574679075222L;
        dr.bsea[63] = 840354384393817959L;
        dr.bsea[64] = 2104045713823874681L;
        dr.bsea[65] = -2808612235382070198L;
        dr.bsea[66] = 8469859338398354365L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setup() {
        var3_1 = dr.c;
        var2_2 /* !! */  = dr.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var1_3 = dr.a;
                if (var3_1) {
                    throw null;
lbl9:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl9
                this.builder().add(new gk()).add(new gj()).add(new eb()).add(new fl()).add(new hn()).add(new hq()).add(new hk()).add(new hr()).add(new ha()).add(new gz()).add(new he()).add(new hd()).add(new ek()).add(new eh()).add(new et()).add(new eu()).add(new fh()).add(new fd()).add(new fp()).add(new ff()).add(new fk()).add(new ew()).add(new ey()).add(new fi()).add(new gy()).add(new gq()).add(new fc()).add(new fb()).add(new fo()).add(new gt()).add(new jk()).add(new jl()).add(new iv()).add(new je()).add(new jg()).add(new jc()).add(new jm()).add(new iz()).add(new iy()).add(new jb()).add(new jq()).add(new ji()).add(new js()).add(new jj()).add(new ix()).add(new jr()).add(new jp()).add(new iw()).add(new jo()).add(new fs()).add(new ju()).add(new jn()).add(new jd()).add(new jh()).add(new gd()).add(new fv()).add(new fr()).add(new ft()).add(new ge()).add(new gf()).add(new gh()).add(new gi()).add(new fu()).add(new gc()).add(new gg()).add(new fy()).add(new gb()).add(new ga()).add(new fw()).add(new fx()).add(new hl()).add(new ep()).add(new ez()).add(new gr()).add(new fz()).add(new gv()).add(new gu()).add(new gn()).add(new gm()).add(new hg()).add(new hj()).add(new ho()).add(new fm()).add(new eq()).add(new eo()).add(new fa()).add(new fg()).add(new fe()).add(new en()).add(new hs()).add(new ej()).add(new gs()).add(new gp()).add(new ei()).add(new hm()).add(new er()).add(new hf()).add(new hb()).add(new hp()).add(new ht()).add(new hc()).add(new go()).add(new iu()).add(new jf()).add(new ja()).add(new hi()).add(new ev()).add(new hh());
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)dr.bsdn("bsdt", bsdk(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl35
            }
lbl21:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)dr.bsdn("bsdu", bsdk(int ), (int)6);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dr.bsdn("bsdv", bsdk(int ), (int)7);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dr.bsdn("bsdw", bsdk(int ), (int)8);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl35:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)dr.bsdn("bsdx", bsdk(int ), (int)9);
                if (!var3_1) ** GOTO lbl21
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)dr.bsdn("bsdy", bsdk(int ), (int)10);
        ** while (!var3_1)
lbl42:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<ds> modules() {
        v0 /* !! */  = dr.eb;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - dr.bsdn("bshm", bsdz(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1404626235: {
                    break block21;
                }
                case -1375249034: {
                    v1 = dr.bsdn("bshn", bsdz(int ), (int)41);
                    continue block21;
                }
                case 864691644: {
                    v1 = dr.bsdn("bsho", bsdz(int ), (int)42);
                    continue block21;
                }
                case 2120513025: {
                    v1 = dr.bsdn("bshp", bsdz(int ), (int)43);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = dr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dr.eb - dr.bsdn("bshq", bsdz(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dr.bsdn("bshr", bsdk(int ), (int)59)) break;
            v2 /* !! */  = (long)dr.bsdn("bshs", bsdk(int ), (int)60);
        }
        var2_2 /* !! */  = dr.b;
        v3 /* !! */  = dr.eb;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(dr.bsdn("bshu", bsdz(int ), (int)46) - dr.bsdn("bsht", bsdz(int ), (int)45));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1404626235: {
                    break block23;
                }
                case 1529310674: {
                    continue block23;
                }
            }
            break;
        }
        var1_3 = dr.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block24;
                v4 /* !! */  = dr.eb;
                if (true) ** GOTO lbl46
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - dr.bsdn("bshv", bsdz(int ), (int)47));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1404626235: {
                            break block25;
                        }
                        case 267123455: {
                            v5 = dr.bsdn("bshw", bsdz(int ), (int)48);
                            continue block25;
                        }
                        case 1960542082: {
                            v5 = dr.bsdn("bshx", bsdz(int ), (int)49);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.moduleStructures;
lbl56:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)dr.bsdn("bshy", bsdk(int ), (int)61);
                    if (!var3_1) break block24;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)dr.bsdn("bshz", bsdk(int ), (int)62);
                    if (!var3_1) ** GOTO lbl56
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)dr.bsdn("bsia", bsdk(int ), (int)63);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dr.bsdn("bsib", bsdk(int ), (int)64);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dr() {
        var2_1 /* !! */  = dr.b;
        super();
        this.moduleStructures = new ArrayList<ds>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.hiddenModules = new ArrayList<ds>();
                this.registeredClasses = new HashSet<Class<? extends ds>>();
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)dr.bsdn("bsdo", bsdk(int ), (int)0);
            }
            case 1: {
                var2_1 /* !! */  = (int)dr.bsdn("bsdp", bsdk(int ), (int)1);
                ** GOTO lbl10
            }
            case 2: {
                var2_1 /* !! */  = (int)dr.bsdn("bsdq", bsdk(int ), (int)2);
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)dr.bsdn("bsdr", bsdk(int ), (int)3);
                }
            }
            case 4: 
        }
        while (true) {
            var2_1 /* !! */  = (int)dr.bsdn("bsds", bsdk(int ), (int)4);
        }
    }

    private static /* synthetic */ void bsjy() {
        dr.bsdm[0] = -1652211024;
        dr.bsdm[1] = -1181192832;
        dr.bsdm[2] = -1191276223;
        dr.bsdm[3] = -1412539608;
        dr.bsdm[4] = 952803863;
        dr.bsdm[5] = 354133323;
        dr.bsdm[6] = 1262643495;
        dr.bsdm[7] = -860430329;
        dr.bsdm[8] = 63776227;
        dr.bsdm[9] = 2136863695;
        dr.bsdm[10] = 1560385504;
        dr.bsdm[11] = 1755794065;
        dr.bsdm[12] = 768905577;
        dr.bsdm[13] = -1318102632;
        dr.bsdm[14] = -1229861920;
        dr.bsdm[15] = -485094487;
        dr.bsdm[16] = 1988467063;
        dr.bsdm[17] = -1400788571;
        dr.bsdm[18] = 1231402660;
        dr.bsdm[19] = 1613773077;
        dr.bsdm[20] = -832958958;
        dr.bsdm[21] = 1288967580;
        dr.bsdm[22] = -1690296292;
        dr.bsdm[23] = -1913625921;
        dr.bsdm[24] = 2087691574;
        dr.bsdm[25] = 2004496062;
        dr.bsdm[26] = -1040792437;
        dr.bsdm[27] = 1595977683;
        dr.bsdm[28] = -1579751054;
        dr.bsdm[29] = -2119902259;
        dr.bsdm[30] = 1255545785;
        dr.bsdm[31] = 1095417089;
        dr.bsdm[32] = -966489580;
        dr.bsdm[33] = -739033514;
        dr.bsdm[34] = -1543681924;
        dr.bsdm[35] = -73180106;
        dr.bsdm[36] = 1557679922;
        dr.bsdm[37] = 1451288945;
        dr.bsdm[38] = 1106637628;
        dr.bsdm[39] = 1353756109;
        dr.bsdm[40] = -1433210566;
        dr.bsdm[41] = 1512373199;
        dr.bsdm[42] = 468582826;
        dr.bsdm[43] = 735729259;
        dr.bsdm[44] = -499613629;
        dr.bsdm[45] = 319086116;
        dr.bsdm[46] = 1669352518;
        dr.bsdm[47] = 993100630;
        dr.bsdm[48] = 1542209000;
        dr.bsdm[49] = 813063425;
        dr.bsdm[50] = 260718602;
        dr.bsdm[51] = -22653490;
        dr.bsdm[52] = 1227170512;
        dr.bsdm[53] = -1633608417;
        dr.bsdm[54] = 1969087199;
        dr.bsdm[55] = -1522270095;
        dr.bsdm[56] = -1176618428;
        dr.bsdm[57] = -221474469;
        dr.bsdm[58] = -1263850670;
        dr.bsdm[59] = -248488659;
        dr.bsdm[60] = -1902215629;
        dr.bsdm[61] = -1391609520;
        dr.bsdm[62] = -774502966;
        dr.bsdm[63] = 865252458;
        dr.bsdm[64] = -1078674980;
        dr.bsdm[65] = -868832315;
        dr.bsdm[66] = 1274098237;
        dr.bsdm[67] = -116061278;
        dr.bsdm[68] = -1446316492;
        dr.bsdm[69] = -954658870;
        dr.bsdm[70] = 2013996833;
        dr.bsdm[71] = 1368681776;
        dr.bsdm[72] = 510358242;
        dr.bsdm[73] = -305446065;
        dr.bsdm[74] = 1564815614;
        dr.bsdm[75] = -425684394;
        dr.bsdm[76] = -1089972633;
        dr.bsdm[77] = 363399664;
        dr.bsdm[78] = -484674172;
        dr.bsdm[79] = 828826566;
        dr.bsdm[80] = 494476297;
        dr.bsdm[81] = -1426745383;
        dr.bsdm[82] = 546143636;
        dr.bsdm[83] = 813941405;
        dr.bsdm[84] = 1755657034;
        dr.bsdm[85] = -378425804;
        dr.bsdm[86] = -1832826709;
        dr.bsdm[87] = -405804759;
        dr.bsdm[88] = 528509016;
        dr.bsdm[89] = 1768046276;
        dr.bsdm[90] = 2064195942;
        dr.bsdm[91] = 1113731922;
        dr.bsdm[92] = -112179803;
        dr.bsdm[93] = 1701290801;
        dr.bsdm[94] = 1139110867;
    }

    private static /* synthetic */ int bsdk(int n2) {
        return bsdl[n2] ^ bsdm[n2];
    }
}

