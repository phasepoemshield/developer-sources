/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2583
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2583;

final class fo$Segment
extends Record {
    private static long[] dtnj;
    public static final boolean a;
    private final int start;
    private static int[] dtnb;
    private static int[] dtna;
    static final long jc = -4989708331413594271L;
    private final String value;
    private final int end;
    public static final boolean c;
    public static final int b;
    private final class_2583 style;
    private static long[] dtnk;

    /*
     * Enabled aggressive block sorting
     */
    public String value() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = jc - fo$Segment.dtnc("dtqy", dtni(int ), (int)41)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == fo$Segment.dtnc("dtqz", dtmz(int ), (int)48)) break;
            object = fo$Segment.dtnc("dtra", dtmz(int ), (int)49);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = jc - fo$Segment.dtnc("dtrb", dtni(int ), (int)42)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == fo$Segment.dtnc("dtrc", dtmz(int ), (int)50)) break;
            object = fo$Segment.dtnc("dtrd", dtmz(int ), (int)51);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = jc - fo$Segment.dtnc("dtre", dtni(int ), (int)43)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == fo$Segment.dtnc("dtrf", dtmz(int ), (int)52)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = fo$Segment.dtnc("dtrg", dtmz(int ), (int)53);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = jc - fo$Segment.dtnc("dtri", dtni(int ), (int)44)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == fo$Segment.dtnc("dtrj", dtmz(int ), (int)54)) {
                return this.value;
            }
            object = fo$Segment.dtnc("dtrk", dtmz(int ), (int)55);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int start() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtpo", dtni(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Segment.dtnc("dtpp", dtmz(int ), (int)26)) break;
            v0 /* !! */  = (long)fo$Segment.dtnc("dtpq", dtmz(int ), (int)27);
        }
        var3_1 = fo$Segment.c;
        v1 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - fo$Segment.dtnc("dtpr", dtni(int ), (int)31));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1924587679: {
                    break block16;
                }
                case -1543920870: {
                    v2 = fo$Segment.dtnc("dtps", dtni(int ), (int)32);
                    continue block16;
                }
                case 342260558: {
                    v2 = fo$Segment.dtnc("dtpt", dtni(int ), (int)33);
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = fo$Segment.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fo$Segment.jc - fo$Segment.dtnc("dtpu", dtni(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fo$Segment.dtnc("dtpw", dtmz(int ), (int)28)) break;
            v3 /* !! */  = (long)fo$Segment.dtnc("dtpx", dtmz(int ), (int)29);
        }
        var1_3 = fo$Segment.a;
        if (var3_1) {
            throw null;
            return (int)fo$Segment.dtnc("dtpz", dtmz(int ), (int)30);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = fo$Segment.jc;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(fo$Segment.dtnc("dtqb", dtni(int ), (int)36) - fo$Segment.dtnc("dtqa", dtni(int ), (int)35));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1924587679: {
                            break block19;
                        }
                        case 1713034331: {
                            continue block19;
                        }
                    }
                    break;
                }
                return this.start;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqc", dtmz(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqd", dtmz(int ), (int)32);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqe", dtmz(int ), (int)33);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqf", dtmz(int ), (int)34);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtsj() {
        fo$Segment.dtnj[0] = 7948037487401076658L;
        fo$Segment.dtnj[1] = 3791256766462801124L;
        fo$Segment.dtnj[2] = -2386443556864293500L;
        fo$Segment.dtnj[3] = -1678574468833921982L;
        fo$Segment.dtnj[4] = -8582973807365962131L;
        fo$Segment.dtnj[5] = -5389514014370338112L;
        fo$Segment.dtnj[6] = -5813685720945057840L;
        fo$Segment.dtnj[7] = 5469798688105626902L;
        fo$Segment.dtnj[8] = 4432919834103248504L;
        fo$Segment.dtnj[9] = 6478780666957013926L;
        fo$Segment.dtnj[10] = 1000482043297203688L;
        fo$Segment.dtnj[11] = 6655568837424373150L;
        fo$Segment.dtnj[12] = -1498226415033114557L;
        fo$Segment.dtnj[13] = 1172234958140172076L;
        fo$Segment.dtnj[14] = -8717089688989563298L;
        fo$Segment.dtnj[15] = 8102891500192974095L;
        fo$Segment.dtnj[16] = 9164648270118968553L;
        fo$Segment.dtnj[17] = -104449668013608755L;
        fo$Segment.dtnj[18] = -5671056179789875070L;
        fo$Segment.dtnj[19] = -7661729173274626277L;
        fo$Segment.dtnj[20] = 2703143303822184611L;
        fo$Segment.dtnj[21] = -1362720105086658289L;
        fo$Segment.dtnj[22] = -7045286622457726926L;
        fo$Segment.dtnj[23] = -3981148317931084300L;
        fo$Segment.dtnj[24] = -7682612574833462622L;
        fo$Segment.dtnj[25] = -2235286573526700227L;
        fo$Segment.dtnj[26] = -5584117833963696496L;
        fo$Segment.dtnj[27] = 6457379572305380765L;
        fo$Segment.dtnj[28] = -375637523580677222L;
        fo$Segment.dtnj[29] = 5431556653931084408L;
        fo$Segment.dtnj[30] = 6332699633333839038L;
        fo$Segment.dtnj[31] = -2272764185930924936L;
        fo$Segment.dtnj[32] = 7798112696784744658L;
        fo$Segment.dtnj[33] = -1231764555369434613L;
        fo$Segment.dtnj[34] = -2553045985103099410L;
        fo$Segment.dtnj[35] = -1463720623624375656L;
        fo$Segment.dtnj[36] = 3568505602773250588L;
        fo$Segment.dtnj[37] = -990357531260044945L;
        fo$Segment.dtnj[38] = 3110568716278629628L;
        fo$Segment.dtnj[39] = -6119628266301661812L;
        fo$Segment.dtnj[40] = -1062996595615398041L;
        fo$Segment.dtnj[41] = -6134085877938192114L;
        fo$Segment.dtnj[42] = -7233092504362529031L;
        fo$Segment.dtnj[43] = 930433335916470459L;
        fo$Segment.dtnj[44] = -7198853728186590432L;
        fo$Segment.dtnj[45] = -5762297529271412211L;
        fo$Segment.dtnj[46] = -2648533665379073441L;
        fo$Segment.dtnj[47] = -2589456644413310424L;
        fo$Segment.dtnj[48] = 5441469097172391318L;
        fo$Segment.dtnj[49] = -6032144589787972811L;
        fo$Segment.dtnj[50] = -4260884037865907641L;
        fo$Segment.dtnj[51] = -5579937744407626362L;
        fo$Segment.dtnj[52] = 824994503224156235L;
        fo$Segment.dtnj[53] = 8768918891820980450L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - fo$Segment.dtnc("dtov", dtni(int ), (int)21));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1924587679: {
                    break block17;
                }
                case -1302079465: {
                    v1 = fo$Segment.dtnc("dtow", dtni(int ), (int)22);
                    continue block17;
                }
                case -1216846488: {
                    v1 = fo$Segment.dtnc("dtox", dtni(int ), (int)23);
                    continue block17;
                }
                case 35129629: {
                    v1 = fo$Segment.dtnc("dtoy", dtni(int ), (int)24);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = fo$Segment.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtoz", dtni(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo$Segment.dtnc("dtpb", dtmz(int ), (int)17)) break;
            v2 /* !! */  = (long)fo$Segment.dtnc("dtpc", dtmz(int ), (int)18);
        }
        var3_3 /* !! */  = fo$Segment.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = fo$Segment.jc - fo$Segment.dtnc("dtpd", dtni(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo$Segment.dtnc("dtpe", dtmz(int ), (int)19)) break;
                    v3 /* !! */  = (long)fo$Segment.dtnc("dtpf", dtmz(int ), (int)20);
                }
                var2_4 = fo$Segment.a;
                if (var4_2) {
                    throw null;
                    return (boolean)fo$Segment.dtnc("dtpg", dtmz(int ), (int)21);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = fo$Segment.jc;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - fo$Segment.dtnc("dtph", dtni(int ), (int)27));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1924587679: {
                            break block21;
                        }
                        case 85047227: {
                            v5 = fo$Segment.dtnc("dtpi", dtni(int ), (int)28);
                            continue block21;
                        }
                        case 1551022009: {
                            v5 = fo$Segment.dtnc("dtpj", dtni(int ), (int)29);
                            continue block21;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fo$Segment.class, "start;end;value;style", "start", "end", "value", "style"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)fo$Segment.dtnc("dtpk", dtmz(int ), (int)22);
                if (!var4_2) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)fo$Segment.dtnc("dtpl", dtmz(int ), (int)23);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fo$Segment.dtnc("dtpm", dtmz(int ), (int)24);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)fo$Segment.dtnc("dtpn", dtmz(int ), (int)25);
        } while (!var4_2);
        throw null;
    }

    static {
        dtna = new int[66];
        dtnb = new int[66];
        fo$Segment.dtsf();
        fo$Segment.dtsh();
        dtnj = new long[54];
        dtnk = new long[54];
        fo$Segment.dtsj();
        fo$Segment.dtsl();
    }

    public static /* synthetic */ CallSite dtnc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dtsf() {
        fo$Segment.dtna[0] = -1316639128;
        fo$Segment.dtna[1] = 77776441;
        fo$Segment.dtna[2] = 810535569;
        fo$Segment.dtna[3] = -1639616744;
        fo$Segment.dtna[4] = 879482399;
        fo$Segment.dtna[5] = -2114485537;
        fo$Segment.dtna[6] = 2019289601;
        fo$Segment.dtna[7] = 1763498288;
        fo$Segment.dtna[8] = 1029076996;
        fo$Segment.dtna[9] = 1286054325;
        fo$Segment.dtna[10] = -1076202255;
        fo$Segment.dtna[11] = -1730725635;
        fo$Segment.dtna[12] = 1109122716;
        fo$Segment.dtna[13] = -1699860499;
        fo$Segment.dtna[14] = -1669497523;
        fo$Segment.dtna[15] = -1492975314;
        fo$Segment.dtna[16] = -399324726;
        fo$Segment.dtna[17] = 405080794;
        fo$Segment.dtna[18] = -30451145;
        fo$Segment.dtna[19] = 641918536;
        fo$Segment.dtna[20] = 1091763055;
        fo$Segment.dtna[21] = -2008674221;
        fo$Segment.dtna[22] = -500446160;
        fo$Segment.dtna[23] = 214330320;
        fo$Segment.dtna[24] = -2073448790;
        fo$Segment.dtna[25] = -531116956;
        fo$Segment.dtna[26] = 470411195;
        fo$Segment.dtna[27] = -2038956739;
        fo$Segment.dtna[28] = 904606135;
        fo$Segment.dtna[29] = 1707595120;
        fo$Segment.dtna[30] = -2080929060;
        fo$Segment.dtna[31] = 1946125600;
        fo$Segment.dtna[32] = -1068450399;
        fo$Segment.dtna[33] = 1325114457;
        fo$Segment.dtna[34] = 1526778896;
        fo$Segment.dtna[35] = -1553890624;
        fo$Segment.dtna[36] = 663362199;
        fo$Segment.dtna[37] = 472257876;
        fo$Segment.dtna[38] = 1937726070;
        fo$Segment.dtna[39] = -695467220;
        fo$Segment.dtna[40] = -2097127375;
        fo$Segment.dtna[41] = -1709017227;
        fo$Segment.dtna[42] = 1810085491;
        fo$Segment.dtna[43] = 331239443;
        fo$Segment.dtna[44] = 870691047;
        fo$Segment.dtna[45] = 977028142;
        fo$Segment.dtna[46] = -528408626;
        fo$Segment.dtna[47] = 936232664;
        fo$Segment.dtna[48] = 1381298986;
        fo$Segment.dtna[49] = -1831584577;
        fo$Segment.dtna[50] = 1600648439;
        fo$Segment.dtna[51] = 672198393;
        fo$Segment.dtna[52] = 1689012815;
        fo$Segment.dtna[53] = -2090639677;
        fo$Segment.dtna[54] = -912052312;
        fo$Segment.dtna[55] = 346563090;
        fo$Segment.dtna[56] = -1842599758;
        fo$Segment.dtna[57] = 1189190194;
        fo$Segment.dtna[58] = -1778630316;
        fo$Segment.dtna[59] = 1980686069;
        fo$Segment.dtna[60] = 1876975756;
        fo$Segment.dtna[61] = 1018469947;
        fo$Segment.dtna[62] = 1749020604;
        fo$Segment.dtna[63] = 775823524;
        fo$Segment.dtna[64] = 138296586;
        fo$Segment.dtna[65] = 906054254;
    }

    private static /* synthetic */ long dtni(int n2) {
        return dtnj[n2] ^ dtnk[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2583 style() {
        v0 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(fo$Segment.dtnc("dtrq", dtni(int ), (int)46) - fo$Segment.dtnc("dtrp", dtni(int ), (int)45));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1924587679: {
                    break block14;
                }
                case 1036844436: {
                    continue block14;
                }
            }
            break;
        }
        var3_1 = fo$Segment.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtrr", dtni(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo$Segment.dtnc("dtrs", dtmz(int ), (int)60)) break;
            v1 /* !! */  = (long)fo$Segment.dtnc("dtrt", dtmz(int ), (int)61);
        }
        var2_2 = fo$Segment.b;
        v2 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - fo$Segment.dtnc("dtru", dtni(int ), (int)48));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1924587679: {
                    break block16;
                }
                case -528945884: {
                    v3 = fo$Segment.dtnc("dtrv", dtni(int ), (int)49);
                    continue block16;
                }
                case 1353951973: {
                    v3 = fo$Segment.dtnc("dtrx", dtni(int ), (int)50);
                    continue block16;
                }
                case 1376769733: {
                    v3 = fo$Segment.dtnc("dtry", dtni(int ), (int)51);
                    continue block16;
                }
            }
            break;
        }
        var1_3 = fo$Segment.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        v4 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl44
        block18: while (true) {
            v4 /* !! */  = (long)(fo$Segment.dtnc("dtsa", dtni(int ), (int)53) - fo$Segment.dtnc("dtrz", dtni(int ), (int)52));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1924587679: {
                    break block18;
                }
                case -1416924867: {
                    continue block18;
                }
            }
            break;
        }
        return this.style;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtob", dtni(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Segment.dtnc("dtoc", dtmz(int ), (int)10)) break;
            v0 /* !! */  = (long)fo$Segment.dtnc("dtod", dtmz(int ), (int)11);
        }
        var3_1 = fo$Segment.c;
        v1 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - fo$Segment.dtnc("dtoe", dtni(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1924587679: {
                    break block24;
                }
                case 286239853: {
                    v2 = fo$Segment.dtnc("dtof", dtni(int ), (int)11);
                    continue block24;
                }
                case 2136834435: {
                    v2 = fo$Segment.dtnc("dtog", dtni(int ), (int)12);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = fo$Segment.b;
        v3 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - fo$Segment.dtnc("dtoh", dtni(int ), (int)13));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1924587679: {
                    break block25;
                }
                case -1388676167: {
                    v4 = fo$Segment.dtnc("dtoi", dtni(int ), (int)14);
                    continue block25;
                }
                case 567942522: {
                    v4 = fo$Segment.dtnc("dtoj", dtni(int ), (int)15);
                    continue block25;
                }
                case 785582143: {
                    v4 = fo$Segment.dtnc("dtok", dtni(int ), (int)16);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = fo$Segment.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)fo$Segment.dtnc("dtol", dtmz(int ), (int)12);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = fo$Segment.jc;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - fo$Segment.dtnc("dton", dtni(int ), (int)17));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1924587679: {
                            break block27;
                        }
                        case -91875192: {
                            v6 = fo$Segment.dtnc("dtoo", dtni(int ), (int)18);
                            continue block27;
                        }
                        case 241053823: {
                            v6 = fo$Segment.dtnc("dtop", dtni(int ), (int)19);
                            continue block27;
                        }
                        case 913744738: {
                            v6 = fo$Segment.dtnc("dtoq", dtni(int ), (int)20);
                            continue block27;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fo$Segment.class, "start;end;value;style", "start", "end", "value", "style"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtor", dtmz(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
lbl68:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)fo$Segment.dtnc("dtos", dtmz(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtot", dtmz(int ), (int)15);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fo$Segment.dtnc("dtou", dtmz(int ), (int)16);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int dtmz(int n2) {
        return dtna[n2] ^ dtnb[n2];
    }

    private static /* synthetic */ void dtsh() {
        fo$Segment.dtnb[0] = -1316639125;
        fo$Segment.dtnb[1] = 77776441;
        fo$Segment.dtnb[2] = 810535568;
        fo$Segment.dtnb[3] = -1639616742;
        fo$Segment.dtnb[4] = 879482398;
        fo$Segment.dtnb[5] = -862705642;
        fo$Segment.dtnb[6] = 2019289603;
        fo$Segment.dtnb[7] = 1763498288;
        fo$Segment.dtnb[8] = 1029076999;
        fo$Segment.dtnb[9] = 1286054327;
        fo$Segment.dtnb[10] = 1076202254;
        fo$Segment.dtnb[11] = -1364935801;
        fo$Segment.dtnb[12] = 2124591633;
        fo$Segment.dtnb[13] = -1699860499;
        fo$Segment.dtnb[14] = -1669497522;
        fo$Segment.dtnb[15] = -1492975314;
        fo$Segment.dtnb[16] = -399324728;
        fo$Segment.dtnb[17] = -405080795;
        fo$Segment.dtnb[18] = -1271861211;
        fo$Segment.dtnb[19] = -641918537;
        fo$Segment.dtnb[20] = 1267561172;
        fo$Segment.dtnb[21] = -2008674222;
        fo$Segment.dtnb[22] = -500446157;
        fo$Segment.dtnb[23] = 214330322;
        fo$Segment.dtnb[24] = -2073448790;
        fo$Segment.dtnb[25] = -531116955;
        fo$Segment.dtnb[26] = -470411196;
        fo$Segment.dtnb[27] = 1117751859;
        fo$Segment.dtnb[28] = -904606136;
        fo$Segment.dtnb[29] = -133638571;
        fo$Segment.dtnb[30] = 1817773364;
        fo$Segment.dtnb[31] = 1946125603;
        fo$Segment.dtnb[32] = -1068450400;
        fo$Segment.dtnb[33] = 1325114459;
        fo$Segment.dtnb[34] = 1526778898;
        fo$Segment.dtnb[35] = 1553890623;
        fo$Segment.dtnb[36] = -466091378;
        fo$Segment.dtnb[37] = 472257877;
        fo$Segment.dtnb[38] = -2062231920;
        fo$Segment.dtnb[39] = 695467219;
        fo$Segment.dtnb[40] = 1393724687;
        fo$Segment.dtnb[41] = -2108170424;
        fo$Segment.dtnb[42] = -1810085492;
        fo$Segment.dtnb[43] = 160396762;
        fo$Segment.dtnb[44] = 870691046;
        fo$Segment.dtnb[45] = 977028143;
        fo$Segment.dtnb[46] = -528408625;
        fo$Segment.dtnb[47] = 936232664;
        fo$Segment.dtnb[48] = -1381298987;
        fo$Segment.dtnb[49] = 2083824538;
        fo$Segment.dtnb[50] = -1600648440;
        fo$Segment.dtnb[51] = 1576411043;
        fo$Segment.dtnb[52] = -1689012816;
        fo$Segment.dtnb[53] = -924229372;
        fo$Segment.dtnb[54] = -912052311;
        fo$Segment.dtnb[55] = -1443785982;
        fo$Segment.dtnb[56] = -1842599759;
        fo$Segment.dtnb[57] = 1189190193;
        fo$Segment.dtnb[58] = -1778630314;
        fo$Segment.dtnb[59] = 1980686070;
        fo$Segment.dtnb[60] = -1876975757;
        fo$Segment.dtnb[61] = -80363089;
        fo$Segment.dtnb[62] = 1749020606;
        fo$Segment.dtnb[63] = 775823526;
        fo$Segment.dtnb[64] = 138296587;
        fo$Segment.dtnb[65] = 906054253;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtnl", dtni(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Segment.dtnc("dtnm", dtmz(int ), (int)4)) break;
            v0 /* !! */  = (long)fo$Segment.dtnc("dtnn", dtmz(int ), (int)5);
        }
        var3_1 = fo$Segment.c;
        v1 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(fo$Segment.dtnc("dtnp", dtni(int ), (int)2) - fo$Segment.dtnc("dtno", dtni(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1924587679: {
                    break block21;
                }
                case 717541396: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = fo$Segment.b;
        v2 /* !! */  = fo$Segment.jc;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(fo$Segment.dtnc("dtnr", dtni(int ), (int)4) - fo$Segment.dtnc("dtnq", dtni(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1924587679: {
                    break block22;
                }
                case 1314276054: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = fo$Segment.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = fo$Segment.jc;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - fo$Segment.dtnc("dtns", dtni(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1924587679: {
                            break block24;
                        }
                        case -321534003: {
                            v4 = fo$Segment.dtnc("dtnu", dtni(int ), (int)6);
                            continue block24;
                        }
                        case 1686271451: {
                            v4 = fo$Segment.dtnc("dtnv", dtni(int ), (int)7);
                            continue block24;
                        }
                        case 2046368595: {
                            v4 = fo$Segment.dtnc("dtnw", dtni(int ), (int)8);
                            continue block24;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{fo$Segment.class, "start;end;value;style", "start", "end", "value", "style"}, this);
            }
lbl53:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)fo$Segment.dtnc("dtnx", dtmz(int ), (int)6);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtny", dtmz(int ), (int)7);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo$Segment.dtnc("dtnz", dtmz(int ), (int)8);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo$Segment.dtnc("dtoa", dtmz(int ), (int)9);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int end() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Segment.jc - fo$Segment.dtnc("dtqg", dtni(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Segment.dtnc("dtqh", dtmz(int ), (int)35)) break;
            v0 /* !! */  = (long)fo$Segment.dtnc("dtqi", dtmz(int ), (int)36);
        }
        var3_1 = fo$Segment.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo$Segment.jc - fo$Segment.dtnc("dtqj", dtni(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo$Segment.dtnc("dtqk", dtmz(int ), (int)37)) break;
            v1 /* !! */  = (long)fo$Segment.dtnc("dtql", dtmz(int ), (int)38);
        }
        var2_2 /* !! */  = fo$Segment.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fo$Segment.jc - fo$Segment.dtnc("dtqm", dtni(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo$Segment.dtnc("dtqn", dtmz(int ), (int)39)) break;
            v2 /* !! */  = (long)fo$Segment.dtnc("dtqo", dtmz(int ), (int)40);
        }
        var1_3 = fo$Segment.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)fo$Segment.dtnc("dtqp", dtmz(int ), (int)41);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fo$Segment.jc - fo$Segment.dtnc("dtqr", dtni(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo$Segment.dtnc("dtqs", dtmz(int ), (int)42)) break;
                    v3 /* !! */  = (long)fo$Segment.dtnc("dtqt", dtmz(int ), (int)43);
                }
                return this.end;
            }
            case 0: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqu", dtmz(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqv", dtmz(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqw", dtmz(int ), (int)46);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fo$Segment.dtnc("dtqx", dtmz(int ), (int)47);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private fo$Segment(int var1_1, int var2_2, String var3_3, class_2583 var4_4) {
        var6_5 /* !! */  = fo$Segment.b;
        super();
        this.start = var1_1;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.end = var2_2;
                this.value = var3_3;
                this.style = var4_4;
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                while (true) {
                    var6_5 /* !! */  = (int)fo$Segment.dtnc("dtne", dtmz(int ), (int)0);
                }
            }
            case 1: {
                var6_5 /* !! */  = (int)fo$Segment.dtnc("dtnf", dtmz(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)fo$Segment.dtnc("dtng", dtmz(int ), (int)2);
                    ** GOTO lbl11
                    break;
                }
            }
            case 3: 
        }
        var6_5 /* !! */  = (int)fo$Segment.dtnc("dtnh", dtmz(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void dtsl() {
        fo$Segment.dtnk[0] = -1512722454236559238L;
        fo$Segment.dtnk[1] = -6308309661780738054L;
        fo$Segment.dtnk[2] = -3228065293295582445L;
        fo$Segment.dtnk[3] = 5762561416907197121L;
        fo$Segment.dtnk[4] = 6516925483423035346L;
        fo$Segment.dtnk[5] = 7984701843109843852L;
        fo$Segment.dtnk[6] = 966032899678833075L;
        fo$Segment.dtnk[7] = 5129402997028258477L;
        fo$Segment.dtnk[8] = 4947651963752533300L;
        fo$Segment.dtnk[9] = 2853915103291005503L;
        fo$Segment.dtnk[10] = 1903569462453888711L;
        fo$Segment.dtnk[11] = 7640322041856760348L;
        fo$Segment.dtnk[12] = 5551561658617786202L;
        fo$Segment.dtnk[13] = 9076318413473556126L;
        fo$Segment.dtnk[14] = 6295728596505370711L;
        fo$Segment.dtnk[15] = -1267382507812997465L;
        fo$Segment.dtnk[16] = 8395654650658204743L;
        fo$Segment.dtnk[17] = 5456242121198618596L;
        fo$Segment.dtnk[18] = 4065158963604943090L;
        fo$Segment.dtnk[19] = 4808019618721715706L;
        fo$Segment.dtnk[20] = -3527813629504922299L;
        fo$Segment.dtnk[21] = -5214537192864050481L;
        fo$Segment.dtnk[22] = -2276279709816002757L;
        fo$Segment.dtnk[23] = -2103435169491876239L;
        fo$Segment.dtnk[24] = 8331637002505984816L;
        fo$Segment.dtnk[25] = -5963257651969832931L;
        fo$Segment.dtnk[26] = -6058470717527324695L;
        fo$Segment.dtnk[27] = 3544831575191505274L;
        fo$Segment.dtnk[28] = 8895190666453874222L;
        fo$Segment.dtnk[29] = 1375677080047820140L;
        fo$Segment.dtnk[30] = 5014856035047197152L;
        fo$Segment.dtnk[31] = 2791096121203290654L;
        fo$Segment.dtnk[32] = -6140089040522398458L;
        fo$Segment.dtnk[33] = -4816003632333728388L;
        fo$Segment.dtnk[34] = 600379396380259598L;
        fo$Segment.dtnk[35] = 5549756773658761711L;
        fo$Segment.dtnk[36] = 3186168047987502661L;
        fo$Segment.dtnk[37] = -4141337068854060992L;
        fo$Segment.dtnk[38] = -8931178763943208709L;
        fo$Segment.dtnk[39] = -5948936464532965805L;
        fo$Segment.dtnk[40] = -6077112388867787727L;
        fo$Segment.dtnk[41] = -5683224860962975204L;
        fo$Segment.dtnk[42] = 6810079019511067732L;
        fo$Segment.dtnk[43] = 3747108282360482569L;
        fo$Segment.dtnk[44] = 660502344737104198L;
        fo$Segment.dtnk[45] = 5463909973853712016L;
        fo$Segment.dtnk[46] = 3745835820872601460L;
        fo$Segment.dtnk[47] = -1509477470502109555L;
        fo$Segment.dtnk[48] = -6232220803723248707L;
        fo$Segment.dtnk[49] = -1672916416397293284L;
        fo$Segment.dtnk[50] = 1813278354572046174L;
        fo$Segment.dtnk[51] = 127803560106371412L;
        fo$Segment.dtnk[52] = 6679599764755669216L;
        fo$Segment.dtnk[53] = -1940912510456411586L;
    }
}

