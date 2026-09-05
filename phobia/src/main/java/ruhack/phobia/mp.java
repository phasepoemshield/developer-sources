/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Native
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  com.sun.jna.platform.win32.WinNT
 *  org.lwjgl.glfw.GLFWNativeWin32
 */
package ruhack.phobia;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.lwjgl.glfw.GLFWNativeWin32;
import ruhack.phobia.mp$Dwmapi;

public final class mp {
    private static final long nd = -7334658503934809884L;
    private static int[] gcfe;
    public static final boolean c;
    private static long[] gcfl;
    private static int[] gcfd;
    public static final boolean a;
    private static long[] gcfk;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setDarkMode(long var0) {
        block53: {
            v0 /* !! */  = mp.nd;
            if (true) ** GOTO lbl5
            block33: while (true) {
                v0 /* !! */  = (long)(v1 - mp.gcff("gcfm", gcfj(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1943344924: {
                        break block33;
                    }
                    case -1682212457: {
                        v1 = mp.gcff("gcfn", gcfj(int ), (int)1);
                        continue block33;
                    }
                    case 375539477: {
                        v1 = mp.gcff("gcfo", gcfj(int ), (int)2);
                        continue block33;
                    }
                }
                break;
            }
            var4_1 = mp.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = mp.nd - mp.gcff("gcfp", gcfj(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == mp.gcff("gcfq", gcfc(int ), (int)3)) break;
                v2 /* !! */  = (long)mp.gcff("gcfr", gcfc(int ), (int)4);
            }
            var3_2 /* !! */  = mp.b;
            v3 /* !! */  = mp.nd;
            if (true) ** GOTO lbl26
            block35: while (true) {
                v3 /* !! */  = (long)(mp.gcff("gcft", gcfj(int ), (int)5) - mp.gcff("gcfs", gcfj(int ), (int)4));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1943344924: {
                        break block35;
                    }
                    case -1692373533: {
                        continue block35;
                    }
                }
                break;
            }
            var2_3 = mp.a;
            if (var4_1) {
                throw null;
lbl34:
                // 6 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl34
            v4 = mp.gcff("gcfu", gcfc(int ), (int)5);
            v5 = mp.gcff("gcfv", gcfc(int ), (int)6);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = mp.nd - mp.gcff("gcfw", gcfj(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == mp.gcff("gcfx", gcfc(int ), (int)7)) break;
                v6 /* !! */  = (long)mp.gcff("gcfy", gcfc(int ), (int)8);
            }
            if (mp.setAttribute(var0, (int)v4, (int)v5)) break block53;
            if (var2_3 || var2_3) ** GOTO lbl34
            v7 = mp.gcff("gcfz", gcfc(int ), (int)9);
            v8 = mp.gcff("gcga", gcfc(int ), (int)10);
            v9 /* !! */  = mp.nd;
            if (true) ** GOTO lbl53
            block38: while (true) {
                v9 /* !! */  = (long)(v10 - mp.gcff("gcgb", gcfj(int ), (int)7));
lbl53:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1943344924: {
                        break block38;
                    }
                    case -723900947: {
                        v10 = mp.gcff("gcgc", gcfj(int ), (int)8);
                        continue block38;
                    }
                    case -440714198: {
                        v10 = mp.gcff("gcgd", gcfj(int ), (int)9);
                        continue block38;
                    }
                    case -289303914: {
                        v10 = mp.gcff("gcge", gcfj(int ), (int)10);
                        continue block38;
                    }
                }
                break;
            }
            mp.setAttribute(var0, (int)v7, (int)v8);
            if (var2_3 || var2_3) ** GOTO lbl34
            v11 = mp.gcff("gcgf", gcfc(int ), (int)11);
            v12 = mp.gcff("gcgg", gcfc(int ), (int)12);
            v13 /* !! */  = mp.nd;
            if (true) ** GOTO lbl74
            block39: while (true) {
                v13 /* !! */  = (long)(v14 - mp.gcff("gcgh", gcfj(int ), (int)11));
lbl74:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1943344924: {
                        break block39;
                    }
                    case -1378706091: {
                        v14 = mp.gcff("gcgi", gcfj(int ), (int)12);
                        continue block39;
                    }
                    case -380303042: {
                        v14 = mp.gcff("gcgj", gcfj(int ), (int)13);
                        continue block39;
                    }
                }
                break;
            }
            mp.setAttribute(var0, (int)v11, (int)v12);
            if (var2_3) ** GOTO lbl34
        }
        if (var2_3) ** GOTO lbl34
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return;
            }
lbl94:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)mp.gcff("gcgk", gcfc(int ), (int)13);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl99:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)mp.gcff("gcgl", gcfc(int ), (int)14);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 2: {
                var3_2 /* !! */  = (int)mp.gcff("gcgm", gcfc(int ), (int)15);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 3: {
                var3_2 /* !! */  = (int)mp.gcff("gcgn", gcfc(int ), (int)16);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl114:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)mp.gcff("gcgo", gcfc(int ), (int)17);
                if (!var4_1) break;
                throw null;
            }
lbl118:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)mp.gcff("gcgp", gcfc(int ), (int)18);
                    if (!var4_1) ** GOTO lbl114
                    throw null;
                }
            }
            case 6: {
                do {
                    var3_2 /* !! */  = (int)mp.gcff("gcgq", gcfc(int ), (int)19);
                } while (!var4_1);
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)mp.gcff("gcgr", gcfc(int ), (int)20);
                if (!var4_1) ** GOTO lbl99
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)mp.gcff("gcgs", gcfc(int ), (int)21);
                if (var4_1) {
                    throw null;
                }
            }
lbl136:
            // 5 sources

            case 9: {
                var3_2 /* !! */  = (int)mp.gcff("gcgt", gcfc(int ), (int)22);
                if (!var4_1) ** GOTO lbl94
                throw null;
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)mp.gcff("gcgu", gcfc(int ), (int)23);
        ** while (!var4_1)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcjr() {
        mp.gcfk[0] = 3732401164659653474L;
        mp.gcfk[1] = 3526328781570914819L;
        mp.gcfk[2] = -1581974480844971397L;
        mp.gcfk[3] = 8051485029702827876L;
        mp.gcfk[4] = -3868146933823356494L;
        mp.gcfk[5] = 4436796076556592434L;
        mp.gcfk[6] = 7128259532511034570L;
        mp.gcfk[7] = -1335320639221883973L;
        mp.gcfk[8] = -1102977324162017009L;
        mp.gcfk[9] = -7311365868128583582L;
        mp.gcfk[10] = -4354355999989080673L;
        mp.gcfk[11] = -705531630565809700L;
        mp.gcfk[12] = 5961712855333419572L;
        mp.gcfk[13] = 1850791318715844886L;
        mp.gcfk[14] = -5338179763104787549L;
        mp.gcfk[15] = -7406703238239958417L;
        mp.gcfk[16] = 6799861627884118278L;
        mp.gcfk[17] = 6185306289700414416L;
        mp.gcfk[18] = 8611259202787413105L;
        mp.gcfk[19] = -5454949589907315785L;
        mp.gcfk[20] = -5722791877236227386L;
        mp.gcfk[21] = 1449298475953294593L;
        mp.gcfk[22] = -9076961928445614123L;
        mp.gcfk[23] = 8155764212645812191L;
        mp.gcfk[24] = 529481142740052990L;
        mp.gcfk[25] = -8247682778503019701L;
        mp.gcfk[26] = 420969367742620475L;
        mp.gcfk[27] = -7794125716852483004L;
    }

    private static /* synthetic */ void gcjs() {
        mp.gcfl[0] = -1123029402096304013L;
        mp.gcfl[1] = -4795944235836796946L;
        mp.gcfl[2] = 9133832743053230716L;
        mp.gcfl[3] = 6587178117550820482L;
        mp.gcfl[4] = -3378610766787627191L;
        mp.gcfl[5] = -8406281360005015184L;
        mp.gcfl[6] = 7620930614848186304L;
        mp.gcfl[7] = 4359486624689353091L;
        mp.gcfl[8] = -6734163974997619631L;
        mp.gcfl[9] = -5195745491528220381L;
        mp.gcfl[10] = 3280685609378320782L;
        mp.gcfl[11] = -1183976218127657446L;
        mp.gcfl[12] = -6158346644446747117L;
        mp.gcfl[13] = -6987637346848008894L;
        mp.gcfl[14] = -255095243879995128L;
        mp.gcfl[15] = -4455369701309189384L;
        mp.gcfl[16] = 4284670156231484922L;
        mp.gcfl[17] = -1184617898763071098L;
        mp.gcfl[18] = -6906712580195668180L;
        mp.gcfl[19] = 2393270779186335494L;
        mp.gcfl[20] = 3699054210104857582L;
        mp.gcfl[21] = 4695898840934884777L;
        mp.gcfl[22] = -2950020191054583364L;
        mp.gcfl[23] = -9192137156344590320L;
        mp.gcfl[24] = -8511033715671621221L;
        mp.gcfl[25] = -8247682778503019701L;
        mp.gcfl[26] = 420969367742620479L;
        mp.gcfl[27] = -7794125716852483004L;
    }

    private static /* synthetic */ void gcjp() {
        mp.gcfd[0] = -1957316901;
        mp.gcfd[1] = 290041856;
        mp.gcfd[2] = 735902436;
        mp.gcfd[3] = -1499131262;
        mp.gcfd[4] = -19688012;
        mp.gcfd[5] = -396778;
        mp.gcfd[6] = 1169053387;
        mp.gcfd[7] = -1556533499;
        mp.gcfd[8] = 182567476;
        mp.gcfd[9] = 819352498;
        mp.gcfd[10] = 1798748564;
        mp.gcfd[11] = 1985394079;
        mp.gcfd[12] = 2003197141;
        mp.gcfd[13] = -2024845969;
        mp.gcfd[14] = 1858791878;
        mp.gcfd[15] = 1944490508;
        mp.gcfd[16] = -2137850791;
        mp.gcfd[17] = 465771804;
        mp.gcfd[18] = -561235572;
        mp.gcfd[19] = 1219272580;
        mp.gcfd[20] = -1751801260;
        mp.gcfd[21] = -75798112;
        mp.gcfd[22] = 919352022;
        mp.gcfd[23] = -1371069859;
        mp.gcfd[24] = 324255344;
        mp.gcfd[25] = 2045216656;
        mp.gcfd[26] = 261035192;
        mp.gcfd[27] = 1732657946;
        mp.gcfd[28] = 2087720182;
        mp.gcfd[29] = 787495075;
        mp.gcfd[30] = 1829129612;
        mp.gcfd[31] = 423590119;
        mp.gcfd[32] = 55483347;
        mp.gcfd[33] = 1490854653;
        mp.gcfd[34] = 488465767;
        mp.gcfd[35] = -1478922549;
        mp.gcfd[36] = 377674372;
        mp.gcfd[37] = 1603865387;
        mp.gcfd[38] = 1484177897;
        mp.gcfd[39] = 675896073;
        mp.gcfd[40] = 2132460287;
        mp.gcfd[41] = 1767632476;
        mp.gcfd[42] = 1778733148;
        mp.gcfd[43] = 652833965;
        mp.gcfd[44] = -1211181232;
        mp.gcfd[45] = 1596930342;
        mp.gcfd[46] = 1675628615;
        mp.gcfd[47] = 2139964348;
        mp.gcfd[48] = -1544504174;
        mp.gcfd[49] = 1725261774;
        mp.gcfd[50] = 940634213;
        mp.gcfd[51] = -606701785;
        mp.gcfd[52] = -1073891109;
        mp.gcfd[53] = 628787003;
        mp.gcfd[54] = 915124837;
        mp.gcfd[55] = -11903861;
        mp.gcfd[56] = 1632258161;
        mp.gcfd[57] = -1599387155;
        mp.gcfd[58] = 504494478;
        mp.gcfd[59] = -2133696139;
        mp.gcfd[60] = -1566835274;
        mp.gcfd[61] = 1766195659;
        mp.gcfd[62] = -269358591;
        mp.gcfd[63] = -666065915;
        mp.gcfd[64] = -981381114;
        mp.gcfd[65] = -1290456354;
        mp.gcfd[66] = 261227025;
        mp.gcfd[67] = 406492651;
        mp.gcfd[68] = -1810394007;
        mp.gcfd[69] = -1735033137;
        mp.gcfd[70] = -1297517656;
        mp.gcfd[71] = -1601062761;
        mp.gcfd[72] = 1869943028;
        mp.gcfd[73] = -1451715235;
        mp.gcfd[74] = -1995288218;
        mp.gcfd[75] = 189422656;
        mp.gcfd[76] = 1343822377;
        mp.gcfd[77] = 203630144;
        mp.gcfd[78] = -43541318;
        mp.gcfd[79] = 1745040488;
        mp.gcfd[80] = 1087536385;
        mp.gcfd[81] = -687158289;
    }

    public static /* synthetic */ CallSite gcff(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long gcfj(int n2) {
        return gcfk[n2] ^ gcfl[n2];
    }

    static {
        gcfd = new int[82];
        gcfe = new int[82];
        mp.gcjp();
        mp.gcjq();
        gcfk = new long[28];
        gcfl = new long[28];
        mp.gcjr();
        mp.gcjs();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private mp() {
        block6: {
            int n2 = b;
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite = mp.gcff("gcfg", gcfc(int ), (int)0);
                    break;
                }
                case 1: {
                    break block6;
                }
                case 2: 
            }
            CallSite callSite = mp.gcff("gcfi", gcfc(int ), (int)2);
        }
        while (true) {
            CallSite callSite = mp.gcff("gcfh", gcfc(int ), (int)1);
        }
    }

    private static /* synthetic */ void gcjq() {
        mp.gcfe[0] = -1957316902;
        mp.gcfe[1] = 290041856;
        mp.gcfe[2] = 735902437;
        mp.gcfe[3] = 1499131261;
        mp.gcfe[4] = 292259505;
        mp.gcfe[5] = -396798;
        mp.gcfe[6] = 1169053386;
        mp.gcfe[7] = 1556533498;
        mp.gcfe[8] = -1361893106;
        mp.gcfe[9] = 819352481;
        mp.gcfe[10] = 1798748565;
        mp.gcfe[11] = 1985394109;
        mp.gcfe[12] = 2003197141;
        mp.gcfe[13] = -2024845973;
        mp.gcfe[14] = 1858791884;
        mp.gcfe[15] = 1944490500;
        mp.gcfe[16] = -2137850797;
        mp.gcfe[17] = 465771803;
        mp.gcfe[18] = -561235574;
        mp.gcfe[19] = 1219272588;
        mp.gcfe[20] = -1751801251;
        mp.gcfe[21] = -75798107;
        mp.gcfe[22] = 919352023;
        mp.gcfe[23] = -1371069859;
        mp.gcfe[24] = -324255345;
        mp.gcfe[25] = -464630756;
        mp.gcfe[26] = -261035193;
        mp.gcfe[27] = 20972399;
        mp.gcfe[28] = 2087720162;
        mp.gcfe[29] = 787495075;
        mp.gcfe[30] = 1829129613;
        mp.gcfe[31] = 318633479;
        mp.gcfe[32] = 55483328;
        mp.gcfe[33] = 1490854653;
        mp.gcfe[34] = 488465733;
        mp.gcfe[35] = -1490644684;
        mp.gcfe[36] = 377674373;
        mp.gcfe[37] = 1135911762;
        mp.gcfe[38] = 1484177891;
        mp.gcfe[39] = 675896073;
        mp.gcfe[40] = 2132460279;
        mp.gcfe[41] = 1767632473;
        mp.gcfe[42] = 1778733146;
        mp.gcfe[43] = 652833959;
        mp.gcfe[44] = -1211181224;
        mp.gcfe[45] = 1596930343;
        mp.gcfe[46] = 1675628623;
        mp.gcfe[47] = 2139964349;
        mp.gcfe[48] = -1544504174;
        mp.gcfe[49] = 1725261775;
        mp.gcfe[50] = 940634213;
        mp.gcfe[51] = -606701789;
        mp.gcfe[52] = -1073891109;
        mp.gcfe[53] = 628787003;
        mp.gcfe[54] = 915124860;
        mp.gcfe[55] = -11903844;
        mp.gcfe[56] = 1632258174;
        mp.gcfe[57] = -1599387156;
        mp.gcfe[58] = 504494491;
        mp.gcfe[59] = -2133696143;
        mp.gcfe[60] = -1566835290;
        mp.gcfe[61] = 1766195676;
        mp.gcfe[62] = -269358577;
        mp.gcfe[63] = -666065897;
        mp.gcfe[64] = -981381092;
        mp.gcfe[65] = -1290456364;
        mp.gcfe[66] = 261227021;
        mp.gcfe[67] = 406492650;
        mp.gcfe[68] = -1810393990;
        mp.gcfe[69] = -1735033143;
        mp.gcfe[70] = -1297517645;
        mp.gcfe[71] = -1601062778;
        mp.gcfe[72] = 1869943020;
        mp.gcfe[73] = -1451715247;
        mp.gcfe[74] = -1995288208;
        mp.gcfe[75] = 189422677;
        mp.gcfe[76] = 1343822394;
        mp.gcfe[77] = 203630162;
        mp.gcfe[78] = -43541341;
        mp.gcfe[79] = 1745040489;
        mp.gcfe[80] = 1087536389;
        mp.gcfe[81] = -687158276;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setLightMode(long var0) {
        v0 /* !! */  = mp.nd;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - mp.gcff("gcgv", gcfj(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1943344924: {
                    break block24;
                }
                case -500765081: {
                    v1 = mp.gcff("gcgw", gcfj(int ), (int)15);
                    continue block24;
                }
                case 1796150120: {
                    v1 = mp.gcff("gcgx", gcfj(int ), (int)16);
                    continue block24;
                }
            }
            break;
        }
        var4_1 = mp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mp.nd - mp.gcff("gcgy", gcfj(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mp.gcff("gcgz", gcfc(int ), (int)24)) break;
            v2 /* !! */  = (long)mp.gcff("gcha", gcfc(int ), (int)25);
        }
        var3_2 /* !! */  = mp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mp.nd - mp.gcff("gchb", gcfj(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mp.gcff("gchc", gcfc(int ), (int)26)) break;
            v3 /* !! */  = (long)mp.gcff("gchd", gcfc(int ), (int)27);
        }
        var2_3 = mp.a;
        if (var4_1) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl29
                v4 = mp.gcff("gche", gcfc(int ), (int)28);
                v5 = mp.gcff("gchf", gcfc(int ), (int)29);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mp.nd - mp.gcff("gchg", gcfj(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mp.gcff("gchh", gcfc(int ), (int)30)) break;
                    v6 /* !! */  = (long)mp.gcff("gchi", gcfc(int ), (int)31);
                }
                if (mp.setAttribute(var0, (int)v4, (int)v5)) ** GOTO lbl74
                if (var2_3 || var2_3) ** GOTO lbl29
                v7 = mp.gcff("gchj", gcfc(int ), (int)32);
                v8 = mp.gcff("gchk", gcfc(int ), (int)33);
                v9 /* !! */  = mp.nd;
                if (true) ** GOTO lbl50
                block29: while (true) {
                    v9 /* !! */  = (long)(v10 - mp.gcff("gchl", gcfj(int ), (int)20));
lbl50:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1943344924: {
                            break block29;
                        }
                        case 541308613: {
                            v10 = mp.gcff("gchm", gcfj(int ), (int)21);
                            continue block29;
                        }
                        case 622942593: {
                            v10 = mp.gcff("gchn", gcfj(int ), (int)22);
                            continue block29;
                        }
                        case 1846700317: {
                            v10 = mp.gcff("gcho", gcfj(int ), (int)23);
                            continue block29;
                        }
                    }
                    break;
                }
                mp.setAttribute(var0, (int)v7, (int)v8);
                if (var2_3 || var2_3) ** GOTO lbl29
                v11 = mp.gcff("gchp", gcfc(int ), (int)34);
                v12 = mp.gcff("gchq", gcfc(int ), (int)35);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = mp.nd - mp.gcff("gchr", gcfj(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == mp.gcff("gchs", gcfc(int ), (int)36)) break;
                    v13 /* !! */  = (long)mp.gcff("gcht", gcfc(int ), (int)37);
                }
                mp.setAttribute(var0, (int)v11, (int)v12);
                if (var2_3) ** GOTO lbl29
lbl74:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl77:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)mp.gcff("gchu", gcfc(int ), (int)38);
                if (!var4_1) break;
                throw null;
            }
lbl81:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)mp.gcff("gchv", gcfc(int ), (int)39);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 2: {
                var3_2 /* !! */  = (int)mp.gcff("gchw", gcfc(int ), (int)40);
                if (!var4_1) ** GOTO lbl77
                throw null;
            }
lbl90:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)mp.gcff("gchx", gcfc(int ), (int)41);
                if (!var4_1) ** GOTO lbl81
                throw null;
            }
lbl94:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)mp.gcff("gchy", gcfc(int ), (int)42);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 5: {
                var3_2 /* !! */  = (int)mp.gcff("gchz", gcfc(int ), (int)43);
                if (!var4_1) ** GOTO lbl94
                throw null;
            }
lbl103:
            // 3 sources

            case 6: {
                var3_2 /* !! */  = (int)mp.gcff("gcia", gcfc(int ), (int)44);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl108:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)mp.gcff("gcib", gcfc(int ), (int)45);
                if (!var4_1) ** GOTO lbl94
                throw null;
            }
lbl112:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)mp.gcff("gcic", gcfc(int ), (int)46);
                if (!var4_1) ** GOTO lbl103
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)mp.gcff("gcid", gcfc(int ), (int)47);
                    if (!var4_1) ** GOTO lbl90
                    throw null;
                }
            }
            case 10: 
        }
        var3_2 /* !! */  = (int)mp.gcff("gcie", gcfc(int ), (int)48);
        ** while (!var4_1)
lbl124:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int gcfc(int n2) {
        return gcfd[n2] ^ gcfe[n2];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean setAttribute(long var0, int var2_1, int var3_2) {
        block63: {
            block62: {
                var11_3 = mp.c;
                var10_4 /* !! */  = mp.b;
                var9_5 = mp.a;
                if (var11_3) {
                    throw null;
lbl6:
                    // 16 sources

                    return (boolean)mp.gcff("gcif", gcfc(int ), (int)49);
                }
                if (var9_5 || var9_5) ** GOTO lbl6
                if (var0 == mp.gcff("gcig", gcfj(int ), (int)25)) break block62;
                if (var9_5) ** GOTO lbl6
                if (System.getProperty("os.name").toLowerCase().contains("win")) break block63;
                if (var9_5) ** GOTO lbl6
            }
            if (var9_5 || var9_5) ** GOTO lbl6
            return (boolean)mp.gcff("gcih", gcfc(int ), (int)50);
        }
        if (var9_5 || var9_5) ** GOTO lbl6
        var4_6 = new WinDef.HWND(new Pointer(GLFWNativeWin32.glfwGetWin32Window((long)var0)));
        if (var9_5 || var9_5) ** GOTO lbl6
        var5_8 = new Pointer(Native.malloc((long)mp.gcff("gcii", gcfj(int ), (int)26)));
        if (var9_5) ** GOTO lbl6
        try {
            if (var9_5) ** GOTO lbl6
            var5_8.setInt((long)mp.gcff("gcij", gcfj(int ), (int)27), var3_2);
            if (var9_5 || var9_5) ** GOTO lbl6
            var6_9 = mp$Dwmapi.INSTANCE.DwmSetWindowAttribute(var4_6, var2_1, var5_8, (int)mp.gcff("gcik", gcfc(int ), (int)51));
            if (var9_5 || var9_5) ** GOTO lbl6
            var7_10 = var6_9.equals((Object)WinNT.S_OK);
            if (var9_5 || var9_5) ** GOTO lbl6
        }
        catch (Throwable var8_11) {
            try {
                if (var9_5 || var9_5) ** GOTO lbl6
                Native.free((long)Pointer.nativeValue((Pointer)var5_8));
                if (var9_5 || var9_5) ** GOTO lbl6
                throw var8_11;
            }
            catch (Throwable var4_7) {
                if (var9_5) ** GOTO lbl6
                if (var10_4 /* !! */  == 0) ** GOTO lbl-1000
                switch (var10_4 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var9_5) ** break;
                        ** continue;
                        return (boolean)mp.gcff("gcil", gcfc(int ), (int)52);
                    }
                    case 0: {
                        var10_4 /* !! */  = (int)mp.gcff("gcim", gcfc(int ), (int)53);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl88
                    }
lbl50:
                    // 3 sources

                    case 1: {
                        var10_4 /* !! */  = (int)mp.gcff("gcin", gcfc(int ), (int)54);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl138
                    }
lbl55:
                    // 2 sources

                    case 2: {
                        var10_4 /* !! */  = (int)mp.gcff("gcio", gcfc(int ), (int)55);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl166
                    }
                    case 3: {
                        var10_4 /* !! */  = (int)mp.gcff("gcip", gcfc(int ), (int)56);
                        if (!var11_3) ** GOTO lbl50
                        throw null;
                    }
lbl64:
                    // 2 sources

                    case 4: {
                        var10_4 /* !! */  = (int)mp.gcff("gciq", gcfc(int ), (int)57);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl107
                    }
lbl69:
                    // 2 sources

                    case 5: {
                        var10_4 /* !! */  = (int)mp.gcff("gcir", gcfc(int ), (int)58);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl98
                    }
                    case 6: {
                        var10_4 /* !! */  = (int)mp.gcff("gcis", gcfc(int ), (int)59);
                        if (!var11_3) ** GOTO lbl69
                        throw null;
                    }
lbl78:
                    // 3 sources

                    case 7: {
                        var10_4 /* !! */  = (int)mp.gcff("gcit", gcfc(int ), (int)60);
                        if (!var11_3) break;
                        throw null;
                    }
                    case 8: {
                        while (true) {
                            var10_4 /* !! */  = (int)mp.gcff("gciu", gcfc(int ), (int)61);
                            if (var11_3) {
                                throw null;
                            }
                            ** GOTO lbl142
                            break;
                        }
                    }
lbl88:
                    // 3 sources

                    case 9: {
                        var10_4 /* !! */  = (int)mp.gcff("gciv", gcfc(int ), (int)62);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl166
                    }
                    case 10: {
                        var10_4 /* !! */  = (int)mp.gcff("gciw", gcfc(int ), (int)63);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl150
                    }
lbl98:
                    // 3 sources

                    case 11: {
                        var10_4 /* !! */  = (int)mp.gcff("gcix", gcfc(int ), (int)64);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl129
                    }
lbl103:
                    // 4 sources

                    case 12: {
                        var10_4 /* !! */  = (int)mp.gcff("gciy", gcfc(int ), (int)65);
                        if (!var11_3) ** GOTO lbl98
                        throw null;
                    }
lbl107:
                    // 2 sources

                    case 13: {
                        var10_4 /* !! */  = (int)mp.gcff("gciz", gcfc(int ), (int)66);
                        if (!var11_3) ** GOTO lbl103
                        throw null;
                    }
                    case 14: {
                        do {
                            var10_4 /* !! */  = (int)mp.gcff("gcja", gcfc(int ), (int)67);
                        } while (!var11_3);
                        throw null;
                    }
lbl116:
                    // 2 sources

                    case 15: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjb", gcfc(int ), (int)68);
                        if (var11_3) {
                            throw null;
                        }
                        ** GOTO lbl138
                    }
                    case 16: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjc", gcfc(int ), (int)69);
                        if (!var11_3) ** GOTO lbl78
                        throw null;
                    }
lbl125:
                    // 2 sources

                    case 17: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjd", gcfc(int ), (int)70);
                        if (!var11_3) ** GOTO lbl55
                        throw null;
                    }
lbl129:
                    // 2 sources

                    case 18: {
                        var10_4 /* !! */  = (int)mp.gcff("gcje", gcfc(int ), (int)71);
                        if (!var11_3) ** GOTO lbl78
                        throw null;
                    }
                    case 19: {
                        do {
                            var10_4 /* !! */  = (int)mp.gcff("gcjf", gcfc(int ), (int)72);
                        } while (!var11_3);
                        throw null;
                    }
lbl138:
                    // 3 sources

                    case 20: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjg", gcfc(int ), (int)73);
                        if (!var11_3) ** GOTO lbl125
                        throw null;
                    }
lbl142:
                    // 3 sources

                    case 21: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjh", gcfc(int ), (int)74);
                        if (!var11_3) ** GOTO lbl50
                        throw null;
                    }
                    case 22: {
                        var10_4 /* !! */  = (int)mp.gcff("gcji", gcfc(int ), (int)75);
                        if (!var11_3) ** GOTO lbl142
                        throw null;
                    }
lbl150:
                    // 2 sources

                    case 23: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjj", gcfc(int ), (int)76);
                        if (!var11_3) ** GOTO lbl88
                        throw null;
                    }
                    case 24: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjk", gcfc(int ), (int)77);
                        if (!var11_3) ** GOTO lbl103
                        throw null;
                    }
                    case 25: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjl", gcfc(int ), (int)78);
                        if (!var11_3) ** GOTO lbl116
                        throw null;
                    }
                    case 26: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjm", gcfc(int ), (int)79);
                        if (!var11_3) ** GOTO lbl64
                        throw null;
                    }
lbl166:
                    // 3 sources

                    case 27: {
                        var10_4 /* !! */  = (int)mp.gcff("gcjn", gcfc(int ), (int)80);
                        if (!var11_3) ** GOTO lbl103
                        throw null;
                    }
                    case 28: 
                }
                var10_4 /* !! */  = (int)mp.gcff("gcjo", gcfc(int ), (int)81);
                if (!var11_3) ** continue;
                throw null;
            }
        }
        Native.free((long)Pointer.nativeValue((Pointer)var5_8));
        if (var9_5 || var9_5) ** GOTO lbl6
        return var7_10;
    }
}

