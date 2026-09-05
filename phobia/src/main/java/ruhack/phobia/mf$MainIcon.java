/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class mf$MainIcon
extends Enum<mf$MainIcon> {
    private static long[] dra;
    private static long[] dqz;
    public static final boolean c;
    public static final /* enum */ mf$MainIcon VIEW;
    public static final int b;
    private static int[] drf;
    private static int[] dre;
    public static final /* enum */ mf$MainIcon RESET;
    public static final boolean a;
    public static final long t = -1112920337318677430L;
    public static final /* enum */ mf$MainIcon WIDGETS;
    private static final /* synthetic */ mf$MainIcon[] $VALUES;

    private static /* synthetic */ int drd(int n2) {
        return dre[n2] ^ drf[n2];
    }

    private static /* synthetic */ void dtr() {
        mf$MainIcon.dra[0] = -1344138072505207271L;
        mf$MainIcon.dra[1] = 2915710008863757175L;
        mf$MainIcon.dra[2] = 2055555014330065372L;
        mf$MainIcon.dra[3] = 5561175730285959350L;
        mf$MainIcon.dra[4] = -2358077594713002490L;
        mf$MainIcon.dra[5] = 8020606380483717718L;
        mf$MainIcon.dra[6] = 5476690533364729194L;
        mf$MainIcon.dra[7] = 89317509085519220L;
        mf$MainIcon.dra[8] = 7417490059583455851L;
        mf$MainIcon.dra[9] = 5832293842401693687L;
        mf$MainIcon.dra[10] = 4382724304315498327L;
        mf$MainIcon.dra[11] = 3473315068310925296L;
        mf$MainIcon.dra[12] = -7392326200214656873L;
        mf$MainIcon.dra[13] = 5148774456498781867L;
        mf$MainIcon.dra[14] = -8123350974616812558L;
        mf$MainIcon.dra[15] = -30688079624491187L;
        mf$MainIcon.dra[16] = -6196258361863207676L;
        mf$MainIcon.dra[17] = -3158708770923573665L;
        mf$MainIcon.dra[18] = 8084732671569750020L;
        mf$MainIcon.dra[19] = 3104911566390217613L;
        mf$MainIcon.dra[20] = -7692608335872472987L;
        mf$MainIcon.dra[21] = 6490367118093929168L;
        mf$MainIcon.dra[22] = 6253265846439141828L;
        mf$MainIcon.dra[23] = -2720173978431377062L;
        mf$MainIcon.dra[24] = -6885043705731994648L;
        mf$MainIcon.dra[25] = 8855809985228098351L;
        mf$MainIcon.dra[26] = 5256129258434299861L;
        mf$MainIcon.dra[27] = 668146969907653008L;
    }

    public static /* synthetic */ CallSite drb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long dqy(int n2) {
        return dqz[n2] ^ dra[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static mf$MainIcon valueOf(String string) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = t - mf$MainIcon.drb("drx", dqy(int ), (int)10)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mf$MainIcon.drb("dry", drd(int ), (int)8)) break;
            object = mf$MainIcon.drb("drz", drd(int ), (int)9);
        }
        boolean bl2 = c;
        Object object = t;
        block10: while (true) {
            switch ((int)object) {
                case -2033191862: {
                    break block10;
                }
                case 1626320924: {
                    object = mf$MainIcon.drb("dsb", dqy(int ), (int)12) - mf$MainIcon.drb("dsa", dqy(int ), (int)11);
                    continue block10;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = t;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - mf$MainIcon.drb("dsc", dqy(int ), (int)13);
            }
            switch ((int)object2) {
                case -2033191862: {
                    break block11;
                }
                case -99631942: {
                    callSite = mf$MainIcon.drb("dsd", dqy(int ), (int)14);
                    continue block11;
                }
                case 2113996997: {
                    callSite = mf$MainIcon.drb("dse", dqy(int ), (int)15);
                    continue block11;
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
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = t - mf$MainIcon.drb("dsf", dqy(int ), (int)16)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mf$MainIcon.drb("dsg", drd(int ), (int)10)) {
                return Enum.valueOf(mf$MainIcon.class, string);
            }
            object3 = mf$MainIcon.drb("dsh", drd(int ), (int)11);
        }
    }

    private mf$MainIcon() {
        int n3 = b;
        boolean bl2 = a;
    }

    private static /* synthetic */ void dtq() {
        mf$MainIcon.dqz[0] = -967141648298296831L;
        mf$MainIcon.dqz[1] = -8240968638381988638L;
        mf$MainIcon.dqz[2] = -4044545811822299242L;
        mf$MainIcon.dqz[3] = 8403391042583961986L;
        mf$MainIcon.dqz[4] = -6001482107285383371L;
        mf$MainIcon.dqz[5] = 4025102590402378557L;
        mf$MainIcon.dqz[6] = -398035440391306173L;
        mf$MainIcon.dqz[7] = 6193345398963083944L;
        mf$MainIcon.dqz[8] = 3086199409209042428L;
        mf$MainIcon.dqz[9] = 7888009179336630231L;
        mf$MainIcon.dqz[10] = 5359811575334801864L;
        mf$MainIcon.dqz[11] = -6221838673981295114L;
        mf$MainIcon.dqz[12] = -6737785802654892278L;
        mf$MainIcon.dqz[13] = -6850311420426560069L;
        mf$MainIcon.dqz[14] = 5016493561524084614L;
        mf$MainIcon.dqz[15] = -6990727254399572586L;
        mf$MainIcon.dqz[16] = 3932661907728097764L;
        mf$MainIcon.dqz[17] = 4451857473934609895L;
        mf$MainIcon.dqz[18] = 5072354346459628345L;
        mf$MainIcon.dqz[19] = 9074313909832371321L;
        mf$MainIcon.dqz[20] = -2138075547695010324L;
        mf$MainIcon.dqz[21] = -1691835517914790053L;
        mf$MainIcon.dqz[22] = 6945389713964557795L;
        mf$MainIcon.dqz[23] = 8232568283802328146L;
        mf$MainIcon.dqz[24] = -3479923978659043111L;
        mf$MainIcon.dqz[25] = -905564122780561172L;
        mf$MainIcon.dqz[26] = -4139103372957925495L;
        mf$MainIcon.dqz[27] = -996070111303819788L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mf$MainIcon[] $values() {
        v0 /* !! */  = mf$MainIcon.t;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(mf$MainIcon.drb("dsq", dqy(int ), (int)18) - mf$MainIcon.drb("dsp", dqy(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2033191862: {
                    break block20;
                }
                case -1893221877: {
                    continue block20;
                }
            }
            break;
        }
        var2 = mf$MainIcon.c;
        v1 /* !! */  = mf$MainIcon.t;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - mf$MainIcon.drb("dsr", dqy(int ), (int)19));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2033191862: {
                    break block21;
                }
                case -414782113: {
                    v2 = mf$MainIcon.drb("dss", dqy(int ), (int)20);
                    continue block21;
                }
                case 143298297: {
                    v2 = mf$MainIcon.drb("dst", dqy(int ), (int)21);
                    continue block21;
                }
                case 1093187079: {
                    v2 = mf$MainIcon.drb("dsu", dqy(int ), (int)22);
                    continue block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = mf$MainIcon.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = mf$MainIcon.t - mf$MainIcon.drb("dsv", dqy(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mf$MainIcon.drb("dsw", drd(int ), (int)19)) break;
            v3 /* !! */  = (long)mf$MainIcon.drb("dsx", drd(int ), (int)20);
        }
        var0_2 = mf$MainIcon.a;
        if (var2) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl40:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = new mf$MainIcon[3];
                v5 = mf$MainIcon.drb("dsy", drd(int ), (int)21);
                v6 /* !! */  = mf$MainIcon.t;
                if (true) ** GOTO lbl49
                block24: while (true) {
                    v6 /* !! */  = (long)(mf$MainIcon.drb("dta", dqy(int ), (int)25) - mf$MainIcon.drb("dsz", dqy(int ), (int)24));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2033191862: {
                            break block24;
                        }
                        case 106252480: {
                            continue block24;
                        }
                    }
                    break;
                }
                v4[v5] = mf$MainIcon.WIDGETS;
                v7 = mf$MainIcon.drb("dtb", drd(int ), (int)22);
                while (true) {
                    if ((v8 = (cfr_temp_1 = mf$MainIcon.t - mf$MainIcon.drb("dtc", dqy(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == mf$MainIcon.drb("dtd", drd(int ), (int)23)) break;
                    v8 = 1782450560;
                }
                v4[v7] = mf$MainIcon.VIEW;
                v9 = mf$MainIcon.drb("dte", drd(int ), (int)24);
                while (true) {
                    if ((v10 = (cfr_temp_2 = mf$MainIcon.t - mf$MainIcon.drb("dtf", dqy(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 == mf$MainIcon.drb("dtg", drd(int ), (int)25)) break;
                    v10 = -202936406;
                }
                v4[v9] = mf$MainIcon.RESET;
                return v4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mf$MainIcon.drb("dth", drd(int ), (int)26);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)mf$MainIcon.drb("dti", drd(int ), (int)27);
                if (!var2) break;
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)mf$MainIcon.drb("dtj", drd(int ), (int)28);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mf$MainIcon.drb("dtk", drd(int ), (int)29);
        ** while (!var2)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mf$MainIcon[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mf$MainIcon.t - mf$MainIcon.drb("drc", dqy(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mf$MainIcon.drb("drg", drd(int ), (int)0)) break;
            v0 /* !! */  = (long)mf$MainIcon.drb("drh", drd(int ), (int)1);
        }
        var2 = mf$MainIcon.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mf$MainIcon.t - mf$MainIcon.drb("dri", dqy(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mf$MainIcon.drb("drj", drd(int ), (int)2)) break;
            v1 /* !! */  = (long)mf$MainIcon.drb("drk", drd(int ), (int)3);
        }
        var1_1 /* !! */  = mf$MainIcon.b;
        v2 /* !! */  = mf$MainIcon.t;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - mf$MainIcon.drb("drl", dqy(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2033191862: {
                    break block22;
                }
                case -1944171154: {
                    v3 = mf$MainIcon.drb("drm", dqy(int ), (int)3);
                    continue block22;
                }
                case -1704581053: {
                    v3 = mf$MainIcon.drb("drn", dqy(int ), (int)4);
                    continue block22;
                }
            }
            break;
        }
        var0_2 = mf$MainIcon.a;
        if (!var2) ** GOTO lbl35
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var0_2 || var0_2) continue block23;
                v4 /* !! */  = mf$MainIcon.t;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v4 /* !! */  = (long)(mf$MainIcon.drb("drp", dqy(int ), (int)6) - mf$MainIcon.drb("dro", dqy(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2033191862: {
                            break block24;
                        }
                        case -2029817538: {
                            continue block24;
                        }
                    }
                    break;
                }
                v5 /* !! */  = mf$MainIcon.t;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - mf$MainIcon.drb("drq", dqy(int ), (int)7));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2033191862: {
                            break block25;
                        }
                        case -1999692493: {
                            v6 = mf$MainIcon.drb("drr", dqy(int ), (int)8);
                            continue block25;
                        }
                        case 88167072: {
                            v6 = mf$MainIcon.drb("drs", dqy(int ), (int)9);
                            continue block25;
                        }
                    }
                    break;
                }
                return (mf$MainIcon[])mf$MainIcon.$VALUES.clone();
                case 0: {
                    var1_1 /* !! */  = (int)mf$MainIcon.drb("drt", drd(int ), (int)4);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl68
                }
lbl64:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)mf$MainIcon.drb("dru", drd(int ), (int)5);
                    if (var2) {
                        throw null;
                    }
                }
lbl68:
                // 4 sources

                case 2: {
                    var1_1 /* !! */  = (int)mf$MainIcon.drb("drv", drd(int ), (int)6);
                    if (!var2) ** GOTO lbl64
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)mf$MainIcon.drb("drw", drd(int ), (int)7);
        } while (!var2);
        throw null;
    }

    static {
        dre = new int[33];
        drf = new int[33];
        mf$MainIcon.dto();
        mf$MainIcon.dtp();
        dqz = new long[28];
        dra = new long[28];
        mf$MainIcon.dtq();
        mf$MainIcon.dtr();
        WIDGETS = new mf$MainIcon();
        VIEW = new mf$MainIcon();
        RESET = new mf$MainIcon();
        $VALUES = mf$MainIcon.$values();
    }

    private static /* synthetic */ void dto() {
        mf$MainIcon.dre[0] = 243919801;
        mf$MainIcon.dre[1] = 1267786544;
        mf$MainIcon.dre[2] = 1133754349;
        mf$MainIcon.dre[3] = 204219044;
        mf$MainIcon.dre[4] = 2051692575;
        mf$MainIcon.dre[5] = -286414901;
        mf$MainIcon.dre[6] = 1112580814;
        mf$MainIcon.dre[7] = -61561001;
        mf$MainIcon.dre[8] = 374414325;
        mf$MainIcon.dre[9] = -1511649649;
        mf$MainIcon.dre[10] = -1641570338;
        mf$MainIcon.dre[11] = 655594798;
        mf$MainIcon.dre[12] = -446285543;
        mf$MainIcon.dre[13] = 586856838;
        mf$MainIcon.dre[14] = -1075261637;
        mf$MainIcon.dre[15] = -1211958207;
        mf$MainIcon.dre[16] = 1078597062;
        mf$MainIcon.dre[17] = 1744547965;
        mf$MainIcon.dre[18] = -1013915725;
        mf$MainIcon.dre[19] = -2030404734;
        mf$MainIcon.dre[20] = -631266992;
        mf$MainIcon.dre[21] = 296783331;
        mf$MainIcon.dre[22] = 806415548;
        mf$MainIcon.dre[23] = 1540035751;
        mf$MainIcon.dre[24] = -901127150;
        mf$MainIcon.dre[25] = 347279150;
        mf$MainIcon.dre[26] = -1307215576;
        mf$MainIcon.dre[27] = -1137450683;
        mf$MainIcon.dre[28] = 399578060;
        mf$MainIcon.dre[29] = 53178468;
        mf$MainIcon.dre[30] = 1786938856;
        mf$MainIcon.dre[31] = -1782946948;
        mf$MainIcon.dre[32] = -415098238;
    }

    private static /* synthetic */ void dtp() {
        mf$MainIcon.drf[0] = -243919802;
        mf$MainIcon.drf[1] = 866699767;
        mf$MainIcon.drf[2] = 1133754348;
        mf$MainIcon.drf[3] = 1866844076;
        mf$MainIcon.drf[4] = 2051692574;
        mf$MainIcon.drf[5] = -286414903;
        mf$MainIcon.drf[6] = 1112580814;
        mf$MainIcon.drf[7] = -61561001;
        mf$MainIcon.drf[8] = -374414326;
        mf$MainIcon.drf[9] = -1203490705;
        mf$MainIcon.drf[10] = -1641570337;
        mf$MainIcon.drf[11] = 1036367871;
        mf$MainIcon.drf[12] = -446285543;
        mf$MainIcon.drf[13] = 586856838;
        mf$MainIcon.drf[14] = -1075261639;
        mf$MainIcon.drf[15] = -1211958208;
        mf$MainIcon.drf[16] = 1078597062;
        mf$MainIcon.drf[17] = 1744547965;
        mf$MainIcon.drf[18] = -1013915727;
        mf$MainIcon.drf[19] = -2030404733;
        mf$MainIcon.drf[20] = -1715569327;
        mf$MainIcon.drf[21] = 296783331;
        mf$MainIcon.drf[22] = 806415549;
        mf$MainIcon.drf[23] = 1540035750;
        mf$MainIcon.drf[24] = -901127152;
        mf$MainIcon.drf[25] = -347279151;
        mf$MainIcon.drf[26] = -1307215574;
        mf$MainIcon.drf[27] = -1137450683;
        mf$MainIcon.drf[28] = 399578063;
        mf$MainIcon.drf[29] = 53178469;
        mf$MainIcon.drf[30] = 1786938856;
        mf$MainIcon.drf[31] = -1782946947;
        mf$MainIcon.drf[32] = -415098240;
    }
}

