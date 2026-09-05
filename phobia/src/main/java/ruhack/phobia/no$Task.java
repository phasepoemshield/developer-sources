/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;

public class no$Task<T> {
    public static final boolean c;
    private final int priority;
    private final T value;
    private static long[] lkur;
    private int expiresIn;
    private static long[] lkus;
    private final ds provider;
    public static final int b;
    private static int[] lkva;
    private static int[] lkuz;
    public static final boolean a;
    protected static final long uf = -81974075799543576L;

    public static /* synthetic */ CallSite lkut(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lkwk() {
        no$Task.lkuz[0] = 591872269;
        no$Task.lkuz[1] = 1547334503;
        no$Task.lkuz[2] = -1335221305;
        no$Task.lkuz[3] = -1760652882;
        no$Task.lkuz[4] = -658184758;
        no$Task.lkuz[5] = 323644473;
        no$Task.lkuz[6] = 1389414802;
        no$Task.lkuz[7] = -564427638;
        no$Task.lkuz[8] = 1495128882;
        no$Task.lkuz[9] = -757239756;
        no$Task.lkuz[10] = -1226930110;
        no$Task.lkuz[11] = -1717172475;
        no$Task.lkuz[12] = -1168132178;
        no$Task.lkuz[13] = -1193516192;
        no$Task.lkuz[14] = 2141906857;
        no$Task.lkuz[15] = 267503912;
        no$Task.lkuz[16] = -1471773237;
        no$Task.lkuz[17] = -1324045611;
        no$Task.lkuz[18] = -485420343;
        no$Task.lkuz[19] = -834291699;
        no$Task.lkuz[20] = -787091295;
        no$Task.lkuz[21] = 601301185;
        no$Task.lkuz[22] = 716026136;
    }

    private static /* synthetic */ int lkuy(int n2) {
        return lkuz[n2] ^ lkva[n2];
    }

    private static /* synthetic */ void lkwm() {
        no$Task.lkur[0] = 6042415928973653912L;
        no$Task.lkur[1] = -7507745785610804983L;
        no$Task.lkur[2] = 2893970980654777084L;
        no$Task.lkur[3] = 4798285776847772778L;
        no$Task.lkur[4] = -7245129518221572321L;
        no$Task.lkur[5] = -5235312564840930065L;
        no$Task.lkur[6] = 5917451921591517508L;
        no$Task.lkur[7] = -7896209826125702620L;
        no$Task.lkur[8] = -4273449876250395570L;
        no$Task.lkur[9] = 7787852557526283750L;
        no$Task.lkur[10] = 7562692550293920208L;
        no$Task.lkur[11] = 6504233953734856661L;
        no$Task.lkur[12] = 2948601836805754710L;
        no$Task.lkur[13] = -8835649043306783953L;
        no$Task.lkur[14] = -1119680049483178364L;
        no$Task.lkur[15] = -3010559902457823318L;
    }

    private static /* synthetic */ long lkuq(int n2) {
        return lkur[n2] ^ lkus[n2];
    }

    private static /* synthetic */ void lkwl() {
        no$Task.lkva[0] = 591872268;
        no$Task.lkva[1] = 342660614;
        no$Task.lkva[2] = 1335221304;
        no$Task.lkva[3] = 415157350;
        no$Task.lkva[4] = 658184757;
        no$Task.lkva[5] = 1439191214;
        no$Task.lkva[6] = 1389414803;
        no$Task.lkva[7] = -1440994146;
        no$Task.lkva[8] = 1495128883;
        no$Task.lkva[9] = 1305929492;
        no$Task.lkva[10] = -1226930109;
        no$Task.lkva[11] = 979389186;
        no$Task.lkva[12] = 1168132177;
        no$Task.lkva[13] = 248055652;
        no$Task.lkva[14] = 2141906857;
        no$Task.lkva[15] = 267503914;
        no$Task.lkva[16] = -1471773240;
        no$Task.lkva[17] = -1324045610;
        no$Task.lkva[18] = -485420339;
        no$Task.lkva[19] = -834291697;
        no$Task.lkva[20] = -787091293;
        no$Task.lkva[21] = 601301186;
        no$Task.lkva[22] = 716026140;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public no$Task(int var1_1, int var2_2, ds var3_3, T var4_4) {
        var6_5 /* !! */  = no$Task.b;
        var5_6 = no$Task.a;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.expiresIn = var1_1;
                this.priority = var2_2;
                this.provider = var3_3;
                this.value = var4_4;
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var6_5 /* !! */  = (int)no$Task.lkut("lkwf", lkuy(int ), (int)18);
                ** GOTO lbl19
            }
lbl15:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)no$Task.lkut("lkwg", lkuy(int ), (int)19);
                    ** GOTO lbl22
                    break;
                }
            }
lbl19:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)no$Task.lkut("lkwh", lkuy(int ), (int)20);
                ** GOTO lbl12
            }
lbl22:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)no$Task.lkut("lkwi", lkuy(int ), (int)21);
                ** GOTO lbl15
            }
            case 4: 
        }
        var6_5 /* !! */  = (int)no$Task.lkut("lkwj", lkuy(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ void lkwn() {
        no$Task.lkus[0] = 7369627244490146304L;
        no$Task.lkus[1] = -7097744571649410193L;
        no$Task.lkus[2] = -6642745446310946608L;
        no$Task.lkus[3] = -4223086513714488979L;
        no$Task.lkus[4] = -399183263671856366L;
        no$Task.lkus[5] = -6401794741241151406L;
        no$Task.lkus[6] = -8227769929665725837L;
        no$Task.lkus[7] = -7802628185033819948L;
        no$Task.lkus[8] = -6490275910845483281L;
        no$Task.lkus[9] = -8653720333244445807L;
        no$Task.lkus[10] = -1668310619397757918L;
        no$Task.lkus[11] = -6808973795313693107L;
        no$Task.lkus[12] = -2491878406490346425L;
        no$Task.lkus[13] = 253176624035585697L;
        no$Task.lkus[14] = 4479430496253597813L;
        no$Task.lkus[15] = -9146869829987118012L;
    }

    static {
        lkuz = new int[23];
        lkva = new int[23];
        no$Task.lkwk();
        no$Task.lkwl();
        lkur = new long[16];
        lkus = new long[16];
        no$Task.lkwm();
        no$Task.lkwn();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        v0 /* !! */  = no$Task.uf;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - no$Task.lkut("lkuu", lkuq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 210281197: {
                    v1 = no$Task.lkut("lkuv", lkuq(int ), (int)1);
                    continue block21;
                }
                case 724394216: {
                    break block21;
                }
                case 936691010: {
                    v1 = no$Task.lkut("lkuw", lkuq(int ), (int)2);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = no$Task.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = no$Task.uf - no$Task.lkut("lkux", lkuq(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == no$Task.lkut("lkvb", lkuy(int ), (int)0)) break;
            v2 /* !! */  = (long)no$Task.lkut("lkvc", lkuy(int ), (int)1);
        }
        var2_2 /* !! */  = no$Task.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = no$Task.uf - no$Task.lkut("lkvd", lkuq(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == no$Task.lkut("lkve", lkuy(int ), (int)2)) break;
            v3 /* !! */  = (long)no$Task.lkut("lkvf", lkuy(int ), (int)3);
        }
        var1_3 = no$Task.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = no$Task.uf - no$Task.lkut("lkvg", lkuq(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == no$Task.lkut("lkvh", lkuy(int ), (int)4)) break;
                    v4 /* !! */  = (long)no$Task.lkut("lkvi", lkuy(int ), (int)5);
                }
                v5 /* !! */  = no$Task.uf;
                if (true) ** GOTO lbl44
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - no$Task.lkut("lkvj", lkuq(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 724394216: {
                            break block26;
                        }
                        case 1188007330: {
                            v6 = no$Task.lkut("lkvk", lkuq(int ), (int)7);
                            continue block26;
                        }
                        case 1770004165: {
                            v6 = no$Task.lkut("lkvl", lkuq(int ), (int)8);
                            continue block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = no$Task.uf - no$Task.lkut("lkvm", lkuq(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == no$Task.lkut("lkvn", lkuy(int ), (int)6)) break;
                    v7 /* !! */  = (long)no$Task.lkut("lkvo", lkuy(int ), (int)7);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = no$Task.uf - no$Task.lkut("lkvp", lkuq(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == no$Task.lkut("lkvq", lkuy(int ), (int)8)) break;
                    v8 /* !! */  = (long)no$Task.lkut("lkvr", lkuy(int ), (int)9);
                }
                v9 = String.valueOf(this.provider);
                v10 /* !! */  = no$Task.uf;
                if (true) ** GOTO lbl68
                block29: while (true) {
                    v10 /* !! */  = (long)(v11 - no$Task.lkut("lkvs", lkuq(int ), (int)11));
lbl68:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -142910039: {
                            v11 = no$Task.lkut("lkvt", lkuq(int ), (int)12);
                            continue block29;
                        }
                        case 564536845: {
                            v11 = no$Task.lkut("lkvu", lkuq(int ), (int)13);
                            continue block29;
                        }
                        case 724394216: {
                            break block29;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = no$Task.uf - no$Task.lkut("lkvv", lkuq(int ), (int)14)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == no$Task.lkut("lkvw", lkuy(int ), (int)10)) break;
                    v12 /* !! */  = (long)no$Task.lkut("lkvx", lkuy(int ), (int)11);
                }
                v13 = String.valueOf(this.value);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = no$Task.uf - no$Task.lkut("lkvy", lkuq(int ), (int)15)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == no$Task.lkut("lkvz", lkuy(int ), (int)12)) break;
                    v14 /* !! */  = (long)no$Task.lkut("lkwa", lkuy(int ), (int)13);
                }
                return "TaskProcessor.Task(expiresIn=" + this.expiresIn + ", priority=" + this.priority + ", provider=" + v9 + ", value=" + v13 + ")";
            }
            case 0: {
                var2_2 /* !! */  = (int)no$Task.lkut("lkwb", lkuy(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
lbl93:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)no$Task.lkut("lkwc", lkuy(int ), (int)15);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)no$Task.lkut("lkwd", lkuy(int ), (int)16);
                    if (!var3_1) ** GOTO lbl93
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)no$Task.lkut("lkwe", lkuy(int ), (int)17);
        ** while (!var3_1)
lbl106:
        // 1 sources

        throw null;
    }
}

