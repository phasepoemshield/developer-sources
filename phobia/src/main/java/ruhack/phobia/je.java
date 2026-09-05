/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_243
 *  net.minecraft.class_2767
 *  net.minecraft.class_5321
 *  org.joml.Vector2f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_243;
import net.minecraft.class_2767;
import net.minecraft.class_5321;
import org.joml.Vector2f;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.di;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.je$FireworkMarker;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.op;

public final class je
extends ds {
    protected static final long bx = -2284496538496788763L;
    private final List<je$FireworkMarker> markers;
    private static final long LIFETIME_MS = 5000L;
    private static final class_1799 ICON;
    public static final boolean c;
    private static int[] agfa;
    private static final long FADE_MS = 350L;
    private final Vector2f projected;
    private static long[] agfn;
    public static final int b;
    public static final boolean a;
    private static long[] agfm;
    private final kb showTime;
    private static int[] agfb;

    private static /* synthetic */ long agfl(int n2) {
        return agfm[n2] ^ agfn[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block70: {
            var8_2 = je.c;
            var7_3 /* !! */  = je.b;
            var6_4 = je.a;
            if (var8_2) {
                throw null;
lbl6:
                // 20 sources

                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var1_1.getType() != cr$Type.RECEIVE) break block70;
            if (var6_4 || var6_4) ** GOTO lbl6
            var3_5 = var1_1.getPacket();
            if (var6_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_2767)) break block70;
            if (var6_4) ** GOTO lbl6
            var2_6 = (class_2767)var3_5;
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var2_6.method_11894().method_40230().isEmpty()) break block70;
            if (var6_4) ** GOTO lbl6
            if ("entity.firework_rocket.launch".equals(((class_5321)var2_6.method_11894().method_40230().get()).method_29177().method_12832())) ** GOTO lbl28
            if (var6_4) ** GOTO lbl6
        }
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                return;
            }
lbl28:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            var3_5 = new class_243(var2_6.method_11890(), var2_6.method_11889(), var2_6.method_11893());
            if (var6_4 || var6_4) ** GOTO lbl6
            var4_7 = this.markers.iterator();
            if (var6_4) ** GOTO lbl6
            do {
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!var4_7.hasNext()) ** GOTO lbl47
                if (var6_4) ** GOTO lbl6
                var5_8 = var4_7.next();
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(var5_8.position.method_1025(var3_5) <= je.agfc("aggk", aggj(int ), (int)9))) ** GOTO lbl44
                if (var6_4) ** GOTO lbl6
                if (!(var5_8.alpha() > je.agfc("aggm", aggl(int ), (int)20))) ** GOTO lbl44
                if (var6_4 || var6_4) ** GOTO lbl6
                return;
lbl44:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl6
            } while (!var8_2);
            throw null;
lbl47:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.markers.add(new je$FireworkMarker(var3_5, System.currentTimeMillis()));
            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
            case 0: {
                var7_3 /* !! */  = (int)je.agfc("aggn", agez(int ), (int)21);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl81
            }
lbl58:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)je.agfc("aggo", agez(int ), (int)22);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 2: {
                var7_3 /* !! */  = (int)je.agfc("aggp", agez(int ), (int)23);
                if (!var8_2) break;
                throw null;
            }
lbl67:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)je.agfc("aggq", agez(int ), (int)24);
                if (var8_2) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 4: {
                var7_3 /* !! */  = (int)je.agfc("aggr", agez(int ), (int)25);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl76:
            // 4 sources

            case 5: {
                var7_3 /* !! */  = (int)je.agfc("aggs", agez(int ), (int)26);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl81:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)je.agfc("aggt", agez(int ), (int)27);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl86:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)je.agfc("aggu", agez(int ), (int)28);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl91:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)je.agfc("aggv", agez(int ), (int)29);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl96:
            // 3 sources

            case 9: {
                do {
                    var7_3 /* !! */  = (int)je.agfc("aggw", agez(int ), (int)30);
                } while (!var8_2);
                throw null;
            }
lbl101:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)je.agfc("aggx", agez(int ), (int)31);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl106:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)je.agfc("aggy", agez(int ), (int)32);
                if (!var8_2) ** GOTO lbl67
                throw null;
            }
lbl110:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)je.agfc("aggz", agez(int ), (int)33);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl115:
            // 3 sources

            case 13: {
                var7_3 /* !! */  = (int)je.agfc("agha", agez(int ), (int)34);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl120:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)je.agfc("aghb", agez(int ), (int)35);
                if (!var8_2) ** GOTO lbl76
                throw null;
            }
            case 15: {
                var7_3 /* !! */  = (int)je.agfc("aghc", agez(int ), (int)36);
                if (!var8_2) ** GOTO lbl106
                throw null;
            }
lbl128:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)je.agfc("aghd", agez(int ), (int)37);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 17: {
                var7_3 /* !! */  = (int)je.agfc("aghe", agez(int ), (int)38);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
lbl137:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)je.agfc("aghf", agez(int ), (int)39);
                if (!var8_2) ** GOTO lbl96
                throw null;
            }
            case 19: {
                var7_3 /* !! */  = (int)je.agfc("aghg", agez(int ), (int)40);
                if (!var8_2) ** GOTO lbl110
                throw null;
            }
            case 20: {
                var7_3 /* !! */  = (int)je.agfc("aghh", agez(int ), (int)41);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl150:
            // 4 sources

            case 21: {
                var7_3 /* !! */  = (int)je.agfc("aghi", agez(int ), (int)42);
                if (!var8_2) ** GOTO lbl128
                throw null;
            }
            case 22: {
                var7_3 /* !! */  = (int)je.agfc("aghj", agez(int ), (int)43);
                if (!var8_2) ** GOTO lbl58
                throw null;
            }
            case 23: {
                var7_3 /* !! */  = (int)je.agfc("aghk", agez(int ), (int)44);
                if (!var8_2) ** GOTO lbl115
                throw null;
            }
lbl162:
            // 3 sources

            case 24: {
                var7_3 /* !! */  = (int)je.agfc("aghl", agez(int ), (int)45);
                if (!var8_2) ** GOTO lbl71
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)je.agfc("aghm", agez(int ), (int)46);
                if (!var8_2) ** GOTO lbl91
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)je.agfc("aghn", agez(int ), (int)47);
                if (!var8_2) ** GOTO lbl137
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)je.agfc("agho", agez(int ), (int)48);
                if (!var8_2) ** GOTO lbl120
                throw null;
            }
            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)je.agfc("aghp", agez(int ), (int)49);
                    if (!var8_2) ** GOTO lbl115
                    throw null;
                }
            }
            case 29: {
                var7_3 /* !! */  = (int)je.agfc("aghq", agez(int ), (int)50);
                if (!var8_2) break;
                throw null;
            }
lbl187:
            // 3 sources

            case 30: {
                var7_3 /* !! */  = (int)je.agfc("aghr", agez(int ), (int)51);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
lbl191:
            // 2 sources

            case 31: {
                var7_3 /* !! */  = (int)je.agfc("aghs", agez(int ), (int)52);
                if (!var8_2) ** GOTO lbl101
                throw null;
            }
            case 32: {
                var7_3 /* !! */  = (int)je.agfc("aght", agez(int ), (int)53);
                if (!var8_2) ** GOTO lbl76
                throw null;
            }
            case 33: {
                var7_3 /* !! */  = (int)je.agfc("aghu", agez(int ), (int)54);
                if (!var8_2) ** GOTO lbl162
                throw null;
            }
            case 34: 
        }
        var7_3 /* !! */  = (int)je.agfc("aghv", agez(int ), (int)55);
        ** while (!var8_2)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = je.bx;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(je.agfc("agfp", agfl(int ), (int)1) - je.agfc("agfo", agfl(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2075519259: {
                    break block18;
                }
                case 1899185031: {
                    continue block18;
                }
            }
            break;
        }
        var3_1 = je.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = je.bx - je.agfc("agfq", agfl(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == je.agfc("agfr", agez(int ), (int)8)) break;
            v1 /* !! */  = (long)je.agfc("agfs", agez(int ), (int)9);
        }
        var2_2 /* !! */  = je.b;
        v2 /* !! */  = je.bx;
        if (true) ** GOTO lbl21
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - je.agfc("agft", agfl(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2075519259: {
                    break block20;
                }
                case -1929144218: {
                    v3 = je.agfc("agfu", agfl(int ), (int)4);
                    continue block20;
                }
                case 718379062: {
                    v3 = je.agfc("agfv", agfl(int ), (int)5);
                    continue block20;
                }
                case 1215246385: {
                    v3 = je.agfc("agfw", agfl(int ), (int)6);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = je.a;
        if (var3_1) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = je.bx - je.agfc("agfx", agfl(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == je.agfc("agfy", agez(int ), (int)10)) break;
            v4 /* !! */  = (long)je.agfc("agfz", agez(int ), (int)11);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = je.bx - je.agfc("agga", agfl(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == je.agfc("aggb", agez(int ), (int)12)) break;
            v5 /* !! */  = (long)je.agfc("aggc", agez(int ), (int)13);
        }
        this.markers.clear();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)je.agfc("aggd", agez(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl60:
            // 3 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)je.agfc("agge", agez(int ), (int)15);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)je.agfc("aggf", agez(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)je.agfc("aggg", agez(int ), (int)17);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
lbl73:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)je.agfc("aggh", agez(int ), (int)18);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)je.agfc("aggi", agez(int ), (int)19);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void agrz() {
        je.agfn[0] = 316326797477662974L;
        je.agfn[1] = -5166985684428221732L;
        je.agfn[2] = 9037464005511498300L;
        je.agfn[3] = 6935851824319368355L;
        je.agfn[4] = -4203146638671997293L;
        je.agfn[5] = -682025905277455381L;
        je.agfn[6] = -1523399322697700919L;
        je.agfn[7] = 2092776437194572205L;
        je.agfn[8] = -8524550843178920938L;
        je.agfn[9] = -8414236022915472385L;
        je.agfn[10] = -1019828296231248882L;
        je.agfn[11] = -3144282313898302117L;
        je.agfn[12] = -4484788052954893102L;
        je.agfn[13] = 3743193393309345801L;
        je.agfn[14] = -3358540266999221818L;
        je.agfn[15] = 5951344065119515669L;
        je.agfn[16] = -6751342580713070913L;
        je.agfn[17] = -1106005341255062072L;
        je.agfn[18] = -898020168380295028L;
        je.agfn[19] = -1357638292845385461L;
        je.agfn[20] = 2999180244653291836L;
        je.agfn[21] = 8177718003190978050L;
        je.agfn[22] = -1073459637033098957L;
        je.agfn[23] = -6716940583885408897L;
        je.agfn[24] = -5468892657899957958L;
        je.agfn[25] = -7713439992122801457L;
        je.agfn[26] = 8788888869963572573L;
        je.agfn[27] = -4107437035549881752L;
        je.agfn[28] = 2150292956503119650L;
        je.agfn[29] = 6911496451834800367L;
        je.agfn[30] = -6268175174168301044L;
        je.agfn[31] = -7317910555019995212L;
        je.agfn[32] = -3638906219983511081L;
        je.agfn[33] = -2805964692360257628L;
        je.agfn[34] = -4464979500823367749L;
        je.agfn[35] = 5411675965103751291L;
        je.agfn[36] = 4529864952847935159L;
        je.agfn[37] = 1442012525895681037L;
        je.agfn[38] = -5740176366105809507L;
        je.agfn[39] = 821174372931236896L;
        je.agfn[40] = -4798975494215809406L;
        je.agfn[41] = -1140490778875630672L;
        je.agfn[42] = 34677460489209955L;
        je.agfn[43] = -8816562134560307568L;
        je.agfn[44] = -2351712314345217506L;
        je.agfn[45] = 2421258243307249051L;
        je.agfn[46] = -7084690970615278841L;
        je.agfn[47] = 8533662797582479684L;
        je.agfn[48] = -4422308254769693892L;
        je.agfn[49] = 545301462163116362L;
        je.agfn[50] = 35497930734013726L;
        je.agfn[51] = 6978361269906380214L;
        je.agfn[52] = -1773095031173028389L;
        je.agfn[53] = -1988326973468176404L;
        je.agfn[54] = -3261760012124970939L;
        je.agfn[55] = 4807148648379628135L;
        je.agfn[56] = 6772852162738820271L;
        je.agfn[57] = -3300806759944848831L;
        je.agfn[58] = 8602339429097506225L;
        je.agfn[59] = 437663661399790510L;
        je.agfn[60] = 3854359229324263340L;
        je.agfn[61] = -135935639512971990L;
        je.agfn[62] = 64724705673182468L;
        je.agfn[63] = 8032494892209123875L;
        je.agfn[64] = -7421477208157835514L;
        je.agfn[65] = 3546309586277295412L;
        je.agfn[66] = -1227280729506961085L;
        je.agfn[67] = -2027946333326007955L;
        je.agfn[68] = 4386369941451919102L;
        je.agfn[69] = 5508753164481429354L;
        je.agfn[70] = 2746072340407127500L;
        je.agfn[71] = 8983447825748934538L;
        je.agfn[72] = 6228192847957984617L;
        je.agfn[73] = -1270527326340205987L;
        je.agfn[74] = 6137949321781730265L;
        je.agfn[75] = -1117416732684884120L;
        je.agfn[76] = -6315124052360657190L;
        je.agfn[77] = 2145036447125289030L;
        je.agfn[78] = -728588504487535743L;
        je.agfn[79] = -1416913890900325227L;
        je.agfn[80] = 7418382170482527205L;
        je.agfn[81] = -3803080432074760284L;
        je.agfn[82] = -4925709045130567540L;
        je.agfn[83] = -7951606257144191382L;
        je.agfn[84] = 4082845214517154194L;
        je.agfn[85] = -6471179523139575145L;
        je.agfn[86] = -3803589478525517585L;
        je.agfn[87] = -6595434489709397158L;
        je.agfn[88] = 8016941920870921613L;
        je.agfn[89] = -7565805554592629599L;
        je.agfn[90] = -974350449664135116L;
        je.agfn[91] = 6318340500065165550L;
        je.agfn[92] = -1892651564984919164L;
        je.agfn[93] = -7685695073444338101L;
        je.agfn[94] = 3522256120724247284L;
        je.agfn[95] = -820268121949868325L;
        je.agfn[96] = -3404375464897032038L;
        je.agfn[97] = -920642315432948718L;
        je.agfn[98] = -533568335371838426L;
        je.agfn[99] = 7924022185850473151L;
    }

    private static /* synthetic */ void agru() {
        je.agfb[0] = -2003486770;
        je.agfb[1] = 1509237499;
        je.agfb[2] = -2075894311;
        je.agfb[3] = 302667241;
        je.agfb[4] = -414946464;
        je.agfb[5] = 9402266;
        je.agfb[6] = -2080236190;
        je.agfb[7] = -2068362533;
        je.agfb[8] = 497380803;
        je.agfb[9] = 406433091;
        je.agfb[10] = -788913191;
        je.agfb[11] = 876593909;
        je.agfb[12] = -1410138340;
        je.agfb[13] = -1604831476;
        je.agfb[14] = -1263644918;
        je.agfb[15] = 825005015;
        je.agfb[16] = 1110108566;
        je.agfb[17] = 121140475;
        je.agfb[18] = 649241862;
        je.agfb[19] = -1066824353;
        je.agfb[20] = 1806395865;
        je.agfb[21] = -143365812;
        je.agfb[22] = -1751591330;
        je.agfb[23] = -371076301;
        je.agfb[24] = -1905694297;
        je.agfb[25] = -1436862434;
        je.agfb[26] = -1428938125;
        je.agfb[27] = -1331720598;
        je.agfb[28] = -882122432;
        je.agfb[29] = 200787245;
        je.agfb[30] = -1761210666;
        je.agfb[31] = 937323583;
        je.agfb[32] = -1762495326;
        je.agfb[33] = 549463260;
        je.agfb[34] = 793926267;
        je.agfb[35] = -694408855;
        je.agfb[36] = 1767475650;
        je.agfb[37] = 1616212495;
        je.agfb[38] = -1898718203;
        je.agfb[39] = -1217059501;
        je.agfb[40] = 1285229451;
        je.agfb[41] = -465801510;
        je.agfb[42] = 462071403;
        je.agfb[43] = 203772907;
        je.agfb[44] = 1793710374;
        je.agfb[45] = 1353907322;
        je.agfb[46] = -1611312167;
        je.agfb[47] = 1866856634;
        je.agfb[48] = -251763332;
        je.agfb[49] = -1940873592;
        je.agfb[50] = -1137075501;
        je.agfb[51] = 1036222260;
        je.agfb[52] = 1259293432;
        je.agfb[53] = 995065195;
        je.agfb[54] = -681668192;
        je.agfb[55] = 2103968848;
        je.agfb[56] = 895940086;
        je.agfb[57] = 1957416909;
        je.agfb[58] = -1808717249;
        je.agfb[59] = -285903766;
        je.agfb[60] = -644742620;
        je.agfb[61] = 40532705;
        je.agfb[62] = 443203379;
        je.agfb[63] = -809106661;
        je.agfb[64] = 218661915;
        je.agfb[65] = 1963203547;
        je.agfb[66] = 1829171683;
        je.agfb[67] = 159680878;
        je.agfb[68] = -433147603;
        je.agfb[69] = 2136200764;
        je.agfb[70] = 341634453;
        je.agfb[71] = -1855240216;
        je.agfb[72] = 374989673;
        je.agfb[73] = -1131822760;
        je.agfb[74] = 2129814640;
        je.agfb[75] = -1078607936;
        je.agfb[76] = 526027027;
        je.agfb[77] = -2119732484;
        je.agfb[78] = 1186555717;
        je.agfb[79] = -425350413;
        je.agfb[80] = -492509493;
        je.agfb[81] = -210479307;
        je.agfb[82] = -1992898345;
        je.agfb[83] = -1162504735;
        je.agfb[84] = 787785485;
        je.agfb[85] = 395944866;
        je.agfb[86] = -766912028;
        je.agfb[87] = -2120990059;
        je.agfb[88] = -398279546;
        je.agfb[89] = -204155114;
        je.agfb[90] = 1595823262;
        je.agfb[91] = 1737909451;
        je.agfb[92] = -1055519054;
        je.agfb[93] = 1335661414;
        je.agfb[94] = 1417778167;
        je.agfb[95] = 475415018;
        je.agfb[96] = 1629473991;
        je.agfb[97] = -1185365885;
        je.agfb[98] = 364739359;
        je.agfb[99] = 1603853360;
    }

    private static /* synthetic */ float aggl(int n2) {
        return Float.intBitsToFloat(agfa[n2] ^ agfb[n2]);
    }

    private static /* synthetic */ void agrv() {
        je.agfb[100] = 865045201;
        je.agfb[101] = 339842964;
        je.agfb[102] = -2118825730;
        je.agfb[103] = 125980742;
        je.agfb[104] = -1195527773;
        je.agfb[105] = 433488433;
        je.agfb[106] = 102661218;
        je.agfb[107] = -747980124;
        je.agfb[108] = -2129912305;
        je.agfb[109] = 641337960;
        je.agfb[110] = -1190203204;
        je.agfb[111] = 1786146361;
        je.agfb[112] = 1418902527;
        je.agfb[113] = 27840407;
        je.agfb[114] = -1350087899;
        je.agfb[115] = 212155788;
        je.agfb[116] = -99054640;
        je.agfb[117] = -874729646;
        je.agfb[118] = 2000171084;
        je.agfb[119] = 959018873;
        je.agfb[120] = -653382055;
        je.agfb[121] = -464699436;
        je.agfb[122] = 152587697;
        je.agfb[123] = 1789439087;
        je.agfb[124] = 231254898;
        je.agfb[125] = 1658231727;
        je.agfb[126] = -1440232681;
        je.agfb[127] = -324603079;
        je.agfb[128] = 1993564656;
        je.agfb[129] = 313100378;
        je.agfb[130] = 1655593013;
        je.agfb[131] = -1765309445;
        je.agfb[132] = -138931417;
        je.agfb[133] = -1316948629;
        je.agfb[134] = 1413156317;
        je.agfb[135] = 339078279;
        je.agfb[136] = 2067636912;
        je.agfb[137] = 89373445;
        je.agfb[138] = -765543072;
        je.agfb[139] = -1233275409;
        je.agfb[140] = 1953271403;
        je.agfb[141] = -356562034;
        je.agfb[142] = 1269912111;
        je.agfb[143] = -1111601318;
        je.agfb[144] = -1793826105;
        je.agfb[145] = 419384485;
        je.agfb[146] = -963040827;
        je.agfb[147] = 1353863707;
        je.agfb[148] = 176009024;
        je.agfb[149] = -1122940077;
        je.agfb[150] = 995460548;
        je.agfb[151] = -1495371009;
        je.agfb[152] = -240632023;
        je.agfb[153] = 736296832;
        je.agfb[154] = -918848418;
        je.agfb[155] = -944917274;
        je.agfb[156] = 70097579;
        je.agfb[157] = 1717359271;
        je.agfb[158] = -1440281866;
        je.agfb[159] = 797290644;
        je.agfb[160] = 702288909;
        je.agfb[161] = 584430625;
        je.agfb[162] = -89083953;
        je.agfb[163] = -1090773394;
        je.agfb[164] = 18238802;
        je.agfb[165] = 393415878;
        je.agfb[166] = 2056350525;
        je.agfb[167] = -1616297301;
        je.agfb[168] = 1058764688;
        je.agfb[169] = 716599797;
        je.agfb[170] = 1860780647;
        je.agfb[171] = 261844641;
        je.agfb[172] = 1628809687;
        je.agfb[173] = 62545550;
        je.agfb[174] = 1996144415;
        je.agfb[175] = 1080325201;
        je.agfb[176] = 1584114927;
        je.agfb[177] = -677191796;
        je.agfb[178] = 1568273828;
        je.agfb[179] = 2103139147;
        je.agfb[180] = -2103999934;
        je.agfb[181] = -1362600211;
        je.agfb[182] = 43352641;
        je.agfb[183] = -1702611372;
        je.agfb[184] = -2689820;
        je.agfb[185] = 712245999;
        je.agfb[186] = 1130672976;
        je.agfb[187] = -981365211;
        je.agfb[188] = -1327092429;
        je.agfb[189] = 1882627292;
        je.agfb[190] = -557752277;
        je.agfb[191] = 415345976;
        je.agfb[192] = -956468646;
        je.agfb[193] = 1144849091;
        je.agfb[194] = 1035588299;
        je.agfb[195] = 757321834;
        je.agfb[196] = 1829054386;
        je.agfb[197] = 526713469;
        je.agfb[198] = 1470128596;
        je.agfb[199] = -1820065188;
    }

    private static /* synthetic */ int agez(int n2) {
        return agfa[n2] ^ agfb[n2];
    }

    public static /* synthetic */ CallSite agfc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void agrw() {
        je.agfb[200] = -536738903;
        je.agfb[201] = -1267516304;
        je.agfb[202] = -214682978;
        je.agfb[203] = 1241541136;
        je.agfb[204] = -468337647;
        je.agfb[205] = 1903207302;
        je.agfb[206] = -786363216;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int withAlpha(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = je.bx - je.agfc("agqt", agfl(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == je.agfc("agqu", agez(int ), (int)195)) break;
            v0 /* !! */  = (long)je.agfc("agqv", agez(int ), (int)196);
        }
        var4_2 = je.c;
        v1 /* !! */  = je.bx;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - je.agfc("agqw", agfl(int ), (int)103));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2075519259: {
                    break block23;
                }
                case -1502033538: {
                    v2 = je.agfc("agqx", agfl(int ), (int)104);
                    continue block23;
                }
                case 1156729756: {
                    v2 = je.agfc("agqy", agfl(int ), (int)105);
                    continue block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = je.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = je.bx - je.agfc("agqz", agfl(int ), (int)106)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == je.agfc("agra", agez(int ), (int)197)) break;
            v3 /* !! */  = (long)je.agfc("agrb", agez(int ), (int)198);
        }
        var2_4 = je.a;
        if (var4_2) {
            throw null;
            return (int)je.agfc("agrc", agez(int ), (int)199);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 = je.agfc("agrd", agez(int ), (int)200);
                v5 = je.agfc("agre", agez(int ), (int)201);
                v6 /* !! */  = je.bx;
                if (true) ** GOTO lbl43
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - je.agfc("agrf", agfl(int ), (int)107));
lbl43:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2075519259: {
                            break block26;
                        }
                        case -2008726750: {
                            v7 = je.agfc("agrg", agfl(int ), (int)108);
                            continue block26;
                        }
                        case 221022690: {
                            v7 = je.agfc("agrh", agfl(int ), (int)109);
                            continue block26;
                        }
                        case 1107081547: {
                            v7 = je.agfc("agri", agfl(int ), (int)110);
                            continue block26;
                        }
                    }
                    break;
                }
                v8 = Math.min((int)v5, var1_1);
                v9 /* !! */  = je.bx;
                if (true) ** GOTO lbl60
                block27: while (true) {
                    v9 /* !! */  = (long)(v10 - je.agfc("agrj", agfl(int ), (int)111));
lbl60:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2075519259: {
                            break block27;
                        }
                        case -1998721470: {
                            v10 = je.agfc("agrk", agfl(int ), (int)112);
                            continue block27;
                        }
                        case -516327462: {
                            v10 = je.agfc("agrl", agfl(int ), (int)113);
                            continue block27;
                        }
                    }
                    break;
                }
                return Math.max((int)v4, v8) << je.agfc("agrm", agez(int ), (int)202) | var0;
            }
lbl70:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)je.agfc("agrn", agez(int ), (int)203);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)je.agfc("agro", agez(int ), (int)204);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)je.agfc("agrp", agez(int ), (int)205);
                    if (!var4_2) ** GOTO lbl70
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)je.agfc("agrq", agez(int ), (int)206);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double aggj(int n2) {
        return Double.longBitsToDouble(agfm[n2] ^ agfn[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldLoad(di var1_1) {
        v0 /* !! */  = je.bx;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - je.agfc("aglc", agfl(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2075519259: {
                    break block24;
                }
                case 491677610: {
                    v1 = je.agfc("agld", agfl(int ), (int)50);
                    continue block24;
                }
                case 775619387: {
                    v1 = je.agfc("agle", agfl(int ), (int)51);
                    continue block24;
                }
                case 1761292131: {
                    v1 = je.agfc("aglf", agfl(int ), (int)52);
                    continue block24;
                }
            }
            break;
        }
        var4_2 = je.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = je.bx - je.agfc("aglg", agfl(int ), (int)53)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == je.agfc("aglh", agez(int ), (int)101)) break;
            v2 /* !! */  = (long)je.agfc("agli", agez(int ), (int)102);
        }
        var3_3 /* !! */  = je.b;
        v3 /* !! */  = je.bx;
        if (true) ** GOTO lbl28
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - je.agfc("aglj", agfl(int ), (int)54));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2075519259: {
                    break block26;
                }
                case -1354907183: {
                    v4 = je.agfc("aglk", agfl(int ), (int)55);
                    continue block26;
                }
                case -1127297258: {
                    v4 = je.agfc("agll", agfl(int ), (int)56);
                    continue block26;
                }
                case -622354502: {
                    v4 = je.agfc("aglm", agfl(int ), (int)57);
                    continue block26;
                }
            }
            break;
        }
        var2_4 = je.a;
        if (var4_2) {
            throw null;
lbl43:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        v5 /* !! */  = je.bx;
        if (true) ** GOTO lbl50
        block28: while (true) {
            v5 /* !! */  = (long)(je.agfc("aglo", agfl(int ), (int)59) - je.agfc("agln", agfl(int ), (int)58));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2075519259: {
                    break block28;
                }
                case -1060768902: {
                    continue block28;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = je.bx - je.agfc("aglp", agfl(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == je.agfc("aglq", agez(int ), (int)103)) break;
            v6 /* !! */  = (long)je.agfc("aglr", agez(int ), (int)104);
        }
        this.markers.clear();
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)je.agfc("agls", agez(int ), (int)105);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)je.agfc("aglt", agez(int ), (int)106);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)je.agfc("aglu", agez(int ), (int)107);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)je.agfc("aglv", agez(int ), (int)108);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)je.agfc("aglw", agez(int ), (int)109);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)je.agfc("aglx", agez(int ), (int)110);
        ** while (!var4_2)
lbl93:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        v0 /* !! */  = je.bx;
        if (true) ** GOTO lbl5
        block83: while (true) {
            v0 /* !! */  = (long)(v1 - je.agfc("aghw", agfl(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2075519259: {
                    break block83;
                }
                case -1573793186: {
                    v1 = je.agfc("aghx", agfl(int ), (int)11);
                    continue block83;
                }
                case -1162937752: {
                    v1 = je.agfc("aghy", agfl(int ), (int)12);
                    continue block83;
                }
                case -846682041: {
                    v1 = je.agfc("aghz", agfl(int ), (int)13);
                    continue block83;
                }
            }
            break;
        }
        var8_2 = je.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = je.bx - je.agfc("agia", agfl(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == je.agfc("agib", agez(int ), (int)56)) break;
            v2 /* !! */  = (long)je.agfc("agic", agez(int ), (int)57);
        }
        var7_3 /* !! */  = je.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = je.bx - je.agfc("agid", agfl(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == je.agfc("agie", agez(int ), (int)58)) break;
            v3 /* !! */  = (long)je.agfc("agif", agez(int ), (int)59);
        }
        var6_4 = je.a;
        if (var8_2) {
            throw null;
lbl32:
            // 14 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl32
        v4 /* !! */  = je.bx;
        if (true) ** GOTO lbl39
        block87: while (true) {
            v4 /* !! */  = (long)(v5 - je.agfc("agig", agfl(int ), (int)16));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2075519259: {
                    break block87;
                }
                case -73508034: {
                    v5 = je.agfc("agih", agfl(int ), (int)17);
                    continue block87;
                }
                case 265113482: {
                    v5 = je.agfc("agii", agfl(int ), (int)18);
                    continue block87;
                }
                case 1807908650: {
                    v5 = je.agfc("agij", agfl(int ), (int)19);
                    continue block87;
                }
            }
            break;
        }
        var2_5 = System.currentTimeMillis();
        if (var6_4 || var6_4) ** GOTO lbl32
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = je.bx - je.agfc("agik", agfl(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == je.agfc("agil", agez(int ), (int)60)) break;
            v6 /* !! */  = (long)je.agfc("agim", agez(int ), (int)61);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = je.bx - je.agfc("agin", agfl(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == je.agfc("agio", agez(int ), (int)62)) break;
            v7 /* !! */  = (long)je.agfc("agip", agez(int ), (int)63);
        }
        var4_6 = this.markers.iterator();
        if (var6_4) ** GOTO lbl32
        block90: while (true) lbl-1000:
        // 4 sources

        {
            block128: {
                block127: {
                    if (var6_4 || var6_4) ** GOTO lbl32
                    v8 /* !! */  = je.bx;
                    if (true) ** GOTO lbl71
                    block91: while (true) {
                        v8 /* !! */  = (long)(je.agfc("agir", agfl(int ), (int)23) - je.agfc("agiq", agfl(int ), (int)22));
lbl71:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -2075519259: {
                                break block91;
                            }
                            case 813205001: {
                                continue block91;
                            }
                        }
                        break;
                    }
                    if (!var4_6.hasNext()) ** GOTO lbl215
                    if (var6_4 || var6_4) ** GOTO lbl32
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = je.bx - je.agfc("agis", agfl(int ), (int)24)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == je.agfc("agit", agez(int ), (int)64)) break;
                        v9 /* !! */  = (long)je.agfc("agiu", agez(int ), (int)65);
                    }
                    var5_7 = var4_6.next();
                    if (var6_4 || var6_4) ** GOTO lbl32
                    v10 /* !! */  = je.bx;
                    if (true) ** GOTO lbl89
                    block93: while (true) {
                        v10 /* !! */  = (long)(je.agfc("agiw", agfl(int ), (int)26) - je.agfc("agiv", agfl(int ), (int)25));
lbl89:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -2075519259: {
                                break block93;
                            }
                            case 1047385666: {
                                continue block93;
                            }
                        }
                        break;
                    }
                    if (var2_5 - var5_7.createdAt < je.agfc("agix", agfl(int ), (int)27)) break block127;
                    if (var6_4 || var6_4) ** GOTO lbl32
                    v11 /* !! */  = je.bx;
                    if (true) ** GOTO lbl100
                    block94: while (true) {
                        v11 /* !! */  = (long)(je.agfc("agiz", agfl(int ), (int)29) - je.agfc("agiy", agfl(int ), (int)28));
lbl100:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -2075519259: {
                                break block94;
                            }
                            case 1777017228: {
                                continue block94;
                            }
                        }
                        break;
                    }
                    var4_6.remove();
                    if (var6_4 || var6_4) ** GOTO lbl32
                    if (!var8_2) ** GOTO lbl-1000
                    throw null;
                }
                if (var6_4 || var6_4) ** GOTO lbl32
                v12 /* !! */  = je.bx;
                if (true) ** GOTO lbl115
                block95: while (true) {
                    v12 /* !! */  = (long)(v13 - je.agfc("agja", agfl(int ), (int)30));
lbl115:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2075519259: {
                            break block95;
                        }
                        case -368283784: {
                            v13 = je.agfc("agjb", agfl(int ), (int)31);
                            continue block95;
                        }
                        case 1838565365: {
                            v13 = je.agfc("agjc", agfl(int ), (int)32);
                            continue block95;
                        }
                    }
                    break;
                }
                v14 = var5_7.position;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = je.bx - je.agfc("agjd", agfl(int ), (int)33)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == je.agfc("agje", agez(int ), (int)66)) break;
                    v15 /* !! */  = (long)je.agfc("agjf", agez(int ), (int)67);
                }
                v16 = v14.field_1352;
                v17 /* !! */  = je.bx;
                if (true) ** GOTO lbl135
                block97: while (true) {
                    v17 /* !! */  = (long)(je.agfc("agjh", agfl(int ), (int)35) - je.agfc("agjg", agfl(int ), (int)34));
lbl135:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -2075519259: {
                            break block97;
                        }
                        case 1687596780: {
                            continue block97;
                        }
                    }
                    break;
                }
                v18 = var5_7.position;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = je.bx - je.agfc("agji", agfl(int ), (int)36)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == je.agfc("agjj", agez(int ), (int)68)) break;
                    v19 /* !! */  = (long)je.agfc("agjk", agez(int ), (int)69);
                }
                v20 = v18.field_1351;
                v21 /* !! */  = je.bx;
                if (true) ** GOTO lbl151
                block99: while (true) {
                    v21 /* !! */  = (long)(je.agfc("agjm", agfl(int ), (int)38) - je.agfc("agjl", agfl(int ), (int)37));
lbl151:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2075519259: {
                            break block99;
                        }
                        case -255686026: {
                            continue block99;
                        }
                    }
                    break;
                }
                v22 = var5_7.position;
                v23 /* !! */  = je.bx;
                if (true) ** GOTO lbl161
                block100: while (true) {
                    v23 /* !! */  = (long)(v24 - je.agfc("agjn", agfl(int ), (int)39));
lbl161:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2075519259: {
                            break block100;
                        }
                        case -1552386055: {
                            v24 = je.agfc("agjo", agfl(int ), (int)40);
                            continue block100;
                        }
                        case -1304896498: {
                            v24 = je.agfc("agjp", agfl(int ), (int)41);
                            continue block100;
                        }
                    }
                    break;
                }
                v25 = v22.field_1350;
                v26 /* !! */  = je.bx;
                if (true) ** GOTO lbl175
                block101: while (true) {
                    v26 /* !! */  = (long)(v27 - je.agfc("agjq", agfl(int ), (int)42));
lbl175:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2075519259: {
                            break block101;
                        }
                        case -1660461394: {
                            v27 = je.agfc("agjr", agfl(int ), (int)43);
                            continue block101;
                        }
                        case -33654747: {
                            v27 = je.agfc("agjs", agfl(int ), (int)44);
                            continue block101;
                        }
                        case 782141602: {
                            v27 = je.agfc("agjt", agfl(int ), (int)45);
                            continue block101;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_7 = je.bx - je.agfc("agju", agfl(int ), (int)46)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == je.agfc("agjv", agez(int ), (int)70)) break;
                    v28 /* !! */  = (long)je.agfc("agjw", agez(int ), (int)71);
                }
                if (op.project(v16, v20, v25, this.projected)) break block128;
                if (var6_4 || var6_4) ** GOTO lbl32
                if (!var8_2) ** GOTO lbl-1000
                throw null;
            }
            if (var6_4) ** GOTO lbl32
            if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_4) ** GOTO lbl32
                    v29 /* !! */  = je.bx;
                    if (true) ** GOTO lbl206
                    block103: while (true) {
                        v29 /* !! */  = (long)(je.agfc("agjy", agfl(int ), (int)48) - je.agfc("agjx", agfl(int ), (int)47));
lbl206:
                        // 2 sources

                        switch ((int)v29 /* !! */ ) {
                            case -2075519259: {
                                break block103;
                            }
                            case 1161128157: {
                                continue block103;
                            }
                        }
                        break;
                    }
                    this.renderMarker(var1_1, var5_7, var2_5);
                    if (var6_4 || var6_4) ** GOTO lbl32
                    if (!var8_2) continue block90;
                    throw null;
                }
lbl215:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
lbl218:
                // 3 sources

                case 0: {
                    var7_3 /* !! */  = (int)je.agfc("agjz", agez(int ), (int)72);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl223:
                // 2 sources

                case 1: {
                    var7_3 /* !! */  = (int)je.agfc("agka", agez(int ), (int)73);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl278
                }
lbl228:
                // 4 sources

                case 2: {
                    var7_3 /* !! */  = (int)je.agfc("agkb", agez(int ), (int)74);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
                case 3: {
                    var7_3 /* !! */  = (int)je.agfc("agkc", agez(int ), (int)75);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
                case 4: {
                    var7_3 /* !! */  = (int)je.agfc("agkd", agez(int ), (int)76);
                    if (!var8_2) ** GOTO lbl223
                    throw null;
                }
                case 5: {
                    var7_3 /* !! */  = (int)je.agfc("agke", agez(int ), (int)77);
                    if (!var8_2) ** GOTO lbl218
                    throw null;
                }
                case 6: {
                    var7_3 /* !! */  = (int)je.agfc("agkf", agez(int ), (int)78);
                    if (!var8_2) break block90;
                    throw null;
                }
lbl250:
                // 2 sources

                case 7: {
                    var7_3 /* !! */  = (int)je.agfc("agkg", agez(int ), (int)79);
                    if (!var8_2) ** GOTO lbl228
                    throw null;
                }
lbl254:
                // 2 sources

                case 8: {
                    var7_3 /* !! */  = (int)je.agfc("agkh", agez(int ), (int)80);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl319
                }
lbl259:
                // 2 sources

                case 9: {
                    var7_3 /* !! */  = (int)je.agfc("agki", agez(int ), (int)81);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl294
                }
                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_3 /* !! */  = (int)je.agfc("agkj", agez(int ), (int)82);
                        if (!var8_2) ** GOTO lbl250
                        throw null;
                    }
                }
                case 11: {
                    var7_3 /* !! */  = (int)je.agfc("agkk", agez(int ), (int)83);
                    if (!var8_2) ** GOTO lbl228
                    throw null;
                }
                case 12: {
                    var7_3 /* !! */  = (int)je.agfc("agkl", agez(int ), (int)84);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl331
                }
lbl278:
                // 2 sources

                case 13: {
                    var7_3 /* !! */  = (int)je.agfc("agkm", agez(int ), (int)85);
                    if (!var8_2) break block90;
                    throw null;
                }
                case 14: {
                    var7_3 /* !! */  = (int)je.agfc("agkn", agez(int ), (int)86);
                    if (var8_2) {
                        throw null;
                    }
                }
lbl286:
                // 4 sources

                case 15: {
                    var7_3 /* !! */  = (int)je.agfc("agko", agez(int ), (int)87);
                    if (var8_2) {
                        throw null;
                    }
                }
lbl290:
                // 4 sources

                case 16: {
                    var7_3 /* !! */  = (int)je.agfc("agkp", agez(int ), (int)88);
                    if (!var8_2) ** GOTO lbl286
                    throw null;
                }
lbl294:
                // 4 sources

                case 17: {
                    var7_3 /* !! */  = (int)je.agfc("agkq", agez(int ), (int)89);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl307
                }
lbl299:
                // 2 sources

                case 18: {
                    var7_3 /* !! */  = (int)je.agfc("agkr", agez(int ), (int)90);
                    if (!var8_2) ** GOTO lbl254
                    throw null;
                }
                case 19: {
                    var7_3 /* !! */  = (int)je.agfc("agks", agez(int ), (int)91);
                    if (!var8_2) ** GOTO lbl259
                    throw null;
                }
lbl307:
                // 2 sources

                case 20: {
                    var7_3 /* !! */  = (int)je.agfc("agkt", agez(int ), (int)92);
                    if (!var8_2) ** GOTO lbl218
                    throw null;
                }
                case 21: {
                    var7_3 /* !! */  = (int)je.agfc("agku", agez(int ), (int)93);
                    if (!var8_2) ** GOTO lbl294
                    throw null;
                }
                case 22: {
                    var7_3 /* !! */  = (int)je.agfc("agkv", agez(int ), (int)94);
                    if (!var8_2) ** GOTO lbl299
                    throw null;
                }
lbl319:
                // 3 sources

                case 23: {
                    var7_3 /* !! */  = (int)je.agfc("agkw", agez(int ), (int)95);
                    if (!var8_2) break block90;
                    throw null;
                }
                case 24: {
                    var7_3 /* !! */  = (int)je.agfc("agkx", agez(int ), (int)96);
                    if (!var8_2) ** GOTO lbl228
                    throw null;
                }
                case 25: {
                    var7_3 /* !! */  = (int)je.agfc("agky", agez(int ), (int)97);
                    if (!var8_2) ** GOTO lbl290
                    throw null;
                }
lbl331:
                // 3 sources

                case 26: {
                    do {
                        var7_3 /* !! */  = (int)je.agfc("agkz", agez(int ), (int)98);
                    } while (!var8_2);
                    throw null;
                }
                case 27: {
                    var7_3 /* !! */  = (int)je.agfc("agla", agez(int ), (int)99);
                    if (!var8_2) break block90;
                    throw null;
                }
                case 28: 
            }
            break;
        }
        var7_3 /* !! */  = (int)je.agfc("aglb", agez(int ), (int)100);
        ** while (!var8_2)
lbl343:
        // 1 sources

        throw null;
    }

    static {
        agfa = new int[207];
        agfb = new int[207];
        je.agrr();
        je.agrs();
        je.agrt();
        je.agru();
        je.agrv();
        je.agrw();
        agfm = new long[114];
        agfn = new long[114];
        je.agrx();
        je.agry();
        je.agrz();
        je.agsa();
        ICON = new class_1799((class_1935)class_1802.field_8639);
    }

    private static /* synthetic */ void agrr() {
        je.agfa[0] = -2003486769;
        je.agfa[1] = 1509237499;
        je.agfa[2] = -2075894312;
        je.agfa[3] = 302667240;
        je.agfa[4] = -414946461;
        je.agfa[5] = 9402271;
        je.agfa[6] = -2080236188;
        je.agfa[7] = -2068362530;
        je.agfa[8] = 497380802;
        je.agfa[9] = 1065425485;
        je.agfa[10] = 788913190;
        je.agfa[11] = -442990932;
        je.agfa[12] = 1410138339;
        je.agfa[13] = 0x1EEE1212;
        je.agfa[14] = -1263644918;
        je.agfa[15] = 825005014;
        je.agfa[16] = 1110108562;
        je.agfa[17] = 121140478;
        je.agfa[18] = 649241859;
        je.agfa[19] = -1066824357;
        je.agfa[20] = 1449633044;
        je.agfa[21] = -143365823;
        je.agfa[22] = -1751591332;
        je.agfa[23] = -371076310;
        je.agfa[24] = -1905694291;
        je.agfa[25] = -1436862454;
        je.agfa[26] = -1428938113;
        je.agfa[27] = -1331720595;
        je.agfa[28] = -882122399;
        je.agfa[29] = 200787247;
        je.agfa[30] = -1761210633;
        je.agfa[31] = 937323550;
        je.agfa[32] = -1762495317;
        je.agfa[33] = 549463233;
        je.agfa[34] = 793926263;
        je.agfa[35] = -694408863;
        je.agfa[36] = 1767475670;
        je.agfa[37] = 1616212525;
        je.agfa[38] = -1898718205;
        je.agfa[39] = -1217059503;
        je.agfa[40] = 1285229457;
        je.agfa[41] = -465801519;
        je.agfa[42] = 462071401;
        je.agfa[43] = 203772926;
        je.agfa[44] = 1793710370;
        je.agfa[45] = 1353907322;
        je.agfa[46] = -1611312183;
        je.agfa[47] = 1866856611;
        je.agfa[48] = -251763363;
        je.agfa[49] = -1940873576;
        je.agfa[50] = -1137075497;
        je.agfa[51] = 1036222257;
        je.agfa[52] = 1259293422;
        je.agfa[53] = 995065191;
        je.agfa[54] = -681668175;
        je.agfa[55] = 2103968849;
        je.agfa[56] = 895940087;
        je.agfa[57] = 1036989457;
        je.agfa[58] = -1808717250;
        je.agfa[59] = -466814500;
        je.agfa[60] = 644742619;
        je.agfa[61] = -898109576;
        je.agfa[62] = -443203380;
        je.agfa[63] = 1528447429;
        je.agfa[64] = -218661916;
        je.agfa[65] = -407712965;
        je.agfa[66] = -1829171684;
        je.agfa[67] = -1201123723;
        je.agfa[68] = -433147604;
        je.agfa[69] = 712864160;
        je.agfa[70] = 341634452;
        je.agfa[71] = 10343347;
        je.agfa[72] = 374989679;
        je.agfa[73] = -1131822766;
        je.agfa[74] = 2129814649;
        je.agfa[75] = -1078607929;
        je.agfa[76] = 526027023;
        je.agfa[77] = -2119732503;
        je.agfa[78] = 1186555712;
        je.agfa[79] = -425350422;
        je.agfa[80] = -492509477;
        je.agfa[81] = -210479302;
        je.agfa[82] = -1992898337;
        je.agfa[83] = -1162504725;
        je.agfa[84] = 787785473;
        je.agfa[85] = 395944875;
        je.agfa[86] = -766912003;
        je.agfa[87] = -2120990078;
        je.agfa[88] = -398279537;
        je.agfa[89] = -204155129;
        je.agfa[90] = 1595823241;
        je.agfa[91] = 1737909464;
        je.agfa[92] = -1055519062;
        je.agfa[93] = 1335661426;
        je.agfa[94] = 1417778149;
        je.agfa[95] = 475415030;
        je.agfa[96] = 1629473984;
        je.agfa[97] = -1185365886;
        je.agfa[98] = 364739354;
        je.agfa[99] = 1603853350;
    }

    private static /* synthetic */ void agrs() {
        je.agfa[100] = 865045185;
        je.agfa[101] = 339842965;
        je.agfa[102] = 507681830;
        je.agfa[103] = -125980743;
        je.agfa[104] = 67796717;
        je.agfa[105] = 433488437;
        je.agfa[106] = 102661219;
        je.agfa[107] = -747980121;
        je.agfa[108] = -2129912308;
        je.agfa[109] = 641337960;
        je.agfa[110] = -1190203203;
        je.agfa[111] = 1786146361;
        je.agfa[112] = 337820671;
        je.agfa[113] = 1076678551;
        je.agfa[114] = -289977563;
        je.agfa[115] = 1301626252;
        je.agfa[116] = -99450402;
        je.agfa[117] = -1998278830;
        je.agfa[118] = 2000171084;
        je.agfa[119] = 115963769;
        je.agfa[120] = -422695335;
        je.agfa[121] = -1521664044;
        je.agfa[122] = 1213746609;
        je.agfa[123] = 715415714;
        je.agfa[124] = 221729933;
        je.agfa[125] = 564763567;
        je.agfa[126] = -1440232681;
        je.agfa[127] = -324603095;
        je.agfa[128] = 1993564668;
        je.agfa[129] = 313100374;
        je.agfa[130] = 1655593015;
        je.agfa[131] = -1765309470;
        je.agfa[132] = -138931419;
        je.agfa[133] = -1316948630;
        je.agfa[134] = 1413156312;
        je.agfa[135] = 339078290;
        je.agfa[136] = 2067636898;
        je.agfa[137] = 89373463;
        je.agfa[138] = -765543064;
        je.agfa[139] = -1233275410;
        je.agfa[140] = 1953271405;
        je.agfa[141] = -356562026;
        je.agfa[142] = 1269912122;
        je.agfa[143] = -1111601331;
        je.agfa[144] = -1793826091;
        je.agfa[145] = 419384507;
        je.agfa[146] = -963040802;
        je.agfa[147] = 1353863738;
        je.agfa[148] = 176009025;
        je.agfa[149] = -1122940088;
        je.agfa[150] = 995460568;
        je.agfa[151] = -1495371010;
        je.agfa[152] = -240632003;
        je.agfa[153] = 736296836;
        je.agfa[154] = -918848436;
        je.agfa[155] = -944917305;
        je.agfa[156] = 70097582;
        je.agfa[157] = 1717359285;
        je.agfa[158] = -1440281883;
        je.agfa[159] = 797290636;
        je.agfa[160] = 702288898;
        je.agfa[161] = 584430624;
        je.agfa[162] = -89083954;
        je.agfa[163] = 1328244029;
        je.agfa[164] = -18238803;
        je.agfa[165] = -469620005;
        je.agfa[166] = 990997309;
        je.agfa[167] = 1616297300;
        je.agfa[168] = 297256962;
        je.agfa[169] = 716599796;
        je.agfa[170] = -1462189177;
        je.agfa[171] = 261844641;
        je.agfa[172] = 1628809687;
        je.agfa[173] = 62545551;
        je.agfa[174] = 1270138986;
        je.agfa[175] = 1080325211;
        je.agfa[176] = 1584114917;
        je.agfa[177] = -677191777;
        je.agfa[178] = 1568273834;
        je.agfa[179] = 2103139137;
        je.agfa[180] = -2103999918;
        je.agfa[181] = -1362600219;
        je.agfa[182] = 43352640;
        je.agfa[183] = -1702611362;
        je.agfa[184] = -2689804;
        je.agfa[185] = 712245995;
        je.agfa[186] = 1130672984;
        je.agfa[187] = -981365202;
        je.agfa[188] = -1327092423;
        je.agfa[189] = 1882627276;
        je.agfa[190] = -557752278;
        je.agfa[191] = 415345981;
        je.agfa[192] = -956468652;
        je.agfa[193] = 1144849097;
        je.agfa[194] = 1035588297;
        je.agfa[195] = -757321835;
        je.agfa[196] = 443204308;
        je.agfa[197] = -526713470;
        je.agfa[198] = -1145576617;
        je.agfa[199] = 293488850;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItem(bu var1_1, float var2_2, float var3_3, float var4_4) {
        v0 /* !! */  = je.bx;
        if (true) ** GOTO lbl5
        block77: while (true) {
            v0 /* !! */  = (long)(v1 - je.agfc("agnz", agfl(int ), (int)64));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2075519259: {
                    break block77;
                }
                case -1709444871: {
                    v1 = je.agfc("agoa", agfl(int ), (int)65);
                    continue block77;
                }
                case 385766251: {
                    v1 = je.agfc("agob", agfl(int ), (int)66);
                    continue block77;
                }
            }
            break;
        }
        var10_5 = je.c;
        v2 /* !! */  = je.bx;
        if (true) ** GOTO lbl19
        block78: while (true) {
            v2 /* !! */  = (long)(v3 - je.agfc("agoc", agfl(int ), (int)67));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2075519259: {
                    break block78;
                }
                case -1763812031: {
                    v3 = je.agfc("agod", agfl(int ), (int)68);
                    continue block78;
                }
                case -201282802: {
                    v3 = je.agfc("agoe", agfl(int ), (int)69);
                    continue block78;
                }
                case 1749008063: {
                    v3 = je.agfc("agof", agfl(int ), (int)70);
                    continue block78;
                }
            }
            break;
        }
        var9_6 /* !! */  = je.b;
        v4 /* !! */  = je.bx;
        if (true) ** GOTO lbl36
        block79: while (true) {
            v4 /* !! */  = (long)(v5 - je.agfc("agog", agfl(int ), (int)71));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2075519259: {
                    break block79;
                }
                case -76703035: {
                    v5 = je.agfc("agoh", agfl(int ), (int)72);
                    continue block79;
                }
                case 1297220143: {
                    v5 = je.agfc("agoi", agfl(int ), (int)73);
                    continue block79;
                }
                case 2073612693: {
                    v5 = je.agfc("agoj", agfl(int ), (int)74);
                    continue block79;
                }
            }
            break;
        }
        var8_7 = je.a;
        if (var10_5) {
            throw null;
lbl51:
            // 10 sources

            return;
        }
        if (var8_7 || var8_7) ** GOTO lbl51
        v6 = je.agfc("agok", agez(int ), (int)161);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = je.bx - je.agfc("agol", agfl(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == je.agfc("agom", agez(int ), (int)162)) break;
            v7 /* !! */  = (long)je.agfc("agon", agez(int ), (int)163);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = je.bx - je.agfc("agoo", agfl(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == je.agfc("agop", agez(int ), (int)164)) break;
            v8 /* !! */  = (long)je.agfc("agoq", agez(int ), (int)165);
        }
        v9 = je.mc.method_22683();
        v10 /* !! */  = je.bx;
        if (true) ** GOTO lbl70
        block83: while (true) {
            v10 /* !! */  = (long)(je.agfc("agos", agfl(int ), (int)78) - je.agfc("agor", agfl(int ), (int)77));
lbl70:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2075519259: {
                    break block83;
                }
                case -878979361: {
                    continue block83;
                }
            }
            break;
        }
        v11 = v9.method_4495();
        v12 /* !! */  = je.bx;
        if (true) ** GOTO lbl80
        block84: while (true) {
            v12 /* !! */  = (long)(je.agfc("agou", agfl(int ), (int)80) - je.agfc("agot", agfl(int ), (int)79));
lbl80:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2075519259: {
                    break block84;
                }
                case -1097642093: {
                    continue block84;
                }
            }
            break;
        }
        var5_8 = 2.0f / (float)Math.max((int)v6, v11);
        if (var8_7 || var8_7) ** GOTO lbl51
        var6_9 = var4_4 * var5_8 / je.agfc("agov", aggl(int ), (int)166);
        if (var8_7 || var8_7) ** GOTO lbl51
        v13 /* !! */  = je.bx;
        if (true) ** GOTO lbl93
        block85: while (true) {
            v13 /* !! */  = (long)(v14 - je.agfc("agow", agfl(int ), (int)81));
lbl93:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2075519259: {
                    break block85;
                }
                case -775856486: {
                    v14 = je.agfc("agox", agfl(int ), (int)82);
                    continue block85;
                }
                case -632192616: {
                    v14 = je.agfc("agoy", agfl(int ), (int)83);
                    continue block85;
                }
            }
            break;
        }
        v15 = var1_1.getDrawContext();
        v16 /* !! */  = je.bx;
        if (true) ** GOTO lbl107
        block86: while (true) {
            v16 /* !! */  = (long)(je.agfc("agpa", agfl(int ), (int)85) - je.agfc("agoz", agfl(int ), (int)84));
lbl107:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -2075519259: {
                    break block86;
                }
                case 952353224: {
                    continue block86;
                }
            }
            break;
        }
        var7_10 = v15.method_51448();
        if (var8_7 || var8_7) ** GOTO lbl51
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_2 = je.bx - je.agfc("agpb", agfl(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == je.agfc("agpc", agez(int ), (int)167)) break;
            v17 /* !! */  = (long)je.agfc("agpd", agez(int ), (int)168);
        }
        var7_10.pushMatrix();
        if (var8_7 || var8_7) ** GOTO lbl51
        v18 /* !! */  = je.bx;
        if (true) ** GOTO lbl125
        block88: while (true) {
            v18 /* !! */  = (long)(v19 - je.agfc("agpe", agfl(int ), (int)87));
lbl125:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -2075519259: {
                    break block88;
                }
                case -1665671425: {
                    v19 = je.agfc("agpf", agfl(int ), (int)88);
                    continue block88;
                }
                case 1017188982: {
                    v19 = je.agfc("agpg", agfl(int ), (int)89);
                    continue block88;
                }
                case 1868263442: {
                    v19 = je.agfc("agph", agfl(int ), (int)90);
                    continue block88;
                }
            }
            break;
        }
        var7_10.translate(var2_2 * var5_8, var3_3 * var5_8);
        if (var8_7 || var8_7) ** GOTO lbl51
        v20 /* !! */  = je.bx;
        if (true) ** GOTO lbl144
        block89: while (true) {
            v20 /* !! */  = (long)(v21 - je.agfc("agpi", agfl(int ), (int)91));
lbl144:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -2075519259: {
                    break block89;
                }
                case 31169481: {
                    v21 = je.agfc("agpj", agfl(int ), (int)92);
                    continue block89;
                }
                case 380108931: {
                    v21 = je.agfc("agpk", agfl(int ), (int)93);
                    continue block89;
                }
            }
            break;
        }
        var7_10.scale(var6_9, var6_9);
        if (var8_7 || var8_7) ** GOTO lbl51
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_3 = je.bx - je.agfc("agpl", agfl(int ), (int)94)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == je.agfc("agpm", agez(int ), (int)169)) break;
            v22 /* !! */  = (long)je.agfc("agpn", agez(int ), (int)170);
        }
        v23 = var1_1.getDrawContext();
        v24 /* !! */  = je.bx;
        if (true) ** GOTO lbl166
        block91: while (true) {
            v24 /* !! */  = (long)(v25 - je.agfc("agpo", agfl(int ), (int)95));
lbl166:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -2075519259: {
                    break block91;
                }
                case -1784216984: {
                    v25 = je.agfc("agpp", agfl(int ), (int)96);
                    continue block91;
                }
                case -444345996: {
                    v25 = je.agfc("agpq", agfl(int ), (int)97);
                    continue block91;
                }
                case 210568855: {
                    v25 = je.agfc("agpr", agfl(int ), (int)98);
                    continue block91;
                }
            }
            break;
        }
        v26 = je.agfc("agps", agez(int ), (int)171);
        v27 = je.agfc("agpt", agez(int ), (int)172);
        v28 /* !! */  = je.bx;
        if (true) ** GOTO lbl184
        block92: while (true) {
            v28 /* !! */  = (long)(je.agfc("agpv", agfl(int ), (int)100) - je.agfc("agpu", agfl(int ), (int)99));
lbl184:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -2075519259: {
                    break block92;
                }
                case 1426887937: {
                    continue block92;
                }
            }
            break;
        }
        v23.method_51427(je.ICON, (int)v26, (int)v27);
        if (var8_7 || var8_7) ** GOTO lbl51
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_4 = je.bx - je.agfc("agpw", agfl(int ), (int)101)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == je.agfc("agpx", agez(int ), (int)173)) break;
            v29 /* !! */  = (long)je.agfc("agpy", agez(int ), (int)174);
        }
        var7_10.popMatrix();
        if (var8_7) ** GOTO lbl51
        if (var9_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_7) ** break;
                ** continue;
                return;
            }
lbl204:
            // 3 sources

            case 0: {
                var9_6 /* !! */  = (int)je.agfc("agpz", agez(int ), (int)175);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl209:
            // 2 sources

            case 1: {
                var9_6 /* !! */  = (int)je.agfc("agqa", agez(int ), (int)176);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 2: {
                var9_6 /* !! */  = (int)je.agfc("agqb", agez(int ), (int)177);
                if (!var10_5) ** GOTO lbl204
                throw null;
            }
lbl218:
            // 2 sources

            case 3: {
                var9_6 /* !! */  = (int)je.agfc("agqc", agez(int ), (int)178);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl223:
            // 2 sources

            case 4: {
                var9_6 /* !! */  = (int)je.agfc("agqd", agez(int ), (int)179);
                if (!var10_5) ** GOTO lbl218
                throw null;
            }
lbl227:
            // 3 sources

            case 5: {
                var9_6 /* !! */  = (int)je.agfc("agqe", agez(int ), (int)180);
                if (!var10_5) ** GOTO lbl209
                throw null;
            }
            case 6: {
                var9_6 /* !! */  = (int)je.agfc("agqf", agez(int ), (int)181);
                if (!var10_5) ** GOTO lbl227
                throw null;
            }
lbl235:
            // 4 sources

            case 7: {
                var9_6 /* !! */  = (int)je.agfc("agqg", agez(int ), (int)182);
                if (!var10_5) ** GOTO lbl227
                throw null;
            }
            case 8: {
                var9_6 /* !! */  = (int)je.agfc("agqh", agez(int ), (int)183);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl244:
            // 3 sources

            case 9: {
                do {
                    var9_6 /* !! */  = (int)je.agfc("agqi", agez(int ), (int)184);
                } while (!var10_5);
                throw null;
            }
            case 10: {
                var9_6 /* !! */  = (int)je.agfc("agqj", agez(int ), (int)185);
                if (!var10_5) ** GOTO lbl244
                throw null;
            }
            case 11: {
                var9_6 /* !! */  = (int)je.agfc("agqk", agez(int ), (int)186);
                if (!var10_5) ** GOTO lbl223
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_6 /* !! */  = (int)je.agfc("agql", agez(int ), (int)187);
                    if (!var10_5) ** GOTO lbl235
                    throw null;
                }
            }
lbl262:
            // 2 sources

            case 13: {
                var9_6 /* !! */  = (int)je.agfc("agqm", agez(int ), (int)188);
                if (!var10_5) ** GOTO lbl235
                throw null;
            }
lbl266:
            // 2 sources

            case 14: {
                do {
                    var9_6 /* !! */  = (int)je.agfc("agqn", agez(int ), (int)189);
                } while (!var10_5);
                throw null;
            }
            case 15: {
                var9_6 /* !! */  = (int)je.agfc("agqo", agez(int ), (int)190);
                if (!var10_5) ** GOTO lbl235
                throw null;
            }
            case 16: {
                do {
                    var9_6 /* !! */  = (int)je.agfc("agqp", agez(int ), (int)191);
                } while (!var10_5);
                throw null;
            }
            case 17: {
                var9_6 /* !! */  = (int)je.agfc("agqq", agez(int ), (int)192);
                if (!var10_5) ** GOTO lbl266
                throw null;
            }
lbl284:
            // 3 sources

            case 18: {
                var9_6 /* !! */  = (int)je.agfc("agqr", agez(int ), (int)193);
                if (!var10_5) ** GOTO lbl204
                throw null;
            }
            case 19: 
        }
        var9_6 /* !! */  = (int)je.agfc("agqs", agez(int ), (int)194);
        ** while (!var10_5)
lbl291:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public je() {
        var2_1 /* !! */  = je.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block9: while (true) {
            block12: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super("FireworkESP", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043c\u0435\u0441\u0442\u043e \u0437\u0430\u043f\u0443\u0441\u043a\u0430 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", du.RENDER);
                        this.showTime = new kb("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u0432\u0440\u0435\u043c\u044f", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0442\u044c \u043e\u0441\u0442\u0430\u0432\u0448\u0435\u0435\u0441\u044f \u0432\u0440\u0435\u043c\u044f \u043c\u0430\u0440\u043a\u0435\u0440\u0430").setValue((boolean)je.agfc("agfd", agez(int ), (int)0));
                        this.markers = new ArrayList<je$FireworkMarker>();
                        this.projected = new Vector2f();
                        this.settings(new jx[]{this.showTime});
                        return;
                    }
                    case 5: {
                        while (true) {
                            var2_1 /* !! */  = (int)je.agfc("agfj", agez(int ), (int)6);
                        }
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)je.agfc("agfk", agez(int ), (int)7);
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)je.agfc("agfe", agez(int ), (int)1);
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)je.agfc("agff", agez(int ), (int)2);
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)je.agfc("agfg", agez(int ), (int)3);
                        cfr_temp_0 = 0;
                        break block12;
                    }
                    case 3: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)je.agfc("agfh", agez(int ), (int)4);
                    }
                    case 4: 
                }
                ** GOTO lbl35
            }
            while (true) {
                if (true) continue block9;
lbl35:
                // 2 sources

                var2_1 /* !! */  = (int)je.agfc("agfi", agez(int ), (int)5);
                cfr_temp_0 = 3;
            }
            break;
        }
    }

    private static /* synthetic */ void agry() {
        je.agfm[100] = 9111766595679091616L;
        je.agfm[101] = -5322695915720866225L;
        je.agfm[102] = -8590580711516218433L;
        je.agfm[103] = 3361057671851243329L;
        je.agfm[104] = -2574773868296967644L;
        je.agfm[105] = 5365665600782734324L;
        je.agfm[106] = 8122529060742198611L;
        je.agfm[107] = 9164214014616361524L;
        je.agfm[108] = 8095469287315400895L;
        je.agfm[109] = 4665762561767259419L;
        je.agfm[110] = 7504794992537280887L;
        je.agfm[111] = 396834659404846267L;
        je.agfm[112] = -6081697174097604054L;
        je.agfm[113] = 5528867125060833301L;
    }

    private static /* synthetic */ void agsa() {
        je.agfn[100] = 449368559157821940L;
        je.agfn[101] = 115313319042591564L;
        je.agfn[102] = -1794558431241542003L;
        je.agfn[103] = -7015765934777678957L;
        je.agfn[104] = -31028757883828213L;
        je.agfn[105] = 3905053263330597764L;
        je.agfn[106] = 8115248053125898766L;
        je.agfn[107] = 5413960682971201131L;
        je.agfn[108] = -3969857804862372034L;
        je.agfn[109] = -8074534232602822734L;
        je.agfn[110] = 1597479772782642909L;
        je.agfn[111] = 7368863061007822404L;
        je.agfn[112] = 7791362709982829215L;
        je.agfn[113] = 6279122430616160667L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void renderMarker(bu var1_1, je$FireworkMarker var2_2, long var3_3) {
        var14_4 = je.c;
        var13_5 /* !! */  = je.b;
        var12_6 = je.a;
        if (var14_4) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var12_6 || var12_6) ** GOTO lbl6
        var5_7 = var2_2.alpha();
        if (var12_6 || var12_6) ** GOTO lbl6
        v0 = new Object[1];
        v0[je.agfc("agly", agez(int ), (int)111)] = (double)Math.max((long)je.agfc("aglz", agfl(int ), (int)61), (long)(je.agfc("agma", agfl(int ), (int)62) - (var3_3 - var2_2.createdAt))) / je.agfc("agmb", aggj(int ), (int)63);
        var6_8 = String.format(Locale.ROOT, "%.1f \u0441\u0435\u043a.", v0);
        if (var13_5 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var13_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_6 || var12_6) ** GOTO lbl6
                var7_9 = je.agfc("agmc", aggl(int ), (int)112);
                if (var12_6 || var12_6) ** GOTO lbl6
                if (!this.showTime.isValue()) ** GOTO lbl26
                if (var12_6) ** GOTO lbl6
                v1 = kq.width(kv.BOLD, var6_8, (float)var7_9);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl28
lbl26:
                // 1 sources

                if (var12_6 || var12_6) ** GOTO lbl6
                v1 = var8_10 = 0.0f;
lbl28:
                // 2 sources

                if (var12_6 || var12_6) ** GOTO lbl6
                if (!this.showTime.isValue()) ** GOTO lbl35
                if (var12_6) ** GOTO lbl6
                v2 /* !! */  = var8_10 + je.agfc("agmd", aggl(int ), (int)113);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl37
lbl35:
                // 1 sources

                if (var12_6 || var12_6) ** GOTO lbl6
                v2 /* !! */  = var9_11 /* !! */  = (float)je.agfc("agme", aggl(int ), (int)114);
lbl37:
                // 2 sources

                if (var12_6 || var12_6) ** GOTO lbl6
                var10_12 = this.projected.x - var9_11 /* !! */  / 2.0f;
                if (var12_6 || var12_6) ** GOTO lbl6
                var11_13 = this.projected.y;
                if (var12_6 || var12_6) ** GOTO lbl6
                ki.rect(var1_1.getDrawContext(), var10_12, var11_13, var9_11 /* !! */ , (float)je.agfc("agmf", aggl(int ), (int)115), 2.0f, je.withAlpha((int)je.agfc("agmg", agez(int ), (int)116), Math.round((float)(je.agfc("agmh", aggl(int ), (int)117) * var5_7))), (boolean)je.agfc("agmi", agez(int ), (int)118));
                if (var12_6 || var12_6) ** GOTO lbl6
                this.drawItem(var1_1, var10_12 + je.agfc("agmj", aggl(int ), (int)119), var11_13 + je.agfc("agmk", aggl(int ), (int)120), (float)je.agfc("agml", aggl(int ), (int)121));
                if (var12_6 || var12_6) ** GOTO lbl6
                if (!this.showTime.isValue()) ** GOTO lbl50
                if (var12_6 || var12_6) ** GOTO lbl6
                kq.text(var1_1.getDrawContext(), kv.BOLD, var6_8, var10_12 + je.agfc("agmm", aggl(int ), (int)122), var11_13 + je.agfc("agmn", aggl(int ), (int)123), (float)var7_9, je.withAlpha((int)je.agfc("agmo", agez(int ), (int)124), Math.round((float)(je.agfc("agmp", aggl(int ), (int)125) * var5_7))), (boolean)je.agfc("agmq", agez(int ), (int)126));
                if (var12_6) ** GOTO lbl6
lbl50:
                // 2 sources

                if (!var12_6 && !var12_6) ** break;
                ** continue;
                return;
            }
lbl53:
            // 3 sources

            case 0: {
                var13_5 /* !! */  = (int)je.agfc("agmr", agez(int ), (int)127);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl58:
            // 3 sources

            case 1: {
                var13_5 /* !! */  = (int)je.agfc("agms", agez(int ), (int)128);
                if (!var14_4) ** GOTO lbl53
                throw null;
            }
lbl62:
            // 2 sources

            case 2: {
                var13_5 /* !! */  = (int)je.agfc("agmt", agez(int ), (int)129);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 3: {
                var13_5 /* !! */  = (int)je.agfc("agmu", agez(int ), (int)130);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl72:
            // 2 sources

            case 4: {
                var13_5 /* !! */  = (int)je.agfc("agmv", agez(int ), (int)131);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl77:
            // 2 sources

            case 5: {
                var13_5 /* !! */  = (int)je.agfc("agmw", agez(int ), (int)132);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl82:
            // 2 sources

            case 6: {
                var13_5 /* !! */  = (int)je.agfc("agmx", agez(int ), (int)133);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl87:
            // 2 sources

            case 7: {
                var13_5 /* !! */  = (int)je.agfc("agmy", agez(int ), (int)134);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl92:
            // 3 sources

            case 8: {
                var13_5 /* !! */  = (int)je.agfc("agmz", agez(int ), (int)135);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl97:
            // 2 sources

            case 9: {
                var13_5 /* !! */  = (int)je.agfc("agna", agez(int ), (int)136);
                if (!var14_4) ** GOTO lbl62
                throw null;
            }
lbl101:
            // 2 sources

            case 10: {
                var13_5 /* !! */  = (int)je.agfc("agnb", agez(int ), (int)137);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl106:
            // 2 sources

            case 11: {
                var13_5 /* !! */  = (int)je.agfc("agnc", agez(int ), (int)138);
                if (!var14_4) ** GOTO lbl77
                throw null;
            }
lbl110:
            // 2 sources

            case 12: {
                var13_5 /* !! */  = (int)je.agfc("agnd", agez(int ), (int)139);
                if (!var14_4) ** GOTO lbl87
                throw null;
            }
lbl114:
            // 2 sources

            case 13: {
                var13_5 /* !! */  = (int)je.agfc("agne", agez(int ), (int)140);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_5 /* !! */  = (int)je.agfc("agnf", agez(int ), (int)141);
                    if (!var14_4) break block0;
                    throw null;
                }
            }
            case 15: {
                var13_5 /* !! */  = (int)je.agfc("agng", agez(int ), (int)142);
                if (!var14_4) ** GOTO lbl58
                throw null;
            }
lbl128:
            // 5 sources

            case 16: {
                var13_5 /* !! */  = (int)je.agfc("agnh", agez(int ), (int)143);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 17: {
                var13_5 /* !! */  = (int)je.agfc("agni", agez(int ), (int)144);
                if (!var14_4) ** GOTO lbl128
                throw null;
            }
            case 18: {
                var13_5 /* !! */  = (int)je.agfc("agnj", agez(int ), (int)145);
                if (!var14_4) ** GOTO lbl110
                throw null;
            }
lbl141:
            // 2 sources

            case 19: {
                var13_5 /* !! */  = (int)je.agfc("agnk", agez(int ), (int)146);
                if (!var14_4) ** GOTO lbl128
                throw null;
            }
lbl145:
            // 3 sources

            case 20: {
                var13_5 /* !! */  = (int)je.agfc("agnl", agez(int ), (int)147);
                if (!var14_4) ** GOTO lbl92
                throw null;
            }
lbl149:
            // 2 sources

            case 21: {
                var13_5 /* !! */  = (int)je.agfc("agnm", agez(int ), (int)148);
                if (!var14_4) ** GOTO lbl128
                throw null;
            }
            case 22: {
                var13_5 /* !! */  = (int)je.agfc("agnn", agez(int ), (int)149);
                if (!var14_4) ** GOTO lbl114
                throw null;
            }
lbl157:
            // 2 sources

            case 23: {
                var13_5 /* !! */  = (int)je.agfc("agno", agez(int ), (int)150);
                if (!var14_4) ** GOTO lbl141
                throw null;
            }
lbl161:
            // 2 sources

            case 24: {
                var13_5 /* !! */  = (int)je.agfc("agnp", agez(int ), (int)151);
                if (!var14_4) ** GOTO lbl101
                throw null;
            }
            case 25: {
                var13_5 /* !! */  = (int)je.agfc("agnq", agez(int ), (int)152);
                if (!var14_4) ** GOTO lbl58
                throw null;
            }
            case 26: {
                var13_5 /* !! */  = (int)je.agfc("agnr", agez(int ), (int)153);
                if (!var14_4) ** GOTO lbl72
                throw null;
            }
            case 27: {
                var13_5 /* !! */  = (int)je.agfc("agns", agez(int ), (int)154);
                if (!var14_4) ** GOTO lbl97
                throw null;
            }
lbl177:
            // 2 sources

            case 28: {
                var13_5 /* !! */  = (int)je.agfc("agnt", agez(int ), (int)155);
                if (!var14_4) ** GOTO lbl82
                throw null;
            }
lbl181:
            // 2 sources

            case 29: {
                do {
                    var13_5 /* !! */  = (int)je.agfc("agnu", agez(int ), (int)156);
                } while (!var14_4);
                throw null;
            }
lbl186:
            // 2 sources

            case 30: {
                var13_5 /* !! */  = (int)je.agfc("agnv", agez(int ), (int)157);
                if (!var14_4) ** GOTO lbl53
                throw null;
            }
lbl190:
            // 2 sources

            case 31: {
                do {
                    var13_5 /* !! */  = (int)je.agfc("agnw", agez(int ), (int)158);
                } while (!var14_4);
                throw null;
            }
            case 32: {
                var13_5 /* !! */  = (int)je.agfc("agnx", agez(int ), (int)159);
                if (!var14_4) ** GOTO lbl186
                throw null;
            }
            case 33: 
        }
        var13_5 /* !! */  = (int)je.agfc("agny", agez(int ), (int)160);
        ** while (!var14_4)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void agrt() {
        je.agfa[200] = -536738903;
        je.agfa[201] = -1267516273;
        je.agfa[202] = -214683002;
        je.agfa[203] = 1241541137;
        je.agfa[204] = -468337647;
        je.agfa[205] = 1903207301;
        je.agfa[206] = -786363216;
    }

    private static /* synthetic */ void agrx() {
        je.agfm[0] = 4572508911657159046L;
        je.agfm[1] = -3994729890296829270L;
        je.agfm[2] = -4276297027070311936L;
        je.agfm[3] = 4781132901252378695L;
        je.agfm[4] = -1189759586733741749L;
        je.agfm[5] = 8102957558655122153L;
        je.agfm[6] = -6448601439419455169L;
        je.agfm[7] = 7612188538890512153L;
        je.agfm[8] = -1329940310393131512L;
        je.agfm[9] = -3818031128207170561L;
        je.agfm[10] = -5380919864896782300L;
        je.agfm[11] = 9040848685580433490L;
        je.agfm[12] = -9060589027368323022L;
        je.agfm[13] = 1156909758170148530L;
        je.agfm[14] = 7356928909035320669L;
        je.agfm[15] = -2952652696729011697L;
        je.agfm[16] = -5019459097189257556L;
        je.agfm[17] = -4188865959382193464L;
        je.agfm[18] = 814716498198616447L;
        je.agfm[19] = -9202750938374550772L;
        je.agfm[20] = 1044783290123372380L;
        je.agfm[21] = 293147957654462592L;
        je.agfm[22] = -9079125527533284838L;
        je.agfm[23] = -2683122288719671694L;
        je.agfm[24] = 5184286544481535245L;
        je.agfm[25] = -2800088667458587771L;
        je.agfm[26] = 8774006957490081943L;
        je.agfm[27] = -4107437035549876594L;
        je.agfm[28] = 1833336576874820516L;
        je.agfm[29] = 4511615636066674255L;
        je.agfm[30] = -2861436877437998773L;
        je.agfm[31] = 1360352547888658832L;
        je.agfm[32] = 7765594942381764533L;
        je.agfm[33] = -7102973747037603587L;
        je.agfm[34] = 8011740218715024542L;
        je.agfm[35] = 6253352046730987602L;
        je.agfm[36] = -209246626535044786L;
        je.agfm[37] = -4608458326676949148L;
        je.agfm[38] = 6976926121381551826L;
        je.agfm[39] = 6165377367854999755L;
        je.agfm[40] = -8648857228391314672L;
        je.agfm[41] = 7197010359774446161L;
        je.agfm[42] = -3035176244521062844L;
        je.agfm[43] = 663062298262872520L;
        je.agfm[44] = -2779825167250407499L;
        je.agfm[45] = -5836664605853113072L;
        je.agfm[46] = 6653011981624997961L;
        je.agfm[47] = 2417593712271718284L;
        je.agfm[48] = -1807270047342856773L;
        je.agfm[49] = -2450642401582811868L;
        je.agfm[50] = -6299898663506677051L;
        je.agfm[51] = 6528748450897061924L;
        je.agfm[52] = 3267794422257952412L;
        je.agfm[53] = 8164270042103741417L;
        je.agfm[54] = -5462853728193783562L;
        je.agfm[55] = 2978705203300141157L;
        je.agfm[56] = -6803069723102760758L;
        je.agfm[57] = 4447290058314809559L;
        je.agfm[58] = 2478733322526596260L;
        je.agfm[59] = -1982366197371434348L;
        je.agfm[60] = 1486374852069707881L;
        je.agfm[61] = -135935639512971990L;
        je.agfm[62] = 64724705673178764L;
        je.agfm[63] = 3456063614614745635L;
        je.agfm[64] = 8874702221711419861L;
        je.agfm[65] = -6727343281893316663L;
        je.agfm[66] = 3206736174095425618L;
        je.agfm[67] = -7582344284712497997L;
        je.agfm[68] = 1416823864102564498L;
        je.agfm[69] = 3367774680503819983L;
        je.agfm[70] = -5601666293974105087L;
        je.agfm[71] = -6143401455994440292L;
        je.agfm[72] = 1800193358513173292L;
        je.agfm[73] = 1574626920396035740L;
        je.agfm[74] = -7487609724341714287L;
        je.agfm[75] = 9136383961432036518L;
        je.agfm[76] = -4403991883723628860L;
        je.agfm[77] = -2547747886868645977L;
        je.agfm[78] = -5895694387572240832L;
        je.agfm[79] = -3383075404770708807L;
        je.agfm[80] = 876195567474040768L;
        je.agfm[81] = -6678649515641820773L;
        je.agfm[82] = 1469246907752467653L;
        je.agfm[83] = 7695676637103985329L;
        je.agfm[84] = -8157705047115544671L;
        je.agfm[85] = 1014898464694525384L;
        je.agfm[86] = 3012403867143715033L;
        je.agfm[87] = 5155683339409275236L;
        je.agfm[88] = 485481013914609804L;
        je.agfm[89] = -8428831134600187886L;
        je.agfm[90] = 5722522765501098674L;
        je.agfm[91] = -4474785118205351382L;
        je.agfm[92] = 8399319992226679396L;
        je.agfm[93] = -4684296538039436194L;
        je.agfm[94] = -8871331517446247490L;
        je.agfm[95] = 6706023655415302684L;
        je.agfm[96] = 7196704818351890282L;
        je.agfm[97] = -761808660636307179L;
        je.agfm[98] = -4582665451139338663L;
        je.agfm[99] = 5706100153756170085L;
    }
}

